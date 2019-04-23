// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;
import java.util.concurrent.Semaphore;

// Referenced classes of package bo.app:
//			y, bl

class y$3
	implements IEventSubscriber
{

	public void a(Throwable throwable)
	{
		y.f(b).a(throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field y b>
	//    2    4:invokestatic    #32  <Method bl y.f(y)>
	//    3    7:aload_1         
	//    4    8:invokeinterface #36  <Method void bl.a(Throwable)>
		throwable = ((Throwable) (a));
	//    5   13:aload_0         
	//    6   14:getfield        #21  <Field Semaphore a>
	//    7   17:astore_1        
		if(throwable == null) goto _L2; else goto _L1
	//    8   18:aload_1         
	//    9   19:ifnull          54
_L1:
		((Semaphore) (throwable)).release();
	//   10   22:aload_1         
	//   11   23:invokevirtual   #41  <Method void Semaphore.release()>
		return;
	//   12   26:return          
		throwable;
	//   13   27:astore_1        
		break MISSING_BLOCK_LABEL_55;
	//   14   28:goto            55
		throwable;
	//   15   31:astore_1        
		AppboyLogger.e(y.o(), "Failed to log error.", throwable);
	//   16   32:invokestatic    #45  <Method String y.o()>
	//   17   35:ldc1            #47  <String "Failed to log error.">
	//   18   37:aload_1         
	//   19   38:invokestatic    #53  <Method int AppboyLogger.e(String, String, Throwable)>
	//   20   41:pop             
		throwable = ((Throwable) (a));
	//   21   42:aload_0         
	//   22   43:getfield        #21  <Field Semaphore a>
	//   23   46:astore_1        
		if(throwable == null) goto _L2; else goto _L1
	//   24   47:aload_1         
	//   25   48:ifnull          54
	//*  26   51:goto            22
_L2:
		return;
	//   27   54:return          
		Semaphore semaphore = a;
	//   28   55:aload_0         
	//   29   56:getfield        #21  <Field Semaphore a>
	//   30   59:astore_2        
		if(semaphore != null)
	//*  31   60:aload_2         
	//*  32   61:ifnull          68
			semaphore.release();
	//   33   64:aload_2         
	//   34   65:invokevirtual   #41  <Method void Semaphore.release()>
		throw throwable;
	//   35   68:aload_1         
	//   36   69:athrow          
	}

	public void trigger(Object obj)
	{
		a((Throwable)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #57  <Class Throwable>
	//    3    5:invokevirtual   #58  <Method void a(Throwable)>
	//    4    8:return          
	}

	final Semaphore a;
	final y b;

	y$3(y y1, Semaphore semaphore)
	{
		b = y1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field y b>
		a = semaphore;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Semaphore a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
