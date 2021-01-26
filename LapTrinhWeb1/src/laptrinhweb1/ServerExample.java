
package laptrinhweb1;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
		try {
			System.out.println("Begin server");
			ServerSocket ss = new  ServerSocket(1910);
			Socket socketAtServer = ss.accept();
			//2 . server receives
			InputStream is =  socketAtServer.getInputStream();
			ObjectInputStream ois = new  ObjectInputStream (is);
			String s = (String)ois.readObject();
			System.out.println("server receives : " + s);
			// 3. server reply
			OutputStream os = socketAtServer.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			s = "OK";
			((ObjectOutput) oos).writeObject(s);
			((ObjectOutput) oos).flush();
			System.out.println("end server");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}