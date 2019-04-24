// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzld, zzjr, zzjg, zzmf, 
//			zzxn

final class zzjv extends zzjr.zza
{

	zzjv(zzjr zzjr1, Context context, String s, zzxn zzxn)
	{
		zzart = zzjr1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field zzjr zzart>
		val$context = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field Context val$context>
		zzarr = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #21  <Field String zzarr>
		zzars = zzxn;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #23  <Field zzxn zzars>
		super(zzjr1);
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:invokespecial   #26  <Method void zzjr$zza(zzjr)>
	//   15   26:return          
	}

	public final Object zza(zzld zzld1)
		throws RemoteException
	{
		return ((Object) (zzld1.createAdLoaderBuilder(ObjectWrapper.wrap(((Object) (val$context))), zzarr, zzars, 0xbdfcb8)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field Context val$context>
	//    3    5:invokestatic    #37  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field String zzarr>
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field zzxn zzars>
	//    8   16:ldc1            #38  <Int 0xbdfcb8>
	//    9   18:invokeinterface #44  <Method zzkn zzld.createAdLoaderBuilder(com.google.android.gms.dynamic.IObjectWrapper, String, zzxn, int)>
	//   10   23:areturn         
	}

	public final Object zzib()
		throws RemoteException
	{
		zzkn zzkn = zzjr.zzc(zzart).zza(val$context, zzarr, zzars);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzjr zzart>
	//    2    4:invokestatic    #53  <Method zzjg zzjr.zzc(zzjr)>
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field Context val$context>
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field String zzarr>
	//    7   15:aload_0         
	//    8   16:getfield        #23  <Field zzxn zzars>
	//    9   19:invokevirtual   #58  <Method zzkn zzjg.zza(Context, String, zzxn)>
	//   10   22:astore_1        
		if(zzkn != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          29
		{
			return ((Object) (zzkn));
	//   13   27:aload_1         
	//   14   28:areturn         
		} else
		{
			zzjr.zza(zzart, val$context, "native_ad");
	//   15   29:aload_0         
	//   16   30:getfield        #17  <Field zzjr zzart>
	//   17   33:aload_0         
	//   18   34:getfield        #19  <Field Context val$context>
	//   19   37:ldc1            #60  <String "native_ad">
	//   20   39:invokestatic    #63  <Method void zzjr.zza(zzjr, Context, String)>
			return ((Object) (new zzmf()));
	//   21   42:new             #65  <Class zzmf>
	//   22   45:dup             
	//   23   46:invokespecial   #68  <Method void zzmf()>
	//   24   49:areturn         
		}
	}

	private final Context val$context;
	private final String zzarr;
	private final zzxn zzars;
	private final zzjr zzart;
}
