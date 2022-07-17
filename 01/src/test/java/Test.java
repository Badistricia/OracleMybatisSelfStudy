import com.badistricia.Utils.MybatisUtils;
import com.badistricia.dao.PersonMapper;
import com.badistricia.pojo.Person;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author badistricia
 * @version 1.0
 * @description :
 * @date 2022/7/17 19:03:36
 */

public class Test {
    @org.junit.jupiter.api.Test
    public void TestSelect(){
        //获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSession();
        //执行sql,要获取mapper，mapperxml内部就是userdao，所以直接获取userdao也一样，类似connection
        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);

        for (Person person : personMapper.getAllPerson()) {
            System.out.println(person);
        }
    sqlSession.close();
    }
    @org.junit.jupiter.api.Test
    public void TestInsert(){
        //获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSession();
        //执行sql,要获取mapper，mapperxml内部就是userdao，所以直接获取userdao也一样，类似connection
        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
        Person person = new Person();
        person.setName("xqx");
        person.setGender("1");
//        List<Person> personList = new ArrayList<>();
//        personList.add(person);
//        personMapper.insertPerson(personList);
        personMapper.insert(person);

        System.out.println(personMapper.getPersonByID(34));
        sqlSession.commit();
        sqlSession.close();

    }

    @org.junit.jupiter.api.Test
    public void TestUpdateDelete(){
        //获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSession();
        //执行sql,要获取mapper，mapperxml内部就是userdao，所以直接获取userdao也一样，类似connection
        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
        Person person = new Person(5,"xqxq22x","0");
        personMapper.update(person);

//        personMapper.delete(34);

        sqlSession.commit();
        sqlSession.close();
    }
}
