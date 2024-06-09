package com.github.tvbox.osc.event;

/**
 * @author pj567
 * @date :2021/1/6
 * @description:
 */
public class AudioEvent {
    public static final int TYPE_YINPIN_EVENT = 20;
	
    public int type;
    public String videoPicUrl;

    public AudioEvent(int type) {
        this.type = type;
    }

    public AudioEvent(int type, String videoPicUrl) {
        this.type = type;
        this.videoPicUrl = videoPicUrl;
    }
}