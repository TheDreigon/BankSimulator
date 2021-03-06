package com.github.td.springBoot.creditCard.aop;

import com.github.td.springBoot.creditCard.errors.ErrorMessage;
import com.github.td.springBoot.creditCard.persistence.repository.CreditCardDatabase;
import com.github.td.springBoot.creditCard.exceptions.CreditCardException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreditCardExceptionHandler {

    private CreditCardDatabase creditCardDatabase;

    @Autowired
    public void setCreditCardDatabase(CreditCardDatabase ccDatabase) {
        this.creditCardDatabase = ccDatabase;
    }

    public void checkIfCreditCardExists(Long creditCardId) throws CreditCardException {

        System.out.println("Checking if credit card exists...");

        if (!this.creditCardDatabase.getCreditCardDBList().containsKey(creditCardId)) {
            throw new CreditCardException(ErrorMessage.CREDIT_CARD_NOT_FOUND);
        }

        System.out.println("Credit card exists!");
    }
}
