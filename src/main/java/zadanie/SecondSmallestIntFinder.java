package zadanie;

import java.util.List;

public class SecondSmallestIntFinder implements ListFinder {
    @Override
    public int finder(List<Integer> countList1) {
        if(countList1==null) {
            return 0;
        }
        if (countList1.isEmpty()) {
            return 0;
        }
        return countList1.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(countList1.get(0));
    }
}
