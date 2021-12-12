package model;

public class League {
    private int id;
    private String nombre;
    private int cupo;
    private int id_user;

    public League() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_admin) {
        this.id_user = id_admin;
    }

}
