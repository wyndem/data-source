package cn.wenhaha.datasource;


/**
 * 插件生命周期事件监听<br/>
 * 1. 加载
 * 2. 启用
 * 3. 停止
 * 4. 卸载
 *
 * --------
 *
 * @author ：wyndem
 * @Date ：Created in 2022-07-07 22:15
 */

public interface EventListen {

    /**
     * 单独实例，调用后销毁
     * @param id
     */
    void onLoad(Integer id);


    /**
     * 当插件启动时，回调该方法
     * @param id 数据库id
     */
    void onStart(Integer id);

    /**
     * 禁用该插件时，回调。于onStart共有对象实例
     * @param
     */
    void onStop();


    /**
     * 单独实例，调用后销毁
     * @param id
     */
    void unLoad();

}
