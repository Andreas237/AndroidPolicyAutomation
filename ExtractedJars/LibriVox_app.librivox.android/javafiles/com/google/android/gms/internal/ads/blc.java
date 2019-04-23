// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class blc
{

	public blc(String s, long l, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field String a>
		b = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #19  <Field long b>
		c = Collections.unmodifiableList(list);
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:invokestatic    #25  <Method List Collections.unmodifiableList(List)>
	//   11   20:putfield        #27  <Field List c>
	//   12   23:return          
	}

	public final String a;
	public final long b;
	public final List c;
}
