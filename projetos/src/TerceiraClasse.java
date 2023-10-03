public class TerceiraClasse {
    public static void main(String[] args) {
        /*Aplicação de operadores lógicos*/
        int idade = 18;
        if (idade >= 18){
           System.out.println("Ele é maior de idade!");
           /*E*/

        if (idade >=18 && idade != 0) {
            System.out.println("Ele é maior de idade!");
        }

           /*ou*/

        if (idade >18 || idade != 0) {
                System.out.println("Ele pode ser maior de idade, mas garantidamente existe!");
            }
           /*ternário*/
            /*condição de existêncio ? valor se for true : valor se for false*/

        boolean teste = (idade>=18) ? true : false;
        if (teste) {
            System.out.println("Ele é maior de idade!");
        }
        }
    }
}
