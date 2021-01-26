/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package laptrinhweb1;

//import java.io.InputStream;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.io.OutputStream;
//import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		try {
			Socket socketAtClient = new Socket("localhost", 1910);
			String s = "hello server";
			//1. Client sends to server 
			OutputStream os = socketAtClient.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(s);
			oos.flush();
			//4. Client receives
			InputStream is = socketAtClient.getInputStream();
			ObjectInputStream ois = new ObjectInputStream (is);
			s = (String) ois.readObject();
			System.out.println("client receives :" +s);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}