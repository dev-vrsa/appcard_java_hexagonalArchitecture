package com.mercadolivre.monitorClientApp.core.repository;

import com.mercadolivre.monitorClientApp.core.entity.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Long> {

  Optional<Consumer> findByCpf(String cpf);

}
