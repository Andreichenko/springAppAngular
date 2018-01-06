package de.andreichenko.springappangular.repositories;


import de.andreichenko.springappangular.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositories extends JpaRepository<User, Long>{

    User findByName(String name);
}
