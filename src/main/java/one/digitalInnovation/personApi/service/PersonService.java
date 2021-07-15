package one.digitalInnovation.personApi.service;

import one.digitalInnovation.personApi.dto.request.PersonDTO;
import one.digitalInnovation.personApi.dto.response.MessageResponseDTO;
import one.digitalInnovation.personApi.entity.Person;
import one.digitalInnovation.personApi.mapper.PersonMapper;
import one.digitalInnovation.personApi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }
}
