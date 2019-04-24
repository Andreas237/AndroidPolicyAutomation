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
	//*   7   11:astore_1        
	//*   8   12:new             #42  <Class AssertionError>
	//*   9   15:dup             
	//*  10   16:aload_1         
	//*  11   17:invokespecial   #45  <Method void AssertionError(Object)>
	//*  12   20:athrow          
	//*  13   21:astore_1        
	//*  14   22:new             #47  <Class StringBuilder>
	//*  15   25:dup             
	//*  16   26:invokespecial   #48  <Method void StringBuilder()>
	//*  17   29:astore_2        
	//*  18   30:aload_2         
	//*  19   31:ldc1            #50  <String "Failed to invoke ">
	//*  20   33:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*  21   36:pop             
	//*  22   37:aload_2         
	//*  23   38:aload_0         
	//*  24   39:getfield        #22  <Field Constructor val$constructor>
	//*  25   42:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
	//*  26   45:pop             
	//*  27   46:aload_2         
	//*  28   47:ldc1            #59  <String " with no args">
	//*  29   49:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*  30   52:pop             
	//*  31   53:new             #61  <Class RuntimeException>
	//*  32   56:dup             
	//*  33   57:aload_2         
	//*  34   58:invokevirtual   #65  <Method String StringBuilder.toString()>
	//*  35   61:aload_1         
	//*  36   62:invokevirtual   #69  <Method Throwable InvocationTargetException.getTargetException()>
	//*  37   65:invokespecial   #72  <Method void RuntimeException(String, Throwable)>
	//*  38   68:athrow          
		catch(InstantiationException instantiationexception)
	//*  39   69:astore_1        
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   40   70:new             #47  <Class StringBuilder>
	//   41   73:dup             
	//   42   74:invokespecial   #48  <Method void StringBuilder()>
	//   43   77:astore_2        
			stringbuilder1.append("Failed to invoke ");
	//   44   78:aload_2         
	//   45   79:ldc1            #50  <String "Failed to invoke ">
	//   46   81:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   47   84:pop             
			stringbuilder1.append(((Object) (val$constructor)));
	//   48   85:aload_2         
	//   49   86:aload_0         
	//   50   87:getfield        #22  <Field Constructor val$constructor>
	//   51   90:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
	//   52   93:pop             
			stringbuilder1.append(" with no args");
	//   53   94:aload_2         
	//   54   95:ldc1            #59  <String " with no args">
	//   55   97:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   56  100:pop             
			throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (instantiationexception)));
	//   57  101:new             #61  <Class RuntimeException>
	//   58  104:dup             
	//   59  105:aload_2         
	//   60  106:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   61  109:aload_1         
	//   62  110:invokespecial   #72  <Method void RuntimeException(String, Throwable)>
	//   63  113:athrow          
		}
		catch(InvocationTargetException invocationtargetexception)
		{
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append("Failed to invoke ");
			stringbuilder.append(((Object) (val$constructor)));
			stringbuilder.append(" with no args");
			throw new RuntimeException(stringbuilder.toString(), invocationtargetexception.getTargetException());
		}
		catch(IllegalAccessException illegalaccessexception)
		{
			throw new AssertionError(((Object) (illegalaccessexception)));
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
