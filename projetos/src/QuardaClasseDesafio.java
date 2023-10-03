public class QuardaClasseDesafio {
    public static void main(String[] args) {
        double firstDouble = 20.00, secondDouble = 80.00, result = 0;
        result = (firstDouble + secondDouble)*100.00;
        System.out.println("O primeiro resultado é: "+result);
        double confere = result%40.00;
        System.out.println("O segundo resultado é: "+confere);
        boolean eDivisivel;
        eDivisivel = (confere == 0.0);
        if(eDivisivel) {
            System.out.println("Sem resto");
        }
        else {
            System.out.println("Possui resto sim");
        }
    }
}
