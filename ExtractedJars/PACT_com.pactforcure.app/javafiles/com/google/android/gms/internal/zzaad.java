// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza;
import com.google.android.gms.tasks.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzzx, zzaap, zzabq

public class zzaad
{

	public zzaad()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void WeakHashMap()>
	//    6   12:invokestatic    #26  <Method Map Collections.synchronizedMap(Map)>
	//    7   15:putfield        #28  <Field Map zzazC>
	//    8   18:aload_0         
	//    9   19:new             #19  <Class WeakHashMap>
	//   10   22:dup             
	//   11   23:invokespecial   #20  <Method void WeakHashMap()>
	//   12   26:invokestatic    #26  <Method Map Collections.synchronizedMap(Map)>
	//   13   29:putfield        #30  <Field Map zzazD>
	//   14   32:return          
	}

	static Map zza(zzaad zzaad1)
	{
		return zzaad1.zzazC;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Map zzazC>
	//    2    4:areturn         
	}

	private void zza(boolean flag, Status status)
	{
		Object obj1;
		synchronized(zzazC)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Map zzazC>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			obj1 = ((Object) (new HashMap(zzazC)));
	//    5    7:new             #36  <Class HashMap>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:getfield        #28  <Field Map zzazC>
	//    9   15:invokespecial   #39  <Method void HashMap(Map)>
	//   10   18:astore          4
		}
	//   11   20:aload_3         
	//   12   21:monitorexit     
		synchronized(zzazD)
	//*  13   22:aload_0         
	//*  14   23:getfield        #30  <Field Map zzazD>
	//*  15   26:astore          5
	//*  16   28:aload           5
	//*  17   30:monitorenter    
		{
			obj = ((Object) (new HashMap(zzazD)));
	//   18   31:new             #36  <Class HashMap>
	//   19   34:dup             
	//   20   35:aload_0         
	//   21   36:getfield        #30  <Field Map zzazD>
	//   22   39:invokespecial   #39  <Method void HashMap(Map)>
	//   23   42:astore_3        
		}
	//   24   43:aload           5
	//   25   45:monitorexit     
		obj1 = ((Object) (((Map) (obj1)).entrySet().iterator()));
	//   26   46:aload           4
	//   27   48:invokeinterface #45  <Method Set Map.entrySet()>
	//   28   53:invokeinterface #51  <Method Iterator Set.iterator()>
	//   29   58:astore          4
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break;
	//   30   60:aload           4
	//   31   62:invokeinterface #57  <Method boolean Iterator.hasNext()>
	//   32   67:ifeq            130
			obj2 = ((Object) ((java.util.Map.Entry)((Iterator) (obj1)).next()));
	//   33   70:aload           4
	//   34   72:invokeinterface #61  <Method Object Iterator.next()>
	//   35   77:checkcast       #63  <Class java.util.Map$Entry>
	//   36   80:astore          5
			if(flag || ((Boolean)((java.util.Map.Entry) (obj2)).getValue()).booleanValue())
	//*  37   82:iload_1         
	//*  38   83:ifne            102
	//*  39   86:aload           5
	//*  40   88:invokeinterface #66  <Method Object java.util.Map$Entry.getValue()>
	//*  41   93:checkcast       #68  <Class Boolean>
	//*  42   96:invokevirtual   #71  <Method boolean Boolean.booleanValue()>
	//*  43   99:ifeq            60
				((zzzx)((java.util.Map.Entry) (obj2)).getKey()).zzB(status);
	//   44  102:aload           5
	//   45  104:invokeinterface #74  <Method Object java.util.Map$Entry.getKey()>
	//   46  109:checkcast       #76  <Class zzzx>
	//   47  112:aload_2         
	//   48  113:invokevirtual   #80  <Method void zzzx.zzB(Status)>
		} while(true);
	//   49  116:goto            60
		break MISSING_BLOCK_LABEL_130;
		status;
	//   50  119:astore_2        
		obj;
	//   51  120:aload_3         
		JVM INSTR monitorexit ;
	//   52  121:monitorexit     
		throw status;
	//   53  122:aload_2         
	//   54  123:athrow          
		status;
	//   55  124:astore_2        
		obj2;
	//   56  125:aload           5
		JVM INSTR monitorexit ;
	//   57  127:monitorexit     
		throw status;
	//   58  128:aload_2         
	//   59  129:athrow          
		Iterator iterator = ((Map) (obj)).entrySet().iterator();
	//   60  130:aload_3         
	//   61  131:invokeinterface #45  <Method Set Map.entrySet()>
	//   62  136:invokeinterface #51  <Method Iterator Set.iterator()>
	//   63  141:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   64  142:aload_3         
	//   65  143:invokeinterface #57  <Method boolean Iterator.hasNext()>
	//   66  148:ifeq            207
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   67  151:aload_3         
	//   68  152:invokeinterface #61  <Method Object Iterator.next()>
	//   69  157:checkcast       #63  <Class java.util.Map$Entry>
	//   70  160:astore          4
			if(flag || ((Boolean)entry.getValue()).booleanValue())
	//*  71  162:iload_1         
	//*  72  163:ifne            182
	//*  73  166:aload           4
	//*  74  168:invokeinterface #66  <Method Object java.util.Map$Entry.getValue()>
	//*  75  173:checkcast       #68  <Class Boolean>
	//*  76  176:invokevirtual   #71  <Method boolean Boolean.booleanValue()>
	//*  77  179:ifeq            142
				((TaskCompletionSource)entry.getKey()).trySetException(((Exception) (new zza(status))));
	//   78  182:aload           4
	//   79  184:invokeinterface #74  <Method Object java.util.Map$Entry.getKey()>
	//   80  189:checkcast       #82  <Class TaskCompletionSource>
	//   81  192:new             #84  <Class zza>
	//   82  195:dup             
	//   83  196:aload_2         
	//   84  197:invokespecial   #86  <Method void zza(Status)>
	//   85  200:invokevirtual   #90  <Method boolean TaskCompletionSource.trySetException(Exception)>
	//   86  203:pop             
		} while(true);
	//   87  204:goto            142
		return;
	//   88  207:return          
	}

	static Map zzb(zzaad zzaad1)
	{
		return zzaad1.zzazD;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Map zzazD>
	//    2    4:areturn         
	}

	void zza(zzzx zzzx1, boolean flag)
	{
		zzazC.put(((Object) (zzzx1)), ((Object) (Boolean.valueOf(flag))));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Map zzazC>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #96  <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:invokeinterface #100 <Method Object Map.put(Object, Object)>
	//    6   14:pop             
		zzzx1.zza(new com.google.android.gms.common.api.PendingResult.zza(zzzx1) {

			public void zzx(Status status)
			{
				com.google.android.gms.internal.zzaad.zza(zzazF).remove(((Object) (zzazE)));
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field zzaad zzazF>
			//    2    4:invokestatic    #30  <Method Map com.google.android.gms.internal.zzaad.zza(zzaad)>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field zzzx zzazE>
			//    5   11:invokeinterface #36  <Method Object Map.remove(Object)>
			//    6   16:pop             
			//    7   17:return          
			}

			final zzzx zzazE;
			final zzaad zzazF;

			
			{
				zzazF = zzaad.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field zzaad zzazF>
				zzazE = zzzx1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field zzzx zzazE>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    7   15:aload_1         
	//    8   16:new             #6   <Class zzaad$1>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokespecial   #103 <Method void zzaad$1(zzaad, zzzx)>
	//   13   25:invokevirtual   #106 <Method void com.google.android.gms.internal.zzzx.zza(com.google.android.gms.common.api.PendingResult$zza)>
	//   14   28:return          
	}

	void zza(TaskCompletionSource taskcompletionsource, boolean flag)
	{
		zzazD.put(((Object) (taskcompletionsource)), ((Object) (Boolean.valueOf(flag))));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Map zzazD>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #96  <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:invokeinterface #100 <Method Object Map.put(Object, Object)>
	//    6   14:pop             
		taskcompletionsource.getTask().addOnCompleteListener(new OnCompleteListener(taskcompletionsource) {

			public void onComplete(Task task)
			{
				zzaad.zzb(zzazF).remove(((Object) (zzazG)));
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field zzaad zzazF>
			//    2    4:invokestatic    #33  <Method Map zzaad.zzb(zzaad)>
			//    3    7:aload_0         
			//    4    8:getfield        #22  <Field TaskCompletionSource zzazG>
			//    5   11:invokeinterface #39  <Method Object Map.remove(Object)>
			//    6   16:pop             
			//    7   17:return          
			}

			final zzaad zzazF;
			final TaskCompletionSource zzazG;

			
			{
				zzazF = zzaad.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field zzaad zzazF>
				zzazG = taskcompletionsource;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field TaskCompletionSource zzazG>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    7   15:aload_1         
	//    8   16:invokevirtual   #113 <Method Task TaskCompletionSource.getTask()>
	//    9   19:new             #8   <Class zzaad$2>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokespecial   #116 <Method void zzaad$2(zzaad, TaskCompletionSource)>
	//   14   28:invokevirtual   #122 <Method Task Task.addOnCompleteListener(OnCompleteListener)>
	//   15   31:pop             
	//   16   32:return          
	}

	boolean zzvu()
	{
		return !zzazC.isEmpty() || !zzazD.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Map zzazC>
	//    2    4:invokeinterface #127 <Method boolean Map.isEmpty()>
	//    3    9:ifeq            24
	//    4   12:aload_0         
	//    5   13:getfield        #30  <Field Map zzazD>
	//    6   16:invokeinterface #127 <Method boolean Map.isEmpty()>
	//    7   21:ifne            26
	//    8   24:iconst_1        
	//    9   25:ireturn         
	//   10   26:iconst_0        
	//   11   27:ireturn         
	}

	public void zzvv()
	{
		zza(false, zzaap.zzaAO);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:getstatic       #134 <Field Status zzaap.zzaAO>
	//    3    5:invokespecial   #136 <Method void zza(boolean, Status)>
	//    4    8:return          
	}

	public void zzvw()
	{
		zza(true, zzabq.zzaBV);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:getstatic       #142 <Field Status zzabq.zzaBV>
	//    3    5:invokespecial   #136 <Method void zza(boolean, Status)>
	//    4    8:return          
	}

	private final Map zzazC = Collections.synchronizedMap(((Map) (new WeakHashMap())));
	private final Map zzazD = Collections.synchronizedMap(((Map) (new WeakHashMap())));
}
