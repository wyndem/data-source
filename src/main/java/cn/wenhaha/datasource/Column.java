package cn.wenhaha.datasource;

/**
 * 字段信息
 * --------
 *
 * @author ：wyndem
 * @Date ：Created in 2022-07-19 22:12
 */
public class Column {
    private String name;
    private String nameApi;
    private FieldType datatype;
    private Integer length;
    private Boolean primaryKey;
    private Boolean nullable;
    private Boolean required;
    private Boolean createable;
    private Boolean updateable;
    private Boolean custom;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameApi() {
        return nameApi;
    }

    public void setNameApi(String nameApi) {
        this.nameApi = nameApi;
    }

    public FieldType getDatatype() {
        return datatype;
    }

    public void setDatatype(FieldType datatype) {
        this.datatype = datatype;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Boolean getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(Boolean primaryKey) {
        this.primaryKey = primaryKey;
    }

    public Boolean getNullable() {
        return nullable;
    }

    public void setNullable(Boolean nullable) {
        this.nullable = nullable;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
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

    public Boolean getCustom() {
        return custom;
    }

    public void setCustom(Boolean custom) {
        this.custom = custom;
    }

    @Override
    public String toString() {
        return "Column{" +
                "name='" + name + '\'' +
                ", nameApi='" + nameApi + '\'' +
                ", datatype=" + datatype +
                ", length=" + length +
                ", primaryKey=" + primaryKey +
                ", nullable=" + nullable +
                ", required=" + required +
                ", createable=" + createable +
                ", updateable=" + updateable +
                ", custom=" + custom +
                '}';
    }
}
