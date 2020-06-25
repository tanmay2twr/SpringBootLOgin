package com.wipro.SpringData;

import org.springframework.data.repository.CrudRepository;

import com.wipro.Pojo.Authorities;

public interface AuthorityRepository extends CrudRepository<Authorities, String> {

}
