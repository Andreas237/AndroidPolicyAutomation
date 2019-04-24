// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import android.os.Looper;
import android.text.TextUtils;

public final class Assertions
{

	private Assertions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void checkArgument(boolean flag)
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            12
			throw new IllegalArgumentException();
	//    2    4:new             #13  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:invokespecial   #14  <Method void IllegalArgumentException()>
	//    5   11:athrow          
		else
			return;
	//    6   12:return          
	}

	public static void checkArgument(boolean flag, Object obj)
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            16
			throw new IllegalArgumentException(String.valueOf(obj));
	//    2    4:new             #13  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokestatic    #21  <Method String String.valueOf(Object)>
	//    6   12:invokespecial   #24  <Method void IllegalArgumentException(String)>
	//    7   15:athrow          
		else
			return;
	//    8   16:return          
	}

	public static int checkIndex(int i, int j, int k)
	{
		if(i >= j && i < k)
	//*   0    0:iload_0         
	//*   1    1:iload_1         
	//*   2    2:icmplt          15
	//*   3    5:iload_0         
	//*   4    6:iload_2         
	//*   5    7:icmplt          13
	//*   6   10:goto            15
			return i;
	//    7   13:iload_0         
	//    8   14:ireturn         
		else
			throw new IndexOutOfBoundsException();
	//    9   15:new             #28  <Class IndexOutOfBoundsException>
	//   10   18:dup             
	//   11   19:invokespecial   #29  <Method void IndexOutOfBoundsException()>
	//   12   22:athrow          
	}

	public static void checkMainThread()
	{
		if(Looper.myLooper() != Looper.getMainLooper())
	//*   0    0:invokestatic    #36  <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #39  <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpeq       19
			throw new IllegalStateException("Not in applications main thread");
	//    3    9:new             #41  <Class IllegalStateException>
	//    4   12:dup             
	//    5   13:ldc1            #43  <String "Not in applications main thread">
	//    6   15:invokespecial   #44  <Method void IllegalStateException(String)>
	//    7   18:athrow          
		else
			return;
	//    8   19:return          
	}

	public static String checkNotEmpty(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #56  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            15
			throw new IllegalArgumentException();
	//    3    7:new             #13  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:invokespecial   #14  <Method void IllegalArgumentException()>
	//    6   14:athrow          
		else
			return s;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public static String checkNotEmpty(String s, Object obj)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #56  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            19
			throw new IllegalArgumentException(String.valueOf(obj));
	//    3    7:new             #13  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokestatic    #21  <Method String String.valueOf(Object)>
	//    7   15:invokespecial   #24  <Method void IllegalArgumentException(String)>
	//    8   18:athrow          
		else
			return s;
	//    9   19:aload_0         
	//   10   20:areturn         
	}

	public static Object checkNotNull(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
			throw new NullPointerException();
	//    2    4:new             #63  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #64  <Method void NullPointerException()>
	//    5   11:athrow          
		else
			return obj;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public static Object checkNotNull(Object obj, Object obj1)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       16
			throw new NullPointerException(String.valueOf(obj1));
	//    2    4:new             #63  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokestatic    #21  <Method String String.valueOf(Object)>
	//    6   12:invokespecial   #68  <Method void NullPointerException(String)>
	//    7   15:athrow          
		else
			return obj;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public static void checkState(boolean flag)
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            12
			throw new IllegalStateException();
	//    2    4:new             #41  <Class IllegalStateException>
	//    3    7:dup             
	//    4    8:invokespecial   #71  <Method void IllegalStateException()>
	//    5   11:athrow          
		else
			return;
	//    6   12:return          
	}

	public static void checkState(boolean flag, Object obj)
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            16
			throw new IllegalStateException(String.valueOf(obj));
	//    2    4:new             #41  <Class IllegalStateException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokestatic    #21  <Method String String.valueOf(Object)>
	//    6   12:invokespecial   #44  <Method void IllegalStateException(String)>
	//    7   15:athrow          
		else
			return;
	//    8   16:return          
	}
}
