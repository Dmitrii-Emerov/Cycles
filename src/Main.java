void main() {
    System.out.println("Hello and welcome!");
    System.out.println("Задание 1");
    for (int i = 1; i <= 10; i++) {
        System.out.println(i);
    }
    System.out.println("Задание 2");
    for (int i = 10; i >= 1; i--) {
        System.out.println(i);
    }
    System.out.println("Задание 3");
    for (int i = 0; i <= 17; i = i + 2) {
        System.out.println(i);
    }
    System.out.println("Задание 4");
    for (int i = 10; i >= -10; i--) {
        System.out.println(i);
    }
    System.out.println("Задание 5");
    for (int i = 1904; i < 2096; i = i + 4) {
        System.out.println("Високосный год " + i);
    }
    System.out.println("Задание 6");
    for (int i = 7; i <= 98; i = i + 7) {
        System.out.println(i);
    }
    System.out.println("Задание 7");
    for (int i = 1; i <= 512; i = i * 2) {
        System.out.println(i);
    }
    System.out.println("Задание 8");
    int monthlyDeposit = 29000;
    int totalSavings = 0;
    for (int month = 1; month <= 12; month++) {
        totalSavings += monthlyDeposit;
        System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
    }
    System.out.println("Задание 9");
    int monthlySavingsOne =29000;
    double totalSavingsOne = 0;
    for (int monthOne =1; monthOne<=12; monthOne ++){
        totalSavingsOne = totalSavingsOne * 1.01;
        totalSavingsOne += monthlySavingsOne;
        System.out.println("Месяц " + monthOne + ", сумма накоплений равна " + totalSavingsOne + " рублей");
    }
    System.out.println("Задание 10");
    int number = 2;
    for (int j = 1; j <= 10; j++) {
        System.out.println(number + "*" + j + "=" + number * j);
    }
}

