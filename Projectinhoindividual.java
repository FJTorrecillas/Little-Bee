import java.util.Scanner;
import java.lang.Double;
public class Projectinhoindividual {
	Scanner teclaopciones = new Scanner(System.in);
	Scanner teclanombres = new Scanner(System.in);
	Scanner teclacoords = new Scanner (System.in);

	int where;
	String buscadito;
	
	String cedulaA [] = new String [10];
	String apicultores []= new String[10];
	String ciudad []= new String[10];
	String ciudad_nombres[] = new String[10];
	String colmenares[]= new String[10];
	String centros[] = new String [5];
	String tramos []= new String [5];

	
	double coXeY [] = new double [20];
	double coXeY2 []= new double [20];
	double coXeY3 []= new double [10];
	double coXeYFeI [] = new double [20];
	
	 String rojo = "\u001B[31m";
	 String verde = "\u001B[32m";
	 String amarillo = "\u001B[33m";
	 String marron = "\033[130;33m";
	 String azul = "\u001B[34m";
	 String purpura = "\u001B[35m";
	 String celeste = "\u001B[36m";
	 String normal = "\u001B[0m";
	 
	
	
	
	
public void menuPrincipal(){
	
		
	
		 
	do {
		System.out.println (celeste+"Bienvenido al men� Principal de este programa"+normal);
		System.out.println("Seleccione a que men� quiere ir");
		System.out.println ("1 - Ir al men� de Apicultores");
		System.out.println ("2 - Ir al men� de Ciudades");
		System.out.println ("3 - Ir al men� de Colmenares");
		System.out.println ("4 - Ir al men� de Centros de extracci�n");
		System.out.println ("5 - Ir al men� de Tramos");
		System.out.println ("6 - Ir al men� de Estad�sticas");
		System.out.println ("7 - Salir del programa");
			where = teclaopciones.nextInt();
			
				switch (where) {
					case 1:
							System.out.println (verde+"Dirigiendolo al men� de Apicultores"+normal);
							System.out.println(verde+"..."+normal);
						menuApicultor();
						break;
					case 2:
							System.out.println (verde+"Dirigiendolo al men� de Ciudades" +normal);
							System.out.println(verde+"..."+normal);
						menuCiudad();
						break;
					case 3:
							System.out.println (verde+"Dirigiendolo al men� de Colmenares"+normal);
							System.out.println(verde+"..."+normal);
							menuColmenar();
						break;
					case 4:
							System.out.println (verde+"Dirigiendolo al men� de Centros de extracci�n"+normal);
							System.out.println(verde+"..."+normal);
							menuCentroDeExtraccion();
						break;
					case 5:
							System.out.println (verde+"Dirigiendolo al men� de Tramos"+normal);
							System.out.println(verde+"..."+normal);
							menuTramo();
						break;
					case 6:
							System.out.println (verde+"Dirigiendolo al men� de Estadisticas"+normal);
							System.out.println(verde+"..."+normal);
							menuEstadisticas();
							break;
					case 7:
					System.out.println (verde+"Saliendo del programa"+normal);
					System.out.println (verde +"..."+normal);
					                          System.exit(0);
					default:
						System.out.println( rojo + "Esa opci�n no est� codificada"+ normal);
						System.out.println (verde +"..." + normal);
						
						break;
				}
		}while (where!=7);
	}
	public void menuApicultor(){
		
		do {
				System.out.println (celeste+"Bienvenido al men� de Apicultores"+normal);
				System.out.println("�Qu� quiere hacer?");
				System.out.println("1- Registrar Apicultor");
				System.out.println("2- Mostrar Apicultores");
				System.out.println ("3- Buscar Apicultor");
				System.out.println ("4- Modificar Apicultor");
				System.out.println("5- Borrar Apicultor");
				System.out.println ("6- Regresar al men� Principal");
					where = teclaopciones.nextInt();
				
					switch (where) {
						case 1:
							System.out.println(verde+"Ahora lo estamos enviando al men� para Registrar Apicultores"+normal);
							System.out.println(celeste+"Para registrar un Apicultor ingrese los siguientes datos que se le pediran del apicultor");
							System.out.println(verde+"..."+normal);
								registrarApicultor();
				
						break;
						case 2:
							System.out.println(verde+"Ahora lo estamos enviando al men� para mostrar el listado de Apicultores"+normal);
				
							System.out.println(verde+"..."+normal);
								listadoDeApicultores();
				
				
						break;
						
						case 3:
							System.out.println (verde+"Ahora lo estamos enviando al men� para buscar Apicultores"+normal);
								buscarLeApicolteur();
			
							System.out.println(verde+"..."+normal);
				
						break;
						
						case 4:
							System.out.println(marron+"NO_IMPLEMENTADA"+normal);
							System.out.println(verde+"..."+normal);
			
						break;
						
						case 5:
							System.out.println(marron+"NO_IMPLEMENTADA"+normal);
							System.out.println(verde+"..."+normal);				
						break;
						
						case 6:
							System.out.println (purpura+"Regresando al Men� Principal");
							System.out.println (verde+"..."+normal);
							menuPrincipal();
						break;
				
						default:
							System.out.println(rojo+"Esa opci�n no est� codificada");
							System.out.println(verde+"..."+normal);
						break;
				}
				
		}while (where !=6);
				}
						public void registrarApicultor(){
							
							String cedula; 
							String nombre; 
							String direccion; 
								String calle;
								String barrio;
								String numero;
								String pais;
							String ciudad; 
							String departamento; 
							String email; 
							String tel�fono;
							int anioDeRegistro;
						
							System.out.println (verde+"----------------------------------------"+normal);
							System.out.println (verde+"--------Registrar apicultores-----------"+normal);
							System.out.println (verde+"----------------------------------------"+normal);
							
								do {
									System.out.println(celeste+"Ingrese la C�dula de Identidad del apicultor"+normal);
									System.out.println(amarillo+"No utilize puntos ni guiones ni espacios"+normal);
									cedula = teclanombres.nextLine();
									
										if (cedula.length() !=8 || cedula.contains("-") || cedula.contains ((" ")) || cedula.contains(".")) {
											System.out.println(rojo+"Introdujo la c�dula incorrectamente");
						
										}
									} while (cedula.length() != 8);
					
								do { 
									System.out.println(celeste+"Ingrese el nombre del apicultor"+normal);
									nombre= teclanombres.nextLine();
									
										if (nombre.length() < 2 ) {
											System.out.println (rojo+ "Introdujo el nombre del apicultor incorrectamente"+normal);
										
										}
					
									}while (nombre.length() < 2);
								
								do {
									System.out.println(celeste+"Ingrese la calle en la que vive el apicultor" +normal);
									calle = teclanombres.nextLine();
									if (calle.length() < 2) {
										System.out.println(rojo+"El nombre la calle ingresado es inv�lido"+normal);
									}
								}while (calle.length() <2);
								
								do { 
									System.out.println(celeste+"Ingrese el nombre del barrio en el que vive el apicultor"+normal);
									barrio= teclanombres.nextLine();
									 if (barrio.length() < 2) {
										 System.out.println (rojo+"El nombre del barrio ingresado es inv�lido"+normal);
									 }
									}while (barrio.length() < 2);
								
								do {
									System.out.println(celeste +"Ingrese el n�mero de puerta de la casa del apicultor"+normal);
					
									numero = teclanombres.nextLine();
										if (numero.length() !=4) {
											System.out.println(rojo+"Introdujo el n�mero incorrectamente");
										}
										
									} while (numero.length() != 4 );
								
								do { 
									System.out.println(celeste+"Ingrese el nombre del pa�s en el que vive el apicultor"+normal);
										pais = teclanombres.nextLine();
										if (pais.length() < 2 ) {
											System.out.println (rojo+"El nombre del pa�s es inv�lido"+normal);
										}
									}while (pais.length() < 2);
								
								do { 
									System.out.println(celeste+"Ingrese el nombre de la ciudad en la que vive el apicultor "+normal);
									ciudad=teclanombres.nextLine();																												
									
									if (ciudad.length() < 2) {
										System.out.println(rojo+"El nombre de la ciudad es inv�lida"+normal);
									}
									}while (ciudad.length() < 2);
								
								do { 
									System.out.println(celeste+"Ingrese el nombre de el departamento en el que vive el apicultor "+normal);
									departamento=teclanombres.nextLine();																												
									
									if (departamento.length() < 2) {
										System.out.println(rojo+"El nombre del departamento es inv�lido"+normal);
									}
									}while (departamento.length() < 2);
								
							direccion = ("calle " + calle + "; barrio "+barrio + "; puerta " + numero + "; pais " + pais);
							 	
								do { 
									System.out.println(celeste+"Ingrese el Correo Electronico del apicultor "+normal);
									email=teclanombres.nextLine();																												
								
										if (email.length() >= 256 || email.length() < 14 ) {
											System.out.println(rojo+"El Correo Electronico ingresado del apicultor es inv�lido"+normal);
										}
								}while (email.length() >= 256 ||email.length() < 14);
							
								do {
									System.out.println(celeste+"Ingrese tel�fono del apicultor sin c�digo de pa�s"+normal);
									tel�fono = teclanombres.nextLine();
								
										if (tel�fono.length() != 9 ) {
											System.out.println(rojo+ "El tel�fono ingresado es inv�lido"+normal);
										}
								}while (tel�fono.length() != 9);
								
								do {
									System.out.println (celeste+"Ingrese el a�o en el que se registr� al apicultor en la Sociedad Ap�cola"+normal);
									anioDeRegistro= teclaopciones.nextInt();
									if (anioDeRegistro <0 || anioDeRegistro > 2023 || anioDeRegistro < 1934) {
									System.out.println(rojo+"El a�o ingresado es inv�lido"+normal);
									}
									
								}while (anioDeRegistro <0 || anioDeRegistro > 2023 || anioDeRegistro < 1934);
								
								for (int lugar=0; lugar<apicultores.length;lugar++) {
									if (cedulaA[lugar]==null) {
										cedulaA[lugar]=cedula;
									}else if (cedulaA[lugar+1]==null) {
										cedulaA[lugar+1]=cedula;
									}
									
								if (apicultores [lugar] == null) {
								
									apicultores [lugar] = ("Apicultor "+lugar+":" 
								+ "C�dula: " + cedula+" Nombre: "+ nombre + " Direcci�n: "+ direccion
								+ " Ciudad: "+ ciudad + " Departamento: " +departamento+ " Correo electr�nico: "+ email + " Tel�fono: "+ tel�fono + " A�o de registro: "+ anioDeRegistro);
									System.out.println (celeste+"Se ha registrado exitosamente a el apicultor"+normal);
										
									lugar=9;
								}
								}
								System.out.println(verde+"Ahora lo estamos regresando al men� de Apicultores"+normal);
								
								System.out.println(verde+"..."+normal);
								menuApicultor();
						
						}
						public void buscarLeApicolteur() {
							int error=0;
							do {
								System.out.println (verde+"----------------------------------------"+normal);
								System.out.println (verde+"-----------Buscar apicultores-----------"+normal);
								System.out.println (verde+"----------------------------------------"+normal);
							
								
								System.out.println(celeste+"Ingrese la c�dula de un apicultor para buscarlo"+normal);
								buscadito = teclanombres.next();
								for (int lugar=0;lugar<apicultores.length;lugar++) {
									
								if (buscadito.length()!= 8) {
									System.out.println(rojo+"C�dula ingresada incorrectamente"+normal);
								} else {
									
										if(cedulaA[lugar].contains(buscadito)) { 
									System.out.println (apicultores[lugar]);
									lugar=apicultores.length;
										}else {
											error=error+1;
											if (error==10) {
										System.out.println(rojo+ "Cedula ingresada no registrada"+normal);
											}
										}
										
									}
									
								}
								
								
								System.out.println (celeste+ "Si quiere volver al men� de Apicultores: precione 1"+normal);
								System.out.println (celeste+"Para buscar otro  apicultor precione cualquier otro n�mero"+normal);
								where= teclaopciones.nextInt();
								
								if (where == 1) {
								System.out.println(verde+"Ahora lo estamos regresando al men� de Apicultores"+normal);
								
								System.out.println(verde+"..."+normal);
								menuApicultor();
								}
							}while (where != 1);
							
				
						}
						public void listadoDeApicultores(){
							
						
		
						
							do {
								System.out.println (verde+"----------------------------------------"+normal);
								System.out.println (verde+"--------Listado de apicultores----------"+normal);
								System.out.println (verde+"----------------------------------------"+normal);
								
							for (int lugar=0; lugar<apicultores.length;lugar++) {
								System.out.println (verde+"----------------------------------------"+normal);
							    if (apicultores [lugar]== null){
							        System.out.println(amarillo+"Espacio disponible para apicultor"+normal);
								    }else {
								    	System.out.println(apicultores[lugar]);
								     }
									System.out.println (verde+"----------------------------------------"+normal);
							}
									
								System.out.println (celeste+ "Si quiere volver al men� de Apicultores: precione 1"+normal);
								where= teclaopciones.nextInt();
							}while (where != 1);
								menuApicultor();


}
	public void menuCiudad(){
		

		do {
			System.out.println (celeste+"Bienvenido al men� de Ciudades"+normal);
			System.out.println("�Qu� quiere hacer?");
			System.out.println("1- Registrar Ciudad");
			System.out.println("2- Buscar Ciudad");
			System.out.println("3- Mostrar Ciudades");
			System.out.println("4- Modificar Ciudad");
			System.out.println("5- Borrar Ciudad");
			System.out.println("6- Regresar al men� Principal");
				where = teclaopciones.nextInt();

					switch (where) {
						case 1:
							System.out.println(verde+"Ahora lo estamos enviando al men� para Registrar Ciudades"+normal);
							System.out.println(celeste+"Para registrar un Ciudad ingrese los siguientes datos que se le pediran del apicultor");
							
							System.out.println(verde+"..."+normal);
										registrarCiudad();

						break;
						case 2:
							System.out.println(marron+"NO_IMPLEMENTADA"+normal);
							System.out.println(verde+"..."+normal);
						break;
						case 3:
							System.out.println(verde+"Ahora lo estamos enviando al men� con el listado de Ciudades");
							
	
							System.out.println(verde+"..."+normal);
							listadoDeCiudades();

						break;
	
						case 4:
							System.out.println(marron+"NO_IMPLEMENTADA"+normal);
							System.out.println(verde+"..."+normal);
	
	
						break;
						
						case 5:
							System.out.println(marron+"NO_IMPLEMENTADA"+normal);
							System.out.println(verde+"..."+normal);
						
		
						break;
						
						case 6:
							System.out.println (purpura+"Regresando al Men� Principal"+normal);
							System.out.println (verde+"..."+normal);
								menuPrincipal();
						break;
						default:
							
							System.out.println(marron+"Esa opci�n no est� codificada"+normal);
							System.out.println(verde+"..."+normal);
						break;
						
					}
					
			}while (where !=1);
	}
					public void precargarCiudad(){
						
						//Piri�polis
						coXeY[0]=(-55.2747100);
						coXeY[1]=(-34.8628700);
						ciudad[0] = ("Nombre de la ciudad: "  + "Piri�polis" + " Coordenadas: "+ "X: " + coXeY[0] + " Y: " + coXeY[1]);
						
						
						//Melo
						coXeY[2]=(-54.1675000);
						coXeY[3]=(-32.3702800);
						ciudad[1] = ("Nombre de la ciudad: "  +  "Melo" + " Coordenadas: "+ "X: " +coXeY[2]+ " Y: " +coXeY[3]);
						
						//PdelEste
						coXeY [4]=(-54.9338200);
						coXeY [5]=(-34.9474700);
						ciudad[2] = ("Nombre de la ciudad: " +  "Punta del Este" +  " Coordenadas: "+ "X: " +coXeY[4]+  " Y: "+coXeY[5]);
						
						//Montevideo
						coXeY [6]=(-56.1881600);
						coXeY [7]=(-34.9032800);
						ciudad[3] = ("Nombre de la ciudad: " +  "Montevideo" +  " Coordenadas: "+"X: "+coXeY[6]  + " Y: "+coXeY[7]);
						
						//Paysandu
						coXeY [8]=(-58.0755600);
						coXeY [9]=(-32.3213900);
						
						ciudad[4] = ("Nombre de la ciudad: " +  "Paysand�" +  " Coordenadas: "+ "X: " +coXeY[8] + " Y: "+coXeY[9] );
						
						System.out.println(verde+"Se han cargado las ciudades del sistema correctamente"+normal);
							
					}
					public void registrarCiudad(){
						
						
						double coordX=0;
				
						double coordY=0;
				
						String nombre;
						
						do {	
						System.out.println (verde+"----------------------------------------"+normal);
						System.out.println (verde+"-----------Registrar Ciudades------------"+normal);
						System.out.println (verde+"----------------------------------------"+normal);
							
						for (int lugarcito=0; lugarcito<ciudad.length;lugarcito++) {
				
							if (ciudad[lugarcito]==null) {
								
											do {
							 					System.out.println(celeste+"Ingrese el nombre de la ciudad"+normal);
							 					nombre = teclanombres.nextLine();
							 					if (nombre.length()<2) {
							 						
							 						System.out.println(rojo+"ERROR: El nombre ingresado no es v�lido."+normal);
							 						}
							 					
											    }while (nombre.length()<2);
											
											do {
												System.out.println(celeste+"Ingrese la coordenada X de la ciudad ha registrar"+normal);
												coordX = teclacoords.nextDouble();
												if (coordX < -180 || coordX > 180) {
												 System.out.println(rojo+"ERROR: La coordenada ingresada no es v�lida."+normal);
												}
											 }while (coordX < -180 || coordX > 180);
											 	
											 do {
											 	System.out.println(celeste+"Ingrese la coordenada Y de la ciudad ha registrar"+normal);
											 		coordY = teclacoords.nextDouble();
											 			if (coordY < -90 || coordY > 90) {
											 				System.out.println(rojo+"ERROR: La coordenada ingresada no es v�lida."+normal);
											 			}
											 			}while (coordY < -90 || coordY > 90);
											
											 		for (int l=0; l<coXeY.length;l=l+2) {
											 			
											 			if (Double.compare (coordX, coXeY[l]) == 0 && Double.compare (coordY, coXeY[l+1])== 0) {
											 					System.out.println(rojo+"ERROR 1: Ya existe un punto en las coordenadas coordX, coordY del sistema."+normal);
											 					lugarcito=9;
											 					l= 19;

											 			} else if (Double.compare (coordX, coXeY[l])  != 0 && Double.compare (coordY, coXeY[l+1]) != 0){
											 								coXeY[l] = coordX;
														 					coXeY[l+1] = coordY;
														 					ciudad[lugarcito]= ("Nombre de la ciudad: "+ nombre + " Coordenadas: " +"X: "+ coXeY[l] +" Y: " + coXeY[l+1]);
														 					for (int i=0; i<ciudad_nombres.length;i++) {
														 						if (ciudad_nombres[i]==null ) {
														 								ciudad_nombres[i]= nombre;
														 						}
														 					}
														 					System.out.println(verde+"OK"+normal);
														 					lugarcito=9;
														 					l= 19;

											 			}

											 			}
							
													 				}
											 			
						}
						System.out.println("1- Salir de Registrar Ciudad");
						System.out.println("Cualquier otro n�mero- Volver a registrar");
						where = teclaopciones.nextInt();
						
					}while (where !=1);
					System.out.println(verde+"Regresandolo al men� ciudad");
					System.out.println(verde+"..."+normal);
						menuCiudad();
						}
					public void listadoDeCiudades(){
						
						
						
						
						do {
							System.out.println (verde+"---------------------------------------------"+normal);
							System.out.println (verde+"----------Listado de Ciudades---------"+normal);
							System.out.println (verde+"----------------------------------------------"+normal);
							
						for (int lugar=0; lugar<ciudad.length;lugar++) {
							System.out.println (verde+"----------------------------------------"+normal);
						    if (ciudad [lugar]== null){
						        System.out.println(amarillo+"Espacio disponible para ciudad"+normal);
							    }else {
							    	System.out.println(ciudad[lugar]);
							     }
								System.out.println (verde+"----------------------------------------"+normal);
						}
								
							System.out.println ("Si quiere volver al men� de ciudades: precione 1");
							where= teclaopciones.nextInt();
						}while (where != 1);
							menuCiudad();


}
	public void menuColmenar(){
		
		do {
	
			System.out.println (celeste+"Bienvenido al men� de Colmenares"+normal);
			System.out.println("�Qu� quiere hacer?");
			System.out.println("1- Registrar Colmenar");
			System.out.println("2- Buscar Colmenar");
			System.out.println ("3- Mostrar Colmenares");
			System.out.println ("4- Modificar Colmenar");
			System.out.println("5- Borrar Colmenar");
			System.out.println("6- Listado de colmenares en ciudades");
			System.out.println ("7- Regresar al men� Principal");
				where = teclaopciones.nextInt();
	
				switch (where) {
				
				case 1:
					System.out.println(amarillo+"Ahora lo estamos enviando al menu para registrar Colmenares"+normal);
					
					System.out.println(verde+"..."+normal);
					registrarColmenar();
					
				break;
				
				case 2:
					System.out.println(marron+"NO_IMPLEMENTADA"+normal);
					System.out.println(verde+"..."+normal);
				break;
				case 3:
					System.out.println(verde+"Ahora lo estamos enviando a el men� con el listado de colmenares"+normal);
					System.out.println(verde+"..."+normal);
					listadoDeColmenares();
				break;
				case 4:
					System.out.println(marron+"NO_IMPLEMENTADA"+normal);
					System.out.println(verde+"..."+normal);
	
				break;
				
				case 5:
					System.out.println(marron+"NO_IMPLEMENTADA"+normal);
					System.out.println(verde+"..."+normal);
	
				break;
				
				case 6:
					System.out.println(verde+"Ahora lo estamos enviando a el men� con el listado de colmenares en ciudades"+normal);
					System.out.println(verde+"..."+normal);
					listadoDeColmenaresEnCiudad();
				break;
				
				case 7:
					System.out.println (purpura+"Regresando al Men� Principal"+normal);
					System.out.println (verde+"..."+normal);
						menuPrincipal();
				break;
				
				default:
					System.out.println(rojo+"Esa opci�n no est� codificada");
					System.out.println(verde+"..."+normal);

				break;
				
				}
		}while (where !=6);
	}
	
