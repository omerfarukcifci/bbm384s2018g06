package com.sport.support.ClassPackage;

import org.springframework.data.repository.CrudRepository;

public interface courseRepository extends CrudRepository<course, Long>{

	Iterable<course> findAllByBranchId(int id);
	course findDistinctById(int id);
}
