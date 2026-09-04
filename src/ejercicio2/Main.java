package ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        String nomb;
        int ed;
        double hor, pagxhor;
        Scanner scan = new Scanner(System.in);
        
        //Captura de datos
        System.out.println("Registro del empleado");
        System.out.println("Ingrese el Nombre: ");
        nomb = scan.nextLine();
        System.out.println("Ingrese la edad: ");
        ed = scan.nextInt();
        scan.nextLine();
        System.out.println("Ingrese las horas trabajadas: ");
        hor = scan.nextDouble();
        scan.nextLine(); //Salto al requisito "carrera"
        System.out.println("Ingrese el pago por hora: ");
        pagxhor = scan.nextDouble();
        scan.nextLine();
        
        Empleado emp = new Empleado (nomb,ed,hor,pagxhor);
        
        emp.mostar_sueldoNeto();
    }
    
}
