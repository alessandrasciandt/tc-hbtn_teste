import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonTest {

    private static Person person;

    @BeforeAll
    void setup()throws Exception{
        person = new Person("Alessandra", "@1237A");
    }

    @ParameterizedTest
    @ValueSource(strings = {"PaulMcCartney2", "NeilArms2"})
    void check_user_valid(String usuario){
        person.setUsuario(usuario);
        boolean verificar = person.checkUser();
        Assertions.assertTrue(verificar);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Paul#McCartney", "Neil@Arms"})
    void check_user_not_valid(String usuario){
        person.setUsuario(usuario);
        boolean verificar = person.checkUser();
        Assertions.assertFalse(verificar);
    }

    @ParameterizedTest
    @ValueSource(strings = {"123456789", "#$%1234"})
    public void does_not_have_letters(String senha) {
        person.setSenha(senha);
        boolean verificar = person.checkPassword();
        Assertions.assertFalse(verificar);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Abcabcdefgh@", "#hbtn@%tc"})
    public void does_not_have_numbers(String senha) {
        person.setSenha(senha);
        boolean verificar = person.checkPassword();
        Assertions.assertFalse(verificar);
    }
    @ParameterizedTest
    @ValueSource(strings = {"Abc@123", "12$@hbt"})
    public void does_not_have_eight_chars(String senha) {
        person.setSenha(senha);
        boolean verificar = person.checkPassword();
        Assertions.assertFalse(verificar);
    }

    @ParameterizedTest
    @ValueSource(strings = {"abC123456$", "Hbtn@1234", "Betty@1#2", "Hbtn@123"})
    public void check_password_valid(String senha) {
        person.setSenha(senha);
        boolean verificar = person.checkPassword();
        Assertions.assertTrue(verificar);
    }

}
