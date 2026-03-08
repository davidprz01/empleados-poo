public class empleado {
    private String nombre;
    private int salario;
    private String cargo;
    public empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }


    /* Metodo de Actulizar cargo */
    public void actualizarCargo(String nuevoCargo) {
        this.cargo = nuevoCargo;
        System.out.println("el cargo fue actualizado a: " + this.cargo);
    }
}
