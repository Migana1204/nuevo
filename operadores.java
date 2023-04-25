import java.util.Scanner;
/*
 * mensuales: 1000
 * comision de 150*auto vendido
 * mas el 5% del valor del auto 
 * 
 * 
 * 
 */
public class operadores {
    public static void main(String[] args) {
        Scanner nuScanner = new Scanner(System.in);
        Double mensDouble,autosDouble, valorauto, comision, ycomision; 
        System.out.println("valor del auto");
        valorauto= nuScanner.nextDouble(); 
        System.out.println("Autos vendidos");
        autosDouble= nuScanner.nextDouble();
        comision= 150*autosDouble;
        ycomision= valorauto*0.05;
        mensDouble= comision+ycomision+1000;
        System.out.println("SU COMISION ES DE: "+ comision);
        System.out.println("SU COMISION AGREGADA ES: "+ ycomision); 
        System.out.println("el numero entero es: " + mensDouble);


        Scanner nuevo= new Scanner(System.in); 
        float nota1, nota2, nota3, notafinal, total;
        System.out.println("nota numero 1: ");
        nota1= nuevo.nextFloat(); 
        System.out.println("segunda nota: ");
        nota2= nuevo.nextFloat(); 
        System.out.println("digite La nota 3: ");
        nota3 = nuevo.nextFloat();
        System.out.println("digite la nota final: ");
        notafinal = nuevo.nextFloat(); 
        nota1 *= 0.10F;
        nota2 *= 0.25f; 
        nota3 *= 0.25f; 
        notafinal *= 0.40f;
        total= nota1+nota2+nota3+notafinal; 
        System.out.println(" su nota final es de: "+ total);


    }
}
