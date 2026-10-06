import java.util.Scanner;

public class Play_Max_Min_Avg {
public static void main(String[] args){

float x , y , z , a , b , max , min , avg ;
Scanner in = new Scanner(System.in);

x=in.nextFloat();
y=in.nextFloat();
z=in.nextFloat();
a=in.nextFloat();
b=in.nextFloat();
max = x ;

if(max<y)
max=y ;
if(max<z)
max=z ;
if(max<a)
max=a ;
if(max<b)
max=b ;
System.out.println("The maximum number is : " + max);

min = x ;
if(min>y)
min=y ;
if(min>z)
min=z ;
if(min>a)
min=a ;
if(min>b)
min=b ;
System.out.println("The minimum number is : " + min);
avg = (x + y + z + a + b) / 5 ;
System.out.println("The average of the numbers is : " + avg);
in.close();
}
}
