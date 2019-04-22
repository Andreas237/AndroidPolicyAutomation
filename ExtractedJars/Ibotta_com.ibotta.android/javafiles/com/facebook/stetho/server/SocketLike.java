// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import android.net.LocalSocket;
import java.io.*;

// Referenced classes of package com.facebook.stetho.server:
//			LeakyBufferedInputStream

public class SocketLike
{

	public SocketLike(LocalSocket localsocket, LeakyBufferedInputStream leakybufferedinputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mSocket = localsocket;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field LocalSocket mSocket>
		mLeakyInput = leakybufferedinputstream;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field LeakyBufferedInputStream mLeakyInput>
	//    8   14:return          
	}

	public SocketLike(SocketLike socketlike, LeakyBufferedInputStream leakybufferedinputstream)
	{
		this(socketlike.mSocket, leakybufferedinputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #15  <Field LocalSocket mSocket>
	//    3    5:aload_2         
	//    4    6:invokespecial   #21  <Method void SocketLike(LocalSocket, LeakyBufferedInputStream)>
	//    5    9:return          
	}

	public InputStream getInput()
		throws IOException
	{
		return mLeakyInput.leakBufferAndStream();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field LeakyBufferedInputStream mLeakyInput>
	//    2    4:invokevirtual   #30  <Method InputStream LeakyBufferedInputStream.leakBufferAndStream()>
	//    3    7:areturn         
	}

	public OutputStream getOutput()
		throws IOException
	{
		return mSocket.getOutputStream();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field LocalSocket mSocket>
	//    2    4:invokevirtual   #38  <Method OutputStream LocalSocket.getOutputStream()>
	//    3    7:areturn         
	}

	private final LeakyBufferedInputStream mLeakyInput;
	private final LocalSocket mSocket;
}
