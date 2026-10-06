import java.util.Scanner;
public class array_Max_Min_Avg {
    public static void main (String[]args){
Scanner in = new Scanner(System.in);
int array[] = new int[5];
int sum , max , min ;

sum = 0;
max = array[0];
min = array[0];
for(int i = 0 ; i < array.length ; i++){
System.out.println("Enter number " + (i+1) + " : ");
array[i] = in.nextInt();
if(max<array[i])
    max=array[i];
if(min>array[i])
    min=array[i];
sum = sum + array[i];
}
 double avg = sum / array.length;

System.out.println("The maximum number is : " + max);
System.out.println("The minimum number is : " + min);
System.out.println("The average number is : " + avg);
in.close();
}
}
