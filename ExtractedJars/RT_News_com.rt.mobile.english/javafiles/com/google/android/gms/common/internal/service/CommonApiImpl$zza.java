// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.common.internal.service:
//			BaseCommonServiceCallbacks, CommonApiImpl

private static final class CommonApiImpl$zza extends BaseCommonServiceCallbacks
{

	public final void onDefaultAccountCleared(int i)
		throws RemoteException
	{
		mResultHolder.setResult(((Object) (new Status(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder mResultHolder>
	//    2    4:new             #26  <Class Status>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:invokespecial   #28  <Method void Status(int)>
	//    6   12:invokeinterface #34  <Method void com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder.setResult(Object)>
	//    7   17:return          
	}

	private final com.google.android.gms.common.api.internal..ResultHolder mResultHolder;

	public CommonApiImpl$zza(com.google.android.gms.common.api.internal..ResultHolder resultholder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void BaseCommonServiceCallbacks()>
		mResultHolder = resultholder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder mResultHolder>
	//    5    9:return          
	}
}
