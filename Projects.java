import java.util.Scanner ;

public class Projects {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
int y;
y=in.nextInt() ;


while (true) {

y++ ;
int a =y/1000;
int b =(y/100)%10 ;
int c =(y/10)%10 ;
int d =y%10 ;




if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d) {
System.out.println(y);
break ;
}
}
in.close() ;
    }
}