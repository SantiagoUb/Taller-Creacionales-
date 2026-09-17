package co.edu.uniquindio.poo;

public class ConsecutivoFactura {

    private static final ConsecutivoFactura instance = new ConsecutivoFactura();

    private int ultimo = 0;

    private ConsecutivoFactura() {}

    public static ConsecutivoFactura getInstance() {
        return instance;
    }

    public int siguiente() {
        ultimo++;
        return ultimo;
    }
}
