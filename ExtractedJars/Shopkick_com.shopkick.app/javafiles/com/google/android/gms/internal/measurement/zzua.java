// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzub

final class zzua
{

	private static final zzub zzge(String s)
		throws Exception
	{
		return (zzub)zzbuz.getDeclaredMethod(s, new Class[0]).invoke(((Object) (null)), new Object[0]);
	//    0    0:getstatic       #15  <Field Class zzbuz>
	//    1    3:aload_0         
	//    2    4:iconst_0        
	//    3    5:anewarray       Class[]
	//    4    8:invokevirtual   #26  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    5   11:aconst_null     
	//    6   12:iconst_0        
	//    7   13:anewarray       Object[]
	//    8   16:invokevirtual   #32  <Method Object Method.invoke(Object, Object[])>
	//    9   19:checkcast       #34  <Class zzub>
	//   10   22:areturn         
	}

	private static Class zzvn()
	{
		ClassNotFoundException classnotfoundexception;
		Class class1;
		try
		{
			class1 = Class.forName("com.google.protobuf.ExtensionRegistry");
	//    0    0:ldc1            #39  <String "com.google.protobuf.ExtensionRegistry">
	//    1    2:invokestatic    #43  <Method Class Class.forName(String)>
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

	public static zzub zzvo()
	{
		if(zzbuz == null)
			break MISSING_BLOCK_LABEL_14;
	//    0    0:getstatic       #15  <Field Class zzbuz>
	//    1    3:ifnull          14
		zzub zzub1 = zzge("getEmptyRegistry");
	//    2    6:ldc1            #49  <String "getEmptyRegistry">
	//    3    8:invokestatic    #51  <Method zzub zzge(String)>
	//    4   11:astore_0        
		return zzub1;
	//    5   12:aload_0         
	//    6   13:areturn         
_L2:
		return zzub.zzbvd;
	//    7   14:getstatic       #55  <Field zzub zzub.zzbvd>
	//    8   17:areturn         
		Exception exception;
		exception;
	//    9   18:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  10   19:goto            14
	}

	static zzub zzvp()
	{
		if(zzbuz == null) goto _L2; else goto _L1
	//    0    0:getstatic       #15  <Field Class zzbuz>
	//    1    3:ifnull          15
_L1:
		zzub zzub2 = zzge("loadGeneratedRegistry");
	//    2    6:ldc1            #58  <String "loadGeneratedRegistry">
	//    3    8:invokestatic    #51  <Method zzub zzge(String)>
	//    4   11:astore_1        
		  goto _L3
	//*   5   12:goto            17
_L2:
		zzub2 = null;
	//    6   15:aconst_null     
	//    7   16:astore_1        
_L3:
		zzub zzub1 = zzub2;
	//    8   17:aload_1         
	//    9   18:astore_0        
		if(zzub2 == null)
	//*  10   19:aload_1         
	//*  11   20:ifnonnull       27
			zzub1 = zzub.zzvp();
	//   12   23:invokestatic    #60  <Method zzub zzub.zzvp()>
	//   13   26:astore_0        
		zzub2 = zzub1;
	//   14   27:aload_0         
	//   15   28:astore_1        
		if(zzub1 == null)
	//*  16   29:aload_0         
	//*  17   30:ifnonnull       37
			zzub2 = zzvo();
	//   18   33:invokestatic    #62  <Method zzub zzvo()>
	//   19   36:astore_1        
		return zzub2;
	//   20   37:aload_1         
	//   21   38:areturn         
		Exception exception;
		exception;
	//   22   39:astore_0        
		if(true) goto _L2; else goto _L4
_L4:
	//*  23   40:goto            15
	}

	private static final Class zzbuz = zzvn();

	static 
	{
	//    0    0:invokestatic    #13  <Method Class zzvn()>
	//    1    3:putstatic       #15  <Field Class zzbuz>
	//*   2    6:return          
	}
}
