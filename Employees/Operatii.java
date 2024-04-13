package Employees;
import java.util.Scanner;

public class Operatii extends Demo {

    public static void employee_Insert()
    {
        try
        {

            String nume=null, prenume=null, idnp=null, departament=null, functie=null;
            double salariu=0;
            int id=0;
            Scanner in = new Scanner(System.in);

            System.out.println("\n\n\n\n\nIntroduceti id-ul angajatului:");
            id=in.nextInt();
            System.out.println("Introduceti numele angajatului:");
            nume=in.nextLine();
            System.out.println("Introduceti prenumele angajatului:");
            prenume=in.nextLine();
            System.out.println("Introduceti idnp-ul angajatului:");
            idnp=in.nextLine();
            System.out.println("Introduceti departamentul angajatului:");
            departament=in.nextLine();
            System.out.println("Introduceti functia angajatului:");
            functie=in.nextLine();
            System.out.println("Introduceti salariul angajatului:");
            salariu=in.nextDouble();

            Employee a = new Employee(id,nume,prenume,idnp,departament,functie,salariu);
            emp.add(a);
        }
        catch (Exception ex)
        {
            System.out.println("\n\n\nDatele nu au fost introduse corect!");
        }
    }

    public static void employee_Read()
    {
        System.out.println("\n\n\n\nAngajatii: ");
        for (int i = 0; i < emp.size(); i++) {
            System.out.println("Id: " + emp.get(i).getId() + " Nume: " + emp.get(i).getNume() + " Prenume: " + emp.get(i).getPrenume() + " IDNP: " + emp.get(i).getIDNP() +
                    " Departament: " + emp.get(i).getDepartament() + " Functia: " + emp.get(i).getFunctie() + " Salariu: " + emp.get(i).getSalariu());
        }
    }

    public static void employee_Delete()
    {
        try
        {
            int i=0,k=0;
            Scanner in = new Scanner(System.in);
            System.out.println("\n\n\nIntroduceti id-ul utilizatorului pe care doriti sa il stergeti: ");
            i=in.nextInt();
            for (int j = 0; j < emp.size(); j++) {
                if(emp.get(j).getId()==i)
                {
                    k=j;
                    break;
                }
            }
            emp.remove(k);
        }
        catch(Exception ex)
        {
            System.out.println("\n\nDatele nu au fost introduse corect!");
        }
    }

    public static void employee_Edit()
    {
        try
        {
            int i=0,k=0;
            Scanner in = new Scanner(System.in);
            System.out.println("\n\n\nIntroduceti id-ul utilizatorului pe care doriti sa il stergeti: ");
            i=in.nextInt();
            for (int j = 0; j < emp.size(); j++) {
                if(emp.get(j).getId()==i)
                {
                    k=j;
                    break;
                }
            }
            System.out.println("\n\n\t\tOptiuni:");
            System.out.println("1.Editarea numelui");
            System.out.println("2.Editarea prenumelui");
            System.out.println("3.Editarea IDNP-ului");
            System.out.println("4.Editarea departamentului");
            System.out.println("5.Editarea functiei");
            System.out.println("6.Editarea salariului");
            int a = in.nextInt();
            String ras;
            switch(a)
            {
                case 1:
                {
                    System.out.println("\n\nIntroduceti numele:");
                    ras=in.nextLine();
                    emp.get(k).setNume(ras);
                    break;
                }
                case 2:
                {
                    System.out.println("\n\nIntroduceti prenumele:");
                    ras=in.nextLine();
                    emp.get(k).setPrenume(ras);
                    break;
                }
                case 3:
                {
                    System.out.println("\n\nIntroduceti IDNP-ul:");
                    ras=in.nextLine();
                    emp.get(k).setIDNP(ras);
                    break;
                }
                case 4:
                {
                    System.out.println("\n\nIntroduceti departamentul:");
                    ras=in.nextLine();
                    emp.get(k).setDepartament(ras);
                    break;
                }
                case 5:
                {
                    System.out.println("\n\nIntroduceti functia:");
                    ras=in.nextLine();
                    emp.get(k).setFunctie(ras);
                    break;
                }
                case 6:
                {
                    System.out.println("\n\nIntroduceti salariul:");
                    double sal = in.nextDouble();
                    emp.get(k).setSalariu(sal);
                    break;
                }
                default:
                {
                    System.out.println("\n\nNu exista asa optiune!\n\n\n");
                    Operatii.employee_Edit();
                    break;
                }
            }
        }
        catch(Exception ex)
        {
            System.out.println("\n\nDatele nu au fost introduse corect!");
        }
    }

}
