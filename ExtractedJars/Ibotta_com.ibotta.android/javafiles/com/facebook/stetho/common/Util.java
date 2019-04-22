// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common;

import java.io.*;
import java.util.concurrent.*;

// Referenced classes of package com.facebook.stetho.common:
//			LogUtil

public class Util
{

	public Util()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void awaitUninterruptibly(CountDownLatch countdownlatch)
	{
		do
			try
			{
				countdownlatch.await();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #18  <Method void CountDownLatch.await()>
				return;
	//    2    4:return          
			}
			catch(InterruptedException interruptedexception) { }
	//    3    5:astore_1        
		while(true);
	//    4    6:goto            0
	}

	public static void close(Closeable closeable, boolean flag)
		throws IOException
	{
		if(closeable != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          29
		{
			if(flag)
	//*   2    4:iload_1         
	//*   3    5:ifeq            23
			{
				try
				{
					closeable.close();
	//    4    8:aload_0         
	//    5    9:invokeinterface #26  <Method void Closeable.close()>
					return;
	//    6   14:return          
				}
				// Misplaced declaration of an exception variable
				catch(Closeable closeable)
	//*   7   15:astore_0        
				{
					LogUtil.e(((Throwable) (closeable)), "Hiding IOException because another is pending");
	//    8   16:aload_0         
	//    9   17:ldc1            #28  <String "Hiding IOException because another is pending">
	//   10   19:invokestatic    #34  <Method void LogUtil.e(Throwable, String)>
				}
				return;
	//   11   22:return          
			}
			closeable.close();
	//   12   23:aload_0         
	//   13   24:invokeinterface #26  <Method void Closeable.close()>
		}
	//   14   29:return          
	}

	public static void copy(InputStream inputstream, OutputStream outputstream, byte abyte0[])
		throws IOException
	{
		do
		{
			int i = inputstream.read(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #43  <Method int InputStream.read(byte[])>
	//    3    5:istore_3        
			if(i != -1)
	//*   4    6:iload_3         
	//*   5    7:iconst_m1       
	//*   6    8:icmpeq          21
				outputstream.write(abyte0, 0, i);
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:iconst_0        
	//   10   14:iload_3         
	//   11   15:invokevirtual   #49  <Method void OutputStream.write(byte[], int, int)>
			else
	//*  12   18:goto            0
				return;
	//   13   21:return          
		} while(true);
	}

	public static Object getUninterruptibly(Future future)
		throws ExecutionException
	{
_L2:
		Object obj = future.get();
	//    0    0:aload_0         
	//    1    1:invokeinterface #59  <Method Object Future.get()>
	//    2    6:astore_1        
		return obj;
	//    3    7:aload_1         
	//    4    8:areturn         
		InterruptedException interruptedexception;
		interruptedexception;
	//    5    9:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*   6   10:goto            0
	}

	public static Object getUninterruptibly(Future future, long l, TimeUnit timeunit)
		throws TimeoutException, ExecutionException
	{
		long l1;
		l = timeunit.toMillis(l);
	//    0    0:aload_3         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #70  <Method long TimeUnit.toMillis(long)>
	//    3    5:lstore_1        
		l1 = System.currentTimeMillis();
	//    4    6:invokestatic    #76  <Method long System.currentTimeMillis()>
	//    5    9:lstore          4
_L2:
		timeunit = ((TimeUnit) (future.get(l, TimeUnit.MILLISECONDS)));
	//    6   11:aload_0         
	//    7   12:lload_1         
	//    8   13:getstatic       #80  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    9   16:invokeinterface #83  <Method Object Future.get(long, TimeUnit)>
	//   10   21:astore_3        
		return ((Object) (timeunit));
	//   11   22:aload_3         
	//   12   23:areturn         
_L3:
		l -= System.currentTimeMillis() - l1;
	//   13   24:lload_1         
	//   14   25:invokestatic    #76  <Method long System.currentTimeMillis()>
	//   15   28:lload           4
	//   16   30:lsub            
	//   17   31:lsub            
	//   18   32:lstore_1        
		if(true) goto _L2; else goto _L1
	//   19   33:goto            11
_L1:
		timeunit;
	//   20   36:astore_3        
		  goto _L3
	//*  21   37:goto            24
	}

	public static void joinUninterruptibly(Thread thread)
	{
		do
			try
			{
				thread.join();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #91  <Method void Thread.join()>
				return;
	//    2    4:return          
			}
			catch(InterruptedException interruptedexception) { }
	//    3    5:astore_1        
		while(true);
	//    4    6:goto            0
	}

	public static String readAsUTF8(InputStream inputstream)
		throws IOException
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #95  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #96  <Method void ByteArrayOutputStream()>
	//    3    7:astore_1        
		copy(inputstream, ((OutputStream) (bytearrayoutputstream)), new byte[1024]);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:sipush          1024
	//    7   13:newarray        byte[]
	//    8   15:invokestatic    #98  <Method void copy(InputStream, OutputStream, byte[])>
		return bytearrayoutputstream.toString("UTF-8");
	//    9   18:aload_1         
	//   10   19:ldc1            #100 <String "UTF-8">
	//   11   21:invokevirtual   #104 <Method String ByteArrayOutputStream.toString(String)>
	//   12   24:areturn         
	}

	public static void sleepUninterruptibly(long l)
	{
		InterruptedException interruptedexception;
		long l2 = System.currentTimeMillis();
	//    0    0:invokestatic    #76  <Method long System.currentTimeMillis()>
	//    1    3:lstore          4
		long l1;
		do
		{
			try
			{
				Thread.sleep(l);
	//    2    5:lload_0         
	//    3    6:invokestatic    #109 <Method void Thread.sleep(long)>
				return;
	//    4    9:return          
			}
	//*   5   10:lload_0         
	//*   6   11:invokestatic    #76  <Method long System.currentTimeMillis()>
	//*   7   14:lload           4
	//*   8   16:lsub            
	//*   9   17:lsub            
	//*  10   18:lstore_2        
	//*  11   19:lload_2         
	//*  12   20:lstore_0        
	//*  13   21:lload_2         
	//*  14   22:lconst_0        
	//*  15   23:lcmp            
	//*  16   24:ifgt            5
	//*  17   27:return          
			// Misplaced declaration of an exception variable
			catch(InterruptedException interruptedexception)
			{
				l1 = l - (System.currentTimeMillis() - l2);
			}
			l = l1;
		} while(l1 > 0L);
	//*  18   28:astore          6
	//*  19   30:goto            10
	}

	public static void throwIf(boolean flag)
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            5
			return;
	//    2    4:return          
		else
			throw new IllegalStateException();
	//    3    5:new             #113 <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:invokespecial   #114 <Method void IllegalStateException()>
	//    6   12:athrow          
	}

