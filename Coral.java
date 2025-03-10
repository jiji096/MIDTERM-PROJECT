/** 
    This is the Coral class, which implements the DrawingObject interface. 
    It uses the java.awt.geom package to draw the shape of the coral. It 
    accepts an x-coordinate and two colors as parameters to adjust the
    coral's position and appearance.

    @author Janelle Angela C. Lopez (242682)
    @author Aldrin Joseph T. Nellas (243215)
	@version February 15, 2025
	
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
**/

import java.awt.*;
import java.awt.geom.*;

/**
    Initializes fields for the x-coordinate and colors.
**/
public class Coral implements DrawingObject {
    private double x;
    private Color color1, color2;

    /**
        Constructs the coral with the given x-coordinates and colors.
        @param x       The x-coordinate of the coral.
        @param color1  The main color of the coral.
        @param color2  The secondary color of the coral.
    **/
    public Coral(double x, Color color1, Color color2){
        this.x = x;
        this.color1 = color1;
        this.color2 = color2;
    }

    /**
        Draws the Coral using the Graphics2D object.
	**/
    public void draw(Graphics2D g2d){

        Path2D.Double back = new Path2D.Double();
        back.moveTo(x+177.8,598.9);

        back.curveTo(x+185.2,602.9,x+191.3,593.2,x+192,584.2);
        back.curveTo(x+194.25,576.1,x+201.4,577.6,x+201.2,571);
        back.curveTo(x+202.96,565.8,x+209.2,561.34,x+204.4,558.83);
        back.curveTo(x+201.45,560.2,x+201.6,566.93,x+197.93,563.46);
        back.curveTo(x+197.4,560.73,x+199.85,555.95,x+193.54,557.1);
        back.curveTo(x+192.9,564.03,x+203.1,574.1,x+191.74,576.27);
        back.curveTo(x+188.46,575.63,x+189.35,592,x+181.57,589.07);
        back.curveTo(x+178.9,576.1,x+183.8,557.8,x+191.2,546.2);

        back.curveTo(x+195.26,537.08,x+186.5,543.9,x+192.77,532.65);
        back.curveTo(x+200.45,523.14,x+194.16,518.85,x+192.65,518.65);
        back.curveTo(x+190.2,518.55,x+195.27,526.57,x+190.3,526.9);
        back.curveTo(x+186.7,524.74,x+190.6,516.87,x+184.9,519.6);
        back.curveTo(x+182.26,522.35,x+190.2,526.73,x+182.75,535.35);
        back.curveTo(x+179.2,533.8,x+182.16,525.77,x+179.06,526.3);
        back.curveTo(x+173.35,532.13,x+184.5,536.64,x+184.36,545.1);
        back.curveTo(x+185.2,558.4,x+166.1,559.66,x+179.8,540.6);

        back.curveTo(x+179.85,532.03,x+176.73,542.3,x+173.6,543.15);
        back.curveTo(x+168.64,540.44,x+173.7,530.94,x+167.8,535.6);
        back.curveTo(x+169.03,539.2,x+171.3,552,x+161.87,543.44);
        back.curveTo(x+154,549.2,x+172.14,545.8,x+167.1,561.5);
        back.curveTo(x+159.9,570.6,x+144.8,535.9,x+149,523.45);
        back.curveTo(x+151.3,517,x+143.3,508.76,x+144.6,523.2);
        back.curveTo(x+141.95,526.13,x+138.04,521.1,x+136.83,525.04);
        back.curveTo(x+137.05,528.35,x+144.2,527.72,x+139.14,538.55);

        back.curveTo(x+138.26,542.2,x+140.8,542.44,x+142.6,541.2);
        back.curveTo(x+146.36,539.44,x+157.7,562.44,x+152.9,561.8);
        back.curveTo(x+150.95,563.02,x+145.83,557.72,x+146.63,565.13);
        back.curveTo(x+150.14,568.75,x+152.4,558.46,x+163.63,577.95);
        back.curveTo(x+167.3,583.06,x+146.6,586.36,x+132.65,556.4);
        back.curveTo(x+127.28,551.77,x+126.54,561.08,x+129.2,560.5);

        back.curveTo(x+133,565.6,x+124.8,566.45,x+130.17,571.4);
        back.curveTo(x+134.1,565.93,x+139.72,575.7,x+139.7,581.68);
        back.curveTo(x+141.3,586.64,x+141.15,576.06,x+145.46,584.73);
        back.curveTo(x+151.56,590.7,x+150.86,586.4,x+166.1,598.35);
        back.curveTo(x+173.2,602.34,x+173.06,594.2,x+177.8,598.9);

        g2d.setColor(color2);
        g2d.fill(back);

        Path2D.Double front = new Path2D.Double();
        front.moveTo(x+176.4,599.1);

        front.curveTo(x+181.45,598.9,x+184.55,590.6,x+189.3,591.8);
        front.curveTo(x+192.4,591.2,x+195.04,588.41,x+191.13,584.7);
        front.curveTo(x+189.58,586.27,x+186.85,588.36,x+185.68,587.33);
        front.curveTo(x+184.04,584.78,x+189.9,581.76,x+189.6,578.23);
        front.curveTo(x+189.1,576.17,x+188.58,574.3,x+187.53,573.7);
        front.curveTo(x+183.54,581.64,x+174.52,583.06,x+178.7,573.26);
        front.curveTo(x+181.8,571.25,x+177,563.67,x+183.72,559.34);
        front.curveTo(x+191.4,557,x+193.45,550,x+190.2,546.3);

        front.curveTo(x+187.82,546.16,x+189.68,549.28,x+188.1,549.72);
        front.curveTo(x+186.2,549.74,x+187.13,544.28,x+184,544.89);
        front.curveTo(x+180.83,546.54,x+185.56,549.12,x+181.32,551.88);
        front.curveTo(x+180.18,551.5,x+180.6,547.04,x+178.24,547.83);
        front.curveTo(x+177.09,548.74,x+179.46,552.58,x+177.3,553.13);
        front.curveTo(x+175.48,552.6,x+173.65,549.34,x+175.45,542.56);
        front.curveTo(x+173.9,538.77,x+168.1,542.83,x+173.12,554.94);
        front.curveTo(x+173.91,557.14,x+170.2,555.95,x+173.03,567.5);
        front.curveTo(x+173.35,575.23,x+167.5,580.94,x+167.4,560.85);

        front.curveTo(x+168.6,552.94,x+163.8,544.35,x+166.7,540.44);
        front.curveTo(x+173.8,532,x+167,530.3,x+166.2,534.16);
        front.curveTo(x+162.34,531.75,x+168.2,518.47,x+162.53,520.07);
        front.curveTo(x+159.47,521.76,x+164.38,529.08,x+161.46,531.46);
        front.curveTo(x+158.58,530.98,x+160.66,523.98,x+156.95,525.2);
        front.curveTo(x+154.97,526.08,x+160.53,533.63,x+157.42,533.45);
        front.curveTo(x+156.1,533.45,x+154.4,527.5,x+153.14,532.1);
        front.curveTo(x+152.07,534.65,x+163.84,543.84,x+160.1,550.64);
        front.curveTo(x+156.77,553.2,x+152.5,540.13,x+151.58,538.59);

        front.curveTo(x+149.22,538.27,x+152.1,542.35,x+150.37,542.76);
        front.curveTo(x+146.45,540.62,x+149.7,531,x+143.78,535.5);
        front.curveTo(x+140.27,539.58,x+148.03,541.07,x+147.1,544.8);
        front.curveTo(x+145.34,546.5,x+142.37,541.2,x+142.65,547.18);
        front.curveTo(x+146.47,551.88,x+153.43,553.65,x+156.26,557.8);
        front.curveTo(x+156.5,567.36,x+167.75,575.8,x+162.4,577.7);
        front.curveTo(x+144.9,575.9,x+151.9,566,x+147.55,567.76);
        front.curveTo(x+146.2,577.4,x+142.2,561.7,x+141,562);
        front.curveTo(x+138.52,562.7,x+138.94,570.2,x+136.7,559.57);

        front.curveTo(x+136.9,553.26,x+132.05,551.58,x+134,560.6);
        front.curveTo(x+136.31,567.07,x+142.84,575.23,x+149.16,578.1);
        front.curveTo(x+150.65,578.59,x+149.1,583.35,x+154.24,581.89);
        front.curveTo(x+163.38,579.76,x+165.95,580.72,x+164.42,585.2);
        front.curveTo(x+163,588.3,x+147.7,590.86,x+147.5,587.3);
        front.curveTo(x+145.39,582.82,x+144.47,584.82,x+145.25,587.71);

        front.curveTo(x+144.84,590.2,x+139.32,585.34,x+138.19,578.48);
        front.curveTo(x+137.53,572.9,x+133.75,574.32,x+134.5,578.84);
        front.curveTo(x+138.52,584.5,x+135.1,588.43,x+132.23,584.85);
        front.curveTo(x+130.44,584.33,x+128.85,591.94,x+134.05,590.8);
        front.curveTo(x+141.24,589.5,x+152.3,594.38,x+160,593.04);
        front.curveTo(x+165.3,592.2,x+171.25,601.5,x+176.4,599.1);

        g2d.setColor(color1);
        g2d.fill(front);
    }
}