package waimai.yunlian.com.okstar.model;

import java.util.List;

/**
 * Created by Stran on 2017/2/14.
 */

public class GameData {

    private List<String>   picture;
    private List<ListBean> list;

    public List<String> getPicture() { return picture;}

    public void setPicture(List<String> picture) { this.picture = picture;}

    public List<ListBean> getList() { return list;}

    public void setList(List<ListBean> list) { this.list = list;}

    public static class ListBean {
        /**
         * id : 1525489
         * name : 黑马程序员
         * packageName : com.itheima.www
         * iconUrl : app/com.itheima.www/icon.jpg
         * stars : 5
         * size : 91767
         * downloadUrl : app/com.itheima.www/com.itheima.www.apk
         * des : 产品介绍：google市场app测试。
         */

        private int    id;
        private String name;
        private String packageName;
        private String iconUrl;
        private int    stars;
        private int    size;
        private String downloadUrl;
        private String des;

        public int getId() { return id;}

        public void setId(int id) { this.id = id;}

        public String getName() { return name;}

        public void setName(String name) { this.name = name;}

        public String getPackageName() { return packageName;}

        public void setPackageName(String packageName) { this.packageName = packageName;}

        public String getIconUrl() { return iconUrl;}

        public void setIconUrl(String iconUrl) { this.iconUrl = iconUrl;}

        public int getStars() { return stars;}

        public void setStars(int stars) { this.stars = stars;}

        public int getSize() { return size;}

        public void setSize(int size) { this.size = size;}

        public String getDownloadUrl() { return downloadUrl;}

        public void setDownloadUrl(String downloadUrl) { this.downloadUrl = downloadUrl;}

        public String getDes() { return des;}

        public void setDes(String des) { this.des = des;}
    }
}
