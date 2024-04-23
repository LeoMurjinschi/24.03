package Employees;
import java.util.Scanner;
public class Menu extends Demo{
    public static void meniu_Principal() {
        int ras = 0;
        Scanner in = new Scanner(System.in);
        while (true) {

            System.out.println("\n\n\n\n\t\tOptiuni:\n\n");
            System.out.println("1. Introducere angajat nou!");
            System.out.println("2. Stergere angajat!");
            System.out.println("3. Citire angajati!");
            System.out.println("4. Editare angajat!");
            System.out.println("5. Parasire program!");
            System.out.println("\n\nAlegeti o optiune:");
            ras = in.nextInt();


            switch (ras) {
                case 1: {
                    Operatii.employeeInsert();
                    break;
                }
                case 2: {
                    if(emp.size()!=0)
                    {
                        Operatii.employeeRead();
                        Operatii.employeeDelete();
                    }
                    else
                    {
                        System.out.println("Nu a fost introdus inca nici un angajat!");
                    }
                    break;
                }
                case 3: {
                    if(emp.size()!=0)
                    {
                        Operatii.employeeRead();
                    }
                    else
                    {
                        System.out.println("Nu a fost introdus inca nici un angajat!");
                    }
                    break;
                }
                case 4: {
                    if(emp.size()!=0)
                    {
                        Operatii.employeeRead();
                        Operatii.employeeEdit();
                    }
                    else
                    {
                        System.out.println("Nu a fost introdus inca nici un angajat!");
                    }
                    break;
                }
                case 5: {
                    System.out.println("Ati parasit programul!");
                    System.exit(0);
                }
                default: {
                    System.out.println("Optiunea selectata de dumneavoastra nu exista!");
                    System.out.println("Va rugam sa selectati o varianta posibila din cele prezentate!");
                    break;
                }
            }
        }
    }

}
