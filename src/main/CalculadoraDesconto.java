public class CalculadoraDesconto {

    private static final double DESCONTO_VIP = 0.10;

    public double aplicarDesconto(double valor, boolean vip) {

        if (vip) {
            return valor - (valor * DESCONTO_VIP);
        }

        return valor;
    }
}