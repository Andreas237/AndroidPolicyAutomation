// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.io;

import java.io.*;

// Referenced classes of package com.fasterxml.jackson.core.io:
//			IOContext

public class UTF32Reader extends Reader
{

	public UTF32Reader(IOContext iocontext, InputStream inputstream, byte abyte0[], int i, int j, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Reader()>
		boolean flag1 = false;
	//    2    4:iconst_0        
	//    3    5:istore          7
		_surrogate = '\0';
	//    4    7:aload_0         
	//    5    8:iconst_0        
	//    6    9:putfield        #33  <Field char _surrogate>
		_context = iocontext;
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:putfield        #35  <Field IOContext _context>
		_in = inputstream;
	//   10   17:aload_0         
	//   11   18:aload_2         
	//   12   19:putfield        #37  <Field InputStream _in>
		_buffer = abyte0;
	//   13   22:aload_0         
	//   14   23:aload_3         
	//   15   24:putfield        #39  <Field byte[] _buffer>
		_ptr = i;
	//   16   27:aload_0         
	//   17   28:iload           4
	//   18   30:putfield        #41  <Field int _ptr>
		_length = j;
	//   19   33:aload_0         
	//   20   34:iload           5
	//   21   36:putfield        #43  <Field int _length>
		_bigEndian = flag;
	//   22   39:aload_0         
	//   23   40:iload           6
	//   24   42:putfield        #45  <Field boolean _bigEndian>
		flag = flag1;
	//   25   45:iload           7
	//   26   47:istore          6
		if(inputstream != null)
	//*  27   49:aload_2         
	//*  28   50:ifnull          56
			flag = true;
	//   29   53:iconst_1        
	//   30   54:istore          6
		_managedBuffers = flag;
	//   31   56:aload_0         
	//   32   57:iload           6
	//   33   59:putfield        #47  <Field boolean _managedBuffers>
	//   34   62:return          
	}

