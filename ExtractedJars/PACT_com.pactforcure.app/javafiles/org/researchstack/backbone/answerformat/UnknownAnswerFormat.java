// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.researchstack.backbone.answerformat;


// Referenced classes of package org.researchstack.backbone.answerformat:
//			AnswerFormat

public class UnknownAnswerFormat extends AnswerFormat
{

	public UnknownAnswerFormat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void AnswerFormat()>
	//    2    4:return          
	}

	public AnswerFormat.QuestionType getQuestionType()
	{
		return ((AnswerFormat.QuestionType) (AnswerFormat.Type.None));
	//    0    0:getstatic       #18  <Field AnswerFormat$Type AnswerFormat$Type.None>
	//    1    3:areturn         
	}
}
