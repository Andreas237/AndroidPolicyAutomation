// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bmm, bmk, bml

final class ady
	implements bmm
{

	ady(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field byte[] a>
	//    5    9:return          
	}

	public final bml a()
	{
		return ((bml) (new bmk(a)));
	//    0    0:new             #19  <Class bmk>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field byte[] a>
	//    4    8:invokespecial   #21  <Method void bmk(byte[])>
	//    5   11:areturn         
	}

	private final byte a[];
}
