package test.coding.origin.card.tpay;

import test.coding.origin.Payment;

public class TPayService {

    private final Payment payment;

    public TPayService(Payment payment) {
        this.payment = payment;
    }

    // PG사 결제요청
    public TRequest ofPayment() {
        return new TRequest();
    }

    // PG사 결과응답
    public TResponse done() {
        return new TResponse();
    }

}
