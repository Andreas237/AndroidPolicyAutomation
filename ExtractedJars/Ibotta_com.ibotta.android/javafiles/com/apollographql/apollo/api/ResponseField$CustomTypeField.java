// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api;

import java.util.List;
import java.util.Map;

// Referenced classes of package com.apollographql.apollo.api:
//			ResponseField, ScalarType

public static final class ResponseField$CustomTypeField extends ResponseField
{

	public ScalarType scalarType()
	{
		return scalarType;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ScalarType scalarType>
	//    2    4:areturn         
	}

	private final ScalarType scalarType;

	ResponseField$CustomTypeField(String s, String s1, Map map, boolean flag, ScalarType scalartype, List list)
	{
		super(ResponseField.Type.CUSTOM, s, s1, map, flag, list);
	//    0    0:aload_0         
	//    1    1:getstatic       #15  <Field ResponseField$Type ResponseField$Type.CUSTOM>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:aload           6
	//    7   11:invokespecial   #18  <Method void ResponseField(ResponseField$Type, String, String, Map, boolean, List)>
		scalarType = scalartype;
	//    8   14:aload_0         
	//    9   15:aload           5
	//   10   17:putfield        #20  <Field ScalarType scalarType>
	//   11   20:return          
	}
}
