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

public class Empleado {
private String nombre;
private int salario;
public Empleado(String nombre, int salario) {
this.nombre = nombre;
this.salario = salario;
}

public int calcularSalario() {
        return salario;
}



    public void mostrarDatos() {
        System.out.println("=== DATOS DEL EMPLEADO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario total calculado: " + calcularSalario());
    }
    //Metodo aumentar salario
    public void aumentarSalario(int aumento) {
        salario += aumento;
        System.out.println("=== SALARIO ACTUALIZADO ===");
        System.out.println("Nuevo salario: " + salario);
    }
}


