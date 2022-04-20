package pub.bcb;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainMod implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("suppress");

    @Override
    public void onInitialize() {
        LOGGER.info("MAKE UPDATE SUPPRESSED AGAIN!");
    }
}
