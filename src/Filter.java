import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Filter {
    protected int treshold;

    public Filter (int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < source.size(); i++) {
            int k = source.get(i);
            if (treshold < k) {
                result.add(k);
                logger.log("Элемент " + k + " подходит");
            } else {
                logger.log("Элемент " + k + " не подходит");
            }
        }
        return result;
    }

}
