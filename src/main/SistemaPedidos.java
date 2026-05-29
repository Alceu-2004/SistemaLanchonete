public class SistemaPedidos {

    private static final double PRECO_HAMBURGUER = 15;
    private static final double PRECO_PIZZA = 20;
    private static final double PRECO_COMBO = 30;

    private CalculadoraDesconto calculadoraDesconto;

    public SistemaPedidos() {
        calculadoraDesconto = new CalculadoraDesconto();
    }

    public void processarPedido(Pedido pedido) {

        double total = calcularValor(pedido);

        total = calculadoraDesconto.aplicarDesconto(
                total,
                pedido.cliente.vip
        );

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

        switch (pedido.produto.tipo) {

            case 1:
                return pedido.produto.quantidade * PRECO_HAMBURGUER;

            case 2:
                return pedido.produto.quantidade * PRECO_PIZZA;

            case 3:
                return pedido.produto.quantidade * PRECO_COMBO;

            default:
                return 0;
        }
    }

    private String obterDescricaoProduto(int tipo) {

        switch (tipo) {

            case 1:
                return "Hamburguer";

            case 2:
                return "Pizza";

            case 3:
                return "Combo";

            default:
                return "Produto inválido";
        }
    }
}