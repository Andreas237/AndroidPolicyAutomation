// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;


public final class AccountType
{

	private AccountType()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	public static final String GOOGLE = "com.google";
	private static final String zzbr[] = {
		"com.google", "com.google.work", "cn.google"
	};

	static 
	{
	//    0    0:iconst_3        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #9   <String "com.google">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #17  <String "com.google.work">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #19  <String "cn.google">
	//   13   18:aastore         
	//   14   19:putstatic       #21  <Field String[] zzbr>
	//*  15   22:return          
	}
}
