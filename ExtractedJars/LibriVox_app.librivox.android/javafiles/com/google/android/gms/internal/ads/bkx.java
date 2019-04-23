// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class bkx
{

	public bkx(int i, int j, List list, List list1, List list2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field int a>
		b = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field int b>
		c = Collections.unmodifiableList(list);
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:invokestatic    #26  <Method List Collections.unmodifiableList(List)>
	//   11   19:putfield        #28  <Field List c>
		d = Collections.unmodifiableList(list1);
	//   12   22:aload_0         
	//   13   23:aload           4
	//   14   25:invokestatic    #26  <Method List Collections.unmodifiableList(List)>
	//   15   28:putfield        #30  <Field List d>
		e = Collections.unmodifiableList(list2);
	//   16   31:aload_0         
	//   17   32:aload           5
	//   18   34:invokestatic    #26  <Method List Collections.unmodifiableList(List)>
	//   19   37:putfield        #32  <Field List e>
	//   20   40:return          
	}

	public final int a;
	public final int b;
	public final List c;
	public final List d;
	public final List e;
}
