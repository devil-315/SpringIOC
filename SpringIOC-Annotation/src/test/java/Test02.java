import com.devil.service.UserService;
import com.devil.service.impl.UserServiceImpl;
import org.junit.Test;

/**
 * ClassName：Test02
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
public class Test02 {
    private UserService userService =new UserServiceImpl();
    @Test
    public void Test(){
        userService.show();
    }
}
