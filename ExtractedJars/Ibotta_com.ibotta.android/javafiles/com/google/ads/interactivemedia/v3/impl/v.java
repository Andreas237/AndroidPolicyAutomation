// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.CuePoint;

public class v
	implements CuePoint
{

	v(double d, double d1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = d;
	//    2    4:aload_0         
	//    3    5:dload_1         
	//    4    6:putfield        #18  <Field double a>
		b = d1;
	//    5    9:aload_0         
	//    6   10:dload_3         
	//    7   11:putfield        #20  <Field double b>
		c = flag;
	//    8   14:aload_0         
	//    9   15:iload           5
	//   10   17:putfield        #22  <Field boolean c>
	//   11   20:return          
	}

	public double getEndTime()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field double b>
	//    2    4:dreturn         
	}

	public double getStartTime()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field double a>
	//    2    4:dreturn         
	}

	public boolean isPlayed()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean c>
	//    2    4:ireturn         
	}

	private final double a;
	private final double b;
	private final boolean c;
}
