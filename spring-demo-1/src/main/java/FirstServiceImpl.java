import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class FirstServiceImpl implements FirstService, InitializingBean {
    @Override
    public String getInfo() {
        return "Hello, world!";
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("> afterPropertiesSet ...");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("> postConstruct ...");
    }
}
