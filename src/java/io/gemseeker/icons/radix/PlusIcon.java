package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class PlusIcon extends SVGIcon {
    
    public PlusIcon() {
        super(DEFAULT_SIZE);
    }
    
    public PlusIcon(double size) {
        super(size, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M7.5 2.25C7.77614 2.25 8 2.47386 8 2.75V7H12.25C12.5261 7 12.75 7.22386 12.75 7.5C12.75 7.77614 12.5261 8 12.25 8H8V12.25C8 12.5261 7.77614 12.75 7.5 12.75C7.22386 12.75 7 12.5261 7 12.25V8H2.75C2.47386 8 2.25 7.77614 2.25 7.5C2.25 7.22386 2.47386 7 2.75 7H7V2.75C7 2.47386 7.22386 2.25 7.5 2.25Z");
        return path;
    }

}
