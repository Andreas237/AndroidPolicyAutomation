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
import java.util.Arrays;

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
	//    3    3:invokespecial   #48  <Method void ParserBase(IOContext, int)>
		_quadBuffer = new int[16];
	//    4    6:aload_0         
	//    5    7:bipush          16
	//    6    9:newarray        int[]
	//    7   11:putfield        #50  <Field int[] _quadBuffer>
		_inputStream = inputstream;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #52  <Field InputStream _inputStream>
		_objectCodec = objectcodec;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #54  <Field ObjectCodec _objectCodec>
		_symbols = bytequadscanonicalizer;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #56  <Field ByteQuadsCanonicalizer _symbols>
		_inputBuffer = abyte0;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #58  <Field byte[] _inputBuffer>
		_inputPtr = j;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #61  <Field int _inputPtr>
		_inputEnd = k;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #64  <Field int _inputEnd>
		_currInputRowStart = j;
	//   26   49:aload_0         
	//   27   50:iload           7
	//   28   52:putfield        #67  <Field int _currInputRowStart>
		_currInputProcessed = -j;
	//   29   55:aload_0         
	//   30   56:iload           7
	//   31   58:ineg            
	//   32   59:i2l             
	//   33   60:putfield        #71  <Field long _currInputProcessed>
		_bufferRecyclable = flag;
	//   34   63:aload_0         
	//   35   64:iload           9
	//   36   66:putfield        #73  <Field boolean _bufferRecyclable>
	//   37   69:return          
	}

	private final void _checkMatchEnd(String s, int i, int j)
		throws IOException
	{
		if(Character.isJavaIdentifierPart((char)_decodeCharForError(j)))
	//*   0    0:aload_0         
	//*   1    1:iload_3         
	//*   2    2:invokevirtual   #81  <Method int _decodeCharForError(int)>
	//*   3    5:int2char        
	//*   4    6:invokestatic    #87  <Method boolean Character.isJavaIdentifierPart(char)>
	//*   5    9:ifeq            22
			_reportInvalidToken(s.substring(0, i));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:iconst_0        
	//    9   15:iload_2         
	//   10   16:invokevirtual   #93  <Method String String.substring(int, int)>
	//   11   19:invokevirtual   #97  <Method void _reportInvalidToken(String)>
	//   12   22:return          
	}

	private final int _decodeUtf8_2(int i)
		throws IOException
	{
		if(_inputPtr >= _inputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          15
			_loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
		byte abyte0[] = _inputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #58  <Field byte[] _inputBuffer>
	//    9   19:astore_3        
		int j = _inputPtr;
	//   10   20:aload_0         
	//   11   21:getfield        #61  <Field int _inputPtr>
	//   12   24:istore_2        
		_inputPtr = j + 1;
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #61  <Field int _inputPtr>
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
	//   32   54:getfield        #61  <Field int _inputPtr>
	//   33   57:invokevirtual   #106 <Method void _reportInvalidOther(int, int)>
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
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          15
			_loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
		byte abyte0[] = _inputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #58  <Field byte[] _inputBuffer>
	//    9   19:astore          4
		int j = _inputPtr;
	//   10   21:aload_0         
	//   11   22:getfield        #61  <Field int _inputPtr>
	//   12   25:istore_2        
		_inputPtr = j + 1;
	//   13   26:aload_0         
	//   14   27:iload_2         
	//   15   28:iconst_1        
	//   16   29:iadd            
	//   17   30:putfield        #61  <Field int _inputPtr>
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
	//   32   56:getfield        #61  <Field int _inputPtr>
	//   33   59:invokevirtual   #106 <Method void _reportInvalidOther(int, int)>
		if(_inputPtr >= _inputEnd)
	//*  34   62:aload_0         
	//*  35   63:getfield        #61  <Field int _inputPtr>
	//*  36   66:aload_0         
	//*  37   67:getfield        #64  <Field int _inputEnd>
	//*  38   70:icmplt          77
			_loadMoreGuaranteed();
	//   39   73:aload_0         
	//   40   74:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
		abyte0 = _inputBuffer;
	//   41   77:aload_0         
	//   42   78:getfield        #58  <Field byte[] _inputBuffer>
	//   43   81:astore          4
		int k = _inputPtr;
	//   44   83:aload_0         
	//   45   84:getfield        #61  <Field int _inputPtr>
	//   46   87:istore_3        
		_inputPtr = k + 1;
	//   47   88:aload_0         
	//   48   89:iload_3         
	//   49   90:iconst_1        
	//   50   91:iadd            
	//   51   92:putfield        #61  <Field int _inputPtr>
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
	//   66  118:getfield        #61  <Field int _inputPtr>
	//   67  121:invokevirtual   #106 <Method void _reportInvalidOther(int, int)>
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
	//    1    1:getfield        #58  <Field byte[] _inputBuffer>
	//    2    4:astore          4
		int j = _inputPtr;
	//    3    6:aload_0         
	//    4    7:getfield        #61  <Field int _inputPtr>
	//    5   10:istore_2        
		_inputPtr = j + 1;
	//    6   11:aload_0         
	//    7   12:iload_2         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:putfield        #61  <Field int _inputPtr>
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
	//   25   41:getfield        #61  <Field int _inputPtr>
	//   26   44:invokevirtual   #106 <Method void _reportInvalidOther(int, int)>
		abyte0 = _inputBuffer;
	//   27   47:aload_0         
	//   28   48:getfield        #58  <Field byte[] _inputBuffer>
	//   29   51:astore          4
		int k = _inputPtr;
	//   30   53:aload_0         
	//   31   54:getfield        #61  <Field int _inputPtr>
	//   32   57:istore_3        
		_inputPtr = k + 1;
	//   33   58:aload_0         
	//   34   59:iload_3         
	//   35   60:iconst_1        
	//   36   61:iadd            
	//   37   62:putfield        #61  <Field int _inputPtr>
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
	//   52   88:getfield        #61  <Field int _inputPtr>
	//   53   91:invokevirtual   #106 <Method void _reportInvalidOther(int, int)>
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
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          15
			_loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
		byte abyte0[] = _inputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #58  <Field byte[] _inputBuffer>
	//    9   19:astore          5
		int j = _inputPtr;
	//   10   21:aload_0         
	//   11   22:getfield        #61  <Field int _inputPtr>
	//   12   25:istore_2        
		_inputPtr = j + 1;
	//   13   26:aload_0         
	//   14   27:iload_2         
	//   15   28:iconst_1        
	//   16   29:iadd            
	//   17   30:putfield        #61  <Field int _inputPtr>
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
	//   32   56:getfield        #61  <Field int _inputPtr>
	//   33   59:invokevirtual   #106 <Method void _reportInvalidOther(int, int)>
		if(_inputPtr >= _inputEnd)
	//*  34   62:aload_0         
	//*  35   63:getfield        #61  <Field int _inputPtr>
	//*  36   66:aload_0         
	//*  37   67:getfield        #64  <Field int _inputEnd>
	//*  38   70:icmplt          77
			_loadMoreGuaranteed();
	//   39   73:aload_0         
	//   40   74:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
		abyte0 = _inputBuffer;
	//   41   77:aload_0         
	//   42   78:getfield        #58  <Field byte[] _inputBuffer>
	//   43   81:astore          5
		int k = _inputPtr;
	//   44   83:aload_0         
	//   45   84:getfield        #61  <Field int _inputPtr>
	//   46   87:istore_3        
		_inputPtr = k + 1;
	//   47   88:aload_0         
	//   48   89:iload_3         
	//   49   90:iconst_1        
	//   50   91:iadd            
	//   51   92:putfield        #61  <Field int _inputPtr>
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
	//   66  118:getfield        #61  <Field int _inputPtr>
	//   67  121:invokevirtual   #106 <Method void _reportInvalidOther(int, int)>
		if(_inputPtr >= _inputEnd)
	//*  68  124:aload_0         
	//*  69  125:getfield        #61  <Field int _inputPtr>
	//*  70  128:aload_0         
	//*  71  129:getfield        #64  <Field int _inputEnd>
	//*  72  132:icmplt          139
			_loadMoreGuaranteed();
	//   73  135:aload_0         
	//   74  136:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
		abyte0 = _inputBuffer;
	//   75  139:aload_0         
	//   76  140:getfield        #58  <Field byte[] _inputBuffer>
	//   77  143:astore          5
		int l = _inputPtr;
	//   78  145:aload_0         
	//   79  146:getfield        #61  <Field int _inputPtr>
	//   80  149:istore          4
		_inputPtr = l + 1;
	//   81  151:aload_0         
	//   82  152:iload           4
	//   83  154:iconst_1        
	//   84  155:iadd            
	//   85  156:putfield        #61  <Field int _inputPtr>
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
	//  100  186:getfield        #61  <Field int _inputPtr>
	//  101  189:invokevirtual   #106 <Method void _reportInvalidOther(int, int)>
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
	//  123  221:ldc1            #110 <Int 0x10000>
	//  124  223:isub            
	//  125  224:ireturn         
	}

	private final void _finishString2(char ac[], int i)
		throws IOException
	{
		int ai[] = _icUTF8;
	//    0    0:getstatic       #37  <Field int[] _icUTF8>
	//    1    3:astore          7
		byte abyte0[] = _inputBuffer;
	//    2    5:aload_0         
	//    3    6:getfield        #58  <Field byte[] _inputBuffer>
	//    4    9:astore          8
		char ac1[] = ac;
	//    5   11:aload_1         
	//    6   12:astore          6
label0:
		do
		{
			int j = _inputPtr;
	//    7   14:aload_0         
	//    8   15:getfield        #61  <Field int _inputPtr>
	//    9   18:istore_3        
			int k = j;
	//   10   19:iload_3         
	//   11   20:istore          4
			if(j >= _inputEnd)
	//*  12   22:iload_3         
	//*  13   23:aload_0         
	//*  14   24:getfield        #64  <Field int _inputEnd>
	//*  15   27:icmplt          40
			{
				_loadMoreGuaranteed();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
				k = _inputPtr;
	//   18   34:aload_0         
	//   19   35:getfield        #61  <Field int _inputPtr>
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
	//   30   53:getfield        #116 <Field TextBuffer _textBuffer>
	//   31   56:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
	//   32   59:astore_1        
				j = 0;
	//   33   60:iconst_0        
	//   34   61:istore_3        
			}
			int l = Math.min(_inputEnd, (ac.length - j) + k);
	//   35   62:aload_0         
	//   36   63:getfield        #64  <Field int _inputEnd>
	//   37   66:aload_1         
	//   38   67:arraylength     
	//   39   68:iload_3         
	//   40   69:isub            
	//   41   70:iload           4
	//   42   72:iadd            
	//   43   73:invokestatic    #128 <Method int Math.min(int, int)>
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
	//   64  111:putfield        #61  <Field int _inputPtr>
					if(k == 34)
	//*  65  114:iload           4
	//*  66  116:bipush          34
	//*  67  118:icmpne          130
					{
						_textBuffer.setCurrentLength(j);
	//   68  121:aload_0         
	//   69  122:getfield        #116 <Field TextBuffer _textBuffer>
	//   70  125:iload_3         
	//   71  126:invokevirtual   #132 <Method void TextBuffer.setCurrentLength(int)>
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
	//   82  174:ldc1            #134 <String "string value">
	//   83  176:invokevirtual   #138 <Method void _throwUnquotedSpace(int, String)>
							i = k;
	//   84  179:iload           4
	//   85  181:istore_2        
						} else
	//*  86  182:goto            316
	//*  87  185:aload_0         
	//*  88  186:iload           4
	//*  89  188:invokespecial   #140 <Method int _decodeUtf8_4(int)>
	//*  90  191:istore          5
	//*  91  193:iload_3         
	//*  92  194:iconst_1        
	//*  93  195:iadd            
	//*  94  196:istore          4
	//*  95  198:aload_1         
	//*  96  199:iload_3         
	//*  97  200:ldc1            #141 <Int 55296>
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
	//* 113  224:getfield        #116 <Field TextBuffer _textBuffer>
	//* 114  227:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
	//* 115  230:astore          6
	//* 116  232:iconst_0        
	//* 117  233:istore_2        
	//* 118  234:iload           5
	//* 119  236:sipush          1023
	//* 120  239:iand            
	//* 121  240:ldc1            #142 <Int 56320>
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
	//* 132  257:getfield        #64  <Field int _inputEnd>
	//* 133  260:aload_0         
	//* 134  261:getfield        #61  <Field int _inputPtr>
	//* 135  264:isub            
	//* 136  265:iconst_2        
	//* 137  266:icmplt          279
	//* 138  269:aload_0         
	//* 139  270:iload           4
	//* 140  272:invokespecial   #144 <Method int _decodeUtf8_3fast(int)>
	//* 141  275:istore_2        
	//* 142  276:goto            316
	//* 143  279:aload_0         
	//* 144  280:iload           4
	//* 145  282:invokespecial   #146 <Method int _decodeUtf8_3(int)>
	//* 146  285:istore_2        
	//* 147  286:goto            316
	//* 148  289:aload_0         
	//* 149  290:iload           4
	//* 150  292:invokespecial   #148 <Method int _decodeUtf8_2(int)>
	//* 151  295:istore_2        
	//* 152  296:goto            316
	//* 153  299:aload_0         
	//* 154  300:invokevirtual   #152 <Method char _decodeEscaped()>
	//* 155  303:istore_2        
	//* 156  304:goto            316
						{
							_reportInvalidChar(k);
	//  157  307:aload_0         
	//  158  308:iload           4
	//  159  310:invokevirtual   #155 <Method void _reportInvalidChar(int)>
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
	//  171  329:getfield        #116 <Field TextBuffer _textBuffer>
	//  172  332:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
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
	//  200  374:putfield        #61  <Field int _inputPtr>
			ac1 = ac;
	//  201  377:aload_1         
	//  202  378:astore          6
			i = j;
	//  203  380:iload_3         
	//  204  381:istore_2        
		} while(true);
	//  205  382:goto            14
	}

	private final boolean _isNextTokenNameMaybe(int i, SerializableString serializablestring)
		throws IOException
	{
		String s = _parseName(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #161 <Method String _parseName(int)>
	//    3    5:astore          4
		_parsingContext.setCurrentName(s);
	//    4    7:aload_0         
	//    5    8:getfield        #165 <Field JsonReadContext _parsingContext>
	//    6   11:aload           4
	//    7   13:invokevirtual   #170 <Method void JsonReadContext.setCurrentName(String)>
		boolean flag = s.equals(((Object) (serializablestring.getValue())));
	//    8   16:aload           4
	//    9   18:aload_2         
	//   10   19:invokeinterface #176 <Method String SerializableString.getValue()>
	//   11   24:invokevirtual   #180 <Method boolean String.equals(Object)>
	//   12   27:istore_3        
		_currToken = JsonToken.FIELD_NAME;
	//   13   28:aload_0         
	//   14   29:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//   15   32:putfield        #189 <Field JsonToken _currToken>
		i = _skipColon();
	//   16   35:aload_0         
	//   17   36:invokespecial   #193 <Method int _skipColon()>
	//   18   39:istore_1        
		_updateLocation();
	//   19   40:aload_0         
	//   20   41:invokespecial   #196 <Method void _updateLocation()>
		if(i == 34)
	//*  21   44:iload_1         
	//*  22   45:bipush          34
	//*  23   47:icmpne          64
		{
			_tokenIncomplete = true;
	//   24   50:aload_0         
	//   25   51:iconst_1        
	//   26   52:putfield        #198 <Field boolean _tokenIncomplete>
			_nextToken = JsonToken.VALUE_STRING;
	//   27   55:aload_0         
	//   28   56:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//   29   59:putfield        #204 <Field JsonToken _nextToken>
			return flag;
	//   30   62:iload_3         
	//   31   63:ireturn         
		}
		if(i != 45)
	//*  32   64:iload_1         
	//*  33   65:bipush          45
	//*  34   67:icmpeq          230
		{
			if(i != 91)
	//*  35   70:iload_1         
	//*  36   71:bipush          91
	//*  37   73:icmpeq          223
			{
				if(i != 102)
	//*  38   76:iload_1         
	//*  39   77:bipush          102
	//*  40   79:icmpeq          209
				{
					if(i != 110)
	//*  41   82:iload_1         
	//*  42   83:bipush          110
	//*  43   85:icmpeq          195
					{
						if(i != 116)
	//*  44   88:iload_1         
	//*  45   89:bipush          116
	//*  46   91:icmpeq          181
						{
							if(i != 123)
	//*  47   94:iload_1         
	//*  48   95:bipush          123
	//*  49   97:icmpeq          174
								switch(i)
	//*  50  100:iload_1         
								{
	//*  51  101:tableswitch     48 57: default 156
	//	               48 165
	//	               49 165
	//	               50 165
	//	               51 165
	//	               52 165
	//	               53 165
	//	               54 165
	//	               55 165
	//	               56 165
	//	               57 165
								default:
									serializablestring = ((SerializableString) (_handleUnexpectedValue(i)));
	//   52  156:aload_0         
	//   53  157:iload_1         
	//   54  158:invokevirtual   #208 <Method JsonToken _handleUnexpectedValue(int)>
	//   55  161:astore_2        
									break;

	//*  56  162:goto            235
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
									serializablestring = ((SerializableString) (_parsePosNumber(i)));
	//   57  165:aload_0         
	//   58  166:iload_1         
	//   59  167:invokevirtual   #211 <Method JsonToken _parsePosNumber(int)>
	//   60  170:astore_2        
									break;
								}
							else
	//*  61  171:goto            235
								serializablestring = ((SerializableString) (JsonToken.START_OBJECT));
	//   62  174:getstatic       #214 <Field JsonToken JsonToken.START_OBJECT>
	//   63  177:astore_2        
						} else
	//*  64  178:goto            235
						{
							_matchToken("true", 1);
	//   65  181:aload_0         
	//   66  182:ldc1            #216 <String "true">
	//   67  184:iconst_1        
	//   68  185:invokevirtual   #220 <Method void _matchToken(String, int)>
							serializablestring = ((SerializableString) (JsonToken.VALUE_TRUE));
	//   69  188:getstatic       #223 <Field JsonToken JsonToken.VALUE_TRUE>
	//   70  191:astore_2        
						}
					} else
	//*  71  192:goto            235
					{
						_matchToken("null", 1);
	//   72  195:aload_0         
	//   73  196:ldc1            #225 <String "null">
	//   74  198:iconst_1        
	//   75  199:invokevirtual   #220 <Method void _matchToken(String, int)>
						serializablestring = ((SerializableString) (JsonToken.VALUE_NULL));
	//   76  202:getstatic       #228 <Field JsonToken JsonToken.VALUE_NULL>
	//   77  205:astore_2        
					}
				} else
	//*  78  206:goto            235
				{
					_matchToken("false", 1);
	//   79  209:aload_0         
	//   80  210:ldc1            #230 <String "false">
	//   81  212:iconst_1        
	//   82  213:invokevirtual   #220 <Method void _matchToken(String, int)>
					serializablestring = ((SerializableString) (JsonToken.VALUE_FALSE));
	//   83  216:getstatic       #233 <Field JsonToken JsonToken.VALUE_FALSE>
	//   84  219:astore_2        
				}
			} else
	//*  85  220:goto            235
			{
				serializablestring = ((SerializableString) (JsonToken.START_ARRAY));
	//   86  223:getstatic       #236 <Field JsonToken JsonToken.START_ARRAY>
	//   87  226:astore_2        
			}
		} else
	//*  88  227:goto            235
		{
			serializablestring = ((SerializableString) (_parseNegNumber()));
	//   89  230:aload_0         
	//   90  231:invokevirtual   #240 <Method JsonToken _parseNegNumber()>
	//   91  234:astore_2        
		}
		_nextToken = ((JsonToken) (serializablestring));
	//   92  235:aload_0         
	//   93  236:aload_2         
	//   94  237:putfield        #204 <Field JsonToken _nextToken>
		return flag;
	//   95  240:iload_3         
	//   96  241:ireturn         
	}

	private final void _isNextTokenNameYes(int i)
		throws IOException
	{
		_currToken = JsonToken.FIELD_NAME;
	//    0    0:aload_0         
	//    1    1:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//    2    4:putfield        #189 <Field JsonToken _currToken>
		_updateLocation();
	//    3    7:aload_0         
	//    4    8:invokespecial   #196 <Method void _updateLocation()>
		if(i != 34)
	//*   5   11:iload_1         
	//*   6   12:bipush          34
	//*   7   14:icmpeq          198
		{
			if(i != 45)
	//*   8   17:iload_1         
	//*   9   18:bipush          45
	//*  10   20:icmpeq          189
			{
				if(i != 91)
	//*  11   23:iload_1         
	//*  12   24:bipush          91
	//*  13   26:icmpeq          181
				{
					if(i != 102)
	//*  14   29:iload_1         
	//*  15   30:bipush          102
	//*  16   32:icmpeq          166
					{
						if(i != 110)
	//*  17   35:iload_1         
	//*  18   36:bipush          110
	//*  19   38:icmpeq          151
						{
							if(i != 116)
	//*  20   41:iload_1         
	//*  21   42:bipush          116
	//*  22   44:icmpeq          136
							{
								if(i != 123)
	//*  23   47:iload_1         
	//*  24   48:bipush          123
	//*  25   50:icmpeq          128
								{
									switch(i)
	//*  26   53:iload_1         
									{
	//*  27   54:tableswitch     48 57: default 108
	//	               48 118
	//	               49 118
	//	               50 118
	//	               51 118
	//	               52 118
	//	               53 118
	//	               54 118
	//	               55 118
	//	               56 118
	//	               57 118
									default:
										_nextToken = _handleUnexpectedValue(i);
	//   28  108:aload_0         
	//   29  109:aload_0         
	//   30  110:iload_1         
	//   31  111:invokevirtual   #208 <Method JsonToken _handleUnexpectedValue(int)>
	//   32  114:putfield        #204 <Field JsonToken _nextToken>
										return;
	//   33  117:return          

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
										_nextToken = _parsePosNumber(i);
	//   34  118:aload_0         
	//   35  119:aload_0         
	//   36  120:iload_1         
	//   37  121:invokevirtual   #211 <Method JsonToken _parsePosNumber(int)>
	//   38  124:putfield        #204 <Field JsonToken _nextToken>
										break;
									}
									return;
	//   39  127:return          
								} else
								{
									_nextToken = JsonToken.START_OBJECT;
	//   40  128:aload_0         
	//   41  129:getstatic       #214 <Field JsonToken JsonToken.START_OBJECT>
	//   42  132:putfield        #204 <Field JsonToken _nextToken>
									return;
	//   43  135:return          
								}
							} else
							{
								_matchToken("true", 1);
	//   44  136:aload_0         
	//   45  137:ldc1            #216 <String "true">
	//   46  139:iconst_1        
	//   47  140:invokevirtual   #220 <Method void _matchToken(String, int)>
								_nextToken = JsonToken.VALUE_TRUE;
	//   48  143:aload_0         
	//   49  144:getstatic       #223 <Field JsonToken JsonToken.VALUE_TRUE>
	//   50  147:putfield        #204 <Field JsonToken _nextToken>
								return;
	//   51  150:return          
							}
						} else
						{
							_matchToken("null", 1);
	//   52  151:aload_0         
	//   53  152:ldc1            #225 <String "null">
	//   54  154:iconst_1        
	//   55  155:invokevirtual   #220 <Method void _matchToken(String, int)>
							_nextToken = JsonToken.VALUE_NULL;
	//   56  158:aload_0         
	//   57  159:getstatic       #228 <Field JsonToken JsonToken.VALUE_NULL>
	//   58  162:putfield        #204 <Field JsonToken _nextToken>
							return;
	//   59  165:return          
						}
					} else
					{
						_matchToken("false", 1);
	//   60  166:aload_0         
	//   61  167:ldc1            #230 <String "false">
	//   62  169:iconst_1        
	//   63  170:invokevirtual   #220 <Method void _matchToken(String, int)>
						_nextToken = JsonToken.VALUE_FALSE;
	//   64  173:aload_0         
	//   65  174:getstatic       #233 <Field JsonToken JsonToken.VALUE_FALSE>
	//   66  177:putfield        #204 <Field JsonToken _nextToken>
						return;
	//   67  180:return          
					}
				} else
				{
					_nextToken = JsonToken.START_ARRAY;
	//   68  181:aload_0         
	//   69  182:getstatic       #236 <Field JsonToken JsonToken.START_ARRAY>
	//   70  185:putfield        #204 <Field JsonToken _nextToken>
					return;
	//   71  188:return          
				}
			} else
			{
				_nextToken = _parseNegNumber();
	//   72  189:aload_0         
	//   73  190:aload_0         
	//   74  191:invokevirtual   #240 <Method JsonToken _parseNegNumber()>
	//   75  194:putfield        #204 <Field JsonToken _nextToken>
				return;
	//   76  197:return          
			}
		} else
		{
			_tokenIncomplete = true;
	//   77  198:aload_0         
	//   78  199:iconst_1        
	//   79  200:putfield        #198 <Field boolean _tokenIncomplete>
			_nextToken = JsonToken.VALUE_STRING;
	//   80  203:aload_0         
	//   81  204:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//   82  207:putfield        #204 <Field JsonToken _nextToken>
			return;
	//   83  210:return          
		}
	}

	private final void _matchToken2(String s, int i)
		throws IOException
	{
		int k = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #245 <Method int String.length()>
	//    2    4:istore          4
		int j;
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore() || _inputBuffer[_inputPtr] != s.charAt(i))
	//*   3    6:aload_0         
	//*   4    7:getfield        #61  <Field int _inputPtr>
	//*   5   10:aload_0         
	//*   6   11:getfield        #64  <Field int _inputEnd>
	//*   7   14:icmplt          24
	//*   8   17:aload_0         
	//*   9   18:invokevirtual   #249 <Method boolean _loadMore()>
	//*  10   21:ifeq            41
	//*  11   24:aload_0         
	//*  12   25:getfield        #58  <Field byte[] _inputBuffer>
	//*  13   28:aload_0         
	//*  14   29:getfield        #61  <Field int _inputPtr>
	//*  15   32:baload          
	//*  16   33:aload_1         
	//*  17   34:iload_2         
	//*  18   35:invokevirtual   #253 <Method char String.charAt(int)>
	//*  19   38:icmpeq          51
				_reportInvalidToken(s.substring(0, i));
	//   20   41:aload_0         
	//   21   42:aload_1         
	//   22   43:iconst_0        
	//   23   44:iload_2         
	//   24   45:invokevirtual   #93  <Method String String.substring(int, int)>
	//   25   48:invokevirtual   #97  <Method void _reportInvalidToken(String)>
			_inputPtr = _inputPtr + 1;
	//   26   51:aload_0         
	//   27   52:aload_0         
	//   28   53:getfield        #61  <Field int _inputPtr>
	//   29   56:iconst_1        
	//   30   57:iadd            
	//   31   58:putfield        #61  <Field int _inputPtr>
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
	//*  42   74:getfield        #61  <Field int _inputPtr>
	//*  43   77:aload_0         
	//*  44   78:getfield        #64  <Field int _inputEnd>
	//*  45   81:icmplt          92
	//*  46   84:aload_0         
	//*  47   85:invokevirtual   #249 <Method boolean _loadMore()>
	//*  48   88:ifne            92
			return;
	//   49   91:return          
		i = _inputBuffer[_inputPtr] & 0xff;
	//   50   92:aload_0         
	//   51   93:getfield        #58  <Field byte[] _inputBuffer>
	//   52   96:aload_0         
	//   53   97:getfield        #61  <Field int _inputPtr>
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
	//   71  128:invokespecial   #255 <Method void _checkMatchEnd(String, int, int)>
	//   72  131:return          
	}

	private final JsonToken _nextAfterName()
	{
		_nameCopied = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #259 <Field boolean _nameCopied>
		JsonToken jsontoken = _nextToken;
	//    3    5:aload_0         
	//    4    6:getfield        #204 <Field JsonToken _nextToken>
	//    5    9:astore_1        
		_nextToken = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #204 <Field JsonToken _nextToken>
		if(jsontoken == JsonToken.START_ARRAY)
	//*   9   15:aload_1         
	//*  10   16:getstatic       #236 <Field JsonToken JsonToken.START_ARRAY>
	//*  11   19:if_acmpne       44
			_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #165 <Field JsonReadContext _parsingContext>
	//   15   27:aload_0         
	//   16   28:getfield        #262 <Field int _tokenInputRow>
	//   17   31:aload_0         
	//   18   32:getfield        #265 <Field int _tokenInputCol>
	//   19   35:invokevirtual   #269 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   20   38:putfield        #165 <Field JsonReadContext _parsingContext>
		else
	//*  21   41:goto            70
		if(jsontoken == JsonToken.START_OBJECT)
	//*  22   44:aload_1         
	//*  23   45:getstatic       #214 <Field JsonToken JsonToken.START_OBJECT>
	//*  24   48:if_acmpne       70
			_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   25   51:aload_0         
	//   26   52:aload_0         
	//   27   53:getfield        #165 <Field JsonReadContext _parsingContext>
	//   28   56:aload_0         
	//   29   57:getfield        #262 <Field int _tokenInputRow>
	//   30   60:aload_0         
	//   31   61:getfield        #265 <Field int _tokenInputCol>
	//   32   64:invokevirtual   #272 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   33   67:putfield        #165 <Field JsonReadContext _parsingContext>
		_currToken = jsontoken;
	//   34   70:aload_0         
	//   35   71:aload_1         
	//   36   72:putfield        #189 <Field JsonToken _currToken>
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
	//    5    8:putfield        #198 <Field boolean _tokenIncomplete>
			JsonToken jsontoken = JsonToken.VALUE_STRING;
	//    6   11:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//    7   14:astore_2        
			_currToken = jsontoken;
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:putfield        #189 <Field JsonToken _currToken>
			return jsontoken;
	//   11   20:aload_2         
	//   12   21:areturn         
		}
		if(i != 45)
	//*  13   22:iload_1         
	//*  14   23:bipush          45
	//*  15   25:icmpeq          252
		{
			if(i != 91)
	//*  16   28:iload_1         
	//*  17   29:bipush          91
	//*  18   31:icmpeq          222
			{
				if(i != 102)
	//*  19   34:iload_1         
	//*  20   35:bipush          102
	//*  21   37:icmpeq          204
				{
					if(i != 110)
	//*  22   40:iload_1         
	//*  23   41:bipush          110
	//*  24   43:icmpeq          186
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
	//   35  114:invokevirtual   #208 <Method JsonToken _handleUnexpectedValue(int)>
	//   36  117:astore_2        
									_currToken = jsontoken1;
	//   37  118:aload_0         
	//   38  119:aload_2         
	//   39  120:putfield        #189 <Field JsonToken _currToken>
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
	//   44  127:invokevirtual   #211 <Method JsonToken _parsePosNumber(int)>
	//   45  130:astore_2        
									break;
								}
								_currToken = jsontoken2;
	//   46  131:aload_0         
	//   47  132:aload_2         
	//   48  133:putfield        #189 <Field JsonToken _currToken>
								return jsontoken2;
	//   49  136:aload_2         
	//   50  137:areturn         
							} else
							{
								_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   51  138:aload_0         
	//   52  139:aload_0         
	//   53  140:getfield        #165 <Field JsonReadContext _parsingContext>
	//   54  143:aload_0         
	//   55  144:getfield        #262 <Field int _tokenInputRow>
	//   56  147:aload_0         
	//   57  148:getfield        #265 <Field int _tokenInputCol>
	//   58  151:invokevirtual   #272 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   59  154:putfield        #165 <Field JsonReadContext _parsingContext>
								JsonToken jsontoken3 = JsonToken.START_OBJECT;
	//   60  157:getstatic       #214 <Field JsonToken JsonToken.START_OBJECT>
	//   61  160:astore_2        
								_currToken = jsontoken3;
	//   62  161:aload_0         
	//   63  162:aload_2         
	//   64  163:putfield        #189 <Field JsonToken _currToken>
								return jsontoken3;
	//   65  166:aload_2         
	//   66  167:areturn         
							}
						} else
						{
							_matchToken("true", 1);
	//   67  168:aload_0         
	//   68  169:ldc1            #216 <String "true">
	//   69  171:iconst_1        
	//   70  172:invokevirtual   #220 <Method void _matchToken(String, int)>
							JsonToken jsontoken4 = JsonToken.VALUE_TRUE;
	//   71  175:getstatic       #223 <Field JsonToken JsonToken.VALUE_TRUE>
	//   72  178:astore_2        
							_currToken = jsontoken4;
	//   73  179:aload_0         
	//   74  180:aload_2         
	//   75  181:putfield        #189 <Field JsonToken _currToken>
							return jsontoken4;
	//   76  184:aload_2         
	//   77  185:areturn         
						}
					} else
					{
						_matchToken("null", 1);
	//   78  186:aload_0         
	//   79  187:ldc1            #225 <String "null">
	//   80  189:iconst_1        
	//   81  190:invokevirtual   #220 <Method void _matchToken(String, int)>
						JsonToken jsontoken5 = JsonToken.VALUE_NULL;
	//   82  193:getstatic       #228 <Field JsonToken JsonToken.VALUE_NULL>
	//   83  196:astore_2        
						_currToken = jsontoken5;
	//   84  197:aload_0         
	//   85  198:aload_2         
	//   86  199:putfield        #189 <Field JsonToken _currToken>
						return jsontoken5;
	//   87  202:aload_2         
	//   88  203:areturn         
					}
				} else
				{
					_matchToken("false", 1);
	//   89  204:aload_0         
	//   90  205:ldc1            #230 <String "false">
	//   91  207:iconst_1        
	//   92  208:invokevirtual   #220 <Method void _matchToken(String, int)>
					JsonToken jsontoken6 = JsonToken.VALUE_FALSE;
	//   93  211:getstatic       #233 <Field JsonToken JsonToken.VALUE_FALSE>
	//   94  214:astore_2        
					_currToken = jsontoken6;
	//   95  215:aload_0         
	//   96  216:aload_2         
	//   97  217:putfield        #189 <Field JsonToken _currToken>
					return jsontoken6;
	//   98  220:aload_2         
	//   99  221:areturn         
				}
			} else
			{
				_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//  100  222:aload_0         
	//  101  223:aload_0         
	//  102  224:getfield        #165 <Field JsonReadContext _parsingContext>
	//  103  227:aload_0         
	//  104  228:getfield        #262 <Field int _tokenInputRow>
	//  105  231:aload_0         
	//  106  232:getfield        #265 <Field int _tokenInputCol>
	//  107  235:invokevirtual   #269 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//  108  238:putfield        #165 <Field JsonReadContext _parsingContext>
				JsonToken jsontoken7 = JsonToken.START_ARRAY;
	//  109  241:getstatic       #236 <Field JsonToken JsonToken.START_ARRAY>
	//  110  244:astore_2        
				_currToken = jsontoken7;
	//  111  245:aload_0         
	//  112  246:aload_2         
	//  113  247:putfield        #189 <Field JsonToken _currToken>
				return jsontoken7;
	//  114  250:aload_2         
	//  115  251:areturn         
			}
		} else
		{
			JsonToken jsontoken8 = _parseNegNumber();
	//  116  252:aload_0         
	//  117  253:invokevirtual   #240 <Method JsonToken _parseNegNumber()>
	//  118  256:astore_2        
			_currToken = jsontoken8;
	//  119  257:aload_0         
	//  120  258:aload_2         
	//  121  259:putfield        #189 <Field JsonToken _currToken>
			return jsontoken8;
	//  122  262:aload_2         
	//  123  263:areturn         
		}
	}

	private final JsonToken _parseFloat(char ac[], int i, int j, boolean flag, int k)
		throws IOException
	{
		int l1;
		int j2;
		int k2;
		int l2;
		int i3;
		int j3;
		int l;
		char ac3[];
label0:
		{
label1:
			{
				int j1;
label2:
				{
					k2 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          9
					if(j != 46)
						break label1;
	//    2    3:iload_3         
	//    3    4:bipush          46
	//    4    6:icmpne          222
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
	//   14   22:getfield        #116 <Field TextBuffer _textBuffer>
	//   15   25:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
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
					j1 = 0;
	//   32   51:iconst_0        
	//   33   52:istore          7
					j = i;
	//   34   54:iload_2         
	//   35   55:istore_3        
					i = j1;
	//   36   56:iload           7
	//   37   58:istore_2        
					do
					{
						if(_inputPtr >= _inputEnd && !_loadMore())
	//*  38   59:aload_0         
	//*  39   60:getfield        #61  <Field int _inputPtr>
	//*  40   63:aload_0         
	//*  41   64:getfield        #64  <Field int _inputEnd>
	//*  42   67:icmplt          91
	//*  43   70:aload_0         
	//*  44   71:invokevirtual   #249 <Method boolean _loadMore()>
	//*  45   74:ifne            91
						{
							boolean flag1 = true;
	//   46   77:iconst_1        
	//   47   78:istore          8
							j1 = l;
	//   48   80:iload           6
	//   49   82:istore          7
							l = ((int) (flag1));
	//   50   84:iload           8
	//   51   86:istore          6
							break label2;
	//   52   88:goto            193
						}
						char ac2[] = ((char []) (_inputBuffer));
	//   53   91:aload_0         
	//   54   92:getfield        #58  <Field byte[] _inputBuffer>
	//   55   95:astore          13
						l = _inputPtr;
	//   56   97:aload_0         
	//   57   98:getfield        #61  <Field int _inputPtr>
	//   58  101:istore          6
						_inputPtr = l + 1;
	//   59  103:aload_0         
	//   60  104:iload           6
	//   61  106:iconst_1        
	//   62  107:iadd            
	//   63  108:putfield        #61  <Field int _inputPtr>
						j1 = ac2[l] & 0xff;
	//   64  111:aload           13
	//   65  113:iload           6
	//   66  115:baload          
	//   67  116:sipush          255
	//   68  119:iand            
	//   69  120:istore          7
						if(j1 < 48 || j1 > 57)
	//*  70  122:iload           7
	//*  71  124:bipush          48
	//*  72  126:icmplt          190
	//*  73  129:iload           7
	//*  74  131:bipush          57
	//*  75  133:icmple          139
							break;
	//   76  136:goto            190
						int i2 = i + 1;
	//   77  139:iload_2         
	//   78  140:iconst_1        
	//   79  141:iadd            
	//   80  142:istore          8
						i = j;
	//   81  144:iload_3         
	//   82  145:istore_2        
						ac2 = ac;
	//   83  146:aload_1         
	//   84  147:astore          13
						if(j >= ac.length)
	//*  85  149:iload_3         
	//*  86  150:aload_1         
	//*  87  151:arraylength     
	//*  88  152:icmplt          166
						{
							ac2 = _textBuffer.finishCurrentSegment();
	//   89  155:aload_0         
	//   90  156:getfield        #116 <Field TextBuffer _textBuffer>
	//   91  159:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
	//   92  162:astore          13
							i = 0;
	//   93  164:iconst_0        
	//   94  165:istore_2        
						}
						ac2[i] = (char)j1;
	//   95  166:aload           13
	//   96  168:iload_2         
	//   97  169:iload           7
	//   98  171:int2char        
	//   99  172:castore         
						j = i + 1;
	//  100  173:iload_2         
	//  101  174:iconst_1        
	//  102  175:iadd            
	//  103  176:istore_3        
						l = j1;
	//  104  177:iload           7
	//  105  179:istore          6
						i = i2;
	//  106  181:iload           8
	//  107  183:istore_2        
						ac = ac2;
	//  108  184:aload           13
	//  109  186:astore_1        
					} while(true);
	//  110  187:goto            59
					l = 0;
	//  111  190:iconst_0        
	//  112  191:istore          6
				}
				if(i == 0)
	//* 113  193:iload_2         
	//* 114  194:ifne            206
					reportUnexpectedNumberChar(j1, "Decimal point not followed by a digit");
	//  115  197:aload_0         
	//  116  198:iload           7
	//  117  200:ldc2            #277 <String "Decimal point not followed by a digit">
	//  118  203:invokevirtual   #280 <Method void reportUnexpectedNumberChar(int, String)>
				j2 = i;
	//  119  206:iload_2         
	//  120  207:istore          8
				i = l;
	//  121  209:iload           6
	//  122  211:istore_2        
				ac3 = ac;
	//  123  212:aload_1         
	//  124  213:astore          13
				l = j1;
	//  125  215:iload           7
	//  126  217:istore          6
				break label0;
	//  127  219:goto            240
			}
			j2 = 0;
	//  128  222:iconst_0        
	//  129  223:istore          8
			int k1 = j2;
	//  130  225:iload           8
	//  131  227:istore          7
			l = j;
	//  132  229:iload_3         
	//  133  230:istore          6
			j = i;
	//  134  232:iload_2         
	//  135  233:istore_3        
			ac3 = ac;
	//  136  234:aload_1         
	//  137  235:astore          13
			i = k1;
	//  138  237:iload           7
	//  139  239:istore_2        
		}
		if(l != 101)
	//* 140  240:iload           6
	//* 141  242:bipush          101
	//* 142  244:icmpeq          264
		{
			l2 = i;
	//  143  247:iload_2         
	//  144  248:istore          10
			i3 = j;
	//  145  250:iload_3         
	//  146  251:istore          11
			j3 = l;
	//  147  253:iload           6
	//  148  255:istore          12
			if(l != 69)
				break MISSING_BLOCK_LABEL_638;
	//  149  257:iload           6
	//  150  259:bipush          69
	//  151  261:icmpne          638
		}
		ac = ac3;
	//  152  264:aload           13
	//  153  266:astore_1        
		k2 = j;
	//  154  267:iload_3         
	//  155  268:istore          9
		if(j >= ac3.length)
	//* 156  270:iload_3         
	//* 157  271:aload           13
	//* 158  273:arraylength     
	//* 159  274:icmplt          288
		{
			ac = _textBuffer.finishCurrentSegment();
	//  160  277:aload_0         
	//  161  278:getfield        #116 <Field TextBuffer _textBuffer>
	//  162  281:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
	//  163  284:astore_1        
			k2 = 0;
	//  164  285:iconst_0        
	//  165  286:istore          9
		}
		l1 = k2 + 1;
	//  166  288:iload           9
	//  167  290:iconst_1        
	//  168  291:iadd            
	//  169  292:istore          7
		ac[k2] = (char)l;
	//  170  294:aload_1         
	//  171  295:iload           9
	//  172  297:iload           6
	//  173  299:int2char        
	//  174  300:castore         
		if(_inputPtr >= _inputEnd)
	//* 175  301:aload_0         
	//* 176  302:getfield        #61  <Field int _inputPtr>
	//* 177  305:aload_0         
	//* 178  306:getfield        #64  <Field int _inputEnd>
	//* 179  309:icmplt          316
			_loadMoreGuaranteed();
	//  180  312:aload_0         
	//  181  313:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
		ac3 = ((char []) (_inputBuffer));
	//  182  316:aload_0         
	//  183  317:getfield        #58  <Field byte[] _inputBuffer>
	//  184  320:astore          13
		j = _inputPtr;
	//  185  322:aload_0         
	//  186  323:getfield        #61  <Field int _inputPtr>
	//  187  326:istore_3        
		_inputPtr = j + 1;
	//  188  327:aload_0         
	//  189  328:iload_3         
	//  190  329:iconst_1        
	//  191  330:iadd            
	//  192  331:putfield        #61  <Field int _inputPtr>
		k2 = ac3[j] & 0xff;
	//  193  334:aload           13
	//  194  336:iload_3         
	//  195  337:baload          
	//  196  338:sipush          255
	//  197  341:iand            
	//  198  342:istore          9
		if(k2 == 45) goto _L2; else goto _L1
	//  199  344:iload           9
	//  200  346:bipush          45
	//  201  348:icmpeq          377
_L1:
		int i1;
		char ac4[];
		j = l1;
	//  202  351:iload           7
	//  203  353:istore_3        
		ac4 = ac;
	//  204  354:aload_1         
	//  205  355:astore          13
		i1 = k2;
	//  206  357:iload           9
	//  207  359:istore          6
		if(k2 != 43) goto _L3; else goto _L2
	//  208  361:iload           9
	//  209  363:bipush          43
	//  210  365:icmpne          371
	//* 211  368:goto            377
_L3:
		l1 = 0;
	//  212  371:iconst_0        
	//  213  372:istore          7
		break; /* Loop/switch isn't completed */
	//  214  374:goto            459
_L2:
		j = l1;
	//  215  377:iload           7
	//  216  379:istore_3        
		ac4 = ac;
	//  217  380:aload_1         
	//  218  381:astore          13
		if(l1 >= ac.length)
	//* 219  383:iload           7
	//* 220  385:aload_1         
	//* 221  386:arraylength     
	//* 222  387:icmplt          401
		{
			ac4 = _textBuffer.finishCurrentSegment();
	//  223  390:aload_0         
	//  224  391:getfield        #116 <Field TextBuffer _textBuffer>
	//  225  394:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
	//  226  397:astore          13
			j = 0;
	//  227  399:iconst_0        
	//  228  400:istore_3        
		}
		ac4[j] = (char)k2;
	//  229  401:aload           13
	//  230  403:iload_3         
	//  231  404:iload           9
	//  232  406:int2char        
	//  233  407:castore         
		if(_inputPtr >= _inputEnd)
	//* 234  408:aload_0         
	//* 235  409:getfield        #61  <Field int _inputPtr>
	//* 236  412:aload_0         
	//* 237  413:getfield        #64  <Field int _inputEnd>
	//* 238  416:icmplt          423
			_loadMoreGuaranteed();
	//  239  419:aload_0         
	//  240  420:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
		ac = ((char []) (_inputBuffer));
	//  241  423:aload_0         
	//  242  424:getfield        #58  <Field byte[] _inputBuffer>
	//  243  427:astore_1        
		i1 = _inputPtr;
	//  244  428:aload_0         
	//  245  429:getfield        #61  <Field int _inputPtr>
	//  246  432:istore          6
		_inputPtr = i1 + 1;
	//  247  434:aload_0         
	//  248  435:iload           6
	//  249  437:iconst_1        
	//  250  438:iadd            
	//  251  439:putfield        #61  <Field int _inputPtr>
		i1 = ac[i1] & 0xff;
	//  252  442:aload_1         
	//  253  443:iload           6
	//  254  445:baload          
	//  255  446:sipush          255
	//  256  449:iand            
	//  257  450:istore          6
		j++;
	//  258  452:iload_3         
	//  259  453:iconst_1        
	//  260  454:iadd            
	//  261  455:istore_3        
		if(true) goto _L3; else goto _L4
	//  262  456:goto            371
_L4:
label3:
		{
			do
			{
				if(i1 > 57 || i1 < 48)
					break;
	//  263  459:iload           6
	//  264  461:bipush          57
	//  265  463:icmpgt          585
	//  266  466:iload           6
	//  267  468:bipush          48
	//  268  470:icmplt          585
				l1++;
	//  269  473:iload           7
	//  270  475:iconst_1        
	//  271  476:iadd            
	//  272  477:istore          7
				k2 = j;
	//  273  479:iload_3         
	//  274  480:istore          9
				ac = ac4;
	//  275  482:aload           13
	//  276  484:astore_1        
				if(j >= ac4.length)
	//* 277  485:iload_3         
	//* 278  486:aload           13
	//* 279  488:arraylength     
	//* 280  489:icmplt          503
				{
					ac = _textBuffer.finishCurrentSegment();
	//  281  492:aload_0         
	//  282  493:getfield        #116 <Field TextBuffer _textBuffer>
	//  283  496:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
	//  284  499:astore_1        
					k2 = 0;
	//  285  500:iconst_0        
	//  286  501:istore          9
				}
				j = k2 + 1;
	//  287  503:iload           9
	//  288  505:iconst_1        
	//  289  506:iadd            
	//  290  507:istore_3        
				ac[k2] = (char)i1;
	//  291  508:aload_1         
	//  292  509:iload           9
	//  293  511:iload           6
	//  294  513:int2char        
	//  295  514:castore         
				if(_inputPtr >= _inputEnd && !_loadMore())
	//* 296  515:aload_0         
	//* 297  516:getfield        #61  <Field int _inputPtr>
	//* 298  519:aload_0         
	//* 299  520:getfield        #64  <Field int _inputEnd>
	//* 300  523:icmplt          548
	//* 301  526:aload_0         
	//* 302  527:invokevirtual   #249 <Method boolean _loadMore()>
	//* 303  530:ifne            548
				{
					i = l1;
	//  304  533:iload           7
	//  305  535:istore_2        
					k2 = 1;
	//  306  536:iconst_1        
	//  307  537:istore          9
					l1 = j;
	//  308  539:iload_3         
	//  309  540:istore          7
					j = k2;
	//  310  542:iload           9
	//  311  544:istore_3        
					break label3;
	//  312  545:goto            597
				}
				ac4 = ((char []) (_inputBuffer));
	//  313  548:aload_0         
	//  314  549:getfield        #58  <Field byte[] _inputBuffer>
	//  315  552:astore          13
				i1 = _inputPtr;
	//  316  554:aload_0         
	//  317  555:getfield        #61  <Field int _inputPtr>
	//  318  558:istore          6
				_inputPtr = i1 + 1;
	//  319  560:aload_0         
	//  320  561:iload           6
	//  321  563:iconst_1        
	//  322  564:iadd            
	//  323  565:putfield        #61  <Field int _inputPtr>
				i1 = ac4[i1] & 0xff;
	//  324  568:aload           13
	//  325  570:iload           6
	//  326  572:baload          
	//  327  573:sipush          255
	//  328  576:iand            
	//  329  577:istore          6
				ac4 = ac;
	//  330  579:aload_1         
	//  331  580:astore          13
			} while(true);
	//  332  582:goto            459
			k2 = l1;
	//  333  585:iload           7
	//  334  587:istore          9
			l1 = j;
	//  335  589:iload_3         
	//  336  590:istore          7
			j = i;
	//  337  592:iload_2         
	//  338  593:istore_3        
			i = k2;
	//  339  594:iload           9
	//  340  596:istore_2        
		}
		k2 = i;
	//  341  597:iload_2         
	//  342  598:istore          9
		l2 = j;
	//  343  600:iload_3         
	//  344  601:istore          10
		i3 = l1;
	//  345  603:iload           7
	//  346  605:istore          11
		j3 = i1;
	//  347  607:iload           6
	//  348  609:istore          12
		if(i == 0)
	//* 349  611:iload_2         
	//* 350  612:ifne            638
		{
			reportUnexpectedNumberChar(i1, "Exponent indicator not followed by a digit");
	//  351  615:aload_0         
	//  352  616:iload           6
	//  353  618:ldc2            #282 <String "Exponent indicator not followed by a digit">
	//  354  621:invokevirtual   #280 <Method void reportUnexpectedNumberChar(int, String)>
			j3 = i1;
	//  355  624:iload           6
	//  356  626:istore          12
			i3 = l1;
	//  357  628:iload           7
	//  358  630:istore          11
			l2 = j;
	//  359  632:iload_3         
	//  360  633:istore          10
			k2 = i;
	//  361  635:iload_2         
	//  362  636:istore          9
		}
		if(l2 == 0)
	//* 363  638:iload           10
	//* 364  640:ifne            669
		{
			_inputPtr = _inputPtr - 1;
	//  365  643:aload_0         
	//  366  644:aload_0         
	//  367  645:getfield        #61  <Field int _inputPtr>
	//  368  648:iconst_1        
	//  369  649:isub            
	//  370  650:putfield        #61  <Field int _inputPtr>
			if(_parsingContext.inRoot())
	//* 371  653:aload_0         
	//* 372  654:getfield        #165 <Field JsonReadContext _parsingContext>
	//* 373  657:invokevirtual   #285 <Method boolean JsonReadContext.inRoot()>
	//* 374  660:ifeq            669
				_verifyRootSpace(j3);
	//  375  663:aload_0         
	//  376  664:iload           12
	//  377  666:invokespecial   #288 <Method void _verifyRootSpace(int)>
		}
		_textBuffer.setCurrentLength(i3);
	//  378  669:aload_0         
	//  379  670:getfield        #116 <Field TextBuffer _textBuffer>
	//  380  673:iload           11
	//  381  675:invokevirtual   #132 <Method void TextBuffer.setCurrentLength(int)>
		return resetFloat(flag, k, j2, k2);
	//  382  678:aload_0         
	//  383  679:iload           4
	//  384  681:iload           5
	//  385  683:iload           8
	//  386  685:iload           9
	//  387  687:invokevirtual   #292 <Method JsonToken resetFloat(boolean, int, int, int)>
	//  388  690:areturn         
	}

	private final JsonToken _parseNumber2(char ac[], int i, boolean flag, int j)
		throws IOException
	{
		int l;
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          34
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #249 <Method boolean _loadMore()>
	//*   7   15:ifne            34
			{
				_textBuffer.setCurrentLength(i);
	//    8   18:aload_0         
	//    9   19:getfield        #116 <Field TextBuffer _textBuffer>
	//   10   22:iload_2         
	//   11   23:invokevirtual   #132 <Method void TextBuffer.setCurrentLength(int)>
				return resetInt(flag, j);
	//   12   26:aload_0         
	//   13   27:iload_3         
	//   14   28:iload           4
	//   15   30:invokevirtual   #298 <Method JsonToken resetInt(boolean, int)>
	//   16   33:areturn         
			}
			char ac1[] = ((char []) (_inputBuffer));
	//   17   34:aload_0         
	//   18   35:getfield        #58  <Field byte[] _inputBuffer>
	//   19   38:astore          7
			int k = _inputPtr;
	//   20   40:aload_0         
	//   21   41:getfield        #61  <Field int _inputPtr>
	//   22   44:istore          5
			_inputPtr = k + 1;
	//   23   46:aload_0         
	//   24   47:iload           5
	//   25   49:iconst_1        
	//   26   50:iadd            
	//   27   51:putfield        #61  <Field int _inputPtr>
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
	//   50   95:getfield        #116 <Field TextBuffer _textBuffer>
	//   51   98:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
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
	//   83  157:getfield        #61  <Field int _inputPtr>
	//   84  160:iconst_1        
	//   85  161:isub            
	//   86  162:putfield        #61  <Field int _inputPtr>
			_textBuffer.setCurrentLength(i);
	//   87  165:aload_0         
	//   88  166:getfield        #116 <Field TextBuffer _textBuffer>
	//   89  169:iload_2         
	//   90  170:invokevirtual   #132 <Method void TextBuffer.setCurrentLength(int)>
			if(_parsingContext.inRoot())
	//*  91  173:aload_0         
	//*  92  174:getfield        #165 <Field JsonReadContext _parsingContext>
	//*  93  177:invokevirtual   #285 <Method boolean JsonReadContext.inRoot()>
	//*  94  180:ifeq            211
			{
				ac = ((char []) (_inputBuffer));
	//   95  183:aload_0         
	//   96  184:getfield        #58  <Field byte[] _inputBuffer>
	//   97  187:astore_1        
				i = _inputPtr;
	//   98  188:aload_0         
	//   99  189:getfield        #61  <Field int _inputPtr>
	//  100  192:istore_2        
				_inputPtr = i + 1;
	//  101  193:aload_0         
	//  102  194:iload_2         
	//  103  195:iconst_1        
	//  104  196:iadd            
	//  105  197:putfield        #61  <Field int _inputPtr>
				_verifyRootSpace(ac[i] & 0xff);
	//  106  200:aload_0         
	//  107  201:aload_1         
	//  108  202:iload_2         
	//  109  203:baload          
	//  110  204:sipush          255
	//  111  207:iand            
	//  112  208:invokespecial   #288 <Method void _verifyRootSpace(int)>
			}
			return resetInt(flag, j);
	//  113  211:aload_0         
	//  114  212:iload_3         
	//  115  213:iload           4
	//  116  215:invokevirtual   #298 <Method JsonToken resetInt(boolean, int)>
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
	//  124  227:invokespecial   #300 <Method JsonToken _parseFloat(char[], int, int, boolean, int)>
	//  125  230:areturn         
		}
	}

	private final void _skipCComment()
		throws IOException
	{
		int ai[] = CharTypes.getInputCodeComment();
	//    0    0:invokestatic    #304 <Method int[] CharTypes.getInputCodeComment()>
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
	//    3    5:getfield        #61  <Field int _inputPtr>
	//    4    8:aload_0         
	//    5    9:getfield        #64  <Field int _inputEnd>
	//    6   12:icmplt          22
	//    7   15:aload_0         
	//    8   16:invokevirtual   #249 <Method boolean _loadMore()>
	//    9   19:ifeq            152
							byte abyte0[] = _inputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #58  <Field byte[] _inputBuffer>
	//   12   26:astore          4
							int i = _inputPtr;
	//   13   28:aload_0         
	//   14   29:getfield        #61  <Field int _inputPtr>
	//   15   32:istore_1        
							_inputPtr = i + 1;
	//   16   33:aload_0         
	//   17   34:iload_1         
	//   18   35:iconst_1        
	//   19   36:iadd            
	//   20   37:putfield        #61  <Field int _inputPtr>
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
	//   46  106:invokevirtual   #155 <Method void _reportInvalidChar(int)>
									break;

	//*  47  109:goto            4
								case 4: // '\004'
									_skipUtf8_4(i);
	//   48  112:aload_0         
	//   49  113:iload_1         
	//   50  114:invokespecial   #307 <Method void _skipUtf8_4(int)>
									break;

	//*  51  117:goto            4
								case 3: // '\003'
									_skipUtf8_3();
	//   52  120:aload_0         
	//   53  121:invokespecial   #310 <Method void _skipUtf8_3()>
									break;

	//*  54  124:goto            4
								case 2: // '\002'
									_skipUtf8_2();
	//   55  127:aload_0         
	//   56  128:invokespecial   #313 <Method void _skipUtf8_2()>
									break;
								}
								continue label0;
	//   57  131:goto            4
							}
							if(_inputPtr < _inputEnd || _loadMore())
								break label3;
	//   58  134:aload_0         
	//   59  135:getfield        #61  <Field int _inputPtr>
	//   60  138:aload_0         
	//   61  139:getfield        #64  <Field int _inputEnd>
	//   62  142:icmplt          161
	//   63  145:aload_0         
	//   64  146:invokevirtual   #249 <Method boolean _loadMore()>
	//   65  149:ifne            161
							break;
						} while(true);
						_reportInvalidEOF(" in a comment", ((JsonToken) (null)));
	//   66  152:aload_0         
	//   67  153:ldc2            #315 <String " in a comment">
	//   68  156:aconst_null     
	//   69  157:invokevirtual   #319 <Method void _reportInvalidEOF(String, JsonToken)>
						return;
	//   70  160:return          
					}
					if(_inputBuffer[_inputPtr] == 47)
	//*  71  161:aload_0         
	//*  72  162:getfield        #58  <Field byte[] _inputBuffer>
	//*  73  165:aload_0         
	//*  74  166:getfield        #61  <Field int _inputPtr>
	//*  75  169:baload          
	//*  76  170:bipush          47
	//*  77  172:icmpne          4
					{
						_inputPtr = _inputPtr + 1;
	//   78  175:aload_0         
	//   79  176:aload_0         
	//   80  177:getfield        #61  <Field int _inputPtr>
	//   81  180:iconst_1        
	//   82  181:iadd            
	//   83  182:putfield        #61  <Field int _inputPtr>
						return;
	//   84  185:return          
					}
					continue;
				}
				_skipCR();
	//   85  186:aload_0         
	//   86  187:invokevirtual   #322 <Method void _skipCR()>
				continue;
	//   87  190:goto            4
			}
			_currInputRow = _currInputRow + 1;
	//   88  193:aload_0         
	//   89  194:aload_0         
	//   90  195:getfield        #325 <Field int _currInputRow>
	//   91  198:iconst_1        
	//   92  199:iadd            
	//   93  200:putfield        #325 <Field int _currInputRow>
			_currInputRowStart = _inputPtr;
	//   94  203:aload_0         
	//   95  204:aload_0         
	//   96  205:getfield        #61  <Field int _inputPtr>
	//   97  208:putfield        #67  <Field int _currInputRowStart>
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
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:iconst_4        
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #64  <Field int _inputEnd>
	//*   6   10:icmplt          19
				return _skipColon2(false);
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:invokespecial   #329 <Method int _skipColon2(boolean)>
	//   10   18:ireturn         
			byte byte0 = _inputBuffer[_inputPtr];
	//   11   19:aload_0         
	//   12   20:getfield        #58  <Field byte[] _inputBuffer>
	//   13   23:aload_0         
	//   14   24:getfield        #61  <Field int _inputPtr>
	//   15   27:baload          
	//   16   28:istore_2        
			if(byte0 == 58)
	//*  17   29:iload_2         
	//*  18   30:bipush          58
	//*  19   32:icmpne          173
			{
				byte abyte0[] = _inputBuffer;
	//   20   35:aload_0         
	//   21   36:getfield        #58  <Field byte[] _inputBuffer>
	//   22   39:astore_3        
				int i = _inputPtr + 1;
	//   23   40:aload_0         
	//   24   41:getfield        #61  <Field int _inputPtr>
	//   25   44:iconst_1        
	//   26   45:iadd            
	//   27   46:istore_1        
				_inputPtr = i;
	//   28   47:aload_0         
	//   29   48:iload_1         
	//   30   49:putfield        #61  <Field int _inputPtr>
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
	//   47   79:getfield        #61  <Field int _inputPtr>
	//   48   82:iconst_1        
	//   49   83:iadd            
	//   50   84:putfield        #61  <Field int _inputPtr>
						return i;
	//   51   87:iload_1         
	//   52   88:ireturn         
					} else
					{
						return _skipColon2(true);
	//   53   89:aload_0         
	//   54   90:iconst_1        
	//   55   91:invokespecial   #329 <Method int _skipColon2(boolean)>
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
	//   64  108:getfield        #58  <Field byte[] _inputBuffer>
	//   65  111:astore_3        
					int j = _inputPtr + 1;
	//   66  112:aload_0         
	//   67  113:getfield        #61  <Field int _inputPtr>
	//   68  116:iconst_1        
	//   69  117:iadd            
	//   70  118:istore_1        
					_inputPtr = j;
	//   71  119:aload_0         
	//   72  120:iload_1         
	//   73  121:putfield        #61  <Field int _inputPtr>
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
	//   90  151:getfield        #61  <Field int _inputPtr>
	//   91  154:iconst_1        
	//   92  155:iadd            
	//   93  156:putfield        #61  <Field int _inputPtr>
							return j;
	//   94  159:iload_1         
	//   95  160:ireturn         
						} else
						{
							return _skipColon2(true);
	//   96  161:aload_0         
	//   97  162:iconst_1        
	//   98  163:invokespecial   #329 <Method int _skipColon2(boolean)>
	//   99  166:ireturn         
						}
				}
				return _skipColon2(true);
	//  100  167:aload_0         
	//  101  168:iconst_1        
	//  102  169:invokespecial   #329 <Method int _skipColon2(boolean)>
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
	//  113  188:getfield        #58  <Field byte[] _inputBuffer>
	//  114  191:astore_3        
			k = _inputPtr + 1;
	//  115  192:aload_0         
	//  116  193:getfield        #61  <Field int _inputPtr>
	//  117  196:iconst_1        
	//  118  197:iadd            
	//  119  198:istore_1        
			_inputPtr = k;
	//  120  199:aload_0         
	//  121  200:iload_1         
	//  122  201:putfield        #61  <Field int _inputPtr>
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
	//  131  215:getfield        #58  <Field byte[] _inputBuffer>
	//  132  218:astore_3        
			int l = _inputPtr + 1;
	//  133  219:aload_0         
	//  134  220:getfield        #61  <Field int _inputPtr>
	//  135  223:iconst_1        
	//  136  224:iadd            
	//  137  225:istore_1        
			_inputPtr = l;
	//  138  226:aload_0         
	//  139  227:iload_1         
	//  140  228:putfield        #61  <Field int _inputPtr>
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
	//  157  258:getfield        #61  <Field int _inputPtr>
	//  158  261:iconst_1        
	//  159  262:iadd            
	//  160  263:putfield        #61  <Field int _inputPtr>
					return l;
	//  161  266:iload_1         
	//  162  267:ireturn         
				} else
				{
					return _skipColon2(true);
	//  163  268:aload_0         
	//  164  269:iconst_1        
	//  165  270:invokespecial   #329 <Method int _skipColon2(boolean)>
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
	//  174  287:getfield        #58  <Field byte[] _inputBuffer>
	//  175  290:astore_3        
				int i1 = _inputPtr + 1;
	//  176  291:aload_0         
	//  177  292:getfield        #61  <Field int _inputPtr>
	//  178  295:iconst_1        
	//  179  296:iadd            
	//  180  297:istore_1        
				_inputPtr = i1;
	//  181  298:aload_0         
	//  182  299:iload_1         
	//  183  300:putfield        #61  <Field int _inputPtr>
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
	//  200  330:getfield        #61  <Field int _inputPtr>
	//  201  333:iconst_1        
	//  202  334:iadd            
	//  203  335:putfield        #61  <Field int _inputPtr>
						return i1;
	//  204  338:iload_1         
	//  205  339:ireturn         
					} else
					{
						return _skipColon2(true);
	//  206  340:aload_0         
	//  207  341:iconst_1        
	//  208  342:invokespecial   #329 <Method int _skipColon2(boolean)>
	//  209  345:ireturn         
					}
			}
			return _skipColon2(true);
	//  210  346:aload_0         
	//  211  347:iconst_1        
	//  212  348:invokespecial   #329 <Method int _skipColon2(boolean)>
	//  213  351:ireturn         
		} else
		{
			return _skipColon2(false);
	//  214  352:aload_0         
	//  215  353:iconst_0        
	//  216  354:invokespecial   #329 <Method int _skipColon2(boolean)>
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
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          68
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #249 <Method boolean _loadMore()>
	//*   7   15:ifeq            21
	//*   8   18:goto            68
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    9   21:new             #331 <Class StringBuilder>
	//   10   24:dup             
	//   11   25:invokespecial   #333 <Method void StringBuilder()>
	//   12   28:astore_3        
				stringbuilder.append(" within/between ");
	//   13   29:aload_3         
	//   14   30:ldc2            #335 <String " within/between ">
	//   15   33:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   16   36:pop             
				stringbuilder.append(_parsingContext.typeDesc());
	//   17   37:aload_3         
	//   18   38:aload_0         
	//   19   39:getfield        #165 <Field JsonReadContext _parsingContext>
	//   20   42:invokevirtual   #342 <Method String JsonReadContext.typeDesc()>
	//   21   45:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:pop             
				stringbuilder.append(" entries");
	//   23   49:aload_3         
	//   24   50:ldc2            #344 <String " entries">
	//   25   53:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   26   56:pop             
				_reportInvalidEOF(stringbuilder.toString(), ((JsonToken) (null)));
	//   27   57:aload_0         
	//   28   58:aload_3         
	//   29   59:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   30   62:aconst_null     
	//   31   63:invokevirtual   #319 <Method void _reportInvalidEOF(String, JsonToken)>
				return -1;
	//   32   66:iconst_m1       
	//   33   67:ireturn         
			}
			byte abyte0[] = _inputBuffer;
	//   34   68:aload_0         
	//   35   69:getfield        #58  <Field byte[] _inputBuffer>
	//   36   72:astore_3        
			int i = _inputPtr;
	//   37   73:aload_0         
	//   38   74:getfield        #61  <Field int _inputPtr>
	//   39   77:istore_2        
			_inputPtr = i + 1;
	//   40   78:aload_0         
	//   41   79:iload_2         
	//   42   80:iconst_1        
	//   43   81:iadd            
	//   44   82:putfield        #61  <Field int _inputPtr>
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
	//   58  106:invokespecial   #350 <Method void _skipComment()>
				else
	//*  59  109:goto            0
				if(i != 35 || !_skipYAMLComment())
	//*  60  112:iload_2         
	//*  61  113:bipush          35
	//*  62  115:icmpne          128
	//*  63  118:aload_0         
	//*  64  119:invokespecial   #353 <Method boolean _skipYAMLComment()>
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
	//   76  142:ldc2            #355 <String "was expecting a colon to separate field name and value">
	//   77  145:invokevirtual   #358 <Method void _reportUnexpectedChar(int, String)>
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
	//   89  167:getfield        #325 <Field int _currInputRow>
	//   90  170:iconst_1        
	//   91  171:iadd            
	//   92  172:putfield        #325 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   93  175:aload_0         
	//   94  176:aload_0         
	//   95  177:getfield        #61  <Field int _inputPtr>
	//   96  180:putfield        #67  <Field int _currInputRowStart>
				} else
	//*  97  183:goto            0
				if(i == 13)
	//*  98  186:iload_2         
	//*  99  187:bipush          13
	//* 100  189:icmpne          199
					_skipCR();
	//  101  192:aload_0         
	//  102  193:invokevirtual   #322 <Method void _skipCR()>
				else
	//* 103  196:goto            0
				if(i != 9)
	//* 104  199:iload_2         
	//* 105  200:bipush          9
	//* 106  202:icmpeq          0
					_throwInvalidSpace(i);
	//  107  205:aload_0         
	//  108  206:iload_2         
	//  109  207:invokevirtual   #361 <Method void _throwInvalidSpace(int)>
		} while(true);
	//  110  210:goto            0
	}

	private final int _skipColonFast(int i)
		throws IOException
	{
		int l;
		byte byte1;
label0:
		{
label1:
			{
				byte abyte0[] = _inputBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field byte[] _inputBuffer>
	//    2    4:astore          5
				l = i + 1;
	//    3    6:iload_1         
	//    4    7:iconst_1        
	//    5    8:iadd            
	//    6    9:istore_3        
				byte1 = abyte0[i];
	//    7   10:aload           5
	//    8   12:iload_1         
	//    9   13:baload          
	//   10   14:istore          4
				if(byte1 != 58)
					break label0;
	//   11   16:iload           4
	//   12   18:bipush          58
	//   13   20:icmpne          134
				abyte0 = _inputBuffer;
	//   14   23:aload_0         
	//   15   24:getfield        #58  <Field byte[] _inputBuffer>
	//   16   27:astore          5
				int j = l + 1;
	//   17   29:iload_3         
	//   18   30:iconst_1        
	//   19   31:iadd            
	//   20   32:istore_2        
				l = ((int) (abyte0[l]));
	//   21   33:aload           5
	//   22   35:iload_3         
	//   23   36:baload          
	//   24   37:istore_3        
				if(l > 32)
	//*  25   38:iload_3         
	//*  26   39:bipush          32
	//*  27   41:icmple          67
				{
					i = j;
	//   28   44:iload_2         
	//   29   45:istore_1        
					if(l != 47)
	//*  30   46:iload_3         
	//*  31   47:bipush          47
	//*  32   49:icmpeq          121
					{
						i = j;
	//   33   52:iload_2         
	//   34   53:istore_1        
						if(l != 35)
	//*  35   54:iload_3         
	//*  36   55:bipush          35
	//*  37   57:icmpeq          121
						{
							_inputPtr = j;
	//   38   60:aload_0         
	//   39   61:iload_2         
	//   40   62:putfield        #61  <Field int _inputPtr>
							return l;
	//   41   65:iload_3         
	//   42   66:ireturn         
						}
					}
					break label1;
				}
				if(l != 32)
	//*  43   67:iload_3         
	//*  44   68:bipush          32
	//*  45   70:icmpeq          81
				{
					i = j;
	//   46   73:iload_2         
	//   47   74:istore_1        
					if(l != 9)
						break label1;
	//   48   75:iload_3         
	//   49   76:bipush          9
	//   50   78:icmpne          121
				}
				abyte0 = _inputBuffer;
	//   51   81:aload_0         
	//   52   82:getfield        #58  <Field byte[] _inputBuffer>
	//   53   85:astore          5
				i = j + 1;
	//   54   87:iload_2         
	//   55   88:iconst_1        
	//   56   89:iadd            
	//   57   90:istore_1        
				j = ((int) (abyte0[j]));
	//   58   91:aload           5
	//   59   93:iload_2         
	//   60   94:baload          
	//   61   95:istore_2        
				if(j > 32 && j != 47 && j != 35)
	//*  62   96:iload_2         
	//*  63   97:bipush          32
	//*  64   99:icmple          121
	//*  65  102:iload_2         
	//*  66  103:bipush          47
	//*  67  105:icmpeq          121
	//*  68  108:iload_2         
	//*  69  109:bipush          35
	//*  70  111:icmpeq          121
				{
					_inputPtr = i;
	//   71  114:aload_0         
	//   72  115:iload_1         
	//   73  116:putfield        #61  <Field int _inputPtr>
					return j;
	//   74  119:iload_2         
	//   75  120:ireturn         
				}
			}
			_inputPtr = i - 1;
	//   76  121:aload_0         
	//   77  122:iload_1         
	//   78  123:iconst_1        
	//   79  124:isub            
	//   80  125:putfield        #61  <Field int _inputPtr>
			return _skipColon2(true);
	//   81  128:aload_0         
	//   82  129:iconst_1        
	//   83  130:invokespecial   #329 <Method int _skipColon2(boolean)>
	//   84  133:ireturn         
		}
		int k;
label2:
		{
			if(byte1 != 32)
	//*  85  134:iload           4
	//*  86  136:bipush          32
	//*  87  138:icmpeq          153
			{
				i = l;
	//   88  141:iload_3         
	//   89  142:istore_1        
				k = ((int) (byte1));
	//   90  143:iload           4
	//   91  145:istore_2        
				if(byte1 != 9)
					break label2;
	//   92  146:iload           4
	//   93  148:bipush          9
	//   94  150:icmpne          164
			}
			k = ((int) (_inputBuffer[l]));
	//   95  153:aload_0         
	//   96  154:getfield        #58  <Field byte[] _inputBuffer>
	//   97  157:iload_3         
	//   98  158:baload          
	//   99  159:istore_2        
			i = l + 1;
	//  100  160:iload_3         
	//  101  161:iconst_1        
	//  102  162:iadd            
	//  103  163:istore_1        
		}
label3:
		{
label4:
			{
				if(k != 58)
					break label3;
	//  104  164:iload_2         
	//  105  165:bipush          58
	//  106  167:icmpne          281
				byte abyte1[] = _inputBuffer;
	//  107  170:aload_0         
	//  108  171:getfield        #58  <Field byte[] _inputBuffer>
	//  109  174:astore          5
				k = i + 1;
	//  110  176:iload_1         
	//  111  177:iconst_1        
	//  112  178:iadd            
	//  113  179:istore_2        
				byte byte0 = abyte1[i];
	//  114  180:aload           5
	//  115  182:iload_1         
	//  116  183:baload          
	//  117  184:istore_3        
				if(byte0 > 32)
	//* 118  185:iload_3         
	//* 119  186:bipush          32
	//* 120  188:icmple          214
				{
					i = k;
	//  121  191:iload_2         
	//  122  192:istore_1        
					if(byte0 != 47)
	//* 123  193:iload_3         
	//* 124  194:bipush          47
	//* 125  196:icmpeq          268
					{
						i = k;
	//  126  199:iload_2         
	//  127  200:istore_1        
						if(byte0 != 35)
	//* 128  201:iload_3         
	//* 129  202:bipush          35
	//* 130  204:icmpeq          268
						{
							_inputPtr = k;
	//  131  207:aload_0         
	//  132  208:iload_2         
	//  133  209:putfield        #61  <Field int _inputPtr>
							return ((int) (byte0));
	//  134  212:iload_3         
	//  135  213:ireturn         
						}
					}
					break label4;
				}
				if(byte0 != 32)
	//* 136  214:iload_3         
	//* 137  215:bipush          32
	//* 138  217:icmpeq          228
				{
					i = k;
	//  139  220:iload_2         
	//  140  221:istore_1        
					if(byte0 != 9)
						break label4;
	//  141  222:iload_3         
	//  142  223:bipush          9
	//  143  225:icmpne          268
				}
				abyte1 = _inputBuffer;
	//  144  228:aload_0         
	//  145  229:getfield        #58  <Field byte[] _inputBuffer>
	//  146  232:astore          5
				i = k + 1;
	//  147  234:iload_2         
	//  148  235:iconst_1        
	//  149  236:iadd            
	//  150  237:istore_1        
				k = ((int) (abyte1[k]));
	//  151  238:aload           5
	//  152  240:iload_2         
	//  153  241:baload          
	//  154  242:istore_2        
				if(k > 32 && k != 47 && k != 35)
	//* 155  243:iload_2         
	//* 156  244:bipush          32
	//* 157  246:icmple          268
	//* 158  249:iload_2         
	//* 159  250:bipush          47
	//* 160  252:icmpeq          268
	//* 161  255:iload_2         
	//* 162  256:bipush          35
	//* 163  258:icmpeq          268
				{
					_inputPtr = i;
	//  164  261:aload_0         
	//  165  262:iload_1         
	//  166  263:putfield        #61  <Field int _inputPtr>
					return k;
	//  167  266:iload_2         
	//  168  267:ireturn         
				}
			}
			_inputPtr = i - 1;
	//  169  268:aload_0         
	//  170  269:iload_1         
	//  171  270:iconst_1        
	//  172  271:isub            
	//  173  272:putfield        #61  <Field int _inputPtr>
			return _skipColon2(true);
	//  174  275:aload_0         
	//  175  276:iconst_1        
	//  176  277:invokespecial   #329 <Method int _skipColon2(boolean)>
	//  177  280:ireturn         
		}
		_inputPtr = i - 1;
	//  178  281:aload_0         
	//  179  282:iload_1         
	//  180  283:iconst_1        
	//  181  284:isub            
	//  182  285:putfield        #61  <Field int _inputPtr>
		return _skipColon2(false);
	//  183  288:aload_0         
	//  184  289:iconst_0        
	//  185  290:invokespecial   #329 <Method int _skipColon2(boolean)>
	//  186  293:ireturn         
	}

	private final void _skipComment()
		throws IOException
	{
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #368 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_COMMENTS>
	//*   2    4:invokevirtual   #372 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   3    7:ifne            19
			_reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
	//    4   10:aload_0         
	//    5   11:bipush          47
	//    6   13:ldc2            #374 <String "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)">
	//    7   16:invokevirtual   #358 <Method void _reportUnexpectedChar(int, String)>
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   8   19:aload_0         
	//*   9   20:getfield        #61  <Field int _inputPtr>
	//*  10   23:aload_0         
	//*  11   24:getfield        #64  <Field int _inputEnd>
	//*  12   27:icmplt          45
	//*  13   30:aload_0         
	//*  14   31:invokevirtual   #249 <Method boolean _loadMore()>
	//*  15   34:ifne            45
			_reportInvalidEOF(" in a comment", ((JsonToken) (null)));
	//   16   37:aload_0         
	//   17   38:ldc2            #315 <String " in a comment">
	//   18   41:aconst_null     
	//   19   42:invokevirtual   #319 <Method void _reportInvalidEOF(String, JsonToken)>
		byte abyte0[] = _inputBuffer;
	//   20   45:aload_0         
	//   21   46:getfield        #58  <Field byte[] _inputBuffer>
	//   22   49:astore_2        
		int i = _inputPtr;
	//   23   50:aload_0         
	//   24   51:getfield        #61  <Field int _inputPtr>
	//   25   54:istore_1        
		_inputPtr = i + 1;
	//   26   55:aload_0         
	//   27   56:iload_1         
	//   28   57:iconst_1        
	//   29   58:iadd            
	//   30   59:putfield        #61  <Field int _inputPtr>
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
	//   41   77:invokespecial   #377 <Method void _skipLine()>
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
	//   47   88:invokespecial   #379 <Method void _skipCComment()>
			return;
	//   48   91:return          
		} else
		{
			_reportUnexpectedChar(i, "was expecting either '*' or '/' for a comment");
	//   49   92:aload_0         
	//   50   93:iload_1         
	//   51   94:ldc2            #381 <String "was expecting either '*' or '/' for a comment">
	//   52   97:invokevirtual   #358 <Method void _reportUnexpectedChar(int, String)>
			return;
	//   53  100:return          
		}
	}

	private final void _skipLine()
		throws IOException
	{
		int ai[] = CharTypes.getInputCodeComment();
	//    0    0:invokestatic    #304 <Method int[] CharTypes.getInputCodeComment()>
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
	//*   3    5:getfield        #61  <Field int _inputPtr>
	//*   4    8:aload_0         
	//*   5    9:getfield        #64  <Field int _inputEnd>
	//*   6   12:icmplt          26
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #249 <Method boolean _loadMore()>
	//*   9   19:ifeq            25
	//*  10   22:goto            26
						return;
	//   11   25:return          
					byte abyte0[] = _inputBuffer;
	//   12   26:aload_0         
	//   13   27:getfield        #58  <Field byte[] _inputBuffer>
	//   14   30:astore          4
					i = _inputPtr;
	//   15   32:aload_0         
	//   16   33:getfield        #61  <Field int _inputPtr>
	//   17   36:istore_1        
					_inputPtr = i + 1;
	//   18   37:aload_0         
	//   19   38:iload_1         
	//   20   39:iconst_1        
	//   21   40:iadd            
	//   22   41:putfield        #61  <Field int _inputPtr>
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
	//   50  114:invokevirtual   #155 <Method void _reportInvalidChar(int)>
								break;

	//*  51  117:goto            4
							case 4: // '\004'
								_skipUtf8_4(i);
	//   52  120:aload_0         
	//   53  121:iload_1         
	//   54  122:invokespecial   #307 <Method void _skipUtf8_4(int)>
								break;

	//*  55  125:goto            4
							case 3: // '\003'
								_skipUtf8_3();
	//   56  128:aload_0         
	//   57  129:invokespecial   #310 <Method void _skipUtf8_3()>
								break;

	//*  58  132:goto            4
							case 2: // '\002'
								_skipUtf8_2();
	//   59  135:aload_0         
	//   60  136:invokespecial   #313 <Method void _skipUtf8_2()>
								break;
							}
							continue label0;
	//   61  139:goto            4
						}
					} else
					{
						_skipCR();
	//   62  142:aload_0         
	//   63  143:invokevirtual   #322 <Method void _skipCR()>
						return;
	//   64  146:return          
					}
				} else
				{
					_currInputRow = _currInputRow + 1;
	//   65  147:aload_0         
	//   66  148:aload_0         
	//   67  149:getfield        #325 <Field int _currInputRow>
	//   68  152:iconst_1        
	//   69  153:iadd            
	//   70  154:putfield        #325 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   71  157:aload_0         
	//   72  158:aload_0         
	//   73  159:getfield        #61  <Field int _inputPtr>
	//   74  162:putfield        #67  <Field int _currInputRowStart>
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
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          15
			_loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
		byte abyte0[] = _inputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #58  <Field byte[] _inputBuffer>
	//    9   19:astore_2        
		int i = _inputPtr;
	//   10   20:aload_0         
	//   11   21:getfield        #61  <Field int _inputPtr>
	//   12   24:istore_1        
		_inputPtr = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #61  <Field int _inputPtr>
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
	//   32   54:getfield        #61  <Field int _inputPtr>
	//   33   57:invokevirtual   #106 <Method void _reportInvalidOther(int, int)>
	//   34   60:return          
	}

	private final void _skipUtf8_3()
		throws IOException
	{
		if(_inputPtr >= _inputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          15
			_loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
		byte abyte0[] = _inputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #58  <Field byte[] _inputBuffer>
	//    9   19:astore_2        
		int i = _inputPtr;
	//   10   20:aload_0         
	//   11   21:getfield        #61  <Field int _inputPtr>
	//   12   24:istore_1        
		_inputPtr = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #61  <Field int _inputPtr>
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
	//   32   54:getfield        #61  <Field int _inputPtr>
	//   33   57:invokevirtual   #106 <Method void _reportInvalidOther(int, int)>
		if(_inputPtr >= _inputEnd)
	//*  34   60:aload_0         
	//*  35   61:getfield        #61  <Field int _inputPtr>
	//*  36   64:aload_0         
	//*  37   65:getfield        #64  <Field int _inputEnd>
	//*  38   68:icmplt          75
			_loadMoreGuaranteed();
	//   39   71:aload_0         
	//   40   72:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
		abyte0 = _inputBuffer;
	//   41   75:aload_0         
	//   42   76:getfield        #58  <Field byte[] _inputBuffer>
	//   43   79:astore_2        
		i = _inputPtr;
	//   44   80:aload_0         
	//   45   81:getfield        #61  <Field int _inputPtr>
	//   46   84:istore_1        
		_inputPtr = i + 1;
	//   47   85:aload_0         
	//   48   86:iload_1         
	//   49   87:iconst_1        
	//   50   88:iadd            
	//   51   89:putfield        #61  <Field int _inputPtr>
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
	//   66  114:getfield        #61  <Field int _inputPtr>
	//   67  117:invokevirtual   #106 <Method void _reportInvalidOther(int, int)>
	//   68  120:return          
	}

	private final void _skipUtf8_4(int i)
		throws IOException
	{
		if(_inputPtr >= _inputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          15
			_loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
		byte abyte0[] = _inputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #58  <Field byte[] _inputBuffer>
	//    9   19:astore_2        
		i = _inputPtr;
	//   10   20:aload_0         
	//   11   21:getfield        #61  <Field int _inputPtr>
	//   12   24:istore_1        
		_inputPtr = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #61  <Field int _inputPtr>
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
	//   32   54:getfield        #61  <Field int _inputPtr>
	//   33   57:invokevirtual   #106 <Method void _reportInvalidOther(int, int)>
		if(_inputPtr >= _inputEnd)
	//*  34   60:aload_0         
	//*  35   61:getfield        #61  <Field int _inputPtr>
	//*  36   64:aload_0         
	//*  37   65:getfield        #64  <Field int _inputEnd>
	//*  38   68:icmplt          75
			_loadMoreGuaranteed();
	//   39   71:aload_0         
	//   40   72:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
		abyte0 = _inputBuffer;
	//   41   75:aload_0         
	//   42   76:getfield        #58  <Field byte[] _inputBuffer>
	//   43   79:astore_2        
		i = _inputPtr;
	//   44   80:aload_0         
	//   45   81:getfield        #61  <Field int _inputPtr>
	//   46   84:istore_1        
		_inputPtr = i + 1;
	//   47   85:aload_0         
	//   48   86:iload_1         
	//   49   87:iconst_1        
	//   50   88:iadd            
	//   51   89:putfield        #61  <Field int _inputPtr>
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
	//   66  114:getfield        #61  <Field int _inputPtr>
	//   67  117:invokevirtual   #106 <Method void _reportInvalidOther(int, int)>
		if(_inputPtr >= _inputEnd)
	//*  68  120:aload_0         
	//*  69  121:getfield        #61  <Field int _inputPtr>
	//*  70  124:aload_0         
	//*  71  125:getfield        #64  <Field int _inputEnd>
	//*  72  128:icmplt          135
			_loadMoreGuaranteed();
	//   73  131:aload_0         
	//   74  132:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
		abyte0 = _inputBuffer;
	//   75  135:aload_0         
	//   76  136:getfield        #58  <Field byte[] _inputBuffer>
	//   77  139:astore_2        
		i = _inputPtr;
	//   78  140:aload_0         
	//   79  141:getfield        #61  <Field int _inputPtr>
	//   80  144:istore_1        
		_inputPtr = i + 1;
	//   81  145:aload_0         
	//   82  146:iload_1         
	//   83  147:iconst_1        
	//   84  148:iadd            
	//   85  149:putfield        #61  <Field int _inputPtr>
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
	//  100  174:getfield        #61  <Field int _inputPtr>
	//  101  177:invokevirtual   #106 <Method void _reportInvalidOther(int, int)>
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
	//    1    1:getfield        #61  <Field int _inputPtr>
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field int _inputEnd>
	//    4    8:icmpge          134
			byte abyte0[] = _inputBuffer;
	//    5   11:aload_0         
	//    6   12:getfield        #58  <Field byte[] _inputBuffer>
	//    7   15:astore_2        
			int i = _inputPtr;
	//    8   16:aload_0         
	//    9   17:getfield        #61  <Field int _inputPtr>
	//   10   20:istore_1        
			_inputPtr = i + 1;
	//   11   21:aload_0         
	//   12   22:iload_1         
	//   13   23:iconst_1        
	//   14   24:iadd            
	//   15   25:putfield        #61  <Field int _inputPtr>
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
	//   36   61:getfield        #61  <Field int _inputPtr>
	//   37   64:iconst_1        
	//   38   65:isub            
	//   39   66:putfield        #61  <Field int _inputPtr>
					return _skipWS2();
	//   40   69:aload_0         
	//   41   70:invokespecial   #385 <Method int _skipWS2()>
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
	//   51   88:getfield        #325 <Field int _currInputRow>
	//   52   91:iconst_1        
	//   53   92:iadd            
	//   54   93:putfield        #325 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   55   96:aload_0         
	//   56   97:aload_0         
	//   57   98:getfield        #61  <Field int _inputPtr>
	//   58  101:putfield        #67  <Field int _currInputRowStart>
				} else
	//*  59  104:goto            0
				if(i == 13)
	//*  60  107:iload_1         
	//*  61  108:bipush          13
	//*  62  110:icmpne          120
					_skipCR();
	//   63  113:aload_0         
	//   64  114:invokevirtual   #322 <Method void _skipCR()>
				else
	//*  65  117:goto            0
				if(i != 9)
	//*  66  120:iload_1         
	//*  67  121:bipush          9
	//*  68  123:icmpeq          0
					_throwInvalidSpace(i);
	//   69  126:aload_0         
	//   70  127:iload_1         
	//   71  128:invokevirtual   #361 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   72  131:goto            0
		return _skipWS2();
	//   73  134:aload_0         
	//   74  135:invokespecial   #385 <Method int _skipWS2()>
	//   75  138:ireturn         
	}

	private final int _skipWS2()
		throws IOException
	{
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          66
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #249 <Method boolean _loadMore()>
	//*   7   15:ifeq            21
	//*   8   18:goto            66
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    9   21:new             #331 <Class StringBuilder>
	//   10   24:dup             
	//   11   25:invokespecial   #333 <Method void StringBuilder()>
	//   12   28:astore_2        
				stringbuilder.append("Unexpected end-of-input within/between ");
	//   13   29:aload_2         
	//   14   30:ldc2            #387 <String "Unexpected end-of-input within/between ">
	//   15   33:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   16   36:pop             
				stringbuilder.append(_parsingContext.typeDesc());
	//   17   37:aload_2         
	//   18   38:aload_0         
	//   19   39:getfield        #165 <Field JsonReadContext _parsingContext>
	//   20   42:invokevirtual   #342 <Method String JsonReadContext.typeDesc()>
	//   21   45:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:pop             
				stringbuilder.append(" entries");
	//   23   49:aload_2         
	//   24   50:ldc2            #344 <String " entries">
	//   25   53:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   26   56:pop             
				throw _constructError(stringbuilder.toString());
	//   27   57:aload_0         
	//   28   58:aload_2         
	//   29   59:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   30   62:invokevirtual   #391 <Method JsonParseException _constructError(String)>
	//   31   65:athrow          
			}
			byte abyte0[] = _inputBuffer;
	//   32   66:aload_0         
	//   33   67:getfield        #58  <Field byte[] _inputBuffer>
	//   34   70:astore_2        
			int i = _inputPtr;
	//   35   71:aload_0         
	//   36   72:getfield        #61  <Field int _inputPtr>
	//   37   75:istore_1        
			_inputPtr = i + 1;
	//   38   76:aload_0         
	//   39   77:iload_1         
	//   40   78:iconst_1        
	//   41   79:iadd            
	//   42   80:putfield        #61  <Field int _inputPtr>
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
	//   56  104:invokespecial   #350 <Method void _skipComment()>
				else
	//*  57  107:goto            0
				if(i != 35 || !_skipYAMLComment())
	//*  58  110:iload_1         
	//*  59  111:bipush          35
	//*  60  113:icmpne          126
	//*  61  116:aload_0         
	//*  62  117:invokespecial   #353 <Method boolean _skipYAMLComment()>
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
	//   75  142:getfield        #325 <Field int _currInputRow>
	//   76  145:iconst_1        
	//   77  146:iadd            
	//   78  147:putfield        #325 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   79  150:aload_0         
	//   80  151:aload_0         
	//   81  152:getfield        #61  <Field int _inputPtr>
	//   82  155:putfield        #67  <Field int _currInputRowStart>
				} else
	//*  83  158:goto            0
				if(i == 13)
	//*  84  161:iload_1         
	//*  85  162:bipush          13
	//*  86  164:icmpne          174
					_skipCR();
	//   87  167:aload_0         
	//   88  168:invokevirtual   #322 <Method void _skipCR()>
				else
	//*  89  171:goto            0
				if(i != 9)
	//*  90  174:iload_1         
	//*  91  175:bipush          9
	//*  92  177:icmpeq          0
					_throwInvalidSpace(i);
	//   93  180:aload_0         
	//   94  181:iload_1         
	//   95  182:invokevirtual   #361 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   96  185:goto            0
	}

	private final int _skipWSOrEnd()
		throws IOException
	{
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          23
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #249 <Method boolean _loadMore()>
	//*   7   15:ifne            23
			return _eofAsNextChar();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #395 <Method int _eofAsNextChar()>
	//   10   22:ireturn         
		byte abyte0[] = _inputBuffer;
	//   11   23:aload_0         
	//   12   24:getfield        #58  <Field byte[] _inputBuffer>
	//   13   27:astore_2        
		int i = _inputPtr;
	//   14   28:aload_0         
	//   15   29:getfield        #61  <Field int _inputPtr>
	//   16   32:istore_1        
		_inputPtr = i + 1;
	//   17   33:aload_0         
	//   18   34:iload_1         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:putfield        #61  <Field int _inputPtr>
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
	//   42   73:getfield        #61  <Field int _inputPtr>
	//   43   76:iconst_1        
	//   44   77:isub            
	//   45   78:putfield        #61  <Field int _inputPtr>
				return _skipWSOrEnd2();
	//   46   81:aload_0         
	//   47   82:invokespecial   #398 <Method int _skipWSOrEnd2()>
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
	//   57  100:getfield        #325 <Field int _currInputRow>
	//   58  103:iconst_1        
	//   59  104:iadd            
	//   60  105:putfield        #325 <Field int _currInputRow>
				_currInputRowStart = _inputPtr;
	//   61  108:aload_0         
	//   62  109:aload_0         
	//   63  110:getfield        #61  <Field int _inputPtr>
	//   64  113:putfield        #67  <Field int _currInputRowStart>
			} else
	//*  65  116:goto            143
			if(i == 13)
	//*  66  119:iload_1         
	//*  67  120:bipush          13
	//*  68  122:icmpne          132
				_skipCR();
	//   69  125:aload_0         
	//   70  126:invokevirtual   #322 <Method void _skipCR()>
			else
	//*  71  129:goto            143
			if(i != 9)
	//*  72  132:iload_1         
	//*  73  133:bipush          9
	//*  74  135:icmpeq          143
				_throwInvalidSpace(i);
	//   75  138:aload_0         
	//   76  139:iload_1         
	//   77  140:invokevirtual   #361 <Method void _throwInvalidSpace(int)>
		do
		{
			if(_inputPtr >= _inputEnd)
				break;
	//   78  143:aload_0         
	//   79  144:getfield        #61  <Field int _inputPtr>
	//   80  147:aload_0         
	//   81  148:getfield        #64  <Field int _inputEnd>
	//   82  151:icmpge          277
			byte abyte1[] = _inputBuffer;
	//   83  154:aload_0         
	//   84  155:getfield        #58  <Field byte[] _inputBuffer>
	//   85  158:astore_2        
			int j = _inputPtr;
	//   86  159:aload_0         
	//   87  160:getfield        #61  <Field int _inputPtr>
	//   88  163:istore_1        
			_inputPtr = j + 1;
	//   89  164:aload_0         
	//   90  165:iload_1         
	//   91  166:iconst_1        
	//   92  167:iadd            
	//   93  168:putfield        #61  <Field int _inputPtr>
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
	//  114  204:getfield        #61  <Field int _inputPtr>
	//  115  207:iconst_1        
	//  116  208:isub            
	//  117  209:putfield        #61  <Field int _inputPtr>
					return _skipWSOrEnd2();
	//  118  212:aload_0         
	//  119  213:invokespecial   #398 <Method int _skipWSOrEnd2()>
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
	//  129  231:getfield        #325 <Field int _currInputRow>
	//  130  234:iconst_1        
	//  131  235:iadd            
	//  132  236:putfield        #325 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//  133  239:aload_0         
	//  134  240:aload_0         
	//  135  241:getfield        #61  <Field int _inputPtr>
	//  136  244:putfield        #67  <Field int _currInputRowStart>
				} else
	//* 137  247:goto            143
				if(j == 13)
	//* 138  250:iload_1         
	//* 139  251:bipush          13
	//* 140  253:icmpne          263
					_skipCR();
	//  141  256:aload_0         
	//  142  257:invokevirtual   #322 <Method void _skipCR()>
				else
	//* 143  260:goto            143
				if(j != 9)
	//* 144  263:iload_1         
	//* 145  264:bipush          9
	//* 146  266:icmpeq          143
					_throwInvalidSpace(j);
	//  147  269:aload_0         
	//  148  270:iload_1         
	//  149  271:invokevirtual   #361 <Method void _throwInvalidSpace(int)>
		} while(true);
	//  150  274:goto            143
		return _skipWSOrEnd2();
	//  151  277:aload_0         
	//  152  278:invokespecial   #398 <Method int _skipWSOrEnd2()>
	//  153  281:ireturn         
	}

	private final int _skipWSOrEnd2()
		throws IOException
	{
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          26
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #249 <Method boolean _loadMore()>
	//*   7   15:ifeq            21
	//*   8   18:goto            26
				return _eofAsNextChar();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #395 <Method int _eofAsNextChar()>
	//   11   25:ireturn         
			byte abyte0[] = _inputBuffer;
	//   12   26:aload_0         
	//   13   27:getfield        #58  <Field byte[] _inputBuffer>
	//   14   30:astore_2        
			int i = _inputPtr;
	//   15   31:aload_0         
	//   16   32:getfield        #61  <Field int _inputPtr>
	//   17   35:istore_1        
			_inputPtr = i + 1;
	//   18   36:aload_0         
	//   19   37:iload_1         
	//   20   38:iconst_1        
	//   21   39:iadd            
	//   22   40:putfield        #61  <Field int _inputPtr>
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
	//   36   64:invokespecial   #350 <Method void _skipComment()>
				else
	//*  37   67:goto            0
				if(i != 35 || !_skipYAMLComment())
	//*  38   70:iload_1         
	//*  39   71:bipush          35
	//*  40   73:icmpne          86
	//*  41   76:aload_0         
	//*  42   77:invokespecial   #353 <Method boolean _skipYAMLComment()>
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
	//   55  102:getfield        #325 <Field int _currInputRow>
	//   56  105:iconst_1        
	//   57  106:iadd            
	//   58  107:putfield        #325 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   59  110:aload_0         
	//   60  111:aload_0         
	//   61  112:getfield        #61  <Field int _inputPtr>
	//   62  115:putfield        #67  <Field int _currInputRowStart>
				} else
	//*  63  118:goto            0
				if(i == 13)
	//*  64  121:iload_1         
	//*  65  122:bipush          13
	//*  66  124:icmpne          134
					_skipCR();
	//   67  127:aload_0         
	//   68  128:invokevirtual   #322 <Method void _skipCR()>
				else
	//*  69  131:goto            0
				if(i != 9)
	//*  70  134:iload_1         
	//*  71  135:bipush          9
	//*  72  137:icmpeq          0
					_throwInvalidSpace(i);
	//   73  140:aload_0         
	//   74  141:iload_1         
	//   75  142:invokevirtual   #361 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   76  145:goto            0
	}

	private final boolean _skipYAMLComment()
		throws IOException
	{
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #401 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_YAML_COMMENTS>
	//*   2    4:invokevirtual   #372 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   3    7:ifne            12
		{
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		} else
		{
			_skipLine();
	//    6   12:aload_0         
	//    7   13:invokespecial   #377 <Method void _skipLine()>
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
	//    2    2:getfield        #325 <Field int _currInputRow>
	//    3    5:putfield        #262 <Field int _tokenInputRow>
		int i = _inputPtr;
	//    4    8:aload_0         
	//    5    9:getfield        #61  <Field int _inputPtr>
	//    6   12:istore_1        
		_tokenInputTotal = _currInputProcessed + (long)i;
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #71  <Field long _currInputProcessed>
	//   10   18:iload_1         
	//   11   19:i2l             
	//   12   20:ladd            
	//   13   21:putfield        #404 <Field long _tokenInputTotal>
		_tokenInputCol = i - _currInputRowStart;
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:aload_0         
	//   17   27:getfield        #67  <Field int _currInputRowStart>
	//   18   30:isub            
	//   19   31:putfield        #265 <Field int _tokenInputCol>
	//   20   34:return          
	}

	private final void _updateNameLocation()
	{
		_nameStartRow = _currInputRow;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #325 <Field int _currInputRow>
	//    3    5:putfield        #407 <Field int _nameStartRow>
		int i = _inputPtr;
	//    4    8:aload_0         
	//    5    9:getfield        #61  <Field int _inputPtr>
	//    6   12:istore_1        
		_nameStartOffset = i;
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:putfield        #409 <Field int _nameStartOffset>
		_nameStartCol = i - _currInputRowStart;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:aload_0         
	//   13   21:getfield        #67  <Field int _currInputRowStart>
	//   14   24:isub            
	//   15   25:putfield        #411 <Field int _nameStartCol>
	//   16   28:return          
	}

	private final int _verifyNoLeadingZeroes()
		throws IOException
	{
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          21
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #249 <Method boolean _loadMore()>
	//*   7   15:ifne            21
			return 48;
	//    8   18:bipush          48
	//    9   20:ireturn         
		int i = _inputBuffer[_inputPtr] & 0xff;
	//   10   21:aload_0         
	//   11   22:getfield        #58  <Field byte[] _inputBuffer>
	//   12   25:aload_0         
	//   13   26:getfield        #61  <Field int _inputPtr>
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
	//*  27   51:getstatic       #415 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NUMERIC_LEADING_ZEROS>
	//*  28   54:invokevirtual   #372 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  29   57:ifne            67
				reportInvalidNumber("Leading zeroes not allowed");
	//   30   60:aload_0         
	//   31   61:ldc2            #417 <String "Leading zeroes not allowed">
	//   32   64:invokevirtual   #420 <Method void reportInvalidNumber(String)>
			_inputPtr = _inputPtr + 1;
	//   33   67:aload_0         
	//   34   68:aload_0         
	//   35   69:getfield        #61  <Field int _inputPtr>
	//   36   72:iconst_1        
	//   37   73:iadd            
	//   38   74:putfield        #61  <Field int _inputPtr>
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
	//*  45   86:getfield        #61  <Field int _inputPtr>
	//*  46   89:aload_0         
	//*  47   90:getfield        #64  <Field int _inputEnd>
	//*  48   93:icmplt          105
					{
						j = i;
	//   49   96:iload_1         
	//   50   97:istore_2        
						if(!_loadMore())
							break;
	//   51   98:aload_0         
	//   52   99:invokevirtual   #249 <Method boolean _loadMore()>
	//   53  102:ifeq            157
					}
					j = _inputBuffer[_inputPtr] & 0xff;
	//   54  105:aload_0         
	//   55  106:getfield        #58  <Field byte[] _inputBuffer>
	//   56  109:aload_0         
	//   57  110:getfield        #61  <Field int _inputPtr>
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
	//   72  136:getfield        #61  <Field int _inputPtr>
	//   73  139:iconst_1        
	//   74  140:iadd            
	//   75  141:putfield        #61  <Field int _inputPtr>
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
	//    2    2:getfield        #61  <Field int _inputPtr>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #61  <Field int _inputPtr>
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
	//   16   46:invokevirtual   #423 <Method void _reportMissingRootWS(int)>
					return;
	//   17   49:return          

				case 10: // '\n'
					_currInputRow = _currInputRow + 1;
	//   18   50:aload_0         
	//   19   51:aload_0         
	//   20   52:getfield        #325 <Field int _currInputRow>
	//   21   55:iconst_1        
	//   22   56:iadd            
	//   23   57:putfield        #325 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   24   60:aload_0         
	//   25   61:aload_0         
	//   26   62:getfield        #61  <Field int _inputPtr>
	//   27   65:putfield        #67  <Field int _currInputRowStart>
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
	//   31   71:invokevirtual   #322 <Method void _skipCR()>
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
	//   33   44:getfield        #116 <Field TextBuffer _textBuffer>
	//   34   47:invokevirtual   #430 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//   35   50:astore          12
		int i1 = 0;
	//   36   52:iconst_0        
	//   37   53:istore          5
		int j1;
		int k1;
		for(j1 = 0; i1 < l2; j1 = k1 + 1)
	//*  38   55:iconst_0        
	//*  39   56:istore          6
	//*  40   58:iload           5
	//*  41   60:iload           11
	//*  42   62:icmpge          534
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
			k1 = j1;
	//   67  100:iload           6
	//   68  102:istore          7
			int l = j2;
	//   69  104:iload           10
	//   70  106:istore          4
			if(j2 > 127)
	//*  71  108:iload           10
	//*  72  110:bipush          127
	//*  73  112:icmple          496
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
	//*  85  137:goto            203
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
	//*  97  162:goto            203
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
	//* 109  187:goto            203
				{
					_reportInvalidInitial(j2);
	//  110  190:aload_0         
	//  111  191:iload           10
	//  112  193:invokevirtual   #433 <Method void _reportInvalidInitial(int)>
					l = 1;
	//  113  196:iconst_1        
	//  114  197:istore          4
					i1 = l;
	//  115  199:iload           4
	//  116  201:istore          5
				}
				if(i2 + l > l2)
	//* 117  203:iload           9
	//* 118  205:iload           4
	//* 119  207:iadd            
	//* 120  208:iload           11
	//* 121  210:icmple          223
					_reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
	//  122  213:aload_0         
	//  123  214:ldc2            #435 <String " in field name">
	//  124  217:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//  125  220:invokevirtual   #319 <Method void _reportInvalidEOF(String, JsonToken)>
				k1 = ai[i2 >> 2] >> (3 - (i2 & 3) << 3);
	//  126  223:aload_1         
	//  127  224:iload           9
	//  128  226:iconst_2        
	//  129  227:ishr            
	//  130  228:iaload          
	//  131  229:iconst_3        
	//  132  230:iload           9
	//  133  232:iconst_3        
	//  134  233:iand            
	//  135  234:isub            
	//  136  235:iconst_3        
	//  137  236:ishl            
	//  138  237:ishr            
	//  139  238:istore          7
				i2++;
	//  140  240:iload           9
	//  141  242:iconst_1        
	//  142  243:iadd            
	//  143  244:istore          9
				if((k1 & 0xc0) != 128)
	//* 144  246:iload           7
	//* 145  248:sipush          192
	//* 146  251:iand            
	//* 147  252:sipush          128
	//* 148  255:icmpeq          264
					_reportInvalidOther(k1);
	//  149  258:aload_0         
	//  150  259:iload           7
	//  151  261:invokevirtual   #437 <Method void _reportInvalidOther(int)>
				k1 = k1 & 0x3f | i1 << 6;
	//  152  264:iload           7
	//  153  266:bipush          63
	//  154  268:iand            
	//  155  269:iload           5
	//  156  271:bipush          6
	//  157  273:ishl            
	//  158  274:ior             
	//  159  275:istore          7
				if(l > 1)
	//* 160  277:iload           4
	//* 161  279:iconst_1        
	//* 162  280:icmple          412
				{
					i1 = ai[i2 >> 2] >> (3 - (i2 & 3) << 3);
	//  163  283:aload_1         
	//  164  284:iload           9
	//  165  286:iconst_2        
	//  166  287:ishr            
	//  167  288:iaload          
	//  168  289:iconst_3        
	//  169  290:iload           9
	//  170  292:iconst_3        
	//  171  293:iand            
	//  172  294:isub            
	//  173  295:iconst_3        
	//  174  296:ishl            
	//  175  297:ishr            
	//  176  298:istore          5
					i2++;
	//  177  300:iload           9
	//  178  302:iconst_1        
	//  179  303:iadd            
	//  180  304:istore          9
					if((i1 & 0xc0) != 128)
	//* 181  306:iload           5
	//* 182  308:sipush          192
	//* 183  311:iand            
	//* 184  312:sipush          128
	//* 185  315:icmpeq          324
						_reportInvalidOther(i1);
	//  186  318:aload_0         
	//  187  319:iload           5
	//  188  321:invokevirtual   #437 <Method void _reportInvalidOther(int)>
					int k2 = i1 & 0x3f | k1 << 6;
	//  189  324:iload           5
	//  190  326:bipush          63
	//  191  328:iand            
	//  192  329:iload           7
	//  193  331:bipush          6
	//  194  333:ishl            
	//  195  334:ior             
	//  196  335:istore          10
					k1 = k2;
	//  197  337:iload           10
	//  198  339:istore          7
					i1 = i2;
	//  199  341:iload           9
	//  200  343:istore          5
					if(l > 2)
	//* 201  345:iload           4
	//* 202  347:iconst_2        
	//* 203  348:icmple          416
					{
						k1 = ai[i2 >> 2] >> (3 - (i2 & 3) << 3);
	//  204  351:aload_1         
	//  205  352:iload           9
	//  206  354:iconst_2        
	//  207  355:ishr            
	//  208  356:iaload          
	//  209  357:iconst_3        
	//  210  358:iload           9
	//  211  360:iconst_3        
	//  212  361:iand            
	//  213  362:isub            
	//  214  363:iconst_3        
	//  215  364:ishl            
	//  216  365:ishr            
	//  217  366:istore          7
						i1 = i2 + 1;
	//  218  368:iload           9
	//  219  370:iconst_1        
	//  220  371:iadd            
	//  221  372:istore          5
						if((k1 & 0xc0) != 128)
	//* 222  374:iload           7
	//* 223  376:sipush          192
	//* 224  379:iand            
	//* 225  380:sipush          128
	//* 226  383:icmpeq          396
							_reportInvalidOther(k1 & 0xff);
	//  227  386:aload_0         
	//  228  387:iload           7
	//  229  389:sipush          255
	//  230  392:iand            
	//  231  393:invokevirtual   #437 <Method void _reportInvalidOther(int)>
						k1 = k2 << 6 | k1 & 0x3f;
	//  232  396:iload           10
	//  233  398:bipush          6
	//  234  400:ishl            
	//  235  401:iload           7
	//  236  403:bipush          63
	//  237  405:iand            
	//  238  406:ior             
	//  239  407:istore          7
					}
				} else
	//* 240  409:goto            416
				{
					i1 = i2;
	//  241  412:iload           9
	//  242  414:istore          5
				}
				if(l > 2)
	//* 243  416:iload           4
	//* 244  418:iconst_2        
	//* 245  419:icmple          484
				{
					l = k1 - 0x10000;
	//  246  422:iload           7
	//  247  424:ldc1            #110 <Int 0x10000>
	//  248  426:isub            
	//  249  427:istore          4
					ac1 = ac;
	//  250  429:aload           12
	//  251  431:astore          13
					if(j1 >= ac.length)
	//* 252  433:iload           6
	//* 253  435:aload           12
	//* 254  437:arraylength     
	//* 255  438:icmplt          450
						ac1 = _textBuffer.expandCurrentSegment();
	//  256  441:aload_0         
	//  257  442:getfield        #116 <Field TextBuffer _textBuffer>
	//  258  445:invokevirtual   #440 <Method char[] TextBuffer.expandCurrentSegment()>
	//  259  448:astore          13
					ac1[j1] = (char)(55296 + (l >> 10));
	//  260  450:aload           13
	//  261  452:iload           6
	//  262  454:ldc1            #141 <Int 55296>
	//  263  456:iload           4
	//  264  458:bipush          10
	//  265  460:ishr            
	//  266  461:iadd            
	//  267  462:int2char        
	//  268  463:castore         
					l = 0xdc00 | l & 0x3ff;
	//  269  464:ldc1            #142 <Int 56320>
	//  270  466:iload           4
	//  271  468:sipush          1023
	//  272  471:iand            
	//  273  472:ior             
	//  274  473:istore          4
					k1 = j1 + 1;
	//  275  475:iload           6
	//  276  477:iconst_1        
	//  277  478:iadd            
	//  278  479:istore          7
				} else
	//* 279  481:goto            496
				{
					l = k1;
	//  280  484:iload           7
	//  281  486:istore          4
					k1 = j1;
	//  282  488:iload           6
	//  283  490:istore          7
					ac1 = ac;
	//  284  492:aload           12
	//  285  494:astore          13
				}
			}
			ac = ac1;
	//  286  496:aload           13
	//  287  498:astore          12
			if(k1 >= ac1.length)
	//* 288  500:iload           7
	//* 289  502:aload           13
	//* 290  504:arraylength     
	//* 291  505:icmplt          517
				ac = _textBuffer.expandCurrentSegment();
	//  292  508:aload_0         
	//  293  509:getfield        #116 <Field TextBuffer _textBuffer>
	//  294  512:invokevirtual   #440 <Method char[] TextBuffer.expandCurrentSegment()>
	//  295  515:astore          12
			ac[k1] = (char)l;
	//  296  517:aload           12
	//  297  519:iload           7
	//  298  521:iload           4
	//  299  523:int2char        
	//  300  524:castore         
		}

	//  301  525:iload           7
	//  302  527:iconst_1        
	//  303  528:iadd            
	//  304  529:istore          6
	//* 305  531:goto            58
		String s = new String(ac, 0, j1);
	//  306  534:new             #89  <Class String>
	//  307  537:dup             
	//  308  538:aload           12
	//  309  540:iconst_0        
	//  310  541:iload           6
	//  311  543:invokespecial   #443 <Method void String(char[], int, int)>
	//  312  546:astore          12
		if(j < 4)
	//* 313  548:iload_3         
	//* 314  549:iconst_4        
	//* 315  550:icmpge          560
			ai[i - 1] = l1;
	//  316  553:aload_1         
	//  317  554:iload_2         
	//  318  555:iconst_1        
	//  319  556:isub            
	//  320  557:iload           8
	//  321  559:iastore         
		return _symbols.addName(s, ai, i);
	//  322  560:aload_0         
	//  323  561:getfield        #56  <Field ByteQuadsCanonicalizer _symbols>
	//  324  564:aload           12
	//  325  566:aload_1         
	//  326  567:iload_2         
	//  327  568:invokevirtual   #448 <Method String ByteQuadsCanonicalizer.addName(String, int[], int)>
	//  328  571:areturn         
	}

	private final String findName(int i, int j)
		throws JsonParseException
	{
		i = pad(i, j);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #452 <Method int pad(int, int)>
	//    3    5:istore_1        
		String s = _symbols.findName(i);
	//    4    6:aload_0         
	//    5    7:getfield        #56  <Field ByteQuadsCanonicalizer _symbols>
	//    6   10:iload_1         
	//    7   11:invokevirtual   #454 <Method String ByteQuadsCanonicalizer.findName(int)>
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
			_quadBuffer[0] = i;
	//   13   21:aload_0         
	//   14   22:getfield        #50  <Field int[] _quadBuffer>
	//   15   25:iconst_0        
	//   16   26:iload_1         
	//   17   27:iastore         
			return addName(_quadBuffer, 1, j);
	//   18   28:aload_0         
	//   19   29:aload_0         
	//   20   30:getfield        #50  <Field int[] _quadBuffer>
	//   21   33:iconst_1        
	//   22   34:iload_2         
	//   23   35:invokespecial   #456 <Method String addName(int[], int, int)>
	//   24   38:areturn         
		}
	}

	private final String findName(int i, int j, int k)
		throws JsonParseException
	{
		j = pad(j, k);
	//    0    0:iload_2         
	//    1    1:iload_3         
	//    2    2:invokestatic    #452 <Method int pad(int, int)>
	//    3    5:istore_2        
		String s = _symbols.findName(i, j);
	//    4    6:aload_0         
	//    5    7:getfield        #56  <Field ByteQuadsCanonicalizer _symbols>
	//    6   10:iload_1         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #459 <Method String ByteQuadsCanonicalizer.findName(int, int)>
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
			_quadBuffer[0] = i;
	//   14   25:aload_0         
	//   15   26:getfield        #50  <Field int[] _quadBuffer>
	//   16   29:iconst_0        
	//   17   30:iload_1         
	//   18   31:iastore         
			_quadBuffer[1] = j;
	//   19   32:aload_0         
	//   20   33:getfield        #50  <Field int[] _quadBuffer>
	//   21   36:iconst_1        
	//   22   37:iload_2         
	//   23   38:iastore         
			return addName(_quadBuffer, 2, k);
	//   24   39:aload_0         
	//   25   40:aload_0         
	//   26   41:getfield        #50  <Field int[] _quadBuffer>
	//   27   44:iconst_2        
	//   28   45:iload_3         
	//   29   46:invokespecial   #456 <Method String addName(int[], int, int)>
	//   30   49:areturn         
		}
	}

	private final String findName(int i, int j, int k, int l)
		throws JsonParseException
	{
		k = pad(k, l);
	//    0    0:iload_3         
	//    1    1:iload           4
	//    2    3:invokestatic    #452 <Method int pad(int, int)>
	//    3    6:istore_3        
		String s = _symbols.findName(i, j, k);
	//    4    7:aload_0         
	//    5    8:getfield        #56  <Field ByteQuadsCanonicalizer _symbols>
	//    6   11:iload_1         
	//    7   12:iload_2         
	//    8   13:iload_3         
	//    9   14:invokevirtual   #462 <Method String ByteQuadsCanonicalizer.findName(int, int, int)>
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
	//   16   28:getfield        #50  <Field int[] _quadBuffer>
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
			ai[2] = pad(k, l);
	//   26   43:aload           5
	//   27   45:iconst_2        
	//   28   46:iload_3         
	//   29   47:iload           4
	//   30   49:invokestatic    #452 <Method int pad(int, int)>
	//   31   52:iastore         
			return addName(ai, 3, l);
	//   32   53:aload_0         
	//   33   54:aload           5
	//   34   56:iconst_3        
	//   35   57:iload           4
	//   36   59:invokespecial   #456 <Method String addName(int[], int, int)>
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
	//    9   12:invokestatic    #467 <Method int[] growArrayBy(int[], int)>
	//   10   15:astore          6
			_quadBuffer = ai1;
	//   11   17:aload_0         
	//   12   18:aload           6
	//   13   20:putfield        #50  <Field int[] _quadBuffer>
		}
		int l = i + 1;
	//   14   23:iload_2         
	//   15   24:iconst_1        
	//   16   25:iadd            
	//   17   26:istore          5
		ai1[i] = pad(j, k);
	//   18   28:aload           6
	//   19   30:iload_2         
	//   20   31:iload_3         
	//   21   32:iload           4
	//   22   34:invokestatic    #452 <Method int pad(int, int)>
	//   23   37:iastore         
		ai = ((int []) (_symbols.findName(ai1, l)));
	//   24   38:aload_0         
	//   25   39:getfield        #56  <Field ByteQuadsCanonicalizer _symbols>
	//   26   42:aload           6
	//   27   44:iload           5
	//   28   46:invokevirtual   #470 <Method String ByteQuadsCanonicalizer.findName(int[], int)>
	//   29   49:astore_1        
		if(ai == null)
	//*  30   50:aload_1         
	//*  31   51:ifnonnull       65
			return addName(ai1, l, k);
	//   32   54:aload_0         
	//   33   55:aload           6
	//   34   57:iload           5
	//   35   59:iload           4
	//   36   61:invokespecial   #456 <Method String addName(int[], int, int)>
	//   37   64:areturn         
		else
			return ((String) (ai));
	//   38   65:aload_1         
	//   39   66:areturn         
	}

	public static int[] growArrayBy(int ai[], int i)
	{
		if(ai == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return new int[i];
	//    2    4:iload_1         
	//    3    5:newarray        int[]
	//    4    7:areturn         
		else
			return Arrays.copyOf(ai, ai.length + i);
	//    5    8:aload_0         
	//    6    9:aload_0         
	//    7   10:arraylength     
	//    8   11:iload_1         
	//    9   12:iadd            
	//   10   13:invokestatic    #475 <Method int[] Arrays.copyOf(int[], int)>
	//   11   16:areturn         
	}

	private int nextByte()
		throws IOException
	{
		if(_inputPtr >= _inputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          15
			_loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
		byte abyte0[] = _inputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #58  <Field byte[] _inputBuffer>
	//    9   19:astore_2        
		int i = _inputPtr;
	//   10   20:aload_0         
	//   11   21:getfield        #61  <Field int _inputPtr>
	//   12   24:istore_1        
		_inputPtr = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #61  <Field int _inputPtr>
		return abyte0[i] & 0xff;
	//   18   32:aload_2         
	//   19   33:iload_1         
	//   20   34:baload          
	//   21   35:sipush          255
	//   22   38:iand            
	//   23   39:ireturn         
	}

	private static final int pad(int i, int j)
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

	private final String parseName(int i, int j, int k)
		throws IOException
	{
		return parseEscapedName(_quadBuffer, 0, i, j, k);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #50  <Field int[] _quadBuffer>
	//    3    5:iconst_0        
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:invokevirtual   #481 <Method String parseEscapedName(int[], int, int, int, int)>
	//    8   12:areturn         
	}

	private final String parseName(int i, int j, int k, int l)
		throws IOException
	{
		_quadBuffer[0] = i;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int[] _quadBuffer>
	//    2    4:iconst_0        
	//    3    5:iload_1         
	//    4    6:iastore         
		return parseEscapedName(_quadBuffer, 1, j, k, l);
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #50  <Field int[] _quadBuffer>
	//    8   12:iconst_1        
	//    9   13:iload_2         
	//   10   14:iload_3         
	//   11   15:iload           4
	//   12   17:invokevirtual   #481 <Method String parseEscapedName(int[], int, int, int, int)>
	//   13   20:areturn         
	}

	private final String parseName(int i, int j, int k, int l, int i1)
		throws IOException
	{
		_quadBuffer[0] = i;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int[] _quadBuffer>
	//    2    4:iconst_0        
	//    3    5:iload_1         
	//    4    6:iastore         
		_quadBuffer[1] = j;
	//    5    7:aload_0         
	//    6    8:getfield        #50  <Field int[] _quadBuffer>
	//    7   11:iconst_1        
	//    8   12:iload_2         
	//    9   13:iastore         
		return parseEscapedName(_quadBuffer, 2, k, l, i1);
	//   10   14:aload_0         
	//   11   15:aload_0         
	//   12   16:getfield        #50  <Field int[] _quadBuffer>
	//   13   19:iconst_2        
	//   14   20:iload_3         
	//   15   21:iload           4
	//   16   23:iload           5
	//   17   25:invokevirtual   #481 <Method String parseEscapedName(int[], int, int, int, int)>
	//   18   28:areturn         
	}

	protected void _closeInput()
		throws IOException
	{
		if(_inputStream != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field InputStream _inputStream>
	//*   2    4:ifnull          39
		{
			if(_ioContext.isResourceManaged() || isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE))
	//*   3    7:aload_0         
	//*   4    8:getfield        #487 <Field IOContext _ioContext>
	//*   5   11:invokevirtual   #492 <Method boolean IOContext.isResourceManaged()>
	//*   6   14:ifne            27
	//*   7   17:aload_0         
	//*   8   18:getstatic       #495 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.AUTO_CLOSE_SOURCE>
	//*   9   21:invokevirtual   #372 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  10   24:ifeq            34
				_inputStream.close();
	//   11   27:aload_0         
	//   12   28:getfield        #52  <Field InputStream _inputStream>
	//   13   31:invokevirtual   #500 <Method void InputStream.close()>
			_inputStream = null;
	//   14   34:aload_0         
	//   15   35:aconst_null     
	//   16   36:putfield        #52  <Field InputStream _inputStream>
		}
	//   17   39:return          
	}

	protected final byte[] _decodeBase64(Base64Variant base64variant)
		throws IOException
	{
		Object obj = ((Object) (_getByteArrayBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #506 <Method ByteArrayBuilder _getByteArrayBuilder()>
	//    2    4:astore          7
		do
		{
			int i1;
			do
			{
				if(_inputPtr >= _inputEnd)
	//*   3    6:aload_0         
	//*   4    7:getfield        #61  <Field int _inputPtr>
	//*   5   10:aload_0         
	//*   6   11:getfield        #64  <Field int _inputEnd>
	//*   7   14:icmplt          21
					_loadMoreGuaranteed();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
				byte abyte0[] = _inputBuffer;
	//   10   21:aload_0         
	//   11   22:getfield        #58  <Field byte[] _inputBuffer>
	//   12   25:astore          8
				int i = _inputPtr;
	//   13   27:aload_0         
	//   14   28:getfield        #61  <Field int _inputPtr>
	//   15   31:istore_2        
				_inputPtr = i + 1;
	//   16   32:aload_0         
	//   17   33:iload_2         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:putfield        #61  <Field int _inputPtr>
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
	//   32   59:invokevirtual   #511 <Method int Base64Variant.decodeBase64Char(int)>
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
	//   42   78:invokevirtual   #517 <Method byte[] ByteArrayBuilder.toByteArray()>
	//   43   81:areturn         
				l = _decodeBase64Escape(base64variant, i1, 0);
	//   44   82:aload_0         
	//   45   83:aload_1         
	//   46   84:iload           4
	//   47   86:iconst_0        
	//   48   87:invokevirtual   #521 <Method int _decodeBase64Escape(Base64Variant, int, int)>
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
	//*  56  101:getfield        #61  <Field int _inputPtr>
	//*  57  104:aload_0         
	//*  58  105:getfield        #64  <Field int _inputEnd>
	//*  59  108:icmplt          115
				_loadMoreGuaranteed();
	//   60  111:aload_0         
	//   61  112:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
			byte abyte1[] = _inputBuffer;
	//   62  115:aload_0         
	//   63  116:getfield        #58  <Field byte[] _inputBuffer>
	//   64  119:astore          8
			l = _inputPtr;
	//   65  121:aload_0         
	//   66  122:getfield        #61  <Field int _inputPtr>
	//   67  125:istore_3        
			_inputPtr = l + 1;
	//   68  126:aload_0         
	//   69  127:iload_3         
	//   70  128:iconst_1        
	//   71  129:iadd            
	//   72  130:putfield        #61  <Field int _inputPtr>
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
	//   81  146:invokevirtual   #511 <Method int Base64Variant.decodeBase64Char(int)>
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
	//   91  164:invokevirtual   #521 <Method int _decodeBase64Escape(Base64Variant, int, int)>
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
	//* 100  177:getfield        #61  <Field int _inputPtr>
	//* 101  180:aload_0         
	//* 102  181:getfield        #64  <Field int _inputEnd>
	//* 103  184:icmplt          191
				_loadMoreGuaranteed();
	//  104  187:aload_0         
	//  105  188:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
			abyte1 = _inputBuffer;
	//  106  191:aload_0         
	//  107  192:getfield        #58  <Field byte[] _inputBuffer>
	//  108  195:astore          8
			j = _inputPtr;
	//  109  197:aload_0         
	//  110  198:getfield        #61  <Field int _inputPtr>
	//  111  201:istore_2        
			_inputPtr = j + 1;
	//  112  202:aload_0         
	//  113  203:iload_2         
	//  114  204:iconst_1        
	//  115  205:iadd            
	//  116  206:putfield        #61  <Field int _inputPtr>
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
	//  125  222:invokevirtual   #511 <Method int Base64Variant.decodeBase64Char(int)>
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
	//* 140  249:invokevirtual   #524 <Method boolean Base64Variant.usesPadding()>
	//* 141  252:ifne            270
					{
						((ByteArrayBuilder) (obj)).append(j1 >> 4);
	//  142  255:aload           7
	//  143  257:iload           5
	//  144  259:iconst_4        
	//  145  260:ishr            
	//  146  261:invokevirtual   #526 <Method void ByteArrayBuilder.append(int)>
						return ((ByteArrayBuilder) (obj)).toByteArray();
	//  147  264:aload           7
	//  148  266:invokevirtual   #517 <Method byte[] ByteArrayBuilder.toByteArray()>
	//  149  269:areturn         
					}
					j = _decodeBase64Escape(base64variant, k1, 2);
	//  150  270:aload_0         
	//  151  271:aload_1         
	//  152  272:iload           6
	//  153  274:iconst_2        
	//  154  275:invokevirtual   #521 <Method int _decodeBase64Escape(Base64Variant, int, int)>
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
	//* 162  289:getfield        #61  <Field int _inputPtr>
	//* 163  292:aload_0         
	//* 164  293:getfield        #64  <Field int _inputEnd>
	//* 165  296:icmplt          303
						_loadMoreGuaranteed();
	//  166  299:aload_0         
	//  167  300:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
					abyte1 = _inputBuffer;
	//  168  303:aload_0         
	//  169  304:getfield        #58  <Field byte[] _inputBuffer>
	//  170  307:astore          8
					j = _inputPtr;
	//  171  309:aload_0         
	//  172  310:getfield        #61  <Field int _inputPtr>
	//  173  313:istore_2        
					_inputPtr = j + 1;
	//  174  314:aload_0         
	//  175  315:iload_2         
	//  176  316:iconst_1        
	//  177  317:iadd            
	//  178  318:putfield        #61  <Field int _inputPtr>
					j = abyte1[j] & 0xff;
	//  179  321:aload           8
	//  180  323:iload_2         
	//  181  324:baload          
	//  182  325:sipush          255
	//  183  328:iand            
	//  184  329:istore_2        
					if(!base64variant.usesPaddingChar(j))
	//* 185  330:aload_1         
	//* 186  331:iload_2         
	//* 187  332:invokevirtual   #530 <Method boolean Base64Variant.usesPaddingChar(int)>
	//* 188  335:ifne            388
					{
						obj = ((Object) (new StringBuilder()));
	//  189  338:new             #331 <Class StringBuilder>
	//  190  341:dup             
	//  191  342:invokespecial   #333 <Method void StringBuilder()>
	//  192  345:astore          7
						((StringBuilder) (obj)).append("expected padding character '");
	//  193  347:aload           7
	//  194  349:ldc2            #532 <String "expected padding character '">
	//  195  352:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//  196  355:pop             
						((StringBuilder) (obj)).append(base64variant.getPaddingChar());
	//  197  356:aload           7
	//  198  358:aload_1         
	//  199  359:invokevirtual   #535 <Method char Base64Variant.getPaddingChar()>
	//  200  362:invokevirtual   #538 <Method StringBuilder StringBuilder.append(char)>
	//  201  365:pop             
						((StringBuilder) (obj)).append("'");
	//  202  366:aload           7
	//  203  368:ldc2            #540 <String "'">
	//  204  371:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//  205  374:pop             
						throw reportInvalidBase64Char(base64variant, j, 3, ((StringBuilder) (obj)).toString());
	//  206  375:aload_0         
	//  207  376:aload_1         
	//  208  377:iload_2         
	//  209  378:iconst_3        
	//  210  379:aload           7
	//  211  381:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  212  384:invokevirtual   #544 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int, String)>
	//  213  387:athrow          
					}
					((ByteArrayBuilder) (obj)).append(j1 >> 4);
	//  214  388:aload           7
	//  215  390:iload           5
	//  216  392:iconst_4        
	//  217  393:ishr            
	//  218  394:invokevirtual   #526 <Method void ByteArrayBuilder.append(int)>
					continue;
	//  219  397:goto            6
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
	//* 227  411:getfield        #61  <Field int _inputPtr>
	//* 228  414:aload_0         
	//* 229  415:getfield        #64  <Field int _inputEnd>
	//* 230  418:icmplt          425
				_loadMoreGuaranteed();
	//  231  421:aload_0         
	//  232  422:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
			abyte1 = _inputBuffer;
	//  233  425:aload_0         
	//  234  426:getfield        #58  <Field byte[] _inputBuffer>
	//  235  429:astore          8
			j = _inputPtr;
	//  236  431:aload_0         
	//  237  432:getfield        #61  <Field int _inputPtr>
	//  238  435:istore_2        
			_inputPtr = j + 1;
	//  239  436:aload_0         
	//  240  437:iload_2         
	//  241  438:iconst_1        
	//  242  439:iadd            
	//  243  440:putfield        #61  <Field int _inputPtr>
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
	//  252  456:invokevirtual   #511 <Method int Base64Variant.decodeBase64Char(int)>
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
	//* 267  483:invokevirtual   #524 <Method boolean Base64Variant.usesPadding()>
	//* 268  486:ifne            504
					{
						((ByteArrayBuilder) (obj)).appendTwoBytes(j1 >> 2);
	//  269  489:aload           7
	//  270  491:iload           5
	//  271  493:iconst_2        
	//  272  494:ishr            
	//  273  495:invokevirtual   #547 <Method void ByteArrayBuilder.appendTwoBytes(int)>
						return ((ByteArrayBuilder) (obj)).toByteArray();
	//  274  498:aload           7
	//  275  500:invokevirtual   #517 <Method byte[] ByteArrayBuilder.toByteArray()>
	//  276  503:areturn         
					}
					k = _decodeBase64Escape(base64variant, k1, 3);
	//  277  504:aload_0         
	//  278  505:aload_1         
	//  279  506:iload           6
	//  280  508:iconst_3        
	//  281  509:invokevirtual   #521 <Method int _decodeBase64Escape(Base64Variant, int, int)>
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
	//  292  528:invokevirtual   #547 <Method void ByteArrayBuilder.appendTwoBytes(int)>
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
	//  300  544:invokevirtual   #550 <Method void ByteArrayBuilder.appendThreeBytes(int)>
		} while(true);
	//  301  547:goto            6
	}

	protected int _decodeCharForError(int i)
		throws IOException
	{
		int j;
		j = i & 0xff;
	//    0    0:iload_1         
	//    1    1:sipush          255
	//    2    4:iand            
	//    3    5:istore_2        
		i = j;
	//    4    6:iload_2         
	//    5    7:istore_1        
		if(j <= 127)
			break MISSING_BLOCK_LABEL_210;
	//    6    8:iload_2         
	//    7    9:bipush          127
	//    8   11:icmple          210
		if((j & 0xe0) != 192) goto _L2; else goto _L1
	//    9   14:iload_2         
	//   10   15:sipush          224
	//   11   18:iand            
	//   12   19:sipush          192
	//   13   22:icmpne          35
_L1:
		i = j & 0x1f;
	//   14   25:iload_2         
	//   15   26:bipush          31
	//   16   28:iand            
	//   17   29:istore_1        
_L4:
		j = 1;
	//   18   30:iconst_1        
	//   19   31:istore_2        
		break; /* Loop/switch isn't completed */
	//   20   32:goto            91
_L2:
		if((j & 0xf0) == 224)
	//*  21   35:iload_2         
	//*  22   36:sipush          240
	//*  23   39:iand            
	//*  24   40:sipush          224
	//*  25   43:icmpne          56
		{
			i = j & 0xf;
	//   26   46:iload_2         
	//   27   47:bipush          15
	//   28   49:iand            
	//   29   50:istore_1        
			j = 2;
	//   30   51:iconst_2        
	//   31   52:istore_2        
			break; /* Loop/switch isn't completed */
	//   32   53:goto            91
		}
		if((j & 0xf8) == 240)
	//*  33   56:iload_2         
	//*  34   57:sipush          248
	//*  35   60:iand            
	//*  36   61:sipush          240
	//*  37   64:icmpne          77
		{
			i = j & 7;
	//   38   67:iload_2         
	//   39   68:bipush          7
	//   40   70:iand            
	//   41   71:istore_1        
			j = 3;
	//   42   72:iconst_3        
	//   43   73:istore_2        
			break; /* Loop/switch isn't completed */
	//   44   74:goto            91
		}
		_reportInvalidInitial(j & 0xff);
	//   45   77:aload_0         
	//   46   78:iload_2         
	//   47   79:sipush          255
	//   48   82:iand            
	//   49   83:invokevirtual   #433 <Method void _reportInvalidInitial(int)>
		i = j;
	//   50   86:iload_2         
	//   51   87:istore_1        
		if(true) goto _L4; else goto _L3
	//   52   88:goto            30
_L3:
		int k = nextByte();
	//   53   91:aload_0         
	//   54   92:invokespecial   #552 <Method int nextByte()>
	//   55   95:istore_3        
		if((k & 0xc0) != 128)
	//*  56   96:iload_3         
	//*  57   97:sipush          192
	//*  58  100:iand            
	//*  59  101:sipush          128
	//*  60  104:icmpeq          116
			_reportInvalidOther(k & 0xff);
	//   61  107:aload_0         
	//   62  108:iload_3         
	//   63  109:sipush          255
	//   64  112:iand            
	//   65  113:invokevirtual   #437 <Method void _reportInvalidOther(int)>
		k = i << 6 | k & 0x3f;
	//   66  116:iload_1         
	//   67  117:bipush          6
	//   68  119:ishl            
	//   69  120:iload_3         
	//   70  121:bipush          63
	//   71  123:iand            
	//   72  124:ior             
	//   73  125:istore_3        
		i = k;
	//   74  126:iload_3         
	//   75  127:istore_1        
		if(j > 1)
	//*  76  128:iload_2         
	//*  77  129:iconst_1        
	//*  78  130:icmple          210
		{
			i = nextByte();
	//   79  133:aload_0         
	//   80  134:invokespecial   #552 <Method int nextByte()>
	//   81  137:istore_1        
			if((i & 0xc0) != 128)
	//*  82  138:iload_1         
	//*  83  139:sipush          192
	//*  84  142:iand            
	//*  85  143:sipush          128
	//*  86  146:icmpeq          158
				_reportInvalidOther(i & 0xff);
	//   87  149:aload_0         
	//   88  150:iload_1         
	//   89  151:sipush          255
	//   90  154:iand            
	//   91  155:invokevirtual   #437 <Method void _reportInvalidOther(int)>
			k = k << 6 | i & 0x3f;
	//   92  158:iload_3         
	//   93  159:bipush          6
	//   94  161:ishl            
	//   95  162:iload_1         
	//   96  163:bipush          63
	//   97  165:iand            
	//   98  166:ior             
	//   99  167:istore_3        
			i = k;
	//  100  168:iload_3         
	//  101  169:istore_1        
			if(j > 2)
	//* 102  170:iload_2         
	//* 103  171:iconst_2        
	//* 104  172:icmple          210
			{
				i = nextByte();
	//  105  175:aload_0         
	//  106  176:invokespecial   #552 <Method int nextByte()>
	//  107  179:istore_1        
				if((i & 0xc0) != 128)
	//* 108  180:iload_1         
	//* 109  181:sipush          192
	//* 110  184:iand            
	//* 111  185:sipush          128
	//* 112  188:icmpeq          200
					_reportInvalidOther(i & 0xff);
	//  113  191:aload_0         
	//  114  192:iload_1         
	//  115  193:sipush          255
	//  116  196:iand            
	//  117  197:invokevirtual   #437 <Method void _reportInvalidOther(int)>
				i = k << 6 | i & 0x3f;
	//  118  200:iload_3         
	//  119  201:bipush          6
	//  120  203:ishl            
	//  121  204:iload_1         
	//  122  205:bipush          63
	//  123  207:iand            
	//  124  208:ior             
	//  125  209:istore_1        
			}
		}
		return i;
	//  126  210:iload_1         
	//  127  211:ireturn         
	}

	protected char _decodeEscaped()
		throws IOException
	{
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          28
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #249 <Method boolean _loadMore()>
	//*   7   15:ifne            28
			_reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
	//    8   18:aload_0         
	//    9   19:ldc2            #554 <String " in character escape sequence">
	//   10   22:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//   11   25:invokevirtual   #319 <Method void _reportInvalidEOF(String, JsonToken)>
		byte abyte0[] = _inputBuffer;
	//   12   28:aload_0         
	//   13   29:getfield        #58  <Field byte[] _inputBuffer>
	//   14   32:astore          5
		int i = _inputPtr;
	//   15   34:aload_0         
	//   16   35:getfield        #61  <Field int _inputPtr>
	//   17   38:istore_1        
		_inputPtr = i + 1;
	//   18   39:aload_0         
	//   19   40:iload_1         
	//   20   41:iconst_1        
	//   21   42:iadd            
	//   22   43:putfield        #61  <Field int _inputPtr>
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
	//   53  119:invokevirtual   #81  <Method int _decodeCharForError(int)>
	//   54  122:int2char        
	//   55  123:invokevirtual   #558 <Method char _handleUnrecognizedCharacterEscape(char)>
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
	//*  65  137:getfield        #61  <Field int _inputPtr>
	//*  66  140:aload_0         
	//*  67  141:getfield        #64  <Field int _inputEnd>
	//*  68  144:icmplt          164
	//*  69  147:aload_0         
	//*  70  148:invokevirtual   #249 <Method boolean _loadMore()>
	//*  71  151:ifne            164
										_reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
	//   72  154:aload_0         
	//   73  155:ldc2            #554 <String " in character escape sequence">
	//   74  158:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//   75  161:invokevirtual   #319 <Method void _reportInvalidEOF(String, JsonToken)>
									byte abyte1[] = _inputBuffer;
	//   76  164:aload_0         
	//   77  165:getfield        #58  <Field byte[] _inputBuffer>
	//   78  168:astore          5
									int k = _inputPtr;
	//   79  170:aload_0         
	//   80  171:getfield        #61  <Field int _inputPtr>
	//   81  174:istore_3        
									_inputPtr = k + 1;
	//   82  175:aload_0         
	//   83  176:iload_3         
	//   84  177:iconst_1        
	//   85  178:iadd            
	//   86  179:putfield        #61  <Field int _inputPtr>
									k = ((int) (abyte1[k]));
	//   87  182:aload           5
	//   88  184:iload_3         
	//   89  185:baload          
	//   90  186:istore_3        
									int l = CharTypes.charToHex(k);
	//   91  187:iload_3         
	//   92  188:invokestatic    #561 <Method int CharTypes.charToHex(int)>
	//   93  191:istore          4
									if(l < 0)
	//*  94  193:iload           4
	//*  95  195:ifge            206
										_reportUnexpectedChar(k, "expected a hex-digit for character escape sequence");
	//   96  198:aload_0         
	//   97  199:iload_3         
	//   98  200:ldc2            #563 <String "expected a hex-digit for character escape sequence">
	//   99  203:invokevirtual   #358 <Method void _reportUnexpectedChar(int, String)>
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
	//    1    1:getfield        #61  <Field int _inputPtr>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j >= _inputEnd)
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:getfield        #64  <Field int _inputEnd>
	//*   8   12:icmplt          24
		{
			_loadMoreGuaranteed();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
			i = _inputPtr;
	//   11   19:aload_0         
	//   12   20:getfield        #61  <Field int _inputPtr>
	//   13   23:istore_1        
		}
		j = 0;
	//   14   24:iconst_0        
	//   15   25:istore_2        
		char ac[] = _textBuffer.emptyAndGetCurrentSegment();
	//   16   26:aload_0         
	//   17   27:getfield        #116 <Field TextBuffer _textBuffer>
	//   18   30:invokevirtual   #430 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//   19   33:astore          5
		int ai[] = _icUTF8;
	//   20   35:getstatic       #37  <Field int[] _icUTF8>
	//   21   38:astore          6
		int k = Math.min(_inputEnd, ac.length + i);
	//   22   40:aload_0         
	//   23   41:getfield        #64  <Field int _inputEnd>
	//   24   44:aload           5
	//   25   46:arraylength     
	//   26   47:iload_1         
	//   27   48:iadd            
	//   28   49:invokestatic    #128 <Method int Math.min(int, int)>
	//   29   52:istore_3        
		byte abyte0[] = _inputBuffer;
	//   30   53:aload_0         
	//   31   54:getfield        #58  <Field byte[] _inputBuffer>
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
	//   53   93:putfield        #61  <Field int _inputPtr>
					return _textBuffer.setCurrentAndReturn(j);
	//   54   96:aload_0         
	//   55   97:getfield        #116 <Field TextBuffer _textBuffer>
	//   56  100:iload_2         
	//   57  101:invokevirtual   #567 <Method String TextBuffer.setCurrentAndReturn(int)>
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
	//   75  125:putfield        #61  <Field int _inputPtr>
		_finishString2(ac, j);
	//   76  128:aload_0         
	//   77  129:aload           5
	//   78  131:iload_2         
	//   79  132:invokespecial   #569 <Method void _finishString2(char[], int)>
		return _textBuffer.contentsAsString();
	//   80  135:aload_0         
	//   81  136:getfield        #116 <Field TextBuffer _textBuffer>
	//   82  139:invokevirtual   #572 <Method String TextBuffer.contentsAsString()>
	//   83  142:areturn         
	}

	protected void _finishString()
		throws IOException
	{
		int j = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int _inputPtr>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j >= _inputEnd)
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:getfield        #64  <Field int _inputEnd>
	//*   8   12:icmplt          24
		{
			_loadMoreGuaranteed();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
			i = _inputPtr;
	//   11   19:aload_0         
	//   12   20:getfield        #61  <Field int _inputPtr>
	//   13   23:istore_1        
		}
		j = 0;
	//   14   24:iconst_0        
	//   15   25:istore_2        
		char ac[] = _textBuffer.emptyAndGetCurrentSegment();
	//   16   26:aload_0         
	//   17   27:getfield        #116 <Field TextBuffer _textBuffer>
	//   18   30:invokevirtual   #430 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//   19   33:astore          5
		int ai[] = _icUTF8;
	//   20   35:getstatic       #37  <Field int[] _icUTF8>
	//   21   38:astore          6
		int k = Math.min(_inputEnd, ac.length + i);
	//   22   40:aload_0         
	//   23   41:getfield        #64  <Field int _inputEnd>
	//   24   44:aload           5
	//   25   46:arraylength     
	//   26   47:iload_1         
	//   27   48:iadd            
	//   28   49:invokestatic    #128 <Method int Math.min(int, int)>
	//   29   52:istore_3        
		byte abyte0[] = _inputBuffer;
	//   30   53:aload_0         
	//   31   54:getfield        #58  <Field byte[] _inputBuffer>
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
	//   53   93:putfield        #61  <Field int _inputPtr>
					_textBuffer.setCurrentLength(j);
	//   54   96:aload_0         
	//   55   97:getfield        #116 <Field TextBuffer _textBuffer>
	//   56  100:iload_2         
	//   57  101:invokevirtual   #132 <Method void TextBuffer.setCurrentLength(int)>
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
	//   75  125:putfield        #61  <Field int _inputPtr>
		_finishString2(ac, j);
	//   76  128:aload_0         
	//   77  129:aload           5
	//   78  131:iload_2         
	//   79  132:invokespecial   #569 <Method void _finishString2(char[], int)>
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
	//*   5    7:invokevirtual   #578 <Method int JsonToken.id()>
		{
	//*   6   10:tableswitch     5 8: default 40
	//	               5 53
	//	               6 45
	//	               7 45
	//	               8 45
		default:
			return jsontoken.asString();
	//    7   40:aload_1         
	//    8   41:invokevirtual   #581 <Method String JsonToken.asString()>
	//    9   44:areturn         

		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
			return _textBuffer.contentsAsString();
	//   10   45:aload_0         
	//   11   46:getfield        #116 <Field TextBuffer _textBuffer>
	//   12   49:invokevirtual   #572 <Method String TextBuffer.contentsAsString()>
	//   13   52:areturn         

		case 5: // '\005'
			return _parsingContext.getCurrentName();
	//   14   53:aload_0         
	//   15   54:getfield        #165 <Field JsonReadContext _parsingContext>
	//   16   57:invokevirtual   #584 <Method String JsonReadContext.getCurrentName()>
	//   17   60:areturn         
		}
	}

	protected JsonToken _handleApos()
		throws IOException
	{
		char ac1[] = _textBuffer.emptyAndGetCurrentSegment();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #430 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//    3    7:astore          7
		int ai[] = _icUTF8;
	//    4    9:getstatic       #37  <Field int[] _icUTF8>
	//    5   12:astore          8
		byte abyte0[] = _inputBuffer;
	//    6   14:aload_0         
	//    7   15:getfield        #58  <Field byte[] _inputBuffer>
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
	//*  12   23:getfield        #61  <Field int _inputPtr>
	//*  13   26:aload_0         
	//*  14   27:getfield        #64  <Field int _inputEnd>
	//*  15   30:icmplt          37
					_loadMoreGuaranteed();
	//   16   33:aload_0         
	//   17   34:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
				int k = i;
	//   18   37:iload_1         
	//   19   38:istore_3        
				ac = ac1;
	//   20   39:aload           7
	//   21   41:astore          6
				if(i >= ac1.length)
	//*  22   43:iload_1         
	//*  23   44:aload           7
	//*  24   46:arraylength     
	//*  25   47:icmplt          61
				{
					ac = _textBuffer.finishCurrentSegment();
	//   26   50:aload_0         
	//   27   51:getfield        #116 <Field TextBuffer _textBuffer>
	//   28   54:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
	//   29   57:astore          6
					k = 0;
	//   30   59:iconst_0        
	//   31   60:istore_3        
				}
				i = _inputEnd;
	//   32   61:aload_0         
	//   33   62:getfield        #64  <Field int _inputEnd>
	//   34   65:istore_1        
				int l1 = _inputPtr + (ac.length - k);
	//   35   66:aload_0         
	//   36   67:getfield        #61  <Field int _inputPtr>
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
					i = j;
	//   54   95:iload_2         
	//   55   96:istore_1        
					ac1 = ac;
	//   56   97:aload           6
	//   57   99:astore          7
					if(_inputPtr >= j1)
						continue label0;
	//   58  101:aload_0         
	//   59  102:getfield        #61  <Field int _inputPtr>
	//   60  105:iload           4
	//   61  107:icmpge          22
					i = _inputPtr;
	//   62  110:aload_0         
	//   63  111:getfield        #61  <Field int _inputPtr>
	//   64  114:istore_1        
					_inputPtr = i + 1;
	//   65  115:aload_0         
	//   66  116:iload_1         
	//   67  117:iconst_1        
	//   68  118:iadd            
	//   69  119:putfield        #61  <Field int _inputPtr>
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
	//   98  167:getfield        #116 <Field TextBuffer _textBuffer>
	//   99  170:iload_2         
	//  100  171:invokevirtual   #132 <Method void TextBuffer.setCurrentLength(int)>
					return JsonToken.VALUE_STRING;
	//  101  174:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
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
	//  112  220:ldc1            #134 <String "string value">
	//  113  222:invokevirtual   #138 <Method void _throwUnquotedSpace(int, String)>
					break;

	//* 114  225:goto            345
				case 4: // '\004'
					int k1 = _decodeUtf8_4(i);
	//  115  228:aload_0         
	//  116  229:iload_1         
	//  117  230:invokespecial   #140 <Method int _decodeUtf8_4(int)>
	//  118  233:istore          4
					int l = j + 1;
	//  119  235:iload_2         
	//  120  236:iconst_1        
	//  121  237:iadd            
	//  122  238:istore_3        
					ac[j] = (char)(0xd800 | k1 >> 10);
	//  123  239:aload           6
	//  124  241:iload_2         
	//  125  242:ldc1            #141 <Int 55296>
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
	//  141  266:getfield        #116 <Field TextBuffer _textBuffer>
	//  142  269:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
	//  143  272:astore          7
						i = 0;
	//  144  274:iconst_0        
	//  145  275:istore_1        
					}
					l = 0xdc00 | k1 & 0x3ff;
	//  146  276:ldc1            #142 <Int 56320>
	//  147  278:iload           4
	//  148  280:sipush          1023
	//  149  283:iand            
	//  150  284:ior             
	//  151  285:istore_3        
					j = i;
	//  152  286:iload_1         
	//  153  287:istore_2        
					ac = ac1;
	//  154  288:aload           7
	//  155  290:astore          6
					i = l;
	//  156  292:iload_3         
	//  157  293:istore_1        
					break label1;
	//  158  294:goto            350

				case 3: // '\003'
					if(_inputEnd - _inputPtr >= 2)
	//* 159  297:aload_0         
	//* 160  298:getfield        #64  <Field int _inputEnd>
	//* 161  301:aload_0         
	//* 162  302:getfield        #61  <Field int _inputPtr>
	//* 163  305:isub            
	//* 164  306:iconst_2        
	//* 165  307:icmplt          319
						i = _decodeUtf8_3fast(i);
	//  166  310:aload_0         
	//  167  311:iload_1         
	//  168  312:invokespecial   #144 <Method int _decodeUtf8_3fast(int)>
	//  169  315:istore_1        
					else
	//* 170  316:goto            350
						i = _decodeUtf8_3(i);
	//  171  319:aload_0         
	//  172  320:iload_1         
	//  173  321:invokespecial   #146 <Method int _decodeUtf8_3(int)>
	//  174  324:istore_1        
					break label1;
	//  175  325:goto            350

				case 2: // '\002'
					i = _decodeUtf8_2(i);
	//  176  328:aload_0         
	//  177  329:iload_1         
	//  178  330:invokespecial   #148 <Method int _decodeUtf8_2(int)>
	//  179  333:istore_1        
					break label1;
	//  180  334:goto            350

				case 1: // '\001'
					i = ((int) (_decodeEscaped()));
	//  181  337:aload_0         
	//  182  338:invokevirtual   #152 <Method char _decodeEscaped()>
	//  183  341:istore_1        
					break label1;
	//  184  342:goto            350
				}
				_reportInvalidChar(i);
	//  185  345:aload_0         
	//  186  346:iload_1         
	//  187  347:invokevirtual   #155 <Method void _reportInvalidChar(int)>
			}
			int i1 = j;
	//  188  350:iload_2         
	//  189  351:istore_3        
			ac1 = ac;
	//  190  352:aload           6
	//  191  354:astore          7
			if(j >= ac.length)
	//* 192  356:iload_2         
	//* 193  357:aload           6
	//* 194  359:arraylength     
	//* 195  360:icmplt          374
			{
				ac1 = _textBuffer.finishCurrentSegment();
	//  196  363:aload_0         
	//  197  364:getfield        #116 <Field TextBuffer _textBuffer>
	//  198  367:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
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
	//    4    6:icmpne          196
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*   5    9:aload_0         
	//*   6   10:getfield        #61  <Field int _inputPtr>
	//*   7   13:aload_0         
	//*   8   14:getfield        #64  <Field int _inputEnd>
	//*   9   17:icmplt          34
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #249 <Method boolean _loadMore()>
	//*  12   24:ifne            34
				_reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_FLOAT);
	//   13   27:aload_0         
	//   14   28:getstatic       #590 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//   15   31:invokevirtual   #594 <Method void _reportInvalidEOFInValue(JsonToken)>
			byte abyte0[] = _inputBuffer;
	//   16   34:aload_0         
	//   17   35:getfield        #58  <Field byte[] _inputBuffer>
	//   18   38:astore          6
			i = _inputPtr;
	//   19   40:aload_0         
	//   20   41:getfield        #61  <Field int _inputPtr>
	//   21   44:istore_1        
			_inputPtr = i + 1;
	//   22   45:aload_0         
	//   23   46:iload_1         
	//   24   47:iconst_1        
	//   25   48:iadd            
	//   26   49:putfield        #61  <Field int _inputPtr>
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
	//   36   67:ldc2            #596 <String "-INF">
	//   37   70:astore          6
				else
	//*  38   72:goto            109
					s = "+INF";
	//   39   75:ldc2            #598 <String "+INF">
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
	//   46   89:icmpne          196
				if(flag)
	//*  47   92:iload_2         
	//*  48   93:ifeq            104
					s = "-Infinity";
	//   49   96:ldc2            #600 <String "-Infinity">
	//   50   99:astore          6
				else
	//*  51  101:goto            109
					s = "+Infinity";
	//   52  104:ldc2            #602 <String "+Infinity">
	//   53  107:astore          6
			}
			_matchToken(s, 3);
	//   54  109:aload_0         
	//   55  110:aload           6
	//   56  112:iconst_3        
	//   57  113:invokevirtual   #220 <Method void _matchToken(String, int)>
			if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
	//*  58  116:aload_0         
	//*  59  117:getstatic       #605 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  60  120:invokevirtual   #372 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  61  123:ifeq            149
			{
				double d;
				if(flag)
	//*  62  126:iload_2         
	//*  63  127:ifeq            137
					d = (-1.0D / 0.0D);
	//   64  130:ldc2w           #606 <Double (-1.0D / 0.0D)>
	//   65  133:dstore_3        
				else
	//*  66  134:goto            141
					d = (1.0D / 0.0D);
	//   67  137:ldc2w           #608 <Double (1.0D / 0.0D)>
	//   68  140:dstore_3        
				return resetAsNaN(s, d);
	//   69  141:aload_0         
	//   70  142:aload           6
	//   71  144:dload_3         
	//   72  145:invokevirtual   #613 <Method JsonToken resetAsNaN(String, double)>
	//   73  148:areturn         
			}
			StringBuilder stringbuilder = new StringBuilder();
	//   74  149:new             #331 <Class StringBuilder>
	//   75  152:dup             
	//   76  153:invokespecial   #333 <Method void StringBuilder()>
	//   77  156:astore          7
			stringbuilder.append("Non-standard token '");
	//   78  158:aload           7
	//   79  160:ldc2            #615 <String "Non-standard token '">
	//   80  163:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   81  166:pop             
			stringbuilder.append(s);
	//   82  167:aload           7
	//   83  169:aload           6
	//   84  171:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   85  174:pop             
			stringbuilder.append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
	//   86  175:aload           7
	//   87  177:ldc2            #617 <String "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//   88  180:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   89  183:pop             
			_reportError(stringbuilder.toString());
	//   90  184:aload_0         
	//   91  185:aload           7
	//   92  187:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   93  190:invokevirtual   #620 <Method void _reportError(String)>
		} while(true);
	//   94  193:goto            0
		reportUnexpectedNumberChar(j, "expected digit (0-9) to follow minus sign, for valid numeric value");
	//   95  196:aload_0         
	//   96  197:iload           5
	//   97  199:ldc2            #622 <String "expected digit (0-9) to follow minus sign, for valid numeric value">
	//   98  202:invokevirtual   #280 <Method void reportUnexpectedNumberChar(int, String)>
		return null;
	//   99  205:aconst_null     
	//  100  206:areturn         
	}

	protected String _handleOddName(int i)
		throws IOException
	{
		if(i == 39 && isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES))
	//*   0    0:iload_1         
	//*   1    1:bipush          39
	//*   2    3:icmpne          21
	//*   3    6:aload_0         
	//*   4    7:getstatic       #626 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_SINGLE_QUOTES>
	//*   5   10:invokevirtual   #372 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   6   13:ifeq            21
			return _parseAposName();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #629 <Method String _parseAposName()>
	//    9   20:areturn         
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES))
	//*  10   21:aload_0         
	//*  11   22:getstatic       #632 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_UNQUOTED_FIELD_NAMES>
	//*  12   25:invokevirtual   #372 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  13   28:ifne            44
			_reportUnexpectedChar(((int) ((char)_decodeCharForError(i))), "was expecting double-quote to start field name");
	//   14   31:aload_0         
	//   15   32:aload_0         
	//   16   33:iload_1         
	//   17   34:invokevirtual   #81  <Method int _decodeCharForError(int)>
	//   18   37:int2char        
	//   19   38:ldc2            #634 <String "was expecting double-quote to start field name">
	//   20   41:invokevirtual   #358 <Method void _reportUnexpectedChar(int, String)>
		int ai3[] = CharTypes.getInputCodeUtf8JsNames();
	//   21   44:invokestatic    #637 <Method int[] CharTypes.getInputCodeUtf8JsNames()>
	//   22   47:astore          8
		if(ai3[i] != 0)
	//*  23   49:aload           8
	//*  24   51:iload_1         
	//*  25   52:iaload          
	//*  26   53:ifeq            64
			_reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
	//   27   56:aload_0         
	//   28   57:iload_1         
	//   29   58:ldc2            #639 <String "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name">
	//   30   61:invokevirtual   #358 <Method void _reportUnexpectedChar(int, String)>
		int ai[] = _quadBuffer;
	//   31   64:aload_0         
	//   32   65:getfield        #50  <Field int[] _quadBuffer>
	//   33   68:astore          6
		int j1 = 0;
	//   34   70:iconst_0        
	//   35   71:istore          5
		int k = 0;
	//   36   73:iconst_0        
	//   37   74:istore_3        
		int j = k;
	//   38   75:iload_3         
	//   39   76:istore_2        
		int l = i;
	//   40   77:iload_1         
	//   41   78:istore          4
		do
		{
			if(j1 < 4)
	//*  42   80:iload           5
	//*  43   82:iconst_4        
	//*  44   83:icmpge          102
			{
				i = j1 + 1;
	//   45   86:iload           5
	//   46   88:iconst_1        
	//   47   89:iadd            
	//   48   90:istore_1        
				j = j << 8 | l;
	//   49   91:iload_2         
	//   50   92:bipush          8
	//   51   94:ishl            
	//   52   95:iload           4
	//   53   97:ior             
	//   54   98:istore_2        
			} else
	//*  55   99:goto            147
			{
				int ai1[] = ai;
	//   56  102:aload           6
	//   57  104:astore          7
				if(k >= ai.length)
	//*  58  106:iload_3         
	//*  59  107:aload           6
	//*  60  109:arraylength     
	//*  61  110:icmplt          129
				{
					ai1 = growArrayBy(ai, ai.length);
	//   62  113:aload           6
	//   63  115:aload           6
	//   64  117:arraylength     
	//   65  118:invokestatic    #467 <Method int[] growArrayBy(int[], int)>
	//   66  121:astore          7
					_quadBuffer = ai1;
	//   67  123:aload_0         
	//   68  124:aload           7
	//   69  126:putfield        #50  <Field int[] _quadBuffer>
				}
				ai1[k] = j;
	//   70  129:aload           7
	//   71  131:iload_3         
	//   72  132:iload_2         
	//   73  133:iastore         
				j = l;
	//   74  134:iload           4
	//   75  136:istore_2        
				k++;
	//   76  137:iload_3         
	//   77  138:iconst_1        
	//   78  139:iadd            
	//   79  140:istore_3        
				i = 1;
	//   80  141:iconst_1        
	//   81  142:istore_1        
				ai = ai1;
	//   82  143:aload           7
	//   83  145:astore          6
			}
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*  84  147:aload_0         
	//*  85  148:getfield        #61  <Field int _inputPtr>
	//*  86  151:aload_0         
	//*  87  152:getfield        #64  <Field int _inputEnd>
	//*  88  155:icmplt          175
	//*  89  158:aload_0         
	//*  90  159:invokevirtual   #249 <Method boolean _loadMore()>
	//*  91  162:ifne            175
				_reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
	//   92  165:aload_0         
	//   93  166:ldc2            #435 <String " in field name">
	//   94  169:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//   95  172:invokevirtual   #319 <Method void _reportInvalidEOF(String, JsonToken)>
			l = _inputBuffer[_inputPtr] & 0xff;
	//   96  175:aload_0         
	//   97  176:getfield        #58  <Field byte[] _inputBuffer>
	//   98  179:aload_0         
	//   99  180:getfield        #61  <Field int _inputPtr>
	//  100  183:baload          
	//  101  184:sipush          255
	//  102  187:iand            
	//  103  188:istore          4
			if(ai3[l] != 0)
	//* 104  190:aload           8
	//* 105  192:iload           4
	//* 106  194:iaload          
	//* 107  195:ifeq            283
			{
				if(i > 0)
	//* 108  198:iload_1         
	//* 109  199:ifle            249
				{
					int ai2[] = ai;
	//  110  202:aload           6
	//  111  204:astore          7
					if(k >= ai.length)
	//* 112  206:iload_3         
	//* 113  207:aload           6
	//* 114  209:arraylength     
	//* 115  210:icmplt          229
					{
						ai2 = growArrayBy(ai, ai.length);
	//  116  213:aload           6
	//  117  215:aload           6
	//  118  217:arraylength     
	//  119  218:invokestatic    #467 <Method int[] growArrayBy(int[], int)>
	//  120  221:astore          7
						_quadBuffer = ai2;
	//  121  223:aload_0         
	//  122  224:aload           7
	//  123  226:putfield        #50  <Field int[] _quadBuffer>
					}
					int i1 = k + 1;
	//  124  229:iload_3         
	//  125  230:iconst_1        
	//  126  231:iadd            
	//  127  232:istore          4
					ai2[k] = j;
	//  128  234:aload           7
	//  129  236:iload_3         
	//  130  237:iload_2         
	//  131  238:iastore         
					k = i1;
	//  132  239:iload           4
	//  133  241:istore_3        
					ai = ai2;
	//  134  242:aload           7
	//  135  244:astore          6
				}
	//* 136  246:goto            249
				String s1 = _symbols.findName(ai, k);
	//  137  249:aload_0         
	//  138  250:getfield        #56  <Field ByteQuadsCanonicalizer _symbols>
	//  139  253:aload           6
	//  140  255:iload_3         
	//  141  256:invokevirtual   #470 <Method String ByteQuadsCanonicalizer.findName(int[], int)>
	//  142  259:astore          8
				String s = s1;
	//  143  261:aload           8
	//  144  263:astore          7
				if(s1 == null)
	//* 145  265:aload           8
	//* 146  267:ifnonnull       280
					s = addName(ai, k, i);
	//  147  270:aload_0         
	//  148  271:aload           6
	//  149  273:iload_3         
	//  150  274:iload_1         
	//  151  275:invokespecial   #456 <Method String addName(int[], int, int)>
	//  152  278:astore          7
				return s;
	//  153  280:aload           7
	//  154  282:areturn         
			}
			_inputPtr = _inputPtr + 1;
	//  155  283:aload_0         
	//  156  284:aload_0         
	//  157  285:getfield        #61  <Field int _inputPtr>
	//  158  288:iconst_1        
	//  159  289:iadd            
	//  160  290:putfield        #61  <Field int _inputPtr>
			j1 = i;
	//  161  293:iload_1         
	//  162  294:istore          5
		} while(true);
	//  163  296:goto            80
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
	//*  19   56:getfield        #61  <Field int _inputPtr>
	//*  20   59:aload_0         
	//*  21   60:getfield        #64  <Field int _inputEnd>
	//*  22   63:icmplt          80
	//*  23   66:aload_0         
	//*  24   67:invokevirtual   #249 <Method boolean _loadMore()>
	//*  25   70:ifne            80
										_reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_INT);
	//   26   73:aload_0         
	//   27   74:getstatic       #642 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//   28   77:invokevirtual   #594 <Method void _reportInvalidEOFInValue(JsonToken)>
									byte abyte0[] = _inputBuffer;
	//   29   80:aload_0         
	//   30   81:getfield        #58  <Field byte[] _inputBuffer>
	//   31   84:astore_2        
									i = _inputPtr;
	//   32   85:aload_0         
	//   33   86:getfield        #61  <Field int _inputPtr>
	//   34   89:istore_1        
									_inputPtr = i + 1;
	//   35   90:aload_0         
	//   36   91:iload_1         
	//   37   92:iconst_1        
	//   38   93:iadd            
	//   39   94:putfield        #61  <Field int _inputPtr>
									return _handleInvalidNumberStart(abyte0[i] & 0xff, false);
	//   40   97:aload_0         
	//   41   98:aload_2         
	//   42   99:iload_1         
	//   43  100:baload          
	//   44  101:sipush          255
	//   45  104:iand            
	//   46  105:iconst_0        
	//   47  106:invokevirtual   #644 <Method JsonToken _handleInvalidNumberStart(int, boolean)>
	//   48  109:areturn         

								case 44: // ','
									break;
								}
							} else
							if(!_parsingContext.inArray())
	//*  49  110:aload_0         
	//*  50  111:getfield        #165 <Field JsonReadContext _parsingContext>
	//*  51  114:invokevirtual   #647 <Method boolean JsonReadContext.inArray()>
	//*  52  117:ifne            123
								break label0;
	//   53  120:goto            251
							if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES))
	//*  54  123:aload_0         
	//*  55  124:getstatic       #650 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_MISSING_VALUES>
	//*  56  127:invokevirtual   #372 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  57  130:ifeq            147
							{
								_inputPtr = _inputPtr - 1;
	//   58  133:aload_0         
	//   59  134:aload_0         
	//   60  135:getfield        #61  <Field int _inputPtr>
	//   61  138:iconst_1        
	//   62  139:isub            
	//   63  140:putfield        #61  <Field int _inputPtr>
								return JsonToken.VALUE_NULL;
	//   64  143:getstatic       #228 <Field JsonToken JsonToken.VALUE_NULL>
	//   65  146:areturn         
							}
						}
						_reportUnexpectedChar(i, "expected a value");
	//   66  147:aload_0         
	//   67  148:iload_1         
	//   68  149:ldc2            #652 <String "expected a value">
	//   69  152:invokevirtual   #358 <Method void _reportUnexpectedChar(int, String)>
						break label1;
	//   70  155:goto            236
					}
					_matchToken("NaN", 1);
	//   71  158:aload_0         
	//   72  159:ldc2            #654 <String "NaN">
	//   73  162:iconst_1        
	//   74  163:invokevirtual   #220 <Method void _matchToken(String, int)>
					if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
	//*  75  166:aload_0         
	//*  76  167:getstatic       #605 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  77  170:invokevirtual   #372 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  78  173:ifeq            187
						return resetAsNaN("NaN", (0.0D / 0.0D));
	//   79  176:aload_0         
	//   80  177:ldc2            #654 <String "NaN">
	//   81  180:ldc2w           #655 <Double (0.0D / 0.0D)>
	//   82  183:invokevirtual   #613 <Method JsonToken resetAsNaN(String, double)>
	//   83  186:areturn         
					_reportError("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
	//   84  187:aload_0         
	//   85  188:ldc2            #658 <String "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//   86  191:invokevirtual   #620 <Method void _reportError(String)>
					break label0;
	//   87  194:goto            251
				}
				_matchToken("Infinity", 1);
	//   88  197:aload_0         
	//   89  198:ldc2            #660 <String "Infinity">
	//   90  201:iconst_1        
	//   91  202:invokevirtual   #220 <Method void _matchToken(String, int)>
				if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
	//*  92  205:aload_0         
	//*  93  206:getstatic       #605 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  94  209:invokevirtual   #372 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  95  212:ifeq            226
					return resetAsNaN("Infinity", (1.0D / 0.0D));
	//   96  215:aload_0         
	//   97  216:ldc2            #660 <String "Infinity">
	//   98  219:ldc2w           #608 <Double (1.0D / 0.0D)>
	//   99  222:invokevirtual   #613 <Method JsonToken resetAsNaN(String, double)>
	//  100  225:areturn         
				_reportError("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
	//  101  226:aload_0         
	//  102  227:ldc2            #662 <String "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//  103  230:invokevirtual   #620 <Method void _reportError(String)>
				break label0;
	//  104  233:goto            251
			}
			if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES))
	//* 105  236:aload_0         
	//* 106  237:getstatic       #626 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_SINGLE_QUOTES>
	//* 107  240:invokevirtual   #372 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//* 108  243:ifeq            251
				return _handleApos();
	//  109  246:aload_0         
	//  110  247:invokevirtual   #664 <Method JsonToken _handleApos()>
	//  111  250:areturn         
		}
		if(Character.isJavaIdentifierStart(i))
	//* 112  251:iload_1         
	//* 113  252:invokestatic    #667 <Method boolean Character.isJavaIdentifierStart(int)>
	//* 114  255:ifeq            292
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  115  258:new             #331 <Class StringBuilder>
	//  116  261:dup             
	//  117  262:invokespecial   #333 <Method void StringBuilder()>
	//  118  265:astore_2        
			stringbuilder.append("");
	//  119  266:aload_2         
	//  120  267:ldc2            #669 <String "">
	//  121  270:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//  122  273:pop             
			stringbuilder.append((char)i);
	//  123  274:aload_2         
	//  124  275:iload_1         
	//  125  276:int2char        
	//  126  277:invokevirtual   #538 <Method StringBuilder StringBuilder.append(char)>
	//  127  280:pop             
			_reportInvalidToken(stringbuilder.toString(), "('true', 'false' or 'null')");
	//  128  281:aload_0         
	//  129  282:aload_2         
	//  130  283:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  131  286:ldc2            #671 <String "('true', 'false' or 'null')">
	//  132  289:invokevirtual   #674 <Method void _reportInvalidToken(String, String)>
		}
		_reportUnexpectedChar(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
	//  133  292:aload_0         
	//  134  293:iload_1         
	//  135  294:ldc2            #676 <String "expected a valid value (number, String, array, object, 'true', 'false' or 'null')">
	//  136  297:invokevirtual   #358 <Method void _reportUnexpectedChar(int, String)>
		return null;
	//  137  300:aconst_null     
	//  138  301:areturn         
	}

	protected final boolean _loadMore()
		throws IOException
	{
		int i = _inputEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int _inputEnd>
	//    2    4:istore_1        
		_currInputProcessed = _currInputProcessed + (long)_inputEnd;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #71  <Field long _currInputProcessed>
	//    6   10:aload_0         
	//    7   11:getfield        #64  <Field int _inputEnd>
	//    8   14:i2l             
	//    9   15:ladd            
	//   10   16:putfield        #71  <Field long _currInputProcessed>
		_currInputRowStart = _currInputRowStart - _inputEnd;
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #67  <Field int _currInputRowStart>
	//   14   24:aload_0         
	//   15   25:getfield        #64  <Field int _inputEnd>
	//   16   28:isub            
	//   17   29:putfield        #67  <Field int _currInputRowStart>
		_nameStartOffset = _nameStartOffset - i;
	//   18   32:aload_0         
	//   19   33:aload_0         
	//   20   34:getfield        #409 <Field int _nameStartOffset>
	//   21   37:iload_1         
	//   22   38:isub            
	//   23   39:putfield        #409 <Field int _nameStartOffset>
		if(_inputStream != null)
	//*  24   42:aload_0         
	//*  25   43:getfield        #52  <Field InputStream _inputStream>
	//*  26   46:ifnull          145
		{
			int j = _inputBuffer.length;
	//   27   49:aload_0         
	//   28   50:getfield        #58  <Field byte[] _inputBuffer>
	//   29   53:arraylength     
	//   30   54:istore_1        
			if(j == 0)
	//*  31   55:iload_1         
	//*  32   56:ifne            61
				return false;
	//   33   59:iconst_0        
	//   34   60:ireturn         
			j = _inputStream.read(_inputBuffer, 0, j);
	//   35   61:aload_0         
	//   36   62:getfield        #52  <Field InputStream _inputStream>
	//   37   65:aload_0         
	//   38   66:getfield        #58  <Field byte[] _inputBuffer>
	//   39   69:iconst_0        
	//   40   70:iload_1         
	//   41   71:invokevirtual   #680 <Method int InputStream.read(byte[], int, int)>
	//   42   74:istore_1        
			if(j > 0)
	//*  43   75:iload_1         
	//*  44   76:ifle            91
			{
				_inputPtr = 0;
	//   45   79:aload_0         
	//   46   80:iconst_0        
	//   47   81:putfield        #61  <Field int _inputPtr>
				_inputEnd = j;
	//   48   84:aload_0         
	//   49   85:iload_1         
	//   50   86:putfield        #64  <Field int _inputEnd>
				return true;
	//   51   89:iconst_1        
	//   52   90:ireturn         
			}
			_closeInput();
	//   53   91:aload_0         
	//   54   92:invokevirtual   #682 <Method void _closeInput()>
			if(j == 0)
	//*  55   95:iload_1         
	//*  56   96:ifne            145
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   57   99:new             #331 <Class StringBuilder>
	//   58  102:dup             
	//   59  103:invokespecial   #333 <Method void StringBuilder()>
	//   60  106:astore_2        
				stringbuilder.append("InputStream.read() returned 0 characters when trying to read ");
	//   61  107:aload_2         
	//   62  108:ldc2            #684 <String "InputStream.read() returned 0 characters when trying to read ">
	//   63  111:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   64  114:pop             
				stringbuilder.append(_inputBuffer.length);
	//   65  115:aload_2         
	//   66  116:aload_0         
	//   67  117:getfield        #58  <Field byte[] _inputBuffer>
	//   68  120:arraylength     
	//   69  121:invokevirtual   #687 <Method StringBuilder StringBuilder.append(int)>
	//   70  124:pop             
				stringbuilder.append(" bytes");
	//   71  125:aload_2         
	//   72  126:ldc2            #689 <String " bytes">
	//   73  129:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   74  132:pop             
				throw new IOException(stringbuilder.toString());
	//   75  133:new             #77  <Class IOException>
	//   76  136:dup             
	//   77  137:aload_2         
	//   78  138:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   79  141:invokespecial   #691 <Method void IOException(String)>
	//   80  144:athrow          
			}
		}
		return false;
	//   81  145:iconst_0        
	//   82  146:ireturn         
	}

	protected void _loadMoreGuaranteed()
		throws IOException
	{
		if(!_loadMore())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #249 <Method boolean _loadMore()>
	//*   2    4:ifne            11
			_reportInvalidEOF();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #693 <Method void _reportInvalidEOF()>
	//    5   11:return          
	}

	protected final boolean _loadToHaveAtLeast(int i)
		throws IOException
	{
		if(_inputStream == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field InputStream _inputStream>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		int j = _inputEnd - _inputPtr;
	//    5    9:aload_0         
	//    6   10:getfield        #64  <Field int _inputEnd>
	//    7   13:aload_0         
	//    8   14:getfield        #61  <Field int _inputPtr>
	//    9   17:isub            
	//   10   18:istore_2        
		if(j > 0 && _inputPtr > 0)
	//*  11   19:iload_2         
	//*  12   20:ifle            88
	//*  13   23:aload_0         
	//*  14   24:getfield        #61  <Field int _inputPtr>
	//*  15   27:ifle            88
		{
			int k = _inputPtr;
	//   16   30:aload_0         
	//   17   31:getfield        #61  <Field int _inputPtr>
	//   18   34:istore_3        
			_currInputProcessed = _currInputProcessed + (long)k;
	//   19   35:aload_0         
	//   20   36:aload_0         
	//   21   37:getfield        #71  <Field long _currInputProcessed>
	//   22   40:iload_3         
	//   23   41:i2l             
	//   24   42:ladd            
	//   25   43:putfield        #71  <Field long _currInputProcessed>
			_currInputRowStart = _currInputRowStart - k;
	//   26   46:aload_0         
	//   27   47:aload_0         
	//   28   48:getfield        #67  <Field int _currInputRowStart>
	//   29   51:iload_3         
	//   30   52:isub            
	//   31   53:putfield        #67  <Field int _currInputRowStart>
			_nameStartOffset = _nameStartOffset - k;
	//   32   56:aload_0         
	//   33   57:aload_0         
	//   34   58:getfield        #409 <Field int _nameStartOffset>
	//   35   61:iload_3         
	//   36   62:isub            
	//   37   63:putfield        #409 <Field int _nameStartOffset>
			System.arraycopy(((Object) (_inputBuffer)), k, ((Object) (_inputBuffer)), 0, j);
	//   38   66:aload_0         
	//   39   67:getfield        #58  <Field byte[] _inputBuffer>
	//   40   70:iload_3         
	//   41   71:aload_0         
	//   42   72:getfield        #58  <Field byte[] _inputBuffer>
	//   43   75:iconst_0        
	//   44   76:iload_2         
	//   45   77:invokestatic    #700 <Method void System.arraycopy(Object, int, Object, int, int)>
			_inputEnd = j;
	//   46   80:aload_0         
	//   47   81:iload_2         
	//   48   82:putfield        #64  <Field int _inputEnd>
		} else
	//*  49   85:goto            93
		{
			_inputEnd = 0;
	//   50   88:aload_0         
	//   51   89:iconst_0        
	//   52   90:putfield        #64  <Field int _inputEnd>
		}
		_inputPtr = 0;
	//   53   93:aload_0         
	//   54   94:iconst_0        
	//   55   95:putfield        #61  <Field int _inputPtr>
		int l;
		for(; _inputEnd < i; _inputEnd = _inputEnd + l)
	//*  56   98:aload_0         
	//*  57   99:getfield        #64  <Field int _inputEnd>
	//*  58  102:iload_1         
	//*  59  103:icmpge          207
		{
			l = _inputStream.read(_inputBuffer, _inputEnd, _inputBuffer.length - _inputEnd);
	//   60  106:aload_0         
	//   61  107:getfield        #52  <Field InputStream _inputStream>
	//   62  110:aload_0         
	//   63  111:getfield        #58  <Field byte[] _inputBuffer>
	//   64  114:aload_0         
	//   65  115:getfield        #64  <Field int _inputEnd>
	//   66  118:aload_0         
	//   67  119:getfield        #58  <Field byte[] _inputBuffer>
	//   68  122:arraylength     
	//   69  123:aload_0         
	//   70  124:getfield        #64  <Field int _inputEnd>
	//   71  127:isub            
	//   72  128:invokevirtual   #680 <Method int InputStream.read(byte[], int, int)>
	//   73  131:istore_3        
			if(l < 1)
	//*  74  132:iload_3         
	//*  75  133:iconst_1        
	//*  76  134:icmpge          194
			{
				_closeInput();
	//   77  137:aload_0         
	//   78  138:invokevirtual   #682 <Method void _closeInput()>
				if(l == 0)
	//*  79  141:iload_3         
	//*  80  142:ifne            192
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   81  145:new             #331 <Class StringBuilder>
	//   82  148:dup             
	//   83  149:invokespecial   #333 <Method void StringBuilder()>
	//   84  152:astore          4
					stringbuilder.append("InputStream.read() returned 0 characters when trying to read ");
	//   85  154:aload           4
	//   86  156:ldc2            #684 <String "InputStream.read() returned 0 characters when trying to read ">
	//   87  159:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   88  162:pop             
					stringbuilder.append(j);
	//   89  163:aload           4
	//   90  165:iload_2         
	//   91  166:invokevirtual   #687 <Method StringBuilder StringBuilder.append(int)>
	//   92  169:pop             
					stringbuilder.append(" bytes");
	//   93  170:aload           4
	//   94  172:ldc2            #689 <String " bytes">
	//   95  175:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   96  178:pop             
					throw new IOException(stringbuilder.toString());
	//   97  179:new             #77  <Class IOException>
	//   98  182:dup             
	//   99  183:aload           4
	//  100  185:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  101  188:invokespecial   #691 <Method void IOException(String)>
	//  102  191:athrow          
				} else
				{
					return false;
	//  103  192:iconst_0        
	//  104  193:ireturn         
				}
			}
		}

	//  105  194:aload_0         
	//  106  195:aload_0         
	//  107  196:getfield        #64  <Field int _inputEnd>
	//  108  199:iload_3         
	//  109  200:iadd            
	//  110  201:putfield        #64  <Field int _inputEnd>
	//* 111  204:goto            98
		return true;
	//  112  207:iconst_1        
	//  113  208:ireturn         
	}

	protected final void _matchToken(String s, int i)
		throws IOException
	{
		int k = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #245 <Method int String.length()>
	//    2    4:istore          4
		int j = i;
	//    3    6:iload_2         
	//    4    7:istore_3        
		if(_inputPtr + k >= _inputEnd)
	//*   5    8:aload_0         
	//*   6    9:getfield        #61  <Field int _inputPtr>
	//*   7   12:iload           4
	//*   8   14:iadd            
	//*   9   15:aload_0         
	//*  10   16:getfield        #64  <Field int _inputEnd>
	//*  11   19:icmplt          29
		{
			_matchToken2(s, i);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:iload_2         
	//   15   25:invokespecial   #702 <Method void _matchToken2(String, int)>
			return;
	//   16   28:return          
		}
		do
		{
			if(_inputBuffer[_inputPtr] != s.charAt(j))
	//*  17   29:aload_0         
	//*  18   30:getfield        #58  <Field byte[] _inputBuffer>
	//*  19   33:aload_0         
	//*  20   34:getfield        #61  <Field int _inputPtr>
	//*  21   37:baload          
	//*  22   38:aload_1         
	//*  23   39:iload_3         
	//*  24   40:invokevirtual   #253 <Method char String.charAt(int)>
	//*  25   43:icmpeq          56
				_reportInvalidToken(s.substring(0, j));
	//   26   46:aload_0         
	//   27   47:aload_1         
	//   28   48:iconst_0        
	//   29   49:iload_3         
	//   30   50:invokevirtual   #93  <Method String String.substring(int, int)>
	//   31   53:invokevirtual   #97  <Method void _reportInvalidToken(String)>
			_inputPtr = _inputPtr + 1;
	//   32   56:aload_0         
	//   33   57:aload_0         
	//   34   58:getfield        #61  <Field int _inputPtr>
	//   35   61:iconst_1        
	//   36   62:iadd            
	//   37   63:putfield        #61  <Field int _inputPtr>
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
	//   48   79:getfield        #58  <Field byte[] _inputBuffer>
	//   49   82:aload_0         
	//   50   83:getfield        #61  <Field int _inputPtr>
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
	//   68  114:invokespecial   #255 <Method void _checkMatchEnd(String, int, int)>
	//   69  117:return          
	}

	protected String _parseAposName()
		throws IOException
	{
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          28
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #249 <Method boolean _loadMore()>
	//*   7   15:ifne            28
			_reportInvalidEOF(": was expecting closing ''' for field name", JsonToken.FIELD_NAME);
	//    8   18:aload_0         
	//    9   19:ldc2            #704 <String ": was expecting closing ''' for field name">
	//   10   22:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//   11   25:invokevirtual   #319 <Method void _reportInvalidEOF(String, JsonToken)>
		int ai[] = ((int []) (_inputBuffer));
	//   12   28:aload_0         
	//   13   29:getfield        #58  <Field byte[] _inputBuffer>
	//   14   32:astore          10
		int i = _inputPtr;
	//   15   34:aload_0         
	//   16   35:getfield        #61  <Field int _inputPtr>
	//   17   38:istore_1        
		_inputPtr = i + 1;
	//   18   39:aload_0         
	//   19   40:iload_1         
	//   20   41:iconst_1        
	//   21   42:iadd            
	//   22   43:putfield        #61  <Field int _inputPtr>
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
	//   32   63:ldc2            #669 <String "">
	//   33   66:areturn         
		ai = _quadBuffer;
	//   34   67:aload_0         
	//   35   68:getfield        #50  <Field int[] _quadBuffer>
	//   36   71:astore          10
		Object obj1 = ((Object) (_icLatin1));
	//   37   73:getstatic       #42  <Field int[] _icLatin1>
	//   38   76:astore          12
		int j = 0;
	//   39   78:iconst_0        
	//   40   79:istore_2        
		i = j;
	//   41   80:iload_2         
	//   42   81:istore_1        
		int k = i;
	//   43   82:iload_1         
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
	//   59  111:invokestatic    #467 <Method int[] growArrayBy(int[], int)>
	//   60  114:astore          11
						_quadBuffer = ai1;
	//   61  116:aload_0         
	//   62  117:aload           11
	//   63  119:putfield        #50  <Field int[] _quadBuffer>
					}
					l = i + 1;
	//   64  122:iload_1         
	//   65  123:iconst_1        
	//   66  124:iadd            
	//   67  125:istore          4
					ai1[i] = pad(k, j);
	//   68  127:aload           11
	//   69  129:iload_1         
	//   70  130:iload_3         
	//   71  131:iload_2         
	//   72  132:invokestatic    #452 <Method int pad(int, int)>
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
	//   80  147:getfield        #56  <Field ByteQuadsCanonicalizer _symbols>
	//   81  150:aload           10
	//   82  152:iload_1         
	//   83  153:invokevirtual   #470 <Method String ByteQuadsCanonicalizer.findName(int[], int)>
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
	//   93  172:invokespecial   #456 <Method String addName(int[], int, int)>
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
			if(l != 34)
	//* 107  197:iload           4
	//* 108  199:bipush          34
	//* 109  201:icmpeq          518
			{
				i1 = l;
	//  110  204:iload           4
	//  111  206:istore          5
				i2 = j;
	//  112  208:iload_2         
	//  113  209:istore          9
				k1 = i;
	//  114  211:iload_1         
	//  115  212:istore          7
				ai2 = ai;
	//  116  214:aload           10
	//  117  216:astore          11
				l1 = k;
	//  118  218:iload_3         
	//  119  219:istore          8
				if(obj1[l] != 0)
	//* 120  221:aload           12
	//* 121  223:iload           4
	//* 122  225:iaload          
	//* 123  226:ifeq            518
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
	//  129  239:ldc2            #706 <String "name">
	//  130  242:invokevirtual   #138 <Method void _throwUnquotedSpace(int, String)>
						j1 = l;
	//  131  245:iload           4
	//  132  247:istore          6
					} else
	//* 133  249:goto            258
					{
						j1 = ((int) (_decodeEscaped()));
	//  134  252:aload_0         
	//  135  253:invokevirtual   #152 <Method char _decodeEscaped()>
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
	//* 149  279:icmple          518
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
	//* 160  297:icmplt          344
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
	//  170  316:invokestatic    #467 <Method int[] growArrayBy(int[], int)>
	//  171  319:astore          11
								_quadBuffer = ai2;
	//  172  321:aload_0         
	//  173  322:aload           11
	//  174  324:putfield        #50  <Field int[] _quadBuffer>
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
							k1 = i1;
	//  185  340:iload           5
	//  186  342:istore          7
						}
						if(j1 < 2048)
	//* 187  344:iload           6
	//* 188  346:sipush          2048
	//* 189  349:icmpge          380
						{
							j = k1 << 8 | (0xc0 | j1 >> 6);
	//  190  352:iload           7
	//  191  354:bipush          8
	//  192  356:ishl            
	//  193  357:sipush          192
	//  194  360:iload           6
	//  195  362:bipush          6
	//  196  364:ishr            
	//  197  365:ior             
	//  198  366:ior             
	//  199  367:istore_2        
							i = i1 + 1;
	//  200  368:iload           5
	//  201  370:iconst_1        
	//  202  371:iadd            
	//  203  372:istore_1        
							ai = ai2;
	//  204  373:aload           11
	//  205  375:astore          10
						} else
	//* 206  377:goto            493
						{
							k1 = k1 << 8 | (0xe0 | j1 >> 12);
	//  207  380:iload           7
	//  208  382:bipush          8
	//  209  384:ishl            
	//  210  385:sipush          224
	//  211  388:iload           6
	//  212  390:bipush          12
	//  213  392:ishr            
	//  214  393:ior             
	//  215  394:ior             
	//  216  395:istore          7
							i1++;
	//  217  397:iload           5
	//  218  399:iconst_1        
	//  219  400:iadd            
	//  220  401:istore          5
							k = i1;
	//  221  403:iload           5
	//  222  405:istore_3        
							i = l;
	//  223  406:iload           4
	//  224  408:istore_1        
							ai = ai2;
	//  225  409:aload           11
	//  226  411:astore          10
							j = k1;
	//  227  413:iload           7
	//  228  415:istore_2        
							if(i1 >= 4)
	//* 229  416:iload           5
	//* 230  418:iconst_4        
	//* 231  419:icmplt          466
							{
								ai = ai2;
	//  232  422:aload           11
	//  233  424:astore          10
								if(l >= ai2.length)
	//* 234  426:iload           4
	//* 235  428:aload           11
	//* 236  430:arraylength     
	//* 237  431:icmplt          450
								{
									ai = growArrayBy(ai2, ai2.length);
	//  238  434:aload           11
	//  239  436:aload           11
	//  240  438:arraylength     
	//  241  439:invokestatic    #467 <Method int[] growArrayBy(int[], int)>
	//  242  442:astore          10
									_quadBuffer = ai;
	//  243  444:aload_0         
	//  244  445:aload           10
	//  245  447:putfield        #50  <Field int[] _quadBuffer>
								}
								ai[l] = k1;
	//  246  450:aload           10
	//  247  452:iload           4
	//  248  454:iload           7
	//  249  456:iastore         
								i = l + 1;
	//  250  457:iload           4
	//  251  459:iconst_1        
	//  252  460:iadd            
	//  253  461:istore_1        
								k = 0;
	//  254  462:iconst_0        
	//  255  463:istore_3        
								j = k;
	//  256  464:iload_3         
	//  257  465:istore_2        
							}
							j = j << 8 | (j1 >> 6 & 0x3f | 0x80);
	//  258  466:iload_2         
	//  259  467:bipush          8
	//  260  469:ishl            
	//  261  470:iload           6
	//  262  472:bipush          6
	//  263  474:ishr            
	//  264  475:bipush          63
	//  265  477:iand            
	//  266  478:sipush          128
	//  267  481:ior             
	//  268  482:ior             
	//  269  483:istore_2        
							k++;
	//  270  484:iload_3         
	//  271  485:iconst_1        
	//  272  486:iadd            
	//  273  487:istore_3        
							l = i;
	//  274  488:iload_1         
	//  275  489:istore          4
							i = k;
	//  276  491:iload_3         
	//  277  492:istore_1        
						}
						i1 = j1 & 0x3f | 0x80;
	//  278  493:iload           6
	//  279  495:bipush          63
	//  280  497:iand            
	//  281  498:sipush          128
	//  282  501:ior             
	//  283  502:istore          5
						l1 = j;
	//  284  504:iload_2         
	//  285  505:istore          8
						ai2 = ai;
	//  286  507:aload           10
	//  287  509:astore          11
						k1 = l;
	//  288  511:iload           4
	//  289  513:istore          7
						i2 = i;
	//  290  515:iload_1         
	//  291  516:istore          9
					}
				}
			}
			if(i2 < 4)
	//* 292  518:iload           9
	//* 293  520:iconst_4        
	//* 294  521:icmpge          548
			{
				j = i2 + 1;
	//  295  524:iload           9
	//  296  526:iconst_1        
	//  297  527:iadd            
	//  298  528:istore_2        
				k = i1 | l1 << 8;
	//  299  529:iload           5
	//  300  531:iload           8
	//  301  533:bipush          8
	//  302  535:ishl            
	//  303  536:ior             
	//  304  537:istore_3        
				i = k1;
	//  305  538:iload           7
	//  306  540:istore_1        
				ai = ai2;
	//  307  541:aload           11
	//  308  543:astore          10
			} else
	//* 309  545:goto            593
			{
				ai = ai2;
	//  310  548:aload           11
	//  311  550:astore          10
				if(k1 >= ai2.length)
	//* 312  552:iload           7
	//* 313  554:aload           11
	//* 314  556:arraylength     
	//* 315  557:icmplt          576
				{
					ai = growArrayBy(ai2, ai2.length);
	//  316  560:aload           11
	//  317  562:aload           11
	//  318  564:arraylength     
	//  319  565:invokestatic    #467 <Method int[] growArrayBy(int[], int)>
	//  320  568:astore          10
					_quadBuffer = ai;
	//  321  570:aload_0         
	//  322  571:aload           10
	//  323  573:putfield        #50  <Field int[] _quadBuffer>
				}
				ai[k1] = l1;
	//  324  576:aload           10
	//  325  578:iload           7
	//  326  580:iload           8
	//  327  582:iastore         
				k = i1;
	//  328  583:iload           5
	//  329  585:istore_3        
				i = k1 + 1;
	//  330  586:iload           7
	//  331  588:iconst_1        
	//  332  589:iadd            
	//  333  590:istore_1        
				j = 1;
	//  334  591:iconst_1        
	//  335  592:istore_2        
			}
			if(_inputPtr >= _inputEnd && !_loadMore())
	//* 336  593:aload_0         
	//* 337  594:getfield        #61  <Field int _inputPtr>
	//* 338  597:aload_0         
	//* 339  598:getfield        #64  <Field int _inputEnd>
	//* 340  601:icmplt          621
	//* 341  604:aload_0         
	//* 342  605:invokevirtual   #249 <Method boolean _loadMore()>
	//* 343  608:ifne            621
				_reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
	//  344  611:aload_0         
	//  345  612:ldc2            #435 <String " in field name">
	//  346  615:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//  347  618:invokevirtual   #319 <Method void _reportInvalidEOF(String, JsonToken)>
			ai2 = ((int []) (_inputBuffer));
	//  348  621:aload_0         
	//  349  622:getfield        #58  <Field byte[] _inputBuffer>
	//  350  625:astore          11
			l = _inputPtr;
	//  351  627:aload_0         
	//  352  628:getfield        #61  <Field int _inputPtr>
	//  353  631:istore          4
			_inputPtr = l + 1;
	//  354  633:aload_0         
	//  355  634:iload           4
	//  356  636:iconst_1        
	//  357  637:iadd            
	//  358  638:putfield        #61  <Field int _inputPtr>
			l = ai2[l] & 0xff;
	//  359  641:aload           11
	//  360  643:iload           4
	//  361  645:baload          
	//  362  646:sipush          255
	//  363  649:iand            
	//  364  650:istore          4
		} while(true);
	//  365  652:goto            84
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
	//    5    8:invokevirtual   #708 <Method String _handleOddName(int)>
	//    6   11:areturn         
		if(_inputPtr + 13 > _inputEnd)
	//*   7   12:aload_0         
	//*   8   13:getfield        #61  <Field int _inputPtr>
	//*   9   16:bipush          13
	//*  10   18:iadd            
	//*  11   19:aload_0         
	//*  12   20:getfield        #64  <Field int _inputEnd>
	//*  13   23:icmple          31
			return slowParseName();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #711 <Method String slowParseName()>
	//   16   30:areturn         
		byte abyte0[] = _inputBuffer;
	//   17   31:aload_0         
	//   18   32:getfield        #58  <Field byte[] _inputBuffer>
	//   19   35:astore_3        
		int ai[] = _icLatin1;
	//   20   36:getstatic       #42  <Field int[] _icLatin1>
	//   21   39:astore          4
		i = _inputPtr;
	//   22   41:aload_0         
	//   23   42:getfield        #61  <Field int _inputPtr>
	//   24   45:istore_1        
		_inputPtr = i + 1;
	//   25   46:aload_0         
	//   26   47:iload_1         
	//   27   48:iconst_1        
	//   28   49:iadd            
	//   29   50:putfield        #61  <Field int _inputPtr>
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
	//   41   69:getfield        #61  <Field int _inputPtr>
	//   42   72:istore_2        
			_inputPtr = j + 1;
	//   43   73:aload_0         
	//   44   74:iload_2         
	//   45   75:iconst_1        
	//   46   76:iadd            
	//   47   77:putfield        #61  <Field int _inputPtr>
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
	//   65  103:getfield        #61  <Field int _inputPtr>
	//   66  106:istore_2        
				_inputPtr = j + 1;
	//   67  107:aload_0         
	//   68  108:iload_2         
	//   69  109:iconst_1        
	//   70  110:iadd            
	//   71  111:putfield        #61  <Field int _inputPtr>
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
	//   89  137:getfield        #61  <Field int _inputPtr>
	//   90  140:istore_2        
					_inputPtr = j + 1;
	//   91  141:aload_0         
	//   92  142:iload_2         
	//   93  143:iconst_1        
	//   94  144:iadd            
	//   95  145:putfield        #61  <Field int _inputPtr>
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
	//  113  171:getfield        #61  <Field int _inputPtr>
	//  114  174:istore_2        
						_inputPtr = j + 1;
	//  115  175:aload_0         
	//  116  176:iload_2         
	//  117  177:iconst_1        
	//  118  178:iadd            
	//  119  179:putfield        #61  <Field int _inputPtr>
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
	//  132  199:putfield        #713 <Field int _quad1>
							return parseMediumName(j);
	//  133  202:aload_0         
	//  134  203:iload_2         
	//  135  204:invokevirtual   #716 <Method String parseMediumName(int)>
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
	//  143  217:invokespecial   #717 <Method String findName(int, int)>
	//  144  220:areturn         
						else
							return parseName(i, j, 4);
	//  145  221:aload_0         
	//  146  222:iload_1         
	//  147  223:iload_2         
	//  148  224:iconst_4        
	//  149  225:invokespecial   #719 <Method String parseName(int, int, int)>
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
	//  157  238:invokespecial   #717 <Method String findName(int, int)>
	//  158  241:areturn         
					else
						return parseName(i, j, 3);
	//  159  242:aload_0         
	//  160  243:iload_1         
	//  161  244:iload_2         
	//  162  245:iconst_3        
	//  163  246:invokespecial   #719 <Method String parseName(int, int, int)>
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
	//  171  259:invokespecial   #717 <Method String findName(int, int)>
	//  172  262:areturn         
				else
					return parseName(i, j, 2);
	//  173  263:aload_0         
	//  174  264:iload_1         
	//  175  265:iload_2         
	//  176  266:iconst_2        
	//  177  267:invokespecial   #719 <Method String parseName(int, int, int)>
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
	//  185  280:invokespecial   #717 <Method String findName(int, int)>
	//  186  283:areturn         
			else
				return parseName(i, j, 1);
	//  187  284:aload_0         
	//  188  285:iload_1         
	//  189  286:iload_2         
	//  190  287:iconst_1        
	//  191  288:invokespecial   #719 <Method String parseName(int, int, int)>
	//  192  291:areturn         
		}
		if(i == 34)
	//* 193  292:iload_1         
	//* 194  293:bipush          34
	//* 195  295:icmpne          302
			return "";
	//  196  298:ldc2            #669 <String "">
	//  197  301:areturn         
		else
			return parseName(0, i, 0);
	//  198  302:aload_0         
	//  199  303:iconst_0        
	//  200  304:iload_1         
	//  201  305:iconst_0        
	//  202  306:invokespecial   #719 <Method String parseName(int, int, int)>
	//  203  309:areturn         
	}

	protected JsonToken _parseNegNumber()
		throws IOException
	{
		char ac[] = _textBuffer.emptyAndGetCurrentSegment();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #430 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//    3    7:astore          5
		ac[0] = '-';
	//    4    9:aload           5
	//    5   11:iconst_0        
	//    6   12:bipush          45
	//    7   14:castore         
		if(_inputPtr >= _inputEnd)
	//*   8   15:aload_0         
	//*   9   16:getfield        #61  <Field int _inputPtr>
	//*  10   19:aload_0         
	//*  11   20:getfield        #64  <Field int _inputEnd>
	//*  12   23:icmplt          30
			_loadMoreGuaranteed();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
		byte abyte0[] = _inputBuffer;
	//   15   30:aload_0         
	//   16   31:getfield        #58  <Field byte[] _inputBuffer>
	//   17   34:astore          6
		int i = _inputPtr;
	//   18   36:aload_0         
	//   19   37:getfield        #61  <Field int _inputPtr>
	//   20   40:istore_1        
		_inputPtr = i + 1;
	//   21   41:aload_0         
	//   22   42:iload_1         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:putfield        #61  <Field int _inputPtr>
		int k = abyte0[i] & 0xff;
	//   26   48:aload           6
	//   27   50:iload_1         
	//   28   51:baload          
	//   29   52:sipush          255
	//   30   55:iand            
	//   31   56:istore_2        
		if(k >= 48 && k <= 57)
	//*  32   57:iload_2         
	//*  33   58:bipush          48
	//*  34   60:icmplt          282
	//*  35   63:iload_2         
	//*  36   64:bipush          57
	//*  37   66:icmple          72
	//*  38   69:goto            282
		{
			int j = k;
	//   39   72:iload_2         
	//   40   73:istore_1        
			if(k == 48)
	//*  41   74:iload_2         
	//*  42   75:bipush          48
	//*  43   77:icmpne          85
				j = _verifyNoLeadingZeroes();
	//   44   80:aload_0         
	//   45   81:invokespecial   #721 <Method int _verifyNoLeadingZeroes()>
	//   46   84:istore_1        
			k = 2;
	//   47   85:iconst_2        
	//   48   86:istore_2        
			ac[1] = (char)j;
	//   49   87:aload           5
	//   50   89:iconst_1        
	//   51   90:iload_1         
	//   52   91:int2char        
	//   53   92:castore         
			int l = (_inputPtr + ac.length) - 2;
	//   54   93:aload_0         
	//   55   94:getfield        #61  <Field int _inputPtr>
	//   56   97:aload           5
	//   57   99:arraylength     
	//   58  100:iadd            
	//   59  101:iconst_2        
	//   60  102:isub            
	//   61  103:istore_3        
			j = l;
	//   62  104:iload_3         
	//   63  105:istore_1        
			if(l > _inputEnd)
	//*  64  106:iload_3         
	//*  65  107:aload_0         
	//*  66  108:getfield        #64  <Field int _inputEnd>
	//*  67  111:icmple          119
				j = _inputEnd;
	//   68  114:aload_0         
	//   69  115:getfield        #64  <Field int _inputEnd>
	//   70  118:istore_1        
			l = 1;
	//   71  119:iconst_1        
	//   72  120:istore_3        
			int i1;
			do
			{
				if(_inputPtr >= j)
	//*  73  121:aload_0         
	//*  74  122:getfield        #61  <Field int _inputPtr>
	//*  75  125:iload_1         
	//*  76  126:icmplt          139
					return _parseNumber2(ac, k, true, l);
	//   77  129:aload_0         
	//   78  130:aload           5
	//   79  132:iload_2         
	//   80  133:iconst_1        
	//   81  134:iload_3         
	//   82  135:invokespecial   #723 <Method JsonToken _parseNumber2(char[], int, boolean, int)>
	//   83  138:areturn         
				byte abyte1[] = _inputBuffer;
	//   84  139:aload_0         
	//   85  140:getfield        #58  <Field byte[] _inputBuffer>
	//   86  143:astore          6
				i1 = _inputPtr;
	//   87  145:aload_0         
	//   88  146:getfield        #61  <Field int _inputPtr>
	//   89  149:istore          4
				_inputPtr = i1 + 1;
	//   90  151:aload_0         
	//   91  152:iload           4
	//   92  154:iconst_1        
	//   93  155:iadd            
	//   94  156:putfield        #61  <Field int _inputPtr>
				i1 = abyte1[i1] & 0xff;
	//   95  159:aload           6
	//   96  161:iload           4
	//   97  163:baload          
	//   98  164:sipush          255
	//   99  167:iand            
	//  100  168:istore          4
				if(i1 < 48 || i1 > 57)
	//* 101  170:iload           4
	//* 102  172:bipush          48
	//* 103  174:icmplt          205
	//* 104  177:iload           4
	//* 105  179:bipush          57
	//* 106  181:icmple          187
					break;
	//  107  184:goto            205
				l++;
	//  108  187:iload_3         
	//  109  188:iconst_1        
	//  110  189:iadd            
	//  111  190:istore_3        
				ac[k] = (char)i1;
	//  112  191:aload           5
	//  113  193:iload_2         
	//  114  194:iload           4
	//  115  196:int2char        
	//  116  197:castore         
				k++;
	//  117  198:iload_2         
	//  118  199:iconst_1        
	//  119  200:iadd            
	//  120  201:istore_2        
			} while(true);
	//  121  202:goto            121
			if(i1 != 46 && i1 != 101 && i1 != 69)
	//* 122  205:iload           4
	//* 123  207:bipush          46
	//* 124  209:icmpeq          270
	//* 125  212:iload           4
	//* 126  214:bipush          101
	//* 127  216:icmpeq          270
	//* 128  219:iload           4
	//* 129  221:bipush          69
	//* 130  223:icmpne          229
	//* 131  226:goto            270
			{
				_inputPtr = _inputPtr - 1;
	//  132  229:aload_0         
	//  133  230:aload_0         
	//  134  231:getfield        #61  <Field int _inputPtr>
	//  135  234:iconst_1        
	//  136  235:isub            
	//  137  236:putfield        #61  <Field int _inputPtr>
				_textBuffer.setCurrentLength(k);
	//  138  239:aload_0         
	//  139  240:getfield        #116 <Field TextBuffer _textBuffer>
	//  140  243:iload_2         
	//  141  244:invokevirtual   #132 <Method void TextBuffer.setCurrentLength(int)>
				if(_parsingContext.inRoot())
	//* 142  247:aload_0         
	//* 143  248:getfield        #165 <Field JsonReadContext _parsingContext>
	//* 144  251:invokevirtual   #285 <Method boolean JsonReadContext.inRoot()>
	//* 145  254:ifeq            263
					_verifyRootSpace(i1);
	//  146  257:aload_0         
	//  147  258:iload           4
	//  148  260:invokespecial   #288 <Method void _verifyRootSpace(int)>
				return resetInt(true, l);
	//  149  263:aload_0         
	//  150  264:iconst_1        
	//  151  265:iload_3         
	//  152  266:invokevirtual   #298 <Method JsonToken resetInt(boolean, int)>
	//  153  269:areturn         
			} else
			{
				return _parseFloat(ac, k, i1, true, l);
	//  154  270:aload_0         
	//  155  271:aload           5
	//  156  273:iload_2         
	//  157  274:iload           4
	//  158  276:iconst_1        
	//  159  277:iload_3         
	//  160  278:invokespecial   #300 <Method JsonToken _parseFloat(char[], int, int, boolean, int)>
	//  161  281:areturn         
			}
		} else
		{
			return _handleInvalidNumberStart(k, true);
	//  162  282:aload_0         
	//  163  283:iload_2         
	//  164  284:iconst_1        
	//  165  285:invokevirtual   #644 <Method JsonToken _handleInvalidNumberStart(int, boolean)>
	//  166  288:areturn         
		}
	}

	protected JsonToken _parsePosNumber(int i)
		throws IOException
	{
		char ac[] = _textBuffer.emptyAndGetCurrentSegment();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #430 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
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
	//   10   18:invokespecial   #721 <Method int _verifyNoLeadingZeroes()>
	//   11   21:istore_2        
		ac[0] = (char)j;
	//   12   22:aload           5
	//   13   24:iconst_0        
	//   14   25:iload_2         
	//   15   26:int2char        
	//   16   27:castore         
		j = (_inputPtr + ac.length) - 1;
	//   17   28:aload_0         
	//   18   29:getfield        #61  <Field int _inputPtr>
	//   19   32:aload           5
	//   20   34:arraylength     
	//   21   35:iadd            
	//   22   36:iconst_1        
	//   23   37:isub            
	//   24   38:istore_2        
		i = j;
	//   25   39:iload_2         
	//   26   40:istore_1        
		if(j > _inputEnd)
	//*  27   41:iload_2         
	//*  28   42:aload_0         
	//*  29   43:getfield        #64  <Field int _inputEnd>
	//*  30   46:icmple          54
			i = _inputEnd;
	//   31   49:aload_0         
	//   32   50:getfield        #64  <Field int _inputEnd>
	//   33   53:istore_1        
		j = 1;
	//   34   54:iconst_1        
	//   35   55:istore_2        
		int k = j;
	//   36   56:iload_2         
	//   37   57:istore_3        
		int l;
		do
		{
			if(_inputPtr >= i)
	//*  38   58:aload_0         
	//*  39   59:getfield        #61  <Field int _inputPtr>
	//*  40   62:iload_1         
	//*  41   63:icmplt          76
				return _parseNumber2(ac, j, false, k);
	//   42   66:aload_0         
	//   43   67:aload           5
	//   44   69:iload_2         
	//   45   70:iconst_0        
	//   46   71:iload_3         
	//   47   72:invokespecial   #723 <Method JsonToken _parseNumber2(char[], int, boolean, int)>
	//   48   75:areturn         
			byte abyte0[] = _inputBuffer;
	//   49   76:aload_0         
	//   50   77:getfield        #58  <Field byte[] _inputBuffer>
	//   51   80:astore          6
			l = _inputPtr;
	//   52   82:aload_0         
	//   53   83:getfield        #61  <Field int _inputPtr>
	//   54   86:istore          4
			_inputPtr = l + 1;
	//   55   88:aload_0         
	//   56   89:iload           4
	//   57   91:iconst_1        
	//   58   92:iadd            
	//   59   93:putfield        #61  <Field int _inputPtr>
			l = abyte0[l] & 0xff;
	//   60   96:aload           6
	//   61   98:iload           4
	//   62  100:baload          
	//   63  101:sipush          255
	//   64  104:iand            
	//   65  105:istore          4
			if(l < 48 || l > 57)
	//*  66  107:iload           4
	//*  67  109:bipush          48
	//*  68  111:icmplt          142
	//*  69  114:iload           4
	//*  70  116:bipush          57
	//*  71  118:icmple          124
				break;
	//   72  121:goto            142
			k++;
	//   73  124:iload_3         
	//   74  125:iconst_1        
	//   75  126:iadd            
	//   76  127:istore_3        
			ac[j] = (char)l;
	//   77  128:aload           5
	//   78  130:iload_2         
	//   79  131:iload           4
	//   80  133:int2char        
	//   81  134:castore         
			j++;
	//   82  135:iload_2         
	//   83  136:iconst_1        
	//   84  137:iadd            
	//   85  138:istore_2        
		} while(true);
	//   86  139:goto            58
		if(l != 46 && l != 101 && l != 69)
	//*  87  142:iload           4
	//*  88  144:bipush          46
	//*  89  146:icmpeq          207
	//*  90  149:iload           4
	//*  91  151:bipush          101
	//*  92  153:icmpeq          207
	//*  93  156:iload           4
	//*  94  158:bipush          69
	//*  95  160:icmpne          166
	//*  96  163:goto            207
		{
			_inputPtr = _inputPtr - 1;
	//   97  166:aload_0         
	//   98  167:aload_0         
	//   99  168:getfield        #61  <Field int _inputPtr>
	//  100  171:iconst_1        
	//  101  172:isub            
	//  102  173:putfield        #61  <Field int _inputPtr>
			_textBuffer.setCurrentLength(j);
	//  103  176:aload_0         
	//  104  177:getfield        #116 <Field TextBuffer _textBuffer>
	//  105  180:iload_2         
	//  106  181:invokevirtual   #132 <Method void TextBuffer.setCurrentLength(int)>
			if(_parsingContext.inRoot())
	//* 107  184:aload_0         
	//* 108  185:getfield        #165 <Field JsonReadContext _parsingContext>
	//* 109  188:invokevirtual   #285 <Method boolean JsonReadContext.inRoot()>
	//* 110  191:ifeq            200
				_verifyRootSpace(l);
	//  111  194:aload_0         
	//  112  195:iload           4
	//  113  197:invokespecial   #288 <Method void _verifyRootSpace(int)>
			return resetInt(false, k);
	//  114  200:aload_0         
	//  115  201:iconst_0        
	//  116  202:iload_3         
	//  117  203:invokevirtual   #298 <Method JsonToken resetInt(boolean, int)>
	//  118  206:areturn         
		} else
		{
			return _parseFloat(ac, j, l, false, k);
	//  119  207:aload_0         
	//  120  208:aload           5
	//  121  210:iload_2         
	//  122  211:iload           4
	//  123  213:iconst_0        
	//  124  214:iload_3         
	//  125  215:invokespecial   #300 <Method JsonToken _parseFloat(char[], int, int, boolean, int)>
	//  126  218:areturn         
		}
	}

	protected int _readBinary(Base64Variant base64variant, OutputStream outputstream, byte abyte0[])
		throws IOException
	{
		int k1 = abyte0.length;
	//    0    0:aload_3         
	//    1    1:arraylength     
	//    2    2:istore          9
		int i = 0;
	//    3    4:iconst_0        
	//    4    5:istore          4
		int l = i;
	//    5    7:iload           4
	//    6    9:istore          6
		do
		{
			int k;
label0:
			{
				int i1;
				int j1;
				int l1;
label1:
				{
label2:
					{
						int i2;
label3:
						{
label4:
							{
								do
								{
									if(_inputPtr >= _inputEnd)
	//*   7   11:aload_0         
	//*   8   12:getfield        #61  <Field int _inputPtr>
	//*   9   15:aload_0         
	//*  10   16:getfield        #64  <Field int _inputEnd>
	//*  11   19:icmplt          26
										_loadMoreGuaranteed();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
									byte abyte1[] = _inputBuffer;
	//   14   26:aload_0         
	//   15   27:getfield        #58  <Field byte[] _inputBuffer>
	//   16   30:astore          12
									int j = _inputPtr;
	//   17   32:aload_0         
	//   18   33:getfield        #61  <Field int _inputPtr>
	//   19   36:istore          5
									_inputPtr = j + 1;
	//   20   38:aload_0         
	//   21   39:iload           5
	//   22   41:iconst_1        
	//   23   42:iadd            
	//   24   43:putfield        #61  <Field int _inputPtr>
									i1 = abyte1[j] & 0xff;
	//   25   46:aload           12
	//   26   48:iload           5
	//   27   50:baload          
	//   28   51:sipush          255
	//   29   54:iand            
	//   30   55:istore          7
								} while(i1 <= 32);
	//   31   57:iload           7
	//   32   59:bipush          32
	//   33   61:icmple          11
								k = base64variant.decodeBase64Char(i1);
	//   34   64:aload_1         
	//   35   65:iload           7
	//   36   67:invokevirtual   #511 <Method int Base64Variant.decodeBase64Char(int)>
	//   37   70:istore          5
								j1 = k;
	//   38   72:iload           5
	//   39   74:istore          8
								if(k < 0)
	//*  40   76:iload           5
	//*  41   78:ifge            117
								{
									if(i1 == 34)
	//*  42   81:iload           7
	//*  43   83:bipush          34
	//*  44   85:icmpne          95
									{
										k = l;
	//   45   88:iload           6
	//   46   90:istore          5
										break label4;
	//   47   92:goto            614
									}
									k = _decodeBase64Escape(base64variant, i1, 0);
	//   48   95:aload_0         
	//   49   96:aload_1         
	//   50   97:iload           7
	//   51   99:iconst_0        
	//   52  100:invokevirtual   #521 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//   53  103:istore          5
									j1 = k;
	//   54  105:iload           5
	//   55  107:istore          8
									if(k < 0)
	//*  56  109:iload           5
	//*  57  111:ifge            117
										continue;
	//   58  114:goto            11
								}
								i1 = i;
	//   59  117:iload           4
	//   60  119:istore          7
								k = l;
	//   61  121:iload           6
	//   62  123:istore          5
								if(i > k1 - 3)
	//*  63  125:iload           4
	//*  64  127:iload           9
	//*  65  129:iconst_3        
	//*  66  130:isub            
	//*  67  131:icmple          152
								{
									k = l + i;
	//   68  134:iload           6
	//   69  136:iload           4
	//   70  138:iadd            
	//   71  139:istore          5
									outputstream.write(abyte0, 0, i);
	//   72  141:aload_2         
	//   73  142:aload_3         
	//   74  143:iconst_0        
	//   75  144:iload           4
	//   76  146:invokevirtual   #731 <Method void OutputStream.write(byte[], int, int)>
									i1 = 0;
	//   77  149:iconst_0        
	//   78  150:istore          7
								}
								if(_inputPtr >= _inputEnd)
	//*  79  152:aload_0         
	//*  80  153:getfield        #61  <Field int _inputPtr>
	//*  81  156:aload_0         
	//*  82  157:getfield        #64  <Field int _inputEnd>
	//*  83  160:icmplt          167
									_loadMoreGuaranteed();
	//   84  163:aload_0         
	//   85  164:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
								byte abyte2[] = _inputBuffer;
	//   86  167:aload_0         
	//   87  168:getfield        #58  <Field byte[] _inputBuffer>
	//   88  171:astore          12
								i = _inputPtr;
	//   89  173:aload_0         
	//   90  174:getfield        #61  <Field int _inputPtr>
	//   91  177:istore          4
								_inputPtr = i + 1;
	//   92  179:aload_0         
	//   93  180:iload           4
	//   94  182:iconst_1        
	//   95  183:iadd            
	//   96  184:putfield        #61  <Field int _inputPtr>
								l1 = abyte2[i] & 0xff;
	//   97  187:aload           12
	//   98  189:iload           4
	//   99  191:baload          
	//  100  192:sipush          255
	//  101  195:iand            
	//  102  196:istore          10
								l = base64variant.decodeBase64Char(l1);
	//  103  198:aload_1         
	//  104  199:iload           10
	//  105  201:invokevirtual   #511 <Method int Base64Variant.decodeBase64Char(int)>
	//  106  204:istore          6
								i = l;
	//  107  206:iload           6
	//  108  208:istore          4
								if(l < 0)
	//* 109  210:iload           6
	//* 110  212:ifge            225
									i = _decodeBase64Escape(base64variant, l1, 1);
	//  111  215:aload_0         
	//  112  216:aload_1         
	//  113  217:iload           10
	//  114  219:iconst_1        
	//  115  220:invokevirtual   #521 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//  116  223:istore          4
								l1 = j1 << 6 | i;
	//  117  225:iload           8
	//  118  227:bipush          6
	//  119  229:ishl            
	//  120  230:iload           4
	//  121  232:ior             
	//  122  233:istore          10
								if(_inputPtr >= _inputEnd)
	//* 123  235:aload_0         
	//* 124  236:getfield        #61  <Field int _inputPtr>
	//* 125  239:aload_0         
	//* 126  240:getfield        #64  <Field int _inputEnd>
	//* 127  243:icmplt          250
									_loadMoreGuaranteed();
	//  128  246:aload_0         
	//  129  247:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
								abyte2 = _inputBuffer;
	//  130  250:aload_0         
	//  131  251:getfield        #58  <Field byte[] _inputBuffer>
	//  132  254:astore          12
								i = _inputPtr;
	//  133  256:aload_0         
	//  134  257:getfield        #61  <Field int _inputPtr>
	//  135  260:istore          4
								_inputPtr = i + 1;
	//  136  262:aload_0         
	//  137  263:iload           4
	//  138  265:iconst_1        
	//  139  266:iadd            
	//  140  267:putfield        #61  <Field int _inputPtr>
								i2 = abyte2[i] & 0xff;
	//  141  270:aload           12
	//  142  272:iload           4
	//  143  274:baload          
	//  144  275:sipush          255
	//  145  278:iand            
	//  146  279:istore          11
								l = base64variant.decodeBase64Char(i2);
	//  147  281:aload_1         
	//  148  282:iload           11
	//  149  284:invokevirtual   #511 <Method int Base64Variant.decodeBase64Char(int)>
	//  150  287:istore          6
								j1 = l;
	//  151  289:iload           6
	//  152  291:istore          8
								if(l < 0)
	//* 153  293:iload           6
	//* 154  295:ifge            481
								{
									i = l;
	//  155  298:iload           6
	//  156  300:istore          4
									if(l != -2)
	//* 157  302:iload           6
	//* 158  304:bipush          -2
	//* 159  306:icmpeq          351
									{
										if(i2 == 34 && !base64variant.usesPadding())
	//* 160  309:iload           11
	//* 161  311:bipush          34
	//* 162  313:icmpne          341
	//* 163  316:aload_1         
	//* 164  317:invokevirtual   #524 <Method boolean Base64Variant.usesPadding()>
	//* 165  320:ifne            341
										{
											abyte0[i1] = (byte)(l1 >> 4);
	//  166  323:aload_3         
	//  167  324:iload           7
	//  168  326:iload           10
	//  169  328:iconst_4        
	//  170  329:ishr            
	//  171  330:int2byte        
	//  172  331:bastore         
											i = i1 + 1;
	//  173  332:iload           7
	//  174  334:iconst_1        
	//  175  335:iadd            
	//  176  336:istore          4
											break label4;
	//  177  338:goto            614
										}
										i = _decodeBase64Escape(base64variant, i2, 2);
	//  178  341:aload_0         
	//  179  342:aload_1         
	//  180  343:iload           11
	//  181  345:iconst_2        
	//  182  346:invokevirtual   #521 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//  183  349:istore          4
									}
									j1 = i;
	//  184  351:iload           4
	//  185  353:istore          8
									if(i == -2)
	//* 186  355:iload           4
	//* 187  357:bipush          -2
	//* 188  359:icmpne          481
									{
										if(_inputPtr >= _inputEnd)
	//* 189  362:aload_0         
	//* 190  363:getfield        #61  <Field int _inputPtr>
	//* 191  366:aload_0         
	//* 192  367:getfield        #64  <Field int _inputEnd>
	//* 193  370:icmplt          377
											_loadMoreGuaranteed();
	//  194  373:aload_0         
	//  195  374:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
										abyte2 = _inputBuffer;
	//  196  377:aload_0         
	//  197  378:getfield        #58  <Field byte[] _inputBuffer>
	//  198  381:astore          12
										i = _inputPtr;
	//  199  383:aload_0         
	//  200  384:getfield        #61  <Field int _inputPtr>
	//  201  387:istore          4
										_inputPtr = i + 1;
	//  202  389:aload_0         
	//  203  390:iload           4
	//  204  392:iconst_1        
	//  205  393:iadd            
	//  206  394:putfield        #61  <Field int _inputPtr>
										i = abyte2[i] & 0xff;
	//  207  397:aload           12
	//  208  399:iload           4
	//  209  401:baload          
	//  210  402:sipush          255
	//  211  405:iand            
	//  212  406:istore          4
										if(!base64variant.usesPaddingChar(i))
	//* 213  408:aload_1         
	//* 214  409:iload           4
	//* 215  411:invokevirtual   #530 <Method boolean Base64Variant.usesPaddingChar(int)>
	//* 216  414:ifne            463
										{
											outputstream = ((OutputStream) (new StringBuilder()));
	//  217  417:new             #331 <Class StringBuilder>
	//  218  420:dup             
	//  219  421:invokespecial   #333 <Method void StringBuilder()>
	//  220  424:astore_2        
											((StringBuilder) (outputstream)).append("expected padding character '");
	//  221  425:aload_2         
	//  222  426:ldc2            #532 <String "expected padding character '">
	//  223  429:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//  224  432:pop             
											((StringBuilder) (outputstream)).append(base64variant.getPaddingChar());
	//  225  433:aload_2         
	//  226  434:aload_1         
	//  227  435:invokevirtual   #535 <Method char Base64Variant.getPaddingChar()>
	//  228  438:invokevirtual   #538 <Method StringBuilder StringBuilder.append(char)>
	//  229  441:pop             
											((StringBuilder) (outputstream)).append("'");
	//  230  442:aload_2         
	//  231  443:ldc2            #540 <String "'">
	//  232  446:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//  233  449:pop             
											throw reportInvalidBase64Char(base64variant, i, 3, ((StringBuilder) (outputstream)).toString());
	//  234  450:aload_0         
	//  235  451:aload_1         
	//  236  452:iload           4
	//  237  454:iconst_3        
	//  238  455:aload_2         
	//  239  456:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  240  459:invokevirtual   #544 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int, String)>
	//  241  462:athrow          
										}
										i = i1 + 1;
	//  242  463:iload           7
	//  243  465:iconst_1        
	//  244  466:iadd            
	//  245  467:istore          4
										abyte0[i1] = (byte)(l1 >> 4);
	//  246  469:aload_3         
	//  247  470:iload           7
	//  248  472:iload           10
	//  249  474:iconst_4        
	//  250  475:ishr            
	//  251  476:int2byte        
	//  252  477:bastore         
										break label0;
	//  253  478:goto            764
									}
								}
								l1 = l1 << 6 | j1;
	//  254  481:iload           10
	//  255  483:bipush          6
	//  256  485:ishl            
	//  257  486:iload           8
	//  258  488:ior             
	//  259  489:istore          10
								if(_inputPtr >= _inputEnd)
	//* 260  491:aload_0         
	//* 261  492:getfield        #61  <Field int _inputPtr>
	//* 262  495:aload_0         
	//* 263  496:getfield        #64  <Field int _inputEnd>
	//* 264  499:icmplt          506
									_loadMoreGuaranteed();
	//  265  502:aload_0         
	//  266  503:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
								abyte2 = _inputBuffer;
	//  267  506:aload_0         
	//  268  507:getfield        #58  <Field byte[] _inputBuffer>
	//  269  510:astore          12
								i = _inputPtr;
	//  270  512:aload_0         
	//  271  513:getfield        #61  <Field int _inputPtr>
	//  272  516:istore          4
								_inputPtr = i + 1;
	//  273  518:aload_0         
	//  274  519:iload           4
	//  275  521:iconst_1        
	//  276  522:iadd            
	//  277  523:putfield        #61  <Field int _inputPtr>
								i2 = abyte2[i] & 0xff;
	//  278  526:aload           12
	//  279  528:iload           4
	//  280  530:baload          
	//  281  531:sipush          255
	//  282  534:iand            
	//  283  535:istore          11
								l = base64variant.decodeBase64Char(i2);
	//  284  537:aload_1         
	//  285  538:iload           11
	//  286  540:invokevirtual   #511 <Method int Base64Variant.decodeBase64Char(int)>
	//  287  543:istore          6
								j1 = l;
	//  288  545:iload           6
	//  289  547:istore          8
								if(l >= 0)
									break label1;
	//  290  549:iload           6
	//  291  551:ifge            709
								i = l;
	//  292  554:iload           6
	//  293  556:istore          4
								if(l == -2)
									break label2;
	//  294  558:iload           6
	//  295  560:bipush          -2
	//  296  562:icmpeq          656
								if(i2 != 34 || base64variant.usesPadding())
									break label3;
	//  297  565:iload           11
	//  298  567:bipush          34
	//  299  569:icmpne          646
	//  300  572:aload_1         
	//  301  573:invokevirtual   #524 <Method boolean Base64Variant.usesPadding()>
	//  302  576:ifne            646
								l = l1 >> 2;
	//  303  579:iload           10
	//  304  581:iconst_2        
	//  305  582:ishr            
	//  306  583:istore          6
								j1 = i1 + 1;
	//  307  585:iload           7
	//  308  587:iconst_1        
	//  309  588:iadd            
	//  310  589:istore          8
								abyte0[i1] = (byte)(l >> 8);
	//  311  591:aload_3         
	//  312  592:iload           7
	//  313  594:iload           6
	//  314  596:bipush          8
	//  315  598:ishr            
	//  316  599:int2byte        
	//  317  600:bastore         
								i = j1 + 1;
	//  318  601:iload           8
	//  319  603:iconst_1        
	//  320  604:iadd            
	//  321  605:istore          4
								abyte0[j1] = (byte)l;
	//  322  607:aload_3         
	//  323  608:iload           8
	//  324  610:iload           6
	//  325  612:int2byte        
	//  326  613:bastore         
							}
							_tokenIncomplete = false;
	//  327  614:aload_0         
	//  328  615:iconst_0        
	//  329  616:putfield        #198 <Field boolean _tokenIncomplete>
							l = k;
	//  330  619:iload           5
	//  331  621:istore          6
							if(i > 0)
	//* 332  623:iload           4
	//* 333  625:ifle            643
							{
								l = k + i;
	//  334  628:iload           5
	//  335  630:iload           4
	//  336  632:iadd            
	//  337  633:istore          6
								outputstream.write(abyte0, 0, i);
	//  338  635:aload_2         
	//  339  636:aload_3         
	//  340  637:iconst_0        
	//  341  638:iload           4
	//  342  640:invokevirtual   #731 <Method void OutputStream.write(byte[], int, int)>
							}
							return l;
	//  343  643:iload           6
	//  344  645:ireturn         
						}
						i = _decodeBase64Escape(base64variant, i2, 3);
	//  345  646:aload_0         
	//  346  647:aload_1         
	//  347  648:iload           11
	//  348  650:iconst_3        
	//  349  651:invokevirtual   #521 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//  350  654:istore          4
					}
					j1 = i;
	//  351  656:iload           4
	//  352  658:istore          8
					if(i == -2)
	//* 353  660:iload           4
	//* 354  662:bipush          -2
	//* 355  664:icmpne          709
					{
						l = l1 >> 2;
	//  356  667:iload           10
	//  357  669:iconst_2        
	//  358  670:ishr            
	//  359  671:istore          6
						j1 = i1 + 1;
	//  360  673:iload           7
	//  361  675:iconst_1        
	//  362  676:iadd            
	//  363  677:istore          8
						abyte0[i1] = (byte)(l >> 8);
	//  364  679:aload_3         
	//  365  680:iload           7
	//  366  682:iload           6
	//  367  684:bipush          8
	//  368  686:ishr            
	//  369  687:int2byte        
	//  370  688:bastore         
						i = j1 + 1;
	//  371  689:iload           8
	//  372  691:iconst_1        
	//  373  692:iadd            
	//  374  693:istore          4
						abyte0[j1] = (byte)l;
	//  375  695:aload_3         
	//  376  696:iload           8
	//  377  698:iload           6
	//  378  700:int2byte        
	//  379  701:bastore         
						l = k;
	//  380  702:iload           5
	//  381  704:istore          6
						continue;
	//  382  706:goto            11
					}
				}
				l = l1 << 6 | j1;
	//  383  709:iload           10
	//  384  711:bipush          6
	//  385  713:ishl            
	//  386  714:iload           8
	//  387  716:ior             
	//  388  717:istore          6
				i = i1 + 1;
	//  389  719:iload           7
	//  390  721:iconst_1        
	//  391  722:iadd            
	//  392  723:istore          4
				abyte0[i1] = (byte)(l >> 16);
	//  393  725:aload_3         
	//  394  726:iload           7
	//  395  728:iload           6
	//  396  730:bipush          16
	//  397  732:ishr            
	//  398  733:int2byte        
	//  399  734:bastore         
				i1 = i + 1;
	//  400  735:iload           4
	//  401  737:iconst_1        
	//  402  738:iadd            
	//  403  739:istore          7
				abyte0[i] = (byte)(l >> 8);
	//  404  741:aload_3         
	//  405  742:iload           4
	//  406  744:iload           6
	//  407  746:bipush          8
	//  408  748:ishr            
	//  409  749:int2byte        
	//  410  750:bastore         
				i = i1 + 1;
	//  411  751:iload           7
	//  412  753:iconst_1        
	//  413  754:iadd            
	//  414  755:istore          4
				abyte0[i1] = (byte)l;
	//  415  757:aload_3         
	//  416  758:iload           7
	//  417  760:iload           6
	//  418  762:int2byte        
	//  419  763:bastore         
			}
			l = k;
	//  420  764:iload           5
	//  421  766:istore          6
		} while(true);
	//  422  768:goto            11
	}

	protected void _releaseBuffers()
		throws IOException
	{
		super._releaseBuffers();
	//    0    0:aload_0         
	//    1    1:invokespecial   #734 <Method void ParserBase._releaseBuffers()>
		_symbols.release();
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field ByteQuadsCanonicalizer _symbols>
	//    4    8:invokevirtual   #737 <Method void ByteQuadsCanonicalizer.release()>
		if(_bufferRecyclable)
	//*   5   11:aload_0         
	//*   6   12:getfield        #73  <Field boolean _bufferRecyclable>
	//*   7   15:ifeq            42
		{
			byte abyte0[] = _inputBuffer;
	//    8   18:aload_0         
	//    9   19:getfield        #58  <Field byte[] _inputBuffer>
	//   10   22:astore_1        
			if(abyte0 != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          42
			{
				_inputBuffer = ByteArrayBuilder.NO_BYTES;
	//   13   27:aload_0         
	//   14   28:getstatic       #740 <Field byte[] ByteArrayBuilder.NO_BYTES>
	//   15   31:putfield        #58  <Field byte[] _inputBuffer>
				_ioContext.releaseReadIOBuffer(abyte0);
	//   16   34:aload_0         
	//   17   35:getfield        #487 <Field IOContext _ioContext>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #744 <Method void IOContext.releaseReadIOBuffer(byte[])>
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
	//    5    8:invokevirtual   #361 <Method void _throwInvalidSpace(int)>
		_reportInvalidInitial(i);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:invokevirtual   #433 <Method void _reportInvalidInitial(int)>
	//    9   16:return          
	}

	protected void _reportInvalidInitial(int i)
		throws JsonParseException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #331 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #333 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Invalid UTF-8 start byte 0x");
	//    4    8:aload_2         
	//    5    9:ldc2            #746 <String "Invalid UTF-8 start byte 0x">
	//    6   12:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(Integer.toHexString(i));
	//    8   16:aload_2         
	//    9   17:iload_1         
	//   10   18:invokestatic    #751 <Method String Integer.toHexString(int)>
	//   11   21:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		_reportError(stringbuilder.toString());
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   16   30:invokevirtual   #620 <Method void _reportError(String)>
	//   17   33:return          
	}

	protected void _reportInvalidOther(int i)
		throws JsonParseException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #331 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #333 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Invalid UTF-8 middle byte 0x");
	//    4    8:aload_2         
	//    5    9:ldc2            #753 <String "Invalid UTF-8 middle byte 0x">
	//    6   12:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(Integer.toHexString(i));
	//    8   16:aload_2         
	//    9   17:iload_1         
	//   10   18:invokestatic    #751 <Method String Integer.toHexString(int)>
	//   11   21:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		_reportError(stringbuilder.toString());
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   16   30:invokevirtual   #620 <Method void _reportError(String)>
	//   17   33:return          
	}

	protected void _reportInvalidOther(int i, int j)
		throws JsonParseException
	{
		_inputPtr = j;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #61  <Field int _inputPtr>
		_reportInvalidOther(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #437 <Method void _reportInvalidOther(int)>
	//    6   10:return          
	}

	protected void _reportInvalidToken(String s)
		throws IOException
	{
		_reportInvalidToken(s, "'null', 'true', 'false' or NaN");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #755 <String "'null', 'true', 'false' or NaN">
	//    3    5:invokevirtual   #674 <Method void _reportInvalidToken(String, String)>
	//    4    8:return          
	}

	protected void _reportInvalidToken(String s, String s1)
		throws IOException
	{
		s = ((String) (new StringBuilder(s)));
	//    0    0:new             #331 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #756 <Method void StringBuilder(String)>
	//    4    8:astore_1        
		do
		{
			if(((StringBuilder) (s)).length() >= 256 || _inputPtr >= _inputEnd && !_loadMore())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #757 <Method int StringBuilder.length()>
	//*   7   13:sipush          256
	//*   8   16:icmpge          90
	//*   9   19:aload_0         
	//*  10   20:getfield        #61  <Field int _inputPtr>
	//*  11   23:aload_0         
	//*  12   24:getfield        #64  <Field int _inputEnd>
	//*  13   27:icmplt          40
	//*  14   30:aload_0         
	//*  15   31:invokevirtual   #249 <Method boolean _loadMore()>
	//*  16   34:ifne            40
				break;
	//   17   37:goto            90
			byte abyte0[] = _inputBuffer;
	//   18   40:aload_0         
	//   19   41:getfield        #58  <Field byte[] _inputBuffer>
	//   20   44:astore          5
			int i = _inputPtr;
	//   21   46:aload_0         
	//   22   47:getfield        #61  <Field int _inputPtr>
	//   23   50:istore          4
			_inputPtr = i + 1;
	//   24   52:aload_0         
	//   25   53:iload           4
	//   26   55:iconst_1        
	//   27   56:iadd            
	//   28   57:putfield        #61  <Field int _inputPtr>
			char c = (char)_decodeCharForError(((int) (abyte0[i])));
	//   29   60:aload_0         
	//   30   61:aload           5
	//   31   63:iload           4
	//   32   65:baload          
	//   33   66:invokevirtual   #81  <Method int _decodeCharForError(int)>
	//   34   69:int2char        
	//   35   70:istore_3        
			if(!Character.isJavaIdentifierPart(c))
	//*  36   71:iload_3         
	//*  37   72:invokestatic    #87  <Method boolean Character.isJavaIdentifierPart(char)>
	//*  38   75:ifne            81
				break;
	//   39   78:goto            90
			((StringBuilder) (s)).append(c);
	//   40   81:aload_1         
	//   41   82:iload_3         
	//   42   83:invokevirtual   #538 <Method StringBuilder StringBuilder.append(char)>
	//   43   86:pop             
		} while(true);
	//   44   87:goto            9
		if(((StringBuilder) (s)).length() == 256)
	//*  45   90:aload_1         
	//*  46   91:invokevirtual   #757 <Method int StringBuilder.length()>
	//*  47   94:sipush          256
	//*  48   97:icmpne          108
			((StringBuilder) (s)).append("...");
	//   49  100:aload_1         
	//   50  101:ldc2            #759 <String "...">
	//   51  104:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   52  107:pop             
		StringBuilder stringbuilder = new StringBuilder();
	//   53  108:new             #331 <Class StringBuilder>
	//   54  111:dup             
	//   55  112:invokespecial   #333 <Method void StringBuilder()>
	//   56  115:astore          5
		stringbuilder.append("Unrecognized token '");
	//   57  117:aload           5
	//   58  119:ldc2            #761 <String "Unrecognized token '">
	//   59  122:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   60  125:pop             
		stringbuilder.append(((StringBuilder) (s)).toString());
	//   61  126:aload           5
	//   62  128:aload_1         
	//   63  129:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   64  132:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   65  135:pop             
		stringbuilder.append("': was expecting ");
	//   66  136:aload           5
	//   67  138:ldc2            #763 <String "': was expecting ">
	//   68  141:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   69  144:pop             
		stringbuilder.append(s1);
	//   70  145:aload           5
	//   71  147:aload_2         
	//   72  148:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   73  151:pop             
		_reportError(stringbuilder.toString());
	//   74  152:aload_0         
	//   75  153:aload           5
	//   76  155:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   77  158:invokevirtual   #620 <Method void _reportError(String)>
	//   78  161:return          
	}

	protected final void _skipCR()
		throws IOException
	{
		if((_inputPtr < _inputEnd || _loadMore()) && _inputBuffer[_inputPtr] == 10)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          18
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #249 <Method boolean _loadMore()>
	//*   7   15:ifeq            42
	//*   8   18:aload_0         
	//*   9   19:getfield        #58  <Field byte[] _inputBuffer>
	//*  10   22:aload_0         
	//*  11   23:getfield        #61  <Field int _inputPtr>
	//*  12   26:baload          
	//*  13   27:bipush          10
	//*  14   29:icmpne          42
			_inputPtr = _inputPtr + 1;
	//   15   32:aload_0         
	//   16   33:aload_0         
	//   17   34:getfield        #61  <Field int _inputPtr>
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #61  <Field int _inputPtr>
		_currInputRow = _currInputRow + 1;
	//   21   42:aload_0         
	//   22   43:aload_0         
	//   23   44:getfield        #325 <Field int _currInputRow>
	//   24   47:iconst_1        
	//   25   48:iadd            
	//   26   49:putfield        #325 <Field int _currInputRow>
		_currInputRowStart = _inputPtr;
	//   27   52:aload_0         
	//   28   53:aload_0         
	//   29   54:getfield        #61  <Field int _inputPtr>
	//   30   57:putfield        #67  <Field int _currInputRowStart>
	//   31   60:return          
	}

	protected void _skipString()
		throws IOException
	{
		_tokenIncomplete = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #198 <Field boolean _tokenIncomplete>
		int ai[] = _icUTF8;
	//    3    5:getstatic       #37  <Field int[] _icUTF8>
	//    4    8:astore          5
		byte abyte0[] = _inputBuffer;
	//    5   10:aload_0         
	//    6   11:getfield        #58  <Field byte[] _inputBuffer>
	//    7   14:astore          6
label0:
		do
		{
			int k = _inputPtr;
	//    8   16:aload_0         
	//    9   17:getfield        #61  <Field int _inputPtr>
	//   10   20:istore_3        
			int i1 = _inputEnd;
	//   11   21:aload_0         
	//   12   22:getfield        #64  <Field int _inputEnd>
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
	//   22   39:invokevirtual   #102 <Method void _loadMoreGuaranteed()>
				i = _inputPtr;
	//   23   42:aload_0         
	//   24   43:getfield        #61  <Field int _inputPtr>
	//   25   46:istore_1        
				j = _inputEnd;
	//   26   47:aload_0         
	//   27   48:getfield        #64  <Field int _inputEnd>
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
	//   48   79:putfield        #61  <Field int _inputPtr>
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
	//   62  132:ldc1            #134 <String "string value">
	//   63  134:invokevirtual   #138 <Method void _throwUnquotedSpace(int, String)>
						else
	//*  64  137:goto            16
	//*  65  140:aload_0         
	//*  66  141:iload_1         
	//*  67  142:invokespecial   #307 <Method void _skipUtf8_4(int)>
	//*  68  145:goto            16
	//*  69  148:aload_0         
	//*  70  149:invokespecial   #310 <Method void _skipUtf8_3()>
	//*  71  152:goto            16
	//*  72  155:aload_0         
	//*  73  156:invokespecial   #313 <Method void _skipUtf8_2()>
	//*  74  159:goto            16
	//*  75  162:aload_0         
	//*  76  163:invokevirtual   #152 <Method char _decodeEscaped()>
	//*  77  166:pop             
	//*  78  167:goto            16
							_reportInvalidChar(i);
	//   79  170:aload_0         
	//   80  171:iload_1         
	//   81  172:invokevirtual   #155 <Method void _reportInvalidChar(int)>
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
	//   88  185:putfield        #61  <Field int _inputPtr>
		} while(true);
	//*  89  188:goto            16
	}

	public void finishToken()
		throws IOException
	{
		if(_tokenIncomplete)
	//*   0    0:aload_0         
	//*   1    1:getfield        #198 <Field boolean _tokenIncomplete>
	//*   2    4:ifeq            16
		{
			_tokenIncomplete = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #198 <Field boolean _tokenIncomplete>
			_finishString();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #767 <Method void _finishString()>
		}
	//    8   16:return          
	}

	public byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException
	{
		if(_currToken != JsonToken.VALUE_STRING && (_currToken != JsonToken.VALUE_EMBEDDED_OBJECT || _binaryValue == null))
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field JsonToken _currToken>
	//*   2    4:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpeq       68
	//*   4   10:aload_0         
	//*   5   11:getfield        #189 <Field JsonToken _currToken>
	//*   6   14:getstatic       #773 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//*   7   17:if_acmpne       27
	//*   8   20:aload_0         
	//*   9   21:getfield        #776 <Field byte[] _binaryValue>
	//*  10   24:ifnonnull       68
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   27:new             #331 <Class StringBuilder>
	//   12   30:dup             
	//   13   31:invokespecial   #333 <Method void StringBuilder()>
	//   14   34:astore_2        
			stringbuilder.append("Current token (");
	//   15   35:aload_2         
	//   16   36:ldc2            #778 <String "Current token (">
	//   17   39:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   18   42:pop             
			stringbuilder.append(((Object) (_currToken)));
	//   19   43:aload_2         
	//   20   44:aload_0         
	//   21   45:getfield        #189 <Field JsonToken _currToken>
	//   22   48:invokevirtual   #781 <Method StringBuilder StringBuilder.append(Object)>
	//   23   51:pop             
			stringbuilder.append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
	//   24   52:aload_2         
	//   25   53:ldc2            #783 <String ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary">
	//   26   56:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   27   59:pop             
			_reportError(stringbuilder.toString());
	//   28   60:aload_0         
	//   29   61:aload_2         
	//   30   62:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   31   65:invokevirtual   #620 <Method void _reportError(String)>
		}
		if(_tokenIncomplete)
	//*  32   68:aload_0         
	//*  33   69:getfield        #198 <Field boolean _tokenIncomplete>
	//*  34   72:ifeq            141
		{
			try
			{
				_binaryValue = _decodeBase64(base64variant);
	//   35   75:aload_0         
	//   36   76:aload_0         
	//   37   77:aload_1         
	//   38   78:invokevirtual   #785 <Method byte[] _decodeBase64(Base64Variant)>
	//   39   81:putfield        #776 <Field byte[] _binaryValue>
			}
	//*  40   84:aload_0         
	//*  41   85:iconst_0        
	//*  42   86:putfield        #198 <Field boolean _tokenIncomplete>
	//*  43   89:goto            171
			catch(IllegalArgumentException illegalargumentexception)
	//*  44   92:astore_2        
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   45   93:new             #331 <Class StringBuilder>
	//   46   96:dup             
	//   47   97:invokespecial   #333 <Method void StringBuilder()>
	//   48  100:astore_3        
				stringbuilder1.append("Failed to decode VALUE_STRING as base64 (");
	//   49  101:aload_3         
	//   50  102:ldc2            #787 <String "Failed to decode VALUE_STRING as base64 (">
	//   51  105:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   52  108:pop             
				stringbuilder1.append(((Object) (base64variant)));
	//   53  109:aload_3         
	//   54  110:aload_1         
	//   55  111:invokevirtual   #781 <Method StringBuilder StringBuilder.append(Object)>
	//   56  114:pop             
				stringbuilder1.append("): ");
	//   57  115:aload_3         
	//   58  116:ldc2            #789 <String "): ">
	//   59  119:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   60  122:pop             
				stringbuilder1.append(illegalargumentexception.getMessage());
	//   61  123:aload_3         
	//   62  124:aload_2         
	//   63  125:invokevirtual   #792 <Method String IllegalArgumentException.getMessage()>
	//   64  128:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   65  131:pop             
				throw _constructError(stringbuilder1.toString());
	//   66  132:aload_0         
	//   67  133:aload_3         
	//   68  134:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   69  137:invokevirtual   #391 <Method JsonParseException _constructError(String)>
	//   70  140:athrow          
			}
			_tokenIncomplete = false;
		} else
		if(_binaryValue == null)
	//*  71  141:aload_0         
	//*  72  142:getfield        #776 <Field byte[] _binaryValue>
	//*  73  145:ifnonnull       171
		{
			ByteArrayBuilder bytearraybuilder = _getByteArrayBuilder();
	//   74  148:aload_0         
	//   75  149:invokevirtual   #506 <Method ByteArrayBuilder _getByteArrayBuilder()>
	//   76  152:astore_2        
			_decodeBase64(getText(), bytearraybuilder, base64variant);
	//   77  153:aload_0         
	//   78  154:aload_0         
	//   79  155:invokevirtual   #795 <Method String getText()>
	//   80  158:aload_2         
	//   81  159:aload_1         
	//   82  160:invokevirtual   #798 <Method void _decodeBase64(String, ByteArrayBuilder, Base64Variant)>
			_binaryValue = bytearraybuilder.toByteArray();
	//   83  163:aload_0         
	//   84  164:aload_2         
	//   85  165:invokevirtual   #517 <Method byte[] ByteArrayBuilder.toByteArray()>
	//   86  168:putfield        #776 <Field byte[] _binaryValue>
		}
		return _binaryValue;
	//   87  171:aload_0         
	//   88  172:getfield        #776 <Field byte[] _binaryValue>
	//   89  175:areturn         
	}

	public ObjectCodec getCodec()
	{
		return _objectCodec;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field ObjectCodec _objectCodec>
	//    2    4:areturn         
	}

	public JsonLocation getCurrentLocation()
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int _inputPtr>
	//    2    4:istore_1        
		int j = _currInputRowStart;
	//    3    5:aload_0         
	//    4    6:getfield        #67  <Field int _currInputRowStart>
	//    5    9:istore_2        
		return new JsonLocation(_ioContext.getSourceReference(), _currInputProcessed + (long)_inputPtr, -1L, _currInputRow, (i - j) + 1);
	//    6   10:new             #804 <Class JsonLocation>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #487 <Field IOContext _ioContext>
	//   10   18:invokevirtual   #808 <Method Object IOContext.getSourceReference()>
	//   11   21:aload_0         
	//   12   22:getfield        #71  <Field long _currInputProcessed>
	//   13   25:aload_0         
	//   14   26:getfield        #61  <Field int _inputPtr>
	//   15   29:i2l             
	//   16   30:ladd            
	//   17   31:ldc2w           #809 <Long -1L>
	//   18   34:aload_0         
	//   19   35:getfield        #325 <Field int _currInputRow>
	//   20   38:iload_1         
	//   21   39:iload_2         
	//   22   40:isub            
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:invokespecial   #813 <Method void JsonLocation(Object, long, long, int, int)>
	//   26   46:areturn         
	}

	public Object getInputSource()
	{
		return ((Object) (_inputStream));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field InputStream _inputStream>
	//    2    4:areturn         
	}

	public int getText(Writer writer)
		throws IOException
	{
		Object obj = ((Object) (_currToken));
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field JsonToken _currToken>
	//    2    4:astore_2        
		if(obj == JsonToken.VALUE_STRING)
	//*   3    5:aload_2         
	//*   4    6:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//*   5    9:if_acmpne       37
		{
			if(_tokenIncomplete)
	//*   6   12:aload_0         
	//*   7   13:getfield        #198 <Field boolean _tokenIncomplete>
	//*   8   16:ifeq            28
			{
				_tokenIncomplete = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #198 <Field boolean _tokenIncomplete>
				_finishString();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #767 <Method void _finishString()>
			}
			return _textBuffer.contentsToWriter(writer);
	//   14   28:aload_0         
	//   15   29:getfield        #116 <Field TextBuffer _textBuffer>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #818 <Method int TextBuffer.contentsToWriter(Writer)>
	//   18   36:ireturn         
		}
		if(obj == JsonToken.FIELD_NAME)
	//*  19   37:aload_2         
	//*  20   38:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//*  21   41:if_acmpne       62
		{
			obj = ((Object) (_parsingContext.getCurrentName()));
	//   22   44:aload_0         
	//   23   45:getfield        #165 <Field JsonReadContext _parsingContext>
	//   24   48:invokevirtual   #584 <Method String JsonReadContext.getCurrentName()>
	//   25   51:astore_2        
			writer.write(((String) (obj)));
	//   26   52:aload_1         
	//   27   53:aload_2         
	//   28   54:invokevirtual   #822 <Method void Writer.write(String)>
			return ((String) (obj)).length();
	//   29   57:aload_2         
	//   30   58:invokevirtual   #245 <Method int String.length()>
	//   31   61:ireturn         
		}
		if(obj != null)
	//*  32   62:aload_2         
	//*  33   63:ifnull          95
		{
			if(((JsonToken) (obj)).isNumeric())
	//*  34   66:aload_2         
	//*  35   67:invokevirtual   #825 <Method boolean JsonToken.isNumeric()>
	//*  36   70:ifeq            82
			{
				return _textBuffer.contentsToWriter(writer);
	//   37   73:aload_0         
	//   38   74:getfield        #116 <Field TextBuffer _textBuffer>
	//   39   77:aload_1         
	//   40   78:invokevirtual   #818 <Method int TextBuffer.contentsToWriter(Writer)>
	//   41   81:ireturn         
			} else
			{
				char ac[] = ((JsonToken) (obj)).asCharArray();
	//   42   82:aload_2         
	//   43   83:invokevirtual   #828 <Method char[] JsonToken.asCharArray()>
	//   44   86:astore_2        
				writer.write(ac);
	//   45   87:aload_1         
	//   46   88:aload_2         
	//   47   89:invokevirtual   #831 <Method void Writer.write(char[])>
				return ac.length;
	//   48   92:aload_2         
	//   49   93:arraylength     
	//   50   94:ireturn         
			}
		} else
		{
			return 0;
	//   51   95:iconst_0        
	//   52   96:ireturn         
		}
	}

	public String getText()
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field JsonToken _currToken>
	//*   2    4:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       35
		{
			if(_tokenIncomplete)
	//*   4   10:aload_0         
	//*   5   11:getfield        #198 <Field boolean _tokenIncomplete>
	//*   6   14:ifeq            27
			{
				_tokenIncomplete = false;
	//    7   17:aload_0         
	//    8   18:iconst_0        
	//    9   19:putfield        #198 <Field boolean _tokenIncomplete>
				return _finishAndReturnString();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #833 <Method String _finishAndReturnString()>
	//   12   26:areturn         
			} else
			{
				return _textBuffer.contentsAsString();
	//   13   27:aload_0         
	//   14   28:getfield        #116 <Field TextBuffer _textBuffer>
	//   15   31:invokevirtual   #572 <Method String TextBuffer.contentsAsString()>
	//   16   34:areturn         
			}
		} else
		{
			return _getText2(_currToken);
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #189 <Field JsonToken _currToken>
	//   20   40:invokevirtual   #835 <Method String _getText2(JsonToken)>
	//   21   43:areturn         
		}
	}

	public char[] getTextCharacters()
		throws IOException
	{
		if(_currToken != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field JsonToken _currToken>
	//*   2    4:ifnull          155
		{
			switch(_currToken.id())
	//*   3    7:aload_0         
	//*   4    8:getfield        #189 <Field JsonToken _currToken>
	//*   5   11:invokevirtual   #578 <Method int JsonToken.id()>
			{
	//*   6   14:tableswitch     5 8: default 44
	//	               5 76
	//	               6 52
	//	               7 68
	//	               8 68
			default:
				return _currToken.asCharArray();
	//    7   44:aload_0         
	//    8   45:getfield        #189 <Field JsonToken _currToken>
	//    9   48:invokevirtual   #828 <Method char[] JsonToken.asCharArray()>
	//   10   51:areturn         

			case 6: // '\006'
				if(_tokenIncomplete)
	//*  11   52:aload_0         
	//*  12   53:getfield        #198 <Field boolean _tokenIncomplete>
	//*  13   56:ifeq            68
				{
					_tokenIncomplete = false;
	//   14   59:aload_0         
	//   15   60:iconst_0        
	//   16   61:putfield        #198 <Field boolean _tokenIncomplete>
					_finishString();
	//   17   64:aload_0         
	//   18   65:invokevirtual   #767 <Method void _finishString()>
				}
				// fall through

			case 7: // '\007'
			case 8: // '\b'
				return _textBuffer.getTextBuffer();
	//   19   68:aload_0         
	//   20   69:getfield        #116 <Field TextBuffer _textBuffer>
	//   21   72:invokevirtual   #839 <Method char[] TextBuffer.getTextBuffer()>
	//   22   75:areturn         

			case 5: // '\005'
				break;
			}
			if(!_nameCopied)
	//*  23   76:aload_0         
	//*  24   77:getfield        #259 <Field boolean _nameCopied>
	//*  25   80:ifne            150
			{
				String s = _parsingContext.getCurrentName();
	//   26   83:aload_0         
	//   27   84:getfield        #165 <Field JsonReadContext _parsingContext>
	//   28   87:invokevirtual   #584 <Method String JsonReadContext.getCurrentName()>
	//   29   90:astore_2        
				int i = s.length();
	//   30   91:aload_2         
	//   31   92:invokevirtual   #245 <Method int String.length()>
	//   32   95:istore_1        
				if(_nameCopyBuffer == null)
	//*  33   96:aload_0         
	//*  34   97:getfield        #843 <Field char[] _nameCopyBuffer>
	//*  35  100:ifnonnull       118
					_nameCopyBuffer = _ioContext.allocNameCopyBuffer(i);
	//   36  103:aload_0         
	//   37  104:aload_0         
	//   38  105:getfield        #487 <Field IOContext _ioContext>
	//   39  108:iload_1         
	//   40  109:invokevirtual   #847 <Method char[] IOContext.allocNameCopyBuffer(int)>
	//   41  112:putfield        #843 <Field char[] _nameCopyBuffer>
				else
	//*  42  115:goto            134
				if(_nameCopyBuffer.length < i)
	//*  43  118:aload_0         
	//*  44  119:getfield        #843 <Field char[] _nameCopyBuffer>
	//*  45  122:arraylength     
	//*  46  123:iload_1         
	//*  47  124:icmpge          134
					_nameCopyBuffer = new char[i];
	//   48  127:aload_0         
	//   49  128:iload_1         
	//   50  129:newarray        char[]
	//   51  131:putfield        #843 <Field char[] _nameCopyBuffer>
				s.getChars(0, i, _nameCopyBuffer, 0);
	//   52  134:aload_2         
	//   53  135:iconst_0        
	//   54  136:iload_1         
	//   55  137:aload_0         
	//   56  138:getfield        #843 <Field char[] _nameCopyBuffer>
	//   57  141:iconst_0        
	//   58  142:invokevirtual   #851 <Method void String.getChars(int, int, char[], int)>
				_nameCopied = true;
	//   59  145:aload_0         
	//   60  146:iconst_1        
	//   61  147:putfield        #259 <Field boolean _nameCopied>
			}
			return _nameCopyBuffer;
	//   62  150:aload_0         
	//   63  151:getfield        #843 <Field char[] _nameCopyBuffer>
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
	//*   1    1:getfield        #189 <Field JsonToken _currToken>
	//*   2    4:ifnull          88
			switch(_currToken.id())
	//*   3    7:aload_0         
	//*   4    8:getfield        #189 <Field JsonToken _currToken>
	//*   5   11:invokevirtual   #578 <Method int JsonToken.id()>
			{
	//*   6   14:tableswitch     5 8: default 44
	//	               5 77
	//	               6 53
	//	               7 69
	//	               8 69
			default:
				return _currToken.asCharArray().length;
	//    7   44:aload_0         
	//    8   45:getfield        #189 <Field JsonToken _currToken>
	//    9   48:invokevirtual   #828 <Method char[] JsonToken.asCharArray()>
	//   10   51:arraylength     
	//   11   52:ireturn         

			case 6: // '\006'
				if(_tokenIncomplete)
	//*  12   53:aload_0         
	//*  13   54:getfield        #198 <Field boolean _tokenIncomplete>
	//*  14   57:ifeq            69
				{
					_tokenIncomplete = false;
	//   15   60:aload_0         
	//   16   61:iconst_0        
	//   17   62:putfield        #198 <Field boolean _tokenIncomplete>
					_finishString();
	//   18   65:aload_0         
	//   19   66:invokevirtual   #767 <Method void _finishString()>
				}
				// fall through

			case 7: // '\007'
			case 8: // '\b'
				return _textBuffer.size();
	//   20   69:aload_0         
	//   21   70:getfield        #116 <Field TextBuffer _textBuffer>
	//   22   73:invokevirtual   #855 <Method int TextBuffer.size()>
	//   23   76:ireturn         

			case 5: // '\005'
				return _parsingContext.getCurrentName().length();
	//   24   77:aload_0         
	//   25   78:getfield        #165 <Field JsonReadContext _parsingContext>
	//   26   81:invokevirtual   #584 <Method String JsonReadContext.getCurrentName()>
	//   27   84:invokevirtual   #245 <Method int String.length()>
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
	//*   1    1:getfield        #189 <Field JsonToken _currToken>
	//*   2    4:ifnull          72
			switch(_currToken.id())
	//*   3    7:aload_0         
	//*   4    8:getfield        #189 <Field JsonToken _currToken>
	//*   5   11:invokevirtual   #578 <Method int JsonToken.id()>
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
	//*  10   47:getfield        #198 <Field boolean _tokenIncomplete>
	//*  11   50:ifeq            62
				{
					_tokenIncomplete = false;
	//   12   53:aload_0         
	//   13   54:iconst_0        
	//   14   55:putfield        #198 <Field boolean _tokenIncomplete>
					_finishString();
	//   15   58:aload_0         
	//   16   59:invokevirtual   #767 <Method void _finishString()>
				}
				// fall through

			case 7: // '\007'
			case 8: // '\b'
				return _textBuffer.getTextOffset();
	//   17   62:aload_0         
	//   18   63:getfield        #116 <Field TextBuffer _textBuffer>
	//   19   66:invokevirtual   #858 <Method int TextBuffer.getTextOffset()>
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
		Object obj = _ioContext.getSourceReference();
	//    0    0:aload_0         
	//    1    1:getfield        #487 <Field IOContext _ioContext>
	//    2    4:invokevirtual   #808 <Method Object IOContext.getSourceReference()>
	//    3    7:astore_1        
		if(_currToken == JsonToken.FIELD_NAME)
	//*   4    8:aload_0         
	//*   5    9:getfield        #189 <Field JsonToken _currToken>
	//*   6   12:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//*   7   15:if_acmpne       50
			return new JsonLocation(obj, _currInputProcessed + (long)(_nameStartOffset - 1), -1L, _nameStartRow, _nameStartCol);
	//    8   18:new             #804 <Class JsonLocation>
	//    9   21:dup             
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #71  <Field long _currInputProcessed>
	//   13   27:aload_0         
	//   14   28:getfield        #409 <Field int _nameStartOffset>
	//   15   31:iconst_1        
	//   16   32:isub            
	//   17   33:i2l             
	//   18   34:ladd            
	//   19   35:ldc2w           #809 <Long -1L>
	//   20   38:aload_0         
	//   21   39:getfield        #407 <Field int _nameStartRow>
	//   22   42:aload_0         
	//   23   43:getfield        #411 <Field int _nameStartCol>
	//   24   46:invokespecial   #813 <Method void JsonLocation(Object, long, long, int, int)>
	//   25   49:areturn         
		else
			return new JsonLocation(obj, _tokenInputTotal - 1L, -1L, _tokenInputRow, _tokenInputCol);
	//   26   50:new             #804 <Class JsonLocation>
	//   27   53:dup             
	//   28   54:aload_1         
	//   29   55:aload_0         
	//   30   56:getfield        #404 <Field long _tokenInputTotal>
	//   31   59:lconst_1        
	//   32   60:lsub            
	//   33   61:ldc2w           #809 <Long -1L>
	//   34   64:aload_0         
	//   35   65:getfield        #262 <Field int _tokenInputRow>
	//   36   68:aload_0         
	//   37   69:getfield        #265 <Field int _tokenInputCol>
	//   38   72:invokespecial   #813 <Method void JsonLocation(Object, long, long, int, int)>
	//   39   75:areturn         
	}

	public int getValueAsInt()
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field JsonToken _currToken>
	//    2    4:astore_1        
		if(jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #642 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5    9:if_acmpeq       28
	//*   6   12:aload_1         
	//*   7   13:getstatic       #590 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   16:if_acmpne       22
	//*   9   19:goto            28
			return super.getValueAsInt(0);
	//   10   22:aload_0         
	//   11   23:iconst_0        
	//   12   24:invokespecial   #862 <Method int ParserBase.getValueAsInt(int)>
	//   13   27:ireturn         
		if((_numTypesValid & 1) == 0)
	//*  14   28:aload_0         
	//*  15   29:getfield        #865 <Field int _numTypesValid>
	//*  16   32:iconst_1        
	//*  17   33:iand            
	//*  18   34:ifne            62
		{
			if(_numTypesValid == 0)
	//*  19   37:aload_0         
	//*  20   38:getfield        #865 <Field int _numTypesValid>
	//*  21   41:ifne            49
				return _parseIntValue();
	//   22   44:aload_0         
	//   23   45:invokevirtual   #868 <Method int _parseIntValue()>
	//   24   48:ireturn         
			if((_numTypesValid & 1) == 0)
	//*  25   49:aload_0         
	//*  26   50:getfield        #865 <Field int _numTypesValid>
	//*  27   53:iconst_1        
	//*  28   54:iand            
	//*  29   55:ifne            62
				convertNumberToInt();
	//   30   58:aload_0         
	//   31   59:invokevirtual   #871 <Method void convertNumberToInt()>
		}
		return _numberInt;
	//   32   62:aload_0         
	//   33   63:getfield        #874 <Field int _numberInt>
	//   34   66:ireturn         
	}

	public int getValueAsInt(int i)
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field JsonToken _currToken>
	//    2    4:astore_2        
		if(jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    5:aload_2         
	//*   4    6:getstatic       #642 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5    9:if_acmpeq       28
	//*   6   12:aload_2         
	//*   7   13:getstatic       #590 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   16:if_acmpne       22
	//*   9   19:goto            28
			return super.getValueAsInt(i);
	//   10   22:aload_0         
	//   11   23:iload_1         
	//   12   24:invokespecial   #862 <Method int ParserBase.getValueAsInt(int)>
	//   13   27:ireturn         
		if((_numTypesValid & 1) == 0)
	//*  14   28:aload_0         
	//*  15   29:getfield        #865 <Field int _numTypesValid>
	//*  16   32:iconst_1        
	//*  17   33:iand            
	//*  18   34:ifne            62
		{
			if(_numTypesValid == 0)
	//*  19   37:aload_0         
	//*  20   38:getfield        #865 <Field int _numTypesValid>
	//*  21   41:ifne            49
				return _parseIntValue();
	//   22   44:aload_0         
	//   23   45:invokevirtual   #868 <Method int _parseIntValue()>
	//   24   48:ireturn         
			if((_numTypesValid & 1) == 0)
	//*  25   49:aload_0         
	//*  26   50:getfield        #865 <Field int _numTypesValid>
	//*  27   53:iconst_1        
	//*  28   54:iand            
	//*  29   55:ifne            62
				convertNumberToInt();
	//   30   58:aload_0         
	//   31   59:invokevirtual   #871 <Method void convertNumberToInt()>
		}
		return _numberInt;
	//   32   62:aload_0         
	//   33   63:getfield        #874 <Field int _numberInt>
	//   34   66:ireturn         
	}

	public String getValueAsString()
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field JsonToken _currToken>
	//*   2    4:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       35
			if(_tokenIncomplete)
	//*   4   10:aload_0         
	//*   5   11:getfield        #198 <Field boolean _tokenIncomplete>
	//*   6   14:ifeq            27
			{
				_tokenIncomplete = false;
	//    7   17:aload_0         
	//    8   18:iconst_0        
	//    9   19:putfield        #198 <Field boolean _tokenIncomplete>
				return _finishAndReturnString();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #833 <Method String _finishAndReturnString()>
	//   12   26:areturn         
			} else
			{
				return _textBuffer.contentsAsString();
	//   13   27:aload_0         
	//   14   28:getfield        #116 <Field TextBuffer _textBuffer>
	//   15   31:invokevirtual   #572 <Method String TextBuffer.contentsAsString()>
	//   16   34:areturn         
			}
		if(_currToken == JsonToken.FIELD_NAME)
	//*  17   35:aload_0         
	//*  18   36:getfield        #189 <Field JsonToken _currToken>
	//*  19   39:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//*  20   42:if_acmpne       50
			return getCurrentName();
	//   21   45:aload_0         
	//   22   46:invokevirtual   #876 <Method String getCurrentName()>
	//   23   49:areturn         
		else
			return super.getValueAsString(((String) (null)));
	//   24   50:aload_0         
	//   25   51:aconst_null     
	//   26   52:invokespecial   #879 <Method String ParserBase.getValueAsString(String)>
	//   27   55:areturn         
	}

	public String getValueAsString(String s)
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field JsonToken _currToken>
	//*   2    4:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       35
			if(_tokenIncomplete)
	//*   4   10:aload_0         
	//*   5   11:getfield        #198 <Field boolean _tokenIncomplete>
	//*   6   14:ifeq            27
			{
				_tokenIncomplete = false;
	//    7   17:aload_0         
	//    8   18:iconst_0        
	//    9   19:putfield        #198 <Field boolean _tokenIncomplete>
				return _finishAndReturnString();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #833 <Method String _finishAndReturnString()>
	//   12   26:areturn         
			} else
			{
				return _textBuffer.contentsAsString();
	//   13   27:aload_0         
	//   14   28:getfield        #116 <Field TextBuffer _textBuffer>
	//   15   31:invokevirtual   #572 <Method String TextBuffer.contentsAsString()>
	//   16   34:areturn         
			}
		if(_currToken == JsonToken.FIELD_NAME)
	//*  17   35:aload_0         
	//*  18   36:getfield        #189 <Field JsonToken _currToken>
	//*  19   39:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//*  20   42:if_acmpne       50
			return getCurrentName();
	//   21   45:aload_0         
	//   22   46:invokevirtual   #876 <Method String getCurrentName()>
	//   23   49:areturn         
		else
			return super.getValueAsString(s);
	//   24   50:aload_0         
	//   25   51:aload_1         
	//   26   52:invokespecial   #879 <Method String ParserBase.getValueAsString(String)>
	//   27   55:areturn         
	}

	public Boolean nextBooleanValue()
		throws IOException
	{
		if(_currToken == JsonToken.FIELD_NAME)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field JsonToken _currToken>
	//*   2    4:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:if_acmpne       108
		{
			_nameCopied = false;
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:putfield        #259 <Field boolean _nameCopied>
			JsonToken jsontoken = _nextToken;
	//    7   15:aload_0         
	//    8   16:getfield        #204 <Field JsonToken _nextToken>
	//    9   19:astore_1        
			_nextToken = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #204 <Field JsonToken _nextToken>
			_currToken = jsontoken;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #189 <Field JsonToken _currToken>
			if(jsontoken == JsonToken.VALUE_TRUE)
	//*  16   30:aload_1         
	//*  17   31:getstatic       #223 <Field JsonToken JsonToken.VALUE_TRUE>
	//*  18   34:if_acmpne       41
				return Boolean.TRUE;
	//   19   37:getstatic       #887 <Field Boolean Boolean.TRUE>
	//   20   40:areturn         
			if(jsontoken == JsonToken.VALUE_FALSE)
	//*  21   41:aload_1         
	//*  22   42:getstatic       #233 <Field JsonToken JsonToken.VALUE_FALSE>
	//*  23   45:if_acmpne       52
				return Boolean.FALSE;
	//   24   48:getstatic       #890 <Field Boolean Boolean.FALSE>
	//   25   51:areturn         
			if(jsontoken == JsonToken.START_ARRAY)
	//*  26   52:aload_1         
	//*  27   53:getstatic       #236 <Field JsonToken JsonToken.START_ARRAY>
	//*  28   56:if_acmpne       80
			{
				_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   29   59:aload_0         
	//   30   60:aload_0         
	//   31   61:getfield        #165 <Field JsonReadContext _parsingContext>
	//   32   64:aload_0         
	//   33   65:getfield        #262 <Field int _tokenInputRow>
	//   34   68:aload_0         
	//   35   69:getfield        #265 <Field int _tokenInputCol>
	//   36   72:invokevirtual   #269 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   37   75:putfield        #165 <Field JsonReadContext _parsingContext>
				return null;
	//   38   78:aconst_null     
	//   39   79:areturn         
			}
			if(jsontoken == JsonToken.START_OBJECT)
	//*  40   80:aload_1         
	//*  41   81:getstatic       #214 <Field JsonToken JsonToken.START_OBJECT>
	//*  42   84:if_acmpne       106
				_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   43   87:aload_0         
	//   44   88:aload_0         
	//   45   89:getfield        #165 <Field JsonReadContext _parsingContext>
	//   46   92:aload_0         
	//   47   93:getfield        #262 <Field int _tokenInputRow>
	//   48   96:aload_0         
	//   49   97:getfield        #265 <Field int _tokenInputCol>
	//   50  100:invokevirtual   #272 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   51  103:putfield        #165 <Field JsonReadContext _parsingContext>
			return null;
	//   52  106:aconst_null     
	//   53  107:areturn         
		}
		JsonToken jsontoken1 = nextToken();
	//   54  108:aload_0         
	//   55  109:invokevirtual   #893 <Method JsonToken nextToken()>
	//   56  112:astore_1        
		if(jsontoken1 == JsonToken.VALUE_TRUE)
	//*  57  113:aload_1         
	//*  58  114:getstatic       #223 <Field JsonToken JsonToken.VALUE_TRUE>
	//*  59  117:if_acmpne       124
			return Boolean.TRUE;
	//   60  120:getstatic       #887 <Field Boolean Boolean.TRUE>
	//   61  123:areturn         
		if(jsontoken1 == JsonToken.VALUE_FALSE)
	//*  62  124:aload_1         
	//*  63  125:getstatic       #233 <Field JsonToken JsonToken.VALUE_FALSE>
	//*  64  128:if_acmpne       135
			return Boolean.FALSE;
	//   65  131:getstatic       #890 <Field Boolean Boolean.FALSE>
	//   66  134:areturn         
		else
			return null;
	//   67  135:aconst_null     
	//   68  136:areturn         
	}

	public String nextFieldName()
		throws IOException
	{
		_numTypesValid = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #865 <Field int _numTypesValid>
		if(_currToken == JsonToken.FIELD_NAME)
	//*   3    5:aload_0         
	//*   4    6:getfield        #189 <Field JsonToken _currToken>
	//*   5    9:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//*   6   12:if_acmpne       22
		{
			_nextAfterName();
	//    7   15:aload_0         
	//    8   16:invokespecial   #896 <Method JsonToken _nextAfterName()>
	//    9   19:pop             
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
		}
		if(_tokenIncomplete)
	//*  12   22:aload_0         
	//*  13   23:getfield        #198 <Field boolean _tokenIncomplete>
	//*  14   26:ifeq            33
			_skipString();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #898 <Method void _skipString()>
		int j = _skipWSOrEnd();
	//   17   33:aload_0         
	//   18   34:invokespecial   #900 <Method int _skipWSOrEnd()>
	//   19   37:istore_2        
		if(j < 0)
	//*  20   38:iload_2         
	//*  21   39:ifge            53
		{
			close();
	//   22   42:aload_0         
	//   23   43:invokevirtual   #901 <Method void close()>
			_currToken = null;
	//   24   46:aload_0         
	//   25   47:aconst_null     
	//   26   48:putfield        #189 <Field JsonToken _currToken>
			return null;
	//   27   51:aconst_null     
	//   28   52:areturn         
		}
		_binaryValue = null;
	//   29   53:aload_0         
	//   30   54:aconst_null     
	//   31   55:putfield        #776 <Field byte[] _binaryValue>
		if(j == 93)
	//*  32   58:iload_2         
	//*  33   59:bipush          93
	//*  34   61:icmpne          105
		{
			_updateLocation();
	//   35   64:aload_0         
	//   36   65:invokespecial   #196 <Method void _updateLocation()>
			if(!_parsingContext.inArray())
	//*  37   68:aload_0         
	//*  38   69:getfield        #165 <Field JsonReadContext _parsingContext>
	//*  39   72:invokevirtual   #647 <Method boolean JsonReadContext.inArray()>
	//*  40   75:ifne            85
				_reportMismatchedEndMarker(j, '}');
	//   41   78:aload_0         
	//   42   79:iload_2         
	//   43   80:bipush          125
	//   44   82:invokevirtual   #905 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   45   85:aload_0         
	//   46   86:aload_0         
	//   47   87:getfield        #165 <Field JsonReadContext _parsingContext>
	//   48   90:invokevirtual   #909 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   49   93:putfield        #165 <Field JsonReadContext _parsingContext>
			_currToken = JsonToken.END_ARRAY;
	//   50   96:aload_0         
	//   51   97:getstatic       #912 <Field JsonToken JsonToken.END_ARRAY>
	//   52  100:putfield        #189 <Field JsonToken _currToken>
			return null;
	//   53  103:aconst_null     
	//   54  104:areturn         
		}
		if(j == 125)
	//*  55  105:iload_2         
	//*  56  106:bipush          125
	//*  57  108:icmpne          152
		{
			_updateLocation();
	//   58  111:aload_0         
	//   59  112:invokespecial   #196 <Method void _updateLocation()>
			if(!_parsingContext.inObject())
	//*  60  115:aload_0         
	//*  61  116:getfield        #165 <Field JsonReadContext _parsingContext>
	//*  62  119:invokevirtual   #915 <Method boolean JsonReadContext.inObject()>
	//*  63  122:ifne            132
				_reportMismatchedEndMarker(j, ']');
	//   64  125:aload_0         
	//   65  126:iload_2         
	//   66  127:bipush          93
	//   67  129:invokevirtual   #905 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   68  132:aload_0         
	//   69  133:aload_0         
	//   70  134:getfield        #165 <Field JsonReadContext _parsingContext>
	//   71  137:invokevirtual   #909 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   72  140:putfield        #165 <Field JsonReadContext _parsingContext>
			_currToken = JsonToken.END_OBJECT;
	//   73  143:aload_0         
	//   74  144:getstatic       #918 <Field JsonToken JsonToken.END_OBJECT>
	//   75  147:putfield        #189 <Field JsonToken _currToken>
			return null;
	//   76  150:aconst_null     
	//   77  151:areturn         
		}
		int i = j;
	//   78  152:iload_2         
	//   79  153:istore_1        
		if(_parsingContext.expectComma())
	//*  80  154:aload_0         
	//*  81  155:getfield        #165 <Field JsonReadContext _parsingContext>
	//*  82  158:invokevirtual   #921 <Method boolean JsonReadContext.expectComma()>
	//*  83  161:ifeq            220
		{
			if(j != 44)
	//*  84  164:iload_2         
	//*  85  165:bipush          44
	//*  86  167:icmpeq          215
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   87  170:new             #331 <Class StringBuilder>
	//   88  173:dup             
	//   89  174:invokespecial   #333 <Method void StringBuilder()>
	//   90  177:astore_3        
				stringbuilder.append("was expecting comma to separate ");
	//   91  178:aload_3         
	//   92  179:ldc2            #923 <String "was expecting comma to separate ">
	//   93  182:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   94  185:pop             
				stringbuilder.append(_parsingContext.typeDesc());
	//   95  186:aload_3         
	//   96  187:aload_0         
	//   97  188:getfield        #165 <Field JsonReadContext _parsingContext>
	//   98  191:invokevirtual   #342 <Method String JsonReadContext.typeDesc()>
	//   99  194:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//  100  197:pop             
				stringbuilder.append(" entries");
	//  101  198:aload_3         
	//  102  199:ldc2            #344 <String " entries">
	//  103  202:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//  104  205:pop             
				_reportUnexpectedChar(j, stringbuilder.toString());
	//  105  206:aload_0         
	//  106  207:iload_2         
	//  107  208:aload_3         
	//  108  209:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  109  212:invokevirtual   #358 <Method void _reportUnexpectedChar(int, String)>
			}
			i = _skipWS();
	//  110  215:aload_0         
	//  111  216:invokespecial   #925 <Method int _skipWS()>
	//  112  219:istore_1        
		}
		if(!_parsingContext.inObject())
	//* 113  220:aload_0         
	//* 114  221:getfield        #165 <Field JsonReadContext _parsingContext>
	//* 115  224:invokevirtual   #915 <Method boolean JsonReadContext.inObject()>
	//* 116  227:ifne            242
		{
			_updateLocation();
	//  117  230:aload_0         
	//  118  231:invokespecial   #196 <Method void _updateLocation()>
			_nextTokenNotInObject(i);
	//  119  234:aload_0         
	//  120  235:iload_1         
	//  121  236:invokespecial   #927 <Method JsonToken _nextTokenNotInObject(int)>
	//  122  239:pop             
			return null;
	//  123  240:aconst_null     
	//  124  241:areturn         
		}
		_updateNameLocation();
	//  125  242:aload_0         
	//  126  243:invokespecial   #929 <Method void _updateNameLocation()>
		String s = _parseName(i);
	//  127  246:aload_0         
	//  128  247:iload_1         
	//  129  248:invokevirtual   #161 <Method String _parseName(int)>
	//  130  251:astore          4
		_parsingContext.setCurrentName(s);
	//  131  253:aload_0         
	//  132  254:getfield        #165 <Field JsonReadContext _parsingContext>
	//  133  257:aload           4
	//  134  259:invokevirtual   #170 <Method void JsonReadContext.setCurrentName(String)>
		_currToken = JsonToken.FIELD_NAME;
	//  135  262:aload_0         
	//  136  263:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//  137  266:putfield        #189 <Field JsonToken _currToken>
		i = _skipColon();
	//  138  269:aload_0         
	//  139  270:invokespecial   #193 <Method int _skipColon()>
	//  140  273:istore_1        
		_updateLocation();
	//  141  274:aload_0         
	//  142  275:invokespecial   #196 <Method void _updateLocation()>
		if(i == 34)
	//* 143  278:iload_1         
	//* 144  279:bipush          34
	//* 145  281:icmpne          299
		{
			_tokenIncomplete = true;
	//  146  284:aload_0         
	//  147  285:iconst_1        
	//  148  286:putfield        #198 <Field boolean _tokenIncomplete>
			_nextToken = JsonToken.VALUE_STRING;
	//  149  289:aload_0         
	//  150  290:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//  151  293:putfield        #204 <Field JsonToken _nextToken>
			return s;
	//  152  296:aload           4
	//  153  298:areturn         
		}
		JsonToken jsontoken;
		if(i != 45)
	//* 154  299:iload_1         
	//* 155  300:bipush          45
	//* 156  302:icmpeq          466
		{
			if(i != 91)
	//* 157  305:iload_1         
	//* 158  306:bipush          91
	//* 159  308:icmpeq          459
			{
				if(i != 102)
	//* 160  311:iload_1         
	//* 161  312:bipush          102
	//* 162  314:icmpeq          445
				{
					if(i != 110)
	//* 163  317:iload_1         
	//* 164  318:bipush          110
	//* 165  320:icmpeq          431
					{
						if(i != 116)
	//* 166  323:iload_1         
	//* 167  324:bipush          116
	//* 168  326:icmpeq          417
						{
							if(i != 123)
	//* 169  329:iload_1         
	//* 170  330:bipush          123
	//* 171  332:icmpeq          410
								switch(i)
	//* 172  335:iload_1         
								{
	//* 173  336:tableswitch     48 57: default 392
	//	               48 401
	//	               49 401
	//	               50 401
	//	               51 401
	//	               52 401
	//	               53 401
	//	               54 401
	//	               55 401
	//	               56 401
	//	               57 401
								default:
									jsontoken = _handleUnexpectedValue(i);
	//  174  392:aload_0         
	//  175  393:iload_1         
	//  176  394:invokevirtual   #208 <Method JsonToken _handleUnexpectedValue(int)>
	//  177  397:astore_3        
									break;

	//* 178  398:goto            471
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
	//  179  401:aload_0         
	//  180  402:iload_1         
	//  181  403:invokevirtual   #211 <Method JsonToken _parsePosNumber(int)>
	//  182  406:astore_3        
									break;
								}
							else
	//* 183  407:goto            471
								jsontoken = JsonToken.START_OBJECT;
	//  184  410:getstatic       #214 <Field JsonToken JsonToken.START_OBJECT>
	//  185  413:astore_3        
						} else
	//* 186  414:goto            471
						{
							_matchToken("true", 1);
	//  187  417:aload_0         
	//  188  418:ldc1            #216 <String "true">
	//  189  420:iconst_1        
	//  190  421:invokevirtual   #220 <Method void _matchToken(String, int)>
							jsontoken = JsonToken.VALUE_TRUE;
	//  191  424:getstatic       #223 <Field JsonToken JsonToken.VALUE_TRUE>
	//  192  427:astore_3        
						}
					} else
	//* 193  428:goto            471
					{
						_matchToken("null", 1);
	//  194  431:aload_0         
	//  195  432:ldc1            #225 <String "null">
	//  196  434:iconst_1        
	//  197  435:invokevirtual   #220 <Method void _matchToken(String, int)>
						jsontoken = JsonToken.VALUE_NULL;
	//  198  438:getstatic       #228 <Field JsonToken JsonToken.VALUE_NULL>
	//  199  441:astore_3        
					}
				} else
	//* 200  442:goto            471
				{
					_matchToken("false", 1);
	//  201  445:aload_0         
	//  202  446:ldc1            #230 <String "false">
	//  203  448:iconst_1        
	//  204  449:invokevirtual   #220 <Method void _matchToken(String, int)>
					jsontoken = JsonToken.VALUE_FALSE;
	//  205  452:getstatic       #233 <Field JsonToken JsonToken.VALUE_FALSE>
	//  206  455:astore_3        
				}
			} else
	//* 207  456:goto            471
			{
				jsontoken = JsonToken.START_ARRAY;
	//  208  459:getstatic       #236 <Field JsonToken JsonToken.START_ARRAY>
	//  209  462:astore_3        
			}
		} else
	//* 210  463:goto            471
		{
			jsontoken = _parseNegNumber();
	//  211  466:aload_0         
	//  212  467:invokevirtual   #240 <Method JsonToken _parseNegNumber()>
	//  213  470:astore_3        
		}
		_nextToken = jsontoken;
	//  214  471:aload_0         
	//  215  472:aload_3         
	//  216  473:putfield        #204 <Field JsonToken _nextToken>
		return s;
	//  217  476:aload           4
	//  218  478:areturn         
	}

	public boolean nextFieldName(SerializableString serializablestring)
		throws IOException
	{
		int i1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		_numTypesValid = 0;
	//    2    3:aload_0         
	//    3    4:iconst_0        
	//    4    5:putfield        #865 <Field int _numTypesValid>
		if(_currToken == JsonToken.FIELD_NAME)
	//*   5    8:aload_0         
	//*   6    9:getfield        #189 <Field JsonToken _currToken>
	//*   7   12:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//*   8   15:if_acmpne       25
		{
			_nextAfterName();
	//    9   18:aload_0         
	//   10   19:invokespecial   #896 <Method JsonToken _nextAfterName()>
	//   11   22:pop             
			return false;
	//   12   23:iconst_0        
	//   13   24:ireturn         
		}
		if(_tokenIncomplete)
	//*  14   25:aload_0         
	//*  15   26:getfield        #198 <Field boolean _tokenIncomplete>
	//*  16   29:ifeq            36
			_skipString();
	//   17   32:aload_0         
	//   18   33:invokevirtual   #898 <Method void _skipString()>
		int j = _skipWSOrEnd();
	//   19   36:aload_0         
	//   20   37:invokespecial   #900 <Method int _skipWSOrEnd()>
	//   21   40:istore_3        
		if(j < 0)
	//*  22   41:iload_3         
	//*  23   42:ifge            56
		{
			close();
	//   24   45:aload_0         
	//   25   46:invokevirtual   #901 <Method void close()>
			_currToken = null;
	//   26   49:aload_0         
	//   27   50:aconst_null     
	//   28   51:putfield        #189 <Field JsonToken _currToken>
			return false;
	//   29   54:iconst_0        
	//   30   55:ireturn         
		}
		_binaryValue = null;
	//   31   56:aload_0         
	//   32   57:aconst_null     
	//   33   58:putfield        #776 <Field byte[] _binaryValue>
		if(j == 93)
	//*  34   61:iload_3         
	//*  35   62:bipush          93
	//*  36   64:icmpne          108
		{
			_updateLocation();
	//   37   67:aload_0         
	//   38   68:invokespecial   #196 <Method void _updateLocation()>
			if(!_parsingContext.inArray())
	//*  39   71:aload_0         
	//*  40   72:getfield        #165 <Field JsonReadContext _parsingContext>
	//*  41   75:invokevirtual   #647 <Method boolean JsonReadContext.inArray()>
	//*  42   78:ifne            88
				_reportMismatchedEndMarker(j, '}');
	//   43   81:aload_0         
	//   44   82:iload_3         
	//   45   83:bipush          125
	//   46   85:invokevirtual   #905 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   47   88:aload_0         
	//   48   89:aload_0         
	//   49   90:getfield        #165 <Field JsonReadContext _parsingContext>
	//   50   93:invokevirtual   #909 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   51   96:putfield        #165 <Field JsonReadContext _parsingContext>
			_currToken = JsonToken.END_ARRAY;
	//   52   99:aload_0         
	//   53  100:getstatic       #912 <Field JsonToken JsonToken.END_ARRAY>
	//   54  103:putfield        #189 <Field JsonToken _currToken>
			return false;
	//   55  106:iconst_0        
	//   56  107:ireturn         
		}
		if(j == 125)
	//*  57  108:iload_3         
	//*  58  109:bipush          125
	//*  59  111:icmpne          155
		{
			_updateLocation();
	//   60  114:aload_0         
	//   61  115:invokespecial   #196 <Method void _updateLocation()>
			if(!_parsingContext.inObject())
	//*  62  118:aload_0         
	//*  63  119:getfield        #165 <Field JsonReadContext _parsingContext>
	//*  64  122:invokevirtual   #915 <Method boolean JsonReadContext.inObject()>
	//*  65  125:ifne            135
				_reportMismatchedEndMarker(j, ']');
	//   66  128:aload_0         
	//   67  129:iload_3         
	//   68  130:bipush          93
	//   69  132:invokevirtual   #905 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   70  135:aload_0         
	//   71  136:aload_0         
	//   72  137:getfield        #165 <Field JsonReadContext _parsingContext>
	//   73  140:invokevirtual   #909 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   74  143:putfield        #165 <Field JsonReadContext _parsingContext>
			_currToken = JsonToken.END_OBJECT;
	//   75  146:aload_0         
	//   76  147:getstatic       #918 <Field JsonToken JsonToken.END_OBJECT>
	//   77  150:putfield        #189 <Field JsonToken _currToken>
			return false;
	//   78  153:iconst_0        
	//   79  154:ireturn         
		}
		int i = j;
	//   80  155:iload_3         
	//   81  156:istore_2        
		if(_parsingContext.expectComma())
	//*  82  157:aload_0         
	//*  83  158:getfield        #165 <Field JsonReadContext _parsingContext>
	//*  84  161:invokevirtual   #921 <Method boolean JsonReadContext.expectComma()>
	//*  85  164:ifeq            228
		{
			if(j != 44)
	//*  86  167:iload_3         
	//*  87  168:bipush          44
	//*  88  170:icmpeq          223
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   89  173:new             #331 <Class StringBuilder>
	//   90  176:dup             
	//   91  177:invokespecial   #333 <Method void StringBuilder()>
	//   92  180:astore          6
				stringbuilder.append("was expecting comma to separate ");
	//   93  182:aload           6
	//   94  184:ldc2            #923 <String "was expecting comma to separate ">
	//   95  187:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   96  190:pop             
				stringbuilder.append(_parsingContext.typeDesc());
	//   97  191:aload           6
	//   98  193:aload_0         
	//   99  194:getfield        #165 <Field JsonReadContext _parsingContext>
	//  100  197:invokevirtual   #342 <Method String JsonReadContext.typeDesc()>
	//  101  200:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//  102  203:pop             
				stringbuilder.append(" entries");
	//  103  204:aload           6
	//  104  206:ldc2            #344 <String " entries">
	//  105  209:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//  106  212:pop             
				_reportUnexpectedChar(j, stringbuilder.toString());
	//  107  213:aload_0         
	//  108  214:iload_3         
	//  109  215:aload           6
	//  110  217:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  111  220:invokevirtual   #358 <Method void _reportUnexpectedChar(int, String)>
			}
			i = _skipWS();
	//  112  223:aload_0         
	//  113  224:invokespecial   #925 <Method int _skipWS()>
	//  114  227:istore_2        
		}
		if(!_parsingContext.inObject())
	//* 115  228:aload_0         
	//* 116  229:getfield        #165 <Field JsonReadContext _parsingContext>
	//* 117  232:invokevirtual   #915 <Method boolean JsonReadContext.inObject()>
	//* 118  235:ifne            250
		{
			_updateLocation();
	//  119  238:aload_0         
	//  120  239:invokespecial   #196 <Method void _updateLocation()>
			_nextTokenNotInObject(i);
	//  121  242:aload_0         
	//  122  243:iload_2         
	//  123  244:invokespecial   #927 <Method JsonToken _nextTokenNotInObject(int)>
	//  124  247:pop             
			return false;
	//  125  248:iconst_0        
	//  126  249:ireturn         
		}
		_updateNameLocation();
	//  127  250:aload_0         
	//  128  251:invokespecial   #929 <Method void _updateNameLocation()>
		if(i == 34)
	//* 129  254:iload_2         
	//* 130  255:bipush          34
	//* 131  257:icmpne          374
		{
			byte abyte0[] = serializablestring.asQuotedUTF8();
	//  132  260:aload_1         
	//  133  261:invokeinterface #933 <Method byte[] SerializableString.asQuotedUTF8()>
	//  134  266:astore          6
			int k = abyte0.length;
	//  135  268:aload           6
	//  136  270:arraylength     
	//  137  271:istore_3        
			if(_inputPtr + k + 4 < _inputEnd)
	//* 138  272:aload_0         
	//* 139  273:getfield        #61  <Field int _inputPtr>
	//* 140  276:iload_3         
	//* 141  277:iadd            
	//* 142  278:iconst_4        
	//* 143  279:iadd            
	//* 144  280:aload_0         
	//* 145  281:getfield        #64  <Field int _inputEnd>
	//* 146  284:icmpge          374
			{
				int j1 = _inputPtr + k;
	//  147  287:aload_0         
	//  148  288:getfield        #61  <Field int _inputPtr>
	//  149  291:iload_3         
	//  150  292:iadd            
	//  151  293:istore          5
				if(_inputBuffer[j1] == 34)
	//* 152  295:aload_0         
	//* 153  296:getfield        #58  <Field byte[] _inputBuffer>
	//* 154  299:iload           5
	//* 155  301:baload          
	//* 156  302:bipush          34
	//* 157  304:icmpne          374
				{
					int l = _inputPtr;
	//  158  307:aload_0         
	//  159  308:getfield        #61  <Field int _inputPtr>
	//  160  311:istore_3        
					do
					{
						if(l == j1)
	//* 161  312:iload_3         
	//* 162  313:iload           5
	//* 163  315:icmpne          344
						{
							_parsingContext.setCurrentName(serializablestring.getValue());
	//  164  318:aload_0         
	//  165  319:getfield        #165 <Field JsonReadContext _parsingContext>
	//  166  322:aload_1         
	//  167  323:invokeinterface #176 <Method String SerializableString.getValue()>
	//  168  328:invokevirtual   #170 <Method void JsonReadContext.setCurrentName(String)>
							_isNextTokenNameYes(_skipColonFast(l + 1));
	//  169  331:aload_0         
	//  170  332:aload_0         
	//  171  333:iload_3         
	//  172  334:iconst_1        
	//  173  335:iadd            
	//  174  336:invokespecial   #935 <Method int _skipColonFast(int)>
	//  175  339:invokespecial   #937 <Method void _isNextTokenNameYes(int)>
							return true;
	//  176  342:iconst_1        
	//  177  343:ireturn         
						}
						if(abyte0[i1] != _inputBuffer[l])
	//* 178  344:aload           6
	//* 179  346:iload           4
	//* 180  348:baload          
	//* 181  349:aload_0         
	//* 182  350:getfield        #58  <Field byte[] _inputBuffer>
	//* 183  353:iload_3         
	//* 184  354:baload          
	//* 185  355:icmpeq          361
							break;
	//  186  358:goto            374
						i1++;
	//  187  361:iload           4
	//  188  363:iconst_1        
	//  189  364:iadd            
	//  190  365:istore          4
						l++;
	//  191  367:iload_3         
	//  192  368:iconst_1        
	//  193  369:iadd            
	//  194  370:istore_3        
					} while(true);
	//  195  371:goto            312
				}
			}
		}
		return _isNextTokenNameMaybe(i, serializablestring);
	//  196  374:aload_0         
	//  197  375:iload_2         
	//  198  376:aload_1         
	//  199  377:invokespecial   #939 <Method boolean _isNextTokenNameMaybe(int, SerializableString)>
	//  200  380:ireturn         
	}

	public int nextIntValue(int i)
		throws IOException
	{
		if(_currToken == JsonToken.FIELD_NAME)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field JsonToken _currToken>
	//*   2    4:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:if_acmpne       98
		{
			_nameCopied = false;
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:putfield        #259 <Field boolean _nameCopied>
			JsonToken jsontoken = _nextToken;
	//    7   15:aload_0         
	//    8   16:getfield        #204 <Field JsonToken _nextToken>
	//    9   19:astore_2        
			_nextToken = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #204 <Field JsonToken _nextToken>
			_currToken = jsontoken;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #189 <Field JsonToken _currToken>
			if(jsontoken == JsonToken.VALUE_NUMBER_INT)
	//*  16   30:aload_2         
	//*  17   31:getstatic       #642 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  18   34:if_acmpne       42
				return getIntValue();
	//   19   37:aload_0         
	//   20   38:invokevirtual   #943 <Method int getIntValue()>
	//   21   41:ireturn         
			if(jsontoken == JsonToken.START_ARRAY)
	//*  22   42:aload_2         
	//*  23   43:getstatic       #236 <Field JsonToken JsonToken.START_ARRAY>
	//*  24   46:if_acmpne       70
			{
				_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   25   49:aload_0         
	//   26   50:aload_0         
	//   27   51:getfield        #165 <Field JsonReadContext _parsingContext>
	//   28   54:aload_0         
	//   29   55:getfield        #262 <Field int _tokenInputRow>
	//   30   58:aload_0         
	//   31   59:getfield        #265 <Field int _tokenInputCol>
	//   32   62:invokevirtual   #269 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   33   65:putfield        #165 <Field JsonReadContext _parsingContext>
				return i;
	//   34   68:iload_1         
	//   35   69:ireturn         
			}
			if(jsontoken == JsonToken.START_OBJECT)
	//*  36   70:aload_2         
	//*  37   71:getstatic       #214 <Field JsonToken JsonToken.START_OBJECT>
	//*  38   74:if_acmpne       96
				_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   39   77:aload_0         
	//   40   78:aload_0         
	//   41   79:getfield        #165 <Field JsonReadContext _parsingContext>
	//   42   82:aload_0         
	//   43   83:getfield        #262 <Field int _tokenInputRow>
	//   44   86:aload_0         
	//   45   87:getfield        #265 <Field int _tokenInputCol>
	//   46   90:invokevirtual   #272 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   47   93:putfield        #165 <Field JsonReadContext _parsingContext>
			return i;
	//   48   96:iload_1         
	//   49   97:ireturn         
		}
		if(nextToken() == JsonToken.VALUE_NUMBER_INT)
	//*  50   98:aload_0         
	//*  51   99:invokevirtual   #893 <Method JsonToken nextToken()>
	//*  52  102:getstatic       #642 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  53  105:if_acmpne       113
			i = getIntValue();
	//   54  108:aload_0         
	//   55  109:invokevirtual   #943 <Method int getIntValue()>
	//   56  112:istore_1        
		return i;
	//   57  113:iload_1         
	//   58  114:ireturn         
	}

	public long nextLongValue(long l)
		throws IOException
	{
		if(_currToken == JsonToken.FIELD_NAME)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field JsonToken _currToken>
	//*   2    4:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:if_acmpne       98
		{
			_nameCopied = false;
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:putfield        #259 <Field boolean _nameCopied>
			JsonToken jsontoken = _nextToken;
	//    7   15:aload_0         
	//    8   16:getfield        #204 <Field JsonToken _nextToken>
	//    9   19:astore_3        
			_nextToken = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #204 <Field JsonToken _nextToken>
			_currToken = jsontoken;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #189 <Field JsonToken _currToken>
			if(jsontoken == JsonToken.VALUE_NUMBER_INT)
	//*  16   30:aload_3         
	//*  17   31:getstatic       #642 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  18   34:if_acmpne       42
				return getLongValue();
	//   19   37:aload_0         
	//   20   38:invokevirtual   #949 <Method long getLongValue()>
	//   21   41:lreturn         
			if(jsontoken == JsonToken.START_ARRAY)
	//*  22   42:aload_3         
	//*  23   43:getstatic       #236 <Field JsonToken JsonToken.START_ARRAY>
	//*  24   46:if_acmpne       70
			{
				_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   25   49:aload_0         
	//   26   50:aload_0         
	//   27   51:getfield        #165 <Field JsonReadContext _parsingContext>
	//   28   54:aload_0         
	//   29   55:getfield        #262 <Field int _tokenInputRow>
	//   30   58:aload_0         
	//   31   59:getfield        #265 <Field int _tokenInputCol>
	//   32   62:invokevirtual   #269 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   33   65:putfield        #165 <Field JsonReadContext _parsingContext>
				return l;
	//   34   68:lload_1         
	//   35   69:lreturn         
			}
			if(jsontoken == JsonToken.START_OBJECT)
	//*  36   70:aload_3         
	//*  37   71:getstatic       #214 <Field JsonToken JsonToken.START_OBJECT>
	//*  38   74:if_acmpne       96
				_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   39   77:aload_0         
	//   40   78:aload_0         
	//   41   79:getfield        #165 <Field JsonReadContext _parsingContext>
	//   42   82:aload_0         
	//   43   83:getfield        #262 <Field int _tokenInputRow>
	//   44   86:aload_0         
	//   45   87:getfield        #265 <Field int _tokenInputCol>
	//   46   90:invokevirtual   #272 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   47   93:putfield        #165 <Field JsonReadContext _parsingContext>
			return l;
	//   48   96:lload_1         
	//   49   97:lreturn         
		}
		if(nextToken() == JsonToken.VALUE_NUMBER_INT)
	//*  50   98:aload_0         
	//*  51   99:invokevirtual   #893 <Method JsonToken nextToken()>
	//*  52  102:getstatic       #642 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  53  105:if_acmpne       113
			l = getLongValue();
	//   54  108:aload_0         
	//   55  109:invokevirtual   #949 <Method long getLongValue()>
	//   56  112:lstore_1        
		return l;
	//   57  113:lload_1         
	//   58  114:lreturn         
	}

	public String nextTextValue()
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field JsonToken _currToken>
	//    2    4:astore_2        
		JsonToken jsontoken1 = JsonToken.FIELD_NAME;
	//    3    5:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
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
	//   12   18:putfield        #259 <Field boolean _nameCopied>
			obj = ((Object) (_nextToken));
	//   13   21:aload_0         
	//   14   22:getfield        #204 <Field JsonToken _nextToken>
	//   15   25:astore_1        
			_nextToken = null;
	//   16   26:aload_0         
	//   17   27:aconst_null     
	//   18   28:putfield        #204 <Field JsonToken _nextToken>
			_currToken = ((JsonToken) (obj));
	//   19   31:aload_0         
	//   20   32:aload_1         
	//   21   33:putfield        #189 <Field JsonToken _currToken>
			if(obj == JsonToken.VALUE_STRING)
	//*  22   36:aload_1         
	//*  23   37:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//*  24   40:if_acmpne       68
				if(_tokenIncomplete)
	//*  25   43:aload_0         
	//*  26   44:getfield        #198 <Field boolean _tokenIncomplete>
	//*  27   47:ifeq            60
				{
					_tokenIncomplete = false;
	//   28   50:aload_0         
	//   29   51:iconst_0        
	//   30   52:putfield        #198 <Field boolean _tokenIncomplete>
					return _finishAndReturnString();
	//   31   55:aload_0         
	//   32   56:invokevirtual   #833 <Method String _finishAndReturnString()>
	//   33   59:areturn         
				} else
				{
					return _textBuffer.contentsAsString();
	//   34   60:aload_0         
	//   35   61:getfield        #116 <Field TextBuffer _textBuffer>
	//   36   64:invokevirtual   #572 <Method String TextBuffer.contentsAsString()>
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
	//   43   77:getfield        #165 <Field JsonReadContext _parsingContext>
	//   44   80:aload_0         
	//   45   81:getfield        #262 <Field int _tokenInputRow>
	//   46   84:aload_0         
	//   47   85:getfield        #265 <Field int _tokenInputCol>
	//   48   88:invokevirtual   #269 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   49   91:putfield        #165 <Field JsonReadContext _parsingContext>
				return null;
	//   50   94:aconst_null     
	//   51   95:areturn         
			}
			if(obj == JsonToken.START_OBJECT)
	//*  52   96:aload_1         
	//*  53   97:getstatic       #214 <Field JsonToken JsonToken.START_OBJECT>
	//*  54  100:if_acmpne       122
				_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   55  103:aload_0         
	//   56  104:aload_0         
	//   57  105:getfield        #165 <Field JsonReadContext _parsingContext>
	//   58  108:aload_0         
	//   59  109:getfield        #262 <Field int _tokenInputRow>
	//   60  112:aload_0         
	//   61  113:getfield        #265 <Field int _tokenInputCol>
	//   62  116:invokevirtual   #272 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   63  119:putfield        #165 <Field JsonReadContext _parsingContext>
			return null;
	//   64  122:aconst_null     
	//   65  123:areturn         
		}
		if(nextToken() == JsonToken.VALUE_STRING)
	//*  66  124:aload_0         
	//*  67  125:invokevirtual   #893 <Method JsonToken nextToken()>
	//*  68  128:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//*  69  131:if_acmpne       139
			obj = ((Object) (getText()));
	//   70  134:aload_0         
	//   71  135:invokevirtual   #795 <Method String getText()>
	//   72  138:astore_1        
		return ((String) (obj));
	//   73  139:aload_1         
	//   74  140:areturn         
	}

	public JsonToken nextToken()
		throws IOException
	{
		if(_currToken == JsonToken.FIELD_NAME)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field JsonToken _currToken>
	//*   2    4:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:if_acmpne       15
			return _nextAfterName();
	//    4   10:aload_0         
	//    5   11:invokespecial   #896 <Method JsonToken _nextAfterName()>
	//    6   14:areturn         
		_numTypesValid = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #865 <Field int _numTypesValid>
		if(_tokenIncomplete)
	//*  10   20:aload_0         
	//*  11   21:getfield        #198 <Field boolean _tokenIncomplete>
	//*  12   24:ifeq            31
			_skipString();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #898 <Method void _skipString()>
		int j = _skipWSOrEnd();
	//   15   31:aload_0         
	//   16   32:invokespecial   #900 <Method int _skipWSOrEnd()>
	//   17   35:istore_2        
		if(j < 0)
	//*  18   36:iload_2         
	//*  19   37:ifge            51
		{
			close();
	//   20   40:aload_0         
	//   21   41:invokevirtual   #901 <Method void close()>
			_currToken = null;
	//   22   44:aload_0         
	//   23   45:aconst_null     
	//   24   46:putfield        #189 <Field JsonToken _currToken>
			return null;
	//   25   49:aconst_null     
	//   26   50:areturn         
		}
		_binaryValue = null;
	//   27   51:aload_0         
	//   28   52:aconst_null     
	//   29   53:putfield        #776 <Field byte[] _binaryValue>
		if(j == 93)
	//*  30   56:iload_2         
	//*  31   57:bipush          93
	//*  32   59:icmpne          105
		{
			_updateLocation();
	//   33   62:aload_0         
	//   34   63:invokespecial   #196 <Method void _updateLocation()>
			if(!_parsingContext.inArray())
	//*  35   66:aload_0         
	//*  36   67:getfield        #165 <Field JsonReadContext _parsingContext>
	//*  37   70:invokevirtual   #647 <Method boolean JsonReadContext.inArray()>
	//*  38   73:ifne            83
				_reportMismatchedEndMarker(j, '}');
	//   39   76:aload_0         
	//   40   77:iload_2         
	//   41   78:bipush          125
	//   42   80:invokevirtual   #905 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   43   83:aload_0         
	//   44   84:aload_0         
	//   45   85:getfield        #165 <Field JsonReadContext _parsingContext>
	//   46   88:invokevirtual   #909 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   47   91:putfield        #165 <Field JsonReadContext _parsingContext>
			JsonToken jsontoken = JsonToken.END_ARRAY;
	//   48   94:getstatic       #912 <Field JsonToken JsonToken.END_ARRAY>
	//   49   97:astore_3        
			_currToken = jsontoken;
	//   50   98:aload_0         
	//   51   99:aload_3         
	//   52  100:putfield        #189 <Field JsonToken _currToken>
			return jsontoken;
	//   53  103:aload_3         
	//   54  104:areturn         
		}
		if(j == 125)
	//*  55  105:iload_2         
	//*  56  106:bipush          125
	//*  57  108:icmpne          154
		{
			_updateLocation();
	//   58  111:aload_0         
	//   59  112:invokespecial   #196 <Method void _updateLocation()>
			if(!_parsingContext.inObject())
	//*  60  115:aload_0         
	//*  61  116:getfield        #165 <Field JsonReadContext _parsingContext>
	//*  62  119:invokevirtual   #915 <Method boolean JsonReadContext.inObject()>
	//*  63  122:ifne            132
				_reportMismatchedEndMarker(j, ']');
	//   64  125:aload_0         
	//   65  126:iload_2         
	//   66  127:bipush          93
	//   67  129:invokevirtual   #905 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   68  132:aload_0         
	//   69  133:aload_0         
	//   70  134:getfield        #165 <Field JsonReadContext _parsingContext>
	//   71  137:invokevirtual   #909 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   72  140:putfield        #165 <Field JsonReadContext _parsingContext>
			JsonToken jsontoken1 = JsonToken.END_OBJECT;
	//   73  143:getstatic       #918 <Field JsonToken JsonToken.END_OBJECT>
	//   74  146:astore_3        
			_currToken = jsontoken1;
	//   75  147:aload_0         
	//   76  148:aload_3         
	//   77  149:putfield        #189 <Field JsonToken _currToken>
			return jsontoken1;
	//   78  152:aload_3         
	//   79  153:areturn         
		}
		int i = j;
	//   80  154:iload_2         
	//   81  155:istore_1        
		if(_parsingContext.expectComma())
	//*  82  156:aload_0         
	//*  83  157:getfield        #165 <Field JsonReadContext _parsingContext>
	//*  84  160:invokevirtual   #921 <Method boolean JsonReadContext.expectComma()>
	//*  85  163:ifeq            222
		{
			if(j != 44)
	//*  86  166:iload_2         
	//*  87  167:bipush          44
	//*  88  169:icmpeq          217
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   89  172:new             #331 <Class StringBuilder>
	//   90  175:dup             
	//   91  176:invokespecial   #333 <Method void StringBuilder()>
	//   92  179:astore_3        
				stringbuilder.append("was expecting comma to separate ");
	//   93  180:aload_3         
	//   94  181:ldc2            #923 <String "was expecting comma to separate ">
	//   95  184:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//   96  187:pop             
				stringbuilder.append(_parsingContext.typeDesc());
	//   97  188:aload_3         
	//   98  189:aload_0         
	//   99  190:getfield        #165 <Field JsonReadContext _parsingContext>
	//  100  193:invokevirtual   #342 <Method String JsonReadContext.typeDesc()>
	//  101  196:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//  102  199:pop             
				stringbuilder.append(" entries");
	//  103  200:aload_3         
	//  104  201:ldc2            #344 <String " entries">
	//  105  204:invokevirtual   #339 <Method StringBuilder StringBuilder.append(String)>
	//  106  207:pop             
				_reportUnexpectedChar(j, stringbuilder.toString());
	//  107  208:aload_0         
	//  108  209:iload_2         
	//  109  210:aload_3         
	//  110  211:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  111  214:invokevirtual   #358 <Method void _reportUnexpectedChar(int, String)>
			}
			i = _skipWS();
	//  112  217:aload_0         
	//  113  218:invokespecial   #925 <Method int _skipWS()>
	//  114  221:istore_1        
		}
		if(!_parsingContext.inObject())
	//* 115  222:aload_0         
	//* 116  223:getfield        #165 <Field JsonReadContext _parsingContext>
	//* 117  226:invokevirtual   #915 <Method boolean JsonReadContext.inObject()>
	//* 118  229:ifne            242
		{
			_updateLocation();
	//  119  232:aload_0         
	//  120  233:invokespecial   #196 <Method void _updateLocation()>
			return _nextTokenNotInObject(i);
	//  121  236:aload_0         
	//  122  237:iload_1         
	//  123  238:invokespecial   #927 <Method JsonToken _nextTokenNotInObject(int)>
	//  124  241:areturn         
		}
		_updateNameLocation();
	//  125  242:aload_0         
	//  126  243:invokespecial   #929 <Method void _updateNameLocation()>
		Object obj = ((Object) (_parseName(i)));
	//  127  246:aload_0         
	//  128  247:iload_1         
	//  129  248:invokevirtual   #161 <Method String _parseName(int)>
	//  130  251:astore_3        
		_parsingContext.setCurrentName(((String) (obj)));
	//  131  252:aload_0         
	//  132  253:getfield        #165 <Field JsonReadContext _parsingContext>
	//  133  256:aload_3         
	//  134  257:invokevirtual   #170 <Method void JsonReadContext.setCurrentName(String)>
		_currToken = JsonToken.FIELD_NAME;
	//  135  260:aload_0         
	//  136  261:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//  137  264:putfield        #189 <Field JsonToken _currToken>
		i = _skipColon();
	//  138  267:aload_0         
	//  139  268:invokespecial   #193 <Method int _skipColon()>
	//  140  271:istore_1        
		_updateLocation();
	//  141  272:aload_0         
	//  142  273:invokespecial   #196 <Method void _updateLocation()>
		if(i == 34)
	//* 143  276:iload_1         
	//* 144  277:bipush          34
	//* 145  279:icmpne          299
		{
			_tokenIncomplete = true;
	//  146  282:aload_0         
	//  147  283:iconst_1        
	//  148  284:putfield        #198 <Field boolean _tokenIncomplete>
			_nextToken = JsonToken.VALUE_STRING;
	//  149  287:aload_0         
	//  150  288:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//  151  291:putfield        #204 <Field JsonToken _nextToken>
			return _currToken;
	//  152  294:aload_0         
	//  153  295:getfield        #189 <Field JsonToken _currToken>
	//  154  298:areturn         
		}
		if(i != 45)
	//* 155  299:iload_1         
	//* 156  300:bipush          45
	//* 157  302:icmpeq          466
		{
			if(i != 91)
	//* 158  305:iload_1         
	//* 159  306:bipush          91
	//* 160  308:icmpeq          459
			{
				if(i != 102)
	//* 161  311:iload_1         
	//* 162  312:bipush          102
	//* 163  314:icmpeq          445
				{
					if(i != 110)
	//* 164  317:iload_1         
	//* 165  318:bipush          110
	//* 166  320:icmpeq          431
					{
						if(i != 116)
	//* 167  323:iload_1         
	//* 168  324:bipush          116
	//* 169  326:icmpeq          417
						{
							if(i != 123)
	//* 170  329:iload_1         
	//* 171  330:bipush          123
	//* 172  332:icmpeq          410
								switch(i)
	//* 173  335:iload_1         
								{
	//* 174  336:tableswitch     48 57: default 392
	//	               48 401
	//	               49 401
	//	               50 401
	//	               51 401
	//	               52 401
	//	               53 401
	//	               54 401
	//	               55 401
	//	               56 401
	//	               57 401
								default:
									obj = ((Object) (_handleUnexpectedValue(i)));
	//  175  392:aload_0         
	//  176  393:iload_1         
	//  177  394:invokevirtual   #208 <Method JsonToken _handleUnexpectedValue(int)>
	//  178  397:astore_3        
									break;

	//* 179  398:goto            471
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
	//  180  401:aload_0         
	//  181  402:iload_1         
	//  182  403:invokevirtual   #211 <Method JsonToken _parsePosNumber(int)>
	//  183  406:astore_3        
									break;
								}
							else
	//* 184  407:goto            471
								obj = ((Object) (JsonToken.START_OBJECT));
	//  185  410:getstatic       #214 <Field JsonToken JsonToken.START_OBJECT>
	//  186  413:astore_3        
						} else
	//* 187  414:goto            471
						{
							_matchToken("true", 1);
	//  188  417:aload_0         
	//  189  418:ldc1            #216 <String "true">
	//  190  420:iconst_1        
	//  191  421:invokevirtual   #220 <Method void _matchToken(String, int)>
							obj = ((Object) (JsonToken.VALUE_TRUE));
	//  192  424:getstatic       #223 <Field JsonToken JsonToken.VALUE_TRUE>
	//  193  427:astore_3        
						}
					} else
	//* 194  428:goto            471
					{
						_matchToken("null", 1);
	//  195  431:aload_0         
	//  196  432:ldc1            #225 <String "null">
	//  197  434:iconst_1        
	//  198  435:invokevirtual   #220 <Method void _matchToken(String, int)>
						obj = ((Object) (JsonToken.VALUE_NULL));
	//  199  438:getstatic       #228 <Field JsonToken JsonToken.VALUE_NULL>
	//  200  441:astore_3        
					}
				} else
	//* 201  442:goto            471
				{
					_matchToken("false", 1);
	//  202  445:aload_0         
	//  203  446:ldc1            #230 <String "false">
	//  204  448:iconst_1        
	//  205  449:invokevirtual   #220 <Method void _matchToken(String, int)>
					obj = ((Object) (JsonToken.VALUE_FALSE));
	//  206  452:getstatic       #233 <Field JsonToken JsonToken.VALUE_FALSE>
	//  207  455:astore_3        
				}
			} else
	//* 208  456:goto            471
			{
				obj = ((Object) (JsonToken.START_ARRAY));
	//  209  459:getstatic       #236 <Field JsonToken JsonToken.START_ARRAY>
	//  210  462:astore_3        
			}
		} else
	//* 211  463:goto            471
		{
			obj = ((Object) (_parseNegNumber()));
	//  212  466:aload_0         
	//  213  467:invokevirtual   #240 <Method JsonToken _parseNegNumber()>
	//  214  470:astore_3        
		}
		_nextToken = ((JsonToken) (obj));
	//  215  471:aload_0         
	//  216  472:aload_3         
	//  217  473:putfield        #204 <Field JsonToken _nextToken>
		return _currToken;
	//  218  476:aload_0         
	//  219  477:getfield        #189 <Field JsonToken _currToken>
	//  220  480:areturn         
	}

	protected final String parseEscapedName(int ai[], int i, int j, int k, int l)
		throws IOException
	{
		int ai2[] = _icLatin1;
	//    0    0:getstatic       #42  <Field int[] _icLatin1>
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
	//*  17   31:ifeq            415
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
	//   36   64:invokestatic    #467 <Method int[] growArrayBy(int[], int)>
	//   37   67:astore          10
							_quadBuffer = ai1;
	//   38   69:aload_0         
	//   39   70:aload           10
	//   40   72:putfield        #50  <Field int[] _quadBuffer>
						}
						ai1[i] = pad(j, l);
	//   41   75:aload           10
	//   42   77:iload_2         
	//   43   78:iload_3         
	//   44   79:iload           5
	//   45   81:invokestatic    #452 <Method int pad(int, int)>
	//   46   84:iastore         
						k = i + 1;
	//   47   85:iload_2         
	//   48   86:iconst_1        
	//   49   87:iadd            
	//   50   88:istore          4
					}
					String s = _symbols.findName(ai1, k);
	//   51   90:aload_0         
	//   52   91:getfield        #56  <Field ByteQuadsCanonicalizer _symbols>
	//   53   94:aload           10
	//   54   96:iload           4
	//   55   98:invokevirtual   #470 <Method String ByteQuadsCanonicalizer.findName(int[], int)>
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
	//   65  118:invokespecial   #456 <Method String addName(int[], int, int)>
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
	//   74  134:ldc2            #706 <String "name">
	//   75  137:invokevirtual   #138 <Method void _throwUnquotedSpace(int, String)>
				else
	//*  76  140:goto            149
					i1 = ((int) (_decodeEscaped()));
	//   77  143:aload_0         
	//   78  144:invokevirtual   #152 <Method char _decodeEscaped()>
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
	//*  92  170:icmple          415
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
	//* 103  189:icmplt          232
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
	//  113  204:invokestatic    #467 <Method int[] growArrayBy(int[], int)>
	//  114  207:astore          10
							_quadBuffer = ai1;
	//  115  209:aload_0         
	//  116  210:aload           10
	//  117  212:putfield        #50  <Field int[] _quadBuffer>
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
						j1 = k1;
	//  128  228:iload           8
	//  129  230:istore          7
					}
					if(i1 < 2048)
	//* 130  232:iload           6
	//* 131  234:sipush          2048
	//* 132  237:icmpge          275
					{
						j = k1 << 8 | (0xc0 | i1 >> 6);
	//  133  240:iload           8
	//  134  242:bipush          8
	//  135  244:ishl            
	//  136  245:sipush          192
	//  137  248:iload           6
	//  138  250:bipush          6
	//  139  252:ishr            
	//  140  253:ior             
	//  141  254:ior             
	//  142  255:istore_3        
						l = j1 + 1;
	//  143  256:iload           7
	//  144  258:iconst_1        
	//  145  259:iadd            
	//  146  260:istore          5
						ai = ai1;
	//  147  262:aload           10
	//  148  264:astore_1        
						i = k;
	//  149  265:iload           4
	//  150  267:istore_2        
						k = l;
	//  151  268:iload           5
	//  152  270:istore          4
					} else
	//* 153  272:goto            387
					{
						k1 = k1 << 8 | (0xe0 | i1 >> 12);
	//  154  275:iload           8
	//  155  277:bipush          8
	//  156  279:ishl            
	//  157  280:sipush          224
	//  158  283:iload           6
	//  159  285:bipush          12
	//  160  287:ishr            
	//  161  288:ior             
	//  162  289:ior             
	//  163  290:istore          8
						j1++;
	//  164  292:iload           7
	//  165  294:iconst_1        
	//  166  295:iadd            
	//  167  296:istore          7
						ai = ai1;
	//  168  298:aload           10
	//  169  300:astore_1        
						i = k;
	//  170  301:iload           4
	//  171  303:istore_2        
						l = k1;
	//  172  304:iload           8
	//  173  306:istore          5
						j = j1;
	//  174  308:iload           7
	//  175  310:istore_3        
						if(j1 >= 4)
	//* 176  311:iload           7
	//* 177  313:iconst_4        
	//* 178  314:icmplt          359
						{
							ai = ai1;
	//  179  317:aload           10
	//  180  319:astore_1        
							if(k >= ai1.length)
	//* 181  320:iload           4
	//* 182  322:aload           10
	//* 183  324:arraylength     
	//* 184  325:icmplt          342
							{
								ai = growArrayBy(ai1, ai1.length);
	//  185  328:aload           10
	//  186  330:aload           10
	//  187  332:arraylength     
	//  188  333:invokestatic    #467 <Method int[] growArrayBy(int[], int)>
	//  189  336:astore_1        
								_quadBuffer = ai;
	//  190  337:aload_0         
	//  191  338:aload_1         
	//  192  339:putfield        #50  <Field int[] _quadBuffer>
							}
							ai[k] = k1;
	//  193  342:aload_1         
	//  194  343:iload           4
	//  195  345:iload           8
	//  196  347:iastore         
							i = k + 1;
	//  197  348:iload           4
	//  198  350:iconst_1        
	//  199  351:iadd            
	//  200  352:istore_2        
							l = 0;
	//  201  353:iconst_0        
	//  202  354:istore          5
							j = l;
	//  203  356:iload           5
	//  204  358:istore_3        
						}
						l = l << 8 | (i1 >> 6 & 0x3f | 0x80);
	//  205  359:iload           5
	//  206  361:bipush          8
	//  207  363:ishl            
	//  208  364:iload           6
	//  209  366:bipush          6
	//  210  368:ishr            
	//  211  369:bipush          63
	//  212  371:iand            
	//  213  372:sipush          128
	//  214  375:ior             
	//  215  376:ior             
	//  216  377:istore          5
						k = j + 1;
	//  217  379:iload_3         
	//  218  380:iconst_1        
	//  219  381:iadd            
	//  220  382:istore          4
						j = l;
	//  221  384:iload           5
	//  222  386:istore_3        
					}
					l = i1 & 0x3f | 0x80;
	//  223  387:iload           6
	//  224  389:bipush          63
	//  225  391:iand            
	//  226  392:sipush          128
	//  227  395:ior             
	//  228  396:istore          5
					k1 = k;
	//  229  398:iload           4
	//  230  400:istore          8
					k = l;
	//  231  402:iload           5
	//  232  404:istore          4
					l1 = j;
	//  233  406:iload_3         
	//  234  407:istore          9
					j1 = i;
	//  235  409:iload_2         
	//  236  410:istore          7
					ai1 = ai;
	//  237  412:aload_1         
	//  238  413:astore          10
				}
			}
			if(k1 < 4)
	//* 239  415:iload           8
	//* 240  417:iconst_4        
	//* 241  418:icmpge          445
			{
				l = k1 + 1;
	//  242  421:iload           8
	//  243  423:iconst_1        
	//  244  424:iadd            
	//  245  425:istore          5
				j = l1 << 8 | k;
	//  246  427:iload           9
	//  247  429:bipush          8
	//  248  431:ishl            
	//  249  432:iload           4
	//  250  434:ior             
	//  251  435:istore_3        
				ai = ai1;
	//  252  436:aload           10
	//  253  438:astore_1        
				i = j1;
	//  254  439:iload           7
	//  255  441:istore_2        
			} else
	//* 256  442:goto            487
			{
				ai = ai1;
	//  257  445:aload           10
	//  258  447:astore_1        
				if(j1 >= ai1.length)
	//* 259  448:iload           7
	//* 260  450:aload           10
	//* 261  452:arraylength     
	//* 262  453:icmplt          470
				{
					ai = growArrayBy(ai1, ai1.length);
	//  263  456:aload           10
	//  264  458:aload           10
	//  265  460:arraylength     
	//  266  461:invokestatic    #467 <Method int[] growArrayBy(int[], int)>
	//  267  464:astore_1        
					_quadBuffer = ai;
	//  268  465:aload_0         
	//  269  466:aload_1         
	//  270  467:putfield        #50  <Field int[] _quadBuffer>
				}
				ai[j1] = l1;
	//  271  470:aload_1         
	//  272  471:iload           7
	//  273  473:iload           9
	//  274  475:iastore         
				j = k;
	//  275  476:iload           4
	//  276  478:istore_3        
				i = j1 + 1;
	//  277  479:iload           7
	//  278  481:iconst_1        
	//  279  482:iadd            
	//  280  483:istore_2        
				l = 1;
	//  281  484:iconst_1        
	//  282  485:istore          5
			}
			if(_inputPtr >= _inputEnd && !_loadMore())
	//* 283  487:aload_0         
	//* 284  488:getfield        #61  <Field int _inputPtr>
	//* 285  491:aload_0         
	//* 286  492:getfield        #64  <Field int _inputEnd>
	//* 287  495:icmplt          515
	//* 288  498:aload_0         
	//* 289  499:invokevirtual   #249 <Method boolean _loadMore()>
	//* 290  502:ifne            515
				_reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
	//  291  505:aload_0         
	//  292  506:ldc2            #435 <String " in field name">
	//  293  509:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//  294  512:invokevirtual   #319 <Method void _reportInvalidEOF(String, JsonToken)>
			ai1 = ((int []) (_inputBuffer));
	//  295  515:aload_0         
	//  296  516:getfield        #58  <Field byte[] _inputBuffer>
	//  297  519:astore          10
			k = _inputPtr;
	//  298  521:aload_0         
	//  299  522:getfield        #61  <Field int _inputPtr>
	//  300  525:istore          4
			_inputPtr = k + 1;
	//  301  527:aload_0         
	//  302  528:iload           4
	//  303  530:iconst_1        
	//  304  531:iadd            
	//  305  532:putfield        #61  <Field int _inputPtr>
			i1 = ai1[k] & 0xff;
	//  306  535:aload           10
	//  307  537:iload           4
	//  308  539:baload          
	//  309  540:sipush          255
	//  310  543:iand            
	//  311  544:istore          6
		} while(true);
	//  312  546:goto            9
	}

	protected final String parseLongName(int i, int j, int k)
		throws IOException
	{
		_quadBuffer[0] = _quad1;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int[] _quadBuffer>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:getfield        #713 <Field int _quad1>
	//    5    9:iastore         
		_quadBuffer[1] = j;
	//    6   10:aload_0         
	//    7   11:getfield        #50  <Field int[] _quadBuffer>
	//    8   14:iconst_1        
	//    9   15:iload_2         
	//   10   16:iastore         
		_quadBuffer[2] = k;
	//   11   17:aload_0         
	//   12   18:getfield        #50  <Field int[] _quadBuffer>
	//   13   21:iconst_2        
	//   14   22:iload_3         
	//   15   23:iastore         
		byte abyte0[] = _inputBuffer;
	//   16   24:aload_0         
	//   17   25:getfield        #58  <Field byte[] _inputBuffer>
	//   18   28:astore          4
		int ai[] = _icLatin1;
	//   19   30:getstatic       #42  <Field int[] _icLatin1>
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
	//*  28   42:getfield        #61  <Field int _inputPtr>
	//*  29   45:iconst_4        
	//*  30   46:iadd            
	//*  31   47:aload_0         
	//*  32   48:getfield        #64  <Field int _inputEnd>
	//*  33   51:icmpgt          346
		{
			k = _inputPtr;
	//   34   54:aload_0         
	//   35   55:getfield        #61  <Field int _inputPtr>
	//   36   58:istore_3        
			_inputPtr = k + 1;
	//   37   59:aload_0         
	//   38   60:iload_3         
	//   39   61:iconst_1        
	//   40   62:iadd            
	//   41   63:putfield        #61  <Field int _inputPtr>
			k = abyte0[k] & 0xff;
	//   42   66:aload           4
	//   43   68:iload_3         
	//   44   69:baload          
	//   45   70:sipush          255
	//   46   73:iand            
	//   47   74:istore_3        
			if(ai[k] != 0)
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
	//   57   90:getfield        #50  <Field int[] _quadBuffer>
	//   58   93:iload_1         
	//   59   94:iload_2         
	//   60   95:iconst_1        
	//   61   96:invokespecial   #953 <Method String findName(int[], int, int, int)>
	//   62   99:areturn         
				else
					return parseEscapedName(_quadBuffer, i, j, k, 1);
	//   63  100:aload_0         
	//   64  101:aload_0         
	//   65  102:getfield        #50  <Field int[] _quadBuffer>
	//   66  105:iload_1         
	//   67  106:iload_2         
	//   68  107:iload_3         
	//   69  108:iconst_1        
	//   70  109:invokevirtual   #481 <Method String parseEscapedName(int[], int, int, int, int)>
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
	//   79  121:getfield        #61  <Field int _inputPtr>
	//   80  124:istore_3        
			_inputPtr = k + 1;
	//   81  125:aload_0         
	//   82  126:iload_3         
	//   83  127:iconst_1        
	//   84  128:iadd            
	//   85  129:putfield        #61  <Field int _inputPtr>
			k = abyte0[k] & 0xff;
	//   86  132:aload           4
	//   87  134:iload_3         
	//   88  135:baload          
	//   89  136:sipush          255
	//   90  139:iand            
	//   91  140:istore_3        
			if(ai[k] != 0)
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
	//  101  156:getfield        #50  <Field int[] _quadBuffer>
	//  102  159:iload_1         
	//  103  160:iload_2         
	//  104  161:iconst_2        
	//  105  162:invokespecial   #953 <Method String findName(int[], int, int, int)>
	//  106  165:areturn         
				else
					return parseEscapedName(_quadBuffer, i, j, k, 2);
	//  107  166:aload_0         
	//  108  167:aload_0         
	//  109  168:getfield        #50  <Field int[] _quadBuffer>
	//  110  171:iload_1         
	//  111  172:iload_2         
	//  112  173:iload_3         
	//  113  174:iconst_2        
	//  114  175:invokevirtual   #481 <Method String parseEscapedName(int[], int, int, int, int)>
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
	//  123  187:getfield        #61  <Field int _inputPtr>
	//  124  190:istore_3        
			_inputPtr = k + 1;
	//  125  191:aload_0         
	//  126  192:iload_3         
	//  127  193:iconst_1        
	//  128  194:iadd            
	//  129  195:putfield        #61  <Field int _inputPtr>
			k = abyte0[k] & 0xff;
	//  130  198:aload           4
	//  131  200:iload_3         
	//  132  201:baload          
	//  133  202:sipush          255
	//  134  205:iand            
	//  135  206:istore_3        
			if(ai[k] != 0)
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
	//  145  222:getfield        #50  <Field int[] _quadBuffer>
	//  146  225:iload_1         
	//  147  226:iload_2         
	//  148  227:iconst_3        
	//  149  228:invokespecial   #953 <Method String findName(int[], int, int, int)>
	//  150  231:areturn         
				else
					return parseEscapedName(_quadBuffer, i, j, k, 3);
	//  151  232:aload_0         
	//  152  233:aload_0         
	//  153  234:getfield        #50  <Field int[] _quadBuffer>
	//  154  237:iload_1         
	//  155  238:iload_2         
	//  156  239:iload_3         
	//  157  240:iconst_3        
	//  158  241:invokevirtual   #481 <Method String parseEscapedName(int[], int, int, int, int)>
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
	//  167  253:getfield        #61  <Field int _inputPtr>
	//  168  256:istore_2        
			_inputPtr = j + 1;
	//  169  257:aload_0         
	//  170  258:iload_2         
	//  171  259:iconst_1        
	//  172  260:iadd            
	//  173  261:putfield        #61  <Field int _inputPtr>
			j = abyte0[j] & 0xff;
	//  174  264:aload           4
	//  175  266:iload_2         
	//  176  267:baload          
	//  177  268:sipush          255
	//  178  271:iand            
	//  179  272:istore_2        
			if(ai[j] != 0)
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
	//  189  288:getfield        #50  <Field int[] _quadBuffer>
	//  190  291:iload_1         
	//  191  292:iload_3         
	//  192  293:iconst_4        
	//  193  294:invokespecial   #953 <Method String findName(int[], int, int, int)>
	//  194  297:areturn         
				else
					return parseEscapedName(_quadBuffer, i, k, j, 4);
	//  195  298:aload_0         
	//  196  299:aload_0         
	//  197  300:getfield        #50  <Field int[] _quadBuffer>
	//  198  303:iload_1         
	//  199  304:iload_3         
	//  200  305:iload_2         
	//  201  306:iconst_4        
	//  202  307:invokevirtual   #481 <Method String parseEscapedName(int[], int, int, int, int)>
	//  203  310:areturn         
			if(i >= _quadBuffer.length)
	//* 204  311:iload_1         
	//* 205  312:aload_0         
	//* 206  313:getfield        #50  <Field int[] _quadBuffer>
	//* 207  316:arraylength     
	//* 208  317:icmplt          332
				_quadBuffer = growArrayBy(_quadBuffer, i);
	//  209  320:aload_0         
	//  210  321:aload_0         
	//  211  322:getfield        #50  <Field int[] _quadBuffer>
	//  212  325:iload_1         
	//  213  326:invokestatic    #467 <Method int[] growArrayBy(int[], int)>
	//  214  329:putfield        #50  <Field int[] _quadBuffer>
			_quadBuffer[i] = k;
	//  215  332:aload_0         
	//  216  333:getfield        #50  <Field int[] _quadBuffer>
	//  217  336:iload_1         
	//  218  337:iload_3         
	//  219  338:iastore         
		}

	//  220  339:iload_1         
	//  221  340:iconst_1        
	//  222  341:iadd            
	//  223  342:istore_1        
	//* 224  343:goto            41
		return parseEscapedName(_quadBuffer, i, 0, j, 0);
	//  225  346:aload_0         
	//  226  347:aload_0         
	//  227  348:getfield        #50  <Field int[] _quadBuffer>
	//  228  351:iload_1         
	//  229  352:iconst_0        
	//  230  353:iload_2         
	//  231  354:iconst_0        
	//  232  355:invokevirtual   #481 <Method String parseEscapedName(int[], int, int, int, int)>
	//  233  358:areturn         
	}

	protected final String parseMediumName(int i)
		throws IOException
	{
		byte abyte0[] = _inputBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field byte[] _inputBuffer>
	//    2    4:astore_3        
		int ai[] = _icLatin1;
	//    3    5:getstatic       #42  <Field int[] _icLatin1>
	//    4    8:astore          4
		int j = _inputPtr;
	//    5   10:aload_0         
	//    6   11:getfield        #61  <Field int _inputPtr>
	//    7   14:istore_2        
		_inputPtr = j + 1;
	//    8   15:aload_0         
	//    9   16:iload_2         
	//   10   17:iconst_1        
	//   11   18:iadd            
	//   12   19:putfield        #61  <Field int _inputPtr>
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
	//   28   45:getfield        #713 <Field int _quad1>
	//   29   48:iload_1         
	//   30   49:iconst_1        
	//   31   50:invokespecial   #954 <Method String findName(int, int, int)>
	//   32   53:areturn         
			else
				return parseName(_quad1, i, j, 1);
	//   33   54:aload_0         
	//   34   55:aload_0         
	//   35   56:getfield        #713 <Field int _quad1>
	//   36   59:iload_1         
	//   37   60:iload_2         
	//   38   61:iconst_1        
	//   39   62:invokespecial   #956 <Method String parseName(int, int, int, int)>
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
	//   48   74:getfield        #61  <Field int _inputPtr>
	//   49   77:istore_2        
		_inputPtr = j + 1;
	//   50   78:aload_0         
	//   51   79:iload_2         
	//   52   80:iconst_1        
	//   53   81:iadd            
	//   54   82:putfield        #61  <Field int _inputPtr>
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
	//   70  108:getfield        #713 <Field int _quad1>
	//   71  111:iload_1         
	//   72  112:iconst_2        
	//   73  113:invokespecial   #954 <Method String findName(int, int, int)>
	//   74  116:areturn         
			else
				return parseName(_quad1, i, j, 2);
	//   75  117:aload_0         
	//   76  118:aload_0         
	//   77  119:getfield        #713 <Field int _quad1>
	//   78  122:iload_1         
	//   79  123:iload_2         
	//   80  124:iconst_2        
	//   81  125:invokespecial   #956 <Method String parseName(int, int, int, int)>
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
	//   90  137:getfield        #61  <Field int _inputPtr>
	//   91  140:istore_2        
		_inputPtr = j + 1;
	//   92  141:aload_0         
	//   93  142:iload_2         
	//   94  143:iconst_1        
	//   95  144:iadd            
	//   96  145:putfield        #61  <Field int _inputPtr>
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
	//  112  171:getfield        #713 <Field int _quad1>
	//  113  174:iload_1         
	//  114  175:iconst_3        
	//  115  176:invokespecial   #954 <Method String findName(int, int, int)>
	//  116  179:areturn         
			else
				return parseName(_quad1, i, j, 3);
	//  117  180:aload_0         
	//  118  181:aload_0         
	//  119  182:getfield        #713 <Field int _quad1>
	//  120  185:iload_1         
	//  121  186:iload_2         
	//  122  187:iconst_3        
	//  123  188:invokespecial   #956 <Method String parseName(int, int, int, int)>
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
	//  132  200:getfield        #61  <Field int _inputPtr>
	//  133  203:istore_2        
		_inputPtr = j + 1;
	//  134  204:aload_0         
	//  135  205:iload_2         
	//  136  206:iconst_1        
	//  137  207:iadd            
	//  138  208:putfield        #61  <Field int _inputPtr>
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
	//  154  234:getfield        #713 <Field int _quad1>
	//  155  237:iload_1         
	//  156  238:iconst_4        
	//  157  239:invokespecial   #954 <Method String findName(int, int, int)>
	//  158  242:areturn         
			else
				return parseName(_quad1, i, j, 4);
	//  159  243:aload_0         
	//  160  244:aload_0         
	//  161  245:getfield        #713 <Field int _quad1>
	//  162  248:iload_1         
	//  163  249:iload_2         
	//  164  250:iconst_4        
	//  165  251:invokespecial   #956 <Method String parseName(int, int, int, int)>
	//  166  254:areturn         
		} else
		{
			return parseMediumName2(j, i);
	//  167  255:aload_0         
	//  168  256:iload_2         
	//  169  257:iload_1         
	//  170  258:invokevirtual   #959 <Method String parseMediumName2(int, int)>
	//  171  261:areturn         
		}
	}

	protected final String parseMediumName2(int i, int j)
		throws IOException
	{
		byte abyte0[] = _inputBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field byte[] _inputBuffer>
	//    2    4:astore          4
		int ai[] = _icLatin1;
	//    3    6:getstatic       #42  <Field int[] _icLatin1>
	//    4    9:astore          5
		int k = _inputPtr;
	//    5   11:aload_0         
	//    6   12:getfield        #61  <Field int _inputPtr>
	//    7   15:istore_3        
		_inputPtr = k + 1;
	//    8   16:aload_0         
	//    9   17:iload_3         
	//   10   18:iconst_1        
	//   11   19:iadd            
	//   12   20:putfield        #61  <Field int _inputPtr>
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
	//   28   47:getfield        #713 <Field int _quad1>
	//   29   50:iload_2         
	//   30   51:iload_1         
	//   31   52:iconst_1        
	//   32   53:invokespecial   #961 <Method String findName(int, int, int, int)>
	//   33   56:areturn         
			else
				return parseName(_quad1, j, i, k, 1);
	//   34   57:aload_0         
	//   35   58:aload_0         
	//   36   59:getfield        #713 <Field int _quad1>
	//   37   62:iload_2         
	//   38   63:iload_1         
	//   39   64:iload_3         
	//   40   65:iconst_1        
	//   41   66:invokespecial   #963 <Method String parseName(int, int, int, int, int)>
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
	//   50   78:getfield        #61  <Field int _inputPtr>
	//   51   81:istore_3        
		_inputPtr = k + 1;
	//   52   82:aload_0         
	//   53   83:iload_3         
	//   54   84:iconst_1        
	//   55   85:iadd            
	//   56   86:putfield        #61  <Field int _inputPtr>
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
	//   72  113:getfield        #713 <Field int _quad1>
	//   73  116:iload_2         
	//   74  117:iload_1         
	//   75  118:iconst_2        
	//   76  119:invokespecial   #961 <Method String findName(int, int, int, int)>
	//   77  122:areturn         
			else
				return parseName(_quad1, j, i, k, 2);
	//   78  123:aload_0         
	//   79  124:aload_0         
	//   80  125:getfield        #713 <Field int _quad1>
	//   81  128:iload_2         
	//   82  129:iload_1         
	//   83  130:iload_3         
	//   84  131:iconst_2        
	//   85  132:invokespecial   #963 <Method String parseName(int, int, int, int, int)>
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
	//   94  144:getfield        #61  <Field int _inputPtr>
	//   95  147:istore_3        
		_inputPtr = k + 1;
	//   96  148:aload_0         
	//   97  149:iload_3         
	//   98  150:iconst_1        
	//   99  151:iadd            
	//  100  152:putfield        #61  <Field int _inputPtr>
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
	//  116  179:getfield        #713 <Field int _quad1>
	//  117  182:iload_2         
	//  118  183:iload_1         
	//  119  184:iconst_3        
	//  120  185:invokespecial   #961 <Method String findName(int, int, int, int)>
	//  121  188:areturn         
			else
				return parseName(_quad1, j, i, k, 3);
	//  122  189:aload_0         
	//  123  190:aload_0         
	//  124  191:getfield        #713 <Field int _quad1>
	//  125  194:iload_2         
	//  126  195:iload_1         
	//  127  196:iload_3         
	//  128  197:iconst_3        
	//  129  198:invokespecial   #963 <Method String parseName(int, int, int, int, int)>
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
	//  138  210:getfield        #61  <Field int _inputPtr>
	//  139  213:istore_3        
		_inputPtr = k + 1;
	//  140  214:aload_0         
	//  141  215:iload_3         
	//  142  216:iconst_1        
	//  143  217:iadd            
	//  144  218:putfield        #61  <Field int _inputPtr>
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
	//  160  245:getfield        #713 <Field int _quad1>
	//  161  248:iload_2         
	//  162  249:iload_1         
	//  163  250:iconst_4        
	//  164  251:invokespecial   #961 <Method String findName(int, int, int, int)>
	//  165  254:areturn         
			else
				return parseName(_quad1, j, i, k, 4);
	//  166  255:aload_0         
	//  167  256:aload_0         
	//  168  257:getfield        #713 <Field int _quad1>
	//  169  260:iload_2         
	//  170  261:iload_1         
	//  171  262:iload_3         
	//  172  263:iconst_4        
	//  173  264:invokespecial   #963 <Method String parseName(int, int, int, int, int)>
	//  174  267:areturn         
		} else
		{
			return parseLongName(k, j, i);
	//  175  268:aload_0         
	//  176  269:iload_3         
	//  177  270:iload_2         
	//  178  271:iload_1         
	//  179  272:invokevirtual   #965 <Method String parseLongName(int, int, int)>
	//  180  275:areturn         
		}
	}

	public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
		throws IOException
	{
		byte abyte0[];
		if(!_tokenIncomplete || _currToken != JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #198 <Field boolean _tokenIncomplete>
	//*   2    4:ifeq            61
	//*   3    7:aload_0         
	//*   4    8:getfield        #189 <Field JsonToken _currToken>
	//*   5   11:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//*   6   14:if_acmpeq       20
			break MISSING_BLOCK_LABEL_61;
	//    7   17:goto            61
		abyte0 = _ioContext.allocBase64Buffer();
	//    8   20:aload_0         
	//    9   21:getfield        #487 <Field IOContext _ioContext>
	//   10   24:invokevirtual   #970 <Method byte[] IOContext.allocBase64Buffer()>
	//   11   27:astore          4
		int i = _readBinary(base64variant, outputstream, abyte0);
	//   12   29:aload_0         
	//   13   30:aload_1         
	//   14   31:aload_2         
	//   15   32:aload           4
	//   16   34:invokevirtual   #972 <Method int _readBinary(Base64Variant, OutputStream, byte[])>
	//   17   37:istore_3        
		_ioContext.releaseBase64Buffer(abyte0);
	//   18   38:aload_0         
	//   19   39:getfield        #487 <Field IOContext _ioContext>
	//   20   42:aload           4
	//   21   44:invokevirtual   #975 <Method void IOContext.releaseBase64Buffer(byte[])>
		return i;
	//   22   47:iload_3         
	//   23   48:ireturn         
		base64variant;
	//   24   49:astore_1        
		_ioContext.releaseBase64Buffer(abyte0);
	//   25   50:aload_0         
	//   26   51:getfield        #487 <Field IOContext _ioContext>
	//   27   54:aload           4
	//   28   56:invokevirtual   #975 <Method void IOContext.releaseBase64Buffer(byte[])>
		throw base64variant;
	//   29   59:aload_1         
	//   30   60:athrow          
		base64variant = ((Base64Variant) (getBinaryValue(base64variant)));
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:invokevirtual   #977 <Method byte[] getBinaryValue(Base64Variant)>
	//   34   66:astore_1        
		outputstream.write(((byte []) (base64variant)));
	//   35   67:aload_2         
	//   36   68:aload_1         
	//   37   69:invokevirtual   #979 <Method void OutputStream.write(byte[])>
		return base64variant.length;
	//   38   72:aload_1         
	//   39   73:arraylength     
	//   40   74:ireturn         
	}

	public int releaseBuffered(OutputStream outputstream)
		throws IOException
	{
		int i = _inputEnd - _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int _inputEnd>
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field int _inputPtr>
	//    4    8:isub            
	//    5    9:istore_2        
		if(i < 1)
	//*   6   10:iload_2         
	//*   7   11:iconst_1        
	//*   8   12:icmpge          17
		{
			return 0;
	//    9   15:iconst_0        
	//   10   16:ireturn         
		} else
		{
			int j = _inputPtr;
	//   11   17:aload_0         
	//   12   18:getfield        #61  <Field int _inputPtr>
	//   13   21:istore_3        
			outputstream.write(_inputBuffer, j, i);
	//   14   22:aload_1         
	//   15   23:aload_0         
	//   16   24:getfield        #58  <Field byte[] _inputBuffer>
	//   17   27:iload_3         
	//   18   28:iload_2         
	//   19   29:invokevirtual   #731 <Method void OutputStream.write(byte[], int, int)>
			return i;
	//   20   32:iload_2         
	//   21   33:ireturn         
		}
	}

	public void setCodec(ObjectCodec objectcodec)
	{
		_objectCodec = objectcodec;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field ObjectCodec _objectCodec>
	//    3    5:return          
	}

	protected String slowParseName()
		throws IOException
	{
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          28
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #249 <Method boolean _loadMore()>
	//*   7   15:ifne            28
			_reportInvalidEOF(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
	//    8   18:aload_0         
	//    9   19:ldc2            #985 <String ": was expecting closing '\"' for name">
	//   10   22:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//   11   25:invokevirtual   #319 <Method void _reportInvalidEOF(String, JsonToken)>
		byte abyte0[] = _inputBuffer;
	//   12   28:aload_0         
	//   13   29:getfield        #58  <Field byte[] _inputBuffer>
	//   14   32:astore_2        
		int i = _inputPtr;
	//   15   33:aload_0         
	//   16   34:getfield        #61  <Field int _inputPtr>
	//   17   37:istore_1        
		_inputPtr = i + 1;
	//   18   38:aload_0         
	//   19   39:iload_1         
	//   20   40:iconst_1        
	//   21   41:iadd            
	//   22   42:putfield        #61  <Field int _inputPtr>
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
	//   32   59:ldc2            #669 <String "">
	//   33   62:areturn         
		else
			return parseEscapedName(_quadBuffer, 0, 0, i, 0);
	//   34   63:aload_0         
	//   35   64:aload_0         
	//   36   65:getfield        #50  <Field int[] _quadBuffer>
	//   37   68:iconst_0        
	//   38   69:iconst_0        
	//   39   70:iload_1         
	//   40   71:iconst_0        
	//   41   72:invokevirtual   #481 <Method String parseEscapedName(int[], int, int, int, int)>
	//   42   75:areturn         
	}

	static final byte BYTE_LF = 10;
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
	//    0    0:invokestatic    #35  <Method int[] CharTypes.getInputCodeUtf8()>
	//    1    3:putstatic       #37  <Field int[] _icUTF8>
	//    2    6:invokestatic    #40  <Method int[] CharTypes.getInputCodeLatin1()>
	//    3    9:putstatic       #42  <Field int[] _icLatin1>
	//*   4   12:return          
	}
}
