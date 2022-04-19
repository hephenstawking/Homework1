package homework;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product();

        prod1.setWeight(5.2);
        prod1.setPrice(12.99);
        prod1.setDescription("A brand new something");

        System.out.println(prod1);
    }
}
