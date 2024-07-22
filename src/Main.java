public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int a = 1; a < 11; a = a + 1) {
            System.out.println(a);
        }

        System.out.println("Задача 2");
        for (int b = 10; b > 0; b = b - 1){
            System.out.println(b);
        }

        System.out.println("Задача 3");
        for (int c = 0; c < 17; c = c + 2){
            System.out.println(c);
        }

        System.out.println("Задача 4");
        for (int d = 10; d > (-11); d = d - 1)  {
            System.out.println(d);
        }

        System.out.println("Задача 5");
        int year = 1904;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            for (int f = 1904; f < 2097; f = f + 4) {
                System.out.println(f + " год является високостным");
            }
        }

        System.out.println("Задача 6");
        for (int j = 7; j < 99; j = j + 7) {
            System.out.println(j);
        }

        System.out.println("Задача 7");
        for (int h = 1; h < 513; h = h * 2) {
            System.out.println(h);
        }

        System.out.println("Задача 8");
        int salary1 = 29000;
        int sum = 0;
        for (int g = 1; g < 13; g = g + 1) {
            sum = sum + salary1;
            System.out.println("Месяц, " + g + " сумма накоплений равна " + sum);
        }

        System.out.println("Задача 9");
        int salary2 = 29000;
        double sun = 0;
        double percent = 0.01;
        for (int k = 1; k < 13; k = k + 1) {
            sun = (sun + salary2) * (1 + percent);
            sun = sun + sun / 100;
            System.out.println("Месяц, " + k + " сумма накоплений  равна " + sun + " рублей");
        }

        System.out.println("Задача 10");
        int number = 2;
        for (int z = 1; z < 11; z = z + 1) {
            System.out.println(number + " * " + z + " = " + number * z );
        }
    }
}