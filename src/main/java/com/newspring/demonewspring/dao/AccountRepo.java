package com.newspring.demonewspring.dao;


import com.newspring.demonewspring.model.Account_details;

import org.springframework.data.repository.CrudRepository;


public interface AccountRepo extends CrudRepository<Account_details,Integer>{

}