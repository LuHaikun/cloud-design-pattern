package com.cloud.design.structural.proxy.staticProxy;

import com.cloud.design.structural.proxy.staticProxy.impl.Singer;
import com.cloud.design.structural.proxy.staticProxy.intf.ISinger;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 4:15 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class SingerProxy implements ISinger {
    private ISinger singer;

    public SingerProxy(ISinger singer) {
        this.singer = singer;
    }

    @Override
    public void sing() {
        System.out.println("向观众问好");
        singer.sing();
        System.out.println("向观众致谢");
    }
}
