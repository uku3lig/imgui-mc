package xyz.breadloaf.imguimc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import xyz.breadloaf.imguimc.interfaces.Renderable;

import java.util.ArrayList;
import java.util.List;


@Environment(EnvType.CLIENT)
public class Imguimc {
    public static final List<Renderable> renderstack = new ArrayList<>();

    @SuppressWarnings("unused")
    public static Renderable pushRenderable(Renderable renderable) {
        renderstack.add(renderable);
        return renderable;
    }

    @SuppressWarnings("unused")
    public static Renderable pullRenderable(Renderable renderable) {
        renderstack.remove(renderable);
        return renderable;
    }

    private Imguimc() {}
}
