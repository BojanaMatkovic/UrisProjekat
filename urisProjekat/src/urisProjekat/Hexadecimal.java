package urisProjekat;

public class Hexadecimal extends Number{

 private String hexadecimal;
	
	public Hexadecimal() {
		
	}
	
	

	@Override
	public String toString() {
		return "Hexadecimal :" + hexadecimal;
	}



	public String getHexadecimal() {
		return hexadecimal;
	}

	public void setHexadecimal(String hexadecimal) {
		this.hexadecimal = hexadecimal;
	}

}
