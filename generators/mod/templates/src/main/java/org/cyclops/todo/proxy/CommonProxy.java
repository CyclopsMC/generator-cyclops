package <%= group %>.proxy;

import org.cyclops.cyclopscore.init.ModBase;
import org.cyclops.cyclopscore.proxy.CommonProxyComponent;
import <%= group %>.<%= baseClass %>;

/**
 * Proxy for server and client side.
 * @author rubensworks
 *
 */
public class CommonProxy extends CommonProxyComponent {

    @Override
    public ModBase getMod() {
        return <%= baseClass %>._instance;
    }

}
