import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

class a82{
    public static void main(String[] args) throws IOException{
        BufferedImage input = ImageIO.read(new File("OriginalBild.jpg"));
        File out = new File("Fakebild.jpg");
        for (int i = 0; i < input.getWidth(); i++) {
            for (int j=0;j< input.getHeight();j++){
                int p = input.getRGB(i,j);
                int a = (p>>24)&0xff;
                int g = (p>>8)&0xff;
                int r = (p>>16)&0xff;
                if(r*1.1<0xff){r*=1.1;}
                else{r = 0xff;}
                int b = p&0xff;
                //set new RGB
                p = (a<<24) | (r<<16) | (g<<8) | b ;
                input.setRGB(i, j, p);
            }
        }
        ImageIO.write(input, "jpg", out);
    }
}