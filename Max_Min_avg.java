//كود لحساب الماكس والميني والافريج ل 5 ارقام
import java.util.Scanner;
// تعريف الدوال الرياضيه زي الماكس والميني
import static java.lang.Math.*;
public class Max_Min_avg {
//دي فانكشن لحساب الافريج
    static float avg(float n1, float n2, float n3 , float n4 ,float n5) {
        float sum=n1+n2+n3+n4+n5 ;
        float avgNum= sum/5 ;
       return avgNum ;
    }
    public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   float x , y , z , a , b  ;
System.out.println("Enter 1 # ");
   x = in.nextFloat();

   System.out.println("Enter 2 # ");
   y = in.nextFloat();

   System.out.println("Enter 3 # ");
   z = in.nextFloat();

   System.out.println("Enter 4 # ");
   a = in.nextFloat();

   System.out.println("Enter 5 # ");
   b = in.nextFloat();
//دي بقا الماكس والميني بالشكل دا عشان تقارن بين 5 ارقام
   System.out.println("max # :  " + max(max(max(max(x,y),z),a),b));
   System.out.println("min # :  " + min(min(min(min(x,y),z),a),b));
   System.out.println("avg # :  " + avg(x,y,z,a,b));

in.close();



















    }

   










}
