// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzand, zzamy

final class zzamz
	implements zzand
{

	zzamz(String s, String s1, Map map, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzcva = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field String zzcva>
		zzzo = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field String zzzo>
		zzbpq = map;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field Map zzbpq>
		zzcvb = abyte0;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #26  <Field byte[] zzcvb>
	//   14   25:return          
	}

	public final void zza(JsonWriter jsonwriter)
	{
		zzamy.zza(zzcva, zzzo, zzbpq, zzcvb, jsonwriter);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String zzcva>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field String zzzo>
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field Map zzbpq>
	//    6   12:aload_0         
	//    7   13:getfield        #26  <Field byte[] zzcvb>
	//    8   16:aload_1         
	//    9   17:invokestatic    #34  <Method void zzamy.zza(String, String, Map, byte[], JsonWriter)>
	//   10   20:return          
	}

	private final Map zzbpq;
	private final String zzcva;
	private final byte zzcvb[];
	private final String zzzo;
}
