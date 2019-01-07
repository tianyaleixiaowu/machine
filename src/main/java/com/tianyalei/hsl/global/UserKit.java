package com.tianyalei.hsl.global;

import com.tianyalei.hsl.util.Constant;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wuweifeng wrote on 2018/11/6.
 */
@Component
public class UserKit {

    public Long getCurrentUserId() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        return Long.valueOf(request.getHeader(Constant.USERID));
    }

}
