// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zza;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzajh, zzagr, zzaji

final class zzagt
	implements Runnable
{

	zzagt(zzagr zzagr, zzaji zzaji)
	{
		zzclh = zzagr;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzagr zzclh>
		zzwg = zzaji;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field zzaji zzwg>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		((zza) (zzclh)).zzb(new zzajh(zzwg, ((zzaqw) (null)), ((zzwx) (null)), ((zzxq) (null)), ((String) (null)), ((zzxa) (null)), ((zzpb) (null)), ((String) (null))));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzagr zzclh>
	//    2    4:new             #23  <Class zzajh>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field zzaji zzwg>
	//    6   12:aconst_null     
	//    7   13:aconst_null     
	//    8   14:aconst_null     
	//    9   15:aconst_null     
	//   10   16:aconst_null     
	//   11   17:aconst_null     
	//   12   18:aconst_null     
	//   13   19:invokespecial   #26  <Method void zzajh(zzaji, zzaqw, zzwx, zzxq, String, zzxa, zzpb, String)>
	//   14   22:invokevirtual   #32  <Method void zza.zzb(zzajh)>
	//   15   25:return          
	}

	private final zzagr zzclh;
	private final zzaji zzwg;
}
