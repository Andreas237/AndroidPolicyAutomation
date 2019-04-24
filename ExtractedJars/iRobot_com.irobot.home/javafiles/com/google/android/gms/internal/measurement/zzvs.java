// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.lang.reflect.Constructor;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzvr, zzvq

final class zzvs
{

	static zzvq zzxj()
	{
		return zzcao;
	//    0    0:getstatic       #15  <Field zzvq zzcao>
	//    1    3:areturn         
	}

	static zzvq zzxk()
	{
		return zzcap;
	//    0    0:getstatic       #22  <Field zzvq zzcap>
	//    1    3:areturn         
	}

	private static zzvq zzxl()
	{
		Exception exception;
		zzvq zzvq1;
		try
		{
			zzvq1 = (zzvq)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
	//    0    0:ldc1            #29  <String "com.google.protobuf.MapFieldSchemaFull">
	//    1    2:invokestatic    #35  <Method Class Class.forName(String)>
	//    2    5:iconst_0        
	//    3    6:anewarray       Class[]
	//    4    9:invokevirtual   #39  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    5   12:iconst_0        
	//    6   13:anewarray       Object[]
	//    7   16:invokevirtual   #45  <Method Object Constructor.newInstance(Object[])>
	//    8   19:checkcast       #47  <Class zzvq>
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
		return zzvq1;
	//*  14   27:astore_0        
	//*  15   28:goto            25
	}

	private static final zzvq zzcao = zzxl();
	private static final zzvq zzcap = new zzvr();

	static 
	{
	//    0    0:invokestatic    #13  <Method zzvq zzxl()>
	//    1    3:putstatic       #15  <Field zzvq zzcao>
	//    2    6:new             #17  <Class zzvr>
	//    3    9:dup             
	//    4   10:invokespecial   #20  <Method void zzvr()>
	//    5   13:putstatic       #22  <Field zzvq zzcap>
	//*   6   16:return          
	}
}
