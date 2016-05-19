package demo.service;
import demo.model.User;

import java.util.List;


/**
 * 创建时间：2015-1-27 下午5:15:03
 * @author andy
 * @version 2.2
 */

public interface UserService {

    User getUserById(String id);

    int insert(User user);
}
