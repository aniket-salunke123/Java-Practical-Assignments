import java.io.*;
import MScCAI.MScCAIMarks;
import MScCAII.MScCAIIMarks;

class Student
{
	int rollNumber = 0;
	String Name = "";
	MScCAIMarks M1;
	MScCAIIMarks M2;
	String grade;

	float avg;

	int total =0;

	Student(int rollNumber, String Name, int SemITotal1, int SemIITotal1, int SemITotal2, int SemIITotal2)
	{
		this.rollNumber = rollNumber;
		this.Name = Name;
		this.M1 = new MScCAIMarks(SemITotal1, SemIITotal1);
		this.M2 = new MScCAIIMarks(SemITotal2, SemIITotal2);
		this.addition();
	}

	public void addition()
	{
		int MscCAIAddition = M1.SemITotal+M1.SemITotal;
		int MscCAIIAddition = M2.SemITotal+M2.SemITotal;
		this.total = MscCAIAddition + MscCAIIAddition;
		this.avg = total / 2;

		if(avg >= 70)
			this.grade = "A";
		else if(avg >= 60 && avg <=70)
			this.grade = "B";
		else if(avg >= 50 && avg <= 60)
			this.grade = "C";
		else if(avg>=40 && avg<=50)
			this.grade = "Pass";
		else
			this.grade = "Fail";
	}

	public String toString()
	{
		return "ROll No : " + this.rollNumber + " Name : " + this.Name + "\nMScCA I Marks : \n\t Sem I Marks : " + this.M1.SemITotal + "\t Sem II Marks " + this.M1.SemIITotal +"\nMScCA II Marks : \n\t Sem I Marks : " + this.M2.SemITotal + "\t Sem II Marks " + this.M2.SemIITotal + "\nTotal : " + this.total + "\tAverage : " + this.avg + "\n Grade : " + this.grade;
	}
}



public class StudentTest
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		

		System.out.println("Enter N: ");
		int n = Integer.parseInt(br.readLine());

		Student S[] = new Student[n];

		for (int i=0; i<n; i++) {

			System.out.println("Enter Roll Number : ");
			int rollNumber = Integer.parseInt(br.readLine());
			System.out.println("Enter Name : ");
			String Name = br.readLine();

			System.out.println("FOr MScCA I  : \n" + "Enter Sem I & II total");
			int SemITotal1 = Integer.parseInt(br.readLine());
			int SemIITotal1 = Integer.parseInt(br.readLine());
			

			System.out.println("FOr MScCA II  : \n" + "Enter Sem II total");
			int SemITotal2 = Integer.parseInt(br.readLine());
			int SemIITotal2 = Integer.parseInt(br.readLine());

			S[i] = new Student(rollNumber, Name, SemITotal1, SemITotal1, SemIITotal1, SemIITotal2);


			
		}

		// for displaying the results

		for (int i=0; i<n; i++) {
			System.out.println(S[i] + "\n***************************************************\n");
		}


		
	}
}