	public static void throwIfNot(boolean flag)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            5
			return;
	//    2    4:return          
		else
			throw new IllegalStateException();
	//    3    5:new             #113 <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:invokespecial   #114 <Method void IllegalStateException()>
	//    6   12:athrow          
	}

	public static transient void throwIfNot(boolean flag, String s, Object aobj[])
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            5
			return;
	//    2    4:return          
		else
			throw new IllegalStateException(String.format(s, aobj));
	//    3    5:new             #113 <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokestatic    #122 <Method String String.format(String, Object[])>
	//    8   14:invokespecial   #125 <Method void IllegalStateException(String)>
	//    9   17:athrow          
	}

	public static void throwIfNotNull(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		else
			throw new IllegalStateException();
	//    3    5:new             #113 <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:invokespecial   #114 <Method void IllegalStateException()>
	//    6   12:athrow          
	}

	public static Object throwIfNull(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          6
			return obj;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			throw new NullPointerException();
	//    4    6:new             #131 <Class NullPointerException>
	//    5    9:dup             
	//    6   10:invokespecial   #132 <Method void NullPointerException()>
	//    7   13:athrow          
	}

	public static void throwIfNull(Object obj, Object obj1)
	{
		throwIfNull(obj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #136 <Method Object throwIfNull(Object)>
	//    2    4:pop             
		throwIfNull(obj1);
	//    3    5:aload_1         
	//    4    6:invokestatic    #136 <Method Object throwIfNull(Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public static void throwIfNull(Object obj, Object obj1, Object obj2)
	{
		throwIfNull(obj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #136 <Method Object throwIfNull(Object)>
	//    2    4:pop             
		throwIfNull(obj1);
	//    3    5:aload_1         
	//    4    6:invokestatic    #136 <Method Object throwIfNull(Object)>
	//    5    9:pop             
		throwIfNull(obj2);
	//    6   10:aload_2         
	//    7   11:invokestatic    #136 <Method Object throwIfNull(Object)>
	//    8   14:pop             
	//    9   15:return          
	}
}
