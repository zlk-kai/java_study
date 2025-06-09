import java_web.Mybatis_.mapper.UserMapper;
import java_web.Mybatis_.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 张林凯
 * @version 1.0
 */
public class Mybaite_ {

    SqlSessionFactory sqlSessionFactory =  null;
    SqlSession sqlSession = null;
    @Before
    public void before() throws IOException {
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void test01() throws IOException {

        try (SqlSession session = sqlSessionFactory.openSession()) {
            User user01 = (User) session.selectOne("java_web.Mybatis_.pojo.UserMapper.selectAllUser", 1);
            System.out.println(user01);
        }
    }
    /**
     * @author 张林凯
     * @version 1.0
     * 基于借口绑定的方式
     */
    @Test
    public void test02() throws IOException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            User user = mapper.selectAllUser(1);
            System.out.println(user);
        }
    }
    /**
     * @author 张林凯
     * @version 1.0
     * 基于注解绑定，可以和XML文件共用，但是不能出现相同呢的ID方法名字
     */
    @Test
    public void test03() throws IOException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            User user = mapper.selectUserById(1);
            System.out.println(user);
        }
    }
}
