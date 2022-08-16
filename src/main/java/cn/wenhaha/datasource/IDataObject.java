package cn.wenhaha.datasource;

import java.io.Serializable;
import java.util.List;

/**
 * 对象相关
 * --------
 *
 * @author ：wyndem
 * @Date ：Created in 2022-07-07 22:15
 */
public interface IDataObject {

    List<Obj> list(Serializable id);

    ObjInfo info(String nameApi,Serializable id);

}
