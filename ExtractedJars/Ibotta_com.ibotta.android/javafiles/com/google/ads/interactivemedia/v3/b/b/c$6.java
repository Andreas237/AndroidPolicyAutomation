// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b:
//			h, c

class c$6
	implements h
{

	public Object a()
	{
		Object obj;
		try
		{
			obj = a.newInstance(((Object []) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Constructor a>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #38  <Method Object Constructor.newInstance(Object[])>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
	//*   7   11:astore_1        
	//*   8   12:new             #40  <Class AssertionError>
	//*   9   15:dup             
	//*  10   16:aload_1         
	//*  11   17:invokespecial   #43  <Method void AssertionError(Object)>
	//*  12   20:athrow          
	//*  13   21:astore_1        
	//*  14   22:aload_0         
	//*  15   23:getfield        #21  <Field Constructor a>
	//*  16   26:invokestatic    #49  <Method String String.valueOf(Object)>
	//*  17   29:astore_2        
	//*  18   30:new             #51  <Class StringBuilder>
	//*  19   33:dup             
	//*  20   34:aload_2         
	//*  21   35:invokestatic    #49  <Method String String.valueOf(Object)>
	//*  22   38:invokevirtual   #55  <Method int String.length()>
	//*  23   41:bipush          30
	//*  24   43:iadd            
	//*  25   44:invokespecial   #58  <Method void StringBuilder(int)>
	//*  26   47:astore_3        
	//*  27   48:aload_3         
	//*  28   49:ldc1            #60  <String "Failed to invoke ">
	//*  29   51:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//*  30   54:pop             
	//*  31   55:aload_3         
	//*  32   56:aload_2         
	//*  33   57:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//*  34   60:pop             
	//*  35   61:aload_3         
	//*  36   62:ldc1            #66  <String " with no args">
	//*  37   64:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//*  38   67:pop             
	//*  39   68:new             #68  <Class RuntimeException>
	//*  40   71:dup             
	//*  41   72:aload_3         
	//*  42   73:invokevirtual   #72  <Method String StringBuilder.toString()>
	//*  43   76:aload_1         
	//*  44   77:invokevirtual   #76  <Method Throwable InvocationTargetException.getTargetException()>
	//*  45   80:invokespecial   #79  <Method void RuntimeException(String, Throwable)>
	//*  46   83:athrow          
		catch(InstantiationException instantiationexception)
	//*  47   84:astore_1        
		{
			String s1 = String.valueOf(((Object) (a)));
	//   48   85:aload_0         
	//   49   86:getfield        #21  <Field Constructor a>
	//   50   89:invokestatic    #49  <Method String String.valueOf(Object)>
	//   51   92:astore_2        
			StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (s1))).length() + 30);
	//   52   93:new             #51  <Class StringBuilder>
	//   53   96:dup             
	//   54   97:aload_2         
	//   55   98:invokestatic    #49  <Method String String.valueOf(Object)>
	//   56  101:invokevirtual   #55  <Method int String.length()>
	//   57  104:bipush          30
	//   58  106:iadd            
	//   59  107:invokespecial   #58  <Method void StringBuilder(int)>
	//   60  110:astore_3        
			stringbuilder1.append("Failed to invoke ");
	//   61  111:aload_3         
	//   62  112:ldc1            #60  <String "Failed to invoke ">
	//   63  114:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   64  117:pop             
			stringbuilder1.append(s1);
	//   65  118:aload_3         
	//   66  119:aload_2         
	//   67  120:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   68  123:pop             
			stringbuilder1.append(" with no args");
	//   69  124:aload_3         
	//   70  125:ldc1            #66  <String " with no args">
	//   71  127:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   72  130:pop             
			throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (instantiationexception)));
	//   73  131:new             #68  <Class RuntimeException>
	//   74  134:dup             
	//   75  135:aload_3         
	//   76  136:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   77  139:aload_1         
	//   78  140:invokespecial   #79  <Method void RuntimeException(String, Throwable)>
	//   79  143:athrow          
		}
		catch(InvocationTargetException invocationtargetexception)
		{
			String s = String.valueOf(((Object) (a)));
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 30);
			stringbuilder.append("Failed to invoke ");
			stringbuilder.append(s);
			stringbuilder.append(" with no args");
			throw new RuntimeException(stringbuilder.toString(), invocationtargetexception.getTargetException());
		}
		catch(IllegalAccessException illegalaccessexception)
		{
			throw new AssertionError(((Object) (illegalaccessexception)));
		}
		return obj;
	}

	final Constructor a;
	final c b;

	c$6(c c1, Constructor constructor)
	{
		b = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field c b>
		a = constructor;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Constructor a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
