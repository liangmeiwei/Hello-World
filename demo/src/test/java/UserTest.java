import demo.model.User;
import demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by user on 2016/5/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
        "classpath:spring-mybatis.xml" })
public class UserTest {
    @Autowired
    UserService userService;

    @Test
    public void getUser(){
        User user = userService.getUserById("1");
        System.out.print(user.getUserId() + ":" + user.getUserName());
    }
}
