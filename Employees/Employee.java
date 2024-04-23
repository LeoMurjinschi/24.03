package Employees;

public class Employee{
    private int Id;
    private String nume;
    private String Prenume;
    private String IDNP;
    private String Departament;
    private double Salariu;
    private String Functie;

    public Employee(int id, String nume, String prenume, String IDNP, String departament, double salariu, String functie) {
        Id = id;
        this.nume = nume;
        Prenume = prenume;
        this.IDNP = IDNP;
        Departament = departament;
        Salariu = salariu;
        Functie = functie;
    }

    public Employee(){

    }


    // GET
    public int getId() {return Id;}
    public String getPrenume() {return Prenume;}
    public String getNume() {
        return nume;
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
        this.nume = nume;
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


    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", Nume='" + nume + '\'' +
                ", Prenume='" + Prenume + '\'' +
                ", IDNP='" + IDNP + '\'' +
                ", Departament='" + Departament + '\'' +
                ", Salariu=" + Salariu +
                ", Functie='" + Functie + '\'' +
                '}';
    }
}
