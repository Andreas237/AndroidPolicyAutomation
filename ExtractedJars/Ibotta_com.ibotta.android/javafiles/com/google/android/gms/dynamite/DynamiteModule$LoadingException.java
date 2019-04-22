// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamite;


// Referenced classes of package com.google.android.gms.dynamite:
//			DynamiteModule, zza

public static class DynamiteModule$LoadingException extends Exception
{

	private DynamiteModule$LoadingException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void Exception(String)>
	//    3    5:return          
	}

	DynamiteModule$LoadingException(String s, zza zza)
	{
		this(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void DynamiteModule$LoadingException(String)>
	//    3    5:return          
	}

	private DynamiteModule$LoadingException(String s, Throwable throwable)
	{
		super(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #17  <Method void Exception(String, Throwable)>
	//    4    6:return          
	}

	DynamiteModule$LoadingException(String s, Throwable throwable, zza zza)
	{
		this(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #19  <Method void DynamiteModule$LoadingException(String, Throwable)>
	//    4    6:return          
	}
}
