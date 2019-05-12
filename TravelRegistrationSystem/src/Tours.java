import java.util.Scanner;

public class Tours {
	//attributes
		private String tourname;
	    private int idnumber;
		private int quota;
		private int daynumber;
		private int price;
		private int count;
		
//		//default constructor
//		public Tours(){
//			
//			tourname=null;
//			 idnumber=0;
//			 quota=0;
//			daynumber=0;
//			price=0;
			 	
	//	}
		
		//constructor
		public Tours(String tourname, int idnumber, int daynumber, int price) {
			super();
			this.tourname = tourname;
			this.idnumber = idnumber;
			quota = 30;
			this.daynumber = daynumber;
			this.price = price;
			count = 0;
		}
		
		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		public String getTourname() {
			return tourname;
		}
		public void setTourname(String tourname) {
			this.tourname = tourname;
		}
		public int getIdnumber() {
			return idnumber;
		}
		public void setIdnumber(int idnumber) {
			this.idnumber = idnumber;
		}
		public int getQuota() {
			return quota;
		}
		public void setQuota(int quota) {
			this.quota = quota;
		}
		public int getDaynumber() {
			return daynumber;
		}
		public void setDaynumber(int daynumber) {
			this.daynumber = daynumber;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		public String toString() {

			String control=
					"  ID: "+ this.idnumber +
					"    Quota: "+ this.quota +
					"    Days: "+ this.daynumber +
					"    Price: " + this.price ;
			return control;
			
		}
}
