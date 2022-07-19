public class Pessoa {

    public static Boolean emailValid(String email){
        if(email.contains("@") && email.length() <= 50){
            return true;
        }
        return false;
    }
}
