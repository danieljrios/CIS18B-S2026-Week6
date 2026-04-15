package edu.norcocollege.cis18b.week6.mini07;

/*
 * Abstract Factory contract that binds a compatible button and dialog family
 *
 * @param <B> button type
 * @param <D> dialog type
*/
public interface UIFactory<B extends Button, D extends Dialog> {

    /*
     * Creates a family-compatible button.
     *
     * @return button product
    */
    B createButton();

    /*
     * Creates a family-compatible dialog.
     *
     * @return dialog product
    */
    D createDialog();
}