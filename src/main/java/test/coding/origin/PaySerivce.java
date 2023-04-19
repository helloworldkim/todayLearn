package test.coding.origin;


import test.coding.origin.card.nice.NicePayService;
import test.coding.origin.card.nice.NiceRequest;
import test.coding.origin.card.nice.NiceResponse;
import test.coding.origin.card.pg.PgPayService;
import test.coding.origin.card.pg.PgRequest;
import test.coding.origin.card.pg.PgResponse;
import test.coding.origin.card.tpay.TPayService;
import test.coding.origin.card.tpay.TRequest;
import test.coding.origin.card.tpay.TResponse;

public class PaySerivce {

    public PayResponse payProcess(PayType payType, Payment payment) {

        if (payType == PayType.CARD) {

            if (payment == Payment.PG_PAY) {
                return pgPayResponse(payment);
            }
            if (payment == Payment.NICE_PAY) {
                return nicePayResponse(payment);
            }
            if (payment == Payment.T_PAY) {
                return tPayResponse(payment);
            }

        }

        if (payType == PayType.BANK) {
            //여기도 동일한 형태

        }

        return null;

    }

    private static PayResponse tPayResponse(Payment payment) {
        TPayService tPayService = new TPayService(payment);
        TRequest tRequest = tPayService.ofPayment();
        TResponse done = tPayService.done();
        return new PayResponse(done);
    }

    private static PayResponse pgPayResponse(Payment payment) {
        PgPayService pgPayService = new PgPayService(payment);
        PgRequest pgRequest = pgPayService.ofPayment();
        PgResponse done = pgPayService.done();
        return new PayResponse(done);
    }

    private static PayResponse nicePayResponse(Payment payment) {
        NicePayService nicePayService = new NicePayService(payment);
        NiceRequest niceRequest = nicePayService.ofPayment();
        NiceResponse done = nicePayService.done();
        return new PayResponse(done);
    }

}
