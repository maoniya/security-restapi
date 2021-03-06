package com.maoniya.security.authentication;

import com.maoniya.security.support.JsonWriter;
import com.maoniya.security.support.ResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义REST认证失败处理逻辑
 *
 * date:  Created in 2018/10/8 9:17
 *
 * @author maoning
 */
@Component
public class RestAuthenticationFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest,
                                        HttpServletResponse httpServletResponse, AuthenticationException ae)
            throws IOException {
        JsonWriter.write(httpServletResponse, ResponseModel.error(HttpStatus.UNAUTHORIZED, ae.getMessage()));
    }
}
