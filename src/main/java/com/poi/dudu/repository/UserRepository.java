package com.poi.dudu.repository;

import com.poi.dudu.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long> {
    /**
     * 登录
     * @param phone 手机号码
     * @param password 密码
     * @return 用户信息或空
     */
    User findByPhoneAndPassword(String phone,String password);

}
