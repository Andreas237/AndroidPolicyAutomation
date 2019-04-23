// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class bnf
{

	public static int a(int i, int j, int k)
	{
		if(i >= 0 && i < k)
	//*   0    0:iload_0         
	//*   1    1:iflt            11
	//*   2    4:iload_0         
	//*   3    5:iload_2         
	//*   4    6:icmpge          11
			return i;
	//    5    9:iload_0         
	//    6   10:ireturn         
		else
			throw new IndexOutOfBoundsException();
	//    7   11:new             #8   <Class IndexOutOfBoundsException>
	//    8   14:dup             
	//    9   15:invokespecial   #12  <Method void IndexOutOfBoundsException()>
	//   10   18:athrow          
	}

	public static Object a(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          6
			return obj;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			throw new NullPointerException();
	//    4    6:new             #16  <Class NullPointerException>
	//    5    9:dup             
	//    6   10:invokespecial   #17  <Method void NullPointerException()>
	//    7   13:athrow          
	}

	public static void a(boolean flag)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            5
			return;
	//    2    4:return          
		else
			throw new IllegalArgumentException();
	//    3    5:new             #20  <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void IllegalArgumentException()>
	//    6   12:athrow          
	}

	public static void a(boolean flag, Object obj)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            5
			return;
	//    2    4:return          
		else
			throw new IllegalArgumentException(String.valueOf(obj));
	//    3    5:new             #20  <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokestatic    #28  <Method String String.valueOf(Object)>
	//    7   13:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//    8   16:athrow          
	}

	public static void b(boolean flag)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            5
			return;
	//    2    4:return          
		else
			throw new IllegalStateException();
	//    3    5:new             #34  <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:invokespecial   #35  <Method void IllegalStateException()>
	//    6   12:athrow          
	}

	public static void b(boolean flag, Object obj)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            5
			return;
	//    2    4:return          
		else
			throw new IllegalStateException(String.valueOf(obj));
	//    3    5:new             #34  <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokestatic    #28  <Method String String.valueOf(Object)>
	//    7   13:invokespecial   #36  <Method void IllegalStateException(String)>
	//    8   16:athrow          
	}
}
