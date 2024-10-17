/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cl.benjamin;
import cl.benjamin.modelos.Cafe;
import cl.benjamin.modelos.Cafeterias;
import cl.benjamin.modelos.Comuna;
import cl.benjamin.modelos.MetodoPago;
import cl.benjamin.modelos.Provincia;
import cl.benjamin.modelos.Usuario;
import cl.benjamin.modelos.Empleados;
import cl.benjamin.modelos.EstadoCivil;
import java.util.Date;
import java.util.Scanner;
     

/**
 *
 * @author molin
 */
public class Casa{
    private static Empleados auxiliar;
    private static Empleados barista;
    private static Empleados operador;
    private static Empleados gerente;
    private static Empleados jefe;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        prueba1();

        
    }
    public static void prueba1(){

        Scanner scanner = new Scanner(System.in);
        int opcionMenu;
       
            System.out.println("===== Menu Principal =====");
            System.out.println("1. Cliente");
            System.out.println("2. Gerente");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            opcionMenu = scanner.nextInt();
           
            switch(opcionMenu) {
                case 1:
                    System.out.println("Cliente");
                    clientes();
                    break;
                case 2:
                    System.out.println("Gerente");
                    cargarEmpleados();
                    gerentes();
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no válida. Inténtalo de nuevo.");
                    break;
            }

        
        
    }
    public static void clientes (){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===== Menu Cliente =====");
        System.out.println("Que desear realizar");
        System.out.println("1. Comprar");
        System.out.println("2. Salir");
        System.out.print("Elige una opcion: ");
        
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                usuarioComprar();
                break;
            case 2:
                prueba1();
                break;
            default:
                throw new AssertionError();
        }
        
        
    }
    
    public static void usuarioComprar(){
        Scanner scanner = new Scanner(System.in);
        
        Provincia p1= new Provincia(1, "Santiago");
        Provincia p2= new Provincia(2, "Valparaiso");
        
        Comuna co1= new Comuna(1, "Buin", p1);
        Comuna co2= new Comuna(2, "Vina", p2);
        
        Cafeterias caf1= new Cafeterias(1, "StarBucks", co1);
        Cafeterias caf2= new Cafeterias(2, "StarBucks", co2);
        
        MetodoPago mepago1= new MetodoPago(1, "Efectivo");
        MetodoPago mepago2= new MetodoPago(2, "Transferencia");
        MetodoPago mepago3= new MetodoPago(3, "Tarjeta");
        
        
        Cafe ca1_1= new Cafe(1, "Mocaccino", 2000, 'P', "Entera");
        Cafe ca1_2= new Cafe(1, "Mocaccino", 3000, 'M', "Entera");
        Cafe ca1_3= new Cafe(1, "Mocaccino", 4000, 'G', "Entera");
        Cafe ca2_1= new Cafe(2, "Late", 2000, 'P', "Entera");
        Cafe ca2_2= new Cafe(2, "Late", 3000, 'M', "Entera");
        Cafe ca2_3= new Cafe(2, "Late", 4000, 'G', "Entera");
        Cafe ca3_1= new Cafe(3, "Capuccino", 2000, 'P', "Entera");
        Cafe ca3_2= new Cafe(3, "Capuccino", 3000, 'M', "Entera");
        Cafe ca3_3= new Cafe(3, "Capuccino", 4000, 'G', "Entera");
        
        
        Usuario Us1= new Usuario(0, "Rulito", ca3_3, mepago2, caf2);
        
        System.out.println("Ingrese su rut");
        int rutIngresado = scanner.nextInt();
        Us1.setRut(rutIngresado);
        
        System.out.println("Ingrese su nombre");
        String nombreIngresado = scanner.next();
        Us1.setNombre(nombreIngresado);
            
        System.out.println("Ingrese que cafe desea");
        System.out.println("1. Mocaccino");
        System.out.println("2. Late");
        System.out.println("3. Capuccino");
        int cafeDeseado = scanner.nextInt();
        int medidaDeseada;
        
        //Usamos Switch para que el usuario depende de lo que eliga, se añade a su instancia
        
        switch (cafeDeseado) {
            case 1:
                System.out.println("Que medida de Mocaccino desea");
                System.out.println("1. Chico");
                System.out.println("2. Mediano");
                System.out.println("3. Grande");
                medidaDeseada = scanner.nextInt();
                switch (medidaDeseada) {
                    case 1:
                        Us1.setCafe(ca1_1);
                        break;
                    case 2:
                        Us1.setCafe(ca1_2);
                        break;
                    case 3:
                        Us1.setCafe(ca1_3);
                        break;
                    default:
                        System.out.println("Ingrese un dato valido");
                        throw new AssertionError();
                }
                break;
            case 2:
                System.out.println("Que medida de Late desea");
                System.out.println("1. Chico");
                System.out.println("2. Mediano");
                System.out.println("3. Grande");
                medidaDeseada = scanner.nextInt();
                switch (medidaDeseada) {
                    case 1:
                        Us1.setCafe(ca2_1);
                        break;
                    case 2:
                        Us1.setCafe(ca2_2);
                        break;
                    case 3:
                        Us1.setCafe(ca2_3);
                        break;
                    default:
                        System.out.println("Ingrese un dato valido");
                        throw new AssertionError();
                }
                break;
            case 3:
                    System.out.println("Que medida de Capuccino desea");
                    System.out.println("1. Chico");
                    System.out.println("2. Mediano");
                    System.out.println("3. Grande");
                    medidaDeseada = scanner.nextInt();
                    switch (medidaDeseada) {
                        case 1:
                            Us1.setCafe(ca3_1);
                            break;
                        case 2:
                            Us1.setCafe(ca3_2);
                            break;
                        case 3:
                            Us1.setCafe(ca3_3);
                            break;
                        default:
                            System.out.println("Ingrese un dato valido");
                            throw new AssertionError();
                }
                break;
                default:
                    System.out.println("Ingrese un dato valido");
                    throw new AssertionError();
                }

        System.out.println("Elija su metodo de pago");
        System.out.println("1. Efectivo");
        System.out.println("2. Transferencia");
        System.out.println("3. Tarjeta");
        
        int metodoPagoDeseado = scanner.nextInt();
        switch (metodoPagoDeseado) {
            case 1:
                Us1.setMaPag(mepago1);
                
                break;
            case 2:
                Us1.setMaPag(mepago2);
                break;
            case 3:
                Us1.setMaPag(mepago3);
                break;
            default:
                System.out.println("Ingrese un dato valido");
                throw new AssertionError();
        }
        
        System.out.println("Desde que Cafeteria esta realizando la compra");
        System.out.println("1. Buin");
        System.out.println("2. Vina");
        int comuna = scanner.nextInt();
        switch (comuna) {
            case 1:
                Us1.setCafeteria(caf1);
                break;
            case 2:
                Us1.setCafeteria(caf2);
                break;
            default:
                System.out.println("Ingrese un dato valido");
                throw new AssertionError();
        }
        
        Us1.imprimir();
        scanner.close();
        
        System.out.println(Us1.getNombre()+" el total de su cafe "+Us1.getCafe().getNombre()+" "+Us1.getCafe().getTamano()+" Es de "+Us1.getCafe().getPrecio());
        
        
    }
    
    
    
    
 public static void cargarEmpleados() {
        Provincia p1 = new Provincia(1, "Santiago");
        Provincia p2 = new Provincia(1, "Valparaiso");

        Comuna c1 = new Comuna(0, "Buin", p1);
        Comuna c2 = new Comuna(1, "Vina", p2);

        EstadoCivil e1 = new EstadoCivil(1, "Soltero");
        EstadoCivil e2 = new EstadoCivil(2, "Casado");

        auxiliar = new Empleados(12345678, 'k', "Jose", "Rulitos", "Excel", new Date(2005, 5, 21), true, "josesito@gmail.com", 20000, e1, 10, c1);
        barista = new Empleados(123456987, '6', "John", "Tia", "Quiosco", new Date(2005, 10, 10), true, "jonhsito@gmail.com", 2000000, e2, 20, c2);
        operador = new Empleados(12345678, '4', "Matias", "Huaso", "Momazo", new Date(2005, 3, 7), true, "matisito@gmail.com", 1200000, e1, 19, c1);
        gerente = new Empleados(12345678, 'k', "Benjamin", "Bing", "Pastelito", new Date(2005, 2, 12), true, "kaysito@gmail.com", 1500000, e1, 4, c1);
        jefe = new Empleados(123456987, '8', "Benjamin", "xd", "weko", new Date(2005, 11, 30), true, "elbebesongmail.com", 3000000, e2, 2, c2);
    }    

   public static void infoEmple(){
       System.out.println("Nombre:"+barista.getNombres()+" Apellidos: "+barista.getApePat()+" "+barista.getApeMat()+" Rut: "+barista.getRut()+"-"+barista.getDv()+" Fecha nacimiento: "+barista.getDate()+" Correo: "+barista.getCorreo()+ " Masculino?: "+barista.isMasculino()+ " Estado civil: "+barista.getEstCivil().getNombre()+" Cantidad de hijos: "+barista.getCantHijos()+" Sueldo: $"+barista.getSueldo()+ " Comuna: "+barista.getComuna().getNombre()+ " Provincia: "+barista.getComuna().getProvincia().getNombre());
       System.out.println("Nombre:"+auxiliar.getNombres()+" Apellidos: "+auxiliar.getApePat()+" "+auxiliar.getApeMat()+" Rut: "+auxiliar.getRut()+"-"+auxiliar.getDv()+" Fecha nacimiento: "+auxiliar.getDate()+" Correo: "+auxiliar.getCorreo()+ " Masculino?: "+auxiliar.isMasculino()+ " Estado civil: "+auxiliar.getEstCivil().getNombre()+" Cantidad de hijos: "+auxiliar.getCantHijos()+" Sueldo: $"+auxiliar.getSueldo()+ " Comuna: "+auxiliar.getComuna().getNombre()+ " Provincia: "+auxiliar.getComuna().getProvincia().getNombre());
       System.out.println("Nombre:"+operador.getNombres()+" Apellidos: "+operador.getApePat()+" "+operador.getApeMat()+" Rut: "+operador.getRut()+"-"+operador.getDv()+" Fecha nacimiento: "+operador.getDate()+" Correo: "+operador.getCorreo()+ " Masculino?: "+operador.isMasculino()+ " Estado civil: "+operador.getEstCivil().getNombre()+" Cantidad de hijos: "+operador.getCantHijos()+" Sueldo: $"+operador.getSueldo()+ " Comuna: "+operador.getComuna().getNombre()+ " Provincia: "+operador.getComuna().getProvincia().getNombre());
       System.out.println("Nombre:"+gerente.getNombres()+" Apellidos: "+gerente.getApePat()+" "+gerente.getApeMat()+" Rut: "+gerente.getRut()+"-"+gerente.getDv()+" Fecha nacimiento: "+gerente.getDate()+" Correo: "+gerente.getCorreo()+ " Masculino?: "+gerente.isMasculino()+ " Estado civil: "+gerente.getEstCivil().getNombre()+" Cantidad de hijos: "+gerente.getCantHijos()+" Sueldo: $"+gerente.getSueldo()+ " Comuna: "+gerente.getComuna().getNombre()+ " Provincia: "+gerente.getComuna().getProvincia().getNombre());
       System.out.println("Nombre:"+jefe.getNombres()+" Apellidos: "+jefe.getApePat()+" "+jefe.getApeMat()+" Rut: "+jefe.getRut()+"-"+jefe.getDv()+" Fecha nacimiento: "+jefe.getDate()+" Correo: "+jefe.getCorreo()+ " Masculino?: "+jefe.isMasculino()+ " Estado civil: "+jefe.getEstCivil().getNombre()+" Cantidad de hijos: "+jefe.getCantHijos()+" Sueldo: $"+jefe.getSueldo()+ " Comuna: "+jefe.getComuna().getNombre()+ " Provincia: "+jefe.getComuna().getProvincia().getNombre());
   }

   public static void sueldoLiquido(Empleados empleado){
       float afp = 0.10f;
       float segurocesantia = 0.06f;
       float salud = 0.07f;
       
       float sueldoMasAfp = empleado.getSueldo()*afp;
       float sueldoMasSeguroCesantia = empleado.getSueldo()*segurocesantia;
       float sueldoMasSalud = empleado.getSueldo()*salud;
       
       float totalDescuento = sueldoMasAfp+sueldoMasSalud+sueldoMasSeguroCesantia;
       float totalSueldoConDesucuento = empleado.getSueldo()-totalDescuento;
       
        System.out.println("AFP: $" + sueldoMasAfp);
        System.out.println("Cesantia: $" + sueldoMasSeguroCesantia);
        System.out.println("Salud: $" + sueldoMasSalud);
        System.out.println("Total descuentos: $" + totalDescuento); 
        System.out.println("El sueldo liquido de " + empleado.getNombres() + " " + empleado.getApePat() + " " + empleado.getApeMat() + " es de: $" + totalSueldoConDesucuento);
   }
    public static void gerentes(){
        
        Scanner scanner = new Scanner(System.in);
        int opc = 0;           
        do {
            System.out.println("===== Menu Gerente =====");
            System.out.println("1. Revisar Stock");
            System.out.println("2. Informacion Empleados");
            System.out.println("3. Informacion de Sueldo Liquido");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    stockCafeteria();
                    break;
                case 2:
                    infoEmple();
                    break;
                case 3:
                    System.out.println("Elija el empleado");
                    System.out.println("1. Subjefe Jose Rulitos");
                    System.out.println("2. Barista  John Tia");
                    System.out.println("3. Operador  Matias Huaso");
                    System.out.println("4. Gerente Benjamin Bing");
                    System.out.println("5. Jefe Benjamin xd");
                    int empleOpc = scanner.nextInt();
                    switch (empleOpc) {
                        case 1:
                            sueldoLiquido(auxiliar);
                            break;
                        case 2:
                            sueldoLiquido(barista);
                            break;
                        case 3:
                            sueldoLiquido(operador);
                            break;
                        case 4:
                            sueldoLiquido(gerente);
                            break;
                        case 5:
                            sueldoLiquido(jefe);
                            break;
                        default:
                            System.out.println("Opción no valida");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del menu de gerente.");
                    prueba1();
                    break;
                default:
                    System.out.println("Ingrese un dato valido.");
                    
                    break;
            }
        } while (opc != 4);     }
        
            

    
    public static void stockCafeteria(){
        int kilosCafe = 50;
        int cajasLeche1L = 100;
        int SalsaChocolate= 50;
        int SalsaFrutilla= 40;
        int SalsaManjar= 45;
        
        
        System.out.println("Inventario");
        System.out.println("Cantidad de Kilos de cafe: "+kilosCafe);
        System.out.println("Cantidad de Cajas de Leches de 1 Litro: " +cajasLeche1L);
        System.out.println("Cantidad de Salsas de Cholate: "+SalsaChocolate);
        System.out.println("Cantidad de Salsas de Frutilla: "+SalsaFrutilla);
        System.out.println("Cantidad de Salsas de Manjar: "+SalsaManjar);
        
    }
}

