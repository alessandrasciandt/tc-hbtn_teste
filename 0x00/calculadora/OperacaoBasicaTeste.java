public class OperacaoBasicaTeste {

    public static boolean testar_soma(){
        double verificarSoma = OperacaoBasica.somar(5,3);
        if(verificarSoma == 8){
            return true;
        }
        return false;
    }

    public static boolean testar_subtracao(){
        double verificarSubtracao = OperacaoBasica.subtrair(5,3);
        if(verificarSubtracao == 2){
            return true;
        }
        return false;
    }

    public static boolean testar_multiplicacao(){
        double verifcarMultiplicacao = OperacaoBasica.multiplicar(5,3);
        if(verifcarMultiplicacao == 15){
            return true;
        }
        return false;
    }

    public static boolean testar_divisao(){
        double verificarDivisao = OperacaoBasica.dividir(9,3);
        if(verificarDivisao == 3){
            return true;
        }
        return false;
    }
}
