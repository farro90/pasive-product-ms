package com.nttdata.bc19.msproductpasive.service.impl;

import com.nttdata.bc19.msproductpasive.model.PasiveProduct;
import com.nttdata.bc19.msproductpasive.repository.IPasiveProductRepository;
import com.nttdata.bc19.msproductpasive.service.IPasiveProductService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Service
public class PasiveProductServiceImpl implements IPasiveProductService {
    @Autowired
    IPasiveProductRepository pasiveProductRepository;

    @Override
    public Mono<PasiveProduct> create(PasiveProduct pasiveProduct) {

        pasiveProduct.setId(new ObjectId().toString());
        pasiveProduct.setCreatedAt(LocalDateTime.now());
        return pasiveProductRepository.save(pasiveProduct);
    }

    @Override
    public Mono<PasiveProduct> update(PasiveProduct pasiveProduct) {

        pasiveProduct.setUpdatedAt(LocalDateTime.now());
        return pasiveProductRepository.save(pasiveProduct);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return pasiveProductRepository.deleteById(id);
    }

    @Override
    public Mono<PasiveProduct> findById(String id) {
        return pasiveProductRepository.findById(id);
    }

    @Override
    public Flux<PasiveProduct> findAll() {
        return pasiveProductRepository.findAll();
    }
}
