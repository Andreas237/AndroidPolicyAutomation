// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			DefaultImageHeaderParser

private static final class DefaultImageHeaderParser$StreamReader
	implements DefaultImageHeaderParser.Reader
{

	public int getByte()
		throws IOException
	{
		return is.read();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field InputStream is>
	//    2    4:invokevirtual   #28  <Method int InputStream.read()>
	//    3    7:ireturn         
	}

	public int getUInt16()
		throws IOException
	{
		return is.read() << 8 & 0xff00 | is.read() & 0xff;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field InputStream is>
	//    2    4:invokevirtual   #28  <Method int InputStream.read()>
	//    3    7:bipush          8
	//    4    9:ishl            
	//    5   10:ldc1            #31  <Int 65280>
	//    6   12:iand            
	//    7   13:aload_0         
	//    8   14:getfield        #18  <Field InputStream is>
	//    9   17:invokevirtual   #28  <Method int InputStream.read()>
	//   10   20:sipush          255
	//   11   23:iand            
	//   12   24:ior             
	//   13   25:ireturn         
	}

	public short getUInt8()
		throws IOException
	{
		return (short)(is.read() & 0xff);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field InputStream is>
	//    2    4:invokevirtual   #28  <Method int InputStream.read()>
	//    3    7:sipush          255
	//    4   10:iand            
	//    5   11:int2short       
	//    6   12:ireturn         
	}

	public int read(byte abyte0[], int i)
		throws IOException
	{
		int j = i;
	//    0    0:iload_2         
	//    1    1:istore_3        
		do
		{
			if(j <= 0)
				break;
	//    2    2:iload_3         
	//    3    3:ifle            34
			int k = is.read(abyte0, i - j, j);
	//    4    6:aload_0         
	//    5    7:getfield        #18  <Field InputStream is>
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:iload_3         
	//    9   13:isub            
	//   10   14:iload_3         
	//   11   15:invokevirtual   #37  <Method int InputStream.read(byte[], int, int)>
	//   12   18:istore          4
			if(k == -1)
				break;
	//   13   20:iload           4
	//   14   22:iconst_m1       
	//   15   23:icmpeq          34
			j -= k;
	//   16   26:iload_3         
	//   17   27:iload           4
	//   18   29:isub            
	//   19   30:istore_3        
		} while(true);
	//   20   31:goto            2
		return i - j;
	//   21   34:iload_2         
	//   22   35:iload_3         
	//   23   36:isub            
	//   24   37:ireturn         
	}

	public long skip(long l)
		throws IOException
	{
		if(l < 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifge            8
			return 0L;
	//    4    6:lconst_0        
	//    5    7:lreturn         
		long l1 = l;
	//    6    8:lload_1         
	//    7    9:lstore_3        
		do
		{
			if(l1 <= 0L)
				break;
	//    8   10:lload_3         
	//    9   11:lconst_0        
	//   10   12:lcmp            
	//   11   13:ifle            62
			long l2 = is.skip(l1);
	//   12   16:aload_0         
	//   13   17:getfield        #18  <Field InputStream is>
	//   14   20:lload_3         
	//   15   21:invokevirtual   #41  <Method long InputStream.skip(long)>
	//   16   24:lstore          5
			if(l2 > 0L)
	//*  17   26:lload           5
	//*  18   28:lconst_0        
	//*  19   29:lcmp            
	//*  20   30:ifle            41
			{
				l1 -= l2;
	//   21   33:lload_3         
	//   22   34:lload           5
	//   23   36:lsub            
	//   24   37:lstore_3        
				continue;
	//   25   38:goto            10
			}
			if(is.read() == -1)
	//*  26   41:aload_0         
	//*  27   42:getfield        #18  <Field InputStream is>
	//*  28   45:invokevirtual   #28  <Method int InputStream.read()>
	//*  29   48:iconst_m1       
	//*  30   49:icmpne          55
				break;
	//   31   52:goto            62
			l1--;
	//   32   55:lload_3         
	//   33   56:lconst_1        
	//   34   57:lsub            
	//   35   58:lstore_3        
		} while(true);
	//   36   59:goto            10
		return l - l1;
	//   37   62:lload_1         
	//   38   63:lload_3         
	//   39   64:lsub            
	//   40   65:lreturn         
	}

	private final InputStream is;

	DefaultImageHeaderParser$StreamReader(InputStream inputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		is = inputstream;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field InputStream is>
	//    5    9:return          
	}
}
