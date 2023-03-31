package com.boot.test.po;

import java.util.StringJoiner;

/**
 * 对象中的clone方法
 * Cloneable接口  不实现会执行CloneNotSupportedException
 *
 * @author masl
 * @version 1.0
 * @data 2022-11-05
 */
public class Person implements Cloneable {



    private String name;

    /***
     * 住址类
     */
    private Address address;

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /***
     * 构造方法
     */
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    /****
     * 重写 toString方法
     * @return
     */
    @Override
    public String toString() {
        //字符串拼接
        return new StringJoiner(",", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("address=" + address)
                .toString();
    }

    /****
     *
     *深拷贝
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Person person=(Person) super.clone();
        person.setAddress((Address) address.clone());
        return person;
    }

    public static void main(String[] args)throws CloneNotSupportedException {
        //住址
        Address address1=new Address();
        address1.setProvince("ZheJiang");

        Person person=new Person("Hollis",address1);
        //浅拷贝 :未重写clone
        Person person1=(Person) person.clone();

        person1.getAddress().setProvince("JiangSu");
        System.out.println(person+"--拷贝前");
        System.out.println(person1+"--浅拷贝");
    }

}
