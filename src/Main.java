//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    BoletoVuelo boleto1 =
            new BoletoVuelo("Juan Perez", "Buenos Aires", 50000, true);

    BoletoVuelo boleto2 =
            new BoletoVuelo("Maria Lopez", "Buenos Aires", 50000, false);

    System.out.println("Precio de " + boleto1.getPasajero() + ": $"
            + boleto1.calcularPrecioFinal());

    System.out.println("Precio de " + boleto2.getPasajero() + ": $"
            + boleto2.calcularPrecioFinal());
}
