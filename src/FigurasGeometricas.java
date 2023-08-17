public class FigurasGeometricas implements FiguraGeometricaPlanas, FigurasGeometricasVolumetricas {

    @Override
    public double areaTriangulo(double base, double altura) {
        double areatri = 0.5*base*altura;
        return areatri;
    }

    @Override
    public double perimetroTriangulo(double lado1, double lado2, double lado3) {
       double perimetrotri = lado1+lado2+lado3;
        return perimetrotri;
    }

    @Override
    public double pitadorasTriangulo(double ladoa, double ladob) {
        double hipotenusa = Math.sqrt(Math.pow(ladoa, 2) + Math.pow(ladob, 2));
        return hipotenusa;
    }

    @Override
    public double areaCuadrado(double lado1, double lado2) {
        double areacua = lado1 * lado2;
        return areacua;
    }

    @Override
    public double perimetroCuadrado(double lado) {
        double perimetrocua = 4 * lado;
        return perimetrocua;
    }

    @Override
    public double areaRectangulo(double base, double altura) {
        double arearec = base * altura;
        return arearec;
    }

    @Override
    public double perimetroRectangulo(double base, double altura) {
        double perimetrorec = 2*(base+altura);
        return perimetrorec;
    }

    @Override
    public double areaCirculo(double radio) {
        double areacir = (Math.PI * Math.pow(radio, 2));
        return areacir;
    }

    @Override
    public double circunferenciaCirculo(double radio) {
        double circunferenciacir = (2*Math.PI*radio);
        return circunferenciacir;
    }

    @Override
    public double areaTrapecio(double base1, double base2, double altura) {
        double areatra = (0.5*(base1+base2)*altura);
        return areatra;
    }

    @Override
    public double perimetroTrapecio(double lado1, double lado2, double base1, double base2) {
        double perimetrotra = (lado1+lado2+base1+base2);
        return perimetrotra;
    }

    @Override
    public double areaRombo(double diagonal1, double diagonal2) {
        double arearombo = (0.5*diagonal1*diagonal2);
        return arearombo;
    }

    @Override
    public double perimetroRombo(double lado) {
        double perimetrorom = (4*lado);
        return perimetrorom;
    }

    @Override
    public double volumenCubo(double lado) {
        double volumencubo1 = Math.pow(lado,3);
        return volumencubo1;
    }

    @Override
    public double areaCubo(double lado) {
        double areacubo = (6*Math.pow(lado,2));
        return areacubo;
    }

    @Override
    public double volumenPrisma(double base, double altura) {
        double volumenprisma = base*altura;
        return volumenprisma;
    }

    @Override
    public double areaPrisma(double base, double altura) {
        double areaprisma = (2*base)+(2*altura);
        return areaprisma;
    }

    @Override
    public double volumenPiramide(double base, double altura) {
        double volumenpiramide = ((1/3)*base*altura);
        return volumenpiramide;
    }

    @Override
    public double volumenEsfera(double radio) {
        double volumenesfera = (((4/3)*Math.PI)*Math.pow(radio,3));
        return volumenesfera;
    }

    @Override
    public double areaEsfera(double radio) {
        double areaesfera = (4*Math.PI)*(Math.pow(radio,2));
        return areaesfera;
    }

    @Override
    public double volumenCilindro(double radio, double altura) {
       double volumencilindro = Math.PI*Math.pow(radio,2)*altura;
        return volumencilindro;
    }

    @Override
    public double volumenCono(double radio, double altura) {
        double volumencono = ((1/3)*Math.PI)*Math.pow(radio,2)*altura;
        return volumencono;
    }

    @Override
    public double volumenPrismaHexagonal(double area, double altura) {
        double volumenprismahexagonal = area*altura;
        return volumenprismahexagonal;
    }

    @Override
    public double volumenParalelepipedo(double longitud, double ancho, double altura) {
        double volumenparalelepipedo = longitud*ancho*altura;
        return volumenparalelepipedo;
    }
    
    
}
