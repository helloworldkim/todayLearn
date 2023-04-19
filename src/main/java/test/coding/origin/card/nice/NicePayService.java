package test.coding.origin.card.nice;

import test.coding.origin.Payment;

public class NicePayService {

    private final Payment payment;

    public NicePayService(Payment payment) {
        this.payment = payment;
    }

    // PG사 결제요청
    public NiceRequest ofPayment() {
        return new NiceRequest();
    }

    // PG사 결과응답
    public NiceResponse done() {
        return new NiceResponse();
    }

}
