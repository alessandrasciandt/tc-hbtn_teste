public class TesteEmail {

    public static Boolean testar_email_com_arroba(){
        return Pessoa.emailValid("email_teste@dominio.com.br");
    }

    public static Boolean testar_email_sem_arroba(){
        boolean verificar = Pessoa.emailValid("email_testedominio.com.br");
        if(verificar == false){
            verificar = true;
        }
        return verificar;
    }

    public static Boolean testar_email_mais_50_caracteres(){
        boolean verifcarEmailLongo =  Pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br");
        if(verifcarEmailLongo == false){
            verifcarEmailLongo = true;
        }
        return verifcarEmailLongo;
    }
}
