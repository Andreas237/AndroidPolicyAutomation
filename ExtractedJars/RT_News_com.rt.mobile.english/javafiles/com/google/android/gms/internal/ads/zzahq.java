// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzahs, zzahr

public final class zzahq
{

	private zzahq(zzahs zzahs1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzclx = zzahs.zza(zzahs1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #23  <Method String zzahs.zza(zzahs)>
	//    5    9:putfield        #25  <Field String zzclx>
		zzbru = zzahs.zzb(zzahs1);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #28  <Method String zzahs.zzb(zzahs)>
	//    9   17:putfield        #30  <Field String zzbru>
		errorCode = zzahs.zzc(zzahs1);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #34  <Method int zzahs.zzc(zzahs)>
	//   13   25:putfield        #36  <Field int errorCode>
		zzbub = zzahs.zzd(zzahs1);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #40  <Method long zzahs.zzd(zzahs)>
	//   17   33:putfield        #42  <Field long zzbub>
	//   18   36:return          
	}

	zzahq(zzahs zzahs1, zzahr zzahr)
	{
		this(zzahs1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #46  <Method void zzahq(zzahs)>
	//    3    5:return          
	}

	public final int errorCode;
	public final String zzbru;
	public final long zzbub;
	private final String zzclx;
}
