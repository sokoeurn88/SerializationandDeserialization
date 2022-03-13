package serialization;

import java.io.*;

public class SerializationConcept {

	public static void main(String[] args) throws IOException {
		
		/*how to serialize
		 * object class should implement Serializable interface
		 * add import java.io.Serializable;
		 * FileOutPutStream fileOut = new FileOutPutStream(file path)
		 * ObjectOutputStream out = new ObjectOutputStream(fileOut)
		 * out.writeObject(objectName)
		 * out.close(), fileOut.close();*/
		
		User user = new User();
		user.name = "sokoeurn";
		user.password = "abc123";
		FileOutputStream fileOut = new FileOutputStream ("UserInfo.ser");		/*.ser is the extension*/
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
		System.out.println("Object info saved!");
		
		user.sayHello();
		

	}

}
