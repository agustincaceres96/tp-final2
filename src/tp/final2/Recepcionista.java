package tp.final2;

import java.time.LocalDate;
import java.util.*;

public class Recepcionista extends Persona {

    private Pasajero[] clientes;
    private ArrayList<Habitacion> pieza;
    private Reserva[] alquileres;
    private ArrayList<Recepcionista> recepcion;
    private String usuario;
    private String contraseña;

    public Recepcionista(String usuario, String contraseña, String nombre, String apellido) {
        super(nombre, apellido);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    

    

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    private Recepcionista ingresoSistemaRecepsion(String usuarios, String contraseña) {

        if (recepcion == null) {
            return null;
        }
        for (Recepcionista personn : recepcion) {
            if (personn.getEmail().equals(usuarios) && personn.getContraseña().equals(contraseña)) {
                return personn;
            } else {
                System.out.println("El usuario o la contraseña es incorrecta");
            }

        }

        return null;

    }

    public Pasajero buscarPasajero(String dni) {
        for (Pasajero turista : clientes) {
            if (turista != null && turista.getDni().equals(dni)) {
                return turista;
            }
        }
        return null;
    }

    public Reserva buscarReserva(int CodigoReserva) {
        for (Reserva alquiler : alquileres) {
            if (alquiler != null && alquiler.getCodigoReserva() == CodigoReserva) {
                return alquiler;
            }
        }
        return null;
    }

    public Reserva alquiler(int CodigoReserva, String nombreCliente) {
        Reserva piezas = buscarReserva(CodigoReserva);
        Pasajero cliente = buscarPasajero(nombreCliente);
        if (pieza != null && cliente != null) {
            piezas.setListadoDisponible(piezas.getListadoDisponible() - 1);;
            Reserva alquiler = new Reserva(LocalDate.now(), pieza, clientes);

            for (int i = 0; i < alquileres.length; i++) {
                if (alquileres[i] == null) {
                    alquileres[i] = alquiler;
                    break;
                }
            }
            return alquiler;
        }
        return null;
    }

    public Habitacion libre() {
        for (Habitacion room : pieza) {
            if (room.estado.OCUPADA == null) {
                return room;

            }
        }
        return null;
    }

    public Habitacion checkIn(String pass, String usuarios, int CodigoReserva) {
        if (!this.contraseña.equals(pass)) {

            Recepcionista reception = this.ingresoSistemaRecepsion(usuarios, pass);

            if (reception == null) {
                reception = new Recepcionista(usuario,contraseña,nombre,apellido);
                recepcion.add(reception);
            }
            Habitacion room = buscarReserva(CodigoReserva);
            if (room != null && reception.buscarReserva(CodigoReserva) == null) {
                reception.checkIn(pass, usuarios, CodigoReserva);
                room.setListadoDisponible(room.getListadoDisponible() - 1);

            }
        }

        return null;
    }
    
        public void CancelarReserva(int CodigoReserva) {
        for (int i = 0; i < alquileres.length; i++) {
            if (alquileres[i] != null && alquileres[i].getCodigoReserva() == CodigoReserva) {
                alquileres[i] = null;
                break;
            }
        }

    }   

    public void ListadoHabitacionesDisponibles() {
        for (int a = 0; a < pieza.size(); a++) {
            pieza.toString();
        }
    }

    @Override
    public String toString() {
        return "Recepcionista{" + "nombre=" + nombre + ", apellido=" + apellido + "usuario=" + usuario + '}';
    }
    
    
    
    
     

}
