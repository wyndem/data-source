package cn.wenhaha.datasource.exception;



/**
 * @ClassName: UserInvalidFailException
 * @description: TODO 用户凭证失效
 * @author: wyndem
 * @date: 2020/7/25 21:09
 * @Version: 1.0
 **/
public class UserInvalidFailException extends DataSourceException {


    public UserInvalidFailException(String message) {
        super(message);
    }
}
