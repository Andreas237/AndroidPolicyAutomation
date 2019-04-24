// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.io;

import java.io.IOException;

// Referenced classes of package com.itextpdf.text.io:
//			RandomAccessSource

public class GetBufferedRandomAccessSource
	implements RandomAccessSource
{

	public GetBufferedRandomAccessSource(RandomAccessSource randomaccesssource)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		getBufferStart = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #19  <Long -1L>
	//    4    8:putfield        #22  <Field long getBufferStart>
		getBufferEnd = -1L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #19  <Long -1L>
	//    7   15:putfield        #24  <Field long getBufferEnd>
		source = randomaccesssource;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #26  <Field RandomAccessSource source>
		getBuffer = new byte[(int)Math.min(Math.max(randomaccesssource.length() / 4L, 1L), 4096L)];
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokeinterface #30  <Method long RandomAccessSource.length()>
	//   14   30:ldc2w           #31  <Long 4L>
	//   15   33:ldiv            
	//   16   34:lconst_1        
	//   17   35:invokestatic    #38  <Method long Math.max(long, long)>
	//   18   38:ldc2w           #39  <Long 4096L>
	//   19   41:invokestatic    #43  <Method long Math.min(long, long)>
	//   20   44:l2i             
	//   21   45:newarray        byte[]
	//   22   47:putfield        #45  <Field byte[] getBuffer>
		getBufferStart = -1L;
	//   23   50:aload_0         
	//   24   51:ldc2w           #19  <Long -1L>
	//   25   54:putfield        #22  <Field long getBufferStart>
		getBufferEnd = -1L;
	//   26   57:aload_0         
	//   27   58:ldc2w           #19  <Long -1L>
	//   28   61:putfield        #24  <Field long getBufferEnd>
	//   29   64:return          
	}

	public void close()
		throws IOException
	{
		source.close();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RandomAccessSource source>
	//    2    4:invokeinterface #51  <Method void RandomAccessSource.close()>
		getBufferStart = -1L;
	//    3    9:aload_0         
	//    4   10:ldc2w           #19  <Long -1L>
	//    5   13:putfield        #22  <Field long getBufferStart>
		getBufferEnd = -1L;
	//    6   16:aload_0         
	//    7   17:ldc2w           #19  <Long -1L>
	//    8   20:putfield        #24  <Field long getBufferEnd>
	//    9   23:return          
	}

	public int get(long l)
		throws IOException
	{
		if(l < getBufferStart || l > getBufferEnd)
	//*   0    0:lload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #22  <Field long getBufferStart>
	//*   3    5:lcmp            
	//*   4    6:iflt            18
	//*   5    9:lload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #24  <Field long getBufferEnd>
	//*   8   14:lcmp            
	//*   9   15:ifle            61
		{
			int i = source.get(l, getBuffer, 0, getBuffer.length);
	//   10   18:aload_0         
	//   11   19:getfield        #26  <Field RandomAccessSource source>
	//   12   22:lload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #45  <Field byte[] getBuffer>
	//   15   27:iconst_0        
	//   16   28:aload_0         
	//   17   29:getfield        #45  <Field byte[] getBuffer>
	//   18   32:arraylength     
	//   19   33:invokeinterface #57  <Method int RandomAccessSource.get(long, byte[], int, int)>
	//   20   38:istore_3        
			if(i == -1)
	//*  21   39:iload_3         
	//*  22   40:iconst_m1       
	//*  23   41:icmpne          46
				return -1;
	//   24   44:iconst_m1       
	//   25   45:ireturn         
			getBufferStart = l;
	//   26   46:aload_0         
	//   27   47:lload_1         
	//   28   48:putfield        #22  <Field long getBufferStart>
			getBufferEnd = ((long)i + l) - 1L;
	//   29   51:aload_0         
	//   30   52:iload_3         
	//   31   53:i2l             
	//   32   54:lload_1         
	//   33   55:ladd            
	//   34   56:lconst_1        
	//   35   57:lsub            
	//   36   58:putfield        #24  <Field long getBufferEnd>
		}
		int j = (int)(l - getBufferStart);
	//   37   61:lload_1         
	//   38   62:aload_0         
	//   39   63:getfield        #22  <Field long getBufferStart>
	//   40   66:lsub            
	//   41   67:l2i             
	//   42   68:istore_3        
		return getBuffer[j] & 0xff;
	//   43   69:aload_0         
	//   44   70:getfield        #45  <Field byte[] getBuffer>
	//   45   73:iload_3         
	//   46   74:baload          
	//   47   75:sipush          255
	//   48   78:iand            
	//   49   79:ireturn         
	}

	public int get(long l, byte abyte0[], int i, int j)
		throws IOException
	{
		return source.get(l, abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RandomAccessSource source>
	//    2    4:lload_1         
	//    3    5:aload_3         
	//    4    6:iload           4
	//    5    8:iload           5
	//    6   10:invokeinterface #57  <Method int RandomAccessSource.get(long, byte[], int, int)>
	//    7   15:ireturn         
	}

	public long length()
	{
		return source.length();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RandomAccessSource source>
	//    2    4:invokeinterface #30  <Method long RandomAccessSource.length()>
	//    3    9:lreturn         
	}

	private final byte getBuffer[];
	private long getBufferEnd;
	private long getBufferStart;
	private final RandomAccessSource source;
}
