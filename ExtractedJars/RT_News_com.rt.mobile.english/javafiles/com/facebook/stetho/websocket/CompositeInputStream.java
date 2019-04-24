// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.websocket;

import com.facebook.stetho.common.LogUtil;
import java.io.IOException;
import java.io.InputStream;

class CompositeInputStream extends InputStream
{

	public CompositeInputStream(InputStream ainputstream[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void InputStream()>
		if(ainputstream != null && ainputstream.length >= 2)
	//*   2    4:aload_1         
	//*   3    5:ifnull          28
	//*   4    8:aload_1         
	//*   5    9:arraylength     
	//*   6   10:iconst_2        
	//*   7   11:icmpge          17
	//*   8   14:goto            28
		{
			mStreams = ainputstream;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #16  <Field InputStream[] mStreams>
			mCurrentIndex = 0;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #18  <Field int mCurrentIndex>
			return;
	//   15   27:return          
		} else
		{
			throw new IllegalArgumentException("Streams must be non-null and have more than 1 entry");
	//   16   28:new             #20  <Class IllegalArgumentException>
	//   17   31:dup             
	//   18   32:ldc1            #22  <String "Streams must be non-null and have more than 1 entry">
	//   19   34:invokespecial   #25  <Method void IllegalArgumentException(String)>
	//   20   37:athrow          
		}
	}

	private void closeAll(int i)
		throws IOException
	{
		IOException ioexception = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		for(int j = 0; j < mStreams.length;)
	//*   2    2:iconst_0        
	//*   3    3:istore_2        
	//*   4    4:iload_2         
	//*   5    5:aload_0         
	//*   6    6:getfield        #16  <Field InputStream[] mStreams>
	//*   7    9:arraylength     
	//*   8   10:icmpge          76
			try
			{
				mStreams[j].close();
	//    9   13:aload_0         
	//   10   14:getfield        #16  <Field InputStream[] mStreams>
	//   11   17:iload_2         
	//   12   18:aaload          
	//   13   19:invokevirtual   #33  <Method void InputStream.close()>
				continue;
	//   14   22:goto            69
			}
			catch(IOException ioexception2)
	//*  15   25:astore          5
			{
				IOException ioexception1 = ioexception2;
	//   16   27:aload           5
	//   17   29:astore          4
				if(j != i)
	//*  18   31:iload_2         
	//*  19   32:iload_1         
	//*  20   33:icmpeq          50
					if(ioexception == null)
	//*  21   36:aload_3         
	//*  22   37:ifnonnull       47
						ioexception1 = ioexception2;
	//   23   40:aload           5
	//   24   42:astore          4
					else
	//*  25   44:goto            50
						ioexception1 = ioexception;
	//   26   47:aload_3         
	//   27   48:astore          4
				if(ioexception != null && ioexception != ioexception1)
	//*  28   50:aload_3         
	//*  29   51:ifnull          66
	//*  30   54:aload_3         
	//*  31   55:aload           4
	//*  32   57:if_acmpeq       66
					LogUtil.w(((Throwable) (ioexception)), "Suppressing exception");
	//   33   60:aload_3         
	//   34   61:ldc1            #35  <String "Suppressing exception">
	//   35   63:invokestatic    #41  <Method void LogUtil.w(Throwable, String)>
				ioexception = ioexception1;
	//   36   66:aload           4
	//   37   68:astore_3        
				j++;
	//   38   69:iload_2         
	//   39   70:iconst_1        
	//   40   71:iadd            
	//   41   72:istore_2        
			}

	//*  42   73:goto            4
	//   43   76:return          
	}

	private boolean tryMoveToNextStream()
	{
		if(mCurrentIndex + 1 < mStreams.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field int mCurrentIndex>
	//*   2    4:iconst_1        
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #16  <Field InputStream[] mStreams>
	//*   6   10:arraylength     
	//*   7   11:icmpge          26
		{
			mCurrentIndex = mCurrentIndex + 1;
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #18  <Field int mCurrentIndex>
	//   11   19:iconst_1        
	//   12   20:iadd            
	//   13   21:putfield        #18  <Field int mCurrentIndex>
			return true;
	//   14   24:iconst_1        
	//   15   25:ireturn         
		} else
		{
			return false;
	//   16   26:iconst_0        
	//   17   27:ireturn         
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
