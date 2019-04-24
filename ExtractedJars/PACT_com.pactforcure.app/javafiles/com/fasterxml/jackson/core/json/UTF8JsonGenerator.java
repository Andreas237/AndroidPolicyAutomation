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
	//    4    4:invokespecial   #75  <Method void JsonGeneratorImpl(IOContext, int, ObjectCodec)>
		_outputStream = outputstream;
	//    5    7:aload_0         
	//    6    8:aload           4
	//    7   10:putfield        #77  <Field OutputStream _outputStream>
		_bufferRecyclable = true;
	//    8   13:aload_0         
	//    9   14:iconst_1        
	//   10   15:putfield        #79  <Field boolean _bufferRecyclable>
		_outputBuffer = iocontext.allocWriteEncodingBuffer();
	//   11   18:aload_0         
	//   12   19:aload_1         
	//   13   20:invokevirtual   #84  <Method byte[] IOContext.allocWriteEncodingBuffer()>
	//   14   23:putfield        #86  <Field byte[] _outputBuffer>
		_outputEnd = _outputBuffer.length;
	//   15   26:aload_0         
	//   16   27:aload_0         
	//   17   28:getfield        #86  <Field byte[] _outputBuffer>
	//   18   31:arraylength     
	//   19   32:putfield        #88  <Field int _outputEnd>
		_outputMaxContiguous = _outputEnd >> 3;
	//   20   35:aload_0         
	//   21   36:aload_0         
	//   22   37:getfield        #88  <Field int _outputEnd>
	//   23   40:iconst_3        
	//   24   41:ishr            
	//   25   42:putfield        #90  <Field int _outputMaxContiguous>
		_charBuffer = iocontext.allocConcatBuffer();
	//   26   45:aload_0         
	//   27   46:aload_1         
	//   28   47:invokevirtual   #94  <Method char[] IOContext.allocConcatBuffer()>
	//   29   50:putfield        #96  <Field char[] _charBuffer>
		_charBufferLength = _charBuffer.length;
	//   30   53:aload_0         
	//   31   54:aload_0         
	//   32   55:getfield        #96  <Field char[] _charBuffer>
	//   33   58:arraylength     
	//   34   59:putfield        #98  <Field int _charBufferLength>
		if(isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII))
	//*  35   62:aload_0         
	//*  36   63:getstatic       #104 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.ESCAPE_NON_ASCII>
	//*  37   66:invokevirtual   #108 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*  38   69:ifeq            79
			setHighestNonEscapedChar(127);
	//   39   72:aload_0         
	//   40   73:bipush          127
	//   41   75:invokevirtual   #112 <Method com.fasterxml.jackson.core.JsonGenerator setHighestNonEscapedChar(int)>
	//   42   78:pop             
	//   43   79:return          
	}

	public UTF8JsonGenerator(IOContext iocontext, int i, ObjectCodec objectcodec, OutputStream outputstream, byte abyte0[], int j, boolean flag)
	{
		super(iocontext, i, objectcodec);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #75  <Method void JsonGeneratorImpl(IOContext, int, ObjectCodec)>
		_outputStream = outputstream;
	//    5    7:aload_0         
	//    6    8:aload           4
	//    7   10:putfield        #77  <Field OutputStream _outputStream>
		_bufferRecyclable = flag;
	//    8   13:aload_0         
	//    9   14:iload           7
	//   10   16:putfield        #79  <Field boolean _bufferRecyclable>
		_outputTail = j;
	//   11   19:aload_0         
	//   12   20:iload           6
	//   13   22:putfield        #115 <Field int _outputTail>
		_outputBuffer = abyte0;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #86  <Field byte[] _outputBuffer>
		_outputEnd = _outputBuffer.length;
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:getfield        #86  <Field byte[] _outputBuffer>
	//   20   36:arraylength     
	//   21   37:putfield        #88  <Field int _outputEnd>
		_outputMaxContiguous = _outputEnd >> 3;
	//   22   40:aload_0         
	//   23   41:aload_0         
	//   24   42:getfield        #88  <Field int _outputEnd>
	//   25   45:iconst_3        
	//   26   46:ishr            
	//   27   47:putfield        #90  <Field int _outputMaxContiguous>
		_charBuffer = iocontext.allocConcatBuffer();
	//   28   50:aload_0         
	//   29   51:aload_1         
	//   30   52:invokevirtual   #94  <Method char[] IOContext.allocConcatBuffer()>
	//   31   55:putfield        #96  <Field char[] _charBuffer>
		_charBufferLength = _charBuffer.length;
	//   32   58:aload_0         
	//   33   59:aload_0         
	//   34   60:getfield        #96  <Field char[] _charBuffer>
	//   35   63:arraylength     
	//   36   64:putfield        #98  <Field int _charBufferLength>
	//   37   67:return          
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
	//   12   18:putfield        #115 <Field int _outputTail>
			_flushBuffer();
	//   13   21:aload_0         
	//   14   22:invokevirtual   #124 <Method void _flushBuffer()>
			i = _outputTail;
	//   15   25:aload_0         
	//   16   26:getfield        #115 <Field int _outputTail>
	//   17   29:istore_2        
			if(i1 > abyte0.length)
	//*  18   30:iload           7
	//*  19   32:aload_1         
	//*  20   33:arraylength     
	//*  21   34:icmple          51
			{
				_outputStream.write(abyte1, 0, i1);
	//   22   37:aload_0         
	//   23   38:getfield        #77  <Field OutputStream _outputStream>
	//   24   41:aload           4
	//   25   43:iconst_0        
	//   26   44:iload           7
	//   27   46:invokevirtual   #130 <Method void OutputStream.write(byte[], int, int)>
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
	//   35   58:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
			l = i + i1;
	//   36   61:iload_2         
	//   37   62:iload           7
	//   38   64:iadd            
	//   39   65:istore          6
		}
		if(k * 6 + l > j)
	//*  40   67:iload           5
	//*  41   69:bipush          6
	//*  42   71:imul            
	//*  43   72:iload           6
	//*  44   74:iadd            
	//*  45   75:iload_3         
	//*  46   76:icmple          88
		{
			_flushBuffer();
	//   47   79:aload_0         
	//   48   80:invokevirtual   #124 <Method void _flushBuffer()>
			return _outputTail;
	//   49   83:aload_0         
	//   50   84:getfield        #115 <Field int _outputTail>
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
	//    1    1:getfield        #86  <Field byte[] _outputBuffer>
	//    2    4:astore          4
		if(i >= 55296 && i <= 57343)
	//*   3    6:iload_1         
	//*   4    7:ldc1            #140 <Int 55296>
	//*   5    9:icmplt          110
	//*   6   12:iload_1         
	//*   7   13:ldc1            #141 <Int 57343>
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
	//   31   45:getstatic       #55  <Field byte[] HEX_CHARS>
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
	//   45   64:getstatic       #55  <Field byte[] HEX_CHARS>
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
	//   59   83:getstatic       #55  <Field byte[] HEX_CHARS>
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
	//   69   97:getstatic       #55  <Field byte[] HEX_CHARS>
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
			abyte0[j] = (byte)(i >> 12 | 0xe0);
	//   83  114:aload           4
	//   84  116:iload_2         
	//   85  117:iload_1         
	//   86  118:bipush          12
	//   87  120:ishr            
	//   88  121:sipush          224
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
	//*   1    1:ldc1            #140 <Int 55296>
	//*   2    3:icmplt          40
	//*   3    6:iload_1         
	//*   4    7:ldc1            #141 <Int 57343>
	//*   5    9:icmpgt          40
		{
			if(j >= k || ac == null)
	//*   6   12:iload_3         
	//*   7   13:iload           4
	//*   8   15:icmpge          22
	//*   9   18:aload_2         
	//*  10   19:ifnonnull       28
				_reportError("Split surrogate on writeRaw() input (last character)");
	//   11   22:aload_0         
	//   12   23:ldc1            #145 <String "Split surrogate on writeRaw() input (last character)">
	//   13   25:invokevirtual   #149 <Method void _reportError(String)>
			_outputSurrogates(i, ((int) (ac[j])));
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:aload_2         
	//   17   31:iload_3         
	//   18   32:caload          
	//   19   33:invokevirtual   #153 <Method void _outputSurrogates(int, int)>
			return j + 1;
	//   20   36:iload_3         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:ireturn         
		} else
		{
			ac = ((char []) (_outputBuffer));
	//   24   40:aload_0         
	//   25   41:getfield        #86  <Field byte[] _outputBuffer>
	//   26   44:astore_2        
			k = _outputTail;
	//   27   45:aload_0         
	//   28   46:getfield        #115 <Field int _outputTail>
	//   29   49:istore          4
			_outputTail = k + 1;
	//   30   51:aload_0         
	//   31   52:iload           4
	//   32   54:iconst_1        
	//   33   55:iadd            
	//   34   56:putfield        #115 <Field int _outputTail>
			ac[k] = ((char) ((byte)(i >> 12 | 0xe0)));
	//   35   59:aload_2         
	//   36   60:iload           4
	//   37   62:iload_1         
	//   38   63:bipush          12
	//   39   65:ishr            
	//   40   66:sipush          224
	//   41   69:ior             
	//   42   70:int2byte        
	//   43   71:bastore         
			k = _outputTail;
	//   44   72:aload_0         
	//   45   73:getfield        #115 <Field int _outputTail>
	//   46   76:istore          4
			_outputTail = k + 1;
	//   47   78:aload_0         
	//   48   79:iload           4
	//   49   81:iconst_1        
	//   50   82:iadd            
	//   51   83:putfield        #115 <Field int _outputTail>
			ac[k] = ((char) ((byte)(i >> 6 & 0x3f | 0x80)));
	//   52   86:aload_2         
	//   53   87:iload           4
	//   54   89:iload_1         
	//   55   90:bipush          6
	//   56   92:ishr            
	//   57   93:bipush          63
	//   58   95:iand            
	//   59   96:sipush          128
	//   60   99:ior             
	//   61  100:int2byte        
	//   62  101:bastore         
			k = _outputTail;
	//   63  102:aload_0         
	//   64  103:getfield        #115 <Field int _outputTail>
	//   65  106:istore          4
			_outputTail = k + 1;
	//   66  108:aload_0         
	//   67  109:iload           4
	//   68  111:iconst_1        
	//   69  112:iadd            
	//   70  113:putfield        #115 <Field int _outputTail>
			ac[k] = ((char) ((byte)(i & 0x3f | 0x80)));
	//   71  116:aload_2         
	//   72  117:iload           4
	//   73  119:iload_1         
	//   74  120:bipush          63
	//   75  122:iand            
	//   76  123:sipush          128
	//   77  126:ior             
	//   78  127:int2byte        
	//   79  128:bastore         
			return j;
	//   80  129:iload_3         
	//   81  130:ireturn         
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
	//   27   40:invokestatic    #160 <Method int Math.min(int, int)>
	//   28   43:istore          5
_L2:
		j = k - i;
	//   29   45:iload           5
	//   30   47:iload_3         
	//   31   48:isub            
	//   32   49:istore          4
		if(j != 0)
	//*  33   51:iload           4
	//*  34   53:ifne            58
	//*  35   56:iload_3         
	//*  36   57:ireturn         
		{
			j = inputstream.read(abyte0, i, j);
	//   37   58:aload_1         
	//   38   59:aload_2         
	//   39   60:iload_3         
	//   40   61:iload           4
	//   41   63:invokevirtual   #166 <Method int InputStream.read(byte[], int, int)>
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
			if(j < 3)
				continue; /* Loop/switch isn't completed */
	//   53   84:iload           4
	//   54   86:iconst_3        
	//   55   87:icmplt          45
			i = j;
	//   56   90:iload           4
	//   57   92:istore_3        
		}
		return i;
		if(true) goto _L2; else goto _L1
_L1:
	//*  58   93:goto            56
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
	//*   4    4:getfield        #115 <Field int _outputTail>
	//*   5    7:iload_2         
	//*   6    8:iadd            
	//*   7    9:aload_0         
	//*   8   10:getfield        #88  <Field int _outputEnd>
	//*   9   13:icmple          38
		{
			_flushBuffer();
	//   10   16:aload_0         
	//   11   17:invokevirtual   #124 <Method void _flushBuffer()>
			if(i > 512)
	//*  12   20:iload_2         
	//*  13   21:sipush          512
	//*  14   24:icmple          38
			{
				_outputStream.write(abyte0, 0, i);
	//   15   27:aload_0         
	//   16   28:getfield        #77  <Field OutputStream _outputStream>
	//   17   31:aload_1         
	//   18   32:iconst_0        
	//   19   33:iload_2         
	//   20   34:invokevirtual   #130 <Method void OutputStream.write(byte[], int, int)>
				return;
	//   21   37:return          
			}
		}
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (_outputBuffer)), _outputTail, i);
	//   22   38:aload_1         
	//   23   39:iconst_0        
	//   24   40:aload_0         
	//   25   41:getfield        #86  <Field byte[] _outputBuffer>
	//   26   44:aload_0         
	//   27   45:getfield        #115 <Field int _outputTail>
	//   28   48:iload_2         
	//   29   49:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
		_outputTail = _outputTail + i;
	//   30   52:aload_0         
	//   31   53:aload_0         
	//   32   54:getfield        #115 <Field int _outputTail>
	//   33   57:iload_2         
	//   34   58:iadd            
	//   35   59:putfield        #115 <Field int _outputTail>
	//   36   62:return          
	}

	private final void _writeBytes(byte abyte0[], int i, int j)
		throws IOException
	{
		if(_outputTail + j > _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field int _outputTail>
	//*   2    4:iload_3         
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #88  <Field int _outputEnd>
	//*   6   10:icmple          35
		{
			_flushBuffer();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #124 <Method void _flushBuffer()>
			if(j > 512)
	//*   9   17:iload_3         
	//*  10   18:sipush          512
	//*  11   21:icmple          35
			{
				_outputStream.write(abyte0, i, j);
	//   12   24:aload_0         
	//   13   25:getfield        #77  <Field OutputStream _outputStream>
	//   14   28:aload_1         
	//   15   29:iload_2         
	//   16   30:iload_3         
	//   17   31:invokevirtual   #130 <Method void OutputStream.write(byte[], int, int)>
				return;
	//   18   34:return          
			}
		}
		System.arraycopy(((Object) (abyte0)), i, ((Object) (_outputBuffer)), _outputTail, j);
	//   19   35:aload_1         
	//   20   36:iload_2         
	//   21   37:aload_0         
	//   22   38:getfield        #86  <Field byte[] _outputBuffer>
	//   23   41:aload_0         
	//   24   42:getfield        #115 <Field int _outputTail>
	//   25   45:iload_3         
	//   26   46:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
		_outputTail = _outputTail + j;
	//   27   49:aload_0         
	//   28   50:aload_0         
	//   29   51:getfield        #115 <Field int _outputTail>
	//   30   54:iload_3         
	//   31   55:iadd            
	//   32   56:putfield        #115 <Field int _outputTail>
	//   33   59:return          
	}

	private final int _writeCustomEscape(byte abyte0[], int i, SerializableString serializablestring, int j)
		throws IOException, JsonGenerationException
	{
		serializablestring = ((SerializableString) (serializablestring.asUnquotedUTF8()));
	//    0    0:aload_3         
	//    1    1:invokeinterface #175 <Method byte[] SerializableString.asUnquotedUTF8()>
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
	//   13   22:getfield        #88  <Field int _outputEnd>
	//   14   25:aload_3         
	//   15   26:iload           4
	//   16   28:invokespecial   #177 <Method int _handleLongCustomEscape(byte[], int, int, byte[], int)>
	//   17   31:ireturn         
		} else
		{
			System.arraycopy(((Object) (serializablestring)), 0, ((Object) (abyte0)), i, k);
	//   18   32:aload_3         
	//   19   33:iconst_0        
	//   20   34:aload_1         
	//   21   35:iload_2         
	//   22   36:iload           5
	//   23   38:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
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
		if(_outputTail + (j - i) * 6 > _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field int _outputTail>
	//*   2    4:iload_3         
	//*   3    5:iload_2         
	//*   4    6:isub            
	//*   5    7:bipush          6
	//*   6    9:imul            
	//*   7   10:iadd            
	//*   8   11:aload_0         
	//*   9   12:getfield        #88  <Field int _outputEnd>
	//*  10   15:icmple          22
			_flushBuffer();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #124 <Method void _flushBuffer()>
		int k = _outputTail;
	//   13   22:aload_0         
	//   14   23:getfield        #115 <Field int _outputTail>
	//   15   26:istore          4
		byte abyte0[] = _outputBuffer;
	//   16   28:aload_0         
	//   17   29:getfield        #86  <Field byte[] _outputBuffer>
	//   18   32:astore          8
		int ai[] = _outputEscapes;
	//   19   34:aload_0         
	//   20   35:getfield        #183 <Field int[] _outputEscapes>
	//   21   38:astore          9
		int i1;
		CharacterEscapes characterescapes;
		if(_maximumNonEscapedChar <= 0)
	//*  22   40:aload_0         
	//*  23   41:getfield        #186 <Field int _maximumNonEscapedChar>
	//*  24   44:ifgt            109
			i1 = 65535;
	//   25   47:ldc1            #187 <Int 65535>
	//   26   49:istore          6
		else
	//*  27   51:aload_0         
	//*  28   52:getfield        #191 <Field CharacterEscapes _characterEscapes>
	//*  29   55:astore          10
	//*  30   57:iload_2         
	//*  31   58:iload_3         
	//*  32   59:icmpge          376
	//*  33   62:iload_2         
	//*  34   63:iconst_1        
	//*  35   64:iadd            
	//*  36   65:istore          5
	//*  37   67:aload_1         
	//*  38   68:iload_2         
	//*  39   69:invokevirtual   #197 <Method char String.charAt(int)>
	//*  40   72:istore          7
	//*  41   74:iload           7
	//*  42   76:bipush          127
	//*  43   78:icmpgt          250
	//*  44   81:aload           9
	//*  45   83:iload           7
	//*  46   85:iaload          
	//*  47   86:ifne            118
	//*  48   89:aload           8
	//*  49   91:iload           4
	//*  50   93:iload           7
	//*  51   95:int2byte        
	//*  52   96:bastore         
	//*  53   97:iload           4
	//*  54   99:iconst_1        
	//*  55  100:iadd            
	//*  56  101:istore          4
	//*  57  103:iload           5
	//*  58  105:istore_2        
	//*  59  106:goto            57
			i1 = _maximumNonEscapedChar;
	//   60  109:aload_0         
	//   61  110:getfield        #186 <Field int _maximumNonEscapedChar>
	//   62  113:istore          6
		characterescapes = _characterEscapes;
		do
		{
			while(i < j) 
			{
				int l = i + 1;
				int j1 = ((int) (s.charAt(i)));
				if(j1 <= 127)
				{
					if(ai[j1] == 0)
					{
						abyte0[k] = (byte)j1;
						k++;
						i = l;
					} else
	//*  63  115:goto            51
					{
						i = ai[j1];
	//   64  118:aload           9
	//   65  120:iload           7
	//   66  122:iaload          
	//   67  123:istore_2        
						if(i > 0)
	//*  68  124:iload_2         
	//*  69  125:ifle            160
						{
							j1 = k + 1;
	//   70  128:iload           4
	//   71  130:iconst_1        
	//   72  131:iadd            
	//   73  132:istore          7
							abyte0[k] = 92;
	//   74  134:aload           8
	//   75  136:iload           4
	//   76  138:bipush          92
	//   77  140:bastore         
							k = j1 + 1;
	//   78  141:iload           7
	//   79  143:iconst_1        
	//   80  144:iadd            
	//   81  145:istore          4
							abyte0[j1] = (byte)i;
	//   82  147:aload           8
	//   83  149:iload           7
	//   84  151:iload_2         
	//   85  152:int2byte        
	//   86  153:bastore         
							i = l;
	//   87  154:iload           5
	//   88  156:istore_2        
						} else
	//*  89  157:goto            57
						if(i == -2)
	//*  90  160:iload_2         
	//*  91  161:bipush          -2
	//*  92  163:icmpne          234
						{
							SerializableString serializablestring = characterescapes.getEscapeSequence(j1);
	//   93  166:aload           10
	//   94  168:iload           7
	//   95  170:invokevirtual   #203 <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//   96  173:astore          11
							if(serializablestring == null)
	//*  97  175:aload           11
	//*  98  177:ifnonnull       212
								_reportError((new StringBuilder()).append("Invalid custom escape definitions; custom escape not found for character code 0x").append(Integer.toHexString(j1)).append(", although was supposed to have one").toString());
	//   99  180:aload_0         
	//  100  181:new             #205 <Class StringBuilder>
	//  101  184:dup             
	//  102  185:invokespecial   #207 <Method void StringBuilder()>
	//  103  188:ldc1            #209 <String "Invalid custom escape definitions; custom escape not found for character code 0x">
	//  104  190:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//  105  193:iload           7
	//  106  195:invokestatic    #219 <Method String Integer.toHexString(int)>
	//  107  198:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//  108  201:ldc1            #221 <String ", although was supposed to have one">
	//  109  203:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//  110  206:invokevirtual   #225 <Method String StringBuilder.toString()>
	//  111  209:invokevirtual   #149 <Method void _reportError(String)>
							k = _writeCustomEscape(abyte0, k, serializablestring, j - l);
	//  112  212:aload_0         
	//  113  213:aload           8
	//  114  215:iload           4
	//  115  217:aload           11
	//  116  219:iload_3         
	//  117  220:iload           5
	//  118  222:isub            
	//  119  223:invokespecial   #227 <Method int _writeCustomEscape(byte[], int, SerializableString, int)>
	//  120  226:istore          4
							i = l;
	//  121  228:iload           5
	//  122  230:istore_2        
						} else
	//* 123  231:goto            57
						{
							k = _writeGenericEscape(j1, k);
	//  124  234:aload_0         
	//  125  235:iload           7
	//  126  237:iload           4
	//  127  239:invokespecial   #230 <Method int _writeGenericEscape(int, int)>
	//  128  242:istore          4
							i = l;
	//  129  244:iload           5
	//  130  246:istore_2        
						}
					}
				} else
	//* 131  247:goto            57
				if(j1 > i1)
	//* 132  250:iload           7
	//* 133  252:iload           6
	//* 134  254:icmple          273
				{
					k = _writeGenericEscape(j1, k);
	//  135  257:aload_0         
	//  136  258:iload           7
	//  137  260:iload           4
	//  138  262:invokespecial   #230 <Method int _writeGenericEscape(int, int)>
	//  139  265:istore          4
					i = l;
	//  140  267:iload           5
	//  141  269:istore_2        
				} else
	//* 142  270:goto            57
				{
					SerializableString serializablestring1 = characterescapes.getEscapeSequence(j1);
	//  143  273:aload           10
	//  144  275:iload           7
	//  145  277:invokevirtual   #203 <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//  146  280:astore          11
					if(serializablestring1 != null)
	//* 147  282:aload           11
	//* 148  284:ifnull          309
					{
						k = _writeCustomEscape(abyte0, k, serializablestring1, j - l);
	//  149  287:aload_0         
	//  150  288:aload           8
	//  151  290:iload           4
	//  152  292:aload           11
	//  153  294:iload_3         
	//  154  295:iload           5
	//  155  297:isub            
	//  156  298:invokespecial   #227 <Method int _writeCustomEscape(byte[], int, SerializableString, int)>
	//  157  301:istore          4
						i = l;
	//  158  303:iload           5
	//  159  305:istore_2        
					} else
	//* 160  306:goto            57
					{
						if(j1 <= 2047)
	//* 161  309:iload           7
	//* 162  311:sipush          2047
	//* 163  314:icmpgt          364
						{
							i = k + 1;
	//  164  317:iload           4
	//  165  319:iconst_1        
	//  166  320:iadd            
	//  167  321:istore_2        
							abyte0[k] = (byte)(j1 >> 6 | 0xc0);
	//  168  322:aload           8
	//  169  324:iload           4
	//  170  326:iload           7
	//  171  328:bipush          6
	//  172  330:ishr            
	//  173  331:sipush          192
	//  174  334:ior             
	//  175  335:int2byte        
	//  176  336:bastore         
							abyte0[i] = (byte)(j1 & 0x3f | 0x80);
	//  177  337:aload           8
	//  178  339:iload_2         
	//  179  340:iload           7
	//  180  342:bipush          63
	//  181  344:iand            
	//  182  345:sipush          128
	//  183  348:ior             
	//  184  349:int2byte        
	//  185  350:bastore         
							i++;
	//  186  351:iload_2         
	//  187  352:iconst_1        
	//  188  353:iadd            
	//  189  354:istore_2        
						} else
	//* 190  355:iload_2         
	//* 191  356:istore          4
	//* 192  358:iload           5
	//* 193  360:istore_2        
	//* 194  361:goto            57
						{
							i = _outputMultiByteChar(j1, k);
	//  195  364:aload_0         
	//  196  365:iload           7
	//  197  367:iload           4
	//  198  369:invokespecial   #232 <Method int _outputMultiByteChar(int, int)>
	//  199  372:istore_2        
						}
						k = i;
						i = l;
					}
				}
			}
	//* 200  373:goto            355
			_outputTail = k;
	//  201  376:aload_0         
	//  202  377:iload           4
	//  203  379:putfield        #115 <Field int _outputTail>
			return;
	//  204  382:return          
		} while(true);
	}

	private final void _writeCustomStringSegment2(char ac[], int i, int j)
		throws IOException
	{
		if(_outputTail + (j - i) * 6 > _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field int _outputTail>
	//*   2    4:iload_3         
	//*   3    5:iload_2         
	//*   4    6:isub            
	//*   5    7:bipush          6
	//*   6    9:imul            
	//*   7   10:iadd            
	//*   8   11:aload_0         
	//*   9   12:getfield        #88  <Field int _outputEnd>
	//*  10   15:icmple          22
			_flushBuffer();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #124 <Method void _flushBuffer()>
		int k = _outputTail;
	//   13   22:aload_0         
	//   14   23:getfield        #115 <Field int _outputTail>
	//   15   26:istore          4
		byte abyte0[] = _outputBuffer;
	//   16   28:aload_0         
	//   17   29:getfield        #86  <Field byte[] _outputBuffer>
	//   18   32:astore          8
		int ai[] = _outputEscapes;
	//   19   34:aload_0         
	//   20   35:getfield        #183 <Field int[] _outputEscapes>
	//   21   38:astore          9
		int i1;
		CharacterEscapes characterescapes;
		if(_maximumNonEscapedChar <= 0)
	//*  22   40:aload_0         
	//*  23   41:getfield        #186 <Field int _maximumNonEscapedChar>
	//*  24   44:ifgt            107
			i1 = 65535;
	//   25   47:ldc1            #187 <Int 65535>
	//   26   49:istore          6
		else
	//*  27   51:aload_0         
	//*  28   52:getfield        #191 <Field CharacterEscapes _characterEscapes>
	//*  29   55:astore          10
	//*  30   57:iload_2         
	//*  31   58:iload_3         
	//*  32   59:icmpge          374
	//*  33   62:iload_2         
	//*  34   63:iconst_1        
	//*  35   64:iadd            
	//*  36   65:istore          5
	//*  37   67:aload_1         
	//*  38   68:iload_2         
	//*  39   69:caload          
	//*  40   70:istore          7
	//*  41   72:iload           7
	//*  42   74:bipush          127
	//*  43   76:icmpgt          248
	//*  44   79:aload           9
	//*  45   81:iload           7
	//*  46   83:iaload          
	//*  47   84:ifne            116
	//*  48   87:aload           8
	//*  49   89:iload           4
	//*  50   91:iload           7
	//*  51   93:int2byte        
	//*  52   94:bastore         
	//*  53   95:iload           4
	//*  54   97:iconst_1        
	//*  55   98:iadd            
	//*  56   99:istore          4
	//*  57  101:iload           5
	//*  58  103:istore_2        
	//*  59  104:goto            57
			i1 = _maximumNonEscapedChar;
	//   60  107:aload_0         
	//   61  108:getfield        #186 <Field int _maximumNonEscapedChar>
	//   62  111:istore          6
		characterescapes = _characterEscapes;
		do
		{
			while(i < j) 
			{
				int l = i + 1;
				int j1 = ((int) (ac[i]));
				if(j1 <= 127)
				{
					if(ai[j1] == 0)
					{
						abyte0[k] = (byte)j1;
						k++;
						i = l;
					} else
	//*  63  113:goto            51
					{
						i = ai[j1];
	//   64  116:aload           9
	//   65  118:iload           7
	//   66  120:iaload          
	//   67  121:istore_2        
						if(i > 0)
	//*  68  122:iload_2         
	//*  69  123:ifle            158
						{
							j1 = k + 1;
	//   70  126:iload           4
	//   71  128:iconst_1        
	//   72  129:iadd            
	//   73  130:istore          7
							abyte0[k] = 92;
	//   74  132:aload           8
	//   75  134:iload           4
	//   76  136:bipush          92
	//   77  138:bastore         
							k = j1 + 1;
	//   78  139:iload           7
	//   79  141:iconst_1        
	//   80  142:iadd            
	//   81  143:istore          4
							abyte0[j1] = (byte)i;
	//   82  145:aload           8
	//   83  147:iload           7
	//   84  149:iload_2         
	//   85  150:int2byte        
	//   86  151:bastore         
							i = l;
	//   87  152:iload           5
	//   88  154:istore_2        
						} else
	//*  89  155:goto            57
						if(i == -2)
	//*  90  158:iload_2         
	//*  91  159:bipush          -2
	//*  92  161:icmpne          232
						{
							SerializableString serializablestring = characterescapes.getEscapeSequence(j1);
	//   93  164:aload           10
	//   94  166:iload           7
	//   95  168:invokevirtual   #203 <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//   96  171:astore          11
							if(serializablestring == null)
	//*  97  173:aload           11
	//*  98  175:ifnonnull       210
								_reportError((new StringBuilder()).append("Invalid custom escape definitions; custom escape not found for character code 0x").append(Integer.toHexString(j1)).append(", although was supposed to have one").toString());
	//   99  178:aload_0         
	//  100  179:new             #205 <Class StringBuilder>
	//  101  182:dup             
	//  102  183:invokespecial   #207 <Method void StringBuilder()>
	//  103  186:ldc1            #209 <String "Invalid custom escape definitions; custom escape not found for character code 0x">
	//  104  188:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//  105  191:iload           7
	//  106  193:invokestatic    #219 <Method String Integer.toHexString(int)>
	//  107  196:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//  108  199:ldc1            #221 <String ", although was supposed to have one">
	//  109  201:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//  110  204:invokevirtual   #225 <Method String StringBuilder.toString()>
	//  111  207:invokevirtual   #149 <Method void _reportError(String)>
							k = _writeCustomEscape(abyte0, k, serializablestring, j - l);
	//  112  210:aload_0         
	//  113  211:aload           8
	//  114  213:iload           4
	//  115  215:aload           11
	//  116  217:iload_3         
	//  117  218:iload           5
	//  118  220:isub            
	//  119  221:invokespecial   #227 <Method int _writeCustomEscape(byte[], int, SerializableString, int)>
	//  120  224:istore          4
							i = l;
	//  121  226:iload           5
	//  122  228:istore_2        
						} else
	//* 123  229:goto            57
						{
							k = _writeGenericEscape(j1, k);
	//  124  232:aload_0         
	//  125  233:iload           7
	//  126  235:iload           4
	//  127  237:invokespecial   #230 <Method int _writeGenericEscape(int, int)>
	//  128  240:istore          4
							i = l;
	//  129  242:iload           5
	//  130  244:istore_2        
						}
					}
				} else
	//* 131  245:goto            57
				if(j1 > i1)
	//* 132  248:iload           7
	//* 133  250:iload           6
	//* 134  252:icmple          271
				{
					k = _writeGenericEscape(j1, k);
	//  135  255:aload_0         
	//  136  256:iload           7
	//  137  258:iload           4
	//  138  260:invokespecial   #230 <Method int _writeGenericEscape(int, int)>
	//  139  263:istore          4
					i = l;
	//  140  265:iload           5
	//  141  267:istore_2        
				} else
	//* 142  268:goto            57
				{
					SerializableString serializablestring1 = characterescapes.getEscapeSequence(j1);
	//  143  271:aload           10
	//  144  273:iload           7
	//  145  275:invokevirtual   #203 <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//  146  278:astore          11
					if(serializablestring1 != null)
	//* 147  280:aload           11
	//* 148  282:ifnull          307
					{
						k = _writeCustomEscape(abyte0, k, serializablestring1, j - l);
	//  149  285:aload_0         
	//  150  286:aload           8
	//  151  288:iload           4
	//  152  290:aload           11
	//  153  292:iload_3         
	//  154  293:iload           5
	//  155  295:isub            
	//  156  296:invokespecial   #227 <Method int _writeCustomEscape(byte[], int, SerializableString, int)>
	//  157  299:istore          4
						i = l;
	//  158  301:iload           5
	//  159  303:istore_2        
					} else
	//* 160  304:goto            57
					{
						if(j1 <= 2047)
	//* 161  307:iload           7
	//* 162  309:sipush          2047
	//* 163  312:icmpgt          362
						{
							i = k + 1;
	//  164  315:iload           4
	//  165  317:iconst_1        
	//  166  318:iadd            
	//  167  319:istore_2        
							abyte0[k] = (byte)(j1 >> 6 | 0xc0);
	//  168  320:aload           8
	//  169  322:iload           4
	//  170  324:iload           7
	//  171  326:bipush          6
	//  172  328:ishr            
	//  173  329:sipush          192
	//  174  332:ior             
	//  175  333:int2byte        
	//  176  334:bastore         
							abyte0[i] = (byte)(j1 & 0x3f | 0x80);
	//  177  335:aload           8
	//  178  337:iload_2         
	//  179  338:iload           7
	//  180  340:bipush          63
	//  181  342:iand            
	//  182  343:sipush          128
	//  183  346:ior             
	//  184  347:int2byte        
	//  185  348:bastore         
							i++;
	//  186  349:iload_2         
	//  187  350:iconst_1        
	//  188  351:iadd            
	//  189  352:istore_2        
						} else
	//* 190  353:iload_2         
	//* 191  354:istore          4
	//* 192  356:iload           5
	//* 193  358:istore_2        
	//* 194  359:goto            57
						{
							i = _outputMultiByteChar(j1, k);
	//  195  362:aload_0         
	//  196  363:iload           7
	//  197  365:iload           4
	//  198  367:invokespecial   #232 <Method int _outputMultiByteChar(int, int)>
	//  199  370:istore_2        
						}
						k = i;
						i = l;
					}
				}
			}
	//* 200  371:goto            353
			_outputTail = k;
	//  201  374:aload_0         
	//  202  375:iload           4
	//  203  377:putfield        #115 <Field int _outputTail>
			return;
	//  204  380:return          
		} while(true);
	}

	private int _writeGenericEscape(int i, int j)
		throws IOException
	{
		byte abyte0[] = _outputBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field byte[] _outputBuffer>
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
	//*  21   30:icmple          113
		{
			k = i >> 8 & 0xff;
	//   22   33:iload_1         
	//   23   34:bipush          8
	//   24   36:ishr            
	//   25   37:sipush          255
	//   26   40:iand            
	//   27   41:istore_3        
			int i1 = j + 1;
	//   28   42:iload_2         
	//   29   43:iconst_1        
	//   30   44:iadd            
	//   31   45:istore          4
			abyte0[j] = HEX_CHARS[k >> 4];
	//   32   47:aload           5
	//   33   49:iload_2         
	//   34   50:getstatic       #55  <Field byte[] HEX_CHARS>
	//   35   53:iload_3         
	//   36   54:iconst_4        
	//   37   55:ishr            
	//   38   56:baload          
	//   39   57:bastore         
			j = i1 + 1;
	//   40   58:iload           4
	//   41   60:iconst_1        
	//   42   61:iadd            
	//   43   62:istore_2        
			abyte0[i1] = HEX_CHARS[k & 0xf];
	//   44   63:aload           5
	//   45   65:iload           4
	//   46   67:getstatic       #55  <Field byte[] HEX_CHARS>
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
	//*  56   82:iload_2         
	//*  57   83:iconst_1        
	//*  58   84:iadd            
	//*  59   85:istore_3        
	//*  60   86:aload           5
	//*  61   88:iload_2         
	//*  62   89:getstatic       #55  <Field byte[] HEX_CHARS>
	//*  63   92:iload_1         
	//*  64   93:iconst_4        
	//*  65   94:ishr            
	//*  66   95:baload          
	//*  67   96:bastore         
	//*  68   97:aload           5
	//*  69   99:iload_3         
	//*  70  100:getstatic       #55  <Field byte[] HEX_CHARS>
	//*  71  103:iload_1         
	//*  72  104:bipush          15
	//*  73  106:iand            
	//*  74  107:baload          
	//*  75  108:bastore         
	//*  76  109:iload_3         
	//*  77  110:iconst_1        
	//*  78  111:iadd            
	//*  79  112:ireturn         
		{
			int l = j + 1;
	//   80  113:iload_2         
	//   81  114:iconst_1        
	//   82  115:iadd            
	//   83  116:istore_3        
			abyte0[j] = 48;
	//   84  117:aload           5
	//   85  119:iload_2         
	//   86  120:bipush          48
	//   87  122:bastore         
			j = l + 1;
	//   88  123:iload_3         
	//   89  124:iconst_1        
	//   90  125:iadd            
	//   91  126:istore_2        
			abyte0[l] = 48;
	//   92  127:aload           5
	//   93  129:iload_3         
	//   94  130:bipush          48
	//   95  132:bastore         
		}
		k = j + 1;
		abyte0[j] = HEX_CHARS[i >> 4];
		abyte0[k] = HEX_CHARS[i & 0xf];
		return k + 1;
	//*  96  133:goto            82
	}

	private final void _writeNull()
		throws IOException
	{
		if(_outputTail + 4 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field int _outputTail>
	//*   2    4:iconst_4        
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #88  <Field int _outputEnd>
	//*   6   10:icmplt          17
			_flushBuffer();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #124 <Method void _flushBuffer()>
		System.arraycopy(((Object) (NULL_BYTES)), 0, ((Object) (_outputBuffer)), _outputTail, 4);
	//    9   17:getstatic       #59  <Field byte[] NULL_BYTES>
	//   10   20:iconst_0        
	//   11   21:aload_0         
	//   12   22:getfield        #86  <Field byte[] _outputBuffer>
	//   13   25:aload_0         
	//   14   26:getfield        #115 <Field int _outputTail>
	//   15   29:iconst_4        
	//   16   30:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
		_outputTail = _outputTail + 4;
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #115 <Field int _outputTail>
	//   20   38:iconst_4        
	//   21   39:iadd            
	//   22   40:putfield        #115 <Field int _outputTail>
	//   23   43:return          
	}

	private final void _writeQuotedInt(int i)
		throws IOException
	{
		if(_outputTail + 13 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field int _outputTail>
	//*   2    4:bipush          13
	//*   3    6:iadd            
	//*   4    7:aload_0         
	//*   5    8:getfield        #88  <Field int _outputEnd>
	//*   6   11:icmplt          18
			_flushBuffer();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #124 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//    9   18:aload_0         
	//   10   19:getfield        #86  <Field byte[] _outputBuffer>
	//   11   22:astore_3        
		int j = _outputTail;
	//   12   23:aload_0         
	//   13   24:getfield        #115 <Field int _outputTail>
	//   14   27:istore_2        
		_outputTail = j + 1;
	//   15   28:aload_0         
	//   16   29:iload_2         
	//   17   30:iconst_1        
	//   18   31:iadd            
	//   19   32:putfield        #115 <Field int _outputTail>
		abyte0[j] = 34;
	//   20   35:aload_3         
	//   21   36:iload_2         
	//   22   37:bipush          34
	//   23   39:bastore         
		_outputTail = NumberOutput.outputInt(i, _outputBuffer, _outputTail);
	//   24   40:aload_0         
	//   25   41:iload_1         
	//   26   42:aload_0         
	//   27   43:getfield        #86  <Field byte[] _outputBuffer>
	//   28   46:aload_0         
	//   29   47:getfield        #115 <Field int _outputTail>
	//   30   50:invokestatic    #242 <Method int NumberOutput.outputInt(int, byte[], int)>
	//   31   53:putfield        #115 <Field int _outputTail>
		abyte0 = _outputBuffer;
	//   32   56:aload_0         
	//   33   57:getfield        #86  <Field byte[] _outputBuffer>
	//   34   60:astore_3        
		i = _outputTail;
	//   35   61:aload_0         
	//   36   62:getfield        #115 <Field int _outputTail>
	//   37   65:istore_1        
		_outputTail = i + 1;
	//   38   66:aload_0         
	//   39   67:iload_1         
	//   40   68:iconst_1        
	//   41   69:iadd            
	//   42   70:putfield        #115 <Field int _outputTail>
		abyte0[i] = 34;
	//   43   73:aload_3         
	//   44   74:iload_1         
	//   45   75:bipush          34
	//   46   77:bastore         
	//   47   78:return          
	}

	private final void _writeQuotedLong(long l)
		throws IOException
	{
		if(_outputTail + 23 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field int _outputTail>
	//*   2    4:bipush          23
	//*   3    6:iadd            
	//*   4    7:aload_0         
	//*   5    8:getfield        #88  <Field int _outputEnd>
	//*   6   11:icmplt          18
			_flushBuffer();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #124 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//    9   18:aload_0         
	//   10   19:getfield        #86  <Field byte[] _outputBuffer>
	//   11   22:astore          4
		int i = _outputTail;
	//   12   24:aload_0         
	//   13   25:getfield        #115 <Field int _outputTail>
	//   14   28:istore_3        
		_outputTail = i + 1;
	//   15   29:aload_0         
	//   16   30:iload_3         
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:putfield        #115 <Field int _outputTail>
		abyte0[i] = 34;
	//   20   36:aload           4
	//   21   38:iload_3         
	//   22   39:bipush          34
	//   23   41:bastore         
		_outputTail = NumberOutput.outputLong(l, _outputBuffer, _outputTail);
	//   24   42:aload_0         
	//   25   43:lload_1         
	//   26   44:aload_0         
	//   27   45:getfield        #86  <Field byte[] _outputBuffer>
	//   28   48:aload_0         
	//   29   49:getfield        #115 <Field int _outputTail>
	//   30   52:invokestatic    #248 <Method int NumberOutput.outputLong(long, byte[], int)>
	//   31   55:putfield        #115 <Field int _outputTail>
		abyte0 = _outputBuffer;
	//   32   58:aload_0         
	//   33   59:getfield        #86  <Field byte[] _outputBuffer>
	//   34   62:astore          4
		i = _outputTail;
	//   35   64:aload_0         
	//   36   65:getfield        #115 <Field int _outputTail>
	//   37   68:istore_3        
		_outputTail = i + 1;
	//   38   69:aload_0         
	//   39   70:iload_3         
	//   40   71:iconst_1        
	//   41   72:iadd            
	//   42   73:putfield        #115 <Field int _outputTail>
		abyte0[i] = 34;
	//   43   76:aload           4
	//   44   78:iload_3         
	//   45   79:bipush          34
	//   46   81:bastore         
	//   47   82:return          
	}

	private final void _writeQuotedRaw(String s)
		throws IOException
	{
		if(_outputTail >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field int _outputTail>
	//*   2    4:aload_0         
	//*   3    5:getfield        #88  <Field int _outputEnd>
	//*   4    8:icmplt          15
			_flushBuffer();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #124 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #86  <Field byte[] _outputBuffer>
	//    9   19:astore_3        
		int i = _outputTail;
	//   10   20:aload_0         
	//   11   21:getfield        #115 <Field int _outputTail>
	//   12   24:istore_2        
		_outputTail = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #115 <Field int _outputTail>
		abyte0[i] = 34;
	//   18   32:aload_3         
	//   19   33:iload_2         
	//   20   34:bipush          34
	//   21   36:bastore         
		writeRaw(s);
	//   22   37:aload_0         
	//   23   38:aload_1         
	//   24   39:invokevirtual   #252 <Method void writeRaw(String)>
		if(_outputTail >= _outputEnd)
	//*  25   42:aload_0         
	//*  26   43:getfield        #115 <Field int _outputTail>
	//*  27   46:aload_0         
	//*  28   47:getfield        #88  <Field int _outputEnd>
	//*  29   50:icmplt          57
			_flushBuffer();
	//   30   53:aload_0         
	//   31   54:invokevirtual   #124 <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//   32   57:aload_0         
	//   33   58:getfield        #86  <Field byte[] _outputBuffer>
	//   34   61:astore_1        
		i = _outputTail;
	//   35   62:aload_0         
	//   36   63:getfield        #115 <Field int _outputTail>
	//   37   66:istore_2        
		_outputTail = i + 1;
	//   38   67:aload_0         
	//   39   68:iload_2         
	//   40   69:iconst_1        
	//   41   70:iadd            
	//   42   71:putfield        #115 <Field int _outputTail>
		s[i] = 34;
	//   43   74:aload_1         
	//   44   75:iload_2         
	//   45   76:bipush          34
	//   46   78:bastore         
	//   47   79:return          
	}

	private final void _writeQuotedShort(short word0)
		throws IOException
	{
		if(_outputTail + 8 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field int _outputTail>
	//*   2    4:bipush          8
	//*   3    6:iadd            
	//*   4    7:aload_0         
	//*   5    8:getfield        #88  <Field int _outputEnd>
	//*   6   11:icmplt          18
			_flushBuffer();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #124 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//    9   18:aload_0         
	//   10   19:getfield        #86  <Field byte[] _outputBuffer>
	//   11   22:astore_3        
		int i = _outputTail;
	//   12   23:aload_0         
	//   13   24:getfield        #115 <Field int _outputTail>
	//   14   27:istore_2        
		_outputTail = i + 1;
	//   15   28:aload_0         
	//   16   29:iload_2         
	//   17   30:iconst_1        
	//   18   31:iadd            
	//   19   32:putfield        #115 <Field int _outputTail>
		abyte0[i] = 34;
	//   20   35:aload_3         
	//   21   36:iload_2         
	//   22   37:bipush          34
	//   23   39:bastore         
		_outputTail = NumberOutput.outputInt(((int) (word0)), _outputBuffer, _outputTail);
	//   24   40:aload_0         
	//   25   41:iload_1         
	//   26   42:aload_0         
	//   27   43:getfield        #86  <Field byte[] _outputBuffer>
	//   28   46:aload_0         
	//   29   47:getfield        #115 <Field int _outputTail>
	//   30   50:invokestatic    #242 <Method int NumberOutput.outputInt(int, byte[], int)>
	//   31   53:putfield        #115 <Field int _outputTail>
		abyte0 = _outputBuffer;
	//   32   56:aload_0         
	//   33   57:getfield        #86  <Field byte[] _outputBuffer>
	//   34   60:astore_3        
		word0 = ((short) (_outputTail));
	//   35   61:aload_0         
	//   36   62:getfield        #115 <Field int _outputTail>
	//   37   65:istore_1        
		_outputTail = word0 + 1;
	//   38   66:aload_0         
	//   39   67:iload_1         
	//   40   68:iconst_1        
	//   41   69:iadd            
	//   42   70:putfield        #115 <Field int _outputTail>
		abyte0[word0] = 34;
	//   43   73:aload_3         
	//   44   74:iload_1         
	//   45   75:bipush          34
	//   46   77:bastore         
	//   47   78:return          
	}

	private final void _writeSegmentedRaw(char ac[], int i, int j)
		throws IOException, JsonGenerationException
	{
		int l = _outputEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field int _outputEnd>
	//    2    4:istore          5
		byte abyte0[] = _outputBuffer;
	//    3    6:aload_0         
	//    4    7:getfield        #86  <Field byte[] _outputBuffer>
	//    5   10:astore          7
label0:
		do
		{
			if(i < j)
	//*   6   12:iload_2         
	//*   7   13:iload_3         
	//*   8   14:icmpge          174
				do
				{
					int k = ((int) (ac[i]));
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:caload          
	//   12   20:istore          4
					if(k >= 128)
	//*  13   22:iload           4
	//*  14   24:sipush          128
	//*  15   27:icmplt          125
					{
						if(_outputTail + 3 >= _outputEnd)
	//*  16   30:aload_0         
	//*  17   31:getfield        #115 <Field int _outputTail>
	//*  18   34:iconst_3        
	//*  19   35:iadd            
	//*  20   36:aload_0         
	//*  21   37:getfield        #88  <Field int _outputEnd>
	//*  22   40:icmplt          47
							_flushBuffer();
	//   23   43:aload_0         
	//   24   44:invokevirtual   #124 <Method void _flushBuffer()>
						k = i + 1;
	//   25   47:iload_2         
	//   26   48:iconst_1        
	//   27   49:iadd            
	//   28   50:istore          4
						i = ((int) (ac[i]));
	//   29   52:aload_1         
	//   30   53:iload_2         
	//   31   54:caload          
	//   32   55:istore_2        
						int j1;
						if(i < 2048)
	//*  33   56:iload_2         
	//*  34   57:sipush          2048
	//*  35   60:icmpge          175
						{
							int i1 = _outputTail;
	//   36   63:aload_0         
	//   37   64:getfield        #115 <Field int _outputTail>
	//   38   67:istore          6
							_outputTail = i1 + 1;
	//   39   69:aload_0         
	//   40   70:iload           6
	//   41   72:iconst_1        
	//   42   73:iadd            
	//   43   74:putfield        #115 <Field int _outputTail>
							abyte0[i1] = (byte)(i >> 6 | 0xc0);
	//   44   77:aload           7
	//   45   79:iload           6
	//   46   81:iload_2         
	//   47   82:bipush          6
	//   48   84:ishr            
	//   49   85:sipush          192
	//   50   88:ior             
	//   51   89:int2byte        
	//   52   90:bastore         
							i1 = _outputTail;
	//   53   91:aload_0         
	//   54   92:getfield        #115 <Field int _outputTail>
	//   55   95:istore          6
							_outputTail = i1 + 1;
	//   56   97:aload_0         
	//   57   98:iload           6
	//   58  100:iconst_1        
	//   59  101:iadd            
	//   60  102:putfield        #115 <Field int _outputTail>
							abyte0[i1] = (byte)(i & 0x3f | 0x80);
	//   61  105:aload           7
	//   62  107:iload           6
	//   63  109:iload_2         
	//   64  110:bipush          63
	//   65  112:iand            
	//   66  113:sipush          128
	//   67  116:ior             
	//   68  117:int2byte        
	//   69  118:bastore         
							i = k;
	//   70  119:iload           4
	//   71  121:istore_2        
						} else
	//*  72  122:goto            12
	//*  73  125:aload_0         
	//*  74  126:getfield        #115 <Field int _outputTail>
	//*  75  129:iload           5
	//*  76  131:icmplt          138
	//*  77  134:aload_0         
	//*  78  135:invokevirtual   #124 <Method void _flushBuffer()>
	//*  79  138:aload_0         
	//*  80  139:getfield        #115 <Field int _outputTail>
	//*  81  142:istore          6
	//*  82  144:aload_0         
	//*  83  145:iload           6
	//*  84  147:iconst_1        
	//*  85  148:iadd            
	//*  86  149:putfield        #115 <Field int _outputTail>
	//*  87  152:aload           7
	//*  88  154:iload           6
	//*  89  156:iload           4
	//*  90  158:int2byte        
	//*  91  159:bastore         
	//*  92  160:iload_2         
	//*  93  161:iconst_1        
	//*  94  162:iadd            
	//*  95  163:istore          4
	//*  96  165:iload           4
	//*  97  167:istore_2        
	//*  98  168:iload           4
	//*  99  170:iload_3         
	//* 100  171:icmplt          17
	//* 101  174:return          
						{
							i = _outputRawMultiByteChar(i, ac, k, j);
	//  102  175:aload_0         
	//  103  176:iload_2         
	//  104  177:aload_1         
	//  105  178:iload           4
	//  106  180:iload_3         
	//  107  181:invokespecial   #257 <Method int _outputRawMultiByteChar(int, char[], int, int)>
	//  108  184:istore_2        
						}
						continue label0;
	//  109  185:goto            12
					}
					if(_outputTail >= l)
						_flushBuffer();
					j1 = _outputTail;
					_outputTail = j1 + 1;
					abyte0[j1] = (byte)k;
					k = i + 1;
					i = k;
				} while(k < j);
			return;
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
	//    5    6:getfield        #115 <Field int _outputTail>
	//    6    9:istore          4
		byte abyte0[] = _outputBuffer;
	//    7   11:aload_0         
	//    8   12:getfield        #86  <Field byte[] _outputBuffer>
	//    9   15:astore          6
		int ai[] = _outputEscapes;
	//   10   17:aload_0         
	//   11   18:getfield        #183 <Field int[] _outputEscapes>
	//   12   21:astore          7
		j = i;
	//   13   23:iload_2         
	//   14   24:istore_3        
		i = k;
	//   15   25:iload           4
	//   16   27:istore_2        
label0:
		do
		{
			char c;
label1:
			{
				if(j < l)
	//*  17   28:iload_3         
	//*  18   29:iload           5
	//*  19   31:icmpge          56
				{
					c = s.charAt(j);
	//   20   34:aload_1         
	//   21   35:iload_3         
	//   22   36:invokevirtual   #197 <Method char String.charAt(int)>
	//   23   39:istore          4
					if(c <= '\177' && ai[c] == 0)
						break label1;
	//   24   41:iload           4
	//   25   43:bipush          127
	//   26   45:icmpgt          56
	//   27   48:aload           7
	//   28   50:iload           4
	//   29   52:iaload          
	//   30   53:ifeq            83
				}
				_outputTail = i;
	//   31   56:aload_0         
	//   32   57:iload_2         
	//   33   58:putfield        #115 <Field int _outputTail>
				if(j < l)
	//*  34   61:iload_3         
	//*  35   62:iload           5
	//*  36   64:icmpge          82
				{
					if(_characterEscapes == null)
						break label0;
	//   37   67:aload_0         
	//   38   68:getfield        #191 <Field CharacterEscapes _characterEscapes>
	//   39   71:ifnull          101
					_writeCustomStringSegment2(s, j, l);
	//   40   74:aload_0         
	//   41   75:aload_1         
	//   42   76:iload_3         
	//   43   77:iload           5
	//   44   79:invokespecial   #260 <Method void _writeCustomStringSegment2(String, int, int)>
				}
				return;
	//   45   82:return          
			}
			abyte0[i] = (byte)c;
	//   46   83:aload           6
	//   47   85:iload_2         
	//   48   86:iload           4
	//   49   88:int2byte        
	//   50   89:bastore         
			j++;
	//   51   90:iload_3         
	//   52   91:iconst_1        
	//   53   92:iadd            
	//   54   93:istore_3        
			i++;
	//   55   94:iload_2         
	//   56   95:iconst_1        
	//   57   96:iadd            
	//   58   97:istore_2        
		} while(true);
	//   59   98:goto            28
		if(_maximumNonEscapedChar == 0)
	//*  60  101:aload_0         
	//*  61  102:getfield        #186 <Field int _maximumNonEscapedChar>
	//*  62  105:ifne            117
		{
			_writeStringSegment2(s, j, l);
	//   63  108:aload_0         
	//   64  109:aload_1         
	//   65  110:iload_3         
	//   66  111:iload           5
	//   67  113:invokespecial   #263 <Method void _writeStringSegment2(String, int, int)>
			return;
	//   68  116:return          
		} else
		{
			_writeStringSegmentASCII2(s, j, l);
	//   69  117:aload_0         
	//   70  118:aload_1         
	//   71  119:iload_3         
	//   72  120:iload           5
	//   73  122:invokespecial   #266 <Method void _writeStringSegmentASCII2(String, int, int)>
			return;
	//   74  125:return          
		}
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
	//    5    6:getfield        #115 <Field int _outputTail>
	//    6    9:istore          4
		byte abyte0[] = _outputBuffer;
	//    7   11:aload_0         
	//    8   12:getfield        #86  <Field byte[] _outputBuffer>
	//    9   15:astore          6
		int ai[] = _outputEscapes;
	//   10   17:aload_0         
	//   11   18:getfield        #183 <Field int[] _outputEscapes>
	//   12   21:astore          7
		j = i;
	//   13   23:iload_2         
	//   14   24:istore_3        
		i = k;
	//   15   25:iload           4
	//   16   27:istore_2        
label0:
		do
		{
			char c;
label1:
			{
				if(j < l)
	//*  17   28:iload_3         
	//*  18   29:iload           5
	//*  19   31:icmpge          54
				{
					c = ac[j];
	//   20   34:aload_1         
	//   21   35:iload_3         
	//   22   36:caload          
	//   23   37:istore          4
					if(c <= '\177' && ai[c] == 0)
						break label1;
	//   24   39:iload           4
	//   25   41:bipush          127
	//   26   43:icmpgt          54
	//   27   46:aload           7
	//   28   48:iload           4
	//   29   50:iaload          
	//   30   51:ifeq            81
				}
				_outputTail = i;
	//   31   54:aload_0         
	//   32   55:iload_2         
	//   33   56:putfield        #115 <Field int _outputTail>
				if(j < l)
	//*  34   59:iload_3         
	//*  35   60:iload           5
	//*  36   62:icmpge          80
				{
					if(_characterEscapes == null)
						break label0;
	//   37   65:aload_0         
	//   38   66:getfield        #191 <Field CharacterEscapes _characterEscapes>
	//   39   69:ifnull          99
					_writeCustomStringSegment2(ac, j, l);
	//   40   72:aload_0         
	//   41   73:aload_1         
	//   42   74:iload_3         
	//   43   75:iload           5
	//   44   77:invokespecial   #268 <Method void _writeCustomStringSegment2(char[], int, int)>
				}
				return;
	//   45   80:return          
			}
			abyte0[i] = (byte)c;
	//   46   81:aload           6
	//   47   83:iload_2         
	//   48   84:iload           4
	//   49   86:int2byte        
	//   50   87:bastore         
			j++;
	//   51   88:iload_3         
	//   52   89:iconst_1        
	//   53   90:iadd            
	//   54   91:istore_3        
			i++;
	//   55   92:iload_2         
	//   56   93:iconst_1        
	//   57   94:iadd            
	//   58   95:istore_2        
		} while(true);
	//   59   96:goto            28
		if(_maximumNonEscapedChar == 0)
	//*  60   99:aload_0         
	//*  61  100:getfield        #186 <Field int _maximumNonEscapedChar>
	//*  62  103:ifne            115
		{
			_writeStringSegment2(ac, j, l);
	//   63  106:aload_0         
	//   64  107:aload_1         
	//   65  108:iload_3         
	//   66  109:iload           5
	//   67  111:invokespecial   #270 <Method void _writeStringSegment2(char[], int, int)>
			return;
	//   68  114:return          
		} else
		{
			_writeStringSegmentASCII2(ac, j, l);
	//   69  115:aload_0         
	//   70  116:aload_1         
	//   71  117:iload_3         
	//   72  118:iload           5
	//   73  120:invokespecial   #272 <Method void _writeStringSegmentASCII2(char[], int, int)>
			return;
	//   74  123:return          
		}
	}

	private final void _writeStringSegment2(String s, int i, int j)
		throws IOException
	{
		if(_outputTail + (j - i) * 6 > _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field int _outputTail>
	//*   2    4:iload_3         
	//*   3    5:iload_2         
	//*   4    6:isub            
	//*   5    7:bipush          6
	//*   6    9:imul            
	//*   7   10:iadd            
	//*   8   11:aload_0         
	//*   9   12:getfield        #88  <Field int _outputEnd>
	//*  10   15:icmple          22
			_flushBuffer();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #124 <Method void _flushBuffer()>
		int k = _outputTail;
	//   13   22:aload_0         
	//   14   23:getfield        #115 <Field int _outputTail>
	//   15   26:istore          4
		byte abyte0[] = _outputBuffer;
	//   16   28:aload_0         
	//   17   29:getfield        #86  <Field byte[] _outputBuffer>
	//   18   32:astore          7
		int ai[] = _outputEscapes;
	//   19   34:aload_0         
	//   20   35:getfield        #183 <Field int[] _outputEscapes>
	//   21   38:astore          8
		int i1 = i;
	//   22   40:iload_2         
	//   23   41:istore          5
		i = k;
	//   24   43:iload           4
	//   25   45:istore_2        
		for(int l = i1; l < j;)
	//*  26   46:iload           5
	//*  27   48:istore          4
	//*  28   50:iload           4
	//*  29   52:iload_3         
	//*  30   53:icmpge          226
		{
			int j1 = l + 1;
	//   31   56:iload           4
	//   32   58:iconst_1        
	//   33   59:iadd            
	//   34   60:istore          5
			int k1 = ((int) (s.charAt(l)));
	//   35   62:aload_1         
	//   36   63:iload           4
	//   37   65:invokevirtual   #197 <Method char String.charAt(int)>
	//   38   68:istore          6
			if(k1 <= 127)
	//*  39   70:iload           6
	//*  40   72:bipush          127
	//*  41   74:icmpgt          161
			{
				if(ai[k1] == 0)
	//*  42   77:aload           8
	//*  43   79:iload           6
	//*  44   81:iaload          
	//*  45   82:ifne            103
				{
					abyte0[i] = (byte)k1;
	//   46   85:aload           7
	//   47   87:iload_2         
	//   48   88:iload           6
	//   49   90:int2byte        
	//   50   91:bastore         
					i++;
	//   51   92:iload_2         
	//   52   93:iconst_1        
	//   53   94:iadd            
	//   54   95:istore_2        
					l = j1;
	//   55   96:iload           5
	//   56   98:istore          4
				} else
	//*  57  100:goto            50
				{
					l = ai[k1];
	//   58  103:aload           8
	//   59  105:iload           6
	//   60  107:iaload          
	//   61  108:istore          4
					if(l > 0)
	//*  62  110:iload           4
	//*  63  112:ifle            146
					{
						k1 = i + 1;
	//   64  115:iload_2         
	//   65  116:iconst_1        
	//   66  117:iadd            
	//   67  118:istore          6
						abyte0[i] = 92;
	//   68  120:aload           7
	//   69  122:iload_2         
	//   70  123:bipush          92
	//   71  125:bastore         
						i = k1 + 1;
	//   72  126:iload           6
	//   73  128:iconst_1        
	//   74  129:iadd            
	//   75  130:istore_2        
						abyte0[k1] = (byte)l;
	//   76  131:aload           7
	//   77  133:iload           6
	//   78  135:iload           4
	//   79  137:int2byte        
	//   80  138:bastore         
						l = j1;
	//   81  139:iload           5
	//   82  141:istore          4
					} else
	//*  83  143:goto            50
					{
						i = _writeGenericEscape(k1, i);
	//   84  146:aload_0         
	//   85  147:iload           6
	//   86  149:iload_2         
	//   87  150:invokespecial   #230 <Method int _writeGenericEscape(int, int)>
	//   88  153:istore_2        
						l = j1;
	//   89  154:iload           5
	//   90  156:istore          4
					}
				}
			} else
	//*  91  158:goto            50
			{
				if(k1 <= 2047)
	//*  92  161:iload           6
	//*  93  163:sipush          2047
	//*  94  166:icmpgt          215
				{
					l = i + 1;
	//   95  169:iload_2         
	//   96  170:iconst_1        
	//   97  171:iadd            
	//   98  172:istore          4
					abyte0[i] = (byte)(k1 >> 6 | 0xc0);
	//   99  174:aload           7
	//  100  176:iload_2         
	//  101  177:iload           6
	//  102  179:bipush          6
	//  103  181:ishr            
	//  104  182:sipush          192
	//  105  185:ior             
	//  106  186:int2byte        
	//  107  187:bastore         
					abyte0[l] = (byte)(k1 & 0x3f | 0x80);
	//  108  188:aload           7
	//  109  190:iload           4
	//  110  192:iload           6
	//  111  194:bipush          63
	//  112  196:iand            
	//  113  197:sipush          128
	//  114  200:ior             
	//  115  201:int2byte        
	//  116  202:bastore         
					i = l + 1;
	//  117  203:iload           4
	//  118  205:iconst_1        
	//  119  206:iadd            
	//  120  207:istore_2        
				} else
	//* 121  208:iload           5
	//* 122  210:istore          4
	//* 123  212:goto            50
				{
					i = _outputMultiByteChar(k1, i);
	//  124  215:aload_0         
	//  125  216:iload           6
	//  126  218:iload_2         
	//  127  219:invokespecial   #232 <Method int _outputMultiByteChar(int, int)>
	//  128  222:istore_2        
				}
				l = j1;
			}
		}

	//* 129  223:goto            208
		_outputTail = i;
	//  130  226:aload_0         
	//  131  227:iload_2         
	//  132  228:putfield        #115 <Field int _outputTail>
	//  133  231:return          
	}

	private final void _writeStringSegment2(char ac[], int i, int j)
		throws IOException
	{
		if(_outputTail + (j - i) * 6 > _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field int _outputTail>
	//*   2    4:iload_3         
	//*   3    5:iload_2         
	//*   4    6:isub            
	//*   5    7:bipush          6
	//*   6    9:imul            
	//*   7   10:iadd            
	//*   8   11:aload_0         
	//*   9   12:getfield        #88  <Field int _outputEnd>
	//*  10   15:icmple          22
			_flushBuffer();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #124 <Method void _flushBuffer()>
		int k = _outputTail;
	//   13   22:aload_0         
	//   14   23:getfield        #115 <Field int _outputTail>
	//   15   26:istore          4
		byte abyte0[] = _outputBuffer;
	//   16   28:aload_0         
	//   17   29:getfield        #86  <Field byte[] _outputBuffer>
	//   18   32:astore          7
		int ai[] = _outputEscapes;
	//   19   34:aload_0         
	//   20   35:getfield        #183 <Field int[] _outputEscapes>
	//   21   38:astore          8
		int i1 = i;
	//   22   40:iload_2         
	//   23   41:istore          5
		i = k;
	//   24   43:iload           4
	//   25   45:istore_2        
		for(int l = i1; l < j;)
	//*  26   46:iload           5
	//*  27   48:istore          4
	//*  28   50:iload           4
	//*  29   52:iload_3         
	//*  30   53:icmpge          224
		{
			int j1 = l + 1;
	//   31   56:iload           4
	//   32   58:iconst_1        
	//   33   59:iadd            
	//   34   60:istore          5
			int k1 = ((int) (ac[l]));
	//   35   62:aload_1         
	//   36   63:iload           4
	//   37   65:caload          
	//   38   66:istore          6
			if(k1 <= 127)
	//*  39   68:iload           6
	//*  40   70:bipush          127
	//*  41   72:icmpgt          159
			{
				if(ai[k1] == 0)
	//*  42   75:aload           8
	//*  43   77:iload           6
	//*  44   79:iaload          
	//*  45   80:ifne            101
				{
					abyte0[i] = (byte)k1;
	//   46   83:aload           7
	//   47   85:iload_2         
	//   48   86:iload           6
	//   49   88:int2byte        
	//   50   89:bastore         
					i++;
	//   51   90:iload_2         
	//   52   91:iconst_1        
	//   53   92:iadd            
	//   54   93:istore_2        
					l = j1;
	//   55   94:iload           5
	//   56   96:istore          4
				} else
	//*  57   98:goto            50
				{
					l = ai[k1];
	//   58  101:aload           8
	//   59  103:iload           6
	//   60  105:iaload          
	//   61  106:istore          4
					if(l > 0)
	//*  62  108:iload           4
	//*  63  110:ifle            144
					{
						k1 = i + 1;
	//   64  113:iload_2         
	//   65  114:iconst_1        
	//   66  115:iadd            
	//   67  116:istore          6
						abyte0[i] = 92;
	//   68  118:aload           7
	//   69  120:iload_2         
	//   70  121:bipush          92
	//   71  123:bastore         
						i = k1 + 1;
	//   72  124:iload           6
	//   73  126:iconst_1        
	//   74  127:iadd            
	//   75  128:istore_2        
						abyte0[k1] = (byte)l;
	//   76  129:aload           7
	//   77  131:iload           6
	//   78  133:iload           4
	//   79  135:int2byte        
	//   80  136:bastore         
						l = j1;
	//   81  137:iload           5
	//   82  139:istore          4
					} else
	//*  83  141:goto            50
					{
						i = _writeGenericEscape(k1, i);
	//   84  144:aload_0         
	//   85  145:iload           6
	//   86  147:iload_2         
	//   87  148:invokespecial   #230 <Method int _writeGenericEscape(int, int)>
	//   88  151:istore_2        
						l = j1;
	//   89  152:iload           5
	//   90  154:istore          4
					}
				}
			} else
	//*  91  156:goto            50
			{
				if(k1 <= 2047)
	//*  92  159:iload           6
	//*  93  161:sipush          2047
	//*  94  164:icmpgt          213
				{
					l = i + 1;
	//   95  167:iload_2         
	//   96  168:iconst_1        
	//   97  169:iadd            
	//   98  170:istore          4
					abyte0[i] = (byte)(k1 >> 6 | 0xc0);
	//   99  172:aload           7
	//  100  174:iload_2         
	//  101  175:iload           6
	//  102  177:bipush          6
	//  103  179:ishr            
	//  104  180:sipush          192
	//  105  183:ior             
	//  106  184:int2byte        
	//  107  185:bastore         
					abyte0[l] = (byte)(k1 & 0x3f | 0x80);
	//  108  186:aload           7
	//  109  188:iload           4
	//  110  190:iload           6
	//  111  192:bipush          63
	//  112  194:iand            
	//  113  195:sipush          128
	//  114  198:ior             
	//  115  199:int2byte        
	//  116  200:bastore         
					i = l + 1;
	//  117  201:iload           4
	//  118  203:iconst_1        
	//  119  204:iadd            
	//  120  205:istore_2        
				} else
	//* 121  206:iload           5
	//* 122  208:istore          4
	//* 123  210:goto            50
				{
					i = _outputMultiByteChar(k1, i);
	//  124  213:aload_0         
	//  125  214:iload           6
	//  126  216:iload_2         
	//  127  217:invokespecial   #232 <Method int _outputMultiByteChar(int, int)>
	//  128  220:istore_2        
				}
				l = j1;
			}
		}

	//* 129  221:goto            206
		_outputTail = i;
	//  130  224:aload_0         
	//  131  225:iload_2         
	//  132  226:putfield        #115 <Field int _outputTail>
	//  133  229:return          
	}

	private final void _writeStringSegmentASCII2(String s, int i, int j)
		throws IOException
	{
		if(_outputTail + (j - i) * 6 > _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field int _outputTail>
	//*   2    4:iload_3         
	//*   3    5:iload_2         
	//*   4    6:isub            
	//*   5    7:bipush          6
	//*   6    9:imul            
	//*   7   10:iadd            
	//*   8   11:aload_0         
	//*   9   12:getfield        #88  <Field int _outputEnd>
	//*  10   15:icmple          22
			_flushBuffer();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #124 <Method void _flushBuffer()>
		int k = _outputTail;
	//   13   22:aload_0         
	//   14   23:getfield        #115 <Field int _outputTail>
	//   15   26:istore          4
		byte abyte0[] = _outputBuffer;
	//   16   28:aload_0         
	//   17   29:getfield        #86  <Field byte[] _outputBuffer>
	//   18   32:astore          8
		int ai[] = _outputEscapes;
	//   19   34:aload_0         
	//   20   35:getfield        #183 <Field int[] _outputEscapes>
	//   21   38:astore          9
		int i1 = _maximumNonEscapedChar;
	//   22   40:aload_0         
	//   23   41:getfield        #186 <Field int _maximumNonEscapedChar>
	//   24   44:istore          6
		do
		{
			while(i < j) 
	//*  25   46:iload_2         
	//*  26   47:iload_3         
	//*  27   48:icmpge          246
			{
				int l = i + 1;
	//   28   51:iload_2         
	//   29   52:iconst_1        
	//   30   53:iadd            
	//   31   54:istore          5
				int j1 = ((int) (s.charAt(i)));
	//   32   56:aload_1         
	//   33   57:iload_2         
	//   34   58:invokevirtual   #197 <Method char String.charAt(int)>
	//   35   61:istore          7
				if(j1 <= 127)
	//*  36   63:iload           7
	//*  37   65:bipush          127
	//*  38   67:icmpgt          156
				{
					if(ai[j1] == 0)
	//*  39   70:aload           9
	//*  40   72:iload           7
	//*  41   74:iaload          
	//*  42   75:ifne            98
					{
						abyte0[k] = (byte)j1;
	//   43   78:aload           8
	//   44   80:iload           4
	//   45   82:iload           7
	//   46   84:int2byte        
	//   47   85:bastore         
						k++;
	//   48   86:iload           4
	//   49   88:iconst_1        
	//   50   89:iadd            
	//   51   90:istore          4
						i = l;
	//   52   92:iload           5
	//   53   94:istore_2        
					} else
	//*  54   95:goto            46
					{
						i = ai[j1];
	//   55   98:aload           9
	//   56  100:iload           7
	//   57  102:iaload          
	//   58  103:istore_2        
						if(i > 0)
	//*  59  104:iload_2         
	//*  60  105:ifle            140
						{
							j1 = k + 1;
	//   61  108:iload           4
	//   62  110:iconst_1        
	//   63  111:iadd            
	//   64  112:istore          7
							abyte0[k] = 92;
	//   65  114:aload           8
	//   66  116:iload           4
	//   67  118:bipush          92
	//   68  120:bastore         
							k = j1 + 1;
	//   69  121:iload           7
	//   70  123:iconst_1        
	//   71  124:iadd            
	//   72  125:istore          4
							abyte0[j1] = (byte)i;
	//   73  127:aload           8
	//   74  129:iload           7
	//   75  131:iload_2         
	//   76  132:int2byte        
	//   77  133:bastore         
							i = l;
	//   78  134:iload           5
	//   79  136:istore_2        
						} else
	//*  80  137:goto            46
						{
							k = _writeGenericEscape(j1, k);
	//   81  140:aload_0         
	//   82  141:iload           7
	//   83  143:iload           4
	//   84  145:invokespecial   #230 <Method int _writeGenericEscape(int, int)>
	//   85  148:istore          4
							i = l;
	//   86  150:iload           5
	//   87  152:istore_2        
						}
					}
				} else
	//*  88  153:goto            46
				if(j1 > i1)
	//*  89  156:iload           7
	//*  90  158:iload           6
	//*  91  160:icmple          179
				{
					k = _writeGenericEscape(j1, k);
	//   92  163:aload_0         
	//   93  164:iload           7
	//   94  166:iload           4
	//   95  168:invokespecial   #230 <Method int _writeGenericEscape(int, int)>
	//   96  171:istore          4
					i = l;
	//   97  173:iload           5
	//   98  175:istore_2        
				} else
	//*  99  176:goto            46
				{
					if(j1 <= 2047)
	//* 100  179:iload           7
	//* 101  181:sipush          2047
	//* 102  184:icmpgt          234
					{
						i = k + 1;
	//  103  187:iload           4
	//  104  189:iconst_1        
	//  105  190:iadd            
	//  106  191:istore_2        
						abyte0[k] = (byte)(j1 >> 6 | 0xc0);
	//  107  192:aload           8
	//  108  194:iload           4
	//  109  196:iload           7
	//  110  198:bipush          6
	//  111  200:ishr            
	//  112  201:sipush          192
	//  113  204:ior             
	//  114  205:int2byte        
	//  115  206:bastore         
						abyte0[i] = (byte)(j1 & 0x3f | 0x80);
	//  116  207:aload           8
	//  117  209:iload_2         
	//  118  210:iload           7
	//  119  212:bipush          63
	//  120  214:iand            
	//  121  215:sipush          128
	//  122  218:ior             
	//  123  219:int2byte        
	//  124  220:bastore         
						i++;
	//  125  221:iload_2         
	//  126  222:iconst_1        
	//  127  223:iadd            
	//  128  224:istore_2        
					} else
	//* 129  225:iload_2         
	//* 130  226:istore          4
	//* 131  228:iload           5
	//* 132  230:istore_2        
	//* 133  231:goto            46
					{
						i = _outputMultiByteChar(j1, k);
	//  134  234:aload_0         
	//  135  235:iload           7
	//  136  237:iload           4
	//  137  239:invokespecial   #232 <Method int _outputMultiByteChar(int, int)>
	//  138  242:istore_2        
					}
					k = i;
					i = l;
				}
			}
	//* 139  243:goto            225
			_outputTail = k;
	//  140  246:aload_0         
	//  141  247:iload           4
	//  142  249:putfield        #115 <Field int _outputTail>
			return;
	//  143  252:return          
		} while(true);
	}

	private final void _writeStringSegmentASCII2(char ac[], int i, int j)
		throws IOException
	{
		if(_outputTail + (j - i) * 6 > _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field int _outputTail>
	//*   2    4:iload_3         
	//*   3    5:iload_2         
	//*   4    6:isub            
	//*   5    7:bipush          6
	//*   6    9:imul            
	//*   7   10:iadd            
	//*   8   11:aload_0         
	//*   9   12:getfield        #88  <Field int _outputEnd>
	//*  10   15:icmple          22
			_flushBuffer();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #124 <Method void _flushBuffer()>
		int k = _outputTail;
	//   13   22:aload_0         
	//   14   23:getfield        #115 <Field int _outputTail>
	//   15   26:istore          4
		byte abyte0[] = _outputBuffer;
	//   16   28:aload_0         
	//   17   29:getfield        #86  <Field byte[] _outputBuffer>
	//   18   32:astore          8
		int ai[] = _outputEscapes;
	//   19   34:aload_0         
	//   20   35:getfield        #183 <Field int[] _outputEscapes>
	//   21   38:astore          9
		int i1 = _maximumNonEscapedChar;
	//   22   40:aload_0         
	//   23   41:getfield        #186 <Field int _maximumNonEscapedChar>
	//   24   44:istore          6
		do
		{
			while(i < j) 
	//*  25   46:iload_2         
	//*  26   47:iload_3         
	//*  27   48:icmpge          244
			{
				int l = i + 1;
	//   28   51:iload_2         
	//   29   52:iconst_1        
	//   30   53:iadd            
	//   31   54:istore          5
				int j1 = ((int) (ac[i]));
	//   32   56:aload_1         
	//   33   57:iload_2         
	//   34   58:caload          
	//   35   59:istore          7
				if(j1 <= 127)
	//*  36   61:iload           7
	//*  37   63:bipush          127
	//*  38   65:icmpgt          154
				{
					if(ai[j1] == 0)
	//*  39   68:aload           9
	//*  40   70:iload           7
	//*  41   72:iaload          
	//*  42   73:ifne            96
					{
						abyte0[k] = (byte)j1;
	//   43   76:aload           8
	//   44   78:iload           4
	//   45   80:iload           7
	//   46   82:int2byte        
	//   47   83:bastore         
						k++;
	//   48   84:iload           4
	//   49   86:iconst_1        
	//   50   87:iadd            
	//   51   88:istore          4
						i = l;
	//   52   90:iload           5
	//   53   92:istore_2        
					} else
	//*  54   93:goto            46
					{
						i = ai[j1];
	//   55   96:aload           9
	//   56   98:iload           7
	//   57  100:iaload          
	//   58  101:istore_2        
						if(i > 0)
	//*  59  102:iload_2         
	//*  60  103:ifle            138
						{
							j1 = k + 1;
	//   61  106:iload           4
	//   62  108:iconst_1        
	//   63  109:iadd            
	//   64  110:istore          7
							abyte0[k] = 92;
	//   65  112:aload           8
	//   66  114:iload           4
	//   67  116:bipush          92
	//   68  118:bastore         
							k = j1 + 1;
	//   69  119:iload           7
	//   70  121:iconst_1        
	//   71  122:iadd            
	//   72  123:istore          4
							abyte0[j1] = (byte)i;
	//   73  125:aload           8
	//   74  127:iload           7
	//   75  129:iload_2         
	//   76  130:int2byte        
	//   77  131:bastore         
							i = l;
	//   78  132:iload           5
	//   79  134:istore_2        
						} else
	//*  80  135:goto            46
						{
							k = _writeGenericEscape(j1, k);
	//   81  138:aload_0         
	//   82  139:iload           7
	//   83  141:iload           4
	//   84  143:invokespecial   #230 <Method int _writeGenericEscape(int, int)>
	//   85  146:istore          4
							i = l;
	//   86  148:iload           5
	//   87  150:istore_2        
						}
					}
				} else
	//*  88  151:goto            46
				if(j1 > i1)
	//*  89  154:iload           7
	//*  90  156:iload           6
	//*  91  158:icmple          177
				{
					k = _writeGenericEscape(j1, k);
	//   92  161:aload_0         
	//   93  162:iload           7
	//   94  164:iload           4
	//   95  166:invokespecial   #230 <Method int _writeGenericEscape(int, int)>
	//   96  169:istore          4
					i = l;
	//   97  171:iload           5
	//   98  173:istore_2        
				} else
	//*  99  174:goto            46
				{
					if(j1 <= 2047)
	//* 100  177:iload           7
	//* 101  179:sipush          2047
	//* 102  182:icmpgt          232
					{
						i = k + 1;
	//  103  185:iload           4
	//  104  187:iconst_1        
	//  105  188:iadd            
	//  106  189:istore_2        
						abyte0[k] = (byte)(j1 >> 6 | 0xc0);
	//  107  190:aload           8
	//  108  192:iload           4
	//  109  194:iload           7
	//  110  196:bipush          6
	//  111  198:ishr            
	//  112  199:sipush          192
	//  113  202:ior             
	//  114  203:int2byte        
	//  115  204:bastore         
						abyte0[i] = (byte)(j1 & 0x3f | 0x80);
	//  116  205:aload           8
	//  117  207:iload_2         
	//  118  208:iload           7
	//  119  210:bipush          63
	//  120  212:iand            
	//  121  213:sipush          128
	//  122  216:ior             
	//  123  217:int2byte        
	//  124  218:bastore         
						i++;
	//  125  219:iload_2         
	//  126  220:iconst_1        
	//  127  221:iadd            
	//  128  222:istore_2        
					} else
	//* 129  223:iload_2         
	//* 130  224:istore          4
	//* 131  226:iload           5
	//* 132  228:istore_2        
	//* 133  229:goto            46
					{
						i = _outputMultiByteChar(j1, k);
	//  134  232:aload_0         
	//  135  233:iload           7
	//  136  235:iload           4
	//  137  237:invokespecial   #232 <Method int _outputMultiByteChar(int, int)>
	//  138  240:istore_2        
					}
					k = i;
					i = l;
				}
			}
	//* 139  241:goto            223
			_outputTail = k;
	//  140  244:aload_0         
	//  141  245:iload           4
	//  142  247:putfield        #115 <Field int _outputTail>
			return;
	//  143  250:return          
		} while(true);
	}

	private final void _writeStringSegments(String s, int i, int j)
		throws IOException
	{
		int k;
		do
		{
			k = Math.min(_outputMaxContiguous, j);
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field int _outputMaxContiguous>
	//    2    4:iload_3         
	//    3    5:invokestatic    #160 <Method int Math.min(int, int)>
	//    4    8:istore          4
			if(_outputTail + k > _outputEnd)
	//*   5   10:aload_0         
	//*   6   11:getfield        #115 <Field int _outputTail>
	//*   7   14:iload           4
	//*   8   16:iadd            
	//*   9   17:aload_0         
	//*  10   18:getfield        #88  <Field int _outputEnd>
	//*  11   21:icmple          28
				_flushBuffer();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #124 <Method void _flushBuffer()>
			_writeStringSegment(s, i, k);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:iload_2         
	//   17   31:iload           4
	//   18   33:invokespecial   #275 <Method void _writeStringSegment(String, int, int)>
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
	//*   1    1:ifeq            43
		{
			if(_outputTail >= _outputEnd)
	//*   2    4:aload_0         
	//*   3    5:getfield        #115 <Field int _outputTail>
	//*   4    8:aload_0         
	//*   5    9:getfield        #88  <Field int _outputEnd>
	//*   6   12:icmplt          19
				_flushBuffer();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #124 <Method void _flushBuffer()>
			byte abyte0[] = _outputBuffer;
	//    9   19:aload_0         
	//   10   20:getfield        #86  <Field byte[] _outputBuffer>
	//   11   23:astore          6
			int i = _outputTail;
	//   12   25:aload_0         
	//   13   26:getfield        #115 <Field int _outputTail>
	//   14   29:istore_3        
			_outputTail = i + 1;
	//   15   30:aload_0         
	//   16   31:iload_3         
	//   17   32:iconst_1        
	//   18   33:iadd            
	//   19   34:putfield        #115 <Field int _outputTail>
			abyte0[i] = 34;
	//   20   37:aload           6
	//   21   39:iload_3         
	//   22   40:bipush          34
	//   23   42:bastore         
		}
		int j = s.length();
	//   24   43:aload_1         
	//   25   44:invokevirtual   #280 <Method int String.length()>
	//   26   47:istore_3        
		int l = 0;
	//   27   48:iconst_0        
	//   28   49:istore          4
		int i1;
		for(; j > 0; j -= i1)
	//*  29   51:iload_3         
	//*  30   52:ifle            107
		{
			i1 = Math.min(_outputMaxContiguous, j);
	//   31   55:aload_0         
	//   32   56:getfield        #90  <Field int _outputMaxContiguous>
	//   33   59:iload_3         
	//   34   60:invokestatic    #160 <Method int Math.min(int, int)>
	//   35   63:istore          5
			if(_outputTail + i1 > _outputEnd)
	//*  36   65:aload_0         
	//*  37   66:getfield        #115 <Field int _outputTail>
	//*  38   69:iload           5
	//*  39   71:iadd            
	//*  40   72:aload_0         
	//*  41   73:getfield        #88  <Field int _outputEnd>
	//*  42   76:icmple          83
				_flushBuffer();
	//   43   79:aload_0         
	//   44   80:invokevirtual   #124 <Method void _flushBuffer()>
			_writeStringSegment(s, l, i1);
	//   45   83:aload_0         
	//   46   84:aload_1         
	//   47   85:iload           4
	//   48   87:iload           5
	//   49   89:invokespecial   #275 <Method void _writeStringSegment(String, int, int)>
			l += i1;
	//   50   92:iload           4
	//   51   94:iload           5
	//   52   96:iadd            
	//   53   97:istore          4
		}

	//   54   99:iload_3         
	//   55  100:iload           5
	//   56  102:isub            
	//   57  103:istore_3        
	//*  58  104:goto            51
		if(flag)
	//*  59  107:iload_2         
	//*  60  108:ifeq            148
		{
			if(_outputTail >= _outputEnd)
	//*  61  111:aload_0         
	//*  62  112:getfield        #115 <Field int _outputTail>
	//*  63  115:aload_0         
	//*  64  116:getfield        #88  <Field int _outputEnd>
	//*  65  119:icmplt          126
				_flushBuffer();
	//   66  122:aload_0         
	//   67  123:invokevirtual   #124 <Method void _flushBuffer()>
			s = ((String) (_outputBuffer));
	//   68  126:aload_0         
	//   69  127:getfield        #86  <Field byte[] _outputBuffer>
	//   70  130:astore_1        
			int k = _outputTail;
	//   71  131:aload_0         
	//   72  132:getfield        #115 <Field int _outputTail>
	//   73  135:istore_3        
			_outputTail = k + 1;
	//   74  136:aload_0         
	//   75  137:iload_3         
	//   76  138:iconst_1        
	//   77  139:iadd            
	//   78  140:putfield        #115 <Field int _outputTail>
			s[k] = 34;
	//   79  143:aload_1         
	//   80  144:iload_3         
	//   81  145:bipush          34
	//   82  147:bastore         
		}
	//   83  148:return          
	}

	private final void _writeStringSegments(char ac[], int i, int j)
		throws IOException
	{
		int k;
		do
		{
			k = Math.min(_outputMaxContiguous, j);
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field int _outputMaxContiguous>
	//    2    4:iload_3         
	//    3    5:invokestatic    #160 <Method int Math.min(int, int)>
	//    4    8:istore          4
			if(_outputTail + k > _outputEnd)
	//*   5   10:aload_0         
	//*   6   11:getfield        #115 <Field int _outputTail>
	//*   7   14:iload           4
	//*   8   16:iadd            
	//*   9   17:aload_0         
	//*  10   18:getfield        #88  <Field int _outputEnd>
	//*  11   21:icmple          28
				_flushBuffer();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #124 <Method void _flushBuffer()>
			_writeStringSegment(ac, i, k);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:iload_2         
	//   17   31:iload           4
	//   18   33:invokespecial   #282 <Method void _writeStringSegment(char[], int, int)>
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
	//    1    1:getfield        #183 <Field int[] _outputEscapes>
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
	//   24   40:invokespecial   #286 <Method void _writeUTF8Segment2(byte[], int, int)>
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
	//*  32   54:getfield        #115 <Field int _outputTail>
	//*  33   57:iload_3         
	//*  34   58:iadd            
	//*  35   59:aload_0         
	//*  36   60:getfield        #88  <Field int _outputEnd>
	//*  37   63:icmple          70
			_flushBuffer();
	//   38   66:aload_0         
	//   39   67:invokevirtual   #124 <Method void _flushBuffer()>
		System.arraycopy(((Object) (abyte0)), i, ((Object) (_outputBuffer)), _outputTail, j);
	//   40   70:aload_1         
	//   41   71:iload_2         
	//   42   72:aload_0         
	//   43   73:getfield        #86  <Field byte[] _outputBuffer>
	//   44   76:aload_0         
	//   45   77:getfield        #115 <Field int _outputTail>
	//   46   80:iload_3         
	//   47   81:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
		_outputTail = _outputTail + j;
	//   48   84:aload_0         
	//   49   85:aload_0         
	//   50   86:getfield        #115 <Field int _outputTail>
	//   51   89:iload_3         
	//   52   90:iadd            
	//   53   91:putfield        #115 <Field int _outputTail>
	//   54   94:return          
	}

	private final void _writeUTF8Segment2(byte abyte0[], int i, int j)
		throws IOException, JsonGenerationException
	{
		int l = _outputTail;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field int _outputTail>
	//    2    4:istore          6
		int k = l;
	//    3    6:iload           6
	//    4    8:istore          5
		if(j * 6 + l > _outputEnd)
	//*   5   10:iload_3         
	//*   6   11:bipush          6
	//*   7   13:imul            
	//*   8   14:iload           6
	//*   9   16:iadd            
	//*  10   17:aload_0         
	//*  11   18:getfield        #88  <Field int _outputEnd>
	//*  12   21:icmple          34
		{
			_flushBuffer();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #124 <Method void _flushBuffer()>
			k = _outputTail;
	//   15   28:aload_0         
	//   16   29:getfield        #115 <Field int _outputTail>
	//   17   32:istore          5
		}
		byte abyte1[] = _outputBuffer;
	//   18   34:aload_0         
	//   19   35:getfield        #86  <Field byte[] _outputBuffer>
	//   20   38:astore          9
		int ai[] = _outputEscapes;
	//   21   40:aload_0         
	//   22   41:getfield        #183 <Field int[] _outputEscapes>
	//   23   44:astore          10
		for(int i1 = i; i1 < j + i;)
	//*  24   46:iload_2         
	//*  25   47:istore          6
	//*  26   49:iload           6
	//*  27   51:iload_3         
	//*  28   52:iload_2         
	//*  29   53:iadd            
	//*  30   54:icmpge          161
		{
			int j1 = i1 + 1;
	//   31   57:iload           6
	//   32   59:iconst_1        
	//   33   60:iadd            
	//   34   61:istore          7
			byte byte0 = abyte0[i1];
	//   35   63:aload_1         
	//   36   64:iload           6
	//   37   66:baload          
	//   38   67:istore          4
			if(byte0 < 0 || ai[byte0] == 0)
	//*  39   69:iload           4
	//*  40   71:iflt            82
	//*  41   74:aload           10
	//*  42   76:iload           4
	//*  43   78:iaload          
	//*  44   79:ifne            102
			{
				abyte1[k] = byte0;
	//   45   82:aload           9
	//   46   84:iload           5
	//   47   86:iload           4
	//   48   88:bastore         
				k++;
	//   49   89:iload           5
	//   50   91:iconst_1        
	//   51   92:iadd            
	//   52   93:istore          5
				i1 = j1;
	//   53   95:iload           7
	//   54   97:istore          6
			} else
	//*  55   99:goto            49
			{
				i1 = ai[byte0];
	//   56  102:aload           10
	//   57  104:iload           4
	//   58  106:iaload          
	//   59  107:istore          6
				if(i1 > 0)
	//*  60  109:iload           6
	//*  61  111:ifle            148
				{
					int k1 = k + 1;
	//   62  114:iload           5
	//   63  116:iconst_1        
	//   64  117:iadd            
	//   65  118:istore          8
					abyte1[k] = 92;
	//   66  120:aload           9
	//   67  122:iload           5
	//   68  124:bipush          92
	//   69  126:bastore         
					abyte1[k1] = (byte)i1;
	//   70  127:aload           9
	//   71  129:iload           8
	//   72  131:iload           6
	//   73  133:int2byte        
	//   74  134:bastore         
					k = k1 + 1;
	//   75  135:iload           8
	//   76  137:iconst_1        
	//   77  138:iadd            
	//   78  139:istore          5
				} else
	//*  79  141:iload           7
	//*  80  143:istore          6
	//*  81  145:goto            49
				{
					k = _writeGenericEscape(((int) (byte0)), k);
	//   82  148:aload_0         
	//   83  149:iload           4
	//   84  151:iload           5
	//   85  153:invokespecial   #230 <Method int _writeGenericEscape(int, int)>
	//   86  156:istore          5
				}
				i1 = j1;
			}
		}

	//*  87  158:goto            141
		_outputTail = k;
	//   88  161:aload_0         
	//   89  162:iload           5
	//   90  164:putfield        #115 <Field int _outputTail>
	//   91  167:return          
	}

	private final void _writeUTF8Segments(byte abyte0[], int i, int j)
		throws IOException, JsonGenerationException
	{
		int k;
		do
		{
			k = Math.min(_outputMaxContiguous, j);
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field int _outputMaxContiguous>
	//    2    4:iload_3         
	//    3    5:invokestatic    #160 <Method int Math.min(int, int)>
	//    4    8:istore          4
			_writeUTF8Segment(abyte0, i, k);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:iload_2         
	//    8   13:iload           4
	//    9   15:invokespecial   #289 <Method void _writeUTF8Segment(byte[], int, int)>
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
	//    2    2:getfield        #86  <Field byte[] _outputBuffer>
	//    3    5:aload_0         
	//    4    6:getfield        #115 <Field int _outputTail>
	//    5    9:invokeinterface #295 <Method int SerializableString.appendQuotedUTF8(byte[], int)>
	//    6   14:istore_2        
		if(i < 0)
	//*   7   15:iload_2         
	//*   8   16:ifge            30
		{
			_writeBytes(serializablestring.asQuotedUTF8());
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokeinterface #298 <Method byte[] SerializableString.asQuotedUTF8()>
	//   12   26:invokespecial   #300 <Method void _writeBytes(byte[])>
			return;
	//   13   29:return          
		} else
		{
			_outputTail = _outputTail + i;
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #115 <Field int _outputTail>
	//   17   35:iload_2         
	//   18   36:iadd            
	//   19   37:putfield        #115 <Field int _outputTail>
			return;
	//   20   40:return          
		}
	}

	protected final void _flushBuffer()
		throws IOException
	{
		int i = _outputTail;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field int _outputTail>
	//    2    4:istore_1        
		if(i > 0)
	//*   3    5:iload_1         
	//*   4    6:ifle            27
		{
			_outputTail = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #115 <Field int _outputTail>
			_outputStream.write(_outputBuffer, 0, i);
	//    8   14:aload_0         
	//    9   15:getfield        #77  <Field OutputStream _outputStream>
	//   10   18:aload_0         
	//   11   19:getfield        #86  <Field byte[] _outputBuffer>
	//   12   22:iconst_0        
	//   13   23:iload_1         
	//   14   24:invokevirtual   #130 <Method void OutputStream.write(byte[], int, int)>
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
	//    3    3:invokevirtual   #303 <Method int _decodeSurrogate(int, int)>
	//    4    6:istore_1        
		if(_outputTail + 4 > _outputEnd)
	//*   5    7:aload_0         
	//*   6    8:getfield        #115 <Field int _outputTail>
	//*   7   11:iconst_4        
	//*   8   12:iadd            
	//*   9   13:aload_0         
	//*  10   14:getfield        #88  <Field int _outputEnd>
	//*  11   17:icmple          24
			_flushBuffer();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #124 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//   14   24:aload_0         
	//   15   25:getfield        #86  <Field byte[] _outputBuffer>
	//   16   28:astore_3        
		j = _outputTail;
	//   17   29:aload_0         
	//   18   30:getfield        #115 <Field int _outputTail>
	//   19   33:istore_2        
		_outputTail = j + 1;
	//   20   34:aload_0         
	//   21   35:iload_2         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:putfield        #115 <Field int _outputTail>
		abyte0[j] = (byte)(i >> 18 | 0xf0);
	//   25   41:aload_3         
	//   26   42:iload_2         
	//   27   43:iload_1         
	//   28   44:bipush          18
	//   29   46:ishr            
	//   30   47:sipush          240
	//   31   50:ior             
	//   32   51:int2byte        
	//   33   52:bastore         
		j = _outputTail;
	//   34   53:aload_0         
	//   35   54:getfield        #115 <Field int _outputTail>
	//   36   57:istore_2        
		_outputTail = j + 1;
	//   37   58:aload_0         
	//   38   59:iload_2         
	//   39   60:iconst_1        
	//   40   61:iadd            
	//   41   62:putfield        #115 <Field int _outputTail>
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
	//   54   81:getfield        #115 <Field int _outputTail>
	//   55   84:istore_2        
		_outputTail = j + 1;
	//   56   85:aload_0         
	//   57   86:iload_2         
	//   58   87:iconst_1        
	//   59   88:iadd            
	//   60   89:putfield        #115 <Field int _outputTail>
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
	//   73  108:getfield        #115 <Field int _outputTail>
	//   74  111:istore_2        
		_outputTail = j + 1;
	//   75  112:aload_0         
	//   76  113:iload_2         
	//   77  114:iconst_1        
	//   78  115:iadd            
	//   79  116:putfield        #115 <Field int _outputTail>
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
	//    1    1:getfield        #86  <Field byte[] _outputBuffer>
	//    2    4:astore_1        
		if(ac != null && _bufferRecyclable)
	//*   3    5:aload_1         
	//*   4    6:ifnull          29
	//*   5    9:aload_0         
	//*   6   10:getfield        #79  <Field boolean _bufferRecyclable>
	//*   7   13:ifeq            29
		{
			_outputBuffer = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #86  <Field byte[] _outputBuffer>
			_ioContext.releaseWriteEncodingBuffer(((byte []) (ac)));
	//   11   21:aload_0         
	//   12   22:getfield        #308 <Field IOContext _ioContext>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #311 <Method void IOContext.releaseWriteEncodingBuffer(byte[])>
		}
		ac = _charBuffer;
	//   15   29:aload_0         
	//   16   30:getfield        #96  <Field char[] _charBuffer>
	//   17   33:astore_1        
		if(ac != null)
	//*  18   34:aload_1         
	//*  19   35:ifnull          51
		{
			_charBuffer = null;
	//   20   38:aload_0         
	//   21   39:aconst_null     
	//   22   40:putfield        #96  <Field char[] _charBuffer>
			_ioContext.releaseConcatBuffer(ac);
	//   23   43:aload_0         
	//   24   44:getfield        #308 <Field IOContext _ioContext>
	//   25   47:aload_1         
	//   26   48:invokevirtual   #315 <Method void IOContext.releaseConcatBuffer(char[])>
		}
	//   27   51:return          
	}

	protected final void _verifyPrettyValueWrite(String s, int i)
		throws IOException
	{
		i;
	//    0    0:iload_2         
		JVM INSTR tableswitch 0 3: default 32
	//	               0 70
	//	               1 37
	//	               2 48
	//	               3 59;
	//    1    1:tableswitch     0 3: default 32
	//	               0 70
	//	               1 37
	//	               2 48
	//	               3 59
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		_throwInternal();
	//    2   32:aload_0         
	//    3   33:invokevirtual   #320 <Method void _throwInternal()>
_L7:
		return;
	//    4   36:return          
_L3:
		_cfgPrettyPrinter.writeArrayValueSeparator(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//    5   37:aload_0         
	//    6   38:getfield        #324 <Field PrettyPrinter _cfgPrettyPrinter>
	//    7   41:aload_0         
	//    8   42:invokeinterface #330 <Method void PrettyPrinter.writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)>
		return;
	//    9   47:return          
_L4:
		_cfgPrettyPrinter.writeObjectFieldValueSeparator(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   10   48:aload_0         
	//   11   49:getfield        #324 <Field PrettyPrinter _cfgPrettyPrinter>
	//   12   52:aload_0         
	//   13   53:invokeinterface #333 <Method void PrettyPrinter.writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)>
		return;
	//   14   58:return          
_L5:
		_cfgPrettyPrinter.writeRootValueSeparator(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   15   59:aload_0         
	//   16   60:getfield        #324 <Field PrettyPrinter _cfgPrettyPrinter>
	//   17   63:aload_0         
	//   18   64:invokeinterface #336 <Method void PrettyPrinter.writeRootValueSeparator(com.fasterxml.jackson.core.JsonGenerator)>
		return;
	//   19   69:return          
_L2:
		if(_writeContext.inArray())
	//*  20   70:aload_0         
	//*  21   71:getfield        #340 <Field JsonWriteContext _writeContext>
	//*  22   74:invokevirtual   #346 <Method boolean JsonWriteContext.inArray()>
	//*  23   77:ifeq            91
		{
			_cfgPrettyPrinter.beforeArrayValues(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   24   80:aload_0         
	//   25   81:getfield        #324 <Field PrettyPrinter _cfgPrettyPrinter>
	//   26   84:aload_0         
	//   27   85:invokeinterface #349 <Method void PrettyPrinter.beforeArrayValues(com.fasterxml.jackson.core.JsonGenerator)>
			return;
	//   28   90:return          
		}
		if(_writeContext.inObject())
	//*  29   91:aload_0         
	//*  30   92:getfield        #340 <Field JsonWriteContext _writeContext>
	//*  31   95:invokevirtual   #352 <Method boolean JsonWriteContext.inObject()>
	//*  32   98:ifeq            36
		{
			_cfgPrettyPrinter.beforeObjectEntries(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   33  101:aload_0         
	//   34  102:getfield        #324 <Field PrettyPrinter _cfgPrettyPrinter>
	//   35  105:aload_0         
	//   36  106:invokeinterface #355 <Method void PrettyPrinter.beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)>
			return;
	//   37  111:return          
		}
		if(true) goto _L7; else goto _L6
_L6:
	}

	protected final void _verifyValueWrite(String s)
		throws IOException
	{
		int i;
		i = _writeContext.writeValue();
	//    0    0:aload_0         
	//    1    1:getfield        #340 <Field JsonWriteContext _writeContext>
	//    2    4:invokevirtual   #359 <Method int JsonWriteContext.writeValue()>
	//    3    7:istore_3        
		if(i == 5)
	//*   4    8:iload_3         
	//*   5    9:iconst_5        
	//*   6   10:icmpne          43
			_reportError((new StringBuilder()).append("Can not ").append(s).append(", expecting field name").toString());
	//    7   13:aload_0         
	//    8   14:new             #205 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #207 <Method void StringBuilder()>
	//   11   21:ldc2            #361 <String "Can not ">
	//   12   24:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:ldc2            #363 <String ", expecting field name">
	//   16   34:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:invokevirtual   #225 <Method String StringBuilder.toString()>
	//   18   40:invokevirtual   #149 <Method void _reportError(String)>
		if(_cfgPrettyPrinter != null) goto _L2; else goto _L1
	//   19   43:aload_0         
	//   20   44:getfield        #324 <Field PrettyPrinter _cfgPrettyPrinter>
	//   21   47:ifnonnull       150
_L1:
		i;
	//   22   50:iload_3         
		JVM INSTR tableswitch 1 3: default 76
	//	               1 77
	//	               2 116
	//	               3 122;
	//   23   51:tableswitch     1 3: default 76
	//	               1 77
	//	               2 116
	//	               3 122
		   goto _L3 _L4 _L5 _L6
_L3:
		return;
	//   24   76:return          
_L4:
		byte byte0 = 44;
	//   25   77:bipush          44
	//   26   79:istore_2        
_L7:
		if(_outputTail >= _outputEnd)
	//*  27   80:aload_0         
	//*  28   81:getfield        #115 <Field int _outputTail>
	//*  29   84:aload_0         
	//*  30   85:getfield        #88  <Field int _outputEnd>
	//*  31   88:icmplt          95
			_flushBuffer();
	//   32   91:aload_0         
	//   33   92:invokevirtual   #124 <Method void _flushBuffer()>
		_outputBuffer[_outputTail] = byte0;
	//   34   95:aload_0         
	//   35   96:getfield        #86  <Field byte[] _outputBuffer>
	//   36   99:aload_0         
	//   37  100:getfield        #115 <Field int _outputTail>
	//   38  103:iload_2         
	//   39  104:bastore         
		_outputTail = _outputTail + 1;
	//   40  105:aload_0         
	//   41  106:aload_0         
	//   42  107:getfield        #115 <Field int _outputTail>
	//   43  110:iconst_1        
	//   44  111:iadd            
	//   45  112:putfield        #115 <Field int _outputTail>
		return;
	//   46  115:return          
_L5:
		byte0 = 58;
	//   47  116:bipush          58
	//   48  118:istore_2        
		  goto _L7
	//*  49  119:goto            80
_L6:
		if(_rootValueSeparator == null) goto _L3; else goto _L8
	//   50  122:aload_0         
	//   51  123:getfield        #367 <Field SerializableString _rootValueSeparator>
	//   52  126:ifnull          76
_L8:
		s = ((String) (_rootValueSeparator.asUnquotedUTF8()));
	//   53  129:aload_0         
	//   54  130:getfield        #367 <Field SerializableString _rootValueSeparator>
	//   55  133:invokeinterface #175 <Method byte[] SerializableString.asUnquotedUTF8()>
	//   56  138:astore_1        
		if(s.length <= 0) goto _L3; else goto _L9
	//   57  139:aload_1         
	//   58  140:arraylength     
	//   59  141:ifle            76
_L9:
		_writeBytes(((byte []) (s)));
	//   60  144:aload_0         
	//   61  145:aload_1         
	//   62  146:invokespecial   #300 <Method void _writeBytes(byte[])>
		return;
	//   63  149:return          
_L2:
		_verifyPrettyValueWrite(s, i);
	//   64  150:aload_0         
	//   65  151:aload_1         
	//   66  152:iload_3         
	//   67  153:invokevirtual   #369 <Method void _verifyPrettyValueWrite(String, int)>
		return;
	//   68  156:return          
	}

	protected final int _writeBinary(Base64Variant base64variant, InputStream inputstream, byte abyte0[])
		throws IOException, JsonGenerationException
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		int k1 = 0;
	//    2    3:iconst_0        
	//    3    4:istore          10
		int j1 = -3;
	//    4    6:bipush          -3
	//    5    8:istore          9
		int i = 0;
	//    6   10:iconst_0        
	//    7   11:istore          4
		int i2 = _outputEnd - 6;
	//    8   13:aload_0         
	//    9   14:getfield        #88  <Field int _outputEnd>
	//   10   17:bipush          6
	//   11   19:isub            
	//   12   20:istore          12
		int k = base64variant.getMaxLineLength() >> 2;
	//   13   22:aload_1         
	//   14   23:invokevirtual   #376 <Method int Base64Variant.getMaxLineLength()>
	//   15   26:iconst_2        
	//   16   27:ishr            
	//   17   28:istore          6
		do
		{
			int l1 = j;
	//   18   30:iload           5
	//   19   32:istore          11
			int i1 = k1;
	//   20   34:iload           10
	//   21   36:istore          8
			int l = j1;
	//   22   38:iload           9
	//   23   40:istore          7
			if(j > j1)
	//*  24   42:iload           5
	//*  25   44:iload           9
	//*  26   46:icmple          180
			{
				i1 = _readMore(inputstream, abyte0, j, k1, abyte0.length);
	//   27   49:aload_0         
	//   28   50:aload_2         
	//   29   51:aload_3         
	//   30   52:iload           5
	//   31   54:iload           10
	//   32   56:aload_3         
	//   33   57:arraylength     
	//   34   58:invokespecial   #378 <Method int _readMore(InputStream, byte[], int, int, int)>
	//   35   61:istore          8
				l1 = 0;
	//   36   63:iconst_0        
	//   37   64:istore          11
				if(i1 < 3)
	//*  38   66:iload           8
	//*  39   68:iconst_3        
	//*  40   69:icmpge          174
				{
					j = i;
	//   41   72:iload           4
	//   42   74:istore          5
					if(i1 < 0)
	//*  43   76:iload           8
	//*  44   78:ifge            171
					{
						if(_outputTail > i2)
	//*  45   81:aload_0         
	//*  46   82:getfield        #115 <Field int _outputTail>
	//*  47   85:iload           12
	//*  48   87:icmple          94
							_flushBuffer();
	//   49   90:aload_0         
	//   50   91:invokevirtual   #124 <Method void _flushBuffer()>
						j1 = 0 + 1;
	//   51   94:iconst_0        
	//   52   95:iconst_1        
	//   53   96:iadd            
	//   54   97:istore          9
						l = abyte0[0] << 16;
	//   55   99:aload_3         
	//   56  100:iconst_0        
	//   57  101:baload          
	//   58  102:bipush          16
	//   59  104:ishl            
	//   60  105:istore          7
						k = 1;
	//   61  107:iconst_1        
	//   62  108:istore          6
						j = l;
	//   63  110:iload           7
	//   64  112:istore          5
						if(j1 < i1)
	//*  65  114:iload           9
	//*  66  116:iload           8
	//*  67  118:icmpge          140
						{
							j = l | (abyte0[j1] & 0xff) << 8;
	//   68  121:iload           7
	//   69  123:aload_3         
	//   70  124:iload           9
	//   71  126:baload          
	//   72  127:sipush          255
	//   73  130:iand            
	//   74  131:bipush          8
	//   75  133:ishl            
	//   76  134:ior             
	//   77  135:istore          5
							k = 2;
	//   78  137:iconst_2        
	//   79  138:istore          6
						}
						i += k;
	//   80  140:iload           4
	//   81  142:iload           6
	//   82  144:iadd            
	//   83  145:istore          4
						_outputTail = base64variant.encodeBase64Partial(j, k, _outputBuffer, _outputTail);
	//   84  147:aload_0         
	//   85  148:aload_1         
	//   86  149:iload           5
	//   87  151:iload           6
	//   88  153:aload_0         
	//   89  154:getfield        #86  <Field byte[] _outputBuffer>
	//   90  157:aload_0         
	//   91  158:getfield        #115 <Field int _outputTail>
	//   92  161:invokevirtual   #382 <Method int Base64Variant.encodeBase64Partial(int, int, byte[], int)>
	//   93  164:putfield        #115 <Field int _outputTail>
						j = i;
	//   94  167:iload           4
	//   95  169:istore          5
					}
					return j;
	//   96  171:iload           5
	//   97  173:ireturn         
				}
				l = i1 - 3;
	//   98  174:iload           8
	//   99  176:iconst_3        
	//  100  177:isub            
	//  101  178:istore          7
			}
			if(_outputTail > i2)
	//* 102  180:aload_0         
	//* 103  181:getfield        #115 <Field int _outputTail>
	//* 104  184:iload           12
	//* 105  186:icmple          193
				_flushBuffer();
	//  106  189:aload_0         
	//  107  190:invokevirtual   #124 <Method void _flushBuffer()>
			k1 = l1 + 1;
	//  108  193:iload           11
	//  109  195:iconst_1        
	//  110  196:iadd            
	//  111  197:istore          10
			j = ((int) (abyte0[l1]));
	//  112  199:aload_3         
	//  113  200:iload           11
	//  114  202:baload          
	//  115  203:istore          5
			j1 = k1 + 1;
	//  116  205:iload           10
	//  117  207:iconst_1        
	//  118  208:iadd            
	//  119  209:istore          9
			k1 = ((int) (abyte0[k1]));
	//  120  211:aload_3         
	//  121  212:iload           10
	//  122  214:baload          
	//  123  215:istore          10
			l1 = ((int) (abyte0[j1]));
	//  124  217:aload_3         
	//  125  218:iload           9
	//  126  220:baload          
	//  127  221:istore          11
			i += 3;
	//  128  223:iload           4
	//  129  225:iconst_3        
	//  130  226:iadd            
	//  131  227:istore          4
			_outputTail = base64variant.encodeBase64Chunk((j << 8 | k1 & 0xff) << 8 | l1 & 0xff, _outputBuffer, _outputTail);
	//  132  229:aload_0         
	//  133  230:aload_1         
	//  134  231:iload           5
	//  135  233:bipush          8
	//  136  235:ishl            
	//  137  236:iload           10
	//  138  238:sipush          255
	//  139  241:iand            
	//  140  242:ior             
	//  141  243:bipush          8
	//  142  245:ishl            
	//  143  246:iload           11
	//  144  248:sipush          255
	//  145  251:iand            
	//  146  252:ior             
	//  147  253:aload_0         
	//  148  254:getfield        #86  <Field byte[] _outputBuffer>
	//  149  257:aload_0         
	//  150  258:getfield        #115 <Field int _outputTail>
	//  151  261:invokevirtual   #385 <Method int Base64Variant.encodeBase64Chunk(int, byte[], int)>
	//  152  264:putfield        #115 <Field int _outputTail>
			j = k - 1;
	//  153  267:iload           6
	//  154  269:iconst_1        
	//  155  270:isub            
	//  156  271:istore          5
			k = j;
	//  157  273:iload           5
	//  158  275:istore          6
			if(j <= 0)
	//* 159  277:iload           5
	//* 160  279:ifgt            344
			{
				byte abyte1[] = _outputBuffer;
	//  161  282:aload_0         
	//  162  283:getfield        #86  <Field byte[] _outputBuffer>
	//  163  286:astore          13
				j = _outputTail;
	//  164  288:aload_0         
	//  165  289:getfield        #115 <Field int _outputTail>
	//  166  292:istore          5
				_outputTail = j + 1;
	//  167  294:aload_0         
	//  168  295:iload           5
	//  169  297:iconst_1        
	//  170  298:iadd            
	//  171  299:putfield        #115 <Field int _outputTail>
				abyte1[j] = 92;
	//  172  302:aload           13
	//  173  304:iload           5
	//  174  306:bipush          92
	//  175  308:bastore         
				abyte1 = _outputBuffer;
	//  176  309:aload_0         
	//  177  310:getfield        #86  <Field byte[] _outputBuffer>
	//  178  313:astore          13
				j = _outputTail;
	//  179  315:aload_0         
	//  180  316:getfield        #115 <Field int _outputTail>
	//  181  319:istore          5
				_outputTail = j + 1;
	//  182  321:aload_0         
	//  183  322:iload           5
	//  184  324:iconst_1        
	//  185  325:iadd            
	//  186  326:putfield        #115 <Field int _outputTail>
				abyte1[j] = 110;
	//  187  329:aload           13
	//  188  331:iload           5
	//  189  333:bipush          110
	//  190  335:bastore         
				k = base64variant.getMaxLineLength() >> 2;
	//  191  336:aload_1         
	//  192  337:invokevirtual   #376 <Method int Base64Variant.getMaxLineLength()>
	//  193  340:iconst_2        
	//  194  341:ishr            
	//  195  342:istore          6
			}
			j = j1 + 1;
	//  196  344:iload           9
	//  197  346:iconst_1        
	//  198  347:iadd            
	//  199  348:istore          5
			k1 = i1;
	//  200  350:iload           8
	//  201  352:istore          10
			j1 = l;
	//  202  354:iload           7
	//  203  356:istore          9
		} while(true);
	//  204  358:goto            30
	}

	protected final int _writeBinary(Base64Variant base64variant, InputStream inputstream, byte abyte0[], int i)
		throws IOException, JsonGenerationException
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          8
		int k = 0;
	//    2    3:iconst_0        
	//    3    4:istore          6
		int k1 = -3;
	//    4    6:bipush          -3
	//    5    8:istore          10
		int i2 = _outputEnd - 6;
	//    6   10:aload_0         
	//    7   11:getfield        #88  <Field int _outputEnd>
	//    8   14:bipush          6
	//    9   16:isub            
	//   10   17:istore          12
		int l = base64variant.getMaxLineLength() >> 2;
	//   11   19:aload_1         
	//   12   20:invokevirtual   #376 <Method int Base64Variant.getMaxLineLength()>
	//   13   23:iconst_2        
	//   14   24:ishr            
	//   15   25:istore          7
		int j = i;
	//   16   27:iload           4
	//   17   29:istore          5
		i = ((int) (flag));
	//   18   31:iload           8
	//   19   33:istore          4
		do
		{
label0:
			{
label1:
				{
					int j1 = i;
	//   20   35:iload           4
	//   21   37:istore          9
					int i1 = k;
	//   22   39:iload           6
	//   23   41:istore          8
					int l1;
					if(j > 2)
	//*  24   43:iload           5
	//*  25   45:iconst_2        
	//*  26   46:icmple          102
					{
						l1 = i;
	//   27   49:iload           4
	//   28   51:istore          11
						j1 = k;
	//   29   53:iload           6
	//   30   55:istore          9
						i1 = k1;
	//   31   57:iload           10
	//   32   59:istore          8
						if(i <= k1)
							break label0;
	//   33   61:iload           4
	//   34   63:iload           10
	//   35   65:icmple          222
						j1 = _readMore(inputstream, abyte0, i, k, j);
	//   36   68:aload_0         
	//   37   69:aload_2         
	//   38   70:aload_3         
	//   39   71:iload           4
	//   40   73:iload           6
	//   41   75:iload           5
	//   42   77:invokespecial   #378 <Method int _readMore(InputStream, byte[], int, int, int)>
	//   43   80:istore          9
						l1 = 0;
	//   44   82:iconst_0        
	//   45   83:istore          11
						i = 0;
	//   46   85:iconst_0        
	//   47   86:istore          4
						if(j1 >= 3)
							break label1;
	//   48   88:iload           9
	//   49   90:iconst_3        
	//   50   91:icmpge          216
						i1 = j1;
	//   51   94:iload           9
	//   52   96:istore          8
						j1 = i;
	//   53   98:iload           4
	//   54  100:istore          9
					}
					i = j;
	//   55  102:iload           5
	//   56  104:istore          4
					if(j > 0)
	//*  57  106:iload           5
	//*  58  108:ifle            213
					{
						l = _readMore(inputstream, abyte0, j1, i1, j);
	//   59  111:aload_0         
	//   60  112:aload_2         
	//   61  113:aload_3         
	//   62  114:iload           9
	//   63  116:iload           8
	//   64  118:iload           5
	//   65  120:invokespecial   #378 <Method int _readMore(InputStream, byte[], int, int, int)>
	//   66  123:istore          7
						i = j;
	//   67  125:iload           5
	//   68  127:istore          4
						if(l > 0)
	//*  69  129:iload           7
	//*  70  131:ifle            213
						{
							if(_outputTail > i2)
	//*  71  134:aload_0         
	//*  72  135:getfield        #115 <Field int _outputTail>
	//*  73  138:iload           12
	//*  74  140:icmple          147
								_flushBuffer();
	//   75  143:aload_0         
	//   76  144:invokevirtual   #124 <Method void _flushBuffer()>
							i = 0 + 1;
	//   77  147:iconst_0        
	//   78  148:iconst_1        
	//   79  149:iadd            
	//   80  150:istore          4
							k = abyte0[0] << 16;
	//   81  152:aload_3         
	//   82  153:iconst_0        
	//   83  154:baload          
	//   84  155:bipush          16
	//   85  157:ishl            
	//   86  158:istore          6
							byte byte0;
							byte abyte1[];
							if(i < l)
	//*  87  160:iload           4
	//*  88  162:iload           7
	//*  89  164:icmpge          411
							{
								k |= (abyte0[i] & 0xff) << 8;
	//   90  167:iload           6
	//   91  169:aload_3         
	//   92  170:iload           4
	//   93  172:baload          
	//   94  173:sipush          255
	//   95  176:iand            
	//   96  177:bipush          8
	//   97  179:ishl            
	//   98  180:ior             
	//   99  181:istore          6
								i = 2;
	//  100  183:iconst_2        
	//  101  184:istore          4
							} else
	//* 102  186:aload_0         
	//* 103  187:aload_1         
	//* 104  188:iload           6
	//* 105  190:iload           4
	//* 106  192:aload_0         
	//* 107  193:getfield        #86  <Field byte[] _outputBuffer>
	//* 108  196:aload_0         
	//* 109  197:getfield        #115 <Field int _outputTail>
	//* 110  200:invokevirtual   #382 <Method int Base64Variant.encodeBase64Partial(int, int, byte[], int)>
	//* 111  203:putfield        #115 <Field int _outputTail>
	//* 112  206:iload           5
	//* 113  208:iload           4
	//* 114  210:isub            
	//* 115  211:istore          4
	//* 116  213:iload           4
	//* 117  215:ireturn         
	//* 118  216:iload           9
	//* 119  218:iconst_3        
	//* 120  219:isub            
	//* 121  220:istore          8
	//* 122  222:aload_0         
	//* 123  223:getfield        #115 <Field int _outputTail>
	//* 124  226:iload           12
	//* 125  228:icmple          235
	//* 126  231:aload_0         
	//* 127  232:invokevirtual   #124 <Method void _flushBuffer()>
	//* 128  235:iload           11
	//* 129  237:iconst_1        
	//* 130  238:iadd            
	//* 131  239:istore          10
	//* 132  241:aload_3         
	//* 133  242:iload           11
	//* 134  244:baload          
	//* 135  245:istore          4
	//* 136  247:iload           10
	//* 137  249:iconst_1        
	//* 138  250:iadd            
	//* 139  251:istore          6
	//* 140  253:aload_3         
	//* 141  254:iload           10
	//* 142  256:baload          
	//* 143  257:istore          10
	//* 144  259:aload_3         
	//* 145  260:iload           6
	//* 146  262:baload          
	//* 147  263:istore          13
	//* 148  265:iload           5
	//* 149  267:iconst_3        
	//* 150  268:isub            
	//* 151  269:istore          11
	//* 152  271:aload_0         
	//* 153  272:aload_1         
	//* 154  273:iload           4
	//* 155  275:bipush          8
	//* 156  277:ishl            
	//* 157  278:iload           10
	//* 158  280:sipush          255
	//* 159  283:iand            
	//* 160  284:ior             
	//* 161  285:bipush          8
	//* 162  287:ishl            
	//* 163  288:iload           13
	//* 164  290:sipush          255
	//* 165  293:iand            
	//* 166  294:ior             
	//* 167  295:aload_0         
	//* 168  296:getfield        #86  <Field byte[] _outputBuffer>
	//* 169  299:aload_0         
	//* 170  300:getfield        #115 <Field int _outputTail>
	//* 171  303:invokevirtual   #385 <Method int Base64Variant.encodeBase64Chunk(int, byte[], int)>
	//* 172  306:putfield        #115 <Field int _outputTail>
	//* 173  309:iload           7
	//* 174  311:iconst_1        
	//* 175  312:isub            
	//* 176  313:istore          4
	//* 177  315:iload           4
	//* 178  317:istore          5
	//* 179  319:iload           4
	//* 180  321:ifgt            386
	//* 181  324:aload_0         
	//* 182  325:getfield        #86  <Field byte[] _outputBuffer>
	//* 183  328:astore          14
	//* 184  330:aload_0         
	//* 185  331:getfield        #115 <Field int _outputTail>
	//* 186  334:istore          4
	//* 187  336:aload_0         
	//* 188  337:iload           4
	//* 189  339:iconst_1        
	//* 190  340:iadd            
	//* 191  341:putfield        #115 <Field int _outputTail>
	//* 192  344:aload           14
	//* 193  346:iload           4
	//* 194  348:bipush          92
	//* 195  350:bastore         
	//* 196  351:aload_0         
	//* 197  352:getfield        #86  <Field byte[] _outputBuffer>
	//* 198  355:astore          14
	//* 199  357:aload_0         
	//* 200  358:getfield        #115 <Field int _outputTail>
	//* 201  361:istore          4
	//* 202  363:aload_0         
	//* 203  364:iload           4
	//* 204  366:iconst_1        
	//* 205  367:iadd            
	//* 206  368:putfield        #115 <Field int _outputTail>
	//* 207  371:aload           14
	//* 208  373:iload           4
	//* 209  375:bipush          110
	//* 210  377:bastore         
	//* 211  378:aload_1         
	//* 212  379:invokevirtual   #376 <Method int Base64Variant.getMaxLineLength()>
	//* 213  382:iconst_2        
	//* 214  383:ishr            
	//* 215  384:istore          5
	//* 216  386:iload           6
	//* 217  388:iconst_1        
	//* 218  389:iadd            
	//* 219  390:istore          4
	//* 220  392:iload           9
	//* 221  394:istore          6
	//* 222  396:iload           5
	//* 223  398:istore          7
	//* 224  400:iload           8
	//* 225  402:istore          10
	//* 226  404:iload           11
	//* 227  406:istore          5
	//* 228  408:goto            35
							{
								i = 1;
	//  229  411:iconst_1        
	//  230  412:istore          4
							}
							_outputTail = base64variant.encodeBase64Partial(k, i, _outputBuffer, _outputTail);
							i = j - i;
						}
					}
					return i;
				}
				i1 = j1 - 3;
			}
			if(_outputTail > i2)
				_flushBuffer();
			k1 = l1 + 1;
			i = ((int) (abyte0[l1]));
			k = k1 + 1;
			k1 = ((int) (abyte0[k1]));
			byte0 = abyte0[k];
			l1 = j - 3;
			_outputTail = base64variant.encodeBase64Chunk((i << 8 | k1 & 0xff) << 8 | byte0 & 0xff, _outputBuffer, _outputTail);
			i = l - 1;
			j = i;
			if(i <= 0)
			{
				abyte1 = _outputBuffer;
				i = _outputTail;
				_outputTail = i + 1;
				abyte1[i] = 92;
				abyte1 = _outputBuffer;
				i = _outputTail;
				_outputTail = i + 1;
				abyte1[i] = 110;
				j = base64variant.getMaxLineLength() >> 2;
			}
			i = k + 1;
			k = j1;
			l = j;
			k1 = i1;
			j = l1;
		} while(true);
	//* 231  414:goto            186
	}

	protected final void _writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
		throws IOException, JsonGenerationException
	{
		int i1 = _outputEnd - 6;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field int _outputEnd>
	//    2    4:bipush          6
	//    3    6:isub            
	//    4    7:istore          7
		int l = base64variant.getMaxLineLength() >> 2;
	//    5    9:aload_1         
	//    6   10:invokevirtual   #376 <Method int Base64Variant.getMaxLineLength()>
	//    7   13:iconst_2        
	//    8   14:ishr            
	//    9   15:istore          6
		int k = i;
	//   10   17:iload_3         
	//   11   18:istore          5
		i = l;
	//   12   20:iload           6
	//   13   22:istore_3        
		for(; k <= j - 3; k = l + 1)
	//*  14   23:iload           5
	//*  15   25:iload           4
	//*  16   27:iconst_3        
	//*  17   28:isub            
	//*  18   29:icmpgt          182
		{
			if(_outputTail > i1)
	//*  19   32:aload_0         
	//*  20   33:getfield        #115 <Field int _outputTail>
	//*  21   36:iload           7
	//*  22   38:icmple          45
				_flushBuffer();
	//   23   41:aload_0         
	//   24   42:invokevirtual   #124 <Method void _flushBuffer()>
			int j1 = k + 1;
	//   25   45:iload           5
	//   26   47:iconst_1        
	//   27   48:iadd            
	//   28   49:istore          8
			k = ((int) (abyte0[k]));
	//   29   51:aload_2         
	//   30   52:iload           5
	//   31   54:baload          
	//   32   55:istore          5
			l = j1 + 1;
	//   33   57:iload           8
	//   34   59:iconst_1        
	//   35   60:iadd            
	//   36   61:istore          6
			_outputTail = base64variant.encodeBase64Chunk((k << 8 | abyte0[j1] & 0xff) << 8 | abyte0[l] & 0xff, _outputBuffer, _outputTail);
	//   37   63:aload_0         
	//   38   64:aload_1         
	//   39   65:iload           5
	//   40   67:bipush          8
	//   41   69:ishl            
	//   42   70:aload_2         
	//   43   71:iload           8
	//   44   73:baload          
	//   45   74:sipush          255
	//   46   77:iand            
	//   47   78:ior             
	//   48   79:bipush          8
	//   49   81:ishl            
	//   50   82:aload_2         
	//   51   83:iload           6
	//   52   85:baload          
	//   53   86:sipush          255
	//   54   89:iand            
	//   55   90:ior             
	//   56   91:aload_0         
	//   57   92:getfield        #86  <Field byte[] _outputBuffer>
	//   58   95:aload_0         
	//   59   96:getfield        #115 <Field int _outputTail>
	//   60   99:invokevirtual   #385 <Method int Base64Variant.encodeBase64Chunk(int, byte[], int)>
	//   61  102:putfield        #115 <Field int _outputTail>
			k = i - 1;
	//   62  105:iload_3         
	//   63  106:iconst_1        
	//   64  107:isub            
	//   65  108:istore          5
			i = k;
	//   66  110:iload           5
	//   67  112:istore_3        
			if(k <= 0)
	//*  68  113:iload           5
	//*  69  115:ifgt            173
			{
				byte abyte1[] = _outputBuffer;
	//   70  118:aload_0         
	//   71  119:getfield        #86  <Field byte[] _outputBuffer>
	//   72  122:astore          9
				i = _outputTail;
	//   73  124:aload_0         
	//   74  125:getfield        #115 <Field int _outputTail>
	//   75  128:istore_3        
				_outputTail = i + 1;
	//   76  129:aload_0         
	//   77  130:iload_3         
	//   78  131:iconst_1        
	//   79  132:iadd            
	//   80  133:putfield        #115 <Field int _outputTail>
				abyte1[i] = 92;
	//   81  136:aload           9
	//   82  138:iload_3         
	//   83  139:bipush          92
	//   84  141:bastore         
				abyte1 = _outputBuffer;
	//   85  142:aload_0         
	//   86  143:getfield        #86  <Field byte[] _outputBuffer>
	//   87  146:astore          9
				i = _outputTail;
	//   88  148:aload_0         
	//   89  149:getfield        #115 <Field int _outputTail>
	//   90  152:istore_3        
				_outputTail = i + 1;
	//   91  153:aload_0         
	//   92  154:iload_3         
	//   93  155:iconst_1        
	//   94  156:iadd            
	//   95  157:putfield        #115 <Field int _outputTail>
				abyte1[i] = 110;
	//   96  160:aload           9
	//   97  162:iload_3         
	//   98  163:bipush          110
	//   99  165:bastore         
				i = base64variant.getMaxLineLength() >> 2;
	//  100  166:aload_1         
	//  101  167:invokevirtual   #376 <Method int Base64Variant.getMaxLineLength()>
	//  102  170:iconst_2        
	//  103  171:ishr            
	//  104  172:istore_3        
			}
		}

	//  105  173:iload           6
	//  106  175:iconst_1        
	//  107  176:iadd            
	//  108  177:istore          5
	//* 109  179:goto            23
		l = j - k;
	//  110  182:iload           4
	//  111  184:iload           5
	//  112  186:isub            
	//  113  187:istore          6
		if(l > 0)
	//* 114  189:iload           6
	//* 115  191:ifle            266
		{
			if(_outputTail > i1)
	//* 116  194:aload_0         
	//* 117  195:getfield        #115 <Field int _outputTail>
	//* 118  198:iload           7
	//* 119  200:icmple          207
				_flushBuffer();
	//  120  203:aload_0         
	//  121  204:invokevirtual   #124 <Method void _flushBuffer()>
			i1 = k + 1;
	//  122  207:iload           5
	//  123  209:iconst_1        
	//  124  210:iadd            
	//  125  211:istore          7
			j = abyte0[k] << 16;
	//  126  213:aload_2         
	//  127  214:iload           5
	//  128  216:baload          
	//  129  217:bipush          16
	//  130  219:ishl            
	//  131  220:istore          4
			i = j;
	//  132  222:iload           4
	//  133  224:istore_3        
			if(l == 2)
	//* 134  225:iload           6
	//* 135  227:iconst_2        
	//* 136  228:icmpne          246
				i = j | (abyte0[i1] & 0xff) << 8;
	//  137  231:iload           4
	//  138  233:aload_2         
	//  139  234:iload           7
	//  140  236:baload          
	//  141  237:sipush          255
	//  142  240:iand            
	//  143  241:bipush          8
	//  144  243:ishl            
	//  145  244:ior             
	//  146  245:istore_3        
			_outputTail = base64variant.encodeBase64Partial(i, l, _outputBuffer, _outputTail);
	//  147  246:aload_0         
	//  148  247:aload_1         
	//  149  248:iload_3         
	//  150  249:iload           6
	//  151  251:aload_0         
	//  152  252:getfield        #86  <Field byte[] _outputBuffer>
	//  153  255:aload_0         
	//  154  256:getfield        #115 <Field int _outputTail>
	//  155  259:invokevirtual   #382 <Method int Base64Variant.encodeBase64Partial(int, int, byte[], int)>
	//  156  262:putfield        #115 <Field int _outputTail>
			return;
	//  157  265:return          
		} else
		{
			return;
	//  158  266:return          
		}
	}

	protected final void _writePPFieldName(SerializableString serializablestring)
		throws IOException
	{
		int i = 1;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		int j = _writeContext.writeFieldName(serializablestring.getValue());
	//    2    2:aload_0         
	//    3    3:getfield        #340 <Field JsonWriteContext _writeContext>
	//    4    6:aload_1         
	//    5    7:invokeinterface #391 <Method String SerializableString.getValue()>
	//    6   12:invokevirtual   #395 <Method int JsonWriteContext.writeFieldName(String)>
	//    7   15:istore_3        
		if(j == 4)
	//*   8   16:iload_3         
	//*   9   17:iconst_4        
	//*  10   18:icmpne          28
			_reportError("Can not write a field name, expecting a value");
	//   11   21:aload_0         
	//   12   22:ldc2            #397 <String "Can not write a field name, expecting a value">
	//   13   25:invokevirtual   #149 <Method void _reportError(String)>
		if(j == 1)
	//*  14   28:iload_3         
	//*  15   29:iconst_1        
	//*  16   30:icmpne          145
			_cfgPrettyPrinter.writeObjectEntrySeparator(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   17   33:aload_0         
	//   18   34:getfield        #324 <Field PrettyPrinter _cfgPrettyPrinter>
	//   19   37:aload_0         
	//   20   38:invokeinterface #400 <Method void PrettyPrinter.writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)>
		else
	//*  21   43:aload_0         
	//*  22   44:getfield        #403 <Field boolean _cfgUnqNames>
	//*  23   47:ifne            158
	//*  24   50:iload_2         
	//*  25   51:ifeq            93
	//*  26   54:aload_0         
	//*  27   55:getfield        #115 <Field int _outputTail>
	//*  28   58:aload_0         
	//*  29   59:getfield        #88  <Field int _outputEnd>
	//*  30   62:icmplt          69
	//*  31   65:aload_0         
	//*  32   66:invokevirtual   #124 <Method void _flushBuffer()>
	//*  33   69:aload_0         
	//*  34   70:getfield        #86  <Field byte[] _outputBuffer>
	//*  35   73:astore          4
	//*  36   75:aload_0         
	//*  37   76:getfield        #115 <Field int _outputTail>
	//*  38   79:istore_3        
	//*  39   80:aload_0         
	//*  40   81:iload_3         
	//*  41   82:iconst_1        
	//*  42   83:iadd            
	//*  43   84:putfield        #115 <Field int _outputTail>
	//*  44   87:aload           4
	//*  45   89:iload_3         
	//*  46   90:bipush          34
	//*  47   92:bastore         
	//*  48   93:aload_0         
	//*  49   94:aload_1         
	//*  50   95:invokeinterface #298 <Method byte[] SerializableString.asQuotedUTF8()>
	//*  51  100:invokespecial   #300 <Method void _writeBytes(byte[])>
	//*  52  103:iload_2         
	//*  53  104:ifeq            144
	//*  54  107:aload_0         
	//*  55  108:getfield        #115 <Field int _outputTail>
	//*  56  111:aload_0         
	//*  57  112:getfield        #88  <Field int _outputEnd>
	//*  58  115:icmplt          122
	//*  59  118:aload_0         
	//*  60  119:invokevirtual   #124 <Method void _flushBuffer()>
	//*  61  122:aload_0         
	//*  62  123:getfield        #86  <Field byte[] _outputBuffer>
	//*  63  126:astore_1        
	//*  64  127:aload_0         
	//*  65  128:getfield        #115 <Field int _outputTail>
	//*  66  131:istore_2        
	//*  67  132:aload_0         
	//*  68  133:iload_2         
	//*  69  134:iconst_1        
	//*  70  135:iadd            
	//*  71  136:putfield        #115 <Field int _outputTail>
	//*  72  139:aload_1         
	//*  73  140:iload_2         
	//*  74  141:bipush          34
	//*  75  143:bastore         
	//*  76  144:return          
			_cfgPrettyPrinter.beforeObjectEntries(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   77  145:aload_0         
	//   78  146:getfield        #324 <Field PrettyPrinter _cfgPrettyPrinter>
	//   79  149:aload_0         
	//   80  150:invokeinterface #355 <Method void PrettyPrinter.beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)>
		if(_cfgUnqNames)
	//*  81  155:goto            43
			i = 0;
	//   82  158:iconst_0        
	//   83  159:istore_2        
		if(i != 0)
		{
			if(_outputTail >= _outputEnd)
				_flushBuffer();
			byte abyte0[] = _outputBuffer;
			int k = _outputTail;
			_outputTail = k + 1;
			abyte0[k] = 34;
		}
		_writeBytes(serializablestring.asQuotedUTF8());
		if(i != 0)
		{
			if(_outputTail >= _outputEnd)
				_flushBuffer();
			serializablestring = ((SerializableString) (_outputBuffer));
			i = _outputTail;
			_outputTail = i + 1;
			serializablestring[i] = 34;
		}
	//*  84  160:goto            50
	}

	protected final void _writePPFieldName(String s)
		throws IOException
	{
		int i = _writeContext.writeFieldName(s);
	//    0    0:aload_0         
	//    1    1:getfield        #340 <Field JsonWriteContext _writeContext>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #395 <Method int JsonWriteContext.writeFieldName(String)>
	//    4    8:istore_2        
		if(i == 4)
	//*   5    9:iload_2         
	//*   6   10:iconst_4        
	//*   7   11:icmpne          21
			_reportError("Can not write a field name, expecting a value");
	//    8   14:aload_0         
	//    9   15:ldc2            #397 <String "Can not write a field name, expecting a value">
	//   10   18:invokevirtual   #149 <Method void _reportError(String)>
		if(i == 1)
	//*  11   21:iload_2         
	//*  12   22:iconst_1        
	//*  13   23:icmpne          50
			_cfgPrettyPrinter.writeObjectEntrySeparator(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   14   26:aload_0         
	//   15   27:getfield        #324 <Field PrettyPrinter _cfgPrettyPrinter>
	//   16   30:aload_0         
	//   17   31:invokeinterface #400 <Method void PrettyPrinter.writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)>
		else
	//*  18   36:aload_0         
	//*  19   37:getfield        #403 <Field boolean _cfgUnqNames>
	//*  20   40:ifeq            63
	//*  21   43:aload_0         
	//*  22   44:aload_1         
	//*  23   45:iconst_0        
	//*  24   46:invokespecial   #405 <Method void _writeStringSegments(String, boolean)>
	//*  25   49:return          
			_cfgPrettyPrinter.beforeObjectEntries(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   26   50:aload_0         
	//   27   51:getfield        #324 <Field PrettyPrinter _cfgPrettyPrinter>
	//   28   54:aload_0         
	//   29   55:invokeinterface #355 <Method void PrettyPrinter.beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)>
		if(_cfgUnqNames)
		{
			_writeStringSegments(s, false);
			return;
		}
	//*  30   60:goto            36
		i = s.length();
	//   31   63:aload_1         
	//   32   64:invokevirtual   #280 <Method int String.length()>
	//   33   67:istore_2        
		if(i > _charBufferLength)
	//*  34   68:iload_2         
	//*  35   69:aload_0         
	//*  36   70:getfield        #98  <Field int _charBufferLength>
	//*  37   73:icmple          83
		{
			_writeStringSegments(s, true);
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:iconst_1        
	//   41   79:invokespecial   #405 <Method void _writeStringSegments(String, boolean)>
			return;
	//   42   82:return          
		}
		if(_outputTail >= _outputEnd)
	//*  43   83:aload_0         
	//*  44   84:getfield        #115 <Field int _outputTail>
	//*  45   87:aload_0         
	//*  46   88:getfield        #88  <Field int _outputEnd>
	//*  47   91:icmplt          98
			_flushBuffer();
	//   48   94:aload_0         
	//   49   95:invokevirtual   #124 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//   50   98:aload_0         
	//   51   99:getfield        #86  <Field byte[] _outputBuffer>
	//   52  102:astore          4
		int j = _outputTail;
	//   53  104:aload_0         
	//   54  105:getfield        #115 <Field int _outputTail>
	//   55  108:istore_3        
		_outputTail = j + 1;
	//   56  109:aload_0         
	//   57  110:iload_3         
	//   58  111:iconst_1        
	//   59  112:iadd            
	//   60  113:putfield        #115 <Field int _outputTail>
		abyte0[j] = 34;
	//   61  116:aload           4
	//   62  118:iload_3         
	//   63  119:bipush          34
	//   64  121:bastore         
		s.getChars(0, i, _charBuffer, 0);
	//   65  122:aload_1         
	//   66  123:iconst_0        
	//   67  124:iload_2         
	//   68  125:aload_0         
	//   69  126:getfield        #96  <Field char[] _charBuffer>
	//   70  129:iconst_0        
	//   71  130:invokevirtual   #409 <Method void String.getChars(int, int, char[], int)>
		if(i <= _outputMaxContiguous)
	//*  72  133:iload_2         
	//*  73  134:aload_0         
	//*  74  135:getfield        #90  <Field int _outputMaxContiguous>
	//*  75  138:icmpgt          206
		{
			if(_outputTail + i > _outputEnd)
	//*  76  141:aload_0         
	//*  77  142:getfield        #115 <Field int _outputTail>
	//*  78  145:iload_2         
	//*  79  146:iadd            
	//*  80  147:aload_0         
	//*  81  148:getfield        #88  <Field int _outputEnd>
	//*  82  151:icmple          158
				_flushBuffer();
	//   83  154:aload_0         
	//   84  155:invokevirtual   #124 <Method void _flushBuffer()>
			_writeStringSegment(_charBuffer, 0, i);
	//   85  158:aload_0         
	//   86  159:aload_0         
	//   87  160:getfield        #96  <Field char[] _charBuffer>
	//   88  163:iconst_0        
	//   89  164:iload_2         
	//   90  165:invokespecial   #282 <Method void _writeStringSegment(char[], int, int)>
		} else
	//*  91  168:aload_0         
	//*  92  169:getfield        #115 <Field int _outputTail>
	//*  93  172:aload_0         
	//*  94  173:getfield        #88  <Field int _outputEnd>
	//*  95  176:icmplt          183
	//*  96  179:aload_0         
	//*  97  180:invokevirtual   #124 <Method void _flushBuffer()>
	//*  98  183:aload_0         
	//*  99  184:getfield        #86  <Field byte[] _outputBuffer>
	//* 100  187:astore_1        
	//* 101  188:aload_0         
	//* 102  189:getfield        #115 <Field int _outputTail>
	//* 103  192:istore_2        
	//* 104  193:aload_0         
	//* 105  194:iload_2         
	//* 106  195:iconst_1        
	//* 107  196:iadd            
	//* 108  197:putfield        #115 <Field int _outputTail>
	//* 109  200:aload_1         
	//* 110  201:iload_2         
	//* 111  202:bipush          34
	//* 112  204:bastore         
	//* 113  205:return          
		{
			_writeStringSegments(_charBuffer, 0, i);
	//  114  206:aload_0         
	//  115  207:aload_0         
	//  116  208:getfield        #96  <Field char[] _charBuffer>
	//  117  211:iconst_0        
	//  118  212:iload_2         
	//  119  213:invokespecial   #411 <Method void _writeStringSegments(char[], int, int)>
		}
		if(_outputTail >= _outputEnd)
			_flushBuffer();
		s = ((String) (_outputBuffer));
		i = _outputTail;
		_outputTail = i + 1;
		s[i] = 34;
	//* 120  216:goto            168
	}

	public void close()
		throws IOException
	{
		super.close();
	//    0    0:aload_0         
	//    1    1:invokespecial   #414 <Method void JsonGeneratorImpl.close()>
		if(_outputBuffer != null && isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT))
	//*   2    4:aload_0         
	//*   3    5:getfield        #86  <Field byte[] _outputBuffer>
	//*   4    8:ifnull          54
	//*   5   11:aload_0         
	//*   6   12:getstatic       #417 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_JSON_CONTENT>
	//*   7   15:invokevirtual   #108 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*   8   18:ifeq            54
			do
			{
				JsonWriteContext jsonwritecontext = getOutputContext();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #421 <Method JsonWriteContext getOutputContext()>
	//   11   25:astore_1        
				if(((JsonStreamContext) (jsonwritecontext)).inArray())
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #424 <Method boolean JsonStreamContext.inArray()>
	//*  14   30:ifeq            40
				{
					writeEndArray();
	//   15   33:aload_0         
	//   16   34:invokevirtual   #427 <Method void writeEndArray()>
					continue;
	//   17   37:goto            21
				}
				if(!((JsonStreamContext) (jsonwritecontext)).inObject())
					break;
	//   18   40:aload_1         
	//   19   41:invokevirtual   #428 <Method boolean JsonStreamContext.inObject()>
	//   20   44:ifeq            54
				writeEndObject();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #431 <Method void writeEndObject()>
			} while(true);
	//   23   51:goto            21
		_flushBuffer();
	//   24   54:aload_0         
	//   25   55:invokevirtual   #124 <Method void _flushBuffer()>
		_outputTail = 0;
	//   26   58:aload_0         
	//   27   59:iconst_0        
	//   28   60:putfield        #115 <Field int _outputTail>
		if(_outputStream == null) goto _L2; else goto _L1
	//   29   63:aload_0         
	//   30   64:getfield        #77  <Field OutputStream _outputStream>
	//   31   67:ifnull          97
_L1:
		if(!_ioContext.isResourceManaged() && !isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET)) goto _L4; else goto _L3
	//   32   70:aload_0         
	//   33   71:getfield        #308 <Field IOContext _ioContext>
	//   34   74:invokevirtual   #434 <Method boolean IOContext.isResourceManaged()>
	//   35   77:ifne            90
	//   36   80:aload_0         
	//   37   81:getstatic       #437 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_TARGET>
	//   38   84:invokevirtual   #108 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//   39   87:ifeq            102
_L3:
		_outputStream.close();
	//   40   90:aload_0         
	//   41   91:getfield        #77  <Field OutputStream _outputStream>
	//   42   94:invokevirtual   #438 <Method void OutputStream.close()>
_L2:
		_releaseBuffers();
	//   43   97:aload_0         
	//   44   98:invokevirtual   #440 <Method void _releaseBuffers()>
		return;
	//   45  101:return          
_L4:
		if(isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM))
	//*  46  102:aload_0         
	//*  47  103:getstatic       #443 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.FLUSH_PASSED_TO_STREAM>
	//*  48  106:invokevirtual   #108 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*  49  109:ifeq            97
			_outputStream.flush();
	//   50  112:aload_0         
	//   51  113:getfield        #77  <Field OutputStream _outputStream>
	//   52  116:invokevirtual   #446 <Method void OutputStream.flush()>
		if(true) goto _L2; else goto _L5
	//   53  119:goto            97
_L5:
	}

	public void flush()
		throws IOException
	{
		_flushBuffer();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method void _flushBuffer()>
		if(_outputStream != null && isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM))
	//*   2    4:aload_0         
	//*   3    5:getfield        #77  <Field OutputStream _outputStream>
	//*   4    8:ifnull          28
	//*   5   11:aload_0         
	//*   6   12:getstatic       #443 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.FLUSH_PASSED_TO_STREAM>
	//*   7   15:invokevirtual   #108 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*   8   18:ifeq            28
			_outputStream.flush();
	//    9   21:aload_0         
	//   10   22:getfield        #77  <Field OutputStream _outputStream>
	//   11   25:invokevirtual   #446 <Method void OutputStream.flush()>
	//   12   28:return          
	}

	public int getOutputBuffered()
	{
		return _outputTail;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field int _outputTail>
	//    2    4:ireturn         
	}

	public Object getOutputTarget()
	{
		return ((Object) (_outputStream));
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field OutputStream _outputStream>
	//    2    4:areturn         
	}

	public int writeBinary(Base64Variant base64variant, InputStream inputstream, int i)
		throws IOException, JsonGenerationException
	{
		byte abyte0[];
		_verifyValueWrite("write a binary value");
	//    0    0:aload_0         
	//    1    1:ldc2            #453 <String "write a binary value">
	//    2    4:invokevirtual   #455 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #115 <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #88  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #124 <Method void _flushBuffer()>
		abyte0 = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #86  <Field byte[] _outputBuffer>
	//   12   26:astore          5
		int j = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #115 <Field int _outputTail>
	//   15   32:istore          4
		_outputTail = j + 1;
	//   16   34:aload_0         
	//   17   35:iload           4
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #115 <Field int _outputTail>
		abyte0[j] = 34;
	//   21   42:aload           5
	//   22   44:iload           4
	//   23   46:bipush          34
	//   24   48:bastore         
		abyte0 = _ioContext.allocBase64Buffer();
	//   25   49:aload_0         
	//   26   50:getfield        #308 <Field IOContext _ioContext>
	//   27   53:invokevirtual   #458 <Method byte[] IOContext.allocBase64Buffer()>
	//   28   56:astore          5
		if(i >= 0) goto _L2; else goto _L1
	//   29   58:iload_3         
	//   30   59:ifge            122
_L1:
		i = _writeBinary(base64variant, inputstream, abyte0);
	//   31   62:aload_0         
	//   32   63:aload_1         
	//   33   64:aload_2         
	//   34   65:aload           5
	//   35   67:invokevirtual   #460 <Method int _writeBinary(Base64Variant, InputStream, byte[])>
	//   36   70:istore_3        
_L4:
		_ioContext.releaseBase64Buffer(abyte0);
	//   37   71:aload_0         
	//   38   72:getfield        #308 <Field IOContext _ioContext>
	//   39   75:aload           5
	//   40   77:invokevirtual   #463 <Method void IOContext.releaseBase64Buffer(byte[])>
		if(_outputTail >= _outputEnd)
	//*  41   80:aload_0         
	//*  42   81:getfield        #115 <Field int _outputTail>
	//*  43   84:aload_0         
	//*  44   85:getfield        #88  <Field int _outputEnd>
	//*  45   88:icmplt          95
			_flushBuffer();
	//   46   91:aload_0         
	//   47   92:invokevirtual   #124 <Method void _flushBuffer()>
		base64variant = ((Base64Variant) (_outputBuffer));
	//   48   95:aload_0         
	//   49   96:getfield        #86  <Field byte[] _outputBuffer>
	//   50   99:astore_1        
		int k = _outputTail;
	//   51  100:aload_0         
	//   52  101:getfield        #115 <Field int _outputTail>
	//   53  104:istore          4
		_outputTail = k + 1;
	//   54  106:aload_0         
	//   55  107:iload           4
	//   56  109:iconst_1        
	//   57  110:iadd            
	//   58  111:putfield        #115 <Field int _outputTail>
		base64variant[k] = 34;
	//   59  114:aload_1         
	//   60  115:iload           4
	//   61  117:bipush          34
	//   62  119:bastore         
		return i;
	//   63  120:iload_3         
	//   64  121:ireturn         
_L2:
		int l = _writeBinary(base64variant, inputstream, abyte0, i);
	//   65  122:aload_0         
	//   66  123:aload_1         
	//   67  124:aload_2         
	//   68  125:aload           5
	//   69  127:iload_3         
	//   70  128:invokevirtual   #465 <Method int _writeBinary(Base64Variant, InputStream, byte[], int)>
	//   71  131:istore          4
		if(l <= 0) goto _L4; else goto _L3
	//   72  133:iload           4
	//   73  135:ifle            179
_L3:
		_reportError((new StringBuilder()).append("Too few bytes available: missing ").append(l).append(" bytes (out of ").append(i).append(")").toString());
	//   74  138:aload_0         
	//   75  139:new             #205 <Class StringBuilder>
	//   76  142:dup             
	//   77  143:invokespecial   #207 <Method void StringBuilder()>
	//   78  146:ldc2            #467 <String "Too few bytes available: missing ">
	//   79  149:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   80  152:iload           4
	//   81  154:invokevirtual   #470 <Method StringBuilder StringBuilder.append(int)>
	//   82  157:ldc2            #472 <String " bytes (out of ">
	//   83  160:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   84  163:iload_3         
	//   85  164:invokevirtual   #470 <Method StringBuilder StringBuilder.append(int)>
	//   86  167:ldc2            #474 <String ")">
	//   87  170:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   88  173:invokevirtual   #225 <Method String StringBuilder.toString()>
	//   89  176:invokevirtual   #149 <Method void _reportError(String)>
		  goto _L4
	//*  90  179:goto            71
		base64variant;
	//   91  182:astore_1        
		_ioContext.releaseBase64Buffer(abyte0);
	//   92  183:aload_0         
	//   93  184:getfield        #308 <Field IOContext _ioContext>
	//   94  187:aload           5
	//   95  189:invokevirtual   #463 <Method void IOContext.releaseBase64Buffer(byte[])>
		throw base64variant;
	//   96  192:aload_1         
	//   97  193:athrow          
	}

	public void writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
		throws IOException, JsonGenerationException
	{
		_verifyValueWrite("write a binary value");
	//    0    0:aload_0         
	//    1    1:ldc2            #453 <String "write a binary value">
	//    2    4:invokevirtual   #455 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #115 <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #88  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #124 <Method void _flushBuffer()>
		byte abyte1[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #86  <Field byte[] _outputBuffer>
	//   12   26:astore          6
		int k = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #115 <Field int _outputTail>
	//   15   32:istore          5
		_outputTail = k + 1;
	//   16   34:aload_0         
	//   17   35:iload           5
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #115 <Field int _outputTail>
		abyte1[k] = 34;
	//   21   42:aload           6
	//   22   44:iload           5
	//   23   46:bipush          34
	//   24   48:bastore         
		_writeBinary(base64variant, abyte0, i, i + j);
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:aload_2         
	//   28   52:iload_3         
	//   29   53:iload_3         
	//   30   54:iload           4
	//   31   56:iadd            
	//   32   57:invokevirtual   #476 <Method void _writeBinary(Base64Variant, byte[], int, int)>
		if(_outputTail >= _outputEnd)
	//*  33   60:aload_0         
	//*  34   61:getfield        #115 <Field int _outputTail>
	//*  35   64:aload_0         
	//*  36   65:getfield        #88  <Field int _outputEnd>
	//*  37   68:icmplt          75
			_flushBuffer();
	//   38   71:aload_0         
	//   39   72:invokevirtual   #124 <Method void _flushBuffer()>
		base64variant = ((Base64Variant) (_outputBuffer));
	//   40   75:aload_0         
	//   41   76:getfield        #86  <Field byte[] _outputBuffer>
	//   42   79:astore_1        
		i = _outputTail;
	//   43   80:aload_0         
	//   44   81:getfield        #115 <Field int _outputTail>
	//   45   84:istore_3        
		_outputTail = i + 1;
	//   46   85:aload_0         
	//   47   86:iload_3         
	//   48   87:iconst_1        
	//   49   88:iadd            
	//   50   89:putfield        #115 <Field int _outputTail>
		base64variant[i] = 34;
	//   51   92:aload_1         
	//   52   93:iload_3         
	//   53   94:bipush          34
	//   54   96:bastore         
	//   55   97:return          
	}

	public void writeBoolean(boolean flag)
		throws IOException
	{
		_verifyValueWrite("write a boolean value");
	//    0    0:aload_0         
	//    1    1:ldc2            #480 <String "write a boolean value">
	//    2    4:invokevirtual   #455 <Method void _verifyValueWrite(String)>
		if(_outputTail + 5 >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #115 <Field int _outputTail>
	//*   5   11:iconst_5        
	//*   6   12:iadd            
	//*   7   13:aload_0         
	//*   8   14:getfield        #88  <Field int _outputEnd>
	//*   9   17:icmplt          24
			_flushBuffer();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #124 <Method void _flushBuffer()>
		int i;
		byte abyte0[];
		if(flag)
	//*  12   24:iload_1         
	//*  13   25:ifeq            60
			abyte0 = TRUE_BYTES;
	//   14   28:getstatic       #64  <Field byte[] TRUE_BYTES>
	//   15   31:astore_3        
		else
	//*  16   32:aload_3         
	//*  17   33:arraylength     
	//*  18   34:istore_2        
	//*  19   35:aload_3         
	//*  20   36:iconst_0        
	//*  21   37:aload_0         
	//*  22   38:getfield        #86  <Field byte[] _outputBuffer>
	//*  23   41:aload_0         
	//*  24   42:getfield        #115 <Field int _outputTail>
	//*  25   45:iload_2         
	//*  26   46:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  27   49:aload_0         
	//*  28   50:aload_0         
	//*  29   51:getfield        #115 <Field int _outputTail>
	//*  30   54:iload_2         
	//*  31   55:iadd            
	//*  32   56:putfield        #115 <Field int _outputTail>
	//*  33   59:return          
			abyte0 = FALSE_BYTES;
	//   34   60:getstatic       #69  <Field byte[] FALSE_BYTES>
	//   35   63:astore_3        
		i = abyte0.length;
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (_outputBuffer)), _outputTail, i);
		_outputTail = _outputTail + i;
	//*  36   64:goto            32
	}

	public final void writeEndArray()
		throws IOException
	{
		if(!_writeContext.inArray())
	//*   0    0:aload_0         
	//*   1    1:getfield        #340 <Field JsonWriteContext _writeContext>
	//*   2    4:invokevirtual   #346 <Method boolean JsonWriteContext.inArray()>
	//*   3    7:ifne            40
			_reportError((new StringBuilder()).append("Current context not an ARRAY but ").append(_writeContext.getTypeDesc()).toString());
	//    4   10:aload_0         
	//    5   11:new             #205 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #207 <Method void StringBuilder()>
	//    8   18:ldc2            #482 <String "Current context not an ARRAY but ">
	//    9   21:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #340 <Field JsonWriteContext _writeContext>
	//   12   28:invokevirtual   #485 <Method String JsonWriteContext.getTypeDesc()>
	//   13   31:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:invokevirtual   #225 <Method String StringBuilder.toString()>
	//   15   37:invokevirtual   #149 <Method void _reportError(String)>
		if(_cfgPrettyPrinter != null)
	//*  16   40:aload_0         
	//*  17   41:getfield        #324 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  18   44:ifnull          76
		{
			_cfgPrettyPrinter.writeEndArray(((com.fasterxml.jackson.core.JsonGenerator) (this)), _writeContext.getEntryCount());
	//   19   47:aload_0         
	//   20   48:getfield        #324 <Field PrettyPrinter _cfgPrettyPrinter>
	//   21   51:aload_0         
	//   22   52:aload_0         
	//   23   53:getfield        #340 <Field JsonWriteContext _writeContext>
	//   24   56:invokevirtual   #488 <Method int JsonWriteContext.getEntryCount()>
	//   25   59:invokeinterface #491 <Method void PrettyPrinter.writeEndArray(com.fasterxml.jackson.core.JsonGenerator, int)>
		} else
	//*  26   64:aload_0         
	//*  27   65:aload_0         
	//*  28   66:getfield        #340 <Field JsonWriteContext _writeContext>
	//*  29   69:invokevirtual   #494 <Method JsonWriteContext JsonWriteContext.clearAndGetParent()>
	//*  30   72:putfield        #340 <Field JsonWriteContext _writeContext>
	//*  31   75:return          
		{
			if(_outputTail >= _outputEnd)
	//*  32   76:aload_0         
	//*  33   77:getfield        #115 <Field int _outputTail>
	//*  34   80:aload_0         
	//*  35   81:getfield        #88  <Field int _outputEnd>
	//*  36   84:icmplt          91
				_flushBuffer();
	//   37   87:aload_0         
	//   38   88:invokevirtual   #124 <Method void _flushBuffer()>
			byte abyte0[] = _outputBuffer;
	//   39   91:aload_0         
	//   40   92:getfield        #86  <Field byte[] _outputBuffer>
	//   41   95:astore_2        
			int i = _outputTail;
	//   42   96:aload_0         
	//   43   97:getfield        #115 <Field int _outputTail>
	//   44  100:istore_1        
			_outputTail = i + 1;
	//   45  101:aload_0         
	//   46  102:iload_1         
	//   47  103:iconst_1        
	//   48  104:iadd            
	//   49  105:putfield        #115 <Field int _outputTail>
			abyte0[i] = 93;
	//   50  108:aload_2         
	//   51  109:iload_1         
	//   52  110:bipush          93
	//   53  112:bastore         
		}
		_writeContext = _writeContext.clearAndGetParent();
	//*  54  113:goto            64
	}

	public final void writeEndObject()
		throws IOException
	{
		if(!_writeContext.inObject())
	//*   0    0:aload_0         
	//*   1    1:getfield        #340 <Field JsonWriteContext _writeContext>
	//*   2    4:invokevirtual   #352 <Method boolean JsonWriteContext.inObject()>
	//*   3    7:ifne            40
			_reportError((new StringBuilder()).append("Current context not an object but ").append(_writeContext.getTypeDesc()).toString());
	//    4   10:aload_0         
	//    5   11:new             #205 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #207 <Method void StringBuilder()>
	//    8   18:ldc2            #496 <String "Current context not an object but ">
	//    9   21:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #340 <Field JsonWriteContext _writeContext>
	//   12   28:invokevirtual   #485 <Method String JsonWriteContext.getTypeDesc()>
	//   13   31:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:invokevirtual   #225 <Method String StringBuilder.toString()>
	//   15   37:invokevirtual   #149 <Method void _reportError(String)>
		if(_cfgPrettyPrinter != null)
	//*  16   40:aload_0         
	//*  17   41:getfield        #324 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  18   44:ifnull          76
		{
			_cfgPrettyPrinter.writeEndObject(((com.fasterxml.jackson.core.JsonGenerator) (this)), _writeContext.getEntryCount());
	//   19   47:aload_0         
	//   20   48:getfield        #324 <Field PrettyPrinter _cfgPrettyPrinter>
	//   21   51:aload_0         
	//   22   52:aload_0         
	//   23   53:getfield        #340 <Field JsonWriteContext _writeContext>
	//   24   56:invokevirtual   #488 <Method int JsonWriteContext.getEntryCount()>
	//   25   59:invokeinterface #498 <Method void PrettyPrinter.writeEndObject(com.fasterxml.jackson.core.JsonGenerator, int)>
		} else
	//*  26   64:aload_0         
	//*  27   65:aload_0         
	//*  28   66:getfield        #340 <Field JsonWriteContext _writeContext>
	//*  29   69:invokevirtual   #494 <Method JsonWriteContext JsonWriteContext.clearAndGetParent()>
	//*  30   72:putfield        #340 <Field JsonWriteContext _writeContext>
	//*  31   75:return          
		{
			if(_outputTail >= _outputEnd)
	//*  32   76:aload_0         
	//*  33   77:getfield        #115 <Field int _outputTail>
	//*  34   80:aload_0         
	//*  35   81:getfield        #88  <Field int _outputEnd>
	//*  36   84:icmplt          91
				_flushBuffer();
	//   37   87:aload_0         
	//   38   88:invokevirtual   #124 <Method void _flushBuffer()>
			byte abyte0[] = _outputBuffer;
	//   39   91:aload_0         
	//   40   92:getfield        #86  <Field byte[] _outputBuffer>
	//   41   95:astore_2        
			int i = _outputTail;
	//   42   96:aload_0         
	//   43   97:getfield        #115 <Field int _outputTail>
	//   44  100:istore_1        
			_outputTail = i + 1;
	//   45  101:aload_0         
	//   46  102:iload_1         
	//   47  103:iconst_1        
	//   48  104:iadd            
	//   49  105:putfield        #115 <Field int _outputTail>
			abyte0[i] = 125;
	//   50  108:aload_2         
	//   51  109:iload_1         
	//   52  110:bipush          125
	//   53  112:bastore         
		}
		_writeContext = _writeContext.clearAndGetParent();
	//*  54  113:goto            64
	}

	public void writeFieldName(SerializableString serializablestring)
		throws IOException
	{
		if(_cfgPrettyPrinter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #324 <Field PrettyPrinter _cfgPrettyPrinter>
	//*   2    4:ifnull          13
		{
			_writePPFieldName(serializablestring);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #500 <Method void _writePPFieldName(SerializableString)>
			return;
	//    6   12:return          
		}
		int i = _writeContext.writeFieldName(serializablestring.getValue());
	//    7   13:aload_0         
	//    8   14:getfield        #340 <Field JsonWriteContext _writeContext>
	//    9   17:aload_1         
	//   10   18:invokeinterface #391 <Method String SerializableString.getValue()>
	//   11   23:invokevirtual   #395 <Method int JsonWriteContext.writeFieldName(String)>
	//   12   26:istore_2        
		if(i == 4)
	//*  13   27:iload_2         
	//*  14   28:iconst_4        
	//*  15   29:icmpne          39
			_reportError("Can not write a field name, expecting a value");
	//   16   32:aload_0         
	//   17   33:ldc2            #397 <String "Can not write a field name, expecting a value">
	//   18   36:invokevirtual   #149 <Method void _reportError(String)>
		if(i == 1)
	//*  19   39:iload_2         
	//*  20   40:iconst_1        
	//*  21   41:icmpne          81
		{
			if(_outputTail >= _outputEnd)
	//*  22   44:aload_0         
	//*  23   45:getfield        #115 <Field int _outputTail>
	//*  24   48:aload_0         
	//*  25   49:getfield        #88  <Field int _outputEnd>
	//*  26   52:icmplt          59
				_flushBuffer();
	//   27   55:aload_0         
	//   28   56:invokevirtual   #124 <Method void _flushBuffer()>
			byte abyte0[] = _outputBuffer;
	//   29   59:aload_0         
	//   30   60:getfield        #86  <Field byte[] _outputBuffer>
	//   31   63:astore_3        
			i = _outputTail;
	//   32   64:aload_0         
	//   33   65:getfield        #115 <Field int _outputTail>
	//   34   68:istore_2        
			_outputTail = i + 1;
	//   35   69:aload_0         
	//   36   70:iload_2         
	//   37   71:iconst_1        
	//   38   72:iadd            
	//   39   73:putfield        #115 <Field int _outputTail>
			abyte0[i] = 44;
	//   40   76:aload_3         
	//   41   77:iload_2         
	//   42   78:bipush          44
	//   43   80:bastore         
		}
		if(_cfgUnqNames)
	//*  44   81:aload_0         
	//*  45   82:getfield        #403 <Field boolean _cfgUnqNames>
	//*  46   85:ifeq            94
		{
			_writeUnq(serializablestring);
	//   47   88:aload_0         
	//   48   89:aload_1         
	//   49   90:invokespecial   #502 <Method void _writeUnq(SerializableString)>
			return;
	//   50   93:return          
		}
		if(_outputTail >= _outputEnd)
	//*  51   94:aload_0         
	//*  52   95:getfield        #115 <Field int _outputTail>
	//*  53   98:aload_0         
	//*  54   99:getfield        #88  <Field int _outputEnd>
	//*  55  102:icmplt          109
			_flushBuffer();
	//   56  105:aload_0         
	//   57  106:invokevirtual   #124 <Method void _flushBuffer()>
		byte abyte1[] = _outputBuffer;
	//   58  109:aload_0         
	//   59  110:getfield        #86  <Field byte[] _outputBuffer>
	//   60  113:astore_3        
		i = _outputTail;
	//   61  114:aload_0         
	//   62  115:getfield        #115 <Field int _outputTail>
	//   63  118:istore_2        
		_outputTail = i + 1;
	//   64  119:aload_0         
	//   65  120:iload_2         
	//   66  121:iconst_1        
	//   67  122:iadd            
	//   68  123:putfield        #115 <Field int _outputTail>
		abyte1[i] = 34;
	//   69  126:aload_3         
	//   70  127:iload_2         
	//   71  128:bipush          34
	//   72  130:bastore         
		i = serializablestring.appendQuotedUTF8(_outputBuffer, _outputTail);
	//   73  131:aload_1         
	//   74  132:aload_0         
	//   75  133:getfield        #86  <Field byte[] _outputBuffer>
	//   76  136:aload_0         
	//   77  137:getfield        #115 <Field int _outputTail>
	//   78  140:invokeinterface #295 <Method int SerializableString.appendQuotedUTF8(byte[], int)>
	//   79  145:istore_2        
		if(i < 0)
	//*  80  146:iload_2         
	//*  81  147:ifge            198
			_writeBytes(serializablestring.asQuotedUTF8());
	//   82  150:aload_0         
	//   83  151:aload_1         
	//   84  152:invokeinterface #298 <Method byte[] SerializableString.asQuotedUTF8()>
	//   85  157:invokespecial   #300 <Method void _writeBytes(byte[])>
		else
	//*  86  160:aload_0         
	//*  87  161:getfield        #115 <Field int _outputTail>
	//*  88  164:aload_0         
	//*  89  165:getfield        #88  <Field int _outputEnd>
	//*  90  168:icmplt          175
	//*  91  171:aload_0         
	//*  92  172:invokevirtual   #124 <Method void _flushBuffer()>
	//*  93  175:aload_0         
	//*  94  176:getfield        #86  <Field byte[] _outputBuffer>
	//*  95  179:astore_1        
	//*  96  180:aload_0         
	//*  97  181:getfield        #115 <Field int _outputTail>
	//*  98  184:istore_2        
	//*  99  185:aload_0         
	//* 100  186:iload_2         
	//* 101  187:iconst_1        
	//* 102  188:iadd            
	//* 103  189:putfield        #115 <Field int _outputTail>
	//* 104  192:aload_1         
	//* 105  193:iload_2         
	//* 106  194:bipush          34
	//* 107  196:bastore         
	//* 108  197:return          
			_outputTail = _outputTail + i;
	//  109  198:aload_0         
	//  110  199:aload_0         
	//  111  200:getfield        #115 <Field int _outputTail>
	//  112  203:iload_2         
	//  113  204:iadd            
	//  114  205:putfield        #115 <Field int _outputTail>
		if(_outputTail >= _outputEnd)
			_flushBuffer();
		serializablestring = ((SerializableString) (_outputBuffer));
		i = _outputTail;
		_outputTail = i + 1;
		serializablestring[i] = 34;
	//* 115  208:goto            160
	}

	public void writeFieldName(String s)
		throws IOException
	{
		if(_cfgPrettyPrinter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #324 <Field PrettyPrinter _cfgPrettyPrinter>
	//*   2    4:ifnull          13
		{
			_writePPFieldName(s);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #504 <Method void _writePPFieldName(String)>
			return;
	//    6   12:return          
		}
		int i = _writeContext.writeFieldName(s);
	//    7   13:aload_0         
	//    8   14:getfield        #340 <Field JsonWriteContext _writeContext>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #395 <Method int JsonWriteContext.writeFieldName(String)>
	//   11   21:istore_2        
		if(i == 4)
	//*  12   22:iload_2         
	//*  13   23:iconst_4        
	//*  14   24:icmpne          34
			_reportError("Can not write a field name, expecting a value");
	//   15   27:aload_0         
	//   16   28:ldc2            #397 <String "Can not write a field name, expecting a value">
	//   17   31:invokevirtual   #149 <Method void _reportError(String)>
		if(i == 1)
	//*  18   34:iload_2         
	//*  19   35:iconst_1        
	//*  20   36:icmpne          78
		{
			if(_outputTail >= _outputEnd)
	//*  21   39:aload_0         
	//*  22   40:getfield        #115 <Field int _outputTail>
	//*  23   43:aload_0         
	//*  24   44:getfield        #88  <Field int _outputEnd>
	//*  25   47:icmplt          54
				_flushBuffer();
	//   26   50:aload_0         
	//   27   51:invokevirtual   #124 <Method void _flushBuffer()>
			byte abyte0[] = _outputBuffer;
	//   28   54:aload_0         
	//   29   55:getfield        #86  <Field byte[] _outputBuffer>
	//   30   58:astore          4
			i = _outputTail;
	//   31   60:aload_0         
	//   32   61:getfield        #115 <Field int _outputTail>
	//   33   64:istore_2        
			_outputTail = i + 1;
	//   34   65:aload_0         
	//   35   66:iload_2         
	//   36   67:iconst_1        
	//   37   68:iadd            
	//   38   69:putfield        #115 <Field int _outputTail>
			abyte0[i] = 44;
	//   39   72:aload           4
	//   40   74:iload_2         
	//   41   75:bipush          44
	//   42   77:bastore         
		}
		if(_cfgUnqNames)
	//*  43   78:aload_0         
	//*  44   79:getfield        #403 <Field boolean _cfgUnqNames>
	//*  45   82:ifeq            92
		{
			_writeStringSegments(s, false);
	//   46   85:aload_0         
	//   47   86:aload_1         
	//   48   87:iconst_0        
	//   49   88:invokespecial   #405 <Method void _writeStringSegments(String, boolean)>
			return;
	//   50   91:return          
		}
		i = s.length();
	//   51   92:aload_1         
	//   52   93:invokevirtual   #280 <Method int String.length()>
	//   53   96:istore_2        
		if(i > _charBufferLength)
	//*  54   97:iload_2         
	//*  55   98:aload_0         
	//*  56   99:getfield        #98  <Field int _charBufferLength>
	//*  57  102:icmple          112
		{
			_writeStringSegments(s, true);
	//   58  105:aload_0         
	//   59  106:aload_1         
	//   60  107:iconst_1        
	//   61  108:invokespecial   #405 <Method void _writeStringSegments(String, boolean)>
			return;
	//   62  111:return          
		}
		if(_outputTail >= _outputEnd)
	//*  63  112:aload_0         
	//*  64  113:getfield        #115 <Field int _outputTail>
	//*  65  116:aload_0         
	//*  66  117:getfield        #88  <Field int _outputEnd>
	//*  67  120:icmplt          127
			_flushBuffer();
	//   68  123:aload_0         
	//   69  124:invokevirtual   #124 <Method void _flushBuffer()>
		byte abyte1[] = _outputBuffer;
	//   70  127:aload_0         
	//   71  128:getfield        #86  <Field byte[] _outputBuffer>
	//   72  131:astore          4
		int j = _outputTail;
	//   73  133:aload_0         
	//   74  134:getfield        #115 <Field int _outputTail>
	//   75  137:istore_3        
		_outputTail = j + 1;
	//   76  138:aload_0         
	//   77  139:iload_3         
	//   78  140:iconst_1        
	//   79  141:iadd            
	//   80  142:putfield        #115 <Field int _outputTail>
		abyte1[j] = 34;
	//   81  145:aload           4
	//   82  147:iload_3         
	//   83  148:bipush          34
	//   84  150:bastore         
		if(i <= _outputMaxContiguous)
	//*  85  151:iload_2         
	//*  86  152:aload_0         
	//*  87  153:getfield        #90  <Field int _outputMaxContiguous>
	//*  88  156:icmpgt          221
		{
			if(_outputTail + i > _outputEnd)
	//*  89  159:aload_0         
	//*  90  160:getfield        #115 <Field int _outputTail>
	//*  91  163:iload_2         
	//*  92  164:iadd            
	//*  93  165:aload_0         
	//*  94  166:getfield        #88  <Field int _outputEnd>
	//*  95  169:icmple          176
				_flushBuffer();
	//   96  172:aload_0         
	//   97  173:invokevirtual   #124 <Method void _flushBuffer()>
			_writeStringSegment(s, 0, i);
	//   98  176:aload_0         
	//   99  177:aload_1         
	//  100  178:iconst_0        
	//  101  179:iload_2         
	//  102  180:invokespecial   #275 <Method void _writeStringSegment(String, int, int)>
		} else
	//* 103  183:aload_0         
	//* 104  184:getfield        #115 <Field int _outputTail>
	//* 105  187:aload_0         
	//* 106  188:getfield        #88  <Field int _outputEnd>
	//* 107  191:icmplt          198
	//* 108  194:aload_0         
	//* 109  195:invokevirtual   #124 <Method void _flushBuffer()>
	//* 110  198:aload_0         
	//* 111  199:getfield        #86  <Field byte[] _outputBuffer>
	//* 112  202:astore_1        
	//* 113  203:aload_0         
	//* 114  204:getfield        #115 <Field int _outputTail>
	//* 115  207:istore_2        
	//* 116  208:aload_0         
	//* 117  209:iload_2         
	//* 118  210:iconst_1        
	//* 119  211:iadd            
	//* 120  212:putfield        #115 <Field int _outputTail>
	//* 121  215:aload_1         
	//* 122  216:iload_2         
	//* 123  217:bipush          34
	//* 124  219:bastore         
	//* 125  220:return          
		{
			_writeStringSegments(s, 0, i);
	//  126  221:aload_0         
	//  127  222:aload_1         
	//  128  223:iconst_0        
	//  129  224:iload_2         
	//  130  225:invokespecial   #506 <Method void _writeStringSegments(String, int, int)>
		}
		if(_outputTail >= _outputEnd)
			_flushBuffer();
		s = ((String) (_outputBuffer));
		i = _outputTail;
		_outputTail = i + 1;
		s[i] = 34;
	//* 131  228:goto            183
	}

	public void writeNull()
		throws IOException
	{
		_verifyValueWrite("write a null");
	//    0    0:aload_0         
	//    1    1:ldc2            #509 <String "write a null">
	//    2    4:invokevirtual   #455 <Method void _verifyValueWrite(String)>
		_writeNull();
	//    3    7:aload_0         
	//    4    8:invokespecial   #511 <Method void _writeNull()>
	//    5   11:return          
	}

	public void writeNumber(double d)
		throws IOException
	{
		if(_cfgNumbersAsStrings || (Double.isNaN(d) || Double.isInfinite(d)) && com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(_features))
	//*   0    0:aload_0         
	//*   1    1:getfield        #516 <Field boolean _cfgNumbersAsStrings>
	//*   2    4:ifne            34
	//*   3    7:dload_1         
	//*   4    8:invokestatic    #522 <Method boolean Double.isNaN(double)>
	//*   5   11:ifne            21
	//*   6   14:dload_1         
	//*   7   15:invokestatic    #525 <Method boolean Double.isInfinite(double)>
	//*   8   18:ifeq            43
	//*   9   21:getstatic       #528 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.QUOTE_NON_NUMERIC_NUMBERS>
	//*  10   24:aload_0         
	//*  11   25:getfield        #531 <Field int _features>
	//*  12   28:invokevirtual   #535 <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  13   31:ifeq            43
		{
			writeString(String.valueOf(d));
	//   14   34:aload_0         
	//   15   35:dload_1         
	//   16   36:invokestatic    #539 <Method String String.valueOf(double)>
	//   17   39:invokevirtual   #542 <Method void writeString(String)>
			return;
	//   18   42:return          
		} else
		{
			_verifyValueWrite("write a number");
	//   19   43:aload_0         
	//   20   44:ldc2            #544 <String "write a number">
	//   21   47:invokevirtual   #455 <Method void _verifyValueWrite(String)>
			writeRaw(String.valueOf(d));
	//   22   50:aload_0         
	//   23   51:dload_1         
	//   24   52:invokestatic    #539 <Method String String.valueOf(double)>
	//   25   55:invokevirtual   #252 <Method void writeRaw(String)>
			return;
	//   26   58:return          
		}
	}

	public void writeNumber(float f)
		throws IOException
	{
		if(_cfgNumbersAsStrings || (Float.isNaN(f) || Float.isInfinite(f)) && com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(_features))
	//*   0    0:aload_0         
	//*   1    1:getfield        #516 <Field boolean _cfgNumbersAsStrings>
	//*   2    4:ifne            34
	//*   3    7:fload_1         
	//*   4    8:invokestatic    #550 <Method boolean Float.isNaN(float)>
	//*   5   11:ifne            21
	//*   6   14:fload_1         
	//*   7   15:invokestatic    #552 <Method boolean Float.isInfinite(float)>
	//*   8   18:ifeq            43
	//*   9   21:getstatic       #528 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.QUOTE_NON_NUMERIC_NUMBERS>
	//*  10   24:aload_0         
	//*  11   25:getfield        #531 <Field int _features>
	//*  12   28:invokevirtual   #535 <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  13   31:ifeq            43
		{
			writeString(String.valueOf(f));
	//   14   34:aload_0         
	//   15   35:fload_1         
	//   16   36:invokestatic    #555 <Method String String.valueOf(float)>
	//   17   39:invokevirtual   #542 <Method void writeString(String)>
			return;
	//   18   42:return          
		} else
		{
			_verifyValueWrite("write a number");
	//   19   43:aload_0         
	//   20   44:ldc2            #544 <String "write a number">
	//   21   47:invokevirtual   #455 <Method void _verifyValueWrite(String)>
			writeRaw(String.valueOf(f));
	//   22   50:aload_0         
	//   23   51:fload_1         
	//   24   52:invokestatic    #555 <Method String String.valueOf(float)>
	//   25   55:invokevirtual   #252 <Method void writeRaw(String)>
			return;
	//   26   58:return          
		}
	}

	public void writeNumber(int i)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #544 <String "write a number">
	//    2    4:invokevirtual   #455 <Method void _verifyValueWrite(String)>
		if(_outputTail + 11 >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #115 <Field int _outputTail>
	//*   5   11:bipush          11
	//*   6   13:iadd            
	//*   7   14:aload_0         
	//*   8   15:getfield        #88  <Field int _outputEnd>
	//*   9   18:icmplt          25
			_flushBuffer();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #124 <Method void _flushBuffer()>
		if(_cfgNumbersAsStrings)
	//*  12   25:aload_0         
	//*  13   26:getfield        #516 <Field boolean _cfgNumbersAsStrings>
	//*  14   29:ifeq            38
		{
			_writeQuotedInt(i);
	//   15   32:aload_0         
	//   16   33:iload_1         
	//   17   34:invokespecial   #557 <Method void _writeQuotedInt(int)>
			return;
	//   18   37:return          
		} else
		{
			_outputTail = NumberOutput.outputInt(i, _outputBuffer, _outputTail);
	//   19   38:aload_0         
	//   20   39:iload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #86  <Field byte[] _outputBuffer>
	//   23   44:aload_0         
	//   24   45:getfield        #115 <Field int _outputTail>
	//   25   48:invokestatic    #242 <Method int NumberOutput.outputInt(int, byte[], int)>
	//   26   51:putfield        #115 <Field int _outputTail>
			return;
	//   27   54:return          
		}
	}

	public void writeNumber(long l)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #544 <String "write a number">
	//    2    4:invokevirtual   #455 <Method void _verifyValueWrite(String)>
		if(_cfgNumbersAsStrings)
	//*   3    7:aload_0         
	//*   4    8:getfield        #516 <Field boolean _cfgNumbersAsStrings>
	//*   5   11:ifeq            20
		{
			_writeQuotedLong(l);
	//    6   14:aload_0         
	//    7   15:lload_1         
	//    8   16:invokespecial   #559 <Method void _writeQuotedLong(long)>
			return;
	//    9   19:return          
		}
		if(_outputTail + 21 >= _outputEnd)
	//*  10   20:aload_0         
	//*  11   21:getfield        #115 <Field int _outputTail>
	//*  12   24:bipush          21
	//*  13   26:iadd            
	//*  14   27:aload_0         
	//*  15   28:getfield        #88  <Field int _outputEnd>
	//*  16   31:icmplt          38
			_flushBuffer();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #124 <Method void _flushBuffer()>
		_outputTail = NumberOutput.outputLong(l, _outputBuffer, _outputTail);
	//   19   38:aload_0         
	//   20   39:lload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #86  <Field byte[] _outputBuffer>
	//   23   44:aload_0         
	//   24   45:getfield        #115 <Field int _outputTail>
	//   25   48:invokestatic    #248 <Method int NumberOutput.outputLong(long, byte[], int)>
	//   26   51:putfield        #115 <Field int _outputTail>
	//   27   54:return          
	}

	public void writeNumber(String s)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #544 <String "write a number">
	//    2    4:invokevirtual   #455 <Method void _verifyValueWrite(String)>
		if(_cfgNumbersAsStrings)
	//*   3    7:aload_0         
	//*   4    8:getfield        #516 <Field boolean _cfgNumbersAsStrings>
	//*   5   11:ifeq            20
		{
			_writeQuotedRaw(s);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokespecial   #561 <Method void _writeQuotedRaw(String)>
			return;
	//    9   19:return          
		} else
		{
			writeRaw(s);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #252 <Method void writeRaw(String)>
			return;
	//   13   25:return          
		}
	}

	public void writeNumber(BigDecimal bigdecimal)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #544 <String "write a number">
	//    2    4:invokevirtual   #455 <Method void _verifyValueWrite(String)>
		if(bigdecimal == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       16
		{
			_writeNull();
	//    5   11:aload_0         
	//    6   12:invokespecial   #511 <Method void _writeNull()>
			return;
	//    7   15:return          
		}
		if(_cfgNumbersAsStrings)
	//*   8   16:aload_0         
	//*   9   17:getfield        #516 <Field boolean _cfgNumbersAsStrings>
	//*  10   20:ifeq            55
		{
			if(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(_features))
	//*  11   23:getstatic       #565 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.WRITE_BIGDECIMAL_AS_PLAIN>
	//*  12   26:aload_0         
	//*  13   27:getfield        #531 <Field int _features>
	//*  14   30:invokevirtual   #535 <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  15   33:ifeq            47
				bigdecimal = ((BigDecimal) (bigdecimal.toPlainString()));
	//   16   36:aload_1         
	//   17   37:invokevirtual   #570 <Method String BigDecimal.toPlainString()>
	//   18   40:astore_1        
			else
	//*  19   41:aload_0         
	//*  20   42:aload_1         
	//*  21   43:invokespecial   #561 <Method void _writeQuotedRaw(String)>
	//*  22   46:return          
				bigdecimal = ((BigDecimal) (bigdecimal.toString()));
	//   23   47:aload_1         
	//   24   48:invokevirtual   #571 <Method String BigDecimal.toString()>
	//   25   51:astore_1        
			_writeQuotedRaw(((String) (bigdecimal)));
			return;
		}
	//*  26   52:goto            41
		if(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(_features))
	//*  27   55:getstatic       #565 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.WRITE_BIGDECIMAL_AS_PLAIN>
	//*  28   58:aload_0         
	//*  29   59:getfield        #531 <Field int _features>
	//*  30   62:invokevirtual   #535 <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  31   65:ifeq            77
		{
			writeRaw(bigdecimal.toPlainString());
	//   32   68:aload_0         
	//   33   69:aload_1         
	//   34   70:invokevirtual   #570 <Method String BigDecimal.toPlainString()>
	//   35   73:invokevirtual   #252 <Method void writeRaw(String)>
			return;
	//   36   76:return          
		} else
		{
			writeRaw(bigdecimal.toString());
	//   37   77:aload_0         
	//   38   78:aload_1         
	//   39   79:invokevirtual   #571 <Method String BigDecimal.toString()>
	//   40   82:invokevirtual   #252 <Method void writeRaw(String)>
			return;
	//   41   85:return          
		}
	}

	public void writeNumber(BigInteger biginteger)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #544 <String "write a number">
	//    2    4:invokevirtual   #455 <Method void _verifyValueWrite(String)>
		if(biginteger == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       16
		{
			_writeNull();
	//    5   11:aload_0         
	//    6   12:invokespecial   #511 <Method void _writeNull()>
			return;
	//    7   15:return          
		}
		if(_cfgNumbersAsStrings)
	//*   8   16:aload_0         
	//*   9   17:getfield        #516 <Field boolean _cfgNumbersAsStrings>
	//*  10   20:ifeq            32
		{
			_writeQuotedRaw(biginteger.toString());
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #575 <Method String BigInteger.toString()>
	//   14   28:invokespecial   #561 <Method void _writeQuotedRaw(String)>
			return;
	//   15   31:return          
		} else
		{
			writeRaw(biginteger.toString());
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #575 <Method String BigInteger.toString()>
	//   19   37:invokevirtual   #252 <Method void writeRaw(String)>
			return;
	//   20   40:return          
		}
	}

	public void writeNumber(short word0)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #544 <String "write a number">
	//    2    4:invokevirtual   #455 <Method void _verifyValueWrite(String)>
		if(_outputTail + 6 >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #115 <Field int _outputTail>
	//*   5   11:bipush          6
	//*   6   13:iadd            
	//*   7   14:aload_0         
	//*   8   15:getfield        #88  <Field int _outputEnd>
	//*   9   18:icmplt          25
			_flushBuffer();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #124 <Method void _flushBuffer()>
		if(_cfgNumbersAsStrings)
	//*  12   25:aload_0         
	//*  13   26:getfield        #516 <Field boolean _cfgNumbersAsStrings>
	//*  14   29:ifeq            38
		{
			_writeQuotedShort(word0);
	//   15   32:aload_0         
	//   16   33:iload_1         
	//   17   34:invokespecial   #577 <Method void _writeQuotedShort(short)>
			return;
	//   18   37:return          
		} else
		{
			_outputTail = NumberOutput.outputInt(((int) (word0)), _outputBuffer, _outputTail);
	//   19   38:aload_0         
	//   20   39:iload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #86  <Field byte[] _outputBuffer>
	//   23   44:aload_0         
	//   24   45:getfield        #115 <Field int _outputTail>
	//   25   48:invokestatic    #242 <Method int NumberOutput.outputInt(int, byte[], int)>
	//   26   51:putfield        #115 <Field int _outputTail>
			return;
	//   27   54:return          
		}
	}

	public void writeRaw(char c)
		throws IOException, JsonGenerationException
	{
		if(_outputTail + 3 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field int _outputTail>
	//*   2    4:iconst_3        
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #88  <Field int _outputEnd>
	//*   6   10:icmplt          17
			_flushBuffer();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #124 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//    9   17:aload_0         
	//   10   18:getfield        #86  <Field byte[] _outputBuffer>
	//   11   21:astore_3        
		if(c <= '\177')
	//*  12   22:iload_1         
	//*  13   23:bipush          127
	//*  14   25:icmpgt          46
		{
			int i = _outputTail;
	//   15   28:aload_0         
	//   16   29:getfield        #115 <Field int _outputTail>
	//   17   32:istore_2        
			_outputTail = i + 1;
	//   18   33:aload_0         
	//   19   34:iload_2         
	//   20   35:iconst_1        
	//   21   36:iadd            
	//   22   37:putfield        #115 <Field int _outputTail>
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
	//   33   54:getfield        #115 <Field int _outputTail>
	//   34   57:istore_2        
			_outputTail = j + 1;
	//   35   58:aload_0         
	//   36   59:iload_2         
	//   37   60:iconst_1        
	//   38   61:iadd            
	//   39   62:putfield        #115 <Field int _outputTail>
			abyte0[j] = (byte)(c >> 6 | 0xc0);
	//   40   65:aload_3         
	//   41   66:iload_2         
	//   42   67:iload_1         
	//   43   68:bipush          6
	//   44   70:ishr            
	//   45   71:sipush          192
	//   46   74:ior             
	//   47   75:int2byte        
	//   48   76:bastore         
			j = _outputTail;
	//   49   77:aload_0         
	//   50   78:getfield        #115 <Field int _outputTail>
	//   51   81:istore_2        
			_outputTail = j + 1;
	//   52   82:aload_0         
	//   53   83:iload_2         
	//   54   84:iconst_1        
	//   55   85:iadd            
	//   56   86:putfield        #115 <Field int _outputTail>
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
	//   72  107:invokespecial   #257 <Method int _outputRawMultiByteChar(int, char[], int, int)>
	//   73  110:pop             
			return;
	//   74  111:return          
		}
	}

	public void writeRaw(SerializableString serializablestring)
		throws IOException, JsonGenerationException
	{
		serializablestring = ((SerializableString) (serializablestring.asUnquotedUTF8()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #175 <Method byte[] SerializableString.asUnquotedUTF8()>
	//    2    6:astore_1        
		if(serializablestring.length > 0)
	//*   3    7:aload_1         
	//*   4    8:arraylength     
	//*   5    9:ifle            17
			_writeBytes(((byte []) (serializablestring)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #300 <Method void _writeBytes(byte[])>
	//    9   17:return          
	}

	public void writeRaw(String s)
		throws IOException, JsonGenerationException
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int k;
		for(int i = s.length(); i > 0; i -= k)
	//*   2    2:aload_1         
	//*   3    3:invokevirtual   #280 <Method int String.length()>
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:ifle            68
		{
			char ac[] = _charBuffer;
	//    7   11:aload_0         
	//    8   12:getfield        #96  <Field char[] _charBuffer>
	//    9   15:astore          5
			k = ac.length;
	//   10   17:aload           5
	//   11   19:arraylength     
	//   12   20:istore          4
			if(i < k)
	//*  13   22:iload_2         
	//*  14   23:iload           4
	//*  15   25:icmpge          65
				k = i;
	//   16   28:iload_2         
	//   17   29:istore          4
			s.getChars(j, j + k, ac, 0);
	//   18   31:aload_1         
	//   19   32:iload_3         
	//   20   33:iload_3         
	//   21   34:iload           4
	//   22   36:iadd            
	//   23   37:aload           5
	//   24   39:iconst_0        
	//   25   40:invokevirtual   #409 <Method void String.getChars(int, int, char[], int)>
			writeRaw(ac, 0, k);
	//   26   43:aload_0         
	//   27   44:aload           5
	//   28   46:iconst_0        
	//   29   47:iload           4
	//   30   49:invokevirtual   #580 <Method void writeRaw(char[], int, int)>
			j += k;
	//   31   52:iload_3         
	//   32   53:iload           4
	//   33   55:iadd            
	//   34   56:istore_3        
		}

	//   35   57:iload_2         
	//   36   58:iload           4
	//   37   60:isub            
	//   38   61:istore_2        
	//*  39   62:goto            7
	//*  40   65:goto            31
	//   41   68:return          
	}

	public void writeRaw(String s, int i, int j)
		throws IOException, JsonGenerationException
	{
		int k;
		for(; j > 0; j -= k)
	//*   0    0:iload_3         
	//*   1    1:ifle            61
		{
			char ac[] = _charBuffer;
	//    2    4:aload_0         
	//    3    5:getfield        #96  <Field char[] _charBuffer>
	//    4    8:astore          5
			k = ac.length;
	//    5   10:aload           5
	//    6   12:arraylength     
	//    7   13:istore          4
			if(j < k)
	//*   8   15:iload_3         
	//*   9   16:iload           4
	//*  10   18:icmpge          58
				k = j;
	//   11   21:iload_3         
	//   12   22:istore          4
			s.getChars(i, i + k, ac, 0);
	//   13   24:aload_1         
	//   14   25:iload_2         
	//   15   26:iload_2         
	//   16   27:iload           4
	//   17   29:iadd            
	//   18   30:aload           5
	//   19   32:iconst_0        
	//   20   33:invokevirtual   #409 <Method void String.getChars(int, int, char[], int)>
			writeRaw(ac, 0, k);
	//   21   36:aload_0         
	//   22   37:aload           5
	//   23   39:iconst_0        
	//   24   40:iload           4
	//   25   42:invokevirtual   #580 <Method void writeRaw(char[], int, int)>
			i += k;
	//   26   45:iload_2         
	//   27   46:iload           4
	//   28   48:iadd            
	//   29   49:istore_2        
		}

	//   30   50:iload_3         
	//   31   51:iload           4
	//   32   53:isub            
	//   33   54:istore_3        
	//*  34   55:goto            0
	//*  35   58:goto            24
	//   36   61:return          
	}

	public final void writeRaw(char ac[], int i, int j)
		throws IOException, JsonGenerationException
	{
		int k = j + j + j;
	//    0    0:iload_3         
	//    1    1:iload_3         
	//    2    2:iadd            
	//    3    3:iload_3         
	//    4    4:iadd            
	//    5    5:istore          4
		if(_outputTail + k <= _outputEnd) goto _L2; else goto _L1
	//    6    7:aload_0         
	//    7    8:getfield        #115 <Field int _outputTail>
	//    8   11:iload           4
	//    9   13:iadd            
	//   10   14:aload_0         
	//   11   15:getfield        #88  <Field int _outputEnd>
	//   12   18:icmple          42
_L1:
		if(_outputEnd >= k) goto _L4; else goto _L3
	//   13   21:aload_0         
	//   14   22:getfield        #88  <Field int _outputEnd>
	//   15   25:iload           4
	//   16   27:icmpge          38
_L3:
		_writeSegmentedRaw(ac, i, j);
	//   17   30:aload_0         
	//   18   31:aload_1         
	//   19   32:iload_2         
	//   20   33:iload_3         
	//   21   34:invokespecial   #582 <Method void _writeSegmentedRaw(char[], int, int)>
_L10:
		return;
	//   22   37:return          
_L4:
		_flushBuffer();
	//   23   38:aload_0         
	//   24   39:invokevirtual   #124 <Method void _flushBuffer()>
_L2:
		k = j + i;
	//   25   42:iload_3         
	//   26   43:iload_2         
	//   27   44:iadd            
	//   28   45:istore          4
_L8:
		if(i >= k)
			continue; /* Loop/switch isn't completed */
	//   29   47:iload_2         
	//   30   48:iload           4
	//   31   50:icmpge          37
_L6:
label0:
		{
			j = ((int) (ac[i]));
	//   32   53:aload_1         
	//   33   54:iload_2         
	//   34   55:caload          
	//   35   56:istore_3        
			if(j <= 127)
				break label0;
	//   36   57:iload_3         
	//   37   58:bipush          127
	//   38   60:icmple          151
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
			int i1;
			byte abyte1[];
			if(i < 2048)
	//*  47   71:iload_2         
	//*  48   72:sipush          2048
	//*  49   75:icmpge          191
			{
				byte abyte0[] = _outputBuffer;
	//   50   78:aload_0         
	//   51   79:getfield        #86  <Field byte[] _outputBuffer>
	//   52   82:astore          6
				int l = _outputTail;
	//   53   84:aload_0         
	//   54   85:getfield        #115 <Field int _outputTail>
	//   55   88:istore          5
				_outputTail = l + 1;
	//   56   90:aload_0         
	//   57   91:iload           5
	//   58   93:iconst_1        
	//   59   94:iadd            
	//   60   95:putfield        #115 <Field int _outputTail>
				abyte0[l] = (byte)(i >> 6 | 0xc0);
	//   61   98:aload           6
	//   62  100:iload           5
	//   63  102:iload_2         
	//   64  103:bipush          6
	//   65  105:ishr            
	//   66  106:sipush          192
	//   67  109:ior             
	//   68  110:int2byte        
	//   69  111:bastore         
				abyte0 = _outputBuffer;
	//   70  112:aload_0         
	//   71  113:getfield        #86  <Field byte[] _outputBuffer>
	//   72  116:astore          6
				l = _outputTail;
	//   73  118:aload_0         
	//   74  119:getfield        #115 <Field int _outputTail>
	//   75  122:istore          5
				_outputTail = l + 1;
	//   76  124:aload_0         
	//   77  125:iload           5
	//   78  127:iconst_1        
	//   79  128:iadd            
	//   80  129:putfield        #115 <Field int _outputTail>
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
	//*  93  151:aload_0         
	//*  94  152:getfield        #86  <Field byte[] _outputBuffer>
	//*  95  155:astore          6
	//*  96  157:aload_0         
	//*  97  158:getfield        #115 <Field int _outputTail>
	//*  98  161:istore          5
	//*  99  163:aload_0         
	//* 100  164:iload           5
	//* 101  166:iconst_1        
	//* 102  167:iadd            
	//* 103  168:putfield        #115 <Field int _outputTail>
	//* 104  171:aload           6
	//* 105  173:iload           5
	//* 106  175:iload_3         
	//* 107  176:int2byte        
	//* 108  177:bastore         
	//* 109  178:iload_2         
	//* 110  179:iconst_1        
	//* 111  180:iadd            
	//* 112  181:istore_3        
	//* 113  182:iload_3         
	//* 114  183:istore_2        
	//* 115  184:iload_3         
	//* 116  185:iload           4
	//* 117  187:icmplt          53
	//* 118  190:return          
			{
				i = _outputRawMultiByteChar(i, ac, j, k);
	//  119  191:aload_0         
	//  120  192:iload_2         
	//  121  193:aload_1         
	//  122  194:iload_3         
	//  123  195:iload           4
	//  124  197:invokespecial   #257 <Method int _outputRawMultiByteChar(int, char[], int, int)>
	//  125  200:istore_2        
			}
		}
		continue; /* Loop/switch isn't completed */
	//  126  201:goto            47
		abyte1 = _outputBuffer;
		i1 = _outputTail;
		_outputTail = i1 + 1;
		abyte1[i1] = (byte)j;
		j = i + 1;
		i = j;
		if(j < k) goto _L6; else goto _L5
_L5:
		return;
		if(true) goto _L8; else goto _L7
_L7:
		if(true) goto _L10; else goto _L9
_L9:
	}

	public void writeRawUTF8String(byte abyte0[], int i, int j)
		throws IOException
	{
		_verifyValueWrite("write a string");
	//    0    0:aload_0         
	//    1    1:ldc2            #585 <String "write a string">
	//    2    4:invokevirtual   #455 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #115 <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #88  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #124 <Method void _flushBuffer()>
		byte abyte1[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #86  <Field byte[] _outputBuffer>
	//   12   26:astore          5
		int k = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #115 <Field int _outputTail>
	//   15   32:istore          4
		_outputTail = k + 1;
	//   16   34:aload_0         
	//   17   35:iload           4
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #115 <Field int _outputTail>
		abyte1[k] = 34;
	//   21   42:aload           5
	//   22   44:iload           4
	//   23   46:bipush          34
	//   24   48:bastore         
		_writeBytes(abyte0, i, j);
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:iload_2         
	//   28   52:iload_3         
	//   29   53:invokespecial   #587 <Method void _writeBytes(byte[], int, int)>
		if(_outputTail >= _outputEnd)
	//*  30   56:aload_0         
	//*  31   57:getfield        #115 <Field int _outputTail>
	//*  32   60:aload_0         
	//*  33   61:getfield        #88  <Field int _outputEnd>
	//*  34   64:icmplt          71
			_flushBuffer();
	//   35   67:aload_0         
	//   36   68:invokevirtual   #124 <Method void _flushBuffer()>
		abyte0 = _outputBuffer;
	//   37   71:aload_0         
	//   38   72:getfield        #86  <Field byte[] _outputBuffer>
	//   39   75:astore_1        
		i = _outputTail;
	//   40   76:aload_0         
	//   41   77:getfield        #115 <Field int _outputTail>
	//   42   80:istore_2        
		_outputTail = i + 1;
	//   43   81:aload_0         
	//   44   82:iload_2         
	//   45   83:iconst_1        
	//   46   84:iadd            
	//   47   85:putfield        #115 <Field int _outputTail>
		abyte0[i] = 34;
	//   48   88:aload_1         
	//   49   89:iload_2         
	//   50   90:bipush          34
	//   51   92:bastore         
	//   52   93:return          
	}

	public void writeRawValue(SerializableString serializablestring)
		throws IOException
	{
		_verifyValueWrite("write a raw (unencoded) value");
	//    0    0:aload_0         
	//    1    1:ldc2            #590 <String "write a raw (unencoded) value">
	//    2    4:invokevirtual   #455 <Method void _verifyValueWrite(String)>
		serializablestring = ((SerializableString) (serializablestring.asUnquotedUTF8()));
	//    3    7:aload_1         
	//    4    8:invokeinterface #175 <Method byte[] SerializableString.asUnquotedUTF8()>
	//    5   13:astore_1        
		if(serializablestring.length > 0)
	//*   6   14:aload_1         
	//*   7   15:arraylength     
	//*   8   16:ifle            24
			_writeBytes(((byte []) (serializablestring)));
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokespecial   #300 <Method void _writeBytes(byte[])>
	//   12   24:return          
	}

	public final void writeStartArray()
		throws IOException
	{
		_verifyValueWrite("start an array");
	//    0    0:aload_0         
	//    1    1:ldc2            #593 <String "start an array">
	//    2    4:invokevirtual   #455 <Method void _verifyValueWrite(String)>
		_writeContext = _writeContext.createChildArrayContext();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #340 <Field JsonWriteContext _writeContext>
	//    6   12:invokevirtual   #596 <Method JsonWriteContext JsonWriteContext.createChildArrayContext()>
	//    7   15:putfield        #340 <Field JsonWriteContext _writeContext>
		if(_cfgPrettyPrinter != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #324 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  10   22:ifnull          36
		{
			_cfgPrettyPrinter.writeStartArray(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   11   25:aload_0         
	//   12   26:getfield        #324 <Field PrettyPrinter _cfgPrettyPrinter>
	//   13   29:aload_0         
	//   14   30:invokeinterface #598 <Method void PrettyPrinter.writeStartArray(com.fasterxml.jackson.core.JsonGenerator)>
			return;
	//   15   35:return          
		}
		if(_outputTail >= _outputEnd)
	//*  16   36:aload_0         
	//*  17   37:getfield        #115 <Field int _outputTail>
	//*  18   40:aload_0         
	//*  19   41:getfield        #88  <Field int _outputEnd>
	//*  20   44:icmplt          51
			_flushBuffer();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #124 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//   23   51:aload_0         
	//   24   52:getfield        #86  <Field byte[] _outputBuffer>
	//   25   55:astore_2        
		int i = _outputTail;
	//   26   56:aload_0         
	//   27   57:getfield        #115 <Field int _outputTail>
	//   28   60:istore_1        
		_outputTail = i + 1;
	//   29   61:aload_0         
	//   30   62:iload_1         
	//   31   63:iconst_1        
	//   32   64:iadd            
	//   33   65:putfield        #115 <Field int _outputTail>
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
	//    1    1:ldc2            #601 <String "start an object">
	//    2    4:invokevirtual   #455 <Method void _verifyValueWrite(String)>
		_writeContext = _writeContext.createChildObjectContext();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #340 <Field JsonWriteContext _writeContext>
	//    6   12:invokevirtual   #604 <Method JsonWriteContext JsonWriteContext.createChildObjectContext()>
	//    7   15:putfield        #340 <Field JsonWriteContext _writeContext>
		if(_cfgPrettyPrinter != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #324 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  10   22:ifnull          36
		{
			_cfgPrettyPrinter.writeStartObject(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   11   25:aload_0         
	//   12   26:getfield        #324 <Field PrettyPrinter _cfgPrettyPrinter>
	//   13   29:aload_0         
	//   14   30:invokeinterface #606 <Method void PrettyPrinter.writeStartObject(com.fasterxml.jackson.core.JsonGenerator)>
			return;
	//   15   35:return          
		}
		if(_outputTail >= _outputEnd)
	//*  16   36:aload_0         
	//*  17   37:getfield        #115 <Field int _outputTail>
	//*  18   40:aload_0         
	//*  19   41:getfield        #88  <Field int _outputEnd>
	//*  20   44:icmplt          51
			_flushBuffer();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #124 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//   23   51:aload_0         
	//   24   52:getfield        #86  <Field byte[] _outputBuffer>
	//   25   55:astore_2        
		int i = _outputTail;
	//   26   56:aload_0         
	//   27   57:getfield        #115 <Field int _outputTail>
	//   28   60:istore_1        
		_outputTail = i + 1;
	//   29   61:aload_0         
	//   30   62:iload_1         
	//   31   63:iconst_1        
	//   32   64:iadd            
	//   33   65:putfield        #115 <Field int _outputTail>
		abyte0[i] = 123;
	//   34   68:aload_2         
	//   35   69:iload_1         
	//   36   70:bipush          123
	//   37   72:bastore         
	//   38   73:return          
	}

	public final void writeString(SerializableString serializablestring)
		throws IOException
	{
		_verifyValueWrite("write a string");
	//    0    0:aload_0         
	//    1    1:ldc2            #585 <String "write a string">
	//    2    4:invokevirtual   #455 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #115 <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #88  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #124 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #86  <Field byte[] _outputBuffer>
	//   12   26:astore_3        
		int i = _outputTail;
	//   13   27:aload_0         
	//   14   28:getfield        #115 <Field int _outputTail>
	//   15   31:istore_2        
		_outputTail = i + 1;
	//   16   32:aload_0         
	//   17   33:iload_2         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:putfield        #115 <Field int _outputTail>
		abyte0[i] = 34;
	//   21   39:aload_3         
	//   22   40:iload_2         
	//   23   41:bipush          34
	//   24   43:bastore         
		i = serializablestring.appendQuotedUTF8(_outputBuffer, _outputTail);
	//   25   44:aload_1         
	//   26   45:aload_0         
	//   27   46:getfield        #86  <Field byte[] _outputBuffer>
	//   28   49:aload_0         
	//   29   50:getfield        #115 <Field int _outputTail>
	//   30   53:invokeinterface #295 <Method int SerializableString.appendQuotedUTF8(byte[], int)>
	//   31   58:istore_2        
		if(i < 0)
	//*  32   59:iload_2         
	//*  33   60:ifge            111
			_writeBytes(serializablestring.asQuotedUTF8());
	//   34   63:aload_0         
	//   35   64:aload_1         
	//   36   65:invokeinterface #298 <Method byte[] SerializableString.asQuotedUTF8()>
	//   37   70:invokespecial   #300 <Method void _writeBytes(byte[])>
		else
	//*  38   73:aload_0         
	//*  39   74:getfield        #115 <Field int _outputTail>
	//*  40   77:aload_0         
	//*  41   78:getfield        #88  <Field int _outputEnd>
	//*  42   81:icmplt          88
	//*  43   84:aload_0         
	//*  44   85:invokevirtual   #124 <Method void _flushBuffer()>
	//*  45   88:aload_0         
	//*  46   89:getfield        #86  <Field byte[] _outputBuffer>
	//*  47   92:astore_1        
	//*  48   93:aload_0         
	//*  49   94:getfield        #115 <Field int _outputTail>
	//*  50   97:istore_2        
	//*  51   98:aload_0         
	//*  52   99:iload_2         
	//*  53  100:iconst_1        
	//*  54  101:iadd            
	//*  55  102:putfield        #115 <Field int _outputTail>
	//*  56  105:aload_1         
	//*  57  106:iload_2         
	//*  58  107:bipush          34
	//*  59  109:bastore         
	//*  60  110:return          
			_outputTail = _outputTail + i;
	//   61  111:aload_0         
	//   62  112:aload_0         
	//   63  113:getfield        #115 <Field int _outputTail>
	//   64  116:iload_2         
	//   65  117:iadd            
	//   66  118:putfield        #115 <Field int _outputTail>
		if(_outputTail >= _outputEnd)
			_flushBuffer();
		serializablestring = ((SerializableString) (_outputBuffer));
		i = _outputTail;
		_outputTail = i + 1;
		serializablestring[i] = 34;
	//*  67  121:goto            73
	}

	public void writeString(String s)
		throws IOException
	{
		_verifyValueWrite("write a string");
	//    0    0:aload_0         
	//    1    1:ldc2            #585 <String "write a string">
	//    2    4:invokevirtual   #455 <Method void _verifyValueWrite(String)>
		if(s == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       16
		{
			_writeNull();
	//    5   11:aload_0         
	//    6   12:invokespecial   #511 <Method void _writeNull()>
			return;
	//    7   15:return          
		}
		int i = s.length();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #280 <Method int String.length()>
	//   10   20:istore_2        
		if(i > _outputMaxContiguous)
	//*  11   21:iload_2         
	//*  12   22:aload_0         
	//*  13   23:getfield        #90  <Field int _outputMaxContiguous>
	//*  14   26:icmple          36
		{
			_writeStringSegments(s, true);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:iconst_1        
	//   18   32:invokespecial   #405 <Method void _writeStringSegments(String, boolean)>
			return;
	//   19   35:return          
		}
		if(_outputTail + i >= _outputEnd)
	//*  20   36:aload_0         
	//*  21   37:getfield        #115 <Field int _outputTail>
	//*  22   40:iload_2         
	//*  23   41:iadd            
	//*  24   42:aload_0         
	//*  25   43:getfield        #88  <Field int _outputEnd>
	//*  26   46:icmplt          53
			_flushBuffer();
	//   27   49:aload_0         
	//   28   50:invokevirtual   #124 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//   29   53:aload_0         
	//   30   54:getfield        #86  <Field byte[] _outputBuffer>
	//   31   57:astore          4
		int j = _outputTail;
	//   32   59:aload_0         
	//   33   60:getfield        #115 <Field int _outputTail>
	//   34   63:istore_3        
		_outputTail = j + 1;
	//   35   64:aload_0         
	//   36   65:iload_3         
	//   37   66:iconst_1        
	//   38   67:iadd            
	//   39   68:putfield        #115 <Field int _outputTail>
		abyte0[j] = 34;
	//   40   71:aload           4
	//   41   73:iload_3         
	//   42   74:bipush          34
	//   43   76:bastore         
		_writeStringSegment(s, 0, i);
	//   44   77:aload_0         
	//   45   78:aload_1         
	//   46   79:iconst_0        
	//   47   80:iload_2         
	//   48   81:invokespecial   #275 <Method void _writeStringSegment(String, int, int)>
		if(_outputTail >= _outputEnd)
	//*  49   84:aload_0         
	//*  50   85:getfield        #115 <Field int _outputTail>
	//*  51   88:aload_0         
	//*  52   89:getfield        #88  <Field int _outputEnd>
	//*  53   92:icmplt          99
			_flushBuffer();
	//   54   95:aload_0         
	//   55   96:invokevirtual   #124 <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//   56   99:aload_0         
	//   57  100:getfield        #86  <Field byte[] _outputBuffer>
	//   58  103:astore_1        
		i = _outputTail;
	//   59  104:aload_0         
	//   60  105:getfield        #115 <Field int _outputTail>
	//   61  108:istore_2        
		_outputTail = i + 1;
	//   62  109:aload_0         
	//   63  110:iload_2         
	//   64  111:iconst_1        
	//   65  112:iadd            
	//   66  113:putfield        #115 <Field int _outputTail>
		s[i] = 34;
	//   67  116:aload_1         
	//   68  117:iload_2         
	//   69  118:bipush          34
	//   70  120:bastore         
	//   71  121:return          
	}

	public void writeString(char ac[], int i, int j)
		throws IOException
	{
		_verifyValueWrite("write a string");
	//    0    0:aload_0         
	//    1    1:ldc2            #585 <String "write a string">
	//    2    4:invokevirtual   #455 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #115 <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #88  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #124 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #86  <Field byte[] _outputBuffer>
	//   12   26:astore          5
		int k = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #115 <Field int _outputTail>
	//   15   32:istore          4
		_outputTail = k + 1;
	//   16   34:aload_0         
	//   17   35:iload           4
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #115 <Field int _outputTail>
		abyte0[k] = 34;
	//   21   42:aload           5
	//   22   44:iload           4
	//   23   46:bipush          34
	//   24   48:bastore         
		if(j <= _outputMaxContiguous)
	//*  25   49:iload_3         
	//*  26   50:aload_0         
	//*  27   51:getfield        #90  <Field int _outputMaxContiguous>
	//*  28   54:icmpgt          119
		{
			if(_outputTail + j > _outputEnd)
	//*  29   57:aload_0         
	//*  30   58:getfield        #115 <Field int _outputTail>
	//*  31   61:iload_3         
	//*  32   62:iadd            
	//*  33   63:aload_0         
	//*  34   64:getfield        #88  <Field int _outputEnd>
	//*  35   67:icmple          74
				_flushBuffer();
	//   36   70:aload_0         
	//   37   71:invokevirtual   #124 <Method void _flushBuffer()>
			_writeStringSegment(ac, i, j);
	//   38   74:aload_0         
	//   39   75:aload_1         
	//   40   76:iload_2         
	//   41   77:iload_3         
	//   42   78:invokespecial   #282 <Method void _writeStringSegment(char[], int, int)>
		} else
	//*  43   81:aload_0         
	//*  44   82:getfield        #115 <Field int _outputTail>
	//*  45   85:aload_0         
	//*  46   86:getfield        #88  <Field int _outputEnd>
	//*  47   89:icmplt          96
	//*  48   92:aload_0         
	//*  49   93:invokevirtual   #124 <Method void _flushBuffer()>
	//*  50   96:aload_0         
	//*  51   97:getfield        #86  <Field byte[] _outputBuffer>
	//*  52  100:astore_1        
	//*  53  101:aload_0         
	//*  54  102:getfield        #115 <Field int _outputTail>
	//*  55  105:istore_2        
	//*  56  106:aload_0         
	//*  57  107:iload_2         
	//*  58  108:iconst_1        
	//*  59  109:iadd            
	//*  60  110:putfield        #115 <Field int _outputTail>
	//*  61  113:aload_1         
	//*  62  114:iload_2         
	//*  63  115:bipush          34
	//*  64  117:bastore         
	//*  65  118:return          
		{
			_writeStringSegments(ac, i, j);
	//   66  119:aload_0         
	//   67  120:aload_1         
	//   68  121:iload_2         
	//   69  122:iload_3         
	//   70  123:invokespecial   #411 <Method void _writeStringSegments(char[], int, int)>
		}
		if(_outputTail >= _outputEnd)
			_flushBuffer();
		ac = ((char []) (_outputBuffer));
		i = _outputTail;
		_outputTail = i + 1;
		ac[i] = '"';
	//*  71  126:goto            81
	}

	public void writeUTF8String(byte abyte0[], int i, int j)
		throws IOException
	{
		_verifyValueWrite("write a string");
	//    0    0:aload_0         
	//    1    1:ldc2            #585 <String "write a string">
	//    2    4:invokevirtual   #455 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #115 <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #88  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #124 <Method void _flushBuffer()>
		byte abyte1[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #86  <Field byte[] _outputBuffer>
	//   12   26:astore          5
		int k = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #115 <Field int _outputTail>
	//   15   32:istore          4
		_outputTail = k + 1;
	//   16   34:aload_0         
	//   17   35:iload           4
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #115 <Field int _outputTail>
		abyte1[k] = 34;
	//   21   42:aload           5
	//   22   44:iload           4
	//   23   46:bipush          34
	//   24   48:bastore         
		if(j <= _outputMaxContiguous)
	//*  25   49:iload_3         
	//*  26   50:aload_0         
	//*  27   51:getfield        #90  <Field int _outputMaxContiguous>
	//*  28   54:icmpgt          102
			_writeUTF8Segment(abyte0, i, j);
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:iload_2         
	//   32   60:iload_3         
	//   33   61:invokespecial   #289 <Method void _writeUTF8Segment(byte[], int, int)>
		else
	//*  34   64:aload_0         
	//*  35   65:getfield        #115 <Field int _outputTail>
	//*  36   68:aload_0         
	//*  37   69:getfield        #88  <Field int _outputEnd>
	//*  38   72:icmplt          79
	//*  39   75:aload_0         
	//*  40   76:invokevirtual   #124 <Method void _flushBuffer()>
	//*  41   79:aload_0         
	//*  42   80:getfield        #86  <Field byte[] _outputBuffer>
	//*  43   83:astore_1        
	//*  44   84:aload_0         
	//*  45   85:getfield        #115 <Field int _outputTail>
	//*  46   88:istore_2        
	//*  47   89:aload_0         
	//*  48   90:iload_2         
	//*  49   91:iconst_1        
	//*  50   92:iadd            
	//*  51   93:putfield        #115 <Field int _outputTail>
	//*  52   96:aload_1         
	//*  53   97:iload_2         
	//*  54   98:bipush          34
	//*  55  100:bastore         
	//*  56  101:return          
			_writeUTF8Segments(abyte0, i, j);
	//   57  102:aload_0         
	//   58  103:aload_1         
	//   59  104:iload_2         
	//   60  105:iload_3         
	//   61  106:invokespecial   #609 <Method void _writeUTF8Segments(byte[], int, int)>
		if(_outputTail >= _outputEnd)
			_flushBuffer();
		abyte0 = _outputBuffer;
		i = _outputTail;
		_outputTail = i + 1;
		abyte0[i] = 34;
	//*  62  109:goto            64
	}

	private static final byte BYTE_0 = 48;
	private static final byte BYTE_BACKSLASH = 92;
	private static final byte BYTE_COLON = 58;
	private static final byte BYTE_COMMA = 44;
	private static final byte BYTE_LBRACKET = 91;
	private static final byte BYTE_LCURLY = 123;
	private static final byte BYTE_QUOTE = 34;
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

	static 
	{
	//    0    0:invokestatic    #53  <Method byte[] CharTypes.copyHexBytes()>
	//    1    3:putstatic       #55  <Field byte[] HEX_CHARS>
	//    2    6:iconst_4        
	//    3    7:newarray        byte[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:ldc1            #56  <Int 110>
	//    7   13:bastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:ldc1            #25  <Int 117>
	//   11   18:bastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:ldc1            #57  <Int 108>
	//   15   23:bastore         
	//   16   24:dup             
	//   17   25:iconst_3        
	//   18   26:ldc1            #57  <Int 108>
	//   19   28:bastore         
	//   20   29:putstatic       #59  <Field byte[] NULL_BYTES>
	//   21   32:iconst_4        
	//   22   33:newarray        byte[]
	//   23   35:dup             
	//   24   36:iconst_0        
	//   25   37:ldc1            #60  <Int 116>
	//   26   39:bastore         
	//   27   40:dup             
	//   28   41:iconst_1        
	//   29   42:ldc1            #61  <Int 114>
	//   30   44:bastore         
	//   31   45:dup             
	//   32   46:iconst_2        
	//   33   47:ldc1            #25  <Int 117>
	//   34   49:bastore         
	//   35   50:dup             
	//   36   51:iconst_3        
	//   37   52:ldc1            #62  <Int 101>
	//   38   54:bastore         
	//   39   55:putstatic       #64  <Field byte[] TRUE_BYTES>
	//   40   58:iconst_5        
	//   41   59:newarray        byte[]
	//   42   61:dup             
	//   43   62:iconst_0        
	//   44   63:ldc1            #65  <Int 102>
	//   45   65:bastore         
	//   46   66:dup             
	//   47   67:iconst_1        
	//   48   68:ldc1            #66  <Int 97>
	//   49   70:bastore         
	//   50   71:dup             
	//   51   72:iconst_2        
	//   52   73:ldc1            #57  <Int 108>
	//   53   75:bastore         
	//   54   76:dup             
	//   55   77:iconst_3        
	//   56   78:ldc1            #67  <Int 115>
	//   57   80:bastore         
	//   58   81:dup             
	//   59   82:iconst_4        
	//   60   83:ldc1            #62  <Int 101>
	//   61   85:bastore         
	//   62   86:putstatic       #69  <Field byte[] FALSE_BYTES>
	//*  63   89:return          
	}
}
