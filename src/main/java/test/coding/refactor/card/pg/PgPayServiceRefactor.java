package test.coding.refactor.card.pg;

import test.coding.origin.PayRequest;
import test.coding.origin.PayResponse;
import test.coding.origin.Payment;
import test.coding.origin.card.pg.PgRequest;
import test.coding.origin.card.pg.PgResponse;
import test.coding.refactor.PayInterface;

public class PgPayServiceRefactor implements PayInterface {

    private final Payment payment;

    public PgPayServiceRefactor(Payment payment) {
        this.payment = payment;
    }

    // PG사 결제요청
    public PayRequest ofPayment() {
        PgRequest pgRequest = new PgRequest();
        return new PayRequest(pgRequest);
    }

    // PG사 결과응답
    public PayResponse done() {
        PgResponse pgResponse = new PgResponse();
        return new PayResponse(pgResponse);
    }

}
