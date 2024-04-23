package Employees;

public class Employee{
    private int Id;
    private String nume;
    private String prenume;
    private String idnp;
    private String departament;
    private double salariu;
    private String functie;

    public Employee(int id, String nume, String prenume, String IDNP, String departament, double salariu, String functie) {
        Id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.idnp = IDNP;
        this.departament = departament;
        this.salariu = salariu;
        this.functie = functie;
    }

    public Employee(){

    }


    // GET
    public int getId() {return Id;}
    public String getPrenume() {return prenume;}
    public String getNume() {
        return nume;
    }
    public String getIDNP() {
        return idnp;
    }
    public String getDepartament() {
        return departament;
    }
    public double getSalariu() {
        return salariu;
    }
    public String getFunctie() {
        return functie;
    }

    //SET
    public void setId(int id) {Id = id;}
    public void setNume(String nume) {
        this.nume = nume;
    }
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    public void setIDNP(String idnp) {
        this.idnp = idnp;
    }
    public void setDepartament(String departament) {
        this.departament = departament;}
    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }
    public void setFunctie(String functie) {
        this.functie = functie;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", Nume='" + nume + '\'' +
                ", Prenume='" + prenume + '\'' +
                ", IDNP='" + idnp + '\'' +
                ", Departament='" + departament + '\'' +
                ", Salariu=" + salariu +
                ", Functie='" + functie + '\'' +
                '}';
    }
}
