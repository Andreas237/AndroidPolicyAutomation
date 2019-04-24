// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.util.zzc;

public final class Preconditions
{

	private Preconditions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
		throw new AssertionError("Uninstantiable");
	//    2    4:new             #11  <Class AssertionError>
	//    3    7:dup             
	//    4    8:ldc1            #13  <String "Uninstantiable">
	//    5   10:invokespecial   #16  <Method void AssertionError(Object)>
	//    6   13:athrow          
	}

	public static void checkArgument(boolean flag)
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            12
			throw new IllegalArgumentException();
	//    2    4:new             #21  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:invokespecial   #22  <Method void IllegalArgumentException()>
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
	//    2    4:new             #21  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokestatic    #30  <Method String String.valueOf(Object)>
	//    6   12:invokespecial   #33  <Method void IllegalArgumentException(String)>
	//    7   15:athrow          
		else
			return;
	//    8   16:return          
	}

	public static transient void checkArgument(boolean flag, String s, Object aobj[])
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            17
			throw new IllegalArgumentException(String.format(s, aobj));
	//    2    4:new             #21  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #38  <Method String String.format(String, Object[])>
	//    7   13:invokespecial   #33  <Method void IllegalArgumentException(String)>
	//    8   16:athrow          
		else
			return;
	//    9   17:return          
	}

	public static void checkHandlerThread(Handler handler)
	{
		if(Looper.myLooper() != handler.getLooper())
	//*   0    0:invokestatic    #46  <Method Looper Looper.myLooper()>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #51  <Method Looper Handler.getLooper()>
	//*   3    7:if_acmpeq       20
			throw new IllegalStateException("Must be called on the handler thread");
	//    4   10:new             #53  <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:ldc1            #55  <String "Must be called on the handler thread">
	//    7   16:invokespecial   #56  <Method void IllegalStateException(String)>
	//    8   19:athrow          
		else
			return;
	//    9   20:return          
	}

	public static void checkMainThread(String s)
	{
		if(!zzc.isMainThread())
	//*   0    0:invokestatic    #63  <Method boolean zzc.isMainThread()>
	//*   1    3:ifne            15
			throw new IllegalStateException(s);
	//    2    6:new             #53  <Class IllegalStateException>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #56  <Method void IllegalStateException(String)>
	//    6   14:athrow          
		else
			return;
	//    7   15:return          
	}

	public static String checkNotEmpty(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #71  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
			throw new IllegalArgumentException("Given String is empty or null");
	//    3    7:new             #21  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #73  <String "Given String is empty or null">
	//    6   13:invokespecial   #33  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		else
			return s;
	//    8   17:aload_0         
	//    9   18:areturn         
	}

	public static String checkNotEmpty(String s, Object obj)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #71  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            19
			throw new IllegalArgumentException(String.valueOf(obj));
	//    3    7:new             #21  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokestatic    #30  <Method String String.valueOf(Object)>
	//    7   15:invokespecial   #33  <Method void IllegalArgumentException(String)>
	//    8   18:athrow          
		else
			return s;
	//    9   19:aload_0         
	//   10   20:areturn         
	}

	public static void checkNotMainThread()
	{
		checkNotMainThread("Must not be called on the main application thread");
	//    0    0:ldc1            #77  <String "Must not be called on the main application thread">
	//    1    2:invokestatic    #79  <Method void checkNotMainThread(String)>
	//    2    5:return          
	}

	public static void checkNotMainThread(String s)
	{
		if(zzc.isMainThread())
	//*   0    0:invokestatic    #63  <Method boolean zzc.isMainThread()>
	//*   1    3:ifeq            15
			throw new IllegalStateException(s);
	//    2    6:new             #53  <Class IllegalStateException>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #56  <Method void IllegalStateException(String)>
	//    6   14:athrow          
		else
			return;
	//    7   15:return          
	}

	public static Object checkNotNull(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("null reference");
	//    2    4:new             #83  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #85  <String "null reference">
	//    5   10:invokespecial   #86  <Method void NullPointerException(String)>
	//    6   13:athrow          
		else
			return obj;
	//    7   14:aload_0         
	//    8   15:areturn         
	}

	public static Object checkNotNull(Object obj, Object obj1)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       16
			throw new NullPointerException(String.valueOf(obj1));
	//    2    4:new             #83  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokestatic    #30  <Method String String.valueOf(Object)>
	//    6   12:invokespecial   #86  <Method void NullPointerException(String)>
	//    7   15:athrow          
		else
			return obj;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public static int checkNotZero(int i)
	{
		if(i == 0)
	//*   0    0:iload_0         
	//*   1    1:ifne            14
			throw new IllegalArgumentException("Given Integer is zero");
	//    2    4:new             #21  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #94  <String "Given Integer is zero">
	//    5   10:invokespecial   #33  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return i;
	//    7   14:iload_0         
	//    8   15:ireturn         
	}

	public static int checkNotZero(int i, Object obj)
	{
		if(i == 0)
	//*   0    0:iload_0         
	//*   1    1:ifne            16
			throw new IllegalArgumentException(String.valueOf(obj));
	//    2    4:new             #21  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokestatic    #30  <Method String String.valueOf(Object)>
	//    6   12:invokespecial   #33  <Method void IllegalArgumentException(String)>
	//    7   15:athrow          
		else
			return i;
	//    8   16:iload_0         
	//    9   17:ireturn         
	}

	public static long checkNotZero(long l)
	{
		if(l == 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifne            16
			throw new IllegalArgumentException("Given Long is zero");
	//    4    6:new             #21  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:ldc1            #98  <String "Given Long is zero">
	//    7   12:invokespecial   #33  <Method void IllegalArgumentException(String)>
	//    8   15:athrow          
		else
			return l;
	//    9   16:lload_0         
	//   10   17:lreturn         
	}

	public static long checkNotZero(long l, Object obj)
	{
		if(l == 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifne            18
			throw new IllegalArgumentException(String.valueOf(obj));
	//    4    6:new             #21  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:aload_2         
	//    7   11:invokestatic    #30  <Method String String.valueOf(Object)>
	//    8   14:invokespecial   #33  <Method void IllegalArgumentException(String)>
	//    9   17:athrow          
		else
			return l;
	//   10   18:lload_0         
	//   11   19:lreturn         
	}

	public static void checkState(boolean flag)
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            12
			throw new IllegalStateException();
	//    2    4:new             #53  <Class IllegalStateException>
	//    3    7:dup             
	//    4    8:invokespecial   #101 <Method void IllegalStateException()>
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
	//    2    4:new             #53  <Class IllegalStateException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokestatic    #30  <Method String String.valueOf(Object)>
	//    6   12:invokespecial   #56  <Method void IllegalStateException(String)>
	//    7   15:athrow          
		else
			return;
	//    8   16:return          
	}

	public static transient void checkState(boolean flag, String s, Object aobj[])
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            17
			throw new IllegalStateException(String.format(s, aobj));
	//    2    4:new             #53  <Class IllegalStateException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #38  <Method String String.format(String, Object[])>
	//    7   13:invokespecial   #56  <Method void IllegalStateException(String)>
	//    8   16:athrow          
		else
			return;
	//    9   17:return          
	}
}
