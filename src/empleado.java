public class Empleado {
    private String nombre;
    private int salario;
    private String cargo;
    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }


    /* Metodo Actulizar cargo */
    public void actualizarCargo(String nuevoCargo) {
        this.cargo = nuevoCargo;
        System.out.println("el cargo fue actualizado a: " + this.cargo);
    }
}
