// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzvf, zzaop, zzalo, zzakb, 
//			zzvw, zzuu

final class zzvk
	implements zzv
{

	zzvk(zzvf zzvf1, zzvw zzvw, zzuu zzuu)
	{
		zzbqk = zzvf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field zzvf zzbqk>
		zzbqi = zzvw;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field zzvw zzbqi>
		zzbqj = zzuu;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #21  <Field zzuu zzbqj>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #24  <Method void Object()>
	//   11   19:return          
	}

	public final void zza(Object obj, Map map)
	{
		obj = zzvf.zza(zzbqk);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzvf zzbqk>
	//    2    4:invokestatic    #32  <Method Object zzvf.zza(zzvf)>
	//    3    7:astore_1        
		obj;
	//    4    8:aload_1         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		if(((zzaop) (zzbqi)).getStatus() == -1 || ((zzaop) (zzbqi)).getStatus() == 1)
	//*   6   10:aload_0         
	//*   7   11:getfield        #19  <Field zzvw zzbqi>
	//*   8   14:invokevirtual   #38  <Method int zzaop.getStatus()>
	//*   9   17:iconst_m1       
	//*  10   18:icmpeq          91
	//*  11   21:aload_0         
	//*  12   22:getfield        #19  <Field zzvw zzbqi>
	//*  13   25:invokevirtual   #38  <Method int zzaop.getStatus()>
	//*  14   28:iconst_1        
	//*  15   29:icmpne          35
			break MISSING_BLOCK_LABEL_91;
	//   16   32:goto            91
		zzvf.zza(zzbqk, 0);
	//   17   35:aload_0         
	//   18   36:getfield        #17  <Field zzvf zzbqk>
	//   19   39:iconst_0        
	//   20   40:invokestatic    #41  <Method int zzvf.zza(zzvf, int)>
	//   21   43:pop             
		zzvf.zzc(zzbqk).zze(((Object) (zzbqj)));
	//   22   44:aload_0         
	//   23   45:getfield        #17  <Field zzvf zzbqk>
	//   24   48:invokestatic    #45  <Method zzalo zzvf.zzc(zzvf)>
	//   25   51:aload_0         
	//   26   52:getfield        #21  <Field zzuu zzbqj>
	//   27   55:invokeinterface #51  <Method void zzalo.zze(Object)>
		((zzaop) (zzbqi)).zzk(((Object) (zzbqj)));
	//   28   60:aload_0         
	//   29   61:getfield        #19  <Field zzvw zzbqi>
	//   30   64:aload_0         
	//   31   65:getfield        #21  <Field zzuu zzbqj>
	//   32   68:invokevirtual   #54  <Method void zzaop.zzk(Object)>
		zzvf.zza(zzbqk, zzbqi);
	//   33   71:aload_0         
	//   34   72:getfield        #17  <Field zzvf zzbqk>
	//   35   75:aload_0         
	//   36   76:getfield        #19  <Field zzvw zzbqi>
	//   37   79:invokestatic    #57  <Method zzvw zzvf.zza(zzvf, zzvw)>
	//   38   82:pop             
		zzakb.v("Successfully loaded JS Engine.");
	//   39   83:ldc1            #59  <String "Successfully loaded JS Engine.">
	//   40   85:invokestatic    #65  <Method void zzakb.v(String)>
		obj;
	//   41   88:aload_1         
		JVM INSTR monitorexit ;
	//   42   89:monitorexit     
		return;
	//   43   90:return          
		obj;
	//   44   91:aload_1         
		JVM INSTR monitorexit ;
	//   45   92:monitorexit     
		return;
	//   46   93:return          
		map;
	//   47   94:astore_2        
		obj;
	//   48   95:aload_1         
		JVM INSTR monitorexit ;
	//   49   96:monitorexit     
		throw map;
	//   50   97:aload_2         
	//   51   98:athrow          
	}

	private final zzvw zzbqi;
	private final zzuu zzbqj;
	private final zzvf zzbqk;
}
