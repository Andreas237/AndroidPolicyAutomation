// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.researchstack.backbone.storage.database;

import java.util.*;
import org.researchstack.backbone.result.StepResult;
import org.researchstack.backbone.result.TaskResult;

// Referenced classes of package org.researchstack.backbone.storage.database:
//			StepRecord

public class TaskRecord
{

	public TaskRecord()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:return          
	}

	public static TaskResult toTaskResult(TaskRecord taskrecord, List list)
	{
		TaskResult taskresult = new TaskResult(taskrecord.taskId);
	//    0    0:new             #32  <Class TaskResult>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #34  <Field String taskId>
	//    4    8:invokespecial   #37  <Method void TaskResult(String)>
	//    5   11:astore_2        
		taskresult.setStartDate(taskrecord.started);
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:getfield        #39  <Field Date started>
	//    9   17:invokevirtual   #43  <Method void TaskResult.setStartDate(Date)>
		taskresult.setEndDate(taskrecord.completed);
	//   10   20:aload_2         
	//   11   21:aload_0         
	//   12   22:getfield        #45  <Field Date completed>
	//   13   25:invokevirtual   #48  <Method void TaskResult.setEndDate(Date)>
		for(taskrecord = ((TaskRecord) (list.iterator())); ((Iterator) (taskrecord)).hasNext(); taskresult.setStepResultForStepIdentifier(((StepResult) (list)).getIdentifier(), ((StepResult) (list))))
	//*  14   28:aload_1         
	//*  15   29:invokeinterface #54  <Method Iterator List.iterator()>
	//*  16   34:astore_0        
	//*  17   35:aload_0         
	//*  18   36:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//*  19   41:ifeq            69
			list = ((List) (StepRecord.toStepResult((StepRecord)((Iterator) (taskrecord)).next())));
	//   20   44:aload_0         
	//   21   45:invokeinterface #64  <Method Object Iterator.next()>
	//   22   50:checkcast       #66  <Class StepRecord>
	//   23   53:invokestatic    #70  <Method StepResult StepRecord.toStepResult(StepRecord)>
	//   24   56:astore_1        

	//   25   57:aload_2         
	//   26   58:aload_1         
	//   27   59:invokevirtual   #76  <Method String StepResult.getIdentifier()>
	//   28   62:aload_1         
	//   29   63:invokevirtual   #80  <Method void TaskResult.setStepResultForStepIdentifier(String, StepResult)>
	//*  30   66:goto            35
		return taskresult;
	//   31   69:aload_2         
	//   32   70:areturn         
	}

	public static final String COMPLETED = "completed";
	public static final String TASK_ID = "taskId";
	public Date completed;
	public int id;
	public Date started;
	public String taskId;
	public Date uploaded;
}
