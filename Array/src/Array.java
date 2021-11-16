import java.util.*;

public class Array {

    public static void main(String[] args) {
        
        Scanner inputArray = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = inputArray.nextInt();
        Date date1 = new Date();
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt());
        }
        System.out.println("Введенный массив:" + list);

        for (int k = size - 1; k > 0; k--) {
            for (int l = 0; l < k; l++) {
                if (list.get(l) > list.get(l + 1)) {
                    int temp = list.get(l);
                    list.set(l, list.get(l + 1));
                    list.set(l + 1, temp);
                }
            }

        }
        System.out.println("Отсортированный массив сортировкой пузырьком:" + list);
        Date date2 = new Date();
        long date3 = date2.getTime() - date1.getTime();
        System.out.println("Время обработки массива сортировкой пузырьком:" + date3 + "мс");
        Date date4 = new Date();
        Collections.sort(list);
        Date date5 = new Date();
        long date6 = date5.getTime() - date4.getTime();
        System.out.println(list);
        System.out.println("Время обработки массива Collections.sort:" + date6 + "мс");
    }
}

