import java.sql.Connection;
import java.util.Scanner;

public class inicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("--------------------");
            System.out.println("Aplicación de Clientes");
            System.out.println("1. Crear Cliente");
            System.out.println("2. Listar Cliente");
            System.out.println("3. Editar Cliente");
            System.out.println("4. Eliminar Cliente");
            System.out.println("5. Salir");
            System.out.print(">>");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    ClienteService.crearCliente();
                    break;
                case 2:
                    ClienteService.listarClientes();
                    break;
                case 3:
                    ClienteService.editarCliente();
                    break;
                case 4:
                    ClienteService.borrarCliente();
                    break;
                default:
                    break;
            }

        }while(opcion!=5);

    }
}
