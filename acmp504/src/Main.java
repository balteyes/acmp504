import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char geran ='G';
        char krokus = 'C';
        char fialka = 'V';

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество дней");
        int K = scanner.nextInt();
        char[] flowers ={'G','C','V'};

        for (int i = 0; i < K; i++) {
            swap(flowers, 1, 2);
            swap(flowers, 0, 1);

        }
        System.out.println(new String(flowers));

        }
    public static void swap(char[]mas, int i, int j){
        char move = mas[i];
        mas[i] = mas[j];
        mas[j] = move;


    }
    }
