package springboot.tuto.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.springframework.stereotype.Service;
import org.wiztools.xsdgen.ParseException;
import org.wiztools.xsdgen.XsdGen;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import springboot.tuto.entities.SimpleBean;
import springboot.tuto.entities.SimpleBeanForCapitalizedFields;
import springboot.tuto.entities.rsa.Field;
import springboot.tuto.entities.rsa.Record;

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

	@Override
	public void parseXmlToXsUsingXsdGen() throws Exception{
		// TODO Auto-generated method stub
		File file = new File("C:\\convert\\inputXml.xml");
		new XsdGen().parse(file).write(System.out);


	}

	@Override
	public void xmlToXsdStringUsingXsdGen() throws Exception {
		// TODO Auto-generated method stub
		File file = new File("C:\\convert\\inputXml.xml");
		String xsd = new XsdGen().parse(file).toString();
		System.out.println(xsd);
	}

	@Override
	public void xmlToXsdFormatStringUsingXsdGen() throws IOException, ParseException {

		try {

			File file = new File("C:\\convert\\inputXml.xml");
			String xsd = new XsdGen().parse(file).toString();

			Source xmlInput = new StreamSource(new StringReader(xsd));
			StringWriter stringWriter = new StringWriter();
			StreamResult xmlOutput = new StreamResult(stringWriter);
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			transformerFactory.setAttribute("indent-number", 2);
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.transform(xmlInput, xmlOutput);


			System.out.println( xmlOutput.getWriter().toString());

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void generateXsdUsingXsdGen() throws Exception{

		File file = new File("C:\\convert\\inputXml.xml");

		XsdGen gen = new XsdGen();
		gen.parse(file);

		File out = new File("C:\\convert\\outputXsd.xsd");
		gen.write(new FileOutputStream(out));			

	}

	@Override
	public void createRSAXml() throws Exception {
		
		//tuto http://simple.sourceforge.net/download/stream/doc/tutorial/tutorial.php
		//using maven Simple XML 2.7.1
		// TODO Auto-generated method stub
		Record record = new Record("1");
		Field fi05 = new Field ("5", "valeure 50");

		record.setField(fi05);
		


		XmlMapper xmlMapper = new XmlMapper();
		xmlMapper.writeValue(new File("C:\\convert\\monTest.xml"), record);
		File file = new File("monTest.xml");


		Serializer serializer = new Persister();
		File file02 = new File("C:\\convert\\monTest02.xml");
		serializer.write(record, file02);
	}


}
