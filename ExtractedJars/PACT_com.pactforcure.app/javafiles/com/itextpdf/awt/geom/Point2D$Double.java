// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;


// Referenced classes of package com.itextpdf.awt.geom:
//			Point2D

public static class Point2D$Double extends Point2D
{

	public double getX()
	{
		return x;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field double x>
	//    2    4:dreturn         
	}

	public double getY()
	{
		return y;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field double y>
	//    2    4:dreturn         
	}

	public void setLocation(double d, double d1)
	{
		x = d;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #16  <Field double x>
		y = d1;
	//    3    5:aload_0         
	//    4    6:dload_3         
	//    5    7:putfield        #18  <Field double y>
	//    6   10:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append(((Object)this).getClass().getName()).append("[x=").append(x).append(",y=").append(y).append("]").toString();
	//    0    0:new             #26  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #33  <Method Class Object.getClass()>
	//    5   11:invokevirtual   #38  <Method String Class.getName()>
	//    6   14:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc1            #44  <String "[x=">
	//    8   19:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:aload_0         
	//   10   23:getfield        #16  <Field double x>
	//   11   26:invokevirtual   #47  <Method StringBuilder StringBuilder.append(double)>
	//   12   29:ldc1            #49  <String ",y=">
	//   13   31:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   14   34:aload_0         
	//   15   35:getfield        #18  <Field double y>
	//   16   38:invokevirtual   #47  <Method StringBuilder StringBuilder.append(double)>
	//   17   41:ldc1            #51  <String "]">
	//   18   43:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   19   46:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   20   49:areturn         
	}

	public double x;
	public double y;

	public Point2D$Double()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Point2D()>
	//    2    4:return          
	}

	public Point2D$Double(double d, double d1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Point2D()>
		x = d;
	//    2    4:aload_0         
	//    3    5:dload_1         
	//    4    6:putfield        #16  <Field double x>
		y = d1;
	//    5    9:aload_0         
	//    6   10:dload_3         
	//    7   11:putfield        #18  <Field double y>
	//    8   14:return          
	}
}
