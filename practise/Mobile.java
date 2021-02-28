package practise;

import java.util.Iterator;

public class Mobile {
	public static voim main(String[] args) {
		private int Mobile_Id;
		private String Model;
		private float Price;
		private byte Number_Of_Sims;
		private boolean Has_Camera;

		public Mobile() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Mobile(int mobile_Id, String model, float price, byte number_Of_Sims, boolean has_Camera) {
			super();
			Mobile_Id = mobile_Id;
			Model = model;
			Price = price;
			Number_Of_Sims = number_Of_Sims;
			Has_Camera = has_Camera;
		}

		public int getMobile_Id() {
			return Mobile_Id;
		}

		public void setMobile_Id(int mobile_Id) {
			Mobile_Id = mobile_Id;
		}

		public String getModel() {
			return Model;
		}

		public void setModel(String model) {
			Model = model;
		}

		public float getPrice() {
			return Price;
		}

		public void setPrice(float price) {
			Price = price;
		}

		public byte getNumber_Of_Sims() {
			return Number_Of_Sims;
		}

		public void setNumber_Of_Sims(byte number_Of_Sims) {
			Number_Of_Sims = number_Of_Sims;
		}

		public boolean getHas_Camera() {
			return Has_Camera;
		}

		public void setHas_Camera(boolean has_Camera) {
			Has_Camera = has_Camera;
		}

		@Override
		public String toString() {
			return "Mobile [Mobile_Id=" + Mobile_Id + ", Model=" + Model + ", Price=" + Price + ", Number_Of_Sims="
					+ Number_Of_Sims + ", Has_Camera=" + Has_Camera + "]";
		}

		public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        MobileApplication ma=new MobileApplication();
	        Mobile mob=new Mobile();
			System.out.println(
					"1. Add Mobile Details\n2.  Display all mobile details\n3.  Display all mobile details sorted by Model\n"
							+ "4.  Display all mobile details whose price\n5.  Update price for given Mobile id and display updated details\n6.  Delete the mobile details based on Mobile Id"
							+ "\n7.  Exit");
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			
		    switch(choice)
		    {
		    case 1:ma.addMobileDetails();
		    mob.toString();
		    break;
		    
		    case 2:ma.Display(mob);
		    break;
		    
		    default:System.exit(0);
		    break;
		    
			}
		}
		
		
	}

}
