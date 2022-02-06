import java.util.ArrayList;

public class Fruit {

    /**
     *Se empieza creando la clase
     *Se mencionan los atributos publicos, privados y protegidos.
     * Un atributo es un arraylist debido a que la fruta podría tener distintos colores
     */

    public String raspberry;
    private float Averageweight;
    public ArrayList <String> colors = new ArrayList<>();

    /**
     * Se crean los respectivos getters y setters
     */

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
