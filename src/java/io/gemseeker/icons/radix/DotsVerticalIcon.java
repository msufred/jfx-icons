package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class DotsVerticalIcon extends SVGIcon {
    
    public DotsVerticalIcon() {
        super(DEFAULT_SIZE);
    }
    
    public DotsVerticalIcon(double size) {
        super(size * 0.125, size * 1.05);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M7.5 11.375C8.12132 11.375 8.625 11.8787 8.625 12.5C8.625 13.1213 8.12132 13.625 7.5 13.625C6.87868 13.625 6.375 13.1213 6.375 12.5C6.375 11.8787 6.87868 11.375 7.5 11.375ZM7.5 6.375C8.12132 6.375 8.625 6.87868 8.625 7.5C8.625 8.12132 8.12132 8.625 7.5 8.625C6.87868 8.625 6.375 8.12132 6.375 7.5C6.375 6.87868 6.87868 6.375 7.5 6.375ZM7.5 1.375C8.12132 1.375 8.625 1.87868 8.625 2.5C8.625 3.12132 8.12132 3.625 7.5 3.625C6.87868 3.625 6.375 3.12132 6.375 2.5C6.375 1.87868 6.87868 1.375 7.5 1.375Z");
        return path;
    }

}
