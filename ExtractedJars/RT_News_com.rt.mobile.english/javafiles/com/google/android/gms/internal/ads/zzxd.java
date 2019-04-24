// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzxx

final class zzxd extends zzxx
{

	zzxd(int i)
	{
		zzbtu = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #10  <Field int zzbtu>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void zzxx()>
	//    5    9:return          
	}

	public final int zzmm()
		throws RemoteException
	{
		return zzbtu;
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field int zzbtu>
	//    2    4:ireturn         
	}

	private final int zzbtu;
}
