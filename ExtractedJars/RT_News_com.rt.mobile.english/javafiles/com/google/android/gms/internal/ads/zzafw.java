// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaft, zzaoj, zzafz

final class zzafw
	implements zzv
{

	zzafw(zzaft zzaft1)
	{
		zzchv = zzaft1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzaft zzchv>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final void zza(Object obj, Map map)
	{
label0:
		{
			synchronized(zzaft.zza(zzchv))
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field zzaft zzchv>
	//*   2    4:invokestatic    #24  <Method Object zzaft.zza(zzaft)>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
			{
				if(!zzaft.zzb(zzchv).isDone())
					break label0;
	//    6   10:aload_0         
	//    7   11:getfield        #13  <Field zzaft zzchv>
	//    8   14:invokestatic    #28  <Method zzaoj zzaft.zzb(zzaft)>
	//    9   17:invokevirtual   #34  <Method boolean zzaoj.isDone()>
	//   10   20:ifeq            26
			}
	//   11   23:aload_1         
	//   12   24:monitorexit     
			return;
	//   13   25:return          
		}
		map = ((Map) (new zzafz(-2, map)));
	//   14   26:new             #36  <Class zzafz>
	//   15   29:dup             
	//   16   30:bipush          -2
	//   17   32:aload_2         
	//   18   33:invokespecial   #39  <Method void zzafz(int, Map)>
	//   19   36:astore_2        
		if(zzaft.zzc(zzchv).equals(((Object) (((zzafz) (map)).zzol()))))
			break MISSING_BLOCK_LABEL_57;
	//   20   37:aload_0         
	//   21   38:getfield        #13  <Field zzaft zzchv>
	//   22   41:invokestatic    #43  <Method String zzaft.zzc(zzaft)>
	//   23   44:aload_2         
	//   24   45:invokevirtual   #47  <Method String zzafz.zzol()>
	//   25   48:invokevirtual   #53  <Method boolean String.equals(Object)>
	//   26   51:ifne            57
		obj;
	//   27   54:aload_1         
		JVM INSTR monitorexit ;
	//   28   55:monitorexit     
		return;
	//   29   56:return          
		zzaft.zzb(zzchv).set(((Object) (map)));
	//   30   57:aload_0         
	//   31   58:getfield        #13  <Field zzaft zzchv>
	//   32   61:invokestatic    #28  <Method zzaoj zzaft.zzb(zzaft)>
	//   33   64:aload_2         
	//   34   65:invokevirtual   #57  <Method void zzaoj.set(Object)>
		obj;
	//   35   68:aload_1         
		JVM INSTR monitorexit ;
	//   36   69:monitorexit     
		return;
	//   37   70:return          
		map;
	//   38   71:astore_2        
		obj;
	//   39   72:aload_1         
		JVM INSTR monitorexit ;
	//   40   73:monitorexit     
		throw map;
	//   41   74:aload_2         
	//   42   75:athrow          
	}

	private final zzaft zzchv;
}
