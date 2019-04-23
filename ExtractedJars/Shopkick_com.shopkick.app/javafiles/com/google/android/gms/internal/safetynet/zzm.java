// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.safetynet;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.safetynet:
//			zzx, zzk

final class zzm extends zzk.zzf
{

	zzm(zzk zzk, GoogleApiClient googleapiclient, List list, String s, String s1)
	{
		zzy = list;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #13  <Field List zzy>
		zzz = s;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #15  <Field String zzz>
	//    6   11:aload_0         
	//    7   12:aconst_null     
	//    8   13:putfield        #17  <Field String zzx>
		super(googleapiclient);
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:invokespecial   #20  <Method void zzk$zzf(GoogleApiClient)>
	//   12   21:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((zzx)anyclient).zza(zzaf, zzy, 1, zzz, zzx);
	//    0    0:aload_1         
	//    1    1:checkcast       #27  <Class zzx>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field zzg zzaf>
	//    4    8:aload_0         
	//    5    9:getfield        #13  <Field List zzy>
	//    6   12:iconst_1        
	//    7   13:aload_0         
	//    8   14:getfield        #15  <Field String zzz>
	//    9   17:aload_0         
	//   10   18:getfield        #17  <Field String zzx>
	//   11   21:invokevirtual   #35  <Method void zzx.zza(zzg, List, int, String, String)>
	//   12   24:return          
	}

	private final String zzx = null;
	private final List zzy;
	private final String zzz;
}
