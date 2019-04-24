// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.*;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			BasePendingResult, zaac, zaad, GoogleApiManager, 
//			zacp

public final class zaab
{

	public zaab()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #15  <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void WeakHashMap()>
	//    6   12:invokestatic    #22  <Method Map Collections.synchronizedMap(Map)>
	//    7   15:putfield        #24  <Field Map zafj>
	//    8   18:aload_0         
	//    9   19:new             #15  <Class WeakHashMap>
	//   10   22:dup             
	//   11   23:invokespecial   #16  <Method void WeakHashMap()>
	//   12   26:invokestatic    #22  <Method Map Collections.synchronizedMap(Map)>
	//   13   29:putfield        #26  <Field Map zafk>
	//   14   32:return          
	}

	static Map zaa(zaab zaab1)
	{
		return zaab1.zafj;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Map zafj>
	//    2    4:areturn         
	}

	private final void zaa(boolean flag, Status status)
	{
		Object obj1;
		synchronized(zafj)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Map zafj>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			obj1 = ((Object) (new HashMap(zafj)));
	//    5    7:new             #32  <Class HashMap>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:getfield        #24  <Field Map zafj>
	//    9   15:invokespecial   #35  <Method void HashMap(Map)>
	//   10   18:astore          4
		}
	//   11   20:aload_3         
	//   12   21:monitorexit     
		synchronized(zafk)
	//*  13   22:aload_0         
	//*  14   23:getfield        #26  <Field Map zafk>
	//*  15   26:astore          5
	//*  16   28:aload           5
	//*  17   30:monitorenter    
		{
			obj = ((Object) (new HashMap(zafk)));
	//   18   31:new             #32  <Class HashMap>
	//   19   34:dup             
	//   20   35:aload_0         
	//   21   36:getfield        #26  <Field Map zafk>
	//   22   39:invokespecial   #35  <Method void HashMap(Map)>
	//   23   42:astore_3        
		}
	//   24   43:aload           5
	//   25   45:monitorexit     
		obj1 = ((Object) (((Map) (obj1)).entrySet().iterator()));
	//   26   46:aload           4
	//   27   48:invokeinterface #41  <Method Set Map.entrySet()>
	//   28   53:invokeinterface #47  <Method Iterator Set.iterator()>
	//   29   58:astore          4
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break;
	//   30   60:aload           4
	//   31   62:invokeinterface #53  <Method boolean Iterator.hasNext()>
	//   32   67:ifeq            119
			obj2 = ((Object) ((java.util.Map.Entry)((Iterator) (obj1)).next()));
	//   33   70:aload           4
	//   34   72:invokeinterface #57  <Method Object Iterator.next()>
	//   35   77:checkcast       #59  <Class java.util.Map$Entry>
	//   36   80:astore          5
			if(flag || ((Boolean)((java.util.Map.Entry) (obj2)).getValue()).booleanValue())
	//*  37   82:iload_1         
	//*  38   83:ifne            102
	//*  39   86:aload           5
	//*  40   88:invokeinterface #62  <Method Object java.util.Map$Entry.getValue()>
	//*  41   93:checkcast       #64  <Class Boolean>
	//*  42   96:invokevirtual   #67  <Method boolean Boolean.booleanValue()>
	//*  43   99:ifeq            60
				((BasePendingResult)((java.util.Map.Entry) (obj2)).getKey()).zab(status);
	//   44  102:aload           5
	//   45  104:invokeinterface #70  <Method Object java.util.Map$Entry.getKey()>
	//   46  109:checkcast       #72  <Class BasePendingResult>
	//   47  112:aload_2         
	//   48  113:invokevirtual   #76  <Method void BasePendingResult.zab(Status)>
		} while(true);
	//   49  116:goto            60
		obj = ((Object) (((Map) (obj)).entrySet().iterator()));
	//   50  119:aload_3         
	//   51  120:invokeinterface #41  <Method Set Map.entrySet()>
	//   52  125:invokeinterface #47  <Method Iterator Set.iterator()>
	//   53  130:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   54  131:aload_3         
	//   55  132:invokeinterface #53  <Method boolean Iterator.hasNext()>
	//   56  137:ifeq            196
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   57  140:aload_3         
	//   58  141:invokeinterface #57  <Method Object Iterator.next()>
	//   59  146:checkcast       #59  <Class java.util.Map$Entry>
	//   60  149:astore          4
			if(flag || ((Boolean)entry.getValue()).booleanValue())
	//*  61  151:iload_1         
	//*  62  152:ifne            171
	//*  63  155:aload           4
	//*  64  157:invokeinterface #62  <Method Object java.util.Map$Entry.getValue()>
	//*  65  162:checkcast       #64  <Class Boolean>
	//*  66  165:invokevirtual   #67  <Method boolean Boolean.booleanValue()>
	//*  67  168:ifeq            131
				((TaskCompletionSource)entry.getKey()).trySetException(((Exception) (new ApiException(status))));
	//   68  171:aload           4
	//   69  173:invokeinterface #70  <Method Object java.util.Map$Entry.getKey()>
	//   70  178:checkcast       #78  <Class TaskCompletionSource>
	//   71  181:new             #80  <Class ApiException>
	//   72  184:dup             
	//   73  185:aload_2         
	//   74  186:invokespecial   #82  <Method void ApiException(Status)>
	//   75  189:invokevirtual   #86  <Method boolean TaskCompletionSource.trySetException(Exception)>
	//   76  192:pop             
		} while(true);
	//   77  193:goto            131
		return;
	//   78  196:return          
		status;
	//   79  197:astore_2        
		obj2;
	//   80  198:aload           5
		JVM INSTR monitorexit ;
	//   81  200:monitorexit     
		throw status;
	//   82  201:aload_2         
	//   83  202:athrow          
		status;
	//   84  203:astore_2        
		obj;
	//   85  204:aload_3         
		JVM INSTR monitorexit ;
	//   86  205:monitorexit     
		throw status;
	//   87  206:aload_2         
	//   88  207:athrow          
	}

	static Map zab(zaab zaab1)
	{
		return zaab1.zafk;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Map zafk>
	//    2    4:areturn         
	}

	final void zaa(BasePendingResult basependingresult, boolean flag)
	{
		zafj.put(((Object) (basependingresult)), ((Object) (Boolean.valueOf(flag))));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Map zafj>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #91  <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:invokeinterface #95  <Method Object Map.put(Object, Object)>
	//    6   14:pop             
		((PendingResult) (basependingresult)).addStatusListener(((com.google.android.gms.common.api.PendingResult.StatusListener) (new zaac(this, basependingresult))));
	//    7   15:aload_1         
	//    8   16:new             #97  <Class zaac>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokespecial   #100 <Method void zaac(zaab, BasePendingResult)>
	//   13   25:invokevirtual   #106 <Method void PendingResult.addStatusListener(com.google.android.gms.common.api.PendingResult$StatusListener)>
	//   14   28:return          
	}

	final void zaa(TaskCompletionSource taskcompletionsource, boolean flag)
	{
		zafk.put(((Object) (taskcompletionsource)), ((Object) (Boolean.valueOf(flag))));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Map zafk>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #91  <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:invokeinterface #95  <Method Object Map.put(Object, Object)>
	//    6   14:pop             
		taskcompletionsource.getTask().addOnCompleteListener(((com.google.android.gms.tasks.OnCompleteListener) (new zaad(this, taskcompletionsource))));
	//    7   15:aload_1         
	//    8   16:invokevirtual   #113 <Method Task TaskCompletionSource.getTask()>
	//    9   19:new             #115 <Class zaad>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokespecial   #118 <Method void zaad(zaab, TaskCompletionSource)>
	//   14   28:invokevirtual   #124 <Method Task Task.addOnCompleteListener(com.google.android.gms.tasks.OnCompleteListener)>
	//   15   31:pop             
	//   16   32:return          
	}

	final boolean zaag()
	{
		return !zafj.isEmpty() || !zafk.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Map zafj>
	//    2    4:invokeinterface #129 <Method boolean Map.isEmpty()>
	//    3    9:ifeq            29
	//    4   12:aload_0         
	//    5   13:getfield        #26  <Field Map zafk>
	//    6   16:invokeinterface #129 <Method boolean Map.isEmpty()>
	//    7   21:ifne            27
	//    8   24:goto            29
	//    9   27:iconst_0        
	//   10   28:ireturn         
	//   11   29:iconst_1        
	//   12   30:ireturn         
	}

	public final void zaah()
	{
		zaa(false, GoogleApiManager.zahw);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:getstatic       #136 <Field Status GoogleApiManager.zahw>
	//    3    5:invokespecial   #138 <Method void zaa(boolean, Status)>
	//    4    8:return          
	}

	public final void zaai()
	{
		zaa(true, zacp.zakw);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:getstatic       #144 <Field Status zacp.zakw>
	//    3    5:invokespecial   #138 <Method void zaa(boolean, Status)>
	//    4    8:return          
	}

	private final Map zafj = Collections.synchronizedMap(((Map) (new WeakHashMap())));
	private final Map zafk = Collections.synchronizedMap(((Map) (new WeakHashMap())));
}
