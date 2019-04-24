// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.util.concurrent.*;

// Referenced classes of package com.bumptech.glide.request:
//			FutureTarget, Request

public class RequestFutureTarget
	implements FutureTarget, Runnable
{
	static class Waiter
	{

		public void notifyAll(Object obj)
		{
			obj.notifyAll();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #16  <Method void Object.notifyAll()>
		//    2    4:return          
		}

		public void waitForTimeout(Object obj, long l)
			throws InterruptedException
		{
			obj.wait(l);
		//    0    0:aload_1         
		//    1    1:lload_2         
		//    2    2:invokevirtual   #24  <Method void Object.wait(long)>
		//    3    5:return          
		}

		Waiter()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public RequestFutureTarget(Handler handler, int i, int j)
	{
		this(handler, i, j, true, DEFAULT_WAITER);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iconst_1        
	//    5    5:getstatic       #38  <Field RequestFutureTarget$Waiter DEFAULT_WAITER>
	//    6    8:invokespecial   #43  <Method void RequestFutureTarget(Handler, int, int, boolean, RequestFutureTarget$Waiter)>
	//    7   11:return          
	}

	RequestFutureTarget(Handler handler, int i, int j, boolean flag, Waiter waiter1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		mainHandler = handler;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #46  <Field Handler mainHandler>
		width = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #48  <Field int width>
		height = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #50  <Field int height>
		assertBackgroundThread = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #52  <Field boolean assertBackgroundThread>
		waiter = waiter1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #54  <Field RequestFutureTarget$Waiter waiter>
	//   17   31:return          
	}

	private void clearOnMainThread()
	{
		mainHandler.post(((Runnable) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Handler mainHandler>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #61  <Method boolean Handler.post(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	private Object doGet(Long long1)
		throws ExecutionException, InterruptedException, TimeoutException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(assertBackgroundThread && !isDone())
	//*   2    2:aload_0         
	//*   3    3:getfield        #52  <Field boolean assertBackgroundThread>
	//*   4    6:ifeq            19
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #73  <Method boolean isDone()>
	//*   7   13:ifne            19
			Util.assertBackgroundThread();
	//    8   16:invokestatic    #77  <Method void Util.assertBackgroundThread()>
		if(isCancelled)
	//*   9   19:aload_0         
	//*  10   20:getfield        #79  <Field boolean isCancelled>
	//*  11   23:ifeq            34
			throw new CancellationException();
	//   12   26:new             #81  <Class CancellationException>
	//   13   29:dup             
	//   14   30:invokespecial   #82  <Method void CancellationException()>
	//   15   33:athrow          
		if(loadFailed)
	//*  16   34:aload_0         
	//*  17   35:getfield        #84  <Field boolean loadFailed>
	//*  18   38:ifeq            58
			throw new ExecutionException(((Throwable) (new IllegalStateException("Load failed"))));
	//   19   41:new             #65  <Class ExecutionException>
	//   20   44:dup             
	//   21   45:new             #86  <Class IllegalStateException>
	//   22   48:dup             
	//   23   49:ldc1            #88  <String "Load failed">
	//   24   51:invokespecial   #91  <Method void IllegalStateException(String)>
	//   25   54:invokespecial   #94  <Method void ExecutionException(Throwable)>
	//   26   57:athrow          
		if(!resultReceived)
			break MISSING_BLOCK_LABEL_74;
	//   27   58:aload_0         
	//   28   59:getfield        #96  <Field boolean resultReceived>
	//   29   62:ifeq            74
		long1 = ((Long) (resource));
	//   30   65:aload_0         
	//   31   66:getfield        #98  <Field Object resource>
	//   32   69:astore_1        
		this;
	//   33   70:aload_0         
		JVM INSTR monitorexit ;
	//   34   71:monitorexit     
		return ((Object) (long1));
	//   35   72:aload_1         
	//   36   73:areturn         
		if(long1 != null)
			break MISSING_BLOCK_LABEL_90;
	//   37   74:aload_1         
	//   38   75:ifnonnull       90
		waiter.waitForTimeout(((Object) (this)), 0L);
	//   39   78:aload_0         
	//   40   79:getfield        #54  <Field RequestFutureTarget$Waiter waiter>
	//   41   82:aload_0         
	//   42   83:lconst_0        
	//   43   84:invokevirtual   #102 <Method void RequestFutureTarget$Waiter.waitForTimeout(Object, long)>
		break MISSING_BLOCK_LABEL_111;
	//   44   87:goto            111
		if(long1.longValue() > 0L)
	//*  45   90:aload_1         
	//*  46   91:invokevirtual   #108 <Method long Long.longValue()>
	//*  47   94:lconst_0        
	//*  48   95:lcmp            
	//*  49   96:ifle            111
			waiter.waitForTimeout(((Object) (this)), long1.longValue());
	//   50   99:aload_0         
	//   51  100:getfield        #54  <Field RequestFutureTarget$Waiter waiter>
	//   52  103:aload_0         
	//   53  104:aload_1         
	//   54  105:invokevirtual   #108 <Method long Long.longValue()>
	//   55  108:invokevirtual   #102 <Method void RequestFutureTarget$Waiter.waitForTimeout(Object, long)>
		if(Thread.interrupted())
	//*  56  111:invokestatic    #113 <Method boolean Thread.interrupted()>
	//*  57  114:ifeq            125
			throw new InterruptedException();
	//   58  117:new             #67  <Class InterruptedException>
	//   59  120:dup             
	//   60  121:invokespecial   #114 <Method void InterruptedException()>
	//   61  124:athrow          
		if(loadFailed)
	//*  62  125:aload_0         
	//*  63  126:getfield        #84  <Field boolean loadFailed>
	//*  64  129:ifeq            149
			throw new ExecutionException(((Throwable) (new IllegalStateException("Load failed"))));
	//   65  132:new             #65  <Class ExecutionException>
	//   66  135:dup             
	//   67  136:new             #86  <Class IllegalStateException>
	//   68  139:dup             
	//   69  140:ldc1            #88  <String "Load failed">
	//   70  142:invokespecial   #91  <Method void IllegalStateException(String)>
	//   71  145:invokespecial   #94  <Method void ExecutionException(Throwable)>
	//   72  148:athrow          
		if(isCancelled)
	//*  73  149:aload_0         
	//*  74  150:getfield        #79  <Field boolean isCancelled>
	//*  75  153:ifeq            164
			throw new CancellationException();
	//   76  156:new             #81  <Class CancellationException>
	//   77  159:dup             
	//   78  160:invokespecial   #82  <Method void CancellationException()>
	//   79  163:athrow          
		if(!resultReceived)
	//*  80  164:aload_0         
	//*  81  165:getfield        #96  <Field boolean resultReceived>
	//*  82  168:ifne            179
			throw new TimeoutException();
	//   83  171:new             #69  <Class TimeoutException>
	//   84  174:dup             
	//   85  175:invokespecial   #115 <Method void TimeoutException()>
	//   86  178:athrow          
		long1 = ((Long) (resource));
	//   87  179:aload_0         
	//   88  180:getfield        #98  <Field Object resource>
	//   89  183:astore_1        
		this;
	//   90  184:aload_0         
		JVM INSTR monitorexit ;
	//   91  185:monitorexit     
		return ((Object) (long1));
	//   92  186:aload_1         
	//   93  187:areturn         
		long1;
	//   94  188:astore_1        
	//*  95  189:aload_0         
		throw long1;
	//   96  190:monitorexit     
	//   97  191:aload_1         
	//   98  192:athrow          
	}

	public boolean cancel(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!isDone())
			break MISSING_BLOCK_LABEL_13;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #73  <Method boolean isDone()>
	//    4    6:ifeq            13
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		isCancelled = true;
	//    9   13:aload_0         
	//   10   14:iconst_1        
	//   11   15:putfield        #79  <Field boolean isCancelled>
		waiter.notifyAll(((Object) (this)));
	//   12   18:aload_0         
	//   13   19:getfield        #54  <Field RequestFutureTarget$Waiter waiter>
	//   14   22:aload_0         
	//   15   23:invokevirtual   #124 <Method void RequestFutureTarget$Waiter.notifyAll(Object)>
		if(!flag)
			break MISSING_BLOCK_LABEL_34;
	//   16   26:iload_1         
	//   17   27:ifeq            34
		clearOnMainThread();
	//   18   30:aload_0         
	//   19   31:invokespecial   #126 <Method void clearOnMainThread()>
		this;
	//   20   34:aload_0         
		JVM INSTR monitorexit ;
	//   21   35:monitorexit     
		return true;
	//   22   36:iconst_1        
	//   23   37:ireturn         
		Exception exception;
		exception;
	//   24   38:astore_2        
	//*  25   39:aload_0         
		throw exception;
	//   26   40:monitorexit     
	//   27   41:aload_2         
	//   28   42:athrow          
	}

	public Object get()
		throws InterruptedException, ExecutionException
	{
		Object obj;
		try
		{
			obj = doGet(((Long) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #130 <Method Object doGet(Long)>
	//    3    5:astore_1        
		}
	//*   4    6:aload_1         
	//*   5    7:areturn         
		catch(TimeoutException timeoutexception)
	//*   6    8:astore_1        
		{
			throw new AssertionError(((Object) (timeoutexception)));
	//    7    9:new             #132 <Class AssertionError>
	//    8   12:dup             
	//    9   13:aload_1         
	//   10   14:invokespecial   #134 <Method void AssertionError(Object)>
	//   11   17:athrow          
		}
		return obj;
	}

	public Object get(long l, TimeUnit timeunit)
		throws InterruptedException, ExecutionException, TimeoutException
	{
		return doGet(Long.valueOf(timeunit.toMillis(l)));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:lload_1         
	//    3    3:invokevirtual   #142 <Method long TimeUnit.toMillis(long)>
	//    4    6:invokestatic    #146 <Method Long Long.valueOf(long)>
	//    5    9:invokespecial   #130 <Method Object doGet(Long)>
	//    6   12:areturn         
	}

	public Request getRequest()
	{
		return request;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field Request request>
	//    2    4:areturn         
	}

	public void getSize(SizeReadyCallback sizereadycallback)
	{
		sizereadycallback.onSizeReady(width, height);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #48  <Field int width>
	//    3    5:aload_0         
	//    4    6:getfield        #50  <Field int height>
	//    5    9:invokeinterface #160 <Method void SizeReadyCallback.onSizeReady(int, int)>
	//    6   14:return          
	}

	public boolean isCancelled()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = isCancelled;
	//    2    2:aload_0         
	//    3    3:getfield        #79  <Field boolean isCancelled>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return flag;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public boolean isDone()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		if(isCancelled)
			break MISSING_BLOCK_LABEL_18;
	//    2    2:aload_0         
	//    3    3:getfield        #79  <Field boolean isCancelled>
	//    4    6:ifne            18
		flag = resultReceived;
	//    5    9:aload_0         
	//    6   10:getfield        #96  <Field boolean resultReceived>
	//    7   13:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_23;
	//    8   14:iload_1         
	//    9   15:ifeq            23
		flag = true;
	//   10   18:iconst_1        
	//   11   19:istore_1        
		break MISSING_BLOCK_LABEL_25;
	//   12   20:goto            25
		flag = false;
	//   13   23:iconst_0        
	//   14   24:istore_1        
	//*  15   25:aload_0         
		return flag;
	//   16   26:monitorexit     
	//   17   27:iload_1         
	//   18   28:ireturn         
		Exception exception;
		exception;
	//   19   29:astore_2        
	//*  20   30:aload_0         
		throw exception;
	//   21   31:monitorexit     
	//   22   32:aload_2         
	//   23   33:athrow          
	}

	public void onDestroy()
	{
	//    0    0:return          
	}

	public void onLoadCleared(Drawable drawable)
	{
	//    0    0:return          
	}

	public void onLoadFailed(Drawable drawable)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		loadFailed = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #84  <Field boolean loadFailed>
		waiter.notifyAll(((Object) (this)));
	//    5    7:aload_0         
	//    6    8:getfield        #54  <Field RequestFutureTarget$Waiter waiter>
	//    7   11:aload_0         
	//    8   12:invokevirtual   #124 <Method void RequestFutureTarget$Waiter.notifyAll(Object)>
		this;
	//    9   15:aload_0         
		JVM INSTR monitorexit ;
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		drawable;
	//   12   18:astore_1        
	//*  13   19:aload_0         
		throw drawable;
	//   14   20:monitorexit     
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	public void onLoadStarted(Drawable drawable)
	{
	//    0    0:return          
	}

	public void onResourceReady(Object obj, Transition transition)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		resultReceived = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #96  <Field boolean resultReceived>
		resource = obj;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #98  <Field Object resource>
		waiter.notifyAll(((Object) (this)));
	//    8   12:aload_0         
	//    9   13:getfield        #54  <Field RequestFutureTarget$Waiter waiter>
	//   10   16:aload_0         
	//   11   17:invokevirtual   #124 <Method void RequestFutureTarget$Waiter.notifyAll(Object)>
		this;
	//   12   20:aload_0         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		return;
	//   14   22:return          
		obj;
	//   15   23:astore_1        
	//*  16   24:aload_0         
		throw obj;
	//   17   25:monitorexit     
	//   18   26:aload_1         
	//   19   27:athrow          
	}

	public void onStart()
	{
	//    0    0:return          
	}

	public void onStop()
	{
	//    0    0:return          
	}

	public void removeCallback(SizeReadyCallback sizereadycallback)
	{
	//    0    0:return          
	}

	public void run()
	{
		if(request != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #151 <Field Request request>
	//*   2    4:ifnull          21
		{
			request.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #151 <Field Request request>
	//    5   11:invokeinterface #177 <Method void Request.clear()>
			request = null;
	//    6   16:aload_0         
	//    7   17:aconst_null     
	//    8   18:putfield        #151 <Field Request request>
		}
	//    9   21:return          
	}

	public void setRequest(Request request1)
	{
		request = request1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #151 <Field Request request>
	//    3    5:return          
	}

	private static final Waiter DEFAULT_WAITER = new Waiter();
	private final boolean assertBackgroundThread;
	private final int height;
	private boolean isCancelled;
	private boolean loadFailed;
	private final Handler mainHandler;
	private Request request;
	private Object resource;
	private boolean resultReceived;
	private final Waiter waiter;
	private final int width;

	static 
	{
	//    0    0:new             #11  <Class RequestFutureTarget$Waiter>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void RequestFutureTarget$Waiter()>
	//    3    7:putstatic       #38  <Field RequestFutureTarget$Waiter DEFAULT_WAITER>
	//*   4   10:return          
	}
}
