// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbdd, zzbdc

final class zzbde
{

	static zzbdc zzael()
	{
		return zzdwy;
	//    0    0:getstatic       #15  <Field zzbdc zzdwy>
	//    1    3:areturn         
	}

	static zzbdc zzaem()
	{
		return zzdwz;
	//    0    0:getstatic       #22  <Field zzbdc zzdwz>
	//    1    3:areturn         
	}

	private static zzbdc zzaen()
	{
		Exception exception;
		zzbdc zzbdc1;
		try
		{
			zzbdc1 = (zzbdc)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
	//    0    0:ldc1            #29  <String "com.google.protobuf.NewInstanceSchemaFull">
	//    1    2:invokestatic    #35  <Method Class Class.forName(String)>
	//    2    5:iconst_0        
	//    3    6:anewarray       Class[]
	//    4    9:invokevirtual   #39  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    5   12:iconst_0        
	//    6   13:anewarray       Object[]
	//    7   16:invokevirtual   #45  <Method Object Constructor.newInstance(Object[])>
	//    8   19:checkcast       #47  <Class zzbdc>
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
		return zzbdc1;
	//*  14   27:astore_0        
	//*  15   28:goto            25
	}

	private static final zzbdc zzdwy = zzaen();
	private static final zzbdc zzdwz = new zzbdd();

	static 
	{
	//    0    0:invokestatic    #13  <Method zzbdc zzaen()>
	//    1    3:putstatic       #15  <Field zzbdc zzdwy>
	//    2    6:new             #17  <Class zzbdd>
	//    3    9:dup             
	//    4   10:invokespecial   #20  <Method void zzbdd()>
	//    5   13:putstatic       #22  <Field zzbdc zzdwz>
	//*   6   16:return          
	}
}
