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

final class zzh extends Cast.zza
{

	zzh(Cast.CastApi.zza zza1, GoogleApiClient googleapiclient, String s, LaunchOptions launchoptions)
	{
		zzaf = s;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #12  <Field String zzaf>
		zzag = launchoptions;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #14  <Field LaunchOptions zzag>
		super(googleapiclient);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:invokespecial   #17  <Method void Cast$zza(GoogleApiClient)>
	//    9   16:return          
	}

	public final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((Cast.zza)this).zza((zzcn)anyclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class zzcn>
	//    3    5:invokevirtual   #28  <Method void Cast$zza.zza(zzcn)>
	//    4    8:return          
	}

	public final void zza(zzcn zzcn1)
		throws RemoteException
	{
		try
		{
			zzcn1.zza(zzaf, zzag, ((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #12  <Field String zzaf>
	//    3    5:aload_0         
	//    4    6:getfield        #14  <Field LaunchOptions zzag>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #34  <Method void zzcn.zza(String, LaunchOptions, com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
			return;
	//    7   13:return          
		}
	//*   8   14:aload_0         
	//*   9   15:sipush          2001
	//*  10   18:invokevirtual   #40  <Method void zzcf.zzk(int)>
	//*  11   21:return          
		// Misplaced declaration of an exception variable
		catch(zzcn zzcn1)
		{
			((zzcf)this).zzk(2001);
		}
	//*  12   22:astore_1        
	//*  13   23:goto            14
	}

	private final String zzaf;
	private final LaunchOptions zzag;
}
