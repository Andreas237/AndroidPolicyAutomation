// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;

import com.itextpdf.awt.geom.misc.HashCode;
import com.itextpdf.awt.geom.misc.Messages;
import java.util.NoSuchElementException;

// Referenced classes of package com.itextpdf.awt.geom:
//			RectangularShape, Point2D, Line2D, AffineTransform, 
//			PathIterator

public abstract class Rectangle2D extends RectangularShape
{
	public static class Double extends Rectangle2D
	{

		public Rectangle2D createIntersection(Rectangle2D rectangle2d)
		{
			Double double1 = new Double();
		//    0    0:new             #2   <Class Rectangle2D$Double>
		//    1    3:dup             
		//    2    4:invokespecial   #22  <Method void Rectangle2D$Double()>
		//    3    7:astore_2        
			Rectangle2D.intersect(((Rectangle2D) (this)), rectangle2d, ((Rectangle2D) (double1)));
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokestatic    #26  <Method void Rectangle2D.intersect(Rectangle2D, Rectangle2D, Rectangle2D)>
			return ((Rectangle2D) (double1));
		//    8   14:aload_2         
		//    9   15:areturn         
		}

		public Rectangle2D createUnion(Rectangle2D rectangle2d)
		{
			Double double1 = new Double();
		//    0    0:new             #2   <Class Rectangle2D$Double>
		//    1    3:dup             
		//    2    4:invokespecial   #22  <Method void Rectangle2D$Double()>
		//    3    7:astore_2        
			Rectangle2D.union(((Rectangle2D) (this)), rectangle2d, ((Rectangle2D) (double1)));
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokestatic    #30  <Method void Rectangle2D.union(Rectangle2D, Rectangle2D, Rectangle2D)>
			return ((Rectangle2D) (double1));
		//    8   14:aload_2         
		//    9   15:areturn         
		}

		public Rectangle2D getBounds2D()
		{
			return ((Rectangle2D) (new Double(x, y, width, height)));
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

		public Double()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Rectangle2D()>
		//    2    4:return          
		}

		public Double(double d, double d1, double d2, double d3)
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

	public static class Float extends Rectangle2D
	{

		public Rectangle2D createIntersection(Rectangle2D rectangle2d)
		{
			Object obj;
			if(rectangle2d instanceof Double)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #23  <Class Rectangle2D$Double>
		//*   2    4:ifeq            23
				obj = ((Object) (new Double()));
		//    3    7:new             #23  <Class Rectangle2D$Double>
		//    4   10:dup             
		//    5   11:invokespecial   #24  <Method void Rectangle2D$Double()>
		//    6   14:astore_2        
			else
		//*   7   15:aload_0         
		//*   8   16:aload_1         
		//*   9   17:aload_2         
		//*  10   18:invokestatic    #28  <Method void Rectangle2D.intersect(Rectangle2D, Rectangle2D, Rectangle2D)>
		//*  11   21:aload_2         
		//*  12   22:areturn         
				obj = ((Object) (new Float()));
		//   13   23:new             #2   <Class Rectangle2D$Float>
		//   14   26:dup             
		//   15   27:invokespecial   #29  <Method void Rectangle2D$Float()>
		//   16   30:astore_2        
			Rectangle2D.intersect(((Rectangle2D) (this)), rectangle2d, ((Rectangle2D) (obj)));
			return ((Rectangle2D) (obj));
		//*  17   31:goto            15
		}

		public Rectangle2D createUnion(Rectangle2D rectangle2d)
		{
			Object obj;
			if(rectangle2d instanceof Double)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #23  <Class Rectangle2D$Double>
		//*   2    4:ifeq            23
				obj = ((Object) (new Double()));
		//    3    7:new             #23  <Class Rectangle2D$Double>
		//    4   10:dup             
		//    5   11:invokespecial   #24  <Method void Rectangle2D$Double()>
		//    6   14:astore_2        
			else
		//*   7   15:aload_0         
		//*   8   16:aload_1         
		//*   9   17:aload_2         
		//*  10   18:invokestatic    #33  <Method void Rectangle2D.union(Rectangle2D, Rectangle2D, Rectangle2D)>
		//*  11   21:aload_2         
		//*  12   22:areturn         
				obj = ((Object) (new Float()));
		//   13   23:new             #2   <Class Rectangle2D$Float>
		//   14   26:dup             
		//   15   27:invokespecial   #29  <Method void Rectangle2D$Float()>
		//   16   30:astore_2        
			Rectangle2D.union(((Rectangle2D) (this)), rectangle2d, ((Rectangle2D) (obj)));
			return ((Rectangle2D) (obj));
		//*  17   31:goto            15
		}

		public Rectangle2D getBounds2D()
		{
			return ((Rectangle2D) (new Float(x, y, width, height)));
		//    0    0:new             #2   <Class Rectangle2D$Float>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #37  <Field float x>
		//    4    8:aload_0         
		//    5    9:getfield        #39  <Field float y>
		//    6   12:aload_0         
		//    7   13:getfield        #41  <Field float width>
		//    8   16:aload_0         
		//    9   17:getfield        #43  <Field float height>
		//   10   20:invokespecial   #45  <Method void Rectangle2D$Float(float, float, float, float)>
		//   11   23:areturn         
		}

		public double getHeight()
		{
			return (double)height;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field float height>
		//    2    4:f2d             
		//    3    5:dreturn         
		}

		public double getWidth()
		{
			return (double)width;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field float width>
		//    2    4:f2d             
		//    3    5:dreturn         
		}

		public double getX()
		{
			return (double)x;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field float x>
		//    2    4:f2d             
		//    3    5:dreturn         
		}

		public double getY()
		{
			return (double)y;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field float y>
		//    2    4:f2d             
		//    3    5:dreturn         
		}

