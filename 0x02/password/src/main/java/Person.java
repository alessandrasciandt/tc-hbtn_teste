import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

    private String usuario;
    private String senha;

    public Person(){}
    public Person(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean checkUser(){
       String REGEXVALIDAD = "((?!.*[@#$%^&-+=()]).{8,100}$)";
        Pattern pattern = Pattern.compile(REGEXVALIDAD);
        Matcher matcher = pattern.matcher(usuario);
        return matcher.matches();
    }

    public boolean checkPassword(){
        String REGEXVALIDAD = "((?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,100}$)";
        Pattern pattern = Pattern.compile(REGEXVALIDAD);
        Matcher matcher = pattern.matcher(senha);
        return matcher.matches();
    }
}
