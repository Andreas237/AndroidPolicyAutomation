// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.lang.reflect.Constructor;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzho, zzhn

final class zzhp
{

	static zzhn zzgi()
	{
		return zzzu;
	//    0    0:getstatic       #15  <Field zzhn zzzu>
	//    1    3:areturn         
	}

	static zzhn zzgj()
	{
		return zzzv;
	//    0    0:getstatic       #22  <Field zzhn zzzv>
	//    1    3:areturn         
	}

	private static zzhn zzgk()
	{
		Exception exception;
		zzhn zzhn1;
		try
		{
			zzhn1 = (zzhn)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
	//    0    0:ldc1            #29  <String "com.google.protobuf.NewInstanceSchemaFull">
	//    1    2:invokestatic    #35  <Method Class Class.forName(String)>
	//    2    5:iconst_0        
	//    3    6:anewarray       Class[]
	//    4    9:invokevirtual   #39  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    5   12:iconst_0        
	//    6   13:anewarray       Object[]
	//    7   16:invokevirtual   #45  <Method Object Constructor.newInstance(Object[])>
	//    8   19:checkcast       #47  <Class zzhn>
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
		return zzhn1;
	//*  14   27:astore_0        
	//*  15   28:goto            25
	}

	private static final zzhn zzzu = zzgk();
	private static final zzhn zzzv = new zzho();

	static 
	{
	//    0    0:invokestatic    #13  <Method zzhn zzgk()>
	//    1    3:putstatic       #15  <Field zzhn zzzu>
	//    2    6:new             #17  <Class zzho>
	//    3    9:dup             
	//    4   10:invokespecial   #20  <Method void zzho()>
	//    5   13:putstatic       #22  <Field zzhn zzzv>
	//*   6   16:return          
	}
}
