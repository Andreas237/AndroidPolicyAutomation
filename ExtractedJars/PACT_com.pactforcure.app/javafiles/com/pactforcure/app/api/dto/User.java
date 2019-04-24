// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api.dto;


// Referenced classes of package com.pactforcure.app.api.dto:
//			Attributes

public class User
{

	public User()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public Attributes getAttributes()
	{
		return attributes;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Attributes attributes>
	//    2    4:areturn         
	}

	public String getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String id>
	//    2    4:areturn         
	}

	public String getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String type>
	//    2    4:areturn         
	}

	public void setAttributes(Attributes attributes1)
	{
		attributes = attributes1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Attributes attributes>
	//    3    5:return          
	}

	public void setId(String s)
	{
		id = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field String id>
	//    3    5:return          
	}

	public void setType(String s)
	{
		type = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field String type>
	//    3    5:return          
	}

	private Attributes attributes;
	private String id;
	private String type;
}
