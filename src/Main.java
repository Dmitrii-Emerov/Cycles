void main() {
    System.out.println("Hello and welcome!");
    //Задача 1;
    System.out.println("Задача 1");
    int[] first = new int[]{1, 2, 3};
    float[] two = {1.57f, 7.654f, 9.986f};
    int[] free = new int[4];
//Задача 2;
    System.out.println("Задача 2");
    for (int i = 0; i < first.length; i++) {
        if (i > 0) {
            System.out.print(", ");
        }
        System.out.print(first[i]);
    }
    System.out.println();
    for (int i = 0; i < two.length; i++) {
        if (i > 0) {
            System.out.print(", ");
        }
        System.out.print(two[i]);
    }
    System.out.println();
    for (int i = 0; i < free.length; i++) {
        if (i > 0) {
            System.out.print(", ");
        }
        System.out.print(free[i]);
    }
    System.out.println();
    //Задача 3;
    System.out.println("Задача 3");
    for (int i = first.length - 1; i >= 0; i--) {
        System.out.print(first[i]);
        if (i != 0) {
            System.out.print(", ");
        }
    }
    System.out.println();
    for (int i = two.length - 1; i >= 0; i--) {
        System.out.print(two[i]);
        if (i != 0) {
            System.out.print(", ");
        }
    }
    System.out.println();
    for (int i = free.length - 1; i >= 0; i--) {
        System.out.print(free[i]);
        if (i != 0) {
            System.out.print(", ");
        }
    }
    System.out.println();
    //Задача 4;
    System.out.println("Задача 4");
    int[] one = new int[3];
    one[0] = 1;
    one[1] = 2;
    one[2] = 3;
    for (int i = 0; i < one.length; i++) {
        // Если число не делится на 2 без остатка — оно нечетное
        if (one[i] % 2 != 0) {
            one[i] += 1;
        }
    }
    System.out.println(Arrays.toString(one));
}
