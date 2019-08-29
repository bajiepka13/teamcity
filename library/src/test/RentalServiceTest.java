import org.bajiepka.rental.service.RentalService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest("service.message=Hello")
public class RentalServiceTest {

    @Autowired
    private RentalService service;

    @Test
    public void contextLoads(){
        assertThat(service.message()).isNotNull();
    }

    @SpringBootApplication
    static class TestConfiguration {
    }

}
