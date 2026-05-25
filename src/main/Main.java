public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Rafael", true);

        Produto produto = new Produto(1, 2);

        Pedido pedido = new Pedido(cliente, produto);

        SistemaPedidos sistema = new SistemaPedidos();

        sistema.p(pedido);
    }
}