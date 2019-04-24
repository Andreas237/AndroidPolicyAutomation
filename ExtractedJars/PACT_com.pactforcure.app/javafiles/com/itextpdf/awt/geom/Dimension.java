// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;

import com.itextpdf.awt.geom.misc.HashCode;
import java.io.Serializable;

// Referenced classes of package com.itextpdf.awt.geom:
//			Dimension2D

public class Dimension extends Dimension2D
	implements Serializable
{

	public Dimension()
	{
		this(0, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:invokespecial   #18  <Method void Dimension(int, int)>
	//    4    6:return          
	}

	public Dimension(double d, double d1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Dimension2D()>
		setSize(d, d1);
	//    2    4:aload_0         
	//    3    5:dload_1         
	//    4    6:dload_3         
	//    5    7:invokevirtual   #25  <Method void setSize(double, double)>
	//    6   10:return          
	}

	public Dimension(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Dimension2D()>
		setSize(i, j);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #27  <Method void setSize(int, int)>
	//    6   10:return          
	}

	public Dimension(Dimension dimension)
	{
		this(dimension.width, dimension.height);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #30  <Field double width>
	//    3    5:aload_1         
	//    4    6:getfield        #32  <Field double height>
	//    5    9:invokespecial   #34  <Method void Dimension(double, double)>
	//    6   12:return          
	}

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
			if(obj instanceof Dimension)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class Dimension>
	//*   7   11:ifeq            45
	//*   8   14:aload_1         
	//*   9   15:checkcast       #2   <Class Dimension>
	//*  10   18:astore_1        
			{
				if(((Dimension) (obj = ((Object) ((Dimension)obj)))).width != width || ((Dimension) (obj)).height != height)
	//*  11   19:aload_1         
	//*  12   20:getfield        #30  <Field double width>
	//*  13   23:aload_0         
	//*  14   24:getfield        #30  <Field double width>
	//*  15   27:dcmpl           
	//*  16   28:ifne            43
	//*  17   31:aload_1         
	//*  18   32:getfield        #32  <Field double height>
	//*  19   35:aload_0         
	//*  20   36:getfield        #32  <Field double height>
	//*  21   39:dcmpl           
	//*  22   40:ifeq            5
					return false;
	//   23   43:iconst_0        
	//   24   44:ireturn         
			} else
			{
				return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
			}
		return true;
	}

	public double getHeight()
	{
		return height;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field double height>
	//    2    4:dreturn         
	}

	public Dimension getSize()
	{
		return new Dimension(width, height);
	//    0    0:new             #2   <Class Dimension>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field double width>
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field double height>
	//    6   12:invokespecial   #34  <Method void Dimension(double, double)>
	//    7   15:areturn         
	}

	public double getWidth()
	{
		return width;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field double width>
	//    2    4:dreturn         
	}

	public int hashCode()
	{
		HashCode hashcode = new HashCode();
	//    0    0:new             #45  <Class HashCode>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void HashCode()>
	//    3    7:astore_1        
		hashcode.append(width);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field double width>
	//    7   13:invokevirtual   #50  <Method HashCode HashCode.append(double)>
	//    8   16:pop             
		hashcode.append(height);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #32  <Field double height>
	//   12   22:invokevirtual   #50  <Method HashCode HashCode.append(double)>
	//   13   25:pop             
		return hashcode.hashCode();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #52  <Method int HashCode.hashCode()>
	//   16   30:ireturn         
	}

	public void setSize(double d, double d1)
	{
		setSize((int)Math.ceil(d), (int)Math.ceil(d1));
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokestatic    #58  <Method double Math.ceil(double)>
	//    3    5:d2i             
	//    4    6:dload_3         
	//    5    7:invokestatic    #58  <Method double Math.ceil(double)>
	//    6   10:d2i             
	//    7   11:invokevirtual   #27  <Method void setSize(int, int)>
	//    8   14:return          
	}

	public void setSize(int i, int j)
	{
		width = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:i2d             
	//    3    3:putfield        #30  <Field double width>
		height = j;
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:i2d             
	//    7    9:putfield        #32  <Field double height>
	//    8   12:return          
	}

	public void setSize(Dimension dimension)
	{
		setSize(dimension.width, dimension.height);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #30  <Field double width>
	//    3    5:aload_1         
	//    4    6:getfield        #32  <Field double height>
	//    5    9:invokevirtual   #25  <Method void setSize(double, double)>
	//    6   12:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append(((Object)this).getClass().getName()).append("[width=").append(width).append(",height=").append(height).append("]").toString();
	//    0    0:new             #62  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #69  <Method Class Object.getClass()>
	//    5   11:invokevirtual   #74  <Method String Class.getName()>
	//    6   14:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc1            #79  <String "[width=">
	//    8   19:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:aload_0         
	//   10   23:getfield        #30  <Field double width>
	//   11   26:invokevirtual   #82  <Method StringBuilder StringBuilder.append(double)>
	//   12   29:ldc1            #84  <String ",height=">
	//   13   31:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   14   34:aload_0         
	//   15   35:getfield        #32  <Field double height>
	//   16   38:invokevirtual   #82  <Method StringBuilder StringBuilder.append(double)>
	//   17   41:ldc1            #86  <String "]">
	//   18   43:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   19   46:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   20   49:areturn         
	}

	private static final long serialVersionUID = 0xac5f4414L;
	public double height;
	public double width;
}
