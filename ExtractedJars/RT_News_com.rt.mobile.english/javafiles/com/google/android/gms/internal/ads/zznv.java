// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class zznv
{

	public zznv(long l, String s, zznv zznv1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzbgj = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #20  <Field long zzbgj>
		zzbgk = s;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #22  <Field String zzbgk>
		zzbgl = zznv1;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #24  <Field zznv zzbgl>
	//   11   20:return          
	}

	public final long getTime()
	{
		return zzbgj;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field long zzbgj>
	//    2    4:lreturn         
	}

	public final String zzjg()
	{
		return zzbgk;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String zzbgk>
	//    2    4:areturn         
	}

	public final zznv zzjh()
	{
		return zzbgl;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zznv zzbgl>
	//    2    4:areturn         
	}

	private final long zzbgj;
	private final String zzbgk;
	private final zznv zzbgl;
}
