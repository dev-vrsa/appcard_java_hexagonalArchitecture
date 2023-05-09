package com.mercadolivre.monitorClientApp.router;

import com.mercadolivre.monitorClientApp.core.entity.Consumer;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ConsumerRouter {

    ResponseEntity <List<Consumer>> getAllConsumer()throws Exception;

   ResponseEntity <Consumer> createConsumer(Consumer consumer) throws Exception;

    ResponseEntity<Consumer> updateConsumer(Consumer consumer) throws Exception;

   void  deleteConsumer(Consumer consumer) throws Exception;


}
