// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class bmi
{

	public bmi(byte abyte0[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field byte[] a>
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #17  <Field int b>
	//    8   14:return          
	}

	public final int a(int i)
	{
		return b + i;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int b>
	//    2    4:iload_1         
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public final byte a[];
	private final int b = 0;
}
