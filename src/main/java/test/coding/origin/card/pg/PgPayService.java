package test.coding.origin.card.pg;

import test.coding.origin.Payment;

public class PgPayService {

    private final Payment payment;

    public PgPayService(Payment payment) {
        this.payment = payment;
    }

    // PG사 결제요청
    public PgRequest ofPayment() {
        return new PgRequest();
    }

    // PG사 결과응답
    public PgResponse done() {
        return new PgResponse();
    }

}
