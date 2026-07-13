public class Main {


    public static void main(String[] args) {
        System.out.println("Классы и объекты");
        System.out.println();
        Author levTolstoy = new Author("Лев", "Толстой");
        System.out.println(levTolstoy.getName());
        System.out.println(levTolstoy.getLastname());
        System.out.println();
        Author allenCarr = new Author("Аллен", "Карр");
        System.out.println(allenCarr.getName());
        System.out.println(allenCarr.getLastname());
        System.out.println();
        Book warAndPeace = new Book("Война и мир", 1869, levTolstoy);
        System.out.println(warAndPeace.getTitle());
        System.out.println(warAndPeace.getYear());
        System.out.println(warAndPeace.getNameOfAuthor());
        System.out.println();
        warAndPeace.setYear(1880);
        System.out.println(warAndPeace.getNameOfAuthor().getName() + " " + warAndPeace.getNameOfAuthor().getLastname());
        System.out.println("Меняем год книги - Война и мир");
        System.out.println();
        Book bookSmoking = new Book("Лёгкий способ бросить курить", 1985, allenCarr);
        System.out.println(bookSmoking.getTitle());
        System.out.println(bookSmoking.getYear());
        System.out.println(bookSmoking.getNameOfAuthor());
        System.out.println("Меняем год книги - Лёгкий способ бросить курить");
        bookSmoking.setYear(1900);
        System.out.println(bookSmoking.getYear());
    }
}




