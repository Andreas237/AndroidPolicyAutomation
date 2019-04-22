// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


public class UserMetaData
{

	public UserMetaData()
	{
		this(((String) (null)), ((String) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #21  <Method void UserMetaData(String, String, String)>
	//    5    7:return          
	}

	public UserMetaData(String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		id = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field String id>
		name = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field String name>
		email = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field String email>
	//   11   19:return          
	}

	public boolean isEmpty()
	{
		return id == null && name == null && email == null;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String id>
	//    2    4:ifnonnull       23
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field String name>
	//    5   11:ifnonnull       23
	//    6   14:aload_0         
	//    7   15:getfield        #28  <Field String email>
	//    8   18:ifnonnull       23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public static final UserMetaData EMPTY = new UserMetaData();
	public final String email;
	public final String id;
	public final String name;

	static 
	{
	//    0    0:new             #2   <Class UserMetaData>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void UserMetaData()>
	//    3    7:putstatic       #17  <Field UserMetaData EMPTY>
	//*   4   10:return          
	}
}
