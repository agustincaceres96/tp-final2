package tp.final2;

import java.time.*;
import java.util.*;

public class Reserva extends Habitacion {

    private int CodigoReserva;
    private LocalDate Entrada;
    private LocalDate Salida;
    private ArrayList<Habitacion> pieza;
    private Pasajero[] cliente;

    public Reserva() {
    }

    public Reserva( LocalDate Entrada, ArrayList<Habitacion> pieza, Pasajero[] cliente) {
        super();
        this.CodigoReserva = CodigoReserva;
        this.Entrada = Entrada;
        this.pieza = pieza;
        this.cliente = cliente;
    }

   

    public int getCodigoReserva() {
        return CodigoReserva;
    }

    public LocalDate getEntrada() {
        return Entrada;
    }

    public LocalDate getSalida() {
        return Salida;
    }

    public ArrayList<Habitacion> getPieza() {
        return pieza;
    }


    public Pasajero[] getCliente() {
        return cliente;
    }

    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Reserva{" + "CodigoReserva=" + CodigoReserva + ", Entrada=" + Entrada + ", Salida=" + Salida + ", pieza=" + pieza + ", cliente=" + cliente + '}';
    }

}
