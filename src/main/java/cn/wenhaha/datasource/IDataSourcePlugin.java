package cn.wenhaha.datasource;

import org.pf4j.ExtensionPoint;

/**
 * 插件需实现的接口合集
 * --------
 *
 * @author ：wyndem
 * @Date ：Created in 2022-07-07 22:14
 */
public interface IDataSourcePlugin extends ExtensionPoint {

    Class<?>[] controller();

    <T extends IUserContext<?>> T getUserContext();

    IDataObject  getDataObject();

    EventListen getEventListen();


}
