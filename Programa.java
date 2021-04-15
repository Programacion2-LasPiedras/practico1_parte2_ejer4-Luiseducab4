import java.util.Scanner;

public class Programa {
	
	void iniciar() {
    double a=inicio();
    double b=inicio1();
    double c=inicio2();
    menu(a,b,c);
  }
	
	double inicio(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Asigne un valor a 'a'");
    double a=sc.nextDouble();
    return a;
  }
  double inicio1(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Asigne un valor a 'b'");
    double b=sc.nextDouble();
    return b;
  }
  double inicio2(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Asigne un valor a 'c'");
    double c=sc.nextDouble();
    return c;
  }
  void menu(double a, double b, double c){
    int menu;
    do{ 
       Scanner sc=new Scanner(System.in);
       System.out.println("");  
       System.out.println("1. El cuadrado y la raíz cuadrada de cada valor."); 
       System.out.println("2. Bhaskara utilizando ax2 + bx + c.");
       System.out.println("3. El mayor de tres números, reutilizando el método que calcula el mayor de 2.");
       System.out.println("4. Circunferencia, siendo a, b y c tres valores de radio distinto.");
       System.out.println("0. Salir");
       System.out.println("");
       System.out.println("Ingrese una opcion");
       System.out.println("");
       menu = sc.nextInt(); 
            
      switch(menu) 
      {
        case 1: 
        case1(a,b,c);
        break;

        case 2:
        case2(a,b,c);
        break;

        case 3:
        case3(a,b,c);
        break;

        case 4:
        case4(a,b,c);
        break;

        case 0:
        System.out.println("¡Adiós! :)");
        System.exit(0);
      }
   
      }while (menu !=5);
  }

  void case1(double a, double b, double c){
    System.out.println("");
    System.out.println("a=" + a);
    System.out.println("b=" + b);
    System.out.println("c=" + c);
    System.out.println("");
    System.out.println("El cuadrado del valor " + a + " es " + Math.pow(a,2));
    System.out.println("El cuadrado del valor " + b + " es " + Math.pow(b,2));
    System.out.println("El cuadrado del valor " + c + " es " + Math.pow(c,2));
    System.out.println("");
    System.out.println("La raíz cuadrada de " + a + " es " + Math.sqrt(a));
    System.out.println("La raíz cuadrada de " + b + " es " + Math.sqrt(b));
    System.out.println("La raíz cuadrada de " + c + " es " + Math.sqrt(c));
  }
  void case2(double a, double b, double c){
    System.out.println("");
    System.out.println("a=" + a);
    System.out.println("b=" + b);
    System.out.println("c=" + c);
    System.out.println("");
    bhaskara(a,b,c);
  }
  void bhaskara(double a, double b, double c){
    double alfa=Math.pow(b,2) - ((4*a)*c);
    if (alfa > 0){
      double bhaskara1=(-(b)+Math.sqrt(alfa))/(2*a);
      double bhaskara2=(-(b)-Math.sqrt(alfa))/(2*a);
    }
    if (alfa==0){
      double bhaskara1=(-(b))/(2*a);
    }
    if (alfa < 0){
      System.out.println("No se puede hacer raíz cuadrada de un número negativo");
    }
  }
  void case3(double a, double b, double c){
    System.out.println("");
    System.out.println("a=" + a);
    System.out.println("b=" + b);
    System.out.println("c=" + c);
    System.out.println("");
    double mayor=Math.max(a,b);
    System.out.println("El número mayor entre los tres valores es " + Math.max(mayor,c));
  }
  void case4(double a, double b, double c){
    System.out.println("");
    System.out.println("a=" + a);
    System.out.println("b=" + b);
    System.out.println("c=" + c);
    System.out.println("");
    System.out.println("La circunferencia tomando el valor 'a' como radio es " + Math.PI*(a*2));
    System.out.println("La circunferencia tomando el valor 'b' como radio es " + Math.PI*(b*2));
    System.out.println("La circunferencia tomando el valor 'c' como radio es " + Math.PI*(c*2));
  }
  
	

}
	
