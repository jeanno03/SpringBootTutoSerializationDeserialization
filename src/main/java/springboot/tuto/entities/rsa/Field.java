package springboot.tuto.entities.rsa;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;



@Root
public class Field implements Serializable{
	
	//name is optional
	@Attribute(name="monId")
	private String id;
	@Attribute(name="value")
	private String value;
	
	public Field() {
		super();
	}

	public Field(String id, String value) {
		super();
		this.id = id;
		this.value = value;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Field [id=" + id + ", value=" + value + "]";
	}
	
	

}
