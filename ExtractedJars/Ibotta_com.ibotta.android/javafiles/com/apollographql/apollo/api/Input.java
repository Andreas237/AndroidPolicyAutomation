// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api;


public final class Input
{

	private Input(Object obj, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		value = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Object value>
		defined = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field boolean defined>
	//    8   14:return          
	}

	public static Input absent()
	{
		return new Input(((Object) (null)), false);
	//    0    0:new             #2   <Class Input>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:iconst_0        
	//    4    6:invokespecial   #27  <Method void Input(Object, boolean)>
	//    5    9:areturn         
	}

	public static Input fromNullable(Object obj)
	{
		return new Input(obj, true);
	//    0    0:new             #2   <Class Input>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokespecial   #27  <Method void Input(Object, boolean)>
	//    5    9:areturn         
	}

	public final boolean defined;
	public final Object value;
}
