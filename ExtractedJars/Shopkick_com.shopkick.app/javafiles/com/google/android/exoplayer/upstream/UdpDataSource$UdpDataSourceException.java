// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.upstream:
//			UdpDataSource

public static final class UdpDataSource$UdpDataSourceException extends IOException
{

	public UdpDataSource$UdpDataSourceException(IOException ioexception)
	{
		super(((Throwable) (ioexception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void IOException(Throwable)>
	//    3    5:return          
	}

	public UdpDataSource$UdpDataSourceException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void IOException(String)>
	//    3    5:return          
	}
}
