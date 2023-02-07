package Client;
import java.net.MalformedURLException;
import java.rmi.ConnectException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JOptionPane;

import javax.swing.ImageIcon;
import msgFrame.Message;
import msgFrame.Photo;
import user_GUI.user_page;
import server_side.S_ChatIF;


public class C_Chat  extends UnicastRemoteObject implements C_ChatIF {

	user_page chatGUI;
	private String hostName = "127.0.0.1";
	//private String hostName = "10.232.142.160";

	private String serviceName = "HuChatService";
	private String clientServiceName; 
	private String name;
	public S_ChatIF serverIF;
	public boolean connectionProblem = false;
        
	public C_Chat(user_page aChatGUI, String userName) throws RemoteException {
		super();
		this.chatGUI = aChatGUI;
		this.name = userName;
		this.clientServiceName = "ClientListenService_" + userName;
	}
	public void startClient() throws RemoteException {
            // lookup the server RMI interfae, then send our info withen details
		String[] details = {name, hostName, clientServiceName};	

		try {
			Naming.rebind("rmi://" + hostName + "/" + clientServiceName, this);
			serverIF = ( S_ChatIF )Naming.lookup("rmi://" + hostName + "/" + serviceName);	
		} 
		catch (ConnectException  e) {
			JOptionPane.showMessageDialog(
					chatGUI.home, "The server seems to be unavailable\nPlease try later",
					"Connection problem", JOptionPane.ERROR_MESSAGE);
			connectionProblem = true;
			e.printStackTrace();
		}
		catch(NotBoundException | MalformedURLException me){
			connectionProblem = true;
			me.printStackTrace();
		}
		if(!connectionProblem){
			registerWithServer(details);
		}
                else{
                 System.exit(0);
                }
               
		System.out.println("Client Listen RMI Server is running...\n");
	}


	public void registerWithServer(String[] details) {
            //pass username and hostname joing the chat
		try{
			serverIF.passIDentity(this.ref);//now redundant ??
			serverIF.registerListener(details);			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void messageFromServer(String message,String username) throws RemoteException {
            //receive strig from the server and used by the server to send messsage to users
		System.out.println( message );
                
		chatGUI.messagearea.add( new Message(message,username) );
                chatGUI.messagearea.revalidate();
                chatGUI.messagearea.repaint();

	}

	@Override
	public void updateUserList(String[] currentUsers) throws RemoteException {
// update and display current users 
		if(currentUsers.length < 2){
			chatGUI.PM.setEnabled(false);
		}
		chatGUI.listuser.remove(chatGUI.listuser);
		chatGUI.setClientPanel(currentUsers);
		chatGUI.listuser.repaint();
		chatGUI.listuser.revalidate();
	}

    @Override
    public ImageIcon imagefromserver(ImageIcon img,String username) throws RemoteException {
              chatGUI.messagearea.add(new Photo(img,username));
              chatGUI.messagearea.revalidate();
              chatGUI.messagearea.repaint();
                
        return null;
       
        
    }
}













