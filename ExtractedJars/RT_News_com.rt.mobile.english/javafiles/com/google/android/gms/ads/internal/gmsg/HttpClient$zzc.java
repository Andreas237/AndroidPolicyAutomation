// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.internal.gmsg;


// Referenced classes of package com.google.android.gms.ads.internal.gmsg:
//			HttpClient

final class HttpClient$zzc
{

	public final String getReason()
	{
		return zzbms;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String zzbms>
	//    2    4:areturn         
	}

	public final boolean isSuccess()
	{
		return zzbmr;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean zzbmr>
	//    2    4:ireturn         
	}

	public final HttpClient$zzd zzkz()
	{
		return zzbmq;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field HttpClient$zzd zzbmq>
	//    2    4:areturn         
	}

	private final HttpClient$zzd zzbmq;
	private final boolean zzbmr;
	private final String zzbms;

	public HttpClient$zzc(HttpClient httpclient, boolean flag, HttpClient$zzd httpclient$zzd, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		zzbmr = flag;
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:putfield        #22  <Field boolean zzbmr>
		zzbmq = httpclient$zzd;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #24  <Field HttpClient$zzd zzbmq>
		zzbms = s;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #26  <Field String zzbms>
	//   11   20:return          
	}
}
