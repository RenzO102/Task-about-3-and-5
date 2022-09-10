import java.util.Scanner;

public class Taskabout3and5 {
    public static void main(String[] args)
    {
        System.out.println("Введите число");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        System.out.println(" Вы ввели число " + i);
        {
            if (i % 2 == 0) {
            } else
            if (i % 5 == 0) {
                if (i % 3 == 0) {
                    System.out.println("Число делится на 3 и 5");
                } else
                    System.out.println("Число делится на 5 ");
            } else
                System.out.println("Число делится на 3");

        }
    }
}














