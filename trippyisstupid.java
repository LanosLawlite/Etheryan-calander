







import java.util.*;
class trippyisstupid
{
    

    public static void main (String [] args){

        Scanner userInput = new Scanner(System.in);

        int TodayYear, TodayMonth, TodayDay;
        int YearBorn, MonthBorn, DayBorn;
        int DaysAlive;

        System.out.println("Enter today's date");
        System.out.print ("Year: ");
        TodayYear = userInput.nextInt ();
        System.out.print ("Month: ");
        TodayMonth = userInput.nextInt ();
        System.out.print ("Day: ");
        TodayDay = userInput.nextInt ();

        System.out.println("Enter date of birth");
        System.out.print ("Year: ");
        YearBorn = userInput.nextInt ();
        System.out.print ("Month: ");
        MonthBorn = userInput.nextInt ();
        System.out.print ("Day: ");
        DayBorn = userInput.nextInt ();

        //I think this line is the problem 
        DaysAlive = (TodayYear - YearBorn) *365 + (TodayMonth - MonthBorn) *30 +(TodayDay - DayBorn);

        System.out.println("DaysAlive: " + DaysAlive);
    }
}
