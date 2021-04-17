package com.example.eva1_12_clima;

public class clima {
    private int imagen;
    private String Ciudad;
    private double Grados;
    private String descripcion;

    public clima() {
        this.imagen = R.drawable.cloudy;
        Ciudad = "Chihuahua";
        Grados = 28.3;
        this.descripcion = "Agradable pero lleven para la nieve, par la lluvia o para el sol";
    }
    public clima(int imagen, String ciudad, double Grados, String descripcion)
    {
        this.imagen = imagen;
        this.Ciudad = ciudad;
        this.Grados = Grados;
        this.descripcion = descripcion;
    }
    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public double getGrados() {
        return Grados;
    }

    public void setGrados(double grados) {
        Grados = grados;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

