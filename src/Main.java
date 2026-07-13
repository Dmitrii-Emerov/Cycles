//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Product pen = new Product(0001,"ручка",15,"концтовары");
        Product pencil1 = new Product(0002,"карандаш",10,"концтовары");
        Product book = new Product(0003,"книга",200,"литература");
        Product pencil2 = new Product(0002,"карандаш",110,"концтовары");

        System.out.println(pen);

        System.out.println(pen.equals(pencil1));
        System.out.println(book.equals(pencil1));
        System.out.println(pencil1.equals(pencil2));

        Product[] productsBasket1 = {pen, pencil1};
        Product[] productsBasket2 = {pencil1, pen};
        Product[] productsBasket3 = {pen, pencil1};

        Order order1= new Order("Customer 1",productsBasket1);
        Order order2= new Order("Customer 2",productsBasket2);
        Order order3= new Order("Customer 1",productsBasket3);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println("order1 = order2 = "+ order1.equals(order2));
        System.out.println("order1 = order3 = "+ order1.equals(order3));
    }

}