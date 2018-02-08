import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloCOnfig {

    @Bean
    public String greeting(){
        return "hello";
    }

    public static void main(String args[]){
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloCOnfig.class);
        String text = (String)context.getBean("greeting");
        System.out.println(text + " world");
    }
}
