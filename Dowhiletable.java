package HomeWorkjava3_7;

public class Dowhiletable
{
    public static void main(String[] args)
    {
        int i=1,j=6,n;
        System.out.println("Table of 6");
        do
        {
            n=i*j;
            System.out.println(j + "*"+ i + " = " + n);
            i++;
        }while (i<=10);
    }
}
