package t3a1;

import java.util.Scanner;

public class Calificaciones {
    private String nombre;
    private String apoellidoPaterno;
    private String apellidoMaterno;
    private String grupo;
    private String carrera;
    private String nombreAsignatura;
    private int calificacion;
    private double promedio;

    public Calificaciones() { // método constructor vacío
        
    }

    public Calificaciones(String nombre, String apoellidoPaterno, String apellidoMaterno, String grupo, String carrera, String nombreAsignatura, int calificacion, double promedio) {
        this.nombre = nombre;
        this.apoellidoPaterno = apoellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.grupo = grupo;
        this.carrera = carrera;
        this.nombreAsignatura = nombreAsignatura;
        this.calificacion = calificacion;
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Calificaciones{" + "nombre=" + nombre + ", apoellidoPaterno=" + apoellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", grupo=" + grupo + ", carrera=" + carrera + ", nombreAsignatura=" + nombreAsignatura + ", calificacion=" + calificacion + ", promedio=" + promedio + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApoellidoPaterno() {
        return apoellidoPaterno;
    }

    public void setApoellidoPaterno(String apoellidoPaterno) {
        this.apoellidoPaterno = apoellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

 
  
}
