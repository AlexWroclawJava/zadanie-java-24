public class ShapeCalculator {

    double circleArea(Shape cirle) {
        return Math.round(cirle.PI * Math.pow(cirle.promien_kola, 2));
    }

    double circleObwod(Shape cirle) {
        return Math.round(2 * cirle.PI * cirle.promien_kola);
    }

    double rectArea(Shape rectangle) {
        return Math.round(rectangle.bok1_prostokata * rectangle.bok2_prostokata);
    }

    double rectObwod(Shape rectangle) {
        return Math.round(2 * rectangle.bok1_prostokata + 2 * rectangle.bok2_prostokata);
    }
}
