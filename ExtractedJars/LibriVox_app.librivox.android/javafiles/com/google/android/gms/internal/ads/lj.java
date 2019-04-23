// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.a;
import java.util.Date;
import java.util.Set;

public final class lj
	implements a
{

	public lj(Date date, int i, Set set, Location location, boolean flag, int j, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		a = date;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field Date a>
		b = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #28  <Field int b>
		c = set;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #30  <Field Set c>
		e = location;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #32  <Field Location e>
		d = flag;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #34  <Field boolean d>
		f = j;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #36  <Field int f>
		g = flag1;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #38  <Field boolean g>
	//   23   43:return          
	}

	public final Date a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Date a>
	//    2    4:areturn         
	}

	public final int b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int b>
	//    2    4:ireturn         
	}

	public final Set c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Set c>
	//    2    4:areturn         
	}

	public final Location d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Location e>
	//    2    4:areturn         
	}

	public final int e()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int f>
	//    2    4:ireturn         
	}

	public final boolean f()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean d>
	//    2    4:ireturn         
	}

	public final boolean g()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field boolean g>
	//    2    4:ireturn         
	}

	private final Date a;
	private final int b;
	private final Set c;
	private final boolean d;
	private final Location e;
	private final int f;
	private final boolean g;
}
