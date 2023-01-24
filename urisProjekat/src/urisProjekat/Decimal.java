package urisProjekat;

public class Decimal extends Number{
	private String decimal;

	public Decimal() {

	}
	
	@Override
	public String toString() {
		return "Decimal [decimal=" + decimal + "]";
	}



	public String getDecimal() {
		return decimal;
	}

	public void setDecimal(String decimal) {
		this.decimal = decimal;
	}

}
