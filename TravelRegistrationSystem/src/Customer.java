

public class Customer {

	private String nameandsurname;
	private int idnumber;
	private String emailaddress;
	private int phonenumber;
	private int creditcardinfo;
	private int point;




	public String getNameandsurname() {
		return nameandsurname;
	}
	public void setNameandsurname(String nameandsurname) {
		this.nameandsurname = nameandsurname;
	}




	public int getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(int idnumber) {
		this.idnumber = idnumber;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public int getCreditcardinfo() {
		return creditcardinfo;
	}
	public void setCreditcardinfo(int creditcardinfo) {
		this.creditcardinfo = creditcardinfo;
	}


	//default constructor
	public Customer(){

		nameandsurname=null;

		idnumber=0;
		emailaddress=null;
		phonenumber=0;
		creditcardinfo=0;


	}
	public Customer(String nameandsurname, int idnumber, String emailaddress, int phonenumber, int creditcardinfo) {
		super();
		this.nameandsurname = nameandsurname;
		this.idnumber = idnumber;
		this.emailaddress = emailaddress;
		this.phonenumber = phonenumber;
		this.creditcardinfo = creditcardinfo;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}

	public String toString() {

		String control="\nName and surname: "+ this.nameandsurname +
				"\nID: "+ this.idnumber +
				"\nMail adress: "+ this.emailaddress +
				"\nPhone number: "+ this.phonenumber +
				"\nCredit card info: " + this.creditcardinfo;

		return control;

	}



}
