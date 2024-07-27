package Encapsulation;

public class Vehical {
    private String name;
	private int vno;
	private String color;
	private double price;

	
	public String getname() {
		return name;
	}
	
    public void setname(String name) {
    	this.name=name;
    
    }
    public int getvno() {
		return vno;
	}
	
    public void setvno(int vno ) {
    	this.vno=vno;
    
    }
    
    public String getcolour() {
		return color;
	} 
	
    public void setcolour(String color) {
    	this.color=color;
    
    }
    public double getprice() {
		return price;
	}
	
    public void setprice(double price) {
    	this.price=price;
    
    }
    public String vehicalinfo() {
    	return "name:"+name+", vehical no:"+vno+", colour :"+color+", price :"+price;
    }

}
