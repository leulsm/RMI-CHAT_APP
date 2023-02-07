package server_side;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.RemoteRef;
import javax.swing.ImageIcon;

public interface S_ChatIF extends Remote {
		
	public void updateChat( String chatMessage,String nextpost)throws RemoteException;
	
	public void passIDentity(RemoteRef ref)throws RemoteException;
	
	public void registerListener(String[] details)throws RemoteException;
	
	public void leaveChat(String userName)throws RemoteException;
	
	public void sendPrivate(int[] privateGroup, String privateMessage,String sender)throws RemoteException;
        
        public ImageIcon imageserver(ImageIcon img,String username)throws RemoteException;
        
        public boolean login(String username) throws RemoteException;
        
        public String JDBCsignup(String name, String lname, int age, String sex,String username, String password, String Cpassword) throws RemoteException;

}


