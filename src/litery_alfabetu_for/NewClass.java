package litery_alfabetu_for;

public class NewClass {

    public static void main(String[] arg)
    {
        char znak;

        System.out.println("Program wyswietla duze litery alfabetu A-Z i Z-A.");

        for (znak = 'A'; znak <= 'Z'; znak++)
        {
            if (znak < 'Z')
                System.out.print(znak + "\t");
            else
                System.out.print(znak + ".\n");
        }
        for (znak = 'Z'; znak >= 'A'; znak--)
        {
            if (znak > 'A')
                System.out.print(znak + "\t");
            else
                System.out.print(znak + ".");
        }
    }
}
