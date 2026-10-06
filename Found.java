
//الكود دا اليوزر بيدخل قيمتان للمصفوفه القيمه الاولي دي بتكون القيمه 
//الرابعه في المصفوفه بعد كدا بيدخل الرقم ويشوف هل الرقم دا جوه المصفوفه ولا لا 
import java.util.Scanner;
public class Found {
public static void main(String[]args){
int array[]={1,2,3,4,5};
boolean f=false;
Scanner in = new Scanner(System.in);
int x = in.nextInt();
array[4]=in.nextInt();
for(int i=0;i<array.length;i++){
if(array[i]==x){
f=true;
break;
}
}
if(f)
System.out.println("Found");

else
System.out.println("Not Found");


in.close(); 
}
}









