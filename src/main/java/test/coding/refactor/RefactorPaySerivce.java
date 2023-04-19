package test.coding.refactor;


import test.coding.origin.PayRequest;
import test.coding.origin.PayResponse;
import test.coding.origin.PayType;
import test.coding.origin.Payment;

public class RefactorPaySerivce {

    public PayResponse payProcess(PayType payType, Payment payment) {

        PaymentFactory paymentFactory = new PaymentFactory();
        if (payType == PayType.CARD) {

            PayInterface payService = paymentFactory.createPayService(payment);
            PayRequest payRequest = payService.ofPayment();
            PayResponse done = payService.done();
            return new PayResponse(done);
        }

        if (payType == PayType.BANK) {
            //여기도 동일한 형태

        }

        return null;

    }

}
