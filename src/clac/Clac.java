
package clac;

import java.util.Scanner;


public class Clac {
    
   public void percentage(int maths_mark,int english_mark,int hindi_mark,int science_mark,int social_mark){
   
   float percentage;
   float total;
   total = maths_mark+english_mark+hindi_mark+science_mark+social_mark;
   percentage = total/5;
   if(percentage<40)
	   {
		   System.out.println("Your total is: " + total + " with the percentage of " +percentage+" and your performance seems to be Poor");
	   }
	   
	   else if(percentage>=40 && percentage<=59)
	   {
		   System.out.println("Your total is: " + total + " with the percentage of " +percentage+" and your performance seems to be Average");
	   }
	   
	   else if(percentage>59 && percentage<=79)
	   {
		   System.out.println("Your total is: " + total + " with the percentage of " +percentage+" and your performance seems to be good");
	   }
	   
	   else if(percentage>79 && percentage<=89)
	   {
		   System.out.println("Your total is: " + total + " with the percentage of " +percentage+" and your performance seems to be very good");
	   }
	   else 
	   {
		   System.out.println("Your total is: " + total + " with the percentage of " +percentage+" and your performance seems to be Excellent");
	   }
	   
	   }
   public static void main(String args[]){
      Clac cal = new Clac();
      Scanner sc = new Scanner(System.in);
      int maths_marks,english_marks,hindi_marks,science_marks,social_marks;
      boolean choice;
      
		System.out.println("Enter mathematics marks between 0-100 : ");
		maths_marks = sc.nextInt();
		if(maths_marks<0 || maths_marks>100)
		{
			System.out.println("Please Enter mathematics marks again : ");
			maths_marks = sc.nextInt();	
		}
                
		System.out.println("Enter English marks marks between 0-100: ");
		english_marks = sc.nextInt();
		if(english_marks<0 || english_marks>100)
		{
			System.out.println("Please Enter mathematics marks again : ");
			english_marks = sc.nextInt();	
		}
                
		System.out.println("Enter Hindi marks marks between 0-100: ");
		hindi_marks = sc.nextInt();
		if(hindi_marks<0 || hindi_marks>100)
		{
			System.out.println("Please Enter mathematics marks again : ");
			hindi_marks = sc.nextInt();	
		}
                
		System.out.println("Enter Science marks marks between 0-100: ");
		science_marks = sc.nextInt();
		if(science_marks<0 || science_marks>100)
		{
			System.out.println("Please Enter mathematics marks again : ");
			science_marks = sc.nextInt();	
		}
                
		System.out.println("Enter Social Science marks marks between 0-100: ");
		social_marks = sc.nextInt();
		if(social_marks<0 || social_marks>100)
		{
			System.out.println("Please Enter mathematics marks again : ");
			social_marks = sc.nextInt();	
		}
               System.out.println("Type true to caluculate percentage,total and grades : ");
               choice = sc.nextBoolean();
	       if(choice==true)
	{
		cal.percentage(maths_marks,english_marks,hindi_marks,science_marks,social_marks);
		}
		
                
    }
   }

    

