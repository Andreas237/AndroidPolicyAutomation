// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.*;

// Referenced classes of package com.fasterxml.jackson.core.json:
//			JsonReadContext

public class ReaderBasedJsonParser extends ParserBase
{

	public ReaderBasedJsonParser(IOContext iocontext, int i, Reader reader, ObjectCodec objectcodec, CharsToNameCanonicalizer charstonamecanonicalizer)
	{
		super(iocontext, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #39  <Method void ParserBase(IOContext, int)>
		_reader = reader;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #41  <Field Reader _reader>
		_inputBuffer = iocontext.allocTokenBuffer();
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #47  <Method char[] IOContext.allocTokenBuffer()>
	//   10   16:putfield        #49  <Field char[] _inputBuffer>
		_inputPtr = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #52  <Field int _inputPtr>
		_inputEnd = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #55  <Field int _inputEnd>
		_objectCodec = objectcodec;
	//   17   29:aload_0         
	//   18   30:aload           4
	//   19   32:putfield        #57  <Field ObjectCodec _objectCodec>
		_symbols = charstonamecanonicalizer;
	//   20   35:aload_0         
	//   21   36:aload           5
	//   22   38:putfield        #59  <Field CharsToNameCanonicalizer _symbols>
		_hashSeed = charstonamecanonicalizer.hashSeed();
	//   23   41:aload_0         
	//   24   42:aload           5
	//   25   44:invokevirtual   #65  <Method int CharsToNameCanonicalizer.hashSeed()>
	//   26   47:putfield        #67  <Field int _hashSeed>
		_bufferRecyclable = true;
	//   27   50:aload_0         
	//   28   51:iconst_1        
	//   29   52:putfield        #69  <Field boolean _bufferRecyclable>
	//   30   55:return          
	}

	public ReaderBasedJsonParser(IOContext iocontext, int i, Reader reader, ObjectCodec objectcodec, CharsToNameCanonicalizer charstonamecanonicalizer, char ac[], int j, 
			int k, boolean flag)
	{
		super(iocontext, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #39  <Method void ParserBase(IOContext, int)>
		_reader = reader;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #41  <Field Reader _reader>
		_inputBuffer = ac;
	//    7   11:aload_0         
	//    8   12:aload           6
	//    9   14:putfield        #49  <Field char[] _inputBuffer>
		_inputPtr = j;
	//   10   17:aload_0         
	//   11   18:iload           7
	//   12   20:putfield        #52  <Field int _inputPtr>
		_inputEnd = k;
	//   13   23:aload_0         
	//   14   24:iload           8
	//   15   26:putfield        #55  <Field int _inputEnd>
		_objectCodec = objectcodec;
	//   16   29:aload_0         
	//   17   30:aload           4
	//   18   32:putfield        #57  <Field ObjectCodec _objectCodec>
		_symbols = charstonamecanonicalizer;
	//   19   35:aload_0         
	//   20   36:aload           5
	//   21   38:putfield        #59  <Field CharsToNameCanonicalizer _symbols>
		_hashSeed = charstonamecanonicalizer.hashSeed();
	//   22   41:aload_0         
	//   23   42:aload           5
	//   24   44:invokevirtual   #65  <Method int CharsToNameCanonicalizer.hashSeed()>
	//   25   47:putfield        #67  <Field int _hashSeed>
		_bufferRecyclable = flag;
	//   26   50:aload_0         
	//   27   51:iload           9
	//   28   53:putfield        #69  <Field boolean _bufferRecyclable>
	//   29   56:return          
	}

	private String _handleOddName2(int i, int j, int ai[])
		throws IOException
	{
		int i1;
		char ac[];
		_textBuffer.resetWithShared(_inputBuffer, i, _inputPtr - i);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field TextBuffer _textBuffer>
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field char[] _inputBuffer>
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #52  <Field int _inputPtr>
	//    7   13:iload_1         
	//    8   14:isub            
	//    9   15:invokevirtual   #84  <Method void TextBuffer.resetWithShared(char[], int, int)>
		ac = _textBuffer.getCurrentSegment();
	//   10   18:aload_0         
	//   11   19:getfield        #78  <Field TextBuffer _textBuffer>
	//   12   22:invokevirtual   #87  <Method char[] TextBuffer.getCurrentSegment()>
	//   13   25:astore          7
		i = _textBuffer.getCurrentSegmentSize();
	//   14   27:aload_0         
	//   15   28:getfield        #78  <Field TextBuffer _textBuffer>
	//   16   31:invokevirtual   #90  <Method int TextBuffer.getCurrentSegmentSize()>
	//   17   34:istore_1        
		i1 = ai.length;
	//   18   35:aload_3         
	//   19   36:arraylength     
	//   20   37:istore          6
_L5:
		if(_inputPtr < _inputEnd || loadMore()) goto _L2; else goto _L1
	//   21   39:aload_0         
	//   22   40:getfield        #52  <Field int _inputPtr>
	//   23   43:aload_0         
	//   24   44:getfield        #55  <Field int _inputEnd>
	//   25   47:icmplt          101
	//   26   50:aload_0         
	//   27   51:invokevirtual   #94  <Method boolean loadMore()>
	//   28   54:ifne            101
_L1:
		char c;
		_textBuffer.setCurrentLength(i);
	//   29   57:aload_0         
	//   30   58:getfield        #78  <Field TextBuffer _textBuffer>
	//   31   61:iload_1         
	//   32   62:invokevirtual   #98  <Method void TextBuffer.setCurrentLength(int)>
		ai = ((int []) (_textBuffer));
	//   33   65:aload_0         
	//   34   66:getfield        #78  <Field TextBuffer _textBuffer>
	//   35   69:astore_3        
		ac = ((TextBuffer) (ai)).getTextBuffer();
	//   36   70:aload_3         
	//   37   71:invokevirtual   #101 <Method char[] TextBuffer.getTextBuffer()>
	//   38   74:astore          7
		i = ((TextBuffer) (ai)).getTextOffset();
	//   39   76:aload_3         
	//   40   77:invokevirtual   #104 <Method int TextBuffer.getTextOffset()>
	//   41   80:istore_1        
		int k = ((TextBuffer) (ai)).size();
	//   42   81:aload_3         
	//   43   82:invokevirtual   #107 <Method int TextBuffer.size()>
	//   44   85:istore          5
		return _symbols.findSymbol(ac, i, k, j);
	//   45   87:aload_0         
	//   46   88:getfield        #59  <Field CharsToNameCanonicalizer _symbols>
	//   47   91:aload           7
	//   48   93:iload_1         
	//   49   94:iload           5
	//   50   96:iload_2         
	//   51   97:invokevirtual   #111 <Method String CharsToNameCanonicalizer.findSymbol(char[], int, int, int)>
	//   52  100:areturn         
	//*  53  101:aload_0         
	//*  54  102:getfield        #49  <Field char[] _inputBuffer>
	//*  55  105:aload_0         
	//*  56  106:getfield        #52  <Field int _inputPtr>
	//*  57  109:caload          
	//*  58  110:istore          4
_L2:
		int l;
		if((c = _inputBuffer[_inputPtr]) > i1 ? Character.isJavaIdentifierPart(c) : ai[c] == 0) goto _L3; else goto _L1
	//   59  112:iload           4
	//   60  114:iload           6
	//   61  116:icmpgt          177
	//   62  119:aload_3         
	//   63  120:iload           4
	//   64  122:iaload          
	//   65  123:ifne            57
	//   66  126:aload_0         
	//   67  127:aload_0         
	//   68  128:getfield        #52  <Field int _inputPtr>
	//   69  131:iconst_1        
	//   70  132:iadd            
	//   71  133:putfield        #52  <Field int _inputPtr>
	//   72  136:iload_2         
	//   73  137:bipush          33
	//   74  139:imul            
	//   75  140:iload           4
	//   76  142:iadd            
	//   77  143:istore_2        
	//   78  144:iload_1         
	//   79  145:iconst_1        
	//   80  146:iadd            
	//   81  147:istore          5
	//   82  149:aload           7
	//   83  151:iload_1         
	//   84  152:iload           4
	//   85  154:castore         
	//   86  155:iload           5
	//   87  157:aload           7
	//   88  159:arraylength     
	//   89  160:icmplt          188
	//   90  163:aload_0         
	//   91  164:getfield        #78  <Field TextBuffer _textBuffer>
	//   92  167:invokevirtual   #114 <Method char[] TextBuffer.finishCurrentSegment()>
	//   93  170:astore          7
	//   94  172:iconst_0        
	//   95  173:istore_1        
	//   96  174:goto            39
	//   97  177:iload           4
	//   98  179:invokestatic    #120 <Method boolean Character.isJavaIdentifierPart(char)>
	//   99  182:ifne            126
_L3:
		_inputPtr = _inputPtr + 1;
		j = j * 33 + c;
		l = i + 1;
		ac[i] = c;
		if(l >= ac.length)
		{
			ac = _textBuffer.finishCurrentSegment();
			i = 0;
		} else
	//* 100  185:goto            57
		{
			i = l;
	//  101  188:iload           5
	//  102  190:istore_1        
		}
		if(true) goto _L5; else goto _L4
	//  103  191:goto            39
_L4:
	}

	private final void _isNextTokenNameYes(int i)
		throws IOException
	{
		_currToken = JsonToken.FIELD_NAME;
	//    0    0:aload_0         
	//    1    1:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//    2    4:putfield        #131 <Field JsonToken _currToken>
		_updateLocation();
	//    3    7:aload_0         
	//    4    8:invokespecial   #134 <Method void _updateLocation()>
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
			_nextToken = _handleOddValue(i);
	//    7  160:aload_0         
	//    8  161:aload_0         
	//    9  162:iload_1         
	//   10  163:invokevirtual   #138 <Method JsonToken _handleOddValue(int)>
	//   11  166:putfield        #141 <Field JsonToken _nextToken>
			return;
	//   12  169:return          

		case 34: // '"'
			_tokenIncomplete = true;
	//   13  170:aload_0         
	//   14  171:iconst_1        
	//   15  172:putfield        #143 <Field boolean _tokenIncomplete>
			_nextToken = JsonToken.VALUE_STRING;
	//   16  175:aload_0         
	//   17  176:getstatic       #146 <Field JsonToken JsonToken.VALUE_STRING>
	//   18  179:putfield        #141 <Field JsonToken _nextToken>
			return;
	//   19  182:return          

		case 91: // '['
			_nextToken = JsonToken.START_ARRAY;
	//   20  183:aload_0         
	//   21  184:getstatic       #149 <Field JsonToken JsonToken.START_ARRAY>
	//   22  187:putfield        #141 <Field JsonToken _nextToken>
			return;
	//   23  190:return          

		case 123: // '{'
			_nextToken = JsonToken.START_OBJECT;
	//   24  191:aload_0         
	//   25  192:getstatic       #152 <Field JsonToken JsonToken.START_OBJECT>
	//   26  195:putfield        #141 <Field JsonToken _nextToken>
			return;
	//   27  198:return          

		case 116: // 't'
			_matchToken("true", 1);
	//   28  199:aload_0         
	//   29  200:ldc1            #154 <String "true">
	//   30  202:iconst_1        
	//   31  203:invokevirtual   #158 <Method void _matchToken(String, int)>
			_nextToken = JsonToken.VALUE_TRUE;
	//   32  206:aload_0         
	//   33  207:getstatic       #161 <Field JsonToken JsonToken.VALUE_TRUE>
	//   34  210:putfield        #141 <Field JsonToken _nextToken>
			return;
	//   35  213:return          

		case 102: // 'f'
			_matchToken("false", 1);
	//   36  214:aload_0         
	//   37  215:ldc1            #163 <String "false">
	//   38  217:iconst_1        
	//   39  218:invokevirtual   #158 <Method void _matchToken(String, int)>
			_nextToken = JsonToken.VALUE_FALSE;
	//   40  221:aload_0         
	//   41  222:getstatic       #166 <Field JsonToken JsonToken.VALUE_FALSE>
	//   42  225:putfield        #141 <Field JsonToken _nextToken>
			return;
	//   43  228:return          

		case 110: // 'n'
			_matchToken("null", 1);
	//   44  229:aload_0         
	//   45  230:ldc1            #168 <String "null">
	//   46  232:iconst_1        
	//   47  233:invokevirtual   #158 <Method void _matchToken(String, int)>
			_nextToken = JsonToken.VALUE_NULL;
	//   48  236:aload_0         
	//   49  237:getstatic       #171 <Field JsonToken JsonToken.VALUE_NULL>
	//   50  240:putfield        #141 <Field JsonToken _nextToken>
			return;
	//   51  243:return          

		case 45: // '-'
			_nextToken = _parseNegNumber();
	//   52  244:aload_0         
	//   53  245:aload_0         
	//   54  246:invokevirtual   #175 <Method JsonToken _parseNegNumber()>
	//   55  249:putfield        #141 <Field JsonToken _nextToken>
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
	//   60  256:invokevirtual   #178 <Method JsonToken _parsePosNumber(int)>
	//   61  259:putfield        #141 <Field JsonToken _nextToken>
			return;
	//   62  262:return          
		}
	}

	private final void _matchFalse()
		throws IOException
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int _inputPtr>
	//    2    4:istore_1        
		if(i + 4 < _inputEnd)
	//*   3    5:iload_1         
	//*   4    6:iconst_4        
	//*   5    7:iadd            
	//*   6    8:aload_0         
	//*   7    9:getfield        #55  <Field int _inputEnd>
	//*   8   12:icmpge          96
		{
			char ac[] = _inputBuffer;
	//    9   15:aload_0         
	//   10   16:getfield        #49  <Field char[] _inputBuffer>
	//   11   19:astore_3        
			if(ac[i] == 'a')
	//*  12   20:aload_3         
	//*  13   21:iload_1         
	//*  14   22:caload          
	//*  15   23:bipush          97
	//*  16   25:icmpne          96
			{
				i++;
	//   17   28:iload_1         
	//   18   29:iconst_1        
	//   19   30:iadd            
	//   20   31:istore_1        
				if(ac[i] == 'l')
	//*  21   32:aload_3         
	//*  22   33:iload_1         
	//*  23   34:caload          
	//*  24   35:bipush          108
	//*  25   37:icmpne          96
				{
					i++;
	//   26   40:iload_1         
	//   27   41:iconst_1        
	//   28   42:iadd            
	//   29   43:istore_1        
					if(ac[i] == 's')
	//*  30   44:aload_3         
	//*  31   45:iload_1         
	//*  32   46:caload          
	//*  33   47:bipush          115
	//*  34   49:icmpne          96
					{
						i++;
	//   35   52:iload_1         
	//   36   53:iconst_1        
	//   37   54:iadd            
	//   38   55:istore_1        
						if(ac[i] == 'e')
	//*  39   56:aload_3         
	//*  40   57:iload_1         
	//*  41   58:caload          
	//*  42   59:bipush          101
	//*  43   61:icmpne          96
						{
							i++;
	//   44   64:iload_1         
	//   45   65:iconst_1        
	//   46   66:iadd            
	//   47   67:istore_1        
							char c = ac[i];
	//   48   68:aload_3         
	//   49   69:iload_1         
	//   50   70:caload          
	//   51   71:istore_2        
							if(c < '0' || c == ']' || c == '}')
	//*  52   72:iload_2         
	//*  53   73:bipush          48
	//*  54   75:icmplt          90
	//*  55   78:iload_2         
	//*  56   79:bipush          93
	//*  57   81:icmpeq          90
	//*  58   84:iload_2         
	//*  59   85:bipush          125
	//*  60   87:icmpne          96
							{
								_inputPtr = i;
	//   61   90:aload_0         
	//   62   91:iload_1         
	//   63   92:putfield        #52  <Field int _inputPtr>
								return;
	//   64   95:return          
							}
						}
					}
				}
			}
		}
		_matchToken("false", 1);
	//   65   96:aload_0         
	//   66   97:ldc1            #163 <String "false">
	//   67   99:iconst_1        
	//   68  100:invokevirtual   #158 <Method void _matchToken(String, int)>
	//   69  103:return          
	}

	private final void _matchNull()
		throws IOException
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int _inputPtr>
	//    2    4:istore_1        
		if(i + 3 < _inputEnd)
	//*   3    5:iload_1         
	//*   4    6:iconst_3        
	//*   5    7:iadd            
	//*   6    8:aload_0         
	//*   7    9:getfield        #55  <Field int _inputEnd>
	//*   8   12:icmpge          84
		{
			char ac[] = _inputBuffer;
	//    9   15:aload_0         
	//   10   16:getfield        #49  <Field char[] _inputBuffer>
	//   11   19:astore_3        
			if(ac[i] == 'u')
	//*  12   20:aload_3         
	//*  13   21:iload_1         
	//*  14   22:caload          
	//*  15   23:bipush          117
	//*  16   25:icmpne          84
			{
				i++;
	//   17   28:iload_1         
	//   18   29:iconst_1        
	//   19   30:iadd            
	//   20   31:istore_1        
				if(ac[i] == 'l')
	//*  21   32:aload_3         
	//*  22   33:iload_1         
	//*  23   34:caload          
	//*  24   35:bipush          108
	//*  25   37:icmpne          84
				{
					i++;
	//   26   40:iload_1         
	//   27   41:iconst_1        
	//   28   42:iadd            
	//   29   43:istore_1        
					if(ac[i] == 'l')
	//*  30   44:aload_3         
	//*  31   45:iload_1         
	//*  32   46:caload          
	//*  33   47:bipush          108
	//*  34   49:icmpne          84
					{
						i++;
	//   35   52:iload_1         
	//   36   53:iconst_1        
	//   37   54:iadd            
	//   38   55:istore_1        
						char c = ac[i];
	//   39   56:aload_3         
	//   40   57:iload_1         
	//   41   58:caload          
	//   42   59:istore_2        
						if(c < '0' || c == ']' || c == '}')
	//*  43   60:iload_2         
	//*  44   61:bipush          48
	//*  45   63:icmplt          78
	//*  46   66:iload_2         
	//*  47   67:bipush          93
	//*  48   69:icmpeq          78
	//*  49   72:iload_2         
	//*  50   73:bipush          125
	//*  51   75:icmpne          84
						{
							_inputPtr = i;
	//   52   78:aload_0         
	//   53   79:iload_1         
	//   54   80:putfield        #52  <Field int _inputPtr>
							return;
	//   55   83:return          
						}
					}
				}
			}
		}
		_matchToken("null", 1);
	//   56   84:aload_0         
	//   57   85:ldc1            #168 <String "null">
	//   58   87:iconst_1        
	//   59   88:invokevirtual   #158 <Method void _matchToken(String, int)>
	//   60   91:return          
	}

	private final void _matchTrue()
		throws IOException
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int _inputPtr>
	//    2    4:istore_1        
		if(i + 3 < _inputEnd)
	//*   3    5:iload_1         
	//*   4    6:iconst_3        
	//*   5    7:iadd            
	//*   6    8:aload_0         
	//*   7    9:getfield        #55  <Field int _inputEnd>
	//*   8   12:icmpge          84
		{
			char ac[] = _inputBuffer;
	//    9   15:aload_0         
	//   10   16:getfield        #49  <Field char[] _inputBuffer>
	//   11   19:astore_3        
			if(ac[i] == 'r')
	//*  12   20:aload_3         
	//*  13   21:iload_1         
	//*  14   22:caload          
	//*  15   23:bipush          114
	//*  16   25:icmpne          84
			{
				i++;
	//   17   28:iload_1         
	//   18   29:iconst_1        
	//   19   30:iadd            
	//   20   31:istore_1        
				if(ac[i] == 'u')
	//*  21   32:aload_3         
	//*  22   33:iload_1         
	//*  23   34:caload          
	//*  24   35:bipush          117
	//*  25   37:icmpne          84
				{
					i++;
	//   26   40:iload_1         
	//   27   41:iconst_1        
	//   28   42:iadd            
	//   29   43:istore_1        
					if(ac[i] == 'e')
	//*  30   44:aload_3         
	//*  31   45:iload_1         
	//*  32   46:caload          
	//*  33   47:bipush          101
	//*  34   49:icmpne          84
					{
						i++;
	//   35   52:iload_1         
	//   36   53:iconst_1        
	//   37   54:iadd            
	//   38   55:istore_1        
						char c = ac[i];
	//   39   56:aload_3         
	//   40   57:iload_1         
	//   41   58:caload          
	//   42   59:istore_2        
						if(c < '0' || c == ']' || c == '}')
	//*  43   60:iload_2         
	//*  44   61:bipush          48
	//*  45   63:icmplt          78
	//*  46   66:iload_2         
	//*  47   67:bipush          93
	//*  48   69:icmpeq          78
	//*  49   72:iload_2         
	//*  50   73:bipush          125
	//*  51   75:icmpne          84
						{
							_inputPtr = i;
	//   52   78:aload_0         
	//   53   79:iload_1         
	//   54   80:putfield        #52  <Field int _inputPtr>
							return;
	//   55   83:return          
						}
					}
				}
			}
		}
		_matchToken("true", 1);
	//   56   84:aload_0         
	//   57   85:ldc1            #154 <String "true">
	//   58   87:iconst_1        
	//   59   88:invokevirtual   #158 <Method void _matchToken(String, int)>
	//   60   91:return          
	}

	private final JsonToken _nextAfterName()
	{
		JsonToken jsontoken;
		_nameCopied = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #185 <Field boolean _nameCopied>
		jsontoken = _nextToken;
	//    3    5:aload_0         
	//    4    6:getfield        #141 <Field JsonToken _nextToken>
	//    5    9:astore_1        
		_nextToken = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #141 <Field JsonToken _nextToken>
		if(jsontoken != JsonToken.START_ARRAY) goto _L2; else goto _L1
	//    9   15:aload_1         
	//   10   16:getstatic       #149 <Field JsonToken JsonToken.START_ARRAY>
	//   11   19:if_acmpne       48
_L1:
		_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #189 <Field JsonReadContext _parsingContext>
	//   15   27:aload_0         
	//   16   28:getfield        #192 <Field int _tokenInputRow>
	//   17   31:aload_0         
	//   18   32:getfield        #195 <Field int _tokenInputCol>
	//   19   35:invokevirtual   #201 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   20   38:putfield        #189 <Field JsonReadContext _parsingContext>
_L4:
		_currToken = jsontoken;
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:putfield        #131 <Field JsonToken _currToken>
		return jsontoken;
	//   24   46:aload_1         
	//   25   47:areturn         
_L2:
		if(jsontoken == JsonToken.START_OBJECT)
	//*  26   48:aload_1         
	//*  27   49:getstatic       #152 <Field JsonToken JsonToken.START_OBJECT>
	//*  28   52:if_acmpne       41
			_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   29   55:aload_0         
	//   30   56:aload_0         
	//   31   57:getfield        #189 <Field JsonReadContext _parsingContext>
	//   32   60:aload_0         
	//   33   61:getfield        #192 <Field int _tokenInputRow>
	//   34   64:aload_0         
	//   35   65:getfield        #195 <Field int _tokenInputCol>
	//   36   68:invokevirtual   #204 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   37   71:putfield        #189 <Field JsonReadContext _parsingContext>
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
	//    5    8:putfield        #143 <Field boolean _tokenIncomplete>
			JsonToken jsontoken = JsonToken.VALUE_STRING;
	//    6   11:getstatic       #146 <Field JsonToken JsonToken.VALUE_STRING>
	//    7   14:astore_2        
			_currToken = jsontoken;
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:putfield        #131 <Field JsonToken _currToken>
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
			JsonToken jsontoken1 = _handleOddValue(i);
	//   15  160:aload_0         
	//   16  161:iload_1         
	//   17  162:invokevirtual   #138 <Method JsonToken _handleOddValue(int)>
	//   18  165:astore_2        
			_currToken = jsontoken1;
	//   19  166:aload_0         
	//   20  167:aload_2         
	//   21  168:putfield        #131 <Field JsonToken _currToken>
			return jsontoken1;
	//   22  171:aload_2         
	//   23  172:areturn         

		case 91: // '['
			_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   24  173:aload_0         
	//   25  174:aload_0         
	//   26  175:getfield        #189 <Field JsonReadContext _parsingContext>
	//   27  178:aload_0         
	//   28  179:getfield        #192 <Field int _tokenInputRow>
	//   29  182:aload_0         
	//   30  183:getfield        #195 <Field int _tokenInputCol>
	//   31  186:invokevirtual   #201 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   32  189:putfield        #189 <Field JsonReadContext _parsingContext>
			JsonToken jsontoken2 = JsonToken.START_ARRAY;
	//   33  192:getstatic       #149 <Field JsonToken JsonToken.START_ARRAY>
	//   34  195:astore_2        
			_currToken = jsontoken2;
	//   35  196:aload_0         
	//   36  197:aload_2         
	//   37  198:putfield        #131 <Field JsonToken _currToken>
			return jsontoken2;
	//   38  201:aload_2         
	//   39  202:areturn         

		case 123: // '{'
			_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   40  203:aload_0         
	//   41  204:aload_0         
	//   42  205:getfield        #189 <Field JsonReadContext _parsingContext>
	//   43  208:aload_0         
	//   44  209:getfield        #192 <Field int _tokenInputRow>
	//   45  212:aload_0         
	//   46  213:getfield        #195 <Field int _tokenInputCol>
	//   47  216:invokevirtual   #204 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   48  219:putfield        #189 <Field JsonReadContext _parsingContext>
			JsonToken jsontoken3 = JsonToken.START_OBJECT;
	//   49  222:getstatic       #152 <Field JsonToken JsonToken.START_OBJECT>
	//   50  225:astore_2        
			_currToken = jsontoken3;
	//   51  226:aload_0         
	//   52  227:aload_2         
	//   53  228:putfield        #131 <Field JsonToken _currToken>
			return jsontoken3;
	//   54  231:aload_2         
	//   55  232:areturn         

		case 116: // 't'
			_matchToken("true", 1);
	//   56  233:aload_0         
	//   57  234:ldc1            #154 <String "true">
	//   58  236:iconst_1        
	//   59  237:invokevirtual   #158 <Method void _matchToken(String, int)>
			JsonToken jsontoken4 = JsonToken.VALUE_TRUE;
	//   60  240:getstatic       #161 <Field JsonToken JsonToken.VALUE_TRUE>
	//   61  243:astore_2        
			_currToken = jsontoken4;
	//   62  244:aload_0         
	//   63  245:aload_2         
	//   64  246:putfield        #131 <Field JsonToken _currToken>
			return jsontoken4;
	//   65  249:aload_2         
	//   66  250:areturn         

		case 102: // 'f'
			_matchToken("false", 1);
	//   67  251:aload_0         
	//   68  252:ldc1            #163 <String "false">
	//   69  254:iconst_1        
	//   70  255:invokevirtual   #158 <Method void _matchToken(String, int)>
			JsonToken jsontoken5 = JsonToken.VALUE_FALSE;
	//   71  258:getstatic       #166 <Field JsonToken JsonToken.VALUE_FALSE>
	//   72  261:astore_2        
			_currToken = jsontoken5;
	//   73  262:aload_0         
	//   74  263:aload_2         
	//   75  264:putfield        #131 <Field JsonToken _currToken>
			return jsontoken5;
	//   76  267:aload_2         
	//   77  268:areturn         

		case 110: // 'n'
			_matchToken("null", 1);
	//   78  269:aload_0         
	//   79  270:ldc1            #168 <String "null">
	//   80  272:iconst_1        
	//   81  273:invokevirtual   #158 <Method void _matchToken(String, int)>
			JsonToken jsontoken6 = JsonToken.VALUE_NULL;
	//   82  276:getstatic       #171 <Field JsonToken JsonToken.VALUE_NULL>
	//   83  279:astore_2        
			_currToken = jsontoken6;
	//   84  280:aload_0         
	//   85  281:aload_2         
	//   86  282:putfield        #131 <Field JsonToken _currToken>
			return jsontoken6;
	//   87  285:aload_2         
	//   88  286:areturn         

		case 45: // '-'
			JsonToken jsontoken7 = _parseNegNumber();
	//   89  287:aload_0         
	//   90  288:invokevirtual   #175 <Method JsonToken _parseNegNumber()>
	//   91  291:astore_2        
			_currToken = jsontoken7;
	//   92  292:aload_0         
	//   93  293:aload_2         
	//   94  294:putfield        #131 <Field JsonToken _currToken>
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
	//   99  301:invokevirtual   #178 <Method JsonToken _parsePosNumber(int)>
	//  100  304:astore_2        
			_currToken = jsontoken8;
	//  101  305:aload_0         
	//  102  306:aload_2         
	//  103  307:putfield        #131 <Field JsonToken _currToken>
			return jsontoken8;
	//  104  310:aload_2         
	//  105  311:areturn         
		}
	}

	private final JsonToken _parseFloat(int i, int j, int k, boolean flag, int l)
		throws IOException
	{
		int i1;
		int k1;
		int l1;
		int i2;
		int k2;
		k2 = _inputEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int _inputEnd>
	//    2    4:istore          12
		l1 = 0;
	//    3    6:iconst_0        
	//    4    7:istore          8
		i2 = 0;
	//    5    9:iconst_0        
	//    6   10:istore          9
		i1 = i;
	//    7   12:iload_1         
	//    8   13:istore          6
		k1 = k;
	//    9   15:iload_3         
	//   10   16:istore          7
		if(i != 46) goto _L2; else goto _L1
	//   11   18:iload_1         
	//   12   19:bipush          46
	//   13   21:icmpne          109
_L1:
		i1 = k;
	//   14   24:iload_3         
	//   15   25:istore          6
		i = i2;
	//   16   27:iload           9
	//   17   29:istore_1        
_L6:
		if(i1 >= k2)
	//*  18   30:iload           6
	//*  19   32:iload           12
	//*  20   34:icmplt          45
			return _parseNumber2(flag, j);
	//   21   37:aload_0         
	//   22   38:iload           4
	//   23   40:iload_2         
	//   24   41:invokespecial   #211 <Method JsonToken _parseNumber2(boolean, int)>
	//   25   44:areturn         
		char ac[] = _inputBuffer;
	//   26   45:aload_0         
	//   27   46:getfield        #49  <Field char[] _inputBuffer>
	//   28   49:astore          13
		k = i1 + 1;
	//   29   51:iload           6
	//   30   53:iconst_1        
	//   31   54:iadd            
	//   32   55:istore_3        
		i2 = ((int) (ac[i1]));
	//   33   56:aload           13
	//   34   58:iload           6
	//   35   60:caload          
	//   36   61:istore          9
		if(i2 >= '0' && i2 <= '9') goto _L4; else goto _L3
	//   37   63:iload           9
	//   38   65:bipush          48
	//   39   67:icmplt          77
	//   40   70:iload           9
	//   41   72:bipush          57
	//   42   74:icmple          158
_L3:
		l1 = i;
	//   43   77:iload_1         
	//   44   78:istore          8
		i1 = i2;
	//   45   80:iload           9
	//   46   82:istore          6
		k1 = k;
	//   47   84:iload_3         
	//   48   85:istore          7
		if(i == 0)
	//*  49   87:iload_1         
	//*  50   88:ifne            109
		{
			reportUnexpectedNumberChar(i2, "Decimal point not followed by a digit");
	//   51   91:aload_0         
	//   52   92:iload           9
	//   53   94:ldc1            #213 <String "Decimal point not followed by a digit">
	//   54   96:invokevirtual   #217 <Method void reportUnexpectedNumberChar(int, String)>
			k1 = k;
	//   55   99:iload_3         
	//   56  100:istore          7
			i1 = i2;
	//   57  102:iload           9
	//   58  104:istore          6
			l1 = i;
	//   59  106:iload_1         
	//   60  107:istore          8
		}
_L2:
		int j2;
		boolean flag1;
		i = k1;
	//   61  109:iload           7
	//   62  111:istore_1        
		k1 = 0;
	//   63  112:iconst_0        
	//   64  113:istore          7
		flag1 = false;
	//   65  115:iconst_0        
	//   66  116:istore          11
		if(i1 != 101)
	//*  67  118:iload           6
	//*  68  120:bipush          101
	//*  69  122:icmpeq          139
		{
			j2 = i;
	//   70  125:iload_1         
	//   71  126:istore          10
			i2 = i1;
	//   72  128:iload           6
	//   73  130:istore          9
			if(i1 != 69)
				break MISSING_BLOCK_LABEL_320;
	//   74  132:iload           6
	//   75  134:bipush          69
	//   76  136:icmpne          320
		}
		if(i >= k2)
	//*  77  139:iload_1         
	//*  78  140:iload           12
	//*  79  142:icmplt          168
		{
			_inputPtr = j;
	//   80  145:aload_0         
	//   81  146:iload_2         
	//   82  147:putfield        #52  <Field int _inputPtr>
			return _parseNumber2(flag, j);
	//   83  150:aload_0         
	//   84  151:iload           4
	//   85  153:iload_2         
	//   86  154:invokespecial   #211 <Method JsonToken _parseNumber2(boolean, int)>
	//   87  157:areturn         
		}
		break; /* Loop/switch isn't completed */
_L4:
		i++;
	//   88  158:iload_1         
	//   89  159:iconst_1        
	//   90  160:iadd            
	//   91  161:istore_1        
		i1 = k;
	//   92  162:iload_3         
	//   93  163:istore          6
		if(true) goto _L6; else goto _L5
	//   94  165:goto            30
_L5:
		char ac1[] = _inputBuffer;
	//   95  168:aload_0         
	//   96  169:getfield        #49  <Field char[] _inputBuffer>
	//   97  172:astore          13
		int j1 = i + 1;
	//   98  174:iload_1         
	//   99  175:iconst_1        
	//  100  176:iadd            
	//  101  177:istore          6
		k = ((int) (ac1[i]));
	//  102  179:aload           13
	//  103  181:iload_1         
	//  104  182:caload          
	//  105  183:istore_3        
		if(k == 45 || k == 43)
	//* 106  184:iload_3         
	//* 107  185:bipush          45
	//* 108  187:icmpeq          196
	//* 109  190:iload_3         
	//* 110  191:bipush          43
	//* 111  193:icmpne          374
		{
			if(j1 >= k2)
	//* 112  196:iload           6
	//* 113  198:iload           12
	//* 114  200:icmplt          216
			{
				_inputPtr = j;
	//  115  203:aload_0         
	//  116  204:iload_2         
	//  117  205:putfield        #52  <Field int _inputPtr>
				return _parseNumber2(flag, j);
	//  118  208:aload_0         
	//  119  209:iload           4
	//  120  211:iload_2         
	//  121  212:invokespecial   #211 <Method JsonToken _parseNumber2(boolean, int)>
	//  122  215:areturn         
			}
			char ac2[] = _inputBuffer;
	//  123  216:aload_0         
	//  124  217:getfield        #49  <Field char[] _inputBuffer>
	//  125  220:astore          13
			i = j1 + 1;
	//  126  222:iload           6
	//  127  224:iconst_1        
	//  128  225:iadd            
	//  129  226:istore_1        
			k = ((int) (ac2[j1]));
	//  130  227:aload           13
	//  131  229:iload           6
	//  132  231:caload          
	//  133  232:istore_3        
			j1 = ((int) (flag1));
	//  134  233:iload           11
	//  135  235:istore          6
		} else
	//* 136  237:iload_3         
	//* 137  238:bipush          57
	//* 138  240:icmpgt          288
	//* 139  243:iload_3         
	//* 140  244:bipush          48
	//* 141  246:icmplt          288
	//* 142  249:iload           6
	//* 143  251:iconst_1        
	//* 144  252:iadd            
	//* 145  253:istore          6
	//* 146  255:iload_1         
	//* 147  256:iload           12
	//* 148  258:icmplt          274
	//* 149  261:aload_0         
	//* 150  262:iload_2         
	//* 151  263:putfield        #52  <Field int _inputPtr>
	//* 152  266:aload_0         
	//* 153  267:iload           4
	//* 154  269:iload_2         
	//* 155  270:invokespecial   #211 <Method JsonToken _parseNumber2(boolean, int)>
	//* 156  273:areturn         
	//* 157  274:aload_0         
	//* 158  275:getfield        #49  <Field char[] _inputBuffer>
	//* 159  278:iload_1         
	//* 160  279:caload          
	//* 161  280:istore_3        
	//* 162  281:iload_1         
	//* 163  282:iconst_1        
	//* 164  283:iadd            
	//* 165  284:istore_1        
	//* 166  285:goto            237
	//* 167  288:iload           6
	//* 168  290:istore          7
	//* 169  292:iload_1         
	//* 170  293:istore          10
	//* 171  295:iload_3         
	//* 172  296:istore          9
	//* 173  298:iload           6
	//* 174  300:ifne            320
	//* 175  303:aload_0         
	//* 176  304:iload_3         
	//* 177  305:ldc1            #219 <String "Exponent indicator not followed by a digit">
	//* 178  307:invokevirtual   #217 <Method void reportUnexpectedNumberChar(int, String)>
	//* 179  310:iload_3         
	//* 180  311:istore          9
	//* 181  313:iload_1         
	//* 182  314:istore          10
	//* 183  316:iload           6
	//* 184  318:istore          7
	//* 185  320:iload           10
	//* 186  322:iconst_1        
	//* 187  323:isub            
	//* 188  324:istore_1        
	//* 189  325:aload_0         
	//* 190  326:iload_1         
	//* 191  327:putfield        #52  <Field int _inputPtr>
	//* 192  330:aload_0         
	//* 193  331:getfield        #189 <Field JsonReadContext _parsingContext>
	//* 194  334:invokevirtual   #222 <Method boolean JsonReadContext.inRoot()>
	//* 195  337:ifeq            346
	//* 196  340:aload_0         
	//* 197  341:iload           9
	//* 198  343:invokespecial   #225 <Method void _verifyRootSpace(int)>
	//* 199  346:aload_0         
	//* 200  347:getfield        #78  <Field TextBuffer _textBuffer>
	//* 201  350:aload_0         
	//* 202  351:getfield        #49  <Field char[] _inputBuffer>
	//* 203  354:iload_2         
	//* 204  355:iload_1         
	//* 205  356:iload_2         
	//* 206  357:isub            
	//* 207  358:invokevirtual   #84  <Method void TextBuffer.resetWithShared(char[], int, int)>
	//* 208  361:aload_0         
	//* 209  362:iload           4
	//* 210  364:iload           5
	//* 211  366:iload           8
	//* 212  368:iload           7
	//* 213  370:invokevirtual   #229 <Method JsonToken resetFloat(boolean, int, int, int)>
	//* 214  373:areturn         
		{
			i = j1;
	//  215  374:iload           6
	//  216  376:istore_1        
			j1 = ((int) (flag1));
	//  217  377:iload           11
	//  218  379:istore          6
		}
		while(k <= 57 && k >= 48) 
		{
			j1++;
			if(i >= k2)
			{
				_inputPtr = j;
				return _parseNumber2(flag, j);
			}
			k = ((int) (_inputBuffer[i]));
			i++;
		}
		k1 = j1;
		j2 = i;
		i2 = k;
		if(j1 == 0)
		{
			reportUnexpectedNumberChar(k, "Exponent indicator not followed by a digit");
			i2 = k;
			j2 = i;
			k1 = j1;
		}
		i = j2 - 1;
		_inputPtr = i;
		if(_parsingContext.inRoot())
			_verifyRootSpace(i2);
		_textBuffer.resetWithShared(_inputBuffer, j, i - j);
		return resetFloat(flag, l, l1, k1);
	//* 219  381:goto            237
	}

	private String _parseName2(int i, int j, int k)
		throws IOException
	{
		char ac[];
		_textBuffer.resetWithShared(_inputBuffer, i, _inputPtr - i);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field TextBuffer _textBuffer>
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field char[] _inputBuffer>
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #52  <Field int _inputPtr>
	//    7   13:iload_1         
	//    8   14:isub            
	//    9   15:invokevirtual   #84  <Method void TextBuffer.resetWithShared(char[], int, int)>
		ac = _textBuffer.getCurrentSegment();
	//   10   18:aload_0         
	//   11   19:getfield        #78  <Field TextBuffer _textBuffer>
	//   12   22:invokevirtual   #87  <Method char[] TextBuffer.getCurrentSegment()>
	//   13   25:astore          7
		i = _textBuffer.getCurrentSegmentSize();
	//   14   27:aload_0         
	//   15   28:getfield        #78  <Field TextBuffer _textBuffer>
	//   16   31:invokevirtual   #90  <Method int TextBuffer.getCurrentSegmentSize()>
	//   17   34:istore_1        
_L5:
		char c;
		char c1;
		if(_inputPtr >= _inputEnd && !loadMore())
	//*  18   35:aload_0         
	//*  19   36:getfield        #52  <Field int _inputPtr>
	//*  20   39:aload_0         
	//*  21   40:getfield        #55  <Field int _inputEnd>
	//*  22   43:icmplt          82
	//*  23   46:aload_0         
	//*  24   47:invokevirtual   #94  <Method boolean loadMore()>
	//*  25   50:ifne            82
			_reportInvalidEOF((new StringBuilder()).append(": was expecting closing '").append((char)k).append("' for name").toString());
	//   26   53:aload_0         
	//   27   54:new             #233 <Class StringBuilder>
	//   28   57:dup             
	//   29   58:invokespecial   #235 <Method void StringBuilder()>
	//   30   61:ldc1            #237 <String ": was expecting closing '">
	//   31   63:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   32   66:iload_3         
	//   33   67:int2char        
	//   34   68:invokevirtual   #244 <Method StringBuilder StringBuilder.append(char)>
	//   35   71:ldc1            #246 <String "' for name">
	//   36   73:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   37   76:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   38   79:invokevirtual   #254 <Method void _reportInvalidEOF(String)>
		char ac1[] = _inputBuffer;
	//   39   82:aload_0         
	//   40   83:getfield        #49  <Field char[] _inputBuffer>
	//   41   86:astore          8
		int l = _inputPtr;
	//   42   88:aload_0         
	//   43   89:getfield        #52  <Field int _inputPtr>
	//   44   92:istore          6
		_inputPtr = l + 1;
	//   45   94:aload_0         
	//   46   95:iload           6
	//   47   97:iconst_1        
	//   48   98:iadd            
	//   49   99:putfield        #52  <Field int _inputPtr>
		c1 = ac1[l];
	//   50  102:aload           8
	//   51  104:iload           6
	//   52  106:caload          
	//   53  107:istore          5
		c = c1;
	//   54  109:iload           5
	//   55  111:istore          4
		if(c1 > '\\') goto _L2; else goto _L1
	//   56  113:iload           5
	//   57  115:bipush          92
	//   58  117:icmpgt          133
_L1:
		if(c1 != '\\') goto _L4; else goto _L3
	//   59  120:iload           5
	//   60  122:bipush          92
	//   61  124:icmpne          174
_L3:
		c = _decodeEscaped();
	//   62  127:aload_0         
	//   63  128:invokevirtual   #258 <Method char _decodeEscaped()>
	//   64  131:istore          4
_L2:
		j = j * 33 + c;
	//   65  133:iload_2         
	//   66  134:bipush          33
	//   67  136:imul            
	//   68  137:iload           4
	//   69  139:iadd            
	//   70  140:istore_2        
		int i1 = i + 1;
	//   71  141:iload_1         
	//   72  142:iconst_1        
	//   73  143:iadd            
	//   74  144:istore          6
		ac[i] = c;
	//   75  146:aload           7
	//   76  148:iload_1         
	//   77  149:iload           4
	//   78  151:castore         
		TextBuffer textbuffer;
		char ac2[];
		if(i1 >= ac.length)
	//*  79  152:iload           6
	//*  80  154:aload           7
	//*  81  156:arraylength     
	//*  82  157:icmplt          263
		{
			ac = _textBuffer.finishCurrentSegment();
	//   83  160:aload_0         
	//   84  161:getfield        #78  <Field TextBuffer _textBuffer>
	//   85  164:invokevirtual   #114 <Method char[] TextBuffer.finishCurrentSegment()>
	//   86  167:astore          7
			i = 0;
	//   87  169:iconst_0        
	//   88  170:istore_1        
		} else
	//*  89  171:goto            35
	//*  90  174:iload           5
	//*  91  176:istore          4
	//*  92  178:iload           5
	//*  93  180:iload_3         
	//*  94  181:icmpgt          133
	//*  95  184:iload           5
	//*  96  186:iload_3         
	//*  97  187:icmpne          236
	//*  98  190:aload_0         
	//*  99  191:getfield        #78  <Field TextBuffer _textBuffer>
	//* 100  194:iload_1         
	//* 101  195:invokevirtual   #98  <Method void TextBuffer.setCurrentLength(int)>
	//* 102  198:aload_0         
	//* 103  199:getfield        #78  <Field TextBuffer _textBuffer>
	//* 104  202:astore          7
	//* 105  204:aload           7
	//* 106  206:invokevirtual   #101 <Method char[] TextBuffer.getTextBuffer()>
	//* 107  209:astore          8
	//* 108  211:aload           7
	//* 109  213:invokevirtual   #104 <Method int TextBuffer.getTextOffset()>
	//* 110  216:istore_1        
	//* 111  217:aload           7
	//* 112  219:invokevirtual   #107 <Method int TextBuffer.size()>
	//* 113  222:istore_3        
	//* 114  223:aload_0         
	//* 115  224:getfield        #59  <Field CharsToNameCanonicalizer _symbols>
	//* 116  227:aload           8
	//* 117  229:iload_1         
	//* 118  230:iload_3         
	//* 119  231:iload_2         
	//* 120  232:invokevirtual   #111 <Method String CharsToNameCanonicalizer.findSymbol(char[], int, int, int)>
	//* 121  235:areturn         
	//* 122  236:iload           5
	//* 123  238:istore          4
	//* 124  240:iload           5
	//* 125  242:bipush          32
	//* 126  244:icmpge          133
	//* 127  247:aload_0         
	//* 128  248:iload           5
	//* 129  250:ldc2            #260 <String "name">
	//* 130  253:invokevirtual   #263 <Method void _throwUnquotedSpace(int, String)>
	//* 131  256:iload           5
	//* 132  258:istore          4
	//* 133  260:goto            133
		{
			i = i1;
	//  134  263:iload           6
	//  135  265:istore_1        
		}
		if(true) goto _L5; else goto _L4
	//  136  266:goto            35
_L4:
		c = c1;
		if(c1 <= k)
		{
			if(c1 == k)
			{
				_textBuffer.setCurrentLength(i);
				textbuffer = _textBuffer;
				ac2 = textbuffer.getTextBuffer();
				i = textbuffer.getTextOffset();
				k = textbuffer.size();
				return _symbols.findSymbol(ac2, i, k, j);
			}
			c = c1;
			if(c1 < ' ')
			{
				_throwUnquotedSpace(((int) (c1)), "name");
				c = c1;
			}
		}
		  goto _L2
	}

	private final JsonToken _parseNumber2(boolean flag, int i)
		throws IOException
	{
		char c;
		int j;
		int k;
		int l;
		int k1;
		char ac1[];
		char ac2[];
		j = i;
	//    0    0:iload_2         
	//    1    1:istore          5
		if(flag)
	//*   2    3:iload_1         
	//*   3    4:ifeq            12
			j = i + 1;
	//    4    7:iload_2         
	//    5    8:iconst_1        
	//    6    9:iadd            
	//    7   10:istore          5
		_inputPtr = j;
	//    8   12:aload_0         
	//    9   13:iload           5
	//   10   15:putfield        #52  <Field int _inputPtr>
		ac2 = _textBuffer.emptyAndGetCurrentSegment();
	//   11   18:aload_0         
	//   12   19:getfield        #78  <Field TextBuffer _textBuffer>
	//   13   22:invokevirtual   #266 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//   14   25:astore          16
		i = 0;
	//   15   27:iconst_0        
	//   16   28:istore_2        
		if(flag)
	//*  17   29:iload_1         
	//*  18   30:ifeq            43
		{
			ac2[0] = '-';
	//   19   33:aload           16
	//   20   35:iconst_0        
	//   21   36:bipush          45
	//   22   38:castore         
			i = 0 + 1;
	//   23   39:iconst_0        
	//   24   40:iconst_1        
	//   25   41:iadd            
	//   26   42:istore_2        
		}
		k = 0;
	//   27   43:iconst_0        
	//   28   44:istore          6
		char c1;
		if(_inputPtr < _inputEnd)
	//*  29   46:aload_0         
	//*  30   47:getfield        #52  <Field int _inputPtr>
	//*  31   50:aload_0         
	//*  32   51:getfield        #55  <Field int _inputEnd>
	//*  33   54:icmpge          198
		{
			char ac[] = _inputBuffer;
	//   34   57:aload_0         
	//   35   58:getfield        #49  <Field char[] _inputBuffer>
	//   36   61:astore          15
			j = _inputPtr;
	//   37   63:aload_0         
	//   38   64:getfield        #52  <Field int _inputPtr>
	//   39   67:istore          5
			_inputPtr = j + 1;
	//   40   69:aload_0         
	//   41   70:iload           5
	//   42   72:iconst_1        
	//   43   73:iadd            
	//   44   74:putfield        #52  <Field int _inputPtr>
			c = ac[j];
	//   45   77:aload           15
	//   46   79:iload           5
	//   47   81:caload          
	//   48   82:istore_3        
		} else
	//*  49   83:iload_3         
	//*  50   84:istore          4
	//*  51   86:iload_3         
	//*  52   87:bipush          48
	//*  53   89:icmpne          98
	//*  54   92:aload_0         
	//*  55   93:invokespecial   #269 <Method char _verifyNoLeadingZeroes()>
	//*  56   96:istore          4
	//*  57   98:iconst_0        
	//*  58   99:istore          7
	//*  59  101:iload           4
	//*  60  103:istore_3        
	//*  61  104:iload_3         
	//*  62  105:bipush          48
	//*  63  107:icmplt          898
	//*  64  110:iload_3         
	//*  65  111:bipush          57
	//*  66  113:icmpgt          898
	//*  67  116:iload           6
	//*  68  118:iconst_1        
	//*  69  119:iadd            
	//*  70  120:istore          6
	//*  71  122:aload           16
	//*  72  124:astore          15
	//*  73  126:iload_2         
	//*  74  127:istore          5
	//*  75  129:iload_2         
	//*  76  130:aload           16
	//*  77  132:arraylength     
	//*  78  133:icmplt          148
	//*  79  136:aload_0         
	//*  80  137:getfield        #78  <Field TextBuffer _textBuffer>
	//*  81  140:invokevirtual   #114 <Method char[] TextBuffer.finishCurrentSegment()>
	//*  82  143:astore          15
	//*  83  145:iconst_0        
	//*  84  146:istore          5
	//*  85  148:iload           5
	//*  86  150:iconst_1        
	//*  87  151:iadd            
	//*  88  152:istore_2        
	//*  89  153:aload           15
	//*  90  155:iload           5
	//*  91  157:iload_3         
	//*  92  158:castore         
	//*  93  159:aload_0         
	//*  94  160:getfield        #52  <Field int _inputPtr>
	//*  95  163:aload_0         
	//*  96  164:getfield        #55  <Field int _inputEnd>
	//*  97  167:icmplt          209
	//*  98  170:aload_0         
	//*  99  171:invokevirtual   #94  <Method boolean loadMore()>
	//* 100  174:ifne            209
	//* 101  177:iconst_0        
	//* 102  178:istore_3        
	//* 103  179:iconst_1        
	//* 104  180:istore          5
	//* 105  182:iload           6
	//* 106  184:istore          10
	//* 107  186:iload           10
	//* 108  188:ifne            242
	//* 109  191:aload_0         
	//* 110  192:iload_3         
	//* 111  193:iload_1         
	//* 112  194:invokevirtual   #273 <Method JsonToken _handleInvalidNumberStart(int, boolean)>
	//* 113  197:areturn         
		{
			c = getNextChar("No digit following minus sign");
	//  114  198:aload_0         
	//  115  199:ldc2            #275 <String "No digit following minus sign">
	//  116  202:invokevirtual   #279 <Method char getNextChar(String)>
	//  117  205:istore_3        
		}
		c1 = c;
		if(c == '0')
			c1 = _verifyNoLeadingZeroes();
		l = 0;
		c = c1;
_L4:
		if(c < '0' || c > '9')
			break MISSING_BLOCK_LABEL_898;
		k++;
		ac1 = ac2;
		j = i;
		if(i >= ac2.length)
		{
			ac1 = _textBuffer.finishCurrentSegment();
			j = 0;
		}
		i = j + 1;
		ac1[j] = c;
		if(_inputPtr < _inputEnd || loadMore()) goto _L2; else goto _L1
_L1:
		c = '\0';
		j = 1;
		k1 = k;
_L19:
		int l1;
		if(k1 == 0)
			return _handleInvalidNumberStart(((int) (c)), flag);
	//* 118  206:goto            83
	//* 119  209:aload_0         
	//* 120  210:getfield        #49  <Field char[] _inputBuffer>
	//* 121  213:astore          16
	//* 122  215:aload_0         
	//* 123  216:getfield        #52  <Field int _inputPtr>
	//* 124  219:istore          5
	//* 125  221:aload_0         
	//* 126  222:iload           5
	//* 127  224:iconst_1        
	//* 128  225:iadd            
	//* 129  226:putfield        #52  <Field int _inputPtr>
	//* 130  229:aload           16
	//* 131  231:iload           5
	//* 132  233:caload          
	//* 133  234:istore_3        
	//* 134  235:aload           15
	//* 135  237:astore          16
	//* 136  239:goto            104
		l1 = 0;
	//  137  242:iconst_0        
	//  138  243:istore          11
		l = 0;
	//  139  245:iconst_0        
	//  140  246:istore          7
		if(c != '.')
			break MISSING_BLOCK_LABEL_888;
	//  141  248:iload_3         
	//  142  249:bipush          46
	//  143  251:icmpne          888
		k = i + 1;
	//  144  254:iload_2         
	//  145  255:iconst_1        
	//  146  256:iadd            
	//  147  257:istore          6
		ac1[i] = c;
	//  148  259:aload           15
	//  149  261:iload_2         
	//  150  262:iload_3         
	//  151  263:castore         
		  goto _L3
_L2:
		ac2 = _inputBuffer;
		j = _inputPtr;
		_inputPtr = j + 1;
		c = ac2[j];
		ac2 = ac1;
		  goto _L4
_L3:
		if(_inputPtr < _inputEnd || loadMore()) goto _L6; else goto _L5
	//  152  264:aload_0         
	//  153  265:getfield        #52  <Field int _inputPtr>
	//  154  268:aload_0         
	//  155  269:getfield        #55  <Field int _inputEnd>
	//  156  272:icmplt          714
	//  157  275:aload_0         
	//  158  276:invokevirtual   #94  <Method boolean loadMore()>
	//  159  279:ifne            714
_L5:
		int i1 = 1;
	//  160  282:iconst_1        
	//  161  283:istore          8
_L16:
		char c2;
		c2 = c;
	//  162  285:iload_3         
	//  163  286:istore          4
		j = i1;
	//  164  288:iload           8
	//  165  290:istore          5
		l1 = l;
	//  166  292:iload           7
	//  167  294:istore          11
		ac2 = ac1;
	//  168  296:aload           15
	//  169  298:astore          16
		i = k;
	//  170  300:iload           6
	//  171  302:istore_2        
		if(l == 0)
	//* 172  303:iload           7
	//* 173  305:ifne            333
		{
			reportUnexpectedNumberChar(((int) (c)), "Decimal point not followed by a digit");
	//  174  308:aload_0         
	//  175  309:iload_3         
	//  176  310:ldc1            #213 <String "Decimal point not followed by a digit">
	//  177  312:invokevirtual   #217 <Method void reportUnexpectedNumberChar(int, String)>
			i = k;
	//  178  315:iload           6
	//  179  317:istore_2        
			ac2 = ac1;
	//  180  318:aload           15
	//  181  320:astore          16
			l1 = l;
	//  182  322:iload           7
	//  183  324:istore          11
			j = i1;
	//  184  326:iload           8
	//  185  328:istore          5
			c2 = c;
	//  186  330:iload_3         
	//  187  331:istore          4
		}
_L18:
		int i2;
		i2 = 0;
	//  188  333:iconst_0        
	//  189  334:istore          12
		l = 0;
	//  190  336:iconst_0        
	//  191  337:istore          7
		if(c2 == 'e') goto _L8; else goto _L7
	//  192  339:iload           4
	//  193  341:bipush          101
	//  194  343:icmpeq          364
_L7:
		int j1;
		int j2;
		char c3;
		c3 = c2;
	//  195  346:iload           4
	//  196  348:istore          14
		j1 = j;
	//  197  350:iload           5
	//  198  352:istore          9
		j2 = i;
	//  199  354:iload_2         
	//  200  355:istore          13
		if(c2 != 'E') goto _L9; else goto _L8
	//  201  357:iload           4
	//  202  359:bipush          69
	//  203  361:icmpne          662
_L8:
		ac1 = ac2;
	//  204  364:aload           16
	//  205  366:astore          15
		k = i;
	//  206  368:iload_2         
	//  207  369:istore          6
		if(i >= ac2.length)
	//* 208  371:iload_2         
	//* 209  372:aload           16
	//* 210  374:arraylength     
	//* 211  375:icmplt          390
		{
			ac1 = _textBuffer.finishCurrentSegment();
	//  212  378:aload_0         
	//  213  379:getfield        #78  <Field TextBuffer _textBuffer>
	//  214  382:invokevirtual   #114 <Method char[] TextBuffer.finishCurrentSegment()>
	//  215  385:astore          15
			k = 0;
	//  216  387:iconst_0        
	//  217  388:istore          6
		}
		i = k + 1;
	//  218  390:iload           6
	//  219  392:iconst_1        
	//  220  393:iadd            
	//  221  394:istore_2        
		ac1[k] = c2;
	//  222  395:aload           15
	//  223  397:iload           6
	//  224  399:iload           4
	//  225  401:castore         
		if(_inputPtr < _inputEnd)
	//* 226  402:aload_0         
	//* 227  403:getfield        #52  <Field int _inputPtr>
	//* 228  406:aload_0         
	//* 229  407:getfield        #55  <Field int _inputEnd>
	//* 230  410:icmpge          819
		{
			ac2 = _inputBuffer;
	//  231  413:aload_0         
	//  232  414:getfield        #49  <Field char[] _inputBuffer>
	//  233  417:astore          16
			k = _inputPtr;
	//  234  419:aload_0         
	//  235  420:getfield        #52  <Field int _inputPtr>
	//  236  423:istore          6
			_inputPtr = k + 1;
	//  237  425:aload_0         
	//  238  426:iload           6
	//  239  428:iconst_1        
	//  240  429:iadd            
	//  241  430:putfield        #52  <Field int _inputPtr>
			c = ac2[k];
	//  242  433:aload           16
	//  243  435:iload           6
	//  244  437:caload          
	//  245  438:istore_3        
		} else
	//* 246  439:iload_3         
	//* 247  440:bipush          45
	//* 248  442:icmpeq          451
	//* 249  445:iload_3         
	//* 250  446:bipush          43
	//* 251  448:icmpne          881
	//* 252  451:iload_2         
	//* 253  452:aload           15
	//* 254  454:arraylength     
	//* 255  455:icmplt          878
	//* 256  458:aload_0         
	//* 257  459:getfield        #78  <Field TextBuffer _textBuffer>
	//* 258  462:invokevirtual   #114 <Method char[] TextBuffer.finishCurrentSegment()>
	//* 259  465:astore          15
	//* 260  467:iconst_0        
	//* 261  468:istore_2        
	//* 262  469:aload           15
	//* 263  471:iload_2         
	//* 264  472:iload_3         
	//* 265  473:castore         
	//* 266  474:aload_0         
	//* 267  475:getfield        #52  <Field int _inputPtr>
	//* 268  478:aload_0         
	//* 269  479:getfield        #55  <Field int _inputEnd>
	//* 270  482:icmpge          830
	//* 271  485:aload_0         
	//* 272  486:getfield        #49  <Field char[] _inputBuffer>
	//* 273  489:astore          16
	//* 274  491:aload_0         
	//* 275  492:getfield        #52  <Field int _inputPtr>
	//* 276  495:istore          6
	//* 277  497:aload_0         
	//* 278  498:iload           6
	//* 279  500:iconst_1        
	//* 280  501:iadd            
	//* 281  502:putfield        #52  <Field int _inputPtr>
	//* 282  505:aload           16
	//* 283  507:iload           6
	//* 284  509:caload          
	//* 285  510:istore_3        
	//* 286  511:iload_2         
	//* 287  512:iconst_1        
	//* 288  513:iadd            
	//* 289  514:istore_2        
	//* 290  515:iload           7
	//* 291  517:istore          9
	//* 292  519:iload           5
	//* 293  521:istore          8
	//* 294  523:iload           9
	//* 295  525:istore          7
	//* 296  527:iload_2         
	//* 297  528:istore          6
	//* 298  530:iload_3         
	//* 299  531:bipush          57
	//* 300  533:icmpgt          620
	//* 301  536:iload           5
	//* 302  538:istore          8
	//* 303  540:iload           9
	//* 304  542:istore          7
	//* 305  544:iload_2         
	//* 306  545:istore          6
	//* 307  547:iload_3         
	//* 308  548:bipush          48
	//* 309  550:icmplt          620
	//* 310  553:iload           9
	//* 311  555:iconst_1        
	//* 312  556:iadd            
	//* 313  557:istore          7
	//* 314  559:aload           15
	//* 315  561:astore          16
	//* 316  563:iload_2         
	//* 317  564:istore          6
	//* 318  566:iload_2         
	//* 319  567:aload           15
	//* 320  569:arraylength     
	//* 321  570:icmplt          585
	//* 322  573:aload_0         
	//* 323  574:getfield        #78  <Field TextBuffer _textBuffer>
	//* 324  577:invokevirtual   #114 <Method char[] TextBuffer.finishCurrentSegment()>
	//* 325  580:astore          16
	//* 326  582:iconst_0        
	//* 327  583:istore          6
	//* 328  585:iload           6
	//* 329  587:iconst_1        
	//* 330  588:iadd            
	//* 331  589:istore_2        
	//* 332  590:aload           16
	//* 333  592:iload           6
	//* 334  594:iload_3         
	//* 335  595:castore         
	//* 336  596:aload_0         
	//* 337  597:getfield        #52  <Field int _inputPtr>
	//* 338  600:aload_0         
	//* 339  601:getfield        #55  <Field int _inputEnd>
	//* 340  604:icmplt          841
	//* 341  607:aload_0         
	//* 342  608:invokevirtual   #94  <Method boolean loadMore()>
	//* 343  611:ifne            841
	//* 344  614:iconst_1        
	//* 345  615:istore          8
	//* 346  617:iload_2         
	//* 347  618:istore          6
	//* 348  620:iload_3         
	//* 349  621:istore          14
	//* 350  623:iload           8
	//* 351  625:istore          9
	//* 352  627:iload           7
	//* 353  629:istore          12
	//* 354  631:iload           6
	//* 355  633:istore          13
	//* 356  635:iload           7
	//* 357  637:ifne            662
	//* 358  640:aload_0         
	//* 359  641:iload_3         
	//* 360  642:ldc1            #219 <String "Exponent indicator not followed by a digit">
	//* 361  644:invokevirtual   #217 <Method void reportUnexpectedNumberChar(int, String)>
	//* 362  647:iload           6
	//* 363  649:istore          13
	//* 364  651:iload           7
	//* 365  653:istore          12
	//* 366  655:iload           8
	//* 367  657:istore          9
	//* 368  659:iload_3         
	//* 369  660:istore          14
	//* 370  662:iload           9
	//* 371  664:ifne            693
	//* 372  667:aload_0         
	//* 373  668:aload_0         
	//* 374  669:getfield        #52  <Field int _inputPtr>
	//* 375  672:iconst_1        
	//* 376  673:isub            
	//* 377  674:putfield        #52  <Field int _inputPtr>
	//* 378  677:aload_0         
	//* 379  678:getfield        #189 <Field JsonReadContext _parsingContext>
	//* 380  681:invokevirtual   #222 <Method boolean JsonReadContext.inRoot()>
	//* 381  684:ifeq            693
	//* 382  687:aload_0         
	//* 383  688:iload           14
	//* 384  690:invokespecial   #225 <Method void _verifyRootSpace(int)>
	//* 385  693:aload_0         
	//* 386  694:getfield        #78  <Field TextBuffer _textBuffer>
	//* 387  697:iload           13
	//* 388  699:invokevirtual   #98  <Method void TextBuffer.setCurrentLength(int)>
	//* 389  702:aload_0         
	//* 390  703:iload_1         
	//* 391  704:iload           10
	//* 392  706:iload           11
	//* 393  708:iload           12
	//* 394  710:invokevirtual   #282 <Method JsonToken reset(boolean, int, int, int)>
	//* 395  713:areturn         
	//* 396  714:aload_0         
	//* 397  715:getfield        #49  <Field char[] _inputBuffer>
	//* 398  718:astore          16
	//* 399  720:aload_0         
	//* 400  721:getfield        #52  <Field int _inputPtr>
	//* 401  724:istore_2        
	//* 402  725:aload_0         
	//* 403  726:iload_2         
	//* 404  727:iconst_1        
	//* 405  728:iadd            
	//* 406  729:putfield        #52  <Field int _inputPtr>
	//* 407  732:aload           16
	//* 408  734:iload_2         
	//* 409  735:caload          
	//* 410  736:istore          4
	//* 411  738:iload           4
	//* 412  740:istore_3        
	//* 413  741:iload           5
	//* 414  743:istore          8
	//* 415  745:iload           4
	//* 416  747:bipush          48
	//* 417  749:icmplt          285
	//* 418  752:iload           4
	//* 419  754:istore_3        
	//* 420  755:iload           5
	//* 421  757:istore          8
	//* 422  759:iload           4
	//* 423  761:bipush          57
	//* 424  763:icmpgt          285
	//* 425  766:iload           7
	//* 426  768:iconst_1        
	//* 427  769:iadd            
	//* 428  770:istore          7
	//* 429  772:aload           15
	//* 430  774:astore          16
	//* 431  776:iload           6
	//* 432  778:istore_2        
	//* 433  779:iload           6
	//* 434  781:aload           15
	//* 435  783:arraylength     
	//* 436  784:icmplt          798
	//* 437  787:aload_0         
	//* 438  788:getfield        #78  <Field TextBuffer _textBuffer>
	//* 439  791:invokevirtual   #114 <Method char[] TextBuffer.finishCurrentSegment()>
	//* 440  794:astore          16
	//* 441  796:iconst_0        
	//* 442  797:istore_2        
	//* 443  798:aload           16
	//* 444  800:iload_2         
	//* 445  801:iload           4
	//* 446  803:castore         
	//* 447  804:iload_2         
	//* 448  805:iconst_1        
	//* 449  806:iadd            
	//* 450  807:istore          6
	//* 451  809:iload           4
	//* 452  811:istore_3        
	//* 453  812:aload           16
	//* 454  814:astore          15
	//* 455  816:goto            264
		{
			c = getNextChar("expected a digit for number exponent");
	//  456  819:aload_0         
	//  457  820:ldc2            #284 <String "expected a digit for number exponent">
	//  458  823:invokevirtual   #279 <Method char getNextChar(String)>
	//  459  826:istore_3        
		}
		if(c == '-' || c == '+')
		{
			if(i >= ac1.length)
			{
				ac1 = _textBuffer.finishCurrentSegment();
				i = 0;
			}
			ac1[i] = c;
			if(_inputPtr < _inputEnd)
			{
				ac2 = _inputBuffer;
				k = _inputPtr;
				_inputPtr = k + 1;
				c = ac2[k];
			} else
	//* 460  827:goto            439
			{
				c = getNextChar("expected a digit for number exponent");
	//  461  830:aload_0         
	//  462  831:ldc2            #284 <String "expected a digit for number exponent">
	//  463  834:invokevirtual   #279 <Method char getNextChar(String)>
	//  464  837:istore_3        
			}
			i++;
			j1 = l;
		} else
	//* 465  838:goto            511
	//* 466  841:aload_0         
	//* 467  842:getfield        #49  <Field char[] _inputBuffer>
	//* 468  845:astore          15
	//* 469  847:aload_0         
	//* 470  848:getfield        #52  <Field int _inputPtr>
	//* 471  851:istore          6
	//* 472  853:aload_0         
	//* 473  854:iload           6
	//* 474  856:iconst_1        
	//* 475  857:iadd            
	//* 476  858:putfield        #52  <Field int _inputPtr>
	//* 477  861:aload           15
	//* 478  863:iload           6
	//* 479  865:caload          
	//* 480  866:istore_3        
	//* 481  867:iload           7
	//* 482  869:istore          9
	//* 483  871:aload           16
	//* 484  873:astore          15
	//* 485  875:goto            519
	//* 486  878:goto            469
		{
			j1 = l;
	//  487  881:iload           7
	//  488  883:istore          9
		}
		i1 = j;
		l = j1;
		k = i;
		if(c > '9') goto _L11; else goto _L10
_L10:
		i1 = j;
		l = j1;
		k = i;
		if(c < '0') goto _L11; else goto _L12
_L12:
		l = j1 + 1;
		ac2 = ac1;
		k = i;
		if(i >= ac1.length)
		{
			ac2 = _textBuffer.finishCurrentSegment();
			k = 0;
		}
		i = k + 1;
		ac2[k] = c;
		if(_inputPtr < _inputEnd || loadMore()) goto _L14; else goto _L13
_L13:
		i1 = 1;
		k = i;
_L11:
		c3 = c;
		j1 = i1;
		i2 = l;
		j2 = k;
		if(l == 0)
		{
			reportUnexpectedNumberChar(((int) (c)), "Exponent indicator not followed by a digit");
			j2 = k;
			i2 = l;
			j1 = i1;
			c3 = c;
		}
_L9:
		if(j1 == 0)
		{
			_inputPtr = _inputPtr - 1;
			if(_parsingContext.inRoot())
				_verifyRootSpace(((int) (c3)));
		}
		_textBuffer.setCurrentLength(j2);
		return reset(flag, k1, l1, i2);
_L6:
		ac2 = _inputBuffer;
		i = _inputPtr;
		_inputPtr = i + 1;
		c2 = ac2[i];
		c = c2;
		i1 = j;
		if(c2 < '0') goto _L16; else goto _L15
_L15:
		c = c2;
		i1 = j;
		if(c2 > '9') goto _L16; else goto _L17
_L17:
		l++;
		ac2 = ac1;
		i = k;
		if(k >= ac1.length)
		{
			ac2 = _textBuffer.finishCurrentSegment();
			i = 0;
		}
		ac2[i] = c2;
		k = i + 1;
		c = c2;
		ac1 = ac2;
		  goto _L3
_L14:
		ac1 = _inputBuffer;
		k = _inputPtr;
		_inputPtr = k + 1;
		c = ac1[k];
		j1 = l;
		ac1 = ac2;
		break MISSING_BLOCK_LABEL_519;
	//* 489  885:goto            519
		c2 = c;
	//  490  888:iload_3         
	//  491  889:istore          4
		ac2 = ac1;
	//  492  891:aload           15
	//  493  893:astore          16
		  goto _L18
	//* 494  895:goto            333
		j = l;
	//  495  898:iload           7
	//  496  900:istore          5
		k1 = k;
	//  497  902:iload           6
	//  498  904:istore          10
		ac1 = ac2;
	//  499  906:aload           16
	//  500  908:astore          15
		  goto _L19
	//* 501  910:goto            186
	}

	private final int _skipAfterComma2()
		throws IOException
	{
		do
		{
			if(_inputPtr >= _inputEnd && !loadMore())
				break;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int _inputPtr>
	//    2    4:aload_0         
	//    3    5:getfield        #55  <Field int _inputEnd>
	//    4    8:icmplt          18
	//    5   11:aload_0         
	//    6   12:invokevirtual   #94  <Method boolean loadMore()>
	//    7   15:ifeq            133
			char ac[] = _inputBuffer;
	//    8   18:aload_0         
	//    9   19:getfield        #49  <Field char[] _inputBuffer>
	//   10   22:astore_2        
			int i = _inputPtr;
	//   11   23:aload_0         
	//   12   24:getfield        #52  <Field int _inputPtr>
	//   13   27:istore_1        
			_inputPtr = i + 1;
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:putfield        #52  <Field int _inputPtr>
			i = ((int) (ac[i]));
	//   19   35:aload_2         
	//   20   36:iload_1         
	//   21   37:caload          
	//   22   38:istore_1        
			if(i > ' ')
	//*  23   39:iload_1         
	//*  24   40:bipush          32
	//*  25   42:icmple          73
			{
				if(i == '/')
	//*  26   45:iload_1         
	//*  27   46:bipush          47
	//*  28   48:icmpne          58
					_skipComment();
	//   29   51:aload_0         
	//   30   52:invokespecial   #288 <Method void _skipComment()>
				else
	//*  31   55:goto            0
				if(i != '#' || !_skipYAMLComment())
	//*  32   58:iload_1         
	//*  33   59:bipush          35
	//*  34   61:icmpne          71
	//*  35   64:aload_0         
	//*  36   65:invokespecial   #291 <Method boolean _skipYAMLComment()>
	//*  37   68:ifne            0
					return i;
	//   38   71:iload_1         
	//   39   72:ireturn         
			} else
			if(i < ' ')
	//*  40   73:iload_1         
	//*  41   74:bipush          32
	//*  42   76:icmpge          0
				if(i == '\n')
	//*  43   79:iload_1         
	//*  44   80:bipush          10
	//*  45   82:icmpne          106
				{
					_currInputRow = _currInputRow + 1;
	//   46   85:aload_0         
	//   47   86:aload_0         
	//   48   87:getfield        #294 <Field int _currInputRow>
	//   49   90:iconst_1        
	//   50   91:iadd            
	//   51   92:putfield        #294 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   52   95:aload_0         
	//   53   96:aload_0         
	//   54   97:getfield        #52  <Field int _inputPtr>
	//   55  100:putfield        #297 <Field int _currInputRowStart>
				} else
	//*  56  103:goto            0
				if(i == '\r')
	//*  57  106:iload_1         
	//*  58  107:bipush          13
	//*  59  109:icmpne          119
					_skipCR();
	//   60  112:aload_0         
	//   61  113:invokevirtual   #300 <Method void _skipCR()>
				else
	//*  62  116:goto            0
				if(i != '\t')
	//*  63  119:iload_1         
	//*  64  120:bipush          9
	//*  65  122:icmpeq          0
					_throwInvalidSpace(i);
	//   66  125:aload_0         
	//   67  126:iload_1         
	//   68  127:invokevirtual   #303 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   69  130:goto            0
		throw _constructError((new StringBuilder()).append("Unexpected end-of-input within/between ").append(_parsingContext.getTypeDesc()).append(" entries").toString());
	//   70  133:aload_0         
	//   71  134:new             #233 <Class StringBuilder>
	//   72  137:dup             
	//   73  138:invokespecial   #235 <Method void StringBuilder()>
	//   74  141:ldc2            #305 <String "Unexpected end-of-input within/between ">
	//   75  144:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   76  147:aload_0         
	//   77  148:getfield        #189 <Field JsonReadContext _parsingContext>
	//   78  151:invokevirtual   #308 <Method String JsonReadContext.getTypeDesc()>
	//   79  154:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   80  157:ldc2            #310 <String " entries">
	//   81  160:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   82  163:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   83  166:invokevirtual   #314 <Method com.fasterxml.jackson.core.JsonParseException _constructError(String)>
	//   84  169:athrow          
	}

	private void _skipCComment()
		throws IOException
	{
		do
		{
			int i;
label0:
			{
label1:
				{
					if(_inputPtr < _inputEnd || loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #55  <Field int _inputEnd>
	//*   4    8:icmplt          18
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #94  <Method boolean loadMore()>
	//*   7   15:ifeq            69
					{
						char ac[] = _inputBuffer;
	//    8   18:aload_0         
	//    9   19:getfield        #49  <Field char[] _inputBuffer>
	//   10   22:astore_2        
						i = _inputPtr;
	//   11   23:aload_0         
	//   12   24:getfield        #52  <Field int _inputPtr>
	//   13   27:istore_1        
						_inputPtr = i + 1;
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:putfield        #52  <Field int _inputPtr>
						i = ((int) (ac[i]));
	//   19   35:aload_2         
	//   20   36:iload_1         
	//   21   37:caload          
	//   22   38:istore_1        
						if(i > '*')
							continue;
	//   23   39:iload_1         
	//   24   40:bipush          42
	//   25   42:icmpgt          0
						if(i != '*')
							break label0;
	//   26   45:iload_1         
	//   27   46:bipush          42
	//   28   48:icmpne          102
						if(_inputPtr < _inputEnd || loadMore())
							break label1;
	//   29   51:aload_0         
	//   30   52:getfield        #52  <Field int _inputPtr>
	//   31   55:aload_0         
	//   32   56:getfield        #55  <Field int _inputEnd>
	//   33   59:icmplt          77
	//   34   62:aload_0         
	//   35   63:invokevirtual   #94  <Method boolean loadMore()>
	//   36   66:ifne            77
					}
					_reportInvalidEOF(" in a comment");
	//   37   69:aload_0         
	//   38   70:ldc2            #317 <String " in a comment">
	//   39   73:invokevirtual   #254 <Method void _reportInvalidEOF(String)>
					return;
	//   40   76:return          
				}
				if(_inputBuffer[_inputPtr] == '/')
	//*  41   77:aload_0         
	//*  42   78:getfield        #49  <Field char[] _inputBuffer>
	//*  43   81:aload_0         
	//*  44   82:getfield        #52  <Field int _inputPtr>
	//*  45   85:caload          
	//*  46   86:bipush          47
	//*  47   88:icmpne          0
				{
					_inputPtr = _inputPtr + 1;
	//   48   91:aload_0         
	//   49   92:aload_0         
	//   50   93:getfield        #52  <Field int _inputPtr>
	//   51   96:iconst_1        
	//   52   97:iadd            
	//   53   98:putfield        #52  <Field int _inputPtr>
					return;
	//   54  101:return          
				}
				continue;
			}
			if(i < ' ')
	//*  55  102:iload_1         
	//*  56  103:bipush          32
	//*  57  105:icmpge          0
				if(i == '\n')
	//*  58  108:iload_1         
	//*  59  109:bipush          10
	//*  60  111:icmpne          135
				{
					_currInputRow = _currInputRow + 1;
	//   61  114:aload_0         
	//   62  115:aload_0         
	//   63  116:getfield        #294 <Field int _currInputRow>
	//   64  119:iconst_1        
	//   65  120:iadd            
	//   66  121:putfield        #294 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   67  124:aload_0         
	//   68  125:aload_0         
	//   69  126:getfield        #52  <Field int _inputPtr>
	//   70  129:putfield        #297 <Field int _currInputRowStart>
				} else
	//*  71  132:goto            0
				if(i == '\r')
	//*  72  135:iload_1         
	//*  73  136:bipush          13
	//*  74  138:icmpne          148
					_skipCR();
	//   75  141:aload_0         
	//   76  142:invokevirtual   #300 <Method void _skipCR()>
				else
	//*  77  145:goto            0
				if(i != '\t')
	//*  78  148:iload_1         
	//*  79  149:bipush          9
	//*  80  151:icmpeq          0
					_throwInvalidSpace(i);
	//   81  154:aload_0         
	//   82  155:iload_1         
	//   83  156:invokevirtual   #303 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   84  159:goto            0
	}

	private final int _skipColon()
		throws IOException
	{
		int k;
label0:
		{
			if(_inputPtr + 4 >= _inputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int _inputPtr>
	//*   2    4:iconst_4        
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #55  <Field int _inputEnd>
	//*   6   10:icmplt          19
				return _skipColon2(false);
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:invokespecial   #322 <Method int _skipColon2(boolean)>
	//   10   18:ireturn         
			char c = _inputBuffer[_inputPtr];
	//   11   19:aload_0         
	//   12   20:getfield        #49  <Field char[] _inputBuffer>
	//   13   23:aload_0         
	//   14   24:getfield        #52  <Field int _inputPtr>
	//   15   27:caload          
	//   16   28:istore_2        
			if(c == ':')
	//*  17   29:iload_2         
	//*  18   30:bipush          58
	//*  19   32:icmpne          167
			{
				char ac[] = _inputBuffer;
	//   20   35:aload_0         
	//   21   36:getfield        #49  <Field char[] _inputBuffer>
	//   22   39:astore_3        
				int i = _inputPtr + 1;
	//   23   40:aload_0         
	//   24   41:getfield        #52  <Field int _inputPtr>
	//   25   44:iconst_1        
	//   26   45:iadd            
	//   27   46:istore_1        
				_inputPtr = i;
	//   28   47:aload_0         
	//   29   48:iload_1         
	//   30   49:putfield        #52  <Field int _inputPtr>
				i = ((int) (ac[i]));
	//   31   52:aload_3         
	//   32   53:iload_1         
	//   33   54:caload          
	//   34   55:istore_1        
				if(i > ' ')
	//*  35   56:iload_1         
	//*  36   57:bipush          32
	//*  37   59:icmple          92
					if(i == '/' || i == '#')
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
	//   46   76:invokespecial   #322 <Method int _skipColon2(boolean)>
	//   47   79:ireturn         
					} else
					{
						_inputPtr = _inputPtr + 1;
	//   48   80:aload_0         
	//   49   81:aload_0         
	//   50   82:getfield        #52  <Field int _inputPtr>
	//   51   85:iconst_1        
	//   52   86:iadd            
	//   53   87:putfield        #52  <Field int _inputPtr>
						return i;
	//   54   90:iload_1         
	//   55   91:ireturn         
					}
				if(i == ' ' || i == '\t')
	//*  56   92:iload_1         
	//*  57   93:bipush          32
	//*  58   95:icmpeq          104
	//*  59   98:iload_1         
	//*  60   99:bipush          9
	//*  61  101:icmpne          161
				{
					char ac1[] = _inputBuffer;
	//   62  104:aload_0         
	//   63  105:getfield        #49  <Field char[] _inputBuffer>
	//   64  108:astore_3        
					int j = _inputPtr + 1;
	//   65  109:aload_0         
	//   66  110:getfield        #52  <Field int _inputPtr>
	//   67  113:iconst_1        
	//   68  114:iadd            
	//   69  115:istore_1        
					_inputPtr = j;
	//   70  116:aload_0         
	//   71  117:iload_1         
	//   72  118:putfield        #52  <Field int _inputPtr>
					j = ((int) (ac1[j]));
	//   73  121:aload_3         
	//   74  122:iload_1         
	//   75  123:caload          
	//   76  124:istore_1        
					if(j > ' ')
	//*  77  125:iload_1         
	//*  78  126:bipush          32
	//*  79  128:icmple          161
						if(j == '/' || j == '#')
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
	//   88  145:invokespecial   #322 <Method int _skipColon2(boolean)>
	//   89  148:ireturn         
						} else
						{
							_inputPtr = _inputPtr + 1;
	//   90  149:aload_0         
	//   91  150:aload_0         
	//   92  151:getfield        #52  <Field int _inputPtr>
	//   93  154:iconst_1        
	//   94  155:iadd            
	//   95  156:putfield        #52  <Field int _inputPtr>
							return j;
	//   96  159:iload_1         
	//   97  160:ireturn         
						}
				}
				return _skipColon2(true);
	//   98  161:aload_0         
	//   99  162:iconst_1        
	//  100  163:invokespecial   #322 <Method int _skipColon2(boolean)>
	//  101  166:ireturn         
			}
			if(c != ' ')
	//* 102  167:iload_2         
	//* 103  168:bipush          32
	//* 104  170:icmpeq          181
			{
				k = ((int) (c));
	//  105  173:iload_2         
	//  106  174:istore_1        
				if(c != '\t')
					break label0;
	//  107  175:iload_2         
	//  108  176:bipush          9
	//  109  178:icmpne          202
			}
			char ac2[] = _inputBuffer;
	//  110  181:aload_0         
	//  111  182:getfield        #49  <Field char[] _inputBuffer>
	//  112  185:astore_3        
			k = _inputPtr + 1;
	//  113  186:aload_0         
	//  114  187:getfield        #52  <Field int _inputPtr>
	//  115  190:iconst_1        
	//  116  191:iadd            
	//  117  192:istore_1        
			_inputPtr = k;
	//  118  193:aload_0         
	//  119  194:iload_1         
	//  120  195:putfield        #52  <Field int _inputPtr>
			k = ((int) (ac2[k]));
	//  121  198:aload_3         
	//  122  199:iload_1         
	//  123  200:caload          
	//  124  201:istore_1        
		}
		if(k == 58)
	//* 125  202:iload_1         
	//* 126  203:bipush          58
	//* 127  205:icmpne          340
		{
			char ac3[] = _inputBuffer;
	//  128  208:aload_0         
	//  129  209:getfield        #49  <Field char[] _inputBuffer>
	//  130  212:astore_3        
			int l = _inputPtr + 1;
	//  131  213:aload_0         
	//  132  214:getfield        #52  <Field int _inputPtr>
	//  133  217:iconst_1        
	//  134  218:iadd            
	//  135  219:istore_1        
			_inputPtr = l;
	//  136  220:aload_0         
	//  137  221:iload_1         
	//  138  222:putfield        #52  <Field int _inputPtr>
			l = ((int) (ac3[l]));
	//  139  225:aload_3         
	//  140  226:iload_1         
	//  141  227:caload          
	//  142  228:istore_1        
			if(l > ' ')
	//* 143  229:iload_1         
	//* 144  230:bipush          32
	//* 145  232:icmple          265
				if(l == '/' || l == '#')
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
	//  154  249:invokespecial   #322 <Method int _skipColon2(boolean)>
	//  155  252:ireturn         
				} else
				{
					_inputPtr = _inputPtr + 1;
	//  156  253:aload_0         
	//  157  254:aload_0         
	//  158  255:getfield        #52  <Field int _inputPtr>
	//  159  258:iconst_1        
	//  160  259:iadd            
	//  161  260:putfield        #52  <Field int _inputPtr>
					return l;
	//  162  263:iload_1         
	//  163  264:ireturn         
				}
			if(l == ' ' || l == '\t')
	//* 164  265:iload_1         
	//* 165  266:bipush          32
	//* 166  268:icmpeq          277
	//* 167  271:iload_1         
	//* 168  272:bipush          9
	//* 169  274:icmpne          334
			{
				char ac4[] = _inputBuffer;
	//  170  277:aload_0         
	//  171  278:getfield        #49  <Field char[] _inputBuffer>
	//  172  281:astore_3        
				int i1 = _inputPtr + 1;
	//  173  282:aload_0         
	//  174  283:getfield        #52  <Field int _inputPtr>
	//  175  286:iconst_1        
	//  176  287:iadd            
	//  177  288:istore_1        
				_inputPtr = i1;
	//  178  289:aload_0         
	//  179  290:iload_1         
	//  180  291:putfield        #52  <Field int _inputPtr>
				i1 = ((int) (ac4[i1]));
	//  181  294:aload_3         
	//  182  295:iload_1         
	//  183  296:caload          
	//  184  297:istore_1        
				if(i1 > ' ')
	//* 185  298:iload_1         
	//* 186  299:bipush          32
	//* 187  301:icmple          334
					if(i1 == '/' || i1 == '#')
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
	//  196  318:invokespecial   #322 <Method int _skipColon2(boolean)>
	//  197  321:ireturn         
					} else
					{
						_inputPtr = _inputPtr + 1;
	//  198  322:aload_0         
	//  199  323:aload_0         
	//  200  324:getfield        #52  <Field int _inputPtr>
	//  201  327:iconst_1        
	//  202  328:iadd            
	//  203  329:putfield        #52  <Field int _inputPtr>
						return i1;
	//  204  332:iload_1         
	//  205  333:ireturn         
					}
			}
			return _skipColon2(true);
	//  206  334:aload_0         
	//  207  335:iconst_1        
	//  208  336:invokespecial   #322 <Method int _skipColon2(boolean)>
	//  209  339:ireturn         
		} else
		{
			return _skipColon2(false);
	//  210  340:aload_0         
	//  211  341:iconst_0        
	//  212  342:invokespecial   #322 <Method int _skipColon2(boolean)>
	//  213  345:ireturn         
		}
	}

	private final int _skipColon2(boolean flag)
		throws IOException
	{
		do
		{
			if(_inputPtr >= _inputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #55  <Field int _inputEnd>
	//*   4    8:icmplt          15
				loadMoreGuaranteed();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #325 <Method void loadMoreGuaranteed()>
			char ac[] = _inputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #49  <Field char[] _inputBuffer>
	//    9   19:astore_3        
			int i = _inputPtr;
	//   10   20:aload_0         
	//   11   21:getfield        #52  <Field int _inputPtr>
	//   12   24:istore_2        
			_inputPtr = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #52  <Field int _inputPtr>
			i = ((int) (ac[i]));
	//   18   32:aload_3         
	//   19   33:iload_2         
	//   20   34:caload          
	//   21   35:istore_2        
			if(i > ' ')
	//*  22   36:iload_2         
	//*  23   37:bipush          32
	//*  24   39:icmple          104
			{
				if(i == '/')
	//*  25   42:iload_2         
	//*  26   43:bipush          47
	//*  27   45:icmpne          55
					_skipComment();
	//   28   48:aload_0         
	//   29   49:invokespecial   #288 <Method void _skipComment()>
				else
	//*  30   52:goto            0
				if(i != '#' || !_skipYAMLComment())
	//*  31   55:iload_2         
	//*  32   56:bipush          35
	//*  33   58:icmpne          68
	//*  34   61:aload_0         
	//*  35   62:invokespecial   #291 <Method boolean _skipYAMLComment()>
	//*  36   65:ifne            0
				{
					if(flag)
	//*  37   68:iload_1         
	//*  38   69:ifeq            74
						return i;
	//   39   72:iload_2         
	//   40   73:ireturn         
					if(i != ':')
	//*  41   74:iload_2         
	//*  42   75:bipush          58
	//*  43   77:icmpeq          99
					{
						if(i < ' ')
	//*  44   80:iload_2         
	//*  45   81:bipush          32
	//*  46   83:icmpge          91
							_throwInvalidSpace(i);
	//   47   86:aload_0         
	//   48   87:iload_2         
	//   49   88:invokevirtual   #303 <Method void _throwInvalidSpace(int)>
						_reportUnexpectedChar(i, "was expecting a colon to separate field name and value");
	//   50   91:aload_0         
	//   51   92:iload_2         
	//   52   93:ldc2            #327 <String "was expecting a colon to separate field name and value">
	//   53   96:invokevirtual   #330 <Method void _reportUnexpectedChar(int, String)>
					}
					flag = true;
	//   54   99:iconst_1        
	//   55  100:istore_1        
				}
			} else
	//*  56  101:goto            0
			if(i < ' ')
	//*  57  104:iload_2         
	//*  58  105:bipush          32
	//*  59  107:icmpge          0
				if(i == '\n')
	//*  60  110:iload_2         
	//*  61  111:bipush          10
	//*  62  113:icmpne          137
				{
					_currInputRow = _currInputRow + 1;
	//   63  116:aload_0         
	//   64  117:aload_0         
	//   65  118:getfield        #294 <Field int _currInputRow>
	//   66  121:iconst_1        
	//   67  122:iadd            
	//   68  123:putfield        #294 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   69  126:aload_0         
	//   70  127:aload_0         
	//   71  128:getfield        #52  <Field int _inputPtr>
	//   72  131:putfield        #297 <Field int _currInputRowStart>
				} else
	//*  73  134:goto            0
				if(i == '\r')
	//*  74  137:iload_2         
	//*  75  138:bipush          13
	//*  76  140:icmpne          150
					_skipCR();
	//   77  143:aload_0         
	//   78  144:invokevirtual   #300 <Method void _skipCR()>
				else
	//*  79  147:goto            0
				if(i != '\t')
	//*  80  150:iload_2         
	//*  81  151:bipush          9
	//*  82  153:icmpeq          0
					_throwInvalidSpace(i);
	//   83  156:aload_0         
	//   84  157:iload_2         
	//   85  158:invokevirtual   #303 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   86  161:goto            0
	}

	private final int _skipColonFast(int i)
		throws IOException
	{
		int l;
		char c1;
		boolean flag;
label0:
		{
label1:
			{
				flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
				char ac[] = _inputBuffer;
	//    2    3:aload_0         
	//    3    4:getfield        #49  <Field char[] _inputBuffer>
	//    4    7:astore          6
				l = i + 1;
	//    5    9:iload_1         
	//    6   10:iconst_1        
	//    7   11:iadd            
	//    8   12:istore_3        
				c1 = ac[i];
	//    9   13:aload           6
	//   10   15:iload_1         
	//   11   16:caload          
	//   12   17:istore          4
				if(c1 != ':')
					break label0;
	//   13   19:iload           4
	//   14   21:bipush          58
	//   15   23:icmpne          137
				ac = _inputBuffer;
	//   16   26:aload_0         
	//   17   27:getfield        #49  <Field char[] _inputBuffer>
	//   18   30:astore          6
				int j = l + 1;
	//   19   32:iload_3         
	//   20   33:iconst_1        
	//   21   34:iadd            
	//   22   35:istore_2        
				l = ((int) (ac[l]));
	//   23   36:aload           6
	//   24   38:iload_3         
	//   25   39:caload          
	//   26   40:istore_3        
				if(l > 32)
	//*  27   41:iload_3         
	//*  28   42:bipush          32
	//*  29   44:icmple          70
				{
					i = j;
	//   30   47:iload_2         
	//   31   48:istore_1        
					if(l != 47)
	//*  32   49:iload_3         
	//*  33   50:bipush          47
	//*  34   52:icmpeq          124
					{
						i = j;
	//   35   55:iload_2         
	//   36   56:istore_1        
						if(l != 35)
	//*  37   57:iload_3         
	//*  38   58:bipush          35
	//*  39   60:icmpeq          124
						{
							_inputPtr = j;
	//   40   63:aload_0         
	//   41   64:iload_2         
	//   42   65:putfield        #52  <Field int _inputPtr>
							return l;
	//   43   68:iload_3         
	//   44   69:ireturn         
						}
					}
					break label1;
				}
				if(l != 32)
	//*  45   70:iload_3         
	//*  46   71:bipush          32
	//*  47   73:icmpeq          84
				{
					i = j;
	//   48   76:iload_2         
	//   49   77:istore_1        
					if(l != 9)
						break label1;
	//   50   78:iload_3         
	//   51   79:bipush          9
	//   52   81:icmpne          124
				}
				ac = _inputBuffer;
	//   53   84:aload_0         
	//   54   85:getfield        #49  <Field char[] _inputBuffer>
	//   55   88:astore          6
				i = j + 1;
	//   56   90:iload_2         
	//   57   91:iconst_1        
	//   58   92:iadd            
	//   59   93:istore_1        
				j = ((int) (ac[j]));
	//   60   94:aload           6
	//   61   96:iload_2         
	//   62   97:caload          
	//   63   98:istore_2        
				if(j > ' ' && j != '/' && j != '#')
	//*  64   99:iload_2         
	//*  65  100:bipush          32
	//*  66  102:icmple          124
	//*  67  105:iload_2         
	//*  68  106:bipush          47
	//*  69  108:icmpeq          124
	//*  70  111:iload_2         
	//*  71  112:bipush          35
	//*  72  114:icmpeq          124
				{
					_inputPtr = i;
	//   73  117:aload_0         
	//   74  118:iload_1         
	//   75  119:putfield        #52  <Field int _inputPtr>
					return j;
	//   76  122:iload_2         
	//   77  123:ireturn         
				}
			}
			_inputPtr = i - 1;
	//   78  124:aload_0         
	//   79  125:iload_1         
	//   80  126:iconst_1        
	//   81  127:isub            
	//   82  128:putfield        #52  <Field int _inputPtr>
			return _skipColon2(true);
	//   83  131:aload_0         
	//   84  132:iconst_1        
	//   85  133:invokespecial   #322 <Method int _skipColon2(boolean)>
	//   86  136:ireturn         
		}
		int k;
label2:
		{
			if(c1 != ' ')
	//*  87  137:iload           4
	//*  88  139:bipush          32
	//*  89  141:icmpeq          156
			{
				k = ((int) (c1));
	//   90  144:iload           4
	//   91  146:istore_2        
				i = l;
	//   92  147:iload_3         
	//   93  148:istore_1        
				if(c1 != '\t')
					break label2;
	//   94  149:iload           4
	//   95  151:bipush          9
	//   96  153:icmpne          167
			}
			k = ((int) (_inputBuffer[l]));
	//   97  156:aload_0         
	//   98  157:getfield        #49  <Field char[] _inputBuffer>
	//   99  160:iload_3         
	//  100  161:caload          
	//  101  162:istore_2        
			i = l + 1;
	//  102  163:iload_3         
	//  103  164:iconst_1        
	//  104  165:iadd            
	//  105  166:istore_1        
		}
label3:
		{
			if(k != ':')
	//* 106  167:iload_2         
	//* 107  168:bipush          58
	//* 108  170:icmpne          224
	//* 109  173:iload_1         
	//* 110  174:istore_2        
	//* 111  175:iload           5
	//* 112  177:ifeq            290
	//* 113  180:aload_0         
	//* 114  181:getfield        #49  <Field char[] _inputBuffer>
	//* 115  184:astore          6
	//* 116  186:iload_1         
	//* 117  187:iconst_1        
	//* 118  188:iadd            
	//* 119  189:istore_2        
	//* 120  190:aload           6
	//* 121  192:iload_1         
	//* 122  193:caload          
	//* 123  194:istore_3        
	//* 124  195:iload_3         
	//* 125  196:bipush          32
	//* 126  198:icmple          230
	//* 127  201:iload_2         
	//* 128  202:istore_1        
	//* 129  203:iload_3         
	//* 130  204:bipush          47
	//* 131  206:icmpeq          292
	//* 132  209:iload_2         
	//* 133  210:istore_1        
	//* 134  211:iload_3         
	//* 135  212:bipush          35
	//* 136  214:icmpeq          292
	//* 137  217:aload_0         
	//* 138  218:iload_2         
	//* 139  219:putfield        #52  <Field int _inputPtr>
	//* 140  222:iload_3         
	//* 141  223:ireturn         
				flag = false;
	//  142  224:iconst_0        
	//  143  225:istore          5
			k = i;
			if(flag)
			{
				char ac1[] = _inputBuffer;
				k = i + 1;
				char c = ac1[i];
				if(c > ' ')
				{
					i = k;
					if(c != '/')
					{
						i = k;
						if(c != '#')
						{
							_inputPtr = k;
							return ((int) (c));
						}
					}
					break label3;
				}
	//* 144  227:goto            173
				if(c != ' ')
	//* 145  230:iload_3         
	//* 146  231:bipush          32
	//* 147  233:icmpeq          244
				{
					i = k;
	//  148  236:iload_2         
	//  149  237:istore_1        
					if(c != '\t')
						break label3;
	//  150  238:iload_3         
	//  151  239:bipush          9
	//  152  241:icmpne          292
				}
				ac1 = _inputBuffer;
	//  153  244:aload_0         
	//  154  245:getfield        #49  <Field char[] _inputBuffer>
	//  155  248:astore          6
				i = k + 1;
	//  156  250:iload_2         
	//  157  251:iconst_1        
	//  158  252:iadd            
	//  159  253:istore_1        
				c = ac1[k];
	//  160  254:aload           6
	//  161  256:iload_2         
	//  162  257:caload          
	//  163  258:istore_3        
				k = i;
	//  164  259:iload_1         
	//  165  260:istore_2        
				if(c > ' ')
	//* 166  261:iload_3         
	//* 167  262:bipush          32
	//* 168  264:icmple          290
				{
					k = i;
	//  169  267:iload_1         
	//  170  268:istore_2        
					if(c != '/')
	//* 171  269:iload_3         
	//* 172  270:bipush          47
	//* 173  272:icmpeq          290
					{
						k = i;
	//  174  275:iload_1         
	//  175  276:istore_2        
						if(c != '#')
	//* 176  277:iload_3         
	//* 177  278:bipush          35
	//* 178  280:icmpeq          290
						{
							_inputPtr = i;
	//  179  283:aload_0         
	//  180  284:iload_1         
	//  181  285:putfield        #52  <Field int _inputPtr>
							return ((int) (c));
	//  182  288:iload_3         
	//  183  289:ireturn         
						}
					}
				}
			}
			i = k;
	//  184  290:iload_2         
	//  185  291:istore_1        
		}
		_inputPtr = i - 1;
	//  186  292:aload_0         
	//  187  293:iload_1         
	//  188  294:iconst_1        
	//  189  295:isub            
	//  190  296:putfield        #52  <Field int _inputPtr>
		return _skipColon2(flag);
	//  191  299:aload_0         
	//  192  300:iload           5
	//  193  302:invokespecial   #322 <Method int _skipColon2(boolean)>
	//  194  305:ireturn         
	}

	private final int _skipComma(int i)
		throws IOException
	{
		if(i != 44)
	//*   0    0:iload_1         
	//*   1    1:bipush          44
	//*   2    3:icmpeq          43
			_reportUnexpectedChar(i, (new StringBuilder()).append("was expecting comma to separate ").append(_parsingContext.getTypeDesc()).append(" entries").toString());
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:new             #233 <Class StringBuilder>
	//    6   11:dup             
	//    7   12:invokespecial   #235 <Method void StringBuilder()>
	//    8   15:ldc2            #335 <String "was expecting comma to separate ">
	//    9   18:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:aload_0         
	//   11   22:getfield        #189 <Field JsonReadContext _parsingContext>
	//   12   25:invokevirtual   #308 <Method String JsonReadContext.getTypeDesc()>
	//   13   28:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   14   31:ldc2            #310 <String " entries">
	//   15   34:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   16   37:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   17   40:invokevirtual   #330 <Method void _reportUnexpectedChar(int, String)>
		do
		{
			if(_inputPtr >= _inputEnd)
				break;
	//   18   43:aload_0         
	//   19   44:getfield        #52  <Field int _inputPtr>
	//   20   47:aload_0         
	//   21   48:getfield        #55  <Field int _inputEnd>
	//   22   51:icmpge          170
			char ac[] = _inputBuffer;
	//   23   54:aload_0         
	//   24   55:getfield        #49  <Field char[] _inputBuffer>
	//   25   58:astore_2        
			i = _inputPtr;
	//   26   59:aload_0         
	//   27   60:getfield        #52  <Field int _inputPtr>
	//   28   63:istore_1        
			_inputPtr = i + 1;
	//   29   64:aload_0         
	//   30   65:iload_1         
	//   31   66:iconst_1        
	//   32   67:iadd            
	//   33   68:putfield        #52  <Field int _inputPtr>
			i = ((int) (ac[i]));
	//   34   71:aload_2         
	//   35   72:iload_1         
	//   36   73:caload          
	//   37   74:istore_1        
			if(i > 32)
	//*  38   75:iload_1         
	//*  39   76:bipush          32
	//*  40   78:icmple          110
				if(i == 47 || i == 35)
	//*  41   81:iload_1         
	//*  42   82:bipush          47
	//*  43   84:icmpeq          93
	//*  44   87:iload_1         
	//*  45   88:bipush          35
	//*  46   90:icmpne          108
				{
					_inputPtr = _inputPtr - 1;
	//   47   93:aload_0         
	//   48   94:aload_0         
	//   49   95:getfield        #52  <Field int _inputPtr>
	//   50   98:iconst_1        
	//   51   99:isub            
	//   52  100:putfield        #52  <Field int _inputPtr>
					return _skipAfterComma2();
	//   53  103:aload_0         
	//   54  104:invokespecial   #337 <Method int _skipAfterComma2()>
	//   55  107:ireturn         
				} else
				{
					return i;
	//   56  108:iload_1         
	//   57  109:ireturn         
				}
			if(i < 32)
	//*  58  110:iload_1         
	//*  59  111:bipush          32
	//*  60  113:icmpge          43
				if(i == 10)
	//*  61  116:iload_1         
	//*  62  117:bipush          10
	//*  63  119:icmpne          143
				{
					_currInputRow = _currInputRow + 1;
	//   64  122:aload_0         
	//   65  123:aload_0         
	//   66  124:getfield        #294 <Field int _currInputRow>
	//   67  127:iconst_1        
	//   68  128:iadd            
	//   69  129:putfield        #294 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   70  132:aload_0         
	//   71  133:aload_0         
	//   72  134:getfield        #52  <Field int _inputPtr>
	//   73  137:putfield        #297 <Field int _currInputRowStart>
				} else
	//*  74  140:goto            43
				if(i == 13)
	//*  75  143:iload_1         
	//*  76  144:bipush          13
	//*  77  146:icmpne          156
					_skipCR();
	//   78  149:aload_0         
	//   79  150:invokevirtual   #300 <Method void _skipCR()>
				else
	//*  80  153:goto            43
				if(i != 9)
	//*  81  156:iload_1         
	//*  82  157:bipush          9
	//*  83  159:icmpeq          43
					_throwInvalidSpace(i);
	//   84  162:aload_0         
	//   85  163:iload_1         
	//   86  164:invokevirtual   #303 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   87  167:goto            43
		return _skipAfterComma2();
	//   88  170:aload_0         
	//   89  171:invokespecial   #337 <Method int _skipAfterComma2()>
	//   90  174:ireturn         
	}

	private void _skipComment()
		throws IOException
	{
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #343 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_COMMENTS>
	//*   2    4:invokevirtual   #347 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   3    7:ifne            19
			_reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
	//    4   10:aload_0         
	//    5   11:bipush          47
	//    6   13:ldc2            #349 <String "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)">
	//    7   16:invokevirtual   #330 <Method void _reportUnexpectedChar(int, String)>
		if(_inputPtr >= _inputEnd && !loadMore())
	//*   8   19:aload_0         
	//*   9   20:getfield        #52  <Field int _inputPtr>
	//*  10   23:aload_0         
	//*  11   24:getfield        #55  <Field int _inputEnd>
	//*  12   27:icmplt          44
	//*  13   30:aload_0         
	//*  14   31:invokevirtual   #94  <Method boolean loadMore()>
	//*  15   34:ifne            44
			_reportInvalidEOF(" in a comment");
	//   16   37:aload_0         
	//   17   38:ldc2            #317 <String " in a comment">
	//   18   41:invokevirtual   #254 <Method void _reportInvalidEOF(String)>
		char ac[] = _inputBuffer;
	//   19   44:aload_0         
	//   20   45:getfield        #49  <Field char[] _inputBuffer>
	//   21   48:astore_2        
		int i = _inputPtr;
	//   22   49:aload_0         
	//   23   50:getfield        #52  <Field int _inputPtr>
	//   24   53:istore_1        
		_inputPtr = i + 1;
	//   25   54:aload_0         
	//   26   55:iload_1         
	//   27   56:iconst_1        
	//   28   57:iadd            
	//   29   58:putfield        #52  <Field int _inputPtr>
		i = ((int) (ac[i]));
	//   30   61:aload_2         
	//   31   62:iload_1         
	//   32   63:caload          
	//   33   64:istore_1        
		if(i == '/')
	//*  34   65:iload_1         
	//*  35   66:bipush          47
	//*  36   68:icmpne          76
		{
			_skipLine();
	//   37   71:aload_0         
	//   38   72:invokespecial   #352 <Method void _skipLine()>
			return;
	//   39   75:return          
		}
		if(i == '*')
	//*  40   76:iload_1         
	//*  41   77:bipush          42
	//*  42   79:icmpne          87
		{
			_skipCComment();
	//   43   82:aload_0         
	//   44   83:invokespecial   #354 <Method void _skipCComment()>
			return;
	//   45   86:return          
		} else
		{
			_reportUnexpectedChar(i, "was expecting either '*' or '/' for a comment");
	//   46   87:aload_0         
	//   47   88:iload_1         
	//   48   89:ldc2            #356 <String "was expecting either '*' or '/' for a comment">
	//   49   92:invokevirtual   #330 <Method void _reportUnexpectedChar(int, String)>
			return;
	//   50   95:return          
		}
	}

	private void _skipLine()
		throws IOException
	{
		do
		{
			int i;
label0:
			{
				if(_inputPtr < _inputEnd || loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #55  <Field int _inputEnd>
	//*   4    8:icmplt          18
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #94  <Method boolean loadMore()>
	//*   7   15:ifeq            69
				{
					char ac[] = _inputBuffer;
	//    8   18:aload_0         
	//    9   19:getfield        #49  <Field char[] _inputBuffer>
	//   10   22:astore_2        
					i = _inputPtr;
	//   11   23:aload_0         
	//   12   24:getfield        #52  <Field int _inputPtr>
	//   13   27:istore_1        
					_inputPtr = i + 1;
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:putfield        #52  <Field int _inputPtr>
					i = ((int) (ac[i]));
	//   19   35:aload_2         
	//   20   36:iload_1         
	//   21   37:caload          
	//   22   38:istore_1        
					if(i >= ' ')
						continue;
	//   23   39:iload_1         
	//   24   40:bipush          32
	//   25   42:icmpge          0
					if(i != '\n')
						break label0;
	//   26   45:iload_1         
	//   27   46:bipush          10
	//   28   48:icmpne          70
					_currInputRow = _currInputRow + 1;
	//   29   51:aload_0         
	//   30   52:aload_0         
	//   31   53:getfield        #294 <Field int _currInputRow>
	//   32   56:iconst_1        
	//   33   57:iadd            
	//   34   58:putfield        #294 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   35   61:aload_0         
	//   36   62:aload_0         
	//   37   63:getfield        #52  <Field int _inputPtr>
	//   38   66:putfield        #297 <Field int _currInputRowStart>
				}
				return;
	//   39   69:return          
			}
			if(i == '\r')
	//*  40   70:iload_1         
	//*  41   71:bipush          13
	//*  42   73:icmpne          81
			{
				_skipCR();
	//   43   76:aload_0         
	//   44   77:invokevirtual   #300 <Method void _skipCR()>
				return;
	//   45   80:return          
			}
			if(i != '\t')
	//*  46   81:iload_1         
	//*  47   82:bipush          9
	//*  48   84:icmpeq          0
				_throwInvalidSpace(i);
	//   49   87:aload_0         
	//   50   88:iload_1         
	//   51   89:invokevirtual   #303 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   52   92:goto            0
	}

	private final int _skipWSOrEnd()
		throws IOException
	{
		if(_inputPtr < _inputEnd || loadMore()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int _inputPtr>
	//    2    4:aload_0         
	//    3    5:getfield        #55  <Field int _inputEnd>
	//    4    8:icmplt          25
	//    5   11:aload_0         
	//    6   12:invokevirtual   #94  <Method boolean loadMore()>
	//    7   15:ifne            25
_L1:
		int i = _eofAsNextChar();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #360 <Method int _eofAsNextChar()>
	//   10   22:istore_1        
_L4:
		return i;
	//   11   23:iload_1         
	//   12   24:ireturn         
_L2:
		char c;
		char ac[] = _inputBuffer;
	//   13   25:aload_0         
	//   14   26:getfield        #49  <Field char[] _inputBuffer>
	//   15   29:astore_3        
		i = _inputPtr;
	//   16   30:aload_0         
	//   17   31:getfield        #52  <Field int _inputPtr>
	//   18   34:istore_1        
		_inputPtr = i + 1;
	//   19   35:aload_0         
	//   20   36:iload_1         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:putfield        #52  <Field int _inputPtr>
		c = ac[i];
	//   24   42:aload_3         
	//   25   43:iload_1         
	//   26   44:caload          
	//   27   45:istore_2        
		if(c <= ' ')
			break MISSING_BLOCK_LABEL_81;
	//   28   46:iload_2         
	//   29   47:bipush          32
	//   30   49:icmple          81
		if(c == '/')
			break; /* Loop/switch isn't completed */
	//   31   52:iload_2         
	//   32   53:bipush          47
	//   33   55:icmpeq          66
		i = ((int) (c));
	//   34   58:iload_2         
	//   35   59:istore_1        
		if(c != '#') goto _L4; else goto _L3
	//   36   60:iload_2         
	//   37   61:bipush          35
	//   38   63:icmpne          23
_L3:
		_inputPtr = _inputPtr - 1;
	//   39   66:aload_0         
	//   40   67:aload_0         
	//   41   68:getfield        #52  <Field int _inputPtr>
	//   42   71:iconst_1        
	//   43   72:isub            
	//   44   73:putfield        #52  <Field int _inputPtr>
		return _skipWSOrEnd2();
	//   45   76:aload_0         
	//   46   77:invokespecial   #363 <Method int _skipWSOrEnd2()>
	//   47   80:ireturn         
		char ac1[];
		if(c != ' ')
	//*  48   81:iload_2         
	//*  49   82:bipush          32
	//*  50   84:icmpeq          111
			if(c == '\n')
	//*  51   87:iload_2         
	//*  52   88:bipush          10
	//*  53   90:icmpne          178
			{
				_currInputRow = _currInputRow + 1;
	//   54   93:aload_0         
	//   55   94:aload_0         
	//   56   95:getfield        #294 <Field int _currInputRow>
	//   57   98:iconst_1        
	//   58   99:iadd            
	//   59  100:putfield        #294 <Field int _currInputRow>
				_currInputRowStart = _inputPtr;
	//   60  103:aload_0         
	//   61  104:aload_0         
	//   62  105:getfield        #52  <Field int _inputPtr>
	//   63  108:putfield        #297 <Field int _currInputRowStart>
			} else
	//*  64  111:aload_0         
	//*  65  112:getfield        #52  <Field int _inputPtr>
	//*  66  115:aload_0         
	//*  67  116:getfield        #55  <Field int _inputEnd>
	//*  68  119:icmpge          265
	//*  69  122:aload_0         
	//*  70  123:getfield        #49  <Field char[] _inputBuffer>
	//*  71  126:astore_3        
	//*  72  127:aload_0         
	//*  73  128:getfield        #52  <Field int _inputPtr>
	//*  74  131:istore_1        
	//*  75  132:aload_0         
	//*  76  133:iload_1         
	//*  77  134:iconst_1        
	//*  78  135:iadd            
	//*  79  136:putfield        #52  <Field int _inputPtr>
	//*  80  139:aload_3         
	//*  81  140:iload_1         
	//*  82  141:caload          
	//*  83  142:istore_2        
	//*  84  143:iload_2         
	//*  85  144:bipush          32
	//*  86  146:icmple          205
	//*  87  149:iload_2         
	//*  88  150:bipush          47
	//*  89  152:icmpeq          163
	//*  90  155:iload_2         
	//*  91  156:istore_1        
	//*  92  157:iload_2         
	//*  93  158:bipush          35
	//*  94  160:icmpne          23
	//*  95  163:aload_0         
	//*  96  164:aload_0         
	//*  97  165:getfield        #52  <Field int _inputPtr>
	//*  98  168:iconst_1        
	//*  99  169:isub            
	//* 100  170:putfield        #52  <Field int _inputPtr>
	//* 101  173:aload_0         
	//* 102  174:invokespecial   #363 <Method int _skipWSOrEnd2()>
	//* 103  177:ireturn         
			if(c == '\r')
	//* 104  178:iload_2         
	//* 105  179:bipush          13
	//* 106  181:icmpne          191
				_skipCR();
	//  107  184:aload_0         
	//  108  185:invokevirtual   #300 <Method void _skipCR()>
			else
	//* 109  188:goto            111
			if(c != '\t')
	//* 110  191:iload_2         
	//* 111  192:bipush          9
	//* 112  194:icmpeq          111
				_throwInvalidSpace(((int) (c)));
	//  113  197:aload_0         
	//  114  198:iload_2         
	//  115  199:invokevirtual   #303 <Method void _throwInvalidSpace(int)>
_L6:
		if(_inputPtr >= _inputEnd)
			break MISSING_BLOCK_LABEL_265;
		ac1 = _inputBuffer;
		i = _inputPtr;
		_inputPtr = i + 1;
		c = ac1[i];
		if(c <= ' ')
			break MISSING_BLOCK_LABEL_205;
		if(c == '/')
			break; /* Loop/switch isn't completed */
		i = ((int) (c));
		if(c != '#') goto _L4; else goto _L5
_L5:
		_inputPtr = _inputPtr - 1;
		return _skipWSOrEnd2();
	//* 116  202:goto            111
		if(c != ' ')
	//* 117  205:iload_2         
	//* 118  206:bipush          32
	//* 119  208:icmpeq          111
			if(c == '\n')
	//* 120  211:iload_2         
	//* 121  212:bipush          10
	//* 122  214:icmpne          238
			{
				_currInputRow = _currInputRow + 1;
	//  123  217:aload_0         
	//  124  218:aload_0         
	//  125  219:getfield        #294 <Field int _currInputRow>
	//  126  222:iconst_1        
	//  127  223:iadd            
	//  128  224:putfield        #294 <Field int _currInputRow>
				_currInputRowStart = _inputPtr;
	//  129  227:aload_0         
	//  130  228:aload_0         
	//  131  229:getfield        #52  <Field int _inputPtr>
	//  132  232:putfield        #297 <Field int _currInputRowStart>
			} else
	//* 133  235:goto            111
			if(c == '\r')
	//* 134  238:iload_2         
	//* 135  239:bipush          13
	//* 136  241:icmpne          251
				_skipCR();
	//  137  244:aload_0         
	//  138  245:invokevirtual   #300 <Method void _skipCR()>
			else
	//* 139  248:goto            111
			if(c != '\t')
	//* 140  251:iload_2         
	//* 141  252:bipush          9
	//* 142  254:icmpeq          111
				_throwInvalidSpace(((int) (c)));
	//  143  257:aload_0         
	//  144  258:iload_2         
	//  145  259:invokevirtual   #303 <Method void _throwInvalidSpace(int)>
		  goto _L6
	//* 146  262:goto            111
		return _skipWSOrEnd2();
	//  147  265:aload_0         
	//  148  266:invokespecial   #363 <Method int _skipWSOrEnd2()>
	//  149  269:ireturn         
	}

	private int _skipWSOrEnd2()
		throws IOException
	{
_L7:
		if(_inputPtr < _inputEnd || loadMore()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int _inputPtr>
	//    2    4:aload_0         
	//    3    5:getfield        #55  <Field int _inputEnd>
	//    4    8:icmplt          25
	//    5   11:aload_0         
	//    6   12:invokevirtual   #94  <Method boolean loadMore()>
	//    7   15:ifne            25
_L1:
		int i = _eofAsNextChar();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #360 <Method int _eofAsNextChar()>
	//   10   22:istore_1        
_L4:
		return i;
	//   11   23:iload_1         
	//   12   24:ireturn         
_L2:
		char c;
		char ac[] = _inputBuffer;
	//   13   25:aload_0         
	//   14   26:getfield        #49  <Field char[] _inputBuffer>
	//   15   29:astore_3        
		i = _inputPtr;
	//   16   30:aload_0         
	//   17   31:getfield        #52  <Field int _inputPtr>
	//   18   34:istore_1        
		_inputPtr = i + 1;
	//   19   35:aload_0         
	//   20   36:iload_1         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:putfield        #52  <Field int _inputPtr>
		c = ac[i];
	//   24   42:aload_3         
	//   25   43:iload_1         
	//   26   44:caload          
	//   27   45:istore_2        
		if(c <= ' ')
			break MISSING_BLOCK_LABEL_85;
	//   28   46:iload_2         
	//   29   47:bipush          32
	//   30   49:icmple          85
		if(c == '/')
	//*  31   52:iload_2         
	//*  32   53:bipush          47
	//*  33   55:icmpne          65
		{
			_skipComment();
	//   34   58:aload_0         
	//   35   59:invokespecial   #288 <Method void _skipComment()>
			break; /* Loop/switch isn't completed */
	//   36   62:goto            0
		}
		i = ((int) (c));
	//   37   65:iload_2         
	//   38   66:istore_1        
		if(c != '#') goto _L4; else goto _L3
	//   39   67:iload_2         
	//   40   68:bipush          35
	//   41   70:icmpne          23
_L3:
		i = ((int) (c));
	//   42   73:iload_2         
	//   43   74:istore_1        
		if(!_skipYAMLComment()) goto _L4; else goto _L5
	//   44   75:aload_0         
	//   45   76:invokespecial   #291 <Method boolean _skipYAMLComment()>
	//   46   79:ifeq            23
_L5:
		continue; /* Loop/switch isn't completed */
	//   47   82:goto            0
		if(c != ' ')
	//*  48   85:iload_2         
	//*  49   86:bipush          32
	//*  50   88:icmpeq          0
			if(c == '\n')
	//*  51   91:iload_2         
	//*  52   92:bipush          10
	//*  53   94:icmpne          118
			{
				_currInputRow = _currInputRow + 1;
	//   54   97:aload_0         
	//   55   98:aload_0         
	//   56   99:getfield        #294 <Field int _currInputRow>
	//   57  102:iconst_1        
	//   58  103:iadd            
	//   59  104:putfield        #294 <Field int _currInputRow>
				_currInputRowStart = _inputPtr;
	//   60  107:aload_0         
	//   61  108:aload_0         
	//   62  109:getfield        #52  <Field int _inputPtr>
	//   63  112:putfield        #297 <Field int _currInputRowStart>
			} else
	//*  64  115:goto            0
			if(c == '\r')
	//*  65  118:iload_2         
	//*  66  119:bipush          13
	//*  67  121:icmpne          131
				_skipCR();
	//   68  124:aload_0         
	//   69  125:invokevirtual   #300 <Method void _skipCR()>
			else
	//*  70  128:goto            0
			if(c != '\t')
	//*  71  131:iload_2         
	//*  72  132:bipush          9
	//*  73  134:icmpeq          0
				_throwInvalidSpace(((int) (c)));
	//   74  137:aload_0         
	//   75  138:iload_2         
	//   76  139:invokevirtual   #303 <Method void _throwInvalidSpace(int)>
		if(true) goto _L7; else goto _L6
	//   77  142:goto            0
_L6:
	}

	private boolean _skipYAMLComment()
		throws IOException
	{
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #366 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_YAML_COMMENTS>
	//*   2    4:invokevirtual   #347 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   3    7:ifne            12
		{
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		} else
		{
			_skipLine();
	//    6   12:aload_0         
	//    7   13:invokespecial   #352 <Method void _skipLine()>
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		}
	}

	private final void _updateLocation()
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int _inputPtr>
	//    2    4:istore_1        
		_tokenInputTotal = _currInputProcessed + (long)i;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #369 <Field long _currInputProcessed>
	//    6   10:iload_1         
	//    7   11:i2l             
	//    8   12:ladd            
	//    9   13:putfield        #372 <Field long _tokenInputTotal>
		_tokenInputRow = _currInputRow;
	//   10   16:aload_0         
	//   11   17:aload_0         
	//   12   18:getfield        #294 <Field int _currInputRow>
	//   13   21:putfield        #192 <Field int _tokenInputRow>
		_tokenInputCol = i - _currInputRowStart;
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:aload_0         
	//   17   27:getfield        #297 <Field int _currInputRowStart>
	//   18   30:isub            
	//   19   31:putfield        #195 <Field int _tokenInputCol>
	//   20   34:return          
	}

	private final void _updateNameLocation()
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int _inputPtr>
	//    2    4:istore_1        
		_nameStartOffset = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:i2l             
	//    6    8:putfield        #375 <Field long _nameStartOffset>
		_nameStartRow = _currInputRow;
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:getfield        #294 <Field int _currInputRow>
	//   10   16:putfield        #377 <Field int _nameStartRow>
		_nameStartCol = i - _currInputRowStart;
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:aload_0         
	//   14   22:getfield        #297 <Field int _currInputRowStart>
	//   15   25:isub            
	//   16   26:putfield        #379 <Field int _nameStartCol>
	//   17   29:return          
	}

	private char _verifyNLZ2()
		throws IOException
	{
		if(_inputPtr < _inputEnd || loadMore()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int _inputPtr>
	//    2    4:aload_0         
	//    3    5:getfield        #55  <Field int _inputEnd>
	//    4    8:icmplt          23
	//    5   11:aload_0         
	//    6   12:invokevirtual   #94  <Method boolean loadMore()>
	//    7   15:ifne            23
_L1:
		char c = '0';
	//    8   18:bipush          48
	//    9   20:istore_1        
_L4:
		return c;
	//   10   21:iload_1         
	//   11   22:ireturn         
_L2:
		char c1;
		c1 = _inputBuffer[_inputPtr];
	//   12   23:aload_0         
	//   13   24:getfield        #49  <Field char[] _inputBuffer>
	//   14   27:aload_0         
	//   15   28:getfield        #52  <Field int _inputPtr>
	//   16   31:caload          
	//   17   32:istore_2        
		if(c1 < '0' || c1 > '9')
	//*  18   33:iload_2         
	//*  19   34:bipush          48
	//*  20   36:icmplt          45
	//*  21   39:iload_2         
	//*  22   40:bipush          57
	//*  23   42:icmple          48
			return '0';
	//   24   45:bipush          48
	//   25   47:ireturn         
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS))
	//*  26   48:aload_0         
	//*  27   49:getstatic       #383 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NUMERIC_LEADING_ZEROS>
	//*  28   52:invokevirtual   #347 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  29   55:ifne            65
			reportInvalidNumber("Leading zeroes not allowed");
	//   30   58:aload_0         
	//   31   59:ldc2            #385 <String "Leading zeroes not allowed">
	//   32   62:invokevirtual   #388 <Method void reportInvalidNumber(String)>
		_inputPtr = _inputPtr + 1;
	//   33   65:aload_0         
	//   34   66:aload_0         
	//   35   67:getfield        #52  <Field int _inputPtr>
	//   36   70:iconst_1        
	//   37   71:iadd            
	//   38   72:putfield        #52  <Field int _inputPtr>
		c = c1;
	//   39   75:iload_2         
	//   40   76:istore_1        
		if(c1 != '0')
			continue; /* Loop/switch isn't completed */
	//   41   77:iload_2         
	//   42   78:bipush          48
	//   43   80:icmpne          21
		c = c1;
	//   44   83:iload_2         
	//   45   84:istore_1        
		do
		{
			if(_inputPtr >= _inputEnd && !loadMore())
				continue; /* Loop/switch isn't completed */
	//   46   85:aload_0         
	//   47   86:getfield        #52  <Field int _inputPtr>
	//   48   89:aload_0         
	//   49   90:getfield        #55  <Field int _inputEnd>
	//   50   93:icmplt          103
	//   51   96:aload_0         
	//   52   97:invokevirtual   #94  <Method boolean loadMore()>
	//   53  100:ifeq            21
			c1 = _inputBuffer[_inputPtr];
	//   54  103:aload_0         
	//   55  104:getfield        #49  <Field char[] _inputBuffer>
	//   56  107:aload_0         
	//   57  108:getfield        #52  <Field int _inputPtr>
	//   58  111:caload          
	//   59  112:istore_2        
			if(c1 < '0' || c1 > '9')
	//*  60  113:iload_2         
	//*  61  114:bipush          48
	//*  62  116:icmplt          125
	//*  63  119:iload_2         
	//*  64  120:bipush          57
	//*  65  122:icmple          128
				return '0';
	//   66  125:bipush          48
	//   67  127:ireturn         
			_inputPtr = _inputPtr + 1;
	//   68  128:aload_0         
	//   69  129:aload_0         
	//   70  130:getfield        #52  <Field int _inputPtr>
	//   71  133:iconst_1        
	//   72  134:iadd            
	//   73  135:putfield        #52  <Field int _inputPtr>
			c = c1;
	//   74  138:iload_2         
	//   75  139:istore_1        
		} while(c1 == '0');
	//   76  140:iload_2         
	//   77  141:bipush          48
	//   78  143:icmpeq          85
		break; /* Loop/switch isn't completed */
		if(true) goto _L4; else goto _L3
_L3:
		return c1;
	//   79  146:iload_2         
	//   80  147:ireturn         
	}

	private final char _verifyNoLeadingZeroes()
		throws IOException
	{
		if(_inputPtr < _inputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #55  <Field int _inputEnd>
	//*   4    8:icmpge          36
		{
			char c = _inputBuffer[_inputPtr];
	//    5   11:aload_0         
	//    6   12:getfield        #49  <Field char[] _inputBuffer>
	//    7   15:aload_0         
	//    8   16:getfield        #52  <Field int _inputPtr>
	//    9   19:caload          
	//   10   20:istore_1        
			if(c < '0' || c > '9')
	//*  11   21:iload_1         
	//*  12   22:bipush          48
	//*  13   24:icmplt          33
	//*  14   27:iload_1         
	//*  15   28:bipush          57
	//*  16   30:icmple          36
				return '0';
	//   17   33:bipush          48
	//   18   35:ireturn         
		}
		return _verifyNLZ2();
	//   19   36:aload_0         
	//   20   37:invokespecial   #390 <Method char _verifyNLZ2()>
	//   21   40:ireturn         
	}

	private final void _verifyRootSpace(int i)
		throws IOException
	{
		_inputPtr = _inputPtr + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #52  <Field int _inputPtr>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #52  <Field int _inputPtr>
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
	//   10   54:invokevirtual   #393 <Method void _reportMissingRootWS(int)>
			// fall through

		case 9: // '\t'
		case 32: // ' '
			return;
	//   11   57:return          

		case 13: // '\r'
			_skipCR();
	//   12   58:aload_0         
	//   13   59:invokevirtual   #300 <Method void _skipCR()>
			return;
	//   14   62:return          

		case 10: // '\n'
			_currInputRow = _currInputRow + 1;
	//   15   63:aload_0         
	//   16   64:aload_0         
	//   17   65:getfield        #294 <Field int _currInputRow>
	//   18   68:iconst_1        
	//   19   69:iadd            
	//   20   70:putfield        #294 <Field int _currInputRow>
			_currInputRowStart = _inputPtr;
	//   21   73:aload_0         
	//   22   74:aload_0         
	//   23   75:getfield        #52  <Field int _inputPtr>
	//   24   78:putfield        #297 <Field int _currInputRowStart>
			return;
	//   25   81:return          
		}
	}

	protected void _closeInput()
		throws IOException
	{
		if(_reader != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Reader _reader>
	//*   2    4:ifnull          39
		{
			if(_ioContext.isResourceManaged() || isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE))
	//*   3    7:aload_0         
	//*   4    8:getfield        #398 <Field IOContext _ioContext>
	//*   5   11:invokevirtual   #401 <Method boolean IOContext.isResourceManaged()>
	//*   6   14:ifne            27
	//*   7   17:aload_0         
	//*   8   18:getstatic       #404 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.AUTO_CLOSE_SOURCE>
	//*   9   21:invokevirtual   #347 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  10   24:ifeq            34
				_reader.close();
	//   11   27:aload_0         
	//   12   28:getfield        #41  <Field Reader _reader>
	//   13   31:invokevirtual   #409 <Method void Reader.close()>
			_reader = null;
	//   14   34:aload_0         
	//   15   35:aconst_null     
	//   16   36:putfield        #41  <Field Reader _reader>
		}
	//   17   39:return          
	}

	protected byte[] _decodeBase64(Base64Variant base64variant)
		throws IOException
	{
		ByteArrayBuilder bytearraybuilder = _getByteArrayBuilder();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #415 <Method ByteArrayBuilder _getByteArrayBuilder()>
	//    2    4:astore          7
		do
		{
			char c;
			do
			{
				if(_inputPtr >= _inputEnd)
	//*   3    6:aload_0         
	//*   4    7:getfield        #52  <Field int _inputPtr>
	//*   5   10:aload_0         
	//*   6   11:getfield        #55  <Field int _inputEnd>
	//*   7   14:icmplt          21
					loadMoreGuaranteed();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #325 <Method void loadMoreGuaranteed()>
				char ac[] = _inputBuffer;
	//   10   21:aload_0         
	//   11   22:getfield        #49  <Field char[] _inputBuffer>
	//   12   25:astore          8
				int i = _inputPtr;
	//   13   27:aload_0         
	//   14   28:getfield        #52  <Field int _inputPtr>
	//   15   31:istore_3        
				_inputPtr = i + 1;
	//   16   32:aload_0         
	//   17   33:iload_3         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:putfield        #52  <Field int _inputPtr>
				c = ac[i];
	//   21   39:aload           8
	//   22   41:iload_3         
	//   23   42:caload          
	//   24   43:istore_2        
			} while(c <= ' ');
	//   25   44:iload_2         
	//   26   45:bipush          32
	//   27   47:icmple          6
			int l = base64variant.decodeBase64Char(c);
	//   28   50:aload_1         
	//   29   51:iload_2         
	//   30   52:invokevirtual   #421 <Method int Base64Variant.decodeBase64Char(char)>
	//   31   55:istore          4
			int j = l;
	//   32   57:iload           4
	//   33   59:istore_3        
			if(l < 0)
	//*  34   60:iload           4
	//*  35   62:ifge            89
			{
				if(c == '"')
	//*  36   65:iload_2         
	//*  37   66:bipush          34
	//*  38   68:icmpne          77
					return bytearraybuilder.toByteArray();
	//   39   71:aload           7
	//   40   73:invokevirtual   #427 <Method byte[] ByteArrayBuilder.toByteArray()>
	//   41   76:areturn         
				j = _decodeBase64Escape(base64variant, c, 0);
	//   42   77:aload_0         
	//   43   78:aload_1         
	//   44   79:iload_2         
	//   45   80:iconst_0        
	//   46   81:invokevirtual   #431 <Method int _decodeBase64Escape(Base64Variant, char, int)>
	//   47   84:istore_3        
				if(j < 0)
					continue;
	//   48   85:iload_3         
	//   49   86:iflt            6
			}
			if(_inputPtr >= _inputEnd)
	//*  50   89:aload_0         
	//*  51   90:getfield        #52  <Field int _inputPtr>
	//*  52   93:aload_0         
	//*  53   94:getfield        #55  <Field int _inputEnd>
	//*  54   97:icmplt          104
				loadMoreGuaranteed();
	//   55  100:aload_0         
	//   56  101:invokevirtual   #325 <Method void loadMoreGuaranteed()>
			char ac1[] = _inputBuffer;
	//   57  104:aload_0         
	//   58  105:getfield        #49  <Field char[] _inputBuffer>
	//   59  108:astore          8
			l = _inputPtr;
	//   60  110:aload_0         
	//   61  111:getfield        #52  <Field int _inputPtr>
	//   62  114:istore          4
			_inputPtr = l + 1;
	//   63  116:aload_0         
	//   64  117:iload           4
	//   65  119:iconst_1        
	//   66  120:iadd            
	//   67  121:putfield        #52  <Field int _inputPtr>
			c = ac1[l];
	//   68  124:aload           8
	//   69  126:iload           4
	//   70  128:caload          
	//   71  129:istore_2        
			int i1 = base64variant.decodeBase64Char(c);
	//   72  130:aload_1         
	//   73  131:iload_2         
	//   74  132:invokevirtual   #421 <Method int Base64Variant.decodeBase64Char(char)>
	//   75  135:istore          5
			l = i1;
	//   76  137:iload           5
	//   77  139:istore          4
			if(i1 < 0)
	//*  78  141:iload           5
	//*  79  143:ifge            155
				l = _decodeBase64Escape(base64variant, c, 1);
	//   80  146:aload_0         
	//   81  147:aload_1         
	//   82  148:iload_2         
	//   83  149:iconst_1        
	//   84  150:invokevirtual   #431 <Method int _decodeBase64Escape(Base64Variant, char, int)>
	//   85  153:istore          4
			int j1 = j << 6 | l;
	//   86  155:iload_3         
	//   87  156:bipush          6
	//   88  158:ishl            
	//   89  159:iload           4
	//   90  161:ior             
	//   91  162:istore          6
			if(_inputPtr >= _inputEnd)
	//*  92  164:aload_0         
	//*  93  165:getfield        #52  <Field int _inputPtr>
	//*  94  168:aload_0         
	//*  95  169:getfield        #55  <Field int _inputEnd>
	//*  96  172:icmplt          179
				loadMoreGuaranteed();
	//   97  175:aload_0         
	//   98  176:invokevirtual   #325 <Method void loadMoreGuaranteed()>
			ac1 = _inputBuffer;
	//   99  179:aload_0         
	//  100  180:getfield        #49  <Field char[] _inputBuffer>
	//  101  183:astore          8
			j = _inputPtr;
	//  102  185:aload_0         
	//  103  186:getfield        #52  <Field int _inputPtr>
	//  104  189:istore_3        
			_inputPtr = j + 1;
	//  105  190:aload_0         
	//  106  191:iload_3         
	//  107  192:iconst_1        
	//  108  193:iadd            
	//  109  194:putfield        #52  <Field int _inputPtr>
			c = ac1[j];
	//  110  197:aload           8
	//  111  199:iload_3         
	//  112  200:caload          
	//  113  201:istore_2        
			l = base64variant.decodeBase64Char(c);
	//  114  202:aload_1         
	//  115  203:iload_2         
	//  116  204:invokevirtual   #421 <Method int Base64Variant.decodeBase64Char(char)>
	//  117  207:istore          4
			i1 = l;
	//  118  209:iload           4
	//  119  211:istore          5
			if(l < 0)
	//* 120  213:iload           4
	//* 121  215:ifge            368
			{
				j = l;
	//  122  218:iload           4
	//  123  220:istore_3        
				if(l != -2)
	//* 124  221:iload           4
	//* 125  223:bipush          -2
	//* 126  225:icmpeq          264
				{
					if(c == '"' && !base64variant.usesPadding())
	//* 127  228:iload_2         
	//* 128  229:bipush          34
	//* 129  231:icmpne          256
	//* 130  234:aload_1         
	//* 131  235:invokevirtual   #434 <Method boolean Base64Variant.usesPadding()>
	//* 132  238:ifne            256
					{
						bytearraybuilder.append(j1 >> 4);
	//  133  241:aload           7
	//  134  243:iload           6
	//  135  245:iconst_4        
	//  136  246:ishr            
	//  137  247:invokevirtual   #436 <Method void ByteArrayBuilder.append(int)>
						return bytearraybuilder.toByteArray();
	//  138  250:aload           7
	//  139  252:invokevirtual   #427 <Method byte[] ByteArrayBuilder.toByteArray()>
	//  140  255:areturn         
					}
					j = _decodeBase64Escape(base64variant, c, 2);
	//  141  256:aload_0         
	//  142  257:aload_1         
	//  143  258:iload_2         
	//  144  259:iconst_2        
	//  145  260:invokevirtual   #431 <Method int _decodeBase64Escape(Base64Variant, char, int)>
	//  146  263:istore_3        
				}
				i1 = j;
	//  147  264:iload_3         
	//  148  265:istore          5
				if(j == -2)
	//* 149  267:iload_3         
	//* 150  268:bipush          -2
	//* 151  270:icmpne          368
				{
					if(_inputPtr >= _inputEnd)
	//* 152  273:aload_0         
	//* 153  274:getfield        #52  <Field int _inputPtr>
	//* 154  277:aload_0         
	//* 155  278:getfield        #55  <Field int _inputEnd>
	//* 156  281:icmplt          288
						loadMoreGuaranteed();
	//  157  284:aload_0         
	//  158  285:invokevirtual   #325 <Method void loadMoreGuaranteed()>
					ac1 = _inputBuffer;
	//  159  288:aload_0         
	//  160  289:getfield        #49  <Field char[] _inputBuffer>
	//  161  292:astore          8
					j = _inputPtr;
	//  162  294:aload_0         
	//  163  295:getfield        #52  <Field int _inputPtr>
	//  164  298:istore_3        
					_inputPtr = j + 1;
	//  165  299:aload_0         
	//  166  300:iload_3         
	//  167  301:iconst_1        
	//  168  302:iadd            
	//  169  303:putfield        #52  <Field int _inputPtr>
					c = ac1[j];
	//  170  306:aload           8
	//  171  308:iload_3         
	//  172  309:caload          
	//  173  310:istore_2        
					if(!base64variant.usesPaddingChar(c))
	//* 174  311:aload_1         
	//* 175  312:iload_2         
	//* 176  313:invokevirtual   #439 <Method boolean Base64Variant.usesPaddingChar(char)>
	//* 177  316:ifne            356
						throw reportInvalidBase64Char(base64variant, ((int) (c)), 3, (new StringBuilder()).append("expected padding character '").append(base64variant.getPaddingChar()).append("'").toString());
	//  178  319:aload_0         
	//  179  320:aload_1         
	//  180  321:iload_2         
	//  181  322:iconst_3        
	//  182  323:new             #233 <Class StringBuilder>
	//  183  326:dup             
	//  184  327:invokespecial   #235 <Method void StringBuilder()>
	//  185  330:ldc2            #441 <String "expected padding character '">
	//  186  333:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//  187  336:aload_1         
	//  188  337:invokevirtual   #444 <Method char Base64Variant.getPaddingChar()>
	//  189  340:invokevirtual   #244 <Method StringBuilder StringBuilder.append(char)>
	//  190  343:ldc2            #446 <String "'">
	//  191  346:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//  192  349:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  193  352:invokevirtual   #450 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int, String)>
	//  194  355:athrow          
					bytearraybuilder.append(j1 >> 4);
	//  195  356:aload           7
	//  196  358:iload           6
	//  197  360:iconst_4        
	//  198  361:ishr            
	//  199  362:invokevirtual   #436 <Method void ByteArrayBuilder.append(int)>
					continue;
	//  200  365:goto            6
				}
			}
			j1 = j1 << 6 | i1;
	//  201  368:iload           6
	//  202  370:bipush          6
	//  203  372:ishl            
	//  204  373:iload           5
	//  205  375:ior             
	//  206  376:istore          6
			if(_inputPtr >= _inputEnd)
	//* 207  378:aload_0         
	//* 208  379:getfield        #52  <Field int _inputPtr>
	//* 209  382:aload_0         
	//* 210  383:getfield        #55  <Field int _inputEnd>
	//* 211  386:icmplt          393
				loadMoreGuaranteed();
	//  212  389:aload_0         
	//  213  390:invokevirtual   #325 <Method void loadMoreGuaranteed()>
			ac1 = _inputBuffer;
	//  214  393:aload_0         
	//  215  394:getfield        #49  <Field char[] _inputBuffer>
	//  216  397:astore          8
			j = _inputPtr;
	//  217  399:aload_0         
	//  218  400:getfield        #52  <Field int _inputPtr>
	//  219  403:istore_3        
			_inputPtr = j + 1;
	//  220  404:aload_0         
	//  221  405:iload_3         
	//  222  406:iconst_1        
	//  223  407:iadd            
	//  224  408:putfield        #52  <Field int _inputPtr>
			c = ac1[j];
	//  225  411:aload           8
	//  226  413:iload_3         
	//  227  414:caload          
	//  228  415:istore_2        
			l = base64variant.decodeBase64Char(c);
	//  229  416:aload_1         
	//  230  417:iload_2         
	//  231  418:invokevirtual   #421 <Method int Base64Variant.decodeBase64Char(char)>
	//  232  421:istore          4
			i1 = l;
	//  233  423:iload           4
	//  234  425:istore          5
			if(l < 0)
	//* 235  427:iload           4
	//* 236  429:ifge            499
			{
				int k = l;
	//  237  432:iload           4
	//  238  434:istore_3        
				if(l != -2)
	//* 239  435:iload           4
	//* 240  437:bipush          -2
	//* 241  439:icmpeq          478
				{
					if(c == '"' && !base64variant.usesPadding())
	//* 242  442:iload_2         
	//* 243  443:bipush          34
	//* 244  445:icmpne          470
	//* 245  448:aload_1         
	//* 246  449:invokevirtual   #434 <Method boolean Base64Variant.usesPadding()>
	//* 247  452:ifne            470
					{
						bytearraybuilder.appendTwoBytes(j1 >> 2);
	//  248  455:aload           7
	//  249  457:iload           6
	//  250  459:iconst_2        
	//  251  460:ishr            
	//  252  461:invokevirtual   #453 <Method void ByteArrayBuilder.appendTwoBytes(int)>
						return bytearraybuilder.toByteArray();
	//  253  464:aload           7
	//  254  466:invokevirtual   #427 <Method byte[] ByteArrayBuilder.toByteArray()>
	//  255  469:areturn         
					}
					k = _decodeBase64Escape(base64variant, c, 3);
	//  256  470:aload_0         
	//  257  471:aload_1         
	//  258  472:iload_2         
	//  259  473:iconst_3        
	//  260  474:invokevirtual   #431 <Method int _decodeBase64Escape(Base64Variant, char, int)>
	//  261  477:istore_3        
				}
				i1 = k;
	//  262  478:iload_3         
	//  263  479:istore          5
				if(k == -2)
	//* 264  481:iload_3         
	//* 265  482:bipush          -2
	//* 266  484:icmpne          499
				{
					bytearraybuilder.appendTwoBytes(j1 >> 2);
	//  267  487:aload           7
	//  268  489:iload           6
	//  269  491:iconst_2        
	//  270  492:ishr            
	//  271  493:invokevirtual   #453 <Method void ByteArrayBuilder.appendTwoBytes(int)>
					continue;
	//  272  496:goto            6
				}
			}
			bytearraybuilder.appendThreeBytes(j1 << 6 | i1);
	//  273  499:aload           7
	//  274  501:iload           6
	//  275  503:bipush          6
	//  276  505:ishl            
	//  277  506:iload           5
	//  278  508:ior             
	//  279  509:invokevirtual   #456 <Method void ByteArrayBuilder.appendThreeBytes(int)>
		} while(true);
	//  280  512:goto            6
	}

	protected char _decodeEscaped()
		throws IOException
	{
		if(_inputPtr >= _inputEnd && !loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #55  <Field int _inputEnd>
	//*   4    8:icmplt          25
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #94  <Method boolean loadMore()>
	//*   7   15:ifne            25
			_reportInvalidEOF(" in character escape sequence");
	//    8   18:aload_0         
	//    9   19:ldc2            #458 <String " in character escape sequence">
	//   10   22:invokevirtual   #254 <Method void _reportInvalidEOF(String)>
		char ac[] = _inputBuffer;
	//   11   25:aload_0         
	//   12   26:getfield        #49  <Field char[] _inputBuffer>
	//   13   29:astore          7
		int i = _inputPtr;
	//   14   31:aload_0         
	//   15   32:getfield        #52  <Field int _inputPtr>
	//   16   35:istore_3        
		_inputPtr = i + 1;
	//   17   36:aload_0         
	//   18   37:iload_3         
	//   19   38:iconst_1        
	//   20   39:iadd            
	//   21   40:putfield        #52  <Field int _inputPtr>
		char c1 = ac[i];
	//   22   43:aload           7
	//   23   45:iload_3         
	//   24   46:caload          
	//   25   47:istore_2        
		char c = c1;
	//   26   48:iload_2         
	//   27   49:istore_1        
		int k;
		switch(c1)
	//*  28   50:iload_2         
		{
	//*  29   51:lookupswitch    9: default 132
	//	               34: 138
	//	               47: 138
	//	               92: 138
	//	               98: 140
	//	               102: 149
	//	               110: 146
	//	               114: 152
	//	               116: 143
	//	               117: 155
		default:
			c = _handleUnrecognizedCharacterEscape(c1);
	//   30  132:aload_0         
	//   31  133:iload_2         
	//   32  134:invokevirtual   #462 <Method char _handleUnrecognizedCharacterEscape(char)>
	//   33  137:istore_1        
			// fall through

		case 34: // '"'
		case 47: // '/'
		case 92: // '\\'
			return c;
	//   34  138:iload_1         
	//   35  139:ireturn         

		case 98: // 'b'
			return '\b';
	//   36  140:bipush          8
	//   37  142:ireturn         

		case 116: // 't'
			return '\t';
	//   38  143:bipush          9
	//   39  145:ireturn         

		case 110: // 'n'
			return '\n';
	//   40  146:bipush          10
	//   41  148:ireturn         

		case 102: // 'f'
			return '\f';
	//   42  149:bipush          12
	//   43  151:ireturn         

		case 114: // 'r'
			return '\r';
	//   44  152:bipush          13
	//   45  154:ireturn         

		case 117: // 'u'
			k = 0;
	//   46  155:iconst_0        
	//   47  156:istore          4
			break;
		}
		for(int j = 0; j < 4; j++)
	//*  48  158:iconst_0        
	//*  49  159:istore_3        
	//*  50  160:iload_3         
	//*  51  161:iconst_4        
	//*  52  162:icmpge          254
		{
			if(_inputPtr >= _inputEnd && !loadMore())
	//*  53  165:aload_0         
	//*  54  166:getfield        #52  <Field int _inputPtr>
	//*  55  169:aload_0         
	//*  56  170:getfield        #55  <Field int _inputEnd>
	//*  57  173:icmplt          190
	//*  58  176:aload_0         
	//*  59  177:invokevirtual   #94  <Method boolean loadMore()>
	//*  60  180:ifne            190
				_reportInvalidEOF(" in character escape sequence");
	//   61  183:aload_0         
	//   62  184:ldc2            #458 <String " in character escape sequence">
	//   63  187:invokevirtual   #254 <Method void _reportInvalidEOF(String)>
			char ac1[] = _inputBuffer;
	//   64  190:aload_0         
	//   65  191:getfield        #49  <Field char[] _inputBuffer>
	//   66  194:astore          7
			int l = _inputPtr;
	//   67  196:aload_0         
	//   68  197:getfield        #52  <Field int _inputPtr>
	//   69  200:istore          5
			_inputPtr = l + 1;
	//   70  202:aload_0         
	//   71  203:iload           5
	//   72  205:iconst_1        
	//   73  206:iadd            
	//   74  207:putfield        #52  <Field int _inputPtr>
			l = ((int) (ac1[l]));
	//   75  210:aload           7
	//   76  212:iload           5
	//   77  214:caload          
	//   78  215:istore          5
			int i1 = CharTypes.charToHex(l);
	//   79  217:iload           5
	//   80  219:invokestatic    #465 <Method int CharTypes.charToHex(int)>
	//   81  222:istore          6
			if(i1 < 0)
	//*  82  224:iload           6
	//*  83  226:ifge            238
				_reportUnexpectedChar(l, "expected a hex-digit for character escape sequence");
	//   84  229:aload_0         
	//   85  230:iload           5
	//   86  232:ldc2            #467 <String "expected a hex-digit for character escape sequence">
	//   87  235:invokevirtual   #330 <Method void _reportUnexpectedChar(int, String)>
			k = k << 4 | i1;
	//   88  238:iload           4
	//   89  240:iconst_4        
	//   90  241:ishl            
	//   91  242:iload           6
	//   92  244:ior             
	//   93  245:istore          4
		}

	//   94  247:iload_3         
	//   95  248:iconst_1        
	//   96  249:iadd            
	//   97  250:istore_3        
	//*  98  251:goto            160
		return (char)k;
	//   99  254:iload           4
	//  100  256:int2char        
	//  101  257:ireturn         
	}

	protected final void _finishString()
		throws IOException
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int _inputPtr>
	//    2    4:istore_1        
		int k = _inputEnd;
	//    3    5:aload_0         
	//    4    6:getfield        #55  <Field int _inputEnd>
	//    5    9:istore_3        
		int j = i;
	//    6   10:iload_1         
	//    7   11:istore_2        
		if(i < k)
	//*   8   12:iload_1         
	//*   9   13:iload_3         
	//*  10   14:icmpge          99
		{
			int ai[] = _icLatin1;
	//   11   17:getstatic       #33  <Field int[] _icLatin1>
	//   12   20:astore          6
			int l = ai.length;
	//   13   22:aload           6
	//   14   24:arraylength     
	//   15   25:istore          4
			do
			{
				char c = _inputBuffer[i];
	//   16   27:aload_0         
	//   17   28:getfield        #49  <Field char[] _inputBuffer>
	//   18   31:iload_1         
	//   19   32:caload          
	//   20   33:istore          5
				if(c < l && ai[c] != 0)
	//*  21   35:iload           5
	//*  22   37:iload           4
	//*  23   39:icmpge          88
	//*  24   42:aload           6
	//*  25   44:iload           5
	//*  26   46:iaload          
	//*  27   47:ifeq            88
				{
					j = i;
	//   28   50:iload_1         
	//   29   51:istore_2        
					if(c == '"')
	//*  30   52:iload           5
	//*  31   54:bipush          34
	//*  32   56:icmpne          99
					{
						_textBuffer.resetWithShared(_inputBuffer, _inputPtr, i - _inputPtr);
	//   33   59:aload_0         
	//   34   60:getfield        #78  <Field TextBuffer _textBuffer>
	//   35   63:aload_0         
	//   36   64:getfield        #49  <Field char[] _inputBuffer>
	//   37   67:aload_0         
	//   38   68:getfield        #52  <Field int _inputPtr>
	//   39   71:iload_1         
	//   40   72:aload_0         
	//   41   73:getfield        #52  <Field int _inputPtr>
	//   42   76:isub            
	//   43   77:invokevirtual   #84  <Method void TextBuffer.resetWithShared(char[], int, int)>
						_inputPtr = i + 1;
	//   44   80:aload_0         
	//   45   81:iload_1         
	//   46   82:iconst_1        
	//   47   83:iadd            
	//   48   84:putfield        #52  <Field int _inputPtr>
						return;
	//   49   87:return          
					}
					break;
				}
				j = i + 1;
	//   50   88:iload_1         
	//   51   89:iconst_1        
	//   52   90:iadd            
	//   53   91:istore_2        
				i = j;
	//   54   92:iload_2         
	//   55   93:istore_1        
			} while(j < k);
	//   56   94:iload_2         
	//   57   95:iload_3         
	//   58   96:icmplt          27
		}
		_textBuffer.resetWithCopy(_inputBuffer, _inputPtr, j - _inputPtr);
	//   59   99:aload_0         
	//   60  100:getfield        #78  <Field TextBuffer _textBuffer>
	//   61  103:aload_0         
	//   62  104:getfield        #49  <Field char[] _inputBuffer>
	//   63  107:aload_0         
	//   64  108:getfield        #52  <Field int _inputPtr>
	//   65  111:iload_2         
	//   66  112:aload_0         
	//   67  113:getfield        #52  <Field int _inputPtr>
	//   68  116:isub            
	//   69  117:invokevirtual   #471 <Method void TextBuffer.resetWithCopy(char[], int, int)>
		_inputPtr = j;
	//   70  120:aload_0         
	//   71  121:iload_2         
	//   72  122:putfield        #52  <Field int _inputPtr>
		_finishString2();
	//   73  125:aload_0         
	//   74  126:invokevirtual   #474 <Method void _finishString2()>
	//   75  129:return          
	}

	protected void _finishString2()
		throws IOException
	{
		int i;
		int l;
		char ac[];
		int ai[];
		ac = _textBuffer.getCurrentSegment();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #87  <Method char[] TextBuffer.getCurrentSegment()>
	//    3    7:astore          6
		i = _textBuffer.getCurrentSegmentSize();
	//    4    9:aload_0         
	//    5   10:getfield        #78  <Field TextBuffer _textBuffer>
	//    6   13:invokevirtual   #90  <Method int TextBuffer.getCurrentSegmentSize()>
	//    7   16:istore_3        
		ai = _icLatin1;
	//    8   17:getstatic       #33  <Field int[] _icLatin1>
	//    9   20:astore          8
		l = ai.length;
	//   10   22:aload           8
	//   11   24:arraylength     
	//   12   25:istore          5
_L2:
		char c;
		char c1;
		if(_inputPtr >= _inputEnd && !loadMore())
	//*  13   27:aload_0         
	//*  14   28:getfield        #52  <Field int _inputPtr>
	//*  15   31:aload_0         
	//*  16   32:getfield        #55  <Field int _inputEnd>
	//*  17   35:icmplt          52
	//*  18   38:aload_0         
	//*  19   39:invokevirtual   #94  <Method boolean loadMore()>
	//*  20   42:ifne            52
			_reportInvalidEOF(": was expecting closing quote for a string value");
	//   21   45:aload_0         
	//   22   46:ldc2            #476 <String ": was expecting closing quote for a string value">
	//   23   49:invokevirtual   #254 <Method void _reportInvalidEOF(String)>
		char ac1[] = _inputBuffer;
	//   24   52:aload_0         
	//   25   53:getfield        #49  <Field char[] _inputBuffer>
	//   26   56:astore          7
		int j = _inputPtr;
	//   27   58:aload_0         
	//   28   59:getfield        #52  <Field int _inputPtr>
	//   29   62:istore          4
		_inputPtr = j + 1;
	//   30   64:aload_0         
	//   31   65:iload           4
	//   32   67:iconst_1        
	//   33   68:iadd            
	//   34   69:putfield        #52  <Field int _inputPtr>
		c1 = ac1[j];
	//   35   72:aload           7
	//   36   74:iload           4
	//   37   76:caload          
	//   38   77:istore_2        
		c = c1;
	//   39   78:iload_2         
	//   40   79:istore_1        
		if(c1 < l)
	//*  41   80:iload_2         
	//*  42   81:iload           5
	//*  43   83:icmpge          121
		{
			c = c1;
	//   44   86:iload_2         
	//   45   87:istore_1        
			if(ai[c1] != 0)
	//*  46   88:aload           8
	//*  47   90:iload_2         
	//*  48   91:iaload          
	//*  49   92:ifeq            121
			{
				if(c1 == '"')
	//*  50   95:iload_2         
	//*  51   96:bipush          34
	//*  52   98:icmpne          110
				{
					_textBuffer.setCurrentLength(i);
	//   53  101:aload_0         
	//   54  102:getfield        #78  <Field TextBuffer _textBuffer>
	//   55  105:iload_3         
	//   56  106:invokevirtual   #98  <Method void TextBuffer.setCurrentLength(int)>
					return;
	//   57  109:return          
				}
				if(c1 != '\\')
					break; /* Loop/switch isn't completed */
	//   58  110:iload_2         
	//   59  111:bipush          92
	//   60  113:icmpne          165
				c = _decodeEscaped();
	//   61  116:aload_0         
	//   62  117:invokevirtual   #258 <Method char _decodeEscaped()>
	//   63  120:istore_1        
			}
		}
_L3:
		char ac2[] = ac;
	//   64  121:aload           6
	//   65  123:astore          7
		int k = i;
	//   66  125:iload_3         
	//   67  126:istore          4
		if(i >= ac.length)
	//*  68  128:iload_3         
	//*  69  129:aload           6
	//*  70  131:arraylength     
	//*  71  132:icmplt          147
		{
			ac2 = _textBuffer.finishCurrentSegment();
	//   72  135:aload_0         
	//   73  136:getfield        #78  <Field TextBuffer _textBuffer>
	//   74  139:invokevirtual   #114 <Method char[] TextBuffer.finishCurrentSegment()>
	//   75  142:astore          7
			k = 0;
	//   76  144:iconst_0        
	//   77  145:istore          4
		}
		ac2[k] = c;
	//   78  147:aload           7
	//   79  149:iload           4
	//   80  151:iload_1         
	//   81  152:castore         
		i = k + 1;
	//   82  153:iload           4
	//   83  155:iconst_1        
	//   84  156:iadd            
	//   85  157:istore_3        
		ac = ac2;
	//   86  158:aload           7
	//   87  160:astore          6
		if(true) goto _L2; else goto _L1
	//   88  162:goto            27
_L1:
		c = c1;
	//   89  165:iload_2         
	//   90  166:istore_1        
		if(c1 < ' ')
	//*  91  167:iload_2         
	//*  92  168:bipush          32
	//*  93  170:icmpge          121
		{
			_throwUnquotedSpace(((int) (c1)), "string value");
	//   94  173:aload_0         
	//   95  174:iload_2         
	//   96  175:ldc2            #478 <String "string value">
	//   97  178:invokevirtual   #263 <Method void _throwUnquotedSpace(int, String)>
			c = c1;
	//   98  181:iload_2         
	//   99  182:istore_1        
		}
		  goto _L3
		if(true) goto _L2; else goto _L4
_L4:
	//* 100  183:goto            121
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
	//*   5    7:invokevirtual   #483 <Method int JsonToken.id()>
		{
	//*   6   10:tableswitch     5 8: default 40
	//	               5 45
	//	               6 53
	//	               7 53
	//	               8 53
		default:
			return jsontoken.asString();
	//    7   40:aload_1         
	//    8   41:invokevirtual   #486 <Method String JsonToken.asString()>
	//    9   44:areturn         

		case 5: // '\005'
			return _parsingContext.getCurrentName();
	//   10   45:aload_0         
	//   11   46:getfield        #189 <Field JsonReadContext _parsingContext>
	//   12   49:invokevirtual   #489 <Method String JsonReadContext.getCurrentName()>
	//   13   52:areturn         

		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
			return _textBuffer.contentsAsString();
	//   14   53:aload_0         
	//   15   54:getfield        #78  <Field TextBuffer _textBuffer>
	//   16   57:invokevirtual   #492 <Method String TextBuffer.contentsAsString()>
	//   17   60:areturn         
		}
	}

	protected JsonToken _handleApos()
		throws IOException
	{
		int i;
		char ac[];
		ac = _textBuffer.emptyAndGetCurrentSegment();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #266 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//    3    7:astore          5
		i = _textBuffer.getCurrentSegmentSize();
	//    4    9:aload_0         
	//    5   10:getfield        #78  <Field TextBuffer _textBuffer>
	//    6   13:invokevirtual   #90  <Method int TextBuffer.getCurrentSegmentSize()>
	//    7   16:istore_3        
_L2:
		char c;
		char c1;
		if(_inputPtr >= _inputEnd && !loadMore())
	//*   8   17:aload_0         
	//*   9   18:getfield        #52  <Field int _inputPtr>
	//*  10   21:aload_0         
	//*  11   22:getfield        #55  <Field int _inputEnd>
	//*  12   25:icmplt          42
	//*  13   28:aload_0         
	//*  14   29:invokevirtual   #94  <Method boolean loadMore()>
	//*  15   32:ifne            42
			_reportInvalidEOF(": was expecting closing quote for a string value");
	//   16   35:aload_0         
	//   17   36:ldc2            #476 <String ": was expecting closing quote for a string value">
	//   18   39:invokevirtual   #254 <Method void _reportInvalidEOF(String)>
		char ac1[] = _inputBuffer;
	//   19   42:aload_0         
	//   20   43:getfield        #49  <Field char[] _inputBuffer>
	//   21   46:astore          6
		int j = _inputPtr;
	//   22   48:aload_0         
	//   23   49:getfield        #52  <Field int _inputPtr>
	//   24   52:istore          4
		_inputPtr = j + 1;
	//   25   54:aload_0         
	//   26   55:iload           4
	//   27   57:iconst_1        
	//   28   58:iadd            
	//   29   59:putfield        #52  <Field int _inputPtr>
		c1 = ac1[j];
	//   30   62:aload           6
	//   31   64:iload           4
	//   32   66:caload          
	//   33   67:istore_2        
		c = c1;
	//   34   68:iload_2         
	//   35   69:istore_1        
		if(c1 <= '\\')
	//*  36   70:iload_2         
	//*  37   71:bipush          92
	//*  38   73:icmpgt          87
		{
			if(c1 != '\\')
				break; /* Loop/switch isn't completed */
	//   39   76:iload_2         
	//   40   77:bipush          92
	//   41   79:icmpne          131
			c = _decodeEscaped();
	//   42   82:aload_0         
	//   43   83:invokevirtual   #258 <Method char _decodeEscaped()>
	//   44   86:istore_1        
		}
_L3:
		char ac2[] = ac;
	//   45   87:aload           5
	//   46   89:astore          6
		int k = i;
	//   47   91:iload_3         
	//   48   92:istore          4
		if(i >= ac.length)
	//*  49   94:iload_3         
	//*  50   95:aload           5
	//*  51   97:arraylength     
	//*  52   98:icmplt          113
		{
			ac2 = _textBuffer.finishCurrentSegment();
	//   53  101:aload_0         
	//   54  102:getfield        #78  <Field TextBuffer _textBuffer>
	//   55  105:invokevirtual   #114 <Method char[] TextBuffer.finishCurrentSegment()>
	//   56  108:astore          6
			k = 0;
	//   57  110:iconst_0        
	//   58  111:istore          4
		}
		ac2[k] = c;
	//   59  113:aload           6
	//   60  115:iload           4
	//   61  117:iload_1         
	//   62  118:castore         
		i = k + 1;
	//   63  119:iload           4
	//   64  121:iconst_1        
	//   65  122:iadd            
	//   66  123:istore_3        
		ac = ac2;
	//   67  124:aload           6
	//   68  126:astore          5
		if(true) goto _L2; else goto _L1
	//   69  128:goto            17
_L1:
		c = c1;
	//   70  131:iload_2         
	//   71  132:istore_1        
		if(c1 <= '\'')
	//*  72  133:iload_2         
	//*  73  134:bipush          39
	//*  74  136:icmpgt          87
		{
			if(c1 == '\'')
	//*  75  139:iload_2         
	//*  76  140:bipush          39
	//*  77  142:icmpne          157
			{
				_textBuffer.setCurrentLength(i);
	//   78  145:aload_0         
	//   79  146:getfield        #78  <Field TextBuffer _textBuffer>
	//   80  149:iload_3         
	//   81  150:invokevirtual   #98  <Method void TextBuffer.setCurrentLength(int)>
				return JsonToken.VALUE_STRING;
	//   82  153:getstatic       #146 <Field JsonToken JsonToken.VALUE_STRING>
	//   83  156:areturn         
			}
			c = c1;
	//   84  157:iload_2         
	//   85  158:istore_1        
			if(c1 < ' ')
	//*  86  159:iload_2         
	//*  87  160:bipush          32
	//*  88  162:icmpge          87
			{
				_throwUnquotedSpace(((int) (c1)), "string value");
	//   89  165:aload_0         
	//   90  166:iload_2         
	//   91  167:ldc2            #478 <String "string value">
	//   92  170:invokevirtual   #263 <Method void _throwUnquotedSpace(int, String)>
				c = c1;
	//   93  173:iload_2         
	//   94  174:istore_1        
			}
		}
		  goto _L3
		if(true) goto _L2; else goto _L4
_L4:
	//*  95  175:goto            87
	}

	protected JsonToken _handleInvalidNumberStart(int i, boolean flag)
		throws IOException
	{
		double d;
		int j;
		d = (-1.0D / 0.0D);
	//    0    0:ldc2w           #494 <Double (-1.0D / 0.0D)>
	//    1    3:dstore_3        
		j = i;
	//    2    4:iload_1         
	//    3    5:istore          5
		if(i != 73) goto _L2; else goto _L1
	//    4    7:iload_1         
	//    5    8:bipush          73
	//    6   10:icmpne          151
_L1:
		if(_inputPtr >= _inputEnd && !loadMore())
	//*   7   13:aload_0         
	//*   8   14:getfield        #52  <Field int _inputPtr>
	//*   9   17:aload_0         
	//*  10   18:getfield        #55  <Field int _inputEnd>
	//*  11   21:icmplt          35
	//*  12   24:aload_0         
	//*  13   25:invokevirtual   #94  <Method boolean loadMore()>
	//*  14   28:ifne            35
			_reportInvalidEOFInValue();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #498 <Method void _reportInvalidEOFInValue()>
		char ac[] = _inputBuffer;
	//   17   35:aload_0         
	//   18   36:getfield        #49  <Field char[] _inputBuffer>
	//   19   39:astore          6
		i = _inputPtr;
	//   20   41:aload_0         
	//   21   42:getfield        #52  <Field int _inputPtr>
	//   22   45:istore_1        
		_inputPtr = i + 1;
	//   23   46:aload_0         
	//   24   47:iload_1         
	//   25   48:iconst_1        
	//   26   49:iadd            
	//   27   50:putfield        #52  <Field int _inputPtr>
		i = ((int) (ac[i]));
	//   28   53:aload           6
	//   29   55:iload_1         
	//   30   56:caload          
	//   31   57:istore_1        
		if(i != 78) goto _L4; else goto _L3
	//   32   58:iload_1         
	//   33   59:bipush          78
	//   34   61:icmpne          162
_L3:
		String s;
		if(flag)
	//*  35   64:iload_2         
	//*  36   65:ifeq            102
			s = "-INF";
	//   37   68:ldc2            #500 <String "-INF">
	//   38   71:astore          6
		else
	//*  39   73:aload_0         
	//*  40   74:aload           6
	//*  41   76:iconst_3        
	//*  42   77:invokevirtual   #158 <Method void _matchToken(String, int)>
	//*  43   80:aload_0         
	//*  44   81:getstatic       #503 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  45   84:invokevirtual   #347 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  46   87:ifeq            117
	//*  47   90:iload_2         
	//*  48   91:ifeq            110
	//*  49   94:aload_0         
	//*  50   95:aload           6
	//*  51   97:dload_3         
	//*  52   98:invokevirtual   #507 <Method JsonToken resetAsNaN(String, double)>
	//*  53  101:areturn         
			s = "+INF";
	//   54  102:ldc2            #509 <String "+INF">
	//   55  105:astore          6
		_matchToken(s, 3);
		if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
		{
			if(!flag)
	//*  56  107:goto            73
				d = (1.0D / 0.0D);
	//   57  110:ldc2w           #510 <Double (1.0D / 0.0D)>
	//   58  113:dstore_3        
			return resetAsNaN(s, d);
		}
	//*  59  114:goto            94
		_reportError((new StringBuilder()).append("Non-standard token '").append(s).append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow").toString());
	//   60  117:aload_0         
	//   61  118:new             #233 <Class StringBuilder>
	//   62  121:dup             
	//   63  122:invokespecial   #235 <Method void StringBuilder()>
	//   64  125:ldc2            #513 <String "Non-standard token '">
	//   65  128:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   66  131:aload           6
	//   67  133:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   68  136:ldc2            #515 <String "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//   69  139:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   70  142:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   71  145:invokevirtual   #518 <Method void _reportError(String)>
		j = i;
	//   72  148:iload_1         
	//   73  149:istore          5
_L2:
		reportUnexpectedNumberChar(j, "expected digit (0-9) to follow minus sign, for valid numeric value");
	//   74  151:aload_0         
	//   75  152:iload           5
	//   76  154:ldc2            #520 <String "expected digit (0-9) to follow minus sign, for valid numeric value">
	//   77  157:invokevirtual   #217 <Method void reportUnexpectedNumberChar(int, String)>
		return null;
	//   78  160:aconst_null     
	//   79  161:areturn         
_L4:
		j = i;
	//   80  162:iload_1         
	//   81  163:istore          5
		if(i == 110)
	//*  82  165:iload_1         
	//*  83  166:bipush          110
	//*  84  168:icmpne          151
		{
			String s1;
			if(flag)
	//*  85  171:iload_2         
	//*  86  172:ifeq            209
				s1 = "-Infinity";
	//   87  175:ldc2            #522 <String "-Infinity">
	//   88  178:astore          6
			else
	//*  89  180:aload_0         
	//*  90  181:aload           6
	//*  91  183:iconst_3        
	//*  92  184:invokevirtual   #158 <Method void _matchToken(String, int)>
	//*  93  187:aload_0         
	//*  94  188:getstatic       #503 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  95  191:invokevirtual   #347 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  96  194:ifeq            224
	//*  97  197:iload_2         
	//*  98  198:ifeq            217
	//*  99  201:aload_0         
	//* 100  202:aload           6
	//* 101  204:dload_3         
	//* 102  205:invokevirtual   #507 <Method JsonToken resetAsNaN(String, double)>
	//* 103  208:areturn         
				s1 = "+Infinity";
	//  104  209:ldc2            #524 <String "+Infinity">
	//  105  212:astore          6
			_matchToken(s1, 3);
			if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
			{
				if(!flag)
	//* 106  214:goto            180
					d = (1.0D / 0.0D);
	//  107  217:ldc2w           #510 <Double (1.0D / 0.0D)>
	//  108  220:dstore_3        
				return resetAsNaN(s1, d);
			}
	//* 109  221:goto            201
			_reportError((new StringBuilder()).append("Non-standard token '").append(s1).append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow").toString());
	//  110  224:aload_0         
	//  111  225:new             #233 <Class StringBuilder>
	//  112  228:dup             
	//  113  229:invokespecial   #235 <Method void StringBuilder()>
	//  114  232:ldc2            #513 <String "Non-standard token '">
	//  115  235:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//  116  238:aload           6
	//  117  240:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//  118  243:ldc2            #515 <String "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//  119  246:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//  120  249:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  121  252:invokevirtual   #518 <Method void _reportError(String)>
			j = i;
	//  122  255:iload_1         
	//  123  256:istore          5
		}
		if(true) goto _L2; else goto _L5
	//  124  258:goto            151
_L5:
	}

	protected String _handleOddName(int i)
		throws IOException
	{
		if(i == 39 && isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES))
	//*   0    0:iload_1         
	//*   1    1:bipush          39
	//*   2    3:icmpne          21
	//*   3    6:aload_0         
	//*   4    7:getstatic       #529 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_SINGLE_QUOTES>
	//*   5   10:invokevirtual   #347 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   6   13:ifeq            21
			return _parseAposName();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #532 <Method String _parseAposName()>
	//    9   20:areturn         
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES))
	//*  10   21:aload_0         
	//*  11   22:getstatic       #535 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_UNQUOTED_FIELD_NAMES>
	//*  12   25:invokevirtual   #347 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  13   28:ifne            39
			_reportUnexpectedChar(i, "was expecting double-quote to start field name");
	//   14   31:aload_0         
	//   15   32:iload_1         
	//   16   33:ldc2            #537 <String "was expecting double-quote to start field name">
	//   17   36:invokevirtual   #330 <Method void _reportUnexpectedChar(int, String)>
		int ai[] = CharTypes.getInputCodeLatin1JsNames();
	//   18   39:invokestatic    #540 <Method int[] CharTypes.getInputCodeLatin1JsNames()>
	//   19   42:astore          8
		int i1 = ai.length;
	//   20   44:aload           8
	//   21   46:arraylength     
	//   22   47:istore          5
		int j;
		int k;
		int l;
		int j1;
		boolean flag;
		if(i < i1)
	//*  23   49:iload_1         
	//*  24   50:iload           5
	//*  25   52:icmpge          165
		{
			if(ai[i] == 0)
	//*  26   55:aload           8
	//*  27   57:iload_1         
	//*  28   58:iaload          
	//*  29   59:ifne            159
				flag = true;
	//   30   62:iconst_1        
	//   31   63:istore          7
			else
	//*  32   65:iload           7
	//*  33   67:ifne            78
	//*  34   70:aload_0         
	//*  35   71:iload_1         
	//*  36   72:ldc2            #542 <String "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name">
	//*  37   75:invokevirtual   #330 <Method void _reportUnexpectedChar(int, String)>
	//*  38   78:aload_0         
	//*  39   79:getfield        #52  <Field int _inputPtr>
	//*  40   82:istore          4
	//*  41   84:aload_0         
	//*  42   85:getfield        #67  <Field int _hashSeed>
	//*  43   88:istore_2        
	//*  44   89:aload_0         
	//*  45   90:getfield        #55  <Field int _inputEnd>
	//*  46   93:istore          6
	//*  47   95:iload_2         
	//*  48   96:istore_3        
	//*  49   97:iload           4
	//*  50   99:istore_1        
	//*  51  100:iload           4
	//*  52  102:iload           6
	//*  53  104:icmpge          239
	//*  54  107:iload           4
	//*  55  109:istore_1        
	//*  56  110:aload_0         
	//*  57  111:getfield        #49  <Field char[] _inputBuffer>
	//*  58  114:iload_1         
	//*  59  115:caload          
	//*  60  116:istore_3        
	//*  61  117:iload_3         
	//*  62  118:iload           5
	//*  63  120:icmpge          175
	//*  64  123:aload           8
	//*  65  125:iload_3         
	//*  66  126:iaload          
	//*  67  127:ifeq            212
	//*  68  130:aload_0         
	//*  69  131:getfield        #52  <Field int _inputPtr>
	//*  70  134:iconst_1        
	//*  71  135:isub            
	//*  72  136:istore_3        
	//*  73  137:aload_0         
	//*  74  138:iload_1         
	//*  75  139:putfield        #52  <Field int _inputPtr>
	//*  76  142:aload_0         
	//*  77  143:getfield        #59  <Field CharsToNameCanonicalizer _symbols>
	//*  78  146:aload_0         
	//*  79  147:getfield        #49  <Field char[] _inputBuffer>
	//*  80  150:iload_3         
	//*  81  151:iload_1         
	//*  82  152:iload_3         
	//*  83  153:isub            
	//*  84  154:iload_2         
	//*  85  155:invokevirtual   #111 <Method String CharsToNameCanonicalizer.findSymbol(char[], int, int, int)>
	//*  86  158:areturn         
				flag = false;
	//   87  159:iconst_0        
	//   88  160:istore          7
		} else
	//*  89  162:goto            65
		{
			flag = Character.isJavaIdentifierPart((char)i);
	//   90  165:iload_1         
	//   91  166:int2char        
	//   92  167:invokestatic    #120 <Method boolean Character.isJavaIdentifierPart(char)>
	//   93  170:istore          7
		}
		if(!flag)
			_reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
		l = _inputPtr;
		j = _hashSeed;
		j1 = _inputEnd;
		k = j;
		i = l;
		if(l < j1)
		{
			i = l;
			do
			{
				k = ((int) (_inputBuffer[i]));
				if(k < i1)
				{
					if(ai[k] != 0)
					{
						k = _inputPtr - 1;
						_inputPtr = i;
						return _symbols.findSymbol(_inputBuffer, k, i - k, j);
					}
				} else
	//*  94  172:goto            65
				if(!Character.isJavaIdentifierPart((char)k))
	//*  95  175:iload_3         
	//*  96  176:int2char        
	//*  97  177:invokestatic    #120 <Method boolean Character.isJavaIdentifierPart(char)>
	//*  98  180:ifne            212
				{
					k = _inputPtr - 1;
	//   99  183:aload_0         
	//  100  184:getfield        #52  <Field int _inputPtr>
	//  101  187:iconst_1        
	//  102  188:isub            
	//  103  189:istore_3        
					_inputPtr = i;
	//  104  190:aload_0         
	//  105  191:iload_1         
	//  106  192:putfield        #52  <Field int _inputPtr>
					return _symbols.findSymbol(_inputBuffer, k, i - k, j);
	//  107  195:aload_0         
	//  108  196:getfield        #59  <Field CharsToNameCanonicalizer _symbols>
	//  109  199:aload_0         
	//  110  200:getfield        #49  <Field char[] _inputBuffer>
	//  111  203:iload_3         
	//  112  204:iload_1         
	//  113  205:iload_3         
	//  114  206:isub            
	//  115  207:iload_2         
	//  116  208:invokevirtual   #111 <Method String CharsToNameCanonicalizer.findSymbol(char[], int, int, int)>
	//  117  211:areturn         
				}
				k = j * 33 + k;
	//  118  212:iload_2         
	//  119  213:bipush          33
	//  120  215:imul            
	//  121  216:iload_3         
	//  122  217:iadd            
	//  123  218:istore_3        
				l = i + 1;
	//  124  219:iload_1         
	//  125  220:iconst_1        
	//  126  221:iadd            
	//  127  222:istore          4
				j = k;
	//  128  224:iload_3         
	//  129  225:istore_2        
				i = l;
	//  130  226:iload           4
	//  131  228:istore_1        
			} while(l < j1);
	//  132  229:iload           4
	//  133  231:iload           6
	//  134  233:icmplt          110
			i = l;
	//  135  236:iload           4
	//  136  238:istore_1        
		}
		j = _inputPtr;
	//  137  239:aload_0         
	//  138  240:getfield        #52  <Field int _inputPtr>
	//  139  243:istore_2        
		_inputPtr = i;
	//  140  244:aload_0         
	//  141  245:iload_1         
	//  142  246:putfield        #52  <Field int _inputPtr>
		return _handleOddName2(j - 1, k, ai);
	//  143  249:aload_0         
	//  144  250:iload_2         
	//  145  251:iconst_1        
	//  146  252:isub            
	//  147  253:iload_3         
	//  148  254:aload           8
	//  149  256:invokespecial   #544 <Method String _handleOddName2(int, int, int[])>
	//  150  259:areturn         
	}

	protected JsonToken _handleOddValue(int i)
		throws IOException
	{
		i;
	//    0    0:iload_1         
		JVM INSTR lookupswitch 4: default 44
	//	               39: 89
	//	               43: 182
	//	               73: 143
	//	               78: 104;
	//    1    1:lookupswitch    4: default 44
	//	               39: 89
	//	               43: 182
	//	               73: 143
	//	               78: 104
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		if(Character.isJavaIdentifierStart(i))
	//*   2   44:iload_1         
	//*   3   45:invokestatic    #548 <Method boolean Character.isJavaIdentifierStart(int)>
	//*   4   48:ifeq            79
			_reportInvalidToken((new StringBuilder()).append("").append((char)i).toString(), "('true', 'false' or 'null')");
	//    5   51:aload_0         
	//    6   52:new             #233 <Class StringBuilder>
	//    7   55:dup             
	//    8   56:invokespecial   #235 <Method void StringBuilder()>
	//    9   59:ldc2            #550 <String "">
	//   10   62:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   11   65:iload_1         
	//   12   66:int2char        
	//   13   67:invokevirtual   #244 <Method StringBuilder StringBuilder.append(char)>
	//   14   70:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   15   73:ldc2            #552 <String "('true', 'false' or 'null')">
	//   16   76:invokevirtual   #556 <Method void _reportInvalidToken(String, String)>
		_reportUnexpectedChar(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
	//   17   79:aload_0         
	//   18   80:iload_1         
	//   19   81:ldc2            #558 <String "expected a valid value (number, String, array, object, 'true', 'false' or 'null')">
	//   20   84:invokevirtual   #330 <Method void _reportUnexpectedChar(int, String)>
		return null;
	//   21   87:aconst_null     
	//   22   88:areturn         
_L2:
		if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES))
	//*  23   89:aload_0         
	//*  24   90:getstatic       #529 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_SINGLE_QUOTES>
	//*  25   93:invokevirtual   #347 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  26   96:ifeq            44
			return _handleApos();
	//   27   99:aload_0         
	//   28  100:invokevirtual   #560 <Method JsonToken _handleApos()>
	//   29  103:areturn         
		continue; /* Loop/switch isn't completed */
_L5:
		_matchToken("NaN", 1);
	//   30  104:aload_0         
	//   31  105:ldc2            #562 <String "NaN">
	//   32  108:iconst_1        
	//   33  109:invokevirtual   #158 <Method void _matchToken(String, int)>
		if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
	//*  34  112:aload_0         
	//*  35  113:getstatic       #503 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  36  116:invokevirtual   #347 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  37  119:ifeq            133
			return resetAsNaN("NaN", (0.0D / 0.0D));
	//   38  122:aload_0         
	//   39  123:ldc2            #562 <String "NaN">
	//   40  126:ldc2w           #563 <Double (0.0D / 0.0D)>
	//   41  129:invokevirtual   #507 <Method JsonToken resetAsNaN(String, double)>
	//   42  132:areturn         
		_reportError("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
	//   43  133:aload_0         
	//   44  134:ldc2            #566 <String "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//   45  137:invokevirtual   #518 <Method void _reportError(String)>
		continue; /* Loop/switch isn't completed */
	//   46  140:goto            44
_L4:
		_matchToken("Infinity", 1);
	//   47  143:aload_0         
	//   48  144:ldc2            #568 <String "Infinity">
	//   49  147:iconst_1        
	//   50  148:invokevirtual   #158 <Method void _matchToken(String, int)>
		if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
	//*  51  151:aload_0         
	//*  52  152:getstatic       #503 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  53  155:invokevirtual   #347 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  54  158:ifeq            172
			return resetAsNaN("Infinity", (1.0D / 0.0D));
	//   55  161:aload_0         
	//   56  162:ldc2            #568 <String "Infinity">
	//   57  165:ldc2w           #510 <Double (1.0D / 0.0D)>
	//   58  168:invokevirtual   #507 <Method JsonToken resetAsNaN(String, double)>
	//   59  171:areturn         
		_reportError("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
	//   60  172:aload_0         
	//   61  173:ldc2            #570 <String "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//   62  176:invokevirtual   #518 <Method void _reportError(String)>
		if(true) goto _L1; else goto _L3
	//   63  179:goto            44
_L3:
		if(_inputPtr >= _inputEnd && !loadMore())
	//*  64  182:aload_0         
	//*  65  183:getfield        #52  <Field int _inputPtr>
	//*  66  186:aload_0         
	//*  67  187:getfield        #55  <Field int _inputEnd>
	//*  68  190:icmplt          204
	//*  69  193:aload_0         
	//*  70  194:invokevirtual   #94  <Method boolean loadMore()>
	//*  71  197:ifne            204
			_reportInvalidEOFInValue();
	//   72  200:aload_0         
	//   73  201:invokevirtual   #498 <Method void _reportInvalidEOFInValue()>
		char ac[] = _inputBuffer;
	//   74  204:aload_0         
	//   75  205:getfield        #49  <Field char[] _inputBuffer>
	//   76  208:astore_2        
		i = _inputPtr;
	//   77  209:aload_0         
	//   78  210:getfield        #52  <Field int _inputPtr>
	//   79  213:istore_1        
		_inputPtr = i + 1;
	//   80  214:aload_0         
	//   81  215:iload_1         
	//   82  216:iconst_1        
	//   83  217:iadd            
	//   84  218:putfield        #52  <Field int _inputPtr>
		return _handleInvalidNumberStart(((int) (ac[i])), false);
	//   85  221:aload_0         
	//   86  222:aload_2         
	//   87  223:iload_1         
	//   88  224:caload          
	//   89  225:iconst_0        
	//   90  226:invokevirtual   #273 <Method JsonToken _handleInvalidNumberStart(int, boolean)>
	//   91  229:areturn         
	}

	protected boolean _isNextTokenNameMaybe(int i, String s)
		throws IOException
	{
		String s1;
		if(i == 34)
	//*   0    0:iload_1         
	//*   1    1:bipush          34
	//*   2    3:icmpne          62
			s1 = _parseName();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #575 <Method String _parseName()>
	//    5   10:astore          4
		else
	//*   6   12:aload_0         
	//*   7   13:getfield        #189 <Field JsonReadContext _parsingContext>
	//*   8   16:aload           4
	//*   9   18:invokevirtual   #578 <Method void JsonReadContext.setCurrentName(String)>
	//*  10   21:aload_0         
	//*  11   22:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//*  12   25:putfield        #131 <Field JsonToken _currToken>
	//*  13   28:aload_0         
	//*  14   29:invokespecial   #580 <Method int _skipColon()>
	//*  15   32:istore_1        
	//*  16   33:aload_0         
	//*  17   34:invokespecial   #134 <Method void _updateLocation()>
	//*  18   37:iload_1         
	//*  19   38:bipush          34
	//*  20   40:icmpne          72
	//*  21   43:aload_0         
	//*  22   44:iconst_1        
	//*  23   45:putfield        #143 <Field boolean _tokenIncomplete>
	//*  24   48:aload_0         
	//*  25   49:getstatic       #146 <Field JsonToken JsonToken.VALUE_STRING>
	//*  26   52:putfield        #141 <Field JsonToken _nextToken>
	//*  27   55:aload_2         
	//*  28   56:aload           4
	//*  29   58:invokevirtual   #586 <Method boolean String.equals(Object)>
	//*  30   61:ireturn         
			s1 = _handleOddName(i);
	//   31   62:aload_0         
	//   32   63:iload_1         
	//   33   64:invokevirtual   #588 <Method String _handleOddName(int)>
	//   34   67:astore          4
		_parsingContext.setCurrentName(s1);
		_currToken = JsonToken.FIELD_NAME;
		i = _skipColon();
		_updateLocation();
		if(i == 34)
		{
			_tokenIncomplete = true;
			_nextToken = JsonToken.VALUE_STRING;
			return s.equals(((Object) (s1)));
		}
	//*  35   69:goto            12
		i;
	//   36   72:iload_1         
		JVM INSTR lookupswitch 16: default 212
	//	               45: 230
	//	               48: 238
	//	               49: 238
	//	               50: 238
	//	               51: 238
	//	               52: 238
	//	               53: 238
	//	               54: 238
	//	               55: 238
	//	               56: 238
	//	               57: 238
	//	               91: 280
	//	               102: 247
	//	               110: 258
	//	               116: 269
	//	               123: 287;
	//   37   73:lookupswitch    16: default 212
	//	               45: 230
	//	               48: 238
	//	               49: 238
	//	               50: 238
	//	               51: 238
	//	               52: 238
	//	               53: 238
	//	               54: 238
	//	               55: 238
	//	               56: 238
	//	               57: 238
	//	               91: 280
	//	               102: 247
	//	               110: 258
	//	               116: 269
	//	               123: 287
		   goto _L1 _L2 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		JsonToken jsontoken = _handleOddValue(i);
	//   38  212:aload_0         
	//   39  213:iload_1         
	//   40  214:invokevirtual   #138 <Method JsonToken _handleOddValue(int)>
	//   41  217:astore_3        
_L10:
		_nextToken = jsontoken;
	//   42  218:aload_0         
	//   43  219:aload_3         
	//   44  220:putfield        #141 <Field JsonToken _nextToken>
		return s.equals(((Object) (s1)));
	//   45  223:aload_2         
	//   46  224:aload           4
	//   47  226:invokevirtual   #586 <Method boolean String.equals(Object)>
	//   48  229:ireturn         
_L2:
		jsontoken = _parseNegNumber();
	//   49  230:aload_0         
	//   50  231:invokevirtual   #175 <Method JsonToken _parseNegNumber()>
	//   51  234:astore_3        
		continue; /* Loop/switch isn't completed */
	//   52  235:goto            218
_L3:
		jsontoken = _parsePosNumber(i);
	//   53  238:aload_0         
	//   54  239:iload_1         
	//   55  240:invokevirtual   #178 <Method JsonToken _parsePosNumber(int)>
	//   56  243:astore_3        
		continue; /* Loop/switch isn't completed */
	//   57  244:goto            218
_L5:
		_matchFalse();
	//   58  247:aload_0         
	//   59  248:invokespecial   #590 <Method void _matchFalse()>
		jsontoken = JsonToken.VALUE_FALSE;
	//   60  251:getstatic       #166 <Field JsonToken JsonToken.VALUE_FALSE>
	//   61  254:astore_3        
		continue; /* Loop/switch isn't completed */
	//   62  255:goto            218
_L6:
		_matchNull();
	//   63  258:aload_0         
	//   64  259:invokespecial   #592 <Method void _matchNull()>
		jsontoken = JsonToken.VALUE_NULL;
	//   65  262:getstatic       #171 <Field JsonToken JsonToken.VALUE_NULL>
	//   66  265:astore_3        
		continue; /* Loop/switch isn't completed */
	//   67  266:goto            218
_L7:
		_matchTrue();
	//   68  269:aload_0         
	//   69  270:invokespecial   #594 <Method void _matchTrue()>
		jsontoken = JsonToken.VALUE_TRUE;
	//   70  273:getstatic       #161 <Field JsonToken JsonToken.VALUE_TRUE>
	//   71  276:astore_3        
		continue; /* Loop/switch isn't completed */
	//   72  277:goto            218
_L4:
		jsontoken = JsonToken.START_ARRAY;
	//   73  280:getstatic       #149 <Field JsonToken JsonToken.START_ARRAY>
	//   74  283:astore_3        
		continue; /* Loop/switch isn't completed */
	//   75  284:goto            218
_L8:
		jsontoken = JsonToken.START_OBJECT;
	//   76  287:getstatic       #152 <Field JsonToken JsonToken.START_OBJECT>
	//   77  290:astore_3        
		if(true) goto _L10; else goto _L9
	//   78  291:goto            218
_L9:
	}

	protected final void _matchToken(String s, int i)
		throws IOException
	{
		int k = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #597 <Method int String.length()>
	//    2    4:istore          5
		int j;
		do
		{
			if(_inputPtr >= _inputEnd && !loadMore())
	//*   3    6:aload_0         
	//*   4    7:getfield        #52  <Field int _inputPtr>
	//*   5   10:aload_0         
	//*   6   11:getfield        #55  <Field int _inputEnd>
	//*   7   14:icmplt          34
	//*   8   17:aload_0         
	//*   9   18:invokevirtual   #94  <Method boolean loadMore()>
	//*  10   21:ifne            34
				_reportInvalidToken(s.substring(0, i));
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:iconst_0        
	//   14   27:iload_2         
	//   15   28:invokevirtual   #601 <Method String String.substring(int, int)>
	//   16   31:invokevirtual   #603 <Method void _reportInvalidToken(String)>
			if(_inputBuffer[_inputPtr] != s.charAt(i))
	//*  17   34:aload_0         
	//*  18   35:getfield        #49  <Field char[] _inputBuffer>
	//*  19   38:aload_0         
	//*  20   39:getfield        #52  <Field int _inputPtr>
	//*  21   42:caload          
	//*  22   43:aload_1         
	//*  23   44:iload_2         
	//*  24   45:invokevirtual   #607 <Method char String.charAt(int)>
	//*  25   48:icmpeq          61
				_reportInvalidToken(s.substring(0, i));
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:iconst_0        
	//   29   54:iload_2         
	//   30   55:invokevirtual   #601 <Method String String.substring(int, int)>
	//   31   58:invokevirtual   #603 <Method void _reportInvalidToken(String)>
			_inputPtr = _inputPtr + 1;
	//   32   61:aload_0         
	//   33   62:aload_0         
	//   34   63:getfield        #52  <Field int _inputPtr>
	//   35   66:iconst_1        
	//   36   67:iadd            
	//   37   68:putfield        #52  <Field int _inputPtr>
			j = i + 1;
	//   38   71:iload_2         
	//   39   72:iconst_1        
	//   40   73:iadd            
	//   41   74:istore          4
			i = j;
	//   42   76:iload           4
	//   43   78:istore_2        
		} while(j < k);
	//   44   79:iload           4
	//   45   81:iload           5
	//   46   83:icmplt          6
		char c;
		if(_inputPtr < _inputEnd || loadMore())
	//*  47   86:aload_0         
	//*  48   87:getfield        #52  <Field int _inputPtr>
	//*  49   90:aload_0         
	//*  50   91:getfield        #55  <Field int _inputEnd>
	//*  51   94:icmplt          105
	//*  52   97:aload_0         
	//*  53   98:invokevirtual   #94  <Method boolean loadMore()>
	//*  54  101:ifne            105
	//*  55  104:return          
	//*  56  105:aload_0         
	//*  57  106:getfield        #49  <Field char[] _inputBuffer>
	//*  58  109:aload_0         
	//*  59  110:getfield        #52  <Field int _inputPtr>
	//*  60  113:caload          
	//*  61  114:istore_3        
			if((c = _inputBuffer[_inputPtr]) >= '0' && c != ']' && c != '}' && Character.isJavaIdentifierPart(c))
	//*  62  115:iload_3         
	//*  63  116:bipush          48
	//*  64  118:icmplt          104
	//*  65  121:iload_3         
	//*  66  122:bipush          93
	//*  67  124:icmpeq          104
	//*  68  127:iload_3         
	//*  69  128:bipush          125
	//*  70  130:icmpeq          104
	//*  71  133:iload_3         
	//*  72  134:invokestatic    #120 <Method boolean Character.isJavaIdentifierPart(char)>
	//*  73  137:ifeq            104
			{
				_reportInvalidToken(s.substring(0, j));
	//   74  140:aload_0         
	//   75  141:aload_1         
	//   76  142:iconst_0        
	//   77  143:iload           4
	//   78  145:invokevirtual   #601 <Method String String.substring(int, int)>
	//   79  148:invokevirtual   #603 <Method void _reportInvalidToken(String)>
				return;
	//   80  151:return          
			}
	}

	protected String _parseAposName()
		throws IOException
	{
		int i;
		int j;
		int k;
		int i1;
		int k1;
		i1 = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int _inputPtr>
	//    2    4:istore          4
		k = _hashSeed;
	//    3    6:aload_0         
	//    4    7:getfield        #67  <Field int _hashSeed>
	//    5   10:istore_3        
		k1 = _inputEnd;
	//    6   11:aload_0         
	//    7   12:getfield        #55  <Field int _inputEnd>
	//    8   15:istore          5
		i = k;
	//    9   17:iload_3         
	//   10   18:istore_1        
		j = i1;
	//   11   19:iload           4
	//   12   21:istore_2        
		if(i1 >= k1) goto _L2; else goto _L1
	//   13   22:iload           4
	//   14   24:iload           5
	//   15   26:icmpge          99
_L1:
		int l1;
		int ai[];
		ai = _icLatin1;
	//   16   29:getstatic       #33  <Field int[] _icLatin1>
	//   17   32:astore          7
		l1 = ai.length;
	//   18   34:aload           7
	//   19   36:arraylength     
	//   20   37:istore          6
		j = i1;
	//   21   39:iload           4
	//   22   41:istore_2        
		i = k;
	//   23   42:iload_3         
	//   24   43:istore_1        
_L4:
		int l = ((int) (_inputBuffer[j]));
	//   25   44:aload_0         
	//   26   45:getfield        #49  <Field char[] _inputBuffer>
	//   27   48:iload_2         
	//   28   49:caload          
	//   29   50:istore_3        
		if(l == 39)
	//*  30   51:iload_3         
	//*  31   52:bipush          39
	//*  32   54:icmpne          86
		{
			l = _inputPtr;
	//   33   57:aload_0         
	//   34   58:getfield        #52  <Field int _inputPtr>
	//   35   61:istore_3        
			_inputPtr = j + 1;
	//   36   62:aload_0         
	//   37   63:iload_2         
	//   38   64:iconst_1        
	//   39   65:iadd            
	//   40   66:putfield        #52  <Field int _inputPtr>
			return _symbols.findSymbol(_inputBuffer, l, j - l, i);
	//   41   69:aload_0         
	//   42   70:getfield        #59  <Field CharsToNameCanonicalizer _symbols>
	//   43   73:aload_0         
	//   44   74:getfield        #49  <Field char[] _inputBuffer>
	//   45   77:iload_3         
	//   46   78:iload_2         
	//   47   79:iload_3         
	//   48   80:isub            
	//   49   81:iload_1         
	//   50   82:invokevirtual   #111 <Method String CharsToNameCanonicalizer.findSymbol(char[], int, int, int)>
	//   51   85:areturn         
		}
		if(l >= l1 || ai[l] == 0)
	//*  52   86:iload_3         
	//*  53   87:iload           6
	//*  54   89:icmpge          118
	//*  55   92:aload           7
	//*  56   94:iload_3         
	//*  57   95:iaload          
	//*  58   96:ifeq            118
	//*  59   99:aload_0         
	//*  60  100:getfield        #52  <Field int _inputPtr>
	//*  61  103:istore_3        
	//*  62  104:aload_0         
	//*  63  105:iload_2         
	//*  64  106:putfield        #52  <Field int _inputPtr>
	//*  65  109:aload_0         
	//*  66  110:iload_3         
	//*  67  111:iload_1         
	//*  68  112:bipush          39
	//*  69  114:invokespecial   #609 <Method String _parseName2(int, int, int)>
	//*  70  117:areturn         
		{
			int j1 = i * 33 + l;
	//   71  118:iload_1         
	//   72  119:bipush          33
	//   73  121:imul            
	//   74  122:iload_3         
	//   75  123:iadd            
	//   76  124:istore          4
			l = j + 1;
	//   77  126:iload_2         
	//   78  127:iconst_1        
	//   79  128:iadd            
	//   80  129:istore_3        
			i = j1;
	//   81  130:iload           4
	//   82  132:istore_1        
			j = l;
	//   83  133:iload_3         
	//   84  134:istore_2        
			if(l < k1)
				continue; /* Loop/switch isn't completed */
	//   85  135:iload_3         
	//   86  136:iload           5
	//   87  138:icmplt          44
			i = j1;
	//   88  141:iload           4
	//   89  143:istore_1        
			j = l;
	//   90  144:iload_3         
	//   91  145:istore_2        
		}
_L2:
		l = _inputPtr;
		_inputPtr = j;
		return _parseName2(l, i, 39);
		if(true) goto _L4; else goto _L3
_L3:
	//*  92  146:goto            99
	}

	protected final String _parseName()
		throws IOException
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int _inputPtr>
	//    2    4:istore_1        
		int j = _hashSeed;
	//    3    5:aload_0         
	//    4    6:getfield        #67  <Field int _hashSeed>
	//    5    9:istore_2        
		int ai[] = _icLatin1;
	//    6   10:getstatic       #33  <Field int[] _icLatin1>
	//    7   13:astore          4
		do
		{
			if(i >= _inputEnd)
				break;
	//    8   15:iload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #55  <Field int _inputEnd>
	//   11   20:icmpge          93
			int k = ((int) (_inputBuffer[i]));
	//   12   23:aload_0         
	//   13   24:getfield        #49  <Field char[] _inputBuffer>
	//   14   27:iload_1         
	//   15   28:caload          
	//   16   29:istore_3        
			if(k < ai.length && ai[k] != 0)
	//*  17   30:iload_3         
	//*  18   31:aload           4
	//*  19   33:arraylength     
	//*  20   34:icmpge          79
	//*  21   37:aload           4
	//*  22   39:iload_3         
	//*  23   40:iaload          
	//*  24   41:ifeq            79
			{
				if(k == 34)
	//*  25   44:iload_3         
	//*  26   45:bipush          34
	//*  27   47:icmpne          93
				{
					k = _inputPtr;
	//   28   50:aload_0         
	//   29   51:getfield        #52  <Field int _inputPtr>
	//   30   54:istore_3        
					_inputPtr = i + 1;
	//   31   55:aload_0         
	//   32   56:iload_1         
	//   33   57:iconst_1        
	//   34   58:iadd            
	//   35   59:putfield        #52  <Field int _inputPtr>
					return _symbols.findSymbol(_inputBuffer, k, i - k, j);
	//   36   62:aload_0         
	//   37   63:getfield        #59  <Field CharsToNameCanonicalizer _symbols>
	//   38   66:aload_0         
	//   39   67:getfield        #49  <Field char[] _inputBuffer>
	//   40   70:iload_3         
	//   41   71:iload_1         
	//   42   72:iload_3         
	//   43   73:isub            
	//   44   74:iload_2         
	//   45   75:invokevirtual   #111 <Method String CharsToNameCanonicalizer.findSymbol(char[], int, int, int)>
	//   46   78:areturn         
				}
				break;
			}
			j = j * 33 + k;
	//   47   79:iload_2         
	//   48   80:bipush          33
	//   49   82:imul            
	//   50   83:iload_3         
	//   51   84:iadd            
	//   52   85:istore_2        
			i++;
	//   53   86:iload_1         
	//   54   87:iconst_1        
	//   55   88:iadd            
	//   56   89:istore_1        
		} while(true);
	//   57   90:goto            15
		int l = _inputPtr;
	//   58   93:aload_0         
	//   59   94:getfield        #52  <Field int _inputPtr>
	//   60   97:istore_3        
		_inputPtr = i;
	//   61   98:aload_0         
	//   62   99:iload_1         
	//   63  100:putfield        #52  <Field int _inputPtr>
		return _parseName2(l, j, 34);
	//   64  103:aload_0         
	//   65  104:iload_3         
	//   66  105:iload_2         
	//   67  106:bipush          34
	//   68  108:invokespecial   #609 <Method String _parseName2(int, int, int)>
	//   69  111:areturn         
	}

	protected final JsonToken _parseNegNumber()
		throws IOException
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int _inputPtr>
	//    2    4:istore_1        
		int l = i - 1;
	//    3    5:iload_1         
	//    4    6:iconst_1        
	//    5    7:isub            
	//    6    8:istore          4
		int i1 = _inputEnd;
	//    7   10:aload_0         
	//    8   11:getfield        #55  <Field int _inputEnd>
	//    9   14:istore          5
		if(i >= i1)
	//*  10   16:iload_1         
	//*  11   17:iload           5
	//*  12   19:icmplt          30
			return _parseNumber2(true, l);
	//   13   22:aload_0         
	//   14   23:iconst_1        
	//   15   24:iload           4
	//   16   26:invokespecial   #211 <Method JsonToken _parseNumber2(boolean, int)>
	//   17   29:areturn         
		char ac[] = _inputBuffer;
	//   18   30:aload_0         
	//   19   31:getfield        #49  <Field char[] _inputBuffer>
	//   20   34:astore          6
		int j = i + 1;
	//   21   36:iload_1         
	//   22   37:iconst_1        
	//   23   38:iadd            
	//   24   39:istore_2        
		i = ((int) (ac[i]));
	//   25   40:aload           6
	//   26   42:iload_1         
	//   27   43:caload          
	//   28   44:istore_1        
		if(i > '9' || i < '0')
	//*  29   45:iload_1         
	//*  30   46:bipush          57
	//*  31   48:icmpgt          57
	//*  32   51:iload_1         
	//*  33   52:bipush          48
	//*  34   54:icmpge          69
		{
			_inputPtr = j;
	//   35   57:aload_0         
	//   36   58:iload_2         
	//   37   59:putfield        #52  <Field int _inputPtr>
			return _handleInvalidNumberStart(i, true);
	//   38   62:aload_0         
	//   39   63:iload_1         
	//   40   64:iconst_1        
	//   41   65:invokevirtual   #273 <Method JsonToken _handleInvalidNumberStart(int, boolean)>
	//   42   68:areturn         
		}
		if(i == '0')
	//*  43   69:iload_1         
	//*  44   70:bipush          48
	//*  45   72:icmpne          83
			return _parseNumber2(true, l);
	//   46   75:aload_0         
	//   47   76:iconst_1        
	//   48   77:iload           4
	//   49   79:invokespecial   #211 <Method JsonToken _parseNumber2(boolean, int)>
	//   50   82:areturn         
		i = 1;
	//   51   83:iconst_1        
	//   52   84:istore_1        
		int k;
		do
		{
			if(j >= i1)
	//*  53   85:iload_2         
	//*  54   86:iload           5
	//*  55   88:icmplt          99
				return _parseNumber2(true, l);
	//   56   91:aload_0         
	//   57   92:iconst_1        
	//   58   93:iload           4
	//   59   95:invokespecial   #211 <Method JsonToken _parseNumber2(boolean, int)>
	//   60   98:areturn         
			char ac1[] = _inputBuffer;
	//   61   99:aload_0         
	//   62  100:getfield        #49  <Field char[] _inputBuffer>
	//   63  103:astore          6
			k = j + 1;
	//   64  105:iload_2         
	//   65  106:iconst_1        
	//   66  107:iadd            
	//   67  108:istore_3        
			j = ((int) (ac1[j]));
	//   68  109:aload           6
	//   69  111:iload_2         
	//   70  112:caload          
	//   71  113:istore_2        
			if(j < '0' || j > '9')
	//*  72  114:iload_2         
	//*  73  115:bipush          48
	//*  74  117:icmplt          126
	//*  75  120:iload_2         
	//*  76  121:bipush          57
	//*  77  123:icmple          160
			{
				if(j == '.' || j == 'e' || j == 'E')
	//*  78  126:iload_2         
	//*  79  127:bipush          46
	//*  80  129:icmpeq          144
	//*  81  132:iload_2         
	//*  82  133:bipush          101
	//*  83  135:icmpeq          144
	//*  84  138:iload_2         
	//*  85  139:bipush          69
	//*  86  141:icmpne          169
				{
					_inputPtr = k;
	//   87  144:aload_0         
	//   88  145:iload_3         
	//   89  146:putfield        #52  <Field int _inputPtr>
					return _parseFloat(j, l, k, true, i);
	//   90  149:aload_0         
	//   91  150:iload_2         
	//   92  151:iload           4
	//   93  153:iload_3         
	//   94  154:iconst_1        
	//   95  155:iload_1         
	//   96  156:invokespecial   #611 <Method JsonToken _parseFloat(int, int, int, boolean, int)>
	//   97  159:areturn         
				}
				break;
			}
			i++;
	//   98  160:iload_1         
	//   99  161:iconst_1        
	//  100  162:iadd            
	//  101  163:istore_1        
			j = k;
	//  102  164:iload_3         
	//  103  165:istore_2        
		} while(true);
	//  104  166:goto            85
		k--;
	//  105  169:iload_3         
	//  106  170:iconst_1        
	//  107  171:isub            
	//  108  172:istore_3        
		_inputPtr = k;
	//  109  173:aload_0         
	//  110  174:iload_3         
	//  111  175:putfield        #52  <Field int _inputPtr>
		if(_parsingContext.inRoot())
	//* 112  178:aload_0         
	//* 113  179:getfield        #189 <Field JsonReadContext _parsingContext>
	//* 114  182:invokevirtual   #222 <Method boolean JsonReadContext.inRoot()>
	//* 115  185:ifeq            193
			_verifyRootSpace(j);
	//  116  188:aload_0         
	//  117  189:iload_2         
	//  118  190:invokespecial   #225 <Method void _verifyRootSpace(int)>
		_textBuffer.resetWithShared(_inputBuffer, l, k - l);
	//  119  193:aload_0         
	//  120  194:getfield        #78  <Field TextBuffer _textBuffer>
	//  121  197:aload_0         
	//  122  198:getfield        #49  <Field char[] _inputBuffer>
	//  123  201:iload           4
	//  124  203:iload_3         
	//  125  204:iload           4
	//  126  206:isub            
	//  127  207:invokevirtual   #84  <Method void TextBuffer.resetWithShared(char[], int, int)>
		return resetInt(true, i);
	//  128  210:aload_0         
	//  129  211:iconst_1        
	//  130  212:iload_1         
	//  131  213:invokevirtual   #614 <Method JsonToken resetInt(boolean, int)>
	//  132  216:areturn         
	}

	protected final JsonToken _parsePosNumber(int i)
		throws IOException
	{
		int j = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int _inputPtr>
	//    2    4:istore_2        
		int l = j - 1;
	//    3    5:iload_2         
	//    4    6:iconst_1        
	//    5    7:isub            
	//    6    8:istore          4
		int i1 = _inputEnd;
	//    7   10:aload_0         
	//    8   11:getfield        #55  <Field int _inputEnd>
	//    9   14:istore          5
		if(i == 48)
	//*  10   16:iload_1         
	//*  11   17:bipush          48
	//*  12   19:icmpne          30
			return _parseNumber2(false, l);
	//   13   22:aload_0         
	//   14   23:iconst_0        
	//   15   24:iload           4
	//   16   26:invokespecial   #211 <Method JsonToken _parseNumber2(boolean, int)>
	//   17   29:areturn         
		i = 1;
	//   18   30:iconst_1        
	//   19   31:istore_1        
		int k;
		do
		{
			if(j >= i1)
	//*  20   32:iload_2         
	//*  21   33:iload           5
	//*  22   35:icmplt          52
			{
				_inputPtr = l;
	//   23   38:aload_0         
	//   24   39:iload           4
	//   25   41:putfield        #52  <Field int _inputPtr>
				return _parseNumber2(false, l);
	//   26   44:aload_0         
	//   27   45:iconst_0        
	//   28   46:iload           4
	//   29   48:invokespecial   #211 <Method JsonToken _parseNumber2(boolean, int)>
	//   30   51:areturn         
			}
			char ac[] = _inputBuffer;
	//   31   52:aload_0         
	//   32   53:getfield        #49  <Field char[] _inputBuffer>
	//   33   56:astore          6
			k = j + 1;
	//   34   58:iload_2         
	//   35   59:iconst_1        
	//   36   60:iadd            
	//   37   61:istore_3        
			j = ((int) (ac[j]));
	//   38   62:aload           6
	//   39   64:iload_2         
	//   40   65:caload          
	//   41   66:istore_2        
			if(j < '0' || j > '9')
	//*  42   67:iload_2         
	//*  43   68:bipush          48
	//*  44   70:icmplt          79
	//*  45   73:iload_2         
	//*  46   74:bipush          57
	//*  47   76:icmple          113
			{
				if(j == '.' || j == 'e' || j == 'E')
	//*  48   79:iload_2         
	//*  49   80:bipush          46
	//*  50   82:icmpeq          97
	//*  51   85:iload_2         
	//*  52   86:bipush          101
	//*  53   88:icmpeq          97
	//*  54   91:iload_2         
	//*  55   92:bipush          69
	//*  56   94:icmpne          122
				{
					_inputPtr = k;
	//   57   97:aload_0         
	//   58   98:iload_3         
	//   59   99:putfield        #52  <Field int _inputPtr>
					return _parseFloat(j, l, k, false, i);
	//   60  102:aload_0         
	//   61  103:iload_2         
	//   62  104:iload           4
	//   63  106:iload_3         
	//   64  107:iconst_0        
	//   65  108:iload_1         
	//   66  109:invokespecial   #611 <Method JsonToken _parseFloat(int, int, int, boolean, int)>
	//   67  112:areturn         
				}
				break;
			}
			i++;
	//   68  113:iload_1         
	//   69  114:iconst_1        
	//   70  115:iadd            
	//   71  116:istore_1        
			j = k;
	//   72  117:iload_3         
	//   73  118:istore_2        
		} while(true);
	//   74  119:goto            32
		k--;
	//   75  122:iload_3         
	//   76  123:iconst_1        
	//   77  124:isub            
	//   78  125:istore_3        
		_inputPtr = k;
	//   79  126:aload_0         
	//   80  127:iload_3         
	//   81  128:putfield        #52  <Field int _inputPtr>
		if(_parsingContext.inRoot())
	//*  82  131:aload_0         
	//*  83  132:getfield        #189 <Field JsonReadContext _parsingContext>
	//*  84  135:invokevirtual   #222 <Method boolean JsonReadContext.inRoot()>
	//*  85  138:ifeq            146
			_verifyRootSpace(j);
	//   86  141:aload_0         
	//   87  142:iload_2         
	//   88  143:invokespecial   #225 <Method void _verifyRootSpace(int)>
		_textBuffer.resetWithShared(_inputBuffer, l, k - l);
	//   89  146:aload_0         
	//   90  147:getfield        #78  <Field TextBuffer _textBuffer>
	//   91  150:aload_0         
	//   92  151:getfield        #49  <Field char[] _inputBuffer>
	//   93  154:iload           4
	//   94  156:iload_3         
	//   95  157:iload           4
	//   96  159:isub            
	//   97  160:invokevirtual   #84  <Method void TextBuffer.resetWithShared(char[], int, int)>
		return resetInt(false, i);
	//   98  163:aload_0         
	//   99  164:iconst_0        
	//  100  165:iload_1         
	//  101  166:invokevirtual   #614 <Method JsonToken resetInt(boolean, int)>
	//  102  169:areturn         
	}

	protected int _readBinary(Base64Variant base64variant, OutputStream outputstream, byte abyte0[])
		throws IOException
	{
		int i;
		int l;
		int k1;
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		k1 = abyte0.length;
	//    2    3:aload_3         
	//    3    4:arraylength     
	//    4    5:istore          10
		l = 0;
	//    5    7:iconst_0        
	//    6    8:istore          7
_L8:
		char c;
		int k;
		int j1;
		do
		{
			if(_inputPtr >= _inputEnd)
	//*   7   10:aload_0         
	//*   8   11:getfield        #52  <Field int _inputPtr>
	//*   9   14:aload_0         
	//*  10   15:getfield        #55  <Field int _inputEnd>
	//*  11   18:icmplt          25
				loadMoreGuaranteed();
	//   12   21:aload_0         
	//   13   22:invokevirtual   #325 <Method void loadMoreGuaranteed()>
			char ac[] = _inputBuffer;
	//   14   25:aload_0         
	//   15   26:getfield        #49  <Field char[] _inputBuffer>
	//   16   29:astore          12
			int j = _inputPtr;
	//   17   31:aload_0         
	//   18   32:getfield        #52  <Field int _inputPtr>
	//   19   35:istore          6
			_inputPtr = j + 1;
	//   20   37:aload_0         
	//   21   38:iload           6
	//   22   40:iconst_1        
	//   23   41:iadd            
	//   24   42:putfield        #52  <Field int _inputPtr>
			c = ac[j];
	//   25   45:aload           12
	//   26   47:iload           6
	//   27   49:caload          
	//   28   50:istore          4
		} while(c <= ' ');
	//   29   52:iload           4
	//   30   54:bipush          32
	//   31   56:icmple          10
		k = base64variant.decodeBase64Char(c);
	//   32   59:aload_1         
	//   33   60:iload           4
	//   34   62:invokevirtual   #421 <Method int Base64Variant.decodeBase64Char(char)>
	//   35   65:istore          6
		j1 = k;
	//   36   67:iload           6
	//   37   69:istore          9
		if(k >= 0) goto _L2; else goto _L1
	//   38   71:iload           6
	//   39   73:ifge            134
_L1:
		if(c != '"') goto _L4; else goto _L3
	//   40   76:iload           4
	//   41   78:bipush          34
	//   42   80:icmpne          119
_L3:
		k = l;
	//   43   83:iload           7
	//   44   85:istore          6
_L6:
		_tokenIncomplete = false;
	//   45   87:aload_0         
	//   46   88:iconst_0        
	//   47   89:putfield        #143 <Field boolean _tokenIncomplete>
		l = k;
	//   48   92:iload           6
	//   49   94:istore          7
		if(i > 0)
	//*  50   96:iload           5
	//*  51   98:ifle            116
		{
			l = k + i;
	//   52  101:iload           6
	//   53  103:iload           5
	//   54  105:iadd            
	//   55  106:istore          7
			outputstream.write(abyte0, 0, i);
	//   56  108:aload_2         
	//   57  109:aload_3         
	//   58  110:iconst_0        
	//   59  111:iload           5
	//   60  113:invokevirtual   #622 <Method void OutputStream.write(byte[], int, int)>
		}
		return l;
	//   61  116:iload           7
	//   62  118:ireturn         
_L4:
		j1 = _decodeBase64Escape(base64variant, c, 0);
	//   63  119:aload_0         
	//   64  120:aload_1         
	//   65  121:iload           4
	//   66  123:iconst_0        
	//   67  124:invokevirtual   #431 <Method int _decodeBase64Escape(Base64Variant, char, int)>
	//   68  127:istore          9
		if(j1 < 0)
			continue; /* Loop/switch isn't completed */
	//   69  129:iload           9
	//   70  131:iflt            10
_L2:
		int i1;
		int l1;
		k = l;
	//   71  134:iload           7
	//   72  136:istore          6
		i1 = i;
	//   73  138:iload           5
	//   74  140:istore          8
		if(i > k1 - 3)
	//*  75  142:iload           5
	//*  76  144:iload           10
	//*  77  146:iconst_3        
	//*  78  147:isub            
	//*  79  148:icmple          169
		{
			k = l + i;
	//   80  151:iload           7
	//   81  153:iload           5
	//   82  155:iadd            
	//   83  156:istore          6
			outputstream.write(abyte0, 0, i);
	//   84  158:aload_2         
	//   85  159:aload_3         
	//   86  160:iconst_0        
	//   87  161:iload           5
	//   88  163:invokevirtual   #622 <Method void OutputStream.write(byte[], int, int)>
			i1 = 0;
	//   89  166:iconst_0        
	//   90  167:istore          8
		}
		if(_inputPtr >= _inputEnd)
	//*  91  169:aload_0         
	//*  92  170:getfield        #52  <Field int _inputPtr>
	//*  93  173:aload_0         
	//*  94  174:getfield        #55  <Field int _inputEnd>
	//*  95  177:icmplt          184
			loadMoreGuaranteed();
	//   96  180:aload_0         
	//   97  181:invokevirtual   #325 <Method void loadMoreGuaranteed()>
		char ac1[] = _inputBuffer;
	//   98  184:aload_0         
	//   99  185:getfield        #49  <Field char[] _inputBuffer>
	//  100  188:astore          12
		i = _inputPtr;
	//  101  190:aload_0         
	//  102  191:getfield        #52  <Field int _inputPtr>
	//  103  194:istore          5
		_inputPtr = i + 1;
	//  104  196:aload_0         
	//  105  197:iload           5
	//  106  199:iconst_1        
	//  107  200:iadd            
	//  108  201:putfield        #52  <Field int _inputPtr>
		c = ac1[i];
	//  109  204:aload           12
	//  110  206:iload           5
	//  111  208:caload          
	//  112  209:istore          4
		l = base64variant.decodeBase64Char(c);
	//  113  211:aload_1         
	//  114  212:iload           4
	//  115  214:invokevirtual   #421 <Method int Base64Variant.decodeBase64Char(char)>
	//  116  217:istore          7
		i = l;
	//  117  219:iload           7
	//  118  221:istore          5
		if(l < 0)
	//* 119  223:iload           7
	//* 120  225:ifge            238
			i = _decodeBase64Escape(base64variant, c, 1);
	//  121  228:aload_0         
	//  122  229:aload_1         
	//  123  230:iload           4
	//  124  232:iconst_1        
	//  125  233:invokevirtual   #431 <Method int _decodeBase64Escape(Base64Variant, char, int)>
	//  126  236:istore          5
		l1 = j1 << 6 | i;
	//  127  238:iload           9
	//  128  240:bipush          6
	//  129  242:ishl            
	//  130  243:iload           5
	//  131  245:ior             
	//  132  246:istore          11
		if(_inputPtr >= _inputEnd)
	//* 133  248:aload_0         
	//* 134  249:getfield        #52  <Field int _inputPtr>
	//* 135  252:aload_0         
	//* 136  253:getfield        #55  <Field int _inputEnd>
	//* 137  256:icmplt          263
			loadMoreGuaranteed();
	//  138  259:aload_0         
	//  139  260:invokevirtual   #325 <Method void loadMoreGuaranteed()>
		ac1 = _inputBuffer;
	//  140  263:aload_0         
	//  141  264:getfield        #49  <Field char[] _inputBuffer>
	//  142  267:astore          12
		i = _inputPtr;
	//  143  269:aload_0         
	//  144  270:getfield        #52  <Field int _inputPtr>
	//  145  273:istore          5
		_inputPtr = i + 1;
	//  146  275:aload_0         
	//  147  276:iload           5
	//  148  278:iconst_1        
	//  149  279:iadd            
	//  150  280:putfield        #52  <Field int _inputPtr>
		c = ac1[i];
	//  151  283:aload           12
	//  152  285:iload           5
	//  153  287:caload          
	//  154  288:istore          4
		l = base64variant.decodeBase64Char(c);
	//  155  290:aload_1         
	//  156  291:iload           4
	//  157  293:invokevirtual   #421 <Method int Base64Variant.decodeBase64Char(char)>
	//  158  296:istore          7
		j1 = l;
	//  159  298:iload           7
	//  160  300:istore          9
		if(l < 0)
	//* 161  302:iload           7
	//* 162  304:ifge            482
		{
			i = l;
	//  163  307:iload           7
	//  164  309:istore          5
			if(l != -2)
	//* 165  311:iload           7
	//* 166  313:bipush          -2
	//* 167  315:icmpeq          360
			{
				if(c == '"' && !base64variant.usesPadding())
	//* 168  318:iload           4
	//* 169  320:bipush          34
	//* 170  322:icmpne          350
	//* 171  325:aload_1         
	//* 172  326:invokevirtual   #434 <Method boolean Base64Variant.usesPadding()>
	//* 173  329:ifne            350
				{
					abyte0[i1] = (byte)(l1 >> 4);
	//  174  332:aload_3         
	//  175  333:iload           8
	//  176  335:iload           11
	//  177  337:iconst_4        
	//  178  338:ishr            
	//  179  339:int2byte        
	//  180  340:bastore         
					i = i1 + 1;
	//  181  341:iload           8
	//  182  343:iconst_1        
	//  183  344:iadd            
	//  184  345:istore          5
					continue; /* Loop/switch isn't completed */
	//  185  347:goto            87
				}
				i = _decodeBase64Escape(base64variant, c, 2);
	//  186  350:aload_0         
	//  187  351:aload_1         
	//  188  352:iload           4
	//  189  354:iconst_2        
	//  190  355:invokevirtual   #431 <Method int _decodeBase64Escape(Base64Variant, char, int)>
	//  191  358:istore          5
			}
			j1 = i;
	//  192  360:iload           5
	//  193  362:istore          9
			if(i == -2)
	//* 194  364:iload           5
	//* 195  366:bipush          -2
	//* 196  368:icmpne          482
			{
				if(_inputPtr >= _inputEnd)
	//* 197  371:aload_0         
	//* 198  372:getfield        #52  <Field int _inputPtr>
	//* 199  375:aload_0         
	//* 200  376:getfield        #55  <Field int _inputEnd>
	//* 201  379:icmplt          386
					loadMoreGuaranteed();
	//  202  382:aload_0         
	//  203  383:invokevirtual   #325 <Method void loadMoreGuaranteed()>
				ac1 = _inputBuffer;
	//  204  386:aload_0         
	//  205  387:getfield        #49  <Field char[] _inputBuffer>
	//  206  390:astore          12
				i = _inputPtr;
	//  207  392:aload_0         
	//  208  393:getfield        #52  <Field int _inputPtr>
	//  209  396:istore          5
				_inputPtr = i + 1;
	//  210  398:aload_0         
	//  211  399:iload           5
	//  212  401:iconst_1        
	//  213  402:iadd            
	//  214  403:putfield        #52  <Field int _inputPtr>
				c = ac1[i];
	//  215  406:aload           12
	//  216  408:iload           5
	//  217  410:caload          
	//  218  411:istore          4
				if(!base64variant.usesPaddingChar(c))
	//* 219  413:aload_1         
	//* 220  414:iload           4
	//* 221  416:invokevirtual   #439 <Method boolean Base64Variant.usesPaddingChar(char)>
	//* 222  419:ifne            460
					throw reportInvalidBase64Char(base64variant, ((int) (c)), 3, (new StringBuilder()).append("expected padding character '").append(base64variant.getPaddingChar()).append("'").toString());
	//  223  422:aload_0         
	//  224  423:aload_1         
	//  225  424:iload           4
	//  226  426:iconst_3        
	//  227  427:new             #233 <Class StringBuilder>
	//  228  430:dup             
	//  229  431:invokespecial   #235 <Method void StringBuilder()>
	//  230  434:ldc2            #441 <String "expected padding character '">
	//  231  437:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//  232  440:aload_1         
	//  233  441:invokevirtual   #444 <Method char Base64Variant.getPaddingChar()>
	//  234  444:invokevirtual   #244 <Method StringBuilder StringBuilder.append(char)>
	//  235  447:ldc2            #446 <String "'">
	//  236  450:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//  237  453:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  238  456:invokevirtual   #450 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int, String)>
	//  239  459:athrow          
				abyte0[i1] = (byte)(l1 >> 4);
	//  240  460:aload_3         
	//  241  461:iload           8
	//  242  463:iload           11
	//  243  465:iconst_4        
	//  244  466:ishr            
	//  245  467:int2byte        
	//  246  468:bastore         
				i = i1 + 1;
	//  247  469:iload           8
	//  248  471:iconst_1        
	//  249  472:iadd            
	//  250  473:istore          5
				l = k;
	//  251  475:iload           6
	//  252  477:istore          7
				continue; /* Loop/switch isn't completed */
	//  253  479:goto            10
			}
		}
		l1 = l1 << 6 | j1;
	//  254  482:iload           11
	//  255  484:bipush          6
	//  256  486:ishl            
	//  257  487:iload           9
	//  258  489:ior             
	//  259  490:istore          11
		if(_inputPtr >= _inputEnd)
	//* 260  492:aload_0         
	//* 261  493:getfield        #52  <Field int _inputPtr>
	//* 262  496:aload_0         
	//* 263  497:getfield        #55  <Field int _inputEnd>
	//* 264  500:icmplt          507
			loadMoreGuaranteed();
	//  265  503:aload_0         
	//  266  504:invokevirtual   #325 <Method void loadMoreGuaranteed()>
		ac1 = _inputBuffer;
	//  267  507:aload_0         
	//  268  508:getfield        #49  <Field char[] _inputBuffer>
	//  269  511:astore          12
		i = _inputPtr;
	//  270  513:aload_0         
	//  271  514:getfield        #52  <Field int _inputPtr>
	//  272  517:istore          5
		_inputPtr = i + 1;
	//  273  519:aload_0         
	//  274  520:iload           5
	//  275  522:iconst_1        
	//  276  523:iadd            
	//  277  524:putfield        #52  <Field int _inputPtr>
		c = ac1[i];
	//  278  527:aload           12
	//  279  529:iload           5
	//  280  531:caload          
	//  281  532:istore          4
		l = base64variant.decodeBase64Char(c);
	//  282  534:aload_1         
	//  283  535:iload           4
	//  284  537:invokevirtual   #421 <Method int Base64Variant.decodeBase64Char(char)>
	//  285  540:istore          7
		j1 = l;
	//  286  542:iload           7
	//  287  544:istore          9
		if(l >= 0)
			break MISSING_BLOCK_LABEL_677;
	//  288  546:iload           7
	//  289  548:ifge            677
		i = l;
	//  290  551:iload           7
	//  291  553:istore          5
		if(l == -2)
			break MISSING_BLOCK_LABEL_624;
	//  292  555:iload           7
	//  293  557:bipush          -2
	//  294  559:icmpeq          624
		if(c != '"' || base64variant.usesPadding())
			break; /* Loop/switch isn't completed */
	//  295  562:iload           4
	//  296  564:bipush          34
	//  297  566:icmpne          614
	//  298  569:aload_1         
	//  299  570:invokevirtual   #434 <Method boolean Base64Variant.usesPadding()>
	//  300  573:ifne            614
		l = l1 >> 2;
	//  301  576:iload           11
	//  302  578:iconst_2        
	//  303  579:ishr            
	//  304  580:istore          7
		j1 = i1 + 1;
	//  305  582:iload           8
	//  306  584:iconst_1        
	//  307  585:iadd            
	//  308  586:istore          9
		abyte0[i1] = (byte)(l >> 8);
	//  309  588:aload_3         
	//  310  589:iload           8
	//  311  591:iload           7
	//  312  593:bipush          8
	//  313  595:ishr            
	//  314  596:int2byte        
	//  315  597:bastore         
		i = j1 + 1;
	//  316  598:iload           9
	//  317  600:iconst_1        
	//  318  601:iadd            
	//  319  602:istore          5
		abyte0[j1] = (byte)l;
	//  320  604:aload_3         
	//  321  605:iload           9
	//  322  607:iload           7
	//  323  609:int2byte        
	//  324  610:bastore         
		if(true) goto _L6; else goto _L5
	//  325  611:goto            87
_L5:
		i = _decodeBase64Escape(base64variant, c, 3);
	//  326  614:aload_0         
	//  327  615:aload_1         
	//  328  616:iload           4
	//  329  618:iconst_3        
	//  330  619:invokevirtual   #431 <Method int _decodeBase64Escape(Base64Variant, char, int)>
	//  331  622:istore          5
		j1 = i;
	//  332  624:iload           5
	//  333  626:istore          9
		if(i == -2)
	//* 334  628:iload           5
	//* 335  630:bipush          -2
	//* 336  632:icmpne          677
		{
			l = l1 >> 2;
	//  337  635:iload           11
	//  338  637:iconst_2        
	//  339  638:ishr            
	//  340  639:istore          7
			j1 = i1 + 1;
	//  341  641:iload           8
	//  342  643:iconst_1        
	//  343  644:iadd            
	//  344  645:istore          9
			abyte0[i1] = (byte)(l >> 8);
	//  345  647:aload_3         
	//  346  648:iload           8
	//  347  650:iload           7
	//  348  652:bipush          8
	//  349  654:ishr            
	//  350  655:int2byte        
	//  351  656:bastore         
			i = j1 + 1;
	//  352  657:iload           9
	//  353  659:iconst_1        
	//  354  660:iadd            
	//  355  661:istore          5
			abyte0[j1] = (byte)l;
	//  356  663:aload_3         
	//  357  664:iload           9
	//  358  666:iload           7
	//  359  668:int2byte        
	//  360  669:bastore         
			l = k;
	//  361  670:iload           6
	//  362  672:istore          7
			continue; /* Loop/switch isn't completed */
	//  363  674:goto            10
		}
		i = l1 << 6 | j1;
	//  364  677:iload           11
	//  365  679:bipush          6
	//  366  681:ishl            
	//  367  682:iload           9
	//  368  684:ior             
	//  369  685:istore          5
		l = i1 + 1;
	//  370  687:iload           8
	//  371  689:iconst_1        
	//  372  690:iadd            
	//  373  691:istore          7
		abyte0[i1] = (byte)(i >> 16);
	//  374  693:aload_3         
	//  375  694:iload           8
	//  376  696:iload           5
	//  377  698:bipush          16
	//  378  700:ishr            
	//  379  701:int2byte        
	//  380  702:bastore         
		i1 = l + 1;
	//  381  703:iload           7
	//  382  705:iconst_1        
	//  383  706:iadd            
	//  384  707:istore          8
		abyte0[l] = (byte)(i >> 8);
	//  385  709:aload_3         
	//  386  710:iload           7
	//  387  712:iload           5
	//  388  714:bipush          8
	//  389  716:ishr            
	//  390  717:int2byte        
	//  391  718:bastore         
		abyte0[i1] = (byte)i;
	//  392  719:aload_3         
	//  393  720:iload           8
	//  394  722:iload           5
	//  395  724:int2byte        
	//  396  725:bastore         
		i = i1 + 1;
	//  397  726:iload           8
	//  398  728:iconst_1        
	//  399  729:iadd            
	//  400  730:istore          5
		l = k;
	//  401  732:iload           6
	//  402  734:istore          7
		if(true) goto _L8; else goto _L7
	//  403  736:goto            10
_L7:
	}

	protected void _releaseBuffers()
		throws IOException
	{
		super._releaseBuffers();
	//    0    0:aload_0         
	//    1    1:invokespecial   #625 <Method void ParserBase._releaseBuffers()>
		_symbols.release();
	//    2    4:aload_0         
	//    3    5:getfield        #59  <Field CharsToNameCanonicalizer _symbols>
	//    4    8:invokevirtual   #628 <Method void CharsToNameCanonicalizer.release()>
		if(_bufferRecyclable)
	//*   5   11:aload_0         
	//*   6   12:getfield        #69  <Field boolean _bufferRecyclable>
	//*   7   15:ifeq            40
		{
			char ac[] = _inputBuffer;
	//    8   18:aload_0         
	//    9   19:getfield        #49  <Field char[] _inputBuffer>
	//   10   22:astore_1        
			if(ac != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          40
			{
				_inputBuffer = null;
	//   13   27:aload_0         
	//   14   28:aconst_null     
	//   15   29:putfield        #49  <Field char[] _inputBuffer>
				_ioContext.releaseTokenBuffer(ac);
	//   16   32:aload_0         
	//   17   33:getfield        #398 <Field IOContext _ioContext>
	//   18   36:aload_1         
	//   19   37:invokevirtual   #632 <Method void IOContext.releaseTokenBuffer(char[])>
			}
		}
	//   20   40:return          
	}

	protected void _reportInvalidToken(String s)
		throws IOException
	{
		_reportInvalidToken(s, "'null', 'true', 'false' or NaN");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #634 <String "'null', 'true', 'false' or NaN">
	//    3    5:invokevirtual   #556 <Method void _reportInvalidToken(String, String)>
	//    4    8:return          
	}

	protected void _reportInvalidToken(String s, String s1)
		throws IOException
	{
		s = ((String) (new StringBuilder(s)));
	//    0    0:new             #233 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #636 <Method void StringBuilder(String)>
	//    4    8:astore_1        
_L5:
		if(_inputPtr < _inputEnd || loadMore()) goto _L2; else goto _L1
	//    5    9:aload_0         
	//    6   10:getfield        #52  <Field int _inputPtr>
	//    7   13:aload_0         
	//    8   14:getfield        #55  <Field int _inputEnd>
	//    9   17:icmplt          65
	//   10   20:aload_0         
	//   11   21:invokevirtual   #94  <Method boolean loadMore()>
	//   12   24:ifne            65
_L1:
		char c;
		_reportError((new StringBuilder()).append("Unrecognized token '").append(((StringBuilder) (s)).toString()).append("': was expecting ").append(s1).toString());
	//   13   27:aload_0         
	//   14   28:new             #233 <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #235 <Method void StringBuilder()>
	//   17   35:ldc2            #638 <String "Unrecognized token '">
	//   18   38:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:aload_1         
	//   20   42:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   21   45:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:ldc2            #640 <String "': was expecting ">
	//   23   51:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   24   54:aload_2         
	//   25   55:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   26   58:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   27   61:invokevirtual   #518 <Method void _reportError(String)>
		return;
	//   28   64:return          
	//*  29   65:aload_0         
	//*  30   66:getfield        #49  <Field char[] _inputBuffer>
	//*  31   69:aload_0         
	//*  32   70:getfield        #52  <Field int _inputPtr>
	//*  33   73:caload          
	//*  34   74:istore_3        
_L2:
		if(!Character.isJavaIdentifierPart(c = _inputBuffer[_inputPtr])) goto _L1; else goto _L3
	//   35   75:iload_3         
	//   36   76:invokestatic    #120 <Method boolean Character.isJavaIdentifierPart(char)>
	//   37   79:ifeq            27
_L3:
		_inputPtr = _inputPtr + 1;
	//   38   82:aload_0         
	//   39   83:aload_0         
	//   40   84:getfield        #52  <Field int _inputPtr>
	//   41   87:iconst_1        
	//   42   88:iadd            
	//   43   89:putfield        #52  <Field int _inputPtr>
		((StringBuilder) (s)).append(c);
	//   44   92:aload_1         
	//   45   93:iload_3         
	//   46   94:invokevirtual   #244 <Method StringBuilder StringBuilder.append(char)>
	//   47   97:pop             
		if(true) goto _L5; else goto _L4
	//   48   98:goto            9
_L4:
	}

	protected final void _skipCR()
		throws IOException
	{
		if((_inputPtr < _inputEnd || loadMore()) && _inputBuffer[_inputPtr] == '\n')
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #55  <Field int _inputEnd>
	//*   4    8:icmplt          18
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #94  <Method boolean loadMore()>
	//*   7   15:ifeq            42
	//*   8   18:aload_0         
	//*   9   19:getfield        #49  <Field char[] _inputBuffer>
	//*  10   22:aload_0         
	//*  11   23:getfield        #52  <Field int _inputPtr>
	//*  12   26:caload          
	//*  13   27:bipush          10
	//*  14   29:icmpne          42
			_inputPtr = _inputPtr + 1;
	//   15   32:aload_0         
	//   16   33:aload_0         
	//   17   34:getfield        #52  <Field int _inputPtr>
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #52  <Field int _inputPtr>
		_currInputRow = _currInputRow + 1;
	//   21   42:aload_0         
	//   22   43:aload_0         
	//   23   44:getfield        #294 <Field int _currInputRow>
	//   24   47:iconst_1        
	//   25   48:iadd            
	//   26   49:putfield        #294 <Field int _currInputRow>
		_currInputRowStart = _inputPtr;
	//   27   52:aload_0         
	//   28   53:aload_0         
	//   29   54:getfield        #52  <Field int _inputPtr>
	//   30   57:putfield        #297 <Field int _currInputRowStart>
	//   31   60:return          
	}

	protected final void _skipString()
		throws IOException
	{
		_tokenIncomplete = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #143 <Field boolean _tokenIncomplete>
		int i = _inputPtr;
	//    3    5:aload_0         
	//    4    6:getfield        #52  <Field int _inputPtr>
	//    5    9:istore_1        
		int j = _inputEnd;
	//    6   10:aload_0         
	//    7   11:getfield        #55  <Field int _inputEnd>
	//    8   14:istore_2        
		char ac[] = _inputBuffer;
	//    9   15:aload_0         
	//   10   16:getfield        #49  <Field char[] _inputBuffer>
	//   11   19:astore          5
		do
		{
			int k = j;
	//   12   21:iload_2         
	//   13   22:istore_3        
			int l = i;
	//   14   23:iload_1         
	//   15   24:istore          4
			if(i >= j)
	//*  16   26:iload_1         
	//*  17   27:iload_2         
	//*  18   28:icmplt          61
			{
				_inputPtr = i;
	//   19   31:aload_0         
	//   20   32:iload_1         
	//   21   33:putfield        #52  <Field int _inputPtr>
				if(!loadMore())
	//*  22   36:aload_0         
	//*  23   37:invokevirtual   #94  <Method boolean loadMore()>
	//*  24   40:ifne            50
					_reportInvalidEOF(": was expecting closing quote for a string value");
	//   25   43:aload_0         
	//   26   44:ldc2            #476 <String ": was expecting closing quote for a string value">
	//   27   47:invokevirtual   #254 <Method void _reportInvalidEOF(String)>
				l = _inputPtr;
	//   28   50:aload_0         
	//   29   51:getfield        #52  <Field int _inputPtr>
	//   30   54:istore          4
				k = _inputEnd;
	//   31   56:aload_0         
	//   32   57:getfield        #55  <Field int _inputEnd>
	//   33   60:istore_3        
			}
			i = l + 1;
	//   34   61:iload           4
	//   35   63:iconst_1        
	//   36   64:iadd            
	//   37   65:istore_1        
			j = ((int) (ac[l]));
	//   38   66:aload           5
	//   39   68:iload           4
	//   40   70:caload          
	//   41   71:istore_2        
			if(j <= '\\')
	//*  42   72:iload_2         
	//*  43   73:bipush          92
	//*  44   75:icmpgt          144
			{
				if(j == '\\')
	//*  45   78:iload_2         
	//*  46   79:bipush          92
	//*  47   81:icmpne          107
				{
					_inputPtr = i;
	//   48   84:aload_0         
	//   49   85:iload_1         
	//   50   86:putfield        #52  <Field int _inputPtr>
					_decodeEscaped();
	//   51   89:aload_0         
	//   52   90:invokevirtual   #258 <Method char _decodeEscaped()>
	//   53   93:pop             
					i = _inputPtr;
	//   54   94:aload_0         
	//   55   95:getfield        #52  <Field int _inputPtr>
	//   56   98:istore_1        
					j = _inputEnd;
	//   57   99:aload_0         
	//   58  100:getfield        #55  <Field int _inputEnd>
	//   59  103:istore_2        
					continue;
	//   60  104:goto            21
				}
				if(j <= 34)
	//*  61  107:iload_2         
	//*  62  108:bipush          34
	//*  63  110:icmpgt          144
				{
					if(j == 34)
	//*  64  113:iload_2         
	//*  65  114:bipush          34
	//*  66  116:icmpne          125
					{
						_inputPtr = i;
	//   67  119:aload_0         
	//   68  120:iload_1         
	//   69  121:putfield        #52  <Field int _inputPtr>
						return;
	//   70  124:return          
					}
					if(j < 32)
	//*  71  125:iload_2         
	//*  72  126:bipush          32
	//*  73  128:icmpge          144
					{
						_inputPtr = i;
	//   74  131:aload_0         
	//   75  132:iload_1         
	//   76  133:putfield        #52  <Field int _inputPtr>
						_throwUnquotedSpace(j, "string value");
	//   77  136:aload_0         
	//   78  137:iload_2         
	//   79  138:ldc2            #478 <String "string value">
	//   80  141:invokevirtual   #263 <Method void _throwUnquotedSpace(int, String)>
					}
				}
			}
			j = k;
	//   81  144:iload_3         
	//   82  145:istore_2        
		} while(true);
	//   83  146:goto            21
	}

	public byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException
	{
		if(_currToken != JsonToken.VALUE_STRING && (_currToken != JsonToken.VALUE_EMBEDDED_OBJECT || _binaryValue == null))
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field JsonToken _currToken>
	//*   2    4:getstatic       #146 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpeq       60
	//*   4   10:aload_0         
	//*   5   11:getfield        #131 <Field JsonToken _currToken>
	//*   6   14:getstatic       #647 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//*   7   17:if_acmpne       27
	//*   8   20:aload_0         
	//*   9   21:getfield        #651 <Field byte[] _binaryValue>
	//*  10   24:ifnonnull       60
			_reportError((new StringBuilder()).append("Current token (").append(((Object) (_currToken))).append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary").toString());
	//   11   27:aload_0         
	//   12   28:new             #233 <Class StringBuilder>
	//   13   31:dup             
	//   14   32:invokespecial   #235 <Method void StringBuilder()>
	//   15   35:ldc2            #653 <String "Current token (">
	//   16   38:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   17   41:aload_0         
	//   18   42:getfield        #131 <Field JsonToken _currToken>
	//   19   45:invokevirtual   #656 <Method StringBuilder StringBuilder.append(Object)>
	//   20   48:ldc2            #658 <String ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary">
	//   21   51:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   22   54:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   23   57:invokevirtual   #518 <Method void _reportError(String)>
		if(!_tokenIncomplete) goto _L2; else goto _L1
	//   24   60:aload_0         
	//   25   61:getfield        #143 <Field boolean _tokenIncomplete>
	//   26   64:ifeq            125
_L1:
		try
		{
			_binaryValue = _decodeBase64(base64variant);
	//   27   67:aload_0         
	//   28   68:aload_0         
	//   29   69:aload_1         
	//   30   70:invokevirtual   #660 <Method byte[] _decodeBase64(Base64Variant)>
	//   31   73:putfield        #651 <Field byte[] _binaryValue>
		}
	//*  32   76:aload_0         
	//*  33   77:iconst_0        
	//*  34   78:putfield        #143 <Field boolean _tokenIncomplete>
	//*  35   81:aload_0         
	//*  36   82:getfield        #651 <Field byte[] _binaryValue>
	//*  37   85:areturn         
		catch(IllegalArgumentException illegalargumentexception)
	//*  38   86:astore_2        
		{
			throw _constructError((new StringBuilder()).append("Failed to decode VALUE_STRING as base64 (").append(((Object) (base64variant))).append("): ").append(illegalargumentexception.getMessage()).toString());
	//   39   87:aload_0         
	//   40   88:new             #233 <Class StringBuilder>
	//   41   91:dup             
	//   42   92:invokespecial   #235 <Method void StringBuilder()>
	//   43   95:ldc2            #662 <String "Failed to decode VALUE_STRING as base64 (">
	//   44   98:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   45  101:aload_1         
	//   46  102:invokevirtual   #656 <Method StringBuilder StringBuilder.append(Object)>
	//   47  105:ldc2            #664 <String "): ">
	//   48  108:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   49  111:aload_2         
	//   50  112:invokevirtual   #667 <Method String IllegalArgumentException.getMessage()>
	//   51  115:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   52  118:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   53  121:invokevirtual   #314 <Method com.fasterxml.jackson.core.JsonParseException _constructError(String)>
	//   54  124:athrow          
		}
		_tokenIncomplete = false;
_L4:
		return _binaryValue;
_L2:
		if(_binaryValue == null)
	//*  55  125:aload_0         
	//*  56  126:getfield        #651 <Field byte[] _binaryValue>
	//*  57  129:ifnonnull       81
		{
			ByteArrayBuilder bytearraybuilder = _getByteArrayBuilder();
	//   58  132:aload_0         
	//   59  133:invokevirtual   #415 <Method ByteArrayBuilder _getByteArrayBuilder()>
	//   60  136:astore_2        
			_decodeBase64(getText(), bytearraybuilder, base64variant);
	//   61  137:aload_0         
	//   62  138:aload_0         
	//   63  139:invokevirtual   #670 <Method String getText()>
	//   64  142:aload_2         
	//   65  143:aload_1         
	//   66  144:invokevirtual   #673 <Method void _decodeBase64(String, ByteArrayBuilder, Base64Variant)>
			_binaryValue = bytearraybuilder.toByteArray();
	//   67  147:aload_0         
	//   68  148:aload_2         
	//   69  149:invokevirtual   #427 <Method byte[] ByteArrayBuilder.toByteArray()>
	//   70  152:putfield        #651 <Field byte[] _binaryValue>
		}
		if(true) goto _L4; else goto _L3
	//   71  155:goto            81
_L3:
	}

	public ObjectCodec getCodec()
	{
		return _objectCodec;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field ObjectCodec _objectCodec>
	//    2    4:areturn         
	}

	public JsonLocation getCurrentLocation()
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int _inputPtr>
	//    2    4:istore_1        
		int j = _currInputRowStart;
	//    3    5:aload_0         
	//    4    6:getfield        #297 <Field int _currInputRowStart>
	//    5    9:istore_2        
		return new JsonLocation(_ioContext.getSourceReference(), -1L, _currInputProcessed + (long)_inputPtr, _currInputRow, (i - j) + 1);
	//    6   10:new             #679 <Class JsonLocation>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #398 <Field IOContext _ioContext>
	//   10   18:invokevirtual   #683 <Method Object IOContext.getSourceReference()>
	//   11   21:ldc2w           #684 <Long -1L>
	//   12   24:aload_0         
	//   13   25:getfield        #369 <Field long _currInputProcessed>
	//   14   28:aload_0         
	//   15   29:getfield        #52  <Field int _inputPtr>
	//   16   32:i2l             
	//   17   33:ladd            
	//   18   34:aload_0         
	//   19   35:getfield        #294 <Field int _currInputRow>
	//   20   38:iload_1         
	//   21   39:iload_2         
	//   22   40:isub            
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:invokespecial   #688 <Method void JsonLocation(Object, long, long, int, int)>
	//   26   46:areturn         
	}

	public Object getInputSource()
	{
		return ((Object) (_reader));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Reader _reader>
	//    2    4:areturn         
	}

	protected char getNextChar(String s)
		throws IOException
	{
		if(_inputPtr >= _inputEnd && !loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #55  <Field int _inputEnd>
	//*   4    8:icmplt          23
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #94  <Method boolean loadMore()>
	//*   7   15:ifne            23
			_reportInvalidEOF(s);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #254 <Method void _reportInvalidEOF(String)>
		s = ((String) (_inputBuffer));
	//   11   23:aload_0         
	//   12   24:getfield        #49  <Field char[] _inputBuffer>
	//   13   27:astore_1        
		int i = _inputPtr;
	//   14   28:aload_0         
	//   15   29:getfield        #52  <Field int _inputPtr>
	//   16   32:istore_2        
		_inputPtr = i + 1;
	//   17   33:aload_0         
	//   18   34:iload_2         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:putfield        #52  <Field int _inputPtr>
		return s[i];
	//   22   40:aload_1         
	//   23   41:iload_2         
	//   24   42:caload          
	//   25   43:ireturn         
	}

	public final String getText()
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field JsonToken _currToken>
	//    2    4:astore_1        
		if(jsontoken == JsonToken.VALUE_STRING)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #146 <Field JsonToken JsonToken.VALUE_STRING>
	//*   5    9:if_acmpne       36
		{
			if(_tokenIncomplete)
	//*   6   12:aload_0         
	//*   7   13:getfield        #143 <Field boolean _tokenIncomplete>
	//*   8   16:ifeq            28
			{
				_tokenIncomplete = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #143 <Field boolean _tokenIncomplete>
				_finishString();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #691 <Method void _finishString()>
			}
			return _textBuffer.contentsAsString();
	//   14   28:aload_0         
	//   15   29:getfield        #78  <Field TextBuffer _textBuffer>
	//   16   32:invokevirtual   #492 <Method String TextBuffer.contentsAsString()>
	//   17   35:areturn         
		} else
		{
			return _getText2(jsontoken);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #693 <Method String _getText2(JsonToken)>
	//   21   41:areturn         
		}
	}

	public final char[] getTextCharacters()
		throws IOException
	{
		if(_currToken == null)
			break MISSING_BLOCK_LABEL_155;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field JsonToken _currToken>
	//    2    4:ifnull          155
		_currToken.id();
	//    3    7:aload_0         
	//    4    8:getfield        #131 <Field JsonToken _currToken>
	//    5   11:invokevirtual   #483 <Method int JsonToken.id()>
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
	//    8   45:getfield        #131 <Field JsonToken _currToken>
	//    9   48:invokevirtual   #697 <Method char[] JsonToken.asCharArray()>
	//   10   51:areturn         
_L2:
		if(_nameCopied) goto _L6; else goto _L5
	//   11   52:aload_0         
	//   12   53:getfield        #185 <Field boolean _nameCopied>
	//   13   56:ifne            107
_L5:
		int i;
		String s;
		s = _parsingContext.getCurrentName();
	//   14   59:aload_0         
	//   15   60:getfield        #189 <Field JsonReadContext _parsingContext>
	//   16   63:invokevirtual   #489 <Method String JsonReadContext.getCurrentName()>
	//   17   66:astore_2        
		i = s.length();
	//   18   67:aload_2         
	//   19   68:invokevirtual   #597 <Method int String.length()>
	//   20   71:istore_1        
		if(_nameCopyBuffer != null) goto _L8; else goto _L7
	//   21   72:aload_0         
	//   22   73:getfield        #700 <Field char[] _nameCopyBuffer>
	//   23   76:ifnonnull       112
_L7:
		_nameCopyBuffer = _ioContext.allocNameCopyBuffer(i);
	//   24   79:aload_0         
	//   25   80:aload_0         
	//   26   81:getfield        #398 <Field IOContext _ioContext>
	//   27   84:iload_1         
	//   28   85:invokevirtual   #704 <Method char[] IOContext.allocNameCopyBuffer(int)>
	//   29   88:putfield        #700 <Field char[] _nameCopyBuffer>
_L10:
		s.getChars(0, i, _nameCopyBuffer, 0);
	//   30   91:aload_2         
	//   31   92:iconst_0        
	//   32   93:iload_1         
	//   33   94:aload_0         
	//   34   95:getfield        #700 <Field char[] _nameCopyBuffer>
	//   35   98:iconst_0        
	//   36   99:invokevirtual   #708 <Method void String.getChars(int, int, char[], int)>
		_nameCopied = true;
	//   37  102:aload_0         
	//   38  103:iconst_1        
	//   39  104:putfield        #185 <Field boolean _nameCopied>
_L6:
		return _nameCopyBuffer;
	//   40  107:aload_0         
	//   41  108:getfield        #700 <Field char[] _nameCopyBuffer>
	//   42  111:areturn         
_L8:
		if(_nameCopyBuffer.length < i)
	//*  43  112:aload_0         
	//*  44  113:getfield        #700 <Field char[] _nameCopyBuffer>
	//*  45  116:arraylength     
	//*  46  117:iload_1         
	//*  47  118:icmpge          91
			_nameCopyBuffer = new char[i];
	//   48  121:aload_0         
	//   49  122:iload_1         
	//   50  123:newarray        char[]
	//   51  125:putfield        #700 <Field char[] _nameCopyBuffer>
		if(true) goto _L10; else goto _L9
	//   52  128:goto            91
_L9:
		break; /* Loop/switch isn't completed */
_L3:
		if(_tokenIncomplete)
	//*  53  131:aload_0         
	//*  54  132:getfield        #143 <Field boolean _tokenIncomplete>
	//*  55  135:ifeq            147
		{
			_tokenIncomplete = false;
	//   56  138:aload_0         
	//   57  139:iconst_0        
	//   58  140:putfield        #143 <Field boolean _tokenIncomplete>
			_finishString();
	//   59  143:aload_0         
	//   60  144:invokevirtual   #691 <Method void _finishString()>
		}
		return _textBuffer.getTextBuffer();
	//   61  147:aload_0         
	//   62  148:getfield        #78  <Field TextBuffer _textBuffer>
	//   63  151:invokevirtual   #101 <Method char[] TextBuffer.getTextBuffer()>
	//   64  154:areturn         
		return null;
	//   65  155:aconst_null     
	//   66  156:areturn         
	}

	public final int getTextLength()
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
	//*   3    3:getfield        #131 <Field JsonToken _currToken>
	//*   4    6:ifnull          57
						switch(_currToken.id())
	//*   5    9:aload_0         
	//*   6   10:getfield        #131 <Field JsonToken _currToken>
	//*   7   13:invokevirtual   #483 <Method int JsonToken.id()>
						{
	//*   8   16:tableswitch     5 8: default 48
	//	               5 59
	//	               6 70
	//	               7 86
	//	               8 86
						default:
							i = _currToken.asCharArray().length;
	//    9   48:aload_0         
	//   10   49:getfield        #131 <Field JsonToken _currToken>
	//   11   52:invokevirtual   #697 <Method char[] JsonToken.asCharArray()>
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
	//   17   60:getfield        #189 <Field JsonReadContext _parsingContext>
	//   18   63:invokevirtual   #489 <Method String JsonReadContext.getCurrentName()>
	//   19   66:invokevirtual   #597 <Method int String.length()>
	//   20   69:ireturn         
			}
			if(_tokenIncomplete)
	//*  21   70:aload_0         
	//*  22   71:getfield        #143 <Field boolean _tokenIncomplete>
	//*  23   74:ifeq            86
			{
				_tokenIncomplete = false;
	//   24   77:aload_0         
	//   25   78:iconst_0        
	//   26   79:putfield        #143 <Field boolean _tokenIncomplete>
				_finishString();
	//   27   82:aload_0         
	//   28   83:invokevirtual   #691 <Method void _finishString()>
			}
		}
		return _textBuffer.size();
	//   29   86:aload_0         
	//   30   87:getfield        #78  <Field TextBuffer _textBuffer>
	//   31   90:invokevirtual   #107 <Method int TextBuffer.size()>
	//   32   93:ireturn         
	}

	public final int getTextOffset()
		throws IOException
	{
		if(_currToken == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field JsonToken _currToken>
	//    2    4:ifnull          44
_L1:
		_currToken.id();
	//    3    7:aload_0         
	//    4    8:getfield        #131 <Field JsonToken _currToken>
	//    5   11:invokevirtual   #483 <Method int JsonToken.id()>
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
	//*  10   47:getfield        #143 <Field boolean _tokenIncomplete>
	//*  11   50:ifeq            62
		{
			_tokenIncomplete = false;
	//   12   53:aload_0         
	//   13   54:iconst_0        
	//   14   55:putfield        #143 <Field boolean _tokenIncomplete>
			_finishString();
	//   15   58:aload_0         
	//   16   59:invokevirtual   #691 <Method void _finishString()>
		}
_L4:
		return _textBuffer.getTextOffset();
	//   17   62:aload_0         
	//   18   63:getfield        #78  <Field TextBuffer _textBuffer>
	//   19   66:invokevirtual   #104 <Method int TextBuffer.getTextOffset()>
	//   20   69:ireturn         
	}

	public JsonLocation getTokenLocation()
	{
		Object obj = _ioContext.getSourceReference();
	//    0    0:aload_0         
	//    1    1:getfield        #398 <Field IOContext _ioContext>
	//    2    4:invokevirtual   #683 <Method Object IOContext.getSourceReference()>
	//    3    7:astore_1        
		if(_currToken == JsonToken.FIELD_NAME)
	//*   4    8:aload_0         
	//*   5    9:getfield        #131 <Field JsonToken _currToken>
	//*   6   12:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//*   7   15:if_acmpne       49
			return new JsonLocation(obj, -1L, _currInputProcessed + (_nameStartOffset - 1L), _nameStartRow, _nameStartCol);
	//    8   18:new             #679 <Class JsonLocation>
	//    9   21:dup             
	//   10   22:aload_1         
	//   11   23:ldc2w           #684 <Long -1L>
	//   12   26:aload_0         
	//   13   27:getfield        #369 <Field long _currInputProcessed>
	//   14   30:aload_0         
	//   15   31:getfield        #375 <Field long _nameStartOffset>
	//   16   34:lconst_1        
	//   17   35:lsub            
	//   18   36:ladd            
	//   19   37:aload_0         
	//   20   38:getfield        #377 <Field int _nameStartRow>
	//   21   41:aload_0         
	//   22   42:getfield        #379 <Field int _nameStartCol>
	//   23   45:invokespecial   #688 <Method void JsonLocation(Object, long, long, int, int)>
	//   24   48:areturn         
		else
			return new JsonLocation(obj, -1L, _tokenInputTotal - 1L, _tokenInputRow, _tokenInputCol);
	//   25   49:new             #679 <Class JsonLocation>
	//   26   52:dup             
	//   27   53:aload_1         
	//   28   54:ldc2w           #684 <Long -1L>
	//   29   57:aload_0         
	//   30   58:getfield        #372 <Field long _tokenInputTotal>
	//   31   61:lconst_1        
	//   32   62:lsub            
	//   33   63:aload_0         
	//   34   64:getfield        #192 <Field int _tokenInputRow>
	//   35   67:aload_0         
	//   36   68:getfield        #195 <Field int _tokenInputCol>
	//   37   71:invokespecial   #688 <Method void JsonLocation(Object, long, long, int, int)>
	//   38   74:areturn         
	}

	public final String getValueAsString()
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field JsonToken _currToken>
	//*   2    4:getstatic       #146 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       34
		{
			if(_tokenIncomplete)
	//*   4   10:aload_0         
	//*   5   11:getfield        #143 <Field boolean _tokenIncomplete>
	//*   6   14:ifeq            26
			{
				_tokenIncomplete = false;
	//    7   17:aload_0         
	//    8   18:iconst_0        
	//    9   19:putfield        #143 <Field boolean _tokenIncomplete>
				_finishString();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #691 <Method void _finishString()>
			}
			return _textBuffer.contentsAsString();
	//   12   26:aload_0         
	//   13   27:getfield        #78  <Field TextBuffer _textBuffer>
	//   14   30:invokevirtual   #492 <Method String TextBuffer.contentsAsString()>
	//   15   33:areturn         
		}
		if(_currToken == JsonToken.FIELD_NAME)
	//*  16   34:aload_0         
	//*  17   35:getfield        #131 <Field JsonToken _currToken>
	//*  18   38:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//*  19   41:if_acmpne       49
			return getCurrentName();
	//   20   44:aload_0         
	//   21   45:invokevirtual   #712 <Method String getCurrentName()>
	//   22   48:areturn         
		else
			return super.getValueAsString(((String) (null)));
	//   23   49:aload_0         
	//   24   50:aconst_null     
	//   25   51:invokespecial   #715 <Method String ParserBase.getValueAsString(String)>
	//   26   54:areturn         
	}

	public final String getValueAsString(String s)
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field JsonToken _currToken>
	//*   2    4:getstatic       #146 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       34
		{
			if(_tokenIncomplete)
	//*   4   10:aload_0         
	//*   5   11:getfield        #143 <Field boolean _tokenIncomplete>
	//*   6   14:ifeq            26
			{
				_tokenIncomplete = false;
	//    7   17:aload_0         
	//    8   18:iconst_0        
	//    9   19:putfield        #143 <Field boolean _tokenIncomplete>
				_finishString();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #691 <Method void _finishString()>
			}
			return _textBuffer.contentsAsString();
	//   12   26:aload_0         
	//   13   27:getfield        #78  <Field TextBuffer _textBuffer>
	//   14   30:invokevirtual   #492 <Method String TextBuffer.contentsAsString()>
	//   15   33:areturn         
		}
		if(_currToken == JsonToken.FIELD_NAME)
	//*  16   34:aload_0         
	//*  17   35:getfield        #131 <Field JsonToken _currToken>
	//*  18   38:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//*  19   41:if_acmpne       49
			return getCurrentName();
	//   20   44:aload_0         
	//   21   45:invokevirtual   #712 <Method String getCurrentName()>
	//   22   48:areturn         
		else
			return super.getValueAsString(s);
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:invokespecial   #715 <Method String ParserBase.getValueAsString(String)>
	//   26   54:areturn         
	}

	protected boolean loadMore()
		throws IOException
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int i = _inputEnd;
	//    2    2:aload_0         
	//    3    3:getfield        #55  <Field int _inputEnd>
	//    4    6:istore_1        
		_currInputProcessed = _currInputProcessed + (long)i;
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #369 <Field long _currInputProcessed>
	//    8   12:iload_1         
	//    9   13:i2l             
	//   10   14:ladd            
	//   11   15:putfield        #369 <Field long _currInputProcessed>
		_currInputRowStart = _currInputRowStart - i;
	//   12   18:aload_0         
	//   13   19:aload_0         
	//   14   20:getfield        #297 <Field int _currInputRowStart>
	//   15   23:iload_1         
	//   16   24:isub            
	//   17   25:putfield        #297 <Field int _currInputRowStart>
		_nameStartOffset = _nameStartOffset - (long)i;
	//   18   28:aload_0         
	//   19   29:aload_0         
	//   20   30:getfield        #375 <Field long _nameStartOffset>
	//   21   33:iload_1         
	//   22   34:i2l             
	//   23   35:lsub            
	//   24   36:putfield        #375 <Field long _nameStartOffset>
		boolean flag = flag1;
	//   25   39:iload_3         
	//   26   40:istore_2        
		if(_reader != null)
	//*  27   41:aload_0         
	//*  28   42:getfield        #41  <Field Reader _reader>
	//*  29   45:ifnull          82
		{
			int j = _reader.read(_inputBuffer, 0, _inputBuffer.length);
	//   30   48:aload_0         
	//   31   49:getfield        #41  <Field Reader _reader>
	//   32   52:aload_0         
	//   33   53:getfield        #49  <Field char[] _inputBuffer>
	//   34   56:iconst_0        
	//   35   57:aload_0         
	//   36   58:getfield        #49  <Field char[] _inputBuffer>
	//   37   61:arraylength     
	//   38   62:invokevirtual   #719 <Method int Reader.read(char[], int, int)>
	//   39   65:istore_1        
			if(j > 0)
	//*  40   66:iload_1         
	//*  41   67:ifle            84
			{
				_inputPtr = 0;
	//   42   70:aload_0         
	//   43   71:iconst_0        
	//   44   72:putfield        #52  <Field int _inputPtr>
				_inputEnd = j;
	//   45   75:aload_0         
	//   46   76:iload_1         
	//   47   77:putfield        #55  <Field int _inputEnd>
				flag = true;
	//   48   80:iconst_1        
	//   49   81:istore_2        
			} else
	//*  50   82:iload_2         
	//*  51   83:ireturn         
			{
				_closeInput();
	//   52   84:aload_0         
	//   53   85:invokevirtual   #721 <Method void _closeInput()>
				flag = flag1;
	//   54   88:iload_3         
	//   55   89:istore_2        
				if(j == 0)
	//*  56   90:iload_1         
	//*  57   91:ifne            82
					throw new IOException((new StringBuilder()).append("Reader returned 0 characters when trying to read ").append(_inputEnd).toString());
	//   58   94:new             #74  <Class IOException>
	//   59   97:dup             
	//   60   98:new             #233 <Class StringBuilder>
	//   61  101:dup             
	//   62  102:invokespecial   #235 <Method void StringBuilder()>
	//   63  105:ldc2            #723 <String "Reader returned 0 characters when trying to read ">
	//   64  108:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//   65  111:aload_0         
	//   66  112:getfield        #55  <Field int _inputEnd>
	//   67  115:invokevirtual   #726 <Method StringBuilder StringBuilder.append(int)>
	//   68  118:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   69  121:invokespecial   #727 <Method void IOException(String)>
	//   70  124:athrow          
			}
		}
		return flag;
	}

	public final Boolean nextBooleanValue()
		throws IOException
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		if(_currToken != JsonToken.FIELD_NAME) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #131 <Field JsonToken _currToken>
	//    4    6:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//    5    9:if_acmpne       120
_L1:
		JsonToken jsontoken;
		_nameCopied = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #185 <Field boolean _nameCopied>
		jsontoken = _nextToken;
	//    9   17:aload_0         
	//   10   18:getfield        #141 <Field JsonToken _nextToken>
	//   11   21:astore          4
		_nextToken = null;
	//   12   23:aload_0         
	//   13   24:aconst_null     
	//   14   25:putfield        #141 <Field JsonToken _nextToken>
		_currToken = jsontoken;
	//   15   28:aload_0         
	//   16   29:aload           4
	//   17   31:putfield        #131 <Field JsonToken _currToken>
		if(jsontoken != JsonToken.VALUE_TRUE) goto _L4; else goto _L3
	//   18   34:aload           4
	//   19   36:getstatic       #161 <Field JsonToken JsonToken.VALUE_TRUE>
	//   20   39:if_acmpne       48
_L3:
		Boolean boolean1 = Boolean.TRUE;
	//   21   42:getstatic       #735 <Field Boolean Boolean.TRUE>
	//   22   45:astore_2        
_L6:
		return boolean1;
	//   23   46:aload_2         
	//   24   47:areturn         
_L4:
		if(jsontoken == JsonToken.VALUE_FALSE)
	//*  25   48:aload           4
	//*  26   50:getstatic       #166 <Field JsonToken JsonToken.VALUE_FALSE>
	//*  27   53:if_acmpne       60
			return Boolean.FALSE;
	//   28   56:getstatic       #738 <Field Boolean Boolean.FALSE>
	//   29   59:areturn         
		if(jsontoken == JsonToken.START_ARRAY)
	//*  30   60:aload           4
	//*  31   62:getstatic       #149 <Field JsonToken JsonToken.START_ARRAY>
	//*  32   65:if_acmpne       89
		{
			_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   33   68:aload_0         
	//   34   69:aload_0         
	//   35   70:getfield        #189 <Field JsonReadContext _parsingContext>
	//   36   73:aload_0         
	//   37   74:getfield        #192 <Field int _tokenInputRow>
	//   38   77:aload_0         
	//   39   78:getfield        #195 <Field int _tokenInputCol>
	//   40   81:invokevirtual   #201 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   41   84:putfield        #189 <Field JsonReadContext _parsingContext>
			return null;
	//   42   87:aconst_null     
	//   43   88:areturn         
		}
		boolean1 = ((Boolean) (obj));
	//   44   89:aload_3         
	//   45   90:astore_2        
		if(jsontoken == JsonToken.START_OBJECT)
	//*  46   91:aload           4
	//*  47   93:getstatic       #152 <Field JsonToken JsonToken.START_OBJECT>
	//*  48   96:if_acmpne       46
		{
			_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   49   99:aload_0         
	//   50  100:aload_0         
	//   51  101:getfield        #189 <Field JsonReadContext _parsingContext>
	//   52  104:aload_0         
	//   53  105:getfield        #192 <Field int _tokenInputRow>
	//   54  108:aload_0         
	//   55  109:getfield        #195 <Field int _tokenInputCol>
	//   56  112:invokevirtual   #204 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   57  115:putfield        #189 <Field JsonReadContext _parsingContext>
			return null;
	//   58  118:aconst_null     
	//   59  119:areturn         
		}
		continue; /* Loop/switch isn't completed */
_L2:
		JsonToken jsontoken1 = nextToken();
	//   60  120:aload_0         
	//   61  121:invokevirtual   #741 <Method JsonToken nextToken()>
	//   62  124:astore          4
		boolean1 = ((Boolean) (obj));
	//   63  126:aload_3         
	//   64  127:astore_2        
		if(jsontoken1 != null)
	//*  65  128:aload           4
	//*  66  130:ifnull          46
		{
			int i = jsontoken1.id();
	//   67  133:aload           4
	//   68  135:invokevirtual   #483 <Method int JsonToken.id()>
	//   69  138:istore_1        
			if(i == 9)
	//*  70  139:iload_1         
	//*  71  140:bipush          9
	//*  72  142:icmpne          149
				return Boolean.TRUE;
	//   73  145:getstatic       #735 <Field Boolean Boolean.TRUE>
	//   74  148:areturn         
			boolean1 = ((Boolean) (obj));
	//   75  149:aload_3         
	//   76  150:astore_2        
			if(i == 10)
	//*  77  151:iload_1         
	//*  78  152:bipush          10
	//*  79  154:icmpne          46
				return Boolean.FALSE;
	//   80  157:getstatic       #738 <Field Boolean Boolean.FALSE>
	//   81  160:areturn         
		}
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
	//    2    2:putfield        #745 <Field int _numTypesValid>
		if(_currToken == JsonToken.FIELD_NAME)
	//*   3    5:aload_0         
	//*   4    6:getfield        #131 <Field JsonToken _currToken>
	//*   5    9:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//*   6   12:if_acmpne       22
		{
			_nextAfterName();
	//    7   15:aload_0         
	//    8   16:invokespecial   #747 <Method JsonToken _nextAfterName()>
	//    9   19:pop             
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
		}
		if(_tokenIncomplete)
	//*  12   22:aload_0         
	//*  13   23:getfield        #143 <Field boolean _tokenIncomplete>
	//*  14   26:ifeq            33
			_skipString();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #749 <Method void _skipString()>
		int j = _skipWSOrEnd();
	//   17   33:aload_0         
	//   18   34:invokespecial   #751 <Method int _skipWSOrEnd()>
	//   19   37:istore_2        
		if(j < 0)
	//*  20   38:iload_2         
	//*  21   39:ifge            53
		{
			close();
	//   22   42:aload_0         
	//   23   43:invokevirtual   #752 <Method void close()>
			_currToken = null;
	//   24   46:aload_0         
	//   25   47:aconst_null     
	//   26   48:putfield        #131 <Field JsonToken _currToken>
			return null;
	//   27   51:aconst_null     
	//   28   52:areturn         
		}
		_binaryValue = null;
	//   29   53:aload_0         
	//   30   54:aconst_null     
	//   31   55:putfield        #651 <Field byte[] _binaryValue>
		if(j == 93)
	//*  32   58:iload_2         
	//*  33   59:bipush          93
	//*  34   61:icmpne          105
		{
			_updateLocation();
	//   35   64:aload_0         
	//   36   65:invokespecial   #134 <Method void _updateLocation()>
			if(!_parsingContext.inArray())
	//*  37   68:aload_0         
	//*  38   69:getfield        #189 <Field JsonReadContext _parsingContext>
	//*  39   72:invokevirtual   #755 <Method boolean JsonReadContext.inArray()>
	//*  40   75:ifne            85
				_reportMismatchedEndMarker(j, '}');
	//   41   78:aload_0         
	//   42   79:iload_2         
	//   43   80:bipush          125
	//   44   82:invokevirtual   #759 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   45   85:aload_0         
	//   46   86:aload_0         
	//   47   87:getfield        #189 <Field JsonReadContext _parsingContext>
	//   48   90:invokevirtual   #763 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   49   93:putfield        #189 <Field JsonReadContext _parsingContext>
			_currToken = JsonToken.END_ARRAY;
	//   50   96:aload_0         
	//   51   97:getstatic       #766 <Field JsonToken JsonToken.END_ARRAY>
	//   52  100:putfield        #131 <Field JsonToken _currToken>
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
	//   59  112:invokespecial   #134 <Method void _updateLocation()>
			if(!_parsingContext.inObject())
	//*  60  115:aload_0         
	//*  61  116:getfield        #189 <Field JsonReadContext _parsingContext>
	//*  62  119:invokevirtual   #769 <Method boolean JsonReadContext.inObject()>
	//*  63  122:ifne            132
				_reportMismatchedEndMarker(j, ']');
	//   64  125:aload_0         
	//   65  126:iload_2         
	//   66  127:bipush          93
	//   67  129:invokevirtual   #759 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   68  132:aload_0         
	//   69  133:aload_0         
	//   70  134:getfield        #189 <Field JsonReadContext _parsingContext>
	//   71  137:invokevirtual   #763 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   72  140:putfield        #189 <Field JsonReadContext _parsingContext>
			_currToken = JsonToken.END_OBJECT;
	//   73  143:aload_0         
	//   74  144:getstatic       #772 <Field JsonToken JsonToken.END_OBJECT>
	//   75  147:putfield        #131 <Field JsonToken _currToken>
			return null;
	//   76  150:aconst_null     
	//   77  151:areturn         
		}
		i = j;
	//   78  152:iload_2         
	//   79  153:istore_1        
		if(_parsingContext.expectComma())
	//*  80  154:aload_0         
	//*  81  155:getfield        #189 <Field JsonReadContext _parsingContext>
	//*  82  158:invokevirtual   #775 <Method boolean JsonReadContext.expectComma()>
	//*  83  161:ifeq            170
			i = _skipComma(j);
	//   84  164:aload_0         
	//   85  165:iload_2         
	//   86  166:invokespecial   #777 <Method int _skipComma(int)>
	//   87  169:istore_1        
		if(!_parsingContext.inObject())
	//*  88  170:aload_0         
	//*  89  171:getfield        #189 <Field JsonReadContext _parsingContext>
	//*  90  174:invokevirtual   #769 <Method boolean JsonReadContext.inObject()>
	//*  91  177:ifne            192
		{
			_updateLocation();
	//   92  180:aload_0         
	//   93  181:invokespecial   #134 <Method void _updateLocation()>
			_nextTokenNotInObject(i);
	//   94  184:aload_0         
	//   95  185:iload_1         
	//   96  186:invokespecial   #779 <Method JsonToken _nextTokenNotInObject(int)>
	//   97  189:pop             
			return null;
	//   98  190:aconst_null     
	//   99  191:areturn         
		}
		_updateNameLocation();
	//  100  192:aload_0         
	//  101  193:invokespecial   #781 <Method void _updateNameLocation()>
		if(i == 34)
	//* 102  196:iload_1         
	//* 103  197:bipush          34
	//* 104  199:icmpne          254
			s = _parseName();
	//  105  202:aload_0         
	//  106  203:invokevirtual   #575 <Method String _parseName()>
	//  107  206:astore          4
		else
	//* 108  208:aload_0         
	//* 109  209:getfield        #189 <Field JsonReadContext _parsingContext>
	//* 110  212:aload           4
	//* 111  214:invokevirtual   #578 <Method void JsonReadContext.setCurrentName(String)>
	//* 112  217:aload_0         
	//* 113  218:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//* 114  221:putfield        #131 <Field JsonToken _currToken>
	//* 115  224:aload_0         
	//* 116  225:invokespecial   #580 <Method int _skipColon()>
	//* 117  228:istore_1        
	//* 118  229:aload_0         
	//* 119  230:invokespecial   #134 <Method void _updateLocation()>
	//* 120  233:iload_1         
	//* 121  234:bipush          34
	//* 122  236:icmpne          264
	//* 123  239:aload_0         
	//* 124  240:iconst_1        
	//* 125  241:putfield        #143 <Field boolean _tokenIncomplete>
	//* 126  244:aload_0         
	//* 127  245:getstatic       #146 <Field JsonToken JsonToken.VALUE_STRING>
	//* 128  248:putfield        #141 <Field JsonToken _nextToken>
	//* 129  251:aload           4
	//* 130  253:areturn         
			s = _handleOddName(i);
	//  131  254:aload_0         
	//  132  255:iload_1         
	//  133  256:invokevirtual   #588 <Method String _handleOddName(int)>
	//  134  259:astore          4
		_parsingContext.setCurrentName(s);
		_currToken = JsonToken.FIELD_NAME;
		i = _skipColon();
		_updateLocation();
		if(i == 34)
		{
			_tokenIncomplete = true;
			_nextToken = JsonToken.VALUE_STRING;
			return s;
		}
	//* 135  261:goto            208
		i;
	//  136  264:iload_1         
		JVM INSTR lookupswitch 16: default 404
	//	               45: 418
	//	               48: 426
	//	               49: 426
	//	               50: 426
	//	               51: 426
	//	               52: 426
	//	               53: 426
	//	               54: 426
	//	               55: 426
	//	               56: 426
	//	               57: 426
	//	               91: 468
	//	               102: 435
	//	               110: 446
	//	               116: 457
	//	               123: 475;
	//  137  265:lookupswitch    16: default 404
	//	               45: 418
	//	               48: 426
	//	               49: 426
	//	               50: 426
	//	               51: 426
	//	               52: 426
	//	               53: 426
	//	               54: 426
	//	               55: 426
	//	               56: 426
	//	               57: 426
	//	               91: 468
	//	               102: 435
	//	               110: 446
	//	               116: 457
	//	               123: 475
		   goto _L1 _L2 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		JsonToken jsontoken = _handleOddValue(i);
	//  138  404:aload_0         
	//  139  405:iload_1         
	//  140  406:invokevirtual   #138 <Method JsonToken _handleOddValue(int)>
	//  141  409:astore_3        
_L10:
		_nextToken = jsontoken;
	//  142  410:aload_0         
	//  143  411:aload_3         
	//  144  412:putfield        #141 <Field JsonToken _nextToken>
		return s;
	//  145  415:aload           4
	//  146  417:areturn         
_L2:
		jsontoken = _parseNegNumber();
	//  147  418:aload_0         
	//  148  419:invokevirtual   #175 <Method JsonToken _parseNegNumber()>
	//  149  422:astore_3        
		continue; /* Loop/switch isn't completed */
	//  150  423:goto            410
_L3:
		jsontoken = _parsePosNumber(i);
	//  151  426:aload_0         
	//  152  427:iload_1         
	//  153  428:invokevirtual   #178 <Method JsonToken _parsePosNumber(int)>
	//  154  431:astore_3        
		continue; /* Loop/switch isn't completed */
	//  155  432:goto            410
_L5:
		_matchFalse();
	//  156  435:aload_0         
	//  157  436:invokespecial   #590 <Method void _matchFalse()>
		jsontoken = JsonToken.VALUE_FALSE;
	//  158  439:getstatic       #166 <Field JsonToken JsonToken.VALUE_FALSE>
	//  159  442:astore_3        
		continue; /* Loop/switch isn't completed */
	//  160  443:goto            410
_L6:
		_matchNull();
	//  161  446:aload_0         
	//  162  447:invokespecial   #592 <Method void _matchNull()>
		jsontoken = JsonToken.VALUE_NULL;
	//  163  450:getstatic       #171 <Field JsonToken JsonToken.VALUE_NULL>
	//  164  453:astore_3        
		continue; /* Loop/switch isn't completed */
	//  165  454:goto            410
_L7:
		_matchTrue();
	//  166  457:aload_0         
	//  167  458:invokespecial   #594 <Method void _matchTrue()>
		jsontoken = JsonToken.VALUE_TRUE;
	//  168  461:getstatic       #161 <Field JsonToken JsonToken.VALUE_TRUE>
	//  169  464:astore_3        
		continue; /* Loop/switch isn't completed */
	//  170  465:goto            410
_L4:
		jsontoken = JsonToken.START_ARRAY;
	//  171  468:getstatic       #149 <Field JsonToken JsonToken.START_ARRAY>
	//  172  471:astore_3        
		continue; /* Loop/switch isn't completed */
	//  173  472:goto            410
_L8:
		jsontoken = JsonToken.START_OBJECT;
	//  174  475:getstatic       #152 <Field JsonToken JsonToken.START_OBJECT>
	//  175  478:astore_3        
		if(true) goto _L10; else goto _L9
	//  176  479:goto            410
_L9:
	}

	public boolean nextFieldName(SerializableString serializablestring)
		throws IOException
	{
		int i;
		_numTypesValid = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #745 <Field int _numTypesValid>
		if(_currToken == JsonToken.FIELD_NAME)
	//*   3    5:aload_0         
	//*   4    6:getfield        #131 <Field JsonToken _currToken>
	//*   5    9:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//*   6   12:if_acmpne       22
		{
			_nextAfterName();
	//    7   15:aload_0         
	//    8   16:invokespecial   #747 <Method JsonToken _nextAfterName()>
	//    9   19:pop             
			return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
		}
		if(_tokenIncomplete)
	//*  12   22:aload_0         
	//*  13   23:getfield        #143 <Field boolean _tokenIncomplete>
	//*  14   26:ifeq            33
			_skipString();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #749 <Method void _skipString()>
		int j = _skipWSOrEnd();
	//   17   33:aload_0         
	//   18   34:invokespecial   #751 <Method int _skipWSOrEnd()>
	//   19   37:istore_3        
		if(j < 0)
	//*  20   38:iload_3         
	//*  21   39:ifge            53
		{
			close();
	//   22   42:aload_0         
	//   23   43:invokevirtual   #752 <Method void close()>
			_currToken = null;
	//   24   46:aload_0         
	//   25   47:aconst_null     
	//   26   48:putfield        #131 <Field JsonToken _currToken>
			return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
		}
		_binaryValue = null;
	//   29   53:aload_0         
	//   30   54:aconst_null     
	//   31   55:putfield        #651 <Field byte[] _binaryValue>
		if(j == 93)
	//*  32   58:iload_3         
	//*  33   59:bipush          93
	//*  34   61:icmpne          105
		{
			_updateLocation();
	//   35   64:aload_0         
	//   36   65:invokespecial   #134 <Method void _updateLocation()>
			if(!_parsingContext.inArray())
	//*  37   68:aload_0         
	//*  38   69:getfield        #189 <Field JsonReadContext _parsingContext>
	//*  39   72:invokevirtual   #755 <Method boolean JsonReadContext.inArray()>
	//*  40   75:ifne            85
				_reportMismatchedEndMarker(j, '}');
	//   41   78:aload_0         
	//   42   79:iload_3         
	//   43   80:bipush          125
	//   44   82:invokevirtual   #759 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   45   85:aload_0         
	//   46   86:aload_0         
	//   47   87:getfield        #189 <Field JsonReadContext _parsingContext>
	//   48   90:invokevirtual   #763 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   49   93:putfield        #189 <Field JsonReadContext _parsingContext>
			_currToken = JsonToken.END_ARRAY;
	//   50   96:aload_0         
	//   51   97:getstatic       #766 <Field JsonToken JsonToken.END_ARRAY>
	//   52  100:putfield        #131 <Field JsonToken _currToken>
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
	//   59  112:invokespecial   #134 <Method void _updateLocation()>
			if(!_parsingContext.inObject())
	//*  60  115:aload_0         
	//*  61  116:getfield        #189 <Field JsonReadContext _parsingContext>
	//*  62  119:invokevirtual   #769 <Method boolean JsonReadContext.inObject()>
	//*  63  122:ifne            132
				_reportMismatchedEndMarker(j, ']');
	//   64  125:aload_0         
	//   65  126:iload_3         
	//   66  127:bipush          93
	//   67  129:invokevirtual   #759 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   68  132:aload_0         
	//   69  133:aload_0         
	//   70  134:getfield        #189 <Field JsonReadContext _parsingContext>
	//   71  137:invokevirtual   #763 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   72  140:putfield        #189 <Field JsonReadContext _parsingContext>
			_currToken = JsonToken.END_OBJECT;
	//   73  143:aload_0         
	//   74  144:getstatic       #772 <Field JsonToken JsonToken.END_OBJECT>
	//   75  147:putfield        #131 <Field JsonToken _currToken>
			return false;
	//   76  150:iconst_0        
	//   77  151:ireturn         
		}
		i = j;
	//   78  152:iload_3         
	//   79  153:istore_2        
		if(_parsingContext.expectComma())
	//*  80  154:aload_0         
	//*  81  155:getfield        #189 <Field JsonReadContext _parsingContext>
	//*  82  158:invokevirtual   #775 <Method boolean JsonReadContext.expectComma()>
	//*  83  161:ifeq            170
			i = _skipComma(j);
	//   84  164:aload_0         
	//   85  165:iload_3         
	//   86  166:invokespecial   #777 <Method int _skipComma(int)>
	//   87  169:istore_2        
		if(!_parsingContext.inObject())
	//*  88  170:aload_0         
	//*  89  171:getfield        #189 <Field JsonReadContext _parsingContext>
	//*  90  174:invokevirtual   #769 <Method boolean JsonReadContext.inObject()>
	//*  91  177:ifne            192
		{
			_updateLocation();
	//   92  180:aload_0         
	//   93  181:invokespecial   #134 <Method void _updateLocation()>
			_nextTokenNotInObject(i);
	//   94  184:aload_0         
	//   95  185:iload_2         
	//   96  186:invokespecial   #779 <Method JsonToken _nextTokenNotInObject(int)>
	//   97  189:pop             
			return false;
	//   98  190:iconst_0        
	//   99  191:ireturn         
		}
		_updateNameLocation();
	//  100  192:aload_0         
	//  101  193:invokespecial   #781 <Method void _updateNameLocation()>
		if(i != 34) goto _L2; else goto _L1
	//  102  196:iload_2         
	//  103  197:bipush          34
	//  104  199:icmpne          303
_L1:
		int k;
		char ac[];
		ac = serializablestring.asQuotedChars();
	//  105  202:aload_1         
	//  106  203:invokeinterface #787 <Method char[] SerializableString.asQuotedChars()>
	//  107  208:astore          6
		k = ac.length;
	//  108  210:aload           6
	//  109  212:arraylength     
	//  110  213:istore_3        
		if(_inputPtr + k + 4 >= _inputEnd) goto _L2; else goto _L3
	//  111  214:aload_0         
	//  112  215:getfield        #52  <Field int _inputPtr>
	//  113  218:iload_3         
	//  114  219:iadd            
	//  115  220:iconst_4        
	//  116  221:iadd            
	//  117  222:aload_0         
	//  118  223:getfield        #55  <Field int _inputEnd>
	//  119  226:icmpge          303
_L3:
		int i1 = _inputPtr + k;
	//  120  229:aload_0         
	//  121  230:getfield        #52  <Field int _inputPtr>
	//  122  233:iload_3         
	//  123  234:iadd            
	//  124  235:istore          5
		if(_inputBuffer[i1] != '"') goto _L2; else goto _L4
	//  125  237:aload_0         
	//  126  238:getfield        #49  <Field char[] _inputBuffer>
	//  127  241:iload           5
	//  128  243:caload          
	//  129  244:bipush          34
	//  130  246:icmpne          303
_L4:
		int l;
		l = 0;
	//  131  249:iconst_0        
	//  132  250:istore          4
		k = _inputPtr;
	//  133  252:aload_0         
	//  134  253:getfield        #52  <Field int _inputPtr>
	//  135  256:istore_3        
_L7:
		if(k == i1)
	//* 136  257:iload_3         
	//* 137  258:iload           5
	//* 138  260:icmpne          289
		{
			_parsingContext.setCurrentName(serializablestring.getValue());
	//  139  263:aload_0         
	//  140  264:getfield        #189 <Field JsonReadContext _parsingContext>
	//  141  267:aload_1         
	//  142  268:invokeinterface #790 <Method String SerializableString.getValue()>
	//  143  273:invokevirtual   #578 <Method void JsonReadContext.setCurrentName(String)>
			_isNextTokenNameYes(_skipColonFast(k + 1));
	//  144  276:aload_0         
	//  145  277:aload_0         
	//  146  278:iload_3         
	//  147  279:iconst_1        
	//  148  280:iadd            
	//  149  281:invokespecial   #792 <Method int _skipColonFast(int)>
	//  150  284:invokespecial   #794 <Method void _isNextTokenNameYes(int)>
			return true;
	//  151  287:iconst_1        
	//  152  288:ireturn         
		}
		if(ac[l] == _inputBuffer[k]) goto _L5; else goto _L2
	//  153  289:aload           6
	//  154  291:iload           4
	//  155  293:caload          
	//  156  294:aload_0         
	//  157  295:getfield        #49  <Field char[] _inputBuffer>
	//  158  298:iload_3         
	//  159  299:caload          
	//  160  300:icmpeq          315
_L2:
		return _isNextTokenNameMaybe(i, serializablestring.getValue());
	//  161  303:aload_0         
	//  162  304:iload_2         
	//  163  305:aload_1         
	//  164  306:invokeinterface #790 <Method String SerializableString.getValue()>
	//  165  311:invokevirtual   #796 <Method boolean _isNextTokenNameMaybe(int, String)>
	//  166  314:ireturn         
_L5:
		l++;
	//  167  315:iload           4
	//  168  317:iconst_1        
	//  169  318:iadd            
	//  170  319:istore          4
		k++;
	//  171  321:iload_3         
	//  172  322:iconst_1        
	//  173  323:iadd            
	//  174  324:istore_3        
		if(true) goto _L7; else goto _L6
	//  175  325:goto            257
_L6:
	}

	public final int nextIntValue(int i)
		throws IOException
	{
		if(_currToken != JsonToken.FIELD_NAME) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field JsonToken _currToken>
	//    2    4:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//    3    7:if_acmpne       102
_L1:
		JsonToken jsontoken;
		_nameCopied = false;
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:putfield        #185 <Field boolean _nameCopied>
		jsontoken = _nextToken;
	//    7   15:aload_0         
	//    8   16:getfield        #141 <Field JsonToken _nextToken>
	//    9   19:astore_3        
		_nextToken = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #141 <Field JsonToken _nextToken>
		_currToken = jsontoken;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #131 <Field JsonToken _currToken>
		if(jsontoken != JsonToken.VALUE_NUMBER_INT) goto _L4; else goto _L3
	//   16   30:aload_3         
	//   17   31:getstatic       #800 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//   18   34:if_acmpne       44
_L3:
		int j = getIntValue();
	//   19   37:aload_0         
	//   20   38:invokevirtual   #803 <Method int getIntValue()>
	//   21   41:istore_2        
_L6:
		return j;
	//   22   42:iload_2         
	//   23   43:ireturn         
_L4:
		if(jsontoken == JsonToken.START_ARRAY)
	//*  24   44:aload_3         
	//*  25   45:getstatic       #149 <Field JsonToken JsonToken.START_ARRAY>
	//*  26   48:if_acmpne       72
		{
			_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getfield        #189 <Field JsonReadContext _parsingContext>
	//   30   56:aload_0         
	//   31   57:getfield        #192 <Field int _tokenInputRow>
	//   32   60:aload_0         
	//   33   61:getfield        #195 <Field int _tokenInputCol>
	//   34   64:invokevirtual   #201 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   35   67:putfield        #189 <Field JsonReadContext _parsingContext>
			return i;
	//   36   70:iload_1         
	//   37   71:ireturn         
		}
		j = i;
	//   38   72:iload_1         
	//   39   73:istore_2        
		if(jsontoken == JsonToken.START_OBJECT)
	//*  40   74:aload_3         
	//*  41   75:getstatic       #152 <Field JsonToken JsonToken.START_OBJECT>
	//*  42   78:if_acmpne       42
		{
			_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   43   81:aload_0         
	//   44   82:aload_0         
	//   45   83:getfield        #189 <Field JsonReadContext _parsingContext>
	//   46   86:aload_0         
	//   47   87:getfield        #192 <Field int _tokenInputRow>
	//   48   90:aload_0         
	//   49   91:getfield        #195 <Field int _tokenInputCol>
	//   50   94:invokevirtual   #204 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   51   97:putfield        #189 <Field JsonReadContext _parsingContext>
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
	//*  57  105:invokevirtual   #741 <Method JsonToken nextToken()>
	//*  58  108:getstatic       #800 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  59  111:if_acmpne       42
			return getIntValue();
	//   60  114:aload_0         
	//   61  115:invokevirtual   #803 <Method int getIntValue()>
	//   62  118:ireturn         
		if(true) goto _L6; else goto _L5
_L5:
	}

	public final long nextLongValue(long l)
		throws IOException
	{
		if(_currToken != JsonToken.FIELD_NAME) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field JsonToken _currToken>
	//    2    4:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//    3    7:if_acmpne       107
_L1:
		JsonToken jsontoken;
		_nameCopied = false;
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:putfield        #185 <Field boolean _nameCopied>
		jsontoken = _nextToken;
	//    7   15:aload_0         
	//    8   16:getfield        #141 <Field JsonToken _nextToken>
	//    9   19:astore          5
		_nextToken = null;
	//   10   21:aload_0         
	//   11   22:aconst_null     
	//   12   23:putfield        #141 <Field JsonToken _nextToken>
		_currToken = jsontoken;
	//   13   26:aload_0         
	//   14   27:aload           5
	//   15   29:putfield        #131 <Field JsonToken _currToken>
		if(jsontoken != JsonToken.VALUE_NUMBER_INT) goto _L4; else goto _L3
	//   16   32:aload           5
	//   17   34:getstatic       #800 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//   18   37:if_acmpne       47
_L3:
		long l1 = getLongValue();
	//   19   40:aload_0         
	//   20   41:invokevirtual   #809 <Method long getLongValue()>
	//   21   44:lstore_3        
_L6:
		return l1;
	//   22   45:lload_3         
	//   23   46:lreturn         
_L4:
		if(jsontoken == JsonToken.START_ARRAY)
	//*  24   47:aload           5
	//*  25   49:getstatic       #149 <Field JsonToken JsonToken.START_ARRAY>
	//*  26   52:if_acmpne       76
		{
			_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   27   55:aload_0         
	//   28   56:aload_0         
	//   29   57:getfield        #189 <Field JsonReadContext _parsingContext>
	//   30   60:aload_0         
	//   31   61:getfield        #192 <Field int _tokenInputRow>
	//   32   64:aload_0         
	//   33   65:getfield        #195 <Field int _tokenInputCol>
	//   34   68:invokevirtual   #201 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   35   71:putfield        #189 <Field JsonReadContext _parsingContext>
			return l;
	//   36   74:lload_1         
	//   37   75:lreturn         
		}
		l1 = l;
	//   38   76:lload_1         
	//   39   77:lstore_3        
		if(jsontoken == JsonToken.START_OBJECT)
	//*  40   78:aload           5
	//*  41   80:getstatic       #152 <Field JsonToken JsonToken.START_OBJECT>
	//*  42   83:if_acmpne       45
		{
			_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   43   86:aload_0         
	//   44   87:aload_0         
	//   45   88:getfield        #189 <Field JsonReadContext _parsingContext>
	//   46   91:aload_0         
	//   47   92:getfield        #192 <Field int _tokenInputRow>
	//   48   95:aload_0         
	//   49   96:getfield        #195 <Field int _tokenInputCol>
	//   50   99:invokevirtual   #204 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   51  102:putfield        #189 <Field JsonReadContext _parsingContext>
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
	//*  57  110:invokevirtual   #741 <Method JsonToken nextToken()>
	//*  58  113:getstatic       #800 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  59  116:if_acmpne       45
			return getLongValue();
	//   60  119:aload_0         
	//   61  120:invokevirtual   #809 <Method long getLongValue()>
	//   62  123:lreturn         
		if(true) goto _L6; else goto _L5
_L5:
	}

	public final String nextTextValue()
		throws IOException
	{
		String s = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(_currToken != JsonToken.FIELD_NAME) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #131 <Field JsonToken _currToken>
	//    4    6:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//    5    9:if_acmpne       121
_L1:
		JsonToken jsontoken;
		_nameCopied = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #185 <Field boolean _nameCopied>
		jsontoken = _nextToken;
	//    9   17:aload_0         
	//   10   18:getfield        #141 <Field JsonToken _nextToken>
	//   11   21:astore_2        
		_nextToken = null;
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:putfield        #141 <Field JsonToken _nextToken>
		_currToken = jsontoken;
	//   15   27:aload_0         
	//   16   28:aload_2         
	//   17   29:putfield        #131 <Field JsonToken _currToken>
		if(jsontoken != JsonToken.VALUE_STRING) goto _L4; else goto _L3
	//   18   32:aload_2         
	//   19   33:getstatic       #146 <Field JsonToken JsonToken.VALUE_STRING>
	//   20   36:if_acmpne       65
_L3:
		if(_tokenIncomplete)
	//*  21   39:aload_0         
	//*  22   40:getfield        #143 <Field boolean _tokenIncomplete>
	//*  23   43:ifeq            55
		{
			_tokenIncomplete = false;
	//   24   46:aload_0         
	//   25   47:iconst_0        
	//   26   48:putfield        #143 <Field boolean _tokenIncomplete>
			_finishString();
	//   27   51:aload_0         
	//   28   52:invokevirtual   #691 <Method void _finishString()>
		}
		s = _textBuffer.contentsAsString();
	//   29   55:aload_0         
	//   30   56:getfield        #78  <Field TextBuffer _textBuffer>
	//   31   59:invokevirtual   #492 <Method String TextBuffer.contentsAsString()>
	//   32   62:astore_1        
_L6:
		return s;
	//   33   63:aload_1         
	//   34   64:areturn         
_L4:
		if(jsontoken == JsonToken.START_ARRAY)
	//*  35   65:aload_2         
	//*  36   66:getstatic       #149 <Field JsonToken JsonToken.START_ARRAY>
	//*  37   69:if_acmpne       93
		{
			_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   38   72:aload_0         
	//   39   73:aload_0         
	//   40   74:getfield        #189 <Field JsonReadContext _parsingContext>
	//   41   77:aload_0         
	//   42   78:getfield        #192 <Field int _tokenInputRow>
	//   43   81:aload_0         
	//   44   82:getfield        #195 <Field int _tokenInputCol>
	//   45   85:invokevirtual   #201 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   46   88:putfield        #189 <Field JsonReadContext _parsingContext>
			return null;
	//   47   91:aconst_null     
	//   48   92:areturn         
		}
		if(jsontoken == JsonToken.START_OBJECT)
	//*  49   93:aload_2         
	//*  50   94:getstatic       #152 <Field JsonToken JsonToken.START_OBJECT>
	//*  51   97:if_acmpne       63
		{
			_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   52  100:aload_0         
	//   53  101:aload_0         
	//   54  102:getfield        #189 <Field JsonReadContext _parsingContext>
	//   55  105:aload_0         
	//   56  106:getfield        #192 <Field int _tokenInputRow>
	//   57  109:aload_0         
	//   58  110:getfield        #195 <Field int _tokenInputCol>
	//   59  113:invokevirtual   #204 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   60  116:putfield        #189 <Field JsonReadContext _parsingContext>
			return null;
	//   61  119:aconst_null     
	//   62  120:areturn         
		}
		continue; /* Loop/switch isn't completed */
_L2:
		if(nextToken() == JsonToken.VALUE_STRING)
	//*  63  121:aload_0         
	//*  64  122:invokevirtual   #741 <Method JsonToken nextToken()>
	//*  65  125:getstatic       #146 <Field JsonToken JsonToken.VALUE_STRING>
	//*  66  128:if_acmpne       63
			return getText();
	//   67  131:aload_0         
	//   68  132:invokevirtual   #670 <Method String getText()>
	//   69  135:areturn         
		if(true) goto _L6; else goto _L5
_L5:
	}

	public final JsonToken nextToken()
		throws IOException
	{
		int j;
		boolean flag;
		Object obj;
		if(_currToken == JsonToken.FIELD_NAME)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field JsonToken _currToken>
	//*   2    4:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:if_acmpne       15
			return _nextAfterName();
	//    4   10:aload_0         
	//    5   11:invokespecial   #747 <Method JsonToken _nextAfterName()>
	//    6   14:areturn         
		_numTypesValid = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #745 <Field int _numTypesValid>
		if(_tokenIncomplete)
	//*  10   20:aload_0         
	//*  11   21:getfield        #143 <Field boolean _tokenIncomplete>
	//*  12   24:ifeq            31
			_skipString();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #749 <Method void _skipString()>
		j = _skipWSOrEnd();
	//   15   31:aload_0         
	//   16   32:invokespecial   #751 <Method int _skipWSOrEnd()>
	//   17   35:istore_2        
		if(j < 0)
	//*  18   36:iload_2         
	//*  19   37:ifge            51
		{
			close();
	//   20   40:aload_0         
	//   21   41:invokevirtual   #752 <Method void close()>
			_currToken = null;
	//   22   44:aload_0         
	//   23   45:aconst_null     
	//   24   46:putfield        #131 <Field JsonToken _currToken>
			return null;
	//   25   49:aconst_null     
	//   26   50:areturn         
		}
		_binaryValue = null;
	//   27   51:aload_0         
	//   28   52:aconst_null     
	//   29   53:putfield        #651 <Field byte[] _binaryValue>
		if(j == 93)
	//*  30   56:iload_2         
	//*  31   57:bipush          93
	//*  32   59:icmpne          108
		{
			_updateLocation();
	//   33   62:aload_0         
	//   34   63:invokespecial   #134 <Method void _updateLocation()>
			if(!_parsingContext.inArray())
	//*  35   66:aload_0         
	//*  36   67:getfield        #189 <Field JsonReadContext _parsingContext>
	//*  37   70:invokevirtual   #755 <Method boolean JsonReadContext.inArray()>
	//*  38   73:ifne            83
				_reportMismatchedEndMarker(j, '}');
	//   39   76:aload_0         
	//   40   77:iload_2         
	//   41   78:bipush          125
	//   42   80:invokevirtual   #759 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   43   83:aload_0         
	//   44   84:aload_0         
	//   45   85:getfield        #189 <Field JsonReadContext _parsingContext>
	//   46   88:invokevirtual   #763 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   47   91:putfield        #189 <Field JsonReadContext _parsingContext>
			JsonToken jsontoken = JsonToken.END_ARRAY;
	//   48   94:getstatic       #766 <Field JsonToken JsonToken.END_ARRAY>
	//   49   97:astore          4
			_currToken = jsontoken;
	//   50   99:aload_0         
	//   51  100:aload           4
	//   52  102:putfield        #131 <Field JsonToken _currToken>
			return jsontoken;
	//   53  105:aload           4
	//   54  107:areturn         
		}
		if(j == 125)
	//*  55  108:iload_2         
	//*  56  109:bipush          125
	//*  57  111:icmpne          160
		{
			_updateLocation();
	//   58  114:aload_0         
	//   59  115:invokespecial   #134 <Method void _updateLocation()>
			if(!_parsingContext.inObject())
	//*  60  118:aload_0         
	//*  61  119:getfield        #189 <Field JsonReadContext _parsingContext>
	//*  62  122:invokevirtual   #769 <Method boolean JsonReadContext.inObject()>
	//*  63  125:ifne            135
				_reportMismatchedEndMarker(j, ']');
	//   64  128:aload_0         
	//   65  129:iload_2         
	//   66  130:bipush          93
	//   67  132:invokevirtual   #759 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   68  135:aload_0         
	//   69  136:aload_0         
	//   70  137:getfield        #189 <Field JsonReadContext _parsingContext>
	//   71  140:invokevirtual   #763 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   72  143:putfield        #189 <Field JsonReadContext _parsingContext>
			JsonToken jsontoken1 = JsonToken.END_OBJECT;
	//   73  146:getstatic       #772 <Field JsonToken JsonToken.END_OBJECT>
	//   74  149:astore          4
			_currToken = jsontoken1;
	//   75  151:aload_0         
	//   76  152:aload           4
	//   77  154:putfield        #131 <Field JsonToken _currToken>
			return jsontoken1;
	//   78  157:aload           4
	//   79  159:areturn         
		}
		int i = j;
	//   80  160:iload_2         
	//   81  161:istore_1        
		if(_parsingContext.expectComma())
	//*  82  162:aload_0         
	//*  83  163:getfield        #189 <Field JsonReadContext _parsingContext>
	//*  84  166:invokevirtual   #775 <Method boolean JsonReadContext.expectComma()>
	//*  85  169:ifeq            178
			i = _skipComma(j);
	//   86  172:aload_0         
	//   87  173:iload_2         
	//   88  174:invokespecial   #777 <Method int _skipComma(int)>
	//   89  177:istore_1        
		flag = _parsingContext.inObject();
	//   90  178:aload_0         
	//   91  179:getfield        #189 <Field JsonReadContext _parsingContext>
	//   92  182:invokevirtual   #769 <Method boolean JsonReadContext.inObject()>
	//   93  185:istore_3        
		j = i;
	//   94  186:iload_1         
	//   95  187:istore_2        
		if(flag)
	//*  96  188:iload_3         
	//*  97  189:ifeq            229
		{
			_updateNameLocation();
	//   98  192:aload_0         
	//   99  193:invokespecial   #781 <Method void _updateNameLocation()>
			if(i == 34)
	//* 100  196:iload_1         
	//* 101  197:bipush          34
	//* 102  199:icmpne          418
				obj = ((Object) (_parseName()));
	//  103  202:aload_0         
	//  104  203:invokevirtual   #575 <Method String _parseName()>
	//  105  206:astore          4
			else
	//* 106  208:aload_0         
	//* 107  209:getfield        #189 <Field JsonReadContext _parsingContext>
	//* 108  212:aload           4
	//* 109  214:invokevirtual   #578 <Method void JsonReadContext.setCurrentName(String)>
	//* 110  217:aload_0         
	//* 111  218:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//* 112  221:putfield        #131 <Field JsonToken _currToken>
	//* 113  224:aload_0         
	//* 114  225:invokespecial   #580 <Method int _skipColon()>
	//* 115  228:istore_2        
	//* 116  229:aload_0         
	//* 117  230:invokespecial   #134 <Method void _updateLocation()>
	//* 118  233:iload_2         
	//* 119  234:lookupswitch    19: default 396
	//	               34: 428
	//	               45: 547
	//	               48: 556
	//	               49: 556
	//	               50: 556
	//	               51: 556
	//	               52: 556
	//	               53: 556
	//	               54: 556
	//	               55: 556
	//	               56: 556
	//	               57: 556
	//	               91: 441
	//	               93: 503
	//	               102: 523
	//	               110: 535
	//	               116: 511
	//	               123: 472
	//	               125: 503
	//* 120  396:aload_0         
	//* 121  397:iload_2         
	//* 122  398:invokevirtual   #138 <Method JsonToken _handleOddValue(int)>
	//* 123  401:astore          4
	//* 124  403:iload_3         
	//* 125  404:ifeq            566
	//* 126  407:aload_0         
	//* 127  408:aload           4
	//* 128  410:putfield        #141 <Field JsonToken _nextToken>
	//* 129  413:aload_0         
	//* 130  414:getfield        #131 <Field JsonToken _currToken>
	//* 131  417:areturn         
				obj = ((Object) (_handleOddName(i)));
	//  132  418:aload_0         
	//  133  419:iload_1         
	//  134  420:invokevirtual   #588 <Method String _handleOddName(int)>
	//  135  423:astore          4
			_parsingContext.setCurrentName(((String) (obj)));
			_currToken = JsonToken.FIELD_NAME;
			j = _skipColon();
		}
		_updateLocation();
		j;
		JVM INSTR lookupswitch 19: default 396
	//	               34: 428
	//	               45: 547
	//	               48: 556
	//	               49: 556
	//	               50: 556
	//	               51: 556
	//	               52: 556
	//	               53: 556
	//	               54: 556
	//	               55: 556
	//	               56: 556
	//	               57: 556
	//	               91: 441
	//	               93: 503
	//	               102: 523
	//	               110: 535
	//	               116: 511
	//	               123: 472
	//	               125: 503;
		   goto _L1 _L2 _L3 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L6
_L4:
		break MISSING_BLOCK_LABEL_556;
_L1:
		obj = ((Object) (_handleOddValue(j)));
_L11:
		if(flag)
		{
			_nextToken = ((JsonToken) (obj));
			return _currToken;
		} else
	//* 136  425:goto            208
	//* 137  428:aload_0         
	//* 138  429:iconst_1        
	//* 139  430:putfield        #143 <Field boolean _tokenIncomplete>
	//* 140  433:getstatic       #146 <Field JsonToken JsonToken.VALUE_STRING>
	//* 141  436:astore          4
	//* 142  438:goto            403
	//* 143  441:iload_3         
	//* 144  442:ifne            464
	//* 145  445:aload_0         
	//* 146  446:aload_0         
	//* 147  447:getfield        #189 <Field JsonReadContext _parsingContext>
	//* 148  450:aload_0         
	//* 149  451:getfield        #192 <Field int _tokenInputRow>
	//* 150  454:aload_0         
	//* 151  455:getfield        #195 <Field int _tokenInputCol>
	//* 152  458:invokevirtual   #201 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//* 153  461:putfield        #189 <Field JsonReadContext _parsingContext>
	//* 154  464:getstatic       #149 <Field JsonToken JsonToken.START_ARRAY>
	//* 155  467:astore          4
	//* 156  469:goto            403
	//* 157  472:iload_3         
	//* 158  473:ifne            495
	//* 159  476:aload_0         
	//* 160  477:aload_0         
	//* 161  478:getfield        #189 <Field JsonReadContext _parsingContext>
	//* 162  481:aload_0         
	//* 163  482:getfield        #192 <Field int _tokenInputRow>
	//* 164  485:aload_0         
	//* 165  486:getfield        #195 <Field int _tokenInputCol>
	//* 166  489:invokevirtual   #204 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//* 167  492:putfield        #189 <Field JsonReadContext _parsingContext>
	//* 168  495:getstatic       #152 <Field JsonToken JsonToken.START_OBJECT>
	//* 169  498:astore          4
	//* 170  500:goto            403
	//* 171  503:aload_0         
	//* 172  504:iload_2         
	//* 173  505:ldc2            #812 <String "expected a value">
	//* 174  508:invokevirtual   #330 <Method void _reportUnexpectedChar(int, String)>
	//* 175  511:aload_0         
	//* 176  512:invokespecial   #594 <Method void _matchTrue()>
	//* 177  515:getstatic       #161 <Field JsonToken JsonToken.VALUE_TRUE>
	//* 178  518:astore          4
	//* 179  520:goto            403
	//* 180  523:aload_0         
	//* 181  524:invokespecial   #590 <Method void _matchFalse()>
	//* 182  527:getstatic       #166 <Field JsonToken JsonToken.VALUE_FALSE>
	//* 183  530:astore          4
	//* 184  532:goto            403
	//* 185  535:aload_0         
	//* 186  536:invokespecial   #592 <Method void _matchNull()>
	//* 187  539:getstatic       #171 <Field JsonToken JsonToken.VALUE_NULL>
	//* 188  542:astore          4
	//* 189  544:goto            403
	//* 190  547:aload_0         
	//* 191  548:invokevirtual   #175 <Method JsonToken _parseNegNumber()>
	//* 192  551:astore          4
	//* 193  553:goto            403
	//* 194  556:aload_0         
	//* 195  557:iload_2         
	//* 196  558:invokevirtual   #178 <Method JsonToken _parsePosNumber(int)>
	//* 197  561:astore          4
	//* 198  563:goto            403
		{
			_currToken = ((JsonToken) (obj));
	//  199  566:aload_0         
	//  200  567:aload           4
	//  201  569:putfield        #131 <Field JsonToken _currToken>
			return ((JsonToken) (obj));
	//  202  572:aload           4
	//  203  574:areturn         
		}
_L2:
		_tokenIncomplete = true;
		obj = ((Object) (JsonToken.VALUE_STRING));
		  goto _L11
_L5:
		if(!flag)
			_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
		obj = ((Object) (JsonToken.START_ARRAY));
		  goto _L11
_L10:
		if(!flag)
			_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
		obj = ((Object) (JsonToken.START_OBJECT));
		  goto _L11
_L6:
		_reportUnexpectedChar(j, "expected a value");
_L9:
		_matchTrue();
		obj = ((Object) (JsonToken.VALUE_TRUE));
		  goto _L11
_L7:
		_matchFalse();
		obj = ((Object) (JsonToken.VALUE_FALSE));
		  goto _L11
_L8:
		_matchNull();
		obj = ((Object) (JsonToken.VALUE_NULL));
		  goto _L11
_L3:
		obj = ((Object) (_parseNegNumber()));
		  goto _L11
		obj = ((Object) (_parsePosNumber(j)));
		  goto _L11
	}

	public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
		throws IOException
	{
		byte abyte0[];
		if(!_tokenIncomplete || _currToken != JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean _tokenIncomplete>
	//*   2    4:ifeq            17
	//*   3    7:aload_0         
	//*   4    8:getfield        #131 <Field JsonToken _currToken>
	//*   5   11:getstatic       #146 <Field JsonToken JsonToken.VALUE_STRING>
	//*   6   14:if_acmpeq       31
		{
			base64variant = ((Base64Variant) (getBinaryValue(base64variant)));
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:invokevirtual   #816 <Method byte[] getBinaryValue(Base64Variant)>
	//   10   22:astore_1        
			outputstream.write(((byte []) (base64variant)));
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #819 <Method void OutputStream.write(byte[])>
			return base64variant.length;
	//   14   28:aload_1         
	//   15   29:arraylength     
	//   16   30:ireturn         
		}
		abyte0 = _ioContext.allocBase64Buffer();
	//   17   31:aload_0         
	//   18   32:getfield        #398 <Field IOContext _ioContext>
	//   19   35:invokevirtual   #822 <Method byte[] IOContext.allocBase64Buffer()>
	//   20   38:astore          4
		int i = _readBinary(base64variant, outputstream, abyte0);
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:aload_2         
	//   24   43:aload           4
	//   25   45:invokevirtual   #824 <Method int _readBinary(Base64Variant, OutputStream, byte[])>
	//   26   48:istore_3        
		_ioContext.releaseBase64Buffer(abyte0);
	//   27   49:aload_0         
	//   28   50:getfield        #398 <Field IOContext _ioContext>
	//   29   53:aload           4
	//   30   55:invokevirtual   #827 <Method void IOContext.releaseBase64Buffer(byte[])>
		return i;
	//   31   58:iload_3         
	//   32   59:ireturn         
		base64variant;
	//   33   60:astore_1        
		_ioContext.releaseBase64Buffer(abyte0);
	//   34   61:aload_0         
	//   35   62:getfield        #398 <Field IOContext _ioContext>
	//   36   65:aload           4
	//   37   67:invokevirtual   #827 <Method void IOContext.releaseBase64Buffer(byte[])>
		throw base64variant;
	//   38   70:aload_1         
	//   39   71:athrow          
	}

	public int releaseBuffered(Writer writer)
		throws IOException
	{
		int i = _inputEnd - _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int _inputEnd>
	//    2    4:aload_0         
	//    3    5:getfield        #52  <Field int _inputPtr>
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
	//   12   18:getfield        #52  <Field int _inputPtr>
	//   13   21:istore_3        
			writer.write(_inputBuffer, j, i);
	//   14   22:aload_1         
	//   15   23:aload_0         
	//   16   24:getfield        #49  <Field char[] _inputBuffer>
	//   17   27:iload_3         
	//   18   28:iload_2         
	//   19   29:invokevirtual   #833 <Method void Writer.write(char[], int, int)>
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
	//    2    2:putfield        #57  <Field ObjectCodec _objectCodec>
	//    3    5:return          
	}

	protected static final int _icLatin1[] = CharTypes.getInputCodeLatin1();
	protected boolean _bufferRecyclable;
	protected final int _hashSeed;
	protected char _inputBuffer[];
	protected int _nameStartCol;
	protected long _nameStartOffset;
	protected int _nameStartRow;
	protected ObjectCodec _objectCodec;
	protected Reader _reader;
	protected final CharsToNameCanonicalizer _symbols;
	protected boolean _tokenIncomplete;

	static 
	{
	//    0    0:invokestatic    #31  <Method int[] CharTypes.getInputCodeLatin1()>
	//    1    3:putstatic       #33  <Field int[] _icLatin1>
	//*   2    6:return          
	}
}
