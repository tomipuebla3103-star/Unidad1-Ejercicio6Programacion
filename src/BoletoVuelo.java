public class BoletoVuelo {
    private String pasajero;
    private String destino;
    private double tarifaBase;
    private boolean llevaEquipajeExtra;

    public BoletoVuelo(String pasajero, String destino, double tarifaBase, boolean llevaEquipajeExtra) {
        this.pasajero = pasajero;
        this.destino = destino;
        this.tarifaBase = tarifaBase;
        this.llevaEquipajeExtra = llevaEquipajeExtra;
    }

    public String getPasajero() {
        return pasajero;
    }

    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public boolean isLlevaEquipajeExtra() {
        return llevaEquipajeExtra;
    }

    public void setLlevaEquipajeExtra(boolean llevaEquipajeExtra) {
        this.llevaEquipajeExtra = llevaEquipajeExtra;
    }

    public double calcularPrecioFinal() {
        if (llevaEquipajeExtra) {
            return tarifaBase * 1.20;
        }

        return tarifaBase;
    }
}
