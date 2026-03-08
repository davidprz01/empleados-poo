
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
}


