package com.cloud.design.structural.adapter;

import com.cloud.design.structural.adapter.impl.Mp4Player;
import com.cloud.design.structural.adapter.impl.VlcPlayer;
import com.cloud.design.structural.adapter.intf.AdvancedMediaPlayer;
import com.cloud.design.structural.adapter.intf.MediaPlayer;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 3:24 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter (String audioType) {
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
