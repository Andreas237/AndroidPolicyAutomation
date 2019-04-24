// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzf, zzac

public static final class zzf$zzg extends zzu$zza
{

	private void zzxJ()
	{
		zzaFw = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #19  <Field zzf zzaFw>
	//    3    5:return          
	}

	public void zza(int i, IBinder ibinder, Bundle bundle)
	{
		zzac.zzb(((Object) (zzaFw)), "onPostInitComplete can be called only once per call to getRemoteService");
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzf zzaFw>
	//    2    4:ldc1            #30  <String "onPostInitComplete can be called only once per call to getRemoteService">
	//    3    6:invokestatic    #36  <Method Object zzac.zzb(Object, Object)>
	//    4    9:pop             
		zzaFw.zza(i, ibinder, bundle, zzaFx);
	//    5   10:aload_0         
	//    6   11:getfield        #19  <Field zzf zzaFw>
	//    7   14:iload_1         
	//    8   15:aload_2         
	//    9   16:aload_3         
	//   10   17:aload_0         
	//   11   18:getfield        #21  <Field int zzaFx>
	//   12   21:invokevirtual   #39  <Method void zzf.zza(int, IBinder, Bundle, int)>
		zzxJ();
	//   13   24:aload_0         
	//   14   25:invokespecial   #41  <Method void zzxJ()>
	//   15   28:return          
	}

	public void zzb(int i, Bundle bundle)
	{
		Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", ((Throwable) (new Exception())));
	//    0    0:ldc1            #45  <String "GmsClient">
	//    1    2:ldc1            #47  <String "received deprecated onAccountValidationComplete callback, ignoring">
	//    2    4:new             #49  <Class Exception>
	//    3    7:dup             
	//    4    8:invokespecial   #50  <Method void Exception()>
	//    5   11:invokestatic    #56  <Method int Log.wtf(String, String, Throwable)>
	//    6   14:pop             
	//    7   15:return          
	}

	private zzf zzaFw;
	private final int zzaFx;

	public zzf$zzg(zzf zzf1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void zzu$zza()>
		zzaFw = zzf1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field zzf zzaFw>
		zzaFx = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field int zzaFx>
	//    8   14:return          
	}
}
