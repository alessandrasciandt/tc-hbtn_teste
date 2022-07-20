import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteEmail {

    private String emailComArroba;
    private String emailSemArroba;
    private String emailMais50;

    @BeforeEach
    void setUp() throws Exception{
        emailComArroba = "email_teste@dominio.com.br";
        emailSemArroba = "email_testedominio.com.br";
        emailMais50 = "email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br";
    }

    @Test
    void estar_email_com_arroba(){
        boolean aux = Pessoa.emailValid(emailComArroba);
        Assertions.assertTrue(aux);
    }

    @Test
    void testar_email_sem_arroba(){
        boolean aux = Pessoa.emailValid(emailSemArroba);
        Assertions.assertFalse(aux);
    }

    @Test
    void testar_email_mais_50_caracteres(){
        boolean aux = Pessoa.emailValid(emailMais50);
        Assertions.assertEquals(false, aux);
    }
}
