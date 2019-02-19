package com.cloud.design.structural.adapter;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 3:31 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class AdapterPatternTest {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
