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
		return zzbvf;
	//    0    0:getstatic       #17  <Field zzuc zzbvf>
	//    1    3:areturn         
	}

	static zzuc zzvv()
	{
		zzuc zzuc1 = zzbvg;
	//    0    0:getstatic       #23  <Field zzuc zzbvg>
	//    1    3:astore_0        
		if(zzuc1 != null)
	//*   2    4:aload_0         
	//*   3    5:ifnull          10
			return zzuc1;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
	//    6   10:new             #52  <Class IllegalStateException>
	//    7   13:dup             
	//    8   14:ldc1            #54  <String "Protobuf runtime is not correctly loaded.">
	//    9   16:invokespecial   #57  <Method void IllegalStateException(String)>
	//   10   19:athrow          
	}

	private static final zzuc zzbvf = new zzud();
	private static final zzuc zzbvg = zzvt();

	static 
	{
	//    0    0:new             #12  <Class zzud>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void zzud()>
	//    3    7:putstatic       #17  <Field zzuc zzbvf>
	//    4   10:invokestatic    #21  <Method zzuc zzvt()>
	//    5   13:putstatic       #23  <Field zzuc zzbvg>
	//*   6   16:return          
	}
}