						public void registrarColmenar(){
							
							double coordX; 
					
							double coordY; 
					
							String apicultor; 
					
							int capacidad; 
							
							int error=0;
							
							do {
								System.out.println (verde+"-----------------------------------------------"+normal);
								System.out.println (verde+"------------Registrar Colmenar----------"+normal);
								System.out.println (verde+"-----------------------------------------------"+normal);
								
								 
							for (int i=0; i<colmenares.length; i++) {	
								
								if (colmenares[i]==null) {
		
							for (int lugarcito=0; lugarcito<cedulaA.length; lugarcito++) {
								 	
								do {
									 System.out.println (celeste+"Ingrese la c�dula del apicultor a cargo de la colmena"+normal);
									 	apicultor = teclanombres.next();
									 	
									 	if (cedulaA[lugarcito]==null) {
									 		error = error+1;
												 		if (error>=cedulaA.length) {
												 		System.out.println(amarillo+"No hay apicultores registrados"+normal);
													 		System.out.println(verde+ "1- Salir al men� colmenar");
															System.out.println("Cualquier otro n�mero- Seguir registrando colmenar"+normal);
															where=teclaopciones.nextInt();
																switch (where) {
																case 1:
																	System.out.println(verde+"Regresandolo al men� colmenar");
																	System.out.println(verde+"..."+normal);
																	menuColmenar();
																	break;
													}
									 		}
											}else if (apicultor.length()<8) {
												 		System.out.println(rojo+"ERROR: La c�dula ingresada no es v�lida."+normal);
												 	}else if (cedulaA[lugarcito].compareTo(apicultor)!=0){
												 			System.out.println(rojo+"ERROR 2: El apicultor no est� registrado en el sistema. "+normal);
												 		}

								 }while(apicultor.length()<8 || cedulaA[lugarcito].compareTo(apicultor)!=0);
									 		
												do {
													 System.out.println (celeste+"Ingrese la capacidad de producci�n de litros por mes del colmenar"+normal);
														capacidad=teclaopciones.nextInt();
														if (capacidad<=0) {
															System.out.println(rojo+"ERROR 1: La capacidad de litros ingresada es menor o igual a cero.");
														}
												}while(capacidad<=0);
												
									 			do {
													System.out.println(celeste+"Ingrese la coordenada X del colmenar ha registrar"+normal);
													coordX = teclacoords.nextDouble();
													
														if (coordX < -180 || coordX > 180) {
														 System.out.println(rojo+"ERROR: La coordenada ingresada no es v�lida."+normal);
														}
												 }while (coordX < -180 || coordX > 180);
												 	
													do {
												 	System.out.println(celeste+"Ingrese la coordenada Y del colmenar ha registrar"+normal);
												 		coordY = teclacoords.nextDouble();
												 			if (coordY < -90 || coordY > 90) {
												 				System.out.println(rojo+"ERROR: La coordenada ingresada no es v�lida."+normal);
												 			}
												 			}while (coordY < -90 || coordY > 90);
												 
													for (int indice=0; indice<coXeY2.length; indice=indice+2) {
											 		 	if (Double.compare (coordX, coXeY2[indice])==0 && Double.compare(coordY, coXeY2[indice+1])==0) {
											 		 			System.out.println(rojo+"ERROR 3: El punto de coordenadas coordX, coordY ya est� registrado en el sistema. "+normal);
											 		 		indice=coXeY2.length;
											 		 		lugarcito= cedulaA.length;
											 		 		i= colmenares.length;
											 		 	}else  {
												 				coXeY2[indice]= coordX;
													 			coXeY2[indice+1]= coordY;
													 			colmenares[i]= ("Apicultor a cargo del colmenar: " +apicultor + " Coordenada X: "+coXeY2[indice]+ " Coordenada Y: "+ coXeY2[indice+1]+" Capacidad de litros de miel por mes: "+capacidad);
													 			lugarcito= cedulaA.length;
												 				indice=coXeY.length;
												 				i=colmenares.length;
													 			System.out.println(verde+"OK"+normal);

											 			}if (colmenares[4]!=null){
											 				System.out.println(amarillo+"No hay espacio para m�s colmenares"+normal);
											 				lugarcito= cedulaA.length;
											 				indice=coXeY.length;
											 				i=colmenares.length;
											 			}
											 			}
									 													}
														}
							}
		System.out.println( "1- Salir al men� colmenar");
		System.out.println("Cualquier otro n�mero- Volver a registrar colmenar");
		where=teclaopciones.nextInt();
			switch (where) {
			case 1:
				System.out.println(verde+"Regresandolo al men� colmenar");
				System.out.println(verde+"..."+normal);
				menuColmenar();
				break;
			}
							}while(where!=1);
							}
						
