// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//			PredefinedEvent, AnswersAttributes

public class ContentViewEvent extends PredefinedEvent
{

	public ContentViewEvent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void PredefinedEvent()>
	//    2    4:return          
	}

	String getPredefinedType()
	{
		return "contentView";
	//    0    0:ldc1            #18  <String "contentView">
	//    1    2:areturn         
	}

	public ContentViewEvent putContentId(String s)
	{
		predefinedAttributes.put("contentId", s);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field AnswersAttributes predefinedAttributes>
	//    2    4:ldc1            #9   <String "contentId">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #37  <Method void AnswersAttributes.put(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public ContentViewEvent putContentName(String s)
	{
		predefinedAttributes.put("contentName", s);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field AnswersAttributes predefinedAttributes>
	//    2    4:ldc1            #12  <String "contentName">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #37  <Method void AnswersAttributes.put(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public ContentViewEvent putContentType(String s)
	{
		predefinedAttributes.put("contentType", s);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field AnswersAttributes predefinedAttributes>
	//    2    4:ldc1            #15  <String "contentType">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #37  <Method void AnswersAttributes.put(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	static final String CONTENT_ID_ATTRIBUTE = "contentId";
	static final String CONTENT_NAME_ATTRIBUTE = "contentName";
	static final String CONTENT_TYPE_ATTRIBUTE = "contentType";
	static final String TYPE = "contentView";
}
