public class Circle extends Shape {

    public Circle(double promien_kola) {
        this.promien_kola = promien_kola;
    }

    public double getPromien_kola() {
        return promien_kola;
    }
    public void setPromien_kola(double promien_kola) {
        this.promien_kola = promien_kola;
    }

    @Override
    public void wyswietl() {
        System.out.print("Dla koła o promieniu " + Math.round(getPromien_kola()) + ",");
    }
}