						public void listadoDeColmenares(){

							do {
								System.out.println (verde+"-------------------------------------------------"+normal);
								System.out.println (verde+"---------Listado de Colmenares----------"+normal);
								System.out.println (verde+"-------------------------------------------------"+normal);
								
							for (int lugar=0; lugar<colmenares.length;lugar++) {
								System.out.println (verde+"----------------------------------------"+normal);
							    if (colmenares [lugar]== null){
							        System.out.println(amarillo+"Espacio disponible para colmenar"+normal);
								    }else {
								    	System.out.println(colmenares[lugar]);
								     }
									System.out.println (verde+"----------------------------------------"+normal);
							}
									
								System.out.println (celeste+ "Si quiere volver al men� de colmenares: precione 1"+normal);
								where= teclaopciones.nextInt();
							}while (where != 1);
								menuColmenar();


	}
		public void listadoDeColmenaresEnCiudad(){  
			System.out.println (verde+"-----------------------------------------------------"+normal);
			System.out.println (verde+"---Listado de Colmenares en Ciudades ---"+normal);
			System.out.println (verde+"-----------------------------------------------------"+normal);
			int existencia=0;
			int eleccion;
			
					
						System.out.println(celeste+"Seleccione ciudad para ver los colmenares que tiene"+normal);
						for (int i=0; i<ciudad_nombres.length; i++  ) {
							System.out.println(i+1+ ciudad_nombres[i]);
						}
							eleccion=teclaopciones.nextInt();
						
						System.out.println(verde+"---------------------------------------------"+normal);
						System.out.println("Colmenares en la ciudad: "+ ciudad_nombres[eleccion]);
						System.out.println(verde+"---------------------------------------------"+normal);
						
							for (int lugar=0; lugar<ciudad.length;lugar++) {
								for (int lugarcito=0; lugarcito<colmenares.length; lugarcito++) {
									if (coXeY2[lugar]+20 >=coXeY[lugarcito] && coXeY2[lugar+1]+20 >=coXeY[lugarcito+1]  || coXeY2[lugar]-20 <=coXeY[lugarcito+1] && coXeY2[lugar+1]-20 <=coXeY[lugarcito] || coXeY2[lugar]+20 >=coXeY[lugarcito] && coXeY2[lugar+1]-20 >=coXeY[lugarcito+1] || coXeY2[lugar]-20 >=coXeY[lugarcito] && coXeY2[lugar+1]+20 >=coXeY[lugarcito+1]) {
										System.out.println(amarillo+"-------------------------------------------------------------------"+normal);
										System.out.println(colmenares[lugar]);
										System.out.println(amarillo+"-------------------------------------------------------------------"+normal);
										existencia=1;
									}
							    }
						if (existencia==0) {
					    	System.out.println("No hay colmenares en esta ciudad");
					    }
					}
					    
				  }
		
