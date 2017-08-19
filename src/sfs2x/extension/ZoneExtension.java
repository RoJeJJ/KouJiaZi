package sfs2x.extension;

import com.smartfoxserver.v2.extensions.SFSExtension;

public class ZoneExtension extends SFSExtension{
    @Override
    public void init() {

    }

    @Override
    public void destroy() {
        trace("ZoneExtension is destroy");
        super.destroy();
    }
}
