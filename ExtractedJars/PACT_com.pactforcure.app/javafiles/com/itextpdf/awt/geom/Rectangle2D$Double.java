// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;


// Referenced classes of package com.itextpdf.awt.geom:
//			Rectangle2D

public static class Rectangle2D$Double extends Rectangle2D
{

	public Rectangle2D createIntersection(Rectangle2D rectangle2d)
	{
		Rectangle2D$Double rectangle2d$double = new Rectangle2D$Double();
	//    0    0:new             #2   <Class Rectangle2D$Double>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void Rectangle2D$Double()>
	//    3    7:astore_2        
		Rectangle2D.intersect(((Rectangle2D) (this)), rectangle2d, ((Rectangle2D) (rectangle2d$double)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokestatic    #26  <Method void Rectangle2D.intersect(Rectangle2D, Rectangle2D, Rectangle2D)>
		return ((Rectangle2D) (rectangle2d$double));
	//    8   14:aload_2         
	//    9   15:areturn         
	}

	public Rectangle2D createUnion(Rectangle2D rectangle2d)
	{
		Rectangle2D$Double rectangle2d$double = new Rectangle2D$Double();
	//    0    0:new             #2   <Class Rectangle2D$Double>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void Rectangle2D$Double()>
	//    3    7:astore_2        
		Rectangle2D.union(((Rectangle2D) (this)), rectangle2d, ((Rectangle2D) (rectangle2d$double)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokestatic    #30  <Method void Rectangle2D.union(Rectangle2D, Rectangle2D, Rectangle2D)>
		return ((Rectangle2D) (rectangle2d$double));
	//    8   14:aload_2         
	//    9   15:areturn         
	}

	public Rectangle2D getBounds2D()
	{
		return ((Rectangle2D) (new Rectangle2D$Double(x, y, width, height)));
	//    0    0:new             #2   <Class Rectangle2D$Double>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #34  <Field double x>
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field double y>
	//    6   12:aload_0         
	//    7   13:getfield        #38  <Field double width>
	//    8   16:aload_0         
	//    9   17:getfield        #40  <Field double height>
	//   10   20:invokespecial   #42  <Method void Rectangle2D$Double(double, double, double, double)>
	//   11   23:areturn         
	}

	public double getHeight()
	{
		return height;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field double height>
	//    2    4:dreturn         
	}

	public double getWidth()
	{
		return width;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field double width>
	//    2    4:dreturn         
	}

	public double getX()
	{
		return x;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field double x>
	//    2    4:dreturn         
	}

	public double getY()
	{
		return y;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field double y>
	//    2    4:dreturn         
	}

	public boolean isEmpty()
	{
		return width <= 0.0D || height <= 0.0D;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field double width>
	//    2    4:dconst_0        
	//    3    5:dcmpg           
	//    4    6:ifle            18
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field double height>
	//    7   13:dconst_0        
	//    8   14:dcmpg           
	//    9   15:ifgt            20
	//   10   18:iconst_1        
	//   11   19:ireturn         
	//   12   20:iconst_0        
	//   13   21:ireturn         
	}

	public int outcode(double d, double d1)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		if(width > 0.0D) goto _L2; else goto _L1
	//    2    3:aload_0         
	//    3    4:getfield        #38  <Field double width>
	//    4    7:dconst_0        
	//    5    8:dcmpg           
	//    6    9:ifgt            36
_L1:
		i = 0 | 5;
	//    7   12:iconst_0        
	//    8   13:iconst_5        
	//    9   14:ior             
	//   10   15:istore          5
_L8:
		if(height > 0.0D) goto _L4; else goto _L3
	//   11   17:aload_0         
	//   12   18:getfield        #40  <Field double height>
	//   13   21:dconst_0        
	//   14   22:dcmpg           
	//   15   23:ifgt            75
_L3:
		int j = i | 0xa;
	//   16   26:iload           5
	//   17   28:bipush          10
	//   18   30:ior             
	//   19   31:istore          6
_L6:
		return j;
	//   20   33:iload           6
	//   21   35:ireturn         
_L2:
		if(d < x)
	//*  22   36:dload_1         
	//*  23   37:aload_0         
	//*  24   38:getfield        #34  <Field double x>
	//*  25   41:dcmpg           
	//*  26   42:ifge            53
			i = ((int) (false | true));
	//   27   45:iconst_0        
	//   28   46:iconst_1        
	//   29   47:ior             
	//   30   48:istore          5
		else
	//*  31   50:goto            17
		if(d > x + width)
	//*  32   53:dload_1         
	//*  33   54:aload_0         
	//*  34   55:getfield        #34  <Field double x>
	//*  35   58:aload_0         
	//*  36   59:getfield        #38  <Field double width>
	//*  37   62:dadd            
	//*  38   63:dcmpl           
	//*  39   64:ifle            17
			i = 0 | 4;
	//   40   67:iconst_0        
	//   41   68:iconst_4        
	//   42   69:ior             
	//   43   70:istore          5
		continue; /* Loop/switch isn't completed */
	//   44   72:goto            17
_L4:
		if(d1 < y)
	//*  45   75:dload_3         
	//*  46   76:aload_0         
	//*  47   77:getfield        #36  <Field double y>
	//*  48   80:dcmpg           
	//*  49   81:ifge            89
			return i | 2;
	//   50   84:iload           5
	//   51   86:iconst_2        
	//   52   87:ior             
	//   53   88:ireturn         
		j = i;
	//   54   89:iload           5
	//   55   91:istore          6
		if(d1 <= y + height) goto _L6; else goto _L5
	//   56   93:dload_3         
	//   57   94:aload_0         
	//   58   95:getfield        #36  <Field double y>
	//   59   98:aload_0         
	//   60   99:getfield        #40  <Field double height>
	//   61  102:dadd            
	//   62  103:dcmpl           
	//   63  104:ifle            33
_L5:
		return i | 8;
	//   64  107:iload           5
	//   65  109:bipush          8
	//   66  111:ior             
	//   67  112:ireturn         
		if(true) goto _L8; else goto _L7
_L7:
	}

	public void setRect(double d, double d1, double d2, double d3)
	{
		x = d;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #34  <Field double x>
		y = d1;
	//    3    5:aload_0         
	//    4    6:dload_3         
	//    5    7:putfield        #36  <Field double y>
		width = d2;
	//    6   10:aload_0         
	//    7   11:dload           5
	//    8   13:putfield        #38  <Field double width>
		height = d3;
	//    9   16:aload_0         
	//   10   17:dload           7
	//   11   19:putfield        #40  <Field double height>
	//   12   22:return          
	}

	public void setRect(Rectangle2D rectangle2d)
	{
		x = rectangle2d.getX();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #54  <Method double Rectangle2D.getX()>
	//    3    5:putfield        #34  <Field double x>
		y = rectangle2d.getY();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #56  <Method double Rectangle2D.getY()>
	//    7   13:putfield        #36  <Field double y>
		width = rectangle2d.getWidth();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #58  <Method double Rectangle2D.getWidth()>
	//   11   21:putfield        #38  <Field double width>
		height = rectangle2d.getHeight();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #60  <Method double Rectangle2D.getHeight()>
	//   15   29:putfield        #40  <Field double height>
	//   16   32:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append(((Object)this).getClass().getName()).append("[x=").append(x).append(",y=").append(y).append(",width=").append(width).append(",height=").append(height).append("]").toString();
	//    0    0:new             #64  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #71  <Method Class Object.getClass()>
	//    5   11:invokevirtual   #76  <Method String Class.getName()>
	//    6   14:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc1            #82  <String "[x=">
	//    8   19:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:aload_0         
	//   10   23:getfield        #34  <Field double x>
	//   11   26:invokevirtual   #85  <Method StringBuilder StringBuilder.append(double)>
	//   12   29:ldc1            #87  <String ",y=">
	//   13   31:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   14   34:aload_0         
	//   15   35:getfield        #36  <Field double y>
	//   16   38:invokevirtual   #85  <Method StringBuilder StringBuilder.append(double)>
	//   17   41:ldc1            #89  <String ",width=">
	//   18   43:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   19   46:aload_0         
	//   20   47:getfield        #38  <Field double width>
	//   21   50:invokevirtual   #85  <Method StringBuilder StringBuilder.append(double)>
	//   22   53:ldc1            #91  <String ",height=">
	//   23   55:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   24   58:aload_0         
	//   25   59:getfield        #40  <Field double height>
	//   26   62:invokevirtual   #85  <Method StringBuilder StringBuilder.append(double)>
	//   27   65:ldc1            #93  <String "]">
	//   28   67:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   29   70:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   30   73:areturn         
	}

	public double height;
	public double width;
	public double x;
	public double y;

	public Rectangle2D$Double()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Rectangle2D()>
	//    2    4:return          
	}

	public Rectangle2D$Double(double d, double d1, double d2, double d3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Rectangle2D()>
		setRect(d, d1, d2, d3);
	//    2    4:aload_0         
	//    3    5:dload_1         
	//    4    6:dload_3         
	//    5    7:dload           5
	//    6    9:dload           7
	//    7   11:invokevirtual   #19  <Method void setRect(double, double, double, double)>
	//    8   14:return          
	}
}
