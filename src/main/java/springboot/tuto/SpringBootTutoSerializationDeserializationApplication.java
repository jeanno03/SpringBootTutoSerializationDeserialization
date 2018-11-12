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
		iEntityMethods.serializeSimpleBeanDistinctPropertyToXmlFile();
		System.out.println("***** ***** ***** *****");
		
		System.out.println("Parse the xml file and show the result on console using xsd-gen");
		System.out.println("Source C:\\convert\\inputXml.xml");
		iEntityMethods.parseXmlToXsUsingXsdGen();
		System.out.println("***** ***** ***** *****");
		
		System.out.println("Generate the xsd string from an xml file using xsd-gen");
		System.out.println("Source C:\\convert\\inputXml.xml");
		iEntityMethods.xmlToXsdStringUsingXsdGen();
		System.out.println("***** ***** ***** *****");
		
		System.out.println("Format the prévious result to a formatted xml string using xsd-gen");

		iEntityMethods.xmlToXsdFormatStringUsingXsdGen();
		System.out.println("***** ***** ***** *****");
		
		System.out.println("Generate the xsd file from an xml file using xsd-gen");
		System.out.println("Source C:\\convert\\inputXml.xml");
		System.out.println("Result C:\\convert\\outputXsd.xsd");
		iEntityMethods.generateXsdUsingXsdGen();
		System.out.println("***** ***** ***** *****");	

		System.out.println("Generate a xml with element and attribute to use in drive");
		System.out.println("using XmlMapper - Result not Ok");
		
		//tuto http://simple.sourceforge.net/download/stream/doc/tutorial/tutorial.php
		//using maven Simple XML 2.7.1
		System.out.println("Go to C:\\convert\\monTest.xml");
		System.out.println("using simple Xml - Result Ok");
		System.out.println("Go to C:\\convert\\monTest02.xml");
		iEntityMethods.createRSAXml();
		System.out.println("***** ***** ***** *****");
		
		

		System.out.println("*****App end *****");
		
	}
}
