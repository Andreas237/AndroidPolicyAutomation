// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class bqv
{

	public bqv(float f, float f1, float f2, float f3, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		a = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #20  <Field float a>
		b = f1;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #22  <Field float b>
		c = f + f2;
	//    8   14:aload_0         
	//    9   15:fload_1         
	//   10   16:fload_3         
	//   11   17:fadd            
	//   12   18:putfield        #24  <Field float c>
		d = f1 + f3;
	//   13   21:aload_0         
	//   14   22:fload_2         
	//   15   23:fload           4
	//   16   25:fadd            
	//   17   26:putfield        #26  <Field float d>
		e = i;
	//   18   29:aload_0         
	//   19   30:iload           5
	//   20   32:putfield        #28  <Field int e>
	//   21   35:return          
	}

	final float a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field float a>
	//    2    4:freturn         
	}

	final float b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field float b>
	//    2    4:freturn         
	}

	final float c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field float c>
	//    2    4:freturn         
	}

	final float d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field float d>
	//    2    4:freturn         
	}

	final int e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int e>
	//    2    4:ireturn         
	}

	private final float a;
	private final float b;
	private final float c;
	private final float d;
	private final int e;
}
