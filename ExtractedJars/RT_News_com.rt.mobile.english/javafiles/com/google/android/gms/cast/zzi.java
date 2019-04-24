// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.cast.zzcf;
import com.google.android.gms.internal.cast.zzcn;

// Referenced classes of package com.google.android.gms.cast:
//			zzaf

final class zzi extends Cast.zza
{

	zzi(Cast.CastApi.zza zza1, GoogleApiClient googleapiclient, String s, String s1, zzaf zzaf1)
	{
		zzaf = s;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #13  <Field String zzaf>
		val$sessionId = s1;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #15  <Field String val$sessionId>
	//    6   11:aload_0         
	//    7   12:aconst_null     
	//    8   13:putfield        #17  <Field zzaf zzah>
		super(googleapiclient);
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:invokespecial   #20  <Method void Cast$zza(GoogleApiClient)>
	//   12   21:return          
	}

	public final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((Cast.zza)this).zza((zzcn)anyclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class zzcn>
	//    3    5:invokevirtual   #31  <Method void Cast$zza.zza(zzcn)>
	//    4    8:return          
	}

	public final void zza(zzcn zzcn1)
		throws RemoteException
	{
		try
		{
			zzcn1.zza(zzaf, val$sessionId, zzah, ((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #13  <Field String zzaf>
	//    3    5:aload_0         
	//    4    6:getfield        #15  <Field String val$sessionId>
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field zzaf zzah>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #37  <Method void zzcn.zza(String, String, zzaf, com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
			return;
	//    9   17:return          
		}
	//*  10   18:aload_0         
	//*  11   19:sipush          2001
	//*  12   22:invokevirtual   #43  <Method void zzcf.zzk(int)>
	//*  13   25:return          
		// Misplaced declaration of an exception variable
		catch(zzcn zzcn1)
		{
			((zzcf)this).zzk(2001);
		}
	//*  14   26:astore_1        
	//*  15   27:goto            18
	}

	private final String val$sessionId;
	private final String zzaf;
	private final zzaf zzah = null;
}
