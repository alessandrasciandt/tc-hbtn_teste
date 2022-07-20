import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonTest {

    private String name;
    private String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private float salary;
    private Person person;
    SimpleDateFormat bir = new SimpleDateFormat("yyyy");


    @BeforeEach
    void setUp() throws Exception{
        name = "Paul";
        surname = "McCartney";
        birthDate = bir.parse("2000");
        anotherCompanyOwner = true;
        pensioner = true;
        publicServer = true;
        salary = 1200;
        person = new Person(name, surname, birthDate, anotherCompanyOwner, pensioner, publicServer, salary);
    }

    @Test
    void show_full_name(){
        String nome = person.fullName();
        Assertions.assertEquals("Paul McCartney", nome);
    }

    @Test
    void test_calculateYearlySalary(){
        float salarioMensal = person.calculateYearlySalary();
        Assertions.assertEquals(14400, salarioMensal);
    }

    @Test
    void person_is_MEI(){
        Person pessoaMei = new Person(name, surname, birthDate, false, false, false, salary);
        boolean verificarPessoa = pessoaMei.isMEI();
        Assertions.assertTrue(verificarPessoa);
    }

    @Test
    void person_is_not_MEI(){
        boolean pessoaMei = person.isMEI();
        Assertions.assertFalse(pessoaMei);
    }



}
