package com.github.td.springBoot.creditCard.persistence.repository;

import com.github.td.springBoot.creditCard.persistence.model.CreditCard;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class CreditCardDatabase {

    private final HashMap<Long, CreditCard> creditCardDBList = new HashMap<>();

    public HashMap<Long, CreditCard> getCreditCardDBList() {
        return creditCardDBList;
    }
}
