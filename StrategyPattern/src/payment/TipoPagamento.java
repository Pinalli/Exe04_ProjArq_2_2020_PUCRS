package payment;

/*
* @author AlbertoPinalli
*/

//fabrica de objetos
public enum TipoPagamento {

    PAYPAL {
        @Override
        public Pagamento valorPag() {
            return new PayPal();
        }
    },
    DEBITO {
        @Override
        public Pagamento valorPag() {
            return new CartaoDebito();
        }
    },
    CREDITO {
        @Override
        public Pagamento valorPag() {
            return new CartaoCredito();
        }
    },
    BOLETO {
        @Override
        public Pagamento valorPag() {
            return new Boleto();
        }
    };

    public abstract Pagamento valorPag();
}
