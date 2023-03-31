package com.boot.test.po;

import java.util.StringJoiner;

/**
 * 住址
 *
 * @author masl
 * @version 1.0
 * @data 2022-11-05
 */
public class Address implements Cloneable {


    /***
     * 省份
     */
    private String province;


    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    /****
     * 重写 toString方法
     * @return
     */
    @Override
    public String toString() {
        //字符串拼接
        return new StringJoiner(",", Address.class.getSimpleName() + "[", "]")
                .add("province='" + province + "'")
                .toString();
    }

    /****
     *重写克隆方法
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
