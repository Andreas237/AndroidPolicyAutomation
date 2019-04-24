// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.format;

import com.fasterxml.jackson.core.JsonFactory;
import java.io.*;

// Referenced classes of package com.fasterxml.jackson.core.format:
//			InputAccessor, DataFormatMatcher, MatchStrength

public static class InputAccessor$Std
	implements InputAccessor
{

	public DataFormatMatcher createMatcher(JsonFactory jsonfactory, MatchStrength matchstrength)
	{
		return new DataFormatMatcher(_in, _buffer, _bufferedStart, _bufferedEnd - _bufferedStart, jsonfactory, matchstrength);
	//    0    0:new             #37  <Class DataFormatMatcher>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field InputStream _in>
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field byte[] _buffer>
	//    6   12:aload_0         
	//    7   13:getfield        #26  <Field int _bufferedStart>
	//    8   16:aload_0         
	//    9   17:getfield        #30  <Field int _bufferedEnd>
	//   10   20:aload_0         
	//   11   21:getfield        #26  <Field int _bufferedStart>
	//   12   24:isub            
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:invokespecial   #40  <Method void DataFormatMatcher(InputStream, byte[], int, int, JsonFactory, MatchStrength)>
	//   16   30:areturn         
	}

	public boolean hasMoreBytes()
		throws IOException
	{
		if(_ptr < _bufferedEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field int _ptr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #30  <Field int _bufferedEnd>
	//*   4    8:icmpge          13
			return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
		if(_in == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #22  <Field InputStream _in>
	//*   9   17:ifnonnull       22
			return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
		int i = _buffer.length - _ptr;
	//   12   22:aload_0         
	//   13   23:getfield        #24  <Field byte[] _buffer>
	//   14   26:arraylength     
	//   15   27:aload_0         
	//   16   28:getfield        #28  <Field int _ptr>
	//   17   31:isub            
	//   18   32:istore_1        
		if(i < 1)
	//*  19   33:iload_1         
	//*  20   34:iconst_1        
	//*  21   35:icmpge          40
			return false;
	//   22   38:iconst_0        
	//   23   39:ireturn         
		i = _in.read(_buffer, _ptr, i);
	//   24   40:aload_0         
	//   25   41:getfield        #22  <Field InputStream _in>
	//   26   44:aload_0         
	//   27   45:getfield        #24  <Field byte[] _buffer>
	//   28   48:aload_0         
	//   29   49:getfield        #28  <Field int _ptr>
	//   30   52:iload_1         
	//   31   53:invokevirtual   #50  <Method int InputStream.read(byte[], int, int)>
	//   32   56:istore_1        
		if(i <= 0)
	//*  33   57:iload_1         
	//*  34   58:ifgt            63
		{
			return false;
	//   35   61:iconst_0        
	//   36   62:ireturn         
		} else
		{
			_bufferedEnd = _bufferedEnd + i;
	//   37   63:aload_0         
	//   38   64:aload_0         
	//   39   65:getfield        #30  <Field int _bufferedEnd>
	//   40   68:iload_1         
	//   41   69:iadd            
	//   42   70:putfield        #30  <Field int _bufferedEnd>
			return true;
	//   43   73:iconst_1        
	//   44   74:ireturn         
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
	//*   4    8:icmplt          78
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #55  <Method boolean hasMoreBytes()>
	//*   7   15:ifne            78
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   18:new             #57  <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #58  <Method void StringBuilder()>
	//   11   25:astore_2        
			stringbuilder.append("Failed auto-detect: could not read more than ");
	//   12   26:aload_2         
	//   13   27:ldc1            #60  <String "Failed auto-detect: could not read more than ">
	//   14   29:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:pop             
			stringbuilder.append(_ptr);
	//   16   33:aload_2         
	//   17   34:aload_0         
	//   18   35:getfield        #28  <Field int _ptr>
	//   19   38:invokevirtual   #67  <Method StringBuilder StringBuilder.append(int)>
	//   20   41:pop             
			stringbuilder.append(" bytes (max buffer size: ");
	//   21   42:aload_2         
	//   22   43:ldc1            #69  <String " bytes (max buffer size: ">
	//   23   45:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   24   48:pop             
			stringbuilder.append(_buffer.length);
	//   25   49:aload_2         
	//   26   50:aload_0         
	//   27   51:getfield        #24  <Field byte[] _buffer>
	//   28   54:arraylength     
	//   29   55:invokevirtual   #67  <Method StringBuilder StringBuilder.append(int)>
	//   30   58:pop             
			stringbuilder.append(")");
	//   31   59:aload_2         
	//   32   60:ldc1            #71  <String ")">
	//   33   62:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   34   65:pop             
			throw new EOFException(stringbuilder.toString());
	//   35   66:new             #73  <Class EOFException>
	//   36   69:dup             
	//   37   70:aload_2         
	//   38   71:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   39   74:invokespecial   #80  <Method void EOFException(String)>
	//   40   77:athrow          
		} else
		{
			byte abyte0[] = _buffer;
	//   41   78:aload_0         
	//   42   79:getfield        #24  <Field byte[] _buffer>
	//   43   82:astore_2        
			int i = _ptr;
	//   44   83:aload_0         
	//   45   84:getfield        #28  <Field int _ptr>
	//   46   87:istore_1        
			_ptr = i + 1;
	//   47   88:aload_0         
	//   48   89:iload_1         
	//   49   90:iconst_1        
	//   50   91:iadd            
	//   51   92:putfield        #28  <Field int _ptr>
			return abyte0[i];
	//   52   95:aload_2         
	//   53   96:iload_1         
	//   54   97:baload          
	//   55   98:ireturn         
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
	protected final int _bufferedStart;
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
		_bufferedStart = 0;
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

	public InputAccessor$Std(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		_in = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #22  <Field InputStream _in>
		_buffer = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #24  <Field byte[] _buffer>
		_bufferedStart = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #26  <Field int _bufferedStart>
		_bufferedEnd = abyte0.length;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:arraylength     
	//   14   22:putfield        #30  <Field int _bufferedEnd>
	//   15   25:return          
	}

	public InputAccessor$Std(byte abyte0[], int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		_in = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #22  <Field InputStream _in>
		_buffer = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #24  <Field byte[] _buffer>
		_ptr = i;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #28  <Field int _ptr>
		_bufferedStart = i;
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:putfield        #26  <Field int _bufferedStart>
		_bufferedEnd = i + j;
	//   14   24:aload_0         
	//   15   25:iload_2         
	//   16   26:iload_3         
	//   17   27:iadd            
	//   18   28:putfield        #30  <Field int _bufferedEnd>
	//   19   31:return          
	}
}
