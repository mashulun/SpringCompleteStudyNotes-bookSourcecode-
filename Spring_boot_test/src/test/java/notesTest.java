import com.boot.test.po.Address;
import com.boot.test.po.Person;
import org.junit.Test;

/**
 * 笔记测试类
 * @author masl
 * @version 1.0
 * @data 2022-11-05
 */


public class notesTest {


    /***
     *   深浅拷贝
     */
    @Test
    public void Demo01() throws CloneNotSupportedException {
        //住址
        Address address1=new Address();
        address1.setProvince("ZheJiang");

       Person person=new Person("Hollis",address1);
        //浅拷贝 :未重写clone
        Person person1=(Person) person.clone();
        //深拷贝  重写clone 方法
        person1.getAddress().setProvince("JiangSu");
        System.out.println(person+"--拷贝前");
        System.out.println(person1+"--浅拷贝");
    }


    /******
     * java中的值传递
     *
     */
    @Test
    public void Demo02(){

    }










}
