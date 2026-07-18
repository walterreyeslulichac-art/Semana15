public class CremaBatida extends Decorator{

    public CremaBatida(Café café){
        super(café);
    }
    @Override
    public String getDescripcion() {
        return getDescripcion()+"+ Crema Batida";
    }

    @Override
    public double getPrecio() {
        return getPrecio()+ 5.00;
    }
}
