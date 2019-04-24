// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import java.util.*;
import org.researchstack.backbone.result.StepResult;
import org.researchstack.backbone.result.TaskResult;

public class ResultFailureConditionInjector
{

	public ResultFailureConditionInjector()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static String extractFailure(TaskResult taskresult)
	{
		for(taskresult = ((TaskResult) (taskresult.getResults().entrySet().iterator())); ((Iterator) (taskresult)).hasNext();)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #21  <Method Map TaskResult.getResults()>
	//*   2    4:invokeinterface #27  <Method Set Map.entrySet()>
	//*   3    9:invokeinterface #33  <Method Iterator Set.iterator()>
	//*   4   14:astore_0        
	//*   5   15:aload_0         
	//*   6   16:invokeinterface #39  <Method boolean Iterator.hasNext()>
	//*   7   21:ifeq            67
		{
			Object obj = ((Object) (((StepResult)((java.util.Map.Entry)((Iterator) (taskresult)).next()).getValue()).getResults()));
	//    8   24:aload_0         
	//    9   25:invokeinterface #43  <Method Object Iterator.next()>
	//   10   30:checkcast       #45  <Class java.util.Map$Entry>
	//   11   33:invokeinterface #48  <Method Object java.util.Map$Entry.getValue()>
	//   12   38:checkcast       #50  <Class StepResult>
	//   13   41:invokevirtual   #51  <Method Map StepResult.getResults()>
	//   14   44:astore_1        
			if(obj != null)
	//*  15   45:aload_1         
	//*  16   46:ifnull          15
			{
				obj = ((Map) (obj)).get("failReason");
	//   17   49:aload_1         
	//   18   50:ldc1            #8   <String "failReason">
	//   19   52:invokeinterface #55  <Method Object Map.get(Object)>
	//   20   57:astore_1        
				if(obj != null)
	//*  21   58:aload_1         
	//*  22   59:ifnull          15
					return (String)obj;
	//   23   62:aload_1         
	//   24   63:checkcast       #57  <Class String>
	//   25   66:areturn         
			}
		}

		return null;
	//   26   67:aconst_null     
	//   27   68:areturn         
	}

	public static void injectFailure(TaskResult taskresult, String s)
	{
		for(taskresult = ((TaskResult) (taskresult.getResults().entrySet().iterator())); ((Iterator) (taskresult)).hasNext(); ((StepResult)((java.util.Map.Entry)((Iterator) (taskresult)).next()).getValue()).getResults().put("failReason", ((Object) (s))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method Map TaskResult.getResults()>
	//    2    4:invokeinterface #27  <Method Set Map.entrySet()>
	//    3    9:invokeinterface #33  <Method Iterator Set.iterator()>
	//    4   14:astore_0        
	//    5   15:aload_0         
	//    6   16:invokeinterface #39  <Method boolean Iterator.hasNext()>
	//    7   21:ifeq            56
	//    8   24:aload_0         
	//    9   25:invokeinterface #43  <Method Object Iterator.next()>
	//   10   30:checkcast       #45  <Class java.util.Map$Entry>
	//   11   33:invokeinterface #48  <Method Object java.util.Map$Entry.getValue()>
	//   12   38:checkcast       #50  <Class StepResult>
	//   13   41:invokevirtual   #51  <Method Map StepResult.getResults()>
	//   14   44:ldc1            #8   <String "failReason">
	//   15   46:aload_1         
	//   16   47:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//   17   52:pop             
	//*  18   53:goto            15
	//   19   56:return          
	}

	public static final String FAIL_REASON = "failReason";
}
