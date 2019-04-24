// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzase, zzaqw

final class zzacg
	implements zzase
{

	zzacg(zzaqw zzaqw1, JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzcbh = zzaqw1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field zzaqw zzcbh>
		zzcbg = jsonobject;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field JSONObject zzcbg>
	//    8   14:return          
	}

	public final void zzly()
	{
		zzcbh.zzb("google.afma.nativeAds.renderVideo", zzcbg);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzaqw zzcbh>
	//    2    4:ldc1            #23  <String "google.afma.nativeAds.renderVideo">
	//    3    6:aload_0         
	//    4    7:getfield        #19  <Field JSONObject zzcbg>
	//    5   10:invokeinterface #29  <Method void zzaqw.zzb(String, JSONObject)>
	//    6   15:return          
	}

	private final JSONObject zzcbg;
	private final zzaqw zzcbh;
}
