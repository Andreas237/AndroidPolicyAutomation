// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzabv, zzaoj

final class zzabw
	implements Runnable
{

	zzabw(zzabv zzabv1, zzaoj zzaoj, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzcaf = zzabv1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field zzabv zzcaf>
		zzcag = zzaoj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field zzaoj zzcag>
		zzcah = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field String zzcah>
	//   11   19:return          
	}

	public final void run()
	{
		zzcaf.zza(zzcag, zzcah);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzabv zzcaf>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field zzaoj zzcag>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field String zzcah>
	//    6   12:invokevirtual   #31  <Method void zzabv.zza(zzaoj, String)>
	//    7   15:return          
	}

	private final zzabv zzcaf;
	private final zzaoj zzcag;
	private final String zzcah;
}
