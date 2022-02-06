import java.util.Date;

public class Person {

    /**
     *Se empieza creando la clase
     *Se mencionan los atributos publicos, privados y protegidos.
     */

    public String Name;
    public String lastname1;
    public String lastname2;
    public Date datebirth;
    public float height;

    /**
     * Se crea el respectivo getters y setters
     */

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }
}