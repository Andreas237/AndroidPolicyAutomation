// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.location.LocationListener;

// Referenced classes of package com.google.android.gms.internal:
//			zzasg, zzabh

static class zzasg$zzb extends com.google.android.gms.location.zzk.zza
{

	public void onLocationChanged(Location location)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzaDf.zza(new zzabh.zzc(location) {

			public void zza(LocationListener locationlistener)
			{
				locationlistener.onLocationChanged(zzbkJ);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #21  <Field Location zzbkJ>
			//    3    5:invokeinterface #30  <Method void LocationListener.onLocationChanged(Location)>
			//    4   10:return          
			}

			public void zzs(Object obj)
			{
				zza((LocationListener)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #29  <Class LocationListener>
			//    3    5:invokevirtual   #34  <Method void zza(LocationListener)>
			//    4    8:return          
			}

			public void zzwc()
			{
			//    0    0:return          
			}

			final Location zzbkJ;

			
			{
				zzbkJ = location;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #21  <Field Location zzbkJ>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #24  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    2    2:aload_0         
	//    3    3:getfield        #19  <Field zzabh zzaDf>
	//    4    6:new             #9   <Class zzasg$zzb$1>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #27  <Method void zzasg$zzb$1(zzasg$zzb, Location)>
	//    9   15:invokevirtual   #33  <Method void zzabh.zza(zzabh$zzc)>
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

	public void release()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzaDf.clear();
	//    2    2:aload_0         
	//    3    3:getfield        #19  <Field zzabh zzaDf>
	//    4    6:invokevirtual   #37  <Method void zzabh.clear()>
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

	private final zzabh zzaDf;

	zzasg$zzb(zzabh zzabh1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void com.google.android.gms.location.zzk$zza()>
		zzaDf = zzabh1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field zzabh zzaDf>
	//    5    9:return          
	}
}
