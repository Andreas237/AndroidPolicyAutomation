// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.lang.reflect.Constructor;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzud, zzuc

final class zzue
{

	private static zzuc zzvt()
	{
		Exception exception;
		zzuc zzuc1;
		try
		{
			zzuc1 = (zzuc)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
	//    0    0:ldc1            #28  <String "com.google.protobuf.ExtensionSchemaFull">
	//    1    2:invokestatic    #34  <Method Class Class.forName(String)>
	//    2    5:iconst_0        
	//    3    6:anewarray       Class[]
	//    4    9:invokevirtual   #38  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    5   12:iconst_0        
	//    6   13:anewarray       Object[]
	//    7   16:invokevirtual   #44  <Method Object Constructor.newInstance(Object[])>
	//    8   19:checkcast       #46  <Class zzuc>
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
		return zzuc1;
	//*  14   27:astore_0        
	//*  15   28:goto            25
	}

	static zzuc zzvu()
	{
		return zzbvh;
	//    0    0:getstatic       #17  <Field zzuc zzbvh>
	//    1    3:areturn         
	}

	static zzuc zzvv()
	{
		if(zzbvi == null)
	//*   0    0:getstatic       #23  <Field zzuc zzbvi>
	//*   1    3:ifnonnull       16
			throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
	//    2    6:new             #52  <Class IllegalStateException>
	//    3    9:dup             
	//    4   10:ldc1            #54  <String "Protobuf runtime is not correctly loaded.">
	//    5   12:invokespecial   #57  <Method void IllegalStateException(String)>
	//    6   15:athrow          
		else
			return zzbvi;
	//    7   16:getstatic       #23  <Field zzuc zzbvi>
	//    8   19:areturn         
	}

	private static final zzuc zzbvh = new zzud();
	private static final zzuc zzbvi = zzvt();

	static 
	{
	//    0    0:new             #12  <Class zzud>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void zzud()>
	//    3    7:putstatic       #17  <Field zzuc zzbvh>
	//    4   10:invokestatic    #21  <Method zzuc zzvt()>
	//    5   13:putstatic       #23  <Field zzuc zzbvi>
	//*   6   16:return          
	}
}
