package edu.adrielli.primeirasemana;
public class MinhaClasse {
    public static void main(String [] args) throws Exception {
        String primeiroNome = "Adrielli";
        String segundoNome = "Alves";
        System.out.println(primeiroNome);

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
        
        
        int anoNascimento = 2000;
        boolean casada = true;
        anoNascimento = 2002;
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Casada: " + casada);
        

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Nome completo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}