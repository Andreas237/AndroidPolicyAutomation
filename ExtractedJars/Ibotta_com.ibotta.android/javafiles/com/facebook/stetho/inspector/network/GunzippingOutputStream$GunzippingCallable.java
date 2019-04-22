// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import com.facebook.stetho.common.Util;
import java.io.*;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;

// Referenced classes of package com.facebook.stetho.inspector.network:
//			GunzippingOutputStream

private static class GunzippingOutputStream$GunzippingCallable
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

	public GunzippingOutputStream$GunzippingCallable(InputStream inputstream, OutputStream outputstream)
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
