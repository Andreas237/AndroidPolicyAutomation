// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;


// Referenced classes of package com.itextpdf.awt.geom:
//			Rectangle2D

public static class Rectangle2D$Float extends Rectangle2D
{

	public Rectangle2D createIntersection(Rectangle2D rectangle2d)
	{
		Object obj;
		if(rectangle2d instanceof )
	//*   0    0:aload_1         
	//*   1    1:instanceof      #23  <Class Rectangle2D$Double>
	//*   2    4:ifeq            23
			obj = ((Object) (new ()));
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
			obj = ((Object) (new Rectangle2D$Float()));
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
		if(rectangle2d instanceof )
	//*   0    0:aload_1         
	//*   1    1:instanceof      #23  <Class Rectangle2D$Double>
	//*   2    4:ifeq            23
			obj = ((Object) (new ()));
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
			obj = ((Object) (new Rectangle2D$Float()));
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
		return ((Rectangle2D) (new Rectangle2D$Float(x, y, width, height)));
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

	public Rectangle2D$Float()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Rectangle2D()>
	//    2    4:return          
	}

	public Rectangle2D$Float(float f, float f1, float f2, float f3)
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
