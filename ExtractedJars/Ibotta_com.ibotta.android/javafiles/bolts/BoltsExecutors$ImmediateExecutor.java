// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

// Referenced classes of package bolts:
//			BoltsExecutors

private static class BoltsExecutors$ImmediateExecutor
	implements Executor
{

	private int decrementDepth()
	{
		Integer integer1 = (Integer)executionDepth.get();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ThreadLocal executionDepth>
	//    2    4:invokevirtual   #30  <Method Object ThreadLocal.get()>
	//    3    7:checkcast       #32  <Class Integer>
	//    4   10:astore_3        
		Integer integer = integer1;
	//    5   11:aload_3         
	//    6   12:astore_2        
		if(integer1 == null)
	//*   7   13:aload_3         
	//*   8   14:ifnonnull       22
			integer = Integer.valueOf(0);
	//    9   17:iconst_0        
	//   10   18:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   11   21:astore_2        
		int i = integer.intValue() - 1;
	//   12   22:aload_2         
	//   13   23:invokevirtual   #39  <Method int Integer.intValue()>
	//   14   26:iconst_1        
	//   15   27:isub            
	//   16   28:istore_1        
		if(i == 0)
	//*  17   29:iload_1         
	//*  18   30:ifne            42
		{
			executionDepth.remove();
	//   19   33:aload_0         
	//   20   34:getfield        #21  <Field ThreadLocal executionDepth>
	//   21   37:invokevirtual   #42  <Method void ThreadLocal.remove()>
			return i;
	//   22   40:iload_1         
	//   23   41:ireturn         
		} else
		{
			executionDepth.set(((Object) (Integer.valueOf(i))));
	//   24   42:aload_0         
	//   25   43:getfield        #21  <Field ThreadLocal executionDepth>
	//   26   46:iload_1         
	//   27   47:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   28   50:invokevirtual   #46  <Method void ThreadLocal.set(Object)>
			return i;
	//   29   53:iload_1         
	//   30   54:ireturn         
		}
	}

	private int incrementDepth()
	{
		Integer integer1 = (Integer)executionDepth.get();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ThreadLocal executionDepth>
	//    2    4:invokevirtual   #30  <Method Object ThreadLocal.get()>
	//    3    7:checkcast       #32  <Class Integer>
	//    4   10:astore_3        
		Integer integer = integer1;
	//    5   11:aload_3         
	//    6   12:astore_2        
		if(integer1 == null)
	//*   7   13:aload_3         
	//*   8   14:ifnonnull       22
			integer = Integer.valueOf(0);
	//    9   17:iconst_0        
	//   10   18:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   11   21:astore_2        
		int i = integer.intValue() + 1;
	//   12   22:aload_2         
	//   13   23:invokevirtual   #39  <Method int Integer.intValue()>
	//   14   26:iconst_1        
	//   15   27:iadd            
	//   16   28:istore_1        
		executionDepth.set(((Object) (Integer.valueOf(i))));
	//   17   29:aload_0         
	//   18   30:getfield        #21  <Field ThreadLocal executionDepth>
	//   19   33:iload_1         
	//   20   34:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   21   37:invokevirtual   #46  <Method void ThreadLocal.set(Object)>
		return i;
	//   22   40:iload_1         
	//   23   41:ireturn         
	}

	public void execute(Runnable runnable)
	{
		if(incrementDepth() > 15)
			break MISSING_BLOCK_LABEL_18;
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method int incrementDepth()>
	//    2    4:bipush          15
	//    3    6:icmpgt          18
		runnable.run();
	//    4    9:aload_1         
	//    5   10:invokeinterface #56  <Method void Runnable.run()>
		break MISSING_BLOCK_LABEL_27;
	//    6   15:goto            27
		BoltsExecutors.background().execute(runnable);
	//    7   18:invokestatic    #60  <Method ExecutorService BoltsExecutors.background()>
	//    8   21:aload_1         
	//    9   22:invokeinterface #64  <Method void ExecutorService.execute(Runnable)>
		decrementDepth();
	//   10   27:aload_0         
	//   11   28:invokespecial   #66  <Method int decrementDepth()>
	//   12   31:pop             
		return;
	//   13   32:return          
		runnable;
	//   14   33:astore_1        
		decrementDepth();
	//   15   34:aload_0         
	//   16   35:invokespecial   #66  <Method int decrementDepth()>
	//   17   38:pop             
		throw runnable;
	//   18   39:aload_1         
	//   19   40:athrow          
	}

	private ThreadLocal executionDepth;

	private BoltsExecutors$ImmediateExecutor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		executionDepth = new ThreadLocal();
	//    2    4:aload_0         
	//    3    5:new             #18  <Class ThreadLocal>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void ThreadLocal()>
	//    6   12:putfield        #21  <Field ThreadLocal executionDepth>
	//    7   15:return          
	}

	BoltsExecutors$ImmediateExecutor(BoltsExecutors._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void BoltsExecutors$ImmediateExecutor()>
	//    2    4:return          
	}
}
