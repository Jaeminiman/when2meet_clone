package com.cotato.when2meet.promise.repository;

import com.cotato.when2meet.promise.model.Promise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromiseRepository extends JpaRepository<Promise, Long> {

}
