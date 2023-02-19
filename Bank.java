package comp.test.project1;

import java.util.Scanner;

public class Bank 
{
	//Data Member
	private long acc_no;    
	private String name;
	private double balance;
	
	Scanner sc=new Scanner(System.in);//input
	
  public Bank() 
	{
		//default constructor
		this.acc_no=0;
		this.name = null;
		this.balance = 0;
	}

	public Bank(long acc_no,String name, double balance)
	{
		//parameterized constructor
		this.acc_no=acc_no; ;
		this.name = name;
		this.balance = balance;
	}
    //getter,setter methods for all data member
	public long getAcc_no() 
	{
		return acc_no;
	}

	public void setAcc_no(long acc_no)
	{
		this.acc_no = acc_no;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance) 
    {
		this.balance = balance;
    }	
	//toString
	public String toString()
	{
		return(acc_no+"  "+name+"  "+balance);
	}
}
