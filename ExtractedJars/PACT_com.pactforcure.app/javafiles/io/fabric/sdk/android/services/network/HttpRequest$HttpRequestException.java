// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import java.io.IOException;

// Referenced classes of package io.fabric.sdk.android.services.network:
//			HttpRequest

public static class HttpRequest$HttpRequestException extends RuntimeException
{

	public IOException getCause()
	{
		return (IOException)super.getCause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method Throwable RuntimeException.getCause()>
	//    2    4:checkcast       #24  <Class IOException>
	//    3    7:areturn         
	}

	public volatile Throwable getCause()
	{
		return ((Throwable) (getCause()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method IOException getCause()>
	//    2    4:areturn         
	}

	private static final long serialVersionUID = 0x64bcfdc9L;

	protected HttpRequest$HttpRequestException(IOException ioexception)
	{
		super(((Throwable) (ioexception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void RuntimeException(Throwable)>
	//    3    5:return          
	}
}
