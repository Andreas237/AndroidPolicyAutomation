// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Handler;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			GoogleApiManager

final class zzbh
	implements BackgroundDetector.BackgroundStateChangeListener
{

	zzbh(GoogleApiManager googleapimanager)
	{
		zzjy = googleapimanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field GoogleApiManager zzjy>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onBackgroundStateChanged(boolean flag)
	{
		GoogleApiManager.zza(zzjy).sendMessage(GoogleApiManager.zza(zzjy).obtainMessage(1, ((Object) (Boolean.valueOf(flag)))));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field GoogleApiManager zzjy>
	//    2    4:invokestatic    #24  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//    3    7:aload_0         
	//    4    8:getfield        #12  <Field GoogleApiManager zzjy>
	//    5   11:invokestatic    #24  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//    6   14:iconst_1        
	//    7   15:iload_1         
	//    8   16:invokestatic    #30  <Method Boolean Boolean.valueOf(boolean)>
	//    9   19:invokevirtual   #36  <Method android.os.Message Handler.obtainMessage(int, Object)>
	//   10   22:invokevirtual   #40  <Method boolean Handler.sendMessage(android.os.Message)>
	//   11   25:pop             
	//   12   26:return          
	}

	private final GoogleApiManager zzjy;
}
