// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import com.pactforcure.app.ui.SurveyCallbacks;
import java.util.List;
import java.util.Map;
import org.researchstack.backbone.result.TaskResult;
import org.researchstack.backbone.step.Step;

// Referenced classes of package com.pactforcure.app.survey:
//			SurveyTask, Answer, Survey

public class HrpqTask extends SurveyTask
{

	public HrpqTask(Survey survey, List list, Map map, Map map1, SurveyCallbacks surveycallbacks)
	{
		super(survey, list, map, map1, surveycallbacks);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #8   <Method void SurveyTask(Survey, List, Map, Map, SurveyCallbacks)>
	//    7   11:return          
	}

	public Step getStepBeforeStep(Step step, TaskResult taskresult)
	{
		Step step1 = super.getStepBeforeStep(step, taskresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method Step SurveyTask.getStepBeforeStep(Step, TaskResult)>
	//    4    6:astore_3        
		if(!currentStep.getIdentifier().equals("HRPQ4")) goto _L2; else goto _L1
	//    5    7:aload_0         
	//    6    8:getfield        #19  <Field Step currentStep>
	//    7   11:invokevirtual   #25  <Method String Step.getIdentifier()>
	//    8   14:ldc1            #27  <String "HRPQ4">
	//    9   16:invokevirtual   #33  <Method boolean String.equals(Object)>
	//   10   19:ifeq            67
_L1:
		taskresult = ((TaskResult) ((Answer)answers.get("HRPQ3a")));
	//   11   22:aload_0         
	//   12   23:getfield        #37  <Field Map answers>
	//   13   26:ldc1            #39  <String "HRPQ3a">
	//   14   28:invokeinterface #45  <Method Object Map.get(Object)>
	//   15   33:checkcast       #47  <Class Answer>
	//   16   36:astore_2        
		step = "";
	//   17   37:ldc1            #49  <String "">
	//   18   39:astore_1        
		if(taskresult != null)
	//*  19   40:aload_2         
	//*  20   41:ifnull          49
			step = ((Step) (((Answer) (taskresult)).getValue()));
	//   21   44:aload_2         
	//   22   45:invokevirtual   #52  <Method String Answer.getValue()>
	//   23   48:astore_1        
		if(!((String) (step)).equals("no")) goto _L2; else goto _L3
	//   24   49:aload_1         
	//   25   50:ldc1            #54  <String "no">
	//   26   52:invokevirtual   #33  <Method boolean String.equals(Object)>
	//   27   55:ifeq            67
_L3:
		taskresult = ((TaskResult) (getStepById("HRPQ3a")));
	//   28   58:aload_0         
	//   29   59:ldc1            #39  <String "HRPQ3a">
	//   30   61:invokevirtual   #58  <Method Step getStepById(String)>
	//   31   64:astore_2        
_L5:
		return ((Step) (taskresult));
	//   32   65:aload_2         
	//   33   66:areturn         
_L2:
		if(currentStep.getIdentifier().equals("HRPQ5"))
	//*  34   67:aload_0         
	//*  35   68:getfield        #19  <Field Step currentStep>
	//*  36   71:invokevirtual   #25  <Method String Step.getIdentifier()>
	//*  37   74:ldc1            #60  <String "HRPQ5">
	//*  38   76:invokevirtual   #33  <Method boolean String.equals(Object)>
	//*  39   79:ifeq            125
		{
			taskresult = ((TaskResult) ((Answer)answers.get("HRPQ1")));
	//   40   82:aload_0         
	//   41   83:getfield        #37  <Field Map answers>
	//   42   86:ldc1            #62  <String "HRPQ1">
	//   43   88:invokeinterface #45  <Method Object Map.get(Object)>
	//   44   93:checkcast       #47  <Class Answer>
	//   45   96:astore_2        
			step = "";
	//   46   97:ldc1            #49  <String "">
	//   47   99:astore_1        
			if(taskresult != null)
	//*  48  100:aload_2         
	//*  49  101:ifnull          109
				step = ((Step) (((Answer) (taskresult)).getValue()));
	//   50  104:aload_2         
	//   51  105:invokevirtual   #52  <Method String Answer.getValue()>
	//   52  108:astore_1        
			if(((String) (step)).equals("not employed"))
	//*  53  109:aload_1         
	//*  54  110:ldc1            #64  <String "not employed">
	//*  55  112:invokevirtual   #33  <Method boolean String.equals(Object)>
	//*  56  115:ifeq            125
				return getStepById("HRPQ1");
	//   57  118:aload_0         
	//   58  119:ldc1            #62  <String "HRPQ1">
	//   59  121:invokevirtual   #58  <Method Step getStepById(String)>
	//   60  124:areturn         
		}
		taskresult = ((TaskResult) (step1));
	//   61  125:aload_3         
	//   62  126:astore_2        
		if(currentStep.getIdentifier().equals("HRPQ7"))
	//*  63  127:aload_0         
	//*  64  128:getfield        #19  <Field Step currentStep>
	//*  65  131:invokevirtual   #25  <Method String Step.getIdentifier()>
	//*  66  134:ldc1            #66  <String "HRPQ7">
	//*  67  136:invokevirtual   #33  <Method boolean String.equals(Object)>
	//*  68  139:ifeq            65
		{
			taskresult = ((TaskResult) ((Answer)answers.get("HRPQ6a")));
	//   69  142:aload_0         
	//   70  143:getfield        #37  <Field Map answers>
	//   71  146:ldc1            #68  <String "HRPQ6a">
	//   72  148:invokeinterface #45  <Method Object Map.get(Object)>
	//   73  153:checkcast       #47  <Class Answer>
	//   74  156:astore_2        
			step = "";
	//   75  157:ldc1            #49  <String "">
	//   76  159:astore_1        
			if(taskresult != null)
	//*  77  160:aload_2         
	//*  78  161:ifnull          169
				step = ((Step) (((Answer) (taskresult)).getValue()));
	//   79  164:aload_2         
	//   80  165:invokevirtual   #52  <Method String Answer.getValue()>
	//   81  168:astore_1        
			taskresult = ((TaskResult) (step1));
	//   82  169:aload_3         
	//   83  170:astore_2        
			if(((String) (step)).equals("no"))
	//*  84  171:aload_1         
	//*  85  172:ldc1            #54  <String "no">
	//*  86  174:invokevirtual   #33  <Method boolean String.equals(Object)>
	//*  87  177:ifeq            65
				return getStepById("HRPQ6a");
	//   88  180:aload_0         
	//   89  181:ldc1            #68  <String "HRPQ6a">
	//   90  183:invokevirtual   #58  <Method Step getStepById(String)>
	//   91  186:areturn         
		}
		if(true) goto _L5; else goto _L4
_L4:
	}
}
