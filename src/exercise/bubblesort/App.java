package exercise.bubblesort;

public class App {
    public static void main(String[] args) {
        int list[] = { 8, 4, 2, 3, 10 };
        int temp = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {

                if (list[j] > list[i]) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        for (int i : list) {
            System.out.println(i);
        }
    }

}