		public boolean isEmpty()
		{
			return width <= 0.0F || height <= 0.0F;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field float width>
		//    2    4:fconst_0        
		//    3    5:fcmpg           
		//    4    6:ifle            18
		//    5    9:aload_0         
		//    6   10:getfield        #43  <Field float height>
		//    7   13:fconst_0        
		//    8   14:fcmpg           
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
			if(width > 0.0F) goto _L2; else goto _L1
		//    2    3:aload_0         
		//    3    4:getfield        #41  <Field float width>
		//    4    7:fconst_0        
		//    5    8:fcmpg           
		//    6    9:ifgt            36
_L1:
			i = 0 | 5;
		//    7   12:iconst_0        
		//    8   13:iconst_5        
		//    9   14:ior             
		//   10   15:istore          5
_L8:
			if(height > 0.0F) goto _L4; else goto _L3
		//   11   17:aload_0         
		//   12   18:getfield        #43  <Field float height>
		//   13   21:fconst_0        
		//   14   22:fcmpg           
		//   15   23:ifgt            77
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
			if(d < (double)x)
		//*  22   36:dload_1         
		//*  23   37:aload_0         
		//*  24   38:getfield        #37  <Field float x>
		//*  25   41:f2d             
		//*  26   42:dcmpg           
		//*  27   43:ifge            54
				i = ((int) (false | true));
		//   28   46:iconst_0        
		//   29   47:iconst_1        
		//   30   48:ior             
		//   31   49:istore          5
			else
		//*  32   51:goto            17
			if(d > (double)(x + width))
		//*  33   54:dload_1         
		//*  34   55:aload_0         
		//*  35   56:getfield        #37  <Field float x>
		//*  36   59:aload_0         
		//*  37   60:getfield        #41  <Field float width>
		//*  38   63:fadd            
		//*  39   64:f2d             
		//*  40   65:dcmpl           
		//*  41   66:ifle            17
				i = 0 | 4;
		//   42   69:iconst_0        
		//   43   70:iconst_4        
		//   44   71:ior             
		//   45   72:istore          5
			continue; /* Loop/switch isn't completed */
		//   46   74:goto            17
_L4:
			if(d1 < (double)y)
		//*  47   77:dload_3         
		//*  48   78:aload_0         
		//*  49   79:getfield        #39  <Field float y>
		//*  50   82:f2d             
		//*  51   83:dcmpg           
		//*  52   84:ifge            92
				return i | 2;
		//   53   87:iload           5
		//   54   89:iconst_2        
		//   55   90:ior             
		//   56   91:ireturn         
			j = i;
		//   57   92:iload           5
		//   58   94:istore          6
			if(d1 <= (double)(y + height)) goto _L6; else goto _L5
		//   59   96:dload_3         
		//   60   97:aload_0         
		//   61   98:getfield        #39  <Field float y>
		//   62  101:aload_0         
		//   63  102:getfield        #43  <Field float height>
		//   64  105:fadd            
		//   65  106:f2d             
		//   66  107:dcmpl           
		//   67  108:ifle            33
_L5:
			return i | 8;
		//   68  111:iload           5
		//   69  113:bipush          8
		//   70  115:ior             
		//   71  116:ireturn         
			if(true) goto _L8; else goto _L7
_L7:
		}

		public void setRect(double d, double d1, double d2, double d3)
		{
			x = (float)d;
		//    0    0:aload_0         
		//    1    1:dload_1         
		//    2    2:d2f             
		//    3    3:putfield        #37  <Field float x>
			y = (float)d1;
		//    4    6:aload_0         
		//    5    7:dload_3         
		//    6    8:d2f             
		//    7    9:putfield        #39  <Field float y>
			width = (float)d2;
		//    8   12:aload_0         
		//    9   13:dload           5
		//   10   15:d2f             
		//   11   16:putfield        #41  <Field float width>
			height = (float)d3;
		//   12   19:aload_0         
		//   13   20:dload           7
		//   14   22:d2f             
		//   15   23:putfield        #43  <Field float height>
		//   16   26:return          
		}

		public void setRect(float f, float f1, float f2, float f3)
		{
			x = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #37  <Field float x>
			y = f1;
		//    3    5:aload_0         
		//    4    6:fload_2         
		//    5    7:putfield        #39  <Field float y>
			width = f2;
		//    6   10:aload_0         
		//    7   11:fload_3         
		//    8   12:putfield        #41  <Field float width>
			height = f3;
		//    9   15:aload_0         
		//   10   16:fload           4
		//   11   18:putfield        #43  <Field float height>
		//   12   21:return          
		}

		public void setRect(Rectangle2D rectangle2d)
		{
			x = (float)rectangle2d.getX();
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #58  <Method double Rectangle2D.getX()>
		//    3    5:d2f             
		//    4    6:putfield        #37  <Field float x>
			y = (float)rectangle2d.getY();
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:invokevirtual   #60  <Method double Rectangle2D.getY()>
		//    8   14:d2f             
		//    9   15:putfield        #39  <Field float y>
			width = (float)rectangle2d.getWidth();
		//   10   18:aload_0         
		//   11   19:aload_1         
		//   12   20:invokevirtual   #62  <Method double Rectangle2D.getWidth()>
		//   13   23:d2f             
		//   14   24:putfield        #41  <Field float width>
			height = (float)rectangle2d.getHeight();
		//   15   27:aload_0         
		//   16   28:aload_1         
		//   17   29:invokevirtual   #64  <Method double Rectangle2D.getHeight()>
		//   18   32:d2f             
		//   19   33:putfield        #43  <Field float height>
		//   20   36:return          
		}

