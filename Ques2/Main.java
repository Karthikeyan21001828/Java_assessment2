import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        MyCalculator calc=new MyCalculator();
        Scanner sc=new Scanner(System.in);
        int sum=calc.divisor_sum(sc.nextInt());
        System.out.println("The Sum is: "+sum);
    }
}