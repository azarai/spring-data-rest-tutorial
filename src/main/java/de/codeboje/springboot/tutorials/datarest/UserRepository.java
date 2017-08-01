package de.codeboje.springboot.tutorials.datarest;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface UserRepository extends PagingAndSortingRepository<User, Long>{
	
	Page<User> findAllByUsername(@Param("username") String username, Pageable page);
}
