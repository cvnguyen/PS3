
package mainPackage;
import java.util.Date;

public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	// no-argument  constructor
	public Account(){
		
		this.dateCreated = new Date();
	}
	
	public Account (int id, double balance)
	{
		this.id = id;
		this.balance = balance;
	}
	
	// accessor and mutator methods for id, balance, and annualinterestRate
	
	// id
		public void setID(int ID){
		this.id = ID;
	}
	
	public int getID(){
		return this.id;
		}
	
	// balance
	public void setBalance (double Balance){
		this.balance = Balance;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	//interest rate
	public void setAnnualInterestRate(double AnnualInterestRate){
		this.annualInterestRate = AnnualInterestRate;
		
	}
	
	public double getAnnualInterestRate(){
		return this.annualInterestRate;
	}
	
	//accessor for date
	
	public void setDate(Date Date){
		this.dateCreated = Date;
	}
	public Date getDate(){
		return this.dateCreated;
	}
	
	// get monthly interest rate method
	public double getMonthlyInterestRate(){
		return (this.annualInterestRate / 12);
	}
	
	// withdraw amount method
	public void withdraw(double amount)throws InsufficientFundsException {
		if (amount <= balance){
			setBalance(getBalance()- amount);
		}
		else {
			double deficient = amount - balance;
			System.out.println("Deficient by $" + deficient);
			throw new InsufficientFundsException(deficient);
			}
		}
		
	// make deposit
	public void deposit(double amount){
		setBalance(getBalance()+ amount);
		
	}
		
}

  