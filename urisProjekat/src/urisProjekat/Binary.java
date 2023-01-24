package urisProjekat;

public class Binary extends Number{
	
	private String binary;

	public Binary() {
		
	}
	

	@Override
	public String toString() {
		return "Binary :"  + binary ;
	}



	public String getBinary() {
		return binary;
	}

	public void setBinary(String binary) {
		this.binary = binary;
	}

}
