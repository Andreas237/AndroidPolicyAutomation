// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import android.net.LocalSocket;
import com.facebook.stetho.common.Util;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.apache.http.impl.io.AbstractSessionInputBuffer;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.facebook.stetho.server:
//			LocalSocketHttpServerConnection

private static class LocalSocketHttpServerConnection$LocalSocketSessionInputBuffer extends AbstractSessionInputBuffer
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

	public LocalSocketHttpServerConnection$LocalSocketSessionInputBuffer(LocalSocket localsocket, int i, HttpParams httpparams)
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
