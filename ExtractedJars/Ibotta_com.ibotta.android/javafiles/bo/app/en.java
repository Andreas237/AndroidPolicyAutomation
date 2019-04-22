// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class en
{

	public static transient Object a(Object obj, Method method, Object aobj[])
	{
		try
		{
			obj = method.invoke(obj, aobj);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #16  <Method Object Method.invoke(Object, Object[])>
	//    4    6:astore_0        
		}
	//*   5    7:aload_0         
	//*   6    8:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   7    9:astore_0        
		{
			return ((Object) (null));
	//    8   10:aconst_null     
	//    9   11:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  10   12:astore_0        
		{
			return ((Object) (null));
	//   11   13:aconst_null     
	//   12   14:areturn         
		}
		return obj;
	}

	public static transient Method a(Class class1, String s, Class aclass[])
	{
		try
		{
			class1 = ((Class) (class1.getMethod(s, aclass)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #26  <Method Method Class.getMethod(String, Class[])>
	//    4    6:astore_0        
		}
	//*   5    7:aload_0         
	//*   6    8:areturn         
	//*   7    9:aconst_null     
	//*   8   10:areturn         
		// Misplaced declaration of an exception variable
		catch(Class class1)
		{
			return null;
		}
		return ((Method) (class1));
	//*   9   11:astore_0        
	//*  10   12:goto            9
	}

	public static transient Method a(String s, String s1, Class aclass[])
	{
		try
		{
			s = ((String) (a(Class.forName(s), s1, aclass)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method Class Class.forName(String)>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #37  <Method Method a(Class, String, Class[])>
	//    5    9:astore_0        
		}
	//*   6   10:aload_0         
	//*   7   11:areturn         
	//*   8   12:aconst_null     
	//*   9   13:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		return ((Method) (s));
	//*  10   14:astore_0        
	//*  11   15:goto            12
	}
}
