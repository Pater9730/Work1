public class Virus {

    /**
     *Se empieza creando la clase
     *Se mencionan los atributos publicos, privados y protegidos.
     */

    private float size;
    public String color;
    protected String shape;

    /**
     * Primer metodo de la clase virus de caracter publico
     */

    public void causeinfection () {
        System.out.println("el virus se encuentra causando infeccion");
    }
    /**
     * Segundo metodo de caracter protegido
     */

    protected void conjugation () {
        System.out.println("el virus se encuentra haciendo conjugacion");
    }
    /**
     * Tercer metodo de la clase de caracter privado.
     */

    private void die () {
        System.out.println("el virus muere por razones naturales");
    }

    /**
     * Los respectivos getters y setters
     *
     */
    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}

