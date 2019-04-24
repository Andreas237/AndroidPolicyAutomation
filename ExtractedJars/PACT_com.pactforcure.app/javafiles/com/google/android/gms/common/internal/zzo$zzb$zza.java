// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzo

public class zzo$zzb$zza
	implements ServiceConnection
{

	public void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		java.util.HashMap hashmap = zzo.zza(zzaEP.zzaEO);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzo$zzb zzaEP>
	//    2    4:getfield        #28  <Field zzo zzo$zzb.zzaEO>
	//    3    7:invokestatic    #31  <Method java.util.HashMap zzo.zza(zzo)>
	//    4   10:astore_3        
		hashmap;
	//    5   11:aload_3         
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		zzo.zzb.zza(zzaEP, ibinder);
	//    7   13:aload_0         
	//    8   14:getfield        #18  <Field zzo$zzb zzaEP>
	//    9   17:aload_2         
	//   10   18:invokestatic    #34  <Method IBinder zzo$zzb.zza(zzo$zzb, IBinder)>
	//   11   21:pop             
		zzo.zzb.zza(zzaEP, componentname);
	//   12   22:aload_0         
	//   13   23:getfield        #18  <Field zzo$zzb zzaEP>
	//   14   26:aload_1         
	//   15   27:invokestatic    #37  <Method ComponentName zzo$zzb.zza(zzo$zzb, ComponentName)>
	//   16   30:pop             
		for(Iterator iterator = zzo.zzb.zza(zzaEP).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder));
	//   17   31:aload_0         
	//   18   32:getfield        #18  <Field zzo$zzb zzaEP>
	//   19   35:invokestatic    #40  <Method Set zzo$zzb.zza(zzo$zzb)>
	//   20   38:invokeinterface #46  <Method Iterator Set.iterator()>
	//   21   43:astore          4
	//   22   45:aload           4
	//   23   47:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//   24   52:ifeq            80
	//   25   55:aload           4
	//   26   57:invokeinterface #56  <Method Object Iterator.next()>
	//   27   62:checkcast       #6   <Class ServiceConnection>
	//   28   65:aload_1         
	//   29   66:aload_2         
	//   30   67:invokeinterface #58  <Method void ServiceConnection.onServiceConnected(ComponentName, IBinder)>
		break MISSING_BLOCK_LABEL_80;
	//   31   72:goto            45
		componentname;
	//   32   75:astore_1        
		hashmap;
	//   33   76:aload_3         
		JVM INSTR monitorexit ;
	//   34   77:monitorexit     
		throw componentname;
	//   35   78:aload_1         
	//   36   79:athrow          
		zzo.zzb.zza(zzaEP, 1);
	//   37   80:aload_0         
	//   38   81:getfield        #18  <Field zzo$zzb zzaEP>
	//   39   84:iconst_1        
	//   40   85:invokestatic    #61  <Method int zzo$zzb.zza(zzo$zzb, int)>
	//   41   88:pop             
		hashmap;
	//   42   89:aload_3         
		JVM INSTR monitorexit ;
	//   43   90:monitorexit     
	//   44   91:return          
	}

	public void onServiceDisconnected(ComponentName componentname)
	{
		java.util.HashMap hashmap = zzo.zza(zzaEP.zzaEO);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzo$zzb zzaEP>
	//    2    4:getfield        #28  <Field zzo zzo$zzb.zzaEO>
	//    3    7:invokestatic    #31  <Method java.util.HashMap zzo.zza(zzo)>
	//    4   10:astore_2        
		hashmap;
	//    5   11:aload_2         
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		zzo.zzb.zza(zzaEP, ((IBinder) (null)));
	//    7   13:aload_0         
	//    8   14:getfield        #18  <Field zzo$zzb zzaEP>
	//    9   17:aconst_null     
	//   10   18:invokestatic    #34  <Method IBinder zzo$zzb.zza(zzo$zzb, IBinder)>
	//   11   21:pop             
		zzo.zzb.zza(zzaEP, componentname);
	//   12   22:aload_0         
	//   13   23:getfield        #18  <Field zzo$zzb zzaEP>
	//   14   26:aload_1         
	//   15   27:invokestatic    #37  <Method ComponentName zzo$zzb.zza(zzo$zzb, ComponentName)>
	//   16   30:pop             
		for(Iterator iterator = zzo.zzb.zza(zzaEP).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname));
	//   17   31:aload_0         
	//   18   32:getfield        #18  <Field zzo$zzb zzaEP>
	//   19   35:invokestatic    #40  <Method Set zzo$zzb.zza(zzo$zzb)>
	//   20   38:invokeinterface #46  <Method Iterator Set.iterator()>
	//   21   43:astore_3        
	//   22   44:aload_3         
	//   23   45:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//   24   50:ifeq            76
	//   25   53:aload_3         
	//   26   54:invokeinterface #56  <Method Object Iterator.next()>
	//   27   59:checkcast       #6   <Class ServiceConnection>
	//   28   62:aload_1         
	//   29   63:invokeinterface #65  <Method void ServiceConnection.onServiceDisconnected(ComponentName)>
		break MISSING_BLOCK_LABEL_76;
	//   30   68:goto            44
		componentname;
	//   31   71:astore_1        
		hashmap;
	//   32   72:aload_2         
		JVM INSTR monitorexit ;
	//   33   73:monitorexit     
		throw componentname;
	//   34   74:aload_1         
	//   35   75:athrow          
		zzo.zzb.zza(zzaEP, 2);
	//   36   76:aload_0         
	//   37   77:getfield        #18  <Field zzo$zzb zzaEP>
	//   38   80:iconst_2        
	//   39   81:invokestatic    #61  <Method int zzo$zzb.zza(zzo$zzb, int)>
	//   40   84:pop             
		hashmap;
	//   41   85:aload_2         
		JVM INSTR monitorexit ;
	//   42   86:monitorexit     
	//   43   87:return          
	}

	final zzo.zzb zzaEP;

	public zzo$zzb$zza(zzo.zzb zzb1)
	{
		zzaEP = zzb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field zzo$zzb zzaEP>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