	public void menuCentroDeExtraccion(){
	
		do {
			System.out.println (celeste+"Bienvenido al men� de Centros de Extracci�n"+normal);
			System.out.println("�Qu� quiere hacer?");
			System.out.println("1- Registrar Centro de Extracci�n");
			System.out.println("2- Buscar Centro de Extracci�n");
			System.out.println ("3- Mostrar Centros de Extracci�n");
			System.out.println ("4- Modificar Centro de Extracci�n");
			System.out.println("5- Borrar Centro de Extracci�n");
			System.out.println ("6- Regresar al men� Principal");
				where = teclaopciones.nextInt();
		
					switch (where) {
					
					case 1:
						System.out.println(verde+"Enviandolo al men� para registrar Centros de Extracci�n"+normal);
						System.out.println(verde+"..."+normal);
						
						registrarCentroDeExtraccion();
		
					break; 
					
					case 2:
						System.out.println(marron+"NO_IMPLEMENTADA"+normal);
						System.out.println(verde+"..."+normal);
		
					break;
					
					case 3:
						System.out.println(marron+"NO_IMPLEMENTADA"+normal);
						System.out.println(verde+"..."+normal);
	
					break;
					
					case 4:
						System.out.println(marron+"NO_IMPLEMENTADA"+normal);
						System.out.println(verde+"..."+normal);
	
					break;
					
					case 5:
						System.out.println(marron+"NO_IMPLEMENTADA"+normal);
						System.out.println(verde+"..."+normal);

						
						
					break;
					
					case 6:
						System.out.println (purpura+"Regresando al Men� Principal"+normal);
						System.out.println (verde+"..."+normal);
							menuPrincipal();
					break;
					
					default:
						System.out.println(rojo+"Esa opci�n no est� codificada"+normal);
					break;
					}
		}while (where !=6);
	}
	public void registrarCentroDeExtraccion(){  
		
		double coordX; 

		double coordY; 

		int capacidad=0;
		int capacidad_r=0;

			do {
			System.out.println (verde+"----------------------------------------"+normal);
			System.out.println (verde+"-Registrar Centro de Extracci�n-"+normal);
			System.out.println (verde+"----------------------------------------"+normal);
			
			for (int i=0; i<centros.length; i++) {
				
				if (centros[i]==null) {
					
				
					do {
					System.out.println (celeste+"Ingrese la capacidad de recolecci�n de litros original del centro"+normal);
					capacidad=teclaopciones.nextInt();
					
				if (capacidad<=0) {
					System.out.println(rojo+"ERROR 1: La capacidad de litros ingresada es menor o igual a cero."+normal);
				}
				}while(capacidad<=0);

				do {
					System.out.println (celeste+"Ingrese la capacidad de recolecci�n de litros remanente del centro"+normal);
					capacidad_r=teclaopciones.nextInt();
					
				if (capacidad_r<=0) {
					System.out.println(rojo+"ERROR 1: La capacidad de litros ingresada es menor o igual a cero."+normal);
				}
				}while(capacidad<=0);
				do {
					System.out.println(celeste+"Ingrese la coordenada X del centro de extracci�n ha registrar"+normal);
					coordX = teclacoords.nextDouble();
					if (coordX < -180 || coordX > 180) {
							System.out.println(rojo+"ERROR: La coordenada ingresada no es v�lida."+normal);
					}
				}while (coordX < -180 || coordX > 180);
				
				do {
					System.out.println(celeste+"Ingrese la coordenada Y del centro de extracci�n ha registrar"+normal);
					coordY = teclacoords.nextDouble();
					if (coordY < -90 || coordY > 90) {
						System.out.println(rojo+"ERROR: La coordenada ingresada no es v�lida."+normal);
					}
				}while (coordY < -90 || coordY > 90);
				
				for (int indice=0; indice<coXeY3.length;indice=indice+2) {
				if (Double.compare (coordX,coXeY3[indice])==0 && Double.compare(coordY,coXeY3[indice+1])==0) {
					System.out.println(rojo+"ERROR 3: El punto de coordenadas coordX, coordY ya est� registrado en el sistema. "+normal);
					indice=coXeY3.length;
					i= colmenares.length;
				}else if (centros[4]!=null) {
					System.out.println(amarillo+"No hay espacio para m�s Centros de Extracci�n"+normal);
					indice=coXeY3.length;
					i=centros.length;

				}else {
					coXeY3[indice]= coordX;
					coXeY3[indice+1]= coordY;
					centros[i]= ("Centro de extracci�n "+ i +"+ Coordenada X:"+coXeY3[indice]+ " Coordenada Y: "+coXeY3[indice+1]+" Capacidad de recolecci�n original: "+capacidad)+ " Capacidad de recolecci�n remanente: "+capacidad_r;
					indice=coXeY3.length;
					i=colmenares.length;
					System.out.println(verde+"OK"+normal);
					}
				}
				}
			}
			
				System.out.println( "1- Salir al men� centros de extracci�n");
				System.out.println("Cualquier otro n�mero- Volver a registrar Centro de Extracci�n");
					where=teclaopciones.nextInt();
						switch (where) {
						case 1:
							System.out.println(verde+"Regresandolo al men� de Centros de Extracci�n");
							System.out.println(verde+"..."+normal);
							menuCentroDeExtraccion();
						break;
					}
			}while(where!=1);
			}
			
			

