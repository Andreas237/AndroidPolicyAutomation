// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class bdc
{

	public bdc(int i, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field int a>
		b = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #19  <Field long b>
		c = l;
	//    8   14:aload_0         
	//    9   15:lload_2         
	//   10   16:putfield        #21  <Field long c>
		d = l;
	//   11   19:aload_0         
	//   12   20:lload_2         
	//   13   21:putfield        #23  <Field long d>
	//   14   24:return          
	}

	public final int a;
	public final long b;
	public volatile long c;
	public volatile long d;
}
