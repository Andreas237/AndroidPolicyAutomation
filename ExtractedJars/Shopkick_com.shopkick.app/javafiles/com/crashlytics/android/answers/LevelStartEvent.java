// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//			PredefinedEvent, AnswersAttributes

public class LevelStartEvent extends PredefinedEvent
{

	public LevelStartEvent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PredefinedEvent()>
	//    2    4:return          
	}

	String getPredefinedType()
	{
		return "levelStart";
	//    0    0:ldc1            #12  <String "levelStart">
	//    1    2:areturn         
	}

	public LevelStartEvent putLevelName(String s)
	{
		predefinedAttributes.put("levelName", s);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field AnswersAttributes predefinedAttributes>
	//    2    4:ldc1            #9   <String "levelName">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #31  <Method void AnswersAttributes.put(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	static final String LEVEL_NAME_ATTRIBUTE = "levelName";
	static final String TYPE = "levelStart";
}
