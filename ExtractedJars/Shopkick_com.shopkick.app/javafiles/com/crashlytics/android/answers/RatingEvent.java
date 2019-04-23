// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//			PredefinedEvent, AnswersAttributes

public class RatingEvent extends PredefinedEvent
{

	public RatingEvent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void PredefinedEvent()>
	//    2    4:return          
	}

	String getPredefinedType()
	{
		return "rating";
	//    0    0:ldc1            #18  <String "rating">
	//    1    2:areturn         
	}

	public RatingEvent putContentId(String s)
	{
		predefinedAttributes.put("contentId", s);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AnswersAttributes predefinedAttributes>
	//    2    4:ldc1            #9   <String "contentId">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #38  <Method void AnswersAttributes.put(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public RatingEvent putContentName(String s)
	{
		predefinedAttributes.put("contentName", s);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AnswersAttributes predefinedAttributes>
	//    2    4:ldc1            #12  <String "contentName">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #38  <Method void AnswersAttributes.put(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public RatingEvent putContentType(String s)
	{
		predefinedAttributes.put("contentType", s);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AnswersAttributes predefinedAttributes>
	//    2    4:ldc1            #15  <String "contentType">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #38  <Method void AnswersAttributes.put(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public RatingEvent putRating(int i)
	{
		predefinedAttributes.put("rating", ((Number) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AnswersAttributes predefinedAttributes>
	//    2    4:ldc1            #18  <String "rating">
	//    3    6:iload_1         
	//    4    7:invokestatic    #48  <Method Integer Integer.valueOf(int)>
	//    5   10:invokevirtual   #51  <Method void AnswersAttributes.put(String, Number)>
		return this;
	//    6   13:aload_0         
	//    7   14:areturn         
	}

	static final String CONTENT_ID_ATTRIBUTE = "contentId";
	static final String CONTENT_NAME_ATTRIBUTE = "contentName";
	static final String CONTENT_TYPE_ATTRIBUTE = "contentType";
	static final String RATING_ATTRIBUTE = "rating";
	static final String TYPE = "rating";
}
