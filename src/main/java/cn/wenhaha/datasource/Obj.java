package cn.wenhaha.datasource;

/**
 *
 * 对象基本信息
 * --------
 *
 * @author ：wyndem
 * @Date ：Created in 2022-07-19 22:06
 */
public class Obj {

    private String name;

    private String nameApi;

    private Boolean createable;

    private Boolean updateable;

    private Boolean deletable;

    private String pluginCode;

    private String pluginName;


    public String getNameApi() {
        return nameApi;
    }

    public void setNameApi(String nameApi) {
        this.nameApi = nameApi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCreateable() {
        return createable;
    }

    public void setCreateable(Boolean createable) {
        this.createable = createable;
    }

    public Boolean getUpdateable() {
        return updateable;
    }

    public void setUpdateable(Boolean updateable) {
        this.updateable = updateable;
    }

    public Boolean getDeletable() {
        return deletable;
    }

    public void setDeletable(Boolean deletable) {
        this.deletable = deletable;
    }


    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public String getPluginCode() {
        return pluginCode;
    }

    public void setPluginCode(String pluginCode) {
        this.pluginCode = pluginCode;
    }

    @Override
    public String toString() {
        return "Obj{" +
                "name='" + name + '\'' +
                ", nameApi='" + nameApi + '\'' +
                ", createable=" + createable +
                ", updateable=" + updateable +
                ", deletable=" + deletable +
                ", pluginCode='" + pluginCode + '\'' +
                ", pluginName='" + pluginName + '\'' +
                '}';
    }
}
