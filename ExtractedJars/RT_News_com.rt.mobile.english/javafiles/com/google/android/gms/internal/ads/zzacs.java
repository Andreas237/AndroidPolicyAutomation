// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzanj, zzaqw, zzacq, zzanz

final class zzacs
	implements zzanj
{

	zzacs(zzacq zzacq1, JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzcbp = zzacq1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field zzacq zzcbp>
		zzcbg = jsonobject;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field JSONObject zzcbg>
	//    8   14:return          
	}

	public final zzanz zzc(Object obj)
	{
		return zzcbp.zzd(zzcbg, (zzaqw)obj);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzacq zzcbp>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field JSONObject zzcbg>
	//    4    8:aload_1         
	//    5    9:checkcast       #24  <Class zzaqw>
	//    6   12:invokevirtual   #30  <Method zzanz zzacq.zzd(JSONObject, zzaqw)>
	//    7   15:areturn         
	}

	private final JSONObject zzcbg;
	private final zzacq zzcbp;
}
