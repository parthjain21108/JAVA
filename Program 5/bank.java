import java.util.Scanner;

class Account{
	
	String Name;
	int accno;
	double balance;


	public Account(String Name,int accno,double balance){
	this.Name=Name;
	this.accno=accno;
	this.balance=balance;
}

	public void deposite(double amount){
	balance+=amount;
	System.out.println("Deposite successfull current balance = "+balance);
}

	public void display(){

		System.out.println("Current balance = "+balance);
	}

}

class Savacct extends Account{

	public Savacct(String Name,int accno,double balance){
	super(Name,accno,balance);
	}

	public void calinter(){
		double interrate=0.05;
		double interest =interrate*balance;
		balance+=interest;
		System.out.println("Interest applied Current balance = "+balance);
	}


	public void withdraw(double amount){
		if(amount<=balance){
			balance-=amount;
			System.out.println("Withdraw successfull ; Current Balance = "+balance);
		}
		else{
			System.out.println("Insufficient balance");
		}
	}
}
class Curacct extends Account{

	public Curacct(String Name,int accno,double balance){
	super(Name,accno,balance);
	}

	int minbalance=1000;
	int pan=50;

	public void withdraw(double amount){
		if(amount<balance){
			balance-=amount;
			System.out.println("Withdraw successfull ; Current Balance = "+balance);
		}
		else{
			balance-=amount;
			balance-=pan;
			System.out.println("Low balance warring Panalty of 50 applied ; Current Balance = "+balance);
		}
	}
}

class bank{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		Savacct sav=new Savacct("Parth",203,1000);
		Curacct cur=new Curacct("Jain",203,1000);

		int i=0;
		int x;
		int y;
		double z;
		
		while(i==0){
			System.out.println("Enter 1-> Saving acc ; 2 -> Current acc");
			x=sc.nextInt();
			if(x==1){
				System.out.println("Enter 1-> Balance ; 2-> Deposite ; 3 -> Withdraw ; 4-> Interest ; other to exit");
				y=sc.nextInt();
				if(y==1){
					sav.display();
				}
				else if(y==2){
					System.out.println("Enter the amount : ");
					z=sc.nextInt();
					sav.deposite(z);
				}
				else if(y==3){
					System.out.println("Enter the amount : ");
					z=sc.nextInt();
					sav.withdraw(z);
				}
				else if(y==4){
					sav.calinter();
				}
				else{
					System.out.println("exiting");
					break;
				}
			}
			
			else if(x==2){
				System.out.println("Enter 1-> Balance ; 2-> Deposite ; 3 -> Withdraw; other to exit");
				y=sc.nextInt();
				if(y==1){
					cur.display();
				}
				else if(y==2){
					System.out.println("Enter the amount : ");
					z=sc.nextInt();
					cur.deposite(z);
				}
				else if(y==3){
					System.out.println("Enter the amount : ");
					z=sc.nextInt();
					cur.withdraw(z);
				}
				
				else{
					System.out.println("exiting");
					break;
				}
			}
			else{
				break;
			}
		
	
		}
	}
}