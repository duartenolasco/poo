public interface FigurasGeometricasVolumetricas {
    //cubo ecuaciones 1.------------------------------------------
    double volumenCubo(double lado);
    //area superficial
    double areaCubo(double lado);

    //prisma ecuaciones 2.-------------------------------------------
    double volumenPrisma(double base, double altura);

    double areaPrisma(double base, double altura);

    //piramide ecuaciones
    double volumenPiramide(double base, double altura);

    //esfera ecuaciones 3.-------------------------------------------

    double volumenEsfera(double radio);

    double areaEsfera(double radio);

    //cilindro ecuaciones 4.-----------------------------------------

    double volumenCilindro(double radio, double altura);

    //cono ecuaciones ----5.---------------------------------

    double volumenCono(double radio, double altura);

    //primahexagonal ecuaciones 6.----------------------------------------
    //area de la base
    double volumenPrismaHexagonal(double area, double altura);

    //paralelepipedo ecuaciones 7.--------------------------------------------
    double volumenParalelepipedo(double longitud, double ancho, double altura);
}
