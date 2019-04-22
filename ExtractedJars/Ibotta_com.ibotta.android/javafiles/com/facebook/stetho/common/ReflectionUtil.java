// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common;

import java.lang.reflect.Field;

// Referenced classes of package com.facebook.stetho.common:
//			LogUtil

public final class ReflectionUtil
{

	private ReflectionUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Object getFieldValue(Field field, Object obj)
	{
		try
		{
			field = ((Field) (field.get(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #20  <Method Object Field.get(Object)>
	//    3    5:astore_0        
		}
	//*   4    6:aload_0         
	//*   5    7:areturn         
		// Misplaced declaration of an exception variable
		catch(Field field)
	//*   6    8:astore_0        
		{
			throw new RuntimeException(((Throwable) (field)));
	//    7    9:new             #22  <Class RuntimeException>
	//    8   12:dup             
	//    9   13:aload_0         
	//   10   14:invokespecial   #25  <Method void RuntimeException(Throwable)>
	//   11   17:athrow          
		}
		return ((Object) (field));
	}

	public static Class tryGetClassForName(String s)
	{
		try
		{
			s = ((String) (Class.forName(s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method Class Class.forName(String)>
	//    2    4:astore_0        
		}
	//*   3    5:aload_0         
	//*   4    6:areturn         
	//*   5    7:aconst_null     
	//*   6    8:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		return ((Class) (s));
	//*   7    9:astore_0        
	//*   8   10:goto            7
	}

	public static Field tryGetDeclaredField(Class class1, String s)
	{
		Field field;
		try
		{
			field = class1.getDeclaredField(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #45  <Method Field Class.getDeclaredField(String)>
	//    3    5:astore_2        
		}
	//*   4    6:aload_2         
	//*   5    7:areturn         
		catch(NoSuchFieldException nosuchfieldexception)
	//*   6    8:astore_2        
		{
			LogUtil.d(((Throwable) (nosuchfieldexception)), "Could not retrieve %s field from %s", new Object[] {
				s, class1
			});
	//    7    9:aload_2         
	//    8   10:ldc1            #47  <String "Could not retrieve %s field from %s">
	//    9   12:iconst_2        
	//   10   13:anewarray       Object[]
	//   11   16:dup             
	//   12   17:iconst_0        
	//   13   18:aload_1         
	//   14   19:aastore         
	//   15   20:dup             
	//   16   21:iconst_1        
	//   17   22:aload_0         
	//   18   23:aastore         
	//   19   24:invokestatic    #53  <Method void LogUtil.d(Throwable, String, Object[])>
			return null;
	//   20   27:aconst_null     
	//   21   28:areturn         
		}
		return field;
	}
}
