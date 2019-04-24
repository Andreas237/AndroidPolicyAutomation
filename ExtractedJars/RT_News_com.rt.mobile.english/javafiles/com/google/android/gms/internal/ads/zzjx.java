// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzld, zzjr, zzrv, zzmm

final class zzjx extends zzjr.zza
{

	zzjx(zzjr zzjr1, FrameLayout framelayout, FrameLayout framelayout1, Context context)
	{
		zzart = zzjr1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field zzjr zzart>
		zzaru = framelayout;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field FrameLayout zzaru>
		zzarv = framelayout1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field FrameLayout zzarv>
		val$context = context;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #22  <Field Context val$context>
		super(zzjr1);
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:invokespecial   #25  <Method void zzjr$zza(zzjr)>
	//   15   26:return          
	}

	public final Object zza(zzld zzld1)
		throws RemoteException
	{
		return ((Object) (zzld1.createNativeAdViewDelegate(ObjectWrapper.wrap(((Object) (zzaru))), ObjectWrapper.wrap(((Object) (zzarv))))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field FrameLayout zzaru>
	//    3    5:invokestatic    #36  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field FrameLayout zzarv>
	//    6   12:invokestatic    #36  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    7   15:invokeinterface #42  <Method zzqa zzld.createNativeAdViewDelegate(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper)>
	//    8   20:areturn         
	}

	public final Object zzib()
		throws RemoteException
	{
		zzqa zzqa = zzjr.zze(zzart).zzb(val$context, zzaru, zzarv);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzjr zzart>
	//    2    4:invokestatic    #51  <Method zzrv zzjr.zze(zzjr)>
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field Context val$context>
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field FrameLayout zzaru>
	//    7   15:aload_0         
	//    8   16:getfield        #20  <Field FrameLayout zzarv>
	//    9   19:invokevirtual   #57  <Method zzqa zzrv.zzb(Context, FrameLayout, FrameLayout)>
	//   10   22:astore_1        
		if(zzqa != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          29
		{
			return ((Object) (zzqa));
	//   13   27:aload_1         
	//   14   28:areturn         
		} else
		{
			zzjr.zza(zzart, val$context, "native_ad_view_delegate");
	//   15   29:aload_0         
	//   16   30:getfield        #16  <Field zzjr zzart>
	//   17   33:aload_0         
	//   18   34:getfield        #22  <Field Context val$context>
	//   19   37:ldc1            #59  <String "native_ad_view_delegate">
	//   20   39:invokestatic    #62  <Method void zzjr.zza(zzjr, Context, String)>
			return ((Object) (new zzmm()));
	//   21   42:new             #64  <Class zzmm>
	//   22   45:dup             
	//   23   46:invokespecial   #67  <Method void zzmm()>
	//   24   49:areturn         
		}
	}

	private final Context val$context;
	private final zzjr zzart;
	private final FrameLayout zzaru;
	private final FrameLayout zzarv;
}
