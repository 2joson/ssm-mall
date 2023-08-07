package com.atguigu.ssm.viewresolve;

import org.springframework.web.servlet.view.InternalResourceView;

import java.io.File;
import java.util.Locale;

public class HtmlResourceView extends InternalResourceView {
    @Override
    public boolean checkResource(Locale locale) throws Exception {
        System.out.println(this.getServletContext().getRealPath("/") +"++"+ super.getUrl());
        File file = new File(this.getServletContext().getRealPath("/") + super.getUrl());
        return file.exists();// 判断该页面是否存在
    }


}
