import com.boot.test.App;
import com.boot.test.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLOutput;

/**
 * 继承Junit测试
 * SpringJUnit支持,由此引入Spring_Test框架支持!
 *
 * @author msl
 * @version 1.0
 * @create 2023-04-21 10:51
 */

@ContextConfiguration(classes = {App.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestHelloService {
    // 自动装配业务逻辑层
    @Autowired(required = false)
    private HelloService helloService;

    @Test
    public void testSayHello() {
        String sayHello = helloService.sayHello();
    }
}
