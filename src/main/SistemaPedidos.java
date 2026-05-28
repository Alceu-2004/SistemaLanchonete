public class SistemaPedidos {

    private static final double PRECO_HAMBURGUER = 15;
    private static final double PRECO_PIZZA = 20;
    private static final double PRECO_COMBO = 30;
    private static final double DESCONTO_VIP = 0.10;

    public void processarPedido(Pedido pedido) {

        double total = 0;

        if (pedido.produto.tipo == 1) {
            total = pedido.produto.quantidade * PRECO_HAMBURGUER;
        }

        if (pedido.produto.tipo == 2) {
            total = pedido.produto.quantidade * PRECO_PIZZA;
        }

        if (pedido.produto.tipo == 3) {
            total = pedido.produto.quantidade * PRECO_COMBO;
        }

        if (pedido.cliente.vip == true) {
            total = total - (total * DESCONTO_VIP);
        }

        System.out.println("Cliente: " + pedido.cliente.nome);

        if (pedido.produto.tipo == 1) {
            System.out.println("Produto: Hamburguer");
        }

        if (pedido.produto.tipo == 2) {
            System.out.println("Produto: Pizza");
        }

        if (pedido.produto.tipo == 3) {
            System.out.println("Produto: Combo");
        }

        System.out.println("Quantidade: " + pedido.produto.quantidade);

        if (pedido.cliente.vip == true) {
            System.out.println("Cliente VIP");
        } else {
            System.out.println("Cliente Normal");
        }

        System.out.println("Valor Total: " + total);
    }
}