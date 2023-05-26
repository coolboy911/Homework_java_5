package homework.homework_java_5;

import java.util.Map;
import java.util.Set;

public class Filter {
    Set<Notebook> notebooks;
    Map<Integer, Object> filter;

    public Filter(Set<Notebook> notebooks, Map<Integer, Object> filter) {
        this.notebooks = notebooks;
        this.filter = filter;
    }

    public void filterNotebooks() {
        for (Notebook notebook : notebooks) {
            Boolean passFilter = true;
            for (Map.Entry<Integer, Object> entry : filter.entrySet()) {
                Integer key = entry.getKey();
                Object value = entry.getValue();
                switch (key) {
                    case 1:
                        if (!notebook.brand.equals(value)){
                            passFilter = false;
                        }
                        break;
                    case 2:
                        if (notebook.ram < (int)value){
                            passFilter = false;
                        }
                        break;
                    case 3:
                        if (notebook.storage < (int)value) {
                            passFilter = false;
                        }
                        break;
                    case 4:
                        if (!notebook.os.equals(value)) {
                            passFilter = false;
                        }
                        break;
                    case 5:
                        if (notebook.price > (int)value) {
                            passFilter = false;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Неизвестный критерий " + key);
                }
                if(!passFilter) break;
            }
            if (passFilter) System.out.println(notebook);
        }

    }
}
