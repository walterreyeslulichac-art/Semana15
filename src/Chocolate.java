public class Chocolate extends Decorator{
    public Chocolate(Café café){
        super(café);
    }
    @Override
    public String getDescripcion() {
        return cafe.getDescripcion()+" + Cholocate";
    }

    @Override
    public double getPrecio() {
        return cafe.getPrecio() +6.00;
    }
}
