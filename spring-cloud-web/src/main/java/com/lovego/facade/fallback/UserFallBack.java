package com.lovego.facade.fallback;

import com.lovego.entity.User;
import com.lovego.facade.UserFacade;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 远程调用异常处理
 */
@Component
public class UserFallBack implements UserFacade{
    @Override
    public User getUser(String userId) {
        return null;
    }

    @Override
    public User getUserInfo(User user) {
        System.out.println(" --------------- ");
        System.out.println(" 远程接口调用失败! ");
        System.out.println(" =============== ");
        return new User();
    }

    @Override
    public Map<String, String> map(Map<String, String> map) {
        return null;
    }

    @Override
    public User base(int id) {
        return null;
    }
}
