// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.stats.zza;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzo

private final class zzo$zzb
{
	public class zza
		implements ServiceConnection
	{

		public void onServiceConnected(ComponentName componentname, IBinder ibinder)
		{
			java.util.HashMap hashmap = com.google.android.gms.common.internal.zzo.zza(zzaEP.zzaEO);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field zzo$zzb zzaEP>
		//    2    4:getfield        #28  <Field zzo zzo$zzb.zzaEO>
		//    3    7:invokestatic    #31  <Method java.util.HashMap com.google.android.gms.common.internal.zzo.zza(zzo)>
		//    4   10:astore_3        
			hashmap;
		//    5   11:aload_3         
			JVM INSTR monitorenter ;
		//    6   12:monitorenter    
			com.google.android.gms.common.internal.zzo.zzb.zza(zzaEP, ibinder);
		//    7   13:aload_0         
		//    8   14:getfield        #18  <Field zzo$zzb zzaEP>
		//    9   17:aload_2         
		//   10   18:invokestatic    #34  <Method IBinder com.google.android.gms.common.internal.zzo$zzb.zza(zzo$zzb, IBinder)>
		//   11   21:pop             
			com.google.android.gms.common.internal.zzo.zzb.zza(zzaEP, componentname);
		//   12   22:aload_0         
		//   13   23:getfield        #18  <Field zzo$zzb zzaEP>
		//   14   26:aload_1         
		//   15   27:invokestatic    #37  <Method ComponentName com.google.android.gms.common.internal.zzo$zzb.zza(zzo$zzb, ComponentName)>
		//   16   30:pop             
			for(Iterator iterator = com.google.android.gms.common.internal.zzo.zzb.zza(zzaEP).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder));
		//   17   31:aload_0         
		//   18   32:getfield        #18  <Field zzo$zzb zzaEP>
		//   19   35:invokestatic    #40  <Method Set com.google.android.gms.common.internal.zzo$zzb.zza(zzo$zzb)>
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
			com.google.android.gms.common.internal.zzo.zzb.zza(zzaEP, 1);
		//   37   80:aload_0         
		//   38   81:getfield        #18  <Field zzo$zzb zzaEP>
		//   39   84:iconst_1        
		//   40   85:invokestatic    #61  <Method int com.google.android.gms.common.internal.zzo$zzb.zza(zzo$zzb, int)>
		//   41   88:pop             
			hashmap;
		//   42   89:aload_3         
			JVM INSTR monitorexit ;
		//   43   90:monitorexit     
		//   44   91:return          
		}

