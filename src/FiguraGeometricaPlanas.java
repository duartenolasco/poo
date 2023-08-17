public interface FiguraGeometricaPlanas {
  //triangulo ecuaciones
    double areaTriangulo(double base, double altura);

    double perimetroTriangulo(double lado1, double lado2, double lado3);

    double pitadorasTriangulo(double ladoa, double ladob);

    //cuadrado ecuaciones

    double areaCuadrado(double lado1, double lado2);

    double perimetroCuadrado(double lado);

    //rectangulo ecuaciones

    double areaRectangulo(double base, double altura);

    double perimetroRectangulo(double base, double altura);

    //circulo ecuaciones

    double areaCirculo(double radio);

    double circunferenciaCirculo(double radio);

    //trapecio ecuaciones

    double areaTrapecio(double base1, double base2, double altura);

    double perimetroTrapecio(double lado1, double lado2, double base1, double base2);

    //rombo ecuaciones

  double areaRombo(double diagonal1, double diagonal2);

  double perimetroRombo(double lado);



}
