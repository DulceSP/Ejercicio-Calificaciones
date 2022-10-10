package t3a1;

import java.util.Scanner;

public class T3a1 {

    public static void main(String[] args) {
        procesar();
    }
    
    public static void procesar(){
        Scanner scanner = new Scanner(System.in);
        Calificaciones calificaciones = new Calificaciones();
        
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        calificaciones.setNombre(nombre);
        
        System.out.print("Apellido Paterno: ");
        String apoellidoPaterno = scanner.nextLine();
        calificaciones.setApoellidoPaterno(apoellidoPaterno);
         
        System.out.print("Apellido Materno: ");
        String apellidoMaterno = scanner.nextLine();
        calificaciones.setApellidoMaterno(apellidoMaterno);
        
        System.out.print("Grupo: ");
        String grupo = scanner.nextLine();
        calificaciones.setGrupo(grupo);
        
        System.out.print("Carrera: ");
        String carrera = scanner.nextLine();
        calificaciones.setCarrera(carrera);
        
        System.out.print("Asignatura: ");
        String nombreAsignatura = scanner.nextLine();
        calificaciones.setNombreAsignatura(nombreAsignatura);
        
        System.out.print("Calificacion: ");
        int calificacion = scanner.nextInt();
        calificaciones.setCalificacion(calificacion);
        
        System.out.println(calificaciones.toString());
    }
            
}
