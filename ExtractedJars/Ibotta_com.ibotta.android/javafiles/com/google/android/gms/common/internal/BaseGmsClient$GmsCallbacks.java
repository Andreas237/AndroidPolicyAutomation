// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

// Referenced classes of package com.google.android.gms.common.internal:
//			BaseGmsClient, Preconditions, ConnectionInfo

public static final class BaseGmsClient$GmsCallbacks extends IGmsCallbacks.Stub
{

	public final void onAccountValidationComplete(int i, Bundle bundle)
	{
		Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", ((Throwable) (new Exception())));
	//    0    0:ldc1            #30  <String "GmsClient">
	//    1    2:ldc1            #32  <String "received deprecated onAccountValidationComplete callback, ignoring">
	//    2    4:new             #34  <Class Exception>
	//    3    7:dup             
	//    4    8:invokespecial   #35  <Method void Exception()>
	//    5   11:invokestatic    #41  <Method int Log.wtf(String, String, Throwable)>
	//    6   14:pop             
	//    7   15:return          
	}

	public final void onPostInitComplete(int i, IBinder ibinder, Bundle bundle)
	{
		Preconditions.checkNotNull(((Object) (zzrw)), "onPostInitComplete can be called only once per call to getRemoteService");
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field BaseGmsClient zzrw>
	//    2    4:ldc1            #46  <String "onPostInitComplete can be called only once per call to getRemoteService">
	//    3    6:invokestatic    #52  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4    9:pop             
		zzrw.onPostInitHandler(i, ibinder, bundle, zzrx);
	//    5   10:aload_0         
	//    6   11:getfield        #20  <Field BaseGmsClient zzrw>
	//    7   14:iload_1         
	//    8   15:aload_2         
	//    9   16:aload_3         
	//   10   17:aload_0         
	//   11   18:getfield        #22  <Field int zzrx>
	//   12   21:invokevirtual   #56  <Method void BaseGmsClient.onPostInitHandler(int, IBinder, Bundle, int)>
		zzrw = null;
	//   13   24:aload_0         
	//   14   25:aconst_null     
	//   15   26:putfield        #20  <Field BaseGmsClient zzrw>
	//   16   29:return          
	}

	public final void onPostInitCompleteWithConnectionInfo(int i, IBinder ibinder, ConnectionInfo connectioninfo)
	{
		Preconditions.checkNotNull(((Object) (zzrw)), "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field BaseGmsClient zzrw>
	//    2    4:ldc1            #60  <String "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService">
	//    3    6:invokestatic    #52  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4    9:pop             
		Preconditions.checkNotNull(((Object) (connectioninfo)));
	//    5   10:aload_3         
	//    6   11:invokestatic    #63  <Method Object Preconditions.checkNotNull(Object)>
	//    7   14:pop             
		BaseGmsClient.zza(zzrw, connectioninfo);
	//    8   15:aload_0         
	//    9   16:getfield        #20  <Field BaseGmsClient zzrw>
	//   10   19:aload_3         
	//   11   20:invokestatic    #67  <Method void BaseGmsClient.zza(BaseGmsClient, ConnectionInfo)>
		onPostInitComplete(i, ibinder, connectioninfo.getResolutionBundle());
	//   12   23:aload_0         
	//   13   24:iload_1         
	//   14   25:aload_2         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #73  <Method Bundle ConnectionInfo.getResolutionBundle()>
	//   17   30:invokevirtual   #75  <Method void onPostInitComplete(int, IBinder, Bundle)>
	//   18   33:return          
	}

	private BaseGmsClient zzrw;
	private final int zzrx;

	public BaseGmsClient$GmsCallbacks(BaseGmsClient basegmsclient, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void IGmsCallbacks$Stub()>
		zzrw = basegmsclient;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field BaseGmsClient zzrw>
		zzrx = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field int zzrx>
	//    8   14:return          
	}
}
