package cn.bmob.sms;

import cn.bmob.v3.BmobObject;

public class CollectionList extends BmobObject {
    String collection_img;
    String collection_name;
    String collection_title;
    String play_url;
    Integer collection_id;

    String music_lrcurl;

    Integer duration;
    String t_ijk;
    String videoDuration;

    public String getVideoDuration() {
        return videoDuration;
    }

    public void setVideoDuration(String videoDuration) {
        this.videoDuration = videoDuration;
    }

    public String getMusic_lrcurl() {
        return music_lrcurl;
    }

    public void setMusic_lrcurl(String music_lrcurl) {
        this.music_lrcurl = music_lrcurl;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getT_ijk() {
        return t_ijk;
    }

    public void setT_ijk(String t_ijk) {
        this.t_ijk = t_ijk;
    }

    public Integer getCollection_id() {
        return collection_id;
    }

    public void setCollection_id(Integer collection_id) {
        this.collection_id = collection_id;
    }

    public String getPlay_url() {
        return play_url;
    }

    public void setPlay_url(String play_url) {
        this.play_url = play_url;
    }

    public String getCollection_img() {
        return collection_img;
    }

    public void setCollection_img(String collection_img) {
        this.collection_img = collection_img;
    }

    public String getCollection_name() {
        return collection_name;
    }

    public void setCollection_name(String collection_name) {
        this.collection_name = collection_name;
    }

    public String getCollection_title() {
        return collection_title;
    }

    public void setCollection_title(String collection_title) {
        this.collection_title = collection_title;
    }

}
