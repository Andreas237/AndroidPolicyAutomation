// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api.dto;


public class Study
{

	public Study()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field String name>
	//    2    4:areturn         
	}

	public String getStudyId()
	{
		return studyId;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String studyId>
	//    2    4:areturn         
	}

	public void setName(String s)
	{
		name = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field String name>
	//    3    5:return          
	}

	public void setStudyId(String s)
	{
		studyId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field String studyId>
	//    3    5:return          
	}

	private String name;
	private String studyId;
}
