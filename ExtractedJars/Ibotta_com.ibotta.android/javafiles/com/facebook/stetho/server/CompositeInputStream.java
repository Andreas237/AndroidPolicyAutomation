// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import com.facebook.stetho.common.LogUtil;
import java.io.IOException;
import java.io.InputStream;

public class CompositeInputStream extends InputStream
{

	public CompositeInputStream(InputStream ainputstream[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void InputStream()>
		if(ainputstream != null && ainputstream.length >= 2)
	//*   2    4:aload_1         
	//*   3    5:ifnull          25
	//*   4    8:aload_1         
	//*   5    9:arraylength     
	//*   6   10:iconst_2        
	//*   7   11:icmplt          25
		{
			mStreams = ainputstream;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #16  <Field InputStream[] mStreams>
			mCurrentIndex = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #18  <Field int mCurrentIndex>
			return;
	//   14   24:return          
		} else
		{
			throw new IllegalArgumentException("Streams must be non-null and have more than 1 entry");
	//   15   25:new             #20  <Class IllegalArgumentException>
	//   16   28:dup             
	//   17   29:ldc1            #22  <String "Streams must be non-null and have more than 1 entry">
	//   18   31:invokespecial   #25  <Method void IllegalArgumentException(String)>
	//   19   34:athrow          
		}
	}

	private void closeAll(int i)
		throws IOException
	{
		IOException ioexception = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		int j = 0;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		do
		{
			InputStream ainputstream[] = mStreams;
	//    4    4:aload_0         
	//    5    5:getfield        #16  <Field InputStream[] mStreams>
	//    6    8:astore          4
			if(j < ainputstream.length)
	//*   7   10:iload_2         
	//*   8   11:aload           4
	//*   9   13:arraylength     
	//*  10   14:icmpge          78
			{
				try
				{
					ainputstream[j].close();
	//   11   17:aload           4
	//   12   19:iload_2         
	//   13   20:aaload          
	//   14   21:invokevirtual   #33  <Method void InputStream.close()>
				}
	//*  15   24:goto            71
				catch(IOException ioexception2)
	//*  16   27:astore          5
				{
					IOException ioexception1 = ioexception2;
	//   17   29:aload           5
	//   18   31:astore          4
					if(j != i)
	//*  19   33:iload_2         
	//*  20   34:iload_1         
	//*  21   35:icmpeq          52
						if(ioexception == null)
	//*  22   38:aload_3         
	//*  23   39:ifnonnull       49
							ioexception1 = ioexception2;
	//   24   42:aload           5
	//   25   44:astore          4
						else
	//*  26   46:goto            52
							ioexception1 = ioexception;
	//   27   49:aload_3         
	//   28   50:astore          4
					if(ioexception != null && ioexception != ioexception1)
	//*  29   52:aload_3         
	//*  30   53:ifnull          68
	//*  31   56:aload_3         
	//*  32   57:aload           4
	//*  33   59:if_acmpeq       68
						LogUtil.w(((Throwable) (ioexception)), "Suppressing exception");
	//   34   62:aload_3         
	//   35   63:ldc1            #35  <String "Suppressing exception">
	//   36   65:invokestatic    #41  <Method void LogUtil.w(Throwable, String)>
					ioexception = ioexception1;
	//   37   68:aload           4
	//   38   70:astore_3        
				}
				j++;
	//   39   71:iload_2         
	//   40   72:iconst_1        
	//   41   73:iadd            
	//   42   74:istore_2        
			} else
	//*  43   75:goto            4
			{
				return;
	//   44   78:return          
			}
		} while(true);
	}

	private boolean tryMoveToNextStream()
	{
		int i = mCurrentIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int mCurrentIndex>
	//    2    4:istore_1        
		if(i + 1 < mStreams.length)
	//*   3    5:iload_1         
	//*   4    6:iconst_1        
	//*   5    7:iadd            
	//*   6    8:aload_0         
	//*   7    9:getfield        #16  <Field InputStream[] mStreams>
	//*   8   12:arraylength     
	//*   9   13:icmpge          25
		{
			mCurrentIndex = i + 1;
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:iconst_1        
	//   13   19:iadd            
	//   14   20:putfield        #18  <Field int mCurrentIndex>
			return true;
	//   15   23:iconst_1        
	//   16   24:ireturn         
		} else
		{
			return false;
	//   17   25:iconst_0        
	//   18   26:ireturn         
		}
	}

	public int available()
		throws IOException
	{
		return mStreams[mCurrentIndex].available();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field InputStream[] mStreams>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field int mCurrentIndex>
	//    4    8:aaload          
	//    5    9:invokevirtual   #48  <Method int InputStream.available()>
	//    6   12:ireturn         
	}

	public void close()
		throws IOException
	{
		closeAll(mCurrentIndex);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field int mCurrentIndex>
	//    3    5:invokespecial   #50  <Method void closeAll(int)>
	//    4    8:return          
	}

	public void mark(int i)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #53  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public boolean markSupported()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int read()
		throws IOException
	{
		int i;
		do
			i = mStreams[mCurrentIndex].read();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field InputStream[] mStreams>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field int mCurrentIndex>
	//    4    8:aaload          
	//    5    9:invokevirtual   #58  <Method int InputStream.read()>
	//    6   12:istore_1        
		while(i == -1 && tryMoveToNextStream());
	//    7   13:iload_1         
	//    8   14:iconst_m1       
	//    9   15:icmpne          25
	//   10   18:aload_0         
	//   11   19:invokespecial   #60  <Method boolean tryMoveToNextStream()>
	//   12   22:ifne            0
		return i;
	//   13   25:iload_1         
	//   14   26:ireturn         
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
	//    5    5:invokevirtual   #64  <Method int read(byte[], int, int)>
	//    6    8:ireturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		int k;
		do
			k = mStreams[mCurrentIndex].read(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field InputStream[] mStreams>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field int mCurrentIndex>
	//    4    8:aaload          
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:iload_3         
	//    8   12:invokevirtual   #65  <Method int InputStream.read(byte[], int, int)>
	//    9   15:istore          4
		while(k == -1 && tryMoveToNextStream());
	//   10   17:iload           4
	//   11   19:iconst_m1       
	//   12   20:icmpne          30
	//   13   23:aload_0         
	//   14   24:invokespecial   #60  <Method boolean tryMoveToNextStream()>
	//   15   27:ifne            0
		return k;
	//   16   30:iload           4
	//   17   32:ireturn         
	}

	public void reset()
		throws IOException
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #53  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public long skip(long l)
		throws IOException
	{
		int i = read(new byte[(int)l]);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:l2i             
	//    3    3:newarray        byte[]
	//    4    5:invokevirtual   #70  <Method int read(byte[])>
	//    5    8:istore_3        
		if(i >= 0)
	//*   6    9:iload_3         
	//*   7   10:iflt            16
			return (long)i;
	//    8   13:iload_3         
	//    9   14:i2l             
	//   10   15:lreturn         
		else
			return -1L;
	//   11   16:ldc2w           #71  <Long -1L>
	//   12   19:lreturn         
	}

	private int mCurrentIndex;
	private final InputStream mStreams[];
}
