package homework.homework_java_5;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Notebook> notebookHashSet = GetNotebookSet();

        HashMap<Integer, Object> filter = new HashMap<>();
        // 1 - brand, 2 - ram, 3 - storage, 4 - os, 5 - price
        filter.put(2, 16);  // filter RAM >= 16
        filter.put(4, "Windows");  // filter OS = Windows
        Filter filt = new Filter(notebookHashSet,filter);
        filt.filterNotebooks();
    }
    public static HashSet<Notebook> GetNotebookSet() {
        HashSet<Notebook> notebookHashSet = new HashSet<>();
        notebookHashSet.add(new Notebook("Dell", 8, 512, "Windows", 50000));
        notebookHashSet.add(new Notebook("Apple", 16, 512, "macOS", 100000));
        notebookHashSet.add(new Notebook("Asus", 16, 512, "Windows", 70000));
        return notebookHashSet;
    }
}
