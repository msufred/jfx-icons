package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import java.util.ArrayList;
import java.util.Arrays;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class BorderAllIcon extends SVGIcon {
    
    public BorderAllIcon() {
        super(DEFAULT_SIZE);
    }
    
    public BorderAllIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        ArrayList<Shape> shapes = new ArrayList<>();
        SVGPath p1 = new SVGPath();
        p1.setContent("m0,.75c0-.41.34-.75.75-.75h13c.41,0,.75.34.75.75v13c0,.41-.34.75-.75.75H.75c-.41,0-.75-.34-.75-.75V.75Zm1.5.75v11.5h11.5V1.5H1.5Z");
        SVGPath p2 = new SVGPath();
        p2.setContent("m7.25,4.75h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        SVGPath p3 = new SVGPath();
        p3.setContent("m7.25,2.75h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        SVGPath p4 = new SVGPath();
        p4.setContent("m7.25,6.75h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        SVGPath p5 = new SVGPath();
        p5.setContent("m5.25,6.75h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        SVGPath p6 = new SVGPath();
        p6.setContent("m3.25,6.75h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        SVGPath p7 = new SVGPath();
        p7.setContent("m9.25,6.75h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        SVGPath p8 = new SVGPath();
        p8.setContent("m11.25,6.75h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        SVGPath p9 = new SVGPath();
        p9.setContent("m7.25,8.75h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        SVGPath p10 = new SVGPath();
        p10.setContent("m7.25,10.75h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        
        shapes.addAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));
        
        Shape combined = shapes.get(0);
        for (int i = 1; i < shapes.size(); i++) {
            combined = Shape.union(combined, shapes.get(i));
        }
        return combined;
    }

}
