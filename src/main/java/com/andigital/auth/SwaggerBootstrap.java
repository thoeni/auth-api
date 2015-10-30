//package com.andigital.auth;
//
//
//import com.wordnik.swagger.jaxrs.config.BeanConfig;
//
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//
///**
// * @author msubramanian
// */
//public class SwaggerBootstrap extends HttpServlet {
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        super.init(config);
//
//        BeanConfig beanConfig = new BeanConfig();
//        beanConfig.setVersion("1.0.0");
//        beanConfig.setBasePath(config.getServletContext().getContextPath() + "/api/v1");
//        beanConfig.setResourcePackage("com.andigital.auth.resource");
//        beanConfig.setScan(true);
//    }
//}
