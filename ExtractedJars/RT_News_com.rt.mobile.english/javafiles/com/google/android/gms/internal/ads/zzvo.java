// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaoo, zzvf, zzakb, zzvw

final class zzvo
	implements zzaoo
{

	zzvo(zzvf zzvf1, zzvw zzvw1)
	{
		zzbqk = zzvf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzvf zzbqk>
		zzbqn = zzvw1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field zzvw zzbqn>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void Object()>
	//    8   14:return          
	}

	public final void zze(Object obj)
	{
		synchronized(zzvf.zza(zzbqk))
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field zzvf zzbqk>
	//*   2    4:invokestatic    #29  <Method Object zzvf.zza(zzvf)>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			zzvf.zza(zzbqk, 0);
	//    6   10:aload_0         
	//    7   11:getfield        #15  <Field zzvf zzbqk>
	//    8   14:iconst_0        
	//    9   15:invokestatic    #32  <Method int zzvf.zza(zzvf, int)>
	//   10   18:pop             
			if(zzvf.zzb(zzbqk) != null && zzbqn != zzvf.zzb(zzbqk))
	//*  11   19:aload_0         
	//*  12   20:getfield        #15  <Field zzvf zzbqk>
	//*  13   23:invokestatic    #36  <Method zzvw zzvf.zzb(zzvf)>
	//*  14   26:ifnull          58
	//*  15   29:aload_0         
	//*  16   30:getfield        #17  <Field zzvw zzbqn>
	//*  17   33:aload_0         
	//*  18   34:getfield        #15  <Field zzvf zzbqk>
	//*  19   37:invokestatic    #36  <Method zzvw zzvf.zzb(zzvf)>
	//*  20   40:if_acmpeq       58
			{
				zzakb.v("New JS engine is loaded, marking previous one as destroyable.");
	//   21   43:ldc1            #38  <String "New JS engine is loaded, marking previous one as destroyable.">
	//   22   45:invokestatic    #44  <Method void zzakb.v(String)>
				zzvf.zzb(zzbqk).zzmb();
	//   23   48:aload_0         
	//   24   49:getfield        #15  <Field zzvf zzbqk>
	//   25   52:invokestatic    #36  <Method zzvw zzvf.zzb(zzvf)>
	//   26   55:invokevirtual   #49  <Method void zzvw.zzmb()>
			}
			zzvf.zza(zzbqk, zzbqn);
	//   27   58:aload_0         
	//   28   59:getfield        #15  <Field zzvf zzbqk>
	//   29   62:aload_0         
	//   30   63:getfield        #17  <Field zzvw zzbqn>
	//   31   66:invokestatic    #52  <Method zzvw zzvf.zza(zzvf, zzvw)>
	//   32   69:pop             
		}
	//   33   70:aload_1         
	//   34   71:monitorexit     
		return;
	//   35   72:return          
		exception;
	//   36   73:astore_2        
		obj;
	//   37   74:aload_1         
		JVM INSTR monitorexit ;
	//   38   75:monitorexit     
		throw exception;
	//   39   76:aload_2         
	//   40   77:athrow          
	}

	private final zzvf zzbqk;
	private final zzvw zzbqn;
}
