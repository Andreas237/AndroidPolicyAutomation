// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.format;

import java.io.*;

// Referenced classes of package com.fasterxml.jackson.core.format:
//			InputAccessor

public static class InputAccessor$Std
	implements InputAccessor
{

	public boolean hasMoreBytes()
		throws IOException
	{
		int i = _ptr;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int _ptr>
	//    2    4:istore_1        
		if(i < _bufferedEnd)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #30  <Field int _bufferedEnd>
	//*   6   10:icmpge          15
			return true;
	//    7   13:iconst_1        
	//    8   14:ireturn         
		InputStream inputstream = _in;
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field InputStream _in>
	//   11   19:astore_3        
		if(inputstream == null)
	//*  12   20:aload_3         
	//*  13   21:ifnonnull       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		byte abyte0[] = _buffer;
	//   16   26:aload_0         
	//   17   27:getfield        #24  <Field byte[] _buffer>
	//   18   30:astore          4
		int j = abyte0.length - i;
	//   19   32:aload           4
	//   20   34:arraylength     
	//   21   35:iload_1         
	//   22   36:isub            
	//   23   37:istore_2        
		if(j < 1)
	//*  24   38:iload_2         
	//*  25   39:iconst_1        
	//*  26   40:icmpge          45
			return false;
	//   27   43:iconst_0        
	//   28   44:ireturn         
		i = inputstream.read(abyte0, i, j);
	//   29   45:aload_3         
	//   30   46:aload           4
	//   31   48:iload_1         
	//   32   49:iload_2         
	//   33   50:invokevirtual   #41  <Method int InputStream.read(byte[], int, int)>
	//   34   53:istore_1        
		if(i <= 0)
	//*  35   54:iload_1         
	//*  36   55:ifgt            60
		{
			return false;
	//   37   58:iconst_0        
	//   38   59:ireturn         
		} else
		{
			_bufferedEnd = _bufferedEnd + i;
	//   39   60:aload_0         
	//   40   61:aload_0         
	//   41   62:getfield        #30  <Field int _bufferedEnd>
	//   42   65:iload_1         
	//   43   66:iadd            
	//   44   67:putfield        #30  <Field int _bufferedEnd>
			return true;
	//   45   70:iconst_1        
	//   46   71:ireturn         
		}
	}

	public byte nextByte()
		throws IOException
	{
		if(_ptr >= _bufferedEnd && !hasMoreBytes())
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field int _ptr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #30  <Field int _bufferedEnd>
	//*   4    8:icmplt          81
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #46  <Method boolean hasMoreBytes()>
	//*   7   15:ifeq            21
	//*   8   18:goto            81
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   21:new             #48  <Class StringBuilder>
	//   10   24:dup             
	//   11   25:invokespecial   #49  <Method void StringBuilder()>
	//   12   28:astore_2        
			stringbuilder.append("Failed auto-detect: could not read more than ");
	//   13   29:aload_2         
	//   14   30:ldc1            #51  <String "Failed auto-detect: could not read more than ">
	//   15   32:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   16   35:pop             
			stringbuilder.append(_ptr);
	//   17   36:aload_2         
	//   18   37:aload_0         
	//   19   38:getfield        #28  <Field int _ptr>
	//   20   41:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   21   44:pop             
			stringbuilder.append(" bytes (max buffer size: ");
	//   22   45:aload_2         
	//   23   46:ldc1            #60  <String " bytes (max buffer size: ">
	//   24   48:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
			stringbuilder.append(_buffer.length);
	//   26   52:aload_2         
	//   27   53:aload_0         
	//   28   54:getfield        #24  <Field byte[] _buffer>
	//   29   57:arraylength     
	//   30   58:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   31   61:pop             
			stringbuilder.append(")");
	//   32   62:aload_2         
	//   33   63:ldc1            #62  <String ")">
	//   34   65:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   35   68:pop             
			throw new EOFException(stringbuilder.toString());
	//   36   69:new             #64  <Class EOFException>
	//   37   72:dup             
	//   38   73:aload_2         
	//   39   74:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   40   77:invokespecial   #71  <Method void EOFException(String)>
	//   41   80:athrow          
		} else
		{
			byte abyte0[] = _buffer;
	//   42   81:aload_0         
	//   43   82:getfield        #24  <Field byte[] _buffer>
	//   44   85:astore_2        
			int i = _ptr;
	//   45   86:aload_0         
	//   46   87:getfield        #28  <Field int _ptr>
	//   47   90:istore_1        
			_ptr = i + 1;
	//   48   91:aload_0         
	//   49   92:iload_1         
	//   50   93:iconst_1        
	//   51   94:iadd            
	//   52   95:putfield        #28  <Field int _ptr>
			return abyte0[i];
	//   53   98:aload_2         
	//   54   99:iload_1         
	//   55  100:baload          
	//   56  101:ireturn         
		}
	}

	public void reset()
	{
		_ptr = _bufferedStart;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #26  <Field int _bufferedStart>
	//    3    5:putfield        #28  <Field int _ptr>
	//    4    8:return          
	}

	protected final byte _buffer[];
	protected int _bufferedEnd;
	protected final int _bufferedStart = 0;
	protected final InputStream _in;
	protected int _ptr;

	public InputAccessor$Std(InputStream inputstream, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		_in = inputstream;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field InputStream _in>
		_buffer = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field byte[] _buffer>
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #26  <Field int _bufferedStart>
		_ptr = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #28  <Field int _ptr>
		_bufferedEnd = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #30  <Field int _bufferedEnd>
	//   17   29:return          
	}
}
