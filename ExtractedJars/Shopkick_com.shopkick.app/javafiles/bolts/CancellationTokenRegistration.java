// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.io.Closeable;

// Referenced classes of package bolts:
//			CancellationTokenSource

public class CancellationTokenRegistration
	implements Closeable
{

	CancellationTokenRegistration(CancellationTokenSource cancellationtokensource, Runnable runnable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void Object()>
	//    6   12:putfield        #21  <Field Object lock>
		tokenSource = cancellationtokensource;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #23  <Field CancellationTokenSource tokenSource>
		action = runnable;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #25  <Field Runnable action>
	//   13   25:return          
	}

	private void throwIfClosed()
	{
		if(!closed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field boolean closed>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		else
			throw new IllegalStateException("Object already closed");
	//    4    8:new             #31  <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc1            #33  <String "Object already closed">
	//    7   14:invokespecial   #36  <Method void IllegalStateException(String)>
	//    8   17:athrow          
	}

	public void close()
	{
label0:
		{
			synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(!closed)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #29  <Field boolean closed>
	//    7   11:ifeq            17
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		closed = true;
	//   11   17:aload_0         
	//   12   18:iconst_1        
	//   13   19:putfield        #29  <Field boolean closed>
		tokenSource.unregister(this);
	//   14   22:aload_0         
	//   15   23:getfield        #23  <Field CancellationTokenSource tokenSource>
	//   16   26:aload_0         
	//   17   27:invokevirtual   #43  <Method void CancellationTokenSource.unregister(CancellationTokenRegistration)>
		tokenSource = null;
	//   18   30:aload_0         
	//   19   31:aconst_null     
	//   20   32:putfield        #23  <Field CancellationTokenSource tokenSource>
		action = null;
	//   21   35:aload_0         
	//   22   36:aconst_null     
	//   23   37:putfield        #25  <Field Runnable action>
		obj;
	//   24   40:aload_1         
		JVM INSTR monitorexit ;
	//   25   41:monitorexit     
		return;
	//   26   42:return          
		exception;
	//   27   43:astore_2        
		obj;
	//   28   44:aload_1         
		JVM INSTR monitorexit ;
	//   29   45:monitorexit     
		throw exception;
	//   30   46:aload_2         
	//   31   47:athrow          
	}

	void runAction()
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			throwIfClosed();
	//    5    7:aload_0         
	//    6    8:invokespecial   #46  <Method void throwIfClosed()>
			action.run();
	//    7   11:aload_0         
	//    8   12:getfield        #25  <Field Runnable action>
	//    9   15:invokeinterface #51  <Method void Runnable.run()>
			close();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #53  <Method void close()>
		}
	//   12   24:aload_1         
	//   13   25:monitorexit     
		return;
	//   14   26:return          
		exception;
	//   15   27:astore_2        
		obj;
	//   16   28:aload_1         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		throw exception;
	//   18   30:aload_2         
	//   19   31:athrow          
	}

	private Runnable action;
	private boolean closed;
	private final Object lock = new Object();
	private CancellationTokenSource tokenSource;
}
