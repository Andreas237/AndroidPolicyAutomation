// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import java.io.Flushable;
import java.io.IOException;

// Referenced classes of package io.fabric.sdk.android.services.network:
//			HttpRequest

protected static abstract class HttpRequest$FlushOperation extends HttpRequest.Operation
{

	protected void done()
		throws IOException
	{
		flushable.flush();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Flushable flushable>
	//    2    4:invokeinterface #26  <Method void Flushable.flush()>
	//    3    9:return          
	}

	private final Flushable flushable;

	protected HttpRequest$FlushOperation(Flushable flushable1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void HttpRequest$Operation()>
		flushable = flushable1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Flushable flushable>
	//    5    9:return          
	}
}
