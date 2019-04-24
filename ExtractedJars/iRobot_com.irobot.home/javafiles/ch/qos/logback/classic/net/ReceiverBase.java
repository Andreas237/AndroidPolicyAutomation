// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.net;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;
import java.util.concurrent.ExecutorService;

public abstract class ReceiverBase extends ContextAwareBase
	implements LifeCycle
{

	public ReceiverBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void ContextAwareBase()>
	//    2    4:return          
	}

	protected abstract Runnable getRunnableTask();

	public final boolean isStarted()
	{
		return started;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field boolean started>
	//    2    4:ireturn         
	}

	protected abstract void onStop();

	protected abstract boolean shouldStart();

	public final void start()
	{
		if(isStarted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #24  <Method boolean isStarted()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(getContext() == null)
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #28  <Method Context getContext()>
	//*   6   12:ifnonnull       25
			throw new IllegalStateException("context not set");
	//    7   15:new             #30  <Class IllegalStateException>
	//    8   18:dup             
	//    9   19:ldc1            #32  <String "context not set">
	//   10   21:invokespecial   #35  <Method void IllegalStateException(String)>
	//   11   24:athrow          
		if(shouldStart())
	//*  12   25:aload_0         
	//*  13   26:invokevirtual   #37  <Method boolean shouldStart()>
	//*  14   29:ifeq            55
		{
			getContext().getExecutorService().execute(getRunnableTask());
	//   15   32:aload_0         
	//   16   33:invokevirtual   #28  <Method Context getContext()>
	//   17   36:invokeinterface #43  <Method ExecutorService Context.getExecutorService()>
	//   18   41:aload_0         
	//   19   42:invokevirtual   #45  <Method Runnable getRunnableTask()>
	//   20   45:invokeinterface #51  <Method void ExecutorService.execute(Runnable)>
			started = true;
	//   21   50:aload_0         
	//   22   51:iconst_1        
	//   23   52:putfield        #19  <Field boolean started>
		}
	//   24   55:return          
	}

	public final void stop()
	{
		if(!isStarted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #24  <Method boolean isStarted()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		try
		{
			onStop();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #56  <Method void onStop()>
		}
	//*   6   12:goto            46
		catch(RuntimeException runtimeexception)
	//*   7   15:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   16:new             #58  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #59  <Method void StringBuilder()>
	//   11   23:astore_2        
			stringbuilder.append("on stop: ");
	//   12   24:aload_2         
	//   13   25:ldc1            #61  <String "on stop: ">
	//   14   27:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			stringbuilder.append(((Object) (runtimeexception)));
	//   16   31:aload_2         
	//   17   32:aload_1         
	//   18   33:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
	//   19   36:pop             
			addError(stringbuilder.toString(), ((Throwable) (runtimeexception)));
	//   20   37:aload_0         
	//   21   38:aload_2         
	//   22   39:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   23   42:aload_1         
	//   24   43:invokevirtual   #76  <Method void addError(String, Throwable)>
		}
		started = false;
	//   25   46:aload_0         
	//   26   47:iconst_0        
	//   27   48:putfield        #19  <Field boolean started>
	//   28   51:return          
	}

	private boolean started;
}
