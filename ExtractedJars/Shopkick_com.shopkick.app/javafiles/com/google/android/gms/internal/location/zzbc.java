// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationSettingsResult;

// Referenced classes of package com.google.android.gms.internal.location:
//			zzar

final class zzbc extends zzar
{

	public zzbc(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzar()>
		boolean flag;
		if(resultholder != null)
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
		Preconditions.checkArgument(flag, "listener can't be null.");
	//    9   15:iload_2         
	//   10   16:ldc1            #14  <String "listener can't be null.">
	//   11   18:invokestatic    #20  <Method void Preconditions.checkArgument(boolean, Object)>
		zzdf = resultholder;
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:putfield        #22  <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzdf>
	//   15   26:return          
	}

	public final void zza(LocationSettingsResult locationsettingsresult)
		throws RemoteException
	{
		zzdf.setResult(((Object) (locationsettingsresult)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzdf>
	//    2    4:aload_1         
	//    3    5:invokeinterface #35  <Method void com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder.setResult(Object)>
		zzdf = null;
	//    4   10:aload_0         
	//    5   11:aconst_null     
	//    6   12:putfield        #22  <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzdf>
	//    7   15:return          
	}

	private com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zzdf;
}
