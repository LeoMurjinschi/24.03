package Employees;

public class Employee{
    private int Id;
    private String Nume;
    private String Prenume;
    private String IDNP;
    private String Departament;
    private double Salariu;
    private String Functie;

    public Employee(int id, String nume, String prenume, String idnp, String departament, String functie, double salariu) {
    }

    public Employee(){

    }


    // GET
    public int getId() {return Id;}
    public String getPrenume() {return Prenume;}
    public String getNume() {
        return Nume;
    }
    public String getIDNP() {
        return IDNP;
    }
    public String getDepartament() {
        return Departament;
    }
    public double getSalariu() {
        return Salariu;
    }
    public String getFunctie() {
        return Functie;
    }

    //SET
    public void setId(int id) {Id = id;}
    public void setNume(String nume) {
        Nume = nume;
    }
    public void setPrenume(String prenume) {
        Prenume = prenume;
    }
    public void setIDNP(String idnp) {
        IDNP = idnp;
    }
    public void setDepartament(String departament) {Departament = departament;}
    public void setSalariu(double salariu) {
        Salariu = salariu;
    }
    public void setFunctie(String functie) {
        Functie = functie;
    }




}
