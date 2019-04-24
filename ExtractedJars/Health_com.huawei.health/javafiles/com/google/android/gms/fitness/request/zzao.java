// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.request;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.data.DataPoint;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.fitness.request:
//			OnDataPointListener

public class zzao extends com.google.android.gms.fitness.data.zzs.zza
{
	public static class zza
	{

		public static zza zzDa()
		{
			return zzaWf;
		//    0    0:getstatic       #19  <Field zzao$zza zzaWf>
		//    1    3:areturn         
		}

		public zzao zza(OnDataPointListener ondatapointlistener)
		{
			Map map = zzaWg;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Map zzaWg>
		//    2    4:astore          4
			map;
		//    3    6:aload           4
			JVM INSTR monitorenter ;
		//    4    8:monitorenter    
			zzao zzao2 = (zzao)zzaWg.get(((Object) (ondatapointlistener)));
		//    5    9:aload_0         
		//    6   10:getfield        #26  <Field Map zzaWg>
		//    7   13:aload_1         
		//    8   14:invokeinterface #35  <Method Object Map.get(Object)>
		//    9   19:checkcast       #6   <Class zzao>
		//   10   22:astore_3        
			zzao zzao1;
			zzao1 = zzao2;
		//   11   23:aload_3         
		//   12   24:astore_2        
			if(zzao2 != null)
				break MISSING_BLOCK_LABEL_51;
		//   13   25:aload_3         
		//   14   26:ifnonnull       51
			zzao1 = new zzao(ondatapointlistener);
		//   15   29:new             #6   <Class zzao>
		//   16   32:dup             
		//   17   33:aload_1         
		//   18   34:aconst_null     
		//   19   35:invokespecial   #38  <Method void zzao(OnDataPointListener, zzao$1)>
		//   20   38:astore_2        
			zzaWg.put(((Object) (ondatapointlistener)), ((Object) (zzao1)));
		//   21   39:aload_0         
		//   22   40:getfield        #26  <Field Map zzaWg>
		//   23   43:aload_1         
		//   24   44:aload_2         
		//   25   45:invokeinterface #42  <Method Object Map.put(Object, Object)>
		//   26   50:pop             
			map;
		//   27   51:aload           4
			JVM INSTR monitorexit ;
		//   28   53:monitorexit     
			return zzao1;
		//   29   54:aload_2         
		//   30   55:areturn         
			ondatapointlistener;
		//   31   56:astore_1        
		//*  32   57:aload           4
			throw ondatapointlistener;
		//   33   59:monitorexit     
		//   34   60:aload_1         
		//   35   61:athrow          
		}

		public zzao zzb(OnDataPointListener ondatapointlistener)
		{
			Map map = zzaWg;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Map zzaWg>
		//    2    4:astore_2        
			map;
		//    3    5:aload_2         
			JVM INSTR monitorenter ;
		//    4    6:monitorenter    
			ondatapointlistener = ((OnDataPointListener) ((zzao)zzaWg.get(((Object) (ondatapointlistener)))));
		//    5    7:aload_0         
		//    6    8:getfield        #26  <Field Map zzaWg>
		//    7   11:aload_1         
		//    8   12:invokeinterface #35  <Method Object Map.get(Object)>
		//    9   17:checkcast       #6   <Class zzao>
		//   10   20:astore_1        
			map;
		//   11   21:aload_2         
			JVM INSTR monitorexit ;
		//   12   22:monitorexit     
			return ((zzao) (ondatapointlistener));
		//   13   23:aload_1         
		//   14   24:areturn         
			ondatapointlistener;
		//   15   25:astore_1        
		//*  16   26:aload_2         
			throw ondatapointlistener;
		//   17   27:monitorexit     
		//   18   28:aload_1         
		//   19   29:athrow          
		}

		public zzao zzc(OnDataPointListener ondatapointlistener)
		{
			Map map = zzaWg;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Map zzaWg>
		//    2    4:astore_2        
			map;
		//    3    5:aload_2         
			JVM INSTR monitorenter ;
		//    4    6:monitorenter    
			zzao zzao1 = (zzao)zzaWg.remove(((Object) (ondatapointlistener)));
		//    5    7:aload_0         
		//    6    8:getfield        #26  <Field Map zzaWg>
		//    7   11:aload_1         
		//    8   12:invokeinterface #47  <Method Object Map.remove(Object)>
		//    9   17:checkcast       #6   <Class zzao>
		//   10   20:astore_3        
			if(zzao1 == null)
				break MISSING_BLOCK_LABEL_29;
		//   11   21:aload_3         
		//   12   22:ifnull          29
			map;
		//   13   25:aload_2         
			JVM INSTR monitorexit ;
		//   14   26:monitorexit     
			return zzao1;
		//   15   27:aload_3         
		//   16   28:areturn         
			ondatapointlistener = ((OnDataPointListener) (new zzao(ondatapointlistener)));
		//   17   29:new             #6   <Class zzao>
		//   18   32:dup             
		//   19   33:aload_1         
		//   20   34:aconst_null     
		//   21   35:invokespecial   #38  <Method void zzao(OnDataPointListener, zzao$1)>
		//   22   38:astore_1        
			map;
		//   23   39:aload_2         
			JVM INSTR monitorexit ;
		//   24   40:monitorexit     
			return ((zzao) (ondatapointlistener));
		//   25   41:aload_1         
		//   26   42:areturn         
			ondatapointlistener;
		//   27   43:astore_1        
		//*  28   44:aload_2         
			throw ondatapointlistener;
		//   29   45:monitorexit     
		//   30   46:aload_1         
		//   31   47:athrow          
		}

		private static final zza zzaWf = new zza();
		private final Map zzaWg = new HashMap();

		static 
		{
		//    0    0:new             #2   <Class zzao$zza>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void zzao$zza()>
		//    3    7:putstatic       #19  <Field zzao$zza zzaWf>
		//*   4   10:return          
		}

		private zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #23  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #24  <Method void HashMap()>
		//    6   12:putfield        #26  <Field Map zzaWg>
		//    7   15:return          
		}
	}


	private zzao(OnDataPointListener ondatapointlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void com.google.android.gms.fitness.data.zzs$zza()>
		zzaWe = (OnDataPointListener)zzac.zzw(((Object) (ondatapointlistener)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #22  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #24  <Class OnDataPointListener>
	//    6   12:putfield        #26  <Field OnDataPointListener zzaWe>
	//    7   15:return          
	}


	public void zzf(DataPoint datapoint)
		throws RemoteException
	{
		zzaWe.onDataPoint(datapoint);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field OnDataPointListener zzaWe>
	//    2    4:aload_1         
	//    3    5:invokeinterface #37  <Method void OnDataPointListener.onDataPoint(DataPoint)>
	//    4   10:return          
	}

	private final OnDataPointListener zzaWe;
}
