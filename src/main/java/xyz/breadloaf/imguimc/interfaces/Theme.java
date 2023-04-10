package xyz.breadloaf.imguimc.interfaces;

public interface Theme {
    default void preRender() {
        // do nothing
    }

    default void postRender() {
        // do nothing
    }
}
