package br.com.mattec.api.restful.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.mattec.api.restful.dto.request.PersonDTO;
import br.com.mattec.api.restful.entities.Person;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}
