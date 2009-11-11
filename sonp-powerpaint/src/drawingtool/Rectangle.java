package drawingtool;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Rectangular
{
  public Rectangle()
  {
    super();
  }
  
  public void drawShape(Graphics the_graphic, Point the_start_point,
                        Point the_end_point)
  {
    final Graphics2D g2d = (Graphics2D) the_graphic;
    setDimension(the_start_point, the_end_point);
    final Rectangle2D.Double rect = new Rectangle2D.Double(getX(), getY(), 
                                                           getWidth(), getHeight());
    
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2d.setPaint(getColor());
    g2d.setStroke(new BasicStroke(getStroke()));
    g2d.draw(rect);
  }
}
