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
	//    4    4:invokespecial   #54  <Method void JsonGeneratorImpl(IOContext, int, ObjectCodec)>
		_quoteChar = 34;
	//    5    7:aload_0         
	//    6    8:bipush          34
	//    7   10:putfield        #56  <Field byte _quoteChar>
		_outputStream = outputstream;
	//    8   13:aload_0         
	//    9   14:aload           4
	//   10   16:putfield        #58  <Field OutputStream _outputStream>
		_bufferRecyclable = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #60  <Field boolean _bufferRecyclable>
		_outputBuffer = iocontext.allocWriteEncodingBuffer();
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #65  <Method byte[] IOContext.allocWriteEncodingBuffer()>
	//   17   29:putfield        #67  <Field byte[] _outputBuffer>
		_outputEnd = _outputBuffer.length;
	//   18   32:aload_0         
	//   19   33:aload_0         
	//   20   34:getfield        #67  <Field byte[] _outputBuffer>
	//   21   37:arraylength     
	//   22   38:putfield        #69  <Field int _outputEnd>
		_outputMaxContiguous = _outputEnd >> 3;
	//   23   41:aload_0         
	//   24   42:aload_0         
	//   25   43:getfield        #69  <Field int _outputEnd>
	//   26   46:iconst_3        
	//   27   47:ishr            
	//   28   48:putfield        #71  <Field int _outputMaxContiguous>
		_charBuffer = iocontext.allocConcatBuffer();
	//   29   51:aload_0         
	//   30   52:aload_1         
	//   31   53:invokevirtual   #75  <Method char[] IOContext.allocConcatBuffer()>
	//   32   56:putfield        #77  <Field char[] _charBuffer>
		_charBufferLength = _charBuffer.length;
	//   33   59:aload_0         
	//   34   60:aload_0         
	//   35   61:getfield        #77  <Field char[] _charBuffer>
	//   36   64:arraylength     
	//   37   65:putfield        #79  <Field int _charBufferLength>
		if(isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII))
	//*  38   68:aload_0         
	//*  39   69:getstatic       #85  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.ESCAPE_NON_ASCII>
	//*  40   72:invokevirtual   #89  <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*  41   75:ifeq            85
			setHighestNonEscapedChar(127);
	//   42   78:aload_0         
	//   43   79:bipush          127
	//   44   81:invokevirtual   #93  <Method com.fasterxml.jackson.core.JsonGenerator setHighestNonEscapedChar(int)>
	//   45   84:pop             
	//   46   85:return          
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
	//   12   18:putfield        #101 <Field int _outputTail>
			_flushBuffer();
	//   13   21:aload_0         
	//   14   22:invokevirtual   #104 <Method void _flushBuffer()>
			i = _outputTail;
	//   15   25:aload_0         
	//   16   26:getfield        #101 <Field int _outputTail>
	//   17   29:istore_2        
			if(i1 > abyte0.length)
	//*  18   30:iload           7
	//*  19   32:aload_1         
	//*  20   33:arraylength     
	//*  21   34:icmple          51
			{
				_outputStream.write(abyte1, 0, i1);
	//   22   37:aload_0         
	//   23   38:getfield        #58  <Field OutputStream _outputStream>
	//   24   41:aload           4
	//   25   43:iconst_0        
	//   26   44:iload           7
	//   27   46:invokevirtual   #110 <Method void OutputStream.write(byte[], int, int)>
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
	//   35   58:invokestatic    #116 <Method void System.arraycopy(Object, int, Object, int, int)>
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
	//   48   80:invokevirtual   #104 <Method void _flushBuffer()>
			return _outputTail;
	//   49   83:aload_0         
	//   50   84:getfield        #101 <Field int _outputTail>
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
	//    1    1:getfield        #67  <Field byte[] _outputBuffer>
	//    2    4:astore          4
		if(i >= 55296 && i <= 57343)
	//*   3    6:iload_1         
	//*   4    7:ldc1            #120 <Int 55296>
	//*   5    9:icmplt          111
	//*   6   12:iload_1         
	//*   7   13:ldc1            #121 <Int 57343>
	//*   8   15:icmpgt          111
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
			byte abyte1[] = HEX_CHARS;
	//   29   42:getstatic       #33  <Field byte[] HEX_CHARS>
	//   30   45:astore          5
			abyte0[j] = abyte1[i >> 12 & 0xf];
	//   31   47:aload           4
	//   32   49:iload_2         
	//   33   50:aload           5
	//   34   52:iload_1         
	//   35   53:bipush          12
	//   36   55:ishr            
	//   37   56:bipush          15
	//   38   58:iand            
	//   39   59:baload          
	//   40   60:bastore         
			j = k + 1;
	//   41   61:iload_3         
	//   42   62:iconst_1        
	//   43   63:iadd            
	//   44   64:istore_2        
			abyte0[k] = abyte1[i >> 8 & 0xf];
	//   45   65:aload           4
	//   46   67:iload_3         
	//   47   68:aload           5
	//   48   70:iload_1         
	//   49   71:bipush          8
	//   50   73:ishr            
	//   51   74:bipush          15
	//   52   76:iand            
	//   53   77:baload          
	//   54   78:bastore         
			k = j + 1;
	//   55   79:iload_2         
	//   56   80:iconst_1        
	//   57   81:iadd            
	//   58   82:istore_3        
			abyte0[j] = abyte1[i >> 4 & 0xf];
	//   59   83:aload           4
	//   60   85:iload_2         
	//   61   86:aload           5
	//   62   88:iload_1         
	//   63   89:iconst_4        
	//   64   90:ishr            
	//   65   91:bipush          15
	//   66   93:iand            
	//   67   94:baload          
	//   68   95:bastore         
			abyte0[k] = abyte1[i & 0xf];
	//   69   96:aload           4
	//   70   98:iload_3         
	//   71   99:aload           5
	//   72  101:iload_1         
	//   73  102:bipush          15
	//   74  104:iand            
	//   75  105:baload          
	//   76  106:bastore         
			return k + 1;
	//   77  107:iload_3         
	//   78  108:iconst_1        
	//   79  109:iadd            
	//   80  110:ireturn         
		} else
		{
			int l = j + 1;
	//   81  111:iload_2         
	//   82  112:iconst_1        
	//   83  113:iadd            
	//   84  114:istore_3        
			abyte0[j] = (byte)(i >> 12 | 0xe0);
	//   85  115:aload           4
	//   86  117:iload_2         
	//   87  118:iload_1         
	//   88  119:bipush          12
	//   89  121:ishr            
	//   90  122:sipush          224
	//   91  125:ior             
	//   92  126:int2byte        
	//   93  127:bastore         
			j = l + 1;
	//   94  128:iload_3         
	//   95  129:iconst_1        
	//   96  130:iadd            
	//   97  131:istore_2        
			abyte0[l] = (byte)(i >> 6 & 0x3f | 0x80);
	//   98  132:aload           4
	//   99  134:iload_3         
	//  100  135:iload_1         
	//  101  136:bipush          6
	//  102  138:ishr            
	//  103  139:bipush          63
	//  104  141:iand            
	//  105  142:sipush          128
	//  106  145:ior             
	//  107  146:int2byte        
	//  108  147:bastore         
			abyte0[j] = (byte)(i & 0x3f | 0x80);
	//  109  148:aload           4
	//  110  150:iload_2         
	//  111  151:iload_1         
	//  112  152:bipush          63
	//  113  154:iand            
	//  114  155:sipush          128
	//  115  158:ior             
	//  116  159:int2byte        
	//  117  160:bastore         
			return j + 1;
	//  118  161:iload_2         
	//  119  162:iconst_1        
	//  120  163:iadd            
	//  121  164:ireturn         
		}
	}

	private final int _outputRawMultiByteChar(int i, char ac[], int j, int k)
		throws IOException
	{
		if(i >= 55296 && i <= 57343)
	//*   0    0:iload_1         
	//*   1    1:ldc1            #120 <Int 55296>
	//*   2    3:icmplt          54
	//*   3    6:iload_1         
	//*   4    7:ldc1            #121 <Int 57343>
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
	//   12   23:ldc1            #125 <String "Split surrogate on writeRaw() input (last character): first character 0x%4x">
	//   13   25:iconst_1        
	//   14   26:anewarray       Object[]
	//   15   29:dup             
	//   16   30:iconst_0        
	//   17   31:iload_1         
	//   18   32:invokestatic    #133 <Method Integer Integer.valueOf(int)>
	//   19   35:aastore         
	//   20   36:invokestatic    #139 <Method String String.format(String, Object[])>
	//   21   39:invokevirtual   #143 <Method void _reportError(String)>
			_outputSurrogates(i, ((int) (ac[j])));
	//   22   42:aload_0         
	//   23   43:iload_1         
	//   24   44:aload_2         
	//   25   45:iload_3         
	//   26   46:caload          
	//   27   47:invokevirtual   #147 <Method void _outputSurrogates(int, int)>
			return j + 1;
	//   28   50:iload_3         
	//   29   51:iconst_1        
	//   30   52:iadd            
	//   31   53:ireturn         
		} else
		{
			ac = ((char []) (_outputBuffer));
	//   32   54:aload_0         
	//   33   55:getfield        #67  <Field byte[] _outputBuffer>
	//   34   58:astore_2        
			k = _outputTail;
	//   35   59:aload_0         
	//   36   60:getfield        #101 <Field int _outputTail>
	//   37   63:istore          4
			_outputTail = k + 1;
	//   38   65:aload_0         
	//   39   66:iload           4
	//   40   68:iconst_1        
	//   41   69:iadd            
	//   42   70:putfield        #101 <Field int _outputTail>
			ac[k] = ((char) ((byte)(i >> 12 | 0xe0)));
	//   43   73:aload_2         
	//   44   74:iload           4
	//   45   76:iload_1         
	//   46   77:bipush          12
	//   47   79:ishr            
	//   48   80:sipush          224
	//   49   83:ior             
	//   50   84:int2byte        
	//   51   85:bastore         
			k = _outputTail;
	//   52   86:aload_0         
	//   53   87:getfield        #101 <Field int _outputTail>
	//   54   90:istore          4
			_outputTail = k + 1;
	//   55   92:aload_0         
	//   56   93:iload           4
	//   57   95:iconst_1        
	//   58   96:iadd            
	//   59   97:putfield        #101 <Field int _outputTail>
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
	//   72  117:getfield        #101 <Field int _outputTail>
	//   73  120:istore          4
			_outputTail = k + 1;
	//   74  122:aload_0         
	//   75  123:iload           4
	//   76  125:iconst_1        
	//   77  126:iadd            
	//   78  127:putfield        #101 <Field int _outputTail>
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
	//   27   40:invokestatic    #154 <Method int Math.min(int, int)>
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
	//   41   63:invokevirtual   #160 <Method int InputStream.read(byte[], int, int)>
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
	//*   4    4:getfield        #101 <Field int _outputTail>
	//*   5    7:iload_2         
	//*   6    8:iadd            
	//*   7    9:aload_0         
	//*   8   10:getfield        #69  <Field int _outputEnd>
	//*   9   13:icmple          38
		{
			_flushBuffer();
	//   10   16:aload_0         
	//   11   17:invokevirtual   #104 <Method void _flushBuffer()>
			if(i > 512)
	//*  12   20:iload_2         
	//*  13   21:sipush          512
	//*  14   24:icmple          38
			{
				_outputStream.write(abyte0, 0, i);
	//   15   27:aload_0         
	//   16   28:getfield        #58  <Field OutputStream _outputStream>
	//   17   31:aload_1         
	//   18   32:iconst_0        
	//   19   33:iload_2         
	//   20   34:invokevirtual   #110 <Method void OutputStream.write(byte[], int, int)>
				return;
	//   21   37:return          
			}
		}
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (_outputBuffer)), _outputTail, i);
	//   22   38:aload_1         
	//   23   39:iconst_0        
	//   24   40:aload_0         
	//   25   41:getfield        #67  <Field byte[] _outputBuffer>
	//   26   44:aload_0         
	//   27   45:getfield        #101 <Field int _outputTail>
	//   28   48:iload_2         
	//   29   49:invokestatic    #116 <Method void System.arraycopy(Object, int, Object, int, int)>
		_outputTail = _outputTail + i;
	//   30   52:aload_0         
	//   31   53:aload_0         
	//   32   54:getfield        #101 <Field int _outputTail>
	//   33   57:iload_2         
	//   34   58:iadd            
	//   35   59:putfield        #101 <Field int _outputTail>
	//   36   62:return          
	}

	private final int _writeCustomEscape(byte abyte0[], int i, SerializableString serializablestring, int j)
		throws IOException, JsonGenerationException
	{
		serializablestring = ((SerializableString) (serializablestring.asUnquotedUTF8()));
	//    0    0:aload_3         
	//    1    1:invokeinterface #169 <Method byte[] SerializableString.asUnquotedUTF8()>
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
	//   13   22:getfield        #69  <Field int _outputEnd>
	//   14   25:aload_3         
	//   15   26:iload           4
	//   16   28:invokespecial   #171 <Method int _handleLongCustomEscape(byte[], int, int, byte[], int)>
	//   17   31:ireturn         
		} else
		{
			System.arraycopy(((Object) (serializablestring)), 0, ((Object) (abyte0)), i, k);
	//   18   32:aload_3         
	//   19   33:iconst_0        
	//   20   34:aload_1         
	//   21   35:iload_2         
	//   22   36:iload           5
	//   23   38:invokestatic    #116 <Method void System.arraycopy(Object, int, Object, int, int)>
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
	//*   1    1:getfield        #101 <Field int _outputTail>
	//*   2    4:iload_3         
	//*   3    5:iload_2         
	//*   4    6:isub            
	//*   5    7:bipush          6
	//*   6    9:imul            
	//*   7   10:iadd            
	//*   8   11:aload_0         
	//*   9   12:getfield        #69  <Field int _outputEnd>
	//*  10   15:icmple          22
			_flushBuffer();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #104 <Method void _flushBuffer()>
		int l = _outputTail;
	//   13   22:aload_0         
	//   14   23:getfield        #101 <Field int _outputTail>
	//   15   26:istore          5
		byte abyte0[] = _outputBuffer;
	//   16   28:aload_0         
	//   17   29:getfield        #67  <Field byte[] _outputBuffer>
	//   18   32:astore          8
		int ai[] = _outputEscapes;
	//   19   34:aload_0         
	//   20   35:getfield        #177 <Field int[] _outputEscapes>
	//   21   38:astore          9
		int j1;
		if(_maximumNonEscapedChar <= 0)
	//*  22   40:aload_0         
	//*  23   41:getfield        #180 <Field int _maximumNonEscapedChar>
	//*  24   44:ifgt            54
			j1 = 65535;
	//   25   47:ldc1            #181 <Int 65535>
	//   26   49:istore          6
		else
	//*  27   51:goto            60
			j1 = _maximumNonEscapedChar;
	//   28   54:aload_0         
	//   29   55:getfield        #180 <Field int _maximumNonEscapedChar>
	//   30   58:istore          6
		CharacterEscapes characterescapes = _characterEscapes;
	//   31   60:aload_0         
	//   32   61:getfield        #185 <Field CharacterEscapes _characterEscapes>
	//   33   64:astore          10
		int k = i;
	//   34   66:iload_2         
	//   35   67:istore          4
		i = l;
	//   36   69:iload           5
	//   37   71:istore_2        
		while(k < j) 
	//*  38   72:iload           4
	//*  39   74:iload_3         
	//*  40   75:icmpge          392
		{
			int i1 = k + 1;
	//   41   78:iload           4
	//   42   80:iconst_1        
	//   43   81:iadd            
	//   44   82:istore          5
			k = ((int) (s.charAt(k)));
	//   45   84:aload_1         
	//   46   85:iload           4
	//   47   87:invokevirtual   #189 <Method char String.charAt(int)>
	//   48   90:istore          4
			if(k <= '\177')
	//*  49   92:iload           4
	//*  50   94:bipush          127
	//*  51   96:icmpgt          270
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
					k = i1;
	//   61  114:iload           5
	//   62  116:istore          4
					i++;
	//   63  118:iload_2         
	//   64  119:iconst_1        
	//   65  120:iadd            
	//   66  121:istore_2        
				} else
	//*  67  122:goto            72
				{
					int k1 = ai[k];
	//   68  125:aload           9
	//   69  127:iload           4
	//   70  129:iaload          
	//   71  130:istore          7
					if(k1 > 0)
	//*  72  132:iload           7
	//*  73  134:ifle            168
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
						k = i1;
	//   91  161:iload           5
	//   92  163:istore          4
					} else
	//*  93  165:goto            72
					if(k1 == -2)
	//*  94  168:iload           7
	//*  95  170:bipush          -2
	//*  96  172:icmpne          255
					{
						SerializableString serializablestring = characterescapes.getEscapeSequence(k);
	//   97  175:aload           10
	//   98  177:iload           4
	//   99  179:invokevirtual   #195 <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//  100  182:astore          11
						if(serializablestring == null)
	//* 101  184:aload           11
	//* 102  186:ifnonnull       234
						{
							StringBuilder stringbuilder = new StringBuilder();
	//  103  189:new             #197 <Class StringBuilder>
	//  104  192:dup             
	//  105  193:invokespecial   #199 <Method void StringBuilder()>
	//  106  196:astore          12
							stringbuilder.append("Invalid custom escape definitions; custom escape not found for character code 0x");
	//  107  198:aload           12
	//  108  200:ldc1            #201 <String "Invalid custom escape definitions; custom escape not found for character code 0x">
	//  109  202:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  110  205:pop             
							stringbuilder.append(Integer.toHexString(k));
	//  111  206:aload           12
	//  112  208:iload           4
	//  113  210:invokestatic    #209 <Method String Integer.toHexString(int)>
	//  114  213:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  115  216:pop             
							stringbuilder.append(", although was supposed to have one");
	//  116  217:aload           12
	//  117  219:ldc1            #211 <String ", although was supposed to have one">
	//  118  221:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  119  224:pop             
							_reportError(stringbuilder.toString());
	//  120  225:aload_0         
	//  121  226:aload           12
	//  122  228:invokevirtual   #215 <Method String StringBuilder.toString()>
	//  123  231:invokevirtual   #143 <Method void _reportError(String)>
						}
						i = _writeCustomEscape(abyte0, i, serializablestring, j - i1);
	//  124  234:aload_0         
	//  125  235:aload           8
	//  126  237:iload_2         
	//  127  238:aload           11
	//  128  240:iload_3         
	//  129  241:iload           5
	//  130  243:isub            
	//  131  244:invokespecial   #217 <Method int _writeCustomEscape(byte[], int, SerializableString, int)>
	//  132  247:istore_2        
						k = i1;
	//  133  248:iload           5
	//  134  250:istore          4
					} else
	//* 135  252:goto            72
					{
						i = _writeGenericEscape(k, i);
	//  136  255:aload_0         
	//  137  256:iload           4
	//  138  258:iload_2         
	//  139  259:invokespecial   #220 <Method int _writeGenericEscape(int, int)>
	//  140  262:istore_2        
						k = i1;
	//  141  263:iload           5
	//  142  265:istore          4
					}
				}
			} else
	//* 143  267:goto            72
			if(k > j1)
	//* 144  270:iload           4
	//* 145  272:iload           6
	//* 146  274:icmple          292
			{
				i = _writeGenericEscape(k, i);
	//  147  277:aload_0         
	//  148  278:iload           4
	//  149  280:iload_2         
	//  150  281:invokespecial   #220 <Method int _writeGenericEscape(int, int)>
	//  151  284:istore_2        
				k = i1;
	//  152  285:iload           5
	//  153  287:istore          4
			} else
	//* 154  289:goto            72
			{
				SerializableString serializablestring1 = characterescapes.getEscapeSequence(k);
	//  155  292:aload           10
	//  156  294:iload           4
	//  157  296:invokevirtual   #195 <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//  158  299:astore          11
				if(serializablestring1 != null)
	//* 159  301:aload           11
	//* 160  303:ifnull          327
				{
					i = _writeCustomEscape(abyte0, i, serializablestring1, j - i1);
	//  161  306:aload_0         
	//  162  307:aload           8
	//  163  309:iload_2         
	//  164  310:aload           11
	//  165  312:iload_3         
	//  166  313:iload           5
	//  167  315:isub            
	//  168  316:invokespecial   #217 <Method int _writeCustomEscape(byte[], int, SerializableString, int)>
	//  169  319:istore_2        
					k = i1;
	//  170  320:iload           5
	//  171  322:istore          4
				} else
	//* 172  324:goto            72
				{
					if(k <= 2047)
	//* 173  327:iload           4
	//* 174  329:sipush          2047
	//* 175  332:icmpgt          377
					{
						int l1 = i + 1;
	//  176  335:iload_2         
	//  177  336:iconst_1        
	//  178  337:iadd            
	//  179  338:istore          7
						abyte0[i] = (byte)(k >> 6 | 0xc0);
	//  180  340:aload           8
	//  181  342:iload_2         
	//  182  343:iload           4
	//  183  345:bipush          6
	//  184  347:ishr            
	//  185  348:sipush          192
	//  186  351:ior             
	//  187  352:int2byte        
	//  188  353:bastore         
						i = l1 + 1;
	//  189  354:iload           7
	//  190  356:iconst_1        
	//  191  357:iadd            
	//  192  358:istore_2        
						abyte0[l1] = (byte)(k & 0x3f | 0x80);
	//  193  359:aload           8
	//  194  361:iload           7
	//  195  363:iload           4
	//  196  365:bipush          63
	//  197  367:iand            
	//  198  368:sipush          128
	//  199  371:ior             
	//  200  372:int2byte        
	//  201  373:bastore         
					} else
	//* 202  374:goto            385
					{
						i = _outputMultiByteChar(k, i);
	//  203  377:aload_0         
	//  204  378:iload           4
	//  205  380:iload_2         
	//  206  381:invokespecial   #222 <Method int _outputMultiByteChar(int, int)>
	//  207  384:istore_2        
					}
					k = i1;
	//  208  385:iload           5
	//  209  387:istore          4
				}
			}
		}
	//* 210  389:goto            72
		_outputTail = i;
	//  211  392:aload_0         
	//  212  393:iload_2         
	//  213  394:putfield        #101 <Field int _outputTail>
	//  214  397:return          
	}

	private final void _writeCustomStringSegment2(char ac[], int i, int j)
		throws IOException
	{
		if(_outputTail + (j - i) * 6 > _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field int _outputTail>
	//*   2    4:iload_3         
	//*   3    5:iload_2         
	//*   4    6:isub            
	//*   5    7:bipush          6
	//*   6    9:imul            
	//*   7   10:iadd            
	//*   8   11:aload_0         
	//*   9   12:getfield        #69  <Field int _outputEnd>
	//*  10   15:icmple          22
			_flushBuffer();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #104 <Method void _flushBuffer()>
		int l = _outputTail;
	//   13   22:aload_0         
	//   14   23:getfield        #101 <Field int _outputTail>
	//   15   26:istore          5
		byte abyte0[] = _outputBuffer;
	//   16   28:aload_0         
	//   17   29:getfield        #67  <Field byte[] _outputBuffer>
	//   18   32:astore          8
		int ai[] = _outputEscapes;
	//   19   34:aload_0         
	//   20   35:getfield        #177 <Field int[] _outputEscapes>
	//   21   38:astore          9
		int j1;
		if(_maximumNonEscapedChar <= 0)
	//*  22   40:aload_0         
	//*  23   41:getfield        #180 <Field int _maximumNonEscapedChar>
	//*  24   44:ifgt            54
			j1 = 65535;
	//   25   47:ldc1            #181 <Int 65535>
	//   26   49:istore          6
		else
	//*  27   51:goto            60
			j1 = _maximumNonEscapedChar;
	//   28   54:aload_0         
	//   29   55:getfield        #180 <Field int _maximumNonEscapedChar>
	//   30   58:istore          6
		CharacterEscapes characterescapes = _characterEscapes;
	//   31   60:aload_0         
	//   32   61:getfield        #185 <Field CharacterEscapes _characterEscapes>
	//   33   64:astore          10
		int k = i;
	//   34   66:iload_2         
	//   35   67:istore          4
		i = l;
	//   36   69:iload           5
	//   37   71:istore_2        
		while(k < j) 
	//*  38   72:iload           4
	//*  39   74:iload_3         
	//*  40   75:icmpge          390
		{
			int i1 = k + 1;
	//   41   78:iload           4
	//   42   80:iconst_1        
	//   43   81:iadd            
	//   44   82:istore          5
			k = ((int) (ac[k]));
	//   45   84:aload_1         
	//   46   85:iload           4
	//   47   87:caload          
	//   48   88:istore          4
			if(k <= '\177')
	//*  49   90:iload           4
	//*  50   92:bipush          127
	//*  51   94:icmpgt          268
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
					k = i1;
	//   61  112:iload           5
	//   62  114:istore          4
					i++;
	//   63  116:iload_2         
	//   64  117:iconst_1        
	//   65  118:iadd            
	//   66  119:istore_2        
				} else
	//*  67  120:goto            72
				{
					int k1 = ai[k];
	//   68  123:aload           9
	//   69  125:iload           4
	//   70  127:iaload          
	//   71  128:istore          7
					if(k1 > 0)
	//*  72  130:iload           7
	//*  73  132:ifle            166
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
						k = i1;
	//   91  159:iload           5
	//   92  161:istore          4
					} else
	//*  93  163:goto            72
					if(k1 == -2)
	//*  94  166:iload           7
	//*  95  168:bipush          -2
	//*  96  170:icmpne          253
					{
						SerializableString serializablestring = characterescapes.getEscapeSequence(k);
	//   97  173:aload           10
	//   98  175:iload           4
	//   99  177:invokevirtual   #195 <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//  100  180:astore          11
						if(serializablestring == null)
	//* 101  182:aload           11
	//* 102  184:ifnonnull       232
						{
							StringBuilder stringbuilder = new StringBuilder();
	//  103  187:new             #197 <Class StringBuilder>
	//  104  190:dup             
	//  105  191:invokespecial   #199 <Method void StringBuilder()>
	//  106  194:astore          12
							stringbuilder.append("Invalid custom escape definitions; custom escape not found for character code 0x");
	//  107  196:aload           12
	//  108  198:ldc1            #201 <String "Invalid custom escape definitions; custom escape not found for character code 0x">
	//  109  200:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  110  203:pop             
							stringbuilder.append(Integer.toHexString(k));
	//  111  204:aload           12
	//  112  206:iload           4
	//  113  208:invokestatic    #209 <Method String Integer.toHexString(int)>
	//  114  211:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  115  214:pop             
							stringbuilder.append(", although was supposed to have one");
	//  116  215:aload           12
	//  117  217:ldc1            #211 <String ", although was supposed to have one">
	//  118  219:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  119  222:pop             
							_reportError(stringbuilder.toString());
	//  120  223:aload_0         
	//  121  224:aload           12
	//  122  226:invokevirtual   #215 <Method String StringBuilder.toString()>
	//  123  229:invokevirtual   #143 <Method void _reportError(String)>
						}
						i = _writeCustomEscape(abyte0, i, serializablestring, j - i1);
	//  124  232:aload_0         
	//  125  233:aload           8
	//  126  235:iload_2         
	//  127  236:aload           11
	//  128  238:iload_3         
	//  129  239:iload           5
	//  130  241:isub            
	//  131  242:invokespecial   #217 <Method int _writeCustomEscape(byte[], int, SerializableString, int)>
	//  132  245:istore_2        
						k = i1;
	//  133  246:iload           5
	//  134  248:istore          4
					} else
	//* 135  250:goto            72
					{
						i = _writeGenericEscape(k, i);
	//  136  253:aload_0         
	//  137  254:iload           4
	//  138  256:iload_2         
	//  139  257:invokespecial   #220 <Method int _writeGenericEscape(int, int)>
	//  140  260:istore_2        
						k = i1;
	//  141  261:iload           5
	//  142  263:istore          4
					}
				}
			} else
	//* 143  265:goto            72
			if(k > j1)
	//* 144  268:iload           4
	//* 145  270:iload           6
	//* 146  272:icmple          290
			{
				i = _writeGenericEscape(k, i);
	//  147  275:aload_0         
	//  148  276:iload           4
	//  149  278:iload_2         
	//  150  279:invokespecial   #220 <Method int _writeGenericEscape(int, int)>
	//  151  282:istore_2        
				k = i1;
	//  152  283:iload           5
	//  153  285:istore          4
			} else
	//* 154  287:goto            72
			{
				SerializableString serializablestring1 = characterescapes.getEscapeSequence(k);
	//  155  290:aload           10
	//  156  292:iload           4
	//  157  294:invokevirtual   #195 <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//  158  297:astore          11
				if(serializablestring1 != null)
	//* 159  299:aload           11
	//* 160  301:ifnull          325
				{
					i = _writeCustomEscape(abyte0, i, serializablestring1, j - i1);
	//  161  304:aload_0         
	//  162  305:aload           8
	//  163  307:iload_2         
	//  164  308:aload           11
	//  165  310:iload_3         
	//  166  311:iload           5
	//  167  313:isub            
	//  168  314:invokespecial   #217 <Method int _writeCustomEscape(byte[], int, SerializableString, int)>
	//  169  317:istore_2        
					k = i1;
	//  170  318:iload           5
	//  171  320:istore          4
				} else
	//* 172  322:goto            72
				{
					if(k <= 2047)
	//* 173  325:iload           4
	//* 174  327:sipush          2047
	//* 175  330:icmpgt          375
					{
						int l1 = i + 1;
	//  176  333:iload_2         
	//  177  334:iconst_1        
	//  178  335:iadd            
	//  179  336:istore          7
						abyte0[i] = (byte)(k >> 6 | 0xc0);
	//  180  338:aload           8
	//  181  340:iload_2         
	//  182  341:iload           4
	//  183  343:bipush          6
	//  184  345:ishr            
	//  185  346:sipush          192
	//  186  349:ior             
	//  187  350:int2byte        
	//  188  351:bastore         
						i = l1 + 1;
	//  189  352:iload           7
	//  190  354:iconst_1        
	//  191  355:iadd            
	//  192  356:istore_2        
						abyte0[l1] = (byte)(k & 0x3f | 0x80);
	//  193  357:aload           8
	//  194  359:iload           7
	//  195  361:iload           4
	//  196  363:bipush          63
	//  197  365:iand            
	//  198  366:sipush          128
	//  199  369:ior             
	//  200  370:int2byte        
	//  201  371:bastore         
					} else
	//* 202  372:goto            383
					{
						i = _outputMultiByteChar(k, i);
	//  203  375:aload_0         
	//  204  376:iload           4
	//  205  378:iload_2         
	//  206  379:invokespecial   #222 <Method int _outputMultiByteChar(int, int)>
	//  207  382:istore_2        
					}
					k = i1;
	//  208  383:iload           5
	//  209  385:istore          4
				}
			}
		}
	//* 210  387:goto            72
		_outputTail = i;
	//  211  390:aload_0         
	//  212  391:iload_2         
	//  213  392:putfield        #101 <Field int _outputTail>
	//  214  395:return          
	}

	private int _writeGenericEscape(int i, int j)
		throws IOException
	{
		byte abyte0[] = _outputBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field byte[] _outputBuffer>
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
	//*  21   30:icmple          88
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
			byte abyte1[] = HEX_CHARS;
	//   32   47:getstatic       #33  <Field byte[] HEX_CHARS>
	//   33   50:astore          6
			abyte0[j] = abyte1[k >> 4];
	//   34   52:aload           5
	//   35   54:iload_2         
	//   36   55:aload           6
	//   37   57:iload_3         
	//   38   58:iconst_4        
	//   39   59:ishr            
	//   40   60:baload          
	//   41   61:bastore         
			j = l + 1;
	//   42   62:iload           4
	//   43   64:iconst_1        
	//   44   65:iadd            
	//   45   66:istore_2        
			abyte0[l] = abyte1[k & 0xf];
	//   46   67:aload           5
	//   47   69:iload           4
	//   48   71:aload           6
	//   49   73:iload_3         
	//   50   74:bipush          15
	//   51   76:iand            
	//   52   77:baload          
	//   53   78:bastore         
			i &= 0xff;
	//   54   79:iload_1         
	//   55   80:sipush          255
	//   56   83:iand            
	//   57   84:istore_1        
		} else
	//*  58   85:goto            108
		{
			k = j + 1;
	//   59   88:iload_2         
	//   60   89:iconst_1        
	//   61   90:iadd            
	//   62   91:istore_3        
			abyte0[j] = 48;
	//   63   92:aload           5
	//   64   94:iload_2         
	//   65   95:bipush          48
	//   66   97:bastore         
			j = k + 1;
	//   67   98:iload_3         
	//   68   99:iconst_1        
	//   69  100:iadd            
	//   70  101:istore_2        
			abyte0[k] = 48;
	//   71  102:aload           5
	//   72  104:iload_3         
	//   73  105:bipush          48
	//   74  107:bastore         
		}
		k = j + 1;
	//   75  108:iload_2         
	//   76  109:iconst_1        
	//   77  110:iadd            
	//   78  111:istore_3        
		byte abyte2[] = HEX_CHARS;
	//   79  112:getstatic       #33  <Field byte[] HEX_CHARS>
	//   80  115:astore          6
		abyte0[j] = abyte2[i >> 4];
	//   81  117:aload           5
	//   82  119:iload_2         
	//   83  120:aload           6
	//   84  122:iload_1         
	//   85  123:iconst_4        
	//   86  124:ishr            
	//   87  125:baload          
	//   88  126:bastore         
		abyte0[k] = abyte2[i & 0xf];
	//   89  127:aload           5
	//   90  129:iload_3         
	//   91  130:aload           6
	//   92  132:iload_1         
	//   93  133:bipush          15
	//   94  135:iand            
	//   95  136:baload          
	//   96  137:bastore         
		return k + 1;
	//   97  138:iload_3         
	//   98  139:iconst_1        
	//   99  140:iadd            
	//  100  141:ireturn         
	}

	private final void _writeNull()
		throws IOException
	{
		if(_outputTail + 4 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field int _outputTail>
	//*   2    4:iconst_4        
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #69  <Field int _outputEnd>
	//*   6   10:icmplt          17
			_flushBuffer();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #104 <Method void _flushBuffer()>
		System.arraycopy(((Object) (NULL_BYTES)), 0, ((Object) (_outputBuffer)), _outputTail, 4);
	//    9   17:getstatic       #38  <Field byte[] NULL_BYTES>
	//   10   20:iconst_0        
	//   11   21:aload_0         
	//   12   22:getfield        #67  <Field byte[] _outputBuffer>
	//   13   25:aload_0         
	//   14   26:getfield        #101 <Field int _outputTail>
	//   15   29:iconst_4        
	//   16   30:invokestatic    #116 <Method void System.arraycopy(Object, int, Object, int, int)>
		_outputTail = _outputTail + 4;
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #101 <Field int _outputTail>
	//   20   38:iconst_4        
	//   21   39:iadd            
	//   22   40:putfield        #101 <Field int _outputTail>
	//   23   43:return          
	}

	private final void _writeQuotedInt(int i)
		throws IOException
	{
		if(_outputTail + 13 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field int _outputTail>
	//*   2    4:bipush          13
	//*   3    6:iadd            
	//*   4    7:aload_0         
	//*   5    8:getfield        #69  <Field int _outputEnd>
	//*   6   11:icmplt          18
			_flushBuffer();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #104 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//    9   18:aload_0         
	//   10   19:getfield        #67  <Field byte[] _outputBuffer>
	//   11   22:astore_3        
		int j = _outputTail;
	//   12   23:aload_0         
	//   13   24:getfield        #101 <Field int _outputTail>
	//   14   27:istore_2        
		_outputTail = j + 1;
	//   15   28:aload_0         
	//   16   29:iload_2         
	//   17   30:iconst_1        
	//   18   31:iadd            
	//   19   32:putfield        #101 <Field int _outputTail>
		abyte0[j] = _quoteChar;
	//   20   35:aload_3         
	//   21   36:iload_2         
	//   22   37:aload_0         
	//   23   38:getfield        #56  <Field byte _quoteChar>
	//   24   41:bastore         
		_outputTail = NumberOutput.outputInt(i, abyte0, _outputTail);
	//   25   42:aload_0         
	//   26   43:iload_1         
	//   27   44:aload_3         
	//   28   45:aload_0         
	//   29   46:getfield        #101 <Field int _outputTail>
	//   30   49:invokestatic    #232 <Method int NumberOutput.outputInt(int, byte[], int)>
	//   31   52:putfield        #101 <Field int _outputTail>
		abyte0 = _outputBuffer;
	//   32   55:aload_0         
	//   33   56:getfield        #67  <Field byte[] _outputBuffer>
	//   34   59:astore_3        
		i = _outputTail;
	//   35   60:aload_0         
	//   36   61:getfield        #101 <Field int _outputTail>
	//   37   64:istore_1        
		_outputTail = i + 1;
	//   38   65:aload_0         
	//   39   66:iload_1         
	//   40   67:iconst_1        
	//   41   68:iadd            
	//   42   69:putfield        #101 <Field int _outputTail>
		abyte0[i] = _quoteChar;
	//   43   72:aload_3         
	//   44   73:iload_1         
	//   45   74:aload_0         
	//   46   75:getfield        #56  <Field byte _quoteChar>
	//   47   78:bastore         
	//   48   79:return          
	}

	private final void _writeQuotedLong(long l)
		throws IOException
	{
		if(_outputTail + 23 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field int _outputTail>
	//*   2    4:bipush          23
	//*   3    6:iadd            
	//*   4    7:aload_0         
	//*   5    8:getfield        #69  <Field int _outputEnd>
	//*   6   11:icmplt          18
			_flushBuffer();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #104 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//    9   18:aload_0         
	//   10   19:getfield        #67  <Field byte[] _outputBuffer>
	//   11   22:astore          4
		int i = _outputTail;
	//   12   24:aload_0         
	//   13   25:getfield        #101 <Field int _outputTail>
	//   14   28:istore_3        
		_outputTail = i + 1;
	//   15   29:aload_0         
	//   16   30:iload_3         
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:putfield        #101 <Field int _outputTail>
		abyte0[i] = _quoteChar;
	//   20   36:aload           4
	//   21   38:iload_3         
	//   22   39:aload_0         
	//   23   40:getfield        #56  <Field byte _quoteChar>
	//   24   43:bastore         
		_outputTail = NumberOutput.outputLong(l, abyte0, _outputTail);
	//   25   44:aload_0         
	//   26   45:lload_1         
	//   27   46:aload           4
	//   28   48:aload_0         
	//   29   49:getfield        #101 <Field int _outputTail>
	//   30   52:invokestatic    #238 <Method int NumberOutput.outputLong(long, byte[], int)>
	//   31   55:putfield        #101 <Field int _outputTail>
		abyte0 = _outputBuffer;
	//   32   58:aload_0         
	//   33   59:getfield        #67  <Field byte[] _outputBuffer>
	//   34   62:astore          4
		i = _outputTail;
	//   35   64:aload_0         
	//   36   65:getfield        #101 <Field int _outputTail>
	//   37   68:istore_3        
		_outputTail = i + 1;
	//   38   69:aload_0         
	//   39   70:iload_3         
	//   40   71:iconst_1        
	//   41   72:iadd            
	//   42   73:putfield        #101 <Field int _outputTail>
		abyte0[i] = _quoteChar;
	//   43   76:aload           4
	//   44   78:iload_3         
	//   45   79:aload_0         
	//   46   80:getfield        #56  <Field byte _quoteChar>
	//   47   83:bastore         
	//   48   84:return          
	}

	private final void _writeQuotedRaw(String s)
		throws IOException
	{
		if(_outputTail >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field int _outputTail>
	//*   2    4:aload_0         
	//*   3    5:getfield        #69  <Field int _outputEnd>
	//*   4    8:icmplt          15
			_flushBuffer();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #104 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #67  <Field byte[] _outputBuffer>
	//    9   19:astore_3        
		int i = _outputTail;
	//   10   20:aload_0         
	//   11   21:getfield        #101 <Field int _outputTail>
	//   12   24:istore_2        
		_outputTail = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #101 <Field int _outputTail>
		abyte0[i] = _quoteChar;
	//   18   32:aload_3         
	//   19   33:iload_2         
	//   20   34:aload_0         
	//   21   35:getfield        #56  <Field byte _quoteChar>
	//   22   38:bastore         
		writeRaw(s);
	//   23   39:aload_0         
	//   24   40:aload_1         
	//   25   41:invokevirtual   #242 <Method void writeRaw(String)>
		if(_outputTail >= _outputEnd)
	//*  26   44:aload_0         
	//*  27   45:getfield        #101 <Field int _outputTail>
	//*  28   48:aload_0         
	//*  29   49:getfield        #69  <Field int _outputEnd>
	//*  30   52:icmplt          59
			_flushBuffer();
	//   31   55:aload_0         
	//   32   56:invokevirtual   #104 <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//   33   59:aload_0         
	//   34   60:getfield        #67  <Field byte[] _outputBuffer>
	//   35   63:astore_1        
		i = _outputTail;
	//   36   64:aload_0         
	//   37   65:getfield        #101 <Field int _outputTail>
	//   38   68:istore_2        
		_outputTail = i + 1;
	//   39   69:aload_0         
	//   40   70:iload_2         
	//   41   71:iconst_1        
	//   42   72:iadd            
	//   43   73:putfield        #101 <Field int _outputTail>
		s[i] = _quoteChar;
	//   44   76:aload_1         
	//   45   77:iload_2         
	//   46   78:aload_0         
	//   47   79:getfield        #56  <Field byte _quoteChar>
	//   48   82:bastore         
	//   49   83:return          
	}

	private final void _writeQuotedShort(short word0)
		throws IOException
	{
		if(_outputTail + 8 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field int _outputTail>
	//*   2    4:bipush          8
	//*   3    6:iadd            
	//*   4    7:aload_0         
	//*   5    8:getfield        #69  <Field int _outputEnd>
	//*   6   11:icmplt          18
			_flushBuffer();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #104 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//    9   18:aload_0         
	//   10   19:getfield        #67  <Field byte[] _outputBuffer>
	//   11   22:astore_3        
		int i = _outputTail;
	//   12   23:aload_0         
	//   13   24:getfield        #101 <Field int _outputTail>
	//   14   27:istore_2        
		_outputTail = i + 1;
	//   15   28:aload_0         
	//   16   29:iload_2         
	//   17   30:iconst_1        
	//   18   31:iadd            
	//   19   32:putfield        #101 <Field int _outputTail>
		abyte0[i] = _quoteChar;
	//   20   35:aload_3         
	//   21   36:iload_2         
	//   22   37:aload_0         
	//   23   38:getfield        #56  <Field byte _quoteChar>
	//   24   41:bastore         
		_outputTail = NumberOutput.outputInt(((int) (word0)), abyte0, _outputTail);
	//   25   42:aload_0         
	//   26   43:iload_1         
	//   27   44:aload_3         
	//   28   45:aload_0         
	//   29   46:getfield        #101 <Field int _outputTail>
	//   30   49:invokestatic    #232 <Method int NumberOutput.outputInt(int, byte[], int)>
	//   31   52:putfield        #101 <Field int _outputTail>
		abyte0 = _outputBuffer;
	//   32   55:aload_0         
	//   33   56:getfield        #67  <Field byte[] _outputBuffer>
	//   34   59:astore_3        
		word0 = ((short) (_outputTail));
	//   35   60:aload_0         
	//   36   61:getfield        #101 <Field int _outputTail>
	//   37   64:istore_1        
		_outputTail = word0 + 1;
	//   38   65:aload_0         
	//   39   66:iload_1         
	//   40   67:iconst_1        
	//   41   68:iadd            
	//   42   69:putfield        #101 <Field int _outputTail>
		abyte0[word0] = _quoteChar;
	//   43   72:aload_3         
	//   44   73:iload_1         
	//   45   74:aload_0         
	//   46   75:getfield        #56  <Field byte _quoteChar>
	//   47   78:bastore         
	//   48   79:return          
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
	//*   2    2:icmpge          156
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
	//*   9   14:icmple          114
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
	//*  20   30:icmpge          101
						{
							byte abyte0[] = _outputBuffer;
	//   21   33:aload_0         
	//   22   34:getfield        #67  <Field byte[] _outputBuffer>
	//   23   37:astore          6
							int l = _outputTail;
	//   24   39:aload_0         
	//   25   40:getfield        #101 <Field int _outputTail>
	//   26   43:istore          5
							_outputTail = l + 1;
	//   27   45:aload_0         
	//   28   46:iload           5
	//   29   48:iconst_1        
	//   30   49:iadd            
	//   31   50:putfield        #101 <Field int _outputTail>
							abyte0[l] = (byte)(i >> 6 | 0xc0);
	//   32   53:aload           6
	//   33   55:iload           5
	//   34   57:iload_2         
	//   35   58:bipush          6
	//   36   60:ishr            
	//   37   61:sipush          192
	//   38   64:ior             
	//   39   65:int2byte        
	//   40   66:bastore         
							l = _outputTail;
	//   41   67:aload_0         
	//   42   68:getfield        #101 <Field int _outputTail>
	//   43   71:istore          5
							_outputTail = l + 1;
	//   44   73:aload_0         
	//   45   74:iload           5
	//   46   76:iconst_1        
	//   47   77:iadd            
	//   48   78:putfield        #101 <Field int _outputTail>
							abyte0[l] = (byte)(i & 0x3f | 0x80);
	//   49   81:aload           6
	//   50   83:iload           5
	//   51   85:iload_2         
	//   52   86:bipush          63
	//   53   88:iand            
	//   54   89:sipush          128
	//   55   92:ior             
	//   56   93:int2byte        
	//   57   94:bastore         
							i = k;
	//   58   95:iload           4
	//   59   97:istore_2        
						} else
	//*  60   98:goto            0
						{
							i = _outputRawMultiByteChar(i, ac, k, j);
	//   61  101:aload_0         
	//   62  102:iload_2         
	//   63  103:aload_1         
	//   64  104:iload           4
	//   65  106:iload_3         
	//   66  107:invokespecial   #247 <Method int _outputRawMultiByteChar(int, char[], int, int)>
	//   67  110:istore_2        
						}
						continue label0;
	//   68  111:goto            0
					}
					byte abyte1[] = _outputBuffer;
	//   69  114:aload_0         
	//   70  115:getfield        #67  <Field byte[] _outputBuffer>
	//   71  118:astore          6
					int i1 = _outputTail;
	//   72  120:aload_0         
	//   73  121:getfield        #101 <Field int _outputTail>
	//   74  124:istore          5
					_outputTail = i1 + 1;
	//   75  126:aload_0         
	//   76  127:iload           5
	//   77  129:iconst_1        
	//   78  130:iadd            
	//   79  131:putfield        #101 <Field int _outputTail>
					abyte1[i1] = (byte)k;
	//   80  134:aload           6
	//   81  136:iload           5
	//   82  138:iload           4
	//   83  140:int2byte        
	//   84  141:bastore         
					k = i + 1;
	//   85  142:iload_2         
	//   86  143:iconst_1        
	//   87  144:iadd            
	//   88  145:istore          4
					i = k;
	//   89  147:iload           4
	//   90  149:istore_2        
				} while(k < j);
	//   91  150:iload           4
	//   92  152:iload_3         
	//   93  153:icmplt          5
			return;
	//   94  156:return          
		} while(true);
	}

	private final void _writeSegmentedRaw(char ac[], int i, int j)
		throws IOException
	{
		int k = _outputEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int _outputEnd>
	//    2    4:istore          4
		byte abyte0[] = _outputBuffer;
	//    3    6:aload_0         
	//    4    7:getfield        #67  <Field byte[] _outputBuffer>
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
	//*  21   35:getfield        #101 <Field int _outputTail>
	//*  22   38:iconst_3        
	//*  23   39:iadd            
	//*  24   40:aload_0         
	//*  25   41:getfield        #69  <Field int _outputEnd>
	//*  26   44:icmplt          51
							_flushBuffer();
	//   27   47:aload_0         
	//   28   48:invokevirtual   #104 <Method void _flushBuffer()>
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
	//   41   67:getfield        #101 <Field int _outputTail>
	//   42   70:istore          6
							_outputTail = i1 + 1;
	//   43   72:aload_0         
	//   44   73:iload           6
	//   45   75:iconst_1        
	//   46   76:iadd            
	//   47   77:putfield        #101 <Field int _outputTail>
							abyte0[i1] = (byte)(i >> 6 | 0xc0);
	//   48   80:aload           7
	//   49   82:iload           6
	//   50   84:iload_2         
	//   51   85:bipush          6
	//   52   87:ishr            
	//   53   88:sipush          192
	//   54   91:ior             
	//   55   92:int2byte        
	//   56   93:bastore         
							i1 = _outputTail;
	//   57   94:aload_0         
	//   58   95:getfield        #101 <Field int _outputTail>
	//   59   98:istore          6
							_outputTail = i1 + 1;
	//   60  100:aload_0         
	//   61  101:iload           6
	//   62  103:iconst_1        
	//   63  104:iadd            
	//   64  105:putfield        #101 <Field int _outputTail>
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
	//   82  133:invokespecial   #247 <Method int _outputRawMultiByteChar(int, char[], int, int)>
	//   83  136:istore_2        
						}
						continue label0;
	//   84  137:goto            17
					}
					if(_outputTail >= k)
	//*  85  140:aload_0         
	//*  86  141:getfield        #101 <Field int _outputTail>
	//*  87  144:iload           4
	//*  88  146:icmplt          153
						_flushBuffer();
	//   89  149:aload_0         
	//   90  150:invokevirtual   #104 <Method void _flushBuffer()>
					int j1 = _outputTail;
	//   91  153:aload_0         
	//   92  154:getfield        #101 <Field int _outputTail>
	//   93  157:istore          6
					_outputTail = j1 + 1;
	//   94  159:aload_0         
	//   95  160:iload           6
	//   96  162:iconst_1        
	//   97  163:iadd            
	//   98  164:putfield        #101 <Field int _outputTail>
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
	//    5    6:getfield        #101 <Field int _outputTail>
	//    6    9:istore          4
		byte abyte0[] = _outputBuffer;
	//    7   11:aload_0         
	//    8   12:getfield        #67  <Field byte[] _outputBuffer>
	//    9   15:astore          6
		int ai[] = _outputEscapes;
	//   10   17:aload_0         
	//   11   18:getfield        #177 <Field int[] _outputEscapes>
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
	//   22   36:invokevirtual   #189 <Method char String.charAt(int)>
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
	//   48   79:putfield        #101 <Field int _outputTail>
		if(j < l)
	//*  49   82:iload_3         
	//*  50   83:iload           5
	//*  51   85:icmpge          128
		{
			if(_characterEscapes != null)
	//*  52   88:aload_0         
	//*  53   89:getfield        #185 <Field CharacterEscapes _characterEscapes>
	//*  54   92:ifnull          104
			{
				_writeCustomStringSegment2(s, j, l);
	//   55   95:aload_0         
	//   56   96:aload_1         
	//   57   97:iload_3         
	//   58   98:iload           5
	//   59  100:invokespecial   #251 <Method void _writeCustomStringSegment2(String, int, int)>
				return;
	//   60  103:return          
			}
			if(_maximumNonEscapedChar == 0)
	//*  61  104:aload_0         
	//*  62  105:getfield        #180 <Field int _maximumNonEscapedChar>
	//*  63  108:ifne            120
			{
				_writeStringSegment2(s, j, l);
	//   64  111:aload_0         
	//   65  112:aload_1         
	//   66  113:iload_3         
	//   67  114:iload           5
	//   68  116:invokespecial   #254 <Method void _writeStringSegment2(String, int, int)>
				return;
	//   69  119:return          
			}
			_writeStringSegmentASCII2(s, j, l);
	//   70  120:aload_0         
	//   71  121:aload_1         
	//   72  122:iload_3         
	//   73  123:iload           5
	//   74  125:invokespecial   #257 <Method void _writeStringSegmentASCII2(String, int, int)>
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
	//    5    6:getfield        #101 <Field int _outputTail>
	//    6    9:istore          4
		byte abyte0[] = _outputBuffer;
	//    7   11:aload_0         
	//    8   12:getfield        #67  <Field byte[] _outputBuffer>
	//    9   15:astore          6
		int ai[] = _outputEscapes;
	//   10   17:aload_0         
	//   11   18:getfield        #177 <Field int[] _outputEscapes>
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
	//   48   77:putfield        #101 <Field int _outputTail>
		if(j < l)
	//*  49   80:iload_3         
	//*  50   81:iload           5
	//*  51   83:icmpge          126
		{
			if(_characterEscapes != null)
	//*  52   86:aload_0         
	//*  53   87:getfield        #185 <Field CharacterEscapes _characterEscapes>
	//*  54   90:ifnull          102
			{
				_writeCustomStringSegment2(ac, j, l);
	//   55   93:aload_0         
	//   56   94:aload_1         
	//   57   95:iload_3         
	//   58   96:iload           5
	//   59   98:invokespecial   #259 <Method void _writeCustomStringSegment2(char[], int, int)>
				return;
	//   60  101:return          
			}
			if(_maximumNonEscapedChar == 0)
	//*  61  102:aload_0         
	//*  62  103:getfield        #180 <Field int _maximumNonEscapedChar>
	//*  63  106:ifne            118
			{
				_writeStringSegment2(ac, j, l);
	//   64  109:aload_0         
	//   65  110:aload_1         
	//   66  111:iload_3         
	//   67  112:iload           5
	//   68  114:invokespecial   #261 <Method void _writeStringSegment2(char[], int, int)>
				return;
	//   69  117:return          
			}
			_writeStringSegmentASCII2(ac, j, l);
	//   70  118:aload_0         
	//   71  119:aload_1         
	//   72  120:iload_3         
	//   73  121:iload           5
	//   74  123:invokespecial   #263 <Method void _writeStringSegmentASCII2(char[], int, int)>
		}
	//   75  126:return          
	}

	private final void _writeStringSegment2(String s, int i, int j)
		throws IOException
	{
		if(_outputTail + (j - i) * 6 > _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field int _outputTail>
	//*   2    4:iload_3         
	//*   3    5:iload_2         
	//*   4    6:isub            
	//*   5    7:bipush          6
	//*   6    9:imul            
	//*   7   10:iadd            
	//*   8   11:aload_0         
	//*   9   12:getfield        #69  <Field int _outputEnd>
	//*  10   15:icmple          22
			_flushBuffer();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #104 <Method void _flushBuffer()>
		int l = _outputTail;
	//   13   22:aload_0         
	//   14   23:getfield        #101 <Field int _outputTail>
	//   15   26:istore          5
		byte abyte0[] = _outputBuffer;
	//   16   28:aload_0         
	//   17   29:getfield        #67  <Field byte[] _outputBuffer>
	//   18   32:astore          7
		int ai[] = _outputEscapes;
	//   19   34:aload_0         
	//   20   35:getfield        #177 <Field int[] _outputEscapes>
	//   21   38:astore          8
		int k = i;
	//   22   40:iload_2         
	//   23   41:istore          4
		i = l;
	//   24   43:iload           5
	//   25   45:istore_2        
		while(k < j) 
	//*  26   46:iload           4
	//*  27   48:iload_3         
	//*  28   49:icmpge          222
		{
			int i1 = k + 1;
	//   29   52:iload           4
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore          5
			k = ((int) (s.charAt(k)));
	//   33   58:aload_1         
	//   34   59:iload           4
	//   35   61:invokevirtual   #189 <Method char String.charAt(int)>
	//   36   64:istore          4
			if(k <= '\177')
	//*  37   66:iload           4
	//*  38   68:bipush          127
	//*  39   70:icmpgt          157
			{
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
				} else
	//*  55   96:goto            46
				{
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
						k = i1;
	//   79  135:iload           5
	//   80  137:istore          4
					} else
	//*  81  139:goto            46
					{
						i = _writeGenericEscape(k, i);
	//   82  142:aload_0         
	//   83  143:iload           4
	//   84  145:iload_2         
	//   85  146:invokespecial   #220 <Method int _writeGenericEscape(int, int)>
	//   86  149:istore_2        
						k = i1;
	//   87  150:iload           5
	//   88  152:istore          4
					}
				}
			} else
	//*  89  154:goto            46
			{
				if(k <= 2047)
	//*  90  157:iload           4
	//*  91  159:sipush          2047
	//*  92  162:icmpgt          207
				{
					int k1 = i + 1;
	//   93  165:iload_2         
	//   94  166:iconst_1        
	//   95  167:iadd            
	//   96  168:istore          6
					abyte0[i] = (byte)(k >> 6 | 0xc0);
	//   97  170:aload           7
	//   98  172:iload_2         
	//   99  173:iload           4
	//  100  175:bipush          6
	//  101  177:ishr            
	//  102  178:sipush          192
	//  103  181:ior             
	//  104  182:int2byte        
	//  105  183:bastore         
					i = k1 + 1;
	//  106  184:iload           6
	//  107  186:iconst_1        
	//  108  187:iadd            
	//  109  188:istore_2        
					abyte0[k1] = (byte)(k & 0x3f | 0x80);
	//  110  189:aload           7
	//  111  191:iload           6
	//  112  193:iload           4
	//  113  195:bipush          63
	//  114  197:iand            
	//  115  198:sipush          128
	//  116  201:ior             
	//  117  202:int2byte        
	//  118  203:bastore         
				} else
	//* 119  204:goto            215
				{
					i = _outputMultiByteChar(k, i);
	//  120  207:aload_0         
	//  121  208:iload           4
	//  122  210:iload_2         
	//  123  211:invokespecial   #222 <Method int _outputMultiByteChar(int, int)>
	//  124  214:istore_2        
				}
				k = i1;
	//  125  215:iload           5
	//  126  217:istore          4
			}
		}
	//* 127  219:goto            46
		_outputTail = i;
	//  128  222:aload_0         
	//  129  223:iload_2         
	//  130  224:putfield        #101 <Field int _outputTail>
	//  131  227:return          
	}

	private final void _writeStringSegment2(char ac[], int i, int j)
		throws IOException
	{
		if(_outputTail + (j - i) * 6 > _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field int _outputTail>
	//*   2    4:iload_3         
	//*   3    5:iload_2         
	//*   4    6:isub            
	//*   5    7:bipush          6
	//*   6    9:imul            
	//*   7   10:iadd            
	//*   8   11:aload_0         
	//*   9   12:getfield        #69  <Field int _outputEnd>
	//*  10   15:icmple          22
			_flushBuffer();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #104 <Method void _flushBuffer()>
		int l = _outputTail;
	//   13   22:aload_0         
	//   14   23:getfield        #101 <Field int _outputTail>
	//   15   26:istore          5
		byte abyte0[] = _outputBuffer;
	//   16   28:aload_0         
	//   17   29:getfield        #67  <Field byte[] _outputBuffer>
	//   18   32:astore          7
		int ai[] = _outputEscapes;
	//   19   34:aload_0         
	//   20   35:getfield        #177 <Field int[] _outputEscapes>
	//   21   38:astore          8
		int k = i;
	//   22   40:iload_2         
	//   23   41:istore          4
		i = l;
	//   24   43:iload           5
	//   25   45:istore_2        
		while(k < j) 
	//*  26   46:iload           4
	//*  27   48:iload_3         
	//*  28   49:icmpge          220
		{
			int i1 = k + 1;
	//   29   52:iload           4
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore          5
			k = ((int) (ac[k]));
	//   33   58:aload_1         
	//   34   59:iload           4
	//   35   61:caload          
	//   36   62:istore          4
			if(k <= '\177')
	//*  37   64:iload           4
	//*  38   66:bipush          127
	//*  39   68:icmpgt          155
			{
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
				} else
	//*  55   94:goto            46
				{
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
						k = i1;
	//   79  133:iload           5
	//   80  135:istore          4
					} else
	//*  81  137:goto            46
					{
						i = _writeGenericEscape(k, i);
	//   82  140:aload_0         
	//   83  141:iload           4
	//   84  143:iload_2         
	//   85  144:invokespecial   #220 <Method int _writeGenericEscape(int, int)>
	//   86  147:istore_2        
						k = i1;
	//   87  148:iload           5
	//   88  150:istore          4
					}
				}
			} else
	//*  89  152:goto            46
			{
				if(k <= 2047)
	//*  90  155:iload           4
	//*  91  157:sipush          2047
	//*  92  160:icmpgt          205
				{
					int k1 = i + 1;
	//   93  163:iload_2         
	//   94  164:iconst_1        
	//   95  165:iadd            
	//   96  166:istore          6
					abyte0[i] = (byte)(k >> 6 | 0xc0);
	//   97  168:aload           7
	//   98  170:iload_2         
	//   99  171:iload           4
	//  100  173:bipush          6
	//  101  175:ishr            
	//  102  176:sipush          192
	//  103  179:ior             
	//  104  180:int2byte        
	//  105  181:bastore         
					i = k1 + 1;
	//  106  182:iload           6
	//  107  184:iconst_1        
	//  108  185:iadd            
	//  109  186:istore_2        
					abyte0[k1] = (byte)(k & 0x3f | 0x80);
	//  110  187:aload           7
	//  111  189:iload           6
	//  112  191:iload           4
	//  113  193:bipush          63
	//  114  195:iand            
	//  115  196:sipush          128
	//  116  199:ior             
	//  117  200:int2byte        
	//  118  201:bastore         
				} else
	//* 119  202:goto            213
				{
					i = _outputMultiByteChar(k, i);
	//  120  205:aload_0         
	//  121  206:iload           4
	//  122  208:iload_2         
	//  123  209:invokespecial   #222 <Method int _outputMultiByteChar(int, int)>
	//  124  212:istore_2        
				}
				k = i1;
	//  125  213:iload           5
	//  126  215:istore          4
			}
		}
	//* 127  217:goto            46
		_outputTail = i;
	//  128  220:aload_0         
	//  129  221:iload_2         
	//  130  222:putfield        #101 <Field int _outputTail>
	//  131  225:return          
	}

	private final void _writeStringSegmentASCII2(String s, int i, int j)
		throws IOException
	{
		if(_outputTail + (j - i) * 6 > _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field int _outputTail>
	//*   2    4:iload_3         
	//*   3    5:iload_2         
	//*   4    6:isub            
	//*   5    7:bipush          6
	//*   6    9:imul            
	//*   7   10:iadd            
	//*   8   11:aload_0         
	//*   9   12:getfield        #69  <Field int _outputEnd>
	//*  10   15:icmple          22
			_flushBuffer();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #104 <Method void _flushBuffer()>
		int l = _outputTail;
	//   13   22:aload_0         
	//   14   23:getfield        #101 <Field int _outputTail>
	//   15   26:istore          5
		byte abyte0[] = _outputBuffer;
	//   16   28:aload_0         
	//   17   29:getfield        #67  <Field byte[] _outputBuffer>
	//   18   32:astore          8
		int ai[] = _outputEscapes;
	//   19   34:aload_0         
	//   20   35:getfield        #177 <Field int[] _outputEscapes>
	//   21   38:astore          9
		int j1 = _maximumNonEscapedChar;
	//   22   40:aload_0         
	//   23   41:getfield        #180 <Field int _maximumNonEscapedChar>
	//   24   44:istore          6
		int k = i;
	//   25   46:iload_2         
	//   26   47:istore          4
		i = l;
	//   27   49:iload           5
	//   28   51:istore_2        
		while(k < j) 
	//*  29   52:iload           4
	//*  30   54:iload_3         
	//*  31   55:icmpge          250
		{
			int i1 = k + 1;
	//   32   58:iload           4
	//   33   60:iconst_1        
	//   34   61:iadd            
	//   35   62:istore          5
			k = ((int) (s.charAt(k)));
	//   36   64:aload_1         
	//   37   65:iload           4
	//   38   67:invokevirtual   #189 <Method char String.charAt(int)>
	//   39   70:istore          4
			if(k <= '\177')
	//*  40   72:iload           4
	//*  41   74:bipush          127
	//*  42   76:icmpgt          163
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
				} else
	//*  58  102:goto            52
				{
					int k1 = ai[k];
	//   59  105:aload           9
	//   60  107:iload           4
	//   61  109:iaload          
	//   62  110:istore          7
					if(k1 > 0)
	//*  63  112:iload           7
	//*  64  114:ifle            148
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
						k = i1;
	//   82  141:iload           5
	//   83  143:istore          4
					} else
	//*  84  145:goto            52
					{
						i = _writeGenericEscape(k, i);
	//   85  148:aload_0         
	//   86  149:iload           4
	//   87  151:iload_2         
	//   88  152:invokespecial   #220 <Method int _writeGenericEscape(int, int)>
	//   89  155:istore_2        
						k = i1;
	//   90  156:iload           5
	//   91  158:istore          4
					}
				}
			} else
	//*  92  160:goto            52
			if(k > j1)
	//*  93  163:iload           4
	//*  94  165:iload           6
	//*  95  167:icmple          185
			{
				i = _writeGenericEscape(k, i);
	//   96  170:aload_0         
	//   97  171:iload           4
	//   98  173:iload_2         
	//   99  174:invokespecial   #220 <Method int _writeGenericEscape(int, int)>
	//  100  177:istore_2        
				k = i1;
	//  101  178:iload           5
	//  102  180:istore          4
			} else
	//* 103  182:goto            52
			{
				if(k <= 2047)
	//* 104  185:iload           4
	//* 105  187:sipush          2047
	//* 106  190:icmpgt          235
				{
					int l1 = i + 1;
	//  107  193:iload_2         
	//  108  194:iconst_1        
	//  109  195:iadd            
	//  110  196:istore          7
					abyte0[i] = (byte)(k >> 6 | 0xc0);
	//  111  198:aload           8
	//  112  200:iload_2         
	//  113  201:iload           4
	//  114  203:bipush          6
	//  115  205:ishr            
	//  116  206:sipush          192
	//  117  209:ior             
	//  118  210:int2byte        
	//  119  211:bastore         
					i = l1 + 1;
	//  120  212:iload           7
	//  121  214:iconst_1        
	//  122  215:iadd            
	//  123  216:istore_2        
					abyte0[l1] = (byte)(k & 0x3f | 0x80);
	//  124  217:aload           8
	//  125  219:iload           7
	//  126  221:iload           4
	//  127  223:bipush          63
	//  128  225:iand            
	//  129  226:sipush          128
	//  130  229:ior             
	//  131  230:int2byte        
	//  132  231:bastore         
				} else
	//* 133  232:goto            243
				{
					i = _outputMultiByteChar(k, i);
	//  134  235:aload_0         
	//  135  236:iload           4
	//  136  238:iload_2         
	//  137  239:invokespecial   #222 <Method int _outputMultiByteChar(int, int)>
	//  138  242:istore_2        
				}
				k = i1;
	//  139  243:iload           5
	//  140  245:istore          4
			}
		}
	//* 141  247:goto            52
		_outputTail = i;
	//  142  250:aload_0         
	//  143  251:iload_2         
	//  144  252:putfield        #101 <Field int _outputTail>
	//  145  255:return          
	}

	private final void _writeStringSegmentASCII2(char ac[], int i, int j)
		throws IOException
	{
		if(_outputTail + (j - i) * 6 > _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field int _outputTail>
	//*   2    4:iload_3         
	//*   3    5:iload_2         
	//*   4    6:isub            
	//*   5    7:bipush          6
	//*   6    9:imul            
	//*   7   10:iadd            
	//*   8   11:aload_0         
	//*   9   12:getfield        #69  <Field int _outputEnd>
	//*  10   15:icmple          22
			_flushBuffer();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #104 <Method void _flushBuffer()>
		int l = _outputTail;
	//   13   22:aload_0         
	//   14   23:getfield        #101 <Field int _outputTail>
	//   15   26:istore          5
		byte abyte0[] = _outputBuffer;
	//   16   28:aload_0         
	//   17   29:getfield        #67  <Field byte[] _outputBuffer>
	//   18   32:astore          8
		int ai[] = _outputEscapes;
	//   19   34:aload_0         
	//   20   35:getfield        #177 <Field int[] _outputEscapes>
	//   21   38:astore          9
		int j1 = _maximumNonEscapedChar;
	//   22   40:aload_0         
	//   23   41:getfield        #180 <Field int _maximumNonEscapedChar>
	//   24   44:istore          6
		int k = i;
	//   25   46:iload_2         
	//   26   47:istore          4
		i = l;
	//   27   49:iload           5
	//   28   51:istore_2        
		while(k < j) 
	//*  29   52:iload           4
	//*  30   54:iload_3         
	//*  31   55:icmpge          248
		{
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
	//*  42   74:icmpgt          161
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
				} else
	//*  58  100:goto            52
				{
					int k1 = ai[k];
	//   59  103:aload           9
	//   60  105:iload           4
	//   61  107:iaload          
	//   62  108:istore          7
					if(k1 > 0)
	//*  63  110:iload           7
	//*  64  112:ifle            146
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
						k = i1;
	//   82  139:iload           5
	//   83  141:istore          4
					} else
	//*  84  143:goto            52
					{
						i = _writeGenericEscape(k, i);
	//   85  146:aload_0         
	//   86  147:iload           4
	//   87  149:iload_2         
	//   88  150:invokespecial   #220 <Method int _writeGenericEscape(int, int)>
	//   89  153:istore_2        
						k = i1;
	//   90  154:iload           5
	//   91  156:istore          4
					}
				}
			} else
	//*  92  158:goto            52
			if(k > j1)
	//*  93  161:iload           4
	//*  94  163:iload           6
	//*  95  165:icmple          183
			{
				i = _writeGenericEscape(k, i);
	//   96  168:aload_0         
	//   97  169:iload           4
	//   98  171:iload_2         
	//   99  172:invokespecial   #220 <Method int _writeGenericEscape(int, int)>
	//  100  175:istore_2        
				k = i1;
	//  101  176:iload           5
	//  102  178:istore          4
			} else
	//* 103  180:goto            52
			{
				if(k <= 2047)
	//* 104  183:iload           4
	//* 105  185:sipush          2047
	//* 106  188:icmpgt          233
				{
					int l1 = i + 1;
	//  107  191:iload_2         
	//  108  192:iconst_1        
	//  109  193:iadd            
	//  110  194:istore          7
					abyte0[i] = (byte)(k >> 6 | 0xc0);
	//  111  196:aload           8
	//  112  198:iload_2         
	//  113  199:iload           4
	//  114  201:bipush          6
	//  115  203:ishr            
	//  116  204:sipush          192
	//  117  207:ior             
	//  118  208:int2byte        
	//  119  209:bastore         
					i = l1 + 1;
	//  120  210:iload           7
	//  121  212:iconst_1        
	//  122  213:iadd            
	//  123  214:istore_2        
					abyte0[l1] = (byte)(k & 0x3f | 0x80);
	//  124  215:aload           8
	//  125  217:iload           7
	//  126  219:iload           4
	//  127  221:bipush          63
	//  128  223:iand            
	//  129  224:sipush          128
	//  130  227:ior             
	//  131  228:int2byte        
	//  132  229:bastore         
				} else
	//* 133  230:goto            241
				{
					i = _outputMultiByteChar(k, i);
	//  134  233:aload_0         
	//  135  234:iload           4
	//  136  236:iload_2         
	//  137  237:invokespecial   #222 <Method int _outputMultiByteChar(int, int)>
	//  138  240:istore_2        
				}
				k = i1;
	//  139  241:iload           5
	//  140  243:istore          4
			}
		}
	//* 141  245:goto            52
		_outputTail = i;
	//  142  248:aload_0         
	//  143  249:iload_2         
	//  144  250:putfield        #101 <Field int _outputTail>
	//  145  253:return          
	}

	private final void _writeStringSegments(String s, int i, int j)
		throws IOException
	{
		int k;
		do
		{
			k = Math.min(_outputMaxContiguous, j);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int _outputMaxContiguous>
	//    2    4:iload_3         
	//    3    5:invokestatic    #154 <Method int Math.min(int, int)>
	//    4    8:istore          4
			if(_outputTail + k > _outputEnd)
	//*   5   10:aload_0         
	//*   6   11:getfield        #101 <Field int _outputTail>
	//*   7   14:iload           4
	//*   8   16:iadd            
	//*   9   17:aload_0         
	//*  10   18:getfield        #69  <Field int _outputEnd>
	//*  11   21:icmple          28
				_flushBuffer();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #104 <Method void _flushBuffer()>
			_writeStringSegment(s, i, k);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:iload_2         
	//   17   31:iload           4
	//   18   33:invokespecial   #266 <Method void _writeStringSegment(String, int, int)>
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
	//*   3    5:getfield        #101 <Field int _outputTail>
	//*   4    8:aload_0         
	//*   5    9:getfield        #69  <Field int _outputEnd>
	//*   6   12:icmplt          19
				_flushBuffer();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #104 <Method void _flushBuffer()>
			byte abyte0[] = _outputBuffer;
	//    9   19:aload_0         
	//   10   20:getfield        #67  <Field byte[] _outputBuffer>
	//   11   23:astore          6
			int i = _outputTail;
	//   12   25:aload_0         
	//   13   26:getfield        #101 <Field int _outputTail>
	//   14   29:istore_3        
			_outputTail = i + 1;
	//   15   30:aload_0         
	//   16   31:iload_3         
	//   17   32:iconst_1        
	//   18   33:iadd            
	//   19   34:putfield        #101 <Field int _outputTail>
			abyte0[i] = _quoteChar;
	//   20   37:aload           6
	//   21   39:iload_3         
	//   22   40:aload_0         
	//   23   41:getfield        #56  <Field byte _quoteChar>
	//   24   44:bastore         
		}
		int j = s.length();
	//   25   45:aload_1         
	//   26   46:invokevirtual   #271 <Method int String.length()>
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
	//   33   58:getfield        #71  <Field int _outputMaxContiguous>
	//   34   61:iload_3         
	//   35   62:invokestatic    #154 <Method int Math.min(int, int)>
	//   36   65:istore          5
			if(_outputTail + i1 > _outputEnd)
	//*  37   67:aload_0         
	//*  38   68:getfield        #101 <Field int _outputTail>
	//*  39   71:iload           5
	//*  40   73:iadd            
	//*  41   74:aload_0         
	//*  42   75:getfield        #69  <Field int _outputEnd>
	//*  43   78:icmple          85
				_flushBuffer();
	//   44   81:aload_0         
	//   45   82:invokevirtual   #104 <Method void _flushBuffer()>
			_writeStringSegment(s, l, i1);
	//   46   85:aload_0         
	//   47   86:aload_1         
	//   48   87:iload           4
	//   49   89:iload           5
	//   50   91:invokespecial   #266 <Method void _writeStringSegment(String, int, int)>
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
	//*  63  114:getfield        #101 <Field int _outputTail>
	//*  64  117:aload_0         
	//*  65  118:getfield        #69  <Field int _outputEnd>
	//*  66  121:icmplt          128
				_flushBuffer();
	//   67  124:aload_0         
	//   68  125:invokevirtual   #104 <Method void _flushBuffer()>
			s = ((String) (_outputBuffer));
	//   69  128:aload_0         
	//   70  129:getfield        #67  <Field byte[] _outputBuffer>
	//   71  132:astore_1        
			int k = _outputTail;
	//   72  133:aload_0         
	//   73  134:getfield        #101 <Field int _outputTail>
	//   74  137:istore_3        
			_outputTail = k + 1;
	//   75  138:aload_0         
	//   76  139:iload_3         
	//   77  140:iconst_1        
	//   78  141:iadd            
	//   79  142:putfield        #101 <Field int _outputTail>
			s[k] = _quoteChar;
	//   80  145:aload_1         
	//   81  146:iload_3         
	//   82  147:aload_0         
	//   83  148:getfield        #56  <Field byte _quoteChar>
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
	//    1    1:getfield        #71  <Field int _outputMaxContiguous>
	//    2    4:iload_3         
	//    3    5:invokestatic    #154 <Method int Math.min(int, int)>
	//    4    8:istore          4
			if(_outputTail + k > _outputEnd)
	//*   5   10:aload_0         
	//*   6   11:getfield        #101 <Field int _outputTail>
	//*   7   14:iload           4
	//*   8   16:iadd            
	//*   9   17:aload_0         
	//*  10   18:getfield        #69  <Field int _outputEnd>
	//*  11   21:icmple          28
				_flushBuffer();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #104 <Method void _flushBuffer()>
			_writeStringSegment(ac, i, k);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:iload_2         
	//   17   31:iload           4
	//   18   33:invokespecial   #273 <Method void _writeStringSegment(char[], int, int)>
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

	private final void _writeUnq(SerializableString serializablestring)
		throws IOException
	{
		int i = serializablestring.appendQuotedUTF8(_outputBuffer, _outputTail);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #67  <Field byte[] _outputBuffer>
	//    3    5:aload_0         
	//    4    6:getfield        #101 <Field int _outputTail>
	//    5    9:invokeinterface #279 <Method int SerializableString.appendQuotedUTF8(byte[], int)>
	//    6   14:istore_2        
		if(i < 0)
	//*   7   15:iload_2         
	//*   8   16:ifge            30
		{
			_writeBytes(serializablestring.asQuotedUTF8());
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokeinterface #282 <Method byte[] SerializableString.asQuotedUTF8()>
	//   12   26:invokespecial   #284 <Method void _writeBytes(byte[])>
			return;
	//   13   29:return          
		} else
		{
			_outputTail = _outputTail + i;
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #101 <Field int _outputTail>
	//   17   35:iload_2         
	//   18   36:iadd            
	//   19   37:putfield        #101 <Field int _outputTail>
			return;
	//   20   40:return          
		}
	}

	protected final void _flushBuffer()
		throws IOException
	{
		int i = _outputTail;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field int _outputTail>
	//    2    4:istore_1        
		if(i > 0)
	//*   3    5:iload_1         
	//*   4    6:ifle            27
		{
			_outputTail = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #101 <Field int _outputTail>
			_outputStream.write(_outputBuffer, 0, i);
	//    8   14:aload_0         
	//    9   15:getfield        #58  <Field OutputStream _outputStream>
	//   10   18:aload_0         
	//   11   19:getfield        #67  <Field byte[] _outputBuffer>
	//   12   22:iconst_0        
	//   13   23:iload_1         
	//   14   24:invokevirtual   #110 <Method void OutputStream.write(byte[], int, int)>
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
	//    3    3:invokevirtual   #287 <Method int _decodeSurrogate(int, int)>
	//    4    6:istore_1        
		if(_outputTail + 4 > _outputEnd)
	//*   5    7:aload_0         
	//*   6    8:getfield        #101 <Field int _outputTail>
	//*   7   11:iconst_4        
	//*   8   12:iadd            
	//*   9   13:aload_0         
	//*  10   14:getfield        #69  <Field int _outputEnd>
	//*  11   17:icmple          24
			_flushBuffer();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #104 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//   14   24:aload_0         
	//   15   25:getfield        #67  <Field byte[] _outputBuffer>
	//   16   28:astore_3        
		j = _outputTail;
	//   17   29:aload_0         
	//   18   30:getfield        #101 <Field int _outputTail>
	//   19   33:istore_2        
		_outputTail = j + 1;
	//   20   34:aload_0         
	//   21   35:iload_2         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:putfield        #101 <Field int _outputTail>
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
	//   35   54:getfield        #101 <Field int _outputTail>
	//   36   57:istore_2        
		_outputTail = j + 1;
	//   37   58:aload_0         
	//   38   59:iload_2         
	//   39   60:iconst_1        
	//   40   61:iadd            
	//   41   62:putfield        #101 <Field int _outputTail>
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
	//   54   81:getfield        #101 <Field int _outputTail>
	//   55   84:istore_2        
		_outputTail = j + 1;
	//   56   85:aload_0         
	//   57   86:iload_2         
	//   58   87:iconst_1        
	//   59   88:iadd            
	//   60   89:putfield        #101 <Field int _outputTail>
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
	//   73  108:getfield        #101 <Field int _outputTail>
	//   74  111:istore_2        
		_outputTail = j + 1;
	//   75  112:aload_0         
	//   76  113:iload_2         
	//   77  114:iconst_1        
	//   78  115:iadd            
	//   79  116:putfield        #101 <Field int _outputTail>
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
	//    1    1:getfield        #67  <Field byte[] _outputBuffer>
	//    2    4:astore_1        
		if(ac != null && _bufferRecyclable)
	//*   3    5:aload_1         
	//*   4    6:ifnull          29
	//*   5    9:aload_0         
	//*   6   10:getfield        #60  <Field boolean _bufferRecyclable>
	//*   7   13:ifeq            29
		{
			_outputBuffer = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #67  <Field byte[] _outputBuffer>
			_ioContext.releaseWriteEncodingBuffer(((byte []) (ac)));
	//   11   21:aload_0         
	//   12   22:getfield        #292 <Field IOContext _ioContext>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #295 <Method void IOContext.releaseWriteEncodingBuffer(byte[])>
		}
		ac = _charBuffer;
	//   15   29:aload_0         
	//   16   30:getfield        #77  <Field char[] _charBuffer>
	//   17   33:astore_1        
		if(ac != null)
	//*  18   34:aload_1         
	//*  19   35:ifnull          51
		{
			_charBuffer = null;
	//   20   38:aload_0         
	//   21   39:aconst_null     
	//   22   40:putfield        #77  <Field char[] _charBuffer>
			_ioContext.releaseConcatBuffer(ac);
	//   23   43:aload_0         
	//   24   44:getfield        #292 <Field IOContext _ioContext>
	//   25   47:aload_1         
	//   26   48:invokevirtual   #299 <Method void IOContext.releaseConcatBuffer(char[])>
		}
	//   27   51:return          
	}

	protected final void _verifyValueWrite(String s)
		throws IOException
	{
		int i = _writeContext.writeValue();
	//    0    0:aload_0         
	//    1    1:getfield        #304 <Field JsonWriteContext _writeContext>
	//    2    4:invokevirtual   #309 <Method int JsonWriteContext.writeValue()>
	//    3    7:istore_3        
		if(_cfgPrettyPrinter != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #313 <Field PrettyPrinter _cfgPrettyPrinter>
	//*   6   12:ifnull          22
		{
			_verifyPrettyValueWrite(s, i);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:iload_3         
	//   10   18:invokevirtual   #317 <Method void _verifyPrettyValueWrite(String, int)>
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
	//*  19   58:getfield        #321 <Field SerializableString _rootValueSeparator>
	//*  20   61:ifnull          84
				{
					s = ((String) (_rootValueSeparator.asUnquotedUTF8()));
	//   21   64:aload_0         
	//   22   65:getfield        #321 <Field SerializableString _rootValueSeparator>
	//   23   68:invokeinterface #169 <Method byte[] SerializableString.asUnquotedUTF8()>
	//   24   73:astore_1        
					if(s.length > 0)
	//*  25   74:aload_1         
	//*  26   75:arraylength     
	//*  27   76:ifle            84
						_writeBytes(((byte []) (s)));
	//   28   79:aload_0         
	//   29   80:aload_1         
	//   30   81:invokespecial   #284 <Method void _writeBytes(byte[])>
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
	//*  38   95:getfield        #101 <Field int _outputTail>
	//*  39   98:aload_0         
	//*  40   99:getfield        #69  <Field int _outputEnd>
	//*  41  102:icmplt          109
				_flushBuffer();
	//   42  105:aload_0         
	//   43  106:invokevirtual   #104 <Method void _flushBuffer()>
			s = ((String) (_outputBuffer));
	//   44  109:aload_0         
	//   45  110:getfield        #67  <Field byte[] _outputBuffer>
	//   46  113:astore_1        
			i = _outputTail;
	//   47  114:aload_0         
	//   48  115:getfield        #101 <Field int _outputTail>
	//   49  118:istore_3        
			_outputTail = i + 1;
	//   50  119:aload_0         
	//   51  120:iload_3         
	//   52  121:iconst_1        
	//   53  122:iadd            
	//   54  123:putfield        #101 <Field int _outputTail>
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
	//   62  133:invokevirtual   #324 <Method void _reportCantWriteValueExpectName(String)>
			return;
	//   63  136:return          
		}
	}

	protected final int _writeBinary(Base64Variant base64variant, InputStream inputstream, byte abyte0[])
		throws IOException, JsonGenerationException
	{
		int k2 = _outputEnd - 6;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int _outputEnd>
	//    2    4:bipush          6
	//    3    6:isub            
	//    4    7:istore          14
		int i = base64variant.getMaxLineLength();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #331 <Method int Base64Variant.getMaxLineLength()>
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
		int k = 0;
	//   16   28:iconst_0        
	//   17   29:istore          6
		int j1 = 0;
	//   18   31:iconst_0        
	//   19   32:istore          9
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
	//   20   34:iload           10
	//   21   36:istore          8
				l1 = k;
	//   22   38:iload           6
	//   23   40:istore          11
				l = j1;
	//   24   42:iload           9
	//   25   44:istore          7
				if(k > k1)
	//*  26   46:iload           6
	//*  27   48:iload           10
	//*  28   50:icmple          181
				{
					i1 = _readMore(inputstream, abyte0, k, j1, abyte0.length);
	//   29   53:aload_0         
	//   30   54:aload_2         
	//   31   55:aload_3         
	//   32   56:iload           6
	//   33   58:iload           9
	//   34   60:aload_3         
	//   35   61:arraylength     
	//   36   62:invokespecial   #333 <Method int _readMore(InputStream, byte[], int, int, int)>
	//   37   65:istore          8
					if(i1 < 3)
	//*  38   67:iload           8
	//*  39   69:iconst_3        
	//*  40   70:icmpge          168
					{
						j = i;
	//   41   73:iload           4
	//   42   75:istore          5
						if(i1 > 0)
	//*  43   77:iload           8
	//*  44   79:ifle            165
						{
							if(_outputTail > k2)
	//*  45   82:aload_0         
	//*  46   83:getfield        #101 <Field int _outputTail>
	//*  47   86:iload           14
	//*  48   88:icmple          95
								_flushBuffer();
	//   49   91:aload_0         
	//   50   92:invokevirtual   #104 <Method void _flushBuffer()>
							l = abyte0[0] << 16;
	//   51   95:aload_3         
	//   52   96:iconst_0        
	//   53   97:baload          
	//   54   98:bipush          16
	//   55  100:ishl            
	//   56  101:istore          7
							k = 1;
	//   57  103:iconst_1        
	//   58  104:istore          6
							j = l;
	//   59  106:iload           7
	//   60  108:istore          5
							if(1 < i1)
	//*  61  110:iconst_1        
	//*  62  111:iload           8
	//*  63  113:icmpge          134
							{
								j = l | (abyte0[1] & 0xff) << 8;
	//   64  116:iload           7
	//   65  118:aload_3         
	//   66  119:iconst_1        
	//   67  120:baload          
	//   68  121:sipush          255
	//   69  124:iand            
	//   70  125:bipush          8
	//   71  127:ishl            
	//   72  128:ior             
	//   73  129:istore          5
								k = 2;
	//   74  131:iconst_2        
	//   75  132:istore          6
							}
							i += k;
	//   76  134:iload           4
	//   77  136:iload           6
	//   78  138:iadd            
	//   79  139:istore          4
							_outputTail = base64variant.encodeBase64Partial(j, k, _outputBuffer, _outputTail);
	//   80  141:aload_0         
	//   81  142:aload_1         
	//   82  143:iload           5
	//   83  145:iload           6
	//   84  147:aload_0         
	//   85  148:getfield        #67  <Field byte[] _outputBuffer>
	//   86  151:aload_0         
	//   87  152:getfield        #101 <Field int _outputTail>
	//   88  155:invokevirtual   #337 <Method int Base64Variant.encodeBase64Partial(int, int, byte[], int)>
	//   89  158:putfield        #101 <Field int _outputTail>
							j = i;
	//   90  161:iload           4
	//   91  163:istore          5
						}
						return j;
	//   92  165:iload           5
	//   93  167:ireturn         
					}
					l = i1;
	//   94  168:iload           8
	//   95  170:istore          7
					i1 -= 3;
	//   96  172:iload           8
	//   97  174:iconst_3        
	//   98  175:isub            
	//   99  176:istore          8
					l1 = 0;
	//  100  178:iconst_0        
	//  101  179:istore          11
				}
				if(_outputTail > k2)
	//* 102  181:aload_0         
	//* 103  182:getfield        #101 <Field int _outputTail>
	//* 104  185:iload           14
	//* 105  187:icmple          194
					_flushBuffer();
	//  106  190:aload_0         
	//  107  191:invokevirtual   #104 <Method void _flushBuffer()>
				j1 = l1 + 1;
	//  108  194:iload           11
	//  109  196:iconst_1        
	//  110  197:iadd            
	//  111  198:istore          9
				k = ((int) (abyte0[l1]));
	//  112  200:aload_3         
	//  113  201:iload           11
	//  114  203:baload          
	//  115  204:istore          6
				k1 = j1 + 1;
	//  116  206:iload           9
	//  117  208:iconst_1        
	//  118  209:iadd            
	//  119  210:istore          10
				j1 = ((int) (abyte0[j1]));
	//  120  212:aload_3         
	//  121  213:iload           9
	//  122  215:baload          
	//  123  216:istore          9
				l1 = k1 + 1;
	//  124  218:iload           10
	//  125  220:iconst_1        
	//  126  221:iadd            
	//  127  222:istore          11
				k1 = ((int) (abyte0[k1]));
	//  128  224:aload_3         
	//  129  225:iload           10
	//  130  227:baload          
	//  131  228:istore          10
				i2 = i + 3;
	//  132  230:iload           4
	//  133  232:iconst_3        
	//  134  233:iadd            
	//  135  234:istore          12
				_outputTail = base64variant.encodeBase64Chunk((j1 & 0xff | k << 8) << 8 | k1 & 0xff, _outputBuffer, _outputTail);
	//  136  236:aload_0         
	//  137  237:aload_1         
	//  138  238:iload           9
	//  139  240:sipush          255
	//  140  243:iand            
	//  141  244:iload           6
	//  142  246:bipush          8
	//  143  248:ishl            
	//  144  249:ior             
	//  145  250:bipush          8
	//  146  252:ishl            
	//  147  253:iload           10
	//  148  255:sipush          255
	//  149  258:iand            
	//  150  259:ior             
	//  151  260:aload_0         
	//  152  261:getfield        #67  <Field byte[] _outputBuffer>
	//  153  264:aload_0         
	//  154  265:getfield        #101 <Field int _outputTail>
	//  155  268:invokevirtual   #340 <Method int Base64Variant.encodeBase64Chunk(int, byte[], int)>
	//  156  271:putfield        #101 <Field int _outputTail>
				j2 = j - 1;
	//  157  274:iload           5
	//  158  276:iconst_1        
	//  159  277:isub            
	//  160  278:istore          13
				i = i2;
	//  161  280:iload           12
	//  162  282:istore          4
				k1 = i1;
	//  163  284:iload           8
	//  164  286:istore          10
				k = l1;
	//  165  288:iload           11
	//  166  290:istore          6
				j1 = l;
	//  167  292:iload           7
	//  168  294:istore          9
				j = j2;
	//  169  296:iload           13
	//  170  298:istore          5
			} while(j2 > 0);
	//  171  300:iload           13
	//  172  302:ifgt            34
			byte abyte1[] = _outputBuffer;
	//  173  305:aload_0         
	//  174  306:getfield        #67  <Field byte[] _outputBuffer>
	//  175  309:astore          15
			i = _outputTail;
	//  176  311:aload_0         
	//  177  312:getfield        #101 <Field int _outputTail>
	//  178  315:istore          4
			_outputTail = i + 1;
	//  179  317:aload_0         
	//  180  318:iload           4
	//  181  320:iconst_1        
	//  182  321:iadd            
	//  183  322:putfield        #101 <Field int _outputTail>
			abyte1[i] = 92;
	//  184  325:aload           15
	//  185  327:iload           4
	//  186  329:bipush          92
	//  187  331:bastore         
			i = _outputTail;
	//  188  332:aload_0         
	//  189  333:getfield        #101 <Field int _outputTail>
	//  190  336:istore          4
			_outputTail = i + 1;
	//  191  338:aload_0         
	//  192  339:iload           4
	//  193  341:iconst_1        
	//  194  342:iadd            
	//  195  343:putfield        #101 <Field int _outputTail>
			abyte1[i] = 110;
	//  196  346:aload           15
	//  197  348:iload           4
	//  198  350:bipush          110
	//  199  352:bastore         
			j = base64variant.getMaxLineLength() >> 2;
	//  200  353:aload_1         
	//  201  354:invokevirtual   #331 <Method int Base64Variant.getMaxLineLength()>
	//  202  357:iconst_2        
	//  203  358:ishr            
	//  204  359:istore          5
			i = i2;
	//  205  361:iload           12
	//  206  363:istore          4
			k1 = i1;
	//  207  365:iload           8
	//  208  367:istore          10
			k = l1;
	//  209  369:iload           11
	//  210  371:istore          6
			j1 = l;
	//  211  373:iload           7
	//  212  375:istore          9
		} while(true);
	//  213  377:goto            34
	}

	protected final int _writeBinary(Base64Variant base64variant, InputStream inputstream, byte abyte0[], int i)
		throws IOException, JsonGenerationException
	{
		int l2 = _outputEnd - 6;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int _outputEnd>
	//    2    4:bipush          6
	//    3    6:isub            
	//    4    7:istore          14
		int k = base64variant.getMaxLineLength() >> 2;
	//    5    9:aload_1         
	//    6   10:invokevirtual   #331 <Method int Base64Variant.getMaxLineLength()>
	//    7   13:iconst_2        
	//    8   14:ishr            
	//    9   15:istore          6
		int l1 = -3;
	//   10   17:bipush          -3
	//   11   19:istore          10
		int j1 = 0;
	//   12   21:iconst_0        
	//   13   22:istore          8
		int l = 0;
	//   14   24:iconst_0        
	//   15   25:istore          7
		int j = i;
	//   16   27:iload           4
	//   17   29:istore          5
		i = j1;
	//   18   31:iload           8
	//   19   33:istore          4
		int k1;
		do
		{
			j1 = i;
	//   20   35:iload           4
	//   21   37:istore          8
			k1 = l;
	//   22   39:iload           7
	//   23   41:istore          9
			if(j <= 2)
				break;
	//   24   43:iload           5
	//   25   45:iconst_2        
	//   26   46:icmple          310
			k1 = l1;
	//   27   49:iload           10
	//   28   51:istore          9
			int i2 = i;
	//   29   53:iload           4
	//   30   55:istore          11
			j1 = l;
	//   31   57:iload           7
	//   32   59:istore          8
			if(i > l1)
	//*  33   61:iload           4
	//*  34   63:iload           10
	//*  35   65:icmple          111
			{
				i = _readMore(inputstream, abyte0, i, l, j);
	//   36   68:aload_0         
	//   37   69:aload_2         
	//   38   70:aload_3         
	//   39   71:iload           4
	//   40   73:iload           7
	//   41   75:iload           5
	//   42   77:invokespecial   #333 <Method int _readMore(InputStream, byte[], int, int, int)>
	//   43   80:istore          4
				if(i < 3)
	//*  44   82:iload           4
	//*  45   84:iconst_3        
	//*  46   85:icmpge          98
				{
					j1 = 0;
	//   47   88:iconst_0        
	//   48   89:istore          8
					k1 = i;
	//   49   91:iload           4
	//   50   93:istore          9
					break;
	//   51   95:goto            310
				}
				j1 = i;
	//   52   98:iload           4
	//   53  100:istore          8
				k1 = i - 3;
	//   54  102:iload           4
	//   55  104:iconst_3        
	//   56  105:isub            
	//   57  106:istore          9
				i2 = 0;
	//   58  108:iconst_0        
	//   59  109:istore          11
			}
			if(_outputTail > l2)
	//*  60  111:aload_0         
	//*  61  112:getfield        #101 <Field int _outputTail>
	//*  62  115:iload           14
	//*  63  117:icmple          124
				_flushBuffer();
	//   64  120:aload_0         
	//   65  121:invokevirtual   #104 <Method void _flushBuffer()>
			l = i2 + 1;
	//   66  124:iload           11
	//   67  126:iconst_1        
	//   68  127:iadd            
	//   69  128:istore          7
			i = ((int) (abyte0[i2]));
	//   70  130:aload_3         
	//   71  131:iload           11
	//   72  133:baload          
	//   73  134:istore          4
			l1 = l + 1;
	//   74  136:iload           7
	//   75  138:iconst_1        
	//   76  139:iadd            
	//   77  140:istore          10
			l = ((int) (abyte0[l]));
	//   78  142:aload_3         
	//   79  143:iload           7
	//   80  145:baload          
	//   81  146:istore          7
			i2 = l1 + 1;
	//   82  148:iload           10
	//   83  150:iconst_1        
	//   84  151:iadd            
	//   85  152:istore          11
			l1 = ((int) (abyte0[l1]));
	//   86  154:aload_3         
	//   87  155:iload           10
	//   88  157:baload          
	//   89  158:istore          10
			int j2 = j - 3;
	//   90  160:iload           5
	//   91  162:iconst_3        
	//   92  163:isub            
	//   93  164:istore          12
			_outputTail = base64variant.encodeBase64Chunk((l & 0xff | i << 8) << 8 | l1 & 0xff, _outputBuffer, _outputTail);
	//   94  166:aload_0         
	//   95  167:aload_1         
	//   96  168:iload           7
	//   97  170:sipush          255
	//   98  173:iand            
	//   99  174:iload           4
	//  100  176:bipush          8
	//  101  178:ishl            
	//  102  179:ior             
	//  103  180:bipush          8
	//  104  182:ishl            
	//  105  183:iload           10
	//  106  185:sipush          255
	//  107  188:iand            
	//  108  189:ior             
	//  109  190:aload_0         
	//  110  191:getfield        #67  <Field byte[] _outputBuffer>
	//  111  194:aload_0         
	//  112  195:getfield        #101 <Field int _outputTail>
	//  113  198:invokevirtual   #340 <Method int Base64Variant.encodeBase64Chunk(int, byte[], int)>
	//  114  201:putfield        #101 <Field int _outputTail>
			int k2 = k - 1;
	//  115  204:iload           6
	//  116  206:iconst_1        
	//  117  207:isub            
	//  118  208:istore          13
			k = k2;
	//  119  210:iload           13
	//  120  212:istore          6
			l1 = k1;
	//  121  214:iload           9
	//  122  216:istore          10
			i = i2;
	//  123  218:iload           11
	//  124  220:istore          4
			l = j1;
	//  125  222:iload           8
	//  126  224:istore          7
			j = j2;
	//  127  226:iload           12
	//  128  228:istore          5
			if(k2 <= 0)
	//* 129  230:iload           13
	//* 130  232:ifgt            35
			{
				byte abyte1[] = _outputBuffer;
	//  131  235:aload_0         
	//  132  236:getfield        #67  <Field byte[] _outputBuffer>
	//  133  239:astore          15
				i = _outputTail;
	//  134  241:aload_0         
	//  135  242:getfield        #101 <Field int _outputTail>
	//  136  245:istore          4
				_outputTail = i + 1;
	//  137  247:aload_0         
	//  138  248:iload           4
	//  139  250:iconst_1        
	//  140  251:iadd            
	//  141  252:putfield        #101 <Field int _outputTail>
				abyte1[i] = 92;
	//  142  255:aload           15
	//  143  257:iload           4
	//  144  259:bipush          92
	//  145  261:bastore         
				i = _outputTail;
	//  146  262:aload_0         
	//  147  263:getfield        #101 <Field int _outputTail>
	//  148  266:istore          4
				_outputTail = i + 1;
	//  149  268:aload_0         
	//  150  269:iload           4
	//  151  271:iconst_1        
	//  152  272:iadd            
	//  153  273:putfield        #101 <Field int _outputTail>
				abyte1[i] = 110;
	//  154  276:aload           15
	//  155  278:iload           4
	//  156  280:bipush          110
	//  157  282:bastore         
				k = base64variant.getMaxLineLength() >> 2;
	//  158  283:aload_1         
	//  159  284:invokevirtual   #331 <Method int Base64Variant.getMaxLineLength()>
	//  160  287:iconst_2        
	//  161  288:ishr            
	//  162  289:istore          6
				l1 = k1;
	//  163  291:iload           9
	//  164  293:istore          10
				i = i2;
	//  165  295:iload           11
	//  166  297:istore          4
				l = j1;
	//  167  299:iload           8
	//  168  301:istore          7
				j = j2;
	//  169  303:iload           12
	//  170  305:istore          5
			}
		} while(true);
	//  171  307:goto            35
		i = j;
	//  172  310:iload           5
	//  173  312:istore          4
		if(j > 0)
	//* 174  314:iload           5
	//* 175  316:ifle            421
		{
			j1 = _readMore(inputstream, abyte0, j1, k1, j);
	//  176  319:aload_0         
	//  177  320:aload_2         
	//  178  321:aload_3         
	//  179  322:iload           8
	//  180  324:iload           9
	//  181  326:iload           5
	//  182  328:invokespecial   #333 <Method int _readMore(InputStream, byte[], int, int, int)>
	//  183  331:istore          8
			i = j;
	//  184  333:iload           5
	//  185  335:istore          4
			if(j1 > 0)
	//* 186  337:iload           8
	//* 187  339:ifle            421
			{
				if(_outputTail > l2)
	//* 188  342:aload_0         
	//* 189  343:getfield        #101 <Field int _outputTail>
	//* 190  346:iload           14
	//* 191  348:icmple          355
					_flushBuffer();
	//  192  351:aload_0         
	//  193  352:invokevirtual   #104 <Method void _flushBuffer()>
				int i1 = abyte0[0] << 16;
	//  194  355:aload_3         
	//  195  356:iconst_0        
	//  196  357:baload          
	//  197  358:bipush          16
	//  198  360:ishl            
	//  199  361:istore          7
				byte byte0 = 1;
	//  200  363:iconst_1        
	//  201  364:istore          6
				i = i1;
	//  202  366:iload           7
	//  203  368:istore          4
				if(1 < j1)
	//* 204  370:iconst_1        
	//* 205  371:iload           8
	//* 206  373:icmpge          394
				{
					i = i1 | (abyte0[1] & 0xff) << 8;
	//  207  376:iload           7
	//  208  378:aload_3         
	//  209  379:iconst_1        
	//  210  380:baload          
	//  211  381:sipush          255
	//  212  384:iand            
	//  213  385:bipush          8
	//  214  387:ishl            
	//  215  388:ior             
	//  216  389:istore          4
					byte0 = 2;
	//  217  391:iconst_2        
	//  218  392:istore          6
				}
				_outputTail = base64variant.encodeBase64Partial(i, ((int) (byte0)), _outputBuffer, _outputTail);
	//  219  394:aload_0         
	//  220  395:aload_1         
	//  221  396:iload           4
	//  222  398:iload           6
	//  223  400:aload_0         
	//  224  401:getfield        #67  <Field byte[] _outputBuffer>
	//  225  404:aload_0         
	//  226  405:getfield        #101 <Field int _outputTail>
	//  227  408:invokevirtual   #337 <Method int Base64Variant.encodeBase64Partial(int, int, byte[], int)>
	//  228  411:putfield        #101 <Field int _outputTail>
				i = j - byte0;
	//  229  414:iload           5
	//  230  416:iload           6
	//  231  418:isub            
	//  232  419:istore          4
			}
		}
		return i;
	//  233  421:iload           4
	//  234  423:ireturn         
	}

	protected final void _writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
		throws IOException, JsonGenerationException
	{
		int k1 = _outputEnd - 6;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int _outputEnd>
	//    2    4:bipush          6
	//    3    6:isub            
	//    4    7:istore          7
		int k = base64variant.getMaxLineLength() >> 2;
	//    5    9:aload_1         
	//    6   10:invokevirtual   #331 <Method int Base64Variant.getMaxLineLength()>
	//    7   13:iconst_2        
	//    8   14:ishr            
	//    9   15:istore          5
		int i1;
		for(; i <= j - 3; i = i1)
	//*  10   17:iload_3         
	//*  11   18:iload           4
	//*  12   20:iconst_3        
	//*  13   21:isub            
	//*  14   22:icmpgt          172
		{
			if(_outputTail > k1)
	//*  15   25:aload_0         
	//*  16   26:getfield        #101 <Field int _outputTail>
	//*  17   29:iload           7
	//*  18   31:icmple          38
				_flushBuffer();
	//   19   34:aload_0         
	//   20   35:invokevirtual   #104 <Method void _flushBuffer()>
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
	//   53   81:getfield        #67  <Field byte[] _outputBuffer>
	//   54   84:aload_0         
	//   55   85:getfield        #101 <Field int _outputTail>
	//   56   88:invokevirtual   #340 <Method int Base64Variant.encodeBase64Chunk(int, byte[], int)>
	//   57   91:putfield        #101 <Field int _outputTail>
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
	//*  65  105:ifgt            157
			{
				byte abyte1[] = _outputBuffer;
	//   66  108:aload_0         
	//   67  109:getfield        #67  <Field byte[] _outputBuffer>
	//   68  112:astore          9
				i = _outputTail;
	//   69  114:aload_0         
	//   70  115:getfield        #101 <Field int _outputTail>
	//   71  118:istore_3        
				_outputTail = i + 1;
	//   72  119:aload_0         
	//   73  120:iload_3         
	//   74  121:iconst_1        
	//   75  122:iadd            
	//   76  123:putfield        #101 <Field int _outputTail>
				abyte1[i] = 92;
	//   77  126:aload           9
	//   78  128:iload_3         
	//   79  129:bipush          92
	//   80  131:bastore         
				i = _outputTail;
	//   81  132:aload_0         
	//   82  133:getfield        #101 <Field int _outputTail>
	//   83  136:istore_3        
				_outputTail = i + 1;
	//   84  137:aload_0         
	//   85  138:iload_3         
	//   86  139:iconst_1        
	//   87  140:iadd            
	//   88  141:putfield        #101 <Field int _outputTail>
				abyte1[i] = 110;
	//   89  144:aload           9
	//   90  146:iload_3         
	//   91  147:bipush          110
	//   92  149:bastore         
				i = base64variant.getMaxLineLength() >> 2;
	//   93  150:aload_1         
	//   94  151:invokevirtual   #331 <Method int Base64Variant.getMaxLineLength()>
	//   95  154:iconst_2        
	//   96  155:ishr            
	//   97  156:istore_3        
			}
			i1++;
	//   98  157:iload           6
	//   99  159:iconst_1        
	//  100  160:iadd            
	//  101  161:istore          6
			k = i;
	//  102  163:iload_3         
	//  103  164:istore          5
		}

	//  104  166:iload           6
	//  105  168:istore_3        
	//* 106  169:goto            17
		int j1 = j - i;
	//  107  172:iload           4
	//  108  174:iload_3         
	//  109  175:isub            
	//  110  176:istore          6
		if(j1 > 0)
	//* 111  178:iload           6
	//* 112  180:ifle            251
		{
			if(_outputTail > k1)
	//* 113  183:aload_0         
	//* 114  184:getfield        #101 <Field int _outputTail>
	//* 115  187:iload           7
	//* 116  189:icmple          196
				_flushBuffer();
	//  117  192:aload_0         
	//  118  193:invokevirtual   #104 <Method void _flushBuffer()>
			int l = abyte0[i] << 16;
	//  119  196:aload_2         
	//  120  197:iload_3         
	//  121  198:baload          
	//  122  199:bipush          16
	//  123  201:ishl            
	//  124  202:istore          5
			j = l;
	//  125  204:iload           5
	//  126  206:istore          4
			if(j1 == 2)
	//* 127  208:iload           6
	//* 128  210:iconst_2        
	//* 129  211:icmpne          231
				j = l | (abyte0[i + 1] & 0xff) << 8;
	//  130  214:iload           5
	//  131  216:aload_2         
	//  132  217:iload_3         
	//  133  218:iconst_1        
	//  134  219:iadd            
	//  135  220:baload          
	//  136  221:sipush          255
	//  137  224:iand            
	//  138  225:bipush          8
	//  139  227:ishl            
	//  140  228:ior             
	//  141  229:istore          4
			_outputTail = base64variant.encodeBase64Partial(j, j1, _outputBuffer, _outputTail);
	//  142  231:aload_0         
	//  143  232:aload_1         
	//  144  233:iload           4
	//  145  235:iload           6
	//  146  237:aload_0         
	//  147  238:getfield        #67  <Field byte[] _outputBuffer>
	//  148  241:aload_0         
	//  149  242:getfield        #101 <Field int _outputTail>
	//  150  245:invokevirtual   #337 <Method int Base64Variant.encodeBase64Partial(int, int, byte[], int)>
	//  151  248:putfield        #101 <Field int _outputTail>
		}
	//  152  251:return          
	}

	protected final void _writePPFieldName(SerializableString serializablestring)
		throws IOException
	{
		int i = _writeContext.writeFieldName(serializablestring.getValue());
	//    0    0:aload_0         
	//    1    1:getfield        #304 <Field JsonWriteContext _writeContext>
	//    2    4:aload_1         
	//    3    5:invokeinterface #346 <Method String SerializableString.getValue()>
	//    4   10:invokevirtual   #350 <Method int JsonWriteContext.writeFieldName(String)>
	//    5   13:istore_2        
		if(i == 4)
	//*   6   14:iload_2         
	//*   7   15:iconst_4        
	//*   8   16:icmpne          26
			_reportError("Can not write a field name, expecting a value");
	//    9   19:aload_0         
	//   10   20:ldc2            #352 <String "Can not write a field name, expecting a value">
	//   11   23:invokevirtual   #143 <Method void _reportError(String)>
		if(i == 1)
	//*  12   26:iload_2         
	//*  13   27:iconst_1        
	//*  14   28:icmpne          44
			_cfgPrettyPrinter.writeObjectEntrySeparator(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   15   31:aload_0         
	//   16   32:getfield        #313 <Field PrettyPrinter _cfgPrettyPrinter>
	//   17   35:aload_0         
	//   18   36:invokeinterface #358 <Method void PrettyPrinter.writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)>
		else
	//*  19   41:goto            54
			_cfgPrettyPrinter.beforeObjectEntries(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   20   44:aload_0         
	//   21   45:getfield        #313 <Field PrettyPrinter _cfgPrettyPrinter>
	//   22   48:aload_0         
	//   23   49:invokeinterface #361 <Method void PrettyPrinter.beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)>
		boolean flag = _cfgUnqNames ^ true;
	//   24   54:aload_0         
	//   25   55:getfield        #364 <Field boolean _cfgUnqNames>
	//   26   58:iconst_1        
	//   27   59:ixor            
	//   28   60:istore_2        
		if(flag)
	//*  29   61:iload_2         
	//*  30   62:ifeq            106
		{
			if(_outputTail >= _outputEnd)
	//*  31   65:aload_0         
	//*  32   66:getfield        #101 <Field int _outputTail>
	//*  33   69:aload_0         
	//*  34   70:getfield        #69  <Field int _outputEnd>
	//*  35   73:icmplt          80
				_flushBuffer();
	//   36   76:aload_0         
	//   37   77:invokevirtual   #104 <Method void _flushBuffer()>
			byte abyte0[] = _outputBuffer;
	//   38   80:aload_0         
	//   39   81:getfield        #67  <Field byte[] _outputBuffer>
	//   40   84:astore          4
			int k = _outputTail;
	//   41   86:aload_0         
	//   42   87:getfield        #101 <Field int _outputTail>
	//   43   90:istore_3        
			_outputTail = k + 1;
	//   44   91:aload_0         
	//   45   92:iload_3         
	//   46   93:iconst_1        
	//   47   94:iadd            
	//   48   95:putfield        #101 <Field int _outputTail>
			abyte0[k] = _quoteChar;
	//   49   98:aload           4
	//   50  100:iload_3         
	//   51  101:aload_0         
	//   52  102:getfield        #56  <Field byte _quoteChar>
	//   53  105:bastore         
		}
		_writeBytes(serializablestring.asQuotedUTF8());
	//   54  106:aload_0         
	//   55  107:aload_1         
	//   56  108:invokeinterface #282 <Method byte[] SerializableString.asQuotedUTF8()>
	//   57  113:invokespecial   #284 <Method void _writeBytes(byte[])>
		if(flag)
	//*  58  116:iload_2         
	//*  59  117:ifeq            159
		{
			if(_outputTail >= _outputEnd)
	//*  60  120:aload_0         
	//*  61  121:getfield        #101 <Field int _outputTail>
	//*  62  124:aload_0         
	//*  63  125:getfield        #69  <Field int _outputEnd>
	//*  64  128:icmplt          135
				_flushBuffer();
	//   65  131:aload_0         
	//   66  132:invokevirtual   #104 <Method void _flushBuffer()>
			serializablestring = ((SerializableString) (_outputBuffer));
	//   67  135:aload_0         
	//   68  136:getfield        #67  <Field byte[] _outputBuffer>
	//   69  139:astore_1        
			int j = _outputTail;
	//   70  140:aload_0         
	//   71  141:getfield        #101 <Field int _outputTail>
	//   72  144:istore_2        
			_outputTail = j + 1;
	//   73  145:aload_0         
	//   74  146:iload_2         
	//   75  147:iconst_1        
	//   76  148:iadd            
	//   77  149:putfield        #101 <Field int _outputTail>
			serializablestring[j] = _quoteChar;
	//   78  152:aload_1         
	//   79  153:iload_2         
	//   80  154:aload_0         
	//   81  155:getfield        #56  <Field byte _quoteChar>
	//   82  158:bastore         
		}
	//   83  159:return          
	}

	protected final void _writePPFieldName(String s)
		throws IOException
	{
		int i = _writeContext.writeFieldName(s);
	//    0    0:aload_0         
	//    1    1:getfield        #304 <Field JsonWriteContext _writeContext>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #350 <Method int JsonWriteContext.writeFieldName(String)>
	//    4    8:istore_2        
		if(i == 4)
	//*   5    9:iload_2         
	//*   6   10:iconst_4        
	//*   7   11:icmpne          21
			_reportError("Can not write a field name, expecting a value");
	//    8   14:aload_0         
	//    9   15:ldc2            #352 <String "Can not write a field name, expecting a value">
	//   10   18:invokevirtual   #143 <Method void _reportError(String)>
		if(i == 1)
	//*  11   21:iload_2         
	//*  12   22:iconst_1        
	//*  13   23:icmpne          39
			_cfgPrettyPrinter.writeObjectEntrySeparator(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   14   26:aload_0         
	//   15   27:getfield        #313 <Field PrettyPrinter _cfgPrettyPrinter>
	//   16   30:aload_0         
	//   17   31:invokeinterface #358 <Method void PrettyPrinter.writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)>
		else
	//*  18   36:goto            49
			_cfgPrettyPrinter.beforeObjectEntries(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   19   39:aload_0         
	//   20   40:getfield        #313 <Field PrettyPrinter _cfgPrettyPrinter>
	//   21   43:aload_0         
	//   22   44:invokeinterface #361 <Method void PrettyPrinter.beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)>
		if(_cfgUnqNames)
	//*  23   49:aload_0         
	//*  24   50:getfield        #364 <Field boolean _cfgUnqNames>
	//*  25   53:ifeq            63
		{
			_writeStringSegments(s, false);
	//   26   56:aload_0         
	//   27   57:aload_1         
	//   28   58:iconst_0        
	//   29   59:invokespecial   #366 <Method void _writeStringSegments(String, boolean)>
			return;
	//   30   62:return          
		}
		i = s.length();
	//   31   63:aload_1         
	//   32   64:invokevirtual   #271 <Method int String.length()>
	//   33   67:istore_2        
		if(i > _charBufferLength)
	//*  34   68:iload_2         
	//*  35   69:aload_0         
	//*  36   70:getfield        #79  <Field int _charBufferLength>
	//*  37   73:icmple          83
		{
			_writeStringSegments(s, true);
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:iconst_1        
	//   41   79:invokespecial   #366 <Method void _writeStringSegments(String, boolean)>
			return;
	//   42   82:return          
		}
		if(_outputTail >= _outputEnd)
	//*  43   83:aload_0         
	//*  44   84:getfield        #101 <Field int _outputTail>
	//*  45   87:aload_0         
	//*  46   88:getfield        #69  <Field int _outputEnd>
	//*  47   91:icmplt          98
			_flushBuffer();
	//   48   94:aload_0         
	//   49   95:invokevirtual   #104 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//   50   98:aload_0         
	//   51   99:getfield        #67  <Field byte[] _outputBuffer>
	//   52  102:astore          4
		int j = _outputTail;
	//   53  104:aload_0         
	//   54  105:getfield        #101 <Field int _outputTail>
	//   55  108:istore_3        
		_outputTail = j + 1;
	//   56  109:aload_0         
	//   57  110:iload_3         
	//   58  111:iconst_1        
	//   59  112:iadd            
	//   60  113:putfield        #101 <Field int _outputTail>
		abyte0[j] = _quoteChar;
	//   61  116:aload           4
	//   62  118:iload_3         
	//   63  119:aload_0         
	//   64  120:getfield        #56  <Field byte _quoteChar>
	//   65  123:bastore         
		s.getChars(0, i, _charBuffer, 0);
	//   66  124:aload_1         
	//   67  125:iconst_0        
	//   68  126:iload_2         
	//   69  127:aload_0         
	//   70  128:getfield        #77  <Field char[] _charBuffer>
	//   71  131:iconst_0        
	//   72  132:invokevirtual   #370 <Method void String.getChars(int, int, char[], int)>
		if(i <= _outputMaxContiguous)
	//*  73  135:iload_2         
	//*  74  136:aload_0         
	//*  75  137:getfield        #71  <Field int _outputMaxContiguous>
	//*  76  140:icmpgt          173
		{
			if(_outputTail + i > _outputEnd)
	//*  77  143:aload_0         
	//*  78  144:getfield        #101 <Field int _outputTail>
	//*  79  147:iload_2         
	//*  80  148:iadd            
	//*  81  149:aload_0         
	//*  82  150:getfield        #69  <Field int _outputEnd>
	//*  83  153:icmple          160
				_flushBuffer();
	//   84  156:aload_0         
	//   85  157:invokevirtual   #104 <Method void _flushBuffer()>
			_writeStringSegment(_charBuffer, 0, i);
	//   86  160:aload_0         
	//   87  161:aload_0         
	//   88  162:getfield        #77  <Field char[] _charBuffer>
	//   89  165:iconst_0        
	//   90  166:iload_2         
	//   91  167:invokespecial   #273 <Method void _writeStringSegment(char[], int, int)>
		} else
	//*  92  170:goto            183
		{
			_writeStringSegments(_charBuffer, 0, i);
	//   93  173:aload_0         
	//   94  174:aload_0         
	//   95  175:getfield        #77  <Field char[] _charBuffer>
	//   96  178:iconst_0        
	//   97  179:iload_2         
	//   98  180:invokespecial   #372 <Method void _writeStringSegments(char[], int, int)>
		}
		if(_outputTail >= _outputEnd)
	//*  99  183:aload_0         
	//* 100  184:getfield        #101 <Field int _outputTail>
	//* 101  187:aload_0         
	//* 102  188:getfield        #69  <Field int _outputEnd>
	//* 103  191:icmplt          198
			_flushBuffer();
	//  104  194:aload_0         
	//  105  195:invokevirtual   #104 <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//  106  198:aload_0         
	//  107  199:getfield        #67  <Field byte[] _outputBuffer>
	//  108  202:astore_1        
		i = _outputTail;
	//  109  203:aload_0         
	//  110  204:getfield        #101 <Field int _outputTail>
	//  111  207:istore_2        
		_outputTail = i + 1;
	//  112  208:aload_0         
	//  113  209:iload_2         
	//  114  210:iconst_1        
	//  115  211:iadd            
	//  116  212:putfield        #101 <Field int _outputTail>
		s[i] = _quoteChar;
	//  117  215:aload_1         
	//  118  216:iload_2         
	//  119  217:aload_0         
	//  120  218:getfield        #56  <Field byte _quoteChar>
	//  121  221:bastore         
	//  122  222:return          
	}

	public void close()
		throws IOException
	{
		super.close();
	//    0    0:aload_0         
	//    1    1:invokespecial   #375 <Method void JsonGeneratorImpl.close()>
		if(_outputBuffer != null && isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT))
	//*   2    4:aload_0         
	//*   3    5:getfield        #67  <Field byte[] _outputBuffer>
	//*   4    8:ifnull          54
	//*   5   11:aload_0         
	//*   6   12:getstatic       #378 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_JSON_CONTENT>
	//*   7   15:invokevirtual   #89  <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*   8   18:ifeq            54
			do
			{
				JsonStreamContext jsonstreamcontext = getOutputContext();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #382 <Method JsonStreamContext getOutputContext()>
	//   11   25:astore_1        
				if(jsonstreamcontext.inArray())
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #388 <Method boolean JsonStreamContext.inArray()>
	//*  14   30:ifeq            40
				{
					writeEndArray();
	//   15   33:aload_0         
	//   16   34:invokevirtual   #391 <Method void writeEndArray()>
					continue;
	//   17   37:goto            21
				}
				if(!jsonstreamcontext.inObject())
					break;
	//   18   40:aload_1         
	//   19   41:invokevirtual   #394 <Method boolean JsonStreamContext.inObject()>
	//   20   44:ifeq            54
				writeEndObject();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #397 <Method void writeEndObject()>
			} while(true);
	//   23   51:goto            21
		_flushBuffer();
	//   24   54:aload_0         
	//   25   55:invokevirtual   #104 <Method void _flushBuffer()>
		_outputTail = 0;
	//   26   58:aload_0         
	//   27   59:iconst_0        
	//   28   60:putfield        #101 <Field int _outputTail>
		if(_outputStream != null)
	//*  29   63:aload_0         
	//*  30   64:getfield        #58  <Field OutputStream _outputStream>
	//*  31   67:ifnull          120
			if(!_ioContext.isResourceManaged() && !isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET))
	//*  32   70:aload_0         
	//*  33   71:getfield        #292 <Field IOContext _ioContext>
	//*  34   74:invokevirtual   #400 <Method boolean IOContext.isResourceManaged()>
	//*  35   77:ifne            113
	//*  36   80:aload_0         
	//*  37   81:getstatic       #403 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_TARGET>
	//*  38   84:invokevirtual   #89  <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*  39   87:ifeq            93
	//*  40   90:goto            113
			{
				if(isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM))
	//*  41   93:aload_0         
	//*  42   94:getstatic       #406 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.FLUSH_PASSED_TO_STREAM>
	//*  43   97:invokevirtual   #89  <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*  44  100:ifeq            120
					_outputStream.flush();
	//   45  103:aload_0         
	//   46  104:getfield        #58  <Field OutputStream _outputStream>
	//   47  107:invokevirtual   #409 <Method void OutputStream.flush()>
			} else
	//*  48  110:goto            120
			{
				_outputStream.close();
	//   49  113:aload_0         
	//   50  114:getfield        #58  <Field OutputStream _outputStream>
	//   51  117:invokevirtual   #410 <Method void OutputStream.close()>
			}
		_releaseBuffers();
	//   52  120:aload_0         
	//   53  121:invokevirtual   #412 <Method void _releaseBuffers()>
	//   54  124:return          
	}

	public void flush()
		throws IOException
	{
		_flushBuffer();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #104 <Method void _flushBuffer()>
		if(_outputStream != null && isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM))
	//*   2    4:aload_0         
	//*   3    5:getfield        #58  <Field OutputStream _outputStream>
	//*   4    8:ifnull          28
	//*   5   11:aload_0         
	//*   6   12:getstatic       #406 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.FLUSH_PASSED_TO_STREAM>
	//*   7   15:invokevirtual   #89  <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*   8   18:ifeq            28
			_outputStream.flush();
	//    9   21:aload_0         
	//   10   22:getfield        #58  <Field OutputStream _outputStream>
	//   11   25:invokevirtual   #409 <Method void OutputStream.flush()>
	//   12   28:return          
	}

	public int writeBinary(Base64Variant base64variant, InputStream inputstream, int i)
		throws IOException, JsonGenerationException
	{
		byte abyte0[];
		_verifyValueWrite("write a binary value");
	//    0    0:aload_0         
	//    1    1:ldc2            #416 <String "write a binary value">
	//    2    4:invokevirtual   #418 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #101 <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #69  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #104 <Method void _flushBuffer()>
		abyte0 = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #67  <Field byte[] _outputBuffer>
	//   12   26:astore          6
		int j = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #101 <Field int _outputTail>
	//   15   32:istore          4
		_outputTail = j + 1;
	//   16   34:aload_0         
	//   17   35:iload           4
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #101 <Field int _outputTail>
		abyte0[j] = _quoteChar;
	//   21   42:aload           6
	//   22   44:iload           4
	//   23   46:aload_0         
	//   24   47:getfield        #56  <Field byte _quoteChar>
	//   25   50:bastore         
		abyte0 = _ioContext.allocBase64Buffer();
	//   26   51:aload_0         
	//   27   52:getfield        #292 <Field IOContext _ioContext>
	//   28   55:invokevirtual   #421 <Method byte[] IOContext.allocBase64Buffer()>
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
	//   36   69:invokevirtual   #423 <Method int _writeBinary(Base64Variant, InputStream, byte[])>
	//   37   72:istore          4
		break MISSING_BLOCK_LABEL_152;
	//   38   74:goto            152
		int l = _writeBinary(base64variant, inputstream, abyte0, i);
	//   39   77:aload_0         
	//   40   78:aload_1         
	//   41   79:aload_2         
	//   42   80:aload           6
	//   43   82:iload_3         
	//   44   83:invokevirtual   #425 <Method int _writeBinary(Base64Variant, InputStream, byte[], int)>
	//   45   86:istore          5
		k = i;
	//   46   88:iload_3         
	//   47   89:istore          4
		if(l <= 0)
			break MISSING_BLOCK_LABEL_152;
	//   48   91:iload           5
	//   49   93:ifle            152
		base64variant = ((Base64Variant) (new StringBuilder()));
	//   50   96:new             #197 <Class StringBuilder>
	//   51   99:dup             
	//   52  100:invokespecial   #199 <Method void StringBuilder()>
	//   53  103:astore_1        
		((StringBuilder) (base64variant)).append("Too few bytes available: missing ");
	//   54  104:aload_1         
	//   55  105:ldc2            #427 <String "Too few bytes available: missing ">
	//   56  108:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   57  111:pop             
		((StringBuilder) (base64variant)).append(l);
	//   58  112:aload_1         
	//   59  113:iload           5
	//   60  115:invokevirtual   #430 <Method StringBuilder StringBuilder.append(int)>
	//   61  118:pop             
		((StringBuilder) (base64variant)).append(" bytes (out of ");
	//   62  119:aload_1         
	//   63  120:ldc2            #432 <String " bytes (out of ">
	//   64  123:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   65  126:pop             
		((StringBuilder) (base64variant)).append(i);
	//   66  127:aload_1         
	//   67  128:iload_3         
	//   68  129:invokevirtual   #430 <Method StringBuilder StringBuilder.append(int)>
	//   69  132:pop             
		((StringBuilder) (base64variant)).append(")");
	//   70  133:aload_1         
	//   71  134:ldc2            #434 <String ")">
	//   72  137:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   73  140:pop             
		_reportError(((StringBuilder) (base64variant)).toString());
	//   74  141:aload_0         
	//   75  142:aload_1         
	//   76  143:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   77  146:invokevirtual   #143 <Method void _reportError(String)>
		k = i;
	//   78  149:iload_3         
	//   79  150:istore          4
		_ioContext.releaseBase64Buffer(abyte0);
	//   80  152:aload_0         
	//   81  153:getfield        #292 <Field IOContext _ioContext>
	//   82  156:aload           6
	//   83  158:invokevirtual   #437 <Method void IOContext.releaseBase64Buffer(byte[])>
		if(_outputTail >= _outputEnd)
	//*  84  161:aload_0         
	//*  85  162:getfield        #101 <Field int _outputTail>
	//*  86  165:aload_0         
	//*  87  166:getfield        #69  <Field int _outputEnd>
	//*  88  169:icmplt          176
			_flushBuffer();
	//   89  172:aload_0         
	//   90  173:invokevirtual   #104 <Method void _flushBuffer()>
		base64variant = ((Base64Variant) (_outputBuffer));
	//   91  176:aload_0         
	//   92  177:getfield        #67  <Field byte[] _outputBuffer>
	//   93  180:astore_1        
		i = _outputTail;
	//   94  181:aload_0         
	//   95  182:getfield        #101 <Field int _outputTail>
	//   96  185:istore_3        
		_outputTail = i + 1;
	//   97  186:aload_0         
	//   98  187:iload_3         
	//   99  188:iconst_1        
	//  100  189:iadd            
	//  101  190:putfield        #101 <Field int _outputTail>
		base64variant[i] = _quoteChar;
	//  102  193:aload_1         
	//  103  194:iload_3         
	//  104  195:aload_0         
	//  105  196:getfield        #56  <Field byte _quoteChar>
	//  106  199:bastore         
		return k;
	//  107  200:iload           4
	//  108  202:ireturn         
		base64variant;
	//  109  203:astore_1        
		_ioContext.releaseBase64Buffer(abyte0);
	//  110  204:aload_0         
	//  111  205:getfield        #292 <Field IOContext _ioContext>
	//  112  208:aload           6
	//  113  210:invokevirtual   #437 <Method void IOContext.releaseBase64Buffer(byte[])>
		throw base64variant;
	//  114  213:aload_1         
	//  115  214:athrow          
	}

	public void writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
		throws IOException, JsonGenerationException
	{
		_verifyValueWrite("write a binary value");
	//    0    0:aload_0         
	//    1    1:ldc2            #416 <String "write a binary value">
	//    2    4:invokevirtual   #418 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #101 <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #69  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #104 <Method void _flushBuffer()>
		byte abyte1[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #67  <Field byte[] _outputBuffer>
	//   12   26:astore          6
		int k = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #101 <Field int _outputTail>
	//   15   32:istore          5
		_outputTail = k + 1;
	//   16   34:aload_0         
	//   17   35:iload           5
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #101 <Field int _outputTail>
		abyte1[k] = _quoteChar;
	//   21   42:aload           6
	//   22   44:iload           5
	//   23   46:aload_0         
	//   24   47:getfield        #56  <Field byte _quoteChar>
	//   25   50:bastore         
		_writeBinary(base64variant, abyte0, i, j + i);
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:aload_2         
	//   29   54:iload_3         
	//   30   55:iload           4
	//   31   57:iload_3         
	//   32   58:iadd            
	//   33   59:invokevirtual   #439 <Method void _writeBinary(Base64Variant, byte[], int, int)>
		if(_outputTail >= _outputEnd)
	//*  34   62:aload_0         
	//*  35   63:getfield        #101 <Field int _outputTail>
	//*  36   66:aload_0         
	//*  37   67:getfield        #69  <Field int _outputEnd>
	//*  38   70:icmplt          77
			_flushBuffer();
	//   39   73:aload_0         
	//   40   74:invokevirtual   #104 <Method void _flushBuffer()>
		base64variant = ((Base64Variant) (_outputBuffer));
	//   41   77:aload_0         
	//   42   78:getfield        #67  <Field byte[] _outputBuffer>
	//   43   81:astore_1        
		i = _outputTail;
	//   44   82:aload_0         
	//   45   83:getfield        #101 <Field int _outputTail>
	//   46   86:istore_3        
		_outputTail = i + 1;
	//   47   87:aload_0         
	//   48   88:iload_3         
	//   49   89:iconst_1        
	//   50   90:iadd            
	//   51   91:putfield        #101 <Field int _outputTail>
		base64variant[i] = _quoteChar;
	//   52   94:aload_1         
	//   53   95:iload_3         
	//   54   96:aload_0         
	//   55   97:getfield        #56  <Field byte _quoteChar>
	//   56  100:bastore         
	//   57  101:return          
	}

	public void writeBoolean(boolean flag)
		throws IOException
	{
		_verifyValueWrite("write a boolean value");
	//    0    0:aload_0         
	//    1    1:ldc2            #443 <String "write a boolean value">
	//    2    4:invokevirtual   #418 <Method void _verifyValueWrite(String)>
		if(_outputTail + 5 >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #101 <Field int _outputTail>
	//*   5   11:iconst_5        
	//*   6   12:iadd            
	//*   7   13:aload_0         
	//*   8   14:getfield        #69  <Field int _outputEnd>
	//*   9   17:icmplt          24
			_flushBuffer();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #104 <Method void _flushBuffer()>
		byte abyte0[];
		if(flag)
	//*  12   24:iload_1         
	//*  13   25:ifeq            35
			abyte0 = TRUE_BYTES;
	//   14   28:getstatic       #43  <Field byte[] TRUE_BYTES>
	//   15   31:astore_3        
		else
	//*  16   32:goto            39
			abyte0 = FALSE_BYTES;
	//   17   35:getstatic       #48  <Field byte[] FALSE_BYTES>
	//   18   38:astore_3        
		int i = abyte0.length;
	//   19   39:aload_3         
	//   20   40:arraylength     
	//   21   41:istore_2        
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (_outputBuffer)), _outputTail, i);
	//   22   42:aload_3         
	//   23   43:iconst_0        
	//   24   44:aload_0         
	//   25   45:getfield        #67  <Field byte[] _outputBuffer>
	//   26   48:aload_0         
	//   27   49:getfield        #101 <Field int _outputTail>
	//   28   52:iload_2         
	//   29   53:invokestatic    #116 <Method void System.arraycopy(Object, int, Object, int, int)>
		_outputTail = _outputTail + i;
	//   30   56:aload_0         
	//   31   57:aload_0         
	//   32   58:getfield        #101 <Field int _outputTail>
	//   33   61:iload_2         
	//   34   62:iadd            
	//   35   63:putfield        #101 <Field int _outputTail>
	//   36   66:return          
	}

	public final void writeEndArray()
		throws IOException
	{
		if(!_writeContext.inArray())
	//*   0    0:aload_0         
	//*   1    1:getfield        #304 <Field JsonWriteContext _writeContext>
	//*   2    4:invokevirtual   #444 <Method boolean JsonWriteContext.inArray()>
	//*   3    7:ifne            46
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4   10:new             #197 <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #199 <Method void StringBuilder()>
	//    7   17:astore_2        
			stringbuilder.append("Current context not Array but ");
	//    8   18:aload_2         
	//    9   19:ldc2            #446 <String "Current context not Array but ">
	//   10   22:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:pop             
			stringbuilder.append(_writeContext.typeDesc());
	//   12   26:aload_2         
	//   13   27:aload_0         
	//   14   28:getfield        #304 <Field JsonWriteContext _writeContext>
	//   15   31:invokevirtual   #449 <Method String JsonWriteContext.typeDesc()>
	//   16   34:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
			_reportError(stringbuilder.toString());
	//   18   38:aload_0         
	//   19   39:aload_2         
	//   20   40:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   21   43:invokevirtual   #143 <Method void _reportError(String)>
		}
		if(_cfgPrettyPrinter != null)
	//*  22   46:aload_0         
	//*  23   47:getfield        #313 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  24   50:ifnull          73
		{
			_cfgPrettyPrinter.writeEndArray(((com.fasterxml.jackson.core.JsonGenerator) (this)), _writeContext.getEntryCount());
	//   25   53:aload_0         
	//   26   54:getfield        #313 <Field PrettyPrinter _cfgPrettyPrinter>
	//   27   57:aload_0         
	//   28   58:aload_0         
	//   29   59:getfield        #304 <Field JsonWriteContext _writeContext>
	//   30   62:invokevirtual   #452 <Method int JsonWriteContext.getEntryCount()>
	//   31   65:invokeinterface #455 <Method void PrettyPrinter.writeEndArray(com.fasterxml.jackson.core.JsonGenerator, int)>
		} else
	//*  32   70:goto            110
		{
			if(_outputTail >= _outputEnd)
	//*  33   73:aload_0         
	//*  34   74:getfield        #101 <Field int _outputTail>
	//*  35   77:aload_0         
	//*  36   78:getfield        #69  <Field int _outputEnd>
	//*  37   81:icmplt          88
				_flushBuffer();
	//   38   84:aload_0         
	//   39   85:invokevirtual   #104 <Method void _flushBuffer()>
			byte abyte0[] = _outputBuffer;
	//   40   88:aload_0         
	//   41   89:getfield        #67  <Field byte[] _outputBuffer>
	//   42   92:astore_2        
			int i = _outputTail;
	//   43   93:aload_0         
	//   44   94:getfield        #101 <Field int _outputTail>
	//   45   97:istore_1        
			_outputTail = i + 1;
	//   46   98:aload_0         
	//   47   99:iload_1         
	//   48  100:iconst_1        
	//   49  101:iadd            
	//   50  102:putfield        #101 <Field int _outputTail>
			abyte0[i] = 93;
	//   51  105:aload_2         
	//   52  106:iload_1         
	//   53  107:bipush          93
	//   54  109:bastore         
		}
		_writeContext = _writeContext.clearAndGetParent();
	//   55  110:aload_0         
	//   56  111:aload_0         
	//   57  112:getfield        #304 <Field JsonWriteContext _writeContext>
	//   58  115:invokevirtual   #459 <Method JsonWriteContext JsonWriteContext.clearAndGetParent()>
	//   59  118:putfield        #304 <Field JsonWriteContext _writeContext>
	//   60  121:return          
	}

	public final void writeEndObject()
		throws IOException
	{
		if(!_writeContext.inObject())
	//*   0    0:aload_0         
	//*   1    1:getfield        #304 <Field JsonWriteContext _writeContext>
	//*   2    4:invokevirtual   #460 <Method boolean JsonWriteContext.inObject()>
	//*   3    7:ifne            46
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4   10:new             #197 <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #199 <Method void StringBuilder()>
	//    7   17:astore_2        
			stringbuilder.append("Current context not Object but ");
	//    8   18:aload_2         
	//    9   19:ldc2            #462 <String "Current context not Object but ">
	//   10   22:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:pop             
			stringbuilder.append(_writeContext.typeDesc());
	//   12   26:aload_2         
	//   13   27:aload_0         
	//   14   28:getfield        #304 <Field JsonWriteContext _writeContext>
	//   15   31:invokevirtual   #449 <Method String JsonWriteContext.typeDesc()>
	//   16   34:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
			_reportError(stringbuilder.toString());
	//   18   38:aload_0         
	//   19   39:aload_2         
	//   20   40:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   21   43:invokevirtual   #143 <Method void _reportError(String)>
		}
		if(_cfgPrettyPrinter != null)
	//*  22   46:aload_0         
	//*  23   47:getfield        #313 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  24   50:ifnull          73
		{
			_cfgPrettyPrinter.writeEndObject(((com.fasterxml.jackson.core.JsonGenerator) (this)), _writeContext.getEntryCount());
	//   25   53:aload_0         
	//   26   54:getfield        #313 <Field PrettyPrinter _cfgPrettyPrinter>
	//   27   57:aload_0         
	//   28   58:aload_0         
	//   29   59:getfield        #304 <Field JsonWriteContext _writeContext>
	//   30   62:invokevirtual   #452 <Method int JsonWriteContext.getEntryCount()>
	//   31   65:invokeinterface #464 <Method void PrettyPrinter.writeEndObject(com.fasterxml.jackson.core.JsonGenerator, int)>
		} else
	//*  32   70:goto            110
		{
			if(_outputTail >= _outputEnd)
	//*  33   73:aload_0         
	//*  34   74:getfield        #101 <Field int _outputTail>
	//*  35   77:aload_0         
	//*  36   78:getfield        #69  <Field int _outputEnd>
	//*  37   81:icmplt          88
				_flushBuffer();
	//   38   84:aload_0         
	//   39   85:invokevirtual   #104 <Method void _flushBuffer()>
			byte abyte0[] = _outputBuffer;
	//   40   88:aload_0         
	//   41   89:getfield        #67  <Field byte[] _outputBuffer>
	//   42   92:astore_2        
			int i = _outputTail;
	//   43   93:aload_0         
	//   44   94:getfield        #101 <Field int _outputTail>
	//   45   97:istore_1        
			_outputTail = i + 1;
	//   46   98:aload_0         
	//   47   99:iload_1         
	//   48  100:iconst_1        
	//   49  101:iadd            
	//   50  102:putfield        #101 <Field int _outputTail>
			abyte0[i] = 125;
	//   51  105:aload_2         
	//   52  106:iload_1         
	//   53  107:bipush          125
	//   54  109:bastore         
		}
		_writeContext = _writeContext.clearAndGetParent();
	//   55  110:aload_0         
	//   56  111:aload_0         
	//   57  112:getfield        #304 <Field JsonWriteContext _writeContext>
	//   58  115:invokevirtual   #459 <Method JsonWriteContext JsonWriteContext.clearAndGetParent()>
	//   59  118:putfield        #304 <Field JsonWriteContext _writeContext>
	//   60  121:return          
	}

	public void writeFieldName(SerializableString serializablestring)
		throws IOException
	{
		if(_cfgPrettyPrinter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field PrettyPrinter _cfgPrettyPrinter>
	//*   2    4:ifnull          13
		{
			_writePPFieldName(serializablestring);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #466 <Method void _writePPFieldName(SerializableString)>
			return;
	//    6   12:return          
		}
		int i = _writeContext.writeFieldName(serializablestring.getValue());
	//    7   13:aload_0         
	//    8   14:getfield        #304 <Field JsonWriteContext _writeContext>
	//    9   17:aload_1         
	//   10   18:invokeinterface #346 <Method String SerializableString.getValue()>
	//   11   23:invokevirtual   #350 <Method int JsonWriteContext.writeFieldName(String)>
	//   12   26:istore_2        
		if(i == 4)
	//*  13   27:iload_2         
	//*  14   28:iconst_4        
	//*  15   29:icmpne          39
			_reportError("Can not write a field name, expecting a value");
	//   16   32:aload_0         
	//   17   33:ldc2            #352 <String "Can not write a field name, expecting a value">
	//   18   36:invokevirtual   #143 <Method void _reportError(String)>
		if(i == 1)
	//*  19   39:iload_2         
	//*  20   40:iconst_1        
	//*  21   41:icmpne          81
		{
			if(_outputTail >= _outputEnd)
	//*  22   44:aload_0         
	//*  23   45:getfield        #101 <Field int _outputTail>
	//*  24   48:aload_0         
	//*  25   49:getfield        #69  <Field int _outputEnd>
	//*  26   52:icmplt          59
				_flushBuffer();
	//   27   55:aload_0         
	//   28   56:invokevirtual   #104 <Method void _flushBuffer()>
			byte abyte0[] = _outputBuffer;
	//   29   59:aload_0         
	//   30   60:getfield        #67  <Field byte[] _outputBuffer>
	//   31   63:astore_3        
			i = _outputTail;
	//   32   64:aload_0         
	//   33   65:getfield        #101 <Field int _outputTail>
	//   34   68:istore_2        
			_outputTail = i + 1;
	//   35   69:aload_0         
	//   36   70:iload_2         
	//   37   71:iconst_1        
	//   38   72:iadd            
	//   39   73:putfield        #101 <Field int _outputTail>
			abyte0[i] = 44;
	//   40   76:aload_3         
	//   41   77:iload_2         
	//   42   78:bipush          44
	//   43   80:bastore         
		}
		if(_cfgUnqNames)
	//*  44   81:aload_0         
	//*  45   82:getfield        #364 <Field boolean _cfgUnqNames>
	//*  46   85:ifeq            94
		{
			_writeUnq(serializablestring);
	//   47   88:aload_0         
	//   48   89:aload_1         
	//   49   90:invokespecial   #468 <Method void _writeUnq(SerializableString)>
			return;
	//   50   93:return          
		}
		if(_outputTail >= _outputEnd)
	//*  51   94:aload_0         
	//*  52   95:getfield        #101 <Field int _outputTail>
	//*  53   98:aload_0         
	//*  54   99:getfield        #69  <Field int _outputEnd>
	//*  55  102:icmplt          109
			_flushBuffer();
	//   56  105:aload_0         
	//   57  106:invokevirtual   #104 <Method void _flushBuffer()>
		byte abyte1[] = _outputBuffer;
	//   58  109:aload_0         
	//   59  110:getfield        #67  <Field byte[] _outputBuffer>
	//   60  113:astore_3        
		i = _outputTail;
	//   61  114:aload_0         
	//   62  115:getfield        #101 <Field int _outputTail>
	//   63  118:istore_2        
		_outputTail = i + 1;
	//   64  119:aload_0         
	//   65  120:iload_2         
	//   66  121:iconst_1        
	//   67  122:iadd            
	//   68  123:putfield        #101 <Field int _outputTail>
		abyte1[i] = _quoteChar;
	//   69  126:aload_3         
	//   70  127:iload_2         
	//   71  128:aload_0         
	//   72  129:getfield        #56  <Field byte _quoteChar>
	//   73  132:bastore         
		i = serializablestring.appendQuotedUTF8(abyte1, _outputTail);
	//   74  133:aload_1         
	//   75  134:aload_3         
	//   76  135:aload_0         
	//   77  136:getfield        #101 <Field int _outputTail>
	//   78  139:invokeinterface #279 <Method int SerializableString.appendQuotedUTF8(byte[], int)>
	//   79  144:istore_2        
		if(i < 0)
	//*  80  145:iload_2         
	//*  81  146:ifge            162
			_writeBytes(serializablestring.asQuotedUTF8());
	//   82  149:aload_0         
	//   83  150:aload_1         
	//   84  151:invokeinterface #282 <Method byte[] SerializableString.asQuotedUTF8()>
	//   85  156:invokespecial   #284 <Method void _writeBytes(byte[])>
		else
	//*  86  159:goto            172
			_outputTail = _outputTail + i;
	//   87  162:aload_0         
	//   88  163:aload_0         
	//   89  164:getfield        #101 <Field int _outputTail>
	//   90  167:iload_2         
	//   91  168:iadd            
	//   92  169:putfield        #101 <Field int _outputTail>
		if(_outputTail >= _outputEnd)
	//*  93  172:aload_0         
	//*  94  173:getfield        #101 <Field int _outputTail>
	//*  95  176:aload_0         
	//*  96  177:getfield        #69  <Field int _outputEnd>
	//*  97  180:icmplt          187
			_flushBuffer();
	//   98  183:aload_0         
	//   99  184:invokevirtual   #104 <Method void _flushBuffer()>
		serializablestring = ((SerializableString) (_outputBuffer));
	//  100  187:aload_0         
	//  101  188:getfield        #67  <Field byte[] _outputBuffer>
	//  102  191:astore_1        
		i = _outputTail;
	//  103  192:aload_0         
	//  104  193:getfield        #101 <Field int _outputTail>
	//  105  196:istore_2        
		_outputTail = i + 1;
	//  106  197:aload_0         
	//  107  198:iload_2         
	//  108  199:iconst_1        
	//  109  200:iadd            
	//  110  201:putfield        #101 <Field int _outputTail>
		serializablestring[i] = _quoteChar;
	//  111  204:aload_1         
	//  112  205:iload_2         
	//  113  206:aload_0         
	//  114  207:getfield        #56  <Field byte _quoteChar>
	//  115  210:bastore         
	//  116  211:return          
	}

	public void writeFieldName(String s)
		throws IOException
	{
		if(_cfgPrettyPrinter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field PrettyPrinter _cfgPrettyPrinter>
	//*   2    4:ifnull          13
		{
			_writePPFieldName(s);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #470 <Method void _writePPFieldName(String)>
			return;
	//    6   12:return          
		}
		int i = _writeContext.writeFieldName(s);
	//    7   13:aload_0         
	//    8   14:getfield        #304 <Field JsonWriteContext _writeContext>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #350 <Method int JsonWriteContext.writeFieldName(String)>
	//   11   21:istore_2        
		if(i == 4)
	//*  12   22:iload_2         
	//*  13   23:iconst_4        
	//*  14   24:icmpne          34
			_reportError("Can not write a field name, expecting a value");
	//   15   27:aload_0         
	//   16   28:ldc2            #352 <String "Can not write a field name, expecting a value">
	//   17   31:invokevirtual   #143 <Method void _reportError(String)>
		if(i == 1)
	//*  18   34:iload_2         
	//*  19   35:iconst_1        
	//*  20   36:icmpne          78
		{
			if(_outputTail >= _outputEnd)
	//*  21   39:aload_0         
	//*  22   40:getfield        #101 <Field int _outputTail>
	//*  23   43:aload_0         
	//*  24   44:getfield        #69  <Field int _outputEnd>
	//*  25   47:icmplt          54
				_flushBuffer();
	//   26   50:aload_0         
	//   27   51:invokevirtual   #104 <Method void _flushBuffer()>
			byte abyte0[] = _outputBuffer;
	//   28   54:aload_0         
	//   29   55:getfield        #67  <Field byte[] _outputBuffer>
	//   30   58:astore          4
			i = _outputTail;
	//   31   60:aload_0         
	//   32   61:getfield        #101 <Field int _outputTail>
	//   33   64:istore_2        
			_outputTail = i + 1;
	//   34   65:aload_0         
	//   35   66:iload_2         
	//   36   67:iconst_1        
	//   37   68:iadd            
	//   38   69:putfield        #101 <Field int _outputTail>
			abyte0[i] = 44;
	//   39   72:aload           4
	//   40   74:iload_2         
	//   41   75:bipush          44
	//   42   77:bastore         
		}
		if(_cfgUnqNames)
	//*  43   78:aload_0         
	//*  44   79:getfield        #364 <Field boolean _cfgUnqNames>
	//*  45   82:ifeq            92
		{
			_writeStringSegments(s, false);
	//   46   85:aload_0         
	//   47   86:aload_1         
	//   48   87:iconst_0        
	//   49   88:invokespecial   #366 <Method void _writeStringSegments(String, boolean)>
			return;
	//   50   91:return          
		}
		i = s.length();
	//   51   92:aload_1         
	//   52   93:invokevirtual   #271 <Method int String.length()>
	//   53   96:istore_2        
		if(i > _charBufferLength)
	//*  54   97:iload_2         
	//*  55   98:aload_0         
	//*  56   99:getfield        #79  <Field int _charBufferLength>
	//*  57  102:icmple          112
		{
			_writeStringSegments(s, true);
	//   58  105:aload_0         
	//   59  106:aload_1         
	//   60  107:iconst_1        
	//   61  108:invokespecial   #366 <Method void _writeStringSegments(String, boolean)>
			return;
	//   62  111:return          
		}
		if(_outputTail >= _outputEnd)
	//*  63  112:aload_0         
	//*  64  113:getfield        #101 <Field int _outputTail>
	//*  65  116:aload_0         
	//*  66  117:getfield        #69  <Field int _outputEnd>
	//*  67  120:icmplt          127
			_flushBuffer();
	//   68  123:aload_0         
	//   69  124:invokevirtual   #104 <Method void _flushBuffer()>
		byte abyte1[] = _outputBuffer;
	//   70  127:aload_0         
	//   71  128:getfield        #67  <Field byte[] _outputBuffer>
	//   72  131:astore          4
		int j = _outputTail;
	//   73  133:aload_0         
	//   74  134:getfield        #101 <Field int _outputTail>
	//   75  137:istore_3        
		_outputTail = j + 1;
	//   76  138:aload_0         
	//   77  139:iload_3         
	//   78  140:iconst_1        
	//   79  141:iadd            
	//   80  142:putfield        #101 <Field int _outputTail>
		abyte1[j] = _quoteChar;
	//   81  145:aload           4
	//   82  147:iload_3         
	//   83  148:aload_0         
	//   84  149:getfield        #56  <Field byte _quoteChar>
	//   85  152:bastore         
		if(i <= _outputMaxContiguous)
	//*  86  153:iload_2         
	//*  87  154:aload_0         
	//*  88  155:getfield        #71  <Field int _outputMaxContiguous>
	//*  89  158:icmpgt          188
		{
			if(_outputTail + i > _outputEnd)
	//*  90  161:aload_0         
	//*  91  162:getfield        #101 <Field int _outputTail>
	//*  92  165:iload_2         
	//*  93  166:iadd            
	//*  94  167:aload_0         
	//*  95  168:getfield        #69  <Field int _outputEnd>
	//*  96  171:icmple          178
				_flushBuffer();
	//   97  174:aload_0         
	//   98  175:invokevirtual   #104 <Method void _flushBuffer()>
			_writeStringSegment(s, 0, i);
	//   99  178:aload_0         
	//  100  179:aload_1         
	//  101  180:iconst_0        
	//  102  181:iload_2         
	//  103  182:invokespecial   #266 <Method void _writeStringSegment(String, int, int)>
		} else
	//* 104  185:goto            195
		{
			_writeStringSegments(s, 0, i);
	//  105  188:aload_0         
	//  106  189:aload_1         
	//  107  190:iconst_0        
	//  108  191:iload_2         
	//  109  192:invokespecial   #472 <Method void _writeStringSegments(String, int, int)>
		}
		if(_outputTail >= _outputEnd)
	//* 110  195:aload_0         
	//* 111  196:getfield        #101 <Field int _outputTail>
	//* 112  199:aload_0         
	//* 113  200:getfield        #69  <Field int _outputEnd>
	//* 114  203:icmplt          210
			_flushBuffer();
	//  115  206:aload_0         
	//  116  207:invokevirtual   #104 <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//  117  210:aload_0         
	//  118  211:getfield        #67  <Field byte[] _outputBuffer>
	//  119  214:astore_1        
		i = _outputTail;
	//  120  215:aload_0         
	//  121  216:getfield        #101 <Field int _outputTail>
	//  122  219:istore_2        
		_outputTail = i + 1;
	//  123  220:aload_0         
	//  124  221:iload_2         
	//  125  222:iconst_1        
	//  126  223:iadd            
	//  127  224:putfield        #101 <Field int _outputTail>
		s[i] = _quoteChar;
	//  128  227:aload_1         
	//  129  228:iload_2         
	//  130  229:aload_0         
	//  131  230:getfield        #56  <Field byte _quoteChar>
	//  132  233:bastore         
	//  133  234:return          
	}

	public void writeNull()
		throws IOException
	{
		_verifyValueWrite("write a null");
	//    0    0:aload_0         
	//    1    1:ldc2            #475 <String "write a null">
	//    2    4:invokevirtual   #418 <Method void _verifyValueWrite(String)>
		_writeNull();
	//    3    7:aload_0         
	//    4    8:invokespecial   #477 <Method void _writeNull()>
	//    5   11:return          
	}

	public void writeNumber(double d)
		throws IOException
	{
		if(!_cfgNumbersAsStrings && (!Double.isNaN(d) && !Double.isInfinite(d) || !com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(_features)))
	//*   0    0:aload_0         
	//*   1    1:getfield        #482 <Field boolean _cfgNumbersAsStrings>
	//*   2    4:ifne            53
	//*   3    7:dload_1         
	//*   4    8:invokestatic    #488 <Method boolean Double.isNaN(double)>
	//*   5   11:ifne            21
	//*   6   14:dload_1         
	//*   7   15:invokestatic    #491 <Method boolean Double.isInfinite(double)>
	//*   8   18:ifeq            37
	//*   9   21:getstatic       #494 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.QUOTE_NON_NUMERIC_NUMBERS>
	//*  10   24:aload_0         
	//*  11   25:getfield        #497 <Field int _features>
	//*  12   28:invokevirtual   #501 <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  13   31:ifeq            37
	//*  14   34:goto            53
		{
			_verifyValueWrite("write a number");
	//   15   37:aload_0         
	//   16   38:ldc2            #503 <String "write a number">
	//   17   41:invokevirtual   #418 <Method void _verifyValueWrite(String)>
			writeRaw(String.valueOf(d));
	//   18   44:aload_0         
	//   19   45:dload_1         
	//   20   46:invokestatic    #506 <Method String String.valueOf(double)>
	//   21   49:invokevirtual   #242 <Method void writeRaw(String)>
			return;
	//   22   52:return          
		} else
		{
			writeString(String.valueOf(d));
	//   23   53:aload_0         
	//   24   54:dload_1         
	//   25   55:invokestatic    #506 <Method String String.valueOf(double)>
	//   26   58:invokevirtual   #509 <Method void writeString(String)>
			return;
	//   27   61:return          
		}
	}

	public void writeNumber(float f)
		throws IOException
	{
		if(!_cfgNumbersAsStrings && (!Float.isNaN(f) && !Float.isInfinite(f) || !com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(_features)))
	//*   0    0:aload_0         
	//*   1    1:getfield        #482 <Field boolean _cfgNumbersAsStrings>
	//*   2    4:ifne            53
	//*   3    7:fload_1         
	//*   4    8:invokestatic    #515 <Method boolean Float.isNaN(float)>
	//*   5   11:ifne            21
	//*   6   14:fload_1         
	//*   7   15:invokestatic    #517 <Method boolean Float.isInfinite(float)>
	//*   8   18:ifeq            37
	//*   9   21:getstatic       #494 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.QUOTE_NON_NUMERIC_NUMBERS>
	//*  10   24:aload_0         
	//*  11   25:getfield        #497 <Field int _features>
	//*  12   28:invokevirtual   #501 <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  13   31:ifeq            37
	//*  14   34:goto            53
		{
			_verifyValueWrite("write a number");
	//   15   37:aload_0         
	//   16   38:ldc2            #503 <String "write a number">
	//   17   41:invokevirtual   #418 <Method void _verifyValueWrite(String)>
			writeRaw(String.valueOf(f));
	//   18   44:aload_0         
	//   19   45:fload_1         
	//   20   46:invokestatic    #520 <Method String String.valueOf(float)>
	//   21   49:invokevirtual   #242 <Method void writeRaw(String)>
			return;
	//   22   52:return          
		} else
		{
			writeString(String.valueOf(f));
	//   23   53:aload_0         
	//   24   54:fload_1         
	//   25   55:invokestatic    #520 <Method String String.valueOf(float)>
	//   26   58:invokevirtual   #509 <Method void writeString(String)>
			return;
	//   27   61:return          
		}
	}

	public void writeNumber(int i)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #503 <String "write a number">
	//    2    4:invokevirtual   #418 <Method void _verifyValueWrite(String)>
		if(_outputTail + 11 >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #101 <Field int _outputTail>
	//*   5   11:bipush          11
	//*   6   13:iadd            
	//*   7   14:aload_0         
	//*   8   15:getfield        #69  <Field int _outputEnd>
	//*   9   18:icmplt          25
			_flushBuffer();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #104 <Method void _flushBuffer()>
		if(_cfgNumbersAsStrings)
	//*  12   25:aload_0         
	//*  13   26:getfield        #482 <Field boolean _cfgNumbersAsStrings>
	//*  14   29:ifeq            38
		{
			_writeQuotedInt(i);
	//   15   32:aload_0         
	//   16   33:iload_1         
	//   17   34:invokespecial   #522 <Method void _writeQuotedInt(int)>
			return;
	//   18   37:return          
		} else
		{
			_outputTail = NumberOutput.outputInt(i, _outputBuffer, _outputTail);
	//   19   38:aload_0         
	//   20   39:iload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #67  <Field byte[] _outputBuffer>
	//   23   44:aload_0         
	//   24   45:getfield        #101 <Field int _outputTail>
	//   25   48:invokestatic    #232 <Method int NumberOutput.outputInt(int, byte[], int)>
	//   26   51:putfield        #101 <Field int _outputTail>
			return;
	//   27   54:return          
		}
	}

	public void writeNumber(long l)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #503 <String "write a number">
	//    2    4:invokevirtual   #418 <Method void _verifyValueWrite(String)>
		if(_cfgNumbersAsStrings)
	//*   3    7:aload_0         
	//*   4    8:getfield        #482 <Field boolean _cfgNumbersAsStrings>
	//*   5   11:ifeq            20
		{
			_writeQuotedLong(l);
	//    6   14:aload_0         
	//    7   15:lload_1         
	//    8   16:invokespecial   #524 <Method void _writeQuotedLong(long)>
			return;
	//    9   19:return          
		}
		if(_outputTail + 21 >= _outputEnd)
	//*  10   20:aload_0         
	//*  11   21:getfield        #101 <Field int _outputTail>
	//*  12   24:bipush          21
	//*  13   26:iadd            
	//*  14   27:aload_0         
	//*  15   28:getfield        #69  <Field int _outputEnd>
	//*  16   31:icmplt          38
			_flushBuffer();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #104 <Method void _flushBuffer()>
		_outputTail = NumberOutput.outputLong(l, _outputBuffer, _outputTail);
	//   19   38:aload_0         
	//   20   39:lload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #67  <Field byte[] _outputBuffer>
	//   23   44:aload_0         
	//   24   45:getfield        #101 <Field int _outputTail>
	//   25   48:invokestatic    #238 <Method int NumberOutput.outputLong(long, byte[], int)>
	//   26   51:putfield        #101 <Field int _outputTail>
	//   27   54:return          
	}

	public void writeNumber(String s)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #503 <String "write a number">
	//    2    4:invokevirtual   #418 <Method void _verifyValueWrite(String)>
		if(_cfgNumbersAsStrings)
	//*   3    7:aload_0         
	//*   4    8:getfield        #482 <Field boolean _cfgNumbersAsStrings>
	//*   5   11:ifeq            20
		{
			_writeQuotedRaw(s);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokespecial   #526 <Method void _writeQuotedRaw(String)>
			return;
	//    9   19:return          
		} else
		{
			writeRaw(s);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #242 <Method void writeRaw(String)>
			return;
	//   13   25:return          
		}
	}

	public void writeNumber(BigDecimal bigdecimal)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #503 <String "write a number">
	//    2    4:invokevirtual   #418 <Method void _verifyValueWrite(String)>
		if(bigdecimal == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       16
		{
			_writeNull();
	//    5   11:aload_0         
	//    6   12:invokespecial   #477 <Method void _writeNull()>
			return;
	//    7   15:return          
		}
		if(_cfgNumbersAsStrings)
	//*   8   16:aload_0         
	//*   9   17:getfield        #482 <Field boolean _cfgNumbersAsStrings>
	//*  10   20:ifeq            33
		{
			_writeQuotedRaw(_asString(bigdecimal));
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #531 <Method String _asString(BigDecimal)>
	//   15   29:invokespecial   #526 <Method void _writeQuotedRaw(String)>
			return;
	//   16   32:return          
		} else
		{
			writeRaw(_asString(bigdecimal));
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #531 <Method String _asString(BigDecimal)>
	//   21   39:invokevirtual   #242 <Method void writeRaw(String)>
			return;
	//   22   42:return          
		}
	}

	public void writeNumber(BigInteger biginteger)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #503 <String "write a number">
	//    2    4:invokevirtual   #418 <Method void _verifyValueWrite(String)>
		if(biginteger == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       16
		{
			_writeNull();
	//    5   11:aload_0         
	//    6   12:invokespecial   #477 <Method void _writeNull()>
			return;
	//    7   15:return          
		}
		if(_cfgNumbersAsStrings)
	//*   8   16:aload_0         
	//*   9   17:getfield        #482 <Field boolean _cfgNumbersAsStrings>
	//*  10   20:ifeq            32
		{
			_writeQuotedRaw(biginteger.toString());
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #535 <Method String BigInteger.toString()>
	//   14   28:invokespecial   #526 <Method void _writeQuotedRaw(String)>
			return;
	//   15   31:return          
		} else
		{
			writeRaw(biginteger.toString());
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #535 <Method String BigInteger.toString()>
	//   19   37:invokevirtual   #242 <Method void writeRaw(String)>
			return;
	//   20   40:return          
		}
	}

	public void writeNumber(short word0)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #503 <String "write a number">
	//    2    4:invokevirtual   #418 <Method void _verifyValueWrite(String)>
		if(_outputTail + 6 >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #101 <Field int _outputTail>
	//*   5   11:bipush          6
	//*   6   13:iadd            
	//*   7   14:aload_0         
	//*   8   15:getfield        #69  <Field int _outputEnd>
	//*   9   18:icmplt          25
			_flushBuffer();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #104 <Method void _flushBuffer()>
		if(_cfgNumbersAsStrings)
	//*  12   25:aload_0         
	//*  13   26:getfield        #482 <Field boolean _cfgNumbersAsStrings>
	//*  14   29:ifeq            38
		{
			_writeQuotedShort(word0);
	//   15   32:aload_0         
	//   16   33:iload_1         
	//   17   34:invokespecial   #537 <Method void _writeQuotedShort(short)>
			return;
	//   18   37:return          
		} else
		{
			_outputTail = NumberOutput.outputInt(((int) (word0)), _outputBuffer, _outputTail);
	//   19   38:aload_0         
	//   20   39:iload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #67  <Field byte[] _outputBuffer>
	//   23   44:aload_0         
	//   24   45:getfield        #101 <Field int _outputTail>
	//   25   48:invokestatic    #232 <Method int NumberOutput.outputInt(int, byte[], int)>
	//   26   51:putfield        #101 <Field int _outputTail>
			return;
	//   27   54:return          
		}
	}

	public void writeRaw(char c)
		throws IOException
	{
		if(_outputTail + 3 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field int _outputTail>
	//*   2    4:iconst_3        
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #69  <Field int _outputEnd>
	//*   6   10:icmplt          17
			_flushBuffer();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #104 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//    9   17:aload_0         
	//   10   18:getfield        #67  <Field byte[] _outputBuffer>
	//   11   21:astore_3        
		if(c <= '\177')
	//*  12   22:iload_1         
	//*  13   23:bipush          127
	//*  14   25:icmpgt          46
		{
			int i = _outputTail;
	//   15   28:aload_0         
	//   16   29:getfield        #101 <Field int _outputTail>
	//   17   32:istore_2        
			_outputTail = i + 1;
	//   18   33:aload_0         
	//   19   34:iload_2         
	//   20   35:iconst_1        
	//   21   36:iadd            
	//   22   37:putfield        #101 <Field int _outputTail>
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
	//   33   54:getfield        #101 <Field int _outputTail>
	//   34   57:istore_2        
			_outputTail = j + 1;
	//   35   58:aload_0         
	//   36   59:iload_2         
	//   37   60:iconst_1        
	//   38   61:iadd            
	//   39   62:putfield        #101 <Field int _outputTail>
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
	//   50   78:getfield        #101 <Field int _outputTail>
	//   51   81:istore_2        
			_outputTail = j + 1;
	//   52   82:aload_0         
	//   53   83:iload_2         
	//   54   84:iconst_1        
	//   55   85:iadd            
	//   56   86:putfield        #101 <Field int _outputTail>
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
	//   72  107:invokespecial   #247 <Method int _outputRawMultiByteChar(int, char[], int, int)>
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
	//    1    1:invokeinterface #169 <Method byte[] SerializableString.asUnquotedUTF8()>
	//    2    6:astore_1        
		if(serializablestring.length > 0)
	//*   3    7:aload_1         
	//*   4    8:arraylength     
	//*   5    9:ifle            17
			_writeBytes(((byte []) (serializablestring)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #284 <Method void _writeBytes(byte[])>
	//    9   17:return          
	}

	public void writeRaw(String s)
		throws IOException
	{
		int i = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #271 <Method int String.length()>
	//    2    4:istore_2        
		char ac[] = _charBuffer;
	//    3    5:aload_0         
	//    4    6:getfield        #77  <Field char[] _charBuffer>
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
	//   15   21:invokevirtual   #370 <Method void String.getChars(int, int, char[], int)>
			writeRaw(ac, 0, i);
	//   16   24:aload_0         
	//   17   25:aload_3         
	//   18   26:iconst_0        
	//   19   27:iload_2         
	//   20   28:invokevirtual   #540 <Method void writeRaw(char[], int, int)>
			return;
	//   21   31:return          
		} else
		{
			writeRaw(s, 0, i);
	//   22   32:aload_0         
	//   23   33:aload_1         
	//   24   34:iconst_0        
	//   25   35:iload_2         
	//   26   36:invokevirtual   #542 <Method void writeRaw(String, int, int)>
			return;
	//   27   39:return          
		}
	}

	public void writeRaw(String s, int i, int j)
		throws IOException
	{
		char ac[] = _charBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field char[] _charBuffer>
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
	//   16   25:invokevirtual   #370 <Method void String.getChars(int, int, char[], int)>
			writeRaw(ac, 0, j);
	//   17   28:aload_0         
	//   18   29:aload           8
	//   19   31:iconst_0        
	//   20   32:iload_3         
	//   21   33:invokevirtual   #540 <Method void writeRaw(char[], int, int)>
			return;
	//   22   36:return          
		}
		int i1 = _outputEnd;
	//   23   37:aload_0         
	//   24   38:getfield        #69  <Field int _outputEnd>
	//   25   41:istore          5
		int k1 = Math.min(k, (i1 >> 2) + (i1 >> 4));
	//   26   43:iload           4
	//   27   45:iload           5
	//   28   47:iconst_2        
	//   29   48:ishr            
	//   30   49:iload           5
	//   31   51:iconst_4        
	//   32   52:ishr            
	//   33   53:iadd            
	//   34   54:invokestatic    #154 <Method int Math.min(int, int)>
	//   35   57:istore          6
		int l;
		for(; j > 0; j -= l)
	//*  36   59:iload_3         
	//*  37   60:ifle            173
		{
			int j1 = Math.min(k1, j);
	//   38   63:iload           6
	//   39   65:iload_3         
	//   40   66:invokestatic    #154 <Method int Math.min(int, int)>
	//   41   69:istore          5
			s.getChars(i, i + j1, ac, 0);
	//   42   71:aload_1         
	//   43   72:iload_2         
	//   44   73:iload_2         
	//   45   74:iload           5
	//   46   76:iadd            
	//   47   77:aload           8
	//   48   79:iconst_0        
	//   49   80:invokevirtual   #370 <Method void String.getChars(int, int, char[], int)>
			if(_outputTail + k1 * 3 > _outputEnd)
	//*  50   83:aload_0         
	//*  51   84:getfield        #101 <Field int _outputTail>
	//*  52   87:iload           6
	//*  53   89:iconst_3        
	//*  54   90:imul            
	//*  55   91:iadd            
	//*  56   92:aload_0         
	//*  57   93:getfield        #69  <Field int _outputEnd>
	//*  58   96:icmple          103
				_flushBuffer();
	//   59   99:aload_0         
	//   60  100:invokevirtual   #104 <Method void _flushBuffer()>
			l = j1;
	//   61  103:iload           5
	//   62  105:istore          4
			if(j1 > 1)
	//*  63  107:iload           5
	//*  64  109:iconst_1        
	//*  65  110:icmple          151
			{
				char c = ac[j1 - 1];
	//   66  113:aload           8
	//   67  115:iload           5
	//   68  117:iconst_1        
	//   69  118:isub            
	//   70  119:caload          
	//   71  120:istore          7
				l = j1;
	//   72  122:iload           5
	//   73  124:istore          4
				if(c >= '\uD800')
	//*  74  126:iload           7
	//*  75  128:ldc1            #120 <Int 55296>
	//*  76  130:icmplt          151
				{
					l = j1;
	//   77  133:iload           5
	//   78  135:istore          4
					if(c <= '\uDBFF')
	//*  79  137:iload           7
	//*  80  139:ldc2            #543 <Int 56319>
	//*  81  142:icmpgt          151
						l = j1 - 1;
	//   82  145:iload           5
	//   83  147:iconst_1        
	//   84  148:isub            
	//   85  149:istore          4
				}
			}
			_writeRawSegment(ac, 0, l);
	//   86  151:aload_0         
	//   87  152:aload           8
	//   88  154:iconst_0        
	//   89  155:iload           4
	//   90  157:invokespecial   #545 <Method void _writeRawSegment(char[], int, int)>
			i += l;
	//   91  160:iload_2         
	//   92  161:iload           4
	//   93  163:iadd            
	//   94  164:istore_2        
		}

	//   95  165:iload_3         
	//   96  166:iload           4
	//   97  168:isub            
	//   98  169:istore_3        
	//*  99  170:goto            59
	//  100  173:return          
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
		int l = _outputTail;
	//    6    7:aload_0         
	//    7    8:getfield        #101 <Field int _outputTail>
	//    8   11:istore          5
		int k1 = _outputEnd;
	//    9   13:aload_0         
	//   10   14:getfield        #69  <Field int _outputEnd>
	//   11   17:istore          6
		if(l + k > k1)
	//*  12   19:iload           5
	//*  13   21:iload           4
	//*  14   23:iadd            
	//*  15   24:iload           6
	//*  16   26:icmple          48
		{
			if(k1 < k)
	//*  17   29:iload           6
	//*  18   31:iload           4
	//*  19   33:icmpge          44
			{
				_writeSegmentedRaw(ac, i, j);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:iload_2         
	//   23   39:iload_3         
	//   24   40:invokespecial   #547 <Method void _writeSegmentedRaw(char[], int, int)>
				return;
	//   25   43:return          
			}
			_flushBuffer();
	//   26   44:aload_0         
	//   27   45:invokevirtual   #104 <Method void _flushBuffer()>
		}
		k = j + i;
	//   28   48:iload_3         
	//   29   49:iload_2         
	//   30   50:iadd            
	//   31   51:istore          4
label0:
		do
		{
			if(i < k)
	//*  32   53:iload_2         
	//*  33   54:iload           4
	//*  34   56:icmpge          203
				do
				{
					j = ((int) (ac[i]));
	//   35   59:aload_1         
	//   36   60:iload_2         
	//   37   61:caload          
	//   38   62:istore_3        
					if(j > 127)
	//*  39   63:iload_3         
	//*  40   64:bipush          127
	//*  41   66:icmple          164
					{
						j = i + 1;
	//   42   69:iload_2         
	//   43   70:iconst_1        
	//   44   71:iadd            
	//   45   72:istore_3        
						i = ((int) (ac[i]));
	//   46   73:aload_1         
	//   47   74:iload_2         
	//   48   75:caload          
	//   49   76:istore_2        
						if(i < 2048)
	//*  50   77:iload_2         
	//*  51   78:sipush          2048
	//*  52   81:icmpge          151
						{
							byte abyte0[] = _outputBuffer;
	//   53   84:aload_0         
	//   54   85:getfield        #67  <Field byte[] _outputBuffer>
	//   55   88:astore          7
							int i1 = _outputTail;
	//   56   90:aload_0         
	//   57   91:getfield        #101 <Field int _outputTail>
	//   58   94:istore          5
							_outputTail = i1 + 1;
	//   59   96:aload_0         
	//   60   97:iload           5
	//   61   99:iconst_1        
	//   62  100:iadd            
	//   63  101:putfield        #101 <Field int _outputTail>
							abyte0[i1] = (byte)(i >> 6 | 0xc0);
	//   64  104:aload           7
	//   65  106:iload           5
	//   66  108:iload_2         
	//   67  109:bipush          6
	//   68  111:ishr            
	//   69  112:sipush          192
	//   70  115:ior             
	//   71  116:int2byte        
	//   72  117:bastore         
							i1 = _outputTail;
	//   73  118:aload_0         
	//   74  119:getfield        #101 <Field int _outputTail>
	//   75  122:istore          5
							_outputTail = i1 + 1;
	//   76  124:aload_0         
	//   77  125:iload           5
	//   78  127:iconst_1        
	//   79  128:iadd            
	//   80  129:putfield        #101 <Field int _outputTail>
							abyte0[i1] = (byte)(i & 0x3f | 0x80);
	//   81  132:aload           7
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
	//*  92  148:goto            53
						{
							i = _outputRawMultiByteChar(i, ac, j, k);
	//   93  151:aload_0         
	//   94  152:iload_2         
	//   95  153:aload_1         
	//   96  154:iload_3         
	//   97  155:iload           4
	//   98  157:invokespecial   #247 <Method int _outputRawMultiByteChar(int, char[], int, int)>
	//   99  160:istore_2        
						}
						continue label0;
	//  100  161:goto            53
					}
					byte abyte1[] = _outputBuffer;
	//  101  164:aload_0         
	//  102  165:getfield        #67  <Field byte[] _outputBuffer>
	//  103  168:astore          7
					int j1 = _outputTail;
	//  104  170:aload_0         
	//  105  171:getfield        #101 <Field int _outputTail>
	//  106  174:istore          5
					_outputTail = j1 + 1;
	//  107  176:aload_0         
	//  108  177:iload           5
	//  109  179:iconst_1        
	//  110  180:iadd            
	//  111  181:putfield        #101 <Field int _outputTail>
					abyte1[j1] = (byte)j;
	//  112  184:aload           7
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
	//  125  200:icmplt          59
			return;
	//  126  203:return          
		} while(true);
	}

	public void writeRawValue(SerializableString serializablestring)
		throws IOException
	{
		_verifyValueWrite("write a raw (unencoded) value");
	//    0    0:aload_0         
	//    1    1:ldc2            #550 <String "write a raw (unencoded) value">
	//    2    4:invokevirtual   #418 <Method void _verifyValueWrite(String)>
		serializablestring = ((SerializableString) (serializablestring.asUnquotedUTF8()));
	//    3    7:aload_1         
	//    4    8:invokeinterface #169 <Method byte[] SerializableString.asUnquotedUTF8()>
	//    5   13:astore_1        
		if(serializablestring.length > 0)
	//*   6   14:aload_1         
	//*   7   15:arraylength     
	//*   8   16:ifle            24
			_writeBytes(((byte []) (serializablestring)));
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokespecial   #284 <Method void _writeBytes(byte[])>
	//   12   24:return          
	}

	public final void writeStartArray()
		throws IOException
	{
		_verifyValueWrite("start an array");
	//    0    0:aload_0         
	//    1    1:ldc2            #553 <String "start an array">
	//    2    4:invokevirtual   #418 <Method void _verifyValueWrite(String)>
		_writeContext = _writeContext.createChildArrayContext();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #304 <Field JsonWriteContext _writeContext>
	//    6   12:invokevirtual   #556 <Method JsonWriteContext JsonWriteContext.createChildArrayContext()>
	//    7   15:putfield        #304 <Field JsonWriteContext _writeContext>
		if(_cfgPrettyPrinter != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #313 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  10   22:ifnull          36
		{
			_cfgPrettyPrinter.writeStartArray(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   11   25:aload_0         
	//   12   26:getfield        #313 <Field PrettyPrinter _cfgPrettyPrinter>
	//   13   29:aload_0         
	//   14   30:invokeinterface #558 <Method void PrettyPrinter.writeStartArray(com.fasterxml.jackson.core.JsonGenerator)>
			return;
	//   15   35:return          
		}
		if(_outputTail >= _outputEnd)
	//*  16   36:aload_0         
	//*  17   37:getfield        #101 <Field int _outputTail>
	//*  18   40:aload_0         
	//*  19   41:getfield        #69  <Field int _outputEnd>
	//*  20   44:icmplt          51
			_flushBuffer();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #104 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//   23   51:aload_0         
	//   24   52:getfield        #67  <Field byte[] _outputBuffer>
	//   25   55:astore_2        
		int i = _outputTail;
	//   26   56:aload_0         
	//   27   57:getfield        #101 <Field int _outputTail>
	//   28   60:istore_1        
		_outputTail = i + 1;
	//   29   61:aload_0         
	//   30   62:iload_1         
	//   31   63:iconst_1        
	//   32   64:iadd            
	//   33   65:putfield        #101 <Field int _outputTail>
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
	//    1    1:ldc2            #561 <String "start an object">
	//    2    4:invokevirtual   #418 <Method void _verifyValueWrite(String)>
		_writeContext = _writeContext.createChildObjectContext();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #304 <Field JsonWriteContext _writeContext>
	//    6   12:invokevirtual   #564 <Method JsonWriteContext JsonWriteContext.createChildObjectContext()>
	//    7   15:putfield        #304 <Field JsonWriteContext _writeContext>
		if(_cfgPrettyPrinter != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #313 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  10   22:ifnull          36
		{
			_cfgPrettyPrinter.writeStartObject(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   11   25:aload_0         
	//   12   26:getfield        #313 <Field PrettyPrinter _cfgPrettyPrinter>
	//   13   29:aload_0         
	//   14   30:invokeinterface #566 <Method void PrettyPrinter.writeStartObject(com.fasterxml.jackson.core.JsonGenerator)>
			return;
	//   15   35:return          
		}
		if(_outputTail >= _outputEnd)
	//*  16   36:aload_0         
	//*  17   37:getfield        #101 <Field int _outputTail>
	//*  18   40:aload_0         
	//*  19   41:getfield        #69  <Field int _outputEnd>
	//*  20   44:icmplt          51
			_flushBuffer();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #104 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//   23   51:aload_0         
	//   24   52:getfield        #67  <Field byte[] _outputBuffer>
	//   25   55:astore_2        
		int i = _outputTail;
	//   26   56:aload_0         
	//   27   57:getfield        #101 <Field int _outputTail>
	//   28   60:istore_1        
		_outputTail = i + 1;
	//   29   61:aload_0         
	//   30   62:iload_1         
	//   31   63:iconst_1        
	//   32   64:iadd            
	//   33   65:putfield        #101 <Field int _outputTail>
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
	//    1    1:ldc2            #561 <String "start an object">
	//    2    4:invokevirtual   #418 <Method void _verifyValueWrite(String)>
		JsonWriteContext jsonwritecontext = _writeContext.createChildObjectContext();
	//    3    7:aload_0         
	//    4    8:getfield        #304 <Field JsonWriteContext _writeContext>
	//    5   11:invokevirtual   #564 <Method JsonWriteContext JsonWriteContext.createChildObjectContext()>
	//    6   14:astore_3        
		_writeContext = jsonwritecontext;
	//    7   15:aload_0         
	//    8   16:aload_3         
	//    9   17:putfield        #304 <Field JsonWriteContext _writeContext>
		if(obj != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          29
			jsonwritecontext.setCurrentValue(obj);
	//   12   24:aload_3         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #570 <Method void JsonWriteContext.setCurrentValue(Object)>
		if(_cfgPrettyPrinter != null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #313 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  17   33:ifnull          47
		{
			_cfgPrettyPrinter.writeStartObject(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   18   36:aload_0         
	//   19   37:getfield        #313 <Field PrettyPrinter _cfgPrettyPrinter>
	//   20   40:aload_0         
	//   21   41:invokeinterface #566 <Method void PrettyPrinter.writeStartObject(com.fasterxml.jackson.core.JsonGenerator)>
			return;
	//   22   46:return          
		}
		if(_outputTail >= _outputEnd)
	//*  23   47:aload_0         
	//*  24   48:getfield        #101 <Field int _outputTail>
	//*  25   51:aload_0         
	//*  26   52:getfield        #69  <Field int _outputEnd>
	//*  27   55:icmplt          62
			_flushBuffer();
	//   28   58:aload_0         
	//   29   59:invokevirtual   #104 <Method void _flushBuffer()>
		obj = ((Object) (_outputBuffer));
	//   30   62:aload_0         
	//   31   63:getfield        #67  <Field byte[] _outputBuffer>
	//   32   66:astore_1        
		int i = _outputTail;
	//   33   67:aload_0         
	//   34   68:getfield        #101 <Field int _outputTail>
	//   35   71:istore_2        
		_outputTail = i + 1;
	//   36   72:aload_0         
	//   37   73:iload_2         
	//   38   74:iconst_1        
	//   39   75:iadd            
	//   40   76:putfield        #101 <Field int _outputTail>
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
	//    1    1:ldc2            #572 <String "write a string">
	//    2    4:invokevirtual   #418 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #101 <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #69  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #104 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #67  <Field byte[] _outputBuffer>
	//   12   26:astore_3        
		int i = _outputTail;
	//   13   27:aload_0         
	//   14   28:getfield        #101 <Field int _outputTail>
	//   15   31:istore_2        
		_outputTail = i + 1;
	//   16   32:aload_0         
	//   17   33:iload_2         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:putfield        #101 <Field int _outputTail>
		abyte0[i] = _quoteChar;
	//   21   39:aload_3         
	//   22   40:iload_2         
	//   23   41:aload_0         
	//   24   42:getfield        #56  <Field byte _quoteChar>
	//   25   45:bastore         
		i = serializablestring.appendQuotedUTF8(abyte0, _outputTail);
	//   26   46:aload_1         
	//   27   47:aload_3         
	//   28   48:aload_0         
	//   29   49:getfield        #101 <Field int _outputTail>
	//   30   52:invokeinterface #279 <Method int SerializableString.appendQuotedUTF8(byte[], int)>
	//   31   57:istore_2        
		if(i < 0)
	//*  32   58:iload_2         
	//*  33   59:ifge            75
			_writeBytes(serializablestring.asQuotedUTF8());
	//   34   62:aload_0         
	//   35   63:aload_1         
	//   36   64:invokeinterface #282 <Method byte[] SerializableString.asQuotedUTF8()>
	//   37   69:invokespecial   #284 <Method void _writeBytes(byte[])>
		else
	//*  38   72:goto            85
			_outputTail = _outputTail + i;
	//   39   75:aload_0         
	//   40   76:aload_0         
	//   41   77:getfield        #101 <Field int _outputTail>
	//   42   80:iload_2         
	//   43   81:iadd            
	//   44   82:putfield        #101 <Field int _outputTail>
		if(_outputTail >= _outputEnd)
	//*  45   85:aload_0         
	//*  46   86:getfield        #101 <Field int _outputTail>
	//*  47   89:aload_0         
	//*  48   90:getfield        #69  <Field int _outputEnd>
	//*  49   93:icmplt          100
			_flushBuffer();
	//   50   96:aload_0         
	//   51   97:invokevirtual   #104 <Method void _flushBuffer()>
		serializablestring = ((SerializableString) (_outputBuffer));
	//   52  100:aload_0         
	//   53  101:getfield        #67  <Field byte[] _outputBuffer>
	//   54  104:astore_1        
		i = _outputTail;
	//   55  105:aload_0         
	//   56  106:getfield        #101 <Field int _outputTail>
	//   57  109:istore_2        
		_outputTail = i + 1;
	//   58  110:aload_0         
	//   59  111:iload_2         
	//   60  112:iconst_1        
	//   61  113:iadd            
	//   62  114:putfield        #101 <Field int _outputTail>
		serializablestring[i] = _quoteChar;
	//   63  117:aload_1         
	//   64  118:iload_2         
	//   65  119:aload_0         
	//   66  120:getfield        #56  <Field byte _quoteChar>
	//   67  123:bastore         
	//   68  124:return          
	}

	public void writeString(String s)
		throws IOException
	{
		_verifyValueWrite("write a string");
	//    0    0:aload_0         
	//    1    1:ldc2            #572 <String "write a string">
	//    2    4:invokevirtual   #418 <Method void _verifyValueWrite(String)>
		if(s == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       16
		{
			_writeNull();
	//    5   11:aload_0         
	//    6   12:invokespecial   #477 <Method void _writeNull()>
			return;
	//    7   15:return          
		}
		int i = s.length();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #271 <Method int String.length()>
	//   10   20:istore_2        
		if(i > _outputMaxContiguous)
	//*  11   21:iload_2         
	//*  12   22:aload_0         
	//*  13   23:getfield        #71  <Field int _outputMaxContiguous>
	//*  14   26:icmple          36
		{
			_writeStringSegments(s, true);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:iconst_1        
	//   18   32:invokespecial   #366 <Method void _writeStringSegments(String, boolean)>
			return;
	//   19   35:return          
		}
		if(_outputTail + i >= _outputEnd)
	//*  20   36:aload_0         
	//*  21   37:getfield        #101 <Field int _outputTail>
	//*  22   40:iload_2         
	//*  23   41:iadd            
	//*  24   42:aload_0         
	//*  25   43:getfield        #69  <Field int _outputEnd>
	//*  26   46:icmplt          53
			_flushBuffer();
	//   27   49:aload_0         
	//   28   50:invokevirtual   #104 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//   29   53:aload_0         
	//   30   54:getfield        #67  <Field byte[] _outputBuffer>
	//   31   57:astore          4
		int j = _outputTail;
	//   32   59:aload_0         
	//   33   60:getfield        #101 <Field int _outputTail>
	//   34   63:istore_3        
		_outputTail = j + 1;
	//   35   64:aload_0         
	//   36   65:iload_3         
	//   37   66:iconst_1        
	//   38   67:iadd            
	//   39   68:putfield        #101 <Field int _outputTail>
		abyte0[j] = _quoteChar;
	//   40   71:aload           4
	//   41   73:iload_3         
	//   42   74:aload_0         
	//   43   75:getfield        #56  <Field byte _quoteChar>
	//   44   78:bastore         
		_writeStringSegment(s, 0, i);
	//   45   79:aload_0         
	//   46   80:aload_1         
	//   47   81:iconst_0        
	//   48   82:iload_2         
	//   49   83:invokespecial   #266 <Method void _writeStringSegment(String, int, int)>
		if(_outputTail >= _outputEnd)
	//*  50   86:aload_0         
	//*  51   87:getfield        #101 <Field int _outputTail>
	//*  52   90:aload_0         
	//*  53   91:getfield        #69  <Field int _outputEnd>
	//*  54   94:icmplt          101
			_flushBuffer();
	//   55   97:aload_0         
	//   56   98:invokevirtual   #104 <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//   57  101:aload_0         
	//   58  102:getfield        #67  <Field byte[] _outputBuffer>
	//   59  105:astore_1        
		i = _outputTail;
	//   60  106:aload_0         
	//   61  107:getfield        #101 <Field int _outputTail>
	//   62  110:istore_2        
		_outputTail = i + 1;
	//   63  111:aload_0         
	//   64  112:iload_2         
	//   65  113:iconst_1        
	//   66  114:iadd            
	//   67  115:putfield        #101 <Field int _outputTail>
		s[i] = _quoteChar;
	//   68  118:aload_1         
	//   69  119:iload_2         
	//   70  120:aload_0         
	//   71  121:getfield        #56  <Field byte _quoteChar>
	//   72  124:bastore         
	//   73  125:return          
	}

	public void writeString(char ac[], int i, int j)
		throws IOException
	{
		_verifyValueWrite("write a string");
	//    0    0:aload_0         
	//    1    1:ldc2            #572 <String "write a string">
	//    2    4:invokevirtual   #418 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #101 <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #69  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #104 <Method void _flushBuffer()>
		byte abyte0[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #67  <Field byte[] _outputBuffer>
	//   12   26:astore          5
		int k = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #101 <Field int _outputTail>
	//   15   32:istore          4
		_outputTail = k + 1;
	//   16   34:aload_0         
	//   17   35:iload           4
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #101 <Field int _outputTail>
		abyte0[k] = _quoteChar;
	//   21   42:aload           5
	//   22   44:iload           4
	//   23   46:aload_0         
	//   24   47:getfield        #56  <Field byte _quoteChar>
	//   25   50:bastore         
		if(j <= _outputMaxContiguous)
	//*  26   51:iload_3         
	//*  27   52:aload_0         
	//*  28   53:getfield        #71  <Field int _outputMaxContiguous>
	//*  29   56:icmpgt          86
		{
			if(_outputTail + j > _outputEnd)
	//*  30   59:aload_0         
	//*  31   60:getfield        #101 <Field int _outputTail>
	//*  32   63:iload_3         
	//*  33   64:iadd            
	//*  34   65:aload_0         
	//*  35   66:getfield        #69  <Field int _outputEnd>
	//*  36   69:icmple          76
				_flushBuffer();
	//   37   72:aload_0         
	//   38   73:invokevirtual   #104 <Method void _flushBuffer()>
			_writeStringSegment(ac, i, j);
	//   39   76:aload_0         
	//   40   77:aload_1         
	//   41   78:iload_2         
	//   42   79:iload_3         
	//   43   80:invokespecial   #273 <Method void _writeStringSegment(char[], int, int)>
		} else
	//*  44   83:goto            93
		{
			_writeStringSegments(ac, i, j);
	//   45   86:aload_0         
	//   46   87:aload_1         
	//   47   88:iload_2         
	//   48   89:iload_3         
	//   49   90:invokespecial   #372 <Method void _writeStringSegments(char[], int, int)>
		}
		if(_outputTail >= _outputEnd)
	//*  50   93:aload_0         
	//*  51   94:getfield        #101 <Field int _outputTail>
	//*  52   97:aload_0         
	//*  53   98:getfield        #69  <Field int _outputEnd>
	//*  54  101:icmplt          108
			_flushBuffer();
	//   55  104:aload_0         
	//   56  105:invokevirtual   #104 <Method void _flushBuffer()>
		ac = ((char []) (_outputBuffer));
	//   57  108:aload_0         
	//   58  109:getfield        #67  <Field byte[] _outputBuffer>
	//   59  112:astore_1        
		i = _outputTail;
	//   60  113:aload_0         
	//   61  114:getfield        #101 <Field int _outputTail>
	//   62  117:istore_2        
		_outputTail = i + 1;
	//   63  118:aload_0         
	//   64  119:iload_2         
	//   65  120:iconst_1        
	//   66  121:iadd            
	//   67  122:putfield        #101 <Field int _outputTail>
		ac[i] = ((char) (_quoteChar));
	//   68  125:aload_1         
	//   69  126:iload_2         
	//   70  127:aload_0         
	//   71  128:getfield        #56  <Field byte _quoteChar>
	//   72  131:bastore         
	//   73  132:return          
	}

	private static final byte FALSE_BYTES[] = {
		102, 97, 108, 115, 101
	};
	private static final byte HEX_CHARS[] = CharTypes.copyHexBytes();
	private static final byte NULL_BYTES[] = {
		110, 117, 108, 108
	};
	private static final byte TRUE_BYTES[] = {
		116, 114, 117, 101
	};
	protected boolean _bufferRecyclable;
	protected char _charBuffer[];
	protected final int _charBufferLength;
	protected byte _outputBuffer[];
	protected final int _outputEnd;
	protected final int _outputMaxContiguous;
	protected final OutputStream _outputStream;
	protected int _outputTail;
	protected byte _quoteChar;

	static 
	{
	//    0    0:invokestatic    #31  <Method byte[] CharTypes.copyHexBytes()>
	//    1    3:putstatic       #33  <Field byte[] HEX_CHARS>
	//    2    6:iconst_4        
	//    3    7:newarray        byte[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:ldc1            #34  <Int 110>
	//    7   13:bastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:ldc1            #35  <Int 117>
	//   11   18:bastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:ldc1            #36  <Int 108>
	//   15   23:bastore         
	//   16   24:dup             
	//   17   25:iconst_3        
	//   18   26:ldc1            #36  <Int 108>
	//   19   28:bastore         
	//   20   29:putstatic       #38  <Field byte[] NULL_BYTES>
	//   21   32:iconst_4        
	//   22   33:newarray        byte[]
	//   23   35:dup             
	//   24   36:iconst_0        
	//   25   37:ldc1            #39  <Int 116>
	//   26   39:bastore         
	//   27   40:dup             
	//   28   41:iconst_1        
	//   29   42:ldc1            #40  <Int 114>
	//   30   44:bastore         
	//   31   45:dup             
	//   32   46:iconst_2        
	//   33   47:ldc1            #35  <Int 117>
	//   34   49:bastore         
	//   35   50:dup             
	//   36   51:iconst_3        
	//   37   52:ldc1            #41  <Int 101>
	//   38   54:bastore         
	//   39   55:putstatic       #43  <Field byte[] TRUE_BYTES>
	//   40   58:iconst_5        
	//   41   59:newarray        byte[]
	//   42   61:dup             
	//   43   62:iconst_0        
	//   44   63:ldc1            #44  <Int 102>
	//   45   65:bastore         
	//   46   66:dup             
	//   47   67:iconst_1        
	//   48   68:ldc1            #45  <Int 97>
	//   49   70:bastore         
	//   50   71:dup             
	//   51   72:iconst_2        
	//   52   73:ldc1            #36  <Int 108>
	//   53   75:bastore         
	//   54   76:dup             
	//   55   77:iconst_3        
	//   56   78:ldc1            #46  <Int 115>
	//   57   80:bastore         
	//   58   81:dup             
	//   59   82:iconst_4        
	//   60   83:ldc1            #41  <Int 101>
	//   61   85:bastore         
	//   62   86:putstatic       #48  <Field byte[] FALSE_BYTES>
	//*  63   89:return          
	}
}
