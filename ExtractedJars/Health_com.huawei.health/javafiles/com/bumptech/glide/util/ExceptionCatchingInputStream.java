// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide.util:
//			Util

public class ExceptionCatchingInputStream extends InputStream
{

	ExceptionCatchingInputStream()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void InputStream()>
	//    2    4:return          
	}

	static void clearQueue()
	{
		for(; !QUEUE.isEmpty(); QUEUE.remove());
	//    0    0:getstatic       #21  <Field Queue QUEUE>
	//    1    3:invokeinterface #32  <Method boolean Queue.isEmpty()>
	//    2    8:ifne            23
	//    3   11:getstatic       #21  <Field Queue QUEUE>
	//    4   14:invokeinterface #36  <Method Object Queue.remove()>
	//    5   19:pop             
	//*   6   20:goto            0
	//    7   23:return          
	}

	public static ExceptionCatchingInputStream obtain(InputStream inputstream)
	{
		Queue queue = QUEUE;
	//    0    0:getstatic       #21  <Field Queue QUEUE>
	//    1    3:astore_1        
		queue;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		ExceptionCatchingInputStream exceptioncatchinginputstream1 = (ExceptionCatchingInputStream)QUEUE.poll();
	//    4    6:getstatic       #21  <Field Queue QUEUE>
	//    5    9:invokeinterface #41  <Method Object Queue.poll()>
	//    6   14:checkcast       #2   <Class ExceptionCatchingInputStream>
	//    7   17:astore_2        
		queue;
	//    8   18:aload_1         
		JVM INSTR monitorexit ;
	//    9   19:monitorexit     
		  goto _L1
	//*  10   20:goto            28
		inputstream;
	//   11   23:astore_0        
	//*  12   24:aload_1         
		throw inputstream;
	//   13   25:monitorexit     
	//   14   26:aload_0         
	//   15   27:athrow          
_L1:
		ExceptionCatchingInputStream exceptioncatchinginputstream = exceptioncatchinginputstream1;
	//   16   28:aload_2         
	//   17   29:astore_1        
		if(exceptioncatchinginputstream1 == null)
	//*  18   30:aload_2         
	//*  19   31:ifnonnull       42
			exceptioncatchinginputstream = new ExceptionCatchingInputStream();
	//   20   34:new             #2   <Class ExceptionCatchingInputStream>
	//   21   37:dup             
	//   22   38:invokespecial   #42  <Method void ExceptionCatchingInputStream()>
	//   23   41:astore_1        
		exceptioncatchinginputstream.setInputStream(inputstream);
	//   24   42:aload_1         
	//   25   43:aload_0         
	//   26   44:invokevirtual   #46  <Method void setInputStream(InputStream)>
		return exceptioncatchinginputstream;
	//   27   47:aload_1         
	//   28   48:areturn         
	}

	public int available()
		throws IOException
	{
		return wrapped.available();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field InputStream wrapped>
	//    2    4:invokevirtual   #54  <Method int InputStream.available()>
	//    3    7:ireturn         
	}

	public void close()
		throws IOException
	{
		wrapped.close();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field InputStream wrapped>
	//    2    4:invokevirtual   #58  <Method void InputStream.close()>
	//    3    7:return          
	}

	public IOException getException()
	{
		return exception;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field IOException exception>
	//    2    4:areturn         
	}

	public void mark(int i)
	{
		wrapped.mark(i);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field InputStream wrapped>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #66  <Method void InputStream.mark(int)>
	//    4    8:return          
	}

	public boolean markSupported()
	{
		return wrapped.markSupported();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field InputStream wrapped>
	//    2    4:invokevirtual   #69  <Method boolean InputStream.markSupported()>
	//    3    7:ireturn         
	}

	public int read()
		throws IOException
	{
		int i;
		try
		{
			i = wrapped.read();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field InputStream wrapped>
	//    2    4:invokevirtual   #72  <Method int InputStream.read()>
	//    3    7:istore_1        
		}
	//*   4    8:iload_1         
	//*   5    9:ireturn         
		catch(IOException ioexception)
	//*   6   10:astore_2        
		{
			exception = ioexception;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #62  <Field IOException exception>
			return -1;
	//   10   16:iconst_m1       
	//   11   17:ireturn         
		}
		return i;
	}

	public int read(byte abyte0[])
		throws IOException
	{
		int i;
		try
		{
			i = wrapped.read(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field InputStream wrapped>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #75  <Method int InputStream.read(byte[])>
	//    4    8:istore_2        
		}
	//*   5    9:iload_2         
	//*   6   10:ireturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*   7   11:astore_1        
		{
			exception = ((IOException) (abyte0));
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:putfield        #62  <Field IOException exception>
			return -1;
	//   11   17:iconst_m1       
	//   12   18:ireturn         
		}
		return i;
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		try
		{
			i = wrapped.read(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field InputStream wrapped>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #78  <Method int InputStream.read(byte[], int, int)>
	//    6   10:istore_2        
		}
	//*   7   11:iload_2         
	//*   8   12:ireturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*   9   13:astore_1        
		{
			exception = ((IOException) (abyte0));
	//   10   14:aload_0         
	//   11   15:aload_1         
	//   12   16:putfield        #62  <Field IOException exception>
			return -1;
	//   13   19:iconst_m1       
	//   14   20:ireturn         
		}
		return i;
	}

	public void release()
	{
		exception = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #62  <Field IOException exception>
		wrapped = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #52  <Field InputStream wrapped>
		Queue queue = QUEUE;
	//    6   10:getstatic       #21  <Field Queue QUEUE>
	//    7   13:astore_1        
		queue;
	//    8   14:aload_1         
		JVM INSTR monitorenter ;
	//    9   15:monitorenter    
		QUEUE.offer(((Object) (this)));
	//   10   16:getstatic       #21  <Field Queue QUEUE>
	//   11   19:aload_0         
	//   12   20:invokeinterface #83  <Method boolean Queue.offer(Object)>
	//   13   25:pop             
		queue;
	//   14   26:aload_1         
		JVM INSTR monitorexit ;
	//   15   27:monitorexit     
		return;
	//   16   28:return          
		Exception exception1;
		exception1;
	//   17   29:astore_2        
	//*  18   30:aload_1         
		throw exception1;
	//   19   31:monitorexit     
	//   20   32:aload_2         
	//   21   33:athrow          
	}

	public void reset()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		wrapped.reset();
	//    2    2:aload_0         
	//    3    3:getfield        #52  <Field InputStream wrapped>
	//    4    6:invokevirtual   #86  <Method void InputStream.reset()>
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		Exception exception1;
		exception1;
	//    8   12:astore_1        
	//*   9   13:aload_0         
		throw exception1;
	//   10   14:monitorexit     
	//   11   15:aload_1         
	//   12   16:athrow          
	}

	void setInputStream(InputStream inputstream)
	{
		wrapped = inputstream;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field InputStream wrapped>
	//    3    5:return          
	}

	public long skip(long l)
		throws IOException
	{
		try
		{
			l = wrapped.skip(l);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field InputStream wrapped>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #90  <Method long InputStream.skip(long)>
	//    4    8:lstore_1        
		}
	//*   5    9:lload_1         
	//*   6   10:lreturn         
		catch(IOException ioexception)
	//*   7   11:astore_3        
		{
			exception = ioexception;
	//    8   12:aload_0         
	//    9   13:aload_3         
	//   10   14:putfield        #62  <Field IOException exception>
			return 0L;
	//   11   17:lconst_0        
	//   12   18:lreturn         
		}
		return l;
	}

	private static final Queue QUEUE = Util.createQueue(0);
	private IOException exception;
	private InputStream wrapped;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:invokestatic    #19  <Method Queue Util.createQueue(int)>
	//    2    4:putstatic       #21  <Field Queue QUEUE>
	//*   3    7:return          
	}
}
