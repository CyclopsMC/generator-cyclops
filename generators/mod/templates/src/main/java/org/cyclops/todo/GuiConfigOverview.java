package <%= group %>;

import net.minecraft.client.gui.GuiScreen;
import org.cyclops.cyclopscore.client.gui.config.ExtendedConfigGuiFactoryBase;
import org.cyclops.cyclopscore.client.gui.config.GuiConfigOverviewBase;
import org.cyclops.cyclopscore.init.ModBase;

/**
 * @author <%= author %>
 */
public class GuiConfigOverview extends GuiConfigOverviewBase {
    /**
     * Make a new instance.
     * @param parentScreen the parent GuiScreen object
     */
    public GuiConfigOverview(GuiScreen parentScreen) {
        super(<%= baseClass %>._instance, parentScreen);
    }

    @Override
    public ModBase getMod() {
        return <%= baseClass %>._instance;
    }

    public static class ExtendedConfigGuiFactory extends ExtendedConfigGuiFactoryBase {

        @Override
        public Class<? extends GuiConfigOverviewBase> mainConfigGuiClass() {
            return GuiConfigOverview.class;
        }
    }
}
