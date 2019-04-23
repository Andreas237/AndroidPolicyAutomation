// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;


// Referenced classes of package com.facebook.share.widget:
//			CreateAppGroupDialog

public static final class CreateAppGroupDialog$Result
{

	public String getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String id>
	//    2    4:areturn         
	}

	private final String id;

	private CreateAppGroupDialog$Result(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		id = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field String id>
	//    5    9:return          
	}

	CreateAppGroupDialog$Result(String s, CreateAppGroupDialog._cls1 _pcls1)
	{
		this(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void CreateAppGroupDialog$Result(String)>
	//    3    5:return          
	}
}
