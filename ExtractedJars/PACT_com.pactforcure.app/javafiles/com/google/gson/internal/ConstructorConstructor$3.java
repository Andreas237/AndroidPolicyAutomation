// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package com.google.gson.internal:
//			ObjectConstructor, ConstructorConstructor

class ConstructorConstructor$3
	implements ObjectConstructor
{

	public Object construct()
	{
		Object obj;
		try
		{
			obj = val$constructor.newInstance(((Object []) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Constructor val$constructor>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #40  <Method Object Constructor.newInstance(Object[])>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		catch(InstantiationException instantiationexception)
	//*   7   11:astore_1        
		{
			throw new RuntimeException((new StringBuilder()).append("Failed to invoke ").append(((Object) (val$constructor))).append(" with no args").toString(), ((Throwable) (instantiationexception)));
	//    8   12:new             #42  <Class RuntimeException>
	//    9   15:dup             
	//   10   16:new             #44  <Class StringBuilder>
	//   11   19:dup             
	//   12   20:invokespecial   #45  <Method void StringBuilder()>
	//   13   23:ldc1            #47  <String "Failed to invoke ">
	//   14   25:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:aload_0         
	//   16   29:getfield        #22  <Field Constructor val$constructor>
	//   17   32:invokevirtual   #54  <Method StringBuilder StringBuilder.append(Object)>
	//   18   35:ldc1            #56  <String " with no args">
	//   19   37:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   21   43:aload_1         
	//   22   44:invokespecial   #63  <Method void RuntimeException(String, Throwable)>
	//   23   47:athrow          
		}
		catch(InvocationTargetException invocationtargetexception)
	//*  24   48:astore_1        
		{
			throw new RuntimeException((new StringBuilder()).append("Failed to invoke ").append(((Object) (val$constructor))).append(" with no args").toString(), invocationtargetexception.getTargetException());
	//   25   49:new             #42  <Class RuntimeException>
	//   26   52:dup             
	//   27   53:new             #44  <Class StringBuilder>
	//   28   56:dup             
	//   29   57:invokespecial   #45  <Method void StringBuilder()>
	//   30   60:ldc1            #47  <String "Failed to invoke ">
	//   31   62:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   32   65:aload_0         
	//   33   66:getfield        #22  <Field Constructor val$constructor>
	//   34   69:invokevirtual   #54  <Method StringBuilder StringBuilder.append(Object)>
	//   35   72:ldc1            #56  <String " with no args">
	//   36   74:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   37   77:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   38   80:aload_1         
	//   39   81:invokevirtual   #67  <Method Throwable InvocationTargetException.getTargetException()>
	//   40   84:invokespecial   #63  <Method void RuntimeException(String, Throwable)>
	//   41   87:athrow          
		}
		catch(IllegalAccessException illegalaccessexception)
	//*  42   88:astore_1        
		{
			throw new AssertionError(((Object) (illegalaccessexception)));
	//   43   89:new             #69  <Class AssertionError>
	//   44   92:dup             
	//   45   93:aload_1         
	//   46   94:invokespecial   #72  <Method void AssertionError(Object)>
	//   47   97:athrow          
		}
		return obj;
	}

	final ConstructorConstructor this$0;
	final Constructor val$constructor;

	ConstructorConstructor$3()
	{
		this$0 = final_constructorconstructor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ConstructorConstructor this$0>
		val$constructor = Constructor.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Constructor val$constructor>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
