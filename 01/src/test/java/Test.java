import com.badistricia.Utils.MybatisUtils;
import com.badistricia.dao.PersonMapper;
import com.badistricia.pojo.Person;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

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
}
