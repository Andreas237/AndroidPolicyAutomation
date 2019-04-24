// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;


// Referenced classes of package com.itextpdf.awt.geom:
//			Shape, Point2D, Rectangle2D, Rectangle, 
//			FlatteningPathIterator, Dimension2D, AffineTransform, PathIterator

public abstract class RectangularShape
	implements Shape, Cloneable
{

	protected RectangularShape()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public Object clone()
	{
		Object obj;
		try
		{
			obj = super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method Object Object.clone()>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*   5    7:astore_1        
		{
			throw new InternalError();
	//    6    8:new             #21  <Class InternalError>
	//    7   11:dup             
	//    8   12:invokespecial   #22  <Method void InternalError()>
	//    9   15:athrow          
		}
		return obj;
	}

	public boolean contains(Point2D point2d)
	{
		return contains(point2d.getX(), point2d.getY());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #30  <Method double Point2D.getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #33  <Method double Point2D.getY()>
	//    5    9:invokevirtual   #36  <Method boolean contains(double, double)>
	//    6   12:ireturn         
	}

	public boolean contains(Rectangle2D rectangle2d)
	{
		return contains(rectangle2d.getX(), rectangle2d.getY(), rectangle2d.getWidth(), rectangle2d.getHeight());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method double Rectangle2D.getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #41  <Method double Rectangle2D.getY()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #44  <Method double Rectangle2D.getWidth()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #47  <Method double Rectangle2D.getHeight()>
	//    9   17:invokevirtual   #50  <Method boolean contains(double, double, double, double)>
	//   10   20:ireturn         
	}

	public Rectangle getBounds()
	{
		int i = (int)Math.floor(getMinX());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method double getMinX()>
	//    2    4:invokestatic    #61  <Method double Math.floor(double)>
	//    3    7:d2i             
	//    4    8:istore_1        
		int j = (int)Math.floor(getMinY());
	//    5    9:aload_0         
	//    6   10:invokevirtual   #64  <Method double getMinY()>
	//    7   13:invokestatic    #61  <Method double Math.floor(double)>
	//    8   16:d2i             
	//    9   17:istore_2        
		int k = (int)Math.ceil(getMaxX());
	//   10   18:aload_0         
	//   11   19:invokevirtual   #67  <Method double getMaxX()>
	//   12   22:invokestatic    #70  <Method double Math.ceil(double)>
	//   13   25:d2i             
	//   14   26:istore_3        
		int l = (int)Math.ceil(getMaxY());
	//   15   27:aload_0         
	//   16   28:invokevirtual   #73  <Method double getMaxY()>
	//   17   31:invokestatic    #70  <Method double Math.ceil(double)>
	//   18   34:d2i             
	//   19   35:istore          4
		return new Rectangle(i, j, k - i, l - j);
	//   20   37:new             #75  <Class Rectangle>
	//   21   40:dup             
	//   22   41:iload_1         
	//   23   42:i2d             
	//   24   43:iload_2         
	//   25   44:i2d             
	//   26   45:iload_3         
	//   27   46:iload_1         
	//   28   47:isub            
	//   29   48:i2d             
	//   30   49:iload           4
	//   31   51:iload_2         
	//   32   52:isub            
	//   33   53:i2d             
	//   34   54:invokespecial   #78  <Method void Rectangle(double, double, double, double)>
	//   35   57:areturn         
	}

	public double getCenterX()
	{
		return getX() + getWidth() / 2D;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #80  <Method double getX()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #81  <Method double getWidth()>
	//    4    8:ldc2w           #82  <Double 2D>
	//    5   11:ddiv            
	//    6   12:dadd            
	//    7   13:dreturn         
	}

	public double getCenterY()
	{
		return getY() + getHeight() / 2D;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #85  <Method double getY()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #86  <Method double getHeight()>
	//    4    8:ldc2w           #82  <Double 2D>
	//    5   11:ddiv            
	//    6   12:dadd            
	//    7   13:dreturn         
	}

	public Rectangle2D getFrame()
	{
		return ((Rectangle2D) (new Rectangle2D.Double(getX(), getY(), getWidth(), getHeight())));
	//    0    0:new             #90  <Class Rectangle2D$Double>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #80  <Method double getX()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #85  <Method double getY()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #81  <Method double getWidth()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #86  <Method double getHeight()>
	//   10   20:invokespecial   #91  <Method void Rectangle2D$Double(double, double, double, double)>
	//   11   23:areturn         
	}

	public abstract double getHeight();

	public double getMaxX()
	{
		return getX() + getWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #80  <Method double getX()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #81  <Method double getWidth()>
	//    4    8:dadd            
	//    5    9:dreturn         
	}

	public double getMaxY()
	{
		return getY() + getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #85  <Method double getY()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #86  <Method double getHeight()>
	//    4    8:dadd            
	//    5    9:dreturn         
	}

	public double getMinX()
	{
		return getX();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #80  <Method double getX()>
	//    2    4:dreturn         
	}

	public double getMinY()
	{
		return getY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #85  <Method double getY()>
	//    2    4:dreturn         
	}

	public PathIterator getPathIterator(AffineTransform affinetransform, double d)
	{
		return ((PathIterator) (new FlatteningPathIterator(getPathIterator(affinetransform), d)));
	//    0    0:new             #95  <Class FlatteningPathIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #98  <Method PathIterator getPathIterator(AffineTransform)>
	//    5    9:dload_2         
	//    6   10:invokespecial   #101 <Method void FlatteningPathIterator(PathIterator, double)>
	//    7   13:areturn         
	}

	public abstract double getWidth();

	public abstract double getX();

	public abstract double getY();

	public boolean intersects(Rectangle2D rectangle2d)
	{
		return intersects(rectangle2d.getX(), rectangle2d.getY(), rectangle2d.getWidth(), rectangle2d.getHeight());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method double Rectangle2D.getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #41  <Method double Rectangle2D.getY()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #44  <Method double Rectangle2D.getWidth()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #47  <Method double Rectangle2D.getHeight()>
	//    9   17:invokevirtual   #104 <Method boolean intersects(double, double, double, double)>
	//   10   20:ireturn         
	}

	public abstract boolean isEmpty();

	public abstract void setFrame(double d, double d1, double d2, double d3);

	public void setFrame(Point2D point2d, Dimension2D dimension2d)
	{
		setFrame(point2d.getX(), point2d.getY(), dimension2d.getWidth(), dimension2d.getHeight());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #30  <Method double Point2D.getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #33  <Method double Point2D.getY()>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #111 <Method double Dimension2D.getWidth()>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #112 <Method double Dimension2D.getHeight()>
	//    9   17:invokevirtual   #114 <Method void setFrame(double, double, double, double)>
	//   10   20:return          
	}

	public void setFrame(Rectangle2D rectangle2d)
	{
		setFrame(rectangle2d.getX(), rectangle2d.getY(), rectangle2d.getWidth(), rectangle2d.getHeight());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method double Rectangle2D.getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #41  <Method double Rectangle2D.getY()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #44  <Method double Rectangle2D.getWidth()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #47  <Method double Rectangle2D.getHeight()>
	//    9   17:invokevirtual   #114 <Method void setFrame(double, double, double, double)>
	//   10   20:return          
	}

	public void setFrameFromCenter(double d, double d1, double d2, double d3)
	{
		d2 = Math.abs(d2 - d);
	//    0    0:dload           5
	//    1    2:dload_1         
	//    2    3:dsub            
	//    3    4:invokestatic    #119 <Method double Math.abs(double)>
	//    4    7:dstore          5
		d3 = Math.abs(d3 - d1);
	//    5    9:dload           7
	//    6   11:dload_3         
	//    7   12:dsub            
	//    8   13:invokestatic    #119 <Method double Math.abs(double)>
	//    9   16:dstore          7
		setFrame(d - d2, d1 - d3, d2 * 2D, d3 * 2D);
	//   10   18:aload_0         
	//   11   19:dload_1         
	//   12   20:dload           5
	//   13   22:dsub            
	//   14   23:dload_3         
	//   15   24:dload           7
	//   16   26:dsub            
	//   17   27:dload           5
	//   18   29:ldc2w           #82  <Double 2D>
	//   19   32:dmul            
	//   20   33:dload           7
	//   21   35:ldc2w           #82  <Double 2D>
	//   22   38:dmul            
	//   23   39:invokevirtual   #114 <Method void setFrame(double, double, double, double)>
	//   24   42:return          
	}

	public void setFrameFromCenter(Point2D point2d, Point2D point2d1)
	{
		setFrameFromCenter(point2d.getX(), point2d.getY(), point2d1.getX(), point2d1.getY());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #30  <Method double Point2D.getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #33  <Method double Point2D.getY()>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #30  <Method double Point2D.getX()>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #33  <Method double Point2D.getY()>
	//    9   17:invokevirtual   #122 <Method void setFrameFromCenter(double, double, double, double)>
	//   10   20:return          
	}

	public void setFrameFromDiagonal(double d, double d1, double d2, double d3)
	{
		double d5;
		if(d < d2)
	//*   0    0:dload_1         
	//*   1    1:dload           5
	//*   2    3:dcmpg           
	//*   3    4:ifge            45
		{
			double d4 = d;
	//    4    7:dload_1         
	//    5    8:dstore          9
			d2 -= d;
	//    6   10:dload           5
	//    7   12:dload_1         
	//    8   13:dsub            
	//    9   14:dstore          5
			d = d4;
	//   10   16:dload           9
	//   11   18:dstore_1        
		} else
	//*  12   19:dload_3         
	//*  13   20:dload           7
	//*  14   22:dcmpg           
	//*  15   23:ifge            61
	//*  16   26:dload_3         
	//*  17   27:dstore          9
	//*  18   29:dload           7
	//*  19   31:dload_3         
	//*  20   32:dsub            
	//*  21   33:dstore_3        
	//*  22   34:aload_0         
	//*  23   35:dload_1         
	//*  24   36:dload           9
	//*  25   38:dload           5
	//*  26   40:dload_3         
	//*  27   41:invokevirtual   #114 <Method void setFrame(double, double, double, double)>
	//*  28   44:return          
		{
			d5 = d2;
	//   29   45:dload           5
	//   30   47:dstore          9
			d2 = d - d2;
	//   31   49:dload_1         
	//   32   50:dload           5
	//   33   52:dsub            
	//   34   53:dstore          5
			d = d5;
	//   35   55:dload           9
	//   36   57:dstore_1        
		}
		if(d1 < d3)
		{
			d5 = d1;
			d1 = d3 - d1;
		} else
	//*  37   58:goto            19
		{
			d5 = d3;
	//   38   61:dload           7
	//   39   63:dstore          9
			d1 -= d3;
	//   40   65:dload_3         
	//   41   66:dload           7
	//   42   68:dsub            
	//   43   69:dstore_3        
		}
		setFrame(d, d5, d2, d1);
	//*  44   70:goto            34
	}

	public void setFrameFromDiagonal(Point2D point2d, Point2D point2d1)
	{
		setFrameFromDiagonal(point2d.getX(), point2d.getY(), point2d1.getX(), point2d1.getY());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #30  <Method double Point2D.getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #33  <Method double Point2D.getY()>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #30  <Method double Point2D.getX()>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #33  <Method double Point2D.getY()>
	//    9   17:invokevirtual   #125 <Method void setFrameFromDiagonal(double, double, double, double)>
	//   10   20:return          
	}
}
