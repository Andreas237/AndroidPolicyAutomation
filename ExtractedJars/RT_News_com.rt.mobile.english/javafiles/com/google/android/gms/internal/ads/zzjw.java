// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzld, zzjr, zzme, zzml

final class zzjw extends zzjr.zza
{

	zzjw(zzjr zzjr1, Context context)
	{
		zzart = zzjr1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzjr zzart>
		val$context = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #15  <Field Context val$context>
		super(zzjr1);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #18  <Method void zzjr$zza(zzjr)>
	//    9   15:return          
	}

	public final Object zza(zzld zzld1)
		throws RemoteException
	{
		return ((Object) (zzld1.getMobileAdsSettingsManagerWithClientJarVersion(ObjectWrapper.wrap(((Object) (val$context))), 0xbdfcb8)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field Context val$context>
	//    3    5:invokestatic    #29  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4    8:ldc1            #30  <Int 0xbdfcb8>
	//    5   10:invokeinterface #36  <Method zzlj zzld.getMobileAdsSettingsManagerWithClientJarVersion(com.google.android.gms.dynamic.IObjectWrapper, int)>
	//    6   15:areturn         
	}

	public final Object zzib()
		throws RemoteException
	{
		zzlj zzlj = zzjr.zzd(zzart).zzg(val$context);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzjr zzart>
	//    2    4:invokestatic    #45  <Method zzme zzjr.zzd(zzjr)>
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field Context val$context>
	//    5   11:invokevirtual   #51  <Method zzlj zzme.zzg(Context)>
	//    6   14:astore_1        
		if(zzlj != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          21
		{
			return ((Object) (zzlj));
	//    9   19:aload_1         
	//   10   20:areturn         
		} else
		{
			zzjr.zza(zzart, val$context, "mobile_ads_settings");
	//   11   21:aload_0         
	//   12   22:getfield        #13  <Field zzjr zzart>
	//   13   25:aload_0         
	//   14   26:getfield        #15  <Field Context val$context>
	//   15   29:ldc1            #53  <String "mobile_ads_settings">
	//   16   31:invokestatic    #56  <Method void zzjr.zza(zzjr, Context, String)>
			return ((Object) (new zzml()));
	//   17   34:new             #58  <Class zzml>
	//   18   37:dup             
	//   19   38:invokespecial   #61  <Method void zzml()>
	//   20   41:areturn         
		}
	}

	private final Context val$context;
	private final zzjr zzart;
}
