package springboot.tuto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import springboot.tuto.service.IEntityMethods;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTutoSerializationDeserializationApplication implements CommandLineRunner{

	@Autowired
	IEntityMethods iEntityMethods;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTutoSerializationDeserializationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("*****App start *****");
		
		System.out.println("***** ***** ***** *****");
		
		System.out.println("serialize an object to a xml string");
		iEntityMethods.serializeSimpleBeanToString();
		
		System.out.println("***** ***** ***** *****");
		
		System.out.println("serialize an object to a xml file");
		iEntityMethods.serializeSimpleBeanToXmlFile();
		System.out.println("Go to C:\\convert\\simple_bean");
		
		System.out.println("***** ***** ***** *****");
		
		System.out.println("deserialize a xml string to an object");
		iEntityMethods.deserializeSimpleBeanFromXmlString();
		
		System.out.println("***** ***** ***** *****");
		
		System.out.println("deserialize a xml file to an object");
		iEntityMethods.deserializeSimpleBeanFromXmlFile();
		
		System.out.println("***** ***** ***** *****");
		
		System.out.println("deserialize a xml string to an object with different property");
		iEntityMethods.deserializeSimpleBeanFromXmlStringDistinctProperty();
		
		System.out.println("***** ***** ***** *****");
		
		System.out.println("serialize an object with different property to a xml file");
		System.out.println("Go to C:\\convert\\simple_bean_capitalized");
		iEntityMethods.deserializeSimpleBeanFromXmlStringDistinctProperty();
		iEntityMethods.serializeSimpleBeanDistinctPropertyToXmlFile();
		
	
		System.out.println("***** ***** ***** *****");
		System.out.println("*****App end *****");
		
	}
}
