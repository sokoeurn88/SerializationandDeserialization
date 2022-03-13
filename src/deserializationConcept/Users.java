package deserializationConcept;

import java.io.Serializable;

 class Users implements Serializable{
	
	String name;
	String password;
	
	public void sayHello() {
		System.out.println("Hello: "+ name);
	}

}
