public class SistemaPedidos {

    private static final double PRECO_HAMBURGUER = 15;
    private static final double PRECO_PIZZA = 20;
    private static final double PRECO_COMBO = 30;
    private static final double DESCONTO_VIP = 0.10;

    public void processarPedido(Pedido pedido) {

        double total = calcularValor(pedido);

        if (pedido.cliente.vip == true) {
            total = total - (total * DESCONTO_VIP);
        }

        System.out.println("Cliente: " + pedido.cliente.nome);

        System.out.println("Produto: " + obterDescricaoProduto(pedido.produto.tipo));

        System.out.println("Quantidade: " + pedido.produto.quantidade);

        if (pedido.cliente.vip == true) {
            System.out.println("Cliente VIP");
        } else {
            System.out.println("Cliente Normal");
        }

        System.out.println("Valor Total: " + total);
    }

    private double calcularValor(Pedido pedido) {

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

        return total;
    }

    private String obterDescricaoProduto(int tipo) {

        if (tipo == 1) {
            return "Hamburguer";
        }

        if (tipo == 2) {
            return "Pizza";
        }

        if (tipo == 3) {
            return "Combo";
        }

        return "Produto inválido";
    }
}