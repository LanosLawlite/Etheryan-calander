import java.util.*;
class fallthru
{
    void main()
    {
        int month=0,no_days=0,year=0,day=0;
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
    }
}