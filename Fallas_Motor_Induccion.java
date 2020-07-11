/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fallas_motor_induccion;

/**
 *
 * @author Erick Unda
 */
import java.util.Scanner;

public class Fallas_Motor_Induccion {

    public static String Identificar_tipo_motor_induccion(){
Scanner objeto=new Scanner(System.in);
int codigo;
int valor_voltaje;
String tipo_voltaje;
System.out.println("Ingrese el código del motor:");
codigo=objeto.nextInt();
System.out.println("Ingrese el voltaje del motor:[Voltios]");
valor_voltaje=objeto.nextInt();
System.out.println("Ingrese el tipo de voltaje del  motor de induccion:[continua-alterna]" );
tipo_voltaje=objeto.nextLine();
return        " El codigo es:" + codigo +"\n"+ "El tipo de voltaje del motor es:" + tipo_voltaje + "\n"
                + "\n El voltaje de entrada es: " + valor_voltaje + "\n";

      }
    public static String Comprobar_voltaje_motor_induccion(){
          Scanner objeto=new Scanner(System.in);
    String tipo_senial;
    System.out.println("Ingrese el tipo de señal del  motor:");
    tipo_senial=objeto.nextLine();
return "La señal del motor de induccion es:" +tipo_senial+ "";
    }

public static String Ingresar_tipo_falla_motor_induccion(){
    Scanner objeto=new Scanner(System.in);
    String tipo_falla;
    int numero_falla;
    System.out.println("Ingrese el tipo de falla del motor, separe con un guion:");
tipo_falla=objeto.nextLine();
System.out.println("Ingrese el número de fallas del motor:");
numero_falla=objeto.nextInt();
return "El motor de inducción tiene las siguientes fallas:" +tipo_falla+ "\n" +"El numero de fallas ingresadas son:" +numero_falla+ "\n";
}
public static String Solicitar_caracteristicas_fallas_motor_induccion(){
    Scanner objeto=new Scanner(System.in);
    String caracteristica_falla;
    System.out.println("Ingrese las caracteristicas de las fallas, separe con un guion::");
    caracteristica_falla=objeto.nextLine();
    return "El motor de inducción tiene las siguientes caracteristicas de falla\n" + caracteristica_falla +"";
}
public static String Determinar_solucion_motor_induccion(){
       Scanner objeto=new Scanner(System.in);
String solucion_motor_induccion;
System.out.println("Ingrese la solucion de la falla del motor");
solucion_motor_induccion=objeto.nextLine();
        return "La solucion de las fallas encontradas son:\n" +solucion_motor_induccion+ "";
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println(Identificar_tipo_motor_induccion());
         System.out.println(Comprobar_voltaje_motor_induccion());
         System.out.println(Ingresar_tipo_falla_motor_induccion());
         System.out.println(Solicitar_caracteristicas_fallas_motor_induccion());
System.out.println(Determinar_solucion_motor_induccion());
System.out.println("El sistema de solucion sera efectivo");
    }
}
