package xyz.breadloaf.imguimc.interfaces;

public interface Renderable {
    String getName();

    void render();

    default Theme getTheme() {
        return new Theme() {
        };
    }
}
