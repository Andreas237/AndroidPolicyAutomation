// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbb

final class zzbba
{

	private static Class zzaco()
	{
		ClassNotFoundException classnotfoundexception;
		Class class1;
		try
		{
			class1 = Class.forName("com.google.protobuf.ExtensionRegistry");
	//    0    0:ldc1            #20  <String "com.google.protobuf.ExtensionRegistry">
	//    1    2:invokestatic    #26  <Method Class Class.forName(String)>
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

	public static zzbbb zzacp()
	{
		if(zzdqq == null)
			break MISSING_BLOCK_LABEL_32;
	//    0    0:getstatic       #15  <Field Class zzdqq>
	//    1    3:ifnull          32
		zzbbb zzbbb1 = (zzbbb)zzdqq.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(((Object) (null)), new Object[0]);
	//    2    6:getstatic       #15  <Field Class zzdqq>
	//    3    9:ldc1            #34  <String "getEmptyRegistry">
	//    4   11:iconst_0        
	//    5   12:anewarray       Class[]
	//    6   15:invokevirtual   #38  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    7   18:aconst_null     
	//    8   19:iconst_0        
	//    9   20:anewarray       Object[]
	//   10   23:invokevirtual   #44  <Method Object Method.invoke(Object, Object[])>
	//   11   26:checkcast       #46  <Class zzbbb>
	//   12   29:astore_0        
		return zzbbb1;
	//   13   30:aload_0         
	//   14   31:areturn         
_L2:
		return zzbbb.zzdqt;
	//   15   32:getstatic       #50  <Field zzbbb zzbbb.zzdqt>
	//   16   35:areturn         
		Exception exception;
		exception;
	//   17   36:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  18   37:goto            32
	}

	private static final Class zzdqq = zzaco();

	static 
	{
	//    0    0:invokestatic    #13  <Method Class zzaco()>
	//    1    3:putstatic       #15  <Field Class zzdqq>
	//*   2    6:return          
	}
}
