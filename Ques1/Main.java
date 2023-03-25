import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        MyBook new_novel=new MyBook();
        new_novel.setTitle(sc.nextLine());
        System.out.println(new_novel.getTitle());
    }
}