// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzld, zzjr, zzrw, zzmn

final class zzjy extends zzjr.zza
{

	zzjy(zzjr zzjr1, View view, HashMap hashmap, HashMap hashmap1)
	{
		zzart = zzjr1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field zzjr zzart>
		zzarw = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field View zzarw>
		zzarx = hashmap;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field HashMap zzarx>
		zzary = hashmap1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #22  <Field HashMap zzary>
		super(zzjr1);
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:invokespecial   #25  <Method void zzjr$zza(zzjr)>
	//   15   26:return          
	}

	public final Object zza(zzld zzld1)
		throws RemoteException
	{
		return ((Object) (zzld1.createNativeAdViewHolderDelegate(ObjectWrapper.wrap(((Object) (zzarw))), ObjectWrapper.wrap(((Object) (zzarx))), ObjectWrapper.wrap(((Object) (zzary))))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field View zzarw>
	//    3    5:invokestatic    #36  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field HashMap zzarx>
	//    6   12:invokestatic    #36  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    7   15:aload_0         
	//    8   16:getfield        #22  <Field HashMap zzary>
	//    9   19:invokestatic    #36  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   10   22:invokeinterface #42  <Method zzqf zzld.createNativeAdViewHolderDelegate(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper)>
	//   11   27:areturn         
	}

	public final Object zzib()
		throws RemoteException
	{
		zzqf zzqf = zzjr.zzf(zzart).zzb(zzarw, zzarx, zzary);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzjr zzart>
	//    2    4:invokestatic    #51  <Method zzrw zzjr.zzf(zzjr)>
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field View zzarw>
	//    5   11:aload_0         
	//    6   12:getfield        #20  <Field HashMap zzarx>
	//    7   15:aload_0         
	//    8   16:getfield        #22  <Field HashMap zzary>
	//    9   19:invokevirtual   #57  <Method zzqf zzrw.zzb(View, HashMap, HashMap)>
	//   10   22:astore_1        
		if(zzqf != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          29
		{
			return ((Object) (zzqf));
	//   13   27:aload_1         
	//   14   28:areturn         
		} else
		{
			zzjr.zza(zzart, zzarw.getContext(), "native_ad_view_holder_delegate");
	//   15   29:aload_0         
	//   16   30:getfield        #16  <Field zzjr zzart>
	//   17   33:aload_0         
	//   18   34:getfield        #18  <Field View zzarw>
	//   19   37:invokevirtual   #63  <Method android.content.Context View.getContext()>
	//   20   40:ldc1            #65  <String "native_ad_view_holder_delegate">
	//   21   42:invokestatic    #68  <Method void zzjr.zza(zzjr, android.content.Context, String)>
			return ((Object) (new zzmn()));
	//   22   45:new             #70  <Class zzmn>
	//   23   48:dup             
	//   24   49:invokespecial   #73  <Method void zzmn()>
	//   25   52:areturn         
		}
	}

	private final zzjr zzart;
	private final View zzarw;
	private final HashMap zzarx;
	private final HashMap zzary;
}
