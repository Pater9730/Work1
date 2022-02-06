public class Motorcycle {

    /**
     *Se empieza creando la clase
     *Se mencionan los atributos publicos, privados y protegidos.
     */

    public String brand;
    public String model;
    protected int km;
    private double price;

    /**
     * Se menciona el primer metodo de caracter publico que podría tomar la motocicleta
     */

    public void speedup ()
    {
        System.out.println("la moto está acelerando");

    }
    /**
     * El se segundo metodo de caracter privado que es; llenando el tanque de combustible de la motocicleta
     */

    private void addgas ()
    {
        System.out.println("se está llenando el tanque de combustible");
    }
    /**
     * Nuestro tercer metodo de caracter protegido cuando la motocicleta se estaciona.
     */

    protected void brake ()
    {

        System.out.println("la moto frenó para estacionarse");
    }
    /**
     * los Respectivos getters y setters pertenecientes a la clase.
     *
     */

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double precio) {
        this.price = price;
    }
}
