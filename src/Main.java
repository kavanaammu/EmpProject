import java.util.ArrayList;
import java.util.Scanner;
public class Main {
   ArrayList<Emp>al = new ArrayList<Emp>();
   Scanner sc = new Scanner (System.in);
   void addEmp()
   {
	   System.out.println("Enter the eno");
	   int eno = sc.nextInt();
	   
	   System.out.println("Enter the ename ");
	   String ename = sc.next();
	    
	   System.out.println("Enter the sal");
	   double sal = sc.nextDouble();
	   
	   System.out.println("Enter the desg");
	   String desg = sc.next();
	   
	   Emp e = new Emp(eno,ename,sal,desg);
	   
	   al.add(e);
	   
	   System.out.println("Employee added Successfully");
   
   }
   void viewEmp()
   {
	  System.out.println("The number of employees are"); 
	  
	  for (Emp e1:al) {
		  System.out.println(e1.getEno()+" "+e1.getEname()+" "+e1.getSal()+" "+e1.getDesg());
   }
	  System.out.println("=====================================");
   }
   void updateEmp()
   {
	   
   }
   void deleteEmp()
   {
	   
   }
   
   
   
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   int ch;
   System.out.println("WELCOME TO EMPLOYEE DETAILS APP");
   System.out.println("================================");
   Main m = new Main();
   do {
	   
	   System.out.println("1.AddEmp\n 2.ViewEmp\n 3.UpdateEmp \n 4.DeleteEmp\n 5.Exit");
       ch = sc.nextInt();
       switch (ch) {
       case 1:
    	   m.addEmp();
    	   break;
       case 2:
    	   m.viewEmp();
    	   break;
       case 3:
    	   break;
       case 4:
    	   break; 
       case 5:
    	   System.out.println("Thank you for using our services");
    	   break;
    	   default:
    		   System.out.println("Wrong Choice");
    		   break;
    		   
       }
    
   }     while (ch !=5 );
   

	}

}
