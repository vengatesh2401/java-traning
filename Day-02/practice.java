import java.util.*;
public class practice {
    public static void main(String[] args){
        Scanner w = new Scanner(System.in);
       int a = w.nextInt();
       a =a*30;
       int b = a*30*12;
       System.out.println("Salary Calculation:"+a+ " "+ "Year:"+b);

       int c =w.nextInt();
       c=(c*9/5)+32;
       System.out.println("Farientheat:"+c);

       int h = w.nextInt();
       h=h*3600;
       System.out.println("Seconds:"+h);

       int g = w.nextInt();
       int l = w.nextInt();
       boolean k =(g>=750&l>=10000);
       System.out.println("Loan Approval:"+k);

       int a= w.nextInt();
       int b= w.nextInt();
       int c= w.nextInt();
       int d= w.nextInt();
       int e= w.nextInt();
       float f =(a+b+c+d+e)/5;
       System.out.println("Average Mark:"+f);


       int a = w.nextInt();
       int b = w.nextInt();
       int c = a*(b/5);
       System.out.println(c);


    }
}
