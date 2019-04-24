// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			ArrayBuilders

static final class ArrayBuilders$1
{

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(obj == null || obj.getClass() != val$defaultValueType)
	//*   5    7:aload_1         
	//*   6    8:ifnull          22
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #33  <Method Class Object.getClass()>
	//*   9   15:aload_0         
	//*  10   16:getfield        #19  <Field Class val$defaultValueType>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			if(Array.getLength(obj) != val$length)
	//*  14   24:aload_1         
	//*  15   25:invokestatic    #39  <Method int Array.getLength(Object)>
	//*  16   28:aload_0         
	//*  17   29:getfield        #21  <Field int val$length>
	//*  18   32:icmpeq          37
				return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
			int i = 0;
	//   21   37:iconst_0        
	//   22   38:istore_2        
			while(i < val$length) 
	//*  23   39:iload_2         
	//*  24   40:aload_0         
	//*  25   41:getfield        #21  <Field int val$length>
	//*  26   44:icmpge          5
			{
				Object obj1 = Array.get(val$defaultValue, i);
	//   27   47:aload_0         
	//   28   48:getfield        #23  <Field Object val$defaultValue>
	//   29   51:iload_2         
	//   30   52:invokestatic    #43  <Method Object Array.get(Object, int)>
	//   31   55:astore_3        
				Object obj2 = Array.get(obj, i);
	//   32   56:aload_1         
	//   33   57:iload_2         
	//   34   58:invokestatic    #43  <Method Object Array.get(Object, int)>
	//   35   61:astore          4
				if(obj1 == obj2 || obj1 == null || obj1.equals(obj2))
	//*  36   63:aload_3         
	//*  37   64:aload           4
	//*  38   66:if_acmpne       76
					i++;
	//   39   69:iload_2         
	//   40   70:iconst_1        
	//   41   71:iadd            
	//   42   72:istore_2        
				else
	//*  43   73:goto            39
	//*  44   76:aload_3         
	//*  45   77:ifnull          69
	//*  46   80:aload_3         
	//*  47   81:aload           4
	//*  48   83:invokevirtual   #45  <Method boolean Object.equals(Object)>
	//*  49   86:ifne            69
					return false;
	//   50   89:iconst_0        
	//   51   90:ireturn         
			}
		}
		return true;
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
