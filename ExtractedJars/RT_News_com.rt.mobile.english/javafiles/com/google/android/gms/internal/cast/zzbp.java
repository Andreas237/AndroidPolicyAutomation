// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzbr, zzbt, zzbl

final class zzbp extends zzbr
{

	zzbp(zzbl zzbl1, String s, JSONObject jsonobject)
	{
		zzth = zzbl1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzbl zzth>
		zztk = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field String zztk>
		zztl = jsonobject;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #18  <Field JSONObject zztl>
		super(zzbl1);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokespecial   #21  <Method void zzbr(zzbl)>
	//   12   20:return          
	}

	public final void execute()
	{
		zzbl.zza(zzth, zztk, 6, zztl, ((zzbt)this).zztp);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzbl zzth>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field String zztk>
	//    4    8:bipush          6
	//    5   10:aload_0         
	//    6   11:getfield        #18  <Field JSONObject zztl>
	//    7   14:aload_0         
	//    8   15:getfield        #30  <Field zzdm zzbt.zztp>
	//    9   18:invokestatic    #36  <Method void zzbl.zza(zzbl, String, int, JSONObject, zzdm)>
	//   10   21:return          
	}

	private final zzbl zzth;
	private final String zztk;
	private final JSONObject zztl;
}
