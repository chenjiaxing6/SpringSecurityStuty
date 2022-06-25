package cn.ishangit.security.service;


import cn.ishangit.security.domain.User;
import cn.ishangit.security.utils.ResponseResult;

public interface LoginServcie {
    ResponseResult login(User user);

    ResponseResult logout();
}
