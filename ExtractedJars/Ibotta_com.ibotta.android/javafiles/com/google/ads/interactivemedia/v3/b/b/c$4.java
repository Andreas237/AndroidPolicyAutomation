// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b;

import java.lang.reflect.Type;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b:
//			h, c, k

class c$4
	implements h
{

	public Object a()
	{
		Object obj;
		try
		{
			obj = d.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field k d>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field Class a>
	//    4    8:invokevirtual   #44  <Method Object k.a(Class)>
	//    5   11:astore_1        
		}
	//*   6   12:aload_1         
	//*   7   13:areturn         
		catch(Exception exception)
	//*   8   14:astore_1        
		{
			String s = String.valueOf(((Object) (b)));
	//    9   15:aload_0         
	//   10   16:getfield        #27  <Field Type b>
	//   11   19:invokestatic    #50  <Method String String.valueOf(Object)>
	//   12   22:astore_2        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 116);
	//   13   23:new             #52  <Class StringBuilder>
	//   14   26:dup             
	//   15   27:aload_2         
	//   16   28:invokestatic    #50  <Method String String.valueOf(Object)>
	//   17   31:invokevirtual   #56  <Method int String.length()>
	//   18   34:bipush          116
	//   19   36:iadd            
	//   20   37:invokespecial   #59  <Method void StringBuilder(int)>
	//   21   40:astore_3        
			stringbuilder.append("Unable to invoke no-args constructor for ");
	//   22   41:aload_3         
	//   23   42:ldc1            #61  <String "Unable to invoke no-args constructor for ">
	//   24   44:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
			stringbuilder.append(s);
	//   26   48:aload_3         
	//   27   49:aload_2         
	//   28   50:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
			stringbuilder.append(". ");
	//   30   54:aload_3         
	//   31   55:ldc1            #67  <String ". ">
	//   32   57:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   33   60:pop             
			stringbuilder.append("Register an InstanceCreator with Gson for this type may fix this problem.");
	//   34   61:aload_3         
	//   35   62:ldc1            #69  <String "Register an InstanceCreator with Gson for this type may fix this problem.">
	//   36   64:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   37   67:pop             
			throw new RuntimeException(stringbuilder.toString(), ((Throwable) (exception)));
	//   38   68:new             #71  <Class RuntimeException>
	//   39   71:dup             
	//   40   72:aload_3         
	//   41   73:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   42   76:aload_1         
	//   43   77:invokespecial   #78  <Method void RuntimeException(String, Throwable)>
	//   44   80:athrow          
		}
		return obj;
	}

	final Class a;
	final Type b;
	final c c;
	private final k d = k.a();

	c$4(c c1, Class class1, Type type)
	{
		c = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field c c>
		a = class1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field Class a>
		b = type;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field Type b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #30  <Method void Object()>
	//   11   19:aload_0         
	//   12   20:invokestatic    #35  <Method k k.a()>
	//   13   23:putfield        #37  <Field k d>
	//   14   26:return          
	}
}
