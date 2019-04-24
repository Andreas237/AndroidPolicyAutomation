// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzatd, zzzf, zzane, zzxt, 
//			zzzp

final class zzzq
	implements zzatd
{

	zzzq(zzzp zzzp, zzzf zzzf1, zzxt zzxt)
	{
		zzbvj = zzzf1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field zzzf zzbvj>
		zzbvk = zzxt;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #17  <Field zzxt zzbvk>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void Object()>
	//    8   14:return          
	}

	public final void zzau(String s)
	{
		try
		{
			zzbvj.zzbr(s);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzzf zzbvj>
	//    2    4:aload_1         
	//    3    5:invokeinterface #30  <Method void zzzf.zzbr(String)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5   11:astore_1        
		{
			zzane.zzb("", ((Throwable) (s)));
	//    6   12:ldc1            #32  <String "">
	//    7   14:aload_1         
	//    8   15:invokestatic    #38  <Method void zzane.zzb(String, Throwable)>
		}
	//    9   18:return          
	}

	private final zzzf zzbvj;
	private final zzxt zzbvk;
}
