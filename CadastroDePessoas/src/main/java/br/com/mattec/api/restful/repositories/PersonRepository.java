package br.com.mattec.api.restful.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mattec.api.restful.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
