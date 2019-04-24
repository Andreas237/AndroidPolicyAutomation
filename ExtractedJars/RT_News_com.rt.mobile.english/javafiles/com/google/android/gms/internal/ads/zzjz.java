// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzld, zzjr, zzahi, zzmo, 
//			zzxn

final class zzjz extends zzjr.zza
{

	zzjz(zzjr zzjr1, Context context, zzxn zzxn)
	{
		zzart = zzjr1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzjr zzart>
		val$context = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field Context val$context>
		zzars = zzxn;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #19  <Field zzxn zzars>
		super(zzjr1);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokespecial   #22  <Method void zzjr$zza(zzjr)>
	//   12   20:return          
	}

	public final Object zza(zzld zzld1)
		throws RemoteException
	{
		return ((Object) (zzld1.createRewardedVideoAd(ObjectWrapper.wrap(((Object) (val$context))), zzars, 0xbdfcb8)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #17  <Field Context val$context>
	//    3    5:invokestatic    #33  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field zzxn zzars>
	//    6   12:ldc1            #34  <Int 0xbdfcb8>
	//    7   14:invokeinterface #40  <Method zzagz zzld.createRewardedVideoAd(com.google.android.gms.dynamic.IObjectWrapper, zzxn, int)>
	//    8   19:areturn         
	}

	public final Object zzib()
		throws RemoteException
	{
		zzagz zzagz = zzjr.zzg(zzart).zza(val$context, zzars);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzjr zzart>
	//    2    4:invokestatic    #49  <Method zzahi zzjr.zzg(zzjr)>
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Context val$context>
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field zzxn zzars>
	//    7   15:invokevirtual   #54  <Method zzagz zzahi.zza(Context, zzxn)>
	//    8   18:astore_1        
		if(zzagz != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          25
		{
			return ((Object) (zzagz));
	//   11   23:aload_1         
	//   12   24:areturn         
		} else
		{
			zzjr.zza(zzart, val$context, "rewarded_video");
	//   13   25:aload_0         
	//   14   26:getfield        #15  <Field zzjr zzart>
	//   15   29:aload_0         
	//   16   30:getfield        #17  <Field Context val$context>
	//   17   33:ldc1            #56  <String "rewarded_video">
	//   18   35:invokestatic    #59  <Method void zzjr.zza(zzjr, Context, String)>
			return ((Object) (new zzmo()));
	//   19   38:new             #61  <Class zzmo>
	//   20   41:dup             
	//   21   42:invokespecial   #64  <Method void zzmo()>
	//   22   45:areturn         
		}
	}

	private final Context val$context;
	private final zzxn zzars;
	private final zzjr zzart;
}
