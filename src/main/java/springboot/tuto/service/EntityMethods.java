package springboot.tuto.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import springboot.tuto.entities.SimpleBean;
import springboot.tuto.entities.SimpleBeanForCapitalizedFields;

@Service
public class EntityMethods implements IEntityMethods{

	@Override
	public void serializeSimpleBeanToString() throws JsonProcessingException {
		// TODO Auto-generated method stub

		SimpleBean simpleBean = new SimpleBean (1, 2);

		XmlMapper xmlMapper = new XmlMapper();
		String xml = xmlMapper.writeValueAsString(simpleBean);

		System.out.println("Serialize SimpleBean to String : " + xml);
	}

	@Override
	public void serializeSimpleBeanToXmlFile() throws IOException {
		// TODO Auto-generated method stub

		SimpleBean simpleBean = new SimpleBean (1, 2);

		XmlMapper xmlMapper = new XmlMapper();
		xmlMapper.writeValue(new File("C:\\convert\\simple_bean.xml"), simpleBean);
		File file = new File("simple_bean.xml");


	}

	@Override
	public void deserializeSimpleBeanFromXmlString() throws IOException {
		// TODO Auto-generated method stub
		
		String xmlString ="<SimpleBean><x>1</x><y>2</y></SimpleBean>";
		XmlMapper xmlMapper = new XmlMapper();
		SimpleBean simpleBean = xmlMapper.readValue(xmlString, SimpleBean.class);
		System.out.println(" simpleBean.getX() : " + simpleBean.getX());
		System.out.println(" simpleBean.getY() : " + simpleBean.getY());
	}

	@Override
	public void deserializeSimpleBeanFromXmlFile() throws IOException {
		// TODO Auto-generated method stub
		
	    File file = new File("C:\\convert\\simple_bean.xml");
	    XmlMapper xmlMapper = new XmlMapper();
	    String xml = inputStreamToString(new FileInputStream(file));
	    SimpleBean simpleBean = xmlMapper.readValue(xml, SimpleBean.class);
		System.out.println(" simpleBean.getX() : " + simpleBean.getX());
		System.out.println(" simpleBean.getY() : " + simpleBean.getY());
		
	}
	
	private static String inputStreamToString(InputStream is) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    String line;
	    BufferedReader br = new BufferedReader(new InputStreamReader(is));
	    while ((line = br.readLine()) != null) {
	        sb.append(line);
	    }
	    br.close();
	    return sb.toString();
	}

	@Override
	public void deserializeSimpleBeanFromXmlStringDistinctProperty() throws IOException {
		// TODO Auto-generated method stub
		String xmlString ="<SimpleBeanForCapitalizedFields><XXX>1</XXX><y>2</y></SimpleBeanForCapitalizedFields>";
	    XmlMapper xmlMapper = new XmlMapper();
	    SimpleBeanForCapitalizedFields simpleBeanForCapitalizedFields = xmlMapper.readValue(xmlString,SimpleBeanForCapitalizedFields.class);
		System.out.println(" simpleBeanForCapitalizedFields.getX() : " + simpleBeanForCapitalizedFields.getX());
		System.out.println(" simpleBeanForCapitalizedFields.getY() : " + simpleBeanForCapitalizedFields.getY());
	}

	@Override
	public void serializeSimpleBeanDistinctPropertyToXmlFile() throws IOException {
		// TODO Auto-generated method stub
		
		SimpleBeanForCapitalizedFields simpleBeanForCapitalizedFields = new SimpleBeanForCapitalizedFields (1,2);
		
	    XmlMapper xmlMapper = new XmlMapper();
	    xmlMapper.writeValue(new File("C:\\convert\\simple_bean_capitalized.xml"),simpleBeanForCapitalizedFields);
	    File file = new File("C:\\convert\\simple_bean_capitalized.xml");
	    System.out.println("file : " + file);
		
	}



}
