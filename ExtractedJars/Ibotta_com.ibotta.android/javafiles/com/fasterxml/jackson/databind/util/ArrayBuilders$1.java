// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			ArrayBuilders, ClassUtil

static final class ArrayBuilders$1
{

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!ClassUtil.hasClass(obj, val$defaultValueType))
	//*   5    7:aload_1         
	//*   6    8:aload_0         
	//*   7    9:getfield        #19  <Field Class val$defaultValueType>
	//*   8   12:invokestatic    #35  <Method boolean ClassUtil.hasClass(Object, Class)>
	//*   9   15:ifne            20
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
		if(Array.getLength(obj) != val$length)
	//*  12   20:aload_1         
	//*  13   21:invokestatic    #41  <Method int Array.getLength(Object)>
	//*  14   24:aload_0         
	//*  15   25:getfield        #21  <Field int val$length>
	//*  16   28:icmpeq          33
			return false;
	//   17   31:iconst_0        
	//   18   32:ireturn         
		for(int i = 0; i < val$length; i++)
	//*  19   33:iconst_0        
	//*  20   34:istore_2        
	//*  21   35:iload_2         
	//*  22   36:aload_0         
	//*  23   37:getfield        #21  <Field int val$length>
	//*  24   40:icmpge          90
		{
			Object obj1 = Array.get(val$defaultValue, i);
	//   25   43:aload_0         
	//   26   44:getfield        #23  <Field Object val$defaultValue>
	//   27   47:iload_2         
	//   28   48:invokestatic    #45  <Method Object Array.get(Object, int)>
	//   29   51:astore_3        
			Object obj2 = Array.get(obj, i);
	//   30   52:aload_1         
	//   31   53:iload_2         
	//   32   54:invokestatic    #45  <Method Object Array.get(Object, int)>
	//   33   57:astore          4
			if(obj1 != obj2 && obj1 != null && !obj1.equals(obj2))
	//*  34   59:aload_3         
	//*  35   60:aload           4
	//*  36   62:if_acmpne       68
	//*  37   65:goto            83
	//*  38   68:aload_3         
	//*  39   69:ifnull          83
	//*  40   72:aload_3         
	//*  41   73:aload           4
	//*  42   75:invokevirtual   #47  <Method boolean Object.equals(Object)>
	//*  43   78:ifne            83
				return false;
	//   44   81:iconst_0        
	//   45   82:ireturn         
		}

	//   46   83:iload_2         
	//   47   84:iconst_1        
	//   48   85:iadd            
	//   49   86:istore_2        
	//*  50   87:goto            35
		return true;
	//   51   90:iconst_1        
	//   52   91:ireturn         
	}

	final Object val$defaultValue;
	final Class val$defaultValueType;
	final int val$length;

	ArrayBuilders$1(Class class1, int i, Object obj)
	{
		val$defaultValueType = class1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Class val$defaultValueType>
		val$length = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field int val$length>
		val$defaultValue = obj;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field Object val$defaultValue>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void Object()>
	//   11   19:return          
	}
}
