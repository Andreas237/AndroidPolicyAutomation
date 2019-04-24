// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzano, zzaoj, zzanz, zzanj

final class zzanu
	implements Runnable
{

	zzanu(zzaoj zzaoj, zzanz zzanz, Class class1, zzanj zzanj, Executor executor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		zzbnu = zzaoj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field zzaoj zzbnu>
		zzcvk = zzanz;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field zzanz zzcvk>
		zzcvp = class1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field Class zzcvp>
		zzcvq = zzanj;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #29  <Field zzanj zzcvq>
		zzcvr = executor;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #31  <Field Executor zzcvr>
	//   17   31:return          
	}

	public final void run()
	{
		zzano.zza(zzbnu, zzcvk, zzcvp, zzcvq, zzcvr);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zzaoj zzbnu>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field zzanz zzcvk>
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field Class zzcvp>
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field zzanj zzcvq>
	//    8   16:aload_0         
	//    9   17:getfield        #31  <Field Executor zzcvr>
	//   10   20:invokestatic    #38  <Method void zzano.zza(zzaoj, zzanz, Class, zzanj, Executor)>
	//   11   23:return          
	}

	private final zzaoj zzbnu;
	private final zzanz zzcvk;
	private final Class zzcvp;
	private final zzanj zzcvq;
	private final Executor zzcvr;
}
