package com.example.listaasistencia.modelo;

public class Alumno {
    private String numControl;
    private String nombre;
    private String ruta;
    private int idCurso;

    public Alumno(String numControl, String nombre){
        this.numControl=numControl;
        this.nombre=nombre;
        ruta = "none";
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
}
