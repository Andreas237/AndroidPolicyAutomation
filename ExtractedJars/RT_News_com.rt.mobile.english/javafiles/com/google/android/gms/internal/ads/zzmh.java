// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzkl, zzane, zzamu, zzmi, 
//			zzmf, zzmg, zzjj

final class zzmh extends zzkl
{

	private zzmh(zzmf zzmf)
	{
		zzati = zzmf;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field zzmf zzati>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void zzkl()>
	//    5    9:return          
	}

	zzmh(zzmf zzmf, zzmg zzmg)
	{
		this(zzmf);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void zzmh(zzmf)>
	//    3    5:return          
	}

	public final String getMediationAdapterClassName()
		throws RemoteException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final boolean isLoading()
		throws RemoteException
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final void zza(zzjj zzjj, int i)
		throws RemoteException
	{
		zzane.e("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
	//    0    0:ldc1            #28  <String "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.">
	//    1    2:invokestatic    #34  <Method void zzane.e(String)>
		zzamu.zzsy.post(((Runnable) (new zzmi(this))));
	//    2    5:getstatic       #40  <Field Handler zzamu.zzsy>
	//    3    8:new             #42  <Class zzmi>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:invokespecial   #45  <Method void zzmi(zzmh)>
	//    7   16:invokevirtual   #51  <Method boolean Handler.post(Runnable)>
	//    8   19:pop             
	//    9   20:return          
	}

	public final String zzck()
		throws RemoteException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final void zzd(zzjj zzjj)
		throws RemoteException
	{
		zza(zzjj, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #56  <Method void zza(zzjj, int)>
	//    4    6:return          
	}

	final zzmf zzati;
}
