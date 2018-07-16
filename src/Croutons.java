public class Croutons extends Additives {

    Salad salad;

    public Croutons(Salad salad) {
        this.salad = salad;
    }

    @Override
    public String getDesc() {
        return salad.getDesc()+ ", croutons";
    }

    @Override
    public double price() {
        return salad.price()+ 1.2;
    }
}
