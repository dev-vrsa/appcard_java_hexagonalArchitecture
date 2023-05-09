package com.mercadolivre.monitorClientApp.core.usecase;

import com.mercadolivre.monitorClientApp.core.entity.Consumer;
import java.util.List;
import java.util.Optional;

public interface ConsumerUseCase {

    Consumer createConsumer(Consumer consumer) throws Exception;


    Consumer updaterConsumer(Consumer consumerf) throws Exception;


    void deleteConsumer(Consumer consumer) throws Exception;

    List<Consumer> getAllConsumers() throws Exception;


}






