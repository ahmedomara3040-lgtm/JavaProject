

import java.util.Scanner;

public class Main {

  static float max(float n1, float n2, float n3 , float n4 ,float n5) {
       float maxnum=n1 ;

       if(maxnum<n2)
        maxnum=n2 ;

       if(maxnum<n3)
        maxnum=n3 ;

       if(maxnum<n4)
        maxnum=n4 ;

       if(maxnum<n5)
        maxnum=n5 ;
      return maxnum ;
    }

static float min(float n1, float n2, float n3 , float n4 ,float n5) {
       float minNum=n1 ;

       if(minNum>n2)
        minNum=n2 ;

       if(minNum>n3)
        minNum=n3 ;

       if(minNum>n4)
        minNum=n4 ;

       if(minNum>n5)
        minNum=n5 ;
      return minNum;
    } 

    static float avg(float n1, float n2, float n3 , float n4 ,float n5) {
       float sum=n1+n2+n3+n4+n5 ;
       float avgNum= sum/5 ;
      return avgNum ;
       
    } 


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x , y , z , a , b;
        System.out.println("Enter 1 # ");
        x=in.nextFloat();

       System.out.println("Enter 2 # ");
        y=in.nextFloat();

       System.out.println("Enter 3 # ");
        z=in.nextFloat(); 

       System.out.println("Enter 4 # ");
        a=in.nextFloat(); 
        
       System.out.println("Enter 5 # ");
        b=in.nextFloat();

      System.out.println(" max is "  +  max(x,y,z,a,b));
      System.out.println(" min is "  + min(x,y,z,a,b));
      System.out.println(" avg is "  + avg(x,y,z,a,b));







        in.close();
    }
}