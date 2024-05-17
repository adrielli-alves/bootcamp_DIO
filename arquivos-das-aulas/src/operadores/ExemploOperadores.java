package operadores;
public class ExemploOperadores {
    public static void main(String[] args) {
        int numero = 6;
        System.out.println(numero);
        int numero2 = -6;
        System.out.println(-numero2);
        
        System.out.println(numero==numero2 ? "números iguais" : "números diferentes");

        boolean variavel = true;
        System.out.println(variavel);
        System.out.println(!variavel);

        System.out.println("OI".equals("OI"));
        
        if (!(3>4)) {
            System.out.println("condição correta");
        }
    
    }
}
