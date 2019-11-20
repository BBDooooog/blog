package com.bbdog.demo.views.base;

import com.bbdog.demo.dao.base.UserDetailsImpl;
import com.bbdog.demo.entity.User;
import com.bbdog.demo.manager.UserManager;
import com.bbdog.demo.system.security.SpringSecurityUtils;
import com.bbdog.demo.utils.web.ServletUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class BaseController {
    private static ObjectMapper mapper = new ObjectMapper();
    // -- header 常量定义 --//
    private static final String HEADER_ENCODING = "encoding";
    private static final String HEADER_NOCACHE = "no-cache";
    private static final String DEFAULT_ENCODING = "UTF-8";
    private static final boolean DEFAULT_NOCACHE = true;

    @Autowired
    private UserManager userManager;


    public User getCurrentUser() {
        return userManager.getUser(Boolean.TRUE, getCurrentUserId());
    }

    protected long getCurrentUserId() {
        return getUserDetailsImpl().getUserId();
    }
    protected UserDetailsImpl getUserDetailsImpl() {
        return (UserDetailsImpl) SpringSecurityUtils.getCurrentUserDetails();
    }
    public static void renderJson(HttpServletResponse response, final Object data, final String... headers) {
        response = initResponseHeader(response, ServletUtils.JSON_TYPE, headers);
        try {
            mapper.writeValue(response.getWriter(), data);
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }
    }
    /**
     * 分析并设置contentType与headers.
     */
    private static HttpServletResponse initResponseHeader(HttpServletResponse response, final String contentType, final String... headers) {
        // 分析headers参数
        String encoding = DEFAULT_ENCODING;
        boolean noCache = DEFAULT_NOCACHE;
        for (String header : headers) {
            String headerName = StringUtils.substringBefore(header, ":");
            String headerValue = StringUtils.substringAfter(header, ":");

            if (StringUtils.equalsIgnoreCase(headerName, HEADER_ENCODING)) {
                encoding = headerValue;
            } else if (StringUtils.equalsIgnoreCase(headerName, HEADER_NOCACHE)) {
                noCache = Boolean.parseBoolean(headerValue);
            } else {
                throw new IllegalArgumentException(headerName + "不是一个合法的header类型");
            }
        }
        // 设置headers参数
        String fullContentType = contentType + ";charset=" + encoding;
        response.setContentType(fullContentType);
        if (noCache) {
            ServletUtils.setNoCacheHeader(response);
        }
        return response;
    }
}
