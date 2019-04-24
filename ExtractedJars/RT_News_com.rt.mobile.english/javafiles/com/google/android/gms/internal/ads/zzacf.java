// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzace, zzaoj

final class zzacf
	implements Runnable
{

	zzacf(zzace zzace1, JSONObject jsonobject, zzaoj zzaoj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzcbf = zzace1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field zzace zzcbf>
		zzcbg = jsonobject;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field JSONObject zzcbg>
		zzbns = zzaoj;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field zzaoj zzbns>
	//   11   19:return          
	}

	public final void run()
	{
		zzcbf.zza(zzcbg, zzbns);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzace zzcbf>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field JSONObject zzcbg>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field zzaoj zzbns>
	//    6   12:invokevirtual   #31  <Method void zzace.zza(JSONObject, zzaoj)>
	//    7   15:return          
	}

	private final zzaoj zzbns;
	private final zzace zzcbf;
	private final JSONObject zzcbg;
}
