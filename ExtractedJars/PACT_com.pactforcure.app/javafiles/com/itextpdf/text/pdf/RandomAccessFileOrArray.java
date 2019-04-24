// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.io.*;
import java.io.*;
import java.net.URL;

public class RandomAccessFileOrArray
	implements DataInput
{

	public RandomAccessFileOrArray(RandomAccessSource randomaccesssource)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		isBack = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field boolean isBack>
		byteSource = randomaccesssource;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #23  <Field RandomAccessSource byteSource>
	//    8   14:return          
	}

	public RandomAccessFileOrArray(RandomAccessFileOrArray randomaccessfileorarray)
	{
		this(((RandomAccessSource) (new IndependentRandomAccessSource(randomaccessfileorarray.byteSource))));
	//    0    0:aload_0         
	//    1    1:new             #28  <Class IndependentRandomAccessSource>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:getfield        #23  <Field RandomAccessSource byteSource>
	//    5    9:invokespecial   #30  <Method void IndependentRandomAccessSource(RandomAccessSource)>
	//    6   12:invokespecial   #31  <Method void RandomAccessFileOrArray(RandomAccessSource)>
	//    7   15:return          
	}

	public RandomAccessFileOrArray(InputStream inputstream)
		throws IOException
	{
		this((new RandomAccessSourceFactory()).createSource(inputstream));
	//    0    0:aload_0         
	//    1    1:new             #37  <Class RandomAccessSourceFactory>
	//    2    4:dup             
	//    3    5:invokespecial   #38  <Method void RandomAccessSourceFactory()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #42  <Method RandomAccessSource RandomAccessSourceFactory.createSource(InputStream)>
	//    6   12:invokespecial   #31  <Method void RandomAccessFileOrArray(RandomAccessSource)>
	//    7   15:return          
	}

	public RandomAccessFileOrArray(String s)
		throws IOException
	{
		this((new RandomAccessSourceFactory()).setForceRead(false).setUsePlainRandomAccess(Document.plainRandomAccess).createBestSource(s));
	//    0    0:aload_0         
	//    1    1:new             #37  <Class RandomAccessSourceFactory>
	//    2    4:dup             
	//    3    5:invokespecial   #38  <Method void RandomAccessSourceFactory()>
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #48  <Method RandomAccessSourceFactory RandomAccessSourceFactory.setForceRead(boolean)>
	//    6   12:getstatic       #53  <Field boolean Document.plainRandomAccess>
	//    7   15:invokevirtual   #56  <Method RandomAccessSourceFactory RandomAccessSourceFactory.setUsePlainRandomAccess(boolean)>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #60  <Method RandomAccessSource RandomAccessSourceFactory.createBestSource(String)>
	//   10   22:invokespecial   #31  <Method void RandomAccessFileOrArray(RandomAccessSource)>
	//   11   25:return          
	}

	public RandomAccessFileOrArray(String s, boolean flag, boolean flag1)
		throws IOException
	{
		this((new RandomAccessSourceFactory()).setForceRead(flag).setUsePlainRandomAccess(flag1).createBestSource(s));
	//    0    0:aload_0         
	//    1    1:new             #37  <Class RandomAccessSourceFactory>
	//    2    4:dup             
	//    3    5:invokespecial   #38  <Method void RandomAccessSourceFactory()>
	//    4    8:iload_2         
	//    5    9:invokevirtual   #48  <Method RandomAccessSourceFactory RandomAccessSourceFactory.setForceRead(boolean)>
	//    6   12:iload_3         
	//    7   13:invokevirtual   #56  <Method RandomAccessSourceFactory RandomAccessSourceFactory.setUsePlainRandomAccess(boolean)>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #60  <Method RandomAccessSource RandomAccessSourceFactory.createBestSource(String)>
	//   10   20:invokespecial   #31  <Method void RandomAccessFileOrArray(RandomAccessSource)>
	//   11   23:return          
	}

	public RandomAccessFileOrArray(URL url)
		throws IOException
	{
		this((new RandomAccessSourceFactory()).createSource(url));
	//    0    0:aload_0         
	//    1    1:new             #37  <Class RandomAccessSourceFactory>
	//    2    4:dup             
	//    3    5:invokespecial   #38  <Method void RandomAccessSourceFactory()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #65  <Method RandomAccessSource RandomAccessSourceFactory.createSource(URL)>
	//    6   12:invokespecial   #31  <Method void RandomAccessFileOrArray(RandomAccessSource)>
	//    7   15:return          
	}

	public RandomAccessFileOrArray(byte abyte0[])
	{
		this((new RandomAccessSourceFactory()).createSource(abyte0));
	//    0    0:aload_0         
	//    1    1:new             #37  <Class RandomAccessSourceFactory>
	//    2    4:dup             
	//    3    5:invokespecial   #38  <Method void RandomAccessSourceFactory()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #69  <Method RandomAccessSource RandomAccessSourceFactory.createSource(byte[])>
	//    6   12:invokespecial   #31  <Method void RandomAccessFileOrArray(RandomAccessSource)>
	//    7   15:return          
	}

	public void close()
		throws IOException
	{
		isBack = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #21  <Field boolean isBack>
		byteSource.close();
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field RandomAccessSource byteSource>
	//    5    9:invokeinterface #74  <Method void RandomAccessSource.close()>
	//    6   14:return          
	}

	public RandomAccessSource createSourceView()
	{
		return ((RandomAccessSource) (new IndependentRandomAccessSource(byteSource)));
	//    0    0:new             #28  <Class IndependentRandomAccessSource>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field RandomAccessSource byteSource>
	//    4    8:invokespecial   #30  <Method void IndependentRandomAccessSource(RandomAccessSource)>
	//    5   11:areturn         
	}

	public RandomAccessFileOrArray createView()
	{
		return new RandomAccessFileOrArray(((RandomAccessSource) (new IndependentRandomAccessSource(byteSource))));
	//    0    0:new             #2   <Class RandomAccessFileOrArray>
	//    1    3:dup             
	//    2    4:new             #28  <Class IndependentRandomAccessSource>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field RandomAccessSource byteSource>
	//    6   12:invokespecial   #30  <Method void IndependentRandomAccessSource(RandomAccessSource)>
	//    7   15:invokespecial   #31  <Method void RandomAccessFileOrArray(RandomAccessSource)>
	//    8   18:areturn         
	}

	protected RandomAccessSource getByteSource()
	{
		return byteSource;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field RandomAccessSource byteSource>
	//    2    4:areturn         
	}

	public long getFilePointer()
		throws IOException
	{
		long l = byteSourcePosition;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field long byteSourcePosition>
	//    2    4:lstore_2        
		int i;
		if(isBack)
	//*   3    5:aload_0         
	//*   4    6:getfield        #21  <Field boolean isBack>
	//*   5    9:ifeq            19
			i = 1;
	//    6   12:iconst_1        
	//    7   13:istore_1        
		else
	//*   8   14:lload_2         
	//*   9   15:iload_1         
	//*  10   16:i2l             
	//*  11   17:lsub            
	//*  12   18:lreturn         
			i = 0;
	//   13   19:iconst_0        
	//   14   20:istore_1        
		return l - (long)i;
	//*  15   21:goto            14
	}

	public long length()
		throws IOException
	{
		return byteSource.length();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field RandomAccessSource byteSource>
	//    2    4:invokeinterface #86  <Method long RandomAccessSource.length()>
	//    3    9:lreturn         
	}

	public void pushBack(byte byte0)
	{
		back = byte0;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #90  <Field byte back>
		isBack = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #21  <Field boolean isBack>
	//    6   10:return          
	}

	public void reOpen()
		throws IOException
	{
		seek(0L);
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:invokevirtual   #95  <Method void seek(long)>
	//    3    5:return          
	}

	public int read()
		throws IOException
	{
		if(isBack)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean isBack>
	//*   2    4:ifeq            21
		{
			isBack = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #21  <Field boolean isBack>
			return back & 0xff;
	//    6   12:aload_0         
	//    7   13:getfield        #90  <Field byte back>
	//    8   16:sipush          255
	//    9   19:iand            
	//   10   20:ireturn         
		} else
		{
			RandomAccessSource randomaccesssource = byteSource;
	//   11   21:aload_0         
	//   12   22:getfield        #23  <Field RandomAccessSource byteSource>
	//   13   25:astore_3        
			long l = byteSourcePosition;
	//   14   26:aload_0         
	//   15   27:getfield        #83  <Field long byteSourcePosition>
	//   16   30:lstore_1        
			byteSourcePosition = 1L + l;
	//   17   31:aload_0         
	//   18   32:lconst_1        
	//   19   33:lload_1         
	//   20   34:ladd            
	//   21   35:putfield        #83  <Field long byteSourcePosition>
			return randomaccesssource.get(l);
	//   22   38:aload_3         
	//   23   39:lload_1         
	//   24   40:invokeinterface #101 <Method int RandomAccessSource.get(long)>
	//   25   45:ireturn         
		}
	}

	public int read(byte abyte0[])
		throws IOException
	{
		return read(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #105 <Method int read(byte[], int, int)>
	//    6    8:ireturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		if(j == 0)
	//*   0    0:iload_3         
	//*   1    1:ifne            8
		{
			j = 0;
	//    2    4:iconst_0        
	//    3    5:istore_3        
		} else
	//*   4    6:iload_3         
	//*   5    7:ireturn         
		{
			boolean flag = false;
	//    6    8:iconst_0        
	//    7    9:istore          7
			int k = ((int) (flag));
	//    8   11:iload           7
	//    9   13:istore          4
			int i1 = i;
	//   10   15:iload_2         
	//   11   16:istore          6
			int l = j;
	//   12   18:iload_3         
	//   13   19:istore          5
			if(isBack)
	//*  14   21:aload_0         
	//*  15   22:getfield        #21  <Field boolean isBack>
	//*  16   25:ifeq            69
			{
				k = ((int) (flag));
	//   17   28:iload           7
	//   18   30:istore          4
				i1 = i;
	//   19   32:iload_2         
	//   20   33:istore          6
				l = j;
	//   21   35:iload_3         
	//   22   36:istore          5
				if(j > 0)
	//*  23   38:iload_3         
	//*  24   39:ifle            69
				{
					isBack = false;
	//   25   42:aload_0         
	//   26   43:iconst_0        
	//   27   44:putfield        #21  <Field boolean isBack>
					abyte0[i] = back;
	//   28   47:aload_1         
	//   29   48:iload_2         
	//   30   49:aload_0         
	//   31   50:getfield        #90  <Field byte back>
	//   32   53:bastore         
					l = j - 1;
	//   33   54:iload_3         
	//   34   55:iconst_1        
	//   35   56:isub            
	//   36   57:istore          5
					k = 0 + 1;
	//   37   59:iconst_0        
	//   38   60:iconst_1        
	//   39   61:iadd            
	//   40   62:istore          4
					i1 = i + 1;
	//   41   64:iload_2         
	//   42   65:iconst_1        
	//   43   66:iadd            
	//   44   67:istore          6
				}
			}
			i = k;
	//   45   69:iload           4
	//   46   71:istore_2        
			if(l > 0)
	//*  47   72:iload           5
	//*  48   74:ifle            119
			{
				j = byteSource.get(byteSourcePosition, abyte0, i1, l);
	//   49   77:aload_0         
	//   50   78:getfield        #23  <Field RandomAccessSource byteSource>
	//   51   81:aload_0         
	//   52   82:getfield        #83  <Field long byteSourcePosition>
	//   53   85:aload_1         
	//   54   86:iload           6
	//   55   88:iload           5
	//   56   90:invokeinterface #108 <Method int RandomAccessSource.get(long, byte[], int, int)>
	//   57   95:istore_3        
				i = k;
	//   58   96:iload           4
	//   59   98:istore_2        
				if(j > 0)
	//*  60   99:iload_3         
	//*  61  100:ifle            119
				{
					i = k + j;
	//   62  103:iload           4
	//   63  105:iload_3         
	//   64  106:iadd            
	//   65  107:istore_2        
					byteSourcePosition = byteSourcePosition + (long)j;
	//   66  108:aload_0         
	//   67  109:aload_0         
	//   68  110:getfield        #83  <Field long byteSourcePosition>
	//   69  113:iload_3         
	//   70  114:i2l             
	//   71  115:ladd            
	//   72  116:putfield        #83  <Field long byteSourcePosition>
				}
			}
			j = i;
	//   73  119:iload_2         
	//   74  120:istore_3        
			if(i == 0)
	//*  75  121:iload_2         
	//*  76  122:ifne            6
				return -1;
	//   77  125:iconst_m1       
	//   78  126:ireturn         
		}
		return j;
	}

	public boolean readBoolean()
		throws IOException
	{
		int i = read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method int read()>
	//    2    4:istore_1        
		if(i < 0)
	//*   3    5:iload_1         
	//*   4    6:ifge            17
			throw new EOFException();
	//    5    9:new             #114 <Class EOFException>
	//    6   12:dup             
	//    7   13:invokespecial   #115 <Method void EOFException()>
	//    8   16:athrow          
		return i != 0;
	//    9   17:iload_1         
	//   10   18:ifeq            23
	//   11   21:iconst_1        
	//   12   22:ireturn         
	//   13   23:iconst_0        
	//   14   24:ireturn         
	}

	public byte readByte()
		throws IOException
	{
		int i = read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method int read()>
	//    2    4:istore_1        
		if(i < 0)
	//*   3    5:iload_1         
	//*   4    6:ifge            17
			throw new EOFException();
	//    5    9:new             #114 <Class EOFException>
	//    6   12:dup             
	//    7   13:invokespecial   #115 <Method void EOFException()>
	//    8   16:athrow          
		else
			return (byte)i;
	//    9   17:iload_1         
	//   10   18:int2byte        
	//   11   19:ireturn         
	}

	public char readChar()
		throws IOException
	{
		int i = read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method int read()>
	//    2    4:istore_1        
		int j = read();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #112 <Method int read()>
	//    5    9:istore_2        
		if((i | j) < 0)
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:ior             
	//*   9   13:ifge            24
			throw new EOFException();
	//   10   16:new             #114 <Class EOFException>
	//   11   19:dup             
	//   12   20:invokespecial   #115 <Method void EOFException()>
	//   13   23:athrow          
		else
			return (char)((i << 8) + j);
	//   14   24:iload_1         
	//   15   25:bipush          8
	//   16   27:ishl            
	//   17   28:iload_2         
	//   18   29:iadd            
	//   19   30:int2char        
	//   20   31:ireturn         
	}

	public final char readCharLE()
		throws IOException
	{
		int i = read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method int read()>
	//    2    4:istore_1        
		int j = read();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #112 <Method int read()>
	//    5    9:istore_2        
		if((i | j) < 0)
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:ior             
	//*   9   13:ifge            24
			throw new EOFException();
	//   10   16:new             #114 <Class EOFException>
	//   11   19:dup             
	//   12   20:invokespecial   #115 <Method void EOFException()>
	//   13   23:athrow          
		else
			return (char)((j << 8) + (i << 0));
	//   14   24:iload_2         
	//   15   25:bipush          8
	//   16   27:ishl            
	//   17   28:iload_1         
	//   18   29:iconst_0        
	//   19   30:ishl            
	//   20   31:iadd            
	//   21   32:int2char        
	//   22   33:ireturn         
	}

	public double readDouble()
		throws IOException
	{
		return Double.longBitsToDouble(readLong());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #125 <Method long readLong()>
	//    2    4:invokestatic    #131 <Method double Double.longBitsToDouble(long)>
	//    3    7:dreturn         
	}

	public final double readDoubleLE()
		throws IOException
	{
		return Double.longBitsToDouble(readLongLE());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method long readLongLE()>
	//    2    4:invokestatic    #131 <Method double Double.longBitsToDouble(long)>
	//    3    7:dreturn         
	}

	public float readFloat()
		throws IOException
	{
		return Float.intBitsToFloat(readInt());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method int readInt()>
	//    2    4:invokestatic    #146 <Method float Float.intBitsToFloat(int)>
	//    3    7:freturn         
	}

	public final float readFloatLE()
		throws IOException
	{
		return Float.intBitsToFloat(readIntLE());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method int readIntLE()>
	//    2    4:invokestatic    #146 <Method float Float.intBitsToFloat(int)>
	//    3    7:freturn         
	}

	public void readFully(byte abyte0[])
		throws IOException
	{
		readFully(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #154 <Method void readFully(byte[], int, int)>
	//    6    8:return          
	}

	public void readFully(byte abyte0[], int i, int j)
		throws IOException
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int l;
		do
		{
			l = read(abyte0, i + k, j - k);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:iload_2         
	//    5    6:iload           4
	//    6    8:iadd            
	//    7    9:iload_3         
	//    8   10:iload           4
	//    9   12:isub            
	//   10   13:invokevirtual   #105 <Method int read(byte[], int, int)>
	//   11   16:istore          5
			if(l < 0)
	//*  12   18:iload           5
	//*  13   20:ifge            31
				throw new EOFException();
	//   14   23:new             #114 <Class EOFException>
	//   15   26:dup             
	//   16   27:invokespecial   #115 <Method void EOFException()>
	//   17   30:athrow          
			l = k + l;
	//   18   31:iload           4
	//   19   33:iload           5
	//   20   35:iadd            
	//   21   36:istore          5
			k = l;
	//   22   38:iload           5
	//   23   40:istore          4
		} while(l < j);
	//   24   42:iload           5
	//   25   44:iload_3         
	//   26   45:icmplt          3
	//   27   48:return          
	}

	public int readInt()
		throws IOException
	{
		int i = read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method int read()>
	//    2    4:istore_1        
		int j = read();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #112 <Method int read()>
	//    5    9:istore_2        
		int k = read();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #112 <Method int read()>
	//    8   14:istore_3        
		int l = read();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #112 <Method int read()>
	//   11   19:istore          4
		if((i | j | k | l) < 0)
	//*  12   21:iload_1         
	//*  13   22:iload_2         
	//*  14   23:ior             
	//*  15   24:iload_3         
	//*  16   25:ior             
	//*  17   26:iload           4
	//*  18   28:ior             
	//*  19   29:ifge            40
			throw new EOFException();
	//   20   32:new             #114 <Class EOFException>
	//   21   35:dup             
	//   22   36:invokespecial   #115 <Method void EOFException()>
	//   23   39:athrow          
		else
			return (i << 24) + (j << 16) + (k << 8) + l;
	//   24   40:iload_1         
	//   25   41:bipush          24
	//   26   43:ishl            
	//   27   44:iload_2         
	//   28   45:bipush          16
	//   29   47:ishl            
	//   30   48:iadd            
	//   31   49:iload_3         
	//   32   50:bipush          8
	//   33   52:ishl            
	//   34   53:iadd            
	//   35   54:iload           4
	//   36   56:iadd            
	//   37   57:ireturn         
	}

	public final int readIntLE()
		throws IOException
	{
		int i = read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method int read()>
	//    2    4:istore_1        
		int j = read();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #112 <Method int read()>
	//    5    9:istore_2        
		int k = read();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #112 <Method int read()>
	//    8   14:istore_3        
		int l = read();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #112 <Method int read()>
	//   11   19:istore          4
		if((i | j | k | l) < 0)
	//*  12   21:iload_1         
	//*  13   22:iload_2         
	//*  14   23:ior             
	//*  15   24:iload_3         
	//*  16   25:ior             
	//*  17   26:iload           4
	//*  18   28:ior             
	//*  19   29:ifge            40
			throw new EOFException();
	//   20   32:new             #114 <Class EOFException>
	//   21   35:dup             
	//   22   36:invokespecial   #115 <Method void EOFException()>
	//   23   39:athrow          
		else
			return (l << 24) + (k << 16) + (j << 8) + (i << 0);
	//   24   40:iload           4
	//   25   42:bipush          24
	//   26   44:ishl            
	//   27   45:iload_3         
	//   28   46:bipush          16
	//   29   48:ishl            
	//   30   49:iadd            
	//   31   50:iload_2         
	//   32   51:bipush          8
	//   33   53:ishl            
	//   34   54:iadd            
	//   35   55:iload_1         
	//   36   56:iconst_0        
	//   37   57:ishl            
	//   38   58:iadd            
	//   39   59:ireturn         
	}

	public String readLine()
		throws IOException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #158 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #159 <Method void StringBuilder()>
	//    3    7:astore          7
		int i = -1;
	//    4    9:iconst_m1       
	//    5   10:istore_2        
		boolean flag = false;
	//    6   11:iconst_0        
	//    7   12:istore_1        
		do
		{
			if(flag)
				break;
	//    8   13:iload_1         
	//    9   14:ifne            113
			int j = read();
	//   10   17:aload_0         
	//   11   18:invokevirtual   #112 <Method int read()>
	//   12   21:istore_3        
			switch(j)
	//*  13   22:iload_3         
			{
	//*  14   23:lookupswitch    3: default 56
	//	               -1: 69
	//	               10: 69
	//	               13: 76
			default:
				stringbuilder.append((char)j);
	//   15   56:aload           7
	//   16   58:iload_3         
	//   17   59:int2char        
	//   18   60:invokevirtual   #163 <Method StringBuilder StringBuilder.append(char)>
	//   19   63:pop             
				i = j;
	//   20   64:iload_3         
	//   21   65:istore_2        
				break;

	//*  22   66:goto            13
			case -1: 
			case 10: // '\n'
				flag = true;
	//   23   69:iconst_1        
	//   24   70:istore_1        
				i = j;
	//   25   71:iload_3         
	//   26   72:istore_2        
				break;

	//*  27   73:goto            13
			case 13: // '\r'
				boolean flag1 = true;
	//   28   76:iconst_1        
	//   29   77:istore          4
				long l = getFilePointer();
	//   30   79:aload_0         
	//   31   80:invokevirtual   #165 <Method long getFilePointer()>
	//   32   83:lstore          5
				i = j;
	//   33   85:iload_3         
	//   34   86:istore_2        
				flag = flag1;
	//   35   87:iload           4
	//   36   89:istore_1        
				if(read() != 10)
	//*  37   90:aload_0         
	//*  38   91:invokevirtual   #112 <Method int read()>
	//*  39   94:bipush          10
	//*  40   96:icmpeq          13
				{
					seek(l);
	//   41   99:aload_0         
	//   42  100:lload           5
	//   43  102:invokevirtual   #95  <Method void seek(long)>
					i = j;
	//   44  105:iload_3         
	//   45  106:istore_2        
					flag = flag1;
	//   46  107:iload           4
	//   47  109:istore_1        
				}
				break;
			}
		} while(true);
	//   48  110:goto            13
		if(i == -1 && stringbuilder.length() == 0)
	//*  49  113:iload_2         
	//*  50  114:iconst_m1       
	//*  51  115:icmpne          128
	//*  52  118:aload           7
	//*  53  120:invokevirtual   #167 <Method int StringBuilder.length()>
	//*  54  123:ifne            128
			return null;
	//   55  126:aconst_null     
	//   56  127:areturn         
		else
			return stringbuilder.toString();
	//   57  128:aload           7
	//   58  130:invokevirtual   #170 <Method String StringBuilder.toString()>
	//   59  133:areturn         
	}

	public long readLong()
		throws IOException
	{
		return ((long)readInt() << 32) + ((long)readInt() & 0xffffffffL);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method int readInt()>
	//    2    4:i2l             
	//    3    5:bipush          32
	//    4    7:lshl            
	//    5    8:aload_0         
	//    6    9:invokevirtual   #140 <Method int readInt()>
	//    7   12:i2l             
	//    8   13:ldc2w           #171 <Long 0xffffffffL>
	//    9   16:land            
	//   10   17:ladd            
	//   11   18:lreturn         
	}

	public final long readLongLE()
		throws IOException
	{
		int i = readIntLE();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method int readIntLE()>
	//    2    4:istore_1        
		return ((long)readIntLE() << 32) + ((long)i & 0xffffffffL);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #150 <Method int readIntLE()>
	//    5    9:i2l             
	//    6   10:bipush          32
	//    7   12:lshl            
	//    8   13:iload_1         
	//    9   14:i2l             
	//   10   15:ldc2w           #171 <Long 0xffffffffL>
	//   11   18:land            
	//   12   19:ladd            
	//   13   20:lreturn         
	}

	public short readShort()
		throws IOException
	{
		int i = read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method int read()>
	//    2    4:istore_1        
		int j = read();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #112 <Method int read()>
	//    5    9:istore_2        
		if((i | j) < 0)
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:ior             
	//*   9   13:ifge            24
			throw new EOFException();
	//   10   16:new             #114 <Class EOFException>
	//   11   19:dup             
	//   12   20:invokespecial   #115 <Method void EOFException()>
	//   13   23:athrow          
		else
			return (short)((i << 8) + j);
	//   14   24:iload_1         
	//   15   25:bipush          8
	//   16   27:ishl            
	//   17   28:iload_2         
	//   18   29:iadd            
	//   19   30:int2short       
	//   20   31:ireturn         
	}

	public final short readShortLE()
		throws IOException
	{
		int i = read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method int read()>
	//    2    4:istore_1        
		int j = read();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #112 <Method int read()>
	//    5    9:istore_2        
		if((i | j) < 0)
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:ior             
	//*   9   13:ifge            24
			throw new EOFException();
	//   10   16:new             #114 <Class EOFException>
	//   11   19:dup             
	//   12   20:invokespecial   #115 <Method void EOFException()>
	//   13   23:athrow          
		else
			return (short)((j << 8) + (i << 0));
	//   14   24:iload_2         
	//   15   25:bipush          8
	//   16   27:ishl            
	//   17   28:iload_1         
	//   18   29:iconst_0        
	//   19   30:ishl            
	//   20   31:iadd            
	//   21   32:int2short       
	//   22   33:ireturn         
	}

	public String readString(int i, String s)
		throws IOException
	{
		byte abyte0[] = new byte[i];
	//    0    0:iload_1         
	//    1    1:newarray        byte[]
	//    2    3:astore_3        
		readFully(abyte0);
	//    3    4:aload_0         
	//    4    5:aload_3         
	//    5    6:invokevirtual   #181 <Method void readFully(byte[])>
		try
		{
			s = new String(abyte0, s);
	//    6    9:new             #183 <Class String>
	//    7   12:dup             
	//    8   13:aload_3         
	//    9   14:aload_2         
	//   10   15:invokespecial   #186 <Method void String(byte[], String)>
	//   11   18:astore_2        
		}
	//*  12   19:aload_2         
	//*  13   20:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  14   21:astore_2        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//   15   22:new             #188 <Class ExceptionConverter>
	//   16   25:dup             
	//   17   26:aload_2         
	//   18   27:invokespecial   #191 <Method void ExceptionConverter(Exception)>
	//   19   30:athrow          
		}
		return s;
	}

	public String readUTF()
		throws IOException
	{
		return DataInputStream.readUTF(((DataInput) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #197 <Method String DataInputStream.readUTF(DataInput)>
	//    2    4:areturn         
	}

	public int readUnsignedByte()
		throws IOException
	{
		int i = read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method int read()>
	//    2    4:istore_1        
		if(i < 0)
	//*   3    5:iload_1         
	//*   4    6:ifge            17
			throw new EOFException();
	//    5    9:new             #114 <Class EOFException>
	//    6   12:dup             
	//    7   13:invokespecial   #115 <Method void EOFException()>
	//    8   16:athrow          
		else
			return i;
	//    9   17:iload_1         
	//   10   18:ireturn         
	}

	public final long readUnsignedInt()
		throws IOException
	{
		long l = read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method int read()>
	//    2    4:i2l             
	//    3    5:lstore_1        
		long l1 = read();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #112 <Method int read()>
	//    6   10:i2l             
	//    7   11:lstore_3        
		long l2 = read();
	//    8   12:aload_0         
	//    9   13:invokevirtual   #112 <Method int read()>
	//   10   16:i2l             
	//   11   17:lstore          5
		long l3 = read();
	//   12   19:aload_0         
	//   13   20:invokevirtual   #112 <Method int read()>
	//   14   23:i2l             
	//   15   24:lstore          7
		if((l | l1 | l2 | l3) < 0L)
	//*  16   26:lload_1         
	//*  17   27:lload_3         
	//*  18   28:lor             
	//*  19   29:lload           5
	//*  20   31:lor             
	//*  21   32:lload           7
	//*  22   34:lor             
	//*  23   35:lconst_0        
	//*  24   36:lcmp            
	//*  25   37:ifge            48
			throw new EOFException();
	//   26   40:new             #114 <Class EOFException>
	//   27   43:dup             
	//   28   44:invokespecial   #115 <Method void EOFException()>
	//   29   47:athrow          
		else
			return (l << 24) + (l1 << 16) + (l2 << 8) + (l3 << 0);
	//   30   48:lload_1         
	//   31   49:bipush          24
	//   32   51:lshl            
	//   33   52:lload_3         
	//   34   53:bipush          16
	//   35   55:lshl            
	//   36   56:ladd            
	//   37   57:lload           5
	//   38   59:bipush          8
	//   39   61:lshl            
	//   40   62:ladd            
	//   41   63:lload           7
	//   42   65:iconst_0        
	//   43   66:lshl            
	//   44   67:ladd            
	//   45   68:lreturn         
	}

	public final long readUnsignedIntLE()
		throws IOException
	{
		long l = read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method int read()>
	//    2    4:i2l             
	//    3    5:lstore_1        
		long l1 = read();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #112 <Method int read()>
	//    6   10:i2l             
	//    7   11:lstore_3        
		long l2 = read();
	//    8   12:aload_0         
	//    9   13:invokevirtual   #112 <Method int read()>
	//   10   16:i2l             
	//   11   17:lstore          5
		long l3 = read();
	//   12   19:aload_0         
	//   13   20:invokevirtual   #112 <Method int read()>
	//   14   23:i2l             
	//   15   24:lstore          7
		if((l | l1 | l2 | l3) < 0L)
	//*  16   26:lload_1         
	//*  17   27:lload_3         
	//*  18   28:lor             
	//*  19   29:lload           5
	//*  20   31:lor             
	//*  21   32:lload           7
	//*  22   34:lor             
	//*  23   35:lconst_0        
	//*  24   36:lcmp            
	//*  25   37:ifge            48
			throw new EOFException();
	//   26   40:new             #114 <Class EOFException>
	//   27   43:dup             
	//   28   44:invokespecial   #115 <Method void EOFException()>
	//   29   47:athrow          
		else
			return (l3 << 24) + (l2 << 16) + (l1 << 8) + (l << 0);
	//   30   48:lload           7
	//   31   50:bipush          24
	//   32   52:lshl            
	//   33   53:lload           5
	//   34   55:bipush          16
	//   35   57:lshl            
	//   36   58:ladd            
	//   37   59:lload_3         
	//   38   60:bipush          8
	//   39   62:lshl            
	//   40   63:ladd            
	//   41   64:lload_1         
	//   42   65:iconst_0        
	//   43   66:lshl            
	//   44   67:ladd            
	//   45   68:lreturn         
	}

	public int readUnsignedShort()
		throws IOException
	{
		int i = read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method int read()>
	//    2    4:istore_1        
		int j = read();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #112 <Method int read()>
	//    5    9:istore_2        
		if((i | j) < 0)
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:ior             
	//*   9   13:ifge            24
			throw new EOFException();
	//   10   16:new             #114 <Class EOFException>
	//   11   19:dup             
	//   12   20:invokespecial   #115 <Method void EOFException()>
	//   13   23:athrow          
		else
			return (i << 8) + j;
	//   14   24:iload_1         
	//   15   25:bipush          8
	//   16   27:ishl            
	//   17   28:iload_2         
	//   18   29:iadd            
	//   19   30:ireturn         
	}

	public final int readUnsignedShortLE()
		throws IOException
	{
		int i = read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method int read()>
	//    2    4:istore_1        
		int j = read();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #112 <Method int read()>
	//    5    9:istore_2        
		if((i | j) < 0)
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:ior             
	//*   9   13:ifge            24
			throw new EOFException();
	//   10   16:new             #114 <Class EOFException>
	//   11   19:dup             
	//   12   20:invokespecial   #115 <Method void EOFException()>
	//   13   23:athrow          
		else
			return (j << 8) + (i << 0);
	//   14   24:iload_2         
	//   15   25:bipush          8
	//   16   27:ishl            
	//   17   28:iload_1         
	//   18   29:iconst_0        
	//   19   30:ishl            
	//   20   31:iadd            
	//   21   32:ireturn         
	}

	public void seek(long l)
		throws IOException
	{
		byteSourcePosition = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #83  <Field long byteSourcePosition>
		isBack = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #21  <Field boolean isBack>
	//    6   10:return          
	}

	public long skip(long l)
		throws IOException
	{
		if(l <= 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifgt            8
			return 0L;
	//    4    6:lconst_0        
	//    5    7:lreturn         
		int i = 0;
	//    6    8:iconst_0        
	//    7    9:istore_3        
		long l1 = l;
	//    8   10:lload_1         
	//    9   11:lstore          4
		if(isBack)
	//*  10   13:aload_0         
	//*  11   14:getfield        #21  <Field boolean isBack>
	//*  12   17:ifeq            40
		{
			isBack = false;
	//   13   20:aload_0         
	//   14   21:iconst_0        
	//   15   22:putfield        #21  <Field boolean isBack>
			if(l == 1L)
	//*  16   25:lload_1         
	//*  17   26:lconst_1        
	//*  18   27:lcmp            
	//*  19   28:ifne            33
				return 1L;
	//   20   31:lconst_1        
	//   21   32:lreturn         
			l1 = l - 1L;
	//   22   33:lload_1         
	//   23   34:lconst_1        
	//   24   35:lsub            
	//   25   36:lstore          4
			i = 1;
	//   26   38:iconst_1        
	//   27   39:istore_3        
		}
		long l3 = getFilePointer();
	//   28   40:aload_0         
	//   29   41:invokevirtual   #165 <Method long getFilePointer()>
	//   30   44:lstore          8
		long l2 = length();
	//   31   46:aload_0         
	//   32   47:invokevirtual   #205 <Method long length()>
	//   33   50:lstore          6
		l1 = l3 + l1;
	//   34   52:lload           8
	//   35   54:lload           4
	//   36   56:ladd            
	//   37   57:lstore          4
		l = l1;
	//   38   59:lload           4
	//   39   61:lstore_1        
		if(l1 > l2)
	//*  40   62:lload           4
	//*  41   64:lload           6
	//*  42   66:lcmp            
	//*  43   67:ifle            73
			l = l2;
	//   44   70:lload           6
	//   45   72:lstore_1        
		seek(l);
	//   46   73:aload_0         
	//   47   74:lload_1         
	//   48   75:invokevirtual   #95  <Method void seek(long)>
		return (l - l3) + (long)i;
	//   49   78:lload_1         
	//   50   79:lload           8
	//   51   81:lsub            
	//   52   82:iload_3         
	//   53   83:i2l             
	//   54   84:ladd            
	//   55   85:lreturn         
	}

	public int skipBytes(int i)
		throws IOException
	{
		return (int)skip(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:i2l             
	//    3    3:invokevirtual   #209 <Method long skip(long)>
	//    4    6:l2i             
	//    5    7:ireturn         
	}

	private byte back;
	private final RandomAccessSource byteSource;
	private long byteSourcePosition;
	private boolean isBack;
}
