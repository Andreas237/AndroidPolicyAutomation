// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//			PredefinedEvent, AnswersAttributes

public class LevelEndEvent extends PredefinedEvent
{

	public LevelEndEvent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void PredefinedEvent()>
	//    2    4:return          
	}

	String getPredefinedType()
	{
		return "levelEnd";
	//    0    0:ldc1            #18  <String "levelEnd">
	//    1    2:areturn         
	}

	public LevelEndEvent putLevelName(String s)
	{
		predefinedAttributes.put("levelName", s);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field AnswersAttributes predefinedAttributes>
	//    2    4:ldc1            #9   <String "levelName">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #37  <Method void AnswersAttributes.put(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public LevelEndEvent putScore(Number number)
	{
		predefinedAttributes.put("score", number);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field AnswersAttributes predefinedAttributes>
	//    2    4:ldc1            #12  <String "score">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #42  <Method void AnswersAttributes.put(String, Number)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public LevelEndEvent putSuccess(boolean flag)
	{
		AnswersAttributes answersattributes = predefinedAttributes;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field AnswersAttributes predefinedAttributes>
	//    2    4:astore_3        
		String s;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            21
			s = "true";
	//    5    9:ldc1            #46  <String "true">
	//    6   11:astore_2        
		else
	//*   7   12:aload_3         
	//*   8   13:ldc1            #15  <String "success">
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #37  <Method void AnswersAttributes.put(String, String)>
	//*  11   19:aload_0         
	//*  12   20:areturn         
			s = "false";
	//   13   21:ldc1            #48  <String "false">
	//   14   23:astore_2        
		answersattributes.put("success", s);
		return this;
	//*  15   24:goto            12
	}

	static final String LEVEL_NAME_ATTRIBUTE = "levelName";
	static final String SCORE_ATTRIBUTE = "score";
	static final String SUCCESS_ATTRIBUTE = "success";
	static final String TYPE = "levelEnd";
}
