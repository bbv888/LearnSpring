import com.bbv.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService service1 = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service1);
        System.out.println(service1.findAll().get(0).getFirstName());


        SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service2);
        System.out.println(service2.findAll().get(0).getFirstName());
    }
}
