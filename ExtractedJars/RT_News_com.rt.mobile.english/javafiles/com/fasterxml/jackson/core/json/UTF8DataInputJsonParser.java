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

public class UTF8DataInputJsonParser extends ParserBase
{

	public UTF8DataInputJsonParser(IOContext iocontext, int i, DataInput datainput, ObjectCodec objectcodec, ByteQuadsCanonicalizer bytequadscanonicalizer, int j)
	{
		super(iocontext, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #43  <Method void ParserBase(IOContext, int)>
		_quadBuffer = new int[16];
	//    4    6:aload_0         
	//    5    7:bipush          16
	//    6    9:newarray        int[]
	//    7   11:putfield        #45  <Field int[] _quadBuffer>
		_nextByte = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #47  <Field int _nextByte>
		_objectCodec = objectcodec;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #49  <Field ObjectCodec _objectCodec>
		_symbols = bytequadscanonicalizer;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #51  <Field ByteQuadsCanonicalizer _symbols>
		_inputData = datainput;
	//   17   31:aload_0         
	//   18   32:aload_3         
	//   19   33:putfield        #53  <Field DataInput _inputData>
		_nextByte = j;
	//   20   36:aload_0         
	//   21   37:iload           6
	//   22   39:putfield        #47  <Field int _nextByte>
	//   23   42:return          
	}

	private final void _checkMatchEnd(String s, int i, int j)
		throws IOException
	{
		char c = (char)_decodeCharForError(j);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #61  <Method int _decodeCharForError(int)>
	//    3    5:int2char        
	//    4    6:istore          4
		if(Character.isJavaIdentifierPart(c))
	//*   5    8:iload           4
	//*   6   10:invokestatic    #67  <Method boolean Character.isJavaIdentifierPart(char)>
	//*   7   13:ifeq            28
			_reportInvalidToken(((int) (c)), s.substring(0, i));
	//    8   16:aload_0         
	//    9   17:iload           4
	//   10   19:aload_1         
	//   11   20:iconst_0        
	//   12   21:iload_2         
	//   13   22:invokevirtual   #73  <Method String String.substring(int, int)>
	//   14   25:invokevirtual   #77  <Method void _reportInvalidToken(int, String)>
	//   15   28:return          
	}

	private final int _decodeUtf8_2(int i)
		throws IOException
	{
		int j = _inputData.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field DataInput _inputData>
	//    2    4:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//    3    9:istore_2        
		if((j & 0xc0) != 128)
	//*   4   10:iload_2         
	//*   5   11:sipush          192
	//*   6   14:iand            
	//*   7   15:sipush          128
	//*   8   18:icmpeq          30
			_reportInvalidOther(j & 0xff);
	//    9   21:aload_0         
	//   10   22:iload_2         
	//   11   23:sipush          255
	//   12   26:iand            
	//   13   27:invokespecial   #89  <Method void _reportInvalidOther(int)>
		return (i & 0x1f) << 6 | j & 0x3f;
	//   14   30:iload_1         
	//   15   31:bipush          31
	//   16   33:iand            
	//   17   34:bipush          6
	//   18   36:ishl            
	//   19   37:iload_2         
	//   20   38:bipush          63
	//   21   40:iand            
	//   22   41:ior             
	//   23   42:ireturn         
	}

	private final int _decodeUtf8_3(int i)
		throws IOException
	{
		int j = _inputData.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field DataInput _inputData>
	//    2    4:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//    3    9:istore_2        
		if((j & 0xc0) != 128)
	//*   4   10:iload_2         
	//*   5   11:sipush          192
	//*   6   14:iand            
	//*   7   15:sipush          128
	//*   8   18:icmpeq          30
			_reportInvalidOther(j & 0xff);
	//    9   21:aload_0         
	//   10   22:iload_2         
	//   11   23:sipush          255
	//   12   26:iand            
	//   13   27:invokespecial   #89  <Method void _reportInvalidOther(int)>
		int k = _inputData.readUnsignedByte();
	//   14   30:aload_0         
	//   15   31:getfield        #53  <Field DataInput _inputData>
	//   16   34:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   17   39:istore_3        
		if((k & 0xc0) != 128)
	//*  18   40:iload_3         
	//*  19   41:sipush          192
	//*  20   44:iand            
	//*  21   45:sipush          128
	//*  22   48:icmpeq          60
			_reportInvalidOther(k & 0xff);
	//   23   51:aload_0         
	//   24   52:iload_3         
	//   25   53:sipush          255
	//   26   56:iand            
	//   27   57:invokespecial   #89  <Method void _reportInvalidOther(int)>
		return ((i & 0xf) << 6 | j & 0x3f) << 6 | k & 0x3f;
	//   28   60:iload_1         
	//   29   61:bipush          15
	//   30   63:iand            
	//   31   64:bipush          6
	//   32   66:ishl            
	//   33   67:iload_2         
	//   34   68:bipush          63
	//   35   70:iand            
	//   36   71:ior             
	//   37   72:bipush          6
	//   38   74:ishl            
	//   39   75:iload_3         
	//   40   76:bipush          63
	//   41   78:iand            
	//   42   79:ior             
	//   43   80:ireturn         
	}

	private final int _decodeUtf8_4(int i)
		throws IOException
	{
		int j = _inputData.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field DataInput _inputData>
	//    2    4:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//    3    9:istore_2        
		if((j & 0xc0) != 128)
	//*   4   10:iload_2         
	//*   5   11:sipush          192
	//*   6   14:iand            
	//*   7   15:sipush          128
	//*   8   18:icmpeq          30
			_reportInvalidOther(j & 0xff);
	//    9   21:aload_0         
	//   10   22:iload_2         
	//   11   23:sipush          255
	//   12   26:iand            
	//   13   27:invokespecial   #89  <Method void _reportInvalidOther(int)>
		int k = _inputData.readUnsignedByte();
	//   14   30:aload_0         
	//   15   31:getfield        #53  <Field DataInput _inputData>
	//   16   34:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   17   39:istore_3        
		if((k & 0xc0) != 128)
	//*  18   40:iload_3         
	//*  19   41:sipush          192
	//*  20   44:iand            
	//*  21   45:sipush          128
	//*  22   48:icmpeq          60
			_reportInvalidOther(k & 0xff);
	//   23   51:aload_0         
	//   24   52:iload_3         
	//   25   53:sipush          255
	//   26   56:iand            
	//   27   57:invokespecial   #89  <Method void _reportInvalidOther(int)>
		int l = _inputData.readUnsignedByte();
	//   28   60:aload_0         
	//   29   61:getfield        #53  <Field DataInput _inputData>
	//   30   64:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   31   69:istore          4
		if((l & 0xc0) != 128)
	//*  32   71:iload           4
	//*  33   73:sipush          192
	//*  34   76:iand            
	//*  35   77:sipush          128
	//*  36   80:icmpeq          93
			_reportInvalidOther(l & 0xff);
	//   37   83:aload_0         
	//   38   84:iload           4
	//   39   86:sipush          255
	//   40   89:iand            
	//   41   90:invokespecial   #89  <Method void _reportInvalidOther(int)>
		return ((((i & 7) << 6 | j & 0x3f) << 6 | k & 0x3f) << 6 | l & 0x3f) - 0x10000;
	//   42   93:iload_1         
	//   43   94:bipush          7
	//   44   96:iand            
	//   45   97:bipush          6
	//   46   99:ishl            
	//   47  100:iload_2         
	//   48  101:bipush          63
	//   49  103:iand            
	//   50  104:ior             
	//   51  105:bipush          6
	//   52  107:ishl            
	//   53  108:iload_3         
	//   54  109:bipush          63
	//   55  111:iand            
	//   56  112:ior             
	//   57  113:bipush          6
	//   58  115:ishl            
	//   59  116:iload           4
	//   60  118:bipush          63
	//   61  120:iand            
	//   62  121:ior             
	//   63  122:ldc1            #92  <Int 0x10000>
	//   64  124:isub            
	//   65  125:ireturn         
	}

	private String _finishAndReturnString()
		throws IOException
	{
		char ac[] = _textBuffer.emptyAndGetCurrentSegment();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #104 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//    3    7:astore          5
		int ai[] = _icUTF8;
	//    4    9:getstatic       #32  <Field int[] _icUTF8>
	//    5   12:astore          6
		int i = 0;
	//    6   14:iconst_0        
	//    7   15:istore_1        
		int k = ac.length;
	//    8   16:aload           5
	//    9   18:arraylength     
	//   10   19:istore_3        
		do
		{
			int l = _inputData.readUnsignedByte();
	//   11   20:aload_0         
	//   12   21:getfield        #53  <Field DataInput _inputData>
	//   13   24:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   14   29:istore          4
			if(ai[l] != 0)
	//*  15   31:aload           6
	//*  16   33:iload           4
	//*  17   35:iaload          
	//*  18   36:ifeq            72
				if(l == 34)
	//*  19   39:iload           4
	//*  20   41:bipush          34
	//*  21   43:icmpne          55
				{
					return _textBuffer.setCurrentAndReturn(i);
	//   22   46:aload_0         
	//   23   47:getfield        #98  <Field TextBuffer _textBuffer>
	//   24   50:iload_1         
	//   25   51:invokevirtual   #108 <Method String TextBuffer.setCurrentAndReturn(int)>
	//   26   54:areturn         
				} else
				{
					_finishString2(ac, i, l);
	//   27   55:aload_0         
	//   28   56:aload           5
	//   29   58:iload_1         
	//   30   59:iload           4
	//   31   61:invokespecial   #112 <Method void _finishString2(char[], int, int)>
					return _textBuffer.contentsAsString();
	//   32   64:aload_0         
	//   33   65:getfield        #98  <Field TextBuffer _textBuffer>
	//   34   68:invokevirtual   #115 <Method String TextBuffer.contentsAsString()>
	//   35   71:areturn         
				}
			int j = i + 1;
	//   36   72:iload_1         
	//   37   73:iconst_1        
	//   38   74:iadd            
	//   39   75:istore_2        
			ac[i] = (char)l;
	//   40   76:aload           5
	//   41   78:iload_1         
	//   42   79:iload           4
	//   43   81:int2char        
	//   44   82:castore         
			if(j >= k)
	//*  45   83:iload_2         
	//*  46   84:iload_3         
	//*  47   85:icmplt          112
			{
				_finishString2(ac, j, _inputData.readUnsignedByte());
	//   48   88:aload_0         
	//   49   89:aload           5
	//   50   91:iload_2         
	//   51   92:aload_0         
	//   52   93:getfield        #53  <Field DataInput _inputData>
	//   53   96:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   54  101:invokespecial   #112 <Method void _finishString2(char[], int, int)>
				return _textBuffer.contentsAsString();
	//   55  104:aload_0         
	//   56  105:getfield        #98  <Field TextBuffer _textBuffer>
	//   57  108:invokevirtual   #115 <Method String TextBuffer.contentsAsString()>
	//   58  111:areturn         
			}
			i = j;
	//   59  112:iload_2         
	//   60  113:istore_1        
		} while(true);
	//   61  114:goto            20
	}

	private final void _finishString2(char ac[], int i, int j)
		throws IOException
	{
		int ai[] = _icUTF8;
	//    0    0:getstatic       #32  <Field int[] _icUTF8>
	//    1    3:astore          8
		int l = ac.length;
	//    2    5:aload_1         
	//    3    6:arraylength     
	//    4    7:istore          5
		int k = i;
	//    5    9:iload_2         
	//    6   10:istore          4
		do
		{
			for(i = l; ai[j] == 0; i = l)
	//*   7   12:iload           5
	//*   8   14:istore_2        
	//*   9   15:aload           8
	//*  10   17:iload_3         
	//*  11   18:iaload          
	//*  12   19:ifne            78
			{
				l = i;
	//   13   22:iload_2         
	//   14   23:istore          5
				int i1 = k;
	//   15   25:iload           4
	//   16   27:istore          6
				if(k >= i)
	//*  17   29:iload           4
	//*  18   31:iload_2         
	//*  19   32:icmplt          50
				{
					ac = _textBuffer.finishCurrentSegment();
	//   20   35:aload_0         
	//   21   36:getfield        #98  <Field TextBuffer _textBuffer>
	//   22   39:invokevirtual   #118 <Method char[] TextBuffer.finishCurrentSegment()>
	//   23   42:astore_1        
					l = ac.length;
	//   24   43:aload_1         
	//   25   44:arraylength     
	//   26   45:istore          5
					i1 = 0;
	//   27   47:iconst_0        
	//   28   48:istore          6
				}
				k = i1 + 1;
	//   29   50:iload           6
	//   30   52:iconst_1        
	//   31   53:iadd            
	//   32   54:istore          4
				ac[i1] = (char)j;
	//   33   56:aload_1         
	//   34   57:iload           6
	//   35   59:iload_3         
	//   36   60:int2char        
	//   37   61:castore         
				j = _inputData.readUnsignedByte();
	//   38   62:aload_0         
	//   39   63:getfield        #53  <Field DataInput _inputData>
	//   40   66:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   41   71:istore_3        
			}

	//   42   72:iload           5
	//   43   74:istore_2        
	//*  44   75:goto            15
			if(j == 34)
	//*  45   78:iload_3         
	//*  46   79:bipush          34
	//*  47   81:icmpne          94
			{
				_textBuffer.setCurrentLength(k);
	//   48   84:aload_0         
	//   49   85:getfield        #98  <Field TextBuffer _textBuffer>
	//   50   88:iload           4
	//   51   90:invokevirtual   #121 <Method void TextBuffer.setCurrentLength(int)>
				return;
	//   52   93:return          
			}
			switch(ai[j])
	//*  53   94:aload           8
	//*  54   96:iload_3         
	//*  55   97:iaload          
			{
	//*  56   98:tableswitch     1 4: default 128
	//	               1 226
	//	               2 217
	//	               3 208
	//	               4 144
			default:
				if(j < 32)
	//*  57  128:iload_3         
	//*  58  129:bipush          32
	//*  59  131:icmpge          234
					_throwUnquotedSpace(j, "string value");
	//   60  134:aload_0         
	//   61  135:iload_3         
	//   62  136:ldc1            #123 <String "string value">
	//   63  138:invokevirtual   #126 <Method void _throwUnquotedSpace(int, String)>
				else
	//*  64  141:goto            239
	//*  65  144:aload_0         
	//*  66  145:iload_3         
	//*  67  146:invokespecial   #128 <Method int _decodeUtf8_4(int)>
	//*  68  149:istore          5
	//*  69  151:iload           4
	//*  70  153:iconst_1        
	//*  71  154:iadd            
	//*  72  155:istore_3        
	//*  73  156:aload_1         
	//*  74  157:iload           4
	//*  75  159:ldc1            #129 <Int 55296>
	//*  76  161:iload           5
	//*  77  163:bipush          10
	//*  78  165:ishr            
	//*  79  166:ior             
	//*  80  167:int2char        
	//*  81  168:castore         
	//*  82  169:iload_3         
	//*  83  170:aload_1         
	//*  84  171:arraylength     
	//*  85  172:icmplt          192
	//*  86  175:aload_0         
	//*  87  176:getfield        #98  <Field TextBuffer _textBuffer>
	//*  88  179:invokevirtual   #118 <Method char[] TextBuffer.finishCurrentSegment()>
	//*  89  182:astore_1        
	//*  90  183:aload_1         
	//*  91  184:arraylength     
	//*  92  185:istore_2        
	//*  93  186:iconst_0        
	//*  94  187:istore          4
	//*  95  189:goto            195
	//*  96  192:iload_3         
	//*  97  193:istore          4
	//*  98  195:iload           5
	//*  99  197:sipush          1023
	//* 100  200:iand            
	//* 101  201:ldc1            #130 <Int 56320>
	//* 102  203:ior             
	//* 103  204:istore_3        
	//* 104  205:goto            239
	//* 105  208:aload_0         
	//* 106  209:iload_3         
	//* 107  210:invokespecial   #132 <Method int _decodeUtf8_3(int)>
	//* 108  213:istore_3        
	//* 109  214:goto            239
	//* 110  217:aload_0         
	//* 111  218:iload_3         
	//* 112  219:invokespecial   #134 <Method int _decodeUtf8_2(int)>
	//* 113  222:istore_3        
	//* 114  223:goto            239
	//* 115  226:aload_0         
	//* 116  227:invokevirtual   #138 <Method char _decodeEscaped()>
	//* 117  230:istore_3        
	//* 118  231:goto            239
					_reportInvalidChar(j);
	//  119  234:aload_0         
	//  120  235:iload_3         
	//  121  236:invokevirtual   #141 <Method void _reportInvalidChar(int)>
				break;

			case 4: // '\004'
				l = _decodeUtf8_4(j);
				j = k + 1;
				ac[k] = (char)(0xd800 | l >> 10);
				if(j >= ac.length)
				{
					ac = _textBuffer.finishCurrentSegment();
					i = ac.length;
					k = 0;
				} else
				{
					k = j;
				}
				j = l & 0x3ff | 0xdc00;
				break;

			case 3: // '\003'
				j = _decodeUtf8_3(j);
				break;

			case 2: // '\002'
				j = _decodeUtf8_2(j);
				break;

			case 1: // '\001'
				j = ((int) (_decodeEscaped()));
				break;
			}
			char ac1[] = ac;
	//  122  239:aload_1         
	//  123  240:astore          7
			l = k;
	//  124  242:iload           4
	//  125  244:istore          5
			if(k >= ac.length)
	//* 126  246:iload           4
	//* 127  248:aload_1         
	//* 128  249:arraylength     
	//* 129  250:icmplt          269
			{
				ac1 = _textBuffer.finishCurrentSegment();
	//  130  253:aload_0         
	//  131  254:getfield        #98  <Field TextBuffer _textBuffer>
	//  132  257:invokevirtual   #118 <Method char[] TextBuffer.finishCurrentSegment()>
	//  133  260:astore          7
				i = ac1.length;
	//  134  262:aload           7
	//  135  264:arraylength     
	//  136  265:istore_2        
				l = 0;
	//  137  266:iconst_0        
	//  138  267:istore          5
			}
			k = l + 1;
	//  139  269:iload           5
	//  140  271:iconst_1        
	//  141  272:iadd            
	//  142  273:istore          4
			ac1[l] = (char)j;
	//  143  275:aload           7
	//  144  277:iload           5
	//  145  279:iload_3         
	//  146  280:int2char        
	//  147  281:castore         
			j = _inputData.readUnsignedByte();
	//  148  282:aload_0         
	//  149  283:getfield        #53  <Field DataInput _inputData>
	//  150  286:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//  151  291:istore_3        
			ac = ac1;
	//  152  292:aload           7
	//  153  294:astore_1        
		} while(true);
	//  154  295:goto            75
	}

	private static int[] _growArrayBy(int ai[], int i)
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
	//   10   13:invokestatic    #148 <Method int[] Arrays.copyOf(int[], int)>
	//   11   16:areturn         
	}

