package studentselection;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
Scanner k= new Scanner (System.in);
Scanner scanName= new Scanner (System.in);
Scanner scanAge= new Scanner (System.in);
System.out.println("Öðrenci sayýsýný giriniz.");
int numStudents = k.nextInt();
String[] student=new String[numStudents];
int[] age = new int[numStudents];
for(int i=1;i<numStudents;i++) {
	System.out.println("Enter name");
	student[i]=scanName.nextLine();
	System.out.println("Enter age:");
	age[i]=scanAge.nextInt();
	
}

for(int i=0;i<numStudents;i++) {
	if(age[i]>=15) {
		System.out.println(student[i]+" can receive a vaccine");
		System.out.println("The student is now "+age[i]);
	}
}
k.close();
scanName.close();
scanAge.close();
	}

}
