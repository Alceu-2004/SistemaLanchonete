public class SistemaPedidos {

    public void p(Pedido pedido) {

        double total = 0;

        if (pedido.produto.tipo == 1) {
            total = pedido.produto.quantidade * 15;
        }

        if (pedido.produto.tipo == 2) {
            total = pedido.produto.quantidade * 20;
        }

        if (pedido.produto.tipo == 3) {
            total = pedido.produto.quantidade * 30;
        }

        if (pedido.cliente.vip == true) {
            total = total - (total * 0.10);
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