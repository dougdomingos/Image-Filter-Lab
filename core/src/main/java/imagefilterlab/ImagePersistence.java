package imagefilterlab;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * This class is responsible for handling persistence operations, such as
 * loading and saving images into the file system.
 * 
 * @author Douglas Domingos
 */
public class ImagePersistence {

    /**
     * Loads an image from the base directory.
     * 
     * @param filepath The file which the image will be loaded from
     * @return A {@code BufferedImage} object corresponding to the loaded image
     * @throws IOException Thrown if any error occurs while writing to the file
     */
    public static BufferedImage loadImage(String filepath) throws IOException {
        File imageFile = new File(filepath);
        return ImageIO.read(imageFile);
    }

    /**
     * Saves an image into the specified file.
     * 
     * @param image    The {@code BufferedImage} object representing the image
     * @param filepath The file which the image will be written into
     * @throws IOException Thrown if any error occurs while writing to the file
     */
    public static void saveImage(BufferedImage image, String filepath, String imgFormat) throws IOException {
        File outputFile = new File(filepath);
        ImageIO.write(image, imgFormat, outputFile);
    }

    /**
     * Given a image filepath, extracts the file extension to be used when writing
     * to the file.
     * 
     * @param filepath The path to the file containing the image
     * @return The respective file extension
     */
    public static String extractImgFormat(String filepath) {
        String format = null;

        if (filepath != null) {
            int dotIndex = filepath.lastIndexOf(".");

            if (dotIndex >= 0) {
                format = filepath.substring(dotIndex + 1);
            }
        }

        return format;
    }
}
