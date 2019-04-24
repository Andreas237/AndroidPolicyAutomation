// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

// Referenced classes of package com.google.android.gms.common.internal:
//			BaseGmsClient, Preconditions, zzb

public static final class BaseGmsClient$zzd extends IGmsCallbacks$zza
{

	public final void onPostInitComplete(int i, IBinder ibinder, Bundle bundle)
	{
		Preconditions.checkNotNull(((Object) (zzcv)), "onPostInitComplete can be called only once per call to getRemoteService");
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BaseGmsClient zzcv>
	//    2    4:ldc1            #26  <String "onPostInitComplete can be called only once per call to getRemoteService">
	//    3    6:invokestatic    #32  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4    9:pop             
		zzcv.onPostInitHandler(i, ibinder, bundle, zzcw);
	//    5   10:aload_0         
	//    6   11:getfield        #19  <Field BaseGmsClient zzcv>
	//    7   14:iload_1         
	//    8   15:aload_2         
	//    9   16:aload_3         
	//   10   17:aload_0         
	//   11   18:getfield        #21  <Field int zzcw>
	//   12   21:invokevirtual   #36  <Method void BaseGmsClient.onPostInitHandler(int, IBinder, Bundle, int)>
		zzcv = null;
	//   13   24:aload_0         
	//   14   25:aconst_null     
	//   15   26:putfield        #19  <Field BaseGmsClient zzcv>
	//   16   29:return          
	}

	public final void zza(int i, Bundle bundle)
	{
		Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", ((Throwable) (new Exception())));
	//    0    0:ldc1            #40  <String "GmsClient">
	//    1    2:ldc1            #42  <String "received deprecated onAccountValidationComplete callback, ignoring">
	//    2    4:new             #44  <Class Exception>
	//    3    7:dup             
	//    4    8:invokespecial   #45  <Method void Exception()>
	//    5   11:invokestatic    #51  <Method int Log.wtf(String, String, Throwable)>
	//    6   14:pop             
	//    7   15:return          
	}

	public final void zza(int i, IBinder ibinder, zzb zzb1)
	{
		Preconditions.checkNotNull(((Object) (zzcv)), "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BaseGmsClient zzcv>
	//    2    4:ldc1            #54  <String "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService">
	//    3    6:invokestatic    #32  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4    9:pop             
		Preconditions.checkNotNull(((Object) (zzb1)));
	//    5   10:aload_3         
	//    6   11:invokestatic    #57  <Method Object Preconditions.checkNotNull(Object)>
	//    7   14:pop             
		BaseGmsClient.zza(zzcv, zzb1);
	//    8   15:aload_0         
	//    9   16:getfield        #19  <Field BaseGmsClient zzcv>
	//   10   19:aload_3         
	//   11   20:invokestatic    #60  <Method void BaseGmsClient.zza(BaseGmsClient, zzb)>
		onPostInitComplete(i, ibinder, zzb1.zzcz);
	//   12   23:aload_0         
	//   13   24:iload_1         
	//   14   25:aload_2         
	//   15   26:aload_3         
	//   16   27:getfield        #66  <Field Bundle zzb.zzcz>
	//   17   30:invokevirtual   #68  <Method void onPostInitComplete(int, IBinder, Bundle)>
	//   18   33:return          
	}

	private BaseGmsClient zzcv;
	private final int zzcw;

	public BaseGmsClient$zzd(BaseGmsClient basegmsclient, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void IGmsCallbacks$zza()>
		zzcv = basegmsclient;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field BaseGmsClient zzcv>
		zzcw = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field int zzcw>
	//    8   14:return          
	}
}
