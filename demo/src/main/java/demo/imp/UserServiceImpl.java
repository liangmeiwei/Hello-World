package demo.imp;

import java.util.List;

import demo.dao.UserMapper;
import demo.model.User;
import demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 创建时间：2015-1-27 下午5:22:59
 *
 * @author andy
 * @version 2.2
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public int insert(User user) {

        int result = userMapper.insert(user);

        System.out.println(result);
        return result;
    }

}
