package cn.wenhaha.datasource;

/**
 * 数据源用户凭证实体类
 * --------
 *
 * @author ：wyndem
 * @Date ：Created in 2022-07-07 22:21
 */
public class DataUser {

    private  String id;
    private  String name;
    private  String password;
    private  String lastUpdateTime;
    private  String webSite;
    private  String createTime;
    private  String pluginCode;
    private  String pluginName;
    private  String icon;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPluginCode() {
        return pluginCode;
    }

    public void setPluginCode(String pluginCode) {
        this.pluginCode = pluginCode;
    }

    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "DataUser{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", lastUpdateTime='" + lastUpdateTime + '\'' +
                ", webSite='" + webSite + '\'' +
                ", createTime='" + createTime + '\'' +
                ", pluginCode='" + pluginCode + '\'' +
                ", pluginName='" + pluginName + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
