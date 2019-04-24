// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.io;

import java.io.*;

// Referenced classes of package com.fasterxml.jackson.core.io:
//			IOContext

public abstract class InputDecorator
	implements Serializable
{

	public InputDecorator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public abstract InputStream decorate(IOContext iocontext, InputStream inputstream)
		throws IOException;

	public abstract InputStream decorate(IOContext iocontext, byte abyte0[], int i, int j)
		throws IOException;

	public abstract Reader decorate(IOContext iocontext, Reader reader)
		throws IOException;

	private static final long serialVersionUID = 1L;
}
