// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.zzy;

// Referenced classes of package com.google.android.gms.internal.location:
//			zzay

final class zzax extends zzy
{

	zzax(ListenerHolder listenerholder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzy()>
		zzda = listenerholder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field ListenerHolder zzda>
	//    5    9:return          
	}

	public final void onLocationChanged(Location location)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzda.notifyListener(((com.google.android.gms.common.api.internal.ListenerHolder.Notifier) (new zzay(this, location))));
	//    2    2:aload_0         
	//    3    3:getfield        #14  <Field ListenerHolder zzda>
	//    4    6:new             #21  <Class zzay>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #24  <Method void zzay(zzax, Location)>
	//    9   15:invokevirtual   #30  <Method void ListenerHolder.notifyListener(com.google.android.gms.common.api.internal.ListenerHolder$Notifier)>
		this;
	//   10   18:aload_0         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		location;
	//   13   21:astore_1        
	//*  14   22:aload_0         
		throw location;
	//   15   23:monitorexit     
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	public final void release()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzda.clear();
	//    2    2:aload_0         
	//    3    3:getfield        #14  <Field ListenerHolder zzda>
	//    4    6:invokevirtual   #34  <Method void ListenerHolder.clear()>
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		Exception exception;
		exception;
	//    8   12:astore_1        
	//*   9   13:aload_0         
		throw exception;
	//   10   14:monitorexit     
	//   11   15:aload_1         
	//   12   16:athrow          
	}

	private final ListenerHolder zzda;
}
