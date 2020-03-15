import java.util.Scanner;
public class KaganProgrammingProject1A
{
   public static void main(String[] args)
   { 
   
   Scanner in = new Scanner(System.in);
   System.out.println("Please give me a four-digit year: "); 
   int year = in.nextInt();
   boolean flag = false;
   
   if (year > 1582)
   {
      flag = true;
   }   
   else if (year < 1582)
   {
      flag = false;
   }
   else if (year % 400 == 0)
   {
      flag = true; 
   }
   else if (year % 4 == 0)
   {
      flag = true;
   }
   else if (year % 100 != 0)
   {
      flag = true;
   }

   if (flag = true)
   {
      System.out.println(+year+" is a leap year.");
   }
   else
   {
      System.out.println(+year+" is NOT a FUCKING LEAP YEAR.");
   }
   
   }
}