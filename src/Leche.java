public class Leche extends Decorator{

    public Leche(Café cafe){
        super(cafe);
    }
    @Override
    public String getDescripcion() {
        return cafe.getDescripcion()+"+ Leche ";
    }

    @Override
    public double getPrecio() {
       return cafe.getPrecio()+ 4.00;
    }
}
