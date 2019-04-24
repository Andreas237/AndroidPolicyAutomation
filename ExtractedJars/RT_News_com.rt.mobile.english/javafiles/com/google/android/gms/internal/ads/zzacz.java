// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzanl, zzaqw, zzacq

final class zzacz
	implements zzanl
{

	zzacz(zzacq zzacq, String s, JSONObject jsonobject)
	{
		val$message = s;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field String val$message>
		zzcbv = jsonobject;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #17  <Field JSONObject zzcbv>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void Object()>
	//    8   14:return          
	}

	public final void zzb(Throwable throwable)
	{
	//    0    0:return          
	}

	public final void zzh(Object obj)
	{
		((zzaqw)obj).zza(val$message, zzcbv);
	//    0    0:aload_1         
	//    1    1:checkcast       #27  <Class zzaqw>
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field String val$message>
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field JSONObject zzcbv>
	//    6   12:invokeinterface #31  <Method void zzaqw.zza(String, JSONObject)>
	//    7   17:return          
	}

	private final String val$message;
	private final JSONObject zzcbv;
}
