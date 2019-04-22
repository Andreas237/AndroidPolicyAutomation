// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api;

import com.apollographql.apollo.api.internal.Utils;

// Referenced classes of package com.apollographql.apollo.api:
//			ResponseField

public static final class ResponseField$TypeNameCondition extends ResponseField.Condition
{

	public String typeName()
	{
		return typeName;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String typeName>
	//    2    4:areturn         
	}

	private final String typeName;

	ResponseField$TypeNameCondition(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ResponseField$Condition()>
		typeName = (String)Utils.checkNotNull(((Object) (s)), "typeName == null");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #16  <String "typeName == null">
	//    5    8:invokestatic    #22  <Method Object Utils.checkNotNull(Object, Object)>
	//    6   11:checkcast       #24  <Class String>
	//    7   14:putfield        #26  <Field String typeName>
	//    8   17:return          
	}
}
