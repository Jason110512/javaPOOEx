class Circulo {
    private double area, pi;

    public Circulo() {

    }

    @Override
    public String toString() {
        return "Circulo [area=" + area + ", pi=" + pi + "]";
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double mostrarResultado() {
        return this.pi * this.area * this.area;

    }

}