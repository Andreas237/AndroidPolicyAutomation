// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;


public final class AccountType
{

	private AccountType()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	public static final String ACCEPTABLE_ACCOUNT_TYPES[] = {
		"com.google", "com.google.work", "cn.google"
	};
	public static final String GOOGLE = "com.google";
	public static final String SIDEWINDER = "cn.google";
	public static final String WORK = "com.google.work";

	static 
	{
	//    0    0:iconst_3        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #10  <String "com.google">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #16  <String "com.google.work">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #13  <String "cn.google">
	//   13   18:aastore         
	//   14   19:putstatic       #22  <Field String[] ACCEPTABLE_ACCOUNT_TYPES>
	//*  15   22:return          
	}
}
