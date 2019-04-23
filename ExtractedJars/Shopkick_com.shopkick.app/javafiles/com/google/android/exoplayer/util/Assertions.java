// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

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
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            5
			return;
	//    2    4:return          
		else
			throw new IllegalArgumentException();
	//    3    5:new             #13  <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void IllegalArgumentException()>
	//    6   12:athrow          
	}

	public static void checkArgument(boolean flag, Object obj)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            5
			return;
	//    2    4:return          
		else
			throw new IllegalArgumentException(String.valueOf(obj));
	//    3    5:new             #13  <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokestatic    #21  <Method String String.valueOf(Object)>
	//    7   13:invokespecial   #24  <Method void IllegalArgumentException(String)>
	//    8   16:athrow          
	}

	public static void checkMainThread()
	{
		if(Looper.myLooper() == Looper.getMainLooper())
	//*   0    0:invokestatic    #31  <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #34  <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpne       10
			return;
	//    3    9:return          
		else
			throw new IllegalStateException("Not in applications main thread");
	//    4   10:new             #36  <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:ldc1            #38  <String "Not in applications main thread">
	//    7   16:invokespecial   #39  <Method void IllegalStateException(String)>
	//    8   19:athrow          
	}

	public static String checkNotEmpty(String s)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            9
			return s;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			throw new IllegalArgumentException();
	//    5    9:new             #13  <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:invokespecial   #14  <Method void IllegalArgumentException()>
	//    8   16:athrow          
	}

	public static String checkNotEmpty(String s, Object obj)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            9
			return s;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			throw new IllegalArgumentException(String.valueOf(obj));
	//    5    9:new             #13  <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokestatic    #21  <Method String String.valueOf(Object)>
	//    9   17:invokespecial   #24  <Method void IllegalArgumentException(String)>
	//   10   20:athrow          
	}

	public static Object checkNotNull(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          6
			return obj;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			throw new NullPointerException();
	//    4    6:new             #52  <Class NullPointerException>
	//    5    9:dup             
	//    6   10:invokespecial   #53  <Method void NullPointerException()>
	//    7   13:athrow          
	}

	public static Object checkNotNull(Object obj, Object obj1)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          6
			return obj;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			throw new NullPointerException(String.valueOf(obj1));
	//    4    6:new             #52  <Class NullPointerException>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokestatic    #21  <Method String String.valueOf(Object)>
	//    8   14:invokespecial   #57  <Method void NullPointerException(String)>
	//    9   17:athrow          
	}

	public static void checkState(boolean flag)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            5
			return;
	//    2    4:return          
		else
			throw new IllegalStateException();
	//    3    5:new             #36  <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:invokespecial   #60  <Method void IllegalStateException()>
	//    6   12:athrow          
	}

	public static void checkState(boolean flag, Object obj)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            5
			return;
	//    2    4:return          
		else
			throw new IllegalStateException(String.valueOf(obj));
	//    3    5:new             #36  <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokestatic    #21  <Method String String.valueOf(Object)>
	//    7   13:invokespecial   #39  <Method void IllegalStateException(String)>
	//    8   16:athrow          
	}
}
