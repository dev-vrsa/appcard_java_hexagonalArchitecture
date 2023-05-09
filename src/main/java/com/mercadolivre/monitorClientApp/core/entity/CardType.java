package com.mercadolivre.monitorClientApp.core.entity;

import lombok.Getter;

@Getter
public enum CardType {

    CREDIT(1),DEBIT(2);

    final int cardCode;

    CardType(int cardCode) {
        this.cardCode = cardCode;

    }


}
