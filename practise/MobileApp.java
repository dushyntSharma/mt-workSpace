package practise;

public class MobileApp {
	Scanner scan=new Scanner(System.in);
	 
	public Mobile addMobileDetails() {
		System.out.println("Enter mobile id");
		int Id=scan.nextInt();
		
		System.out.println("Enter Model");
         String Model=scan.next();
		
		System.out.println("Enter mobile price ");
		float price=scan.nextFloat();
		
		System.out.println("Enter number of sims");
		byte No_Of_sims=scan.nextByte();
		
		System.out.println("Camera is present or not");
		Boolean Has_Camera=scan.nextBoolean();
	
		Mobile mob = new Mobile(Id,Model,price,No_Of_sims,Has_Camera);
		return mob;
		
	}
    public void Display(Mobile mob)
    {
      System.out.println(mob.getMobile_Id());
      System.out.println(mob.getModel());
      System.out.println(mob.getPrice());
      System.out.println(mob.getNumber_Of_Sims());
      System.out.println(mob.getHas_Camera());
    }
}


