// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;


public class MyTrafficStyle
{

	public MyTrafficStyle()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = 0xff00a209;
	//    2    4:aload_0         
	//    3    5:ldc1            #16  <Int 0xff00a209>
	//    4    7:putfield        #18  <Field int a>
		b = -35576;
	//    5   10:aload_0         
	//    6   11:ldc1            #19  <Int -35576>
	//    7   13:putfield        #21  <Field int b>
		c = 0xffea0312;
	//    8   16:aload_0         
	//    9   17:ldc1            #22  <Int 0xffea0312>
	//   10   19:putfield        #24  <Field int c>
		d = 0xff92000a;
	//   11   22:aload_0         
	//   12   23:ldc1            #25  <Int 0xff92000a>
	//   13   25:putfield        #27  <Field int d>
		e = 0.8F;
	//   14   28:aload_0         
	//   15   29:ldc1            #28  <Float 0.8F>
	//   16   31:putfield        #30  <Field float e>
	//   17   34:return          
	}

	public int getCongestedColor()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int c>
	//    2    4:ireturn         
	}

	public float getRatio()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field float e>
	//    2    4:freturn         
	}

	public int getSeriousCongestedColor()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int d>
	//    2    4:ireturn         
	}

	public int getSlowColor()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int b>
	//    2    4:ireturn         
	}

	public int getSmoothColor()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int a>
	//    2    4:ireturn         
	}

	public void setCongestedColor(int i)
	{
		c = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field int c>
	//    3    5:return          
	}

	public void setRatio(float f)
	{
		e = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #30  <Field float e>
	//    3    5:return          
	}

	public void setSeriousCongestedColor(int i)
	{
		d = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field int d>
	//    3    5:return          
	}

	public void setSlowColor(int i)
	{
		b = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #21  <Field int b>
	//    3    5:return          
	}

	public void setSmoothColor(int i)
	{
		a = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #18  <Field int a>
	//    3    5:return          
	}

	private int a;
	private int b;
	private int c;
	private int d;
	private float e;
}
