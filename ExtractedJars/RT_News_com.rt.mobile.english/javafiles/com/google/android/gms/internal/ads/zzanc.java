// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.JsonWriter;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzand, zzamy

final class zzanc
	implements zzand
{

	zzanc(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzcva = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field String zzcva>
	//    5    9:return          
	}

	public final void zza(JsonWriter jsonwriter)
	{
		zzamy.zza(zzcva, jsonwriter);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field String zzcva>
	//    2    4:aload_1         
	//    3    5:invokestatic    #23  <Method void zzamy.zza(String, JsonWriter)>
	//    4    8:return          
	}

	private final String zzcva;
}
