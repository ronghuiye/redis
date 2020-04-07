package com.ryan.redis.repo;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ryan.redis.entities.Customer;

@Repository
public interface CustomerRepo{

	void save(Customer customer);
	Customer find(Long id);
	Map<Long, Customer> findAll();
	void update(Customer customer);
	void delete(Long id);
}
