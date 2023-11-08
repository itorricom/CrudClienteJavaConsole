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
        ClienteDAO.leerClienteDB();
    }

    public static void borrarCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Indica el ID del cliente a borrar: ");
        int id_cliente = sc.nextInt();
        ClienteDAO.borrarCliente(id_cliente);
    }

    public static void editarCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe nuevo nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Escribe nuevo email: ");
        String email = sc.nextLine();

        System.out.print("Escribe nuevo telefono: ");
        String telefono = sc.nextLine();

        System.out.print("Indica el ID del cliente a editar: ");
        int id_cliente = sc.nextInt();

        Cliente acliente = new Cliente();
        acliente.setNombre(nombre);
        acliente.setEmail(email);
        acliente.setTelefono(telefono);
        acliente.setId(id_cliente);

        ClienteDAO.actualizarCliente(acliente);

    }
}
