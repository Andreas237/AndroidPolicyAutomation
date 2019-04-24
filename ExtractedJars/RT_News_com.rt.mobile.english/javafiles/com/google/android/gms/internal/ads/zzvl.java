// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzvf, zzakb, zzamk, zzuu, 
//			zzci

final class zzvl
	implements zzv
{

	zzvl(zzvf zzvf1, zzci zzci, zzuu zzuu1, zzamk zzamk1)
	{
		zzbqk = zzvf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field zzvf zzbqk>
		zzbql = zzci;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field zzci zzbql>
		zzbqj = zzuu1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field zzuu zzbqj>
		zzbqm = zzamk1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #25  <Field zzamk zzbqm>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #28  <Method void Object()>
	//   14   25:return          
	}

	public final void zza(Object obj, Map map)
	{
		synchronized(zzvf.zza(zzbqk))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field zzvf zzbqk>
	//*   2    4:invokestatic    #36  <Method Object zzvf.zza(zzvf)>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			zzakb.zzdj("JS Engine is requesting an update");
	//    6   10:ldc1            #38  <String "JS Engine is requesting an update">
	//    7   12:invokestatic    #44  <Method void zzakb.zzdj(String)>
			if(zzvf.zzd(zzbqk) == 0)
	//*   8   15:aload_0         
	//*   9   16:getfield        #19  <Field zzvf zzbqk>
	//*  10   19:invokestatic    #48  <Method int zzvf.zzd(zzvf)>
	//*  11   22:ifne            51
			{
				zzakb.zzdj("Starting reload.");
	//   12   25:ldc1            #50  <String "Starting reload.">
	//   13   27:invokestatic    #44  <Method void zzakb.zzdj(String)>
				zzvf.zza(zzbqk, 2);
	//   14   30:aload_0         
	//   15   31:getfield        #19  <Field zzvf zzbqk>
	//   16   34:iconst_2        
	//   17   35:invokestatic    #53  <Method int zzvf.zza(zzvf, int)>
	//   18   38:pop             
				zzbqk.zza(zzbql);
	//   19   39:aload_0         
	//   20   40:getfield        #19  <Field zzvf zzbqk>
	//   21   43:aload_0         
	//   22   44:getfield        #21  <Field zzci zzbql>
	//   23   47:invokevirtual   #56  <Method zzvw zzvf.zza(zzci)>
	//   24   50:pop             
			}
			zzbqj.zzb("/requestReload", (zzv)zzbqm.get());
	//   25   51:aload_0         
	//   26   52:getfield        #23  <Field zzuu zzbqj>
	//   27   55:ldc1            #58  <String "/requestReload">
	//   28   57:aload_0         
	//   29   58:getfield        #25  <Field zzamk zzbqm>
	//   30   61:invokevirtual   #64  <Method Object zzamk.get()>
	//   31   64:checkcast       #7   <Class zzv>
	//   32   67:invokeinterface #70  <Method void zzuu.zzb(String, zzv)>
		}
	//   33   72:aload_1         
	//   34   73:monitorexit     
		return;
	//   35   74:return          
		map;
	//   36   75:astore_2        
		obj;
	//   37   76:aload_1         
		JVM INSTR monitorexit ;
	//   38   77:monitorexit     
		throw map;
	//   39   78:aload_2         
	//   40   79:athrow          
	}

	private final zzuu zzbqj;
	private final zzvf zzbqk;
	private final zzci zzbql;
	private final zzamk zzbqm;
}
