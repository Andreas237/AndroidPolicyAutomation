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
			loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #102 <Method void loadMoreGuaranteed()>
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
			loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #102 <Method void loadMoreGuaranteed()>
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
			loadMoreGuaranteed();
	//   39   73:aload_0         
	//   40   74:invokevirtual   #102 <Method void loadMoreGuaranteed()>
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
			loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #102 <Method void loadMoreGuaranteed()>
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
			loadMoreGuaranteed();
	//   39   73:aload_0         
	//   40   74:invokevirtual   #102 <Method void loadMoreGuaranteed()>
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
			loadMoreGuaranteed();
	//   73  135:aload_0         
	//   74  136:invokevirtual   #102 <Method void loadMoreGuaranteed()>
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
label0:
		{
label1:
			{
label2:
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
label3:
					do
					{
						{
							int j;
label4:
							{
								int k = _inputPtr;
	//    7   14:aload_0         
	//    8   15:getfield        #61  <Field int _inputPtr>
	//    9   18:istore          4
								j = k;
	//   10   20:iload           4
	//   11   22:istore_3        
								if(k >= _inputEnd)
	//*  12   23:iload           4
	//*  13   25:aload_0         
	//*  14   26:getfield        #64  <Field int _inputEnd>
	//*  15   29:icmplt          41
								{
									loadMoreGuaranteed();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #102 <Method void loadMoreGuaranteed()>
									j = _inputPtr;
	//   18   36:aload_0         
	//   19   37:getfield        #61  <Field int _inputPtr>
	//   20   40:istore_3        
								}
								ac = ac1;
	//   21   41:aload           6
	//   22   43:astore_1        
								k = i;
	//   23   44:iload_2         
	//   24   45:istore          4
								if(i >= ac1.length)
	//*  25   47:iload_2         
	//*  26   48:aload           6
	//*  27   50:arraylength     
	//*  28   51:icmplt          65
								{
									ac = _textBuffer.finishCurrentSegment();
	//   29   54:aload_0         
	//   30   55:getfield        #116 <Field TextBuffer _textBuffer>
	//   31   58:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
	//   32   61:astore_1        
									k = 0;
	//   33   62:iconst_0        
	//   34   63:istore          4
								}
								int j1 = Math.min(_inputEnd, (ac.length - k) + j);
	//   35   65:aload_0         
	//   36   66:getfield        #64  <Field int _inputEnd>
	//   37   69:aload_1         
	//   38   70:arraylength     
	//   39   71:iload           4
	//   40   73:isub            
	//   41   74:iload_3         
	//   42   75:iadd            
	//   43   76:invokestatic    #128 <Method int Math.min(int, int)>
	//   44   79:istore          5
								i = k;
	//   45   81:iload           4
	//   46   83:istore_2        
								do
								{
									if(j >= j1)
										break;
	//   47   84:iload_3         
	//   48   85:iload           5
	//   49   87:icmpge          147
									int l = j + 1;
	//   50   90:iload_3         
	//   51   91:iconst_1        
	//   52   92:iadd            
	//   53   93:istore          4
									j = abyte0[j] & 0xff;
	//   54   95:aload           8
	//   55   97:iload_3         
	//   56   98:baload          
	//   57   99:sipush          255
	//   58  102:iand            
	//   59  103:istore_3        
									if(ai[j] != 0)
	//*  60  104:aload           7
	//*  61  106:iload_3         
	//*  62  107:iaload          
	//*  63  108:ifeq            132
									{
										_inputPtr = l;
	//   64  111:aload_0         
	//   65  112:iload           4
	//   66  114:putfield        #61  <Field int _inputPtr>
										if(j == 34)
	//*  67  117:iload_3         
	//*  68  118:bipush          34
	//*  69  120:icmpne          158
										{
											_textBuffer.setCurrentLength(i);
	//   70  123:aload_0         
	//   71  124:getfield        #116 <Field TextBuffer _textBuffer>
	//   72  127:iload_2         
	//   73  128:invokevirtual   #132 <Method void TextBuffer.setCurrentLength(int)>
											return;
	//   74  131:return          
										}
										break label4;
									}
									ac[i] = (char)j;
	//   75  132:aload_1         
	//   76  133:iload_2         
	//   77  134:iload_3         
	//   78  135:int2char        
	//   79  136:castore         
									j = l;
	//   80  137:iload           4
	//   81  139:istore_3        
									i++;
	//   82  140:iload_2         
	//   83  141:iconst_1        
	//   84  142:iadd            
	//   85  143:istore_2        
								} while(true);
	//   86  144:goto            84
								_inputPtr = j;
	//   87  147:aload_0         
	//   88  148:iload_3         
	//   89  149:putfield        #61  <Field int _inputPtr>
								ac1 = ac;
	//   90  152:aload_1         
	//   91  153:astore          6
								continue;
	//   92  155:goto            14
							}
							int i1;
							switch(ai[j])
	//*  93  158:aload           7
	//*  94  160:iload_3         
	//*  95  161:iaload          
							{
	//*  96  162:tableswitch     1 4: default 192
	//	               1 244
	//	               2 252
	//	               3 261
	//	               4 292
							default:
								if(j < 32)
	//*  97  192:iload_3         
	//*  98  193:bipush          32
	//*  99  195:icmpge          353
									_throwUnquotedSpace(j, "string value");
	//  100  198:aload_0         
	//  101  199:iload_3         
	//  102  200:ldc1            #134 <String "string value">
	//  103  202:invokevirtual   #138 <Method void _throwUnquotedSpace(int, String)>
								else
	//* 104  205:aload_1         
	//* 105  206:astore          6
	//* 106  208:iload_2         
	//* 107  209:istore          4
	//* 108  211:iload_2         
	//* 109  212:aload_1         
	//* 110  213:arraylength     
	//* 111  214:icmplt          229
	//* 112  217:aload_0         
	//* 113  218:getfield        #116 <Field TextBuffer _textBuffer>
	//* 114  221:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
	//* 115  224:astore          6
	//* 116  226:iconst_0        
	//* 117  227:istore          4
	//* 118  229:aload           6
	//* 119  231:iload           4
	//* 120  233:iload_3         
	//* 121  234:int2char        
	//* 122  235:castore         
	//* 123  236:iload           4
	//* 124  238:iconst_1        
	//* 125  239:iadd            
	//* 126  240:istore_2        
	//* 127  241:goto            14
	//* 128  244:aload_0         
	//* 129  245:invokevirtual   #142 <Method char _decodeEscaped()>
	//* 130  248:istore_3        
	//* 131  249:goto            205
	//* 132  252:aload_0         
	//* 133  253:iload_3         
	//* 134  254:invokespecial   #144 <Method int _decodeUtf8_2(int)>
	//* 135  257:istore_3        
	//* 136  258:goto            205
	//* 137  261:aload_0         
	//* 138  262:getfield        #64  <Field int _inputEnd>
	//* 139  265:aload_0         
	//* 140  266:getfield        #61  <Field int _inputPtr>
	//* 141  269:isub            
	//* 142  270:iconst_2        
	//* 143  271:icmplt          283
	//* 144  274:aload_0         
	//* 145  275:iload_3         
	//* 146  276:invokespecial   #146 <Method int _decodeUtf8_3fast(int)>
	//* 147  279:istore_3        
	//* 148  280:goto            205
	//* 149  283:aload_0         
	//* 150  284:iload_3         
	//* 151  285:invokespecial   #148 <Method int _decodeUtf8_3(int)>
	//* 152  288:istore_3        
	//* 153  289:goto            205
	//* 154  292:aload_0         
	//* 155  293:iload_3         
	//* 156  294:invokespecial   #150 <Method int _decodeUtf8_4(int)>
	//* 157  297:istore          4
	//* 158  299:iload_2         
	//* 159  300:iconst_1        
	//* 160  301:iadd            
	//* 161  302:istore_3        
	//* 162  303:aload_1         
	//* 163  304:iload_2         
	//* 164  305:ldc1            #151 <Int 55296>
	//* 165  307:iload           4
	//* 166  309:bipush          10
	//* 167  311:ishr            
	//* 168  312:ior             
	//* 169  313:int2char        
	//* 170  314:castore         
	//* 171  315:aload_1         
	//* 172  316:astore          6
	//* 173  318:iload_3         
	//* 174  319:istore_2        
	//* 175  320:iload_3         
	//* 176  321:aload_1         
	//* 177  322:arraylength     
	//* 178  323:icmplt          337
	//* 179  326:aload_0         
	//* 180  327:getfield        #116 <Field TextBuffer _textBuffer>
	//* 181  330:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
	//* 182  333:astore          6
	//* 183  335:iconst_0        
	//* 184  336:istore_2        
	//* 185  337:ldc1            #152 <Int 56320>
	//* 186  339:iload           4
	//* 187  341:sipush          1023
	//* 188  344:iand            
	//* 189  345:ior             
	//* 190  346:istore_3        
	//* 191  347:aload           6
	//* 192  349:astore_1        
	//* 193  350:goto            205
									_reportInvalidChar(j);
	//  194  353:aload_0         
	//  195  354:iload_3         
	//  196  355:invokevirtual   #155 <Method void _reportInvalidChar(int)>
								break;

							case 1: // '\001'
								break label3;

							case 2: // '\002'
								break label2;

							case 3: // '\003'
								break label1;

							case 4: // '\004'
								break label0;
							}
						}
						ac1 = ac;
						i1 = i;
						if(i >= ac.length)
						{
							ac1 = _textBuffer.finishCurrentSegment();
							i1 = 0;
						}
						ac1[i1] = (char)j;
						i = i1 + 1;
					} while(true);
					j = ((int) (_decodeEscaped()));
					break MISSING_BLOCK_LABEL_205;
				}
				j = _decodeUtf8_2(j);
				break MISSING_BLOCK_LABEL_205;
			}
			if(_inputEnd - _inputPtr >= 2)
				j = _decodeUtf8_3fast(j);
			else
				j = _decodeUtf8_3(j);
			break MISSING_BLOCK_LABEL_205;
		}
		i1 = _decodeUtf8_4(j);
		j = i + 1;
		ac[i] = (char)(0xd800 | i1 >> 10);
		ac1 = ac;
		i = j;
		if(j >= ac.length)
		{
			ac1 = _textBuffer.finishCurrentSegment();
			i = 0;
		}
		j = 0xdc00 | i1 & 0x3ff;
		ac = ac1;
		break MISSING_BLOCK_LABEL_205;
	//* 197  358:goto            205
	}

	private final boolean _isNextTokenNameMaybe(int i, SerializableString serializablestring)
		throws IOException
	{
		boolean flag;
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
		flag = s.equals(((Object) (serializablestring.getValue())));
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
		i;
	//   32   64:iload_1         
		JVM INSTR lookupswitch 16: default 204
	//	               45: 273
	//	               48: 281
	//	               49: 281
	//	               50: 281
	//	               51: 281
	//	               52: 281
	//	               53: 281
	//	               54: 281
	//	               55: 281
	//	               56: 281
	//	               57: 281
	//	               91: 217
	//	               102: 245
	//	               110: 259
	//	               116: 231
	//	               123: 224;
	//   33   65:lookupswitch    16: default 204
	//	               45: 273
	//	               48: 281
	//	               49: 281
	//	               50: 281
	//	               51: 281
	//	               52: 281
	//	               53: 281
	//	               54: 281
	//	               55: 281
	//	               56: 281
	//	               57: 281
	//	               91: 217
	//	               102: 245
	//	               110: 259
	//	               116: 231
	//	               123: 224
		   goto _L1 _L2 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		serializablestring = ((SerializableString) (_handleUnexpectedValue(i)));
	//   34  204:aload_0         
	//   35  205:iload_1         
	//   36  206:invokevirtual   #208 <Method JsonToken _handleUnexpectedValue(int)>
	//   37  209:astore_2        
_L10:
		_nextToken = ((JsonToken) (serializablestring));
	//   38  210:aload_0         
	//   39  211:aload_2         
	//   40  212:putfield        #204 <Field JsonToken _nextToken>
		return flag;
	//   41  215:iload_3         
	//   42  216:ireturn         
_L4:
		serializablestring = ((SerializableString) (JsonToken.START_ARRAY));
	//   43  217:getstatic       #211 <Field JsonToken JsonToken.START_ARRAY>
	//   44  220:astore_2        
		continue; /* Loop/switch isn't completed */
	//   45  221:goto            210
_L8:
		serializablestring = ((SerializableString) (JsonToken.START_OBJECT));
	//   46  224:getstatic       #214 <Field JsonToken JsonToken.START_OBJECT>
	//   47  227:astore_2        
		continue; /* Loop/switch isn't completed */
	//   48  228:goto            210
_L7:
		_matchToken("true", 1);
	//   49  231:aload_0         
	//   50  232:ldc1            #216 <String "true">
	//   51  234:iconst_1        
	//   52  235:invokevirtual   #220 <Method void _matchToken(String, int)>
		serializablestring = ((SerializableString) (JsonToken.VALUE_TRUE));
	//   53  238:getstatic       #223 <Field JsonToken JsonToken.VALUE_TRUE>
	//   54  241:astore_2        
		continue; /* Loop/switch isn't completed */
	//   55  242:goto            210
_L5:
		_matchToken("false", 1);
	//   56  245:aload_0         
	//   57  246:ldc1            #225 <String "false">
	//   58  248:iconst_1        
	//   59  249:invokevirtual   #220 <Method void _matchToken(String, int)>
		serializablestring = ((SerializableString) (JsonToken.VALUE_FALSE));
	//   60  252:getstatic       #228 <Field JsonToken JsonToken.VALUE_FALSE>
	//   61  255:astore_2        
		continue; /* Loop/switch isn't completed */
	//   62  256:goto            210
_L6:
		_matchToken("null", 1);
	//   63  259:aload_0         
	//   64  260:ldc1            #230 <String "null">
	//   65  262:iconst_1        
	//   66  263:invokevirtual   #220 <Method void _matchToken(String, int)>
		serializablestring = ((SerializableString) (JsonToken.VALUE_NULL));
	//   67  266:getstatic       #233 <Field JsonToken JsonToken.VALUE_NULL>
	//   68  269:astore_2        
		continue; /* Loop/switch isn't completed */
	//   69  270:goto            210
_L2:
		serializablestring = ((SerializableString) (_parseNegNumber()));
	//   70  273:aload_0         
	//   71  274:invokevirtual   #237 <Method JsonToken _parseNegNumber()>
	//   72  277:astore_2        
		continue; /* Loop/switch isn't completed */
	//   73  278:goto            210
_L3:
		serializablestring = ((SerializableString) (_parsePosNumber(i)));
	//   74  281:aload_0         
	//   75  282:iload_1         
	//   76  283:invokevirtual   #240 <Method JsonToken _parsePosNumber(int)>
	//   77  286:astore_2        
		if(true) goto _L10; else goto _L9
	//   78  287:goto            210
_L9:
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
		switch(i)
	//*   5   11:iload_1         
		{
	//*   6   12:lookupswitch    17: default 160
	//	               34: 170
	//	               45: 244
	//	               48: 253
	//	               49: 253
	//	               50: 253
	//	               51: 253
	//	               52: 253
	//	               53: 253
	//	               54: 253
	//	               55: 253
	//	               56: 253
	//	               57: 253
	//	               91: 183
	//	               102: 214
	//	               110: 229
	//	               116: 199
	//	               123: 191
		default:
			_nextToken = _handleUnexpectedValue(i);
	//    7  160:aload_0         
	//    8  161:aload_0         
	//    9  162:iload_1         
	//   10  163:invokevirtual   #208 <Method JsonToken _handleUnexpectedValue(int)>
	//   11  166:putfield        #204 <Field JsonToken _nextToken>
			return;
	//   12  169:return          

		case 34: // '"'
			_tokenIncomplete = true;
	//   13  170:aload_0         
	//   14  171:iconst_1        
	//   15  172:putfield        #198 <Field boolean _tokenIncomplete>
			_nextToken = JsonToken.VALUE_STRING;
	//   16  175:aload_0         
	//   17  176:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//   18  179:putfield        #204 <Field JsonToken _nextToken>
			return;
	//   19  182:return          

		case 91: // '['
			_nextToken = JsonToken.START_ARRAY;
	//   20  183:aload_0         
	//   21  184:getstatic       #211 <Field JsonToken JsonToken.START_ARRAY>
	//   22  187:putfield        #204 <Field JsonToken _nextToken>
			return;
	//   23  190:return          

		case 123: // '{'
			_nextToken = JsonToken.START_OBJECT;
	//   24  191:aload_0         
	//   25  192:getstatic       #214 <Field JsonToken JsonToken.START_OBJECT>
	//   26  195:putfield        #204 <Field JsonToken _nextToken>
			return;
	//   27  198:return          

		case 116: // 't'
			_matchToken("true", 1);
	//   28  199:aload_0         
	//   29  200:ldc1            #216 <String "true">
	//   30  202:iconst_1        
	//   31  203:invokevirtual   #220 <Method void _matchToken(String, int)>
			_nextToken = JsonToken.VALUE_TRUE;
	//   32  206:aload_0         
	//   33  207:getstatic       #223 <Field JsonToken JsonToken.VALUE_TRUE>
	//   34  210:putfield        #204 <Field JsonToken _nextToken>
			return;
	//   35  213:return          

		case 102: // 'f'
			_matchToken("false", 1);
	//   36  214:aload_0         
	//   37  215:ldc1            #225 <String "false">
	//   38  217:iconst_1        
	//   39  218:invokevirtual   #220 <Method void _matchToken(String, int)>
			_nextToken = JsonToken.VALUE_FALSE;
	//   40  221:aload_0         
	//   41  222:getstatic       #228 <Field JsonToken JsonToken.VALUE_FALSE>
	//   42  225:putfield        #204 <Field JsonToken _nextToken>
			return;
	//   43  228:return          

		case 110: // 'n'
			_matchToken("null", 1);
	//   44  229:aload_0         
	//   45  230:ldc1            #230 <String "null">
	//   46  232:iconst_1        
	//   47  233:invokevirtual   #220 <Method void _matchToken(String, int)>
			_nextToken = JsonToken.VALUE_NULL;
	//   48  236:aload_0         
	//   49  237:getstatic       #233 <Field JsonToken JsonToken.VALUE_NULL>
	//   50  240:putfield        #204 <Field JsonToken _nextToken>
			return;
	//   51  243:return          

		case 45: // '-'
			_nextToken = _parseNegNumber();
	//   52  244:aload_0         
	//   53  245:aload_0         
	//   54  246:invokevirtual   #237 <Method JsonToken _parseNegNumber()>
	//   55  249:putfield        #204 <Field JsonToken _nextToken>
			return;
	//   56  252:return          

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
	//   57  253:aload_0         
	//   58  254:aload_0         
	//   59  255:iload_1         
	//   60  256:invokevirtual   #240 <Method JsonToken _parsePosNumber(int)>
	//   61  259:putfield        #204 <Field JsonToken _nextToken>
			return;
	//   62  262:return          
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
			if(_inputPtr >= _inputEnd && !loadMore() || _inputBuffer[_inputPtr] != s.charAt(i))
	//*   3    6:aload_0         
	//*   4    7:getfield        #61  <Field int _inputPtr>
	//*   5   10:aload_0         
	//*   6   11:getfield        #64  <Field int _inputEnd>
	//*   7   14:icmplt          24
	//*   8   17:aload_0         
	//*   9   18:invokevirtual   #249 <Method boolean loadMore()>
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
		if(_inputPtr < _inputEnd || loadMore())
	//*  41   73:aload_0         
	//*  42   74:getfield        #61  <Field int _inputPtr>
	//*  43   77:aload_0         
	//*  44   78:getfield        #64  <Field int _inputEnd>
	//*  45   81:icmplt          92
	//*  46   84:aload_0         
	//*  47   85:invokevirtual   #249 <Method boolean loadMore()>
	//*  48   88:ifne            92
	//*  49   91:return          
	//*  50   92:aload_0         
	//*  51   93:getfield        #58  <Field byte[] _inputBuffer>
	//*  52   96:aload_0         
	//*  53   97:getfield        #61  <Field int _inputPtr>
	//*  54  100:baload          
	//*  55  101:sipush          255
	//*  56  104:iand            
	//*  57  105:istore_2        
			if((i = _inputBuffer[_inputPtr] & 0xff) >= 48 && i != 93 && i != 125)
	//*  58  106:iload_2         
	//*  59  107:bipush          48
	//*  60  109:icmplt          91
	//*  61  112:iload_2         
	//*  62  113:bipush          93
	//*  63  115:icmpeq          91
	//*  64  118:iload_2         
	//*  65  119:bipush          125
	//*  66  121:icmpeq          91
			{
				_checkMatchEnd(s, j, i);
	//   67  124:aload_0         
	//   68  125:aload_1         
	//   69  126:iload_3         
	//   70  127:iload_2         
	//   71  128:invokespecial   #255 <Method void _checkMatchEnd(String, int, int)>
				return;
	//   72  131:return          
			}
	}

	private final JsonToken _nextAfterName()
	{
		JsonToken jsontoken;
		_nameCopied = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #259 <Field boolean _nameCopied>
		jsontoken = _nextToken;
	//    3    5:aload_0         
	//    4    6:getfield        #204 <Field JsonToken _nextToken>
	//    5    9:astore_1        
		_nextToken = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #204 <Field JsonToken _nextToken>
		if(jsontoken != JsonToken.START_ARRAY) goto _L2; else goto _L1
	//    9   15:aload_1         
	//   10   16:getstatic       #211 <Field JsonToken JsonToken.START_ARRAY>
	//   11   19:if_acmpne       48
_L1:
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
_L4:
		_currToken = jsontoken;
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:putfield        #189 <Field JsonToken _currToken>
		return jsontoken;
	//   24   46:aload_1         
	//   25   47:areturn         
_L2:
		if(jsontoken == JsonToken.START_OBJECT)
	//*  26   48:aload_1         
	//*  27   49:getstatic       #214 <Field JsonToken JsonToken.START_OBJECT>
	//*  28   52:if_acmpne       41
			_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   29   55:aload_0         
	//   30   56:aload_0         
	//   31   57:getfield        #165 <Field JsonReadContext _parsingContext>
	//   32   60:aload_0         
	//   33   61:getfield        #262 <Field int _tokenInputRow>
	//   34   64:aload_0         
	//   35   65:getfield        #265 <Field int _tokenInputCol>
	//   36   68:invokevirtual   #272 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   37   71:putfield        #165 <Field JsonReadContext _parsingContext>
		if(true) goto _L4; else goto _L3
	//   38   74:goto            41
_L3:
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
		switch(i)
	//*  13   22:iload_1         
		{
	//*  14   23:lookupswitch    16: default 160
	//	               45: 287
	//	               48: 299
	//	               49: 299
	//	               50: 299
	//	               51: 299
	//	               52: 299
	//	               53: 299
	//	               54: 299
	//	               55: 299
	//	               56: 299
	//	               57: 299
	//	               91: 173
	//	               102: 251
	//	               110: 269
	//	               116: 233
	//	               123: 203
		default:
			JsonToken jsontoken1 = _handleUnexpectedValue(i);
	//   15  160:aload_0         
	//   16  161:iload_1         
	//   17  162:invokevirtual   #208 <Method JsonToken _handleUnexpectedValue(int)>
	//   18  165:astore_2        
			_currToken = jsontoken1;
	//   19  166:aload_0         
	//   20  167:aload_2         
	//   21  168:putfield        #189 <Field JsonToken _currToken>
			return jsontoken1;
	//   22  171:aload_2         
	//   23  172:areturn         

		case 91: // '['
			_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   24  173:aload_0         
	//   25  174:aload_0         
	//   26  175:getfield        #165 <Field JsonReadContext _parsingContext>
	//   27  178:aload_0         
	//   28  179:getfield        #262 <Field int _tokenInputRow>
	//   29  182:aload_0         
	//   30  183:getfield        #265 <Field int _tokenInputCol>
	//   31  186:invokevirtual   #269 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   32  189:putfield        #165 <Field JsonReadContext _parsingContext>
			JsonToken jsontoken2 = JsonToken.START_ARRAY;
	//   33  192:getstatic       #211 <Field JsonToken JsonToken.START_ARRAY>
	//   34  195:astore_2        
			_currToken = jsontoken2;
	//   35  196:aload_0         
	//   36  197:aload_2         
	//   37  198:putfield        #189 <Field JsonToken _currToken>
			return jsontoken2;
	//   38  201:aload_2         
	//   39  202:areturn         

		case 123: // '{'
			_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   40  203:aload_0         
	//   41  204:aload_0         
	//   42  205:getfield        #165 <Field JsonReadContext _parsingContext>
	//   43  208:aload_0         
	//   44  209:getfield        #262 <Field int _tokenInputRow>
	//   45  212:aload_0         
	//   46  213:getfield        #265 <Field int _tokenInputCol>
	//   47  216:invokevirtual   #272 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   48  219:putfield        #165 <Field JsonReadContext _parsingContext>
			JsonToken jsontoken3 = JsonToken.START_OBJECT;
	//   49  222:getstatic       #214 <Field JsonToken JsonToken.START_OBJECT>
	//   50  225:astore_2        
			_currToken = jsontoken3;
	//   51  226:aload_0         
	//   52  227:aload_2         
	//   53  228:putfield        #189 <Field JsonToken _currToken>
			return jsontoken3;
	//   54  231:aload_2         
	//   55  232:areturn         

		case 116: // 't'
			_matchToken("true", 1);
	//   56  233:aload_0         
	//   57  234:ldc1            #216 <String "true">
	//   58  236:iconst_1        
	//   59  237:invokevirtual   #220 <Method void _matchToken(String, int)>
			JsonToken jsontoken4 = JsonToken.VALUE_TRUE;
	//   60  240:getstatic       #223 <Field JsonToken JsonToken.VALUE_TRUE>
	//   61  243:astore_2        
			_currToken = jsontoken4;
	//   62  244:aload_0         
	//   63  245:aload_2         
	//   64  246:putfield        #189 <Field JsonToken _currToken>
			return jsontoken4;
	//   65  249:aload_2         
	//   66  250:areturn         

		case 102: // 'f'
			_matchToken("false", 1);
	//   67  251:aload_0         
	//   68  252:ldc1            #225 <String "false">
	//   69  254:iconst_1        
	//   70  255:invokevirtual   #220 <Method void _matchToken(String, int)>
			JsonToken jsontoken5 = JsonToken.VALUE_FALSE;
	//   71  258:getstatic       #228 <Field JsonToken JsonToken.VALUE_FALSE>
	//   72  261:astore_2        
			_currToken = jsontoken5;
	//   73  262:aload_0         
	//   74  263:aload_2         
	//   75  264:putfield        #189 <Field JsonToken _currToken>
			return jsontoken5;
	//   76  267:aload_2         
	//   77  268:areturn         

		case 110: // 'n'
			_matchToken("null", 1);
	//   78  269:aload_0         
	//   79  270:ldc1            #230 <String "null">
	//   80  272:iconst_1        
	//   81  273:invokevirtual   #220 <Method void _matchToken(String, int)>
			JsonToken jsontoken6 = JsonToken.VALUE_NULL;
	//   82  276:getstatic       #233 <Field JsonToken JsonToken.VALUE_NULL>
	//   83  279:astore_2        
			_currToken = jsontoken6;
	//   84  280:aload_0         
	//   85  281:aload_2         
	//   86  282:putfield        #189 <Field JsonToken _currToken>
			return jsontoken6;
	//   87  285:aload_2         
	//   88  286:areturn         

		case 45: // '-'
			JsonToken jsontoken7 = _parseNegNumber();
	//   89  287:aload_0         
	//   90  288:invokevirtual   #237 <Method JsonToken _parseNegNumber()>
	//   91  291:astore_2        
			_currToken = jsontoken7;
	//   92  292:aload_0         
	//   93  293:aload_2         
	//   94  294:putfield        #189 <Field JsonToken _currToken>
			return jsontoken7;
	//   95  297:aload_2         
	//   96  298:areturn         

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
			JsonToken jsontoken8 = _parsePosNumber(i);
	//   97  299:aload_0         
	//   98  300:iload_1         
	//   99  301:invokevirtual   #240 <Method JsonToken _parsePosNumber(int)>
	//  100  304:astore_2        
			_currToken = jsontoken8;
	//  101  305:aload_0         
	//  102  306:aload_2         
	//  103  307:putfield        #189 <Field JsonToken _currToken>
			return jsontoken8;
	//  104  310:aload_2         
	//  105  311:areturn         
		}
	}

	private final JsonToken _parseFloat(char ac[], int i, int j, boolean flag, int k)
		throws IOException
	{
		int l;
		int i1;
		int j1;
		int l1;
		int i2;
		int j2;
		char ac1[];
		i2 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          11
		l1 = 0;
	//    2    3:iconst_0        
	//    3    4:istore          10
		l = 0;
	//    4    6:iconst_0        
	//    5    7:istore          6
		j2 = 0;
	//    6    9:iconst_0        
	//    7   10:istore          12
		ac1 = ac;
	//    8   12:aload_1         
	//    9   13:astore          14
		i1 = i;
	//   10   15:iload_2         
	//   11   16:istore          7
		j1 = j;
	//   12   18:iload_3         
	//   13   19:istore          8
		if(j != 46) goto _L2; else goto _L1
	//   14   21:iload_3         
	//   15   22:bipush          46
	//   16   24:icmpne          110
_L1:
		int k1;
		ac[i] = (char)j;
	//   17   27:aload_1         
	//   18   28:iload_2         
	//   19   29:iload_3         
	//   20   30:int2char        
	//   21   31:castore         
		i++;
	//   22   32:iload_2         
	//   23   33:iconst_1        
	//   24   34:iadd            
	//   25   35:istore_2        
		k1 = j;
	//   26   36:iload_3         
	//   27   37:istore          9
		j = l1;
	//   28   39:iload           10
	//   29   41:istore_3        
_L9:
		if(_inputPtr < _inputEnd || loadMore()) goto _L4; else goto _L3
	//   30   42:aload_0         
	//   31   43:getfield        #61  <Field int _inputPtr>
	//   32   46:aload_0         
	//   33   47:getfield        #64  <Field int _inputEnd>
	//   34   50:icmplt          493
	//   35   53:aload_0         
	//   36   54:invokevirtual   #249 <Method boolean loadMore()>
	//   37   57:ifne            493
_L3:
		l1 = 1;
	//   38   60:iconst_1        
	//   39   61:istore          10
_L6:
		l = l1;
	//   40   63:iload           10
	//   41   65:istore          6
		i2 = j;
	//   42   67:iload_3         
	//   43   68:istore          11
		ac1 = ac;
	//   44   70:aload_1         
	//   45   71:astore          14
		i1 = i;
	//   46   73:iload_2         
	//   47   74:istore          7
		j1 = k1;
	//   48   76:iload           9
	//   49   78:istore          8
		if(j == 0)
	//*  50   80:iload_3         
	//*  51   81:ifne            110
		{
			reportUnexpectedNumberChar(k1, "Decimal point not followed by a digit");
	//   52   84:aload_0         
	//   53   85:iload           9
	//   54   87:ldc2            #277 <String "Decimal point not followed by a digit">
	//   55   90:invokevirtual   #280 <Method void reportUnexpectedNumberChar(int, String)>
			j1 = k1;
	//   56   93:iload           9
	//   57   95:istore          8
			i1 = i;
	//   58   97:iload_2         
	//   59   98:istore          7
			ac1 = ac;
	//   60  100:aload_1         
	//   61  101:astore          14
			i2 = j;
	//   62  103:iload_3         
	//   63  104:istore          11
			l = l1;
	//   64  106:iload           10
	//   65  108:istore          6
		}
_L2:
label0:
		{
			{
				k1 = 0;
	//   66  110:iconst_0        
	//   67  111:istore          9
				l1 = 0;
	//   68  113:iconst_0        
	//   69  114:istore          10
				int k2;
				if(j1 != 101)
	//*  70  116:iload           8
	//*  71  118:bipush          101
	//*  72  120:icmpeq          141
				{
					i = l;
	//   73  123:iload           6
	//   74  125:istore_2        
					j2 = i1;
	//   75  126:iload           7
	//   76  128:istore          12
					k2 = j1;
	//   77  130:iload           8
	//   78  132:istore          13
					if(j1 != 69)
						break label0;
	//   79  134:iload           8
	//   80  136:bipush          69
	//   81  138:icmpne          441
				}
				ac = ac1;
	//   82  141:aload           14
	//   83  143:astore_1        
				j = i1;
	//   84  144:iload           7
	//   85  146:istore_3        
				if(i1 >= ac1.length)
	//*  86  147:iload           7
	//*  87  149:aload           14
	//*  88  151:arraylength     
	//*  89  152:icmplt          165
				{
					ac = _textBuffer.finishCurrentSegment();
	//   90  155:aload_0         
	//   91  156:getfield        #116 <Field TextBuffer _textBuffer>
	//   92  159:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
	//   93  162:astore_1        
					j = 0;
	//   94  163:iconst_0        
	//   95  164:istore_3        
				}
				i = j + 1;
	//   96  165:iload_3         
	//   97  166:iconst_1        
	//   98  167:iadd            
	//   99  168:istore_2        
				ac[j] = (char)j1;
	//  100  169:aload_1         
	//  101  170:iload_3         
	//  102  171:iload           8
	//  103  173:int2char        
	//  104  174:castore         
				if(_inputPtr >= _inputEnd)
	//* 105  175:aload_0         
	//* 106  176:getfield        #61  <Field int _inputPtr>
	//* 107  179:aload_0         
	//* 108  180:getfield        #64  <Field int _inputEnd>
	//* 109  183:icmplt          190
					loadMoreGuaranteed();
	//  110  186:aload_0         
	//  111  187:invokevirtual   #102 <Method void loadMoreGuaranteed()>
				ac1 = ((char []) (_inputBuffer));
	//  112  190:aload_0         
	//  113  191:getfield        #58  <Field byte[] _inputBuffer>
	//  114  194:astore          14
				j = _inputPtr;
	//  115  196:aload_0         
	//  116  197:getfield        #61  <Field int _inputPtr>
	//  117  200:istore_3        
				_inputPtr = j + 1;
	//  118  201:aload_0         
	//  119  202:iload_3         
	//  120  203:iconst_1        
	//  121  204:iadd            
	//  122  205:putfield        #61  <Field int _inputPtr>
				j = ac1[j] & 0xff;
	//  123  208:aload           14
	//  124  210:iload_3         
	//  125  211:baload          
	//  126  212:sipush          255
	//  127  215:iand            
	//  128  216:istore_3        
				if(j == 45 || j == 43)
	//* 129  217:iload_3         
	//* 130  218:bipush          45
	//* 131  220:icmpeq          229
	//* 132  223:iload_3         
	//* 133  224:bipush          43
	//* 134  226:icmpne          643
				{
					if(i >= ac.length)
	//* 135  229:iload_2         
	//* 136  230:aload_1         
	//* 137  231:arraylength     
	//* 138  232:icmplt          640
					{
						ac = _textBuffer.finishCurrentSegment();
	//  139  235:aload_0         
	//  140  236:getfield        #116 <Field TextBuffer _textBuffer>
	//  141  239:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
	//  142  242:astore_1        
						i = 0;
	//  143  243:iconst_0        
	//  144  244:istore_2        
					}
					ac[i] = (char)j;
	//  145  245:aload_1         
	//  146  246:iload_2         
	//  147  247:iload_3         
	//  148  248:int2char        
	//  149  249:castore         
					if(_inputPtr >= _inputEnd)
	//* 150  250:aload_0         
	//* 151  251:getfield        #61  <Field int _inputPtr>
	//* 152  254:aload_0         
	//* 153  255:getfield        #64  <Field int _inputEnd>
	//* 154  258:icmplt          265
						loadMoreGuaranteed();
	//  155  261:aload_0         
	//  156  262:invokevirtual   #102 <Method void loadMoreGuaranteed()>
					ac1 = ((char []) (_inputBuffer));
	//  157  265:aload_0         
	//  158  266:getfield        #58  <Field byte[] _inputBuffer>
	//  159  269:astore          14
					j = _inputPtr;
	//  160  271:aload_0         
	//  161  272:getfield        #61  <Field int _inputPtr>
	//  162  275:istore_3        
					_inputPtr = j + 1;
	//  163  276:aload_0         
	//  164  277:iload_3         
	//  165  278:iconst_1        
	//  166  279:iadd            
	//  167  280:putfield        #61  <Field int _inputPtr>
					j = ac1[j] & 0xff;
	//  168  283:aload           14
	//  169  285:iload_3         
	//  170  286:baload          
	//  171  287:sipush          255
	//  172  290:iand            
	//  173  291:istore_3        
					i++;
	//  174  292:iload_2         
	//  175  293:iconst_1        
	//  176  294:iadd            
	//  177  295:istore_2        
					k1 = l1;
	//  178  296:iload           10
	//  179  298:istore          9
				} else
	//* 180  300:iload           6
	//* 181  302:istore          10
	//* 182  304:iload           9
	//* 183  306:istore          8
	//* 184  308:iload_2         
	//* 185  309:istore          7
	//* 186  311:iload_3         
	//* 187  312:bipush          57
	//* 188  314:icmpgt          400
	//* 189  317:iload           6
	//* 190  319:istore          10
	//* 191  321:iload           9
	//* 192  323:istore          8
	//* 193  325:iload_2         
	//* 194  326:istore          7
	//* 195  328:iload_3         
	//* 196  329:bipush          48
	//* 197  331:icmplt          400
	//* 198  334:iload           9
	//* 199  336:iconst_1        
	//* 200  337:iadd            
	//* 201  338:istore          8
	//* 202  340:aload_1         
	//* 203  341:astore          14
	//* 204  343:iload_2         
	//* 205  344:istore          7
	//* 206  346:iload_2         
	//* 207  347:aload_1         
	//* 208  348:arraylength     
	//* 209  349:icmplt          364
	//* 210  352:aload_0         
	//* 211  353:getfield        #116 <Field TextBuffer _textBuffer>
	//* 212  356:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
	//* 213  359:astore          14
	//* 214  361:iconst_0        
	//* 215  362:istore          7
	//* 216  364:iload           7
	//* 217  366:iconst_1        
	//* 218  367:iadd            
	//* 219  368:istore_2        
	//* 220  369:aload           14
	//* 221  371:iload           7
	//* 222  373:iload_3         
	//* 223  374:int2char        
	//* 224  375:castore         
	//* 225  376:aload_0         
	//* 226  377:getfield        #61  <Field int _inputPtr>
	//* 227  380:aload_0         
	//* 228  381:getfield        #64  <Field int _inputEnd>
	//* 229  384:icmplt          605
	//* 230  387:aload_0         
	//* 231  388:invokevirtual   #249 <Method boolean loadMore()>
	//* 232  391:ifne            605
	//* 233  394:iconst_1        
	//* 234  395:istore          10
	//* 235  397:iload_2         
	//* 236  398:istore          7
	//* 237  400:iload           10
	//* 238  402:istore_2        
	//* 239  403:iload           8
	//* 240  405:istore          9
	//* 241  407:iload           7
	//* 242  409:istore          12
	//* 243  411:iload_3         
	//* 244  412:istore          13
	//* 245  414:iload           8
	//* 246  416:ifne            441
	//* 247  419:aload_0         
	//* 248  420:iload_3         
	//* 249  421:ldc2            #282 <String "Exponent indicator not followed by a digit">
	//* 250  424:invokevirtual   #280 <Method void reportUnexpectedNumberChar(int, String)>
	//* 251  427:iload_3         
	//* 252  428:istore          13
	//* 253  430:iload           7
	//* 254  432:istore          12
	//* 255  434:iload           8
	//* 256  436:istore          9
	//* 257  438:iload           10
	//* 258  440:istore_2        
	//* 259  441:iload_2         
	//* 260  442:ifne            471
	//* 261  445:aload_0         
	//* 262  446:aload_0         
	//* 263  447:getfield        #61  <Field int _inputPtr>
	//* 264  450:iconst_1        
	//* 265  451:isub            
	//* 266  452:putfield        #61  <Field int _inputPtr>
	//* 267  455:aload_0         
	//* 268  456:getfield        #165 <Field JsonReadContext _parsingContext>
	//* 269  459:invokevirtual   #285 <Method boolean JsonReadContext.inRoot()>
	//* 270  462:ifeq            471
	//* 271  465:aload_0         
	//* 272  466:iload           13
	//* 273  468:invokespecial   #288 <Method void _verifyRootSpace(int)>
	//* 274  471:aload_0         
	//* 275  472:getfield        #116 <Field TextBuffer _textBuffer>
	//* 276  475:iload           12
	//* 277  477:invokevirtual   #132 <Method void TextBuffer.setCurrentLength(int)>
	//* 278  480:aload_0         
	//* 279  481:iload           4
	//* 280  483:iload           5
	//* 281  485:iload           11
	//* 282  487:iload           9
	//* 283  489:invokevirtual   #292 <Method JsonToken resetFloat(boolean, int, int, int)>
	//* 284  492:areturn         
	//* 285  493:aload_0         
	//* 286  494:getfield        #58  <Field byte[] _inputBuffer>
	//* 287  497:astore          14
	//* 288  499:aload_0         
	//* 289  500:getfield        #61  <Field int _inputPtr>
	//* 290  503:istore          6
	//* 291  505:aload_0         
	//* 292  506:iload           6
	//* 293  508:iconst_1        
	//* 294  509:iadd            
	//* 295  510:putfield        #61  <Field int _inputPtr>
	//* 296  513:aload           14
	//* 297  515:iload           6
	//* 298  517:baload          
	//* 299  518:sipush          255
	//* 300  521:iand            
	//* 301  522:istore          6
	//* 302  524:iload           12
	//* 303  526:istore          10
	//* 304  528:iload           6
	//* 305  530:istore          9
	//* 306  532:iload           6
	//* 307  534:bipush          48
	//* 308  536:icmplt          63
	//* 309  539:iload           12
	//* 310  541:istore          10
	//* 311  543:iload           6
	//* 312  545:istore          9
	//* 313  547:iload           6
	//* 314  549:bipush          57
	//* 315  551:icmpgt          63
	//* 316  554:iload_3         
	//* 317  555:iconst_1        
	//* 318  556:iadd            
	//* 319  557:istore          7
	//* 320  559:aload_1         
	//* 321  560:astore          14
	//* 322  562:iload_2         
	//* 323  563:istore_3        
	//* 324  564:iload_2         
	//* 325  565:aload_1         
	//* 326  566:arraylength     
	//* 327  567:icmplt          581
	//* 328  570:aload_0         
	//* 329  571:getfield        #116 <Field TextBuffer _textBuffer>
	//* 330  574:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
	//* 331  577:astore          14
	//* 332  579:iconst_0        
	//* 333  580:istore_3        
	//* 334  581:aload           14
	//* 335  583:iload_3         
	//* 336  584:iload           6
	//* 337  586:int2char        
	//* 338  587:castore         
	//* 339  588:iload_3         
	//* 340  589:iconst_1        
	//* 341  590:iadd            
	//* 342  591:istore_2        
	//* 343  592:iload           7
	//* 344  594:istore_3        
	//* 345  595:aload           14
	//* 346  597:astore_1        
	//* 347  598:iload           6
	//* 348  600:istore          9
	//* 349  602:goto            42
	//* 350  605:aload_0         
	//* 351  606:getfield        #58  <Field byte[] _inputBuffer>
	//* 352  609:astore_1        
	//* 353  610:aload_0         
	//* 354  611:getfield        #61  <Field int _inputPtr>
	//* 355  614:istore_3        
	//* 356  615:aload_0         
	//* 357  616:iload_3         
	//* 358  617:iconst_1        
	//* 359  618:iadd            
	//* 360  619:putfield        #61  <Field int _inputPtr>
	//* 361  622:aload_1         
	//* 362  623:iload_3         
	//* 363  624:baload          
	//* 364  625:sipush          255
	//* 365  628:iand            
	//* 366  629:istore_3        
	//* 367  630:iload           8
	//* 368  632:istore          9
	//* 369  634:aload           14
	//* 370  636:astore_1        
	//* 371  637:goto            300
	//* 372  640:goto            245
				{
					k1 = l1;
	//  373  643:iload           10
	//  374  645:istore          9
				}
			}
			l1 = l;
			j1 = k1;
			i1 = i;
			if(j <= 57)
			{
				l1 = l;
				j1 = k1;
				i1 = i;
				if(j >= 48)
				{
					j1 = k1 + 1;
					ac1 = ac;
					i1 = i;
					if(i >= ac.length)
					{
						ac1 = _textBuffer.finishCurrentSegment();
						i1 = 0;
					}
					i = i1 + 1;
					ac1[i1] = (char)j;
					if(_inputPtr < _inputEnd || loadMore())
						break MISSING_BLOCK_LABEL_605;
					l1 = 1;
					i1 = i;
				}
			}
			i = l1;
			k1 = j1;
			j2 = i1;
			k2 = j;
			if(j1 == 0)
			{
				reportUnexpectedNumberChar(j, "Exponent indicator not followed by a digit");
				k2 = j;
				j2 = i1;
				k1 = j1;
				i = l1;
			}
		}
		if(i == 0)
		{
			_inputPtr = _inputPtr - 1;
			if(_parsingContext.inRoot())
				_verifyRootSpace(k2);
		}
		_textBuffer.setCurrentLength(j2);
		return resetFloat(flag, k, i2, k1);
_L4:
		ac1 = ((char []) (_inputBuffer));
		l = _inputPtr;
		_inputPtr = l + 1;
		l = ac1[l] & 0xff;
		l1 = j2;
		k1 = l;
		if(l < 48) goto _L6; else goto _L5
_L5:
		l1 = j2;
		k1 = l;
		if(l > 57) goto _L6; else goto _L7
_L7:
		i1 = j + 1;
		ac1 = ac;
		j = i;
		if(i >= ac.length)
		{
			ac1 = _textBuffer.finishCurrentSegment();
			j = 0;
		}
		ac1[j] = (char)l;
		i = j + 1;
		j = i1;
		ac = ac1;
		k1 = l;
		if(true) goto _L9; else goto _L8
_L8:
		ac = ((char []) (_inputBuffer));
		j = _inputPtr;
		_inputPtr = j + 1;
		j = ac[j] & 0xff;
		k1 = j1;
		ac = ac1;
		break MISSING_BLOCK_LABEL_300;
	//* 375  647:goto            300
	}

	private final JsonToken _parseNumber2(char ac[], int i, boolean flag, int j)
		throws IOException
	{
		do
		{
			if(_inputPtr >= _inputEnd && !loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          34
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #249 <Method boolean loadMore()>
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
			int l = ac1[k] & 0xff;
	//   28   54:aload           7
	//   29   56:iload           5
	//   30   58:baload          
	//   31   59:sipush          255
	//   32   62:iand            
	//   33   63:istore          6
			if(l > 57 || l < 48)
	//*  34   65:iload           6
	//*  35   67:bipush          57
	//*  36   69:icmpgt          79
	//*  37   72:iload           6
	//*  38   74:bipush          48
	//*  39   76:icmpge          112
			{
				if(l == 46 || l == 101 || l == 69)
	//*  40   79:iload           6
	//*  41   81:bipush          46
	//*  42   83:icmpeq          100
	//*  43   86:iload           6
	//*  44   88:bipush          101
	//*  45   90:icmpeq          100
	//*  46   93:iload           6
	//*  47   95:bipush          69
	//*  48   97:icmpne          161
					return _parseFloat(ac, i, l, flag, j);
	//   49  100:aload_0         
	//   50  101:aload_1         
	//   51  102:iload_2         
	//   52  103:iload           6
	//   53  105:iload_3         
	//   54  106:iload           4
	//   55  108:invokespecial   #300 <Method JsonToken _parseFloat(char[], int, int, boolean, int)>
	//   56  111:areturn         
				break;
			}
			ac1 = ac;
	//   57  112:aload_1         
	//   58  113:astore          7
			k = i;
	//   59  115:iload_2         
	//   60  116:istore          5
			if(i >= ac.length)
	//*  61  118:iload_2         
	//*  62  119:aload_1         
	//*  63  120:arraylength     
	//*  64  121:icmplt          136
			{
				ac1 = _textBuffer.finishCurrentSegment();
	//   65  124:aload_0         
	//   66  125:getfield        #116 <Field TextBuffer _textBuffer>
	//   67  128:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
	//   68  131:astore          7
				k = 0;
	//   69  133:iconst_0        
	//   70  134:istore          5
			}
			ac1[k] = (char)l;
	//   71  136:aload           7
	//   72  138:iload           5
	//   73  140:iload           6
	//   74  142:int2char        
	//   75  143:castore         
			j++;
	//   76  144:iload           4
	//   77  146:iconst_1        
	//   78  147:iadd            
	//   79  148:istore          4
			i = k + 1;
	//   80  150:iload           5
	//   81  152:iconst_1        
	//   82  153:iadd            
	//   83  154:istore_2        
			ac = ac1;
	//   84  155:aload           7
	//   85  157:astore_1        
		} while(true);
	//   86  158:goto            0
		_inputPtr = _inputPtr - 1;
	//   87  161:aload_0         
	//   88  162:aload_0         
	//   89  163:getfield        #61  <Field int _inputPtr>
	//   90  166:iconst_1        
	//   91  167:isub            
	//   92  168:putfield        #61  <Field int _inputPtr>
		_textBuffer.setCurrentLength(i);
	//   93  171:aload_0         
	//   94  172:getfield        #116 <Field TextBuffer _textBuffer>
	//   95  175:iload_2         
	//   96  176:invokevirtual   #132 <Method void TextBuffer.setCurrentLength(int)>
		if(_parsingContext.inRoot())
	//*  97  179:aload_0         
	//*  98  180:getfield        #165 <Field JsonReadContext _parsingContext>
	//*  99  183:invokevirtual   #285 <Method boolean JsonReadContext.inRoot()>
	//* 100  186:ifeq            217
		{
			ac = ((char []) (_inputBuffer));
	//  101  189:aload_0         
	//  102  190:getfield        #58  <Field byte[] _inputBuffer>
	//  103  193:astore_1        
			i = _inputPtr;
	//  104  194:aload_0         
	//  105  195:getfield        #61  <Field int _inputPtr>
	//  106  198:istore_2        
			_inputPtr = i + 1;
	//  107  199:aload_0         
	//  108  200:iload_2         
	//  109  201:iconst_1        
	//  110  202:iadd            
	//  111  203:putfield        #61  <Field int _inputPtr>
			_verifyRootSpace(ac[i] & 0xff);
	//  112  206:aload_0         
	//  113  207:aload_1         
	//  114  208:iload_2         
	//  115  209:baload          
	//  116  210:sipush          255
	//  117  213:iand            
	//  118  214:invokespecial   #288 <Method void _verifyRootSpace(int)>
		}
		return resetInt(flag, j);
	//  119  217:aload_0         
	//  120  218:iload_3         
	//  121  219:iload           4
	//  122  221:invokevirtual   #298 <Method JsonToken resetInt(boolean, int)>
	//  123  224:areturn         
	}

	private final void _skipCComment()
		throws IOException
	{
		int ai[] = CharTypes.getInputCodeComment();
	//    0    0:invokestatic    #304 <Method int[] CharTypes.getInputCodeComment()>
	//    1    3:astore_3        
_L12:
		if(_inputPtr >= _inputEnd && !loadMore()) goto _L2; else goto _L1
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field int _inputPtr>
	//    4    8:aload_0         
	//    5    9:getfield        #64  <Field int _inputEnd>
	//    6   12:icmplt          22
	//    7   15:aload_0         
	//    8   16:invokevirtual   #249 <Method boolean loadMore()>
	//    9   19:ifeq            142
_L1:
		int i;
		int j;
		byte abyte0[] = _inputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #58  <Field byte[] _inputBuffer>
	//   12   26:astore          4
		i = _inputPtr;
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
		j = ai[i];
	//   27   49:aload_3         
	//   28   50:iload_1         
	//   29   51:iaload          
	//   30   52:istore_2        
		if(j == 0)
			continue; /* Loop/switch isn't completed */
	//   31   53:iload_2         
	//   32   54:ifeq            4
		j;
	//   33   57:iload_2         
		JVM INSTR lookupswitch 6: default 116
	//	               2: 203
	//	               3: 211
	//	               4: 219
	//	               10: 175
	//	               13: 196
	//	               42: 124;
	//   34   58:lookupswitch    6: default 116
	//	               2: 203
	//	               3: 211
	//	               4: 219
	//	               10: 175
	//	               13: 196
	//	               42: 124
		   goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
		_reportInvalidChar(i);
	//   35  116:aload_0         
	//   36  117:iload_1         
	//   37  118:invokevirtual   #155 <Method void _reportInvalidChar(int)>
		continue; /* Loop/switch isn't completed */
	//   38  121:goto            4
_L9:
		if(_inputPtr < _inputEnd || loadMore()) goto _L10; else goto _L2
	//   39  124:aload_0         
	//   40  125:getfield        #61  <Field int _inputPtr>
	//   41  128:aload_0         
	//   42  129:getfield        #64  <Field int _inputEnd>
	//   43  132:icmplt          150
	//   44  135:aload_0         
	//   45  136:invokevirtual   #249 <Method boolean loadMore()>
	//   46  139:ifne            150
_L2:
		_reportInvalidEOF(" in a comment");
	//   47  142:aload_0         
	//   48  143:ldc2            #306 <String " in a comment">
	//   49  146:invokevirtual   #309 <Method void _reportInvalidEOF(String)>
		return;
	//   50  149:return          
_L10:
		if(_inputBuffer[_inputPtr] == 47)
	//*  51  150:aload_0         
	//*  52  151:getfield        #58  <Field byte[] _inputBuffer>
	//*  53  154:aload_0         
	//*  54  155:getfield        #61  <Field int _inputPtr>
	//*  55  158:baload          
	//*  56  159:bipush          47
	//*  57  161:icmpne          4
		{
			_inputPtr = _inputPtr + 1;
	//   58  164:aload_0         
	//   59  165:aload_0         
	//   60  166:getfield        #61  <Field int _inputPtr>
	//   61  169:iconst_1        
	//   62  170:iadd            
	//   63  171:putfield        #61  <Field int _inputPtr>
			return;
	//   64  174:return          
		}
		continue; /* Loop/switch isn't completed */
_L7:
		_currInputRow = _currInputRow + 1;
	//   65  175:aload_0         
	//   66  176:aload_0         
	//   67  177:getfield        #312 <Field int _currInputRow>
	//   68  180:iconst_1        
	//   69  181:iadd            
	//   70  182:putfield        #312 <Field int _currInputRow>
		_currInputRowStart = _inputPtr;
	//   71  185:aload_0         
	//   72  186:aload_0         
	//   73  187:getfield        #61  <Field int _inputPtr>
	//   74  190:putfield        #67  <Field int _currInputRowStart>
		continue; /* Loop/switch isn't completed */
	//   75  193:goto            4
_L8:
		_skipCR();
	//   76  196:aload_0         
	//   77  197:invokevirtual   #315 <Method void _skipCR()>
		continue; /* Loop/switch isn't completed */
	//   78  200:goto            4
_L4:
		_skipUtf8_2(i);
	//   79  203:aload_0         
	//   80  204:iload_1         
	//   81  205:invokespecial   #318 <Method void _skipUtf8_2(int)>
		continue; /* Loop/switch isn't completed */
	//   82  208:goto            4
_L5:
		_skipUtf8_3(i);
	//   83  211:aload_0         
	//   84  212:iload_1         
	//   85  213:invokespecial   #321 <Method void _skipUtf8_3(int)>
		continue; /* Loop/switch isn't completed */
	//   86  216:goto            4
_L6:
		_skipUtf8_4(i);
	//   87  219:aload_0         
	//   88  220:iload_1         
	//   89  221:invokespecial   #324 <Method void _skipUtf8_4(int)>
		if(true) goto _L12; else goto _L11
	//   90  224:goto            4
_L11:
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
	//    9   15:invokespecial   #328 <Method int _skipColon2(boolean)>
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
	//*  19   32:icmpne          167
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
	//*  37   59:icmple          92
					if(i == 47 || i == 35)
	//*  38   62:iload_1         
	//*  39   63:bipush          47
	//*  40   65:icmpeq          74
	//*  41   68:iload_1         
	//*  42   69:bipush          35
	//*  43   71:icmpne          80
					{
						return _skipColon2(true);
	//   44   74:aload_0         
	//   45   75:iconst_1        
	//   46   76:invokespecial   #328 <Method int _skipColon2(boolean)>
	//   47   79:ireturn         
					} else
					{
						_inputPtr = _inputPtr + 1;
	//   48   80:aload_0         
	//   49   81:aload_0         
	//   50   82:getfield        #61  <Field int _inputPtr>
	//   51   85:iconst_1        
	//   52   86:iadd            
	//   53   87:putfield        #61  <Field int _inputPtr>
						return i;
	//   54   90:iload_1         
	//   55   91:ireturn         
					}
				if(i == 32 || i == 9)
	//*  56   92:iload_1         
	//*  57   93:bipush          32
	//*  58   95:icmpeq          104
	//*  59   98:iload_1         
	//*  60   99:bipush          9
	//*  61  101:icmpne          161
				{
					byte abyte1[] = _inputBuffer;
	//   62  104:aload_0         
	//   63  105:getfield        #58  <Field byte[] _inputBuffer>
	//   64  108:astore_3        
					int j = _inputPtr + 1;
	//   65  109:aload_0         
	//   66  110:getfield        #61  <Field int _inputPtr>
	//   67  113:iconst_1        
	//   68  114:iadd            
	//   69  115:istore_1        
					_inputPtr = j;
	//   70  116:aload_0         
	//   71  117:iload_1         
	//   72  118:putfield        #61  <Field int _inputPtr>
					j = ((int) (abyte1[j]));
	//   73  121:aload_3         
	//   74  122:iload_1         
	//   75  123:baload          
	//   76  124:istore_1        
					if(j > 32)
	//*  77  125:iload_1         
	//*  78  126:bipush          32
	//*  79  128:icmple          161
						if(j == 47 || j == 35)
	//*  80  131:iload_1         
	//*  81  132:bipush          47
	//*  82  134:icmpeq          143
	//*  83  137:iload_1         
	//*  84  138:bipush          35
	//*  85  140:icmpne          149
						{
							return _skipColon2(true);
	//   86  143:aload_0         
	//   87  144:iconst_1        
	//   88  145:invokespecial   #328 <Method int _skipColon2(boolean)>
	//   89  148:ireturn         
						} else
						{
							_inputPtr = _inputPtr + 1;
	//   90  149:aload_0         
	//   91  150:aload_0         
	//   92  151:getfield        #61  <Field int _inputPtr>
	//   93  154:iconst_1        
	//   94  155:iadd            
	//   95  156:putfield        #61  <Field int _inputPtr>
							return j;
	//   96  159:iload_1         
	//   97  160:ireturn         
						}
				}
				return _skipColon2(true);
	//   98  161:aload_0         
	//   99  162:iconst_1        
	//  100  163:invokespecial   #328 <Method int _skipColon2(boolean)>
	//  101  166:ireturn         
			}
			if(byte0 != 32)
	//* 102  167:iload_2         
	//* 103  168:bipush          32
	//* 104  170:icmpeq          181
			{
				k = ((int) (byte0));
	//  105  173:iload_2         
	//  106  174:istore_1        
				if(byte0 != 9)
					break label0;
	//  107  175:iload_2         
	//  108  176:bipush          9
	//  109  178:icmpne          202
			}
			byte abyte2[] = _inputBuffer;
	//  110  181:aload_0         
	//  111  182:getfield        #58  <Field byte[] _inputBuffer>
	//  112  185:astore_3        
			k = _inputPtr + 1;
	//  113  186:aload_0         
	//  114  187:getfield        #61  <Field int _inputPtr>
	//  115  190:iconst_1        
	//  116  191:iadd            
	//  117  192:istore_1        
			_inputPtr = k;
	//  118  193:aload_0         
	//  119  194:iload_1         
	//  120  195:putfield        #61  <Field int _inputPtr>
			k = ((int) (abyte2[k]));
	//  121  198:aload_3         
	//  122  199:iload_1         
	//  123  200:baload          
	//  124  201:istore_1        
		}
		if(k == 58)
	//* 125  202:iload_1         
	//* 126  203:bipush          58
	//* 127  205:icmpne          340
		{
			byte abyte3[] = _inputBuffer;
	//  128  208:aload_0         
	//  129  209:getfield        #58  <Field byte[] _inputBuffer>
	//  130  212:astore_3        
			int l = _inputPtr + 1;
	//  131  213:aload_0         
	//  132  214:getfield        #61  <Field int _inputPtr>
	//  133  217:iconst_1        
	//  134  218:iadd            
	//  135  219:istore_1        
			_inputPtr = l;
	//  136  220:aload_0         
	//  137  221:iload_1         
	//  138  222:putfield        #61  <Field int _inputPtr>
			l = ((int) (abyte3[l]));
	//  139  225:aload_3         
	//  140  226:iload_1         
	//  141  227:baload          
	//  142  228:istore_1        
			if(l > 32)
	//* 143  229:iload_1         
	//* 144  230:bipush          32
	//* 145  232:icmple          265
				if(l == 47 || l == 35)
	//* 146  235:iload_1         
	//* 147  236:bipush          47
	//* 148  238:icmpeq          247
	//* 149  241:iload_1         
	//* 150  242:bipush          35
	//* 151  244:icmpne          253
				{
					return _skipColon2(true);
	//  152  247:aload_0         
	//  153  248:iconst_1        
	//  154  249:invokespecial   #328 <Method int _skipColon2(boolean)>
	//  155  252:ireturn         
				} else
				{
					_inputPtr = _inputPtr + 1;
	//  156  253:aload_0         
	//  157  254:aload_0         
	//  158  255:getfield        #61  <Field int _inputPtr>
	//  159  258:iconst_1        
	//  160  259:iadd            
	//  161  260:putfield        #61  <Field int _inputPtr>
					return l;
	//  162  263:iload_1         
	//  163  264:ireturn         
				}
			if(l == 32 || l == 9)
	//* 164  265:iload_1         
	//* 165  266:bipush          32
	//* 166  268:icmpeq          277
	//* 167  271:iload_1         
	//* 168  272:bipush          9
	//* 169  274:icmpne          334
			{
				byte abyte4[] = _inputBuffer;
	//  170  277:aload_0         
	//  171  278:getfield        #58  <Field byte[] _inputBuffer>
	//  172  281:astore_3        
				int i1 = _inputPtr + 1;
	//  173  282:aload_0         
	//  174  283:getfield        #61  <Field int _inputPtr>
	//  175  286:iconst_1        
	//  176  287:iadd            
	//  177  288:istore_1        
				_inputPtr = i1;
	//  178  289:aload_0         
	//  179  290:iload_1         
	//  180  291:putfield        #61  <Field int _inputPtr>
				i1 = ((int) (abyte4[i1]));
	//  181  294:aload_3         
	//  182  295:iload_1         
	//  183  296:baload          
	//  184  297:istore_1        
				if(i1 > 32)
	//* 185  298:iload_1         
	//* 186  299:bipush          32
	//* 187  301:icmple          334
					if(i1 == 47 || i1 == 35)
	//* 188  304:iload_1         
	//* 189  305:bipush          47
	//* 190  307:icmpeq          316
	//* 191  310:iload_1         
	//* 192  311:bipush          35
	//* 193  313:icmpne          322
					{
						return _skipColon2(true);
	//  194  316:aload_0         
	//  195  317:iconst_1        
	//  196  318:invokespecial   #328 <Method int _skipColon2(boolean)>
	//  197  321:ireturn         
					} else
					{
						_inputPtr = _inputPtr + 1;
	//  198  322:aload_0         
	//  199  323:aload_0         
	//  200  324:getfield        #61  <Field int _inputPtr>
	//  201  327:iconst_1        
	//  202  328:iadd            
	//  203  329:putfield        #61  <Field int _inputPtr>
						return i1;
	//  204  332:iload_1         
	//  205  333:ireturn         
					}
			}
			return _skipColon2(true);
	//  206  334:aload_0         
	//  207  335:iconst_1        
	//  208  336:invokespecial   #328 <Method int _skipColon2(boolean)>
	//  209  339:ireturn         
		} else
		{
			return _skipColon2(false);
	//  210  340:aload_0         
	//  211  341:iconst_0        
	//  212  342:invokespecial   #328 <Method int _skipColon2(boolean)>
	//  213  345:ireturn         
		}
	}

	private final int _skipColon2(boolean flag)
		throws IOException
	{
		do
		{
			if(_inputPtr >= _inputEnd && !loadMore())
				break;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int _inputPtr>
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field int _inputEnd>
	//    4    8:icmplt          18
	//    5   11:aload_0         
	//    6   12:invokevirtual   #249 <Method boolean loadMore()>
	//    7   15:ifeq            171
			byte abyte0[] = _inputBuffer;
	//    8   18:aload_0         
	//    9   19:getfield        #58  <Field byte[] _inputBuffer>
	//   10   22:astore_3        
			int i = _inputPtr;
	//   11   23:aload_0         
	//   12   24:getfield        #61  <Field int _inputPtr>
	//   13   27:istore_2        
			_inputPtr = i + 1;
	//   14   28:aload_0         
	//   15   29:iload_2         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:putfield        #61  <Field int _inputPtr>
			i = abyte0[i] & 0xff;
	//   19   35:aload_3         
	//   20   36:iload_2         
	//   21   37:baload          
	//   22   38:sipush          255
	//   23   41:iand            
	//   24   42:istore_2        
			if(i > 32)
	//*  25   43:iload_2         
	//*  26   44:bipush          32
	//*  27   46:icmple          111
			{
				if(i == 47)
	//*  28   49:iload_2         
	//*  29   50:bipush          47
	//*  30   52:icmpne          62
					_skipComment();
	//   31   55:aload_0         
	//   32   56:invokespecial   #331 <Method void _skipComment()>
				else
	//*  33   59:goto            0
				if(i != 35 || !_skipYAMLComment())
	//*  34   62:iload_2         
	//*  35   63:bipush          35
	//*  36   65:icmpne          75
	//*  37   68:aload_0         
	//*  38   69:invokespecial   #334 <Method boolean _skipYAMLComment()>
	//*  39   72:ifne            0
				{
					if(flag)
	//*  40   75:iload_1         
	//*  41   76:ifeq            81
						return i;
	//   42   79:iload_2         
	//   43   80:ireturn         
					if(i != 58)
	//*  44   81:iload_2         
	//*  45   82:bipush          58
	//*  46   84:icmpeq          106
					{
						if(i < 32)
	//*  47   87:iload_2         
	//*  48   88:bipush          32
	//*  49   90:icmpge          98
							_throwInvalidSpace(i);
	//   50   93:aload_0         
	//   51   94:iload_2         
	//   52   95:invokevirtual   #337 <Method void _throwInvalidSpace(int)>
						_reportUnexpectedChar(i, "was expecting a colon to separate field name and value");
	//   53   98:aload_0         
	//   54   99:iload_2         
	//   55  100:ldc2            #339 <String "was expecting a colon to separate field name and value">
	//   56  103:invokevirtual   #342 <Method void _reportUnexpectedChar(int, String)>
					}
					flag = true;
	//   57  106:iconst_1        
	//   58  107:istore_1        
				}
			} else
	//*  59  108:goto            0
			if(i != 32)
	//*  60  111:iload_2         
	//*  61  112:bipush          32
	//*  62  114:icmpeq          0
				if(i == 10)
	//*  63  117:iload_2         
	//*  64  118:bipush          10
	//*  65  120:icmpne          144
				{
					_currInputRow = _currInputRow + 1;
	//   66  123:aload_0         
	//   67  124:aload_0         
	//   68  125:getfield        #312 <Field int _currInputRow>
	//   69  128:iconst_1        
	//   70  129:iadd            
	//   71  130:putfield        #312 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   72  133:aload_0         
	//   73  134:aload_0         
	//   74  135:getfield        #61  <Field int _inputPtr>
	//   75  138:putfield        #67  <Field int _currInputRowStart>
				} else
	//*  76  141:goto            0
				if(i == 13)
	//*  77  144:iload_2         
	//*  78  145:bipush          13
	//*  79  147:icmpne          157
					_skipCR();
	//   80  150:aload_0         
	//   81  151:invokevirtual   #315 <Method void _skipCR()>
				else
	//*  82  154:goto            0
				if(i != 9)
	//*  83  157:iload_2         
	//*  84  158:bipush          9
	//*  85  160:icmpeq          0
					_throwInvalidSpace(i);
	//   86  163:aload_0         
	//   87  164:iload_2         
	//   88  165:invokevirtual   #337 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   89  168:goto            0
		throw _constructError((new StringBuilder()).append("Unexpected end-of-input within/between ").append(_parsingContext.getTypeDesc()).append(" entries").toString());
	//   90  171:aload_0         
	//   91  172:new             #344 <Class StringBuilder>
	//   92  175:dup             
	//   93  176:invokespecial   #346 <Method void StringBuilder()>
	//   94  179:ldc2            #348 <String "Unexpected end-of-input within/between ">
	//   95  182:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   96  185:aload_0         
	//   97  186:getfield        #165 <Field JsonReadContext _parsingContext>
	//   98  189:invokevirtual   #355 <Method String JsonReadContext.getTypeDesc()>
	//   99  192:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//  100  195:ldc2            #357 <String " entries">
	//  101  198:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//  102  201:invokevirtual   #360 <Method String StringBuilder.toString()>
	//  103  204:invokevirtual   #364 <Method JsonParseException _constructError(String)>
	//  104  207:athrow          
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
	//   83  130:invokespecial   #328 <Method int _skipColon2(boolean)>
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
				k = ((int) (byte1));
	//   88  141:iload           4
	//   89  143:istore_2        
				i = l;
	//   90  144:iload_3         
	//   91  145:istore_1        
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
	//  176  277:invokespecial   #328 <Method int _skipColon2(boolean)>
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
	//  185  290:invokespecial   #328 <Method int _skipColon2(boolean)>
	//  186  293:ireturn         
	}

	private final void _skipComment()
		throws IOException
	{
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #371 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_COMMENTS>
	//*   2    4:invokevirtual   #375 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   3    7:ifne            19
			_reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
	//    4   10:aload_0         
	//    5   11:bipush          47
	//    6   13:ldc2            #377 <String "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)">
	//    7   16:invokevirtual   #342 <Method void _reportUnexpectedChar(int, String)>
		if(_inputPtr >= _inputEnd && !loadMore())
	//*   8   19:aload_0         
	//*   9   20:getfield        #61  <Field int _inputPtr>
	//*  10   23:aload_0         
	//*  11   24:getfield        #64  <Field int _inputEnd>
	//*  12   27:icmplt          44
	//*  13   30:aload_0         
	//*  14   31:invokevirtual   #249 <Method boolean loadMore()>
	//*  15   34:ifne            44
			_reportInvalidEOF(" in a comment");
	//   16   37:aload_0         
	//   17   38:ldc2            #306 <String " in a comment">
	//   18   41:invokevirtual   #309 <Method void _reportInvalidEOF(String)>
		byte abyte0[] = _inputBuffer;
	//   19   44:aload_0         
	//   20   45:getfield        #58  <Field byte[] _inputBuffer>
	//   21   48:astore_2        
		int i = _inputPtr;
	//   22   49:aload_0         
	//   23   50:getfield        #61  <Field int _inputPtr>
	//   24   53:istore_1        
		_inputPtr = i + 1;
	//   25   54:aload_0         
	//   26   55:iload_1         
	//   27   56:iconst_1        
	//   28   57:iadd            
	//   29   58:putfield        #61  <Field int _inputPtr>
		i = abyte0[i] & 0xff;
	//   30   61:aload_2         
	//   31   62:iload_1         
	//   32   63:baload          
	//   33   64:sipush          255
	//   34   67:iand            
	//   35   68:istore_1        
		if(i == 47)
	//*  36   69:iload_1         
	//*  37   70:bipush          47
	//*  38   72:icmpne          80
		{
			_skipLine();
	//   39   75:aload_0         
	//   40   76:invokespecial   #380 <Method void _skipLine()>
			return;
	//   41   79:return          
		}
		if(i == 42)
	//*  42   80:iload_1         
	//*  43   81:bipush          42
	//*  44   83:icmpne          91
		{
			_skipCComment();
	//   45   86:aload_0         
	//   46   87:invokespecial   #382 <Method void _skipCComment()>
			return;
	//   47   90:return          
		} else
		{
			_reportUnexpectedChar(i, "was expecting either '*' or '/' for a comment");
	//   48   91:aload_0         
	//   49   92:iload_1         
	//   50   93:ldc2            #384 <String "was expecting either '*' or '/' for a comment">
	//   51   96:invokevirtual   #342 <Method void _reportUnexpectedChar(int, String)>
			return;
	//   52   99:return          
		}
	}

	private final void _skipLine()
		throws IOException
	{
		int ai[] = CharTypes.getInputCodeComment();
	//    0    0:invokestatic    #304 <Method int[] CharTypes.getInputCodeComment()>
	//    1    3:astore_3        
		do
		{
			int i;
label0:
			{
label1:
				{
label2:
					{
label3:
						{
							if(_inputPtr < _inputEnd || loadMore())
	//*   2    4:aload_0         
	//*   3    5:getfield        #61  <Field int _inputPtr>
	//*   4    8:aload_0         
	//*   5    9:getfield        #64  <Field int _inputEnd>
	//*   6   12:icmplt          22
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #249 <Method boolean loadMore()>
	//*   9   19:ifeq            146
							{
								byte abyte0[] = _inputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #58  <Field byte[] _inputBuffer>
	//   12   26:astore          4
								i = _inputPtr;
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
								switch(j)
	//*  33   57:iload_2         
								{
	//*  34   58:lookupswitch    6: default 116
	//	               2: 152
	//	               3: 160
	//	               4: 168
	//	               10: 128
	//	               13: 147
	//	               42: 4
								default:
									if(j < 0)
	//*  35  116:iload_2         
	//*  36  117:ifge            4
										_reportInvalidChar(i);
	//   37  120:aload_0         
	//   38  121:iload_1         
	//   39  122:invokevirtual   #155 <Method void _reportInvalidChar(int)>
									continue;
	//   40  125:goto            4

								case 2: // '\002'
									break label2;

								case 3: // '\003'
									break label1;

								case 4: // '\004'
									break label0;

								case 13: // '\r'
									break label3;

								case 42: // '*'
									continue;

								case 10: // '\n'
									_currInputRow = _currInputRow + 1;
	//   41  128:aload_0         
	//   42  129:aload_0         
	//   43  130:getfield        #312 <Field int _currInputRow>
	//   44  133:iconst_1        
	//   45  134:iadd            
	//   46  135:putfield        #312 <Field int _currInputRow>
									_currInputRowStart = _inputPtr;
	//   47  138:aload_0         
	//   48  139:aload_0         
	//   49  140:getfield        #61  <Field int _inputPtr>
	//   50  143:putfield        #67  <Field int _currInputRowStart>
									break;
								}
							}
							return;
	//   51  146:return          
						}
						_skipCR();
	//   52  147:aload_0         
	//   53  148:invokevirtual   #315 <Method void _skipCR()>
						return;
	//   54  151:return          
					}
					_skipUtf8_2(i);
	//   55  152:aload_0         
	//   56  153:iload_1         
	//   57  154:invokespecial   #318 <Method void _skipUtf8_2(int)>
					continue;
	//   58  157:goto            4
				}
				_skipUtf8_3(i);
	//   59  160:aload_0         
	//   60  161:iload_1         
	//   61  162:invokespecial   #321 <Method void _skipUtf8_3(int)>
				continue;
	//   62  165:goto            4
			}
			_skipUtf8_4(i);
	//   63  168:aload_0         
	//   64  169:iload_1         
	//   65  170:invokespecial   #324 <Method void _skipUtf8_4(int)>
		} while(true);
	//   66  173:goto            4
	}

	private final void _skipUtf8_2(int i)
		throws IOException
	{
		if(_inputPtr >= _inputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          15
			loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #102 <Method void loadMoreGuaranteed()>
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
	//   34   60:return          
	}

	private final void _skipUtf8_3(int i)
		throws IOException
	{
		if(_inputPtr >= _inputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          15
			loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #102 <Method void loadMoreGuaranteed()>
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
			loadMoreGuaranteed();
	//   39   71:aload_0         
	//   40   72:invokevirtual   #102 <Method void loadMoreGuaranteed()>
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
			loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #102 <Method void loadMoreGuaranteed()>
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
			loadMoreGuaranteed();
	//   39   71:aload_0         
	//   40   72:invokevirtual   #102 <Method void loadMoreGuaranteed()>
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
			loadMoreGuaranteed();
	//   73  131:aload_0         
	//   74  132:invokevirtual   #102 <Method void loadMoreGuaranteed()>
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
label0:
		do
		{
			int j;
label1:
			{
				int i;
label2:
				{
					if(_inputPtr >= _inputEnd)
						break label0;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int _inputPtr>
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field int _inputEnd>
	//    4    8:icmpge          133
					byte abyte0[] = _inputBuffer;
	//    5   11:aload_0         
	//    6   12:getfield        #58  <Field byte[] _inputBuffer>
	//    7   15:astore_3        
					i = _inputPtr;
	//    8   16:aload_0         
	//    9   17:getfield        #61  <Field int _inputPtr>
	//   10   20:istore_1        
					_inputPtr = i + 1;
	//   11   21:aload_0         
	//   12   22:iload_1         
	//   13   23:iconst_1        
	//   14   24:iadd            
	//   15   25:putfield        #61  <Field int _inputPtr>
					j = abyte0[i] & 0xff;
	//   16   28:aload_3         
	//   17   29:iload_1         
	//   18   30:baload          
	//   19   31:sipush          255
	//   20   34:iand            
	//   21   35:istore_2        
					if(j <= 32)
						break label1;
	//   22   36:iload_2         
	//   23   37:bipush          32
	//   24   39:icmple          73
					if(j != 47)
	//*  25   42:iload_2         
	//*  26   43:bipush          47
	//*  27   45:icmpeq          56
					{
						i = j;
	//   28   48:iload_2         
	//   29   49:istore_1        
						if(j != 35)
							break label2;
	//   30   50:iload_2         
	//   31   51:bipush          35
	//   32   53:icmpne          71
					}
					_inputPtr = _inputPtr - 1;
	//   33   56:aload_0         
	//   34   57:aload_0         
	//   35   58:getfield        #61  <Field int _inputPtr>
	//   36   61:iconst_1        
	//   37   62:isub            
	//   38   63:putfield        #61  <Field int _inputPtr>
					i = _skipWS2();
	//   39   66:aload_0         
	//   40   67:invokespecial   #388 <Method int _skipWS2()>
	//   41   70:istore_1        
				}
				return i;
	//   42   71:iload_1         
	//   43   72:ireturn         
			}
			if(j != 32)
	//*  44   73:iload_2         
	//*  45   74:bipush          32
	//*  46   76:icmpeq          0
				if(j == 10)
	//*  47   79:iload_2         
	//*  48   80:bipush          10
	//*  49   82:icmpne          106
				{
					_currInputRow = _currInputRow + 1;
	//   50   85:aload_0         
	//   51   86:aload_0         
	//   52   87:getfield        #312 <Field int _currInputRow>
	//   53   90:iconst_1        
	//   54   91:iadd            
	//   55   92:putfield        #312 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   56   95:aload_0         
	//   57   96:aload_0         
	//   58   97:getfield        #61  <Field int _inputPtr>
	//   59  100:putfield        #67  <Field int _currInputRowStart>
				} else
	//*  60  103:goto            0
				if(j == 13)
	//*  61  106:iload_2         
	//*  62  107:bipush          13
	//*  63  109:icmpne          119
					_skipCR();
	//   64  112:aload_0         
	//   65  113:invokevirtual   #315 <Method void _skipCR()>
				else
	//*  66  116:goto            0
				if(j != 9)
	//*  67  119:iload_2         
	//*  68  120:bipush          9
	//*  69  122:icmpeq          0
					_throwInvalidSpace(j);
	//   70  125:aload_0         
	//   71  126:iload_2         
	//   72  127:invokevirtual   #337 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   73  130:goto            0
		return _skipWS2();
	//   74  133:aload_0         
	//   75  134:invokespecial   #388 <Method int _skipWS2()>
	//   76  137:ireturn         
	}

	private final int _skipWS2()
		throws IOException
	{
		do
		{
			if(_inputPtr >= _inputEnd && !loadMore())
				break;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int _inputPtr>
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field int _inputEnd>
	//    4    8:icmplt          18
	//    5   11:aload_0         
	//    6   12:invokevirtual   #249 <Method boolean loadMore()>
	//    7   15:ifeq            137
			byte abyte0[] = _inputBuffer;
	//    8   18:aload_0         
	//    9   19:getfield        #58  <Field byte[] _inputBuffer>
	//   10   22:astore_2        
			int i = _inputPtr;
	//   11   23:aload_0         
	//   12   24:getfield        #61  <Field int _inputPtr>
	//   13   27:istore_1        
			_inputPtr = i + 1;
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:putfield        #61  <Field int _inputPtr>
			i = abyte0[i] & 0xff;
	//   19   35:aload_2         
	//   20   36:iload_1         
	//   21   37:baload          
	//   22   38:sipush          255
	//   23   41:iand            
	//   24   42:istore_1        
			if(i > 32)
	//*  25   43:iload_1         
	//*  26   44:bipush          32
	//*  27   46:icmple          77
			{
				if(i == 47)
	//*  28   49:iload_1         
	//*  29   50:bipush          47
	//*  30   52:icmpne          62
					_skipComment();
	//   31   55:aload_0         
	//   32   56:invokespecial   #331 <Method void _skipComment()>
				else
	//*  33   59:goto            0
				if(i != 35 || !_skipYAMLComment())
	//*  34   62:iload_1         
	//*  35   63:bipush          35
	//*  36   65:icmpne          75
	//*  37   68:aload_0         
	//*  38   69:invokespecial   #334 <Method boolean _skipYAMLComment()>
	//*  39   72:ifne            0
					return i;
	//   40   75:iload_1         
	//   41   76:ireturn         
			} else
			if(i != 32)
	//*  42   77:iload_1         
	//*  43   78:bipush          32
	//*  44   80:icmpeq          0
				if(i == 10)
	//*  45   83:iload_1         
	//*  46   84:bipush          10
	//*  47   86:icmpne          110
				{
					_currInputRow = _currInputRow + 1;
	//   48   89:aload_0         
	//   49   90:aload_0         
	//   50   91:getfield        #312 <Field int _currInputRow>
	//   51   94:iconst_1        
	//   52   95:iadd            
	//   53   96:putfield        #312 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   54   99:aload_0         
	//   55  100:aload_0         
	//   56  101:getfield        #61  <Field int _inputPtr>
	//   57  104:putfield        #67  <Field int _currInputRowStart>
				} else
	//*  58  107:goto            0
				if(i == 13)
	//*  59  110:iload_1         
	//*  60  111:bipush          13
	//*  61  113:icmpne          123
					_skipCR();
	//   62  116:aload_0         
	//   63  117:invokevirtual   #315 <Method void _skipCR()>
				else
	//*  64  120:goto            0
				if(i != 9)
	//*  65  123:iload_1         
	//*  66  124:bipush          9
	//*  67  126:icmpeq          0
					_throwInvalidSpace(i);
	//   68  129:aload_0         
	//   69  130:iload_1         
	//   70  131:invokevirtual   #337 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   71  134:goto            0
		throw _constructError((new StringBuilder()).append("Unexpected end-of-input within/between ").append(_parsingContext.getTypeDesc()).append(" entries").toString());
	//   72  137:aload_0         
	//   73  138:new             #344 <Class StringBuilder>
	//   74  141:dup             
	//   75  142:invokespecial   #346 <Method void StringBuilder()>
	//   76  145:ldc2            #348 <String "Unexpected end-of-input within/between ">
	//   77  148:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   78  151:aload_0         
	//   79  152:getfield        #165 <Field JsonReadContext _parsingContext>
	//   80  155:invokevirtual   #355 <Method String JsonReadContext.getTypeDesc()>
	//   81  158:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   82  161:ldc2            #357 <String " entries">
	//   83  164:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   84  167:invokevirtual   #360 <Method String StringBuilder.toString()>
	//   85  170:invokevirtual   #364 <Method JsonParseException _constructError(String)>
	//   86  173:athrow          
	}

	private final int _skipWSOrEnd()
		throws IOException
	{
		if(_inputPtr < _inputEnd || loadMore()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int _inputPtr>
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field int _inputEnd>
	//    4    8:icmplt          25
	//    5   11:aload_0         
	//    6   12:invokevirtual   #249 <Method boolean loadMore()>
	//    7   15:ifne            25
_L1:
		int i = _eofAsNextChar();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #392 <Method int _eofAsNextChar()>
	//   10   22:istore_1        
_L4:
		return i;
	//   11   23:iload_1         
	//   12   24:ireturn         
_L2:
		int j;
		byte abyte0[] = _inputBuffer;
	//   13   25:aload_0         
	//   14   26:getfield        #58  <Field byte[] _inputBuffer>
	//   15   29:astore_3        
		i = _inputPtr;
	//   16   30:aload_0         
	//   17   31:getfield        #61  <Field int _inputPtr>
	//   18   34:istore_1        
		_inputPtr = i + 1;
	//   19   35:aload_0         
	//   20   36:iload_1         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:putfield        #61  <Field int _inputPtr>
		j = abyte0[i] & 0xff;
	//   24   42:aload_3         
	//   25   43:iload_1         
	//   26   44:baload          
	//   27   45:sipush          255
	//   28   48:iand            
	//   29   49:istore_2        
		if(j <= 32)
			break MISSING_BLOCK_LABEL_85;
	//   30   50:iload_2         
	//   31   51:bipush          32
	//   32   53:icmple          85
		if(j == 47)
			break; /* Loop/switch isn't completed */
	//   33   56:iload_2         
	//   34   57:bipush          47
	//   35   59:icmpeq          70
		i = j;
	//   36   62:iload_2         
	//   37   63:istore_1        
		if(j != 35) goto _L4; else goto _L3
	//   38   64:iload_2         
	//   39   65:bipush          35
	//   40   67:icmpne          23
_L3:
		_inputPtr = _inputPtr - 1;
	//   41   70:aload_0         
	//   42   71:aload_0         
	//   43   72:getfield        #61  <Field int _inputPtr>
	//   44   75:iconst_1        
	//   45   76:isub            
	//   46   77:putfield        #61  <Field int _inputPtr>
		return _skipWSOrEnd2();
	//   47   80:aload_0         
	//   48   81:invokespecial   #395 <Method int _skipWSOrEnd2()>
	//   49   84:ireturn         
		byte abyte1[];
		if(j != 32)
	//*  50   85:iload_2         
	//*  51   86:bipush          32
	//*  52   88:icmpeq          115
			if(j == 10)
	//*  53   91:iload_2         
	//*  54   92:bipush          10
	//*  55   94:icmpne          186
			{
				_currInputRow = _currInputRow + 1;
	//   56   97:aload_0         
	//   57   98:aload_0         
	//   58   99:getfield        #312 <Field int _currInputRow>
	//   59  102:iconst_1        
	//   60  103:iadd            
	//   61  104:putfield        #312 <Field int _currInputRow>
				_currInputRowStart = _inputPtr;
	//   62  107:aload_0         
	//   63  108:aload_0         
	//   64  109:getfield        #61  <Field int _inputPtr>
	//   65  112:putfield        #67  <Field int _currInputRowStart>
			} else
	//*  66  115:aload_0         
	//*  67  116:getfield        #61  <Field int _inputPtr>
	//*  68  119:aload_0         
	//*  69  120:getfield        #64  <Field int _inputEnd>
	//*  70  123:icmpge          273
	//*  71  126:aload_0         
	//*  72  127:getfield        #58  <Field byte[] _inputBuffer>
	//*  73  130:astore_3        
	//*  74  131:aload_0         
	//*  75  132:getfield        #61  <Field int _inputPtr>
	//*  76  135:istore_1        
	//*  77  136:aload_0         
	//*  78  137:iload_1         
	//*  79  138:iconst_1        
	//*  80  139:iadd            
	//*  81  140:putfield        #61  <Field int _inputPtr>
	//*  82  143:aload_3         
	//*  83  144:iload_1         
	//*  84  145:baload          
	//*  85  146:sipush          255
	//*  86  149:iand            
	//*  87  150:istore_2        
	//*  88  151:iload_2         
	//*  89  152:bipush          32
	//*  90  154:icmple          213
	//*  91  157:iload_2         
	//*  92  158:bipush          47
	//*  93  160:icmpeq          171
	//*  94  163:iload_2         
	//*  95  164:istore_1        
	//*  96  165:iload_2         
	//*  97  166:bipush          35
	//*  98  168:icmpne          23
	//*  99  171:aload_0         
	//* 100  172:aload_0         
	//* 101  173:getfield        #61  <Field int _inputPtr>
	//* 102  176:iconst_1        
	//* 103  177:isub            
	//* 104  178:putfield        #61  <Field int _inputPtr>
	//* 105  181:aload_0         
	//* 106  182:invokespecial   #395 <Method int _skipWSOrEnd2()>
	//* 107  185:ireturn         
			if(j == 13)
	//* 108  186:iload_2         
	//* 109  187:bipush          13
	//* 110  189:icmpne          199
				_skipCR();
	//  111  192:aload_0         
	//  112  193:invokevirtual   #315 <Method void _skipCR()>
			else
	//* 113  196:goto            115
			if(j != 9)
	//* 114  199:iload_2         
	//* 115  200:bipush          9
	//* 116  202:icmpeq          115
				_throwInvalidSpace(j);
	//  117  205:aload_0         
	//  118  206:iload_2         
	//  119  207:invokevirtual   #337 <Method void _throwInvalidSpace(int)>
_L6:
		if(_inputPtr >= _inputEnd)
			break MISSING_BLOCK_LABEL_273;
		abyte1 = _inputBuffer;
		i = _inputPtr;
		_inputPtr = i + 1;
		j = abyte1[i] & 0xff;
		if(j <= 32)
			break MISSING_BLOCK_LABEL_213;
		if(j == 47)
			break; /* Loop/switch isn't completed */
		i = j;
		if(j != 35) goto _L4; else goto _L5
_L5:
		_inputPtr = _inputPtr - 1;
		return _skipWSOrEnd2();
	//* 120  210:goto            115
		if(j != 32)
	//* 121  213:iload_2         
	//* 122  214:bipush          32
	//* 123  216:icmpeq          115
			if(j == 10)
	//* 124  219:iload_2         
	//* 125  220:bipush          10
	//* 126  222:icmpne          246
			{
				_currInputRow = _currInputRow + 1;
	//  127  225:aload_0         
	//  128  226:aload_0         
	//  129  227:getfield        #312 <Field int _currInputRow>
	//  130  230:iconst_1        
	//  131  231:iadd            
	//  132  232:putfield        #312 <Field int _currInputRow>
				_currInputRowStart = _inputPtr;
	//  133  235:aload_0         
	//  134  236:aload_0         
	//  135  237:getfield        #61  <Field int _inputPtr>
	//  136  240:putfield        #67  <Field int _currInputRowStart>
			} else
	//* 137  243:goto            115
			if(j == 13)
	//* 138  246:iload_2         
	//* 139  247:bipush          13
	//* 140  249:icmpne          259
				_skipCR();
	//  141  252:aload_0         
	//  142  253:invokevirtual   #315 <Method void _skipCR()>
			else
	//* 143  256:goto            115
			if(j != 9)
	//* 144  259:iload_2         
	//* 145  260:bipush          9
	//* 146  262:icmpeq          115
				_throwInvalidSpace(j);
	//  147  265:aload_0         
	//  148  266:iload_2         
	//  149  267:invokevirtual   #337 <Method void _throwInvalidSpace(int)>
		  goto _L6
	//* 150  270:goto            115
		return _skipWSOrEnd2();
	//  151  273:aload_0         
	//  152  274:invokespecial   #395 <Method int _skipWSOrEnd2()>
	//  153  277:ireturn         
	}

	private final int _skipWSOrEnd2()
		throws IOException
	{
		do
		{
			if(_inputPtr >= _inputEnd && !loadMore())
				break;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int _inputPtr>
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field int _inputEnd>
	//    4    8:icmplt          18
	//    5   11:aload_0         
	//    6   12:invokevirtual   #249 <Method boolean loadMore()>
	//    7   15:ifeq            137
			byte abyte0[] = _inputBuffer;
	//    8   18:aload_0         
	//    9   19:getfield        #58  <Field byte[] _inputBuffer>
	//   10   22:astore_2        
			int i = _inputPtr;
	//   11   23:aload_0         
	//   12   24:getfield        #61  <Field int _inputPtr>
	//   13   27:istore_1        
			_inputPtr = i + 1;
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:putfield        #61  <Field int _inputPtr>
			i = abyte0[i] & 0xff;
	//   19   35:aload_2         
	//   20   36:iload_1         
	//   21   37:baload          
	//   22   38:sipush          255
	//   23   41:iand            
	//   24   42:istore_1        
			if(i > 32)
	//*  25   43:iload_1         
	//*  26   44:bipush          32
	//*  27   46:icmple          77
			{
				if(i == 47)
	//*  28   49:iload_1         
	//*  29   50:bipush          47
	//*  30   52:icmpne          62
					_skipComment();
	//   31   55:aload_0         
	//   32   56:invokespecial   #331 <Method void _skipComment()>
				else
	//*  33   59:goto            0
				if(i != 35 || !_skipYAMLComment())
	//*  34   62:iload_1         
	//*  35   63:bipush          35
	//*  36   65:icmpne          75
	//*  37   68:aload_0         
	//*  38   69:invokespecial   #334 <Method boolean _skipYAMLComment()>
	//*  39   72:ifne            0
					return i;
	//   40   75:iload_1         
	//   41   76:ireturn         
			} else
			if(i != 32)
	//*  42   77:iload_1         
	//*  43   78:bipush          32
	//*  44   80:icmpeq          0
				if(i == 10)
	//*  45   83:iload_1         
	//*  46   84:bipush          10
	//*  47   86:icmpne          110
				{
					_currInputRow = _currInputRow + 1;
	//   48   89:aload_0         
	//   49   90:aload_0         
	//   50   91:getfield        #312 <Field int _currInputRow>
	//   51   94:iconst_1        
	//   52   95:iadd            
	//   53   96:putfield        #312 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   54   99:aload_0         
	//   55  100:aload_0         
	//   56  101:getfield        #61  <Field int _inputPtr>
	//   57  104:putfield        #67  <Field int _currInputRowStart>
				} else
	//*  58  107:goto            0
				if(i == 13)
	//*  59  110:iload_1         
	//*  60  111:bipush          13
	//*  61  113:icmpne          123
					_skipCR();
	//   62  116:aload_0         
	//   63  117:invokevirtual   #315 <Method void _skipCR()>
				else
	//*  64  120:goto            0
				if(i != 9)
	//*  65  123:iload_1         
	//*  66  124:bipush          9
	//*  67  126:icmpeq          0
					_throwInvalidSpace(i);
	//   68  129:aload_0         
	//   69  130:iload_1         
	//   70  131:invokevirtual   #337 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   71  134:goto            0
		return _eofAsNextChar();
	//   72  137:aload_0         
	//   73  138:invokevirtual   #392 <Method int _eofAsNextChar()>
	//   74  141:ireturn         
	}

	private final boolean _skipYAMLComment()
		throws IOException
	{
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #398 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_YAML_COMMENTS>
	//*   2    4:invokevirtual   #375 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   3    7:ifne            12
		{
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		} else
		{
			_skipLine();
	//    6   12:aload_0         
	//    7   13:invokespecial   #380 <Method void _skipLine()>
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
	//    2    2:getfield        #312 <Field int _currInputRow>
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
	//   13   21:putfield        #401 <Field long _tokenInputTotal>
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
	//    2    2:getfield        #312 <Field int _currInputRow>
	//    3    5:putfield        #404 <Field int _nameStartRow>
		int i = _inputPtr;
	//    4    8:aload_0         
	//    5    9:getfield        #61  <Field int _inputPtr>
	//    6   12:istore_1        
		_nameStartOffset = i;
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:putfield        #406 <Field int _nameStartOffset>
		_nameStartCol = i - _currInputRowStart;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:aload_0         
	//   13   21:getfield        #67  <Field int _currInputRowStart>
	//   14   24:isub            
	//   15   25:putfield        #408 <Field int _nameStartCol>
	//   16   28:return          
	}

	private final int _verifyNoLeadingZeroes()
		throws IOException
	{
		if(_inputPtr < _inputEnd || loadMore()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int _inputPtr>
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field int _inputEnd>
	//    4    8:icmplt          23
	//    5   11:aload_0         
	//    6   12:invokevirtual   #249 <Method boolean loadMore()>
	//    7   15:ifne            23
_L1:
		int i = 48;
	//    8   18:bipush          48
	//    9   20:istore_1        
_L4:
		return i;
	//   10   21:iload_1         
	//   11   22:ireturn         
_L2:
		int j;
		j = _inputBuffer[_inputPtr] & 0xff;
	//   12   23:aload_0         
	//   13   24:getfield        #58  <Field byte[] _inputBuffer>
	//   14   27:aload_0         
	//   15   28:getfield        #61  <Field int _inputPtr>
	//   16   31:baload          
	//   17   32:sipush          255
	//   18   35:iand            
	//   19   36:istore_2        
		if(j < 48 || j > 57)
	//*  20   37:iload_2         
	//*  21   38:bipush          48
	//*  22   40:icmplt          49
	//*  23   43:iload_2         
	//*  24   44:bipush          57
	//*  25   46:icmple          52
			return 48;
	//   26   49:bipush          48
	//   27   51:ireturn         
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS))
	//*  28   52:aload_0         
	//*  29   53:getstatic       #412 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NUMERIC_LEADING_ZEROS>
	//*  30   56:invokevirtual   #375 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  31   59:ifne            69
			reportInvalidNumber("Leading zeroes not allowed");
	//   32   62:aload_0         
	//   33   63:ldc2            #414 <String "Leading zeroes not allowed">
	//   34   66:invokevirtual   #417 <Method void reportInvalidNumber(String)>
		_inputPtr = _inputPtr + 1;
	//   35   69:aload_0         
	//   36   70:aload_0         
	//   37   71:getfield        #61  <Field int _inputPtr>
	//   38   74:iconst_1        
	//   39   75:iadd            
	//   40   76:putfield        #61  <Field int _inputPtr>
		i = j;
	//   41   79:iload_2         
	//   42   80:istore_1        
		if(j != 48)
			continue; /* Loop/switch isn't completed */
	//   43   81:iload_2         
	//   44   82:bipush          48
	//   45   84:icmpne          21
		i = j;
	//   46   87:iload_2         
	//   47   88:istore_1        
		do
		{
			if(_inputPtr >= _inputEnd && !loadMore())
				continue; /* Loop/switch isn't completed */
	//   48   89:aload_0         
	//   49   90:getfield        #61  <Field int _inputPtr>
	//   50   93:aload_0         
	//   51   94:getfield        #64  <Field int _inputEnd>
	//   52   97:icmplt          107
	//   53  100:aload_0         
	//   54  101:invokevirtual   #249 <Method boolean loadMore()>
	//   55  104:ifeq            21
			j = _inputBuffer[_inputPtr] & 0xff;
	//   56  107:aload_0         
	//   57  108:getfield        #58  <Field byte[] _inputBuffer>
	//   58  111:aload_0         
	//   59  112:getfield        #61  <Field int _inputPtr>
	//   60  115:baload          
	//   61  116:sipush          255
	//   62  119:iand            
	//   63  120:istore_2        
			if(j < 48 || j > 57)
	//*  64  121:iload_2         
	//*  65  122:bipush          48
	//*  66  124:icmplt          133
	//*  67  127:iload_2         
	//*  68  128:bipush          57
	//*  69  130:icmple          136
				return 48;
	//   70  133:bipush          48
	//   71  135:ireturn         
			_inputPtr = _inputPtr + 1;
	//   72  136:aload_0         
	//   73  137:aload_0         
	//   74  138:getfield        #61  <Field int _inputPtr>
	//   75  141:iconst_1        
	//   76  142:iadd            
	//   77  143:putfield        #61  <Field int _inputPtr>
			i = j;
	//   78  146:iload_2         
	//   79  147:istore_1        
		} while(j == 48);
	//   80  148:iload_2         
	//   81  149:bipush          48
	//   82  151:icmpeq          89
		break; /* Loop/switch isn't completed */
		if(true) goto _L4; else goto _L3
_L3:
		return j;
	//   83  154:iload_2         
	//   84  155:ireturn         
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
		switch(i)
	//*   6   10:iload_1         
		{
	//*   7   11:lookupswitch    4: default 52
	//	               9: 57
	//	               10: 63
	//	               13: 58
	//	               32: 57
		default:
			_reportMissingRootWS(i);
	//    8   52:aload_0         
	//    9   53:iload_1         
	//   10   54:invokevirtual   #420 <Method void _reportMissingRootWS(int)>
			// fall through

		case 9: // '\t'
		case 32: // ' '
			return;
	//   11   57:return          

		case 13: // '\r'
			_skipCR();
	//   12   58:aload_0         
	//   13   59:invokevirtual   #315 <Method void _skipCR()>
			return;
	//   14   62:return          

		case 10: // '\n'
			_currInputRow = _currInputRow + 1;
	//   15   63:aload_0         
	//   16   64:aload_0         
	//   17   65:getfield        #312 <Field int _currInputRow>
	//   18   68:iconst_1        
	//   19   69:iadd            
	//   20   70:putfield        #312 <Field int _currInputRow>
			_currInputRowStart = _inputPtr;
	//   21   73:aload_0         
	//   22   74:aload_0         
	//   23   75:getfield        #61  <Field int _inputPtr>
	//   24   78:putfield        #67  <Field int _currInputRowStart>
			return;
	//   25   81:return          
		}
	}

	private final String addName(int ai[], int i, int j)
		throws JsonParseException
	{
		int k;
		int l;
		int j1;
		int k1;
		int i2;
		char ac[];
		int j2 = ((i << 2) - 4) + j;
	//    0    0:iload_2         
	//    1    1:iconst_2        
	//    2    2:ishl            
	//    3    3:iconst_4        
	//    4    4:isub            
	//    5    5:iload_3         
	//    6    6:iadd            
	//    7    7:istore          11
		int i1;
		int l1;
		char ac1[];
		if(j < 4)
	//*   8    9:iload_3         
	//*   9   10:iconst_4        
	//*  10   11:icmpge          450
		{
			i2 = ai[i - 1];
	//   11   14:aload_1         
	//   12   15:iload_2         
	//   13   16:iconst_1        
	//   14   17:isub            
	//   15   18:iaload          
	//   16   19:istore          10
			ai[i - 1] = i2 << (4 - j << 3);
	//   17   21:aload_1         
	//   18   22:iload_2         
	//   19   23:iconst_1        
	//   20   24:isub            
	//   21   25:iload           10
	//   22   27:iconst_4        
	//   23   28:iload_3         
	//   24   29:isub            
	//   25   30:iconst_3        
	//   26   31:ishl            
	//   27   32:ishl            
	//   28   33:iastore         
		} else
	//*  29   34:aload_0         
	//*  30   35:getfield        #116 <Field TextBuffer _textBuffer>
	//*  31   38:invokevirtual   #427 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//*  32   41:astore          12
	//*  33   43:iconst_0        
	//*  34   44:istore          4
	//*  35   46:iconst_0        
	//*  36   47:istore          7
	//*  37   49:iload           4
	//*  38   51:iload           11
	//*  39   53:icmpge          521
	//*  40   56:aload_1         
	//*  41   57:iload           4
	//*  42   59:iconst_2        
	//*  43   60:ishr            
	//*  44   61:iaload          
	//*  45   62:iconst_3        
	//*  46   63:iload           4
	//*  47   65:iconst_3        
	//*  48   66:iand            
	//*  49   67:isub            
	//*  50   68:iconst_3        
	//*  51   69:ishl            
	//*  52   70:ishr            
	//*  53   71:sipush          255
	//*  54   74:iand            
	//*  55   75:istore          5
	//*  56   77:iload           4
	//*  57   79:iconst_1        
	//*  58   80:iadd            
	//*  59   81:istore          6
	//*  60   83:iload           5
	//*  61   85:istore          9
	//*  62   87:iload           6
	//*  63   89:istore          8
	//*  64   91:iload           5
	//*  65   93:bipush          127
	//*  66   95:icmple          559
	//*  67   98:iload           5
	//*  68  100:sipush          224
	//*  69  103:iand            
	//*  70  104:sipush          192
	//*  71  107:icmpne          456
	//*  72  110:iload           5
	//*  73  112:bipush          31
	//*  74  114:iand            
	//*  75  115:istore          4
	//*  76  117:iconst_1        
	//*  77  118:istore          5
	//*  78  120:iload           6
	//*  79  122:iload           5
	//*  80  124:iadd            
	//*  81  125:iload           11
	//*  82  127:icmple          137
	//*  83  130:aload_0         
	//*  84  131:ldc2            #429 <String " in field name">
	//*  85  134:invokevirtual   #309 <Method void _reportInvalidEOF(String)>
	//*  86  137:aload_1         
	//*  87  138:iload           6
	//*  88  140:iconst_2        
	//*  89  141:ishr            
	//*  90  142:iaload          
	//*  91  143:iconst_3        
	//*  92  144:iload           6
	//*  93  146:iconst_3        
	//*  94  147:iand            
	//*  95  148:isub            
	//*  96  149:iconst_3        
	//*  97  150:ishl            
	//*  98  151:ishr            
	//*  99  152:istore          9
	//* 100  154:iload           6
	//* 101  156:iconst_1        
	//* 102  157:iadd            
	//* 103  158:istore          8
	//* 104  160:iload           9
	//* 105  162:sipush          192
	//* 106  165:iand            
	//* 107  166:sipush          128
	//* 108  169:icmpeq          178
	//* 109  172:aload_0         
	//* 110  173:iload           9
	//* 111  175:invokevirtual   #431 <Method void _reportInvalidOther(int)>
	//* 112  178:iload           4
	//* 113  180:bipush          6
	//* 114  182:ishl            
	//* 115  183:iload           9
	//* 116  185:bipush          63
	//* 117  187:iand            
	//* 118  188:ior             
	//* 119  189:istore          9
	//* 120  191:iload           9
	//* 121  193:istore          6
	//* 122  195:iload           8
	//* 123  197:istore          4
	//* 124  199:iload           5
	//* 125  201:iconst_1        
	//* 126  202:icmple          331
	//* 127  205:aload_1         
	//* 128  206:iload           8
	//* 129  208:iconst_2        
	//* 130  209:ishr            
	//* 131  210:iaload          
	//* 132  211:iconst_3        
	//* 133  212:iload           8
	//* 134  214:iconst_3        
	//* 135  215:iand            
	//* 136  216:isub            
	//* 137  217:iconst_3        
	//* 138  218:ishl            
	//* 139  219:ishr            
	//* 140  220:istore          4
	//* 141  222:iload           8
	//* 142  224:iconst_1        
	//* 143  225:iadd            
	//* 144  226:istore          8
	//* 145  228:iload           4
	//* 146  230:sipush          192
	//* 147  233:iand            
	//* 148  234:sipush          128
	//* 149  237:icmpeq          246
	//* 150  240:aload_0         
	//* 151  241:iload           4
	//* 152  243:invokevirtual   #431 <Method void _reportInvalidOther(int)>
	//* 153  246:iload           9
	//* 154  248:bipush          6
	//* 155  250:ishl            
	//* 156  251:iload           4
	//* 157  253:bipush          63
	//* 158  255:iand            
	//* 159  256:ior             
	//* 160  257:istore          9
	//* 161  259:iload           9
	//* 162  261:istore          6
	//* 163  263:iload           8
	//* 164  265:istore          4
	//* 165  267:iload           5
	//* 166  269:iconst_2        
	//* 167  270:icmple          331
	//* 168  273:aload_1         
	//* 169  274:iload           8
	//* 170  276:iconst_2        
	//* 171  277:ishr            
	//* 172  278:iaload          
	//* 173  279:iconst_3        
	//* 174  280:iload           8
	//* 175  282:iconst_3        
	//* 176  283:iand            
	//* 177  284:isub            
	//* 178  285:iconst_3        
	//* 179  286:ishl            
	//* 180  287:ishr            
	//* 181  288:istore          6
	//* 182  290:iload           8
	//* 183  292:iconst_1        
	//* 184  293:iadd            
	//* 185  294:istore          4
	//* 186  296:iload           6
	//* 187  298:sipush          192
	//* 188  301:iand            
	//* 189  302:sipush          128
	//* 190  305:icmpeq          318
	//* 191  308:aload_0         
	//* 192  309:iload           6
	//* 193  311:sipush          255
	//* 194  314:iand            
	//* 195  315:invokevirtual   #431 <Method void _reportInvalidOther(int)>
	//* 196  318:iload           9
	//* 197  320:bipush          6
	//* 198  322:ishl            
	//* 199  323:iload           6
	//* 200  325:bipush          63
	//* 201  327:iand            
	//* 202  328:ior             
	//* 203  329:istore          6
	//* 204  331:iload           6
	//* 205  333:istore          9
	//* 206  335:iload           4
	//* 207  337:istore          8
	//* 208  339:iload           5
	//* 209  341:iconst_2        
	//* 210  342:icmple          559
	//* 211  345:iload           6
	//* 212  347:ldc1            #110 <Int 0x10000>
	//* 213  349:isub            
	//* 214  350:istore          6
	//* 215  352:aload           12
	//* 216  354:astore          13
	//* 217  356:iload           7
	//* 218  358:aload           12
	//* 219  360:arraylength     
	//* 220  361:icmplt          373
	//* 221  364:aload_0         
	//* 222  365:getfield        #116 <Field TextBuffer _textBuffer>
	//* 223  368:invokevirtual   #434 <Method char[] TextBuffer.expandCurrentSegment()>
	//* 224  371:astore          13
	//* 225  373:iload           7
	//* 226  375:iconst_1        
	//* 227  376:iadd            
	//* 228  377:istore          5
	//* 229  379:aload           13
	//* 230  381:iload           7
	//* 231  383:ldc1            #151 <Int 55296>
	//* 232  385:iload           6
	//* 233  387:bipush          10
	//* 234  389:ishr            
	//* 235  390:iadd            
	//* 236  391:int2char        
	//* 237  392:castore         
	//* 238  393:ldc1            #152 <Int 56320>
	//* 239  395:iload           6
	//* 240  397:sipush          1023
	//* 241  400:iand            
	//* 242  401:ior             
	//* 243  402:istore          9
	//* 244  404:aload           13
	//* 245  406:astore          12
	//* 246  408:aload           12
	//* 247  410:astore          13
	//* 248  412:iload           5
	//* 249  414:aload           12
	//* 250  416:arraylength     
	//* 251  417:icmplt          429
	//* 252  420:aload_0         
	//* 253  421:getfield        #116 <Field TextBuffer _textBuffer>
	//* 254  424:invokevirtual   #434 <Method char[] TextBuffer.expandCurrentSegment()>
	//* 255  427:astore          13
	//* 256  429:iload           5
	//* 257  431:iconst_1        
	//* 258  432:iadd            
	//* 259  433:istore          7
	//* 260  435:aload           13
	//* 261  437:iload           5
	//* 262  439:iload           9
	//* 263  441:int2char        
	//* 264  442:castore         
	//* 265  443:aload           13
	//* 266  445:astore          12
	//* 267  447:goto            49
		{
			i2 = 0;
	//  268  450:iconst_0        
	//  269  451:istore          10
		}
		ac = _textBuffer.emptyAndGetCurrentSegment();
		k = 0;
		j1 = 0;
		if(k >= j2)
			break; /* Loop/switch isn't completed */
		l = ai[k >> 2] >> (3 - (k & 3) << 3) & 0xff;
		i1 = k + 1;
		l1 = l;
		k1 = i1;
		if(l <= 127)
			break MISSING_BLOCK_LABEL_559;
		if((l & 0xe0) == 192)
		{
			k = l & 0x1f;
			l = 1;
		} else
	//* 270  453:goto            34
		if((l & 0xf0) == 224)
	//* 271  456:iload           5
	//* 272  458:sipush          240
	//* 273  461:iand            
	//* 274  462:sipush          224
	//* 275  465:icmpne          481
		{
			k = l & 0xf;
	//  276  468:iload           5
	//  277  470:bipush          15
	//  278  472:iand            
	//  279  473:istore          4
			l = 2;
	//  280  475:iconst_2        
	//  281  476:istore          5
		} else
	//* 282  478:goto            120
		if((l & 0xf8) == 240)
	//* 283  481:iload           5
	//* 284  483:sipush          248
	//* 285  486:iand            
	//* 286  487:sipush          240
	//* 287  490:icmpne          506
		{
			k = l & 7;
	//  288  493:iload           5
	//  289  495:bipush          7
	//  290  497:iand            
	//  291  498:istore          4
			l = 3;
	//  292  500:iconst_3        
	//  293  501:istore          5
		} else
	//* 294  503:goto            120
		{
			_reportInvalidInitial(l);
	//  295  506:aload_0         
	//  296  507:iload           5
	//  297  509:invokevirtual   #437 <Method void _reportInvalidInitial(int)>
			k = 1;
	//  298  512:iconst_1        
	//  299  513:istore          4
			l = 1;
	//  300  515:iconst_1        
	//  301  516:istore          5
		}
		if(i1 + l > j2)
			_reportInvalidEOF(" in field name");
		l1 = ai[i1 >> 2] >> (3 - (i1 & 3) << 3);
		k1 = i1 + 1;
		if((l1 & 0xc0) != 128)
			_reportInvalidOther(l1);
		l1 = k << 6 | l1 & 0x3f;
		i1 = l1;
		k = k1;
		if(l > 1)
		{
			k = ai[k1 >> 2] >> (3 - (k1 & 3) << 3);
			k1++;
			if((k & 0xc0) != 128)
				_reportInvalidOther(k);
			l1 = l1 << 6 | k & 0x3f;
			i1 = l1;
			k = k1;
			if(l > 2)
			{
				i1 = ai[k1 >> 2] >> (3 - (k1 & 3) << 3);
				k = k1 + 1;
				if((i1 & 0xc0) != 128)
					_reportInvalidOther(i1 & 0xff);
				i1 = l1 << 6 | i1 & 0x3f;
			}
		}
		l1 = i1;
		k1 = k;
		if(l <= 2)
			break MISSING_BLOCK_LABEL_559;
		i1 -= 0x10000;
		ac1 = ac;
		if(j1 >= ac.length)
			ac1 = _textBuffer.expandCurrentSegment();
		l = j1 + 1;
		ac1[j1] = (char)(55296 + (i1 >> 10));
		l1 = 0xdc00 | i1 & 0x3ff;
		ac = ac1;
_L4:
		ac1 = ac;
		if(l >= ac.length)
			ac1 = _textBuffer.expandCurrentSegment();
		j1 = l + 1;
		ac1[l] = (char)l1;
		ac = ac1;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_49;
	//* 302  518:goto            120
_L1:
		String s = new String(ac, 0, j1);
	//  303  521:new             #89  <Class String>
	//  304  524:dup             
	//  305  525:aload           12
	//  306  527:iconst_0        
	//  307  528:iload           7
	//  308  530:invokespecial   #440 <Method void String(char[], int, int)>
	//  309  533:astore          12
		if(j < 4)
	//* 310  535:iload_3         
	//* 311  536:iconst_4        
	//* 312  537:icmpge          547
			ai[i - 1] = i2;
	//  313  540:aload_1         
	//  314  541:iload_2         
	//  315  542:iconst_1        
	//  316  543:isub            
	//  317  544:iload           10
	//  318  546:iastore         
		return _symbols.addName(s, ai, i);
	//  319  547:aload_0         
	//  320  548:getfield        #56  <Field ByteQuadsCanonicalizer _symbols>
	//  321  551:aload           12
	//  322  553:aload_1         
	//  323  554:iload_2         
	//  324  555:invokevirtual   #445 <Method String ByteQuadsCanonicalizer.addName(String, int[], int)>
	//  325  558:areturn         
		l = j1;
	//  326  559:iload           7
	//  327  561:istore          5
		k = k1;
	//  328  563:iload           8
	//  329  565:istore          4
		if(true) goto _L4; else goto _L3
	//  330  567:goto            408
_L3:
	}

	private final String findName(int i, int j)
		throws JsonParseException
	{
		i = pad(i, j);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #449 <Method int pad(int, int)>
	//    3    5:istore_1        
		String s = _symbols.findName(i);
	//    4    6:aload_0         
	//    5    7:getfield        #56  <Field ByteQuadsCanonicalizer _symbols>
	//    6   10:iload_1         
	//    7   11:invokevirtual   #451 <Method String ByteQuadsCanonicalizer.findName(int)>
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
	//   23   35:invokespecial   #453 <Method String addName(int[], int, int)>
	//   24   38:areturn         
		}
	}

	private final String findName(int i, int j, int k)
		throws JsonParseException
	{
		j = pad(j, k);
	//    0    0:iload_2         
	//    1    1:iload_3         
	//    2    2:invokestatic    #449 <Method int pad(int, int)>
	//    3    5:istore_2        
		String s = _symbols.findName(i, j);
	//    4    6:aload_0         
	//    5    7:getfield        #56  <Field ByteQuadsCanonicalizer _symbols>
	//    6   10:iload_1         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #456 <Method String ByteQuadsCanonicalizer.findName(int, int)>
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
	//   29   46:invokespecial   #453 <Method String addName(int[], int, int)>
	//   30   49:areturn         
		}
	}

	private final String findName(int i, int j, int k, int l)
		throws JsonParseException
	{
		k = pad(k, l);
	//    0    0:iload_3         
	//    1    1:iload           4
	//    2    3:invokestatic    #449 <Method int pad(int, int)>
	//    3    6:istore_3        
		String s = _symbols.findName(i, j, k);
	//    4    7:aload_0         
	//    5    8:getfield        #56  <Field ByteQuadsCanonicalizer _symbols>
	//    6   11:iload_1         
	//    7   12:iload_2         
	//    8   13:iload_3         
	//    9   14:invokevirtual   #459 <Method String ByteQuadsCanonicalizer.findName(int, int, int)>
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
	//   30   49:invokestatic    #449 <Method int pad(int, int)>
	//   31   52:iastore         
			return addName(ai, 3, l);
	//   32   53:aload_0         
	//   33   54:aload           5
	//   34   56:iconst_3        
	//   35   57:iload           4
	//   36   59:invokespecial   #453 <Method String addName(int[], int, int)>
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
	//    9   12:invokestatic    #464 <Method int[] growArrayBy(int[], int)>
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
	//   22   34:invokestatic    #449 <Method int pad(int, int)>
	//   23   37:iastore         
		String s = _symbols.findName(ai1, l);
	//   24   38:aload_0         
	//   25   39:getfield        #56  <Field ByteQuadsCanonicalizer _symbols>
	//   26   42:aload           6
	//   27   44:iload           5
	//   28   46:invokevirtual   #467 <Method String ByteQuadsCanonicalizer.findName(int[], int)>
	//   29   49:astore          7
		ai = ((int []) (s));
	//   30   51:aload           7
	//   31   53:astore_1        
		if(s == null)
	//*  32   54:aload           7
	//*  33   56:ifnonnull       70
			ai = ((int []) (addName(ai1, l, k)));
	//   34   59:aload_0         
	//   35   60:aload           6
	//   36   62:iload           5
	//   37   64:iload           4
	//   38   66:invokespecial   #453 <Method String addName(int[], int, int)>
	//   39   69:astore_1        
		return ((String) (ai));
	//   40   70:aload_1         
	//   41   71:areturn         
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
	//   10   13:invokestatic    #472 <Method int[] Arrays.copyOf(int[], int)>
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
			loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #102 <Method void loadMoreGuaranteed()>
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
	//    7    9:invokevirtual   #478 <Method String parseEscapedName(int[], int, int, int, int)>
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
	//   12   17:invokevirtual   #478 <Method String parseEscapedName(int[], int, int, int, int)>
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
	//   17   25:invokevirtual   #478 <Method String parseEscapedName(int[], int, int, int, int)>
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
	//*   4    8:getfield        #484 <Field IOContext _ioContext>
	//*   5   11:invokevirtual   #489 <Method boolean IOContext.isResourceManaged()>
	//*   6   14:ifne            27
	//*   7   17:aload_0         
	//*   8   18:getstatic       #492 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.AUTO_CLOSE_SOURCE>
	//*   9   21:invokevirtual   #375 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  10   24:ifeq            34
				_inputStream.close();
	//   11   27:aload_0         
	//   12   28:getfield        #52  <Field InputStream _inputStream>
	//   13   31:invokevirtual   #497 <Method void InputStream.close()>
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
		ByteArrayBuilder bytearraybuilder = _getByteArrayBuilder();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #503 <Method ByteArrayBuilder _getByteArrayBuilder()>
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
					loadMoreGuaranteed();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #102 <Method void loadMoreGuaranteed()>
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
	//   32   59:invokevirtual   #508 <Method int Base64Variant.decodeBase64Char(int)>
	//   33   62:istore_3        
			int j = l;
	//   34   63:iload_3         
	//   35   64:istore_2        
			if(l < 0)
	//*  36   65:iload_3         
	//*  37   66:ifge            95
			{
				if(i1 == 34)
	//*  38   69:iload           4
	//*  39   71:bipush          34
	//*  40   73:icmpne          82
					return bytearraybuilder.toByteArray();
	//   41   76:aload           7
	//   42   78:invokevirtual   #514 <Method byte[] ByteArrayBuilder.toByteArray()>
	//   43   81:areturn         
				j = _decodeBase64Escape(base64variant, i1, 0);
	//   44   82:aload_0         
	//   45   83:aload_1         
	//   46   84:iload           4
	//   47   86:iconst_0        
	//   48   87:invokevirtual   #518 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//   49   90:istore_2        
				if(j < 0)
					continue;
	//   50   91:iload_2         
	//   51   92:iflt            6
			}
			if(_inputPtr >= _inputEnd)
	//*  52   95:aload_0         
	//*  53   96:getfield        #61  <Field int _inputPtr>
	//*  54   99:aload_0         
	//*  55  100:getfield        #64  <Field int _inputEnd>
	//*  56  103:icmplt          110
				loadMoreGuaranteed();
	//   57  106:aload_0         
	//   58  107:invokevirtual   #102 <Method void loadMoreGuaranteed()>
			byte abyte1[] = _inputBuffer;
	//   59  110:aload_0         
	//   60  111:getfield        #58  <Field byte[] _inputBuffer>
	//   61  114:astore          8
			l = _inputPtr;
	//   62  116:aload_0         
	//   63  117:getfield        #61  <Field int _inputPtr>
	//   64  120:istore_3        
			_inputPtr = l + 1;
	//   65  121:aload_0         
	//   66  122:iload_3         
	//   67  123:iconst_1        
	//   68  124:iadd            
	//   69  125:putfield        #61  <Field int _inputPtr>
			int j1 = abyte1[l] & 0xff;
	//   70  128:aload           8
	//   71  130:iload_3         
	//   72  131:baload          
	//   73  132:sipush          255
	//   74  135:iand            
	//   75  136:istore          5
			i1 = base64variant.decodeBase64Char(j1);
	//   76  138:aload_1         
	//   77  139:iload           5
	//   78  141:invokevirtual   #508 <Method int Base64Variant.decodeBase64Char(int)>
	//   79  144:istore          4
			l = i1;
	//   80  146:iload           4
	//   81  148:istore_3        
			if(i1 < 0)
	//*  82  149:iload           4
	//*  83  151:ifge            163
				l = _decodeBase64Escape(base64variant, j1, 1);
	//   84  154:aload_0         
	//   85  155:aload_1         
	//   86  156:iload           5
	//   87  158:iconst_1        
	//   88  159:invokevirtual   #518 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//   89  162:istore_3        
			j1 = j << 6 | l;
	//   90  163:iload_2         
	//   91  164:bipush          6
	//   92  166:ishl            
	//   93  167:iload_3         
	//   94  168:ior             
	//   95  169:istore          5
			if(_inputPtr >= _inputEnd)
	//*  96  171:aload_0         
	//*  97  172:getfield        #61  <Field int _inputPtr>
	//*  98  175:aload_0         
	//*  99  176:getfield        #64  <Field int _inputEnd>
	//* 100  179:icmplt          186
				loadMoreGuaranteed();
	//  101  182:aload_0         
	//  102  183:invokevirtual   #102 <Method void loadMoreGuaranteed()>
			abyte1 = _inputBuffer;
	//  103  186:aload_0         
	//  104  187:getfield        #58  <Field byte[] _inputBuffer>
	//  105  190:astore          8
			j = _inputPtr;
	//  106  192:aload_0         
	//  107  193:getfield        #61  <Field int _inputPtr>
	//  108  196:istore_2        
			_inputPtr = j + 1;
	//  109  197:aload_0         
	//  110  198:iload_2         
	//  111  199:iconst_1        
	//  112  200:iadd            
	//  113  201:putfield        #61  <Field int _inputPtr>
			int k1 = abyte1[j] & 0xff;
	//  114  204:aload           8
	//  115  206:iload_2         
	//  116  207:baload          
	//  117  208:sipush          255
	//  118  211:iand            
	//  119  212:istore          6
			l = base64variant.decodeBase64Char(k1);
	//  120  214:aload_1         
	//  121  215:iload           6
	//  122  217:invokevirtual   #508 <Method int Base64Variant.decodeBase64Char(int)>
	//  123  220:istore_3        
			i1 = l;
	//  124  221:iload_3         
	//  125  222:istore          4
			if(l < 0)
	//* 126  224:iload_3         
	//* 127  225:ifge            382
			{
				j = l;
	//  128  228:iload_3         
	//  129  229:istore_2        
				if(l != -2)
	//* 130  230:iload_3         
	//* 131  231:bipush          -2
	//* 132  233:icmpeq          274
				{
					if(k1 == 34 && !base64variant.usesPadding())
	//* 133  236:iload           6
	//* 134  238:bipush          34
	//* 135  240:icmpne          265
	//* 136  243:aload_1         
	//* 137  244:invokevirtual   #521 <Method boolean Base64Variant.usesPadding()>
	//* 138  247:ifne            265
					{
						bytearraybuilder.append(j1 >> 4);
	//  139  250:aload           7
	//  140  252:iload           5
	//  141  254:iconst_4        
	//  142  255:ishr            
	//  143  256:invokevirtual   #523 <Method void ByteArrayBuilder.append(int)>
						return bytearraybuilder.toByteArray();
	//  144  259:aload           7
	//  145  261:invokevirtual   #514 <Method byte[] ByteArrayBuilder.toByteArray()>
	//  146  264:areturn         
					}
					j = _decodeBase64Escape(base64variant, k1, 2);
	//  147  265:aload_0         
	//  148  266:aload_1         
	//  149  267:iload           6
	//  150  269:iconst_2        
	//  151  270:invokevirtual   #518 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//  152  273:istore_2        
				}
				i1 = j;
	//  153  274:iload_2         
	//  154  275:istore          4
				if(j == -2)
	//* 155  277:iload_2         
	//* 156  278:bipush          -2
	//* 157  280:icmpne          382
				{
					if(_inputPtr >= _inputEnd)
	//* 158  283:aload_0         
	//* 159  284:getfield        #61  <Field int _inputPtr>
	//* 160  287:aload_0         
	//* 161  288:getfield        #64  <Field int _inputEnd>
	//* 162  291:icmplt          298
						loadMoreGuaranteed();
	//  163  294:aload_0         
	//  164  295:invokevirtual   #102 <Method void loadMoreGuaranteed()>
					abyte1 = _inputBuffer;
	//  165  298:aload_0         
	//  166  299:getfield        #58  <Field byte[] _inputBuffer>
	//  167  302:astore          8
					j = _inputPtr;
	//  168  304:aload_0         
	//  169  305:getfield        #61  <Field int _inputPtr>
	//  170  308:istore_2        
					_inputPtr = j + 1;
	//  171  309:aload_0         
	//  172  310:iload_2         
	//  173  311:iconst_1        
	//  174  312:iadd            
	//  175  313:putfield        #61  <Field int _inputPtr>
					j = abyte1[j] & 0xff;
	//  176  316:aload           8
	//  177  318:iload_2         
	//  178  319:baload          
	//  179  320:sipush          255
	//  180  323:iand            
	//  181  324:istore_2        
					if(!base64variant.usesPaddingChar(j))
	//* 182  325:aload_1         
	//* 183  326:iload_2         
	//* 184  327:invokevirtual   #527 <Method boolean Base64Variant.usesPaddingChar(int)>
	//* 185  330:ifne            370
						throw reportInvalidBase64Char(base64variant, j, 3, (new StringBuilder()).append("expected padding character '").append(base64variant.getPaddingChar()).append("'").toString());
	//  186  333:aload_0         
	//  187  334:aload_1         
	//  188  335:iload_2         
	//  189  336:iconst_3        
	//  190  337:new             #344 <Class StringBuilder>
	//  191  340:dup             
	//  192  341:invokespecial   #346 <Method void StringBuilder()>
	//  193  344:ldc2            #529 <String "expected padding character '">
	//  194  347:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//  195  350:aload_1         
	//  196  351:invokevirtual   #532 <Method char Base64Variant.getPaddingChar()>
	//  197  354:invokevirtual   #535 <Method StringBuilder StringBuilder.append(char)>
	//  198  357:ldc2            #537 <String "'">
	//  199  360:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//  200  363:invokevirtual   #360 <Method String StringBuilder.toString()>
	//  201  366:invokevirtual   #541 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int, String)>
	//  202  369:athrow          
					bytearraybuilder.append(j1 >> 4);
	//  203  370:aload           7
	//  204  372:iload           5
	//  205  374:iconst_4        
	//  206  375:ishr            
	//  207  376:invokevirtual   #523 <Method void ByteArrayBuilder.append(int)>
					continue;
	//  208  379:goto            6
				}
			}
			j1 = j1 << 6 | i1;
	//  209  382:iload           5
	//  210  384:bipush          6
	//  211  386:ishl            
	//  212  387:iload           4
	//  213  389:ior             
	//  214  390:istore          5
			if(_inputPtr >= _inputEnd)
	//* 215  392:aload_0         
	//* 216  393:getfield        #61  <Field int _inputPtr>
	//* 217  396:aload_0         
	//* 218  397:getfield        #64  <Field int _inputEnd>
	//* 219  400:icmplt          407
				loadMoreGuaranteed();
	//  220  403:aload_0         
	//  221  404:invokevirtual   #102 <Method void loadMoreGuaranteed()>
			abyte1 = _inputBuffer;
	//  222  407:aload_0         
	//  223  408:getfield        #58  <Field byte[] _inputBuffer>
	//  224  411:astore          8
			j = _inputPtr;
	//  225  413:aload_0         
	//  226  414:getfield        #61  <Field int _inputPtr>
	//  227  417:istore_2        
			_inputPtr = j + 1;
	//  228  418:aload_0         
	//  229  419:iload_2         
	//  230  420:iconst_1        
	//  231  421:iadd            
	//  232  422:putfield        #61  <Field int _inputPtr>
			k1 = abyte1[j] & 0xff;
	//  233  425:aload           8
	//  234  427:iload_2         
	//  235  428:baload          
	//  236  429:sipush          255
	//  237  432:iand            
	//  238  433:istore          6
			l = base64variant.decodeBase64Char(k1);
	//  239  435:aload_1         
	//  240  436:iload           6
	//  241  438:invokevirtual   #508 <Method int Base64Variant.decodeBase64Char(int)>
	//  242  441:istore_3        
			i1 = l;
	//  243  442:iload_3         
	//  244  443:istore          4
			if(l < 0)
	//* 245  445:iload_3         
	//* 246  446:ifge            516
			{
				int k = l;
	//  247  449:iload_3         
	//  248  450:istore_2        
				if(l != -2)
	//* 249  451:iload_3         
	//* 250  452:bipush          -2
	//* 251  454:icmpeq          495
				{
					if(k1 == 34 && !base64variant.usesPadding())
	//* 252  457:iload           6
	//* 253  459:bipush          34
	//* 254  461:icmpne          486
	//* 255  464:aload_1         
	//* 256  465:invokevirtual   #521 <Method boolean Base64Variant.usesPadding()>
	//* 257  468:ifne            486
					{
						bytearraybuilder.appendTwoBytes(j1 >> 2);
	//  258  471:aload           7
	//  259  473:iload           5
	//  260  475:iconst_2        
	//  261  476:ishr            
	//  262  477:invokevirtual   #544 <Method void ByteArrayBuilder.appendTwoBytes(int)>
						return bytearraybuilder.toByteArray();
	//  263  480:aload           7
	//  264  482:invokevirtual   #514 <Method byte[] ByteArrayBuilder.toByteArray()>
	//  265  485:areturn         
					}
					k = _decodeBase64Escape(base64variant, k1, 3);
	//  266  486:aload_0         
	//  267  487:aload_1         
	//  268  488:iload           6
	//  269  490:iconst_3        
	//  270  491:invokevirtual   #518 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//  271  494:istore_2        
				}
				i1 = k;
	//  272  495:iload_2         
	//  273  496:istore          4
				if(k == -2)
	//* 274  498:iload_2         
	//* 275  499:bipush          -2
	//* 276  501:icmpne          516
				{
					bytearraybuilder.appendTwoBytes(j1 >> 2);
	//  277  504:aload           7
	//  278  506:iload           5
	//  279  508:iconst_2        
	//  280  509:ishr            
	//  281  510:invokevirtual   #544 <Method void ByteArrayBuilder.appendTwoBytes(int)>
					continue;
	//  282  513:goto            6
				}
			}
			bytearraybuilder.appendThreeBytes(j1 << 6 | i1);
	//  283  516:aload           7
	//  284  518:iload           5
	//  285  520:bipush          6
	//  286  522:ishl            
	//  287  523:iload           4
	//  288  525:ior             
	//  289  526:invokevirtual   #547 <Method void ByteArrayBuilder.appendThreeBytes(int)>
		} while(true);
	//  290  529:goto            6
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
	//*   8   11:icmple          151
		{
			int k;
			if((i & 0xe0) == 192)
	//*   9   14:iload_1         
	//*  10   15:sipush          224
	//*  11   18:iand            
	//*  12   19:sipush          192
	//*  13   22:icmpne          153
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
	//*  20   32:aload_0         
	//*  21   33:invokespecial   #549 <Method int nextByte()>
	//*  22   36:istore_3        
	//*  23   37:iload_3         
	//*  24   38:sipush          192
	//*  25   41:iand            
	//*  26   42:sipush          128
	//*  27   45:icmpeq          57
	//*  28   48:aload_0         
	//*  29   49:iload_3         
	//*  30   50:sipush          255
	//*  31   53:iand            
	//*  32   54:invokevirtual   #431 <Method void _reportInvalidOther(int)>
	//*  33   57:iload_2         
	//*  34   58:bipush          6
	//*  35   60:ishl            
	//*  36   61:iload_3         
	//*  37   62:bipush          63
	//*  38   64:iand            
	//*  39   65:ior             
	//*  40   66:istore_3        
	//*  41   67:iload_3         
	//*  42   68:istore_2        
	//*  43   69:iload_1         
	//*  44   70:iconst_1        
	//*  45   71:icmple          151
	//*  46   74:aload_0         
	//*  47   75:invokespecial   #549 <Method int nextByte()>
	//*  48   78:istore_2        
	//*  49   79:iload_2         
	//*  50   80:sipush          192
	//*  51   83:iand            
	//*  52   84:sipush          128
	//*  53   87:icmpeq          99
	//*  54   90:aload_0         
	//*  55   91:iload_2         
	//*  56   92:sipush          255
	//*  57   95:iand            
	//*  58   96:invokevirtual   #431 <Method void _reportInvalidOther(int)>
	//*  59   99:iload_3         
	//*  60  100:bipush          6
	//*  61  102:ishl            
	//*  62  103:iload_2         
	//*  63  104:bipush          63
	//*  64  106:iand            
	//*  65  107:ior             
	//*  66  108:istore_3        
	//*  67  109:iload_3         
	//*  68  110:istore_2        
	//*  69  111:iload_1         
	//*  70  112:iconst_2        
	//*  71  113:icmple          151
	//*  72  116:aload_0         
	//*  73  117:invokespecial   #549 <Method int nextByte()>
	//*  74  120:istore_1        
	//*  75  121:iload_1         
	//*  76  122:sipush          192
	//*  77  125:iand            
	//*  78  126:sipush          128
	//*  79  129:icmpeq          141
	//*  80  132:aload_0         
	//*  81  133:iload_1         
	//*  82  134:sipush          255
	//*  83  137:iand            
	//*  84  138:invokevirtual   #431 <Method void _reportInvalidOther(int)>
	//*  85  141:iload_3         
	//*  86  142:bipush          6
	//*  87  144:ishl            
	//*  88  145:iload_1         
	//*  89  146:bipush          63
	//*  90  148:iand            
	//*  91  149:ior             
	//*  92  150:istore_2        
	//*  93  151:iload_2         
	//*  94  152:ireturn         
			if((i & 0xf0) == 224)
	//*  95  153:iload_1         
	//*  96  154:sipush          240
	//*  97  157:iand            
	//*  98  158:sipush          224
	//*  99  161:icmpne          174
			{
				j = i & 0xf;
	//  100  164:iload_1         
	//  101  165:bipush          15
	//  102  167:iand            
	//  103  168:istore_2        
				i = 2;
	//  104  169:iconst_2        
	//  105  170:istore_1        
			} else
	//* 106  171:goto            32
			if((i & 0xf8) == 240)
	//* 107  174:iload_1         
	//* 108  175:sipush          248
	//* 109  178:iand            
	//* 110  179:sipush          240
	//* 111  182:icmpne          195
			{
				j = i & 7;
	//  112  185:iload_1         
	//  113  186:bipush          7
	//  114  188:iand            
	//  115  189:istore_2        
				i = 3;
	//  116  190:iconst_3        
	//  117  191:istore_1        
			} else
	//* 118  192:goto            32
			{
				_reportInvalidInitial(i & 0xff);
	//  119  195:aload_0         
	//  120  196:iload_1         
	//  121  197:sipush          255
	//  122  200:iand            
	//  123  201:invokevirtual   #437 <Method void _reportInvalidInitial(int)>
				boolean flag = true;
	//  124  204:iconst_1        
	//  125  205:istore_3        
				j = i;
	//  126  206:iload_1         
	//  127  207:istore_2        
				i = ((int) (flag));
	//  128  208:iload_3         
	//  129  209:istore_1        
			}
			k = nextByte();
			if((k & 0xc0) != 128)
				_reportInvalidOther(k & 0xff);
			k = j << 6 | k & 0x3f;
			j = k;
			if(i > 1)
			{
				j = nextByte();
				if((j & 0xc0) != 128)
					_reportInvalidOther(j & 0xff);
				k = k << 6 | j & 0x3f;
				j = k;
				if(i > 2)
				{
					i = nextByte();
					if((i & 0xc0) != 128)
						_reportInvalidOther(i & 0xff);
					j = k << 6 | i & 0x3f;
				}
			}
		}
		return j;
	//* 130  210:goto            32
	}

	protected char _decodeEscaped()
		throws IOException
	{
		if(_inputPtr >= _inputEnd && !loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          25
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #249 <Method boolean loadMore()>
	//*   7   15:ifne            25
			_reportInvalidEOF(" in character escape sequence");
	//    8   18:aload_0         
	//    9   19:ldc2            #551 <String " in character escape sequence">
	//   10   22:invokevirtual   #309 <Method void _reportInvalidEOF(String)>
		byte abyte0[] = _inputBuffer;
	//   11   25:aload_0         
	//   12   26:getfield        #58  <Field byte[] _inputBuffer>
	//   13   29:astore          5
		int i = _inputPtr;
	//   14   31:aload_0         
	//   15   32:getfield        #61  <Field int _inputPtr>
	//   16   35:istore_1        
		_inputPtr = i + 1;
	//   17   36:aload_0         
	//   18   37:iload_1         
	//   19   38:iconst_1        
	//   20   39:iadd            
	//   21   40:putfield        #61  <Field int _inputPtr>
		i = ((int) (abyte0[i]));
	//   22   43:aload           5
	//   23   45:iload_1         
	//   24   46:baload          
	//   25   47:istore_1        
		int k;
		switch(i)
	//*  26   48:iload_1         
		{
	//*  27   49:lookupswitch    9: default 132
	//	               34: 158
	//	               47: 158
	//	               92: 158
	//	               98: 143
	//	               102: 152
	//	               110: 149
	//	               114: 155
	//	               116: 146
	//	               117: 161
		default:
			return _handleUnrecognizedCharacterEscape((char)_decodeCharForError(i));
	//   28  132:aload_0         
	//   29  133:aload_0         
	//   30  134:iload_1         
	//   31  135:invokevirtual   #81  <Method int _decodeCharForError(int)>
	//   32  138:int2char        
	//   33  139:invokevirtual   #555 <Method char _handleUnrecognizedCharacterEscape(char)>
	//   34  142:ireturn         

		case 98: // 'b'
			return '\b';
	//   35  143:bipush          8
	//   36  145:ireturn         

		case 116: // 't'
			return '\t';
	//   37  146:bipush          9
	//   38  148:ireturn         

		case 110: // 'n'
			return '\n';
	//   39  149:bipush          10
	//   40  151:ireturn         

		case 102: // 'f'
			return '\f';
	//   41  152:bipush          12
	//   42  154:ireturn         

		case 114: // 'r'
			return '\r';
	//   43  155:bipush          13
	//   44  157:ireturn         

		case 34: // '"'
		case 47: // '/'
		case 92: // '\\'
			return (char)i;
	//   45  158:iload_1         
	//   46  159:int2char        
	//   47  160:ireturn         

		case 117: // 'u'
			k = 0;
	//   48  161:iconst_0        
	//   49  162:istore_2        
			break;
		}
		for(int j = 0; j < 4; j++)
	//*  50  163:iconst_0        
	//*  51  164:istore_1        
	//*  52  165:iload_1         
	//*  53  166:iconst_4        
	//*  54  167:icmpge          251
		{
			if(_inputPtr >= _inputEnd && !loadMore())
	//*  55  170:aload_0         
	//*  56  171:getfield        #61  <Field int _inputPtr>
	//*  57  174:aload_0         
	//*  58  175:getfield        #64  <Field int _inputEnd>
	//*  59  178:icmplt          195
	//*  60  181:aload_0         
	//*  61  182:invokevirtual   #249 <Method boolean loadMore()>
	//*  62  185:ifne            195
				_reportInvalidEOF(" in character escape sequence");
	//   63  188:aload_0         
	//   64  189:ldc2            #551 <String " in character escape sequence">
	//   65  192:invokevirtual   #309 <Method void _reportInvalidEOF(String)>
			byte abyte1[] = _inputBuffer;
	//   66  195:aload_0         
	//   67  196:getfield        #58  <Field byte[] _inputBuffer>
	//   68  199:astore          5
			int l = _inputPtr;
	//   69  201:aload_0         
	//   70  202:getfield        #61  <Field int _inputPtr>
	//   71  205:istore_3        
			_inputPtr = l + 1;
	//   72  206:aload_0         
	//   73  207:iload_3         
	//   74  208:iconst_1        
	//   75  209:iadd            
	//   76  210:putfield        #61  <Field int _inputPtr>
			l = ((int) (abyte1[l]));
	//   77  213:aload           5
	//   78  215:iload_3         
	//   79  216:baload          
	//   80  217:istore_3        
			int i1 = CharTypes.charToHex(l);
	//   81  218:iload_3         
	//   82  219:invokestatic    #558 <Method int CharTypes.charToHex(int)>
	//   83  222:istore          4
			if(i1 < 0)
	//*  84  224:iload           4
	//*  85  226:ifge            237
				_reportUnexpectedChar(l, "expected a hex-digit for character escape sequence");
	//   86  229:aload_0         
	//   87  230:iload_3         
	//   88  231:ldc2            #560 <String "expected a hex-digit for character escape sequence">
	//   89  234:invokevirtual   #342 <Method void _reportUnexpectedChar(int, String)>
			k = k << 4 | i1;
	//   90  237:iload_2         
	//   91  238:iconst_4        
	//   92  239:ishl            
	//   93  240:iload           4
	//   94  242:ior             
	//   95  243:istore_2        
		}

	//   96  244:iload_1         
	//   97  245:iconst_1        
	//   98  246:iadd            
	//   99  247:istore_1        
	//* 100  248:goto            165
		return (char)k;
	//  101  251:iload_2         
	//  102  252:int2char        
	//  103  253:ireturn         
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
			loadMoreGuaranteed();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #102 <Method void loadMoreGuaranteed()>
			i = _inputPtr;
	//   11   19:aload_0         
	//   12   20:getfield        #61  <Field int _inputPtr>
	//   13   23:istore_1        
		}
		char ac[] = _textBuffer.emptyAndGetCurrentSegment();
	//   14   24:aload_0         
	//   15   25:getfield        #116 <Field TextBuffer _textBuffer>
	//   16   28:invokevirtual   #427 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//   17   31:astore          5
		int ai[] = _icUTF8;
	//   18   33:getstatic       #37  <Field int[] _icUTF8>
	//   19   36:astore          6
		int l = Math.min(_inputEnd, ac.length + i);
	//   20   38:aload_0         
	//   21   39:getfield        #64  <Field int _inputEnd>
	//   22   42:aload           5
	//   23   44:arraylength     
	//   24   45:iload_1         
	//   25   46:iadd            
	//   26   47:invokestatic    #128 <Method int Math.min(int, int)>
	//   27   50:istore          4
		byte abyte0[] = _inputBuffer;
	//   28   52:aload_0         
	//   29   53:getfield        #58  <Field byte[] _inputBuffer>
	//   30   56:astore          7
		boolean flag = false;
	//   31   58:iconst_0        
	//   32   59:istore_3        
		j = i;
	//   33   60:iload_1         
	//   34   61:istore_2        
		i = ((int) (flag));
	//   35   62:iload_3         
	//   36   63:istore_1        
		do
		{
			if(j >= l)
				break;
	//   37   64:iload_2         
	//   38   65:iload           4
	//   39   67:icmpge          125
			int k = abyte0[j] & 0xff;
	//   40   70:aload           7
	//   41   72:iload_2         
	//   42   73:baload          
	//   43   74:sipush          255
	//   44   77:iand            
	//   45   78:istore_3        
			if(ai[k] != 0)
	//*  46   79:aload           6
	//*  47   81:iload_3         
	//*  48   82:iaload          
	//*  49   83:ifeq            108
			{
				if(k == 34)
	//*  50   86:iload_3         
	//*  51   87:bipush          34
	//*  52   89:icmpne          125
				{
					_inputPtr = j + 1;
	//   53   92:aload_0         
	//   54   93:iload_2         
	//   55   94:iconst_1        
	//   56   95:iadd            
	//   57   96:putfield        #61  <Field int _inputPtr>
					return _textBuffer.setCurrentAndReturn(i);
	//   58   99:aload_0         
	//   59  100:getfield        #116 <Field TextBuffer _textBuffer>
	//   60  103:iload_1         
	//   61  104:invokevirtual   #564 <Method String TextBuffer.setCurrentAndReturn(int)>
	//   62  107:areturn         
				}
				break;
			}
			j++;
	//   63  108:iload_2         
	//   64  109:iconst_1        
	//   65  110:iadd            
	//   66  111:istore_2        
			ac[i] = (char)k;
	//   67  112:aload           5
	//   68  114:iload_1         
	//   69  115:iload_3         
	//   70  116:int2char        
	//   71  117:castore         
			i++;
	//   72  118:iload_1         
	//   73  119:iconst_1        
	//   74  120:iadd            
	//   75  121:istore_1        
		} while(true);
	//   76  122:goto            64
		_inputPtr = j;
	//   77  125:aload_0         
	//   78  126:iload_2         
	//   79  127:putfield        #61  <Field int _inputPtr>
		_finishString2(ac, i);
	//   80  130:aload_0         
	//   81  131:aload           5
	//   82  133:iload_1         
	//   83  134:invokespecial   #566 <Method void _finishString2(char[], int)>
		return _textBuffer.contentsAsString();
	//   84  137:aload_0         
	//   85  138:getfield        #116 <Field TextBuffer _textBuffer>
	//   86  141:invokevirtual   #569 <Method String TextBuffer.contentsAsString()>
	//   87  144:areturn         
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
			loadMoreGuaranteed();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #102 <Method void loadMoreGuaranteed()>
			i = _inputPtr;
	//   11   19:aload_0         
	//   12   20:getfield        #61  <Field int _inputPtr>
	//   13   23:istore_1        
		}
		char ac[] = _textBuffer.emptyAndGetCurrentSegment();
	//   14   24:aload_0         
	//   15   25:getfield        #116 <Field TextBuffer _textBuffer>
	//   16   28:invokevirtual   #427 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//   17   31:astore          5
		int ai[] = _icUTF8;
	//   18   33:getstatic       #37  <Field int[] _icUTF8>
	//   19   36:astore          6
		int l = Math.min(_inputEnd, ac.length + i);
	//   20   38:aload_0         
	//   21   39:getfield        #64  <Field int _inputEnd>
	//   22   42:aload           5
	//   23   44:arraylength     
	//   24   45:iload_1         
	//   25   46:iadd            
	//   26   47:invokestatic    #128 <Method int Math.min(int, int)>
	//   27   50:istore          4
		byte abyte0[] = _inputBuffer;
	//   28   52:aload_0         
	//   29   53:getfield        #58  <Field byte[] _inputBuffer>
	//   30   56:astore          7
		boolean flag = false;
	//   31   58:iconst_0        
	//   32   59:istore_3        
		j = i;
	//   33   60:iload_1         
	//   34   61:istore_2        
		i = ((int) (flag));
	//   35   62:iload_3         
	//   36   63:istore_1        
		do
		{
			if(j >= l)
				break;
	//   37   64:iload_2         
	//   38   65:iload           4
	//   39   67:icmpge          125
			int k = abyte0[j] & 0xff;
	//   40   70:aload           7
	//   41   72:iload_2         
	//   42   73:baload          
	//   43   74:sipush          255
	//   44   77:iand            
	//   45   78:istore_3        
			if(ai[k] != 0)
	//*  46   79:aload           6
	//*  47   81:iload_3         
	//*  48   82:iaload          
	//*  49   83:ifeq            108
			{
				if(k == 34)
	//*  50   86:iload_3         
	//*  51   87:bipush          34
	//*  52   89:icmpne          125
				{
					_inputPtr = j + 1;
	//   53   92:aload_0         
	//   54   93:iload_2         
	//   55   94:iconst_1        
	//   56   95:iadd            
	//   57   96:putfield        #61  <Field int _inputPtr>
					_textBuffer.setCurrentLength(i);
	//   58   99:aload_0         
	//   59  100:getfield        #116 <Field TextBuffer _textBuffer>
	//   60  103:iload_1         
	//   61  104:invokevirtual   #132 <Method void TextBuffer.setCurrentLength(int)>
					return;
	//   62  107:return          
				}
				break;
			}
			j++;
	//   63  108:iload_2         
	//   64  109:iconst_1        
	//   65  110:iadd            
	//   66  111:istore_2        
			ac[i] = (char)k;
	//   67  112:aload           5
	//   68  114:iload_1         
	//   69  115:iload_3         
	//   70  116:int2char        
	//   71  117:castore         
			i++;
	//   72  118:iload_1         
	//   73  119:iconst_1        
	//   74  120:iadd            
	//   75  121:istore_1        
		} while(true);
	//   76  122:goto            64
		_inputPtr = j;
	//   77  125:aload_0         
	//   78  126:iload_2         
	//   79  127:putfield        #61  <Field int _inputPtr>
		_finishString2(ac, i);
	//   80  130:aload_0         
	//   81  131:aload           5
	//   82  133:iload_1         
	//   83  134:invokespecial   #566 <Method void _finishString2(char[], int)>
	//   84  137:return          
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
	//*   5    7:invokevirtual   #575 <Method int JsonToken.id()>
		{
	//*   6   10:tableswitch     5 8: default 40
	//	               5 45
	//	               6 53
	//	               7 53
	//	               8 53
		default:
			return jsontoken.asString();
	//    7   40:aload_1         
	//    8   41:invokevirtual   #578 <Method String JsonToken.asString()>
	//    9   44:areturn         

		case 5: // '\005'
			return _parsingContext.getCurrentName();
	//   10   45:aload_0         
	//   11   46:getfield        #165 <Field JsonReadContext _parsingContext>
	//   12   49:invokevirtual   #581 <Method String JsonReadContext.getCurrentName()>
	//   13   52:areturn         

		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
			return _textBuffer.contentsAsString();
	//   14   53:aload_0         
	//   15   54:getfield        #116 <Field TextBuffer _textBuffer>
	//   16   57:invokevirtual   #569 <Method String TextBuffer.contentsAsString()>
	//   17   60:areturn         
		}
	}

	protected JsonToken _handleApos()
		throws IOException
	{
		int i;
		char ac1[];
		int ai[];
		byte abyte0[];
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		ac1 = _textBuffer.emptyAndGetCurrentSegment();
	//    2    2:aload_0         
	//    3    3:getfield        #116 <Field TextBuffer _textBuffer>
	//    4    6:invokevirtual   #427 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//    5    9:astore          7
		ai = _icUTF8;
	//    6   11:getstatic       #37  <Field int[] _icUTF8>
	//    7   14:astore          8
		abyte0 = _inputBuffer;
	//    8   16:aload_0         
	//    9   17:getfield        #58  <Field byte[] _inputBuffer>
	//   10   20:astore          9
_L7:
		int j;
		int j1;
		char ac[];
		if(_inputPtr >= _inputEnd)
	//*  11   22:aload_0         
	//*  12   23:getfield        #61  <Field int _inputPtr>
	//*  13   26:aload_0         
	//*  14   27:getfield        #64  <Field int _inputEnd>
	//*  15   30:icmplt          37
			loadMoreGuaranteed();
	//   16   33:aload_0         
	//   17   34:invokevirtual   #102 <Method void loadMoreGuaranteed()>
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
		j1 = _inputPtr + (ac.length - k);
	//   35   66:aload_0         
	//   36   67:getfield        #61  <Field int _inputPtr>
	//   37   70:aload           6
	//   38   72:arraylength     
	//   39   73:iload_3         
	//   40   74:isub            
	//   41   75:iadd            
	//   42   76:istore          5
		int i1 = i;
	//   43   78:iload_1         
	//   44   79:istore          4
		j = k;
	//   45   81:iload_3         
	//   46   82:istore_2        
		if(j1 < i)
	//*  47   83:iload           5
	//*  48   85:iload_1         
	//*  49   86:icmpge          95
		{
			i1 = j1;
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
			if(_inputPtr >= i1)
				continue; /* Loop/switch isn't completed */
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
			j1 = abyte0[i] & 0xff;
	//   70  122:aload           9
	//   71  124:iload_1         
	//   72  125:baload          
	//   73  126:sipush          255
	//   74  129:iand            
	//   75  130:istore          5
			if(j1 == 39 || ai[j1] != 0)
	//*  76  132:iload           5
	//*  77  134:bipush          39
	//*  78  136:icmpeq          147
	//*  79  139:aload           8
	//*  80  141:iload           5
	//*  81  143:iaload          
	//*  82  144:ifeq            166
			{
				if(j1 == 39)
	//*  83  147:iload           5
	//*  84  149:bipush          39
	//*  85  151:icmpne          180
				{
					_textBuffer.setCurrentLength(j);
	//   86  154:aload_0         
	//   87  155:getfield        #116 <Field TextBuffer _textBuffer>
	//   88  158:iload_2         
	//   89  159:invokevirtual   #132 <Method void TextBuffer.setCurrentLength(int)>
					return JsonToken.VALUE_STRING;
	//   90  162:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//   91  165:areturn         
				}
				break;
			}
			ac[j] = (char)j1;
	//   92  166:aload           6
	//   93  168:iload_2         
	//   94  169:iload           5
	//   95  171:int2char        
	//   96  172:castore         
			j++;
	//   97  173:iload_2         
	//   98  174:iconst_1        
	//   99  175:iadd            
	//  100  176:istore_2        
		} while(true);
	//  101  177:goto            95
		ai[j1];
	//  102  180:aload           8
	//  103  182:iload           5
	//  104  184:iaload          
		JVM INSTR tableswitch 1 4: default 216
	//	               1 287
	//	               2 317
	//	               3 333
	//	               4 378;
	//  105  185:tableswitch     1 4: default 216
	//	               1 287
	//	               2 317
	//	               3 333
	//	               4 378
		   goto _L1 _L2 _L3 _L4 _L5
_L5:
		break MISSING_BLOCK_LABEL_378;
_L2:
		break; /* Loop/switch isn't completed */
_L1:
		int l;
		if(j1 < 32)
	//* 106  216:iload           5
	//* 107  218:bipush          32
	//* 108  220:icmpge          231
			_throwUnquotedSpace(j1, "string value");
	//  109  223:aload_0         
	//  110  224:iload           5
	//  111  226:ldc1            #134 <String "string value">
	//  112  228:invokevirtual   #138 <Method void _throwUnquotedSpace(int, String)>
		_reportInvalidChar(j1);
	//  113  231:aload_0         
	//  114  232:iload           5
	//  115  234:invokevirtual   #155 <Method void _reportInvalidChar(int)>
		l = j;
	//  116  237:iload_2         
	//  117  238:istore_3        
		ac1 = ac;
	//  118  239:aload           6
	//  119  241:astore          7
		i = j1;
	//  120  243:iload           5
	//  121  245:istore_1        
_L8:
		ac = ac1;
	//  122  246:aload           7
	//  123  248:astore          6
		j = l;
	//  124  250:iload_3         
	//  125  251:istore_2        
		if(l >= ac1.length)
	//* 126  252:iload_3         
	//* 127  253:aload           7
	//* 128  255:arraylength     
	//* 129  256:icmplt          270
		{
			ac = _textBuffer.finishCurrentSegment();
	//  130  259:aload_0         
	//  131  260:getfield        #116 <Field TextBuffer _textBuffer>
	//  132  263:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
	//  133  266:astore          6
			j = 0;
	//  134  268:iconst_0        
	//  135  269:istore_2        
		}
		ac[j] = (char)i;
	//  136  270:aload           6
	//  137  272:iload_2         
	//  138  273:iload_1         
	//  139  274:int2char        
	//  140  275:castore         
		i = j + 1;
	//  141  276:iload_2         
	//  142  277:iconst_1        
	//  143  278:iadd            
	//  144  279:istore_1        
		ac1 = ac;
	//  145  280:aload           6
	//  146  282:astore          7
		if(true) goto _L7; else goto _L6
	//  147  284:goto            22
_L6:
		i = j1;
	//  148  287:iload           5
	//  149  289:istore_1        
		ac1 = ac;
	//  150  290:aload           6
	//  151  292:astore          7
		l = j;
	//  152  294:iload_2         
	//  153  295:istore_3        
		if(j1 != 39)
	//* 154  296:iload           5
	//* 155  298:bipush          39
	//* 156  300:icmpeq          246
		{
			i = ((int) (_decodeEscaped()));
	//  157  303:aload_0         
	//  158  304:invokevirtual   #142 <Method char _decodeEscaped()>
	//  159  307:istore_1        
			ac1 = ac;
	//  160  308:aload           6
	//  161  310:astore          7
			l = j;
	//  162  312:iload_2         
	//  163  313:istore_3        
		}
		  goto _L8
	//* 164  314:goto            246
_L3:
		i = _decodeUtf8_2(j1);
	//  165  317:aload_0         
	//  166  318:iload           5
	//  167  320:invokespecial   #144 <Method int _decodeUtf8_2(int)>
	//  168  323:istore_1        
		ac1 = ac;
	//  169  324:aload           6
	//  170  326:astore          7
		l = j;
	//  171  328:iload_2         
	//  172  329:istore_3        
		  goto _L8
	//* 173  330:goto            246
_L4:
		if(_inputEnd - _inputPtr >= 2)
	//* 174  333:aload_0         
	//* 175  334:getfield        #64  <Field int _inputEnd>
	//* 176  337:aload_0         
	//* 177  338:getfield        #61  <Field int _inputPtr>
	//* 178  341:isub            
	//* 179  342:iconst_2        
	//* 180  343:icmplt          362
		{
			i = _decodeUtf8_3fast(j1);
	//  181  346:aload_0         
	//  182  347:iload           5
	//  183  349:invokespecial   #146 <Method int _decodeUtf8_3fast(int)>
	//  184  352:istore_1        
			ac1 = ac;
	//  185  353:aload           6
	//  186  355:astore          7
			l = j;
	//  187  357:iload_2         
	//  188  358:istore_3        
		} else
	//* 189  359:goto            246
		{
			i = _decodeUtf8_3(j1);
	//  190  362:aload_0         
	//  191  363:iload           5
	//  192  365:invokespecial   #148 <Method int _decodeUtf8_3(int)>
	//  193  368:istore_1        
			ac1 = ac;
	//  194  369:aload           6
	//  195  371:astore          7
			l = j;
	//  196  373:iload_2         
	//  197  374:istore_3        
		}
		  goto _L8
	//* 198  375:goto            246
		i = _decodeUtf8_4(j1);
	//  199  378:aload_0         
	//  200  379:iload           5
	//  201  381:invokespecial   #150 <Method int _decodeUtf8_4(int)>
	//  202  384:istore_1        
		l = j + 1;
	//  203  385:iload_2         
	//  204  386:iconst_1        
	//  205  387:iadd            
	//  206  388:istore_3        
		ac[j] = (char)(0xd800 | i >> 10);
	//  207  389:aload           6
	//  208  391:iload_2         
	//  209  392:ldc1            #151 <Int 55296>
	//  210  394:iload_1         
	//  211  395:bipush          10
	//  212  397:ishr            
	//  213  398:ior             
	//  214  399:int2char        
	//  215  400:castore         
		if(l >= ac.length)
	//* 216  401:iload_3         
	//* 217  402:aload           6
	//* 218  404:arraylength     
	//* 219  405:icmplt          435
		{
			ac = _textBuffer.finishCurrentSegment();
	//  220  408:aload_0         
	//  221  409:getfield        #116 <Field TextBuffer _textBuffer>
	//  222  412:invokevirtual   #122 <Method char[] TextBuffer.finishCurrentSegment()>
	//  223  415:astore          6
			l = 0;
	//  224  417:iconst_0        
	//  225  418:istore_3        
		}
		i = 0xdc00 | i & 0x3ff;
	//  226  419:ldc1            #152 <Int 56320>
	//  227  421:iload_1         
	//  228  422:sipush          1023
	//  229  425:iand            
	//  230  426:ior             
	//  231  427:istore_1        
		ac1 = ac;
	//  232  428:aload           6
	//  233  430:astore          7
		  goto _L8
	//* 234  432:goto            246
	//* 235  435:goto            419
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
	//    4    6:icmpne          180
			if(_inputPtr >= _inputEnd && !loadMore())
	//*   5    9:aload_0         
	//*   6   10:getfield        #61  <Field int _inputPtr>
	//*   7   13:aload_0         
	//*   8   14:getfield        #64  <Field int _inputEnd>
	//*   9   17:icmplt          31
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #249 <Method boolean loadMore()>
	//*  12   24:ifne            31
				_reportInvalidEOFInValue();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #587 <Method void _reportInvalidEOFInValue()>
			byte abyte0[] = _inputBuffer;
	//   15   31:aload_0         
	//   16   32:getfield        #58  <Field byte[] _inputBuffer>
	//   17   35:astore          6
			i = _inputPtr;
	//   18   37:aload_0         
	//   19   38:getfield        #61  <Field int _inputPtr>
	//   20   41:istore_1        
			_inputPtr = i + 1;
	//   21   42:aload_0         
	//   22   43:iload_1         
	//   23   44:iconst_1        
	//   24   45:iadd            
	//   25   46:putfield        #61  <Field int _inputPtr>
			i = ((int) (abyte0[i]));
	//   26   49:aload           6
	//   27   51:iload_1         
	//   28   52:baload          
	//   29   53:istore_1        
			String s;
			if(i == 78)
	//*  30   54:iload_1         
	//*  31   55:bipush          78
	//*  32   57:icmpne          110
			{
				if(flag)
	//*  33   60:iload_2         
	//*  34   61:ifeq            102
					s = "-INF";
	//   35   64:ldc2            #589 <String "-INF">
	//   36   67:astore          6
				else
	//*  37   69:aload_0         
	//*  38   70:aload           6
	//*  39   72:iconst_3        
	//*  40   73:invokevirtual   #220 <Method void _matchToken(String, int)>
	//*  41   76:aload_0         
	//*  42   77:getstatic       #592 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  43   80:invokevirtual   #375 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  44   83:ifeq            146
	//*  45   86:iload_2         
	//*  46   87:ifeq            139
	//*  47   90:ldc2w           #593 <Double (-1.0D / 0.0D)>
	//*  48   93:dstore_3        
	//*  49   94:aload_0         
	//*  50   95:aload           6
	//*  51   97:dload_3         
	//*  52   98:invokevirtual   #598 <Method JsonToken resetAsNaN(String, double)>
	//*  53  101:areturn         
					s = "+INF";
	//   54  102:ldc2            #600 <String "+INF">
	//   55  105:astore          6
			} else
	//*  56  107:goto            69
			{
				j = i;
	//   57  110:iload_1         
	//   58  111:istore          5
				if(i != 110)
					break;
	//   59  113:iload_1         
	//   60  114:bipush          110
	//   61  116:icmpne          180
				if(flag)
	//*  62  119:iload_2         
	//*  63  120:ifeq            131
					s = "-Infinity";
	//   64  123:ldc2            #602 <String "-Infinity">
	//   65  126:astore          6
				else
	//*  66  128:goto            69
					s = "+Infinity";
	//   67  131:ldc2            #604 <String "+Infinity">
	//   68  134:astore          6
			}
			_matchToken(s, 3);
			if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
			{
				double d;
				if(flag)
					d = (-1.0D / 0.0D);
				else
	//*  69  136:goto            128
					d = (1.0D / 0.0D);
	//   70  139:ldc2w           #605 <Double (1.0D / 0.0D)>
	//   71  142:dstore_3        
				return resetAsNaN(s, d);
			}
	//*  72  143:goto            94
			_reportError((new StringBuilder()).append("Non-standard token '").append(s).append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow").toString());
	//   73  146:aload_0         
	//   74  147:new             #344 <Class StringBuilder>
	//   75  150:dup             
	//   76  151:invokespecial   #346 <Method void StringBuilder()>
	//   77  154:ldc2            #608 <String "Non-standard token '">
	//   78  157:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   79  160:aload           6
	//   80  162:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   81  165:ldc2            #610 <String "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//   82  168:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   83  171:invokevirtual   #360 <Method String StringBuilder.toString()>
	//   84  174:invokevirtual   #613 <Method void _reportError(String)>
		} while(true);
	//   85  177:goto            0
		reportUnexpectedNumberChar(j, "expected digit (0-9) to follow minus sign, for valid numeric value");
	//   86  180:aload_0         
	//   87  181:iload           5
	//   88  183:ldc2            #615 <String "expected digit (0-9) to follow minus sign, for valid numeric value">
	//   89  186:invokevirtual   #280 <Method void reportUnexpectedNumberChar(int, String)>
		return null;
	//   90  189:aconst_null     
	//   91  190:areturn         
	}

	protected String _handleOddName(int i)
		throws IOException
	{
		if(i != 39 || !isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES)) goto _L2; else goto _L1
	//    0    0:iload_1         
	//    1    1:bipush          39
	//    2    3:icmpne          25
	//    3    6:aload_0         
	//    4    7:getstatic       #619 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_SINGLE_QUOTES>
	//    5   10:invokevirtual   #375 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//    6   13:ifeq            25
_L1:
		String s = _parseAposName();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #622 <Method String _parseAposName()>
	//    9   20:astore          6
_L4:
		return s;
	//   10   22:aload           6
	//   11   24:areturn         
_L2:
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES))
	//*  12   25:aload_0         
	//*  13   26:getstatic       #625 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_UNQUOTED_FIELD_NAMES>
	//*  14   29:invokevirtual   #375 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  15   32:ifne            48
			_reportUnexpectedChar(((int) ((char)_decodeCharForError(i))), "was expecting double-quote to start field name");
	//   16   35:aload_0         
	//   17   36:aload_0         
	//   18   37:iload_1         
	//   19   38:invokevirtual   #81  <Method int _decodeCharForError(int)>
	//   20   41:int2char        
	//   21   42:ldc2            #627 <String "was expecting double-quote to start field name">
	//   22   45:invokevirtual   #342 <Method void _reportUnexpectedChar(int, String)>
		int ai2[] = CharTypes.getInputCodeUtf8JsNames();
	//   23   48:invokestatic    #630 <Method int[] CharTypes.getInputCodeUtf8JsNames()>
	//   24   51:astore          8
		if(ai2[i] != 0)
	//*  25   53:aload           8
	//*  26   55:iload_1         
	//*  27   56:iaload          
	//*  28   57:ifeq            68
			_reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
	//   29   60:aload_0         
	//   30   61:iload_1         
	//   31   62:ldc2            #632 <String "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name">
	//   32   65:invokevirtual   #342 <Method void _reportUnexpectedChar(int, String)>
		s = ((String) (_quadBuffer));
	//   33   68:aload_0         
	//   34   69:getfield        #50  <Field int[] _quadBuffer>
	//   35   72:astore          6
		int k = 0;
	//   36   74:iconst_0        
	//   37   75:istore_3        
		int l = 0;
	//   38   76:iconst_0        
	//   39   77:istore          4
		boolean flag = false;
	//   40   79:iconst_0        
	//   41   80:istore          5
		int j = i;
	//   42   82:iload_1         
	//   43   83:istore_2        
		i = ((int) (flag));
	//   44   84:iload           5
	//   45   86:istore_1        
		do
		{
			int i1;
label0:
			{
				int ai[];
				String s1;
				if(l < 4)
	//*  46   87:iload           4
	//*  47   89:iconst_4        
	//*  48   90:icmpge          237
				{
					l++;
	//   49   93:iload           4
	//   50   95:iconst_1        
	//   51   96:iadd            
	//   52   97:istore          4
					k = k << 8 | j;
	//   53   99:iload_3         
	//   54  100:bipush          8
	//   55  102:ishl            
	//   56  103:iload_2         
	//   57  104:ior             
	//   58  105:istore_3        
					j = l;
	//   59  106:iload           4
	//   60  108:istore_2        
				} else
	//*  61  109:aload_0         
	//*  62  110:getfield        #61  <Field int _inputPtr>
	//*  63  113:aload_0         
	//*  64  114:getfield        #64  <Field int _inputEnd>
	//*  65  117:icmplt          134
	//*  66  120:aload_0         
	//*  67  121:invokevirtual   #249 <Method boolean loadMore()>
	//*  68  124:ifne            134
	//*  69  127:aload_0         
	//*  70  128:ldc2            #429 <String " in field name">
	//*  71  131:invokevirtual   #309 <Method void _reportInvalidEOF(String)>
	//*  72  134:aload_0         
	//*  73  135:getfield        #58  <Field byte[] _inputBuffer>
	//*  74  138:aload_0         
	//*  75  139:getfield        #61  <Field int _inputPtr>
	//*  76  142:baload          
	//*  77  143:sipush          255
	//*  78  146:iand            
	//*  79  147:istore          5
	//*  80  149:aload           8
	//*  81  151:iload           5
	//*  82  153:iaload          
	//*  83  154:ifeq            290
	//*  84  157:iload_1         
	//*  85  158:istore          4
	//*  86  160:aload           6
	//*  87  162:astore          7
	//*  88  164:iload_2         
	//*  89  165:ifle            205
	//*  90  168:aload           6
	//*  91  170:astore          7
	//*  92  172:iload_1         
	//*  93  173:aload           6
	//*  94  175:arraylength     
	//*  95  176:icmplt          195
	//*  96  179:aload           6
	//*  97  181:aload           6
	//*  98  183:arraylength     
	//*  99  184:invokestatic    #464 <Method int[] growArrayBy(int[], int)>
	//* 100  187:astore          7
	//* 101  189:aload_0         
	//* 102  190:aload           7
	//* 103  192:putfield        #50  <Field int[] _quadBuffer>
	//* 104  195:aload           7
	//* 105  197:iload_1         
	//* 106  198:iload_3         
	//* 107  199:iastore         
	//* 108  200:iload_1         
	//* 109  201:iconst_1        
	//* 110  202:iadd            
	//* 111  203:istore          4
	//* 112  205:aload_0         
	//* 113  206:getfield        #56  <Field ByteQuadsCanonicalizer _symbols>
	//* 114  209:aload           7
	//* 115  211:iload           4
	//* 116  213:invokevirtual   #467 <Method String ByteQuadsCanonicalizer.findName(int[], int)>
	//* 117  216:astore          8
	//* 118  218:aload           8
	//* 119  220:astore          6
	//* 120  222:aload           8
	//* 121  224:ifnonnull       22
	//* 122  227:aload_0         
	//* 123  228:aload           7
	//* 124  230:iload           4
	//* 125  232:iload_2         
	//* 126  233:invokespecial   #453 <Method String addName(int[], int, int)>
	//* 127  236:areturn         
				{
					int ai1[] = ((int []) (s));
	//  128  237:aload           6
	//  129  239:astore          7
					if(i >= s.length)
	//* 130  241:iload_1         
	//* 131  242:aload           6
	//* 132  244:arraylength     
	//* 133  245:icmplt          264
					{
						ai1 = growArrayBy(((int []) (s)), s.length);
	//  134  248:aload           6
	//  135  250:aload           6
	//  136  252:arraylength     
	//  137  253:invokestatic    #464 <Method int[] growArrayBy(int[], int)>
	//  138  256:astore          7
						_quadBuffer = ai1;
	//  139  258:aload_0         
	//  140  259:aload           7
	//  141  261:putfield        #50  <Field int[] _quadBuffer>
					}
					l = i + 1;
	//  142  264:iload_1         
	//  143  265:iconst_1        
	//  144  266:iadd            
	//  145  267:istore          4
					ai1[i] = k;
	//  146  269:aload           7
	//  147  271:iload_1         
	//  148  272:iload_3         
	//  149  273:iastore         
					i = 1;
	//  150  274:iconst_1        
	//  151  275:istore_1        
					k = j;
	//  152  276:iload_2         
	//  153  277:istore_3        
					j = i;
	//  154  278:iload_1         
	//  155  279:istore_2        
					i = l;
	//  156  280:iload           4
	//  157  282:istore_1        
					s = ((String) (ai1));
	//  158  283:aload           7
	//  159  285:astore          6
				}
				if(_inputPtr >= _inputEnd && !loadMore())
					_reportInvalidEOF(" in field name");
				i1 = _inputBuffer[_inputPtr] & 0xff;
				if(ai2[i1] == 0)
					break label0;
				l = i;
				ai = ((int []) (s));
				if(j > 0)
				{
					ai = ((int []) (s));
					if(i >= s.length)
					{
						ai = growArrayBy(((int []) (s)), s.length);
						_quadBuffer = ai;
					}
					ai[i] = k;
					l = i + 1;
				}
				s1 = _symbols.findName(ai, l);
				s = s1;
				if(s1 == null)
					return addName(ai, l, j);
			}
			if(true)
				continue;
	//  160  287:goto            109
			_inputPtr = _inputPtr + 1;
	//  161  290:aload_0         
	//  162  291:aload_0         
	//  163  292:getfield        #61  <Field int _inputPtr>
	//  164  295:iconst_1        
	//  165  296:iadd            
	//  166  297:putfield        #61  <Field int _inputPtr>
			l = j;
	//  167  300:iload_2         
	//  168  301:istore          4
			j = i1;
	//  169  303:iload           5
	//  170  305:istore_2        
		} while(true);
	//  171  306:goto            87
		if(true) goto _L4; else goto _L3
_L3:
	}

	protected JsonToken _handleUnexpectedValue(int i)
		throws IOException
	{
		i;
	//    0    0:iload_1         
		JVM INSTR lookupswitch 6: default 60
	//	               39: 113
	//	               43: 206
	//	               73: 167
	//	               78: 128
	//	               93: 105
	//	               125: 105;
	//    1    1:lookupswitch    6: default 60
	//	               39: 113
	//	               43: 206
	//	               73: 167
	//	               78: 128
	//	               93: 105
	//	               125: 105
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L6
_L1:
		if(Character.isJavaIdentifierStart(i))
	//*   2   60:iload_1         
	//*   3   61:invokestatic    #635 <Method boolean Character.isJavaIdentifierStart(int)>
	//*   4   64:ifeq            95
			_reportInvalidToken((new StringBuilder()).append("").append((char)i).toString(), "('true', 'false' or 'null')");
	//    5   67:aload_0         
	//    6   68:new             #344 <Class StringBuilder>
	//    7   71:dup             
	//    8   72:invokespecial   #346 <Method void StringBuilder()>
	//    9   75:ldc2            #637 <String "">
	//   10   78:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   11   81:iload_1         
	//   12   82:int2char        
	//   13   83:invokevirtual   #535 <Method StringBuilder StringBuilder.append(char)>
	//   14   86:invokevirtual   #360 <Method String StringBuilder.toString()>
	//   15   89:ldc2            #639 <String "('true', 'false' or 'null')">
	//   16   92:invokevirtual   #642 <Method void _reportInvalidToken(String, String)>
		_reportUnexpectedChar(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
	//   17   95:aload_0         
	//   18   96:iload_1         
	//   19   97:ldc2            #644 <String "expected a valid value (number, String, array, object, 'true', 'false' or 'null')">
	//   20  100:invokevirtual   #342 <Method void _reportUnexpectedChar(int, String)>
		return null;
	//   21  103:aconst_null     
	//   22  104:areturn         
_L6:
		_reportUnexpectedChar(i, "expected a value");
	//   23  105:aload_0         
	//   24  106:iload_1         
	//   25  107:ldc2            #646 <String "expected a value">
	//   26  110:invokevirtual   #342 <Method void _reportUnexpectedChar(int, String)>
_L2:
		if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES))
	//*  27  113:aload_0         
	//*  28  114:getstatic       #619 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_SINGLE_QUOTES>
	//*  29  117:invokevirtual   #375 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  30  120:ifeq            60
			return _handleApos();
	//   31  123:aload_0         
	//   32  124:invokevirtual   #648 <Method JsonToken _handleApos()>
	//   33  127:areturn         
		continue; /* Loop/switch isn't completed */
_L5:
		_matchToken("NaN", 1);
	//   34  128:aload_0         
	//   35  129:ldc2            #650 <String "NaN">
	//   36  132:iconst_1        
	//   37  133:invokevirtual   #220 <Method void _matchToken(String, int)>
		if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
	//*  38  136:aload_0         
	//*  39  137:getstatic       #592 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  40  140:invokevirtual   #375 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  41  143:ifeq            157
			return resetAsNaN("NaN", (0.0D / 0.0D));
	//   42  146:aload_0         
	//   43  147:ldc2            #650 <String "NaN">
	//   44  150:ldc2w           #651 <Double (0.0D / 0.0D)>
	//   45  153:invokevirtual   #598 <Method JsonToken resetAsNaN(String, double)>
	//   46  156:areturn         
		_reportError("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
	//   47  157:aload_0         
	//   48  158:ldc2            #654 <String "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//   49  161:invokevirtual   #613 <Method void _reportError(String)>
		continue; /* Loop/switch isn't completed */
	//   50  164:goto            60
_L4:
		_matchToken("Infinity", 1);
	//   51  167:aload_0         
	//   52  168:ldc2            #656 <String "Infinity">
	//   53  171:iconst_1        
	//   54  172:invokevirtual   #220 <Method void _matchToken(String, int)>
		if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
	//*  55  175:aload_0         
	//*  56  176:getstatic       #592 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  57  179:invokevirtual   #375 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  58  182:ifeq            196
			return resetAsNaN("Infinity", (1.0D / 0.0D));
	//   59  185:aload_0         
	//   60  186:ldc2            #656 <String "Infinity">
	//   61  189:ldc2w           #605 <Double (1.0D / 0.0D)>
	//   62  192:invokevirtual   #598 <Method JsonToken resetAsNaN(String, double)>
	//   63  195:areturn         
		_reportError("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
	//   64  196:aload_0         
	//   65  197:ldc2            #658 <String "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//   66  200:invokevirtual   #613 <Method void _reportError(String)>
		if(true) goto _L1; else goto _L3
	//   67  203:goto            60
_L3:
		if(_inputPtr >= _inputEnd && !loadMore())
	//*  68  206:aload_0         
	//*  69  207:getfield        #61  <Field int _inputPtr>
	//*  70  210:aload_0         
	//*  71  211:getfield        #64  <Field int _inputEnd>
	//*  72  214:icmplt          228
	//*  73  217:aload_0         
	//*  74  218:invokevirtual   #249 <Method boolean loadMore()>
	//*  75  221:ifne            228
			_reportInvalidEOFInValue();
	//   76  224:aload_0         
	//   77  225:invokevirtual   #587 <Method void _reportInvalidEOFInValue()>
		byte abyte0[] = _inputBuffer;
	//   78  228:aload_0         
	//   79  229:getfield        #58  <Field byte[] _inputBuffer>
	//   80  232:astore_2        
		i = _inputPtr;
	//   81  233:aload_0         
	//   82  234:getfield        #61  <Field int _inputPtr>
	//   83  237:istore_1        
		_inputPtr = i + 1;
	//   84  238:aload_0         
	//   85  239:iload_1         
	//   86  240:iconst_1        
	//   87  241:iadd            
	//   88  242:putfield        #61  <Field int _inputPtr>
		return _handleInvalidNumberStart(abyte0[i] & 0xff, false);
	//   89  245:aload_0         
	//   90  246:aload_2         
	//   91  247:iload_1         
	//   92  248:baload          
	//   93  249:sipush          255
	//   94  252:iand            
	//   95  253:iconst_0        
	//   96  254:invokevirtual   #660 <Method JsonToken _handleInvalidNumberStart(int, boolean)>
	//   97  257:areturn         
	}

	protected final boolean _loadToHaveAtLeast(int i)
		throws IOException
	{
		if(_inputStream != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field InputStream _inputStream>
	//    2    4:ifnonnull       9
_L1:
		return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
_L2:
		int j = _inputEnd - _inputPtr;
	//    5    9:aload_0         
	//    6   10:getfield        #64  <Field int _inputEnd>
	//    7   13:aload_0         
	//    8   14:getfield        #61  <Field int _inputPtr>
	//    9   17:isub            
	//   10   18:istore_2        
		if(j > 0 && _inputPtr > 0)
	//*  11   19:iload_2         
	//*  12   20:ifle            171
	//*  13   23:aload_0         
	//*  14   24:getfield        #61  <Field int _inputPtr>
	//*  15   27:ifle            171
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
	//   34   58:getfield        #406 <Field int _nameStartOffset>
	//   35   61:iload_3         
	//   36   62:isub            
	//   37   63:putfield        #406 <Field int _nameStartOffset>
			System.arraycopy(((Object) (_inputBuffer)), k, ((Object) (_inputBuffer)), 0, j);
	//   38   66:aload_0         
	//   39   67:getfield        #58  <Field byte[] _inputBuffer>
	//   40   70:iload_3         
	//   41   71:aload_0         
	//   42   72:getfield        #58  <Field byte[] _inputBuffer>
	//   43   75:iconst_0        
	//   44   76:iload_2         
	//   45   77:invokestatic    #667 <Method void System.arraycopy(Object, int, Object, int, int)>
			_inputEnd = j;
	//   46   80:aload_0         
	//   47   81:iload_2         
	//   48   82:putfield        #64  <Field int _inputEnd>
		} else
	//*  49   85:aload_0         
	//*  50   86:iconst_0        
	//*  51   87:putfield        #61  <Field int _inputPtr>
	//*  52   90:aload_0         
	//*  53   91:getfield        #64  <Field int _inputEnd>
	//*  54   94:iload_1         
	//*  55   95:icmpge          192
	//*  56   98:aload_0         
	//*  57   99:getfield        #52  <Field InputStream _inputStream>
	//*  58  102:aload_0         
	//*  59  103:getfield        #58  <Field byte[] _inputBuffer>
	//*  60  106:aload_0         
	//*  61  107:getfield        #64  <Field int _inputEnd>
	//*  62  110:aload_0         
	//*  63  111:getfield        #58  <Field byte[] _inputBuffer>
	//*  64  114:arraylength     
	//*  65  115:aload_0         
	//*  66  116:getfield        #64  <Field int _inputEnd>
	//*  67  119:isub            
	//*  68  120:invokevirtual   #671 <Method int InputStream.read(byte[], int, int)>
	//*  69  123:istore_3        
	//*  70  124:iload_3         
	//*  71  125:iconst_1        
	//*  72  126:icmpge          179
	//*  73  129:aload_0         
	//*  74  130:invokevirtual   #673 <Method void _closeInput()>
	//*  75  133:iload_3         
	//*  76  134:ifne            7
	//*  77  137:new             #77  <Class IOException>
	//*  78  140:dup             
	//*  79  141:new             #344 <Class StringBuilder>
	//*  80  144:dup             
	//*  81  145:invokespecial   #346 <Method void StringBuilder()>
	//*  82  148:ldc2            #675 <String "InputStream.read() returned 0 characters when trying to read ">
	//*  83  151:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//*  84  154:iload_2         
	//*  85  155:invokevirtual   #678 <Method StringBuilder StringBuilder.append(int)>
	//*  86  158:ldc2            #680 <String " bytes">
	//*  87  161:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//*  88  164:invokevirtual   #360 <Method String StringBuilder.toString()>
	//*  89  167:invokespecial   #682 <Method void IOException(String)>
	//*  90  170:athrow          
		{
			_inputEnd = 0;
	//   91  171:aload_0         
	//   92  172:iconst_0        
	//   93  173:putfield        #64  <Field int _inputEnd>
		}
		_inputPtr = 0;
		do
		{
			if(_inputEnd >= i)
				break;
			int l = _inputStream.read(_inputBuffer, _inputEnd, _inputBuffer.length - _inputEnd);
			if(l < 1)
			{
				_closeInput();
				if(l == 0)
					throw new IOException((new StringBuilder()).append("InputStream.read() returned 0 characters when trying to read ").append(j).append(" bytes").toString());
				continue; /* Loop/switch isn't completed */
			}
	//*  94  176:goto            85
			_inputEnd = _inputEnd + l;
	//   95  179:aload_0         
	//   96  180:aload_0         
	//   97  181:getfield        #64  <Field int _inputEnd>
	//   98  184:iload_3         
	//   99  185:iadd            
	//  100  186:putfield        #64  <Field int _inputEnd>
		} while(true);
	//  101  189:goto            90
		return true;
	//  102  192:iconst_1        
	//  103  193:ireturn         
		if(true) goto _L1; else goto _L3
_L3:
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
	//   15   25:invokespecial   #684 <Method void _matchToken2(String, int)>
		} else
	//*  16   28:return          
		{
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
	//*  57   95:icmplt          28
	//*  58   98:iload_3         
	//*  59   99:bipush          93
	//*  60  101:icmpeq          28
	//*  61  104:iload_3         
	//*  62  105:bipush          125
	//*  63  107:icmpeq          28
			{
				_checkMatchEnd(s, i, j);
	//   64  110:aload_0         
	//   65  111:aload_1         
	//   66  112:iload_2         
	//   67  113:iload_3         
	//   68  114:invokespecial   #255 <Method void _checkMatchEnd(String, int, int)>
				return;
	//   69  117:return          
			}
		}
	}

	protected String _parseAposName()
		throws IOException
	{
		int i1;
		if(_inputPtr >= _inputEnd && !loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          25
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #249 <Method boolean loadMore()>
	//*   7   15:ifne            25
			_reportInvalidEOF(": was expecting closing ''' for name");
	//    8   18:aload_0         
	//    9   19:ldc2            #686 <String ": was expecting closing ''' for name">
	//   10   22:invokevirtual   #309 <Method void _reportInvalidEOF(String)>
		byte abyte0[] = _inputBuffer;
	//   11   25:aload_0         
	//   12   26:getfield        #58  <Field byte[] _inputBuffer>
	//   13   29:astore          10
		int i = _inputPtr;
	//   14   31:aload_0         
	//   15   32:getfield        #61  <Field int _inputPtr>
	//   16   35:istore_1        
		_inputPtr = i + 1;
	//   17   36:aload_0         
	//   18   37:iload_1         
	//   19   38:iconst_1        
	//   20   39:iadd            
	//   21   40:putfield        #61  <Field int _inputPtr>
		i1 = abyte0[i] & 0xff;
	//   22   43:aload           10
	//   23   45:iload_1         
	//   24   46:baload          
	//   25   47:sipush          255
	//   26   50:iand            
	//   27   51:istore          4
		if(i1 != 39) goto _L2; else goto _L1
	//   28   53:iload           4
	//   29   55:bipush          39
	//   30   57:icmpne          68
_L1:
		int ai[] = "";
	//   31   60:ldc2            #637 <String "">
	//   32   63:astore          10
_L8:
		return ((String) (ai));
	//   33   65:aload           10
	//   34   67:areturn         
_L2:
		int j;
		int k;
		int l;
		Object obj;
		ai = _quadBuffer;
	//   35   68:aload_0         
	//   36   69:getfield        #50  <Field int[] _quadBuffer>
	//   37   72:astore          10
		l = 0;
	//   38   74:iconst_0        
	//   39   75:istore_3        
		k = 0;
	//   40   76:iconst_0        
	//   41   77:istore_2        
		obj = ((Object) (_icLatin1));
	//   42   78:getstatic       #42  <Field int[] _icLatin1>
	//   43   81:astore          12
		j = 0;
	//   44   83:iconst_0        
	//   45   84:istore_1        
_L6:
		int ai1[];
label0:
		{
			if(i1 != 39)
				break label0;
	//   46   85:iload           4
	//   47   87:bipush          39
	//   48   89:icmpne          170
			int j1;
			int k1;
			int l1;
			int i2;
			int j2;
			if(k > 0)
	//*  49   92:iload_2         
	//*  50   93:ifle            623
			{
				ai1 = ai;
	//   51   96:aload           10
	//   52   98:astore          11
				if(j >= ai.length)
	//*  53  100:iload_1         
	//*  54  101:aload           10
	//*  55  103:arraylength     
	//*  56  104:icmplt          123
				{
					ai1 = growArrayBy(ai, ai.length);
	//   57  107:aload           10
	//   58  109:aload           10
	//   59  111:arraylength     
	//   60  112:invokestatic    #464 <Method int[] growArrayBy(int[], int)>
	//   61  115:astore          11
					_quadBuffer = ai1;
	//   62  117:aload_0         
	//   63  118:aload           11
	//   64  120:putfield        #50  <Field int[] _quadBuffer>
				}
				i1 = j + 1;
	//   65  123:iload_1         
	//   66  124:iconst_1        
	//   67  125:iadd            
	//   68  126:istore          4
				ai1[j] = pad(l, k);
	//   69  128:aload           11
	//   70  130:iload_1         
	//   71  131:iload_3         
	//   72  132:iload_2         
	//   73  133:invokestatic    #449 <Method int pad(int, int)>
	//   74  136:iastore         
				j = i1;
	//   75  137:iload           4
	//   76  139:istore_1        
			} else
	//*  77  140:aload_0         
	//*  78  141:getfield        #56  <Field ByteQuadsCanonicalizer _symbols>
	//*  79  144:aload           11
	//*  80  146:iload_1         
	//*  81  147:invokevirtual   #467 <Method String ByteQuadsCanonicalizer.findName(int[], int)>
	//*  82  150:astore          12
	//*  83  152:aload           12
	//*  84  154:astore          10
	//*  85  156:aload           12
	//*  86  158:ifnonnull       65
	//*  87  161:aload_0         
	//*  88  162:aload           11
	//*  89  164:iload_1         
	//*  90  165:iload_2         
	//*  91  166:invokespecial   #453 <Method String addName(int[], int, int)>
	//*  92  169:areturn         
	//*  93  170:iload           4
	//*  94  172:istore          5
	//*  95  174:iload_3         
	//*  96  175:istore          8
	//*  97  177:iload_2         
	//*  98  178:istore          9
	//*  99  180:iload_1         
	//* 100  181:istore          7
	//* 101  183:aload           10
	//* 102  185:astore          11
	//* 103  187:iload           4
	//* 104  189:bipush          34
	//* 105  191:icmpeq          376
	//* 106  194:iload           4
	//* 107  196:istore          5
	//* 108  198:iload_3         
	//* 109  199:istore          8
	//* 110  201:iload_2         
	//* 111  202:istore          9
	//* 112  204:iload_1         
	//* 113  205:istore          7
	//* 114  207:aload           10
	//* 115  209:astore          11
	//* 116  211:aload           12
	//* 117  213:iload           4
	//* 118  215:iaload          
	//* 119  216:ifeq            376
	//* 120  219:iload           4
	//* 121  221:bipush          92
	//* 122  223:icmpeq          462
	//* 123  226:aload_0         
	//* 124  227:iload           4
	//* 125  229:ldc2            #688 <String "name">
	//* 126  232:invokevirtual   #138 <Method void _throwUnquotedSpace(int, String)>
	//* 127  235:iload           4
	//* 128  237:istore          6
	//* 129  239:iload           6
	//* 130  241:istore          5
	//* 131  243:iload_3         
	//* 132  244:istore          8
	//* 133  246:iload_2         
	//* 134  247:istore          9
	//* 135  249:iload_1         
	//* 136  250:istore          7
	//* 137  252:aload           10
	//* 138  254:astore          11
	//* 139  256:iload           6
	//* 140  258:bipush          127
	//* 141  260:icmple          376
	//* 142  263:iload_3         
	//* 143  264:istore          7
	//* 144  266:iload_2         
	//* 145  267:istore          5
	//* 146  269:iload_1         
	//* 147  270:istore          4
	//* 148  272:aload           10
	//* 149  274:astore          11
	//* 150  276:iload_2         
	//* 151  277:iconst_4        
	//* 152  278:icmplt          324
	//* 153  281:aload           10
	//* 154  283:astore          11
	//* 155  285:iload_1         
	//* 156  286:aload           10
	//* 157  288:arraylength     
	//* 158  289:icmplt          308
	//* 159  292:aload           10
	//* 160  294:aload           10
	//* 161  296:arraylength     
	//* 162  297:invokestatic    #464 <Method int[] growArrayBy(int[], int)>
	//* 163  300:astore          11
	//* 164  302:aload_0         
	//* 165  303:aload           11
	//* 166  305:putfield        #50  <Field int[] _quadBuffer>
	//* 167  308:aload           11
	//* 168  310:iload_1         
	//* 169  311:iload_3         
	//* 170  312:iastore         
	//* 171  313:iconst_0        
	//* 172  314:istore          7
	//* 173  316:iconst_0        
	//* 174  317:istore          5
	//* 175  319:iload_1         
	//* 176  320:iconst_1        
	//* 177  321:iadd            
	//* 178  322:istore          4
	//* 179  324:iload           6
	//* 180  326:sipush          2048
	//* 181  329:icmpge          471
	//* 182  332:iload           7
	//* 183  334:bipush          8
	//* 184  336:ishl            
	//* 185  337:iload           6
	//* 186  339:bipush          6
	//* 187  341:ishr            
	//* 188  342:sipush          192
	//* 189  345:ior             
	//* 190  346:ior             
	//* 191  347:istore_1        
	//* 192  348:iload           5
	//* 193  350:iconst_1        
	//* 194  351:iadd            
	//* 195  352:istore_3        
	//* 196  353:iload           4
	//* 197  355:istore_2        
	//* 198  356:iload           6
	//* 199  358:bipush          63
	//* 200  360:iand            
	//* 201  361:sipush          128
	//* 202  364:ior             
	//* 203  365:istore          5
	//* 204  367:iload_2         
	//* 205  368:istore          7
	//* 206  370:iload_3         
	//* 207  371:istore          9
	//* 208  373:iload_1         
	//* 209  374:istore          8
	//* 210  376:iload           9
	//* 211  378:iconst_4        
	//* 212  379:icmpge          575
	//* 213  382:iload           9
	//* 214  384:iconst_1        
	//* 215  385:iadd            
	//* 216  386:istore_2        
	//* 217  387:iload           8
	//* 218  389:bipush          8
	//* 219  391:ishl            
	//* 220  392:iload           5
	//* 221  394:ior             
	//* 222  395:istore_3        
	//* 223  396:iload           7
	//* 224  398:istore_1        
	//* 225  399:aload           11
	//* 226  401:astore          10
	//* 227  403:aload_0         
	//* 228  404:getfield        #61  <Field int _inputPtr>
	//* 229  407:aload_0         
	//* 230  408:getfield        #64  <Field int _inputEnd>
	//* 231  411:icmplt          428
	//* 232  414:aload_0         
	//* 233  415:invokevirtual   #249 <Method boolean loadMore()>
	//* 234  418:ifne            428
	//* 235  421:aload_0         
	//* 236  422:ldc2            #429 <String " in field name">
	//* 237  425:invokevirtual   #309 <Method void _reportInvalidEOF(String)>
	//* 238  428:aload_0         
	//* 239  429:getfield        #58  <Field byte[] _inputBuffer>
	//* 240  432:astore          11
	//* 241  434:aload_0         
	//* 242  435:getfield        #61  <Field int _inputPtr>
	//* 243  438:istore          4
	//* 244  440:aload_0         
	//* 245  441:iload           4
	//* 246  443:iconst_1        
	//* 247  444:iadd            
	//* 248  445:putfield        #61  <Field int _inputPtr>
	//* 249  448:aload           11
	//* 250  450:iload           4
	//* 251  452:baload          
	//* 252  453:sipush          255
	//* 253  456:iand            
	//* 254  457:istore          4
	//* 255  459:goto            85
	//* 256  462:aload_0         
	//* 257  463:invokevirtual   #142 <Method char _decodeEscaped()>
	//* 258  466:istore          6
	//* 259  468:goto            239
	//* 260  471:iload           7
	//* 261  473:bipush          8
	//* 262  475:ishl            
	//* 263  476:iload           6
	//* 264  478:bipush          12
	//* 265  480:ishr            
	//* 266  481:sipush          224
	//* 267  484:ior             
	//* 268  485:ior             
	//* 269  486:istore_3        
	//* 270  487:iload           5
	//* 271  489:iconst_1        
	//* 272  490:iadd            
	//* 273  491:istore_1        
	//* 274  492:iload_1         
	//* 275  493:iconst_4        
	//* 276  494:icmplt          630
	//* 277  497:aload           11
	//* 278  499:astore          10
	//* 279  501:iload           4
	//* 280  503:aload           11
	//* 281  505:arraylength     
	//* 282  506:icmplt          525
	//* 283  509:aload           11
	//* 284  511:aload           11
	//* 285  513:arraylength     
	//* 286  514:invokestatic    #464 <Method int[] growArrayBy(int[], int)>
	//* 287  517:astore          10
	//* 288  519:aload_0         
	//* 289  520:aload           10
	//* 290  522:putfield        #50  <Field int[] _quadBuffer>
	//* 291  525:iload           4
	//* 292  527:iconst_1        
	//* 293  528:iadd            
	//* 294  529:istore_2        
	//* 295  530:aload           10
	//* 296  532:iload           4
	//* 297  534:iload_3         
	//* 298  535:iastore         
	//* 299  536:iconst_0        
	//* 300  537:istore_3        
	//* 301  538:iconst_0        
	//* 302  539:istore_1        
	//* 303  540:iload_3         
	//* 304  541:bipush          8
	//* 305  543:ishl            
	//* 306  544:iload           6
	//* 307  546:bipush          6
	//* 308  548:ishr            
	//* 309  549:bipush          63
	//* 310  551:iand            
	//* 311  552:sipush          128
	//* 312  555:ior             
	//* 313  556:ior             
	//* 314  557:istore_3        
	//* 315  558:iload_1         
	//* 316  559:iconst_1        
	//* 317  560:iadd            
	//* 318  561:istore          4
	//* 319  563:iload_3         
	//* 320  564:istore_1        
	//* 321  565:iload           4
	//* 322  567:istore_3        
	//* 323  568:aload           10
	//* 324  570:astore          11
	//* 325  572:goto            356
	//* 326  575:aload           11
	//* 327  577:astore          10
	//* 328  579:iload           7
	//* 329  581:aload           11
	//* 330  583:arraylength     
	//* 331  584:icmplt          603
	//* 332  587:aload           11
	//* 333  589:aload           11
	//* 334  591:arraylength     
	//* 335  592:invokestatic    #464 <Method int[] growArrayBy(int[], int)>
	//* 336  595:astore          10
	//* 337  597:aload_0         
	//* 338  598:aload           10
	//* 339  600:putfield        #50  <Field int[] _quadBuffer>
	//* 340  603:iload           7
	//* 341  605:iconst_1        
	//* 342  606:iadd            
	//* 343  607:istore_1        
	//* 344  608:aload           10
	//* 345  610:iload           7
	//* 346  612:iload           8
	//* 347  614:iastore         
	//* 348  615:iload           5
	//* 349  617:istore_3        
	//* 350  618:iconst_1        
	//* 351  619:istore_2        
	//* 352  620:goto            403
			{
				ai1 = ai;
	//  353  623:aload           10
	//  354  625:astore          11
			}
			obj = ((Object) (_symbols.findName(ai1, j)));
			ai = ((int []) (obj));
			if(obj == null)
				return addName(ai1, j, k);
		}
		if(true) goto _L4; else goto _L3
	//  355  627:goto            140
_L4:
		continue; /* Loop/switch isn't completed */
_L3:
		j1 = i1;
		i2 = l;
		j2 = k;
		l1 = j;
		ai1 = ai;
		if(i1 != 34)
		{
			j1 = i1;
			i2 = l;
			j2 = k;
			l1 = j;
			ai1 = ai;
			if(obj[i1] != 0)
			{
				if(i1 != 92)
				{
					_throwUnquotedSpace(i1, "name");
					k1 = i1;
				} else
				{
					k1 = ((int) (_decodeEscaped()));
				}
				j1 = k1;
				i2 = l;
				j2 = k;
				l1 = j;
				ai1 = ai;
				if(k1 > 127)
				{
					l1 = l;
					j1 = k;
					i1 = j;
					ai1 = ai;
					if(k >= 4)
					{
						ai1 = ai;
						if(j >= ai.length)
						{
							ai1 = growArrayBy(ai, ai.length);
							_quadBuffer = ai1;
						}
						ai1[j] = l;
						l1 = 0;
						j1 = 0;
						i1 = j + 1;
					}
					if(k1 < 2048)
					{
						j = l1 << 8 | (k1 >> 6 | 0xc0);
						l = j1 + 1;
						k = i1;
					} else
					{
						l = l1 << 8 | (k1 >> 12 | 0xe0);
						j = j1 + 1;
						if(j >= 4)
						{
							ai = ai1;
							if(i1 >= ai1.length)
							{
								ai = growArrayBy(ai1, ai1.length);
								_quadBuffer = ai;
							}
							k = i1 + 1;
							ai[i1] = l;
							l = 0;
							j = 0;
						} else
						{
							k = i1;
	//  356  630:iload           4
	//  357  632:istore_2        
							ai = ai1;
	//  358  633:aload           11
	//  359  635:astore          10
						}
						l = l << 8 | (k1 >> 6 & 0x3f | 0x80);
						i1 = j + 1;
						j = l;
						l = i1;
						ai1 = ai;
					}
					j1 = k1 & 0x3f | 0x80;
					l1 = k;
					j2 = l;
					i2 = j;
				}
			}
		}
		if(j2 < 4)
		{
			k = j2 + 1;
			l = i2 << 8 | j1;
			j = l1;
			ai = ai1;
		} else
		{
			ai = ai1;
			if(l1 >= ai1.length)
			{
				ai = growArrayBy(ai1, ai1.length);
				_quadBuffer = ai;
			}
			j = l1 + 1;
			ai[l1] = i2;
			l = j1;
			k = 1;
		}
		if(_inputPtr >= _inputEnd && !loadMore())
			_reportInvalidEOF(" in field name");
		ai1 = ((int []) (_inputBuffer));
		i1 = _inputPtr;
		_inputPtr = i1 + 1;
		i1 = ai1[i1] & 0xff;
		if(true) goto _L6; else goto _L5
	//  360  637:goto            540
_L5:
		if(true) goto _L8; else goto _L7
_L7:
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
	//    5    8:invokevirtual   #690 <Method String _handleOddName(int)>
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
	//   15   27:invokevirtual   #693 <Method String slowParseName()>
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
	//  132  199:putfield        #695 <Field int _quad1>
							return parseMediumName(j);
	//  133  202:aload_0         
	//  134  203:iload_2         
	//  135  204:invokevirtual   #698 <Method String parseMediumName(int)>
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
	//  143  217:invokespecial   #699 <Method String findName(int, int)>
	//  144  220:areturn         
						else
							return parseName(i, j, 4);
	//  145  221:aload_0         
	//  146  222:iload_1         
	//  147  223:iload_2         
	//  148  224:iconst_4        
	//  149  225:invokespecial   #701 <Method String parseName(int, int, int)>
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
	//  157  238:invokespecial   #699 <Method String findName(int, int)>
	//  158  241:areturn         
					else
						return parseName(i, j, 3);
	//  159  242:aload_0         
	//  160  243:iload_1         
	//  161  244:iload_2         
	//  162  245:iconst_3        
	//  163  246:invokespecial   #701 <Method String parseName(int, int, int)>
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
	//  171  259:invokespecial   #699 <Method String findName(int, int)>
	//  172  262:areturn         
				else
					return parseName(i, j, 2);
	//  173  263:aload_0         
	//  174  264:iload_1         
	//  175  265:iload_2         
	//  176  266:iconst_2        
	//  177  267:invokespecial   #701 <Method String parseName(int, int, int)>
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
	//  185  280:invokespecial   #699 <Method String findName(int, int)>
	//  186  283:areturn         
			else
				return parseName(i, j, 1);
	//  187  284:aload_0         
	//  188  285:iload_1         
	//  189  286:iload_2         
	//  190  287:iconst_1        
	//  191  288:invokespecial   #701 <Method String parseName(int, int, int)>
	//  192  291:areturn         
		}
		if(i == 34)
	//* 193  292:iload_1         
	//* 194  293:bipush          34
	//* 195  295:icmpne          302
			return "";
	//  196  298:ldc2            #637 <String "">
	//  197  301:areturn         
		else
			return parseName(0, i, 0);
	//  198  302:aload_0         
	//  199  303:iconst_0        
	//  200  304:iload_1         
	//  201  305:iconst_0        
	//  202  306:invokespecial   #701 <Method String parseName(int, int, int)>
	//  203  309:areturn         
	}

	protected JsonToken _parseNegNumber()
		throws IOException
	{
		char ac[] = _textBuffer.emptyAndGetCurrentSegment();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #427 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//    3    7:astore          7
		int k = 0 + 1;
	//    4    9:iconst_0        
	//    5   10:iconst_1        
	//    6   11:iadd            
	//    7   12:istore_3        
		ac[0] = '-';
	//    8   13:aload           7
	//    9   15:iconst_0        
	//   10   16:bipush          45
	//   11   18:castore         
		if(_inputPtr >= _inputEnd)
	//*  12   19:aload_0         
	//*  13   20:getfield        #61  <Field int _inputPtr>
	//*  14   23:aload_0         
	//*  15   24:getfield        #64  <Field int _inputEnd>
	//*  16   27:icmplt          34
			loadMoreGuaranteed();
	//   17   30:aload_0         
	//   18   31:invokevirtual   #102 <Method void loadMoreGuaranteed()>
		byte abyte0[] = _inputBuffer;
	//   19   34:aload_0         
	//   20   35:getfield        #58  <Field byte[] _inputBuffer>
	//   21   38:astore          8
		int i = _inputPtr;
	//   22   40:aload_0         
	//   23   41:getfield        #61  <Field int _inputPtr>
	//   24   44:istore_1        
		_inputPtr = i + 1;
	//   25   45:aload_0         
	//   26   46:iload_1         
	//   27   47:iconst_1        
	//   28   48:iadd            
	//   29   49:putfield        #61  <Field int _inputPtr>
		int j = abyte0[i] & 0xff;
	//   30   52:aload           8
	//   31   54:iload_1         
	//   32   55:baload          
	//   33   56:sipush          255
	//   34   59:iand            
	//   35   60:istore_2        
		if(j < 48 || j > 57)
	//*  36   61:iload_2         
	//*  37   62:bipush          48
	//*  38   64:icmplt          73
	//*  39   67:iload_2         
	//*  40   68:bipush          57
	//*  41   70:icmple          80
			return _handleInvalidNumberStart(j, true);
	//   42   73:aload_0         
	//   43   74:iload_2         
	//   44   75:iconst_1        
	//   45   76:invokevirtual   #660 <Method JsonToken _handleInvalidNumberStart(int, boolean)>
	//   46   79:areturn         
		i = j;
	//   47   80:iload_2         
	//   48   81:istore_1        
		if(j == 48)
	//*  49   82:iload_2         
	//*  50   83:bipush          48
	//*  51   85:icmpne          93
			i = _verifyNoLeadingZeroes();
	//   52   88:aload_0         
	//   53   89:invokespecial   #703 <Method int _verifyNoLeadingZeroes()>
	//   54   92:istore_1        
		int l = k + 1;
	//   55   93:iload_3         
	//   56   94:iconst_1        
	//   57   95:iadd            
	//   58   96:istore          4
		ac[k] = (char)i;
	//   59   98:aload           7
	//   60  100:iload_3         
	//   61  101:iload_1         
	//   62  102:int2char        
	//   63  103:castore         
		boolean flag = true;
	//   64  104:iconst_1        
	//   65  105:istore          5
		int i1 = (_inputPtr + ac.length) - 2;
	//   66  107:aload_0         
	//   67  108:getfield        #61  <Field int _inputPtr>
	//   68  111:aload           7
	//   69  113:arraylength     
	//   70  114:iadd            
	//   71  115:iconst_2        
	//   72  116:isub            
	//   73  117:istore          6
		j = l;
	//   74  119:iload           4
	//   75  121:istore_2        
		k = ((int) (flag));
	//   76  122:iload           5
	//   77  124:istore_3        
		i = i1;
	//   78  125:iload           6
	//   79  127:istore_1        
		if(i1 > _inputEnd)
	//*  80  128:iload           6
	//*  81  130:aload_0         
	//*  82  131:getfield        #64  <Field int _inputEnd>
	//*  83  134:icmple          148
		{
			i = _inputEnd;
	//   84  137:aload_0         
	//   85  138:getfield        #64  <Field int _inputEnd>
	//   86  141:istore_1        
			k = ((int) (flag));
	//   87  142:iload           5
	//   88  144:istore_3        
			j = l;
	//   89  145:iload           4
	//   90  147:istore_2        
		}
		do
		{
			if(_inputPtr >= i)
	//*  91  148:aload_0         
	//*  92  149:getfield        #61  <Field int _inputPtr>
	//*  93  152:iload_1         
	//*  94  153:icmplt          166
				return _parseNumber2(ac, j, true, k);
	//   95  156:aload_0         
	//   96  157:aload           7
	//   97  159:iload_2         
	//   98  160:iconst_1        
	//   99  161:iload_3         
	//  100  162:invokespecial   #705 <Method JsonToken _parseNumber2(char[], int, boolean, int)>
	//  101  165:areturn         
			byte abyte1[] = _inputBuffer;
	//  102  166:aload_0         
	//  103  167:getfield        #58  <Field byte[] _inputBuffer>
	//  104  170:astore          8
			l = _inputPtr;
	//  105  172:aload_0         
	//  106  173:getfield        #61  <Field int _inputPtr>
	//  107  176:istore          4
			_inputPtr = l + 1;
	//  108  178:aload_0         
	//  109  179:iload           4
	//  110  181:iconst_1        
	//  111  182:iadd            
	//  112  183:putfield        #61  <Field int _inputPtr>
			l = abyte1[l] & 0xff;
	//  113  186:aload           8
	//  114  188:iload           4
	//  115  190:baload          
	//  116  191:sipush          255
	//  117  194:iand            
	//  118  195:istore          4
			if(l < 48 || l > 57)
	//* 119  197:iload           4
	//* 120  199:bipush          48
	//* 121  201:icmplt          211
	//* 122  204:iload           4
	//* 123  206:bipush          57
	//* 124  208:icmple          244
			{
				if(l == 46 || l == 101 || l == 69)
	//* 125  211:iload           4
	//* 126  213:bipush          46
	//* 127  215:icmpeq          232
	//* 128  218:iload           4
	//* 129  220:bipush          101
	//* 130  222:icmpeq          232
	//* 131  225:iload           4
	//* 132  227:bipush          69
	//* 133  229:icmpne          262
					return _parseFloat(ac, j, l, true, k);
	//  134  232:aload_0         
	//  135  233:aload           7
	//  136  235:iload_2         
	//  137  236:iload           4
	//  138  238:iconst_1        
	//  139  239:iload_3         
	//  140  240:invokespecial   #300 <Method JsonToken _parseFloat(char[], int, int, boolean, int)>
	//  141  243:areturn         
				break;
			}
			k++;
	//  142  244:iload_3         
	//  143  245:iconst_1        
	//  144  246:iadd            
	//  145  247:istore_3        
			ac[j] = (char)l;
	//  146  248:aload           7
	//  147  250:iload_2         
	//  148  251:iload           4
	//  149  253:int2char        
	//  150  254:castore         
			j++;
	//  151  255:iload_2         
	//  152  256:iconst_1        
	//  153  257:iadd            
	//  154  258:istore_2        
		} while(true);
	//  155  259:goto            148
		_inputPtr = _inputPtr - 1;
	//  156  262:aload_0         
	//  157  263:aload_0         
	//  158  264:getfield        #61  <Field int _inputPtr>
	//  159  267:iconst_1        
	//  160  268:isub            
	//  161  269:putfield        #61  <Field int _inputPtr>
		_textBuffer.setCurrentLength(j);
	//  162  272:aload_0         
	//  163  273:getfield        #116 <Field TextBuffer _textBuffer>
	//  164  276:iload_2         
	//  165  277:invokevirtual   #132 <Method void TextBuffer.setCurrentLength(int)>
		if(_parsingContext.inRoot())
	//* 166  280:aload_0         
	//* 167  281:getfield        #165 <Field JsonReadContext _parsingContext>
	//* 168  284:invokevirtual   #285 <Method boolean JsonReadContext.inRoot()>
	//* 169  287:ifeq            296
			_verifyRootSpace(l);
	//  170  290:aload_0         
	//  171  291:iload           4
	//  172  293:invokespecial   #288 <Method void _verifyRootSpace(int)>
		return resetInt(true, k);
	//  173  296:aload_0         
	//  174  297:iconst_1        
	//  175  298:iload_3         
	//  176  299:invokevirtual   #298 <Method JsonToken resetInt(boolean, int)>
	//  177  302:areturn         
	}

	protected JsonToken _parsePosNumber(int i)
		throws IOException
	{
		char ac[] = _textBuffer.emptyAndGetCurrentSegment();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #427 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//    3    7:astore          7
		int j = i;
	//    4    9:iload_1         
	//    5   10:istore_2        
		if(i == 48)
	//*   6   11:iload_1         
	//*   7   12:bipush          48
	//*   8   14:icmpne          22
			j = _verifyNoLeadingZeroes();
	//    9   17:aload_0         
	//   10   18:invokespecial   #703 <Method int _verifyNoLeadingZeroes()>
	//   11   21:istore_2        
		ac[0] = (char)j;
	//   12   22:aload           7
	//   13   24:iconst_0        
	//   14   25:iload_2         
	//   15   26:int2char        
	//   16   27:castore         
		int l = 1;
	//   17   28:iconst_1        
	//   18   29:istore          4
		boolean flag = true;
	//   19   31:iconst_1        
	//   20   32:istore          5
		int i1 = (_inputPtr + ac.length) - 1;
	//   21   34:aload_0         
	//   22   35:getfield        #61  <Field int _inputPtr>
	//   23   38:aload           7
	//   24   40:arraylength     
	//   25   41:iadd            
	//   26   42:iconst_1        
	//   27   43:isub            
	//   28   44:istore          6
		j = ((int) (flag));
	//   29   46:iload           5
	//   30   48:istore_2        
		int k = l;
	//   31   49:iload           4
	//   32   51:istore_3        
		i = i1;
	//   33   52:iload           6
	//   34   54:istore_1        
		if(i1 > _inputEnd)
	//*  35   55:iload           6
	//*  36   57:aload_0         
	//*  37   58:getfield        #64  <Field int _inputEnd>
	//*  38   61:icmple          75
		{
			i = _inputEnd;
	//   39   64:aload_0         
	//   40   65:getfield        #64  <Field int _inputEnd>
	//   41   68:istore_1        
			k = l;
	//   42   69:iload           4
	//   43   71:istore_3        
			j = ((int) (flag));
	//   44   72:iload           5
	//   45   74:istore_2        
		}
		do
		{
			if(_inputPtr >= i)
	//*  46   75:aload_0         
	//*  47   76:getfield        #61  <Field int _inputPtr>
	//*  48   79:iload_1         
	//*  49   80:icmplt          93
				return _parseNumber2(ac, j, false, k);
	//   50   83:aload_0         
	//   51   84:aload           7
	//   52   86:iload_2         
	//   53   87:iconst_0        
	//   54   88:iload_3         
	//   55   89:invokespecial   #705 <Method JsonToken _parseNumber2(char[], int, boolean, int)>
	//   56   92:areturn         
			byte abyte0[] = _inputBuffer;
	//   57   93:aload_0         
	//   58   94:getfield        #58  <Field byte[] _inputBuffer>
	//   59   97:astore          8
			l = _inputPtr;
	//   60   99:aload_0         
	//   61  100:getfield        #61  <Field int _inputPtr>
	//   62  103:istore          4
			_inputPtr = l + 1;
	//   63  105:aload_0         
	//   64  106:iload           4
	//   65  108:iconst_1        
	//   66  109:iadd            
	//   67  110:putfield        #61  <Field int _inputPtr>
			l = abyte0[l] & 0xff;
	//   68  113:aload           8
	//   69  115:iload           4
	//   70  117:baload          
	//   71  118:sipush          255
	//   72  121:iand            
	//   73  122:istore          4
			if(l < 48 || l > 57)
	//*  74  124:iload           4
	//*  75  126:bipush          48
	//*  76  128:icmplt          138
	//*  77  131:iload           4
	//*  78  133:bipush          57
	//*  79  135:icmple          171
			{
				if(l == 46 || l == 101 || l == 69)
	//*  80  138:iload           4
	//*  81  140:bipush          46
	//*  82  142:icmpeq          159
	//*  83  145:iload           4
	//*  84  147:bipush          101
	//*  85  149:icmpeq          159
	//*  86  152:iload           4
	//*  87  154:bipush          69
	//*  88  156:icmpne          189
					return _parseFloat(ac, j, l, false, k);
	//   89  159:aload_0         
	//   90  160:aload           7
	//   91  162:iload_2         
	//   92  163:iload           4
	//   93  165:iconst_0        
	//   94  166:iload_3         
	//   95  167:invokespecial   #300 <Method JsonToken _parseFloat(char[], int, int, boolean, int)>
	//   96  170:areturn         
				break;
			}
			k++;
	//   97  171:iload_3         
	//   98  172:iconst_1        
	//   99  173:iadd            
	//  100  174:istore_3        
			ac[j] = (char)l;
	//  101  175:aload           7
	//  102  177:iload_2         
	//  103  178:iload           4
	//  104  180:int2char        
	//  105  181:castore         
			j++;
	//  106  182:iload_2         
	//  107  183:iconst_1        
	//  108  184:iadd            
	//  109  185:istore_2        
		} while(true);
	//  110  186:goto            75
		_inputPtr = _inputPtr - 1;
	//  111  189:aload_0         
	//  112  190:aload_0         
	//  113  191:getfield        #61  <Field int _inputPtr>
	//  114  194:iconst_1        
	//  115  195:isub            
	//  116  196:putfield        #61  <Field int _inputPtr>
		_textBuffer.setCurrentLength(j);
	//  117  199:aload_0         
	//  118  200:getfield        #116 <Field TextBuffer _textBuffer>
	//  119  203:iload_2         
	//  120  204:invokevirtual   #132 <Method void TextBuffer.setCurrentLength(int)>
		if(_parsingContext.inRoot())
	//* 121  207:aload_0         
	//* 122  208:getfield        #165 <Field JsonReadContext _parsingContext>
	//* 123  211:invokevirtual   #285 <Method boolean JsonReadContext.inRoot()>
	//* 124  214:ifeq            223
			_verifyRootSpace(l);
	//  125  217:aload_0         
	//  126  218:iload           4
	//  127  220:invokespecial   #288 <Method void _verifyRootSpace(int)>
		return resetInt(false, k);
	//  128  223:aload_0         
	//  129  224:iconst_0        
	//  130  225:iload_3         
	//  131  226:invokevirtual   #298 <Method JsonToken resetInt(boolean, int)>
	//  132  229:areturn         
	}

	protected int _readBinary(Base64Variant base64variant, OutputStream outputstream, byte abyte0[])
		throws IOException
	{
		int i;
		int l;
		int k1;
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		k1 = abyte0.length;
	//    2    3:aload_3         
	//    3    4:arraylength     
	//    4    5:istore          9
		l = 0;
	//    5    7:iconst_0        
	//    6    8:istore          6
_L8:
		int k;
		int i1;
		int j1;
		do
		{
			if(_inputPtr >= _inputEnd)
	//*   7   10:aload_0         
	//*   8   11:getfield        #61  <Field int _inputPtr>
	//*   9   14:aload_0         
	//*  10   15:getfield        #64  <Field int _inputEnd>
	//*  11   18:icmplt          25
				loadMoreGuaranteed();
	//   12   21:aload_0         
	//   13   22:invokevirtual   #102 <Method void loadMoreGuaranteed()>
			byte abyte1[] = _inputBuffer;
	//   14   25:aload_0         
	//   15   26:getfield        #58  <Field byte[] _inputBuffer>
	//   16   29:astore          12
			int j = _inputPtr;
	//   17   31:aload_0         
	//   18   32:getfield        #61  <Field int _inputPtr>
	//   19   35:istore          5
			_inputPtr = j + 1;
	//   20   37:aload_0         
	//   21   38:iload           5
	//   22   40:iconst_1        
	//   23   41:iadd            
	//   24   42:putfield        #61  <Field int _inputPtr>
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
	//   36   66:invokevirtual   #508 <Method int Base64Variant.decodeBase64Char(int)>
	//   37   69:istore          5
		j1 = k;
	//   38   71:iload           5
	//   39   73:istore          8
		if(k >= 0) goto _L2; else goto _L1
	//   40   75:iload           5
	//   41   77:ifge            138
_L1:
		if(i1 != 34) goto _L4; else goto _L3
	//   42   80:iload           7
	//   43   82:bipush          34
	//   44   84:icmpne          123
_L3:
		k = l;
	//   45   87:iload           6
	//   46   89:istore          5
_L6:
		_tokenIncomplete = false;
	//   47   91:aload_0         
	//   48   92:iconst_0        
	//   49   93:putfield        #198 <Field boolean _tokenIncomplete>
		l = k;
	//   50   96:iload           5
	//   51   98:istore          6
		if(i > 0)
	//*  52  100:iload           4
	//*  53  102:ifle            120
		{
			l = k + i;
	//   54  105:iload           5
	//   55  107:iload           4
	//   56  109:iadd            
	//   57  110:istore          6
			outputstream.write(abyte0, 0, i);
	//   58  112:aload_2         
	//   59  113:aload_3         
	//   60  114:iconst_0        
	//   61  115:iload           4
	//   62  117:invokevirtual   #713 <Method void OutputStream.write(byte[], int, int)>
		}
		return l;
	//   63  120:iload           6
	//   64  122:ireturn         
_L4:
		j1 = _decodeBase64Escape(base64variant, i1, 0);
	//   65  123:aload_0         
	//   66  124:aload_1         
	//   67  125:iload           7
	//   68  127:iconst_0        
	//   69  128:invokevirtual   #518 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//   70  131:istore          8
		if(j1 < 0)
			continue; /* Loop/switch isn't completed */
	//   71  133:iload           8
	//   72  135:iflt            10
_L2:
		int l1;
		int i2;
		k = l;
	//   73  138:iload           6
	//   74  140:istore          5
		i1 = i;
	//   75  142:iload           4
	//   76  144:istore          7
		if(i > k1 - 3)
	//*  77  146:iload           4
	//*  78  148:iload           9
	//*  79  150:iconst_3        
	//*  80  151:isub            
	//*  81  152:icmple          173
		{
			k = l + i;
	//   82  155:iload           6
	//   83  157:iload           4
	//   84  159:iadd            
	//   85  160:istore          5
			outputstream.write(abyte0, 0, i);
	//   86  162:aload_2         
	//   87  163:aload_3         
	//   88  164:iconst_0        
	//   89  165:iload           4
	//   90  167:invokevirtual   #713 <Method void OutputStream.write(byte[], int, int)>
			i1 = 0;
	//   91  170:iconst_0        
	//   92  171:istore          7
		}
		if(_inputPtr >= _inputEnd)
	//*  93  173:aload_0         
	//*  94  174:getfield        #61  <Field int _inputPtr>
	//*  95  177:aload_0         
	//*  96  178:getfield        #64  <Field int _inputEnd>
	//*  97  181:icmplt          188
			loadMoreGuaranteed();
	//   98  184:aload_0         
	//   99  185:invokevirtual   #102 <Method void loadMoreGuaranteed()>
		byte abyte2[] = _inputBuffer;
	//  100  188:aload_0         
	//  101  189:getfield        #58  <Field byte[] _inputBuffer>
	//  102  192:astore          12
		i = _inputPtr;
	//  103  194:aload_0         
	//  104  195:getfield        #61  <Field int _inputPtr>
	//  105  198:istore          4
		_inputPtr = i + 1;
	//  106  200:aload_0         
	//  107  201:iload           4
	//  108  203:iconst_1        
	//  109  204:iadd            
	//  110  205:putfield        #61  <Field int _inputPtr>
		l1 = abyte2[i] & 0xff;
	//  111  208:aload           12
	//  112  210:iload           4
	//  113  212:baload          
	//  114  213:sipush          255
	//  115  216:iand            
	//  116  217:istore          10
		l = base64variant.decodeBase64Char(l1);
	//  117  219:aload_1         
	//  118  220:iload           10
	//  119  222:invokevirtual   #508 <Method int Base64Variant.decodeBase64Char(int)>
	//  120  225:istore          6
		i = l;
	//  121  227:iload           6
	//  122  229:istore          4
		if(l < 0)
	//* 123  231:iload           6
	//* 124  233:ifge            246
			i = _decodeBase64Escape(base64variant, l1, 1);
	//  125  236:aload_0         
	//  126  237:aload_1         
	//  127  238:iload           10
	//  128  240:iconst_1        
	//  129  241:invokevirtual   #518 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//  130  244:istore          4
		l1 = j1 << 6 | i;
	//  131  246:iload           8
	//  132  248:bipush          6
	//  133  250:ishl            
	//  134  251:iload           4
	//  135  253:ior             
	//  136  254:istore          10
		if(_inputPtr >= _inputEnd)
	//* 137  256:aload_0         
	//* 138  257:getfield        #61  <Field int _inputPtr>
	//* 139  260:aload_0         
	//* 140  261:getfield        #64  <Field int _inputEnd>
	//* 141  264:icmplt          271
			loadMoreGuaranteed();
	//  142  267:aload_0         
	//  143  268:invokevirtual   #102 <Method void loadMoreGuaranteed()>
		abyte2 = _inputBuffer;
	//  144  271:aload_0         
	//  145  272:getfield        #58  <Field byte[] _inputBuffer>
	//  146  275:astore          12
		i = _inputPtr;
	//  147  277:aload_0         
	//  148  278:getfield        #61  <Field int _inputPtr>
	//  149  281:istore          4
		_inputPtr = i + 1;
	//  150  283:aload_0         
	//  151  284:iload           4
	//  152  286:iconst_1        
	//  153  287:iadd            
	//  154  288:putfield        #61  <Field int _inputPtr>
		i2 = abyte2[i] & 0xff;
	//  155  291:aload           12
	//  156  293:iload           4
	//  157  295:baload          
	//  158  296:sipush          255
	//  159  299:iand            
	//  160  300:istore          11
		l = base64variant.decodeBase64Char(i2);
	//  161  302:aload_1         
	//  162  303:iload           11
	//  163  305:invokevirtual   #508 <Method int Base64Variant.decodeBase64Char(int)>
	//  164  308:istore          6
		j1 = l;
	//  165  310:iload           6
	//  166  312:istore          8
		if(l < 0)
	//* 167  314:iload           6
	//* 168  316:ifge            498
		{
			i = l;
	//  169  319:iload           6
	//  170  321:istore          4
			if(l != -2)
	//* 171  323:iload           6
	//* 172  325:bipush          -2
	//* 173  327:icmpeq          372
			{
				if(i2 == 34 && !base64variant.usesPadding())
	//* 174  330:iload           11
	//* 175  332:bipush          34
	//* 176  334:icmpne          362
	//* 177  337:aload_1         
	//* 178  338:invokevirtual   #521 <Method boolean Base64Variant.usesPadding()>
	//* 179  341:ifne            362
				{
					abyte0[i1] = (byte)(l1 >> 4);
	//  180  344:aload_3         
	//  181  345:iload           7
	//  182  347:iload           10
	//  183  349:iconst_4        
	//  184  350:ishr            
	//  185  351:int2byte        
	//  186  352:bastore         
					i = i1 + 1;
	//  187  353:iload           7
	//  188  355:iconst_1        
	//  189  356:iadd            
	//  190  357:istore          4
					continue; /* Loop/switch isn't completed */
	//  191  359:goto            91
				}
				i = _decodeBase64Escape(base64variant, i2, 2);
	//  192  362:aload_0         
	//  193  363:aload_1         
	//  194  364:iload           11
	//  195  366:iconst_2        
	//  196  367:invokevirtual   #518 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//  197  370:istore          4
			}
			j1 = i;
	//  198  372:iload           4
	//  199  374:istore          8
			if(i == -2)
	//* 200  376:iload           4
	//* 201  378:bipush          -2
	//* 202  380:icmpne          498
			{
				if(_inputPtr >= _inputEnd)
	//* 203  383:aload_0         
	//* 204  384:getfield        #61  <Field int _inputPtr>
	//* 205  387:aload_0         
	//* 206  388:getfield        #64  <Field int _inputEnd>
	//* 207  391:icmplt          398
					loadMoreGuaranteed();
	//  208  394:aload_0         
	//  209  395:invokevirtual   #102 <Method void loadMoreGuaranteed()>
				abyte2 = _inputBuffer;
	//  210  398:aload_0         
	//  211  399:getfield        #58  <Field byte[] _inputBuffer>
	//  212  402:astore          12
				i = _inputPtr;
	//  213  404:aload_0         
	//  214  405:getfield        #61  <Field int _inputPtr>
	//  215  408:istore          4
				_inputPtr = i + 1;
	//  216  410:aload_0         
	//  217  411:iload           4
	//  218  413:iconst_1        
	//  219  414:iadd            
	//  220  415:putfield        #61  <Field int _inputPtr>
				i = abyte2[i] & 0xff;
	//  221  418:aload           12
	//  222  420:iload           4
	//  223  422:baload          
	//  224  423:sipush          255
	//  225  426:iand            
	//  226  427:istore          4
				if(!base64variant.usesPaddingChar(i))
	//* 227  429:aload_1         
	//* 228  430:iload           4
	//* 229  432:invokevirtual   #527 <Method boolean Base64Variant.usesPaddingChar(int)>
	//* 230  435:ifne            476
					throw reportInvalidBase64Char(base64variant, i, 3, (new StringBuilder()).append("expected padding character '").append(base64variant.getPaddingChar()).append("'").toString());
	//  231  438:aload_0         
	//  232  439:aload_1         
	//  233  440:iload           4
	//  234  442:iconst_3        
	//  235  443:new             #344 <Class StringBuilder>
	//  236  446:dup             
	//  237  447:invokespecial   #346 <Method void StringBuilder()>
	//  238  450:ldc2            #529 <String "expected padding character '">
	//  239  453:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//  240  456:aload_1         
	//  241  457:invokevirtual   #532 <Method char Base64Variant.getPaddingChar()>
	//  242  460:invokevirtual   #535 <Method StringBuilder StringBuilder.append(char)>
	//  243  463:ldc2            #537 <String "'">
	//  244  466:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//  245  469:invokevirtual   #360 <Method String StringBuilder.toString()>
	//  246  472:invokevirtual   #541 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int, String)>
	//  247  475:athrow          
				abyte0[i1] = (byte)(l1 >> 4);
	//  248  476:aload_3         
	//  249  477:iload           7
	//  250  479:iload           10
	//  251  481:iconst_4        
	//  252  482:ishr            
	//  253  483:int2byte        
	//  254  484:bastore         
				i = i1 + 1;
	//  255  485:iload           7
	//  256  487:iconst_1        
	//  257  488:iadd            
	//  258  489:istore          4
				l = k;
	//  259  491:iload           5
	//  260  493:istore          6
				continue; /* Loop/switch isn't completed */
	//  261  495:goto            10
			}
		}
		l1 = l1 << 6 | j1;
	//  262  498:iload           10
	//  263  500:bipush          6
	//  264  502:ishl            
	//  265  503:iload           8
	//  266  505:ior             
	//  267  506:istore          10
		if(_inputPtr >= _inputEnd)
	//* 268  508:aload_0         
	//* 269  509:getfield        #61  <Field int _inputPtr>
	//* 270  512:aload_0         
	//* 271  513:getfield        #64  <Field int _inputEnd>
	//* 272  516:icmplt          523
			loadMoreGuaranteed();
	//  273  519:aload_0         
	//  274  520:invokevirtual   #102 <Method void loadMoreGuaranteed()>
		abyte2 = _inputBuffer;
	//  275  523:aload_0         
	//  276  524:getfield        #58  <Field byte[] _inputBuffer>
	//  277  527:astore          12
		i = _inputPtr;
	//  278  529:aload_0         
	//  279  530:getfield        #61  <Field int _inputPtr>
	//  280  533:istore          4
		_inputPtr = i + 1;
	//  281  535:aload_0         
	//  282  536:iload           4
	//  283  538:iconst_1        
	//  284  539:iadd            
	//  285  540:putfield        #61  <Field int _inputPtr>
		i2 = abyte2[i] & 0xff;
	//  286  543:aload           12
	//  287  545:iload           4
	//  288  547:baload          
	//  289  548:sipush          255
	//  290  551:iand            
	//  291  552:istore          11
		l = base64variant.decodeBase64Char(i2);
	//  292  554:aload_1         
	//  293  555:iload           11
	//  294  557:invokevirtual   #508 <Method int Base64Variant.decodeBase64Char(int)>
	//  295  560:istore          6
		j1 = l;
	//  296  562:iload           6
	//  297  564:istore          8
		if(l >= 0)
			break MISSING_BLOCK_LABEL_697;
	//  298  566:iload           6
	//  299  568:ifge            697
		i = l;
	//  300  571:iload           6
	//  301  573:istore          4
		if(l == -2)
			break MISSING_BLOCK_LABEL_644;
	//  302  575:iload           6
	//  303  577:bipush          -2
	//  304  579:icmpeq          644
		if(i2 != 34 || base64variant.usesPadding())
			break; /* Loop/switch isn't completed */
	//  305  582:iload           11
	//  306  584:bipush          34
	//  307  586:icmpne          634
	//  308  589:aload_1         
	//  309  590:invokevirtual   #521 <Method boolean Base64Variant.usesPadding()>
	//  310  593:ifne            634
		l = l1 >> 2;
	//  311  596:iload           10
	//  312  598:iconst_2        
	//  313  599:ishr            
	//  314  600:istore          6
		j1 = i1 + 1;
	//  315  602:iload           7
	//  316  604:iconst_1        
	//  317  605:iadd            
	//  318  606:istore          8
		abyte0[i1] = (byte)(l >> 8);
	//  319  608:aload_3         
	//  320  609:iload           7
	//  321  611:iload           6
	//  322  613:bipush          8
	//  323  615:ishr            
	//  324  616:int2byte        
	//  325  617:bastore         
		i = j1 + 1;
	//  326  618:iload           8
	//  327  620:iconst_1        
	//  328  621:iadd            
	//  329  622:istore          4
		abyte0[j1] = (byte)l;
	//  330  624:aload_3         
	//  331  625:iload           8
	//  332  627:iload           6
	//  333  629:int2byte        
	//  334  630:bastore         
		if(true) goto _L6; else goto _L5
	//  335  631:goto            91
_L5:
		i = _decodeBase64Escape(base64variant, i2, 3);
	//  336  634:aload_0         
	//  337  635:aload_1         
	//  338  636:iload           11
	//  339  638:iconst_3        
	//  340  639:invokevirtual   #518 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//  341  642:istore          4
		j1 = i;
	//  342  644:iload           4
	//  343  646:istore          8
		if(i == -2)
	//* 344  648:iload           4
	//* 345  650:bipush          -2
	//* 346  652:icmpne          697
		{
			l = l1 >> 2;
	//  347  655:iload           10
	//  348  657:iconst_2        
	//  349  658:ishr            
	//  350  659:istore          6
			j1 = i1 + 1;
	//  351  661:iload           7
	//  352  663:iconst_1        
	//  353  664:iadd            
	//  354  665:istore          8
			abyte0[i1] = (byte)(l >> 8);
	//  355  667:aload_3         
	//  356  668:iload           7
	//  357  670:iload           6
	//  358  672:bipush          8
	//  359  674:ishr            
	//  360  675:int2byte        
	//  361  676:bastore         
			i = j1 + 1;
	//  362  677:iload           8
	//  363  679:iconst_1        
	//  364  680:iadd            
	//  365  681:istore          4
			abyte0[j1] = (byte)l;
	//  366  683:aload_3         
	//  367  684:iload           8
	//  368  686:iload           6
	//  369  688:int2byte        
	//  370  689:bastore         
			l = k;
	//  371  690:iload           5
	//  372  692:istore          6
			continue; /* Loop/switch isn't completed */
	//  373  694:goto            10
		}
		i = l1 << 6 | j1;
	//  374  697:iload           10
	//  375  699:bipush          6
	//  376  701:ishl            
	//  377  702:iload           8
	//  378  704:ior             
	//  379  705:istore          4
		l = i1 + 1;
	//  380  707:iload           7
	//  381  709:iconst_1        
	//  382  710:iadd            
	//  383  711:istore          6
		abyte0[i1] = (byte)(i >> 16);
	//  384  713:aload_3         
	//  385  714:iload           7
	//  386  716:iload           4
	//  387  718:bipush          16
	//  388  720:ishr            
	//  389  721:int2byte        
	//  390  722:bastore         
		i1 = l + 1;
	//  391  723:iload           6
	//  392  725:iconst_1        
	//  393  726:iadd            
	//  394  727:istore          7
		abyte0[l] = (byte)(i >> 8);
	//  395  729:aload_3         
	//  396  730:iload           6
	//  397  732:iload           4
	//  398  734:bipush          8
	//  399  736:ishr            
	//  400  737:int2byte        
	//  401  738:bastore         
		abyte0[i1] = (byte)i;
	//  402  739:aload_3         
	//  403  740:iload           7
	//  404  742:iload           4
	//  405  744:int2byte        
	//  406  745:bastore         
		i = i1 + 1;
	//  407  746:iload           7
	//  408  748:iconst_1        
	//  409  749:iadd            
	//  410  750:istore          4
		l = k;
	//  411  752:iload           5
	//  412  754:istore          6
		if(true) goto _L8; else goto _L7
	//  413  756:goto            10
_L7:
	}

	protected void _releaseBuffers()
		throws IOException
	{
		super._releaseBuffers();
	//    0    0:aload_0         
	//    1    1:invokespecial   #716 <Method void ParserBase._releaseBuffers()>
		_symbols.release();
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field ByteQuadsCanonicalizer _symbols>
	//    4    8:invokevirtual   #719 <Method void ByteQuadsCanonicalizer.release()>
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
	//   14   28:getstatic       #722 <Field byte[] ByteArrayBuilder.NO_BYTES>
	//   15   31:putfield        #58  <Field byte[] _inputBuffer>
				_ioContext.releaseReadIOBuffer(abyte0);
	//   16   34:aload_0         
	//   17   35:getfield        #484 <Field IOContext _ioContext>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #726 <Method void IOContext.releaseReadIOBuffer(byte[])>
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
	//    5    8:invokevirtual   #337 <Method void _throwInvalidSpace(int)>
		_reportInvalidInitial(i);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:invokevirtual   #437 <Method void _reportInvalidInitial(int)>
	//    9   16:return          
	}

	protected void _reportInvalidInitial(int i)
		throws JsonParseException
	{
		_reportError((new StringBuilder()).append("Invalid UTF-8 start byte 0x").append(Integer.toHexString(i)).toString());
	//    0    0:aload_0         
	//    1    1:new             #344 <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #346 <Method void StringBuilder()>
	//    4    8:ldc2            #728 <String "Invalid UTF-8 start byte 0x">
	//    5   11:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:iload_1         
	//    7   15:invokestatic    #733 <Method String Integer.toHexString(int)>
	//    8   18:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:invokevirtual   #360 <Method String StringBuilder.toString()>
	//   10   24:invokevirtual   #613 <Method void _reportError(String)>
	//   11   27:return          
	}

	protected void _reportInvalidOther(int i)
		throws JsonParseException
	{
		_reportError((new StringBuilder()).append("Invalid UTF-8 middle byte 0x").append(Integer.toHexString(i)).toString());
	//    0    0:aload_0         
	//    1    1:new             #344 <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #346 <Method void StringBuilder()>
	//    4    8:ldc2            #735 <String "Invalid UTF-8 middle byte 0x">
	//    5   11:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:iload_1         
	//    7   15:invokestatic    #733 <Method String Integer.toHexString(int)>
	//    8   18:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:invokevirtual   #360 <Method String StringBuilder.toString()>
	//   10   24:invokevirtual   #613 <Method void _reportError(String)>
	//   11   27:return          
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
	//    5    7:invokevirtual   #431 <Method void _reportInvalidOther(int)>
	//    6   10:return          
	}

	protected void _reportInvalidToken(String s)
		throws IOException
	{
		_reportInvalidToken(s, "'null', 'true', 'false' or NaN");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #737 <String "'null', 'true', 'false' or NaN">
	//    3    5:invokevirtual   #642 <Method void _reportInvalidToken(String, String)>
	//    4    8:return          
	}

	protected void _reportInvalidToken(String s, String s1)
		throws IOException
	{
		s = ((String) (new StringBuilder(s)));
	//    0    0:new             #344 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #738 <Method void StringBuilder(String)>
	//    4    8:astore_1        
_L5:
		if(_inputPtr < _inputEnd || loadMore()) goto _L2; else goto _L1
	//    5    9:aload_0         
	//    6   10:getfield        #61  <Field int _inputPtr>
	//    7   13:aload_0         
	//    8   14:getfield        #64  <Field int _inputEnd>
	//    9   17:icmplt          65
	//   10   20:aload_0         
	//   11   21:invokevirtual   #249 <Method boolean loadMore()>
	//   12   24:ifne            65
_L1:
		_reportError((new StringBuilder()).append("Unrecognized token '").append(((StringBuilder) (s)).toString()).append("': was expecting ").append(s1).toString());
	//   13   27:aload_0         
	//   14   28:new             #344 <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #346 <Method void StringBuilder()>
	//   17   35:ldc2            #740 <String "Unrecognized token '">
	//   18   38:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:aload_1         
	//   20   42:invokevirtual   #360 <Method String StringBuilder.toString()>
	//   21   45:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:ldc2            #742 <String "': was expecting ">
	//   23   51:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   24   54:aload_2         
	//   25   55:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   26   58:invokevirtual   #360 <Method String StringBuilder.toString()>
	//   27   61:invokevirtual   #613 <Method void _reportError(String)>
		return;
	//   28   64:return          
_L2:
		char c;
		byte abyte0[] = _inputBuffer;
	//   29   65:aload_0         
	//   30   66:getfield        #58  <Field byte[] _inputBuffer>
	//   31   69:astore          5
		int i = _inputPtr;
	//   32   71:aload_0         
	//   33   72:getfield        #61  <Field int _inputPtr>
	//   34   75:istore          4
		_inputPtr = i + 1;
	//   35   77:aload_0         
	//   36   78:iload           4
	//   37   80:iconst_1        
	//   38   81:iadd            
	//   39   82:putfield        #61  <Field int _inputPtr>
		c = (char)_decodeCharForError(((int) (abyte0[i])));
	//   40   85:aload_0         
	//   41   86:aload           5
	//   42   88:iload           4
	//   43   90:baload          
	//   44   91:invokevirtual   #81  <Method int _decodeCharForError(int)>
	//   45   94:int2char        
	//   46   95:istore_3        
		if(!Character.isJavaIdentifierPart(c)) goto _L1; else goto _L3
	//   47   96:iload_3         
	//   48   97:invokestatic    #87  <Method boolean Character.isJavaIdentifierPart(char)>
	//   49  100:ifeq            27
_L3:
		((StringBuilder) (s)).append(c);
	//   50  103:aload_1         
	//   51  104:iload_3         
	//   52  105:invokevirtual   #535 <Method StringBuilder StringBuilder.append(char)>
	//   53  108:pop             
		if(true) goto _L5; else goto _L4
	//   54  109:goto            9
_L4:
	}

	protected final void _skipCR()
		throws IOException
	{
		if((_inputPtr < _inputEnd || loadMore()) && _inputBuffer[_inputPtr] == 10)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          18
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #249 <Method boolean loadMore()>
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
	//   23   44:getfield        #312 <Field int _currInputRow>
	//   24   47:iconst_1        
	//   25   48:iadd            
	//   26   49:putfield        #312 <Field int _currInputRow>
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
		do
		{
			int i1;
label0:
			do
			{
				int k = _inputPtr;
	//    8   16:aload_0         
	//    9   17:getfield        #61  <Field int _inputPtr>
	//   10   20:istore_3        
				i1 = _inputEnd;
	//   11   21:aload_0         
	//   12   22:getfield        #64  <Field int _inputEnd>
	//   13   25:istore          4
				int j = i1;
	//   14   27:iload           4
	//   15   29:istore_2        
				int i = k;
	//   16   30:iload_3         
	//   17   31:istore_1        
				if(k >= i1)
	//*  18   32:iload_3         
	//*  19   33:iload           4
	//*  20   35:icmplt          198
				{
					loadMoreGuaranteed();
	//   21   38:aload_0         
	//   22   39:invokevirtual   #102 <Method void loadMoreGuaranteed()>
					i = _inputPtr;
	//   23   42:aload_0         
	//   24   43:getfield        #61  <Field int _inputPtr>
	//   25   46:istore_1        
					j = _inputEnd;
	//   26   47:aload_0         
	//   27   48:getfield        #64  <Field int _inputEnd>
	//   28   51:istore_2        
				}
				while(i < j) 
	//*  29   52:iload_1         
	//*  30   53:iload_2         
	//*  31   54:icmpge          94
				{
					int l = i + 1;
	//   32   57:iload_1         
	//   33   58:iconst_1        
	//   34   59:iadd            
	//   35   60:istore_3        
					i1 = abyte0[i] & 0xff;
	//   36   61:aload           6
	//   37   63:iload_1         
	//   38   64:baload          
	//   39   65:sipush          255
	//   40   68:iand            
	//   41   69:istore          4
					i = l;
	//   42   71:iload_3         
	//   43   72:istore_1        
					if(ai[i1] != 0)
	//*  44   73:aload           5
	//*  45   75:iload           4
	//*  46   77:iaload          
	//*  47   78:ifeq            198
					{
						_inputPtr = l;
	//   48   81:aload_0         
	//   49   82:iload_3         
	//   50   83:putfield        #61  <Field int _inputPtr>
						if(i1 == 34)
	//*  51   86:iload           4
	//*  52   88:bipush          34
	//*  53   90:icmpne          102
							return;
	//   54   93:return          
						break label0;
					}
				}
				_inputPtr = i;
	//   55   94:aload_0         
	//   56   95:iload_1         
	//   57   96:putfield        #61  <Field int _inputPtr>
			} while(true);
	//   58   99:goto            16
			switch(ai[i1])
	//*  59  102:aload           5
	//*  60  104:iload           4
	//*  61  106:iaload          
			{
	//*  62  107:tableswitch     1 4: default 136
	//	               1 154
	//	               2 162
	//	               3 171
	//	               4 180
			default:
				if(i1 < 32)
	//*  63  136:iload           4
	//*  64  138:bipush          32
	//*  65  140:icmpge          189
					_throwUnquotedSpace(i1, "string value");
	//   66  143:aload_0         
	//   67  144:iload           4
	//   68  146:ldc1            #134 <String "string value">
	//   69  148:invokevirtual   #138 <Method void _throwUnquotedSpace(int, String)>
				else
	//*  70  151:goto            16
	//*  71  154:aload_0         
	//*  72  155:invokevirtual   #142 <Method char _decodeEscaped()>
	//*  73  158:pop             
	//*  74  159:goto            16
	//*  75  162:aload_0         
	//*  76  163:iload           4
	//*  77  165:invokespecial   #318 <Method void _skipUtf8_2(int)>
	//*  78  168:goto            16
	//*  79  171:aload_0         
	//*  80  172:iload           4
	//*  81  174:invokespecial   #321 <Method void _skipUtf8_3(int)>
	//*  82  177:goto            16
	//*  83  180:aload_0         
	//*  84  181:iload           4
	//*  85  183:invokespecial   #324 <Method void _skipUtf8_4(int)>
	//*  86  186:goto            16
					_reportInvalidChar(i1);
	//   87  189:aload_0         
	//   88  190:iload           4
	//   89  192:invokevirtual   #155 <Method void _reportInvalidChar(int)>
				break;

			case 1: // '\001'
				_decodeEscaped();
				break;

			case 2: // '\002'
				_skipUtf8_2(i1);
				break;

			case 3: // '\003'
				_skipUtf8_3(i1);
				break;

			case 4: // '\004'
				_skipUtf8_4(i1);
				break;
			}
		} while(true);
	//*  90  195:goto            16
	//*  91  198:goto            52
	}

	public byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException
	{
		if(_currToken != JsonToken.VALUE_STRING && (_currToken != JsonToken.VALUE_EMBEDDED_OBJECT || _binaryValue == null))
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field JsonToken _currToken>
	//*   2    4:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpeq       60
	//*   4   10:aload_0         
	//*   5   11:getfield        #189 <Field JsonToken _currToken>
	//*   6   14:getstatic       #749 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//*   7   17:if_acmpne       27
	//*   8   20:aload_0         
	//*   9   21:getfield        #752 <Field byte[] _binaryValue>
	//*  10   24:ifnonnull       60
			_reportError((new StringBuilder()).append("Current token (").append(((Object) (_currToken))).append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary").toString());
	//   11   27:aload_0         
	//   12   28:new             #344 <Class StringBuilder>
	//   13   31:dup             
	//   14   32:invokespecial   #346 <Method void StringBuilder()>
	//   15   35:ldc2            #754 <String "Current token (">
	//   16   38:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   17   41:aload_0         
	//   18   42:getfield        #189 <Field JsonToken _currToken>
	//   19   45:invokevirtual   #757 <Method StringBuilder StringBuilder.append(Object)>
	//   20   48:ldc2            #759 <String ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary">
	//   21   51:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   22   54:invokevirtual   #360 <Method String StringBuilder.toString()>
	//   23   57:invokevirtual   #613 <Method void _reportError(String)>
		if(!_tokenIncomplete) goto _L2; else goto _L1
	//   24   60:aload_0         
	//   25   61:getfield        #198 <Field boolean _tokenIncomplete>
	//   26   64:ifeq            125
_L1:
		try
		{
			_binaryValue = _decodeBase64(base64variant);
	//   27   67:aload_0         
	//   28   68:aload_0         
	//   29   69:aload_1         
	//   30   70:invokevirtual   #761 <Method byte[] _decodeBase64(Base64Variant)>
	//   31   73:putfield        #752 <Field byte[] _binaryValue>
		}
	//*  32   76:aload_0         
	//*  33   77:iconst_0        
	//*  34   78:putfield        #198 <Field boolean _tokenIncomplete>
	//*  35   81:aload_0         
	//*  36   82:getfield        #752 <Field byte[] _binaryValue>
	//*  37   85:areturn         
		catch(IllegalArgumentException illegalargumentexception)
	//*  38   86:astore_2        
		{
			throw _constructError((new StringBuilder()).append("Failed to decode VALUE_STRING as base64 (").append(((Object) (base64variant))).append("): ").append(illegalargumentexception.getMessage()).toString());
	//   39   87:aload_0         
	//   40   88:new             #344 <Class StringBuilder>
	//   41   91:dup             
	//   42   92:invokespecial   #346 <Method void StringBuilder()>
	//   43   95:ldc2            #763 <String "Failed to decode VALUE_STRING as base64 (">
	//   44   98:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   45  101:aload_1         
	//   46  102:invokevirtual   #757 <Method StringBuilder StringBuilder.append(Object)>
	//   47  105:ldc2            #765 <String "): ">
	//   48  108:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   49  111:aload_2         
	//   50  112:invokevirtual   #768 <Method String IllegalArgumentException.getMessage()>
	//   51  115:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   52  118:invokevirtual   #360 <Method String StringBuilder.toString()>
	//   53  121:invokevirtual   #364 <Method JsonParseException _constructError(String)>
	//   54  124:athrow          
		}
		_tokenIncomplete = false;
_L4:
		return _binaryValue;
_L2:
		if(_binaryValue == null)
	//*  55  125:aload_0         
	//*  56  126:getfield        #752 <Field byte[] _binaryValue>
	//*  57  129:ifnonnull       81
		{
			ByteArrayBuilder bytearraybuilder = _getByteArrayBuilder();
	//   58  132:aload_0         
	//   59  133:invokevirtual   #503 <Method ByteArrayBuilder _getByteArrayBuilder()>
	//   60  136:astore_2        
			_decodeBase64(getText(), bytearraybuilder, base64variant);
	//   61  137:aload_0         
	//   62  138:aload_0         
	//   63  139:invokevirtual   #771 <Method String getText()>
	//   64  142:aload_2         
	//   65  143:aload_1         
	//   66  144:invokevirtual   #774 <Method void _decodeBase64(String, ByteArrayBuilder, Base64Variant)>
			_binaryValue = bytearraybuilder.toByteArray();
	//   67  147:aload_0         
	//   68  148:aload_2         
	//   69  149:invokevirtual   #514 <Method byte[] ByteArrayBuilder.toByteArray()>
	//   70  152:putfield        #752 <Field byte[] _binaryValue>
		}
		if(true) goto _L4; else goto _L3
	//   71  155:goto            81
_L3:
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
	//    6   10:new             #780 <Class JsonLocation>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #484 <Field IOContext _ioContext>
	//   10   18:invokevirtual   #784 <Method Object IOContext.getSourceReference()>
	//   11   21:aload_0         
	//   12   22:getfield        #71  <Field long _currInputProcessed>
	//   13   25:aload_0         
	//   14   26:getfield        #61  <Field int _inputPtr>
	//   15   29:i2l             
	//   16   30:ladd            
	//   17   31:ldc2w           #785 <Long -1L>
	//   18   34:aload_0         
	//   19   35:getfield        #312 <Field int _currInputRow>
	//   20   38:iload_1         
	//   21   39:iload_2         
	//   22   40:isub            
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:invokespecial   #789 <Method void JsonLocation(Object, long, long, int, int)>
	//   26   46:areturn         
	}

	public Object getInputSource()
	{
		return ((Object) (_inputStream));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field InputStream _inputStream>
	//    2    4:areturn         
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
	//   11   23:invokevirtual   #792 <Method String _finishAndReturnString()>
	//   12   26:areturn         
			} else
			{
				return _textBuffer.contentsAsString();
	//   13   27:aload_0         
	//   14   28:getfield        #116 <Field TextBuffer _textBuffer>
	//   15   31:invokevirtual   #569 <Method String TextBuffer.contentsAsString()>
	//   16   34:areturn         
			}
		} else
		{
			return _getText2(_currToken);
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #189 <Field JsonToken _currToken>
	//   20   40:invokevirtual   #794 <Method String _getText2(JsonToken)>
	//   21   43:areturn         
		}
	}

	public char[] getTextCharacters()
		throws IOException
	{
		if(_currToken == null)
			break MISSING_BLOCK_LABEL_155;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field JsonToken _currToken>
	//    2    4:ifnull          155
		_currToken.id();
	//    3    7:aload_0         
	//    4    8:getfield        #189 <Field JsonToken _currToken>
	//    5   11:invokevirtual   #575 <Method int JsonToken.id()>
		JVM INSTR tableswitch 5 8: default 44
	//	               5 52
	//	               6 131
	//	               7 147
	//	               8 147;
	//    6   14:tableswitch     5 8: default 44
	//	               5 52
	//	               6 131
	//	               7 147
	//	               8 147
		   goto _L1 _L2 _L3 _L4 _L4
_L4:
		break; /* Loop/switch isn't completed */
_L1:
		return _currToken.asCharArray();
	//    7   44:aload_0         
	//    8   45:getfield        #189 <Field JsonToken _currToken>
	//    9   48:invokevirtual   #798 <Method char[] JsonToken.asCharArray()>
	//   10   51:areturn         
_L2:
		if(_nameCopied) goto _L6; else goto _L5
	//   11   52:aload_0         
	//   12   53:getfield        #259 <Field boolean _nameCopied>
	//   13   56:ifne            107
_L5:
		int i;
		String s;
		s = _parsingContext.getCurrentName();
	//   14   59:aload_0         
	//   15   60:getfield        #165 <Field JsonReadContext _parsingContext>
	//   16   63:invokevirtual   #581 <Method String JsonReadContext.getCurrentName()>
	//   17   66:astore_2        
		i = s.length();
	//   18   67:aload_2         
	//   19   68:invokevirtual   #245 <Method int String.length()>
	//   20   71:istore_1        
		if(_nameCopyBuffer != null) goto _L8; else goto _L7
	//   21   72:aload_0         
	//   22   73:getfield        #802 <Field char[] _nameCopyBuffer>
	//   23   76:ifnonnull       112
_L7:
		_nameCopyBuffer = _ioContext.allocNameCopyBuffer(i);
	//   24   79:aload_0         
	//   25   80:aload_0         
	//   26   81:getfield        #484 <Field IOContext _ioContext>
	//   27   84:iload_1         
	//   28   85:invokevirtual   #806 <Method char[] IOContext.allocNameCopyBuffer(int)>
	//   29   88:putfield        #802 <Field char[] _nameCopyBuffer>
_L10:
		s.getChars(0, i, _nameCopyBuffer, 0);
	//   30   91:aload_2         
	//   31   92:iconst_0        
	//   32   93:iload_1         
	//   33   94:aload_0         
	//   34   95:getfield        #802 <Field char[] _nameCopyBuffer>
	//   35   98:iconst_0        
	//   36   99:invokevirtual   #810 <Method void String.getChars(int, int, char[], int)>
		_nameCopied = true;
	//   37  102:aload_0         
	//   38  103:iconst_1        
	//   39  104:putfield        #259 <Field boolean _nameCopied>
_L6:
		return _nameCopyBuffer;
	//   40  107:aload_0         
	//   41  108:getfield        #802 <Field char[] _nameCopyBuffer>
	//   42  111:areturn         
_L8:
		if(_nameCopyBuffer.length < i)
	//*  43  112:aload_0         
	//*  44  113:getfield        #802 <Field char[] _nameCopyBuffer>
	//*  45  116:arraylength     
	//*  46  117:iload_1         
	//*  47  118:icmpge          91
			_nameCopyBuffer = new char[i];
	//   48  121:aload_0         
	//   49  122:iload_1         
	//   50  123:newarray        char[]
	//   51  125:putfield        #802 <Field char[] _nameCopyBuffer>
		if(true) goto _L10; else goto _L9
	//   52  128:goto            91
_L9:
		break; /* Loop/switch isn't completed */
_L3:
		if(_tokenIncomplete)
	//*  53  131:aload_0         
	//*  54  132:getfield        #198 <Field boolean _tokenIncomplete>
	//*  55  135:ifeq            147
		{
			_tokenIncomplete = false;
	//   56  138:aload_0         
	//   57  139:iconst_0        
	//   58  140:putfield        #198 <Field boolean _tokenIncomplete>
			_finishString();
	//   59  143:aload_0         
	//   60  144:invokevirtual   #812 <Method void _finishString()>
		}
		return _textBuffer.getTextBuffer();
	//   61  147:aload_0         
	//   62  148:getfield        #116 <Field TextBuffer _textBuffer>
	//   63  151:invokevirtual   #815 <Method char[] TextBuffer.getTextBuffer()>
	//   64  154:areturn         
		return null;
	//   65  155:aconst_null     
	//   66  156:areturn         
	}

	public int getTextLength()
		throws IOException
	{
label0:
		{
label1:
			{
label2:
				{
					int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
					if(_currToken != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #189 <Field JsonToken _currToken>
	//*   4    6:ifnull          57
						switch(_currToken.id())
	//*   5    9:aload_0         
	//*   6   10:getfield        #189 <Field JsonToken _currToken>
	//*   7   13:invokevirtual   #575 <Method int JsonToken.id()>
						{
	//*   8   16:tableswitch     5 8: default 48
	//	               5 59
	//	               6 70
	//	               7 86
	//	               8 86
						default:
							i = _currToken.asCharArray().length;
	//    9   48:aload_0         
	//   10   49:getfield        #189 <Field JsonToken _currToken>
	//   11   52:invokevirtual   #798 <Method char[] JsonToken.asCharArray()>
	//   12   55:arraylength     
	//   13   56:istore_1        
							break;

						case 5: // '\005'
							break label2;

						case 6: // '\006'
							break label1;

						case 7: // '\007'
						case 8: // '\b'
							break label0;
						}
					return i;
	//   14   57:iload_1         
	//   15   58:ireturn         
				}
				return _parsingContext.getCurrentName().length();
	//   16   59:aload_0         
	//   17   60:getfield        #165 <Field JsonReadContext _parsingContext>
	//   18   63:invokevirtual   #581 <Method String JsonReadContext.getCurrentName()>
	//   19   66:invokevirtual   #245 <Method int String.length()>
	//   20   69:ireturn         
			}
			if(_tokenIncomplete)
	//*  21   70:aload_0         
	//*  22   71:getfield        #198 <Field boolean _tokenIncomplete>
	//*  23   74:ifeq            86
			{
				_tokenIncomplete = false;
	//   24   77:aload_0         
	//   25   78:iconst_0        
	//   26   79:putfield        #198 <Field boolean _tokenIncomplete>
				_finishString();
	//   27   82:aload_0         
	//   28   83:invokevirtual   #812 <Method void _finishString()>
			}
		}
		return _textBuffer.size();
	//   29   86:aload_0         
	//   30   87:getfield        #116 <Field TextBuffer _textBuffer>
	//   31   90:invokevirtual   #819 <Method int TextBuffer.size()>
	//   32   93:ireturn         
	}

	public int getTextOffset()
		throws IOException
	{
		if(_currToken == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field JsonToken _currToken>
	//    2    4:ifnull          44
_L1:
		_currToken.id();
	//    3    7:aload_0         
	//    4    8:getfield        #189 <Field JsonToken _currToken>
	//    5   11:invokevirtual   #575 <Method int JsonToken.id()>
		JVM INSTR tableswitch 5 8: default 44
	//	               5 44
	//	               6 46
	//	               7 62
	//	               8 62;
	//    6   14:tableswitch     5 8: default 44
	//	               5 44
	//	               6 46
	//	               7 62
	//	               8 62
		   goto _L2 _L2 _L3 _L4 _L4
_L2:
		return 0;
	//    7   44:iconst_0        
	//    8   45:ireturn         
_L3:
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
	//   16   59:invokevirtual   #812 <Method void _finishString()>
		}
_L4:
		return _textBuffer.getTextOffset();
	//   17   62:aload_0         
	//   18   63:getfield        #116 <Field TextBuffer _textBuffer>
	//   19   66:invokevirtual   #822 <Method int TextBuffer.getTextOffset()>
	//   20   69:ireturn         
	}

	public JsonLocation getTokenLocation()
	{
		Object obj = _ioContext.getSourceReference();
	//    0    0:aload_0         
	//    1    1:getfield        #484 <Field IOContext _ioContext>
	//    2    4:invokevirtual   #784 <Method Object IOContext.getSourceReference()>
	//    3    7:astore_1        
		if(_currToken == JsonToken.FIELD_NAME)
	//*   4    8:aload_0         
	//*   5    9:getfield        #189 <Field JsonToken _currToken>
	//*   6   12:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//*   7   15:if_acmpne       50
			return new JsonLocation(obj, _currInputProcessed + (long)(_nameStartOffset - 1), -1L, _nameStartRow, _nameStartCol);
	//    8   18:new             #780 <Class JsonLocation>
	//    9   21:dup             
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #71  <Field long _currInputProcessed>
	//   13   27:aload_0         
	//   14   28:getfield        #406 <Field int _nameStartOffset>
	//   15   31:iconst_1        
	//   16   32:isub            
	//   17   33:i2l             
	//   18   34:ladd            
	//   19   35:ldc2w           #785 <Long -1L>
	//   20   38:aload_0         
	//   21   39:getfield        #404 <Field int _nameStartRow>
	//   22   42:aload_0         
	//   23   43:getfield        #408 <Field int _nameStartCol>
	//   24   46:invokespecial   #789 <Method void JsonLocation(Object, long, long, int, int)>
	//   25   49:areturn         
		else
			return new JsonLocation(obj, _tokenInputTotal - 1L, -1L, _tokenInputRow, _tokenInputCol);
	//   26   50:new             #780 <Class JsonLocation>
	//   27   53:dup             
	//   28   54:aload_1         
	//   29   55:aload_0         
	//   30   56:getfield        #401 <Field long _tokenInputTotal>
	//   31   59:lconst_1        
	//   32   60:lsub            
	//   33   61:ldc2w           #785 <Long -1L>
	//   34   64:aload_0         
	//   35   65:getfield        #262 <Field int _tokenInputRow>
	//   36   68:aload_0         
	//   37   69:getfield        #265 <Field int _tokenInputCol>
	//   38   72:invokespecial   #789 <Method void JsonLocation(Object, long, long, int, int)>
	//   39   75:areturn         
	}

	public int getValueAsInt()
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field JsonToken _currToken>
	//    2    4:astore_1        
		if(jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #827 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5    9:if_acmpeq       19
	//*   6   12:aload_1         
	//*   7   13:getstatic       #830 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   16:if_acmpne       58
		{
			if((_numTypesValid & 1) == 0)
	//*   9   19:aload_0         
	//*  10   20:getfield        #833 <Field int _numTypesValid>
	//*  11   23:iconst_1        
	//*  12   24:iand            
	//*  13   25:ifne            53
			{
				if(_numTypesValid == 0)
	//*  14   28:aload_0         
	//*  15   29:getfield        #833 <Field int _numTypesValid>
	//*  16   32:ifne            40
					return _parseIntValue();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #836 <Method int _parseIntValue()>
	//   19   39:ireturn         
				if((_numTypesValid & 1) == 0)
	//*  20   40:aload_0         
	//*  21   41:getfield        #833 <Field int _numTypesValid>
	//*  22   44:iconst_1        
	//*  23   45:iand            
	//*  24   46:ifne            53
					convertNumberToInt();
	//   25   49:aload_0         
	//   26   50:invokevirtual   #839 <Method void convertNumberToInt()>
			}
			return _numberInt;
	//   27   53:aload_0         
	//   28   54:getfield        #842 <Field int _numberInt>
	//   29   57:ireturn         
		} else
		{
			return super.getValueAsInt(0);
	//   30   58:aload_0         
	//   31   59:iconst_0        
	//   32   60:invokespecial   #844 <Method int ParserBase.getValueAsInt(int)>
	//   33   63:ireturn         
		}
	}

	public int getValueAsInt(int i)
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field JsonToken _currToken>
	//    2    4:astore_2        
		if(jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    5:aload_2         
	//*   4    6:getstatic       #827 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5    9:if_acmpeq       19
	//*   6   12:aload_2         
	//*   7   13:getstatic       #830 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   16:if_acmpne       58
		{
			if((_numTypesValid & 1) == 0)
	//*   9   19:aload_0         
	//*  10   20:getfield        #833 <Field int _numTypesValid>
	//*  11   23:iconst_1        
	//*  12   24:iand            
	//*  13   25:ifne            53
			{
				if(_numTypesValid == 0)
	//*  14   28:aload_0         
	//*  15   29:getfield        #833 <Field int _numTypesValid>
	//*  16   32:ifne            40
					return _parseIntValue();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #836 <Method int _parseIntValue()>
	//   19   39:ireturn         
				if((_numTypesValid & 1) == 0)
	//*  20   40:aload_0         
	//*  21   41:getfield        #833 <Field int _numTypesValid>
	//*  22   44:iconst_1        
	//*  23   45:iand            
	//*  24   46:ifne            53
					convertNumberToInt();
	//   25   49:aload_0         
	//   26   50:invokevirtual   #839 <Method void convertNumberToInt()>
			}
			return _numberInt;
	//   27   53:aload_0         
	//   28   54:getfield        #842 <Field int _numberInt>
	//   29   57:ireturn         
		} else
		{
			return super.getValueAsInt(i);
	//   30   58:aload_0         
	//   31   59:iload_1         
	//   32   60:invokespecial   #844 <Method int ParserBase.getValueAsInt(int)>
	//   33   63:ireturn         
		}
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
	//   11   23:invokevirtual   #792 <Method String _finishAndReturnString()>
	//   12   26:areturn         
			} else
			{
				return _textBuffer.contentsAsString();
	//   13   27:aload_0         
	//   14   28:getfield        #116 <Field TextBuffer _textBuffer>
	//   15   31:invokevirtual   #569 <Method String TextBuffer.contentsAsString()>
	//   16   34:areturn         
			}
		if(_currToken == JsonToken.FIELD_NAME)
	//*  17   35:aload_0         
	//*  18   36:getfield        #189 <Field JsonToken _currToken>
	//*  19   39:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//*  20   42:if_acmpne       50
			return getCurrentName();
	//   21   45:aload_0         
	//   22   46:invokevirtual   #846 <Method String getCurrentName()>
	//   23   49:areturn         
		else
			return super.getValueAsString(((String) (null)));
	//   24   50:aload_0         
	//   25   51:aconst_null     
	//   26   52:invokespecial   #849 <Method String ParserBase.getValueAsString(String)>
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
	//   11   23:invokevirtual   #792 <Method String _finishAndReturnString()>
	//   12   26:areturn         
			} else
			{
				return _textBuffer.contentsAsString();
	//   13   27:aload_0         
	//   14   28:getfield        #116 <Field TextBuffer _textBuffer>
	//   15   31:invokevirtual   #569 <Method String TextBuffer.contentsAsString()>
	//   16   34:areturn         
			}
		if(_currToken == JsonToken.FIELD_NAME)
	//*  17   35:aload_0         
	//*  18   36:getfield        #189 <Field JsonToken _currToken>
	//*  19   39:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//*  20   42:if_acmpne       50
			return getCurrentName();
	//   21   45:aload_0         
	//   22   46:invokevirtual   #846 <Method String getCurrentName()>
	//   23   49:areturn         
		else
			return super.getValueAsString(s);
	//   24   50:aload_0         
	//   25   51:aload_1         
	//   26   52:invokespecial   #849 <Method String ParserBase.getValueAsString(String)>
	//   27   55:areturn         
	}

	protected final boolean loadMore()
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
	//   20   34:getfield        #406 <Field int _nameStartOffset>
	//   21   37:iload_1         
	//   22   38:isub            
	//   23   39:putfield        #406 <Field int _nameStartOffset>
		if(_inputStream != null)
	//*  24   42:aload_0         
	//*  25   43:getfield        #52  <Field InputStream _inputStream>
	//*  26   46:ifnull          59
		{
			int j = _inputBuffer.length;
	//   27   49:aload_0         
	//   28   50:getfield        #58  <Field byte[] _inputBuffer>
	//   29   53:arraylength     
	//   30   54:istore_1        
			if(j != 0)
	//*  31   55:iload_1         
	//*  32   56:ifne            61
	//*  33   59:iconst_0        
	//*  34   60:ireturn         
			{
				j = _inputStream.read(_inputBuffer, 0, j);
	//   35   61:aload_0         
	//   36   62:getfield        #52  <Field InputStream _inputStream>
	//   37   65:aload_0         
	//   38   66:getfield        #58  <Field byte[] _inputBuffer>
	//   39   69:iconst_0        
	//   40   70:iload_1         
	//   41   71:invokevirtual   #671 <Method int InputStream.read(byte[], int, int)>
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
	//   54   92:invokevirtual   #673 <Method void _closeInput()>
				if(j == 0)
	//*  55   95:iload_1         
	//*  56   96:ifne            59
					throw new IOException((new StringBuilder()).append("InputStream.read() returned 0 characters when trying to read ").append(_inputBuffer.length).append(" bytes").toString());
	//   57   99:new             #77  <Class IOException>
	//   58  102:dup             
	//   59  103:new             #344 <Class StringBuilder>
	//   60  106:dup             
	//   61  107:invokespecial   #346 <Method void StringBuilder()>
	//   62  110:ldc2            #675 <String "InputStream.read() returned 0 characters when trying to read ">
	//   63  113:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   64  116:aload_0         
	//   65  117:getfield        #58  <Field byte[] _inputBuffer>
	//   66  120:arraylength     
	//   67  121:invokevirtual   #678 <Method StringBuilder StringBuilder.append(int)>
	//   68  124:ldc2            #680 <String " bytes">
	//   69  127:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   70  130:invokevirtual   #360 <Method String StringBuilder.toString()>
	//   71  133:invokespecial   #682 <Method void IOException(String)>
	//   72  136:athrow          
			}
		}
		return false;
	}

	public Boolean nextBooleanValue()
		throws IOException
	{
		Boolean boolean1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(_currToken != JsonToken.FIELD_NAME) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #189 <Field JsonToken _currToken>
	//    4    6:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//    5    9:if_acmpne       112
_L1:
		JsonToken jsontoken;
		_nameCopied = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #259 <Field boolean _nameCopied>
		jsontoken = _nextToken;
	//    9   17:aload_0         
	//   10   18:getfield        #204 <Field JsonToken _nextToken>
	//   11   21:astore_2        
		_nextToken = null;
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:putfield        #204 <Field JsonToken _nextToken>
		_currToken = jsontoken;
	//   15   27:aload_0         
	//   16   28:aload_2         
	//   17   29:putfield        #189 <Field JsonToken _currToken>
		if(jsontoken != JsonToken.VALUE_TRUE) goto _L4; else goto _L3
	//   18   32:aload_2         
	//   19   33:getstatic       #223 <Field JsonToken JsonToken.VALUE_TRUE>
	//   20   36:if_acmpne       45
_L3:
		boolean1 = Boolean.TRUE;
	//   21   39:getstatic       #857 <Field Boolean Boolean.TRUE>
	//   22   42:astore_1        
_L6:
		return boolean1;
	//   23   43:aload_1         
	//   24   44:areturn         
_L4:
		if(jsontoken == JsonToken.VALUE_FALSE)
	//*  25   45:aload_2         
	//*  26   46:getstatic       #228 <Field JsonToken JsonToken.VALUE_FALSE>
	//*  27   49:if_acmpne       56
			return Boolean.FALSE;
	//   28   52:getstatic       #860 <Field Boolean Boolean.FALSE>
	//   29   55:areturn         
		if(jsontoken == JsonToken.START_ARRAY)
	//*  30   56:aload_2         
	//*  31   57:getstatic       #211 <Field JsonToken JsonToken.START_ARRAY>
	//*  32   60:if_acmpne       84
		{
			_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   33   63:aload_0         
	//   34   64:aload_0         
	//   35   65:getfield        #165 <Field JsonReadContext _parsingContext>
	//   36   68:aload_0         
	//   37   69:getfield        #262 <Field int _tokenInputRow>
	//   38   72:aload_0         
	//   39   73:getfield        #265 <Field int _tokenInputCol>
	//   40   76:invokevirtual   #269 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   41   79:putfield        #165 <Field JsonReadContext _parsingContext>
			return null;
	//   42   82:aconst_null     
	//   43   83:areturn         
		}
		if(jsontoken == JsonToken.START_OBJECT)
	//*  44   84:aload_2         
	//*  45   85:getstatic       #214 <Field JsonToken JsonToken.START_OBJECT>
	//*  46   88:if_acmpne       43
		{
			_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   47   91:aload_0         
	//   48   92:aload_0         
	//   49   93:getfield        #165 <Field JsonReadContext _parsingContext>
	//   50   96:aload_0         
	//   51   97:getfield        #262 <Field int _tokenInputRow>
	//   52  100:aload_0         
	//   53  101:getfield        #265 <Field int _tokenInputCol>
	//   54  104:invokevirtual   #272 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   55  107:putfield        #165 <Field JsonReadContext _parsingContext>
			return null;
	//   56  110:aconst_null     
	//   57  111:areturn         
		}
		continue; /* Loop/switch isn't completed */
_L2:
		JsonToken jsontoken1 = nextToken();
	//   58  112:aload_0         
	//   59  113:invokevirtual   #863 <Method JsonToken nextToken()>
	//   60  116:astore_2        
		if(jsontoken1 == JsonToken.VALUE_TRUE)
	//*  61  117:aload_2         
	//*  62  118:getstatic       #223 <Field JsonToken JsonToken.VALUE_TRUE>
	//*  63  121:if_acmpne       128
			return Boolean.TRUE;
	//   64  124:getstatic       #857 <Field Boolean Boolean.TRUE>
	//   65  127:areturn         
		if(jsontoken1 == JsonToken.VALUE_FALSE)
	//*  66  128:aload_2         
	//*  67  129:getstatic       #228 <Field JsonToken JsonToken.VALUE_FALSE>
	//*  68  132:if_acmpne       43
			return Boolean.FALSE;
	//   69  135:getstatic       #860 <Field Boolean Boolean.FALSE>
	//   70  138:areturn         
		if(true) goto _L6; else goto _L5
_L5:
	}

	public String nextFieldName()
		throws IOException
	{
		int i;
		String s;
		_numTypesValid = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #833 <Field int _numTypesValid>
		if(_currToken == JsonToken.FIELD_NAME)
	//*   3    5:aload_0         
	//*   4    6:getfield        #189 <Field JsonToken _currToken>
	//*   5    9:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//*   6   12:if_acmpne       22
		{
			_nextAfterName();
	//    7   15:aload_0         
	//    8   16:invokespecial   #866 <Method JsonToken _nextAfterName()>
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
	//   16   30:invokevirtual   #868 <Method void _skipString()>
		int j = _skipWSOrEnd();
	//   17   33:aload_0         
	//   18   34:invokespecial   #870 <Method int _skipWSOrEnd()>
	//   19   37:istore_2        
		if(j < 0)
	//*  20   38:iload_2         
	//*  21   39:ifge            53
		{
			close();
	//   22   42:aload_0         
	//   23   43:invokevirtual   #871 <Method void close()>
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
	//   31   55:putfield        #752 <Field byte[] _binaryValue>
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
	//*  39   72:invokevirtual   #874 <Method boolean JsonReadContext.inArray()>
	//*  40   75:ifne            85
				_reportMismatchedEndMarker(j, '}');
	//   41   78:aload_0         
	//   42   79:iload_2         
	//   43   80:bipush          125
	//   44   82:invokevirtual   #878 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   45   85:aload_0         
	//   46   86:aload_0         
	//   47   87:getfield        #165 <Field JsonReadContext _parsingContext>
	//   48   90:invokevirtual   #882 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   49   93:putfield        #165 <Field JsonReadContext _parsingContext>
			_currToken = JsonToken.END_ARRAY;
	//   50   96:aload_0         
	//   51   97:getstatic       #885 <Field JsonToken JsonToken.END_ARRAY>
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
	//*  62  119:invokevirtual   #888 <Method boolean JsonReadContext.inObject()>
	//*  63  122:ifne            132
				_reportMismatchedEndMarker(j, ']');
	//   64  125:aload_0         
	//   65  126:iload_2         
	//   66  127:bipush          93
	//   67  129:invokevirtual   #878 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   68  132:aload_0         
	//   69  133:aload_0         
	//   70  134:getfield        #165 <Field JsonReadContext _parsingContext>
	//   71  137:invokevirtual   #882 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   72  140:putfield        #165 <Field JsonReadContext _parsingContext>
			_currToken = JsonToken.END_OBJECT;
	//   73  143:aload_0         
	//   74  144:getstatic       #891 <Field JsonToken JsonToken.END_OBJECT>
	//   75  147:putfield        #189 <Field JsonToken _currToken>
			return null;
	//   76  150:aconst_null     
	//   77  151:areturn         
		}
		i = j;
	//   78  152:iload_2         
	//   79  153:istore_1        
		if(_parsingContext.expectComma())
	//*  80  154:aload_0         
	//*  81  155:getfield        #165 <Field JsonReadContext _parsingContext>
	//*  82  158:invokevirtual   #894 <Method boolean JsonReadContext.expectComma()>
	//*  83  161:ifeq            212
		{
			if(j != 44)
	//*  84  164:iload_2         
	//*  85  165:bipush          44
	//*  86  167:icmpeq          207
				_reportUnexpectedChar(j, (new StringBuilder()).append("was expecting comma to separate ").append(_parsingContext.getTypeDesc()).append(" entries").toString());
	//   87  170:aload_0         
	//   88  171:iload_2         
	//   89  172:new             #344 <Class StringBuilder>
	//   90  175:dup             
	//   91  176:invokespecial   #346 <Method void StringBuilder()>
	//   92  179:ldc2            #896 <String "was expecting comma to separate ">
	//   93  182:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   94  185:aload_0         
	//   95  186:getfield        #165 <Field JsonReadContext _parsingContext>
	//   96  189:invokevirtual   #355 <Method String JsonReadContext.getTypeDesc()>
	//   97  192:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   98  195:ldc2            #357 <String " entries">
	//   99  198:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//  100  201:invokevirtual   #360 <Method String StringBuilder.toString()>
	//  101  204:invokevirtual   #342 <Method void _reportUnexpectedChar(int, String)>
			i = _skipWS();
	//  102  207:aload_0         
	//  103  208:invokespecial   #898 <Method int _skipWS()>
	//  104  211:istore_1        
		}
		if(!_parsingContext.inObject())
	//* 105  212:aload_0         
	//* 106  213:getfield        #165 <Field JsonReadContext _parsingContext>
	//* 107  216:invokevirtual   #888 <Method boolean JsonReadContext.inObject()>
	//* 108  219:ifne            234
		{
			_updateLocation();
	//  109  222:aload_0         
	//  110  223:invokespecial   #196 <Method void _updateLocation()>
			_nextTokenNotInObject(i);
	//  111  226:aload_0         
	//  112  227:iload_1         
	//  113  228:invokespecial   #900 <Method JsonToken _nextTokenNotInObject(int)>
	//  114  231:pop             
			return null;
	//  115  232:aconst_null     
	//  116  233:areturn         
		}
		_updateNameLocation();
	//  117  234:aload_0         
	//  118  235:invokespecial   #902 <Method void _updateNameLocation()>
		s = _parseName(i);
	//  119  238:aload_0         
	//  120  239:iload_1         
	//  121  240:invokevirtual   #161 <Method String _parseName(int)>
	//  122  243:astore          4
		_parsingContext.setCurrentName(s);
	//  123  245:aload_0         
	//  124  246:getfield        #165 <Field JsonReadContext _parsingContext>
	//  125  249:aload           4
	//  126  251:invokevirtual   #170 <Method void JsonReadContext.setCurrentName(String)>
		_currToken = JsonToken.FIELD_NAME;
	//  127  254:aload_0         
	//  128  255:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//  129  258:putfield        #189 <Field JsonToken _currToken>
		i = _skipColon();
	//  130  261:aload_0         
	//  131  262:invokespecial   #193 <Method int _skipColon()>
	//  132  265:istore_1        
		_updateLocation();
	//  133  266:aload_0         
	//  134  267:invokespecial   #196 <Method void _updateLocation()>
		if(i == 34)
	//* 135  270:iload_1         
	//* 136  271:bipush          34
	//* 137  273:icmpne          291
		{
			_tokenIncomplete = true;
	//  138  276:aload_0         
	//  139  277:iconst_1        
	//  140  278:putfield        #198 <Field boolean _tokenIncomplete>
			_nextToken = JsonToken.VALUE_STRING;
	//  141  281:aload_0         
	//  142  282:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//  143  285:putfield        #204 <Field JsonToken _nextToken>
			return s;
	//  144  288:aload           4
	//  145  290:areturn         
		}
		i;
	//  146  291:iload_1         
		JVM INSTR lookupswitch 16: default 432
	//	               45: 446
	//	               48: 454
	//	               49: 454
	//	               50: 454
	//	               51: 454
	//	               52: 454
	//	               53: 454
	//	               54: 454
	//	               55: 454
	//	               56: 454
	//	               57: 454
	//	               91: 505
	//	               102: 463
	//	               110: 477
	//	               116: 491
	//	               123: 512;
	//  147  292:lookupswitch    16: default 432
	//	               45: 446
	//	               48: 454
	//	               49: 454
	//	               50: 454
	//	               51: 454
	//	               52: 454
	//	               53: 454
	//	               54: 454
	//	               55: 454
	//	               56: 454
	//	               57: 454
	//	               91: 505
	//	               102: 463
	//	               110: 477
	//	               116: 491
	//	               123: 512
		   goto _L1 _L2 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		JsonToken jsontoken = _handleUnexpectedValue(i);
	//  148  432:aload_0         
	//  149  433:iload_1         
	//  150  434:invokevirtual   #208 <Method JsonToken _handleUnexpectedValue(int)>
	//  151  437:astore_3        
_L10:
		_nextToken = jsontoken;
	//  152  438:aload_0         
	//  153  439:aload_3         
	//  154  440:putfield        #204 <Field JsonToken _nextToken>
		return s;
	//  155  443:aload           4
	//  156  445:areturn         
_L2:
		jsontoken = _parseNegNumber();
	//  157  446:aload_0         
	//  158  447:invokevirtual   #237 <Method JsonToken _parseNegNumber()>
	//  159  450:astore_3        
		continue; /* Loop/switch isn't completed */
	//  160  451:goto            438
_L3:
		jsontoken = _parsePosNumber(i);
	//  161  454:aload_0         
	//  162  455:iload_1         
	//  163  456:invokevirtual   #240 <Method JsonToken _parsePosNumber(int)>
	//  164  459:astore_3        
		continue; /* Loop/switch isn't completed */
	//  165  460:goto            438
_L5:
		_matchToken("false", 1);
	//  166  463:aload_0         
	//  167  464:ldc1            #225 <String "false">
	//  168  466:iconst_1        
	//  169  467:invokevirtual   #220 <Method void _matchToken(String, int)>
		jsontoken = JsonToken.VALUE_FALSE;
	//  170  470:getstatic       #228 <Field JsonToken JsonToken.VALUE_FALSE>
	//  171  473:astore_3        
		continue; /* Loop/switch isn't completed */
	//  172  474:goto            438
_L6:
		_matchToken("null", 1);
	//  173  477:aload_0         
	//  174  478:ldc1            #230 <String "null">
	//  175  480:iconst_1        
	//  176  481:invokevirtual   #220 <Method void _matchToken(String, int)>
		jsontoken = JsonToken.VALUE_NULL;
	//  177  484:getstatic       #233 <Field JsonToken JsonToken.VALUE_NULL>
	//  178  487:astore_3        
		continue; /* Loop/switch isn't completed */
	//  179  488:goto            438
_L7:
		_matchToken("true", 1);
	//  180  491:aload_0         
	//  181  492:ldc1            #216 <String "true">
	//  182  494:iconst_1        
	//  183  495:invokevirtual   #220 <Method void _matchToken(String, int)>
		jsontoken = JsonToken.VALUE_TRUE;
	//  184  498:getstatic       #223 <Field JsonToken JsonToken.VALUE_TRUE>
	//  185  501:astore_3        
		continue; /* Loop/switch isn't completed */
	//  186  502:goto            438
_L4:
		jsontoken = JsonToken.START_ARRAY;
	//  187  505:getstatic       #211 <Field JsonToken JsonToken.START_ARRAY>
	//  188  508:astore_3        
		continue; /* Loop/switch isn't completed */
	//  189  509:goto            438
_L8:
		jsontoken = JsonToken.START_OBJECT;
	//  190  512:getstatic       #214 <Field JsonToken JsonToken.START_OBJECT>
	//  191  515:astore_3        
		if(true) goto _L10; else goto _L9
	//  192  516:goto            438
_L9:
	}

	public boolean nextFieldName(SerializableString serializablestring)
		throws IOException
	{
		int i;
		_numTypesValid = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #833 <Field int _numTypesValid>
		if(_currToken == JsonToken.FIELD_NAME)
	//*   3    5:aload_0         
	//*   4    6:getfield        #189 <Field JsonToken _currToken>
	//*   5    9:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//*   6   12:if_acmpne       22
		{
			_nextAfterName();
	//    7   15:aload_0         
	//    8   16:invokespecial   #866 <Method JsonToken _nextAfterName()>
	//    9   19:pop             
			return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
		}
		if(_tokenIncomplete)
	//*  12   22:aload_0         
	//*  13   23:getfield        #198 <Field boolean _tokenIncomplete>
	//*  14   26:ifeq            33
			_skipString();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #868 <Method void _skipString()>
		int j = _skipWSOrEnd();
	//   17   33:aload_0         
	//   18   34:invokespecial   #870 <Method int _skipWSOrEnd()>
	//   19   37:istore_3        
		if(j < 0)
	//*  20   38:iload_3         
	//*  21   39:ifge            53
		{
			close();
	//   22   42:aload_0         
	//   23   43:invokevirtual   #871 <Method void close()>
			_currToken = null;
	//   24   46:aload_0         
	//   25   47:aconst_null     
	//   26   48:putfield        #189 <Field JsonToken _currToken>
			return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
		}
		_binaryValue = null;
	//   29   53:aload_0         
	//   30   54:aconst_null     
	//   31   55:putfield        #752 <Field byte[] _binaryValue>
		if(j == 93)
	//*  32   58:iload_3         
	//*  33   59:bipush          93
	//*  34   61:icmpne          105
		{
			_updateLocation();
	//   35   64:aload_0         
	//   36   65:invokespecial   #196 <Method void _updateLocation()>
			if(!_parsingContext.inArray())
	//*  37   68:aload_0         
	//*  38   69:getfield        #165 <Field JsonReadContext _parsingContext>
	//*  39   72:invokevirtual   #874 <Method boolean JsonReadContext.inArray()>
	//*  40   75:ifne            85
				_reportMismatchedEndMarker(j, '}');
	//   41   78:aload_0         
	//   42   79:iload_3         
	//   43   80:bipush          125
	//   44   82:invokevirtual   #878 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   45   85:aload_0         
	//   46   86:aload_0         
	//   47   87:getfield        #165 <Field JsonReadContext _parsingContext>
	//   48   90:invokevirtual   #882 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   49   93:putfield        #165 <Field JsonReadContext _parsingContext>
			_currToken = JsonToken.END_ARRAY;
	//   50   96:aload_0         
	//   51   97:getstatic       #885 <Field JsonToken JsonToken.END_ARRAY>
	//   52  100:putfield        #189 <Field JsonToken _currToken>
			return false;
	//   53  103:iconst_0        
	//   54  104:ireturn         
		}
		if(j == 125)
	//*  55  105:iload_3         
	//*  56  106:bipush          125
	//*  57  108:icmpne          152
		{
			_updateLocation();
	//   58  111:aload_0         
	//   59  112:invokespecial   #196 <Method void _updateLocation()>
			if(!_parsingContext.inObject())
	//*  60  115:aload_0         
	//*  61  116:getfield        #165 <Field JsonReadContext _parsingContext>
	//*  62  119:invokevirtual   #888 <Method boolean JsonReadContext.inObject()>
	//*  63  122:ifne            132
				_reportMismatchedEndMarker(j, ']');
	//   64  125:aload_0         
	//   65  126:iload_3         
	//   66  127:bipush          93
	//   67  129:invokevirtual   #878 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   68  132:aload_0         
	//   69  133:aload_0         
	//   70  134:getfield        #165 <Field JsonReadContext _parsingContext>
	//   71  137:invokevirtual   #882 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   72  140:putfield        #165 <Field JsonReadContext _parsingContext>
			_currToken = JsonToken.END_OBJECT;
	//   73  143:aload_0         
	//   74  144:getstatic       #891 <Field JsonToken JsonToken.END_OBJECT>
	//   75  147:putfield        #189 <Field JsonToken _currToken>
			return false;
	//   76  150:iconst_0        
	//   77  151:ireturn         
		}
		i = j;
	//   78  152:iload_3         
	//   79  153:istore_2        
		if(_parsingContext.expectComma())
	//*  80  154:aload_0         
	//*  81  155:getfield        #165 <Field JsonReadContext _parsingContext>
	//*  82  158:invokevirtual   #894 <Method boolean JsonReadContext.expectComma()>
	//*  83  161:ifeq            212
		{
			if(j != 44)
	//*  84  164:iload_3         
	//*  85  165:bipush          44
	//*  86  167:icmpeq          207
				_reportUnexpectedChar(j, (new StringBuilder()).append("was expecting comma to separate ").append(_parsingContext.getTypeDesc()).append(" entries").toString());
	//   87  170:aload_0         
	//   88  171:iload_3         
	//   89  172:new             #344 <Class StringBuilder>
	//   90  175:dup             
	//   91  176:invokespecial   #346 <Method void StringBuilder()>
	//   92  179:ldc2            #896 <String "was expecting comma to separate ">
	//   93  182:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   94  185:aload_0         
	//   95  186:getfield        #165 <Field JsonReadContext _parsingContext>
	//   96  189:invokevirtual   #355 <Method String JsonReadContext.getTypeDesc()>
	//   97  192:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   98  195:ldc2            #357 <String " entries">
	//   99  198:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//  100  201:invokevirtual   #360 <Method String StringBuilder.toString()>
	//  101  204:invokevirtual   #342 <Method void _reportUnexpectedChar(int, String)>
			i = _skipWS();
	//  102  207:aload_0         
	//  103  208:invokespecial   #898 <Method int _skipWS()>
	//  104  211:istore_2        
		}
		if(!_parsingContext.inObject())
	//* 105  212:aload_0         
	//* 106  213:getfield        #165 <Field JsonReadContext _parsingContext>
	//* 107  216:invokevirtual   #888 <Method boolean JsonReadContext.inObject()>
	//* 108  219:ifne            234
		{
			_updateLocation();
	//  109  222:aload_0         
	//  110  223:invokespecial   #196 <Method void _updateLocation()>
			_nextTokenNotInObject(i);
	//  111  226:aload_0         
	//  112  227:iload_2         
	//  113  228:invokespecial   #900 <Method JsonToken _nextTokenNotInObject(int)>
	//  114  231:pop             
			return false;
	//  115  232:iconst_0        
	//  116  233:ireturn         
		}
		_updateNameLocation();
	//  117  234:aload_0         
	//  118  235:invokespecial   #902 <Method void _updateNameLocation()>
		if(i != 34) goto _L2; else goto _L1
	//  119  238:iload_2         
	//  120  239:bipush          34
	//  121  241:icmpne          345
_L1:
		int k;
		byte abyte0[];
		abyte0 = serializablestring.asQuotedUTF8();
	//  122  244:aload_1         
	//  123  245:invokeinterface #906 <Method byte[] SerializableString.asQuotedUTF8()>
	//  124  250:astore          6
		k = abyte0.length;
	//  125  252:aload           6
	//  126  254:arraylength     
	//  127  255:istore_3        
		if(_inputPtr + k + 4 >= _inputEnd) goto _L2; else goto _L3
	//  128  256:aload_0         
	//  129  257:getfield        #61  <Field int _inputPtr>
	//  130  260:iload_3         
	//  131  261:iadd            
	//  132  262:iconst_4        
	//  133  263:iadd            
	//  134  264:aload_0         
	//  135  265:getfield        #64  <Field int _inputEnd>
	//  136  268:icmpge          345
_L3:
		int i1 = _inputPtr + k;
	//  137  271:aload_0         
	//  138  272:getfield        #61  <Field int _inputPtr>
	//  139  275:iload_3         
	//  140  276:iadd            
	//  141  277:istore          5
		if(_inputBuffer[i1] != 34) goto _L2; else goto _L4
	//  142  279:aload_0         
	//  143  280:getfield        #58  <Field byte[] _inputBuffer>
	//  144  283:iload           5
	//  145  285:baload          
	//  146  286:bipush          34
	//  147  288:icmpne          345
_L4:
		int l;
		l = 0;
	//  148  291:iconst_0        
	//  149  292:istore          4
		k = _inputPtr;
	//  150  294:aload_0         
	//  151  295:getfield        #61  <Field int _inputPtr>
	//  152  298:istore_3        
_L7:
		if(k == i1)
	//* 153  299:iload_3         
	//* 154  300:iload           5
	//* 155  302:icmpne          331
		{
			_parsingContext.setCurrentName(serializablestring.getValue());
	//  156  305:aload_0         
	//  157  306:getfield        #165 <Field JsonReadContext _parsingContext>
	//  158  309:aload_1         
	//  159  310:invokeinterface #176 <Method String SerializableString.getValue()>
	//  160  315:invokevirtual   #170 <Method void JsonReadContext.setCurrentName(String)>
			_isNextTokenNameYes(_skipColonFast(k + 1));
	//  161  318:aload_0         
	//  162  319:aload_0         
	//  163  320:iload_3         
	//  164  321:iconst_1        
	//  165  322:iadd            
	//  166  323:invokespecial   #908 <Method int _skipColonFast(int)>
	//  167  326:invokespecial   #910 <Method void _isNextTokenNameYes(int)>
			return true;
	//  168  329:iconst_1        
	//  169  330:ireturn         
		}
		if(abyte0[l] == _inputBuffer[k]) goto _L5; else goto _L2
	//  170  331:aload           6
	//  171  333:iload           4
	//  172  335:baload          
	//  173  336:aload_0         
	//  174  337:getfield        #58  <Field byte[] _inputBuffer>
	//  175  340:iload_3         
	//  176  341:baload          
	//  177  342:icmpeq          352
_L2:
		return _isNextTokenNameMaybe(i, serializablestring);
	//  178  345:aload_0         
	//  179  346:iload_2         
	//  180  347:aload_1         
	//  181  348:invokespecial   #912 <Method boolean _isNextTokenNameMaybe(int, SerializableString)>
	//  182  351:ireturn         
_L5:
		l++;
	//  183  352:iload           4
	//  184  354:iconst_1        
	//  185  355:iadd            
	//  186  356:istore          4
		k++;
	//  187  358:iload_3         
	//  188  359:iconst_1        
	//  189  360:iadd            
	//  190  361:istore_3        
		if(true) goto _L7; else goto _L6
	//  191  362:goto            299
_L6:
	}

	public int nextIntValue(int i)
		throws IOException
	{
		if(_currToken != JsonToken.FIELD_NAME) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field JsonToken _currToken>
	//    2    4:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//    3    7:if_acmpne       102
_L1:
		JsonToken jsontoken;
		_nameCopied = false;
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:putfield        #259 <Field boolean _nameCopied>
		jsontoken = _nextToken;
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
		if(jsontoken != JsonToken.VALUE_NUMBER_INT) goto _L4; else goto _L3
	//   16   30:aload_3         
	//   17   31:getstatic       #827 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//   18   34:if_acmpne       44
_L3:
		int j = getIntValue();
	//   19   37:aload_0         
	//   20   38:invokevirtual   #916 <Method int getIntValue()>
	//   21   41:istore_2        
_L6:
		return j;
	//   22   42:iload_2         
	//   23   43:ireturn         
_L4:
		if(jsontoken == JsonToken.START_ARRAY)
	//*  24   44:aload_3         
	//*  25   45:getstatic       #211 <Field JsonToken JsonToken.START_ARRAY>
	//*  26   48:if_acmpne       72
		{
			_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getfield        #165 <Field JsonReadContext _parsingContext>
	//   30   56:aload_0         
	//   31   57:getfield        #262 <Field int _tokenInputRow>
	//   32   60:aload_0         
	//   33   61:getfield        #265 <Field int _tokenInputCol>
	//   34   64:invokevirtual   #269 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   35   67:putfield        #165 <Field JsonReadContext _parsingContext>
			return i;
	//   36   70:iload_1         
	//   37   71:ireturn         
		}
		j = i;
	//   38   72:iload_1         
	//   39   73:istore_2        
		if(jsontoken == JsonToken.START_OBJECT)
	//*  40   74:aload_3         
	//*  41   75:getstatic       #214 <Field JsonToken JsonToken.START_OBJECT>
	//*  42   78:if_acmpne       42
		{
			_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   43   81:aload_0         
	//   44   82:aload_0         
	//   45   83:getfield        #165 <Field JsonReadContext _parsingContext>
	//   46   86:aload_0         
	//   47   87:getfield        #262 <Field int _tokenInputRow>
	//   48   90:aload_0         
	//   49   91:getfield        #265 <Field int _tokenInputCol>
	//   50   94:invokevirtual   #272 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   51   97:putfield        #165 <Field JsonReadContext _parsingContext>
			return i;
	//   52  100:iload_1         
	//   53  101:ireturn         
		}
		continue; /* Loop/switch isn't completed */
_L2:
		j = i;
	//   54  102:iload_1         
	//   55  103:istore_2        
		if(nextToken() == JsonToken.VALUE_NUMBER_INT)
	//*  56  104:aload_0         
	//*  57  105:invokevirtual   #863 <Method JsonToken nextToken()>
	//*  58  108:getstatic       #827 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  59  111:if_acmpne       42
			return getIntValue();
	//   60  114:aload_0         
	//   61  115:invokevirtual   #916 <Method int getIntValue()>
	//   62  118:ireturn         
		if(true) goto _L6; else goto _L5
_L5:
	}

	public long nextLongValue(long l)
		throws IOException
	{
		if(_currToken != JsonToken.FIELD_NAME) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field JsonToken _currToken>
	//    2    4:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//    3    7:if_acmpne       107
_L1:
		JsonToken jsontoken;
		_nameCopied = false;
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:putfield        #259 <Field boolean _nameCopied>
		jsontoken = _nextToken;
	//    7   15:aload_0         
	//    8   16:getfield        #204 <Field JsonToken _nextToken>
	//    9   19:astore          5
		_nextToken = null;
	//   10   21:aload_0         
	//   11   22:aconst_null     
	//   12   23:putfield        #204 <Field JsonToken _nextToken>
		_currToken = jsontoken;
	//   13   26:aload_0         
	//   14   27:aload           5
	//   15   29:putfield        #189 <Field JsonToken _currToken>
		if(jsontoken != JsonToken.VALUE_NUMBER_INT) goto _L4; else goto _L3
	//   16   32:aload           5
	//   17   34:getstatic       #827 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//   18   37:if_acmpne       47
_L3:
		long l1 = getLongValue();
	//   19   40:aload_0         
	//   20   41:invokevirtual   #922 <Method long getLongValue()>
	//   21   44:lstore_3        
_L6:
		return l1;
	//   22   45:lload_3         
	//   23   46:lreturn         
_L4:
		if(jsontoken == JsonToken.START_ARRAY)
	//*  24   47:aload           5
	//*  25   49:getstatic       #211 <Field JsonToken JsonToken.START_ARRAY>
	//*  26   52:if_acmpne       76
		{
			_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   27   55:aload_0         
	//   28   56:aload_0         
	//   29   57:getfield        #165 <Field JsonReadContext _parsingContext>
	//   30   60:aload_0         
	//   31   61:getfield        #262 <Field int _tokenInputRow>
	//   32   64:aload_0         
	//   33   65:getfield        #265 <Field int _tokenInputCol>
	//   34   68:invokevirtual   #269 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   35   71:putfield        #165 <Field JsonReadContext _parsingContext>
			return l;
	//   36   74:lload_1         
	//   37   75:lreturn         
		}
		l1 = l;
	//   38   76:lload_1         
	//   39   77:lstore_3        
		if(jsontoken == JsonToken.START_OBJECT)
	//*  40   78:aload           5
	//*  41   80:getstatic       #214 <Field JsonToken JsonToken.START_OBJECT>
	//*  42   83:if_acmpne       45
		{
			_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   43   86:aload_0         
	//   44   87:aload_0         
	//   45   88:getfield        #165 <Field JsonReadContext _parsingContext>
	//   46   91:aload_0         
	//   47   92:getfield        #262 <Field int _tokenInputRow>
	//   48   95:aload_0         
	//   49   96:getfield        #265 <Field int _tokenInputCol>
	//   50   99:invokevirtual   #272 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   51  102:putfield        #165 <Field JsonReadContext _parsingContext>
			return l;
	//   52  105:lload_1         
	//   53  106:lreturn         
		}
		continue; /* Loop/switch isn't completed */
_L2:
		l1 = l;
	//   54  107:lload_1         
	//   55  108:lstore_3        
		if(nextToken() == JsonToken.VALUE_NUMBER_INT)
	//*  56  109:aload_0         
	//*  57  110:invokevirtual   #863 <Method JsonToken nextToken()>
	//*  58  113:getstatic       #827 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  59  116:if_acmpne       45
			return getLongValue();
	//   60  119:aload_0         
	//   61  120:invokevirtual   #922 <Method long getLongValue()>
	//   62  123:lreturn         
		if(true) goto _L6; else goto _L5
_L5:
	}

	public String nextTextValue()
		throws IOException
	{
		String s = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(_currToken != JsonToken.FIELD_NAME) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #189 <Field JsonToken _currToken>
	//    4    6:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//    5    9:if_acmpne       122
_L1:
		JsonToken jsontoken;
		_nameCopied = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #259 <Field boolean _nameCopied>
		jsontoken = _nextToken;
	//    9   17:aload_0         
	//   10   18:getfield        #204 <Field JsonToken _nextToken>
	//   11   21:astore_2        
		_nextToken = null;
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:putfield        #204 <Field JsonToken _nextToken>
		_currToken = jsontoken;
	//   15   27:aload_0         
	//   16   28:aload_2         
	//   17   29:putfield        #189 <Field JsonToken _currToken>
		if(jsontoken != JsonToken.VALUE_STRING) goto _L4; else goto _L3
	//   18   32:aload_2         
	//   19   33:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//   20   36:if_acmpne       66
_L3:
		if(!_tokenIncomplete) goto _L6; else goto _L5
	//   21   39:aload_0         
	//   22   40:getfield        #198 <Field boolean _tokenIncomplete>
	//   23   43:ifeq            58
_L5:
		_tokenIncomplete = false;
	//   24   46:aload_0         
	//   25   47:iconst_0        
	//   26   48:putfield        #198 <Field boolean _tokenIncomplete>
		s = _finishAndReturnString();
	//   27   51:aload_0         
	//   28   52:invokevirtual   #792 <Method String _finishAndReturnString()>
	//   29   55:astore_1        
_L8:
		return s;
	//   30   56:aload_1         
	//   31   57:areturn         
_L6:
		return _textBuffer.contentsAsString();
	//   32   58:aload_0         
	//   33   59:getfield        #116 <Field TextBuffer _textBuffer>
	//   34   62:invokevirtual   #569 <Method String TextBuffer.contentsAsString()>
	//   35   65:areturn         
_L4:
		if(jsontoken == JsonToken.START_ARRAY)
	//*  36   66:aload_2         
	//*  37   67:getstatic       #211 <Field JsonToken JsonToken.START_ARRAY>
	//*  38   70:if_acmpne       94
		{
			_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   39   73:aload_0         
	//   40   74:aload_0         
	//   41   75:getfield        #165 <Field JsonReadContext _parsingContext>
	//   42   78:aload_0         
	//   43   79:getfield        #262 <Field int _tokenInputRow>
	//   44   82:aload_0         
	//   45   83:getfield        #265 <Field int _tokenInputCol>
	//   46   86:invokevirtual   #269 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   47   89:putfield        #165 <Field JsonReadContext _parsingContext>
			return null;
	//   48   92:aconst_null     
	//   49   93:areturn         
		}
		if(jsontoken == JsonToken.START_OBJECT)
	//*  50   94:aload_2         
	//*  51   95:getstatic       #214 <Field JsonToken JsonToken.START_OBJECT>
	//*  52   98:if_acmpne       56
		{
			_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   53  101:aload_0         
	//   54  102:aload_0         
	//   55  103:getfield        #165 <Field JsonReadContext _parsingContext>
	//   56  106:aload_0         
	//   57  107:getfield        #262 <Field int _tokenInputRow>
	//   58  110:aload_0         
	//   59  111:getfield        #265 <Field int _tokenInputCol>
	//   60  114:invokevirtual   #272 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   61  117:putfield        #165 <Field JsonReadContext _parsingContext>
			return null;
	//   62  120:aconst_null     
	//   63  121:areturn         
		}
		continue; /* Loop/switch isn't completed */
_L2:
		if(nextToken() == JsonToken.VALUE_STRING)
	//*  64  122:aload_0         
	//*  65  123:invokevirtual   #863 <Method JsonToken nextToken()>
	//*  66  126:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//*  67  129:if_acmpne       56
			return getText();
	//   68  132:aload_0         
	//   69  133:invokevirtual   #771 <Method String getText()>
	//   70  136:areturn         
		if(true) goto _L8; else goto _L7
_L7:
	}

	public JsonToken nextToken()
		throws IOException
	{
		int i;
		if(_currToken == JsonToken.FIELD_NAME)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field JsonToken _currToken>
	//*   2    4:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:if_acmpne       15
			return _nextAfterName();
	//    4   10:aload_0         
	//    5   11:invokespecial   #866 <Method JsonToken _nextAfterName()>
	//    6   14:areturn         
		_numTypesValid = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #833 <Field int _numTypesValid>
		if(_tokenIncomplete)
	//*  10   20:aload_0         
	//*  11   21:getfield        #198 <Field boolean _tokenIncomplete>
	//*  12   24:ifeq            31
			_skipString();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #868 <Method void _skipString()>
		int j = _skipWSOrEnd();
	//   15   31:aload_0         
	//   16   32:invokespecial   #870 <Method int _skipWSOrEnd()>
	//   17   35:istore_2        
		if(j < 0)
	//*  18   36:iload_2         
	//*  19   37:ifge            51
		{
			close();
	//   20   40:aload_0         
	//   21   41:invokevirtual   #871 <Method void close()>
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
	//   29   53:putfield        #752 <Field byte[] _binaryValue>
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
	//*  37   70:invokevirtual   #874 <Method boolean JsonReadContext.inArray()>
	//*  38   73:ifne            83
				_reportMismatchedEndMarker(j, '}');
	//   39   76:aload_0         
	//   40   77:iload_2         
	//   41   78:bipush          125
	//   42   80:invokevirtual   #878 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   43   83:aload_0         
	//   44   84:aload_0         
	//   45   85:getfield        #165 <Field JsonReadContext _parsingContext>
	//   46   88:invokevirtual   #882 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   47   91:putfield        #165 <Field JsonReadContext _parsingContext>
			JsonToken jsontoken = JsonToken.END_ARRAY;
	//   48   94:getstatic       #885 <Field JsonToken JsonToken.END_ARRAY>
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
	//*  62  119:invokevirtual   #888 <Method boolean JsonReadContext.inObject()>
	//*  63  122:ifne            132
				_reportMismatchedEndMarker(j, ']');
	//   64  125:aload_0         
	//   65  126:iload_2         
	//   66  127:bipush          93
	//   67  129:invokevirtual   #878 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   68  132:aload_0         
	//   69  133:aload_0         
	//   70  134:getfield        #165 <Field JsonReadContext _parsingContext>
	//   71  137:invokevirtual   #882 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   72  140:putfield        #165 <Field JsonReadContext _parsingContext>
			JsonToken jsontoken1 = JsonToken.END_OBJECT;
	//   73  143:getstatic       #891 <Field JsonToken JsonToken.END_OBJECT>
	//   74  146:astore_3        
			_currToken = jsontoken1;
	//   75  147:aload_0         
	//   76  148:aload_3         
	//   77  149:putfield        #189 <Field JsonToken _currToken>
			return jsontoken1;
	//   78  152:aload_3         
	//   79  153:areturn         
		}
		i = j;
	//   80  154:iload_2         
	//   81  155:istore_1        
		if(_parsingContext.expectComma())
	//*  82  156:aload_0         
	//*  83  157:getfield        #165 <Field JsonReadContext _parsingContext>
	//*  84  160:invokevirtual   #894 <Method boolean JsonReadContext.expectComma()>
	//*  85  163:ifeq            214
		{
			if(j != 44)
	//*  86  166:iload_2         
	//*  87  167:bipush          44
	//*  88  169:icmpeq          209
				_reportUnexpectedChar(j, (new StringBuilder()).append("was expecting comma to separate ").append(_parsingContext.getTypeDesc()).append(" entries").toString());
	//   89  172:aload_0         
	//   90  173:iload_2         
	//   91  174:new             #344 <Class StringBuilder>
	//   92  177:dup             
	//   93  178:invokespecial   #346 <Method void StringBuilder()>
	//   94  181:ldc2            #896 <String "was expecting comma to separate ">
	//   95  184:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   96  187:aload_0         
	//   97  188:getfield        #165 <Field JsonReadContext _parsingContext>
	//   98  191:invokevirtual   #355 <Method String JsonReadContext.getTypeDesc()>
	//   99  194:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//  100  197:ldc2            #357 <String " entries">
	//  101  200:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//  102  203:invokevirtual   #360 <Method String StringBuilder.toString()>
	//  103  206:invokevirtual   #342 <Method void _reportUnexpectedChar(int, String)>
			i = _skipWS();
	//  104  209:aload_0         
	//  105  210:invokespecial   #898 <Method int _skipWS()>
	//  106  213:istore_1        
		}
		if(!_parsingContext.inObject())
	//* 107  214:aload_0         
	//* 108  215:getfield        #165 <Field JsonReadContext _parsingContext>
	//* 109  218:invokevirtual   #888 <Method boolean JsonReadContext.inObject()>
	//* 110  221:ifne            234
		{
			_updateLocation();
	//  111  224:aload_0         
	//  112  225:invokespecial   #196 <Method void _updateLocation()>
			return _nextTokenNotInObject(i);
	//  113  228:aload_0         
	//  114  229:iload_1         
	//  115  230:invokespecial   #900 <Method JsonToken _nextTokenNotInObject(int)>
	//  116  233:areturn         
		}
		_updateNameLocation();
	//  117  234:aload_0         
	//  118  235:invokespecial   #902 <Method void _updateNameLocation()>
		String s = _parseName(i);
	//  119  238:aload_0         
	//  120  239:iload_1         
	//  121  240:invokevirtual   #161 <Method String _parseName(int)>
	//  122  243:astore_3        
		_parsingContext.setCurrentName(s);
	//  123  244:aload_0         
	//  124  245:getfield        #165 <Field JsonReadContext _parsingContext>
	//  125  248:aload_3         
	//  126  249:invokevirtual   #170 <Method void JsonReadContext.setCurrentName(String)>
		_currToken = JsonToken.FIELD_NAME;
	//  127  252:aload_0         
	//  128  253:getstatic       #186 <Field JsonToken JsonToken.FIELD_NAME>
	//  129  256:putfield        #189 <Field JsonToken _currToken>
		i = _skipColon();
	//  130  259:aload_0         
	//  131  260:invokespecial   #193 <Method int _skipColon()>
	//  132  263:istore_1        
		_updateLocation();
	//  133  264:aload_0         
	//  134  265:invokespecial   #196 <Method void _updateLocation()>
		if(i == 34)
	//* 135  268:iload_1         
	//* 136  269:bipush          34
	//* 137  271:icmpne          291
		{
			_tokenIncomplete = true;
	//  138  274:aload_0         
	//  139  275:iconst_1        
	//  140  276:putfield        #198 <Field boolean _tokenIncomplete>
			_nextToken = JsonToken.VALUE_STRING;
	//  141  279:aload_0         
	//  142  280:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//  143  283:putfield        #204 <Field JsonToken _nextToken>
			return _currToken;
	//  144  286:aload_0         
	//  145  287:getfield        #189 <Field JsonToken _currToken>
	//  146  290:areturn         
		}
		i;
	//  147  291:iload_1         
		JVM INSTR lookupswitch 16: default 432
	//	               45: 448
	//	               48: 456
	//	               49: 456
	//	               50: 456
	//	               51: 456
	//	               52: 456
	//	               53: 456
	//	               54: 456
	//	               55: 456
	//	               56: 456
	//	               57: 456
	//	               91: 507
	//	               102: 465
	//	               110: 479
	//	               116: 493
	//	               123: 514;
	//  148  292:lookupswitch    16: default 432
	//	               45: 448
	//	               48: 456
	//	               49: 456
	//	               50: 456
	//	               51: 456
	//	               52: 456
	//	               53: 456
	//	               54: 456
	//	               55: 456
	//	               56: 456
	//	               57: 456
	//	               91: 507
	//	               102: 465
	//	               110: 479
	//	               116: 493
	//	               123: 514
		   goto _L1 _L2 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		JsonToken jsontoken2 = _handleUnexpectedValue(i);
	//  149  432:aload_0         
	//  150  433:iload_1         
	//  151  434:invokevirtual   #208 <Method JsonToken _handleUnexpectedValue(int)>
	//  152  437:astore_3        
_L10:
		_nextToken = jsontoken2;
	//  153  438:aload_0         
	//  154  439:aload_3         
	//  155  440:putfield        #204 <Field JsonToken _nextToken>
		return _currToken;
	//  156  443:aload_0         
	//  157  444:getfield        #189 <Field JsonToken _currToken>
	//  158  447:areturn         
_L2:
		jsontoken2 = _parseNegNumber();
	//  159  448:aload_0         
	//  160  449:invokevirtual   #237 <Method JsonToken _parseNegNumber()>
	//  161  452:astore_3        
		continue; /* Loop/switch isn't completed */
	//  162  453:goto            438
_L3:
		jsontoken2 = _parsePosNumber(i);
	//  163  456:aload_0         
	//  164  457:iload_1         
	//  165  458:invokevirtual   #240 <Method JsonToken _parsePosNumber(int)>
	//  166  461:astore_3        
		continue; /* Loop/switch isn't completed */
	//  167  462:goto            438
_L5:
		_matchToken("false", 1);
	//  168  465:aload_0         
	//  169  466:ldc1            #225 <String "false">
	//  170  468:iconst_1        
	//  171  469:invokevirtual   #220 <Method void _matchToken(String, int)>
		jsontoken2 = JsonToken.VALUE_FALSE;
	//  172  472:getstatic       #228 <Field JsonToken JsonToken.VALUE_FALSE>
	//  173  475:astore_3        
		continue; /* Loop/switch isn't completed */
	//  174  476:goto            438
_L6:
		_matchToken("null", 1);
	//  175  479:aload_0         
	//  176  480:ldc1            #230 <String "null">
	//  177  482:iconst_1        
	//  178  483:invokevirtual   #220 <Method void _matchToken(String, int)>
		jsontoken2 = JsonToken.VALUE_NULL;
	//  179  486:getstatic       #233 <Field JsonToken JsonToken.VALUE_NULL>
	//  180  489:astore_3        
		continue; /* Loop/switch isn't completed */
	//  181  490:goto            438
_L7:
		_matchToken("true", 1);
	//  182  493:aload_0         
	//  183  494:ldc1            #216 <String "true">
	//  184  496:iconst_1        
	//  185  497:invokevirtual   #220 <Method void _matchToken(String, int)>
		jsontoken2 = JsonToken.VALUE_TRUE;
	//  186  500:getstatic       #223 <Field JsonToken JsonToken.VALUE_TRUE>
	//  187  503:astore_3        
		continue; /* Loop/switch isn't completed */
	//  188  504:goto            438
_L4:
		jsontoken2 = JsonToken.START_ARRAY;
	//  189  507:getstatic       #211 <Field JsonToken JsonToken.START_ARRAY>
	//  190  510:astore_3        
		continue; /* Loop/switch isn't completed */
	//  191  511:goto            438
_L8:
		jsontoken2 = JsonToken.START_OBJECT;
	//  192  514:getstatic       #214 <Field JsonToken JsonToken.START_OBJECT>
	//  193  517:astore_3        
		if(true) goto _L10; else goto _L9
	//  194  518:goto            438
_L9:
	}

	protected final String parseEscapedName(int ai[], int i, int j, int k, int l)
		throws IOException
	{
		int ai5[] = _icLatin1;
	//    0    0:getstatic       #42  <Field int[] _icLatin1>
	//    1    3:astore          8
_L2:
		int i1;
		i1 = k;
	//    2    5:iload           4
	//    3    7:istore          6
		if(ai5[k] == 0)
			break; /* Loop/switch isn't completed */
	//    4    9:aload           8
	//    5   11:iload           4
	//    6   13:iaload          
	//    7   14:ifeq            496
		if(k == 34)
	//*   8   17:iload           4
	//*   9   19:bipush          34
	//*  10   21:icmpne          107
		{
			int ai1[] = ai;
	//   11   24:aload_1         
	//   12   25:astore          7
			k = i;
	//   13   27:iload_2         
	//   14   28:istore          4
			if(l > 0)
	//*  15   30:iload           5
	//*  16   32:ifle            73
			{
				ai1 = ai;
	//   17   35:aload_1         
	//   18   36:astore          7
				if(i >= ai.length)
	//*  19   38:iload_2         
	//*  20   39:aload_1         
	//*  21   40:arraylength     
	//*  22   41:icmplt          58
				{
					ai1 = growArrayBy(ai, ai.length);
	//   23   44:aload_1         
	//   24   45:aload_1         
	//   25   46:arraylength     
	//   26   47:invokestatic    #464 <Method int[] growArrayBy(int[], int)>
	//   27   50:astore          7
					_quadBuffer = ai1;
	//   28   52:aload_0         
	//   29   53:aload           7
	//   30   55:putfield        #50  <Field int[] _quadBuffer>
				}
				ai1[i] = pad(j, l);
	//   31   58:aload           7
	//   32   60:iload_2         
	//   33   61:iload_3         
	//   34   62:iload           5
	//   35   64:invokestatic    #449 <Method int pad(int, int)>
	//   36   67:iastore         
				k = i + 1;
	//   37   68:iload_2         
	//   38   69:iconst_1        
	//   39   70:iadd            
	//   40   71:istore          4
			}
			String s = _symbols.findName(ai1, k);
	//   41   73:aload_0         
	//   42   74:getfield        #56  <Field ByteQuadsCanonicalizer _symbols>
	//   43   77:aload           7
	//   44   79:iload           4
	//   45   81:invokevirtual   #467 <Method String ByteQuadsCanonicalizer.findName(int[], int)>
	//   46   84:astore          8
			ai = ((int []) (s));
	//   47   86:aload           8
	//   48   88:astore_1        
			if(s == null)
	//*  49   89:aload           8
	//*  50   91:ifnonnull       105
				ai = ((int []) (addName(ai1, k, l)));
	//   51   94:aload_0         
	//   52   95:aload           7
	//   53   97:iload           4
	//   54   99:iload           5
	//   55  101:invokespecial   #453 <Method String addName(int[], int, int)>
	//   56  104:astore_1        
			return ((String) (ai));
	//   57  105:aload_1         
	//   58  106:areturn         
		}
		byte abyte0[];
		if(k != 92)
	//*  59  107:iload           4
	//*  60  109:bipush          92
	//*  61  111:icmpeq          321
			_throwUnquotedSpace(k, "name");
	//   62  114:aload_0         
	//   63  115:iload           4
	//   64  117:ldc2            #688 <String "name">
	//   65  120:invokevirtual   #138 <Method void _throwUnquotedSpace(int, String)>
		else
	//*  66  123:iload           4
	//*  67  125:istore          6
	//*  68  127:iload           4
	//*  69  129:bipush          127
	//*  70  131:icmple          496
	//*  71  134:iload           5
	//*  72  136:iconst_4        
	//*  73  137:icmplt          493
	//*  74  140:aload_1         
	//*  75  141:astore          7
	//*  76  143:iload_2         
	//*  77  144:aload_1         
	//*  78  145:arraylength     
	//*  79  146:icmplt          163
	//*  80  149:aload_1         
	//*  81  150:aload_1         
	//*  82  151:arraylength     
	//*  83  152:invokestatic    #464 <Method int[] growArrayBy(int[], int)>
	//*  84  155:astore          7
	//*  85  157:aload_0         
	//*  86  158:aload           7
	//*  87  160:putfield        #50  <Field int[] _quadBuffer>
	//*  88  163:iload_2         
	//*  89  164:iconst_1        
	//*  90  165:iadd            
	//*  91  166:istore          6
	//*  92  168:aload           7
	//*  93  170:iload_2         
	//*  94  171:iload_3         
	//*  95  172:iastore         
	//*  96  173:iconst_0        
	//*  97  174:istore_3        
	//*  98  175:iconst_0        
	//*  99  176:istore          5
	//* 100  178:aload           7
	//* 101  180:astore_1        
	//* 102  181:iload           6
	//* 103  183:istore_2        
	//* 104  184:iload           4
	//* 105  186:sipush          2048
	//* 106  189:icmpge          330
	//* 107  192:iload_3         
	//* 108  193:bipush          8
	//* 109  195:ishl            
	//* 110  196:iload           4
	//* 111  198:bipush          6
	//* 112  200:ishr            
	//* 113  201:sipush          192
	//* 114  204:ior             
	//* 115  205:ior             
	//* 116  206:istore          6
	//* 117  208:iload           5
	//* 118  210:iconst_1        
	//* 119  211:iadd            
	//* 120  212:istore_3        
	//* 121  213:iload_2         
	//* 122  214:istore          5
	//* 123  216:iload           6
	//* 124  218:istore_2        
	//* 125  219:iload           4
	//* 126  221:bipush          63
	//* 127  223:iand            
	//* 128  224:sipush          128
	//* 129  227:ior             
	//* 130  228:istore          4
	//* 131  230:iload_3         
	//* 132  231:istore          6
	//* 133  233:iload           4
	//* 134  235:istore_3        
	//* 135  236:iload_2         
	//* 136  237:istore          4
	//* 137  239:iload           5
	//* 138  241:istore_2        
	//* 139  242:iload           6
	//* 140  244:iconst_4        
	//* 141  245:icmpge          434
	//* 142  248:iload           6
	//* 143  250:iconst_1        
	//* 144  251:iadd            
	//* 145  252:istore          5
	//* 146  254:iload           4
	//* 147  256:bipush          8
	//* 148  258:ishl            
	//* 149  259:iload_3         
	//* 150  260:ior             
	//* 151  261:istore_3        
	//* 152  262:aload_0         
	//* 153  263:getfield        #61  <Field int _inputPtr>
	//* 154  266:aload_0         
	//* 155  267:getfield        #64  <Field int _inputEnd>
	//* 156  270:icmplt          287
	//* 157  273:aload_0         
	//* 158  274:invokevirtual   #249 <Method boolean loadMore()>
	//* 159  277:ifne            287
	//* 160  280:aload_0         
	//* 161  281:ldc2            #429 <String " in field name">
	//* 162  284:invokevirtual   #309 <Method void _reportInvalidEOF(String)>
	//* 163  287:aload_0         
	//* 164  288:getfield        #58  <Field byte[] _inputBuffer>
	//* 165  291:astore          7
	//* 166  293:aload_0         
	//* 167  294:getfield        #61  <Field int _inputPtr>
	//* 168  297:istore          4
	//* 169  299:aload_0         
	//* 170  300:iload           4
	//* 171  302:iconst_1        
	//* 172  303:iadd            
	//* 173  304:putfield        #61  <Field int _inputPtr>
	//* 174  307:aload           7
	//* 175  309:iload           4
	//* 176  311:baload          
	//* 177  312:sipush          255
	//* 178  315:iand            
	//* 179  316:istore          4
	//* 180  318:goto            5
			k = ((int) (_decodeEscaped()));
	//  181  321:aload_0         
	//  182  322:invokevirtual   #142 <Method char _decodeEscaped()>
	//  183  325:istore          4
		i1 = k;
		if(k <= 127)
			break; /* Loop/switch isn't completed */
		if(l >= 4)
		{
			int ai2[] = ai;
			if(i >= ai.length)
			{
				ai2 = growArrayBy(ai, ai.length);
				_quadBuffer = ai2;
			}
			i1 = i + 1;
			ai2[i] = j;
			j = 0;
			l = 0;
			ai = ai2;
			i = i1;
		}
		if(k < 2048)
		{
			i1 = j << 8 | (k >> 6 | 0xc0);
			j = l + 1;
			l = i;
			i = i1;
		} else
	//* 184  327:goto            123
		{
			j = j << 8 | (k >> 12 | 0xe0);
	//  185  330:iload_3         
	//  186  331:bipush          8
	//  187  333:ishl            
	//  188  334:iload           4
	//  189  336:bipush          12
	//  190  338:ishr            
	//  191  339:sipush          224
	//  192  342:ior             
	//  193  343:ior             
	//  194  344:istore_3        
			i1 = l + 1;
	//  195  345:iload           5
	//  196  347:iconst_1        
	//  197  348:iadd            
	//  198  349:istore          6
			int ai4[];
			if(i1 >= 4)
	//* 199  351:iload           6
	//* 200  353:iconst_4        
	//* 201  354:icmplt          484
			{
				int ai3[] = ai;
	//  202  357:aload_1         
	//  203  358:astore          7
				if(i >= ai.length)
	//* 204  360:iload_2         
	//* 205  361:aload_1         
	//* 206  362:arraylength     
	//* 207  363:icmplt          380
				{
					ai3 = growArrayBy(ai, ai.length);
	//  208  366:aload_1         
	//  209  367:aload_1         
	//  210  368:arraylength     
	//  211  369:invokestatic    #464 <Method int[] growArrayBy(int[], int)>
	//  212  372:astore          7
					_quadBuffer = ai3;
	//  213  374:aload_0         
	//  214  375:aload           7
	//  215  377:putfield        #50  <Field int[] _quadBuffer>
				}
				i1 = i + 1;
	//  216  380:iload_2         
	//  217  381:iconst_1        
	//  218  382:iadd            
	//  219  383:istore          6
				ai3[i] = j;
	//  220  385:aload           7
	//  221  387:iload_2         
	//  222  388:iload_3         
	//  223  389:iastore         
				l = 0;
	//  224  390:iconst_0        
	//  225  391:istore          5
				j = 0;
	//  226  393:iconst_0        
	//  227  394:istore_3        
				i = i1;
	//  228  395:iload           6
	//  229  397:istore_2        
				ai = ai3;
	//  230  398:aload           7
	//  231  400:astore_1        
			} else
	//* 232  401:iload           5
	//* 233  403:bipush          8
	//* 234  405:ishl            
	//* 235  406:iload           4
	//* 236  408:bipush          6
	//* 237  410:ishr            
	//* 238  411:bipush          63
	//* 239  413:iand            
	//* 240  414:sipush          128
	//* 241  417:ior             
	//* 242  418:ior             
	//* 243  419:istore          6
	//* 244  421:iload_3         
	//* 245  422:iconst_1        
	//* 246  423:iadd            
	//* 247  424:istore_3        
	//* 248  425:iload_2         
	//* 249  426:istore          5
	//* 250  428:iload           6
	//* 251  430:istore_2        
	//* 252  431:goto            219
	//* 253  434:aload_1         
	//* 254  435:astore          7
	//* 255  437:iload_2         
	//* 256  438:aload_1         
	//* 257  439:arraylength     
	//* 258  440:icmplt          457
	//* 259  443:aload_1         
	//* 260  444:aload_1         
	//* 261  445:arraylength     
	//* 262  446:invokestatic    #464 <Method int[] growArrayBy(int[], int)>
	//* 263  449:astore          7
	//* 264  451:aload_0         
	//* 265  452:aload           7
	//* 266  454:putfield        #50  <Field int[] _quadBuffer>
	//* 267  457:iload_2         
	//* 268  458:iconst_1        
	//* 269  459:iadd            
	//* 270  460:istore          5
	//* 271  462:aload           7
	//* 272  464:iload_2         
	//* 273  465:iload           4
	//* 274  467:iastore         
	//* 275  468:iconst_1        
	//* 276  469:istore          4
	//* 277  471:aload           7
	//* 278  473:astore_1        
	//* 279  474:iload           5
	//* 280  476:istore_2        
	//* 281  477:iload           4
	//* 282  479:istore          5
	//* 283  481:goto            262
			{
				l = j;
	//  284  484:iload_3         
	//  285  485:istore          5
				j = i1;
	//  286  487:iload           6
	//  287  489:istore_3        
			}
			i1 = l << 8 | (k >> 6 & 0x3f | 0x80);
			j++;
			l = i;
			i = i1;
		}
		k = k & 0x3f | 0x80;
		i1 = j;
		j = k;
		k = i;
		i = l;
_L3:
		if(i1 < 4)
		{
			l = i1 + 1;
			j = k << 8 | j;
		} else
		{
			ai4 = ai;
			if(i >= ai.length)
			{
				ai4 = growArrayBy(ai, ai.length);
				_quadBuffer = ai4;
			}
			l = i + 1;
			ai4[i] = k;
			k = 1;
			ai = ai4;
			i = l;
			l = k;
		}
		if(_inputPtr >= _inputEnd && !loadMore())
			_reportInvalidEOF(" in field name");
		abyte0 = _inputBuffer;
		k = _inputPtr;
		_inputPtr = k + 1;
		k = abyte0[k] & 0xff;
		if(true) goto _L2; else goto _L1
	//* 288  490:goto            401
	//* 289  493:goto            184
_L1:
		k = j;
	//  290  496:iload_3         
	//  291  497:istore          4
		j = i1;
	//  292  499:iload           6
	//  293  501:istore_3        
		i1 = l;
	//  294  502:iload           5
	//  295  504:istore          6
		  goto _L3
		if(true) goto _L2; else goto _L4
_L4:
	//* 296  506:goto            242
	}

	protected final String parseLongName(int i, int j, int k)
		throws IOException
	{
		_quadBuffer[0] = _quad1;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int[] _quadBuffer>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:getfield        #695 <Field int _quad1>
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
	//   61   96:invokespecial   #926 <Method String findName(int[], int, int, int)>
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
	//   70  109:invokevirtual   #478 <Method String parseEscapedName(int[], int, int, int, int)>
	//   71  112:areturn         
			j = j << 8 | k;
	//   72  113:iload_2         
	//   73  114:bipush          8
	//   74  116:ishl            
	//   75  117:iload_3         
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
	//  105  162:invokespecial   #926 <Method String findName(int[], int, int, int)>
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
	//  114  175:invokevirtual   #478 <Method String parseEscapedName(int[], int, int, int, int)>
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
	//  149  228:invokespecial   #926 <Method String findName(int[], int, int, int)>
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
	//  158  241:invokevirtual   #478 <Method String parseEscapedName(int[], int, int, int, int)>
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
	//  193  294:invokespecial   #926 <Method String findName(int[], int, int, int)>
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
	//  202  307:invokevirtual   #478 <Method String parseEscapedName(int[], int, int, int, int)>
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
	//  213  326:invokestatic    #464 <Method int[] growArrayBy(int[], int)>
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
	//  232  355:invokevirtual   #478 <Method String parseEscapedName(int[], int, int, int, int)>
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
	//   28   45:getfield        #695 <Field int _quad1>
	//   29   48:iload_1         
	//   30   49:iconst_1        
	//   31   50:invokespecial   #927 <Method String findName(int, int, int)>
	//   32   53:areturn         
			else
				return parseName(_quad1, i, j, 1);
	//   33   54:aload_0         
	//   34   55:aload_0         
	//   35   56:getfield        #695 <Field int _quad1>
	//   36   59:iload_1         
	//   37   60:iload_2         
	//   38   61:iconst_1        
	//   39   62:invokespecial   #929 <Method String parseName(int, int, int, int)>
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
	//   70  108:getfield        #695 <Field int _quad1>
	//   71  111:iload_1         
	//   72  112:iconst_2        
	//   73  113:invokespecial   #927 <Method String findName(int, int, int)>
	//   74  116:areturn         
			else
				return parseName(_quad1, i, j, 2);
	//   75  117:aload_0         
	//   76  118:aload_0         
	//   77  119:getfield        #695 <Field int _quad1>
	//   78  122:iload_1         
	//   79  123:iload_2         
	//   80  124:iconst_2        
	//   81  125:invokespecial   #929 <Method String parseName(int, int, int, int)>
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
	//  112  171:getfield        #695 <Field int _quad1>
	//  113  174:iload_1         
	//  114  175:iconst_3        
	//  115  176:invokespecial   #927 <Method String findName(int, int, int)>
	//  116  179:areturn         
			else
				return parseName(_quad1, i, j, 3);
	//  117  180:aload_0         
	//  118  181:aload_0         
	//  119  182:getfield        #695 <Field int _quad1>
	//  120  185:iload_1         
	//  121  186:iload_2         
	//  122  187:iconst_3        
	//  123  188:invokespecial   #929 <Method String parseName(int, int, int, int)>
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
	//  154  234:getfield        #695 <Field int _quad1>
	//  155  237:iload_1         
	//  156  238:iconst_4        
	//  157  239:invokespecial   #927 <Method String findName(int, int, int)>
	//  158  242:areturn         
			else
				return parseName(_quad1, i, j, 4);
	//  159  243:aload_0         
	//  160  244:aload_0         
	//  161  245:getfield        #695 <Field int _quad1>
	//  162  248:iload_1         
	//  163  249:iload_2         
	//  164  250:iconst_4        
	//  165  251:invokespecial   #929 <Method String parseName(int, int, int, int)>
	//  166  254:areturn         
		} else
		{
			return parseMediumName2(j, i);
	//  167  255:aload_0         
	//  168  256:iload_2         
	//  169  257:iload_1         
	//  170  258:invokevirtual   #932 <Method String parseMediumName2(int, int)>
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
	//   28   47:getfield        #695 <Field int _quad1>
	//   29   50:iload_2         
	//   30   51:iload_1         
	//   31   52:iconst_1        
	//   32   53:invokespecial   #934 <Method String findName(int, int, int, int)>
	//   33   56:areturn         
			else
				return parseName(_quad1, j, i, k, 1);
	//   34   57:aload_0         
	//   35   58:aload_0         
	//   36   59:getfield        #695 <Field int _quad1>
	//   37   62:iload_2         
	//   38   63:iload_1         
	//   39   64:iload_3         
	//   40   65:iconst_1        
	//   41   66:invokespecial   #936 <Method String parseName(int, int, int, int, int)>
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
	//   72  113:getfield        #695 <Field int _quad1>
	//   73  116:iload_2         
	//   74  117:iload_1         
	//   75  118:iconst_2        
	//   76  119:invokespecial   #934 <Method String findName(int, int, int, int)>
	//   77  122:areturn         
			else
				return parseName(_quad1, j, i, k, 2);
	//   78  123:aload_0         
	//   79  124:aload_0         
	//   80  125:getfield        #695 <Field int _quad1>
	//   81  128:iload_2         
	//   82  129:iload_1         
	//   83  130:iload_3         
	//   84  131:iconst_2        
	//   85  132:invokespecial   #936 <Method String parseName(int, int, int, int, int)>
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
	//  116  179:getfield        #695 <Field int _quad1>
	//  117  182:iload_2         
	//  118  183:iload_1         
	//  119  184:iconst_3        
	//  120  185:invokespecial   #934 <Method String findName(int, int, int, int)>
	//  121  188:areturn         
			else
				return parseName(_quad1, j, i, k, 3);
	//  122  189:aload_0         
	//  123  190:aload_0         
	//  124  191:getfield        #695 <Field int _quad1>
	//  125  194:iload_2         
	//  126  195:iload_1         
	//  127  196:iload_3         
	//  128  197:iconst_3        
	//  129  198:invokespecial   #936 <Method String parseName(int, int, int, int, int)>
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
	//  160  245:getfield        #695 <Field int _quad1>
	//  161  248:iload_2         
	//  162  249:iload_1         
	//  163  250:iconst_4        
	//  164  251:invokespecial   #934 <Method String findName(int, int, int, int)>
	//  165  254:areturn         
			else
				return parseName(_quad1, j, i, k, 4);
	//  166  255:aload_0         
	//  167  256:aload_0         
	//  168  257:getfield        #695 <Field int _quad1>
	//  169  260:iload_2         
	//  170  261:iload_1         
	//  171  262:iload_3         
	//  172  263:iconst_4        
	//  173  264:invokespecial   #936 <Method String parseName(int, int, int, int, int)>
	//  174  267:areturn         
		} else
		{
			return parseLongName(k, j, i);
	//  175  268:aload_0         
	//  176  269:iload_3         
	//  177  270:iload_2         
	//  178  271:iload_1         
	//  179  272:invokevirtual   #938 <Method String parseLongName(int, int, int)>
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
	//*   2    4:ifeq            17
	//*   3    7:aload_0         
	//*   4    8:getfield        #189 <Field JsonToken _currToken>
	//*   5   11:getstatic       #201 <Field JsonToken JsonToken.VALUE_STRING>
	//*   6   14:if_acmpeq       31
		{
			base64variant = ((Base64Variant) (getBinaryValue(base64variant)));
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:invokevirtual   #942 <Method byte[] getBinaryValue(Base64Variant)>
	//   10   22:astore_1        
			outputstream.write(((byte []) (base64variant)));
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #944 <Method void OutputStream.write(byte[])>
			return base64variant.length;
	//   14   28:aload_1         
	//   15   29:arraylength     
	//   16   30:ireturn         
		}
		abyte0 = _ioContext.allocBase64Buffer();
	//   17   31:aload_0         
	//   18   32:getfield        #484 <Field IOContext _ioContext>
	//   19   35:invokevirtual   #947 <Method byte[] IOContext.allocBase64Buffer()>
	//   20   38:astore          4
		int i = _readBinary(base64variant, outputstream, abyte0);
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:aload_2         
	//   24   43:aload           4
	//   25   45:invokevirtual   #949 <Method int _readBinary(Base64Variant, OutputStream, byte[])>
	//   26   48:istore_3        
		_ioContext.releaseBase64Buffer(abyte0);
	//   27   49:aload_0         
	//   28   50:getfield        #484 <Field IOContext _ioContext>
	//   29   53:aload           4
	//   30   55:invokevirtual   #952 <Method void IOContext.releaseBase64Buffer(byte[])>
		return i;
	//   31   58:iload_3         
	//   32   59:ireturn         
		base64variant;
	//   33   60:astore_1        
		_ioContext.releaseBase64Buffer(abyte0);
	//   34   61:aload_0         
	//   35   62:getfield        #484 <Field IOContext _ioContext>
	//   36   65:aload           4
	//   37   67:invokevirtual   #952 <Method void IOContext.releaseBase64Buffer(byte[])>
		throw base64variant;
	//   38   70:aload_1         
	//   39   71:athrow          
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
	//   19   29:invokevirtual   #713 <Method void OutputStream.write(byte[], int, int)>
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
		if(_inputPtr >= _inputEnd && !loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int _inputEnd>
	//*   4    8:icmplt          25
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #249 <Method boolean loadMore()>
	//*   7   15:ifne            25
			_reportInvalidEOF(": was expecting closing '\"' for name");
	//    8   18:aload_0         
	//    9   19:ldc2            #958 <String ": was expecting closing '\"' for name">
	//   10   22:invokevirtual   #309 <Method void _reportInvalidEOF(String)>
		byte abyte0[] = _inputBuffer;
	//   11   25:aload_0         
	//   12   26:getfield        #58  <Field byte[] _inputBuffer>
	//   13   29:astore_2        
		int i = _inputPtr;
	//   14   30:aload_0         
	//   15   31:getfield        #61  <Field int _inputPtr>
	//   16   34:istore_1        
		_inputPtr = i + 1;
	//   17   35:aload_0         
	//   18   36:iload_1         
	//   19   37:iconst_1        
	//   20   38:iadd            
	//   21   39:putfield        #61  <Field int _inputPtr>
		i = abyte0[i] & 0xff;
	//   22   42:aload_2         
	//   23   43:iload_1         
	//   24   44:baload          
	//   25   45:sipush          255
	//   26   48:iand            
	//   27   49:istore_1        
		if(i == 34)
	//*  28   50:iload_1         
	//*  29   51:bipush          34
	//*  30   53:icmpne          60
			return "";
	//   31   56:ldc2            #637 <String "">
	//   32   59:areturn         
		else
			return parseEscapedName(_quadBuffer, 0, 0, i, 0);
	//   33   60:aload_0         
	//   34   61:aload_0         
	//   35   62:getfield        #50  <Field int[] _quadBuffer>
	//   36   65:iconst_0        
	//   37   66:iconst_0        
	//   38   67:iload_1         
	//   39   68:iconst_0        
	//   40   69:invokevirtual   #478 <Method String parseEscapedName(int[], int, int, int, int)>
	//   41   72:areturn         
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
