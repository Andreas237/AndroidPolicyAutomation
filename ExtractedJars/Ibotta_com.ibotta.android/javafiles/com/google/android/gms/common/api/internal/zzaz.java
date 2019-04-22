// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzav, BasePendingResult, StatusPendingResult

final class zzaz
	implements ResultCallback
{

	zzaz(zzav zzav1, StatusPendingResult statuspendingresult, boolean flag, GoogleApiClient googleapiclient)
	{
		zzit = zzav1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field zzav zzit>
		zziv = statuspendingresult;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field StatusPendingResult zziv>
		zziw = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #23  <Field boolean zziw>
		zzix = googleapiclient;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #25  <Field GoogleApiClient zzix>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #28  <Method void Object()>
	//   14   25:return          
	}

	public final void onResult(Result result)
	{
		result = ((Result) ((Status)result));
	//    0    0:aload_1         
	//    1    1:checkcast       #34  <Class Status>
	//    2    4:astore_1        
		Storage.getInstance(zzav.zzc(zzit)).removeSavedDefaultGoogleSignInAccount();
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field zzav zzit>
	//    5    9:invokestatic    #40  <Method android.content.Context zzav.zzc(zzav)>
	//    6   12:invokestatic    #46  <Method Storage Storage.getInstance(android.content.Context)>
	//    7   15:invokevirtual   #49  <Method void Storage.removeSavedDefaultGoogleSignInAccount()>
		if(((Status) (result)).isSuccess() && ((GoogleApiClient) (zzit)).isConnected())
	//*   8   18:aload_1         
	//*   9   19:invokevirtual   #53  <Method boolean Status.isSuccess()>
	//*  10   22:ifeq            42
	//*  11   25:aload_0         
	//*  12   26:getfield        #19  <Field zzav zzit>
	//*  13   29:invokevirtual   #58  <Method boolean GoogleApiClient.isConnected()>
	//*  14   32:ifeq            42
			((GoogleApiClient) (zzit)).reconnect();
	//   15   35:aload_0         
	//   16   36:getfield        #19  <Field zzav zzit>
	//   17   39:invokevirtual   #61  <Method void GoogleApiClient.reconnect()>
		((BasePendingResult) (zziv)).setResult(result);
	//   18   42:aload_0         
	//   19   43:getfield        #21  <Field StatusPendingResult zziv>
	//   20   46:aload_1         
	//   21   47:invokevirtual   #66  <Method void BasePendingResult.setResult(Result)>
		if(zziw)
	//*  22   50:aload_0         
	//*  23   51:getfield        #23  <Field boolean zziw>
	//*  24   54:ifeq            64
			zzix.disconnect();
	//   25   57:aload_0         
	//   26   58:getfield        #25  <Field GoogleApiClient zzix>
	//   27   61:invokevirtual   #69  <Method void GoogleApiClient.disconnect()>
	//   28   64:return          
	}

	private final zzav zzit;
	private final StatusPendingResult zziv;
	private final boolean zziw;
	private final GoogleApiClient zzix;
}
