// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			arv, aru

final class arw
{

	static aru a()
	{
		return a;
	//    0    0:getstatic       #16  <Field aru a>
	//    1    3:areturn         
	}

	static aru b()
	{
		aru aru1 = b;
	//    0    0:getstatic       #22  <Field aru b>
	//    1    3:astore_0        
		if(aru1 != null)
	//*   2    4:aload_0         
	//*   3    5:ifnull          10
			return aru1;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
	//    6   10:new             #25  <Class IllegalStateException>
	//    7   13:dup             
	//    8   14:ldc1            #27  <String "Protobuf runtime is not correctly loaded.">
	//    9   16:invokespecial   #30  <Method void IllegalStateException(String)>
	//   10   19:athrow          
	}

	private static aru c()
	{
		Exception exception;
		aru aru1;
		try
		{
			aru1 = (aru)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
	//    0    0:ldc1            #34  <String "com.google.protobuf.ExtensionSchemaFull">
	//    1    2:invokestatic    #40  <Method Class Class.forName(String)>
	//    2    5:iconst_0        
	//    3    6:anewarray       Class[]
	//    4    9:invokevirtual   #44  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    5   12:iconst_0        
	//    6   13:anewarray       Object[]
	//    7   16:invokevirtual   #50  <Method Object Constructor.newInstance(Object[])>
	//    8   19:checkcast       #52  <Class aru>
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
		return aru1;
	//*  14   27:astore_0        
	//*  15   28:goto            25
	}

	private static final aru a = new arv();
	private static final aru b = c();

	static 
	{
	//    0    0:new             #11  <Class arv>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void arv()>
	//    3    7:putstatic       #16  <Field aru a>
	//    4   10:invokestatic    #20  <Method aru c()>
	//    5   13:putstatic       #22  <Field aru b>
	//*   6   16:return          
	}
}
