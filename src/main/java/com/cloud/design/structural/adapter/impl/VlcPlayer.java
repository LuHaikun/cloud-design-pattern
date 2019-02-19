package com.cloud.design.structural.adapter.impl;

import com.cloud.design.structural.adapter.intf.AdvancedMediaPlayer;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 3:23 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
