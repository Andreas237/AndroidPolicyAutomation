// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import java.io.*;

// Referenced classes of package io.fabric.sdk.android.services.network:
//			HttpRequest

protected static abstract class HttpRequest$CloseOperation extends HttpRequest.Operation
{

	protected void done()
		throws IOException
	{
		if(closeable instanceof Flushable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Closeable closeable>
	//*   2    4:instanceof      #27  <Class Flushable>
	//*   3    7:ifeq            22
			((Flushable)closeable).flush();
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field Closeable closeable>
	//    6   14:checkcast       #27  <Class Flushable>
	//    7   17:invokeinterface #30  <Method void Flushable.flush()>
		if(ignoreCloseExceptions)
	//*   8   22:aload_0         
	//*   9   23:getfield        #21  <Field boolean ignoreCloseExceptions>
	//*  10   26:ifeq            39
		{
			try
			{
				closeable.close();
	//   11   29:aload_0         
	//   12   30:getfield        #19  <Field Closeable closeable>
	//   13   33:invokeinterface #35  <Method void Closeable.close()>
				return;
	//   14   38:return          
			}
	//*  15   39:aload_0         
	//*  16   40:getfield        #19  <Field Closeable closeable>
	//*  17   43:invokeinterface #35  <Method void Closeable.close()>
	//*  18   48:return          
			catch(IOException ioexception)
	//*  19   49:astore_1        
			{
				return;
	//   20   50:return          
			}
		} else
		{
			closeable.close();
			return;
		}
	}

	private final Closeable closeable;
	private final boolean ignoreCloseExceptions;

	protected HttpRequest$CloseOperation(Closeable closeable1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void HttpRequest$Operation()>
		closeable = closeable1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Closeable closeable>
		ignoreCloseExceptions = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field boolean ignoreCloseExceptions>
	//    8   14:return          
	}
}
