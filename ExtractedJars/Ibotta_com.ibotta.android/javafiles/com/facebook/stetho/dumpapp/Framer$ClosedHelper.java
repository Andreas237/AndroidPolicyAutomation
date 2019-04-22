// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp;

import java.io.IOException;

// Referenced classes of package com.facebook.stetho.dumpapp:
//			Framer

private static class Framer$ClosedHelper
{

	public void close()
	{
		mClosed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #19  <Field boolean mClosed>
	//    3    5:return          
	}

	public void throwIfClosed()
		throws IOException
	{
		if(!mClosed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field boolean mClosed>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		else
			throw new IOException("Stream is closed");
	//    4    8:new             #22  <Class IOException>
	//    5   11:dup             
	//    6   12:ldc1            #24  <String "Stream is closed">
	//    7   14:invokespecial   #27  <Method void IOException(String)>
	//    8   17:athrow          
	}

	private volatile boolean mClosed;

	private Framer$ClosedHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	Framer$ClosedHelper(Framer._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Framer$ClosedHelper()>
	//    2    4:return          
	}
}
