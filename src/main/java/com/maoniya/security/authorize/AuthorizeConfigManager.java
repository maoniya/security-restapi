package com.maoniya.security.authorize;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;


/**
 * 授权配置管理器
 *
 * @author maoning
 *
 * @date 2018-10-17 23:56
 */
public interface AuthorizeConfigManager {

    /**
     * 配置授权规则
     * @param http
     */
    void config(HttpSecurity http) throws Exception;

}
