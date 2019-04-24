// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.facebook.internal:
//			FileLruCache

private static class FileLruCache$CloseCallbackOutputStream extends OutputStream
{

	public void close()
		throws IOException
	{
		innerStream.close();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OutputStream innerStream>
	//    2    4:invokevirtual   #26  <Method void OutputStream.close()>
		callback.onClose();
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field FileLruCache$StreamCloseCallback callback>
	//    5   11:invokeinterface #31  <Method void FileLruCache$StreamCloseCallback.onClose()>
		return;
	//    6   16:return          
		Exception exception;
		exception;
	//    7   17:astore_1        
		callback.onClose();
	//    8   18:aload_0         
	//    9   19:getfield        #20  <Field FileLruCache$StreamCloseCallback callback>
	//   10   22:invokeinterface #31  <Method void FileLruCache$StreamCloseCallback.onClose()>
		throw exception;
	//   11   27:aload_1         
	//   12   28:athrow          
	}

	public void flush()
		throws IOException
	{
		innerStream.flush();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OutputStream innerStream>
	//    2    4:invokevirtual   #35  <Method void OutputStream.flush()>
	//    3    7:return          
	}

	public void write(int i)
		throws IOException
	{
		innerStream.write(i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OutputStream innerStream>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #39  <Method void OutputStream.write(int)>
	//    4    8:return          
	}

	public void write(byte abyte0[])
		throws IOException
	{
		innerStream.write(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OutputStream innerStream>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #42  <Method void OutputStream.write(byte[])>
	//    4    8:return          
	}

	public void write(byte abyte0[], int i, int j)
		throws IOException
	{
		innerStream.write(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OutputStream innerStream>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #45  <Method void OutputStream.write(byte[], int, int)>
	//    6   10:return          
	}

	final FileLruCache.StreamCloseCallback callback;
	final OutputStream innerStream;

	FileLruCache$CloseCallbackOutputStream(OutputStream outputstream, FileLruCache.StreamCloseCallback streamclosecallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void OutputStream()>
		innerStream = outputstream;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field OutputStream innerStream>
		callback = streamclosecallback;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field FileLruCache$StreamCloseCallback callback>
	//    8   14:return          
	}
}
