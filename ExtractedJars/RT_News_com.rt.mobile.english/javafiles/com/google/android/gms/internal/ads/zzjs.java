// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzld, zzjr, zzjh, zzmj, 
//			zzjn, zzxn

final class zzjs extends zzjr.zza
{

	zzjs(zzjr zzjr1, Context context, zzjn zzjn, String s, zzxn zzxn)
	{
		zzart = zzjr1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field zzjr zzart>
		val$context = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Context val$context>
		zzarq = zzjn;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field zzjn zzarq>
		zzarr = s;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #25  <Field String zzarr>
		zzars = zzxn;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #27  <Field zzxn zzars>
		super(zzjr1);
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokespecial   #30  <Method void zzjr$zza(zzjr)>
	//   18   32:return          
	}

	public final Object zza(zzld zzld1)
		throws RemoteException
	{
		return ((Object) (zzld1.createBannerAdManager(ObjectWrapper.wrap(((Object) (val$context))), zzarq, zzarr, zzars, 0xbdfcb8)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field Context val$context>
	//    3    5:invokestatic    #41  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field zzjn zzarq>
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field String zzarr>
	//    8   16:aload_0         
	//    9   17:getfield        #27  <Field zzxn zzars>
	//   10   20:ldc1            #42  <Int 0xbdfcb8>
	//   11   22:invokeinterface #48  <Method zzks zzld.createBannerAdManager(com.google.android.gms.dynamic.IObjectWrapper, zzjn, String, zzxn, int)>
	//   12   27:areturn         
	}

	public final Object zzib()
		throws RemoteException
	{
		zzks zzks = zzjr.zzb(zzart).zza(val$context, zzarq, zzarr, zzars, 1);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzjr zzart>
	//    2    4:invokestatic    #57  <Method zzjh zzjr.zzb(zzjr)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Context val$context>
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field zzjn zzarq>
	//    7   15:aload_0         
	//    8   16:getfield        #25  <Field String zzarr>
	//    9   19:aload_0         
	//   10   20:getfield        #27  <Field zzxn zzars>
	//   11   23:iconst_1        
	//   12   24:invokevirtual   #62  <Method zzks zzjh.zza(Context, zzjn, String, zzxn, int)>
	//   13   27:astore_1        
		if(zzks != null)
	//*  14   28:aload_1         
	//*  15   29:ifnull          34
		{
			return ((Object) (zzks));
	//   16   32:aload_1         
	//   17   33:areturn         
		} else
		{
			zzjr.zza(zzart, val$context, "banner");
	//   18   34:aload_0         
	//   19   35:getfield        #19  <Field zzjr zzart>
	//   20   38:aload_0         
	//   21   39:getfield        #21  <Field Context val$context>
	//   22   42:ldc1            #64  <String "banner">
	//   23   44:invokestatic    #67  <Method void zzjr.zza(zzjr, Context, String)>
			return ((Object) (new zzmj()));
	//   24   47:new             #69  <Class zzmj>
	//   25   50:dup             
	//   26   51:invokespecial   #72  <Method void zzmj()>
	//   27   54:areturn         
		}
	}

	private final Context val$context;
	private final zzjn zzarq;
	private final String zzarr;
	private final zzxn zzars;
	private final zzjr zzart;
}
