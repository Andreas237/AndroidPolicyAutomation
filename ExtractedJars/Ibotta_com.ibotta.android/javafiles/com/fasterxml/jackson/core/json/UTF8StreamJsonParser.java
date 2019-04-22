// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.*;

// Referenced classes of package com.fasterxml.jackson.core.json:
//			JsonReadContext

public class UTF8StreamJsonParser extends ParserBase
{

	public UTF8StreamJsonParser(IOContext iocontext, int i, InputStream inputstream, ObjectCodec objectcodec, ByteQuadsCanonicalizer bytequadscanonicalizer, byte abyte0[], int j, 
			int k, boolean flag)
	{
		super(iocontext, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #58  <Method void ParserBase(IOContext, int)>
		_quadBuffer = new int[16];
	//    4    6:aload_0         
	//    5    7:bipush          16
	//    6    9:newarray        int[]
	//    7   11:putfield        #60  <Field int[] _quadBuffer>
		_inputStream = inputstream;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #62  <Field InputStream _inputStream>
		_objectCodec = objectcodec;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #64  <Field ObjectCodec _objectCodec>
		_symbols = bytequadscanonicalizer;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #66  <Field ByteQuadsCanonicalizer _symbols>
		_inputBuffer = abyte0;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #68  <Field byte[] _inputBuffer>
		_inputPtr = j;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #71  <Field int _inputPtr>
		_inputEnd = k;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #74  <Field int _inputEnd>
		_currInputRowStart = j;
	//   26   49:aload_0         
	//   27   50:iload           7
	//   28   52:putfield        #77  <Field int _currInputRowStart>
		_currInputProcessed = -j;
	//   29   55:aload_0         
	//   30   56:iload           7
	//   31   58:ineg            
	//   32   59:i2l             
	//   33   60:putfield        #81  <Field long _currInputProcessed>
		_bufferRecyclable = flag;
	//   34   63:aload_0         
	//   35   64:iload           9
	//   36   66:putfield        #83  <Field boolean _bufferRecyclable>
	//   37   69:return          
	}

	private final void _checkMatchEnd(String s, int i, int j)
		throws IOException
	{
		if(Character.isJavaIdentifierPart((char)_decodeCharForError(j)))
	//*   0    0:aload_0         
	//*   1    1:iload_3         
	//*   2    2:invokevirtual   #91  <Method int _decodeCharForError(int)>
	//*   3    5:int2char        
	//*   4    6:invokestatic    #97  <Method boolean Character.isJavaIdentifierPart(char)>
	//*   5    9:ifeq            22
			_reportInvalidToken(s.substring(0, i));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:iconst_0        
	//    9   15:iload_2         
	//   10   16:invokevirtual   #103 <Method String String.substring(int, int)>
	//   11   19:invokevirtual   #107 <Method void _reportInvalidToken(String)>
	//   12   22:return          
	}

	private final void _closeArrayScope()
		throws JsonParseException
	{
		_updateLocation();
	//    0    0:aload_0         
	//    1    1:invokespecial   #114 <Method void _updateLocation()>
		if(!_parsingContext.inArray())
	//*   2    4:aload_0         
	//*   3    5:getfield        #118 <Field JsonReadContext _parsingContext>
	//*   4    8:invokevirtual   #124 <Method boolean JsonReadContext.inArray()>
	//*   5   11:ifne            22
			_reportMismatchedEndMarker(93, '}');
	//    6   14:aload_0         
	//    7   15:bipush          93
	//    8   17:bipush          125
	//    9   19:invokevirtual   #128 <Method void _reportMismatchedEndMarker(int, char)>
		_parsingContext = _parsingContext.clearAndGetParent();
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #118 <Field JsonReadContext _parsingContext>
	//   13   27:invokevirtual   #132 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   14   30:putfield        #118 <Field JsonReadContext _parsingContext>
	//   15   33:return          
	}

	private final void _closeObjectScope()
		throws JsonParseException
	{
		_updateLocation();
	//    0    0:aload_0         
	//    1    1:invokespecial   #114 <Method void _updateLocation()>
		if(!_parsingContext.inObject())
	//*   2    4:aload_0         
	//*   3    5:getfield        #118 <Field JsonReadContext _parsingContext>
	//*   4    8:invokevirtual   #136 <Method boolean JsonReadContext.inObject()>
	//*   5   11:ifne            22
			_reportMismatchedEndMarker(125, ']');
	//    6   14:aload_0         
	//    7   15:bipush          125
	//    8   17:bipush          93
	//    9   19:invokevirtual   #128 <Method void _reportMismatchedEndMarker(int, char)>
		_parsingContext = _parsingContext.clearAndGetParent();
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #118 <Field JsonReadContext _parsingContext>
	//   13   27:invokevirtual   #132 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   14   30:putfield        #118 <Field JsonReadContext _parsingContext>
	//   15   33:return          
	}

	private final JsonToken _closeScope(int i)
		throws JsonParseException
	{
		if(i == 125)
	//*   0    0:iload_1         
	//*   1    1:bipush          125
	//*   2    3:icmpne          21
		{
			_closeObjectScope();
	//    3    6:aload_0         
	//    4    7:invokespecial   #140 <Method void _closeObjectScope()>
			JsonToken jsontoken = JsonToken.END_OBJECT;
	//    5   10:getstatic       #146 <Field JsonToken JsonToken.END_OBJECT>
	//    6   13:astore_2        
			_currToken = jsontoken;
	//    7   14:aload_0         
	//    8   15:aload_2         
	//    9   16:putfield        #149 <Field JsonToken _currToken>
			return jsontoken;
	//   10   19:aload_2         
	//   11   20:areturn         
		} else
		{
			_closeArrayScope();
	//   12   21:aload_0         
	//   13   22:invokespecial   #151 <Method void _closeArrayScope()>
			JsonToken jsontoken1 = JsonToken.END_ARRAY;
	//   14   25:getstatic       #154 <Field JsonToken JsonToken.END_ARRAY>
	//   15   28:astore_2        
			_currToken = jsontoken1;
	//   16   29:aload_0         
	//   17   30:aload_2         
	//   18   31:putfield        #149 <Field JsonToken _currToken>
			return jsontoken1;
	//   19   34:aload_2         
	//   20   35:areturn         
		}
	}

	private final int _decodeUtf8_2(int i)
		throws IOException
	{
		if(_inputPtr >= _inputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #74  <Field int _inputEnd>
	//*   4    8:icmplt          15
			_loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
		byte abyte0[] = _inputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #68  <Field byte[] _inputBuffer>
	//    9   19:astore_3        
		int j = _inputPtr;
	//   10   20:aload_0         
	//   11   21:getfield        #71  <Field int _inputPtr>
	//   12   24:istore_2        
		_inputPtr = j + 1;
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #71  <Field int _inputPtr>
		j = ((int) (abyte0[j]));
	//   18   32:aload_3         
	//   19   33:iload_2         
	//   20   34:baload          
	//   21   35:istore_2        
		if((j & 0xc0) != 128)
	//*  22   36:iload_2         
	//*  23   37:sipush          192
	//*  24   40:iand            
	//*  25   41:sipush          128
	//*  26   44:icmpeq          60
			_reportInvalidOther(j & 0xff, _inputPtr);
	//   27   47:aload_0         
	//   28   48:iload_2         
	//   29   49:sipush          255
	//   30   52:iand            
	//   31   53:aload_0         
	//   32   54:getfield        #71  <Field int _inputPtr>
	//   33   57:invokevirtual   #162 <Method void _reportInvalidOther(int, int)>
		return (i & 0x1f) << 6 | j & 0x3f;
	//   34   60:iload_1         
	//   35   61:bipush          31
	//   36   63:iand            
	//   37   64:bipush          6
	//   38   66:ishl            
	//   39   67:iload_2         
	//   40   68:bipush          63
	//   41   70:iand            
	//   42   71:ior             
	//   43   72:ireturn         
	}

	private final int _decodeUtf8_3(int i)
		throws IOException
	{
		if(_inputPtr >= _inputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #74  <Field int _inputEnd>
	//*   4    8:icmplt          15
			_loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
		byte abyte0[] = _inputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #68  <Field byte[] _inputBuffer>
	//    9   19:astore          4
		int j = _inputPtr;
	//   10   21:aload_0         
	//   11   22:getfield        #71  <Field int _inputPtr>
	//   12   25:istore_2        
		_inputPtr = j + 1;
	//   13   26:aload_0         
	//   14   27:iload_2         
	//   15   28:iconst_1        
	//   16   29:iadd            
	//   17   30:putfield        #71  <Field int _inputPtr>
		j = ((int) (abyte0[j]));
	//   18   33:aload           4
	//   19   35:iload_2         
	//   20   36:baload          
	//   21   37:istore_2        
		if((j & 0xc0) != 128)
	//*  22   38:iload_2         
	//*  23   39:sipush          192
	//*  24   42:iand            
	//*  25   43:sipush          128
	//*  26   46:icmpeq          62
			_reportInvalidOther(j & 0xff, _inputPtr);
	//   27   49:aload_0         
	//   28   50:iload_2         
	//   29   51:sipush          255
	//   30   54:iand            
	//   31   55:aload_0         
	//   32   56:getfield        #71  <Field int _inputPtr>
	//   33   59:invokevirtual   #162 <Method void _reportInvalidOther(int, int)>
		if(_inputPtr >= _inputEnd)
	//*  34   62:aload_0         
	//*  35   63:getfield        #71  <Field int _inputPtr>
	//*  36   66:aload_0         
	//*  37   67:getfield        #74  <Field int _inputEnd>
	//*  38   70:icmplt          77
			_loadMoreGuaranteed();
	//   39   73:aload_0         
	//   40   74:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
		abyte0 = _inputBuffer;
	//   41   77:aload_0         
	//   42   78:getfield        #68  <Field byte[] _inputBuffer>
	//   43   81:astore          4
		int k = _inputPtr;
	//   44   83:aload_0         
	//   45   84:getfield        #71  <Field int _inputPtr>
	//   46   87:istore_3        
		_inputPtr = k + 1;
	//   47   88:aload_0         
	//   48   89:iload_3         
	//   49   90:iconst_1        
	//   50   91:iadd            
	//   51   92:putfield        #71  <Field int _inputPtr>
		k = ((int) (abyte0[k]));
	//   52   95:aload           4
	//   53   97:iload_3         
	//   54   98:baload          
	//   55   99:istore_3        
		if((k & 0xc0) != 128)
	//*  56  100:iload_3         
	//*  57  101:sipush          192
	//*  58  104:iand            
	//*  59  105:sipush          128
	//*  60  108:icmpeq          124
			_reportInvalidOther(k & 0xff, _inputPtr);
	//   61  111:aload_0         
	//   62  112:iload_3         
	//   63  113:sipush          255
	//   64  116:iand            
	//   65  117:aload_0         
	//   66  118:getfield        #71  <Field int _inputPtr>
	//   67  121:invokevirtual   #162 <Method void _reportInvalidOther(int, int)>
		return ((i & 0xf) << 6 | j & 0x3f) << 6 | k & 0x3f;
	//   68  124:iload_1         
	//   69  125:bipush          15
	//   70  127:iand            
	//   71  128:bipush          6
	//   72  130:ishl            
	//   73  131:iload_2         
	//   74  132:bipush          63
	//   75  134:iand            
	//   76  135:ior             
	//   77  136:bipush          6
	//   78  138:ishl            
	//   79  139:iload_3         
	//   80  140:bipush          63
	//   81  142:iand            
	//   82  143:ior             
	//   83  144:ireturn         
	}

	private final int _decodeUtf8_3fast(int i)
		throws IOException
	{
		byte abyte0[] = _inputBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field byte[] _inputBuffer>
	//    2    4:astore          4
		int j = _inputPtr;
	//    3    6:aload_0         
	//    4    7:getfield        #71  <Field int _inputPtr>
	//    5   10:istore_2        
		_inputPtr = j + 1;
	//    6   11:aload_0         
	//    7   12:iload_2         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:putfield        #71  <Field int _inputPtr>
		j = ((int) (abyte0[j]));
	//   11   18:aload           4
	//   12   20:iload_2         
	//   13   21:baload          
	//   14   22:istore_2        
		if((j & 0xc0) != 128)
	//*  15   23:iload_2         
	//*  16   24:sipush          192
	//*  17   27:iand            
	//*  18   28:sipush          128
	//*  19   31:icmpeq          47
			_reportInvalidOther(j & 0xff, _inputPtr);
	//   20   34:aload_0         
	//   21   35:iload_2         
	//   22   36:sipush          255
	//   23   39:iand            
	//   24   40:aload_0         
	//   25   41:getfield        #71  <Field int _inputPtr>
	//   26   44:invokevirtual   #162 <Method void _reportInvalidOther(int, int)>
		abyte0 = _inputBuffer;
	//   27   47:aload_0         
	//   28   48:getfield        #68  <Field byte[] _inputBuffer>
	//   29   51:astore          4
		int k = _inputPtr;
	//   30   53:aload_0         
	//   31   54:getfield        #71  <Field int _inputPtr>
	//   32   57:istore_3        
		_inputPtr = k + 1;
	//   33   58:aload_0         
	//   34   59:iload_3         
	//   35   60:iconst_1        
	//   36   61:iadd            
	//   37   62:putfield        #71  <Field int _inputPtr>
		k = ((int) (abyte0[k]));
	//   38   65:aload           4
	//   39   67:iload_3         
	//   40   68:baload          
	//   41   69:istore_3        
		if((k & 0xc0) != 128)
	//*  42   70:iload_3         
	//*  43   71:sipush          192
	//*  44   74:iand            
	//*  45   75:sipush          128
	//*  46   78:icmpeq          94
			_reportInvalidOther(k & 0xff, _inputPtr);
	//   47   81:aload_0         
	//   48   82:iload_3         
	//   49   83:sipush          255
	//   50   86:iand            
	//   51   87:aload_0         
	//   52   88:getfield        #71  <Field int _inputPtr>
	//   53   91:invokevirtual   #162 <Method void _reportInvalidOther(int, int)>
		return ((i & 0xf) << 6 | j & 0x3f) << 6 | k & 0x3f;
	//   54   94:iload_1         
	//   55   95:bipush          15
	//   56   97:iand            
	//   57   98:bipush          6
	//   58  100:ishl            
	//   59  101:iload_2         
	//   60  102:bipush          63
	//   61  104:iand            
	//   62  105:ior             
	//   63  106:bipush          6
	//   64  108:ishl            
	//   65  109:iload_3         
	//   66  110:bipush          63
	//   67  112:iand            
	//   68  113:ior             
	//   69  114:ireturn         
	}

	private final int _decodeUtf8_4(int i)
		throws IOException
	{
		if(_inputPtr >= _inputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #74  <Field int _inputEnd>
	//*   4    8:icmplt          15
			_loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
		byte abyte0[] = _inputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #68  <Field byte[] _inputBuffer>
	//    9   19:astore          5
		int j = _inputPtr;
	//   10   21:aload_0         
	//   11   22:getfield        #71  <Field int _inputPtr>
	//   12   25:istore_2        
		_inputPtr = j + 1;
	//   13   26:aload_0         
	//   14   27:iload_2         
	//   15   28:iconst_1        
	//   16   29:iadd            
	//   17   30:putfield        #71  <Field int _inputPtr>
		j = ((int) (abyte0[j]));
	//   18   33:aload           5
	//   19   35:iload_2         
	//   20   36:baload          
	//   21   37:istore_2        
		if((j & 0xc0) != 128)
	//*  22   38:iload_2         
	//*  23   39:sipush          192
	//*  24   42:iand            
	//*  25   43:sipush          128
	//*  26   46:icmpeq          62
			_reportInvalidOther(j & 0xff, _inputPtr);
	//   27   49:aload_0         
	//   28   50:iload_2         
	//   29   51:sipush          255
	//   30   54:iand            
	//   31   55:aload_0         
	//   32   56:getfield        #71  <Field int _inputPtr>
	//   33   59:invokevirtual   #162 <Method void _reportInvalidOther(int, int)>
		if(_inputPtr >= _inputEnd)
	//*  34   62:aload_0         
	//*  35   63:getfield        #71  <Field int _inputPtr>
	//*  36   66:aload_0         
	//*  37   67:getfield        #74  <Field int _inputEnd>
	//*  38   70:icmplt          77
			_loadMoreGuaranteed();
	//   39   73:aload_0         
	//   40   74:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
		abyte0 = _inputBuffer;
	//   41   77:aload_0         
	//   42   78:getfield        #68  <Field byte[] _inputBuffer>
	//   43   81:astore          5
		int k = _inputPtr;
	//   44   83:aload_0         
	//   45   84:getfield        #71  <Field int _inputPtr>
	//   46   87:istore_3        
		_inputPtr = k + 1;
	//   47   88:aload_0         
	//   48   89:iload_3         
	//   49   90:iconst_1        
	//   50   91:iadd            
	//   51   92:putfield        #71  <Field int _inputPtr>
		k = ((int) (abyte0[k]));
	//   52   95:aload           5
	//   53   97:iload_3         
	//   54   98:baload          
	//   55   99:istore_3        
		if((k & 0xc0) != 128)
	//*  56  100:iload_3         
	//*  57  101:sipush          192
	//*  58  104:iand            
	//*  59  105:sipush          128
	//*  60  108:icmpeq          124
			_reportInvalidOther(k & 0xff, _inputPtr);
	//   61  111:aload_0         
	//   62  112:iload_3         
	//   63  113:sipush          255
	//   64  116:iand            
	//   65  117:aload_0         
	//   66  118:getfield        #71  <Field int _inputPtr>
	//   67  121:invokevirtual   #162 <Method void _reportInvalidOther(int, int)>
		if(_inputPtr >= _inputEnd)
	//*  68  124:aload_0         
	//*  69  125:getfield        #71  <Field int _inputPtr>
	//*  70  128:aload_0         
	//*  71  129:getfield        #74  <Field int _inputEnd>
	//*  72  132:icmplt          139
			_loadMoreGuaranteed();
	//   73  135:aload_0         
	//   74  136:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
		abyte0 = _inputBuffer;
	//   75  139:aload_0         
	//   76  140:getfield        #68  <Field byte[] _inputBuffer>
	//   77  143:astore          5
		int l = _inputPtr;
	//   78  145:aload_0         
	//   79  146:getfield        #71  <Field int _inputPtr>
	//   80  149:istore          4
		_inputPtr = l + 1;
	//   81  151:aload_0         
	//   82  152:iload           4
	//   83  154:iconst_1        
	//   84  155:iadd            
	//   85  156:putfield        #71  <Field int _inputPtr>
		l = ((int) (abyte0[l]));
	//   86  159:aload           5
	//   87  161:iload           4
	//   88  163:baload          
	//   89  164:istore          4
		if((l & 0xc0) != 128)
	//*  90  166:iload           4
	//*  91  168:sipush          192
	//*  92  171:iand            
	//*  93  172:sipush          128
	//*  94  175:icmpeq          192
			_reportInvalidOther(l & 0xff, _inputPtr);
	//   95  178:aload_0         
	//   96  179:iload           4
	//   97  181:sipush          255
	//   98  184:iand            
	//   99  185:aload_0         
	//  100  186:getfield        #71  <Field int _inputPtr>
	//  101  189:invokevirtual   #162 <Method void _reportInvalidOther(int, int)>
		return ((((i & 7) << 6 | j & 0x3f) << 6 | k & 0x3f) << 6 | l & 0x3f) - 0x10000;
	//  102  192:iload_1         
	//  103  193:bipush          7
	//  104  195:iand            
	//  105  196:bipush          6
	//  106  198:ishl            
	//  107  199:iload_2         
	//  108  200:bipush          63
	//  109  202:iand            
	//  110  203:ior             
	//  111  204:bipush          6
	//  112  206:ishl            
	//  113  207:iload_3         
	//  114  208:bipush          63
	//  115  210:iand            
	//  116  211:ior             
	//  117  212:bipush          6
	//  118  214:ishl            
	//  119  215:iload           4
	//  120  217:bipush          63
	//  121  219:iand            
	//  122  220:ior             
	//  123  221:ldc1            #166 <Int 0x10000>
	//  124  223:isub            
	//  125  224:ireturn         
	}

	private final void _finishString2(char ac[], int i)
		throws IOException
	{
		int ai[] = _icUTF8;
	//    0    0:getstatic       #35  <Field int[] _icUTF8>
	//    1    3:astore          7
		byte abyte0[] = _inputBuffer;
	//    2    5:aload_0         
	//    3    6:getfield        #68  <Field byte[] _inputBuffer>
	//    4    9:astore          8
		char ac1[] = ac;
	//    5   11:aload_1         
	//    6   12:astore          6
label0:
		do
		{
			int j = _inputPtr;
	//    7   14:aload_0         
	//    8   15:getfield        #71  <Field int _inputPtr>
	//    9   18:istore_3        
			int k = j;
	//   10   19:iload_3         
	//   11   20:istore          4
			if(j >= _inputEnd)
	//*  12   22:iload_3         
	//*  13   23:aload_0         
	//*  14   24:getfield        #74  <Field int _inputEnd>
	//*  15   27:icmplt          40
			{
				_loadMoreGuaranteed();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
				k = _inputPtr;
	//   18   34:aload_0         
	//   19   35:getfield        #71  <Field int _inputPtr>
	//   20   38:istore          4
			}
			ac = ac1;
	//   21   40:aload           6
	//   22   42:astore_1        
			j = i;
	//   23   43:iload_2         
	//   24   44:istore_3        
			if(i >= ac1.length)
	//*  25   45:iload_2         
	//*  26   46:aload           6
	//*  27   48:arraylength     
	//*  28   49:icmplt          62
			{
				ac = _textBuffer.finishCurrentSegment();
	//   29   52:aload_0         
	//   30   53:getfield        #172 <Field TextBuffer _textBuffer>
	//   31   56:invokevirtual   #178 <Method char[] TextBuffer.finishCurrentSegment()>
	//   32   59:astore_1        
				j = 0;
	//   33   60:iconst_0        
	//   34   61:istore_3        
			}
			int l = Math.min(_inputEnd, (ac.length - j) + k);
	//   35   62:aload_0         
	//   36   63:getfield        #74  <Field int _inputEnd>
	//   37   66:aload_1         
	//   38   67:arraylength     
	//   39   68:iload_3         
	//   40   69:isub            
	//   41   70:iload           4
	//   42   72:iadd            
	//   43   73:invokestatic    #184 <Method int Math.min(int, int)>
	//   44   76:istore          5
			do
			{
				if(k >= l)
					break;
	//   45   78:iload           4
	//   46   80:iload           5
	//   47   82:icmpge          371
				i = k + 1;
	//   48   85:iload           4
	//   49   87:iconst_1        
	//   50   88:iadd            
	//   51   89:istore_2        
				k = abyte0[k] & 0xff;
	//   52   90:aload           8
	//   53   92:iload           4
	//   54   94:baload          
	//   55   95:sipush          255
	//   56   98:iand            
	//   57   99:istore          4
				if(ai[k] != 0)
	//*  58  101:aload           7
	//*  59  103:iload           4
	//*  60  105:iaload          
	//*  61  106:ifeq            355
				{
					_inputPtr = i;
	//   62  109:aload_0         
	//   63  110:iload_2         
	//   64  111:putfield        #71  <Field int _inputPtr>
					if(k == 34)
	//*  65  114:iload           4
	//*  66  116:bipush          34
	//*  67  118:icmpne          130
					{
						_textBuffer.setCurrentLength(j);
	//   68  121:aload_0         
	//   69  122:getfield        #172 <Field TextBuffer _textBuffer>
	//   70  125:iload_3         
	//   71  126:invokevirtual   #188 <Method void TextBuffer.setCurrentLength(int)>
						return;
	//   72  129:return          
					}
					switch(ai[k])
	//*  73  130:aload           7
	//*  74  132:iload           4
	//*  75  134:iaload          
					{
	//*  76  135:tableswitch     1 4: default 164
	//	               1 299
	//	               2 289
	//	               3 256
	//	               4 185
					default:
						int i1;
						if(k < 32)
	//*  77  164:iload           4
	//*  78  166:bipush          32
	//*  79  168:icmpge          307
						{
							_throwUnquotedSpace(k, "string value");
	//   80  171:aload_0         
	//   81  172:iload           4
	//   82  174:ldc1            #190 <String "string value">
	//   83  176:invokevirtual   #194 <Method void _throwUnquotedSpace(int, String)>
							i = k;
	//   84  179:iload           4
	//   85  181:istore_2        
						} else
	//*  86  182:goto            316
	//*  87  185:aload_0         
	//*  88  186:iload           4
	//*  89  188:invokespecial   #196 <Method int _decodeUtf8_4(int)>
	//*  90  191:istore          5
	//*  91  193:iload_3         
	//*  92  194:iconst_1        
	//*  93  195:iadd            
	//*  94  196:istore          4
	//*  95  198:aload_1         
	//*  96  199:iload_3         
	//*  97  200:ldc1            #197 <Int 55296>
	//*  98  202:iload           5
	//*  99  204:bipush          10
	//* 100  206:ishr            
	//* 101  207:ior             
	//* 102  208:int2char        
	//* 103  209:castore         
	//* 104  210:iload           4
	//* 105  212:istore_2        
	//* 106  213:aload_1         
	//* 107  214:astore          6
	//* 108  216:iload           4
	//* 109  218:aload_1         
	//* 110  219:arraylength     
	//* 111  220:icmplt          234
	//* 112  223:aload_0         
	//* 113  224:getfield        #172 <Field TextBuffer _textBuffer>
	//* 114  227:invokevirtual   #178 <Method char[] TextBuffer.finishCurrentSegment()>
	//* 115  230:astore          6
	//* 116  232:iconst_0        
	//* 117  233:istore_2        
	//* 118  234:iload           5
	//* 119  236:sipush          1023
	//* 120  239:iand            
	//* 121  240:ldc1            #198 <Int 56320>
	//* 122  242:ior             
	//* 123  243:istore          4
	//* 124  245:iload_2         
	//* 125  246:istore_3        
	//* 126  247:iload           4
	//* 127  249:istore_2        
	//* 128  250:aload           6
	//* 129  252:astore_1        
	//* 130  253:goto            316
	//* 131  256:aload_0         
	//* 132  257:getfield        #74  <Field int _inputEnd>
	//* 133  260:aload_0         
	//* 134  261:getfield        #71  <Field int _inputPtr>
	//* 135  264:isub            
	//* 136  265:iconst_2        
	//* 137  266:icmplt          279
	//* 138  269:aload_0         
	//* 139  270:iload           4
	//* 140  272:invokespecial   #200 <Method int _decodeUtf8_3fast(int)>
	//* 141  275:istore_2        
	//* 142  276:goto            316
	//* 143  279:aload_0         
	//* 144  280:iload           4
	//* 145  282:invokespecial   #202 <Method int _decodeUtf8_3(int)>
	//* 146  285:istore_2        
	//* 147  286:goto            316
	//* 148  289:aload_0         
	//* 149  290:iload           4
	//* 150  292:invokespecial   #204 <Method int _decodeUtf8_2(int)>
	//* 151  295:istore_2        
	//* 152  296:goto            316
	//* 153  299:aload_0         
	//* 154  300:invokevirtual   #208 <Method char _decodeEscaped()>
	//* 155  303:istore_2        
	//* 156  304:goto            316
						{
							_reportInvalidChar(k);
	//  157  307:aload_0         
	//  158  308:iload           4
	//  159  310:invokevirtual   #211 <Method void _reportInvalidChar(int)>
							i = k;
	//  160  313:iload           4
	//  161  315:istore_2        
						}
						break;

					case 4: // '\004'
						i1 = _decodeUtf8_4(k);
						k = j + 1;
						ac[j] = (char)(0xd800 | i1 >> 10);
						i = k;
						ac1 = ac;
						if(k >= ac.length)
						{
							ac1 = _textBuffer.finishCurrentSegment();
							i = 0;
						}
						k = i1 & 0x3ff | 0xdc00;
						j = i;
						i = k;
						ac = ac1;
						break;

					case 3: // '\003'
						if(_inputEnd - _inputPtr >= 2)
							i = _decodeUtf8_3fast(k);
						else
							i = _decodeUtf8_3(k);
						break;

					case 2: // '\002'
						i = _decodeUtf8_2(k);
						break;

					case 1: // '\001'
						i = ((int) (_decodeEscaped()));
						break;
					}
					ac1 = ac;
	//  162  316:aload_1         
	//  163  317:astore          6
					k = j;
	//  164  319:iload_3         
	//  165  320:istore          4
					if(j >= ac.length)
	//* 166  322:iload_3         
	//* 167  323:aload_1         
	//* 168  324:arraylength     
	//* 169  325:icmplt          340
					{
						ac1 = _textBuffer.finishCurrentSegment();
	//  170  328:aload_0         
	//  171  329:getfield        #172 <Field TextBuffer _textBuffer>
	//  172  332:invokevirtual   #178 <Method char[] TextBuffer.finishCurrentSegment()>
	//  173  335:astore          6
						k = 0;
	//  174  337:iconst_0        
	//  175  338:istore          4
					}
					ac1[k] = (char)i;
	//  176  340:aload           6
	//  177  342:iload           4
	//  178  344:iload_2         
	//  179  345:int2char        
	//  180  346:castore         
					i = k + 1;
	//  181  347:iload           4
	//  182  349:iconst_1        
	//  183  350:iadd            
	//  184  351:istore_2        
					continue label0;
	//  185  352:goto            14
				}
				ac[j] = (char)k;
	//  186  355:aload_1         
	//  187  356:iload_3         
	//  188  357:iload           4
	//  189  359:int2char        
	//  190  360:castore         
				k = i;
	//  191  361:iload_2         
	//  192  362:istore          4
				j++;
	//  193  364:iload_3         
	//  194  365:iconst_1        
	//  195  366:iadd            
	//  196  367:istore_3        
			} while(true);
	//  197  368:goto            78
			_inputPtr = k;
	//  198  371:aload_0         
	//  199  372:iload           4
	//  200  374:putfield        #71  <Field int _inputPtr>
			ac1 = ac;
	//  201  377:aload_1         
	//  202  378:astore          6
			i = j;
	//  203  380:iload_3         
	//  204  381:istore_2        
		} while(true);
	//  205  382:goto            14
	}

	private final void _matchToken2(String s, int i)
		throws IOException
	{
		int k = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #216 <Method int String.length()>
	//    2    4:istore          4
		int j;
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore() || _inputBuffer[_inputPtr] != s.charAt(i))
	//*   3    6:aload_0         
	//*   4    7:getfield        #71  <Field int _inputPtr>
	//*   5   10:aload_0         
	//*   6   11:getfield        #74  <Field int _inputEnd>
	//*   7   14:icmplt          24
	//*   8   17:aload_0         
	//*   9   18:invokevirtual   #219 <Method boolean _loadMore()>
	//*  10   21:ifeq            41
	//*  11   24:aload_0         
	//*  12   25:getfield        #68  <Field byte[] _inputBuffer>
	//*  13   28:aload_0         
	//*  14   29:getfield        #71  <Field int _inputPtr>
	//*  15   32:baload          
	//*  16   33:aload_1         
	//*  17   34:iload_2         
	//*  18   35:invokevirtual   #223 <Method char String.charAt(int)>
	//*  19   38:icmpeq          51
				_reportInvalidToken(s.substring(0, i));
	//   20   41:aload_0         
	//   21   42:aload_1         
	//   22   43:iconst_0        
	//   23   44:iload_2         
	//   24   45:invokevirtual   #103 <Method String String.substring(int, int)>
	//   25   48:invokevirtual   #107 <Method void _reportInvalidToken(String)>
			_inputPtr = _inputPtr + 1;
	//   26   51:aload_0         
	//   27   52:aload_0         
	//   28   53:getfield        #71  <Field int _inputPtr>
	//   29   56:iconst_1        
	//   30   57:iadd            
	//   31   58:putfield        #71  <Field int _inputPtr>
			j = i + 1;
	//   32   61:iload_2         
	//   33   62:iconst_1        
	//   34   63:iadd            
	//   35   64:istore_3        
			i = j;
	//   36   65:iload_3         
	//   37   66:istore_2        
		} while(j < k);
	//   38   67:iload_3         
	//   39   68:iload           4
	//   40   70:icmplt          6
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*  41   73:aload_0         
	//*  42   74:getfield        #71  <Field int _inputPtr>
	//*  43   77:aload_0         
	//*  44   78:getfield        #74  <Field int _inputEnd>
	//*  45   81:icmplt          92
	//*  46   84:aload_0         
	//*  47   85:invokevirtual   #219 <Method boolean _loadMore()>
	//*  48   88:ifne            92
			return;
	//   49   91:return          
		i = _inputBuffer[_inputPtr] & 0xff;
	//   50   92:aload_0         
	//   51   93:getfield        #68  <Field byte[] _inputBuffer>
	//   52   96:aload_0         
	//   53   97:getfield        #71  <Field int _inputPtr>
	//   54  100:baload          
	//   55  101:sipush          255
	//   56  104:iand            
	//   57  105:istore_2        
		if(i >= 48 && i != 93 && i != 125)
	//*  58  106:iload_2         
	//*  59  107:bipush          48
	//*  60  109:icmplt          131
	//*  61  112:iload_2         
	//*  62  113:bipush          93
	//*  63  115:icmpeq          131
	//*  64  118:iload_2         
	//*  65  119:bipush          125
	//*  66  121:icmpeq          131
			_checkMatchEnd(s, j, i);
	//   67  124:aload_0         
	//   68  125:aload_1         
	//   69  126:iload_3         
	//   70  127:iload_2         
	//   71  128:invokespecial   #225 <Method void _checkMatchEnd(String, int, int)>
	//   72  131:return          
	}

	private final JsonToken _nextAfterName()
	{
		_nameCopied = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #230 <Field boolean _nameCopied>
		JsonToken jsontoken = _nextToken;
	//    3    5:aload_0         
	//    4    6:getfield        #233 <Field JsonToken _nextToken>
	//    5    9:astore_1        
		_nextToken = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #233 <Field JsonToken _nextToken>
		if(jsontoken == JsonToken.START_ARRAY)
	//*   9   15:aload_1         
	//*  10   16:getstatic       #236 <Field JsonToken JsonToken.START_ARRAY>
	//*  11   19:if_acmpne       44
			_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #118 <Field JsonReadContext _parsingContext>
	//   15   27:aload_0         
	//   16   28:getfield        #239 <Field int _tokenInputRow>
	//   17   31:aload_0         
	//   18   32:getfield        #242 <Field int _tokenInputCol>
	//   19   35:invokevirtual   #246 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   20   38:putfield        #118 <Field JsonReadContext _parsingContext>
		else
	//*  21   41:goto            70
		if(jsontoken == JsonToken.START_OBJECT)
	//*  22   44:aload_1         
	//*  23   45:getstatic       #249 <Field JsonToken JsonToken.START_OBJECT>
	//*  24   48:if_acmpne       70
			_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   25   51:aload_0         
	//   26   52:aload_0         
	//   27   53:getfield        #118 <Field JsonReadContext _parsingContext>
	//   28   56:aload_0         
	//   29   57:getfield        #239 <Field int _tokenInputRow>
	//   30   60:aload_0         
	//   31   61:getfield        #242 <Field int _tokenInputCol>
	//   32   64:invokevirtual   #252 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   33   67:putfield        #118 <Field JsonReadContext _parsingContext>
		_currToken = jsontoken;
	//   34   70:aload_0         
	//   35   71:aload_1         
	//   36   72:putfield        #149 <Field JsonToken _currToken>
		return jsontoken;
	//   37   75:aload_1         
	//   38   76:areturn         
	}

	private final JsonToken _nextTokenNotInObject(int i)
		throws IOException
	{
		if(i == 34)
	//*   0    0:iload_1         
	//*   1    1:bipush          34
	//*   2    3:icmpne          22
		{
			_tokenIncomplete = true;
	//    3    6:aload_0         
	//    4    7:iconst_1        
	//    5    8:putfield        #255 <Field boolean _tokenIncomplete>
			JsonToken jsontoken = JsonToken.VALUE_STRING;
	//    6   11:getstatic       #258 <Field JsonToken JsonToken.VALUE_STRING>
	//    7   14:astore_2        
			_currToken = jsontoken;
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:putfield        #149 <Field JsonToken _currToken>
			return jsontoken;
	//   11   20:aload_2         
	//   12   21:areturn         
		}
		if(i != 45)
	//*  13   22:iload_1         
	//*  14   23:bipush          45
	//*  15   25:icmpeq          243
		{
			if(i != 91)
	//*  16   28:iload_1         
	//*  17   29:bipush          91
	//*  18   31:icmpeq          213
			{
				if(i != 102)
	//*  19   34:iload_1         
	//*  20   35:bipush          102
	//*  21   37:icmpeq          198
				{
					if(i != 110)
	//*  22   40:iload_1         
	//*  23   41:bipush          110
	//*  24   43:icmpeq          183
					{
						if(i != 116)
	//*  25   46:iload_1         
	//*  26   47:bipush          116
	//*  27   49:icmpeq          168
						{
							if(i != 123)
	//*  28   52:iload_1         
	//*  29   53:bipush          123
	//*  30   55:icmpeq          138
							{
								JsonToken jsontoken2;
								switch(i)
	//*  31   58:iload_1         
								{
	//*  32   59:tableswitch     48 57: default 112
	//	               48 125
	//	               49 125
	//	               50 125
	//	               51 125
	//	               52 125
	//	               53 125
	//	               54 125
	//	               55 125
	//	               56 125
	//	               57 125
								default:
									JsonToken jsontoken1 = _handleUnexpectedValue(i);
	//   33  112:aload_0         
	//   34  113:iload_1         
	//   35  114:invokevirtual   #261 <Method JsonToken _handleUnexpectedValue(int)>
	//   36  117:astore_2        
									_currToken = jsontoken1;
	//   37  118:aload_0         
	//   38  119:aload_2         
	//   39  120:putfield        #149 <Field JsonToken _currToken>
									return jsontoken1;
	//   40  123:aload_2         
	//   41  124:areturn         

								case 48: // '0'
								case 49: // '1'
								case 50: // '2'
								case 51: // '3'
								case 52: // '4'
								case 53: // '5'
								case 54: // '6'
								case 55: // '7'
								case 56: // '8'
								case 57: // '9'
									jsontoken2 = _parsePosNumber(i);
	//   42  125:aload_0         
	//   43  126:iload_1         
	//   44  127:invokevirtual   #264 <Method JsonToken _parsePosNumber(int)>
	//   45  130:astore_2        
									break;
								}
								_currToken = jsontoken2;
	//   46  131:aload_0         
	//   47  132:aload_2         
	//   48  133:putfield        #149 <Field JsonToken _currToken>
								return jsontoken2;
	//   49  136:aload_2         
	//   50  137:areturn         
							} else
							{
								_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   51  138:aload_0         
	//   52  139:aload_0         
	//   53  140:getfield        #118 <Field JsonReadContext _parsingContext>
	//   54  143:aload_0         
	//   55  144:getfield        #239 <Field int _tokenInputRow>
	//   56  147:aload_0         
	//   57  148:getfield        #242 <Field int _tokenInputCol>
	//   58  151:invokevirtual   #252 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   59  154:putfield        #118 <Field JsonReadContext _parsingContext>
								JsonToken jsontoken3 = JsonToken.START_OBJECT;
	//   60  157:getstatic       #249 <Field JsonToken JsonToken.START_OBJECT>
	//   61  160:astore_2        
								_currToken = jsontoken3;
	//   62  161:aload_0         
	//   63  162:aload_2         
	//   64  163:putfield        #149 <Field JsonToken _currToken>
								return jsontoken3;
	//   65  166:aload_2         
	//   66  167:areturn         
							}
						} else
						{
							_matchTrue();
	//   67  168:aload_0         
	//   68  169:invokevirtual   #267 <Method void _matchTrue()>
							JsonToken jsontoken4 = JsonToken.VALUE_TRUE;
	//   69  172:getstatic       #270 <Field JsonToken JsonToken.VALUE_TRUE>
	//   70  175:astore_2        
							_currToken = jsontoken4;
	//   71  176:aload_0         
	//   72  177:aload_2         
	//   73  178:putfield        #149 <Field JsonToken _currToken>
							return jsontoken4;
	//   74  181:aload_2         
	//   75  182:areturn         
						}
					} else
					{
						_matchNull();
	//   76  183:aload_0         
	//   77  184:invokevirtual   #273 <Method void _matchNull()>
						JsonToken jsontoken5 = JsonToken.VALUE_NULL;
	//   78  187:getstatic       #276 <Field JsonToken JsonToken.VALUE_NULL>
	//   79  190:astore_2        
						_currToken = jsontoken5;
	//   80  191:aload_0         
	//   81  192:aload_2         
	//   82  193:putfield        #149 <Field JsonToken _currToken>
						return jsontoken5;
	//   83  196:aload_2         
	//   84  197:areturn         
					}
				} else
				{
					_matchFalse();
	//   85  198:aload_0         
	//   86  199:invokevirtual   #279 <Method void _matchFalse()>
					JsonToken jsontoken6 = JsonToken.VALUE_FALSE;
	//   87  202:getstatic       #282 <Field JsonToken JsonToken.VALUE_FALSE>
	//   88  205:astore_2        
					_currToken = jsontoken6;
	//   89  206:aload_0         
	//   90  207:aload_2         
	//   91  208:putfield        #149 <Field JsonToken _currToken>
					return jsontoken6;
	//   92  211:aload_2         
	//   93  212:areturn         
				}
			} else
			{
				_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   94  213:aload_0         
	//   95  214:aload_0         
	//   96  215:getfield        #118 <Field JsonReadContext _parsingContext>
	//   97  218:aload_0         
	//   98  219:getfield        #239 <Field int _tokenInputRow>
	//   99  222:aload_0         
	//  100  223:getfield        #242 <Field int _tokenInputCol>
	//  101  226:invokevirtual   #246 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//  102  229:putfield        #118 <Field JsonReadContext _parsingContext>
				JsonToken jsontoken7 = JsonToken.START_ARRAY;
	//  103  232:getstatic       #236 <Field JsonToken JsonToken.START_ARRAY>
	//  104  235:astore_2        
				_currToken = jsontoken7;
	//  105  236:aload_0         
	//  106  237:aload_2         
	//  107  238:putfield        #149 <Field JsonToken _currToken>
				return jsontoken7;
	//  108  241:aload_2         
	//  109  242:areturn         
			}
		} else
		{
			JsonToken jsontoken8 = _parseNegNumber();
	//  110  243:aload_0         
	//  111  244:invokevirtual   #285 <Method JsonToken _parseNegNumber()>
	//  112  247:astore_2        
			_currToken = jsontoken8;
	//  113  248:aload_0         
	//  114  249:aload_2         
	//  115  250:putfield        #149 <Field JsonToken _currToken>
			return jsontoken8;
	//  116  253:aload_2         
	//  117  254:areturn         
		}
	}

	private static final int _padLastQuad(int i, int j)
	{
		if(j == 4)
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          7
			return i;
	//    3    5:iload_0         
	//    4    6:ireturn         
		else
			return i | -1 << (j << 3);
	//    5    7:iload_0         
	//    6    8:iconst_m1       
	//    7    9:iload_1         
	//    8   10:iconst_3        
	//    9   11:ishl            
	//   10   12:ishl            
	//   11   13:ior             
	//   12   14:ireturn         
	}

	private final JsonToken _parseFloat(char ac[], int i, int j, boolean flag, int k)
		throws IOException
	{
		int l;
		int l1;
		int i2;
		char ac3[];
label0:
		{
label1:
			{
				int i1;
label2:
				{
					i2 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          9
					if(j != 46)
						break label1;
	//    2    3:iload_3         
	//    3    4:bipush          46
	//    4    6:icmpne          216
					char ac1[] = ac;
	//    5    9:aload_1         
	//    6   10:astore          13
					l = i;
	//    7   12:iload_2         
	//    8   13:istore          6
					if(i >= ac.length)
	//*   9   15:iload_2         
	//*  10   16:aload_1         
	//*  11   17:arraylength     
	//*  12   18:icmplt          33
					{
						ac1 = _textBuffer.finishCurrentSegment();
	//   13   21:aload_0         
	//   14   22:getfield        #172 <Field TextBuffer _textBuffer>
	//   15   25:invokevirtual   #178 <Method char[] TextBuffer.finishCurrentSegment()>
	//   16   28:astore          13
						l = 0;
	//   17   30:iconst_0        
	//   18   31:istore          6
					}
					ac1[l] = (char)j;
	//   19   33:aload           13
	//   20   35:iload           6
	//   21   37:iload_3         
	//   22   38:int2char        
	//   23   39:castore         
					i = l + 1;
	//   24   40:iload           6
	//   25   42:iconst_1        
	//   26   43:iadd            
	//   27   44:istore_2        
					l = j;
	//   28   45:iload_3         
	//   29   46:istore          6
					ac = ac1;
	//   30   48:aload           13
	//   31   50:astore_1        
					j = 0;
	//   32   51:iconst_0        
	//   33   52:istore_3        
					do
					{
						if(_inputPtr >= _inputEnd && !_loadMore())
	//*  34   53:aload_0         
	//*  35   54:getfield        #71  <Field int _inputPtr>
	//*  36   57:aload_0         
	//*  37   58:getfield        #74  <Field int _inputEnd>
	//*  38   61:icmplt          85
	//*  39   64:aload_0         
	//*  40   65:invokevirtual   #219 <Method boolean _loadMore()>
	//*  41   68:ifne            85
						{
							boolean flag2 = true;
	//   42   71:iconst_1        
	//   43   72:istore          8
							i1 = l;
	//   44   74:iload           6
	//   45   76:istore          7
							l = ((int) (flag2));
	//   46   78:iload           8
	//   47   80:istore          6
							break label2;
	//   48   82:goto            187
						}
						char ac2[] = ((char []) (_inputBuffer));
	//   49   85:aload_0         
	//   50   86:getfield        #68  <Field byte[] _inputBuffer>
	//   51   89:astore          13
						l = _inputPtr;
	//   52   91:aload_0         
	//   53   92:getfield        #71  <Field int _inputPtr>
	//   54   95:istore          6
						_inputPtr = l + 1;
	//   55   97:aload_0         
	//   56   98:iload           6
	//   57  100:iconst_1        
	//   58  101:iadd            
	//   59  102:putfield        #71  <Field int _inputPtr>
						i1 = ac2[l] & 0xff;
	//   60  105:aload           13
	//   61  107:iload           6
	//   62  109:baload          
	//   63  110:sipush          255
	//   64  113:iand            
	//   65  114:istore          7
						if(i1 < 48 || i1 > 57)
	//*  66  116:iload           7
	//*  67  118:bipush          48
	//*  68  120:icmplt          184
	//*  69  123:iload           7
	//*  70  125:bipush          57
	//*  71  127:icmple          133
							break;
	//   72  130:goto            184
						int k1 = j + 1;
	//   73  133:iload_3         
	//   74  134:iconst_1        
	//   75  135:iadd            
	//   76  136:istore          8
						j = i;
	//   77  138:iload_2         
	//   78  139:istore_3        
						ac2 = ac;
	//   79  140:aload_1         
	//   80  141:astore          13
						if(i >= ac.length)
	//*  81  143:iload_2         
	//*  82  144:aload_1         
	//*  83  145:arraylength     
	//*  84  146:icmplt          160
						{
							ac2 = _textBuffer.finishCurrentSegment();
	//   85  149:aload_0         
	//   86  150:getfield        #172 <Field TextBuffer _textBuffer>
	//   87  153:invokevirtual   #178 <Method char[] TextBuffer.finishCurrentSegment()>
	//   88  156:astore          13
							j = 0;
	//   89  158:iconst_0        
	//   90  159:istore_3        
						}
						ac2[j] = (char)i1;
	//   91  160:aload           13
	//   92  162:iload_3         
	//   93  163:iload           7
	//   94  165:int2char        
	//   95  166:castore         
						i = j + 1;
	//   96  167:iload_3         
	//   97  168:iconst_1        
	//   98  169:iadd            
	//   99  170:istore_2        
						l = i1;
	//  100  171:iload           7
	//  101  173:istore          6
						j = k1;
	//  102  175:iload           8
	//  103  177:istore_3        
						ac = ac2;
	//  104  178:aload           13
	//  105  180:astore_1        
					} while(true);
	//  106  181:goto            53
					l = 0;
	//  107  184:iconst_0        
	//  108  185:istore          6
				}
				if(j == 0)
	//* 109  187:iload_3         
	//* 110  188:ifne            200
					reportUnexpectedNumberChar(i1, "Decimal point not followed by a digit");
	//  111  191:aload_0         
	//  112  192:iload           7
	//  113  194:ldc2            #290 <String "Decimal point not followed by a digit">
	//  114  197:invokevirtual   #293 <Method void reportUnexpectedNumberChar(int, String)>
				l1 = j;
	//  115  200:iload_3         
	//  116  201:istore          8
				j = l;
	//  117  203:iload           6
	//  118  205:istore_3        
				ac3 = ac;
	//  119  206:aload_1         
	//  120  207:astore          13
				l = i1;
	//  121  209:iload           7
	//  122  211:istore          6
				break label0;
	//  123  213:goto            231
			}
			l1 = 0;
	//  124  216:iconst_0        
	//  125  217:istore          8
			boolean flag1 = false;
	//  126  219:iconst_0        
	//  127  220:istore          7
			l = j;
	//  128  222:iload_3         
	//  129  223:istore          6
			ac3 = ac;
	//  130  225:aload_1         
	//  131  226:astore          13
			j = ((int) (flag1));
	//  132  228:iload           7
	//  133  230:istore_3        
		}
		int j2;
		int k2;
		int l2;
label3:
		{
			int j1;
label4:
			{
				if(l != 101)
	//* 134  231:iload           6
	//* 135  233:bipush          101
	//* 136  235:icmpeq          255
				{
					j2 = j;
	//  137  238:iload_3         
	//  138  239:istore          10
					k2 = i;
	//  139  241:iload_2         
	//  140  242:istore          11
					l2 = l;
	//  141  244:iload           6
	//  142  246:istore          12
					if(l != 69)
						break label3;
	//  143  248:iload           6
	//  144  250:bipush          69
	//  145  252:icmpne          630
				}
				ac = ac3;
	//  146  255:aload           13
	//  147  257:astore_1        
				j1 = i;
	//  148  258:iload_2         
	//  149  259:istore          7
				if(i >= ac3.length)
	//* 150  261:iload_2         
	//* 151  262:aload           13
	//* 152  264:arraylength     
	//* 153  265:icmplt          279
				{
					ac = _textBuffer.finishCurrentSegment();
	//  154  268:aload_0         
	//  155  269:getfield        #172 <Field TextBuffer _textBuffer>
	//  156  272:invokevirtual   #178 <Method char[] TextBuffer.finishCurrentSegment()>
	//  157  275:astore_1        
					j1 = 0;
	//  158  276:iconst_0        
	//  159  277:istore          7
				}
				i = j1 + 1;
	//  160  279:iload           7
	//  161  281:iconst_1        
	//  162  282:iadd            
	//  163  283:istore_2        
				ac[j1] = (char)l;
	//  164  284:aload_1         
	//  165  285:iload           7
	//  166  287:iload           6
	//  167  289:int2char        
	//  168  290:castore         
				if(_inputPtr >= _inputEnd)
	//* 169  291:aload_0         
	//* 170  292:getfield        #71  <Field int _inputPtr>
	//* 171  295:aload_0         
	//* 172  296:getfield        #74  <Field int _inputEnd>
	//* 173  299:icmplt          306
					_loadMoreGuaranteed();
	//  174  302:aload_0         
	//  175  303:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
				ac3 = ((char []) (_inputBuffer));
	//  176  306:aload_0         
	//  177  307:getfield        #68  <Field byte[] _inputBuffer>
	//  178  310:astore          13
				l = _inputPtr;
	//  179  312:aload_0         
	//  180  313:getfield        #71  <Field int _inputPtr>
	//  181  316:istore          6
				_inputPtr = l + 1;
	//  182  318:aload_0         
	//  183  319:iload           6
	//  184  321:iconst_1        
	//  185  322:iadd            
	//  186  323:putfield        #71  <Field int _inputPtr>
				j1 = ac3[l] & 0xff;
	//  187  326:aload           13
	//  188  328:iload           6
	//  189  330:baload          
	//  190  331:sipush          255
	//  191  334:iand            
	//  192  335:istore          7
				if(j1 != 45 && j1 != 43)
	//* 193  337:iload           7
	//* 194  339:bipush          45
	//* 195  341:icmpeq          364
	//* 196  344:iload           7
	//* 197  346:bipush          43
	//* 198  348:icmpne          354
	//* 199  351:goto            364
				{
					l = j1;
	//  200  354:iload           7
	//  201  356:istore          6
					j1 = 0;
	//  202  358:iconst_0        
	//  203  359:istore          7
				} else
	//* 204  361:goto            452
				{
					l = i;
	//  205  364:iload_2         
	//  206  365:istore          6
					char ac4[] = ac;
	//  207  367:aload_1         
	//  208  368:astore          13
					if(i >= ac.length)
	//* 209  370:iload_2         
	//* 210  371:aload_1         
	//* 211  372:arraylength     
	//* 212  373:icmplt          388
					{
						ac4 = _textBuffer.finishCurrentSegment();
	//  213  376:aload_0         
	//  214  377:getfield        #172 <Field TextBuffer _textBuffer>
	//  215  380:invokevirtual   #178 <Method char[] TextBuffer.finishCurrentSegment()>
	//  216  383:astore          13
						l = 0;
	//  217  385:iconst_0        
	//  218  386:istore          6
					}
					ac4[l] = (char)j1;
	//  219  388:aload           13
	//  220  390:iload           6
	//  221  392:iload           7
	//  222  394:int2char        
	//  223  395:castore         
					if(_inputPtr >= _inputEnd)
	//* 224  396:aload_0         
	//* 225  397:getfield        #71  <Field int _inputPtr>
	//* 226  400:aload_0         
	//* 227  401:getfield        #74  <Field int _inputEnd>
	//* 228  404:icmplt          411
						_loadMoreGuaranteed();
	//  229  407:aload_0         
	//  230  408:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
					ac = ((char []) (_inputBuffer));
	//  231  411:aload_0         
	//  232  412:getfield        #68  <Field byte[] _inputBuffer>
	//  233  415:astore_1        
					i = _inputPtr;
	//  234  416:aload_0         
	//  235  417:getfield        #71  <Field int _inputPtr>
	//  236  420:istore_2        
					_inputPtr = i + 1;
	//  237  421:aload_0         
	//  238  422:iload_2         
	//  239  423:iconst_1        
	//  240  424:iadd            
	//  241  425:putfield        #71  <Field int _inputPtr>
					j1 = ((int) (ac[i]));
	//  242  428:aload_1         
	//  243  429:iload_2         
	//  244  430:baload          
	//  245  431:istore          7
					i = l + 1;
	//  246  433:iload           6
	//  247  435:iconst_1        
	//  248  436:iadd            
	//  249  437:istore_2        
					l = j1 & 0xff;
	//  250  438:iload           7
	//  251  440:sipush          255
	//  252  443:iand            
	//  253  444:istore          6
					ac = ac4;
	//  254  446:aload           13
	//  255  448:astore_1        
					j1 = 0;
	//  256  449:iconst_0        
	//  257  450:istore          7
				}
				do
				{
					if(l < 48 || l > 57)
						break;
	//  258  452:iload           6
	//  259  454:bipush          48
	//  260  456:icmplt          579
	//  261  459:iload           6
	//  262  461:bipush          57
	//  263  463:icmpgt          579
					j1++;
	//  264  466:iload           7
	//  265  468:iconst_1        
	//  266  469:iadd            
	//  267  470:istore          7
					i2 = i;
	//  268  472:iload_2         
	//  269  473:istore          9
					char ac5[] = ac;
	//  270  475:aload_1         
	//  271  476:astore          13
					if(i >= ac.length)
	//* 272  478:iload_2         
	//* 273  479:aload_1         
	//* 274  480:arraylength     
	//* 275  481:icmplt          496
					{
						ac5 = _textBuffer.finishCurrentSegment();
	//  276  484:aload_0         
	//  277  485:getfield        #172 <Field TextBuffer _textBuffer>
	//  278  488:invokevirtual   #178 <Method char[] TextBuffer.finishCurrentSegment()>
	//  279  491:astore          13
						i2 = 0;
	//  280  493:iconst_0        
	//  281  494:istore          9
					}
					i = i2 + 1;
	//  282  496:iload           9
	//  283  498:iconst_1        
	//  284  499:iadd            
	//  285  500:istore_2        
					ac5[i2] = (char)l;
	//  286  501:aload           13
	//  287  503:iload           9
	//  288  505:iload           6
	//  289  507:int2char        
	//  290  508:castore         
					if(_inputPtr >= _inputEnd && !_loadMore())
	//* 291  509:aload_0         
	//* 292  510:getfield        #71  <Field int _inputPtr>
	//* 293  513:aload_0         
	//* 294  514:getfield        #74  <Field int _inputEnd>
	//* 295  517:icmplt          544
	//* 296  520:aload_0         
	//* 297  521:invokevirtual   #219 <Method boolean _loadMore()>
	//* 298  524:ifne            544
					{
						j = j1;
	//  299  527:iload           7
	//  300  529:istore_3        
						j1 = i;
	//  301  530:iload_2         
	//  302  531:istore          7
						i2 = 1;
	//  303  533:iconst_1        
	//  304  534:istore          9
						i = j;
	//  305  536:iload_3         
	//  306  537:istore_2        
						j = i2;
	//  307  538:iload           9
	//  308  540:istore_3        
						break label4;
	//  309  541:goto            589
					}
					ac = ((char []) (_inputBuffer));
	//  310  544:aload_0         
	//  311  545:getfield        #68  <Field byte[] _inputBuffer>
	//  312  548:astore_1        
					l = _inputPtr;
	//  313  549:aload_0         
	//  314  550:getfield        #71  <Field int _inputPtr>
	//  315  553:istore          6
					_inputPtr = l + 1;
	//  316  555:aload_0         
	//  317  556:iload           6
	//  318  558:iconst_1        
	//  319  559:iadd            
	//  320  560:putfield        #71  <Field int _inputPtr>
					l = ac[l] & 0xff;
	//  321  563:aload_1         
	//  322  564:iload           6
	//  323  566:baload          
	//  324  567:sipush          255
	//  325  570:iand            
	//  326  571:istore          6
					ac = ac5;
	//  327  573:aload           13
	//  328  575:astore_1        
				} while(true);
	//  329  576:goto            452
				i2 = j1;
	//  330  579:iload           7
	//  331  581:istore          9
				j1 = i;
	//  332  583:iload_2         
	//  333  584:istore          7
				i = i2;
	//  334  586:iload           9
	//  335  588:istore_2        
			}
			i2 = i;
	//  336  589:iload_2         
	//  337  590:istore          9
			j2 = j;
	//  338  592:iload_3         
	//  339  593:istore          10
			k2 = j1;
	//  340  595:iload           7
	//  341  597:istore          11
			l2 = l;
	//  342  599:iload           6
	//  343  601:istore          12
			if(i == 0)
	//* 344  603:iload_2         
	//* 345  604:ifne            630
			{
				reportUnexpectedNumberChar(l, "Exponent indicator not followed by a digit");
	//  346  607:aload_0         
	//  347  608:iload           6
	//  348  610:ldc2            #295 <String "Exponent indicator not followed by a digit">
	//  349  613:invokevirtual   #293 <Method void reportUnexpectedNumberChar(int, String)>
				l2 = l;
	//  350  616:iload           6
	//  351  618:istore          12
				k2 = j1;
	//  352  620:iload           7
	//  353  622:istore          11
				j2 = j;
	//  354  624:iload_3         
	//  355  625:istore          10
				i2 = i;
	//  356  627:iload_2         
	//  357  628:istore          9
			}
		}
		if(j2 == 0)
	//* 358  630:iload           10
	//* 359  632:ifne            661
		{
			_inputPtr = _inputPtr - 1;
	//  360  635:aload_0         
	//  361  636:aload_0         
	//  362  637:getfield        #71  <Field int _inputPtr>
	//  363  640:iconst_1        
	//  364  641:isub            
	//  365  642:putfield        #71  <Field int _inputPtr>
			if(_parsingContext.inRoot())
	//* 366  645:aload_0         
	//* 367  646:getfield        #118 <Field JsonReadContext _parsingContext>
	//* 368  649:invokevirtual   #298 <Method boolean JsonReadContext.inRoot()>
	//* 369  652:ifeq            661
				_verifyRootSpace(l2);
	//  370  655:aload_0         
	//  371  656:iload           12
	//  372  658:invokespecial   #301 <Method void _verifyRootSpace(int)>
		}
		_textBuffer.setCurrentLength(k2);
	//  373  661:aload_0         
	//  374  662:getfield        #172 <Field TextBuffer _textBuffer>
	//  375  665:iload           11
	//  376  667:invokevirtual   #188 <Method void TextBuffer.setCurrentLength(int)>
		return resetFloat(flag, k, l1, i2);
	//  377  670:aload_0         
	//  378  671:iload           4
	//  379  673:iload           5
	//  380  675:iload           8
	//  381  677:iload           9
	//  382  679:invokevirtual   #305 <Method JsonToken resetFloat(boolean, int, int, int)>
	//  383  682:areturn         
	}

	private final JsonToken _parseNumber2(char ac[], int i, boolean flag, int j)
		throws IOException
	{
		int l;
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #74  <Field int _inputEnd>
	//*   4    8:icmplt          34
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #219 <Method boolean _loadMore()>
	//*   7   15:ifne            34
			{
				_textBuffer.setCurrentLength(i);
	//    8   18:aload_0         
	//    9   19:getfield        #172 <Field TextBuffer _textBuffer>
	//   10   22:iload_2         
	//   11   23:invokevirtual   #188 <Method void TextBuffer.setCurrentLength(int)>
				return resetInt(flag, j);
	//   12   26:aload_0         
	//   13   27:iload_3         
	//   14   28:iload           4
	//   15   30:invokevirtual   #311 <Method JsonToken resetInt(boolean, int)>
	//   16   33:areturn         
			}
			char ac1[] = ((char []) (_inputBuffer));
	//   17   34:aload_0         
	//   18   35:getfield        #68  <Field byte[] _inputBuffer>
	//   19   38:astore          7
			int k = _inputPtr;
	//   20   40:aload_0         
	//   21   41:getfield        #71  <Field int _inputPtr>
	//   22   44:istore          5
			_inputPtr = k + 1;
	//   23   46:aload_0         
	//   24   47:iload           5
	//   25   49:iconst_1        
	//   26   50:iadd            
	//   27   51:putfield        #71  <Field int _inputPtr>
			l = ac1[k] & 0xff;
	//   28   54:aload           7
	//   29   56:iload           5
	//   30   58:baload          
	//   31   59:sipush          255
	//   32   62:iand            
	//   33   63:istore          6
			if(l > 57 || l < 48)
	//*  34   65:iload           6
	//*  35   67:bipush          57
	//*  36   69:icmpgt          131
	//*  37   72:iload           6
	//*  38   74:bipush          48
	//*  39   76:icmpge          82
				break;
	//   40   79:goto            131
			ac1 = ac;
	//   41   82:aload_1         
	//   42   83:astore          7
			k = i;
	//   43   85:iload_2         
	//   44   86:istore          5
			if(i >= ac.length)
	//*  45   88:iload_2         
	//*  46   89:aload_1         
	//*  47   90:arraylength     
	//*  48   91:icmplt          106
			{
				ac1 = _textBuffer.finishCurrentSegment();
	//   49   94:aload_0         
	//   50   95:getfield        #172 <Field TextBuffer _textBuffer>
	//   51   98:invokevirtual   #178 <Method char[] TextBuffer.finishCurrentSegment()>
	//   52  101:astore          7
				k = 0;
	//   53  103:iconst_0        
	//   54  104:istore          5
			}
			ac1[k] = (char)l;
	//   55  106:aload           7
	//   56  108:iload           5
	//   57  110:iload           6
	//   58  112:int2char        
	//   59  113:castore         
			j++;
	//   60  114:iload           4
	//   61  116:iconst_1        
	//   62  117:iadd            
	//   63  118:istore          4
			i = k + 1;
	//   64  120:iload           5
	//   65  122:iconst_1        
	//   66  123:iadd            
	//   67  124:istore_2        
			ac = ac1;
	//   68  125:aload           7
	//   69  127:astore_1        
		} while(true);
	//   70  128:goto            0
		if(l != 46 && l != 101 && l != 69)
	//*  71  131:iload           6
	//*  72  133:bipush          46
	//*  73  135:icmpeq          219
	//*  74  138:iload           6
	//*  75  140:bipush          101
	//*  76  142:icmpeq          219
	//*  77  145:iload           6
	//*  78  147:bipush          69
	//*  79  149:icmpne          155
	//*  80  152:goto            219
		{
			_inputPtr = _inputPtr - 1;
	//   81  155:aload_0         
	//   82  156:aload_0         
	//   83  157:getfield        #71  <Field int _inputPtr>
	//   84  160:iconst_1        
	//   85  161:isub            
	//   86  162:putfield        #71  <Field int _inputPtr>
			_textBuffer.setCurrentLength(i);
	//   87  165:aload_0         
	//   88  166:getfield        #172 <Field TextBuffer _textBuffer>
	//   89  169:iload_2         
	//   90  170:invokevirtual   #188 <Method void TextBuffer.setCurrentLength(int)>
			if(_parsingContext.inRoot())
	//*  91  173:aload_0         
	//*  92  174:getfield        #118 <Field JsonReadContext _parsingContext>
	//*  93  177:invokevirtual   #298 <Method boolean JsonReadContext.inRoot()>
	//*  94  180:ifeq            211
			{
				ac = ((char []) (_inputBuffer));
	//   95  183:aload_0         
	//   96  184:getfield        #68  <Field byte[] _inputBuffer>
	//   97  187:astore_1        
				i = _inputPtr;
	//   98  188:aload_0         
	//   99  189:getfield        #71  <Field int _inputPtr>
	//  100  192:istore_2        
				_inputPtr = i + 1;
	//  101  193:aload_0         
	//  102  194:iload_2         
	//  103  195:iconst_1        
	//  104  196:iadd            
	//  105  197:putfield        #71  <Field int _inputPtr>
				_verifyRootSpace(ac[i] & 0xff);
	//  106  200:aload_0         
	//  107  201:aload_1         
	//  108  202:iload_2         
	//  109  203:baload          
	//  110  204:sipush          255
	//  111  207:iand            
	//  112  208:invokespecial   #301 <Method void _verifyRootSpace(int)>
			}
			return resetInt(flag, j);
	//  113  211:aload_0         
	//  114  212:iload_3         
	//  115  213:iload           4
	//  116  215:invokevirtual   #311 <Method JsonToken resetInt(boolean, int)>
	//  117  218:areturn         
		} else
		{
			return _parseFloat(ac, i, l, flag, j);
	//  118  219:aload_0         
	//  119  220:aload_1         
	//  120  221:iload_2         
	//  121  222:iload           6
	//  122  224:iload_3         
	//  123  225:iload           4
	//  124  227:invokespecial   #313 <Method JsonToken _parseFloat(char[], int, int, boolean, int)>
	//  125  230:areturn         
		}
	}

	private final void _skipCComment()
		throws IOException
	{
		int ai[] = CharTypes.getInputCodeComment();
	//    0    0:invokestatic    #317 <Method int[] CharTypes.getInputCodeComment()>
	//    1    3:astore_3        
label0:
		do
		{
label1:
			{
label2:
				{
label3:
					{
						do
						{
							if(_inputPtr >= _inputEnd && !_loadMore())
								break;
	//    2    4:aload_0         
	//    3    5:getfield        #71  <Field int _inputPtr>
	//    4    8:aload_0         
	//    5    9:getfield        #74  <Field int _inputEnd>
	//    6   12:icmplt          22
	//    7   15:aload_0         
	//    8   16:invokevirtual   #219 <Method boolean _loadMore()>
	//    9   19:ifeq            152
							byte abyte0[] = _inputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #68  <Field byte[] _inputBuffer>
	//   12   26:astore          4
							int i = _inputPtr;
	//   13   28:aload_0         
	//   14   29:getfield        #71  <Field int _inputPtr>
	//   15   32:istore_1        
							_inputPtr = i + 1;
	//   16   33:aload_0         
	//   17   34:iload_1         
	//   18   35:iconst_1        
	//   19   36:iadd            
	//   20   37:putfield        #71  <Field int _inputPtr>
							i = abyte0[i] & 0xff;
	//   21   40:aload           4
	//   22   42:iload_1         
	//   23   43:baload          
	//   24   44:sipush          255
	//   25   47:iand            
	//   26   48:istore_1        
							int j = ai[i];
	//   27   49:aload_3         
	//   28   50:iload_1         
	//   29   51:iaload          
	//   30   52:istore_2        
							if(j == 0)
								continue;
	//   31   53:iload_2         
	//   32   54:ifeq            4
							if(j == 10)
								break label1;
	//   33   57:iload_2         
	//   34   58:bipush          10
	//   35   60:icmpeq          193
							if(j == 13)
								break label2;
	//   36   63:iload_2         
	//   37   64:bipush          13
	//   38   66:icmpeq          186
							if(j != 42)
	//*  39   69:iload_2         
	//*  40   70:bipush          42
	//*  41   72:icmpeq          134
							{
								switch(j)
	//*  42   75:iload_2         
								{
	//*  43   76:tableswitch     2 4: default 104
	//	               2 127
	//	               3 120
	//	               4 112
								default:
									_reportInvalidChar(i);
	//   44  104:aload_0         
	//   45  105:iload_1         
	//   46  106:invokevirtual   #211 <Method void _reportInvalidChar(int)>
									break;

	//*  47  109:goto            4
								case 4: // '\004'
									_skipUtf8_4(i);
	//   48  112:aload_0         
	//   49  113:iload_1         
	//   50  114:invokespecial   #320 <Method void _skipUtf8_4(int)>
									break;

	//*  51  117:goto            4
								case 3: // '\003'
									_skipUtf8_3();
	//   52  120:aload_0         
	//   53  121:invokespecial   #323 <Method void _skipUtf8_3()>
									break;

	//*  54  124:goto            4
								case 2: // '\002'
									_skipUtf8_2();
	//   55  127:aload_0         
	//   56  128:invokespecial   #326 <Method void _skipUtf8_2()>
									break;
								}
								continue label0;
	//   57  131:goto            4
							}
							if(_inputPtr < _inputEnd || _loadMore())
								break label3;
	//   58  134:aload_0         
	//   59  135:getfield        #71  <Field int _inputPtr>
	//   60  138:aload_0         
	//   61  139:getfield        #74  <Field int _inputEnd>
	//   62  142:icmplt          161
	//   63  145:aload_0         
	//   64  146:invokevirtual   #219 <Method boolean _loadMore()>
	//   65  149:ifne            161
							break;
						} while(true);
						_reportInvalidEOF(" in a comment", ((JsonToken) (null)));
	//   66  152:aload_0         
	//   67  153:ldc2            #328 <String " in a comment">
	//   68  156:aconst_null     
	//   69  157:invokevirtual   #332 <Method void _reportInvalidEOF(String, JsonToken)>
						return;
	//   70  160:return          
					}
					if(_inputBuffer[_inputPtr] == 47)
	//*  71  161:aload_0         
	//*  72  162:getfield        #68  <Field byte[] _inputBuffer>
	//*  73  165:aload_0         
	//*  74  166:getfield        #71  <Field int _inputPtr>
	//*  75  169:baload          
	//*  76  170:bipush          47
	//*  77  172:icmpne          4
					{
						_inputPtr = _inputPtr + 1;
	//   78  175:aload_0         
	//   79  176:aload_0         
	//   80  177:getfield        #71  <Field int _inputPtr>
	//   81  180:iconst_1        
	//   82  181:iadd            
	//   83  182:putfield        #71  <Field int _inputPtr>
						return;
	//   84  185:return          
					}
					continue;
				}
				_skipCR();
	//   85  186:aload_0         
	//   86  187:invokevirtual   #335 <Method void _skipCR()>
				continue;
	//   87  190:goto            4
			}
			_currInputRow = _currInputRow + 1;
	//   88  193:aload_0         
	//   89  194:aload_0         
	//   90  195:getfield        #338 <Field int _currInputRow>
	//   91  198:iconst_1        
	//   92  199:iadd            
	//   93  200:putfield        #338 <Field int _currInputRow>
			_currInputRowStart = _inputPtr;
	//   94  203:aload_0         
	//   95  204:aload_0         
	//   96  205:getfield        #71  <Field int _inputPtr>
	//   97  208:putfield        #77  <Field int _currInputRowStart>
		} while(true);
	//*  98  211:goto            4
	}

	private final int _skipColon()
		throws IOException
	{
		int k;
label0:
		{
			if(_inputPtr + 4 >= _inputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int _inputPtr>
	//*   2    4:iconst_4        
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #74  <Field int _inputEnd>
	//*   6   10:icmplt          19
				return _skipColon2(false);
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:invokespecial   #343 <Method int _skipColon2(boolean)>
	//   10   18:ireturn         
			byte byte0 = _inputBuffer[_inputPtr];
	//   11   19:aload_0         
	//   12   20:getfield        #68  <Field byte[] _inputBuffer>
	//   13   23:aload_0         
	//   14   24:getfield        #71  <Field int _inputPtr>
	//   15   27:baload          
	//   16   28:istore_2        
			if(byte0 == 58)
	//*  17   29:iload_2         
	//*  18   30:bipush          58
	//*  19   32:icmpne          173
			{
				byte abyte0[] = _inputBuffer;
	//   20   35:aload_0         
	//   21   36:getfield        #68  <Field byte[] _inputBuffer>
	//   22   39:astore_3        
				int i = _inputPtr + 1;
	//   23   40:aload_0         
	//   24   41:getfield        #71  <Field int _inputPtr>
	//   25   44:iconst_1        
	//   26   45:iadd            
	//   27   46:istore_1        
				_inputPtr = i;
	//   28   47:aload_0         
	//   29   48:iload_1         
	//   30   49:putfield        #71  <Field int _inputPtr>
				i = ((int) (abyte0[i]));
	//   31   52:aload_3         
	//   32   53:iload_1         
	//   33   54:baload          
	//   34   55:istore_1        
				if(i > 32)
	//*  35   56:iload_1         
	//*  36   57:bipush          32
	//*  37   59:icmple          95
					if(i != 47 && i != 35)
	//*  38   62:iload_1         
	//*  39   63:bipush          47
	//*  40   65:icmpeq          89
	//*  41   68:iload_1         
	//*  42   69:bipush          35
	//*  43   71:icmpne          77
	//*  44   74:goto            89
					{
						_inputPtr = _inputPtr + 1;
	//   45   77:aload_0         
	//   46   78:aload_0         
	//   47   79:getfield        #71  <Field int _inputPtr>
	//   48   82:iconst_1        
	//   49   83:iadd            
	//   50   84:putfield        #71  <Field int _inputPtr>
						return i;
	//   51   87:iload_1         
	//   52   88:ireturn         
					} else
					{
						return _skipColon2(true);
	//   53   89:aload_0         
	//   54   90:iconst_1        
	//   55   91:invokespecial   #343 <Method int _skipColon2(boolean)>
	//   56   94:ireturn         
					}
				if(i == 32 || i == 9)
	//*  57   95:iload_1         
	//*  58   96:bipush          32
	//*  59   98:icmpeq          107
	//*  60  101:iload_1         
	//*  61  102:bipush          9
	//*  62  104:icmpne          167
				{
					byte abyte1[] = _inputBuffer;
	//   63  107:aload_0         
	//   64  108:getfield        #68  <Field byte[] _inputBuffer>
	//   65  111:astore_3        
					int j = _inputPtr + 1;
	//   66  112:aload_0         
	//   67  113:getfield        #71  <Field int _inputPtr>
	//   68  116:iconst_1        
	//   69  117:iadd            
	//   70  118:istore_1        
					_inputPtr = j;
	//   71  119:aload_0         
	//   72  120:iload_1         
	//   73  121:putfield        #71  <Field int _inputPtr>
					j = ((int) (abyte1[j]));
	//   74  124:aload_3         
	//   75  125:iload_1         
	//   76  126:baload          
	//   77  127:istore_1        
					if(j > 32)
	//*  78  128:iload_1         
	//*  79  129:bipush          32
	//*  80  131:icmple          167
						if(j != 47 && j != 35)
	//*  81  134:iload_1         
	//*  82  135:bipush          47
	//*  83  137:icmpeq          161
	//*  84  140:iload_1         
	//*  85  141:bipush          35
	//*  86  143:icmpne          149
	//*  87  146:goto            161
						{
							_inputPtr = _inputPtr + 1;
	//   88  149:aload_0         
	//   89  150:aload_0         
	//   90  151:getfield        #71  <Field int _inputPtr>
	//   91  154:iconst_1        
	//   92  155:iadd            
	//   93  156:putfield        #71  <Field int _inputPtr>
							return j;
	//   94  159:iload_1         
	//   95  160:ireturn         
						} else
						{
							return _skipColon2(true);
	//   96  161:aload_0         
	//   97  162:iconst_1        
	//   98  163:invokespecial   #343 <Method int _skipColon2(boolean)>
	//   99  166:ireturn         
						}
				}
				return _skipColon2(true);
	//  100  167:aload_0         
	//  101  168:iconst_1        
	//  102  169:invokespecial   #343 <Method int _skipColon2(boolean)>
	//  103  172:ireturn         
			}
			if(byte0 != 32)
	//* 104  173:iload_2         
	//* 105  174:bipush          32
	//* 106  176:icmpeq          187
			{
				k = ((int) (byte0));
	//  107  179:iload_2         
	//  108  180:istore_1        
				if(byte0 != 9)
					break label0;
	//  109  181:iload_2         
	//  110  182:bipush          9
	//  111  184:icmpne          208
			}
			byte abyte2[] = _inputBuffer;
	//  112  187:aload_0         
	//  113  188:getfield        #68  <Field byte[] _inputBuffer>
	//  114  191:astore_3        
			k = _inputPtr + 1;
	//  115  192:aload_0         
	//  116  193:getfield        #71  <Field int _inputPtr>
	//  117  196:iconst_1        
	//  118  197:iadd            
	//  119  198:istore_1        
			_inputPtr = k;
	//  120  199:aload_0         
	//  121  200:iload_1         
	//  122  201:putfield        #71  <Field int _inputPtr>
			k = ((int) (abyte2[k]));
	//  123  204:aload_3         
	//  124  205:iload_1         
	//  125  206:baload          
	//  126  207:istore_1        
		}
		if(k == 58)
	//* 127  208:iload_1         
	//* 128  209:bipush          58
	//* 129  211:icmpne          352
		{
			byte abyte3[] = _inputBuffer;
	//  130  214:aload_0         
	//  131  215:getfield        #68  <Field byte[] _inputBuffer>
	//  132  218:astore_3        
			int l = _inputPtr + 1;
	//  133  219:aload_0         
	//  134  220:getfield        #71  <Field int _inputPtr>
	//  135  223:iconst_1        
	//  136  224:iadd            
	//  137  225:istore_1        
			_inputPtr = l;
	//  138  226:aload_0         
	//  139  227:iload_1         
	//  140  228:putfield        #71  <Field int _inputPtr>
			l = ((int) (abyte3[l]));
	//  141  231:aload_3         
	//  142  232:iload_1         
	//  143  233:baload          
	//  144  234:istore_1        
			if(l > 32)
	//* 145  235:iload_1         
	//* 146  236:bipush          32
	//* 147  238:icmple          274
				if(l != 47 && l != 35)
	//* 148  241:iload_1         
	//* 149  242:bipush          47
	//* 150  244:icmpeq          268
	//* 151  247:iload_1         
	//* 152  248:bipush          35
	//* 153  250:icmpne          256
	//* 154  253:goto            268
				{
					_inputPtr = _inputPtr + 1;
	//  155  256:aload_0         
	//  156  257:aload_0         
	//  157  258:getfield        #71  <Field int _inputPtr>
	//  158  261:iconst_1        
	//  159  262:iadd            
	//  160  263:putfield        #71  <Field int _inputPtr>
					return l;
	//  161  266:iload_1         
	//  162  267:ireturn         
				} else
				{
					return _skipColon2(true);
	//  163  268:aload_0         
	//  164  269:iconst_1        
	//  165  270:invokespecial   #343 <Method int _skipColon2(boolean)>
	//  166  273:ireturn         
				}
			if(l == 32 || l == 9)
	//* 167  274:iload_1         
	//* 168  275:bipush          32
	//* 169  277:icmpeq          286
	//* 170  280:iload_1         
	//* 171  281:bipush          9
	//* 172  283:icmpne          346
			{
				byte abyte4[] = _inputBuffer;
	//  173  286:aload_0         
	//  174  287:getfield        #68  <Field byte[] _inputBuffer>
	//  175  290:astore_3        
				int i1 = _inputPtr + 1;
	//  176  291:aload_0         
	//  177  292:getfield        #71  <Field int _inputPtr>
	//  178  295:iconst_1        
	//  179  296:iadd            
	//  180  297:istore_1        
				_inputPtr = i1;
	//  181  298:aload_0         
	//  182  299:iload_1         
	//  183  300:putfield        #71  <Field int _inputPtr>
				i1 = ((int) (abyte4[i1]));
	//  184  303:aload_3         
	//  185  304:iload_1         
	//  186  305:baload          
	//  187  306:istore_1        
				if(i1 > 32)
	//* 188  307:iload_1         
	//* 189  308:bipush          32
	//* 190  310:icmple          346
					if(i1 != 47 && i1 != 35)
	//* 191  313:iload_1         
	//* 192  314:bipush          47
	//* 193  316:icmpeq          340
	//* 194  319:iload_1         
	//* 195  320:bipush          35
	//* 196  322:icmpne          328
	//* 197  325:goto            340
					{
						_inputPtr = _inputPtr + 1;
	//  198  328:aload_0         
	//  199  329:aload_0         
	//  200  330:getfield        #71  <Field int _inputPtr>
	//  201  333:iconst_1        
	//  202  334:iadd            
	//  203  335:putfield        #71  <Field int _inputPtr>
						return i1;
	//  204  338:iload_1         
	//  205  339:ireturn         
					} else
					{
						return _skipColon2(true);
	//  206  340:aload_0         
	//  207  341:iconst_1        
	//  208  342:invokespecial   #343 <Method int _skipColon2(boolean)>
	//  209  345:ireturn         
					}
			}
			return _skipColon2(true);
	//  210  346:aload_0         
	//  211  347:iconst_1        
	//  212  348:invokespecial   #343 <Method int _skipColon2(boolean)>
	//  213  351:ireturn         
		} else
		{
			return _skipColon2(false);
	//  214  352:aload_0         
	//  215  353:iconst_0        
	//  216  354:invokespecial   #343 <Method int _skipColon2(boolean)>
	//  217  357:ireturn         
		}
	}

	private final int _skipColon2(boolean flag)
		throws IOException
	{
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #74  <Field int _inputEnd>
	//*   4    8:icmplt          68
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #219 <Method boolean _loadMore()>
	//*   7   15:ifeq            21
	//*   8   18:goto            68
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    9   21:new             #345 <Class StringBuilder>
	//   10   24:dup             
	//   11   25:invokespecial   #347 <Method void StringBuilder()>
	//   12   28:astore_3        
				stringbuilder.append(" within/between ");
	//   13   29:aload_3         
	//   14   30:ldc2            #349 <String " within/between ">
	//   15   33:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   16   36:pop             
				stringbuilder.append(_parsingContext.typeDesc());
	//   17   37:aload_3         
	//   18   38:aload_0         
	//   19   39:getfield        #118 <Field JsonReadContext _parsingContext>
	//   20   42:invokevirtual   #357 <Method String JsonReadContext.typeDesc()>
	//   21   45:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:pop             
				stringbuilder.append(" entries");
	//   23   49:aload_3         
	//   24   50:ldc2            #359 <String " entries">
	//   25   53:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   26   56:pop             
				_reportInvalidEOF(stringbuilder.toString(), ((JsonToken) (null)));
	//   27   57:aload_0         
	//   28   58:aload_3         
	//   29   59:invokevirtual   #362 <Method String StringBuilder.toString()>
	//   30   62:aconst_null     
	//   31   63:invokevirtual   #332 <Method void _reportInvalidEOF(String, JsonToken)>
				return -1;
	//   32   66:iconst_m1       
	//   33   67:ireturn         
			}
			byte abyte0[] = _inputBuffer;
	//   34   68:aload_0         
	//   35   69:getfield        #68  <Field byte[] _inputBuffer>
	//   36   72:astore_3        
			int i = _inputPtr;
	//   37   73:aload_0         
	//   38   74:getfield        #71  <Field int _inputPtr>
	//   39   77:istore_2        
			_inputPtr = i + 1;
	//   40   78:aload_0         
	//   41   79:iload_2         
	//   42   80:iconst_1        
	//   43   81:iadd            
	//   44   82:putfield        #71  <Field int _inputPtr>
			i = abyte0[i] & 0xff;
	//   45   85:aload_3         
	//   46   86:iload_2         
	//   47   87:baload          
	//   48   88:sipush          255
	//   49   91:iand            
	//   50   92:istore_2        
			if(i > 32)
	//*  51   93:iload_2         
	//*  52   94:bipush          32
	//*  53   96:icmple          153
			{
				if(i == 47)
	//*  54   99:iload_2         
	//*  55  100:bipush          47
	//*  56  102:icmpne          112
					_skipComment();
	//   57  105:aload_0         
	//   58  106:invokespecial   #365 <Method void _skipComment()>
				else
	//*  59  109:goto            0
				if(i != 35 || !_skipYAMLComment())
	//*  60  112:iload_2         
	//*  61  113:bipush          35
	//*  62  115:icmpne          128
	//*  63  118:aload_0         
	//*  64  119:invokespecial   #368 <Method boolean _skipYAMLComment()>
	//*  65  122:ifeq            128
	//*  66  125:goto            0
				{
					if(flag)
	//*  67  128:iload_1         
	//*  68  129:ifeq            134
						return i;
	//   69  132:iload_2         
	//   70  133:ireturn         
					if(i != 58)
	//*  71  134:iload_2         
	//*  72  135:bipush          58
	//*  73  137:icmpeq          148
						_reportUnexpectedChar(i, "was expecting a colon to separate field name and value");
	//   74  140:aload_0         
	//   75  141:iload_2         
	//   76  142:ldc2            #370 <String "was expecting a colon to separate field name and value">
	//   77  145:invokevirtual   #373 <Method void _reportUnexpectedChar(int, String)>
					flag = true;
	//   78  148:iconst_1        
	//   79  149:istore_1        
				}
			} else
	//*  80  150:goto            0
			if(i != 32)
	//*  81  153:iload_2         
	//*  82  154:bipush          32
	//*  83  156:icmpeq          0
				if(i == 10)
	//*  84  159:iload_2         
	//*  85  160:bipush          10
	//*  86  162:icmpne          186
				{
					_currInputRow = _currInputRow + 1;
	//   87  165:aload_0         
	//   88  166:aload_0         
	//   89  167:getfield        #338 <Field int _currInputRow>
	//   90  170:iconst_1        
	//   91  171:iadd            
	//   92  172:putfield        #338 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   93  175:aload_0         
	//   94  176:aload_0         
	//   95  177:getfield        #71  <Field int _inputPtr>
	//   96  180:putfield        #77  <Field int _currInputRowStart>
				} else
	//*  97  183:goto            0
				if(i == 13)
	//*  98  186:iload_2         
	//*  99  187:bipush          13
	//* 100  189:icmpne          199
					_skipCR();
	//  101  192:aload_0         
	//  102  193:invokevirtual   #335 <Method void _skipCR()>
				else
	//* 103  196:goto            0
				if(i != 9)
	//* 104  199:iload_2         
	//* 105  200:bipush          9
	//* 106  202:icmpeq          0
					_throwInvalidSpace(i);
	//  107  205:aload_0         
	//  108  206:iload_2         
	//  109  207:invokevirtual   #376 <Method void _throwInvalidSpace(int)>
		} while(true);
	//  110  210:goto            0
	}

	private final void _skipComment()
		throws IOException
	{
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #379 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_COMMENTS>
	//*   2    4:invokevirtual   #383 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   3    7:ifne            19
			_reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
	//    4   10:aload_0         
	//    5   11:bipush          47
	//    6   13:ldc2            #385 <String "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)">
	//    7   16:invokevirtual   #373 <Method void _reportUnexpectedChar(int, String)>
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   8   19:aload_0         
	//*   9   20:getfield        #71  <Field int _inputPtr>
	//*  10   23:aload_0         
	//*  11   24:getfield        #74  <Field int _inputEnd>
	//*  12   27:icmplt          45
	//*  13   30:aload_0         
	//*  14   31:invokevirtual   #219 <Method boolean _loadMore()>
	//*  15   34:ifne            45
			_reportInvalidEOF(" in a comment", ((JsonToken) (null)));
	//   16   37:aload_0         
	//   17   38:ldc2            #328 <String " in a comment">
	//   18   41:aconst_null     
	//   19   42:invokevirtual   #332 <Method void _reportInvalidEOF(String, JsonToken)>
		byte abyte0[] = _inputBuffer;
	//   20   45:aload_0         
	//   21   46:getfield        #68  <Field byte[] _inputBuffer>
	//   22   49:astore_2        
		int i = _inputPtr;
	//   23   50:aload_0         
	//   24   51:getfield        #71  <Field int _inputPtr>
	//   25   54:istore_1        
		_inputPtr = i + 1;
	//   26   55:aload_0         
	//   27   56:iload_1         
	//   28   57:iconst_1        
	//   29   58:iadd            
	//   30   59:putfield        #71  <Field int _inputPtr>
		i = abyte0[i] & 0xff;
	//   31   62:aload_2         
	//   32   63:iload_1         
	//   33   64:baload          
	//   34   65:sipush          255
	//   35   68:iand            
	//   36   69:istore_1        
		if(i == 47)
	//*  37   70:iload_1         
	//*  38   71:bipush          47
	//*  39   73:icmpne          81
		{
			_skipLine();
	//   40   76:aload_0         
	//   41   77:invokespecial   #388 <Method void _skipLine()>
			return;
	//   42   80:return          
		}
		if(i == 42)
	//*  43   81:iload_1         
	//*  44   82:bipush          42
	//*  45   84:icmpne          92
		{
			_skipCComment();
	//   46   87:aload_0         
	//   47   88:invokespecial   #390 <Method void _skipCComment()>
			return;
	//   48   91:return          
		} else
		{
			_reportUnexpectedChar(i, "was expecting either '*' or '/' for a comment");
	//   49   92:aload_0         
	//   50   93:iload_1         
	//   51   94:ldc2            #392 <String "was expecting either '*' or '/' for a comment">
	//   52   97:invokevirtual   #373 <Method void _reportUnexpectedChar(int, String)>
			return;
	//   53  100:return          
		}
	}

	private final void _skipLine()
		throws IOException
	{
		int ai[] = CharTypes.getInputCodeComment();
	//    0    0:invokestatic    #317 <Method int[] CharTypes.getInputCodeComment()>
	//    1    3:astore_3        
label0:
		do
			do
			{
				int i;
				int j;
				do
				{
					if(_inputPtr >= _inputEnd && !_loadMore())
	//*   2    4:aload_0         
	//*   3    5:getfield        #71  <Field int _inputPtr>
	//*   4    8:aload_0         
	//*   5    9:getfield        #74  <Field int _inputEnd>
	//*   6   12:icmplt          26
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #219 <Method boolean _loadMore()>
	//*   9   19:ifeq            25
	//*  10   22:goto            26
						return;
	//   11   25:return          
					byte abyte0[] = _inputBuffer;
	//   12   26:aload_0         
	//   13   27:getfield        #68  <Field byte[] _inputBuffer>
	//   14   30:astore          4
					i = _inputPtr;
	//   15   32:aload_0         
	//   16   33:getfield        #71  <Field int _inputPtr>
	//   17   36:istore_1        
					_inputPtr = i + 1;
	//   18   37:aload_0         
	//   19   38:iload_1         
	//   20   39:iconst_1        
	//   21   40:iadd            
	//   22   41:putfield        #71  <Field int _inputPtr>
					i = abyte0[i] & 0xff;
	//   23   44:aload           4
	//   24   46:iload_1         
	//   25   47:baload          
	//   26   48:sipush          255
	//   27   51:iand            
	//   28   52:istore_1        
					j = ai[i];
	//   29   53:aload_3         
	//   30   54:iload_1         
	//   31   55:iaload          
	//   32   56:istore_2        
				} while(j == 0);
	//   33   57:iload_2         
	//   34   58:ifeq            4
				if(j != 10)
	//*  35   61:iload_2         
	//*  36   62:bipush          10
	//*  37   64:icmpeq          147
				{
					if(j != 13)
	//*  38   67:iload_2         
	//*  39   68:bipush          13
	//*  40   70:icmpeq          142
					{
						if(j != 42)
	//*  41   73:iload_2         
	//*  42   74:bipush          42
	//*  43   76:icmpeq          4
						{
							switch(j)
	//*  44   79:iload_2         
							{
	//*  45   80:tableswitch     2 4: default 108
	//	               2 135
	//	               3 128
	//	               4 120
							default:
								if(j < 0)
	//*  46  108:iload_2         
	//*  47  109:ifge            4
									_reportInvalidChar(i);
	//   48  112:aload_0         
	//   49  113:iload_1         
	//   50  114:invokevirtual   #211 <Method void _reportInvalidChar(int)>
								break;

	//*  51  117:goto            4
							case 4: // '\004'
								_skipUtf8_4(i);
	//   52  120:aload_0         
	//   53  121:iload_1         
	//   54  122:invokespecial   #320 <Method void _skipUtf8_4(int)>
								break;

	//*  55  125:goto            4
							case 3: // '\003'
								_skipUtf8_3();
	//   56  128:aload_0         
	//   57  129:invokespecial   #323 <Method void _skipUtf8_3()>
								break;

	//*  58  132:goto            4
							case 2: // '\002'
								_skipUtf8_2();
	//   59  135:aload_0         
	//   60  136:invokespecial   #326 <Method void _skipUtf8_2()>
								break;
							}
							continue label0;
	//   61  139:goto            4
						}
					} else
					{
						_skipCR();
	//   62  142:aload_0         
	//   63  143:invokevirtual   #335 <Method void _skipCR()>
						return;
	//   64  146:return          
					}
				} else
				{
					_currInputRow = _currInputRow + 1;
	//   65  147:aload_0         
	//   66  148:aload_0         
	//   67  149:getfield        #338 <Field int _currInputRow>
	//   68  152:iconst_1        
	//   69  153:iadd            
	//   70  154:putfield        #338 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   71  157:aload_0         
	//   72  158:aload_0         
	//   73  159:getfield        #71  <Field int _inputPtr>
	//   74  162:putfield        #77  <Field int _currInputRowStart>
					return;
	//   75  165:return          
				}
			} while(true);
		while(true);
	}

	private final void _skipUtf8_2()
		throws IOException
	{
		if(_inputPtr >= _inputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #74  <Field int _inputEnd>
	//*   4    8:icmplt          15
			_loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
		byte abyte0[] = _inputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #68  <Field byte[] _inputBuffer>
	//    9   19:astore_2        
		int i = _inputPtr;
	//   10   20:aload_0         
	//   11   21:getfield        #71  <Field int _inputPtr>
	//   12   24:istore_1        
		_inputPtr = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #71  <Field int _inputPtr>
		i = ((int) (abyte0[i]));
	//   18   32:aload_2         
	//   19   33:iload_1         
	//   20   34:baload          
	//   21   35:istore_1        
		if((i & 0xc0) != 128)
	//*  22   36:iload_1         
	//*  23   37:sipush          192
	//*  24   40:iand            
	//*  25   41:sipush          128
	//*  26   44:icmpeq          60
			_reportInvalidOther(i & 0xff, _inputPtr);
	//   27   47:aload_0         
	//   28   48:iload_1         
	//   29   49:sipush          255
	//   30   52:iand            
	//   31   53:aload_0         
	//   32   54:getfield        #71  <Field int _inputPtr>
	//   33   57:invokevirtual   #162 <Method void _reportInvalidOther(int, int)>
	//   34   60:return          
	}

	private final void _skipUtf8_3()
		throws IOException
	{
		if(_inputPtr >= _inputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #74  <Field int _inputEnd>
	//*   4    8:icmplt          15
			_loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
		byte abyte0[] = _inputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #68  <Field byte[] _inputBuffer>
	//    9   19:astore_2        
		int i = _inputPtr;
	//   10   20:aload_0         
	//   11   21:getfield        #71  <Field int _inputPtr>
	//   12   24:istore_1        
		_inputPtr = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #71  <Field int _inputPtr>
		i = ((int) (abyte0[i]));
	//   18   32:aload_2         
	//   19   33:iload_1         
	//   20   34:baload          
	//   21   35:istore_1        
		if((i & 0xc0) != 128)
	//*  22   36:iload_1         
	//*  23   37:sipush          192
	//*  24   40:iand            
	//*  25   41:sipush          128
	//*  26   44:icmpeq          60
			_reportInvalidOther(i & 0xff, _inputPtr);
	//   27   47:aload_0         
	//   28   48:iload_1         
	//   29   49:sipush          255
	//   30   52:iand            
	//   31   53:aload_0         
	//   32   54:getfield        #71  <Field int _inputPtr>
	//   33   57:invokevirtual   #162 <Method void _reportInvalidOther(int, int)>
		if(_inputPtr >= _inputEnd)
	//*  34   60:aload_0         
	//*  35   61:getfield        #71  <Field int _inputPtr>
	//*  36   64:aload_0         
	//*  37   65:getfield        #74  <Field int _inputEnd>
	//*  38   68:icmplt          75
			_loadMoreGuaranteed();
	//   39   71:aload_0         
	//   40   72:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
		abyte0 = _inputBuffer;
	//   41   75:aload_0         
	//   42   76:getfield        #68  <Field byte[] _inputBuffer>
	//   43   79:astore_2        
		i = _inputPtr;
	//   44   80:aload_0         
	//   45   81:getfield        #71  <Field int _inputPtr>
	//   46   84:istore_1        
		_inputPtr = i + 1;
	//   47   85:aload_0         
	//   48   86:iload_1         
	//   49   87:iconst_1        
	//   50   88:iadd            
	//   51   89:putfield        #71  <Field int _inputPtr>
		i = ((int) (abyte0[i]));
	//   52   92:aload_2         
	//   53   93:iload_1         
	//   54   94:baload          
	//   55   95:istore_1        
		if((i & 0xc0) != 128)
	//*  56   96:iload_1         
	//*  57   97:sipush          192
	//*  58  100:iand            
	//*  59  101:sipush          128
	//*  60  104:icmpeq          120
			_reportInvalidOther(i & 0xff, _inputPtr);
	//   61  107:aload_0         
	//   62  108:iload_1         
	//   63  109:sipush          255
	//   64  112:iand            
	//   65  113:aload_0         
	//   66  114:getfield        #71  <Field int _inputPtr>
	//   67  117:invokevirtual   #162 <Method void _reportInvalidOther(int, int)>
	//   68  120:return          
	}

	private final void _skipUtf8_4(int i)
		throws IOException
	{
		if(_inputPtr >= _inputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #74  <Field int _inputEnd>
	//*   4    8:icmplt          15
			_loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
		byte abyte0[] = _inputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #68  <Field byte[] _inputBuffer>
	//    9   19:astore_2        
		i = _inputPtr;
	//   10   20:aload_0         
	//   11   21:getfield        #71  <Field int _inputPtr>
	//   12   24:istore_1        
		_inputPtr = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #71  <Field int _inputPtr>
		i = ((int) (abyte0[i]));
	//   18   32:aload_2         
	//   19   33:iload_1         
	//   20   34:baload          
	//   21   35:istore_1        
		if((i & 0xc0) != 128)
	//*  22   36:iload_1         
	//*  23   37:sipush          192
	//*  24   40:iand            
	//*  25   41:sipush          128
	//*  26   44:icmpeq          60
			_reportInvalidOther(i & 0xff, _inputPtr);
	//   27   47:aload_0         
	//   28   48:iload_1         
	//   29   49:sipush          255
	//   30   52:iand            
	//   31   53:aload_0         
	//   32   54:getfield        #71  <Field int _inputPtr>
	//   33   57:invokevirtual   #162 <Method void _reportInvalidOther(int, int)>
		if(_inputPtr >= _inputEnd)
	//*  34   60:aload_0         
	//*  35   61:getfield        #71  <Field int _inputPtr>
	//*  36   64:aload_0         
	//*  37   65:getfield        #74  <Field int _inputEnd>
	//*  38   68:icmplt          75
			_loadMoreGuaranteed();
	//   39   71:aload_0         
	//   40   72:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
		abyte0 = _inputBuffer;
	//   41   75:aload_0         
	//   42   76:getfield        #68  <Field byte[] _inputBuffer>
	//   43   79:astore_2        
		i = _inputPtr;
	//   44   80:aload_0         
	//   45   81:getfield        #71  <Field int _inputPtr>
	//   46   84:istore_1        
		_inputPtr = i + 1;
	//   47   85:aload_0         
	//   48   86:iload_1         
	//   49   87:iconst_1        
	//   50   88:iadd            
	//   51   89:putfield        #71  <Field int _inputPtr>
		i = ((int) (abyte0[i]));
	//   52   92:aload_2         
	//   53   93:iload_1         
	//   54   94:baload          
	//   55   95:istore_1        
		if((i & 0xc0) != 128)
	//*  56   96:iload_1         
	//*  57   97:sipush          192
	//*  58  100:iand            
	//*  59  101:sipush          128
	//*  60  104:icmpeq          120
			_reportInvalidOther(i & 0xff, _inputPtr);
	//   61  107:aload_0         
	//   62  108:iload_1         
	//   63  109:sipush          255
	//   64  112:iand            
	//   65  113:aload_0         
	//   66  114:getfield        #71  <Field int _inputPtr>
	//   67  117:invokevirtual   #162 <Method void _reportInvalidOther(int, int)>
		if(_inputPtr >= _inputEnd)
	//*  68  120:aload_0         
	//*  69  121:getfield        #71  <Field int _inputPtr>
	//*  70  124:aload_0         
	//*  71  125:getfield        #74  <Field int _inputEnd>
	//*  72  128:icmplt          135
			_loadMoreGuaranteed();
	//   73  131:aload_0         
	//   74  132:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
		abyte0 = _inputBuffer;
	//   75  135:aload_0         
	//   76  136:getfield        #68  <Field byte[] _inputBuffer>
	//   77  139:astore_2        
		i = _inputPtr;
	//   78  140:aload_0         
	//   79  141:getfield        #71  <Field int _inputPtr>
	//   80  144:istore_1        
		_inputPtr = i + 1;
	//   81  145:aload_0         
	//   82  146:iload_1         
	//   83  147:iconst_1        
	//   84  148:iadd            
	//   85  149:putfield        #71  <Field int _inputPtr>
		i = ((int) (abyte0[i]));
	//   86  152:aload_2         
	//   87  153:iload_1         
	//   88  154:baload          
	//   89  155:istore_1        
		if((i & 0xc0) != 128)
	//*  90  156:iload_1         
	//*  91  157:sipush          192
	//*  92  160:iand            
	//*  93  161:sipush          128
	//*  94  164:icmpeq          180
			_reportInvalidOther(i & 0xff, _inputPtr);
	//   95  167:aload_0         
	//   96  168:iload_1         
	//   97  169:sipush          255
	//   98  172:iand            
	//   99  173:aload_0         
	//  100  174:getfield        #71  <Field int _inputPtr>
	//  101  177:invokevirtual   #162 <Method void _reportInvalidOther(int, int)>
	//  102  180:return          
	}

	private final int _skipWS()
		throws IOException
	{
		do
		{
			if(_inputPtr >= _inputEnd)
				break;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int _inputPtr>
	//    2    4:aload_0         
	//    3    5:getfield        #74  <Field int _inputEnd>
	//    4    8:icmpge          134
			byte abyte0[] = _inputBuffer;
	//    5   11:aload_0         
	//    6   12:getfield        #68  <Field byte[] _inputBuffer>
	//    7   15:astore_2        
			int i = _inputPtr;
	//    8   16:aload_0         
	//    9   17:getfield        #71  <Field int _inputPtr>
	//   10   20:istore_1        
			_inputPtr = i + 1;
	//   11   21:aload_0         
	//   12   22:iload_1         
	//   13   23:iconst_1        
	//   14   24:iadd            
	//   15   25:putfield        #71  <Field int _inputPtr>
			i = abyte0[i] & 0xff;
	//   16   28:aload_2         
	//   17   29:iload_1         
	//   18   30:baload          
	//   19   31:sipush          255
	//   20   34:iand            
	//   21   35:istore_1        
			if(i > 32)
	//*  22   36:iload_1         
	//*  23   37:bipush          32
	//*  24   39:icmple          74
				if(i != 47 && i != 35)
	//*  25   42:iload_1         
	//*  26   43:bipush          47
	//*  27   45:icmpeq          59
	//*  28   48:iload_1         
	//*  29   49:bipush          35
	//*  30   51:icmpne          57
	//*  31   54:goto            59
				{
					return i;
	//   32   57:iload_1         
	//   33   58:ireturn         
				} else
				{
					_inputPtr = _inputPtr - 1;
	//   34   59:aload_0         
	//   35   60:aload_0         
	//   36   61:getfield        #71  <Field int _inputPtr>
	//   37   64:iconst_1        
	//   38   65:isub            
	//   39   66:putfield        #71  <Field int _inputPtr>
					return _skipWS2();
	//   40   69:aload_0         
	//   41   70:invokespecial   #396 <Method int _skipWS2()>
	//   42   73:ireturn         
				}
			if(i != 32)
	//*  43   74:iload_1         
	//*  44   75:bipush          32
	//*  45   77:icmpeq          0
				if(i == 10)
	//*  46   80:iload_1         
	//*  47   81:bipush          10
	//*  48   83:icmpne          107
				{
					_currInputRow = _currInputRow + 1;
	//   49   86:aload_0         
	//   50   87:aload_0         
	//   51   88:getfield        #338 <Field int _currInputRow>
	//   52   91:iconst_1        
	//   53   92:iadd            
	//   54   93:putfield        #338 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   55   96:aload_0         
	//   56   97:aload_0         
	//   57   98:getfield        #71  <Field int _inputPtr>
	//   58  101:putfield        #77  <Field int _currInputRowStart>
				} else
	//*  59  104:goto            0
				if(i == 13)
	//*  60  107:iload_1         
	//*  61  108:bipush          13
	//*  62  110:icmpne          120
					_skipCR();
	//   63  113:aload_0         
	//   64  114:invokevirtual   #335 <Method void _skipCR()>
				else
	//*  65  117:goto            0
				if(i != 9)
	//*  66  120:iload_1         
	//*  67  121:bipush          9
	//*  68  123:icmpeq          0
					_throwInvalidSpace(i);
	//   69  126:aload_0         
	//   70  127:iload_1         
	//   71  128:invokevirtual   #376 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   72  131:goto            0
		return _skipWS2();
	//   73  134:aload_0         
	//   74  135:invokespecial   #396 <Method int _skipWS2()>
	//   75  138:ireturn         
	}

	private final int _skipWS2()
		throws IOException
	{
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #74  <Field int _inputEnd>
	//*   4    8:icmplt          66
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #219 <Method boolean _loadMore()>
	//*   7   15:ifeq            21
	//*   8   18:goto            66
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    9   21:new             #345 <Class StringBuilder>
	//   10   24:dup             
	//   11   25:invokespecial   #347 <Method void StringBuilder()>
	//   12   28:astore_2        
				stringbuilder.append("Unexpected end-of-input within/between ");
	//   13   29:aload_2         
	//   14   30:ldc2            #398 <String "Unexpected end-of-input within/between ">
	//   15   33:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   16   36:pop             
				stringbuilder.append(_parsingContext.typeDesc());
	//   17   37:aload_2         
	//   18   38:aload_0         
	//   19   39:getfield        #118 <Field JsonReadContext _parsingContext>
	//   20   42:invokevirtual   #357 <Method String JsonReadContext.typeDesc()>
	//   21   45:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:pop             
				stringbuilder.append(" entries");
	//   23   49:aload_2         
	//   24   50:ldc2            #359 <String " entries">
	//   25   53:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   26   56:pop             
				throw _constructError(stringbuilder.toString());
	//   27   57:aload_0         
	//   28   58:aload_2         
	//   29   59:invokevirtual   #362 <Method String StringBuilder.toString()>
	//   30   62:invokevirtual   #402 <Method JsonParseException _constructError(String)>
	//   31   65:athrow          
			}
			byte abyte0[] = _inputBuffer;
	//   32   66:aload_0         
	//   33   67:getfield        #68  <Field byte[] _inputBuffer>
	//   34   70:astore_2        
			int i = _inputPtr;
	//   35   71:aload_0         
	//   36   72:getfield        #71  <Field int _inputPtr>
	//   37   75:istore_1        
			_inputPtr = i + 1;
	//   38   76:aload_0         
	//   39   77:iload_1         
	//   40   78:iconst_1        
	//   41   79:iadd            
	//   42   80:putfield        #71  <Field int _inputPtr>
			i = abyte0[i] & 0xff;
	//   43   83:aload_2         
	//   44   84:iload_1         
	//   45   85:baload          
	//   46   86:sipush          255
	//   47   89:iand            
	//   48   90:istore_1        
			if(i > 32)
	//*  49   91:iload_1         
	//*  50   92:bipush          32
	//*  51   94:icmple          128
			{
				if(i == 47)
	//*  52   97:iload_1         
	//*  53   98:bipush          47
	//*  54  100:icmpne          110
					_skipComment();
	//   55  103:aload_0         
	//   56  104:invokespecial   #365 <Method void _skipComment()>
				else
	//*  57  107:goto            0
				if(i != 35 || !_skipYAMLComment())
	//*  58  110:iload_1         
	//*  59  111:bipush          35
	//*  60  113:icmpne          126
	//*  61  116:aload_0         
	//*  62  117:invokespecial   #368 <Method boolean _skipYAMLComment()>
	//*  63  120:ifeq            126
	//*  64  123:goto            0
					return i;
	//   65  126:iload_1         
	//   66  127:ireturn         
			} else
			if(i != 32)
	//*  67  128:iload_1         
	//*  68  129:bipush          32
	//*  69  131:icmpeq          0
				if(i == 10)
	//*  70  134:iload_1         
	//*  71  135:bipush          10
	//*  72  137:icmpne          161
				{
					_currInputRow = _currInputRow + 1;
	//   73  140:aload_0         
	//   74  141:aload_0         
	//   75  142:getfield        #338 <Field int _currInputRow>
	//   76  145:iconst_1        
	//   77  146:iadd            
	//   78  147:putfield        #338 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   79  150:aload_0         
	//   80  151:aload_0         
	//   81  152:getfield        #71  <Field int _inputPtr>
	//   82  155:putfield        #77  <Field int _currInputRowStart>
				} else
	//*  83  158:goto            0
				if(i == 13)
	//*  84  161:iload_1         
	//*  85  162:bipush          13
	//*  86  164:icmpne          174
					_skipCR();
	//   87  167:aload_0         
	//   88  168:invokevirtual   #335 <Method void _skipCR()>
				else
	//*  89  171:goto            0
				if(i != 9)
	//*  90  174:iload_1         
	//*  91  175:bipush          9
	//*  92  177:icmpeq          0
					_throwInvalidSpace(i);
	//   93  180:aload_0         
	//   94  181:iload_1         
	//   95  182:invokevirtual   #376 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   96  185:goto            0
	}

	private final int _skipWSOrEnd()
		throws IOException
	{
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #74  <Field int _inputEnd>
	//*   4    8:icmplt          23
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #219 <Method boolean _loadMore()>
	//*   7   15:ifne            23
			return _eofAsNextChar();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #406 <Method int _eofAsNextChar()>
	//   10   22:ireturn         
		byte abyte0[] = _inputBuffer;
	//   11   23:aload_0         
	//   12   24:getfield        #68  <Field byte[] _inputBuffer>
	//   13   27:astore_2        
		int i = _inputPtr;
	//   14   28:aload_0         
	//   15   29:getfield        #71  <Field int _inputPtr>
	//   16   32:istore_1        
		_inputPtr = i + 1;
	//   17   33:aload_0         
	//   18   34:iload_1         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:putfield        #71  <Field int _inputPtr>
		i = abyte0[i] & 0xff;
	//   22   40:aload_2         
	//   23   41:iload_1         
	//   24   42:baload          
	//   25   43:sipush          255
	//   26   46:iand            
	//   27   47:istore_1        
		if(i > 32)
	//*  28   48:iload_1         
	//*  29   49:bipush          32
	//*  30   51:icmple          86
			if(i != 47 && i != 35)
	//*  31   54:iload_1         
	//*  32   55:bipush          47
	//*  33   57:icmpeq          71
	//*  34   60:iload_1         
	//*  35   61:bipush          35
	//*  36   63:icmpne          69
	//*  37   66:goto            71
			{
				return i;
	//   38   69:iload_1         
	//   39   70:ireturn         
			} else
			{
				_inputPtr = _inputPtr - 1;
	//   40   71:aload_0         
	//   41   72:aload_0         
	//   42   73:getfield        #71  <Field int _inputPtr>
	//   43   76:iconst_1        
	//   44   77:isub            
	//   45   78:putfield        #71  <Field int _inputPtr>
				return _skipWSOrEnd2();
	//   46   81:aload_0         
	//   47   82:invokespecial   #409 <Method int _skipWSOrEnd2()>
	//   48   85:ireturn         
			}
		if(i != 32)
	//*  49   86:iload_1         
	//*  50   87:bipush          32
	//*  51   89:icmpeq          143
			if(i == 10)
	//*  52   92:iload_1         
	//*  53   93:bipush          10
	//*  54   95:icmpne          119
			{
				_currInputRow = _currInputRow + 1;
	//   55   98:aload_0         
	//   56   99:aload_0         
	//   57  100:getfield        #338 <Field int _currInputRow>
	//   58  103:iconst_1        
	//   59  104:iadd            
	//   60  105:putfield        #338 <Field int _currInputRow>
				_currInputRowStart = _inputPtr;
	//   61  108:aload_0         
	//   62  109:aload_0         
	//   63  110:getfield        #71  <Field int _inputPtr>
	//   64  113:putfield        #77  <Field int _currInputRowStart>
			} else
	//*  65  116:goto            143
			if(i == 13)
	//*  66  119:iload_1         
	//*  67  120:bipush          13
	//*  68  122:icmpne          132
				_skipCR();
	//   69  125:aload_0         
	//   70  126:invokevirtual   #335 <Method void _skipCR()>
			else
	//*  71  129:goto            143
			if(i != 9)
	//*  72  132:iload_1         
	//*  73  133:bipush          9
	//*  74  135:icmpeq          143
				_throwInvalidSpace(i);
	//   75  138:aload_0         
	//   76  139:iload_1         
	//   77  140:invokevirtual   #376 <Method void _throwInvalidSpace(int)>
		do
		{
			if(_inputPtr >= _inputEnd)
				break;
	//   78  143:aload_0         
	//   79  144:getfield        #71  <Field int _inputPtr>
	//   80  147:aload_0         
	//   81  148:getfield        #74  <Field int _inputEnd>
	//   82  151:icmpge          277
			byte abyte1[] = _inputBuffer;
	//   83  154:aload_0         
	//   84  155:getfield        #68  <Field byte[] _inputBuffer>
	//   85  158:astore_2        
			int j = _inputPtr;
	//   86  159:aload_0         
	//   87  160:getfield        #71  <Field int _inputPtr>
	//   88  163:istore_1        
			_inputPtr = j + 1;
	//   89  164:aload_0         
	//   90  165:iload_1         
	//   91  166:iconst_1        
	//   92  167:iadd            
	//   93  168:putfield        #71  <Field int _inputPtr>
			j = abyte1[j] & 0xff;
	//   94  171:aload_2         
	//   95  172:iload_1         
	//   96  173:baload          
	//   97  174:sipush          255
	//   98  177:iand            
	//   99  178:istore_1        
			if(j > 32)
	//* 100  179:iload_1         
	//* 101  180:bipush          32
	//* 102  182:icmple          217
				if(j != 47 && j != 35)
	//* 103  185:iload_1         
	//* 104  186:bipush          47
	//* 105  188:icmpeq          202
	//* 106  191:iload_1         
	//* 107  192:bipush          35
	//* 108  194:icmpne          200
	//* 109  197:goto            202
				{
					return j;
	//  110  200:iload_1         
	//  111  201:ireturn         
				} else
				{
					_inputPtr = _inputPtr - 1;
	//  112  202:aload_0         
	//  113  203:aload_0         
	//  114  204:getfield        #71  <Field int _inputPtr>
	//  115  207:iconst_1        
	//  116  208:isub            
	//  117  209:putfield        #71  <Field int _inputPtr>
					return _skipWSOrEnd2();
	//  118  212:aload_0         
	//  119  213:invokespecial   #409 <Method int _skipWSOrEnd2()>
	//  120  216:ireturn         
				}
			if(j != 32)
	//* 121  217:iload_1         
	//* 122  218:bipush          32
	//* 123  220:icmpeq          143
				if(j == 10)
	//* 124  223:iload_1         
	//* 125  224:bipush          10
	//* 126  226:icmpne          250
				{
					_currInputRow = _currInputRow + 1;
	//  127  229:aload_0         
	//  128  230:aload_0         
	//  129  231:getfield        #338 <Field int _currInputRow>
	//  130  234:iconst_1        
	//  131  235:iadd            
	//  132  236:putfield        #338 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//  133  239:aload_0         
	//  134  240:aload_0         
	//  135  241:getfield        #71  <Field int _inputPtr>
	//  136  244:putfield        #77  <Field int _currInputRowStart>
				} else
	//* 137  247:goto            143
				if(j == 13)
	//* 138  250:iload_1         
	//* 139  251:bipush          13
	//* 140  253:icmpne          263
					_skipCR();
	//  141  256:aload_0         
	//  142  257:invokevirtual   #335 <Method void _skipCR()>
				else
	//* 143  260:goto            143
				if(j != 9)
	//* 144  263:iload_1         
	//* 145  264:bipush          9
	//* 146  266:icmpeq          143
					_throwInvalidSpace(j);
	//  147  269:aload_0         
	//  148  270:iload_1         
	//  149  271:invokevirtual   #376 <Method void _throwInvalidSpace(int)>
		} while(true);
	//  150  274:goto            143
		return _skipWSOrEnd2();
	//  151  277:aload_0         
	//  152  278:invokespecial   #409 <Method int _skipWSOrEnd2()>
	//  153  281:ireturn         
	}

	private final int _skipWSOrEnd2()
		throws IOException
	{
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #74  <Field int _inputEnd>
	//*   4    8:icmplt          26
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #219 <Method boolean _loadMore()>
	//*   7   15:ifeq            21
	//*   8   18:goto            26
				return _eofAsNextChar();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #406 <Method int _eofAsNextChar()>
	//   11   25:ireturn         
			byte abyte0[] = _inputBuffer;
	//   12   26:aload_0         
	//   13   27:getfield        #68  <Field byte[] _inputBuffer>
	//   14   30:astore_2        
			int i = _inputPtr;
	//   15   31:aload_0         
	//   16   32:getfield        #71  <Field int _inputPtr>
	//   17   35:istore_1        
			_inputPtr = i + 1;
	//   18   36:aload_0         
	//   19   37:iload_1         
	//   20   38:iconst_1        
	//   21   39:iadd            
	//   22   40:putfield        #71  <Field int _inputPtr>
			i = abyte0[i] & 0xff;
	//   23   43:aload_2         
	//   24   44:iload_1         
	//   25   45:baload          
	//   26   46:sipush          255
	//   27   49:iand            
	//   28   50:istore_1        
			if(i > 32)
	//*  29   51:iload_1         
	//*  30   52:bipush          32
	//*  31   54:icmple          88
			{
				if(i == 47)
	//*  32   57:iload_1         
	//*  33   58:bipush          47
	//*  34   60:icmpne          70
					_skipComment();
	//   35   63:aload_0         
	//   36   64:invokespecial   #365 <Method void _skipComment()>
				else
	//*  37   67:goto            0
				if(i != 35 || !_skipYAMLComment())
	//*  38   70:iload_1         
	//*  39   71:bipush          35
	//*  40   73:icmpne          86
	//*  41   76:aload_0         
	//*  42   77:invokespecial   #368 <Method boolean _skipYAMLComment()>
	//*  43   80:ifeq            86
	//*  44   83:goto            0
					return i;
	//   45   86:iload_1         
	//   46   87:ireturn         
			} else
			if(i != 32)
	//*  47   88:iload_1         
	//*  48   89:bipush          32
	//*  49   91:icmpeq          0
				if(i == 10)
	//*  50   94:iload_1         
	//*  51   95:bipush          10
	//*  52   97:icmpne          121
				{
					_currInputRow = _currInputRow + 1;
	//   53  100:aload_0         
	//   54  101:aload_0         
	//   55  102:getfield        #338 <Field int _currInputRow>
	//   56  105:iconst_1        
	//   57  106:iadd            
	//   58  107:putfield        #338 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   59  110:aload_0         
	//   60  111:aload_0         
	//   61  112:getfield        #71  <Field int _inputPtr>
	//   62  115:putfield        #77  <Field int _currInputRowStart>
				} else
	//*  63  118:goto            0
				if(i == 13)
	//*  64  121:iload_1         
	//*  65  122:bipush          13
	//*  66  124:icmpne          134
					_skipCR();
	//   67  127:aload_0         
	//   68  128:invokevirtual   #335 <Method void _skipCR()>
				else
	//*  69  131:goto            0
				if(i != 9)
	//*  70  134:iload_1         
	//*  71  135:bipush          9
	//*  72  137:icmpeq          0
					_throwInvalidSpace(i);
	//   73  140:aload_0         
	//   74  141:iload_1         
	//   75  142:invokevirtual   #376 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   76  145:goto            0
	}

	private final boolean _skipYAMLComment()
		throws IOException
	{
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #412 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_YAML_COMMENTS>
	//*   2    4:invokevirtual   #383 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   3    7:ifne            12
		{
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		} else
		{
			_skipLine();
	//    6   12:aload_0         
	//    7   13:invokespecial   #388 <Method void _skipLine()>
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		}
	}

	private final void _updateLocation()
	{
		_tokenInputRow = _currInputRow;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #338 <Field int _currInputRow>
	//    3    5:putfield        #239 <Field int _tokenInputRow>
		int i = _inputPtr;
	//    4    8:aload_0         
	//    5    9:getfield        #71  <Field int _inputPtr>
	//    6   12:istore_1        
		_tokenInputTotal = _currInputProcessed + (long)i;
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #81  <Field long _currInputProcessed>
	//   10   18:iload_1         
	//   11   19:i2l             
	//   12   20:ladd            
	//   13   21:putfield        #415 <Field long _tokenInputTotal>
		_tokenInputCol = i - _currInputRowStart;
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:aload_0         
	//   17   27:getfield        #77  <Field int _currInputRowStart>
	//   18   30:isub            
	//   19   31:putfield        #242 <Field int _tokenInputCol>
	//   20   34:return          
	}

	private final void _updateNameLocation()
	{
		_nameStartRow = _currInputRow;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #338 <Field int _currInputRow>
	//    3    5:putfield        #418 <Field int _nameStartRow>
		int i = _inputPtr;
	//    4    8:aload_0         
	//    5    9:getfield        #71  <Field int _inputPtr>
	//    6   12:istore_1        
		_nameStartOffset = i;
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:putfield        #420 <Field int _nameStartOffset>
		_nameStartCol = i - _currInputRowStart;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:aload_0         
	//   13   21:getfield        #77  <Field int _currInputRowStart>
	//   14   24:isub            
	//   15   25:putfield        #422 <Field int _nameStartCol>
	//   16   28:return          
	}

	private final int _verifyNoLeadingZeroes()
		throws IOException
	{
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #74  <Field int _inputEnd>
	//*   4    8:icmplt          21
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #219 <Method boolean _loadMore()>
	//*   7   15:ifne            21
			return 48;
	//    8   18:bipush          48
	//    9   20:ireturn         
		int i = _inputBuffer[_inputPtr] & 0xff;
	//   10   21:aload_0         
	//   11   22:getfield        #68  <Field byte[] _inputBuffer>
	//   12   25:aload_0         
	//   13   26:getfield        #71  <Field int _inputPtr>
	//   14   29:baload          
	//   15   30:sipush          255
	//   16   33:iand            
	//   17   34:istore_1        
		if(i >= 48)
	//*  18   35:iload_1         
	//*  19   36:bipush          48
	//*  20   38:icmplt          159
		{
			if(i > 57)
	//*  21   41:iload_1         
	//*  22   42:bipush          57
	//*  23   44:icmple          50
				return 48;
	//   24   47:bipush          48
	//   25   49:ireturn         
			if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS))
	//*  26   50:aload_0         
	//*  27   51:getstatic       #426 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NUMERIC_LEADING_ZEROS>
	//*  28   54:invokevirtual   #383 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  29   57:ifne            67
				reportInvalidNumber("Leading zeroes not allowed");
	//   30   60:aload_0         
	//   31   61:ldc2            #428 <String "Leading zeroes not allowed">
	//   32   64:invokevirtual   #431 <Method void reportInvalidNumber(String)>
			_inputPtr = _inputPtr + 1;
	//   33   67:aload_0         
	//   34   68:aload_0         
	//   35   69:getfield        #71  <Field int _inputPtr>
	//   36   72:iconst_1        
	//   37   73:iadd            
	//   38   74:putfield        #71  <Field int _inputPtr>
			int j = i;
	//   39   77:iload_1         
	//   40   78:istore_2        
			if(i == 48)
				do
	//*  41   79:iload_1         
	//*  42   80:bipush          48
	//*  43   82:icmpne          157
				{
					if(_inputPtr >= _inputEnd)
	//*  44   85:aload_0         
	//*  45   86:getfield        #71  <Field int _inputPtr>
	//*  46   89:aload_0         
	//*  47   90:getfield        #74  <Field int _inputEnd>
	//*  48   93:icmplt          105
					{
						j = i;
	//   49   96:iload_1         
	//   50   97:istore_2        
						if(!_loadMore())
							break;
	//   51   98:aload_0         
	//   52   99:invokevirtual   #219 <Method boolean _loadMore()>
	//   53  102:ifeq            157
					}
					j = _inputBuffer[_inputPtr] & 0xff;
	//   54  105:aload_0         
	//   55  106:getfield        #68  <Field byte[] _inputBuffer>
	//   56  109:aload_0         
	//   57  110:getfield        #71  <Field int _inputPtr>
	//   58  113:baload          
	//   59  114:sipush          255
	//   60  117:iand            
	//   61  118:istore_2        
					if(j >= 48)
	//*  62  119:iload_2         
	//*  63  120:bipush          48
	//*  64  122:icmplt          154
					{
						if(j > 57)
	//*  65  125:iload_2         
	//*  66  126:bipush          57
	//*  67  128:icmple          134
							return 48;
	//   68  131:bipush          48
	//   69  133:ireturn         
						_inputPtr = _inputPtr + 1;
	//   70  134:aload_0         
	//   71  135:aload_0         
	//   72  136:getfield        #71  <Field int _inputPtr>
	//   73  139:iconst_1        
	//   74  140:iadd            
	//   75  141:putfield        #71  <Field int _inputPtr>
						i = j;
	//   76  144:iload_2         
	//   77  145:istore_1        
						if(j != 48)
	//*  78  146:iload_2         
	//*  79  147:bipush          48
	//*  80  149:icmpeq          85
							return j;
	//   81  152:iload_2         
	//   82  153:ireturn         
					} else
					{
						return 48;
	//   83  154:bipush          48
	//   84  156:ireturn         
					}
				} while(true);
			return j;
	//   85  157:iload_2         
	//   86  158:ireturn         
		} else
		{
			return 48;
	//   87  159:bipush          48
	//   88  161:ireturn         
		}
	}

	private final void _verifyRootSpace(int i)
		throws IOException
	{
		_inputPtr = _inputPtr + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #71  <Field int _inputPtr>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #71  <Field int _inputPtr>
		if(i != 13)
	//*   6   10:iload_1         
	//*   7   11:bipush          13
	//*   8   13:icmpeq          70
		{
			if(i != 32)
	//*   9   16:iload_1         
	//*  10   17:bipush          32
	//*  11   19:icmpeq          69
				switch(i)
	//*  12   22:iload_1         
				{
	//*  13   23:tableswitch     9 10: default 44
	//	               9 69
	//	               10 50
				default:
					_reportMissingRootWS(i);
	//   14   44:aload_0         
	//   15   45:iload_1         
	//   16   46:invokevirtual   #434 <Method void _reportMissingRootWS(int)>
					return;
	//   17   49:return          

				case 10: // '\n'
					_currInputRow = _currInputRow + 1;
	//   18   50:aload_0         
	//   19   51:aload_0         
	//   20   52:getfield        #338 <Field int _currInputRow>
	//   21   55:iconst_1        
	//   22   56:iadd            
	//   23   57:putfield        #338 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   24   60:aload_0         
	//   25   61:aload_0         
	//   26   62:getfield        #71  <Field int _inputPtr>
	//   27   65:putfield        #77  <Field int _currInputRowStart>
					return;
	//   28   68:return          

				case 9: // '\t'
					break;
				}
			return;
	//   29   69:return          
		} else
		{
			_skipCR();
	//   30   70:aload_0         
	//   31   71:invokevirtual   #335 <Method void _skipCR()>
			return;
	//   32   74:return          
		}
	}

	private final String addName(int ai[], int i, int j)
		throws JsonParseException
	{
		int l2 = ((i << 2) - 4) + j;
	//    0    0:iload_2         
	//    1    1:iconst_2        
	//    2    2:ishl            
	//    3    3:iconst_4        
	//    4    4:isub            
	//    5    5:iload_3         
	//    6    6:iadd            
	//    7    7:istore          11
		int l1;
		if(j < 4)
	//*   8    9:iload_3         
	//*   9   10:iconst_4        
	//*  10   11:icmpge          40
		{
			int k = i - 1;
	//   11   14:iload_2         
	//   12   15:iconst_1        
	//   13   16:isub            
	//   14   17:istore          4
			l1 = ai[k];
	//   15   19:aload_1         
	//   16   20:iload           4
	//   17   22:iaload          
	//   18   23:istore          8
			ai[k] = l1 << (4 - j << 3);
	//   19   25:aload_1         
	//   20   26:iload           4
	//   21   28:iload           8
	//   22   30:iconst_4        
	//   23   31:iload_3         
	//   24   32:isub            
	//   25   33:iconst_3        
	//   26   34:ishl            
	//   27   35:ishl            
	//   28   36:iastore         
		} else
	//*  29   37:goto            43
		{
			l1 = 0;
	//   30   40:iconst_0        
	//   31   41:istore          8
		}
		char ac[] = _textBuffer.emptyAndGetCurrentSegment();
	//   32   43:aload_0         
	//   33   44:getfield        #172 <Field TextBuffer _textBuffer>
	//   34   47:invokevirtual   #439 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//   35   50:astore          12
		int i1 = 0;
	//   36   52:iconst_0        
	//   37   53:istore          5
		int j1;
		int k1;
		for(k1 = 0; i1 < l2; k1 = j1 + 1)
	//*  38   55:iconst_0        
	//*  39   56:istore          7
	//*  40   58:iload           5
	//*  41   60:iload           11
	//*  42   62:icmpge          533
		{
			int j2 = ai[i1 >> 2] >> (3 - (i1 & 3) << 3) & 0xff;
	//   43   65:aload_1         
	//   44   66:iload           5
	//   45   68:iconst_2        
	//   46   69:ishr            
	//   47   70:iaload          
	//   48   71:iconst_3        
	//   49   72:iload           5
	//   50   74:iconst_3        
	//   51   75:iand            
	//   52   76:isub            
	//   53   77:iconst_3        
	//   54   78:ishl            
	//   55   79:ishr            
	//   56   80:sipush          255
	//   57   83:iand            
	//   58   84:istore          10
			int i2 = i1 + 1;
	//   59   86:iload           5
	//   60   88:iconst_1        
	//   61   89:iadd            
	//   62   90:istore          9
			i1 = i2;
	//   63   92:iload           9
	//   64   94:istore          5
			char ac1[] = ac;
	//   65   96:aload           12
	//   66   98:astore          13
			j1 = k1;
	//   67  100:iload           7
	//   68  102:istore          6
			int l = j2;
	//   69  104:iload           10
	//   70  106:istore          4
			if(j2 > 127)
	//*  71  108:iload           10
	//*  72  110:bipush          127
	//*  73  112:icmple          495
			{
				if((j2 & 0xe0) == 192)
	//*  74  115:iload           10
	//*  75  117:sipush          224
	//*  76  120:iand            
	//*  77  121:sipush          192
	//*  78  124:icmpne          140
				{
					i1 = j2 & 0x1f;
	//   79  127:iload           10
	//   80  129:bipush          31
	//   81  131:iand            
	//   82  132:istore          5
					l = 1;
	//   83  134:iconst_1        
	//   84  135:istore          4
				} else
	//*  85  137:goto            202
				if((j2 & 0xf0) == 224)
	//*  86  140:iload           10
	//*  87  142:sipush          240
	//*  88  145:iand            
	//*  89  146:sipush          224
	//*  90  149:icmpne          165
				{
					i1 = j2 & 0xf;
	//   91  152:iload           10
	//   92  154:bipush          15
	//   93  156:iand            
	//   94  157:istore          5
					l = 2;
	//   95  159:iconst_2        
	//   96  160:istore          4
				} else
	//*  97  162:goto            202
				if((j2 & 0xf8) == 240)
	//*  98  165:iload           10
	//*  99  167:sipush          248
	//* 100  170:iand            
	//* 101  171:sipush          240
	//* 102  174:icmpne          190
				{
					i1 = j2 & 7;
	//  103  177:iload           10
	//  104  179:bipush          7
	//  105  181:iand            
	//  106  182:istore          5
					l = 3;
	//  107  184:iconst_3        
	//  108  185:istore          4
				} else
	//* 109  187:goto            202
				{
					_reportInvalidInitial(j2);
	//  110  190:aload_0         
	//  111  191:iload           10
	//  112  193:invokevirtual   #442 <Method void _reportInvalidInitial(int)>
					l = 1;
	//  113  196:iconst_1        
	//  114  197:istore          4
					i1 = 1;
	//  115  199:iconst_1        
	//  116  200:istore          5
				}
				if(i2 + l > l2)
	//* 117  202:iload           9
	//* 118  204:iload           4
	//* 119  206:iadd            
	//* 120  207:iload           11
	//* 121  209:icmple          222
					_reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
	//  122  212:aload_0         
	//  123  213:ldc2            #444 <String " in field name">
	//  124  216:getstatic       #447 <Field JsonToken JsonToken.FIELD_NAME>
	//  125  219:invokevirtual   #332 <Method void _reportInvalidEOF(String, JsonToken)>
				j1 = ai[i2 >> 2] >> (3 - (i2 & 3) << 3);
	//  126  222:aload_1         
	//  127  223:iload           9
	//  128  225:iconst_2        
	//  129  226:ishr            
	//  130  227:iaload          
	//  131  228:iconst_3        
	//  132  229:iload           9
	//  133  231:iconst_3        
	//  134  232:iand            
	//  135  233:isub            
	//  136  234:iconst_3        
	//  137  235:ishl            
	//  138  236:ishr            
	//  139  237:istore          6
				i2++;
	//  140  239:iload           9
	//  141  241:iconst_1        
	//  142  242:iadd            
	//  143  243:istore          9
				if((j1 & 0xc0) != 128)
	//* 144  245:iload           6
	//* 145  247:sipush          192
	//* 146  250:iand            
	//* 147  251:sipush          128
	//* 148  254:icmpeq          263
					_reportInvalidOther(j1);
	//  149  257:aload_0         
	//  150  258:iload           6
	//  151  260:invokevirtual   #449 <Method void _reportInvalidOther(int)>
				j1 = j1 & 0x3f | i1 << 6;
	//  152  263:iload           6
	//  153  265:bipush          63
	//  154  267:iand            
	//  155  268:iload           5
	//  156  270:bipush          6
	//  157  272:ishl            
	//  158  273:ior             
	//  159  274:istore          6
				if(l > 1)
	//* 160  276:iload           4
	//* 161  278:iconst_1        
	//* 162  279:icmple          411
				{
					i1 = ai[i2 >> 2] >> (3 - (i2 & 3) << 3);
	//  163  282:aload_1         
	//  164  283:iload           9
	//  165  285:iconst_2        
	//  166  286:ishr            
	//  167  287:iaload          
	//  168  288:iconst_3        
	//  169  289:iload           9
	//  170  291:iconst_3        
	//  171  292:iand            
	//  172  293:isub            
	//  173  294:iconst_3        
	//  174  295:ishl            
	//  175  296:ishr            
	//  176  297:istore          5
					i2++;
	//  177  299:iload           9
	//  178  301:iconst_1        
	//  179  302:iadd            
	//  180  303:istore          9
					if((i1 & 0xc0) != 128)
	//* 181  305:iload           5
	//* 182  307:sipush          192
	//* 183  310:iand            
	//* 184  311:sipush          128
	//* 185  314:icmpeq          323
						_reportInvalidOther(i1);
	//  186  317:aload_0         
	//  187  318:iload           5
	//  188  320:invokevirtual   #449 <Method void _reportInvalidOther(int)>
					int k2 = i1 & 0x3f | j1 << 6;
	//  189  323:iload           5
	//  190  325:bipush          63
	//  191  327:iand            
	//  192  328:iload           6
	//  193  330:bipush          6
	//  194  332:ishl            
	//  195  333:ior             
	//  196  334:istore          10
					j1 = k2;
	//  197  336:iload           10
	//  198  338:istore          6
					i1 = i2;
	//  199  340:iload           9
	//  200  342:istore          5
					if(l > 2)
	//* 201  344:iload           4
	//* 202  346:iconst_2        
	//* 203  347:icmple          415
					{
						j1 = ai[i2 >> 2] >> (3 - (i2 & 3) << 3);
	//  204  350:aload_1         
	//  205  351:iload           9
	//  206  353:iconst_2        
	//  207  354:ishr            
	//  208  355:iaload          
	//  209  356:iconst_3        
	//  210  357:iload           9
	//  211  359:iconst_3        
	//  212  360:iand            
	//  213  361:isub            
	//  214  362:iconst_3        
	//  215  363:ishl            
	//  216  364:ishr            
	//  217  365:istore          6
						i1 = i2 + 1;
	//  218  367:iload           9
	//  219  369:iconst_1        
	//  220  370:iadd            
	//  221  371:istore          5
						if((j1 & 0xc0) != 128)
	//* 222  373:iload           6
	//* 223  375:sipush          192
	//* 224  378:iand            
	//* 225  379:sipush          128
	//* 226  382:icmpeq          395
							_reportInvalidOther(j1 & 0xff);
	//  227  385:aload_0         
	//  228  386:iload           6
	//  229  388:sipush          255
	//  230  391:iand            
	//  231  392:invokevirtual   #449 <Method void _reportInvalidOther(int)>
						j1 = k2 << 6 | j1 & 0x3f;
	//  232  395:iload           10
	//  233  397:bipush          6
	//  234  399:ishl            
	//  235  400:iload           6
	//  236  402:bipush          63
	//  237  404:iand            
	//  238  405:ior             
	//  239  406:istore          6
					}
				} else
	//* 240  408:goto            415
				{
					i1 = i2;
	//  241  411:iload           9
	//  242  413:istore          5
				}
				if(l > 2)
	//* 243  415:iload           4
	//* 244  417:iconst_2        
	//* 245  418:icmple          483
				{
					l = j1 - 0x10000;
	//  246  421:iload           6
	//  247  423:ldc1            #166 <Int 0x10000>
	//  248  425:isub            
	//  249  426:istore          4
					ac1 = ac;
	//  250  428:aload           12
	//  251  430:astore          13
					if(k1 >= ac.length)
	//* 252  432:iload           7
	//* 253  434:aload           12
	//* 254  436:arraylength     
	//* 255  437:icmplt          449
						ac1 = _textBuffer.expandCurrentSegment();
	//  256  440:aload_0         
	//  257  441:getfield        #172 <Field TextBuffer _textBuffer>
	//  258  444:invokevirtual   #452 <Method char[] TextBuffer.expandCurrentSegment()>
	//  259  447:astore          13
					ac1[k1] = (char)((l >> 10) + 55296);
	//  260  449:aload           13
	//  261  451:iload           7
	//  262  453:iload           4
	//  263  455:bipush          10
	//  264  457:ishr            
	//  265  458:ldc1            #197 <Int 55296>
	//  266  460:iadd            
	//  267  461:int2char        
	//  268  462:castore         
					l = l & 0x3ff | 0xdc00;
	//  269  463:iload           4
	//  270  465:sipush          1023
	//  271  468:iand            
	//  272  469:ldc1            #198 <Int 56320>
	//  273  471:ior             
	//  274  472:istore          4
					j1 = k1 + 1;
	//  275  474:iload           7
	//  276  476:iconst_1        
	//  277  477:iadd            
	//  278  478:istore          6
				} else
	//* 279  480:goto            495
				{
					l = j1;
	//  280  483:iload           6
	//  281  485:istore          4
					j1 = k1;
	//  282  487:iload           7
	//  283  489:istore          6
					ac1 = ac;
	//  284  491:aload           12
	//  285  493:astore          13
				}
			}
			ac = ac1;
	//  286  495:aload           13
	//  287  497:astore          12
			if(j1 >= ac1.length)
	//* 288  499:iload           6
	//* 289  501:aload           13
	//* 290  503:arraylength     
	//* 291  504:icmplt          516
				ac = _textBuffer.expandCurrentSegment();
	//  292  507:aload_0         
	//  293  508:getfield        #172 <Field TextBuffer _textBuffer>
	//  294  511:invokevirtual   #452 <Method char[] TextBuffer.expandCurrentSegment()>
	//  295  514:astore          12
			ac[j1] = (char)l;
	//  296  516:aload           12
	//  297  518:iload           6
	//  298  520:iload           4
	//  299  522:int2char        
	//  300  523:castore         
		}

	//  301  524:iload           6
	//  302  526:iconst_1        
	//  303  527:iadd            
	//  304  528:istore          7
	//* 305  530:goto            58
		String s = new String(ac, 0, k1);
	//  306  533:new             #99  <Class String>
	//  307  536:dup             
	//  308  537:aload           12
	//  309  539:iconst_0        
	//  310  540:iload           7
	//  311  542:invokespecial   #455 <Method void String(char[], int, int)>
	//  312  545:astore          12
		if(j < 4)
	//* 313  547:iload_3         
	//* 314  548:iconst_4        
	//* 315  549:icmpge          559
			ai[i - 1] = l1;
	//  316  552:aload_1         
	//  317  553:iload_2         
	//  318  554:iconst_1        
	//  319  555:isub            
	//  320  556:iload           8
	//  321  558:iastore         
		return _symbols.addName(s, ai, i);
	//  322  559:aload_0         
	//  323  560:getfield        #66  <Field ByteQuadsCanonicalizer _symbols>
	//  324  563:aload           12
	//  325  565:aload_1         
	//  326  566:iload_2         
	//  327  567:invokevirtual   #460 <Method String ByteQuadsCanonicalizer.addName(String, int[], int)>
	//  328  570:areturn         
	}

	private final String findName(int i, int j)
		throws JsonParseException
	{
		i = _padLastQuad(i, j);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #463 <Method int _padLastQuad(int, int)>
	//    3    5:istore_1        
		String s = _symbols.findName(i);
	//    4    6:aload_0         
	//    5    7:getfield        #66  <Field ByteQuadsCanonicalizer _symbols>
	//    6   10:iload_1         
	//    7   11:invokevirtual   #466 <Method String ByteQuadsCanonicalizer.findName(int)>
	//    8   14:astore_3        
		if(s != null)
	//*   9   15:aload_3         
	//*  10   16:ifnull          21
		{
			return s;
	//   11   19:aload_3         
	//   12   20:areturn         
		} else
		{
			int ai[] = _quadBuffer;
	//   13   21:aload_0         
	//   14   22:getfield        #60  <Field int[] _quadBuffer>
	//   15   25:astore_3        
			ai[0] = i;
	//   16   26:aload_3         
	//   17   27:iconst_0        
	//   18   28:iload_1         
	//   19   29:iastore         
			return addName(ai, 1, j);
	//   20   30:aload_0         
	//   21   31:aload_3         
	//   22   32:iconst_1        
	//   23   33:iload_2         
	//   24   34:invokespecial   #468 <Method String addName(int[], int, int)>
	//   25   37:areturn         
		}
	}

	private final String findName(int i, int j, int k)
		throws JsonParseException
	{
		j = _padLastQuad(j, k);
	//    0    0:iload_2         
	//    1    1:iload_3         
	//    2    2:invokestatic    #463 <Method int _padLastQuad(int, int)>
	//    3    5:istore_2        
		String s = _symbols.findName(i, j);
	//    4    6:aload_0         
	//    5    7:getfield        #66  <Field ByteQuadsCanonicalizer _symbols>
	//    6   10:iload_1         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #471 <Method String ByteQuadsCanonicalizer.findName(int, int)>
	//    9   15:astore          4
		if(s != null)
	//*  10   17:aload           4
	//*  11   19:ifnull          25
		{
			return s;
	//   12   22:aload           4
	//   13   24:areturn         
		} else
		{
			int ai[] = _quadBuffer;
	//   14   25:aload_0         
	//   15   26:getfield        #60  <Field int[] _quadBuffer>
	//   16   29:astore          4
			ai[0] = i;
	//   17   31:aload           4
	//   18   33:iconst_0        
	//   19   34:iload_1         
	//   20   35:iastore         
			ai[1] = j;
	//   21   36:aload           4
	//   22   38:iconst_1        
	//   23   39:iload_2         
	//   24   40:iastore         
			return addName(ai, 2, k);
	//   25   41:aload_0         
	//   26   42:aload           4
	//   27   44:iconst_2        
	//   28   45:iload_3         
	//   29   46:invokespecial   #468 <Method String addName(int[], int, int)>
	//   30   49:areturn         
		}
	}

	private final String findName(int i, int j, int k, int l)
		throws JsonParseException
	{
		k = _padLastQuad(k, l);
	//    0    0:iload_3         
	//    1    1:iload           4
	//    2    3:invokestatic    #463 <Method int _padLastQuad(int, int)>
	//    3    6:istore_3        
		String s = _symbols.findName(i, j, k);
	//    4    7:aload_0         
	//    5    8:getfield        #66  <Field ByteQuadsCanonicalizer _symbols>
	//    6   11:iload_1         
	//    7   12:iload_2         
	//    8   13:iload_3         
	//    9   14:invokevirtual   #474 <Method String ByteQuadsCanonicalizer.findName(int, int, int)>
	//   10   17:astore          5
		if(s != null)
	//*  11   19:aload           5
	//*  12   21:ifnull          27
		{
			return s;
	//   13   24:aload           5
	//   14   26:areturn         
		} else
		{
			int ai[] = _quadBuffer;
	//   15   27:aload_0         
	//   16   28:getfield        #60  <Field int[] _quadBuffer>
	//   17   31:astore          5
			ai[0] = i;
	//   18   33:aload           5
	//   19   35:iconst_0        
	//   20   36:iload_1         
	//   21   37:iastore         
			ai[1] = j;
	//   22   38:aload           5
	//   23   40:iconst_1        
	//   24   41:iload_2         
	//   25   42:iastore         
			ai[2] = _padLastQuad(k, l);
	//   26   43:aload           5
	//   27   45:iconst_2        
	//   28   46:iload_3         
	//   29   47:iload           4
	//   30   49:invokestatic    #463 <Method int _padLastQuad(int, int)>
	//   31   52:iastore         
			return addName(ai, 3, l);
	//   32   53:aload_0         
	//   33   54:aload           5
	//   34   56:iconst_3        
	//   35   57:iload           4
	//   36   59:invokespecial   #468 <Method String addName(int[], int, int)>
	//   37   62:areturn         
		}
	}

	private final String findName(int ai[], int i, int j, int k)
		throws JsonParseException
	{
		int ai1[] = ai;
	//    0    0:aload_1         
	//    1    1:astore          6
		if(i >= ai.length)
	//*   2    3:iload_2         
	//*   3    4:aload_1         
	//*   4    5:arraylength     
	//*   5    6:icmplt          23
		{
			ai1 = growArrayBy(ai, ai.length);
	//    6    9:aload_1         
	//    7   10:aload_1         
	//    8   11:arraylength     
	//    9   12:invokestatic    #479 <Method int[] growArrayBy(int[], int)>
	//   10   15:astore          6
			_quadBuffer = ai1;
	//   11   17:aload_0         
	//   12   18:aload           6
	//   13   20:putfield        #60  <Field int[] _quadBuffer>
		}
		int l = i + 1;
	//   14   23:iload_2         
	//   15   24:iconst_1        
	//   16   25:iadd            
	//   17   26:istore          5
		ai1[i] = _padLastQuad(j, k);
	//   18   28:aload           6
	//   19   30:iload_2         
	//   20   31:iload_3         
	//   21   32:iload           4
	//   22   34:invokestatic    #463 <Method int _padLastQuad(int, int)>
	//   23   37:iastore         
		ai = ((int []) (_symbols.findName(ai1, l)));
	//   24   38:aload_0         
	//   25   39:getfield        #66  <Field ByteQuadsCanonicalizer _symbols>
	//   26   42:aload           6
	//   27   44:iload           5
	//   28   46:invokevirtual   #482 <Method String ByteQuadsCanonicalizer.findName(int[], int)>
	//   29   49:astore_1        
		if(ai == null)
	//*  30   50:aload_1         
	//*  31   51:ifnonnull       65
			return addName(ai1, l, k);
	//   32   54:aload_0         
	//   33   55:aload           6
	//   34   57:iload           5
	//   35   59:iload           4
	//   36   61:invokespecial   #468 <Method String addName(int[], int, int)>
	//   37   64:areturn         
		else
			return ((String) (ai));
	//   38   65:aload_1         
	//   39   66:areturn         
	}

	private int nextByte()
		throws IOException
	{
		if(_inputPtr >= _inputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #74  <Field int _inputEnd>
	//*   4    8:icmplt          15
			_loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
		byte abyte0[] = _inputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #68  <Field byte[] _inputBuffer>
	//    9   19:astore_2        
		int i = _inputPtr;
	//   10   20:aload_0         
	//   11   21:getfield        #71  <Field int _inputPtr>
	//   12   24:istore_1        
		_inputPtr = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #71  <Field int _inputPtr>
		return abyte0[i] & 0xff;
	//   18   32:aload_2         
	//   19   33:iload_1         
	//   20   34:baload          
	//   21   35:sipush          255
	//   22   38:iand            
	//   23   39:ireturn         
	}

	private final String parseName(int i, int j, int k)
		throws IOException
	{
		return parseEscapedName(_quadBuffer, 0, i, j, k);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #60  <Field int[] _quadBuffer>
	//    3    5:iconst_0        
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:invokevirtual   #488 <Method String parseEscapedName(int[], int, int, int, int)>
	//    8   12:areturn         
	}

	private final String parseName(int i, int j, int k, int l)
		throws IOException
	{
		int ai[] = _quadBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int[] _quadBuffer>
	//    2    4:astore          5
		ai[0] = i;
	//    3    6:aload           5
	//    4    8:iconst_0        
	//    5    9:iload_1         
	//    6   10:iastore         
		return parseEscapedName(ai, 1, j, k, l);
	//    7   11:aload_0         
	//    8   12:aload           5
	//    9   14:iconst_1        
	//   10   15:iload_2         
	//   11   16:iload_3         
	//   12   17:iload           4
	//   13   19:invokevirtual   #488 <Method String parseEscapedName(int[], int, int, int, int)>
	//   14   22:areturn         
	}

	private final String parseName(int i, int j, int k, int l, int i1)
		throws IOException
	{
		int ai[] = _quadBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int[] _quadBuffer>
	//    2    4:astore          6
		ai[0] = i;
	//    3    6:aload           6
	//    4    8:iconst_0        
	//    5    9:iload_1         
	//    6   10:iastore         
		ai[1] = j;
	//    7   11:aload           6
	//    8   13:iconst_1        
	//    9   14:iload_2         
	//   10   15:iastore         
		return parseEscapedName(ai, 2, k, l, i1);
	//   11   16:aload_0         
	//   12   17:aload           6
	//   13   19:iconst_2        
	//   14   20:iload_3         
	//   15   21:iload           4
	//   16   23:iload           5
	//   17   25:invokevirtual   #488 <Method String parseEscapedName(int[], int, int, int, int)>
	//   18   28:areturn         
	}

	protected void _closeInput()
		throws IOException
	{
		if(_inputStream != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field InputStream _inputStream>
	//*   2    4:ifnull          39
		{
			if(_ioContext.isResourceManaged() || isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE))
	//*   3    7:aload_0         
	//*   4    8:getfield        #494 <Field IOContext _ioContext>
	//*   5   11:invokevirtual   #499 <Method boolean IOContext.isResourceManaged()>
	//*   6   14:ifne            27
	//*   7   17:aload_0         
	//*   8   18:getstatic       #502 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.AUTO_CLOSE_SOURCE>
	//*   9   21:invokevirtual   #383 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  10   24:ifeq            34
				_inputStream.close();
	//   11   27:aload_0         
	//   12   28:getfield        #62  <Field InputStream _inputStream>
	//   13   31:invokevirtual   #507 <Method void InputStream.close()>
			_inputStream = null;
	//   14   34:aload_0         
	//   15   35:aconst_null     
	//   16   36:putfield        #62  <Field InputStream _inputStream>
		}
	//   17   39:return          
	}

	protected final byte[] _decodeBase64(Base64Variant base64variant)
		throws IOException
	{
		Object obj = ((Object) (_getByteArrayBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #513 <Method ByteArrayBuilder _getByteArrayBuilder()>
	//    2    4:astore          7
		do
		{
			int i1;
			do
			{
				if(_inputPtr >= _inputEnd)
	//*   3    6:aload_0         
	//*   4    7:getfield        #71  <Field int _inputPtr>
	//*   5   10:aload_0         
	//*   6   11:getfield        #74  <Field int _inputEnd>
	//*   7   14:icmplt          21
					_loadMoreGuaranteed();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
				byte abyte0[] = _inputBuffer;
	//   10   21:aload_0         
	//   11   22:getfield        #68  <Field byte[] _inputBuffer>
	//   12   25:astore          8
				int i = _inputPtr;
	//   13   27:aload_0         
	//   14   28:getfield        #71  <Field int _inputPtr>
	//   15   31:istore_2        
				_inputPtr = i + 1;
	//   16   32:aload_0         
	//   17   33:iload_2         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:putfield        #71  <Field int _inputPtr>
				i1 = abyte0[i] & 0xff;
	//   21   39:aload           8
	//   22   41:iload_2         
	//   23   42:baload          
	//   24   43:sipush          255
	//   25   46:iand            
	//   26   47:istore          4
			} while(i1 <= 32);
	//   27   49:iload           4
	//   28   51:bipush          32
	//   29   53:icmple          6
			int l = base64variant.decodeBase64Char(i1);
	//   30   56:aload_1         
	//   31   57:iload           4
	//   32   59:invokevirtual   #518 <Method int Base64Variant.decodeBase64Char(int)>
	//   33   62:istore_3        
			int j = l;
	//   34   63:iload_3         
	//   35   64:istore_2        
			if(l < 0)
	//*  36   65:iload_3         
	//*  37   66:ifge            100
			{
				if(i1 == 34)
	//*  38   69:iload           4
	//*  39   71:bipush          34
	//*  40   73:icmpne          82
					return ((ByteArrayBuilder) (obj)).toByteArray();
	//   41   76:aload           7
	//   42   78:invokevirtual   #524 <Method byte[] ByteArrayBuilder.toByteArray()>
	//   43   81:areturn         
				l = _decodeBase64Escape(base64variant, i1, 0);
	//   44   82:aload_0         
	//   45   83:aload_1         
	//   46   84:iload           4
	//   47   86:iconst_0        
	//   48   87:invokevirtual   #528 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//   49   90:istore_3        
				j = l;
	//   50   91:iload_3         
	//   51   92:istore_2        
				if(l < 0)
	//*  52   93:iload_3         
	//*  53   94:ifge            100
					continue;
	//   54   97:goto            6
			}
			if(_inputPtr >= _inputEnd)
	//*  55  100:aload_0         
	//*  56  101:getfield        #71  <Field int _inputPtr>
	//*  57  104:aload_0         
	//*  58  105:getfield        #74  <Field int _inputEnd>
	//*  59  108:icmplt          115
				_loadMoreGuaranteed();
	//   60  111:aload_0         
	//   61  112:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
			byte abyte1[] = _inputBuffer;
	//   62  115:aload_0         
	//   63  116:getfield        #68  <Field byte[] _inputBuffer>
	//   64  119:astore          8
			l = _inputPtr;
	//   65  121:aload_0         
	//   66  122:getfield        #71  <Field int _inputPtr>
	//   67  125:istore_3        
			_inputPtr = l + 1;
	//   68  126:aload_0         
	//   69  127:iload_3         
	//   70  128:iconst_1        
	//   71  129:iadd            
	//   72  130:putfield        #71  <Field int _inputPtr>
			int j1 = abyte1[l] & 0xff;
	//   73  133:aload           8
	//   74  135:iload_3         
	//   75  136:baload          
	//   76  137:sipush          255
	//   77  140:iand            
	//   78  141:istore          5
			i1 = base64variant.decodeBase64Char(j1);
	//   79  143:aload_1         
	//   80  144:iload           5
	//   81  146:invokevirtual   #518 <Method int Base64Variant.decodeBase64Char(int)>
	//   82  149:istore          4
			l = i1;
	//   83  151:iload           4
	//   84  153:istore_3        
			if(i1 < 0)
	//*  85  154:iload           4
	//*  86  156:ifge            168
				l = _decodeBase64Escape(base64variant, j1, 1);
	//   87  159:aload_0         
	//   88  160:aload_1         
	//   89  161:iload           5
	//   90  163:iconst_1        
	//   91  164:invokevirtual   #528 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//   92  167:istore_3        
			j1 = j << 6 | l;
	//   93  168:iload_2         
	//   94  169:bipush          6
	//   95  171:ishl            
	//   96  172:iload_3         
	//   97  173:ior             
	//   98  174:istore          5
			if(_inputPtr >= _inputEnd)
	//*  99  176:aload_0         
	//* 100  177:getfield        #71  <Field int _inputPtr>
	//* 101  180:aload_0         
	//* 102  181:getfield        #74  <Field int _inputEnd>
	//* 103  184:icmplt          191
				_loadMoreGuaranteed();
	//  104  187:aload_0         
	//  105  188:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
			abyte1 = _inputBuffer;
	//  106  191:aload_0         
	//  107  192:getfield        #68  <Field byte[] _inputBuffer>
	//  108  195:astore          8
			j = _inputPtr;
	//  109  197:aload_0         
	//  110  198:getfield        #71  <Field int _inputPtr>
	//  111  201:istore_2        
			_inputPtr = j + 1;
	//  112  202:aload_0         
	//  113  203:iload_2         
	//  114  204:iconst_1        
	//  115  205:iadd            
	//  116  206:putfield        #71  <Field int _inputPtr>
			int k1 = abyte1[j] & 0xff;
	//  117  209:aload           8
	//  118  211:iload_2         
	//  119  212:baload          
	//  120  213:sipush          255
	//  121  216:iand            
	//  122  217:istore          6
			l = base64variant.decodeBase64Char(k1);
	//  123  219:aload_1         
	//  124  220:iload           6
	//  125  222:invokevirtual   #518 <Method int Base64Variant.decodeBase64Char(int)>
	//  126  225:istore_3        
			i1 = l;
	//  127  226:iload_3         
	//  128  227:istore          4
			if(l < 0)
	//* 129  229:iload_3         
	//* 130  230:ifge            400
			{
				j = l;
	//  131  233:iload_3         
	//  132  234:istore_2        
				if(l != -2)
	//* 133  235:iload_3         
	//* 134  236:bipush          -2
	//* 135  238:icmpeq          279
				{
					if(k1 == 34 && !base64variant.usesPadding())
	//* 136  241:iload           6
	//* 137  243:bipush          34
	//* 138  245:icmpne          270
	//* 139  248:aload_1         
	//* 140  249:invokevirtual   #531 <Method boolean Base64Variant.usesPadding()>
	//* 141  252:ifne            270
					{
						((ByteArrayBuilder) (obj)).append(j1 >> 4);
	//  142  255:aload           7
	//  143  257:iload           5
	//  144  259:iconst_4        
	//  145  260:ishr            
	//  146  261:invokevirtual   #533 <Method void ByteArrayBuilder.append(int)>
						return ((ByteArrayBuilder) (obj)).toByteArray();
	//  147  264:aload           7
	//  148  266:invokevirtual   #524 <Method byte[] ByteArrayBuilder.toByteArray()>
	//  149  269:areturn         
					}
					j = _decodeBase64Escape(base64variant, k1, 2);
	//  150  270:aload_0         
	//  151  271:aload_1         
	//  152  272:iload           6
	//  153  274:iconst_2        
	//  154  275:invokevirtual   #528 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//  155  278:istore_2        
				}
				i1 = j;
	//  156  279:iload_2         
	//  157  280:istore          4
				if(j == -2)
	//* 158  282:iload_2         
	//* 159  283:bipush          -2
	//* 160  285:icmpne          400
				{
					if(_inputPtr >= _inputEnd)
	//* 161  288:aload_0         
	//* 162  289:getfield        #71  <Field int _inputPtr>
	//* 163  292:aload_0         
	//* 164  293:getfield        #74  <Field int _inputEnd>
	//* 165  296:icmplt          303
						_loadMoreGuaranteed();
	//  166  299:aload_0         
	//  167  300:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
					abyte1 = _inputBuffer;
	//  168  303:aload_0         
	//  169  304:getfield        #68  <Field byte[] _inputBuffer>
	//  170  307:astore          8
					j = _inputPtr;
	//  171  309:aload_0         
	//  172  310:getfield        #71  <Field int _inputPtr>
	//  173  313:istore_2        
					_inputPtr = j + 1;
	//  174  314:aload_0         
	//  175  315:iload_2         
	//  176  316:iconst_1        
	//  177  317:iadd            
	//  178  318:putfield        #71  <Field int _inputPtr>
					j = abyte1[j] & 0xff;
	//  179  321:aload           8
	//  180  323:iload_2         
	//  181  324:baload          
	//  182  325:sipush          255
	//  183  328:iand            
	//  184  329:istore_2        
					if(base64variant.usesPaddingChar(j))
	//* 185  330:aload_1         
	//* 186  331:iload_2         
	//* 187  332:invokevirtual   #537 <Method boolean Base64Variant.usesPaddingChar(int)>
	//* 188  335:ifeq            350
					{
						((ByteArrayBuilder) (obj)).append(j1 >> 4);
	//  189  338:aload           7
	//  190  340:iload           5
	//  191  342:iconst_4        
	//  192  343:ishr            
	//  193  344:invokevirtual   #533 <Method void ByteArrayBuilder.append(int)>
					} else
	//* 194  347:goto            6
					{
						obj = ((Object) (new StringBuilder()));
	//  195  350:new             #345 <Class StringBuilder>
	//  196  353:dup             
	//  197  354:invokespecial   #347 <Method void StringBuilder()>
	//  198  357:astore          7
						((StringBuilder) (obj)).append("expected padding character '");
	//  199  359:aload           7
	//  200  361:ldc2            #539 <String "expected padding character '">
	//  201  364:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//  202  367:pop             
						((StringBuilder) (obj)).append(base64variant.getPaddingChar());
	//  203  368:aload           7
	//  204  370:aload_1         
	//  205  371:invokevirtual   #542 <Method char Base64Variant.getPaddingChar()>
	//  206  374:invokevirtual   #545 <Method StringBuilder StringBuilder.append(char)>
	//  207  377:pop             
						((StringBuilder) (obj)).append("'");
	//  208  378:aload           7
	//  209  380:ldc2            #547 <String "'">
	//  210  383:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//  211  386:pop             
						throw reportInvalidBase64Char(base64variant, j, 3, ((StringBuilder) (obj)).toString());
	//  212  387:aload_0         
	//  213  388:aload_1         
	//  214  389:iload_2         
	//  215  390:iconst_3        
	//  216  391:aload           7
	//  217  393:invokevirtual   #362 <Method String StringBuilder.toString()>
	//  218  396:invokevirtual   #551 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int, String)>
	//  219  399:athrow          
					}
					continue;
				}
			}
			j1 = j1 << 6 | i1;
	//  220  400:iload           5
	//  221  402:bipush          6
	//  222  404:ishl            
	//  223  405:iload           4
	//  224  407:ior             
	//  225  408:istore          5
			if(_inputPtr >= _inputEnd)
	//* 226  410:aload_0         
	//* 227  411:getfield        #71  <Field int _inputPtr>
	//* 228  414:aload_0         
	//* 229  415:getfield        #74  <Field int _inputEnd>
	//* 230  418:icmplt          425
				_loadMoreGuaranteed();
	//  231  421:aload_0         
	//  232  422:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
			abyte1 = _inputBuffer;
	//  233  425:aload_0         
	//  234  426:getfield        #68  <Field byte[] _inputBuffer>
	//  235  429:astore          8
			j = _inputPtr;
	//  236  431:aload_0         
	//  237  432:getfield        #71  <Field int _inputPtr>
	//  238  435:istore_2        
			_inputPtr = j + 1;
	//  239  436:aload_0         
	//  240  437:iload_2         
	//  241  438:iconst_1        
	//  242  439:iadd            
	//  243  440:putfield        #71  <Field int _inputPtr>
			k1 = abyte1[j] & 0xff;
	//  244  443:aload           8
	//  245  445:iload_2         
	//  246  446:baload          
	//  247  447:sipush          255
	//  248  450:iand            
	//  249  451:istore          6
			l = base64variant.decodeBase64Char(k1);
	//  250  453:aload_1         
	//  251  454:iload           6
	//  252  456:invokevirtual   #518 <Method int Base64Variant.decodeBase64Char(int)>
	//  253  459:istore_3        
			i1 = l;
	//  254  460:iload_3         
	//  255  461:istore          4
			if(l < 0)
	//* 256  463:iload_3         
	//* 257  464:ifge            534
			{
				int k = l;
	//  258  467:iload_3         
	//  259  468:istore_2        
				if(l != -2)
	//* 260  469:iload_3         
	//* 261  470:bipush          -2
	//* 262  472:icmpeq          513
				{
					if(k1 == 34 && !base64variant.usesPadding())
	//* 263  475:iload           6
	//* 264  477:bipush          34
	//* 265  479:icmpne          504
	//* 266  482:aload_1         
	//* 267  483:invokevirtual   #531 <Method boolean Base64Variant.usesPadding()>
	//* 268  486:ifne            504
					{
						((ByteArrayBuilder) (obj)).appendTwoBytes(j1 >> 2);
	//  269  489:aload           7
	//  270  491:iload           5
	//  271  493:iconst_2        
	//  272  494:ishr            
	//  273  495:invokevirtual   #554 <Method void ByteArrayBuilder.appendTwoBytes(int)>
						return ((ByteArrayBuilder) (obj)).toByteArray();
	//  274  498:aload           7
	//  275  500:invokevirtual   #524 <Method byte[] ByteArrayBuilder.toByteArray()>
	//  276  503:areturn         
					}
					k = _decodeBase64Escape(base64variant, k1, 3);
	//  277  504:aload_0         
	//  278  505:aload_1         
	//  279  506:iload           6
	//  280  508:iconst_3        
	//  281  509:invokevirtual   #528 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//  282  512:istore_2        
				}
				i1 = k;
	//  283  513:iload_2         
	//  284  514:istore          4
				if(k == -2)
	//* 285  516:iload_2         
	//* 286  517:bipush          -2
	//* 287  519:icmpne          534
				{
					((ByteArrayBuilder) (obj)).appendTwoBytes(j1 >> 2);
	//  288  522:aload           7
	//  289  524:iload           5
	//  290  526:iconst_2        
	//  291  527:ishr            
	//  292  528:invokevirtual   #554 <Method void ByteArrayBuilder.appendTwoBytes(int)>
					continue;
	//  293  531:goto            6
				}
			}
			((ByteArrayBuilder) (obj)).appendThreeBytes(j1 << 6 | i1);
	//  294  534:aload           7
	//  295  536:iload           5
	//  296  538:bipush          6
	//  297  540:ishl            
	//  298  541:iload           4
	//  299  543:ior             
	//  300  544:invokevirtual   #557 <Method void ByteArrayBuilder.appendThreeBytes(int)>
		} while(true);
	//  301  547:goto            6
	}

	protected int _decodeCharForError(int i)
		throws IOException
	{
		i &= 0xff;
	//    0    0:iload_1         
	//    1    1:sipush          255
	//    2    4:iand            
	//    3    5:istore_1        
		int j = i;
	//    4    6:iload_1         
	//    5    7:istore_2        
		if(i > 127)
	//*   6    8:iload_1         
	//*   7    9:bipush          127
	//*   8   11:icmple          211
		{
			if((i & 0xe0) == 192)
	//*   9   14:iload_1         
	//*  10   15:sipush          224
	//*  11   18:iand            
	//*  12   19:sipush          192
	//*  13   22:icmpne          35
			{
				j = i & 0x1f;
	//   14   25:iload_1         
	//   15   26:bipush          31
	//   16   28:iand            
	//   17   29:istore_2        
				i = 1;
	//   18   30:iconst_1        
	//   19   31:istore_1        
			} else
	//*  20   32:goto            92
			if((i & 0xf0) == 224)
	//*  21   35:iload_1         
	//*  22   36:sipush          240
	//*  23   39:iand            
	//*  24   40:sipush          224
	//*  25   43:icmpne          56
			{
				j = i & 0xf;
	//   26   46:iload_1         
	//   27   47:bipush          15
	//   28   49:iand            
	//   29   50:istore_2        
				i = 2;
	//   30   51:iconst_2        
	//   31   52:istore_1        
			} else
	//*  32   53:goto            92
			if((i & 0xf8) == 240)
	//*  33   56:iload_1         
	//*  34   57:sipush          248
	//*  35   60:iand            
	//*  36   61:sipush          240
	//*  37   64:icmpne          77
			{
				j = i & 7;
	//   38   67:iload_1         
	//   39   68:bipush          7
	//   40   70:iand            
	//   41   71:istore_2        
				i = 3;
	//   42   72:iconst_3        
	//   43   73:istore_1        
			} else
	//*  44   74:goto            92
			{
				_reportInvalidInitial(i & 0xff);
	//   45   77:aload_0         
	//   46   78:iload_1         
	//   47   79:sipush          255
	//   48   82:iand            
	//   49   83:invokevirtual   #442 <Method void _reportInvalidInitial(int)>
				boolean flag = true;
	//   50   86:iconst_1        
	//   51   87:istore_3        
				j = i;
	//   52   88:iload_1         
	//   53   89:istore_2        
				i = ((int) (flag));
	//   54   90:iload_3         
	//   55   91:istore_1        
			}
			int k = nextByte();
	//   56   92:aload_0         
	//   57   93:invokespecial   #559 <Method int nextByte()>
	//   58   96:istore_3        
			if((k & 0xc0) != 128)
	//*  59   97:iload_3         
	//*  60   98:sipush          192
	//*  61  101:iand            
	//*  62  102:sipush          128
	//*  63  105:icmpeq          117
				_reportInvalidOther(k & 0xff);
	//   64  108:aload_0         
	//   65  109:iload_3         
	//   66  110:sipush          255
	//   67  113:iand            
	//   68  114:invokevirtual   #449 <Method void _reportInvalidOther(int)>
			k = j << 6 | k & 0x3f;
	//   69  117:iload_2         
	//   70  118:bipush          6
	//   71  120:ishl            
	//   72  121:iload_3         
	//   73  122:bipush          63
	//   74  124:iand            
	//   75  125:ior             
	//   76  126:istore_3        
			j = k;
	//   77  127:iload_3         
	//   78  128:istore_2        
			if(i > 1)
	//*  79  129:iload_1         
	//*  80  130:iconst_1        
	//*  81  131:icmple          211
			{
				j = nextByte();
	//   82  134:aload_0         
	//   83  135:invokespecial   #559 <Method int nextByte()>
	//   84  138:istore_2        
				if((j & 0xc0) != 128)
	//*  85  139:iload_2         
	//*  86  140:sipush          192
	//*  87  143:iand            
	//*  88  144:sipush          128
	//*  89  147:icmpeq          159
					_reportInvalidOther(j & 0xff);
	//   90  150:aload_0         
	//   91  151:iload_2         
	//   92  152:sipush          255
	//   93  155:iand            
	//   94  156:invokevirtual   #449 <Method void _reportInvalidOther(int)>
				k = k << 6 | j & 0x3f;
	//   95  159:iload_3         
	//   96  160:bipush          6
	//   97  162:ishl            
	//   98  163:iload_2         
	//   99  164:bipush          63
	//  100  166:iand            
	//  101  167:ior             
	//  102  168:istore_3        
				j = k;
	//  103  169:iload_3         
	//  104  170:istore_2        
				if(i > 2)
	//* 105  171:iload_1         
	//* 106  172:iconst_2        
	//* 107  173:icmple          211
				{
					i = nextByte();
	//  108  176:aload_0         
	//  109  177:invokespecial   #559 <Method int nextByte()>
	//  110  180:istore_1        
					if((i & 0xc0) != 128)
	//* 111  181:iload_1         
	//* 112  182:sipush          192
	//* 113  185:iand            
	//* 114  186:sipush          128
	//* 115  189:icmpeq          201
						_reportInvalidOther(i & 0xff);
	//  116  192:aload_0         
	//  117  193:iload_1         
	//  118  194:sipush          255
	//  119  197:iand            
	//  120  198:invokevirtual   #449 <Method void _reportInvalidOther(int)>
					j = k << 6 | i & 0x3f;
	//  121  201:iload_3         
	//  122  202:bipush          6
	//  123  204:ishl            
	//  124  205:iload_1         
	//  125  206:bipush          63
	//  126  208:iand            
	//  127  209:ior             
	//  128  210:istore_2        
				}
			}
		}
		return j;
	//  129  211:iload_2         
	//  130  212:ireturn         
	}

	protected char _decodeEscaped()
		throws IOException
	{
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #74  <Field int _inputEnd>
	//*   4    8:icmplt          28
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #219 <Method boolean _loadMore()>
	//*   7   15:ifne            28
			_reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
	//    8   18:aload_0         
	//    9   19:ldc2            #561 <String " in character escape sequence">
	//   10   22:getstatic       #258 <Field JsonToken JsonToken.VALUE_STRING>
	//   11   25:invokevirtual   #332 <Method void _reportInvalidEOF(String, JsonToken)>
		byte abyte0[] = _inputBuffer;
	//   12   28:aload_0         
	//   13   29:getfield        #68  <Field byte[] _inputBuffer>
	//   14   32:astore          5
		int i = _inputPtr;
	//   15   34:aload_0         
	//   16   35:getfield        #71  <Field int _inputPtr>
	//   17   38:istore_1        
		_inputPtr = i + 1;
	//   18   39:aload_0         
	//   19   40:iload_1         
	//   20   41:iconst_1        
	//   21   42:iadd            
	//   22   43:putfield        #71  <Field int _inputPtr>
		i = ((int) (abyte0[i]));
	//   23   46:aload           5
	//   24   48:iload_1         
	//   25   49:baload          
	//   26   50:istore_1        
		if(i != 34 && i != 47 && i != 92)
	//*  27   51:iload_1         
	//*  28   52:bipush          34
	//*  29   54:icmpeq          238
	//*  30   57:iload_1         
	//*  31   58:bipush          47
	//*  32   60:icmpeq          238
	//*  33   63:iload_1         
	//*  34   64:bipush          92
	//*  35   66:icmpeq          238
		{
			if(i != 98)
	//*  36   69:iload_1         
	//*  37   70:bipush          98
	//*  38   72:icmpeq          235
			{
				if(i != 102)
	//*  39   75:iload_1         
	//*  40   76:bipush          102
	//*  41   78:icmpeq          232
				{
					if(i != 110)
	//*  42   81:iload_1         
	//*  43   82:bipush          110
	//*  44   84:icmpeq          229
					{
						if(i != 114)
	//*  45   87:iload_1         
	//*  46   88:bipush          114
	//*  47   90:icmpeq          226
							switch(i)
	//*  48   93:iload_1         
							{
	//*  49   94:tableswitch     116 117: default 116
	//	               116 223
	//	               117 127
							default:
								return _handleUnrecognizedCharacterEscape((char)_decodeCharForError(i));
	//   50  116:aload_0         
	//   51  117:aload_0         
	//   52  118:iload_1         
	//   53  119:invokevirtual   #91  <Method int _decodeCharForError(int)>
	//   54  122:int2char        
	//   55  123:invokevirtual   #565 <Method char _handleUnrecognizedCharacterEscape(char)>
	//   56  126:ireturn         

							case 117: // 'u'
								i = 0;
	//   57  127:iconst_0        
	//   58  128:istore_1        
								int j = 0;
	//   59  129:iconst_0        
	//   60  130:istore_2        
								for(; i < 4; i++)
	//*  61  131:iload_1         
	//*  62  132:iconst_4        
	//*  63  133:icmpge          220
								{
									if(_inputPtr >= _inputEnd && !_loadMore())
	//*  64  136:aload_0         
	//*  65  137:getfield        #71  <Field int _inputPtr>
	//*  66  140:aload_0         
	//*  67  141:getfield        #74  <Field int _inputEnd>
	//*  68  144:icmplt          164
	//*  69  147:aload_0         
	//*  70  148:invokevirtual   #219 <Method boolean _loadMore()>
	//*  71  151:ifne            164
										_reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
	//   72  154:aload_0         
	//   73  155:ldc2            #561 <String " in character escape sequence">
	//   74  158:getstatic       #258 <Field JsonToken JsonToken.VALUE_STRING>
	//   75  161:invokevirtual   #332 <Method void _reportInvalidEOF(String, JsonToken)>
									byte abyte1[] = _inputBuffer;
	//   76  164:aload_0         
	//   77  165:getfield        #68  <Field byte[] _inputBuffer>
	//   78  168:astore          5
									int k = _inputPtr;
	//   79  170:aload_0         
	//   80  171:getfield        #71  <Field int _inputPtr>
	//   81  174:istore_3        
									_inputPtr = k + 1;
	//   82  175:aload_0         
	//   83  176:iload_3         
	//   84  177:iconst_1        
	//   85  178:iadd            
	//   86  179:putfield        #71  <Field int _inputPtr>
									k = ((int) (abyte1[k]));
	//   87  182:aload           5
	//   88  184:iload_3         
	//   89  185:baload          
	//   90  186:istore_3        
									int l = CharTypes.charToHex(k);
	//   91  187:iload_3         
	//   92  188:invokestatic    #568 <Method int CharTypes.charToHex(int)>
	//   93  191:istore          4
									if(l < 0)
	//*  94  193:iload           4
	//*  95  195:ifge            206
										_reportUnexpectedChar(k, "expected a hex-digit for character escape sequence");
	//   96  198:aload_0         
	//   97  199:iload_3         
	//   98  200:ldc2            #570 <String "expected a hex-digit for character escape sequence">
	//   99  203:invokevirtual   #373 <Method void _reportUnexpectedChar(int, String)>
									j = j << 4 | l;
	//  100  206:iload_2         
	//  101  207:iconst_4        
	//  102  208:ishl            
	//  103  209:iload           4
	//  104  211:ior             
	//  105  212:istore_2        
								}

	//  106  213:iload_1         
	//  107  214:iconst_1        
	//  108  215:iadd            
	//  109  216:istore_1        
	//* 110  217:goto            131
								return (char)j;
	//  111  220:iload_2         
	//  112  221:int2char        
	//  113  222:ireturn         

							case 116: // 't'
								return '\t';
	//  114  223:bipush          9
	//  115  225:ireturn         
							}
						else
							return '\r';
	//  116  226:bipush          13
	//  117  228:ireturn         
					} else
					{
						return '\n';
	//  118  229:bipush          10
	//  119  231:ireturn         
					}
				} else
				{
					return '\f';
	//  120  232:bipush          12
	//  121  234:ireturn         
				}
			} else
			{
				return '\b';
	//  122  235:bipush          8
	//  123  237:ireturn         
			}
		} else
		{
			return (char)i;
	//  124  238:iload_1         
	//  125  239:int2char        
	//  126  240:ireturn         
		}
	}

	protected String _finishAndReturnString()
		throws IOException
	{
		int j = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int _inputPtr>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j >= _inputEnd)
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:getfield        #74  <Field int _inputEnd>
	//*   8   12:icmplt          24
		{
			_loadMoreGuaranteed();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
			i = _inputPtr;
	//   11   19:aload_0         
	//   12   20:getfield        #71  <Field int _inputPtr>
	//   13   23:istore_1        
		}
		j = 0;
	//   14   24:iconst_0        
	//   15   25:istore_2        
		char ac[] = _textBuffer.emptyAndGetCurrentSegment();
	//   16   26:aload_0         
	//   17   27:getfield        #172 <Field TextBuffer _textBuffer>
	//   18   30:invokevirtual   #439 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//   19   33:astore          5
		int ai[] = _icUTF8;
	//   20   35:getstatic       #35  <Field int[] _icUTF8>
	//   21   38:astore          6
		int k = Math.min(_inputEnd, ac.length + i);
	//   22   40:aload_0         
	//   23   41:getfield        #74  <Field int _inputEnd>
	//   24   44:aload           5
	//   25   46:arraylength     
	//   26   47:iload_1         
	//   27   48:iadd            
	//   28   49:invokestatic    #184 <Method int Math.min(int, int)>
	//   29   52:istore_3        
		byte abyte0[] = _inputBuffer;
	//   30   53:aload_0         
	//   31   54:getfield        #68  <Field byte[] _inputBuffer>
	//   32   57:astore          7
		do
		{
			if(i >= k)
				break;
	//   33   59:iload_1         
	//   34   60:iload_3         
	//   35   61:icmpge          123
			int l = abyte0[i] & 0xff;
	//   36   64:aload           7
	//   37   66:iload_1         
	//   38   67:baload          
	//   39   68:sipush          255
	//   40   71:iand            
	//   41   72:istore          4
			if(ai[l] != 0)
	//*  42   74:aload           6
	//*  43   76:iload           4
	//*  44   78:iaload          
	//*  45   79:ifeq            105
			{
				if(l == 34)
	//*  46   82:iload           4
	//*  47   84:bipush          34
	//*  48   86:icmpne          123
				{
					_inputPtr = i + 1;
	//   49   89:aload_0         
	//   50   90:iload_1         
	//   51   91:iconst_1        
	//   52   92:iadd            
	//   53   93:putfield        #71  <Field int _inputPtr>
					return _textBuffer.setCurrentAndReturn(j);
	//   54   96:aload_0         
	//   55   97:getfield        #172 <Field TextBuffer _textBuffer>
	//   56  100:iload_2         
	//   57  101:invokevirtual   #574 <Method String TextBuffer.setCurrentAndReturn(int)>
	//   58  104:areturn         
				}
				break;
			}
			i++;
	//   59  105:iload_1         
	//   60  106:iconst_1        
	//   61  107:iadd            
	//   62  108:istore_1        
			ac[j] = (char)l;
	//   63  109:aload           5
	//   64  111:iload_2         
	//   65  112:iload           4
	//   66  114:int2char        
	//   67  115:castore         
			j++;
	//   68  116:iload_2         
	//   69  117:iconst_1        
	//   70  118:iadd            
	//   71  119:istore_2        
		} while(true);
	//   72  120:goto            59
		_inputPtr = i;
	//   73  123:aload_0         
	//   74  124:iload_1         
	//   75  125:putfield        #71  <Field int _inputPtr>
		_finishString2(ac, j);
	//   76  128:aload_0         
	//   77  129:aload           5
	//   78  131:iload_2         
	//   79  132:invokespecial   #576 <Method void _finishString2(char[], int)>
		return _textBuffer.contentsAsString();
	//   80  135:aload_0         
	//   81  136:getfield        #172 <Field TextBuffer _textBuffer>
	//   82  139:invokevirtual   #579 <Method String TextBuffer.contentsAsString()>
	//   83  142:areturn         
	}

	protected void _finishString()
		throws IOException
	{
		int j = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int _inputPtr>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j >= _inputEnd)
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:getfield        #74  <Field int _inputEnd>
	//*   8   12:icmplt          24
		{
			_loadMoreGuaranteed();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
			i = _inputPtr;
	//   11   19:aload_0         
	//   12   20:getfield        #71  <Field int _inputPtr>
	//   13   23:istore_1        
		}
		j = 0;
	//   14   24:iconst_0        
	//   15   25:istore_2        
		char ac[] = _textBuffer.emptyAndGetCurrentSegment();
	//   16   26:aload_0         
	//   17   27:getfield        #172 <Field TextBuffer _textBuffer>
	//   18   30:invokevirtual   #439 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//   19   33:astore          5
		int ai[] = _icUTF8;
	//   20   35:getstatic       #35  <Field int[] _icUTF8>
	//   21   38:astore          6
		int k = Math.min(_inputEnd, ac.length + i);
	//   22   40:aload_0         
	//   23   41:getfield        #74  <Field int _inputEnd>
	//   24   44:aload           5
	//   25   46:arraylength     
	//   26   47:iload_1         
	//   27   48:iadd            
	//   28   49:invokestatic    #184 <Method int Math.min(int, int)>
	//   29   52:istore_3        
		byte abyte0[] = _inputBuffer;
	//   30   53:aload_0         
	//   31   54:getfield        #68  <Field byte[] _inputBuffer>
	//   32   57:astore          7
		do
		{
			if(i >= k)
				break;
	//   33   59:iload_1         
	//   34   60:iload_3         
	//   35   61:icmpge          123
			int l = abyte0[i] & 0xff;
	//   36   64:aload           7
	//   37   66:iload_1         
	//   38   67:baload          
	//   39   68:sipush          255
	//   40   71:iand            
	//   41   72:istore          4
			if(ai[l] != 0)
	//*  42   74:aload           6
	//*  43   76:iload           4
	//*  44   78:iaload          
	//*  45   79:ifeq            105
			{
				if(l == 34)
	//*  46   82:iload           4
	//*  47   84:bipush          34
	//*  48   86:icmpne          123
				{
					_inputPtr = i + 1;
	//   49   89:aload_0         
	//   50   90:iload_1         
	//   51   91:iconst_1        
	//   52   92:iadd            
	//   53   93:putfield        #71  <Field int _inputPtr>
					_textBuffer.setCurrentLength(j);
	//   54   96:aload_0         
	//   55   97:getfield        #172 <Field TextBuffer _textBuffer>
	//   56  100:iload_2         
	//   57  101:invokevirtual   #188 <Method void TextBuffer.setCurrentLength(int)>
					return;
	//   58  104:return          
				}
				break;
			}
			i++;
	//   59  105:iload_1         
	//   60  106:iconst_1        
	//   61  107:iadd            
	//   62  108:istore_1        
			ac[j] = (char)l;
	//   63  109:aload           5
	//   64  111:iload_2         
	//   65  112:iload           4
	//   66  114:int2char        
	//   67  115:castore         
			j++;
	//   68  116:iload_2         
	//   69  117:iconst_1        
	//   70  118:iadd            
	//   71  119:istore_2        
		} while(true);
	//   72  120:goto            59
		_inputPtr = i;
	//   73  123:aload_0         
	//   74  124:iload_1         
	//   75  125:putfield        #71  <Field int _inputPtr>
		_finishString2(ac, j);
	//   76  128:aload_0         
	//   77  129:aload           5
	//   78  131:iload_2         
	//   79  132:invokespecial   #576 <Method void _finishString2(char[], int)>
	//   80  135:return          
	}

	protected final String _getText2(JsonToken jsontoken)
	{
		if(jsontoken == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		switch(jsontoken.id())
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #585 <Method int JsonToken.id()>
		{
	//*   6   10:tableswitch     5 8: default 40
	//	               5 53
	//	               6 45
	//	               7 45
	//	               8 45
		default:
			return jsontoken.asString();
	//    7   40:aload_1         
	//    8   41:invokevirtual   #588 <Method String JsonToken.asString()>
	//    9   44:areturn         

		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
			return _textBuffer.contentsAsString();
	//   10   45:aload_0         
	//   11   46:getfield        #172 <Field TextBuffer _textBuffer>
	//   12   49:invokevirtual   #579 <Method String TextBuffer.contentsAsString()>
	//   13   52:areturn         

		case 5: // '\005'
			return _parsingContext.getCurrentName();
	//   14   53:aload_0         
	//   15   54:getfield        #118 <Field JsonReadContext _parsingContext>
	//   16   57:invokevirtual   #591 <Method String JsonReadContext.getCurrentName()>
	//   17   60:areturn         
		}
	}

	protected JsonToken _handleApos()
		throws IOException
	{
		char ac1[] = _textBuffer.emptyAndGetCurrentSegment();
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #439 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//    3    7:astore          7
		int ai[] = _icUTF8;
	//    4    9:getstatic       #35  <Field int[] _icUTF8>
	//    5   12:astore          8
		byte abyte0[] = _inputBuffer;
	//    6   14:aload_0         
	//    7   15:getfield        #68  <Field byte[] _inputBuffer>
	//    8   18:astore          9
		int i = 0;
	//    9   20:iconst_0        
	//   10   21:istore_1        
label0:
		do
		{
			int j;
			char ac[];
label1:
			{
				if(_inputPtr >= _inputEnd)
	//*  11   22:aload_0         
	//*  12   23:getfield        #71  <Field int _inputPtr>
	//*  13   26:aload_0         
	//*  14   27:getfield        #74  <Field int _inputEnd>
	//*  15   30:icmplt          37
					_loadMoreGuaranteed();
	//   16   33:aload_0         
	//   17   34:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
				ac = ac1;
	//   18   37:aload           7
	//   19   39:astore          6
				int k = i;
	//   20   41:iload_1         
	//   21   42:istore_3        
				if(i >= ac1.length)
	//*  22   43:iload_1         
	//*  23   44:aload           7
	//*  24   46:arraylength     
	//*  25   47:icmplt          61
				{
					ac = _textBuffer.finishCurrentSegment();
	//   26   50:aload_0         
	//   27   51:getfield        #172 <Field TextBuffer _textBuffer>
	//   28   54:invokevirtual   #178 <Method char[] TextBuffer.finishCurrentSegment()>
	//   29   57:astore          6
					k = 0;
	//   30   59:iconst_0        
	//   31   60:istore_3        
				}
				i = _inputEnd;
	//   32   61:aload_0         
	//   33   62:getfield        #74  <Field int _inputEnd>
	//   34   65:istore_1        
				int l1 = _inputPtr + (ac.length - k);
	//   35   66:aload_0         
	//   36   67:getfield        #71  <Field int _inputPtr>
	//   37   70:aload           6
	//   38   72:arraylength     
	//   39   73:iload_3         
	//   40   74:isub            
	//   41   75:iadd            
	//   42   76:istore          5
				j = k;
	//   43   78:iload_3         
	//   44   79:istore_2        
				int j1 = i;
	//   45   80:iload_1         
	//   46   81:istore          4
				if(l1 < i)
	//*  47   83:iload           5
	//*  48   85:iload_1         
	//*  49   86:icmpge          95
				{
					j1 = l1;
	//   50   89:iload           5
	//   51   91:istore          4
					j = k;
	//   52   93:iload_3         
	//   53   94:istore_2        
				}
				do
				{
					ac1 = ac;
	//   54   95:aload           6
	//   55   97:astore          7
					i = j;
	//   56   99:iload_2         
	//   57  100:istore_1        
					if(_inputPtr >= j1)
						continue label0;
	//   58  101:aload_0         
	//   59  102:getfield        #71  <Field int _inputPtr>
	//   60  105:iload           4
	//   61  107:icmpge          22
					i = _inputPtr;
	//   62  110:aload_0         
	//   63  111:getfield        #71  <Field int _inputPtr>
	//   64  114:istore_1        
					_inputPtr = i + 1;
	//   65  115:aload_0         
	//   66  116:iload_1         
	//   67  117:iconst_1        
	//   68  118:iadd            
	//   69  119:putfield        #71  <Field int _inputPtr>
					i = abyte0[i] & 0xff;
	//   70  122:aload           9
	//   71  124:iload_1         
	//   72  125:baload          
	//   73  126:sipush          255
	//   74  129:iand            
	//   75  130:istore_1        
					if(i == 39 || ai[i] != 0)
	//*  76  131:iload_1         
	//*  77  132:bipush          39
	//*  78  134:icmpeq          160
	//*  79  137:aload           8
	//*  80  139:iload_1         
	//*  81  140:iaload          
	//*  82  141:ifeq            147
						break;
	//   83  144:goto            160
					ac[j] = (char)i;
	//   84  147:aload           6
	//   85  149:iload_2         
	//   86  150:iload_1         
	//   87  151:int2char        
	//   88  152:castore         
					j++;
	//   89  153:iload_2         
	//   90  154:iconst_1        
	//   91  155:iadd            
	//   92  156:istore_2        
				} while(true);
	//   93  157:goto            95
				if(i == 39)
	//*  94  160:iload_1         
	//*  95  161:bipush          39
	//*  96  163:icmpne          178
				{
					_textBuffer.setCurrentLength(j);
	//   97  166:aload_0         
	//   98  167:getfield        #172 <Field TextBuffer _textBuffer>
	//   99  170:iload_2         
	//  100  171:invokevirtual   #188 <Method void TextBuffer.setCurrentLength(int)>
					return JsonToken.VALUE_STRING;
	//  101  174:getstatic       #258 <Field JsonToken JsonToken.VALUE_STRING>
	//  102  177:areturn         
				}
				switch(ai[i])
	//* 103  178:aload           8
	//* 104  180:iload_1         
	//* 105  181:iaload          
				{
	//* 106  182:tableswitch     1 4: default 212
	//	               1 337
	//	               2 328
	//	               3 297
	//	               4 228
				default:
					if(i < 32)
	//* 107  212:iload_1         
	//* 108  213:bipush          32
	//* 109  215:icmpge          345
						_throwUnquotedSpace(i, "string value");
	//  110  218:aload_0         
	//  111  219:iload_1         
	//  112  220:ldc1            #190 <String "string value">
	//  113  222:invokevirtual   #194 <Method void _throwUnquotedSpace(int, String)>
					break;

	//* 114  225:goto            345
				case 4: // '\004'
					int k1 = _decodeUtf8_4(i);
	//  115  228:aload_0         
	//  116  229:iload_1         
	//  117  230:invokespecial   #196 <Method int _decodeUtf8_4(int)>
	//  118  233:istore          4
					int l = j + 1;
	//  119  235:iload_2         
	//  120  236:iconst_1        
	//  121  237:iadd            
	//  122  238:istore_3        
					ac[j] = (char)(0xd800 | k1 >> 10);
	//  123  239:aload           6
	//  124  241:iload_2         
	//  125  242:ldc1            #197 <Int 55296>
	//  126  244:iload           4
	//  127  246:bipush          10
	//  128  248:ishr            
	//  129  249:ior             
	//  130  250:int2char        
	//  131  251:castore         
					ac1 = ac;
	//  132  252:aload           6
	//  133  254:astore          7
					i = l;
	//  134  256:iload_3         
	//  135  257:istore_1        
					if(l >= ac.length)
	//* 136  258:iload_3         
	//* 137  259:aload           6
	//* 138  261:arraylength     
	//* 139  262:icmplt          276
					{
						ac1 = _textBuffer.finishCurrentSegment();
	//  140  265:aload_0         
	//  141  266:getfield        #172 <Field TextBuffer _textBuffer>
	//  142  269:invokevirtual   #178 <Method char[] TextBuffer.finishCurrentSegment()>
	//  143  272:astore          7
						i = 0;
	//  144  274:iconst_0        
	//  145  275:istore_1        
					}
					l = 0xdc00 | k1 & 0x3ff;
	//  146  276:ldc1            #198 <Int 56320>
	//  147  278:iload           4
	//  148  280:sipush          1023
	//  149  283:iand            
	//  150  284:ior             
	//  151  285:istore_3        
					ac = ac1;
	//  152  286:aload           7
	//  153  288:astore          6
					j = i;
	//  154  290:iload_1         
	//  155  291:istore_2        
					i = l;
	//  156  292:iload_3         
	//  157  293:istore_1        
					break label1;
	//  158  294:goto            350

				case 3: // '\003'
					if(_inputEnd - _inputPtr >= 2)
	//* 159  297:aload_0         
	//* 160  298:getfield        #74  <Field int _inputEnd>
	//* 161  301:aload_0         
	//* 162  302:getfield        #71  <Field int _inputPtr>
	//* 163  305:isub            
	//* 164  306:iconst_2        
	//* 165  307:icmplt          319
						i = _decodeUtf8_3fast(i);
	//  166  310:aload_0         
	//  167  311:iload_1         
	//  168  312:invokespecial   #200 <Method int _decodeUtf8_3fast(int)>
	//  169  315:istore_1        
					else
	//* 170  316:goto            350
						i = _decodeUtf8_3(i);
	//  171  319:aload_0         
	//  172  320:iload_1         
	//  173  321:invokespecial   #202 <Method int _decodeUtf8_3(int)>
	//  174  324:istore_1        
					break label1;
	//  175  325:goto            350

				case 2: // '\002'
					i = _decodeUtf8_2(i);
	//  176  328:aload_0         
	//  177  329:iload_1         
	//  178  330:invokespecial   #204 <Method int _decodeUtf8_2(int)>
	//  179  333:istore_1        
					break label1;
	//  180  334:goto            350

				case 1: // '\001'
					i = ((int) (_decodeEscaped()));
	//  181  337:aload_0         
	//  182  338:invokevirtual   #208 <Method char _decodeEscaped()>
	//  183  341:istore_1        
					break label1;
	//  184  342:goto            350
				}
				_reportInvalidChar(i);
	//  185  345:aload_0         
	//  186  346:iload_1         
	//  187  347:invokevirtual   #211 <Method void _reportInvalidChar(int)>
			}
			ac1 = ac;
	//  188  350:aload           6
	//  189  352:astore          7
			int i1 = j;
	//  190  354:iload_2         
	//  191  355:istore_3        
			if(j >= ac.length)
	//* 192  356:iload_2         
	//* 193  357:aload           6
	//* 194  359:arraylength     
	//* 195  360:icmplt          374
			{
				ac1 = _textBuffer.finishCurrentSegment();
	//  196  363:aload_0         
	//  197  364:getfield        #172 <Field TextBuffer _textBuffer>
	//  198  367:invokevirtual   #178 <Method char[] TextBuffer.finishCurrentSegment()>
	//  199  370:astore          7
				i1 = 0;
	//  200  372:iconst_0        
	//  201  373:istore_3        
			}
			ac1[i1] = (char)i;
	//  202  374:aload           7
	//  203  376:iload_3         
	//  204  377:iload_1         
	//  205  378:int2char        
	//  206  379:castore         
			i = i1 + 1;
	//  207  380:iload_3         
	//  208  381:iconst_1        
	//  209  382:iadd            
	//  210  383:istore_1        
		} while(true);
	//  211  384:goto            22
	}

	protected JsonToken _handleInvalidNumberStart(int i, boolean flag)
		throws IOException
	{
		int j;
		do
		{
			j = i;
	//    0    0:iload_1         
	//    1    1:istore          5
			if(i != 73)
				break;
	//    2    3:iload_1         
	//    3    4:bipush          73
	//    4    6:icmpne          161
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*   5    9:aload_0         
	//*   6   10:getfield        #71  <Field int _inputPtr>
	//*   7   13:aload_0         
	//*   8   14:getfield        #74  <Field int _inputEnd>
	//*   9   17:icmplt          34
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #219 <Method boolean _loadMore()>
	//*  12   24:ifne            34
				_reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_FLOAT);
	//   13   27:aload_0         
	//   14   28:getstatic       #597 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//   15   31:invokevirtual   #601 <Method void _reportInvalidEOFInValue(JsonToken)>
			byte abyte0[] = _inputBuffer;
	//   16   34:aload_0         
	//   17   35:getfield        #68  <Field byte[] _inputBuffer>
	//   18   38:astore          6
			i = _inputPtr;
	//   19   40:aload_0         
	//   20   41:getfield        #71  <Field int _inputPtr>
	//   21   44:istore_1        
			_inputPtr = i + 1;
	//   22   45:aload_0         
	//   23   46:iload_1         
	//   24   47:iconst_1        
	//   25   48:iadd            
	//   26   49:putfield        #71  <Field int _inputPtr>
			i = ((int) (abyte0[i]));
	//   27   52:aload           6
	//   28   54:iload_1         
	//   29   55:baload          
	//   30   56:istore_1        
			String s;
			if(i == 78)
	//*  31   57:iload_1         
	//*  32   58:bipush          78
	//*  33   60:icmpne          83
			{
				if(flag)
	//*  34   63:iload_2         
	//*  35   64:ifeq            75
					s = "-INF";
	//   36   67:ldc2            #603 <String "-INF">
	//   37   70:astore          6
				else
	//*  38   72:goto            109
					s = "+INF";
	//   39   75:ldc2            #605 <String "+INF">
	//   40   78:astore          6
			} else
	//*  41   80:goto            109
			{
				j = i;
	//   42   83:iload_1         
	//   43   84:istore          5
				if(i != 110)
					break;
	//   44   86:iload_1         
	//   45   87:bipush          110
	//   46   89:icmpne          161
				if(flag)
	//*  47   92:iload_2         
	//*  48   93:ifeq            104
					s = "-Infinity";
	//   49   96:ldc2            #607 <String "-Infinity">
	//   50   99:astore          6
				else
	//*  51  101:goto            109
					s = "+Infinity";
	//   52  104:ldc2            #609 <String "+Infinity">
	//   53  107:astore          6
			}
			_matchToken(s, 3);
	//   54  109:aload_0         
	//   55  110:aload           6
	//   56  112:iconst_3        
	//   57  113:invokevirtual   #612 <Method void _matchToken(String, int)>
			if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
	//*  58  116:aload_0         
	//*  59  117:getstatic       #615 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  60  120:invokevirtual   #383 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  61  123:ifeq            149
			{
				double d;
				if(flag)
	//*  62  126:iload_2         
	//*  63  127:ifeq            137
					d = (-1.0D / 0.0D);
	//   64  130:ldc2w           #616 <Double (-1.0D / 0.0D)>
	//   65  133:dstore_3        
				else
	//*  66  134:goto            141
					d = (1.0D / 0.0D);
	//   67  137:ldc2w           #618 <Double (1.0D / 0.0D)>
	//   68  140:dstore_3        
				return resetAsNaN(s, d);
	//   69  141:aload_0         
	//   70  142:aload           6
	//   71  144:dload_3         
	//   72  145:invokevirtual   #623 <Method JsonToken resetAsNaN(String, double)>
	//   73  148:areturn         
			}
			_reportError("Non-standard token '%s': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow", ((Object) (s)));
	//   74  149:aload_0         
	//   75  150:ldc2            #625 <String "Non-standard token '%s': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//   76  153:aload           6
	//   77  155:invokevirtual   #629 <Method void _reportError(String, Object)>
		} while(true);
	//   78  158:goto            0
		reportUnexpectedNumberChar(j, "expected digit (0-9) to follow minus sign, for valid numeric value");
	//   79  161:aload_0         
	//   80  162:iload           5
	//   81  164:ldc2            #631 <String "expected digit (0-9) to follow minus sign, for valid numeric value">
	//   82  167:invokevirtual   #293 <Method void reportUnexpectedNumberChar(int, String)>
		return null;
	//   83  170:aconst_null     
	//   84  171:areturn         
	}

	protected String _handleOddName(int i)
		throws IOException
	{
		if(i == 39 && isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES))
	//*   0    0:iload_1         
	//*   1    1:bipush          39
	//*   2    3:icmpne          21
	//*   3    6:aload_0         
	//*   4    7:getstatic       #635 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_SINGLE_QUOTES>
	//*   5   10:invokevirtual   #383 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   6   13:ifeq            21
			return _parseAposName();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #638 <Method String _parseAposName()>
	//    9   20:areturn         
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES))
	//*  10   21:aload_0         
	//*  11   22:getstatic       #641 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_UNQUOTED_FIELD_NAMES>
	//*  12   25:invokevirtual   #383 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  13   28:ifne            44
			_reportUnexpectedChar(((int) ((char)_decodeCharForError(i))), "was expecting double-quote to start field name");
	//   14   31:aload_0         
	//   15   32:aload_0         
	//   16   33:iload_1         
	//   17   34:invokevirtual   #91  <Method int _decodeCharForError(int)>
	//   18   37:int2char        
	//   19   38:ldc2            #643 <String "was expecting double-quote to start field name">
	//   20   41:invokevirtual   #373 <Method void _reportUnexpectedChar(int, String)>
		int ai3[] = CharTypes.getInputCodeUtf8JsNames();
	//   21   44:invokestatic    #646 <Method int[] CharTypes.getInputCodeUtf8JsNames()>
	//   22   47:astore          8
		if(ai3[i] != 0)
	//*  23   49:aload           8
	//*  24   51:iload_1         
	//*  25   52:iaload          
	//*  26   53:ifeq            64
			_reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
	//   27   56:aload_0         
	//   28   57:iload_1         
	//   29   58:ldc2            #648 <String "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name">
	//   30   61:invokevirtual   #373 <Method void _reportUnexpectedChar(int, String)>
		int ai[] = _quadBuffer;
	//   31   64:aload_0         
	//   32   65:getfield        #60  <Field int[] _quadBuffer>
	//   33   68:astore          6
		int l = 0;
	//   34   70:iconst_0        
	//   35   71:istore          4
		int j = i;
	//   36   73:iload_1         
	//   37   74:istore_2        
		i = 0;
	//   38   75:iconst_0        
	//   39   76:istore_1        
		int k = 0;
	//   40   77:iconst_0        
	//   41   78:istore_3        
		do
		{
			if(l < 4)
	//*  42   79:iload           4
	//*  43   81:iconst_4        
	//*  44   82:icmpge          104
			{
				l++;
	//   45   85:iload           4
	//   46   87:iconst_1        
	//   47   88:iadd            
	//   48   89:istore          4
				k = k << 8 | j;
	//   49   91:iload_3         
	//   50   92:bipush          8
	//   51   94:ishl            
	//   52   95:iload_2         
	//   53   96:ior             
	//   54   97:istore_3        
				j = l;
	//   55   98:iload           4
	//   56  100:istore_2        
			} else
	//*  57  101:goto            152
			{
				int ai1[] = ai;
	//   58  104:aload           6
	//   59  106:astore          7
				if(i >= ai.length)
	//*  60  108:iload_1         
	//*  61  109:aload           6
	//*  62  111:arraylength     
	//*  63  112:icmplt          131
				{
					ai1 = growArrayBy(ai, ai.length);
	//   64  115:aload           6
	//   65  117:aload           6
	//   66  119:arraylength     
	//   67  120:invokestatic    #479 <Method int[] growArrayBy(int[], int)>
	//   68  123:astore          7
					_quadBuffer = ai1;
	//   69  125:aload_0         
	//   70  126:aload           7
	//   71  128:putfield        #60  <Field int[] _quadBuffer>
				}
				ai1[i] = k;
	//   72  131:aload           7
	//   73  133:iload_1         
	//   74  134:iload_3         
	//   75  135:iastore         
				i++;
	//   76  136:iload_1         
	//   77  137:iconst_1        
	//   78  138:iadd            
	//   79  139:istore_1        
				l = 1;
	//   80  140:iconst_1        
	//   81  141:istore          4
				k = j;
	//   82  143:iload_2         
	//   83  144:istore_3        
				j = l;
	//   84  145:iload           4
	//   85  147:istore_2        
				ai = ai1;
	//   86  148:aload           7
	//   87  150:astore          6
			}
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*  88  152:aload_0         
	//*  89  153:getfield        #71  <Field int _inputPtr>
	//*  90  156:aload_0         
	//*  91  157:getfield        #74  <Field int _inputEnd>
	//*  92  160:icmplt          180
	//*  93  163:aload_0         
	//*  94  164:invokevirtual   #219 <Method boolean _loadMore()>
	//*  95  167:ifne            180
				_reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
	//   96  170:aload_0         
	//   97  171:ldc2            #444 <String " in field name">
	//   98  174:getstatic       #447 <Field JsonToken JsonToken.FIELD_NAME>
	//   99  177:invokevirtual   #332 <Method void _reportInvalidEOF(String, JsonToken)>
			int i1 = _inputBuffer[_inputPtr] & 0xff;
	//  100  180:aload_0         
	//  101  181:getfield        #68  <Field byte[] _inputBuffer>
	//  102  184:aload_0         
	//  103  185:getfield        #71  <Field int _inputPtr>
	//  104  188:baload          
	//  105  189:sipush          255
	//  106  192:iand            
	//  107  193:istore          5
			if(ai3[i1] != 0)
	//* 108  195:aload           8
	//* 109  197:iload           5
	//* 110  199:iaload          
	//* 111  200:ifeq            287
			{
				int ai2[] = ai;
	//  112  203:aload           6
	//  113  205:astore          7
				l = i;
	//  114  207:iload_1         
	//  115  208:istore          4
				if(j > 0)
	//* 116  210:iload_2         
	//* 117  211:ifle            251
				{
					ai2 = ai;
	//  118  214:aload           6
	//  119  216:astore          7
					if(i >= ai.length)
	//* 120  218:iload_1         
	//* 121  219:aload           6
	//* 122  221:arraylength     
	//* 123  222:icmplt          241
					{
						ai2 = growArrayBy(ai, ai.length);
	//  124  225:aload           6
	//  125  227:aload           6
	//  126  229:arraylength     
	//  127  230:invokestatic    #479 <Method int[] growArrayBy(int[], int)>
	//  128  233:astore          7
						_quadBuffer = ai2;
	//  129  235:aload_0         
	//  130  236:aload           7
	//  131  238:putfield        #60  <Field int[] _quadBuffer>
					}
					ai2[i] = k;
	//  132  241:aload           7
	//  133  243:iload_1         
	//  134  244:iload_3         
	//  135  245:iastore         
					l = i + 1;
	//  136  246:iload_1         
	//  137  247:iconst_1        
	//  138  248:iadd            
	//  139  249:istore          4
				}
				String s1 = _symbols.findName(ai2, l);
	//  140  251:aload_0         
	//  141  252:getfield        #66  <Field ByteQuadsCanonicalizer _symbols>
	//  142  255:aload           7
	//  143  257:iload           4
	//  144  259:invokevirtual   #482 <Method String ByteQuadsCanonicalizer.findName(int[], int)>
	//  145  262:astore          8
				String s = s1;
	//  146  264:aload           8
	//  147  266:astore          6
				if(s1 == null)
	//* 148  268:aload           8
	//* 149  270:ifnonnull       284
					s = addName(ai2, l, j);
	//  150  273:aload_0         
	//  151  274:aload           7
	//  152  276:iload           4
	//  153  278:iload_2         
	//  154  279:invokespecial   #468 <Method String addName(int[], int, int)>
	//  155  282:astore          6
				return s;
	//  156  284:aload           6
	//  157  286:areturn         
			}
			_inputPtr = _inputPtr + 1;
	//  158  287:aload_0         
	//  159  288:aload_0         
	//  160  289:getfield        #71  <Field int _inputPtr>
	//  161  292:iconst_1        
	//  162  293:iadd            
	//  163  294:putfield        #71  <Field int _inputPtr>
			l = j;
	//  164  297:iload_2         
	//  165  298:istore          4
			j = i1;
	//  166  300:iload           5
	//  167  302:istore_2        
		} while(true);
	//  168  303:goto            79
	}

	protected JsonToken _handleUnexpectedValue(int i)
		throws IOException
	{
label0:
		{
label1:
			{
label2:
				{
label3:
					{
label4:
						{
							if(i == 39)
								break label1;
	//    0    0:iload_1         
	//    1    1:bipush          39
	//    2    3:icmpeq          236
							if(i == 73)
								break label2;
	//    3    6:iload_1         
	//    4    7:bipush          73
	//    5    9:icmpeq          197
							if(i == 78)
								break label3;
	//    6   12:iload_1         
	//    7   13:bipush          78
	//    8   15:icmpeq          158
							if(i != 93)
	//*   9   18:iload_1         
	//*  10   19:bipush          93
	//*  11   21:icmpeq          110
							{
								if(i == 125)
									break label4;
	//   12   24:iload_1         
	//   13   25:bipush          125
	//   14   27:icmpeq          147
								switch(i)
	//*  15   30:iload_1         
								{
	//*  16   31:tableswitch     43 44: default 52
	//	               43 55
	//	               44 123
								default:
									break label0;
	//   17   52:goto            251

								case 43: // '+'
									if(_inputPtr >= _inputEnd && !_loadMore())
	//*  18   55:aload_0         
	//*  19   56:getfield        #71  <Field int _inputPtr>
	//*  20   59:aload_0         
	//*  21   60:getfield        #74  <Field int _inputEnd>
	//*  22   63:icmplt          80
	//*  23   66:aload_0         
	//*  24   67:invokevirtual   #219 <Method boolean _loadMore()>
	//*  25   70:ifne            80
										_reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_INT);
	//   26   73:aload_0         
	//   27   74:getstatic       #651 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//   28   77:invokevirtual   #601 <Method void _reportInvalidEOFInValue(JsonToken)>
									byte abyte0[] = _inputBuffer;
	//   29   80:aload_0         
	//   30   81:getfield        #68  <Field byte[] _inputBuffer>
	//   31   84:astore_2        
									i = _inputPtr;
	//   32   85:aload_0         
	//   33   86:getfield        #71  <Field int _inputPtr>
	//   34   89:istore_1        
									_inputPtr = i + 1;
	//   35   90:aload_0         
	//   36   91:iload_1         
	//   37   92:iconst_1        
	//   38   93:iadd            
	//   39   94:putfield        #71  <Field int _inputPtr>
									return _handleInvalidNumberStart(abyte0[i] & 0xff, false);
	//   40   97:aload_0         
	//   41   98:aload_2         
	//   42   99:iload_1         
	//   43  100:baload          
	//   44  101:sipush          255
	//   45  104:iand            
	//   46  105:iconst_0        
	//   47  106:invokevirtual   #653 <Method JsonToken _handleInvalidNumberStart(int, boolean)>
	//   48  109:areturn         

								case 44: // ','
									break;
								}
							} else
							if(!_parsingContext.inArray())
	//*  49  110:aload_0         
	//*  50  111:getfield        #118 <Field JsonReadContext _parsingContext>
	//*  51  114:invokevirtual   #124 <Method boolean JsonReadContext.inArray()>
	//*  52  117:ifne            123
								break label0;
	//   53  120:goto            251
							if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES))
	//*  54  123:aload_0         
	//*  55  124:getstatic       #656 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_MISSING_VALUES>
	//*  56  127:invokevirtual   #383 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  57  130:ifeq            147
							{
								_inputPtr = _inputPtr - 1;
	//   58  133:aload_0         
	//   59  134:aload_0         
	//   60  135:getfield        #71  <Field int _inputPtr>
	//   61  138:iconst_1        
	//   62  139:isub            
	//   63  140:putfield        #71  <Field int _inputPtr>
								return JsonToken.VALUE_NULL;
	//   64  143:getstatic       #276 <Field JsonToken JsonToken.VALUE_NULL>
	//   65  146:areturn         
							}
						}
						_reportUnexpectedChar(i, "expected a value");
	//   66  147:aload_0         
	//   67  148:iload_1         
	//   68  149:ldc2            #658 <String "expected a value">
	//   69  152:invokevirtual   #373 <Method void _reportUnexpectedChar(int, String)>
						break label1;
	//   70  155:goto            236
					}
					_matchToken("NaN", 1);
	//   71  158:aload_0         
	//   72  159:ldc2            #660 <String "NaN">
	//   73  162:iconst_1        
	//   74  163:invokevirtual   #612 <Method void _matchToken(String, int)>
					if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
	//*  75  166:aload_0         
	//*  76  167:getstatic       #615 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  77  170:invokevirtual   #383 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  78  173:ifeq            187
						return resetAsNaN("NaN", (0.0D / 0.0D));
	//   79  176:aload_0         
	//   80  177:ldc2            #660 <String "NaN">
	//   81  180:ldc2w           #661 <Double (0.0D / 0.0D)>
	//   82  183:invokevirtual   #623 <Method JsonToken resetAsNaN(String, double)>
	//   83  186:areturn         
					_reportError("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
	//   84  187:aload_0         
	//   85  188:ldc2            #664 <String "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//   86  191:invokevirtual   #666 <Method void _reportError(String)>
					break label0;
	//   87  194:goto            251
				}
				_matchToken("Infinity", 1);
	//   88  197:aload_0         
	//   89  198:ldc2            #668 <String "Infinity">
	//   90  201:iconst_1        
	//   91  202:invokevirtual   #612 <Method void _matchToken(String, int)>
				if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
	//*  92  205:aload_0         
	//*  93  206:getstatic       #615 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  94  209:invokevirtual   #383 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  95  212:ifeq            226
					return resetAsNaN("Infinity", (1.0D / 0.0D));
	//   96  215:aload_0         
	//   97  216:ldc2            #668 <String "Infinity">
	//   98  219:ldc2w           #618 <Double (1.0D / 0.0D)>
	//   99  222:invokevirtual   #623 <Method JsonToken resetAsNaN(String, double)>
	//  100  225:areturn         
				_reportError("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
	//  101  226:aload_0         
	//  102  227:ldc2            #670 <String "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//  103  230:invokevirtual   #666 <Method void _reportError(String)>
				break label0;
	//  104  233:goto            251
			}
			if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES))
	//* 105  236:aload_0         
	//* 106  237:getstatic       #635 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_SINGLE_QUOTES>
	//* 107  240:invokevirtual   #383 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//* 108  243:ifeq            251
				return _handleApos();
	//  109  246:aload_0         
	//  110  247:invokevirtual   #672 <Method JsonToken _handleApos()>
	//  111  250:areturn         
		}
		if(Character.isJavaIdentifierStart(i))
	//* 112  251:iload_1         
	//* 113  252:invokestatic    #675 <Method boolean Character.isJavaIdentifierStart(int)>
	//* 114  255:ifeq            292
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  115  258:new             #345 <Class StringBuilder>
	//  116  261:dup             
	//  117  262:invokespecial   #347 <Method void StringBuilder()>
	//  118  265:astore_2        
			stringbuilder.append("");
	//  119  266:aload_2         
	//  120  267:ldc2            #677 <String "">
	//  121  270:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//  122  273:pop             
			stringbuilder.append((char)i);
	//  123  274:aload_2         
	//  124  275:iload_1         
	//  125  276:int2char        
	//  126  277:invokevirtual   #545 <Method StringBuilder StringBuilder.append(char)>
	//  127  280:pop             
			_reportInvalidToken(stringbuilder.toString(), "('true', 'false' or 'null')");
	//  128  281:aload_0         
	//  129  282:aload_2         
	//  130  283:invokevirtual   #362 <Method String StringBuilder.toString()>
	//  131  286:ldc2            #679 <String "('true', 'false' or 'null')">
	//  132  289:invokevirtual   #682 <Method void _reportInvalidToken(String, String)>
		}
		_reportUnexpectedChar(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
	//  133  292:aload_0         
	//  134  293:iload_1         
	//  135  294:ldc2            #684 <String "expected a valid value (number, String, array, object, 'true', 'false' or 'null')">
	//  136  297:invokevirtual   #373 <Method void _reportUnexpectedChar(int, String)>
		return null;
	//  137  300:aconst_null     
	//  138  301:areturn         
	}

	protected final boolean _loadMore()
		throws IOException
	{
		int i = _inputEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field int _inputEnd>
	//    2    4:istore_1        
		_currInputProcessed = _currInputProcessed + (long)_inputEnd;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #81  <Field long _currInputProcessed>
	//    6   10:aload_0         
	//    7   11:getfield        #74  <Field int _inputEnd>
	//    8   14:i2l             
	//    9   15:ladd            
	//   10   16:putfield        #81  <Field long _currInputProcessed>
		_currInputRowStart = _currInputRowStart - _inputEnd;
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #77  <Field int _currInputRowStart>
	//   14   24:aload_0         
	//   15   25:getfield        #74  <Field int _inputEnd>
	//   16   28:isub            
	//   17   29:putfield        #77  <Field int _currInputRowStart>
		_nameStartOffset = _nameStartOffset - i;
	//   18   32:aload_0         
	//   19   33:aload_0         
	//   20   34:getfield        #420 <Field int _nameStartOffset>
	//   21   37:iload_1         
	//   22   38:isub            
	//   23   39:putfield        #420 <Field int _nameStartOffset>
		InputStream inputstream = _inputStream;
	//   24   42:aload_0         
	//   25   43:getfield        #62  <Field InputStream _inputStream>
	//   26   46:astore_2        
		if(inputstream != null)
	//*  27   47:aload_2         
	//*  28   48:ifnull          145
		{
			byte abyte0[] = _inputBuffer;
	//   29   51:aload_0         
	//   30   52:getfield        #68  <Field byte[] _inputBuffer>
	//   31   55:astore_3        
			int j = abyte0.length;
	//   32   56:aload_3         
	//   33   57:arraylength     
	//   34   58:istore_1        
			if(j == 0)
	//*  35   59:iload_1         
	//*  36   60:ifne            65
				return false;
	//   37   63:iconst_0        
	//   38   64:ireturn         
			j = inputstream.read(abyte0, 0, j);
	//   39   65:aload_2         
	//   40   66:aload_3         
	//   41   67:iconst_0        
	//   42   68:iload_1         
	//   43   69:invokevirtual   #688 <Method int InputStream.read(byte[], int, int)>
	//   44   72:istore_1        
			if(j > 0)
	//*  45   73:iload_1         
	//*  46   74:ifle            89
			{
				_inputPtr = 0;
	//   47   77:aload_0         
	//   48   78:iconst_0        
	//   49   79:putfield        #71  <Field int _inputPtr>
				_inputEnd = j;
	//   50   82:aload_0         
	//   51   83:iload_1         
	//   52   84:putfield        #74  <Field int _inputEnd>
				return true;
	//   53   87:iconst_1        
	//   54   88:ireturn         
			}
			_closeInput();
	//   55   89:aload_0         
	//   56   90:invokevirtual   #690 <Method void _closeInput()>
			if(j != 0)
	//*  57   93:iload_1         
	//*  58   94:ifeq            99
			{
				return false;
	//   59   97:iconst_0        
	//   60   98:ireturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   61   99:new             #345 <Class StringBuilder>
	//   62  102:dup             
	//   63  103:invokespecial   #347 <Method void StringBuilder()>
	//   64  106:astore_2        
				stringbuilder.append("InputStream.read() returned 0 characters when trying to read ");
	//   65  107:aload_2         
	//   66  108:ldc2            #692 <String "InputStream.read() returned 0 characters when trying to read ">
	//   67  111:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   68  114:pop             
				stringbuilder.append(_inputBuffer.length);
	//   69  115:aload_2         
	//   70  116:aload_0         
	//   71  117:getfield        #68  <Field byte[] _inputBuffer>
	//   72  120:arraylength     
	//   73  121:invokevirtual   #695 <Method StringBuilder StringBuilder.append(int)>
	//   74  124:pop             
				stringbuilder.append(" bytes");
	//   75  125:aload_2         
	//   76  126:ldc2            #697 <String " bytes">
	//   77  129:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   78  132:pop             
				throw new IOException(stringbuilder.toString());
	//   79  133:new             #87  <Class IOException>
	//   80  136:dup             
	//   81  137:aload_2         
	//   82  138:invokevirtual   #362 <Method String StringBuilder.toString()>
	//   83  141:invokespecial   #699 <Method void IOException(String)>
	//   84  144:athrow          
			}
		} else
		{
			return false;
	//   85  145:iconst_0        
	//   86  146:ireturn         
		}
	}

	protected void _loadMoreGuaranteed()
		throws IOException
	{
		if(!_loadMore())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #219 <Method boolean _loadMore()>
	//*   2    4:ifne            11
			_reportInvalidEOF();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #701 <Method void _reportInvalidEOF()>
	//    5   11:return          
	}

	protected final void _matchFalse()
		throws IOException
	{
		int l = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int _inputPtr>
	//    2    4:istore_2        
		if(l + 4 < _inputEnd)
	//*   3    5:iload_2         
	//*   4    6:iconst_4        
	//*   5    7:iadd            
	//*   6    8:aload_0         
	//*   7    9:getfield        #74  <Field int _inputEnd>
	//*   8   12:icmpge          100
		{
			byte abyte0[] = _inputBuffer;
	//    9   15:aload_0         
	//   10   16:getfield        #68  <Field byte[] _inputBuffer>
	//   11   19:astore_3        
			int i = l + 1;
	//   12   20:iload_2         
	//   13   21:iconst_1        
	//   14   22:iadd            
	//   15   23:istore_1        
			if(abyte0[l] == 97)
	//*  16   24:aload_3         
	//*  17   25:iload_2         
	//*  18   26:baload          
	//*  19   27:bipush          97
	//*  20   29:icmpne          100
			{
				int i1 = i + 1;
	//   21   32:iload_1         
	//   22   33:iconst_1        
	//   23   34:iadd            
	//   24   35:istore_2        
				if(abyte0[i] == 108)
	//*  25   36:aload_3         
	//*  26   37:iload_1         
	//*  27   38:baload          
	//*  28   39:bipush          108
	//*  29   41:icmpne          100
				{
					int j = i1 + 1;
	//   30   44:iload_2         
	//   31   45:iconst_1        
	//   32   46:iadd            
	//   33   47:istore_1        
					if(abyte0[i1] == 115)
	//*  34   48:aload_3         
	//*  35   49:iload_2         
	//*  36   50:baload          
	//*  37   51:bipush          115
	//*  38   53:icmpne          100
					{
						int j1 = j + 1;
	//   39   56:iload_1         
	//   40   57:iconst_1        
	//   41   58:iadd            
	//   42   59:istore_2        
						if(abyte0[j] == 101)
	//*  43   60:aload_3         
	//*  44   61:iload_1         
	//*  45   62:baload          
	//*  46   63:bipush          101
	//*  47   65:icmpne          100
						{
							int k = abyte0[j1] & 0xff;
	//   48   68:aload_3         
	//   49   69:iload_2         
	//   50   70:baload          
	//   51   71:sipush          255
	//   52   74:iand            
	//   53   75:istore_1        
							if(k < 48 || k == 93 || k == 125)
	//*  54   76:iload_1         
	//*  55   77:bipush          48
	//*  56   79:icmplt          94
	//*  57   82:iload_1         
	//*  58   83:bipush          93
	//*  59   85:icmpeq          94
	//*  60   88:iload_1         
	//*  61   89:bipush          125
	//*  62   91:icmpne          100
							{
								_inputPtr = j1;
	//   63   94:aload_0         
	//   64   95:iload_2         
	//   65   96:putfield        #71  <Field int _inputPtr>
								return;
	//   66   99:return          
							}
						}
					}
				}
			}
		}
		_matchToken2("false", 1);
	//   67  100:aload_0         
	//   68  101:ldc2            #703 <String "false">
	//   69  104:iconst_1        
	//   70  105:invokespecial   #705 <Method void _matchToken2(String, int)>
	//   71  108:return          
	}

	protected final void _matchNull()
		throws IOException
	{
		int k = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int _inputPtr>
	//    2    4:istore_2        
		if(k + 3 < _inputEnd)
	//*   3    5:iload_2         
	//*   4    6:iconst_3        
	//*   5    7:iadd            
	//*   6    8:aload_0         
	//*   7    9:getfield        #74  <Field int _inputEnd>
	//*   8   12:icmpge          88
		{
			byte abyte0[] = _inputBuffer;
	//    9   15:aload_0         
	//   10   16:getfield        #68  <Field byte[] _inputBuffer>
	//   11   19:astore_3        
			int i = k + 1;
	//   12   20:iload_2         
	//   13   21:iconst_1        
	//   14   22:iadd            
	//   15   23:istore_1        
			if(abyte0[k] == 117)
	//*  16   24:aload_3         
	//*  17   25:iload_2         
	//*  18   26:baload          
	//*  19   27:bipush          117
	//*  20   29:icmpne          88
			{
				int l = i + 1;
	//   21   32:iload_1         
	//   22   33:iconst_1        
	//   23   34:iadd            
	//   24   35:istore_2        
				if(abyte0[i] == 108)
	//*  25   36:aload_3         
	//*  26   37:iload_1         
	//*  27   38:baload          
	//*  28   39:bipush          108
	//*  29   41:icmpne          88
				{
					int j = l + 1;
	//   30   44:iload_2         
	//   31   45:iconst_1        
	//   32   46:iadd            
	//   33   47:istore_1        
					if(abyte0[l] == 108)
	//*  34   48:aload_3         
	//*  35   49:iload_2         
	//*  36   50:baload          
	//*  37   51:bipush          108
	//*  38   53:icmpne          88
					{
						int i1 = abyte0[j] & 0xff;
	//   39   56:aload_3         
	//   40   57:iload_1         
	//   41   58:baload          
	//   42   59:sipush          255
	//   43   62:iand            
	//   44   63:istore_2        
						if(i1 < 48 || i1 == 93 || i1 == 125)
	//*  45   64:iload_2         
	//*  46   65:bipush          48
	//*  47   67:icmplt          82
	//*  48   70:iload_2         
	//*  49   71:bipush          93
	//*  50   73:icmpeq          82
	//*  51   76:iload_2         
	//*  52   77:bipush          125
	//*  53   79:icmpne          88
						{
							_inputPtr = j;
	//   54   82:aload_0         
	//   55   83:iload_1         
	//   56   84:putfield        #71  <Field int _inputPtr>
							return;
	//   57   87:return          
						}
					}
				}
			}
		}
		_matchToken2("null", 1);
	//   58   88:aload_0         
	//   59   89:ldc2            #707 <String "null">
	//   60   92:iconst_1        
	//   61   93:invokespecial   #705 <Method void _matchToken2(String, int)>
	//   62   96:return          
	}

	protected final void _matchToken(String s, int i)
		throws IOException
	{
		int k = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #216 <Method int String.length()>
	//    2    4:istore          4
		int j = i;
	//    3    6:iload_2         
	//    4    7:istore_3        
		if(_inputPtr + k >= _inputEnd)
	//*   5    8:aload_0         
	//*   6    9:getfield        #71  <Field int _inputPtr>
	//*   7   12:iload           4
	//*   8   14:iadd            
	//*   9   15:aload_0         
	//*  10   16:getfield        #74  <Field int _inputEnd>
	//*  11   19:icmplt          29
		{
			_matchToken2(s, i);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:iload_2         
	//   15   25:invokespecial   #705 <Method void _matchToken2(String, int)>
			return;
	//   16   28:return          
		}
		do
		{
			if(_inputBuffer[_inputPtr] != s.charAt(j))
	//*  17   29:aload_0         
	//*  18   30:getfield        #68  <Field byte[] _inputBuffer>
	//*  19   33:aload_0         
	//*  20   34:getfield        #71  <Field int _inputPtr>
	//*  21   37:baload          
	//*  22   38:aload_1         
	//*  23   39:iload_3         
	//*  24   40:invokevirtual   #223 <Method char String.charAt(int)>
	//*  25   43:icmpeq          56
				_reportInvalidToken(s.substring(0, j));
	//   26   46:aload_0         
	//   27   47:aload_1         
	//   28   48:iconst_0        
	//   29   49:iload_3         
	//   30   50:invokevirtual   #103 <Method String String.substring(int, int)>
	//   31   53:invokevirtual   #107 <Method void _reportInvalidToken(String)>
			_inputPtr = _inputPtr + 1;
	//   32   56:aload_0         
	//   33   57:aload_0         
	//   34   58:getfield        #71  <Field int _inputPtr>
	//   35   61:iconst_1        
	//   36   62:iadd            
	//   37   63:putfield        #71  <Field int _inputPtr>
			i = j + 1;
	//   38   66:iload_3         
	//   39   67:iconst_1        
	//   40   68:iadd            
	//   41   69:istore_2        
			j = i;
	//   42   70:iload_2         
	//   43   71:istore_3        
		} while(i < k);
	//   44   72:iload_2         
	//   45   73:iload           4
	//   46   75:icmplt          29
		j = _inputBuffer[_inputPtr] & 0xff;
	//   47   78:aload_0         
	//   48   79:getfield        #68  <Field byte[] _inputBuffer>
	//   49   82:aload_0         
	//   50   83:getfield        #71  <Field int _inputPtr>
	//   51   86:baload          
	//   52   87:sipush          255
	//   53   90:iand            
	//   54   91:istore_3        
		if(j >= 48 && j != 93 && j != 125)
	//*  55   92:iload_3         
	//*  56   93:bipush          48
	//*  57   95:icmplt          117
	//*  58   98:iload_3         
	//*  59   99:bipush          93
	//*  60  101:icmpeq          117
	//*  61  104:iload_3         
	//*  62  105:bipush          125
	//*  63  107:icmpeq          117
			_checkMatchEnd(s, i, j);
	//   64  110:aload_0         
	//   65  111:aload_1         
	//   66  112:iload_2         
	//   67  113:iload_3         
	//   68  114:invokespecial   #225 <Method void _checkMatchEnd(String, int, int)>
	//   69  117:return          
	}

	protected final void _matchTrue()
		throws IOException
	{
		int k = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int _inputPtr>
	//    2    4:istore_2        
		if(k + 3 < _inputEnd)
	//*   3    5:iload_2         
	//*   4    6:iconst_3        
	//*   5    7:iadd            
	//*   6    8:aload_0         
	//*   7    9:getfield        #74  <Field int _inputEnd>
	//*   8   12:icmpge          88
		{
			byte abyte0[] = _inputBuffer;
	//    9   15:aload_0         
	//   10   16:getfield        #68  <Field byte[] _inputBuffer>
	//   11   19:astore_3        
			int i = k + 1;
	//   12   20:iload_2         
	//   13   21:iconst_1        
	//   14   22:iadd            
	//   15   23:istore_1        
			if(abyte0[k] == 114)
	//*  16   24:aload_3         
	//*  17   25:iload_2         
	//*  18   26:baload          
	//*  19   27:bipush          114
	//*  20   29:icmpne          88
			{
				int l = i + 1;
	//   21   32:iload_1         
	//   22   33:iconst_1        
	//   23   34:iadd            
	//   24   35:istore_2        
				if(abyte0[i] == 117)
	//*  25   36:aload_3         
	//*  26   37:iload_1         
	//*  27   38:baload          
	//*  28   39:bipush          117
	//*  29   41:icmpne          88
				{
					int j = l + 1;
	//   30   44:iload_2         
	//   31   45:iconst_1        
	//   32   46:iadd            
	//   33   47:istore_1        
					if(abyte0[l] == 101)
	//*  34   48:aload_3         
	//*  35   49:iload_2         
	//*  36   50:baload          
	//*  37   51:bipush          101
	//*  38   53:icmpne          88
					{
						int i1 = abyte0[j] & 0xff;
	//   39   56:aload_3         
	//   40   57:iload_1         
	//   41   58:baload          
	//   42   59:sipush          255
	//   43   62:iand            
	//   44   63:istore_2        
						if(i1 < 48 || i1 == 93 || i1 == 125)
	//*  45   64:iload_2         
	//*  46   65:bipush          48
	//*  47   67:icmplt          82
	//*  48   70:iload_2         
	//*  49   71:bipush          93
	//*  50   73:icmpeq          82
	//*  51   76:iload_2         
	//*  52   77:bipush          125
	//*  53   79:icmpne          88
						{
							_inputPtr = j;
	//   54   82:aload_0         
	//   55   83:iload_1         
	//   56   84:putfield        #71  <Field int _inputPtr>
							return;
	//   57   87:return          
						}
					}
				}
			}
		}
		_matchToken2("true", 1);
	//   58   88:aload_0         
	//   59   89:ldc2            #709 <String "true">
	//   60   92:iconst_1        
	//   61   93:invokespecial   #705 <Method void _matchToken2(String, int)>
	//   62   96:return          
	}

	protected String _parseAposName()
		throws IOException
	{
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #74  <Field int _inputEnd>
	//*   4    8:icmplt          28
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #219 <Method boolean _loadMore()>
	//*   7   15:ifne            28
			_reportInvalidEOF(": was expecting closing ''' for field name", JsonToken.FIELD_NAME);
	//    8   18:aload_0         
	//    9   19:ldc2            #711 <String ": was expecting closing ''' for field name">
	//   10   22:getstatic       #447 <Field JsonToken JsonToken.FIELD_NAME>
	//   11   25:invokevirtual   #332 <Method void _reportInvalidEOF(String, JsonToken)>
		int ai[] = ((int []) (_inputBuffer));
	//   12   28:aload_0         
	//   13   29:getfield        #68  <Field byte[] _inputBuffer>
	//   14   32:astore          10
		int i = _inputPtr;
	//   15   34:aload_0         
	//   16   35:getfield        #71  <Field int _inputPtr>
	//   17   38:istore_1        
		_inputPtr = i + 1;
	//   18   39:aload_0         
	//   19   40:iload_1         
	//   20   41:iconst_1        
	//   21   42:iadd            
	//   22   43:putfield        #71  <Field int _inputPtr>
		int l = ai[i] & 0xff;
	//   23   46:aload           10
	//   24   48:iload_1         
	//   25   49:baload          
	//   26   50:sipush          255
	//   27   53:iand            
	//   28   54:istore          4
		if(l == 39)
	//*  29   56:iload           4
	//*  30   58:bipush          39
	//*  31   60:icmpne          67
			return "";
	//   32   63:ldc2            #677 <String "">
	//   33   66:areturn         
		ai = _quadBuffer;
	//   34   67:aload_0         
	//   35   68:getfield        #60  <Field int[] _quadBuffer>
	//   36   71:astore          10
		Object obj1 = ((Object) (_icLatin1));
	//   37   73:getstatic       #40  <Field int[] _icLatin1>
	//   38   76:astore          12
		int j = 0;
	//   39   78:iconst_0        
	//   40   79:istore_2        
		i = 0;
	//   41   80:iconst_0        
	//   42   81:istore_1        
		int k = 0;
	//   43   82:iconst_0        
	//   44   83:istore_3        
		do
		{
			if(l == 39)
	//*  45   84:iload           4
	//*  46   86:bipush          39
	//*  47   88:icmpne          180
			{
				if(j > 0)
	//*  48   91:iload_2         
	//*  49   92:ifle            146
				{
					int ai1[] = ai;
	//   50   95:aload           10
	//   51   97:astore          11
					if(i >= ai.length)
	//*  52   99:iload_1         
	//*  53  100:aload           10
	//*  54  102:arraylength     
	//*  55  103:icmplt          122
					{
						ai1 = growArrayBy(ai, ai.length);
	//   56  106:aload           10
	//   57  108:aload           10
	//   58  110:arraylength     
	//   59  111:invokestatic    #479 <Method int[] growArrayBy(int[], int)>
	//   60  114:astore          11
						_quadBuffer = ai1;
	//   61  116:aload_0         
	//   62  117:aload           11
	//   63  119:putfield        #60  <Field int[] _quadBuffer>
					}
					l = i + 1;
	//   64  122:iload_1         
	//   65  123:iconst_1        
	//   66  124:iadd            
	//   67  125:istore          4
					ai1[i] = _padLastQuad(k, j);
	//   68  127:aload           11
	//   69  129:iload_1         
	//   70  130:iload_3         
	//   71  131:iload_2         
	//   72  132:invokestatic    #463 <Method int _padLastQuad(int, int)>
	//   73  135:iastore         
					i = l;
	//   74  136:iload           4
	//   75  138:istore_1        
					ai = ai1;
	//   76  139:aload           11
	//   77  141:astore          10
				}
	//*  78  143:goto            146
				obj1 = ((Object) (_symbols.findName(ai, i)));
	//   79  146:aload_0         
	//   80  147:getfield        #66  <Field ByteQuadsCanonicalizer _symbols>
	//   81  150:aload           10
	//   82  152:iload_1         
	//   83  153:invokevirtual   #482 <Method String ByteQuadsCanonicalizer.findName(int[], int)>
	//   84  156:astore          12
				Object obj = obj1;
	//   85  158:aload           12
	//   86  160:astore          11
				if(obj1 == null)
	//*  87  162:aload           12
	//*  88  164:ifnonnull       177
					obj = ((Object) (addName(ai, i, j)));
	//   89  167:aload_0         
	//   90  168:aload           10
	//   91  170:iload_1         
	//   92  171:iload_2         
	//   93  172:invokespecial   #468 <Method String addName(int[], int, int)>
	//   94  175:astore          11
				return ((String) (obj));
	//   95  177:aload           11
	//   96  179:areturn         
			}
			int i1 = l;
	//   97  180:iload           4
	//   98  182:istore          5
			int i2 = j;
	//   99  184:iload_2         
	//  100  185:istore          9
			int k1 = i;
	//  101  187:iload_1         
	//  102  188:istore          7
			int ai2[] = ai;
	//  103  190:aload           10
	//  104  192:astore          11
			int l1 = k;
	//  105  194:iload_3         
	//  106  195:istore          8
			if(obj1[l] != 0)
	//* 107  197:aload           12
	//* 108  199:iload           4
	//* 109  201:iaload          
	//* 110  202:ifeq            517
			{
				i1 = l;
	//  111  205:iload           4
	//  112  207:istore          5
				i2 = j;
	//  113  209:iload_2         
	//  114  210:istore          9
				k1 = i;
	//  115  212:iload_1         
	//  116  213:istore          7
				ai2 = ai;
	//  117  215:aload           10
	//  118  217:astore          11
				l1 = k;
	//  119  219:iload_3         
	//  120  220:istore          8
				if(l != 34)
	//* 121  222:iload           4
	//* 122  224:bipush          34
	//* 123  226:icmpeq          517
				{
					int j1;
					if(l != 92)
	//* 124  229:iload           4
	//* 125  231:bipush          92
	//* 126  233:icmpeq          252
					{
						_throwUnquotedSpace(l, "name");
	//  127  236:aload_0         
	//  128  237:iload           4
	//  129  239:ldc2            #713 <String "name">
	//  130  242:invokevirtual   #194 <Method void _throwUnquotedSpace(int, String)>
						j1 = l;
	//  131  245:iload           4
	//  132  247:istore          6
					} else
	//* 133  249:goto            258
					{
						j1 = ((int) (_decodeEscaped()));
	//  134  252:aload_0         
	//  135  253:invokevirtual   #208 <Method char _decodeEscaped()>
	//  136  256:istore          6
					}
					i1 = j1;
	//  137  258:iload           6
	//  138  260:istore          5
					i2 = j;
	//  139  262:iload_2         
	//  140  263:istore          9
					k1 = i;
	//  141  265:iload_1         
	//  142  266:istore          7
					ai2 = ai;
	//  143  268:aload           10
	//  144  270:astore          11
					l1 = k;
	//  145  272:iload_3         
	//  146  273:istore          8
					if(j1 > 127)
	//* 147  275:iload           6
	//* 148  277:bipush          127
	//* 149  279:icmple          517
					{
						i1 = j;
	//  150  282:iload_2         
	//  151  283:istore          5
						l = i;
	//  152  285:iload_1         
	//  153  286:istore          4
						ai2 = ai;
	//  154  288:aload           10
	//  155  290:astore          11
						k1 = k;
	//  156  292:iload_3         
	//  157  293:istore          7
						if(j >= 4)
	//* 158  295:iload_2         
	//* 159  296:iconst_4        
	//* 160  297:icmplt          343
						{
							ai2 = ai;
	//  161  300:aload           10
	//  162  302:astore          11
							if(i >= ai.length)
	//* 163  304:iload_1         
	//* 164  305:aload           10
	//* 165  307:arraylength     
	//* 166  308:icmplt          327
							{
								ai2 = growArrayBy(ai, ai.length);
	//  167  311:aload           10
	//  168  313:aload           10
	//  169  315:arraylength     
	//  170  316:invokestatic    #479 <Method int[] growArrayBy(int[], int)>
	//  171  319:astore          11
								_quadBuffer = ai2;
	//  172  321:aload_0         
	//  173  322:aload           11
	//  174  324:putfield        #60  <Field int[] _quadBuffer>
							}
							ai2[i] = k;
	//  175  327:aload           11
	//  176  329:iload_1         
	//  177  330:iload_3         
	//  178  331:iastore         
							l = i + 1;
	//  179  332:iload_1         
	//  180  333:iconst_1        
	//  181  334:iadd            
	//  182  335:istore          4
							i1 = 0;
	//  183  337:iconst_0        
	//  184  338:istore          5
							k1 = 0;
	//  185  340:iconst_0        
	//  186  341:istore          7
						}
						if(j1 < 2048)
	//* 187  343:iload           6
	//* 188  345:sipush          2048
	//* 189  348:icmpge          379
						{
							j = k1 << 8 | (j1 >> 6 | 0xc0);
	//  190  351:iload           7
	//  191  353:bipush          8
	//  192  355:ishl            
	//  193  356:iload           6
	//  194  358:bipush          6
	//  195  360:ishr            
	//  196  361:sipush          192
	//  197  364:ior             
	//  198  365:ior             
	//  199  366:istore_2        
							i = i1 + 1;
	//  200  367:iload           5
	//  201  369:iconst_1        
	//  202  370:iadd            
	//  203  371:istore_1        
							ai = ai2;
	//  204  372:aload           11
	//  205  374:astore          10
						} else
	//* 206  376:goto            492
						{
							k1 = k1 << 8 | (j1 >> 12 | 0xe0);
	//  207  379:iload           7
	//  208  381:bipush          8
	//  209  383:ishl            
	//  210  384:iload           6
	//  211  386:bipush          12
	//  212  388:ishr            
	//  213  389:sipush          224
	//  214  392:ior             
	//  215  393:ior             
	//  216  394:istore          7
							i1++;
	//  217  396:iload           5
	//  218  398:iconst_1        
	//  219  399:iadd            
	//  220  400:istore          5
							k = i1;
	//  221  402:iload           5
	//  222  404:istore_3        
							i = l;
	//  223  405:iload           4
	//  224  407:istore_1        
							ai = ai2;
	//  225  408:aload           11
	//  226  410:astore          10
							j = k1;
	//  227  412:iload           7
	//  228  414:istore_2        
							if(i1 >= 4)
	//* 229  415:iload           5
	//* 230  417:iconst_4        
	//* 231  418:icmplt          465
							{
								ai = ai2;
	//  232  421:aload           11
	//  233  423:astore          10
								if(l >= ai2.length)
	//* 234  425:iload           4
	//* 235  427:aload           11
	//* 236  429:arraylength     
	//* 237  430:icmplt          449
								{
									ai = growArrayBy(ai2, ai2.length);
	//  238  433:aload           11
	//  239  435:aload           11
	//  240  437:arraylength     
	//  241  438:invokestatic    #479 <Method int[] growArrayBy(int[], int)>
	//  242  441:astore          10
									_quadBuffer = ai;
	//  243  443:aload_0         
	//  244  444:aload           10
	//  245  446:putfield        #60  <Field int[] _quadBuffer>
								}
								ai[l] = k1;
	//  246  449:aload           10
	//  247  451:iload           4
	//  248  453:iload           7
	//  249  455:iastore         
								i = l + 1;
	//  250  456:iload           4
	//  251  458:iconst_1        
	//  252  459:iadd            
	//  253  460:istore_1        
								k = 0;
	//  254  461:iconst_0        
	//  255  462:istore_3        
								j = 0;
	//  256  463:iconst_0        
	//  257  464:istore_2        
							}
							j = j << 8 | (j1 >> 6 & 0x3f | 0x80);
	//  258  465:iload_2         
	//  259  466:bipush          8
	//  260  468:ishl            
	//  261  469:iload           6
	//  262  471:bipush          6
	//  263  473:ishr            
	//  264  474:bipush          63
	//  265  476:iand            
	//  266  477:sipush          128
	//  267  480:ior             
	//  268  481:ior             
	//  269  482:istore_2        
							k++;
	//  270  483:iload_3         
	//  271  484:iconst_1        
	//  272  485:iadd            
	//  273  486:istore_3        
							l = i;
	//  274  487:iload_1         
	//  275  488:istore          4
							i = k;
	//  276  490:iload_3         
	//  277  491:istore_1        
						}
						i1 = j1 & 0x3f | 0x80;
	//  278  492:iload           6
	//  279  494:bipush          63
	//  280  496:iand            
	//  281  497:sipush          128
	//  282  500:ior             
	//  283  501:istore          5
						l1 = j;
	//  284  503:iload_2         
	//  285  504:istore          8
						ai2 = ai;
	//  286  506:aload           10
	//  287  508:astore          11
						k1 = l;
	//  288  510:iload           4
	//  289  512:istore          7
						i2 = i;
	//  290  514:iload_1         
	//  291  515:istore          9
					}
				}
			}
			if(i2 < 4)
	//* 292  517:iload           9
	//* 293  519:iconst_4        
	//* 294  520:icmpge          547
			{
				j = i2 + 1;
	//  295  523:iload           9
	//  296  525:iconst_1        
	//  297  526:iadd            
	//  298  527:istore_2        
				k = i1 | l1 << 8;
	//  299  528:iload           5
	//  300  530:iload           8
	//  301  532:bipush          8
	//  302  534:ishl            
	//  303  535:ior             
	//  304  536:istore_3        
				i = k1;
	//  305  537:iload           7
	//  306  539:istore_1        
				ai = ai2;
	//  307  540:aload           11
	//  308  542:astore          10
			} else
	//* 309  544:goto            592
			{
				ai = ai2;
	//  310  547:aload           11
	//  311  549:astore          10
				if(k1 >= ai2.length)
	//* 312  551:iload           7
	//* 313  553:aload           11
	//* 314  555:arraylength     
	//* 315  556:icmplt          575
				{
					ai = growArrayBy(ai2, ai2.length);
	//  316  559:aload           11
	//  317  561:aload           11
	//  318  563:arraylength     
	//  319  564:invokestatic    #479 <Method int[] growArrayBy(int[], int)>
	//  320  567:astore          10
					_quadBuffer = ai;
	//  321  569:aload_0         
	//  322  570:aload           10
	//  323  572:putfield        #60  <Field int[] _quadBuffer>
				}
				ai[k1] = l1;
	//  324  575:aload           10
	//  325  577:iload           7
	//  326  579:iload           8
	//  327  581:iastore         
				k = i1;
	//  328  582:iload           5
	//  329  584:istore_3        
				i = k1 + 1;
	//  330  585:iload           7
	//  331  587:iconst_1        
	//  332  588:iadd            
	//  333  589:istore_1        
				j = 1;
	//  334  590:iconst_1        
	//  335  591:istore_2        
			}
			if(_inputPtr >= _inputEnd && !_loadMore())
	//* 336  592:aload_0         
	//* 337  593:getfield        #71  <Field int _inputPtr>
	//* 338  596:aload_0         
	//* 339  597:getfield        #74  <Field int _inputEnd>
	//* 340  600:icmplt          620
	//* 341  603:aload_0         
	//* 342  604:invokevirtual   #219 <Method boolean _loadMore()>
	//* 343  607:ifne            620
				_reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
	//  344  610:aload_0         
	//  345  611:ldc2            #444 <String " in field name">
	//  346  614:getstatic       #447 <Field JsonToken JsonToken.FIELD_NAME>
	//  347  617:invokevirtual   #332 <Method void _reportInvalidEOF(String, JsonToken)>
			ai2 = ((int []) (_inputBuffer));
	//  348  620:aload_0         
	//  349  621:getfield        #68  <Field byte[] _inputBuffer>
	//  350  624:astore          11
			l = _inputPtr;
	//  351  626:aload_0         
	//  352  627:getfield        #71  <Field int _inputPtr>
	//  353  630:istore          4
			_inputPtr = l + 1;
	//  354  632:aload_0         
	//  355  633:iload           4
	//  356  635:iconst_1        
	//  357  636:iadd            
	//  358  637:putfield        #71  <Field int _inputPtr>
			l = ai2[l] & 0xff;
	//  359  640:aload           11
	//  360  642:iload           4
	//  361  644:baload          
	//  362  645:sipush          255
	//  363  648:iand            
	//  364  649:istore          4
		} while(true);
	//  365  651:goto            84
	}

	protected final String _parseName(int i)
		throws IOException
	{
		if(i != 34)
	//*   0    0:iload_1         
	//*   1    1:bipush          34
	//*   2    3:icmpeq          12
			return _handleOddName(i);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokevirtual   #716 <Method String _handleOddName(int)>
	//    6   11:areturn         
		if(_inputPtr + 13 > _inputEnd)
	//*   7   12:aload_0         
	//*   8   13:getfield        #71  <Field int _inputPtr>
	//*   9   16:bipush          13
	//*  10   18:iadd            
	//*  11   19:aload_0         
	//*  12   20:getfield        #74  <Field int _inputEnd>
	//*  13   23:icmple          31
			return slowParseName();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #719 <Method String slowParseName()>
	//   16   30:areturn         
		byte abyte0[] = _inputBuffer;
	//   17   31:aload_0         
	//   18   32:getfield        #68  <Field byte[] _inputBuffer>
	//   19   35:astore_3        
		int ai[] = _icLatin1;
	//   20   36:getstatic       #40  <Field int[] _icLatin1>
	//   21   39:astore          4
		i = _inputPtr;
	//   22   41:aload_0         
	//   23   42:getfield        #71  <Field int _inputPtr>
	//   24   45:istore_1        
		_inputPtr = i + 1;
	//   25   46:aload_0         
	//   26   47:iload_1         
	//   27   48:iconst_1        
	//   28   49:iadd            
	//   29   50:putfield        #71  <Field int _inputPtr>
		i = abyte0[i] & 0xff;
	//   30   53:aload_3         
	//   31   54:iload_1         
	//   32   55:baload          
	//   33   56:sipush          255
	//   34   59:iand            
	//   35   60:istore_1        
		if(ai[i] == 0)
	//*  36   61:aload           4
	//*  37   63:iload_1         
	//*  38   64:iaload          
	//*  39   65:ifne            292
		{
			int j = _inputPtr;
	//   40   68:aload_0         
	//   41   69:getfield        #71  <Field int _inputPtr>
	//   42   72:istore_2        
			_inputPtr = j + 1;
	//   43   73:aload_0         
	//   44   74:iload_2         
	//   45   75:iconst_1        
	//   46   76:iadd            
	//   47   77:putfield        #71  <Field int _inputPtr>
			j = abyte0[j] & 0xff;
	//   48   80:aload_3         
	//   49   81:iload_2         
	//   50   82:baload          
	//   51   83:sipush          255
	//   52   86:iand            
	//   53   87:istore_2        
			if(ai[j] == 0)
	//*  54   88:aload           4
	//*  55   90:iload_2         
	//*  56   91:iaload          
	//*  57   92:ifne            271
			{
				i = i << 8 | j;
	//   58   95:iload_1         
	//   59   96:bipush          8
	//   60   98:ishl            
	//   61   99:iload_2         
	//   62  100:ior             
	//   63  101:istore_1        
				j = _inputPtr;
	//   64  102:aload_0         
	//   65  103:getfield        #71  <Field int _inputPtr>
	//   66  106:istore_2        
				_inputPtr = j + 1;
	//   67  107:aload_0         
	//   68  108:iload_2         
	//   69  109:iconst_1        
	//   70  110:iadd            
	//   71  111:putfield        #71  <Field int _inputPtr>
				j = abyte0[j] & 0xff;
	//   72  114:aload_3         
	//   73  115:iload_2         
	//   74  116:baload          
	//   75  117:sipush          255
	//   76  120:iand            
	//   77  121:istore_2        
				if(ai[j] == 0)
	//*  78  122:aload           4
	//*  79  124:iload_2         
	//*  80  125:iaload          
	//*  81  126:ifne            250
				{
					i = i << 8 | j;
	//   82  129:iload_1         
	//   83  130:bipush          8
	//   84  132:ishl            
	//   85  133:iload_2         
	//   86  134:ior             
	//   87  135:istore_1        
					j = _inputPtr;
	//   88  136:aload_0         
	//   89  137:getfield        #71  <Field int _inputPtr>
	//   90  140:istore_2        
					_inputPtr = j + 1;
	//   91  141:aload_0         
	//   92  142:iload_2         
	//   93  143:iconst_1        
	//   94  144:iadd            
	//   95  145:putfield        #71  <Field int _inputPtr>
					j = abyte0[j] & 0xff;
	//   96  148:aload_3         
	//   97  149:iload_2         
	//   98  150:baload          
	//   99  151:sipush          255
	//  100  154:iand            
	//  101  155:istore_2        
					if(ai[j] == 0)
	//* 102  156:aload           4
	//* 103  158:iload_2         
	//* 104  159:iaload          
	//* 105  160:ifne            229
					{
						i = i << 8 | j;
	//  106  163:iload_1         
	//  107  164:bipush          8
	//  108  166:ishl            
	//  109  167:iload_2         
	//  110  168:ior             
	//  111  169:istore_1        
						j = _inputPtr;
	//  112  170:aload_0         
	//  113  171:getfield        #71  <Field int _inputPtr>
	//  114  174:istore_2        
						_inputPtr = j + 1;
	//  115  175:aload_0         
	//  116  176:iload_2         
	//  117  177:iconst_1        
	//  118  178:iadd            
	//  119  179:putfield        #71  <Field int _inputPtr>
						j = abyte0[j] & 0xff;
	//  120  182:aload_3         
	//  121  183:iload_2         
	//  122  184:baload          
	//  123  185:sipush          255
	//  124  188:iand            
	//  125  189:istore_2        
						if(ai[j] == 0)
	//* 126  190:aload           4
	//* 127  192:iload_2         
	//* 128  193:iaload          
	//* 129  194:ifne            208
						{
							_quad1 = i;
	//  130  197:aload_0         
	//  131  198:iload_1         
	//  132  199:putfield        #721 <Field int _quad1>
							return parseMediumName(j);
	//  133  202:aload_0         
	//  134  203:iload_2         
	//  135  204:invokevirtual   #724 <Method String parseMediumName(int)>
	//  136  207:areturn         
						}
						if(j == 34)
	//* 137  208:iload_2         
	//* 138  209:bipush          34
	//* 139  211:icmpne          221
							return findName(i, 4);
	//  140  214:aload_0         
	//  141  215:iload_1         
	//  142  216:iconst_4        
	//  143  217:invokespecial   #725 <Method String findName(int, int)>
	//  144  220:areturn         
						else
							return parseName(i, j, 4);
	//  145  221:aload_0         
	//  146  222:iload_1         
	//  147  223:iload_2         
	//  148  224:iconst_4        
	//  149  225:invokespecial   #727 <Method String parseName(int, int, int)>
	//  150  228:areturn         
					}
					if(j == 34)
	//* 151  229:iload_2         
	//* 152  230:bipush          34
	//* 153  232:icmpne          242
						return findName(i, 3);
	//  154  235:aload_0         
	//  155  236:iload_1         
	//  156  237:iconst_3        
	//  157  238:invokespecial   #725 <Method String findName(int, int)>
	//  158  241:areturn         
					else
						return parseName(i, j, 3);
	//  159  242:aload_0         
	//  160  243:iload_1         
	//  161  244:iload_2         
	//  162  245:iconst_3        
	//  163  246:invokespecial   #727 <Method String parseName(int, int, int)>
	//  164  249:areturn         
				}
				if(j == 34)
	//* 165  250:iload_2         
	//* 166  251:bipush          34
	//* 167  253:icmpne          263
					return findName(i, 2);
	//  168  256:aload_0         
	//  169  257:iload_1         
	//  170  258:iconst_2        
	//  171  259:invokespecial   #725 <Method String findName(int, int)>
	//  172  262:areturn         
				else
					return parseName(i, j, 2);
	//  173  263:aload_0         
	//  174  264:iload_1         
	//  175  265:iload_2         
	//  176  266:iconst_2        
	//  177  267:invokespecial   #727 <Method String parseName(int, int, int)>
	//  178  270:areturn         
			}
			if(j == 34)
	//* 179  271:iload_2         
	//* 180  272:bipush          34
	//* 181  274:icmpne          284
				return findName(i, 1);
	//  182  277:aload_0         
	//  183  278:iload_1         
	//  184  279:iconst_1        
	//  185  280:invokespecial   #725 <Method String findName(int, int)>
	//  186  283:areturn         
			else
				return parseName(i, j, 1);
	//  187  284:aload_0         
	//  188  285:iload_1         
	//  189  286:iload_2         
	//  190  287:iconst_1        
	//  191  288:invokespecial   #727 <Method String parseName(int, int, int)>
	//  192  291:areturn         
		}
		if(i == 34)
	//* 193  292:iload_1         
	//* 194  293:bipush          34
	//* 195  295:icmpne          302
			return "";
	//  196  298:ldc2            #677 <String "">
	//  197  301:areturn         
		else
			return parseName(0, i, 0);
	//  198  302:aload_0         
	//  199  303:iconst_0        
	//  200  304:iload_1         
	//  201  305:iconst_0        
	//  202  306:invokespecial   #727 <Method String parseName(int, int, int)>
	//  203  309:areturn         
	}

	protected JsonToken _parseNegNumber()
		throws IOException
	{
		char ac[] = _textBuffer.emptyAndGetCurrentSegment();
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #439 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//    3    7:astore          5
		ac[0] = '-';
	//    4    9:aload           5
	//    5   11:iconst_0        
	//    6   12:bipush          45
	//    7   14:castore         
		if(_inputPtr >= _inputEnd)
	//*   8   15:aload_0         
	//*   9   16:getfield        #71  <Field int _inputPtr>
	//*  10   19:aload_0         
	//*  11   20:getfield        #74  <Field int _inputEnd>
	//*  12   23:icmplt          30
			_loadMoreGuaranteed();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
		byte abyte0[] = _inputBuffer;
	//   15   30:aload_0         
	//   16   31:getfield        #68  <Field byte[] _inputBuffer>
	//   17   34:astore          6
		int i = _inputPtr;
	//   18   36:aload_0         
	//   19   37:getfield        #71  <Field int _inputPtr>
	//   20   40:istore_1        
		_inputPtr = i + 1;
	//   21   41:aload_0         
	//   22   42:iload_1         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:putfield        #71  <Field int _inputPtr>
		int j = abyte0[i] & 0xff;
	//   26   48:aload           6
	//   27   50:iload_1         
	//   28   51:baload          
	//   29   52:sipush          255
	//   30   55:iand            
	//   31   56:istore_2        
		if(j <= 48)
	//*  32   57:iload_2         
	//*  33   58:bipush          48
	//*  34   60:icmpgt          84
		{
			if(j != 48)
	//*  35   63:iload_2         
	//*  36   64:bipush          48
	//*  37   66:icmpeq          76
				return _handleInvalidNumberStart(j, true);
	//   38   69:aload_0         
	//   39   70:iload_2         
	//   40   71:iconst_1        
	//   41   72:invokevirtual   #653 <Method JsonToken _handleInvalidNumberStart(int, boolean)>
	//   42   75:areturn         
			i = _verifyNoLeadingZeroes();
	//   43   76:aload_0         
	//   44   77:invokespecial   #729 <Method int _verifyNoLeadingZeroes()>
	//   45   80:istore_1        
		} else
	//*  46   81:goto            99
		{
			i = j;
	//   47   84:iload_2         
	//   48   85:istore_1        
			if(j > 57)
	//*  49   86:iload_2         
	//*  50   87:bipush          57
	//*  51   89:icmple          99
				return _handleInvalidNumberStart(j, true);
	//   52   92:aload_0         
	//   53   93:iload_2         
	//   54   94:iconst_1        
	//   55   95:invokevirtual   #653 <Method JsonToken _handleInvalidNumberStart(int, boolean)>
	//   56   98:areturn         
		}
		int k = 2;
	//   57   99:iconst_2        
	//   58  100:istore_3        
		ac[1] = (char)i;
	//   59  101:aload           5
	//   60  103:iconst_1        
	//   61  104:iload_1         
	//   62  105:int2char        
	//   63  106:castore         
		int l = Math.min(_inputEnd, (_inputPtr + ac.length) - 2);
	//   64  107:aload_0         
	//   65  108:getfield        #74  <Field int _inputEnd>
	//   66  111:aload_0         
	//   67  112:getfield        #71  <Field int _inputPtr>
	//   68  115:aload           5
	//   69  117:arraylength     
	//   70  118:iadd            
	//   71  119:iconst_2        
	//   72  120:isub            
	//   73  121:invokestatic    #184 <Method int Math.min(int, int)>
	//   74  124:istore          4
		j = 1;
	//   75  126:iconst_1        
	//   76  127:istore_2        
		i = k;
	//   77  128:iload_3         
	//   78  129:istore_1        
		do
		{
			if(_inputPtr >= l)
	//*  79  130:aload_0         
	//*  80  131:getfield        #71  <Field int _inputPtr>
	//*  81  134:iload           4
	//*  82  136:icmplt          149
				return _parseNumber2(ac, i, true, j);
	//   83  139:aload_0         
	//   84  140:aload           5
	//   85  142:iload_1         
	//   86  143:iconst_1        
	//   87  144:iload_2         
	//   88  145:invokespecial   #731 <Method JsonToken _parseNumber2(char[], int, boolean, int)>
	//   89  148:areturn         
			byte abyte1[] = _inputBuffer;
	//   90  149:aload_0         
	//   91  150:getfield        #68  <Field byte[] _inputBuffer>
	//   92  153:astore          6
			k = _inputPtr;
	//   93  155:aload_0         
	//   94  156:getfield        #71  <Field int _inputPtr>
	//   95  159:istore_3        
			_inputPtr = k + 1;
	//   96  160:aload_0         
	//   97  161:iload_3         
	//   98  162:iconst_1        
	//   99  163:iadd            
	//  100  164:putfield        #71  <Field int _inputPtr>
			k = abyte1[k] & 0xff;
	//  101  167:aload           6
	//  102  169:iload_3         
	//  103  170:baload          
	//  104  171:sipush          255
	//  105  174:iand            
	//  106  175:istore_3        
			if(k < 48 || k > 57)
	//* 107  176:iload_3         
	//* 108  177:bipush          48
	//* 109  179:icmplt          208
	//* 110  182:iload_3         
	//* 111  183:bipush          57
	//* 112  185:icmple          191
				break;
	//  113  188:goto            208
			j++;
	//  114  191:iload_2         
	//  115  192:iconst_1        
	//  116  193:iadd            
	//  117  194:istore_2        
			ac[i] = (char)k;
	//  118  195:aload           5
	//  119  197:iload_1         
	//  120  198:iload_3         
	//  121  199:int2char        
	//  122  200:castore         
			i++;
	//  123  201:iload_1         
	//  124  202:iconst_1        
	//  125  203:iadd            
	//  126  204:istore_1        
		} while(true);
	//  127  205:goto            130
		if(k != 46 && k != 101 && k != 69)
	//* 128  208:iload_3         
	//* 129  209:bipush          46
	//* 130  211:icmpeq          269
	//* 131  214:iload_3         
	//* 132  215:bipush          101
	//* 133  217:icmpeq          269
	//* 134  220:iload_3         
	//* 135  221:bipush          69
	//* 136  223:icmpne          229
	//* 137  226:goto            269
		{
			_inputPtr = _inputPtr - 1;
	//  138  229:aload_0         
	//  139  230:aload_0         
	//  140  231:getfield        #71  <Field int _inputPtr>
	//  141  234:iconst_1        
	//  142  235:isub            
	//  143  236:putfield        #71  <Field int _inputPtr>
			_textBuffer.setCurrentLength(i);
	//  144  239:aload_0         
	//  145  240:getfield        #172 <Field TextBuffer _textBuffer>
	//  146  243:iload_1         
	//  147  244:invokevirtual   #188 <Method void TextBuffer.setCurrentLength(int)>
			if(_parsingContext.inRoot())
	//* 148  247:aload_0         
	//* 149  248:getfield        #118 <Field JsonReadContext _parsingContext>
	//* 150  251:invokevirtual   #298 <Method boolean JsonReadContext.inRoot()>
	//* 151  254:ifeq            262
				_verifyRootSpace(k);
	//  152  257:aload_0         
	//  153  258:iload_3         
	//  154  259:invokespecial   #301 <Method void _verifyRootSpace(int)>
			return resetInt(true, j);
	//  155  262:aload_0         
	//  156  263:iconst_1        
	//  157  264:iload_2         
	//  158  265:invokevirtual   #311 <Method JsonToken resetInt(boolean, int)>
	//  159  268:areturn         
		} else
		{
			return _parseFloat(ac, i, k, true, j);
	//  160  269:aload_0         
	//  161  270:aload           5
	//  162  272:iload_1         
	//  163  273:iload_3         
	//  164  274:iconst_1        
	//  165  275:iload_2         
	//  166  276:invokespecial   #313 <Method JsonToken _parseFloat(char[], int, int, boolean, int)>
	//  167  279:areturn         
		}
	}

	protected JsonToken _parsePosNumber(int i)
		throws IOException
	{
		char ac[] = _textBuffer.emptyAndGetCurrentSegment();
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #439 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//    3    7:astore          5
		int j = i;
	//    4    9:iload_1         
	//    5   10:istore_2        
		if(i == 48)
	//*   6   11:iload_1         
	//*   7   12:bipush          48
	//*   8   14:icmpne          22
			j = _verifyNoLeadingZeroes();
	//    9   17:aload_0         
	//   10   18:invokespecial   #729 <Method int _verifyNoLeadingZeroes()>
	//   11   21:istore_2        
		ac[0] = (char)j;
	//   12   22:aload           5
	//   13   24:iconst_0        
	//   14   25:iload_2         
	//   15   26:int2char        
	//   16   27:castore         
		int k = Math.min(_inputEnd, (_inputPtr + ac.length) - 1);
	//   17   28:aload_0         
	//   18   29:getfield        #74  <Field int _inputEnd>
	//   19   32:aload_0         
	//   20   33:getfield        #71  <Field int _inputPtr>
	//   21   36:aload           5
	//   22   38:arraylength     
	//   23   39:iadd            
	//   24   40:iconst_1        
	//   25   41:isub            
	//   26   42:invokestatic    #184 <Method int Math.min(int, int)>
	//   27   45:istore_3        
		i = 1;
	//   28   46:iconst_1        
	//   29   47:istore_1        
		j = 1;
	//   30   48:iconst_1        
	//   31   49:istore_2        
		int l;
		do
		{
			if(_inputPtr >= k)
	//*  32   50:aload_0         
	//*  33   51:getfield        #71  <Field int _inputPtr>
	//*  34   54:iload_3         
	//*  35   55:icmplt          68
				return _parseNumber2(ac, i, false, j);
	//   36   58:aload_0         
	//   37   59:aload           5
	//   38   61:iload_1         
	//   39   62:iconst_0        
	//   40   63:iload_2         
	//   41   64:invokespecial   #731 <Method JsonToken _parseNumber2(char[], int, boolean, int)>
	//   42   67:areturn         
			byte abyte0[] = _inputBuffer;
	//   43   68:aload_0         
	//   44   69:getfield        #68  <Field byte[] _inputBuffer>
	//   45   72:astore          6
			l = _inputPtr;
	//   46   74:aload_0         
	//   47   75:getfield        #71  <Field int _inputPtr>
	//   48   78:istore          4
			_inputPtr = l + 1;
	//   49   80:aload_0         
	//   50   81:iload           4
	//   51   83:iconst_1        
	//   52   84:iadd            
	//   53   85:putfield        #71  <Field int _inputPtr>
			l = abyte0[l] & 0xff;
	//   54   88:aload           6
	//   55   90:iload           4
	//   56   92:baload          
	//   57   93:sipush          255
	//   58   96:iand            
	//   59   97:istore          4
			if(l < 48 || l > 57)
	//*  60   99:iload           4
	//*  61  101:bipush          48
	//*  62  103:icmplt          134
	//*  63  106:iload           4
	//*  64  108:bipush          57
	//*  65  110:icmple          116
				break;
	//   66  113:goto            134
			j++;
	//   67  116:iload_2         
	//   68  117:iconst_1        
	//   69  118:iadd            
	//   70  119:istore_2        
			ac[i] = (char)l;
	//   71  120:aload           5
	//   72  122:iload_1         
	//   73  123:iload           4
	//   74  125:int2char        
	//   75  126:castore         
			i++;
	//   76  127:iload_1         
	//   77  128:iconst_1        
	//   78  129:iadd            
	//   79  130:istore_1        
		} while(true);
	//   80  131:goto            50
		if(l != 46 && l != 101 && l != 69)
	//*  81  134:iload           4
	//*  82  136:bipush          46
	//*  83  138:icmpeq          199
	//*  84  141:iload           4
	//*  85  143:bipush          101
	//*  86  145:icmpeq          199
	//*  87  148:iload           4
	//*  88  150:bipush          69
	//*  89  152:icmpne          158
	//*  90  155:goto            199
		{
			_inputPtr = _inputPtr - 1;
	//   91  158:aload_0         
	//   92  159:aload_0         
	//   93  160:getfield        #71  <Field int _inputPtr>
	//   94  163:iconst_1        
	//   95  164:isub            
	//   96  165:putfield        #71  <Field int _inputPtr>
			_textBuffer.setCurrentLength(i);
	//   97  168:aload_0         
	//   98  169:getfield        #172 <Field TextBuffer _textBuffer>
	//   99  172:iload_1         
	//  100  173:invokevirtual   #188 <Method void TextBuffer.setCurrentLength(int)>
			if(_parsingContext.inRoot())
	//* 101  176:aload_0         
	//* 102  177:getfield        #118 <Field JsonReadContext _parsingContext>
	//* 103  180:invokevirtual   #298 <Method boolean JsonReadContext.inRoot()>
	//* 104  183:ifeq            192
				_verifyRootSpace(l);
	//  105  186:aload_0         
	//  106  187:iload           4
	//  107  189:invokespecial   #301 <Method void _verifyRootSpace(int)>
			return resetInt(false, j);
	//  108  192:aload_0         
	//  109  193:iconst_0        
	//  110  194:iload_2         
	//  111  195:invokevirtual   #311 <Method JsonToken resetInt(boolean, int)>
	//  112  198:areturn         
		} else
		{
			return _parseFloat(ac, i, l, false, j);
	//  113  199:aload_0         
	//  114  200:aload           5
	//  115  202:iload_1         
	//  116  203:iload           4
	//  117  205:iconst_0        
	//  118  206:iload_2         
	//  119  207:invokespecial   #313 <Method JsonToken _parseFloat(char[], int, int, boolean, int)>
	//  120  210:areturn         
		}
	}

	protected int _readBinary(Base64Variant base64variant, OutputStream outputstream, byte abyte0[])
		throws IOException
	{
		int k1 = abyte0.length;
	//    0    0:aload_3         
	//    1    1:arraylength     
	//    2    2:istore          9
		int l = 0;
	//    3    4:iconst_0        
	//    4    5:istore          6
		int i = 0;
	//    5    7:iconst_0        
	//    6    8:istore          4
		do
		{
			int k;
			int i1;
			int j1;
			int l1;
label0:
			{
label1:
				{
					int i2;
label2:
					{
label3:
						{
							do
							{
								if(_inputPtr >= _inputEnd)
	//*   7   10:aload_0         
	//*   8   11:getfield        #71  <Field int _inputPtr>
	//*   9   14:aload_0         
	//*  10   15:getfield        #74  <Field int _inputEnd>
	//*  11   18:icmplt          25
									_loadMoreGuaranteed();
	//   12   21:aload_0         
	//   13   22:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
								byte abyte1[] = _inputBuffer;
	//   14   25:aload_0         
	//   15   26:getfield        #68  <Field byte[] _inputBuffer>
	//   16   29:astore          12
								int j = _inputPtr;
	//   17   31:aload_0         
	//   18   32:getfield        #71  <Field int _inputPtr>
	//   19   35:istore          5
								_inputPtr = j + 1;
	//   20   37:aload_0         
	//   21   38:iload           5
	//   22   40:iconst_1        
	//   23   41:iadd            
	//   24   42:putfield        #71  <Field int _inputPtr>
								i1 = abyte1[j] & 0xff;
	//   25   45:aload           12
	//   26   47:iload           5
	//   27   49:baload          
	//   28   50:sipush          255
	//   29   53:iand            
	//   30   54:istore          7
							} while(i1 <= 32);
	//   31   56:iload           7
	//   32   58:bipush          32
	//   33   60:icmple          10
							k = base64variant.decodeBase64Char(i1);
	//   34   63:aload_1         
	//   35   64:iload           7
	//   36   66:invokevirtual   #518 <Method int Base64Variant.decodeBase64Char(int)>
	//   37   69:istore          5
							j1 = k;
	//   38   71:iload           5
	//   39   73:istore          8
							if(k < 0)
	//*  40   75:iload           5
	//*  41   77:ifge            116
							{
								if(i1 == 34)
	//*  42   80:iload           7
	//*  43   82:bipush          34
	//*  44   84:icmpne          94
								{
									k = l;
	//   45   87:iload           6
	//   46   89:istore          5
									break label3;
	//   47   91:goto            617
								}
								k = _decodeBase64Escape(base64variant, i1, 0);
	//   48   94:aload_0         
	//   49   95:aload_1         
	//   50   96:iload           7
	//   51   98:iconst_0        
	//   52   99:invokevirtual   #528 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//   53  102:istore          5
								j1 = k;
	//   54  104:iload           5
	//   55  106:istore          8
								if(k < 0)
	//*  56  108:iload           5
	//*  57  110:ifge            116
									continue;
	//   58  113:goto            10
							}
							k = l;
	//   59  116:iload           6
	//   60  118:istore          5
							i1 = i;
	//   61  120:iload           4
	//   62  122:istore          7
							if(i > k1 - 3)
	//*  63  124:iload           4
	//*  64  126:iload           9
	//*  65  128:iconst_3        
	//*  66  129:isub            
	//*  67  130:icmple          151
							{
								k = l + i;
	//   68  133:iload           6
	//   69  135:iload           4
	//   70  137:iadd            
	//   71  138:istore          5
								outputstream.write(abyte0, 0, i);
	//   72  140:aload_2         
	//   73  141:aload_3         
	//   74  142:iconst_0        
	//   75  143:iload           4
	//   76  145:invokevirtual   #739 <Method void OutputStream.write(byte[], int, int)>
								i1 = 0;
	//   77  148:iconst_0        
	//   78  149:istore          7
							}
							if(_inputPtr >= _inputEnd)
	//*  79  151:aload_0         
	//*  80  152:getfield        #71  <Field int _inputPtr>
	//*  81  155:aload_0         
	//*  82  156:getfield        #74  <Field int _inputEnd>
	//*  83  159:icmplt          166
								_loadMoreGuaranteed();
	//   84  162:aload_0         
	//   85  163:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
							byte abyte2[] = _inputBuffer;
	//   86  166:aload_0         
	//   87  167:getfield        #68  <Field byte[] _inputBuffer>
	//   88  170:astore          12
							i = _inputPtr;
	//   89  172:aload_0         
	//   90  173:getfield        #71  <Field int _inputPtr>
	//   91  176:istore          4
							_inputPtr = i + 1;
	//   92  178:aload_0         
	//   93  179:iload           4
	//   94  181:iconst_1        
	//   95  182:iadd            
	//   96  183:putfield        #71  <Field int _inputPtr>
							l1 = abyte2[i] & 0xff;
	//   97  186:aload           12
	//   98  188:iload           4
	//   99  190:baload          
	//  100  191:sipush          255
	//  101  194:iand            
	//  102  195:istore          10
							l = base64variant.decodeBase64Char(l1);
	//  103  197:aload_1         
	//  104  198:iload           10
	//  105  200:invokevirtual   #518 <Method int Base64Variant.decodeBase64Char(int)>
	//  106  203:istore          6
							i = l;
	//  107  205:iload           6
	//  108  207:istore          4
							if(l < 0)
	//* 109  209:iload           6
	//* 110  211:ifge            224
								i = _decodeBase64Escape(base64variant, l1, 1);
	//  111  214:aload_0         
	//  112  215:aload_1         
	//  113  216:iload           10
	//  114  218:iconst_1        
	//  115  219:invokevirtual   #528 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//  116  222:istore          4
							l1 = j1 << 6 | i;
	//  117  224:iload           8
	//  118  226:bipush          6
	//  119  228:ishl            
	//  120  229:iload           4
	//  121  231:ior             
	//  122  232:istore          10
							if(_inputPtr >= _inputEnd)
	//* 123  234:aload_0         
	//* 124  235:getfield        #71  <Field int _inputPtr>
	//* 125  238:aload_0         
	//* 126  239:getfield        #74  <Field int _inputEnd>
	//* 127  242:icmplt          249
								_loadMoreGuaranteed();
	//  128  245:aload_0         
	//  129  246:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
							abyte2 = _inputBuffer;
	//  130  249:aload_0         
	//  131  250:getfield        #68  <Field byte[] _inputBuffer>
	//  132  253:astore          12
							i = _inputPtr;
	//  133  255:aload_0         
	//  134  256:getfield        #71  <Field int _inputPtr>
	//  135  259:istore          4
							_inputPtr = i + 1;
	//  136  261:aload_0         
	//  137  262:iload           4
	//  138  264:iconst_1        
	//  139  265:iadd            
	//  140  266:putfield        #71  <Field int _inputPtr>
							i2 = abyte2[i] & 0xff;
	//  141  269:aload           12
	//  142  271:iload           4
	//  143  273:baload          
	//  144  274:sipush          255
	//  145  277:iand            
	//  146  278:istore          11
							l = base64variant.decodeBase64Char(i2);
	//  147  280:aload_1         
	//  148  281:iload           11
	//  149  283:invokevirtual   #518 <Method int Base64Variant.decodeBase64Char(int)>
	//  150  286:istore          6
							j1 = l;
	//  151  288:iload           6
	//  152  290:istore          8
							if(l < 0)
	//* 153  292:iload           6
	//* 154  294:ifge            484
							{
								i = l;
	//  155  297:iload           6
	//  156  299:istore          4
								if(l != -2)
	//* 157  301:iload           6
	//* 158  303:bipush          -2
	//* 159  305:icmpeq          350
								{
									if(i2 == 34 && !base64variant.usesPadding())
	//* 160  308:iload           11
	//* 161  310:bipush          34
	//* 162  312:icmpne          340
	//* 163  315:aload_1         
	//* 164  316:invokevirtual   #531 <Method boolean Base64Variant.usesPadding()>
	//* 165  319:ifne            340
									{
										abyte0[i1] = (byte)(l1 >> 4);
	//  166  322:aload_3         
	//  167  323:iload           7
	//  168  325:iload           10
	//  169  327:iconst_4        
	//  170  328:ishr            
	//  171  329:int2byte        
	//  172  330:bastore         
										i = i1 + 1;
	//  173  331:iload           7
	//  174  333:iconst_1        
	//  175  334:iadd            
	//  176  335:istore          4
										break label3;
	//  177  337:goto            617
									}
									i = _decodeBase64Escape(base64variant, i2, 2);
	//  178  340:aload_0         
	//  179  341:aload_1         
	//  180  342:iload           11
	//  181  344:iconst_2        
	//  182  345:invokevirtual   #528 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//  183  348:istore          4
								}
								j1 = i;
	//  184  350:iload           4
	//  185  352:istore          8
								if(i == -2)
	//* 186  354:iload           4
	//* 187  356:bipush          -2
	//* 188  358:icmpne          484
								{
									if(_inputPtr >= _inputEnd)
	//* 189  361:aload_0         
	//* 190  362:getfield        #71  <Field int _inputPtr>
	//* 191  365:aload_0         
	//* 192  366:getfield        #74  <Field int _inputEnd>
	//* 193  369:icmplt          376
										_loadMoreGuaranteed();
	//  194  372:aload_0         
	//  195  373:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
									abyte2 = _inputBuffer;
	//  196  376:aload_0         
	//  197  377:getfield        #68  <Field byte[] _inputBuffer>
	//  198  380:astore          12
									i = _inputPtr;
	//  199  382:aload_0         
	//  200  383:getfield        #71  <Field int _inputPtr>
	//  201  386:istore          4
									_inputPtr = i + 1;
	//  202  388:aload_0         
	//  203  389:iload           4
	//  204  391:iconst_1        
	//  205  392:iadd            
	//  206  393:putfield        #71  <Field int _inputPtr>
									i = abyte2[i] & 0xff;
	//  207  396:aload           12
	//  208  398:iload           4
	//  209  400:baload          
	//  210  401:sipush          255
	//  211  404:iand            
	//  212  405:istore          4
									if(base64variant.usesPaddingChar(i))
	//* 213  407:aload_1         
	//* 214  408:iload           4
	//* 215  410:invokevirtual   #537 <Method boolean Base64Variant.usesPaddingChar(int)>
	//* 216  413:ifeq            438
									{
										abyte0[i1] = (byte)(l1 >> 4);
	//  217  416:aload_3         
	//  218  417:iload           7
	//  219  419:iload           10
	//  220  421:iconst_4        
	//  221  422:ishr            
	//  222  423:int2byte        
	//  223  424:bastore         
										i = i1 + 1;
	//  224  425:iload           7
	//  225  427:iconst_1        
	//  226  428:iadd            
	//  227  429:istore          4
										l = k;
	//  228  431:iload           5
	//  229  433:istore          6
									} else
	//* 230  435:goto            10
									{
										outputstream = ((OutputStream) (new StringBuilder()));
	//  231  438:new             #345 <Class StringBuilder>
	//  232  441:dup             
	//  233  442:invokespecial   #347 <Method void StringBuilder()>
	//  234  445:astore_2        
										((StringBuilder) (outputstream)).append("expected padding character '");
	//  235  446:aload_2         
	//  236  447:ldc2            #539 <String "expected padding character '">
	//  237  450:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//  238  453:pop             
										((StringBuilder) (outputstream)).append(base64variant.getPaddingChar());
	//  239  454:aload_2         
	//  240  455:aload_1         
	//  241  456:invokevirtual   #542 <Method char Base64Variant.getPaddingChar()>
	//  242  459:invokevirtual   #545 <Method StringBuilder StringBuilder.append(char)>
	//  243  462:pop             
										((StringBuilder) (outputstream)).append("'");
	//  244  463:aload_2         
	//  245  464:ldc2            #547 <String "'">
	//  246  467:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//  247  470:pop             
										throw reportInvalidBase64Char(base64variant, i, 3, ((StringBuilder) (outputstream)).toString());
	//  248  471:aload_0         
	//  249  472:aload_1         
	//  250  473:iload           4
	//  251  475:iconst_3        
	//  252  476:aload_2         
	//  253  477:invokevirtual   #362 <Method String StringBuilder.toString()>
	//  254  480:invokevirtual   #551 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int, String)>
	//  255  483:athrow          
									}
									continue;
								}
							}
							l1 = l1 << 6 | j1;
	//  256  484:iload           10
	//  257  486:bipush          6
	//  258  488:ishl            
	//  259  489:iload           8
	//  260  491:ior             
	//  261  492:istore          10
							if(_inputPtr >= _inputEnd)
	//* 262  494:aload_0         
	//* 263  495:getfield        #71  <Field int _inputPtr>
	//* 264  498:aload_0         
	//* 265  499:getfield        #74  <Field int _inputEnd>
	//* 266  502:icmplt          509
								_loadMoreGuaranteed();
	//  267  505:aload_0         
	//  268  506:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
							abyte2 = _inputBuffer;
	//  269  509:aload_0         
	//  270  510:getfield        #68  <Field byte[] _inputBuffer>
	//  271  513:astore          12
							i = _inputPtr;
	//  272  515:aload_0         
	//  273  516:getfield        #71  <Field int _inputPtr>
	//  274  519:istore          4
							_inputPtr = i + 1;
	//  275  521:aload_0         
	//  276  522:iload           4
	//  277  524:iconst_1        
	//  278  525:iadd            
	//  279  526:putfield        #71  <Field int _inputPtr>
							i2 = abyte2[i] & 0xff;
	//  280  529:aload           12
	//  281  531:iload           4
	//  282  533:baload          
	//  283  534:sipush          255
	//  284  537:iand            
	//  285  538:istore          11
							l = base64variant.decodeBase64Char(i2);
	//  286  540:aload_1         
	//  287  541:iload           11
	//  288  543:invokevirtual   #518 <Method int Base64Variant.decodeBase64Char(int)>
	//  289  546:istore          6
							j1 = l;
	//  290  548:iload           6
	//  291  550:istore          8
							if(l >= 0)
								break label0;
	//  292  552:iload           6
	//  293  554:ifge            712
							i = l;
	//  294  557:iload           6
	//  295  559:istore          4
							if(l == -2)
								break label1;
	//  296  561:iload           6
	//  297  563:bipush          -2
	//  298  565:icmpeq          659
							if(i2 != 34 || base64variant.usesPadding())
								break label2;
	//  299  568:iload           11
	//  300  570:bipush          34
	//  301  572:icmpne          649
	//  302  575:aload_1         
	//  303  576:invokevirtual   #531 <Method boolean Base64Variant.usesPadding()>
	//  304  579:ifne            649
							l = l1 >> 2;
	//  305  582:iload           10
	//  306  584:iconst_2        
	//  307  585:ishr            
	//  308  586:istore          6
							j1 = i1 + 1;
	//  309  588:iload           7
	//  310  590:iconst_1        
	//  311  591:iadd            
	//  312  592:istore          8
							abyte0[i1] = (byte)(l >> 8);
	//  313  594:aload_3         
	//  314  595:iload           7
	//  315  597:iload           6
	//  316  599:bipush          8
	//  317  601:ishr            
	//  318  602:int2byte        
	//  319  603:bastore         
							i = j1 + 1;
	//  320  604:iload           8
	//  321  606:iconst_1        
	//  322  607:iadd            
	//  323  608:istore          4
							abyte0[j1] = (byte)l;
	//  324  610:aload_3         
	//  325  611:iload           8
	//  326  613:iload           6
	//  327  615:int2byte        
	//  328  616:bastore         
						}
						_tokenIncomplete = false;
	//  329  617:aload_0         
	//  330  618:iconst_0        
	//  331  619:putfield        #255 <Field boolean _tokenIncomplete>
						l = k;
	//  332  622:iload           5
	//  333  624:istore          6
						if(i > 0)
	//* 334  626:iload           4
	//* 335  628:ifle            646
						{
							l = k + i;
	//  336  631:iload           5
	//  337  633:iload           4
	//  338  635:iadd            
	//  339  636:istore          6
							outputstream.write(abyte0, 0, i);
	//  340  638:aload_2         
	//  341  639:aload_3         
	//  342  640:iconst_0        
	//  343  641:iload           4
	//  344  643:invokevirtual   #739 <Method void OutputStream.write(byte[], int, int)>
						}
						return l;
	//  345  646:iload           6
	//  346  648:ireturn         
					}
					i = _decodeBase64Escape(base64variant, i2, 3);
	//  347  649:aload_0         
	//  348  650:aload_1         
	//  349  651:iload           11
	//  350  653:iconst_3        
	//  351  654:invokevirtual   #528 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//  352  657:istore          4
				}
				j1 = i;
	//  353  659:iload           4
	//  354  661:istore          8
				if(i == -2)
	//* 355  663:iload           4
	//* 356  665:bipush          -2
	//* 357  667:icmpne          712
				{
					l = l1 >> 2;
	//  358  670:iload           10
	//  359  672:iconst_2        
	//  360  673:ishr            
	//  361  674:istore          6
					j1 = i1 + 1;
	//  362  676:iload           7
	//  363  678:iconst_1        
	//  364  679:iadd            
	//  365  680:istore          8
					abyte0[i1] = (byte)(l >> 8);
	//  366  682:aload_3         
	//  367  683:iload           7
	//  368  685:iload           6
	//  369  687:bipush          8
	//  370  689:ishr            
	//  371  690:int2byte        
	//  372  691:bastore         
					i = j1 + 1;
	//  373  692:iload           8
	//  374  694:iconst_1        
	//  375  695:iadd            
	//  376  696:istore          4
					abyte0[j1] = (byte)l;
	//  377  698:aload_3         
	//  378  699:iload           8
	//  379  701:iload           6
	//  380  703:int2byte        
	//  381  704:bastore         
					l = k;
	//  382  705:iload           5
	//  383  707:istore          6
					continue;
	//  384  709:goto            10
				}
			}
			i = l1 << 6 | j1;
	//  385  712:iload           10
	//  386  714:bipush          6
	//  387  716:ishl            
	//  388  717:iload           8
	//  389  719:ior             
	//  390  720:istore          4
			l = i1 + 1;
	//  391  722:iload           7
	//  392  724:iconst_1        
	//  393  725:iadd            
	//  394  726:istore          6
			abyte0[i1] = (byte)(i >> 16);
	//  395  728:aload_3         
	//  396  729:iload           7
	//  397  731:iload           4
	//  398  733:bipush          16
	//  399  735:ishr            
	//  400  736:int2byte        
	//  401  737:bastore         
			i1 = l + 1;
	//  402  738:iload           6
	//  403  740:iconst_1        
	//  404  741:iadd            
	//  405  742:istore          7
			abyte0[l] = (byte)(i >> 8);
	//  406  744:aload_3         
	//  407  745:iload           6
	//  408  747:iload           4
	//  409  749:bipush          8
	//  410  751:ishr            
	//  411  752:int2byte        
	//  412  753:bastore         
			abyte0[i1] = (byte)i;
	//  413  754:aload_3         
	//  414  755:iload           7
	//  415  757:iload           4
	//  416  759:int2byte        
	//  417  760:bastore         
			i = i1 + 1;
	//  418  761:iload           7
	//  419  763:iconst_1        
	//  420  764:iadd            
	//  421  765:istore          4
			l = k;
	//  422  767:iload           5
	//  423  769:istore          6
		} while(true);
	//  424  771:goto            10
	}

	protected void _releaseBuffers()
		throws IOException
	{
		super._releaseBuffers();
	//    0    0:aload_0         
	//    1    1:invokespecial   #742 <Method void ParserBase._releaseBuffers()>
		_symbols.release();
	//    2    4:aload_0         
	//    3    5:getfield        #66  <Field ByteQuadsCanonicalizer _symbols>
	//    4    8:invokevirtual   #745 <Method void ByteQuadsCanonicalizer.release()>
		if(_bufferRecyclable)
	//*   5   11:aload_0         
	//*   6   12:getfield        #83  <Field boolean _bufferRecyclable>
	//*   7   15:ifeq            42
		{
			byte abyte0[] = _inputBuffer;
	//    8   18:aload_0         
	//    9   19:getfield        #68  <Field byte[] _inputBuffer>
	//   10   22:astore_1        
			if(abyte0 != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          42
			{
				_inputBuffer = NO_BYTES;
	//   13   27:aload_0         
	//   14   28:getstatic       #748 <Field byte[] NO_BYTES>
	//   15   31:putfield        #68  <Field byte[] _inputBuffer>
				_ioContext.releaseReadIOBuffer(abyte0);
	//   16   34:aload_0         
	//   17   35:getfield        #494 <Field IOContext _ioContext>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #752 <Method void IOContext.releaseReadIOBuffer(byte[])>
			}
		}
	//   20   42:return          
	}

	protected void _reportInvalidChar(int i)
		throws JsonParseException
	{
		if(i < 32)
	//*   0    0:iload_1         
	//*   1    1:bipush          32
	//*   2    3:icmpge          11
			_throwInvalidSpace(i);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokevirtual   #376 <Method void _throwInvalidSpace(int)>
		_reportInvalidInitial(i);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:invokevirtual   #442 <Method void _reportInvalidInitial(int)>
	//    9   16:return          
	}

	protected void _reportInvalidInitial(int i)
		throws JsonParseException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #345 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #347 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Invalid UTF-8 start byte 0x");
	//    4    8:aload_2         
	//    5    9:ldc2            #754 <String "Invalid UTF-8 start byte 0x">
	//    6   12:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(Integer.toHexString(i));
	//    8   16:aload_2         
	//    9   17:iload_1         
	//   10   18:invokestatic    #759 <Method String Integer.toHexString(int)>
	//   11   21:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		_reportError(stringbuilder.toString());
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:invokevirtual   #362 <Method String StringBuilder.toString()>
	//   16   30:invokevirtual   #666 <Method void _reportError(String)>
	//   17   33:return          
	}

	protected void _reportInvalidOther(int i)
		throws JsonParseException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #345 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #347 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Invalid UTF-8 middle byte 0x");
	//    4    8:aload_2         
	//    5    9:ldc2            #761 <String "Invalid UTF-8 middle byte 0x">
	//    6   12:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(Integer.toHexString(i));
	//    8   16:aload_2         
	//    9   17:iload_1         
	//   10   18:invokestatic    #759 <Method String Integer.toHexString(int)>
	//   11   21:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		_reportError(stringbuilder.toString());
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:invokevirtual   #362 <Method String StringBuilder.toString()>
	//   16   30:invokevirtual   #666 <Method void _reportError(String)>
	//   17   33:return          
	}

	protected void _reportInvalidOther(int i, int j)
		throws JsonParseException
	{
		_inputPtr = j;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #71  <Field int _inputPtr>
		_reportInvalidOther(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #449 <Method void _reportInvalidOther(int)>
	//    6   10:return          
	}

	protected void _reportInvalidToken(String s)
		throws IOException
	{
		_reportInvalidToken(s, "'null', 'true', 'false' or NaN");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #763 <String "'null', 'true', 'false' or NaN">
	//    3    5:invokevirtual   #682 <Method void _reportInvalidToken(String, String)>
	//    4    8:return          
	}

	protected void _reportInvalidToken(String s, String s1)
		throws IOException
	{
		s = ((String) (new StringBuilder(s)));
	//    0    0:new             #345 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #764 <Method void StringBuilder(String)>
	//    4    8:astore_1        
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
				break;
	//    5    9:aload_0         
	//    6   10:getfield        #71  <Field int _inputPtr>
	//    7   13:aload_0         
	//    8   14:getfield        #74  <Field int _inputEnd>
	//    9   17:icmplt          27
	//   10   20:aload_0         
	//   11   21:invokevirtual   #219 <Method boolean _loadMore()>
	//   12   24:ifeq            92
			byte abyte0[] = _inputBuffer;
	//   13   27:aload_0         
	//   14   28:getfield        #68  <Field byte[] _inputBuffer>
	//   15   31:astore          5
			int i = _inputPtr;
	//   16   33:aload_0         
	//   17   34:getfield        #71  <Field int _inputPtr>
	//   18   37:istore          4
			_inputPtr = i + 1;
	//   19   39:aload_0         
	//   20   40:iload           4
	//   21   42:iconst_1        
	//   22   43:iadd            
	//   23   44:putfield        #71  <Field int _inputPtr>
			char c = (char)_decodeCharForError(((int) (abyte0[i])));
	//   24   47:aload_0         
	//   25   48:aload           5
	//   26   50:iload           4
	//   27   52:baload          
	//   28   53:invokevirtual   #91  <Method int _decodeCharForError(int)>
	//   29   56:int2char        
	//   30   57:istore_3        
			if(!Character.isJavaIdentifierPart(c))
	//*  31   58:iload_3         
	//*  32   59:invokestatic    #97  <Method boolean Character.isJavaIdentifierPart(char)>
	//*  33   62:ifne            68
				break;
	//   34   65:goto            92
			((StringBuilder) (s)).append(c);
	//   35   68:aload_1         
	//   36   69:iload_3         
	//   37   70:invokevirtual   #545 <Method StringBuilder StringBuilder.append(char)>
	//   38   73:pop             
			if(((StringBuilder) (s)).length() < 256)
				continue;
	//   39   74:aload_1         
	//   40   75:invokevirtual   #765 <Method int StringBuilder.length()>
	//   41   78:sipush          256
	//   42   81:icmplt          9
			((StringBuilder) (s)).append("...");
	//   43   84:aload_1         
	//   44   85:ldc2            #767 <String "...">
	//   45   88:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   46   91:pop             
			break;
		} while(true);
		_reportError("Unrecognized token '%s': was expecting %s", ((Object) (s)), ((Object) (s1)));
	//   47   92:aload_0         
	//   48   93:ldc2            #769 <String "Unrecognized token '%s': was expecting %s">
	//   49   96:aload_1         
	//   50   97:aload_2         
	//   51   98:invokevirtual   #772 <Method void _reportError(String, Object, Object)>
	//   52  101:return          
	}

	protected final void _skipCR()
		throws IOException
	{
		if((_inputPtr < _inputEnd || _loadMore()) && _inputBuffer[_inputPtr] == 10)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #74  <Field int _inputEnd>
	//*   4    8:icmplt          18
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #219 <Method boolean _loadMore()>
	//*   7   15:ifeq            42
	//*   8   18:aload_0         
	//*   9   19:getfield        #68  <Field byte[] _inputBuffer>
	//*  10   22:aload_0         
	//*  11   23:getfield        #71  <Field int _inputPtr>
	//*  12   26:baload          
	//*  13   27:bipush          10
	//*  14   29:icmpne          42
			_inputPtr = _inputPtr + 1;
	//   15   32:aload_0         
	//   16   33:aload_0         
	//   17   34:getfield        #71  <Field int _inputPtr>
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #71  <Field int _inputPtr>
		_currInputRow = _currInputRow + 1;
	//   21   42:aload_0         
	//   22   43:aload_0         
	//   23   44:getfield        #338 <Field int _currInputRow>
	//   24   47:iconst_1        
	//   25   48:iadd            
	//   26   49:putfield        #338 <Field int _currInputRow>
		_currInputRowStart = _inputPtr;
	//   27   52:aload_0         
	//   28   53:aload_0         
	//   29   54:getfield        #71  <Field int _inputPtr>
	//   30   57:putfield        #77  <Field int _currInputRowStart>
	//   31   60:return          
	}

	protected void _skipString()
		throws IOException
	{
		_tokenIncomplete = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #255 <Field boolean _tokenIncomplete>
		int ai[] = _icUTF8;
	//    3    5:getstatic       #35  <Field int[] _icUTF8>
	//    4    8:astore          5
		byte abyte0[] = _inputBuffer;
	//    5   10:aload_0         
	//    6   11:getfield        #68  <Field byte[] _inputBuffer>
	//    7   14:astore          6
label0:
		do
		{
			int k = _inputPtr;
	//    8   16:aload_0         
	//    9   17:getfield        #71  <Field int _inputPtr>
	//   10   20:istore_3        
			int i1 = _inputEnd;
	//   11   21:aload_0         
	//   12   22:getfield        #74  <Field int _inputEnd>
	//   13   25:istore          4
			int i = k;
	//   14   27:iload_3         
	//   15   28:istore_1        
			int j = i1;
	//   16   29:iload           4
	//   17   31:istore_2        
			if(k >= i1)
	//*  18   32:iload_3         
	//*  19   33:iload           4
	//*  20   35:icmplt          52
			{
				_loadMoreGuaranteed();
	//   21   38:aload_0         
	//   22   39:invokevirtual   #158 <Method void _loadMoreGuaranteed()>
				i = _inputPtr;
	//   23   42:aload_0         
	//   24   43:getfield        #71  <Field int _inputPtr>
	//   25   46:istore_1        
				j = _inputEnd;
	//   26   47:aload_0         
	//   27   48:getfield        #74  <Field int _inputEnd>
	//   28   51:istore_2        
			}
			do
			{
				if(i >= j)
					break;
	//   29   52:iload_1         
	//   30   53:iload_2         
	//   31   54:icmpge          183
				int l = i + 1;
	//   32   57:iload_1         
	//   33   58:iconst_1        
	//   34   59:iadd            
	//   35   60:istore_3        
				i = abyte0[i] & 0xff;
	//   36   61:aload           6
	//   37   63:iload_1         
	//   38   64:baload          
	//   39   65:sipush          255
	//   40   68:iand            
	//   41   69:istore_1        
				if(ai[i] != 0)
	//*  42   70:aload           5
	//*  43   72:iload_1         
	//*  44   73:iaload          
	//*  45   74:ifeq            178
				{
					_inputPtr = l;
	//   46   77:aload_0         
	//   47   78:iload_3         
	//   48   79:putfield        #71  <Field int _inputPtr>
					if(i == 34)
	//*  49   82:iload_1         
	//*  50   83:bipush          34
	//*  51   85:icmpne          89
						return;
	//   52   88:return          
					switch(ai[i])
	//*  53   89:aload           5
	//*  54   91:iload_1         
	//*  55   92:iaload          
					{
	//*  56   93:tableswitch     1 4: default 124
	//	               1 162
	//	               2 155
	//	               3 148
	//	               4 140
					default:
						if(i < 32)
	//*  57  124:iload_1         
	//*  58  125:bipush          32
	//*  59  127:icmpge          170
							_throwUnquotedSpace(i, "string value");
	//   60  130:aload_0         
	//   61  131:iload_1         
	//   62  132:ldc1            #190 <String "string value">
	//   63  134:invokevirtual   #194 <Method void _throwUnquotedSpace(int, String)>
						else
	//*  64  137:goto            16
	//*  65  140:aload_0         
	//*  66  141:iload_1         
	//*  67  142:invokespecial   #320 <Method void _skipUtf8_4(int)>
	//*  68  145:goto            16
	//*  69  148:aload_0         
	//*  70  149:invokespecial   #323 <Method void _skipUtf8_3()>
	//*  71  152:goto            16
	//*  72  155:aload_0         
	//*  73  156:invokespecial   #326 <Method void _skipUtf8_2()>
	//*  74  159:goto            16
	//*  75  162:aload_0         
	//*  76  163:invokevirtual   #208 <Method char _decodeEscaped()>
	//*  77  166:pop             
	//*  78  167:goto            16
							_reportInvalidChar(i);
	//   79  170:aload_0         
	//   80  171:iload_1         
	//   81  172:invokevirtual   #211 <Method void _reportInvalidChar(int)>
						break;

					case 4: // '\004'
						_skipUtf8_4(i);
						break;

					case 3: // '\003'
						_skipUtf8_3();
						break;

					case 2: // '\002'
						_skipUtf8_2();
						break;

					case 1: // '\001'
						_decodeEscaped();
						break;
					}
					continue label0;
	//   82  175:goto            16
				}
				i = l;
	//   83  178:iload_3         
	//   84  179:istore_1        
			} while(true);
	//   85  180:goto            52
			_inputPtr = i;
	//   86  183:aload_0         
	//   87  184:iload_1         
	//   88  185:putfield        #71  <Field int _inputPtr>
		} while(true);
	//*  89  188:goto            16
	}

	public byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException
	{
		if(_currToken != JsonToken.VALUE_STRING && (_currToken != JsonToken.VALUE_EMBEDDED_OBJECT || _binaryValue == null))
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field JsonToken _currToken>
	//*   2    4:getstatic       #258 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpeq       68
	//*   4   10:aload_0         
	//*   5   11:getfield        #149 <Field JsonToken _currToken>
	//*   6   14:getstatic       #779 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//*   7   17:if_acmpne       27
	//*   8   20:aload_0         
	//*   9   21:getfield        #782 <Field byte[] _binaryValue>
	//*  10   24:ifnonnull       68
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   27:new             #345 <Class StringBuilder>
	//   12   30:dup             
	//   13   31:invokespecial   #347 <Method void StringBuilder()>
	//   14   34:astore_2        
			stringbuilder.append("Current token (");
	//   15   35:aload_2         
	//   16   36:ldc2            #784 <String "Current token (">
	//   17   39:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   18   42:pop             
			stringbuilder.append(((Object) (_currToken)));
	//   19   43:aload_2         
	//   20   44:aload_0         
	//   21   45:getfield        #149 <Field JsonToken _currToken>
	//   22   48:invokevirtual   #787 <Method StringBuilder StringBuilder.append(Object)>
	//   23   51:pop             
			stringbuilder.append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
	//   24   52:aload_2         
	//   25   53:ldc2            #789 <String ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary">
	//   26   56:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   27   59:pop             
			_reportError(stringbuilder.toString());
	//   28   60:aload_0         
	//   29   61:aload_2         
	//   30   62:invokevirtual   #362 <Method String StringBuilder.toString()>
	//   31   65:invokevirtual   #666 <Method void _reportError(String)>
		}
		if(_tokenIncomplete)
	//*  32   68:aload_0         
	//*  33   69:getfield        #255 <Field boolean _tokenIncomplete>
	//*  34   72:ifeq            141
		{
			try
			{
				_binaryValue = _decodeBase64(base64variant);
	//   35   75:aload_0         
	//   36   76:aload_0         
	//   37   77:aload_1         
	//   38   78:invokevirtual   #791 <Method byte[] _decodeBase64(Base64Variant)>
	//   39   81:putfield        #782 <Field byte[] _binaryValue>
			}
	//*  40   84:aload_0         
	//*  41   85:iconst_0        
	//*  42   86:putfield        #255 <Field boolean _tokenIncomplete>
	//*  43   89:goto            171
			catch(IllegalArgumentException illegalargumentexception)
	//*  44   92:astore_2        
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   45   93:new             #345 <Class StringBuilder>
	//   46   96:dup             
	//   47   97:invokespecial   #347 <Method void StringBuilder()>
	//   48  100:astore_3        
				stringbuilder1.append("Failed to decode VALUE_STRING as base64 (");
	//   49  101:aload_3         
	//   50  102:ldc2            #793 <String "Failed to decode VALUE_STRING as base64 (">
	//   51  105:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   52  108:pop             
				stringbuilder1.append(((Object) (base64variant)));
	//   53  109:aload_3         
	//   54  110:aload_1         
	//   55  111:invokevirtual   #787 <Method StringBuilder StringBuilder.append(Object)>
	//   56  114:pop             
				stringbuilder1.append("): ");
	//   57  115:aload_3         
	//   58  116:ldc2            #795 <String "): ">
	//   59  119:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   60  122:pop             
				stringbuilder1.append(illegalargumentexception.getMessage());
	//   61  123:aload_3         
	//   62  124:aload_2         
	//   63  125:invokevirtual   #798 <Method String IllegalArgumentException.getMessage()>
	//   64  128:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   65  131:pop             
				throw _constructError(stringbuilder1.toString());
	//   66  132:aload_0         
	//   67  133:aload_3         
	//   68  134:invokevirtual   #362 <Method String StringBuilder.toString()>
	//   69  137:invokevirtual   #402 <Method JsonParseException _constructError(String)>
	//   70  140:athrow          
			}
			_tokenIncomplete = false;
		} else
		if(_binaryValue == null)
	//*  71  141:aload_0         
	//*  72  142:getfield        #782 <Field byte[] _binaryValue>
	//*  73  145:ifnonnull       171
		{
			ByteArrayBuilder bytearraybuilder = _getByteArrayBuilder();
	//   74  148:aload_0         
	//   75  149:invokevirtual   #513 <Method ByteArrayBuilder _getByteArrayBuilder()>
	//   76  152:astore_2        
			_decodeBase64(getText(), bytearraybuilder, base64variant);
	//   77  153:aload_0         
	//   78  154:aload_0         
	//   79  155:invokevirtual   #801 <Method String getText()>
	//   80  158:aload_2         
	//   81  159:aload_1         
	//   82  160:invokevirtual   #804 <Method void _decodeBase64(String, ByteArrayBuilder, Base64Variant)>
			_binaryValue = bytearraybuilder.toByteArray();
	//   83  163:aload_0         
	//   84  164:aload_2         
	//   85  165:invokevirtual   #524 <Method byte[] ByteArrayBuilder.toByteArray()>
	//   86  168:putfield        #782 <Field byte[] _binaryValue>
		}
		return _binaryValue;
	//   87  171:aload_0         
	//   88  172:getfield        #782 <Field byte[] _binaryValue>
	//   89  175:areturn         
	}

	public ObjectCodec getCodec()
	{
		return _objectCodec;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ObjectCodec _objectCodec>
	//    2    4:areturn         
	}

	public JsonLocation getCurrentLocation()
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int _inputPtr>
	//    2    4:istore_1        
		int j = _currInputRowStart;
	//    3    5:aload_0         
	//    4    6:getfield        #77  <Field int _currInputRowStart>
	//    5    9:istore_2        
		return new JsonLocation(_getSourceReference(), _currInputProcessed + (long)_inputPtr, -1L, _currInputRow, (i - j) + 1);
	//    6   10:new             #810 <Class JsonLocation>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokevirtual   #814 <Method Object _getSourceReference()>
	//   10   18:aload_0         
	//   11   19:getfield        #81  <Field long _currInputProcessed>
	//   12   22:aload_0         
	//   13   23:getfield        #71  <Field int _inputPtr>
	//   14   26:i2l             
	//   15   27:ladd            
	//   16   28:ldc2w           #815 <Long -1L>
	//   17   31:aload_0         
	//   18   32:getfield        #338 <Field int _currInputRow>
	//   19   35:iload_1         
	//   20   36:iload_2         
	//   21   37:isub            
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:invokespecial   #819 <Method void JsonLocation(Object, long, long, int, int)>
	//   25   43:areturn         
	}

	public String getText()
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field JsonToken _currToken>
	//*   2    4:getstatic       #258 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       35
		{
			if(_tokenIncomplete)
	//*   4   10:aload_0         
	//*   5   11:getfield        #255 <Field boolean _tokenIncomplete>
	//*   6   14:ifeq            27
			{
				_tokenIncomplete = false;
	//    7   17:aload_0         
	//    8   18:iconst_0        
	//    9   19:putfield        #255 <Field boolean _tokenIncomplete>
				return _finishAndReturnString();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #821 <Method String _finishAndReturnString()>
	//   12   26:areturn         
			} else
			{
				return _textBuffer.contentsAsString();
	//   13   27:aload_0         
	//   14   28:getfield        #172 <Field TextBuffer _textBuffer>
	//   15   31:invokevirtual   #579 <Method String TextBuffer.contentsAsString()>
	//   16   34:areturn         
			}
		} else
		{
			return _getText2(_currToken);
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #149 <Field JsonToken _currToken>
	//   20   40:invokevirtual   #823 <Method String _getText2(JsonToken)>
	//   21   43:areturn         
		}
	}

	public char[] getTextCharacters()
		throws IOException
	{
		if(_currToken != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field JsonToken _currToken>
	//*   2    4:ifnull          155
		{
			switch(_currToken.id())
	//*   3    7:aload_0         
	//*   4    8:getfield        #149 <Field JsonToken _currToken>
	//*   5   11:invokevirtual   #585 <Method int JsonToken.id()>
			{
	//*   6   14:tableswitch     5 8: default 44
	//	               5 76
	//	               6 52
	//	               7 68
	//	               8 68
			default:
				return _currToken.asCharArray();
	//    7   44:aload_0         
	//    8   45:getfield        #149 <Field JsonToken _currToken>
	//    9   48:invokevirtual   #827 <Method char[] JsonToken.asCharArray()>
	//   10   51:areturn         

			case 6: // '\006'
				if(_tokenIncomplete)
	//*  11   52:aload_0         
	//*  12   53:getfield        #255 <Field boolean _tokenIncomplete>
	//*  13   56:ifeq            68
				{
					_tokenIncomplete = false;
	//   14   59:aload_0         
	//   15   60:iconst_0        
	//   16   61:putfield        #255 <Field boolean _tokenIncomplete>
					_finishString();
	//   17   64:aload_0         
	//   18   65:invokevirtual   #829 <Method void _finishString()>
				}
				// fall through

			case 7: // '\007'
			case 8: // '\b'
				return _textBuffer.getTextBuffer();
	//   19   68:aload_0         
	//   20   69:getfield        #172 <Field TextBuffer _textBuffer>
	//   21   72:invokevirtual   #832 <Method char[] TextBuffer.getTextBuffer()>
	//   22   75:areturn         

			case 5: // '\005'
				break;
			}
			if(!_nameCopied)
	//*  23   76:aload_0         
	//*  24   77:getfield        #230 <Field boolean _nameCopied>
	//*  25   80:ifne            150
			{
				String s = _parsingContext.getCurrentName();
	//   26   83:aload_0         
	//   27   84:getfield        #118 <Field JsonReadContext _parsingContext>
	//   28   87:invokevirtual   #591 <Method String JsonReadContext.getCurrentName()>
	//   29   90:astore_2        
				int i = s.length();
	//   30   91:aload_2         
	//   31   92:invokevirtual   #216 <Method int String.length()>
	//   32   95:istore_1        
				if(_nameCopyBuffer == null)
	//*  33   96:aload_0         
	//*  34   97:getfield        #836 <Field char[] _nameCopyBuffer>
	//*  35  100:ifnonnull       118
					_nameCopyBuffer = _ioContext.allocNameCopyBuffer(i);
	//   36  103:aload_0         
	//   37  104:aload_0         
	//   38  105:getfield        #494 <Field IOContext _ioContext>
	//   39  108:iload_1         
	//   40  109:invokevirtual   #840 <Method char[] IOContext.allocNameCopyBuffer(int)>
	//   41  112:putfield        #836 <Field char[] _nameCopyBuffer>
				else
	//*  42  115:goto            134
				if(_nameCopyBuffer.length < i)
	//*  43  118:aload_0         
	//*  44  119:getfield        #836 <Field char[] _nameCopyBuffer>
	//*  45  122:arraylength     
	//*  46  123:iload_1         
	//*  47  124:icmpge          134
					_nameCopyBuffer = new char[i];
	//   48  127:aload_0         
	//   49  128:iload_1         
	//   50  129:newarray        char[]
	//   51  131:putfield        #836 <Field char[] _nameCopyBuffer>
				s.getChars(0, i, _nameCopyBuffer, 0);
	//   52  134:aload_2         
	//   53  135:iconst_0        
	//   54  136:iload_1         
	//   55  137:aload_0         
	//   56  138:getfield        #836 <Field char[] _nameCopyBuffer>
	//   57  141:iconst_0        
	//   58  142:invokevirtual   #844 <Method void String.getChars(int, int, char[], int)>
				_nameCopied = true;
	//   59  145:aload_0         
	//   60  146:iconst_1        
	//   61  147:putfield        #230 <Field boolean _nameCopied>
			}
			return _nameCopyBuffer;
	//   62  150:aload_0         
	//   63  151:getfield        #836 <Field char[] _nameCopyBuffer>
	//   64  154:areturn         
		} else
		{
			return null;
	//   65  155:aconst_null     
	//   66  156:areturn         
		}
	}

	public int getTextLength()
		throws IOException
	{
		if(_currToken != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field JsonToken _currToken>
	//*   2    4:ifnull          88
			switch(_currToken.id())
	//*   3    7:aload_0         
	//*   4    8:getfield        #149 <Field JsonToken _currToken>
	//*   5   11:invokevirtual   #585 <Method int JsonToken.id()>
			{
	//*   6   14:tableswitch     5 8: default 44
	//	               5 77
	//	               6 53
	//	               7 69
	//	               8 69
			default:
				return _currToken.asCharArray().length;
	//    7   44:aload_0         
	//    8   45:getfield        #149 <Field JsonToken _currToken>
	//    9   48:invokevirtual   #827 <Method char[] JsonToken.asCharArray()>
	//   10   51:arraylength     
	//   11   52:ireturn         

			case 6: // '\006'
				if(_tokenIncomplete)
	//*  12   53:aload_0         
	//*  13   54:getfield        #255 <Field boolean _tokenIncomplete>
	//*  14   57:ifeq            69
				{
					_tokenIncomplete = false;
	//   15   60:aload_0         
	//   16   61:iconst_0        
	//   17   62:putfield        #255 <Field boolean _tokenIncomplete>
					_finishString();
	//   18   65:aload_0         
	//   19   66:invokevirtual   #829 <Method void _finishString()>
				}
				// fall through

			case 7: // '\007'
			case 8: // '\b'
				return _textBuffer.size();
	//   20   69:aload_0         
	//   21   70:getfield        #172 <Field TextBuffer _textBuffer>
	//   22   73:invokevirtual   #848 <Method int TextBuffer.size()>
	//   23   76:ireturn         

			case 5: // '\005'
				return _parsingContext.getCurrentName().length();
	//   24   77:aload_0         
	//   25   78:getfield        #118 <Field JsonReadContext _parsingContext>
	//   26   81:invokevirtual   #591 <Method String JsonReadContext.getCurrentName()>
	//   27   84:invokevirtual   #216 <Method int String.length()>
	//   28   87:ireturn         
			}
		else
			return 0;
	//   29   88:iconst_0        
	//   30   89:ireturn         
	}

	public int getTextOffset()
		throws IOException
	{
		if(_currToken != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field JsonToken _currToken>
	//*   2    4:ifnull          72
			switch(_currToken.id())
	//*   3    7:aload_0         
	//*   4    8:getfield        #149 <Field JsonToken _currToken>
	//*   5   11:invokevirtual   #585 <Method int JsonToken.id()>
			{
	//*   6   14:tableswitch     5 8: default 44
	//	               5 70
	//	               6 46
	//	               7 62
	//	               8 62
			default:
				return 0;
	//    7   44:iconst_0        
	//    8   45:ireturn         

			case 6: // '\006'
				if(_tokenIncomplete)
	//*   9   46:aload_0         
	//*  10   47:getfield        #255 <Field boolean _tokenIncomplete>
	//*  11   50:ifeq            62
				{
					_tokenIncomplete = false;
	//   12   53:aload_0         
	//   13   54:iconst_0        
	//   14   55:putfield        #255 <Field boolean _tokenIncomplete>
					_finishString();
	//   15   58:aload_0         
	//   16   59:invokevirtual   #829 <Method void _finishString()>
				}
				// fall through

			case 7: // '\007'
			case 8: // '\b'
				return _textBuffer.getTextOffset();
	//   17   62:aload_0         
	//   18   63:getfield        #172 <Field TextBuffer _textBuffer>
	//   19   66:invokevirtual   #851 <Method int TextBuffer.getTextOffset()>
	//   20   69:ireturn         

			case 5: // '\005'
				return 0;
	//   21   70:iconst_0        
	//   22   71:ireturn         
			}
		else
			return 0;
	//   23   72:iconst_0        
	//   24   73:ireturn         
	}

	public JsonLocation getTokenLocation()
	{
		if(_currToken == JsonToken.FIELD_NAME)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field JsonToken _currToken>
	//*   2    4:getstatic       #447 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:if_acmpne       49
		{
			long l = _currInputProcessed;
	//    4   10:aload_0         
	//    5   11:getfield        #81  <Field long _currInputProcessed>
	//    6   14:lstore_1        
			long l1 = _nameStartOffset - 1;
	//    7   15:aload_0         
	//    8   16:getfield        #420 <Field int _nameStartOffset>
	//    9   19:iconst_1        
	//   10   20:isub            
	//   11   21:i2l             
	//   12   22:lstore_3        
			return new JsonLocation(_getSourceReference(), l + l1, -1L, _nameStartRow, _nameStartCol);
	//   13   23:new             #810 <Class JsonLocation>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:invokevirtual   #814 <Method Object _getSourceReference()>
	//   17   31:lload_1         
	//   18   32:lload_3         
	//   19   33:ladd            
	//   20   34:ldc2w           #815 <Long -1L>
	//   21   37:aload_0         
	//   22   38:getfield        #418 <Field int _nameStartRow>
	//   23   41:aload_0         
	//   24   42:getfield        #422 <Field int _nameStartCol>
	//   25   45:invokespecial   #819 <Method void JsonLocation(Object, long, long, int, int)>
	//   26   48:areturn         
		} else
		{
			return new JsonLocation(_getSourceReference(), _tokenInputTotal - 1L, -1L, _tokenInputRow, _tokenInputCol);
	//   27   49:new             #810 <Class JsonLocation>
	//   28   52:dup             
	//   29   53:aload_0         
	//   30   54:invokevirtual   #814 <Method Object _getSourceReference()>
	//   31   57:aload_0         
	//   32   58:getfield        #415 <Field long _tokenInputTotal>
	//   33   61:lconst_1        
	//   34   62:lsub            
	//   35   63:ldc2w           #815 <Long -1L>
	//   36   66:aload_0         
	//   37   67:getfield        #239 <Field int _tokenInputRow>
	//   38   70:aload_0         
	//   39   71:getfield        #242 <Field int _tokenInputCol>
	//   40   74:invokespecial   #819 <Method void JsonLocation(Object, long, long, int, int)>
	//   41   77:areturn         
		}
	}

	public int getValueAsInt()
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field JsonToken _currToken>
	//    2    4:astore_1        
		if(jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #651 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5    9:if_acmpeq       28
	//*   6   12:aload_1         
	//*   7   13:getstatic       #597 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   16:if_acmpne       22
	//*   9   19:goto            28
			return super.getValueAsInt(0);
	//   10   22:aload_0         
	//   11   23:iconst_0        
	//   12   24:invokespecial   #855 <Method int ParserBase.getValueAsInt(int)>
	//   13   27:ireturn         
		if((_numTypesValid & 1) == 0)
	//*  14   28:aload_0         
	//*  15   29:getfield        #858 <Field int _numTypesValid>
	//*  16   32:iconst_1        
	//*  17   33:iand            
	//*  18   34:ifne            62
		{
			if(_numTypesValid == 0)
	//*  19   37:aload_0         
	//*  20   38:getfield        #858 <Field int _numTypesValid>
	//*  21   41:ifne            49
				return _parseIntValue();
	//   22   44:aload_0         
	//   23   45:invokevirtual   #861 <Method int _parseIntValue()>
	//   24   48:ireturn         
			if((_numTypesValid & 1) == 0)
	//*  25   49:aload_0         
	//*  26   50:getfield        #858 <Field int _numTypesValid>
	//*  27   53:iconst_1        
	//*  28   54:iand            
	//*  29   55:ifne            62
				convertNumberToInt();
	//   30   58:aload_0         
	//   31   59:invokevirtual   #864 <Method void convertNumberToInt()>
		}
		return _numberInt;
	//   32   62:aload_0         
	//   33   63:getfield        #867 <Field int _numberInt>
	//   34   66:ireturn         
	}

	public int getValueAsInt(int i)
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field JsonToken _currToken>
	//    2    4:astore_2        
		if(jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    5:aload_2         
	//*   4    6:getstatic       #651 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5    9:if_acmpeq       28
	//*   6   12:aload_2         
	//*   7   13:getstatic       #597 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   16:if_acmpne       22
	//*   9   19:goto            28
			return super.getValueAsInt(i);
	//   10   22:aload_0         
	//   11   23:iload_1         
	//   12   24:invokespecial   #855 <Method int ParserBase.getValueAsInt(int)>
	//   13   27:ireturn         
		if((_numTypesValid & 1) == 0)
	//*  14   28:aload_0         
	//*  15   29:getfield        #858 <Field int _numTypesValid>
	//*  16   32:iconst_1        
	//*  17   33:iand            
	//*  18   34:ifne            62
		{
			if(_numTypesValid == 0)
	//*  19   37:aload_0         
	//*  20   38:getfield        #858 <Field int _numTypesValid>
	//*  21   41:ifne            49
				return _parseIntValue();
	//   22   44:aload_0         
	//   23   45:invokevirtual   #861 <Method int _parseIntValue()>
	//   24   48:ireturn         
			if((_numTypesValid & 1) == 0)
	//*  25   49:aload_0         
	//*  26   50:getfield        #858 <Field int _numTypesValid>
	//*  27   53:iconst_1        
	//*  28   54:iand            
	//*  29   55:ifne            62
				convertNumberToInt();
	//   30   58:aload_0         
	//   31   59:invokevirtual   #864 <Method void convertNumberToInt()>
		}
		return _numberInt;
	//   32   62:aload_0         
	//   33   63:getfield        #867 <Field int _numberInt>
	//   34   66:ireturn         
	}

	public String getValueAsString()
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field JsonToken _currToken>
	//*   2    4:getstatic       #258 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       35
			if(_tokenIncomplete)
	//*   4   10:aload_0         
	//*   5   11:getfield        #255 <Field boolean _tokenIncomplete>
	//*   6   14:ifeq            27
			{
				_tokenIncomplete = false;
	//    7   17:aload_0         
	//    8   18:iconst_0        
	//    9   19:putfield        #255 <Field boolean _tokenIncomplete>
				return _finishAndReturnString();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #821 <Method String _finishAndReturnString()>
	//   12   26:areturn         
			} else
			{
				return _textBuffer.contentsAsString();
	//   13   27:aload_0         
	//   14   28:getfield        #172 <Field TextBuffer _textBuffer>
	//   15   31:invokevirtual   #579 <Method String TextBuffer.contentsAsString()>
	//   16   34:areturn         
			}
		if(_currToken == JsonToken.FIELD_NAME)
	//*  17   35:aload_0         
	//*  18   36:getfield        #149 <Field JsonToken _currToken>
	//*  19   39:getstatic       #447 <Field JsonToken JsonToken.FIELD_NAME>
	//*  20   42:if_acmpne       50
			return getCurrentName();
	//   21   45:aload_0         
	//   22   46:invokevirtual   #869 <Method String getCurrentName()>
	//   23   49:areturn         
		else
			return super.getValueAsString(((String) (null)));
	//   24   50:aload_0         
	//   25   51:aconst_null     
	//   26   52:invokespecial   #872 <Method String ParserBase.getValueAsString(String)>
	//   27   55:areturn         
	}

	public String getValueAsString(String s)
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field JsonToken _currToken>
	//*   2    4:getstatic       #258 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       35
			if(_tokenIncomplete)
	//*   4   10:aload_0         
	//*   5   11:getfield        #255 <Field boolean _tokenIncomplete>
	//*   6   14:ifeq            27
			{
				_tokenIncomplete = false;
	//    7   17:aload_0         
	//    8   18:iconst_0        
	//    9   19:putfield        #255 <Field boolean _tokenIncomplete>
				return _finishAndReturnString();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #821 <Method String _finishAndReturnString()>
	//   12   26:areturn         
			} else
			{
				return _textBuffer.contentsAsString();
	//   13   27:aload_0         
	//   14   28:getfield        #172 <Field TextBuffer _textBuffer>
	//   15   31:invokevirtual   #579 <Method String TextBuffer.contentsAsString()>
	//   16   34:areturn         
			}
		if(_currToken == JsonToken.FIELD_NAME)
	//*  17   35:aload_0         
	//*  18   36:getfield        #149 <Field JsonToken _currToken>
	//*  19   39:getstatic       #447 <Field JsonToken JsonToken.FIELD_NAME>
	//*  20   42:if_acmpne       50
			return getCurrentName();
	//   21   45:aload_0         
	//   22   46:invokevirtual   #869 <Method String getCurrentName()>
	//   23   49:areturn         
		else
			return super.getValueAsString(s);
	//   24   50:aload_0         
	//   25   51:aload_1         
	//   26   52:invokespecial   #872 <Method String ParserBase.getValueAsString(String)>
	//   27   55:areturn         
	}

	public String nextFieldName()
		throws IOException
	{
		int i;
label0:
		{
			_numTypesValid = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #858 <Field int _numTypesValid>
			if(_currToken == JsonToken.FIELD_NAME)
	//*   3    5:aload_0         
	//*   4    6:getfield        #149 <Field JsonToken _currToken>
	//*   5    9:getstatic       #447 <Field JsonToken JsonToken.FIELD_NAME>
	//*   6   12:if_acmpne       22
			{
				_nextAfterName();
	//    7   15:aload_0         
	//    8   16:invokespecial   #875 <Method JsonToken _nextAfterName()>
	//    9   19:pop             
				return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
			}
			if(_tokenIncomplete)
	//*  12   22:aload_0         
	//*  13   23:getfield        #255 <Field boolean _tokenIncomplete>
	//*  14   26:ifeq            33
				_skipString();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #877 <Method void _skipString()>
			int j = _skipWSOrEnd();
	//   17   33:aload_0         
	//   18   34:invokespecial   #879 <Method int _skipWSOrEnd()>
	//   19   37:istore_2        
			if(j < 0)
	//*  20   38:iload_2         
	//*  21   39:ifge            53
			{
				close();
	//   22   42:aload_0         
	//   23   43:invokevirtual   #880 <Method void close()>
				_currToken = null;
	//   24   46:aload_0         
	//   25   47:aconst_null     
	//   26   48:putfield        #149 <Field JsonToken _currToken>
				return null;
	//   27   51:aconst_null     
	//   28   52:areturn         
			}
			_binaryValue = null;
	//   29   53:aload_0         
	//   30   54:aconst_null     
	//   31   55:putfield        #782 <Field byte[] _binaryValue>
			if(j == 93)
	//*  32   58:iload_2         
	//*  33   59:bipush          93
	//*  34   61:icmpne          77
			{
				_closeArrayScope();
	//   35   64:aload_0         
	//   36   65:invokespecial   #151 <Method void _closeArrayScope()>
				_currToken = JsonToken.END_ARRAY;
	//   37   68:aload_0         
	//   38   69:getstatic       #154 <Field JsonToken JsonToken.END_ARRAY>
	//   39   72:putfield        #149 <Field JsonToken _currToken>
				return null;
	//   40   75:aconst_null     
	//   41   76:areturn         
			}
			if(j == 125)
	//*  42   77:iload_2         
	//*  43   78:bipush          125
	//*  44   80:icmpne          96
			{
				_closeObjectScope();
	//   45   83:aload_0         
	//   46   84:invokespecial   #140 <Method void _closeObjectScope()>
				_currToken = JsonToken.END_OBJECT;
	//   47   87:aload_0         
	//   48   88:getstatic       #146 <Field JsonToken JsonToken.END_OBJECT>
	//   49   91:putfield        #149 <Field JsonToken _currToken>
				return null;
	//   50   94:aconst_null     
	//   51   95:areturn         
			}
			i = j;
	//   52   96:iload_2         
	//   53   97:istore_1        
			if(!_parsingContext.expectComma())
				break label0;
	//   54   98:aload_0         
	//   55   99:getfield        #118 <Field JsonReadContext _parsingContext>
	//   56  102:invokevirtual   #883 <Method boolean JsonReadContext.expectComma()>
	//   57  105:ifeq            199
			if(j != 44)
	//*  58  108:iload_2         
	//*  59  109:bipush          44
	//*  60  111:icmpeq          159
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   61  114:new             #345 <Class StringBuilder>
	//   62  117:dup             
	//   63  118:invokespecial   #347 <Method void StringBuilder()>
	//   64  121:astore_3        
				stringbuilder.append("was expecting comma to separate ");
	//   65  122:aload_3         
	//   66  123:ldc2            #885 <String "was expecting comma to separate ">
	//   67  126:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   68  129:pop             
				stringbuilder.append(_parsingContext.typeDesc());
	//   69  130:aload_3         
	//   70  131:aload_0         
	//   71  132:getfield        #118 <Field JsonReadContext _parsingContext>
	//   72  135:invokevirtual   #357 <Method String JsonReadContext.typeDesc()>
	//   73  138:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   74  141:pop             
				stringbuilder.append(" entries");
	//   75  142:aload_3         
	//   76  143:ldc2            #359 <String " entries">
	//   77  146:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   78  149:pop             
				_reportUnexpectedChar(j, stringbuilder.toString());
	//   79  150:aload_0         
	//   80  151:iload_2         
	//   81  152:aload_3         
	//   82  153:invokevirtual   #362 <Method String StringBuilder.toString()>
	//   83  156:invokevirtual   #373 <Method void _reportUnexpectedChar(int, String)>
			}
			j = _skipWS();
	//   84  159:aload_0         
	//   85  160:invokespecial   #887 <Method int _skipWS()>
	//   86  163:istore_2        
			i = j;
	//   87  164:iload_2         
	//   88  165:istore_1        
			if((_features & FEAT_MASK_TRAILING_COMMA) == 0)
				break label0;
	//   89  166:aload_0         
	//   90  167:getfield        #890 <Field int _features>
	//   91  170:getstatic       #52  <Field int FEAT_MASK_TRAILING_COMMA>
	//   92  173:iand            
	//   93  174:ifeq            199
			if(j != 93)
	//*  94  177:iload_2         
	//*  95  178:bipush          93
	//*  96  180:icmpeq          191
			{
				i = j;
	//   97  183:iload_2         
	//   98  184:istore_1        
				if(j != 125)
					break label0;
	//   99  185:iload_2         
	//  100  186:bipush          125
	//  101  188:icmpne          199
			}
			_closeScope(j);
	//  102  191:aload_0         
	//  103  192:iload_2         
	//  104  193:invokespecial   #892 <Method JsonToken _closeScope(int)>
	//  105  196:pop             
			return null;
	//  106  197:aconst_null     
	//  107  198:areturn         
		}
		if(!_parsingContext.inObject())
	//* 108  199:aload_0         
	//* 109  200:getfield        #118 <Field JsonReadContext _parsingContext>
	//* 110  203:invokevirtual   #136 <Method boolean JsonReadContext.inObject()>
	//* 111  206:ifne            221
		{
			_updateLocation();
	//  112  209:aload_0         
	//  113  210:invokespecial   #114 <Method void _updateLocation()>
			_nextTokenNotInObject(i);
	//  114  213:aload_0         
	//  115  214:iload_1         
	//  116  215:invokespecial   #894 <Method JsonToken _nextTokenNotInObject(int)>
	//  117  218:pop             
			return null;
	//  118  219:aconst_null     
	//  119  220:areturn         
		}
		_updateNameLocation();
	//  120  221:aload_0         
	//  121  222:invokespecial   #896 <Method void _updateNameLocation()>
		String s = _parseName(i);
	//  122  225:aload_0         
	//  123  226:iload_1         
	//  124  227:invokevirtual   #898 <Method String _parseName(int)>
	//  125  230:astore          4
		_parsingContext.setCurrentName(s);
	//  126  232:aload_0         
	//  127  233:getfield        #118 <Field JsonReadContext _parsingContext>
	//  128  236:aload           4
	//  129  238:invokevirtual   #901 <Method void JsonReadContext.setCurrentName(String)>
		_currToken = JsonToken.FIELD_NAME;
	//  130  241:aload_0         
	//  131  242:getstatic       #447 <Field JsonToken JsonToken.FIELD_NAME>
	//  132  245:putfield        #149 <Field JsonToken _currToken>
		i = _skipColon();
	//  133  248:aload_0         
	//  134  249:invokespecial   #903 <Method int _skipColon()>
	//  135  252:istore_1        
		_updateLocation();
	//  136  253:aload_0         
	//  137  254:invokespecial   #114 <Method void _updateLocation()>
		if(i == 34)
	//* 138  257:iload_1         
	//* 139  258:bipush          34
	//* 140  260:icmpne          278
		{
			_tokenIncomplete = true;
	//  141  263:aload_0         
	//  142  264:iconst_1        
	//  143  265:putfield        #255 <Field boolean _tokenIncomplete>
			_nextToken = JsonToken.VALUE_STRING;
	//  144  268:aload_0         
	//  145  269:getstatic       #258 <Field JsonToken JsonToken.VALUE_STRING>
	//  146  272:putfield        #233 <Field JsonToken _nextToken>
			return s;
	//  147  275:aload           4
	//  148  277:areturn         
		}
		JsonToken jsontoken;
		if(i != 45)
	//* 149  278:iload_1         
	//* 150  279:bipush          45
	//* 151  281:icmpeq          433
		{
			if(i != 91)
	//* 152  284:iload_1         
	//* 153  285:bipush          91
	//* 154  287:icmpeq          426
			{
				if(i != 102)
	//* 155  290:iload_1         
	//* 156  291:bipush          102
	//* 157  293:icmpeq          415
				{
					if(i != 110)
	//* 158  296:iload_1         
	//* 159  297:bipush          110
	//* 160  299:icmpeq          404
					{
						if(i != 116)
	//* 161  302:iload_1         
	//* 162  303:bipush          116
	//* 163  305:icmpeq          393
						{
							if(i != 123)
	//* 164  308:iload_1         
	//* 165  309:bipush          123
	//* 166  311:icmpeq          386
								switch(i)
	//* 167  314:iload_1         
								{
	//* 168  315:tableswitch     48 57: default 368
	//	               48 377
	//	               49 377
	//	               50 377
	//	               51 377
	//	               52 377
	//	               53 377
	//	               54 377
	//	               55 377
	//	               56 377
	//	               57 377
								default:
									jsontoken = _handleUnexpectedValue(i);
	//  169  368:aload_0         
	//  170  369:iload_1         
	//  171  370:invokevirtual   #261 <Method JsonToken _handleUnexpectedValue(int)>
	//  172  373:astore_3        
									break;

	//* 173  374:goto            438
								case 48: // '0'
								case 49: // '1'
								case 50: // '2'
								case 51: // '3'
								case 52: // '4'
								case 53: // '5'
								case 54: // '6'
								case 55: // '7'
								case 56: // '8'
								case 57: // '9'
									jsontoken = _parsePosNumber(i);
	//  174  377:aload_0         
	//  175  378:iload_1         
	//  176  379:invokevirtual   #264 <Method JsonToken _parsePosNumber(int)>
	//  177  382:astore_3        
									break;
								}
							else
	//* 178  383:goto            438
								jsontoken = JsonToken.START_OBJECT;
	//  179  386:getstatic       #249 <Field JsonToken JsonToken.START_OBJECT>
	//  180  389:astore_3        
						} else
	//* 181  390:goto            438
						{
							_matchTrue();
	//  182  393:aload_0         
	//  183  394:invokevirtual   #267 <Method void _matchTrue()>
							jsontoken = JsonToken.VALUE_TRUE;
	//  184  397:getstatic       #270 <Field JsonToken JsonToken.VALUE_TRUE>
	//  185  400:astore_3        
						}
					} else
	//* 186  401:goto            438
					{
						_matchNull();
	//  187  404:aload_0         
	//  188  405:invokevirtual   #273 <Method void _matchNull()>
						jsontoken = JsonToken.VALUE_NULL;
	//  189  408:getstatic       #276 <Field JsonToken JsonToken.VALUE_NULL>
	//  190  411:astore_3        
					}
				} else
	//* 191  412:goto            438
				{
					_matchFalse();
	//  192  415:aload_0         
	//  193  416:invokevirtual   #279 <Method void _matchFalse()>
					jsontoken = JsonToken.VALUE_FALSE;
	//  194  419:getstatic       #282 <Field JsonToken JsonToken.VALUE_FALSE>
	//  195  422:astore_3        
				}
			} else
	//* 196  423:goto            438
			{
				jsontoken = JsonToken.START_ARRAY;
	//  197  426:getstatic       #236 <Field JsonToken JsonToken.START_ARRAY>
	//  198  429:astore_3        
			}
		} else
	//* 199  430:goto            438
		{
			jsontoken = _parseNegNumber();
	//  200  433:aload_0         
	//  201  434:invokevirtual   #285 <Method JsonToken _parseNegNumber()>
	//  202  437:astore_3        
		}
		_nextToken = jsontoken;
	//  203  438:aload_0         
	//  204  439:aload_3         
	//  205  440:putfield        #233 <Field JsonToken _nextToken>
		return s;
	//  206  443:aload           4
	//  207  445:areturn         
	}

	public String nextTextValue()
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field JsonToken _currToken>
	//    2    4:astore_2        
		JsonToken jsontoken1 = JsonToken.FIELD_NAME;
	//    3    5:getstatic       #447 <Field JsonToken JsonToken.FIELD_NAME>
	//    4    8:astore_3        
		Object obj = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
		if(jsontoken == jsontoken1)
	//*   7   11:aload_2         
	//*   8   12:aload_3         
	//*   9   13:if_acmpne       124
		{
			_nameCopied = false;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #230 <Field boolean _nameCopied>
			obj = ((Object) (_nextToken));
	//   13   21:aload_0         
	//   14   22:getfield        #233 <Field JsonToken _nextToken>
	//   15   25:astore_1        
			_nextToken = null;
	//   16   26:aload_0         
	//   17   27:aconst_null     
	//   18   28:putfield        #233 <Field JsonToken _nextToken>
			_currToken = ((JsonToken) (obj));
	//   19   31:aload_0         
	//   20   32:aload_1         
	//   21   33:putfield        #149 <Field JsonToken _currToken>
			if(obj == JsonToken.VALUE_STRING)
	//*  22   36:aload_1         
	//*  23   37:getstatic       #258 <Field JsonToken JsonToken.VALUE_STRING>
	//*  24   40:if_acmpne       68
				if(_tokenIncomplete)
	//*  25   43:aload_0         
	//*  26   44:getfield        #255 <Field boolean _tokenIncomplete>
	//*  27   47:ifeq            60
				{
					_tokenIncomplete = false;
	//   28   50:aload_0         
	//   29   51:iconst_0        
	//   30   52:putfield        #255 <Field boolean _tokenIncomplete>
					return _finishAndReturnString();
	//   31   55:aload_0         
	//   32   56:invokevirtual   #821 <Method String _finishAndReturnString()>
	//   33   59:areturn         
				} else
				{
					return _textBuffer.contentsAsString();
	//   34   60:aload_0         
	//   35   61:getfield        #172 <Field TextBuffer _textBuffer>
	//   36   64:invokevirtual   #579 <Method String TextBuffer.contentsAsString()>
	//   37   67:areturn         
				}
			if(obj == JsonToken.START_ARRAY)
	//*  38   68:aload_1         
	//*  39   69:getstatic       #236 <Field JsonToken JsonToken.START_ARRAY>
	//*  40   72:if_acmpne       96
			{
				_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   41   75:aload_0         
	//   42   76:aload_0         
	//   43   77:getfield        #118 <Field JsonReadContext _parsingContext>
	//   44   80:aload_0         
	//   45   81:getfield        #239 <Field int _tokenInputRow>
	//   46   84:aload_0         
	//   47   85:getfield        #242 <Field int _tokenInputCol>
	//   48   88:invokevirtual   #246 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   49   91:putfield        #118 <Field JsonReadContext _parsingContext>
				return null;
	//   50   94:aconst_null     
	//   51   95:areturn         
			}
			if(obj == JsonToken.START_OBJECT)
	//*  52   96:aload_1         
	//*  53   97:getstatic       #249 <Field JsonToken JsonToken.START_OBJECT>
	//*  54  100:if_acmpne       122
				_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   55  103:aload_0         
	//   56  104:aload_0         
	//   57  105:getfield        #118 <Field JsonReadContext _parsingContext>
	//   58  108:aload_0         
	//   59  109:getfield        #239 <Field int _tokenInputRow>
	//   60  112:aload_0         
	//   61  113:getfield        #242 <Field int _tokenInputCol>
	//   62  116:invokevirtual   #252 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   63  119:putfield        #118 <Field JsonReadContext _parsingContext>
			return null;
	//   64  122:aconst_null     
	//   65  123:areturn         
		}
		if(nextToken() == JsonToken.VALUE_STRING)
	//*  66  124:aload_0         
	//*  67  125:invokevirtual   #907 <Method JsonToken nextToken()>
	//*  68  128:getstatic       #258 <Field JsonToken JsonToken.VALUE_STRING>
	//*  69  131:if_acmpne       139
			obj = ((Object) (getText()));
	//   70  134:aload_0         
	//   71  135:invokevirtual   #801 <Method String getText()>
	//   72  138:astore_1        
		return ((String) (obj));
	//   73  139:aload_1         
	//   74  140:areturn         
	}

	public JsonToken nextToken()
		throws IOException
	{
		int i;
label0:
		{
			if(_currToken == JsonToken.FIELD_NAME)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field JsonToken _currToken>
	//*   2    4:getstatic       #447 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:if_acmpne       15
				return _nextAfterName();
	//    4   10:aload_0         
	//    5   11:invokespecial   #875 <Method JsonToken _nextAfterName()>
	//    6   14:areturn         
			_numTypesValid = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #858 <Field int _numTypesValid>
			if(_tokenIncomplete)
	//*  10   20:aload_0         
	//*  11   21:getfield        #255 <Field boolean _tokenIncomplete>
	//*  12   24:ifeq            31
				_skipString();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #877 <Method void _skipString()>
			int j = _skipWSOrEnd();
	//   15   31:aload_0         
	//   16   32:invokespecial   #879 <Method int _skipWSOrEnd()>
	//   17   35:istore_2        
			if(j < 0)
	//*  18   36:iload_2         
	//*  19   37:ifge            51
			{
				close();
	//   20   40:aload_0         
	//   21   41:invokevirtual   #880 <Method void close()>
				_currToken = null;
	//   22   44:aload_0         
	//   23   45:aconst_null     
	//   24   46:putfield        #149 <Field JsonToken _currToken>
				return null;
	//   25   49:aconst_null     
	//   26   50:areturn         
			}
			_binaryValue = null;
	//   27   51:aload_0         
	//   28   52:aconst_null     
	//   29   53:putfield        #782 <Field byte[] _binaryValue>
			if(j == 93)
	//*  30   56:iload_2         
	//*  31   57:bipush          93
	//*  32   59:icmpne          77
			{
				_closeArrayScope();
	//   33   62:aload_0         
	//   34   63:invokespecial   #151 <Method void _closeArrayScope()>
				JsonToken jsontoken = JsonToken.END_ARRAY;
	//   35   66:getstatic       #154 <Field JsonToken JsonToken.END_ARRAY>
	//   36   69:astore_3        
				_currToken = jsontoken;
	//   37   70:aload_0         
	//   38   71:aload_3         
	//   39   72:putfield        #149 <Field JsonToken _currToken>
				return jsontoken;
	//   40   75:aload_3         
	//   41   76:areturn         
			}
			if(j == 125)
	//*  42   77:iload_2         
	//*  43   78:bipush          125
	//*  44   80:icmpne          98
			{
				_closeObjectScope();
	//   45   83:aload_0         
	//   46   84:invokespecial   #140 <Method void _closeObjectScope()>
				JsonToken jsontoken1 = JsonToken.END_OBJECT;
	//   47   87:getstatic       #146 <Field JsonToken JsonToken.END_OBJECT>
	//   48   90:astore_3        
				_currToken = jsontoken1;
	//   49   91:aload_0         
	//   50   92:aload_3         
	//   51   93:putfield        #149 <Field JsonToken _currToken>
				return jsontoken1;
	//   52   96:aload_3         
	//   53   97:areturn         
			}
			i = j;
	//   54   98:iload_2         
	//   55   99:istore_1        
			if(!_parsingContext.expectComma())
				break label0;
	//   56  100:aload_0         
	//   57  101:getfield        #118 <Field JsonReadContext _parsingContext>
	//   58  104:invokevirtual   #883 <Method boolean JsonReadContext.expectComma()>
	//   59  107:ifeq            199
			if(j != 44)
	//*  60  110:iload_2         
	//*  61  111:bipush          44
	//*  62  113:icmpeq          161
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   63  116:new             #345 <Class StringBuilder>
	//   64  119:dup             
	//   65  120:invokespecial   #347 <Method void StringBuilder()>
	//   66  123:astore_3        
				stringbuilder.append("was expecting comma to separate ");
	//   67  124:aload_3         
	//   68  125:ldc2            #885 <String "was expecting comma to separate ">
	//   69  128:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   70  131:pop             
				stringbuilder.append(_parsingContext.typeDesc());
	//   71  132:aload_3         
	//   72  133:aload_0         
	//   73  134:getfield        #118 <Field JsonReadContext _parsingContext>
	//   74  137:invokevirtual   #357 <Method String JsonReadContext.typeDesc()>
	//   75  140:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   76  143:pop             
				stringbuilder.append(" entries");
	//   77  144:aload_3         
	//   78  145:ldc2            #359 <String " entries">
	//   79  148:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   80  151:pop             
				_reportUnexpectedChar(j, stringbuilder.toString());
	//   81  152:aload_0         
	//   82  153:iload_2         
	//   83  154:aload_3         
	//   84  155:invokevirtual   #362 <Method String StringBuilder.toString()>
	//   85  158:invokevirtual   #373 <Method void _reportUnexpectedChar(int, String)>
			}
			j = _skipWS();
	//   86  161:aload_0         
	//   87  162:invokespecial   #887 <Method int _skipWS()>
	//   88  165:istore_2        
			i = j;
	//   89  166:iload_2         
	//   90  167:istore_1        
			if((_features & FEAT_MASK_TRAILING_COMMA) == 0)
				break label0;
	//   91  168:aload_0         
	//   92  169:getfield        #890 <Field int _features>
	//   93  172:getstatic       #52  <Field int FEAT_MASK_TRAILING_COMMA>
	//   94  175:iand            
	//   95  176:ifeq            199
			if(j != 93)
	//*  96  179:iload_2         
	//*  97  180:bipush          93
	//*  98  182:icmpeq          193
			{
				i = j;
	//   99  185:iload_2         
	//  100  186:istore_1        
				if(j != 125)
					break label0;
	//  101  187:iload_2         
	//  102  188:bipush          125
	//  103  190:icmpne          199
			}
			return _closeScope(j);
	//  104  193:aload_0         
	//  105  194:iload_2         
	//  106  195:invokespecial   #892 <Method JsonToken _closeScope(int)>
	//  107  198:areturn         
		}
		if(!_parsingContext.inObject())
	//* 108  199:aload_0         
	//* 109  200:getfield        #118 <Field JsonReadContext _parsingContext>
	//* 110  203:invokevirtual   #136 <Method boolean JsonReadContext.inObject()>
	//* 111  206:ifne            219
		{
			_updateLocation();
	//  112  209:aload_0         
	//  113  210:invokespecial   #114 <Method void _updateLocation()>
			return _nextTokenNotInObject(i);
	//  114  213:aload_0         
	//  115  214:iload_1         
	//  116  215:invokespecial   #894 <Method JsonToken _nextTokenNotInObject(int)>
	//  117  218:areturn         
		}
		_updateNameLocation();
	//  118  219:aload_0         
	//  119  220:invokespecial   #896 <Method void _updateNameLocation()>
		Object obj = ((Object) (_parseName(i)));
	//  120  223:aload_0         
	//  121  224:iload_1         
	//  122  225:invokevirtual   #898 <Method String _parseName(int)>
	//  123  228:astore_3        
		_parsingContext.setCurrentName(((String) (obj)));
	//  124  229:aload_0         
	//  125  230:getfield        #118 <Field JsonReadContext _parsingContext>
	//  126  233:aload_3         
	//  127  234:invokevirtual   #901 <Method void JsonReadContext.setCurrentName(String)>
		_currToken = JsonToken.FIELD_NAME;
	//  128  237:aload_0         
	//  129  238:getstatic       #447 <Field JsonToken JsonToken.FIELD_NAME>
	//  130  241:putfield        #149 <Field JsonToken _currToken>
		i = _skipColon();
	//  131  244:aload_0         
	//  132  245:invokespecial   #903 <Method int _skipColon()>
	//  133  248:istore_1        
		_updateLocation();
	//  134  249:aload_0         
	//  135  250:invokespecial   #114 <Method void _updateLocation()>
		if(i == 34)
	//* 136  253:iload_1         
	//* 137  254:bipush          34
	//* 138  256:icmpne          276
		{
			_tokenIncomplete = true;
	//  139  259:aload_0         
	//  140  260:iconst_1        
	//  141  261:putfield        #255 <Field boolean _tokenIncomplete>
			_nextToken = JsonToken.VALUE_STRING;
	//  142  264:aload_0         
	//  143  265:getstatic       #258 <Field JsonToken JsonToken.VALUE_STRING>
	//  144  268:putfield        #233 <Field JsonToken _nextToken>
			return _currToken;
	//  145  271:aload_0         
	//  146  272:getfield        #149 <Field JsonToken _currToken>
	//  147  275:areturn         
		}
		if(i != 45)
	//* 148  276:iload_1         
	//* 149  277:bipush          45
	//* 150  279:icmpeq          433
		{
			if(i != 91)
	//* 151  282:iload_1         
	//* 152  283:bipush          91
	//* 153  285:icmpeq          426
			{
				if(i != 102)
	//* 154  288:iload_1         
	//* 155  289:bipush          102
	//* 156  291:icmpeq          415
				{
					if(i != 110)
	//* 157  294:iload_1         
	//* 158  295:bipush          110
	//* 159  297:icmpeq          404
					{
						if(i != 116)
	//* 160  300:iload_1         
	//* 161  301:bipush          116
	//* 162  303:icmpeq          393
						{
							if(i != 123)
	//* 163  306:iload_1         
	//* 164  307:bipush          123
	//* 165  309:icmpeq          386
								switch(i)
	//* 166  312:iload_1         
								{
	//* 167  313:tableswitch     48 57: default 368
	//	               48 377
	//	               49 377
	//	               50 377
	//	               51 377
	//	               52 377
	//	               53 377
	//	               54 377
	//	               55 377
	//	               56 377
	//	               57 377
								default:
									obj = ((Object) (_handleUnexpectedValue(i)));
	//  168  368:aload_0         
	//  169  369:iload_1         
	//  170  370:invokevirtual   #261 <Method JsonToken _handleUnexpectedValue(int)>
	//  171  373:astore_3        
									break;

	//* 172  374:goto            438
								case 48: // '0'
								case 49: // '1'
								case 50: // '2'
								case 51: // '3'
								case 52: // '4'
								case 53: // '5'
								case 54: // '6'
								case 55: // '7'
								case 56: // '8'
								case 57: // '9'
									obj = ((Object) (_parsePosNumber(i)));
	//  173  377:aload_0         
	//  174  378:iload_1         
	//  175  379:invokevirtual   #264 <Method JsonToken _parsePosNumber(int)>
	//  176  382:astore_3        
									break;
								}
							else
	//* 177  383:goto            438
								obj = ((Object) (JsonToken.START_OBJECT));
	//  178  386:getstatic       #249 <Field JsonToken JsonToken.START_OBJECT>
	//  179  389:astore_3        
						} else
	//* 180  390:goto            438
						{
							_matchTrue();
	//  181  393:aload_0         
	//  182  394:invokevirtual   #267 <Method void _matchTrue()>
							obj = ((Object) (JsonToken.VALUE_TRUE));
	//  183  397:getstatic       #270 <Field JsonToken JsonToken.VALUE_TRUE>
	//  184  400:astore_3        
						}
					} else
	//* 185  401:goto            438
					{
						_matchNull();
	//  186  404:aload_0         
	//  187  405:invokevirtual   #273 <Method void _matchNull()>
						obj = ((Object) (JsonToken.VALUE_NULL));
	//  188  408:getstatic       #276 <Field JsonToken JsonToken.VALUE_NULL>
	//  189  411:astore_3        
					}
				} else
	//* 190  412:goto            438
				{
					_matchFalse();
	//  191  415:aload_0         
	//  192  416:invokevirtual   #279 <Method void _matchFalse()>
					obj = ((Object) (JsonToken.VALUE_FALSE));
	//  193  419:getstatic       #282 <Field JsonToken JsonToken.VALUE_FALSE>
	//  194  422:astore_3        
				}
			} else
	//* 195  423:goto            438
			{
				obj = ((Object) (JsonToken.START_ARRAY));
	//  196  426:getstatic       #236 <Field JsonToken JsonToken.START_ARRAY>
	//  197  429:astore_3        
			}
		} else
	//* 198  430:goto            438
		{
			obj = ((Object) (_parseNegNumber()));
	//  199  433:aload_0         
	//  200  434:invokevirtual   #285 <Method JsonToken _parseNegNumber()>
	//  201  437:astore_3        
		}
		_nextToken = ((JsonToken) (obj));
	//  202  438:aload_0         
	//  203  439:aload_3         
	//  204  440:putfield        #233 <Field JsonToken _nextToken>
		return _currToken;
	//  205  443:aload_0         
	//  206  444:getfield        #149 <Field JsonToken _currToken>
	//  207  447:areturn         
	}

	protected final String parseEscapedName(int ai[], int i, int j, int k, int l)
		throws IOException
	{
		int ai2[] = _icLatin1;
	//    0    0:getstatic       #40  <Field int[] _icLatin1>
	//    1    3:astore          11
		int i1 = k;
	//    2    5:iload           4
	//    3    7:istore          6
		do
		{
			int ai1[] = ai;
	//    4    9:aload_1         
	//    5   10:astore          10
			int j1 = i;
	//    6   12:iload_2         
	//    7   13:istore          7
			int l1 = j;
	//    8   15:iload_3         
	//    9   16:istore          9
			k = i1;
	//   10   18:iload           6
	//   11   20:istore          4
			int k1 = l;
	//   12   22:iload           5
	//   13   24:istore          8
			if(ai2[i1] != 0)
	//*  14   26:aload           11
	//*  15   28:iload           6
	//*  16   30:iaload          
	//*  17   31:ifeq            413
			{
				if(i1 == 34)
	//*  18   34:iload           6
	//*  19   36:bipush          34
	//*  20   38:icmpne          124
				{
					ai1 = ai;
	//   21   41:aload_1         
	//   22   42:astore          10
					k = i;
	//   23   44:iload_2         
	//   24   45:istore          4
					if(l > 0)
	//*  25   47:iload           5
	//*  26   49:ifle            90
					{
						ai1 = ai;
	//   27   52:aload_1         
	//   28   53:astore          10
						if(i >= ai.length)
	//*  29   55:iload_2         
	//*  30   56:aload_1         
	//*  31   57:arraylength     
	//*  32   58:icmplt          75
						{
							ai1 = growArrayBy(ai, ai.length);
	//   33   61:aload_1         
	//   34   62:aload_1         
	//   35   63:arraylength     
	//   36   64:invokestatic    #479 <Method int[] growArrayBy(int[], int)>
	//   37   67:astore          10
							_quadBuffer = ai1;
	//   38   69:aload_0         
	//   39   70:aload           10
	//   40   72:putfield        #60  <Field int[] _quadBuffer>
						}
						ai1[i] = _padLastQuad(j, l);
	//   41   75:aload           10
	//   42   77:iload_2         
	//   43   78:iload_3         
	//   44   79:iload           5
	//   45   81:invokestatic    #463 <Method int _padLastQuad(int, int)>
	//   46   84:iastore         
						k = i + 1;
	//   47   85:iload_2         
	//   48   86:iconst_1        
	//   49   87:iadd            
	//   50   88:istore          4
					}
					String s = _symbols.findName(ai1, k);
	//   51   90:aload_0         
	//   52   91:getfield        #66  <Field ByteQuadsCanonicalizer _symbols>
	//   53   94:aload           10
	//   54   96:iload           4
	//   55   98:invokevirtual   #482 <Method String ByteQuadsCanonicalizer.findName(int[], int)>
	//   56  101:astore          11
					ai = ((int []) (s));
	//   57  103:aload           11
	//   58  105:astore_1        
					if(s == null)
	//*  59  106:aload           11
	//*  60  108:ifnonnull       122
						ai = ((int []) (addName(ai1, k, l)));
	//   61  111:aload_0         
	//   62  112:aload           10
	//   63  114:iload           4
	//   64  116:iload           5
	//   65  118:invokespecial   #468 <Method String addName(int[], int, int)>
	//   66  121:astore_1        
					return ((String) (ai));
	//   67  122:aload_1         
	//   68  123:areturn         
				}
				if(i1 != 92)
	//*  69  124:iload           6
	//*  70  126:bipush          92
	//*  71  128:icmpeq          143
					_throwUnquotedSpace(i1, "name");
	//   72  131:aload_0         
	//   73  132:iload           6
	//   74  134:ldc2            #713 <String "name">
	//   75  137:invokevirtual   #194 <Method void _throwUnquotedSpace(int, String)>
				else
	//*  76  140:goto            149
					i1 = ((int) (_decodeEscaped()));
	//   77  143:aload_0         
	//   78  144:invokevirtual   #208 <Method char _decodeEscaped()>
	//   79  147:istore          6
				ai1 = ai;
	//   80  149:aload_1         
	//   81  150:astore          10
				j1 = i;
	//   82  152:iload_2         
	//   83  153:istore          7
				l1 = j;
	//   84  155:iload_3         
	//   85  156:istore          9
				k = i1;
	//   86  158:iload           6
	//   87  160:istore          4
				k1 = l;
	//   88  162:iload           5
	//   89  164:istore          8
				if(i1 > 127)
	//*  90  166:iload           6
	//*  91  168:bipush          127
	//*  92  170:icmple          413
				{
					ai1 = ai;
	//   93  173:aload_1         
	//   94  174:astore          10
					k = i;
	//   95  176:iload_2         
	//   96  177:istore          4
					k1 = j;
	//   97  179:iload_3         
	//   98  180:istore          8
					j1 = l;
	//   99  182:iload           5
	//  100  184:istore          7
					if(l >= 4)
	//* 101  186:iload           5
	//* 102  188:iconst_4        
	//* 103  189:icmplt          231
					{
						ai1 = ai;
	//  104  192:aload_1         
	//  105  193:astore          10
						if(i >= ai.length)
	//* 106  195:iload_2         
	//* 107  196:aload_1         
	//* 108  197:arraylength     
	//* 109  198:icmplt          215
						{
							ai1 = growArrayBy(ai, ai.length);
	//  110  201:aload_1         
	//  111  202:aload_1         
	//  112  203:arraylength     
	//  113  204:invokestatic    #479 <Method int[] growArrayBy(int[], int)>
	//  114  207:astore          10
							_quadBuffer = ai1;
	//  115  209:aload_0         
	//  116  210:aload           10
	//  117  212:putfield        #60  <Field int[] _quadBuffer>
						}
						ai1[i] = j;
	//  118  215:aload           10
	//  119  217:iload_2         
	//  120  218:iload_3         
	//  121  219:iastore         
						k = i + 1;
	//  122  220:iload_2         
	//  123  221:iconst_1        
	//  124  222:iadd            
	//  125  223:istore          4
						k1 = 0;
	//  126  225:iconst_0        
	//  127  226:istore          8
						j1 = 0;
	//  128  228:iconst_0        
	//  129  229:istore          7
					}
					if(i1 < 2048)
	//* 130  231:iload           6
	//* 131  233:sipush          2048
	//* 132  236:icmpge          274
					{
						j = k1 << 8 | (i1 >> 6 | 0xc0);
	//  133  239:iload           8
	//  134  241:bipush          8
	//  135  243:ishl            
	//  136  244:iload           6
	//  137  246:bipush          6
	//  138  248:ishr            
	//  139  249:sipush          192
	//  140  252:ior             
	//  141  253:ior             
	//  142  254:istore_3        
						l = j1 + 1;
	//  143  255:iload           7
	//  144  257:iconst_1        
	//  145  258:iadd            
	//  146  259:istore          5
						ai = ai1;
	//  147  261:aload           10
	//  148  263:astore_1        
						i = k;
	//  149  264:iload           4
	//  150  266:istore_2        
						k = l;
	//  151  267:iload           5
	//  152  269:istore          4
					} else
	//* 153  271:goto            385
					{
						k1 = k1 << 8 | (i1 >> 12 | 0xe0);
	//  154  274:iload           8
	//  155  276:bipush          8
	//  156  278:ishl            
	//  157  279:iload           6
	//  158  281:bipush          12
	//  159  283:ishr            
	//  160  284:sipush          224
	//  161  287:ior             
	//  162  288:ior             
	//  163  289:istore          8
						j1++;
	//  164  291:iload           7
	//  165  293:iconst_1        
	//  166  294:iadd            
	//  167  295:istore          7
						ai = ai1;
	//  168  297:aload           10
	//  169  299:astore_1        
						i = k;
	//  170  300:iload           4
	//  171  302:istore_2        
						l = k1;
	//  172  303:iload           8
	//  173  305:istore          5
						j = j1;
	//  174  307:iload           7
	//  175  309:istore_3        
						if(j1 >= 4)
	//* 176  310:iload           7
	//* 177  312:iconst_4        
	//* 178  313:icmplt          357
						{
							ai = ai1;
	//  179  316:aload           10
	//  180  318:astore_1        
							if(k >= ai1.length)
	//* 181  319:iload           4
	//* 182  321:aload           10
	//* 183  323:arraylength     
	//* 184  324:icmplt          341
							{
								ai = growArrayBy(ai1, ai1.length);
	//  185  327:aload           10
	//  186  329:aload           10
	//  187  331:arraylength     
	//  188  332:invokestatic    #479 <Method int[] growArrayBy(int[], int)>
	//  189  335:astore_1        
								_quadBuffer = ai;
	//  190  336:aload_0         
	//  191  337:aload_1         
	//  192  338:putfield        #60  <Field int[] _quadBuffer>
							}
							ai[k] = k1;
	//  193  341:aload_1         
	//  194  342:iload           4
	//  195  344:iload           8
	//  196  346:iastore         
							i = k + 1;
	//  197  347:iload           4
	//  198  349:iconst_1        
	//  199  350:iadd            
	//  200  351:istore_2        
							l = 0;
	//  201  352:iconst_0        
	//  202  353:istore          5
							j = 0;
	//  203  355:iconst_0        
	//  204  356:istore_3        
						}
						l = l << 8 | (i1 >> 6 & 0x3f | 0x80);
	//  205  357:iload           5
	//  206  359:bipush          8
	//  207  361:ishl            
	//  208  362:iload           6
	//  209  364:bipush          6
	//  210  366:ishr            
	//  211  367:bipush          63
	//  212  369:iand            
	//  213  370:sipush          128
	//  214  373:ior             
	//  215  374:ior             
	//  216  375:istore          5
						k = j + 1;
	//  217  377:iload_3         
	//  218  378:iconst_1        
	//  219  379:iadd            
	//  220  380:istore          4
						j = l;
	//  221  382:iload           5
	//  222  384:istore_3        
					}
					l = i1 & 0x3f | 0x80;
	//  223  385:iload           6
	//  224  387:bipush          63
	//  225  389:iand            
	//  226  390:sipush          128
	//  227  393:ior             
	//  228  394:istore          5
					k1 = k;
	//  229  396:iload           4
	//  230  398:istore          8
					k = l;
	//  231  400:iload           5
	//  232  402:istore          4
					l1 = j;
	//  233  404:iload_3         
	//  234  405:istore          9
					j1 = i;
	//  235  407:iload_2         
	//  236  408:istore          7
					ai1 = ai;
	//  237  410:aload_1         
	//  238  411:astore          10
				}
			}
			if(k1 < 4)
	//* 239  413:iload           8
	//* 240  415:iconst_4        
	//* 241  416:icmpge          443
			{
				l = k1 + 1;
	//  242  419:iload           8
	//  243  421:iconst_1        
	//  244  422:iadd            
	//  245  423:istore          5
				j = l1 << 8 | k;
	//  246  425:iload           9
	//  247  427:bipush          8
	//  248  429:ishl            
	//  249  430:iload           4
	//  250  432:ior             
	//  251  433:istore_3        
				ai = ai1;
	//  252  434:aload           10
	//  253  436:astore_1        
				i = j1;
	//  254  437:iload           7
	//  255  439:istore_2        
			} else
	//* 256  440:goto            485
			{
				ai = ai1;
	//  257  443:aload           10
	//  258  445:astore_1        
				if(j1 >= ai1.length)
	//* 259  446:iload           7
	//* 260  448:aload           10
	//* 261  450:arraylength     
	//* 262  451:icmplt          468
				{
					ai = growArrayBy(ai1, ai1.length);
	//  263  454:aload           10
	//  264  456:aload           10
	//  265  458:arraylength     
	//  266  459:invokestatic    #479 <Method int[] growArrayBy(int[], int)>
	//  267  462:astore_1        
					_quadBuffer = ai;
	//  268  463:aload_0         
	//  269  464:aload_1         
	//  270  465:putfield        #60  <Field int[] _quadBuffer>
				}
				ai[j1] = l1;
	//  271  468:aload_1         
	//  272  469:iload           7
	//  273  471:iload           9
	//  274  473:iastore         
				j = k;
	//  275  474:iload           4
	//  276  476:istore_3        
				i = j1 + 1;
	//  277  477:iload           7
	//  278  479:iconst_1        
	//  279  480:iadd            
	//  280  481:istore_2        
				l = 1;
	//  281  482:iconst_1        
	//  282  483:istore          5
			}
			if(_inputPtr >= _inputEnd && !_loadMore())
	//* 283  485:aload_0         
	//* 284  486:getfield        #71  <Field int _inputPtr>
	//* 285  489:aload_0         
	//* 286  490:getfield        #74  <Field int _inputEnd>
	//* 287  493:icmplt          513
	//* 288  496:aload_0         
	//* 289  497:invokevirtual   #219 <Method boolean _loadMore()>
	//* 290  500:ifne            513
				_reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
	//  291  503:aload_0         
	//  292  504:ldc2            #444 <String " in field name">
	//  293  507:getstatic       #447 <Field JsonToken JsonToken.FIELD_NAME>
	//  294  510:invokevirtual   #332 <Method void _reportInvalidEOF(String, JsonToken)>
			ai1 = ((int []) (_inputBuffer));
	//  295  513:aload_0         
	//  296  514:getfield        #68  <Field byte[] _inputBuffer>
	//  297  517:astore          10
			k = _inputPtr;
	//  298  519:aload_0         
	//  299  520:getfield        #71  <Field int _inputPtr>
	//  300  523:istore          4
			_inputPtr = k + 1;
	//  301  525:aload_0         
	//  302  526:iload           4
	//  303  528:iconst_1        
	//  304  529:iadd            
	//  305  530:putfield        #71  <Field int _inputPtr>
			i1 = ai1[k] & 0xff;
	//  306  533:aload           10
	//  307  535:iload           4
	//  308  537:baload          
	//  309  538:sipush          255
	//  310  541:iand            
	//  311  542:istore          6
		} while(true);
	//  312  544:goto            9
	}

	protected final String parseLongName(int i, int j, int k)
		throws IOException
	{
		int ai[] = _quadBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int[] _quadBuffer>
	//    2    4:astore          4
		ai[0] = _quad1;
	//    3    6:aload           4
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:getfield        #721 <Field int _quad1>
	//    7   13:iastore         
		ai[1] = j;
	//    8   14:aload           4
	//    9   16:iconst_1        
	//   10   17:iload_2         
	//   11   18:iastore         
		ai[2] = k;
	//   12   19:aload           4
	//   13   21:iconst_2        
	//   14   22:iload_3         
	//   15   23:iastore         
		ai = ((int []) (_inputBuffer));
	//   16   24:aload_0         
	//   17   25:getfield        #68  <Field byte[] _inputBuffer>
	//   18   28:astore          4
		int ai1[] = _icLatin1;
	//   19   30:getstatic       #40  <Field int[] _icLatin1>
	//   20   33:astore          5
		k = 3;
	//   21   35:iconst_3        
	//   22   36:istore_3        
		j = i;
	//   23   37:iload_1         
	//   24   38:istore_2        
		for(i = k; _inputPtr + 4 <= _inputEnd; i++)
	//*  25   39:iload_3         
	//*  26   40:istore_1        
	//*  27   41:aload_0         
	//*  28   42:getfield        #71  <Field int _inputPtr>
	//*  29   45:iconst_4        
	//*  30   46:iadd            
	//*  31   47:aload_0         
	//*  32   48:getfield        #74  <Field int _inputEnd>
	//*  33   51:icmpgt          348
		{
			k = _inputPtr;
	//   34   54:aload_0         
	//   35   55:getfield        #71  <Field int _inputPtr>
	//   36   58:istore_3        
			_inputPtr = k + 1;
	//   37   59:aload_0         
	//   38   60:iload_3         
	//   39   61:iconst_1        
	//   40   62:iadd            
	//   41   63:putfield        #71  <Field int _inputPtr>
			k = ai[k] & 0xff;
	//   42   66:aload           4
	//   43   68:iload_3         
	//   44   69:baload          
	//   45   70:sipush          255
	//   46   73:iand            
	//   47   74:istore_3        
			if(ai1[k] != 0)
	//*  48   75:aload           5
	//*  49   77:iload_3         
	//*  50   78:iaload          
	//*  51   79:ifeq            113
				if(k == 34)
	//*  52   82:iload_3         
	//*  53   83:bipush          34
	//*  54   85:icmpne          100
					return findName(_quadBuffer, i, j, 1);
	//   55   88:aload_0         
	//   56   89:aload_0         
	//   57   90:getfield        #60  <Field int[] _quadBuffer>
	//   58   93:iload_1         
	//   59   94:iload_2         
	//   60   95:iconst_1        
	//   61   96:invokespecial   #910 <Method String findName(int[], int, int, int)>
	//   62   99:areturn         
				else
					return parseEscapedName(_quadBuffer, i, j, k, 1);
	//   63  100:aload_0         
	//   64  101:aload_0         
	//   65  102:getfield        #60  <Field int[] _quadBuffer>
	//   66  105:iload_1         
	//   67  106:iload_2         
	//   68  107:iload_3         
	//   69  108:iconst_1        
	//   70  109:invokevirtual   #488 <Method String parseEscapedName(int[], int, int, int, int)>
	//   71  112:areturn         
			j = k | j << 8;
	//   72  113:iload_3         
	//   73  114:iload_2         
	//   74  115:bipush          8
	//   75  117:ishl            
	//   76  118:ior             
	//   77  119:istore_2        
			k = _inputPtr;
	//   78  120:aload_0         
	//   79  121:getfield        #71  <Field int _inputPtr>
	//   80  124:istore_3        
			_inputPtr = k + 1;
	//   81  125:aload_0         
	//   82  126:iload_3         
	//   83  127:iconst_1        
	//   84  128:iadd            
	//   85  129:putfield        #71  <Field int _inputPtr>
			k = ai[k] & 0xff;
	//   86  132:aload           4
	//   87  134:iload_3         
	//   88  135:baload          
	//   89  136:sipush          255
	//   90  139:iand            
	//   91  140:istore_3        
			if(ai1[k] != 0)
	//*  92  141:aload           5
	//*  93  143:iload_3         
	//*  94  144:iaload          
	//*  95  145:ifeq            179
				if(k == 34)
	//*  96  148:iload_3         
	//*  97  149:bipush          34
	//*  98  151:icmpne          166
					return findName(_quadBuffer, i, j, 2);
	//   99  154:aload_0         
	//  100  155:aload_0         
	//  101  156:getfield        #60  <Field int[] _quadBuffer>
	//  102  159:iload_1         
	//  103  160:iload_2         
	//  104  161:iconst_2        
	//  105  162:invokespecial   #910 <Method String findName(int[], int, int, int)>
	//  106  165:areturn         
				else
					return parseEscapedName(_quadBuffer, i, j, k, 2);
	//  107  166:aload_0         
	//  108  167:aload_0         
	//  109  168:getfield        #60  <Field int[] _quadBuffer>
	//  110  171:iload_1         
	//  111  172:iload_2         
	//  112  173:iload_3         
	//  113  174:iconst_2        
	//  114  175:invokevirtual   #488 <Method String parseEscapedName(int[], int, int, int, int)>
	//  115  178:areturn         
			j = j << 8 | k;
	//  116  179:iload_2         
	//  117  180:bipush          8
	//  118  182:ishl            
	//  119  183:iload_3         
	//  120  184:ior             
	//  121  185:istore_2        
			k = _inputPtr;
	//  122  186:aload_0         
	//  123  187:getfield        #71  <Field int _inputPtr>
	//  124  190:istore_3        
			_inputPtr = k + 1;
	//  125  191:aload_0         
	//  126  192:iload_3         
	//  127  193:iconst_1        
	//  128  194:iadd            
	//  129  195:putfield        #71  <Field int _inputPtr>
			k = ai[k] & 0xff;
	//  130  198:aload           4
	//  131  200:iload_3         
	//  132  201:baload          
	//  133  202:sipush          255
	//  134  205:iand            
	//  135  206:istore_3        
			if(ai1[k] != 0)
	//* 136  207:aload           5
	//* 137  209:iload_3         
	//* 138  210:iaload          
	//* 139  211:ifeq            245
				if(k == 34)
	//* 140  214:iload_3         
	//* 141  215:bipush          34
	//* 142  217:icmpne          232
					return findName(_quadBuffer, i, j, 3);
	//  143  220:aload_0         
	//  144  221:aload_0         
	//  145  222:getfield        #60  <Field int[] _quadBuffer>
	//  146  225:iload_1         
	//  147  226:iload_2         
	//  148  227:iconst_3        
	//  149  228:invokespecial   #910 <Method String findName(int[], int, int, int)>
	//  150  231:areturn         
				else
					return parseEscapedName(_quadBuffer, i, j, k, 3);
	//  151  232:aload_0         
	//  152  233:aload_0         
	//  153  234:getfield        #60  <Field int[] _quadBuffer>
	//  154  237:iload_1         
	//  155  238:iload_2         
	//  156  239:iload_3         
	//  157  240:iconst_3        
	//  158  241:invokevirtual   #488 <Method String parseEscapedName(int[], int, int, int, int)>
	//  159  244:areturn         
			k = j << 8 | k;
	//  160  245:iload_2         
	//  161  246:bipush          8
	//  162  248:ishl            
	//  163  249:iload_3         
	//  164  250:ior             
	//  165  251:istore_3        
			j = _inputPtr;
	//  166  252:aload_0         
	//  167  253:getfield        #71  <Field int _inputPtr>
	//  168  256:istore_2        
			_inputPtr = j + 1;
	//  169  257:aload_0         
	//  170  258:iload_2         
	//  171  259:iconst_1        
	//  172  260:iadd            
	//  173  261:putfield        #71  <Field int _inputPtr>
			j = ai[j] & 0xff;
	//  174  264:aload           4
	//  175  266:iload_2         
	//  176  267:baload          
	//  177  268:sipush          255
	//  178  271:iand            
	//  179  272:istore_2        
			if(ai1[j] != 0)
	//* 180  273:aload           5
	//* 181  275:iload_2         
	//* 182  276:iaload          
	//* 183  277:ifeq            311
				if(j == 34)
	//* 184  280:iload_2         
	//* 185  281:bipush          34
	//* 186  283:icmpne          298
					return findName(_quadBuffer, i, k, 4);
	//  187  286:aload_0         
	//  188  287:aload_0         
	//  189  288:getfield        #60  <Field int[] _quadBuffer>
	//  190  291:iload_1         
	//  191  292:iload_3         
	//  192  293:iconst_4        
	//  193  294:invokespecial   #910 <Method String findName(int[], int, int, int)>
	//  194  297:areturn         
				else
					return parseEscapedName(_quadBuffer, i, k, j, 4);
	//  195  298:aload_0         
	//  196  299:aload_0         
	//  197  300:getfield        #60  <Field int[] _quadBuffer>
	//  198  303:iload_1         
	//  199  304:iload_3         
	//  200  305:iload_2         
	//  201  306:iconst_4        
	//  202  307:invokevirtual   #488 <Method String parseEscapedName(int[], int, int, int, int)>
	//  203  310:areturn         
			int ai2[] = _quadBuffer;
	//  204  311:aload_0         
	//  205  312:getfield        #60  <Field int[] _quadBuffer>
	//  206  315:astore          6
			if(i >= ai2.length)
	//* 207  317:iload_1         
	//* 208  318:aload           6
	//* 209  320:arraylength     
	//* 210  321:icmplt          334
				_quadBuffer = growArrayBy(ai2, i);
	//  211  324:aload_0         
	//  212  325:aload           6
	//  213  327:iload_1         
	//  214  328:invokestatic    #479 <Method int[] growArrayBy(int[], int)>
	//  215  331:putfield        #60  <Field int[] _quadBuffer>
			_quadBuffer[i] = k;
	//  216  334:aload_0         
	//  217  335:getfield        #60  <Field int[] _quadBuffer>
	//  218  338:iload_1         
	//  219  339:iload_3         
	//  220  340:iastore         
		}

	//  221  341:iload_1         
	//  222  342:iconst_1        
	//  223  343:iadd            
	//  224  344:istore_1        
	//* 225  345:goto            41
		return parseEscapedName(_quadBuffer, i, 0, j, 0);
	//  226  348:aload_0         
	//  227  349:aload_0         
	//  228  350:getfield        #60  <Field int[] _quadBuffer>
	//  229  353:iload_1         
	//  230  354:iconst_0        
	//  231  355:iload_2         
	//  232  356:iconst_0        
	//  233  357:invokevirtual   #488 <Method String parseEscapedName(int[], int, int, int, int)>
	//  234  360:areturn         
	}

	protected final String parseMediumName(int i)
		throws IOException
	{
		byte abyte0[] = _inputBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field byte[] _inputBuffer>
	//    2    4:astore_3        
		int ai[] = _icLatin1;
	//    3    5:getstatic       #40  <Field int[] _icLatin1>
	//    4    8:astore          4
		int j = _inputPtr;
	//    5   10:aload_0         
	//    6   11:getfield        #71  <Field int _inputPtr>
	//    7   14:istore_2        
		_inputPtr = j + 1;
	//    8   15:aload_0         
	//    9   16:iload_2         
	//   10   17:iconst_1        
	//   11   18:iadd            
	//   12   19:putfield        #71  <Field int _inputPtr>
		j = abyte0[j] & 0xff;
	//   13   22:aload_3         
	//   14   23:iload_2         
	//   15   24:baload          
	//   16   25:sipush          255
	//   17   28:iand            
	//   18   29:istore_2        
		if(ai[j] != 0)
	//*  19   30:aload           4
	//*  20   32:iload_2         
	//*  21   33:iaload          
	//*  22   34:ifeq            66
			if(j == 34)
	//*  23   37:iload_2         
	//*  24   38:bipush          34
	//*  25   40:icmpne          54
				return findName(_quad1, i, 1);
	//   26   43:aload_0         
	//   27   44:aload_0         
	//   28   45:getfield        #721 <Field int _quad1>
	//   29   48:iload_1         
	//   30   49:iconst_1        
	//   31   50:invokespecial   #911 <Method String findName(int, int, int)>
	//   32   53:areturn         
			else
				return parseName(_quad1, i, j, 1);
	//   33   54:aload_0         
	//   34   55:aload_0         
	//   35   56:getfield        #721 <Field int _quad1>
	//   36   59:iload_1         
	//   37   60:iload_2         
	//   38   61:iconst_1        
	//   39   62:invokespecial   #913 <Method String parseName(int, int, int, int)>
	//   40   65:areturn         
		i = i << 8 | j;
	//   41   66:iload_1         
	//   42   67:bipush          8
	//   43   69:ishl            
	//   44   70:iload_2         
	//   45   71:ior             
	//   46   72:istore_1        
		j = _inputPtr;
	//   47   73:aload_0         
	//   48   74:getfield        #71  <Field int _inputPtr>
	//   49   77:istore_2        
		_inputPtr = j + 1;
	//   50   78:aload_0         
	//   51   79:iload_2         
	//   52   80:iconst_1        
	//   53   81:iadd            
	//   54   82:putfield        #71  <Field int _inputPtr>
		j = abyte0[j] & 0xff;
	//   55   85:aload_3         
	//   56   86:iload_2         
	//   57   87:baload          
	//   58   88:sipush          255
	//   59   91:iand            
	//   60   92:istore_2        
		if(ai[j] != 0)
	//*  61   93:aload           4
	//*  62   95:iload_2         
	//*  63   96:iaload          
	//*  64   97:ifeq            129
			if(j == 34)
	//*  65  100:iload_2         
	//*  66  101:bipush          34
	//*  67  103:icmpne          117
				return findName(_quad1, i, 2);
	//   68  106:aload_0         
	//   69  107:aload_0         
	//   70  108:getfield        #721 <Field int _quad1>
	//   71  111:iload_1         
	//   72  112:iconst_2        
	//   73  113:invokespecial   #911 <Method String findName(int, int, int)>
	//   74  116:areturn         
			else
				return parseName(_quad1, i, j, 2);
	//   75  117:aload_0         
	//   76  118:aload_0         
	//   77  119:getfield        #721 <Field int _quad1>
	//   78  122:iload_1         
	//   79  123:iload_2         
	//   80  124:iconst_2        
	//   81  125:invokespecial   #913 <Method String parseName(int, int, int, int)>
	//   82  128:areturn         
		i = i << 8 | j;
	//   83  129:iload_1         
	//   84  130:bipush          8
	//   85  132:ishl            
	//   86  133:iload_2         
	//   87  134:ior             
	//   88  135:istore_1        
		j = _inputPtr;
	//   89  136:aload_0         
	//   90  137:getfield        #71  <Field int _inputPtr>
	//   91  140:istore_2        
		_inputPtr = j + 1;
	//   92  141:aload_0         
	//   93  142:iload_2         
	//   94  143:iconst_1        
	//   95  144:iadd            
	//   96  145:putfield        #71  <Field int _inputPtr>
		j = abyte0[j] & 0xff;
	//   97  148:aload_3         
	//   98  149:iload_2         
	//   99  150:baload          
	//  100  151:sipush          255
	//  101  154:iand            
	//  102  155:istore_2        
		if(ai[j] != 0)
	//* 103  156:aload           4
	//* 104  158:iload_2         
	//* 105  159:iaload          
	//* 106  160:ifeq            192
			if(j == 34)
	//* 107  163:iload_2         
	//* 108  164:bipush          34
	//* 109  166:icmpne          180
				return findName(_quad1, i, 3);
	//  110  169:aload_0         
	//  111  170:aload_0         
	//  112  171:getfield        #721 <Field int _quad1>
	//  113  174:iload_1         
	//  114  175:iconst_3        
	//  115  176:invokespecial   #911 <Method String findName(int, int, int)>
	//  116  179:areturn         
			else
				return parseName(_quad1, i, j, 3);
	//  117  180:aload_0         
	//  118  181:aload_0         
	//  119  182:getfield        #721 <Field int _quad1>
	//  120  185:iload_1         
	//  121  186:iload_2         
	//  122  187:iconst_3        
	//  123  188:invokespecial   #913 <Method String parseName(int, int, int, int)>
	//  124  191:areturn         
		i = i << 8 | j;
	//  125  192:iload_1         
	//  126  193:bipush          8
	//  127  195:ishl            
	//  128  196:iload_2         
	//  129  197:ior             
	//  130  198:istore_1        
		j = _inputPtr;
	//  131  199:aload_0         
	//  132  200:getfield        #71  <Field int _inputPtr>
	//  133  203:istore_2        
		_inputPtr = j + 1;
	//  134  204:aload_0         
	//  135  205:iload_2         
	//  136  206:iconst_1        
	//  137  207:iadd            
	//  138  208:putfield        #71  <Field int _inputPtr>
		j = abyte0[j] & 0xff;
	//  139  211:aload_3         
	//  140  212:iload_2         
	//  141  213:baload          
	//  142  214:sipush          255
	//  143  217:iand            
	//  144  218:istore_2        
		if(ai[j] != 0)
	//* 145  219:aload           4
	//* 146  221:iload_2         
	//* 147  222:iaload          
	//* 148  223:ifeq            255
		{
			if(j == 34)
	//* 149  226:iload_2         
	//* 150  227:bipush          34
	//* 151  229:icmpne          243
				return findName(_quad1, i, 4);
	//  152  232:aload_0         
	//  153  233:aload_0         
	//  154  234:getfield        #721 <Field int _quad1>
	//  155  237:iload_1         
	//  156  238:iconst_4        
	//  157  239:invokespecial   #911 <Method String findName(int, int, int)>
	//  158  242:areturn         
			else
				return parseName(_quad1, i, j, 4);
	//  159  243:aload_0         
	//  160  244:aload_0         
	//  161  245:getfield        #721 <Field int _quad1>
	//  162  248:iload_1         
	//  163  249:iload_2         
	//  164  250:iconst_4        
	//  165  251:invokespecial   #913 <Method String parseName(int, int, int, int)>
	//  166  254:areturn         
		} else
		{
			return parseMediumName2(j, i);
	//  167  255:aload_0         
	//  168  256:iload_2         
	//  169  257:iload_1         
	//  170  258:invokevirtual   #916 <Method String parseMediumName2(int, int)>
	//  171  261:areturn         
		}
	}

	protected final String parseMediumName2(int i, int j)
		throws IOException
	{
		byte abyte0[] = _inputBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field byte[] _inputBuffer>
	//    2    4:astore          4
		int ai[] = _icLatin1;
	//    3    6:getstatic       #40  <Field int[] _icLatin1>
	//    4    9:astore          5
		int k = _inputPtr;
	//    5   11:aload_0         
	//    6   12:getfield        #71  <Field int _inputPtr>
	//    7   15:istore_3        
		_inputPtr = k + 1;
	//    8   16:aload_0         
	//    9   17:iload_3         
	//   10   18:iconst_1        
	//   11   19:iadd            
	//   12   20:putfield        #71  <Field int _inputPtr>
		k = abyte0[k] & 0xff;
	//   13   23:aload           4
	//   14   25:iload_3         
	//   15   26:baload          
	//   16   27:sipush          255
	//   17   30:iand            
	//   18   31:istore_3        
		if(ai[k] != 0)
	//*  19   32:aload           5
	//*  20   34:iload_3         
	//*  21   35:iaload          
	//*  22   36:ifeq            70
			if(k == 34)
	//*  23   39:iload_3         
	//*  24   40:bipush          34
	//*  25   42:icmpne          57
				return findName(_quad1, j, i, 1);
	//   26   45:aload_0         
	//   27   46:aload_0         
	//   28   47:getfield        #721 <Field int _quad1>
	//   29   50:iload_2         
	//   30   51:iload_1         
	//   31   52:iconst_1        
	//   32   53:invokespecial   #918 <Method String findName(int, int, int, int)>
	//   33   56:areturn         
			else
				return parseName(_quad1, j, i, k, 1);
	//   34   57:aload_0         
	//   35   58:aload_0         
	//   36   59:getfield        #721 <Field int _quad1>
	//   37   62:iload_2         
	//   38   63:iload_1         
	//   39   64:iload_3         
	//   40   65:iconst_1        
	//   41   66:invokespecial   #920 <Method String parseName(int, int, int, int, int)>
	//   42   69:areturn         
		i = i << 8 | k;
	//   43   70:iload_1         
	//   44   71:bipush          8
	//   45   73:ishl            
	//   46   74:iload_3         
	//   47   75:ior             
	//   48   76:istore_1        
		k = _inputPtr;
	//   49   77:aload_0         
	//   50   78:getfield        #71  <Field int _inputPtr>
	//   51   81:istore_3        
		_inputPtr = k + 1;
	//   52   82:aload_0         
	//   53   83:iload_3         
	//   54   84:iconst_1        
	//   55   85:iadd            
	//   56   86:putfield        #71  <Field int _inputPtr>
		k = abyte0[k] & 0xff;
	//   57   89:aload           4
	//   58   91:iload_3         
	//   59   92:baload          
	//   60   93:sipush          255
	//   61   96:iand            
	//   62   97:istore_3        
		if(ai[k] != 0)
	//*  63   98:aload           5
	//*  64  100:iload_3         
	//*  65  101:iaload          
	//*  66  102:ifeq            136
			if(k == 34)
	//*  67  105:iload_3         
	//*  68  106:bipush          34
	//*  69  108:icmpne          123
				return findName(_quad1, j, i, 2);
	//   70  111:aload_0         
	//   71  112:aload_0         
	//   72  113:getfield        #721 <Field int _quad1>
	//   73  116:iload_2         
	//   74  117:iload_1         
	//   75  118:iconst_2        
	//   76  119:invokespecial   #918 <Method String findName(int, int, int, int)>
	//   77  122:areturn         
			else
				return parseName(_quad1, j, i, k, 2);
	//   78  123:aload_0         
	//   79  124:aload_0         
	//   80  125:getfield        #721 <Field int _quad1>
	//   81  128:iload_2         
	//   82  129:iload_1         
	//   83  130:iload_3         
	//   84  131:iconst_2        
	//   85  132:invokespecial   #920 <Method String parseName(int, int, int, int, int)>
	//   86  135:areturn         
		i = i << 8 | k;
	//   87  136:iload_1         
	//   88  137:bipush          8
	//   89  139:ishl            
	//   90  140:iload_3         
	//   91  141:ior             
	//   92  142:istore_1        
		k = _inputPtr;
	//   93  143:aload_0         
	//   94  144:getfield        #71  <Field int _inputPtr>
	//   95  147:istore_3        
		_inputPtr = k + 1;
	//   96  148:aload_0         
	//   97  149:iload_3         
	//   98  150:iconst_1        
	//   99  151:iadd            
	//  100  152:putfield        #71  <Field int _inputPtr>
		k = abyte0[k] & 0xff;
	//  101  155:aload           4
	//  102  157:iload_3         
	//  103  158:baload          
	//  104  159:sipush          255
	//  105  162:iand            
	//  106  163:istore_3        
		if(ai[k] != 0)
	//* 107  164:aload           5
	//* 108  166:iload_3         
	//* 109  167:iaload          
	//* 110  168:ifeq            202
			if(k == 34)
	//* 111  171:iload_3         
	//* 112  172:bipush          34
	//* 113  174:icmpne          189
				return findName(_quad1, j, i, 3);
	//  114  177:aload_0         
	//  115  178:aload_0         
	//  116  179:getfield        #721 <Field int _quad1>
	//  117  182:iload_2         
	//  118  183:iload_1         
	//  119  184:iconst_3        
	//  120  185:invokespecial   #918 <Method String findName(int, int, int, int)>
	//  121  188:areturn         
			else
				return parseName(_quad1, j, i, k, 3);
	//  122  189:aload_0         
	//  123  190:aload_0         
	//  124  191:getfield        #721 <Field int _quad1>
	//  125  194:iload_2         
	//  126  195:iload_1         
	//  127  196:iload_3         
	//  128  197:iconst_3        
	//  129  198:invokespecial   #920 <Method String parseName(int, int, int, int, int)>
	//  130  201:areturn         
		i = i << 8 | k;
	//  131  202:iload_1         
	//  132  203:bipush          8
	//  133  205:ishl            
	//  134  206:iload_3         
	//  135  207:ior             
	//  136  208:istore_1        
		k = _inputPtr;
	//  137  209:aload_0         
	//  138  210:getfield        #71  <Field int _inputPtr>
	//  139  213:istore_3        
		_inputPtr = k + 1;
	//  140  214:aload_0         
	//  141  215:iload_3         
	//  142  216:iconst_1        
	//  143  217:iadd            
	//  144  218:putfield        #71  <Field int _inputPtr>
		k = abyte0[k] & 0xff;
	//  145  221:aload           4
	//  146  223:iload_3         
	//  147  224:baload          
	//  148  225:sipush          255
	//  149  228:iand            
	//  150  229:istore_3        
		if(ai[k] != 0)
	//* 151  230:aload           5
	//* 152  232:iload_3         
	//* 153  233:iaload          
	//* 154  234:ifeq            268
		{
			if(k == 34)
	//* 155  237:iload_3         
	//* 156  238:bipush          34
	//* 157  240:icmpne          255
				return findName(_quad1, j, i, 4);
	//  158  243:aload_0         
	//  159  244:aload_0         
	//  160  245:getfield        #721 <Field int _quad1>
	//  161  248:iload_2         
	//  162  249:iload_1         
	//  163  250:iconst_4        
	//  164  251:invokespecial   #918 <Method String findName(int, int, int, int)>
	//  165  254:areturn         
			else
				return parseName(_quad1, j, i, k, 4);
	//  166  255:aload_0         
	//  167  256:aload_0         
	//  168  257:getfield        #721 <Field int _quad1>
	//  169  260:iload_2         
	//  170  261:iload_1         
	//  171  262:iload_3         
	//  172  263:iconst_4        
	//  173  264:invokespecial   #920 <Method String parseName(int, int, int, int, int)>
	//  174  267:areturn         
		} else
		{
			return parseLongName(k, j, i);
	//  175  268:aload_0         
	//  176  269:iload_3         
	//  177  270:iload_2         
	//  178  271:iload_1         
	//  179  272:invokevirtual   #922 <Method String parseLongName(int, int, int)>
	//  180  275:areturn         
		}
	}

	public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
		throws IOException
	{
		byte abyte0[];
		if(!_tokenIncomplete || _currToken != JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #255 <Field boolean _tokenIncomplete>
	//*   2    4:ifeq            61
	//*   3    7:aload_0         
	//*   4    8:getfield        #149 <Field JsonToken _currToken>
	//*   5   11:getstatic       #258 <Field JsonToken JsonToken.VALUE_STRING>
	//*   6   14:if_acmpeq       20
			break MISSING_BLOCK_LABEL_61;
	//    7   17:goto            61
		abyte0 = _ioContext.allocBase64Buffer();
	//    8   20:aload_0         
	//    9   21:getfield        #494 <Field IOContext _ioContext>
	//   10   24:invokevirtual   #927 <Method byte[] IOContext.allocBase64Buffer()>
	//   11   27:astore          4
		int i = _readBinary(base64variant, outputstream, abyte0);
	//   12   29:aload_0         
	//   13   30:aload_1         
	//   14   31:aload_2         
	//   15   32:aload           4
	//   16   34:invokevirtual   #929 <Method int _readBinary(Base64Variant, OutputStream, byte[])>
	//   17   37:istore_3        
		_ioContext.releaseBase64Buffer(abyte0);
	//   18   38:aload_0         
	//   19   39:getfield        #494 <Field IOContext _ioContext>
	//   20   42:aload           4
	//   21   44:invokevirtual   #932 <Method void IOContext.releaseBase64Buffer(byte[])>
		return i;
	//   22   47:iload_3         
	//   23   48:ireturn         
		base64variant;
	//   24   49:astore_1        
		_ioContext.releaseBase64Buffer(abyte0);
	//   25   50:aload_0         
	//   26   51:getfield        #494 <Field IOContext _ioContext>
	//   27   54:aload           4
	//   28   56:invokevirtual   #932 <Method void IOContext.releaseBase64Buffer(byte[])>
		throw base64variant;
	//   29   59:aload_1         
	//   30   60:athrow          
		base64variant = ((Base64Variant) (getBinaryValue(base64variant)));
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:invokevirtual   #934 <Method byte[] getBinaryValue(Base64Variant)>
	//   34   66:astore_1        
		outputstream.write(((byte []) (base64variant)));
	//   35   67:aload_2         
	//   36   68:aload_1         
	//   37   69:invokevirtual   #936 <Method void OutputStream.write(byte[])>
		return base64variant.length;
	//   38   72:aload_1         
	//   39   73:arraylength     
	//   40   74:ireturn         
	}

	protected String slowParseName()
		throws IOException
	{
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #74  <Field int _inputEnd>
	//*   4    8:icmplt          28
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #219 <Method boolean _loadMore()>
	//*   7   15:ifne            28
			_reportInvalidEOF(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
	//    8   18:aload_0         
	//    9   19:ldc2            #938 <String ": was expecting closing '\"' for name">
	//   10   22:getstatic       #447 <Field JsonToken JsonToken.FIELD_NAME>
	//   11   25:invokevirtual   #332 <Method void _reportInvalidEOF(String, JsonToken)>
		byte abyte0[] = _inputBuffer;
	//   12   28:aload_0         
	//   13   29:getfield        #68  <Field byte[] _inputBuffer>
	//   14   32:astore_2        
		int i = _inputPtr;
	//   15   33:aload_0         
	//   16   34:getfield        #71  <Field int _inputPtr>
	//   17   37:istore_1        
		_inputPtr = i + 1;
	//   18   38:aload_0         
	//   19   39:iload_1         
	//   20   40:iconst_1        
	//   21   41:iadd            
	//   22   42:putfield        #71  <Field int _inputPtr>
		i = abyte0[i] & 0xff;
	//   23   45:aload_2         
	//   24   46:iload_1         
	//   25   47:baload          
	//   26   48:sipush          255
	//   27   51:iand            
	//   28   52:istore_1        
		if(i == 34)
	//*  29   53:iload_1         
	//*  30   54:bipush          34
	//*  31   56:icmpne          63
			return "";
	//   32   59:ldc2            #677 <String "">
	//   33   62:areturn         
		else
			return parseEscapedName(_quadBuffer, 0, 0, i, 0);
	//   34   63:aload_0         
	//   35   64:aload_0         
	//   36   65:getfield        #60  <Field int[] _quadBuffer>
	//   37   68:iconst_0        
	//   38   69:iconst_0        
	//   39   70:iload_1         
	//   40   71:iconst_0        
	//   41   72:invokevirtual   #488 <Method String parseEscapedName(int[], int, int, int, int)>
	//   42   75:areturn         
	}

	protected static final int FEAT_MASK_TRAILING_COMMA;
	protected static final int _icLatin1[] = CharTypes.getInputCodeLatin1();
	private static final int _icUTF8[] = CharTypes.getInputCodeUtf8();
	protected boolean _bufferRecyclable;
	protected byte _inputBuffer[];
	protected InputStream _inputStream;
	protected int _nameStartCol;
	protected int _nameStartOffset;
	protected int _nameStartRow;
	protected ObjectCodec _objectCodec;
	private int _quad1;
	protected int _quadBuffer[];
	protected final ByteQuadsCanonicalizer _symbols;
	protected boolean _tokenIncomplete;

	static 
	{
	//    0    0:invokestatic    #33  <Method int[] CharTypes.getInputCodeUtf8()>
	//    1    3:putstatic       #35  <Field int[] _icUTF8>
	//    2    6:invokestatic    #38  <Method int[] CharTypes.getInputCodeLatin1()>
	//    3    9:putstatic       #40  <Field int[] _icLatin1>
		FEAT_MASK_TRAILING_COMMA = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
	//    4   12:getstatic       #46  <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_TRAILING_COMMA>
	//    5   15:invokevirtual   #50  <Method int com.fasterxml.jackson.core.JsonParser$Feature.getMask()>
	//    6   18:putstatic       #52  <Field int FEAT_MASK_TRAILING_COMMA>
	//*   7   21:return          
	}
}
