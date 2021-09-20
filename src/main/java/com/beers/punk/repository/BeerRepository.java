package com.beers.punk.repository;

import com.beers.punk.model.PunkModelToDB;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerRepository extends CrudRepository<PunkModelToDB, Integer> {


}
