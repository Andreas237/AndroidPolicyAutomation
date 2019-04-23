// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.util.concurrent.*;

// Referenced classes of package com.bumptech.glide.request:
//			FutureTarget, RequestListener, Request

public class RequestFutureTarget
	implements FutureTarget, RequestListener, Runnable
{
	static class Waiter
	{

		void notifyAll(Object obj)
		{
			obj.notifyAll();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #17  <Method void Object.notifyAll()>
		//    2    4:return          
		}

		void waitForTimeout(Object obj, long l)
			throws InterruptedException
		{
			obj.wait(l);
		//    0    0:aload_1         
		//    1    1:lload_2         
		//    2    2:invokevirtual   #25  <Method void Object.wait(long)>
		//    3    5:return          
		}

		Waiter()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Object()>
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
	//    5    5:getstatic       #42  <Field RequestFutureTarget$Waiter DEFAULT_WAITER>
	//    6    8:invokespecial   #47  <Method void RequestFutureTarget(Handler, int, int, boolean, RequestFutureTarget$Waiter)>
	//    7   11:return          
	}

	RequestFutureTarget(Handler handler, int i, int j, boolean flag, Waiter waiter1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		mainHandler = handler;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #50  <Field Handler mainHandler>
		width = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #52  <Field int width>
		height = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #54  <Field int height>
		assertBackgroundThread = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #56  <Field boolean assertBackgroundThread>
		waiter = waiter1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #58  <Field RequestFutureTarget$Waiter waiter>
	//   17   31:return          
	}

	private void clearOnMainThread()
	{
		mainHandler.post(((Runnable) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Handler mainHandler>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #65  <Method boolean Handler.post(Runnable)>
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
	//*   3    3:getfield        #56  <Field boolean assertBackgroundThread>
	//*   4    6:ifeq            19
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #77  <Method boolean isDone()>
	//*   7   13:ifne            19
			Util.assertBackgroundThread();
	//    8   16:invokestatic    #81  <Method void Util.assertBackgroundThread()>
		if(isCancelled)
			break MISSING_BLOCK_LABEL_203;
	//    9   19:aload_0         
	//   10   20:getfield        #83  <Field boolean isCancelled>
	//   11   23:ifne            203
		if(loadFailed)
			break MISSING_BLOCK_LABEL_191;
	//   12   26:aload_0         
	//   13   27:getfield        #85  <Field boolean loadFailed>
	//   14   30:ifne            191
		if(!resultReceived)
			break MISSING_BLOCK_LABEL_49;
	//   15   33:aload_0         
	//   16   34:getfield        #87  <Field boolean resultReceived>
	//   17   37:ifeq            49
		long1 = ((Long) (resource));
	//   18   40:aload_0         
	//   19   41:getfield        #89  <Field Object resource>
	//   20   44:astore_1        
		this;
	//   21   45:aload_0         
		JVM INSTR monitorexit ;
	//   22   46:monitorexit     
		return ((Object) (long1));
	//   23   47:aload_1         
	//   24   48:areturn         
		if(long1 != null)
			break MISSING_BLOCK_LABEL_65;
	//   25   49:aload_1         
	//   26   50:ifnonnull       65
		waiter.waitForTimeout(((Object) (this)), 0L);
	//   27   53:aload_0         
	//   28   54:getfield        #58  <Field RequestFutureTarget$Waiter waiter>
	//   29   57:aload_0         
	//   30   58:lconst_0        
	//   31   59:invokevirtual   #93  <Method void RequestFutureTarget$Waiter.waitForTimeout(Object, long)>
		break MISSING_BLOCK_LABEL_119;
	//   32   62:goto            119
		long l;
		long l1;
		if(long1.longValue() <= 0L)
			break MISSING_BLOCK_LABEL_119;
	//   33   65:aload_1         
	//   34   66:invokevirtual   #99  <Method long Long.longValue()>
	//   35   69:lconst_0        
	//   36   70:lcmp            
	//   37   71:ifle            119
		l = System.currentTimeMillis();
	//   38   74:invokestatic    #104 <Method long System.currentTimeMillis()>
	//   39   77:lstore_2        
		l1 = long1.longValue() + l;
	//   40   78:aload_1         
	//   41   79:invokevirtual   #99  <Method long Long.longValue()>
	//   42   82:lload_2         
	//   43   83:ladd            
	//   44   84:lstore          4
_L1:
		if(isDone() || l >= l1)
			break MISSING_BLOCK_LABEL_119;
	//   45   86:aload_0         
	//   46   87:invokevirtual   #77  <Method boolean isDone()>
	//   47   90:ifne            119
	//   48   93:lload_2         
	//   49   94:lload           4
	//   50   96:lcmp            
	//   51   97:ifge            119
		waiter.waitForTimeout(((Object) (this)), l1 - l);
	//   52  100:aload_0         
	//   53  101:getfield        #58  <Field RequestFutureTarget$Waiter waiter>
	//   54  104:aload_0         
	//   55  105:lload           4
	//   56  107:lload_2         
	//   57  108:lsub            
	//   58  109:invokevirtual   #93  <Method void RequestFutureTarget$Waiter.waitForTimeout(Object, long)>
		l = System.currentTimeMillis();
	//   59  112:invokestatic    #104 <Method long System.currentTimeMillis()>
	//   60  115:lstore_2        
		  goto _L1
	//*  61  116:goto            86
		if(Thread.interrupted())
			break MISSING_BLOCK_LABEL_183;
	//   62  119:invokestatic    #109 <Method boolean Thread.interrupted()>
	//   63  122:ifne            183
		if(loadFailed)
			break MISSING_BLOCK_LABEL_171;
	//   64  125:aload_0         
	//   65  126:getfield        #85  <Field boolean loadFailed>
	//   66  129:ifne            171
		if(isCancelled)
			break MISSING_BLOCK_LABEL_163;
	//   67  132:aload_0         
	//   68  133:getfield        #83  <Field boolean isCancelled>
	//   69  136:ifne            163
		if(!resultReceived)
			break MISSING_BLOCK_LABEL_155;
	//   70  139:aload_0         
	//   71  140:getfield        #87  <Field boolean resultReceived>
	//   72  143:ifeq            155
		long1 = ((Long) (resource));
	//   73  146:aload_0         
	//   74  147:getfield        #89  <Field Object resource>
	//   75  150:astore_1        
		this;
	//   76  151:aload_0         
		JVM INSTR monitorexit ;
	//   77  152:monitorexit     
		return ((Object) (long1));
	//   78  153:aload_1         
	//   79  154:areturn         
		throw new TimeoutException();
	//   80  155:new             #73  <Class TimeoutException>
	//   81  158:dup             
	//   82  159:invokespecial   #110 <Method void TimeoutException()>
	//   83  162:athrow          
		throw new CancellationException();
	//   84  163:new             #112 <Class CancellationException>
	//   85  166:dup             
	//   86  167:invokespecial   #113 <Method void CancellationException()>
	//   87  170:athrow          
		throw new ExecutionException(((Throwable) (exception)));
	//   88  171:new             #69  <Class ExecutionException>
	//   89  174:dup             
	//   90  175:aload_0         
	//   91  176:getfield        #115 <Field GlideException exception>
	//   92  179:invokespecial   #118 <Method void ExecutionException(Throwable)>
	//   93  182:athrow          
		throw new InterruptedException();
	//   94  183:new             #71  <Class InterruptedException>
	//   95  186:dup             
	//   96  187:invokespecial   #119 <Method void InterruptedException()>
	//   97  190:athrow          
		throw new ExecutionException(((Throwable) (exception)));
	//   98  191:new             #69  <Class ExecutionException>
	//   99  194:dup             
	//  100  195:aload_0         
	//  101  196:getfield        #115 <Field GlideException exception>
	//  102  199:invokespecial   #118 <Method void ExecutionException(Throwable)>
	//  103  202:athrow          
		throw new CancellationException();
	//  104  203:new             #112 <Class CancellationException>
	//  105  206:dup             
	//  106  207:invokespecial   #113 <Method void CancellationException()>
	//  107  210:athrow          
		long1;
	//  108  211:astore_1        
		this;
	//  109  212:aload_0         
		JVM INSTR monitorexit ;
	//  110  213:monitorexit     
		throw long1;
	//  111  214:aload_1         
	//  112  215:athrow          
	}

	public boolean cancel(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag1 = isDone();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #77  <Method boolean isDone()>
	//    4    6:istore_2        
		if(!flag1)
			break MISSING_BLOCK_LABEL_15;
	//    5    7:iload_2         
	//    6    8:ifeq            15
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return false;
	//    9   13:iconst_0        
	//   10   14:ireturn         
		isCancelled = true;
	//   11   15:aload_0         
	//   12   16:iconst_1        
	//   13   17:putfield        #83  <Field boolean isCancelled>
		waiter.notifyAll(((Object) (this)));
	//   14   20:aload_0         
	//   15   21:getfield        #58  <Field RequestFutureTarget$Waiter waiter>
	//   16   24:aload_0         
	//   17   25:invokevirtual   #128 <Method void RequestFutureTarget$Waiter.notifyAll(Object)>
		if(!flag)
			break MISSING_BLOCK_LABEL_36;
	//   18   28:iload_1         
	//   19   29:ifeq            36
		clearOnMainThread();
	//   20   32:aload_0         
	//   21   33:invokespecial   #130 <Method void clearOnMainThread()>
		this;
	//   22   36:aload_0         
		JVM INSTR monitorexit ;
	//   23   37:monitorexit     
		return true;
	//   24   38:iconst_1        
	//   25   39:ireturn         
		Exception exception1;
		exception1;
	//   26   40:astore_3        
	//*  27   41:aload_0         
		throw exception1;
	//   28   42:monitorexit     
	//   29   43:aload_3         
	//   30   44:athrow          
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
	//    2    2:invokespecial   #134 <Method Object doGet(Long)>
	//    3    5:astore_1        
		}
	//*   4    6:aload_1         
	//*   5    7:areturn         
		catch(TimeoutException timeoutexception)
	//*   6    8:astore_1        
		{
			throw new AssertionError(((Object) (timeoutexception)));
	//    7    9:new             #136 <Class AssertionError>
	//    8   12:dup             
	//    9   13:aload_1         
	//   10   14:invokespecial   #138 <Method void AssertionError(Object)>
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
	//    3    3:invokevirtual   #147 <Method long TimeUnit.toMillis(long)>
	//    4    6:invokestatic    #151 <Method Long Long.valueOf(long)>
	//    5    9:invokespecial   #134 <Method Object doGet(Long)>
	//    6   12:areturn         
	}

	public Request getRequest()
	{
		return request;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field Request request>
	//    2    4:areturn         
	}

	public void getSize(SizeReadyCallback sizereadycallback)
	{
		sizereadycallback.onSizeReady(width, height);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #52  <Field int width>
	//    3    5:aload_0         
	//    4    6:getfield        #54  <Field int height>
	//    5    9:invokeinterface #166 <Method void SizeReadyCallback.onSizeReady(int, int)>
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
	//    3    3:getfield        #83  <Field boolean isCancelled>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return flag;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception1;
		exception1;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception1;
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
		if(isCancelled || resultReceived)
			break MISSING_BLOCK_LABEL_33;
	//    2    2:aload_0         
	//    3    3:getfield        #83  <Field boolean isCancelled>
	//    4    6:ifne            33
	//    5    9:aload_0         
	//    6   10:getfield        #87  <Field boolean resultReceived>
	//    7   13:ifne            33
		flag = loadFailed;
	//    8   16:aload_0         
	//    9   17:getfield        #85  <Field boolean loadFailed>
	//   10   20:istore_1        
		if(!flag)
	//*  11   21:iload_1         
	//*  12   22:ifeq            28
	//*  13   25:goto            33
		{
			flag = false;
	//   14   28:iconst_0        
	//   15   29:istore_1        
			break MISSING_BLOCK_LABEL_35;
	//   16   30:goto            35
		}
		flag = true;
	//   17   33:iconst_1        
	//   18   34:istore_1        
	//*  19   35:aload_0         
		return flag;
	//   20   36:monitorexit     
	//   21   37:iload_1         
	//   22   38:ireturn         
		Exception exception1;
		exception1;
	//   23   39:astore_2        
	//*  24   40:aload_0         
		throw exception1;
	//   25   41:monitorexit     
	//   26   42:aload_2         
	//   27   43:athrow          
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
	//*   2    2:aload_0         
	//    3    3:monitorexit     
	//    4    4:return          
	}

	public boolean onLoadFailed(GlideException glideexception, Object obj, Target target, boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		loadFailed = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #85  <Field boolean loadFailed>
		exception = glideexception;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #115 <Field GlideException exception>
		waiter.notifyAll(((Object) (this)));
	//    8   12:aload_0         
	//    9   13:getfield        #58  <Field RequestFutureTarget$Waiter waiter>
	//   10   16:aload_0         
	//   11   17:invokevirtual   #128 <Method void RequestFutureTarget$Waiter.notifyAll(Object)>
		this;
	//   12   20:aload_0         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		return false;
	//   14   22:iconst_0        
	//   15   23:ireturn         
		glideexception;
	//   16   24:astore_1        
	//*  17   25:aload_0         
		throw glideexception;
	//   18   26:monitorexit     
	//   19   27:aload_1         
	//   20   28:athrow          
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
	//*   2    2:aload_0         
	//    3    3:monitorexit     
	//    4    4:return          
	}

	public boolean onResourceReady(Object obj, Object obj1, Target target, DataSource datasource, boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		resultReceived = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #87  <Field boolean resultReceived>
		resource = obj;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #89  <Field Object resource>
		waiter.notifyAll(((Object) (this)));
	//    8   12:aload_0         
	//    9   13:getfield        #58  <Field RequestFutureTarget$Waiter waiter>
	//   10   16:aload_0         
	//   11   17:invokevirtual   #128 <Method void RequestFutureTarget$Waiter.notifyAll(Object)>
		this;
	//   12   20:aload_0         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		return false;
	//   14   22:iconst_0        
	//   15   23:ireturn         
		obj;
	//   16   24:astore_1        
	//*  17   25:aload_0         
		throw obj;
	//   18   26:monitorexit     
	//   19   27:aload_1         
	//   20   28:athrow          
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
		Request request1 = request;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field Request request>
	//    2    4:astore_1        
		if(request1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
		{
			request1.clear();
	//    5    9:aload_1         
	//    6   10:invokeinterface #187 <Method void Request.clear()>
			request = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #157 <Field Request request>
		}
	//   10   20:return          
	}

	public void setRequest(Request request1)
	{
		request = request1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #157 <Field Request request>
	//    3    5:return          
	}

	private static final Waiter DEFAULT_WAITER = new Waiter();
	private final boolean assertBackgroundThread;
	private GlideException exception;
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
	//    0    0:new             #13  <Class RequestFutureTarget$Waiter>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void RequestFutureTarget$Waiter()>
	//    3    7:putstatic       #42  <Field RequestFutureTarget$Waiter DEFAULT_WAITER>
	//*   4   10:return          
	}
}
