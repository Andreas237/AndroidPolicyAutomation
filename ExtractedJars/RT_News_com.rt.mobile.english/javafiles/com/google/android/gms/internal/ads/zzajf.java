// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaoj, zzane, zzaje

final class zzajf
	implements Runnable
{

	zzajf(zzaje zzaje, Context context, zzaoj zzaoj1)
	{
		val$context = context;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #14  <Field Context val$context>
		zzcoa = zzaoj1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #16  <Field zzaoj zzcoa>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		try
		{
			com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = AdvertisingIdClient.getAdvertisingIdInfo(val$context);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Context val$context>
	//    2    4:invokestatic    #35  <Method com.google.android.gms.ads.identifier.AdvertisingIdClient$Info AdvertisingIdClient.getAdvertisingIdInfo(Context)>
	//    3    7:astore_1        
			zzcoa.set(((Object) (info)));
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field zzaoj zzcoa>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #41  <Method void zzaoj.set(Object)>
			return;
	//    8   16:return          
		}
		catch(Object obj)
	//*   9   17:astore_1        
		{
			zzcoa.setException(((Throwable) (obj)));
	//   10   18:aload_0         
	//   11   19:getfield        #16  <Field zzaoj zzcoa>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #45  <Method void zzaoj.setException(Throwable)>
			zzane.zzb("Exception while getting advertising Id info", ((Throwable) (obj)));
	//   14   26:ldc1            #47  <String "Exception while getting advertising Id info">
	//   15   28:aload_1         
	//   16   29:invokestatic    #53  <Method void zzane.zzb(String, Throwable)>
			return;
	//   17   32:return          
		}
	}

	private final Context val$context;
	private final zzaoj zzcoa;
}
