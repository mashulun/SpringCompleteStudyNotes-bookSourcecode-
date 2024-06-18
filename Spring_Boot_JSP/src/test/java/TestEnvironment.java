import com.boot.test.App;
import com.boot.test.config.MyDataConfiguration;
import com.boot.test.entity.MySQLConfig;
import com.boot.test.properties.MyConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author msl
 * @version 1.0
 * @create 2023-04-21 15:28
 */
@ContextConfiguration(classes = {App.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestEnvironment {



    @Autowired
    private MyDataConfiguration myDataConfiguration;




    @Test
    public void test01(){

    }



}
