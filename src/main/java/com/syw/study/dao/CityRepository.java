package com.syw.study.dao;

import com.syw.study.domain.City;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author shiyanwu
 */
@Repository
public interface CityRepository extends ReactiveMongoRepository<City, Long> {

}
