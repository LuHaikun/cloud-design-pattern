package com.cloud.design.structural.adapter;

import com.cloud.design.structural.adapter.intf.MediaPlayer;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 3:27 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }else if(audioType.equalsIgnoreCase("mp4")
                || audioType.equalsIgnoreCase("vlc")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else{
            System.out.println("Invalid media. "+ audioType + " format not supported");
        }
    }
}
