// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbe, zzbbd

final class zzbbf
{

	private static zzbbd zzacs()
	{
		Exception exception;
		zzbbd zzbbd1;
		try
		{
			zzbbd1 = (zzbbd)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
	//    0    0:ldc1            #28  <String "com.google.protobuf.ExtensionSchemaFull">
	//    1    2:invokestatic    #34  <Method Class Class.forName(String)>
	//    2    5:iconst_0        
	//    3    6:anewarray       Class[]
	//    4    9:invokevirtual   #38  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    5   12:iconst_0        
	//    6   13:anewarray       Object[]
	//    7   16:invokevirtual   #44  <Method Object Constructor.newInstance(Object[])>
	//    8   19:checkcast       #46  <Class zzbbd>
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
		return zzbbd1;
	//*  14   27:astore_0        
	//*  15   28:goto            25
	}

	static zzbbd zzact()
	{
		return zzdqv;
	//    0    0:getstatic       #17  <Field zzbbd zzdqv>
	//    1    3:areturn         
	}

	static zzbbd zzacu()
	{
		if(zzdqw == null)
	//*   0    0:getstatic       #23  <Field zzbbd zzdqw>
	//*   1    3:ifnonnull       16
			throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
	//    2    6:new             #52  <Class IllegalStateException>
	//    3    9:dup             
	//    4   10:ldc1            #54  <String "Protobuf runtime is not correctly loaded.">
	//    5   12:invokespecial   #57  <Method void IllegalStateException(String)>
	//    6   15:athrow          
		else
			return zzdqw;
	//    7   16:getstatic       #23  <Field zzbbd zzdqw>
	//    8   19:areturn         
	}

	private static final zzbbd zzdqv = new zzbbe();
	private static final zzbbd zzdqw = zzacs();

	static 
	{
	//    0    0:new             #12  <Class zzbbe>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void zzbbe()>
	//    3    7:putstatic       #17  <Field zzbbd zzdqv>
	//    4   10:invokestatic    #21  <Method zzbbd zzacs()>
	//    5   13:putstatic       #23  <Field zzbbd zzdqw>
	//*   6   16:return          
	}
}
