import java.util.List;

public class sortowanieList {

public static void sortujListeRosnaco(List<Integer> lista) {
    if (lista != null && lista.size() > 1) {
        int rozmiar = lista.size();
        
        for (int i = 0; i < rozmiar - 1; i++) {
            int indeksMinimum = i;
            
            for (int j = i + 1; j < rozmiar; j++) {
                if (lista.get(j) < lista.get(indeksMinimum)) {
                    indeksMinimum = j;
                }
            }
            
            int temp = lista.get(i);
            lista.set(i, lista.get(indeksMinimum));
            lista.set(indeksMinimum, temp);
        }
    }
}
}