package test.coding.refactor;

import test.coding.origin.Payment;
import test.coding.refactor.card.nice.NicePayServiceRefactor;
import test.coding.refactor.card.pg.PgPayServiceRefactor;
import test.coding.refactor.card.tpay.TPayServiceRefactor;

public class PaymentFactory {

    public PayInterface createPayService(Payment payment) {

        switch (payment) {
            case PG_PAY: return new PgPayServiceRefactor(payment);
            case NICE_PAY: return new NicePayServiceRefactor(payment);
            case T_PAY: return new TPayServiceRefactor(payment);
            default:
                throw new IllegalArgumentException("Invalid payment type: " + payment);
        }
    }
}
