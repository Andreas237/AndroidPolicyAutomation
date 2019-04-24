// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.lang.reflect.Type;

// Referenced classes of package com.google.gson.internal:
//			ObjectConstructor, ConstructorConstructor, UnsafeAllocator

class ConstructorConstructor$12
	implements ObjectConstructor
{

	public Object construct()
	{
		Object obj;
		try
		{
			obj = unsafeAllocator.newInstance(val$rawType);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field UnsafeAllocator unsafeAllocator>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field Class val$rawType>
	//    4    8:invokevirtual   #48  <Method Object UnsafeAllocator.newInstance(Class)>
	//    5   11:astore_1        
		}
	//*   6   12:aload_1         
	//*   7   13:areturn         
		catch(Exception exception)
	//*   8   14:astore_1        
		{
			throw new RuntimeException((new StringBuilder()).append("Unable to invoke no-args constructor for ").append(((Object) (val$type))).append(". ").append("Register an InstanceCreator with Gson for this type may fix this problem.").toString(), ((Throwable) (exception)));
	//    9   15:new             #50  <Class RuntimeException>
	//   10   18:dup             
	//   11   19:new             #52  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #53  <Method void StringBuilder()>
	//   14   26:ldc1            #55  <String "Unable to invoke no-args constructor for ">
	//   15   28:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:aload_0         
	//   17   32:getfield        #28  <Field Type val$type>
	//   18   35:invokevirtual   #62  <Method StringBuilder StringBuilder.append(Object)>
	//   19   38:ldc1            #64  <String ". ">
	//   20   40:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   21   43:ldc1            #66  <String "Register an InstanceCreator with Gson for this type may fix this problem.">
	//   22   45:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   23   48:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   24   51:aload_1         
	//   25   52:invokespecial   #73  <Method void RuntimeException(String, Throwable)>
	//   26   55:athrow          
		}
		return obj;
	}

	final ConstructorConstructor this$0;
	private final UnsafeAllocator unsafeAllocator = UnsafeAllocator.create();
	final Class val$rawType;
	final Type val$type;

	ConstructorConstructor$12()
	{
		this$0 = final_constructorconstructor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field ConstructorConstructor this$0>
		val$rawType = class1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field Class val$rawType>
		val$type = Type.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field Type val$type>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #31  <Method void Object()>
	//   11   19:aload_0         
	//   12   20:invokestatic    #37  <Method UnsafeAllocator UnsafeAllocator.create()>
	//   13   23:putfield        #39  <Field UnsafeAllocator unsafeAllocator>
	//   14   26:return          
	}
}
