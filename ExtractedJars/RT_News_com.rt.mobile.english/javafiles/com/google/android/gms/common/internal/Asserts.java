// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;

public final class Asserts
{

	private Asserts()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
		throw new AssertionError("Uninstantiable");
	//    2    4:new             #10  <Class AssertionError>
	//    3    7:dup             
	//    4    8:ldc1            #12  <String "Uninstantiable">
	//    5   10:invokespecial   #15  <Method void AssertionError(Object)>
	//    6   13:athrow          
	}

	public static void checkMainThread(String s)
	{
		if(Looper.getMainLooper().getThread() != Thread.currentThread())
	//*   0    0:invokestatic    #24  <Method Looper Looper.getMainLooper()>
	//*   1    3:invokevirtual   #28  <Method Thread Looper.getThread()>
	//*   2    6:invokestatic    #33  <Method Thread Thread.currentThread()>
	//*   3    9:if_acmpeq       107
		{
			String s1 = String.valueOf(((Object) (Thread.currentThread())));
	//    4   12:invokestatic    #33  <Method Thread Thread.currentThread()>
	//    5   15:invokestatic    #39  <Method String String.valueOf(Object)>
	//    6   18:astore_1        
			String s2 = String.valueOf(((Object) (Looper.getMainLooper().getThread())));
	//    7   19:invokestatic    #24  <Method Looper Looper.getMainLooper()>
	//    8   22:invokevirtual   #28  <Method Thread Looper.getThread()>
	//    9   25:invokestatic    #39  <Method String String.valueOf(Object)>
	//   10   28:astore_2        
			StringBuilder stringbuilder = new StringBuilder(57 + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s2))).length());
	//   11   29:new             #41  <Class StringBuilder>
	//   12   32:dup             
	//   13   33:bipush          57
	//   14   35:aload_1         
	//   15   36:invokestatic    #39  <Method String String.valueOf(Object)>
	//   16   39:invokevirtual   #45  <Method int String.length()>
	//   17   42:iadd            
	//   18   43:aload_2         
	//   19   44:invokestatic    #39  <Method String String.valueOf(Object)>
	//   20   47:invokevirtual   #45  <Method int String.length()>
	//   21   50:iadd            
	//   22   51:invokespecial   #48  <Method void StringBuilder(int)>
	//   23   54:astore_3        
			stringbuilder.append("checkMainThread: current thread ");
	//   24   55:aload_3         
	//   25   56:ldc1            #50  <String "checkMainThread: current thread ">
	//   26   58:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   27   61:pop             
			stringbuilder.append(s1);
	//   28   62:aload_3         
	//   29   63:aload_1         
	//   30   64:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   31   67:pop             
			stringbuilder.append(" IS NOT the main thread ");
	//   32   68:aload_3         
	//   33   69:ldc1            #56  <String " IS NOT the main thread ">
	//   34   71:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   35   74:pop             
			stringbuilder.append(s2);
	//   36   75:aload_3         
	//   37   76:aload_2         
	//   38   77:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   39   80:pop             
			stringbuilder.append("!");
	//   40   81:aload_3         
	//   41   82:ldc1            #58  <String "!">
	//   42   84:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   43   87:pop             
			Log.e("Asserts", stringbuilder.toString());
	//   44   88:ldc1            #60  <String "Asserts">
	//   45   90:aload_3         
	//   46   91:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   47   94:invokestatic    #70  <Method int Log.e(String, String)>
	//   48   97:pop             
			throw new IllegalStateException(s);
	//   49   98:new             #72  <Class IllegalStateException>
	//   50  101:dup             
	//   51  102:aload_0         
	//   52  103:invokespecial   #74  <Method void IllegalStateException(String)>
	//   53  106:athrow          
		} else
		{
			return;
	//   54  107:return          
		}
	}

	public static void checkNotMainThread(String s)
	{
		if(Looper.getMainLooper().getThread() == Thread.currentThread())
	//*   0    0:invokestatic    #24  <Method Looper Looper.getMainLooper()>
	//*   1    3:invokevirtual   #28  <Method Thread Looper.getThread()>
	//*   2    6:invokestatic    #33  <Method Thread Thread.currentThread()>
	//*   3    9:if_acmpne       107
		{
			String s1 = String.valueOf(((Object) (Thread.currentThread())));
	//    4   12:invokestatic    #33  <Method Thread Thread.currentThread()>
	//    5   15:invokestatic    #39  <Method String String.valueOf(Object)>
	//    6   18:astore_1        
			String s2 = String.valueOf(((Object) (Looper.getMainLooper().getThread())));
	//    7   19:invokestatic    #24  <Method Looper Looper.getMainLooper()>
	//    8   22:invokevirtual   #28  <Method Thread Looper.getThread()>
	//    9   25:invokestatic    #39  <Method String String.valueOf(Object)>
	//   10   28:astore_2        
			StringBuilder stringbuilder = new StringBuilder(56 + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s2))).length());
	//   11   29:new             #41  <Class StringBuilder>
	//   12   32:dup             
	//   13   33:bipush          56
	//   14   35:aload_1         
	//   15   36:invokestatic    #39  <Method String String.valueOf(Object)>
	//   16   39:invokevirtual   #45  <Method int String.length()>
	//   17   42:iadd            
	//   18   43:aload_2         
	//   19   44:invokestatic    #39  <Method String String.valueOf(Object)>
	//   20   47:invokevirtual   #45  <Method int String.length()>
	//   21   50:iadd            
	//   22   51:invokespecial   #48  <Method void StringBuilder(int)>
	//   23   54:astore_3        
			stringbuilder.append("checkNotMainThread: current thread ");
	//   24   55:aload_3         
	//   25   56:ldc1            #77  <String "checkNotMainThread: current thread ">
	//   26   58:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   27   61:pop             
			stringbuilder.append(s1);
	//   28   62:aload_3         
	//   29   63:aload_1         
	//   30   64:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   31   67:pop             
			stringbuilder.append(" IS the main thread ");
	//   32   68:aload_3         
	//   33   69:ldc1            #79  <String " IS the main thread ">
	//   34   71:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   35   74:pop             
			stringbuilder.append(s2);
	//   36   75:aload_3         
	//   37   76:aload_2         
	//   38   77:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   39   80:pop             
			stringbuilder.append("!");
	//   40   81:aload_3         
	//   41   82:ldc1            #58  <String "!">
	//   42   84:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   43   87:pop             
			Log.e("Asserts", stringbuilder.toString());
	//   44   88:ldc1            #60  <String "Asserts">
	//   45   90:aload_3         
	//   46   91:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   47   94:invokestatic    #70  <Method int Log.e(String, String)>
	//   48   97:pop             
			throw new IllegalStateException(s);
	//   49   98:new             #72  <Class IllegalStateException>
	//   50  101:dup             
	//   51  102:aload_0         
	//   52  103:invokespecial   #74  <Method void IllegalStateException(String)>
	//   53  106:athrow          
		} else
		{
			return;
	//   54  107:return          
		}
	}

	public static void checkNotNull(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("null reference");
	//    2    4:new             #82  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #84  <String "null reference">
	//    5   10:invokespecial   #85  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return;
	//    7   14:return          
	}

	public static void checkNotNull(Object obj, Object obj1)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       16
			throw new IllegalArgumentException(String.valueOf(obj1));
	//    2    4:new             #82  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokestatic    #39  <Method String String.valueOf(Object)>
	//    6   12:invokespecial   #85  <Method void IllegalArgumentException(String)>
	//    7   15:athrow          
		else
			return;
	//    8   16:return          
	}

	public static void checkNull(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
			throw new IllegalArgumentException("non-null reference");
	//    2    4:new             #82  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #89  <String "non-null reference">
	//    5   10:invokespecial   #85  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return;
	//    7   14:return          
	}

	public static void checkState(boolean flag)
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            12
			throw new IllegalStateException();
	//    2    4:new             #72  <Class IllegalStateException>
	//    3    7:dup             
	//    4    8:invokespecial   #92  <Method void IllegalStateException()>
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
	//    2    4:new             #72  <Class IllegalStateException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokestatic    #39  <Method String String.valueOf(Object)>
	//    6   12:invokespecial   #74  <Method void IllegalStateException(String)>
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
	//    2    4:new             #72  <Class IllegalStateException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #98  <Method String String.format(String, Object[])>
	//    7   13:invokespecial   #74  <Method void IllegalStateException(String)>
	//    8   16:athrow          
		else
			return;
	//    9   17:return          
	}

	public static void fail(Object obj)
	{
		throw new IllegalStateException(String.valueOf(obj));
	//    0    0:new             #72  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #39  <Method String String.valueOf(Object)>
	//    4    8:invokespecial   #74  <Method void IllegalStateException(String)>
	//    5   11:athrow          
	}
}
