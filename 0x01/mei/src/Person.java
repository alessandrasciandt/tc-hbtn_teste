import java.util.Calendar;
import java.util.Date;

public class Person {

    private String name;
    private String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private float salary;

    public Person(String name, String surname, Date birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer, float salary) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pensioner = pensioner;
        this.publicServer = publicServer;
        this.salary = salary;
    }

    public String fullName(){
        return name + " " + surname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float calculateYearlySalary(){
        return salary = salary * 12;
    }

    public boolean maiorIdade(){
        Date data = new Date();
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(data);
        int anoAtual = calendario.get(Calendar.YEAR);
        //Calendar calendarioDois = Calendar.getInstance();
        calendario.setTime(birthDate);
        int anoDeNascido = calendario.get(Calendar.YEAR);
        int idade = anoAtual - anoDeNascido;
        if(idade > 18){
            return true;
        }
        return false;
    }

    public boolean isMEI(){
        if((calculateYearlySalary() <= 130000) && (maiorIdade() == true) && (anotherCompanyOwner== false) && (pensioner == false)
            && (publicServer == false)){
            return true;
        }return false;
    }
}
