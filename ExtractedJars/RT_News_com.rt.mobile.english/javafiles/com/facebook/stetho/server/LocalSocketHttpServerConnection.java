// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import android.net.LocalSocket;
import com.facebook.stetho.common.Util;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.apache.http.impl.AbstractHttpServerConnection;
import org.apache.http.impl.io.AbstractSessionInputBuffer;
import org.apache.http.impl.io.AbstractSessionOutputBuffer;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class LocalSocketHttpServerConnection extends AbstractHttpServerConnection
{
	private static class LocalSocketSessionInputBuffer extends AbstractSessionInputBuffer
	{

		public byte[] clearCurrentBuffer()
		{
			ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
		//    0    0:new             #43  <Class ByteArrayOutputStream>
		//    1    3:dup             
		//    2    4:invokespecial   #44  <Method void ByteArrayOutputStream()>
		//    3    7:astore_3        
_L3:
			if(!hasBufferedData()) goto _L2; else goto _L1
		//    4    8:aload_0         
		//    5    9:invokevirtual   #48  <Method boolean hasBufferedData()>
		//    6   12:ifeq            48
_L1:
			int i = read();
		//    7   15:aload_0         
		//    8   16:invokevirtual   #52  <Method int read()>
		//    9   19:istore_1        
			boolean flag;
			byte abyte0[];
			if(i != -1)
		//*  10   20:iload_1         
		//*  11   21:iconst_m1       
		//*  12   22:icmpeq          65
				flag = true;
		//   13   25:iconst_1        
		//   14   26:istore_2        
			else
		//*  15   27:goto            30
		//*  16   30:iload_2         
		//*  17   31:ldc1            #54  <String "Buffered data cannot EOF">
		//*  18   33:iconst_0        
		//*  19   34:anewarray       Object[]
		//*  20   37:invokestatic    #62  <Method void Util.throwIfNot(boolean, String, Object[])>
		//*  21   40:aload_3         
		//*  22   41:iload_1         
		//*  23   42:invokevirtual   #66  <Method void ByteArrayOutputStream.write(int)>
		//*  24   45:goto            8
		//*  25   48:aload_3         
		//*  26   49:invokevirtual   #69  <Method byte[] ByteArrayOutputStream.toByteArray()>
		//*  27   52:astore_3        
		//*  28   53:aload_3         
		//*  29   54:areturn         
		//*  30   55:astore_3        
		//*  31   56:new             #71  <Class RuntimeException>
		//*  32   59:dup             
		//*  33   60:aload_3         
		//*  34   61:invokespecial   #74  <Method void RuntimeException(Throwable)>
		//*  35   64:athrow          
				flag = false;
		//   36   65:iconst_0        
		//   37   66:istore_2        
			try
			{
				Util.throwIfNot(flag, "Buffered data cannot EOF", new Object[0]);
				bytearrayoutputstream.write(i);
			}
			catch(IOException ioexception)
			{
				throw new RuntimeException(((Throwable) (ioexception)));
			}
			if(true) goto _L3; else goto _L2
		//   38   67:goto            30
_L2:
			abyte0 = bytearrayoutputstream.toByteArray();
			return abyte0;
		}

		public boolean isDataAvailable(int i)
			throws IOException
		{
			throw new UnsupportedOperationException("CoreConnectionPNames.STALE_CONNECTION_CHECK appears to be true but that can't be?");
		//    0    0:new             #22  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #78  <String "CoreConnectionPNames.STALE_CONNECTION_CHECK appears to be true but that can't be?">
		//    3    6:invokespecial   #27  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

		public LocalSocketSessionInputBuffer(LocalSocket localsocket, int i, HttpParams httpparams)
			throws IOException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void AbstractSessionInputBuffer()>
			if(HttpConnectionParams.isStaleCheckingEnabled(httpparams))
		//*   2    4:aload_3         
		//*   3    5:invokestatic    #20  <Method boolean HttpConnectionParams.isStaleCheckingEnabled(HttpParams)>
		//*   4    8:ifeq            21
			{
				throw new UnsupportedOperationException("Stale connection checking should not be used for local sockets");
		//    5   11:new             #22  <Class UnsupportedOperationException>
		//    6   14:dup             
		//    7   15:ldc1            #24  <String "Stale connection checking should not be used for local sockets">
		//    8   17:invokespecial   #27  <Method void UnsupportedOperationException(String)>
		//    9   20:athrow          
			} else
			{
				init(localsocket.getInputStream(), i, httpparams);
		//   10   21:aload_0         
		//   11   22:aload_1         
		//   12   23:invokevirtual   #33  <Method java.io.InputStream LocalSocket.getInputStream()>
		//   13   26:iload_2         
		//   14   27:aload_3         
		//   15   28:invokevirtual   #37  <Method void init(java.io.InputStream, int, HttpParams)>
				return;
		//   16   31:return          
			}
		}
	}

	private static class LocalSocketSessionOutputBuffer extends AbstractSessionOutputBuffer
	{

		public LocalSocketSessionOutputBuffer(LocalSocket localsocket, int i, HttpParams httpparams)
			throws IOException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void AbstractSessionOutputBuffer()>
			init(localsocket.getOutputStream(), i, httpparams);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #20  <Method java.io.OutputStream LocalSocket.getOutputStream()>
		//    5    9:iload_2         
		//    6   10:aload_3         
		//    7   11:invokevirtual   #24  <Method void init(java.io.OutputStream, int, HttpParams)>
		//    8   14:return          
		}
	}


	public LocalSocketHttpServerConnection()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void AbstractHttpServerConnection()>
	//    2    4:return          
	}

	private void close(boolean flag)
		throws IOException
	{
		if(!mOpen)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean mOpen>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		mOpen = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #27  <Field boolean mOpen>
		if(flag)
	//*   7   13:iload_1         
	//*   8   14:ifeq            21
			doFlush();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #30  <Method void doFlush()>
		mSocket.close();
	//   11   21:aload_0         
	//   12   22:getfield        #32  <Field LocalSocket mSocket>
	//   13   25:invokevirtual   #36  <Method void LocalSocket.close()>
	//   14   28:return          
	}

	protected void assertOpen()
		throws IllegalStateException
	{
		Util.throwIfNot(mOpen);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field boolean mOpen>
	//    2    4:invokestatic    #45  <Method void Util.throwIfNot(boolean)>
	//    3    7:return          
	}

	public void bind(LocalSocket localsocket, HttpParams httpparams)
		throws IOException
	{
		Util.throwIfNull(((Object) (localsocket)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #51  <Method Object Util.throwIfNull(Object)>
	//    2    4:pop             
		Util.throwIfNull(((Object) (httpparams)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #51  <Method Object Util.throwIfNull(Object)>
	//    5    9:pop             
		mSocket = localsocket;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #32  <Field LocalSocket mSocket>
		int i = HttpConnectionParams.getSocketBufferSize(httpparams);
	//    9   15:aload_2         
	//   10   16:invokestatic    #57  <Method int HttpConnectionParams.getSocketBufferSize(HttpParams)>
	//   11   19:istore_3        
		mInputBuffer = new LocalSocketSessionInputBuffer(localsocket, i, httpparams);
	//   12   20:aload_0         
	//   13   21:new             #6   <Class LocalSocketHttpServerConnection$LocalSocketSessionInputBuffer>
	//   14   24:dup             
	//   15   25:aload_1         
	//   16   26:iload_3         
	//   17   27:aload_2         
	//   18   28:invokespecial   #60  <Method void LocalSocketHttpServerConnection$LocalSocketSessionInputBuffer(LocalSocket, int, HttpParams)>
	//   19   31:putfield        #62  <Field LocalSocketHttpServerConnection$LocalSocketSessionInputBuffer mInputBuffer>
		init(((org.apache.http.io.SessionInputBuffer) (mInputBuffer)), ((org.apache.http.io.SessionOutputBuffer) (new LocalSocketSessionOutputBuffer(localsocket, i, httpparams))), httpparams);
	//   20   34:aload_0         
	//   21   35:aload_0         
	//   22   36:getfield        #62  <Field LocalSocketHttpServerConnection$LocalSocketSessionInputBuffer mInputBuffer>
	//   23   39:new             #9   <Class LocalSocketHttpServerConnection$LocalSocketSessionOutputBuffer>
	//   24   42:dup             
	//   25   43:aload_1         
	//   26   44:iload_3         
	//   27   45:aload_2         
	//   28   46:invokespecial   #63  <Method void LocalSocketHttpServerConnection$LocalSocketSessionOutputBuffer(LocalSocket, int, HttpParams)>
	//   29   49:aload_2         
	//   30   50:invokevirtual   #67  <Method void init(org.apache.http.io.SessionInputBuffer, org.apache.http.io.SessionOutputBuffer, HttpParams)>
		mOpen = true;
	//   31   53:aload_0         
	//   32   54:iconst_1        
	//   33   55:putfield        #27  <Field boolean mOpen>
	//   34   58:return          
	}

	public byte[] clearInputBuffer()
	{
		return mInputBuffer.clearCurrentBuffer();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field LocalSocketHttpServerConnection$LocalSocketSessionInputBuffer mInputBuffer>
	//    2    4:invokevirtual   #72  <Method byte[] LocalSocketHttpServerConnection$LocalSocketSessionInputBuffer.clearCurrentBuffer()>
	//    3    7:areturn         
	}

	public void close()
		throws IOException
	{
		close(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #74  <Method void close(boolean)>
	//    3    5:return          
	}

	public LocalSocket getSocket()
	{
		return mSocket;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field LocalSocket mSocket>
	//    2    4:areturn         
	}

	public int getSocketTimeout()
	{
		IOException ioexception;
		int i;
		try
		{
			i = mSocket.getSoTimeout();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field LocalSocket mSocket>
	//    2    4:invokevirtual   #81  <Method int LocalSocket.getSoTimeout()>
	//    3    7:istore_1        
		}
	//*   4    8:iload_1         
	//*   5    9:ireturn         
	//*   6   10:aload_0         
	//*   7   11:getfield        #32  <Field LocalSocket mSocket>
	//*   8   14:invokevirtual   #85  <Method boolean LocalSocket.isClosed()>
	//*   9   17:invokestatic    #45  <Method void Util.throwIfNot(boolean)>
	//*  10   20:iconst_m1       
	//*  11   21:ireturn         
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
		{
			Util.throwIfNot(mSocket.isClosed());
			return -1;
		}
		return i;
	//*  12   22:astore_2        
	//*  13   23:goto            10
	}

	public boolean isOpen()
	{
		return mOpen;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field boolean mOpen>
	//    2    4:ireturn         
	}

	public void setSocketTimeout(int i)
	{
		IOException ioexception;
		try
		{
			mSocket.setSoTimeout(i);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field LocalSocket mSocket>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #91  <Method void LocalSocket.setSoTimeout(int)>
			return;
	//    4    8:return          
		}
	//*   5    9:aload_0         
	//*   6   10:getfield        #32  <Field LocalSocket mSocket>
	//*   7   13:invokevirtual   #85  <Method boolean LocalSocket.isClosed()>
	//*   8   16:invokestatic    #45  <Method void Util.throwIfNot(boolean)>
	//*   9   19:return          
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
		{
			Util.throwIfNot(mSocket.isClosed());
		}
	//*  10   20:astore_2        
	//*  11   21:goto            9
	}

	public void shutdown()
		throws IOException
	{
		close(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #74  <Method void close(boolean)>
	//    3    5:return          
	}

	private volatile LocalSocketSessionInputBuffer mInputBuffer;
	private volatile boolean mOpen;
	private volatile LocalSocket mSocket;
}
