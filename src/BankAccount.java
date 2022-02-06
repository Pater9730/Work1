public class BankAccount {


    /**
     *Se empieza creando la clase
     *Se mencionan los atributos publicos, privados y protegidos.
     */

    private int Accountnumber;
    protected boolean activated;

    /**
     * Getters y setters pertenecientes a su respectivo atributo
     */

    public boolean getActivated()
    {
        return activated;
    }

    public void setActivated(boolean activated)
    {
        this.activated = activated;
    }
}