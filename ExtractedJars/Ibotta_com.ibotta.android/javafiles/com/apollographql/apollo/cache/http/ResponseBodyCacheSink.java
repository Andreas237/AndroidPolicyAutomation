// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.http;

import java.io.IOException;
import okio.*;

abstract class ResponseBodyCacheSink extends ForwardingSink
{

	ResponseBodyCacheSink(BufferedSink bufferedsink)
	{
		super(((okio.Sink) (bufferedsink)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void ForwardingSink(okio.Sink)>
	//    3    5:return          
	}

	public void close()
		throws IOException
	{
		if(failed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field boolean failed>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		try
		{
			super.close();
	//    4    8:aload_0         
	//    5    9:invokespecial   #22  <Method void ForwardingSink.close()>
			return;
	//    6   12:return          
		}
		catch(Exception exception)
	//*   7   13:astore_1        
		{
			failed = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #20  <Field boolean failed>
			onException(exception);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #26  <Method void onException(Exception)>
			return;
	//   14   24:return          
		}
	}

	void copyFrom(Buffer buffer, long l, long l1)
	{
		if(failed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field boolean failed>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		try
		{
			BufferedSink bufferedsink = (BufferedSink)_mthdelegate();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #33  <Method okio.Sink _mthdelegate()>
	//    6   12:checkcast       #35  <Class BufferedSink>
	//    7   15:astore          6
			buffer.copyTo(bufferedsink.buffer(), l, l1);
	//    8   17:aload_1         
	//    9   18:aload           6
	//   10   20:invokeinterface #39  <Method Buffer BufferedSink.buffer()>
	//   11   25:lload_2         
	//   12   26:lload           4
	//   13   28:invokevirtual   #45  <Method Buffer Buffer.copyTo(Buffer, long, long)>
	//   14   31:pop             
			bufferedsink.emitCompleteSegments();
	//   15   32:aload           6
	//   16   34:invokeinterface #49  <Method BufferedSink BufferedSink.emitCompleteSegments()>
	//   17   39:pop             
			return;
	//   18   40:return          
		}
		// Misplaced declaration of an exception variable
		catch(Buffer buffer)
	//*  19   41:astore_1        
		{
			failed = true;
	//   20   42:aload_0         
	//   21   43:iconst_1        
	//   22   44:putfield        #20  <Field boolean failed>
		}
		onException(((Exception) (buffer)));
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokevirtual   #26  <Method void onException(Exception)>
	//   26   52:return          
	}

	public void flush()
		throws IOException
	{
		if(failed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field boolean failed>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		try
		{
			super.flush();
	//    4    8:aload_0         
	//    5    9:invokespecial   #52  <Method void ForwardingSink.flush()>
			return;
	//    6   12:return          
		}
		catch(Exception exception)
	//*   7   13:astore_1        
		{
			failed = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #20  <Field boolean failed>
			onException(exception);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #26  <Method void onException(Exception)>
			return;
	//   14   24:return          
		}
	}

	abstract void onException(Exception exception);

	public void write(Buffer buffer, long l)
		throws IOException
	{
		if(failed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field boolean failed>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		try
		{
			super.write(buffer, l);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:lload_2         
	//    7   11:invokespecial   #56  <Method void ForwardingSink.write(Buffer, long)>
			return;
	//    8   14:return          
		}
		// Misplaced declaration of an exception variable
		catch(Buffer buffer)
	//*   9   15:astore_1        
		{
			failed = true;
	//   10   16:aload_0         
	//   11   17:iconst_1        
	//   12   18:putfield        #20  <Field boolean failed>
		}
		onException(((Exception) (buffer)));
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:invokevirtual   #26  <Method void onException(Exception)>
	//   16   26:return          
	}

	private boolean failed;
}
