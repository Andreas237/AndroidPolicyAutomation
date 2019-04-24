// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import android.net.LocalSocket;
import java.io.IOException;
import org.apache.http.impl.io.AbstractSessionOutputBuffer;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.facebook.stetho.server:
//			LocalSocketHttpServerConnection

private static class LocalSocketHttpServerConnection$LocalSocketSessionOutputBuffer extends AbstractSessionOutputBuffer
{

	public LocalSocketHttpServerConnection$LocalSocketSessionOutputBuffer(LocalSocket localsocket, int i, HttpParams httpparams)
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
