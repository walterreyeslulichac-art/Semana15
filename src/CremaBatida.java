public class CremaBatida extends Decorator{

    public CremaBatida(Café café){
        super(café);
    }
    @Override
    public String getDescripcion() {
        return cafe.getDescripcion()+"+ Crema Batida";
    }

    @Override
    public double getPrecio() {
        return cafe.getPrecio()+ 5.00;
    }
}
