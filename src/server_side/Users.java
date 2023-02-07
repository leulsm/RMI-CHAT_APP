package server_side;

import Client.C_ChatIF;

// used to keep detail of connected clients order
public class Users {

	public String name;
	public C_ChatIF client;
	
	
	public Users(String name, C_ChatIF client){
		this.name = name;
		this.client = client;
	}

	public String getName(){
		return name;
	}
	public C_ChatIF getClient(){
		return client;
	}
	
	
}
