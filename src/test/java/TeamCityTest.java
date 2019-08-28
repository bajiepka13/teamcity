import org.bajiepka.TeamCity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TeamCityTest {

    private final TeamCity teamCity = new TeamCity();

    @Test
    public void getStatus() {
        assertTrue(teamCity.getStatus());
    }

}
