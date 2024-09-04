import java.util.Scanner;

public class Calculadora {
        int x;
        int y;
        int z;
        //constructor
        public Calculadora(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        }
        //metodo SUMA
        public void sum() {
        System.out.println("La Suma de los numeros es: " + (x + y));
        }
        //metodo RESTA
        public void rest() {
        System.out.println("La Resta de los numeros es: " + (x - y));
        }
        //metodo MULSTIPLICAR
        public void mult() {
        System.out.println("La Multiplicacion de los numeros es: " + (x * y));
        }
        //metodo DIVIDIR
        public void div() {
        System.out.println("La Division de los numeros es: " + (x / y));
        }
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce el primer numero: ");
            int x = scanner.nextInt();
            System.out.println("Introduce el segundo numero: ");
            int y = scanner.nextInt();
            System.out.println("Que operacion quieres realizar: ");
            System.out.println("---------------------------------");
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("---------------------------------");
            System.out.println("Introduce el numero de la operacion: ");
            int z = scanner.nextInt();
            scanner.nextLine();
            //llamamos al constructor
            Calculadora calc = new Calculadora(x, y, z);
            //llamamos los metodos con switch para seleccionar la operacion
            switch (z) {
            case 1: calc.sum();
            break;
            case 2: calc.rest();
            break;
            case 3: calc.mult();
            break;
            case 4: calc.div();
            break;
            default: System.out.println("Operacion no valida");
            }
        }
}