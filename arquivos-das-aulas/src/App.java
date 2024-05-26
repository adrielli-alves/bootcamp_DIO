import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String[] lista = { "a", "b", "c" };

        // Converter o array em um ArrayList
        List<String> listaArrayList = new ArrayList<>(Arrays.asList(lista));

        // Remover o elemento "c"
        listaArrayList.remove("c");

        // Converter o ArrayList de volta para um array
        lista = listaArrayList.toArray(new String[0]);

        // Imprimir o resultado
        System.out.println(Arrays.toString(lista));
    }
}
