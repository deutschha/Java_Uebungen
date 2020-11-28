package adminpack;
import java.util.Random;
import java.util.Scanner;
public class App {

	public static String[] arr = new String[8];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		generateID();
		int idd = generateID();
		int iarr = 0;
		Department defdep = new Department("Test",idd,"Neverland","Gotham");
		System.out.println(defdep.departmentname + " "+defdep.departmentnr + " " + defdep.country + " " + defdep.city);
		int ide = generateID();
		Employee defemp = new Employee("Max","Mustermann",ide,defdep);
		defemp.print();
		application();

		
		String[] ar = new String[arr.length + arr.length];
		for (int i=0; i < arr.length; i++) {
			if ( i == arr.length) {
				iarr = i;
				ar = arr;
				arr = ar;
			}
		}
		arr[iarr +1] = defdep.departmentname;
		arr[iarr +2] = Integer.toString(defdep.departmentnr);
		arr[iarr +3] = defdep.country;
		arr[iarr +4] = defdep.city;
		arr[iarr +5] = Integer.toString(defemp.id);
		arr[iarr +6] = defemp.firstname;
		arr[iarr +7] = defemp.lastname;
		
	}
	
	private static int generateID() {
		Random rand = new Random();
		int id = rand.nextInt(999);
		int idd = rand.nextInt(999);
		return id;
	}
	
	private static void application() {
		System.out.println("-----------------");
		System.out.println("|     Menü 	|");
		System.out.println(" --------------");
		System.out.printf("%1s%4d%10s%1s\n","|" ,1,"Eingabe"," |");
		System.out.printf("%1s%4d%10s%1s\n","|" ,2,"Ausgabe"," |");
		System.out.printf("%1s%4d%10s%1s\n","|" ,0,"  Exit "," |");
		System.out.println("-----------------");
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Make your choice: ");
		int choose = input.nextInt();
		if (choose == 1) {
			input();
		}
		else if(choose == 2){
			
		}
		else {
			System.out.println("You exit Goodby");
			System.exit(0);
		}	
	}

	private static void input() {
		int idd = generateID();
		System.out.println("Please generate a department: ");
		Department indep = new Department();
		Employee inemp = new Employee();
		Scanner scan = new Scanner(System.in);
		indep.departmentnr = idd;
		System.out.println("Name: ");
		indep.departmentname = scan.next();
		System.out.println("Country: ");
		indep.country = scan.next();
		System.out.println("City: ");
		indep.city = scan.next();	
		System.out.println();
		System.out.println("Bitt legen sie einen Mitarbeiter an");
		System.out.println();
		int ide = generateID();
		inemp.id = ide;
		System.out.println("Vorname: ");
		inemp.firstname = scan.next();
		System.out.println("Country: ");
		inemp.lastname = scan.next();
		System.out.println("Sie haben folgenden Mitarbeiter angelegt: \n"
				+ "Der Mitarbeiter" + inemp.id + " " + inemp.firstname + " " + inemp.lastname + " arbeitet in der Abteilung " +
				indep.departmentname + " in " + indep.city);
	}
}
