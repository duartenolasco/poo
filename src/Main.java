import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       FigurasGeometricas fo = new FigurasGeometricas();
        Scanner sn = new Scanner(System.in);


        System.out.println("Este programa es para resolver ecuaciones de las figures geometricas");
        System.out.println("Estas son las figuras geometricas planas o volumetricas");
        System.out.println("seleccione");
        System.out.println("1. para figuras geometricas planas");
        System.out.println("2. para figuras geometricas volumetricas");
        System.out.print("3. salir: ");
        int opcionprincipal = sn.nextInt(); //division de switch principal -------------------
//--------------------------------------------------------------------------------------------------------------------------------
        switch (opcionprincipal){
            case 1:
                System.out.println("usted selecciono las operaciones de las figuras geometricas planas");
                System.out.println("estas son unas de ellas");
                System.out.println("1. triangulo ");
                System.out.println("2. cuadrado ");
                System.out.println("3. rectangulo ");
                System.out.println("4. circulo ");
                System.out.println("5. trapecio ");
                System.out.println("6. rombo ");
                System.out.println("selecciones el numero correspondiente de cada una para saber cual de estas");
                System.out.print("figuras planas desea conocer su ecuacion. (todos los datos son en centimetros): ");
                int opcionsecundaria = sn.nextInt();

                //switch secundario del principal del case 1 = ......
               // .......................................................................................................
                switch (opcionsecundaria){ //empieza secundaria
                    case 1:
                        System.out.println("el triangulo tiene 3 operaciones");
                        System.out.println("1. calcular area");
                        System.out.println("2. calcular perimetro");
                        System.out.println("3. teorema de pitagoras");
                        System.out.print("seleccione cual operacion desea hacer: ");
                        int opciontriangulo = sn.nextInt();
 //switch funcion***********************************************************************************************************
                        switch(opciontriangulo){
                            case 1:
                                System.out.println("a seleccionado calcular area");
                                System.out.println("los datos del triangulo son base 10cm y altura 8cm");
                                System.out.print("el area del triangulo es: ");
                                System.out.println(fo.areaTriangulo(10,8)+"cm");
                                break;

                            case 2:
                                System.out.println("usted a seleccionado calcular perimetro");
                                System.out.println("los datos del triangulo son lado1 10cm y lado2 8cm y lado 3 9cm");
                                System.out.print("el perimetro del triangulo es: ");
                                System.out.println(fo.perimetroTriangulo(10,8,9)+" cm");
                                break;

                        }
                        break;
//*****************************************************************************************************************
                    case 2:
                        System.out.println("usted a seleccionado el cuadrado. este tiene dos operaciones");
                        System.out.println("1. area");
                        System.out.println("2. perimetro");
                        System.out.print("selecciones que operacion desea saber: ");
                        int opcioncuadrado = sn.nextInt();

                        switch(opcioncuadrado){
                            case 1:
                                System.out.println("a seleccionado calcular area");
                                System.out.println("los datos del cuadrado son lado 10cm");
                                System.out.print("el area del cuadrado es: ");
                                System.out.println(fo.areaCuadrado(10,10)+"cm");
                                break;

                            case 2:
                                System.out.println("a seleccionado calcular perimetro");
                                System.out.println("los datos del cuadrado son lado 10cm");
                                System.out.print("el perimetro es: ");
                                System.out.println(fo.perimetroCuadrado(10)+"cm");
                                break;

                            default:System.out.println("------seleccione una opcion valida -----");
                        }
                        break;
   //****************************************************************************************************************
                    case 3:
                        System.out.println("usted a seleccionado rectangulo cuenta con dos operaciones son estas: ");
                        System.out.println("1. area");
                        System.out.println("2. perimetro");
                        System.out.print("selecciones que operacion desea saber: ");
                        int opcionrectangulo = sn.nextInt();

                        switch(opcionrectangulo){
                            case 1:
                                System.out.println("usted a seleccionado calcular el area ");
                                System.out.println("los datos del rectangulo son base 5cm y altura 10cm");
                                System.out.print("el area del rectangulo es: ");
                                System.out.println(fo.areaRectangulo(5,10)+"cm");
                                break;

                            case 2:
                                System.out.println("a seleccionado calcular perimetro");
                                System.out.println("los datos del rectangulo son base 5cm y altura 10cm");
                                System.out.print("el perimetro es: ");
                                System.out.println(fo.perimetroRectangulo(5,10)+"cm");
                                break;

                            default:
                                System.out.println("ingrese un numero de seleccion valido");
                        }
                        break;
   //******************************************************************************************************************
                    case 4:
                        System.out.println("usted a seleccionado circulo cuenta con dos operaciones son estas: ");
                        System.out.println("1. area");
                        System.out.println("2. circunferencia");
                        System.out.print("selecciones que operacion desea saber: ");
                        int opcioncirculo = sn.nextInt();

                        switch(opcioncirculo){

                            case 1:
                                System.out.println("usted a seleccionado calcular el area ");
                                System.out.println("los datos del circulo son radio de 10cm");
                                System.out.print("el area del circulo es de: ");
                                System.out.println(fo.areaCirculo(10)+"cm");
                                break;

                            case 2:
                                System.out.println("usted a seleccionado calcular circuferencia");
                                System.out.println("los datos del circulo son 10cm de radio");
                                System.out.print("el area del rectangulo es: ");
                                System.out.println(fo.circunferenciaCirculo(10)+"cm");
                                break;

                            default:
                                System.out.println("ingrese un numero de seleccion valido");
                        }
                        break;
   //*******************************************************************************************************************
                    case 5:
                        System.out.println("usted a seleccionado trapecio cuenta con dos operaciones son estas: ");
                        System.out.println("1. area");
                        System.out.println("2. perimetro");
                        System.out.print("selecciones que operacion desea saber: ");
                        int opciontrapecio = sn.nextInt();

                        switch(opciontrapecio){

                            case 1:
                                System.out.println("usted a seleccionado calcular el area ");
                                System.out.println("los datos del trapecio son base1 10cm, base2 12cm y altura 8cm");
                                System.out.print("el area del trapcecio es: ");
                                System.out.println(fo.areaTrapecio(10,12,8)+"cm");
                                break;

                            case 2:
                                System.out.println("usted a seleccionado calcular el perimetro ");
                                System.out.println("los datos del trapecio son base1 8cm, base2 12cm, lado1 10 y lado2 10cm");
                                System.out.print("el perimetro del trapcecio es: ");
                                System.out.println(fo.perimetroTrapecio(10,10,8,12)+"cm");
                                break;

                            default:
                                System.out.println("ingrese un numero de seleccion valido");
                        }


                        break;
  //********************************************************************************************************************
                    case 6:
                        System.out.println("usted a seleccionado rombo cuenta con dos operaciones son estas: ");
                        System.out.println("1. area");
                        System.out.println("2. perimetro");
                        System.out.print("selecciones que operacion desea saber: ");
                        int opcionrombo = sn.nextInt();

                        switch(opcionrombo){

                            case 1:
                                System.out.println("usted a seleccionado calcular el area ");
                                System.out.println("los datos del rombo son diagonal1 10cm y diagonal2 10cm");
                                System.out.print("el area del rombo es de: ");
                                System.out.println(fo.areaRombo(10,10)+"cm");
                                break;

                            case 2:
                                System.out.println("usted a seleccionado calcular el perimetro ");
                                System.out.println("los datos del rombo son lado1 10cm ");
                                System.out.print("el area del rombo es de: ");
                                System.out.println(fo.perimetroRombo(10)+"cm");
                                break;

                            default:
                                System.out.println("ingrese un numero de seleccion valido");
                        }
                        break;
                    default:
                        System.out.println("------seleccione una opcion valida -----");
   //********************************************************************************************************************************
              //..........................................................................................................................................................
                } //termina secundaria
                //..................................................................................................................


                break;
//---------------------------------------------------------------------------------------------------------------------------------
            case 2: //volumetricas
                System.out.println("usted selecciono las operaciones de las figuras geometricas volumetricas");
                System.out.println("estas son unas de ellas");
                System.out.println("1. cubo ");
                System.out.println("2. prisma ");
                System.out.println("3. piramide ");
                System.out.println("4. esfera ");
                System.out.println("5. cilindro ");
                System.out.println("6. cono ");
                System.out.println("7. prismahexagonal");
                System.out.println("8. paralelepipedo");
                System.out.println("selecciones el numero correspondiente de cada una para saber cual de estas");
                System.out.print("figuras volumetricas desea conocer su ecuacion. (todos los datos son en centimetros): ");
                int opciontercera = sn.nextInt();

                switch(opciontercera){
                    case 1:
                        System.out.println("usted a seleccionado el cubo");
                        System.out.println("estas son las ecuaciones del cubo");
                        System.out.println("1. volumen cubo");
                        System.out.println("2. area superficial");
                        int opcioncubo= sn.nextInt();

                        switch(opcioncubo){
                            case 1:
                            System.out.println("usted a seleccionado calcular el volumen del cubo");
                                System.out.println("los datos del cubo son el lado de 10cm");
                            System.out.println("el volumen del cubo  es:");
                            System.out.println(fo.volumenCubo(10)+"cm");
                            break;

                            case 2:
                                System.out.println("usted a seleccionado calcular el area superficial del cubo");
                                System.out.println("los datos del cubo son el lado de 10cm");
                                System.out.println("el area superficial del cubo  es:");
                                System.out.println(fo.areaCubo(10)+"cm");
                        }
                    default:
                        System.out.println("seleccione una opcion valida");
                        break;
      //********************************************************************************************************************
                    case 2:
                        System.out.println("usted a seleccionado prisma");
                        System.out.println("estas son las ecuaciones del prisma");
                        System.out.println("1. volumen prisma");
                        System.out.println("2. area prisma");
                        int opcionprisma = sn.nextInt();

                        switch(opcionprisma) {
                            case 1:
                                System.out.println("usted a seleccionado calcular el volumen del prisma");
                                System.out.println("los datos del prisma son base 10cm y altura 12cm");
                                System.out.println("el volumen del prisma  es:");
                                System.out.println(fo.volumenPrisma(10, 12) + "cm");
                                break;

                            case 2:
                                System.out.println("usted a seleccionado calcular el area superficial del prisma");
                                System.out.println("los datos del prisma son base 10cm y altura 12cm");
                                System.out.println("el area superficial del cubo  es:");
                                System.out.println(fo.areaPrisma(10, 12) + "cm");
                                break;

                            default:
                                System.out.println("seleccione una opcion valida");
                                break;
                        }

         //******************************************************************************************************************
                    case 3:
                        System.out.println("usted a seleccionado piramide");
                        System.out.println("estos son los datos de la piramide base 10cm y altura 12cm");
                        System.out.println("estas son las ecuaciones de la piramide ");
                        System.out.println("el volumen de la piramide es:");
                        System.out.println(fo.volumenPiramide(10,12) + "cm");

                        break;
        //********************************************************************************************************************
                    case 4:
                        System.out.println("usted a seleccionado esfera");
                        System.out.println("estas son las ecuaciones de la esfera");
                        System.out.println("1. volumen de la esfera");
                        System.out.println("2. area de la esfera");
                        int opcionesfera = sn.nextInt();

                        switch(opcionesfera) {
                            case 1:
                                System.out.println("usted a seleccionado calcular el volumen de la esfera");
                                System.out.println("los datos de la esfera son radio 10cm ");
                                System.out.println("el volumen de la esfera  es:");
                                System.out.println(fo.volumenEsfera(10)+ "cm");
                                break;

                            case 2:
                                System.out.println("usted a seleccionado calcular el area de la esfera");
                                System.out.println("los datos del prisma son radio 10cm");
                                System.out.println("el area de la esfera  es:");
                                System.out.println(fo.areaEsfera(10) + "cm");
                                break;

                            default:
                                System.out.println("seleccione una opcion valida");
                                break;
                        }

                        break;
        //********************************************************************************************************************
                    case 5:
                        System.out.println("usted a seleccionado cilindro");
                        System.out.println("estos son los datos del cilindro son radio 10cm y altura 12cm");
                        System.out.println("estas son las ecuaciones de la cilindro ");
                        System.out.println("el volumen de la cilindro es:");
                        System.out.println(fo.volumenCilindro(10,12) + "cm");

                        break;
        //********************************************************************************************************************
                    case 6:
                        System.out.println("usted a seleccionado cono");
                        System.out.println("estos son los datos del cono son radio 10cm y altura 12cm");
                        System.out.println("estas son las ecuaciones del cono");
                        System.out.println("el volumen del cono  es:");
                        System.out.println(fo.volumenCono(10,12)+"cm");

                        break;
        //********************************************************************************************************************
                    case 7:
                        System.out.println("usted a seleccionado prismahexagonal");
                        System.out.println("estos son los datos del prisma hexagonal son area 10cm y altura 12cm");
                        System.out.println("estas son las ecuaciones del prismahexagonal");
                        System.out.println("el volumen del prismahexagonal es:");
                        System.out.println(fo.volumenPrismaHexagonal(10,12)+"cm");

                        break;
        //********************************************************************************************************************
                    case 8:
                        System.out.println("usted a seleccionado paralelepipedo");
                        System.out.println("estos son los datos del cilindro son longitud 10cm, area 11cm y altura 12cm");
                        System.out.println("estas son las ecuaciones del paralelepipedo");
                        System.out.println("el volumen del paralelepipedo es:");
                        System.out.println(fo.volumenParalelepipedo(10,11,12)+"cm");

                        break;
        //********************************************************************************************************************
                }
                break;
//---------------------------------------------------------------------------------------------------------------------------------
            case 3:
                System.out.println("Gracias por utilizar mi programa");

                break;

            default:System.out.println("------seleccione una opcion valida -----");
        }
//termina aca el switch principal
// ---------------------------------------------------------------------------------------------------------------------------------

    }
}