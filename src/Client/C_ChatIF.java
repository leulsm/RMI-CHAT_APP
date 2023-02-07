package Client;

import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.swing.ImageIcon;

public interface C_ChatIF extends Remote{

	public void messageFromServer(String message,String username) throws RemoteException;// method to recive string
       
        public ImageIcon  imagefromserver (ImageIcon  img,String username) throws RemoteException;
	public void updateUserList(String[] currentUsers) throws RemoteException;//method to update user list
      
        
	
}