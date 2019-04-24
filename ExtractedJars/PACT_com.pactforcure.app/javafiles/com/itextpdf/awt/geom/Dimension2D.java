// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;


public abstract class Dimension2D
	implements Cloneable
{

	protected Dimension2D()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public Object clone()
	{
		Object obj;
		try
		{
			obj = super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method Object Object.clone()>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*   5    7:astore_1        
		{
			throw new InternalError();
	//    6    8:new             #19  <Class InternalError>
	//    7   11:dup             
	//    8   12:invokespecial   #20  <Method void InternalError()>
	//    9   15:athrow          
		}
		return obj;
	}

	public abstract double getHeight();

	public abstract double getWidth();

	public abstract void setSize(double d, double d1);

	public void setSize(Dimension2D dimension2d)
	{
		setSize(dimension2d.getWidth(), dimension2d.getHeight());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #28  <Method double getWidth()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #30  <Method double getHeight()>
	//    5    9:invokevirtual   #32  <Method void setSize(double, double)>
	//    6   12:return          
	}
}
