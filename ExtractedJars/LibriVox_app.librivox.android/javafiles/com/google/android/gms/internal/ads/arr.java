// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ars

final class arr
{

	public static ars a()
	{
		if(a == null)
			break MISSING_BLOCK_LABEL_14;
	//    0    0:getstatic       #14  <Field Class a>
	//    1    3:ifnull          14
		ars ars1 = a("getEmptyRegistry");
	//    2    6:ldc1            #20  <String "getEmptyRegistry">
	//    3    8:invokestatic    #23  <Method ars a(String)>
	//    4   11:astore_0        
		return ars1;
	//    5   12:aload_0         
	//    6   13:areturn         
_L2:
		return ars.a;
	//    7   14:getstatic       #28  <Field ars ars.a>
	//    8   17:areturn         
		Exception exception;
		exception;
	//    9   18:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  10   19:goto            14
	}

	private static final ars a(String s)
	{
		return (ars)a.getDeclaredMethod(s, new Class[0]).invoke(((Object) (null)), new Object[0]);
	//    0    0:getstatic       #14  <Field Class a>
	//    1    3:aload_0         
	//    2    4:iconst_0        
	//    3    5:anewarray       Class[]
	//    4    8:invokevirtual   #34  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    5   11:aconst_null     
	//    6   12:iconst_0        
	//    7   13:anewarray       Object[]
	//    8   16:invokevirtual   #40  <Method Object Method.invoke(Object, Object[])>
	//    9   19:checkcast       #25  <Class ars>
	//   10   22:areturn         
	}

	static ars b()
	{
		if(a == null) goto _L2; else goto _L1
	//    0    0:getstatic       #14  <Field Class a>
	//    1    3:ifnull          15
_L1:
		ars ars2 = a("loadGeneratedRegistry");
	//    2    6:ldc1            #43  <String "loadGeneratedRegistry">
	//    3    8:invokestatic    #23  <Method ars a(String)>
	//    4   11:astore_1        
		  goto _L3
	//*   5   12:goto            17
_L2:
		ars2 = null;
	//    6   15:aconst_null     
	//    7   16:astore_1        
_L3:
		ars ars1 = ars2;
	//    8   17:aload_1         
	//    9   18:astore_0        
		if(ars2 == null)
	//*  10   19:aload_1         
	//*  11   20:ifnonnull       27
			ars1 = ars.c();
	//   12   23:invokestatic    #45  <Method ars ars.c()>
	//   13   26:astore_0        
		ars2 = ars1;
	//   14   27:aload_0         
	//   15   28:astore_1        
		if(ars1 == null)
	//*  16   29:aload_0         
	//*  17   30:ifnonnull       37
			ars2 = a();
	//   18   33:invokestatic    #47  <Method ars a()>
	//   19   36:astore_1        
		return ars2;
	//   20   37:aload_1         
	//   21   38:areturn         
		Exception exception;
		exception;
	//   22   39:astore_0        
		if(true) goto _L2; else goto _L4
_L4:
	//*  23   40:goto            15
	}

	private static Class c()
	{
		ClassNotFoundException classnotfoundexception;
		Class class1;
		try
		{
			class1 = Class.forName("com.google.protobuf.ExtensionRegistry");
	//    0    0:ldc1            #51  <String "com.google.protobuf.ExtensionRegistry">
	//    1    2:invokestatic    #55  <Method Class Class.forName(String)>
	//    2    5:astore_0        
		}
	//*   3    6:aload_0         
	//*   4    7:areturn         
	//*   5    8:aconst_null     
	//*   6    9:areturn         
		// Misplaced declaration of an exception variable
		catch(ClassNotFoundException classnotfoundexception)
		{
			return null;
		}
		return class1;
	//*   7   10:astore_0        
	//*   8   11:goto            8
	}

	private static final Class a = c();

	static 
	{
	//    0    0:invokestatic    #12  <Method Class c()>
	//    1    3:putstatic       #14  <Field Class a>
	//*   2    6:return          
	}
}
