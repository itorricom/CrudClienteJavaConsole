import java.sql.Connection;

public class inicio {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Conexion conexion = new Conexion();
        try {
            conexion.get_conConnection();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
