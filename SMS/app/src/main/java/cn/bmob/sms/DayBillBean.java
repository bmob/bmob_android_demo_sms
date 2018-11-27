package cn.bmob.sms;

import java.util.List;

import cn.bmob.v3.BmobObject;

/**
 * Created by Xia_焱 on 2018/10/31.
 * e-mail：XiahaotianV@163.com
 */

public class DayBillBean extends BmobObject {
    private String DayTime;
    private String DayMoney;
    private List<BillBean> listData;

    public String getDayTime() {
        return DayTime;
    }

    public void setDayTime(String dayTime) {
        DayTime = dayTime;
    }

    public String getDayMoney() {
        return DayMoney;
    }

    public void setDayMoney(String dayMoney) {
        DayMoney = dayMoney;
    }

    public List<BillBean> getListData() {
        return listData;
    }

    public void setListData(List<BillBean> listData) {
        this.listData = listData;
    }

    public static class BillBean {
        private String CategoryName; //分类 类别名称
        private String Money; //金额
        private String Sort; // 类别
        private String Account; //账户
        private String Time; //时间
        private String Member; //成员
        private String Remake; //备注信息
        private String id; //id



        public BillBean(String CategoryName, String Money, String Time, String Sort, String Account, String Remake, String Member, String id) {
            this.CategoryName = CategoryName;
            this.Money = Money;
            this.Sort = Sort;
            this.Account = Account;
            this.Time = Time;
            this.Member = Member;
            this.Remake = Remake;
            this.id = id;

        }

        public String getCategoryName() {
            return CategoryName;
        }

        public void setCategoryName(String categoryName) {
            CategoryName = categoryName;
        }

        public String getMoney() {
            return Money;
        }

        public void setMoney(String money) {
            Money = money;
        }

        public String getSort() {
            return Sort;
        }

        public void setSort(String sort) {
            Sort = sort;
        }

        public String getAccount() {
            return Account;
        }

        public void setAccount(String account) {
            Account = account;
        }

        public String getTime() {
            return Time;
        }

        public void setTime(String time) {
            Time = time;
        }

        public String getMember() {
            return Member;
        }

        public void setMember(String member) {
            Member = member;
        }

        public String getRemake() {
            return Remake;
        }

        public void setRemake(String remake) {
            Remake = remake;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
