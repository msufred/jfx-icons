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
public class BorderSplitIcon extends SVGIcon {

    public BorderSplitIcon() {
        super(DEFAULT_SIZE);
    }

    public BorderSplitIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        ArrayList<Shape> shapes = new ArrayList<>();
        SVGPath p1 = new SVGPath();
        p1.setContent("m6.5,4.03h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        SVGPath p2 = new SVGPath();
        p2.setContent("m6.5,2.03h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        SVGPath p3 = new SVGPath();
        p3.setContent("m6.5,6.03h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        SVGPath p4 = new SVGPath();
        p4.setContent("m6.5,12.03h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        SVGPath p5 = new SVGPath();
        p5.setContent("m6.5.03h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        SVGPath p6 = new SVGPath();
        p6.setContent("m12.5,6.03h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        SVGPath p7 = new SVGPath();
        p7.setContent("m4.5,6.03h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        SVGPath p8 = new SVGPath();
        p8.setContent("m2.5,6.03h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        SVGPath p9 = new SVGPath();
        p9.setContent("m8.5,6.03h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        SVGPath p10 = new SVGPath();
        p10.setContent("m10.5,6.03h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        SVGPath p11 = new SVGPath();
        p11.setContent("m6.5,8.03h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        SVGPath p12 = new SVGPath();
        p12.setContent("m6.5,10.03h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        SVGPath p13 = new SVGPath();
        p13.setContent("m.5,6.03h0c.28,0,.5.22.5.5h0c0,.28-.22.5-.5.5h0c-.28,0-.5-.22-.5-.5h0c0-.28.22-.5.5-.5Z");
        SVGPath p14 = new SVGPath();
        p14.setContent("m0,.5C0,.22.22,0,.5,0h4.5v1H1v4H0V.5Zm12,.5h-4V0h4.5c.28,0,.5.22.5.5v4.5h-1V1ZM0,12.5v-4.5h1v4h4v1H.5c-.28,0-.5-.22-.5-.5Zm12-.5v-4h1v4.5c0,.28-.22.5-.5.5h-4v-1h3.5Z");

        shapes.addAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14));

        Shape combined = shapes.get(0);
        for (int i = 1; i < shapes.size(); i++) {
            combined = Shape.union(combined, shapes.get(i));
        }
        return combined;
    }

}