		public void onServiceDisconnected(ComponentName componentname)
		{
			java.util.HashMap hashmap = com.google.android.gms.common.internal.zzo.zza(zzaEP.zzaEO);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field zzo$zzb zzaEP>
		//    2    4:getfield        #28  <Field zzo zzo$zzb.zzaEO>
		//    3    7:invokestatic    #31  <Method java.util.HashMap com.google.android.gms.common.internal.zzo.zza(zzo)>
		//    4   10:astore_2        
			hashmap;
		//    5   11:aload_2         
			JVM INSTR monitorenter ;
		//    6   12:monitorenter    
			com.google.android.gms.common.internal.zzo.zzb.zza(zzaEP, ((IBinder) (null)));
		//    7   13:aload_0         
		//    8   14:getfield        #18  <Field zzo$zzb zzaEP>
		//    9   17:aconst_null     
		//   10   18:invokestatic    #34  <Method IBinder com.google.android.gms.common.internal.zzo$zzb.zza(zzo$zzb, IBinder)>
		//   11   21:pop             
			com.google.android.gms.common.internal.zzo.zzb.zza(zzaEP, componentname);
		//   12   22:aload_0         
		//   13   23:getfield        #18  <Field zzo$zzb zzaEP>
		//   14   26:aload_1         
		//   15   27:invokestatic    #37  <Method ComponentName com.google.android.gms.common.internal.zzo$zzb.zza(zzo$zzb, ComponentName)>
		//   16   30:pop             
			for(Iterator iterator = com.google.android.gms.common.internal.zzo.zzb.zza(zzaEP).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname));
		//   17   31:aload_0         
		//   18   32:getfield        #18  <Field zzo$zzb zzaEP>
		//   19   35:invokestatic    #40  <Method Set com.google.android.gms.common.internal.zzo$zzb.zza(zzo$zzb)>
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
			com.google.android.gms.common.internal.zzo.zzb.zza(zzaEP, 2);
		//   36   76:aload_0         
		//   37   77:getfield        #18  <Field zzo$zzb zzaEP>
		//   38   80:iconst_2        
		//   39   81:invokestatic    #61  <Method int com.google.android.gms.common.internal.zzo$zzb.zza(zzo$zzb, int)>
		//   40   84:pop             
			hashmap;
		//   41   85:aload_2         
			JVM INSTR monitorexit ;
		//   42   86:monitorexit     
		//   43   87:return          
		}

		final zzo.zzb zzaEP;

		public zza()
		{
			zzaEP = zzo.zzb.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field zzo$zzb zzaEP>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
		//    5    9:return          
		}
	}


	static int zza(zzo$zzb zzo$zzb1, int i)
	{
		zzo$zzb1.mState = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #48  <Field int mState>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static ComponentName zza(zzo$zzb zzo$zzb1, ComponentName componentname)
	{
		zzo$zzb1.zzaEJ = componentname;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #53  <Field ComponentName zzaEJ>
		return componentname;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static IBinder zza(zzo$zzb zzo$zzb1, IBinder ibinder)
	{
		zzo$zzb1.zzaEa = ibinder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field IBinder zzaEa>
		return ibinder;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Set zza(zzo$zzb zzo$zzb1)
	{
		return zzo$zzb1.zzaEL;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Set zzaEL>
	//    2    4:areturn         
	}

	public IBinder getBinder()
	{
		return zzaEa;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field IBinder zzaEa>
	//    2    4:areturn         
	}

	public ComponentName getComponentName()
	{
		return zzaEJ;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ComponentName zzaEJ>
	//    2    4:areturn         
	}

	public int getState()
	{
		return mState;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int mState>
	//    2    4:ireturn         
	}

	public boolean isBound()
	{
		return zzaEM;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field boolean zzaEM>
	//    2    4:ireturn         
	}

	public void zza(ServiceConnection serviceconnection, String s)
	{
		zzo.zzc(zzaEO).zza(zzo.zzb(zzaEO), serviceconnection, s, zzaEN.zzxs());
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzo zzaEO>
	//    2    4:invokestatic    #72  <Method zza zzo.zzc(zzo)>
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field zzo zzaEO>
	//    5   11:invokestatic    #75  <Method android.content.Context zzo.zzb(zzo)>
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:aload_0         
	//    9   17:getfield        #36  <Field zzo$zza zzaEN>
	//   10   20:invokevirtual   #81  <Method android.content.Intent zzo$zza.zzxs()>
	//   11   23:invokevirtual   #86  <Method void zza.zza(android.content.Context, ServiceConnection, String, android.content.Intent)>
		zzaEL.add(((Object) (serviceconnection)));
	//   12   26:aload_0         
	//   13   27:getfield        #46  <Field Set zzaEL>
	//   14   30:aload_1         
	//   15   31:invokeinterface #92  <Method boolean Set.add(Object)>
	//   16   36:pop             
	//   17   37:return          
	}

	public boolean zza(ServiceConnection serviceconnection)
	{
		return zzaEL.contains(((Object) (serviceconnection)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Set zzaEL>
	//    2    4:aload_1         
	//    3    5:invokeinterface #96  <Method boolean Set.contains(Object)>
	//    4   10:ireturn         
	}

	public void zzb(ServiceConnection serviceconnection, String s)
	{
		zzo.zzc(zzaEO).zzb(zzo.zzb(zzaEO), serviceconnection);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzo zzaEO>
	//    2    4:invokestatic    #72  <Method zza zzo.zzc(zzo)>
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field zzo zzaEO>
	//    5   11:invokestatic    #75  <Method android.content.Context zzo.zzb(zzo)>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #99  <Method void zza.zzb(android.content.Context, ServiceConnection)>
		zzaEL.remove(((Object) (serviceconnection)));
	//    8   18:aload_0         
	//    9   19:getfield        #46  <Field Set zzaEL>
	//   10   22:aload_1         
	//   11   23:invokeinterface #102 <Method boolean Set.remove(Object)>
	//   12   28:pop             
	//   13   29:return          
	}

	public void zzdr(String s)
	{
		mState = 3;
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:putfield        #48  <Field int mState>
		zzaEM = zzo.zzc(zzaEO).zza(zzo.zzb(zzaEO), s, zzaEN.zzxs(), ((ServiceConnection) (zzaEK)), 129);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #31  <Field zzo zzaEO>
	//    6   10:invokestatic    #72  <Method zza zzo.zzc(zzo)>
	//    7   13:aload_0         
	//    8   14:getfield        #31  <Field zzo zzaEO>
	//    9   17:invokestatic    #75  <Method android.content.Context zzo.zzb(zzo)>
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #36  <Field zzo$zza zzaEN>
	//   13   25:invokevirtual   #81  <Method android.content.Intent zzo$zza.zzxs()>
	//   14   28:aload_0         
	//   15   29:getfield        #41  <Field zzo$zzb$zza zzaEK>
	//   16   32:sipush          129
	//   17   35:invokevirtual   #112 <Method boolean zza.zza(android.content.Context, String, android.content.Intent, ServiceConnection, int)>
	//   18   38:putfield        #67  <Field boolean zzaEM>
		if(zzaEM)
			break MISSING_BLOCK_LABEL_74;
	//   19   41:aload_0         
	//   20   42:getfield        #67  <Field boolean zzaEM>
	//   21   45:ifne            74
		mState = 2;
	//   22   48:aload_0         
	//   23   49:iconst_2        
	//   24   50:putfield        #48  <Field int mState>
		zzo.zzc(zzaEO).zza(zzo.zzb(zzaEO), ((ServiceConnection) (zzaEK)));
	//   25   53:aload_0         
	//   26   54:getfield        #31  <Field zzo zzaEO>
	//   27   57:invokestatic    #72  <Method zza zzo.zzc(zzo)>
	//   28   60:aload_0         
	//   29   61:getfield        #31  <Field zzo zzaEO>
	//   30   64:invokestatic    #75  <Method android.content.Context zzo.zzb(zzo)>
	//   31   67:aload_0         
	//   32   68:getfield        #41  <Field zzo$zzb$zza zzaEK>
	//   33   71:invokevirtual   #114 <Method void zza.zza(android.content.Context, ServiceConnection)>
		return;
	//   34   74:return          
		s;
	//   35   75:astore_1        
	//   36   76:return          
	}

	public void zzds(String s)
	{
		zzo.zzc(zzaEO).zza(zzo.zzb(zzaEO), ((ServiceConnection) (zzaEK)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzo zzaEO>
	//    2    4:invokestatic    #72  <Method zza zzo.zzc(zzo)>
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field zzo zzaEO>
	//    5   11:invokestatic    #75  <Method android.content.Context zzo.zzb(zzo)>
	//    6   14:aload_0         
	//    7   15:getfield        #41  <Field zzo$zzb$zza zzaEK>
	//    8   18:invokevirtual   #114 <Method void zza.zza(android.content.Context, ServiceConnection)>
		zzaEM = false;
	//    9   21:aload_0         
	//   10   22:iconst_0        
	//   11   23:putfield        #67  <Field boolean zzaEM>
		mState = 2;
	//   12   26:aload_0         
	//   13   27:iconst_2        
	//   14   28:putfield        #48  <Field int mState>
	//   15   31:return          
	}

	public boolean zzxt()
	{
		return zzaEL.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Set zzaEL>
	//    2    4:invokeinterface #120 <Method boolean Set.isEmpty()>
	//    3    9:ireturn         
	}

	private int mState;
	private ComponentName zzaEJ;
	private final zza zzaEK = new zza();
	private final Set zzaEL = new HashSet();
	private boolean zzaEM;
	private final zzo$zza zzaEN;
	final zzo zzaEO;
	private IBinder zzaEa;

	public zzo$zzb(zzo zzo1, zzo$zza zzo$zza1)
	{
		zzaEO = zzo1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field zzo zzaEO>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #34  <Method void Object()>
		zzaEN = zzo$zza1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #36  <Field zzo$zza zzaEN>
	//    8   14:aload_0         
	//    9   15:new             #9   <Class zzo$zzb$zza>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:invokespecial   #39  <Method void zzo$zzb$zza(zzo$zzb)>
	//   13   23:putfield        #41  <Field zzo$zzb$zza zzaEK>
	//   14   26:aload_0         
	//   15   27:new             #43  <Class HashSet>
	//   16   30:dup             
	//   17   31:invokespecial   #44  <Method void HashSet()>
	//   18   34:putfield        #46  <Field Set zzaEL>
		mState = 2;
	//   19   37:aload_0         
	//   20   38:iconst_2        
	//   21   39:putfield        #48  <Field int mState>
	//   22   42:return          
	}
}
