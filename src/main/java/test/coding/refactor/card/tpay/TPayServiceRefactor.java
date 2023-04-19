package test.coding.refactor.card.tpay;

import test.coding.origin.PayRequest;
import test.coding.origin.PayResponse;
import test.coding.origin.Payment;
import test.coding.origin.card.tpay.TRequest;
import test.coding.origin.card.tpay.TResponse;
import test.coding.refactor.PayInterface;

public class TPayServiceRefactor implements PayInterface {

    private final Payment payment;

    public TPayServiceRefactor(Payment payment) {
        this.payment = payment;
    }

    // PG사 결제요청
    public PayRequest ofPayment() {
        TRequest tRequest = new TRequest();
        return new PayRequest(tRequest);
    }

    // PG사 결과응답
    public PayResponse done() {
        TResponse tResponse = new TResponse();
        return new PayResponse(tResponse);
    }

}
