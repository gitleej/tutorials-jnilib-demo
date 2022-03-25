package com.ailee.tutorialsjnilib;

/**
 * @brief Person 接口类，具体方法在JNI中实现，用于解释怎样通过JNI调用自定义C++类
 * E-mail   lijie@fjirsm.ac.cn
 * Created by AILEE on 2022/3/23 17:01
 */
public class PersonInterface {
    // 用于保存C++类指针，建议使用long以兼容64位系统
    long nativePersonInterface;

    /**
     * @brief   构造函数
     */
    public PersonInterface() {
        nativePersonInterface = createNativeObjectJNI();
    }

    /**
     * @brief   设置姓名
     * @param   name    姓名
     */
    public void setName(String name) {
        setNameJNI(nativePersonInterface, name);
    }

    /**
     * @brief   设置年龄
     * @param   age 年龄
     */
    public void setAge(int age) {
        setAgeJNI(nativePersonInterface, age);
    }

    /**
     * @brief   获取姓名
     * @return  String  姓名
     */
    public String getName() {
        return getNameJNI(nativePersonInterface);
    }

    /**
     * @brief   获取年龄
     * @return  int 年龄
     */
    public int getAge() {
        return getAgeJNI(nativePersonInterface);
    }

    // 本地方法
    /**
     * @brief   创建一个C++对象
     * @return  long C++对象指针地址
     */
    private native long createNativeObjectJNI();

    /**
     * @brief   设置姓名
     * @param   addr    C++类指针
     * @param   name    姓名
     */
    private native void setNameJNI(long addr, String name);

    /**
     * @brief   设置年龄
     * @param   addr    c++类指针地址
     * @param   age     年龄
     */
    private native void setAgeJNI(long addr, int age);

    /**
     * @brief   获取姓名
     * @param   addr    C++类指针地址
     * @return  String  姓名
     */
    private native String getNameJNI(long addr);

    /**
     * @brief   获取年龄
     * @param   addr    C++类指针地址
     * @return  int     年龄
     */
    private native int getAgeJNI(long addr);
}
