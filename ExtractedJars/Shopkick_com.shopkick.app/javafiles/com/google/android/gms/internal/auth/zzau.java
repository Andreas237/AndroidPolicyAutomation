// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal.auth:
//			zzaq, zzav, zzan, zzar

final class zzau extends zzaq
{

	zzau(zzar zzar, GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #9   <Method void zzaq(GoogleApiClient)>
	//    3    5:return          
	}

	protected final void zza(Context context, zzan zzan1)
		throws RemoteException
	{
		zzan1.zza(((zzal) (new zzav(this))));
	//    0    0:aload_2         
	//    1    1:new             #16  <Class zzav>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void zzav(zzau)>
	//    5    9:invokeinterface #24  <Method void zzan.zza(zzal)>
	//    6   14:return          
	}
}