	private final int _handleLeadingZeroes()
		throws IOException
	{
		int j = _inputData.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field DataInput _inputData>
	//    2    4:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//    3    9:istore_2        
		if(j >= 48)
	//*   4   10:iload_2         
	//*   5   11:bipush          48
	//*   6   13:icmplt          65
		{
			if(j > 57)
	//*   7   16:iload_2         
	//*   8   17:bipush          57
	//*   9   19:icmple          24
				return j;
	//   10   22:iload_2         
	//   11   23:ireturn         
			int i = j;
	//   12   24:iload_2         
	//   13   25:istore_1        
			if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS))
	//*  14   26:aload_0         
	//*  15   27:getstatic       #155 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NUMERIC_LEADING_ZEROS>
	//*  16   30:invokevirtual   #159 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  17   33:ifne            44
			{
				reportInvalidNumber("Leading zeroes not allowed");
	//   18   36:aload_0         
	//   19   37:ldc1            #161 <String "Leading zeroes not allowed">
	//   20   39:invokevirtual   #165 <Method void reportInvalidNumber(String)>
				i = j;
	//   21   42:iload_2         
	//   22   43:istore_1        
			}
			for(; i == 48; i = _inputData.readUnsignedByte());
	//   23   44:iload_1         
	//   24   45:bipush          48
	//   25   47:icmpne          63
	//   26   50:aload_0         
	//   27   51:getfield        #53  <Field DataInput _inputData>
	//   28   54:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   29   59:istore_1        
	//*  30   60:goto            44
			return i;
	//   31   63:iload_1         
	//   32   64:ireturn         
		} else
		{
			return j;
	//   33   65:iload_2         
	//   34   66:ireturn         
		}
	}

	private final JsonToken _nextAfterName()
	{
		_nameCopied = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #170 <Field boolean _nameCopied>
		JsonToken jsontoken = _nextToken;
	//    3    5:aload_0         
	//    4    6:getfield        #174 <Field JsonToken _nextToken>
	//    5    9:astore_1        
		_nextToken = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #174 <Field JsonToken _nextToken>
		if(jsontoken == JsonToken.START_ARRAY)
	//*   9   15:aload_1         
	//*  10   16:getstatic       #179 <Field JsonToken JsonToken.START_ARRAY>
	//*  11   19:if_acmpne       44
			_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #183 <Field JsonReadContext _parsingContext>
	//   15   27:aload_0         
	//   16   28:getfield        #186 <Field int _tokenInputRow>
	//   17   31:aload_0         
	//   18   32:getfield        #189 <Field int _tokenInputCol>
	//   19   35:invokevirtual   #195 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   20   38:putfield        #183 <Field JsonReadContext _parsingContext>
		else
	//*  21   41:goto            70
		if(jsontoken == JsonToken.START_OBJECT)
	//*  22   44:aload_1         
	//*  23   45:getstatic       #198 <Field JsonToken JsonToken.START_OBJECT>
	//*  24   48:if_acmpne       70
			_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   25   51:aload_0         
	//   26   52:aload_0         
	//   27   53:getfield        #183 <Field JsonReadContext _parsingContext>
	//   28   56:aload_0         
	//   29   57:getfield        #186 <Field int _tokenInputRow>
	//   30   60:aload_0         
	//   31   61:getfield        #189 <Field int _tokenInputCol>
	//   32   64:invokevirtual   #201 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   33   67:putfield        #183 <Field JsonReadContext _parsingContext>
		_currToken = jsontoken;
	//   34   70:aload_0         
	//   35   71:aload_1         
	//   36   72:putfield        #204 <Field JsonToken _currToken>
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
	//    5    8:putfield        #208 <Field boolean _tokenIncomplete>
			JsonToken jsontoken = JsonToken.VALUE_STRING;
	//    6   11:getstatic       #211 <Field JsonToken JsonToken.VALUE_STRING>
	//    7   14:astore_2        
			_currToken = jsontoken;
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:putfield        #204 <Field JsonToken _currToken>
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
	//   35  114:invokevirtual   #214 <Method JsonToken _handleUnexpectedValue(int)>
	//   36  117:astore_2        
									_currToken = jsontoken1;
	//   37  118:aload_0         
	//   38  119:aload_2         
	//   39  120:putfield        #204 <Field JsonToken _currToken>
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
	//   44  127:invokevirtual   #217 <Method JsonToken _parsePosNumber(int)>
	//   45  130:astore_2        
									break;
								}
								_currToken = jsontoken2;
	//   46  131:aload_0         
	//   47  132:aload_2         
	//   48  133:putfield        #204 <Field JsonToken _currToken>
								return jsontoken2;
	//   49  136:aload_2         
	//   50  137:areturn         
							} else
							{
								_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   51  138:aload_0         
	//   52  139:aload_0         
	//   53  140:getfield        #183 <Field JsonReadContext _parsingContext>
	//   54  143:aload_0         
	//   55  144:getfield        #186 <Field int _tokenInputRow>
	//   56  147:aload_0         
	//   57  148:getfield        #189 <Field int _tokenInputCol>
	//   58  151:invokevirtual   #201 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   59  154:putfield        #183 <Field JsonReadContext _parsingContext>
								JsonToken jsontoken3 = JsonToken.START_OBJECT;
	//   60  157:getstatic       #198 <Field JsonToken JsonToken.START_OBJECT>
	//   61  160:astore_2        
								_currToken = jsontoken3;
	//   62  161:aload_0         
	//   63  162:aload_2         
	//   64  163:putfield        #204 <Field JsonToken _currToken>
								return jsontoken3;
	//   65  166:aload_2         
	//   66  167:areturn         
							}
						} else
						{
							_matchToken("true", 1);
	//   67  168:aload_0         
	//   68  169:ldc1            #219 <String "true">
	//   69  171:iconst_1        
	//   70  172:invokevirtual   #223 <Method void _matchToken(String, int)>
							JsonToken jsontoken4 = JsonToken.VALUE_TRUE;
	//   71  175:getstatic       #226 <Field JsonToken JsonToken.VALUE_TRUE>
	//   72  178:astore_2        
							_currToken = jsontoken4;
	//   73  179:aload_0         
	//   74  180:aload_2         
	//   75  181:putfield        #204 <Field JsonToken _currToken>
							return jsontoken4;
	//   76  184:aload_2         
	//   77  185:areturn         
						}
					} else
					{
						_matchToken("null", 1);
	//   78  186:aload_0         
	//   79  187:ldc1            #228 <String "null">
	//   80  189:iconst_1        
	//   81  190:invokevirtual   #223 <Method void _matchToken(String, int)>
						JsonToken jsontoken5 = JsonToken.VALUE_NULL;
	//   82  193:getstatic       #231 <Field JsonToken JsonToken.VALUE_NULL>
	//   83  196:astore_2        
						_currToken = jsontoken5;
	//   84  197:aload_0         
	//   85  198:aload_2         
	//   86  199:putfield        #204 <Field JsonToken _currToken>
						return jsontoken5;
	//   87  202:aload_2         
	//   88  203:areturn         
					}
				} else
				{
					_matchToken("false", 1);
	//   89  204:aload_0         
	//   90  205:ldc1            #233 <String "false">
	//   91  207:iconst_1        
	//   92  208:invokevirtual   #223 <Method void _matchToken(String, int)>
					JsonToken jsontoken6 = JsonToken.VALUE_FALSE;
	//   93  211:getstatic       #236 <Field JsonToken JsonToken.VALUE_FALSE>
	//   94  214:astore_2        
					_currToken = jsontoken6;
	//   95  215:aload_0         
	//   96  216:aload_2         
	//   97  217:putfield        #204 <Field JsonToken _currToken>
					return jsontoken6;
	//   98  220:aload_2         
	//   99  221:areturn         
				}
			} else
			{
				_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//  100  222:aload_0         
	//  101  223:aload_0         
	//  102  224:getfield        #183 <Field JsonReadContext _parsingContext>
	//  103  227:aload_0         
	//  104  228:getfield        #186 <Field int _tokenInputRow>
	//  105  231:aload_0         
	//  106  232:getfield        #189 <Field int _tokenInputCol>
	//  107  235:invokevirtual   #195 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//  108  238:putfield        #183 <Field JsonReadContext _parsingContext>
				JsonToken jsontoken7 = JsonToken.START_ARRAY;
	//  109  241:getstatic       #179 <Field JsonToken JsonToken.START_ARRAY>
	//  110  244:astore_2        
				_currToken = jsontoken7;
	//  111  245:aload_0         
	//  112  246:aload_2         
	//  113  247:putfield        #204 <Field JsonToken _currToken>
				return jsontoken7;
	//  114  250:aload_2         
	//  115  251:areturn         
			}
		} else
		{
			JsonToken jsontoken8 = _parseNegNumber();
	//  116  252:aload_0         
	//  117  253:invokevirtual   #239 <Method JsonToken _parseNegNumber()>
	//  118  256:astore_2        
			_currToken = jsontoken8;
	//  119  257:aload_0         
	//  120  258:aload_2         
	//  121  259:putfield        #204 <Field JsonToken _currToken>
			return jsontoken8;
	//  122  262:aload_2         
	//  123  263:areturn         
		}
	}

	private final JsonToken _parseFloat(char ac[], int i, int j, boolean flag, int k)
		throws IOException
	{
		int i1;
		int k1;
		int l1;
		char ac2[];
		if(j == 46)
	//*   0    0:iload_3         
	//*   1    1:bipush          46
	//*   2    3:icmpne          116
		{
			ac[i] = (char)j;
	//    3    6:aload_1         
	//    4    7:iload_2         
	//    5    8:iload_3         
	//    6    9:int2char        
	//    7   10:castore         
			j = 0;
	//    8   11:iconst_0        
	//    9   12:istore_3        
			i++;
	//   10   13:iload_2         
	//   11   14:iconst_1        
	//   12   15:iadd            
	//   13   16:istore_2        
			int l;
			do
			{
				l = _inputData.readUnsignedByte();
	//   14   17:aload_0         
	//   15   18:getfield        #53  <Field DataInput _inputData>
	//   16   21:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   17   26:istore          6
				if(l < 48 || l > 57)
	//*  18   28:iload           6
	//*  19   30:bipush          48
	//*  20   32:icmplt          92
	//*  21   35:iload           6
	//*  22   37:bipush          57
	//*  23   39:icmple          45
					break;
	//   24   42:goto            92
				int j1 = j + 1;
	//   25   45:iload_3         
	//   26   46:iconst_1        
	//   27   47:iadd            
	//   28   48:istore          7
				j = i;
	//   29   50:iload_2         
	//   30   51:istore_3        
				char ac1[] = ac;
	//   31   52:aload_1         
	//   32   53:astore          9
				if(i >= ac.length)
	//*  33   55:iload_2         
	//*  34   56:aload_1         
	//*  35   57:arraylength     
	//*  36   58:icmplt          72
				{
					ac1 = _textBuffer.finishCurrentSegment();
	//   37   61:aload_0         
	//   38   62:getfield        #98  <Field TextBuffer _textBuffer>
	//   39   65:invokevirtual   #118 <Method char[] TextBuffer.finishCurrentSegment()>
	//   40   68:astore          9
					j = 0;
	//   41   70:iconst_0        
	//   42   71:istore_3        
				}
				ac1[j] = (char)l;
	//   43   72:aload           9
	//   44   74:iload_3         
	//   45   75:iload           6
	//   46   77:int2char        
	//   47   78:castore         
				i = j + 1;
	//   48   79:iload_3         
	//   49   80:iconst_1        
	//   50   81:iadd            
	//   51   82:istore_2        
				j = j1;
	//   52   83:iload           7
	//   53   85:istore_3        
				ac = ac1;
	//   54   86:aload           9
	//   55   88:astore_1        
			} while(true);
	//   56   89:goto            17
			if(j == 0)
	//*  57   92:iload_3         
	//*  58   93:ifne            104
				reportUnexpectedNumberChar(l, "Decimal point not followed by a digit");
	//   59   96:aload_0         
	//   60   97:iload           6
	//   61   99:ldc1            #243 <String "Decimal point not followed by a digit">
	//   62  101:invokevirtual   #246 <Method void reportUnexpectedNumberChar(int, String)>
			k1 = j;
	//   63  104:iload_3         
	//   64  105:istore          7
			j = l;
	//   65  107:iload           6
	//   66  109:istore_3        
			ac2 = ac;
	//   67  110:aload_1         
	//   68  111:astore          9
		} else
	//*  69  113:goto            122
		{
			k1 = 0;
	//   70  116:iconst_0        
	//   71  117:istore          7
			ac2 = ac;
	//   72  119:aload_1         
	//   73  120:astore          9
		}
		if(j != 101 && j != 69)
	//*  74  122:iload_3         
	//*  75  123:bipush          101
	//*  76  125:icmpeq          146
	//*  77  128:iload_3         
	//*  78  129:bipush          69
	//*  79  131:icmpne          137
	//*  80  134:goto            146
		{
			i1 = 0;
	//   81  137:iconst_0        
	//   82  138:istore          6
			l1 = j;
	//   83  140:iload_3         
	//   84  141:istore          8
			break MISSING_BLOCK_LABEL_369;
	//   85  143:goto            369
		}
		ac = ac2;
	//   86  146:aload           9
	//   87  148:astore_1        
		l1 = i;
	//   88  149:iload_2         
	//   89  150:istore          8
		if(i >= ac2.length)
	//*  90  152:iload_2         
	//*  91  153:aload           9
	//*  92  155:arraylength     
	//*  93  156:icmplt          170
		{
			ac = _textBuffer.finishCurrentSegment();
	//   94  159:aload_0         
	//   95  160:getfield        #98  <Field TextBuffer _textBuffer>
	//   96  163:invokevirtual   #118 <Method char[] TextBuffer.finishCurrentSegment()>
	//   97  166:astore_1        
			l1 = 0;
	//   98  167:iconst_0        
	//   99  168:istore          8
		}
		i1 = l1 + 1;
	//  100  170:iload           8
	//  101  172:iconst_1        
	//  102  173:iadd            
	//  103  174:istore          6
		ac[l1] = (char)j;
	//  104  176:aload_1         
	//  105  177:iload           8
	//  106  179:iload_3         
	//  107  180:int2char        
	//  108  181:castore         
		l1 = _inputData.readUnsignedByte();
	//  109  182:aload_0         
	//  110  183:getfield        #53  <Field DataInput _inputData>
	//  111  186:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//  112  191:istore          8
		if(l1 == 45) goto _L2; else goto _L1
	//  113  193:iload           8
	//  114  195:bipush          45
	//  115  197:icmpeq          230
_L1:
		char ac3[];
		i = i1;
	//  116  200:iload           6
	//  117  202:istore_2        
		ac3 = ac;
	//  118  203:aload_1         
	//  119  204:astore          9
		j = l1;
	//  120  206:iload           8
	//  121  208:istore_3        
		if(l1 != 43) goto _L3; else goto _L2
	//  122  209:iload           8
	//  123  211:bipush          43
	//  124  213:icmpne          219
	//* 125  216:goto            230
_L3:
		i1 = j;
	//  126  219:iload_3         
	//  127  220:istore          6
		ac = ac3;
	//  128  222:aload           9
	//  129  224:astore_1        
		j = 0;
	//  130  225:iconst_0        
	//  131  226:istore_3        
		break; /* Loop/switch isn't completed */
	//  132  227:goto            278
_L2:
		i = i1;
	//  133  230:iload           6
	//  134  232:istore_2        
		ac3 = ac;
	//  135  233:aload_1         
	//  136  234:astore          9
		if(i1 >= ac.length)
	//* 137  236:iload           6
	//* 138  238:aload_1         
	//* 139  239:arraylength     
	//* 140  240:icmplt          254
		{
			ac3 = _textBuffer.finishCurrentSegment();
	//  141  243:aload_0         
	//  142  244:getfield        #98  <Field TextBuffer _textBuffer>
	//  143  247:invokevirtual   #118 <Method char[] TextBuffer.finishCurrentSegment()>
	//  144  250:astore          9
			i = 0;
	//  145  252:iconst_0        
	//  146  253:istore_2        
		}
		ac3[i] = (char)l1;
	//  147  254:aload           9
	//  148  256:iload_2         
	//  149  257:iload           8
	//  150  259:int2char        
	//  151  260:castore         
		j = _inputData.readUnsignedByte();
	//  152  261:aload_0         
	//  153  262:getfield        #53  <Field DataInput _inputData>
	//  154  265:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//  155  270:istore_3        
		i++;
	//  156  271:iload_2         
	//  157  272:iconst_1        
	//  158  273:iadd            
	//  159  274:istore_2        
		if(true) goto _L3; else goto _L4
	//  160  275:goto            219
_L4:
		while(i1 <= 57 && i1 >= 48) 
	//* 161  278:iload           6
	//* 162  280:bipush          57
	//* 163  282:icmpgt          350
	//* 164  285:iload           6
	//* 165  287:bipush          48
	//* 166  289:icmplt          350
		{
			l1 = j + 1;
	//  167  292:iload_3         
	//  168  293:iconst_1        
	//  169  294:iadd            
	//  170  295:istore          8
			j = i;
	//  171  297:iload_2         
	//  172  298:istore_3        
			char ac4[] = ac;
	//  173  299:aload_1         
	//  174  300:astore          9
			if(i >= ac.length)
	//* 175  302:iload_2         
	//* 176  303:aload_1         
	//* 177  304:arraylength     
	//* 178  305:icmplt          319
			{
				ac4 = _textBuffer.finishCurrentSegment();
	//  179  308:aload_0         
	//  180  309:getfield        #98  <Field TextBuffer _textBuffer>
	//  181  312:invokevirtual   #118 <Method char[] TextBuffer.finishCurrentSegment()>
	//  182  315:astore          9
				j = 0;
	//  183  317:iconst_0        
	//  184  318:istore_3        
			}
			ac4[j] = (char)i1;
	//  185  319:aload           9
	//  186  321:iload_3         
	//  187  322:iload           6
	//  188  324:int2char        
	//  189  325:castore         
			i1 = _inputData.readUnsignedByte();
	//  190  326:aload_0         
	//  191  327:getfield        #53  <Field DataInput _inputData>
	//  192  330:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//  193  335:istore          6
			i = j + 1;
	//  194  337:iload_3         
	//  195  338:iconst_1        
	//  196  339:iadd            
	//  197  340:istore_2        
			j = l1;
	//  198  341:iload           8
	//  199  343:istore_3        
			ac = ac4;
	//  200  344:aload           9
	//  201  346:astore_1        
		}
	//* 202  347:goto            278
		if(j == 0)
	//* 203  350:iload_3         
	//* 204  351:ifne            362
			reportUnexpectedNumberChar(i1, "Exponent indicator not followed by a digit");
	//  205  354:aload_0         
	//  206  355:iload           6
	//  207  357:ldc1            #248 <String "Exponent indicator not followed by a digit">
	//  208  359:invokevirtual   #246 <Method void reportUnexpectedNumberChar(int, String)>
		l1 = i1;
	//  209  362:iload           6
	//  210  364:istore          8
		i1 = j;
	//  211  366:iload_3         
	//  212  367:istore          6
		_nextByte = l1;
	//  213  369:aload_0         
	//  214  370:iload           8
	//  215  372:putfield        #47  <Field int _nextByte>
		if(_parsingContext.inRoot())
	//* 216  375:aload_0         
	//* 217  376:getfield        #183 <Field JsonReadContext _parsingContext>
	//* 218  379:invokevirtual   #252 <Method boolean JsonReadContext.inRoot()>
	//* 219  382:ifeq            389
			_verifyRootSpace();
	//  220  385:aload_0         
	//  221  386:invokespecial   #255 <Method void _verifyRootSpace()>
		_textBuffer.setCurrentLength(i);
	//  222  389:aload_0         
	//  223  390:getfield        #98  <Field TextBuffer _textBuffer>
	//  224  393:iload_2         
	//  225  394:invokevirtual   #121 <Method void TextBuffer.setCurrentLength(int)>
		return resetFloat(flag, k, k1, i1);
	//  226  397:aload_0         
	//  227  398:iload           4
	//  228  400:iload           5
	//  229  402:iload           7
	//  230  404:iload           6
	//  231  406:invokevirtual   #259 <Method JsonToken resetFloat(boolean, int, int, int)>
	//  232  409:areturn         
	}

	private final String _parseLongName(int i, int j, int k)
		throws IOException
	{
		_quadBuffer[0] = _quad1;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int[] _quadBuffer>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:getfield        #263 <Field int _quad1>
	//    5    9:iastore         
		_quadBuffer[1] = j;
	//    6   10:aload_0         
	//    7   11:getfield        #45  <Field int[] _quadBuffer>
	//    8   14:iconst_1        
	//    9   15:iload_2         
	//   10   16:iastore         
		_quadBuffer[2] = k;
	//   11   17:aload_0         
	//   12   18:getfield        #45  <Field int[] _quadBuffer>
	//   13   21:iconst_2        
	//   14   22:iload_3         
	//   15   23:iastore         
		int ai[] = _icLatin1;
	//   16   24:getstatic       #37  <Field int[] _icLatin1>
	//   17   27:astore          4
		j = i;
	//   18   29:iload_1         
	//   19   30:istore_2        
		i = 3;
	//   20   31:iconst_3        
	//   21   32:istore_1        
		do
		{
			k = _inputData.readUnsignedByte();
	//   22   33:aload_0         
	//   23   34:getfield        #53  <Field DataInput _inputData>
	//   24   37:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   25   42:istore_3        
			if(ai[k] != 0)
	//*  26   43:aload           4
	//*  27   45:iload_3         
	//*  28   46:iaload          
	//*  29   47:ifeq            81
				if(k == 34)
	//*  30   50:iload_3         
	//*  31   51:bipush          34
	//*  32   53:icmpne          68
					return findName(_quadBuffer, i, j, 1);
	//   33   56:aload_0         
	//   34   57:aload_0         
	//   35   58:getfield        #45  <Field int[] _quadBuffer>
	//   36   61:iload_1         
	//   37   62:iload_2         
	//   38   63:iconst_1        
	//   39   64:invokespecial   #267 <Method String findName(int[], int, int, int)>
	//   40   67:areturn         
				else
					return parseEscapedName(_quadBuffer, i, j, k, 1);
	//   41   68:aload_0         
	//   42   69:aload_0         
	//   43   70:getfield        #45  <Field int[] _quadBuffer>
	//   44   73:iload_1         
	//   45   74:iload_2         
	//   46   75:iload_3         
	//   47   76:iconst_1        
	//   48   77:invokevirtual   #271 <Method String parseEscapedName(int[], int, int, int, int)>
	//   49   80:areturn         
			j = j << 8 | k;
	//   50   81:iload_2         
	//   51   82:bipush          8
	//   52   84:ishl            
	//   53   85:iload_3         
	//   54   86:ior             
	//   55   87:istore_2        
			k = _inputData.readUnsignedByte();
	//   56   88:aload_0         
	//   57   89:getfield        #53  <Field DataInput _inputData>
	//   58   92:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   59   97:istore_3        
			if(ai[k] != 0)
	//*  60   98:aload           4
	//*  61  100:iload_3         
	//*  62  101:iaload          
	//*  63  102:ifeq            136
				if(k == 34)
	//*  64  105:iload_3         
	//*  65  106:bipush          34
	//*  66  108:icmpne          123
					return findName(_quadBuffer, i, j, 2);
	//   67  111:aload_0         
	//   68  112:aload_0         
	//   69  113:getfield        #45  <Field int[] _quadBuffer>
	//   70  116:iload_1         
	//   71  117:iload_2         
	//   72  118:iconst_2        
	//   73  119:invokespecial   #267 <Method String findName(int[], int, int, int)>
	//   74  122:areturn         
				else
					return parseEscapedName(_quadBuffer, i, j, k, 2);
	//   75  123:aload_0         
	//   76  124:aload_0         
	//   77  125:getfield        #45  <Field int[] _quadBuffer>
	//   78  128:iload_1         
	//   79  129:iload_2         
	//   80  130:iload_3         
	//   81  131:iconst_2        
	//   82  132:invokevirtual   #271 <Method String parseEscapedName(int[], int, int, int, int)>
	//   83  135:areturn         
			j = j << 8 | k;
	//   84  136:iload_2         
	//   85  137:bipush          8
	//   86  139:ishl            
	//   87  140:iload_3         
	//   88  141:ior             
	//   89  142:istore_2        
			k = _inputData.readUnsignedByte();
	//   90  143:aload_0         
	//   91  144:getfield        #53  <Field DataInput _inputData>
	//   92  147:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   93  152:istore_3        
			if(ai[k] != 0)
	//*  94  153:aload           4
	//*  95  155:iload_3         
	//*  96  156:iaload          
	//*  97  157:ifeq            191
				if(k == 34)
	//*  98  160:iload_3         
	//*  99  161:bipush          34
	//* 100  163:icmpne          178
					return findName(_quadBuffer, i, j, 3);
	//  101  166:aload_0         
	//  102  167:aload_0         
	//  103  168:getfield        #45  <Field int[] _quadBuffer>
	//  104  171:iload_1         
	//  105  172:iload_2         
	//  106  173:iconst_3        
	//  107  174:invokespecial   #267 <Method String findName(int[], int, int, int)>
	//  108  177:areturn         
				else
					return parseEscapedName(_quadBuffer, i, j, k, 3);
	//  109  178:aload_0         
	//  110  179:aload_0         
	//  111  180:getfield        #45  <Field int[] _quadBuffer>
	//  112  183:iload_1         
	//  113  184:iload_2         
	//  114  185:iload_3         
	//  115  186:iconst_3        
	//  116  187:invokevirtual   #271 <Method String parseEscapedName(int[], int, int, int, int)>
	//  117  190:areturn         
			k = j << 8 | k;
	//  118  191:iload_2         
	//  119  192:bipush          8
	//  120  194:ishl            
	//  121  195:iload_3         
	//  122  196:ior             
	//  123  197:istore_3        
			j = _inputData.readUnsignedByte();
	//  124  198:aload_0         
	//  125  199:getfield        #53  <Field DataInput _inputData>
	//  126  202:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//  127  207:istore_2        
			if(ai[j] != 0)
	//* 128  208:aload           4
	//* 129  210:iload_2         
	//* 130  211:iaload          
	//* 131  212:ifeq            246
				if(j == 34)
	//* 132  215:iload_2         
	//* 133  216:bipush          34
	//* 134  218:icmpne          233
					return findName(_quadBuffer, i, k, 4);
	//  135  221:aload_0         
	//  136  222:aload_0         
	//  137  223:getfield        #45  <Field int[] _quadBuffer>
	//  138  226:iload_1         
	//  139  227:iload_3         
	//  140  228:iconst_4        
	//  141  229:invokespecial   #267 <Method String findName(int[], int, int, int)>
	//  142  232:areturn         
				else
					return parseEscapedName(_quadBuffer, i, k, j, 4);
	//  143  233:aload_0         
	//  144  234:aload_0         
	//  145  235:getfield        #45  <Field int[] _quadBuffer>
	//  146  238:iload_1         
	//  147  239:iload_3         
	//  148  240:iload_2         
	//  149  241:iconst_4        
	//  150  242:invokevirtual   #271 <Method String parseEscapedName(int[], int, int, int, int)>
	//  151  245:areturn         
			if(i >= _quadBuffer.length)
	//* 152  246:iload_1         
	//* 153  247:aload_0         
	//* 154  248:getfield        #45  <Field int[] _quadBuffer>
	//* 155  251:arraylength     
	//* 156  252:icmplt          267
				_quadBuffer = _growArrayBy(_quadBuffer, i);
	//  157  255:aload_0         
	//  158  256:aload_0         
	//  159  257:getfield        #45  <Field int[] _quadBuffer>
	//  160  260:iload_1         
	//  161  261:invokestatic    #273 <Method int[] _growArrayBy(int[], int)>
	//  162  264:putfield        #45  <Field int[] _quadBuffer>
			_quadBuffer[i] = k;
	//  163  267:aload_0         
	//  164  268:getfield        #45  <Field int[] _quadBuffer>
	//  165  271:iload_1         
	//  166  272:iload_3         
	//  167  273:iastore         
			i++;
	//  168  274:iload_1         
	//  169  275:iconst_1        
	//  170  276:iadd            
	//  171  277:istore_1        
		} while(true);
	//  172  278:goto            33
	}

	private final String _parseMediumName(int i)
		throws IOException
	{
		int ai[] = _icLatin1;
	//    0    0:getstatic       #37  <Field int[] _icLatin1>
	//    1    3:astore_3        
		int j = _inputData.readUnsignedByte();
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field DataInput _inputData>
	//    4    8:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//    5   13:istore_2        
		if(ai[j] != 0)
	//*   6   14:aload_3         
	//*   7   15:iload_2         
	//*   8   16:iaload          
	//*   9   17:ifeq            49
			if(j == 34)
	//*  10   20:iload_2         
	//*  11   21:bipush          34
	//*  12   23:icmpne          37
				return findName(_quad1, i, 1);
	//   13   26:aload_0         
	//   14   27:aload_0         
	//   15   28:getfield        #263 <Field int _quad1>
	//   16   31:iload_1         
	//   17   32:iconst_1        
	//   18   33:invokespecial   #276 <Method String findName(int, int, int)>
	//   19   36:areturn         
			else
				return parseName(_quad1, i, j, 1);
	//   20   37:aload_0         
	//   21   38:aload_0         
	//   22   39:getfield        #263 <Field int _quad1>
	//   23   42:iload_1         
	//   24   43:iload_2         
	//   25   44:iconst_1        
	//   26   45:invokespecial   #280 <Method String parseName(int, int, int, int)>
	//   27   48:areturn         
		i = i << 8 | j;
	//   28   49:iload_1         
	//   29   50:bipush          8
	//   30   52:ishl            
	//   31   53:iload_2         
	//   32   54:ior             
	//   33   55:istore_1        
		j = _inputData.readUnsignedByte();
	//   34   56:aload_0         
	//   35   57:getfield        #53  <Field DataInput _inputData>
	//   36   60:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   37   65:istore_2        
		if(ai[j] != 0)
	//*  38   66:aload_3         
	//*  39   67:iload_2         
	//*  40   68:iaload          
	//*  41   69:ifeq            101
			if(j == 34)
	//*  42   72:iload_2         
	//*  43   73:bipush          34
	//*  44   75:icmpne          89
				return findName(_quad1, i, 2);
	//   45   78:aload_0         
	//   46   79:aload_0         
	//   47   80:getfield        #263 <Field int _quad1>
	//   48   83:iload_1         
	//   49   84:iconst_2        
	//   50   85:invokespecial   #276 <Method String findName(int, int, int)>
	//   51   88:areturn         
			else
				return parseName(_quad1, i, j, 2);
	//   52   89:aload_0         
	//   53   90:aload_0         
	//   54   91:getfield        #263 <Field int _quad1>
	//   55   94:iload_1         
	//   56   95:iload_2         
	//   57   96:iconst_2        
	//   58   97:invokespecial   #280 <Method String parseName(int, int, int, int)>
	//   59  100:areturn         
		i = i << 8 | j;
	//   60  101:iload_1         
	//   61  102:bipush          8
	//   62  104:ishl            
	//   63  105:iload_2         
	//   64  106:ior             
	//   65  107:istore_1        
		j = _inputData.readUnsignedByte();
	//   66  108:aload_0         
	//   67  109:getfield        #53  <Field DataInput _inputData>
	//   68  112:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   69  117:istore_2        
		if(ai[j] != 0)
	//*  70  118:aload_3         
	//*  71  119:iload_2         
	//*  72  120:iaload          
	//*  73  121:ifeq            153
			if(j == 34)
	//*  74  124:iload_2         
	//*  75  125:bipush          34
	//*  76  127:icmpne          141
				return findName(_quad1, i, 3);
	//   77  130:aload_0         
	//   78  131:aload_0         
	//   79  132:getfield        #263 <Field int _quad1>
	//   80  135:iload_1         
	//   81  136:iconst_3        
	//   82  137:invokespecial   #276 <Method String findName(int, int, int)>
	//   83  140:areturn         
			else
				return parseName(_quad1, i, j, 3);
	//   84  141:aload_0         
	//   85  142:aload_0         
	//   86  143:getfield        #263 <Field int _quad1>
	//   87  146:iload_1         
	//   88  147:iload_2         
	//   89  148:iconst_3        
	//   90  149:invokespecial   #280 <Method String parseName(int, int, int, int)>
	//   91  152:areturn         
		i = i << 8 | j;
	//   92  153:iload_1         
	//   93  154:bipush          8
	//   94  156:ishl            
	//   95  157:iload_2         
	//   96  158:ior             
	//   97  159:istore_1        
		j = _inputData.readUnsignedByte();
	//   98  160:aload_0         
	//   99  161:getfield        #53  <Field DataInput _inputData>
	//  100  164:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//  101  169:istore_2        
		if(ai[j] != 0)
	//* 102  170:aload_3         
	//* 103  171:iload_2         
	//* 104  172:iaload          
	//* 105  173:ifeq            205
		{
			if(j == 34)
	//* 106  176:iload_2         
	//* 107  177:bipush          34
	//* 108  179:icmpne          193
				return findName(_quad1, i, 4);
	//  109  182:aload_0         
	//  110  183:aload_0         
	//  111  184:getfield        #263 <Field int _quad1>
	//  112  187:iload_1         
	//  113  188:iconst_4        
	//  114  189:invokespecial   #276 <Method String findName(int, int, int)>
	//  115  192:areturn         
			else
				return parseName(_quad1, i, j, 4);
	//  116  193:aload_0         
	//  117  194:aload_0         
	//  118  195:getfield        #263 <Field int _quad1>
	//  119  198:iload_1         
	//  120  199:iload_2         
	//  121  200:iconst_4        
	//  122  201:invokespecial   #280 <Method String parseName(int, int, int, int)>
	//  123  204:areturn         
		} else
		{
			return _parseMediumName2(j, i);
	//  124  205:aload_0         
	//  125  206:iload_2         
	//  126  207:iload_1         
	//  127  208:invokespecial   #283 <Method String _parseMediumName2(int, int)>
	//  128  211:areturn         
		}
	}

	private final String _parseMediumName2(int i, int j)
		throws IOException
	{
		int ai[] = _icLatin1;
	//    0    0:getstatic       #37  <Field int[] _icLatin1>
	//    1    3:astore          4
		int k = _inputData.readUnsignedByte();
	//    2    5:aload_0         
	//    3    6:getfield        #53  <Field DataInput _inputData>
	//    4    9:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//    5   14:istore_3        
		if(ai[k] != 0)
	//*   6   15:aload           4
	//*   7   17:iload_3         
	//*   8   18:iaload          
	//*   9   19:ifeq            53
			if(k == 34)
	//*  10   22:iload_3         
	//*  11   23:bipush          34
	//*  12   25:icmpne          40
				return findName(_quad1, j, i, 1);
	//   13   28:aload_0         
	//   14   29:aload_0         
	//   15   30:getfield        #263 <Field int _quad1>
	//   16   33:iload_2         
	//   17   34:iload_1         
	//   18   35:iconst_1        
	//   19   36:invokespecial   #285 <Method String findName(int, int, int, int)>
	//   20   39:areturn         
			else
				return parseName(_quad1, j, i, k, 1);
	//   21   40:aload_0         
	//   22   41:aload_0         
	//   23   42:getfield        #263 <Field int _quad1>
	//   24   45:iload_2         
	//   25   46:iload_1         
	//   26   47:iload_3         
	//   27   48:iconst_1        
	//   28   49:invokespecial   #288 <Method String parseName(int, int, int, int, int)>
	//   29   52:areturn         
		i = i << 8 | k;
	//   30   53:iload_1         
	//   31   54:bipush          8
	//   32   56:ishl            
	//   33   57:iload_3         
	//   34   58:ior             
	//   35   59:istore_1        
		k = _inputData.readUnsignedByte();
	//   36   60:aload_0         
	//   37   61:getfield        #53  <Field DataInput _inputData>
	//   38   64:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   39   69:istore_3        
		if(ai[k] != 0)
	//*  40   70:aload           4
	//*  41   72:iload_3         
	//*  42   73:iaload          
	//*  43   74:ifeq            108
			if(k == 34)
	//*  44   77:iload_3         
	//*  45   78:bipush          34
	//*  46   80:icmpne          95
				return findName(_quad1, j, i, 2);
	//   47   83:aload_0         
	//   48   84:aload_0         
	//   49   85:getfield        #263 <Field int _quad1>
	//   50   88:iload_2         
	//   51   89:iload_1         
	//   52   90:iconst_2        
	//   53   91:invokespecial   #285 <Method String findName(int, int, int, int)>
	//   54   94:areturn         
			else
				return parseName(_quad1, j, i, k, 2);
	//   55   95:aload_0         
	//   56   96:aload_0         
	//   57   97:getfield        #263 <Field int _quad1>
	//   58  100:iload_2         
	//   59  101:iload_1         
	//   60  102:iload_3         
	//   61  103:iconst_2        
	//   62  104:invokespecial   #288 <Method String parseName(int, int, int, int, int)>
	//   63  107:areturn         
		i = i << 8 | k;
	//   64  108:iload_1         
	//   65  109:bipush          8
	//   66  111:ishl            
	//   67  112:iload_3         
	//   68  113:ior             
	//   69  114:istore_1        
		k = _inputData.readUnsignedByte();
	//   70  115:aload_0         
	//   71  116:getfield        #53  <Field DataInput _inputData>
	//   72  119:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   73  124:istore_3        
		if(ai[k] != 0)
	//*  74  125:aload           4
	//*  75  127:iload_3         
	//*  76  128:iaload          
	//*  77  129:ifeq            163
			if(k == 34)
	//*  78  132:iload_3         
	//*  79  133:bipush          34
	//*  80  135:icmpne          150
				return findName(_quad1, j, i, 3);
	//   81  138:aload_0         
	//   82  139:aload_0         
	//   83  140:getfield        #263 <Field int _quad1>
	//   84  143:iload_2         
	//   85  144:iload_1         
	//   86  145:iconst_3        
	//   87  146:invokespecial   #285 <Method String findName(int, int, int, int)>
	//   88  149:areturn         
			else
				return parseName(_quad1, j, i, k, 3);
	//   89  150:aload_0         
	//   90  151:aload_0         
	//   91  152:getfield        #263 <Field int _quad1>
	//   92  155:iload_2         
	//   93  156:iload_1         
	//   94  157:iload_3         
	//   95  158:iconst_3        
	//   96  159:invokespecial   #288 <Method String parseName(int, int, int, int, int)>
	//   97  162:areturn         
		i = i << 8 | k;
	//   98  163:iload_1         
	//   99  164:bipush          8
	//  100  166:ishl            
	//  101  167:iload_3         
	//  102  168:ior             
	//  103  169:istore_1        
		k = _inputData.readUnsignedByte();
	//  104  170:aload_0         
	//  105  171:getfield        #53  <Field DataInput _inputData>
	//  106  174:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//  107  179:istore_3        
		if(ai[k] != 0)
	//* 108  180:aload           4
	//* 109  182:iload_3         
	//* 110  183:iaload          
	//* 111  184:ifeq            218
		{
			if(k == 34)
	//* 112  187:iload_3         
	//* 113  188:bipush          34
	//* 114  190:icmpne          205
				return findName(_quad1, j, i, 4);
	//  115  193:aload_0         
	//  116  194:aload_0         
	//  117  195:getfield        #263 <Field int _quad1>
	//  118  198:iload_2         
	//  119  199:iload_1         
	//  120  200:iconst_4        
	//  121  201:invokespecial   #285 <Method String findName(int, int, int, int)>
	//  122  204:areturn         
			else
				return parseName(_quad1, j, i, k, 4);
	//  123  205:aload_0         
	//  124  206:aload_0         
	//  125  207:getfield        #263 <Field int _quad1>
	//  126  210:iload_2         
	//  127  211:iload_1         
	//  128  212:iload_3         
	//  129  213:iconst_4        
	//  130  214:invokespecial   #288 <Method String parseName(int, int, int, int, int)>
	//  131  217:areturn         
		} else
		{
			return _parseLongName(k, j, i);
	//  132  218:aload_0         
	//  133  219:iload_3         
	//  134  220:iload_2         
	//  135  221:iload_1         
	//  136  222:invokespecial   #290 <Method String _parseLongName(int, int, int)>
	//  137  225:areturn         
		}
	}

	private void _reportInvalidOther(int i)
		throws JsonParseException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #294 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #296 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Invalid UTF-8 middle byte 0x");
	//    4    8:aload_2         
	//    5    9:ldc2            #298 <String "Invalid UTF-8 middle byte 0x">
	//    6   12:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(Integer.toHexString(i));
	//    8   16:aload_2         
	//    9   17:iload_1         
	//   10   18:invokestatic    #307 <Method String Integer.toHexString(int)>
	//   11   21:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		_reportError(stringbuilder.toString());
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:invokevirtual   #310 <Method String StringBuilder.toString()>
	//   16   30:invokevirtual   #313 <Method void _reportError(String)>
	//   17   33:return          
	}

	private final void _skipCComment()
		throws IOException
	{
		int ai[] = CharTypes.getInputCodeComment();
	//    0    0:invokestatic    #317 <Method int[] CharTypes.getInputCodeComment()>
	//    1    3:astore_3        
		int i = _inputData.readUnsignedByte();
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field DataInput _inputData>
	//    4    8:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//    5   13:istore_1        
		do
		{
			int j = ai[i];
	//    6   14:aload_3         
	//    7   15:iload_1         
	//    8   16:iaload          
	//    9   17:istore_2        
			if(j != 0)
	//*  10   18:iload_2         
	//*  11   19:ifeq            126
				if(j != 10 && j != 13)
	//*  12   22:iload_2         
	//*  13   23:bipush          10
	//*  14   25:icmpeq          116
	//*  15   28:iload_2         
	//*  16   29:bipush          13
	//*  17   31:icmpeq          116
				{
					if(j != 42)
	//*  18   34:iload_2         
	//*  19   35:bipush          42
	//*  20   37:icmpeq          97
					{
						switch(j)
	//*  21   40:iload_2         
						{
	//*  22   41:tableswitch     2 4: default 68
	//	               2 90
	//	               3 83
	//	               4 76
						default:
							_reportInvalidChar(i);
	//   23   68:aload_0         
	//   24   69:iload_1         
	//   25   70:invokevirtual   #141 <Method void _reportInvalidChar(int)>
							break;

	//*  26   73:goto            126
						case 4: // '\004'
							_skipUtf8_4();
	//   27   76:aload_0         
	//   28   77:invokespecial   #320 <Method void _skipUtf8_4()>
							break;

	//*  29   80:goto            126
						case 3: // '\003'
							_skipUtf8_3();
	//   30   83:aload_0         
	//   31   84:invokespecial   #323 <Method void _skipUtf8_3()>
							break;

	//*  32   87:goto            126
						case 2: // '\002'
							_skipUtf8_2();
	//   33   90:aload_0         
	//   34   91:invokespecial   #326 <Method void _skipUtf8_2()>
							break;
						}
					} else
	//*  35   94:goto            126
					{
						int k = _inputData.readUnsignedByte();
	//   36   97:aload_0         
	//   37   98:getfield        #53  <Field DataInput _inputData>
	//   38  101:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   39  106:istore_2        
						i = k;
	//   40  107:iload_2         
	//   41  108:istore_1        
						if(k == 47)
	//*  42  109:iload_2         
	//*  43  110:bipush          47
	//*  44  112:icmpne          14
							return;
	//   45  115:return          
						continue;
					}
				} else
				{
					_currInputRow = _currInputRow + 1;
	//   46  116:aload_0         
	//   47  117:aload_0         
	//   48  118:getfield        #329 <Field int _currInputRow>
	//   49  121:iconst_1        
	//   50  122:iadd            
	//   51  123:putfield        #329 <Field int _currInputRow>
				}
			i = _inputData.readUnsignedByte();
	//   52  126:aload_0         
	//   53  127:getfield        #53  <Field DataInput _inputData>
	//   54  130:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   55  135:istore_1        
		} while(true);
	//   56  136:goto            14
	}

	private final int _skipColon()
		throws IOException
	{
		int i;
label0:
		{
label1:
			{
				i = _nextByte;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int _nextByte>
	//    2    4:istore_1        
				if(i < 0)
	//*   3    5:iload_1         
	//*   4    6:ifge            22
					i = _inputData.readUnsignedByte();
	//    5    9:aload_0         
	//    6   10:getfield        #53  <Field DataInput _inputData>
	//    7   13:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//    8   18:istore_1        
				else
	//*   9   19:goto            27
					_nextByte = -1;
	//   10   22:aload_0         
	//   11   23:iconst_m1       
	//   12   24:putfield        #47  <Field int _nextByte>
				if(i != 58)
					break label0;
	//   13   27:iload_1         
	//   14   28:bipush          58
	//   15   30:icmpne          136
				int k = _inputData.readUnsignedByte();
	//   16   33:aload_0         
	//   17   34:getfield        #53  <Field DataInput _inputData>
	//   18   37:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   19   42:istore_2        
				if(k > 32)
	//*  20   43:iload_2         
	//*  21   44:bipush          32
	//*  22   46:icmple          73
					if(k != 47 && k != 35)
	//*  23   49:iload_2         
	//*  24   50:bipush          47
	//*  25   52:icmpeq          66
	//*  26   55:iload_2         
	//*  27   56:bipush          35
	//*  28   58:icmpne          64
	//*  29   61:goto            66
						return k;
	//   30   64:iload_2         
	//   31   65:ireturn         
					else
						return _skipColon2(k, true);
	//   32   66:aload_0         
	//   33   67:iload_2         
	//   34   68:iconst_1        
	//   35   69:invokespecial   #334 <Method int _skipColon2(int, boolean)>
	//   36   72:ireturn         
				if(k != 32)
	//*  37   73:iload_2         
	//*  38   74:bipush          32
	//*  39   76:icmpeq          87
				{
					i = k;
	//   40   79:iload_2         
	//   41   80:istore_1        
					if(k != 9)
						break label1;
	//   42   81:iload_2         
	//   43   82:bipush          9
	//   44   84:icmpne          129
				}
				k = _inputData.readUnsignedByte();
	//   45   87:aload_0         
	//   46   88:getfield        #53  <Field DataInput _inputData>
	//   47   91:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   48   96:istore_2        
				i = k;
	//   49   97:iload_2         
	//   50   98:istore_1        
				if(k > 32)
	//*  51   99:iload_2         
	//*  52  100:bipush          32
	//*  53  102:icmple          129
					if(k != 47 && k != 35)
	//*  54  105:iload_2         
	//*  55  106:bipush          47
	//*  56  108:icmpeq          122
	//*  57  111:iload_2         
	//*  58  112:bipush          35
	//*  59  114:icmpne          120
	//*  60  117:goto            122
						return k;
	//   61  120:iload_2         
	//   62  121:ireturn         
					else
						return _skipColon2(k, true);
	//   63  122:aload_0         
	//   64  123:iload_2         
	//   65  124:iconst_1        
	//   66  125:invokespecial   #334 <Method int _skipColon2(int, boolean)>
	//   67  128:ireturn         
			}
			return _skipColon2(i, true);
	//   68  129:aload_0         
	//   69  130:iload_1         
	//   70  131:iconst_1        
	//   71  132:invokespecial   #334 <Method int _skipColon2(int, boolean)>
	//   72  135:ireturn         
		}
		int l;
label2:
		{
			if(i != 32)
	//*  73  136:iload_1         
	//*  74  137:bipush          32
	//*  75  139:icmpeq          150
			{
				l = i;
	//   76  142:iload_1         
	//   77  143:istore_2        
				if(i != 9)
					break label2;
	//   78  144:iload_1         
	//   79  145:bipush          9
	//   80  147:icmpne          160
			}
			l = _inputData.readUnsignedByte();
	//   81  150:aload_0         
	//   82  151:getfield        #53  <Field DataInput _inputData>
	//   83  154:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   84  159:istore_2        
		}
label3:
		{
			int j;
label4:
			{
				if(l != 58)
					break label3;
	//   85  160:iload_2         
	//   86  161:bipush          58
	//   87  163:icmpne          269
				l = _inputData.readUnsignedByte();
	//   88  166:aload_0         
	//   89  167:getfield        #53  <Field DataInput _inputData>
	//   90  170:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   91  175:istore_2        
				if(l > 32)
	//*  92  176:iload_2         
	//*  93  177:bipush          32
	//*  94  179:icmple          206
					if(l != 47 && l != 35)
	//*  95  182:iload_2         
	//*  96  183:bipush          47
	//*  97  185:icmpeq          199
	//*  98  188:iload_2         
	//*  99  189:bipush          35
	//* 100  191:icmpne          197
	//* 101  194:goto            199
						return l;
	//  102  197:iload_2         
	//  103  198:ireturn         
					else
						return _skipColon2(l, true);
	//  104  199:aload_0         
	//  105  200:iload_2         
	//  106  201:iconst_1        
	//  107  202:invokespecial   #334 <Method int _skipColon2(int, boolean)>
	//  108  205:ireturn         
				if(l != 32)
	//* 109  206:iload_2         
	//* 110  207:bipush          32
	//* 111  209:icmpeq          220
				{
					j = l;
	//  112  212:iload_2         
	//  113  213:istore_1        
					if(l != 9)
						break label4;
	//  114  214:iload_2         
	//  115  215:bipush          9
	//  116  217:icmpne          262
				}
				l = _inputData.readUnsignedByte();
	//  117  220:aload_0         
	//  118  221:getfield        #53  <Field DataInput _inputData>
	//  119  224:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//  120  229:istore_2        
				j = l;
	//  121  230:iload_2         
	//  122  231:istore_1        
				if(l > 32)
	//* 123  232:iload_2         
	//* 124  233:bipush          32
	//* 125  235:icmple          262
					if(l != 47 && l != 35)
	//* 126  238:iload_2         
	//* 127  239:bipush          47
	//* 128  241:icmpeq          255
	//* 129  244:iload_2         
	//* 130  245:bipush          35
	//* 131  247:icmpne          253
	//* 132  250:goto            255
						return l;
	//  133  253:iload_2         
	//  134  254:ireturn         
					else
						return _skipColon2(l, true);
	//  135  255:aload_0         
	//  136  256:iload_2         
	//  137  257:iconst_1        
	//  138  258:invokespecial   #334 <Method int _skipColon2(int, boolean)>
	//  139  261:ireturn         
			}
			return _skipColon2(j, true);
	//  140  262:aload_0         
	//  141  263:iload_1         
	//  142  264:iconst_1        
	//  143  265:invokespecial   #334 <Method int _skipColon2(int, boolean)>
	//  144  268:ireturn         
		}
		return _skipColon2(l, false);
	//  145  269:aload_0         
	//  146  270:iload_2         
	//  147  271:iconst_0        
	//  148  272:invokespecial   #334 <Method int _skipColon2(int, boolean)>
	//  149  275:ireturn         
	}

	private final int _skipColon2(int i, boolean flag)
		throws IOException
	{
		do
		{
			boolean flag1;
label0:
			{
				if(i > 32)
	//*   0    0:iload_1         
	//*   1    1:bipush          32
	//*   2    3:icmple          64
				{
					if(i == 47)
	//*   3    6:iload_1         
	//*   4    7:bipush          47
	//*   5    9:icmpne          21
					{
						_skipComment();
	//    6   12:aload_0         
	//    7   13:invokespecial   #337 <Method void _skipComment()>
						flag1 = flag;
	//    8   16:iload_2         
	//    9   17:istore_3        
					} else
	//*  10   18:goto            90
					if(i == 35 && _skipYAMLComment())
	//*  11   21:iload_1         
	//*  12   22:bipush          35
	//*  13   24:icmpne          39
	//*  14   27:aload_0         
	//*  15   28:invokespecial   #340 <Method boolean _skipYAMLComment()>
	//*  16   31:ifeq            39
					{
						flag1 = flag;
	//   17   34:iload_2         
	//   18   35:istore_3        
					} else
	//*  19   36:goto            90
					{
						if(flag)
	//*  20   39:iload_2         
	//*  21   40:ifeq            45
							return i;
	//   22   43:iload_1         
	//   23   44:ireturn         
						if(i != 58)
	//*  24   45:iload_1         
	//*  25   46:bipush          58
	//*  26   48:icmpeq          59
							_reportUnexpectedChar(i, "was expecting a colon to separate field name and value");
	//   27   51:aload_0         
	//   28   52:iload_1         
	//   29   53:ldc2            #342 <String "was expecting a colon to separate field name and value">
	//   30   56:invokevirtual   #345 <Method void _reportUnexpectedChar(int, String)>
						flag1 = true;
	//   31   59:iconst_1        
	//   32   60:istore_3        
					}
					break label0;
	//   33   61:goto            90
				}
				if(i != 13)
	//*  34   64:iload_1         
	//*  35   65:bipush          13
	//*  36   67:icmpeq          78
				{
					flag1 = flag;
	//   37   70:iload_2         
	//   38   71:istore_3        
					if(i != 10)
						break label0;
	//   39   72:iload_1         
	//   40   73:bipush          10
	//   41   75:icmpne          90
				}
				_currInputRow = _currInputRow + 1;
	//   42   78:aload_0         
	//   43   79:aload_0         
	//   44   80:getfield        #329 <Field int _currInputRow>
	//   45   83:iconst_1        
	//   46   84:iadd            
	//   47   85:putfield        #329 <Field int _currInputRow>
				flag1 = flag;
	//   48   88:iload_2         
	//   49   89:istore_3        
			}
			i = _inputData.readUnsignedByte();
	//   50   90:aload_0         
	//   51   91:getfield        #53  <Field DataInput _inputData>
	//   52   94:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   53   99:istore_1        
			flag = flag1;
	//   54  100:iload_3         
	//   55  101:istore_2        
		} while(true);
	//   56  102:goto            0
	}

	private final void _skipComment()
		throws IOException
	{
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #348 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_COMMENTS>
	//*   2    4:invokevirtual   #159 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   3    7:ifne            19
			_reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
	//    4   10:aload_0         
	//    5   11:bipush          47
	//    6   13:ldc2            #350 <String "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)">
	//    7   16:invokevirtual   #345 <Method void _reportUnexpectedChar(int, String)>
		int i = _inputData.readUnsignedByte();
	//    8   19:aload_0         
	//    9   20:getfield        #53  <Field DataInput _inputData>
	//   10   23:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   11   28:istore_1        
		if(i == 47)
	//*  12   29:iload_1         
	//*  13   30:bipush          47
	//*  14   32:icmpne          40
		{
			_skipLine();
	//   15   35:aload_0         
	//   16   36:invokespecial   #353 <Method void _skipLine()>
			return;
	//   17   39:return          
		}
		if(i == 42)
	//*  18   40:iload_1         
	//*  19   41:bipush          42
	//*  20   43:icmpne          51
		{
			_skipCComment();
	//   21   46:aload_0         
	//   22   47:invokespecial   #355 <Method void _skipCComment()>
			return;
	//   23   50:return          
		} else
		{
			_reportUnexpectedChar(i, "was expecting either '*' or '/' for a comment");
	//   24   51:aload_0         
	//   25   52:iload_1         
	//   26   53:ldc2            #357 <String "was expecting either '*' or '/' for a comment">
	//   27   56:invokevirtual   #345 <Method void _reportUnexpectedChar(int, String)>
			return;
	//   28   59:return          
		}
	}

	private final void _skipLine()
		throws IOException
	{
		int ai[] = CharTypes.getInputCodeComment();
	//    0    0:invokestatic    #317 <Method int[] CharTypes.getInputCodeComment()>
	//    1    3:astore_3        
		do
		{
			int i;
			int j;
			do
			{
				i = _inputData.readUnsignedByte();
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field DataInput _inputData>
	//    4    8:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//    5   13:istore_1        
				j = ai[i];
	//    6   14:aload_3         
	//    7   15:iload_1         
	//    8   16:iaload          
	//    9   17:istore_2        
			} while(j == 0);
	//   10   18:iload_2         
	//   11   19:ifeq            4
			if(j == 10 || j == 13)
				break;
	//   12   22:iload_2         
	//   13   23:bipush          10
	//   14   25:icmpeq          101
	//   15   28:iload_2         
	//   16   29:bipush          13
	//   17   31:icmpeq          101
			if(j != 42)
	//*  18   34:iload_2         
	//*  19   35:bipush          42
	//*  20   37:icmpeq          4
				switch(j)
	//*  21   40:iload_2         
				{
	//*  22   41:tableswitch     2 4: default 68
	//	               2 94
	//	               3 87
	//	               4 80
				default:
					if(j < 0)
	//*  23   68:iload_2         
	//*  24   69:ifge            4
						_reportInvalidChar(i);
	//   25   72:aload_0         
	//   26   73:iload_1         
	//   27   74:invokevirtual   #141 <Method void _reportInvalidChar(int)>
					break;

	//*  28   77:goto            4
				case 4: // '\004'
					_skipUtf8_4();
	//   29   80:aload_0         
	//   30   81:invokespecial   #320 <Method void _skipUtf8_4()>
					break;

	//*  31   84:goto            4
				case 3: // '\003'
					_skipUtf8_3();
	//   32   87:aload_0         
	//   33   88:invokespecial   #323 <Method void _skipUtf8_3()>
					break;

	//*  34   91:goto            4
				case 2: // '\002'
					_skipUtf8_2();
	//   35   94:aload_0         
	//   36   95:invokespecial   #326 <Method void _skipUtf8_2()>
					break;
				}
		} while(true);
	//   37   98:goto            4
		_currInputRow = _currInputRow + 1;
	//   38  101:aload_0         
	//   39  102:aload_0         
	//   40  103:getfield        #329 <Field int _currInputRow>
	//   41  106:iconst_1        
	//   42  107:iadd            
	//   43  108:putfield        #329 <Field int _currInputRow>
	//   44  111:return          
	}

	private final void _skipUtf8_2()
		throws IOException
	{
		int i = _inputData.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field DataInput _inputData>
	//    2    4:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//    3    9:istore_1        
		if((i & 0xc0) != 128)
	//*   4   10:iload_1         
	//*   5   11:sipush          192
	//*   6   14:iand            
	//*   7   15:sipush          128
	//*   8   18:icmpeq          30
			_reportInvalidOther(i & 0xff);
	//    9   21:aload_0         
	//   10   22:iload_1         
	//   11   23:sipush          255
	//   12   26:iand            
	//   13   27:invokespecial   #89  <Method void _reportInvalidOther(int)>
	//   14   30:return          
	}

	private final void _skipUtf8_3()
		throws IOException
	{
		int i = _inputData.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field DataInput _inputData>
	//    2    4:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//    3    9:istore_1        
		if((i & 0xc0) != 128)
	//*   4   10:iload_1         
	//*   5   11:sipush          192
	//*   6   14:iand            
	//*   7   15:sipush          128
	//*   8   18:icmpeq          30
			_reportInvalidOther(i & 0xff);
	//    9   21:aload_0         
	//   10   22:iload_1         
	//   11   23:sipush          255
	//   12   26:iand            
	//   13   27:invokespecial   #89  <Method void _reportInvalidOther(int)>
		i = _inputData.readUnsignedByte();
	//   14   30:aload_0         
	//   15   31:getfield        #53  <Field DataInput _inputData>
	//   16   34:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   17   39:istore_1        
		if((i & 0xc0) != 128)
	//*  18   40:iload_1         
	//*  19   41:sipush          192
	//*  20   44:iand            
	//*  21   45:sipush          128
	//*  22   48:icmpeq          60
			_reportInvalidOther(i & 0xff);
	//   23   51:aload_0         
	//   24   52:iload_1         
	//   25   53:sipush          255
	//   26   56:iand            
	//   27   57:invokespecial   #89  <Method void _reportInvalidOther(int)>
	//   28   60:return          
	}

	private final void _skipUtf8_4()
		throws IOException
	{
		int i = _inputData.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field DataInput _inputData>
	//    2    4:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//    3    9:istore_1        
		if((i & 0xc0) != 128)
	//*   4   10:iload_1         
	//*   5   11:sipush          192
	//*   6   14:iand            
	//*   7   15:sipush          128
	//*   8   18:icmpeq          30
			_reportInvalidOther(i & 0xff);
	//    9   21:aload_0         
	//   10   22:iload_1         
	//   11   23:sipush          255
	//   12   26:iand            
	//   13   27:invokespecial   #89  <Method void _reportInvalidOther(int)>
		i = _inputData.readUnsignedByte();
	//   14   30:aload_0         
	//   15   31:getfield        #53  <Field DataInput _inputData>
	//   16   34:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   17   39:istore_1        
		if((i & 0xc0) != 128)
	//*  18   40:iload_1         
	//*  19   41:sipush          192
	//*  20   44:iand            
	//*  21   45:sipush          128
	//*  22   48:icmpeq          60
			_reportInvalidOther(i & 0xff);
	//   23   51:aload_0         
	//   24   52:iload_1         
	//   25   53:sipush          255
	//   26   56:iand            
	//   27   57:invokespecial   #89  <Method void _reportInvalidOther(int)>
		i = _inputData.readUnsignedByte();
	//   28   60:aload_0         
	//   29   61:getfield        #53  <Field DataInput _inputData>
	//   30   64:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   31   69:istore_1        
		if((i & 0xc0) != 128)
	//*  32   70:iload_1         
	//*  33   71:sipush          192
	//*  34   74:iand            
	//*  35   75:sipush          128
	//*  36   78:icmpeq          90
			_reportInvalidOther(i & 0xff);
	//   37   81:aload_0         
	//   38   82:iload_1         
	//   39   83:sipush          255
	//   40   86:iand            
	//   41   87:invokespecial   #89  <Method void _reportInvalidOther(int)>
	//   42   90:return          
	}

	private final int _skipWS()
		throws IOException
	{
		int i = _nextByte;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int _nextByte>
	//    2    4:istore_1        
		if(i < 0)
	//*   3    5:iload_1         
	//*   4    6:ifge            22
			i = _inputData.readUnsignedByte();
	//    5    9:aload_0         
	//    6   10:getfield        #53  <Field DataInput _inputData>
	//    7   13:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//    8   18:istore_1        
		else
	//*   9   19:goto            27
			_nextByte = -1;
	//   10   22:aload_0         
	//   11   23:iconst_m1       
	//   12   24:putfield        #47  <Field int _nextByte>
		do
		{
			if(i > 32)
	//*  13   27:iload_1         
	//*  14   28:bipush          32
	//*  15   30:icmple          56
				if(i != 47 && i != 35)
	//*  16   33:iload_1         
	//*  17   34:bipush          47
	//*  18   36:icmpeq          50
	//*  19   39:iload_1         
	//*  20   40:bipush          35
	//*  21   42:icmpne          48
	//*  22   45:goto            50
					return i;
	//   23   48:iload_1         
	//   24   49:ireturn         
				else
					return _skipWSComment(i);
	//   25   50:aload_0         
	//   26   51:iload_1         
	//   27   52:invokespecial   #361 <Method int _skipWSComment(int)>
	//   28   55:ireturn         
			if(i == 13 || i == 10)
	//*  29   56:iload_1         
	//*  30   57:bipush          13
	//*  31   59:icmpeq          68
	//*  32   62:iload_1         
	//*  33   63:bipush          10
	//*  34   65:icmpne          78
				_currInputRow = _currInputRow + 1;
	//   35   68:aload_0         
	//   36   69:aload_0         
	//   37   70:getfield        #329 <Field int _currInputRow>
	//   38   73:iconst_1        
	//   39   74:iadd            
	//   40   75:putfield        #329 <Field int _currInputRow>
			i = _inputData.readUnsignedByte();
	//   41   78:aload_0         
	//   42   79:getfield        #53  <Field DataInput _inputData>
	//   43   82:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   44   87:istore_1        
		} while(true);
	//   45   88:goto            27
	}

	private final int _skipWSComment(int i)
		throws IOException
	{
		do
		{
			if(i > 32)
	//*   0    0:iload_1         
	//*   1    1:bipush          32
	//*   2    3:icmple          36
			{
				if(i == 47)
	//*   3    6:iload_1         
	//*   4    7:bipush          47
	//*   5    9:icmpne          19
					_skipComment();
	//    6   12:aload_0         
	//    7   13:invokespecial   #337 <Method void _skipComment()>
				else
	//*   8   16:goto            58
				if(i == 35)
	//*   9   19:iload_1         
	//*  10   20:bipush          35
	//*  11   22:icmpne          34
				{
					if(!_skipYAMLComment())
	//*  12   25:aload_0         
	//*  13   26:invokespecial   #340 <Method boolean _skipYAMLComment()>
	//*  14   29:ifne            58
						return i;
	//   15   32:iload_1         
	//   16   33:ireturn         
				} else
				{
					return i;
	//   17   34:iload_1         
	//   18   35:ireturn         
				}
			} else
			if(i == 13 || i == 10)
	//*  19   36:iload_1         
	//*  20   37:bipush          13
	//*  21   39:icmpeq          48
	//*  22   42:iload_1         
	//*  23   43:bipush          10
	//*  24   45:icmpne          58
				_currInputRow = _currInputRow + 1;
	//   25   48:aload_0         
	//   26   49:aload_0         
	//   27   50:getfield        #329 <Field int _currInputRow>
	//   28   53:iconst_1        
	//   29   54:iadd            
	//   30   55:putfield        #329 <Field int _currInputRow>
			i = _inputData.readUnsignedByte();
	//   31   58:aload_0         
	//   32   59:getfield        #53  <Field DataInput _inputData>
	//   33   62:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   34   67:istore_1        
		} while(true);
	//   35   68:goto            0
	}

	private final boolean _skipYAMLComment()
		throws IOException
	{
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #364 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_YAML_COMMENTS>
	//*   2    4:invokevirtual   #159 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   3    7:ifne            12
		{
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		} else
		{
			_skipLine();
	//    6   12:aload_0         
	//    7   13:invokespecial   #353 <Method void _skipLine()>
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		}
	}

	private final void _verifyRootSpace()
		throws IOException
	{
		int i = _nextByte;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int _nextByte>
	//    2    4:istore_1        
		if(i <= 32)
	//*   3    5:iload_1         
	//*   4    6:bipush          32
	//*   5    8:icmpgt          39
		{
			_nextByte = -1;
	//    6   11:aload_0         
	//    7   12:iconst_m1       
	//    8   13:putfield        #47  <Field int _nextByte>
			if(i == 13 || i == 10)
	//*   9   16:iload_1         
	//*  10   17:bipush          13
	//*  11   19:icmpeq          28
	//*  12   22:iload_1         
	//*  13   23:bipush          10
	//*  14   25:icmpne          38
				_currInputRow = _currInputRow + 1;
	//   15   28:aload_0         
	//   16   29:aload_0         
	//   17   30:getfield        #329 <Field int _currInputRow>
	//   18   33:iconst_1        
	//   19   34:iadd            
	//   20   35:putfield        #329 <Field int _currInputRow>
			return;
	//   21   38:return          
		} else
		{
			_reportMissingRootWS(i);
	//   22   39:aload_0         
	//   23   40:iload_1         
	//   24   41:invokevirtual   #367 <Method void _reportMissingRootWS(int)>
			return;
	//   25   44:return          
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
	//   33   44:getfield        #98  <Field TextBuffer _textBuffer>
	//   34   47:invokevirtual   #104 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
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
	//  112  193:invokevirtual   #372 <Method void _reportInvalidInitial(int)>
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
	//  123  214:ldc2            #374 <String " in field name">
	//  124  217:getstatic       #377 <Field JsonToken JsonToken.FIELD_NAME>
	//  125  220:invokevirtual   #381 <Method void _reportInvalidEOF(String, JsonToken)>
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
	//  151  261:invokespecial   #89  <Method void _reportInvalidOther(int)>
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
	//  188  321:invokespecial   #89  <Method void _reportInvalidOther(int)>
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
	//  231  393:invokespecial   #89  <Method void _reportInvalidOther(int)>
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
	//  247  424:ldc1            #92  <Int 0x10000>
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
	//  257  442:getfield        #98  <Field TextBuffer _textBuffer>
	//  258  445:invokevirtual   #384 <Method char[] TextBuffer.expandCurrentSegment()>
	//  259  448:astore          13
					ac1[j1] = (char)(55296 + (l >> 10));
	//  260  450:aload           13
	//  261  452:iload           6
	//  262  454:ldc1            #129 <Int 55296>
	//  263  456:iload           4
	//  264  458:bipush          10
	//  265  460:ishr            
	//  266  461:iadd            
	//  267  462:int2char        
	//  268  463:castore         
					l = 0xdc00 | l & 0x3ff;
	//  269  464:ldc1            #130 <Int 56320>
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
	//  293  509:getfield        #98  <Field TextBuffer _textBuffer>
	//  294  512:invokevirtual   #384 <Method char[] TextBuffer.expandCurrentSegment()>
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
	//  306  534:new             #69  <Class String>
	//  307  537:dup             
	//  308  538:aload           12
	//  309  540:iconst_0        
	//  310  541:iload           6
	//  311  543:invokespecial   #386 <Method void String(char[], int, int)>
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
	//  323  561:getfield        #51  <Field ByteQuadsCanonicalizer _symbols>
	//  324  564:aload           12
	//  325  566:aload_1         
	//  326  567:iload_2         
	//  327  568:invokevirtual   #391 <Method String ByteQuadsCanonicalizer.addName(String, int[], int)>
	//  328  571:areturn         
	}

	private final String findName(int i, int j)
		throws JsonParseException
	{
		i = pad(i, j);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #395 <Method int pad(int, int)>
	//    3    5:istore_1        
		String s = _symbols.findName(i);
	//    4    6:aload_0         
	//    5    7:getfield        #51  <Field ByteQuadsCanonicalizer _symbols>
	//    6   10:iload_1         
	//    7   11:invokevirtual   #397 <Method String ByteQuadsCanonicalizer.findName(int)>
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
	//   14   22:getfield        #45  <Field int[] _quadBuffer>
	//   15   25:iconst_0        
	//   16   26:iload_1         
	//   17   27:iastore         
			return addName(_quadBuffer, 1, j);
	//   18   28:aload_0         
	//   19   29:aload_0         
	//   20   30:getfield        #45  <Field int[] _quadBuffer>
	//   21   33:iconst_1        
	//   22   34:iload_2         
	//   23   35:invokespecial   #399 <Method String addName(int[], int, int)>
	//   24   38:areturn         
		}
	}

	private final String findName(int i, int j, int k)
		throws JsonParseException
	{
		j = pad(j, k);
	//    0    0:iload_2         
	//    1    1:iload_3         
	//    2    2:invokestatic    #395 <Method int pad(int, int)>
	//    3    5:istore_2        
		String s = _symbols.findName(i, j);
	//    4    6:aload_0         
	//    5    7:getfield        #51  <Field ByteQuadsCanonicalizer _symbols>
	//    6   10:iload_1         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #401 <Method String ByteQuadsCanonicalizer.findName(int, int)>
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
	//   15   26:getfield        #45  <Field int[] _quadBuffer>
	//   16   29:iconst_0        
	//   17   30:iload_1         
	//   18   31:iastore         
			_quadBuffer[1] = j;
	//   19   32:aload_0         
	//   20   33:getfield        #45  <Field int[] _quadBuffer>
	//   21   36:iconst_1        
	//   22   37:iload_2         
	//   23   38:iastore         
			return addName(_quadBuffer, 2, k);
	//   24   39:aload_0         
	//   25   40:aload_0         
	//   26   41:getfield        #45  <Field int[] _quadBuffer>
	//   27   44:iconst_2        
	//   28   45:iload_3         
	//   29   46:invokespecial   #399 <Method String addName(int[], int, int)>
	//   30   49:areturn         
		}
	}

	private final String findName(int i, int j, int k, int l)
		throws JsonParseException
	{
		k = pad(k, l);
	//    0    0:iload_3         
	//    1    1:iload           4
	//    2    3:invokestatic    #395 <Method int pad(int, int)>
	//    3    6:istore_3        
		String s = _symbols.findName(i, j, k);
	//    4    7:aload_0         
	//    5    8:getfield        #51  <Field ByteQuadsCanonicalizer _symbols>
	//    6   11:iload_1         
	//    7   12:iload_2         
	//    8   13:iload_3         
	//    9   14:invokevirtual   #402 <Method String ByteQuadsCanonicalizer.findName(int, int, int)>
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
	//   16   28:getfield        #45  <Field int[] _quadBuffer>
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
	//   30   49:invokestatic    #395 <Method int pad(int, int)>
	//   31   52:iastore         
			return addName(ai, 3, l);
	//   32   53:aload_0         
	//   33   54:aload           5
	//   34   56:iconst_3        
	//   35   57:iload           4
	//   36   59:invokespecial   #399 <Method String addName(int[], int, int)>
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
			ai1 = _growArrayBy(ai, ai.length);
	//    6    9:aload_1         
	//    7   10:aload_1         
	//    8   11:arraylength     
	//    9   12:invokestatic    #273 <Method int[] _growArrayBy(int[], int)>
	//   10   15:astore          6
			_quadBuffer = ai1;
	//   11   17:aload_0         
	//   12   18:aload           6
	//   13   20:putfield        #45  <Field int[] _quadBuffer>
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
	//   22   34:invokestatic    #395 <Method int pad(int, int)>
	//   23   37:iastore         
		ai = ((int []) (_symbols.findName(ai1, l)));
	//   24   38:aload_0         
	//   25   39:getfield        #51  <Field ByteQuadsCanonicalizer _symbols>
	//   26   42:aload           6
	//   27   44:iload           5
	//   28   46:invokevirtual   #405 <Method String ByteQuadsCanonicalizer.findName(int[], int)>
	//   29   49:astore_1        
		if(ai == null)
	//*  30   50:aload_1         
	//*  31   51:ifnonnull       65
			return addName(ai1, l, k);
	//   32   54:aload_0         
	//   33   55:aload           6
	//   34   57:iload           5
	//   35   59:iload           4
	//   36   61:invokespecial   #399 <Method String addName(int[], int, int)>
	//   37   64:areturn         
		else
			return ((String) (ai));
	//   38   65:aload_1         
	//   39   66:areturn         
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
	//    2    2:getfield        #45  <Field int[] _quadBuffer>
	//    3    5:iconst_0        
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:invokevirtual   #271 <Method String parseEscapedName(int[], int, int, int, int)>
	//    8   12:areturn         
	}

	private final String parseName(int i, int j, int k, int l)
		throws IOException
	{
		_quadBuffer[0] = i;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int[] _quadBuffer>
	//    2    4:iconst_0        
	//    3    5:iload_1         
	//    4    6:iastore         
		return parseEscapedName(_quadBuffer, 1, j, k, l);
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #45  <Field int[] _quadBuffer>
	//    8   12:iconst_1        
	//    9   13:iload_2         
	//   10   14:iload_3         
	//   11   15:iload           4
	//   12   17:invokevirtual   #271 <Method String parseEscapedName(int[], int, int, int, int)>
	//   13   20:areturn         
	}

	private final String parseName(int i, int j, int k, int l, int i1)
		throws IOException
	{
		_quadBuffer[0] = i;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int[] _quadBuffer>
	//    2    4:iconst_0        
	//    3    5:iload_1         
	//    4    6:iastore         
		_quadBuffer[1] = j;
	//    5    7:aload_0         
	//    6    8:getfield        #45  <Field int[] _quadBuffer>
	//    7   11:iconst_1        
	//    8   12:iload_2         
	//    9   13:iastore         
		return parseEscapedName(_quadBuffer, 2, k, l, i1);
	//   10   14:aload_0         
	//   11   15:aload_0         
	//   12   16:getfield        #45  <Field int[] _quadBuffer>
	//   13   19:iconst_2        
	//   14   20:iload_3         
	//   15   21:iload           4
	//   16   23:iload           5
	//   17   25:invokevirtual   #271 <Method String parseEscapedName(int[], int, int, int, int)>
	//   18   28:areturn         
	}

	protected void _closeInput()
		throws IOException
	{
	//    0    0:return          
	}

	protected final byte[] _decodeBase64(Base64Variant base64variant)
		throws IOException
	{
		Object obj = ((Object) (_getByteArrayBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #412 <Method ByteArrayBuilder _getByteArrayBuilder()>
	//    2    4:astore          7
		do
		{
			int j1;
			do
				j1 = _inputData.readUnsignedByte();
	//    3    6:aload_0         
	//    4    7:getfield        #53  <Field DataInput _inputData>
	//    5   10:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//    6   15:istore          4
			while(j1 <= 32);
	//    7   17:iload           4
	//    8   19:bipush          32
	//    9   21:icmple          6
			int i1 = base64variant.decodeBase64Char(j1);
	//   10   24:aload_1         
	//   11   25:iload           4
	//   12   27:invokevirtual   #417 <Method int Base64Variant.decodeBase64Char(int)>
	//   13   30:istore_3        
			int i = i1;
	//   14   31:iload_3         
	//   15   32:istore_2        
			if(i1 < 0)
	//*  16   33:iload_3         
	//*  17   34:ifge            68
			{
				if(j1 == 34)
	//*  18   37:iload           4
	//*  19   39:bipush          34
	//*  20   41:icmpne          50
					return ((ByteArrayBuilder) (obj)).toByteArray();
	//   21   44:aload           7
	//   22   46:invokevirtual   #423 <Method byte[] ByteArrayBuilder.toByteArray()>
	//   23   49:areturn         
				i1 = _decodeBase64Escape(base64variant, j1, 0);
	//   24   50:aload_0         
	//   25   51:aload_1         
	//   26   52:iload           4
	//   27   54:iconst_0        
	//   28   55:invokevirtual   #427 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//   29   58:istore_3        
				i = i1;
	//   30   59:iload_3         
	//   31   60:istore_2        
				if(i1 < 0)
	//*  32   61:iload_3         
	//*  33   62:ifge            68
					continue;
	//   34   65:goto            6
			}
			int k1 = _inputData.readUnsignedByte();
	//   35   68:aload_0         
	//   36   69:getfield        #53  <Field DataInput _inputData>
	//   37   72:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   38   77:istore          5
			j1 = base64variant.decodeBase64Char(k1);
	//   39   79:aload_1         
	//   40   80:iload           5
	//   41   82:invokevirtual   #417 <Method int Base64Variant.decodeBase64Char(int)>
	//   42   85:istore          4
			i1 = j1;
	//   43   87:iload           4
	//   44   89:istore_3        
			if(j1 < 0)
	//*  45   90:iload           4
	//*  46   92:ifge            104
				i1 = _decodeBase64Escape(base64variant, k1, 1);
	//   47   95:aload_0         
	//   48   96:aload_1         
	//   49   97:iload           5
	//   50   99:iconst_1        
	//   51  100:invokevirtual   #427 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//   52  103:istore_3        
			k1 = i << 6 | i1;
	//   53  104:iload_2         
	//   54  105:bipush          6
	//   55  107:ishl            
	//   56  108:iload_3         
	//   57  109:ior             
	//   58  110:istore          5
			int l1 = _inputData.readUnsignedByte();
	//   59  112:aload_0         
	//   60  113:getfield        #53  <Field DataInput _inputData>
	//   61  116:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   62  121:istore          6
			i1 = base64variant.decodeBase64Char(l1);
	//   63  123:aload_1         
	//   64  124:iload           6
	//   65  126:invokevirtual   #417 <Method int Base64Variant.decodeBase64Char(int)>
	//   66  129:istore_3        
			j1 = i1;
	//   67  130:iload_3         
	//   68  131:istore          4
			if(i1 < 0)
	//*  69  133:iload_3         
	//*  70  134:ifge            272
			{
				int j = i1;
	//   71  137:iload_3         
	//   72  138:istore_2        
				if(i1 != -2)
	//*  73  139:iload_3         
	//*  74  140:bipush          -2
	//*  75  142:icmpeq          183
				{
					if(l1 == 34 && !base64variant.usesPadding())
	//*  76  145:iload           6
	//*  77  147:bipush          34
	//*  78  149:icmpne          174
	//*  79  152:aload_1         
	//*  80  153:invokevirtual   #430 <Method boolean Base64Variant.usesPadding()>
	//*  81  156:ifne            174
					{
						((ByteArrayBuilder) (obj)).append(k1 >> 4);
	//   82  159:aload           7
	//   83  161:iload           5
	//   84  163:iconst_4        
	//   85  164:ishr            
	//   86  165:invokevirtual   #432 <Method void ByteArrayBuilder.append(int)>
						return ((ByteArrayBuilder) (obj)).toByteArray();
	//   87  168:aload           7
	//   88  170:invokevirtual   #423 <Method byte[] ByteArrayBuilder.toByteArray()>
	//   89  173:areturn         
					}
					j = _decodeBase64Escape(base64variant, l1, 2);
	//   90  174:aload_0         
	//   91  175:aload_1         
	//   92  176:iload           6
	//   93  178:iconst_2        
	//   94  179:invokevirtual   #427 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//   95  182:istore_2        
				}
				j1 = j;
	//   96  183:iload_2         
	//   97  184:istore          4
				if(j == -2)
	//*  98  186:iload_2         
	//*  99  187:bipush          -2
	//* 100  189:icmpne          272
				{
					int k = _inputData.readUnsignedByte();
	//  101  192:aload_0         
	//  102  193:getfield        #53  <Field DataInput _inputData>
	//  103  196:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//  104  201:istore_2        
					if(!base64variant.usesPaddingChar(k))
	//* 105  202:aload_1         
	//* 106  203:iload_2         
	//* 107  204:invokevirtual   #436 <Method boolean Base64Variant.usesPaddingChar(int)>
	//* 108  207:ifne            260
					{
						obj = ((Object) (new StringBuilder()));
	//  109  210:new             #294 <Class StringBuilder>
	//  110  213:dup             
	//  111  214:invokespecial   #296 <Method void StringBuilder()>
	//  112  217:astore          7
						((StringBuilder) (obj)).append("expected padding character '");
	//  113  219:aload           7
	//  114  221:ldc2            #438 <String "expected padding character '">
	//  115  224:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//  116  227:pop             
						((StringBuilder) (obj)).append(base64variant.getPaddingChar());
	//  117  228:aload           7
	//  118  230:aload_1         
	//  119  231:invokevirtual   #441 <Method char Base64Variant.getPaddingChar()>
	//  120  234:invokevirtual   #444 <Method StringBuilder StringBuilder.append(char)>
	//  121  237:pop             
						((StringBuilder) (obj)).append("'");
	//  122  238:aload           7
	//  123  240:ldc2            #446 <String "'">
	//  124  243:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//  125  246:pop             
						throw reportInvalidBase64Char(base64variant, k, 3, ((StringBuilder) (obj)).toString());
	//  126  247:aload_0         
	//  127  248:aload_1         
	//  128  249:iload_2         
	//  129  250:iconst_3        
	//  130  251:aload           7
	//  131  253:invokevirtual   #310 <Method String StringBuilder.toString()>
	//  132  256:invokevirtual   #450 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int, String)>
	//  133  259:athrow          
					}
					((ByteArrayBuilder) (obj)).append(k1 >> 4);
	//  134  260:aload           7
	//  135  262:iload           5
	//  136  264:iconst_4        
	//  137  265:ishr            
	//  138  266:invokevirtual   #432 <Method void ByteArrayBuilder.append(int)>
					continue;
	//  139  269:goto            6
				}
			}
			k1 = k1 << 6 | j1;
	//  140  272:iload           5
	//  141  274:bipush          6
	//  142  276:ishl            
	//  143  277:iload           4
	//  144  279:ior             
	//  145  280:istore          5
			l1 = _inputData.readUnsignedByte();
	//  146  282:aload_0         
	//  147  283:getfield        #53  <Field DataInput _inputData>
	//  148  286:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//  149  291:istore          6
			i1 = base64variant.decodeBase64Char(l1);
	//  150  293:aload_1         
	//  151  294:iload           6
	//  152  296:invokevirtual   #417 <Method int Base64Variant.decodeBase64Char(int)>
	//  153  299:istore_3        
			j1 = i1;
	//  154  300:iload_3         
	//  155  301:istore          4
			if(i1 < 0)
	//* 156  303:iload_3         
	//* 157  304:ifge            374
			{
				int l = i1;
	//  158  307:iload_3         
	//  159  308:istore_2        
				if(i1 != -2)
	//* 160  309:iload_3         
	//* 161  310:bipush          -2
	//* 162  312:icmpeq          353
				{
					if(l1 == 34 && !base64variant.usesPadding())
	//* 163  315:iload           6
	//* 164  317:bipush          34
	//* 165  319:icmpne          344
	//* 166  322:aload_1         
	//* 167  323:invokevirtual   #430 <Method boolean Base64Variant.usesPadding()>
	//* 168  326:ifne            344
					{
						((ByteArrayBuilder) (obj)).appendTwoBytes(k1 >> 2);
	//  169  329:aload           7
	//  170  331:iload           5
	//  171  333:iconst_2        
	//  172  334:ishr            
	//  173  335:invokevirtual   #453 <Method void ByteArrayBuilder.appendTwoBytes(int)>
						return ((ByteArrayBuilder) (obj)).toByteArray();
	//  174  338:aload           7
	//  175  340:invokevirtual   #423 <Method byte[] ByteArrayBuilder.toByteArray()>
	//  176  343:areturn         
					}
					l = _decodeBase64Escape(base64variant, l1, 3);
	//  177  344:aload_0         
	//  178  345:aload_1         
	//  179  346:iload           6
	//  180  348:iconst_3        
	//  181  349:invokevirtual   #427 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//  182  352:istore_2        
				}
				j1 = l;
	//  183  353:iload_2         
	//  184  354:istore          4
				if(l == -2)
	//* 185  356:iload_2         
	//* 186  357:bipush          -2
	//* 187  359:icmpne          374
				{
					((ByteArrayBuilder) (obj)).appendTwoBytes(k1 >> 2);
	//  188  362:aload           7
	//  189  364:iload           5
	//  190  366:iconst_2        
	//  191  367:ishr            
	//  192  368:invokevirtual   #453 <Method void ByteArrayBuilder.appendTwoBytes(int)>
					continue;
	//  193  371:goto            6
				}
			}
			((ByteArrayBuilder) (obj)).appendThreeBytes(k1 << 6 | j1);
	//  194  374:aload           7
	//  195  376:iload           5
	//  196  378:bipush          6
	//  197  380:ishl            
	//  198  381:iload           4
	//  199  383:ior             
	//  200  384:invokevirtual   #456 <Method void ByteArrayBuilder.appendThreeBytes(int)>
		} while(true);
	//  201  387:goto            6
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
			break MISSING_BLOCK_LABEL_225;
	//    6    8:iload_2         
	//    7    9:bipush          127
	//    8   11:icmple          225
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
	//   49   83:invokevirtual   #372 <Method void _reportInvalidInitial(int)>
		i = j;
	//   50   86:iload_2         
	//   51   87:istore_1        
		if(true) goto _L4; else goto _L3
	//   52   88:goto            30
_L3:
		int k = _inputData.readUnsignedByte();
	//   53   91:aload_0         
	//   54   92:getfield        #53  <Field DataInput _inputData>
	//   55   95:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   56  100:istore_3        
		if((k & 0xc0) != 128)
	//*  57  101:iload_3         
	//*  58  102:sipush          192
	//*  59  105:iand            
	//*  60  106:sipush          128
	//*  61  109:icmpeq          121
			_reportInvalidOther(k & 0xff);
	//   62  112:aload_0         
	//   63  113:iload_3         
	//   64  114:sipush          255
	//   65  117:iand            
	//   66  118:invokespecial   #89  <Method void _reportInvalidOther(int)>
		k = i << 6 | k & 0x3f;
	//   67  121:iload_1         
	//   68  122:bipush          6
	//   69  124:ishl            
	//   70  125:iload_3         
	//   71  126:bipush          63
	//   72  128:iand            
	//   73  129:ior             
	//   74  130:istore_3        
		i = k;
	//   75  131:iload_3         
	//   76  132:istore_1        
		if(j > 1)
	//*  77  133:iload_2         
	//*  78  134:iconst_1        
	//*  79  135:icmple          225
		{
			i = _inputData.readUnsignedByte();
	//   80  138:aload_0         
	//   81  139:getfield        #53  <Field DataInput _inputData>
	//   82  142:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   83  147:istore_1        
			if((i & 0xc0) != 128)
	//*  84  148:iload_1         
	//*  85  149:sipush          192
	//*  86  152:iand            
	//*  87  153:sipush          128
	//*  88  156:icmpeq          168
				_reportInvalidOther(i & 0xff);
	//   89  159:aload_0         
	//   90  160:iload_1         
	//   91  161:sipush          255
	//   92  164:iand            
	//   93  165:invokespecial   #89  <Method void _reportInvalidOther(int)>
			k = k << 6 | i & 0x3f;
	//   94  168:iload_3         
	//   95  169:bipush          6
	//   96  171:ishl            
	//   97  172:iload_1         
	//   98  173:bipush          63
	//   99  175:iand            
	//  100  176:ior             
	//  101  177:istore_3        
			i = k;
	//  102  178:iload_3         
	//  103  179:istore_1        
			if(j > 2)
	//* 104  180:iload_2         
	//* 105  181:iconst_2        
	//* 106  182:icmple          225
			{
				i = _inputData.readUnsignedByte();
	//  107  185:aload_0         
	//  108  186:getfield        #53  <Field DataInput _inputData>
	//  109  189:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//  110  194:istore_1        
				if((i & 0xc0) != 128)
	//* 111  195:iload_1         
	//* 112  196:sipush          192
	//* 113  199:iand            
	//* 114  200:sipush          128
	//* 115  203:icmpeq          215
					_reportInvalidOther(i & 0xff);
	//  116  206:aload_0         
	//  117  207:iload_1         
	//  118  208:sipush          255
	//  119  211:iand            
	//  120  212:invokespecial   #89  <Method void _reportInvalidOther(int)>
				i = k << 6 | i & 0x3f;
	//  121  215:iload_3         
	//  122  216:bipush          6
	//  123  218:ishl            
	//  124  219:iload_1         
	//  125  220:bipush          63
	//  126  222:iand            
	//  127  223:ior             
	//  128  224:istore_1        
			}
		}
		return i;
	//  129  225:iload_1         
	//  130  226:ireturn         
	}

	protected char _decodeEscaped()
		throws IOException
	{
		int i = _inputData.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field DataInput _inputData>
	//    2    4:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//    3    9:istore_1        
		if(i != 34 && i != 47 && i != 92)
	//*   4   10:iload_1         
	//*   5   11:bipush          34
	//*   6   13:icmpeq          157
	//*   7   16:iload_1         
	//*   8   17:bipush          47
	//*   9   19:icmpeq          157
	//*  10   22:iload_1         
	//*  11   23:bipush          92
	//*  12   25:icmpeq          157
		{
			if(i != 98)
	//*  13   28:iload_1         
	//*  14   29:bipush          98
	//*  15   31:icmpeq          154
			{
				if(i != 102)
	//*  16   34:iload_1         
	//*  17   35:bipush          102
	//*  18   37:icmpeq          151
				{
					if(i != 110)
	//*  19   40:iload_1         
	//*  20   41:bipush          110
	//*  21   43:icmpeq          148
					{
						if(i != 114)
	//*  22   46:iload_1         
	//*  23   47:bipush          114
	//*  24   49:icmpeq          145
							switch(i)
	//*  25   52:iload_1         
							{
	//*  26   53:tableswitch     116 117: default 76
	//	               116 142
	//	               117 87
							default:
								return _handleUnrecognizedCharacterEscape((char)_decodeCharForError(i));
	//   27   76:aload_0         
	//   28   77:aload_0         
	//   29   78:iload_1         
	//   30   79:invokevirtual   #61  <Method int _decodeCharForError(int)>
	//   31   82:int2char        
	//   32   83:invokevirtual   #460 <Method char _handleUnrecognizedCharacterEscape(char)>
	//   33   86:ireturn         

							case 117: // 'u'
								i = 0;
	//   34   87:iconst_0        
	//   35   88:istore_1        
								int j = 0;
	//   36   89:iconst_0        
	//   37   90:istore_2        
								for(; i < 4; i++)
	//*  38   91:iload_1         
	//*  39   92:iconst_4        
	//*  40   93:icmpge          139
								{
									int k = _inputData.readUnsignedByte();
	//   41   96:aload_0         
	//   42   97:getfield        #53  <Field DataInput _inputData>
	//   43  100:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   44  105:istore_3        
									int l = CharTypes.charToHex(k);
	//   45  106:iload_3         
	//   46  107:invokestatic    #463 <Method int CharTypes.charToHex(int)>
	//   47  110:istore          4
									if(l < 0)
	//*  48  112:iload           4
	//*  49  114:ifge            125
										_reportUnexpectedChar(k, "expected a hex-digit for character escape sequence");
	//   50  117:aload_0         
	//   51  118:iload_3         
	//   52  119:ldc2            #465 <String "expected a hex-digit for character escape sequence">
	//   53  122:invokevirtual   #345 <Method void _reportUnexpectedChar(int, String)>
									j = j << 4 | l;
	//   54  125:iload_2         
	//   55  126:iconst_4        
	//   56  127:ishl            
	//   57  128:iload           4
	//   58  130:ior             
	//   59  131:istore_2        
								}

	//   60  132:iload_1         
	//   61  133:iconst_1        
	//   62  134:iadd            
	//   63  135:istore_1        
	//*  64  136:goto            91
								return (char)j;
	//   65  139:iload_2         
	//   66  140:int2char        
	//   67  141:ireturn         

							case 116: // 't'
								return '\t';
	//   68  142:bipush          9
	//   69  144:ireturn         
							}
						else
							return '\r';
	//   70  145:bipush          13
	//   71  147:ireturn         
					} else
					{
						return '\n';
	//   72  148:bipush          10
	//   73  150:ireturn         
					}
				} else
				{
					return '\f';
	//   74  151:bipush          12
	//   75  153:ireturn         
				}
			} else
			{
				return '\b';
	//   76  154:bipush          8
	//   77  156:ireturn         
			}
		} else
		{
			return (char)i;
	//   78  157:iload_1         
	//   79  158:int2char        
	//   80  159:ireturn         
		}
	}

	protected void _finishString()
		throws IOException
	{
		char ac[] = _textBuffer.emptyAndGetCurrentSegment();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #104 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//    3    7:astore          5
		int ai[] = _icUTF8;
	//    4    9:getstatic       #32  <Field int[] _icUTF8>
	//    5   12:astore          6
		int i = 0;
	//    6   14:iconst_0        
	//    7   15:istore_1        
		int k = ac.length;
	//    8   16:aload           5
	//    9   18:arraylength     
	//   10   19:istore_3        
		do
		{
			int l = _inputData.readUnsignedByte();
	//   11   20:aload_0         
	//   12   21:getfield        #53  <Field DataInput _inputData>
	//   13   24:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   14   29:istore          4
			if(ai[l] != 0)
	//*  15   31:aload           6
	//*  16   33:iload           4
	//*  17   35:iaload          
	//*  18   36:ifeq            65
				if(l == 34)
	//*  19   39:iload           4
	//*  20   41:bipush          34
	//*  21   43:icmpne          55
				{
					_textBuffer.setCurrentLength(i);
	//   22   46:aload_0         
	//   23   47:getfield        #98  <Field TextBuffer _textBuffer>
	//   24   50:iload_1         
	//   25   51:invokevirtual   #121 <Method void TextBuffer.setCurrentLength(int)>
					return;
	//   26   54:return          
				} else
				{
					_finishString2(ac, i, l);
	//   27   55:aload_0         
	//   28   56:aload           5
	//   29   58:iload_1         
	//   30   59:iload           4
	//   31   61:invokespecial   #112 <Method void _finishString2(char[], int, int)>
					return;
	//   32   64:return          
				}
			int j = i + 1;
	//   33   65:iload_1         
	//   34   66:iconst_1        
	//   35   67:iadd            
	//   36   68:istore_2        
			ac[i] = (char)l;
	//   37   69:aload           5
	//   38   71:iload_1         
	//   39   72:iload           4
	//   40   74:int2char        
	//   41   75:castore         
			if(j >= k)
	//*  42   76:iload_2         
	//*  43   77:iload_3         
	//*  44   78:icmplt          98
			{
				_finishString2(ac, j, _inputData.readUnsignedByte());
	//   45   81:aload_0         
	//   46   82:aload           5
	//   47   84:iload_2         
	//   48   85:aload_0         
	//   49   86:getfield        #53  <Field DataInput _inputData>
	//   50   89:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   51   94:invokespecial   #112 <Method void _finishString2(char[], int, int)>
				return;
	//   52   97:return          
			}
			i = j;
	//   53   98:iload_2         
	//   54   99:istore_1        
		} while(true);
	//   55  100:goto            20
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
	//*   5    7:invokevirtual   #471 <Method int JsonToken.id()>
		{
	//*   6   10:tableswitch     5 8: default 40
	//	               5 53
	//	               6 45
	//	               7 45
	//	               8 45
		default:
			return jsontoken.asString();
	//    7   40:aload_1         
	//    8   41:invokevirtual   #474 <Method String JsonToken.asString()>
	//    9   44:areturn         

		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
			return _textBuffer.contentsAsString();
	//   10   45:aload_0         
	//   11   46:getfield        #98  <Field TextBuffer _textBuffer>
	//   12   49:invokevirtual   #115 <Method String TextBuffer.contentsAsString()>
	//   13   52:areturn         

		case 5: // '\005'
			return _parsingContext.getCurrentName();
	//   14   53:aload_0         
	//   15   54:getfield        #183 <Field JsonReadContext _parsingContext>
	//   16   57:invokevirtual   #477 <Method String JsonReadContext.getCurrentName()>
	//   17   60:areturn         
		}
	}

	protected JsonToken _handleApos()
		throws IOException
	{
		int i;
		char ac1[];
		int ai[];
		ac1 = _textBuffer.emptyAndGetCurrentSegment();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #104 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//    3    7:astore          6
		ai = _icUTF8;
	//    4    9:getstatic       #32  <Field int[] _icUTF8>
	//    5   12:astore          7
		i = 0;
	//    6   14:iconst_0        
	//    7   15:istore_1        
_L2:
		int k = ac1.length;
	//    8   16:aload           6
	//    9   18:arraylength     
	//   10   19:istore_3        
		char ac[] = ac1;
	//   11   20:aload           6
	//   12   22:astore          5
		int j = i;
	//   13   24:iload_1         
	//   14   25:istore_2        
		if(i >= ac1.length)
	//*  15   26:iload_1         
	//*  16   27:aload           6
	//*  17   29:arraylength     
	//*  18   30:icmplt          48
		{
			ac = _textBuffer.finishCurrentSegment();
	//   19   33:aload_0         
	//   20   34:getfield        #98  <Field TextBuffer _textBuffer>
	//   21   37:invokevirtual   #118 <Method char[] TextBuffer.finishCurrentSegment()>
	//   22   40:astore          5
			k = ac.length;
	//   23   42:aload           5
	//   24   44:arraylength     
	//   25   45:istore_3        
			j = 0;
	//   26   46:iconst_0        
	//   27   47:istore_2        
		}
		do
		{
			int l = _inputData.readUnsignedByte();
	//   28   48:aload_0         
	//   29   49:getfield        #53  <Field DataInput _inputData>
	//   30   52:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   31   57:istore          4
			if(l == 39)
	//*  32   59:iload           4
	//*  33   61:bipush          39
	//*  34   63:icmpne          78
			{
				_textBuffer.setCurrentLength(j);
	//   35   66:aload_0         
	//   36   67:getfield        #98  <Field TextBuffer _textBuffer>
	//   37   70:iload_2         
	//   38   71:invokevirtual   #121 <Method void TextBuffer.setCurrentLength(int)>
				return JsonToken.VALUE_STRING;
	//   39   74:getstatic       #211 <Field JsonToken JsonToken.VALUE_STRING>
	//   40   77:areturn         
			}
			if(ai[l] != 0)
	//*  41   78:aload           7
	//*  42   80:iload           4
	//*  43   82:iaload          
	//*  44   83:ifeq            282
			{
label0:
				{
					switch(ai[l])
	//*  45   86:aload           7
	//*  46   88:iload           4
	//*  47   90:iaload          
					{
	//*  48   91:tableswitch     1 4: default 120
	//	               1 228
	//	               2 218
	//	               3 208
	//	               4 138
					default:
						if(l < 32)
	//*  49  120:iload           4
	//*  50  122:bipush          32
	//*  51  124:icmpge          236
							_throwUnquotedSpace(l, "string value");
	//   52  127:aload_0         
	//   53  128:iload           4
	//   54  130:ldc1            #123 <String "string value">
	//   55  132:invokevirtual   #126 <Method void _throwUnquotedSpace(int, String)>
						break;

	//*  56  135:goto            236
					case 4: // '\004'
						l = _decodeUtf8_4(l);
	//   57  138:aload_0         
	//   58  139:iload           4
	//   59  141:invokespecial   #128 <Method int _decodeUtf8_4(int)>
	//   60  144:istore          4
						k = j + 1;
	//   61  146:iload_2         
	//   62  147:iconst_1        
	//   63  148:iadd            
	//   64  149:istore_3        
						ac[j] = (char)(0xd800 | l >> 10);
	//   65  150:aload           5
	//   66  152:iload_2         
	//   67  153:ldc1            #129 <Int 55296>
	//   68  155:iload           4
	//   69  157:bipush          10
	//   70  159:ishr            
	//   71  160:ior             
	//   72  161:int2char        
	//   73  162:castore         
						ac1 = ac;
	//   74  163:aload           5
	//   75  165:astore          6
						i = k;
	//   76  167:iload_3         
	//   77  168:istore_1        
						if(k >= ac.length)
	//*  78  169:iload_3         
	//*  79  170:aload           5
	//*  80  172:arraylength     
	//*  81  173:icmplt          187
						{
							ac1 = _textBuffer.finishCurrentSegment();
	//   82  176:aload_0         
	//   83  177:getfield        #98  <Field TextBuffer _textBuffer>
	//   84  180:invokevirtual   #118 <Method char[] TextBuffer.finishCurrentSegment()>
	//   85  183:astore          6
							i = 0;
	//   86  185:iconst_0        
	//   87  186:istore_1        
						}
						k = 0xdc00 | l & 0x3ff;
	//   88  187:ldc1            #130 <Int 56320>
	//   89  189:iload           4
	//   90  191:sipush          1023
	//   91  194:iand            
	//   92  195:ior             
	//   93  196:istore_3        
						ac = ac1;
	//   94  197:aload           6
	//   95  199:astore          5
						j = i;
	//   96  201:iload_1         
	//   97  202:istore_2        
						i = k;
	//   98  203:iload_3         
	//   99  204:istore_1        
						break label0;
	//  100  205:goto            245

					case 3: // '\003'
						i = _decodeUtf8_3(l);
	//  101  208:aload_0         
	//  102  209:iload           4
	//  103  211:invokespecial   #132 <Method int _decodeUtf8_3(int)>
	//  104  214:istore_1        
						break label0;
	//  105  215:goto            245

					case 2: // '\002'
						i = _decodeUtf8_2(l);
	//  106  218:aload_0         
	//  107  219:iload           4
	//  108  221:invokespecial   #134 <Method int _decodeUtf8_2(int)>
	//  109  224:istore_1        
						break label0;
	//  110  225:goto            245

					case 1: // '\001'
						i = ((int) (_decodeEscaped()));
	//  111  228:aload_0         
	//  112  229:invokevirtual   #138 <Method char _decodeEscaped()>
	//  113  232:istore_1        
						break label0;
	//  114  233:goto            245
					}
					_reportInvalidChar(l);
	//  115  236:aload_0         
	//  116  237:iload           4
	//  117  239:invokevirtual   #141 <Method void _reportInvalidChar(int)>
					i = l;
	//  118  242:iload           4
	//  119  244:istore_1        
				}
				ac1 = ac;
	//  120  245:aload           5
	//  121  247:astore          6
				k = j;
	//  122  249:iload_2         
	//  123  250:istore_3        
				if(j >= ac.length)
	//* 124  251:iload_2         
	//* 125  252:aload           5
	//* 126  254:arraylength     
	//* 127  255:icmplt          269
				{
					ac1 = _textBuffer.finishCurrentSegment();
	//  128  258:aload_0         
	//  129  259:getfield        #98  <Field TextBuffer _textBuffer>
	//  130  262:invokevirtual   #118 <Method char[] TextBuffer.finishCurrentSegment()>
	//  131  265:astore          6
					k = 0;
	//  132  267:iconst_0        
	//  133  268:istore_3        
				}
				ac1[k] = (char)i;
	//  134  269:aload           6
	//  135  271:iload_3         
	//  136  272:iload_1         
	//  137  273:int2char        
	//  138  274:castore         
				i = k + 1;
	//  139  275:iload_3         
	//  140  276:iconst_1        
	//  141  277:iadd            
	//  142  278:istore_1        
			} else
	//* 143  279:goto            16
			{
label1:
				{
					i = j + 1;
	//  144  282:iload_2         
	//  145  283:iconst_1        
	//  146  284:iadd            
	//  147  285:istore_1        
					ac[j] = (char)l;
	//  148  286:aload           5
	//  149  288:iload_2         
	//  150  289:iload           4
	//  151  291:int2char        
	//  152  292:castore         
					if(i < k)
						break label1;
	//  153  293:iload_1         
	//  154  294:iload_3         
	//  155  295:icmplt          305
					ac1 = ac;
	//  156  298:aload           5
	//  157  300:astore          6
				}
			}
			if(true)
				continue;
	//  158  302:goto            16
			j = i;
	//  159  305:iload_1         
	//  160  306:istore_2        
		} while(true);
	//  161  307:goto            48
		if(true) goto _L2; else goto _L1
_L1:
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
	//    4    6:icmpne          158
			i = _inputData.readUnsignedByte();
	//    5    9:aload_0         
	//    6   10:getfield        #53  <Field DataInput _inputData>
	//    7   13:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//    8   18:istore_1        
			String s;
			if(i == 78)
	//*   9   19:iload_1         
	//*  10   20:bipush          78
	//*  11   22:icmpne          45
			{
				if(flag)
	//*  12   25:iload_2         
	//*  13   26:ifeq            37
					s = "-INF";
	//   14   29:ldc2            #482 <String "-INF">
	//   15   32:astore          6
				else
	//*  16   34:goto            71
					s = "+INF";
	//   17   37:ldc2            #484 <String "+INF">
	//   18   40:astore          6
			} else
	//*  19   42:goto            71
			{
				j = i;
	//   20   45:iload_1         
	//   21   46:istore          5
				if(i != 110)
					break;
	//   22   48:iload_1         
	//   23   49:bipush          110
	//   24   51:icmpne          158
				if(flag)
	//*  25   54:iload_2         
	//*  26   55:ifeq            66
					s = "-Infinity";
	//   27   58:ldc2            #486 <String "-Infinity">
	//   28   61:astore          6
				else
	//*  29   63:goto            71
					s = "+Infinity";
	//   30   66:ldc2            #488 <String "+Infinity">
	//   31   69:astore          6
			}
			_matchToken(s, 3);
	//   32   71:aload_0         
	//   33   72:aload           6
	//   34   74:iconst_3        
	//   35   75:invokevirtual   #223 <Method void _matchToken(String, int)>
			if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
	//*  36   78:aload_0         
	//*  37   79:getstatic       #491 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  38   82:invokevirtual   #159 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  39   85:ifeq            111
			{
				double d;
				if(flag)
	//*  40   88:iload_2         
	//*  41   89:ifeq            99
					d = (-1.0D / 0.0D);
	//   42   92:ldc2w           #492 <Double (-1.0D / 0.0D)>
	//   43   95:dstore_3        
				else
	//*  44   96:goto            103
					d = (1.0D / 0.0D);
	//   45   99:ldc2w           #494 <Double (1.0D / 0.0D)>
	//   46  102:dstore_3        
				return resetAsNaN(s, d);
	//   47  103:aload_0         
	//   48  104:aload           6
	//   49  106:dload_3         
	//   50  107:invokevirtual   #499 <Method JsonToken resetAsNaN(String, double)>
	//   51  110:areturn         
			}
			StringBuilder stringbuilder = new StringBuilder();
	//   52  111:new             #294 <Class StringBuilder>
	//   53  114:dup             
	//   54  115:invokespecial   #296 <Method void StringBuilder()>
	//   55  118:astore          7
			stringbuilder.append("Non-standard token '");
	//   56  120:aload           7
	//   57  122:ldc2            #501 <String "Non-standard token '">
	//   58  125:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   59  128:pop             
			stringbuilder.append(s);
	//   60  129:aload           7
	//   61  131:aload           6
	//   62  133:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   63  136:pop             
			stringbuilder.append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
	//   64  137:aload           7
	//   65  139:ldc2            #503 <String "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//   66  142:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   67  145:pop             
			_reportError(stringbuilder.toString());
	//   68  146:aload_0         
	//   69  147:aload           7
	//   70  149:invokevirtual   #310 <Method String StringBuilder.toString()>
	//   71  152:invokevirtual   #313 <Method void _reportError(String)>
		} while(true);
	//   72  155:goto            0
		reportUnexpectedNumberChar(j, "expected digit (0-9) to follow minus sign, for valid numeric value");
	//   73  158:aload_0         
	//   74  159:iload           5
	//   75  161:ldc2            #505 <String "expected digit (0-9) to follow minus sign, for valid numeric value">
	//   76  164:invokevirtual   #246 <Method void reportUnexpectedNumberChar(int, String)>
		return null;
	//   77  167:aconst_null     
	//   78  168:areturn         
	}

	protected String _handleOddName(int i)
		throws IOException
	{
		if(i == 39 && isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES))
	//*   0    0:iload_1         
	//*   1    1:bipush          39
	//*   2    3:icmpne          21
	//*   3    6:aload_0         
	//*   4    7:getstatic       #509 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_SINGLE_QUOTES>
	//*   5   10:invokevirtual   #159 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   6   13:ifeq            21
			return _parseAposName();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #512 <Method String _parseAposName()>
	//    9   20:areturn         
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES))
	//*  10   21:aload_0         
	//*  11   22:getstatic       #515 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_UNQUOTED_FIELD_NAMES>
	//*  12   25:invokevirtual   #159 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  13   28:ifne            44
			_reportUnexpectedChar(((int) ((char)_decodeCharForError(i))), "was expecting double-quote to start field name");
	//   14   31:aload_0         
	//   15   32:aload_0         
	//   16   33:iload_1         
	//   17   34:invokevirtual   #61  <Method int _decodeCharForError(int)>
	//   18   37:int2char        
	//   19   38:ldc2            #517 <String "was expecting double-quote to start field name">
	//   20   41:invokevirtual   #345 <Method void _reportUnexpectedChar(int, String)>
		int ai3[] = CharTypes.getInputCodeUtf8JsNames();
	//   21   44:invokestatic    #520 <Method int[] CharTypes.getInputCodeUtf8JsNames()>
	//   22   47:astore          11
		if(ai3[i] != 0)
	//*  23   49:aload           11
	//*  24   51:iload_1         
	//*  25   52:iaload          
	//*  26   53:ifeq            64
			_reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
	//   27   56:aload_0         
	//   28   57:iload_1         
	//   29   58:ldc2            #522 <String "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name">
	//   30   61:invokevirtual   #345 <Method void _reportUnexpectedChar(int, String)>
		int ai1[] = _quadBuffer;
	//   31   64:aload_0         
	//   32   65:getfield        #45  <Field int[] _quadBuffer>
	//   33   68:astore          10
		int l1 = 0;
	//   34   70:iconst_0        
	//   35   71:istore          7
		int j1 = 0;
	//   36   73:iconst_0        
	//   37   74:istore          5
		int k1 = j1;
	//   38   76:iload           5
	//   39   78:istore          6
		int j = i;
	//   40   80:iload_1         
	//   41   81:istore_2        
		int l;
		int i1;
		int i2;
		int ai[];
		do
		{
			if(l1 < 4)
	//*  42   82:iload           7
	//*  43   84:iconst_4        
	//*  44   85:icmpge          112
			{
				i = l1 + 1;
	//   45   88:iload           7
	//   46   90:iconst_1        
	//   47   91:iadd            
	//   48   92:istore_1        
				i1 = k1 << 8 | j;
	//   49   93:iload           6
	//   50   95:bipush          8
	//   51   97:ishl            
	//   52   98:iload_2         
	//   53   99:ior             
	//   54  100:istore          4
				l = j1;
	//   55  102:iload           5
	//   56  104:istore_3        
				ai = ai1;
	//   57  105:aload           10
	//   58  107:astore          9
			} else
	//*  59  109:goto            157
			{
				ai = ai1;
	//   60  112:aload           10
	//   61  114:astore          9
				if(j1 >= ai1.length)
	//*  62  116:iload           5
	//*  63  118:aload           10
	//*  64  120:arraylength     
	//*  65  121:icmplt          140
				{
					ai = _growArrayBy(ai1, ai1.length);
	//   66  124:aload           10
	//   67  126:aload           10
	//   68  128:arraylength     
	//   69  129:invokestatic    #273 <Method int[] _growArrayBy(int[], int)>
	//   70  132:astore          9
					_quadBuffer = ai;
	//   71  134:aload_0         
	//   72  135:aload           9
	//   73  137:putfield        #45  <Field int[] _quadBuffer>
				}
				ai[j1] = k1;
	//   74  140:aload           9
	//   75  142:iload           5
	//   76  144:iload           6
	//   77  146:iastore         
				l = j1 + 1;
	//   78  147:iload           5
	//   79  149:iconst_1        
	//   80  150:iadd            
	//   81  151:istore_3        
				i = 1;
	//   82  152:iconst_1        
	//   83  153:istore_1        
				i1 = j;
	//   84  154:iload_2         
	//   85  155:istore          4
			}
			i2 = _inputData.readUnsignedByte();
	//   86  157:aload_0         
	//   87  158:getfield        #53  <Field DataInput _inputData>
	//   88  161:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   89  166:istore          8
			j = i2;
	//   90  168:iload           8
	//   91  170:istore_2        
			l1 = i;
	//   92  171:iload_1         
	//   93  172:istore          7
			j1 = l;
	//   94  174:iload_3         
	//   95  175:istore          5
			ai1 = ai;
	//   96  177:aload           9
	//   97  179:astore          10
			k1 = i1;
	//   98  181:iload           4
	//   99  183:istore          6
		} while(ai3[i2] == 0);
	//  100  185:aload           11
	//  101  187:iload           8
	//  102  189:iaload          
	//  103  190:ifeq            82
		_nextByte = i2;
	//  104  193:aload_0         
	//  105  194:iload           8
	//  106  196:putfield        #47  <Field int _nextByte>
		if(i > 0)
	//* 107  199:iload_1         
	//* 108  200:ifle            249
		{
			int ai2[] = ai;
	//  109  203:aload           9
	//  110  205:astore          10
			if(l >= ai.length)
	//* 111  207:iload_3         
	//* 112  208:aload           9
	//* 113  210:arraylength     
	//* 114  211:icmplt          230
			{
				ai2 = _growArrayBy(ai, ai.length);
	//  115  214:aload           9
	//  116  216:aload           9
	//  117  218:arraylength     
	//  118  219:invokestatic    #273 <Method int[] _growArrayBy(int[], int)>
	//  119  222:astore          10
				_quadBuffer = ai2;
	//  120  224:aload_0         
	//  121  225:aload           10
	//  122  227:putfield        #45  <Field int[] _quadBuffer>
			}
			int k = l + 1;
	//  123  230:iload_3         
	//  124  231:iconst_1        
	//  125  232:iadd            
	//  126  233:istore_2        
			ai2[l] = i1;
	//  127  234:aload           10
	//  128  236:iload_3         
	//  129  237:iload           4
	//  130  239:iastore         
			l = k;
	//  131  240:iload_2         
	//  132  241:istore_3        
			ai = ai2;
	//  133  242:aload           10
	//  134  244:astore          9
		}
	//* 135  246:goto            249
		String s1 = _symbols.findName(ai, l);
	//  136  249:aload_0         
	//  137  250:getfield        #51  <Field ByteQuadsCanonicalizer _symbols>
	//  138  253:aload           9
	//  139  255:iload_3         
	//  140  256:invokevirtual   #405 <Method String ByteQuadsCanonicalizer.findName(int[], int)>
	//  141  259:astore          11
		String s = s1;
	//  142  261:aload           11
	//  143  263:astore          10
		if(s1 == null)
	//* 144  265:aload           11
	//* 145  267:ifnonnull       280
			s = addName(ai, l, i);
	//  146  270:aload_0         
	//  147  271:aload           9
	//  148  273:iload_3         
	//  149  274:iload_1         
	//  150  275:invokespecial   #399 <Method String addName(int[], int, int)>
	//  151  278:astore          10
		return s;
	//  152  280:aload           10
	//  153  282:areturn         
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
	//    2    3:icmpeq          191
							if(i == 73)
								break label2;
	//    3    6:iload_1         
	//    4    7:bipush          73
	//    5    9:icmpeq          152
							if(i == 78)
								break label3;
	//    6   12:iload_1         
	//    7   13:bipush          78
	//    8   15:icmpeq          113
							if(i != 93)
	//*   9   18:iload_1         
	//*  10   19:bipush          93
	//*  11   21:icmpeq          70
							{
								if(i == 125)
									break label4;
	//   12   24:iload_1         
	//   13   25:bipush          125
	//   14   27:icmpeq          102
								switch(i)
	//*  15   30:iload_1         
								{
	//*  16   31:tableswitch     43 44: default 52
	//	               43 55
	//	               44 83
								default:
									break label0;
	//   17   52:goto            206

								case 43: // '+'
									return _handleInvalidNumberStart(_inputData.readUnsignedByte(), false);
	//   18   55:aload_0         
	//   19   56:aload_0         
	//   20   57:getfield        #53  <Field DataInput _inputData>
	//   21   60:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   22   65:iconst_0        
	//   23   66:invokevirtual   #524 <Method JsonToken _handleInvalidNumberStart(int, boolean)>
	//   24   69:areturn         

								case 44: // ','
									break;
								}
							} else
							if(!_parsingContext.inArray())
	//*  25   70:aload_0         
	//*  26   71:getfield        #183 <Field JsonReadContext _parsingContext>
	//*  27   74:invokevirtual   #527 <Method boolean JsonReadContext.inArray()>
	//*  28   77:ifne            83
								break label0;
	//   29   80:goto            206
							if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES))
	//*  30   83:aload_0         
	//*  31   84:getstatic       #530 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_MISSING_VALUES>
	//*  32   87:invokevirtual   #159 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  33   90:ifeq            102
							{
								_nextByte = i;
	//   34   93:aload_0         
	//   35   94:iload_1         
	//   36   95:putfield        #47  <Field int _nextByte>
								return JsonToken.VALUE_NULL;
	//   37   98:getstatic       #231 <Field JsonToken JsonToken.VALUE_NULL>
	//   38  101:areturn         
							}
						}
						_reportUnexpectedChar(i, "expected a value");
	//   39  102:aload_0         
	//   40  103:iload_1         
	//   41  104:ldc2            #532 <String "expected a value">
	//   42  107:invokevirtual   #345 <Method void _reportUnexpectedChar(int, String)>
						break label1;
	//   43  110:goto            191
					}
					_matchToken("NaN", 1);
	//   44  113:aload_0         
	//   45  114:ldc2            #534 <String "NaN">
	//   46  117:iconst_1        
	//   47  118:invokevirtual   #223 <Method void _matchToken(String, int)>
					if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
	//*  48  121:aload_0         
	//*  49  122:getstatic       #491 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  50  125:invokevirtual   #159 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  51  128:ifeq            142
						return resetAsNaN("NaN", (0.0D / 0.0D));
	//   52  131:aload_0         
	//   53  132:ldc2            #534 <String "NaN">
	//   54  135:ldc2w           #535 <Double (0.0D / 0.0D)>
	//   55  138:invokevirtual   #499 <Method JsonToken resetAsNaN(String, double)>
	//   56  141:areturn         
					_reportError("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
	//   57  142:aload_0         
	//   58  143:ldc2            #538 <String "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//   59  146:invokevirtual   #313 <Method void _reportError(String)>
					break label0;
	//   60  149:goto            206
				}
				_matchToken("Infinity", 1);
	//   61  152:aload_0         
	//   62  153:ldc2            #540 <String "Infinity">
	//   63  156:iconst_1        
	//   64  157:invokevirtual   #223 <Method void _matchToken(String, int)>
				if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
	//*  65  160:aload_0         
	//*  66  161:getstatic       #491 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  67  164:invokevirtual   #159 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  68  167:ifeq            181
					return resetAsNaN("Infinity", (1.0D / 0.0D));
	//   69  170:aload_0         
	//   70  171:ldc2            #540 <String "Infinity">
	//   71  174:ldc2w           #494 <Double (1.0D / 0.0D)>
	//   72  177:invokevirtual   #499 <Method JsonToken resetAsNaN(String, double)>
	//   73  180:areturn         
				_reportError("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
	//   74  181:aload_0         
	//   75  182:ldc2            #542 <String "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//   76  185:invokevirtual   #313 <Method void _reportError(String)>
				break label0;
	//   77  188:goto            206
			}
			if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES))
	//*  78  191:aload_0         
	//*  79  192:getstatic       #509 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_SINGLE_QUOTES>
	//*  80  195:invokevirtual   #159 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  81  198:ifeq            206
				return _handleApos();
	//   82  201:aload_0         
	//   83  202:invokevirtual   #544 <Method JsonToken _handleApos()>
	//   84  205:areturn         
		}
		if(Character.isJavaIdentifierStart(i))
	//*  85  206:iload_1         
	//*  86  207:invokestatic    #547 <Method boolean Character.isJavaIdentifierStart(int)>
	//*  87  210:ifeq            248
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   88  213:new             #294 <Class StringBuilder>
	//   89  216:dup             
	//   90  217:invokespecial   #296 <Method void StringBuilder()>
	//   91  220:astore_2        
			stringbuilder.append("");
	//   92  221:aload_2         
	//   93  222:ldc2            #549 <String "">
	//   94  225:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   95  228:pop             
			stringbuilder.append((char)i);
	//   96  229:aload_2         
	//   97  230:iload_1         
	//   98  231:int2char        
	//   99  232:invokevirtual   #444 <Method StringBuilder StringBuilder.append(char)>
	//  100  235:pop             
			_reportInvalidToken(i, stringbuilder.toString(), "('true', 'false' or 'null')");
	//  101  236:aload_0         
	//  102  237:iload_1         
	//  103  238:aload_2         
	//  104  239:invokevirtual   #310 <Method String StringBuilder.toString()>
	//  105  242:ldc2            #551 <String "('true', 'false' or 'null')">
	//  106  245:invokevirtual   #554 <Method void _reportInvalidToken(int, String, String)>
		}
		_reportUnexpectedChar(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
	//  107  248:aload_0         
	//  108  249:iload_1         
	//  109  250:ldc2            #556 <String "expected a valid value (number, String, array, object, 'true', 'false' or 'null')">
	//  110  253:invokevirtual   #345 <Method void _reportUnexpectedChar(int, String)>
		return null;
	//  111  256:aconst_null     
	//  112  257:areturn         
	}

	protected final void _matchToken(String s, int i)
		throws IOException
	{
		int k = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #559 <Method int String.length()>
	//    2    4:istore          4
		int j;
		do
		{
			j = _inputData.readUnsignedByte();
	//    3    6:aload_0         
	//    4    7:getfield        #53  <Field DataInput _inputData>
	//    5   10:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//    6   15:istore_3        
			if(j != s.charAt(i))
	//*   7   16:iload_3         
	//*   8   17:aload_1         
	//*   9   18:iload_2         
	//*  10   19:invokevirtual   #563 <Method char String.charAt(int)>
	//*  11   22:icmpeq          36
				_reportInvalidToken(j, s.substring(0, i));
	//   12   25:aload_0         
	//   13   26:iload_3         
	//   14   27:aload_1         
	//   15   28:iconst_0        
	//   16   29:iload_2         
	//   17   30:invokevirtual   #73  <Method String String.substring(int, int)>
	//   18   33:invokevirtual   #77  <Method void _reportInvalidToken(int, String)>
			j = i + 1;
	//   19   36:iload_2         
	//   20   37:iconst_1        
	//   21   38:iadd            
	//   22   39:istore_3        
			i = j;
	//   23   40:iload_3         
	//   24   41:istore_2        
		} while(j < k);
	//   25   42:iload_3         
	//   26   43:iload           4
	//   27   45:icmplt          6
		i = _inputData.readUnsignedByte();
	//   28   48:aload_0         
	//   29   49:getfield        #53  <Field DataInput _inputData>
	//   30   52:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   31   57:istore_2        
		if(i >= 48 && i != 93 && i != 125)
	//*  32   58:iload_2         
	//*  33   59:bipush          48
	//*  34   61:icmplt          83
	//*  35   64:iload_2         
	//*  36   65:bipush          93
	//*  37   67:icmpeq          83
	//*  38   70:iload_2         
	//*  39   71:bipush          125
	//*  40   73:icmpeq          83
			_checkMatchEnd(s, j, i);
	//   41   76:aload_0         
	//   42   77:aload_1         
	//   43   78:iload_3         
	//   44   79:iload_2         
	//   45   80:invokespecial   #565 <Method void _checkMatchEnd(String, int, int)>
		_nextByte = i;
	//   46   83:aload_0         
	//   47   84:iload_2         
	//   48   85:putfield        #47  <Field int _nextByte>
	//   49   88:return          
	}

	protected String _parseAposName()
		throws IOException
	{
		int l = _inputData.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field DataInput _inputData>
	//    2    4:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//    3    9:istore          4
		if(l == 39)
	//*   4   11:iload           4
	//*   5   13:bipush          39
	//*   6   15:icmpne          22
			return "";
	//    7   18:ldc2            #549 <String "">
	//    8   21:areturn         
		int ai[] = _quadBuffer;
	//    9   22:aload_0         
	//   10   23:getfield        #45  <Field int[] _quadBuffer>
	//   11   26:astore          10
		Object obj1 = ((Object) (_icLatin1));
	//   12   28:getstatic       #37  <Field int[] _icLatin1>
	//   13   31:astore          12
		int j = 0;
	//   14   33:iconst_0        
	//   15   34:istore_2        
		int i = j;
	//   16   35:iload_2         
	//   17   36:istore_1        
		int k = i;
	//   18   37:iload_1         
	//   19   38:istore_3        
		do
		{
			if(l == 39)
	//*  20   39:iload           4
	//*  21   41:bipush          39
	//*  22   43:icmpne          135
			{
				if(j > 0)
	//*  23   46:iload_2         
	//*  24   47:ifle            101
				{
					int ai1[] = ai;
	//   25   50:aload           10
	//   26   52:astore          11
					if(i >= ai.length)
	//*  27   54:iload_1         
	//*  28   55:aload           10
	//*  29   57:arraylength     
	//*  30   58:icmplt          77
					{
						ai1 = _growArrayBy(ai, ai.length);
	//   31   61:aload           10
	//   32   63:aload           10
	//   33   65:arraylength     
	//   34   66:invokestatic    #273 <Method int[] _growArrayBy(int[], int)>
	//   35   69:astore          11
						_quadBuffer = ai1;
	//   36   71:aload_0         
	//   37   72:aload           11
	//   38   74:putfield        #45  <Field int[] _quadBuffer>
					}
					l = i + 1;
	//   39   77:iload_1         
	//   40   78:iconst_1        
	//   41   79:iadd            
	//   42   80:istore          4
					ai1[i] = pad(k, j);
	//   43   82:aload           11
	//   44   84:iload_1         
	//   45   85:iload_3         
	//   46   86:iload_2         
	//   47   87:invokestatic    #395 <Method int pad(int, int)>
	//   48   90:iastore         
					i = l;
	//   49   91:iload           4
	//   50   93:istore_1        
					ai = ai1;
	//   51   94:aload           11
	//   52   96:astore          10
				}
	//*  53   98:goto            101
				obj1 = ((Object) (_symbols.findName(ai, i)));
	//   54  101:aload_0         
	//   55  102:getfield        #51  <Field ByteQuadsCanonicalizer _symbols>
	//   56  105:aload           10
	//   57  107:iload_1         
	//   58  108:invokevirtual   #405 <Method String ByteQuadsCanonicalizer.findName(int[], int)>
	//   59  111:astore          12
				Object obj = obj1;
	//   60  113:aload           12
	//   61  115:astore          11
				if(obj1 == null)
	//*  62  117:aload           12
	//*  63  119:ifnonnull       132
					obj = ((Object) (addName(ai, i, j)));
	//   64  122:aload_0         
	//   65  123:aload           10
	//   66  125:iload_1         
	//   67  126:iload_2         
	//   68  127:invokespecial   #399 <Method String addName(int[], int, int)>
	//   69  130:astore          11
				return ((String) (obj));
	//   70  132:aload           11
	//   71  134:areturn         
			}
			int i1 = l;
	//   72  135:iload           4
	//   73  137:istore          5
			int i2 = j;
	//   74  139:iload_2         
	//   75  140:istore          9
			int k1 = i;
	//   76  142:iload_1         
	//   77  143:istore          7
			int ai2[] = ai;
	//   78  145:aload           10
	//   79  147:astore          11
			int l1 = k;
	//   80  149:iload_3         
	//   81  150:istore          8
			if(l != 34)
	//*  82  152:iload           4
	//*  83  154:bipush          34
	//*  84  156:icmpeq          473
			{
				i1 = l;
	//   85  159:iload           4
	//   86  161:istore          5
				i2 = j;
	//   87  163:iload_2         
	//   88  164:istore          9
				k1 = i;
	//   89  166:iload_1         
	//   90  167:istore          7
				ai2 = ai;
	//   91  169:aload           10
	//   92  171:astore          11
				l1 = k;
	//   93  173:iload_3         
	//   94  174:istore          8
				if(obj1[l] != 0)
	//*  95  176:aload           12
	//*  96  178:iload           4
	//*  97  180:iaload          
	//*  98  181:ifeq            473
				{
					int j1;
					if(l != 92)
	//*  99  184:iload           4
	//* 100  186:bipush          92
	//* 101  188:icmpeq          207
					{
						_throwUnquotedSpace(l, "name");
	//  102  191:aload_0         
	//  103  192:iload           4
	//  104  194:ldc2            #567 <String "name">
	//  105  197:invokevirtual   #126 <Method void _throwUnquotedSpace(int, String)>
						j1 = l;
	//  106  200:iload           4
	//  107  202:istore          6
					} else
	//* 108  204:goto            213
					{
						j1 = ((int) (_decodeEscaped()));
	//  109  207:aload_0         
	//  110  208:invokevirtual   #138 <Method char _decodeEscaped()>
	//  111  211:istore          6
					}
					i1 = j1;
	//  112  213:iload           6
	//  113  215:istore          5
					i2 = j;
	//  114  217:iload_2         
	//  115  218:istore          9
					k1 = i;
	//  116  220:iload_1         
	//  117  221:istore          7
					ai2 = ai;
	//  118  223:aload           10
	//  119  225:astore          11
					l1 = k;
	//  120  227:iload_3         
	//  121  228:istore          8
					if(j1 > 127)
	//* 122  230:iload           6
	//* 123  232:bipush          127
	//* 124  234:icmple          473
					{
						i1 = j;
	//  125  237:iload_2         
	//  126  238:istore          5
						l = i;
	//  127  240:iload_1         
	//  128  241:istore          4
						ai2 = ai;
	//  129  243:aload           10
	//  130  245:astore          11
						k1 = k;
	//  131  247:iload_3         
	//  132  248:istore          7
						if(j >= 4)
	//* 133  250:iload_2         
	//* 134  251:iconst_4        
	//* 135  252:icmplt          299
						{
							ai2 = ai;
	//  136  255:aload           10
	//  137  257:astore          11
							if(i >= ai.length)
	//* 138  259:iload_1         
	//* 139  260:aload           10
	//* 140  262:arraylength     
	//* 141  263:icmplt          282
							{
								ai2 = _growArrayBy(ai, ai.length);
	//  142  266:aload           10
	//  143  268:aload           10
	//  144  270:arraylength     
	//  145  271:invokestatic    #273 <Method int[] _growArrayBy(int[], int)>
	//  146  274:astore          11
								_quadBuffer = ai2;
	//  147  276:aload_0         
	//  148  277:aload           11
	//  149  279:putfield        #45  <Field int[] _quadBuffer>
							}
							ai2[i] = k;
	//  150  282:aload           11
	//  151  284:iload_1         
	//  152  285:iload_3         
	//  153  286:iastore         
							l = i + 1;
	//  154  287:iload_1         
	//  155  288:iconst_1        
	//  156  289:iadd            
	//  157  290:istore          4
							i1 = 0;
	//  158  292:iconst_0        
	//  159  293:istore          5
							k1 = i1;
	//  160  295:iload           5
	//  161  297:istore          7
						}
						if(j1 < 2048)
	//* 162  299:iload           6
	//* 163  301:sipush          2048
	//* 164  304:icmpge          335
						{
							j = k1 << 8 | (0xc0 | j1 >> 6);
	//  165  307:iload           7
	//  166  309:bipush          8
	//  167  311:ishl            
	//  168  312:sipush          192
	//  169  315:iload           6
	//  170  317:bipush          6
	//  171  319:ishr            
	//  172  320:ior             
	//  173  321:ior             
	//  174  322:istore_2        
							i = i1 + 1;
	//  175  323:iload           5
	//  176  325:iconst_1        
	//  177  326:iadd            
	//  178  327:istore_1        
							ai = ai2;
	//  179  328:aload           11
	//  180  330:astore          10
						} else
	//* 181  332:goto            448
						{
							k1 = k1 << 8 | (0xe0 | j1 >> 12);
	//  182  335:iload           7
	//  183  337:bipush          8
	//  184  339:ishl            
	//  185  340:sipush          224
	//  186  343:iload           6
	//  187  345:bipush          12
	//  188  347:ishr            
	//  189  348:ior             
	//  190  349:ior             
	//  191  350:istore          7
							i1++;
	//  192  352:iload           5
	//  193  354:iconst_1        
	//  194  355:iadd            
	//  195  356:istore          5
							k = i1;
	//  196  358:iload           5
	//  197  360:istore_3        
							i = l;
	//  198  361:iload           4
	//  199  363:istore_1        
							ai = ai2;
	//  200  364:aload           11
	//  201  366:astore          10
							j = k1;
	//  202  368:iload           7
	//  203  370:istore_2        
							if(i1 >= 4)
	//* 204  371:iload           5
	//* 205  373:iconst_4        
	//* 206  374:icmplt          421
							{
								ai = ai2;
	//  207  377:aload           11
	//  208  379:astore          10
								if(l >= ai2.length)
	//* 209  381:iload           4
	//* 210  383:aload           11
	//* 211  385:arraylength     
	//* 212  386:icmplt          405
								{
									ai = _growArrayBy(ai2, ai2.length);
	//  213  389:aload           11
	//  214  391:aload           11
	//  215  393:arraylength     
	//  216  394:invokestatic    #273 <Method int[] _growArrayBy(int[], int)>
	//  217  397:astore          10
									_quadBuffer = ai;
	//  218  399:aload_0         
	//  219  400:aload           10
	//  220  402:putfield        #45  <Field int[] _quadBuffer>
								}
								ai[l] = k1;
	//  221  405:aload           10
	//  222  407:iload           4
	//  223  409:iload           7
	//  224  411:iastore         
								i = l + 1;
	//  225  412:iload           4
	//  226  414:iconst_1        
	//  227  415:iadd            
	//  228  416:istore_1        
								k = 0;
	//  229  417:iconst_0        
	//  230  418:istore_3        
								j = k;
	//  231  419:iload_3         
	//  232  420:istore_2        
							}
							j = j << 8 | (j1 >> 6 & 0x3f | 0x80);
	//  233  421:iload_2         
	//  234  422:bipush          8
	//  235  424:ishl            
	//  236  425:iload           6
	//  237  427:bipush          6
	//  238  429:ishr            
	//  239  430:bipush          63
	//  240  432:iand            
	//  241  433:sipush          128
	//  242  436:ior             
	//  243  437:ior             
	//  244  438:istore_2        
							k++;
	//  245  439:iload_3         
	//  246  440:iconst_1        
	//  247  441:iadd            
	//  248  442:istore_3        
							l = i;
	//  249  443:iload_1         
	//  250  444:istore          4
							i = k;
	//  251  446:iload_3         
	//  252  447:istore_1        
						}
						i1 = j1 & 0x3f | 0x80;
	//  253  448:iload           6
	//  254  450:bipush          63
	//  255  452:iand            
	//  256  453:sipush          128
	//  257  456:ior             
	//  258  457:istore          5
						l1 = j;
	//  259  459:iload_2         
	//  260  460:istore          8
						ai2 = ai;
	//  261  462:aload           10
	//  262  464:astore          11
						k1 = l;
	//  263  466:iload           4
	//  264  468:istore          7
						i2 = i;
	//  265  470:iload_1         
	//  266  471:istore          9
					}
				}
			}
			if(i2 < 4)
	//* 267  473:iload           9
	//* 268  475:iconst_4        
	//* 269  476:icmpge          503
			{
				j = i2 + 1;
	//  270  479:iload           9
	//  271  481:iconst_1        
	//  272  482:iadd            
	//  273  483:istore_2        
				k = i1 | l1 << 8;
	//  274  484:iload           5
	//  275  486:iload           8
	//  276  488:bipush          8
	//  277  490:ishl            
	//  278  491:ior             
	//  279  492:istore_3        
				i = k1;
	//  280  493:iload           7
	//  281  495:istore_1        
				ai = ai2;
	//  282  496:aload           11
	//  283  498:astore          10
			} else
	//* 284  500:goto            548
			{
				ai = ai2;
	//  285  503:aload           11
	//  286  505:astore          10
				if(k1 >= ai2.length)
	//* 287  507:iload           7
	//* 288  509:aload           11
	//* 289  511:arraylength     
	//* 290  512:icmplt          531
				{
					ai = _growArrayBy(ai2, ai2.length);
	//  291  515:aload           11
	//  292  517:aload           11
	//  293  519:arraylength     
	//  294  520:invokestatic    #273 <Method int[] _growArrayBy(int[], int)>
	//  295  523:astore          10
					_quadBuffer = ai;
	//  296  525:aload_0         
	//  297  526:aload           10
	//  298  528:putfield        #45  <Field int[] _quadBuffer>
				}
				ai[k1] = l1;
	//  299  531:aload           10
	//  300  533:iload           7
	//  301  535:iload           8
	//  302  537:iastore         
				k = i1;
	//  303  538:iload           5
	//  304  540:istore_3        
				i = k1 + 1;
	//  305  541:iload           7
	//  306  543:iconst_1        
	//  307  544:iadd            
	//  308  545:istore_1        
				j = 1;
	//  309  546:iconst_1        
	//  310  547:istore_2        
			}
			l = _inputData.readUnsignedByte();
	//  311  548:aload_0         
	//  312  549:getfield        #53  <Field DataInput _inputData>
	//  313  552:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//  314  557:istore          4
		} while(true);
	//  315  559:goto            39
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
	//    5    8:invokevirtual   #570 <Method String _handleOddName(int)>
	//    6   11:areturn         
		int ai[] = _icLatin1;
	//    7   12:getstatic       #37  <Field int[] _icLatin1>
	//    8   15:astore_3        
		i = _inputData.readUnsignedByte();
	//    9   16:aload_0         
	//   10   17:getfield        #53  <Field DataInput _inputData>
	//   11   20:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   12   25:istore_1        
		if(ai[i] == 0)
	//*  13   26:aload_3         
	//*  14   27:iload_1         
	//*  15   28:iaload          
	//*  16   29:ifne            212
		{
			int j = _inputData.readUnsignedByte();
	//   17   32:aload_0         
	//   18   33:getfield        #53  <Field DataInput _inputData>
	//   19   36:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   20   41:istore_2        
			if(ai[j] == 0)
	//*  21   42:aload_3         
	//*  22   43:iload_2         
	//*  23   44:iaload          
	//*  24   45:ifne            191
			{
				i = i << 8 | j;
	//   25   48:iload_1         
	//   26   49:bipush          8
	//   27   51:ishl            
	//   28   52:iload_2         
	//   29   53:ior             
	//   30   54:istore_1        
				j = _inputData.readUnsignedByte();
	//   31   55:aload_0         
	//   32   56:getfield        #53  <Field DataInput _inputData>
	//   33   59:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   34   64:istore_2        
				if(ai[j] == 0)
	//*  35   65:aload_3         
	//*  36   66:iload_2         
	//*  37   67:iaload          
	//*  38   68:ifne            170
				{
					i = i << 8 | j;
	//   39   71:iload_1         
	//   40   72:bipush          8
	//   41   74:ishl            
	//   42   75:iload_2         
	//   43   76:ior             
	//   44   77:istore_1        
					j = _inputData.readUnsignedByte();
	//   45   78:aload_0         
	//   46   79:getfield        #53  <Field DataInput _inputData>
	//   47   82:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   48   87:istore_2        
					if(ai[j] == 0)
	//*  49   88:aload_3         
	//*  50   89:iload_2         
	//*  51   90:iaload          
	//*  52   91:ifne            149
					{
						i = i << 8 | j;
	//   53   94:iload_1         
	//   54   95:bipush          8
	//   55   97:ishl            
	//   56   98:iload_2         
	//   57   99:ior             
	//   58  100:istore_1        
						j = _inputData.readUnsignedByte();
	//   59  101:aload_0         
	//   60  102:getfield        #53  <Field DataInput _inputData>
	//   61  105:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   62  110:istore_2        
						if(ai[j] == 0)
	//*  63  111:aload_3         
	//*  64  112:iload_2         
	//*  65  113:iaload          
	//*  66  114:ifne            128
						{
							_quad1 = i;
	//   67  117:aload_0         
	//   68  118:iload_1         
	//   69  119:putfield        #263 <Field int _quad1>
							return _parseMediumName(j);
	//   70  122:aload_0         
	//   71  123:iload_2         
	//   72  124:invokespecial   #572 <Method String _parseMediumName(int)>
	//   73  127:areturn         
						}
						if(j == 34)
	//*  74  128:iload_2         
	//*  75  129:bipush          34
	//*  76  131:icmpne          141
							return findName(i, 4);
	//   77  134:aload_0         
	//   78  135:iload_1         
	//   79  136:iconst_4        
	//   80  137:invokespecial   #573 <Method String findName(int, int)>
	//   81  140:areturn         
						else
							return parseName(i, j, 4);
	//   82  141:aload_0         
	//   83  142:iload_1         
	//   84  143:iload_2         
	//   85  144:iconst_4        
	//   86  145:invokespecial   #575 <Method String parseName(int, int, int)>
	//   87  148:areturn         
					}
					if(j == 34)
	//*  88  149:iload_2         
	//*  89  150:bipush          34
	//*  90  152:icmpne          162
						return findName(i, 3);
	//   91  155:aload_0         
	//   92  156:iload_1         
	//   93  157:iconst_3        
	//   94  158:invokespecial   #573 <Method String findName(int, int)>
	//   95  161:areturn         
					else
						return parseName(i, j, 3);
	//   96  162:aload_0         
	//   97  163:iload_1         
	//   98  164:iload_2         
	//   99  165:iconst_3        
	//  100  166:invokespecial   #575 <Method String parseName(int, int, int)>
	//  101  169:areturn         
				}
				if(j == 34)
	//* 102  170:iload_2         
	//* 103  171:bipush          34
	//* 104  173:icmpne          183
					return findName(i, 2);
	//  105  176:aload_0         
	//  106  177:iload_1         
	//  107  178:iconst_2        
	//  108  179:invokespecial   #573 <Method String findName(int, int)>
	//  109  182:areturn         
				else
					return parseName(i, j, 2);
	//  110  183:aload_0         
	//  111  184:iload_1         
	//  112  185:iload_2         
	//  113  186:iconst_2        
	//  114  187:invokespecial   #575 <Method String parseName(int, int, int)>
	//  115  190:areturn         
			}
			if(j == 34)
	//* 116  191:iload_2         
	//* 117  192:bipush          34
	//* 118  194:icmpne          204
				return findName(i, 1);
	//  119  197:aload_0         
	//  120  198:iload_1         
	//  121  199:iconst_1        
	//  122  200:invokespecial   #573 <Method String findName(int, int)>
	//  123  203:areturn         
			else
				return parseName(i, j, 1);
	//  124  204:aload_0         
	//  125  205:iload_1         
	//  126  206:iload_2         
	//  127  207:iconst_1        
	//  128  208:invokespecial   #575 <Method String parseName(int, int, int)>
	//  129  211:areturn         
		}
		if(i == 34)
	//* 130  212:iload_1         
	//* 131  213:bipush          34
	//* 132  215:icmpne          222
			return "";
	//  133  218:ldc2            #549 <String "">
	//  134  221:areturn         
		else
			return parseName(0, i, 0);
	//  135  222:aload_0         
	//  136  223:iconst_0        
	//  137  224:iload_1         
	//  138  225:iconst_0        
	//  139  226:invokespecial   #575 <Method String parseName(int, int, int)>
	//  140  229:areturn         
	}

	protected JsonToken _parseNegNumber()
		throws IOException
	{
		char ac[] = _textBuffer.emptyAndGetCurrentSegment();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #104 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//    3    7:astore          4
		ac[0] = '-';
	//    4    9:aload           4
	//    5   11:iconst_0        
	//    6   12:bipush          45
	//    7   14:castore         
		int i = _inputData.readUnsignedByte();
	//    8   15:aload_0         
	//    9   16:getfield        #53  <Field DataInput _inputData>
	//   10   19:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   11   24:istore_1        
		ac[1] = (char)i;
	//   12   25:aload           4
	//   13   27:iconst_1        
	//   14   28:iload_1         
	//   15   29:int2char        
	//   16   30:castore         
		if(i <= 48)
	//*  17   31:iload_1         
	//*  18   32:bipush          48
	//*  19   34:icmpgt          58
		{
			if(i == 48)
	//*  20   37:iload_1         
	//*  21   38:bipush          48
	//*  22   40:icmpne          51
				i = _handleLeadingZeroes();
	//   23   43:aload_0         
	//   24   44:invokespecial   #577 <Method int _handleLeadingZeroes()>
	//   25   47:istore_1        
			else
	//*  26   48:goto            81
				return _handleInvalidNumberStart(i, true);
	//   27   51:aload_0         
	//   28   52:iload_1         
	//   29   53:iconst_1        
	//   30   54:invokevirtual   #524 <Method JsonToken _handleInvalidNumberStart(int, boolean)>
	//   31   57:areturn         
		} else
		{
			if(i > 57)
	//*  32   58:iload_1         
	//*  33   59:bipush          57
	//*  34   61:icmple          71
				return _handleInvalidNumberStart(i, true);
	//   35   64:aload_0         
	//   36   65:iload_1         
	//   37   66:iconst_1        
	//   38   67:invokevirtual   #524 <Method JsonToken _handleInvalidNumberStart(int, boolean)>
	//   39   70:areturn         
			i = _inputData.readUnsignedByte();
	//   40   71:aload_0         
	//   41   72:getfield        #53  <Field DataInput _inputData>
	//   42   75:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   43   80:istore_1        
		}
		int j = 2;
	//   44   81:iconst_2        
	//   45   82:istore_2        
		int k = 1;
	//   46   83:iconst_1        
	//   47   84:istore_3        
		while(i <= 57 && i >= 48) 
	//*  48   85:iload_1         
	//*  49   86:bipush          57
	//*  50   88:icmpgt          124
	//*  51   91:iload_1         
	//*  52   92:bipush          48
	//*  53   94:icmplt          124
		{
			k++;
	//   54   97:iload_3         
	//   55   98:iconst_1        
	//   56   99:iadd            
	//   57  100:istore_3        
			ac[j] = (char)i;
	//   58  101:aload           4
	//   59  103:iload_2         
	//   60  104:iload_1         
	//   61  105:int2char        
	//   62  106:castore         
			i = _inputData.readUnsignedByte();
	//   63  107:aload_0         
	//   64  108:getfield        #53  <Field DataInput _inputData>
	//   65  111:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   66  116:istore_1        
			j++;
	//   67  117:iload_2         
	//   68  118:iconst_1        
	//   69  119:iadd            
	//   70  120:istore_2        
		}
	//*  71  121:goto            85
		if(i != 46 && i != 101 && i != 69)
	//*  72  124:iload_1         
	//*  73  125:bipush          46
	//*  74  127:icmpeq          179
	//*  75  130:iload_1         
	//*  76  131:bipush          101
	//*  77  133:icmpeq          179
	//*  78  136:iload_1         
	//*  79  137:bipush          69
	//*  80  139:icmpne          145
	//*  81  142:goto            179
		{
			_textBuffer.setCurrentLength(j);
	//   82  145:aload_0         
	//   83  146:getfield        #98  <Field TextBuffer _textBuffer>
	//   84  149:iload_2         
	//   85  150:invokevirtual   #121 <Method void TextBuffer.setCurrentLength(int)>
			_nextByte = i;
	//   86  153:aload_0         
	//   87  154:iload_1         
	//   88  155:putfield        #47  <Field int _nextByte>
			if(_parsingContext.inRoot())
	//*  89  158:aload_0         
	//*  90  159:getfield        #183 <Field JsonReadContext _parsingContext>
	//*  91  162:invokevirtual   #252 <Method boolean JsonReadContext.inRoot()>
	//*  92  165:ifeq            172
				_verifyRootSpace();
	//   93  168:aload_0         
	//   94  169:invokespecial   #255 <Method void _verifyRootSpace()>
			return resetInt(true, k);
	//   95  172:aload_0         
	//   96  173:iconst_1        
	//   97  174:iload_3         
	//   98  175:invokevirtual   #581 <Method JsonToken resetInt(boolean, int)>
	//   99  178:areturn         
		} else
		{
			return _parseFloat(ac, j, i, true, k);
	//  100  179:aload_0         
	//  101  180:aload           4
	//  102  182:iload_2         
	//  103  183:iload_1         
	//  104  184:iconst_1        
	//  105  185:iload_3         
	//  106  186:invokespecial   #583 <Method JsonToken _parseFloat(char[], int, int, boolean, int)>
	//  107  189:areturn         
		}
	}

	protected JsonToken _parsePosNumber(int i)
		throws IOException
	{
		char ac[] = _textBuffer.emptyAndGetCurrentSegment();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #104 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//    3    7:astore          4
		int j = 1;
	//    4    9:iconst_1        
	//    5   10:istore_2        
		if(i == 48)
	//*   6   11:iload_1         
	//*   7   12:bipush          48
	//*   8   14:icmpne          48
		{
			i = _handleLeadingZeroes();
	//    9   17:aload_0         
	//   10   18:invokespecial   #577 <Method int _handleLeadingZeroes()>
	//   11   21:istore_1        
			if(i <= 57 && i >= 48)
	//*  12   22:iload_1         
	//*  13   23:bipush          57
	//*  14   25:icmpgt          39
	//*  15   28:iload_1         
	//*  16   29:bipush          48
	//*  17   31:icmplt          39
				j = 0;
	//   18   34:iconst_0        
	//   19   35:istore_2        
			else
	//*  20   36:goto            64
				ac[0] = '0';
	//   21   39:aload           4
	//   22   41:iconst_0        
	//   23   42:bipush          48
	//   24   44:castore         
		} else
	//*  25   45:goto            64
		{
			ac[0] = (char)i;
	//   26   48:aload           4
	//   27   50:iconst_0        
	//   28   51:iload_1         
	//   29   52:int2char        
	//   30   53:castore         
			i = _inputData.readUnsignedByte();
	//   31   54:aload_0         
	//   32   55:getfield        #53  <Field DataInput _inputData>
	//   33   58:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   34   63:istore_1        
		}
		int k = j;
	//   35   64:iload_2         
	//   36   65:istore_3        
		while(i <= 57 && i >= 48) 
	//*  37   66:iload_1         
	//*  38   67:bipush          57
	//*  39   69:icmpgt          105
	//*  40   72:iload_1         
	//*  41   73:bipush          48
	//*  42   75:icmplt          105
		{
			k++;
	//   43   78:iload_3         
	//   44   79:iconst_1        
	//   45   80:iadd            
	//   46   81:istore_3        
			ac[j] = (char)i;
	//   47   82:aload           4
	//   48   84:iload_2         
	//   49   85:iload_1         
	//   50   86:int2char        
	//   51   87:castore         
			i = _inputData.readUnsignedByte();
	//   52   88:aload_0         
	//   53   89:getfield        #53  <Field DataInput _inputData>
	//   54   92:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   55   97:istore_1        
			j++;
	//   56   98:iload_2         
	//   57   99:iconst_1        
	//   58  100:iadd            
	//   59  101:istore_2        
		}
	//*  60  102:goto            66
		if(i != 46 && i != 101 && i != 69)
	//*  61  105:iload_1         
	//*  62  106:bipush          46
	//*  63  108:icmpeq          163
	//*  64  111:iload_1         
	//*  65  112:bipush          101
	//*  66  114:icmpeq          163
	//*  67  117:iload_1         
	//*  68  118:bipush          69
	//*  69  120:icmpne          126
	//*  70  123:goto            163
		{
			_textBuffer.setCurrentLength(j);
	//   71  126:aload_0         
	//   72  127:getfield        #98  <Field TextBuffer _textBuffer>
	//   73  130:iload_2         
	//   74  131:invokevirtual   #121 <Method void TextBuffer.setCurrentLength(int)>
			if(_parsingContext.inRoot())
	//*  75  134:aload_0         
	//*  76  135:getfield        #183 <Field JsonReadContext _parsingContext>
	//*  77  138:invokevirtual   #252 <Method boolean JsonReadContext.inRoot()>
	//*  78  141:ifeq            151
				_verifyRootSpace();
	//   79  144:aload_0         
	//   80  145:invokespecial   #255 <Method void _verifyRootSpace()>
			else
	//*  81  148:goto            156
				_nextByte = i;
	//   82  151:aload_0         
	//   83  152:iload_1         
	//   84  153:putfield        #47  <Field int _nextByte>
			return resetInt(false, k);
	//   85  156:aload_0         
	//   86  157:iconst_0        
	//   87  158:iload_3         
	//   88  159:invokevirtual   #581 <Method JsonToken resetInt(boolean, int)>
	//   89  162:areturn         
		} else
		{
			return _parseFloat(ac, j, i, false, k);
	//   90  163:aload_0         
	//   91  164:aload           4
	//   92  166:iload_2         
	//   93  167:iload_1         
	//   94  168:iconst_0        
	//   95  169:iload_3         
	//   96  170:invokespecial   #583 <Method JsonToken _parseFloat(char[], int, int, boolean, int)>
	//   97  173:areturn         
		}
	}

	protected int _readBinary(Base64Variant base64variant, OutputStream outputstream, byte abyte0[])
		throws IOException
	{
		int j1 = abyte0.length;
	//    0    0:aload_3         
	//    1    1:arraylength     
	//    2    2:istore          9
		int i = 0;
	//    3    4:iconst_0        
	//    4    5:istore          4
		int k = i;
	//    5    7:iload           4
	//    6    9:istore          6
		do
		{
			int j;
label0:
			{
				int l;
				int i1;
				int k1;
label1:
				{
label2:
					{
						int l1;
label3:
						{
label4:
							{
								do
									l = _inputData.readUnsignedByte();
	//    7   11:aload_0         
	//    8   12:getfield        #53  <Field DataInput _inputData>
	//    9   15:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   10   20:istore          7
								while(l <= 32);
	//   11   22:iload           7
	//   12   24:bipush          32
	//   13   26:icmple          11
								j = base64variant.decodeBase64Char(l);
	//   14   29:aload_1         
	//   15   30:iload           7
	//   16   32:invokevirtual   #417 <Method int Base64Variant.decodeBase64Char(int)>
	//   17   35:istore          5
								i1 = j;
	//   18   37:iload           5
	//   19   39:istore          8
								if(j < 0)
	//*  20   41:iload           5
	//*  21   43:ifge            82
								{
									if(l == 34)
	//*  22   46:iload           7
	//*  23   48:bipush          34
	//*  24   50:icmpne          60
									{
										j = k;
	//   25   53:iload           6
	//   26   55:istore          5
										break label4;
	//   27   57:goto            439
									}
									j = _decodeBase64Escape(base64variant, l, 0);
	//   28   60:aload_0         
	//   29   61:aload_1         
	//   30   62:iload           7
	//   31   64:iconst_0        
	//   32   65:invokevirtual   #427 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//   33   68:istore          5
									i1 = j;
	//   34   70:iload           5
	//   35   72:istore          8
									if(j < 0)
	//*  36   74:iload           5
	//*  37   76:ifge            82
										continue;
	//   38   79:goto            11
								}
								l = i;
	//   39   82:iload           4
	//   40   84:istore          7
								j = k;
	//   41   86:iload           6
	//   42   88:istore          5
								if(i > j1 - 3)
	//*  43   90:iload           4
	//*  44   92:iload           9
	//*  45   94:iconst_3        
	//*  46   95:isub            
	//*  47   96:icmple          117
								{
									j = k + i;
	//   48   99:iload           6
	//   49  101:iload           4
	//   50  103:iadd            
	//   51  104:istore          5
									outputstream.write(abyte0, 0, i);
	//   52  106:aload_2         
	//   53  107:aload_3         
	//   54  108:iconst_0        
	//   55  109:iload           4
	//   56  111:invokevirtual   #591 <Method void OutputStream.write(byte[], int, int)>
									l = 0;
	//   57  114:iconst_0        
	//   58  115:istore          7
								}
								k1 = _inputData.readUnsignedByte();
	//   59  117:aload_0         
	//   60  118:getfield        #53  <Field DataInput _inputData>
	//   61  121:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   62  126:istore          10
								k = base64variant.decodeBase64Char(k1);
	//   63  128:aload_1         
	//   64  129:iload           10
	//   65  131:invokevirtual   #417 <Method int Base64Variant.decodeBase64Char(int)>
	//   66  134:istore          6
								i = k;
	//   67  136:iload           6
	//   68  138:istore          4
								if(k < 0)
	//*  69  140:iload           6
	//*  70  142:ifge            155
									i = _decodeBase64Escape(base64variant, k1, 1);
	//   71  145:aload_0         
	//   72  146:aload_1         
	//   73  147:iload           10
	//   74  149:iconst_1        
	//   75  150:invokevirtual   #427 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//   76  153:istore          4
								k1 = i1 << 6 | i;
	//   77  155:iload           8
	//   78  157:bipush          6
	//   79  159:ishl            
	//   80  160:iload           4
	//   81  162:ior             
	//   82  163:istore          10
								l1 = _inputData.readUnsignedByte();
	//   83  165:aload_0         
	//   84  166:getfield        #53  <Field DataInput _inputData>
	//   85  169:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   86  174:istore          11
								k = base64variant.decodeBase64Char(l1);
	//   87  176:aload_1         
	//   88  177:iload           11
	//   89  179:invokevirtual   #417 <Method int Base64Variant.decodeBase64Char(int)>
	//   90  182:istore          6
								i1 = k;
	//   91  184:iload           6
	//   92  186:istore          8
								if(k < 0)
	//*  93  188:iload           6
	//*  94  190:ifge            341
								{
									i = k;
	//   95  193:iload           6
	//   96  195:istore          4
									if(k != -2)
	//*  97  197:iload           6
	//*  98  199:bipush          -2
	//*  99  201:icmpeq          246
									{
										if(l1 == 34 && !base64variant.usesPadding())
	//* 100  204:iload           11
	//* 101  206:bipush          34
	//* 102  208:icmpne          236
	//* 103  211:aload_1         
	//* 104  212:invokevirtual   #430 <Method boolean Base64Variant.usesPadding()>
	//* 105  215:ifne            236
										{
											abyte0[l] = (byte)(k1 >> 4);
	//  106  218:aload_3         
	//  107  219:iload           7
	//  108  221:iload           10
	//  109  223:iconst_4        
	//  110  224:ishr            
	//  111  225:int2byte        
	//  112  226:bastore         
											i = l + 1;
	//  113  227:iload           7
	//  114  229:iconst_1        
	//  115  230:iadd            
	//  116  231:istore          4
											break label4;
	//  117  233:goto            439
										}
										i = _decodeBase64Escape(base64variant, l1, 2);
	//  118  236:aload_0         
	//  119  237:aload_1         
	//  120  238:iload           11
	//  121  240:iconst_2        
	//  122  241:invokevirtual   #427 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//  123  244:istore          4
									}
									i1 = i;
	//  124  246:iload           4
	//  125  248:istore          8
									if(i == -2)
	//* 126  250:iload           4
	//* 127  252:bipush          -2
	//* 128  254:icmpne          341
									{
										i = _inputData.readUnsignedByte();
	//  129  257:aload_0         
	//  130  258:getfield        #53  <Field DataInput _inputData>
	//  131  261:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//  132  266:istore          4
										if(!base64variant.usesPaddingChar(i))
	//* 133  268:aload_1         
	//* 134  269:iload           4
	//* 135  271:invokevirtual   #436 <Method boolean Base64Variant.usesPaddingChar(int)>
	//* 136  274:ifne            323
										{
											outputstream = ((OutputStream) (new StringBuilder()));
	//  137  277:new             #294 <Class StringBuilder>
	//  138  280:dup             
	//  139  281:invokespecial   #296 <Method void StringBuilder()>
	//  140  284:astore_2        
											((StringBuilder) (outputstream)).append("expected padding character '");
	//  141  285:aload_2         
	//  142  286:ldc2            #438 <String "expected padding character '">
	//  143  289:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//  144  292:pop             
											((StringBuilder) (outputstream)).append(base64variant.getPaddingChar());
	//  145  293:aload_2         
	//  146  294:aload_1         
	//  147  295:invokevirtual   #441 <Method char Base64Variant.getPaddingChar()>
	//  148  298:invokevirtual   #444 <Method StringBuilder StringBuilder.append(char)>
	//  149  301:pop             
											((StringBuilder) (outputstream)).append("'");
	//  150  302:aload_2         
	//  151  303:ldc2            #446 <String "'">
	//  152  306:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//  153  309:pop             
											throw reportInvalidBase64Char(base64variant, i, 3, ((StringBuilder) (outputstream)).toString());
	//  154  310:aload_0         
	//  155  311:aload_1         
	//  156  312:iload           4
	//  157  314:iconst_3        
	//  158  315:aload_2         
	//  159  316:invokevirtual   #310 <Method String StringBuilder.toString()>
	//  160  319:invokevirtual   #450 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int, String)>
	//  161  322:athrow          
										}
										i = l + 1;
	//  162  323:iload           7
	//  163  325:iconst_1        
	//  164  326:iadd            
	//  165  327:istore          4
										abyte0[l] = (byte)(k1 >> 4);
	//  166  329:aload_3         
	//  167  330:iload           7
	//  168  332:iload           10
	//  169  334:iconst_4        
	//  170  335:ishr            
	//  171  336:int2byte        
	//  172  337:bastore         
										break label0;
	//  173  338:goto            589
									}
								}
								k1 = k1 << 6 | i1;
	//  174  341:iload           10
	//  175  343:bipush          6
	//  176  345:ishl            
	//  177  346:iload           8
	//  178  348:ior             
	//  179  349:istore          10
								l1 = _inputData.readUnsignedByte();
	//  180  351:aload_0         
	//  181  352:getfield        #53  <Field DataInput _inputData>
	//  182  355:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//  183  360:istore          11
								k = base64variant.decodeBase64Char(l1);
	//  184  362:aload_1         
	//  185  363:iload           11
	//  186  365:invokevirtual   #417 <Method int Base64Variant.decodeBase64Char(int)>
	//  187  368:istore          6
								i1 = k;
	//  188  370:iload           6
	//  189  372:istore          8
								if(k >= 0)
									break label1;
	//  190  374:iload           6
	//  191  376:ifge            534
								i = k;
	//  192  379:iload           6
	//  193  381:istore          4
								if(k == -2)
									break label2;
	//  194  383:iload           6
	//  195  385:bipush          -2
	//  196  387:icmpeq          481
								if(l1 != 34 || base64variant.usesPadding())
									break label3;
	//  197  390:iload           11
	//  198  392:bipush          34
	//  199  394:icmpne          471
	//  200  397:aload_1         
	//  201  398:invokevirtual   #430 <Method boolean Base64Variant.usesPadding()>
	//  202  401:ifne            471
								k = k1 >> 2;
	//  203  404:iload           10
	//  204  406:iconst_2        
	//  205  407:ishr            
	//  206  408:istore          6
								i1 = l + 1;
	//  207  410:iload           7
	//  208  412:iconst_1        
	//  209  413:iadd            
	//  210  414:istore          8
								abyte0[l] = (byte)(k >> 8);
	//  211  416:aload_3         
	//  212  417:iload           7
	//  213  419:iload           6
	//  214  421:bipush          8
	//  215  423:ishr            
	//  216  424:int2byte        
	//  217  425:bastore         
								i = i1 + 1;
	//  218  426:iload           8
	//  219  428:iconst_1        
	//  220  429:iadd            
	//  221  430:istore          4
								abyte0[i1] = (byte)k;
	//  222  432:aload_3         
	//  223  433:iload           8
	//  224  435:iload           6
	//  225  437:int2byte        
	//  226  438:bastore         
							}
							_tokenIncomplete = false;
	//  227  439:aload_0         
	//  228  440:iconst_0        
	//  229  441:putfield        #208 <Field boolean _tokenIncomplete>
							k = j;
	//  230  444:iload           5
	//  231  446:istore          6
							if(i > 0)
	//* 232  448:iload           4
	//* 233  450:ifle            468
							{
								k = j + i;
	//  234  453:iload           5
	//  235  455:iload           4
	//  236  457:iadd            
	//  237  458:istore          6
								outputstream.write(abyte0, 0, i);
	//  238  460:aload_2         
	//  239  461:aload_3         
	//  240  462:iconst_0        
	//  241  463:iload           4
	//  242  465:invokevirtual   #591 <Method void OutputStream.write(byte[], int, int)>
							}
							return k;
	//  243  468:iload           6
	//  244  470:ireturn         
						}
						i = _decodeBase64Escape(base64variant, l1, 3);
	//  245  471:aload_0         
	//  246  472:aload_1         
	//  247  473:iload           11
	//  248  475:iconst_3        
	//  249  476:invokevirtual   #427 <Method int _decodeBase64Escape(Base64Variant, int, int)>
	//  250  479:istore          4
					}
					i1 = i;
	//  251  481:iload           4
	//  252  483:istore          8
					if(i == -2)
	//* 253  485:iload           4
	//* 254  487:bipush          -2
	//* 255  489:icmpne          534
					{
						k = k1 >> 2;
	//  256  492:iload           10
	//  257  494:iconst_2        
	//  258  495:ishr            
	//  259  496:istore          6
						i1 = l + 1;
	//  260  498:iload           7
	//  261  500:iconst_1        
	//  262  501:iadd            
	//  263  502:istore          8
						abyte0[l] = (byte)(k >> 8);
	//  264  504:aload_3         
	//  265  505:iload           7
	//  266  507:iload           6
	//  267  509:bipush          8
	//  268  511:ishr            
	//  269  512:int2byte        
	//  270  513:bastore         
						i = i1 + 1;
	//  271  514:iload           8
	//  272  516:iconst_1        
	//  273  517:iadd            
	//  274  518:istore          4
						abyte0[i1] = (byte)k;
	//  275  520:aload_3         
	//  276  521:iload           8
	//  277  523:iload           6
	//  278  525:int2byte        
	//  279  526:bastore         
						k = j;
	//  280  527:iload           5
	//  281  529:istore          6
						continue;
	//  282  531:goto            11
					}
				}
				k = k1 << 6 | i1;
	//  283  534:iload           10
	//  284  536:bipush          6
	//  285  538:ishl            
	//  286  539:iload           8
	//  287  541:ior             
	//  288  542:istore          6
				i = l + 1;
	//  289  544:iload           7
	//  290  546:iconst_1        
	//  291  547:iadd            
	//  292  548:istore          4
				abyte0[l] = (byte)(k >> 16);
	//  293  550:aload_3         
	//  294  551:iload           7
	//  295  553:iload           6
	//  296  555:bipush          16
	//  297  557:ishr            
	//  298  558:int2byte        
	//  299  559:bastore         
				l = i + 1;
	//  300  560:iload           4
	//  301  562:iconst_1        
	//  302  563:iadd            
	//  303  564:istore          7
				abyte0[i] = (byte)(k >> 8);
	//  304  566:aload_3         
	//  305  567:iload           4
	//  306  569:iload           6
	//  307  571:bipush          8
	//  308  573:ishr            
	//  309  574:int2byte        
	//  310  575:bastore         
				i = l + 1;
	//  311  576:iload           7
	//  312  578:iconst_1        
	//  313  579:iadd            
	//  314  580:istore          4
				abyte0[l] = (byte)k;
	//  315  582:aload_3         
	//  316  583:iload           7
	//  317  585:iload           6
	//  318  587:int2byte        
	//  319  588:bastore         
			}
			k = j;
	//  320  589:iload           5
	//  321  591:istore          6
		} while(true);
	//  322  593:goto            11
	}

	protected void _releaseBuffers()
		throws IOException
	{
		super._releaseBuffers();
	//    0    0:aload_0         
	//    1    1:invokespecial   #594 <Method void ParserBase._releaseBuffers()>
		_symbols.release();
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field ByteQuadsCanonicalizer _symbols>
	//    4    8:invokevirtual   #597 <Method void ByteQuadsCanonicalizer.release()>
	//    5   11:return          
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
	//    5    8:invokevirtual   #600 <Method void _throwInvalidSpace(int)>
		_reportInvalidInitial(i);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:invokevirtual   #372 <Method void _reportInvalidInitial(int)>
	//    9   16:return          
	}

	protected void _reportInvalidInitial(int i)
		throws JsonParseException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #294 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #296 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Invalid UTF-8 start byte 0x");
	//    4    8:aload_2         
	//    5    9:ldc2            #602 <String "Invalid UTF-8 start byte 0x">
	//    6   12:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(Integer.toHexString(i));
	//    8   16:aload_2         
	//    9   17:iload_1         
	//   10   18:invokestatic    #307 <Method String Integer.toHexString(int)>
	//   11   21:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		_reportError(stringbuilder.toString());
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:invokevirtual   #310 <Method String StringBuilder.toString()>
	//   16   30:invokevirtual   #313 <Method void _reportError(String)>
	//   17   33:return          
	}

	protected void _reportInvalidToken(int i, String s)
		throws IOException
	{
		_reportInvalidToken(i, s, "'null', 'true', 'false' or NaN");
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:ldc2            #604 <String "'null', 'true', 'false' or NaN">
	//    4    6:invokevirtual   #554 <Method void _reportInvalidToken(int, String, String)>
	//    5    9:return          
	}

	protected void _reportInvalidToken(int i, String s, String s1)
		throws IOException
	{
		s = ((String) (new StringBuilder(s)));
	//    0    0:new             #294 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokespecial   #606 <Method void StringBuilder(String)>
	//    4    8:astore_2        
		do
		{
			char c = (char)_decodeCharForError(i);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #61  <Method int _decodeCharForError(int)>
	//    8   14:int2char        
	//    9   15:istore          4
			if(!Character.isJavaIdentifierPart(c))
	//*  10   17:iload           4
	//*  11   19:invokestatic    #67  <Method boolean Character.isJavaIdentifierPart(char)>
	//*  12   22:ifne            79
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   13   25:new             #294 <Class StringBuilder>
	//   14   28:dup             
	//   15   29:invokespecial   #296 <Method void StringBuilder()>
	//   16   32:astore          5
				stringbuilder.append("Unrecognized token '");
	//   17   34:aload           5
	//   18   36:ldc2            #608 <String "Unrecognized token '">
	//   19   39:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   20   42:pop             
				stringbuilder.append(((StringBuilder) (s)).toString());
	//   21   43:aload           5
	//   22   45:aload_2         
	//   23   46:invokevirtual   #310 <Method String StringBuilder.toString()>
	//   24   49:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
				stringbuilder.append("': was expecting ");
	//   26   53:aload           5
	//   27   55:ldc2            #610 <String "': was expecting ">
	//   28   58:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   29   61:pop             
				stringbuilder.append(s1);
	//   30   62:aload           5
	//   31   64:aload_3         
	//   32   65:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   33   68:pop             
				_reportError(stringbuilder.toString());
	//   34   69:aload_0         
	//   35   70:aload           5
	//   36   72:invokevirtual   #310 <Method String StringBuilder.toString()>
	//   37   75:invokevirtual   #313 <Method void _reportError(String)>
				return;
	//   38   78:return          
			}
			((StringBuilder) (s)).append(c);
	//   39   79:aload_2         
	//   40   80:iload           4
	//   41   82:invokevirtual   #444 <Method StringBuilder StringBuilder.append(char)>
	//   42   85:pop             
			i = _inputData.readUnsignedByte();
	//   43   86:aload_0         
	//   44   87:getfield        #53  <Field DataInput _inputData>
	//   45   90:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//   46   95:istore_1        
		} while(true);
	//   47   96:goto            9
	}

	protected void _skipString()
		throws IOException
	{
		_tokenIncomplete = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #208 <Field boolean _tokenIncomplete>
		int ai[] = _icUTF8;
	//    3    5:getstatic       #32  <Field int[] _icUTF8>
	//    4    8:astore_2        
		do
		{
			int i;
			do
				i = _inputData.readUnsignedByte();
	//    5    9:aload_0         
	//    6   10:getfield        #53  <Field DataInput _inputData>
	//    7   13:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//    8   18:istore_1        
			while(ai[i] == 0);
	//    9   19:aload_2         
	//   10   20:iload_1         
	//   11   21:iaload          
	//   12   22:ifeq            9
			if(i == 34)
	//*  13   25:iload_1         
	//*  14   26:bipush          34
	//*  15   28:icmpne          32
				return;
	//   16   31:return          
			switch(ai[i])
	//*  17   32:aload_2         
	//*  18   33:iload_1         
	//*  19   34:iaload          
			{
	//*  20   35:tableswitch     1 4: default 64
	//	               1 101
	//	               2 94
	//	               3 87
	//	               4 80
			default:
				if(i < 32)
	//*  21   64:iload_1         
	//*  22   65:bipush          32
	//*  23   67:icmpge          109
					_throwUnquotedSpace(i, "string value");
	//   24   70:aload_0         
	//   25   71:iload_1         
	//   26   72:ldc1            #123 <String "string value">
	//   27   74:invokevirtual   #126 <Method void _throwUnquotedSpace(int, String)>
				else
	//*  28   77:goto            9
	//*  29   80:aload_0         
	//*  30   81:invokespecial   #320 <Method void _skipUtf8_4()>
	//*  31   84:goto            9
	//*  32   87:aload_0         
	//*  33   88:invokespecial   #323 <Method void _skipUtf8_3()>
	//*  34   91:goto            9
	//*  35   94:aload_0         
	//*  36   95:invokespecial   #326 <Method void _skipUtf8_2()>
	//*  37   98:goto            9
	//*  38  101:aload_0         
	//*  39  102:invokevirtual   #138 <Method char _decodeEscaped()>
	//*  40  105:pop             
	//*  41  106:goto            9
					_reportInvalidChar(i);
	//   42  109:aload_0         
	//   43  110:iload_1         
	//   44  111:invokevirtual   #141 <Method void _reportInvalidChar(int)>
				break;

			case 4: // '\004'
				_skipUtf8_4();
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
		} while(true);
	//*  45  114:goto            9
	}

	public void finishToken()
		throws IOException
	{
		if(_tokenIncomplete)
	//*   0    0:aload_0         
	//*   1    1:getfield        #208 <Field boolean _tokenIncomplete>
	//*   2    4:ifeq            16
		{
			_tokenIncomplete = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #208 <Field boolean _tokenIncomplete>
			_finishString();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #614 <Method void _finishString()>
		}
	//    8   16:return          
	}

	public byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException
	{
		if(_currToken != JsonToken.VALUE_STRING && (_currToken != JsonToken.VALUE_EMBEDDED_OBJECT || _binaryValue == null))
	//*   0    0:aload_0         
	//*   1    1:getfield        #204 <Field JsonToken _currToken>
	//*   2    4:getstatic       #211 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpeq       68
	//*   4   10:aload_0         
	//*   5   11:getfield        #204 <Field JsonToken _currToken>
	//*   6   14:getstatic       #620 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//*   7   17:if_acmpne       27
	//*   8   20:aload_0         
	//*   9   21:getfield        #624 <Field byte[] _binaryValue>
	//*  10   24:ifnonnull       68
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   27:new             #294 <Class StringBuilder>
	//   12   30:dup             
	//   13   31:invokespecial   #296 <Method void StringBuilder()>
	//   14   34:astore_2        
			stringbuilder.append("Current token (");
	//   15   35:aload_2         
	//   16   36:ldc2            #626 <String "Current token (">
	//   17   39:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   18   42:pop             
			stringbuilder.append(((Object) (_currToken)));
	//   19   43:aload_2         
	//   20   44:aload_0         
	//   21   45:getfield        #204 <Field JsonToken _currToken>
	//   22   48:invokevirtual   #629 <Method StringBuilder StringBuilder.append(Object)>
	//   23   51:pop             
			stringbuilder.append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
	//   24   52:aload_2         
	//   25   53:ldc2            #631 <String ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary">
	//   26   56:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   27   59:pop             
			_reportError(stringbuilder.toString());
	//   28   60:aload_0         
	//   29   61:aload_2         
	//   30   62:invokevirtual   #310 <Method String StringBuilder.toString()>
	//   31   65:invokevirtual   #313 <Method void _reportError(String)>
		}
		if(_tokenIncomplete)
	//*  32   68:aload_0         
	//*  33   69:getfield        #208 <Field boolean _tokenIncomplete>
	//*  34   72:ifeq            141
		{
			try
			{
				_binaryValue = _decodeBase64(base64variant);
	//   35   75:aload_0         
	//   36   76:aload_0         
	//   37   77:aload_1         
	//   38   78:invokevirtual   #633 <Method byte[] _decodeBase64(Base64Variant)>
	//   39   81:putfield        #624 <Field byte[] _binaryValue>
			}
	//*  40   84:aload_0         
	//*  41   85:iconst_0        
	//*  42   86:putfield        #208 <Field boolean _tokenIncomplete>
	//*  43   89:goto            171
			catch(IllegalArgumentException illegalargumentexception)
	//*  44   92:astore_2        
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   45   93:new             #294 <Class StringBuilder>
	//   46   96:dup             
	//   47   97:invokespecial   #296 <Method void StringBuilder()>
	//   48  100:astore_3        
				stringbuilder1.append("Failed to decode VALUE_STRING as base64 (");
	//   49  101:aload_3         
	//   50  102:ldc2            #635 <String "Failed to decode VALUE_STRING as base64 (">
	//   51  105:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   52  108:pop             
				stringbuilder1.append(((Object) (base64variant)));
	//   53  109:aload_3         
	//   54  110:aload_1         
	//   55  111:invokevirtual   #629 <Method StringBuilder StringBuilder.append(Object)>
	//   56  114:pop             
				stringbuilder1.append("): ");
	//   57  115:aload_3         
	//   58  116:ldc2            #637 <String "): ">
	//   59  119:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   60  122:pop             
				stringbuilder1.append(illegalargumentexception.getMessage());
	//   61  123:aload_3         
	//   62  124:aload_2         
	//   63  125:invokevirtual   #640 <Method String IllegalArgumentException.getMessage()>
	//   64  128:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   65  131:pop             
				throw _constructError(stringbuilder1.toString());
	//   66  132:aload_0         
	//   67  133:aload_3         
	//   68  134:invokevirtual   #310 <Method String StringBuilder.toString()>
	//   69  137:invokevirtual   #644 <Method JsonParseException _constructError(String)>
	//   70  140:athrow          
			}
			_tokenIncomplete = false;
		} else
		if(_binaryValue == null)
	//*  71  141:aload_0         
	//*  72  142:getfield        #624 <Field byte[] _binaryValue>
	//*  73  145:ifnonnull       171
		{
			ByteArrayBuilder bytearraybuilder = _getByteArrayBuilder();
	//   74  148:aload_0         
	//   75  149:invokevirtual   #412 <Method ByteArrayBuilder _getByteArrayBuilder()>
	//   76  152:astore_2        
			_decodeBase64(getText(), bytearraybuilder, base64variant);
	//   77  153:aload_0         
	//   78  154:aload_0         
	//   79  155:invokevirtual   #647 <Method String getText()>
	//   80  158:aload_2         
	//   81  159:aload_1         
	//   82  160:invokevirtual   #650 <Method void _decodeBase64(String, ByteArrayBuilder, Base64Variant)>
			_binaryValue = bytearraybuilder.toByteArray();
	//   83  163:aload_0         
	//   84  164:aload_2         
	//   85  165:invokevirtual   #423 <Method byte[] ByteArrayBuilder.toByteArray()>
	//   86  168:putfield        #624 <Field byte[] _binaryValue>
		}
		return _binaryValue;
	//   87  171:aload_0         
	//   88  172:getfield        #624 <Field byte[] _binaryValue>
	//   89  175:areturn         
	}

	public ObjectCodec getCodec()
	{
		return _objectCodec;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field ObjectCodec _objectCodec>
	//    2    4:areturn         
	}

	public JsonLocation getCurrentLocation()
	{
		return new JsonLocation(_ioContext.getSourceReference(), -1L, -1L, _currInputRow, -1);
	//    0    0:new             #656 <Class JsonLocation>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #660 <Field IOContext _ioContext>
	//    4    8:invokevirtual   #666 <Method Object IOContext.getSourceReference()>
	//    5   11:ldc2w           #667 <Long -1L>
	//    6   14:ldc2w           #667 <Long -1L>
	//    7   17:aload_0         
	//    8   18:getfield        #329 <Field int _currInputRow>
	//    9   21:iconst_m1       
	//   10   22:invokespecial   #671 <Method void JsonLocation(Object, long, long, int, int)>
	//   11   25:areturn         
	}

	public Object getInputSource()
	{
		return ((Object) (_inputData));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field DataInput _inputData>
	//    2    4:areturn         
	}

	public int getText(Writer writer)
		throws IOException
	{
		Object obj = ((Object) (_currToken));
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field JsonToken _currToken>
	//    2    4:astore_2        
		if(obj == JsonToken.VALUE_STRING)
	//*   3    5:aload_2         
	//*   4    6:getstatic       #211 <Field JsonToken JsonToken.VALUE_STRING>
	//*   5    9:if_acmpne       37
		{
			if(_tokenIncomplete)
	//*   6   12:aload_0         
	//*   7   13:getfield        #208 <Field boolean _tokenIncomplete>
	//*   8   16:ifeq            28
			{
				_tokenIncomplete = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #208 <Field boolean _tokenIncomplete>
				_finishString();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #614 <Method void _finishString()>
			}
			return _textBuffer.contentsToWriter(writer);
	//   14   28:aload_0         
	//   15   29:getfield        #98  <Field TextBuffer _textBuffer>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #676 <Method int TextBuffer.contentsToWriter(Writer)>
	//   18   36:ireturn         
		}
		if(obj == JsonToken.FIELD_NAME)
	//*  19   37:aload_2         
	//*  20   38:getstatic       #377 <Field JsonToken JsonToken.FIELD_NAME>
	//*  21   41:if_acmpne       62
		{
			obj = ((Object) (_parsingContext.getCurrentName()));
	//   22   44:aload_0         
	//   23   45:getfield        #183 <Field JsonReadContext _parsingContext>
	//   24   48:invokevirtual   #477 <Method String JsonReadContext.getCurrentName()>
	//   25   51:astore_2        
			writer.write(((String) (obj)));
	//   26   52:aload_1         
	//   27   53:aload_2         
	//   28   54:invokevirtual   #680 <Method void Writer.write(String)>
			return ((String) (obj)).length();
	//   29   57:aload_2         
	//   30   58:invokevirtual   #559 <Method int String.length()>
	//   31   61:ireturn         
		}
		if(obj != null)
	//*  32   62:aload_2         
	//*  33   63:ifnull          95
		{
			if(((JsonToken) (obj)).isNumeric())
	//*  34   66:aload_2         
	//*  35   67:invokevirtual   #683 <Method boolean JsonToken.isNumeric()>
	//*  36   70:ifeq            82
			{
				return _textBuffer.contentsToWriter(writer);
	//   37   73:aload_0         
	//   38   74:getfield        #98  <Field TextBuffer _textBuffer>
	//   39   77:aload_1         
	//   40   78:invokevirtual   #676 <Method int TextBuffer.contentsToWriter(Writer)>
	//   41   81:ireturn         
			} else
			{
				char ac[] = ((JsonToken) (obj)).asCharArray();
	//   42   82:aload_2         
	//   43   83:invokevirtual   #686 <Method char[] JsonToken.asCharArray()>
	//   44   86:astore_2        
				writer.write(ac);
	//   45   87:aload_1         
	//   46   88:aload_2         
	//   47   89:invokevirtual   #689 <Method void Writer.write(char[])>
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
	//*   1    1:getfield        #204 <Field JsonToken _currToken>
	//*   2    4:getstatic       #211 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       35
		{
			if(_tokenIncomplete)
	//*   4   10:aload_0         
	//*   5   11:getfield        #208 <Field boolean _tokenIncomplete>
	//*   6   14:ifeq            27
			{
				_tokenIncomplete = false;
	//    7   17:aload_0         
	//    8   18:iconst_0        
	//    9   19:putfield        #208 <Field boolean _tokenIncomplete>
				return _finishAndReturnString();
	//   10   22:aload_0         
	//   11   23:invokespecial   #691 <Method String _finishAndReturnString()>
	//   12   26:areturn         
			} else
			{
				return _textBuffer.contentsAsString();
	//   13   27:aload_0         
	//   14   28:getfield        #98  <Field TextBuffer _textBuffer>
	//   15   31:invokevirtual   #115 <Method String TextBuffer.contentsAsString()>
	//   16   34:areturn         
			}
		} else
		{
			return _getText2(_currToken);
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #204 <Field JsonToken _currToken>
	//   20   40:invokevirtual   #693 <Method String _getText2(JsonToken)>
	//   21   43:areturn         
		}
	}

	public char[] getTextCharacters()
		throws IOException
	{
		if(_currToken != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #204 <Field JsonToken _currToken>
	//*   2    4:ifnull          155
		{
			switch(_currToken.id())
	//*   3    7:aload_0         
	//*   4    8:getfield        #204 <Field JsonToken _currToken>
	//*   5   11:invokevirtual   #471 <Method int JsonToken.id()>
			{
	//*   6   14:tableswitch     5 8: default 44
	//	               5 76
	//	               6 52
	//	               7 68
	//	               8 68
			default:
				return _currToken.asCharArray();
	//    7   44:aload_0         
	//    8   45:getfield        #204 <Field JsonToken _currToken>
	//    9   48:invokevirtual   #686 <Method char[] JsonToken.asCharArray()>
	//   10   51:areturn         

			case 6: // '\006'
				if(_tokenIncomplete)
	//*  11   52:aload_0         
	//*  12   53:getfield        #208 <Field boolean _tokenIncomplete>
	//*  13   56:ifeq            68
				{
					_tokenIncomplete = false;
	//   14   59:aload_0         
	//   15   60:iconst_0        
	//   16   61:putfield        #208 <Field boolean _tokenIncomplete>
					_finishString();
	//   17   64:aload_0         
	//   18   65:invokevirtual   #614 <Method void _finishString()>
				}
				// fall through

			case 7: // '\007'
			case 8: // '\b'
				return _textBuffer.getTextBuffer();
	//   19   68:aload_0         
	//   20   69:getfield        #98  <Field TextBuffer _textBuffer>
	//   21   72:invokevirtual   #697 <Method char[] TextBuffer.getTextBuffer()>
	//   22   75:areturn         

			case 5: // '\005'
				break;
			}
			if(!_nameCopied)
	//*  23   76:aload_0         
	//*  24   77:getfield        #170 <Field boolean _nameCopied>
	//*  25   80:ifne            150
			{
				String s = _parsingContext.getCurrentName();
	//   26   83:aload_0         
	//   27   84:getfield        #183 <Field JsonReadContext _parsingContext>
	//   28   87:invokevirtual   #477 <Method String JsonReadContext.getCurrentName()>
	//   29   90:astore_2        
				int i = s.length();
	//   30   91:aload_2         
	//   31   92:invokevirtual   #559 <Method int String.length()>
	//   32   95:istore_1        
				if(_nameCopyBuffer == null)
	//*  33   96:aload_0         
	//*  34   97:getfield        #701 <Field char[] _nameCopyBuffer>
	//*  35  100:ifnonnull       118
					_nameCopyBuffer = _ioContext.allocNameCopyBuffer(i);
	//   36  103:aload_0         
	//   37  104:aload_0         
	//   38  105:getfield        #660 <Field IOContext _ioContext>
	//   39  108:iload_1         
	//   40  109:invokevirtual   #705 <Method char[] IOContext.allocNameCopyBuffer(int)>
	//   41  112:putfield        #701 <Field char[] _nameCopyBuffer>
				else
	//*  42  115:goto            134
				if(_nameCopyBuffer.length < i)
	//*  43  118:aload_0         
	//*  44  119:getfield        #701 <Field char[] _nameCopyBuffer>
	//*  45  122:arraylength     
	//*  46  123:iload_1         
	//*  47  124:icmpge          134
					_nameCopyBuffer = new char[i];
	//   48  127:aload_0         
	//   49  128:iload_1         
	//   50  129:newarray        char[]
	//   51  131:putfield        #701 <Field char[] _nameCopyBuffer>
				s.getChars(0, i, _nameCopyBuffer, 0);
	//   52  134:aload_2         
	//   53  135:iconst_0        
	//   54  136:iload_1         
	//   55  137:aload_0         
	//   56  138:getfield        #701 <Field char[] _nameCopyBuffer>
	//   57  141:iconst_0        
	//   58  142:invokevirtual   #709 <Method void String.getChars(int, int, char[], int)>
				_nameCopied = true;
	//   59  145:aload_0         
	//   60  146:iconst_1        
	//   61  147:putfield        #170 <Field boolean _nameCopied>
			}
			return _nameCopyBuffer;
	//   62  150:aload_0         
	//   63  151:getfield        #701 <Field char[] _nameCopyBuffer>
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
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #204 <Field JsonToken _currToken>
	//*   2    4:getstatic       #211 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       34
		{
			if(_tokenIncomplete)
	//*   4   10:aload_0         
	//*   5   11:getfield        #208 <Field boolean _tokenIncomplete>
	//*   6   14:ifeq            26
			{
				_tokenIncomplete = false;
	//    7   17:aload_0         
	//    8   18:iconst_0        
	//    9   19:putfield        #208 <Field boolean _tokenIncomplete>
				_finishString();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #614 <Method void _finishString()>
			}
			return _textBuffer.size();
	//   12   26:aload_0         
	//   13   27:getfield        #98  <Field TextBuffer _textBuffer>
	//   14   30:invokevirtual   #713 <Method int TextBuffer.size()>
	//   15   33:ireturn         
		}
		if(_currToken == JsonToken.FIELD_NAME)
	//*  16   34:aload_0         
	//*  17   35:getfield        #204 <Field JsonToken _currToken>
	//*  18   38:getstatic       #377 <Field JsonToken JsonToken.FIELD_NAME>
	//*  19   41:if_acmpne       55
			return _parsingContext.getCurrentName().length();
	//   20   44:aload_0         
	//   21   45:getfield        #183 <Field JsonReadContext _parsingContext>
	//   22   48:invokevirtual   #477 <Method String JsonReadContext.getCurrentName()>
	//   23   51:invokevirtual   #559 <Method int String.length()>
	//   24   54:ireturn         
		if(_currToken != null)
	//*  25   55:aload_0         
	//*  26   56:getfield        #204 <Field JsonToken _currToken>
	//*  27   59:ifnull          89
		{
			if(_currToken.isNumeric())
	//*  28   62:aload_0         
	//*  29   63:getfield        #204 <Field JsonToken _currToken>
	//*  30   66:invokevirtual   #683 <Method boolean JsonToken.isNumeric()>
	//*  31   69:ifeq            80
				return _textBuffer.size();
	//   32   72:aload_0         
	//   33   73:getfield        #98  <Field TextBuffer _textBuffer>
	//   34   76:invokevirtual   #713 <Method int TextBuffer.size()>
	//   35   79:ireturn         
			else
				return _currToken.asCharArray().length;
	//   36   80:aload_0         
	//   37   81:getfield        #204 <Field JsonToken _currToken>
	//   38   84:invokevirtual   #686 <Method char[] JsonToken.asCharArray()>
	//   39   87:arraylength     
	//   40   88:ireturn         
		} else
		{
			return 0;
	//   41   89:iconst_0        
	//   42   90:ireturn         
		}
	}

	public int getTextOffset()
		throws IOException
	{
		if(_currToken != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #204 <Field JsonToken _currToken>
	//*   2    4:ifnull          72
			switch(_currToken.id())
	//*   3    7:aload_0         
	//*   4    8:getfield        #204 <Field JsonToken _currToken>
	//*   5   11:invokevirtual   #471 <Method int JsonToken.id()>
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
	//*  10   47:getfield        #208 <Field boolean _tokenIncomplete>
	//*  11   50:ifeq            62
				{
					_tokenIncomplete = false;
	//   12   53:aload_0         
	//   13   54:iconst_0        
	//   14   55:putfield        #208 <Field boolean _tokenIncomplete>
					_finishString();
	//   15   58:aload_0         
	//   16   59:invokevirtual   #614 <Method void _finishString()>
				}
				// fall through

			case 7: // '\007'
			case 8: // '\b'
				return _textBuffer.getTextOffset();
	//   17   62:aload_0         
	//   18   63:getfield        #98  <Field TextBuffer _textBuffer>
	//   19   66:invokevirtual   #716 <Method int TextBuffer.getTextOffset()>
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
		return new JsonLocation(_ioContext.getSourceReference(), -1L, -1L, _tokenInputRow, -1);
	//    0    0:new             #656 <Class JsonLocation>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #660 <Field IOContext _ioContext>
	//    4    8:invokevirtual   #666 <Method Object IOContext.getSourceReference()>
	//    5   11:ldc2w           #667 <Long -1L>
	//    6   14:ldc2w           #667 <Long -1L>
	//    7   17:aload_0         
	//    8   18:getfield        #186 <Field int _tokenInputRow>
	//    9   21:iconst_m1       
	//   10   22:invokespecial   #671 <Method void JsonLocation(Object, long, long, int, int)>
	//   11   25:areturn         
	}

	public int getValueAsInt()
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field JsonToken _currToken>
	//    2    4:astore_1        
		if(jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #721 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5    9:if_acmpeq       28
	//*   6   12:aload_1         
	//*   7   13:getstatic       #724 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   16:if_acmpne       22
	//*   9   19:goto            28
			return super.getValueAsInt(0);
	//   10   22:aload_0         
	//   11   23:iconst_0        
	//   12   24:invokespecial   #726 <Method int ParserBase.getValueAsInt(int)>
	//   13   27:ireturn         
		if((_numTypesValid & 1) == 0)
	//*  14   28:aload_0         
	//*  15   29:getfield        #729 <Field int _numTypesValid>
	//*  16   32:iconst_1        
	//*  17   33:iand            
	//*  18   34:ifne            62
		{
			if(_numTypesValid == 0)
	//*  19   37:aload_0         
	//*  20   38:getfield        #729 <Field int _numTypesValid>
	//*  21   41:ifne            49
				return _parseIntValue();
	//   22   44:aload_0         
	//   23   45:invokevirtual   #732 <Method int _parseIntValue()>
	//   24   48:ireturn         
			if((_numTypesValid & 1) == 0)
	//*  25   49:aload_0         
	//*  26   50:getfield        #729 <Field int _numTypesValid>
	//*  27   53:iconst_1        
	//*  28   54:iand            
	//*  29   55:ifne            62
				convertNumberToInt();
	//   30   58:aload_0         
	//   31   59:invokevirtual   #735 <Method void convertNumberToInt()>
		}
		return _numberInt;
	//   32   62:aload_0         
	//   33   63:getfield        #738 <Field int _numberInt>
	//   34   66:ireturn         
	}

	public int getValueAsInt(int i)
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field JsonToken _currToken>
	//    2    4:astore_2        
		if(jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    5:aload_2         
	//*   4    6:getstatic       #721 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5    9:if_acmpeq       28
	//*   6   12:aload_2         
	//*   7   13:getstatic       #724 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   16:if_acmpne       22
	//*   9   19:goto            28
			return super.getValueAsInt(i);
	//   10   22:aload_0         
	//   11   23:iload_1         
	//   12   24:invokespecial   #726 <Method int ParserBase.getValueAsInt(int)>
	//   13   27:ireturn         
		if((_numTypesValid & 1) == 0)
	//*  14   28:aload_0         
	//*  15   29:getfield        #729 <Field int _numTypesValid>
	//*  16   32:iconst_1        
	//*  17   33:iand            
	//*  18   34:ifne            62
		{
			if(_numTypesValid == 0)
	//*  19   37:aload_0         
	//*  20   38:getfield        #729 <Field int _numTypesValid>
	//*  21   41:ifne            49
				return _parseIntValue();
	//   22   44:aload_0         
	//   23   45:invokevirtual   #732 <Method int _parseIntValue()>
	//   24   48:ireturn         
			if((_numTypesValid & 1) == 0)
	//*  25   49:aload_0         
	//*  26   50:getfield        #729 <Field int _numTypesValid>
	//*  27   53:iconst_1        
	//*  28   54:iand            
	//*  29   55:ifne            62
				convertNumberToInt();
	//   30   58:aload_0         
	//   31   59:invokevirtual   #735 <Method void convertNumberToInt()>
		}
		return _numberInt;
	//   32   62:aload_0         
	//   33   63:getfield        #738 <Field int _numberInt>
	//   34   66:ireturn         
	}

	public String getValueAsString()
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #204 <Field JsonToken _currToken>
	//*   2    4:getstatic       #211 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       35
			if(_tokenIncomplete)
	//*   4   10:aload_0         
	//*   5   11:getfield        #208 <Field boolean _tokenIncomplete>
	//*   6   14:ifeq            27
			{
				_tokenIncomplete = false;
	//    7   17:aload_0         
	//    8   18:iconst_0        
	//    9   19:putfield        #208 <Field boolean _tokenIncomplete>
				return _finishAndReturnString();
	//   10   22:aload_0         
	//   11   23:invokespecial   #691 <Method String _finishAndReturnString()>
	//   12   26:areturn         
			} else
			{
				return _textBuffer.contentsAsString();
	//   13   27:aload_0         
	//   14   28:getfield        #98  <Field TextBuffer _textBuffer>
	//   15   31:invokevirtual   #115 <Method String TextBuffer.contentsAsString()>
	//   16   34:areturn         
			}
		if(_currToken == JsonToken.FIELD_NAME)
	//*  17   35:aload_0         
	//*  18   36:getfield        #204 <Field JsonToken _currToken>
	//*  19   39:getstatic       #377 <Field JsonToken JsonToken.FIELD_NAME>
	//*  20   42:if_acmpne       50
			return getCurrentName();
	//   21   45:aload_0         
	//   22   46:invokevirtual   #740 <Method String getCurrentName()>
	//   23   49:areturn         
		else
			return super.getValueAsString(((String) (null)));
	//   24   50:aload_0         
	//   25   51:aconst_null     
	//   26   52:invokespecial   #743 <Method String ParserBase.getValueAsString(String)>
	//   27   55:areturn         
	}

	public String getValueAsString(String s)
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #204 <Field JsonToken _currToken>
	//*   2    4:getstatic       #211 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       35
			if(_tokenIncomplete)
	//*   4   10:aload_0         
	//*   5   11:getfield        #208 <Field boolean _tokenIncomplete>
	//*   6   14:ifeq            27
			{
				_tokenIncomplete = false;
	//    7   17:aload_0         
	//    8   18:iconst_0        
	//    9   19:putfield        #208 <Field boolean _tokenIncomplete>
				return _finishAndReturnString();
	//   10   22:aload_0         
	//   11   23:invokespecial   #691 <Method String _finishAndReturnString()>
	//   12   26:areturn         
			} else
			{
				return _textBuffer.contentsAsString();
	//   13   27:aload_0         
	//   14   28:getfield        #98  <Field TextBuffer _textBuffer>
	//   15   31:invokevirtual   #115 <Method String TextBuffer.contentsAsString()>
	//   16   34:areturn         
			}
		if(_currToken == JsonToken.FIELD_NAME)
	//*  17   35:aload_0         
	//*  18   36:getfield        #204 <Field JsonToken _currToken>
	//*  19   39:getstatic       #377 <Field JsonToken JsonToken.FIELD_NAME>
	//*  20   42:if_acmpne       50
			return getCurrentName();
	//   21   45:aload_0         
	//   22   46:invokevirtual   #740 <Method String getCurrentName()>
	//   23   49:areturn         
		else
			return super.getValueAsString(s);
	//   24   50:aload_0         
	//   25   51:aload_1         
	//   26   52:invokespecial   #743 <Method String ParserBase.getValueAsString(String)>
	//   27   55:areturn         
	}

	public Boolean nextBooleanValue()
		throws IOException
	{
		if(_currToken == JsonToken.FIELD_NAME)
	//*   0    0:aload_0         
	//*   1    1:getfield        #204 <Field JsonToken _currToken>
	//*   2    4:getstatic       #377 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:if_acmpne       108
		{
			_nameCopied = false;
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:putfield        #170 <Field boolean _nameCopied>
			JsonToken jsontoken = _nextToken;
	//    7   15:aload_0         
	//    8   16:getfield        #174 <Field JsonToken _nextToken>
	//    9   19:astore_1        
			_nextToken = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #174 <Field JsonToken _nextToken>
			_currToken = jsontoken;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #204 <Field JsonToken _currToken>
			if(jsontoken == JsonToken.VALUE_TRUE)
	//*  16   30:aload_1         
	//*  17   31:getstatic       #226 <Field JsonToken JsonToken.VALUE_TRUE>
	//*  18   34:if_acmpne       41
				return Boolean.TRUE;
	//   19   37:getstatic       #751 <Field Boolean Boolean.TRUE>
	//   20   40:areturn         
			if(jsontoken == JsonToken.VALUE_FALSE)
	//*  21   41:aload_1         
	//*  22   42:getstatic       #236 <Field JsonToken JsonToken.VALUE_FALSE>
	//*  23   45:if_acmpne       52
				return Boolean.FALSE;
	//   24   48:getstatic       #754 <Field Boolean Boolean.FALSE>
	//   25   51:areturn         
			if(jsontoken == JsonToken.START_ARRAY)
	//*  26   52:aload_1         
	//*  27   53:getstatic       #179 <Field JsonToken JsonToken.START_ARRAY>
	//*  28   56:if_acmpne       80
			{
				_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   29   59:aload_0         
	//   30   60:aload_0         
	//   31   61:getfield        #183 <Field JsonReadContext _parsingContext>
	//   32   64:aload_0         
	//   33   65:getfield        #186 <Field int _tokenInputRow>
	//   34   68:aload_0         
	//   35   69:getfield        #189 <Field int _tokenInputCol>
	//   36   72:invokevirtual   #195 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   37   75:putfield        #183 <Field JsonReadContext _parsingContext>
				return null;
	//   38   78:aconst_null     
	//   39   79:areturn         
			}
			if(jsontoken == JsonToken.START_OBJECT)
	//*  40   80:aload_1         
	//*  41   81:getstatic       #198 <Field JsonToken JsonToken.START_OBJECT>
	//*  42   84:if_acmpne       106
				_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   43   87:aload_0         
	//   44   88:aload_0         
	//   45   89:getfield        #183 <Field JsonReadContext _parsingContext>
	//   46   92:aload_0         
	//   47   93:getfield        #186 <Field int _tokenInputRow>
	//   48   96:aload_0         
	//   49   97:getfield        #189 <Field int _tokenInputCol>
	//   50  100:invokevirtual   #201 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   51  103:putfield        #183 <Field JsonReadContext _parsingContext>
			return null;
	//   52  106:aconst_null     
	//   53  107:areturn         
		}
		JsonToken jsontoken1 = nextToken();
	//   54  108:aload_0         
	//   55  109:invokevirtual   #757 <Method JsonToken nextToken()>
	//   56  112:astore_1        
		if(jsontoken1 == JsonToken.VALUE_TRUE)
	//*  57  113:aload_1         
	//*  58  114:getstatic       #226 <Field JsonToken JsonToken.VALUE_TRUE>
	//*  59  117:if_acmpne       124
			return Boolean.TRUE;
	//   60  120:getstatic       #751 <Field Boolean Boolean.TRUE>
	//   61  123:areturn         
		if(jsontoken1 == JsonToken.VALUE_FALSE)
	//*  62  124:aload_1         
	//*  63  125:getstatic       #236 <Field JsonToken JsonToken.VALUE_FALSE>
	//*  64  128:if_acmpne       135
			return Boolean.FALSE;
	//   65  131:getstatic       #754 <Field Boolean Boolean.FALSE>
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
	//    2    2:putfield        #729 <Field int _numTypesValid>
		if(_currToken == JsonToken.FIELD_NAME)
	//*   3    5:aload_0         
	//*   4    6:getfield        #204 <Field JsonToken _currToken>
	//*   5    9:getstatic       #377 <Field JsonToken JsonToken.FIELD_NAME>
	//*   6   12:if_acmpne       22
		{
			_nextAfterName();
	//    7   15:aload_0         
	//    8   16:invokespecial   #760 <Method JsonToken _nextAfterName()>
	//    9   19:pop             
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
		}
		if(_tokenIncomplete)
	//*  12   22:aload_0         
	//*  13   23:getfield        #208 <Field boolean _tokenIncomplete>
	//*  14   26:ifeq            33
			_skipString();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #762 <Method void _skipString()>
		int j = _skipWS();
	//   17   33:aload_0         
	//   18   34:invokespecial   #764 <Method int _skipWS()>
	//   19   37:istore_2        
		_binaryValue = null;
	//   20   38:aload_0         
	//   21   39:aconst_null     
	//   22   40:putfield        #624 <Field byte[] _binaryValue>
		_tokenInputRow = _currInputRow;
	//   23   43:aload_0         
	//   24   44:aload_0         
	//   25   45:getfield        #329 <Field int _currInputRow>
	//   26   48:putfield        #186 <Field int _tokenInputRow>
		if(j == 93)
	//*  27   51:iload_2         
	//*  28   52:bipush          93
	//*  29   54:icmpne          94
		{
			if(!_parsingContext.inArray())
	//*  30   57:aload_0         
	//*  31   58:getfield        #183 <Field JsonReadContext _parsingContext>
	//*  32   61:invokevirtual   #527 <Method boolean JsonReadContext.inArray()>
	//*  33   64:ifne            74
				_reportMismatchedEndMarker(j, '}');
	//   34   67:aload_0         
	//   35   68:iload_2         
	//   36   69:bipush          125
	//   37   71:invokevirtual   #768 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   38   74:aload_0         
	//   39   75:aload_0         
	//   40   76:getfield        #183 <Field JsonReadContext _parsingContext>
	//   41   79:invokevirtual   #772 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   42   82:putfield        #183 <Field JsonReadContext _parsingContext>
			_currToken = JsonToken.END_ARRAY;
	//   43   85:aload_0         
	//   44   86:getstatic       #775 <Field JsonToken JsonToken.END_ARRAY>
	//   45   89:putfield        #204 <Field JsonToken _currToken>
			return null;
	//   46   92:aconst_null     
	//   47   93:areturn         
		}
		if(j == 125)
	//*  48   94:iload_2         
	//*  49   95:bipush          125
	//*  50   97:icmpne          137
		{
			if(!_parsingContext.inObject())
	//*  51  100:aload_0         
	//*  52  101:getfield        #183 <Field JsonReadContext _parsingContext>
	//*  53  104:invokevirtual   #778 <Method boolean JsonReadContext.inObject()>
	//*  54  107:ifne            117
				_reportMismatchedEndMarker(j, ']');
	//   55  110:aload_0         
	//   56  111:iload_2         
	//   57  112:bipush          93
	//   58  114:invokevirtual   #768 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   59  117:aload_0         
	//   60  118:aload_0         
	//   61  119:getfield        #183 <Field JsonReadContext _parsingContext>
	//   62  122:invokevirtual   #772 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   63  125:putfield        #183 <Field JsonReadContext _parsingContext>
			_currToken = JsonToken.END_OBJECT;
	//   64  128:aload_0         
	//   65  129:getstatic       #781 <Field JsonToken JsonToken.END_OBJECT>
	//   66  132:putfield        #204 <Field JsonToken _currToken>
			return null;
	//   67  135:aconst_null     
	//   68  136:areturn         
		}
		int i = j;
	//   69  137:iload_2         
	//   70  138:istore_1        
		if(_parsingContext.expectComma())
	//*  71  139:aload_0         
	//*  72  140:getfield        #183 <Field JsonReadContext _parsingContext>
	//*  73  143:invokevirtual   #784 <Method boolean JsonReadContext.expectComma()>
	//*  74  146:ifeq            205
		{
			if(j != 44)
	//*  75  149:iload_2         
	//*  76  150:bipush          44
	//*  77  152:icmpeq          200
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   78  155:new             #294 <Class StringBuilder>
	//   79  158:dup             
	//   80  159:invokespecial   #296 <Method void StringBuilder()>
	//   81  162:astore_3        
				stringbuilder.append("was expecting comma to separate ");
	//   82  163:aload_3         
	//   83  164:ldc2            #786 <String "was expecting comma to separate ">
	//   84  167:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   85  170:pop             
				stringbuilder.append(_parsingContext.typeDesc());
	//   86  171:aload_3         
	//   87  172:aload_0         
	//   88  173:getfield        #183 <Field JsonReadContext _parsingContext>
	//   89  176:invokevirtual   #789 <Method String JsonReadContext.typeDesc()>
	//   90  179:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   91  182:pop             
				stringbuilder.append(" entries");
	//   92  183:aload_3         
	//   93  184:ldc2            #791 <String " entries">
	//   94  187:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   95  190:pop             
				_reportUnexpectedChar(j, stringbuilder.toString());
	//   96  191:aload_0         
	//   97  192:iload_2         
	//   98  193:aload_3         
	//   99  194:invokevirtual   #310 <Method String StringBuilder.toString()>
	//  100  197:invokevirtual   #345 <Method void _reportUnexpectedChar(int, String)>
			}
			i = _skipWS();
	//  101  200:aload_0         
	//  102  201:invokespecial   #764 <Method int _skipWS()>
	//  103  204:istore_1        
		}
		if(!_parsingContext.inObject())
	//* 104  205:aload_0         
	//* 105  206:getfield        #183 <Field JsonReadContext _parsingContext>
	//* 106  209:invokevirtual   #778 <Method boolean JsonReadContext.inObject()>
	//* 107  212:ifne            223
		{
			_nextTokenNotInObject(i);
	//  108  215:aload_0         
	//  109  216:iload_1         
	//  110  217:invokespecial   #793 <Method JsonToken _nextTokenNotInObject(int)>
	//  111  220:pop             
			return null;
	//  112  221:aconst_null     
	//  113  222:areturn         
		}
		String s = _parseName(i);
	//  114  223:aload_0         
	//  115  224:iload_1         
	//  116  225:invokevirtual   #795 <Method String _parseName(int)>
	//  117  228:astore          4
		_parsingContext.setCurrentName(s);
	//  118  230:aload_0         
	//  119  231:getfield        #183 <Field JsonReadContext _parsingContext>
	//  120  234:aload           4
	//  121  236:invokevirtual   #798 <Method void JsonReadContext.setCurrentName(String)>
		_currToken = JsonToken.FIELD_NAME;
	//  122  239:aload_0         
	//  123  240:getstatic       #377 <Field JsonToken JsonToken.FIELD_NAME>
	//  124  243:putfield        #204 <Field JsonToken _currToken>
		i = _skipColon();
	//  125  246:aload_0         
	//  126  247:invokespecial   #800 <Method int _skipColon()>
	//  127  250:istore_1        
		if(i == 34)
	//* 128  251:iload_1         
	//* 129  252:bipush          34
	//* 130  254:icmpne          272
		{
			_tokenIncomplete = true;
	//  131  257:aload_0         
	//  132  258:iconst_1        
	//  133  259:putfield        #208 <Field boolean _tokenIncomplete>
			_nextToken = JsonToken.VALUE_STRING;
	//  134  262:aload_0         
	//  135  263:getstatic       #211 <Field JsonToken JsonToken.VALUE_STRING>
	//  136  266:putfield        #174 <Field JsonToken _nextToken>
			return s;
	//  137  269:aload           4
	//  138  271:areturn         
		}
		JsonToken jsontoken;
		if(i != 45)
	//* 139  272:iload_1         
	//* 140  273:bipush          45
	//* 141  275:icmpeq          438
		{
			if(i != 91)
	//* 142  278:iload_1         
	//* 143  279:bipush          91
	//* 144  281:icmpeq          431
			{
				if(i != 102)
	//* 145  284:iload_1         
	//* 146  285:bipush          102
	//* 147  287:icmpeq          417
				{
					if(i != 110)
	//* 148  290:iload_1         
	//* 149  291:bipush          110
	//* 150  293:icmpeq          403
					{
						if(i != 116)
	//* 151  296:iload_1         
	//* 152  297:bipush          116
	//* 153  299:icmpeq          389
						{
							if(i != 123)
	//* 154  302:iload_1         
	//* 155  303:bipush          123
	//* 156  305:icmpeq          382
								switch(i)
	//* 157  308:iload_1         
								{
	//* 158  309:tableswitch     48 57: default 364
	//	               48 373
	//	               49 373
	//	               50 373
	//	               51 373
	//	               52 373
	//	               53 373
	//	               54 373
	//	               55 373
	//	               56 373
	//	               57 373
								default:
									jsontoken = _handleUnexpectedValue(i);
	//  159  364:aload_0         
	//  160  365:iload_1         
	//  161  366:invokevirtual   #214 <Method JsonToken _handleUnexpectedValue(int)>
	//  162  369:astore_3        
									break;

	//* 163  370:goto            443
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
	//  164  373:aload_0         
	//  165  374:iload_1         
	//  166  375:invokevirtual   #217 <Method JsonToken _parsePosNumber(int)>
	//  167  378:astore_3        
									break;
								}
							else
	//* 168  379:goto            443
								jsontoken = JsonToken.START_OBJECT;
	//  169  382:getstatic       #198 <Field JsonToken JsonToken.START_OBJECT>
	//  170  385:astore_3        
						} else
	//* 171  386:goto            443
						{
							_matchToken("true", 1);
	//  172  389:aload_0         
	//  173  390:ldc1            #219 <String "true">
	//  174  392:iconst_1        
	//  175  393:invokevirtual   #223 <Method void _matchToken(String, int)>
							jsontoken = JsonToken.VALUE_TRUE;
	//  176  396:getstatic       #226 <Field JsonToken JsonToken.VALUE_TRUE>
	//  177  399:astore_3        
						}
					} else
	//* 178  400:goto            443
					{
						_matchToken("null", 1);
	//  179  403:aload_0         
	//  180  404:ldc1            #228 <String "null">
	//  181  406:iconst_1        
	//  182  407:invokevirtual   #223 <Method void _matchToken(String, int)>
						jsontoken = JsonToken.VALUE_NULL;
	//  183  410:getstatic       #231 <Field JsonToken JsonToken.VALUE_NULL>
	//  184  413:astore_3        
					}
				} else
	//* 185  414:goto            443
				{
					_matchToken("false", 1);
	//  186  417:aload_0         
	//  187  418:ldc1            #233 <String "false">
	//  188  420:iconst_1        
	//  189  421:invokevirtual   #223 <Method void _matchToken(String, int)>
					jsontoken = JsonToken.VALUE_FALSE;
	//  190  424:getstatic       #236 <Field JsonToken JsonToken.VALUE_FALSE>
	//  191  427:astore_3        
				}
			} else
	//* 192  428:goto            443
			{
				jsontoken = JsonToken.START_ARRAY;
	//  193  431:getstatic       #179 <Field JsonToken JsonToken.START_ARRAY>
	//  194  434:astore_3        
			}
		} else
	//* 195  435:goto            443
		{
			jsontoken = _parseNegNumber();
	//  196  438:aload_0         
	//  197  439:invokevirtual   #239 <Method JsonToken _parseNegNumber()>
	//  198  442:astore_3        
		}
		_nextToken = jsontoken;
	//  199  443:aload_0         
	//  200  444:aload_3         
	//  201  445:putfield        #174 <Field JsonToken _nextToken>
		return s;
	//  202  448:aload           4
	//  203  450:areturn         
	}

	public int nextIntValue(int i)
		throws IOException
	{
		if(_currToken == JsonToken.FIELD_NAME)
	//*   0    0:aload_0         
	//*   1    1:getfield        #204 <Field JsonToken _currToken>
	//*   2    4:getstatic       #377 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:if_acmpne       98
		{
			_nameCopied = false;
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:putfield        #170 <Field boolean _nameCopied>
			JsonToken jsontoken = _nextToken;
	//    7   15:aload_0         
	//    8   16:getfield        #174 <Field JsonToken _nextToken>
	//    9   19:astore_2        
			_nextToken = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #174 <Field JsonToken _nextToken>
			_currToken = jsontoken;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #204 <Field JsonToken _currToken>
			if(jsontoken == JsonToken.VALUE_NUMBER_INT)
	//*  16   30:aload_2         
	//*  17   31:getstatic       #721 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  18   34:if_acmpne       42
				return getIntValue();
	//   19   37:aload_0         
	//   20   38:invokevirtual   #804 <Method int getIntValue()>
	//   21   41:ireturn         
			if(jsontoken == JsonToken.START_ARRAY)
	//*  22   42:aload_2         
	//*  23   43:getstatic       #179 <Field JsonToken JsonToken.START_ARRAY>
	//*  24   46:if_acmpne       70
			{
				_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   25   49:aload_0         
	//   26   50:aload_0         
	//   27   51:getfield        #183 <Field JsonReadContext _parsingContext>
	//   28   54:aload_0         
	//   29   55:getfield        #186 <Field int _tokenInputRow>
	//   30   58:aload_0         
	//   31   59:getfield        #189 <Field int _tokenInputCol>
	//   32   62:invokevirtual   #195 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   33   65:putfield        #183 <Field JsonReadContext _parsingContext>
				return i;
	//   34   68:iload_1         
	//   35   69:ireturn         
			}
			if(jsontoken == JsonToken.START_OBJECT)
	//*  36   70:aload_2         
	//*  37   71:getstatic       #198 <Field JsonToken JsonToken.START_OBJECT>
	//*  38   74:if_acmpne       96
				_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   39   77:aload_0         
	//   40   78:aload_0         
	//   41   79:getfield        #183 <Field JsonReadContext _parsingContext>
	//   42   82:aload_0         
	//   43   83:getfield        #186 <Field int _tokenInputRow>
	//   44   86:aload_0         
	//   45   87:getfield        #189 <Field int _tokenInputCol>
	//   46   90:invokevirtual   #201 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   47   93:putfield        #183 <Field JsonReadContext _parsingContext>
			return i;
	//   48   96:iload_1         
	//   49   97:ireturn         
		}
		if(nextToken() == JsonToken.VALUE_NUMBER_INT)
	//*  50   98:aload_0         
	//*  51   99:invokevirtual   #757 <Method JsonToken nextToken()>
	//*  52  102:getstatic       #721 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  53  105:if_acmpne       113
			i = getIntValue();
	//   54  108:aload_0         
	//   55  109:invokevirtual   #804 <Method int getIntValue()>
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
	//*   1    1:getfield        #204 <Field JsonToken _currToken>
	//*   2    4:getstatic       #377 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:if_acmpne       98
		{
			_nameCopied = false;
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:putfield        #170 <Field boolean _nameCopied>
			JsonToken jsontoken = _nextToken;
	//    7   15:aload_0         
	//    8   16:getfield        #174 <Field JsonToken _nextToken>
	//    9   19:astore_3        
			_nextToken = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #174 <Field JsonToken _nextToken>
			_currToken = jsontoken;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #204 <Field JsonToken _currToken>
			if(jsontoken == JsonToken.VALUE_NUMBER_INT)
	//*  16   30:aload_3         
	//*  17   31:getstatic       #721 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  18   34:if_acmpne       42
				return getLongValue();
	//   19   37:aload_0         
	//   20   38:invokevirtual   #810 <Method long getLongValue()>
	//   21   41:lreturn         
			if(jsontoken == JsonToken.START_ARRAY)
	//*  22   42:aload_3         
	//*  23   43:getstatic       #179 <Field JsonToken JsonToken.START_ARRAY>
	//*  24   46:if_acmpne       70
			{
				_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   25   49:aload_0         
	//   26   50:aload_0         
	//   27   51:getfield        #183 <Field JsonReadContext _parsingContext>
	//   28   54:aload_0         
	//   29   55:getfield        #186 <Field int _tokenInputRow>
	//   30   58:aload_0         
	//   31   59:getfield        #189 <Field int _tokenInputCol>
	//   32   62:invokevirtual   #195 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   33   65:putfield        #183 <Field JsonReadContext _parsingContext>
				return l;
	//   34   68:lload_1         
	//   35   69:lreturn         
			}
			if(jsontoken == JsonToken.START_OBJECT)
	//*  36   70:aload_3         
	//*  37   71:getstatic       #198 <Field JsonToken JsonToken.START_OBJECT>
	//*  38   74:if_acmpne       96
				_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   39   77:aload_0         
	//   40   78:aload_0         
	//   41   79:getfield        #183 <Field JsonReadContext _parsingContext>
	//   42   82:aload_0         
	//   43   83:getfield        #186 <Field int _tokenInputRow>
	//   44   86:aload_0         
	//   45   87:getfield        #189 <Field int _tokenInputCol>
	//   46   90:invokevirtual   #201 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   47   93:putfield        #183 <Field JsonReadContext _parsingContext>
			return l;
	//   48   96:lload_1         
	//   49   97:lreturn         
		}
		if(nextToken() == JsonToken.VALUE_NUMBER_INT)
	//*  50   98:aload_0         
	//*  51   99:invokevirtual   #757 <Method JsonToken nextToken()>
	//*  52  102:getstatic       #721 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  53  105:if_acmpne       113
			l = getLongValue();
	//   54  108:aload_0         
	//   55  109:invokevirtual   #810 <Method long getLongValue()>
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
	//    1    1:getfield        #204 <Field JsonToken _currToken>
	//    2    4:astore_2        
		JsonToken jsontoken1 = JsonToken.FIELD_NAME;
	//    3    5:getstatic       #377 <Field JsonToken JsonToken.FIELD_NAME>
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
	//   12   18:putfield        #170 <Field boolean _nameCopied>
			obj = ((Object) (_nextToken));
	//   13   21:aload_0         
	//   14   22:getfield        #174 <Field JsonToken _nextToken>
	//   15   25:astore_1        
			_nextToken = null;
	//   16   26:aload_0         
	//   17   27:aconst_null     
	//   18   28:putfield        #174 <Field JsonToken _nextToken>
			_currToken = ((JsonToken) (obj));
	//   19   31:aload_0         
	//   20   32:aload_1         
	//   21   33:putfield        #204 <Field JsonToken _currToken>
			if(obj == JsonToken.VALUE_STRING)
	//*  22   36:aload_1         
	//*  23   37:getstatic       #211 <Field JsonToken JsonToken.VALUE_STRING>
	//*  24   40:if_acmpne       68
				if(_tokenIncomplete)
	//*  25   43:aload_0         
	//*  26   44:getfield        #208 <Field boolean _tokenIncomplete>
	//*  27   47:ifeq            60
				{
					_tokenIncomplete = false;
	//   28   50:aload_0         
	//   29   51:iconst_0        
	//   30   52:putfield        #208 <Field boolean _tokenIncomplete>
					return _finishAndReturnString();
	//   31   55:aload_0         
	//   32   56:invokespecial   #691 <Method String _finishAndReturnString()>
	//   33   59:areturn         
				} else
				{
					return _textBuffer.contentsAsString();
	//   34   60:aload_0         
	//   35   61:getfield        #98  <Field TextBuffer _textBuffer>
	//   36   64:invokevirtual   #115 <Method String TextBuffer.contentsAsString()>
	//   37   67:areturn         
				}
			if(obj == JsonToken.START_ARRAY)
	//*  38   68:aload_1         
	//*  39   69:getstatic       #179 <Field JsonToken JsonToken.START_ARRAY>
	//*  40   72:if_acmpne       96
			{
				_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   41   75:aload_0         
	//   42   76:aload_0         
	//   43   77:getfield        #183 <Field JsonReadContext _parsingContext>
	//   44   80:aload_0         
	//   45   81:getfield        #186 <Field int _tokenInputRow>
	//   46   84:aload_0         
	//   47   85:getfield        #189 <Field int _tokenInputCol>
	//   48   88:invokevirtual   #195 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   49   91:putfield        #183 <Field JsonReadContext _parsingContext>
				return null;
	//   50   94:aconst_null     
	//   51   95:areturn         
			}
			if(obj == JsonToken.START_OBJECT)
	//*  52   96:aload_1         
	//*  53   97:getstatic       #198 <Field JsonToken JsonToken.START_OBJECT>
	//*  54  100:if_acmpne       122
				_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   55  103:aload_0         
	//   56  104:aload_0         
	//   57  105:getfield        #183 <Field JsonReadContext _parsingContext>
	//   58  108:aload_0         
	//   59  109:getfield        #186 <Field int _tokenInputRow>
	//   60  112:aload_0         
	//   61  113:getfield        #189 <Field int _tokenInputCol>
	//   62  116:invokevirtual   #201 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   63  119:putfield        #183 <Field JsonReadContext _parsingContext>
			return null;
	//   64  122:aconst_null     
	//   65  123:areturn         
		}
		if(nextToken() == JsonToken.VALUE_STRING)
	//*  66  124:aload_0         
	//*  67  125:invokevirtual   #757 <Method JsonToken nextToken()>
	//*  68  128:getstatic       #211 <Field JsonToken JsonToken.VALUE_STRING>
	//*  69  131:if_acmpne       139
			obj = ((Object) (getText()));
	//   70  134:aload_0         
	//   71  135:invokevirtual   #647 <Method String getText()>
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
	//*   1    1:getfield        #204 <Field JsonToken _currToken>
	//*   2    4:getstatic       #377 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:if_acmpne       15
			return _nextAfterName();
	//    4   10:aload_0         
	//    5   11:invokespecial   #760 <Method JsonToken _nextAfterName()>
	//    6   14:areturn         
		_numTypesValid = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #729 <Field int _numTypesValid>
		if(_tokenIncomplete)
	//*  10   20:aload_0         
	//*  11   21:getfield        #208 <Field boolean _tokenIncomplete>
	//*  12   24:ifeq            31
			_skipString();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #762 <Method void _skipString()>
		int j = _skipWS();
	//   15   31:aload_0         
	//   16   32:invokespecial   #764 <Method int _skipWS()>
	//   17   35:istore_2        
		_binaryValue = null;
	//   18   36:aload_0         
	//   19   37:aconst_null     
	//   20   38:putfield        #624 <Field byte[] _binaryValue>
		_tokenInputRow = _currInputRow;
	//   21   41:aload_0         
	//   22   42:aload_0         
	//   23   43:getfield        #329 <Field int _currInputRow>
	//   24   46:putfield        #186 <Field int _tokenInputRow>
		if(j == 93)
	//*  25   49:iload_2         
	//*  26   50:bipush          93
	//*  27   52:icmpne          94
		{
			if(!_parsingContext.inArray())
	//*  28   55:aload_0         
	//*  29   56:getfield        #183 <Field JsonReadContext _parsingContext>
	//*  30   59:invokevirtual   #527 <Method boolean JsonReadContext.inArray()>
	//*  31   62:ifne            72
				_reportMismatchedEndMarker(j, '}');
	//   32   65:aload_0         
	//   33   66:iload_2         
	//   34   67:bipush          125
	//   35   69:invokevirtual   #768 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   36   72:aload_0         
	//   37   73:aload_0         
	//   38   74:getfield        #183 <Field JsonReadContext _parsingContext>
	//   39   77:invokevirtual   #772 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   40   80:putfield        #183 <Field JsonReadContext _parsingContext>
			JsonToken jsontoken = JsonToken.END_ARRAY;
	//   41   83:getstatic       #775 <Field JsonToken JsonToken.END_ARRAY>
	//   42   86:astore_3        
			_currToken = jsontoken;
	//   43   87:aload_0         
	//   44   88:aload_3         
	//   45   89:putfield        #204 <Field JsonToken _currToken>
			return jsontoken;
	//   46   92:aload_3         
	//   47   93:areturn         
		}
		if(j == 125)
	//*  48   94:iload_2         
	//*  49   95:bipush          125
	//*  50   97:icmpne          139
		{
			if(!_parsingContext.inObject())
	//*  51  100:aload_0         
	//*  52  101:getfield        #183 <Field JsonReadContext _parsingContext>
	//*  53  104:invokevirtual   #778 <Method boolean JsonReadContext.inObject()>
	//*  54  107:ifne            117
				_reportMismatchedEndMarker(j, ']');
	//   55  110:aload_0         
	//   56  111:iload_2         
	//   57  112:bipush          93
	//   58  114:invokevirtual   #768 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   59  117:aload_0         
	//   60  118:aload_0         
	//   61  119:getfield        #183 <Field JsonReadContext _parsingContext>
	//   62  122:invokevirtual   #772 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   63  125:putfield        #183 <Field JsonReadContext _parsingContext>
			JsonToken jsontoken1 = JsonToken.END_OBJECT;
	//   64  128:getstatic       #781 <Field JsonToken JsonToken.END_OBJECT>
	//   65  131:astore_3        
			_currToken = jsontoken1;
	//   66  132:aload_0         
	//   67  133:aload_3         
	//   68  134:putfield        #204 <Field JsonToken _currToken>
			return jsontoken1;
	//   69  137:aload_3         
	//   70  138:areturn         
		}
		int i = j;
	//   71  139:iload_2         
	//   72  140:istore_1        
		if(_parsingContext.expectComma())
	//*  73  141:aload_0         
	//*  74  142:getfield        #183 <Field JsonReadContext _parsingContext>
	//*  75  145:invokevirtual   #784 <Method boolean JsonReadContext.expectComma()>
	//*  76  148:ifeq            207
		{
			if(j != 44)
	//*  77  151:iload_2         
	//*  78  152:bipush          44
	//*  79  154:icmpeq          202
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   80  157:new             #294 <Class StringBuilder>
	//   81  160:dup             
	//   82  161:invokespecial   #296 <Method void StringBuilder()>
	//   83  164:astore_3        
				stringbuilder.append("was expecting comma to separate ");
	//   84  165:aload_3         
	//   85  166:ldc2            #786 <String "was expecting comma to separate ">
	//   86  169:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   87  172:pop             
				stringbuilder.append(_parsingContext.typeDesc());
	//   88  173:aload_3         
	//   89  174:aload_0         
	//   90  175:getfield        #183 <Field JsonReadContext _parsingContext>
	//   91  178:invokevirtual   #789 <Method String JsonReadContext.typeDesc()>
	//   92  181:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   93  184:pop             
				stringbuilder.append(" entries");
	//   94  185:aload_3         
	//   95  186:ldc2            #791 <String " entries">
	//   96  189:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   97  192:pop             
				_reportUnexpectedChar(j, stringbuilder.toString());
	//   98  193:aload_0         
	//   99  194:iload_2         
	//  100  195:aload_3         
	//  101  196:invokevirtual   #310 <Method String StringBuilder.toString()>
	//  102  199:invokevirtual   #345 <Method void _reportUnexpectedChar(int, String)>
			}
			i = _skipWS();
	//  103  202:aload_0         
	//  104  203:invokespecial   #764 <Method int _skipWS()>
	//  105  206:istore_1        
		}
		if(!_parsingContext.inObject())
	//* 106  207:aload_0         
	//* 107  208:getfield        #183 <Field JsonReadContext _parsingContext>
	//* 108  211:invokevirtual   #778 <Method boolean JsonReadContext.inObject()>
	//* 109  214:ifne            223
			return _nextTokenNotInObject(i);
	//  110  217:aload_0         
	//  111  218:iload_1         
	//  112  219:invokespecial   #793 <Method JsonToken _nextTokenNotInObject(int)>
	//  113  222:areturn         
		Object obj = ((Object) (_parseName(i)));
	//  114  223:aload_0         
	//  115  224:iload_1         
	//  116  225:invokevirtual   #795 <Method String _parseName(int)>
	//  117  228:astore_3        
		_parsingContext.setCurrentName(((String) (obj)));
	//  118  229:aload_0         
	//  119  230:getfield        #183 <Field JsonReadContext _parsingContext>
	//  120  233:aload_3         
	//  121  234:invokevirtual   #798 <Method void JsonReadContext.setCurrentName(String)>
		_currToken = JsonToken.FIELD_NAME;
	//  122  237:aload_0         
	//  123  238:getstatic       #377 <Field JsonToken JsonToken.FIELD_NAME>
	//  124  241:putfield        #204 <Field JsonToken _currToken>
		i = _skipColon();
	//  125  244:aload_0         
	//  126  245:invokespecial   #800 <Method int _skipColon()>
	//  127  248:istore_1        
		if(i == 34)
	//* 128  249:iload_1         
	//* 129  250:bipush          34
	//* 130  252:icmpne          272
		{
			_tokenIncomplete = true;
	//  131  255:aload_0         
	//  132  256:iconst_1        
	//  133  257:putfield        #208 <Field boolean _tokenIncomplete>
			_nextToken = JsonToken.VALUE_STRING;
	//  134  260:aload_0         
	//  135  261:getstatic       #211 <Field JsonToken JsonToken.VALUE_STRING>
	//  136  264:putfield        #174 <Field JsonToken _nextToken>
			return _currToken;
	//  137  267:aload_0         
	//  138  268:getfield        #204 <Field JsonToken _currToken>
	//  139  271:areturn         
		}
		if(i != 45)
	//* 140  272:iload_1         
	//* 141  273:bipush          45
	//* 142  275:icmpeq          438
		{
			if(i != 91)
	//* 143  278:iload_1         
	//* 144  279:bipush          91
	//* 145  281:icmpeq          431
			{
				if(i != 102)
	//* 146  284:iload_1         
	//* 147  285:bipush          102
	//* 148  287:icmpeq          417
				{
					if(i != 110)
	//* 149  290:iload_1         
	//* 150  291:bipush          110
	//* 151  293:icmpeq          403
					{
						if(i != 116)
	//* 152  296:iload_1         
	//* 153  297:bipush          116
	//* 154  299:icmpeq          389
						{
							if(i != 123)
	//* 155  302:iload_1         
	//* 156  303:bipush          123
	//* 157  305:icmpeq          382
								switch(i)
	//* 158  308:iload_1         
								{
	//* 159  309:tableswitch     48 57: default 364
	//	               48 373
	//	               49 373
	//	               50 373
	//	               51 373
	//	               52 373
	//	               53 373
	//	               54 373
	//	               55 373
	//	               56 373
	//	               57 373
								default:
									obj = ((Object) (_handleUnexpectedValue(i)));
	//  160  364:aload_0         
	//  161  365:iload_1         
	//  162  366:invokevirtual   #214 <Method JsonToken _handleUnexpectedValue(int)>
	//  163  369:astore_3        
									break;

	//* 164  370:goto            443
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
	//  165  373:aload_0         
	//  166  374:iload_1         
	//  167  375:invokevirtual   #217 <Method JsonToken _parsePosNumber(int)>
	//  168  378:astore_3        
									break;
								}
							else
	//* 169  379:goto            443
								obj = ((Object) (JsonToken.START_OBJECT));
	//  170  382:getstatic       #198 <Field JsonToken JsonToken.START_OBJECT>
	//  171  385:astore_3        
						} else
	//* 172  386:goto            443
						{
							_matchToken("true", 1);
	//  173  389:aload_0         
	//  174  390:ldc1            #219 <String "true">
	//  175  392:iconst_1        
	//  176  393:invokevirtual   #223 <Method void _matchToken(String, int)>
							obj = ((Object) (JsonToken.VALUE_TRUE));
	//  177  396:getstatic       #226 <Field JsonToken JsonToken.VALUE_TRUE>
	//  178  399:astore_3        
						}
					} else
	//* 179  400:goto            443
					{
						_matchToken("null", 1);
	//  180  403:aload_0         
	//  181  404:ldc1            #228 <String "null">
	//  182  406:iconst_1        
	//  183  407:invokevirtual   #223 <Method void _matchToken(String, int)>
						obj = ((Object) (JsonToken.VALUE_NULL));
	//  184  410:getstatic       #231 <Field JsonToken JsonToken.VALUE_NULL>
	//  185  413:astore_3        
					}
				} else
	//* 186  414:goto            443
				{
					_matchToken("false", 1);
	//  187  417:aload_0         
	//  188  418:ldc1            #233 <String "false">
	//  189  420:iconst_1        
	//  190  421:invokevirtual   #223 <Method void _matchToken(String, int)>
					obj = ((Object) (JsonToken.VALUE_FALSE));
	//  191  424:getstatic       #236 <Field JsonToken JsonToken.VALUE_FALSE>
	//  192  427:astore_3        
				}
			} else
	//* 193  428:goto            443
			{
				obj = ((Object) (JsonToken.START_ARRAY));
	//  194  431:getstatic       #179 <Field JsonToken JsonToken.START_ARRAY>
	//  195  434:astore_3        
			}
		} else
	//* 196  435:goto            443
		{
			obj = ((Object) (_parseNegNumber()));
	//  197  438:aload_0         
	//  198  439:invokevirtual   #239 <Method JsonToken _parseNegNumber()>
	//  199  442:astore_3        
		}
		_nextToken = ((JsonToken) (obj));
	//  200  443:aload_0         
	//  201  444:aload_3         
	//  202  445:putfield        #174 <Field JsonToken _nextToken>
		return _currToken;
	//  203  448:aload_0         
	//  204  449:getfield        #204 <Field JsonToken _currToken>
	//  205  452:areturn         
	}

	protected final String parseEscapedName(int ai[], int i, int j, int k, int l)
		throws IOException
	{
		int ai2[] = _icLatin1;
	//    0    0:getstatic       #37  <Field int[] _icLatin1>
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
							ai1 = _growArrayBy(ai, ai.length);
	//   33   61:aload_1         
	//   34   62:aload_1         
	//   35   63:arraylength     
	//   36   64:invokestatic    #273 <Method int[] _growArrayBy(int[], int)>
	//   37   67:astore          10
							_quadBuffer = ai1;
	//   38   69:aload_0         
	//   39   70:aload           10
	//   40   72:putfield        #45  <Field int[] _quadBuffer>
						}
						ai1[i] = pad(j, l);
	//   41   75:aload           10
	//   42   77:iload_2         
	//   43   78:iload_3         
	//   44   79:iload           5
	//   45   81:invokestatic    #395 <Method int pad(int, int)>
	//   46   84:iastore         
						k = i + 1;
	//   47   85:iload_2         
	//   48   86:iconst_1        
	//   49   87:iadd            
	//   50   88:istore          4
					}
					String s = _symbols.findName(ai1, k);
	//   51   90:aload_0         
	//   52   91:getfield        #51  <Field ByteQuadsCanonicalizer _symbols>
	//   53   94:aload           10
	//   54   96:iload           4
	//   55   98:invokevirtual   #405 <Method String ByteQuadsCanonicalizer.findName(int[], int)>
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
	//   65  118:invokespecial   #399 <Method String addName(int[], int, int)>
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
	//   74  134:ldc2            #567 <String "name">
	//   75  137:invokevirtual   #126 <Method void _throwUnquotedSpace(int, String)>
				else
	//*  76  140:goto            149
					i1 = ((int) (_decodeEscaped()));
	//   77  143:aload_0         
	//   78  144:invokevirtual   #138 <Method char _decodeEscaped()>
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
							ai1 = _growArrayBy(ai, ai.length);
	//  110  201:aload_1         
	//  111  202:aload_1         
	//  112  203:arraylength     
	//  113  204:invokestatic    #273 <Method int[] _growArrayBy(int[], int)>
	//  114  207:astore          10
							_quadBuffer = ai1;
	//  115  209:aload_0         
	//  116  210:aload           10
	//  117  212:putfield        #45  <Field int[] _quadBuffer>
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
								ai = _growArrayBy(ai1, ai1.length);
	//  185  328:aload           10
	//  186  330:aload           10
	//  187  332:arraylength     
	//  188  333:invokestatic    #273 <Method int[] _growArrayBy(int[], int)>
	//  189  336:astore_1        
								_quadBuffer = ai;
	//  190  337:aload_0         
	//  191  338:aload_1         
	//  192  339:putfield        #45  <Field int[] _quadBuffer>
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
					ai = _growArrayBy(ai1, ai1.length);
	//  263  456:aload           10
	//  264  458:aload           10
	//  265  460:arraylength     
	//  266  461:invokestatic    #273 <Method int[] _growArrayBy(int[], int)>
	//  267  464:astore_1        
					_quadBuffer = ai;
	//  268  465:aload_0         
	//  269  466:aload_1         
	//  270  467:putfield        #45  <Field int[] _quadBuffer>
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
			i1 = _inputData.readUnsignedByte();
	//  283  487:aload_0         
	//  284  488:getfield        #53  <Field DataInput _inputData>
	//  285  491:invokeinterface #85  <Method int DataInput.readUnsignedByte()>
	//  286  496:istore          6
		} while(true);
	//  287  498:goto            9
	}

	public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
		throws IOException
	{
		byte abyte0[];
		if(!_tokenIncomplete || _currToken != JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #208 <Field boolean _tokenIncomplete>
	//*   2    4:ifeq            61
	//*   3    7:aload_0         
	//*   4    8:getfield        #204 <Field JsonToken _currToken>
	//*   5   11:getstatic       #211 <Field JsonToken JsonToken.VALUE_STRING>
	//*   6   14:if_acmpeq       20
			break MISSING_BLOCK_LABEL_61;
	//    7   17:goto            61
		abyte0 = _ioContext.allocBase64Buffer();
	//    8   20:aload_0         
	//    9   21:getfield        #660 <Field IOContext _ioContext>
	//   10   24:invokevirtual   #816 <Method byte[] IOContext.allocBase64Buffer()>
	//   11   27:astore          4
		int i = _readBinary(base64variant, outputstream, abyte0);
	//   12   29:aload_0         
	//   13   30:aload_1         
	//   14   31:aload_2         
	//   15   32:aload           4
	//   16   34:invokevirtual   #818 <Method int _readBinary(Base64Variant, OutputStream, byte[])>
	//   17   37:istore_3        
		_ioContext.releaseBase64Buffer(abyte0);
	//   18   38:aload_0         
	//   19   39:getfield        #660 <Field IOContext _ioContext>
	//   20   42:aload           4
	//   21   44:invokevirtual   #822 <Method void IOContext.releaseBase64Buffer(byte[])>
		return i;
	//   22   47:iload_3         
	//   23   48:ireturn         
		base64variant;
	//   24   49:astore_1        
		_ioContext.releaseBase64Buffer(abyte0);
	//   25   50:aload_0         
	//   26   51:getfield        #660 <Field IOContext _ioContext>
	//   27   54:aload           4
	//   28   56:invokevirtual   #822 <Method void IOContext.releaseBase64Buffer(byte[])>
		throw base64variant;
	//   29   59:aload_1         
	//   30   60:athrow          
		base64variant = ((Base64Variant) (getBinaryValue(base64variant)));
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:invokevirtual   #824 <Method byte[] getBinaryValue(Base64Variant)>
	//   34   66:astore_1        
		outputstream.write(((byte []) (base64variant)));
	//   35   67:aload_2         
	//   36   68:aload_1         
	//   37   69:invokevirtual   #826 <Method void OutputStream.write(byte[])>
		return base64variant.length;
	//   38   72:aload_1         
	//   39   73:arraylength     
	//   40   74:ireturn         
	}

	public int releaseBuffered(OutputStream outputstream)
		throws IOException
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setCodec(ObjectCodec objectcodec)
	{
		_objectCodec = objectcodec;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field ObjectCodec _objectCodec>
	//    3    5:return          
	}

	static final byte BYTE_LF = 10;
	protected static final int _icLatin1[] = CharTypes.getInputCodeLatin1();
	private static final int _icUTF8[] = CharTypes.getInputCodeUtf8();
	protected DataInput _inputData;
	protected int _nextByte;
	protected ObjectCodec _objectCodec;
	private int _quad1;
	protected int _quadBuffer[];
	protected final ByteQuadsCanonicalizer _symbols;
	protected boolean _tokenIncomplete;

	static 
	{
	//    0    0:invokestatic    #30  <Method int[] CharTypes.getInputCodeUtf8()>
	//    1    3:putstatic       #32  <Field int[] _icUTF8>
	//    2    6:invokestatic    #35  <Method int[] CharTypes.getInputCodeLatin1()>
	//    3    9:putstatic       #37  <Field int[] _icLatin1>
	//*   4   12:return          
	}
}
