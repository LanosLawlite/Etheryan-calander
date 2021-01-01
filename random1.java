import java.util.*;
class random1
{
    public static void main()
    {
        while(true)
        {
            Scanner sc=new Scanner(System.in);
            int year=0,month=0,day=0;
            System.out.print("enter Year:");
            year=sc.nextInt();
            System.out.print("enter Month:");
            month=sc.nextInt();
            System.out.print("enter Day:");
            day=sc.nextInt();
            int no_years=0;
            if(year<2021)
            {
                for(no_years=0;no_years<(2021-year);no_years++)
                {
                }
            }
            else
            {
                for(no_years=0;no_years<(year-2021);no_years++)
                {
                }
            }  
            System.out.println("no. of years:"+no_years);
        }}
}
 