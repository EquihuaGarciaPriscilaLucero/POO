import java.io.*;
class coche {

//Atributos
String color;
String marca;
int km;

//Metodo
public static void main(String [] args)
{

// Crear objeto
coche coche1 = new coche();

// Modificar atributos
coche1.color = "Rojo";
coche1.marca = "Mitsubishi";
coche1.km = 0;

//Mostrar por pantalla valores del objeto
System.out.print("El color del coche es :" +coche1.color);
System.out.print("La marca del coche es :" +coche1.marca);
System.out.print("El km del coche es :" +coche1.km);

}
}