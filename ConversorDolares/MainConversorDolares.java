import java.util.Scanner;

class MainConversorDolares {

    public static void main(String[] args) {
        Scanner dolares = new Scanner(System.in);
        double pesos;

        System.out.print("INGRESE LA CANTIDAD En PESOS: ");
        pesos = dolares.nextDouble();

        ConversorDolares convercion = new ConversorDolares();
        convercion.setPesos(pesos);
        convercion.setDolar(16.96);
        System.out.println(pesos + "  Pesos son  " + convercion.mostrarConvercion() + "  Dolares");

    }

}