public class Empleado { 
private String nombre; 
private int salario;
private String cargo;
public Empleado(String nombre, int salario, String cargo) {
this.nombre = nombre;
this.cargo = cargo;
this.salario = salario; 
}


// Actulizar cargo
public void actualizarCargo(String nuevoCargo) {
   cargo = nuevoCargo;
   System.out.println("el cargo fue actualizado a: "+ cargo);
  }
}
