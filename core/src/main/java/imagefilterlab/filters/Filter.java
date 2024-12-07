package imagefilterlab.filters;

import java.awt.image.BufferedImage;

/**
 * This interface defines a contract for image filters. It extends the
 * {@code Runnable} interface, which allows filters to be applied through
 * multi-threading.
 * 
 * @author Douglas Domingos
 */
public interface Filter extends Runnable {

    /**
     * Applies the filter algorithm to the specified image.
     * 
     * @param image The image to be processed
     */
    void applyFilter(BufferedImage image);
}
