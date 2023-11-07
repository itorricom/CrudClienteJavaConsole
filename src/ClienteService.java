import java.util.Scanner;

public class ClienteService {
    public  static  void crearCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Escribe tu email: ");
        String email = sc.nextLine();

        System.out.println("Escribe tu telefono: ");
        String telefono = sc.nextLine();

        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setEmail(email);
        cliente.setTelefono(telefono);
        ClienteDAO.crearClienteDB(cliente);
    }

    public  static void listarClientes(){

    }

    public static void borrarCliente(){

    }

    public static void editarCliente(){

    }
}
