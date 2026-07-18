public class PruebaDecorator {
    static void main(String[] args) {
            Café c1=new Americano();
            c1=new Leche(c1);
            c1=new CremaBatida(c1);

        System.out.println(c1.getDescripcion());
        System.out.println("Precio: "+c1.getPrecio());


        Café c2= new Expresso();
        c2=new Leche(c2);
        c2=new Chocolate(c2);
        c2 = new CremaBatida(c2);

        System.out.println(c2.getDescripcion());
        System.out.println("Precio: "+c2.getPrecio());
    }
}
