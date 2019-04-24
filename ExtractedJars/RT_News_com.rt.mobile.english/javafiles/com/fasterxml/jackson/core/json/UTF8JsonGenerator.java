// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.core.json:
//			JsonGeneratorImpl, JsonWriteContext

public class UTF8JsonGenerator extends JsonGeneratorImpl
{

	public UTF8JsonGenerator(IOContext iocontext, int i, ObjectCodec objectcodec, OutputStream outputstream)
	{
		super(iocontext, i, objectcodec);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #74  <Method void JsonGeneratorImpl(IOContext, int, ObjectCodec)>
		_quoteChar = 34;
	//    5    7:aload_0         
	//    6    8:bipush          34
	//    7   10:putfield        #76  <Field byte _quoteChar>
		_outputStream = outputstream;
	//    8   13:aload_0         
	//    9   14:aload           4
	//   10   16:putfield        #78  <Field OutputStream _outputStream>
		_bufferRecyclable = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #80  <Field boolean _bufferRecyclable>
		_outputBuffer = iocontext.allocWriteEncodingBuffer();
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #85  <Method byte[] IOContext.allocWriteEncodingBuffer()>
	//   17   29:putfield        #87  <Field byte[] _outputBuffer>
		_outputEnd = _outputBuffer.length;
	//   18   32:aload_0         
	//   19   33:aload_0         
	//   20   34:getfield        #87  <Field byte[] _outputBuffer>
	//   21   37:arraylength     
	//   22   38:putfield        #89  <Field int _outputEnd>
		_outputMaxContiguous = _outputEnd >> 3;
	//   23   41:aload_0         
	//   24   42:aload_0         
	//   25   43:getfield        #89  <Field int _outputEnd>
	//   26   46:iconst_3        
	//   27   47:ishr            
	//   28   48:putfield        #91  <Field int _outputMaxContiguous>
		_charBuffer = iocontext.allocConcatBuffer();
	//   29   51:aload_0         
	//   30   52:aload_1         
	//   31   53:invokevirtual   #95  <Method char[] IOContext.allocConcatBuffer()>
	//   32   56:putfield        #97  <Field char[] _charBuffer>
		_charBufferLength = _charBuffer.length;
	//   33   59:aload_0         
	//   34   60:aload_0         
	//   35   61:getfield        #97  <Field char[] _charBuffer>
	//   36   64:arraylength     
	//   37   65:putfield        #99  <Field int _charBufferLength>
		if(isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII))
	//*  38   68:aload_0         
	//*  39   69:getstatic       #105 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.ESCAPE_NON_ASCII>
	//*  40   72:invokevirtual   #109 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*  41   75:ifeq            85
			setHighestNonEscapedChar(127);
	//   42   78:aload_0         
	//   43   79:bipush          127
	//   44   81:invokevirtual   #113 <Method com.fasterxml.jackson.core.JsonGenerator setHighestNonEscapedChar(int)>
	//   45   84:pop             
	//   46   85:return          
	}

	public UTF8JsonGenerator(IOContext iocontext, int i, ObjectCodec objectcodec, OutputStream outputstream, byte abyte0[], int j, boolean flag)
	{
		super(iocontext, i, objectcodec);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #74  <Method void JsonGeneratorImpl(IOContext, int, ObjectCodec)>
		_quoteChar = 34;
	//    5    7:aload_0         
	//    6    8:bipush          34
	//    7   10:putfield        #76  <Field byte _quoteChar>
		_outputStream = outputstream;
	//    8   13:aload_0         
	//    9   14:aload           4
	//   10   16:putfield        #78  <Field OutputStream _outputStream>
		_bufferRecyclable = flag;
	//   11   19:aload_0         
	//   12   20:iload           7
	//   13   22:putfield        #80  <Field boolean _bufferRecyclable>
		_outputTail = j;
	//   14   25:aload_0         
	//   15   26:iload           6
	//   16   28:putfield        #116 <Field int _outputTail>
		_outputBuffer = abyte0;
	//   17   31:aload_0         
	//   18   32:aload           5
	//   19   34:putfield        #87  <Field byte[] _outputBuffer>
		_outputEnd = _outputBuffer.length;
	//   20   37:aload_0         
	//   21   38:aload_0         
	//   22   39:getfield        #87  <Field byte[] _outputBuffer>
	//   23   42:arraylength     
	//   24   43:putfield        #89  <Field int _outputEnd>
		_outputMaxContiguous = _outputEnd >> 3;
	//   25   46:aload_0         
	//   26   47:aload_0         
	//   27   48:getfield        #89  <Field int _outputEnd>
	//   28   51:iconst_3        
	//   29   52:ishr            
	//   30   53:putfield        #91  <Field int _outputMaxContiguous>
		_charBuffer = iocontext.allocConcatBuffer();
	//   31   56:aload_0         
	//   32   57:aload_1         
	//   33   58:invokevirtual   #95  <Method char[] IOContext.allocConcatBuffer()>
	//   34   61:putfield        #97  <Field char[] _charBuffer>
		_charBufferLength = _charBuffer.length;
	//   35   64:aload_0         
	//   36   65:aload_0         
	//   37   66:getfield        #97  <Field char[] _charBuffer>
	//   38   69:arraylength     
	//   39   70:putfield        #99  <Field int _charBufferLength>
	//   40   73:return          
	}

	private final int _handleLongCustomEscape(byte abyte0[], int i, int j, byte abyte1[], int k)
		throws IOException, JsonGenerationException
	{
		int i1 = abyte1.length;
	//    0    0:aload           4
	//    1    2:arraylength     
	//    2    3:istore          7
		int l = i;
	//    3    5:iload_2         
	//    4    6:istore          6
		if(i + i1 > j)
	//*   5    8:iload_2         
	//*   6    9:iload           7
	//*   7   11:iadd            
	//*   8   12:iload_3         
	//*   9   13:icmple          67
		{
			_outputTail = i;
	//   10   16:aload_0         
	//   11   17:iload_2         
	//   12   18:putfield        #116 <Field int _outputTail>
			_flushBuffer();
	//   13   21:aload_0         
	//   14   22:invokevirtual   #125 <Method void _flushBuffer()>
			i = _outputTail;
	//   15   25:aload_0         
	//   16   26:getfield        #116 <Field int _outputTail>
	//   17   29:istore_2        
			if(i1 > abyte0.length)
	//*  18   30:iload           7
	//*  19   32:aload_1         
	//*  20   33:arraylength     
	//*  21   34:icmple          51
			{
				_outputStream.write(abyte1, 0, i1);
	//   22   37:aload_0         
	//   23   38:getfield        #78  <Field OutputStream _outputStream>
	//   24   41:aload           4
	//   25   43:iconst_0        
	//   26   44:iload           7
	//   27   46:invokevirtual   #131 <Method void OutputStream.write(byte[], int, int)>
				return i;
	//   28   49:iload_2         
	//   29   50:ireturn         
			}
			System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte0)), i, i1);
	//   30   51:aload           4
	//   31   53:iconst_0        
	//   32   54:aload_1         
	//   33   55:iload_2         
	//   34   56:iload           7
	//   35   58:invokestatic    #137 <Method void System.arraycopy(Object, int, Object, int, int)>
			l = i + i1;
	//   36   61:iload_2         
	//   37   62:iload           7
	//   38   64:iadd            
	//   39   65:istore          6
		}
		if(6 * k + l > j)
	//*  40   67:bipush          6
	//*  41   69:iload           5
	//*  42   71:imul            
	//*  43   72:iload           6
	//*  44   74:iadd            
	//*  45   75:iload_3         
	//*  46   76:icmple          88
		{
			_flushBuffer();
	//   47   79:aload_0         
	//   48   80:invokevirtual   #125 <Method void _flushBuffer()>
			return _outputTail;
	//   49   83:aload_0         
	//   50   84:getfield        #116 <Field int _outputTail>
	//   51   87:ireturn         
		} else
		{
			return l;
	//   52   88:iload           6
	//   53   90:ireturn         
		}
	}

	private final int _outputMultiByteChar(int i, int j)
		throws IOException
	{
		byte abyte0[] = _outputBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field byte[] _outputBuffer>
	//    2    4:astore          4
		if(i >= 55296 && i <= 57343)
	//*   3    6:iload_1         
	//*   4    7:ldc1            #141 <Int 55296>
	//*   5    9:icmplt          110
	//*   6   12:iload_1         
	//*   7   13:ldc1            #142 <Int 57343>
	//*   8   15:icmpgt          110
		{
			int k = j + 1;
	//    9   18:iload_2         
	//   10   19:iconst_1        
	//   11   20:iadd            
	//   12   21:istore_3        
			abyte0[j] = 92;
	//   13   22:aload           4
	//   14   24:iload_2         
	//   15   25:bipush          92
	//   16   27:bastore         
			j = k + 1;
	//   17   28:iload_3         
	//   18   29:iconst_1        
	//   19   30:iadd            
	//   20   31:istore_2        
			abyte0[k] = 117;
	//   21   32:aload           4
	//   22   34:iload_3         
	//   23   35:bipush          117
	//   24   37:bastore         
			k = j + 1;
	//   25   38:iload_2         
	//   26   39:iconst_1        
	//   27   40:iadd            
	//   28   41:istore_3        
			abyte0[j] = HEX_CHARS[i >> 12 & 0xf];
	//   29   42:aload           4
	//   30   44:iload_2         
	//   31   45:getstatic       #54  <Field byte[] HEX_CHARS>
	//   32   48:iload_1         
	//   33   49:bipush          12
	//   34   51:ishr            
	//   35   52:bipush          15
	//   36   54:iand            
	//   37   55:baload          
	//   38   56:bastore         
			j = k + 1;
	//   39   57:iload_3         
	//   40   58:iconst_1        
	//   41   59:iadd            
	//   42   60:istore_2        
			abyte0[k] = HEX_CHARS[i >> 8 & 0xf];
	//   43   61:aload           4
	//   44   63:iload_3         
	//   45   64:getstatic       #54  <Field byte[] HEX_CHARS>
	//   46   67:iload_1         
	//   47   68:bipush          8
	//   48   70:ishr            
	//   49   71:bipush          15
	//   50   73:iand            
	//   51   74:baload          
	//   52   75:bastore         
			k = j + 1;
	//   53   76:iload_2         
	//   54   77:iconst_1        
	//   55   78:iadd            
	//   56   79:istore_3        
			abyte0[j] = HEX_CHARS[i >> 4 & 0xf];
	//   57   80:aload           4
	//   58   82:iload_2         
	//   59   83:getstatic       #54  <Field byte[] HEX_CHARS>
	//   60   86:iload_1         
	//   61   87:iconst_4        
	//   62   88:ishr            
	//   63   89:bipush          15
	//   64   91:iand            
	//   65   92:baload          
	//   66   93:bastore         
			abyte0[k] = HEX_CHARS[i & 0xf];
	//   67   94:aload           4
	//   68   96:iload_3         
	//   69   97:getstatic       #54  <Field byte[] HEX_CHARS>
	//   70  100:iload_1         
	//   71  101:bipush          15
	//   72  103:iand            
	//   73  104:baload          
	//   74  105:bastore         
			return k + 1;
	//   75  106:iload_3         
	//   76  107:iconst_1        
	//   77  108:iadd            
	//   78  109:ireturn         
		} else
		{
			int l = j + 1;
	//   79  110:iload_2         
	//   80  111:iconst_1        
	//   81  112:iadd            
	//   82  113:istore_3        
			abyte0[j] = (byte)(0xe0 | i >> 12);
	//   83  114:aload           4
	//   84  116:iload_2         
	//   85  117:sipush          224
	//   86  120:iload_1         
	//   87  121:bipush          12
	//   88  123:ishr            
	//   89  124:ior             
	//   90  125:int2byte        
	//   91  126:bastore         
			j = l + 1;
	//   92  127:iload_3         
	//   93  128:iconst_1        
	//   94  129:iadd            
	//   95  130:istore_2        
			abyte0[l] = (byte)(i >> 6 & 0x3f | 0x80);
	//   96  131:aload           4
	//   97  133:iload_3         
	//   98  134:iload_1         
	//   99  135:bipush          6
	//  100  137:ishr            
	//  101  138:bipush          63
	//  102  140:iand            
	//  103  141:sipush          128
	//  104  144:ior             
	//  105  145:int2byte        
	//  106  146:bastore         
			abyte0[j] = (byte)(i & 0x3f | 0x80);
	//  107  147:aload           4
	//  108  149:iload_2         
	//  109  150:iload_1         
	//  110  151:bipush          63
	//  111  153:iand            
	//  112  154:sipush          128
	//  113  157:ior             
	//  114  158:int2byte        
	//  115  159:bastore         
			return j + 1;
	//  116  160:iload_2         
	//  117  161:iconst_1        
	//  118  162:iadd            
	//  119  163:ireturn         
		}
	}

	private final int _outputRawMultiByteChar(int i, char ac[], int j, int k)
		throws IOException
	{
		if(i >= 55296 && i <= 57343)
	//*   0    0:iload_1         
	//*   1    1:ldc1            #141 <Int 55296>
	//*   2    3:icmplt          54
	//*   3    6:iload_1         
	//*   4    7:ldc1            #142 <Int 57343>
	//*   5    9:icmpgt          54
		{
			if(j >= k || ac == null)
	//*   6   12:iload_3         
	//*   7   13:iload           4
	//*   8   15:icmpge          22
	//*   9   18:aload_2         
	//*  10   19:ifnonnull       42
				_reportError(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", new Object[] {
					Integer.valueOf(i)
				}));
	//   11   22:aload_0         
	//   12   23:ldc1            #146 <String "Split surrogate on writeRaw() input (last character): first character 0x%4x">
	//   13   25:iconst_1        
	//   14   26:anewarray       Object[]
	//   15   29:dup             
	//   16   30:iconst_0        
	//   17   31:iload_1         
	//   18   32:invokestatic    #154 <Method Integer Integer.valueOf(int)>
	//   19   35:aastore         
	//   20   36:invokestatic    #160 <Method String String.format(String, Object[])>
	//   21   39:invokevirtual   #164 <Method void _reportError(String)>
			_outputSurrogates(i, ((int) (ac[j])));
	//   22   42:aload_0         
	//   23   43:iload_1         
	//   24   44:aload_2         
	//   25   45:iload_3         
	//   26   46:caload          
	//   27   47:invokevirtual   #168 <Method void _outputSurrogates(int, int)>
			return j + 1;
	//   28   50:iload_3         
	//   29   51:iconst_1        
	//   30   52:iadd            
	//   31   53:ireturn         
		} else
		{
			ac = ((char []) (_outputBuffer));
	//   32   54:aload_0         
	//   33   55:getfield        #87  <Field byte[] _outputBuffer>
	//   34   58:astore_2        
			k = _outputTail;
	//   35   59:aload_0         
	//   36   60:getfield        #116 <Field int _outputTail>
	//   37   63:istore          4
			_outputTail = k + 1;
	//   38   65:aload_0         
	//   39   66:iload           4
	//   40   68:iconst_1        
	//   41   69:iadd            
	//   42   70:putfield        #116 <Field int _outputTail>
			ac[k] = ((char) ((byte)(0xe0 | i >> 12)));
	//   43   73:aload_2         
	//   44   74:iload           4
	//   45   76:sipush          224
	//   46   79:iload_1         
	//   47   80:bipush          12
	//   48   82:ishr            
	//   49   83:ior             
	//   50   84:int2byte        
	//   51   85:bastore         
			k = _outputTail;
	//   52   86:aload_0         
	//   53   87:getfield        #116 <Field int _outputTail>
	//   54   90:istore          4
			_outputTail = k + 1;
	//   55   92:aload_0         
	//   56   93:iload           4
	//   57   95:iconst_1        
	//   58   96:iadd            
	//   59   97:putfield        #116 <Field int _outputTail>
			ac[k] = ((char) ((byte)(i >> 6 & 0x3f | 0x80)));
	//   60  100:aload_2         
	//   61  101:iload           4
	//   62  103:iload_1         
	//   63  104:bipush          6
	//   64  106:ishr            
	//   65  107:bipush          63
	//   66  109:iand            
	//   67  110:sipush          128
	//   68  113:ior             
	//   69  114:int2byte        
	//   70  115:bastore         
			k = _outputTail;
	//   71  116:aload_0         
	//   72  117:getfield        #116 <Field int _outputTail>
	//   73  120:istore          4
			_outputTail = k + 1;
	//   74  122:aload_0         
	//   75  123:iload           4
	//   76  125:iconst_1        
	//   77  126:iadd            
	//   78  127:putfield        #116 <Field int _outputTail>
			ac[k] = ((char) ((byte)(i & 0x3f | 0x80)));
	//   79  130:aload_2         
	//   80  131:iload           4
	//   81  133:iload_1         
	//   82  134:bipush          63
	//   83  136:iand            
	//   84  137:sipush          128
	//   85  140:ior             
	//   86  141:int2byte        
	//   87  142:bastore         
			return j;
	//   88  143:iload_3         
	//   89  144:ireturn         
		}
	}

	private final int _readMore(InputStream inputstream, byte abyte0[], int i, int j, int k)
		throws IOException
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		int l = i;
	//    2    3:iload_3         
	//    3    4:istore          6
		i = ((int) (flag));
	//    4    6:iload           7
	//    5    8:istore_3        
		for(; l < j; l++)
	//*   6    9:iload           6
	//*   7   11:iload           4
	//*   8   13:icmpge          36
		{
			abyte0[i] = abyte0[l];
	//    9   16:aload_2         
	//   10   17:iload_3         
	//   11   18:aload_2         
	//   12   19:iload           6
	//   13   21:baload          
	//   14   22:bastore         
			i++;
	//   15   23:iload_3         
	//   16   24:iconst_1        
	//   17   25:iadd            
	//   18   26:istore_3        
		}

	//   19   27:iload           6
	//   20   29:iconst_1        
	//   21   30:iadd            
	//   22   31:istore          6
	//*  23   33:goto            9
		k = Math.min(k, abyte0.length);
	//   24   36:iload           5
	//   25   38:aload_2         
	//   26   39:arraylength     
	//   27   40:invokestatic    #175 <Method int Math.min(int, int)>
	//   28   43:istore          5
		do
		{
			j = k - i;
	//   29   45:iload           5
	//   30   47:iload_3         
	//   31   48:isub            
	//   32   49:istore          4
			if(j == 0)
	//*  33   51:iload           4
	//*  34   53:ifne            58
				return i;
	//   35   56:iload_3         
	//   36   57:ireturn         
			j = inputstream.read(abyte0, i, j);
	//   37   58:aload_1         
	//   38   59:aload_2         
	//   39   60:iload_3         
	//   40   61:iload           4
	//   41   63:invokevirtual   #181 <Method int InputStream.read(byte[], int, int)>
	//   42   66:istore          4
			if(j < 0)
	//*  43   68:iload           4
	//*  44   70:ifge            75
				return i;
	//   45   73:iload_3         
	//   46   74:ireturn         
			j = i + j;
	//   47   75:iload_3         
	//   48   76:iload           4
	//   49   78:iadd            
	//   50   79:istore          4
			i = j;
	//   51   81:iload           4
	//   52   83:istore_3        
		} while(j < 3);
	//   53   84:iload           4
	//   54   86:iconst_3        
	//   55   87:icmplt          45
		return j;
	//   56   90:iload           4
	//   57   92:ireturn         
	}

	private final void _writeBytes(byte abyte0[])
		throws IOException
	{
		int i = abyte0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_2        
		if(_outputTail + i > _outputEnd)
	//*   3    3:aload_0         
	//*   4    4:getfield        #116 <Field int _outputTail>
	//*   5    7:iload_2         
	//*   6    8:iadd            
	//*   7    9:aload_0         
	//*   8   10:getfield        #89  <Field int _outputEnd>
	//*   9   13:icmple          38
		{
			_flushBuffer();
	//   10   16:aload_0         
	//   11   17:invokevirtual   #125 <Method void _flushBuffer()>
			if(i > 512)
	//*  12   20:iload_2         
	//*  13   21:sipush          512
	//*  14   24:icmple          38
			{
				_outputStream.write(abyte0, 0, i);
	//   15   27:aload_0         
	//   16   28:getfield        #78  <Field OutputStream _outputStream>
	//   17   31:aload_1         
	//   18   32:iconst_0        
	//   19   33:iload_2         
	//   20   34:invokevirtual   #131 <Method void OutputStream.write(byte[], int, int)>
				return;
	//   21   37:return          
			}
		}
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (_outputBuffer)), _outputTail, i);
	//   22   38:aload_1         
	//   23   39:iconst_0        
	//   24   40:aload_0         
	//   25   41:getfield        #87  <Field byte[] _outputBuffer>
	//   26   44:aload_0         
	//   27   45:getfield        #116 <Field int _outputTail>
	//   28   48:iload_2         
	//   29   49:invokestatic    #137 <Method void System.arraycopy(Object, int, Object, int, int)>
		_outputTail = _outputTail + i;
	//   30   52:aload_0         
	//   31   53:aload_0         
	//   32   54:getfield        #116 <Field int _outputTail>
	//   33   57:iload_2         
	//   34   58:iadd            
	//   35   59:putfield        #116 <Field int _outputTail>
	//   36   62:return          
	}

	private final void _writeBytes(byte abyte0[], int i, int j)
		throws IOException
	{
		if(_outputTail + j > _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field int _outputTail>
	//*   2    4:iload_3         
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #89  <Field int _outputEnd>
	//*   6   10:icmple          35
		{
			_flushBuffer();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #125 <Method void _flushBuffer()>
			if(j > 512)
	//*   9   17:iload_3         
	//*  10   18:sipush          512
	//*  11   21:icmple          35
			{
				_outputStream.write(abyte0, i, j);
	//   12   24:aload_0         
	//   13   25:getfield        #78  <Field OutputStream _outputStream>
	//   14   28:aload_1         
	//   15   29:iload_2         
	//   16   30:iload_3         
	//   17   31:invokevirtual   #131 <Method void OutputStream.write(byte[], int, int)>
				return;
	//   18   34:return          
			}
		}
		System.arraycopy(((Object) (abyte0)), i, ((Object) (_outputBuffer)), _outputTail, j);
	//   19   35:aload_1         
	//   20   36:iload_2         
	//   21   37:aload_0         
	//   22   38:getfield        #87  <Field byte[] _outputBuffer>
	//   23   41:aload_0         
	//   24   42:getfield        #116 <Field int _outputTail>
	//   25   45:iload_3         
	//   26   46:invokestatic    #137 <Method void System.arraycopy(Object, int, Object, int, int)>
		_outputTail = _outputTail + j;
	//   27   49:aload_0         
	//   28   50:aload_0         
	//   29   51:getfield        #116 <Field int _outputTail>
	//   30   54:iload_3         
	//   31   55:iadd            
	//   32   56:putfield        #116 <Field int _outputTail>
	//   33   59:return          
	}

	private final int _writeCustomEscape(byte abyte0[], int i, SerializableString serializablestring, int j)
		throws IOException, JsonGenerationException
	{
		serializablestring = ((SerializableString) (serializablestring.asUnquotedUTF8()));
	//    0    0:aload_3         
	//    1    1:invokeinterface #190 <Method byte[] SerializableString.asUnquotedUTF8()>
	//    2    6:astore_3        
		int k = serializablestring.length;
	//    3    7:aload_3         
	//    4    8:arraylength     
	//    5    9:istore          5
		if(k > 6)
	//*   6   11:iload           5
	//*   7   13:bipush          6
	//*   8   15:icmple          32
		{
			return _handleLongCustomEscape(abyte0, i, _outputEnd, ((byte []) (serializablestring)), j);
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:iload_2         
	//   12   21:aload_0         
	//   13   22:getfield        #89  <Field int _outputEnd>
	//   14   25:aload_3         
	//   15   26:iload           4
	//   16   28:invokespecial   #192 <Method int _handleLongCustomEscape(byte[], int, int, byte[], int)>
	//   17   31:ireturn         
		} else
		{
			System.arraycopy(((Object) (serializablestring)), 0, ((Object) (abyte0)), i, k);
	//   18   32:aload_3         
	//   19   33:iconst_0        
	//   20   34:aload_1         
	//   21   35:iload_2         
	//   22   36:iload           5
	//   23   38:invokestatic    #137 <Method void System.arraycopy(Object, int, Object, int, int)>
			return i + k;
	//   24   41:iload_2         
	//   25   42:iload           5
	//   26   44:iadd            
	//   27   45:ireturn         
		}
	}

	private final void _writeCustomStringSegment2(String s, int i, int j)
		throws IOException
	{
		if(_outputTail + 6 * (j - i) > _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field int _outputTail>
	//*   2    4:bipush          6
	//*   3    6:iload_3         
	//*   4    7:iload_2         
	//*   5    8:isub            
	//*   6    9:imul            
	//*   7   10:iadd            
	//*   8   11:aload_0         
	//*   9   12:getfield        #89  <Field int _outputEnd>
	//*  10   15:icmple          22
			_flushBuffer();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #125 <Method void _flushBuffer()>
		int i1 = _outputTail;
	//   13   22:aload_0         
	//   14   23:getfield        #116 <Field int _outputTail>
	//   15   26:istore          6
		byte abyte0[] = _outputBuffer;
	//   16   28:aload_0         
	//   17   29:getfield        #87  <Field byte[] _outputBuffer>
	//   18   32:astore          8
		int ai[] = _outputEscapes;
	//   19   34:aload_0         
	//   20   35:getfield        #198 <Field int[] _outputEscapes>
	//   21   38:astore          9
		int l;
		if(_maximumNonEscapedChar <= 0)
	//*  22   40:aload_0         
	//*  23   41:getfield        #201 <Field int _maximumNonEscapedChar>
	//*  24   44:ifgt            54
			l = 65535;
	//   25   47:ldc1            #202 <Int 65535>
	//   26   49:istore          5
		else
	//*  27   51:goto            60
			l = _maximumNonEscapedChar;
	//   28   54:aload_0         
	//   29   55:getfield        #201 <Field int _maximumNonEscapedChar>
	//   30   58:istore          5
		CharacterEscapes characterescapes = _characterEscapes;
	//   31   60:aload_0         
	//   32   61:getfield        #206 <Field CharacterEscapes _characterEscapes>
	//   33   64:astore          10
		int k = i;
	//   34   66:iload_2         
	//   35   67:istore          4
		i = i1;
	//   36   69:iload           6
	//   37   71:istore_2        
		do
		{
			if(k >= j)
				break;
	//   38   72:iload           4
	//   39   74:iload_3         
	//   40   75:icmpge          372
			int j1 = k + 1;
	//   41   78:iload           4
	//   42   80:iconst_1        
	//   43   81:iadd            
	//   44   82:istore          6
			k = ((int) (s.charAt(k)));
	//   45   84:aload_1         
	//   46   85:iload           4
	//   47   87:invokevirtual   #210 <Method char String.charAt(int)>
	//   48   90:istore          4
			if(k <= '\177')
	//*  49   92:iload           4
	//*  50   94:bipush          127
	//*  51   96:icmpgt          258
			{
				if(ai[k] == 0)
	//*  52   99:aload           9
	//*  53  101:iload           4
	//*  54  103:iaload          
	//*  55  104:ifne            125
				{
					abyte0[i] = (byte)k;
	//   56  107:aload           8
	//   57  109:iload_2         
	//   58  110:iload           4
	//   59  112:int2byte        
	//   60  113:bastore         
					k = j1;
	//   61  114:iload           6
	//   62  116:istore          4
					i++;
	//   63  118:iload_2         
	//   64  119:iconst_1        
	//   65  120:iadd            
	//   66  121:istore_2        
					continue;
	//   67  122:goto            72
				}
				int k1 = ai[k];
	//   68  125:aload           9
	//   69  127:iload           4
	//   70  129:iaload          
	//   71  130:istore          7
				if(k1 > 0)
	//*  72  132:iload           7
	//*  73  134:ifle            164
				{
					k = i + 1;
	//   74  137:iload_2         
	//   75  138:iconst_1        
	//   76  139:iadd            
	//   77  140:istore          4
					abyte0[i] = 92;
	//   78  142:aload           8
	//   79  144:iload_2         
	//   80  145:bipush          92
	//   81  147:bastore         
					i = k + 1;
	//   82  148:iload           4
	//   83  150:iconst_1        
	//   84  151:iadd            
	//   85  152:istore_2        
					abyte0[k] = (byte)k1;
	//   86  153:aload           8
	//   87  155:iload           4
	//   88  157:iload           7
	//   89  159:int2byte        
	//   90  160:bastore         
				} else
	//*  91  161:goto            273
				if(k1 == -2)
	//*  92  164:iload           7
	//*  93  166:bipush          -2
	//*  94  168:icmpne          247
				{
					SerializableString serializablestring = characterescapes.getEscapeSequence(k);
	//   95  171:aload           10
	//   96  173:iload           4
	//   97  175:invokevirtual   #216 <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//   98  178:astore          11
					if(serializablestring == null)
	//*  99  180:aload           11
	//* 100  182:ifnonnull       230
					{
						StringBuilder stringbuilder = new StringBuilder();
	//  101  185:new             #218 <Class StringBuilder>
	//  102  188:dup             
	//  103  189:invokespecial   #220 <Method void StringBuilder()>
	//  104  192:astore          12
						stringbuilder.append("Invalid custom escape definitions; custom escape not found for character code 0x");
	//  105  194:aload           12
	//  106  196:ldc1            #222 <String "Invalid custom escape definitions; custom escape not found for character code 0x">
	//  107  198:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  108  201:pop             
						stringbuilder.append(Integer.toHexString(k));
	//  109  202:aload           12
	//  110  204:iload           4
	//  111  206:invokestatic    #230 <Method String Integer.toHexString(int)>
	//  112  209:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  113  212:pop             
						stringbuilder.append(", although was supposed to have one");
	//  114  213:aload           12
	//  115  215:ldc1            #232 <String ", although was supposed to have one">
	//  116  217:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  117  220:pop             
						_reportError(stringbuilder.toString());
	//  118  221:aload_0         
	//  119  222:aload           12
	//  120  224:invokevirtual   #236 <Method String StringBuilder.toString()>
	//  121  227:invokevirtual   #164 <Method void _reportError(String)>
					}
					i = _writeCustomEscape(abyte0, i, serializablestring, j - j1);
	//  122  230:aload_0         
	//  123  231:aload           8
	//  124  233:iload_2         
	//  125  234:aload           11
	//  126  236:iload_3         
	//  127  237:iload           6
	//  128  239:isub            
	//  129  240:invokespecial   #238 <Method int _writeCustomEscape(byte[], int, SerializableString, int)>
	//  130  243:istore_2        
				} else
	//* 131  244:goto            273
				{
					i = _writeGenericEscape(k, i);
	//  132  247:aload_0         
	//  133  248:iload           4
	//  134  250:iload_2         
	//  135  251:invokespecial   #241 <Method int _writeGenericEscape(int, int)>
	//  136  254:istore_2        
				}
			} else
	//* 137  255:goto            273
			if(k > l)
	//* 138  258:iload           4
	//* 139  260:iload           5
	//* 140  262:icmple          280
			{
				i = _writeGenericEscape(k, i);
	//  141  265:aload_0         
	//  142  266:iload           4
	//  143  268:iload_2         
	//  144  269:invokespecial   #241 <Method int _writeGenericEscape(int, int)>
	//  145  272:istore_2        
			} else
	//* 146  273:iload           6
	//* 147  275:istore          4
	//* 148  277:goto            72
			{
				SerializableString serializablestring1 = characterescapes.getEscapeSequence(k);
	//  149  280:aload           10
	//  150  282:iload           4
	//  151  284:invokevirtual   #216 <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//  152  287:astore          11
				if(serializablestring1 != null)
	//* 153  289:aload           11
	//* 154  291:ifnull          311
					i = _writeCustomEscape(abyte0, i, serializablestring1, j - j1);
	//  155  294:aload_0         
	//  156  295:aload           8
	//  157  297:iload_2         
	//  158  298:aload           11
	//  159  300:iload_3         
	//  160  301:iload           6
	//  161  303:isub            
	//  162  304:invokespecial   #238 <Method int _writeCustomEscape(byte[], int, SerializableString, int)>
	//  163  307:istore_2        
				else
	//* 164  308:goto            273
				if(k <= 2047)
	//* 165  311:iload           4
	//* 166  313:sipush          2047
	//* 167  316:icmpgt          361
				{
					int l1 = i + 1;
	//  168  319:iload_2         
	//  169  320:iconst_1        
	//  170  321:iadd            
	//  171  322:istore          7
					abyte0[i] = (byte)(0xc0 | k >> 6);
	//  172  324:aload           8
	//  173  326:iload_2         
	//  174  327:sipush          192
	//  175  330:iload           4
	//  176  332:bipush          6
	//  177  334:ishr            
	//  178  335:ior             
	//  179  336:int2byte        
	//  180  337:bastore         
					i = l1 + 1;
	//  181  338:iload           7
	//  182  340:iconst_1        
	//  183  341:iadd            
	//  184  342:istore_2        
					abyte0[l1] = (byte)(k & 0x3f | 0x80);
	//  185  343:aload           8
	//  186  345:iload           7
	//  187  347:iload           4
	//  188  349:bipush          63
	//  189  351:iand            
	//  190  352:sipush          128
	//  191  355:ior             
	//  192  356:int2byte        
	//  193  357:bastore         
				} else
	//* 194  358:goto            273
				{
					i = _outputMultiByteChar(k, i);
	//  195  361:aload_0         
	//  196  362:iload           4
	//  197  364:iload_2         
	//  198  365:invokespecial   #243 <Method int _outputMultiByteChar(int, int)>
	//  199  368:istore_2        
				}
			}
			k = j1;
		} while(true);
	//* 200  369:goto            273
		_outputTail = i;
	//  201  372:aload_0         
	//  202  373:iload_2         
	//  203  374:putfield        #116 <Field int _outputTail>
	//  204  377:return          
	}

	private final void _writeCustomStringSegment2(char ac[], int i, int j)
		throws IOException
	{
		if(_outputTail + 6 * (j - i) > _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field int _outputTail>
	//*   2    4:bipush          6
	//*   3    6:iload_3         
	//*   4    7:iload_2         
	//*   5    8:isub            
	//*   6    9:imul            
	//*   7   10:iadd            
	//*   8   11:aload_0         
	//*   9   12:getfield        #89  <Field int _outputEnd>
	//*  10   15:icmple          22
			_flushBuffer();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #125 <Method void _flushBuffer()>
		int i1 = _outputTail;
	//   13   22:aload_0         
	//   14   23:getfield        #116 <Field int _outputTail>
	//   15   26:istore          6
		byte abyte0[] = _outputBuffer;
	//   16   28:aload_0         
	//   17   29:getfield        #87  <Field byte[] _outputBuffer>
	//   18   32:astore          8
		int ai[] = _outputEscapes;
	//   19   34:aload_0         
	//   20   35:getfield        #198 <Field int[] _outputEscapes>
	//   21   38:astore          9
		int l;
		if(_maximumNonEscapedChar <= 0)
	//*  22   40:aload_0         
	//*  23   41:getfield        #201 <Field int _maximumNonEscapedChar>
	//*  24   44:ifgt            54
			l = 65535;
	//   25   47:ldc1            #202 <Int 65535>
	//   26   49:istore          5
		else
	//*  27   51:goto            60
			l = _maximumNonEscapedChar;
	//   28   54:aload_0         
	//   29   55:getfield        #201 <Field int _maximumNonEscapedChar>
	//   30   58:istore          5
		CharacterEscapes characterescapes = _characterEscapes;
	//   31   60:aload_0         
	//   32   61:getfield        #206 <Field CharacterEscapes _characterEscapes>
	//   33   64:astore          10
		int k = i;
	//   34   66:iload_2         
	//   35   67:istore          4
		i = i1;
	//   36   69:iload           6
	//   37   71:istore_2        
		do
		{
			if(k >= j)
				break;
	//   38   72:iload           4
	//   39   74:iload_3         
	//   40   75:icmpge          370
			int j1 = k + 1;
	//   41   78:iload           4
	//   42   80:iconst_1        
	//   43   81:iadd            
	//   44   82:istore          6
			k = ((int) (ac[k]));
	//   45   84:aload_1         
	//   46   85:iload           4
	//   47   87:caload          
	//   48   88:istore          4
			if(k <= '\177')
	//*  49   90:iload           4
	//*  50   92:bipush          127
	//*  51   94:icmpgt          256
			{
				if(ai[k] == 0)
	//*  52   97:aload           9
	//*  53   99:iload           4
	//*  54  101:iaload          
	//*  55  102:ifne            123
				{
					abyte0[i] = (byte)k;
	//   56  105:aload           8
	//   57  107:iload_2         
	//   58  108:iload           4
	//   59  110:int2byte        
	//   60  111:bastore         
					k = j1;
	//   61  112:iload           6
	//   62  114:istore          4
					i++;
	//   63  116:iload_2         
	//   64  117:iconst_1        
	//   65  118:iadd            
	//   66  119:istore_2        
					continue;
	//   67  120:goto            72
				}
				int k1 = ai[k];
	//   68  123:aload           9
	//   69  125:iload           4
	//   70  127:iaload          
	//   71  128:istore          7
				if(k1 > 0)
	//*  72  130:iload           7
	//*  73  132:ifle            162
				{
					k = i + 1;
	//   74  135:iload_2         
	//   75  136:iconst_1        
	//   76  137:iadd            
	//   77  138:istore          4
					abyte0[i] = 92;
	//   78  140:aload           8
	//   79  142:iload_2         
	//   80  143:bipush          92
	//   81  145:bastore         
					i = k + 1;
	//   82  146:iload           4
	//   83  148:iconst_1        
	//   84  149:iadd            
	//   85  150:istore_2        
					abyte0[k] = (byte)k1;
	//   86  151:aload           8
	//   87  153:iload           4
	//   88  155:iload           7
	//   89  157:int2byte        
	//   90  158:bastore         
				} else
	//*  91  159:goto            271
				if(k1 == -2)
	//*  92  162:iload           7
	//*  93  164:bipush          -2
	//*  94  166:icmpne          245
				{
					SerializableString serializablestring = characterescapes.getEscapeSequence(k);
	//   95  169:aload           10
	//   96  171:iload           4
	//   97  173:invokevirtual   #216 <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//   98  176:astore          11
					if(serializablestring == null)
	//*  99  178:aload           11
	//* 100  180:ifnonnull       228
					{
						StringBuilder stringbuilder = new StringBuilder();
	//  101  183:new             #218 <Class StringBuilder>
	//  102  186:dup             
	//  103  187:invokespecial   #220 <Method void StringBuilder()>
	//  104  190:astore          12
						stringbuilder.append("Invalid custom escape definitions; custom escape not found for character code 0x");
	//  105  192:aload           12
	//  106  194:ldc1            #222 <String "Invalid custom escape definitions; custom escape not found for character code 0x">
	//  107  196:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  108  199:pop             
						stringbuilder.append(Integer.toHexString(k));
	//  109  200:aload           12
	//  110  202:iload           4
	//  111  204:invokestatic    #230 <Method String Integer.toHexString(int)>
	//  112  207:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  113  210:pop             
						stringbuilder.append(", although was supposed to have one");
	//  114  211:aload           12
	//  115  213:ldc1            #232 <String ", although was supposed to have one">
	//  116  215:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  117  218:pop             
						_reportError(stringbuilder.toString());
	//  118  219:aload_0         
	//  119  220:aload           12
	//  120  222:invokevirtual   #236 <Method String StringBuilder.toString()>
	//  121  225:invokevirtual   #164 <Method void _reportError(String)>
					}
					i = _writeCustomEscape(abyte0, i, serializablestring, j - j1);
	//  122  228:aload_0         
	//  123  229:aload           8
	//  124  231:iload_2         
	//  125  232:aload           11
	//  126  234:iload_3         
	//  127  235:iload           6
	//  128  237:isub            
	//  129  238:invokespecial   #238 <Method int _writeCustomEscape(byte[], int, SerializableString, int)>
	//  130  241:istore_2        
				} else
	//* 131  242:goto            271
				{
					i = _writeGenericEscape(k, i);
	//  132  245:aload_0         
	//  133  246:iload           4
	//  134  248:iload_2         
	//  135  249:invokespecial   #241 <Method int _writeGenericEscape(int, int)>
	//  136  252:istore_2        
				}
			} else
	//* 137  253:goto            271
			if(k > l)
	//* 138  256:iload           4
	//* 139  258:iload           5
	//* 140  260:icmple          278
			{
				i = _writeGenericEscape(k, i);
	//  141  263:aload_0         
	//  142  264:iload           4
	//  143  266:iload_2         
	//  144  267:invokespecial   #241 <Method int _writeGenericEscape(int, int)>
	//  145  270:istore_2        
			} else
	//* 146  271:iload           6
	//* 147  273:istore          4
	//* 148  275:goto            72
			{
				SerializableString serializablestring1 = characterescapes.getEscapeSequence(k);
	//  149  278:aload           10
	//  150  280:iload           4
	//  151  282:invokevirtual   #216 <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//  152  285:astore          11
				if(serializablestring1 != null)
	//* 153  287:aload           11
	//* 154  289:ifnull          309
					i = _writeCustomEscape(abyte0, i, serializablestring1, j - j1);
	//  155  292:aload_0         
	//  156  293:aload           8
	//  157  295:iload_2         
	//  158  296:aload           11
	//  159  298:iload_3         
	//  160  299:iload           6
	//  161  301:isub            
	//  162  302:invokespecial   #238 <Method int _writeCustomEscape(byte[], int, SerializableString, int)>
	//  163  305:istore_2        
				else
	//* 164  306:goto            271
				if(k <= 2047)
	//* 165  309:iload           4
	//* 166  311:sipush          2047
	//* 167  314:icmpgt          359
				{
					int l1 = i + 1;
	//  168  317:iload_2         
	//  169  318:iconst_1        
	//  170  319:iadd            
	//  171  320:istore          7
					abyte0[i] = (byte)(0xc0 | k >> 6);
	//  172  322:aload           8
	//  173  324:iload_2         
	//  174  325:sipush          192
	//  175  328:iload           4
	//  176  330:bipush          6
	//  177  332:ishr            
	//  178  333:ior             
	//  179  334:int2byte        
	//  180  335:bastore         
					i = l1 + 1;
	//  181  336:iload           7
	//  182  338:iconst_1        
	//  183  339:iadd            
	//  184  340:istore_2        
					abyte0[l1] = (byte)(k & 0x3f | 0x80);
	//  185  341:aload           8
	//  186  343:iload           7
	//  187  345:iload           4
	//  188  347:bipush          63
	//  189  349:iand            
	//  190  350:sipush          128
	//  191  353:ior             
	//  192  354:int2byte        
	//  193  355:bastore         
				} else
	//* 194  356:goto            271
				{
					i = _outputMultiByteChar(k, i);
	//  195  359:aload_0         
	//  196  360:iload           4
	//  197  362:iload_2         
	//  198  363:invokespecial   #243 <Method int _outputMultiByteChar(int, int)>
	//  199  366:istore_2        
				}
			}
			k = j1;
		} while(true);
	//* 200  367:goto            271
		_outputTail = i;
	//  201  370:aload_0         
	//  202  371:iload_2         
	//  203  372:putfield        #116 <Field int _outputTail>
	//  204  375:return          
	}

	private int _writeGenericEscape(int i, int j)
		throws IOException
	{
		byte abyte0[] = _outputBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field byte[] _outputBuffer>
	//    2    4:astore          5
		int k = j + 1;
	//    3    6:iload_2         
	//    4    7:iconst_1        
	//    5    8:iadd            
	//    6    9:istore_3        
		abyte0[j] = 92;
	//    7   10:aload           5
	//    8   12:iload_2         
	//    9   13:bipush          92
	//   10   15:bastore         
		j = k + 1;
	//   11   16:iload_3         
	//   12   17:iconst_1        
	//   13   18:iadd            
	//   14   19:istore_2        
		abyte0[k] = 117;
	//   15   20:aload           5
	//   16   22:iload_3         
	//   17   23:bipush          117
	//   18   25:bastore         
		if(i > 255)
	//*  19   26:iload_1         
	//*  20   27:sipush          255
	//*  21   30:icmple          85
		{
			k = 0xff & i >> 8;
	//   22   33:sipush          255
	//   23   36:iload_1         
	//   24   37:bipush          8
	//   25   39:ishr            
	//   26   40:iand            
	//   27   41:istore_3        
			int l = j + 1;
	//   28   42:iload_2         
	//   29   43:iconst_1        
	//   30   44:iadd            
	//   31   45:istore          4
			abyte0[j] = HEX_CHARS[k >> 4];
	//   32   47:aload           5
	//   33   49:iload_2         
	//   34   50:getstatic       #54  <Field byte[] HEX_CHARS>
	//   35   53:iload_3         
	//   36   54:iconst_4        
	//   37   55:ishr            
	//   38   56:baload          
	//   39   57:bastore         
			j = l + 1;
	//   40   58:iload           4
	//   41   60:iconst_1        
	//   42   61:iadd            
	//   43   62:istore_2        
			abyte0[l] = HEX_CHARS[k & 0xf];
	//   44   63:aload           5
	//   45   65:iload           4
	//   46   67:getstatic       #54  <Field byte[] HEX_CHARS>
	//   47   70:iload_3         
	//   48   71:bipush          15
	//   49   73:iand            
	//   50   74:baload          
	//   51   75:bastore         
			i &= 0xff;
	//   52   76:iload_1         
	//   53   77:sipush          255
	//   54   80:iand            
	//   55   81:istore_1        
		} else
	//*  56   82:goto            105
		{
			k = j + 1;
	//   57   85:iload_2         
	//   58   86:iconst_1        
	//   59   87:iadd            
	//   60   88:istore_3        
			abyte0[j] = 48;
	//   61   89:aload           5
	//   62   91:iload_2         
	//   63   92:bipush          48
	//   64   94:bastore         
			j = k + 1;
	//   65   95:iload_3         
	//   66   96:iconst_1        
	//   67   97:iadd            
	//   68   98:istore_2        
			abyte0[k] = 48;
	//   69   99:aload           5
	//   70  101:iload_3         
	//   71  102:bipush          48
	//   72  104:bastore         
		}
		k = j + 1;
	//   73  105:iload_2         
	//   74  106:iconst_1        
	//   75  107:iadd            
	//   76  108:istore_3        
		abyte0[j] = HEX_CHARS[i >> 4];
	//   77  109:aload           5
	//   78  111:iload_2         
	//   79  112:getstatic       #54  <Field byte[] HEX_CHARS>
	//   80  115:iload_1         
	//   81  116:iconst_4        
	//   82  117:ishr            
	//   83  118:baload          
	//   84  119:bastore         
		abyte0[k] = HEX_CHARS[i & 0xf];
	//   85  120:aload           5
	//   86  122:iload_3         
	//   87  123:getstatic       #54  <Field byte[] HEX_CHARS>
	//   88  126:iload_1         
	//   89  127:bipush          15
	//   90  129:iand            
	//   91  130:baload          
	//   92  131:bastore         
		return k + 1;
	//   93  132:iload_3         
	//   94  133:iconst_1        
	//   95  134:iadd            
	//   96  135:ireturn         
	}

	private final void _writeNull()
		throws IOException
	{
		if(_outputTail + 4 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field int _outputTail>
	//*   2    4:iconst_4        
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #89  <Field int _outputEnd>
	//*   6   10:icmplt          17
			_flushBuffer();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #125 <Method void _flushBuffer()>
		System.arraycopy(((Object) (NULL_BYTES)), 0, ((Object) (_outputBuffer)), _outputTail, 4);
	//    9   17:getstatic       #58  <Field byte[] NULL_BYTES>
	//   10   20:iconst_0        
	//   11   21:aload_0         
	//   12   22:getfield        #87  <Field byte[] _outputBuffer>
	//   13   25:aload_0         
	//   14   26:getfield        #116 <Field int _outputTail>
	//   15   29:iconst_4        
	//   16   30:invokestatic    #137 <Method void System.arraycopy(Object, int, Object, int, int)>
		_outputTail = _outputTail + 4;
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #116 <Field int _outputTail>
	//   20   38:iconst_4        
	//   21   39:iadd            
	//   22   40:putfield        #116 <Field int _outputTail>
	//   23   43:return          
	}

	private final void _writeQuotedInt(int i)
		throws IOException
	{
		if(_outputTail + 13 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field int _outputTail>
	//*   2    4:bipush          13
	//*   3    6:iadd            
	//*   4    7:aload_0         
	//*   5    8:getfield        #89  <Field int _outputEnd>
	//*   6   11:icmplt          18
			_flushBuffer();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #125 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//    9   18:aload_0         
	//   10   19:getfield        #87  <Field byte[] _outputBuffer>
	//   11   22:astore_3        
		int j = _outputTail;
	//   12   23:aload_0         
	//   13   24:getfield        #116 <Field int _outputTail>
	//   14   27:istore_2        
		_outputTail = j + 1;
	//   15   28:aload_0         
	//   16   29:iload_2         
	//   17   30:iconst_1        
	//   18   31:iadd            
	//   19   32:putfield        #116 <Field int _outputTail>
		abyte0[j] = _quoteChar;
	//   20   35:aload_3         
	//   21   36:iload_2         
	//   22   37:aload_0         
	//   23   38:getfield        #76  <Field byte _quoteChar>
	//   24   41:bastore         
		_outputTail = NumberOutput.outputInt(i, _outputBuffer, _outputTail);
	//   25   42:aload_0         
	//   26   43:iload_1         
	//   27   44:aload_0         
	//   28   45:getfield        #87  <Field byte[] _outputBuffer>
	//   29   48:aload_0         
	//   30   49:getfield        #116 <Field int _outputTail>
	//   31   52:invokestatic    #253 <Method int NumberOutput.outputInt(int, byte[], int)>
	//   32   55:putfield        #116 <Field int _outputTail>
		abyte0 = _outputBuffer;
	//   33   58:aload_0         
	//   34   59:getfield        #87  <Field byte[] _outputBuffer>
	//   35   62:astore_3        
		i = _outputTail;
	//   36   63:aload_0         
	//   37   64:getfield        #116 <Field int _outputTail>
	//   38   67:istore_1        
		_outputTail = i + 1;
	//   39   68:aload_0         
	//   40   69:iload_1         
	//   41   70:iconst_1        
	//   42   71:iadd            
	//   43   72:putfield        #116 <Field int _outputTail>
		abyte0[i] = _quoteChar;
	//   44   75:aload_3         
	//   45   76:iload_1         
	//   46   77:aload_0         
	//   47   78:getfield        #76  <Field byte _quoteChar>
	//   48   81:bastore         
	//   49   82:return          
	}

	private final void _writeQuotedLong(long l)
		throws IOException
	{
		if(_outputTail + 23 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field int _outputTail>
	//*   2    4:bipush          23
	//*   3    6:iadd            
	//*   4    7:aload_0         
	//*   5    8:getfield        #89  <Field int _outputEnd>
	//*   6   11:icmplt          18
			_flushBuffer();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #125 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//    9   18:aload_0         
	//   10   19:getfield        #87  <Field byte[] _outputBuffer>
	//   11   22:astore          4
		int i = _outputTail;
	//   12   24:aload_0         
	//   13   25:getfield        #116 <Field int _outputTail>
	//   14   28:istore_3        
		_outputTail = i + 1;
	//   15   29:aload_0         
	//   16   30:iload_3         
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:putfield        #116 <Field int _outputTail>
		abyte0[i] = _quoteChar;
	//   20   36:aload           4
	//   21   38:iload_3         
	//   22   39:aload_0         
	//   23   40:getfield        #76  <Field byte _quoteChar>
	//   24   43:bastore         
		_outputTail = NumberOutput.outputLong(l, _outputBuffer, _outputTail);
	//   25   44:aload_0         
	//   26   45:lload_1         
	//   27   46:aload_0         
	//   28   47:getfield        #87  <Field byte[] _outputBuffer>
	//   29   50:aload_0         
	//   30   51:getfield        #116 <Field int _outputTail>
	//   31   54:invokestatic    #259 <Method int NumberOutput.outputLong(long, byte[], int)>
	//   32   57:putfield        #116 <Field int _outputTail>
		abyte0 = _outputBuffer;
	//   33   60:aload_0         
	//   34   61:getfield        #87  <Field byte[] _outputBuffer>
	//   35   64:astore          4
		i = _outputTail;
	//   36   66:aload_0         
	//   37   67:getfield        #116 <Field int _outputTail>
	//   38   70:istore_3        
		_outputTail = i + 1;
	//   39   71:aload_0         
	//   40   72:iload_3         
	//   41   73:iconst_1        
	//   42   74:iadd            
	//   43   75:putfield        #116 <Field int _outputTail>
		abyte0[i] = _quoteChar;
	//   44   78:aload           4
	//   45   80:iload_3         
	//   46   81:aload_0         
	//   47   82:getfield        #76  <Field byte _quoteChar>
	//   48   85:bastore         
	//   49   86:return          
	}

	private final void _writeQuotedRaw(String s)
		throws IOException
	{
		if(_outputTail >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field int _outputTail>
	//*   2    4:aload_0         
	//*   3    5:getfield        #89  <Field int _outputEnd>
	//*   4    8:icmplt          15
			_flushBuffer();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #125 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #87  <Field byte[] _outputBuffer>
	//    9   19:astore_3        
		int i = _outputTail;
	//   10   20:aload_0         
	//   11   21:getfield        #116 <Field int _outputTail>
	//   12   24:istore_2        
		_outputTail = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #116 <Field int _outputTail>
		abyte0[i] = _quoteChar;
	//   18   32:aload_3         
	//   19   33:iload_2         
	//   20   34:aload_0         
	//   21   35:getfield        #76  <Field byte _quoteChar>
	//   22   38:bastore         
		writeRaw(s);
	//   23   39:aload_0         
	//   24   40:aload_1         
	//   25   41:invokevirtual   #263 <Method void writeRaw(String)>
		if(_outputTail >= _outputEnd)
	//*  26   44:aload_0         
	//*  27   45:getfield        #116 <Field int _outputTail>
	//*  28   48:aload_0         
	//*  29   49:getfield        #89  <Field int _outputEnd>
	//*  30   52:icmplt          59
			_flushBuffer();
	//   31   55:aload_0         
	//   32   56:invokevirtual   #125 <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//   33   59:aload_0         
	//   34   60:getfield        #87  <Field byte[] _outputBuffer>
	//   35   63:astore_1        
		i = _outputTail;
	//   36   64:aload_0         
	//   37   65:getfield        #116 <Field int _outputTail>
	//   38   68:istore_2        
		_outputTail = i + 1;
	//   39   69:aload_0         
	//   40   70:iload_2         
	//   41   71:iconst_1        
	//   42   72:iadd            
	//   43   73:putfield        #116 <Field int _outputTail>
		s[i] = _quoteChar;
	//   44   76:aload_1         
	//   45   77:iload_2         
	//   46   78:aload_0         
	//   47   79:getfield        #76  <Field byte _quoteChar>
	//   48   82:bastore         
	//   49   83:return          
	}

	private final void _writeQuotedShort(short word0)
		throws IOException
	{
		if(_outputTail + 8 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field int _outputTail>
	//*   2    4:bipush          8
	//*   3    6:iadd            
	//*   4    7:aload_0         
	//*   5    8:getfield        #89  <Field int _outputEnd>
	//*   6   11:icmplt          18
			_flushBuffer();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #125 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//    9   18:aload_0         
	//   10   19:getfield        #87  <Field byte[] _outputBuffer>
	//   11   22:astore_3        
		int i = _outputTail;
	//   12   23:aload_0         
	//   13   24:getfield        #116 <Field int _outputTail>
	//   14   27:istore_2        
		_outputTail = i + 1;
	//   15   28:aload_0         
	//   16   29:iload_2         
	//   17   30:iconst_1        
	//   18   31:iadd            
	//   19   32:putfield        #116 <Field int _outputTail>
		abyte0[i] = _quoteChar;
	//   20   35:aload_3         
	//   21   36:iload_2         
	//   22   37:aload_0         
	//   23   38:getfield        #76  <Field byte _quoteChar>
	//   24   41:bastore         
		_outputTail = NumberOutput.outputInt(((int) (word0)), _outputBuffer, _outputTail);
	//   25   42:aload_0         
	//   26   43:iload_1         
	//   27   44:aload_0         
	//   28   45:getfield        #87  <Field byte[] _outputBuffer>
	//   29   48:aload_0         
	//   30   49:getfield        #116 <Field int _outputTail>
	//   31   52:invokestatic    #253 <Method int NumberOutput.outputInt(int, byte[], int)>
	//   32   55:putfield        #116 <Field int _outputTail>
		abyte0 = _outputBuffer;
	//   33   58:aload_0         
	//   34   59:getfield        #87  <Field byte[] _outputBuffer>
	//   35   62:astore_3        
		word0 = ((short) (_outputTail));
	//   36   63:aload_0         
	//   37   64:getfield        #116 <Field int _outputTail>
	//   38   67:istore_1        
		_outputTail = word0 + 1;
	//   39   68:aload_0         
	//   40   69:iload_1         
	//   41   70:iconst_1        
	//   42   71:iadd            
	//   43   72:putfield        #116 <Field int _outputTail>
		abyte0[word0] = _quoteChar;
	//   44   75:aload_3         
	//   45   76:iload_1         
	//   46   77:aload_0         
	//   47   78:getfield        #76  <Field byte _quoteChar>
	//   48   81:bastore         
	//   49   82:return          
	}

	private void _writeRawSegment(char ac[], int i, int j)
		throws IOException
	{
label0:
		do
		{
			int k;
			if(i < j)
	//*   0    0:iload_2         
	//*   1    1:iload_3         
	//*   2    2:icmpge          162
				do
				{
					k = ((int) (ac[i]));
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:caload          
	//    6    8:istore          4
					if(k > 127)
	//*   7   10:iload           4
	//*   8   12:bipush          127
	//*   9   14:icmple          120
					{
						k = i + 1;
	//   10   17:iload_2         
	//   11   18:iconst_1        
	//   12   19:iadd            
	//   13   20:istore          4
						i = ((int) (ac[i]));
	//   14   22:aload_1         
	//   15   23:iload_2         
	//   16   24:caload          
	//   17   25:istore_2        
						if(i < 2048)
	//*  18   26:iload_2         
	//*  19   27:sipush          2048
	//*  20   30:icmpge          107
						{
							byte abyte0[] = _outputBuffer;
	//   21   33:aload_0         
	//   22   34:getfield        #87  <Field byte[] _outputBuffer>
	//   23   37:astore          6
							int l = _outputTail;
	//   24   39:aload_0         
	//   25   40:getfield        #116 <Field int _outputTail>
	//   26   43:istore          5
							_outputTail = l + 1;
	//   27   45:aload_0         
	//   28   46:iload           5
	//   29   48:iconst_1        
	//   30   49:iadd            
	//   31   50:putfield        #116 <Field int _outputTail>
							abyte0[l] = (byte)(0xc0 | i >> 6);
	//   32   53:aload           6
	//   33   55:iload           5
	//   34   57:sipush          192
	//   35   60:iload_2         
	//   36   61:bipush          6
	//   37   63:ishr            
	//   38   64:ior             
	//   39   65:int2byte        
	//   40   66:bastore         
							abyte0 = _outputBuffer;
	//   41   67:aload_0         
	//   42   68:getfield        #87  <Field byte[] _outputBuffer>
	//   43   71:astore          6
							l = _outputTail;
	//   44   73:aload_0         
	//   45   74:getfield        #116 <Field int _outputTail>
	//   46   77:istore          5
							_outputTail = l + 1;
	//   47   79:aload_0         
	//   48   80:iload           5
	//   49   82:iconst_1        
	//   50   83:iadd            
	//   51   84:putfield        #116 <Field int _outputTail>
							abyte0[l] = (byte)(i & 0x3f | 0x80);
	//   52   87:aload           6
	//   53   89:iload           5
	//   54   91:iload_2         
	//   55   92:bipush          63
	//   56   94:iand            
	//   57   95:sipush          128
	//   58   98:ior             
	//   59   99:int2byte        
	//   60  100:bastore         
							i = k;
	//   61  101:iload           4
	//   62  103:istore_2        
						} else
	//*  63  104:goto            0
						{
							i = _outputRawMultiByteChar(i, ac, k, j);
	//   64  107:aload_0         
	//   65  108:iload_2         
	//   66  109:aload_1         
	//   67  110:iload           4
	//   68  112:iload_3         
	//   69  113:invokespecial   #268 <Method int _outputRawMultiByteChar(int, char[], int, int)>
	//   70  116:istore_2        
						}
						continue label0;
	//   71  117:goto            0
					}
					byte abyte1[] = _outputBuffer;
	//   72  120:aload_0         
	//   73  121:getfield        #87  <Field byte[] _outputBuffer>
	//   74  124:astore          6
					int i1 = _outputTail;
	//   75  126:aload_0         
	//   76  127:getfield        #116 <Field int _outputTail>
	//   77  130:istore          5
					_outputTail = i1 + 1;
	//   78  132:aload_0         
	//   79  133:iload           5
	//   80  135:iconst_1        
	//   81  136:iadd            
	//   82  137:putfield        #116 <Field int _outputTail>
					abyte1[i1] = (byte)k;
	//   83  140:aload           6
	//   84  142:iload           5
	//   85  144:iload           4
	//   86  146:int2byte        
	//   87  147:bastore         
					k = i + 1;
	//   88  148:iload_2         
	//   89  149:iconst_1        
	//   90  150:iadd            
	//   91  151:istore          4
					i = k;
	//   92  153:iload           4
	//   93  155:istore_2        
				} while(k < j);
	//   94  156:iload           4
	//   95  158:iload_3         
	//   96  159:icmplt          5
			return;
	//   97  162:return          
		} while(true);
	}

	private final void _writeSegmentedRaw(char ac[], int i, int j)
		throws IOException
	{
		int k = _outputEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int _outputEnd>
	//    2    4:istore          4
		byte abyte0[] = _outputBuffer;
	//    3    6:aload_0         
	//    4    7:getfield        #87  <Field byte[] _outputBuffer>
	//    5   10:astore          7
		int l = j + i;
	//    6   12:iload_3         
	//    7   13:iload_2         
	//    8   14:iadd            
	//    9   15:istore          5
label0:
		do
		{
			if(i < l)
	//*  10   17:iload_2         
	//*  11   18:iload           5
	//*  12   20:icmpge          186
				do
				{
					j = ((int) (ac[i]));
	//   13   23:aload_1         
	//   14   24:iload_2         
	//   15   25:caload          
	//   16   26:istore_3        
					if(j >= 128)
	//*  17   27:iload_3         
	//*  18   28:sipush          128
	//*  19   31:icmplt          140
					{
						if(_outputTail + 3 >= _outputEnd)
	//*  20   34:aload_0         
	//*  21   35:getfield        #116 <Field int _outputTail>
	//*  22   38:iconst_3        
	//*  23   39:iadd            
	//*  24   40:aload_0         
	//*  25   41:getfield        #89  <Field int _outputEnd>
	//*  26   44:icmplt          51
							_flushBuffer();
	//   27   47:aload_0         
	//   28   48:invokevirtual   #125 <Method void _flushBuffer()>
						j = i + 1;
	//   29   51:iload_2         
	//   30   52:iconst_1        
	//   31   53:iadd            
	//   32   54:istore_3        
						i = ((int) (ac[i]));
	//   33   55:aload_1         
	//   34   56:iload_2         
	//   35   57:caload          
	//   36   58:istore_2        
						if(i < 2048)
	//*  37   59:iload_2         
	//*  38   60:sipush          2048
	//*  39   63:icmpge          127
						{
							int i1 = _outputTail;
	//   40   66:aload_0         
	//   41   67:getfield        #116 <Field int _outputTail>
	//   42   70:istore          6
							_outputTail = i1 + 1;
	//   43   72:aload_0         
	//   44   73:iload           6
	//   45   75:iconst_1        
	//   46   76:iadd            
	//   47   77:putfield        #116 <Field int _outputTail>
							abyte0[i1] = (byte)(0xc0 | i >> 6);
	//   48   80:aload           7
	//   49   82:iload           6
	//   50   84:sipush          192
	//   51   87:iload_2         
	//   52   88:bipush          6
	//   53   90:ishr            
	//   54   91:ior             
	//   55   92:int2byte        
	//   56   93:bastore         
							i1 = _outputTail;
	//   57   94:aload_0         
	//   58   95:getfield        #116 <Field int _outputTail>
	//   59   98:istore          6
							_outputTail = i1 + 1;
	//   60  100:aload_0         
	//   61  101:iload           6
	//   62  103:iconst_1        
	//   63  104:iadd            
	//   64  105:putfield        #116 <Field int _outputTail>
							abyte0[i1] = (byte)(i & 0x3f | 0x80);
	//   65  108:aload           7
	//   66  110:iload           6
	//   67  112:iload_2         
	//   68  113:bipush          63
	//   69  115:iand            
	//   70  116:sipush          128
	//   71  119:ior             
	//   72  120:int2byte        
	//   73  121:bastore         
							i = j;
	//   74  122:iload_3         
	//   75  123:istore_2        
						} else
	//*  76  124:goto            17
						{
							i = _outputRawMultiByteChar(i, ac, j, l);
	//   77  127:aload_0         
	//   78  128:iload_2         
	//   79  129:aload_1         
	//   80  130:iload_3         
	//   81  131:iload           5
	//   82  133:invokespecial   #268 <Method int _outputRawMultiByteChar(int, char[], int, int)>
	//   83  136:istore_2        
						}
						continue label0;
	//   84  137:goto            17
					}
					if(_outputTail >= k)
	//*  85  140:aload_0         
	//*  86  141:getfield        #116 <Field int _outputTail>
	//*  87  144:iload           4
	//*  88  146:icmplt          153
						_flushBuffer();
	//   89  149:aload_0         
	//   90  150:invokevirtual   #125 <Method void _flushBuffer()>
					int j1 = _outputTail;
	//   91  153:aload_0         
	//   92  154:getfield        #116 <Field int _outputTail>
	//   93  157:istore          6
					_outputTail = j1 + 1;
	//   94  159:aload_0         
	//   95  160:iload           6
	//   96  162:iconst_1        
	//   97  163:iadd            
	//   98  164:putfield        #116 <Field int _outputTail>
					abyte0[j1] = (byte)j;
	//   99  167:aload           7
	//  100  169:iload           6
	//  101  171:iload_3         
	//  102  172:int2byte        
	//  103  173:bastore         
					j = i + 1;
	//  104  174:iload_2         
	//  105  175:iconst_1        
	//  106  176:iadd            
	//  107  177:istore_3        
					i = j;
	//  108  178:iload_3         
	//  109  179:istore_2        
				} while(j < l);
	//  110  180:iload_3         
	//  111  181:iload           5
	//  112  183:icmplt          23
			return;
	//  113  186:return          
		} while(true);
	}

	private final void _writeStringSegment(String s, int i, int j)
		throws IOException
	{
		int l = j + i;
	//    0    0:iload_3         
	//    1    1:iload_2         
	//    2    2:iadd            
	//    3    3:istore          5
		int k = _outputTail;
	//    4    5:aload_0         
	//    5    6:getfield        #116 <Field int _outputTail>
	//    6    9:istore          4
		byte abyte0[] = _outputBuffer;
	//    7   11:aload_0         
	//    8   12:getfield        #87  <Field byte[] _outputBuffer>
	//    9   15:astore          6
		int ai[] = _outputEscapes;
	//   10   17:aload_0         
	//   11   18:getfield        #198 <Field int[] _outputEscapes>
	//   12   21:astore          7
		j = i;
	//   13   23:iload_2         
	//   14   24:istore_3        
		i = k;
	//   15   25:iload           4
	//   16   27:istore_2        
		do
		{
			if(j >= l)
				break;
	//   17   28:iload_3         
	//   18   29:iload           5
	//   19   31:icmpge          77
			char c = s.charAt(j);
	//   20   34:aload_1         
	//   21   35:iload_3         
	//   22   36:invokevirtual   #210 <Method char String.charAt(int)>
	//   23   39:istore          4
			if(c > '\177' || ai[c] != 0)
	//*  24   41:iload           4
	//*  25   43:bipush          127
	//*  26   45:icmpgt          77
	//*  27   48:aload           7
	//*  28   50:iload           4
	//*  29   52:iaload          
	//*  30   53:ifeq            59
				break;
	//   31   56:goto            77
			abyte0[i] = (byte)c;
	//   32   59:aload           6
	//   33   61:iload_2         
	//   34   62:iload           4
	//   35   64:int2byte        
	//   36   65:bastore         
			j++;
	//   37   66:iload_3         
	//   38   67:iconst_1        
	//   39   68:iadd            
	//   40   69:istore_3        
			i++;
	//   41   70:iload_2         
	//   42   71:iconst_1        
	//   43   72:iadd            
	//   44   73:istore_2        
		} while(true);
	//   45   74:goto            28
		_outputTail = i;
	//   46   77:aload_0         
	//   47   78:iload_2         
	//   48   79:putfield        #116 <Field int _outputTail>
		if(j < l)
	//*  49   82:iload_3         
	//*  50   83:iload           5
	//*  51   85:icmpge          128
		{
			if(_characterEscapes != null)
	//*  52   88:aload_0         
	//*  53   89:getfield        #206 <Field CharacterEscapes _characterEscapes>
	//*  54   92:ifnull          104
			{
				_writeCustomStringSegment2(s, j, l);
	//   55   95:aload_0         
	//   56   96:aload_1         
	//   57   97:iload_3         
	//   58   98:iload           5
	//   59  100:invokespecial   #272 <Method void _writeCustomStringSegment2(String, int, int)>
				return;
	//   60  103:return          
			}
			if(_maximumNonEscapedChar == 0)
	//*  61  104:aload_0         
	//*  62  105:getfield        #201 <Field int _maximumNonEscapedChar>
	//*  63  108:ifne            120
			{
				_writeStringSegment2(s, j, l);
	//   64  111:aload_0         
	//   65  112:aload_1         
	//   66  113:iload_3         
	//   67  114:iload           5
	//   68  116:invokespecial   #275 <Method void _writeStringSegment2(String, int, int)>
				return;
	//   69  119:return          
			}
			_writeStringSegmentASCII2(s, j, l);
	//   70  120:aload_0         
	//   71  121:aload_1         
	//   72  122:iload_3         
	//   73  123:iload           5
	//   74  125:invokespecial   #278 <Method void _writeStringSegmentASCII2(String, int, int)>
		}
	//   75  128:return          
	}

	private final void _writeStringSegment(char ac[], int i, int j)
		throws IOException
	{
		int l = j + i;
	//    0    0:iload_3         
	//    1    1:iload_2         
	//    2    2:iadd            
	//    3    3:istore          5
		int k = _outputTail;
	//    4    5:aload_0         
	//    5    6:getfield        #116 <Field int _outputTail>
	//    6    9:istore          4
		byte abyte0[] = _outputBuffer;
	//    7   11:aload_0         
	//    8   12:getfield        #87  <Field byte[] _outputBuffer>
	//    9   15:astore          6
		int ai[] = _outputEscapes;
	//   10   17:aload_0         
	//   11   18:getfield        #198 <Field int[] _outputEscapes>
	//   12   21:astore          7
		j = i;
	//   13   23:iload_2         
	//   14   24:istore_3        
		i = k;
	//   15   25:iload           4
	//   16   27:istore_2        
		do
		{
			if(j >= l)
				break;
	//   17   28:iload_3         
	//   18   29:iload           5
	//   19   31:icmpge          75
			char c = ac[j];
	//   20   34:aload_1         
	//   21   35:iload_3         
	//   22   36:caload          
	//   23   37:istore          4
			if(c > '\177' || ai[c] != 0)
	//*  24   39:iload           4
	//*  25   41:bipush          127
	//*  26   43:icmpgt          75
	//*  27   46:aload           7
	//*  28   48:iload           4
	//*  29   50:iaload          
	//*  30   51:ifeq            57
				break;
	//   31   54:goto            75
			abyte0[i] = (byte)c;
	//   32   57:aload           6
	//   33   59:iload_2         
	//   34   60:iload           4
	//   35   62:int2byte        
	//   36   63:bastore         
			j++;
	//   37   64:iload_3         
	//   38   65:iconst_1        
	//   39   66:iadd            
	//   40   67:istore_3        
			i++;
	//   41   68:iload_2         
	//   42   69:iconst_1        
	//   43   70:iadd            
	//   44   71:istore_2        
		} while(true);
	//   45   72:goto            28
		_outputTail = i;
	//   46   75:aload_0         
	//   47   76:iload_2         
	//   48   77:putfield        #116 <Field int _outputTail>
		if(j < l)
	//*  49   80:iload_3         
	//*  50   81:iload           5
	//*  51   83:icmpge          126
		{
			if(_characterEscapes != null)
	//*  52   86:aload_0         
	//*  53   87:getfield        #206 <Field CharacterEscapes _characterEscapes>
	//*  54   90:ifnull          102
			{
				_writeCustomStringSegment2(ac, j, l);
	//   55   93:aload_0         
	//   56   94:aload_1         
	//   57   95:iload_3         
	//   58   96:iload           5
	//   59   98:invokespecial   #280 <Method void _writeCustomStringSegment2(char[], int, int)>
				return;
	//   60  101:return          
			}
			if(_maximumNonEscapedChar == 0)
	//*  61  102:aload_0         
	//*  62  103:getfield        #201 <Field int _maximumNonEscapedChar>
	//*  63  106:ifne            118
			{
				_writeStringSegment2(ac, j, l);
	//   64  109:aload_0         
	//   65  110:aload_1         
	//   66  111:iload_3         
	//   67  112:iload           5
	//   68  114:invokespecial   #282 <Method void _writeStringSegment2(char[], int, int)>
				return;
	//   69  117:return          
			}
			_writeStringSegmentASCII2(ac, j, l);
	//   70  118:aload_0         
	//   71  119:aload_1         
	//   72  120:iload_3         
	//   73  121:iload           5
	//   74  123:invokespecial   #284 <Method void _writeStringSegmentASCII2(char[], int, int)>
		}
	//   75  126:return          
	}

	private final void _writeStringSegment2(String s, int i, int j)
		throws IOException
	{
		int k;
		byte abyte0[];
		int ai[];
		if(_outputTail + 6 * (j - i) > _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field int _outputTail>
	//*   2    4:bipush          6
	//*   3    6:iload_3         
	//*   4    7:iload_2         
	//*   5    8:isub            
	//*   6    9:imul            
	//*   7   10:iadd            
	//*   8   11:aload_0         
	//*   9   12:getfield        #89  <Field int _outputEnd>
	//*  10   15:icmple          22
			_flushBuffer();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #125 <Method void _flushBuffer()>
		int l = _outputTail;
	//   13   22:aload_0         
	//   14   23:getfield        #116 <Field int _outputTail>
	//   15   26:istore          5
		abyte0 = _outputBuffer;
	//   16   28:aload_0         
	//   17   29:getfield        #87  <Field byte[] _outputBuffer>
	//   18   32:astore          7
		ai = _outputEscapes;
	//   19   34:aload_0         
	//   20   35:getfield        #198 <Field int[] _outputEscapes>
	//   21   38:astore          8
		k = i;
	//   22   40:iload_2         
	//   23   41:istore          4
		i = l;
	//   24   43:iload           5
	//   25   45:istore_2        
_L7:
		if(k >= j) goto _L2; else goto _L1
	//   26   46:iload           4
	//   27   48:iload_3         
	//   28   49:icmpge          214
_L1:
		int i1;
		i1 = k + 1;
	//   29   52:iload           4
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore          5
		k = ((int) (s.charAt(k)));
	//   33   58:aload_1         
	//   34   59:iload           4
	//   35   61:invokevirtual   #210 <Method char String.charAt(int)>
	//   36   64:istore          4
		if(k > '\177') goto _L4; else goto _L3
	//   37   66:iload           4
	//   38   68:bipush          127
	//   39   70:icmpgt          153
_L3:
		if(ai[k] == 0)
	//*  40   73:aload           8
	//*  41   75:iload           4
	//*  42   77:iaload          
	//*  43   78:ifne            99
		{
			abyte0[i] = (byte)k;
	//   44   81:aload           7
	//   45   83:iload_2         
	//   46   84:iload           4
	//   47   86:int2byte        
	//   48   87:bastore         
			k = i1;
	//   49   88:iload           5
	//   50   90:istore          4
			i++;
	//   51   92:iload_2         
	//   52   93:iconst_1        
	//   53   94:iadd            
	//   54   95:istore_2        
			continue; /* Loop/switch isn't completed */
	//   55   96:goto            46
		}
		int j1 = ai[k];
	//   56   99:aload           8
	//   57  101:iload           4
	//   58  103:iaload          
	//   59  104:istore          6
		if(j1 > 0)
	//*  60  106:iload           6
	//*  61  108:ifle            142
		{
			k = i + 1;
	//   62  111:iload_2         
	//   63  112:iconst_1        
	//   64  113:iadd            
	//   65  114:istore          4
			abyte0[i] = 92;
	//   66  116:aload           7
	//   67  118:iload_2         
	//   68  119:bipush          92
	//   69  121:bastore         
			i = k + 1;
	//   70  122:iload           4
	//   71  124:iconst_1        
	//   72  125:iadd            
	//   73  126:istore_2        
			abyte0[k] = (byte)j1;
	//   74  127:aload           7
	//   75  129:iload           4
	//   76  131:iload           6
	//   77  133:int2byte        
	//   78  134:bastore         
		} else
	//*  79  135:iload           5
	//*  80  137:istore          4
	//*  81  139:goto            46
		{
			i = _writeGenericEscape(k, i);
	//   82  142:aload_0         
	//   83  143:iload           4
	//   84  145:iload_2         
	//   85  146:invokespecial   #241 <Method int _writeGenericEscape(int, int)>
	//   86  149:istore_2        
		}
_L5:
		k = i1;
		continue; /* Loop/switch isn't completed */
	//*  87  150:goto            135
_L4:
		if(k <= 2047)
	//*  88  153:iload           4
	//*  89  155:sipush          2047
	//*  90  158:icmpgt          203
		{
			int k1 = i + 1;
	//   91  161:iload_2         
	//   92  162:iconst_1        
	//   93  163:iadd            
	//   94  164:istore          6
			abyte0[i] = (byte)(0xc0 | k >> 6);
	//   95  166:aload           7
	//   96  168:iload_2         
	//   97  169:sipush          192
	//   98  172:iload           4
	//   99  174:bipush          6
	//  100  176:ishr            
	//  101  177:ior             
	//  102  178:int2byte        
	//  103  179:bastore         
			i = k1 + 1;
	//  104  180:iload           6
	//  105  182:iconst_1        
	//  106  183:iadd            
	//  107  184:istore_2        
			abyte0[k1] = (byte)(k & 0x3f | 0x80);
	//  108  185:aload           7
	//  109  187:iload           6
	//  110  189:iload           4
	//  111  191:bipush          63
	//  112  193:iand            
	//  113  194:sipush          128
	//  114  197:ior             
	//  115  198:int2byte        
	//  116  199:bastore         
		} else
	//* 117  200:goto            135
		{
			i = _outputMultiByteChar(k, i);
	//  118  203:aload_0         
	//  119  204:iload           4
	//  120  206:iload_2         
	//  121  207:invokespecial   #243 <Method int _outputMultiByteChar(int, int)>
	//  122  210:istore_2        
		}
		if(true) goto _L5; else goto _L2
	//  123  211:goto            135
_L2:
		_outputTail = i;
	//  124  214:aload_0         
	//  125  215:iload_2         
	//  126  216:putfield        #116 <Field int _outputTail>
		return;
	//  127  219:return          
		if(true) goto _L7; else goto _L6
_L6:
	}

	private final void _writeStringSegment2(char ac[], int i, int j)
		throws IOException
	{
		int k;
		byte abyte0[];
		int ai[];
		if(_outputTail + 6 * (j - i) > _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field int _outputTail>
	//*   2    4:bipush          6
	//*   3    6:iload_3         
	//*   4    7:iload_2         
	//*   5    8:isub            
	//*   6    9:imul            
	//*   7   10:iadd            
	//*   8   11:aload_0         
	//*   9   12:getfield        #89  <Field int _outputEnd>
	//*  10   15:icmple          22
			_flushBuffer();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #125 <Method void _flushBuffer()>
		int l = _outputTail;
	//   13   22:aload_0         
	//   14   23:getfield        #116 <Field int _outputTail>
	//   15   26:istore          5
		abyte0 = _outputBuffer;
	//   16   28:aload_0         
	//   17   29:getfield        #87  <Field byte[] _outputBuffer>
	//   18   32:astore          7
		ai = _outputEscapes;
	//   19   34:aload_0         
	//   20   35:getfield        #198 <Field int[] _outputEscapes>
	//   21   38:astore          8
		k = i;
	//   22   40:iload_2         
	//   23   41:istore          4
		i = l;
	//   24   43:iload           5
	//   25   45:istore_2        
_L7:
		if(k >= j) goto _L2; else goto _L1
	//   26   46:iload           4
	//   27   48:iload_3         
	//   28   49:icmpge          212
_L1:
		int i1;
		i1 = k + 1;
	//   29   52:iload           4
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore          5
		k = ((int) (ac[k]));
	//   33   58:aload_1         
	//   34   59:iload           4
	//   35   61:caload          
	//   36   62:istore          4
		if(k > '\177') goto _L4; else goto _L3
	//   37   64:iload           4
	//   38   66:bipush          127
	//   39   68:icmpgt          151
_L3:
		if(ai[k] == 0)
	//*  40   71:aload           8
	//*  41   73:iload           4
	//*  42   75:iaload          
	//*  43   76:ifne            97
		{
			abyte0[i] = (byte)k;
	//   44   79:aload           7
	//   45   81:iload_2         
	//   46   82:iload           4
	//   47   84:int2byte        
	//   48   85:bastore         
			k = i1;
	//   49   86:iload           5
	//   50   88:istore          4
			i++;
	//   51   90:iload_2         
	//   52   91:iconst_1        
	//   53   92:iadd            
	//   54   93:istore_2        
			continue; /* Loop/switch isn't completed */
	//   55   94:goto            46
		}
		int j1 = ai[k];
	//   56   97:aload           8
	//   57   99:iload           4
	//   58  101:iaload          
	//   59  102:istore          6
		if(j1 > 0)
	//*  60  104:iload           6
	//*  61  106:ifle            140
		{
			k = i + 1;
	//   62  109:iload_2         
	//   63  110:iconst_1        
	//   64  111:iadd            
	//   65  112:istore          4
			abyte0[i] = 92;
	//   66  114:aload           7
	//   67  116:iload_2         
	//   68  117:bipush          92
	//   69  119:bastore         
			i = k + 1;
	//   70  120:iload           4
	//   71  122:iconst_1        
	//   72  123:iadd            
	//   73  124:istore_2        
			abyte0[k] = (byte)j1;
	//   74  125:aload           7
	//   75  127:iload           4
	//   76  129:iload           6
	//   77  131:int2byte        
	//   78  132:bastore         
		} else
	//*  79  133:iload           5
	//*  80  135:istore          4
	//*  81  137:goto            46
		{
			i = _writeGenericEscape(k, i);
	//   82  140:aload_0         
	//   83  141:iload           4
	//   84  143:iload_2         
	//   85  144:invokespecial   #241 <Method int _writeGenericEscape(int, int)>
	//   86  147:istore_2        
		}
_L5:
		k = i1;
		continue; /* Loop/switch isn't completed */
	//*  87  148:goto            133
_L4:
		if(k <= 2047)
	//*  88  151:iload           4
	//*  89  153:sipush          2047
	//*  90  156:icmpgt          201
		{
			int k1 = i + 1;
	//   91  159:iload_2         
	//   92  160:iconst_1        
	//   93  161:iadd            
	//   94  162:istore          6
			abyte0[i] = (byte)(0xc0 | k >> 6);
	//   95  164:aload           7
	//   96  166:iload_2         
	//   97  167:sipush          192
	//   98  170:iload           4
	//   99  172:bipush          6
	//  100  174:ishr            
	//  101  175:ior             
	//  102  176:int2byte        
	//  103  177:bastore         
			i = k1 + 1;
	//  104  178:iload           6
	//  105  180:iconst_1        
	//  106  181:iadd            
	//  107  182:istore_2        
			abyte0[k1] = (byte)(k & 0x3f | 0x80);
	//  108  183:aload           7
	//  109  185:iload           6
	//  110  187:iload           4
	//  111  189:bipush          63
	//  112  191:iand            
	//  113  192:sipush          128
	//  114  195:ior             
	//  115  196:int2byte        
	//  116  197:bastore         
		} else
	//* 117  198:goto            133
		{
			i = _outputMultiByteChar(k, i);
	//  118  201:aload_0         
	//  119  202:iload           4
	//  120  204:iload_2         
	//  121  205:invokespecial   #243 <Method int _outputMultiByteChar(int, int)>
	//  122  208:istore_2        
		}
		if(true) goto _L5; else goto _L2
	//  123  209:goto            133
_L2:
		_outputTail = i;
	//  124  212:aload_0         
	//  125  213:iload_2         
	//  126  214:putfield        #116 <Field int _outputTail>
		return;
	//  127  217:return          
		if(true) goto _L7; else goto _L6
_L6:
	}

	private final void _writeStringSegmentASCII2(String s, int i, int j)
		throws IOException
	{
		if(_outputTail + 6 * (j - i) > _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field int _outputTail>
	//*   2    4:bipush          6
	//*   3    6:iload_3         
	//*   4    7:iload_2         
	//*   5    8:isub            
	//*   6    9:imul            
	//*   7   10:iadd            
	//*   8   11:aload_0         
	//*   9   12:getfield        #89  <Field int _outputEnd>
	//*  10   15:icmple          22
			_flushBuffer();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #125 <Method void _flushBuffer()>
		int l = _outputTail;
	//   13   22:aload_0         
	//   14   23:getfield        #116 <Field int _outputTail>
	//   15   26:istore          5
		byte abyte0[] = _outputBuffer;
	//   16   28:aload_0         
	//   17   29:getfield        #87  <Field byte[] _outputBuffer>
	//   18   32:astore          8
		int ai[] = _outputEscapes;
	//   19   34:aload_0         
	//   20   35:getfield        #198 <Field int[] _outputEscapes>
	//   21   38:astore          9
		int j1 = _maximumNonEscapedChar;
	//   22   40:aload_0         
	//   23   41:getfield        #201 <Field int _maximumNonEscapedChar>
	//   24   44:istore          6
		int k = i;
	//   25   46:iload_2         
	//   26   47:istore          4
		i = l;
	//   27   49:iload           5
	//   28   51:istore_2        
		do
		{
			if(k >= j)
				break;
	//   29   52:iload           4
	//   30   54:iload_3         
	//   31   55:icmpge          238
			int i1 = k + 1;
	//   32   58:iload           4
	//   33   60:iconst_1        
	//   34   61:iadd            
	//   35   62:istore          5
			k = ((int) (s.charAt(k)));
	//   36   64:aload_1         
	//   37   65:iload           4
	//   38   67:invokevirtual   #210 <Method char String.charAt(int)>
	//   39   70:istore          4
			if(k <= '\177')
	//*  40   72:iload           4
	//*  41   74:bipush          127
	//*  42   76:icmpgt          155
			{
				if(ai[k] == 0)
	//*  43   79:aload           9
	//*  44   81:iload           4
	//*  45   83:iaload          
	//*  46   84:ifne            105
				{
					abyte0[i] = (byte)k;
	//   47   87:aload           8
	//   48   89:iload_2         
	//   49   90:iload           4
	//   50   92:int2byte        
	//   51   93:bastore         
					k = i1;
	//   52   94:iload           5
	//   53   96:istore          4
					i++;
	//   54   98:iload_2         
	//   55   99:iconst_1        
	//   56  100:iadd            
	//   57  101:istore_2        
					continue;
	//   58  102:goto            52
				}
				int k1 = ai[k];
	//   59  105:aload           9
	//   60  107:iload           4
	//   61  109:iaload          
	//   62  110:istore          7
				if(k1 > 0)
	//*  63  112:iload           7
	//*  64  114:ifle            144
				{
					k = i + 1;
	//   65  117:iload_2         
	//   66  118:iconst_1        
	//   67  119:iadd            
	//   68  120:istore          4
					abyte0[i] = 92;
	//   69  122:aload           8
	//   70  124:iload_2         
	//   71  125:bipush          92
	//   72  127:bastore         
					i = k + 1;
	//   73  128:iload           4
	//   74  130:iconst_1        
	//   75  131:iadd            
	//   76  132:istore_2        
					abyte0[k] = (byte)k1;
	//   77  133:aload           8
	//   78  135:iload           4
	//   79  137:iload           7
	//   80  139:int2byte        
	//   81  140:bastore         
				} else
	//*  82  141:goto            170
				{
					i = _writeGenericEscape(k, i);
	//   83  144:aload_0         
	//   84  145:iload           4
	//   85  147:iload_2         
	//   86  148:invokespecial   #241 <Method int _writeGenericEscape(int, int)>
	//   87  151:istore_2        
				}
			} else
	//*  88  152:goto            170
			if(k > j1)
	//*  89  155:iload           4
	//*  90  157:iload           6
	//*  91  159:icmple          177
				i = _writeGenericEscape(k, i);
	//   92  162:aload_0         
	//   93  163:iload           4
	//   94  165:iload_2         
	//   95  166:invokespecial   #241 <Method int _writeGenericEscape(int, int)>
	//   96  169:istore_2        
			else
	//*  97  170:iload           5
	//*  98  172:istore          4
	//*  99  174:goto            52
			if(k <= 2047)
	//* 100  177:iload           4
	//* 101  179:sipush          2047
	//* 102  182:icmpgt          227
			{
				int l1 = i + 1;
	//  103  185:iload_2         
	//  104  186:iconst_1        
	//  105  187:iadd            
	//  106  188:istore          7
				abyte0[i] = (byte)(0xc0 | k >> 6);
	//  107  190:aload           8
	//  108  192:iload_2         
	//  109  193:sipush          192
	//  110  196:iload           4
	//  111  198:bipush          6
	//  112  200:ishr            
	//  113  201:ior             
	//  114  202:int2byte        
	//  115  203:bastore         
				i = l1 + 1;
	//  116  204:iload           7
	//  117  206:iconst_1        
	//  118  207:iadd            
	//  119  208:istore_2        
				abyte0[l1] = (byte)(k & 0x3f | 0x80);
	//  120  209:aload           8
	//  121  211:iload           7
	//  122  213:iload           4
	//  123  215:bipush          63
	//  124  217:iand            
	//  125  218:sipush          128
	//  126  221:ior             
	//  127  222:int2byte        
	//  128  223:bastore         
			} else
	//* 129  224:goto            170
			{
				i = _outputMultiByteChar(k, i);
	//  130  227:aload_0         
	//  131  228:iload           4
	//  132  230:iload_2         
	//  133  231:invokespecial   #243 <Method int _outputMultiByteChar(int, int)>
	//  134  234:istore_2        
			}
			k = i1;
		} while(true);
	//* 135  235:goto            170
		_outputTail = i;
	//  136  238:aload_0         
	//  137  239:iload_2         
	//  138  240:putfield        #116 <Field int _outputTail>
	//  139  243:return          
	}

	private final void _writeStringSegmentASCII2(char ac[], int i, int j)
		throws IOException
	{
		if(_outputTail + 6 * (j - i) > _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field int _outputTail>
	//*   2    4:bipush          6
	//*   3    6:iload_3         
	//*   4    7:iload_2         
	//*   5    8:isub            
	//*   6    9:imul            
	//*   7   10:iadd            
	//*   8   11:aload_0         
	//*   9   12:getfield        #89  <Field int _outputEnd>
	//*  10   15:icmple          22
			_flushBuffer();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #125 <Method void _flushBuffer()>
		int l = _outputTail;
	//   13   22:aload_0         
	//   14   23:getfield        #116 <Field int _outputTail>
	//   15   26:istore          5
		byte abyte0[] = _outputBuffer;
	//   16   28:aload_0         
	//   17   29:getfield        #87  <Field byte[] _outputBuffer>
	//   18   32:astore          8
		int ai[] = _outputEscapes;
	//   19   34:aload_0         
	//   20   35:getfield        #198 <Field int[] _outputEscapes>
	//   21   38:astore          9
		int j1 = _maximumNonEscapedChar;
	//   22   40:aload_0         
	//   23   41:getfield        #201 <Field int _maximumNonEscapedChar>
	//   24   44:istore          6
		int k = i;
	//   25   46:iload_2         
	//   26   47:istore          4
		i = l;
	//   27   49:iload           5
	//   28   51:istore_2        
		do
		{
			if(k >= j)
				break;
	//   29   52:iload           4
	//   30   54:iload_3         
	//   31   55:icmpge          236
			int i1 = k + 1;
	//   32   58:iload           4
	//   33   60:iconst_1        
	//   34   61:iadd            
	//   35   62:istore          5
			k = ((int) (ac[k]));
	//   36   64:aload_1         
	//   37   65:iload           4
	//   38   67:caload          
	//   39   68:istore          4
			if(k <= '\177')
	//*  40   70:iload           4
	//*  41   72:bipush          127
	//*  42   74:icmpgt          153
			{
				if(ai[k] == 0)
	//*  43   77:aload           9
	//*  44   79:iload           4
	//*  45   81:iaload          
	//*  46   82:ifne            103
				{
					abyte0[i] = (byte)k;
	//   47   85:aload           8
	//   48   87:iload_2         
	//   49   88:iload           4
	//   50   90:int2byte        
	//   51   91:bastore         
					k = i1;
	//   52   92:iload           5
	//   53   94:istore          4
					i++;
	//   54   96:iload_2         
	//   55   97:iconst_1        
	//   56   98:iadd            
	//   57   99:istore_2        
					continue;
	//   58  100:goto            52
				}
				int k1 = ai[k];
	//   59  103:aload           9
	//   60  105:iload           4
	//   61  107:iaload          
	//   62  108:istore          7
				if(k1 > 0)
	//*  63  110:iload           7
	//*  64  112:ifle            142
				{
					k = i + 1;
	//   65  115:iload_2         
	//   66  116:iconst_1        
	//   67  117:iadd            
	//   68  118:istore          4
					abyte0[i] = 92;
	//   69  120:aload           8
	//   70  122:iload_2         
	//   71  123:bipush          92
	//   72  125:bastore         
					i = k + 1;
	//   73  126:iload           4
	//   74  128:iconst_1        
	//   75  129:iadd            
	//   76  130:istore_2        
					abyte0[k] = (byte)k1;
	//   77  131:aload           8
	//   78  133:iload           4
	//   79  135:iload           7
	//   80  137:int2byte        
	//   81  138:bastore         
				} else
	//*  82  139:goto            168
				{
					i = _writeGenericEscape(k, i);
	//   83  142:aload_0         
	//   84  143:iload           4
	//   85  145:iload_2         
	//   86  146:invokespecial   #241 <Method int _writeGenericEscape(int, int)>
	//   87  149:istore_2        
				}
			} else
	//*  88  150:goto            168
			if(k > j1)
	//*  89  153:iload           4
	//*  90  155:iload           6
	//*  91  157:icmple          175
				i = _writeGenericEscape(k, i);
	//   92  160:aload_0         
	//   93  161:iload           4
	//   94  163:iload_2         
	//   95  164:invokespecial   #241 <Method int _writeGenericEscape(int, int)>
	//   96  167:istore_2        
			else
	//*  97  168:iload           5
	//*  98  170:istore          4
	//*  99  172:goto            52
			if(k <= 2047)
	//* 100  175:iload           4
	//* 101  177:sipush          2047
	//* 102  180:icmpgt          225
			{
				int l1 = i + 1;
	//  103  183:iload_2         
	//  104  184:iconst_1        
	//  105  185:iadd            
	//  106  186:istore          7
				abyte0[i] = (byte)(0xc0 | k >> 6);
	//  107  188:aload           8
	//  108  190:iload_2         
	//  109  191:sipush          192
	//  110  194:iload           4
	//  111  196:bipush          6
	//  112  198:ishr            
	//  113  199:ior             
	//  114  200:int2byte        
	//  115  201:bastore         
				i = l1 + 1;
	//  116  202:iload           7
	//  117  204:iconst_1        
	//  118  205:iadd            
	//  119  206:istore_2        
				abyte0[l1] = (byte)(k & 0x3f | 0x80);
	//  120  207:aload           8
	//  121  209:iload           7
	//  122  211:iload           4
	//  123  213:bipush          63
	//  124  215:iand            
	//  125  216:sipush          128
	//  126  219:ior             
	//  127  220:int2byte        
	//  128  221:bastore         
			} else
	//* 129  222:goto            168
			{
				i = _outputMultiByteChar(k, i);
	//  130  225:aload_0         
	//  131  226:iload           4
	//  132  228:iload_2         
	//  133  229:invokespecial   #243 <Method int _outputMultiByteChar(int, int)>
	//  134  232:istore_2        
			}
			k = i1;
		} while(true);
	//* 135  233:goto            168
		_outputTail = i;
	//  136  236:aload_0         
	//  137  237:iload_2         
	//  138  238:putfield        #116 <Field int _outputTail>
	//  139  241:return          
	}

	private final void _writeStringSegments(String s, int i, int j)
		throws IOException
	{
		int k;
		do
		{
			k = Math.min(_outputMaxContiguous, j);
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field int _outputMaxContiguous>
	//    2    4:iload_3         
	//    3    5:invokestatic    #175 <Method int Math.min(int, int)>
	//    4    8:istore          4
			if(_outputTail + k > _outputEnd)
	//*   5   10:aload_0         
	//*   6   11:getfield        #116 <Field int _outputTail>
	//*   7   14:iload           4
	//*   8   16:iadd            
	//*   9   17:aload_0         
	//*  10   18:getfield        #89  <Field int _outputEnd>
	//*  11   21:icmple          28
				_flushBuffer();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #125 <Method void _flushBuffer()>
			_writeStringSegment(s, i, k);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:iload_2         
	//   17   31:iload           4
	//   18   33:invokespecial   #287 <Method void _writeStringSegment(String, int, int)>
			i += k;
	//   19   36:iload_2         
	//   20   37:iload           4
	//   21   39:iadd            
	//   22   40:istore_2        
			k = j - k;
	//   23   41:iload_3         
	//   24   42:iload           4
	//   25   44:isub            
	//   26   45:istore          4
			j = k;
	//   27   47:iload           4
	//   28   49:istore_3        
		} while(k > 0);
	//   29   50:iload           4
	//   30   52:ifgt            0
	//   31   55:return          
	}

	private final void _writeStringSegments(String s, boolean flag)
		throws IOException
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            45
		{
			if(_outputTail >= _outputEnd)
	//*   2    4:aload_0         
	//*   3    5:getfield        #116 <Field int _outputTail>
	//*   4    8:aload_0         
	//*   5    9:getfield        #89  <Field int _outputEnd>
	//*   6   12:icmplt          19
				_flushBuffer();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #125 <Method void _flushBuffer()>
			byte abyte0[] = _outputBuffer;
	//    9   19:aload_0         
	//   10   20:getfield        #87  <Field byte[] _outputBuffer>
	//   11   23:astore          6
			int i = _outputTail;
	//   12   25:aload_0         
	//   13   26:getfield        #116 <Field int _outputTail>
	//   14   29:istore_3        
			_outputTail = i + 1;
	//   15   30:aload_0         
	//   16   31:iload_3         
	//   17   32:iconst_1        
	//   18   33:iadd            
	//   19   34:putfield        #116 <Field int _outputTail>
			abyte0[i] = _quoteChar;
	//   20   37:aload           6
	//   21   39:iload_3         
	//   22   40:aload_0         
	//   23   41:getfield        #76  <Field byte _quoteChar>
	//   24   44:bastore         
		}
		int j = s.length();
	//   25   45:aload_1         
	//   26   46:invokevirtual   #292 <Method int String.length()>
	//   27   49:istore_3        
		int l = 0;
	//   28   50:iconst_0        
	//   29   51:istore          4
		int i1;
		for(; j > 0; j -= i1)
	//*  30   53:iload_3         
	//*  31   54:ifle            109
		{
			i1 = Math.min(_outputMaxContiguous, j);
	//   32   57:aload_0         
	//   33   58:getfield        #91  <Field int _outputMaxContiguous>
	//   34   61:iload_3         
	//   35   62:invokestatic    #175 <Method int Math.min(int, int)>
	//   36   65:istore          5
			if(_outputTail + i1 > _outputEnd)
	//*  37   67:aload_0         
	//*  38   68:getfield        #116 <Field int _outputTail>
	//*  39   71:iload           5
	//*  40   73:iadd            
	//*  41   74:aload_0         
	//*  42   75:getfield        #89  <Field int _outputEnd>
	//*  43   78:icmple          85
				_flushBuffer();
	//   44   81:aload_0         
	//   45   82:invokevirtual   #125 <Method void _flushBuffer()>
			_writeStringSegment(s, l, i1);
	//   46   85:aload_0         
	//   47   86:aload_1         
	//   48   87:iload           4
	//   49   89:iload           5
	//   50   91:invokespecial   #287 <Method void _writeStringSegment(String, int, int)>
			l += i1;
	//   51   94:iload           4
	//   52   96:iload           5
	//   53   98:iadd            
	//   54   99:istore          4
		}

	//   55  101:iload_3         
	//   56  102:iload           5
	//   57  104:isub            
	//   58  105:istore_3        
	//*  59  106:goto            53
		if(flag)
	//*  60  109:iload_2         
	//*  61  110:ifeq            152
		{
			if(_outputTail >= _outputEnd)
	//*  62  113:aload_0         
	//*  63  114:getfield        #116 <Field int _outputTail>
	//*  64  117:aload_0         
	//*  65  118:getfield        #89  <Field int _outputEnd>
	//*  66  121:icmplt          128
				_flushBuffer();
	//   67  124:aload_0         
	//   68  125:invokevirtual   #125 <Method void _flushBuffer()>
			s = ((String) (_outputBuffer));
	//   69  128:aload_0         
	//   70  129:getfield        #87  <Field byte[] _outputBuffer>
	//   71  132:astore_1        
			int k = _outputTail;
	//   72  133:aload_0         
	//   73  134:getfield        #116 <Field int _outputTail>
	//   74  137:istore_3        
			_outputTail = k + 1;
	//   75  138:aload_0         
	//   76  139:iload_3         
	//   77  140:iconst_1        
	//   78  141:iadd            
	//   79  142:putfield        #116 <Field int _outputTail>
			s[k] = _quoteChar;
	//   80  145:aload_1         
	//   81  146:iload_3         
	//   82  147:aload_0         
	//   83  148:getfield        #76  <Field byte _quoteChar>
	//   84  151:bastore         
		}
	//   85  152:return          
	}

	private final void _writeStringSegments(char ac[], int i, int j)
		throws IOException
	{
		int k;
		do
		{
			k = Math.min(_outputMaxContiguous, j);
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field int _outputMaxContiguous>
	//    2    4:iload_3         
	//    3    5:invokestatic    #175 <Method int Math.min(int, int)>
	//    4    8:istore          4
			if(_outputTail + k > _outputEnd)
	//*   5   10:aload_0         
	//*   6   11:getfield        #116 <Field int _outputTail>
	//*   7   14:iload           4
	//*   8   16:iadd            
	//*   9   17:aload_0         
	//*  10   18:getfield        #89  <Field int _outputEnd>
	//*  11   21:icmple          28
				_flushBuffer();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #125 <Method void _flushBuffer()>
			_writeStringSegment(ac, i, k);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:iload_2         
	//   17   31:iload           4
	//   18   33:invokespecial   #294 <Method void _writeStringSegment(char[], int, int)>
			i += k;
	//   19   36:iload_2         
	//   20   37:iload           4
	//   21   39:iadd            
	//   22   40:istore_2        
			k = j - k;
	//   23   41:iload_3         
	//   24   42:iload           4
	//   25   44:isub            
	//   26   45:istore          4
			j = k;
	//   27   47:iload           4
	//   28   49:istore_3        
		} while(k > 0);
	//   29   50:iload           4
	//   30   52:ifgt            0
	//   31   55:return          
	}

	private final void _writeUTF8Segment(byte abyte0[], int i, int j)
		throws IOException, JsonGenerationException
	{
		int ai[] = _outputEscapes;
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field int[] _outputEscapes>
	//    2    4:astore          6
		for(int k = i; k < i + j; k++)
	//*   3    6:iload_2         
	//*   4    7:istore          4
	//*   5    9:iload           4
	//*   6   11:iload_2         
	//*   7   12:iload_3         
	//*   8   13:iadd            
	//*   9   14:icmpge          53
		{
			byte byte0 = abyte0[k];
	//   10   17:aload_1         
	//   11   18:iload           4
	//   12   20:baload          
	//   13   21:istore          5
			if(byte0 >= 0 && ai[byte0] != 0)
	//*  14   23:iload           5
	//*  15   25:iflt            44
	//*  16   28:aload           6
	//*  17   30:iload           5
	//*  18   32:iaload          
	//*  19   33:ifeq            44
			{
				_writeUTF8Segment2(abyte0, i, j);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:iload_2         
	//   23   39:iload_3         
	//   24   40:invokespecial   #298 <Method void _writeUTF8Segment2(byte[], int, int)>
				return;
	//   25   43:return          
			}
		}

	//   26   44:iload           4
	//   27   46:iconst_1        
	//   28   47:iadd            
	//   29   48:istore          4
	//*  30   50:goto            9
		if(_outputTail + j > _outputEnd)
	//*  31   53:aload_0         
	//*  32   54:getfield        #116 <Field int _outputTail>
	//*  33   57:iload_3         
	//*  34   58:iadd            
	//*  35   59:aload_0         
	//*  36   60:getfield        #89  <Field int _outputEnd>
	//*  37   63:icmple          70
			_flushBuffer();
	//   38   66:aload_0         
	//   39   67:invokevirtual   #125 <Method void _flushBuffer()>
		System.arraycopy(((Object) (abyte0)), i, ((Object) (_outputBuffer)), _outputTail, j);
	//   40   70:aload_1         
	//   41   71:iload_2         
	//   42   72:aload_0         
	//   43   73:getfield        #87  <Field byte[] _outputBuffer>
	//   44   76:aload_0         
	//   45   77:getfield        #116 <Field int _outputTail>
	//   46   80:iload_3         
	//   47   81:invokestatic    #137 <Method void System.arraycopy(Object, int, Object, int, int)>
		_outputTail = _outputTail + j;
	//   48   84:aload_0         
	//   49   85:aload_0         
	//   50   86:getfield        #116 <Field int _outputTail>
	//   51   89:iload_3         
	//   52   90:iadd            
	//   53   91:putfield        #116 <Field int _outputTail>
	//   54   94:return          
	}

	private final void _writeUTF8Segment2(byte abyte0[], int i, int j)
		throws IOException, JsonGenerationException
	{
		int k = _outputTail;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field int _outputTail>
	//    2    4:istore          5
		int l = k;
	//    3    6:iload           5
	//    4    8:istore          6
		if(j * 6 + k > _outputEnd)
	//*   5   10:iload_3         
	//*   6   11:bipush          6
	//*   7   13:imul            
	//*   8   14:iload           5
	//*   9   16:iadd            
	//*  10   17:aload_0         
	//*  11   18:getfield        #89  <Field int _outputEnd>
	//*  12   21:icmple          34
		{
			_flushBuffer();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #125 <Method void _flushBuffer()>
			l = _outputTail;
	//   15   28:aload_0         
	//   16   29:getfield        #116 <Field int _outputTail>
	//   17   32:istore          6
		}
		byte abyte1[] = _outputBuffer;
	//   18   34:aload_0         
	//   19   35:getfield        #87  <Field byte[] _outputBuffer>
	//   20   38:astore          9
		int ai[] = _outputEscapes;
	//   21   40:aload_0         
	//   22   41:getfield        #198 <Field int[] _outputEscapes>
	//   23   44:astore          10
		k = i;
	//   24   46:iload_2         
	//   25   47:istore          5
		do
		{
			int i1 = k;
	//   26   49:iload           5
	//   27   51:istore          7
			if(i1 < j + i)
	//*  28   53:iload           7
	//*  29   55:iload_3         
	//*  30   56:iload_2         
	//*  31   57:iadd            
	//*  32   58:icmpge          160
			{
				k = i1 + 1;
	//   33   61:iload           7
	//   34   63:iconst_1        
	//   35   64:iadd            
	//   36   65:istore          5
				byte byte0 = abyte0[i1];
	//   37   67:aload_1         
	//   38   68:iload           7
	//   39   70:baload          
	//   40   71:istore          4
				if(byte0 >= 0 && ai[byte0] != 0)
	//*  41   73:iload           4
	//*  42   75:iflt            144
	//*  43   78:aload           10
	//*  44   80:iload           4
	//*  45   82:iaload          
	//*  46   83:ifne            89
	//*  47   86:goto            144
				{
					int j1 = ai[byte0];
	//   48   89:aload           10
	//   49   91:iload           4
	//   50   93:iaload          
	//   51   94:istore          7
					if(j1 > 0)
	//*  52   96:iload           7
	//*  53   98:ifle            131
					{
						int k1 = l + 1;
	//   54  101:iload           6
	//   55  103:iconst_1        
	//   56  104:iadd            
	//   57  105:istore          8
						abyte1[l] = 92;
	//   58  107:aload           9
	//   59  109:iload           6
	//   60  111:bipush          92
	//   61  113:bastore         
						l = k1 + 1;
	//   62  114:iload           8
	//   63  116:iconst_1        
	//   64  117:iadd            
	//   65  118:istore          6
						abyte1[k1] = (byte)j1;
	//   66  120:aload           9
	//   67  122:iload           8
	//   68  124:iload           7
	//   69  126:int2byte        
	//   70  127:bastore         
					} else
	//*  71  128:goto            141
					{
						l = _writeGenericEscape(((int) (byte0)), l);
	//   72  131:aload_0         
	//   73  132:iload           4
	//   74  134:iload           6
	//   75  136:invokespecial   #241 <Method int _writeGenericEscape(int, int)>
	//   76  139:istore          6
					}
				} else
	//*  77  141:goto            49
				{
					abyte1[l] = byte0;
	//   78  144:aload           9
	//   79  146:iload           6
	//   80  148:iload           4
	//   81  150:bastore         
					l++;
	//   82  151:iload           6
	//   83  153:iconst_1        
	//   84  154:iadd            
	//   85  155:istore          6
				}
			} else
	//*  86  157:goto            49
			{
				_outputTail = l;
	//   87  160:aload_0         
	//   88  161:iload           6
	//   89  163:putfield        #116 <Field int _outputTail>
				return;
	//   90  166:return          
			}
		} while(true);
	}

	private final void _writeUTF8Segments(byte abyte0[], int i, int j)
		throws IOException, JsonGenerationException
	{
		int k;
		do
		{
			k = Math.min(_outputMaxContiguous, j);
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field int _outputMaxContiguous>
	//    2    4:iload_3         
	//    3    5:invokestatic    #175 <Method int Math.min(int, int)>
	//    4    8:istore          4
			_writeUTF8Segment(abyte0, i, k);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:iload_2         
	//    8   13:iload           4
	//    9   15:invokespecial   #301 <Method void _writeUTF8Segment(byte[], int, int)>
			i += k;
	//   10   18:iload_2         
	//   11   19:iload           4
	//   12   21:iadd            
	//   13   22:istore_2        
			k = j - k;
	//   14   23:iload_3         
	//   15   24:iload           4
	//   16   26:isub            
	//   17   27:istore          4
			j = k;
	//   18   29:iload           4
	//   19   31:istore_3        
		} while(k > 0);
	//   20   32:iload           4
	//   21   34:ifgt            0
	//   22   37:return          
	}

	private final void _writeUnq(SerializableString serializablestring)
		throws IOException
	{
		int i = serializablestring.appendQuotedUTF8(_outputBuffer, _outputTail);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field byte[] _outputBuffer>
	//    3    5:aload_0         
	//    4    6:getfield        #116 <Field int _outputTail>
	//    5    9:invokeinterface #307 <Method int SerializableString.appendQuotedUTF8(byte[], int)>
	//    6   14:istore_2        
		if(i < 0)
	//*   7   15:iload_2         
	//*   8   16:ifge            30
		{
			_writeBytes(serializablestring.asQuotedUTF8());
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokeinterface #310 <Method byte[] SerializableString.asQuotedUTF8()>
	//   12   26:invokespecial   #312 <Method void _writeBytes(byte[])>
			return;
	//   13   29:return          
		} else
		{
			_outputTail = _outputTail + i;
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #116 <Field int _outputTail>
	//   17   35:iload_2         
	//   18   36:iadd            
	//   19   37:putfield        #116 <Field int _outputTail>
			return;
	//   20   40:return          
		}
	}

	protected final void _flushBuffer()
		throws IOException
	{
		int i = _outputTail;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field int _outputTail>
	//    2    4:istore_1        
		if(i > 0)
	//*   3    5:iload_1         
	//*   4    6:ifle            27
		{
			_outputTail = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #116 <Field int _outputTail>
			_outputStream.write(_outputBuffer, 0, i);
	//    8   14:aload_0         
	//    9   15:getfield        #78  <Field OutputStream _outputStream>
	//   10   18:aload_0         
	//   11   19:getfield        #87  <Field byte[] _outputBuffer>
	//   12   22:iconst_0        
	//   13   23:iload_1         
	//   14   24:invokevirtual   #131 <Method void OutputStream.write(byte[], int, int)>
		}
	//   15   27:return          
	}

	protected final void _outputSurrogates(int i, int j)
		throws IOException
	{
		i = _decodeSurrogate(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #315 <Method int _decodeSurrogate(int, int)>
	//    4    6:istore_1        
		if(_outputTail + 4 > _outputEnd)
	//*   5    7:aload_0         
	//*   6    8:getfield        #116 <Field int _outputTail>
	//*   7   11:iconst_4        
	//*   8   12:iadd            
	//*   9   13:aload_0         
	//*  10   14:getfield        #89  <Field int _outputEnd>
	//*  11   17:icmple          24
			_flushBuffer();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #125 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//   14   24:aload_0         
	//   15   25:getfield        #87  <Field byte[] _outputBuffer>
	//   16   28:astore_3        
		j = _outputTail;
	//   17   29:aload_0         
	//   18   30:getfield        #116 <Field int _outputTail>
	//   19   33:istore_2        
		_outputTail = j + 1;
	//   20   34:aload_0         
	//   21   35:iload_2         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:putfield        #116 <Field int _outputTail>
		abyte0[j] = (byte)(0xf0 | i >> 18);
	//   25   41:aload_3         
	//   26   42:iload_2         
	//   27   43:sipush          240
	//   28   46:iload_1         
	//   29   47:bipush          18
	//   30   49:ishr            
	//   31   50:ior             
	//   32   51:int2byte        
	//   33   52:bastore         
		j = _outputTail;
	//   34   53:aload_0         
	//   35   54:getfield        #116 <Field int _outputTail>
	//   36   57:istore_2        
		_outputTail = j + 1;
	//   37   58:aload_0         
	//   38   59:iload_2         
	//   39   60:iconst_1        
	//   40   61:iadd            
	//   41   62:putfield        #116 <Field int _outputTail>
		abyte0[j] = (byte)(i >> 12 & 0x3f | 0x80);
	//   42   65:aload_3         
	//   43   66:iload_2         
	//   44   67:iload_1         
	//   45   68:bipush          12
	//   46   70:ishr            
	//   47   71:bipush          63
	//   48   73:iand            
	//   49   74:sipush          128
	//   50   77:ior             
	//   51   78:int2byte        
	//   52   79:bastore         
		j = _outputTail;
	//   53   80:aload_0         
	//   54   81:getfield        #116 <Field int _outputTail>
	//   55   84:istore_2        
		_outputTail = j + 1;
	//   56   85:aload_0         
	//   57   86:iload_2         
	//   58   87:iconst_1        
	//   59   88:iadd            
	//   60   89:putfield        #116 <Field int _outputTail>
		abyte0[j] = (byte)(i >> 6 & 0x3f | 0x80);
	//   61   92:aload_3         
	//   62   93:iload_2         
	//   63   94:iload_1         
	//   64   95:bipush          6
	//   65   97:ishr            
	//   66   98:bipush          63
	//   67  100:iand            
	//   68  101:sipush          128
	//   69  104:ior             
	//   70  105:int2byte        
	//   71  106:bastore         
		j = _outputTail;
	//   72  107:aload_0         
	//   73  108:getfield        #116 <Field int _outputTail>
	//   74  111:istore_2        
		_outputTail = j + 1;
	//   75  112:aload_0         
	//   76  113:iload_2         
	//   77  114:iconst_1        
	//   78  115:iadd            
	//   79  116:putfield        #116 <Field int _outputTail>
		abyte0[j] = (byte)(i & 0x3f | 0x80);
	//   80  119:aload_3         
	//   81  120:iload_2         
	//   82  121:iload_1         
	//   83  122:bipush          63
	//   84  124:iand            
	//   85  125:sipush          128
	//   86  128:ior             
	//   87  129:int2byte        
	//   88  130:bastore         
	//   89  131:return          
	}

	protected void _releaseBuffers()
	{
		char ac[] = ((char []) (_outputBuffer));
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field byte[] _outputBuffer>
	//    2    4:astore_1        
		if(ac != null && _bufferRecyclable)
	//*   3    5:aload_1         
	//*   4    6:ifnull          29
	//*   5    9:aload_0         
	//*   6   10:getfield        #80  <Field boolean _bufferRecyclable>
	//*   7   13:ifeq            29
		{
			_outputBuffer = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #87  <Field byte[] _outputBuffer>
			_ioContext.releaseWriteEncodingBuffer(((byte []) (ac)));
	//   11   21:aload_0         
	//   12   22:getfield        #320 <Field IOContext _ioContext>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #323 <Method void IOContext.releaseWriteEncodingBuffer(byte[])>
		}
		ac = _charBuffer;
	//   15   29:aload_0         
	//   16   30:getfield        #97  <Field char[] _charBuffer>
	//   17   33:astore_1        
		if(ac != null)
	//*  18   34:aload_1         
	//*  19   35:ifnull          51
		{
			_charBuffer = null;
	//   20   38:aload_0         
	//   21   39:aconst_null     
	//   22   40:putfield        #97  <Field char[] _charBuffer>
			_ioContext.releaseConcatBuffer(ac);
	//   23   43:aload_0         
	//   24   44:getfield        #320 <Field IOContext _ioContext>
	//   25   47:aload_1         
	//   26   48:invokevirtual   #327 <Method void IOContext.releaseConcatBuffer(char[])>
		}
	//   27   51:return          
	}

	protected final void _verifyValueWrite(String s)
		throws IOException
	{
		int i = _writeContext.writeValue();
	//    0    0:aload_0         
	//    1    1:getfield        #332 <Field JsonWriteContext _writeContext>
	//    2    4:invokevirtual   #337 <Method int JsonWriteContext.writeValue()>
	//    3    7:istore_3        
		if(_cfgPrettyPrinter != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #341 <Field PrettyPrinter _cfgPrettyPrinter>
	//*   6   12:ifnull          22
		{
			_verifyPrettyValueWrite(s, i);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:iload_3         
	//   10   18:invokevirtual   #345 <Method void _verifyPrettyValueWrite(String, int)>
			return;
	//   11   21:return          
		}
		if(i != 5)
	//*  12   22:iload_3         
	//*  13   23:iconst_5        
	//*  14   24:icmpeq          131
		{
			byte byte0;
			switch(i)
	//*  15   27:iload_3         
			{
	//*  16   28:tableswitch     1 3: default 56
	//	               1 91
	//	               2 85
	//	               3 57
			default:
				return;
	//   17   56:return          

			case 3: // '\003'
				if(_rootValueSeparator != null)
	//*  18   57:aload_0         
	//*  19   58:getfield        #349 <Field SerializableString _rootValueSeparator>
	//*  20   61:ifnull          84
				{
					s = ((String) (_rootValueSeparator.asUnquotedUTF8()));
	//   21   64:aload_0         
	//   22   65:getfield        #349 <Field SerializableString _rootValueSeparator>
	//   23   68:invokeinterface #190 <Method byte[] SerializableString.asUnquotedUTF8()>
	//   24   73:astore_1        
					if(s.length > 0)
	//*  25   74:aload_1         
	//*  26   75:arraylength     
	//*  27   76:ifle            84
						_writeBytes(((byte []) (s)));
	//   28   79:aload_0         
	//   29   80:aload_1         
	//   30   81:invokespecial   #312 <Method void _writeBytes(byte[])>
				}
				return;
	//   31   84:return          

			case 2: // '\002'
				byte0 = 58;
	//   32   85:bipush          58
	//   33   87:istore_2        
				break;

	//*  34   88:goto            94
			case 1: // '\001'
				byte0 = 44;
	//   35   91:bipush          44
	//   36   93:istore_2        
				break;
			}
			if(_outputTail >= _outputEnd)
	//*  37   94:aload_0         
	//*  38   95:getfield        #116 <Field int _outputTail>
	//*  39   98:aload_0         
	//*  40   99:getfield        #89  <Field int _outputEnd>
	//*  41  102:icmplt          109
				_flushBuffer();
	//   42  105:aload_0         
	//   43  106:invokevirtual   #125 <Method void _flushBuffer()>
			s = ((String) (_outputBuffer));
	//   44  109:aload_0         
	//   45  110:getfield        #87  <Field byte[] _outputBuffer>
	//   46  113:astore_1        
			i = _outputTail;
	//   47  114:aload_0         
	//   48  115:getfield        #116 <Field int _outputTail>
	//   49  118:istore_3        
			_outputTail = i + 1;
	//   50  119:aload_0         
	//   51  120:iload_3         
	//   52  121:iconst_1        
	//   53  122:iadd            
	//   54  123:putfield        #116 <Field int _outputTail>
			s[i] = byte0;
	//   55  126:aload_1         
	//   56  127:iload_3         
	//   57  128:iload_2         
	//   58  129:bastore         
			return;
	//   59  130:return          
		} else
		{
			_reportCantWriteValueExpectName(s);
	//   60  131:aload_0         
	//   61  132:aload_1         
	//   62  133:invokevirtual   #352 <Method void _reportCantWriteValueExpectName(String)>
			return;
	//   63  136:return          
		}
	}

	protected final int _writeBinary(Base64Variant base64variant, InputStream inputstream, byte abyte0[])
		throws IOException, JsonGenerationException
	{
		int k2 = _outputEnd - 6;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int _outputEnd>
	//    2    4:bipush          6
	//    3    6:isub            
	//    4    7:istore          14
		int i = base64variant.getMaxLineLength();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #359 <Method int Base64Variant.getMaxLineLength()>
	//    7   13:istore          4
		int k1 = -3;
	//    8   15:bipush          -3
	//    9   17:istore          10
		int j = i >> 2;
	//   10   19:iload           4
	//   11   21:iconst_2        
	//   12   22:ishr            
	//   13   23:istore          5
		i = 0;
	//   14   25:iconst_0        
	//   15   26:istore          4
		int k = i;
	//   16   28:iload           4
	//   17   30:istore          6
		int j1 = k;
	//   18   32:iload           6
	//   19   34:istore          9
		do
		{
			int l;
			int i1;
			int l1;
			int i2;
			int j2;
			do
			{
				i1 = k1;
	//   20   36:iload           10
	//   21   38:istore          8
				l1 = k;
	//   22   40:iload           6
	//   23   42:istore          11
				l = j1;
	//   24   44:iload           9
	//   25   46:istore          7
				if(k > k1)
	//*  26   48:iload           6
	//*  27   50:iload           10
	//*  28   52:icmple          179
				{
					l = _readMore(inputstream, abyte0, k, j1, abyte0.length);
	//   29   55:aload_0         
	//   30   56:aload_2         
	//   31   57:aload_3         
	//   32   58:iload           6
	//   33   60:iload           9
	//   34   62:aload_3         
	//   35   63:arraylength     
	//   36   64:invokespecial   #361 <Method int _readMore(InputStream, byte[], int, int, int)>
	//   37   67:istore          7
					if(l < 3)
	//*  38   69:iload           7
	//*  39   71:iconst_3        
	//*  40   72:icmpge          170
					{
						j = i;
	//   41   75:iload           4
	//   42   77:istore          5
						if(l > 0)
	//*  43   79:iload           7
	//*  44   81:ifle            167
						{
							if(_outputTail > k2)
	//*  45   84:aload_0         
	//*  46   85:getfield        #116 <Field int _outputTail>
	//*  47   88:iload           14
	//*  48   90:icmple          97
								_flushBuffer();
	//   49   93:aload_0         
	//   50   94:invokevirtual   #125 <Method void _flushBuffer()>
							i1 = abyte0[0] << 16;
	//   51   97:aload_3         
	//   52   98:iconst_0        
	//   53   99:baload          
	//   54  100:bipush          16
	//   55  102:ishl            
	//   56  103:istore          8
							k = 1;
	//   57  105:iconst_1        
	//   58  106:istore          6
							j = i1;
	//   59  108:iload           8
	//   60  110:istore          5
							if(1 < l)
	//*  61  112:iconst_1        
	//*  62  113:iload           7
	//*  63  115:icmpge          136
							{
								j = i1 | (abyte0[1] & 0xff) << 8;
	//   64  118:iload           8
	//   65  120:aload_3         
	//   66  121:iconst_1        
	//   67  122:baload          
	//   68  123:sipush          255
	//   69  126:iand            
	//   70  127:bipush          8
	//   71  129:ishl            
	//   72  130:ior             
	//   73  131:istore          5
								k = 2;
	//   74  133:iconst_2        
	//   75  134:istore          6
							}
							i += k;
	//   76  136:iload           4
	//   77  138:iload           6
	//   78  140:iadd            
	//   79  141:istore          4
							_outputTail = base64variant.encodeBase64Partial(j, k, _outputBuffer, _outputTail);
	//   80  143:aload_0         
	//   81  144:aload_1         
	//   82  145:iload           5
	//   83  147:iload           6
	//   84  149:aload_0         
	//   85  150:getfield        #87  <Field byte[] _outputBuffer>
	//   86  153:aload_0         
	//   87  154:getfield        #116 <Field int _outputTail>
	//   88  157:invokevirtual   #365 <Method int Base64Variant.encodeBase64Partial(int, int, byte[], int)>
	//   89  160:putfield        #116 <Field int _outputTail>
							j = i;
	//   90  163:iload           4
	//   91  165:istore          5
						}
						return j;
	//   92  167:iload           5
	//   93  169:ireturn         
					}
					i1 = l - 3;
	//   94  170:iload           7
	//   95  172:iconst_3        
	//   96  173:isub            
	//   97  174:istore          8
					l1 = 0;
	//   98  176:iconst_0        
	//   99  177:istore          11
				}
				if(_outputTail > k2)
	//* 100  179:aload_0         
	//* 101  180:getfield        #116 <Field int _outputTail>
	//* 102  183:iload           14
	//* 103  185:icmple          192
					_flushBuffer();
	//  104  188:aload_0         
	//  105  189:invokevirtual   #125 <Method void _flushBuffer()>
				j1 = l1 + 1;
	//  106  192:iload           11
	//  107  194:iconst_1        
	//  108  195:iadd            
	//  109  196:istore          9
				k = ((int) (abyte0[l1]));
	//  110  198:aload_3         
	//  111  199:iload           11
	//  112  201:baload          
	//  113  202:istore          6
				k1 = j1 + 1;
	//  114  204:iload           9
	//  115  206:iconst_1        
	//  116  207:iadd            
	//  117  208:istore          10
				j1 = ((int) (abyte0[j1]));
	//  118  210:aload_3         
	//  119  211:iload           9
	//  120  213:baload          
	//  121  214:istore          9
				l1 = k1 + 1;
	//  122  216:iload           10
	//  123  218:iconst_1        
	//  124  219:iadd            
	//  125  220:istore          11
				k1 = ((int) (abyte0[k1]));
	//  126  222:aload_3         
	//  127  223:iload           10
	//  128  225:baload          
	//  129  226:istore          10
				i2 = i + 3;
	//  130  228:iload           4
	//  131  230:iconst_3        
	//  132  231:iadd            
	//  133  232:istore          12
				_outputTail = base64variant.encodeBase64Chunk((j1 & 0xff | k << 8) << 8 | k1 & 0xff, _outputBuffer, _outputTail);
	//  134  234:aload_0         
	//  135  235:aload_1         
	//  136  236:iload           9
	//  137  238:sipush          255
	//  138  241:iand            
	//  139  242:iload           6
	//  140  244:bipush          8
	//  141  246:ishl            
	//  142  247:ior             
	//  143  248:bipush          8
	//  144  250:ishl            
	//  145  251:iload           10
	//  146  253:sipush          255
	//  147  256:iand            
	//  148  257:ior             
	//  149  258:aload_0         
	//  150  259:getfield        #87  <Field byte[] _outputBuffer>
	//  151  262:aload_0         
	//  152  263:getfield        #116 <Field int _outputTail>
	//  153  266:invokevirtual   #368 <Method int Base64Variant.encodeBase64Chunk(int, byte[], int)>
	//  154  269:putfield        #116 <Field int _outputTail>
				j2 = j - 1;
	//  155  272:iload           5
	//  156  274:iconst_1        
	//  157  275:isub            
	//  158  276:istore          13
				i = i2;
	//  159  278:iload           12
	//  160  280:istore          4
				k1 = i1;
	//  161  282:iload           8
	//  162  284:istore          10
				k = l1;
	//  163  286:iload           11
	//  164  288:istore          6
				j1 = l;
	//  165  290:iload           7
	//  166  292:istore          9
				j = j2;
	//  167  294:iload           13
	//  168  296:istore          5
			} while(j2 > 0);
	//  169  298:iload           13
	//  170  300:ifgt            36
			byte abyte1[] = _outputBuffer;
	//  171  303:aload_0         
	//  172  304:getfield        #87  <Field byte[] _outputBuffer>
	//  173  307:astore          15
			i = _outputTail;
	//  174  309:aload_0         
	//  175  310:getfield        #116 <Field int _outputTail>
	//  176  313:istore          4
			_outputTail = i + 1;
	//  177  315:aload_0         
	//  178  316:iload           4
	//  179  318:iconst_1        
	//  180  319:iadd            
	//  181  320:putfield        #116 <Field int _outputTail>
			abyte1[i] = 92;
	//  182  323:aload           15
	//  183  325:iload           4
	//  184  327:bipush          92
	//  185  329:bastore         
			abyte1 = _outputBuffer;
	//  186  330:aload_0         
	//  187  331:getfield        #87  <Field byte[] _outputBuffer>
	//  188  334:astore          15
			i = _outputTail;
	//  189  336:aload_0         
	//  190  337:getfield        #116 <Field int _outputTail>
	//  191  340:istore          4
			_outputTail = i + 1;
	//  192  342:aload_0         
	//  193  343:iload           4
	//  194  345:iconst_1        
	//  195  346:iadd            
	//  196  347:putfield        #116 <Field int _outputTail>
			abyte1[i] = 110;
	//  197  350:aload           15
	//  198  352:iload           4
	//  199  354:bipush          110
	//  200  356:bastore         
			j = base64variant.getMaxLineLength() >> 2;
	//  201  357:aload_1         
	//  202  358:invokevirtual   #359 <Method int Base64Variant.getMaxLineLength()>
	//  203  361:iconst_2        
	//  204  362:ishr            
	//  205  363:istore          5
			i = i2;
	//  206  365:iload           12
	//  207  367:istore          4
			k1 = i1;
	//  208  369:iload           8
	//  209  371:istore          10
			k = l1;
	//  210  373:iload           11
	//  211  375:istore          6
			j1 = l;
	//  212  377:iload           7
	//  213  379:istore          9
		} while(true);
	//  214  381:goto            36
	}

	protected final int _writeBinary(Base64Variant base64variant, InputStream inputstream, byte abyte0[], int i)
		throws IOException, JsonGenerationException
	{
		int l2 = _outputEnd - 6;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int _outputEnd>
	//    2    4:bipush          6
	//    3    6:isub            
	//    4    7:istore          14
		int j1 = base64variant.getMaxLineLength() >> 2;
	//    5    9:aload_1         
	//    6   10:invokevirtual   #359 <Method int Base64Variant.getMaxLineLength()>
	//    7   13:iconst_2        
	//    8   14:ishr            
	//    9   15:istore          8
		int l1 = -3;
	//   10   17:bipush          -3
	//   11   19:istore          10
		int k = 0;
	//   12   21:iconst_0        
	//   13   22:istore          6
		int l = k;
	//   14   24:iload           6
	//   15   26:istore          7
		int j = i;
	//   16   28:iload           4
	//   17   30:istore          5
		i = k;
	//   18   32:iload           6
	//   19   34:istore          4
		k = j1;
	//   20   36:iload           8
	//   21   38:istore          6
		int k1;
		do
		{
			j1 = i;
	//   22   40:iload           4
	//   23   42:istore          8
			k1 = l;
	//   24   44:iload           7
	//   25   46:istore          9
			if(j <= 2)
				break;
	//   26   48:iload           5
	//   27   50:iconst_2        
	//   28   51:icmple          321
			k1 = l1;
	//   29   54:iload           10
	//   30   56:istore          9
			int i2 = i;
	//   31   58:iload           4
	//   32   60:istore          11
			j1 = l;
	//   33   62:iload           7
	//   34   64:istore          8
			if(i > l1)
	//*  35   66:iload           4
	//*  36   68:iload           10
	//*  37   70:icmple          116
			{
				i = _readMore(inputstream, abyte0, i, l, j);
	//   38   73:aload_0         
	//   39   74:aload_2         
	//   40   75:aload_3         
	//   41   76:iload           4
	//   42   78:iload           7
	//   43   80:iload           5
	//   44   82:invokespecial   #361 <Method int _readMore(InputStream, byte[], int, int, int)>
	//   45   85:istore          4
				if(i < 3)
	//*  46   87:iload           4
	//*  47   89:iconst_3        
	//*  48   90:icmpge          103
				{
					j1 = 0;
	//   49   93:iconst_0        
	//   50   94:istore          8
					k1 = i;
	//   51   96:iload           4
	//   52   98:istore          9
					break;
	//   53  100:goto            321
				}
				j1 = i;
	//   54  103:iload           4
	//   55  105:istore          8
				i2 = 0;
	//   56  107:iconst_0        
	//   57  108:istore          11
				k1 = i - 3;
	//   58  110:iload           4
	//   59  112:iconst_3        
	//   60  113:isub            
	//   61  114:istore          9
			}
			if(_outputTail > l2)
	//*  62  116:aload_0         
	//*  63  117:getfield        #116 <Field int _outputTail>
	//*  64  120:iload           14
	//*  65  122:icmple          129
				_flushBuffer();
	//   66  125:aload_0         
	//   67  126:invokevirtual   #125 <Method void _flushBuffer()>
			l = i2 + 1;
	//   68  129:iload           11
	//   69  131:iconst_1        
	//   70  132:iadd            
	//   71  133:istore          7
			i = ((int) (abyte0[i2]));
	//   72  135:aload_3         
	//   73  136:iload           11
	//   74  138:baload          
	//   75  139:istore          4
			l1 = l + 1;
	//   76  141:iload           7
	//   77  143:iconst_1        
	//   78  144:iadd            
	//   79  145:istore          10
			l = ((int) (abyte0[l]));
	//   80  147:aload_3         
	//   81  148:iload           7
	//   82  150:baload          
	//   83  151:istore          7
			i2 = l1 + 1;
	//   84  153:iload           10
	//   85  155:iconst_1        
	//   86  156:iadd            
	//   87  157:istore          11
			l1 = ((int) (abyte0[l1]));
	//   88  159:aload_3         
	//   89  160:iload           10
	//   90  162:baload          
	//   91  163:istore          10
			int j2 = j - 3;
	//   92  165:iload           5
	//   93  167:iconst_3        
	//   94  168:isub            
	//   95  169:istore          12
			_outputTail = base64variant.encodeBase64Chunk((l & 0xff | i << 8) << 8 | l1 & 0xff, _outputBuffer, _outputTail);
	//   96  171:aload_0         
	//   97  172:aload_1         
	//   98  173:iload           7
	//   99  175:sipush          255
	//  100  178:iand            
	//  101  179:iload           4
	//  102  181:bipush          8
	//  103  183:ishl            
	//  104  184:ior             
	//  105  185:bipush          8
	//  106  187:ishl            
	//  107  188:iload           10
	//  108  190:sipush          255
	//  109  193:iand            
	//  110  194:ior             
	//  111  195:aload_0         
	//  112  196:getfield        #87  <Field byte[] _outputBuffer>
	//  113  199:aload_0         
	//  114  200:getfield        #116 <Field int _outputTail>
	//  115  203:invokevirtual   #368 <Method int Base64Variant.encodeBase64Chunk(int, byte[], int)>
	//  116  206:putfield        #116 <Field int _outputTail>
			int k2 = k - 1;
	//  117  209:iload           6
	//  118  211:iconst_1        
	//  119  212:isub            
	//  120  213:istore          13
			k = k2;
	//  121  215:iload           13
	//  122  217:istore          6
			l1 = k1;
	//  123  219:iload           9
	//  124  221:istore          10
			i = i2;
	//  125  223:iload           11
	//  126  225:istore          4
			l = j1;
	//  127  227:iload           8
	//  128  229:istore          7
			j = j2;
	//  129  231:iload           12
	//  130  233:istore          5
			if(k2 <= 0)
	//* 131  235:iload           13
	//* 132  237:ifgt            40
			{
				byte abyte1[] = _outputBuffer;
	//  133  240:aload_0         
	//  134  241:getfield        #87  <Field byte[] _outputBuffer>
	//  135  244:astore          15
				i = _outputTail;
	//  136  246:aload_0         
	//  137  247:getfield        #116 <Field int _outputTail>
	//  138  250:istore          4
				_outputTail = i + 1;
	//  139  252:aload_0         
	//  140  253:iload           4
	//  141  255:iconst_1        
	//  142  256:iadd            
	//  143  257:putfield        #116 <Field int _outputTail>
				abyte1[i] = 92;
	//  144  260:aload           15
	//  145  262:iload           4
	//  146  264:bipush          92
	//  147  266:bastore         
				abyte1 = _outputBuffer;
	//  148  267:aload_0         
	//  149  268:getfield        #87  <Field byte[] _outputBuffer>
	//  150  271:astore          15
				i = _outputTail;
	//  151  273:aload_0         
	//  152  274:getfield        #116 <Field int _outputTail>
	//  153  277:istore          4
				_outputTail = i + 1;
	//  154  279:aload_0         
	//  155  280:iload           4
	//  156  282:iconst_1        
	//  157  283:iadd            
	//  158  284:putfield        #116 <Field int _outputTail>
				abyte1[i] = 110;
	//  159  287:aload           15
	//  160  289:iload           4
	//  161  291:bipush          110
	//  162  293:bastore         
				k = base64variant.getMaxLineLength() >> 2;
	//  163  294:aload_1         
	//  164  295:invokevirtual   #359 <Method int Base64Variant.getMaxLineLength()>
	//  165  298:iconst_2        
	//  166  299:ishr            
	//  167  300:istore          6
				l1 = k1;
	//  168  302:iload           9
	//  169  304:istore          10
				i = i2;
	//  170  306:iload           11
	//  171  308:istore          4
				l = j1;
	//  172  310:iload           8
	//  173  312:istore          7
				j = j2;
	//  174  314:iload           12
	//  175  316:istore          5
			}
		} while(true);
	//  176  318:goto            40
		i = j;
	//  177  321:iload           5
	//  178  323:istore          4
		if(j > 0)
	//* 179  325:iload           5
	//* 180  327:ifle            432
		{
			j1 = _readMore(inputstream, abyte0, j1, k1, j);
	//  181  330:aload_0         
	//  182  331:aload_2         
	//  183  332:aload_3         
	//  184  333:iload           8
	//  185  335:iload           9
	//  186  337:iload           5
	//  187  339:invokespecial   #361 <Method int _readMore(InputStream, byte[], int, int, int)>
	//  188  342:istore          8
			i = j;
	//  189  344:iload           5
	//  190  346:istore          4
			if(j1 > 0)
	//* 191  348:iload           8
	//* 192  350:ifle            432
			{
				if(_outputTail > l2)
	//* 193  353:aload_0         
	//* 194  354:getfield        #116 <Field int _outputTail>
	//* 195  357:iload           14
	//* 196  359:icmple          366
					_flushBuffer();
	//  197  362:aload_0         
	//  198  363:invokevirtual   #125 <Method void _flushBuffer()>
				int i1 = abyte0[0] << 16;
	//  199  366:aload_3         
	//  200  367:iconst_0        
	//  201  368:baload          
	//  202  369:bipush          16
	//  203  371:ishl            
	//  204  372:istore          7
				byte byte0 = 1;
	//  205  374:iconst_1        
	//  206  375:istore          6
				i = i1;
	//  207  377:iload           7
	//  208  379:istore          4
				if(1 < j1)
	//* 209  381:iconst_1        
	//* 210  382:iload           8
	//* 211  384:icmpge          405
				{
					i = i1 | (abyte0[1] & 0xff) << 8;
	//  212  387:iload           7
	//  213  389:aload_3         
	//  214  390:iconst_1        
	//  215  391:baload          
	//  216  392:sipush          255
	//  217  395:iand            
	//  218  396:bipush          8
	//  219  398:ishl            
	//  220  399:ior             
	//  221  400:istore          4
					byte0 = 2;
	//  222  402:iconst_2        
	//  223  403:istore          6
				}
				_outputTail = base64variant.encodeBase64Partial(i, ((int) (byte0)), _outputBuffer, _outputTail);
	//  224  405:aload_0         
	//  225  406:aload_1         
	//  226  407:iload           4
	//  227  409:iload           6
	//  228  411:aload_0         
	//  229  412:getfield        #87  <Field byte[] _outputBuffer>
	//  230  415:aload_0         
	//  231  416:getfield        #116 <Field int _outputTail>
	//  232  419:invokevirtual   #365 <Method int Base64Variant.encodeBase64Partial(int, int, byte[], int)>
	//  233  422:putfield        #116 <Field int _outputTail>
				i = j - byte0;
	//  234  425:iload           5
	//  235  427:iload           6
	//  236  429:isub            
	//  237  430:istore          4
			}
		}
		return i;
	//  238  432:iload           4
	//  239  434:ireturn         
	}

	protected final void _writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
		throws IOException, JsonGenerationException
	{
		int k1 = _outputEnd - 6;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int _outputEnd>
	//    2    4:bipush          6
	//    3    6:isub            
	//    4    7:istore          7
		int k = base64variant.getMaxLineLength() >> 2;
	//    5    9:aload_1         
	//    6   10:invokevirtual   #359 <Method int Base64Variant.getMaxLineLength()>
	//    7   13:iconst_2        
	//    8   14:ishr            
	//    9   15:istore          5
		int i1;
		for(; i <= j - 3; i = i1)
	//*  10   17:iload_3         
	//*  11   18:iload           4
	//*  12   20:iconst_3        
	//*  13   21:isub            
	//*  14   22:icmpgt          178
		{
			if(_outputTail > k1)
	//*  15   25:aload_0         
	//*  16   26:getfield        #116 <Field int _outputTail>
	//*  17   29:iload           7
	//*  18   31:icmple          38
				_flushBuffer();
	//   19   34:aload_0         
	//   20   35:invokevirtual   #125 <Method void _flushBuffer()>
			int l1 = i + 1;
	//   21   38:iload_3         
	//   22   39:iconst_1        
	//   23   40:iadd            
	//   24   41:istore          8
			i = ((int) (abyte0[i]));
	//   25   43:aload_2         
	//   26   44:iload_3         
	//   27   45:baload          
	//   28   46:istore_3        
			i1 = l1 + 1;
	//   29   47:iload           8
	//   30   49:iconst_1        
	//   31   50:iadd            
	//   32   51:istore          6
			_outputTail = base64variant.encodeBase64Chunk((i << 8 | abyte0[l1] & 0xff) << 8 | abyte0[i1] & 0xff, _outputBuffer, _outputTail);
	//   33   53:aload_0         
	//   34   54:aload_1         
	//   35   55:iload_3         
	//   36   56:bipush          8
	//   37   58:ishl            
	//   38   59:aload_2         
	//   39   60:iload           8
	//   40   62:baload          
	//   41   63:sipush          255
	//   42   66:iand            
	//   43   67:ior             
	//   44   68:bipush          8
	//   45   70:ishl            
	//   46   71:aload_2         
	//   47   72:iload           6
	//   48   74:baload          
	//   49   75:sipush          255
	//   50   78:iand            
	//   51   79:ior             
	//   52   80:aload_0         
	//   53   81:getfield        #87  <Field byte[] _outputBuffer>
	//   54   84:aload_0         
	//   55   85:getfield        #116 <Field int _outputTail>
	//   56   88:invokevirtual   #368 <Method int Base64Variant.encodeBase64Chunk(int, byte[], int)>
	//   57   91:putfield        #116 <Field int _outputTail>
			k--;
	//   58   94:iload           5
	//   59   96:iconst_1        
	//   60   97:isub            
	//   61   98:istore          5
			i = k;
	//   62  100:iload           5
	//   63  102:istore_3        
			if(k <= 0)
	//*  64  103:iload           5
	//*  65  105:ifgt            163
			{
				byte abyte1[] = _outputBuffer;
	//   66  108:aload_0         
	//   67  109:getfield        #87  <Field byte[] _outputBuffer>
	//   68  112:astore          9
				i = _outputTail;
	//   69  114:aload_0         
	//   70  115:getfield        #116 <Field int _outputTail>
	//   71  118:istore_3        
				_outputTail = i + 1;
	//   72  119:aload_0         
	//   73  120:iload_3         
	//   74  121:iconst_1        
	//   75  122:iadd            
	//   76  123:putfield        #116 <Field int _outputTail>
				abyte1[i] = 92;
	//   77  126:aload           9
	//   78  128:iload_3         
	//   79  129:bipush          92
	//   80  131:bastore         
				abyte1 = _outputBuffer;
	//   81  132:aload_0         
	//   82  133:getfield        #87  <Field byte[] _outputBuffer>
	//   83  136:astore          9
				i = _outputTail;
	//   84  138:aload_0         
	//   85  139:getfield        #116 <Field int _outputTail>
	//   86  142:istore_3        
				_outputTail = i + 1;
	//   87  143:aload_0         
	//   88  144:iload_3         
	//   89  145:iconst_1        
	//   90  146:iadd            
	//   91  147:putfield        #116 <Field int _outputTail>
				abyte1[i] = 110;
	//   92  150:aload           9
	//   93  152:iload_3         
	//   94  153:bipush          110
	//   95  155:bastore         
				i = base64variant.getMaxLineLength() >> 2;
	//   96  156:aload_1         
	//   97  157:invokevirtual   #359 <Method int Base64Variant.getMaxLineLength()>
	//   98  160:iconst_2        
	//   99  161:ishr            
	//  100  162:istore_3        
			}
			i1++;
	//  101  163:iload           6
	//  102  165:iconst_1        
	//  103  166:iadd            
	//  104  167:istore          6
			k = i;
	//  105  169:iload_3         
	//  106  170:istore          5
		}

	//  107  172:iload           6
	//  108  174:istore_3        
	//* 109  175:goto            17
		int j1 = j - i;
	//  110  178:iload           4
	//  111  180:iload_3         
	//  112  181:isub            
	//  113  182:istore          6
		if(j1 > 0)
	//* 114  184:iload           6
	//* 115  186:ifle            257
		{
			if(_outputTail > k1)
	//* 116  189:aload_0         
	//* 117  190:getfield        #116 <Field int _outputTail>
	//* 118  193:iload           7
	//* 119  195:icmple          202
				_flushBuffer();
	//  120  198:aload_0         
	//  121  199:invokevirtual   #125 <Method void _flushBuffer()>
			int l = abyte0[i] << 16;
	//  122  202:aload_2         
	//  123  203:iload_3         
	//  124  204:baload          
	//  125  205:bipush          16
	//  126  207:ishl            
	//  127  208:istore          5
			j = l;
	//  128  210:iload           5
	//  129  212:istore          4
			if(j1 == 2)
	//* 130  214:iload           6
	//* 131  216:iconst_2        
	//* 132  217:icmpne          237
				j = l | (abyte0[i + 1] & 0xff) << 8;
	//  133  220:iload           5
	//  134  222:aload_2         
	//  135  223:iload_3         
	//  136  224:iconst_1        
	//  137  225:iadd            
	//  138  226:baload          
	//  139  227:sipush          255
	//  140  230:iand            
	//  141  231:bipush          8
	//  142  233:ishl            
	//  143  234:ior             
	//  144  235:istore          4
			_outputTail = base64variant.encodeBase64Partial(j, j1, _outputBuffer, _outputTail);
	//  145  237:aload_0         
	//  146  238:aload_1         
	//  147  239:iload           4
	//  148  241:iload           6
	//  149  243:aload_0         
	//  150  244:getfield        #87  <Field byte[] _outputBuffer>
	//  151  247:aload_0         
	//  152  248:getfield        #116 <Field int _outputTail>
	//  153  251:invokevirtual   #365 <Method int Base64Variant.encodeBase64Partial(int, int, byte[], int)>
	//  154  254:putfield        #116 <Field int _outputTail>
		}
	//  155  257:return          
	}

	protected final void _writePPFieldName(SerializableString serializablestring)
		throws IOException
	{
		int i = _writeContext.writeFieldName(serializablestring.getValue());
	//    0    0:aload_0         
	//    1    1:getfield        #332 <Field JsonWriteContext _writeContext>
	//    2    4:aload_1         
	//    3    5:invokeinterface #374 <Method String SerializableString.getValue()>
	//    4   10:invokevirtual   #378 <Method int JsonWriteContext.writeFieldName(String)>
	//    5   13:istore_2        
		if(i == 4)
	//*   6   14:iload_2         
	//*   7   15:iconst_4        
	//*   8   16:icmpne          26
			_reportError("Can not write a field name, expecting a value");
	//    9   19:aload_0         
	//   10   20:ldc2            #380 <String "Can not write a field name, expecting a value">
	//   11   23:invokevirtual   #164 <Method void _reportError(String)>
		if(i == 1)
	//*  12   26:iload_2         
	//*  13   27:iconst_1        
	//*  14   28:icmpne          44
			_cfgPrettyPrinter.writeObjectEntrySeparator(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   15   31:aload_0         
	//   16   32:getfield        #341 <Field PrettyPrinter _cfgPrettyPrinter>
	//   17   35:aload_0         
	//   18   36:invokeinterface #386 <Method void PrettyPrinter.writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)>
		else
	//*  19   41:goto            54
			_cfgPrettyPrinter.beforeObjectEntries(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   20   44:aload_0         
	//   21   45:getfield        #341 <Field PrettyPrinter _cfgPrettyPrinter>
	//   22   48:aload_0         
	//   23   49:invokeinterface #389 <Method void PrettyPrinter.beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)>
		boolean flag = _cfgUnqNames ^ true;
	//   24   54:aload_0         
	//   25   55:getfield        #392 <Field boolean _cfgUnqNames>
	//   26   58:iconst_1        
	//   27   59:ixor            
	//   28   60:istore_2        
		if(flag)
	//*  29   61:iload_2         
	//*  30   62:ifeq            106
		{
			if(_outputTail >= _outputEnd)
	//*  31   65:aload_0         
	//*  32   66:getfield        #116 <Field int _outputTail>
	//*  33   69:aload_0         
	//*  34   70:getfield        #89  <Field int _outputEnd>
	//*  35   73:icmplt          80
				_flushBuffer();
	//   36   76:aload_0         
	//   37   77:invokevirtual   #125 <Method void _flushBuffer()>
			byte abyte0[] = _outputBuffer;
	//   38   80:aload_0         
	//   39   81:getfield        #87  <Field byte[] _outputBuffer>
	//   40   84:astore          4
			int k = _outputTail;
	//   41   86:aload_0         
	//   42   87:getfield        #116 <Field int _outputTail>
	//   43   90:istore_3        
			_outputTail = k + 1;
	//   44   91:aload_0         
	//   45   92:iload_3         
	//   46   93:iconst_1        
	//   47   94:iadd            
	//   48   95:putfield        #116 <Field int _outputTail>
			abyte0[k] = _quoteChar;
	//   49   98:aload           4
	//   50  100:iload_3         
	//   51  101:aload_0         
	//   52  102:getfield        #76  <Field byte _quoteChar>
	//   53  105:bastore         
		}
		_writeBytes(serializablestring.asQuotedUTF8());
	//   54  106:aload_0         
	//   55  107:aload_1         
	//   56  108:invokeinterface #310 <Method byte[] SerializableString.asQuotedUTF8()>
	//   57  113:invokespecial   #312 <Method void _writeBytes(byte[])>
		if(flag)
	//*  58  116:iload_2         
	//*  59  117:ifeq            159
		{
			if(_outputTail >= _outputEnd)
	//*  60  120:aload_0         
	//*  61  121:getfield        #116 <Field int _outputTail>
	//*  62  124:aload_0         
	//*  63  125:getfield        #89  <Field int _outputEnd>
	//*  64  128:icmplt          135
				_flushBuffer();
	//   65  131:aload_0         
	//   66  132:invokevirtual   #125 <Method void _flushBuffer()>
			serializablestring = ((SerializableString) (_outputBuffer));
	//   67  135:aload_0         
	//   68  136:getfield        #87  <Field byte[] _outputBuffer>
	//   69  139:astore_1        
			int j = _outputTail;
	//   70  140:aload_0         
	//   71  141:getfield        #116 <Field int _outputTail>
	//   72  144:istore_2        
			_outputTail = j + 1;
	//   73  145:aload_0         
	//   74  146:iload_2         
	//   75  147:iconst_1        
	//   76  148:iadd            
	//   77  149:putfield        #116 <Field int _outputTail>
			serializablestring[j] = _quoteChar;
	//   78  152:aload_1         
	//   79  153:iload_2         
	//   80  154:aload_0         
	//   81  155:getfield        #76  <Field byte _quoteChar>
	//   82  158:bastore         
		}
	//   83  159:return          
	}

	protected final void _writePPFieldName(String s)
		throws IOException
	{
		int i = _writeContext.writeFieldName(s);
	//    0    0:aload_0         
	//    1    1:getfield        #332 <Field JsonWriteContext _writeContext>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #378 <Method int JsonWriteContext.writeFieldName(String)>
	//    4    8:istore_2        
		if(i == 4)
	//*   5    9:iload_2         
	//*   6   10:iconst_4        
	//*   7   11:icmpne          21
			_reportError("Can not write a field name, expecting a value");
	//    8   14:aload_0         
	//    9   15:ldc2            #380 <String "Can not write a field name, expecting a value">
	//   10   18:invokevirtual   #164 <Method void _reportError(String)>
		if(i == 1)
	//*  11   21:iload_2         
	//*  12   22:iconst_1        
	//*  13   23:icmpne          39
			_cfgPrettyPrinter.writeObjectEntrySeparator(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   14   26:aload_0         
	//   15   27:getfield        #341 <Field PrettyPrinter _cfgPrettyPrinter>
	//   16   30:aload_0         
	//   17   31:invokeinterface #386 <Method void PrettyPrinter.writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)>
		else
	//*  18   36:goto            49
			_cfgPrettyPrinter.beforeObjectEntries(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   19   39:aload_0         
	//   20   40:getfield        #341 <Field PrettyPrinter _cfgPrettyPrinter>
	//   21   43:aload_0         
	//   22   44:invokeinterface #389 <Method void PrettyPrinter.beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)>
		if(_cfgUnqNames)
	//*  23   49:aload_0         
	//*  24   50:getfield        #392 <Field boolean _cfgUnqNames>
	//*  25   53:ifeq            63
		{
			_writeStringSegments(s, false);
	//   26   56:aload_0         
	//   27   57:aload_1         
	//   28   58:iconst_0        
	//   29   59:invokespecial   #394 <Method void _writeStringSegments(String, boolean)>
			return;
	//   30   62:return          
		}
		i = s.length();
	//   31   63:aload_1         
	//   32   64:invokevirtual   #292 <Method int String.length()>
	//   33   67:istore_2        
		if(i > _charBufferLength)
	//*  34   68:iload_2         
	//*  35   69:aload_0         
	//*  36   70:getfield        #99  <Field int _charBufferLength>
	//*  37   73:icmple          83
		{
			_writeStringSegments(s, true);
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:iconst_1        
	//   41   79:invokespecial   #394 <Method void _writeStringSegments(String, boolean)>
			return;
	//   42   82:return          
		}
		if(_outputTail >= _outputEnd)
	//*  43   83:aload_0         
	//*  44   84:getfield        #116 <Field int _outputTail>
	//*  45   87:aload_0         
	//*  46   88:getfield        #89  <Field int _outputEnd>
	//*  47   91:icmplt          98
			_flushBuffer();
	//   48   94:aload_0         
	//   49   95:invokevirtual   #125 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//   50   98:aload_0         
	//   51   99:getfield        #87  <Field byte[] _outputBuffer>
	//   52  102:astore          4
		int j = _outputTail;
	//   53  104:aload_0         
	//   54  105:getfield        #116 <Field int _outputTail>
	//   55  108:istore_3        
		_outputTail = j + 1;
	//   56  109:aload_0         
	//   57  110:iload_3         
	//   58  111:iconst_1        
	//   59  112:iadd            
	//   60  113:putfield        #116 <Field int _outputTail>
		abyte0[j] = _quoteChar;
	//   61  116:aload           4
	//   62  118:iload_3         
	//   63  119:aload_0         
	//   64  120:getfield        #76  <Field byte _quoteChar>
	//   65  123:bastore         
		s.getChars(0, i, _charBuffer, 0);
	//   66  124:aload_1         
	//   67  125:iconst_0        
	//   68  126:iload_2         
	//   69  127:aload_0         
	//   70  128:getfield        #97  <Field char[] _charBuffer>
	//   71  131:iconst_0        
	//   72  132:invokevirtual   #398 <Method void String.getChars(int, int, char[], int)>
		if(i <= _outputMaxContiguous)
	//*  73  135:iload_2         
	//*  74  136:aload_0         
	//*  75  137:getfield        #91  <Field int _outputMaxContiguous>
	//*  76  140:icmpgt          173
		{
			if(_outputTail + i > _outputEnd)
	//*  77  143:aload_0         
	//*  78  144:getfield        #116 <Field int _outputTail>
	//*  79  147:iload_2         
	//*  80  148:iadd            
	//*  81  149:aload_0         
	//*  82  150:getfield        #89  <Field int _outputEnd>
	//*  83  153:icmple          160
				_flushBuffer();
	//   84  156:aload_0         
	//   85  157:invokevirtual   #125 <Method void _flushBuffer()>
			_writeStringSegment(_charBuffer, 0, i);
	//   86  160:aload_0         
	//   87  161:aload_0         
	//   88  162:getfield        #97  <Field char[] _charBuffer>
	//   89  165:iconst_0        
	//   90  166:iload_2         
	//   91  167:invokespecial   #294 <Method void _writeStringSegment(char[], int, int)>
		} else
	//*  92  170:goto            183
		{
			_writeStringSegments(_charBuffer, 0, i);
	//   93  173:aload_0         
	//   94  174:aload_0         
	//   95  175:getfield        #97  <Field char[] _charBuffer>
	//   96  178:iconst_0        
	//   97  179:iload_2         
	//   98  180:invokespecial   #400 <Method void _writeStringSegments(char[], int, int)>
		}
		if(_outputTail >= _outputEnd)
	//*  99  183:aload_0         
	//* 100  184:getfield        #116 <Field int _outputTail>
	//* 101  187:aload_0         
	//* 102  188:getfield        #89  <Field int _outputEnd>
	//* 103  191:icmplt          198
			_flushBuffer();
	//  104  194:aload_0         
	//  105  195:invokevirtual   #125 <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//  106  198:aload_0         
	//  107  199:getfield        #87  <Field byte[] _outputBuffer>
	//  108  202:astore_1        
		i = _outputTail;
	//  109  203:aload_0         
	//  110  204:getfield        #116 <Field int _outputTail>
	//  111  207:istore_2        
		_outputTail = i + 1;
	//  112  208:aload_0         
	//  113  209:iload_2         
	//  114  210:iconst_1        
	//  115  211:iadd            
	//  116  212:putfield        #116 <Field int _outputTail>
		s[i] = _quoteChar;
	//  117  215:aload_1         
	//  118  216:iload_2         
	//  119  217:aload_0         
	//  120  218:getfield        #76  <Field byte _quoteChar>
	//  121  221:bastore         
	//  122  222:return          
	}

	public void close()
		throws IOException
	{
		super.close();
	//    0    0:aload_0         
	//    1    1:invokespecial   #403 <Method void JsonGeneratorImpl.close()>
		if(_outputBuffer != null && isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT))
	//*   2    4:aload_0         
	//*   3    5:getfield        #87  <Field byte[] _outputBuffer>
	//*   4    8:ifnull          54
	//*   5   11:aload_0         
	//*   6   12:getstatic       #406 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_JSON_CONTENT>
	//*   7   15:invokevirtual   #109 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*   8   18:ifeq            54
			do
			{
				JsonStreamContext jsonstreamcontext = getOutputContext();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #410 <Method JsonStreamContext getOutputContext()>
	//   11   25:astore_1        
				if(jsonstreamcontext.inArray())
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #416 <Method boolean JsonStreamContext.inArray()>
	//*  14   30:ifeq            40
				{
					writeEndArray();
	//   15   33:aload_0         
	//   16   34:invokevirtual   #419 <Method void writeEndArray()>
					continue;
	//   17   37:goto            21
				}
				if(!jsonstreamcontext.inObject())
					break;
	//   18   40:aload_1         
	//   19   41:invokevirtual   #422 <Method boolean JsonStreamContext.inObject()>
	//   20   44:ifeq            54
				writeEndObject();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #425 <Method void writeEndObject()>
			} while(true);
	//   23   51:goto            21
		_flushBuffer();
	//   24   54:aload_0         
	//   25   55:invokevirtual   #125 <Method void _flushBuffer()>
		_outputTail = 0;
	//   26   58:aload_0         
	//   27   59:iconst_0        
	//   28   60:putfield        #116 <Field int _outputTail>
		if(_outputStream != null)
	//*  29   63:aload_0         
	//*  30   64:getfield        #78  <Field OutputStream _outputStream>
	//*  31   67:ifnull          120
			if(!_ioContext.isResourceManaged() && !isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET))
	//*  32   70:aload_0         
	//*  33   71:getfield        #320 <Field IOContext _ioContext>
	//*  34   74:invokevirtual   #428 <Method boolean IOContext.isResourceManaged()>
	//*  35   77:ifne            113
	//*  36   80:aload_0         
	//*  37   81:getstatic       #431 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_TARGET>
	//*  38   84:invokevirtual   #109 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*  39   87:ifeq            93
	//*  40   90:goto            113
			{
				if(isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM))
	//*  41   93:aload_0         
	//*  42   94:getstatic       #434 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.FLUSH_PASSED_TO_STREAM>
	//*  43   97:invokevirtual   #109 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*  44  100:ifeq            120
					_outputStream.flush();
	//   45  103:aload_0         
	//   46  104:getfield        #78  <Field OutputStream _outputStream>
	//   47  107:invokevirtual   #437 <Method void OutputStream.flush()>
			} else
	//*  48  110:goto            120
			{
				_outputStream.close();
	//   49  113:aload_0         
	//   50  114:getfield        #78  <Field OutputStream _outputStream>
	//   51  117:invokevirtual   #438 <Method void OutputStream.close()>
			}
		_releaseBuffers();
	//   52  120:aload_0         
	//   53  121:invokevirtual   #440 <Method void _releaseBuffers()>
	//   54  124:return          
	}

	public void flush()
		throws IOException
	{
		_flushBuffer();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #125 <Method void _flushBuffer()>
		if(_outputStream != null && isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM))
	//*   2    4:aload_0         
	//*   3    5:getfield        #78  <Field OutputStream _outputStream>
	//*   4    8:ifnull          28
	//*   5   11:aload_0         
	//*   6   12:getstatic       #434 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.FLUSH_PASSED_TO_STREAM>
	//*   7   15:invokevirtual   #109 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*   8   18:ifeq            28
			_outputStream.flush();
	//    9   21:aload_0         
	//   10   22:getfield        #78  <Field OutputStream _outputStream>
	//   11   25:invokevirtual   #437 <Method void OutputStream.flush()>
	//   12   28:return          
	}

	public int getOutputBuffered()
	{
		return _outputTail;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field int _outputTail>
	//    2    4:ireturn         
	}

	public Object getOutputTarget()
	{
		return ((Object) (_outputStream));
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field OutputStream _outputStream>
	//    2    4:areturn         
	}

	public int writeBinary(Base64Variant base64variant, InputStream inputstream, int i)
		throws IOException, JsonGenerationException
	{
		byte abyte0[];
		_verifyValueWrite("write a binary value");
	//    0    0:aload_0         
	//    1    1:ldc2            #447 <String "write a binary value">
	//    2    4:invokevirtual   #449 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #116 <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #89  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #125 <Method void _flushBuffer()>
		abyte0 = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #87  <Field byte[] _outputBuffer>
	//   12   26:astore          6
		int j = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #116 <Field int _outputTail>
	//   15   32:istore          4
		_outputTail = j + 1;
	//   16   34:aload_0         
	//   17   35:iload           4
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #116 <Field int _outputTail>
		abyte0[j] = _quoteChar;
	//   21   42:aload           6
	//   22   44:iload           4
	//   23   46:aload_0         
	//   24   47:getfield        #76  <Field byte _quoteChar>
	//   25   50:bastore         
		abyte0 = _ioContext.allocBase64Buffer();
	//   26   51:aload_0         
	//   27   52:getfield        #320 <Field IOContext _ioContext>
	//   28   55:invokevirtual   #452 <Method byte[] IOContext.allocBase64Buffer()>
	//   29   58:astore          6
		if(i >= 0)
			break MISSING_BLOCK_LABEL_77;
	//   30   60:iload_3         
	//   31   61:ifge            77
		int k;
		k = _writeBinary(base64variant, inputstream, abyte0);
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:aload_2         
	//   35   67:aload           6
	//   36   69:invokevirtual   #454 <Method int _writeBinary(Base64Variant, InputStream, byte[])>
	//   37   72:istore          4
		break MISSING_BLOCK_LABEL_152;
	//   38   74:goto            152
		int l = _writeBinary(base64variant, inputstream, abyte0, i);
	//   39   77:aload_0         
	//   40   78:aload_1         
	//   41   79:aload_2         
	//   42   80:aload           6
	//   43   82:iload_3         
	//   44   83:invokevirtual   #456 <Method int _writeBinary(Base64Variant, InputStream, byte[], int)>
	//   45   86:istore          5
		k = i;
	//   46   88:iload_3         
	//   47   89:istore          4
		if(l <= 0)
			break MISSING_BLOCK_LABEL_152;
	//   48   91:iload           5
	//   49   93:ifle            152
		base64variant = ((Base64Variant) (new StringBuilder()));
	//   50   96:new             #218 <Class StringBuilder>
	//   51   99:dup             
	//   52  100:invokespecial   #220 <Method void StringBuilder()>
	//   53  103:astore_1        
		((StringBuilder) (base64variant)).append("Too few bytes available: missing ");
	//   54  104:aload_1         
	//   55  105:ldc2            #458 <String "Too few bytes available: missing ">
	//   56  108:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   57  111:pop             
		((StringBuilder) (base64variant)).append(l);
	//   58  112:aload_1         
	//   59  113:iload           5
	//   60  115:invokevirtual   #461 <Method StringBuilder StringBuilder.append(int)>
	//   61  118:pop             
		((StringBuilder) (base64variant)).append(" bytes (out of ");
	//   62  119:aload_1         
	//   63  120:ldc2            #463 <String " bytes (out of ">
	//   64  123:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   65  126:pop             
		((StringBuilder) (base64variant)).append(i);
	//   66  127:aload_1         
	//   67  128:iload_3         
	//   68  129:invokevirtual   #461 <Method StringBuilder StringBuilder.append(int)>
	//   69  132:pop             
		((StringBuilder) (base64variant)).append(")");
	//   70  133:aload_1         
	//   71  134:ldc2            #465 <String ")">
	//   72  137:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   73  140:pop             
		_reportError(((StringBuilder) (base64variant)).toString());
	//   74  141:aload_0         
	//   75  142:aload_1         
	//   76  143:invokevirtual   #236 <Method String StringBuilder.toString()>
	//   77  146:invokevirtual   #164 <Method void _reportError(String)>
		k = i;
	//   78  149:iload_3         
	//   79  150:istore          4
		_ioContext.releaseBase64Buffer(abyte0);
	//   80  152:aload_0         
	//   81  153:getfield        #320 <Field IOContext _ioContext>
	//   82  156:aload           6
	//   83  158:invokevirtual   #468 <Method void IOContext.releaseBase64Buffer(byte[])>
		if(_outputTail >= _outputEnd)
	//*  84  161:aload_0         
	//*  85  162:getfield        #116 <Field int _outputTail>
	//*  86  165:aload_0         
	//*  87  166:getfield        #89  <Field int _outputEnd>
	//*  88  169:icmplt          176
			_flushBuffer();
	//   89  172:aload_0         
	//   90  173:invokevirtual   #125 <Method void _flushBuffer()>
		base64variant = ((Base64Variant) (_outputBuffer));
	//   91  176:aload_0         
	//   92  177:getfield        #87  <Field byte[] _outputBuffer>
	//   93  180:astore_1        
		i = _outputTail;
	//   94  181:aload_0         
	//   95  182:getfield        #116 <Field int _outputTail>
	//   96  185:istore_3        
		_outputTail = i + 1;
	//   97  186:aload_0         
	//   98  187:iload_3         
	//   99  188:iconst_1        
	//  100  189:iadd            
	//  101  190:putfield        #116 <Field int _outputTail>
		base64variant[i] = _quoteChar;
	//  102  193:aload_1         
	//  103  194:iload_3         
	//  104  195:aload_0         
	//  105  196:getfield        #76  <Field byte _quoteChar>
	//  106  199:bastore         
		return k;
	//  107  200:iload           4
	//  108  202:ireturn         
_L2:
		_ioContext.releaseBase64Buffer(abyte0);
	//  109  203:aload_0         
	//  110  204:getfield        #320 <Field IOContext _ioContext>
	//  111  207:aload           6
	//  112  209:invokevirtual   #468 <Method void IOContext.releaseBase64Buffer(byte[])>
		throw base64variant;
	//  113  212:aload_1         
	//  114  213:athrow          
		base64variant;
	//  115  214:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//* 116  215:goto            203
	}

	public void writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
		throws IOException, JsonGenerationException
	{
		_verifyValueWrite("write a binary value");
	//    0    0:aload_0         
	//    1    1:ldc2            #447 <String "write a binary value">
	//    2    4:invokevirtual   #449 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #116 <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #89  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #125 <Method void _flushBuffer()>
		byte abyte1[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #87  <Field byte[] _outputBuffer>
	//   12   26:astore          6
		int k = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #116 <Field int _outputTail>
	//   15   32:istore          5
		_outputTail = k + 1;
	//   16   34:aload_0         
	//   17   35:iload           5
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #116 <Field int _outputTail>
		abyte1[k] = _quoteChar;
	//   21   42:aload           6
	//   22   44:iload           5
	//   23   46:aload_0         
	//   24   47:getfield        #76  <Field byte _quoteChar>
	//   25   50:bastore         
		_writeBinary(base64variant, abyte0, i, j + i);
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:aload_2         
	//   29   54:iload_3         
	//   30   55:iload           4
	//   31   57:iload_3         
	//   32   58:iadd            
	//   33   59:invokevirtual   #470 <Method void _writeBinary(Base64Variant, byte[], int, int)>
		if(_outputTail >= _outputEnd)
	//*  34   62:aload_0         
	//*  35   63:getfield        #116 <Field int _outputTail>
	//*  36   66:aload_0         
	//*  37   67:getfield        #89  <Field int _outputEnd>
	//*  38   70:icmplt          77
			_flushBuffer();
	//   39   73:aload_0         
	//   40   74:invokevirtual   #125 <Method void _flushBuffer()>
		base64variant = ((Base64Variant) (_outputBuffer));
	//   41   77:aload_0         
	//   42   78:getfield        #87  <Field byte[] _outputBuffer>
	//   43   81:astore_1        
		i = _outputTail;
	//   44   82:aload_0         
	//   45   83:getfield        #116 <Field int _outputTail>
	//   46   86:istore_3        
		_outputTail = i + 1;
	//   47   87:aload_0         
	//   48   88:iload_3         
	//   49   89:iconst_1        
	//   50   90:iadd            
	//   51   91:putfield        #116 <Field int _outputTail>
		base64variant[i] = _quoteChar;
	//   52   94:aload_1         
	//   53   95:iload_3         
	//   54   96:aload_0         
	//   55   97:getfield        #76  <Field byte _quoteChar>
	//   56  100:bastore         
	//   57  101:return          
	}

	public void writeBoolean(boolean flag)
		throws IOException
	{
		_verifyValueWrite("write a boolean value");
	//    0    0:aload_0         
	//    1    1:ldc2            #474 <String "write a boolean value">
	//    2    4:invokevirtual   #449 <Method void _verifyValueWrite(String)>
		if(_outputTail + 5 >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #116 <Field int _outputTail>
	//*   5   11:iconst_5        
	//*   6   12:iadd            
	//*   7   13:aload_0         
	//*   8   14:getfield        #89  <Field int _outputEnd>
	//*   9   17:icmplt          24
			_flushBuffer();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #125 <Method void _flushBuffer()>
		byte abyte0[];
		if(flag)
	//*  12   24:iload_1         
	//*  13   25:ifeq            35
			abyte0 = TRUE_BYTES;
	//   14   28:getstatic       #63  <Field byte[] TRUE_BYTES>
	//   15   31:astore_3        
		else
	//*  16   32:goto            39
			abyte0 = FALSE_BYTES;
	//   17   35:getstatic       #68  <Field byte[] FALSE_BYTES>
	//   18   38:astore_3        
		int i = abyte0.length;
	//   19   39:aload_3         
	//   20   40:arraylength     
	//   21   41:istore_2        
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (_outputBuffer)), _outputTail, i);
	//   22   42:aload_3         
	//   23   43:iconst_0        
	//   24   44:aload_0         
	//   25   45:getfield        #87  <Field byte[] _outputBuffer>
	//   26   48:aload_0         
	//   27   49:getfield        #116 <Field int _outputTail>
	//   28   52:iload_2         
	//   29   53:invokestatic    #137 <Method void System.arraycopy(Object, int, Object, int, int)>
		_outputTail = _outputTail + i;
	//   30   56:aload_0         
	//   31   57:aload_0         
	//   32   58:getfield        #116 <Field int _outputTail>
	//   33   61:iload_2         
	//   34   62:iadd            
	//   35   63:putfield        #116 <Field int _outputTail>
	//   36   66:return          
	}

	public final void writeEndArray()
		throws IOException
	{
		if(!_writeContext.inArray())
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field JsonWriteContext _writeContext>
	//*   2    4:invokevirtual   #475 <Method boolean JsonWriteContext.inArray()>
	//*   3    7:ifne            46
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4   10:new             #218 <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #220 <Method void StringBuilder()>
	//    7   17:astore_2        
			stringbuilder.append("Current context not Array but ");
	//    8   18:aload_2         
	//    9   19:ldc2            #477 <String "Current context not Array but ">
	//   10   22:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:pop             
			stringbuilder.append(_writeContext.typeDesc());
	//   12   26:aload_2         
	//   13   27:aload_0         
	//   14   28:getfield        #332 <Field JsonWriteContext _writeContext>
	//   15   31:invokevirtual   #480 <Method String JsonWriteContext.typeDesc()>
	//   16   34:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
			_reportError(stringbuilder.toString());
	//   18   38:aload_0         
	//   19   39:aload_2         
	//   20   40:invokevirtual   #236 <Method String StringBuilder.toString()>
	//   21   43:invokevirtual   #164 <Method void _reportError(String)>
		}
		if(_cfgPrettyPrinter != null)
	//*  22   46:aload_0         
	//*  23   47:getfield        #341 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  24   50:ifnull          73
		{
			_cfgPrettyPrinter.writeEndArray(((com.fasterxml.jackson.core.JsonGenerator) (this)), _writeContext.getEntryCount());
	//   25   53:aload_0         
	//   26   54:getfield        #341 <Field PrettyPrinter _cfgPrettyPrinter>
	//   27   57:aload_0         
	//   28   58:aload_0         
	//   29   59:getfield        #332 <Field JsonWriteContext _writeContext>
	//   30   62:invokevirtual   #483 <Method int JsonWriteContext.getEntryCount()>
	//   31   65:invokeinterface #486 <Method void PrettyPrinter.writeEndArray(com.fasterxml.jackson.core.JsonGenerator, int)>
		} else
	//*  32   70:goto            110
		{
			if(_outputTail >= _outputEnd)
	//*  33   73:aload_0         
	//*  34   74:getfield        #116 <Field int _outputTail>
	//*  35   77:aload_0         
	//*  36   78:getfield        #89  <Field int _outputEnd>
	//*  37   81:icmplt          88
				_flushBuffer();
	//   38   84:aload_0         
	//   39   85:invokevirtual   #125 <Method void _flushBuffer()>
			byte abyte0[] = _outputBuffer;
	//   40   88:aload_0         
	//   41   89:getfield        #87  <Field byte[] _outputBuffer>
	//   42   92:astore_2        
			int i = _outputTail;
	//   43   93:aload_0         
	//   44   94:getfield        #116 <Field int _outputTail>
	//   45   97:istore_1        
			_outputTail = i + 1;
	//   46   98:aload_0         
	//   47   99:iload_1         
	//   48  100:iconst_1        
	//   49  101:iadd            
	//   50  102:putfield        #116 <Field int _outputTail>
			abyte0[i] = 93;
	//   51  105:aload_2         
	//   52  106:iload_1         
	//   53  107:bipush          93
	//   54  109:bastore         
		}
		_writeContext = _writeContext.clearAndGetParent();
	//   55  110:aload_0         
	//   56  111:aload_0         
	//   57  112:getfield        #332 <Field JsonWriteContext _writeContext>
	//   58  115:invokevirtual   #490 <Method JsonWriteContext JsonWriteContext.clearAndGetParent()>
	//   59  118:putfield        #332 <Field JsonWriteContext _writeContext>
	//   60  121:return          
	}

	public final void writeEndObject()
		throws IOException
	{
		if(!_writeContext.inObject())
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field JsonWriteContext _writeContext>
	//*   2    4:invokevirtual   #491 <Method boolean JsonWriteContext.inObject()>
	//*   3    7:ifne            46
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4   10:new             #218 <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #220 <Method void StringBuilder()>
	//    7   17:astore_2        
			stringbuilder.append("Current context not Object but ");
	//    8   18:aload_2         
	//    9   19:ldc2            #493 <String "Current context not Object but ">
	//   10   22:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:pop             
			stringbuilder.append(_writeContext.typeDesc());
	//   12   26:aload_2         
	//   13   27:aload_0         
	//   14   28:getfield        #332 <Field JsonWriteContext _writeContext>
	//   15   31:invokevirtual   #480 <Method String JsonWriteContext.typeDesc()>
	//   16   34:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
			_reportError(stringbuilder.toString());
	//   18   38:aload_0         
	//   19   39:aload_2         
	//   20   40:invokevirtual   #236 <Method String StringBuilder.toString()>
	//   21   43:invokevirtual   #164 <Method void _reportError(String)>
		}
		if(_cfgPrettyPrinter != null)
	//*  22   46:aload_0         
	//*  23   47:getfield        #341 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  24   50:ifnull          73
		{
			_cfgPrettyPrinter.writeEndObject(((com.fasterxml.jackson.core.JsonGenerator) (this)), _writeContext.getEntryCount());
	//   25   53:aload_0         
	//   26   54:getfield        #341 <Field PrettyPrinter _cfgPrettyPrinter>
	//   27   57:aload_0         
	//   28   58:aload_0         
	//   29   59:getfield        #332 <Field JsonWriteContext _writeContext>
	//   30   62:invokevirtual   #483 <Method int JsonWriteContext.getEntryCount()>
	//   31   65:invokeinterface #495 <Method void PrettyPrinter.writeEndObject(com.fasterxml.jackson.core.JsonGenerator, int)>
		} else
	//*  32   70:goto            110
		{
			if(_outputTail >= _outputEnd)
	//*  33   73:aload_0         
	//*  34   74:getfield        #116 <Field int _outputTail>
	//*  35   77:aload_0         
	//*  36   78:getfield        #89  <Field int _outputEnd>
	//*  37   81:icmplt          88
				_flushBuffer();
	//   38   84:aload_0         
	//   39   85:invokevirtual   #125 <Method void _flushBuffer()>
			byte abyte0[] = _outputBuffer;
	//   40   88:aload_0         
	//   41   89:getfield        #87  <Field byte[] _outputBuffer>
	//   42   92:astore_2        
			int i = _outputTail;
	//   43   93:aload_0         
	//   44   94:getfield        #116 <Field int _outputTail>
	//   45   97:istore_1        
			_outputTail = i + 1;
	//   46   98:aload_0         
	//   47   99:iload_1         
	//   48  100:iconst_1        
	//   49  101:iadd            
	//   50  102:putfield        #116 <Field int _outputTail>
			abyte0[i] = 125;
	//   51  105:aload_2         
	//   52  106:iload_1         
	//   53  107:bipush          125
	//   54  109:bastore         
		}
		_writeContext = _writeContext.clearAndGetParent();
	//   55  110:aload_0         
	//   56  111:aload_0         
	//   57  112:getfield        #332 <Field JsonWriteContext _writeContext>
	//   58  115:invokevirtual   #490 <Method JsonWriteContext JsonWriteContext.clearAndGetParent()>
	//   59  118:putfield        #332 <Field JsonWriteContext _writeContext>
	//   60  121:return          
	}

	public void writeFieldName(SerializableString serializablestring)
		throws IOException
	{
		if(_cfgPrettyPrinter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #341 <Field PrettyPrinter _cfgPrettyPrinter>
	//*   2    4:ifnull          13
		{
			_writePPFieldName(serializablestring);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #497 <Method void _writePPFieldName(SerializableString)>
			return;
	//    6   12:return          
		}
		int i = _writeContext.writeFieldName(serializablestring.getValue());
	//    7   13:aload_0         
	//    8   14:getfield        #332 <Field JsonWriteContext _writeContext>
	//    9   17:aload_1         
	//   10   18:invokeinterface #374 <Method String SerializableString.getValue()>
	//   11   23:invokevirtual   #378 <Method int JsonWriteContext.writeFieldName(String)>
	//   12   26:istore_2        
		if(i == 4)
	//*  13   27:iload_2         
	//*  14   28:iconst_4        
	//*  15   29:icmpne          39
			_reportError("Can not write a field name, expecting a value");
	//   16   32:aload_0         
	//   17   33:ldc2            #380 <String "Can not write a field name, expecting a value">
	//   18   36:invokevirtual   #164 <Method void _reportError(String)>
		if(i == 1)
	//*  19   39:iload_2         
	//*  20   40:iconst_1        
	//*  21   41:icmpne          81
		{
			if(_outputTail >= _outputEnd)
	//*  22   44:aload_0         
	//*  23   45:getfield        #116 <Field int _outputTail>
	//*  24   48:aload_0         
	//*  25   49:getfield        #89  <Field int _outputEnd>
	//*  26   52:icmplt          59
				_flushBuffer();
	//   27   55:aload_0         
	//   28   56:invokevirtual   #125 <Method void _flushBuffer()>
			byte abyte0[] = _outputBuffer;
	//   29   59:aload_0         
	//   30   60:getfield        #87  <Field byte[] _outputBuffer>
	//   31   63:astore_3        
			i = _outputTail;
	//   32   64:aload_0         
	//   33   65:getfield        #116 <Field int _outputTail>
	//   34   68:istore_2        
			_outputTail = i + 1;
	//   35   69:aload_0         
	//   36   70:iload_2         
	//   37   71:iconst_1        
	//   38   72:iadd            
	//   39   73:putfield        #116 <Field int _outputTail>
			abyte0[i] = 44;
	//   40   76:aload_3         
	//   41   77:iload_2         
	//   42   78:bipush          44
	//   43   80:bastore         
		}
		if(_cfgUnqNames)
	//*  44   81:aload_0         
	//*  45   82:getfield        #392 <Field boolean _cfgUnqNames>
	//*  46   85:ifeq            94
		{
			_writeUnq(serializablestring);
	//   47   88:aload_0         
	//   48   89:aload_1         
	//   49   90:invokespecial   #499 <Method void _writeUnq(SerializableString)>
			return;
	//   50   93:return          
		}
		if(_outputTail >= _outputEnd)
	//*  51   94:aload_0         
	//*  52   95:getfield        #116 <Field int _outputTail>
	//*  53   98:aload_0         
	//*  54   99:getfield        #89  <Field int _outputEnd>
	//*  55  102:icmplt          109
			_flushBuffer();
	//   56  105:aload_0         
	//   57  106:invokevirtual   #125 <Method void _flushBuffer()>
		byte abyte1[] = _outputBuffer;
	//   58  109:aload_0         
	//   59  110:getfield        #87  <Field byte[] _outputBuffer>
	//   60  113:astore_3        
		i = _outputTail;
	//   61  114:aload_0         
	//   62  115:getfield        #116 <Field int _outputTail>
	//   63  118:istore_2        
		_outputTail = i + 1;
	//   64  119:aload_0         
	//   65  120:iload_2         
	//   66  121:iconst_1        
	//   67  122:iadd            
	//   68  123:putfield        #116 <Field int _outputTail>
		abyte1[i] = _quoteChar;
	//   69  126:aload_3         
	//   70  127:iload_2         
	//   71  128:aload_0         
	//   72  129:getfield        #76  <Field byte _quoteChar>
	//   73  132:bastore         
		i = serializablestring.appendQuotedUTF8(_outputBuffer, _outputTail);
	//   74  133:aload_1         
	//   75  134:aload_0         
	//   76  135:getfield        #87  <Field byte[] _outputBuffer>
	//   77  138:aload_0         
	//   78  139:getfield        #116 <Field int _outputTail>
	//   79  142:invokeinterface #307 <Method int SerializableString.appendQuotedUTF8(byte[], int)>
	//   80  147:istore_2        
		if(i < 0)
	//*  81  148:iload_2         
	//*  82  149:ifge            165
			_writeBytes(serializablestring.asQuotedUTF8());
	//   83  152:aload_0         
	//   84  153:aload_1         
	//   85  154:invokeinterface #310 <Method byte[] SerializableString.asQuotedUTF8()>
	//   86  159:invokespecial   #312 <Method void _writeBytes(byte[])>
		else
	//*  87  162:goto            175
			_outputTail = _outputTail + i;
	//   88  165:aload_0         
	//   89  166:aload_0         
	//   90  167:getfield        #116 <Field int _outputTail>
	//   91  170:iload_2         
	//   92  171:iadd            
	//   93  172:putfield        #116 <Field int _outputTail>
		if(_outputTail >= _outputEnd)
	//*  94  175:aload_0         
	//*  95  176:getfield        #116 <Field int _outputTail>
	//*  96  179:aload_0         
	//*  97  180:getfield        #89  <Field int _outputEnd>
	//*  98  183:icmplt          190
			_flushBuffer();
	//   99  186:aload_0         
	//  100  187:invokevirtual   #125 <Method void _flushBuffer()>
		serializablestring = ((SerializableString) (_outputBuffer));
	//  101  190:aload_0         
	//  102  191:getfield        #87  <Field byte[] _outputBuffer>
	//  103  194:astore_1        
		i = _outputTail;
	//  104  195:aload_0         
	//  105  196:getfield        #116 <Field int _outputTail>
	//  106  199:istore_2        
		_outputTail = i + 1;
	//  107  200:aload_0         
	//  108  201:iload_2         
	//  109  202:iconst_1        
	//  110  203:iadd            
	//  111  204:putfield        #116 <Field int _outputTail>
		serializablestring[i] = _quoteChar;
	//  112  207:aload_1         
	//  113  208:iload_2         
	//  114  209:aload_0         
	//  115  210:getfield        #76  <Field byte _quoteChar>
	//  116  213:bastore         
	//  117  214:return          
	}

	public void writeFieldName(String s)
		throws IOException
	{
		if(_cfgPrettyPrinter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #341 <Field PrettyPrinter _cfgPrettyPrinter>
	//*   2    4:ifnull          13
		{
			_writePPFieldName(s);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #501 <Method void _writePPFieldName(String)>
			return;
	//    6   12:return          
		}
		int i = _writeContext.writeFieldName(s);
	//    7   13:aload_0         
	//    8   14:getfield        #332 <Field JsonWriteContext _writeContext>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #378 <Method int JsonWriteContext.writeFieldName(String)>
	//   11   21:istore_2        
		if(i == 4)
	//*  12   22:iload_2         
	//*  13   23:iconst_4        
	//*  14   24:icmpne          34
			_reportError("Can not write a field name, expecting a value");
	//   15   27:aload_0         
	//   16   28:ldc2            #380 <String "Can not write a field name, expecting a value">
	//   17   31:invokevirtual   #164 <Method void _reportError(String)>
		if(i == 1)
	//*  18   34:iload_2         
	//*  19   35:iconst_1        
	//*  20   36:icmpne          78
		{
			if(_outputTail >= _outputEnd)
	//*  21   39:aload_0         
	//*  22   40:getfield        #116 <Field int _outputTail>
	//*  23   43:aload_0         
	//*  24   44:getfield        #89  <Field int _outputEnd>
	//*  25   47:icmplt          54
				_flushBuffer();
	//   26   50:aload_0         
	//   27   51:invokevirtual   #125 <Method void _flushBuffer()>
			byte abyte0[] = _outputBuffer;
	//   28   54:aload_0         
	//   29   55:getfield        #87  <Field byte[] _outputBuffer>
	//   30   58:astore          4
			i = _outputTail;
	//   31   60:aload_0         
	//   32   61:getfield        #116 <Field int _outputTail>
	//   33   64:istore_2        
			_outputTail = i + 1;
	//   34   65:aload_0         
	//   35   66:iload_2         
	//   36   67:iconst_1        
	//   37   68:iadd            
	//   38   69:putfield        #116 <Field int _outputTail>
			abyte0[i] = 44;
	//   39   72:aload           4
	//   40   74:iload_2         
	//   41   75:bipush          44
	//   42   77:bastore         
		}
		if(_cfgUnqNames)
	//*  43   78:aload_0         
	//*  44   79:getfield        #392 <Field boolean _cfgUnqNames>
	//*  45   82:ifeq            92
		{
			_writeStringSegments(s, false);
	//   46   85:aload_0         
	//   47   86:aload_1         
	//   48   87:iconst_0        
	//   49   88:invokespecial   #394 <Method void _writeStringSegments(String, boolean)>
			return;
	//   50   91:return          
		}
		i = s.length();
	//   51   92:aload_1         
	//   52   93:invokevirtual   #292 <Method int String.length()>
	//   53   96:istore_2        
		if(i > _charBufferLength)
	//*  54   97:iload_2         
	//*  55   98:aload_0         
	//*  56   99:getfield        #99  <Field int _charBufferLength>
	//*  57  102:icmple          112
		{
			_writeStringSegments(s, true);
	//   58  105:aload_0         
	//   59  106:aload_1         
	//   60  107:iconst_1        
	//   61  108:invokespecial   #394 <Method void _writeStringSegments(String, boolean)>
			return;
	//   62  111:return          
		}
		if(_outputTail >= _outputEnd)
	//*  63  112:aload_0         
	//*  64  113:getfield        #116 <Field int _outputTail>
	//*  65  116:aload_0         
	//*  66  117:getfield        #89  <Field int _outputEnd>
	//*  67  120:icmplt          127
			_flushBuffer();
	//   68  123:aload_0         
	//   69  124:invokevirtual   #125 <Method void _flushBuffer()>
		byte abyte1[] = _outputBuffer;
	//   70  127:aload_0         
	//   71  128:getfield        #87  <Field byte[] _outputBuffer>
	//   72  131:astore          4
		int j = _outputTail;
	//   73  133:aload_0         
	//   74  134:getfield        #116 <Field int _outputTail>
	//   75  137:istore_3        
		_outputTail = j + 1;
	//   76  138:aload_0         
	//   77  139:iload_3         
	//   78  140:iconst_1        
	//   79  141:iadd            
	//   80  142:putfield        #116 <Field int _outputTail>
		abyte1[j] = _quoteChar;
	//   81  145:aload           4
	//   82  147:iload_3         
	//   83  148:aload_0         
	//   84  149:getfield        #76  <Field byte _quoteChar>
	//   85  152:bastore         
		if(i <= _outputMaxContiguous)
	//*  86  153:iload_2         
	//*  87  154:aload_0         
	//*  88  155:getfield        #91  <Field int _outputMaxContiguous>
	//*  89  158:icmpgt          188
		{
			if(_outputTail + i > _outputEnd)
	//*  90  161:aload_0         
	//*  91  162:getfield        #116 <Field int _outputTail>
	//*  92  165:iload_2         
	//*  93  166:iadd            
	//*  94  167:aload_0         
	//*  95  168:getfield        #89  <Field int _outputEnd>
	//*  96  171:icmple          178
				_flushBuffer();
	//   97  174:aload_0         
	//   98  175:invokevirtual   #125 <Method void _flushBuffer()>
			_writeStringSegment(s, 0, i);
	//   99  178:aload_0         
	//  100  179:aload_1         
	//  101  180:iconst_0        
	//  102  181:iload_2         
	//  103  182:invokespecial   #287 <Method void _writeStringSegment(String, int, int)>
		} else
	//* 104  185:goto            195
		{
			_writeStringSegments(s, 0, i);
	//  105  188:aload_0         
	//  106  189:aload_1         
	//  107  190:iconst_0        
	//  108  191:iload_2         
	//  109  192:invokespecial   #503 <Method void _writeStringSegments(String, int, int)>
		}
		if(_outputTail >= _outputEnd)
	//* 110  195:aload_0         
	//* 111  196:getfield        #116 <Field int _outputTail>
	//* 112  199:aload_0         
	//* 113  200:getfield        #89  <Field int _outputEnd>
	//* 114  203:icmplt          210
			_flushBuffer();
	//  115  206:aload_0         
	//  116  207:invokevirtual   #125 <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//  117  210:aload_0         
	//  118  211:getfield        #87  <Field byte[] _outputBuffer>
	//  119  214:astore_1        
		i = _outputTail;
	//  120  215:aload_0         
	//  121  216:getfield        #116 <Field int _outputTail>
	//  122  219:istore_2        
		_outputTail = i + 1;
	//  123  220:aload_0         
	//  124  221:iload_2         
	//  125  222:iconst_1        
	//  126  223:iadd            
	//  127  224:putfield        #116 <Field int _outputTail>
		s[i] = _quoteChar;
	//  128  227:aload_1         
	//  129  228:iload_2         
	//  130  229:aload_0         
	//  131  230:getfield        #76  <Field byte _quoteChar>
	//  132  233:bastore         
	//  133  234:return          
	}

	public void writeNull()
		throws IOException
	{
		_verifyValueWrite("write a null");
	//    0    0:aload_0         
	//    1    1:ldc2            #506 <String "write a null">
	//    2    4:invokevirtual   #449 <Method void _verifyValueWrite(String)>
		_writeNull();
	//    3    7:aload_0         
	//    4    8:invokespecial   #508 <Method void _writeNull()>
	//    5   11:return          
	}

	public void writeNumber(double d)
		throws IOException
	{
		if(!_cfgNumbersAsStrings && (!Double.isNaN(d) && !Double.isInfinite(d) || !com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(_features)))
	//*   0    0:aload_0         
	//*   1    1:getfield        #513 <Field boolean _cfgNumbersAsStrings>
	//*   2    4:ifne            53
	//*   3    7:dload_1         
	//*   4    8:invokestatic    #519 <Method boolean Double.isNaN(double)>
	//*   5   11:ifne            21
	//*   6   14:dload_1         
	//*   7   15:invokestatic    #522 <Method boolean Double.isInfinite(double)>
	//*   8   18:ifeq            37
	//*   9   21:getstatic       #525 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.QUOTE_NON_NUMERIC_NUMBERS>
	//*  10   24:aload_0         
	//*  11   25:getfield        #528 <Field int _features>
	//*  12   28:invokevirtual   #532 <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  13   31:ifeq            37
	//*  14   34:goto            53
		{
			_verifyValueWrite("write a number");
	//   15   37:aload_0         
	//   16   38:ldc2            #534 <String "write a number">
	//   17   41:invokevirtual   #449 <Method void _verifyValueWrite(String)>
			writeRaw(String.valueOf(d));
	//   18   44:aload_0         
	//   19   45:dload_1         
	//   20   46:invokestatic    #537 <Method String String.valueOf(double)>
	//   21   49:invokevirtual   #263 <Method void writeRaw(String)>
			return;
	//   22   52:return          
		} else
		{
			writeString(String.valueOf(d));
	//   23   53:aload_0         
	//   24   54:dload_1         
	//   25   55:invokestatic    #537 <Method String String.valueOf(double)>
	//   26   58:invokevirtual   #540 <Method void writeString(String)>
			return;
	//   27   61:return          
		}
	}

	public void writeNumber(float f)
		throws IOException
	{
		if(!_cfgNumbersAsStrings && (!Float.isNaN(f) && !Float.isInfinite(f) || !com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(_features)))
	//*   0    0:aload_0         
	//*   1    1:getfield        #513 <Field boolean _cfgNumbersAsStrings>
	//*   2    4:ifne            53
	//*   3    7:fload_1         
	//*   4    8:invokestatic    #546 <Method boolean Float.isNaN(float)>
	//*   5   11:ifne            21
	//*   6   14:fload_1         
	//*   7   15:invokestatic    #548 <Method boolean Float.isInfinite(float)>
	//*   8   18:ifeq            37
	//*   9   21:getstatic       #525 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.QUOTE_NON_NUMERIC_NUMBERS>
	//*  10   24:aload_0         
	//*  11   25:getfield        #528 <Field int _features>
	//*  12   28:invokevirtual   #532 <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  13   31:ifeq            37
	//*  14   34:goto            53
		{
			_verifyValueWrite("write a number");
	//   15   37:aload_0         
	//   16   38:ldc2            #534 <String "write a number">
	//   17   41:invokevirtual   #449 <Method void _verifyValueWrite(String)>
			writeRaw(String.valueOf(f));
	//   18   44:aload_0         
	//   19   45:fload_1         
	//   20   46:invokestatic    #551 <Method String String.valueOf(float)>
	//   21   49:invokevirtual   #263 <Method void writeRaw(String)>
			return;
	//   22   52:return          
		} else
		{
			writeString(String.valueOf(f));
	//   23   53:aload_0         
	//   24   54:fload_1         
	//   25   55:invokestatic    #551 <Method String String.valueOf(float)>
	//   26   58:invokevirtual   #540 <Method void writeString(String)>
			return;
	//   27   61:return          
		}
	}

	public void writeNumber(int i)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #534 <String "write a number">
	//    2    4:invokevirtual   #449 <Method void _verifyValueWrite(String)>
		if(_outputTail + 11 >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #116 <Field int _outputTail>
	//*   5   11:bipush          11
	//*   6   13:iadd            
	//*   7   14:aload_0         
	//*   8   15:getfield        #89  <Field int _outputEnd>
	//*   9   18:icmplt          25
			_flushBuffer();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #125 <Method void _flushBuffer()>
		if(_cfgNumbersAsStrings)
	//*  12   25:aload_0         
	//*  13   26:getfield        #513 <Field boolean _cfgNumbersAsStrings>
	//*  14   29:ifeq            38
		{
			_writeQuotedInt(i);
	//   15   32:aload_0         
	//   16   33:iload_1         
	//   17   34:invokespecial   #553 <Method void _writeQuotedInt(int)>
			return;
	//   18   37:return          
		} else
		{
			_outputTail = NumberOutput.outputInt(i, _outputBuffer, _outputTail);
	//   19   38:aload_0         
	//   20   39:iload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #87  <Field byte[] _outputBuffer>
	//   23   44:aload_0         
	//   24   45:getfield        #116 <Field int _outputTail>
	//   25   48:invokestatic    #253 <Method int NumberOutput.outputInt(int, byte[], int)>
	//   26   51:putfield        #116 <Field int _outputTail>
			return;
	//   27   54:return          
		}
	}

	public void writeNumber(long l)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #534 <String "write a number">
	//    2    4:invokevirtual   #449 <Method void _verifyValueWrite(String)>
		if(_cfgNumbersAsStrings)
	//*   3    7:aload_0         
	//*   4    8:getfield        #513 <Field boolean _cfgNumbersAsStrings>
	//*   5   11:ifeq            20
		{
			_writeQuotedLong(l);
	//    6   14:aload_0         
	//    7   15:lload_1         
	//    8   16:invokespecial   #555 <Method void _writeQuotedLong(long)>
			return;
	//    9   19:return          
		}
		if(_outputTail + 21 >= _outputEnd)
	//*  10   20:aload_0         
	//*  11   21:getfield        #116 <Field int _outputTail>
	//*  12   24:bipush          21
	//*  13   26:iadd            
	//*  14   27:aload_0         
	//*  15   28:getfield        #89  <Field int _outputEnd>
	//*  16   31:icmplt          38
			_flushBuffer();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #125 <Method void _flushBuffer()>
		_outputTail = NumberOutput.outputLong(l, _outputBuffer, _outputTail);
	//   19   38:aload_0         
	//   20   39:lload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #87  <Field byte[] _outputBuffer>
	//   23   44:aload_0         
	//   24   45:getfield        #116 <Field int _outputTail>
	//   25   48:invokestatic    #259 <Method int NumberOutput.outputLong(long, byte[], int)>
	//   26   51:putfield        #116 <Field int _outputTail>
	//   27   54:return          
	}

	public void writeNumber(String s)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #534 <String "write a number">
	//    2    4:invokevirtual   #449 <Method void _verifyValueWrite(String)>
		if(_cfgNumbersAsStrings)
	//*   3    7:aload_0         
	//*   4    8:getfield        #513 <Field boolean _cfgNumbersAsStrings>
	//*   5   11:ifeq            20
		{
			_writeQuotedRaw(s);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokespecial   #557 <Method void _writeQuotedRaw(String)>
			return;
	//    9   19:return          
		} else
		{
			writeRaw(s);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #263 <Method void writeRaw(String)>
			return;
	//   13   25:return          
		}
	}

	public void writeNumber(BigDecimal bigdecimal)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #534 <String "write a number">
	//    2    4:invokevirtual   #449 <Method void _verifyValueWrite(String)>
		if(bigdecimal == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       16
		{
			_writeNull();
	//    5   11:aload_0         
	//    6   12:invokespecial   #508 <Method void _writeNull()>
			return;
	//    7   15:return          
		}
		if(_cfgNumbersAsStrings)
	//*   8   16:aload_0         
	//*   9   17:getfield        #513 <Field boolean _cfgNumbersAsStrings>
	//*  10   20:ifeq            33
		{
			_writeQuotedRaw(_asString(bigdecimal));
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #562 <Method String _asString(BigDecimal)>
	//   15   29:invokespecial   #557 <Method void _writeQuotedRaw(String)>
			return;
	//   16   32:return          
		} else
		{
			writeRaw(_asString(bigdecimal));
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #562 <Method String _asString(BigDecimal)>
	//   21   39:invokevirtual   #263 <Method void writeRaw(String)>
			return;
	//   22   42:return          
		}
	}

	public void writeNumber(BigInteger biginteger)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #534 <String "write a number">
	//    2    4:invokevirtual   #449 <Method void _verifyValueWrite(String)>
		if(biginteger == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       16
		{
			_writeNull();
	//    5   11:aload_0         
	//    6   12:invokespecial   #508 <Method void _writeNull()>
			return;
	//    7   15:return          
		}
		if(_cfgNumbersAsStrings)
	//*   8   16:aload_0         
	//*   9   17:getfield        #513 <Field boolean _cfgNumbersAsStrings>
	//*  10   20:ifeq            32
		{
			_writeQuotedRaw(biginteger.toString());
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #566 <Method String BigInteger.toString()>
	//   14   28:invokespecial   #557 <Method void _writeQuotedRaw(String)>
			return;
	//   15   31:return          
		} else
		{
			writeRaw(biginteger.toString());
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #566 <Method String BigInteger.toString()>
	//   19   37:invokevirtual   #263 <Method void writeRaw(String)>
			return;
	//   20   40:return          
		}
	}

	public void writeNumber(short word0)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #534 <String "write a number">
	//    2    4:invokevirtual   #449 <Method void _verifyValueWrite(String)>
		if(_outputTail + 6 >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #116 <Field int _outputTail>
	//*   5   11:bipush          6
	//*   6   13:iadd            
	//*   7   14:aload_0         
	//*   8   15:getfield        #89  <Field int _outputEnd>
	//*   9   18:icmplt          25
			_flushBuffer();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #125 <Method void _flushBuffer()>
		if(_cfgNumbersAsStrings)
	//*  12   25:aload_0         
	//*  13   26:getfield        #513 <Field boolean _cfgNumbersAsStrings>
	//*  14   29:ifeq            38
		{
			_writeQuotedShort(word0);
	//   15   32:aload_0         
	//   16   33:iload_1         
	//   17   34:invokespecial   #568 <Method void _writeQuotedShort(short)>
			return;
	//   18   37:return          
		} else
		{
			_outputTail = NumberOutput.outputInt(((int) (word0)), _outputBuffer, _outputTail);
	//   19   38:aload_0         
	//   20   39:iload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #87  <Field byte[] _outputBuffer>
	//   23   44:aload_0         
	//   24   45:getfield        #116 <Field int _outputTail>
	//   25   48:invokestatic    #253 <Method int NumberOutput.outputInt(int, byte[], int)>
	//   26   51:putfield        #116 <Field int _outputTail>
			return;
	//   27   54:return          
		}
	}

	public void writeRaw(char c)
		throws IOException
	{
		if(_outputTail + 3 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field int _outputTail>
	//*   2    4:iconst_3        
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #89  <Field int _outputEnd>
	//*   6   10:icmplt          17
			_flushBuffer();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #125 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//    9   17:aload_0         
	//   10   18:getfield        #87  <Field byte[] _outputBuffer>
	//   11   21:astore_3        
		if(c <= '\177')
	//*  12   22:iload_1         
	//*  13   23:bipush          127
	//*  14   25:icmpgt          46
		{
			int i = _outputTail;
	//   15   28:aload_0         
	//   16   29:getfield        #116 <Field int _outputTail>
	//   17   32:istore_2        
			_outputTail = i + 1;
	//   18   33:aload_0         
	//   19   34:iload_2         
	//   20   35:iconst_1        
	//   21   36:iadd            
	//   22   37:putfield        #116 <Field int _outputTail>
			abyte0[i] = (byte)c;
	//   23   40:aload_3         
	//   24   41:iload_2         
	//   25   42:iload_1         
	//   26   43:int2byte        
	//   27   44:bastore         
			return;
	//   28   45:return          
		}
		if(c < '\u0800')
	//*  29   46:iload_1         
	//*  30   47:sipush          2048
	//*  31   50:icmpge          102
		{
			int j = _outputTail;
	//   32   53:aload_0         
	//   33   54:getfield        #116 <Field int _outputTail>
	//   34   57:istore_2        
			_outputTail = j + 1;
	//   35   58:aload_0         
	//   36   59:iload_2         
	//   37   60:iconst_1        
	//   38   61:iadd            
	//   39   62:putfield        #116 <Field int _outputTail>
			abyte0[j] = (byte)(0xc0 | c >> 6);
	//   40   65:aload_3         
	//   41   66:iload_2         
	//   42   67:sipush          192
	//   43   70:iload_1         
	//   44   71:bipush          6
	//   45   73:ishr            
	//   46   74:ior             
	//   47   75:int2byte        
	//   48   76:bastore         
			j = _outputTail;
	//   49   77:aload_0         
	//   50   78:getfield        #116 <Field int _outputTail>
	//   51   81:istore_2        
			_outputTail = j + 1;
	//   52   82:aload_0         
	//   53   83:iload_2         
	//   54   84:iconst_1        
	//   55   85:iadd            
	//   56   86:putfield        #116 <Field int _outputTail>
			abyte0[j] = (byte)(c & 0x3f | 0x80);
	//   57   89:aload_3         
	//   58   90:iload_2         
	//   59   91:iload_1         
	//   60   92:bipush          63
	//   61   94:iand            
	//   62   95:sipush          128
	//   63   98:ior             
	//   64   99:int2byte        
	//   65  100:bastore         
			return;
	//   66  101:return          
		} else
		{
			_outputRawMultiByteChar(((int) (c)), ((char []) (null)), 0, 0);
	//   67  102:aload_0         
	//   68  103:iload_1         
	//   69  104:aconst_null     
	//   70  105:iconst_0        
	//   71  106:iconst_0        
	//   72  107:invokespecial   #268 <Method int _outputRawMultiByteChar(int, char[], int, int)>
	//   73  110:pop             
			return;
	//   74  111:return          
		}
	}

	public void writeRaw(SerializableString serializablestring)
		throws IOException
	{
		serializablestring = ((SerializableString) (serializablestring.asUnquotedUTF8()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #190 <Method byte[] SerializableString.asUnquotedUTF8()>
	//    2    6:astore_1        
		if(serializablestring.length > 0)
	//*   3    7:aload_1         
	//*   4    8:arraylength     
	//*   5    9:ifle            17
			_writeBytes(((byte []) (serializablestring)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #312 <Method void _writeBytes(byte[])>
	//    9   17:return          
	}

	public void writeRaw(String s)
		throws IOException
	{
		int i = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #292 <Method int String.length()>
	//    2    4:istore_2        
		char ac[] = _charBuffer;
	//    3    5:aload_0         
	//    4    6:getfield        #97  <Field char[] _charBuffer>
	//    5    9:astore_3        
		if(i <= ac.length)
	//*   6   10:iload_2         
	//*   7   11:aload_3         
	//*   8   12:arraylength     
	//*   9   13:icmpgt          32
		{
			s.getChars(0, i, ac, 0);
	//   10   16:aload_1         
	//   11   17:iconst_0        
	//   12   18:iload_2         
	//   13   19:aload_3         
	//   14   20:iconst_0        
	//   15   21:invokevirtual   #398 <Method void String.getChars(int, int, char[], int)>
			writeRaw(ac, 0, i);
	//   16   24:aload_0         
	//   17   25:aload_3         
	//   18   26:iconst_0        
	//   19   27:iload_2         
	//   20   28:invokevirtual   #571 <Method void writeRaw(char[], int, int)>
			return;
	//   21   31:return          
		} else
		{
			writeRaw(s, 0, i);
	//   22   32:aload_0         
	//   23   33:aload_1         
	//   24   34:iconst_0        
	//   25   35:iload_2         
	//   26   36:invokevirtual   #573 <Method void writeRaw(String, int, int)>
			return;
	//   27   39:return          
		}
	}

	public void writeRaw(String s, int i, int j)
		throws IOException
	{
		char ac[] = _charBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field char[] _charBuffer>
	//    2    4:astore          8
		int k = ac.length;
	//    3    6:aload           8
	//    4    8:arraylength     
	//    5    9:istore          4
		if(j <= k)
	//*   6   11:iload_3         
	//*   7   12:iload           4
	//*   8   14:icmpgt          37
		{
			s.getChars(i, i + j, ac, 0);
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:iload_2         
	//   12   20:iload_3         
	//   13   21:iadd            
	//   14   22:aload           8
	//   15   24:iconst_0        
	//   16   25:invokevirtual   #398 <Method void String.getChars(int, int, char[], int)>
			writeRaw(ac, 0, j);
	//   17   28:aload_0         
	//   18   29:aload           8
	//   19   31:iconst_0        
	//   20   32:iload_3         
	//   21   33:invokevirtual   #571 <Method void writeRaw(char[], int, int)>
			return;
	//   22   36:return          
		}
		int j1 = Math.min(k, (_outputEnd >> 2) + (_outputEnd >> 4));
	//   23   37:iload           4
	//   24   39:aload_0         
	//   25   40:getfield        #89  <Field int _outputEnd>
	//   26   43:iconst_2        
	//   27   44:ishr            
	//   28   45:aload_0         
	//   29   46:getfield        #89  <Field int _outputEnd>
	//   30   49:iconst_4        
	//   31   50:ishr            
	//   32   51:iadd            
	//   33   52:invokestatic    #175 <Method int Math.min(int, int)>
	//   34   55:istore          6
		int l;
		for(; j > 0; j -= l)
	//*  35   57:iload_3         
	//*  36   58:ifle            169
		{
			int i1 = Math.min(j1, j);
	//   37   61:iload           6
	//   38   63:iload_3         
	//   39   64:invokestatic    #175 <Method int Math.min(int, int)>
	//   40   67:istore          5
			s.getChars(i, i + i1, ac, 0);
	//   41   69:aload_1         
	//   42   70:iload_2         
	//   43   71:iload_2         
	//   44   72:iload           5
	//   45   74:iadd            
	//   46   75:aload           8
	//   47   77:iconst_0        
	//   48   78:invokevirtual   #398 <Method void String.getChars(int, int, char[], int)>
			if(_outputTail + j1 * 3 > _outputEnd)
	//*  49   81:aload_0         
	//*  50   82:getfield        #116 <Field int _outputTail>
	//*  51   85:iload           6
	//*  52   87:iconst_3        
	//*  53   88:imul            
	//*  54   89:iadd            
	//*  55   90:aload_0         
	//*  56   91:getfield        #89  <Field int _outputEnd>
	//*  57   94:icmple          101
				_flushBuffer();
	//   58   97:aload_0         
	//   59   98:invokevirtual   #125 <Method void _flushBuffer()>
			l = i1;
	//   60  101:iload           5
	//   61  103:istore          4
			if(j > 0)
	//*  62  105:iload_3         
	//*  63  106:ifle            147
			{
				char c = ac[i1 - 1];
	//   64  109:aload           8
	//   65  111:iload           5
	//   66  113:iconst_1        
	//   67  114:isub            
	//   68  115:caload          
	//   69  116:istore          7
				l = i1;
	//   70  118:iload           5
	//   71  120:istore          4
				if(c >= '\uD800')
	//*  72  122:iload           7
	//*  73  124:ldc1            #141 <Int 55296>
	//*  74  126:icmplt          147
				{
					l = i1;
	//   75  129:iload           5
	//   76  131:istore          4
					if(c <= '\uDBFF')
	//*  77  133:iload           7
	//*  78  135:ldc2            #574 <Int 56319>
	//*  79  138:icmpgt          147
						l = i1 - 1;
	//   80  141:iload           5
	//   81  143:iconst_1        
	//   82  144:isub            
	//   83  145:istore          4
				}
			}
			_writeRawSegment(ac, 0, l);
	//   84  147:aload_0         
	//   85  148:aload           8
	//   86  150:iconst_0        
	//   87  151:iload           4
	//   88  153:invokespecial   #576 <Method void _writeRawSegment(char[], int, int)>
			i += l;
	//   89  156:iload_2         
	//   90  157:iload           4
	//   91  159:iadd            
	//   92  160:istore_2        
		}

	//   93  161:iload_3         
	//   94  162:iload           4
	//   95  164:isub            
	//   96  165:istore_3        
	//*  97  166:goto            57
	//   98  169:return          
	}

	public final void writeRaw(char ac[], int i, int j)
		throws IOException
	{
		int k = j + j + j;
	//    0    0:iload_3         
	//    1    1:iload_3         
	//    2    2:iadd            
	//    3    3:iload_3         
	//    4    4:iadd            
	//    5    5:istore          4
		if(_outputTail + k > _outputEnd)
	//*   6    7:aload_0         
	//*   7    8:getfield        #116 <Field int _outputTail>
	//*   8   11:iload           4
	//*   9   13:iadd            
	//*  10   14:aload_0         
	//*  11   15:getfield        #89  <Field int _outputEnd>
	//*  12   18:icmple          42
		{
			if(_outputEnd < k)
	//*  13   21:aload_0         
	//*  14   22:getfield        #89  <Field int _outputEnd>
	//*  15   25:iload           4
	//*  16   27:icmpge          38
			{
				_writeSegmentedRaw(ac, i, j);
	//   17   30:aload_0         
	//   18   31:aload_1         
	//   19   32:iload_2         
	//   20   33:iload_3         
	//   21   34:invokespecial   #578 <Method void _writeSegmentedRaw(char[], int, int)>
				return;
	//   22   37:return          
			}
			_flushBuffer();
	//   23   38:aload_0         
	//   24   39:invokevirtual   #125 <Method void _flushBuffer()>
		}
		k = j + i;
	//   25   42:iload_3         
	//   26   43:iload_2         
	//   27   44:iadd            
	//   28   45:istore          4
label0:
		do
		{
			if(i < k)
	//*  29   47:iload_2         
	//*  30   48:iload           4
	//*  31   50:icmpge          203
				do
				{
					j = ((int) (ac[i]));
	//   32   53:aload_1         
	//   33   54:iload_2         
	//   34   55:caload          
	//   35   56:istore_3        
					if(j > 127)
	//*  36   57:iload_3         
	//*  37   58:bipush          127
	//*  38   60:icmple          164
					{
						j = i + 1;
	//   39   63:iload_2         
	//   40   64:iconst_1        
	//   41   65:iadd            
	//   42   66:istore_3        
						i = ((int) (ac[i]));
	//   43   67:aload_1         
	//   44   68:iload_2         
	//   45   69:caload          
	//   46   70:istore_2        
						if(i < 2048)
	//*  47   71:iload_2         
	//*  48   72:sipush          2048
	//*  49   75:icmpge          151
						{
							byte abyte0[] = _outputBuffer;
	//   50   78:aload_0         
	//   51   79:getfield        #87  <Field byte[] _outputBuffer>
	//   52   82:astore          6
							int l = _outputTail;
	//   53   84:aload_0         
	//   54   85:getfield        #116 <Field int _outputTail>
	//   55   88:istore          5
							_outputTail = l + 1;
	//   56   90:aload_0         
	//   57   91:iload           5
	//   58   93:iconst_1        
	//   59   94:iadd            
	//   60   95:putfield        #116 <Field int _outputTail>
							abyte0[l] = (byte)(0xc0 | i >> 6);
	//   61   98:aload           6
	//   62  100:iload           5
	//   63  102:sipush          192
	//   64  105:iload_2         
	//   65  106:bipush          6
	//   66  108:ishr            
	//   67  109:ior             
	//   68  110:int2byte        
	//   69  111:bastore         
							abyte0 = _outputBuffer;
	//   70  112:aload_0         
	//   71  113:getfield        #87  <Field byte[] _outputBuffer>
	//   72  116:astore          6
							l = _outputTail;
	//   73  118:aload_0         
	//   74  119:getfield        #116 <Field int _outputTail>
	//   75  122:istore          5
							_outputTail = l + 1;
	//   76  124:aload_0         
	//   77  125:iload           5
	//   78  127:iconst_1        
	//   79  128:iadd            
	//   80  129:putfield        #116 <Field int _outputTail>
							abyte0[l] = (byte)(i & 0x3f | 0x80);
	//   81  132:aload           6
	//   82  134:iload           5
	//   83  136:iload_2         
	//   84  137:bipush          63
	//   85  139:iand            
	//   86  140:sipush          128
	//   87  143:ior             
	//   88  144:int2byte        
	//   89  145:bastore         
							i = j;
	//   90  146:iload_3         
	//   91  147:istore_2        
						} else
	//*  92  148:goto            47
						{
							i = _outputRawMultiByteChar(i, ac, j, k);
	//   93  151:aload_0         
	//   94  152:iload_2         
	//   95  153:aload_1         
	//   96  154:iload_3         
	//   97  155:iload           4
	//   98  157:invokespecial   #268 <Method int _outputRawMultiByteChar(int, char[], int, int)>
	//   99  160:istore_2        
						}
						continue label0;
	//  100  161:goto            47
					}
					byte abyte1[] = _outputBuffer;
	//  101  164:aload_0         
	//  102  165:getfield        #87  <Field byte[] _outputBuffer>
	//  103  168:astore          6
					int i1 = _outputTail;
	//  104  170:aload_0         
	//  105  171:getfield        #116 <Field int _outputTail>
	//  106  174:istore          5
					_outputTail = i1 + 1;
	//  107  176:aload_0         
	//  108  177:iload           5
	//  109  179:iconst_1        
	//  110  180:iadd            
	//  111  181:putfield        #116 <Field int _outputTail>
					abyte1[i1] = (byte)j;
	//  112  184:aload           6
	//  113  186:iload           5
	//  114  188:iload_3         
	//  115  189:int2byte        
	//  116  190:bastore         
					j = i + 1;
	//  117  191:iload_2         
	//  118  192:iconst_1        
	//  119  193:iadd            
	//  120  194:istore_3        
					i = j;
	//  121  195:iload_3         
	//  122  196:istore_2        
				} while(j < k);
	//  123  197:iload_3         
	//  124  198:iload           4
	//  125  200:icmplt          53
			return;
	//  126  203:return          
		} while(true);
	}

	public void writeRawUTF8String(byte abyte0[], int i, int j)
		throws IOException
	{
		_verifyValueWrite("write a string");
	//    0    0:aload_0         
	//    1    1:ldc2            #581 <String "write a string">
	//    2    4:invokevirtual   #449 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #116 <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #89  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #125 <Method void _flushBuffer()>
		byte abyte1[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #87  <Field byte[] _outputBuffer>
	//   12   26:astore          5
		int k = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #116 <Field int _outputTail>
	//   15   32:istore          4
		_outputTail = k + 1;
	//   16   34:aload_0         
	//   17   35:iload           4
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #116 <Field int _outputTail>
		abyte1[k] = _quoteChar;
	//   21   42:aload           5
	//   22   44:iload           4
	//   23   46:aload_0         
	//   24   47:getfield        #76  <Field byte _quoteChar>
	//   25   50:bastore         
		_writeBytes(abyte0, i, j);
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:iload_2         
	//   29   54:iload_3         
	//   30   55:invokespecial   #583 <Method void _writeBytes(byte[], int, int)>
		if(_outputTail >= _outputEnd)
	//*  31   58:aload_0         
	//*  32   59:getfield        #116 <Field int _outputTail>
	//*  33   62:aload_0         
	//*  34   63:getfield        #89  <Field int _outputEnd>
	//*  35   66:icmplt          73
			_flushBuffer();
	//   36   69:aload_0         
	//   37   70:invokevirtual   #125 <Method void _flushBuffer()>
		abyte0 = _outputBuffer;
	//   38   73:aload_0         
	//   39   74:getfield        #87  <Field byte[] _outputBuffer>
	//   40   77:astore_1        
		i = _outputTail;
	//   41   78:aload_0         
	//   42   79:getfield        #116 <Field int _outputTail>
	//   43   82:istore_2        
		_outputTail = i + 1;
	//   44   83:aload_0         
	//   45   84:iload_2         
	//   46   85:iconst_1        
	//   47   86:iadd            
	//   48   87:putfield        #116 <Field int _outputTail>
		abyte0[i] = _quoteChar;
	//   49   90:aload_1         
	//   50   91:iload_2         
	//   51   92:aload_0         
	//   52   93:getfield        #76  <Field byte _quoteChar>
	//   53   96:bastore         
	//   54   97:return          
	}

	public void writeRawValue(SerializableString serializablestring)
		throws IOException
	{
		_verifyValueWrite("write a raw (unencoded) value");
	//    0    0:aload_0         
	//    1    1:ldc2            #586 <String "write a raw (unencoded) value">
	//    2    4:invokevirtual   #449 <Method void _verifyValueWrite(String)>
		serializablestring = ((SerializableString) (serializablestring.asUnquotedUTF8()));
	//    3    7:aload_1         
	//    4    8:invokeinterface #190 <Method byte[] SerializableString.asUnquotedUTF8()>
	//    5   13:astore_1        
		if(serializablestring.length > 0)
	//*   6   14:aload_1         
	//*   7   15:arraylength     
	//*   8   16:ifle            24
			_writeBytes(((byte []) (serializablestring)));
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokespecial   #312 <Method void _writeBytes(byte[])>
	//   12   24:return          
	}

	public final void writeStartArray()
		throws IOException
	{
		_verifyValueWrite("start an array");
	//    0    0:aload_0         
	//    1    1:ldc2            #589 <String "start an array">
	//    2    4:invokevirtual   #449 <Method void _verifyValueWrite(String)>
		_writeContext = _writeContext.createChildArrayContext();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #332 <Field JsonWriteContext _writeContext>
	//    6   12:invokevirtual   #592 <Method JsonWriteContext JsonWriteContext.createChildArrayContext()>
	//    7   15:putfield        #332 <Field JsonWriteContext _writeContext>
		if(_cfgPrettyPrinter != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #341 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  10   22:ifnull          36
		{
			_cfgPrettyPrinter.writeStartArray(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   11   25:aload_0         
	//   12   26:getfield        #341 <Field PrettyPrinter _cfgPrettyPrinter>
	//   13   29:aload_0         
	//   14   30:invokeinterface #594 <Method void PrettyPrinter.writeStartArray(com.fasterxml.jackson.core.JsonGenerator)>
			return;
	//   15   35:return          
		}
		if(_outputTail >= _outputEnd)
	//*  16   36:aload_0         
	//*  17   37:getfield        #116 <Field int _outputTail>
	//*  18   40:aload_0         
	//*  19   41:getfield        #89  <Field int _outputEnd>
	//*  20   44:icmplt          51
			_flushBuffer();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #125 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//   23   51:aload_0         
	//   24   52:getfield        #87  <Field byte[] _outputBuffer>
	//   25   55:astore_2        
		int i = _outputTail;
	//   26   56:aload_0         
	//   27   57:getfield        #116 <Field int _outputTail>
	//   28   60:istore_1        
		_outputTail = i + 1;
	//   29   61:aload_0         
	//   30   62:iload_1         
	//   31   63:iconst_1        
	//   32   64:iadd            
	//   33   65:putfield        #116 <Field int _outputTail>
		abyte0[i] = 91;
	//   34   68:aload_2         
	//   35   69:iload_1         
	//   36   70:bipush          91
	//   37   72:bastore         
	//   38   73:return          
	}

	public final void writeStartObject()
		throws IOException
	{
		_verifyValueWrite("start an object");
	//    0    0:aload_0         
	//    1    1:ldc2            #597 <String "start an object">
	//    2    4:invokevirtual   #449 <Method void _verifyValueWrite(String)>
		_writeContext = _writeContext.createChildObjectContext();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #332 <Field JsonWriteContext _writeContext>
	//    6   12:invokevirtual   #600 <Method JsonWriteContext JsonWriteContext.createChildObjectContext()>
	//    7   15:putfield        #332 <Field JsonWriteContext _writeContext>
		if(_cfgPrettyPrinter != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #341 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  10   22:ifnull          36
		{
			_cfgPrettyPrinter.writeStartObject(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   11   25:aload_0         
	//   12   26:getfield        #341 <Field PrettyPrinter _cfgPrettyPrinter>
	//   13   29:aload_0         
	//   14   30:invokeinterface #602 <Method void PrettyPrinter.writeStartObject(com.fasterxml.jackson.core.JsonGenerator)>
			return;
	//   15   35:return          
		}
		if(_outputTail >= _outputEnd)
	//*  16   36:aload_0         
	//*  17   37:getfield        #116 <Field int _outputTail>
	//*  18   40:aload_0         
	//*  19   41:getfield        #89  <Field int _outputEnd>
	//*  20   44:icmplt          51
			_flushBuffer();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #125 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//   23   51:aload_0         
	//   24   52:getfield        #87  <Field byte[] _outputBuffer>
	//   25   55:astore_2        
		int i = _outputTail;
	//   26   56:aload_0         
	//   27   57:getfield        #116 <Field int _outputTail>
	//   28   60:istore_1        
		_outputTail = i + 1;
	//   29   61:aload_0         
	//   30   62:iload_1         
	//   31   63:iconst_1        
	//   32   64:iadd            
	//   33   65:putfield        #116 <Field int _outputTail>
		abyte0[i] = 123;
	//   34   68:aload_2         
	//   35   69:iload_1         
	//   36   70:bipush          123
	//   37   72:bastore         
	//   38   73:return          
	}

	public void writeStartObject(Object obj)
		throws IOException
	{
		_verifyValueWrite("start an object");
	//    0    0:aload_0         
	//    1    1:ldc2            #597 <String "start an object">
	//    2    4:invokevirtual   #449 <Method void _verifyValueWrite(String)>
		JsonWriteContext jsonwritecontext = _writeContext.createChildObjectContext();
	//    3    7:aload_0         
	//    4    8:getfield        #332 <Field JsonWriteContext _writeContext>
	//    5   11:invokevirtual   #600 <Method JsonWriteContext JsonWriteContext.createChildObjectContext()>
	//    6   14:astore_3        
		_writeContext = jsonwritecontext;
	//    7   15:aload_0         
	//    8   16:aload_3         
	//    9   17:putfield        #332 <Field JsonWriteContext _writeContext>
		if(obj != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          29
			jsonwritecontext.setCurrentValue(obj);
	//   12   24:aload_3         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #606 <Method void JsonWriteContext.setCurrentValue(Object)>
		if(_cfgPrettyPrinter != null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #341 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  17   33:ifnull          47
		{
			_cfgPrettyPrinter.writeStartObject(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   18   36:aload_0         
	//   19   37:getfield        #341 <Field PrettyPrinter _cfgPrettyPrinter>
	//   20   40:aload_0         
	//   21   41:invokeinterface #602 <Method void PrettyPrinter.writeStartObject(com.fasterxml.jackson.core.JsonGenerator)>
			return;
	//   22   46:return          
		}
		if(_outputTail >= _outputEnd)
	//*  23   47:aload_0         
	//*  24   48:getfield        #116 <Field int _outputTail>
	//*  25   51:aload_0         
	//*  26   52:getfield        #89  <Field int _outputEnd>
	//*  27   55:icmplt          62
			_flushBuffer();
	//   28   58:aload_0         
	//   29   59:invokevirtual   #125 <Method void _flushBuffer()>
		obj = ((Object) (_outputBuffer));
	//   30   62:aload_0         
	//   31   63:getfield        #87  <Field byte[] _outputBuffer>
	//   32   66:astore_1        
		int i = _outputTail;
	//   33   67:aload_0         
	//   34   68:getfield        #116 <Field int _outputTail>
	//   35   71:istore_2        
		_outputTail = i + 1;
	//   36   72:aload_0         
	//   37   73:iload_2         
	//   38   74:iconst_1        
	//   39   75:iadd            
	//   40   76:putfield        #116 <Field int _outputTail>
		obj[i] = 123;
	//   41   79:aload_1         
	//   42   80:iload_2         
	//   43   81:bipush          123
	//   44   83:bastore         
	//   45   84:return          
	}

	public final void writeString(SerializableString serializablestring)
		throws IOException
	{
		_verifyValueWrite("write a string");
	//    0    0:aload_0         
	//    1    1:ldc2            #581 <String "write a string">
	//    2    4:invokevirtual   #449 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #116 <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #89  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #125 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #87  <Field byte[] _outputBuffer>
	//   12   26:astore_3        
		int i = _outputTail;
	//   13   27:aload_0         
	//   14   28:getfield        #116 <Field int _outputTail>
	//   15   31:istore_2        
		_outputTail = i + 1;
	//   16   32:aload_0         
	//   17   33:iload_2         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:putfield        #116 <Field int _outputTail>
		abyte0[i] = _quoteChar;
	//   21   39:aload_3         
	//   22   40:iload_2         
	//   23   41:aload_0         
	//   24   42:getfield        #76  <Field byte _quoteChar>
	//   25   45:bastore         
		i = serializablestring.appendQuotedUTF8(_outputBuffer, _outputTail);
	//   26   46:aload_1         
	//   27   47:aload_0         
	//   28   48:getfield        #87  <Field byte[] _outputBuffer>
	//   29   51:aload_0         
	//   30   52:getfield        #116 <Field int _outputTail>
	//   31   55:invokeinterface #307 <Method int SerializableString.appendQuotedUTF8(byte[], int)>
	//   32   60:istore_2        
		if(i < 0)
	//*  33   61:iload_2         
	//*  34   62:ifge            78
			_writeBytes(serializablestring.asQuotedUTF8());
	//   35   65:aload_0         
	//   36   66:aload_1         
	//   37   67:invokeinterface #310 <Method byte[] SerializableString.asQuotedUTF8()>
	//   38   72:invokespecial   #312 <Method void _writeBytes(byte[])>
		else
	//*  39   75:goto            88
			_outputTail = _outputTail + i;
	//   40   78:aload_0         
	//   41   79:aload_0         
	//   42   80:getfield        #116 <Field int _outputTail>
	//   43   83:iload_2         
	//   44   84:iadd            
	//   45   85:putfield        #116 <Field int _outputTail>
		if(_outputTail >= _outputEnd)
	//*  46   88:aload_0         
	//*  47   89:getfield        #116 <Field int _outputTail>
	//*  48   92:aload_0         
	//*  49   93:getfield        #89  <Field int _outputEnd>
	//*  50   96:icmplt          103
			_flushBuffer();
	//   51   99:aload_0         
	//   52  100:invokevirtual   #125 <Method void _flushBuffer()>
		serializablestring = ((SerializableString) (_outputBuffer));
	//   53  103:aload_0         
	//   54  104:getfield        #87  <Field byte[] _outputBuffer>
	//   55  107:astore_1        
		i = _outputTail;
	//   56  108:aload_0         
	//   57  109:getfield        #116 <Field int _outputTail>
	//   58  112:istore_2        
		_outputTail = i + 1;
	//   59  113:aload_0         
	//   60  114:iload_2         
	//   61  115:iconst_1        
	//   62  116:iadd            
	//   63  117:putfield        #116 <Field int _outputTail>
		serializablestring[i] = _quoteChar;
	//   64  120:aload_1         
	//   65  121:iload_2         
	//   66  122:aload_0         
	//   67  123:getfield        #76  <Field byte _quoteChar>
	//   68  126:bastore         
	//   69  127:return          
	}

	public void writeString(String s)
		throws IOException
	{
		_verifyValueWrite("write a string");
	//    0    0:aload_0         
	//    1    1:ldc2            #581 <String "write a string">
	//    2    4:invokevirtual   #449 <Method void _verifyValueWrite(String)>
		if(s == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       16
		{
			_writeNull();
	//    5   11:aload_0         
	//    6   12:invokespecial   #508 <Method void _writeNull()>
			return;
	//    7   15:return          
		}
		int i = s.length();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #292 <Method int String.length()>
	//   10   20:istore_2        
		if(i > _outputMaxContiguous)
	//*  11   21:iload_2         
	//*  12   22:aload_0         
	//*  13   23:getfield        #91  <Field int _outputMaxContiguous>
	//*  14   26:icmple          36
		{
			_writeStringSegments(s, true);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:iconst_1        
	//   18   32:invokespecial   #394 <Method void _writeStringSegments(String, boolean)>
			return;
	//   19   35:return          
		}
		if(_outputTail + i >= _outputEnd)
	//*  20   36:aload_0         
	//*  21   37:getfield        #116 <Field int _outputTail>
	//*  22   40:iload_2         
	//*  23   41:iadd            
	//*  24   42:aload_0         
	//*  25   43:getfield        #89  <Field int _outputEnd>
	//*  26   46:icmplt          53
			_flushBuffer();
	//   27   49:aload_0         
	//   28   50:invokevirtual   #125 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//   29   53:aload_0         
	//   30   54:getfield        #87  <Field byte[] _outputBuffer>
	//   31   57:astore          4
		int j = _outputTail;
	//   32   59:aload_0         
	//   33   60:getfield        #116 <Field int _outputTail>
	//   34   63:istore_3        
		_outputTail = j + 1;
	//   35   64:aload_0         
	//   36   65:iload_3         
	//   37   66:iconst_1        
	//   38   67:iadd            
	//   39   68:putfield        #116 <Field int _outputTail>
		abyte0[j] = _quoteChar;
	//   40   71:aload           4
	//   41   73:iload_3         
	//   42   74:aload_0         
	//   43   75:getfield        #76  <Field byte _quoteChar>
	//   44   78:bastore         
		_writeStringSegment(s, 0, i);
	//   45   79:aload_0         
	//   46   80:aload_1         
	//   47   81:iconst_0        
	//   48   82:iload_2         
	//   49   83:invokespecial   #287 <Method void _writeStringSegment(String, int, int)>
		if(_outputTail >= _outputEnd)
	//*  50   86:aload_0         
	//*  51   87:getfield        #116 <Field int _outputTail>
	//*  52   90:aload_0         
	//*  53   91:getfield        #89  <Field int _outputEnd>
	//*  54   94:icmplt          101
			_flushBuffer();
	//   55   97:aload_0         
	//   56   98:invokevirtual   #125 <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//   57  101:aload_0         
	//   58  102:getfield        #87  <Field byte[] _outputBuffer>
	//   59  105:astore_1        
		i = _outputTail;
	//   60  106:aload_0         
	//   61  107:getfield        #116 <Field int _outputTail>
	//   62  110:istore_2        
		_outputTail = i + 1;
	//   63  111:aload_0         
	//   64  112:iload_2         
	//   65  113:iconst_1        
	//   66  114:iadd            
	//   67  115:putfield        #116 <Field int _outputTail>
		s[i] = _quoteChar;
	//   68  118:aload_1         
	//   69  119:iload_2         
	//   70  120:aload_0         
	//   71  121:getfield        #76  <Field byte _quoteChar>
	//   72  124:bastore         
	//   73  125:return          
	}

	public void writeString(char ac[], int i, int j)
		throws IOException
	{
		_verifyValueWrite("write a string");
	//    0    0:aload_0         
	//    1    1:ldc2            #581 <String "write a string">
	//    2    4:invokevirtual   #449 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #116 <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #89  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #125 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #87  <Field byte[] _outputBuffer>
	//   12   26:astore          5
		int k = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #116 <Field int _outputTail>
	//   15   32:istore          4
		_outputTail = k + 1;
	//   16   34:aload_0         
	//   17   35:iload           4
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #116 <Field int _outputTail>
		abyte0[k] = _quoteChar;
	//   21   42:aload           5
	//   22   44:iload           4
	//   23   46:aload_0         
	//   24   47:getfield        #76  <Field byte _quoteChar>
	//   25   50:bastore         
		if(j <= _outputMaxContiguous)
	//*  26   51:iload_3         
	//*  27   52:aload_0         
	//*  28   53:getfield        #91  <Field int _outputMaxContiguous>
	//*  29   56:icmpgt          86
		{
			if(_outputTail + j > _outputEnd)
	//*  30   59:aload_0         
	//*  31   60:getfield        #116 <Field int _outputTail>
	//*  32   63:iload_3         
	//*  33   64:iadd            
	//*  34   65:aload_0         
	//*  35   66:getfield        #89  <Field int _outputEnd>
	//*  36   69:icmple          76
				_flushBuffer();
	//   37   72:aload_0         
	//   38   73:invokevirtual   #125 <Method void _flushBuffer()>
			_writeStringSegment(ac, i, j);
	//   39   76:aload_0         
	//   40   77:aload_1         
	//   41   78:iload_2         
	//   42   79:iload_3         
	//   43   80:invokespecial   #294 <Method void _writeStringSegment(char[], int, int)>
		} else
	//*  44   83:goto            93
		{
			_writeStringSegments(ac, i, j);
	//   45   86:aload_0         
	//   46   87:aload_1         
	//   47   88:iload_2         
	//   48   89:iload_3         
	//   49   90:invokespecial   #400 <Method void _writeStringSegments(char[], int, int)>
		}
		if(_outputTail >= _outputEnd)
	//*  50   93:aload_0         
	//*  51   94:getfield        #116 <Field int _outputTail>
	//*  52   97:aload_0         
	//*  53   98:getfield        #89  <Field int _outputEnd>
	//*  54  101:icmplt          108
			_flushBuffer();
	//   55  104:aload_0         
	//   56  105:invokevirtual   #125 <Method void _flushBuffer()>
		ac = ((char []) (_outputBuffer));
	//   57  108:aload_0         
	//   58  109:getfield        #87  <Field byte[] _outputBuffer>
	//   59  112:astore_1        
		i = _outputTail;
	//   60  113:aload_0         
	//   61  114:getfield        #116 <Field int _outputTail>
	//   62  117:istore_2        
		_outputTail = i + 1;
	//   63  118:aload_0         
	//   64  119:iload_2         
	//   65  120:iconst_1        
	//   66  121:iadd            
	//   67  122:putfield        #116 <Field int _outputTail>
		ac[i] = ((char) (_quoteChar));
	//   68  125:aload_1         
	//   69  126:iload_2         
	//   70  127:aload_0         
	//   71  128:getfield        #76  <Field byte _quoteChar>
	//   72  131:bastore         
	//   73  132:return          
	}

	public void writeUTF8String(byte abyte0[], int i, int j)
		throws IOException
	{
		_verifyValueWrite("write a string");
	//    0    0:aload_0         
	//    1    1:ldc2            #581 <String "write a string">
	//    2    4:invokevirtual   #449 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #116 <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #89  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #125 <Method void _flushBuffer()>
		byte abyte1[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #87  <Field byte[] _outputBuffer>
	//   12   26:astore          5
		int k = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #116 <Field int _outputTail>
	//   15   32:istore          4
		_outputTail = k + 1;
	//   16   34:aload_0         
	//   17   35:iload           4
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #116 <Field int _outputTail>
		abyte1[k] = _quoteChar;
	//   21   42:aload           5
	//   22   44:iload           4
	//   23   46:aload_0         
	//   24   47:getfield        #76  <Field byte _quoteChar>
	//   25   50:bastore         
		if(j <= _outputMaxContiguous)
	//*  26   51:iload_3         
	//*  27   52:aload_0         
	//*  28   53:getfield        #91  <Field int _outputMaxContiguous>
	//*  29   56:icmpgt          69
			_writeUTF8Segment(abyte0, i, j);
	//   30   59:aload_0         
	//   31   60:aload_1         
	//   32   61:iload_2         
	//   33   62:iload_3         
	//   34   63:invokespecial   #301 <Method void _writeUTF8Segment(byte[], int, int)>
		else
	//*  35   66:goto            76
			_writeUTF8Segments(abyte0, i, j);
	//   36   69:aload_0         
	//   37   70:aload_1         
	//   38   71:iload_2         
	//   39   72:iload_3         
	//   40   73:invokespecial   #609 <Method void _writeUTF8Segments(byte[], int, int)>
		if(_outputTail >= _outputEnd)
	//*  41   76:aload_0         
	//*  42   77:getfield        #116 <Field int _outputTail>
	//*  43   80:aload_0         
	//*  44   81:getfield        #89  <Field int _outputEnd>
	//*  45   84:icmplt          91
			_flushBuffer();
	//   46   87:aload_0         
	//   47   88:invokevirtual   #125 <Method void _flushBuffer()>
		abyte0 = _outputBuffer;
	//   48   91:aload_0         
	//   49   92:getfield        #87  <Field byte[] _outputBuffer>
	//   50   95:astore_1        
		i = _outputTail;
	//   51   96:aload_0         
	//   52   97:getfield        #116 <Field int _outputTail>
	//   53  100:istore_2        
		_outputTail = i + 1;
	//   54  101:aload_0         
	//   55  102:iload_2         
	//   56  103:iconst_1        
	//   57  104:iadd            
	//   58  105:putfield        #116 <Field int _outputTail>
		abyte0[i] = _quoteChar;
	//   59  108:aload_1         
	//   60  109:iload_2         
	//   61  110:aload_0         
	//   62  111:getfield        #76  <Field byte _quoteChar>
	//   63  114:bastore         
	//   64  115:return          
	}

	private static final byte BYTE_0 = 48;
	private static final byte BYTE_BACKSLASH = 92;
	private static final byte BYTE_COLON = 58;
	private static final byte BYTE_COMMA = 44;
	private static final byte BYTE_LBRACKET = 91;
	private static final byte BYTE_LCURLY = 123;
	private static final byte BYTE_RBRACKET = 93;
	private static final byte BYTE_RCURLY = 125;
	private static final byte BYTE_u = 117;
	private static final byte FALSE_BYTES[] = {
		102, 97, 108, 115, 101
	};
	private static final byte HEX_CHARS[] = CharTypes.copyHexBytes();
	private static final int MAX_BYTES_TO_BUFFER = 512;
	private static final byte NULL_BYTES[] = {
		110, 117, 108, 108
	};
	private static final byte TRUE_BYTES[] = {
		116, 114, 117, 101
	};
	protected boolean _bufferRecyclable;
	protected char _charBuffer[];
	protected final int _charBufferLength;
	protected byte _entityBuffer[];
	protected byte _outputBuffer[];
	protected final int _outputEnd;
	protected final int _outputMaxContiguous;
	protected final OutputStream _outputStream;
	protected int _outputTail;
	protected byte _quoteChar;

	static 
	{
	//    0    0:invokestatic    #52  <Method byte[] CharTypes.copyHexBytes()>
	//    1    3:putstatic       #54  <Field byte[] HEX_CHARS>
	//    2    6:iconst_4        
	//    3    7:newarray        byte[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:ldc1            #55  <Int 110>
	//    7   13:bastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:ldc1            #23  <Int 117>
	//   11   18:bastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:ldc1            #56  <Int 108>
	//   15   23:bastore         
	//   16   24:dup             
	//   17   25:iconst_3        
	//   18   26:ldc1            #56  <Int 108>
	//   19   28:bastore         
	//   20   29:putstatic       #58  <Field byte[] NULL_BYTES>
	//   21   32:iconst_4        
	//   22   33:newarray        byte[]
	//   23   35:dup             
	//   24   36:iconst_0        
	//   25   37:ldc1            #59  <Int 116>
	//   26   39:bastore         
	//   27   40:dup             
	//   28   41:iconst_1        
	//   29   42:ldc1            #60  <Int 114>
	//   30   44:bastore         
	//   31   45:dup             
	//   32   46:iconst_2        
	//   33   47:ldc1            #23  <Int 117>
	//   34   49:bastore         
	//   35   50:dup             
	//   36   51:iconst_3        
	//   37   52:ldc1            #61  <Int 101>
	//   38   54:bastore         
	//   39   55:putstatic       #63  <Field byte[] TRUE_BYTES>
	//   40   58:iconst_5        
	//   41   59:newarray        byte[]
	//   42   61:dup             
	//   43   62:iconst_0        
	//   44   63:ldc1            #64  <Int 102>
	//   45   65:bastore         
	//   46   66:dup             
	//   47   67:iconst_1        
	//   48   68:ldc1            #65  <Int 97>
	//   49   70:bastore         
	//   50   71:dup             
	//   51   72:iconst_2        
	//   52   73:ldc1            #56  <Int 108>
	//   53   75:bastore         
	//   54   76:dup             
	//   55   77:iconst_3        
	//   56   78:ldc1            #66  <Int 115>
	//   57   80:bastore         
	//   58   81:dup             
	//   59   82:iconst_4        
	//   60   83:ldc1            #61  <Int 101>
	//   61   85:bastore         
	//   62   86:putstatic       #68  <Field byte[] FALSE_BYTES>
	//*  63   89:return          
	}
}
