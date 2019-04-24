// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaom, zzvf, zzakb, zzvw

final class zzvp
	implements zzaom
{

	zzvp(zzvf zzvf1, zzvw zzvw1)
	{
		zzbqk = zzvf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzvf zzbqk>
		zzbqn = zzvw1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field zzvw zzbqn>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		synchronized(zzvf.zza(zzbqk))
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field zzvf zzbqk>
	//*   2    4:invokestatic    #27  <Method Object zzvf.zza(zzvf)>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			zzvf.zza(zzbqk, 1);
	//    6   10:aload_0         
	//    7   11:getfield        #14  <Field zzvf zzbqk>
	//    8   14:iconst_1        
	//    9   15:invokestatic    #30  <Method int zzvf.zza(zzvf, int)>
	//   10   18:pop             
			zzakb.v("Failed loading new engine. Marking new engine destroyable.");
	//   11   19:ldc1            #32  <String "Failed loading new engine. Marking new engine destroyable.">
	//   12   21:invokestatic    #38  <Method void zzakb.v(String)>
			zzbqn.zzmb();
	//   13   24:aload_0         
	//   14   25:getfield        #16  <Field zzvw zzbqn>
	//   15   28:invokevirtual   #43  <Method void zzvw.zzmb()>
		}
	//   16   31:aload_1         
	//   17   32:monitorexit     
		return;
	//   18   33:return          
		exception;
	//   19   34:astore_2        
		obj;
	//   20   35:aload_1         
		JVM INSTR monitorexit ;
	//   21   36:monitorexit     
		throw exception;
	//   22   37:aload_2         
	//   23   38:athrow          
	}

	private final zzvf zzbqk;
	private final zzvw zzbqn;
}
