// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.*;

// Referenced classes of package com.google.protobuf:
//			AbstractMessageLite

static final class AbstractMessageLite$Builder$LimitedInputStream extends FilterInputStream
{

	public int available()
		throws IOException
	{
		return Math.min(super.available(), limit);
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method int FilterInputStream.available()>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field int limit>
	//    4    8:invokestatic    #32  <Method int Math.min(int, int)>
	//    5   11:ireturn         
	}

	public int read()
		throws IOException
	{
		if(limit <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field int limit>
	//*   2    4:ifgt            9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		int i = super.read();
	//    5    9:aload_0         
	//    6   10:invokespecial   #36  <Method int FilterInputStream.read()>
	//    7   13:istore_1        
		if(i >= 0)
	//*   8   14:iload_1         
	//*   9   15:iflt            28
			limit = limit - 1;
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #19  <Field int limit>
	//   13   23:iconst_1        
	//   14   24:isub            
	//   15   25:putfield        #19  <Field int limit>
		return i;
	//   16   28:iload_1         
	//   17   29:ireturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		if(limit <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field int limit>
	//*   2    4:ifgt            9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		i = super.read(abyte0, i, Math.min(j, limit));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:iload_3         
	//    9   13:aload_0         
	//   10   14:getfield        #19  <Field int limit>
	//   11   17:invokestatic    #32  <Method int Math.min(int, int)>
	//   12   20:invokespecial   #39  <Method int FilterInputStream.read(byte[], int, int)>
	//   13   23:istore_2        
		if(i >= 0)
	//*  14   24:iload_2         
	//*  15   25:iflt            38
			limit = limit - i;
	//   16   28:aload_0         
	//   17   29:aload_0         
	//   18   30:getfield        #19  <Field int limit>
	//   19   33:iload_2         
	//   20   34:isub            
	//   21   35:putfield        #19  <Field int limit>
		return i;
	//   22   38:iload_2         
	//   23   39:ireturn         
	}

	public long skip(long l)
		throws IOException
	{
		l = super.skip(Math.min(l, limit));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #19  <Field int limit>
	//    4    6:i2l             
	//    5    7:invokestatic    #44  <Method long Math.min(long, long)>
	//    6   10:invokespecial   #46  <Method long FilterInputStream.skip(long)>
	//    7   13:lstore_1        
		if(l >= 0L)
	//*   8   14:lload_1         
	//*   9   15:lconst_0        
	//*  10   16:lcmp            
	//*  11   17:iflt            32
			limit = (int)((long)limit - l);
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:getfield        #19  <Field int limit>
	//   15   25:i2l             
	//   16   26:lload_1         
	//   17   27:lsub            
	//   18   28:l2i             
	//   19   29:putfield        #19  <Field int limit>
		return l;
	//   20   32:lload_1         
	//   21   33:lreturn         
	}

	private int limit;

	AbstractMessageLite$Builder$LimitedInputStream(InputStream inputstream, int i)
	{
		super(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void FilterInputStream(InputStream)>
		limit = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #19  <Field int limit>
	//    6   10:return          
	}
}
