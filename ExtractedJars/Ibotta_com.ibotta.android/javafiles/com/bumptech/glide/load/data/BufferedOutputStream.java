// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.IOException;
import java.io.OutputStream;

public final class BufferedOutputStream extends OutputStream
{

	public BufferedOutputStream(OutputStream outputstream, ArrayPool arraypool)
	{
		this(outputstream, arraypool, 0x10000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #16  <Int 0x10000>
	//    4    5:invokespecial   #19  <Method void BufferedOutputStream(OutputStream, ArrayPool, int)>
	//    5    8:return          
	}

	BufferedOutputStream(OutputStream outputstream, ArrayPool arraypool, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void OutputStream()>
		out = outputstream;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field OutputStream out>
		arrayPool = arraypool;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field ArrayPool arrayPool>
		buffer = (byte[])arraypool.get(i, [B);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:iload_3         
	//   11   17:ldc1            #30  <Class byte[]>
	//   12   19:invokeinterface #36  <Method Object ArrayPool.get(int, Class)>
	//   13   24:checkcast       #30  <Class byte[]>
	//   14   27:putfield        #38  <Field byte[] buffer>
	//   15   30:return          
	}

	private void flushBuffer()
		throws IOException
	{
		int i = index;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int index>
	//    2    4:istore_1        
		if(i > 0)
	//*   3    5:iload_1         
	//*   4    6:ifle            27
		{
			out.write(buffer, 0, i);
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field OutputStream out>
	//    7   13:aload_0         
	//    8   14:getfield        #38  <Field byte[] buffer>
	//    9   17:iconst_0        
	//   10   18:iload_1         
	//   11   19:invokevirtual   #48  <Method void OutputStream.write(byte[], int, int)>
			index = 0;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #44  <Field int index>
		}
	//   15   27:return          
	}

	private void maybeFlushBuffer()
		throws IOException
	{
		if(index == buffer.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int index>
	//*   2    4:aload_0         
	//*   3    5:getfield        #38  <Field byte[] buffer>
	//*   4    8:arraylength     
	//*   5    9:icmpne          16
			flushBuffer();
	//    6   12:aload_0         
	//    7   13:invokespecial   #52  <Method void flushBuffer()>
	//    8   16:return          
	}

	private void release()
	{
		byte abyte0[] = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field byte[] buffer>
	//    2    4:astore_1        
		if(abyte0 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          24
		{
			arrayPool.put(((Object) (abyte0)));
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field ArrayPool arrayPool>
	//    7   13:aload_1         
	//    8   14:invokeinterface #57  <Method void ArrayPool.put(Object)>
			buffer = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #38  <Field byte[] buffer>
		}
	//   12   24:return          
	}

	public void close()
		throws IOException
	{
		flush();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method void flush()>
		out.close();
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field OutputStream out>
	//    4    8:invokevirtual   #63  <Method void OutputStream.close()>
		release();
	//    5   11:aload_0         
	//    6   12:invokespecial   #65  <Method void release()>
		return;
	//    7   15:return          
		Exception exception;
		exception;
	//    8   16:astore_1        
		out.close();
	//    9   17:aload_0         
	//   10   18:getfield        #27  <Field OutputStream out>
	//   11   21:invokevirtual   #63  <Method void OutputStream.close()>
		throw exception;
	//   12   24:aload_1         
	//   13   25:athrow          
	}

	public void flush()
		throws IOException
	{
		flushBuffer();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void flushBuffer()>
		out.flush();
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field OutputStream out>
	//    4    8:invokevirtual   #66  <Method void OutputStream.flush()>
	//    5   11:return          
	}

	public void write(int i)
		throws IOException
	{
		byte abyte0[] = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field byte[] buffer>
	//    2    4:astore_3        
		int j = index;
	//    3    5:aload_0         
	//    4    6:getfield        #44  <Field int index>
	//    5    9:istore_2        
		index = j + 1;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #44  <Field int index>
		abyte0[j] = (byte)i;
	//   11   17:aload_3         
	//   12   18:iload_2         
	//   13   19:iload_1         
	//   14   20:int2byte        
	//   15   21:bastore         
		maybeFlushBuffer();
	//   16   22:aload_0         
	//   17   23:invokespecial   #69  <Method void maybeFlushBuffer()>
	//   18   26:return          
	}

	public void write(byte abyte0[])
		throws IOException
	{
		write(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #71  <Method void write(byte[], int, int)>
	//    6    8:return          
	}

	public void write(byte abyte0[], int i, int j)
		throws IOException
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int l;
		do
		{
			int i1 = j - k;
	//    2    3:iload_3         
	//    3    4:iload           4
	//    4    6:isub            
	//    5    7:istore          6
			l = i + k;
	//    6    9:iload_2         
	//    7   10:iload           4
	//    8   12:iadd            
	//    9   13:istore          5
			if(index == 0 && i1 >= buffer.length)
	//*  10   15:aload_0         
	//*  11   16:getfield        #44  <Field int index>
	//*  12   19:ifne            45
	//*  13   22:iload           6
	//*  14   24:aload_0         
	//*  15   25:getfield        #38  <Field byte[] buffer>
	//*  16   28:arraylength     
	//*  17   29:icmplt          45
			{
				out.write(abyte0, l, i1);
	//   18   32:aload_0         
	//   19   33:getfield        #27  <Field OutputStream out>
	//   20   36:aload_1         
	//   21   37:iload           5
	//   22   39:iload           6
	//   23   41:invokevirtual   #48  <Method void OutputStream.write(byte[], int, int)>
				return;
	//   24   44:return          
			}
			i1 = Math.min(i1, buffer.length - index);
	//   25   45:iload           6
	//   26   47:aload_0         
	//   27   48:getfield        #38  <Field byte[] buffer>
	//   28   51:arraylength     
	//   29   52:aload_0         
	//   30   53:getfield        #44  <Field int index>
	//   31   56:isub            
	//   32   57:invokestatic    #77  <Method int Math.min(int, int)>
	//   33   60:istore          6
			System.arraycopy(((Object) (abyte0)), l, ((Object) (buffer)), index, i1);
	//   34   62:aload_1         
	//   35   63:iload           5
	//   36   65:aload_0         
	//   37   66:getfield        #38  <Field byte[] buffer>
	//   38   69:aload_0         
	//   39   70:getfield        #44  <Field int index>
	//   40   73:iload           6
	//   41   75:invokestatic    #83  <Method void System.arraycopy(Object, int, Object, int, int)>
			index = index + i1;
	//   42   78:aload_0         
	//   43   79:aload_0         
	//   44   80:getfield        #44  <Field int index>
	//   45   83:iload           6
	//   46   85:iadd            
	//   47   86:putfield        #44  <Field int index>
			l = k + i1;
	//   48   89:iload           4
	//   49   91:iload           6
	//   50   93:iadd            
	//   51   94:istore          5
			maybeFlushBuffer();
	//   52   96:aload_0         
	//   53   97:invokespecial   #69  <Method void maybeFlushBuffer()>
			k = l;
	//   54  100:iload           5
	//   55  102:istore          4
		} while(l < j);
	//   56  104:iload           5
	//   57  106:iload_3         
	//   58  107:icmplt          3
	//   59  110:return          
	}

	private ArrayPool arrayPool;
	private byte buffer[];
	private int index;
	private final OutputStream out;
}
