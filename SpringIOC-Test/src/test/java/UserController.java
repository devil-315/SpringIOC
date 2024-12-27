import com.devil.entity.SysUser;
import com.devil.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName：UserController
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
public class UserController {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);
        SysUser sysUser = new SysUser();
        sysUser.setUsername("haha");
        sysUser.setUserPwd("123456");
        userService.addUser(sysUser);
    }
}