		public String toString()
		{
			return (new StringBuilder()).append(((Object)this).getClass().getName()).append("[x=").append(x).append(",y=").append(y).append(",width=").append(width).append(",height=").append(height).append("]").toString();
		//    0    0:new             #68  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #69  <Method void StringBuilder()>
		//    3    7:aload_0         
		//    4    8:invokevirtual   #75  <Method Class Object.getClass()>
		//    5   11:invokevirtual   #80  <Method String Class.getName()>
		//    6   14:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
		//    7   17:ldc1            #86  <String "[x=">
		//    8   19:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:aload_0         
		//   10   23:getfield        #37  <Field float x>
		//   11   26:invokevirtual   #89  <Method StringBuilder StringBuilder.append(float)>
		//   12   29:ldc1            #91  <String ",y=">
		//   13   31:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
		//   14   34:aload_0         
		//   15   35:getfield        #39  <Field float y>
		//   16   38:invokevirtual   #89  <Method StringBuilder StringBuilder.append(float)>
		//   17   41:ldc1            #93  <String ",width=">
		//   18   43:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
		//   19   46:aload_0         
		//   20   47:getfield        #41  <Field float width>
		//   21   50:invokevirtual   #89  <Method StringBuilder StringBuilder.append(float)>
		//   22   53:ldc1            #95  <String ",height=">
		//   23   55:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
		//   24   58:aload_0         
		//   25   59:getfield        #43  <Field float height>
		//   26   62:invokevirtual   #89  <Method StringBuilder StringBuilder.append(float)>
		//   27   65:ldc1            #97  <String "]">
		//   28   67:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
		//   29   70:invokevirtual   #99  <Method String StringBuilder.toString()>
		//   30   73:areturn         
		}

		public float height;
		public float width;
		public float x;
		public float y;

		public Float()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Rectangle2D()>
		//    2    4:return          
		}

