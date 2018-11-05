package springboot.tuto.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleBeanForCapitalizedFields {
	
    @JsonProperty("XXX")
    private int x;
    private int y;
    
	public SimpleBeanForCapitalizedFields() {
		super();
	}

	public SimpleBeanForCapitalizedFields(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "SimpleBeanForCapitalizedFields [x=" + x + ", y=" + y + "]";
	}
        
}
