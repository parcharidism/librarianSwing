package librarian.utils;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import librarian.gui.InsertBook;

/**
 *
 * @author it011873 Miltiadis Parcharidis
 */
public class FileSystemAccess {

    public static String getApplicationPath() {
        String path = InsertBook.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        String appPathFinal = "";
        try {
            String decodedPath = URLDecoder.decode(path, "UTF-8");
            int countslash = decodedPath.length() - decodedPath.replace("/", "").length();
            countslash -= 2;

            int counting = 0;
            for (int i = 0; i < decodedPath.length(); i++) {
                appPathFinal += decodedPath.charAt(i);
                if (decodedPath.charAt(i) == '/') {
                    counting++;
                }
                if (counting == 6) {
                    break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(FileSystemAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return appPathFinal;
    }

    public static void resizeAndCopy(File origImageFile, File destImageFile) {
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(origImageFile);
        } catch (IOException ex) {
            Logger.getLogger(FileSystemAccess.class.getName()).log(Level.SEVERE, null, ex);
        }

        double divider = (double)bufferedImage.getHeight() / 450;
        double width = (bufferedImage.getWidth() / divider);
        BufferedImage resizedImage = new BufferedImage((int)width, 450, BufferedImage.TYPE_INT_RGB);

        Graphics2D g2d = resizedImage.createGraphics();
        g2d.drawImage(bufferedImage, 0, 0, (int)width, 450, null);
        g2d.dispose();
        try {
            ImageIO.write(resizedImage, "jpg", destImageFile);
        } catch (IOException ex) {
            Logger.getLogger(FileSystemAccess.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
