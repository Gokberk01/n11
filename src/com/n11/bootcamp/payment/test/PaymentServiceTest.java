package com.n11.bootcamp.payment.test;
import com.n11.bootcamp.payment.main.interfaces.PaymentMethod;
import com.n11.bootcamp.payment.main.services.PaymentService;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


public class PaymentServiceTest {


    @Test //Annotation for testing the method
    void testPayment() {

        //Create a mock for PaymentMethod
        PaymentMethod mockPayment = mock(PaymentMethod.class);

        //After that decline the behavior
        when(mockPayment.pay(100)).thenReturn(true);

        //Create a real PaymentService from mock PaymentMethod
        PaymentService service = new PaymentService(mockPayment);

        //Call the function that wanted to test
        boolean result = service.processPayment(100);

        //Finally control it with the actual value
        assert(result);
    }

}
