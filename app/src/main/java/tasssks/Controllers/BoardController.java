package tasssks.Controllers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
public class BoardController {

    @RequestMapping("/")
    public @ResponseBody String greeting(){
        return "Hello, World";
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args -> {
            System.out.println("Beans from Spring");
            String beanNames[] = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String name: beanNames){
                System.out.println(name);
            }
        };
    }
}
