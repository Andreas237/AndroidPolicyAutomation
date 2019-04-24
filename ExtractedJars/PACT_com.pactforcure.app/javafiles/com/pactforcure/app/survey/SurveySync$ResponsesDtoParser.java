// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import com.pactforcure.app.api.dto.Response;
import java.util.*;

// Referenced classes of package com.pactforcure.app.survey:
//			SurveySync, Answer

public static class SurveySync$ResponsesDtoParser
{

	public static Map fromDtoList(String s, List list)
	{
		HashMap hashmap = new HashMap(list.size());
	//    0    0:new             #16  <Class HashMap>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokeinterface #22  <Method int List.size()>
	//    4   10:invokespecial   #25  <Method void HashMap(int)>
	//    5   13:astore_2        
		Response response;
		Answer answer;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((Map) (hashmap)).put(((Object) (response.getQuestionCode())), ((Object) (answer))))
	//*   6   14:aload_1         
	//*   7   15:invokeinterface #29  <Method Iterator List.iterator()>
	//*   8   20:astore_1        
	//*   9   21:aload_1         
	//*  10   22:invokeinterface #35  <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            107
		{
			response = (Response)((Iterator) (list)).next();
	//   12   30:aload_1         
	//   13   31:invokeinterface #39  <Method Object Iterator.next()>
	//   14   36:checkcast       #41  <Class Response>
	//   15   39:astore_3        
			answer = new Answer();
	//   16   40:new             #43  <Class Answer>
	//   17   43:dup             
	//   18   44:invokespecial   #44  <Method void Answer()>
	//   19   47:astore          4
			answer.setStudyId(s);
	//   20   49:aload           4
	//   21   51:aload_0         
	//   22   52:invokevirtual   #48  <Method void Answer.setStudyId(String)>
			answer.setSurveyCode(response.getSurveyCode());
	//   23   55:aload           4
	//   24   57:aload_3         
	//   25   58:invokevirtual   #52  <Method String Response.getSurveyCode()>
	//   26   61:invokevirtual   #55  <Method void Answer.setSurveyCode(String)>
			answer.setDateAdded(response.getCreatedAt());
	//   27   64:aload           4
	//   28   66:aload_3         
	//   29   67:invokevirtual   #59  <Method java.util.Date Response.getCreatedAt()>
	//   30   70:invokevirtual   #63  <Method void Answer.setDateAdded(java.util.Date)>
			answer.setQuestionCode(response.getQuestionCode());
	//   31   73:aload           4
	//   32   75:aload_3         
	//   33   76:invokevirtual   #66  <Method String Response.getQuestionCode()>
	//   34   79:invokevirtual   #69  <Method void Answer.setQuestionCode(String)>
			answer.setValue(response.getValue());
	//   35   82:aload           4
	//   36   84:aload_3         
	//   37   85:invokevirtual   #72  <Method String Response.getValue()>
	//   38   88:invokevirtual   #75  <Method void Answer.setValue(String)>
		}

	//   39   91:aload_2         
	//   40   92:aload_3         
	//   41   93:invokevirtual   #66  <Method String Response.getQuestionCode()>
	//   42   96:aload           4
	//   43   98:invokeinterface #81  <Method Object Map.put(Object, Object)>
	//   44  103:pop             
	//*  45  104:goto            21
		return ((Map) (hashmap));
	//   46  107:aload_2         
	//   47  108:areturn         
	}

	public SurveySync$ResponsesDtoParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
