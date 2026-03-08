public class Empleado {
private String nombre;
private int salario;
public Empleado(String nombre, int salario) {
this.nombre = nombre;
this.salario = salario;
}
// funcion aumentar salario
public void aumentarSalario(int aumento) {
    salario += aumento;
}
