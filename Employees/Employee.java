package Employees;

public class Employee {

    private String Nume;
    private String Prenume;
    private String IDNP;
    private String Departament;
    private double Salariu;
    private String Functie;

    // GET
    public String getPrenume() {
        return Prenume;
    }
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
    public void setNume(String nume) {
        Nume = nume;
    }
    public void setPrenume(String prenume) {
        Prenume = prenume;
    }
    public void setIDNP(String idnp) {
        IDNP = idnp;
    }
    public void setDepartament(String departament) {
        Departament = departament;
    }
    public void setSalariu(double salariu) {
        Salariu = salariu;
    }
    public void setFunctie(String functie) {
        Functie = functie;
    }
}
