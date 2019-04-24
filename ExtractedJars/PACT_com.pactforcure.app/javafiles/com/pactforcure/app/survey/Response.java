// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import java.io.Serializable;
import java.util.Date;

// Referenced classes of package com.pactforcure.app.survey:
//			Survey

public class Response
	implements Serializable
{

	public Response()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public Response(String s, String s1, String s2, Date date)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		questionCode = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field String questionCode>
		value = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field String value>
		surveyCode = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #30  <Field String surveyCode>
		dateAdded = date;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #32  <Field Date dateAdded>
	//   14   25:return          
	}

	public Boolean getCompleted()
	{
		return isCompleted;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Boolean isCompleted>
	//    2    4:areturn         
	}

	public Date getDateAdded()
	{
		return dateAdded;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Date dateAdded>
	//    2    4:areturn         
	}

	public String getQuestionCode()
	{
		return questionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String questionCode>
	//    2    4:areturn         
	}

	public Survey getSurvey()
	{
		return survey;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Survey survey>
	//    2    4:areturn         
	}

	public String getSurveyCode()
	{
		return surveyCode;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String surveyCode>
	//    2    4:areturn         
	}

	public Boolean getUploaded()
	{
		return isUploaded;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Boolean isUploaded>
	//    2    4:areturn         
	}

	public String getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String value>
	//    2    4:areturn         
	}

	public String getValueFormatted()
	{
		return valueFormatted;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String valueFormatted>
	//    2    4:areturn         
	}

	public void setCompleted(Boolean boolean1)
	{
		isCompleted = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field Boolean isCompleted>
	//    3    5:return          
	}

	public void setDateAdded(Date date)
	{
		dateAdded = date;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field Date dateAdded>
	//    3    5:return          
	}

	public void setQuestionCode(String s)
	{
		questionCode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field String questionCode>
	//    3    5:return          
	}

	public void setSurvey(Survey survey1)
	{
		survey = survey1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field Survey survey>
	//    3    5:return          
	}

	public void setSurveyCode(String s)
	{
		surveyCode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field String surveyCode>
	//    3    5:return          
	}

	public void setUploaded(Boolean boolean1)
	{
		isUploaded = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field Boolean isUploaded>
	//    3    5:return          
	}

	public void setValue(String s)
	{
		value = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field String value>
	//    3    5:return          
	}

	public void setValueFormatted(String s)
	{
		valueFormatted = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field String valueFormatted>
	//    3    5:return          
	}

	private Date dateAdded;
	private Boolean isCompleted;
	private Boolean isUploaded;
	private String questionCode;
	private Survey survey;
	private String surveyCode;
	private String value;
	private String valueFormatted;
}
