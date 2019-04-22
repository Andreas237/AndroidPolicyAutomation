// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.response;

import com.apollographql.apollo.api.ResponseField;

// Referenced classes of package com.apollographql.apollo.internal.response:
//			RealResponseWriter

private static class RealResponseWriter$FieldDescriptor
{

	final ResponseField field;
	final Object value;

	RealResponseWriter$FieldDescriptor(ResponseField responsefield, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		field = responsefield;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field ResponseField field>
		value = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field Object value>
	//    8   14:return          
	}
}
