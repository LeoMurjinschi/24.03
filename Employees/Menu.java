package Employees;
import java.util.Scanner;
public class Menu {
    public static void meniu_Principal()
    {
        String pause=null;
        int ras=0;
        Scanner in = new Scanner(System.in);
        while(true)
        {

            System.out.println("\t\tOptiuni:\n\n");
            System.out.println("1. Introducere angajat nou!");
            System.out.println("2. Stergere angajat!");
            System.out.println("3. Citire angajati!");
            System.out.println("4. Editare angajat!");
            System.out.println("5. Parasire program!");
            System.out.println("\n\nAlegeti o optiune:");
            ras=in.nextInt();

            System.out.print("\033[H\033[2J");
            System.out.flush();
            switch(ras)
            {
                case 1:
                {
                    //Meniu introducere angajati
                    break;
                }
                case 2:
                {
                    //Meniu citire angajati+Logica de stergere
                    break;
                }
                case 3:
                {
                    //Meniu citire angajati
                    break;
                }
                case 4:
                {
                    //Meniu citire angajati+Logica de editare
                    break;
                }
                case 5:
                {
                    System.out.println("Ati parasit programul!");
                    System.exit(0);
                }
                default:
                {
                    System.out.println("Optiunea selectata de dumneavoastra nu exista!");
                    System.out.println("Va rugam sa selectati o varianta posibila din cele prezentate!");
                    System.out.println("\nPentru a continua apasati orice tasta...");
                    pause=in.nextLine();
                }
            }
        }
    }


  //  System.out.print("\033[H\033[2J");

}
