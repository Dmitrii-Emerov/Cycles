void main() {
    System.out.println("Hello and welcome!");
    //Задание 1
    System.out.println("Задание 1");
    int firstFriday = 3;
    int i = 1;
    for (; i <= 31; i++) {
        if ((i - firstFriday) % 7 == 0) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            firstFriday += 7;
        }
    }
    //Задание 2.1
    System.out.println("Задание 2");
    int myDistance = 0;
    int massageDistance = 500;
    int fullDistance = 42195;
    do {
        System.out.println("Пройдено " + myDistance + " метров. Держитесь! Осталось " + fullDistance + " метров");
        fullDistance = fullDistance - 500;
        myDistance = myDistance + 500;
    } while (fullDistance >= 0);
    System.out.println("Дистанция завершена");

    // задание 2.2
    System.out.println("Задание 2.2");
    int myDistanceOne = 0;
    int fullDistanceOne = 42195;
    for (; myDistanceOne < fullDistanceOne; myDistanceOne += 500) {
        System.out.println("Держитесь! Осталось " + (fullDistanceOne - myDistanceOne) + " метров");
    }

    //Задание 3
    System.out.println("Задание 3");
    int days = 1;
    int budget = 1000;
    while (true) {
        if (days % 5 == 0) {
            days++;
            System.out.println("Бесплатный день");
            continue;
        }
        budget -= 100;
        System.out.println("День " + days + ": списание 100. Остаток " + budget);
        days++;
        if (budget <= 0) {
            System.out.println("Пополните счет");
            break;
        }

    }
    //Задание 3.2
    System.out.println("Задание 3.2 ");
    int day = 1;
    int money = 1000;
    for (int p = money; p >= 100; ) {
        if (day % 5 == 0) {
            System.out.println("День " + day + ".Бесплатный день. Остаток " + p);
        } else {
            p -= 100;
            System.out.println("День " + day + ": списание 100. Остаток " + p);
        }
        day++;
    }
    System.out.println("Пополните счет");
    //Задание 4
    System.out.println("Задание 4");
    int salaryX = 15000;
    int month = 0;
    int totalX = 0;
    while (true) {
        month++;
        if (month % 6 == 0) {
            totalX = totalX + totalX / 100 * 7;
        }
        totalX = totalX + salaryX;


        System.out.println("Месяц " + month + " Сумма " + totalX);
        if (totalX >= 12_000_000) {
            break;
        }
    }
    //Задание 5
    System.out.println("Задание 5");
    int charge = 20;
    int minute = 0;
    int overheats = 0;
    while (charge < 100 && overheats <= 3) {
        minute++;
        charge = charge + 2;
        if (minute % 10 == 0) {
            minute += 2;
            overheats++;
            System.out.println(" Случился перегрев " + overheats);
            System.out.println("Заряд" + charge + "%");
            if (overheats == 3) {
                break;
            }
            continue;
        }
        if (overheats == 3) {
            System.out.println("Зарядка прекращена. Текущий заряд " + charge);
            break;
        }
    }
    System.out.println("Время зарядки составило " + minute);
}