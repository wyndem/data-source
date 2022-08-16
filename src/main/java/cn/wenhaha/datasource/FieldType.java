package cn.wenhaha.datasource;

/**
 * 字段类型
 * --------
 *
 * @author ：wyndem
 * @Date ：Created in 2022-07-19 22:29
 */
public enum FieldType {
    Int(1,"int"),
    TinyInt(2,"tinyint"),
    Long(3,"Long"),
    String(4,"String"),
    Float(5,"Float"),
    Short(6,"Short"),
    Character(7,"Character"),
    Double(8,"Double"),
    Byte(9,"Byte"),
    Boolean(10,"Boolean"),
    BigDecimal(11,"BigDecimal"),
    Date(12,"Date"),
    Time(13,"Time"),
    Timestamp(14,"Timestamp"),
    Number(15,"Number"),
    Obj(16,"Obj"),
    DateTime(17,"DateTime"),
    DECIMAL(18,"DECIMAL"),
    BIGINT(19,"BIGINT"),
    Other(-1,"Other"),
    ;

    private  Integer id;
    private  String name;

    FieldType(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
