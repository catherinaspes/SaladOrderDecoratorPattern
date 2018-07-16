public class Order {

    public static void main(String[] args) {

        Salad salad = new GreeceSalad();
        salad = new OliveOil(salad);
        System.out.println(salad.getDesc()+ " - "+ salad.price()+ " PLN");

        System.out.println();
        Salad salad2 = new ChickenSalad();
        salad2 = new GarlicSauce(salad2);
        salad2 = new Croutons(salad2);
        System.out.println(salad2.getDesc()+ " - "+salad2.price()+" PLN");



    }
}
