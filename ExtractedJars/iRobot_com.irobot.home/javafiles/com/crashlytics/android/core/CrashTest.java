// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.os.AsyncTask;
import b.a.a.a.c;
import b.a.a.a.l;

public class CrashTest
{

	public CrashTest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	private void privateMethodThatThrowsException(String s)
	{
		throw new RuntimeException(s);
	//    0    0:new             #15  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #17  <Method void RuntimeException(String)>
	//    4    8:athrow          
	}

	public void crashAsyncTask(final long delayMs)
	{
		((AsyncTask) (new AsyncTask() {

			protected volatile Object doInBackground(Object aobj[])
			{
				return ((Object) (doInBackground((Void[])aobj)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #28  <Class Void[]>
			//    3    5:invokevirtual   #31  <Method Void doInBackground(Void[])>
			//    4    8:areturn         
			}

			protected transient Void doInBackground(Void avoid[])
			{
				try
				{
					Thread.sleep(delayMs);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field long val$delayMs>
			//    2    4:invokestatic    #38  <Method void Thread.sleep(long)>
				}
			//*   3    7:aload_0         
			//*   4    8:getfield        #18  <Field CrashTest this$0>
			//*   5   11:ldc1            #40  <String "Background thread crash">
			//*   6   13:invokevirtual   #44  <Method void CrashTest.throwRuntimeException(String)>
			//*   7   16:aconst_null     
			//*   8   17:areturn         
				// Misplaced declaration of an exception variable
				catch(Void avoid[]) { }
			//    9   18:astore_1        
				throwRuntimeException("Background thread crash");
				return null;
			//*  10   19:goto            7
			}

			final CrashTest this$0;
			final long val$delayMs;

			
			{
				this$0 = CrashTest.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field CrashTest this$0>
				delayMs = l1;
			//    3    5:aload_0         
			//    4    6:lload_2         
			//    5    7:putfield        #20  <Field long val$delayMs>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void AsyncTask()>
			//    8   14:return          
			}
		}
)).execute(((Object []) (new Void[] {
			(Void)null
		})));
	//    0    0:new             #6   <Class CrashTest$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:invokespecial   #22  <Method void CrashTest$1(CrashTest, long)>
	//    5    9:iconst_1        
	//    6   10:anewarray       Void[]
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:aconst_null     
	//   10   16:checkcast       #24  <Class Void>
	//   11   19:aastore         
	//   12   20:invokevirtual   #30  <Method AsyncTask AsyncTask.execute(Object[])>
	//   13   23:pop             
	//   14   24:return          
	}

	public void indexOutOfBounds()
	{
		int i = (new int[2])[10];
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:bipush          10
	//    3    5:iaload          
	//    4    6:istore_1        
		l l1 = c.g();
	//    5    7:invokestatic    #37  <Method l c.g()>
	//    6   10:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #39  <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #40  <Method void StringBuilder()>
	//   10   18:astore_3        
		stringbuilder.append("Out of bounds value: ");
	//   11   19:aload_3         
	//   12   20:ldc1            #42  <String "Out of bounds value: ">
	//   13   22:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
		stringbuilder.append(i);
	//   15   26:aload_3         
	//   16   27:iload_1         
	//   17   28:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   18   31:pop             
		l1.a("CrashlyticsCore", stringbuilder.toString());
	//   19   32:aload_2         
	//   20   33:ldc1            #51  <String "CrashlyticsCore">
	//   21   35:aload_3         
	//   22   36:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   23   39:invokeinterface #61  <Method void l.a(String, String)>
	//   24   44:return          
	}

	public int stackOverflow()
	{
		return stackOverflow() + (int)Math.random();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method int stackOverflow()>
	//    2    4:invokestatic    #71  <Method double Math.random()>
	//    3    7:d2i             
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public void throwFiveChainedExceptions()
	{
		try
		{
			privateMethodThatThrowsException("1");
	//    0    0:aload_0         
	//    1    1:ldc1            #76  <String "1">
	//    2    3:invokespecial   #78  <Method void privateMethodThatThrowsException(String)>
			return;
	//    3    6:return          
		}
		catch(Exception exception)
	//*   4    7:astore_1        
		{
			try
			{
				throw new RuntimeException("2", ((Throwable) (exception)));
	//    5    8:new             #15  <Class RuntimeException>
	//    6   11:dup             
	//    7   12:ldc1            #80  <String "2">
	//    8   14:aload_1         
	//    9   15:invokespecial   #83  <Method void RuntimeException(String, Throwable)>
	//   10   18:athrow          
			}
			catch(Exception exception1)
	//*  11   19:astore_1        
			{
				try
				{
					throw new RuntimeException("3", ((Throwable) (exception1)));
	//   12   20:new             #15  <Class RuntimeException>
	//   13   23:dup             
	//   14   24:ldc1            #85  <String "3">
	//   15   26:aload_1         
	//   16   27:invokespecial   #83  <Method void RuntimeException(String, Throwable)>
	//   17   30:athrow          
				}
				catch(Exception exception2)
	//*  18   31:astore_1        
				{
					try
					{
						throw new RuntimeException("4", ((Throwable) (exception2)));
	//   19   32:new             #15  <Class RuntimeException>
	//   20   35:dup             
	//   21   36:ldc1            #87  <String "4">
	//   22   38:aload_1         
	//   23   39:invokespecial   #83  <Method void RuntimeException(String, Throwable)>
	//   24   42:athrow          
					}
					catch(Exception exception3)
	//*  25   43:astore_1        
					{
						throw new RuntimeException("5", ((Throwable) (exception3)));
	//   26   44:new             #15  <Class RuntimeException>
	//   27   47:dup             
	//   28   48:ldc1            #89  <String "5">
	//   29   50:aload_1         
	//   30   51:invokespecial   #83  <Method void RuntimeException(String, Throwable)>
	//   31   54:athrow          
					}
				}
			}
		}
	}

	public void throwRuntimeException(String s)
	{
		throw new RuntimeException(s);
	//    0    0:new             #15  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #17  <Method void RuntimeException(String)>
	//    4    8:athrow          
	}
}
