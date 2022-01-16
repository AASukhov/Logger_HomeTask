import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner sc = new Scanner(System.in);
        logger.log("Здравствуйте, введите параметры. Для начала размер списка.");
        int k = sc.nextInt();
        logger.log("Теперь верхнюю границу списка элементов");
        int max = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < k; i++) {
            list.add(random.nextInt(max));
        }
        logger.log("Создаем и наполняем список. Вот случайный список " + listPrint(list));

        logger.log("Введите порог для фильтра");
        int treshold = sc.nextInt();
        Filter filter = new Filter(treshold);
        logger.log("Выводим результат на экран");
        logger.log(listPrint(filter.filterOut(list)));
        logger.log("Завершение программы");


    }
    public static String listPrint(List<Integer> list) {
        StringBuilder k = new StringBuilder();
        for (Integer integer : list) {
            k.append(integer);
            k.append(" ");
        }
        return k.toString();
    }
}


