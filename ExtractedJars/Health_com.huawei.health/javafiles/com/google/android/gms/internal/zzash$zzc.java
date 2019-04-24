// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.location.LocationSettingsResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzash

static final class zzash$zzc extends zzasf$zza
{

	public void zza(LocationSettingsResult locationsettingsresult)
		throws RemoteException
	{
		zzbkL.setResult(((Object) (locationsettingsresult)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field zzaad$zzb zzbkL>
	//    2    4:aload_1         
	//    3    5:invokeinterface #38  <Method void zzaad$zzb.setResult(Object)>
		zzbkL = null;
	//    4   10:aload_0         
	//    5   11:aconst_null     
	//    6   12:putfield        #25  <Field zzaad$zzb zzbkL>
	//    7   15:return          
	}

	private zzaad$zzb zzbkL;

	public zzash$zzc(zzaad$zzb zzaad$zzb1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzasf$zza()>
		boolean flag;
		if(zzaad$zzb1 != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		zzac.zzb(flag, "listener can't be null.");
	//    9   15:iload_2         
	//   10   16:ldc1            #17  <String "listener can't be null.">
	//   11   18:invokestatic    #23  <Method void zzac.zzb(boolean, Object)>
		zzbkL = zzaad$zzb1;
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:putfield        #25  <Field zzaad$zzb zzbkL>
	//   15   26:return          
	}
}
