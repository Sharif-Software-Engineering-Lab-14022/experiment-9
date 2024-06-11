package com.unittest.codecoverage.repositories;

import com.unittest.codecoverage.models.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonRepositoryTest {

    private PersonRepository personRepository;

    @BeforeEach
    public void setUp() {
        personRepository = new PersonRepository();
    }

    @Test
    public void testInsert() {
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);

        Person insertedPerson = personRepository.insert(person);
        assertNotNull(insertedPerson);
        assertEquals("John Doe", insertedPerson.getName());
        assertEquals(30, insertedPerson.getAge());
    }

    @Test
    public void testInsert_NullPerson() {
        assertThrows(NullPointerException.class, () -> {
            personRepository.insert(null);
        });
    }

    @Test
    public void testUpdate() {
        Person person = new Person();
        person.setName("Jane Doe");
        person.setAge(25);

        assertDoesNotThrow(() -> personRepository.update(person));
    }

    @Test
    public void testUpdate_NullPerson() {
        assertThrows(NullPointerException.class, () -> {
            personRepository.update(null);
        });
    }

    @Test
    public void testDelete() {
        assertDoesNotThrow(() -> personRepository.delete("John Doe"));
    }

    @Test
    public void testDelete_NullName() {
        assertThrows(NullPointerException.class, () -> {
            personRepository.delete(null);
        });
    }

    @Test
    public void testGet() {
        assertThrows(NullPointerException.class, () -> {
            personRepository.get(null);
        });

        Person person = personRepository.get("John Doe");
        assertNull(person);
    }
}
