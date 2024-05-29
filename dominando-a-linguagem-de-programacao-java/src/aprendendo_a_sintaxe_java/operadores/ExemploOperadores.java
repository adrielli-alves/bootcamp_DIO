package aprendendo_a_sintaxe_java.operadores;
public class ExemploOperadores {
    public static void main(String[] args) {
        int numero = 6;
        System.out.println(numero);
        int numero2 = -6;
        System.out.println(-numero2);
        
        System.out.println(numero==numero2 ? "números iguais" : "números diferentes");
        System.out.println(numero==numero2 ? "números iguais" : numero>numero2 ? "numero 1 maior" : "número 2 maior");

        boolean variavel = true;
        System.out.println(variavel);
        System.out.println(!variavel);

        System.out.println("OI".equals("OI"));
        
        if (!(3>4)) {
            System.out.println("condição correta");
        }
    
    }
}
