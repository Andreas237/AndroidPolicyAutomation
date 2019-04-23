// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.common.internal.service:
//			zah, zai, zal, zaf, 
//			zad

final class zae extends zah
{

	zae(zad zad, GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #9   <Method void zah(GoogleApiClient)>
	//    3    5:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((zal)((zai)anyclient).getService()).zaa(((zaj) (new zaf(((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (this))))));
	//    0    0:aload_1         
	//    1    1:checkcast       #16  <Class zai>
	//    2    4:invokevirtual   #20  <Method android.os.IInterface zai.getService()>
	//    3    7:checkcast       #22  <Class zal>
	//    4   10:new             #24  <Class zaf>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #27  <Method void zaf(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
	//    8   18:invokeinterface #31  <Method void zal.zaa(zaj)>
	//    9   23:return          
	}
}
