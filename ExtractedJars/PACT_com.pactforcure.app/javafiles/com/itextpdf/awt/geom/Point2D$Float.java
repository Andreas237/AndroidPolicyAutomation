// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;


// Referenced classes of package com.itextpdf.awt.geom:
//			Point2D

public static class Point2D$Float extends Point2D
{

	public double getX()
	{
		return (double)x;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field float x>
	//    2    4:f2d             
	//    3    5:dreturn         
	}

	public double getY()
	{
		return (double)y;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field float y>
	//    2    4:f2d             
	//    3    5:dreturn         
	}

	public void setLocation(double d, double d1)
	{
		x = (float)d;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:d2f             
	//    3    3:putfield        #16  <Field float x>
		y = (float)d1;
	//    4    6:aload_0         
	//    5    7:dload_3         
	//    6    8:d2f             
	//    7    9:putfield        #18  <Field float y>
	//    8   12:return          
	}

	public void setLocation(float f, float f1)
	{
		x = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #16  <Field float x>
		y = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #18  <Field float y>
	//    6   10:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append(((Object)this).getClass().getName()).append("[x=").append(x).append(",y=").append(y).append("]").toString();
	//    0    0:new             #27  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #34  <Method Class Object.getClass()>
	//    5   11:invokevirtual   #39  <Method String Class.getName()>
	//    6   14:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc1            #45  <String "[x=">
	//    8   19:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:aload_0         
	//   10   23:getfield        #16  <Field float x>
	//   11   26:invokevirtual   #48  <Method StringBuilder StringBuilder.append(float)>
	//   12   29:ldc1            #50  <String ",y=">
	//   13   31:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   14   34:aload_0         
	//   15   35:getfield        #18  <Field float y>
	//   16   38:invokevirtual   #48  <Method StringBuilder StringBuilder.append(float)>
	//   17   41:ldc1            #52  <String "]">
	//   18   43:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   19   46:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   20   49:areturn         
	}

	public float x;
	public float y;

	public Point2D$Float()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Point2D()>
	//    2    4:return          
	}

	public Point2D$Float(float f, float f1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Point2D()>
		x = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #16  <Field float x>
		y = f1;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #18  <Field float y>
	//    8   14:return          
	}
}
