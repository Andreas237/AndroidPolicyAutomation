// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import com.raizlabs.android.dbflow.structure.BaseModel;
import java.io.Serializable;
import java.util.Date;

public class Answer extends BaseModel
	implements Serializable
{

	public Answer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void BaseModel()>
	//    2    4:return          
	}

	public Answer(String s, String s1, String s2, String s3)
	{
		this(s, s1, s2, s3, s3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           4
	//    6    8:invokespecial   #27  <Method void Answer(String, String, String, String, String)>
	//    7   11:return          
	}

	public Answer(String s, String s1, String s2, String s3, String s4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void BaseModel()>
		studyId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field String studyId>
		surveyCode = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field String surveyCode>
		questionCode = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #33  <Field String questionCode>
		value = s3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #35  <Field String value>
		formattedValue = s4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #37  <Field String formattedValue>
		dateAdded = new Date();
	//   17   31:aload_0         
	//   18   32:new             #39  <Class Date>
	//   19   35:dup             
	//   20   36:invokespecial   #40  <Method void Date()>
	//   21   39:putfield        #42  <Field Date dateAdded>
	//   22   42:return          
	}

	public Date getDateAdded()
	{
		return dateAdded;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Date dateAdded>
	//    2    4:areturn         
	}

	public String getFormattedValue()
	{
		return formattedValue;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String formattedValue>
	//    2    4:areturn         
	}

	public long getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field long id>
	//    2    4:lreturn         
	}

	public String getQuestionCode()
	{
		return questionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String questionCode>
	//    2    4:areturn         
	}

	public String getStudyId()
	{
		return studyId;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String studyId>
	//    2    4:areturn         
	}

	public String getSurveyCode()
	{
		return surveyCode;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String surveyCode>
	//    2    4:areturn         
	}

	public String getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String value>
	//    2    4:areturn         
	}

	public boolean isUploaded()
	{
		return isUploaded;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field boolean isUploaded>
	//    2    4:ireturn         
	}

	public void setDateAdded(Date date)
	{
		dateAdded = date;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field Date dateAdded>
	//    3    5:return          
	}

	public void setFormattedValue(String s)
	{
		formattedValue = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String formattedValue>
	//    3    5:return          
	}

	public void setId(long l)
	{
		id = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #50  <Field long id>
	//    3    5:return          
	}

	public void setQuestionCode(String s)
	{
		questionCode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field String questionCode>
	//    3    5:return          
	}

	public void setStudyId(String s)
	{
		studyId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field String studyId>
	//    3    5:return          
	}

	public void setSurveyCode(String s)
	{
		surveyCode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field String surveyCode>
	//    3    5:return          
	}

	public void setUploaded(boolean flag)
	{
		isUploaded = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field boolean isUploaded>
	//    3    5:return          
	}

	public void setValue(String s)
	{
		value = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field String value>
	//    3    5:return          
	}

	Date dateAdded;
	String formattedValue;
	long id;
	boolean isUploaded;
	String questionCode;
	String studyId;
	String surveyCode;
	String value;
}
