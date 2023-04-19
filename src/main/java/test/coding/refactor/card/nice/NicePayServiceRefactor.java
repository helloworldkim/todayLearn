package test.coding.refactor.card.nice;

import test.coding.origin.PayRequest;
import test.coding.origin.PayResponse;
import test.coding.origin.Payment;
import test.coding.origin.card.nice.NiceRequest;
import test.coding.origin.card.nice.NiceResponse;
import test.coding.refactor.PayInterface;

public class NicePayServiceRefactor implements PayInterface {

    private final Payment payment;

    public NicePayServiceRefactor(Payment payment) {
        this.payment = payment;
    }

    // PG사 결제요청
    public PayRequest ofPayment() {
        NiceRequest niceRequest = new NiceRequest();
        return new PayRequest(niceRequest);
    }

    // PG사 결과응답
    public PayResponse done() {
        NiceResponse niceResponse = new NiceResponse();
        return new PayResponse(niceResponse);
    }

}
