// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.location.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzasg, zzabh

static class zzasg$zza extends com.google.android.gms.location.zzj.zza
{

	public void onLocationAvailability(LocationAvailability locationavailability)
	{
		zzaDf.zza(new zzabh.zzc(locationavailability) {

			public void zza(LocationCallback locationcallback)
			{
				locationcallback.onLocationAvailability(zzbkI);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #21  <Field LocationAvailability zzbkI>
			//    3    5:invokevirtual   #29  <Method void LocationCallback.onLocationAvailability(LocationAvailability)>
			//    4    8:return          
			}

			public void zzs(Object obj)
			{
				zza((LocationCallback)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #28  <Class LocationCallback>
			//    3    5:invokevirtual   #33  <Method void zza(LocationCallback)>
			//    4    8:return          
			}

			public void zzwc()
			{
			//    0    0:return          
			}

			final LocationAvailability zzbkI;

			
			{
				zzbkI = locationavailability;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #21  <Field LocationAvailability zzbkI>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #24  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzabh zzaDf>
	//    2    4:new             #11  <Class zzasg$zza$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #29  <Method void zzasg$zza$2(zzasg$zza, LocationAvailability)>
	//    7   13:invokevirtual   #34  <Method void zzabh.zza(zzabh$zzc)>
	//    8   16:return          
	}

	public void onLocationResult(LocationResult locationresult)
	{
		zzaDf.zza(new zzabh.zzc(locationresult) {

			public void zza(LocationCallback locationcallback)
			{
				locationcallback.onLocationResult(zzbkH);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #21  <Field LocationResult zzbkH>
			//    3    5:invokevirtual   #29  <Method void LocationCallback.onLocationResult(LocationResult)>
			//    4    8:return          
			}

			public void zzs(Object obj)
			{
				zza((LocationCallback)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #28  <Class LocationCallback>
			//    3    5:invokevirtual   #33  <Method void zza(LocationCallback)>
			//    4    8:return          
			}

			public void zzwc()
			{
			//    0    0:return          
			}

			final LocationResult zzbkH;

			
			{
				zzbkH = locationresult;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #21  <Field LocationResult zzbkH>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #24  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzabh zzaDf>
	//    2    4:new             #9   <Class zzasg$zza$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #39  <Method void zzasg$zza$1(zzasg$zza, LocationResult)>
	//    7   13:invokevirtual   #34  <Method void zzabh.zza(zzabh$zzc)>
	//    8   16:return          
	}

	public void release()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzaDf.clear();
	//    2    2:aload_0         
	//    3    3:getfield        #21  <Field zzabh zzaDf>
	//    4    6:invokevirtual   #43  <Method void zzabh.clear()>
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

	zzasg$zza(zzabh zzabh1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void com.google.android.gms.location.zzj$zza()>
		zzaDf = zzabh1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field zzabh zzaDf>
	//    5    9:return          
	}
}
