// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//			UnwrappingBeanPropertyWriter

class UnwrappingBeanPropertyWriter$1 extends com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base
{

	public JsonObjectFormatVisitor expectObjectFormat(JavaType javatype)
		throws JsonMappingException
	{
		return val$visitor;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonObjectFormatVisitor val$visitor>
	//    2    4:areturn         
	}

	final UnwrappingBeanPropertyWriter this$0;
	final JsonObjectFormatVisitor val$visitor;

	UnwrappingBeanPropertyWriter$1(JsonObjectFormatVisitor jsonobjectformatvisitor)
	{
		this$0 = final_unwrappingbeanpropertywriter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field UnwrappingBeanPropertyWriter this$0>
		val$visitor = jsonobjectformatvisitor;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #19  <Field JsonObjectFormatVisitor val$visitor>
		super(SerializerProvider.this);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #22  <Method void com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base(SerializerProvider)>
	//    9   15:return          
	}
}
