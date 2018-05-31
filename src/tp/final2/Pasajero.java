
package tp.final2;


public class Pasajero extends Persona {
       private String dni;
    private String origen;
    private Reserva[] Pedido;
    private Habitacion[] pieza;


    public Pasajero(String nombre, String apellido,String dni, String origen, int telefono, String direccion, String email) {
        super(nombre, apellido, telefono, direccion, email);
        this.dni = dni;
        this.origen = origen;
    }

    public String getDni() {
        return dni;
    }

    public String getOrigen() {
        return origen;
    }
    

    public void CancelarReserva(int CodigoReserva) {
        for (int i = 0; i < Pedido.length; i++) {
            if (Pedido[i] != null && Pedido[i].getCodigoReserva() == CodigoReserva) {
                Pedido[i] = null;
                break;
            }
        }

    }    

    @Override
    public String toString() {
        return "Pasajero{" + "dni=" + dni + ", origen=" + origen + ", Pedido=" + Pedido + ", pieza=" + pieza + '}';
    }
    
    
    
}
