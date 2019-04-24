// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import java.lang.reflect.Type;

// Referenced classes of package com.google.gson.internal:
//			ObjectConstructor, ConstructorConstructor

class ConstructorConstructor$1
	implements ObjectConstructor
{

	public Object construct()
	{
		return val$typeCreator.createInstance(val$type);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field InstanceCreator val$typeCreator>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field Type val$type>
	//    4    8:invokeinterface #38  <Method Object InstanceCreator.createInstance(Type)>
	//    5   13:areturn         
	}

	final ConstructorConstructor this$0;
	final Type val$type;
	final InstanceCreator val$typeCreator;

	ConstructorConstructor$1()
	{
		this$0 = final_constructorconstructor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field ConstructorConstructor this$0>
		val$typeCreator = instancecreator;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field InstanceCreator val$typeCreator>
		val$type = Type.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field Type val$type>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #29  <Method void Object()>
	//   11   19:return          
	}
}
