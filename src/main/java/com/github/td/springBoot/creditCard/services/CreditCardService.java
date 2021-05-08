package com.github.td.springBoot.creditCard.services;

import com.github.td.springBoot.creditCard.command.CreditCardCreateDto;
import com.github.td.springBoot.creditCard.command.CreditCardEditableAttributesDto;
import com.github.td.springBoot.creditCard.command.CreditCardGetDto;
import com.github.td.springBoot.creditCard.exceptions.CreditCardException;
import com.github.td.springBoot.creditCard.persistence.model.CreditCard;

import java.util.List;

public interface CreditCardService {

    //CREATE
    CreditCard createCreditCard(CreditCardCreateDto creditCardCreateDto);

    //READ ALL
    List<CreditCardGetDto> getCreditCardList();

    //READ
    CreditCardGetDto getCreditCard(long id)
            throws CreditCardException;

    //UPDATE
    CreditCard editCreditCard(long id, CreditCardEditableAttributesDto creditCardEditableAttributesDto)
            throws CreditCardException;

    //DELETE
    void deleteCreditCard(long id)
            throws CreditCardException;
}
