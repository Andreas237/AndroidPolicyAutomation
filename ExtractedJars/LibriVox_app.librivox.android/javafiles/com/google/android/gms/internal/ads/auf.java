// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aue, aud

final class auf
{

	static aud a()
	{
		return a;
	//    0    0:getstatic       #15  <Field aud a>
	//    1    3:areturn         
	}

	static aud b()
	{
		return b;
	//    0    0:getstatic       #22  <Field aud b>
	//    1    3:areturn         
	}

	private static aud c()
	{
		Exception exception;
		aud aud1;
		try
		{
			aud1 = (aud)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
	//    0    0:ldc1            #27  <String "com.google.protobuf.NewInstanceSchemaFull">
	//    1    2:invokestatic    #33  <Method Class Class.forName(String)>
	//    2    5:iconst_0        
	//    3    6:anewarray       Class[]
	//    4    9:invokevirtual   #37  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    5   12:iconst_0        
	//    6   13:anewarray       Object[]
	//    7   16:invokevirtual   #43  <Method Object Constructor.newInstance(Object[])>
	//    8   19:checkcast       #45  <Class aud>
	//    9   22:astore_0        
		}
	//*  10   23:aload_0         
	//*  11   24:areturn         
	//*  12   25:aconst_null     
	//*  13   26:areturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			return null;
		}
		return aud1;
	//*  14   27:astore_0        
	//*  15   28:goto            25
	}

	private static final aud a = c();
	private static final aud b = new aue();

	static 
	{
	//    0    0:invokestatic    #13  <Method aud c()>
	//    1    3:putstatic       #15  <Field aud a>
	//    2    6:new             #17  <Class aue>
	//    3    9:dup             
	//    4   10:invokespecial   #20  <Method void aue()>
	//    5   13:putstatic       #22  <Field aud b>
	//*   6   16:return          
	}
}
