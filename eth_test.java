import java.util.*;
class eth_test
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int year=0,month=0,day=0, no_days;
        int daytemp=day,yeartemp=year,monthtemp=month,yeardiff=0,leap=0;
        boolean isAC=false, c=false;
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
            if(year<=2020)
            {
                for(;yeartemp<2020;yeartemp++)
                {
                    no_days=no_days+365;

                    if(year % 4 == 0)
                    {
                        if( year % 100 == 0)
                        {
                            if ( year % 400 == 0)
                                leap++;
                            else
                                ;
                        }
                        else
                            leap++;
                    }
                    else 
                    {
                        ;
                    }
                }
            }
            else
            {
                for(;yeartemp>2020;yeartemp--)
                {
                    no_days=no_days+365;
                    if(year % 4 == 0)
                    {
                        if( year % 100 == 0)
                        {
                            if ( year % 400 == 0)
                                leap++;
                            else
                                ;
                        }
                        else
                            leap++;
                    }
                    else 
                    {
                        ;
                    }
                }
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
                yeartemp=year;
                if(year<=2020)
                {
                    for(;yeartemp<2020;yeartemp--)
                    {
                        if(year % 4 == 0)
                        {
                            if( year % 100 == 0)
                            {
                                if ( year % 400 == 0)
                                    if (c=false)
                                    {
                                        no_days=no_days-(29-day);
                                        c=true;
                                    }
                                    else
                                    if (c=false)
                                    {
                                        no_days=no_days-(28-day);
                                        c=true;
                                    }
                            }
                            else
                            {
                                if (c=false)
                                {
                                    no_days=no_days-(29-day);
                                    c=true;
                                }                                
                            }
                        }
                        else 
                        {
                            if (c=false)
                            {
                                no_days=no_days-(28-day);
                                c=true;
                            }
                        }
                    }
                }
                else
                {
                    for(;yeartemp>2020;yeartemp++)
                    {
                        if(year % 4 == 0)
                        {
                            if( year % 100 == 0)
                            {
                                if ( year % 400 == 0)
                                    no_days=no_days-(29-day);
                                else
                                    no_days=no_days-(28-day);
                            }
                            else
                                no_days=no_days-(29-day);
                        }
                        else 
                        {
                            no_days=no_days-(28-day);
                        }                    
                    }
                }
                break;
                case 1:
                no_days=no_days-(31-day);
            }

            System.out.println("No of days:"+no_days);
        }

        while(true);
    }
}
