// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzatd, zzzh, zzane, zzxt, 
//			zzzp

final class zzzr
	implements zzatd
{

	zzzr(zzzp zzzp, zzzh zzzh1, zzxt zzxt)
	{
		zzbvm = zzzp;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field zzzp zzbvm>
		zzbvl = zzzh1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field zzzh zzbvl>
		zzbvk = zzxt;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #21  <Field zzxt zzbvk>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #24  <Method void Object()>
	//   11   19:return          
	}

	public final void zzau(String s)
	{
		try
		{
			zzbvl.zzbr(s);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzzh zzbvl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #34  <Method void zzzh.zzbr(String)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5   11:astore_1        
		{
			zzane.zzb("", ((Throwable) (s)));
	//    6   12:ldc1            #36  <String "">
	//    7   14:aload_1         
	//    8   15:invokestatic    #42  <Method void zzane.zzb(String, Throwable)>
		}
	//    9   18:return          
	}

	private final zzxt zzbvk;
	private final zzzh zzbvl;
	private final zzzp zzbvm;
}
