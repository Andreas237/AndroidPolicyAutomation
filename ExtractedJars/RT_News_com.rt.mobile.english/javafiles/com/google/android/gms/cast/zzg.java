// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.cast.zzcf;
import com.google.android.gms.internal.cast.zzcn;

// Referenced classes of package com.google.android.gms.cast:
//			LaunchOptions

final class zzg extends Cast.zza
{

	zzg(Cast.CastApi.zza zza1, GoogleApiClient googleapiclient, String s)
	{
		zzaf = s;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #10  <Field String zzaf>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void Cast$zza(GoogleApiClient)>
	//    6   10:return          
	}

	public final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((Cast.zza)this).zza((zzcn)anyclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #20  <Class zzcn>
	//    3    5:invokevirtual   #24  <Method void Cast$zza.zza(zzcn)>
	//    4    8:return          
	}

	public final void zza(zzcn zzcn1)
		throws RemoteException
	{
		try
		{
			String s = zzaf;
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field String zzaf>
	//    2    4:astore_2        
			LaunchOptions launchoptions = new LaunchOptions();
	//    3    5:new             #29  <Class LaunchOptions>
	//    4    8:dup             
	//    5    9:invokespecial   #32  <Method void LaunchOptions()>
	//    6   12:astore_3        
			launchoptions.setRelaunchIfRunning(false);
	//    7   13:aload_3         
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #36  <Method void LaunchOptions.setRelaunchIfRunning(boolean)>
			zzcn1.zza(s, launchoptions, ((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (this)));
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:aload_3         
	//   13   21:aload_0         
	//   14   22:invokevirtual   #39  <Method void zzcn.zza(String, LaunchOptions, com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
			return;
	//   15   25:return          
		}
	//*  16   26:aload_0         
	//*  17   27:sipush          2001
	//*  18   30:invokevirtual   #45  <Method void zzcf.zzk(int)>
	//*  19   33:return          
		// Misplaced declaration of an exception variable
		catch(zzcn zzcn1)
		{
			((zzcf)this).zzk(2001);
		}
	//*  20   34:astore_1        
	//*  21   35:goto            26
	}

	private final String zzaf;
}
