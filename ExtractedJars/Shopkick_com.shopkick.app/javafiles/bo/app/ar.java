// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class ar
	implements ThreadFactory
{

	public ar()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = new AtomicInteger(1);
	//    2    4:aload_0         
	//    3    5:new             #18  <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:invokespecial   #21  <Method void AtomicInteger(int)>
	//    7   13:putfield        #23  <Field AtomicInteger a>
		b = ((Class) (bo/app/ar)).getSimpleName();
	//    8   16:aload_0         
	//    9   17:ldc1            #2   <Class ar>
	//   10   19:invokevirtual   #29  <Method String Class.getSimpleName()>
	//   11   22:putfield        #31  <Field String b>
	//   12   25:return          
	}

	public ar(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = new AtomicInteger(1);
	//    2    4:aload_0         
	//    3    5:new             #18  <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:invokespecial   #21  <Method void AtomicInteger(int)>
	//    7   13:putfield        #23  <Field AtomicInteger a>
		b = s;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #31  <Field String b>
	//   11   21:return          
	}

	public void a(Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
	{
		c = uncaughtexceptionhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field Thread$UncaughtExceptionHandler c>
	//    3    5:return          
	}

	public Thread newThread(Runnable runnable)
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Thread$UncaughtExceptionHandler c>
	//*   2    4:ifnull          66
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #40  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #41  <Method void StringBuilder()>
	//    6   14:astore_2        
			stringbuilder.append(b);
	//    7   15:aload_2         
	//    8   16:aload_0         
	//    9   17:getfield        #31  <Field String b>
	//   10   20:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(" #");
	//   12   24:aload_2         
	//   13   25:ldc1            #47  <String " #">
	//   14   27:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			stringbuilder.append(a.getAndIncrement());
	//   16   31:aload_2         
	//   17   32:aload_0         
	//   18   33:getfield        #23  <Field AtomicInteger a>
	//   19   36:invokevirtual   #51  <Method int AtomicInteger.getAndIncrement()>
	//   20   39:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   21   42:pop             
			runnable = ((Runnable) (new Thread(runnable, stringbuilder.toString())));
	//   22   43:new             #56  <Class Thread>
	//   23   46:dup             
	//   24   47:aload_1         
	//   25   48:aload_2         
	//   26   49:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   27   52:invokespecial   #62  <Method void Thread(Runnable, String)>
	//   28   55:astore_1        
			((Thread) (runnable)).setUncaughtExceptionHandler(c);
	//   29   56:aload_1         
	//   30   57:aload_0         
	//   31   58:getfield        #36  <Field Thread$UncaughtExceptionHandler c>
	//   32   61:invokevirtual   #65  <Method void Thread.setUncaughtExceptionHandler(Thread$UncaughtExceptionHandler)>
			return ((Thread) (runnable));
	//   33   64:aload_1         
	//   34   65:areturn         
		} else
		{
			throw new IllegalStateException("No UncaughtExceptionHandler. You must call setUncaughtExceptionHandler before creating a new thread");
	//   35   66:new             #67  <Class IllegalStateException>
	//   36   69:dup             
	//   37   70:ldc1            #69  <String "No UncaughtExceptionHandler. You must call setUncaughtExceptionHandler before creating a new thread">
	//   38   72:invokespecial   #71  <Method void IllegalStateException(String)>
	//   39   75:athrow          
		}
	}

	private final AtomicInteger a;
	private final String b;
	private Thread.UncaughtExceptionHandler c;
}
