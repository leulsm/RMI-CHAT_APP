package server_side;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.RemoteRef;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.Vector;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import Client.C_ChatIF;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class S_Chat extends UnicastRemoteObject implements S_ChatIF {
	String line = "---------------------------------------------\n";
	public Vector<Users> chatters;
	private static final long serialVersionUID = 1L;
	public List<String> users;
	//Constructor
	public S_Chat() throws RemoteException {
		super();
		chatters = new Vector<Users>(10, 1);
                users = new ArrayList<>();
	}
	
	/**-----------------------------------------------------------
	*
	 * LOCAL METHODS
	 */	
	public static void main(String[] args) {
		startRMIRegistry();	
		String hostName = "localhost";
		String serviceName = "HuChatService";
		
		if(args.length == 2){
			hostName = args[0];
			serviceName = args[1];
		}
		
		try{
			S_ChatIF hello = new S_Chat();// CREAT OBJECT TO PROVIDE A SERVICE
			Naming.rebind("rmi://" + hostName + "/" + serviceName, hello); //ASSOCIATING REMOTE OBJECT
                        // REBIND METHODS OF NAMING CLASS
			System.out.println("RMI Server is running...");
		}
		catch(Exception e){
			System.out.println("Server had problems starting");
		}	
	}

	
	public static void startRMIRegistry() {
            //start rmi registory
		try{
			java.rmi.registry.LocateRegistry.createRegistry(1099);
			System.out.println("RMI Server ready");
		}
		catch(RemoteException e) {
			e.printStackTrace();
		}
	}
		
	
	
	public String sayHello(String ClientName) throws RemoteException {
            // announsment message from the server
		System.out.println(ClientName + " sent a message");
		return "Hello " + ClientName + " from group chat server";
	}
	

	
	public void updateChat(String name, String nextPost) throws RemoteException {

		sendToAll(nextPost,name);
	}
	
	@Override
	public void passIDentity(RemoteRef ref) throws RemoteException {	
		//recive a new client remote refernce
		try{
			System.out.println(line + ref.toString());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void registerListener(String[] details) throws RemoteException {	
           // recive and dislay in console
		System.out.println(new Date(System.currentTimeMillis()));
		System.out.println(details[0] + " has joined the chat session");
		System.out.println(details[0] + "'s hostname : " + details[1]);
		System.out.println(details[0] + "'sRMI service : " + details[2]);
		registerChatter(details);
	}

	private void registerChatter(String[] details){	
            //register the clients and store it in referece for future message to be sent
		try{
			C_ChatIF nextClient = ( C_ChatIF )Naming.lookup("rmi://" + details[1] + "/" + details[2]);
			
			chatters.addElement(new Users(details[0], nextClient));
			
			nextClient.messageFromServer(" Hello " + details[0].toUpperCase() + " HAVE FUN AND CHAT KNOW.","SERVER");
			
			sendToAll(details[0] + " has joined the group.","SERVER");
			
			updateUserList();		
		}
		catch(RemoteException | MalformedURLException | NotBoundException e){
			e.printStackTrace();
		}
	}
        
	public void updateUserList() {
            //update all clients by remotely invoking their update uselist rmi method
		String[] currentUsers = getUserList();	
		for(Users c : chatters){
			try {
                            
				c.getClient().updateUserList(currentUsers);
			} 
			catch (RemoteException e) {
				e.printStackTrace();
			}
		}	
	}

	public String[] getUserList(){
            //generate a string arry of current users
		// generate an array of current users
		String[] allUsers = new String[chatters.size()];
		for(int i = 0; i< allUsers.length; i++){
			allUsers[i] = chatters.elementAt(i).getName();
                        users.add(chatters.elementAt(i).getName());
                        
		}
		return allUsers;
	}

	public void sendToAll(String newMessage,String user){
            //send message to all users
		for(Users c : chatters){
			try {
				c.getClient().messageFromServer(newMessage,user);
			} 
			catch (RemoteException e) {
				e.printStackTrace();
			}
		}	
	}

	@Override
	public void leaveChat(String userName) throws RemoteException{
            // when uses end the conversation remove a client form the list and notify everyone
		
		for(Users c : chatters){
			if(c.getName().equals(userName)){
				System.out.println(line + userName + " left the chat session");
				System.out.println(new Date(System.currentTimeMillis()));
				chatters.remove(c);
				break;
			}
		}		
		if(!chatters.isEmpty()){
			updateUserList();
		}			
	}
	

	@Override
	public void sendPrivate(int[] privateGroup, String privateMessage,String sender) throws RemoteException{
            // send private message to selected users
		Users pc;
                
		for(int i : privateGroup){
			pc= chatters.elementAt(i);
			pc.getClient().messageFromServer(privateMessage,sender);
		}
	}

    @Override
    public boolean login(String username) throws RemoteException {
          boolean flag = false;
        for (String user : users) {
            if (username.equals(user)) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        if (flag == false) {
            users.add(username);
            
            return true;
        }else{
            return false;
        }
    
    }

    @Override
    public  ImageIcon imageserver(ImageIcon img,String username) throws RemoteException {
       
      for(Users c : chatters){
			
			
             c.getClient().imagefromserver(img,username);
    }
            return null;
    }

    @Override
    public String JDBCsignup(String name, String lname, int age, String sex, String username, String password, String Cpassword) throws RemoteException {
  try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ds_chat","root","");
            Statement st=conn.createStatement();
            String sql="insert into signup values('"+name+"','"+lname+"','"+age+"','"+sex+"','"+username+"','"+password+"','"+Cpassword+"')";
            st.executeUpdate(sql);
            return "Record Inserted Succesfully";
        }catch (Exception ex) {
            return (ex.toString());
        }    }

   
	
}



