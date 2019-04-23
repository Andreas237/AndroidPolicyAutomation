// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import java.io.*;

// Referenced classes of package com.google.android.exoplayer.util:
//			Util, Assertions

public final class ReusableBufferedOutputStream extends BufferedOutputStream
{

	public ReusableBufferedOutputStream(OutputStream outputstream)
	{
		super(outputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void BufferedOutputStream(OutputStream)>
	//    3    5:return          
	}

	public ReusableBufferedOutputStream(OutputStream outputstream, int i)
	{
		super(outputstream, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #14  <Method void BufferedOutputStream(OutputStream, int)>
	//    4    6:return          
	}

	public void close()
		throws IOException
	{
		closed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #22  <Field boolean closed>
		flush();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #25  <Method void flush()>
		Throwable throwable;
		throwable = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
		break MISSING_BLOCK_LABEL_15;
	//    7   11:goto            15
		throwable;
	//    8   14:astore_1        
		out.close();
	//    9   15:aload_0         
	//   10   16:getfield        #29  <Field OutputStream out>
	//   11   19:invokevirtual   #33  <Method void OutputStream.close()>
		Throwable throwable1;
		throwable1 = throwable;
	//   12   22:aload_1         
	//   13   23:astore_2        
		break MISSING_BLOCK_LABEL_36;
	//   14   24:goto            36
		Throwable throwable2;
		throwable2;
	//   15   27:astore_3        
		throwable1 = throwable;
	//   16   28:aload_1         
	//   17   29:astore_2        
		if(throwable == null)
	//*  18   30:aload_1         
	//*  19   31:ifnonnull       36
			throwable1 = throwable2;
	//   20   34:aload_3         
	//   21   35:astore_2        
		if(throwable1 != null)
	//*  22   36:aload_2         
	//*  23   37:ifnull          44
			Util.sneakyThrow(throwable1);
	//   24   40:aload_2         
	//   25   41:invokestatic    #39  <Method void Util.sneakyThrow(Throwable)>
		return;
	//   26   44:return          
	}

	public void reset(OutputStream outputstream)
	{
		Assertions.checkState(closed);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean closed>
	//    2    4:invokestatic    #47  <Method void Assertions.checkState(boolean)>
		out = outputstream;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #29  <Field OutputStream out>
		count = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #51  <Field int count>
		closed = false;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #22  <Field boolean closed>
	//   12   22:return          
	}

	private boolean closed;
}
