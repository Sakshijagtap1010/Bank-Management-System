package comp.test.project1;
import java.util.Scanner;
import java.util.ArrayList;
public class BankMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	  //ArrayList for storing customer record
		ArrayList<Bank> list1=new ArrayList<Bank>();
		list1.add(new Bank(1001,"Sakshi",80000));
		list1.add(new Bank(1002,"Atharv",60000));
		list1.add(new Bank(1003,"Amruta", 70000));
		list1.add(new Bank(1004,"Puja", 60000));
		list1.add(new Bank(1005,"lmn", 60000));
		
		int ch=0;
	    while(ch!=7) 
	    {
	    System.out.println("--------------------MENU--------------------");
		System.out.println("1)Create Account" + "\n2)View All Details" + "\n3)View Record" + "\n4)Deposite Amount"
				+ "\n5)Withdraw Amount" + "\n6)Transfer Money" + "\n7)Exit");
		System.out.println("--------------------------------------------");
	
		System.out.println("Enter your Choice:");
		ch = sc.nextInt();
		
		switch (ch) {
		case 1:
			//create account procedure
			System.out.println("Enter Account Number:");
			long num=sc.nextLong();
			System.out.println("Enter First Name:");
			String str = sc.next();
			System.out.println("Enter Balance:");
			double bal = sc.nextDouble();
			Bank obj1 = new Bank(num,str,bal);
			list1.add(obj1);
			System.out.println("Account Created Successful...");
            break;
		case 2:
			//showing all customer Details
			System.out.println("Details Of Customer:");		
			for(Bank val:list1)
			{
				System.out.println(val);
				
			}
			break;
		case 3:
			//Searching Individual customer 
			System.out.println("Enter Account Number To Search:");
			long acc=sc.nextLong();
			boolean flag = false;
			for(Bank ob:list1)
			{
				if(ob.getAcc_no()==acc)
				{
					flag=true;
					System.out.println(ob);
				}
			}
			if(flag==false)
			{
				System.out.println("Invalid User...");
			}
			break;
		case 4:
			//deposite amount to particular account number
			System.out.println("Enter Account Number:");
			long acno=sc.nextLong();
			System.out.println("Enter Amount To Deposite:");
			double amount=sc.nextDouble();
			boolean flag1=false;
			for(Bank obs1:list1)
			{
				if(obs1.getAcc_no()==acno)
				{
					    flag1=true;
						double bal1=obs1.getBalance();
						bal1=bal1+amount;
						obs1.setBalance(bal1);
					System.out.println(bal1);
				}
			}
			if(flag1==false)
			{
				System.out.println("Invalid Account Number..");
			}
			break;
		case 5:
			//withdraw amount to perticular account number
			System.out.println("Enter Account Number:");
			long ac_no =sc.nextLong();
			System.out.println("Enter Amount To Withdraw:");
			double amt=sc.nextDouble();
			boolean flag3=false;
			for(Bank obs1:list1)
			{
				if(obs1.getAcc_no()==ac_no)
				{
					flag3=true;
						double bal1=obs1.getBalance();
						if(amt>bal1) {
							System.err.println("Insufficient balance");
						}
						bal1=bal1-amt;
						obs1.setBalance(bal1);
						System.out.println(bal1);
				}	
			}
			if(flag3==false)
			{
				System.out.println("Invalid Account Number..");
			}
			break;
		case 6:
			//Transfer money from one Account to other
			System.out.println("Enter Account Number Transfer Money From");
			long acn = sc.nextLong();
			boolean fg=false;
			for (Bank bn : list1) {//sender
				if (bn.getAcc_no() == acn) 
				{
					System.out.println("Enter Account Number Transfer Money TO : ");
					long acn1 = sc.nextLong();
					for (Bank bn1 : list1) { //reciver
						if (bn1.getAcc_no() == acn1) {
							System.out.println("Enter Amount To Transfer:");
							double amt1 = sc.nextDouble();
							double bl = bn.getBalance();
							fg=true;
							if (bl < amt1) 
							{
								System.err.println("Insufficient balance");
								
							} 
							bl = bl - amt1; //transfering
							bn.setBalance(bl);
							System.out.println("Amount after transfer:" + bl);

							double bl1 = bn1.getBalance();
							bl1 = bl1 + amt1; //depositing
							bn1.setBalance(bl1);
							System.out.println("balance after deposite:" + bl1);
						}					

					}
				}
			}
			if(fg==false)
			{
				System.out.println("Invalid Account Number");
			}

			break;
		case 7:
			//exit from process
			System.out.println(".....Thank You!!.....");
			break;

		default:
			System.err.println("wrong choice...");
			break;
		}
	}
	}

}