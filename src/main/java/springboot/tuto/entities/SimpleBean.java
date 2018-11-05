package springboot.tuto.entities;

public class SimpleBean {
	
    private int x;
    private int y;
    
	public SimpleBean() {
		super();
	}
	
	public SimpleBean(int x, int y) {
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
		return "SimpleBean [x=" + x + ", y=" + y + "]";
	}
        
}
