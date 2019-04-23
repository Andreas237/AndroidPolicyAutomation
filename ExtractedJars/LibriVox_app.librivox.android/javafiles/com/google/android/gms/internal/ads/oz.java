// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class oz
{

	public oz(int i, List list)
	{
		this(i, list, -1, ((InputStream) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_m1       
	//    4    4:aconst_null     
	//    5    5:invokespecial   #16  <Method void oz(int, List, int, InputStream)>
	//    6    8:return          
	}

	public oz(int i, List list, int j, InputStream inputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #22  <Field int a>
		b = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field List b>
		c = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #26  <Field int c>
		d = inputstream;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #28  <Field InputStream d>
	//   14   25:return          
	}

	public final int a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int a>
	//    2    4:ireturn         
	}

	public final List b()
	{
		return Collections.unmodifiableList(b);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field List b>
	//    2    4:invokestatic    #36  <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public final int c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int c>
	//    2    4:ireturn         
	}

	public final InputStream d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field InputStream d>
	//    2    4:areturn         
	}

	private final int a;
	private final List b;
	private final int c;
	private final InputStream d;
}
