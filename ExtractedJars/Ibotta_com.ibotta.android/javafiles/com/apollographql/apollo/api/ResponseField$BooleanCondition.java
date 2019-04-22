// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api;

import com.apollographql.apollo.api.internal.Utils;

// Referenced classes of package com.apollographql.apollo.api:
//			ResponseField

public static final class ResponseField$BooleanCondition extends ResponseField.Condition
{

	public boolean inverted()
	{
		return inverted;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field boolean inverted>
	//    2    4:ireturn         
	}

	public String variableName()
	{
		return variableName;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String variableName>
	//    2    4:areturn         
	}

	private final boolean inverted;
	private final String variableName;

	ResponseField$BooleanCondition(String s, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void ResponseField$Condition()>
		variableName = (String)Utils.checkNotNull(((Object) (s)), "variableName == null");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #19  <String "variableName == null">
	//    5    8:invokestatic    #25  <Method Object Utils.checkNotNull(Object, Object)>
	//    6   11:checkcast       #27  <Class String>
	//    7   14:putfield        #29  <Field String variableName>
		inverted = flag;
	//    8   17:aload_0         
	//    9   18:iload_2         
	//   10   19:putfield        #31  <Field boolean inverted>
	//   11   22:return          
	}
}
