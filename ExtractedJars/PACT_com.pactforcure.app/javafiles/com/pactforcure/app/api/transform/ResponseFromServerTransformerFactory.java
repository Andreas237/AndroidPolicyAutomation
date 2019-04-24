// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api.transform;

import com.pactforcure.app.survey.QuestionType;

// Referenced classes of package com.pactforcure.app.api.transform:
//			InnocuousResponseFromServerTransformer, BooleanResponseFromServerTransformer, ResponseFromServerValueTransformer

public class ResponseFromServerTransformerFactory
{

	public ResponseFromServerTransformerFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static ResponseFromServerValueTransformer forQuestionType(QuestionType questiontype)
	{
		if(questiontype == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
			return ((ResponseFromServerValueTransformer) (new InnocuousResponseFromServerTransformer()));
	//    2    4:new             #15  <Class InnocuousResponseFromServerTransformer>
	//    3    7:dup             
	//    4    8:invokespecial   #16  <Method void InnocuousResponseFromServerTransformer()>
	//    5   11:areturn         
		static class _cls1
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

		switch(_cls1..SwitchMap.com.pactforcure.app.survey.QuestionType[questiontype.ordinal()])
	//*   6   12:getstatic       #20  <Field int[] ResponseFromServerTransformerFactory$1.$SwitchMap$com$pactforcure$app$survey$QuestionType>
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #26  <Method int QuestionType.ordinal()>
	//*   9   19:iaload          
		{
	//*  10   20:tableswitch     1 1: default 40
	//	               1 48
		default:
			return ((ResponseFromServerValueTransformer) (new InnocuousResponseFromServerTransformer()));
	//   11   40:new             #15  <Class InnocuousResponseFromServerTransformer>
	//   12   43:dup             
	//   13   44:invokespecial   #16  <Method void InnocuousResponseFromServerTransformer()>
	//   14   47:areturn         

		case 1: // '\001'
			return ((ResponseFromServerValueTransformer) (new BooleanResponseFromServerTransformer()));
	//   15   48:new             #28  <Class BooleanResponseFromServerTransformer>
	//   16   51:dup             
	//   17   52:invokespecial   #29  <Method void BooleanResponseFromServerTransformer()>
	//   18   55:areturn         
		}
	}
}
