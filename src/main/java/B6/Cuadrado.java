package B6;

public class Cuadrado implements Forma{

    private double lado;

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public void mostrar() {

    }

}