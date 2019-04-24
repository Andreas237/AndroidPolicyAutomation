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
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		super();
	//    2    3:aload_0         
	//    3    4:invokespecial   #31  <Method void Reader()>
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
	//*  10   16:ifle            116
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
	//*  29   53:aload_0         
	//*  30   54:getfield        #43  <Field int _length>
	//*  31   57:iconst_4        
	//*  32   58:icmpge          213
	//*  33   61:aload_0         
	//*  34   62:getfield        #37  <Field InputStream _in>
	//*  35   65:ifnonnull       184
	//*  36   68:iconst_m1       
	//*  37   69:istore_1        
	//*  38   70:iload_1         
	//*  39   71:iconst_1        
	//*  40   72:icmpge          103
	//*  41   75:iload_1         
	//*  42   76:ifge            99
	//*  43   79:aload_0         
	//*  44   80:getfield        #47  <Field boolean _managedBuffers>
	//*  45   83:ifeq            90
	//*  46   86:aload_0         
	//*  47   87:invokespecial   #69  <Method void freeBuffers()>
	//*  48   90:aload_0         
	//*  49   91:aload_0         
	//*  50   92:getfield        #43  <Field int _length>
	//*  51   95:iconst_4        
	//*  52   96:invokespecial   #73  <Method void reportUnexpectedEOF(int, int)>
	//*  53   99:aload_0         
	//*  54  100:invokespecial   #76  <Method void reportStrangeStream()>
	//*  55  103:aload_0         
	//*  56  104:aload_0         
	//*  57  105:getfield        #43  <Field int _length>
	//*  58  108:iload_1         
	//*  59  109:iadd            
	//*  60  110:putfield        #43  <Field int _length>
	//*  61  113:goto            53
		{
			_ptr = 0;
	//   62  116:aload_0         
	//   63  117:iconst_0        
	//   64  118:putfield        #41  <Field int _ptr>
			if(_in == null)
	//*  65  121:aload_0         
	//*  66  122:getfield        #37  <Field InputStream _in>
	//*  67  125:ifnonnull       157
				i = -1;
	//   68  128:iconst_m1       
	//   69  129:istore_1        
			else
	//*  70  130:iload_1         
	//*  71  131:iconst_1        
	//*  72  132:icmpge          176
	//*  73  135:aload_0         
	//*  74  136:iconst_0        
	//*  75  137:putfield        #43  <Field int _length>
	//*  76  140:iload_1         
	//*  77  141:ifge            172
	//*  78  144:aload_0         
	//*  79  145:getfield        #47  <Field boolean _managedBuffers>
	//*  80  148:ifeq            155
	//*  81  151:aload_0         
	//*  82  152:invokespecial   #69  <Method void freeBuffers()>
	//*  83  155:iconst_0        
	//*  84  156:ireturn         
				i = _in.read(_buffer);
	//   85  157:aload_0         
	//   86  158:getfield        #37  <Field InputStream _in>
	//   87  161:aload_0         
	//   88  162:getfield        #39  <Field byte[] _buffer>
	//   89  165:invokevirtual   #82  <Method int InputStream.read(byte[])>
	//   90  168:istore_1        
			if(i < 1)
			{
				_length = 0;
				if(i < 0)
				{
					if(_managedBuffers)
						freeBuffers();
					return false;
				}
	//*  91  169:goto            130
				reportStrangeStream();
	//   92  172:aload_0         
	//   93  173:invokespecial   #76  <Method void reportStrangeStream()>
			}
			_length = i;
	//   94  176:aload_0         
	//   95  177:iload_1         
	//   96  178:putfield        #43  <Field int _length>
		}
		while(_length < 4) 
		{
			if(_in == null)
				i = -1;
			else
	//*  97  181:goto            53
				i = _in.read(_buffer, _length, _buffer.length - _length);
	//   98  184:aload_0         
	//   99  185:getfield        #37  <Field InputStream _in>
	//  100  188:aload_0         
	//  101  189:getfield        #39  <Field byte[] _buffer>
	//  102  192:aload_0         
	//  103  193:getfield        #43  <Field int _length>
	//  104  196:aload_0         
	//  105  197:getfield        #39  <Field byte[] _buffer>
	//  106  200:arraylength     
	//  107  201:aload_0         
	//  108  202:getfield        #43  <Field int _length>
	//  109  205:isub            
	//  110  206:invokevirtual   #85  <Method int InputStream.read(byte[], int, int)>
	//  111  209:istore_1        
			if(i < 1)
			{
				if(i < 0)
				{
					if(_managedBuffers)
						freeBuffers();
					reportUnexpectedEOF(_length, 4);
				}
				reportStrangeStream();
			}
			_length = _length + i;
		}
	//* 112  210:goto            70
		return true;
	//  113  213:iconst_1        
	//  114  214:ireturn         
	}

	private void reportBounds(char ac[], int i, int j)
		throws IOException
	{
		throw new ArrayIndexOutOfBoundsException((new StringBuilder()).append("read(buf,").append(i).append(",").append(j).append("), cbuf[").append(ac.length).append("]").toString());
	//    0    0:new             #90  <Class ArrayIndexOutOfBoundsException>
	//    1    3:dup             
	//    2    4:new             #92  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #93  <Method void StringBuilder()>
	//    5   11:ldc1            #95  <String "read(buf,">
	//    6   13:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:iload_2         
	//    8   17:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
	//    9   20:ldc1            #104 <String ",">
	//   10   22:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:iload_3         
	//   12   26:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
	//   13   29:ldc1            #106 <String "), cbuf[">
	//   14   31:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   15   34:aload_1         
	//   16   35:arraylength     
	//   17   36:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
	//   18   39:ldc1            #108 <String "]">
	//   19   41:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   20   44:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   21   47:invokespecial   #115 <Method void ArrayIndexOutOfBoundsException(String)>
	//   22   50:athrow          
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
		throw new CharConversionException((new StringBuilder()).append("Invalid UTF-32 character 0x").append(Integer.toHexString(i)).append(s).append(" at char #").append(i1 + j).append(", byte #").append((k + l) - 1).append(")").toString());
	//    9   18:new             #121 <Class CharConversionException>
	//   10   21:dup             
	//   11   22:new             #92  <Class StringBuilder>
	//   12   25:dup             
	//   13   26:invokespecial   #93  <Method void StringBuilder()>
	//   14   29:ldc1            #123 <String "Invalid UTF-32 character 0x">
	//   15   31:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:iload_1         
	//   17   35:invokestatic    #129 <Method String Integer.toHexString(int)>
	//   18   38:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   19   41:aload_3         
	//   20   42:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   21   45:ldc1            #131 <String " at char #">
	//   22   47:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   23   50:iload           6
	//   24   52:iload_2         
	//   25   53:iadd            
	//   26   54:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
	//   27   57:ldc1            #133 <String ", byte #">
	//   28   59:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   29   62:iload           4
	//   30   64:iload           5
	//   31   66:iadd            
	//   32   67:iconst_1        
	//   33   68:isub            
	//   34   69:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
	//   35   72:ldc1            #135 <String ")">
	//   36   74:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   37   77:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   38   80:invokespecial   #136 <Method void CharConversionException(String)>
	//   39   83:athrow          
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
		throw new CharConversionException((new StringBuilder()).append("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ").append(i).append(", needed ").append(j).append(", at char #").append(l).append(", byte #").append(k + i).append(")").toString());
	//    6   11:new             #121 <Class CharConversionException>
	//    7   14:dup             
	//    8   15:new             #92  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #93  <Method void StringBuilder()>
	//   11   22:ldc1            #141 <String "Unexpected EOF in the middle of a 4-byte UTF-32 char: got ">
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:iload_1         
	//   14   28:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
	//   15   31:ldc1            #143 <String ", needed ">
	//   16   33:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   17   36:iload_2         
	//   18   37:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
	//   19   40:ldc1            #145 <String ", at char #">
	//   20   42:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   21   45:iload           4
	//   22   47:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
	//   23   50:ldc1            #133 <String ", byte #">
	//   24   52:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   55:iload_3         
	//   26   56:iload_1         
	//   27   57:iadd            
	//   28   58:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
	//   29   61:ldc1            #135 <String ")">
	//   30   63:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   31   66:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   32   69:invokespecial   #136 <Method void CharConversionException(String)>
	//   33   72:athrow          
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
	//    9   15:invokespecial   #69  <Method void freeBuffers()>
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
		if(_buffer != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field byte[] _buffer>
	//    2    4:ifnonnull       9
_L1:
		return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
_L2:
		int j1;
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
		j1 = j + i;
	//   23   35:iload_3         
	//   24   36:iload_2         
	//   25   37:iadd            
	//   26   38:istore          7
		if(_surrogate == 0) goto _L4; else goto _L3
	//   27   40:aload_0         
	//   28   41:getfield        #33  <Field char _surrogate>
	//   29   44:ifeq            278
_L3:
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
_L12:
		if(j >= j1) goto _L6; else goto _L5
	//   42   63:iload_3         
	//   43   64:iload           7
	//   44   66:icmpge          404
_L5:
		int k;
		int l;
		k = _ptr;
	//   45   69:aload_0         
	//   46   70:getfield        #41  <Field int _ptr>
	//   47   73:istore          4
		int i1;
		if(_bigEndian)
	//*  48   75:aload_0         
	//*  49   76:getfield        #45  <Field boolean _bigEndian>
	//*  50   79:ifeq            306
			k = _buffer[k] << 24 | (_buffer[k + 1] & 0xff) << 16 | (_buffer[k + 2] & 0xff) << 8 | _buffer[k + 3] & 0xff;
	//   51   82:aload_0         
	//   52   83:getfield        #39  <Field byte[] _buffer>
	//   53   86:iload           4
	//   54   88:baload          
	//   55   89:bipush          24
	//   56   91:ishl            
	//   57   92:aload_0         
	//   58   93:getfield        #39  <Field byte[] _buffer>
	//   59   96:iload           4
	//   60   98:iconst_1        
	//   61   99:iadd            
	//   62  100:baload          
	//   63  101:sipush          255
	//   64  104:iand            
	//   65  105:bipush          16
	//   66  107:ishl            
	//   67  108:ior             
	//   68  109:aload_0         
	//   69  110:getfield        #39  <Field byte[] _buffer>
	//   70  113:iload           4
	//   71  115:iconst_2        
	//   72  116:iadd            
	//   73  117:baload          
	//   74  118:sipush          255
	//   75  121:iand            
	//   76  122:bipush          8
	//   77  124:ishl            
	//   78  125:ior             
	//   79  126:aload_0         
	//   80  127:getfield        #39  <Field byte[] _buffer>
	//   81  130:iload           4
	//   82  132:iconst_3        
	//   83  133:iadd            
	//   84  134:baload          
	//   85  135:sipush          255
	//   86  138:iand            
	//   87  139:ior             
	//   88  140:istore          4
		else
	//*  89  142:aload_0         
	//*  90  143:aload_0         
	//*  91  144:getfield        #41  <Field int _ptr>
	//*  92  147:iconst_4        
	//*  93  148:iadd            
	//*  94  149:putfield        #41  <Field int _ptr>
	//*  95  152:iload           4
	//*  96  154:ldc1            #157 <Int 65535>
	//*  97  156:icmple          369
	//*  98  159:iload           4
	//*  99  161:ldc1            #7   <Int 0x10ffff>
	//* 100  163:icmple          203
	//* 101  166:aload_0         
	//* 102  167:iload           4
	//* 103  169:iload_3         
	//* 104  170:iload_2         
	//* 105  171:isub            
	//* 106  172:new             #92  <Class StringBuilder>
	//* 107  175:dup             
	//* 108  176:invokespecial   #93  <Method void StringBuilder()>
	//* 109  179:ldc1            #159 <String "(above ">
	//* 110  181:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 111  184:ldc1            #7   <Int 0x10ffff>
	//* 112  186:invokestatic    #129 <Method String Integer.toHexString(int)>
	//* 113  189:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 114  192:ldc1            #161 <String ") ">
	//* 115  194:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 116  197:invokevirtual   #112 <Method String StringBuilder.toString()>
	//* 117  200:invokespecial   #163 <Method void reportInvalid(int, int, String)>
	//* 118  203:iload           4
	//* 119  205:ldc1            #164 <Int 0x10000>
	//* 120  207:isub            
	//* 121  208:istore          5
	//* 122  210:iload_3         
	//* 123  211:iconst_1        
	//* 124  212:iadd            
	//* 125  213:istore          4
	//* 126  215:aload_1         
	//* 127  216:iload_3         
	//* 128  217:ldc1            #165 <Int 55296>
	//* 129  219:iload           5
	//* 130  221:bipush          10
	//* 131  223:ishr            
	//* 132  224:iadd            
	//* 133  225:int2char        
	//* 134  226:castore         
	//* 135  227:ldc1            #166 <Int 56320>
	//* 136  229:iload           5
	//* 137  231:sipush          1023
	//* 138  234:iand            
	//* 139  235:ior             
	//* 140  236:istore          6
	//* 141  238:iload           6
	//* 142  240:istore          5
	//* 143  242:iload           4
	//* 144  244:istore_3        
	//* 145  245:iload           4
	//* 146  247:iload           7
	//* 147  249:icmplt          373
	//* 148  252:aload_0         
	//* 149  253:iload           6
	//* 150  255:int2char        
	//* 151  256:putfield        #33  <Field char _surrogate>
	//* 152  259:iload           4
	//* 153  261:istore_3        
	//* 154  262:iload_3         
	//* 155  263:iload_2         
	//* 156  264:isub            
	//* 157  265:istore_2        
	//* 158  266:aload_0         
	//* 159  267:aload_0         
	//* 160  268:getfield        #119 <Field int _charCount>
	//* 161  271:iload_2         
	//* 162  272:iadd            
	//* 163  273:putfield        #119 <Field int _charCount>
	//* 164  276:iload_2         
	//* 165  277:ireturn         
	//* 166  278:aload_0         
	//* 167  279:getfield        #43  <Field int _length>
	//* 168  282:aload_0         
	//* 169  283:getfield        #41  <Field int _ptr>
	//* 170  286:isub            
	//* 171  287:istore_3        
	//* 172  288:iload_3         
	//* 173  289:iconst_4        
	//* 174  290:icmpge          301
	//* 175  293:aload_0         
	//* 176  294:iload_3         
	//* 177  295:invokespecial   #168 <Method boolean loadMore(int)>
	//* 178  298:ifeq            7
	//* 179  301:iload_2         
	//* 180  302:istore_3        
	//* 181  303:goto            63
			k = _buffer[k] & 0xff | (_buffer[k + 1] & 0xff) << 8 | (_buffer[k + 2] & 0xff) << 16 | _buffer[k + 3] << 24;
	//  182  306:aload_0         
	//  183  307:getfield        #39  <Field byte[] _buffer>
	//  184  310:iload           4
	//  185  312:baload          
	//  186  313:sipush          255
	//  187  316:iand            
	//  188  317:aload_0         
	//  189  318:getfield        #39  <Field byte[] _buffer>
	//  190  321:iload           4
	//  191  323:iconst_1        
	//  192  324:iadd            
	//  193  325:baload          
	//  194  326:sipush          255
	//  195  329:iand            
	//  196  330:bipush          8
	//  197  332:ishl            
	//  198  333:ior             
	//  199  334:aload_0         
	//  200  335:getfield        #39  <Field byte[] _buffer>
	//  201  338:iload           4
	//  202  340:iconst_2        
	//  203  341:iadd            
	//  204  342:baload          
	//  205  343:sipush          255
	//  206  346:iand            
	//  207  347:bipush          16
	//  208  349:ishl            
	//  209  350:ior             
	//  210  351:aload_0         
	//  211  352:getfield        #39  <Field byte[] _buffer>
	//  212  355:iload           4
	//  213  357:iconst_3        
	//  214  358:iadd            
	//  215  359:baload          
	//  216  360:bipush          24
	//  217  362:ishl            
	//  218  363:ior             
	//  219  364:istore          4
		_ptr = _ptr + 4;
		if(k <= 65535) goto _L8; else goto _L7
_L7:
		if(k > 0x10ffff)
			reportInvalid(k, j - i, (new StringBuilder()).append("(above ").append(Integer.toHexString(0x10ffff)).append(") ").toString());
		l = k - 0x10000;
		k = j + 1;
		ac[j] = (char)(55296 + (l >> 10));
		i1 = 0xdc00 | l & 0x3ff;
		l = i1;
		j = k;
		if(k < j1) goto _L10; else goto _L9
_L9:
		_surrogate = (char)i1;
		j = k;
_L6:
		i = j - i;
		_charCount = _charCount + i;
		return i;
_L4:
		j = _length - _ptr;
		if(j < 4 && !loadMore(j)) goto _L1; else goto _L11
_L11:
		j = i;
		  goto _L12
	//* 220  366:goto            142
_L8:
		l = k;
	//  221  369:iload           4
	//  222  371:istore          5
_L10:
		k = j + 1;
	//  223  373:iload_3         
	//  224  374:iconst_1        
	//  225  375:iadd            
	//  226  376:istore          4
		ac[j] = (char)l;
	//  227  378:aload_1         
	//  228  379:iload_3         
	//  229  380:iload           5
	//  230  382:int2char        
	//  231  383:castore         
		j = k;
	//  232  384:iload           4
	//  233  386:istore_3        
		if(_ptr < _length) goto _L12; else goto _L13
	//  234  387:aload_0         
	//  235  388:getfield        #41  <Field int _ptr>
	//  236  391:aload_0         
	//  237  392:getfield        #43  <Field int _length>
	//  238  395:icmplt          63
_L13:
		j = k;
	//  239  398:iload           4
	//  240  400:istore_3        
		  goto _L6
	//* 241  401:goto            262
	//* 242  404:goto            262
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
