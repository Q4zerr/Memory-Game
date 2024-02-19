package app;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MemoryButton extends JButton {
    private String imgName;
    public String nameImgDisabled = "imageDisabled.png";

    public MemoryButton(String imgName) {
        this.imgName = imgName;
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/img/" + imgName));
        ImageIcon imageIconDisabled = new ImageIcon(getClass().getResource("/img/" + nameImgDisabled));
        setIcon(imageIconDisabled);
        setDisabledIcon(imageIcon);
    }
    
    public String getImage() {
        return this.imgName;
    }
}
