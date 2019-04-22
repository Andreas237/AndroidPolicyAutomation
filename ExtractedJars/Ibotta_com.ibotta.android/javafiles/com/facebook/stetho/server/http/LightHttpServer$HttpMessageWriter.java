// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server.http;

import java.io.BufferedOutputStream;
import java.io.IOException;

// Referenced classes of package com.facebook.stetho.server.http:
//			LightHttpServer

public static class LightHttpServer$HttpMessageWriter
{

	public void flush()
		throws IOException
	{
		mOut.flush();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field BufferedOutputStream mOut>
	//    2    4:invokevirtual   #37  <Method void BufferedOutputStream.flush()>
	//    3    7:return          
	}

	public void writeLine()
		throws IOException
	{
		mOut.write(CRLF);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field BufferedOutputStream mOut>
	//    2    4:getstatic       #23  <Field byte[] CRLF>
	//    3    7:invokevirtual   #43  <Method void BufferedOutputStream.write(byte[])>
	//    4   10:return          
	}

	public void writeLine(String s)
		throws IOException
	{
		int j = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #48  <Method int String.length()>
	//    2    4:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          35
		{
			char c = s.charAt(i);
	//    8   12:aload_1         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #52  <Method char String.charAt(int)>
	//   11   17:istore          4
			mOut.write(((int) (c)));
	//   12   19:aload_0         
	//   13   20:getfield        #30  <Field BufferedOutputStream mOut>
	//   14   23:iload           4
	//   15   25:invokevirtual   #55  <Method void BufferedOutputStream.write(int)>
		}

	//   16   28:iload_2         
	//   17   29:iconst_1        
	//   18   30:iadd            
	//   19   31:istore_2        
	//*  20   32:goto            7
		mOut.write(CRLF);
	//   21   35:aload_0         
	//   22   36:getfield        #30  <Field BufferedOutputStream mOut>
	//   23   39:getstatic       #23  <Field byte[] CRLF>
	//   24   42:invokevirtual   #43  <Method void BufferedOutputStream.write(byte[])>
	//   25   45:return          
	}

	private static final byte CRLF[] = "\r\n".getBytes();
	private final BufferedOutputStream mOut;

	static 
	{
	//    0    0:ldc1            #15  <String "\r\n">
	//    1    2:invokevirtual   #21  <Method byte[] String.getBytes()>
	//    2    5:putstatic       #23  <Field byte[] CRLF>
	//*   3    8:return          
	}

	public LightHttpServer$HttpMessageWriter(BufferedOutputStream bufferedoutputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		mOut = bufferedoutputstream;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field BufferedOutputStream mOut>
	//    5    9:return          
	}
}
