public class GarlicSauce extends Additives {

    Salad salad;

    public GarlicSauce(Salad salad) {
        this.salad = salad;
    }

    @Override
    public String getDesc() {
        return salad.getDesc()+ ", garlic sauce";
    }

    @Override
    public double price() {
        return salad.price()+2.5;
    }
}
