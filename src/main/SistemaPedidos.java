public class SistemaPedidos {

    private static final double PRECO_HAMBURGUER = 15;
    private static final double PRECO_PIZZA = 20;
    private static final double PRECO_COMBO = 30;
    private static final double DESCONTO_VIP = 0.10;

    public void processarPedido(Pedido pedido) {

        double total = calcularValor(pedido);

        if (pedido.cliente.vip) {
            total = total - (total * DESCONTO_VIP);
        }

        System.out.println("Cliente: " + pedido.cliente.nome);

        System.out.println("Produto: " + obterDescricaoProduto(pedido.produto.tipo));

        System.out.println("Quantidade: " + pedido.produto.quantidade);

        if (pedido.cliente.vip) {
            System.out.println("Cliente VIP");
        } else {
            System.out.println("Cliente Normal");
        }

        System.out.println("Valor Total: " + total);
    }

    private double calcularValor(Pedido pedido) {

        return switch (pedido.produto.tipo) {
            case 1 -> pedido.produto.quantidade * PRECO_HAMBURGUER;
            case 2 -> pedido.produto.quantidade * PRECO_PIZZA;
            case 3 -> pedido.produto.quantidade * PRECO_COMBO;
            default -> 0;
        };
    }

    private String obterDescricaoProduto(int tipo) {

        return switch (tipo) {
            case 1 -> "Hamburguer";
            case 2 -> "Pizza";
            case 3 -> "Combo";
            default -> "Produto inválido";
        };
    }
}