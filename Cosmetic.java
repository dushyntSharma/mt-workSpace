package mindtree;

import java.util.Scanner;

public class Cosmetic {
	static int[] id= {111,112,113,114,115,116};
	static String[] name= {"shampo","shampo","soap","soap","shampo","soap"};
	static String[] bname= {"chik","pantene","lire","vivel","sunsilk","chintol"};
static 	int[] quant= {14,32,5,65,22,12};
static	int[] price= {250,25,64,219,27,44};
	
	public static void display() {
		System.out.println("ID \tNAME \tBRAND \tQUANT \tPRICE");
		for(int i=0;i<id.length;i++) {
			System.out.println(id[i]+"\t"+name[i]+"\t"+bname[i]+"\t"+quant[i]+"\t"+price[i]);
		}
	}
	
	public static void search(int lp,int hp) {
		System.out.println("BRAND\tPRICE");

		for(int i=0;i<price.length;i++) {
			if(price[i]>=lp && price[i]<=hp) {
				System.out.println(bname[i]+"\t"+price[i]);
			}
		}
	}
	
	public static void newsearch(String s) {
		int flag=0;
		for(int i=0;i<name.length;i++) {
			if(s.equals(name[i])) {
				System.out.println(bname[i]);
				flag++;
			}
		}
		if(flag==0) {
			System.out.println("Sorry..! No Products");
		}
	}
	
	public static void update(int id1,int qu) {
		int flag=0;
		for(int i=0;i<id.length;i++) {
			if(id[i]==id1) {
				quant[i]=qu;
				flag++;
			}
		}if(flag==0) {
			System.out.println("Invalid ID..!");

		}else {
			System.out.println("Updated Successfully...!");
			System.out.println();
			display();


		}
		
	}
	
	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		int opt;int lpr,hpr;String na;int id;int quan;
		do {
			System.out.println("Choose your option:\n1.show cosmetics\n2.search cosmetic using price\n3.search brands\n4.update\n5.exit");
			System.out.println("enter your option:");
			 opt=s.nextInt();
			switch(opt) {
			case 1:
				display();
                System.out.println();

				break;
			case 2:
				System.out.println("enter the price range");
				lpr=s.nextInt();
				hpr=s.nextInt();
				search(lpr,hpr);
                System.out.println();

				break;
			case 3:
				System.out.println("enter the Name");
                na=s.next();
                newsearch(na);
                System.out.println();
				break;
			case 4:
				System.out.println("Enter the ID of the product to update:");
				id=s.nextInt();
				System.out.println("Enter the Quantity to update:");
                quan=s.nextInt();
                update(id,quan);
    			System.out.println();

				break;
			case 5:
				System.out.println("THANK YOU...!");
				break;
			default:
				System.out.println("Please Enter Correct Option..!");
				System.out.println();

				break;
			}
		}while(opt!=5);
	}


}
