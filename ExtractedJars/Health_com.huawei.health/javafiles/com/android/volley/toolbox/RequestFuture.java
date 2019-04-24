// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import com.android.volley.Request;
import com.android.volley.VolleyError;
import java.util.concurrent.*;

public class RequestFuture
	implements Future, com.android.volley.Response.Listener, com.android.volley.Response.ErrorListener
{

	private RequestFuture()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mResultReceived = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #27  <Field boolean mResultReceived>
	//    5    9:return          
	}

	private Object doGet(Long long1)
		throws InterruptedException, ExecutionException, TimeoutException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mException != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #38  <Field VolleyError mException>
	//*   4    6:ifnull          21
			throw new ExecutionException(((Throwable) (mException)));
	//    5    9:new             #34  <Class ExecutionException>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #38  <Field VolleyError mException>
	//    9   17:invokespecial   #41  <Method void ExecutionException(Throwable)>
	//   10   20:athrow          
		if(!mResultReceived)
			break MISSING_BLOCK_LABEL_37;
	//   11   21:aload_0         
	//   12   22:getfield        #27  <Field boolean mResultReceived>
	//   13   25:ifeq            37
		long1 = ((Long) (mResult));
	//   14   28:aload_0         
	//   15   29:getfield        #43  <Field Object mResult>
	//   16   32:astore_1        
		this;
	//   17   33:aload_0         
		JVM INSTR monitorexit ;
	//   18   34:monitorexit     
		return ((Object) (long1));
	//   19   35:aload_1         
	//   20   36:areturn         
		if(long1 != null)
			break MISSING_BLOCK_LABEL_49;
	//   21   37:aload_1         
	//   22   38:ifnonnull       49
		((Object)this).wait(0L);
	//   23   41:aload_0         
	//   24   42:lconst_0        
	//   25   43:invokevirtual   #47  <Method void Object.wait(long)>
		break MISSING_BLOCK_LABEL_66;
	//   26   46:goto            66
		if(long1.longValue() > 0L)
	//*  27   49:aload_1         
	//*  28   50:invokevirtual   #53  <Method long Long.longValue()>
	//*  29   53:lconst_0        
	//*  30   54:lcmp            
	//*  31   55:ifle            66
			((Object)this).wait(long1.longValue());
	//   32   58:aload_0         
	//   33   59:aload_1         
	//   34   60:invokevirtual   #53  <Method long Long.longValue()>
	//   35   63:invokevirtual   #47  <Method void Object.wait(long)>
		if(mException != null)
	//*  36   66:aload_0         
	//*  37   67:getfield        #38  <Field VolleyError mException>
	//*  38   70:ifnull          85
			throw new ExecutionException(((Throwable) (mException)));
	//   39   73:new             #34  <Class ExecutionException>
	//   40   76:dup             
	//   41   77:aload_0         
	//   42   78:getfield        #38  <Field VolleyError mException>
	//   43   81:invokespecial   #41  <Method void ExecutionException(Throwable)>
	//   44   84:athrow          
		if(!mResultReceived)
	//*  45   85:aload_0         
	//*  46   86:getfield        #27  <Field boolean mResultReceived>
	//*  47   89:ifne            100
			throw new TimeoutException();
	//   48   92:new             #36  <Class TimeoutException>
	//   49   95:dup             
	//   50   96:invokespecial   #54  <Method void TimeoutException()>
	//   51   99:athrow          
		long1 = ((Long) (mResult));
	//   52  100:aload_0         
	//   53  101:getfield        #43  <Field Object mResult>
	//   54  104:astore_1        
		this;
	//   55  105:aload_0         
		JVM INSTR monitorexit ;
	//   56  106:monitorexit     
		return ((Object) (long1));
	//   57  107:aload_1         
	//   58  108:areturn         
		long1;
	//   59  109:astore_1        
	//*  60  110:aload_0         
		throw long1;
	//   61  111:monitorexit     
	//   62  112:aload_1         
	//   63  113:athrow          
	}

	public static RequestFuture newFuture()
	{
		return new RequestFuture();
	//    0    0:new             #2   <Class RequestFuture>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void RequestFuture()>
	//    3    7:areturn         
	}

	public boolean cancel(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mRequest != null)
			break MISSING_BLOCK_LABEL_13;
	//    2    2:aload_0         
	//    3    3:getfield        #65  <Field Request mRequest>
	//    4    6:ifnonnull       13
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(isDone())
			break MISSING_BLOCK_LABEL_31;
	//    9   13:aload_0         
	//   10   14:invokevirtual   #69  <Method boolean isDone()>
	//   11   17:ifne            31
		mRequest.cancel();
	//   12   20:aload_0         
	//   13   21:getfield        #65  <Field Request mRequest>
	//   14   24:invokevirtual   #73  <Method void Request.cancel()>
	//*  15   27:aload_0         
	//*  16   28:monitorexit     
		return true;
	//   17   29:iconst_1        
	//   18   30:ireturn         
		this;
	//   19   31:aload_0         
		JVM INSTR monitorexit ;
	//   20   32:monitorexit     
		return false;
	//   21   33:iconst_0        
	//   22   34:ireturn         
		Exception exception;
		exception;
	//   23   35:astore_2        
	//*  24   36:aload_0         
		throw exception;
	//   25   37:monitorexit     
	//   26   38:aload_2         
	//   27   39:athrow          
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
	//    2    2:invokespecial   #77  <Method Object doGet(Long)>
	//    3    5:astore_1        
		}
	//*   4    6:aload_1         
	//*   5    7:areturn         
		catch(TimeoutException timeoutexception)
	//*   6    8:astore_1        
		{
			throw new AssertionError(((Object) (timeoutexception)));
	//    7    9:new             #79  <Class AssertionError>
	//    8   12:dup             
	//    9   13:aload_1         
	//   10   14:invokespecial   #82  <Method void AssertionError(Object)>
	//   11   17:athrow          
		}
		return obj;
	}

	public Object get(long l, TimeUnit timeunit)
		throws InterruptedException, ExecutionException, TimeoutException
	{
		return doGet(Long.valueOf(TimeUnit.MILLISECONDS.convert(l, timeunit)));
	//    0    0:aload_0         
	//    1    1:getstatic       #90  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    2    4:lload_1         
	//    3    5:aload_3         
	//    4    6:invokevirtual   #94  <Method long TimeUnit.convert(long, TimeUnit)>
	//    5    9:invokestatic    #98  <Method Long Long.valueOf(long)>
	//    6   12:invokespecial   #77  <Method Object doGet(Long)>
	//    7   15:areturn         
	}

	public boolean isCancelled()
	{
		if(mRequest == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field Request mRequest>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mRequest.isCanceled();
	//    5    9:aload_0         
	//    6   10:getfield        #65  <Field Request mRequest>
	//    7   13:invokevirtual   #103 <Method boolean Request.isCanceled()>
	//    8   16:ireturn         
	}

	public boolean isDone()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		if(mResultReceived || mException != null)
			break MISSING_BLOCK_LABEL_25;
	//    2    2:aload_0         
	//    3    3:getfield        #27  <Field boolean mResultReceived>
	//    4    6:ifne            25
	//    5    9:aload_0         
	//    6   10:getfield        #38  <Field VolleyError mException>
	//    7   13:ifnonnull       25
		flag = isCancelled();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #105 <Method boolean isCancelled()>
	//   10   20:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_30;
	//   11   21:iload_1         
	//   12   22:ifeq            30
		flag = true;
	//   13   25:iconst_1        
	//   14   26:istore_1        
		break MISSING_BLOCK_LABEL_32;
	//   15   27:goto            32
		flag = false;
	//   16   30:iconst_0        
	//   17   31:istore_1        
	//*  18   32:aload_0         
		return flag;
	//   19   33:monitorexit     
	//   20   34:iload_1         
	//   21   35:ireturn         
		Exception exception;
		exception;
	//   22   36:astore_2        
	//*  23   37:aload_0         
		throw exception;
	//   24   38:monitorexit     
	//   25   39:aload_2         
	//   26   40:athrow          
	}

	public void onErrorResponse(VolleyError volleyerror)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mException = volleyerror;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #38  <Field VolleyError mException>
		((Object)this).notifyAll();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #110 <Method void Object.notifyAll()>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		volleyerror;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw volleyerror;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public void onResponse(Object obj)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mResultReceived = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #27  <Field boolean mResultReceived>
		mResult = obj;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #43  <Field Object mResult>
		((Object)this).notifyAll();
	//    8   12:aload_0         
	//    9   13:invokevirtual   #110 <Method void Object.notifyAll()>
		this;
	//   10   16:aload_0         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		obj;
	//   13   19:astore_1        
	//*  14   20:aload_0         
		throw obj;
	//   15   21:monitorexit     
	//   16   22:aload_1         
	//   17   23:athrow          
	}

	public void setRequest(Request request)
	{
		mRequest = request;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #65  <Field Request mRequest>
	//    3    5:return          
	}

	private VolleyError mException;
	private Request mRequest;
	private Object mResult;
	private boolean mResultReceived;
}
