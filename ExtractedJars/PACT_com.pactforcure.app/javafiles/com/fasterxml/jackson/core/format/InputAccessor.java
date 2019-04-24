// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.format;

import com.fasterxml.jackson.core.JsonFactory;
import java.io.*;

// Referenced classes of package com.fasterxml.jackson.core.format:
//			DataFormatMatcher, MatchStrength

public interface InputAccessor
{
	public static class Std
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
		//*   4    8:icmplt          66
		//*   5   11:aload_0         
		//*   6   12:invokevirtual   #55  <Method boolean hasMoreBytes()>
		//*   7   15:ifne            66
			{
				throw new EOFException((new StringBuilder()).append("Failed auto-detect: could not read more than ").append(_ptr).append(" bytes (max buffer size: ").append(_buffer.length).append(")").toString());
		//    8   18:new             #57  <Class EOFException>
		//    9   21:dup             
		//   10   22:new             #59  <Class StringBuilder>
		//   11   25:dup             
		//   12   26:invokespecial   #60  <Method void StringBuilder()>
		//   13   29:ldc1            #62  <String "Failed auto-detect: could not read more than ">
		//   14   31:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//   15   34:aload_0         
		//   16   35:getfield        #28  <Field int _ptr>
		//   17   38:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
		//   18   41:ldc1            #71  <String " bytes (max buffer size: ">
		//   19   43:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//   20   46:aload_0         
		//   21   47:getfield        #24  <Field byte[] _buffer>
		//   22   50:arraylength     
		//   23   51:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
		//   24   54:ldc1            #73  <String ")">
		//   25   56:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//   26   59:invokevirtual   #77  <Method String StringBuilder.toString()>
		//   27   62:invokespecial   #80  <Method void EOFException(String)>
		//   28   65:athrow          
			} else
			{
				byte abyte0[] = _buffer;
		//   29   66:aload_0         
		//   30   67:getfield        #24  <Field byte[] _buffer>
		//   31   70:astore_2        
				int i = _ptr;
		//   32   71:aload_0         
		//   33   72:getfield        #28  <Field int _ptr>
		//   34   75:istore_1        
				_ptr = i + 1;
		//   35   76:aload_0         
		//   36   77:iload_1         
		//   37   78:iconst_1        
		//   38   79:iadd            
		//   39   80:putfield        #28  <Field int _ptr>
				return abyte0[i];
		//   40   83:aload_2         
		//   41   84:iload_1         
		//   42   85:baload          
		//   43   86:ireturn         
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

		public Std(InputStream inputstream, byte abyte0[])
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

		public Std(byte abyte0[])
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

		public Std(byte abyte0[], int i, int j)
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


	public abstract boolean hasMoreBytes()
		throws IOException;

	public abstract byte nextByte()
		throws IOException;

	public abstract void reset();
}
