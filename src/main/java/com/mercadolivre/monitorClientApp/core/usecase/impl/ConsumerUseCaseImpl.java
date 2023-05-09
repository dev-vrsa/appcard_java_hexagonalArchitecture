package com.mercadolivre.monitorClientApp.core.usecase.impl;

import com.mercadolivre.monitorClientApp.core.entity.Consumer;
import com.mercadolivre.monitorClientApp.core.repository.ConsumerRepository;
import com.mercadolivre.monitorClientApp.core.usecase.ConsumerUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@Service
public class ConsumerUseCaseImpl implements ConsumerUseCase {


    private final ConsumerRepository consumerRepository;


    @Override
    public Consumer createConsumer(Consumer consumer) throws Exception {
        Optional<Consumer> consumerCpf = consumerRepository.findByCpf(consumer.getCpf());
        if (consumerCpf.isEmpty()) {

            return consumerRepository.save(consumer);
        }
        throw new Exception("CPF already exists ! ");

    }

    //@Transactional //Reconhece altreacao do objeto e salva sem a necessidade de declaracao.
    @Override
    public Consumer updaterConsumer(Consumer consumer) throws Exception {

        Optional<Consumer> consumerCpf = consumerRepository.findByCpf(consumer.getCpf());

        if (consumerCpf.isEmpty()) {

            throw new Exception("CPF does not exist");
        }

        if(!consumerCpf.get().getCpf().equals(consumer.getCpf())){
            throw new Exception("CPF does not match");
        }

        if(!consumer.getId().equals(consumerCpf.get().getId())){

           throw new Exception("ID does not match");
        }

        return consumerRepository.save(consumer);

    }


    @Override
    public void deleteConsumer(Consumer consumer) throws Exception {

        Optional<Consumer> consumerCpf = consumerRepository.findByCpf(consumer.getCpf());

        if (consumerCpf.isPresent()) {
            consumerRepository.delete(consumer);
        } else {
            throw new Exception("CPF does not found! ");
        }

    }

    @Override
    public List<Consumer> getAllConsumers() throws Exception {
        return consumerRepository.findAll();
    }


}
