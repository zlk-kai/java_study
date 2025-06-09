package java_web.Mybatis_.mapper;

import java_web.Mybatis_.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author 张林凯
 * @version 1.0
 */

@Mapper
public interface UserMapper{
    User selectAllUser(int id);

    @Select("select * from user where user_id = #{id}")
    User selectUserById(int id);
}
