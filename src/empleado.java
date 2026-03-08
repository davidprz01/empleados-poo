public class Empleado {
    private String nombre;
    private int salario;

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    /* MÉTODO2:mostrarDatos*/
    public void mostrarDatos() {
        System.out.println("=== DATOS DEL EMPLEADO ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Salario base: " + salarioBase);
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Valor por hora extra: " + valorHoraExtra);
        System.out.println("Salario total calculado: " + calcularSalario());
    }
}



