package com.cloud.design.structural.adapter.impl;

import com.cloud.design.structural.adapter.intf.AdvancedMediaPlayer;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 3:22 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
