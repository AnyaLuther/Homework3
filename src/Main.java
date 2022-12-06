public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();

    }

    public static void task1() {
        System.out.println(" Задача 1");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println(" Задача 2");
        for (int i = 10; i > 0; i = i - 1)
            System.out.println(i);
    }

    public static void task3() {
        System.out.println(" Задача 3");
        for (int i = 0; i < 17; i = i + 2)
            System.out.println(i);
    }

    public static void task4() {
        System.out.println(" Задача 4");
        for (int i = 10; i > -11; i = i - 1)
            System.out.println(i);
    }

    public static void task5() {
        System.out.println(" Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            if (i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " год является високосным");
            }
        }
    }

    public static void task6() {
        System.out.println(" Задача 6");
        for (int i = 7; i < 99; i = i + 7)
            System.out.print(i + " ");
        {
            System.out.println();
        }
    }


    public static void task7() {
        System.out.println(" Задача 7");
        for (int i = 1; i < 513; i = i * 2)
            System.out.print(i + " ");
        {
            System.out.println();
        }
    }

    public static void task8() {
        System.out.println(" Задача 8");
        int sum = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + sum;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9() {
        System.out.println(" Задача 9");
        int sum = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + total/100;
            total = total + sum;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task10() {
        System.out.println(" Задача 10");
        int a = 1;
        int b = 1;
        int sum;
        System.out.print(a + " " + b + " ");
        for(int i = 3; i <= 11; i++){
            sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }
        System.out.println();
    }

    public static void task11() {
        System.out.println(" Задача 11");
        int sum = 15_000;
        int total = 0;
        int month = 0;
        while ( total <= 2_459_000 ) {
            total = total + sum;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task12() {
        System.out.println(" Задача 12");
        int i = 1;
        while ( i <= 10 ) {
            System.out.print(i + " ");
            i = i + 1;
        } System.out.println();{
            for ( int j = 10; j > 0; j = j-1)
                System.out.print(j + " ");
            {
                System.out.println();
            }
        }
    }

    public static void task13() {
        System.out.println(" Задача 13");
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int difference = birthRate - deathRate;
        for (int i = 1; i<11 ; i++ ) {
            population += population /1000 * difference;
            System.out.println("Год" + i + ", численность населения составляет " + population);
        }
    }

    public static void task14() {
        System.out.println(" Задача 14");
        int sum = 15_000;
        int total = 0;
        int month = 0;
        while ( total <= 12_000_000 ) {
            total = sum + sum/100*7;
            sum = sum + sum*7/100;
            month += 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
    }

    public static void task15() {
        System.out.println(" Задача 15");
        int sum = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 12_000_000) {
            total = sum + sum / 100 * 7;
            sum = sum + sum * 7 / 100;
            month += 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
        }
    }
        public static void task16() {
            System.out.println(" Задача 16");
            int sum = 15_000;
            int total = 0;
            int month = 1;
            for (int i = 15_000; month <= 108; month++) {
                total += sum/100*7;
                sum = sum + sum*7/100;
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
                }
            }
        }

    public static void task17() {
        System.out.println(" Задача 17");
        int firstFriday = 5;
        for (; firstFriday<=31; firstFriday=firstFriday+7)
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет ");
    }

    public static void task18() {
        System.out.println(" Задача 18");
        int year = 2022;
        int startOfPeriod = year - 200;
        int endOfPeriod = year + 100;
        for (int i = 0; i<=endOfPeriod ; i+=79)
            if ( i>startOfPeriod) {
                System.out.println(i);

            }
    }
}






