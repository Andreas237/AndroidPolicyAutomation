// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class bcs extends Exception
{

	private bcs(int i, String s, Throwable throwable, int j)
	{
		super(((String) (null)), throwable);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_3         
	//    3    3:invokespecial   #12  <Method void Exception(String, Throwable)>
		a = i;
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:putfield        #14  <Field int a>
		b = j;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #16  <Field int b>
	//   10   17:return          
	}

	public static bcs a(IOException ioexception)
	{
		return new bcs(0, ((String) (null)), ((Throwable) (ioexception)), -1);
	//    0    0:new             #2   <Class bcs>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:aconst_null     
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:invokespecial   #20  <Method void bcs(int, String, Throwable, int)>
	//    7   11:areturn         
	}

	public static bcs a(Exception exception, int i)
	{
		return new bcs(1, ((String) (null)), ((Throwable) (exception)), i);
	//    0    0:new             #2   <Class bcs>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:aconst_null     
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:invokespecial   #20  <Method void bcs(int, String, Throwable, int)>
	//    7   11:areturn         
	}

	static bcs a(RuntimeException runtimeexception)
	{
		return new bcs(2, ((String) (null)), ((Throwable) (runtimeexception)), -1);
	//    0    0:new             #2   <Class bcs>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:aconst_null     
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:invokespecial   #20  <Method void bcs(int, String, Throwable, int)>
	//    7   11:areturn         
	}

	private final int a;
	private final int b;
}
