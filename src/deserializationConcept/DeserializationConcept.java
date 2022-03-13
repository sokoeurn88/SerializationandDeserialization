package deserializationConcept;

import java.io.*;

public class DeserializationConcept {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		/*Step to deserialize
		 * declare your object (do not instantiate)
		 * your class should implement Serialiable interface
		 * add import java.io.Serialiable;
		 * FileInputStream fileIn = new FileInputStream(filepath);
		 * ObjectInputStream in new ObjectInputStream(fileIn)
		 * objectNam = (Class) in.readObject();
		 * in.close; fileIn.close(); */ 
		
		Users users = null; /*new User_02();*/ 
		
		FileInputStream fileIn = new FileInputStream("C:\\Users\\sokoeurn chhay\\Selenium_Java_Review\\SerializationDeserialization\\UserInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		users = (Users) in.readObject();	//casting process
		in.close();
		fileIn.close();
		
		System.out.println(users.name);
		System.out.println(users.password);
		users.sayHello();
	}

}
