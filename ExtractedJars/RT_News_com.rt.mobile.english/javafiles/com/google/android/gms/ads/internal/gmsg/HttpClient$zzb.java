// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.internal.gmsg;

import java.net.URL;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.ads.internal.gmsg:
//			HttpClient

static final class HttpClient$zzb
{

	public final String zzkv()
	{
		return zzbmm;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String zzbmm>
	//    2    4:areturn         
	}

	public final URL zzkw()
	{
		return zzbmn;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field URL zzbmn>
	//    2    4:areturn         
	}

	public final ArrayList zzkx()
	{
		return zzbmo;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ArrayList zzbmo>
	//    2    4:areturn         
	}

	public final String zzky()
	{
		return zzbmp;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String zzbmp>
	//    2    4:areturn         
	}

	private final String zzbmm;
	private final URL zzbmn;
	private final ArrayList zzbmo;
	private final String zzbmp;

	HttpClient$zzb(String s, URL url, ArrayList arraylist, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		zzbmm = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field String zzbmm>
		zzbmn = url;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field URL zzbmn>
		zzbmo = arraylist;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field ArrayList zzbmo>
		zzbmp = s1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #30  <Field String zzbmp>
	//   14   25:return          
	}
}
