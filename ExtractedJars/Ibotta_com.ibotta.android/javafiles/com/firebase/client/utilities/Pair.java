// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.utilities;


public class Pair
{

	public Pair(Object obj, Object obj1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		first = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Object first>
		second = obj1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field Object second>
	//    8   14:return          
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          93
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #28  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #28  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((Pair)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class Pair>
	//   16   28:astore_1        
			Object obj1 = first;
	//   17   29:aload_0         
	//   18   30:getfield        #17  <Field Object first>
	//   19   33:astore_2        
			if(obj1 != null)
	//*  20   34:aload_2         
	//*  21   35:ifnull          51
			{
				if(!obj1.equals(((Pair) (obj)).first))
	//*  22   38:aload_2         
	//*  23   39:aload_1         
	//*  24   40:getfield        #17  <Field Object first>
	//*  25   43:invokevirtual   #30  <Method boolean Object.equals(Object)>
	//*  26   46:ifne            60
					return false;
	//   27   49:iconst_0        
	//   28   50:ireturn         
			} else
			if(((Pair) (obj)).first != null)
	//*  29   51:aload_1         
	//*  30   52:getfield        #17  <Field Object first>
	//*  31   55:ifnull          60
				return false;
	//   32   58:iconst_0        
	//   33   59:ireturn         
			obj1 = second;
	//   34   60:aload_0         
	//   35   61:getfield        #19  <Field Object second>
	//   36   64:astore_2        
			if(obj1 != null)
	//*  37   65:aload_2         
	//*  38   66:ifnull          82
			{
				if(!obj1.equals(((Pair) (obj)).second))
	//*  39   69:aload_2         
	//*  40   70:aload_1         
	//*  41   71:getfield        #19  <Field Object second>
	//*  42   74:invokevirtual   #30  <Method boolean Object.equals(Object)>
	//*  43   77:ifne            91
					return false;
	//   44   80:iconst_0        
	//   45   81:ireturn         
			} else
			if(((Pair) (obj)).second != null)
	//*  46   82:aload_1         
	//*  47   83:getfield        #19  <Field Object second>
	//*  48   86:ifnull          91
				return false;
	//   49   89:iconst_0        
	//   50   90:ireturn         
			return true;
	//   51   91:iconst_1        
	//   52   92:ireturn         
		} else
		{
			return false;
	//   53   93:iconst_0        
	//   54   94:ireturn         
		}
	}

	public Object getFirst()
	{
		return first;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Object first>
	//    2    4:areturn         
	}

	public Object getSecond()
	{
		return second;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object second>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		Object obj = first;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Object first>
	//    2    4:astore_3        
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		int i;
		if(obj != null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          19
			i = obj.hashCode();
	//    7   11:aload_3         
	//    8   12:invokevirtual   #39  <Method int Object.hashCode()>
	//    9   15:istore_1        
		else
	//*  10   16:goto            21
			i = 0;
	//   11   19:iconst_0        
	//   12   20:istore_1        
		obj = second;
	//   13   21:aload_0         
	//   14   22:getfield        #19  <Field Object second>
	//   15   25:astore_3        
		if(obj != null)
	//*  16   26:aload_3         
	//*  17   27:ifnull          35
			j = obj.hashCode();
	//   18   30:aload_3         
	//   19   31:invokevirtual   #39  <Method int Object.hashCode()>
	//   20   34:istore_2        
		return i * 31 + j;
	//   21   35:iload_1         
	//   22   36:bipush          31
	//   23   38:imul            
	//   24   39:iload_2         
	//   25   40:iadd            
	//   26   41:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #43  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Pair(");
	//    4    8:aload_1         
	//    5    9:ldc1            #46  <String "Pair(">
	//    6   11:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(first);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #17  <Field Object first>
	//   11   20:invokevirtual   #53  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(",");
	//   13   24:aload_1         
	//   14   25:ldc1            #55  <String ",">
	//   15   27:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(second);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #19  <Field Object second>
	//   20   36:invokevirtual   #53  <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append(")");
	//   22   40:aload_1         
	//   23   41:ldc1            #57  <String ")">
	//   24   43:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   28   51:areturn         
	}

	private final Object first;
	private final Object second;
}
