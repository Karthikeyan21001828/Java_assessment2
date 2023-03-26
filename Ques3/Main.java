public class Main
{
    public static void main(String[] args)
    {
        Sports obj1=new Sports();
        Sports obj2=new Soccer();
        System.out.println(obj1.getName());
        obj1.getNumberOfTeamMembers();
        System.out.println(obj2.getName());
        obj2.getNumberOfTeamMembers();
    }
}