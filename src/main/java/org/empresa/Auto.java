package org.empresa;

public class Auto {

    private String placa;
    private String color;

    public Auto(String placa, String color) {
        this.placa = placa;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "placa='" + placa + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
