// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzahq

public final class zzahs
{

	public zzahs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	static String zza(zzahs zzahs1)
	{
		return zzahs1.zzbth;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String zzbth>
	//    2    4:areturn         
	}

	static String zzb(zzahs zzahs1)
	{
		return zzahs1.zzcly;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String zzcly>
	//    2    4:areturn         
	}

	static int zzc(zzahs zzahs1)
	{
		return zzahs1.mErrorCode;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int mErrorCode>
	//    2    4:ireturn         
	}

	static long zzd(zzahs zzahs1)
	{
		return zzahs1.zzclz;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field long zzclz>
	//    2    4:lreturn         
	}

	public final zzahs zzad(int i)
	{
		mErrorCode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field int mErrorCode>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final zzahs zzcc(String s)
	{
		zzbth = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field String zzbth>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final zzahs zzcd(String s)
	{
		zzcly = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field String zzcly>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final zzahs zzg(long l)
	{
		zzclz = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #31  <Field long zzclz>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final zzahq zzpd()
	{
		return new zzahq(this, ((zzahr) (null)));
	//    0    0:new             #42  <Class zzahq>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #45  <Method void zzahq(zzahs, zzahr)>
	//    5    9:areturn         
	}

	private int mErrorCode;
	private String zzbth;
	private String zzcly;
	private long zzclz;
}
