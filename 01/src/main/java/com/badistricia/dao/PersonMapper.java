package com.badistricia.dao;

import com.badistricia.pojo.Person;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author badistricia
 * @version 1.0
 * @description :
 * @date 2022/7/17 15:41:21
 */
@Mapper
public interface PersonMapper {
    List<Person> getAllPerson();
    Boolean insertPerson(@Param("list") List<Person> personList);
    Person getPersonByID(int id);
    Boolean insert(Person person);

    Boolean update(Person person);

    Boolean delete(int id);
}
