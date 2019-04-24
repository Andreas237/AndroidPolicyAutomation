// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api.transform;

import com.pactforcure.app.survey.QuestionType;

// Referenced classes of package com.pactforcure.app.api.transform:
//			ResponseFromServerTransformerFactory

static class ResponseFromServerTransformerFactory$1
{

	static final int $SwitchMap$com$pactforcure$app$survey$QuestionType[];

	static 
	{
		$SwitchMap$com$pactforcure$app$survey$QuestionType = new int[QuestionType.values().length];
	//    0    0:invokestatic    #18  <Method QuestionType[] QuestionType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
		try
		{
			$SwitchMap$com$pactforcure$app$survey$QuestionType[QuestionType.QuestionTypeBooleanChoice.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
	//    5   12:getstatic       #24  <Field QuestionType QuestionType.QuestionTypeBooleanChoice>
	//    6   15:invokevirtual   #28  <Method int QuestionType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
	//    9   20:return          
		}
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   21:astore_0        
	//*  11   22:return          
	}
}
