// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzano, zzaoj, zzanz, zzanj

final class zzanr
	implements Runnable
{

	zzanr(zzaoj zzaoj, zzanj zzanj, zzanz zzanz)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzbnu = zzaoj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field zzaoj zzbnu>
		zzcvn = zzanj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field zzanj zzcvn>
		zzcvm = zzanz;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field zzanz zzcvm>
	//   11   19:return          
	}

	public final void run()
	{
		zzano.zza(zzbnu, zzcvn, zzcvm);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzaoj zzbnu>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field zzanj zzcvn>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field zzanz zzcvm>
	//    6   12:invokestatic    #30  <Method void zzano.zza(zzaoj, zzanj, zzanz)>
	//    7   15:return          
	}

	private final zzaoj zzbnu;
	private final zzanz zzcvm;
	private final zzanj zzcvn;
}
