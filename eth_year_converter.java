import java.util.*;
class eth_year_converter
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int year=0,month=0,day=0, no_days;
        int daytemp=day,yeartemp=year,monthtemp=month,yeardiff=0;
        boolean isAC=false;
        do
        {
            System.out.print("enter Year:");
            year=sc.nextInt();
            if(year<2020)
                isAC=false;
            else
                isAC=true;
            System.out.print("enter Month:");
            month=sc.nextInt();
            System.out.print("enter Day:");
            day=sc.nextInt();
            no_days=0;

            switch (month)
            {
                case 12:
                no_days=no_days+31;
                case 11:
                no_days=no_days+30;
                case 10:
                no_days=no_days+31;
                case 9:
                no_days=no_days+30;
                case 8:
                no_days=no_days+31;
                case 7:
                no_days=no_days+31;
                case 6:
                no_days=no_days+30;
                case 5:
                no_days=no_days+31;
                case 4:
                no_days=no_days+30;
                case 3:
                no_days=no_days+31;
                case 2:
                no_days=no_days+28;
                if(year%4==0)
                {
                    if( year%100==0)
                    {
                        if ( year%400==0)
                            no_days++;
                    }
                    else
                        no_days++;
                }
                case 1:
                no_days=no_days+31;
            }
            switch (month)
            {
                case 12:
                no_days=no_days-(31-day);
                break;
                case 11:
                no_days=no_days-(30-day);
                break;
                case 10:
                no_days=no_days-(31-day);
                break;
                case 9:
                no_days=no_days-(30-day);
                break;
                case 8:
                no_days=no_days-(31-day);
                break;
                case 7:
                no_days=no_days-(31-day);
                break;
                case 6:
                no_days=no_days-(30-day);
                break;
                case 5:
                no_days=no_days-(31-day);
                break;
                case 4:
                no_days=no_days-(30-day);
                break;
                case 3:
                no_days=no_days-(31-day);
                break;
                case 2:
                if(day==30)
                    no_days=no_days-(30-day);
                else
                    no_days=no_days-(29-day);
                break;
                case 1:
                no_days=no_days-(31-day);
            }

            if(year%4==0)
            {
                if( year%100==0)
                {
                    if ( year%400==0)
                        no_days=366-no_days;
                }
                else
                    no_days=366-no_days;
            }
            else
                no_days=365-no_days;

            yeartemp=year;
            if(year<2021)
            {
                for (;yeartemp<2020;yeartemp++)                   // year is <2021
                {
                    if(year%4==0)
                    {
                        if( year%100==0)
                        {
                            if ( year%400==0)
                                no_days=no_days+366;
                        }
                        else
                            no_days=no_days+366;
                    }
                    else 
                        no_days=no_days+365;
                }

            }
            else
            {
                for (;yeartemp>2020;yeartemp--)                   // year is >2021
                {
                    if(year%4==0)
                    {
                        if( year%100==0)
                        {
                            if ( year%400==0)
                                no_days++;
                        }
                        else
                            no_days++;
                    } 
                    no_days=no_days+365;
                }
            }
            if(year<2020)
                ++no_days;
            System.out.print(no_days);
        }while(true);
    }
}
