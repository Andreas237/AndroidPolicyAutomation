// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api;


// Referenced classes of package com.apollographql.apollo.api:
//			ResponseField

public static class ResponseField$Condition
{

	public static dition booleanCondition(String s, boolean flag)
	{
		return new dition(s, flag);
	//    0    0:new             #17  <Class ResponseField$BooleanCondition>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #20  <Method void ResponseField$BooleanCondition(String, boolean)>
	//    5    9:areturn         
	}

	public static ndition typeCondition(String s)
	{
		return new ndition(s);
	//    0    0:new             #26  <Class ResponseField$TypeNameCondition>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #29  <Method void ResponseField$TypeNameCondition(String)>
	//    4    8:areturn         
	}

	ResponseField$Condition()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
