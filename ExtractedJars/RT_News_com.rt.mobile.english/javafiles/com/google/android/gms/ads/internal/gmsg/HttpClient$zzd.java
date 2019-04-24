// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.internal.gmsg;

import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.gmsg:
//			HttpClient

static final class HttpClient$zzd
{

	public final String getBody()
	{
		return zzbhy;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String zzbhy>
	//    2    4:areturn         
	}

	public final int getResponseCode()
	{
		return zzbmt;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int zzbmt>
	//    2    4:ireturn         
	}

	public final String zzkv()
	{
		return zzbmm;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String zzbmm>
	//    2    4:areturn         
	}

	public final Iterable zzla()
	{
		return ((Iterable) (zzcf));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List zzcf>
	//    2    4:areturn         
	}

	private final String zzbhy;
	private final String zzbmm;
	private final int zzbmt;
	private final List zzcf;

	HttpClient$zzd(String s, int i, List list, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		zzbmm = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field String zzbmm>
		zzbmt = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #26  <Field int zzbmt>
		zzcf = list;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field List zzcf>
		zzbhy = s1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #30  <Field String zzbhy>
	//   14   25:return          
	}
}
