package cn.bmob.sms.bean;

import cn.bmob.v3.BmobUser;

/**
 * Created on 18/9/25 15:37
 *
 * @author zhangchaozhou
 */
public class User extends BmobUser {
    /**
     * TODO 昵称
     */
    private String nickname;

    public String getNickname() {
        return nickname;
    }

    public User setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
}