		public Float(float f, float f1, float f2, float f3)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Rectangle2D()>
			setRect(f, f1, f2, f3);
		//    2    4:aload_0         
		//    3    5:fload_1         
		//    4    6:fload_2         
		//    5    7:fload_3         
		//    6    8:fload           4
		//    7   10:invokevirtual   #19  <Method void setRect(float, float, float, float)>
		//    8   13:return          
		}
	}

	class Iterator
		implements PathIterator
	{

		public int currentSegment(double ad[])
		{
			if(isDone())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #59  <Method boolean isDone()>
		//*   2    4:ifeq            20
				throw new NoSuchElementException(Messages.getString("awt.4B"));
		//    3    7:new             #61  <Class NoSuchElementException>
		//    4   10:dup             
		//    5   11:ldc1            #63  <String "awt.4B">
		//    6   13:invokestatic    #69  <Method String Messages.getString(String)>
		//    7   16:invokespecial   #72  <Method void NoSuchElementException(String)>
		//    8   19:athrow          
			if(index != 5) goto _L2; else goto _L1
		//    9   20:aload_0         
		//   10   21:getfield        #52  <Field int index>
		//   11   24:iconst_5        
		//   12   25:icmpne          32
_L1:
			int j = 4;
		//   13   28:iconst_4        
		//   14   29:istore_3        
_L4:
			return j;
		//   15   30:iload_3         
		//   16   31:ireturn         
_L2:
			int i;
			if(index != 0)
				break; /* Loop/switch isn't completed */
		//   17   32:aload_0         
		//   18   33:getfield        #52  <Field int index>
		//   19   36:ifne            78
			i = 0;
		//   20   39:iconst_0        
		//   21   40:istore_2        
			ad[0] = x;
		//   22   41:aload_1         
		//   23   42:iconst_0        
		//   24   43:aload_0         
		//   25   44:getfield        #33  <Field double x>
		//   26   47:dastore         
			ad[1] = y;
		//   27   48:aload_1         
		//   28   49:iconst_1        
		//   29   50:aload_0         
		//   30   51:getfield        #38  <Field double y>
		//   31   54:dastore         
_L6:
			j = i;
		//   32   55:iload_2         
		//   33   56:istore_3        
			if(t != null)
		//*  34   57:aload_0         
		//*  35   58:getfield        #50  <Field AffineTransform t>
		//*  36   61:ifnull          30
			{
				t.transform(ad, 0, ad, 0, 1);
		//   37   64:aload_0         
		//   38   65:getfield        #50  <Field AffineTransform t>
		//   39   68:aload_1         
		//   40   69:iconst_0        
		//   41   70:aload_1         
		//   42   71:iconst_0        
		//   43   72:iconst_1        
		//   44   73:invokevirtual   #78  <Method void AffineTransform.transform(double[], int, double[], int, int)>
				return i;
		//   45   76:iload_2         
		//   46   77:ireturn         
			}
			if(true) goto _L4; else goto _L3
_L3:
			i = 1;
		//   47   78:iconst_1        
		//   48   79:istore_2        
			switch(index)
		//*  49   80:aload_0         
		//*  50   81:getfield        #52  <Field int index>
			{
		//*  51   84:tableswitch     1 4: default 116
		//		               1 119
		//		               2 141
		//		               3 168
		//		               4 190
		//*  52  116:goto            55
			case 1: // '\001'
				ad[0] = x + width;
		//   53  119:aload_1         
		//   54  120:iconst_0        
		//   55  121:aload_0         
		//   56  122:getfield        #33  <Field double x>
		//   57  125:aload_0         
		//   58  126:getfield        #43  <Field double width>
		//   59  129:dadd            
		//   60  130:dastore         
				ad[1] = y;
		//   61  131:aload_1         
		//   62  132:iconst_1        
		//   63  133:aload_0         
		//   64  134:getfield        #38  <Field double y>
		//   65  137:dastore         
				break;

		//*  66  138:goto            55
			case 2: // '\002'
				ad[0] = x + width;
		//   67  141:aload_1         
		//   68  142:iconst_0        
		//   69  143:aload_0         
		//   70  144:getfield        #33  <Field double x>
		//   71  147:aload_0         
		//   72  148:getfield        #43  <Field double width>
		//   73  151:dadd            
		//   74  152:dastore         
				ad[1] = y + height;
		//   75  153:aload_1         
		//   76  154:iconst_1        
		//   77  155:aload_0         
		//   78  156:getfield        #38  <Field double y>
		//   79  159:aload_0         
		//   80  160:getfield        #48  <Field double height>
		//   81  163:dadd            
		//   82  164:dastore         
				break;

		//*  83  165:goto            55
			case 3: // '\003'
				ad[0] = x;
		//   84  168:aload_1         
		//   85  169:iconst_0        
		//   86  170:aload_0         
		//   87  171:getfield        #33  <Field double x>
		//   88  174:dastore         
				ad[1] = y + height;
		//   89  175:aload_1         
		//   90  176:iconst_1        
		//   91  177:aload_0         
		//   92  178:getfield        #38  <Field double y>
		//   93  181:aload_0         
		//   94  182:getfield        #48  <Field double height>
		//   95  185:dadd            
		//   96  186:dastore         
				break;

		//*  97  187:goto            55
			case 4: // '\004'
				ad[0] = x;
		//   98  190:aload_1         
		//   99  191:iconst_0        
		//  100  192:aload_0         
		//  101  193:getfield        #33  <Field double x>
		//  102  196:dastore         
				ad[1] = y;
		//  103  197:aload_1         
		//  104  198:iconst_1        
		//  105  199:aload_0         
		//  106  200:getfield        #38  <Field double y>
		//  107  203:dastore         
				break;
			}
			if(true) goto _L6; else goto _L5
_L5:
		//* 108  204:goto            55
		}

		public int currentSegment(float af[])
		{
			if(isDone())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #59  <Method boolean isDone()>
		//*   2    4:ifeq            20
				throw new NoSuchElementException(Messages.getString("awt.4B"));
		//    3    7:new             #61  <Class NoSuchElementException>
		//    4   10:dup             
		//    5   11:ldc1            #63  <String "awt.4B">
		//    6   13:invokestatic    #69  <Method String Messages.getString(String)>
		//    7   16:invokespecial   #72  <Method void NoSuchElementException(String)>
		//    8   19:athrow          
			if(index != 5) goto _L2; else goto _L1
		//    9   20:aload_0         
		//   10   21:getfield        #52  <Field int index>
		//   11   24:iconst_5        
		//   12   25:icmpne          32
_L1:
			int j = 4;
		//   13   28:iconst_4        
		//   14   29:istore_3        
_L4:
			return j;
		//   15   30:iload_3         
		//   16   31:ireturn         
_L2:
			int i;
			if(index != 0)
				break; /* Loop/switch isn't completed */
		//   17   32:aload_0         
		//   18   33:getfield        #52  <Field int index>
		//   19   36:ifne            80
			af[0] = (float)x;
		//   20   39:aload_1         
		//   21   40:iconst_0        
		//   22   41:aload_0         
		//   23   42:getfield        #33  <Field double x>
		//   24   45:d2f             
		//   25   46:fastore         
			af[1] = (float)y;
		//   26   47:aload_1         
		//   27   48:iconst_1        
		//   28   49:aload_0         
		//   29   50:getfield        #38  <Field double y>
		//   30   53:d2f             
		//   31   54:fastore         
			i = 0;
		//   32   55:iconst_0        
		//   33   56:istore_2        
_L6:
			j = i;
		//   34   57:iload_2         
		//   35   58:istore_3        
			if(t != null)
		//*  36   59:aload_0         
		//*  37   60:getfield        #50  <Field AffineTransform t>
		//*  38   63:ifnull          30
			{
				t.transform(af, 0, af, 0, 1);
		//   39   66:aload_0         
		//   40   67:getfield        #50  <Field AffineTransform t>
		//   41   70:aload_1         
		//   42   71:iconst_0        
		//   43   72:aload_1         
		//   44   73:iconst_0        
		//   45   74:iconst_1        
		//   46   75:invokevirtual   #82  <Method void AffineTransform.transform(float[], int, float[], int, int)>
				return i;
		//   47   78:iload_2         
		//   48   79:ireturn         
			}
			if(true) goto _L4; else goto _L3
_L3:
			i = 1;
		//   49   80:iconst_1        
		//   50   81:istore_2        
			switch(index)
		//*  51   82:aload_0         
		//*  52   83:getfield        #52  <Field int index>
			{
		//*  53   86:tableswitch     1 4: default 116
		//		               1 119
		//		               2 143
		//		               3 172
		//		               4 196
		//*  54  116:goto            57
			case 1: // '\001'
				af[0] = (float)(x + width);
		//   55  119:aload_1         
		//   56  120:iconst_0        
		//   57  121:aload_0         
		//   58  122:getfield        #33  <Field double x>
		//   59  125:aload_0         
		//   60  126:getfield        #43  <Field double width>
		//   61  129:dadd            
		//   62  130:d2f             
		//   63  131:fastore         
				af[1] = (float)y;
		//   64  132:aload_1         
		//   65  133:iconst_1        
		//   66  134:aload_0         
		//   67  135:getfield        #38  <Field double y>
		//   68  138:d2f             
		//   69  139:fastore         
				break;

		//*  70  140:goto            57
			case 2: // '\002'
				af[0] = (float)(x + width);
		//   71  143:aload_1         
		//   72  144:iconst_0        
		//   73  145:aload_0         
		//   74  146:getfield        #33  <Field double x>
		//   75  149:aload_0         
		//   76  150:getfield        #43  <Field double width>
		//   77  153:dadd            
		//   78  154:d2f             
		//   79  155:fastore         
				af[1] = (float)(y + height);
		//   80  156:aload_1         
		//   81  157:iconst_1        
		//   82  158:aload_0         
		//   83  159:getfield        #38  <Field double y>
		//   84  162:aload_0         
		//   85  163:getfield        #48  <Field double height>
		//   86  166:dadd            
		//   87  167:d2f             
		//   88  168:fastore         
				break;

		//*  89  169:goto            57
			case 3: // '\003'
				af[0] = (float)x;
		//   90  172:aload_1         
		//   91  173:iconst_0        
		//   92  174:aload_0         
		//   93  175:getfield        #33  <Field double x>
		//   94  178:d2f             
		//   95  179:fastore         
				af[1] = (float)(y + height);
		//   96  180:aload_1         
		//   97  181:iconst_1        
		//   98  182:aload_0         
		//   99  183:getfield        #38  <Field double y>
		//  100  186:aload_0         
		//  101  187:getfield        #48  <Field double height>
		//  102  190:dadd            
		//  103  191:d2f             
		//  104  192:fastore         
				break;

		//* 105  193:goto            57
			case 4: // '\004'
				af[0] = (float)x;
		//  106  196:aload_1         
		//  107  197:iconst_0        
		//  108  198:aload_0         
		//  109  199:getfield        #33  <Field double x>
		//  110  202:d2f             
		//  111  203:fastore         
				af[1] = (float)y;
		//  112  204:aload_1         
		//  113  205:iconst_1        
		//  114  206:aload_0         
		//  115  207:getfield        #38  <Field double y>
		//  116  210:d2f             
		//  117  211:fastore         
				break;
			}
			if(true) goto _L6; else goto _L5
_L5:
		//* 118  212:goto            57
		}

		public int getWindingRule()
		{
			return 1;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public boolean isDone()
		{
			return index > 5;
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field int index>
		//    2    4:iconst_5        
		//    3    5:icmple          10
		//    4    8:iconst_1        
		//    5    9:ireturn         
		//    6   10:iconst_0        
		//    7   11:ireturn         
		}

		public void next()
		{
			index = index + 1;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #52  <Field int index>
		//    3    5:iconst_1        
		//    4    6:iadd            
		//    5    7:putfield        #52  <Field int index>
		//    6   10:return          
		}

		double height;
		int index;
		AffineTransform t;
		final Rectangle2D this$0;
		double width;
		double x;
		double y;

		Iterator(Rectangle2D rectangle2d1, AffineTransform affinetransform)
		{
			this$0 = Rectangle2D.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #24  <Field Rectangle2D this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #27  <Method void Object()>
			x = rectangle2d1.getX();
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:invokevirtual   #31  <Method double Rectangle2D.getX()>
		//    8   14:putfield        #33  <Field double x>
			y = rectangle2d1.getY();
		//    9   17:aload_0         
		//   10   18:aload_2         
		//   11   19:invokevirtual   #36  <Method double Rectangle2D.getY()>
		//   12   22:putfield        #38  <Field double y>
			width = rectangle2d1.getWidth();
		//   13   25:aload_0         
		//   14   26:aload_2         
		//   15   27:invokevirtual   #41  <Method double Rectangle2D.getWidth()>
		//   16   30:putfield        #43  <Field double width>
			height = rectangle2d1.getHeight();
		//   17   33:aload_0         
		//   18   34:aload_2         
		//   19   35:invokevirtual   #46  <Method double Rectangle2D.getHeight()>
		//   20   38:putfield        #48  <Field double height>
			t = affinetransform;
		//   21   41:aload_0         
		//   22   42:aload_3         
		//   23   43:putfield        #50  <Field AffineTransform t>
			if(width < 0.0D || height < 0.0D)
		//*  24   46:aload_0         
		//*  25   47:getfield        #43  <Field double width>
		//*  26   50:dconst_0        
		//*  27   51:dcmpg           
		//*  28   52:iflt            64
		//*  29   55:aload_0         
		//*  30   56:getfield        #48  <Field double height>
		//*  31   59:dconst_0        
		//*  32   60:dcmpg           
		//*  33   61:ifge            70
				index = 6;
		//   34   64:aload_0         
		//   35   65:bipush          6
		//   36   67:putfield        #52  <Field int index>
		//   37   70:return          
		}
	}


	protected Rectangle2D()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void RectangularShape()>
	//    2    4:return          
	}

	public static void intersect(Rectangle2D rectangle2d, Rectangle2D rectangle2d1, Rectangle2D rectangle2d2)
	{
		double d = Math.max(rectangle2d.getMinX(), rectangle2d1.getMinX());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method double getMinX()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #33  <Method double getMinX()>
	//    4    8:invokestatic    #39  <Method double Math.max(double, double)>
	//    5   11:dstore_3        
		double d1 = Math.max(rectangle2d.getMinY(), rectangle2d1.getMinY());
	//    6   12:aload_0         
	//    7   13:invokevirtual   #42  <Method double getMinY()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #42  <Method double getMinY()>
	//   10   20:invokestatic    #39  <Method double Math.max(double, double)>
	//   11   23:dstore          5
		rectangle2d2.setFrame(d, d1, Math.min(rectangle2d.getMaxX(), rectangle2d1.getMaxX()) - d, Math.min(rectangle2d.getMaxY(), rectangle2d1.getMaxY()) - d1);
	//   12   25:aload_2         
	//   13   26:dload_3         
	//   14   27:dload           5
	//   15   29:aload_0         
	//   16   30:invokevirtual   #45  <Method double getMaxX()>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #45  <Method double getMaxX()>
	//   19   37:invokestatic    #48  <Method double Math.min(double, double)>
	//   20   40:dload_3         
	//   21   41:dsub            
	//   22   42:aload_0         
	//   23   43:invokevirtual   #51  <Method double getMaxY()>
	//   24   46:aload_1         
	//   25   47:invokevirtual   #51  <Method double getMaxY()>
	//   26   50:invokestatic    #48  <Method double Math.min(double, double)>
	//   27   53:dload           5
	//   28   55:dsub            
	//   29   56:invokevirtual   #55  <Method void setFrame(double, double, double, double)>
	//   30   59:return          
	}

	public static void union(Rectangle2D rectangle2d, Rectangle2D rectangle2d1, Rectangle2D rectangle2d2)
	{
		double d = Math.min(rectangle2d.getMinX(), rectangle2d1.getMinX());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method double getMinX()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #33  <Method double getMinX()>
	//    4    8:invokestatic    #48  <Method double Math.min(double, double)>
	//    5   11:dstore_3        
		double d1 = Math.min(rectangle2d.getMinY(), rectangle2d1.getMinY());
	//    6   12:aload_0         
	//    7   13:invokevirtual   #42  <Method double getMinY()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #42  <Method double getMinY()>
	//   10   20:invokestatic    #48  <Method double Math.min(double, double)>
	//   11   23:dstore          5
		rectangle2d2.setFrame(d, d1, Math.max(rectangle2d.getMaxX(), rectangle2d1.getMaxX()) - d, Math.max(rectangle2d.getMaxY(), rectangle2d1.getMaxY()) - d1);
	//   12   25:aload_2         
	//   13   26:dload_3         
	//   14   27:dload           5
	//   15   29:aload_0         
	//   16   30:invokevirtual   #45  <Method double getMaxX()>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #45  <Method double getMaxX()>
	//   19   37:invokestatic    #39  <Method double Math.max(double, double)>
	//   20   40:dload_3         
	//   21   41:dsub            
	//   22   42:aload_0         
	//   23   43:invokevirtual   #51  <Method double getMaxY()>
	//   24   46:aload_1         
	//   25   47:invokevirtual   #51  <Method double getMaxY()>
	//   26   50:invokestatic    #39  <Method double Math.max(double, double)>
	//   27   53:dload           5
	//   28   55:dsub            
	//   29   56:invokevirtual   #55  <Method void setFrame(double, double, double, double)>
	//   30   59:return          
	}

	public void add(double d, double d1)
	{
		double d2 = Math.min(getMinX(), d);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method double getMinX()>
	//    2    4:dload_1         
	//    3    5:invokestatic    #48  <Method double Math.min(double, double)>
	//    4    8:dstore          5
		double d3 = Math.min(getMinY(), d1);
	//    5   10:aload_0         
	//    6   11:invokevirtual   #42  <Method double getMinY()>
	//    7   14:dload_3         
	//    8   15:invokestatic    #48  <Method double Math.min(double, double)>
	//    9   18:dstore          7
		setRect(d2, d3, Math.max(getMaxX(), d) - d2, Math.max(getMaxY(), d1) - d3);
	//   10   20:aload_0         
	//   11   21:dload           5
	//   12   23:dload           7
	//   13   25:aload_0         
	//   14   26:invokevirtual   #45  <Method double getMaxX()>
	//   15   29:dload_1         
	//   16   30:invokestatic    #39  <Method double Math.max(double, double)>
	//   17   33:dload           5
	//   18   35:dsub            
	//   19   36:aload_0         
	//   20   37:invokevirtual   #51  <Method double getMaxY()>
	//   21   40:dload_3         
	//   22   41:invokestatic    #39  <Method double Math.max(double, double)>
	//   23   44:dload           7
	//   24   46:dsub            
	//   25   47:invokevirtual   #61  <Method void setRect(double, double, double, double)>
	//   26   50:return          
	}

	public void add(Point2D point2d)
	{
		add(point2d.getX(), point2d.getY());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #67  <Method double Point2D.getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #70  <Method double Point2D.getY()>
	//    5    9:invokevirtual   #72  <Method void add(double, double)>
	//    6   12:return          
	}

	public void add(Rectangle2D rectangle2d)
	{
		union(this, rectangle2d, this);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokestatic    #75  <Method void union(Rectangle2D, Rectangle2D, Rectangle2D)>
	//    4    6:return          
	}

	public boolean contains(double d, double d1)
	{
		if(isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #81  <Method boolean isEmpty()>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		double d2 = getX();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #82  <Method double getX()>
	//    7   13:dstore          5
		double d3 = getY();
	//    8   15:aload_0         
	//    9   16:invokevirtual   #83  <Method double getY()>
	//   10   19:dstore          7
		double d4 = getWidth();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #86  <Method double getWidth()>
	//   13   25:dstore          9
		double d5 = getHeight();
	//   14   27:aload_0         
	//   15   28:invokevirtual   #89  <Method double getHeight()>
	//   16   31:dstore          11
		return d2 <= d && d < d2 + d4 && d3 <= d1 && d1 < d3 + d5;
	//   17   33:dload           5
	//   18   35:dload_1         
	//   19   36:dcmpg           
	//   20   37:ifgt            69
	//   21   40:dload_1         
	//   22   41:dload           5
	//   23   43:dload           9
	//   24   45:dadd            
	//   25   46:dcmpg           
	//   26   47:ifge            69
	//   27   50:dload           7
	//   28   52:dload_3         
	//   29   53:dcmpg           
	//   30   54:ifgt            69
	//   31   57:dload_3         
	//   32   58:dload           7
	//   33   60:dload           11
	//   34   62:dadd            
	//   35   63:dcmpg           
	//   36   64:ifge            69
	//   37   67:iconst_1        
	//   38   68:ireturn         
	//   39   69:iconst_0        
	//   40   70:ireturn         
	}

	public boolean contains(double d, double d1, double d2, double d3)
	{
		if(isEmpty() || d2 <= 0.0D || d3 <= 0.0D)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #81  <Method boolean isEmpty()>
	//*   2    4:ifne            21
	//*   3    7:dload           5
	//*   4    9:dconst_0        
	//*   5   10:dcmpg           
	//*   6   11:ifle            21
	//*   7   14:dload           7
	//*   8   16:dconst_0        
	//*   9   17:dcmpg           
	//*  10   18:ifgt            23
			return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
		double d4 = getX();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #82  <Method double getX()>
	//   15   27:dstore          9
		double d5 = getY();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #83  <Method double getY()>
	//   18   33:dstore          11
		double d6 = getWidth();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #86  <Method double getWidth()>
	//   21   39:dstore          13
		double d7 = getHeight();
	//   22   41:aload_0         
	//   23   42:invokevirtual   #89  <Method double getHeight()>
	//   24   45:dstore          15
		return d4 <= d && d + d2 <= d4 + d6 && d5 <= d1 && d1 + d3 <= d5 + d7;
	//   25   47:dload           9
	//   26   49:dload_1         
	//   27   50:dcmpg           
	//   28   51:ifgt            89
	//   29   54:dload_1         
	//   30   55:dload           5
	//   31   57:dadd            
	//   32   58:dload           9
	//   33   60:dload           13
	//   34   62:dadd            
	//   35   63:dcmpg           
	//   36   64:ifgt            89
	//   37   67:dload           11
	//   38   69:dload_3         
	//   39   70:dcmpg           
	//   40   71:ifgt            89
	//   41   74:dload_3         
	//   42   75:dload           7
	//   43   77:dadd            
	//   44   78:dload           11
	//   45   80:dload           15
	//   46   82:dadd            
	//   47   83:dcmpg           
	//   48   84:ifgt            89
	//   49   87:iconst_1        
	//   50   88:ireturn         
	//   51   89:iconst_0        
	//   52   90:ireturn         
	}

	public abstract Rectangle2D createIntersection(Rectangle2D rectangle2d);

	public abstract Rectangle2D createUnion(Rectangle2D rectangle2d);

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
			if(obj instanceof Rectangle2D)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class Rectangle2D>
	//*   7   11:ifeq            69
	//*   8   14:aload_1         
	//*   9   15:checkcast       #2   <Class Rectangle2D>
	//*  10   18:astore_1        
			{
				if(getX() != ((Rectangle2D) (obj = ((Object) ((Rectangle2D)obj)))).getX() || getY() != ((Rectangle2D) (obj)).getY() || getWidth() != ((Rectangle2D) (obj)).getWidth() || getHeight() != ((Rectangle2D) (obj)).getHeight())
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #82  <Method double getX()>
	//*  13   23:aload_1         
	//*  14   24:invokevirtual   #82  <Method double getX()>
	//*  15   27:dcmpl           
	//*  16   28:ifne            67
	//*  17   31:aload_0         
	//*  18   32:invokevirtual   #83  <Method double getY()>
	//*  19   35:aload_1         
	//*  20   36:invokevirtual   #83  <Method double getY()>
	//*  21   39:dcmpl           
	//*  22   40:ifne            67
	//*  23   43:aload_0         
	//*  24   44:invokevirtual   #86  <Method double getWidth()>
	//*  25   47:aload_1         
	//*  26   48:invokevirtual   #86  <Method double getWidth()>
	//*  27   51:dcmpl           
	//*  28   52:ifne            67
	//*  29   55:aload_0         
	//*  30   56:invokevirtual   #89  <Method double getHeight()>
	//*  31   59:aload_1         
	//*  32   60:invokevirtual   #89  <Method double getHeight()>
	//*  33   63:dcmpl           
	//*  34   64:ifeq            5
					return false;
	//   35   67:iconst_0        
	//   36   68:ireturn         
			} else
			{
				return false;
	//   37   69:iconst_0        
	//   38   70:ireturn         
			}
		return true;
	}

	public Rectangle2D getBounds2D()
	{
		return (Rectangle2D)clone();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #101 <Method Object clone()>
	//    2    4:checkcast       #2   <Class Rectangle2D>
	//    3    7:areturn         
	}

	public PathIterator getPathIterator(AffineTransform affinetransform)
	{
		return ((PathIterator) (new Iterator(this, affinetransform)));
	//    0    0:new             #12  <Class Rectangle2D$Iterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #106 <Method void Rectangle2D$Iterator(Rectangle2D, Rectangle2D, AffineTransform)>
	//    6   10:areturn         
	}

	public PathIterator getPathIterator(AffineTransform affinetransform, double d)
	{
		return ((PathIterator) (new Iterator(this, affinetransform)));
	//    0    0:new             #12  <Class Rectangle2D$Iterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #106 <Method void Rectangle2D$Iterator(Rectangle2D, Rectangle2D, AffineTransform)>
	//    6   10:areturn         
	}

	public int hashCode()
	{
		HashCode hashcode = new HashCode();
	//    0    0:new             #111 <Class HashCode>
	//    1    3:dup             
	//    2    4:invokespecial   #112 <Method void HashCode()>
	//    3    7:astore_1        
		hashcode.append(getX());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #82  <Method double getX()>
	//    7   13:invokevirtual   #116 <Method HashCode HashCode.append(double)>
	//    8   16:pop             
		hashcode.append(getY());
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #83  <Method double getY()>
	//   12   22:invokevirtual   #116 <Method HashCode HashCode.append(double)>
	//   13   25:pop             
		hashcode.append(getWidth());
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:invokevirtual   #86  <Method double getWidth()>
	//   17   31:invokevirtual   #116 <Method HashCode HashCode.append(double)>
	//   18   34:pop             
		hashcode.append(getHeight());
	//   19   35:aload_1         
	//   20   36:aload_0         
	//   21   37:invokevirtual   #89  <Method double getHeight()>
	//   22   40:invokevirtual   #116 <Method HashCode HashCode.append(double)>
	//   23   43:pop             
		return hashcode.hashCode();
	//   24   44:aload_1         
	//   25   45:invokevirtual   #118 <Method int HashCode.hashCode()>
	//   26   48:ireturn         
	}

	public boolean intersects(double d, double d1, double d2, double d3)
	{
		if(isEmpty() || d2 <= 0.0D || d3 <= 0.0D)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #81  <Method boolean isEmpty()>
	//*   2    4:ifne            21
	//*   3    7:dload           5
	//*   4    9:dconst_0        
	//*   5   10:dcmpg           
	//*   6   11:ifle            21
	//*   7   14:dload           7
	//*   8   16:dconst_0        
	//*   9   17:dcmpg           
	//*  10   18:ifgt            23
			return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
		double d4 = getX();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #82  <Method double getX()>
	//   15   27:dstore          9
		double d5 = getY();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #83  <Method double getY()>
	//   18   33:dstore          11
		double d6 = getWidth();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #86  <Method double getWidth()>
	//   21   39:dstore          13
		double d7 = getHeight();
	//   22   41:aload_0         
	//   23   42:invokevirtual   #89  <Method double getHeight()>
	//   24   45:dstore          15
		return d + d2 > d4 && d < d4 + d6 && d1 + d3 > d5 && d1 < d5 + d7;
	//   25   47:dload_1         
	//   26   48:dload           5
	//   27   50:dadd            
	//   28   51:dload           9
	//   29   53:dcmpl           
	//   30   54:ifle            89
	//   31   57:dload_1         
	//   32   58:dload           9
	//   33   60:dload           13
	//   34   62:dadd            
	//   35   63:dcmpg           
	//   36   64:ifge            89
	//   37   67:dload_3         
	//   38   68:dload           7
	//   39   70:dadd            
	//   40   71:dload           11
	//   41   73:dcmpl           
	//   42   74:ifle            89
	//   43   77:dload_3         
	//   44   78:dload           11
	//   45   80:dload           15
	//   46   82:dadd            
	//   47   83:dcmpg           
	//   48   84:ifge            89
	//   49   87:iconst_1        
	//   50   88:ireturn         
	//   51   89:iconst_0        
	//   52   90:ireturn         
	}

	public boolean intersectsLine(double d, double d1, double d2, double d3)
	{
		double d4 = getX();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #82  <Method double getX()>
	//    2    4:dstore          9
		double d5 = getY();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #83  <Method double getY()>
	//    5   10:dstore          11
		double d6 = d4 + getWidth();
	//    6   12:dload           9
	//    7   14:aload_0         
	//    8   15:invokevirtual   #86  <Method double getWidth()>
	//    9   18:dadd            
	//   10   19:dstore          13
		double d7 = d5 + getHeight();
	//   11   21:dload           11
	//   12   23:aload_0         
	//   13   24:invokevirtual   #89  <Method double getHeight()>
	//   14   27:dadd            
	//   15   28:dstore          15
		return d4 <= d && d <= d6 && d5 <= d1 && d1 <= d7 || d4 <= d2 && d2 <= d6 && d5 <= d3 && d3 <= d7 || Line2D.linesIntersect(d4, d5, d6, d7, d, d1, d2, d3) || Line2D.linesIntersect(d6, d5, d4, d7, d, d1, d2, d3);
	//   16   30:dload           9
	//   17   32:dload_1         
	//   18   33:dcmpg           
	//   19   34:ifgt            58
	//   20   37:dload_1         
	//   21   38:dload           13
	//   22   40:dcmpg           
	//   23   41:ifgt            58
	//   24   44:dload           11
	//   25   46:dload_3         
	//   26   47:dcmpg           
	//   27   48:ifgt            58
	//   28   51:dload_3         
	//   29   52:dload           15
	//   30   54:dcmpg           
	//   31   55:ifle            130
	//   32   58:dload           9
	//   33   60:dload           5
	//   34   62:dcmpg           
	//   35   63:ifgt            90
	//   36   66:dload           5
	//   37   68:dload           13
	//   38   70:dcmpg           
	//   39   71:ifgt            90
	//   40   74:dload           11
	//   41   76:dload           7
	//   42   78:dcmpg           
	//   43   79:ifgt            90
	//   44   82:dload           7
	//   45   84:dload           15
	//   46   86:dcmpg           
	//   47   87:ifle            130
	//   48   90:dload           9
	//   49   92:dload           11
	//   50   94:dload           13
	//   51   96:dload           15
	//   52   98:dload_1         
	//   53   99:dload_3         
	//   54  100:dload           5
	//   55  102:dload           7
	//   56  104:invokestatic    #126 <Method boolean Line2D.linesIntersect(double, double, double, double, double, double, double, double)>
	//   57  107:ifne            130
	//   58  110:dload           13
	//   59  112:dload           11
	//   60  114:dload           9
	//   61  116:dload           15
	//   62  118:dload_1         
	//   63  119:dload_3         
	//   64  120:dload           5
	//   65  122:dload           7
	//   66  124:invokestatic    #126 <Method boolean Line2D.linesIntersect(double, double, double, double, double, double, double, double)>
	//   67  127:ifeq            132
	//   68  130:iconst_1        
	//   69  131:ireturn         
	//   70  132:iconst_0        
	//   71  133:ireturn         
	}

	public boolean intersectsLine(Line2D line2d)
	{
		return intersectsLine(line2d.getX1(), line2d.getY1(), line2d.getX2(), line2d.getY2());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #130 <Method double Line2D.getX1()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #133 <Method double Line2D.getY1()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #136 <Method double Line2D.getX2()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #139 <Method double Line2D.getY2()>
	//    9   17:invokevirtual   #141 <Method boolean intersectsLine(double, double, double, double)>
	//   10   20:ireturn         
	}

	public abstract int outcode(double d, double d1);

	public int outcode(Point2D point2d)
	{
		return outcode(point2d.getX(), point2d.getY());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #67  <Method double Point2D.getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #70  <Method double Point2D.getY()>
	//    5    9:invokevirtual   #146 <Method int outcode(double, double)>
	//    6   12:ireturn         
	}

	public void setFrame(double d, double d1, double d2, double d3)
	{
		setRect(d, d1, d2, d3);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:dload_3         
	//    3    3:dload           5
	//    4    5:dload           7
	//    5    7:invokevirtual   #61  <Method void setRect(double, double, double, double)>
	//    6   10:return          
	}

	public abstract void setRect(double d, double d1, double d2, double d3);

	public void setRect(Rectangle2D rectangle2d)
	{
		setRect(rectangle2d.getX(), rectangle2d.getY(), rectangle2d.getWidth(), rectangle2d.getHeight());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #82  <Method double getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #83  <Method double getY()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #86  <Method double getWidth()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #89  <Method double getHeight()>
	//    9   17:invokevirtual   #61  <Method void setRect(double, double, double, double)>
	//   10   20:return          
	}

	public static final int OUT_BOTTOM = 8;
	public static final int OUT_LEFT = 1;
	public static final int OUT_RIGHT = 4;
	public static final int OUT_TOP = 2;
}
