package springboot.tuto.service;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IEntityMethods {

	public void serializeSimpleBeanToString() throws JsonProcessingException ;
	public void serializeSimpleBeanToXmlFile() throws IOException ;
	public void deserializeSimpleBeanFromXmlString() throws IOException;
	public void deserializeSimpleBeanFromXmlFile() throws IOException;
	public void deserializeSimpleBeanFromXmlStringDistinctProperty() throws IOException;
	public void serializeSimpleBeanDistinctPropertyToXmlFile() throws IOException;
	
}
