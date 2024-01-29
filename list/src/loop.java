import java.util.ArrayList;
import java.util.List;

public class loop {


    public static void main(String[] args) {
    
    
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
    
        lista1.add(1);
        lista1.add(12);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);
    
        lista2.add(2);
        lista2.add(22);
        lista2.add(5);
        lista2.add(6);
    
        System.out.println("Lista numer 1: " + lista1);
        System.out.println("Lista numer 2: " + lista2);
    
        sortowanieList.sortujListeRosnaco(lista1);
        sortowanieList.sortujListeRosnaco(lista2);
    
        System.out.println("Posortowana lista 1: " + lista1);
        System.out.println("Posortowana lista 2: " + lista2);
    }
}






















    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    






/*    List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        lista1.add(1);
        lista1.add(12);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);

        lista2.add(2);
        lista2.add(22);
        lista2.add(5);
        lista2.add(6);

        System.out.println("Lista numer 1" + " " + lista1);
        System.out.println("Lista numer 2" + " " + lista2);

        int rozmiar = lista1.size();

        for (int i = 0; i < rozmiar - 1; i++) {
            int indeksMinimum = i;

            for (int j = i + 1; j < rozmiar; j++) {
                if (lista1.get(j) < lista1.get(indeksMinimum)) {
                    indeksMinimum = j;
                }
            }
            int temp = lista1.get(i);
            lista1.set(i, lista1.get(indeksMinimum));
            lista1.set(indeksMinimum, temp);
        }
        int rozmiar1 = lista2.size();
    
        for (int i = 0; i <rozmiar1 - 1 ; i++) {
            int indeksMinimum = i;
            
            for (int j = i +1; j< rozmiar1; j++) {
                if (lista2.get(j) < lista2.get(indeksMinimum)) {
                    indeksMinimum = j;
                }
            }
            int temp = lista2.get(i);
            lista2.set(i, lista2.get(indeksMinimum));
            lista2.set(indeksMinimum, temp);
            
            }
        System.out.println("Posortowana lista 1: " + lista1);
        System.out.println("Posortowana lista 2: " + lista2);
        }
    }*/


    /*    for (Object element : lista1) {
        if (!lista2.contains(element)) {
                System.out.println("Lista 1 zawiera element, który nie występuje w liście 2: " + element);
            }
        }
        for (Object element : lista2) {
            if (!lista1.contains(element)) {
                lista1.add((Integer) element);
                System.out.println("Lista 2 zawiera element, który nie występuje w liście 1: " + element);
            }
        }

        for (int i = 0; i < Math.min(lista1.size(), lista2.size()); i++) {
            if (!lista1.get(i).equals(lista2.get(i))){
                System.out.println("Różnica w miejscu " + i + ": Lista 1 = " + lista1.get(i) + ", Lista 2 = " + lista2.get(i));

            }
        }

        for (int i = Math.min(lista1.size(), lista2.size()); i <Math.max(lista1.size(), lista2.size()) ; i++) {
        if (i < lista1.size()) {
            System.out.println("Dodatkowy element w Liście 1 na miejscu " + i + ": " + lista1.get(i));
        }
        if (i < lista2.size()) {
            System.out.println("Dodatkowy element w Liście 2 na miejscu " + i + ": " + lista2.get(i));
        }
        }
*/


/* int n = lista1.size();
        boolean zamiana;

        do {
            zamiana = false;
            for (int i = 0; i < n - 1; i++) {
                if (lista1.get(i) > lista1.get(i + 1)) {

                    int temp = lista1.get(i);
                    lista1.set(i, lista1.get(i + 1));
                    lista1.set(i + 1, temp);
                    zamiana = true;
                }
            }
            n--;
        } while (zamiana);

        System.out.println("Posortowana lista: " + lista1);*/