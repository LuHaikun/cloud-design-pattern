package com.cloud.design.structural.facade;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 3:09 PM
 * @Description: 使用该外观类画出各种类型的形状  1、去医院看病，可能要去挂号、门诊、划价、取药，让患者或患者家属觉得很复杂，如果有提供接待人员，只让接待人员来处理，就很方便。 2、JAVA 的三层开发模式
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
    }
}
