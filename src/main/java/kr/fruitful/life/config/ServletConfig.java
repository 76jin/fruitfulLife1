package kr.fruitful.life.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.io.IOException;

/**
 * Created by ranian129@gmail.com on 2018. 11. 13.
 * Blog : http://76jin.tistory.com
 * Github : http://github.com/76jin
 */
@EnableWebMvc
@ComponentScan(basePackages = {"kr.fruitful.life.basic.controller"})
public class ServletConfig implements WebMvcConfigurer {

    public static final int SIZE_1MB = 1024 * 1024;

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        bean.setPrefix("/WEB-INF/views/");
        bean.setSuffix(".jsp");
        registry.viewResolver(bean);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
    }

    @Bean (name = "multipartResolver")
    public CommonsMultipartResolver getResolver() throws IOException {
        CommonsMultipartResolver resolver = new CommonsMultipartResolver();

        // 10MB
        resolver.setMaxUploadSize(SIZE_1MB * 10);

        // 2MB
        resolver.setMaxUploadSizePerFile(SIZE_1MB * 2);

        // 1MB
        resolver.setMaxInMemorySize(SIZE_1MB);

        // temp upload
        resolver.setUploadTempDir(new FileSystemResource("/Volumes/Data/work-intellij/FruitfulLife1/web/upload/tmp"));

        resolver.setDefaultEncoding("UTF-8");

        return resolver;
    }
}
