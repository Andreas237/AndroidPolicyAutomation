// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaop, zzakb, zzvz, zzaon, 
//			zzvs, zzvx, zzvy, zzalo

public final class zzvw extends zzaop
{

	public zzvw(zzalo zzalo)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void zzaop()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void Object()>
	//    6   12:putfield        #24  <Field Object mLock>
		zzbpz = zzalo;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #26  <Field zzalo zzbpz>
		zzbqt = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #28  <Field boolean zzbqt>
		zzbqu = 0;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #30  <Field int zzbqu>
	//   16   30:return          
	}

	static zzalo zza(zzvw zzvw1)
	{
		return zzvw1.zzbpz;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field zzalo zzbpz>
	//    2    4:areturn         
	}

	private final void zzmc()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(zzbqu >= 0)
	//*   5    7:aload_0         
	//*   6    8:getfield        #30  <Field int zzbqu>
	//*   7   11:iflt            77
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_1        
		else
	//*  10   16:goto            19
	//*  11   19:iload_1         
	//*  12   20:invokestatic    #42  <Method void Preconditions.checkState(boolean)>
	//*  13   23:aload_0         
	//*  14   24:getfield        #28  <Field boolean zzbqt>
	//*  15   27:ifeq            64
	//*  16   30:aload_0         
	//*  17   31:getfield        #30  <Field int zzbqu>
	//*  18   34:ifne            64
	//*  19   37:ldc1            #44  <String "No reference is left (including root). Cleaning up engine.">
	//*  20   39:invokestatic    #50  <Method void zzakb.v(String)>
	//*  21   42:aload_0         
	//*  22   43:new             #52  <Class zzvz>
	//*  23   46:dup             
	//*  24   47:aload_0         
	//*  25   48:invokespecial   #55  <Method void zzvz(zzvw)>
	//*  26   51:new             #57  <Class zzaon>
	//*  27   54:dup             
	//*  28   55:invokespecial   #58  <Method void zzaon()>
	//*  29   58:invokevirtual   #61  <Method void zzaop.zza(zzaoo, zzaom)>
	//*  30   61:goto            69
	//*  31   64:ldc1            #63  <String "There are still references to the engine. Not destroying.">
	//*  32   66:invokestatic    #50  <Method void zzakb.v(String)>
	//*  33   69:aload_2         
	//*  34   70:monitorexit     
	//*  35   71:return          
	//*  36   72:astore_3        
	//*  37   73:aload_2         
	//*  38   74:monitorexit     
	//*  39   75:aload_3         
	//*  40   76:athrow          
			flag = false;
	//   41   77:iconst_0        
	//   42   78:istore_1        
		Preconditions.checkState(flag);
		if(zzbqt && zzbqu == 0)
		{
			zzakb.v("No reference is left (including root). Cleaning up engine.");
			((zzaop)this).zza(((zzaoo) (new zzvz(this))), ((zzaom) (new zzaon())));
			break MISSING_BLOCK_LABEL_69;
		}
		zzakb.v("There are still references to the engine. Not destroying.");
		obj;
		JVM INSTR monitorexit ;
		return;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  43   79:goto            19
	}

	public final zzvs zzlz()
	{
		zzvs zzvs1 = new zzvs(this);
	//    0    0:new             #67  <Class zzvs>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #68  <Method void zzvs(zzvw)>
	//    4    8:astore_3        
		Object obj = mLock;
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field Object mLock>
	//    7   13:astore_2        
		obj;
	//    8   14:aload_2         
		JVM INSTR monitorenter ;
	//    9   15:monitorenter    
		((zzaop)this).zza(((zzaoo) (new zzvx(this, zzvs1))), ((zzaom) (new zzvy(this, zzvs1))));
	//   10   16:aload_0         
	//   11   17:new             #70  <Class zzvx>
	//   12   20:dup             
	//   13   21:aload_0         
	//   14   22:aload_3         
	//   15   23:invokespecial   #73  <Method void zzvx(zzvw, zzvs)>
	//   16   26:new             #75  <Class zzvy>
	//   17   29:dup             
	//   18   30:aload_0         
	//   19   31:aload_3         
	//   20   32:invokespecial   #76  <Method void zzvy(zzvw, zzvs)>
	//   21   35:invokevirtual   #61  <Method void zzaop.zza(zzaoo, zzaom)>
		boolean flag;
		Exception exception;
		if(zzbqu >= 0)
	//*  22   38:aload_0         
	//*  23   39:getfield        #30  <Field int zzbqu>
	//*  24   42:iflt            73
			flag = true;
	//   25   45:iconst_1        
	//   26   46:istore_1        
		else
	//*  27   47:goto            50
	//*  28   50:iload_1         
	//*  29   51:invokestatic    #42  <Method void Preconditions.checkState(boolean)>
	//*  30   54:aload_0         
	//*  31   55:aload_0         
	//*  32   56:getfield        #30  <Field int zzbqu>
	//*  33   59:iconst_1        
	//*  34   60:iadd            
	//*  35   61:putfield        #30  <Field int zzbqu>
	//*  36   64:aload_2         
	//*  37   65:monitorexit     
	//*  38   66:aload_3         
	//*  39   67:areturn         
	//*  40   68:astore_3        
	//*  41   69:aload_2         
	//*  42   70:monitorexit     
	//*  43   71:aload_3         
	//*  44   72:athrow          
			flag = false;
	//   45   73:iconst_0        
	//   46   74:istore_1        
		Preconditions.checkState(flag);
		zzbqu = zzbqu + 1;
		obj;
		JVM INSTR monitorexit ;
		return zzvs1;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  47   75:goto            50
	}

	protected final void zzma()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(zzbqu > 0)
	//*   5    7:aload_0         
	//*   6    8:getfield        #30  <Field int zzbqu>
	//*   7   11:ifle            50
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_1        
		else
	//*  10   16:goto            19
	//*  11   19:iload_1         
	//*  12   20:invokestatic    #42  <Method void Preconditions.checkState(boolean)>
	//*  13   23:ldc1            #79  <String "Releasing 1 reference for JS Engine">
	//*  14   25:invokestatic    #50  <Method void zzakb.v(String)>
	//*  15   28:aload_0         
	//*  16   29:aload_0         
	//*  17   30:getfield        #30  <Field int zzbqu>
	//*  18   33:iconst_1        
	//*  19   34:isub            
	//*  20   35:putfield        #30  <Field int zzbqu>
	//*  21   38:aload_0         
	//*  22   39:invokespecial   #81  <Method void zzmc()>
	//*  23   42:aload_2         
	//*  24   43:monitorexit     
	//*  25   44:return          
	//*  26   45:astore_3        
	//*  27   46:aload_2         
	//*  28   47:monitorexit     
	//*  29   48:aload_3         
	//*  30   49:athrow          
			flag = false;
	//   31   50:iconst_0        
	//   32   51:istore_1        
		Preconditions.checkState(flag);
		zzakb.v("Releasing 1 reference for JS Engine");
		zzbqu = zzbqu - 1;
		zzmc();
		obj;
		JVM INSTR monitorexit ;
		return;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  33   52:goto            19
	}

	public final void zzmb()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(zzbqu >= 0)
	//*   5    7:aload_0         
	//*   6    8:getfield        #30  <Field int zzbqu>
	//*   7   11:iflt            45
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_1        
		else
	//*  10   16:goto            19
	//*  11   19:iload_1         
	//*  12   20:invokestatic    #42  <Method void Preconditions.checkState(boolean)>
	//*  13   23:ldc1            #84  <String "Releasing root reference. JS Engine will be destroyed once other references are released.">
	//*  14   25:invokestatic    #50  <Method void zzakb.v(String)>
	//*  15   28:aload_0         
	//*  16   29:iconst_1        
	//*  17   30:putfield        #28  <Field boolean zzbqt>
	//*  18   33:aload_0         
	//*  19   34:invokespecial   #81  <Method void zzmc()>
	//*  20   37:aload_2         
	//*  21   38:monitorexit     
	//*  22   39:return          
	//*  23   40:astore_3        
	//*  24   41:aload_2         
	//*  25   42:monitorexit     
	//*  26   43:aload_3         
	//*  27   44:athrow          
			flag = false;
	//   28   45:iconst_0        
	//   29   46:istore_1        
		Preconditions.checkState(flag);
		zzakb.v("Releasing root reference. JS Engine will be destroyed once other references are released.");
		zzbqt = true;
		zzmc();
		obj;
		JVM INSTR monitorexit ;
		return;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  30   47:goto            19
	}

	private final Object mLock = new Object();
	private zzalo zzbpz;
	private boolean zzbqt;
	private int zzbqu;
}
