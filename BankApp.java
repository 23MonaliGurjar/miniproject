package bankminiproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BankApp {
	List<Bank>list=new ArrayList<Bank>();
	Scanner sc=new Scanner(System.in);
	public void adddetails()
	{
		System.out.println("Enter the bankname");
		String BankName=sc.next();
		System.out.println("Enter the accno");
		int accno=sc.nextInt();
		System.out.println("Enter the Name");
		String accholdername=sc.next();
		System.out.println("Enter the accounttype");
		String acc_type=sc.next();
		System.out.println("Enter the balance");
		long balance=sc.nextLong();
		Bank b1=new Bank(BankName,accno,accholdername,acc_type,balance);
		list.add(b1);
		list.forEach(System.out::println);
	}
	
	public void deleteaccountByAccno() throws NumberFormatException, IOException
	{
		System.out.println("Enter accno :");
		int accno=sc.nextInt();
		int index=0,flag=0;
		Bank b=null;
		
		for(Bank bank:list)
		{
			if(accno==bank.getAccno())
			{
				{
					flag=1;
					index = list.indexOf(bank);
					b=bank;
					System.out.println(index);
					break;
				}
			}
			System.out.println("==================================================================================================");

			if(flag==0) {
			System.out.println("accno dosnt exist");
		}
		{
			list.remove(b);
			System.out.println("account delete succesfully!!");
		}
		
		System.out.println("==================================================================================================");
		}

	}
	public void deleteAllAccount()
	{
		System.out.println("==================================================================================================");

		if(list.size()>0)
		{
			list.clear();
			System.out.println("All records deleted successfully!!");
		}
		else
		{
			System.out.println("No record available!!");
		}
		System.out.println("==================================================================================================");

	}
	
	public void insertinfo() throws NumberFormatException, IOException
	{
		System.out.println("Enter the bankname");
		String BankName=sc.next();
		System.out.println("Enter the accno");
		int accno=sc.nextInt();
		System.out.println("Enter the Name");
		String accholdername=sc.next();
		System.out.println("Enter the accounttype");
		String acc_type=sc.next();
		System.out.println("Enter the balance");
		long balance=sc.nextLong();
		Bank b=new Bank(BankName,accno,accholdername,acc_type,balance);
		System.out.println("Do you want to deposite or withdraw? (Y-Yes / N-No)");
		String ch=sc.next();
	   if(ch.equals("Y")||ch.equals("y")) 
	   {
		b.deposit();
		b.withdrawal();
		list.add(b);
		}
	    else
	    {
	    	list.add(b);
	}
	}
	public void viewaccountInfoByAccno() throws NumberFormatException, IOException
	{
		System.out.println("Enter accno:");
		int accno = sc.nextInt();
		 int flag=0;
		System.out.println("==================================================================================================");

		for(Bank b:list)
		{
			if(accno==b.getAccno())
			{   flag=1;
			System.out.println("bank Name:"+b.getBankName()+"\t accno:"+b.getAccno()+"\t accountholdername:"+b.getAccholdername()+"\t type:"+b.getAcc_type()+"\t balance:"+b.getBalance());
			
			}
		}
		
		if(flag==0)
			System.out.println("accountno dosnt exsit!!");
		System.out.println("==================================================================================================");
	
	}
	
	public void viewAllaccountdetail()
	{   		
		System.out.println("==================================================================================================");

		if(list.size()==0)
		{
			System.out.println("No record found!!");
		}
		
		
		for(Bank b:list)
		{
			System.out.println("bank Name:"+b.getBankName()+"\t accno:"+b.getAccno()+"\t accountholdername:"+b.getAccholdername()+"\t type:"+b.getAcc_type()+"\t balance:"+b.getBalance());
			
				}
		System.out.println("==================================================================================================");

	}
	
	public void updateByaccno() throws NumberFormatException, IOException
	{
		System.out.println("Enter accno:");
		int accno = sc.nextInt();
		int flag=0,index = 0;
	    Bank b=null;
	    for(Bank bank:list)
		{
			if(accno==bank.getAccno())
			{
				flag=1;
				index=list.indexOf(bank);
				b=bank;
				System.out.println(index);
				break;
			}
		}
	    if(flag==1)
	    {
	    	System.out.println("Enter the bankname");
			String BankName=sc.next();
			System.out.println("Enter the Name");
			String accholdername=sc.next();
			System.out.println("Enter the accounttype");
			String acc_type=sc.next();
			System.out.println("Enter the balance");
			long balance=sc.nextLong();
			b.setBankName(BankName);
			b.setAccno(accno);
			b.setAccholdername(accholdername);
			b.setAcc_type(acc_type);
			b.setBalance(balance);
			list.set(index,b);
			System.out.println("==================================================================================================");

			System.out.println("details updated!!");
	    }
	    else
	    {
	    	System.out.println("account not exist!!");
	    }
	    
	
		System.out.println("==================================================================================================");
	}
		public static void main(String[] args) throws NumberFormatException, IOException {
			Scanner sc = new Scanner(System.in);
			System.out.println("====================================================================");
			System.out.println("============= Bank application System =============================");
			System.out.println("====================================================================");
			String ch=null;
			BankApp app=new BankApp();
			Bank app2 = new Bank();
			do
			{
			
			System.out.println("\t\t 1)add detials\r\n"
					+ "\t\t 2)insert details.\r\n"
					+ "\t\t 3)View details info by account id.\r\n"
					+ "\t\t 4)view all details.\r\n"
					+ "\t\t 5)Update  information by accountno.\r\n"
					+ "\t\t 6)delete details by accountno.\r\n"
					+ "\t\t 7)delete all  information.");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: app.adddetails();
			    System.out.println("Information add!!");
			    break;	
		case 2: app.insertinfo();
	            System.out.println("Information inserted!!");
	            break;	
		case 3:	app.viewaccountInfoByAccno();
		        System.out.println("Information inserted!!");
				break;
		case 4:	app.viewAllaccountdetail();
		        System.out.println("view account!!");
				break;
		case 5:	app.updateByaccno();
		        System.out.println("Information update!!");
				break;		
		case 6: app.deleteaccountByAccno();
		        System.out.println("account deleted succesfully!!");
				break;
		case 7:	app.deleteAllAccount();
		        System.out.println("all account deleted!!");
				break;
		
        	
		
	    default:System.out.println("Wrong choice!!"); 		   
		
	    
	    
		}
		
		System.out.println("Do you want to continue? (Y-Yes / N-No)");
		ch=sc.next();
		}
		while(ch.equals("Y")||ch.equals("y"));
		System.out.println("====================================================================");

		System.out.println("Bye....");
	
		System.out.println("====================================================================");

		
	}

}

