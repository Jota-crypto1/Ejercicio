package ejercicio2;

public class Empleado 
{
    String nombre;
    int edad;
    double horas;
    double pagoxhora;
    public Empleado (String nombre, int edad, double horas, double pagoxhora)
    {
        this.nombre=nombre;
        this.edad =edad;
        this.horas= horas;
        this.pagoxhora=pagoxhora;
    }
    //metodo
    public void mostar_sueldoNeto()
    {
        double sueldNeto=horas*pagoxhora;
        System.out.println("Sueldo neto (horas x pago por hora)");
        System.out.println("Nombre:" +nombre+
                           "\nEdad  :" +edad+
                           "\nHoras trabajadas:" +horas+
                           "\nPago por hora:"+pagoxhora+
                           "\nSueldo a pagar:" +sueldNeto); 
    }
}
