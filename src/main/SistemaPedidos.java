public class SistemaPedidos {

    public void p(Pedido pedido) {

        double total = 0;

        if (pedido.p.t == 1) {
            total = pedido.p.q * 15;
        }

        if (pedido.p.t == 2) {
            total = pedido.p.q * 20;
        }

        if (pedido.p.t == 3) {
            total = pedido.p.q * 30;
        }

        if (pedido.c.v == true) {
            total = total - (total * 0.10);
        }

        System.out.println("Cliente: " + pedido.c.n);

        if (pedido.p.t == 1) {
            System.out.println("Produto: Hamburguer");
        }

        if (pedido.p.t == 2) {
            System.out.println("Produto: Pizza");
        }

        if (pedido.p.t == 3) {
            System.out.println("Produto: Combo");
        }

        System.out.println("Quantidade: " + pedido.p.q);

        if (pedido.c.v == true) {
            System.out.println("Cliente VIP");
        } else {
            System.out.println("Cliente Normal");
        }

        System.out.println("Valor Total: " + total);
    }
}