// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bhi, zzfs

final class bgq
{

	public bgq(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = new bhi[i];
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:anewarray       bhi[]
	//    5    9:putfield        #20  <Field bhi[] a>
		d = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #22  <Field int d>
	//    9   17:return          
	}

	public final bhi a[];
	public zzfs b;
	public int c;
	public int d;
}
