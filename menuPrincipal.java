
import beans.cliente;
import java.util.Scanner;
import logica.gestionCliente;
//yo cambie cosas en este archivo  ¯\_(ツ)_/¯ - (งツ)ว - ʕ •́؈•̀ ₎ - (⊃｡•́‿•̀｡)⊃ - ʕ•ᴥ•ʔ - ƪ(ړײ)‎ƪ​​

public class menuPrincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        gestionCliente gestor = new gestionCliente();
        int op; //opcion elegida
        do{
            int DNI;
            String apellidoNombre;
            int edad;
            System.out.println("1- Añadir cliente");
            System.out.println("2- Eliminar cliente");
            System.out.println("3- Cantidad de clientes actual");
            System.out.println("4- Cantidad de usuarios que se dieron de baja");
            op=Integer.parseInt(sc.next());
            
            switch(op){
                case 1:
                    if(gestor.espacioLibre()){
                        System.out.println("DNI:");
                        DNI=sc.nextInt();
                        
                        System.out.println("apellidoNombre:");
                        apellidoNombre=sc.nextLine();
                        
                        System.out.println("edad:");
                        edad=sc.nextInt();
                    }else{
                        System.out.println("Lista llena, no hay lugar");
                    }
                    break;
                case 2:
                    System.out.println("DNI:");
                    DNI=sc.nextInt();
                    cliente c=gestor.eliminarCliente(DNI);
                    //si es null, es que no se a encontrado
                    if(c==null){
                        System.out.println("No se encontro el cliente");
                    }else{
                        System.out.println("Cliente eliminado");
                    }
                    break;
                case 3:
                    cliente[] todos = gestor.verClientes();
                    for(cliente con:todos){
                        System.out.println(con.getDNI()+"-"+con.getApellidoNombre()+"-"+con.getEdad());
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("debes escribir una opcion!");
            }
        }while(op!=4);
    }
    
}
