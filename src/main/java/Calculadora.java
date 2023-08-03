import java.util.Scanner;
import java.lang.Math;

public class Calculadora {
    public static void main(String[] args){
        byte menu;
        do{
            //Hacer un menu
            System.out.println("1.- Ceil y floor");
            System.out.println("2.- Pow");
            System.out.println("3.- Max");
            System.out.println("4.- sqrt");
            System.out.println("5.- Área de un círculo");
            System.out.println("6.- Área de una esfera: ");
            System.out.println("Elije un numero de acuerdo al menú anterior o termina con 0: ");

            Scanner scanner = new Scanner(System.in);
            menu = scanner.nextByte();

            switch(menu) {
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    //Pedir un numero por consola
                    System.out.println("Ingresa un numero: ");
                    Scanner dbScanner = new Scanner(System.in);
                    double db = dbScanner.nextDouble();
                    //Devuelve un entero hacia arriba
                    System.out.println("Con ceil(): " + Math.ceil(db));
                    //Devuelve un entero hacia abajo
                    System.out.println("Con floor(): " + Math.floor(db));
                    break;
                case 2:
                    //Devuelve un numero elevado a otro
                    System.out.println("Ingresa una base: ");
                    Scanner baseScanner = new Scanner(System.in);
                    byte base = baseScanner.nextByte();
                    System.out.println("Ingresa un exponente: ");
                    Scanner exponenteScanner = new Scanner(System.in);
                    byte ex = exponenteScanner.nextByte();
                    System.out.println("El resultado de elevar " + base + " al exponente " + ex + " es: " + Math.pow(base, ex));
                    break;
                case 3:
                    //Devuelve el numero mayor entre dos numeros
                    System.out.println("Ingresa un numero: ");
                    Scanner xScanner = new Scanner(System.in);
                    byte x = xScanner.nextByte();
                    System.out.println("Ingresa el segundo numero: ");
                    Scanner yScanner = new Scanner(System.in);
                    byte y = yScanner.nextByte();
                    System.out.println("El numero mayor entre " + x + " y" + y + " es: " + Math.max(x, y));
                    break;
                case 4:
                    System.out.println("Ingresa un numero entero: ");
                    Scanner sqrtScanner = new Scanner(System.in);
                    int sqrt = sqrtScanner.nextInt();
                    System.out.println("La raiz cuadrada de " + sqrt + " es: " + Math.sqrt(sqrt));
                    break;
                case 5:
                    System.out.println("Ingresa el radio: ");
                    Scanner radScanner = new Scanner(System.in);
                    float radio = radScanner.nextFloat();
                    double resultado = Math.PI * Math.pow(radio, 2);
                    System.out.println("El área del círculo es: " + String.format("%.2f", resultado));
                    break;
                case 6:
                    System.out.println("Ingresa el radio de la esfera: ");
                    Scanner r2Scan = new Scanner(System.in);
                    byte rad2= r2Scan.nextByte();
                    double result = 4 * Math.PI * Math.pow(rad2, 2);
                    System.out.println("El área de la esfera es " + String.format("%.2f", result));
                    break;
                default:
                    System.out.println("Ingresa un numero entero valido, intentalo de nuevo");
            }
        }while(menu != 0);
    }
}
