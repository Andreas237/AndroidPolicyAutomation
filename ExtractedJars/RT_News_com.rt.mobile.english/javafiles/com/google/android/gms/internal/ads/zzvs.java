// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaop, zzvt, zzaon, zzvu, 
//			zzvv, zzvw

public final class zzvs extends zzaop
{

	public zzvs(zzvw zzvw)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void zzaop()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void Object()>
	//    6   12:putfield        #21  <Field Object mLock>
		zzbqq = zzvw;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #23  <Field zzvw zzbqq>
	//   10   20:return          
	}

	static zzvw zza(zzvs zzvs1)
	{
		return zzvs1.zzbqq;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zzvw zzbqq>
	//    2    4:areturn         
	}

	public final void release()
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(!zzbqr)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #29  <Field boolean zzbqr>
	//    7   11:ifeq            17
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		zzbqr = true;
	//   11   17:aload_0         
	//   12   18:iconst_1        
	//   13   19:putfield        #29  <Field boolean zzbqr>
		((zzaop)this).zza(((zzaoo) (new zzvt(this))), ((zzaom) (new zzaon())));
	//   14   22:aload_0         
	//   15   23:new             #31  <Class zzvt>
	//   16   26:dup             
	//   17   27:aload_0         
	//   18   28:invokespecial   #34  <Method void zzvt(zzvs)>
	//   19   31:new             #36  <Class zzaon>
	//   20   34:dup             
	//   21   35:invokespecial   #37  <Method void zzaon()>
	//   22   38:invokevirtual   #40  <Method void zzaop.zza(zzaoo, zzaom)>
		((zzaop)this).zza(((zzaoo) (new zzvu(this))), ((zzaom) (new zzvv(this))));
	//   23   41:aload_0         
	//   24   42:new             #42  <Class zzvu>
	//   25   45:dup             
	//   26   46:aload_0         
	//   27   47:invokespecial   #43  <Method void zzvu(zzvs)>
	//   28   50:new             #45  <Class zzvv>
	//   29   53:dup             
	//   30   54:aload_0         
	//   31   55:invokespecial   #46  <Method void zzvv(zzvs)>
	//   32   58:invokevirtual   #40  <Method void zzaop.zza(zzaoo, zzaom)>
		obj;
	//   33   61:aload_1         
		JVM INSTR monitorexit ;
	//   34   62:monitorexit     
		return;
	//   35   63:return          
		exception;
	//   36   64:astore_2        
		obj;
	//   37   65:aload_1         
		JVM INSTR monitorexit ;
	//   38   66:monitorexit     
		throw exception;
	//   39   67:aload_2         
	//   40   68:athrow          
	}

	private final Object mLock = new Object();
	private final zzvw zzbqq;
	private boolean zzbqr;
}
