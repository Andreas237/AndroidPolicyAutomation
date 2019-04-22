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
		if(Looper.getMainLooper().getThread() == Thread.currentThread())
	//*   0    0:invokestatic    #24  <Method Looper Looper.getMainLooper()>
	//*   1    3:invokevirtual   #28  <Method Thread Looper.getThread()>
	//*   2    6:invokestatic    #33  <Method Thread Thread.currentThread()>
	//*   3    9:if_acmpne       13
		{
			return;
	//    4   12:return          
		} else
		{
			String s1 = String.valueOf(((Object) (Thread.currentThread())));
	//    5   13:invokestatic    #33  <Method Thread Thread.currentThread()>
	//    6   16:invokestatic    #39  <Method String String.valueOf(Object)>
	//    7   19:astore_1        
			String s2 = String.valueOf(((Object) (Looper.getMainLooper().getThread())));
	//    8   20:invokestatic    #24  <Method Looper Looper.getMainLooper()>
	//    9   23:invokevirtual   #28  <Method Thread Looper.getThread()>
	//   10   26:invokestatic    #39  <Method String String.valueOf(Object)>
	//   11   29:astore_2        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s1))).length() + 57 + String.valueOf(((Object) (s2))).length());
	//   12   30:new             #41  <Class StringBuilder>
	//   13   33:dup             
	//   14   34:aload_1         
	//   15   35:invokestatic    #39  <Method String String.valueOf(Object)>
	//   16   38:invokevirtual   #45  <Method int String.length()>
	//   17   41:bipush          57
	//   18   43:iadd            
	//   19   44:aload_2         
	//   20   45:invokestatic    #39  <Method String String.valueOf(Object)>
	//   21   48:invokevirtual   #45  <Method int String.length()>
	//   22   51:iadd            
	//   23   52:invokespecial   #48  <Method void StringBuilder(int)>
	//   24   55:astore_3        
			stringbuilder.append("checkMainThread: current thread ");
	//   25   56:aload_3         
	//   26   57:ldc1            #50  <String "checkMainThread: current thread ">
	//   27   59:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   28   62:pop             
			stringbuilder.append(s1);
	//   29   63:aload_3         
	//   30   64:aload_1         
	//   31   65:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   32   68:pop             
			stringbuilder.append(" IS NOT the main thread ");
	//   33   69:aload_3         
	//   34   70:ldc1            #56  <String " IS NOT the main thread ">
	//   35   72:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   36   75:pop             
			stringbuilder.append(s2);
	//   37   76:aload_3         
	//   38   77:aload_2         
	//   39   78:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   40   81:pop             
			stringbuilder.append("!");
	//   41   82:aload_3         
	//   42   83:ldc1            #58  <String "!">
	//   43   85:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   44   88:pop             
			Log.e("Asserts", stringbuilder.toString());
	//   45   89:ldc1            #60  <String "Asserts">
	//   46   91:aload_3         
	//   47   92:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   48   95:invokestatic    #70  <Method int Log.e(String, String)>
	//   49   98:pop             
			throw new IllegalStateException(s);
	//   50   99:new             #72  <Class IllegalStateException>
	//   51  102:dup             
	//   52  103:aload_0         
	//   53  104:invokespecial   #74  <Method void IllegalStateException(String)>
	//   54  107:athrow          
		}
	}

	public static void checkNotMainThread(String s)
	{
		if(Looper.getMainLooper().getThread() != Thread.currentThread())
	//*   0    0:invokestatic    #24  <Method Looper Looper.getMainLooper()>
	//*   1    3:invokevirtual   #28  <Method Thread Looper.getThread()>
	//*   2    6:invokestatic    #33  <Method Thread Thread.currentThread()>
	//*   3    9:if_acmpeq       13
		{
			return;
	//    4   12:return          
		} else
		{
			String s1 = String.valueOf(((Object) (Thread.currentThread())));
	//    5   13:invokestatic    #33  <Method Thread Thread.currentThread()>
	//    6   16:invokestatic    #39  <Method String String.valueOf(Object)>
	//    7   19:astore_1        
			String s2 = String.valueOf(((Object) (Looper.getMainLooper().getThread())));
	//    8   20:invokestatic    #24  <Method Looper Looper.getMainLooper()>
	//    9   23:invokevirtual   #28  <Method Thread Looper.getThread()>
	//   10   26:invokestatic    #39  <Method String String.valueOf(Object)>
	//   11   29:astore_2        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s1))).length() + 56 + String.valueOf(((Object) (s2))).length());
	//   12   30:new             #41  <Class StringBuilder>
	//   13   33:dup             
	//   14   34:aload_1         
	//   15   35:invokestatic    #39  <Method String String.valueOf(Object)>
	//   16   38:invokevirtual   #45  <Method int String.length()>
	//   17   41:bipush          56
	//   18   43:iadd            
	//   19   44:aload_2         
	//   20   45:invokestatic    #39  <Method String String.valueOf(Object)>
	//   21   48:invokevirtual   #45  <Method int String.length()>
	//   22   51:iadd            
	//   23   52:invokespecial   #48  <Method void StringBuilder(int)>
	//   24   55:astore_3        
			stringbuilder.append("checkNotMainThread: current thread ");
	//   25   56:aload_3         
	//   26   57:ldc1            #77  <String "checkNotMainThread: current thread ">
	//   27   59:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   28   62:pop             
			stringbuilder.append(s1);
	//   29   63:aload_3         
	//   30   64:aload_1         
	//   31   65:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   32   68:pop             
			stringbuilder.append(" IS the main thread ");
	//   33   69:aload_3         
	//   34   70:ldc1            #79  <String " IS the main thread ">
	//   35   72:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   36   75:pop             
			stringbuilder.append(s2);
	//   37   76:aload_3         
	//   38   77:aload_2         
	//   39   78:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   40   81:pop             
			stringbuilder.append("!");
	//   41   82:aload_3         
	//   42   83:ldc1            #58  <String "!">
	//   43   85:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   44   88:pop             
			Log.e("Asserts", stringbuilder.toString());
	//   45   89:ldc1            #60  <String "Asserts">
	//   46   91:aload_3         
	//   47   92:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   48   95:invokestatic    #70  <Method int Log.e(String, String)>
	//   49   98:pop             
			throw new IllegalStateException(s);
	//   50   99:new             #72  <Class IllegalStateException>
	//   51  102:dup             
	//   52  103:aload_0         
	//   53  104:invokespecial   #74  <Method void IllegalStateException(String)>
	//   54  107:athrow          
		}
	}

	public static void checkNotNull(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          5
			return;
	//    2    4:return          
		else
			throw new IllegalArgumentException("null reference");
	//    3    5:new             #82  <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:ldc1            #84  <String "null reference">
	//    6   11:invokespecial   #85  <Method void IllegalArgumentException(String)>
	//    7   14:athrow          
	}

	public static void checkNotNull(Object obj, Object obj1)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          5
			return;
	//    2    4:return          
		else
			throw new IllegalArgumentException(String.valueOf(obj1));
	//    3    5:new             #82  <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokestatic    #39  <Method String String.valueOf(Object)>
	//    7   13:invokespecial   #85  <Method void IllegalArgumentException(String)>
	//    8   16:athrow          
	}

	public static void checkNull(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		else
			throw new IllegalArgumentException("non-null reference");
	//    3    5:new             #82  <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:ldc1            #89  <String "non-null reference">
	//    6   11:invokespecial   #85  <Method void IllegalArgumentException(String)>
	//    7   14:athrow          
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
	//    3    5:new             #72  <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:invokespecial   #92  <Method void IllegalStateException()>
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
	//    3    5:new             #72  <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokestatic    #39  <Method String String.valueOf(Object)>
	//    7   13:invokespecial   #74  <Method void IllegalStateException(String)>
	//    8   16:athrow          
	}

	public static transient void checkState(boolean flag, String s, Object aobj[])
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            5
			return;
	//    2    4:return          
		else
			throw new IllegalStateException(String.format(s, aobj));
	//    3    5:new             #72  <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokestatic    #98  <Method String String.format(String, Object[])>
	//    8   14:invokespecial   #74  <Method void IllegalStateException(String)>
	//    9   17:athrow          
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
