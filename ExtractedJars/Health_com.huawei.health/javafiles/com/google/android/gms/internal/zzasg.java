// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.location.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzabh, zzaso, zzase, zzask, 
//			zzasi, zzasc

public class zzasg
{
	static class zza extends com.google.android.gms.location.zzj.zza
	{

		public void onLocationAvailability(LocationAvailability locationavailability)
		{
			zzaDf.zza(new zzabh.zzc(this, locationavailability) {

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
			zzaDf.zza(new zzabh.zzc(this, locationresult) {

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

		zza(zzabh zzabh1)
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

	static class zzb extends com.google.android.gms.location.zzk.zza
	{

		public void onLocationChanged(Location location)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			zzaDf.zza(new zzabh.zzc(this, location) {

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

		zzb(zzabh zzabh1)
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


	public zzasg(Context context, zzaso zzaso1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		zzbkE = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #37  <Field ContentProviderClient zzbkE>
		zzbkF = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #39  <Field boolean zzbkF>
	//    8   14:aload_0         
	//    9   15:new             #41  <Class HashMap>
	//   10   18:dup             
	//   11   19:invokespecial   #42  <Method void HashMap()>
	//   12   22:putfield        #44  <Field Map zzaWg>
	//   13   25:aload_0         
	//   14   26:new             #41  <Class HashMap>
	//   15   29:dup             
	//   16   30:invokespecial   #42  <Method void HashMap()>
	//   17   33:putfield        #46  <Field Map zzbkG>
		mContext = context;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:putfield        #48  <Field Context mContext>
		zzbkt = zzaso1;
	//   21   41:aload_0         
	//   22   42:aload_2         
	//   23   43:putfield        #50  <Field zzaso zzbkt>
	//   24   46:return          
	}

	private zzb zzf(zzabh zzabh1)
	{
		Map map = zzaWg;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Map zzaWg>
	//    2    4:astore          4
		map;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		zzb zzb2 = (zzb)zzaWg.get(((Object) (zzabh1.zzwW())));
	//    5    9:aload_0         
	//    6   10:getfield        #44  <Field Map zzaWg>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #61  <Method zzabh$zzb zzabh.zzwW()>
	//    9   17:invokeinterface #67  <Method Object Map.get(Object)>
	//   10   22:checkcast       #13  <Class zzasg$zzb>
	//   11   25:astore_3        
		zzb zzb1;
		zzb1 = zzb2;
	//   12   26:aload_3         
	//   13   27:astore_2        
		if(zzb2 != null)
			break MISSING_BLOCK_LABEL_41;
	//   14   28:aload_3         
	//   15   29:ifnonnull       41
		zzb1 = new zzb(zzabh1);
	//   16   32:new             #13  <Class zzasg$zzb>
	//   17   35:dup             
	//   18   36:aload_1         
	//   19   37:invokespecial   #70  <Method void zzasg$zzb(zzabh)>
	//   20   40:astore_2        
		zzaWg.put(((Object) (zzabh1.zzwW())), ((Object) (zzb1)));
	//   21   41:aload_0         
	//   22   42:getfield        #44  <Field Map zzaWg>
	//   23   45:aload_1         
	//   24   46:invokevirtual   #61  <Method zzabh$zzb zzabh.zzwW()>
	//   25   49:aload_2         
	//   26   50:invokeinterface #74  <Method Object Map.put(Object, Object)>
	//   27   55:pop             
		map;
	//   28   56:aload           4
		JVM INSTR monitorexit ;
	//   29   58:monitorexit     
		return zzb1;
	//   30   59:aload_2         
	//   31   60:areturn         
		zzabh1;
	//   32   61:astore_1        
	//*  33   62:aload           4
		throw zzabh1;
	//   34   64:monitorexit     
	//   35   65:aload_1         
	//   36   66:athrow          
	}

	private zza zzg(zzabh zzabh1)
	{
		Map map = zzbkG;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Map zzbkG>
	//    2    4:astore          4
		map;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		zza zza2 = (zza)zzbkG.get(((Object) (zzabh1.zzwW())));
	//    5    9:aload_0         
	//    6   10:getfield        #46  <Field Map zzbkG>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #61  <Method zzabh$zzb zzabh.zzwW()>
	//    9   17:invokeinterface #67  <Method Object Map.get(Object)>
	//   10   22:checkcast       #6   <Class zzasg$zza>
	//   11   25:astore_3        
		zza zza1;
		zza1 = zza2;
	//   12   26:aload_3         
	//   13   27:astore_2        
		if(zza2 != null)
			break MISSING_BLOCK_LABEL_41;
	//   14   28:aload_3         
	//   15   29:ifnonnull       41
		zza1 = new zza(zzabh1);
	//   16   32:new             #6   <Class zzasg$zza>
	//   17   35:dup             
	//   18   36:aload_1         
	//   19   37:invokespecial   #78  <Method void zzasg$zza(zzabh)>
	//   20   40:astore_2        
		zzbkG.put(((Object) (zzabh1.zzwW())), ((Object) (zza1)));
	//   21   41:aload_0         
	//   22   42:getfield        #46  <Field Map zzbkG>
	//   23   45:aload_1         
	//   24   46:invokevirtual   #61  <Method zzabh$zzb zzabh.zzwW()>
	//   25   49:aload_2         
	//   26   50:invokeinterface #74  <Method Object Map.put(Object, Object)>
	//   27   55:pop             
		map;
	//   28   56:aload           4
		JVM INSTR monitorexit ;
	//   29   58:monitorexit     
		return zza1;
	//   30   59:aload_2         
	//   31   60:areturn         
		zzabh1;
	//   32   61:astore_1        
	//*  33   62:aload           4
		throw zzabh1;
	//   34   64:monitorexit     
	//   35   65:aload_1         
	//   36   66:athrow          
	}

	public Location getLastLocation()
	{
		zzbkt.zzxC();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzaso zzbkt>
	//    2    4:invokeinterface #88  <Method void zzaso.zzxC()>
		Location location;
		try
		{
			location = ((zzase)zzbkt.zzxD()).zzeR(mContext.getPackageName());
	//    3    9:aload_0         
	//    4   10:getfield        #50  <Field zzaso zzbkt>
	//    5   13:invokeinterface #92  <Method android.os.IInterface zzaso.zzxD()>
	//    6   18:checkcast       #94  <Class zzase>
	//    7   21:aload_0         
	//    8   22:getfield        #48  <Field Context mContext>
	//    9   25:invokevirtual   #100 <Method String Context.getPackageName()>
	//   10   28:invokeinterface #104 <Method Location zzase.zzeR(String)>
	//   11   33:astore_1        
		}
	//*  12   34:aload_1         
	//*  13   35:areturn         
		catch(RemoteException remoteexception)
	//*  14   36:astore_1        
		{
			throw new IllegalStateException(((Throwable) (remoteexception)));
	//   15   37:new             #106 <Class IllegalStateException>
	//   16   40:dup             
	//   17   41:aload_1         
	//   18   42:invokespecial   #109 <Method void IllegalStateException(Throwable)>
	//   19   45:athrow          
		}
		return location;
	}

	public void removeAllListeners()
	{
		Map map = zzaWg;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Map zzaWg>
	//    2    4:astore_1        
		map;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Iterator iterator = zzaWg.values().iterator();
	//    5    7:aload_0         
	//    6    8:getfield        #44  <Field Map zzaWg>
	//    7   11:invokeinterface #114 <Method Collection Map.values()>
	//    8   16:invokeinterface #120 <Method Iterator Collection.iterator()>
	//    9   21:astore_2        
_L1:
		Object obj;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_70;
	//   10   22:aload_2         
	//   11   23:invokeinterface #126 <Method boolean Iterator.hasNext()>
	//   12   28:ifeq            70
			obj = ((Object) ((zzb)iterator.next()));
	//   13   31:aload_2         
	//   14   32:invokeinterface #130 <Method Object Iterator.next()>
	//   15   37:checkcast       #13  <Class zzasg$zzb>
	//   16   40:astore_3        
		} while(obj == null);
	//   17   41:aload_3         
	//   18   42:ifnull          189
		((zzase)zzbkt.zzxD()).zza(zzask.zza(((com.google.android.gms.location.zzk) (obj)), ((zzasc) (null))));
	//   19   45:aload_0         
	//   20   46:getfield        #50  <Field zzaso zzbkt>
	//   21   49:invokeinterface #92  <Method android.os.IInterface zzaso.zzxD()>
	//   22   54:checkcast       #94  <Class zzase>
	//   23   57:aload_3         
	//   24   58:aconst_null     
	//   25   59:invokestatic    #135 <Method zzask zzask.zza(com.google.android.gms.location.zzk, zzasc)>
	//   26   62:invokeinterface #138 <Method void zzase.zza(zzask)>
		  goto _L1
	//*  27   67:goto            189
		zzaWg.clear();
	//   28   70:aload_0         
	//   29   71:getfield        #44  <Field Map zzaWg>
	//   30   74:invokeinterface #141 <Method void Map.clear()>
		map;
	//   31   79:aload_1         
		JVM INSTR monitorexit ;
	//   32   80:monitorexit     
		  goto _L2
	//*  33   81:goto            89
		Exception exception;
		exception;
	//   34   84:astore_2        
	//*  35   85:aload_1         
		throw exception;
	//   36   86:monitorexit     
	//   37   87:aload_2         
	//   38   88:athrow          
_L2:
		map = zzbkG;
	//   39   89:aload_0         
	//   40   90:getfield        #46  <Field Map zzbkG>
	//   41   93:astore_1        
		map;
	//   42   94:aload_1         
		JVM INSTR monitorenter ;
	//   43   95:monitorenter    
		exception = ((Exception) (zzbkG.values().iterator()));
	//   44   96:aload_0         
	//   45   97:getfield        #46  <Field Map zzbkG>
	//   46  100:invokeinterface #114 <Method Collection Map.values()>
	//   47  105:invokeinterface #120 <Method Iterator Collection.iterator()>
	//   48  110:astore_2        
_L3:
		do
		{
			if(!((Iterator) (exception)).hasNext())
				break MISSING_BLOCK_LABEL_159;
	//   49  111:aload_2         
	//   50  112:invokeinterface #126 <Method boolean Iterator.hasNext()>
	//   51  117:ifeq            159
			obj = ((Object) ((zza)((Iterator) (exception)).next()));
	//   52  120:aload_2         
	//   53  121:invokeinterface #130 <Method Object Iterator.next()>
	//   54  126:checkcast       #6   <Class zzasg$zza>
	//   55  129:astore_3        
		} while(obj == null);
	//   56  130:aload_3         
	//   57  131:ifnull          192
		((zzase)zzbkt.zzxD()).zza(zzask.zza(((com.google.android.gms.location.zzj) (obj)), ((zzasc) (null))));
	//   58  134:aload_0         
	//   59  135:getfield        #50  <Field zzaso zzbkt>
	//   60  138:invokeinterface #92  <Method android.os.IInterface zzaso.zzxD()>
	//   61  143:checkcast       #94  <Class zzase>
	//   62  146:aload_3         
	//   63  147:aconst_null     
	//   64  148:invokestatic    #144 <Method zzask zzask.zza(com.google.android.gms.location.zzj, zzasc)>
	//   65  151:invokeinterface #138 <Method void zzase.zza(zzask)>
		  goto _L3
	//*  66  156:goto            192
		zzbkG.clear();
	//   67  159:aload_0         
	//   68  160:getfield        #46  <Field Map zzbkG>
	//   69  163:invokeinterface #141 <Method void Map.clear()>
		map;
	//   70  168:aload_1         
		JVM INSTR monitorexit ;
	//   71  169:monitorexit     
		  goto _L4
	//*  72  170:goto            178
		exception;
	//   73  173:astore_2        
	//*  74  174:aload_1         
		throw exception;
	//   75  175:monitorexit     
	//   76  176:aload_2         
	//   77  177:athrow          
_L4:
		return;
	//   78  178:return          
		RemoteException remoteexception;
		remoteexception;
	//   79  179:astore_1        
		throw new IllegalStateException(((Throwable) (remoteexception)));
	//   80  180:new             #106 <Class IllegalStateException>
	//   81  183:dup             
	//   82  184:aload_1         
	//   83  185:invokespecial   #109 <Method void IllegalStateException(Throwable)>
	//   84  188:athrow          
	//*  85  189:goto            22
	//*  86  192:goto            111
	}

	public LocationAvailability zzIp()
	{
		zzbkt.zzxC();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzaso zzbkt>
	//    2    4:invokeinterface #88  <Method void zzaso.zzxC()>
		LocationAvailability locationavailability;
		try
		{
			locationavailability = ((zzase)zzbkt.zzxD()).zzeS(mContext.getPackageName());
	//    3    9:aload_0         
	//    4   10:getfield        #50  <Field zzaso zzbkt>
	//    5   13:invokeinterface #92  <Method android.os.IInterface zzaso.zzxD()>
	//    6   18:checkcast       #94  <Class zzase>
	//    7   21:aload_0         
	//    8   22:getfield        #48  <Field Context mContext>
	//    9   25:invokevirtual   #100 <Method String Context.getPackageName()>
	//   10   28:invokeinterface #150 <Method LocationAvailability zzase.zzeS(String)>
	//   11   33:astore_1        
		}
	//*  12   34:aload_1         
	//*  13   35:areturn         
		catch(RemoteException remoteexception)
	//*  14   36:astore_1        
		{
			throw new IllegalStateException(((Throwable) (remoteexception)));
	//   15   37:new             #106 <Class IllegalStateException>
	//   16   40:dup             
	//   17   41:aload_1         
	//   18   42:invokespecial   #109 <Method void IllegalStateException(Throwable)>
	//   19   45:athrow          
		}
		return locationavailability;
	}

	public void zzIq()
	{
		if(zzbkF)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field boolean zzbkF>
	//*   2    4:ifeq            23
			try
			{
				zzaH(false);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #155 <Method void zzaH(boolean)>
				return;
	//    6   12:return          
			}
			catch(RemoteException remoteexception)
	//*   7   13:astore_1        
			{
				throw new IllegalStateException(((Throwable) (remoteexception)));
	//    8   14:new             #106 <Class IllegalStateException>
	//    9   17:dup             
	//   10   18:aload_1         
	//   11   19:invokespecial   #109 <Method void IllegalStateException(Throwable)>
	//   12   22:athrow          
			}
		else
			return;
	//   13   23:return          
	}

	public void zza(PendingIntent pendingintent, zzasc zzasc)
		throws RemoteException
	{
		zzbkt.zzxC();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzaso zzbkt>
	//    2    4:invokeinterface #88  <Method void zzaso.zzxC()>
		((zzase)zzbkt.zzxD()).zza(zzask.zzb(pendingintent, zzasc));
	//    3    9:aload_0         
	//    4   10:getfield        #50  <Field zzaso zzbkt>
	//    5   13:invokeinterface #92  <Method android.os.IInterface zzaso.zzxD()>
	//    6   18:checkcast       #94  <Class zzase>
	//    7   21:aload_1         
	//    8   22:aload_2         
	//    9   23:invokestatic    #159 <Method zzask zzask.zzb(PendingIntent, zzasc)>
	//   10   26:invokeinterface #138 <Method void zzase.zza(zzask)>
	//   11   31:return          
	}

	public void zza(zzabh.zzb zzb1, zzasc zzasc)
		throws RemoteException
	{
		zzbkt.zzxC();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzaso zzbkt>
	//    2    4:invokeinterface #88  <Method void zzaso.zzxC()>
		zzac.zzb(((Object) (zzb1)), "Invalid null listener key");
	//    3    9:aload_1         
	//    4   10:ldc1            #163 <String "Invalid null listener key">
	//    5   12:invokestatic    #167 <Method Object zzac.zzb(Object, Object)>
	//    6   15:pop             
		Map map = zzaWg;
	//    7   16:aload_0         
	//    8   17:getfield        #44  <Field Map zzaWg>
	//    9   20:astore_3        
		map;
	//   10   21:aload_3         
		JVM INSTR monitorenter ;
	//   11   22:monitorenter    
		zzb1 = ((zzabh.zzb) ((zzb)zzaWg.remove(((Object) (zzb1)))));
	//   12   23:aload_0         
	//   13   24:getfield        #44  <Field Map zzaWg>
	//   14   27:aload_1         
	//   15   28:invokeinterface #170 <Method Object Map.remove(Object)>
	//   16   33:checkcast       #13  <Class zzasg$zzb>
	//   17   36:astore_1        
		if(zzb1 == null)
			break MISSING_BLOCK_LABEL_67;
	//   18   37:aload_1         
	//   19   38:ifnull          67
		((zzb) (zzb1)).release();
	//   20   41:aload_1         
	//   21   42:invokevirtual   #173 <Method void zzasg$zzb.release()>
		((zzase)zzbkt.zzxD()).zza(zzask.zza(((com.google.android.gms.location.zzk) (zzb1)), zzasc));
	//   22   45:aload_0         
	//   23   46:getfield        #50  <Field zzaso zzbkt>
	//   24   49:invokeinterface #92  <Method android.os.IInterface zzaso.zzxD()>
	//   25   54:checkcast       #94  <Class zzase>
	//   26   57:aload_1         
	//   27   58:aload_2         
	//   28   59:invokestatic    #135 <Method zzask zzask.zza(com.google.android.gms.location.zzk, zzasc)>
	//   29   62:invokeinterface #138 <Method void zzase.zza(zzask)>
		map;
	//   30   67:aload_3         
		JVM INSTR monitorexit ;
	//   31   68:monitorexit     
		return;
	//   32   69:return          
		zzb1;
	//   33   70:astore_1        
	//*  34   71:aload_3         
		throw zzb1;
	//   35   72:monitorexit     
	//   36   73:aload_1         
	//   37   74:athrow          
	}

	public void zza(zzasc zzasc)
		throws RemoteException
	{
		zzbkt.zzxC();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzaso zzbkt>
	//    2    4:invokeinterface #88  <Method void zzaso.zzxC()>
		((zzase)zzbkt.zzxD()).zza(zzasc);
	//    3    9:aload_0         
	//    4   10:getfield        #50  <Field zzaso zzbkt>
	//    5   13:invokeinterface #92  <Method android.os.IInterface zzaso.zzxD()>
	//    6   18:checkcast       #94  <Class zzase>
	//    7   21:aload_1         
	//    8   22:invokeinterface #177 <Method void zzase.zza(zzasc)>
	//    9   27:return          
	}

	public void zza(zzasi zzasi1, zzabh zzabh1, zzasc zzasc)
		throws RemoteException
	{
		zzbkt.zzxC();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzaso zzbkt>
	//    2    4:invokeinterface #88  <Method void zzaso.zzxC()>
		zzabh1 = ((zzabh) (zzg(zzabh1)));
	//    3    9:aload_0         
	//    4   10:aload_2         
	//    5   11:invokespecial   #180 <Method zzasg$zza zzg(zzabh)>
	//    6   14:astore_2        
		((zzase)zzbkt.zzxD()).zza(zzask.zza(zzasi1, ((com.google.android.gms.location.zzj) (zzabh1)), zzasc));
	//    7   15:aload_0         
	//    8   16:getfield        #50  <Field zzaso zzbkt>
	//    9   19:invokeinterface #92  <Method android.os.IInterface zzaso.zzxD()>
	//   10   24:checkcast       #94  <Class zzase>
	//   11   27:aload_1         
	//   12   28:aload_2         
	//   13   29:aload_3         
	//   14   30:invokestatic    #183 <Method zzask zzask.zza(zzasi, com.google.android.gms.location.zzj, zzasc)>
	//   15   33:invokeinterface #138 <Method void zzase.zza(zzask)>
	//   16   38:return          
	}

	public void zza(LocationRequest locationrequest, PendingIntent pendingintent, zzasc zzasc)
		throws RemoteException
	{
		zzbkt.zzxC();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzaso zzbkt>
	//    2    4:invokeinterface #88  <Method void zzaso.zzxC()>
		((zzase)zzbkt.zzxD()).zza(zzask.zza(zzasi.zzb(locationrequest), pendingintent, zzasc));
	//    3    9:aload_0         
	//    4   10:getfield        #50  <Field zzaso zzbkt>
	//    5   13:invokeinterface #92  <Method android.os.IInterface zzaso.zzxD()>
	//    6   18:checkcast       #94  <Class zzase>
	//    7   21:aload_1         
	//    8   22:invokestatic    #190 <Method zzasi zzasi.zzb(LocationRequest)>
	//    9   25:aload_2         
	//   10   26:aload_3         
	//   11   27:invokestatic    #193 <Method zzask zzask.zza(zzasi, PendingIntent, zzasc)>
	//   12   30:invokeinterface #138 <Method void zzase.zza(zzask)>
	//   13   35:return          
	}

	public void zza(LocationRequest locationrequest, zzabh zzabh1, zzasc zzasc)
		throws RemoteException
	{
		zzbkt.zzxC();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzaso zzbkt>
	//    2    4:invokeinterface #88  <Method void zzaso.zzxC()>
		zzabh1 = ((zzabh) (zzf(zzabh1)));
	//    3    9:aload_0         
	//    4   10:aload_2         
	//    5   11:invokespecial   #196 <Method zzasg$zzb zzf(zzabh)>
	//    6   14:astore_2        
		((zzase)zzbkt.zzxD()).zza(zzask.zza(zzasi.zzb(locationrequest), ((com.google.android.gms.location.zzk) (zzabh1)), zzasc));
	//    7   15:aload_0         
	//    8   16:getfield        #50  <Field zzaso zzbkt>
	//    9   19:invokeinterface #92  <Method android.os.IInterface zzaso.zzxD()>
	//   10   24:checkcast       #94  <Class zzase>
	//   11   27:aload_1         
	//   12   28:invokestatic    #190 <Method zzasi zzasi.zzb(LocationRequest)>
	//   13   31:aload_2         
	//   14   32:aload_3         
	//   15   33:invokestatic    #199 <Method zzask zzask.zza(zzasi, com.google.android.gms.location.zzk, zzasc)>
	//   16   36:invokeinterface #138 <Method void zzase.zza(zzask)>
	//   17   41:return          
	}

	public void zzaH(boolean flag)
		throws RemoteException
	{
		zzbkt.zzxC();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzaso zzbkt>
	//    2    4:invokeinterface #88  <Method void zzaso.zzxC()>
		((zzase)zzbkt.zzxD()).zzaH(flag);
	//    3    9:aload_0         
	//    4   10:getfield        #50  <Field zzaso zzbkt>
	//    5   13:invokeinterface #92  <Method android.os.IInterface zzaso.zzxD()>
	//    6   18:checkcast       #94  <Class zzase>
	//    7   21:iload_1         
	//    8   22:invokeinterface #201 <Method void zzase.zzaH(boolean)>
		zzbkF = flag;
	//    9   27:aload_0         
	//   10   28:iload_1         
	//   11   29:putfield        #39  <Field boolean zzbkF>
	//   12   32:return          
	}

	public void zzb(zzabh.zzb zzb1, zzasc zzasc)
		throws RemoteException
	{
		zzbkt.zzxC();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzaso zzbkt>
	//    2    4:invokeinterface #88  <Method void zzaso.zzxC()>
		zzac.zzb(((Object) (zzb1)), "Invalid null listener key");
	//    3    9:aload_1         
	//    4   10:ldc1            #163 <String "Invalid null listener key">
	//    5   12:invokestatic    #167 <Method Object zzac.zzb(Object, Object)>
	//    6   15:pop             
		Map map = zzbkG;
	//    7   16:aload_0         
	//    8   17:getfield        #46  <Field Map zzbkG>
	//    9   20:astore_3        
		map;
	//   10   21:aload_3         
		JVM INSTR monitorenter ;
	//   11   22:monitorenter    
		zzb1 = ((zzabh.zzb) ((zza)zzbkG.remove(((Object) (zzb1)))));
	//   12   23:aload_0         
	//   13   24:getfield        #46  <Field Map zzbkG>
	//   14   27:aload_1         
	//   15   28:invokeinterface #170 <Method Object Map.remove(Object)>
	//   16   33:checkcast       #6   <Class zzasg$zza>
	//   17   36:astore_1        
		if(zzb1 == null)
			break MISSING_BLOCK_LABEL_67;
	//   18   37:aload_1         
	//   19   38:ifnull          67
		((zza) (zzb1)).release();
	//   20   41:aload_1         
	//   21   42:invokevirtual   #202 <Method void zzasg$zza.release()>
		((zzase)zzbkt.zzxD()).zza(zzask.zza(((com.google.android.gms.location.zzj) (zzb1)), zzasc));
	//   22   45:aload_0         
	//   23   46:getfield        #50  <Field zzaso zzbkt>
	//   24   49:invokeinterface #92  <Method android.os.IInterface zzaso.zzxD()>
	//   25   54:checkcast       #94  <Class zzase>
	//   26   57:aload_1         
	//   27   58:aload_2         
	//   28   59:invokestatic    #144 <Method zzask zzask.zza(com.google.android.gms.location.zzj, zzasc)>
	//   29   62:invokeinterface #138 <Method void zzase.zza(zzask)>
		map;
	//   30   67:aload_3         
		JVM INSTR monitorexit ;
	//   31   68:monitorexit     
		return;
	//   32   69:return          
		zzb1;
	//   33   70:astore_1        
	//*  34   71:aload_3         
		throw zzb1;
	//   35   72:monitorexit     
	//   36   73:aload_1         
	//   37   74:athrow          
	}

	public void zzd(Location location)
		throws RemoteException
	{
		zzbkt.zzxC();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzaso zzbkt>
	//    2    4:invokeinterface #88  <Method void zzaso.zzxC()>
		((zzase)zzbkt.zzxD()).zzd(location);
	//    3    9:aload_0         
	//    4   10:getfield        #50  <Field zzaso zzbkt>
	//    5   13:invokeinterface #92  <Method android.os.IInterface zzaso.zzxD()>
	//    6   18:checkcast       #94  <Class zzase>
	//    7   21:aload_1         
	//    8   22:invokeinterface #207 <Method void zzase.zzd(Location)>
	//    9   27:return          
	}

	private final Context mContext;
	private final Map zzaWg = new HashMap();
	private ContentProviderClient zzbkE;
	private boolean zzbkF;
	private final Map zzbkG = new HashMap();
	private final zzaso zzbkt;
}