	public void menuTramo(){
			do {
				System.out.println (celeste+"Bienvenido al men� de Tramos"+normal);
				System.out.println("�Qu� quiere hacer?");
				System.out.println("1- Registrar Tramo");
				System.out.println("2- Buscar Tramo");
				System.out.println ("3- Mostrar Tramos");
				System.out.println ("4- Modificar Tramo");
				System.out.println("5- Borrar Tramo");
				System.out.println ("6- Regresar al men� Principal");
					where = teclaopciones.nextInt();
	 
						switch (where) {
						
						case 1:	
							System.out.println(verde+"Enviandolo al men� para registrar Tramos"+normal);
							System.out.println(verde+"..."+normal);
							
							registrarTramo();						
							break;
						case 2:
							System.out.println(marron+"NO_IMPLEMENTADA"+normal);
							System.out.println(verde+"..."+normal);
	
						break;
						case 3:
							System.out.println(marron+"NO_IMPLEMENTADA"+normal);
							System.out.println(verde+"..."+normal);
							break;
						case 4:
							System.out.println(marron+"NO_IMPLEMENTADA"+normal);
							System.out.println(verde+"..."+normal);
							break;
				
						case 5:
							System.out.println(marron+"NO_IMPLEMENTADA"+normal);
							System.out.println(verde+"..."+normal);
	
						break;
	
						case 6:
							System.out.println (purpura+"Regresando al Men� Principal"+normal);
							System.out.println (verde+"..."+normal);
								menuPrincipal();
						break;
	
						default:
							System.out.println(rojo+"Esa opci�n no est� codificada"+normal);
							System.out.println(verde+"..."+normal);
	
						break;
	
					}
			}while (where !=6);
	
	}
	
