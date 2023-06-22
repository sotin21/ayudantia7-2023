import java.util.*;
public class Agencia {
    private Collection<Agente> agentes;
    private Collection<Cliente> clientes;
    private String nombre;

    public String getNombre() {
        return this.nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Agente añadirVendedor(String nombre, int identificacion) {
        // TODO - implement Agencia.añadirVendedor
        throw new UnsupportedOperationException();
    }


    public Agente buscarVendedor(int identificacion) {
        // TODO - implement Agencia.buscarVendedor
        throw new UnsupportedOperationException();
    }


    public Agente eliminarVendedor(int identificacion) {
        // TODO - implement Agencia.eliminarVendedor
        throw new UnsupportedOperationException();
    }


    public boolean generarVenta(String nombre, int identificacion, String origen, String destino, int precioPagar) {
        // TODO - implement Agencia.generarVenta
        throw new UnsupportedOperationException();
    }


    public Cliente añadirCliente(String nombre, int identificacion, String correoElectronico) {
        // TODO - implement Agencia.añadirCliente
        throw new UnsupportedOperationException();
    }


    public Cliente buscarCliente(int identificacion) {
        // TODO - implement Agencia.buscarCliente
        throw new UnsupportedOperationException();
    }

}
