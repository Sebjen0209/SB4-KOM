package dk.sdu.mmmi.cbse.playersystem;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import org.junit.jupiter.api.*;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PlayerPluginTest {
    private static GameData mockedGameData;
    private static World mockedWorld;
    private static PlayerPlugin player;

    @BeforeAll
    static void setUp() { //Setting up the data for the test
        mockedGameData = mock(GameData.class);
        mockedWorld = mock(World.class);
        player = new PlayerPlugin();
    }

    @Test
    @Order(1) //runs this first
    void addPLayerToWorld() {
        player.start(mockedGameData, mockedWorld);
        verify(mockedWorld).addEntity(any(Player.class));
    }

    @Test
    @Order(2) //runs this secund
    void removePlayerFromWorld() {
        player.stop(mockedGameData, mockedWorld);
        verify(mockedWorld).removeEntity(any(Player.class));
    }
}