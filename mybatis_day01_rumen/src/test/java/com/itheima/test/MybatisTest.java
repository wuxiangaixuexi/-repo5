package com.itheima.test;

import com.itheima.dao.UserDao;
import com.itheima.domain.QueryVo;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @ClassName MybatisTest
 * @Description TODO
 * @Author wx
 * @Date 2019/6/23 9:32
 * @Version 1.0
 **/
public class MybatisTest {
    private InputStream in;
    private SqlSessionFactory factory;
    private SqlSession session;
    private UserDao userDao;

    @Before
    public void init() throws Exception {
        in = Resources.getResourceAsStream("SqlMapperConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(in);
       session = factory.openSession(true);
        userDao = session.getMapper(UserDao.class);
    }

    @Test
    public void testFindOne() {
        User user = userDao.findById(42);
        System.out.println(user);
    }
    @Test
    public void testFindAll(){
        List<User> uesrs = userDao.findAll();
        for (User uesr : uesrs) {
            System.out.println(uesr);
        }
    }
    @Test
    public void testSave(){
        User user = new User();
        user.setUsername("zhangsan");
        user.setAddress("nanjing");
        user.setSex("男");
        user.setBirthday(new Date());
        userDao.saveUser(user);
        System.out.println(user);
    }
    @Test
    public void testUpdateUser ()throws Exception{
        User user = userDao.findById(49);
        user.setAddress("大庆市");
        int res = userDao.updateUser(user);
        System.out.println(res);
    }
    @Test
    public void testDeleteUser()throws Exception{
        int res = userDao.deleteUser(49);
        System.out.println(res);

    }

    @Test
    public void testFindByName(){
        List<User> users = userDao.findByName("%王%");
//        List<User> users = userDao.findByName("王");
        for (User user : users) {
            System.out.println(user);
        }
    }
    @Test
    public void testFindTotal()throws Exception{
        int res = userDao.findTotal();
        System.out.println(res);

    }
    @Test
    public void testFindByQueryVo(){
        QueryVo vo = new QueryVo();
        User user = new User();
        user.setUsername("%王%");
        vo.setUser(user);
        List<User> users = userDao.findByVo(vo);
        for (User user1 : users) {
            System.out.println(user1);
        }

    }

    @After
    public void destroy() throws Exception {

        session.close();
        in.close();

    }


}
