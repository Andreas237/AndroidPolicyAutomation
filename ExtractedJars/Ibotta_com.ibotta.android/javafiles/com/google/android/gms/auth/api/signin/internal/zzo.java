// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//			zzd, zzn

final class zzo extends zzd
{

	zzo(zzn zzn1)
	{
		zzez = zzn1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field zzn zzez>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void zzd()>
	//    5    9:return          
	}

	public final void zzh(Status status)
		throws RemoteException
	{
		zzez.setResult(((com.google.android.gms.common.api.Result) (status)));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzn zzez>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #24  <Method void zzn.setResult(com.google.android.gms.common.api.Result)>
	//    4    8:return          
	}

	private final zzn zzez;
}
