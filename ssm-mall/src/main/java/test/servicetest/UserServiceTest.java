package test.servicetest;

import com.atguigu.ssm.mapper.EmployeeMapper;
import com.atguigu.ssm.mapper.UserMapper;
import com.atguigu.ssm.pojo.Employee;
import com.atguigu.ssm.pojo.User;
import com.atguigu.ssm.service.impl.EmployeeServiceImpl;
import com.atguigu.ssm.service.impl.UserServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;


public class UserServiceTest {
    @Test
    public void test() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        Integer add = mapper.add(new User("ggssg", "2222", "2"));
//        System.out.println(add);
        User zhangsan = mapper.getByName("admin");
        System.out.println(zhangsan);
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        boolean zhangsan = mapper.isExist("zhangsan");
//        System.out.println(zhangsan);

//        EmployeeServiceImpl em = new EmployeeServiceImpl();
//        List<Employee> allEmployee = em.getAllEmployee();
//        System.out.println(allEmployee);

//        UserServiceImpl us = new UserServiceImpl();
////        boolean admin = us.isExist("admin");
//        Integer i = us.add(new User("liuy0", "3333", null));
//        System.out.println(i);
    }
}
