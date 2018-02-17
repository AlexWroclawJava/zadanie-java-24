public class CalculatorTest {

    public static void main(String[] args) {

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        Shape[] sh = new Shape[2];
        sh[0] = new Circle(10);
        sh[1] = new Rectangle(5,10);

        sh[0].wyswietl();
        System.out.print(" pole wynosi: ");
        System.out.println(shapeCalculator.circleArea(sh[0]));
        System.out.print("oraz obwód wynosi: ");
        System.out.println(shapeCalculator.circleObwod(sh[0]) + "\n");

        sh[1].wyswietl();
        System.out.print(" pole wynosi: ");
        System.out.println(shapeCalculator.rectArea(sh[1]));
        System.out.print("oraz obwód wynosi: ");
        System.out.println(shapeCalculator.rectObwod(sh[1]));
    }
}

