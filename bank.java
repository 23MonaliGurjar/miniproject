package bankminiproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
	private String BankName;
	 private int accno;  
	    private String accholdername;  
	    private String acc_type;  
	    private long balance;  
	    Scanner sc = new Scanner(System.in);
	    
	    public Bank(){
	    	
	    }
		
		 public Bank(String bankName, int accno, String accholdername, String acc_type, long balance) {
			super();
			BankName = bankName;
			this.accno = accno;
			this.accholdername = accholdername;
			this.acc_type = acc_type;
			this.balance = balance;
		}
		 
		public long deposit() {  
		        long amt;  
		        System.out.println("Enter the amount you want to deposit: ");  
		        amt = sc.nextLong();  
		        balance = balance + amt;  
		        return balance;
		    }  
		 public long withdrawal() {  
		        long amt;  
		        System.out.println("Enter the amount you want to withdraw: ");  
		        amt = sc.nextLong();  
		        if (balance >= amt) {  
		            balance = balance - amt;  
		            System.out.println("Balance after withdrawal: " + balance);  
		            return balance;
		        } else {  
		            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
		        }
				return amt;  
		    }  
		 
		public String getBankName() {
			return BankName;
		}

		public void setBankName(String bankName) {
			BankName = bankName;
		}

		public int getAccno() {
			return accno;
		}

		public void setAccno(int accno) {
			this.accno = accno;
		}

		public String getAccholdername() {
			return accholdername;
		}

		public void setAccholdername(String accholdername) {
			this.accholdername = accholdername;
		}

		public String getAcc_type() {
			return acc_type;
		}

		public void setAcc_type(String acc_type) {
			this.acc_type = acc_type;
		}

		public long getBalance() {
			return balance;
		}

		public void setBalance(long balance) {
			this.balance = balance;
		}

		@Override
		public String toString() {
			return "Bank [accno=" + accno + ", name=" + accholdername + ", acc_type=" + acc_type + ", balance=" + balance + " , deposite=" + deposit() + " , withdraw=" + withdrawal() + "]";
		}

}