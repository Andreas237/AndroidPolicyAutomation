// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzld, zzjr, zzaao

final class zzka extends zzjr.zza
{

	zzka(zzjr zzjr1, Activity activity)
	{
		zzart = zzjr1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzjr zzart>
		val$activity = activity;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #15  <Field Activity val$activity>
		super(zzjr1);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #18  <Method void zzjr$zza(zzjr)>
	//    9   15:return          
	}

	public final Object zza(zzld zzld1)
		throws RemoteException
	{
		return ((Object) (zzld1.createAdOverlay(ObjectWrapper.wrap(((Object) (val$activity))))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field Activity val$activity>
	//    3    5:invokestatic    #29  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4    8:invokeinterface #35  <Method zzaap zzld.createAdOverlay(com.google.android.gms.dynamic.IObjectWrapper)>
	//    5   13:areturn         
	}

	public final Object zzib()
		throws RemoteException
	{
		zzaap zzaap = zzjr.zzh(zzart).zze(val$activity);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzjr zzart>
	//    2    4:invokestatic    #44  <Method zzaao zzjr.zzh(zzjr)>
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field Activity val$activity>
	//    5   11:invokevirtual   #50  <Method zzaap zzaao.zze(Activity)>
	//    6   14:astore_1        
		if(zzaap != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          21
		{
			return ((Object) (zzaap));
	//    9   19:aload_1         
	//   10   20:areturn         
		} else
		{
			zzjr.zza(zzart, ((android.content.Context) (val$activity)), "ad_overlay");
	//   11   21:aload_0         
	//   12   22:getfield        #13  <Field zzjr zzart>
	//   13   25:aload_0         
	//   14   26:getfield        #15  <Field Activity val$activity>
	//   15   29:ldc1            #52  <String "ad_overlay">
	//   16   31:invokestatic    #55  <Method void zzjr.zza(zzjr, android.content.Context, String)>
			return ((Object) (null));
	//   17   34:aconst_null     
	//   18   35:areturn         
		}
	}

	private final Activity val$activity;
	private final zzjr zzart;
}
