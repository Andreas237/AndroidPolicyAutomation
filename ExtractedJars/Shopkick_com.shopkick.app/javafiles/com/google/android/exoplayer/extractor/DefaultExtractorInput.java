// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor;

import com.google.android.exoplayer.upstream.DataSource;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer.extractor:
//			ExtractorInput

public final class DefaultExtractorInput
	implements ExtractorInput
{

	public DefaultExtractorInput(DataSource datasource, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		dataSource = datasource;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field DataSource dataSource>
		position = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #30  <Field long position>
		streamLength = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #32  <Field long streamLength>
		peekBuffer = new byte[8192];
	//   11   20:aload_0         
	//   12   21:sipush          8192
	//   13   24:newarray        byte[]
	//   14   26:putfield        #34  <Field byte[] peekBuffer>
	//   15   29:return          
	}

	private void commitBytesRead(int i)
	{
		if(i != -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_m1       
	//*   2    2:icmpeq          16
			position = position + (long)i;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field long position>
	//    6   10:iload_1         
	//    7   11:i2l             
	//    8   12:ladd            
	//    9   13:putfield        #30  <Field long position>
	//   10   16:return          
	}

	private void ensureSpaceForPeek(int i)
	{
		i = peekBufferPosition + i;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int peekBufferPosition>
	//    2    4:iload_1         
	//    3    5:iadd            
	//    4    6:istore_1        
		byte abyte0[] = peekBuffer;
	//    5    7:aload_0         
	//    6    8:getfield        #34  <Field byte[] peekBuffer>
	//    7   11:astore_2        
		if(i > abyte0.length)
	//*   8   12:iload_1         
	//*   9   13:aload_2         
	//*  10   14:arraylength     
	//*  11   15:icmple          34
			peekBuffer = Arrays.copyOf(abyte0, Math.max(abyte0.length * 2, i));
	//   12   18:aload_0         
	//   13   19:aload_2         
	//   14   20:aload_2         
	//   15   21:arraylength     
	//   16   22:iconst_2        
	//   17   23:imul            
	//   18   24:iload_1         
	//   19   25:invokestatic    #45  <Method int Math.max(int, int)>
	//   20   28:invokestatic    #51  <Method byte[] Arrays.copyOf(byte[], int)>
	//   21   31:putfield        #34  <Field byte[] peekBuffer>
	//   22   34:return          
	}

	private int readFromDataSource(byte abyte0[], int i, int j, int k, boolean flag)
		throws InterruptedException, IOException
	{
		if(!Thread.interrupted())
	//*   0    0:invokestatic    #63  <Method boolean Thread.interrupted()>
	//*   1    3:ifne            55
		{
			i = dataSource.read(abyte0, i + k, j - k);
	//    2    6:aload_0         
	//    3    7:getfield        #28  <Field DataSource dataSource>
	//    4   10:aload_1         
	//    5   11:iload_2         
	//    6   12:iload           4
	//    7   14:iadd            
	//    8   15:iload_3         
	//    9   16:iload           4
	//   10   18:isub            
	//   11   19:invokeinterface #69  <Method int DataSource.read(byte[], int, int)>
	//   12   24:istore_2        
			if(i == -1)
	//*  13   25:iload_2         
	//*  14   26:iconst_m1       
	//*  15   27:icmpne          50
			{
				if(k == 0 && flag)
	//*  16   30:iload           4
	//*  17   32:ifne            42
	//*  18   35:iload           5
	//*  19   37:ifeq            42
					return -1;
	//   20   40:iconst_m1       
	//   21   41:ireturn         
				else
					throw new EOFException();
	//   22   42:new             #71  <Class EOFException>
	//   23   45:dup             
	//   24   46:invokespecial   #72  <Method void EOFException()>
	//   25   49:athrow          
			} else
			{
				return k + i;
	//   26   50:iload           4
	//   27   52:iload_2         
	//   28   53:iadd            
	//   29   54:ireturn         
			}
		} else
		{
			throw new InterruptedException();
	//   30   55:new             #55  <Class InterruptedException>
	//   31   58:dup             
	//   32   59:invokespecial   #73  <Method void InterruptedException()>
	//   33   62:athrow          
		}
	}

	private int readFromPeekBuffer(byte abyte0[], int i, int j)
	{
		int k = peekBufferLength;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int peekBufferLength>
	//    2    4:istore          4
		if(k == 0)
	//*   3    6:iload           4
	//*   4    8:ifne            13
		{
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		} else
		{
			j = Math.min(k, j);
	//    7   13:iload           4
	//    8   15:iload_3         
	//    9   16:invokestatic    #80  <Method int Math.min(int, int)>
	//   10   19:istore_3        
			System.arraycopy(((Object) (peekBuffer)), 0, ((Object) (abyte0)), i, j);
	//   11   20:aload_0         
	//   12   21:getfield        #34  <Field byte[] peekBuffer>
	//   13   24:iconst_0        
	//   14   25:aload_1         
	//   15   26:iload_2         
	//   16   27:iload_3         
	//   17   28:invokestatic    #86  <Method void System.arraycopy(Object, int, Object, int, int)>
			updatePeekBuffer(j);
	//   18   31:aload_0         
	//   19   32:iload_3         
	//   20   33:invokespecial   #89  <Method void updatePeekBuffer(int)>
			return j;
	//   21   36:iload_3         
	//   22   37:ireturn         
		}
	}

	private int skipFromPeekBuffer(int i)
	{
		i = Math.min(peekBufferLength, i);
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int peekBufferLength>
	//    2    4:iload_1         
	//    3    5:invokestatic    #80  <Method int Math.min(int, int)>
	//    4    8:istore_1        
		updatePeekBuffer(i);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokespecial   #89  <Method void updatePeekBuffer(int)>
		return i;
	//    8   14:iload_1         
	//    9   15:ireturn         
	}

	private void updatePeekBuffer(int i)
	{
		peekBufferLength = peekBufferLength - i;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #77  <Field int peekBufferLength>
	//    3    5:iload_1         
	//    4    6:isub            
	//    5    7:putfield        #77  <Field int peekBufferLength>
		peekBufferPosition = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #39  <Field int peekBufferPosition>
		byte abyte0[] = peekBuffer;
	//    9   15:aload_0         
	//   10   16:getfield        #34  <Field byte[] peekBuffer>
	//   11   19:astore_2        
		System.arraycopy(((Object) (abyte0)), i, ((Object) (abyte0)), 0, peekBufferLength);
	//   12   20:aload_2         
	//   13   21:iload_1         
	//   14   22:aload_2         
	//   15   23:iconst_0        
	//   16   24:aload_0         
	//   17   25:getfield        #77  <Field int peekBufferLength>
	//   18   28:invokestatic    #86  <Method void System.arraycopy(Object, int, Object, int, int)>
	//   19   31:return          
	}

	public void advancePeekPosition(int i)
		throws IOException, InterruptedException
	{
		advancePeekPosition(i, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #95  <Method boolean advancePeekPosition(int, boolean)>
	//    4    6:pop             
	//    5    7:return          
	}

	public boolean advancePeekPosition(int i, boolean flag)
		throws IOException, InterruptedException
	{
		ensureSpaceForPeek(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #97  <Method void ensureSpaceForPeek(int)>
		for(int j = Math.min(peekBufferLength - peekBufferPosition, i); j < i;)
	//*   3    5:aload_0         
	//*   4    6:getfield        #77  <Field int peekBufferLength>
	//*   5    9:aload_0         
	//*   6   10:getfield        #39  <Field int peekBufferPosition>
	//*   7   13:isub            
	//*   8   14:iload_1         
	//*   9   15:invokestatic    #80  <Method int Math.min(int, int)>
	//*  10   18:istore_3        
	//*  11   19:iload_3         
	//*  12   20:iload_1         
	//*  13   21:icmpge          52
		{
			int k = readFromDataSource(peekBuffer, peekBufferPosition, i, j, flag);
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #34  <Field byte[] peekBuffer>
	//   17   29:aload_0         
	//   18   30:getfield        #39  <Field int peekBufferPosition>
	//   19   33:iload_1         
	//   20   34:iload_3         
	//   21   35:iload_2         
	//   22   36:invokespecial   #99  <Method int readFromDataSource(byte[], int, int, int, boolean)>
	//   23   39:istore          4
			j = k;
	//   24   41:iload           4
	//   25   43:istore_3        
			if(k == -1)
	//*  26   44:iload           4
	//*  27   46:iconst_m1       
	//*  28   47:icmpne          19
				return false;
	//   29   50:iconst_0        
	//   30   51:ireturn         
		}

		peekBufferPosition = peekBufferPosition + i;
	//   31   52:aload_0         
	//   32   53:aload_0         
	//   33   54:getfield        #39  <Field int peekBufferPosition>
	//   34   57:iload_1         
	//   35   58:iadd            
	//   36   59:putfield        #39  <Field int peekBufferPosition>
		peekBufferLength = Math.max(peekBufferLength, peekBufferPosition);
	//   37   62:aload_0         
	//   38   63:aload_0         
	//   39   64:getfield        #77  <Field int peekBufferLength>
	//   40   67:aload_0         
	//   41   68:getfield        #39  <Field int peekBufferPosition>
	//   42   71:invokestatic    #45  <Method int Math.max(int, int)>
	//   43   74:putfield        #77  <Field int peekBufferLength>
		return true;
	//   44   77:iconst_1        
	//   45   78:ireturn         
	}

	public long getLength()
	{
		return streamLength;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field long streamLength>
	//    2    4:lreturn         
	}

	public long getPeekPosition()
	{
		return position + (long)peekBufferPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field long position>
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field int peekBufferPosition>
	//    4    8:i2l             
	//    5    9:ladd            
	//    6   10:lreturn         
	}

	public long getPosition()
	{
		return position;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field long position>
	//    2    4:lreturn         
	}

	public void peekFully(byte abyte0[], int i, int j)
		throws IOException, InterruptedException
	{
		peekFully(abyte0, i, j, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #108 <Method boolean peekFully(byte[], int, int, boolean)>
	//    6    8:pop             
	//    7    9:return          
	}

	public boolean peekFully(byte abyte0[], int i, int j, boolean flag)
		throws IOException, InterruptedException
	{
		if(!advancePeekPosition(j, flag))
	//*   0    0:aload_0         
	//*   1    1:iload_3         
	//*   2    2:iload           4
	//*   3    4:invokevirtual   #95  <Method boolean advancePeekPosition(int, boolean)>
	//*   4    7:ifne            12
		{
			return false;
	//    5   10:iconst_0        
	//    6   11:ireturn         
		} else
		{
			System.arraycopy(((Object) (peekBuffer)), peekBufferPosition - j, ((Object) (abyte0)), i, j);
	//    7   12:aload_0         
	//    8   13:getfield        #34  <Field byte[] peekBuffer>
	//    9   16:aload_0         
	//   10   17:getfield        #39  <Field int peekBufferPosition>
	//   11   20:iload_3         
	//   12   21:isub            
	//   13   22:aload_1         
	//   14   23:iload_2         
	//   15   24:iload_3         
	//   16   25:invokestatic    #86  <Method void System.arraycopy(Object, int, Object, int, int)>
			return true;
	//   17   28:iconst_1        
	//   18   29:ireturn         
		}
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException, InterruptedException
	{
		int l = readFromPeekBuffer(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #110 <Method int readFromPeekBuffer(byte[], int, int)>
	//    5    7:istore          5
		int k = l;
	//    6    9:iload           5
	//    7   11:istore          4
		if(l == 0)
	//*   8   13:iload           5
	//*   9   15:ifne            29
			k = readFromDataSource(abyte0, i, j, 0, true);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:iload_2         
	//   13   21:iload_3         
	//   14   22:iconst_0        
	//   15   23:iconst_1        
	//   16   24:invokespecial   #99  <Method int readFromDataSource(byte[], int, int, int, boolean)>
	//   17   27:istore          4
		commitBytesRead(k);
	//   18   29:aload_0         
	//   19   30:iload           4
	//   20   32:invokespecial   #112 <Method void commitBytesRead(int)>
		return k;
	//   21   35:iload           4
	//   22   37:ireturn         
	}

	public void readFully(byte abyte0[], int i, int j)
		throws IOException, InterruptedException
	{
		readFully(abyte0, i, j, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #115 <Method boolean readFully(byte[], int, int, boolean)>
	//    6    8:pop             
	//    7    9:return          
	}

	public boolean readFully(byte abyte0[], int i, int j, boolean flag)
		throws IOException, InterruptedException
	{
		int k;
		for(k = readFromPeekBuffer(abyte0, i, j); k < j && k != -1; k = readFromDataSource(abyte0, i, j, k, flag));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #110 <Method int readFromPeekBuffer(byte[], int, int)>
	//    5    7:istore          5
	//    6    9:iload           5
	//    7   11:iload_3         
	//    8   12:icmpge          37
	//    9   15:iload           5
	//   10   17:iconst_m1       
	//   11   18:icmpeq          37
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:iload_2         
	//   15   24:iload_3         
	//   16   25:iload           5
	//   17   27:iload           4
	//   18   29:invokespecial   #99  <Method int readFromDataSource(byte[], int, int, int, boolean)>
	//   19   32:istore          5
	//*  20   34:goto            9
		commitBytesRead(k);
	//   21   37:aload_0         
	//   22   38:iload           5
	//   23   40:invokespecial   #112 <Method void commitBytesRead(int)>
		return k != -1;
	//   24   43:iload           5
	//   25   45:iconst_m1       
	//   26   46:icmpeq          51
	//   27   49:iconst_1        
	//   28   50:ireturn         
	//   29   51:iconst_0        
	//   30   52:ireturn         
	}

	public void resetPeekPosition()
	{
		peekBufferPosition = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #39  <Field int peekBufferPosition>
	//    3    5:return          
	}

	public int skip(int i)
		throws IOException, InterruptedException
	{
		int k = skipFromPeekBuffer(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #119 <Method int skipFromPeekBuffer(int)>
	//    3    5:istore_3        
		int j = k;
	//    4    6:iload_3         
	//    5    7:istore_2        
		if(k == 0)
	//*   6    8:iload_3         
	//*   7    9:ifne            34
		{
			byte abyte0[] = SCRATCH_SPACE;
	//    8   12:getstatic       #21  <Field byte[] SCRATCH_SPACE>
	//    9   15:astore          4
			j = readFromDataSource(abyte0, 0, Math.min(i, abyte0.length), 0, true);
	//   10   17:aload_0         
	//   11   18:aload           4
	//   12   20:iconst_0        
	//   13   21:iload_1         
	//   14   22:aload           4
	//   15   24:arraylength     
	//   16   25:invokestatic    #80  <Method int Math.min(int, int)>
	//   17   28:iconst_0        
	//   18   29:iconst_1        
	//   19   30:invokespecial   #99  <Method int readFromDataSource(byte[], int, int, int, boolean)>
	//   20   33:istore_2        
		}
		commitBytesRead(j);
	//   21   34:aload_0         
	//   22   35:iload_2         
	//   23   36:invokespecial   #112 <Method void commitBytesRead(int)>
		return j;
	//   24   39:iload_2         
	//   25   40:ireturn         
	}

	public void skipFully(int i)
		throws IOException, InterruptedException
	{
		skipFully(i, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #122 <Method boolean skipFully(int, boolean)>
	//    4    6:pop             
	//    5    7:return          
	}

	public boolean skipFully(int i, boolean flag)
		throws IOException, InterruptedException
	{
		int j;
		byte abyte0[];
		for(j = skipFromPeekBuffer(i); j < i && j != -1; j = readFromDataSource(abyte0, -j, Math.min(i, abyte0.length + j), j, flag))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokespecial   #119 <Method int skipFromPeekBuffer(int)>
	//*   3    5:istore_3        
	//*   4    6:iload_3         
	//*   5    7:iload_1         
	//*   6    8:icmpge          44
	//*   7   11:iload_3         
	//*   8   12:iconst_m1       
	//*   9   13:icmpeq          44
			abyte0 = SCRATCH_SPACE;
	//   10   16:getstatic       #21  <Field byte[] SCRATCH_SPACE>
	//   11   19:astore          4

	//   12   21:aload_0         
	//   13   22:aload           4
	//   14   24:iload_3         
	//   15   25:ineg            
	//   16   26:iload_1         
	//   17   27:aload           4
	//   18   29:arraylength     
	//   19   30:iload_3         
	//   20   31:iadd            
	//   21   32:invokestatic    #80  <Method int Math.min(int, int)>
	//   22   35:iload_3         
	//   23   36:iload_2         
	//   24   37:invokespecial   #99  <Method int readFromDataSource(byte[], int, int, int, boolean)>
	//   25   40:istore_3        
	//*  26   41:goto            6
		commitBytesRead(j);
	//   27   44:aload_0         
	//   28   45:iload_3         
	//   29   46:invokespecial   #112 <Method void commitBytesRead(int)>
		return j != -1;
	//   30   49:iload_3         
	//   31   50:iconst_m1       
	//   32   51:icmpeq          56
	//   33   54:iconst_1        
	//   34   55:ireturn         
	//   35   56:iconst_0        
	//   36   57:ireturn         
	}

	private static final byte SCRATCH_SPACE[] = new byte[4096];
	private final DataSource dataSource;
	private byte peekBuffer[];
	private int peekBufferLength;
	private int peekBufferPosition;
	private long position;
	private final long streamLength;

	static 
	{
	//    0    0:sipush          4096
	//    1    3:newarray        byte[]
	//    2    5:putstatic       #21  <Field byte[] SCRATCH_SPACE>
	//*   3    8:return          
	}
}
