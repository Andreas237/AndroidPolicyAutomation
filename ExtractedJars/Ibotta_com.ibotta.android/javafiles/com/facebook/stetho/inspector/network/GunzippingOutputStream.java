// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import com.facebook.stetho.common.ExceptionUtil;
import com.facebook.stetho.common.Util;
import java.io.*;
import java.util.concurrent.*;
import java.util.zip.GZIPInputStream;

class GunzippingOutputStream extends FilterOutputStream
{
	private static class GunzippingCallable
		implements Callable
	{

		public volatile Object call()
			throws Exception
		{
			return ((Object) (call()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #31  <Method Void call()>
		//    2    4:areturn         
		}

		public Void call()
			throws IOException
		{
			GZIPInputStream gzipinputstream = new GZIPInputStream(mIn);
		//    0    0:new             #36  <Class GZIPInputStream>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #21  <Field InputStream mIn>
		//    4    8:invokespecial   #39  <Method void GZIPInputStream(InputStream)>
		//    5   11:astore_1        
			Util.copy(((InputStream) (gzipinputstream)), mOut, new byte[1024]);
		//    6   12:aload_1         
		//    7   13:aload_0         
		//    8   14:getfield        #23  <Field OutputStream mOut>
		//    9   17:sipush          1024
		//   10   20:newarray        byte[]
		//   11   22:invokestatic    #45  <Method void Util.copy(InputStream, OutputStream, byte[])>
			gzipinputstream.close();
		//   12   25:aload_1         
		//   13   26:invokevirtual   #48  <Method void GZIPInputStream.close()>
			mOut.close();
		//   14   29:aload_0         
		//   15   30:getfield        #23  <Field OutputStream mOut>
		//   16   33:invokevirtual   #51  <Method void OutputStream.close()>
			return null;
		//   17   36:aconst_null     
		//   18   37:areturn         
			Exception exception;
			exception;
		//   19   38:astore_2        
			gzipinputstream.close();
		//   20   39:aload_1         
		//   21   40:invokevirtual   #48  <Method void GZIPInputStream.close()>
			mOut.close();
		//   22   43:aload_0         
		//   23   44:getfield        #23  <Field OutputStream mOut>
		//   24   47:invokevirtual   #51  <Method void OutputStream.close()>
			throw exception;
		//   25   50:aload_2         
		//   26   51:athrow          
		}

		private final InputStream mIn;
		private final OutputStream mOut;

		public GunzippingCallable(InputStream inputstream, OutputStream outputstream)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			mIn = inputstream;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field InputStream mIn>
			mOut = outputstream;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field OutputStream mOut>
		//    8   14:return          
		}
	}


	private GunzippingOutputStream(OutputStream outputstream, Future future)
		throws IOException
	{
		super(outputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void FilterOutputStream(OutputStream)>
		mCopyFuture = future;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #32  <Field Future mCopyFuture>
	//    6   10:return          
	}

	public static GunzippingOutputStream create(OutputStream outputstream)
		throws IOException
	{
		PipedInputStream pipedinputstream = new PipedInputStream();
	//    0    0:new             #39  <Class PipedInputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void PipedInputStream()>
	//    3    7:astore_1        
		return new GunzippingOutputStream(((OutputStream) (new PipedOutputStream(pipedinputstream))), sExecutor.submit(((Callable) (new GunzippingCallable(((InputStream) (pipedinputstream)), outputstream)))));
	//    4    8:new             #2   <Class GunzippingOutputStream>
	//    5   11:dup             
	//    6   12:new             #43  <Class PipedOutputStream>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #46  <Method void PipedOutputStream(PipedInputStream)>
	//   10   20:getstatic       #22  <Field ExecutorService sExecutor>
	//   11   23:new             #6   <Class GunzippingOutputStream$GunzippingCallable>
	//   12   26:dup             
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:invokespecial   #49  <Method void GunzippingOutputStream$GunzippingCallable(InputStream, OutputStream)>
	//   16   32:invokeinterface #55  <Method Future ExecutorService.submit(Callable)>
	//   17   37:invokespecial   #57  <Method void GunzippingOutputStream(OutputStream, Future)>
	//   18   40:areturn         
	}

	private static Object getAndRethrow(Future future)
		throws IOException
	{
_L2:
		Object obj = future.get();
	//    0    0:aload_0         
	//    1    1:invokeinterface #69  <Method Object Future.get()>
	//    2    6:astore_1        
		return obj;
	//    3    7:aload_1         
	//    4    8:areturn         
		Object obj1;
		obj1;
	//    5    9:astore_1        
		Throwable throwable = ((ExecutionException) (obj1)).getCause();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #73  <Method Throwable ExecutionException.getCause()>
	//    8   14:astore_1        
		ExceptionUtil.propagateIfInstanceOf(throwable, java/io/IOException);
	//    9   15:aload_1         
	//   10   16:ldc1            #27  <Class IOException>
	//   11   18:invokestatic    #79  <Method void ExceptionUtil.propagateIfInstanceOf(Throwable, Class)>
		ExceptionUtil.propagate(throwable);
	//   12   21:aload_1         
	//   13   22:invokestatic    #83  <Method RuntimeException ExceptionUtil.propagate(Throwable)>
	//   14   25:pop             
		continue; /* Loop/switch isn't completed */
	//   15   26:goto            0
		throwable;
	//   16   29:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  17   30:goto            0
	}

	public void close()
		throws IOException
	{
		super.close();
	//    0    0:aload_0         
	//    1    1:invokespecial   #87  <Method void FilterOutputStream.close()>
		try
		{
			getAndRethrow(mCopyFuture);
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field Future mCopyFuture>
	//    4    8:invokestatic    #89  <Method Object getAndRethrow(Future)>
	//    5   11:pop             
			return;
	//    6   12:return          
		}
		catch(IOException ioexception)
	//*   7   13:astore_1        
		{
			throw ioexception;
	//    8   14:aload_1         
	//    9   15:athrow          
		}
		Exception exception;
		exception;
	//   10   16:astore_1        
		try
		{
			getAndRethrow(mCopyFuture);
	//   11   17:aload_0         
	//   12   18:getfield        #32  <Field Future mCopyFuture>
	//   13   21:invokestatic    #89  <Method Object getAndRethrow(Future)>
	//   14   24:pop             
		}
	//*  15   25:aload_1         
	//*  16   26:athrow          
		catch(IOException ioexception1) { }
	//   17   27:astore_2        
		throw exception;
	//*  18   28:goto            25
	}

	private static final ExecutorService sExecutor = Executors.newCachedThreadPool();
	private final Future mCopyFuture;

	static 
	{
	//    0    0:invokestatic    #20  <Method ExecutorService Executors.newCachedThreadPool()>
	//    1    3:putstatic       #22  <Field ExecutorService sExecutor>
	//*   2    6:return          
	}
}
