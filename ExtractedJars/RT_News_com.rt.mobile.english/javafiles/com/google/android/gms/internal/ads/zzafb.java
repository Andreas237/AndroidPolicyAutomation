// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzafa, zzadj, zzvs, zzaji

final class zzafb
	implements Runnable
{

	zzafb(zzafa zzafa1, zzaji zzaji)
	{
		zzcgj = zzafa1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzafa zzcgj>
		zzwg = zzaji;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field zzaji zzwg>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		zzafa.zza(zzcgj).zza(zzwg);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzafa zzcgj>
	//    2    4:invokestatic    #27  <Method zzadj zzafa.zza(zzafa)>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field zzaji zzwg>
	//    5   11:invokeinterface #32  <Method void zzadj.zza(zzaji)>
		if(zzafa.zzb(zzcgj) != null)
	//*   6   16:aload_0         
	//*   7   17:getfield        #14  <Field zzafa zzcgj>
	//*   8   20:invokestatic    #36  <Method zzvs zzafa.zzb(zzafa)>
	//*   9   23:ifnull          45
		{
			zzafa.zzb(zzcgj).release();
	//   10   26:aload_0         
	//   11   27:getfield        #14  <Field zzafa zzcgj>
	//   12   30:invokestatic    #36  <Method zzvs zzafa.zzb(zzafa)>
	//   13   33:invokevirtual   #41  <Method void zzvs.release()>
			zzafa.zza(zzcgj, ((zzvs) (null)));
	//   14   36:aload_0         
	//   15   37:getfield        #14  <Field zzafa zzcgj>
	//   16   40:aconst_null     
	//   17   41:invokestatic    #44  <Method zzvs zzafa.zza(zzafa, zzvs)>
	//   18   44:pop             
		}
	//   19   45:return          
	}

	private final zzafa zzcgj;
	private final zzaji zzwg;
}
