// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzadk, zzajx

final class zzads
	implements Runnable
{

	zzads(zzadk zzadk1)
	{
		zzccn = zzadk1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzadk zzccn>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
label0:
		{
			synchronized(zzadk.zza(zzccn))
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field zzadk zzccn>
	//*   2    4:invokestatic    #23  <Method Object zzadk.zza(zzadk)>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
			{
				if(zzccn.zzccj != null)
					break label0;
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field zzadk zzccn>
	//    8   14:getfield        #27  <Field zzalc zzadk.zzccj>
	//    9   17:ifnonnull       23
			}
	//   10   20:aload_1         
	//   11   21:monitorexit     
			return;
	//   12   22:return          
		}
		((zzajx) (zzccn)).onStop();
	//   13   23:aload_0         
	//   14   24:getfield        #12  <Field zzadk zzccn>
	//   15   27:invokevirtual   #32  <Method void zzajx.onStop()>
		zzadk.zza(zzccn, 2, "Timed out waiting for ad response.");
	//   16   30:aload_0         
	//   17   31:getfield        #12  <Field zzadk zzccn>
	//   18   34:iconst_2        
	//   19   35:ldc1            #34  <String "Timed out waiting for ad response.">
	//   20   37:invokestatic    #37  <Method void zzadk.zza(zzadk, int, String)>
		obj;
	//   21   40:aload_1         
		JVM INSTR monitorexit ;
	//   22   41:monitorexit     
		return;
	//   23   42:return          
		exception;
	//   24   43:astore_2        
		obj;
	//   25   44:aload_1         
		JVM INSTR monitorexit ;
	//   26   45:monitorexit     
		throw exception;
	//   27   46:aload_2         
	//   28   47:athrow          
	}

	private final zzadk zzccn;
}
