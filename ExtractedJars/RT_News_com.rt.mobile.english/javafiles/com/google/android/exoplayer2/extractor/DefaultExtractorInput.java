// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.extractor:
//			ExtractorInput

public final class DefaultExtractorInput
	implements ExtractorInput
{

	public DefaultExtractorInput(DataSource datasource, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		dataSource = datasource;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field DataSource dataSource>
		position = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #32  <Field long position>
		streamLength = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #34  <Field long streamLength>
		peekBuffer = new byte[0x10000];
	//   11   20:aload_0         
	//   12   21:ldc1            #11  <Int 0x10000>
	//   13   23:newarray        byte[]
	//   14   25:putfield        #36  <Field byte[] peekBuffer>
	//   15   28:aload_0         
	//   16   29:sipush          4096
	//   17   32:newarray        byte[]
	//   18   34:putfield        #38  <Field byte[] scratchSpace>
	//   19   37:return          
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
	//    5    7:getfield        #32  <Field long position>
	//    6   10:iload_1         
	//    7   11:i2l             
	//    8   12:ladd            
	//    9   13:putfield        #32  <Field long position>
	//   10   16:return          
	}

	private void ensureSpaceForPeek(int i)
	{
		i = peekBufferPosition + i;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int peekBufferPosition>
	//    2    4:iload_1         
	//    3    5:iadd            
	//    4    6:istore_1        
		if(i > peekBuffer.length)
	//*   5    7:iload_1         
	//*   6    8:aload_0         
	//*   7    9:getfield        #36  <Field byte[] peekBuffer>
	//*   8   12:arraylength     
	//*   9   13:icmple          47
		{
			i = Util.constrainValue(peekBuffer.length * 2, 0x10000 + i, i + 0x80000);
	//   10   16:aload_0         
	//   11   17:getfield        #36  <Field byte[] peekBuffer>
	//   12   20:arraylength     
	//   13   21:iconst_2        
	//   14   22:imul            
	//   15   23:ldc1            #11  <Int 0x10000>
	//   16   25:iload_1         
	//   17   26:iadd            
	//   18   27:iload_1         
	//   19   28:ldc1            #9   <Int 0x80000>
	//   20   30:iadd            
	//   21   31:invokestatic    #50  <Method int Util.constrainValue(int, int, int)>
	//   22   34:istore_1        
			peekBuffer = Arrays.copyOf(peekBuffer, i);
	//   23   35:aload_0         
	//   24   36:aload_0         
	//   25   37:getfield        #36  <Field byte[] peekBuffer>
	//   26   40:iload_1         
	//   27   41:invokestatic    #56  <Method byte[] Arrays.copyOf(byte[], int)>
	//   28   44:putfield        #36  <Field byte[] peekBuffer>
		}
	//   29   47:return          
	}

	private int readFromDataSource(byte abyte0[], int i, int j, int k, boolean flag)
		throws InterruptedException, IOException
	{
		if(Thread.interrupted())
	//*   0    0:invokestatic    #68  <Method boolean Thread.interrupted()>
	//*   1    3:ifeq            14
			throw new InterruptedException();
	//    2    6:new             #60  <Class InterruptedException>
	//    3    9:dup             
	//    4   10:invokespecial   #69  <Method void InterruptedException()>
	//    5   13:athrow          
		i = dataSource.read(abyte0, i + k, j - k);
	//    6   14:aload_0         
	//    7   15:getfield        #30  <Field DataSource dataSource>
	//    8   18:aload_1         
	//    9   19:iload_2         
	//   10   20:iload           4
	//   11   22:iadd            
	//   12   23:iload_3         
	//   13   24:iload           4
	//   14   26:isub            
	//   15   27:invokeinterface #75  <Method int DataSource.read(byte[], int, int)>
	//   16   32:istore_2        
		if(i == -1)
	//*  17   33:iload_2         
	//*  18   34:iconst_m1       
	//*  19   35:icmpne          58
		{
			if(k == 0 && flag)
	//*  20   38:iload           4
	//*  21   40:ifne            50
	//*  22   43:iload           5
	//*  23   45:ifeq            50
				return -1;
	//   24   48:iconst_m1       
	//   25   49:ireturn         
			else
				throw new EOFException();
	//   26   50:new             #77  <Class EOFException>
	//   27   53:dup             
	//   28   54:invokespecial   #78  <Method void EOFException()>
	//   29   57:athrow          
		} else
		{
			return k + i;
	//   30   58:iload           4
	//   31   60:iload_2         
	//   32   61:iadd            
	//   33   62:ireturn         
		}
	}

	private int readFromPeekBuffer(byte abyte0[], int i, int j)
	{
		if(peekBufferLength == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field int peekBufferLength>
	//*   2    4:ifne            9
		{
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			j = Math.min(peekBufferLength, j);
	//    5    9:aload_0         
	//    6   10:getfield        #82  <Field int peekBufferLength>
	//    7   13:iload_3         
	//    8   14:invokestatic    #88  <Method int Math.min(int, int)>
	//    9   17:istore_3        
			System.arraycopy(((Object) (peekBuffer)), 0, ((Object) (abyte0)), i, j);
	//   10   18:aload_0         
	//   11   19:getfield        #36  <Field byte[] peekBuffer>
	//   12   22:iconst_0        
	//   13   23:aload_1         
	//   14   24:iload_2         
	//   15   25:iload_3         
	//   16   26:invokestatic    #94  <Method void System.arraycopy(Object, int, Object, int, int)>
			updatePeekBuffer(j);
	//   17   29:aload_0         
	//   18   30:iload_3         
	//   19   31:invokespecial   #97  <Method void updatePeekBuffer(int)>
			return j;
	//   20   34:iload_3         
	//   21   35:ireturn         
		}
	}

	private int skipFromPeekBuffer(int i)
	{
		i = Math.min(peekBufferLength, i);
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field int peekBufferLength>
	//    2    4:iload_1         
	//    3    5:invokestatic    #88  <Method int Math.min(int, int)>
	//    4    8:istore_1        
		updatePeekBuffer(i);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokespecial   #97  <Method void updatePeekBuffer(int)>
		return i;
	//    8   14:iload_1         
	//    9   15:ireturn         
	}

	private void updatePeekBuffer(int i)
	{
		peekBufferLength = peekBufferLength - i;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #82  <Field int peekBufferLength>
	//    3    5:iload_1         
	//    4    6:isub            
	//    5    7:putfield        #82  <Field int peekBufferLength>
		peekBufferPosition = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #44  <Field int peekBufferPosition>
		byte abyte0[] = peekBuffer;
	//    9   15:aload_0         
	//   10   16:getfield        #36  <Field byte[] peekBuffer>
	//   11   19:astore_2        
		if(peekBufferLength < peekBuffer.length - 0x80000)
	//*  12   20:aload_0         
	//*  13   21:getfield        #82  <Field int peekBufferLength>
	//*  14   24:aload_0         
	//*  15   25:getfield        #36  <Field byte[] peekBuffer>
	//*  16   28:arraylength     
	//*  17   29:ldc1            #9   <Int 0x80000>
	//*  18   31:isub            
	//*  19   32:icmpge          45
			abyte0 = new byte[peekBufferLength + 0x10000];
	//   20   35:aload_0         
	//   21   36:getfield        #82  <Field int peekBufferLength>
	//   22   39:ldc1            #11  <Int 0x10000>
	//   23   41:iadd            
	//   24   42:newarray        byte[]
	//   25   44:astore_2        
		System.arraycopy(((Object) (peekBuffer)), i, ((Object) (abyte0)), 0, peekBufferLength);
	//   26   45:aload_0         
	//   27   46:getfield        #36  <Field byte[] peekBuffer>
	//   28   49:iload_1         
	//   29   50:aload_2         
	//   30   51:iconst_0        
	//   31   52:aload_0         
	//   32   53:getfield        #82  <Field int peekBufferLength>
	//   33   56:invokestatic    #94  <Method void System.arraycopy(Object, int, Object, int, int)>
		peekBuffer = abyte0;
	//   34   59:aload_0         
	//   35   60:aload_2         
	//   36   61:putfield        #36  <Field byte[] peekBuffer>
	//   37   64:return          
	}

	public void advancePeekPosition(int i)
		throws IOException, InterruptedException
	{
		advancePeekPosition(i, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #103 <Method boolean advancePeekPosition(int, boolean)>
	//    4    6:pop             
	//    5    7:return          
	}

	public boolean advancePeekPosition(int i, boolean flag)
		throws IOException, InterruptedException
	{
		ensureSpaceForPeek(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #105 <Method void ensureSpaceForPeek(int)>
		for(int j = Math.min(peekBufferLength - peekBufferPosition, i); j < i;)
	//*   3    5:aload_0         
	//*   4    6:getfield        #82  <Field int peekBufferLength>
	//*   5    9:aload_0         
	//*   6   10:getfield        #44  <Field int peekBufferPosition>
	//*   7   13:isub            
	//*   8   14:iload_1         
	//*   9   15:invokestatic    #88  <Method int Math.min(int, int)>
	//*  10   18:istore_3        
	//*  11   19:iload_3         
	//*  12   20:iload_1         
	//*  13   21:icmpge          52
		{
			int k = readFromDataSource(peekBuffer, peekBufferPosition, i, j, flag);
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #36  <Field byte[] peekBuffer>
	//   17   29:aload_0         
	//   18   30:getfield        #44  <Field int peekBufferPosition>
	//   19   33:iload_1         
	//   20   34:iload_3         
	//   21   35:iload_2         
	//   22   36:invokespecial   #107 <Method int readFromDataSource(byte[], int, int, int, boolean)>
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
	//   33   54:getfield        #44  <Field int peekBufferPosition>
	//   34   57:iload_1         
	//   35   58:iadd            
	//   36   59:putfield        #44  <Field int peekBufferPosition>
		peekBufferLength = Math.max(peekBufferLength, peekBufferPosition);
	//   37   62:aload_0         
	//   38   63:aload_0         
	//   39   64:getfield        #82  <Field int peekBufferLength>
	//   40   67:aload_0         
	//   41   68:getfield        #44  <Field int peekBufferPosition>
	//   42   71:invokestatic    #110 <Method int Math.max(int, int)>
	//   43   74:putfield        #82  <Field int peekBufferLength>
		return true;
	//   44   77:iconst_1        
	//   45   78:ireturn         
	}

	public long getLength()
	{
		return streamLength;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field long streamLength>
	//    2    4:lreturn         
	}

	public long getPeekPosition()
	{
		return position + (long)peekBufferPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field long position>
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field int peekBufferPosition>
	//    4    8:i2l             
	//    5    9:ladd            
	//    6   10:lreturn         
	}

	public long getPosition()
	{
		return position;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field long position>
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
	//    5    5:invokevirtual   #119 <Method boolean peekFully(byte[], int, int, boolean)>
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
	//*   3    4:invokevirtual   #103 <Method boolean advancePeekPosition(int, boolean)>
	//*   4    7:ifne            12
		{
			return false;
	//    5   10:iconst_0        
	//    6   11:ireturn         
		} else
		{
			System.arraycopy(((Object) (peekBuffer)), peekBufferPosition - j, ((Object) (abyte0)), i, j);
	//    7   12:aload_0         
	//    8   13:getfield        #36  <Field byte[] peekBuffer>
	//    9   16:aload_0         
	//   10   17:getfield        #44  <Field int peekBufferPosition>
	//   11   20:iload_3         
	//   12   21:isub            
	//   13   22:aload_1         
	//   14   23:iload_2         
	//   15   24:iload_3         
	//   16   25:invokestatic    #94  <Method void System.arraycopy(Object, int, Object, int, int)>
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
	//    4    4:invokespecial   #121 <Method int readFromPeekBuffer(byte[], int, int)>
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
	//   16   24:invokespecial   #107 <Method int readFromDataSource(byte[], int, int, int, boolean)>
	//   17   27:istore          4
		commitBytesRead(k);
	//   18   29:aload_0         
	//   19   30:iload           4
	//   20   32:invokespecial   #123 <Method void commitBytesRead(int)>
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
	//    5    5:invokevirtual   #126 <Method boolean readFully(byte[], int, int, boolean)>
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
	//    4    4:invokespecial   #121 <Method int readFromPeekBuffer(byte[], int, int)>
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
	//   18   29:invokespecial   #107 <Method int readFromDataSource(byte[], int, int, int, boolean)>
	//   19   32:istore          5
	//*  20   34:goto            9
		commitBytesRead(k);
	//   21   37:aload_0         
	//   22   38:iload           5
	//   23   40:invokespecial   #123 <Method void commitBytesRead(int)>
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
	//    2    2:putfield        #44  <Field int peekBufferPosition>
	//    3    5:return          
	}

	public void setRetryPosition(long l, Throwable throwable)
		throws Throwable
	{
		boolean flag;
		if(l >= 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:iflt            12
			flag = true;
	//    4    6:iconst_1        
	//    5    7:istore          4
		else
	//*   6    9:goto            15
			flag = false;
	//    7   12:iconst_0        
	//    8   13:istore          4
		Assertions.checkArgument(flag);
	//    9   15:iload           4
	//   10   17:invokestatic    #137 <Method void Assertions.checkArgument(boolean)>
		position = l;
	//   11   20:aload_0         
	//   12   21:lload_1         
	//   13   22:putfield        #32  <Field long position>
		throw throwable;
	//   14   25:aload_3         
	//   15   26:athrow          
	}

	public int skip(int i)
		throws IOException, InterruptedException
	{
		int k = skipFromPeekBuffer(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #142 <Method int skipFromPeekBuffer(int)>
	//    3    5:istore_3        
		int j = k;
	//    4    6:iload_3         
	//    5    7:istore_2        
		if(k == 0)
	//*   6    8:iload_3         
	//*   7    9:ifne            33
			j = readFromDataSource(scratchSpace, 0, Math.min(i, scratchSpace.length), 0, true);
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:getfield        #38  <Field byte[] scratchSpace>
	//   11   17:iconst_0        
	//   12   18:iload_1         
	//   13   19:aload_0         
	//   14   20:getfield        #38  <Field byte[] scratchSpace>
	//   15   23:arraylength     
	//   16   24:invokestatic    #88  <Method int Math.min(int, int)>
	//   17   27:iconst_0        
	//   18   28:iconst_1        
	//   19   29:invokespecial   #107 <Method int readFromDataSource(byte[], int, int, int, boolean)>
	//   20   32:istore_2        
		commitBytesRead(j);
	//   21   33:aload_0         
	//   22   34:iload_2         
	//   23   35:invokespecial   #123 <Method void commitBytesRead(int)>
		return j;
	//   24   38:iload_2         
	//   25   39:ireturn         
	}

	public void skipFully(int i)
		throws IOException, InterruptedException
	{
		skipFully(i, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #145 <Method boolean skipFully(int, boolean)>
	//    4    6:pop             
	//    5    7:return          
	}

	public boolean skipFully(int i, boolean flag)
		throws IOException, InterruptedException
	{
		int j;
		int k;
		for(j = skipFromPeekBuffer(i); j < i && j != -1; j = readFromDataSource(scratchSpace, -j, k, j, flag))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokespecial   #142 <Method int skipFromPeekBuffer(int)>
	//*   3    5:istore_3        
	//*   4    6:iload_3         
	//*   5    7:iload_1         
	//*   6    8:icmpge          47
	//*   7   11:iload_3         
	//*   8   12:iconst_m1       
	//*   9   13:icmpeq          47
			k = Math.min(i, scratchSpace.length + j);
	//   10   16:iload_1         
	//   11   17:aload_0         
	//   12   18:getfield        #38  <Field byte[] scratchSpace>
	//   13   21:arraylength     
	//   14   22:iload_3         
	//   15   23:iadd            
	//   16   24:invokestatic    #88  <Method int Math.min(int, int)>
	//   17   27:istore          4

	//   18   29:aload_0         
	//   19   30:aload_0         
	//   20   31:getfield        #38  <Field byte[] scratchSpace>
	//   21   34:iload_3         
	//   22   35:ineg            
	//   23   36:iload           4
	//   24   38:iload_3         
	//   25   39:iload_2         
	//   26   40:invokespecial   #107 <Method int readFromDataSource(byte[], int, int, int, boolean)>
	//   27   43:istore_3        
	//*  28   44:goto            6
		commitBytesRead(j);
	//   29   47:aload_0         
	//   30   48:iload_3         
	//   31   49:invokespecial   #123 <Method void commitBytesRead(int)>
		return j != -1;
	//   32   52:iload_3         
	//   33   53:iconst_m1       
	//   34   54:icmpeq          59
	//   35   57:iconst_1        
	//   36   58:ireturn         
	//   37   59:iconst_0        
	//   38   60:ireturn         
	}

	private static final int PEEK_MAX_FREE_SPACE = 0x80000;
	private static final int PEEK_MIN_FREE_SPACE_AFTER_RESIZE = 0x10000;
	private static final int SCRATCH_SPACE_SIZE = 4096;
	private final DataSource dataSource;
	private byte peekBuffer[];
	private int peekBufferLength;
	private int peekBufferPosition;
	private long position;
	private final byte scratchSpace[] = new byte[4096];
	private final long streamLength;
}
