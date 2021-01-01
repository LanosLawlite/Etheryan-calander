import java.util.*;

class years
{

    void main()
    {
        Scanner sc=new Scanner(System.in);
        int days, leap=0,k=0,years=0, temp=0,tempy=0;
        do
        {
            System.out.print("enter days:");
            days=sc.nextInt();
            leap=0;
            temp=days; 
            tempy=days/365;
            for(k=0;k<=tempy;)
            {
                k++;
                if(k%4==0)//
                {
                    leap++;
                    temp--;

                }
            }
            
            years=temp/365;
            System.out.println("years:"+years);
            System.out.println("leap:"+leap);

            System.out.println("temp:"+temp);
        }while(true);
    }
}
