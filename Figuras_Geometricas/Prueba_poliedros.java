package Figuras_Geometricas;
	import java.util.Scanner; // Importamos la clase scanner para interactuar con el usuario

	/* La clase Prueba es la encargada tanto de pintar los menú correspondientes
	   como de evaluar para cada opcion insertada por el usuario a que figura hace referencia el mismo
	   y posteriormente se encarga de pedir por teclado el valor al cual necesita realizar el calculo de los métodos 
	   definidos en la clase padre */
	
	public class Prueba_poliedros{

		public  static void MenuPrincipal(){
			System.out.println("------------ MENU PRINCIPAL -------------");
			System.out.println("------  Indique la figura geométrica: ---");
			System.out.println("-----   1.- Tetraedro -------------------");
			System.out.println("-----   2.- Cubo      -------------------");
			System.out.println("-----   3.- Octaedro  -------------------");
			System.out.println("-----   4.- Dodecaedro-------------------");
			System.out.println("-----   5.- Icosaedro -------------------");
			System.out.println("-----   6.- Esfera    -------------------");	
			System.out.println("-----------------------------------------");
			System.out.println("------- 0 - SALIR -----------------------");
		}
		
		// Menú exclusivo para la figura Esfera 
		
		private static void MenuEsfera() {
			System.out.println("Por favor, indique el Radio:");
		}
		
		// El menú poliedro es común a las  5 primeras figuras de nuestro menu principal
		
		public static void MenuPoliedro(){
			System.out.println("Por favor, indique la longitud del lado :");
		}
		
		// La declaración del menu resultado
		/* Este menú le dará al usuario finalmente el resultado que obtiene de 
		 de los calculos definidos para el parámetro ingresado */
		
		public static void MenuResultados(double superficie, double volumen){
		
			System.out.println("La superficie de la figura es " + superficie);
			System.out.println("El volumen de la figura es " + volumen);
			System.out.println("\n");
			
			
		}
		
		// Nuestro menú principal, que se encargará de realizar la ejecución de todo nuestro programa.
		
		public static void main(String args []){
			
			Scanner teclado = new Scanner(System.in); // Scanner obtendra el valor solicitado por el usuario
			int opcion, lado = 0;
			int Radio_esfe = 0;
			
			System.out.println(" Bienvenidos\n Vamos a empezar el ejercicio "); // Comenzamos la ejecución de cara al usuario
			MenuPrincipal(); // Llamada al metodo que muestra el menú
			opcion = teclado.nextInt(); 
			
			while (opcion != 0){ // Mientras la Opcion tecleada no sea 0 entramos en la seleccion.
				
				if ((opcion >= 1) && (opcion <= 6)) { // Si valor tecleado está entre 1..6 seguimos el hilo de ejecución de casos
					if ((opcion >= 1) && (opcion <= 5)) { // Para opciones menores que 5 se realizara el calculo de los poliedros
						MenuPoliedro();
						lado = teclado.nextInt(); 
					}
					 // si es extrictamente 6 la opcion introducida se ejecutará el método especifico para la esfera
					
					else if (opcion == 6){
						MenuEsfera();
						
					}
					switch (opcion){ // Segun la opcion nos introducimos en una clase u otra para realizar los calculos.
					
					
					case 1: // Tetraedro
						
						System.out.println("Estamos usando el Tetraedro");
						
						// Haciendo uso del Polimorfismo, vamos a instanciar los Objetos
						
						Figura miTetraedro = new Tetraedro(lado); // La instanciación del Objeto tetraedro
						MenuResultados(miTetraedro.getSuperficie(), miTetraedro.getVolumen()); // la llamada a los métodos de cálculo
						
						break;
						
					case 2: // cubo
						
						if ((opcion >= 2) && (opcion <= 6)) {
							
						}
						
						System.out.println("Estamos usando el Cubo");
						
						// Instancia del Objeto haciendo uso de Polimorfismo
						
						Figura MiCubo = new Cubo (lado); 
						MenuResultados(MiCubo.getSuperficie(), MiCubo.getVolumen());
						
						
						break;
						
					case 3: // octaedro
							
						if ((opcion >= 3) && (opcion <= 6)) {
							
		
						}
						
						System.out.println("Estamos usando el Octaedro");
						
						// Instancia del Objeto haciendo uso de Polimorfismo
						
						Figura MiOcta = new  Octaedro (lado); 
						MenuResultados(MiOcta.getSuperficie(), MiOcta.getVolumen());
						
						
						break;
						
					case 4: // dodecaedro
						
						if ((opcion >= 4) && (opcion <= 6)) {
							
							
						}
						
						System.out.println("Estamos usando el Dodecaedro");
						Figura MiDode = new  Dodecaedro (lado); 
						MenuResultados(MiDode.getSuperficie(), MiDode.getVolumen());
						
						
						break; 
						
					case 5 : // Icosaedro
						
						if ((opcion <= 5) && (opcion <= 6)) {
							
							
						}
						
						System.out.println("Estamos usando el Icosaedro");
						Figura MiIso= new  Icosaedro (lado); 
						MenuResultados(MiIso.getSuperficie(), MiIso.getVolumen());
						break;
					
					case 6 : // Esfera
						
						if ((opcion == 6) ) {
							Radio_esfe = teclado.nextInt();
						}
						
						System.out.println("Estamos usando la Esfera");
						Figura MiEsfe= new  Esfera (Radio_esfe); 
						MenuResultados(MiEsfe.getSuperficie(), MiEsfe.getVolumen());
						break;
						
					}					
				}
				System.out.println("Seleccione otra opción para continuar: \n"); // una ves calculada una figura, continuamos con la sgte
				MenuPrincipal(); 
				opcion = teclado.nextInt(); 
			}
			
			
			System.out.println("  ---------------  Gracias, Hemos terminado. -----------------");// Despedimos nuestro programa
			teclado.close(); // Cerramos el objeto Scanner
			
			
		}

		
	}
		
		
