// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzank, zzagf

final class zzagg
	implements zzank
{

	zzagg(zzagf zzagf1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzckp = zzagf1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field zzagf zzckp>
	//    5    9:return          
	}

	public final Object apply(Object obj)
	{
		return ((Object) (zzckp.zzn((JSONObject)obj)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzagf zzckp>
	//    2    4:aload_1         
	//    3    5:checkcast       #20  <Class JSONObject>
	//    4    8:invokevirtual   #26  <Method Void zzagf.zzn(JSONObject)>
	//    5   11:areturn         
	}

	private final zzagf zzckp;
}
