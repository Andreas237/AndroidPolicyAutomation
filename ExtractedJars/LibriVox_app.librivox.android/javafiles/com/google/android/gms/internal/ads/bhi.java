// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class bhi
{

	public bhi(boolean flag, int i, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		c = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field boolean c>
		a = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int a>
		b = abyte0;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #21  <Field byte[] b>
	//   11   19:return          
	}

	public final int a;
	public final byte b[];
	private final boolean c;
}
