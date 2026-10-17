package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class SlashIcon extends SVGIcon {
    
    public SlashIcon() {
        super(DEFAULT_SIZE);
    }
    
    public SlashIcon(double size) {
        super(size * 0.5, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M5.46033 14H4.10779L9.46521 1H10.8177L5.46033 14Z");
        return path;
    }

}
