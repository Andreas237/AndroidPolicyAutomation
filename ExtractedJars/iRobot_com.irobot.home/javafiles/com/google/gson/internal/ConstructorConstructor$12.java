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
			StringBuilder stringbuilder = new StringBuilder();
	//    9   15:new             #50  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #51  <Method void StringBuilder()>
	//   12   22:astore_2        
			stringbuilder.append("Unable to invoke no-args constructor for ");
	//   13   23:aload_2         
	//   14   24:ldc1            #53  <String "Unable to invoke no-args constructor for ">
	//   15   26:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
			stringbuilder.append(((Object) (val$type)));
	//   17   30:aload_2         
	//   18   31:aload_0         
	//   19   32:getfield        #28  <Field Type val$type>
	//   20   35:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   21   38:pop             
			stringbuilder.append(". ");
	//   22   39:aload_2         
	//   23   40:ldc1            #62  <String ". ">
	//   24   42:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   25   45:pop             
			stringbuilder.append("Register an InstanceCreator with Gson for this type may fix this problem.");
	//   26   46:aload_2         
	//   27   47:ldc1            #64  <String "Register an InstanceCreator with Gson for this type may fix this problem.">
	//   28   49:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   29   52:pop             
			throw new RuntimeException(stringbuilder.toString(), ((Throwable) (exception)));
	//   30   53:new             #66  <Class RuntimeException>
	//   31   56:dup             
	//   32   57:aload_2         
	//   33   58:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   34   61:aload_1         
	//   35   62:invokespecial   #73  <Method void RuntimeException(String, Throwable)>
	//   36   65:athrow          
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
