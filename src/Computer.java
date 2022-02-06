public class Computer {

    /**
     *Se empieza creando la clase
     *Se mencionan los atributos publicos, privados y protegidos.
     */

    public int size;
    public String color;
    private float price;
    protected String characteristic;

    /**
     * Aqui se crea el primer metodo, el cual es privado.
     */

    private void processdata () {

        System.out.println("el computador está procesando informacion");
    }

    /**
     * Segundo metodo el cual es publico
     */

    public void playvideo () {

        System.out.println("el computador está reproduciendo video");
    }

    /**
     * Tercer metodo que es protegido
     */

    protected void downloadgames () {

        System.out.println("el computador se encuentra descargando juegos");
    }

    /**
     * Creamos los respectivos getters y setters
     */

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }
}
