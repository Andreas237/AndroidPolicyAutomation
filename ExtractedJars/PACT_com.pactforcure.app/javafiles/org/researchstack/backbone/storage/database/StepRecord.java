// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.researchstack.backbone.storage.database;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Date;
import java.util.Map;
import org.researchstack.backbone.result.StepResult;
import org.researchstack.backbone.step.Step;
import org.researchstack.backbone.utils.TextUtils;

public class StepRecord
{

	public StepRecord()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
	//    2    4:return          
	}

	public static StepResult toStepResult(StepRecord steprecord)
	{
		StepResult stepresult = new StepResult(new Step(steprecord.stepId));
	//    0    0:new             #52  <Class StepResult>
	//    1    3:dup             
	//    2    4:new             #54  <Class Step>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field String stepId>
	//    6   12:invokespecial   #59  <Method void Step(String)>
	//    7   15:invokespecial   #62  <Method void StepResult(Step)>
	//    8   18:astore_1        
		stepresult.setStartDate(steprecord.started);
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #64  <Field Date started>
	//   12   24:invokevirtual   #68  <Method void StepResult.setStartDate(Date)>
		stepresult.setEndDate(steprecord.completed);
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #70  <Field Date completed>
	//   16   32:invokevirtual   #73  <Method void StepResult.setEndDate(Date)>
		if(!TextUtils.isEmpty(((CharSequence) (steprecord.result))))
	//*  17   35:aload_0         
	//*  18   36:getfield        #75  <Field String result>
	//*  19   39:invokestatic    #81  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  20   42:ifne            64
			stepresult.setResults((Map)GSON.fromJson(steprecord.result, java/util/Map));
	//   21   45:aload_1         
	//   22   46:getstatic       #46  <Field Gson GSON>
	//   23   49:aload_0         
	//   24   50:getfield        #75  <Field String result>
	//   25   53:ldc1            #83  <Class Map>
	//   26   55:invokevirtual   #89  <Method Object Gson.fromJson(String, Class)>
	//   27   58:checkcast       #83  <Class Map>
	//   28   61:invokevirtual   #93  <Method void StepResult.setResults(Map)>
		return stepresult;
	//   29   64:aload_1         
	//   30   65:areturn         
	}

	private static final Gson GSON = (new GsonBuilder()).setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();
	public static final String STEP_ID = "stepId";
	public static final String TASK_RECORD_ID = "taskRecordId";
	public Date completed;
	public int id;
	public String result;
	public Date started;
	public String stepId;
	public String taskId;
	public int taskRecordId;

	static 
	{
	//    0    0:new             #31  <Class GsonBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void GsonBuilder()>
	//    3    7:ldc1            #36  <String "yyyy-MM-dd'T'HH:mm:ss.SSSZ">
	//    4    9:invokevirtual   #40  <Method GsonBuilder GsonBuilder.setDateFormat(String)>
	//    5   12:invokevirtual   #44  <Method Gson GsonBuilder.create()>
	//    6   15:putstatic       #46  <Field Gson GSON>
	//*   7   18:return          
	}
}
