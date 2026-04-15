package edu.norcocollege.cis18b.week6.mini07;

/*
 * Utility class that renders a small UI using a family-compatible factory.
*/
public final class ScreenRenderer {

    private ScreenRenderer() {
        // Prevent instantiation of utility class
    }

    /*
     * Renders the button and dialog created by the given factory.
     * The generic factory ensures both products belong to a compatible family.
     *
     * Parameter desc:
     * @param factory UI factory
     * @param <B> button type
     * @param <D> dialog type
     * @return rendered UI description
    */
    public static <B extends Button, D extends Dialog> String render(UIFactory<B, D> factory) {
        B button = factory.createButton();
        D dialog = factory.createDialog();
        return button.render() + " + " + dialog.render();
    }
}