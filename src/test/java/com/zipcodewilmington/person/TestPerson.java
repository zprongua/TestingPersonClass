package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    Person person = new Person();
    //Test Gets and Sets
    @Test
    public void testSetStreetNumber() {
        int expected = 42;

        person.setStreetNumber(expected);

        int actual = person.getStreetNumber();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetStreet() {
        String expected = "Baker St";

        person.setStreet(expected);

        String actual = person.getStreet();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetState() {
        String expected = "MT";

        person.setState(expected);

        String actual = person.getState();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetPostalCode() {
        int expected = 96860;

        person.setPostalCode(expected);

        int actual = person.getPostalCode();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetPhNum() {
        String expected = "4065552207";

        person.setPhNum(expected);

        String actual = person.getPhNum();
        Assert.assertEquals(expected, actual);
    }
}
