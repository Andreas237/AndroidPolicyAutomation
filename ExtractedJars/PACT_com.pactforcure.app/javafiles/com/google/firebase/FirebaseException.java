// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase;

import com.google.android.gms.common.internal.zzac;

public class FirebaseException extends Exception
{

	protected FirebaseException()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Exception()>
	//    2    4:return          
	}

	public FirebaseException(String s)
	{
		super(zzac.zzh(s, "Detail message must not be empty"));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #15  <String "Detail message must not be empty">
	//    3    4:invokestatic    #21  <Method String zzac.zzh(String, Object)>
	//    4    7:invokespecial   #23  <Method void Exception(String)>
	//    5   10:return          
	}

	public FirebaseException(String s, Throwable throwable)
	{
		super(zzac.zzh(s, "Detail message must not be empty"), throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #15  <String "Detail message must not be empty">
	//    3    4:invokestatic    #21  <Method String zzac.zzh(String, Object)>
	//    4    7:aload_2         
	//    5    8:invokespecial   #27  <Method void Exception(String, Throwable)>
	//    6   11:return          
	}
}
