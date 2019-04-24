// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api.transform;

import com.pactforcure.app.survey.*;
import java.util.*;

public class QuestionTypeFinder
{

	public QuestionTypeFinder(Survey survey1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		survey = survey1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Survey survey>
		survey1 = ((Survey) (survey1.getQuestions()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #22  <Method List Survey.getQuestions()>
	//    7   13:astore_1        
		questionTypesMap = ((Map) (new HashMap(((List) (survey1)).size())));
	//    8   14:aload_0         
	//    9   15:new             #24  <Class HashMap>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:invokeinterface #30  <Method int List.size()>
	//   13   25:invokespecial   #33  <Method void HashMap(int)>
	//   14   28:putfield        #35  <Field Map questionTypesMap>
		Question question;
		for(survey1 = ((Survey) (((List) (survey1)).iterator())); ((Iterator) (survey1)).hasNext(); questionTypesMap.put(((Object) (question.getQuestionCode())), ((Object) (question.getQuestionType()))))
	//*  15   31:aload_1         
	//*  16   32:invokeinterface #39  <Method Iterator List.iterator()>
	//*  17   37:astore_1        
	//*  18   38:aload_1         
	//*  19   39:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//*  20   44:ifeq            78
			question = (Question)((Iterator) (survey1)).next();
	//   21   47:aload_1         
	//   22   48:invokeinterface #49  <Method Object Iterator.next()>
	//   23   53:checkcast       #51  <Class Question>
	//   24   56:astore_2        

	//   25   57:aload_0         
	//   26   58:getfield        #35  <Field Map questionTypesMap>
	//   27   61:aload_2         
	//   28   62:invokevirtual   #55  <Method String Question.getQuestionCode()>
	//   29   65:aload_2         
	//   30   66:invokevirtual   #59  <Method QuestionType Question.getQuestionType()>
	//   31   69:invokeinterface #65  <Method Object Map.put(Object, Object)>
	//   32   74:pop             
	//*  33   75:goto            38
		questionTypesMap.put("suicidality", ((Object) (QuestionType.QuestionTypeBooleanChoice)));
	//   34   78:aload_0         
	//   35   79:getfield        #35  <Field Map questionTypesMap>
	//   36   82:ldc1            #67  <String "suicidality">
	//   37   84:getstatic       #73  <Field QuestionType QuestionType.QuestionTypeBooleanChoice>
	//   38   87:invokeinterface #65  <Method Object Map.put(Object, Object)>
	//   39   92:pop             
		questionTypesMap.put("PPP_possible", ((Object) (QuestionType.QuestionTypeBooleanChoice)));
	//   40   93:aload_0         
	//   41   94:getfield        #35  <Field Map questionTypesMap>
	//   42   97:ldc1            #75  <String "PPP_possible">
	//   43   99:getstatic       #73  <Field QuestionType QuestionType.QuestionTypeBooleanChoice>
	//   44  102:invokeinterface #65  <Method Object Map.put(Object, Object)>
	//   45  107:pop             
		questionTypesMap.put("PPD_case", ((Object) (QuestionType.QuestionTypeBooleanChoice)));
	//   46  108:aload_0         
	//   47  109:getfield        #35  <Field Map questionTypesMap>
	//   48  112:ldc1            #77  <String "PPD_case">
	//   49  114:getstatic       #73  <Field QuestionType QuestionType.QuestionTypeBooleanChoice>
	//   50  117:invokeinterface #65  <Method Object Map.put(Object, Object)>
	//   51  122:pop             
	//   52  123:return          
	}

	public QuestionType get(String s)
	{
		return (QuestionType)questionTypesMap.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Map questionTypesMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #83  <Method Object Map.get(Object)>
	//    4   10:checkcast       #69  <Class QuestionType>
	//    5   13:areturn         
	}

	private Map questionTypesMap;
	private Survey survey;
}