		public void registrarTramo(){  
	 
			double coordXInicial; 
                        String coordString;
			double coordYInicial; 
	
			double coordXFinal; 
	
			double coordYFinal; 
	
			int distancia=0; 
			
			
				do {
					System.out.println (verde+"-------------------------------------------------"+normal);
					System.out.println (verde+"-------------Registrar Tramos-------------"+normal);
					System.out.println (verde+"-------------------------------------------------"+normal);
					
					for (int i=0; i<tramos.length; i++) {
						
						if (tramos[i]==null) {
							do {
							System.out.println (celeste+"Ingrese la distancia total del tramo"+normal);
							distancia=teclaopciones.nextInt();
							
						if (distancia<=0) {
							System.out.println(rojo+"ERROR 1: La distancia ingresada es menor o igual a 0"+normal);
						}
						}while(distancia<=0);
					
						do {
						do {
							System.out.println(celeste+"Ingrese la coordenada X inicial del tramo ha registrar"+normal);
							coordXInicial = teclacoords.nextDouble();
							
							if (coordXInicial < -180 || coordXInicial > 180) {
									System.out.println(rojo+"ERROR: La coordenada ingresada no es v�lida."+normal);
							}
								coordString = String.valueOf(coordXInicial);
                                                        if (coordString.isEmpty()){
                                                            System.out.println(rojo+"ERROR 2: No se ha ingresado la coordenada"+normal);
                                                        }
							
						}while (coordXInicial < -180 || coordXInicial > 180 || coordString.isEmpty());
						
						do {
							System.out.println(celeste+"Ingrese la coordenada Y inicial tramo ha registrar"+normal);
							coordYInicial = teclacoords.nextDouble();
							if (coordYInicial < -90 || coordYInicial > 90) {
								System.out.println(rojo+"ERROR: La coordenada ingresada no es v�lida."+normal);
							}
                                                        coordString = String.valueOf(coordXInicial);
                                                        if (coordString.isEmpty()){
                                                            System.out.println(rojo+"ERROR 2: No se ha ingresado la coordenada"+normal);
                                                        }
						}while (coordYInicial < -90 || coordYInicial > 90 || coordString.isEmpty());
						
						do {
							System.out.println(celeste+"Ingrese la coordenada X final del tramo ha registrar"+normal);
							coordXFinal= teclacoords.nextDouble();
							if (coordXFinal < -180 || coordXFinal > 180) {
									System.out.println(rojo+"ERROR: La coordenada ingresada no es v�lida."+normal);
							}
                                                        coordString = String.valueOf(coordXInicial);
                                                        if (coordString.isEmpty()){
                                                            System.out.println(rojo+"ERROR 2: No se ha ingresado la coordenada"+normal);
                                                        }
						}while (coordXFinal < -180 || coordXFinal > 180 || coordString.isEmpty());
						
						do {
							System.out.println(celeste+"Ingrese la coordenada Y final tramo ha registrar"+normal);
							coordYFinal= teclacoords.nextDouble();
							if (coordYFinal < -90 || coordYFinal > 90) {
								System.out.println(rojo+"ERROR: La coordenada ingresada no es v�lida."+normal);
							}
                                                        coordString = String.valueOf(coordXInicial);
                                                        if (coordString.isEmpty()){
                                                            System.out.println(rojo+"ERROR 2: No se ha ingresado la coordenada"+normal);
                                                        }
			
						}while (coordYFinal < -90 || coordYFinal > 90 || coordString.isEmpty());
						
						if (coordXInicial == coordXFinal && coordYInicial==coordYFinal) {
							System.out.println(rojo+"ERROR 1: La distancia es igual a 0"+normal);
							
						}
						}while (coordXInicial == coordXFinal && coordYInicial==coordYFinal);
						for (int indice=0; indice<coXeYFeI.length; indice=indice+4) {
							
							
							
						if (Double.compare (coordXInicial,coXeYFeI[indice])==0 && Double.compare(coordYInicial,coXeYFeI[indice+1])==0  && Double.compare (coordXFinal,coXeYFeI[indice+2])==0 && Double.compare (coordYFinal,coXeYFeI[indice+3])==0) {
							System.out.println(rojo+"ERROR 3: Ya existe un tramo registrado con esas coordenadas iniciales a coordenadas finales "+normal);
							indice=coXeYFeI.length;
							i= tramos.length;
						
						}else if (tramos[4]!=null){
							System.out.println(amarillo+"No hay espacio para m�s tramos"+normal);
							indice=coXeYFeI.length;
							i=tramos.length;

						}else {
							
							
							coXeYFeI[indice]= coordXInicial;
							coXeYFeI[indice+1]= coordYInicial;
							coXeYFeI[indice+2]= coordXFinal;
							coXeYFeI[indice+3]= coordYFinal;
							
							
							tramos[i]= ("Tramo "+ i + "Desde Coordenada X: "+coXeYFeI[indice] + " y  Coordenada Y: "+coXeYFeI[indice+1]+" Hasta Coordenada X: " + coXeYFeI[indice+2]  + " y Coordenada Y: " + coXeYFeI[indice+3] + " Distancia: "+ distancia);
							indice=coXeYFeI.length;
							i=tramos.length;
							System.out.println(verde+"OK"+normal);
							
							 }
							
						}
						}
					}
						
					
					
						System.out.println( "1- Salir al men� de tramos");
						System.out.println("Cualquier otro n�mero- Volver a registrar tramo");
							where=teclaopciones.nextInt();
								switch (where) {
								case 1:
									System.out.println(verde+"Regresandolo al men� de Tramos");
									System.out.println(verde+"..."+normal);
									menuTramo();
								break;
							}
					}while(where!=1);
				}
			
	
	public void menuEstadisticas(){
	
			do {
				System.out.println (celeste+"Bienvenido al men� de Estad�sticas"+normal);
				System.out.println("�Qu� quiere hacer?");
				System.out.println("1- Registrar Estad�stica");
				System.out.println("2- Buscar Estad�stica");
				System.out.println ("3- Mostrar Estad�sticas");
				System.out.println ("4- Modificar Estad�stica");
				System.out.println("5- Borrar Estad�stica");
				System.out.println ("6- Regresar al men� Principal");
					where = teclaopciones.nextInt();
	
						switch (where) {
						
							case 1:
								System.out.println(marron+"NO_IMPLEMENTADA"+normal);
								System.out.println(verde+"..."+normal);
	
							break;
							
							case 2:
								System.out.println(marron+"NO_IMPLEMENTADA"+normal);
								System.out.println(verde+"..."+normal);
	
							break;
							case 3:
								System.out.println(marron+"NO_IMPLEMENTADA"+normal);
								System.out.println(verde+"..."+normal);

	
							break;
							
							case 4:
								System.out.println(marron+"NO_IMPLEMENTADA"+normal);
								System.out.println(verde+"..."+normal);

	
							break;
							
							case 5:
								System.out.println(marron+"NO_IMPLEMENTADA"+normal);
								System.out.println(verde+"..."+normal);

							break;
							
							case 6:
								System.out.println (purpura+"Regresando al Men� Principal");
								System.out.println (verde+"..."+normal);
								menuPrincipal();
								
							break;
								
							default:
								System.out.println(rojo+"Esa opci�n no est� codificada"+normal);
								System.out.println(verde+"..."+normal);
	
							break;
						}
			}while (where != 6);
                        }
	public static void main(String[] args) {
		Projectinhoindividual enviar = new Projectinhoindividual();
		enviar.precargarCiudad();
		enviar.menuPrincipal();
	}
	
	
	}
	