	private void freeBuffers()
	{
		byte abyte0[] = _buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field byte[] _buffer>
	//    2    4:astore_1        
		if(abyte0 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          22
		{
			_buffer = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #39  <Field byte[] _buffer>
			_context.releaseReadIOBuffer(abyte0);
	//    8   14:aload_0         
	//    9   15:getfield        #35  <Field IOContext _context>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #55  <Method void IOContext.releaseReadIOBuffer(byte[])>
		}
	//   12   22:return          
	}

	private boolean loadMore(int i)
		throws IOException
	{
		_byteCount = _byteCount + (_length - i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field int _byteCount>
	//    3    5:aload_0         
	//    4    6:getfield        #43  <Field int _length>
	//    5    9:iload_1         
	//    6   10:isub            
	//    7   11:iadd            
	//    8   12:putfield        #61  <Field int _byteCount>
		if(i > 0)
	//*   9   15:iload_1         
	//*  10   16:ifle            56
		{
			if(_ptr > 0)
	//*  11   19:aload_0         
	//*  12   20:getfield        #41  <Field int _ptr>
	//*  13   23:ifle            48
			{
				System.arraycopy(((Object) (_buffer)), _ptr, ((Object) (_buffer)), 0, i);
	//   14   26:aload_0         
	//   15   27:getfield        #39  <Field byte[] _buffer>
	//   16   30:aload_0         
	//   17   31:getfield        #41  <Field int _ptr>
	//   18   34:aload_0         
	//   19   35:getfield        #39  <Field byte[] _buffer>
	//   20   38:iconst_0        
	//   21   39:iload_1         
	//   22   40:invokestatic    #67  <Method void System.arraycopy(Object, int, Object, int, int)>
				_ptr = 0;
	//   23   43:aload_0         
	//   24   44:iconst_0        
	//   25   45:putfield        #41  <Field int _ptr>
			}
			_length = i;
	//   26   48:aload_0         
	//   27   49:iload_1         
	//   28   50:putfield        #43  <Field int _length>
		} else
	//*  29   53:goto            121
		{
			_ptr = 0;
	//   30   56:aload_0         
	//   31   57:iconst_0        
	//   32   58:putfield        #41  <Field int _ptr>
			if(_in == null)
	//*  33   61:aload_0         
	//*  34   62:getfield        #37  <Field InputStream _in>
	//*  35   65:ifnonnull       73
				i = -1;
	//   36   68:iconst_m1       
	//   37   69:istore_1        
			else
	//*  38   70:goto            85
				i = _in.read(_buffer);
	//   39   73:aload_0         
	//   40   74:getfield        #37  <Field InputStream _in>
	//   41   77:aload_0         
	//   42   78:getfield        #39  <Field byte[] _buffer>
	//   43   81:invokevirtual   #73  <Method int InputStream.read(byte[])>
	//   44   84:istore_1        
			if(i < 1)
	//*  45   85:iload_1         
	//*  46   86:iconst_1        
	//*  47   87:icmpge          116
			{
				_length = 0;
	//   48   90:aload_0         
	//   49   91:iconst_0        
	//   50   92:putfield        #43  <Field int _length>
				if(i < 0)
	//*  51   95:iload_1         
	//*  52   96:ifge            112
				{
					if(_managedBuffers)
	//*  53   99:aload_0         
	//*  54  100:getfield        #47  <Field boolean _managedBuffers>
	//*  55  103:ifeq            110
						freeBuffers();
	//   56  106:aload_0         
	//   57  107:invokespecial   #75  <Method void freeBuffers()>
					return false;
	//   58  110:iconst_0        
	//   59  111:ireturn         
				}
				reportStrangeStream();
	//   60  112:aload_0         
	//   61  113:invokespecial   #78  <Method void reportStrangeStream()>
			}
			_length = i;
	//   62  116:aload_0         
	//   63  117:iload_1         
	//   64  118:putfield        #43  <Field int _length>
		}
		for(; _length < 4; _length = _length + i)
	//*  65  121:aload_0         
	//*  66  122:getfield        #43  <Field int _length>
	//*  67  125:iconst_4        
	//*  68  126:icmpge          213
		{
			if(_in == null)
	//*  69  129:aload_0         
	//*  70  130:getfield        #37  <Field InputStream _in>
	//*  71  133:ifnonnull       141
				i = -1;
	//   72  136:iconst_m1       
	//   73  137:istore_1        
			else
	//*  74  138:goto            167
				i = _in.read(_buffer, _length, _buffer.length - _length);
	//   75  141:aload_0         
	//   76  142:getfield        #37  <Field InputStream _in>
	//   77  145:aload_0         
	//   78  146:getfield        #39  <Field byte[] _buffer>
	//   79  149:aload_0         
	//   80  150:getfield        #43  <Field int _length>
	//   81  153:aload_0         
	//   82  154:getfield        #39  <Field byte[] _buffer>
	//   83  157:arraylength     
	//   84  158:aload_0         
	//   85  159:getfield        #43  <Field int _length>
	//   86  162:isub            
	//   87  163:invokevirtual   #81  <Method int InputStream.read(byte[], int, int)>
	//   88  166:istore_1        
			if(i >= 1)
				continue;
	//   89  167:iload_1         
	//   90  168:iconst_1        
	//   91  169:icmpge          200
			if(i < 0)
	//*  92  172:iload_1         
	//*  93  173:ifge            196
			{
				if(_managedBuffers)
	//*  94  176:aload_0         
	//*  95  177:getfield        #47  <Field boolean _managedBuffers>
	//*  96  180:ifeq            187
					freeBuffers();
	//   97  183:aload_0         
	//   98  184:invokespecial   #75  <Method void freeBuffers()>
				reportUnexpectedEOF(_length, 4);
	//   99  187:aload_0         
	//  100  188:aload_0         
	//  101  189:getfield        #43  <Field int _length>
	//  102  192:iconst_4        
	//  103  193:invokespecial   #85  <Method void reportUnexpectedEOF(int, int)>
			}
			reportStrangeStream();
	//  104  196:aload_0         
	//  105  197:invokespecial   #78  <Method void reportStrangeStream()>
		}

	//  106  200:aload_0         
	//  107  201:aload_0         
	//  108  202:getfield        #43  <Field int _length>
	//  109  205:iload_1         
	//  110  206:iadd            
	//  111  207:putfield        #43  <Field int _length>
	//* 112  210:goto            121
		return true;
	//  113  213:iconst_1        
	//  114  214:ireturn         
	}

	private void reportBounds(char ac[], int i, int j)
		throws IOException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append("read(buf,");
	//    4    9:aload           4
	//    5   11:ldc1            #93  <String "read(buf,">
	//    6   13:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(i);
	//    8   17:aload           4
	//    9   19:iload_2         
	//   10   20:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
	//   11   23:pop             
		stringbuilder.append(",");
	//   12   24:aload           4
	//   13   26:ldc1            #102 <String ",">
	//   14   28:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		stringbuilder.append(j);
	//   16   32:aload           4
	//   17   34:iload_3         
	//   18   35:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
	//   19   38:pop             
		stringbuilder.append("), cbuf[");
	//   20   39:aload           4
	//   21   41:ldc1            #104 <String "), cbuf[">
	//   22   43:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
		stringbuilder.append(ac.length);
	//   24   47:aload           4
	//   25   49:aload_1         
	//   26   50:arraylength     
	//   27   51:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
	//   28   54:pop             
		stringbuilder.append("]");
	//   29   55:aload           4
	//   30   57:ldc1            #106 <String "]">
	//   31   59:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   32   62:pop             
		throw new ArrayIndexOutOfBoundsException(stringbuilder.toString());
	//   33   63:new             #108 <Class ArrayIndexOutOfBoundsException>
	//   34   66:dup             
	//   35   67:aload           4
	//   36   69:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   37   72:invokespecial   #115 <Method void ArrayIndexOutOfBoundsException(String)>
	//   38   75:athrow          
	}

	private void reportInvalid(int i, int j, String s)
		throws IOException
	{
		int k = _byteCount;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int _byteCount>
	//    2    4:istore          4
		int l = _ptr;
	//    3    6:aload_0         
	//    4    7:getfield        #41  <Field int _ptr>
	//    5   10:istore          5
		int i1 = _charCount;
	//    6   12:aload_0         
	//    7   13:getfield        #119 <Field int _charCount>
	//    8   16:istore          6
		StringBuilder stringbuilder = new StringBuilder();
	//    9   18:new             #90  <Class StringBuilder>
	//   10   21:dup             
	//   11   22:invokespecial   #91  <Method void StringBuilder()>
	//   12   25:astore          7
		stringbuilder.append("Invalid UTF-32 character 0x");
	//   13   27:aload           7
	//   14   29:ldc1            #121 <String "Invalid UTF-32 character 0x">
	//   15   31:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
		stringbuilder.append(Integer.toHexString(i));
	//   17   35:aload           7
	//   18   37:iload_1         
	//   19   38:invokestatic    #127 <Method String Integer.toHexString(int)>
	//   20   41:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
		stringbuilder.append(s);
	//   22   45:aload           7
	//   23   47:aload_3         
	//   24   48:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		stringbuilder.append(" at char #");
	//   26   52:aload           7
	//   27   54:ldc1            #129 <String " at char #">
	//   28   56:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   29   59:pop             
		stringbuilder.append(i1 + j);
	//   30   60:aload           7
	//   31   62:iload           6
	//   32   64:iload_2         
	//   33   65:iadd            
	//   34   66:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
	//   35   69:pop             
		stringbuilder.append(", byte #");
	//   36   70:aload           7
	//   37   72:ldc1            #131 <String ", byte #">
	//   38   74:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   39   77:pop             
		stringbuilder.append((k + l) - 1);
	//   40   78:aload           7
	//   41   80:iload           4
	//   42   82:iload           5
	//   43   84:iadd            
	//   44   85:iconst_1        
	//   45   86:isub            
	//   46   87:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
	//   47   90:pop             
		stringbuilder.append(")");
	//   48   91:aload           7
	//   49   93:ldc1            #133 <String ")">
	//   50   95:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   51   98:pop             
		throw new CharConversionException(stringbuilder.toString());
	//   52   99:new             #135 <Class CharConversionException>
	//   53  102:dup             
	//   54  103:aload           7
	//   55  105:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   56  108:invokespecial   #136 <Method void CharConversionException(String)>
	//   57  111:athrow          
	}

	private void reportStrangeStream()
		throws IOException
	{
		throw new IOException("Strange I/O stream, returned 0 bytes on read");
	//    0    0:new             #59  <Class IOException>
	//    1    3:dup             
	//    2    4:ldc1            #138 <String "Strange I/O stream, returned 0 bytes on read">
	//    3    6:invokespecial   #139 <Method void IOException(String)>
	//    4    9:athrow          
	}

	private void reportUnexpectedEOF(int i, int j)
		throws IOException
	{
		int k = _byteCount;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int _byteCount>
	//    2    4:istore_3        
		int l = _charCount;
	//    3    5:aload_0         
	//    4    6:getfield        #119 <Field int _charCount>
	//    5    9:istore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    6   11:new             #90  <Class StringBuilder>
	//    7   14:dup             
	//    8   15:invokespecial   #91  <Method void StringBuilder()>
	//    9   18:astore          5
		stringbuilder.append("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ");
	//   10   20:aload           5
	//   11   22:ldc1            #141 <String "Unexpected EOF in the middle of a 4-byte UTF-32 char: got ">
	//   12   24:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		stringbuilder.append(i);
	//   14   28:aload           5
	//   15   30:iload_1         
	//   16   31:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
	//   17   34:pop             
		stringbuilder.append(", needed ");
	//   18   35:aload           5
	//   19   37:ldc1            #143 <String ", needed ">
	//   20   39:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
		stringbuilder.append(j);
	//   22   43:aload           5
	//   23   45:iload_2         
	//   24   46:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
	//   25   49:pop             
		stringbuilder.append(", at char #");
	//   26   50:aload           5
	//   27   52:ldc1            #145 <String ", at char #">
	//   28   54:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
		stringbuilder.append(l);
	//   30   58:aload           5
	//   31   60:iload           4
	//   32   62:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
	//   33   65:pop             
		stringbuilder.append(", byte #");
	//   34   66:aload           5
	//   35   68:ldc1            #131 <String ", byte #">
	//   36   70:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   37   73:pop             
		stringbuilder.append(k + i);
	//   38   74:aload           5
	//   39   76:iload_3         
	//   40   77:iload_1         
	//   41   78:iadd            
	//   42   79:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
	//   43   82:pop             
		stringbuilder.append(")");
	//   44   83:aload           5
	//   45   85:ldc1            #133 <String ")">
	//   46   87:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   47   90:pop             
		throw new CharConversionException(stringbuilder.toString());
	//   48   91:new             #135 <Class CharConversionException>
	//   49   94:dup             
	//   50   95:aload           5
	//   51   97:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   52  100:invokespecial   #136 <Method void CharConversionException(String)>
	//   53  103:athrow          
	}

	public void close()
		throws IOException
	{
		InputStream inputstream = _in;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field InputStream _in>
	//    2    4:astore_1        
		if(inputstream != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          22
		{
			_in = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #37  <Field InputStream _in>
			freeBuffers();
	//    8   14:aload_0         
	//    9   15:invokespecial   #75  <Method void freeBuffers()>
			inputstream.close();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #148 <Method void InputStream.close()>
		}
	//   12   22:return          
	}

	public int read()
		throws IOException
	{
		if(_tmpBuf == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #151 <Field char[] _tmpBuf>
	//*   2    4:ifnonnull       14
			_tmpBuf = new char[1];
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:newarray        char[]
	//    6   11:putfield        #151 <Field char[] _tmpBuf>
		if(read(_tmpBuf, 0, 1) < 1)
	//*   7   14:aload_0         
	//*   8   15:aload_0         
	//*   9   16:getfield        #151 <Field char[] _tmpBuf>
	//*  10   19:iconst_0        
	//*  11   20:iconst_1        
	//*  12   21:invokevirtual   #154 <Method int read(char[], int, int)>
	//*  13   24:iconst_1        
	//*  14   25:icmpge          30
			return -1;
	//   15   28:iconst_m1       
	//   16   29:ireturn         
		else
			return ((int) (_tmpBuf[0]));
	//   17   30:aload_0         
	//   18   31:getfield        #151 <Field char[] _tmpBuf>
	//   19   34:iconst_0        
	//   20   35:caload          
	//   21   36:ireturn         
	}

	public int read(char ac[], int i, int j)
		throws IOException
	{
		if(_buffer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field byte[] _buffer>
	//*   2    4:ifnonnull       9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		if(j < 1)
	//*   5    9:iload_3         
	//*   6   10:iconst_1        
	//*   7   11:icmpge          16
			return j;
	//    8   14:iload_3         
	//    9   15:ireturn         
		if(i < 0 || i + j > ac.length)
	//*  10   16:iload_2         
	//*  11   17:iflt            28
	//*  12   20:iload_2         
	//*  13   21:iload_3         
	//*  14   22:iadd            
	//*  15   23:aload_1         
	//*  16   24:arraylength     
	//*  17   25:icmple          35
			reportBounds(ac, i, j);
	//   18   28:aload_0         
	//   19   29:aload_1         
	//   20   30:iload_2         
	//   21   31:iload_3         
	//   22   32:invokespecial   #156 <Method void reportBounds(char[], int, int)>
		int j1 = j + i;
	//   23   35:iload_3         
	//   24   36:iload_2         
	//   25   37:iadd            
	//   26   38:istore          7
		if(_surrogate != 0)
	//*  27   40:aload_0         
	//*  28   41:getfield        #33  <Field char _surrogate>
	//*  29   44:ifeq            66
		{
			j = i + 1;
	//   30   47:iload_2         
	//   31   48:iconst_1        
	//   32   49:iadd            
	//   33   50:istore_3        
			ac[i] = _surrogate;
	//   34   51:aload_1         
	//   35   52:iload_2         
	//   36   53:aload_0         
	//   37   54:getfield        #33  <Field char _surrogate>
	//   38   57:castore         
			_surrogate = '\0';
	//   39   58:aload_0         
	//   40   59:iconst_0        
	//   41   60:putfield        #33  <Field char _surrogate>
		} else
	//*  42   63:goto            93
		{
			j = _length - _ptr;
	//   43   66:aload_0         
	//   44   67:getfield        #43  <Field int _length>
	//   45   70:aload_0         
	//   46   71:getfield        #41  <Field int _ptr>
	//   47   74:isub            
	//   48   75:istore_3        
			if(j < 4 && !loadMore(j))
	//*  49   76:iload_3         
	//*  50   77:iconst_4        
	//*  51   78:icmpge          91
	//*  52   81:aload_0         
	//*  53   82:iload_3         
	//*  54   83:invokespecial   #158 <Method boolean loadMore(int)>
	//*  55   86:ifne            91
				return -1;
	//   56   89:iconst_m1       
	//   57   90:ireturn         
			j = i;
	//   58   91:iload_2         
	//   59   92:istore_3        
		}
		do
		{
			if(j >= j1)
				break;
	//   60   93:iload_3         
	//   61   94:iload           7
	//   62   96:icmpge          428
			int k = _ptr;
	//   63   99:aload_0         
	//   64  100:getfield        #41  <Field int _ptr>
	//   65  103:istore          4
			if(_bigEndian)
	//*  66  105:aload_0         
	//*  67  106:getfield        #45  <Field boolean _bigEndian>
	//*  68  109:ifeq            187
			{
				byte byte0 = _buffer[k];
	//   69  112:aload_0         
	//   70  113:getfield        #39  <Field byte[] _buffer>
	//   71  116:iload           4
	//   72  118:baload          
	//   73  119:istore          5
				byte byte2 = _buffer[k + 1];
	//   74  121:aload_0         
	//   75  122:getfield        #39  <Field byte[] _buffer>
	//   76  125:iload           4
	//   77  127:iconst_1        
	//   78  128:iadd            
	//   79  129:baload          
	//   80  130:istore          6
				byte byte4 = _buffer[k + 2];
	//   81  132:aload_0         
	//   82  133:getfield        #39  <Field byte[] _buffer>
	//   83  136:iload           4
	//   84  138:iconst_2        
	//   85  139:iadd            
	//   86  140:baload          
	//   87  141:istore          8
				k = _buffer[k + 3] & 0xff | (byte0 << 24 | (byte2 & 0xff) << 16 | (byte4 & 0xff) << 8);
	//   88  143:aload_0         
	//   89  144:getfield        #39  <Field byte[] _buffer>
	//   90  147:iload           4
	//   91  149:iconst_3        
	//   92  150:iadd            
	//   93  151:baload          
	//   94  152:sipush          255
	//   95  155:iand            
	//   96  156:iload           5
	//   97  158:bipush          24
	//   98  160:ishl            
	//   99  161:iload           6
	//  100  163:sipush          255
	//  101  166:iand            
	//  102  167:bipush          16
	//  103  169:ishl            
	//  104  170:ior             
	//  105  171:iload           8
	//  106  173:sipush          255
	//  107  176:iand            
	//  108  177:bipush          8
	//  109  179:ishl            
	//  110  180:ior             
	//  111  181:ior             
	//  112  182:istore          4
			} else
	//* 113  184:goto            259
			{
				byte byte1 = _buffer[k];
	//  114  187:aload_0         
	//  115  188:getfield        #39  <Field byte[] _buffer>
	//  116  191:iload           4
	//  117  193:baload          
	//  118  194:istore          5
				byte byte3 = _buffer[k + 1];
	//  119  196:aload_0         
	//  120  197:getfield        #39  <Field byte[] _buffer>
	//  121  200:iload           4
	//  122  202:iconst_1        
	//  123  203:iadd            
	//  124  204:baload          
	//  125  205:istore          6
				byte byte5 = _buffer[k + 2];
	//  126  207:aload_0         
	//  127  208:getfield        #39  <Field byte[] _buffer>
	//  128  211:iload           4
	//  129  213:iconst_2        
	//  130  214:iadd            
	//  131  215:baload          
	//  132  216:istore          8
				k = _buffer[k + 3] << 24 | (byte1 & 0xff | (byte3 & 0xff) << 8 | (byte5 & 0xff) << 16);
	//  133  218:aload_0         
	//  134  219:getfield        #39  <Field byte[] _buffer>
	//  135  222:iload           4
	//  136  224:iconst_3        
	//  137  225:iadd            
	//  138  226:baload          
	//  139  227:bipush          24
	//  140  229:ishl            
	//  141  230:iload           5
	//  142  232:sipush          255
	//  143  235:iand            
	//  144  236:iload           6
	//  145  238:sipush          255
	//  146  241:iand            
	//  147  242:bipush          8
	//  148  244:ishl            
	//  149  245:ior             
	//  150  246:iload           8
	//  151  248:sipush          255
	//  152  251:iand            
	//  153  252:bipush          16
	//  154  254:ishl            
	//  155  255:ior             
	//  156  256:ior             
	//  157  257:istore          4
			}
			_ptr = _ptr + 4;
	//  158  259:aload_0         
	//  159  260:aload_0         
	//  160  261:getfield        #41  <Field int _ptr>
	//  161  264:iconst_4        
	//  162  265:iadd            
	//  163  266:putfield        #41  <Field int _ptr>
			int i1 = j;
	//  164  269:iload_3         
	//  165  270:istore          6
			int l = k;
	//  166  272:iload           4
	//  167  274:istore          5
			if(k > 65535)
	//* 168  276:iload           4
	//* 169  278:ldc1            #159 <Int 65535>
	//* 170  280:icmple          399
			{
				if(k > 0x10ffff)
	//* 171  283:iload           4
	//* 172  285:ldc1            #7   <Int 0x10ffff>
	//* 173  287:icmple          340
				{
					StringBuilder stringbuilder = new StringBuilder();
	//  174  290:new             #90  <Class StringBuilder>
	//  175  293:dup             
	//  176  294:invokespecial   #91  <Method void StringBuilder()>
	//  177  297:astore          9
					stringbuilder.append("(above ");
	//  178  299:aload           9
	//  179  301:ldc1            #161 <String "(above ">
	//  180  303:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//  181  306:pop             
					stringbuilder.append(Integer.toHexString(0x10ffff));
	//  182  307:aload           9
	//  183  309:ldc1            #7   <Int 0x10ffff>
	//  184  311:invokestatic    #127 <Method String Integer.toHexString(int)>
	//  185  314:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//  186  317:pop             
					stringbuilder.append(") ");
	//  187  318:aload           9
	//  188  320:ldc1            #163 <String ") ">
	//  189  322:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//  190  325:pop             
					reportInvalid(k, j - i, stringbuilder.toString());
	//  191  326:aload_0         
	//  192  327:iload           4
	//  193  329:iload_3         
	//  194  330:iload_2         
	//  195  331:isub            
	//  196  332:aload           9
	//  197  334:invokevirtual   #112 <Method String StringBuilder.toString()>
	//  198  337:invokespecial   #165 <Method void reportInvalid(int, int, String)>
				}
				l = k - 0x10000;
	//  199  340:iload           4
	//  200  342:ldc1            #166 <Int 0x10000>
	//  201  344:isub            
	//  202  345:istore          5
				k = j + 1;
	//  203  347:iload_3         
	//  204  348:iconst_1        
	//  205  349:iadd            
	//  206  350:istore          4
				ac[j] = (char)(55296 + (l >> 10));
	//  207  352:aload_1         
	//  208  353:iload_3         
	//  209  354:ldc1            #167 <Int 55296>
	//  210  356:iload           5
	//  211  358:bipush          10
	//  212  360:ishr            
	//  213  361:iadd            
	//  214  362:int2char        
	//  215  363:castore         
				l = l & 0x3ff | 0xdc00;
	//  216  364:iload           5
	//  217  366:sipush          1023
	//  218  369:iand            
	//  219  370:ldc1            #168 <Int 56320>
	//  220  372:ior             
	//  221  373:istore          5
				if(k >= j1)
	//* 222  375:iload           4
	//* 223  377:iload           7
	//* 224  379:icmplt          395
				{
					_surrogate = (char)l;
	//  225  382:aload_0         
	//  226  383:iload           5
	//  227  385:int2char        
	//  228  386:putfield        #33  <Field char _surrogate>
					j = k;
	//  229  389:iload           4
	//  230  391:istore_3        
					break;
	//  231  392:goto            428
				}
				i1 = k;
	//  232  395:iload           4
	//  233  397:istore          6
			}
			j = i1 + 1;
	//  234  399:iload           6
	//  235  401:iconst_1        
	//  236  402:iadd            
	//  237  403:istore_3        
			ac[i1] = (char)l;
	//  238  404:aload_1         
	//  239  405:iload           6
	//  240  407:iload           5
	//  241  409:int2char        
	//  242  410:castore         
		} while(_ptr < _length);
	//  243  411:aload_0         
	//  244  412:getfield        #41  <Field int _ptr>
	//  245  415:aload_0         
	//  246  416:getfield        #43  <Field int _length>
	//  247  419:icmplt          425
	//* 248  422:goto            428
	//* 249  425:goto            93
		i = j - i;
	//  250  428:iload_3         
	//  251  429:iload_2         
	//  252  430:isub            
	//  253  431:istore_2        
		_charCount = _charCount + i;
	//  254  432:aload_0         
	//  255  433:aload_0         
	//  256  434:getfield        #119 <Field int _charCount>
	//  257  437:iload_2         
	//  258  438:iadd            
	//  259  439:putfield        #119 <Field int _charCount>
		return i;
	//  260  442:iload_2         
	//  261  443:ireturn         
	}

	protected static final int LAST_VALID_UNICODE_CHAR = 0x10ffff;
	protected static final char NC = 0;
	protected final boolean _bigEndian;
	protected byte _buffer[];
	protected int _byteCount;
	protected int _charCount;
	protected final IOContext _context;
	protected InputStream _in;
	protected int _length;
	protected final boolean _managedBuffers;
	protected int _ptr;
	protected char _surrogate;
	protected char _tmpBuf[];
}
