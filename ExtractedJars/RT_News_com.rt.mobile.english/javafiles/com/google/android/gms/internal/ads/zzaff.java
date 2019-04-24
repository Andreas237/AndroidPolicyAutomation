// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzafa, zzvs

final class zzaff
	implements Runnable
{

	zzaff(zzafa zzafa1)
	{
		zzcgj = zzafa1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzafa zzcgj>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		if(zzafa.zzb(zzcgj) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field zzafa zzcgj>
	//*   2    4:invokestatic    #23  <Method zzvs zzafa.zzb(zzafa)>
	//*   3    7:ifnull          29
		{
			zzafa.zzb(zzcgj).release();
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field zzafa zzcgj>
	//    6   14:invokestatic    #23  <Method zzvs zzafa.zzb(zzafa)>
	//    7   17:invokevirtual   #28  <Method void zzvs.release()>
			zzafa.zza(zzcgj, ((zzvs) (null)));
	//    8   20:aload_0         
	//    9   21:getfield        #12  <Field zzafa zzcgj>
	//   10   24:aconst_null     
	//   11   25:invokestatic    #32  <Method zzvs zzafa.zza(zzafa, zzvs)>
	//   12   28:pop             
		}
	//   13   29:return          
	}

	private final zzafa zzcgj;
}
