package cn.wenhaha.datasource;

import java.io.Serializable;
import java.util.List;


/**
 * 用户相关操作
 * --------
 *
 * @author ：wyndem
 * @Date ：Created in 2022-07-07 22:15
 */
public interface IUserContext<T> {

    T getUserInfo(Serializable id);

    T updateUser(Serializable id);

    List<DataUser> list();

    boolean removeUser(Serializable id);

}
