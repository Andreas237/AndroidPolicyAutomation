// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.fasterxml.jackson.core.io:
//			IOContext

public final class MergedStream extends InputStream
{

	public MergedStream(IOContext iocontext, InputStream inputstream, byte abyte0[], int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void InputStream()>
		_ctxt = iocontext;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field IOContext _ctxt>
		_in = inputstream;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field InputStream _in>
		_b = abyte0;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field byte[] _b>
		_ptr = i;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #26  <Field int _ptr>
		_end = j;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #28  <Field int _end>
	//   17   31:return          
	}

	private void _free()
	{
		byte abyte0[] = _b;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field byte[] _b>
	//    2    4:astore_1        
		if(abyte0 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          29
		{
			_b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #24  <Field byte[] _b>
			if(_ctxt != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #20  <Field IOContext _ctxt>
	//*  10   18:ifnull          29
				_ctxt.releaseReadIOBuffer(abyte0);
	//   11   21:aload_0         
	//   12   22:getfield        #20  <Field IOContext _ctxt>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #36  <Method void IOContext.releaseReadIOBuffer(byte[])>
		}
	//   15   29:return          
	}

	public int available()
		throws IOException
	{
		if(_b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field byte[] _b>
	//*   2    4:ifnull          17
			return _end - _ptr;
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field int _end>
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field int _ptr>
	//    7   15:isub            
	//    8   16:ireturn         
		else
			return _in.available();
	//    9   17:aload_0         
	//   10   18:getfield        #22  <Field InputStream _in>
	//   11   21:invokevirtual   #42  <Method int InputStream.available()>
	//   12   24:ireturn         
	}

	public void close()
		throws IOException
	{
		_free();
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void _free()>
		_in.close();
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field InputStream _in>
	//    4    8:invokevirtual   #48  <Method void InputStream.close()>
	//    5   11:return          
	}

	public void mark(int i)
	{
		if(_b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field byte[] _b>
	//*   2    4:ifnonnull       15
			_in.mark(i);
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field InputStream _in>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #52  <Method void InputStream.mark(int)>
	//    7   15:return          
	}

	public boolean markSupported()
	{
		return _b == null && _in.markSupported();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field byte[] _b>
	//    2    4:ifnonnull       19
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field InputStream _in>
	//    5   11:invokevirtual   #56  <Method boolean InputStream.markSupported()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public int read()
		throws IOException
	{
		if(_b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field byte[] _b>
	//*   2    4:ifnull          49
		{
			byte abyte0[] = _b;
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field byte[] _b>
	//    5   11:astore_2        
			int i = _ptr;
	//    6   12:aload_0         
	//    7   13:getfield        #26  <Field int _ptr>
	//    8   16:istore_1        
			_ptr = i + 1;
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:iconst_1        
	//   12   20:iadd            
	//   13   21:putfield        #26  <Field int _ptr>
			i = ((int) (abyte0[i]));
	//   14   24:aload_2         
	//   15   25:iload_1         
	//   16   26:baload          
	//   17   27:istore_1        
			if(_ptr >= _end)
	//*  18   28:aload_0         
	//*  19   29:getfield        #26  <Field int _ptr>
	//*  20   32:aload_0         
	//*  21   33:getfield        #28  <Field int _end>
	//*  22   36:icmplt          43
				_free();
	//   23   39:aload_0         
	//   24   40:invokespecial   #46  <Method void _free()>
			return i & 0xff;
	//   25   43:iload_1         
	//   26   44:sipush          255
	//   27   47:iand            
	//   28   48:ireturn         
		} else
		{
			return _in.read();
	//   29   49:aload_0         
	//   30   50:getfield        #22  <Field InputStream _in>
	//   31   53:invokevirtual   #59  <Method int InputStream.read()>
	//   32   56:ireturn         
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
	//    5    5:invokevirtual   #63  <Method int read(byte[], int, int)>
	//    6    8:ireturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		if(_b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field byte[] _b>
	//*   2    4:ifnull          75
		{
			int l = _end - _ptr;
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field int _end>
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field int _ptr>
	//    7   15:isub            
	//    8   16:istore          5
			int k = j;
	//    9   18:iload_3         
	//   10   19:istore          4
			if(j > l)
	//*  11   21:iload_3         
	//*  12   22:iload           5
	//*  13   24:icmple          31
				k = l;
	//   14   27:iload           5
	//   15   29:istore          4
			System.arraycopy(((Object) (_b)), _ptr, ((Object) (abyte0)), i, k);
	//   16   31:aload_0         
	//   17   32:getfield        #24  <Field byte[] _b>
	//   18   35:aload_0         
	//   19   36:getfield        #26  <Field int _ptr>
	//   20   39:aload_1         
	//   21   40:iload_2         
	//   22   41:iload           4
	//   23   43:invokestatic    #69  <Method void System.arraycopy(Object, int, Object, int, int)>
			_ptr = _ptr + k;
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #26  <Field int _ptr>
	//   27   51:iload           4
	//   28   53:iadd            
	//   29   54:putfield        #26  <Field int _ptr>
			if(_ptr >= _end)
	//*  30   57:aload_0         
	//*  31   58:getfield        #26  <Field int _ptr>
	//*  32   61:aload_0         
	//*  33   62:getfield        #28  <Field int _end>
	//*  34   65:icmplt          72
				_free();
	//   35   68:aload_0         
	//   36   69:invokespecial   #46  <Method void _free()>
			return k;
	//   37   72:iload           4
	//   38   74:ireturn         
		} else
		{
			return _in.read(abyte0, i, j);
	//   39   75:aload_0         
	//   40   76:getfield        #22  <Field InputStream _in>
	//   41   79:aload_1         
	//   42   80:iload_2         
	//   43   81:iload_3         
	//   44   82:invokevirtual   #70  <Method int InputStream.read(byte[], int, int)>
	//   45   85:ireturn         
		}
	}

	public void reset()
		throws IOException
	{
		if(_b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field byte[] _b>
	//*   2    4:ifnonnull       14
			_in.reset();
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field InputStream _in>
	//    5   11:invokevirtual   #73  <Method void InputStream.reset()>
	//    6   14:return          
	}

	public long skip(long l)
		throws IOException
	{
		long l1;
		if(_b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field byte[] _b>
	//*   2    4:ifnull          62
		{
			long l2 = _end - _ptr;
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field int _end>
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field int _ptr>
	//    7   15:isub            
	//    8   16:i2l             
	//    9   17:lstore          5
			if(l2 > l)
	//*  10   19:lload           5
	//*  11   21:lload_1         
	//*  12   22:lcmp            
	//*  13   23:ifle            39
			{
				_ptr = _ptr + (int)l;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #26  <Field int _ptr>
	//   17   31:lload_1         
	//   18   32:l2i             
	//   19   33:iadd            
	//   20   34:putfield        #26  <Field int _ptr>
				return l;
	//   21   37:lload_1         
	//   22   38:lreturn         
			}
			_free();
	//   23   39:aload_0         
	//   24   40:invokespecial   #46  <Method void _free()>
			l1 = 0L + l2;
	//   25   43:lconst_0        
	//   26   44:lload           5
	//   27   46:ladd            
	//   28   47:lstore_3        
			l2 = l - l2;
	//   29   48:lload_1         
	//   30   49:lload           5
	//   31   51:lsub            
	//   32   52:lstore          5
			l = l1;
	//   33   54:lload_3         
	//   34   55:lstore_1        
			l1 = l2;
	//   35   56:lload           5
	//   36   58:lstore_3        
		} else
	//*  37   59:goto            70
		{
			long l3 = 0L;
	//   38   62:lconst_0        
	//   39   63:lstore          5
			l1 = l;
	//   40   65:lload_1         
	//   41   66:lstore_3        
			l = l3;
	//   42   67:lload           5
	//   43   69:lstore_1        
		}
		if(l1 > 0L)
	//*  44   70:lload_3         
	//*  45   71:lconst_0        
	//*  46   72:lcmp            
	//*  47   73:ifle            87
			return l + _in.skip(l1);
	//   48   76:lload_1         
	//   49   77:aload_0         
	//   50   78:getfield        #22  <Field InputStream _in>
	//   51   81:lload_3         
	//   52   82:invokevirtual   #77  <Method long InputStream.skip(long)>
	//   53   85:ladd            
	//   54   86:lreturn         
		else
			return l;
	//   55   87:lload_1         
	//   56   88:lreturn         
	}

	private byte _b[];
	private final IOContext _ctxt;
	private final int _end;
	private final InputStream _in;
	private int _ptr;
}
