package B6;

public class Circulo implements Forma {
    private double radio;

    Circulo(double radio){
        this.radio=radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio*radio;
    }

    @Override
    public void mostrar() {

    }

}