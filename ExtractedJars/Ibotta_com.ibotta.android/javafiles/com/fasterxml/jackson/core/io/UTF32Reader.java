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
	//    1    1:invokespecial   #27  <Method void Reader()>
		boolean flag1 = false;
	//    2    4:iconst_0        
	//    3    5:istore          7
		_surrogate = '\0';
	//    4    7:aload_0         
	//    5    8:iconst_0        
	//    6    9:putfield        #29  <Field char _surrogate>
		_context = iocontext;
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:putfield        #31  <Field IOContext _context>
		_in = inputstream;
	//   10   17:aload_0         
	//   11   18:aload_2         
	//   12   19:putfield        #33  <Field InputStream _in>
		_buffer = abyte0;
	//   13   22:aload_0         
	//   14   23:aload_3         
	//   15   24:putfield        #35  <Field byte[] _buffer>
		_ptr = i;
	//   16   27:aload_0         
	//   17   28:iload           4
	//   18   30:putfield        #37  <Field int _ptr>
		_length = j;
	//   19   33:aload_0         
	//   20   34:iload           5
	//   21   36:putfield        #39  <Field int _length>
		_bigEndian = flag;
	//   22   39:aload_0         
	//   23   40:iload           6
	//   24   42:putfield        #41  <Field boolean _bigEndian>
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
	//   33   59:putfield        #43  <Field boolean _managedBuffers>
	//   34   62:return          
	}

	private void freeBuffers()
	{
		byte abyte0[] = _buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field byte[] _buffer>
	//    2    4:astore_1        
		if(abyte0 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          22
		{
			_buffer = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #35  <Field byte[] _buffer>
			_context.releaseReadIOBuffer(abyte0);
	//    8   14:aload_0         
	//    9   15:getfield        #31  <Field IOContext _context>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #51  <Method void IOContext.releaseReadIOBuffer(byte[])>
		}
	//   12   22:return          
	}

	private boolean loadMore(int i)
		throws IOException
	{
		_byteCount = _byteCount + (_length - i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #57  <Field int _byteCount>
	//    3    5:aload_0         
	//    4    6:getfield        #39  <Field int _length>
	//    5    9:iload_1         
	//    6   10:isub            
	//    7   11:iadd            
	//    8   12:putfield        #57  <Field int _byteCount>
		if(i > 0)
	//*   9   15:iload_1         
	//*  10   16:ifle            54
		{
			int j = _ptr;
	//   11   19:aload_0         
	//   12   20:getfield        #37  <Field int _ptr>
	//   13   23:istore_2        
			if(j > 0)
	//*  14   24:iload_2         
	//*  15   25:ifle            46
			{
				byte abyte0[] = _buffer;
	//   16   28:aload_0         
	//   17   29:getfield        #35  <Field byte[] _buffer>
	//   18   32:astore_3        
				System.arraycopy(((Object) (abyte0)), j, ((Object) (abyte0)), 0, i);
	//   19   33:aload_3         
	//   20   34:iload_2         
	//   21   35:aload_3         
	//   22   36:iconst_0        
	//   23   37:iload_1         
	//   24   38:invokestatic    #63  <Method void System.arraycopy(Object, int, Object, int, int)>
				_ptr = 0;
	//   25   41:aload_0         
	//   26   42:iconst_0        
	//   27   43:putfield        #37  <Field int _ptr>
			}
			_length = i;
	//   28   46:aload_0         
	//   29   47:iload_1         
	//   30   48:putfield        #39  <Field int _length>
		} else
	//*  31   51:goto            118
		{
			_ptr = 0;
	//   32   54:aload_0         
	//   33   55:iconst_0        
	//   34   56:putfield        #37  <Field int _ptr>
			InputStream inputstream = _in;
	//   35   59:aload_0         
	//   36   60:getfield        #33  <Field InputStream _in>
	//   37   63:astore_3        
			if(inputstream == null)
	//*  38   64:aload_3         
	//*  39   65:ifnonnull       73
				i = -1;
	//   40   68:iconst_m1       
	//   41   69:istore_1        
			else
	//*  42   70:goto            82
				i = inputstream.read(_buffer);
	//   43   73:aload_3         
	//   44   74:aload_0         
	//   45   75:getfield        #35  <Field byte[] _buffer>
	//   46   78:invokevirtual   #69  <Method int InputStream.read(byte[])>
	//   47   81:istore_1        
			if(i < 1)
	//*  48   82:iload_1         
	//*  49   83:iconst_1        
	//*  50   84:icmpge          113
			{
				_length = 0;
	//   51   87:aload_0         
	//   52   88:iconst_0        
	//   53   89:putfield        #39  <Field int _length>
				if(i < 0)
	//*  54   92:iload_1         
	//*  55   93:ifge            109
				{
					if(_managedBuffers)
	//*  56   96:aload_0         
	//*  57   97:getfield        #43  <Field boolean _managedBuffers>
	//*  58  100:ifeq            107
						freeBuffers();
	//   59  103:aload_0         
	//   60  104:invokespecial   #71  <Method void freeBuffers()>
					return false;
	//   61  107:iconst_0        
	//   62  108:ireturn         
				}
				reportStrangeStream();
	//   63  109:aload_0         
	//   64  110:invokespecial   #74  <Method void reportStrangeStream()>
			}
			_length = i;
	//   65  113:aload_0         
	//   66  114:iload_1         
	//   67  115:putfield        #39  <Field int _length>
		}
		do
		{
			i = _length;
	//   68  118:aload_0         
	//   69  119:getfield        #39  <Field int _length>
	//   70  122:istore_1        
			if(i < 4)
	//*  71  123:iload_1         
	//*  72  124:iconst_4        
	//*  73  125:icmpge          207
			{
				InputStream inputstream1 = _in;
	//   74  128:aload_0         
	//   75  129:getfield        #33  <Field InputStream _in>
	//   76  132:astore_3        
				if(inputstream1 == null)
	//*  77  133:aload_3         
	//*  78  134:ifnonnull       142
				{
					i = -1;
	//   79  137:iconst_m1       
	//   80  138:istore_1        
				} else
	//*  81  139:goto            161
				{
					byte abyte1[] = _buffer;
	//   82  142:aload_0         
	//   83  143:getfield        #35  <Field byte[] _buffer>
	//   84  146:astore          4
					i = inputstream1.read(abyte1, i, abyte1.length - i);
	//   85  148:aload_3         
	//   86  149:aload           4
	//   87  151:iload_1         
	//   88  152:aload           4
	//   89  154:arraylength     
	//   90  155:iload_1         
	//   91  156:isub            
	//   92  157:invokevirtual   #77  <Method int InputStream.read(byte[], int, int)>
	//   93  160:istore_1        
				}
				if(i < 1)
	//*  94  161:iload_1         
	//*  95  162:iconst_1        
	//*  96  163:icmpge          194
				{
					if(i < 0)
	//*  97  166:iload_1         
	//*  98  167:ifge            190
					{
						if(_managedBuffers)
	//*  99  170:aload_0         
	//* 100  171:getfield        #43  <Field boolean _managedBuffers>
	//* 101  174:ifeq            181
							freeBuffers();
	//  102  177:aload_0         
	//  103  178:invokespecial   #71  <Method void freeBuffers()>
						reportUnexpectedEOF(_length, 4);
	//  104  181:aload_0         
	//  105  182:aload_0         
	//  106  183:getfield        #39  <Field int _length>
	//  107  186:iconst_4        
	//  108  187:invokespecial   #81  <Method void reportUnexpectedEOF(int, int)>
					}
					reportStrangeStream();
	//  109  190:aload_0         
	//  110  191:invokespecial   #74  <Method void reportStrangeStream()>
				}
				_length = _length + i;
	//  111  194:aload_0         
	//  112  195:aload_0         
	//  113  196:getfield        #39  <Field int _length>
	//  114  199:iload_1         
	//  115  200:iadd            
	//  116  201:putfield        #39  <Field int _length>
			} else
	//* 117  204:goto            118
			{
				return true;
	//  118  207:iconst_1        
	//  119  208:ireturn         
			}
		} while(true);
	}

	private void reportBounds(char ac[], int i, int j)
		throws IOException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #86  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append("read(buf,");
	//    4    9:aload           4
	//    5   11:ldc1            #89  <String "read(buf,">
	//    6   13:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(i);
	//    8   17:aload           4
	//    9   19:iload_2         
	//   10   20:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   11   23:pop             
		stringbuilder.append(",");
	//   12   24:aload           4
	//   13   26:ldc1            #98  <String ",">
	//   14   28:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		stringbuilder.append(j);
	//   16   32:aload           4
	//   17   34:iload_3         
	//   18   35:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   19   38:pop             
		stringbuilder.append("), cbuf[");
	//   20   39:aload           4
	//   21   41:ldc1            #100 <String "), cbuf[">
	//   22   43:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
		stringbuilder.append(ac.length);
	//   24   47:aload           4
	//   25   49:aload_1         
	//   26   50:arraylength     
	//   27   51:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   28   54:pop             
		stringbuilder.append("]");
	//   29   55:aload           4
	//   30   57:ldc1            #102 <String "]">
	//   31   59:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   32   62:pop             
		throw new ArrayIndexOutOfBoundsException(stringbuilder.toString());
	//   33   63:new             #104 <Class ArrayIndexOutOfBoundsException>
	//   34   66:dup             
	//   35   67:aload           4
	//   36   69:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   37   72:invokespecial   #111 <Method void ArrayIndexOutOfBoundsException(String)>
	//   38   75:athrow          
	}

	private void reportInvalid(int i, int j, String s)
		throws IOException
	{
		int k = _byteCount;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int _byteCount>
	//    2    4:istore          4
		int l = _ptr;
	//    3    6:aload_0         
	//    4    7:getfield        #37  <Field int _ptr>
	//    5   10:istore          5
		int i1 = _charCount;
	//    6   12:aload_0         
	//    7   13:getfield        #115 <Field int _charCount>
	//    8   16:istore          6
		StringBuilder stringbuilder = new StringBuilder();
	//    9   18:new             #86  <Class StringBuilder>
	//   10   21:dup             
	//   11   22:invokespecial   #87  <Method void StringBuilder()>
	//   12   25:astore          7
		stringbuilder.append("Invalid UTF-32 character 0x");
	//   13   27:aload           7
	//   14   29:ldc1            #117 <String "Invalid UTF-32 character 0x">
	//   15   31:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
		stringbuilder.append(Integer.toHexString(i));
	//   17   35:aload           7
	//   18   37:iload_1         
	//   19   38:invokestatic    #123 <Method String Integer.toHexString(int)>
	//   20   41:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
		stringbuilder.append(s);
	//   22   45:aload           7
	//   23   47:aload_3         
	//   24   48:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		stringbuilder.append(" at char #");
	//   26   52:aload           7
	//   27   54:ldc1            #125 <String " at char #">
	//   28   56:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   29   59:pop             
		stringbuilder.append(i1 + j);
	//   30   60:aload           7
	//   31   62:iload           6
	//   32   64:iload_2         
	//   33   65:iadd            
	//   34   66:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   35   69:pop             
		stringbuilder.append(", byte #");
	//   36   70:aload           7
	//   37   72:ldc1            #127 <String ", byte #">
	//   38   74:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   39   77:pop             
		stringbuilder.append((k + l) - 1);
	//   40   78:aload           7
	//   41   80:iload           4
	//   42   82:iload           5
	//   43   84:iadd            
	//   44   85:iconst_1        
	//   45   86:isub            
	//   46   87:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   47   90:pop             
		stringbuilder.append(")");
	//   48   91:aload           7
	//   49   93:ldc1            #129 <String ")">
	//   50   95:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   51   98:pop             
		throw new CharConversionException(stringbuilder.toString());
	//   52   99:new             #131 <Class CharConversionException>
	//   53  102:dup             
	//   54  103:aload           7
	//   55  105:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   56  108:invokespecial   #132 <Method void CharConversionException(String)>
	//   57  111:athrow          
	}

	private void reportStrangeStream()
		throws IOException
	{
		throw new IOException("Strange I/O stream, returned 0 bytes on read");
	//    0    0:new             #55  <Class IOException>
	//    1    3:dup             
	//    2    4:ldc1            #134 <String "Strange I/O stream, returned 0 bytes on read">
	//    3    6:invokespecial   #135 <Method void IOException(String)>
	//    4    9:athrow          
	}

	private void reportUnexpectedEOF(int i, int j)
		throws IOException
	{
		int k = _byteCount;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int _byteCount>
	//    2    4:istore_3        
		int l = _charCount;
	//    3    5:aload_0         
	//    4    6:getfield        #115 <Field int _charCount>
	//    5    9:istore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    6   11:new             #86  <Class StringBuilder>
	//    7   14:dup             
	//    8   15:invokespecial   #87  <Method void StringBuilder()>
	//    9   18:astore          5
		stringbuilder.append("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ");
	//   10   20:aload           5
	//   11   22:ldc1            #137 <String "Unexpected EOF in the middle of a 4-byte UTF-32 char: got ">
	//   12   24:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		stringbuilder.append(i);
	//   14   28:aload           5
	//   15   30:iload_1         
	//   16   31:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   17   34:pop             
		stringbuilder.append(", needed ");
	//   18   35:aload           5
	//   19   37:ldc1            #139 <String ", needed ">
	//   20   39:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
		stringbuilder.append(j);
	//   22   43:aload           5
	//   23   45:iload_2         
	//   24   46:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   25   49:pop             
		stringbuilder.append(", at char #");
	//   26   50:aload           5
	//   27   52:ldc1            #141 <String ", at char #">
	//   28   54:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
		stringbuilder.append(l);
	//   30   58:aload           5
	//   31   60:iload           4
	//   32   62:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   33   65:pop             
		stringbuilder.append(", byte #");
	//   34   66:aload           5
	//   35   68:ldc1            #127 <String ", byte #">
	//   36   70:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   37   73:pop             
		stringbuilder.append(k + i);
	//   38   74:aload           5
	//   39   76:iload_3         
	//   40   77:iload_1         
	//   41   78:iadd            
	//   42   79:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   43   82:pop             
		stringbuilder.append(")");
	//   44   83:aload           5
	//   45   85:ldc1            #129 <String ")">
	//   46   87:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   47   90:pop             
		throw new CharConversionException(stringbuilder.toString());
	//   48   91:new             #131 <Class CharConversionException>
	//   49   94:dup             
	//   50   95:aload           5
	//   51   97:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   52  100:invokespecial   #132 <Method void CharConversionException(String)>
	//   53  103:athrow          
	}

	public void close()
		throws IOException
	{
		InputStream inputstream = _in;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field InputStream _in>
	//    2    4:astore_1        
		if(inputstream != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          22
		{
			_in = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #33  <Field InputStream _in>
			freeBuffers();
	//    8   14:aload_0         
	//    9   15:invokespecial   #71  <Method void freeBuffers()>
			inputstream.close();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #144 <Method void InputStream.close()>
		}
	//   12   22:return          
	}

	public int read()
		throws IOException
	{
		if(_tmpBuf == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #147 <Field char[] _tmpBuf>
	//*   2    4:ifnonnull       14
			_tmpBuf = new char[1];
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:newarray        char[]
	//    6   11:putfield        #147 <Field char[] _tmpBuf>
		if(read(_tmpBuf, 0, 1) < 1)
	//*   7   14:aload_0         
	//*   8   15:aload_0         
	//*   9   16:getfield        #147 <Field char[] _tmpBuf>
	//*  10   19:iconst_0        
	//*  11   20:iconst_1        
	//*  12   21:invokevirtual   #150 <Method int read(char[], int, int)>
	//*  13   24:iconst_1        
	//*  14   25:icmpge          30
			return -1;
	//   15   28:iconst_m1       
	//   16   29:ireturn         
		else
			return ((int) (_tmpBuf[0]));
	//   17   30:aload_0         
	//   18   31:getfield        #147 <Field char[] _tmpBuf>
	//   19   34:iconst_0        
	//   20   35:caload          
	//   21   36:ireturn         
	}

	public int read(char ac[], int i, int j)
		throws IOException
	{
		if(_buffer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field byte[] _buffer>
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
	//   22   32:invokespecial   #152 <Method void reportBounds(char[], int, int)>
		int k1 = j + i;
	//   23   35:iload_3         
	//   24   36:iload_2         
	//   25   37:iadd            
	//   26   38:istore          9
		char c = _surrogate;
	//   27   40:aload_0         
	//   28   41:getfield        #29  <Field char _surrogate>
	//   29   44:istore          4
		if(c != 0)
	//*  30   46:iload           4
	//*  31   48:ifeq            68
		{
			j = i + 1;
	//   32   51:iload_2         
	//   33   52:iconst_1        
	//   34   53:iadd            
	//   35   54:istore_3        
			ac[i] = c;
	//   36   55:aload_1         
	//   37   56:iload_2         
	//   38   57:iload           4
	//   39   59:castore         
			_surrogate = '\0';
	//   40   60:aload_0         
	//   41   61:iconst_0        
	//   42   62:putfield        #29  <Field char _surrogate>
		} else
	//*  43   65:goto            113
		{
			j = _length - _ptr;
	//   44   68:aload_0         
	//   45   69:getfield        #39  <Field int _length>
	//   46   72:aload_0         
	//   47   73:getfield        #37  <Field int _ptr>
	//   48   76:isub            
	//   49   77:istore_3        
			if(j < 4 && !loadMore(j))
	//*  50   78:iload_3         
	//*  51   79:iconst_4        
	//*  52   80:icmpge          111
	//*  53   83:aload_0         
	//*  54   84:iload_3         
	//*  55   85:invokespecial   #154 <Method boolean loadMore(int)>
	//*  56   88:ifne            111
			{
				if(j == 0)
	//*  57   91:iload_3         
	//*  58   92:ifne            97
					return -1;
	//   59   95:iconst_m1       
	//   60   96:ireturn         
				reportUnexpectedEOF(_length - _ptr, 4);
	//   61   97:aload_0         
	//   62   98:aload_0         
	//   63   99:getfield        #39  <Field int _length>
	//   64  102:aload_0         
	//   65  103:getfield        #37  <Field int _ptr>
	//   66  106:isub            
	//   67  107:iconst_4        
	//   68  108:invokespecial   #81  <Method void reportUnexpectedEOF(int, int)>
			}
			j = i;
	//   69  111:iload_2         
	//   70  112:istore_3        
		}
		int l1 = _length;
	//   71  113:aload_0         
	//   72  114:getfield        #39  <Field int _length>
	//   73  117:istore          10
		do
		{
			if(j >= k1)
				break;
	//   74  119:iload_3         
	//   75  120:iload           9
	//   76  122:icmpge          424
			int l = _ptr;
	//   77  125:aload_0         
	//   78  126:getfield        #37  <Field int _ptr>
	//   79  129:istore          6
			int k;
			int i1;
			if(_bigEndian)
	//*  80  131:aload_0         
	//*  81  132:getfield        #41  <Field boolean _bigEndian>
	//*  82  135:ifeq            209
			{
				byte abyte0[] = _buffer;
	//   83  138:aload_0         
	//   84  139:getfield        #35  <Field byte[] _buffer>
	//   85  142:astore          11
				i1 = ((int) (abyte0[l]));
	//   86  144:aload           11
	//   87  146:iload           6
	//   88  148:baload          
	//   89  149:istore          7
				byte byte0 = abyte0[l + 1];
	//   90  151:aload           11
	//   91  153:iload           6
	//   92  155:iconst_1        
	//   93  156:iadd            
	//   94  157:baload          
	//   95  158:istore          8
				k = ((int) (abyte0[l + 2]));
	//   96  160:aload           11
	//   97  162:iload           6
	//   98  164:iconst_2        
	//   99  165:iadd            
	//  100  166:baload          
	//  101  167:istore          5
				k = abyte0[l + 3] & 0xff | (k & 0xff) << 8;
	//  102  169:aload           11
	//  103  171:iload           6
	//  104  173:iconst_3        
	//  105  174:iadd            
	//  106  175:baload          
	//  107  176:sipush          255
	//  108  179:iand            
	//  109  180:iload           5
	//  110  182:sipush          255
	//  111  185:iand            
	//  112  186:bipush          8
	//  113  188:ishl            
	//  114  189:ior             
	//  115  190:istore          5
				i1 = i1 << 8 | byte0 & 0xff;
	//  116  192:iload           7
	//  117  194:bipush          8
	//  118  196:ishl            
	//  119  197:iload           8
	//  120  199:sipush          255
	//  121  202:iand            
	//  122  203:ior             
	//  123  204:istore          7
			} else
	//* 124  206:goto            269
			{
				byte abyte1[] = _buffer;
	//  125  209:aload_0         
	//  126  210:getfield        #35  <Field byte[] _buffer>
	//  127  213:astore          11
				k = abyte1[l] & 0xff | (abyte1[l + 1] & 0xff) << 8;
	//  128  215:aload           11
	//  129  217:iload           6
	//  130  219:baload          
	//  131  220:sipush          255
	//  132  223:iand            
	//  133  224:aload           11
	//  134  226:iload           6
	//  135  228:iconst_1        
	//  136  229:iadd            
	//  137  230:baload          
	//  138  231:sipush          255
	//  139  234:iand            
	//  140  235:bipush          8
	//  141  237:ishl            
	//  142  238:ior             
	//  143  239:istore          5
				i1 = ((int) (abyte1[l + 2]));
	//  144  241:aload           11
	//  145  243:iload           6
	//  146  245:iconst_2        
	//  147  246:iadd            
	//  148  247:baload          
	//  149  248:istore          7
				i1 = abyte1[l + 3] << 8 | i1 & 0xff;
	//  150  250:aload           11
	//  151  252:iload           6
	//  152  254:iconst_3        
	//  153  255:iadd            
	//  154  256:baload          
	//  155  257:bipush          8
	//  156  259:ishl            
	//  157  260:iload           7
	//  158  262:sipush          255
	//  159  265:iand            
	//  160  266:ior             
	//  161  267:istore          7
			}
			_ptr = _ptr + 4;
	//  162  269:aload_0         
	//  163  270:aload_0         
	//  164  271:getfield        #37  <Field int _ptr>
	//  165  274:iconst_4        
	//  166  275:iadd            
	//  167  276:putfield        #37  <Field int _ptr>
			int j1 = j;
	//  168  279:iload_3         
	//  169  280:istore          8
			l = k;
	//  170  282:iload           5
	//  171  284:istore          6
			if(i1 != 0)
	//* 172  286:iload           7
	//* 173  288:ifeq            395
			{
				l = i1 & 0xffff;
	//  174  291:iload           7
	//  175  293:ldc1            #155 <Int 65535>
	//  176  295:iand            
	//  177  296:istore          6
				i1 = l - 1 << 16 | k;
	//  178  298:iload           6
	//  179  300:iconst_1        
	//  180  301:isub            
	//  181  302:bipush          16
	//  182  304:ishl            
	//  183  305:iload           5
	//  184  307:ior             
	//  185  308:istore          7
				if(l > 16)
	//* 186  310:iload           6
	//* 187  312:bipush          16
	//* 188  314:icmple          343
					reportInvalid(i1, j - i, String.format(" (above 0x%08x)", new Object[] {
						Integer.valueOf(0x10ffff)
					}));
	//  189  317:aload_0         
	//  190  318:iload           7
	//  191  320:iload_3         
	//  192  321:iload_2         
	//  193  322:isub            
	//  194  323:ldc1            #157 <String " (above 0x%08x)">
	//  195  325:iconst_1        
	//  196  326:anewarray       Object[]
	//  197  329:dup             
	//  198  330:iconst_0        
	//  199  331:ldc1            #160 <Int 0x10ffff>
	//  200  333:invokestatic    #164 <Method Integer Integer.valueOf(int)>
	//  201  336:aastore         
	//  202  337:invokestatic    #170 <Method String String.format(String, Object[])>
	//  203  340:invokespecial   #172 <Method void reportInvalid(int, int, String)>
				k = j + 1;
	//  204  343:iload_3         
	//  205  344:iconst_1        
	//  206  345:iadd            
	//  207  346:istore          5
				ac[j] = (char)((i1 >> 10) + 55296);
	//  208  348:aload_1         
	//  209  349:iload_3         
	//  210  350:iload           7
	//  211  352:bipush          10
	//  212  354:ishr            
	//  213  355:ldc1            #173 <Int 55296>
	//  214  357:iadd            
	//  215  358:int2char        
	//  216  359:castore         
				l = i1 & 0x3ff | 0xdc00;
	//  217  360:iload           7
	//  218  362:sipush          1023
	//  219  365:iand            
	//  220  366:ldc1            #174 <Int 56320>
	//  221  368:ior             
	//  222  369:istore          6
				if(k >= k1)
	//* 223  371:iload           5
	//* 224  373:iload           9
	//* 225  375:icmplt          391
				{
					_surrogate = (char)i1;
	//  226  378:aload_0         
	//  227  379:iload           7
	//  228  381:int2char        
	//  229  382:putfield        #29  <Field char _surrogate>
					j = k;
	//  230  385:iload           5
	//  231  387:istore_3        
					break;
	//  232  388:goto            424
				}
				j1 = k;
	//  233  391:iload           5
	//  234  393:istore          8
			}
			j = j1 + 1;
	//  235  395:iload           8
	//  236  397:iconst_1        
	//  237  398:iadd            
	//  238  399:istore_3        
			ac[j1] = (char)l;
	//  239  400:aload_1         
	//  240  401:iload           8
	//  241  403:iload           6
	//  242  405:int2char        
	//  243  406:castore         
		} while(_ptr <= l1 - 4);
	//  244  407:aload_0         
	//  245  408:getfield        #37  <Field int _ptr>
	//  246  411:iload           10
	//  247  413:iconst_4        
	//  248  414:isub            
	//  249  415:icmple          421
	//* 250  418:goto            424
	//* 251  421:goto            119
		i = j - i;
	//  252  424:iload_3         
	//  253  425:iload_2         
	//  254  426:isub            
	//  255  427:istore_2        
		_charCount = _charCount + i;
	//  256  428:aload_0         
	//  257  429:aload_0         
	//  258  430:getfield        #115 <Field int _charCount>
	//  259  433:iload_2         
	//  260  434:iadd            
	//  261  435:putfield        #115 <Field int _charCount>
		return i;
	//  262  438:iload_2         
	//  263  439:ireturn         
	}

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
