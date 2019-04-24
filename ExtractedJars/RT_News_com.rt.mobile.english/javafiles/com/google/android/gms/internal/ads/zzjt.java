// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzld, zzjr, zzjh, zzmj, 
//			zzjn

final class zzjt extends zzjr.zza
{

	zzjt(zzjr zzjr1, Context context, zzjn zzjn, String s)
	{
		zzart = zzjr1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field zzjr zzart>
		val$context = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field Context val$context>
		zzarq = zzjn;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #21  <Field zzjn zzarq>
		zzarr = s;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #23  <Field String zzarr>
		super(zzjr1);
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:invokespecial   #26  <Method void zzjr$zza(zzjr)>
	//   15   26:return          
	}

	public final Object zza(zzld zzld1)
		throws RemoteException
	{
		return ((Object) (zzld1.createSearchAdManager(ObjectWrapper.wrap(((Object) (val$context))), zzarq, zzarr, 0xbdfcb8)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field Context val$context>
	//    3    5:invokestatic    #37  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field zzjn zzarq>
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field String zzarr>
	//    8   16:ldc1            #38  <Int 0xbdfcb8>
	//    9   18:invokeinterface #44  <Method zzks zzld.createSearchAdManager(com.google.android.gms.dynamic.IObjectWrapper, zzjn, String, int)>
	//   10   23:areturn         
	}

	public final Object zzib()
		throws RemoteException
	{
		zzks zzks = zzjr.zzb(zzart).zza(val$context, zzarq, zzarr, ((zzxn) (null)), 3);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzjr zzart>
	//    2    4:invokestatic    #53  <Method zzjh zzjr.zzb(zzjr)>
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field Context val$context>
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field zzjn zzarq>
	//    7   15:aload_0         
	//    8   16:getfield        #23  <Field String zzarr>
	//    9   19:aconst_null     
	//   10   20:iconst_3        
	//   11   21:invokevirtual   #58  <Method zzks zzjh.zza(Context, zzjn, String, zzxn, int)>
	//   12   24:astore_1        
		if(zzks != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          31
		{
			return ((Object) (zzks));
	//   15   29:aload_1         
	//   16   30:areturn         
		} else
		{
			zzjr.zza(zzart, val$context, "search");
	//   17   31:aload_0         
	//   18   32:getfield        #17  <Field zzjr zzart>
	//   19   35:aload_0         
	//   20   36:getfield        #19  <Field Context val$context>
	//   21   39:ldc1            #60  <String "search">
	//   22   41:invokestatic    #63  <Method void zzjr.zza(zzjr, Context, String)>
			return ((Object) (new zzmj()));
	//   23   44:new             #65  <Class zzmj>
	//   24   47:dup             
	//   25   48:invokespecial   #68  <Method void zzmj()>
	//   26   51:areturn         
		}
	}

	private final Context val$context;
	private final zzjn zzarq;
	private final String zzarr;
	private final zzjr zzart;
}
