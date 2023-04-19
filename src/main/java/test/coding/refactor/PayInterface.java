package test.coding.refactor;


import test.coding.origin.PayRequest;
import test.coding.origin.PayResponse;

public interface PayInterface {

    PayRequest ofPayment();
    PayResponse done();
}
