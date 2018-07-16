public class OliveOil extends Additives {

    Salad salad;

    public OliveOil(Salad salad) {
        this.salad = salad;
    }

    @Override
    public String getDesc() {
        return salad.getDesc()+", olive oil";
    }

    @Override
    public double price() {
        return salad.price()+2.00;
    }
}
