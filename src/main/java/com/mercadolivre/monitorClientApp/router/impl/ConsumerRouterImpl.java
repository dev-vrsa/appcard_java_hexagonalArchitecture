package com.mercadolivre.monitorClientApp.router.impl;

import com.mercadolivre.monitorClientApp.core.entity.Consumer;
import com.mercadolivre.monitorClientApp.core.usecase.ConsumerUseCase;
import com.mercadolivre.monitorClientApp.router.ConsumerRouter;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/consumer")
@AllArgsConstructor
public class ConsumerRouterImpl implements ConsumerRouter {


   private final ConsumerUseCase consumerUseCase;

    @Override
    @GetMapping
    public ResponseEntity<List<Consumer>> getAllConsumer() throws Exception {

        return ResponseEntity.ok(consumerUseCase.getAllConsumers());
    }

    @Override
    @PostMapping
    public ResponseEntity<Consumer> createConsumer(@RequestBody @Valid Consumer consumer) throws Exception {

        return ResponseEntity.status(HttpStatus.CREATED).body(consumerUseCase.createConsumer(consumer));
    }

    @Override
    @PutMapping
    public ResponseEntity<Consumer> updateConsumer(@RequestBody Consumer consumer) throws Exception {

        return ResponseEntity.status(HttpStatus.OK).body(consumerUseCase.updaterConsumer(consumer));

    }

    @Override
    @DeleteMapping()
    public void deleteConsumer(Consumer consumer) throws Exception {

        consumerUseCase.deleteConsumer(consumer);
    }


}
