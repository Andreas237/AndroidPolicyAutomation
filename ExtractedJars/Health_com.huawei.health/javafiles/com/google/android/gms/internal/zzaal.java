// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza;
import com.google.android.gms.tasks.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzaaf, zzaax, zzaby

public class zzaal
{

	public zzaal()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void WeakHashMap()>
	//    6   12:invokestatic    #26  <Method Map Collections.synchronizedMap(Map)>
	//    7   15:putfield        #28  <Field Map zzaBc>
	//    8   18:aload_0         
	//    9   19:new             #19  <Class WeakHashMap>
	//   10   22:dup             
	//   11   23:invokespecial   #20  <Method void WeakHashMap()>
	//   12   26:invokestatic    #26  <Method Map Collections.synchronizedMap(Map)>
	//   13   29:putfield        #30  <Field Map zzaBd>
	//   14   32:return          
	}

	static Map zza(zzaal zzaal1)
	{
		return zzaal1.zzaBc;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Map zzaBc>
	//    2    4:areturn         
	}

	private void zza(boolean flag, Status status)
	{
		Object obj = ((Object) (zzaBc));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Map zzaBc>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj1 = ((Object) (new HashMap(zzaBc)));
	//    5    7:new             #36  <Class HashMap>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:getfield        #28  <Field Map zzaBc>
	//    9   15:invokespecial   #39  <Method void HashMap(Map)>
	//   10   18:astore          4
		obj;
	//   11   20:aload_3         
		JVM INSTR monitorexit ;
	//   12   21:monitorexit     
		  goto _L1
	//*  13   22:goto            30
		status;
	//   14   25:astore_2        
	//*  15   26:aload_3         
		throw status;
	//   16   27:monitorexit     
	//   17   28:aload_2         
	//   18   29:athrow          
_L1:
		Map map = zzaBd;
	//   19   30:aload_0         
	//   20   31:getfield        #30  <Field Map zzaBd>
	//   21   34:astore          5
		map;
	//   22   36:aload           5
		JVM INSTR monitorenter ;
	//   23   38:monitorenter    
		obj = ((Object) (new HashMap(zzaBd)));
	//   24   39:new             #36  <Class HashMap>
	//   25   42:dup             
	//   26   43:aload_0         
	//   27   44:getfield        #30  <Field Map zzaBd>
	//   28   47:invokespecial   #39  <Method void HashMap(Map)>
	//   29   50:astore_3        
		map;
	//   30   51:aload           5
		JVM INSTR monitorexit ;
	//   31   53:monitorexit     
		  goto _L2
	//*  32   54:goto            63
		status;
	//   33   57:astore_2        
	//*  34   58:aload           5
		throw status;
	//   35   60:monitorexit     
	//   36   61:aload_2         
	//   37   62:athrow          
_L2:
		obj1 = ((Object) (((Map) (obj1)).entrySet().iterator()));
	//   38   63:aload           4
	//   39   65:invokeinterface #45  <Method Set Map.entrySet()>
	//   40   70:invokeinterface #51  <Method Iterator Set.iterator()>
	//   41   75:astore          4
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break;
	//   42   77:aload           4
	//   43   79:invokeinterface #57  <Method boolean Iterator.hasNext()>
	//   44   84:ifeq            136
			java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj1)).next();
	//   45   87:aload           4
	//   46   89:invokeinterface #61  <Method Object Iterator.next()>
	//   47   94:checkcast       #63  <Class java.util.Map$Entry>
	//   48   97:astore          5
			if(flag || ((Boolean)entry1.getValue()).booleanValue())
	//*  49   99:iload_1         
	//*  50  100:ifne            119
	//*  51  103:aload           5
	//*  52  105:invokeinterface #66  <Method Object java.util.Map$Entry.getValue()>
	//*  53  110:checkcast       #68  <Class Boolean>
	//*  54  113:invokevirtual   #71  <Method boolean Boolean.booleanValue()>
	//*  55  116:ifeq            133
				((zzaaf)entry1.getKey()).zzC(status);
	//   56  119:aload           5
	//   57  121:invokeinterface #74  <Method Object java.util.Map$Entry.getKey()>
	//   58  126:checkcast       #76  <Class zzaaf>
	//   59  129:aload_2         
	//   60  130:invokevirtual   #80  <Method void zzaaf.zzC(Status)>
		} while(true);
	//   61  133:goto            77
		obj = ((Object) (((Map) (obj)).entrySet().iterator()));
	//   62  136:aload_3         
	//   63  137:invokeinterface #45  <Method Set Map.entrySet()>
	//   64  142:invokeinterface #51  <Method Iterator Set.iterator()>
	//   65  147:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   66  148:aload_3         
	//   67  149:invokeinterface #57  <Method boolean Iterator.hasNext()>
	//   68  154:ifeq            213
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   69  157:aload_3         
	//   70  158:invokeinterface #61  <Method Object Iterator.next()>
	//   71  163:checkcast       #63  <Class java.util.Map$Entry>
	//   72  166:astore          4
			if(flag || ((Boolean)entry.getValue()).booleanValue())
	//*  73  168:iload_1         
	//*  74  169:ifne            188
	//*  75  172:aload           4
	//*  76  174:invokeinterface #66  <Method Object java.util.Map$Entry.getValue()>
	//*  77  179:checkcast       #68  <Class Boolean>
	//*  78  182:invokevirtual   #71  <Method boolean Boolean.booleanValue()>
	//*  79  185:ifeq            210
				((TaskCompletionSource)entry.getKey()).trySetException(((Exception) (new zza(status))));
	//   80  188:aload           4
	//   81  190:invokeinterface #74  <Method Object java.util.Map$Entry.getKey()>
	//   82  195:checkcast       #82  <Class TaskCompletionSource>
	//   83  198:new             #84  <Class zza>
	//   84  201:dup             
	//   85  202:aload_2         
	//   86  203:invokespecial   #86  <Method void zza(Status)>
	//   87  206:invokevirtual   #90  <Method boolean TaskCompletionSource.trySetException(Exception)>
	//   88  209:pop             
		} while(true);
	//   89  210:goto            148
		return;
	//   90  213:return          
	}

	static Map zzb(zzaal zzaal1)
	{
		return zzaal1.zzaBd;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Map zzaBd>
	//    2    4:areturn         
	}

	void zza(zzaaf zzaaf1, boolean flag)
	{
		zzaBc.put(((Object) (zzaaf1)), ((Object) (Boolean.valueOf(flag))));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Map zzaBc>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #96  <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:invokeinterface #100 <Method Object Map.put(Object, Object)>
	//    6   14:pop             
		zzaaf1.zza(new com.google.android.gms.common.api.PendingResult.zza(zzaaf1) {

			public void zzy(Status status)
			{
				com.google.android.gms.internal.zzaal.zza(zzaBf).remove(((Object) (zzaBe)));
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field zzaal zzaBf>
			//    2    4:invokestatic    #30  <Method Map com.google.android.gms.internal.zzaal.zza(zzaal)>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field zzaaf zzaBe>
			//    5   11:invokeinterface #36  <Method Object Map.remove(Object)>
			//    6   16:pop             
			//    7   17:return          
			}

			final zzaaf zzaBe;
			final zzaal zzaBf;

			
			{
				zzaBf = zzaal.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field zzaal zzaBf>
				zzaBe = zzaaf1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field zzaaf zzaBe>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    7   15:aload_1         
	//    8   16:new             #6   <Class zzaal$1>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokespecial   #103 <Method void zzaal$1(zzaal, zzaaf)>
	//   13   25:invokevirtual   #106 <Method void com.google.android.gms.internal.zzaaf.zza(com.google.android.gms.common.api.PendingResult$zza)>
	//   14   28:return          
	}

	void zza(TaskCompletionSource taskcompletionsource, boolean flag)
	{
		zzaBd.put(((Object) (taskcompletionsource)), ((Object) (Boolean.valueOf(flag))));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Map zzaBd>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #96  <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:invokeinterface #100 <Method Object Map.put(Object, Object)>
	//    6   14:pop             
		taskcompletionsource.getTask().addOnCompleteListener(new OnCompleteListener(taskcompletionsource) {

			public void onComplete(Task task)
			{
				zzaal.zzb(zzaBf).remove(((Object) (zzaBg)));
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field zzaal zzaBf>
			//    2    4:invokestatic    #33  <Method Map zzaal.zzb(zzaal)>
			//    3    7:aload_0         
			//    4    8:getfield        #22  <Field TaskCompletionSource zzaBg>
			//    5   11:invokeinterface #39  <Method Object Map.remove(Object)>
			//    6   16:pop             
			//    7   17:return          
			}

			final zzaal zzaBf;
			final TaskCompletionSource zzaBg;

			
			{
				zzaBf = zzaal.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field zzaal zzaBf>
				zzaBg = taskcompletionsource;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field TaskCompletionSource zzaBg>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    7   15:aload_1         
	//    8   16:invokevirtual   #113 <Method Task TaskCompletionSource.getTask()>
	//    9   19:new             #8   <Class zzaal$2>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokespecial   #116 <Method void zzaal$2(zzaal, TaskCompletionSource)>
	//   14   28:invokevirtual   #122 <Method Task Task.addOnCompleteListener(OnCompleteListener)>
	//   15   31:pop             
	//   16   32:return          
	}

	boolean zzvY()
	{
		return !zzaBc.isEmpty() || !zzaBd.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Map zzaBc>
	//    2    4:invokeinterface #127 <Method boolean Map.isEmpty()>
	//    3    9:ifeq            24
	//    4   12:aload_0         
	//    5   13:getfield        #30  <Field Map zzaBd>
	//    6   16:invokeinterface #127 <Method boolean Map.isEmpty()>
	//    7   21:ifne            26
	//    8   24:iconst_1        
	//    9   25:ireturn         
	//   10   26:iconst_0        
	//   11   27:ireturn         
	}

	public void zzvZ()
	{
		zza(false, zzaax.zzaCn);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:getstatic       #134 <Field Status zzaax.zzaCn>
	//    3    5:invokespecial   #136 <Method void zza(boolean, Status)>
	//    4    8:return          
	}

	public void zzwa()
	{
		zza(true, zzaby.zzaDu);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:getstatic       #142 <Field Status zzaby.zzaDu>
	//    3    5:invokespecial   #136 <Method void zza(boolean, Status)>
	//    4    8:return          
	}

	private final Map zzaBc = Collections.synchronizedMap(((Map) (new WeakHashMap())));
	private final Map zzaBd = Collections.synchronizedMap(((Map) (new WeakHashMap())));
}
