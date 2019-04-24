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
		char ac[] = _textBuffer.getCurrentSegment();
	//   10   18:aload_0         
	//   11   19:getfield        #78  <Field TextBuffer _textBuffer>
	//   12   22:invokevirtual   #87  <Method char[] TextBuffer.getCurrentSegment()>
	//   13   25:astore          7
		i = _textBuffer.getCurrentSegmentSize();
	//   14   27:aload_0         
	//   15   28:getfield        #78  <Field TextBuffer _textBuffer>
	//   16   31:invokevirtual   #90  <Method int TextBuffer.getCurrentSegmentSize()>
	//   17   34:istore_1        
		int i1 = ai.length;
	//   18   35:aload_3         
	//   19   36:arraylength     
	//   20   37:istore          6
		do
		{
			char c;
label0:
			{
				if(_inputPtr < _inputEnd || _loadMore())
	//*  21   39:aload_0         
	//*  22   40:getfield        #52  <Field int _inputPtr>
	//*  23   43:aload_0         
	//*  24   44:getfield        #55  <Field int _inputEnd>
	//*  25   47:icmplt          60
	//*  26   50:aload_0         
	//*  27   51:invokevirtual   #94  <Method boolean _loadMore()>
	//*  28   54:ifne            60
	//*  29   57:goto            96
				{
					c = _inputBuffer[_inputPtr];
	//   30   60:aload_0         
	//   31   61:getfield        #49  <Field char[] _inputBuffer>
	//   32   64:aload_0         
	//   33   65:getfield        #52  <Field int _inputPtr>
	//   34   68:caload          
	//   35   69:istore          4
					if(c > i1 ? Character.isJavaIdentifierPart(c) : ai[c] == 0)
						break label0;
	//   36   71:iload           4
	//   37   73:iload           6
	//   38   75:icmpgt          88
	//   39   78:aload_3         
	//   40   79:iload           4
	//   41   81:iaload          
	//   42   82:ifeq            140
	//   43   85:goto            96
	//   44   88:iload           4
	//   45   90:invokestatic    #100 <Method boolean Character.isJavaIdentifierPart(char)>
	//   46   93:ifne            140
				}
				_textBuffer.setCurrentLength(i);
	//   47   96:aload_0         
	//   48   97:getfield        #78  <Field TextBuffer _textBuffer>
	//   49  100:iload_1         
	//   50  101:invokevirtual   #104 <Method void TextBuffer.setCurrentLength(int)>
				ai = ((int []) (_textBuffer));
	//   51  104:aload_0         
	//   52  105:getfield        #78  <Field TextBuffer _textBuffer>
	//   53  108:astore_3        
				ac = ((TextBuffer) (ai)).getTextBuffer();
	//   54  109:aload_3         
	//   55  110:invokevirtual   #107 <Method char[] TextBuffer.getTextBuffer()>
	//   56  113:astore          7
				i = ((TextBuffer) (ai)).getTextOffset();
	//   57  115:aload_3         
	//   58  116:invokevirtual   #110 <Method int TextBuffer.getTextOffset()>
	//   59  119:istore_1        
				int k = ((TextBuffer) (ai)).size();
	//   60  120:aload_3         
	//   61  121:invokevirtual   #113 <Method int TextBuffer.size()>
	//   62  124:istore          5
				return _symbols.findSymbol(ac, i, k, j);
	//   63  126:aload_0         
	//   64  127:getfield        #59  <Field CharsToNameCanonicalizer _symbols>
	//   65  130:aload           7
	//   66  132:iload_1         
	//   67  133:iload           5
	//   68  135:iload_2         
	//   69  136:invokevirtual   #117 <Method String CharsToNameCanonicalizer.findSymbol(char[], int, int, int)>
	//   70  139:areturn         
			}
			_inputPtr = _inputPtr + 1;
	//   71  140:aload_0         
	//   72  141:aload_0         
	//   73  142:getfield        #52  <Field int _inputPtr>
	//   74  145:iconst_1        
	//   75  146:iadd            
	//   76  147:putfield        #52  <Field int _inputPtr>
			j = j * 33 + c;
	//   77  150:iload_2         
	//   78  151:bipush          33
	//   79  153:imul            
	//   80  154:iload           4
	//   81  156:iadd            
	//   82  157:istore_2        
			int l = i + 1;
	//   83  158:iload_1         
	//   84  159:iconst_1        
	//   85  160:iadd            
	//   86  161:istore          5
			ac[i] = c;
	//   87  163:aload           7
	//   88  165:iload_1         
	//   89  166:iload           4
	//   90  168:castore         
			if(l >= ac.length)
	//*  91  169:iload           5
	//*  92  171:aload           7
	//*  93  173:arraylength     
	//*  94  174:icmplt          191
			{
				ac = _textBuffer.finishCurrentSegment();
	//   95  177:aload_0         
	//   96  178:getfield        #78  <Field TextBuffer _textBuffer>
	//   97  181:invokevirtual   #120 <Method char[] TextBuffer.finishCurrentSegment()>
	//   98  184:astore          7
				i = 0;
	//   99  186:iconst_0        
	//  100  187:istore_1        
			} else
	//* 101  188:goto            39
			{
				i = l;
	//  102  191:iload           5
	//  103  193:istore_1        
			}
		} while(true);
	//  104  194:goto            39
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
										_nextToken = _handleOddValue(i);
	//   28  108:aload_0         
	//   29  109:aload_0         
	//   30  110:iload_1         
	//   31  111:invokevirtual   #138 <Method JsonToken _handleOddValue(int)>
	//   32  114:putfield        #141 <Field JsonToken _nextToken>
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
	//   37  121:invokevirtual   #144 <Method JsonToken _parsePosNumber(int)>
	//   38  124:putfield        #141 <Field JsonToken _nextToken>
										break;
									}
									return;
	//   39  127:return          
								} else
								{
									_nextToken = JsonToken.START_OBJECT;
	//   40  128:aload_0         
	//   41  129:getstatic       #147 <Field JsonToken JsonToken.START_OBJECT>
	//   42  132:putfield        #141 <Field JsonToken _nextToken>
									return;
	//   43  135:return          
								}
							} else
							{
								_matchToken("true", 1);
	//   44  136:aload_0         
	//   45  137:ldc1            #149 <String "true">
	//   46  139:iconst_1        
	//   47  140:invokevirtual   #153 <Method void _matchToken(String, int)>
								_nextToken = JsonToken.VALUE_TRUE;
	//   48  143:aload_0         
	//   49  144:getstatic       #156 <Field JsonToken JsonToken.VALUE_TRUE>
	//   50  147:putfield        #141 <Field JsonToken _nextToken>
								return;
	//   51  150:return          
							}
						} else
						{
							_matchToken("null", 1);
	//   52  151:aload_0         
	//   53  152:ldc1            #158 <String "null">
	//   54  154:iconst_1        
	//   55  155:invokevirtual   #153 <Method void _matchToken(String, int)>
							_nextToken = JsonToken.VALUE_NULL;
	//   56  158:aload_0         
	//   57  159:getstatic       #161 <Field JsonToken JsonToken.VALUE_NULL>
	//   58  162:putfield        #141 <Field JsonToken _nextToken>
							return;
	//   59  165:return          
						}
					} else
					{
						_matchToken("false", 1);
	//   60  166:aload_0         
	//   61  167:ldc1            #163 <String "false">
	//   62  169:iconst_1        
	//   63  170:invokevirtual   #153 <Method void _matchToken(String, int)>
						_nextToken = JsonToken.VALUE_FALSE;
	//   64  173:aload_0         
	//   65  174:getstatic       #166 <Field JsonToken JsonToken.VALUE_FALSE>
	//   66  177:putfield        #141 <Field JsonToken _nextToken>
						return;
	//   67  180:return          
					}
				} else
				{
					_nextToken = JsonToken.START_ARRAY;
	//   68  181:aload_0         
	//   69  182:getstatic       #169 <Field JsonToken JsonToken.START_ARRAY>
	//   70  185:putfield        #141 <Field JsonToken _nextToken>
					return;
	//   71  188:return          
				}
			} else
			{
				_nextToken = _parseNegNumber();
	//   72  189:aload_0         
	//   73  190:aload_0         
	//   74  191:invokevirtual   #173 <Method JsonToken _parseNegNumber()>
	//   75  194:putfield        #141 <Field JsonToken _nextToken>
				return;
	//   76  197:return          
			}
		} else
		{
			_tokenIncomplete = true;
	//   77  198:aload_0         
	//   78  199:iconst_1        
	//   79  200:putfield        #175 <Field boolean _tokenIncomplete>
			_nextToken = JsonToken.VALUE_STRING;
	//   80  203:aload_0         
	//   81  204:getstatic       #178 <Field JsonToken JsonToken.VALUE_STRING>
	//   82  207:putfield        #141 <Field JsonToken _nextToken>
			return;
	//   83  210:return          
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
	//   68  100:invokevirtual   #153 <Method void _matchToken(String, int)>
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
	//   57   85:ldc1            #158 <String "null">
	//   58   87:iconst_1        
	//   59   88:invokevirtual   #153 <Method void _matchToken(String, int)>
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
	//   57   85:ldc1            #149 <String "true">
	//   58   87:iconst_1        
	//   59   88:invokevirtual   #153 <Method void _matchToken(String, int)>
	//   60   91:return          
	}

	private final JsonToken _nextAfterName()
	{
		_nameCopied = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #185 <Field boolean _nameCopied>
		JsonToken jsontoken = _nextToken;
	//    3    5:aload_0         
	//    4    6:getfield        #141 <Field JsonToken _nextToken>
	//    5    9:astore_1        
		_nextToken = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #141 <Field JsonToken _nextToken>
		if(jsontoken == JsonToken.START_ARRAY)
	//*   9   15:aload_1         
	//*  10   16:getstatic       #169 <Field JsonToken JsonToken.START_ARRAY>
	//*  11   19:if_acmpne       44
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
		else
	//*  21   41:goto            70
		if(jsontoken == JsonToken.START_OBJECT)
	//*  22   44:aload_1         
	//*  23   45:getstatic       #147 <Field JsonToken JsonToken.START_OBJECT>
	//*  24   48:if_acmpne       70
			_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   25   51:aload_0         
	//   26   52:aload_0         
	//   27   53:getfield        #189 <Field JsonReadContext _parsingContext>
	//   28   56:aload_0         
	//   29   57:getfield        #192 <Field int _tokenInputRow>
	//   30   60:aload_0         
	//   31   61:getfield        #195 <Field int _tokenInputCol>
	//   32   64:invokevirtual   #204 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   33   67:putfield        #189 <Field JsonReadContext _parsingContext>
		_currToken = jsontoken;
	//   34   70:aload_0         
	//   35   71:aload_1         
	//   36   72:putfield        #131 <Field JsonToken _currToken>
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
	//    5    8:putfield        #175 <Field boolean _tokenIncomplete>
			JsonToken jsontoken = JsonToken.VALUE_STRING;
	//    6   11:getstatic       #178 <Field JsonToken JsonToken.VALUE_STRING>
	//    7   14:astore_2        
			_currToken = jsontoken;
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:putfield        #131 <Field JsonToken _currToken>
			return jsontoken;
	//   11   20:aload_2         
	//   12   21:areturn         
		}
		if(i == 91) goto _L2; else goto _L1
	//   13   22:iload_1         
	//   14   23:bipush          91
	//   15   25:icmpeq          292
_L1:
		if(i == 93) goto _L4; else goto _L3
	//   16   28:iload_1         
	//   17   29:bipush          93
	//   18   31:icmpeq          248
_L3:
		if(i == 102) goto _L6; else goto _L5
	//   19   34:iload_1         
	//   20   35:bipush          102
	//   21   37:icmpeq          230
_L5:
		if(i == 110) goto _L8; else goto _L7
	//   22   40:iload_1         
	//   23   41:bipush          110
	//   24   43:icmpeq          212
_L7:
		if(i == 116) goto _L10; else goto _L9
	//   25   46:iload_1         
	//   26   47:bipush          116
	//   27   49:icmpeq          194
_L9:
		if(i == 123) goto _L12; else goto _L11
	//   28   52:iload_1         
	//   29   53:bipush          123
	//   30   55:icmpeq          164
_L11:
		i;
	//   31   58:iload_1         
		JVM INSTR tableswitch 44 45: default 80
	//	               44 248
	//	               45 152;
	//   32   59:tableswitch     44 45: default 80
	//	               44 248
	//	               45 152
		   goto _L13 _L4 _L14
_L13:
		switch(i)
	//*  33   80:iload_1         
		{
	//*  34   81:tableswitch     48 57: default 136
	//	               48 139
	//	               49 139
	//	               50 139
	//	               51 139
	//	               52 139
	//	               53 139
	//	               54 139
	//	               55 139
	//	               56 139
	//	               57 139
	//*  35  136:goto            279
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
			JsonToken jsontoken1 = _parsePosNumber(i);
	//   36  139:aload_0         
	//   37  140:iload_1         
	//   38  141:invokevirtual   #144 <Method JsonToken _parsePosNumber(int)>
	//   39  144:astore_2        
			_currToken = jsontoken1;
	//   40  145:aload_0         
	//   41  146:aload_2         
	//   42  147:putfield        #131 <Field JsonToken _currToken>
			return jsontoken1;
	//   43  150:aload_2         
	//   44  151:areturn         
		}
		  goto _L15
_L14:
		JsonToken jsontoken2 = _parseNegNumber();
	//   45  152:aload_0         
	//   46  153:invokevirtual   #173 <Method JsonToken _parseNegNumber()>
	//   47  156:astore_2        
		_currToken = jsontoken2;
	//   48  157:aload_0         
	//   49  158:aload_2         
	//   50  159:putfield        #131 <Field JsonToken _currToken>
		return jsontoken2;
	//   51  162:aload_2         
	//   52  163:areturn         
_L12:
		_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   53  164:aload_0         
	//   54  165:aload_0         
	//   55  166:getfield        #189 <Field JsonReadContext _parsingContext>
	//   56  169:aload_0         
	//   57  170:getfield        #192 <Field int _tokenInputRow>
	//   58  173:aload_0         
	//   59  174:getfield        #195 <Field int _tokenInputCol>
	//   60  177:invokevirtual   #204 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   61  180:putfield        #189 <Field JsonReadContext _parsingContext>
		JsonToken jsontoken3 = JsonToken.START_OBJECT;
	//   62  183:getstatic       #147 <Field JsonToken JsonToken.START_OBJECT>
	//   63  186:astore_2        
		_currToken = jsontoken3;
	//   64  187:aload_0         
	//   65  188:aload_2         
	//   66  189:putfield        #131 <Field JsonToken _currToken>
		return jsontoken3;
	//   67  192:aload_2         
	//   68  193:areturn         
_L10:
		_matchToken("true", 1);
	//   69  194:aload_0         
	//   70  195:ldc1            #149 <String "true">
	//   71  197:iconst_1        
	//   72  198:invokevirtual   #153 <Method void _matchToken(String, int)>
		JsonToken jsontoken4 = JsonToken.VALUE_TRUE;
	//   73  201:getstatic       #156 <Field JsonToken JsonToken.VALUE_TRUE>
	//   74  204:astore_2        
		_currToken = jsontoken4;
	//   75  205:aload_0         
	//   76  206:aload_2         
	//   77  207:putfield        #131 <Field JsonToken _currToken>
		return jsontoken4;
	//   78  210:aload_2         
	//   79  211:areturn         
_L8:
		_matchToken("null", 1);
	//   80  212:aload_0         
	//   81  213:ldc1            #158 <String "null">
	//   82  215:iconst_1        
	//   83  216:invokevirtual   #153 <Method void _matchToken(String, int)>
		JsonToken jsontoken5 = JsonToken.VALUE_NULL;
	//   84  219:getstatic       #161 <Field JsonToken JsonToken.VALUE_NULL>
	//   85  222:astore_2        
		_currToken = jsontoken5;
	//   86  223:aload_0         
	//   87  224:aload_2         
	//   88  225:putfield        #131 <Field JsonToken _currToken>
		return jsontoken5;
	//   89  228:aload_2         
	//   90  229:areturn         
_L6:
		_matchToken("false", 1);
	//   91  230:aload_0         
	//   92  231:ldc1            #163 <String "false">
	//   93  233:iconst_1        
	//   94  234:invokevirtual   #153 <Method void _matchToken(String, int)>
		JsonToken jsontoken6 = JsonToken.VALUE_FALSE;
	//   95  237:getstatic       #166 <Field JsonToken JsonToken.VALUE_FALSE>
	//   96  240:astore_2        
		_currToken = jsontoken6;
	//   97  241:aload_0         
	//   98  242:aload_2         
	//   99  243:putfield        #131 <Field JsonToken _currToken>
		return jsontoken6;
	//  100  246:aload_2         
	//  101  247:areturn         
_L4:
		if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES))
	//* 102  248:aload_0         
	//* 103  249:getstatic       #211 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_MISSING_VALUES>
	//* 104  252:invokevirtual   #215 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//* 105  255:ifeq            279
		{
			_inputPtr = _inputPtr - 1;
	//  106  258:aload_0         
	//  107  259:aload_0         
	//  108  260:getfield        #52  <Field int _inputPtr>
	//  109  263:iconst_1        
	//  110  264:isub            
	//  111  265:putfield        #52  <Field int _inputPtr>
			JsonToken jsontoken7 = JsonToken.VALUE_NULL;
	//  112  268:getstatic       #161 <Field JsonToken JsonToken.VALUE_NULL>
	//  113  271:astore_2        
			_currToken = jsontoken7;
	//  114  272:aload_0         
	//  115  273:aload_2         
	//  116  274:putfield        #131 <Field JsonToken _currToken>
			return jsontoken7;
	//  117  277:aload_2         
	//  118  278:areturn         
		}
_L15:
		JsonToken jsontoken8 = _handleOddValue(i);
	//  119  279:aload_0         
	//  120  280:iload_1         
	//  121  281:invokevirtual   #138 <Method JsonToken _handleOddValue(int)>
	//  122  284:astore_2        
		_currToken = jsontoken8;
	//  123  285:aload_0         
	//  124  286:aload_2         
	//  125  287:putfield        #131 <Field JsonToken _currToken>
		return jsontoken8;
	//  126  290:aload_2         
	//  127  291:areturn         
_L2:
		_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//  128  292:aload_0         
	//  129  293:aload_0         
	//  130  294:getfield        #189 <Field JsonReadContext _parsingContext>
	//  131  297:aload_0         
	//  132  298:getfield        #192 <Field int _tokenInputRow>
	//  133  301:aload_0         
	//  134  302:getfield        #195 <Field int _tokenInputCol>
	//  135  305:invokevirtual   #201 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//  136  308:putfield        #189 <Field JsonReadContext _parsingContext>
		JsonToken jsontoken9 = JsonToken.START_ARRAY;
	//  137  311:getstatic       #169 <Field JsonToken JsonToken.START_ARRAY>
	//  138  314:astore_2        
		_currToken = jsontoken9;
	//  139  315:aload_0         
	//  140  316:aload_2         
	//  141  317:putfield        #131 <Field JsonToken _currToken>
		return jsontoken9;
	//  142  320:aload_2         
	//  143  321:areturn         
	}

	private final JsonToken _parseFloat(int i, int j, int k, boolean flag, int l)
		throws IOException
	{
		int k1;
		int l1;
		int i2;
		int j2;
		int k2;
		boolean flag2;
		int l2;
		l2 = _inputEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int _inputEnd>
	//    2    4:istore          13
		flag2 = false;
	//    3    6:iconst_0        
	//    4    7:istore          12
		l1 = 0;
	//    5    9:iconst_0        
	//    6   10:istore          8
		k1 = 0;
	//    7   12:iconst_0        
	//    8   13:istore          7
		int i1;
		if(i == 46)
	//*   9   15:iload_1         
	//*  10   16:bipush          46
	//*  11   18:icmpne          101
		{
			i = 0;
	//   12   21:iconst_0        
	//   13   22:istore_1        
			i1 = k;
	//   14   23:iload_3         
	//   15   24:istore          6
			do
			{
				if(i1 >= l2)
	//*  16   26:iload           6
	//*  17   28:iload           13
	//*  18   30:icmplt          41
					return _parseNumber2(flag, j);
	//   19   33:aload_0         
	//   20   34:iload           4
	//   21   36:iload_2         
	//   22   37:invokespecial   #221 <Method JsonToken _parseNumber2(boolean, int)>
	//   23   40:areturn         
				char ac[] = _inputBuffer;
	//   24   41:aload_0         
	//   25   42:getfield        #49  <Field char[] _inputBuffer>
	//   26   45:astore          14
				k = i1 + 1;
	//   27   47:iload           6
	//   28   49:iconst_1        
	//   29   50:iadd            
	//   30   51:istore_3        
				i1 = ((int) (ac[i1]));
	//   31   52:aload           14
	//   32   54:iload           6
	//   33   56:caload          
	//   34   57:istore          6
				if(i1 < '0' || i1 > '9')
	//*  35   59:iload           6
	//*  36   61:bipush          48
	//*  37   63:icmplt          86
	//*  38   66:iload           6
	//*  39   68:bipush          57
	//*  40   70:icmple          76
					break;
	//   41   73:goto            86
				i++;
	//   42   76:iload_1         
	//   43   77:iconst_1        
	//   44   78:iadd            
	//   45   79:istore_1        
				i1 = k;
	//   46   80:iload_3         
	//   47   81:istore          6
			} while(true);
	//   48   83:goto            26
			if(i == 0)
	//*  49   86:iload_1         
	//*  50   87:ifne            98
				reportUnexpectedNumberChar(i1, "Decimal point not followed by a digit");
	//   51   90:aload_0         
	//   52   91:iload           6
	//   53   93:ldc1            #223 <String "Decimal point not followed by a digit">
	//   54   95:invokevirtual   #227 <Method void reportUnexpectedNumberChar(int, String)>
		} else
	//*  55   98:goto            110
		{
			boolean flag1 = false;
	//   56  101:iconst_0        
	//   57  102:istore          9
			i1 = i;
	//   58  104:iload_1         
	//   59  105:istore          6
			i = ((int) (flag1));
	//   60  107:iload           9
	//   61  109:istore_1        
		}
		if(i1 != 101)
	//*  62  110:iload           6
	//*  63  112:bipush          101
	//*  64  114:icmpeq          134
		{
			i2 = i;
	//   65  117:iload_1         
	//   66  118:istore          9
			j2 = i1;
	//   67  120:iload           6
	//   68  122:istore          10
			k2 = k;
	//   69  124:iload_3         
	//   70  125:istore          11
			if(i1 != 69)
				break MISSING_BLOCK_LABEL_365;
	//   71  127:iload           6
	//   72  129:bipush          69
	//   73  131:icmpne          365
		}
		if(k >= l2)
	//*  74  134:iload_3         
	//*  75  135:iload           13
	//*  76  137:icmplt          153
		{
			_inputPtr = j;
	//   77  140:aload_0         
	//   78  141:iload_2         
	//   79  142:putfield        #52  <Field int _inputPtr>
			return _parseNumber2(flag, j);
	//   80  145:aload_0         
	//   81  146:iload           4
	//   82  148:iload_2         
	//   83  149:invokespecial   #221 <Method JsonToken _parseNumber2(boolean, int)>
	//   84  152:areturn         
		}
		char ac1[] = _inputBuffer;
	//   85  153:aload_0         
	//   86  154:getfield        #49  <Field char[] _inputBuffer>
	//   87  157:astore          14
		i2 = k + 1;
	//   88  159:iload_3         
	//   89  160:iconst_1        
	//   90  161:iadd            
	//   91  162:istore          9
		j2 = ((int) (ac1[k]));
	//   92  164:aload           14
	//   93  166:iload_3         
	//   94  167:caload          
	//   95  168:istore          10
		if(j2 == 45) goto _L2; else goto _L1
	//   96  170:iload           10
	//   97  172:bipush          45
	//   98  174:icmpeq          217
_L1:
		int j1;
		k = k1;
	//   99  177:iload           7
	//  100  179:istore_3        
		l1 = i;
	//  101  180:iload_1         
	//  102  181:istore          8
		k1 = i2;
	//  103  183:iload           9
	//  104  185:istore          7
		j1 = j2;
	//  105  187:iload           10
	//  106  189:istore          6
		if(j2 != 43) goto _L3; else goto _L2
	//  107  191:iload           10
	//  108  193:bipush          43
	//  109  195:icmpne          201
	//* 110  198:goto            217
_L3:
		i2 = k1;
	//  111  201:iload           7
	//  112  203:istore          9
		k1 = k;
	//  113  205:iload_3         
	//  114  206:istore          7
		i = l1;
	//  115  208:iload           8
	//  116  210:istore_1        
		k = i2;
	//  117  211:iload           9
	//  118  213:istore_3        
		  goto _L4
	//* 119  214:goto            259
_L2:
		if(i2 >= l2)
	//* 120  217:iload           9
	//* 121  219:iload           13
	//* 122  221:icmplt          237
		{
			_inputPtr = j;
	//  123  224:aload_0         
	//  124  225:iload_2         
	//  125  226:putfield        #52  <Field int _inputPtr>
			return _parseNumber2(flag, j);
	//  126  229:aload_0         
	//  127  230:iload           4
	//  128  232:iload_2         
	//  129  233:invokespecial   #221 <Method JsonToken _parseNumber2(boolean, int)>
	//  130  236:areturn         
		}
		char ac2[] = _inputBuffer;
	//  131  237:aload_0         
	//  132  238:getfield        #49  <Field char[] _inputBuffer>
	//  133  241:astore          14
		k = i2 + 1;
	//  134  243:iload           9
	//  135  245:iconst_1        
	//  136  246:iadd            
	//  137  247:istore_3        
		j1 = ((int) (ac2[i2]));
	//  138  248:aload           14
	//  139  250:iload           9
	//  140  252:caload          
	//  141  253:istore          6
		k1 = ((int) (flag2));
	//  142  255:iload           12
	//  143  257:istore          7
_L4:
		if(j1 > 57 || j1 < 48)
			break; /* Loop/switch isn't completed */
	//  144  259:iload           6
	//  145  261:bipush          57
	//  146  263:icmpgt          324
	//  147  266:iload           6
	//  148  268:bipush          48
	//  149  270:icmplt          324
		l1 = k1 + 1;
	//  150  273:iload           7
	//  151  275:iconst_1        
	//  152  276:iadd            
	//  153  277:istore          8
		if(k >= l2)
	//* 154  279:iload_3         
	//* 155  280:iload           13
	//* 156  282:icmplt          298
		{
			_inputPtr = j;
	//  157  285:aload_0         
	//  158  286:iload_2         
	//  159  287:putfield        #52  <Field int _inputPtr>
			return _parseNumber2(flag, j);
	//  160  290:aload_0         
	//  161  291:iload           4
	//  162  293:iload_2         
	//  163  294:invokespecial   #221 <Method JsonToken _parseNumber2(boolean, int)>
	//  164  297:areturn         
		}
		char ac3[] = _inputBuffer;
	//  165  298:aload_0         
	//  166  299:getfield        #49  <Field char[] _inputBuffer>
	//  167  302:astore          14
		k1 = k + 1;
	//  168  304:iload_3         
	//  169  305:iconst_1        
	//  170  306:iadd            
	//  171  307:istore          7
		j1 = ((int) (ac3[k]));
	//  172  309:aload           14
	//  173  311:iload_3         
	//  174  312:caload          
	//  175  313:istore          6
		k = l1;
	//  176  315:iload           8
	//  177  317:istore_3        
		l1 = i;
	//  178  318:iload_1         
	//  179  319:istore          8
		if(true) goto _L3; else goto _L5
	//  180  321:goto            201
_L5:
		l1 = k1;
	//  181  324:iload           7
	//  182  326:istore          8
		i2 = i;
	//  183  328:iload_1         
	//  184  329:istore          9
		j2 = j1;
	//  185  331:iload           6
	//  186  333:istore          10
		k2 = k;
	//  187  335:iload_3         
	//  188  336:istore          11
		if(k1 == 0)
	//* 189  338:iload           7
	//* 190  340:ifne            365
		{
			reportUnexpectedNumberChar(j1, "Exponent indicator not followed by a digit");
	//  191  343:aload_0         
	//  192  344:iload           6
	//  193  346:ldc1            #229 <String "Exponent indicator not followed by a digit">
	//  194  348:invokevirtual   #227 <Method void reportUnexpectedNumberChar(int, String)>
			k2 = k;
	//  195  351:iload_3         
	//  196  352:istore          11
			j2 = j1;
	//  197  354:iload           6
	//  198  356:istore          10
			i2 = i;
	//  199  358:iload_1         
	//  200  359:istore          9
			l1 = k1;
	//  201  361:iload           7
	//  202  363:istore          8
		}
		i = k2 - 1;
	//  203  365:iload           11
	//  204  367:iconst_1        
	//  205  368:isub            
	//  206  369:istore_1        
		_inputPtr = i;
	//  207  370:aload_0         
	//  208  371:iload_1         
	//  209  372:putfield        #52  <Field int _inputPtr>
		if(_parsingContext.inRoot())
	//* 210  375:aload_0         
	//* 211  376:getfield        #189 <Field JsonReadContext _parsingContext>
	//* 212  379:invokevirtual   #232 <Method boolean JsonReadContext.inRoot()>
	//* 213  382:ifeq            391
			_verifyRootSpace(j2);
	//  214  385:aload_0         
	//  215  386:iload           10
	//  216  388:invokespecial   #235 <Method void _verifyRootSpace(int)>
		_textBuffer.resetWithShared(_inputBuffer, j, i - j);
	//  217  391:aload_0         
	//  218  392:getfield        #78  <Field TextBuffer _textBuffer>
	//  219  395:aload_0         
	//  220  396:getfield        #49  <Field char[] _inputBuffer>
	//  221  399:iload_2         
	//  222  400:iload_1         
	//  223  401:iload_2         
	//  224  402:isub            
	//  225  403:invokevirtual   #84  <Method void TextBuffer.resetWithShared(char[], int, int)>
		return resetFloat(flag, l, i2, l1);
	//  226  406:aload_0         
	//  227  407:iload           4
	//  228  409:iload           5
	//  229  411:iload           9
	//  230  413:iload           8
	//  231  415:invokevirtual   #239 <Method JsonToken resetFloat(boolean, int, int, int)>
	//  232  418:areturn         
	}

	private String _parseName2(int i, int j, int k)
		throws IOException
	{
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
		Object obj = ((Object) (_textBuffer.getCurrentSegment()));
	//   10   18:aload_0         
	//   11   19:getfield        #78  <Field TextBuffer _textBuffer>
	//   12   22:invokevirtual   #87  <Method char[] TextBuffer.getCurrentSegment()>
	//   13   25:astore          7
		i = _textBuffer.getCurrentSegmentSize();
	//   14   27:aload_0         
	//   15   28:getfield        #78  <Field TextBuffer _textBuffer>
	//   16   31:invokevirtual   #90  <Method int TextBuffer.getCurrentSegmentSize()>
	//   17   34:istore_1        
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*  18   35:aload_0         
	//*  19   36:getfield        #52  <Field int _inputPtr>
	//*  20   39:aload_0         
	//*  21   40:getfield        #55  <Field int _inputEnd>
	//*  22   43:icmplt          62
	//*  23   46:aload_0         
	//*  24   47:invokevirtual   #94  <Method boolean _loadMore()>
	//*  25   50:ifne            62
				_reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
	//   26   53:aload_0         
	//   27   54:ldc1            #243 <String " in field name">
	//   28   56:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//   29   59:invokevirtual   #247 <Method void _reportInvalidEOF(String, JsonToken)>
			char ac[] = _inputBuffer;
	//   30   62:aload_0         
	//   31   63:getfield        #49  <Field char[] _inputBuffer>
	//   32   66:astore          8
			int l = _inputPtr;
	//   33   68:aload_0         
	//   34   69:getfield        #52  <Field int _inputPtr>
	//   35   72:istore          6
			_inputPtr = l + 1;
	//   36   74:aload_0         
	//   37   75:iload           6
	//   38   77:iconst_1        
	//   39   78:iadd            
	//   40   79:putfield        #52  <Field int _inputPtr>
			char c1 = ac[l];
	//   41   82:aload           8
	//   42   84:iload           6
	//   43   86:caload          
	//   44   87:istore          5
			char c = c1;
	//   45   89:iload           5
	//   46   91:istore          4
			if(c1 <= '\\')
	//*  47   93:iload           5
	//*  48   95:bipush          92
	//*  49   97:icmpgt          201
				if(c1 == '\\')
	//*  50  100:iload           5
	//*  51  102:bipush          92
	//*  52  104:icmpne          116
				{
					c = _decodeEscaped();
	//   53  107:aload_0         
	//   54  108:invokevirtual   #251 <Method char _decodeEscaped()>
	//   55  111:istore          4
				} else
	//*  56  113:goto            201
				{
					c = c1;
	//   57  116:iload           5
	//   58  118:istore          4
					if(c1 <= k)
	//*  59  120:iload           5
	//*  60  122:iload_3         
	//*  61  123:icmpgt          201
					{
						if(c1 == k)
	//*  62  126:iload           5
	//*  63  128:iload_3         
	//*  64  129:icmpne          178
						{
							_textBuffer.setCurrentLength(i);
	//   65  132:aload_0         
	//   66  133:getfield        #78  <Field TextBuffer _textBuffer>
	//   67  136:iload_1         
	//   68  137:invokevirtual   #104 <Method void TextBuffer.setCurrentLength(int)>
							obj = ((Object) (_textBuffer));
	//   69  140:aload_0         
	//   70  141:getfield        #78  <Field TextBuffer _textBuffer>
	//   71  144:astore          7
							char ac1[] = ((TextBuffer) (obj)).getTextBuffer();
	//   72  146:aload           7
	//   73  148:invokevirtual   #107 <Method char[] TextBuffer.getTextBuffer()>
	//   74  151:astore          8
							i = ((TextBuffer) (obj)).getTextOffset();
	//   75  153:aload           7
	//   76  155:invokevirtual   #110 <Method int TextBuffer.getTextOffset()>
	//   77  158:istore_1        
							k = ((TextBuffer) (obj)).size();
	//   78  159:aload           7
	//   79  161:invokevirtual   #113 <Method int TextBuffer.size()>
	//   80  164:istore_3        
							return _symbols.findSymbol(ac1, i, k, j);
	//   81  165:aload_0         
	//   82  166:getfield        #59  <Field CharsToNameCanonicalizer _symbols>
	//   83  169:aload           8
	//   84  171:iload_1         
	//   85  172:iload_3         
	//   86  173:iload_2         
	//   87  174:invokevirtual   #117 <Method String CharsToNameCanonicalizer.findSymbol(char[], int, int, int)>
	//   88  177:areturn         
						}
						c = c1;
	//   89  178:iload           5
	//   90  180:istore          4
						if(c1 < ' ')
	//*  91  182:iload           5
	//*  92  184:bipush          32
	//*  93  186:icmpge          201
						{
							_throwUnquotedSpace(((int) (c1)), "name");
	//   94  189:aload_0         
	//   95  190:iload           5
	//   96  192:ldc1            #253 <String "name">
	//   97  194:invokevirtual   #256 <Method void _throwUnquotedSpace(int, String)>
							c = c1;
	//   98  197:iload           5
	//   99  199:istore          4
						}
					}
				}
			j = j * 33 + c;
	//  100  201:iload_2         
	//  101  202:bipush          33
	//  102  204:imul            
	//  103  205:iload           4
	//  104  207:iadd            
	//  105  208:istore_2        
			l = i + 1;
	//  106  209:iload_1         
	//  107  210:iconst_1        
	//  108  211:iadd            
	//  109  212:istore          6
			obj[i] = c;
	//  110  214:aload           7
	//  111  216:iload_1         
	//  112  217:iload           4
	//  113  219:castore         
			if(l >= obj.length)
	//* 114  220:iload           6
	//* 115  222:aload           7
	//* 116  224:arraylength     
	//* 117  225:icmplt          242
			{
				obj = ((Object) (_textBuffer.finishCurrentSegment()));
	//  118  228:aload_0         
	//  119  229:getfield        #78  <Field TextBuffer _textBuffer>
	//  120  232:invokevirtual   #120 <Method char[] TextBuffer.finishCurrentSegment()>
	//  121  235:astore          7
				i = 0;
	//  122  237:iconst_0        
	//  123  238:istore_1        
			} else
	//* 124  239:goto            35
			{
				i = l;
	//  125  242:iload           6
	//  126  244:istore_1        
			}
		} while(true);
	//  127  245:goto            35
	}

	private final JsonToken _parseNumber2(boolean flag, int i)
		throws IOException
	{
		char c;
		int j1;
		int k1;
		int l1;
		int i2;
		int j2;
		int k2;
		char c4;
		char ac1[];
		int j;
label0:
		{
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
			char ac4[] = _textBuffer.emptyAndGetCurrentSegment();
	//   11   18:aload_0         
	//   12   19:getfield        #78  <Field TextBuffer _textBuffer>
	//   13   22:invokevirtual   #259 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//   14   25:astore          14
			i2 = 0;
	//   15   27:iconst_0        
	//   16   28:istore          9
			if(flag)
	//*  17   30:iload_1         
	//*  18   31:ifeq            46
			{
				ac4[0] = '-';
	//   19   34:aload           14
	//   20   36:iconst_0        
	//   21   37:bipush          45
	//   22   39:castore         
				j = 1;
	//   23   40:iconst_1        
	//   24   41:istore          5
			} else
	//*  25   43:goto            49
			{
				j = 0;
	//   26   46:iconst_0        
	//   27   47:istore          5
			}
			if(_inputPtr < _inputEnd)
	//*  28   49:aload_0         
	//*  29   50:getfield        #52  <Field int _inputPtr>
	//*  30   53:aload_0         
	//*  31   54:getfield        #55  <Field int _inputEnd>
	//*  32   57:icmpge          86
			{
				char ac[] = _inputBuffer;
	//   33   60:aload_0         
	//   34   61:getfield        #49  <Field char[] _inputBuffer>
	//   35   64:astore          13
				i = _inputPtr;
	//   36   66:aload_0         
	//   37   67:getfield        #52  <Field int _inputPtr>
	//   38   70:istore_2        
				_inputPtr = i + 1;
	//   39   71:aload_0         
	//   40   72:iload_2         
	//   41   73:iconst_1        
	//   42   74:iadd            
	//   43   75:putfield        #52  <Field int _inputPtr>
				c = ac[i];
	//   44   78:aload           13
	//   45   80:iload_2         
	//   46   81:caload          
	//   47   82:istore_3        
			} else
	//*  48   83:goto            97
			{
				c = getNextChar("No digit following minus sign", JsonToken.VALUE_NUMBER_INT);
	//   49   86:aload_0         
	//   50   87:ldc2            #261 <String "No digit following minus sign">
	//   51   90:getstatic       #264 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//   52   93:invokevirtual   #268 <Method char getNextChar(String, JsonToken)>
	//   53   96:istore_3        
			}
			char c1 = c;
	//   54   97:iload_3         
	//   55   98:istore          4
			if(c == '0')
	//*  56  100:iload_3         
	//*  57  101:bipush          48
	//*  58  103:icmpne          112
				c1 = _verifyNoLeadingZeroes();
	//   59  106:aload_0         
	//   60  107:invokespecial   #271 <Method char _verifyNoLeadingZeroes()>
	//   61  110:istore          4
			i = 0;
	//   62  112:iconst_0        
	//   63  113:istore_2        
			c = c1;
	//   64  114:iload           4
	//   65  116:istore_3        
			do
			{
				if(c < '0' || c > '9')
					break;
	//   66  117:iload_3         
	//   67  118:bipush          48
	//   68  120:icmplt          228
	//   69  123:iload_3         
	//   70  124:bipush          57
	//   71  126:icmpgt          228
				l1 = i + 1;
	//   72  129:iload_2         
	//   73  130:iconst_1        
	//   74  131:iadd            
	//   75  132:istore          8
				i = j;
	//   76  134:iload           5
	//   77  136:istore_2        
				ac1 = ac4;
	//   78  137:aload           14
	//   79  139:astore          13
				if(j >= ac4.length)
	//*  80  141:iload           5
	//*  81  143:aload           14
	//*  82  145:arraylength     
	//*  83  146:icmplt          160
				{
					ac1 = _textBuffer.finishCurrentSegment();
	//   84  149:aload_0         
	//   85  150:getfield        #78  <Field TextBuffer _textBuffer>
	//   86  153:invokevirtual   #120 <Method char[] TextBuffer.finishCurrentSegment()>
	//   87  156:astore          13
					i = 0;
	//   88  158:iconst_0        
	//   89  159:istore_2        
				}
				j = i + 1;
	//   90  160:iload_2         
	//   91  161:iconst_1        
	//   92  162:iadd            
	//   93  163:istore          5
				ac1[i] = c;
	//   94  165:aload           13
	//   95  167:iload_2         
	//   96  168:iload_3         
	//   97  169:castore         
				if(_inputPtr >= _inputEnd && !_loadMore())
	//*  98  170:aload_0         
	//*  99  171:getfield        #52  <Field int _inputPtr>
	//* 100  174:aload_0         
	//* 101  175:getfield        #55  <Field int _inputEnd>
	//* 102  178:icmplt          195
	//* 103  181:aload_0         
	//* 104  182:invokevirtual   #94  <Method boolean _loadMore()>
	//* 105  185:ifne            195
				{
					c = '\0';
	//  106  188:iconst_0        
	//  107  189:istore_3        
					i = 1;
	//  108  190:iconst_1        
	//  109  191:istore_2        
					break label0;
	//  110  192:goto            241
				}
				ac4 = _inputBuffer;
	//  111  195:aload_0         
	//  112  196:getfield        #49  <Field char[] _inputBuffer>
	//  113  199:astore          14
				i = _inputPtr;
	//  114  201:aload_0         
	//  115  202:getfield        #52  <Field int _inputPtr>
	//  116  205:istore_2        
				_inputPtr = i + 1;
	//  117  206:aload_0         
	//  118  207:iload_2         
	//  119  208:iconst_1        
	//  120  209:iadd            
	//  121  210:putfield        #52  <Field int _inputPtr>
				c = ac4[i];
	//  122  213:aload           14
	//  123  215:iload_2         
	//  124  216:caload          
	//  125  217:istore_3        
				ac4 = ac1;
	//  126  218:aload           13
	//  127  220:astore          14
				i = l1;
	//  128  222:iload           8
	//  129  224:istore_2        
			} while(true);
	//  130  225:goto            117
			boolean flag1 = false;
	//  131  228:iconst_0        
	//  132  229:istore          6
			l1 = i;
	//  133  231:iload_2         
	//  134  232:istore          8
			i = ((int) (flag1));
	//  135  234:iload           6
	//  136  236:istore_2        
			ac1 = ac4;
	//  137  237:aload           14
	//  138  239:astore          13
		}
		if(l1 == 0)
	//* 139  241:iload           8
	//* 140  243:ifne            253
			return _handleInvalidNumberStart(((int) (c)), flag);
	//  141  246:aload_0         
	//  142  247:iload_3         
	//  143  248:iload_1         
	//  144  249:invokevirtual   #275 <Method JsonToken _handleInvalidNumberStart(int, boolean)>
	//  145  252:areturn         
		char ac5[];
		if(c == '.')
	//* 146  253:iload_3         
	//* 147  254:bipush          46
	//* 148  256:icmpne          473
		{
			int i1 = j;
	//  149  259:iload           5
	//  150  261:istore          6
			ac5 = ac1;
	//  151  263:aload           13
	//  152  265:astore          14
			if(j >= ac1.length)
	//* 153  267:iload           5
	//* 154  269:aload           13
	//* 155  271:arraylength     
	//* 156  272:icmplt          287
			{
				ac5 = _textBuffer.finishCurrentSegment();
	//  157  275:aload_0         
	//  158  276:getfield        #78  <Field TextBuffer _textBuffer>
	//  159  279:invokevirtual   #120 <Method char[] TextBuffer.finishCurrentSegment()>
	//  160  282:astore          14
				i1 = 0;
	//  161  284:iconst_0        
	//  162  285:istore          6
			}
			j = i1 + 1;
	//  163  287:iload           6
	//  164  289:iconst_1        
	//  165  290:iadd            
	//  166  291:istore          5
			ac5[i1] = c;
	//  167  293:aload           14
	//  168  295:iload           6
	//  169  297:iload_3         
	//  170  298:castore         
			i1 = 0;
	//  171  299:iconst_0        
	//  172  300:istore          6
			ac1 = ac5;
	//  173  302:aload           14
	//  174  304:astore          13
			do
			{
				if(_inputPtr >= _inputEnd && !_loadMore())
	//* 175  306:aload_0         
	//* 176  307:getfield        #52  <Field int _inputPtr>
	//* 177  310:aload_0         
	//* 178  311:getfield        #55  <Field int _inputEnd>
	//* 179  314:icmplt          330
	//* 180  317:aload_0         
	//* 181  318:invokevirtual   #94  <Method boolean _loadMore()>
	//* 182  321:ifne            330
				{
					k1 = 1;
	//  183  324:iconst_1        
	//  184  325:istore          7
					break;
	//  185  327:goto            447
				}
				ac5 = _inputBuffer;
	//  186  330:aload_0         
	//  187  331:getfield        #49  <Field char[] _inputBuffer>
	//  188  334:astore          14
				k1 = _inputPtr;
	//  189  336:aload_0         
	//  190  337:getfield        #52  <Field int _inputPtr>
	//  191  340:istore          7
				_inputPtr = k1 + 1;
	//  192  342:aload_0         
	//  193  343:iload           7
	//  194  345:iconst_1        
	//  195  346:iadd            
	//  196  347:putfield        #52  <Field int _inputPtr>
				char c2 = ac5[k1];
	//  197  350:aload           14
	//  198  352:iload           7
	//  199  354:caload          
	//  200  355:istore          4
				c = c2;
	//  201  357:iload           4
	//  202  359:istore_3        
				k1 = i;
	//  203  360:iload_2         
	//  204  361:istore          7
				if(c2 < '0')
					break;
	//  205  363:iload           4
	//  206  365:bipush          48
	//  207  367:icmplt          447
				if(c2 > '9')
	//* 208  370:iload           4
	//* 209  372:bipush          57
	//* 210  374:icmple          386
				{
					c = c2;
	//  211  377:iload           4
	//  212  379:istore_3        
					k1 = i;
	//  213  380:iload_2         
	//  214  381:istore          7
					break;
	//  215  383:goto            447
				}
				k1 = i1 + 1;
	//  216  386:iload           6
	//  217  388:iconst_1        
	//  218  389:iadd            
	//  219  390:istore          7
				ac5 = ac1;
	//  220  392:aload           13
	//  221  394:astore          14
				i1 = j;
	//  222  396:iload           5
	//  223  398:istore          6
				if(j >= ac1.length)
	//* 224  400:iload           5
	//* 225  402:aload           13
	//* 226  404:arraylength     
	//* 227  405:icmplt          420
				{
					ac5 = _textBuffer.finishCurrentSegment();
	//  228  408:aload_0         
	//  229  409:getfield        #78  <Field TextBuffer _textBuffer>
	//  230  412:invokevirtual   #120 <Method char[] TextBuffer.finishCurrentSegment()>
	//  231  415:astore          14
					i1 = 0;
	//  232  417:iconst_0        
	//  233  418:istore          6
				}
				ac5[i1] = c2;
	//  234  420:aload           14
	//  235  422:iload           6
	//  236  424:iload           4
	//  237  426:castore         
				j = i1 + 1;
	//  238  427:iload           6
	//  239  429:iconst_1        
	//  240  430:iadd            
	//  241  431:istore          5
				i1 = k1;
	//  242  433:iload           7
	//  243  435:istore          6
				c = c2;
	//  244  437:iload           4
	//  245  439:istore_3        
				ac1 = ac5;
	//  246  440:aload           14
	//  247  442:astore          13
			} while(true);
	//  248  444:goto            306
			if(i1 == 0)
	//* 249  447:iload           6
	//* 250  449:ifne            459
				reportUnexpectedNumberChar(((int) (c)), "Decimal point not followed by a digit");
	//  251  452:aload_0         
	//  252  453:iload_3         
	//  253  454:ldc1            #223 <String "Decimal point not followed by a digit">
	//  254  456:invokevirtual   #227 <Method void reportUnexpectedNumberChar(int, String)>
			ac5 = ac1;
	//  255  459:aload           13
	//  256  461:astore          14
			i = k1;
	//  257  463:iload           7
	//  258  465:istore_2        
			k1 = i1;
	//  259  466:iload           6
	//  260  468:istore          7
		} else
	//* 261  470:goto            480
		{
			k1 = 0;
	//  262  473:iconst_0        
	//  263  474:istore          7
			ac5 = ac1;
	//  264  476:aload           13
	//  265  478:astore          14
		}
		if(c != 'e')
	//* 266  480:iload_3         
	//* 267  481:bipush          101
	//* 268  483:icmpeq          502
		{
			j2 = j;
	//  269  486:iload           5
	//  270  488:istore          10
			c4 = c;
	//  271  490:iload_3         
	//  272  491:istore          12
			k2 = i;
	//  273  493:iload_2         
	//  274  494:istore          11
			if(c != 'E')
				break MISSING_BLOCK_LABEL_889;
	//  275  496:iload_3         
	//  276  497:bipush          69
	//  277  499:icmpne          889
		}
		i2 = j;
	//  278  502:iload           5
	//  279  504:istore          9
		ac1 = ac5;
	//  280  506:aload           14
	//  281  508:astore          13
		if(j >= ac5.length)
	//* 282  510:iload           5
	//* 283  512:aload           14
	//* 284  514:arraylength     
	//* 285  515:icmplt          530
		{
			ac1 = _textBuffer.finishCurrentSegment();
	//  286  518:aload_0         
	//  287  519:getfield        #78  <Field TextBuffer _textBuffer>
	//  288  522:invokevirtual   #120 <Method char[] TextBuffer.finishCurrentSegment()>
	//  289  525:astore          13
			i2 = 0;
	//  290  527:iconst_0        
	//  291  528:istore          9
		}
		j1 = i2 + 1;
	//  292  530:iload           9
	//  293  532:iconst_1        
	//  294  533:iadd            
	//  295  534:istore          6
		ac1[i2] = c;
	//  296  536:aload           13
	//  297  538:iload           9
	//  298  540:iload_3         
	//  299  541:castore         
		if(_inputPtr < _inputEnd)
	//* 300  542:aload_0         
	//* 301  543:getfield        #52  <Field int _inputPtr>
	//* 302  546:aload_0         
	//* 303  547:getfield        #55  <Field int _inputEnd>
	//* 304  550:icmpge          582
		{
			char ac6[] = _inputBuffer;
	//  305  553:aload_0         
	//  306  554:getfield        #49  <Field char[] _inputBuffer>
	//  307  557:astore          14
			int k = _inputPtr;
	//  308  559:aload_0         
	//  309  560:getfield        #52  <Field int _inputPtr>
	//  310  563:istore          5
			_inputPtr = k + 1;
	//  311  565:aload_0         
	//  312  566:iload           5
	//  313  568:iconst_1        
	//  314  569:iadd            
	//  315  570:putfield        #52  <Field int _inputPtr>
			c = ac6[k];
	//  316  573:aload           14
	//  317  575:iload           5
	//  318  577:caload          
	//  319  578:istore_3        
		} else
	//* 320  579:goto            590
		{
			c = getNextChar("expected a digit for number exponent");
	//  321  582:aload_0         
	//  322  583:ldc2            #277 <String "expected a digit for number exponent">
	//  323  586:invokevirtual   #280 <Method char getNextChar(String)>
	//  324  589:istore_3        
		}
		if(c == '-') goto _L2; else goto _L1
	//  325  590:iload_3         
	//  326  591:bipush          45
	//  327  593:icmpeq          622
_L1:
		char c3;
		int l;
		char ac7[];
		c3 = c;
	//  328  596:iload_3         
	//  329  597:istore          4
		ac7 = ac1;
	//  330  599:aload           13
	//  331  601:astore          14
		l = j1;
	//  332  603:iload           6
	//  333  605:istore          5
		if(c != '+') goto _L3; else goto _L2
	//  334  607:iload_3         
	//  335  608:bipush          43
	//  336  610:icmpne          616
	//* 337  613:goto            622
_L3:
		j1 = 0;
	//  338  616:iconst_0        
	//  339  617:istore          6
		break; /* Loop/switch isn't completed */
	//  340  619:goto            715
_L2:
		ac7 = ac1;
	//  341  622:aload           13
	//  342  624:astore          14
		l = j1;
	//  343  626:iload           6
	//  344  628:istore          5
		if(j1 >= ac1.length)
	//* 345  630:iload           6
	//* 346  632:aload           13
	//* 347  634:arraylength     
	//* 348  635:icmplt          650
		{
			ac7 = _textBuffer.finishCurrentSegment();
	//  349  638:aload_0         
	//  350  639:getfield        #78  <Field TextBuffer _textBuffer>
	//  351  642:invokevirtual   #120 <Method char[] TextBuffer.finishCurrentSegment()>
	//  352  645:astore          14
			l = 0;
	//  353  647:iconst_0        
	//  354  648:istore          5
		}
		ac7[l] = c;
	//  355  650:aload           14
	//  356  652:iload           5
	//  357  654:iload_3         
	//  358  655:castore         
		if(_inputPtr < _inputEnd)
	//* 359  656:aload_0         
	//* 360  657:getfield        #52  <Field int _inputPtr>
	//* 361  660:aload_0         
	//* 362  661:getfield        #55  <Field int _inputEnd>
	//* 363  664:icmpge          697
		{
			char ac2[] = _inputBuffer;
	//  364  667:aload_0         
	//  365  668:getfield        #49  <Field char[] _inputBuffer>
	//  366  671:astore          13
			j1 = _inputPtr;
	//  367  673:aload_0         
	//  368  674:getfield        #52  <Field int _inputPtr>
	//  369  677:istore          6
			_inputPtr = j1 + 1;
	//  370  679:aload_0         
	//  371  680:iload           6
	//  372  682:iconst_1        
	//  373  683:iadd            
	//  374  684:putfield        #52  <Field int _inputPtr>
			c3 = ac2[j1];
	//  375  687:aload           13
	//  376  689:iload           6
	//  377  691:caload          
	//  378  692:istore          4
		} else
	//* 379  694:goto            706
		{
			c3 = getNextChar("expected a digit for number exponent");
	//  380  697:aload_0         
	//  381  698:ldc2            #277 <String "expected a digit for number exponent">
	//  382  701:invokevirtual   #280 <Method char getNextChar(String)>
	//  383  704:istore          4
		}
		l++;
	//  384  706:iload           5
	//  385  708:iconst_1        
	//  386  709:iadd            
	//  387  710:istore          5
		if(true) goto _L3; else goto _L4
	//  388  712:goto            616
_L4:
label1:
		{
			do
			{
				if(c3 > '9' || c3 < '0')
					break;
	//  389  715:iload           4
	//  390  717:bipush          57
	//  391  719:icmpgt          837
	//  392  722:iload           4
	//  393  724:bipush          48
	//  394  726:icmplt          837
				j1++;
	//  395  729:iload           6
	//  396  731:iconst_1        
	//  397  732:iadd            
	//  398  733:istore          6
				char ac3[] = ac7;
	//  399  735:aload           14
	//  400  737:astore          13
				i2 = l;
	//  401  739:iload           5
	//  402  741:istore          9
				if(l >= ac7.length)
	//* 403  743:iload           5
	//* 404  745:aload           14
	//* 405  747:arraylength     
	//* 406  748:icmplt          763
				{
					ac3 = _textBuffer.finishCurrentSegment();
	//  407  751:aload_0         
	//  408  752:getfield        #78  <Field TextBuffer _textBuffer>
	//  409  755:invokevirtual   #120 <Method char[] TextBuffer.finishCurrentSegment()>
	//  410  758:astore          13
					i2 = 0;
	//  411  760:iconst_0        
	//  412  761:istore          9
				}
				l = i2 + 1;
	//  413  763:iload           9
	//  414  765:iconst_1        
	//  415  766:iadd            
	//  416  767:istore          5
				ac3[i2] = c3;
	//  417  769:aload           13
	//  418  771:iload           9
	//  419  773:iload           4
	//  420  775:castore         
				if(_inputPtr >= _inputEnd && !_loadMore())
	//* 421  776:aload_0         
	//* 422  777:getfield        #52  <Field int _inputPtr>
	//* 423  780:aload_0         
	//* 424  781:getfield        #55  <Field int _inputEnd>
	//* 425  784:icmplt          803
	//* 426  787:aload_0         
	//* 427  788:invokevirtual   #94  <Method boolean _loadMore()>
	//* 428  791:ifne            803
				{
					i = j1;
	//  429  794:iload           6
	//  430  796:istore_2        
					j1 = 1;
	//  431  797:iconst_1        
	//  432  798:istore          6
					break label1;
	//  433  800:goto            847
				}
				ac7 = _inputBuffer;
	//  434  803:aload_0         
	//  435  804:getfield        #49  <Field char[] _inputBuffer>
	//  436  807:astore          14
				i2 = _inputPtr;
	//  437  809:aload_0         
	//  438  810:getfield        #52  <Field int _inputPtr>
	//  439  813:istore          9
				_inputPtr = i2 + 1;
	//  440  815:aload_0         
	//  441  816:iload           9
	//  442  818:iconst_1        
	//  443  819:iadd            
	//  444  820:putfield        #52  <Field int _inputPtr>
				c3 = ac7[i2];
	//  445  823:aload           14
	//  446  825:iload           9
	//  447  827:caload          
	//  448  828:istore          4
				ac7 = ac3;
	//  449  830:aload           13
	//  450  832:astore          14
			} while(true);
	//  451  834:goto            715
			i2 = j1;
	//  452  837:iload           6
	//  453  839:istore          9
			j1 = i;
	//  454  841:iload_2         
	//  455  842:istore          6
			i = i2;
	//  456  844:iload           9
	//  457  846:istore_2        
		}
		i2 = i;
	//  458  847:iload_2         
	//  459  848:istore          9
		j2 = l;
	//  460  850:iload           5
	//  461  852:istore          10
		c4 = c3;
	//  462  854:iload           4
	//  463  856:istore          12
		k2 = j1;
	//  464  858:iload           6
	//  465  860:istore          11
		if(i == 0)
	//* 466  862:iload_2         
	//* 467  863:ifne            889
		{
			reportUnexpectedNumberChar(((int) (c3)), "Exponent indicator not followed by a digit");
	//  468  866:aload_0         
	//  469  867:iload           4
	//  470  869:ldc1            #229 <String "Exponent indicator not followed by a digit">
	//  471  871:invokevirtual   #227 <Method void reportUnexpectedNumberChar(int, String)>
			k2 = j1;
	//  472  874:iload           6
	//  473  876:istore          11
			c4 = c3;
	//  474  878:iload           4
	//  475  880:istore          12
			j2 = l;
	//  476  882:iload           5
	//  477  884:istore          10
			i2 = i;
	//  478  886:iload_2         
	//  479  887:istore          9
		}
		if(k2 == 0)
	//* 480  889:iload           11
	//* 481  891:ifne            920
		{
			_inputPtr = _inputPtr - 1;
	//  482  894:aload_0         
	//  483  895:aload_0         
	//  484  896:getfield        #52  <Field int _inputPtr>
	//  485  899:iconst_1        
	//  486  900:isub            
	//  487  901:putfield        #52  <Field int _inputPtr>
			if(_parsingContext.inRoot())
	//* 488  904:aload_0         
	//* 489  905:getfield        #189 <Field JsonReadContext _parsingContext>
	//* 490  908:invokevirtual   #232 <Method boolean JsonReadContext.inRoot()>
	//* 491  911:ifeq            920
				_verifyRootSpace(((int) (c4)));
	//  492  914:aload_0         
	//  493  915:iload           12
	//  494  917:invokespecial   #235 <Method void _verifyRootSpace(int)>
		}
		_textBuffer.setCurrentLength(j2);
	//  495  920:aload_0         
	//  496  921:getfield        #78  <Field TextBuffer _textBuffer>
	//  497  924:iload           10
	//  498  926:invokevirtual   #104 <Method void TextBuffer.setCurrentLength(int)>
		return reset(flag, l1, k1, i2);
	//  499  929:aload_0         
	//  500  930:iload_1         
	//  501  931:iload           8
	//  502  933:iload           7
	//  503  935:iload           9
	//  504  937:invokevirtual   #283 <Method JsonToken reset(boolean, int, int, int)>
	//  505  940:areturn         
	}

	private final int _skipAfterComma2()
		throws IOException
	{
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #55  <Field int _inputEnd>
	//*   4    8:icmplt          66
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #94  <Method boolean _loadMore()>
	//*   7   15:ifeq            21
	//*   8   18:goto            66
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    9   21:new             #286 <Class StringBuilder>
	//   10   24:dup             
	//   11   25:invokespecial   #288 <Method void StringBuilder()>
	//   12   28:astore_2        
				stringbuilder.append("Unexpected end-of-input within/between ");
	//   13   29:aload_2         
	//   14   30:ldc2            #290 <String "Unexpected end-of-input within/between ">
	//   15   33:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   16   36:pop             
				stringbuilder.append(_parsingContext.typeDesc());
	//   17   37:aload_2         
	//   18   38:aload_0         
	//   19   39:getfield        #189 <Field JsonReadContext _parsingContext>
	//   20   42:invokevirtual   #298 <Method String JsonReadContext.typeDesc()>
	//   21   45:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:pop             
				stringbuilder.append(" entries");
	//   23   49:aload_2         
	//   24   50:ldc2            #300 <String " entries">
	//   25   53:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   26   56:pop             
				throw _constructError(stringbuilder.toString());
	//   27   57:aload_0         
	//   28   58:aload_2         
	//   29   59:invokevirtual   #303 <Method String StringBuilder.toString()>
	//   30   62:invokevirtual   #307 <Method com.fasterxml.jackson.core.JsonParseException _constructError(String)>
	//   31   65:athrow          
			}
			char ac[] = _inputBuffer;
	//   32   66:aload_0         
	//   33   67:getfield        #49  <Field char[] _inputBuffer>
	//   34   70:astore_2        
			int i = _inputPtr;
	//   35   71:aload_0         
	//   36   72:getfield        #52  <Field int _inputPtr>
	//   37   75:istore_1        
			_inputPtr = i + 1;
	//   38   76:aload_0         
	//   39   77:iload_1         
	//   40   78:iconst_1        
	//   41   79:iadd            
	//   42   80:putfield        #52  <Field int _inputPtr>
			i = ((int) (ac[i]));
	//   43   83:aload_2         
	//   44   84:iload_1         
	//   45   85:caload          
	//   46   86:istore_1        
			if(i > ' ')
	//*  47   87:iload_1         
	//*  48   88:bipush          32
	//*  49   90:icmple          124
			{
				if(i == '/')
	//*  50   93:iload_1         
	//*  51   94:bipush          47
	//*  52   96:icmpne          106
					_skipComment();
	//   53   99:aload_0         
	//   54  100:invokespecial   #310 <Method void _skipComment()>
				else
	//*  55  103:goto            0
				if(i != '#' || !_skipYAMLComment())
	//*  56  106:iload_1         
	//*  57  107:bipush          35
	//*  58  109:icmpne          122
	//*  59  112:aload_0         
	//*  60  113:invokespecial   #313 <Method boolean _skipYAMLComment()>
	//*  61  116:ifeq            122
	//*  62  119:goto            0
					return i;
	//   63  122:iload_1         
	//   64  123:ireturn         
			} else
			if(i < ' ')
	//*  65  124:iload_1         
	//*  66  125:bipush          32
	//*  67  127:icmpge          0
				if(i == '\n')
	//*  68  130:iload_1         
	//*  69  131:bipush          10
	//*  70  133:icmpne          157
				{
					_currInputRow = _currInputRow + 1;
	//   71  136:aload_0         
	//   72  137:aload_0         
	//   73  138:getfield        #316 <Field int _currInputRow>
	//   74  141:iconst_1        
	//   75  142:iadd            
	//   76  143:putfield        #316 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   77  146:aload_0         
	//   78  147:aload_0         
	//   79  148:getfield        #52  <Field int _inputPtr>
	//   80  151:putfield        #319 <Field int _currInputRowStart>
				} else
	//*  81  154:goto            0
				if(i == '\r')
	//*  82  157:iload_1         
	//*  83  158:bipush          13
	//*  84  160:icmpne          170
					_skipCR();
	//   85  163:aload_0         
	//   86  164:invokevirtual   #322 <Method void _skipCR()>
				else
	//*  87  167:goto            0
				if(i != '\t')
	//*  88  170:iload_1         
	//*  89  171:bipush          9
	//*  90  173:icmpeq          0
					_throwInvalidSpace(i);
	//   91  176:aload_0         
	//   92  177:iload_1         
	//   93  178:invokevirtual   #325 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   94  181:goto            0
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
					if(_inputPtr < _inputEnd || _loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #55  <Field int _inputEnd>
	//*   4    8:icmplt          18
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #94  <Method boolean _loadMore()>
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
	//   28   48:icmpne          103
						if(_inputPtr < _inputEnd || _loadMore())
							break label1;
	//   29   51:aload_0         
	//   30   52:getfield        #52  <Field int _inputPtr>
	//   31   55:aload_0         
	//   32   56:getfield        #55  <Field int _inputEnd>
	//   33   59:icmplt          78
	//   34   62:aload_0         
	//   35   63:invokevirtual   #94  <Method boolean _loadMore()>
	//   36   66:ifne            78
					}
					_reportInvalidEOF(" in a comment", ((JsonToken) (null)));
	//   37   69:aload_0         
	//   38   70:ldc2            #328 <String " in a comment">
	//   39   73:aconst_null     
	//   40   74:invokevirtual   #247 <Method void _reportInvalidEOF(String, JsonToken)>
					return;
	//   41   77:return          
				}
				if(_inputBuffer[_inputPtr] == '/')
	//*  42   78:aload_0         
	//*  43   79:getfield        #49  <Field char[] _inputBuffer>
	//*  44   82:aload_0         
	//*  45   83:getfield        #52  <Field int _inputPtr>
	//*  46   86:caload          
	//*  47   87:bipush          47
	//*  48   89:icmpne          0
				{
					_inputPtr = _inputPtr + 1;
	//   49   92:aload_0         
	//   50   93:aload_0         
	//   51   94:getfield        #52  <Field int _inputPtr>
	//   52   97:iconst_1        
	//   53   98:iadd            
	//   54   99:putfield        #52  <Field int _inputPtr>
					return;
	//   55  102:return          
				}
				continue;
			}
			if(i < ' ')
	//*  56  103:iload_1         
	//*  57  104:bipush          32
	//*  58  106:icmpge          0
				if(i == '\n')
	//*  59  109:iload_1         
	//*  60  110:bipush          10
	//*  61  112:icmpne          136
				{
					_currInputRow = _currInputRow + 1;
	//   62  115:aload_0         
	//   63  116:aload_0         
	//   64  117:getfield        #316 <Field int _currInputRow>
	//   65  120:iconst_1        
	//   66  121:iadd            
	//   67  122:putfield        #316 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   68  125:aload_0         
	//   69  126:aload_0         
	//   70  127:getfield        #52  <Field int _inputPtr>
	//   71  130:putfield        #319 <Field int _currInputRowStart>
				} else
	//*  72  133:goto            0
				if(i == '\r')
	//*  73  136:iload_1         
	//*  74  137:bipush          13
	//*  75  139:icmpne          149
					_skipCR();
	//   76  142:aload_0         
	//   77  143:invokevirtual   #322 <Method void _skipCR()>
				else
	//*  78  146:goto            0
				if(i != '\t')
	//*  79  149:iload_1         
	//*  80  150:bipush          9
	//*  81  152:icmpeq          0
					_throwInvalidSpace(i);
	//   82  155:aload_0         
	//   83  156:iload_1         
	//   84  157:invokevirtual   #325 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   85  160:goto            0
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
	//    9   15:invokespecial   #333 <Method int _skipColon2(boolean)>
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
	//*  19   32:icmpne          173
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
	//*  37   59:icmple          95
					if(i != '/' && i != '#')
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
	//   47   79:getfield        #52  <Field int _inputPtr>
	//   48   82:iconst_1        
	//   49   83:iadd            
	//   50   84:putfield        #52  <Field int _inputPtr>
						return i;
	//   51   87:iload_1         
	//   52   88:ireturn         
					} else
					{
						return _skipColon2(true);
	//   53   89:aload_0         
	//   54   90:iconst_1        
	//   55   91:invokespecial   #333 <Method int _skipColon2(boolean)>
	//   56   94:ireturn         
					}
				if(i == ' ' || i == '\t')
	//*  57   95:iload_1         
	//*  58   96:bipush          32
	//*  59   98:icmpeq          107
	//*  60  101:iload_1         
	//*  61  102:bipush          9
	//*  62  104:icmpne          167
				{
					char ac1[] = _inputBuffer;
	//   63  107:aload_0         
	//   64  108:getfield        #49  <Field char[] _inputBuffer>
	//   65  111:astore_3        
					int j = _inputPtr + 1;
	//   66  112:aload_0         
	//   67  113:getfield        #52  <Field int _inputPtr>
	//   68  116:iconst_1        
	//   69  117:iadd            
	//   70  118:istore_1        
					_inputPtr = j;
	//   71  119:aload_0         
	//   72  120:iload_1         
	//   73  121:putfield        #52  <Field int _inputPtr>
					j = ((int) (ac1[j]));
	//   74  124:aload_3         
	//   75  125:iload_1         
	//   76  126:caload          
	//   77  127:istore_1        
					if(j > ' ')
	//*  78  128:iload_1         
	//*  79  129:bipush          32
	//*  80  131:icmple          167
						if(j != '/' && j != '#')
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
	//   90  151:getfield        #52  <Field int _inputPtr>
	//   91  154:iconst_1        
	//   92  155:iadd            
	//   93  156:putfield        #52  <Field int _inputPtr>
							return j;
	//   94  159:iload_1         
	//   95  160:ireturn         
						} else
						{
							return _skipColon2(true);
	//   96  161:aload_0         
	//   97  162:iconst_1        
	//   98  163:invokespecial   #333 <Method int _skipColon2(boolean)>
	//   99  166:ireturn         
						}
				}
				return _skipColon2(true);
	//  100  167:aload_0         
	//  101  168:iconst_1        
	//  102  169:invokespecial   #333 <Method int _skipColon2(boolean)>
	//  103  172:ireturn         
			}
			if(c != ' ')
	//* 104  173:iload_2         
	//* 105  174:bipush          32
	//* 106  176:icmpeq          187
			{
				k = ((int) (c));
	//  107  179:iload_2         
	//  108  180:istore_1        
				if(c != '\t')
					break label0;
	//  109  181:iload_2         
	//  110  182:bipush          9
	//  111  184:icmpne          208
			}
			char ac2[] = _inputBuffer;
	//  112  187:aload_0         
	//  113  188:getfield        #49  <Field char[] _inputBuffer>
	//  114  191:astore_3        
			k = _inputPtr + 1;
	//  115  192:aload_0         
	//  116  193:getfield        #52  <Field int _inputPtr>
	//  117  196:iconst_1        
	//  118  197:iadd            
	//  119  198:istore_1        
			_inputPtr = k;
	//  120  199:aload_0         
	//  121  200:iload_1         
	//  122  201:putfield        #52  <Field int _inputPtr>
			k = ((int) (ac2[k]));
	//  123  204:aload_3         
	//  124  205:iload_1         
	//  125  206:caload          
	//  126  207:istore_1        
		}
		if(k == 58)
	//* 127  208:iload_1         
	//* 128  209:bipush          58
	//* 129  211:icmpne          352
		{
			char ac3[] = _inputBuffer;
	//  130  214:aload_0         
	//  131  215:getfield        #49  <Field char[] _inputBuffer>
	//  132  218:astore_3        
			int l = _inputPtr + 1;
	//  133  219:aload_0         
	//  134  220:getfield        #52  <Field int _inputPtr>
	//  135  223:iconst_1        
	//  136  224:iadd            
	//  137  225:istore_1        
			_inputPtr = l;
	//  138  226:aload_0         
	//  139  227:iload_1         
	//  140  228:putfield        #52  <Field int _inputPtr>
			l = ((int) (ac3[l]));
	//  141  231:aload_3         
	//  142  232:iload_1         
	//  143  233:caload          
	//  144  234:istore_1        
			if(l > ' ')
	//* 145  235:iload_1         
	//* 146  236:bipush          32
	//* 147  238:icmple          274
				if(l != '/' && l != '#')
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
	//  157  258:getfield        #52  <Field int _inputPtr>
	//  158  261:iconst_1        
	//  159  262:iadd            
	//  160  263:putfield        #52  <Field int _inputPtr>
					return l;
	//  161  266:iload_1         
	//  162  267:ireturn         
				} else
				{
					return _skipColon2(true);
	//  163  268:aload_0         
	//  164  269:iconst_1        
	//  165  270:invokespecial   #333 <Method int _skipColon2(boolean)>
	//  166  273:ireturn         
				}
			if(l == ' ' || l == '\t')
	//* 167  274:iload_1         
	//* 168  275:bipush          32
	//* 169  277:icmpeq          286
	//* 170  280:iload_1         
	//* 171  281:bipush          9
	//* 172  283:icmpne          346
			{
				char ac4[] = _inputBuffer;
	//  173  286:aload_0         
	//  174  287:getfield        #49  <Field char[] _inputBuffer>
	//  175  290:astore_3        
				int i1 = _inputPtr + 1;
	//  176  291:aload_0         
	//  177  292:getfield        #52  <Field int _inputPtr>
	//  178  295:iconst_1        
	//  179  296:iadd            
	//  180  297:istore_1        
				_inputPtr = i1;
	//  181  298:aload_0         
	//  182  299:iload_1         
	//  183  300:putfield        #52  <Field int _inputPtr>
				i1 = ((int) (ac4[i1]));
	//  184  303:aload_3         
	//  185  304:iload_1         
	//  186  305:caload          
	//  187  306:istore_1        
				if(i1 > ' ')
	//* 188  307:iload_1         
	//* 189  308:bipush          32
	//* 190  310:icmple          346
					if(i1 != '/' && i1 != '#')
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
	//  200  330:getfield        #52  <Field int _inputPtr>
	//  201  333:iconst_1        
	//  202  334:iadd            
	//  203  335:putfield        #52  <Field int _inputPtr>
						return i1;
	//  204  338:iload_1         
	//  205  339:ireturn         
					} else
					{
						return _skipColon2(true);
	//  206  340:aload_0         
	//  207  341:iconst_1        
	//  208  342:invokespecial   #333 <Method int _skipColon2(boolean)>
	//  209  345:ireturn         
					}
			}
			return _skipColon2(true);
	//  210  346:aload_0         
	//  211  347:iconst_1        
	//  212  348:invokespecial   #333 <Method int _skipColon2(boolean)>
	//  213  351:ireturn         
		} else
		{
			return _skipColon2(false);
	//  214  352:aload_0         
	//  215  353:iconst_0        
	//  216  354:invokespecial   #333 <Method int _skipColon2(boolean)>
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
	//*   1    1:getfield        #52  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #55  <Field int _inputEnd>
	//*   4    8:icmplt          68
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #94  <Method boolean _loadMore()>
	//*   7   15:ifeq            21
	//*   8   18:goto            68
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    9   21:new             #286 <Class StringBuilder>
	//   10   24:dup             
	//   11   25:invokespecial   #288 <Method void StringBuilder()>
	//   12   28:astore_3        
				stringbuilder.append(" within/between ");
	//   13   29:aload_3         
	//   14   30:ldc2            #335 <String " within/between ">
	//   15   33:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   16   36:pop             
				stringbuilder.append(_parsingContext.typeDesc());
	//   17   37:aload_3         
	//   18   38:aload_0         
	//   19   39:getfield        #189 <Field JsonReadContext _parsingContext>
	//   20   42:invokevirtual   #298 <Method String JsonReadContext.typeDesc()>
	//   21   45:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:pop             
				stringbuilder.append(" entries");
	//   23   49:aload_3         
	//   24   50:ldc2            #300 <String " entries">
	//   25   53:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   26   56:pop             
				_reportInvalidEOF(stringbuilder.toString(), ((JsonToken) (null)));
	//   27   57:aload_0         
	//   28   58:aload_3         
	//   29   59:invokevirtual   #303 <Method String StringBuilder.toString()>
	//   30   62:aconst_null     
	//   31   63:invokevirtual   #247 <Method void _reportInvalidEOF(String, JsonToken)>
				return -1;
	//   32   66:iconst_m1       
	//   33   67:ireturn         
			}
			char ac[] = _inputBuffer;
	//   34   68:aload_0         
	//   35   69:getfield        #49  <Field char[] _inputBuffer>
	//   36   72:astore_3        
			int i = _inputPtr;
	//   37   73:aload_0         
	//   38   74:getfield        #52  <Field int _inputPtr>
	//   39   77:istore_2        
			_inputPtr = i + 1;
	//   40   78:aload_0         
	//   41   79:iload_2         
	//   42   80:iconst_1        
	//   43   81:iadd            
	//   44   82:putfield        #52  <Field int _inputPtr>
			i = ((int) (ac[i]));
	//   45   85:aload_3         
	//   46   86:iload_2         
	//   47   87:caload          
	//   48   88:istore_2        
			if(i > ' ')
	//*  49   89:iload_2         
	//*  50   90:bipush          32
	//*  51   92:icmple          149
			{
				if(i == '/')
	//*  52   95:iload_2         
	//*  53   96:bipush          47
	//*  54   98:icmpne          108
					_skipComment();
	//   55  101:aload_0         
	//   56  102:invokespecial   #310 <Method void _skipComment()>
				else
	//*  57  105:goto            0
				if(i != '#' || !_skipYAMLComment())
	//*  58  108:iload_2         
	//*  59  109:bipush          35
	//*  60  111:icmpne          124
	//*  61  114:aload_0         
	//*  62  115:invokespecial   #313 <Method boolean _skipYAMLComment()>
	//*  63  118:ifeq            124
	//*  64  121:goto            0
				{
					if(flag)
	//*  65  124:iload_1         
	//*  66  125:ifeq            130
						return i;
	//   67  128:iload_2         
	//   68  129:ireturn         
					if(i != ':')
	//*  69  130:iload_2         
	//*  70  131:bipush          58
	//*  71  133:icmpeq          144
						_reportUnexpectedChar(i, "was expecting a colon to separate field name and value");
	//   72  136:aload_0         
	//   73  137:iload_2         
	//   74  138:ldc2            #337 <String "was expecting a colon to separate field name and value">
	//   75  141:invokevirtual   #340 <Method void _reportUnexpectedChar(int, String)>
					flag = true;
	//   76  144:iconst_1        
	//   77  145:istore_1        
				}
			} else
	//*  78  146:goto            0
			if(i < ' ')
	//*  79  149:iload_2         
	//*  80  150:bipush          32
	//*  81  152:icmpge          0
				if(i == '\n')
	//*  82  155:iload_2         
	//*  83  156:bipush          10
	//*  84  158:icmpne          182
				{
					_currInputRow = _currInputRow + 1;
	//   85  161:aload_0         
	//   86  162:aload_0         
	//   87  163:getfield        #316 <Field int _currInputRow>
	//   88  166:iconst_1        
	//   89  167:iadd            
	//   90  168:putfield        #316 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   91  171:aload_0         
	//   92  172:aload_0         
	//   93  173:getfield        #52  <Field int _inputPtr>
	//   94  176:putfield        #319 <Field int _currInputRowStart>
				} else
	//*  95  179:goto            0
				if(i == '\r')
	//*  96  182:iload_2         
	//*  97  183:bipush          13
	//*  98  185:icmpne          195
					_skipCR();
	//   99  188:aload_0         
	//  100  189:invokevirtual   #322 <Method void _skipCR()>
				else
	//* 101  192:goto            0
				if(i != '\t')
	//* 102  195:iload_2         
	//* 103  196:bipush          9
	//* 104  198:icmpeq          0
					_throwInvalidSpace(i);
	//  105  201:aload_0         
	//  106  202:iload_2         
	//  107  203:invokevirtual   #325 <Method void _throwInvalidSpace(int)>
		} while(true);
	//  108  206:goto            0
	}

	private final int _skipColonFast(int i)
		throws IOException
	{
		int l;
		char c1;
label0:
		{
label1:
			{
				char ac[] = _inputBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field char[] _inputBuffer>
	//    2    4:astore          6
				l = i + 1;
	//    3    6:iload_1         
	//    4    7:iconst_1        
	//    5    8:iadd            
	//    6    9:istore_3        
				c1 = ac[i];
	//    7   10:aload           6
	//    8   12:iload_1         
	//    9   13:caload          
	//   10   14:istore          4
				if(c1 != ':')
					break label0;
	//   11   16:iload           4
	//   12   18:bipush          58
	//   13   20:icmpne          134
				ac = _inputBuffer;
	//   14   23:aload_0         
	//   15   24:getfield        #49  <Field char[] _inputBuffer>
	//   16   27:astore          6
				int j = l + 1;
	//   17   29:iload_3         
	//   18   30:iconst_1        
	//   19   31:iadd            
	//   20   32:istore_2        
				l = ((int) (ac[l]));
	//   21   33:aload           6
	//   22   35:iload_3         
	//   23   36:caload          
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
	//   40   62:putfield        #52  <Field int _inputPtr>
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
				ac = _inputBuffer;
	//   51   81:aload_0         
	//   52   82:getfield        #49  <Field char[] _inputBuffer>
	//   53   85:astore          6
				i = j + 1;
	//   54   87:iload_2         
	//   55   88:iconst_1        
	//   56   89:iadd            
	//   57   90:istore_1        
				j = ((int) (ac[j]));
	//   58   91:aload           6
	//   59   93:iload_2         
	//   60   94:caload          
	//   61   95:istore_2        
				if(j > ' ' && j != '/' && j != '#')
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
	//   73  116:putfield        #52  <Field int _inputPtr>
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
	//   80  125:putfield        #52  <Field int _inputPtr>
			return _skipColon2(true);
	//   81  128:aload_0         
	//   82  129:iconst_1        
	//   83  130:invokespecial   #333 <Method int _skipColon2(boolean)>
	//   84  133:ireturn         
		}
		int k;
label2:
		{
			if(c1 != ' ')
	//*  85  134:iload           4
	//*  86  136:bipush          32
	//*  87  138:icmpeq          153
			{
				i = l;
	//   88  141:iload_3         
	//   89  142:istore_1        
				k = ((int) (c1));
	//   90  143:iload           4
	//   91  145:istore_2        
				if(c1 != '\t')
					break label2;
	//   92  146:iload           4
	//   93  148:bipush          9
	//   94  150:icmpne          164
			}
			k = ((int) (_inputBuffer[l]));
	//   95  153:aload_0         
	//   96  154:getfield        #49  <Field char[] _inputBuffer>
	//   97  157:iload_3         
	//   98  158:caload          
	//   99  159:istore_2        
			i = l + 1;
	//  100  160:iload_3         
	//  101  161:iconst_1        
	//  102  162:iadd            
	//  103  163:istore_1        
		}
		boolean flag;
		if(k == ':')
	//* 104  164:iload_2         
	//* 105  165:bipush          58
	//* 106  167:icmpne          176
			flag = true;
	//  107  170:iconst_1        
	//  108  171:istore          5
		else
	//* 109  173:goto            179
			flag = false;
	//  110  176:iconst_0        
	//  111  177:istore          5
		k = i;
	//  112  179:iload_1         
	//  113  180:istore_2        
		if(flag)
	//* 114  181:iload           5
	//* 115  183:ifeq            290
		{
			char ac1[] = _inputBuffer;
	//  116  186:aload_0         
	//  117  187:getfield        #49  <Field char[] _inputBuffer>
	//  118  190:astore          6
			k = i + 1;
	//  119  192:iload_1         
	//  120  193:iconst_1        
	//  121  194:iadd            
	//  122  195:istore_2        
			i = ((int) (ac1[i]));
	//  123  196:aload           6
	//  124  198:iload_1         
	//  125  199:caload          
	//  126  200:istore_1        
			if(i > 32)
	//* 127  201:iload_1         
	//* 128  202:bipush          32
	//* 129  204:icmple          226
			{
				if(i != 47 && i != 35)
	//* 130  207:iload_1         
	//* 131  208:bipush          47
	//* 132  210:icmpeq          241
	//* 133  213:iload_1         
	//* 134  214:bipush          35
	//* 135  216:icmpeq          241
				{
					_inputPtr = k;
	//  136  219:aload_0         
	//  137  220:iload_2         
	//  138  221:putfield        #52  <Field int _inputPtr>
					return i;
	//  139  224:iload_1         
	//  140  225:ireturn         
				}
			} else
			if(i == 32 || i == 9)
	//* 141  226:iload_1         
	//* 142  227:bipush          32
	//* 143  229:icmpeq          244
	//* 144  232:iload_1         
	//* 145  233:bipush          9
	//* 146  235:icmpne          241
	//* 147  238:goto            244
	//* 148  241:goto            290
			{
				char ac2[] = _inputBuffer;
	//  149  244:aload_0         
	//  150  245:getfield        #49  <Field char[] _inputBuffer>
	//  151  248:astore          6
				i = k + 1;
	//  152  250:iload_2         
	//  153  251:iconst_1        
	//  154  252:iadd            
	//  155  253:istore_1        
				char c = ac2[k];
	//  156  254:aload           6
	//  157  256:iload_2         
	//  158  257:caload          
	//  159  258:istore_3        
				k = i;
	//  160  259:iload_1         
	//  161  260:istore_2        
				if(c > ' ')
	//* 162  261:iload_3         
	//* 163  262:bipush          32
	//* 164  264:icmple          290
				{
					k = i;
	//  165  267:iload_1         
	//  166  268:istore_2        
					if(c != '/')
	//* 167  269:iload_3         
	//* 168  270:bipush          47
	//* 169  272:icmpeq          290
					{
						k = i;
	//  170  275:iload_1         
	//  171  276:istore_2        
						if(c != '#')
	//* 172  277:iload_3         
	//* 173  278:bipush          35
	//* 174  280:icmpeq          290
						{
							_inputPtr = i;
	//  175  283:aload_0         
	//  176  284:iload_1         
	//  177  285:putfield        #52  <Field int _inputPtr>
							return ((int) (c));
	//  178  288:iload_3         
	//  179  289:ireturn         
						}
					}
				}
			}
		}
		_inputPtr = k - 1;
	//  180  290:aload_0         
	//  181  291:iload_2         
	//  182  292:iconst_1        
	//  183  293:isub            
	//  184  294:putfield        #52  <Field int _inputPtr>
		return _skipColon2(flag);
	//  185  297:aload_0         
	//  186  298:iload           5
	//  187  300:invokespecial   #333 <Method int _skipColon2(boolean)>
	//  188  303:ireturn         
	}

	private final int _skipComma(int i)
		throws IOException
	{
		if(i != 44)
	//*   0    0:iload_1         
	//*   1    1:bipush          44
	//*   2    3:icmpeq          51
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    6:new             #286 <Class StringBuilder>
	//    4    9:dup             
	//    5   10:invokespecial   #288 <Method void StringBuilder()>
	//    6   13:astore_2        
			stringbuilder.append("was expecting comma to separate ");
	//    7   14:aload_2         
	//    8   15:ldc2            #345 <String "was expecting comma to separate ">
	//    9   18:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			stringbuilder.append(_parsingContext.typeDesc());
	//   11   22:aload_2         
	//   12   23:aload_0         
	//   13   24:getfield        #189 <Field JsonReadContext _parsingContext>
	//   14   27:invokevirtual   #298 <Method String JsonReadContext.typeDesc()>
	//   15   30:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			stringbuilder.append(" entries");
	//   17   34:aload_2         
	//   18   35:ldc2            #300 <String " entries">
	//   19   38:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
			_reportUnexpectedChar(i, stringbuilder.toString());
	//   21   42:aload_0         
	//   22   43:iload_1         
	//   23   44:aload_2         
	//   24   45:invokevirtual   #303 <Method String StringBuilder.toString()>
	//   25   48:invokevirtual   #340 <Method void _reportUnexpectedChar(int, String)>
		}
		do
		{
			if(_inputPtr >= _inputEnd)
				break;
	//   26   51:aload_0         
	//   27   52:getfield        #52  <Field int _inputPtr>
	//   28   55:aload_0         
	//   29   56:getfield        #55  <Field int _inputEnd>
	//   30   59:icmpge          181
			char ac[] = _inputBuffer;
	//   31   62:aload_0         
	//   32   63:getfield        #49  <Field char[] _inputBuffer>
	//   33   66:astore_2        
			i = _inputPtr;
	//   34   67:aload_0         
	//   35   68:getfield        #52  <Field int _inputPtr>
	//   36   71:istore_1        
			_inputPtr = i + 1;
	//   37   72:aload_0         
	//   38   73:iload_1         
	//   39   74:iconst_1        
	//   40   75:iadd            
	//   41   76:putfield        #52  <Field int _inputPtr>
			i = ((int) (ac[i]));
	//   42   79:aload_2         
	//   43   80:iload_1         
	//   44   81:caload          
	//   45   82:istore_1        
			if(i > 32)
	//*  46   83:iload_1         
	//*  47   84:bipush          32
	//*  48   86:icmple          121
				if(i != 47 && i != 35)
	//*  49   89:iload_1         
	//*  50   90:bipush          47
	//*  51   92:icmpeq          106
	//*  52   95:iload_1         
	//*  53   96:bipush          35
	//*  54   98:icmpne          104
	//*  55  101:goto            106
				{
					return i;
	//   56  104:iload_1         
	//   57  105:ireturn         
				} else
				{
					_inputPtr = _inputPtr - 1;
	//   58  106:aload_0         
	//   59  107:aload_0         
	//   60  108:getfield        #52  <Field int _inputPtr>
	//   61  111:iconst_1        
	//   62  112:isub            
	//   63  113:putfield        #52  <Field int _inputPtr>
					return _skipAfterComma2();
	//   64  116:aload_0         
	//   65  117:invokespecial   #347 <Method int _skipAfterComma2()>
	//   66  120:ireturn         
				}
			if(i < 32)
	//*  67  121:iload_1         
	//*  68  122:bipush          32
	//*  69  124:icmpge          51
				if(i == 10)
	//*  70  127:iload_1         
	//*  71  128:bipush          10
	//*  72  130:icmpne          154
				{
					_currInputRow = _currInputRow + 1;
	//   73  133:aload_0         
	//   74  134:aload_0         
	//   75  135:getfield        #316 <Field int _currInputRow>
	//   76  138:iconst_1        
	//   77  139:iadd            
	//   78  140:putfield        #316 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   79  143:aload_0         
	//   80  144:aload_0         
	//   81  145:getfield        #52  <Field int _inputPtr>
	//   82  148:putfield        #319 <Field int _currInputRowStart>
				} else
	//*  83  151:goto            51
				if(i == 13)
	//*  84  154:iload_1         
	//*  85  155:bipush          13
	//*  86  157:icmpne          167
					_skipCR();
	//   87  160:aload_0         
	//   88  161:invokevirtual   #322 <Method void _skipCR()>
				else
	//*  89  164:goto            51
				if(i != 9)
	//*  90  167:iload_1         
	//*  91  168:bipush          9
	//*  92  170:icmpeq          51
					_throwInvalidSpace(i);
	//   93  173:aload_0         
	//   94  174:iload_1         
	//   95  175:invokevirtual   #325 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   96  178:goto            51
		return _skipAfterComma2();
	//   97  181:aload_0         
	//   98  182:invokespecial   #347 <Method int _skipAfterComma2()>
	//   99  185:ireturn         
	}

	private void _skipComment()
		throws IOException
	{
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #350 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_COMMENTS>
	//*   2    4:invokevirtual   #215 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   3    7:ifne            19
			_reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
	//    4   10:aload_0         
	//    5   11:bipush          47
	//    6   13:ldc2            #352 <String "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)">
	//    7   16:invokevirtual   #340 <Method void _reportUnexpectedChar(int, String)>
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   8   19:aload_0         
	//*   9   20:getfield        #52  <Field int _inputPtr>
	//*  10   23:aload_0         
	//*  11   24:getfield        #55  <Field int _inputEnd>
	//*  12   27:icmplt          45
	//*  13   30:aload_0         
	//*  14   31:invokevirtual   #94  <Method boolean _loadMore()>
	//*  15   34:ifne            45
			_reportInvalidEOF(" in a comment", ((JsonToken) (null)));
	//   16   37:aload_0         
	//   17   38:ldc2            #328 <String " in a comment">
	//   18   41:aconst_null     
	//   19   42:invokevirtual   #247 <Method void _reportInvalidEOF(String, JsonToken)>
		char ac[] = _inputBuffer;
	//   20   45:aload_0         
	//   21   46:getfield        #49  <Field char[] _inputBuffer>
	//   22   49:astore_2        
		int i = _inputPtr;
	//   23   50:aload_0         
	//   24   51:getfield        #52  <Field int _inputPtr>
	//   25   54:istore_1        
		_inputPtr = i + 1;
	//   26   55:aload_0         
	//   27   56:iload_1         
	//   28   57:iconst_1        
	//   29   58:iadd            
	//   30   59:putfield        #52  <Field int _inputPtr>
		i = ((int) (ac[i]));
	//   31   62:aload_2         
	//   32   63:iload_1         
	//   33   64:caload          
	//   34   65:istore_1        
		if(i == '/')
	//*  35   66:iload_1         
	//*  36   67:bipush          47
	//*  37   69:icmpne          77
		{
			_skipLine();
	//   38   72:aload_0         
	//   39   73:invokespecial   #355 <Method void _skipLine()>
			return;
	//   40   76:return          
		}
		if(i == '*')
	//*  41   77:iload_1         
	//*  42   78:bipush          42
	//*  43   80:icmpne          88
		{
			_skipCComment();
	//   44   83:aload_0         
	//   45   84:invokespecial   #357 <Method void _skipCComment()>
			return;
	//   46   87:return          
		} else
		{
			_reportUnexpectedChar(i, "was expecting either '*' or '/' for a comment");
	//   47   88:aload_0         
	//   48   89:iload_1         
	//   49   90:ldc2            #359 <String "was expecting either '*' or '/' for a comment">
	//   50   93:invokevirtual   #340 <Method void _reportUnexpectedChar(int, String)>
			return;
	//   51   96:return          
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
				if(_inputPtr < _inputEnd || _loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #55  <Field int _inputEnd>
	//*   4    8:icmplt          18
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #94  <Method boolean _loadMore()>
	//*   7   15:ifeq            80
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
					if(i == '\n')
	//*  26   45:iload_1         
	//*  27   46:bipush          10
	//*  28   48:icmpne          70
					{
						_currInputRow = _currInputRow + 1;
	//   29   51:aload_0         
	//   30   52:aload_0         
	//   31   53:getfield        #316 <Field int _currInputRow>
	//   32   56:iconst_1        
	//   33   57:iadd            
	//   34   58:putfield        #316 <Field int _currInputRow>
						_currInputRowStart = _inputPtr;
	//   35   61:aload_0         
	//   36   62:aload_0         
	//   37   63:getfield        #52  <Field int _inputPtr>
	//   38   66:putfield        #319 <Field int _currInputRowStart>
						return;
	//   39   69:return          
					}
					if(i != '\r')
						break label0;
	//   40   70:iload_1         
	//   41   71:bipush          13
	//   42   73:icmpne          81
					_skipCR();
	//   43   76:aload_0         
	//   44   77:invokevirtual   #322 <Method void _skipCR()>
				}
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
	//   51   89:invokevirtual   #325 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   52   92:goto            0
	}

	private final int _skipWSOrEnd()
		throws IOException
	{
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #55  <Field int _inputEnd>
	//*   4    8:icmplt          23
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #94  <Method boolean _loadMore()>
	//*   7   15:ifne            23
			return _eofAsNextChar();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #363 <Method int _eofAsNextChar()>
	//   10   22:ireturn         
		char ac[] = _inputBuffer;
	//   11   23:aload_0         
	//   12   24:getfield        #49  <Field char[] _inputBuffer>
	//   13   27:astore_2        
		int i = _inputPtr;
	//   14   28:aload_0         
	//   15   29:getfield        #52  <Field int _inputPtr>
	//   16   32:istore_1        
		_inputPtr = i + 1;
	//   17   33:aload_0         
	//   18   34:iload_1         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:putfield        #52  <Field int _inputPtr>
		i = ((int) (ac[i]));
	//   22   40:aload_2         
	//   23   41:iload_1         
	//   24   42:caload          
	//   25   43:istore_1        
		if(i > ' ')
	//*  26   44:iload_1         
	//*  27   45:bipush          32
	//*  28   47:icmple          82
			if(i != '/' && i != '#')
	//*  29   50:iload_1         
	//*  30   51:bipush          47
	//*  31   53:icmpeq          67
	//*  32   56:iload_1         
	//*  33   57:bipush          35
	//*  34   59:icmpne          65
	//*  35   62:goto            67
			{
				return i;
	//   36   65:iload_1         
	//   37   66:ireturn         
			} else
			{
				_inputPtr = _inputPtr - 1;
	//   38   67:aload_0         
	//   39   68:aload_0         
	//   40   69:getfield        #52  <Field int _inputPtr>
	//   41   72:iconst_1        
	//   42   73:isub            
	//   43   74:putfield        #52  <Field int _inputPtr>
				return _skipWSOrEnd2();
	//   44   77:aload_0         
	//   45   78:invokespecial   #366 <Method int _skipWSOrEnd2()>
	//   46   81:ireturn         
			}
		if(i != ' ')
	//*  47   82:iload_1         
	//*  48   83:bipush          32
	//*  49   85:icmpeq          139
			if(i == '\n')
	//*  50   88:iload_1         
	//*  51   89:bipush          10
	//*  52   91:icmpne          115
			{
				_currInputRow = _currInputRow + 1;
	//   53   94:aload_0         
	//   54   95:aload_0         
	//   55   96:getfield        #316 <Field int _currInputRow>
	//   56   99:iconst_1        
	//   57  100:iadd            
	//   58  101:putfield        #316 <Field int _currInputRow>
				_currInputRowStart = _inputPtr;
	//   59  104:aload_0         
	//   60  105:aload_0         
	//   61  106:getfield        #52  <Field int _inputPtr>
	//   62  109:putfield        #319 <Field int _currInputRowStart>
			} else
	//*  63  112:goto            139
			if(i == '\r')
	//*  64  115:iload_1         
	//*  65  116:bipush          13
	//*  66  118:icmpne          128
				_skipCR();
	//   67  121:aload_0         
	//   68  122:invokevirtual   #322 <Method void _skipCR()>
			else
	//*  69  125:goto            139
			if(i != '\t')
	//*  70  128:iload_1         
	//*  71  129:bipush          9
	//*  72  131:icmpeq          139
				_throwInvalidSpace(i);
	//   73  134:aload_0         
	//   74  135:iload_1         
	//   75  136:invokevirtual   #325 <Method void _throwInvalidSpace(int)>
		do
		{
			if(_inputPtr >= _inputEnd)
				break;
	//   76  139:aload_0         
	//   77  140:getfield        #52  <Field int _inputPtr>
	//   78  143:aload_0         
	//   79  144:getfield        #55  <Field int _inputEnd>
	//   80  147:icmpge          269
			char ac1[] = _inputBuffer;
	//   81  150:aload_0         
	//   82  151:getfield        #49  <Field char[] _inputBuffer>
	//   83  154:astore_2        
			int j = _inputPtr;
	//   84  155:aload_0         
	//   85  156:getfield        #52  <Field int _inputPtr>
	//   86  159:istore_1        
			_inputPtr = j + 1;
	//   87  160:aload_0         
	//   88  161:iload_1         
	//   89  162:iconst_1        
	//   90  163:iadd            
	//   91  164:putfield        #52  <Field int _inputPtr>
			j = ((int) (ac1[j]));
	//   92  167:aload_2         
	//   93  168:iload_1         
	//   94  169:caload          
	//   95  170:istore_1        
			if(j > ' ')
	//*  96  171:iload_1         
	//*  97  172:bipush          32
	//*  98  174:icmple          209
				if(j != '/' && j != '#')
	//*  99  177:iload_1         
	//* 100  178:bipush          47
	//* 101  180:icmpeq          194
	//* 102  183:iload_1         
	//* 103  184:bipush          35
	//* 104  186:icmpne          192
	//* 105  189:goto            194
				{
					return j;
	//  106  192:iload_1         
	//  107  193:ireturn         
				} else
				{
					_inputPtr = _inputPtr - 1;
	//  108  194:aload_0         
	//  109  195:aload_0         
	//  110  196:getfield        #52  <Field int _inputPtr>
	//  111  199:iconst_1        
	//  112  200:isub            
	//  113  201:putfield        #52  <Field int _inputPtr>
					return _skipWSOrEnd2();
	//  114  204:aload_0         
	//  115  205:invokespecial   #366 <Method int _skipWSOrEnd2()>
	//  116  208:ireturn         
				}
			if(j != ' ')
	//* 117  209:iload_1         
	//* 118  210:bipush          32
	//* 119  212:icmpeq          139
				if(j == '\n')
	//* 120  215:iload_1         
	//* 121  216:bipush          10
	//* 122  218:icmpne          242
				{
					_currInputRow = _currInputRow + 1;
	//  123  221:aload_0         
	//  124  222:aload_0         
	//  125  223:getfield        #316 <Field int _currInputRow>
	//  126  226:iconst_1        
	//  127  227:iadd            
	//  128  228:putfield        #316 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//  129  231:aload_0         
	//  130  232:aload_0         
	//  131  233:getfield        #52  <Field int _inputPtr>
	//  132  236:putfield        #319 <Field int _currInputRowStart>
				} else
	//* 133  239:goto            139
				if(j == '\r')
	//* 134  242:iload_1         
	//* 135  243:bipush          13
	//* 136  245:icmpne          255
					_skipCR();
	//  137  248:aload_0         
	//  138  249:invokevirtual   #322 <Method void _skipCR()>
				else
	//* 139  252:goto            139
				if(j != '\t')
	//* 140  255:iload_1         
	//* 141  256:bipush          9
	//* 142  258:icmpeq          139
					_throwInvalidSpace(j);
	//  143  261:aload_0         
	//  144  262:iload_1         
	//  145  263:invokevirtual   #325 <Method void _throwInvalidSpace(int)>
		} while(true);
	//  146  266:goto            139
		return _skipWSOrEnd2();
	//  147  269:aload_0         
	//  148  270:invokespecial   #366 <Method int _skipWSOrEnd2()>
	//  149  273:ireturn         
	}

	private int _skipWSOrEnd2()
		throws IOException
	{
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #55  <Field int _inputEnd>
	//*   4    8:icmplt          23
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #94  <Method boolean _loadMore()>
	//*   7   15:ifne            23
				return _eofAsNextChar();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #363 <Method int _eofAsNextChar()>
	//   10   22:ireturn         
			char ac[] = _inputBuffer;
	//   11   23:aload_0         
	//   12   24:getfield        #49  <Field char[] _inputBuffer>
	//   13   27:astore_2        
			int i = _inputPtr;
	//   14   28:aload_0         
	//   15   29:getfield        #52  <Field int _inputPtr>
	//   16   32:istore_1        
			_inputPtr = i + 1;
	//   17   33:aload_0         
	//   18   34:iload_1         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:putfield        #52  <Field int _inputPtr>
			i = ((int) (ac[i]));
	//   22   40:aload_2         
	//   23   41:iload_1         
	//   24   42:caload          
	//   25   43:istore_1        
			if(i > ' ')
	//*  26   44:iload_1         
	//*  27   45:bipush          32
	//*  28   47:icmple          81
			{
				if(i == '/')
	//*  29   50:iload_1         
	//*  30   51:bipush          47
	//*  31   53:icmpne          63
					_skipComment();
	//   32   56:aload_0         
	//   33   57:invokespecial   #310 <Method void _skipComment()>
				else
	//*  34   60:goto            0
				if(i != '#' || !_skipYAMLComment())
	//*  35   63:iload_1         
	//*  36   64:bipush          35
	//*  37   66:icmpne          79
	//*  38   69:aload_0         
	//*  39   70:invokespecial   #313 <Method boolean _skipYAMLComment()>
	//*  40   73:ifeq            79
	//*  41   76:goto            0
					return i;
	//   42   79:iload_1         
	//   43   80:ireturn         
			} else
			if(i != ' ')
	//*  44   81:iload_1         
	//*  45   82:bipush          32
	//*  46   84:icmpeq          0
				if(i == '\n')
	//*  47   87:iload_1         
	//*  48   88:bipush          10
	//*  49   90:icmpne          114
				{
					_currInputRow = _currInputRow + 1;
	//   50   93:aload_0         
	//   51   94:aload_0         
	//   52   95:getfield        #316 <Field int _currInputRow>
	//   53   98:iconst_1        
	//   54   99:iadd            
	//   55  100:putfield        #316 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   56  103:aload_0         
	//   57  104:aload_0         
	//   58  105:getfield        #52  <Field int _inputPtr>
	//   59  108:putfield        #319 <Field int _currInputRowStart>
				} else
	//*  60  111:goto            0
				if(i == '\r')
	//*  61  114:iload_1         
	//*  62  115:bipush          13
	//*  63  117:icmpne          127
					_skipCR();
	//   64  120:aload_0         
	//   65  121:invokevirtual   #322 <Method void _skipCR()>
				else
	//*  66  124:goto            0
				if(i != '\t')
	//*  67  127:iload_1         
	//*  68  128:bipush          9
	//*  69  130:icmpeq          0
					_throwInvalidSpace(i);
	//   70  133:aload_0         
	//   71  134:iload_1         
	//   72  135:invokevirtual   #325 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   73  138:goto            0
	}

	private boolean _skipYAMLComment()
		throws IOException
	{
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #369 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_YAML_COMMENTS>
	//*   2    4:invokevirtual   #215 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   3    7:ifne            12
		{
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		} else
		{
			_skipLine();
	//    6   12:aload_0         
	//    7   13:invokespecial   #355 <Method void _skipLine()>
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
	//    5    7:getfield        #372 <Field long _currInputProcessed>
	//    6   10:iload_1         
	//    7   11:i2l             
	//    8   12:ladd            
	//    9   13:putfield        #375 <Field long _tokenInputTotal>
		_tokenInputRow = _currInputRow;
	//   10   16:aload_0         
	//   11   17:aload_0         
	//   12   18:getfield        #316 <Field int _currInputRow>
	//   13   21:putfield        #192 <Field int _tokenInputRow>
		_tokenInputCol = i - _currInputRowStart;
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:aload_0         
	//   17   27:getfield        #319 <Field int _currInputRowStart>
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
	//    6    8:putfield        #378 <Field long _nameStartOffset>
		_nameStartRow = _currInputRow;
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:getfield        #316 <Field int _currInputRow>
	//   10   16:putfield        #380 <Field int _nameStartRow>
		_nameStartCol = i - _currInputRowStart;
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:aload_0         
	//   14   22:getfield        #319 <Field int _currInputRowStart>
	//   15   25:isub            
	//   16   26:putfield        #382 <Field int _nameStartCol>
	//   17   29:return          
	}

	private char _verifyNLZ2()
		throws IOException
	{
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #55  <Field int _inputEnd>
	//*   4    8:icmplt          21
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #94  <Method boolean _loadMore()>
	//*   7   15:ifne            21
			return '0';
	//    8   18:bipush          48
	//    9   20:ireturn         
		char c = _inputBuffer[_inputPtr];
	//   10   21:aload_0         
	//   11   22:getfield        #49  <Field char[] _inputBuffer>
	//   12   25:aload_0         
	//   13   26:getfield        #52  <Field int _inputPtr>
	//   14   29:caload          
	//   15   30:istore_1        
		if(c >= '0')
	//*  16   31:iload_1         
	//*  17   32:bipush          48
	//*  18   34:icmplt          151
		{
			if(c > '9')
	//*  19   37:iload_1         
	//*  20   38:bipush          57
	//*  21   40:icmple          46
				return '0';
	//   22   43:bipush          48
	//   23   45:ireturn         
			if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS))
	//*  24   46:aload_0         
	//*  25   47:getstatic       #386 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NUMERIC_LEADING_ZEROS>
	//*  26   50:invokevirtual   #215 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  27   53:ifne            63
				reportInvalidNumber("Leading zeroes not allowed");
	//   28   56:aload_0         
	//   29   57:ldc2            #388 <String "Leading zeroes not allowed">
	//   30   60:invokevirtual   #392 <Method void reportInvalidNumber(String)>
			_inputPtr = _inputPtr + 1;
	//   31   63:aload_0         
	//   32   64:aload_0         
	//   33   65:getfield        #52  <Field int _inputPtr>
	//   34   68:iconst_1        
	//   35   69:iadd            
	//   36   70:putfield        #52  <Field int _inputPtr>
			char c1 = c;
	//   37   73:iload_1         
	//   38   74:istore_2        
			if(c == '0')
				do
	//*  39   75:iload_1         
	//*  40   76:bipush          48
	//*  41   78:icmpne          149
				{
					if(_inputPtr >= _inputEnd)
	//*  42   81:aload_0         
	//*  43   82:getfield        #52  <Field int _inputPtr>
	//*  44   85:aload_0         
	//*  45   86:getfield        #55  <Field int _inputEnd>
	//*  46   89:icmplt          101
					{
						c1 = c;
	//   47   92:iload_1         
	//   48   93:istore_2        
						if(!_loadMore())
							break;
	//   49   94:aload_0         
	//   50   95:invokevirtual   #94  <Method boolean _loadMore()>
	//   51   98:ifeq            149
					}
					c1 = _inputBuffer[_inputPtr];
	//   52  101:aload_0         
	//   53  102:getfield        #49  <Field char[] _inputBuffer>
	//   54  105:aload_0         
	//   55  106:getfield        #52  <Field int _inputPtr>
	//   56  109:caload          
	//   57  110:istore_2        
					if(c1 >= '0')
	//*  58  111:iload_2         
	//*  59  112:bipush          48
	//*  60  114:icmplt          146
					{
						if(c1 > '9')
	//*  61  117:iload_2         
	//*  62  118:bipush          57
	//*  63  120:icmple          126
							return '0';
	//   64  123:bipush          48
	//   65  125:ireturn         
						_inputPtr = _inputPtr + 1;
	//   66  126:aload_0         
	//   67  127:aload_0         
	//   68  128:getfield        #52  <Field int _inputPtr>
	//   69  131:iconst_1        
	//   70  132:iadd            
	//   71  133:putfield        #52  <Field int _inputPtr>
						c = c1;
	//   72  136:iload_2         
	//   73  137:istore_1        
						if(c1 != '0')
	//*  74  138:iload_2         
	//*  75  139:bipush          48
	//*  76  141:icmpeq          81
							return c1;
	//   77  144:iload_2         
	//   78  145:ireturn         
					} else
					{
						return '0';
	//   79  146:bipush          48
	//   80  148:ireturn         
					}
				} while(true);
			return c1;
	//   81  149:iload_2         
	//   82  150:ireturn         
		} else
		{
			return '0';
	//   83  151:bipush          48
	//   84  153:ireturn         
		}
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
	//   20   37:invokespecial   #394 <Method char _verifyNLZ2()>
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
	//   16   46:invokevirtual   #397 <Method void _reportMissingRootWS(int)>
					return;
	//   17   49:return          

				case 10: // '\n'
					_currInputRow = _currInputRow + 1;
	//   18   50:aload_0         
	//   19   51:aload_0         
	//   20   52:getfield        #316 <Field int _currInputRow>
	//   21   55:iconst_1        
	//   22   56:iadd            
	//   23   57:putfield        #316 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   24   60:aload_0         
	//   25   61:aload_0         
	//   26   62:getfield        #52  <Field int _inputPtr>
	//   27   65:putfield        #319 <Field int _currInputRowStart>
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
	//*   4    8:getfield        #402 <Field IOContext _ioContext>
	//*   5   11:invokevirtual   #405 <Method boolean IOContext.isResourceManaged()>
	//*   6   14:ifne            27
	//*   7   17:aload_0         
	//*   8   18:getstatic       #408 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.AUTO_CLOSE_SOURCE>
	//*   9   21:invokevirtual   #215 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  10   24:ifeq            34
				_reader.close();
	//   11   27:aload_0         
	//   12   28:getfield        #41  <Field Reader _reader>
	//   13   31:invokevirtual   #413 <Method void Reader.close()>
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
		Object obj = ((Object) (_getByteArrayBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #419 <Method ByteArrayBuilder _getByteArrayBuilder()>
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
					_loadMoreGuaranteed();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #422 <Method void _loadMoreGuaranteed()>
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
	//   30   52:invokevirtual   #428 <Method int Base64Variant.decodeBase64Char(char)>
	//   31   55:istore          4
			int j = l;
	//   32   57:iload           4
	//   33   59:istore_3        
			if(l < 0)
	//*  34   60:iload           4
	//*  35   62:ifge            97
			{
				if(c == '"')
	//*  36   65:iload_2         
	//*  37   66:bipush          34
	//*  38   68:icmpne          77
					return ((ByteArrayBuilder) (obj)).toByteArray();
	//   39   71:aload           7
	//   40   73:invokevirtual   #434 <Method byte[] ByteArrayBuilder.toByteArray()>
	//   41   76:areturn         
				l = _decodeBase64Escape(base64variant, c, 0);
	//   42   77:aload_0         
	//   43   78:aload_1         
	//   44   79:iload_2         
	//   45   80:iconst_0        
	//   46   81:invokevirtual   #438 <Method int _decodeBase64Escape(Base64Variant, char, int)>
	//   47   84:istore          4
				j = l;
	//   48   86:iload           4
	//   49   88:istore_3        
				if(l < 0)
	//*  50   89:iload           4
	//*  51   91:ifge            97
					continue;
	//   52   94:goto            6
			}
			if(_inputPtr >= _inputEnd)
	//*  53   97:aload_0         
	//*  54   98:getfield        #52  <Field int _inputPtr>
	//*  55  101:aload_0         
	//*  56  102:getfield        #55  <Field int _inputEnd>
	//*  57  105:icmplt          112
				_loadMoreGuaranteed();
	//   58  108:aload_0         
	//   59  109:invokevirtual   #422 <Method void _loadMoreGuaranteed()>
			char ac1[] = _inputBuffer;
	//   60  112:aload_0         
	//   61  113:getfield        #49  <Field char[] _inputBuffer>
	//   62  116:astore          8
			l = _inputPtr;
	//   63  118:aload_0         
	//   64  119:getfield        #52  <Field int _inputPtr>
	//   65  122:istore          4
			_inputPtr = l + 1;
	//   66  124:aload_0         
	//   67  125:iload           4
	//   68  127:iconst_1        
	//   69  128:iadd            
	//   70  129:putfield        #52  <Field int _inputPtr>
			c = ac1[l];
	//   71  132:aload           8
	//   72  134:iload           4
	//   73  136:caload          
	//   74  137:istore_2        
			int i1 = base64variant.decodeBase64Char(c);
	//   75  138:aload_1         
	//   76  139:iload_2         
	//   77  140:invokevirtual   #428 <Method int Base64Variant.decodeBase64Char(char)>
	//   78  143:istore          5
			l = i1;
	//   79  145:iload           5
	//   80  147:istore          4
			if(i1 < 0)
	//*  81  149:iload           5
	//*  82  151:ifge            163
				l = _decodeBase64Escape(base64variant, c, 1);
	//   83  154:aload_0         
	//   84  155:aload_1         
	//   85  156:iload_2         
	//   86  157:iconst_1        
	//   87  158:invokevirtual   #438 <Method int _decodeBase64Escape(Base64Variant, char, int)>
	//   88  161:istore          4
			int j1 = j << 6 | l;
	//   89  163:iload_3         
	//   90  164:bipush          6
	//   91  166:ishl            
	//   92  167:iload           4
	//   93  169:ior             
	//   94  170:istore          6
			if(_inputPtr >= _inputEnd)
	//*  95  172:aload_0         
	//*  96  173:getfield        #52  <Field int _inputPtr>
	//*  97  176:aload_0         
	//*  98  177:getfield        #55  <Field int _inputEnd>
	//*  99  180:icmplt          187
				_loadMoreGuaranteed();
	//  100  183:aload_0         
	//  101  184:invokevirtual   #422 <Method void _loadMoreGuaranteed()>
			ac1 = _inputBuffer;
	//  102  187:aload_0         
	//  103  188:getfield        #49  <Field char[] _inputBuffer>
	//  104  191:astore          8
			j = _inputPtr;
	//  105  193:aload_0         
	//  106  194:getfield        #52  <Field int _inputPtr>
	//  107  197:istore_3        
			_inputPtr = j + 1;
	//  108  198:aload_0         
	//  109  199:iload_3         
	//  110  200:iconst_1        
	//  111  201:iadd            
	//  112  202:putfield        #52  <Field int _inputPtr>
			c = ac1[j];
	//  113  205:aload           8
	//  114  207:iload_3         
	//  115  208:caload          
	//  116  209:istore_2        
			l = base64variant.decodeBase64Char(c);
	//  117  210:aload_1         
	//  118  211:iload_2         
	//  119  212:invokevirtual   #428 <Method int Base64Variant.decodeBase64Char(char)>
	//  120  215:istore          4
			i1 = l;
	//  121  217:iload           4
	//  122  219:istore          5
			if(l < 0)
	//* 123  221:iload           4
	//* 124  223:ifge            389
			{
				j = l;
	//  125  226:iload           4
	//  126  228:istore_3        
				if(l != -2)
	//* 127  229:iload           4
	//* 128  231:bipush          -2
	//* 129  233:icmpeq          272
				{
					if(c == '"' && !base64variant.usesPadding())
	//* 130  236:iload_2         
	//* 131  237:bipush          34
	//* 132  239:icmpne          264
	//* 133  242:aload_1         
	//* 134  243:invokevirtual   #441 <Method boolean Base64Variant.usesPadding()>
	//* 135  246:ifne            264
					{
						((ByteArrayBuilder) (obj)).append(j1 >> 4);
	//  136  249:aload           7
	//  137  251:iload           6
	//  138  253:iconst_4        
	//  139  254:ishr            
	//  140  255:invokevirtual   #443 <Method void ByteArrayBuilder.append(int)>
						return ((ByteArrayBuilder) (obj)).toByteArray();
	//  141  258:aload           7
	//  142  260:invokevirtual   #434 <Method byte[] ByteArrayBuilder.toByteArray()>
	//  143  263:areturn         
					}
					j = _decodeBase64Escape(base64variant, c, 2);
	//  144  264:aload_0         
	//  145  265:aload_1         
	//  146  266:iload_2         
	//  147  267:iconst_2        
	//  148  268:invokevirtual   #438 <Method int _decodeBase64Escape(Base64Variant, char, int)>
	//  149  271:istore_3        
				}
				i1 = j;
	//  150  272:iload_3         
	//  151  273:istore          5
				if(j == -2)
	//* 152  275:iload_3         
	//* 153  276:bipush          -2
	//* 154  278:icmpne          389
				{
					if(_inputPtr >= _inputEnd)
	//* 155  281:aload_0         
	//* 156  282:getfield        #52  <Field int _inputPtr>
	//* 157  285:aload_0         
	//* 158  286:getfield        #55  <Field int _inputEnd>
	//* 159  289:icmplt          296
						_loadMoreGuaranteed();
	//  160  292:aload_0         
	//  161  293:invokevirtual   #422 <Method void _loadMoreGuaranteed()>
					ac1 = _inputBuffer;
	//  162  296:aload_0         
	//  163  297:getfield        #49  <Field char[] _inputBuffer>
	//  164  300:astore          8
					j = _inputPtr;
	//  165  302:aload_0         
	//  166  303:getfield        #52  <Field int _inputPtr>
	//  167  306:istore_3        
					_inputPtr = j + 1;
	//  168  307:aload_0         
	//  169  308:iload_3         
	//  170  309:iconst_1        
	//  171  310:iadd            
	//  172  311:putfield        #52  <Field int _inputPtr>
					c = ac1[j];
	//  173  314:aload           8
	//  174  316:iload_3         
	//  175  317:caload          
	//  176  318:istore_2        
					if(!base64variant.usesPaddingChar(c))
	//* 177  319:aload_1         
	//* 178  320:iload_2         
	//* 179  321:invokevirtual   #446 <Method boolean Base64Variant.usesPaddingChar(char)>
	//* 180  324:ifne            377
					{
						obj = ((Object) (new StringBuilder()));
	//  181  327:new             #286 <Class StringBuilder>
	//  182  330:dup             
	//  183  331:invokespecial   #288 <Method void StringBuilder()>
	//  184  334:astore          7
						((StringBuilder) (obj)).append("expected padding character '");
	//  185  336:aload           7
	//  186  338:ldc2            #448 <String "expected padding character '">
	//  187  341:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//  188  344:pop             
						((StringBuilder) (obj)).append(base64variant.getPaddingChar());
	//  189  345:aload           7
	//  190  347:aload_1         
	//  191  348:invokevirtual   #451 <Method char Base64Variant.getPaddingChar()>
	//  192  351:invokevirtual   #454 <Method StringBuilder StringBuilder.append(char)>
	//  193  354:pop             
						((StringBuilder) (obj)).append("'");
	//  194  355:aload           7
	//  195  357:ldc2            #456 <String "'">
	//  196  360:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//  197  363:pop             
						throw reportInvalidBase64Char(base64variant, ((int) (c)), 3, ((StringBuilder) (obj)).toString());
	//  198  364:aload_0         
	//  199  365:aload_1         
	//  200  366:iload_2         
	//  201  367:iconst_3        
	//  202  368:aload           7
	//  203  370:invokevirtual   #303 <Method String StringBuilder.toString()>
	//  204  373:invokevirtual   #460 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int, String)>
	//  205  376:athrow          
					}
					((ByteArrayBuilder) (obj)).append(j1 >> 4);
	//  206  377:aload           7
	//  207  379:iload           6
	//  208  381:iconst_4        
	//  209  382:ishr            
	//  210  383:invokevirtual   #443 <Method void ByteArrayBuilder.append(int)>
					continue;
	//  211  386:goto            6
				}
			}
			j1 = j1 << 6 | i1;
	//  212  389:iload           6
	//  213  391:bipush          6
	//  214  393:ishl            
	//  215  394:iload           5
	//  216  396:ior             
	//  217  397:istore          6
			if(_inputPtr >= _inputEnd)
	//* 218  399:aload_0         
	//* 219  400:getfield        #52  <Field int _inputPtr>
	//* 220  403:aload_0         
	//* 221  404:getfield        #55  <Field int _inputEnd>
	//* 222  407:icmplt          414
				_loadMoreGuaranteed();
	//  223  410:aload_0         
	//  224  411:invokevirtual   #422 <Method void _loadMoreGuaranteed()>
			ac1 = _inputBuffer;
	//  225  414:aload_0         
	//  226  415:getfield        #49  <Field char[] _inputBuffer>
	//  227  418:astore          8
			j = _inputPtr;
	//  228  420:aload_0         
	//  229  421:getfield        #52  <Field int _inputPtr>
	//  230  424:istore_3        
			_inputPtr = j + 1;
	//  231  425:aload_0         
	//  232  426:iload_3         
	//  233  427:iconst_1        
	//  234  428:iadd            
	//  235  429:putfield        #52  <Field int _inputPtr>
			c = ac1[j];
	//  236  432:aload           8
	//  237  434:iload_3         
	//  238  435:caload          
	//  239  436:istore_2        
			l = base64variant.decodeBase64Char(c);
	//  240  437:aload_1         
	//  241  438:iload_2         
	//  242  439:invokevirtual   #428 <Method int Base64Variant.decodeBase64Char(char)>
	//  243  442:istore          4
			i1 = l;
	//  244  444:iload           4
	//  245  446:istore          5
			if(l < 0)
	//* 246  448:iload           4
	//* 247  450:ifge            520
			{
				int k = l;
	//  248  453:iload           4
	//  249  455:istore_3        
				if(l != -2)
	//* 250  456:iload           4
	//* 251  458:bipush          -2
	//* 252  460:icmpeq          499
				{
					if(c == '"' && !base64variant.usesPadding())
	//* 253  463:iload_2         
	//* 254  464:bipush          34
	//* 255  466:icmpne          491
	//* 256  469:aload_1         
	//* 257  470:invokevirtual   #441 <Method boolean Base64Variant.usesPadding()>
	//* 258  473:ifne            491
					{
						((ByteArrayBuilder) (obj)).appendTwoBytes(j1 >> 2);
	//  259  476:aload           7
	//  260  478:iload           6
	//  261  480:iconst_2        
	//  262  481:ishr            
	//  263  482:invokevirtual   #463 <Method void ByteArrayBuilder.appendTwoBytes(int)>
						return ((ByteArrayBuilder) (obj)).toByteArray();
	//  264  485:aload           7
	//  265  487:invokevirtual   #434 <Method byte[] ByteArrayBuilder.toByteArray()>
	//  266  490:areturn         
					}
					k = _decodeBase64Escape(base64variant, c, 3);
	//  267  491:aload_0         
	//  268  492:aload_1         
	//  269  493:iload_2         
	//  270  494:iconst_3        
	//  271  495:invokevirtual   #438 <Method int _decodeBase64Escape(Base64Variant, char, int)>
	//  272  498:istore_3        
				}
				i1 = k;
	//  273  499:iload_3         
	//  274  500:istore          5
				if(k == -2)
	//* 275  502:iload_3         
	//* 276  503:bipush          -2
	//* 277  505:icmpne          520
				{
					((ByteArrayBuilder) (obj)).appendTwoBytes(j1 >> 2);
	//  278  508:aload           7
	//  279  510:iload           6
	//  280  512:iconst_2        
	//  281  513:ishr            
	//  282  514:invokevirtual   #463 <Method void ByteArrayBuilder.appendTwoBytes(int)>
					continue;
	//  283  517:goto            6
				}
			}
			((ByteArrayBuilder) (obj)).appendThreeBytes(j1 << 6 | i1);
	//  284  520:aload           7
	//  285  522:iload           6
	//  286  524:bipush          6
	//  287  526:ishl            
	//  288  527:iload           5
	//  289  529:ior             
	//  290  530:invokevirtual   #466 <Method void ByteArrayBuilder.appendThreeBytes(int)>
		} while(true);
	//  291  533:goto            6
	}

	protected char _decodeEscaped()
		throws IOException
	{
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #55  <Field int _inputEnd>
	//*   4    8:icmplt          28
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #94  <Method boolean _loadMore()>
	//*   7   15:ifne            28
			_reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
	//    8   18:aload_0         
	//    9   19:ldc2            #468 <String " in character escape sequence">
	//   10   22:getstatic       #178 <Field JsonToken JsonToken.VALUE_STRING>
	//   11   25:invokevirtual   #247 <Method void _reportInvalidEOF(String, JsonToken)>
		char ac[] = _inputBuffer;
	//   12   28:aload_0         
	//   13   29:getfield        #49  <Field char[] _inputBuffer>
	//   14   32:astore          6
		int i = _inputPtr;
	//   15   34:aload_0         
	//   16   35:getfield        #52  <Field int _inputPtr>
	//   17   38:istore_2        
		_inputPtr = i + 1;
	//   18   39:aload_0         
	//   19   40:iload_2         
	//   20   41:iconst_1        
	//   21   42:iadd            
	//   22   43:putfield        #52  <Field int _inputPtr>
		char c = ac[i];
	//   23   46:aload           6
	//   24   48:iload_2         
	//   25   49:caload          
	//   26   50:istore_1        
		if(c != '"' && c != '/' && c != '\\')
	//*  27   51:iload_1         
	//*  28   52:bipush          34
	//*  29   54:icmpeq          239
	//*  30   57:iload_1         
	//*  31   58:bipush          47
	//*  32   60:icmpeq          239
	//*  33   63:iload_1         
	//*  34   64:bipush          92
	//*  35   66:icmpeq          239
		{
			if(c != 'b')
	//*  36   69:iload_1         
	//*  37   70:bipush          98
	//*  38   72:icmpeq          236
			{
				if(c != 'f')
	//*  39   75:iload_1         
	//*  40   76:bipush          102
	//*  41   78:icmpeq          233
				{
					if(c != 'n')
	//*  42   81:iload_1         
	//*  43   82:bipush          110
	//*  44   84:icmpeq          230
					{
						if(c != 'r')
	//*  45   87:iload_1         
	//*  46   88:bipush          114
	//*  47   90:icmpeq          227
							switch(c)
	//*  48   93:iload_1         
							{
	//*  49   94:tableswitch     116 117: default 116
	//	               116 224
	//	               117 122
							default:
								return _handleUnrecognizedCharacterEscape(c);
	//   50  116:aload_0         
	//   51  117:iload_1         
	//   52  118:invokevirtual   #472 <Method char _handleUnrecognizedCharacterEscape(char)>
	//   53  121:ireturn         

							case 117: // 'u'
								int j = 0;
	//   54  122:iconst_0        
	//   55  123:istore_2        
								int k = 0;
	//   56  124:iconst_0        
	//   57  125:istore_3        
								for(; j < 4; j++)
	//*  58  126:iload_2         
	//*  59  127:iconst_4        
	//*  60  128:icmpge          221
								{
									if(_inputPtr >= _inputEnd && !_loadMore())
	//*  61  131:aload_0         
	//*  62  132:getfield        #52  <Field int _inputPtr>
	//*  63  135:aload_0         
	//*  64  136:getfield        #55  <Field int _inputEnd>
	//*  65  139:icmplt          159
	//*  66  142:aload_0         
	//*  67  143:invokevirtual   #94  <Method boolean _loadMore()>
	//*  68  146:ifne            159
										_reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
	//   69  149:aload_0         
	//   70  150:ldc2            #468 <String " in character escape sequence">
	//   71  153:getstatic       #178 <Field JsonToken JsonToken.VALUE_STRING>
	//   72  156:invokevirtual   #247 <Method void _reportInvalidEOF(String, JsonToken)>
									char ac1[] = _inputBuffer;
	//   73  159:aload_0         
	//   74  160:getfield        #49  <Field char[] _inputBuffer>
	//   75  163:astore          6
									int l = _inputPtr;
	//   76  165:aload_0         
	//   77  166:getfield        #52  <Field int _inputPtr>
	//   78  169:istore          4
									_inputPtr = l + 1;
	//   79  171:aload_0         
	//   80  172:iload           4
	//   81  174:iconst_1        
	//   82  175:iadd            
	//   83  176:putfield        #52  <Field int _inputPtr>
									l = ((int) (ac1[l]));
	//   84  179:aload           6
	//   85  181:iload           4
	//   86  183:caload          
	//   87  184:istore          4
									int i1 = CharTypes.charToHex(l);
	//   88  186:iload           4
	//   89  188:invokestatic    #475 <Method int CharTypes.charToHex(int)>
	//   90  191:istore          5
									if(i1 < 0)
	//*  91  193:iload           5
	//*  92  195:ifge            207
										_reportUnexpectedChar(l, "expected a hex-digit for character escape sequence");
	//   93  198:aload_0         
	//   94  199:iload           4
	//   95  201:ldc2            #477 <String "expected a hex-digit for character escape sequence">
	//   96  204:invokevirtual   #340 <Method void _reportUnexpectedChar(int, String)>
									k = k << 4 | i1;
	//   97  207:iload_3         
	//   98  208:iconst_4        
	//   99  209:ishl            
	//  100  210:iload           5
	//  101  212:ior             
	//  102  213:istore_3        
								}

	//  103  214:iload_2         
	//  104  215:iconst_1        
	//  105  216:iadd            
	//  106  217:istore_2        
	//* 107  218:goto            126
								return (char)k;
	//  108  221:iload_3         
	//  109  222:int2char        
	//  110  223:ireturn         

							case 116: // 't'
								return '\t';
	//  111  224:bipush          9
	//  112  226:ireturn         
							}
						else
							return '\r';
	//  113  227:bipush          13
	//  114  229:ireturn         
					} else
					{
						return '\n';
	//  115  230:bipush          10
	//  116  232:ireturn         
					}
				} else
				{
					return '\f';
	//  117  233:bipush          12
	//  118  235:ireturn         
				}
			} else
			{
				return '\b';
	//  119  236:bipush          8
	//  120  238:ireturn         
			}
		} else
		{
			return c;
	//  121  239:iload_1         
	//  122  240:ireturn         
		}
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
	//   69  117:invokevirtual   #481 <Method void TextBuffer.resetWithCopy(char[], int, int)>
		_inputPtr = j;
	//   70  120:aload_0         
	//   71  121:iload_2         
	//   72  122:putfield        #52  <Field int _inputPtr>
		_finishString2();
	//   73  125:aload_0         
	//   74  126:invokevirtual   #484 <Method void _finishString2()>
	//   75  129:return          
	}

	protected void _finishString2()
		throws IOException
	{
		char ac[] = _textBuffer.getCurrentSegment();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #87  <Method char[] TextBuffer.getCurrentSegment()>
	//    3    7:astore          6
		int i = _textBuffer.getCurrentSegmentSize();
	//    4    9:aload_0         
	//    5   10:getfield        #78  <Field TextBuffer _textBuffer>
	//    6   13:invokevirtual   #90  <Method int TextBuffer.getCurrentSegmentSize()>
	//    7   16:istore_3        
		int ai[] = _icLatin1;
	//    8   17:getstatic       #33  <Field int[] _icLatin1>
	//    9   20:astore          8
		int k = ai.length;
	//   10   22:aload           8
	//   11   24:arraylength     
	//   12   25:istore          5
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*  13   27:aload_0         
	//*  14   28:getfield        #52  <Field int _inputPtr>
	//*  15   31:aload_0         
	//*  16   32:getfield        #55  <Field int _inputEnd>
	//*  17   35:icmplt          55
	//*  18   38:aload_0         
	//*  19   39:invokevirtual   #94  <Method boolean _loadMore()>
	//*  20   42:ifne            55
				_reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
	//   21   45:aload_0         
	//   22   46:ldc2            #486 <String ": was expecting closing quote for a string value">
	//   23   49:getstatic       #178 <Field JsonToken JsonToken.VALUE_STRING>
	//   24   52:invokevirtual   #247 <Method void _reportInvalidEOF(String, JsonToken)>
			char ac1[] = _inputBuffer;
	//   25   55:aload_0         
	//   26   56:getfield        #49  <Field char[] _inputBuffer>
	//   27   59:astore          7
			int j = _inputPtr;
	//   28   61:aload_0         
	//   29   62:getfield        #52  <Field int _inputPtr>
	//   30   65:istore          4
			_inputPtr = j + 1;
	//   31   67:aload_0         
	//   32   68:iload           4
	//   33   70:iconst_1        
	//   34   71:iadd            
	//   35   72:putfield        #52  <Field int _inputPtr>
			char c1 = ac1[j];
	//   36   75:aload           7
	//   37   77:iload           4
	//   38   79:caload          
	//   39   80:istore_2        
			char c = c1;
	//   40   81:iload_2         
	//   41   82:istore_1        
			if(c1 < k)
	//*  42   83:iload_2         
	//*  43   84:iload           5
	//*  44   86:icmpge          145
			{
				c = c1;
	//   45   89:iload_2         
	//   46   90:istore_1        
				if(ai[c1] != 0)
	//*  47   91:aload           8
	//*  48   93:iload_2         
	//*  49   94:iaload          
	//*  50   95:ifeq            145
				{
					if(c1 == '"')
	//*  51   98:iload_2         
	//*  52   99:bipush          34
	//*  53  101:icmpne          113
					{
						_textBuffer.setCurrentLength(i);
	//   54  104:aload_0         
	//   55  105:getfield        #78  <Field TextBuffer _textBuffer>
	//   56  108:iload_3         
	//   57  109:invokevirtual   #104 <Method void TextBuffer.setCurrentLength(int)>
						return;
	//   58  112:return          
					}
					if(c1 == '\\')
	//*  59  113:iload_2         
	//*  60  114:bipush          92
	//*  61  116:icmpne          127
					{
						c = _decodeEscaped();
	//   62  119:aload_0         
	//   63  120:invokevirtual   #251 <Method char _decodeEscaped()>
	//   64  123:istore_1        
					} else
	//*  65  124:goto            145
					{
						c = c1;
	//   66  127:iload_2         
	//   67  128:istore_1        
						if(c1 < ' ')
	//*  68  129:iload_2         
	//*  69  130:bipush          32
	//*  70  132:icmpge          145
						{
							_throwUnquotedSpace(((int) (c1)), "string value");
	//   71  135:aload_0         
	//   72  136:iload_2         
	//   73  137:ldc2            #488 <String "string value">
	//   74  140:invokevirtual   #256 <Method void _throwUnquotedSpace(int, String)>
							c = c1;
	//   75  143:iload_2         
	//   76  144:istore_1        
						}
					}
				}
			}
			ac1 = ac;
	//   77  145:aload           6
	//   78  147:astore          7
			j = i;
	//   79  149:iload_3         
	//   80  150:istore          4
			if(i >= ac.length)
	//*  81  152:iload_3         
	//*  82  153:aload           6
	//*  83  155:arraylength     
	//*  84  156:icmplt          171
			{
				ac1 = _textBuffer.finishCurrentSegment();
	//   85  159:aload_0         
	//   86  160:getfield        #78  <Field TextBuffer _textBuffer>
	//   87  163:invokevirtual   #120 <Method char[] TextBuffer.finishCurrentSegment()>
	//   88  166:astore          7
				j = 0;
	//   89  168:iconst_0        
	//   90  169:istore          4
			}
			ac1[j] = c;
	//   91  171:aload           7
	//   92  173:iload           4
	//   93  175:iload_1         
	//   94  176:castore         
			i = j + 1;
	//   95  177:iload           4
	//   96  179:iconst_1        
	//   97  180:iadd            
	//   98  181:istore_3        
			ac = ac1;
	//   99  182:aload           7
	//  100  184:astore          6
		} while(true);
	//  101  186:goto            27
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
	//*   5    7:invokevirtual   #493 <Method int JsonToken.id()>
		{
	//*   6   10:tableswitch     5 8: default 40
	//	               5 53
	//	               6 45
	//	               7 45
	//	               8 45
		default:
			return jsontoken.asString();
	//    7   40:aload_1         
	//    8   41:invokevirtual   #496 <Method String JsonToken.asString()>
	//    9   44:areturn         

		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
			return _textBuffer.contentsAsString();
	//   10   45:aload_0         
	//   11   46:getfield        #78  <Field TextBuffer _textBuffer>
	//   12   49:invokevirtual   #499 <Method String TextBuffer.contentsAsString()>
	//   13   52:areturn         

		case 5: // '\005'
			return _parsingContext.getCurrentName();
	//   14   53:aload_0         
	//   15   54:getfield        #189 <Field JsonReadContext _parsingContext>
	//   16   57:invokevirtual   #502 <Method String JsonReadContext.getCurrentName()>
	//   17   60:areturn         
		}
	}

	protected JsonToken _handleApos()
		throws IOException
	{
		char ac[] = _textBuffer.emptyAndGetCurrentSegment();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #259 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//    3    7:astore          5
		int i = _textBuffer.getCurrentSegmentSize();
	//    4    9:aload_0         
	//    5   10:getfield        #78  <Field TextBuffer _textBuffer>
	//    6   13:invokevirtual   #90  <Method int TextBuffer.getCurrentSegmentSize()>
	//    7   16:istore_3        
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*   8   17:aload_0         
	//*   9   18:getfield        #52  <Field int _inputPtr>
	//*  10   21:aload_0         
	//*  11   22:getfield        #55  <Field int _inputEnd>
	//*  12   25:icmplt          45
	//*  13   28:aload_0         
	//*  14   29:invokevirtual   #94  <Method boolean _loadMore()>
	//*  15   32:ifne            45
				_reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
	//   16   35:aload_0         
	//   17   36:ldc2            #486 <String ": was expecting closing quote for a string value">
	//   18   39:getstatic       #178 <Field JsonToken JsonToken.VALUE_STRING>
	//   19   42:invokevirtual   #247 <Method void _reportInvalidEOF(String, JsonToken)>
			char ac1[] = _inputBuffer;
	//   20   45:aload_0         
	//   21   46:getfield        #49  <Field char[] _inputBuffer>
	//   22   49:astore          6
			int j = _inputPtr;
	//   23   51:aload_0         
	//   24   52:getfield        #52  <Field int _inputPtr>
	//   25   55:istore          4
			_inputPtr = j + 1;
	//   26   57:aload_0         
	//   27   58:iload           4
	//   28   60:iconst_1        
	//   29   61:iadd            
	//   30   62:putfield        #52  <Field int _inputPtr>
			char c1 = ac1[j];
	//   31   65:aload           6
	//   32   67:iload           4
	//   33   69:caload          
	//   34   70:istore_2        
			char c = c1;
	//   35   71:iload_2         
	//   36   72:istore_1        
			if(c1 <= '\\')
	//*  37   73:iload_2         
	//*  38   74:bipush          92
	//*  39   76:icmpgt          137
				if(c1 == '\\')
	//*  40   79:iload_2         
	//*  41   80:bipush          92
	//*  42   82:icmpne          93
				{
					c = _decodeEscaped();
	//   43   85:aload_0         
	//   44   86:invokevirtual   #251 <Method char _decodeEscaped()>
	//   45   89:istore_1        
				} else
	//*  46   90:goto            137
				{
					c = c1;
	//   47   93:iload_2         
	//   48   94:istore_1        
					if(c1 <= '\'')
	//*  49   95:iload_2         
	//*  50   96:bipush          39
	//*  51   98:icmpgt          137
					{
						if(c1 == '\'')
	//*  52  101:iload_2         
	//*  53  102:bipush          39
	//*  54  104:icmpne          119
						{
							_textBuffer.setCurrentLength(i);
	//   55  107:aload_0         
	//   56  108:getfield        #78  <Field TextBuffer _textBuffer>
	//   57  111:iload_3         
	//   58  112:invokevirtual   #104 <Method void TextBuffer.setCurrentLength(int)>
							return JsonToken.VALUE_STRING;
	//   59  115:getstatic       #178 <Field JsonToken JsonToken.VALUE_STRING>
	//   60  118:areturn         
						}
						c = c1;
	//   61  119:iload_2         
	//   62  120:istore_1        
						if(c1 < ' ')
	//*  63  121:iload_2         
	//*  64  122:bipush          32
	//*  65  124:icmpge          137
						{
							_throwUnquotedSpace(((int) (c1)), "string value");
	//   66  127:aload_0         
	//   67  128:iload_2         
	//   68  129:ldc2            #488 <String "string value">
	//   69  132:invokevirtual   #256 <Method void _throwUnquotedSpace(int, String)>
							c = c1;
	//   70  135:iload_2         
	//   71  136:istore_1        
						}
					}
				}
			ac1 = ac;
	//   72  137:aload           5
	//   73  139:astore          6
			j = i;
	//   74  141:iload_3         
	//   75  142:istore          4
			if(i >= ac.length)
	//*  76  144:iload_3         
	//*  77  145:aload           5
	//*  78  147:arraylength     
	//*  79  148:icmplt          163
			{
				ac1 = _textBuffer.finishCurrentSegment();
	//   80  151:aload_0         
	//   81  152:getfield        #78  <Field TextBuffer _textBuffer>
	//   82  155:invokevirtual   #120 <Method char[] TextBuffer.finishCurrentSegment()>
	//   83  158:astore          6
				j = 0;
	//   84  160:iconst_0        
	//   85  161:istore          4
			}
			ac1[j] = c;
	//   86  163:aload           6
	//   87  165:iload           4
	//   88  167:iload_1         
	//   89  168:castore         
			i = j + 1;
	//   90  169:iload           4
	//   91  171:iconst_1        
	//   92  172:iadd            
	//   93  173:istore_3        
			ac = ac1;
	//   94  174:aload           6
	//   95  176:astore          5
		} while(true);
	//   96  178:goto            17
	}

	protected JsonToken _handleInvalidNumberStart(int i, boolean flag)
		throws IOException
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore          5
		if(i == 73)
	//*   2    3:iload_1         
	//*   3    4:bipush          73
	//*   4    6:icmpne          273
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*   5    9:aload_0         
	//*   6   10:getfield        #52  <Field int _inputPtr>
	//*   7   13:aload_0         
	//*   8   14:getfield        #55  <Field int _inputEnd>
	//*   9   17:icmplt          34
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #94  <Method boolean _loadMore()>
	//*  12   24:ifne            34
				_reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_INT);
	//   13   27:aload_0         
	//   14   28:getstatic       #264 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//   15   31:invokevirtual   #507 <Method void _reportInvalidEOFInValue(JsonToken)>
			char ac[] = _inputBuffer;
	//   16   34:aload_0         
	//   17   35:getfield        #49  <Field char[] _inputBuffer>
	//   18   38:astore          6
			i = _inputPtr;
	//   19   40:aload_0         
	//   20   41:getfield        #52  <Field int _inputPtr>
	//   21   44:istore_1        
			_inputPtr = i + 1;
	//   22   45:aload_0         
	//   23   46:iload_1         
	//   24   47:iconst_1        
	//   25   48:iadd            
	//   26   49:putfield        #52  <Field int _inputPtr>
			i = ((int) (ac[i]));
	//   27   52:aload           6
	//   28   54:iload_1         
	//   29   55:caload          
	//   30   56:istore_1        
			double d = (1.0D / 0.0D);
	//   31   57:ldc2w           #508 <Double (1.0D / 0.0D)>
	//   32   60:dstore_3        
			if(i == 78)
	//*  33   61:iload_1         
	//*  34   62:bipush          78
	//*  35   64:icmpne          167
			{
				String s;
				if(flag)
	//*  36   67:iload_2         
	//*  37   68:ifeq            79
					s = "-INF";
	//   38   71:ldc2            #511 <String "-INF">
	//   39   74:astore          6
				else
	//*  40   76:goto            84
					s = "+INF";
	//   41   79:ldc2            #513 <String "+INF">
	//   42   82:astore          6
				_matchToken(s, 3);
	//   43   84:aload_0         
	//   44   85:aload           6
	//   45   87:iconst_3        
	//   46   88:invokevirtual   #153 <Method void _matchToken(String, int)>
				if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
	//*  47   91:aload_0         
	//*  48   92:getstatic       #516 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  49   95:invokevirtual   #215 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  50   98:ifeq            117
				{
					if(flag)
	//*  51  101:iload_2         
	//*  52  102:ifeq            109
						d = (-1.0D / 0.0D);
	//   53  105:ldc2w           #517 <Double (-1.0D / 0.0D)>
	//   54  108:dstore_3        
					return resetAsNaN(s, d);
	//   55  109:aload_0         
	//   56  110:aload           6
	//   57  112:dload_3         
	//   58  113:invokevirtual   #522 <Method JsonToken resetAsNaN(String, double)>
	//   59  116:areturn         
				}
				StringBuilder stringbuilder = new StringBuilder();
	//   60  117:new             #286 <Class StringBuilder>
	//   61  120:dup             
	//   62  121:invokespecial   #288 <Method void StringBuilder()>
	//   63  124:astore          7
				stringbuilder.append("Non-standard token '");
	//   64  126:aload           7
	//   65  128:ldc2            #524 <String "Non-standard token '">
	//   66  131:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   67  134:pop             
				stringbuilder.append(s);
	//   68  135:aload           7
	//   69  137:aload           6
	//   70  139:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   71  142:pop             
				stringbuilder.append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
	//   72  143:aload           7
	//   73  145:ldc2            #526 <String "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//   74  148:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   75  151:pop             
				_reportError(stringbuilder.toString());
	//   76  152:aload_0         
	//   77  153:aload           7
	//   78  155:invokevirtual   #303 <Method String StringBuilder.toString()>
	//   79  158:invokevirtual   #529 <Method void _reportError(String)>
				j = i;
	//   80  161:iload_1         
	//   81  162:istore          5
			} else
	//*  82  164:goto            273
			{
				j = i;
	//   83  167:iload_1         
	//   84  168:istore          5
				if(i == 110)
	//*  85  170:iload_1         
	//*  86  171:bipush          110
	//*  87  173:icmpne          273
				{
					String s1;
					if(flag)
	//*  88  176:iload_2         
	//*  89  177:ifeq            188
						s1 = "-Infinity";
	//   90  180:ldc2            #531 <String "-Infinity">
	//   91  183:astore          6
					else
	//*  92  185:goto            193
						s1 = "+Infinity";
	//   93  188:ldc2            #533 <String "+Infinity">
	//   94  191:astore          6
					_matchToken(s1, 3);
	//   95  193:aload_0         
	//   96  194:aload           6
	//   97  196:iconst_3        
	//   98  197:invokevirtual   #153 <Method void _matchToken(String, int)>
					if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
	//*  99  200:aload_0         
	//* 100  201:getstatic       #516 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//* 101  204:invokevirtual   #215 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//* 102  207:ifeq            226
					{
						if(flag)
	//* 103  210:iload_2         
	//* 104  211:ifeq            218
							d = (-1.0D / 0.0D);
	//  105  214:ldc2w           #517 <Double (-1.0D / 0.0D)>
	//  106  217:dstore_3        
						return resetAsNaN(s1, d);
	//  107  218:aload_0         
	//  108  219:aload           6
	//  109  221:dload_3         
	//  110  222:invokevirtual   #522 <Method JsonToken resetAsNaN(String, double)>
	//  111  225:areturn         
					}
					StringBuilder stringbuilder1 = new StringBuilder();
	//  112  226:new             #286 <Class StringBuilder>
	//  113  229:dup             
	//  114  230:invokespecial   #288 <Method void StringBuilder()>
	//  115  233:astore          7
					stringbuilder1.append("Non-standard token '");
	//  116  235:aload           7
	//  117  237:ldc2            #524 <String "Non-standard token '">
	//  118  240:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//  119  243:pop             
					stringbuilder1.append(s1);
	//  120  244:aload           7
	//  121  246:aload           6
	//  122  248:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//  123  251:pop             
					stringbuilder1.append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
	//  124  252:aload           7
	//  125  254:ldc2            #526 <String "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//  126  257:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//  127  260:pop             
					_reportError(stringbuilder1.toString());
	//  128  261:aload_0         
	//  129  262:aload           7
	//  130  264:invokevirtual   #303 <Method String StringBuilder.toString()>
	//  131  267:invokevirtual   #529 <Method void _reportError(String)>
					j = i;
	//  132  270:iload_1         
	//  133  271:istore          5
				}
			}
		}
		reportUnexpectedNumberChar(j, "expected digit (0-9) to follow minus sign, for valid numeric value");
	//  134  273:aload_0         
	//  135  274:iload           5
	//  136  276:ldc2            #535 <String "expected digit (0-9) to follow minus sign, for valid numeric value">
	//  137  279:invokevirtual   #227 <Method void reportUnexpectedNumberChar(int, String)>
		return null;
	//  138  282:aconst_null     
	//  139  283:areturn         
	}

	protected String _handleOddName(int i)
		throws IOException
	{
		if(i == 39 && isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES))
	//*   0    0:iload_1         
	//*   1    1:bipush          39
	//*   2    3:icmpne          21
	//*   3    6:aload_0         
	//*   4    7:getstatic       #540 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_SINGLE_QUOTES>
	//*   5   10:invokevirtual   #215 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   6   13:ifeq            21
			return _parseAposName();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #543 <Method String _parseAposName()>
	//    9   20:areturn         
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES))
	//*  10   21:aload_0         
	//*  11   22:getstatic       #546 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_UNQUOTED_FIELD_NAMES>
	//*  12   25:invokevirtual   #215 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  13   28:ifne            39
			_reportUnexpectedChar(i, "was expecting double-quote to start field name");
	//   14   31:aload_0         
	//   15   32:iload_1         
	//   16   33:ldc2            #548 <String "was expecting double-quote to start field name">
	//   17   36:invokevirtual   #340 <Method void _reportUnexpectedChar(int, String)>
		int ai[] = CharTypes.getInputCodeLatin1JsNames();
	//   18   39:invokestatic    #551 <Method int[] CharTypes.getInputCodeLatin1JsNames()>
	//   19   42:astore          8
		int i1 = ai.length;
	//   20   44:aload           8
	//   21   46:arraylength     
	//   22   47:istore          5
		boolean flag;
		if(i < i1)
	//*  23   49:iload_1         
	//*  24   50:iload           5
	//*  25   52:icmpge          74
		{
			if(ai[i] == 0)
	//*  26   55:aload           8
	//*  27   57:iload_1         
	//*  28   58:iaload          
	//*  29   59:ifne            68
				flag = true;
	//   30   62:iconst_1        
	//   31   63:istore          7
			else
	//*  32   65:goto            81
				flag = false;
	//   33   68:iconst_0        
	//   34   69:istore          7
		} else
	//*  35   71:goto            81
		{
			flag = Character.isJavaIdentifierPart((char)i);
	//   36   74:iload_1         
	//   37   75:int2char        
	//   38   76:invokestatic    #100 <Method boolean Character.isJavaIdentifierPart(char)>
	//   39   79:istore          7
		}
		if(!flag)
	//*  40   81:iload           7
	//*  41   83:ifne            94
			_reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
	//   42   86:aload_0         
	//   43   87:iload_1         
	//   44   88:ldc2            #553 <String "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name">
	//   45   91:invokevirtual   #340 <Method void _reportUnexpectedChar(int, String)>
		int l = _inputPtr;
	//   46   94:aload_0         
	//   47   95:getfield        #52  <Field int _inputPtr>
	//   48   98:istore          4
		int j = _hashSeed;
	//   49  100:aload_0         
	//   50  101:getfield        #67  <Field int _hashSeed>
	//   51  104:istore_2        
		int j1 = _inputEnd;
	//   52  105:aload_0         
	//   53  106:getfield        #55  <Field int _inputEnd>
	//   54  109:istore          6
		int k = j;
	//   55  111:iload_2         
	//   56  112:istore_3        
		i = l;
	//   57  113:iload           4
	//   58  115:istore_1        
		if(l < j1)
	//*  59  116:iload           4
	//*  60  118:iload           6
	//*  61  120:icmpge          239
		{
			i = l;
	//   62  123:iload           4
	//   63  125:istore_1        
			do
			{
				k = ((int) (_inputBuffer[i]));
	//   64  126:aload_0         
	//   65  127:getfield        #49  <Field char[] _inputBuffer>
	//   66  130:iload_1         
	//   67  131:caload          
	//   68  132:istore_3        
				if(k < i1)
	//*  69  133:iload_3         
	//*  70  134:iload           5
	//*  71  136:icmpge          175
				{
					if(ai[k] != 0)
	//*  72  139:aload           8
	//*  73  141:iload_3         
	//*  74  142:iaload          
	//*  75  143:ifeq            212
					{
						k = _inputPtr - 1;
	//   76  146:aload_0         
	//   77  147:getfield        #52  <Field int _inputPtr>
	//   78  150:iconst_1        
	//   79  151:isub            
	//   80  152:istore_3        
						_inputPtr = i;
	//   81  153:aload_0         
	//   82  154:iload_1         
	//   83  155:putfield        #52  <Field int _inputPtr>
						return _symbols.findSymbol(_inputBuffer, k, i - k, j);
	//   84  158:aload_0         
	//   85  159:getfield        #59  <Field CharsToNameCanonicalizer _symbols>
	//   86  162:aload_0         
	//   87  163:getfield        #49  <Field char[] _inputBuffer>
	//   88  166:iload_3         
	//   89  167:iload_1         
	//   90  168:iload_3         
	//   91  169:isub            
	//   92  170:iload_2         
	//   93  171:invokevirtual   #117 <Method String CharsToNameCanonicalizer.findSymbol(char[], int, int, int)>
	//   94  174:areturn         
					}
				} else
				if(!Character.isJavaIdentifierPart((char)k))
	//*  95  175:iload_3         
	//*  96  176:int2char        
	//*  97  177:invokestatic    #100 <Method boolean Character.isJavaIdentifierPart(char)>
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
	//  116  208:invokevirtual   #117 <Method String CharsToNameCanonicalizer.findSymbol(char[], int, int, int)>
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
	//  134  233:icmplt          126
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
	//  149  256:invokespecial   #555 <Method String _handleOddName2(int, int, int[])>
	//  150  259:areturn         
	}

	protected JsonToken _handleOddValue(int i)
		throws IOException
	{
		if(i != 39)
	//*   0    0:iload_1         
	//*   1    1:bipush          39
	//*   2    3:icmpeq          217
		{
			if(i != 73)
	//*   3    6:iload_1         
	//*   4    7:bipush          73
	//*   5    9:icmpeq          178
			{
				if(i != 78)
	//*   6   12:iload_1         
	//*   7   13:bipush          78
	//*   8   15:icmpeq          139
				{
					if(i != 93)
	//*   9   18:iload_1         
	//*  10   19:bipush          93
	//*  11   21:icmpeq          102
						switch(i)
	//*  12   24:iload_1         
						{
	//*  13   25:tableswitch     43 44: default 48
	//	               43 51
	//	               44 115
						default:
							break MISSING_BLOCK_LABEL_232;
	//   14   48:goto            232

						case 43: // '+'
							if(_inputPtr >= _inputEnd && !_loadMore())
	//*  15   51:aload_0         
	//*  16   52:getfield        #52  <Field int _inputPtr>
	//*  17   55:aload_0         
	//*  18   56:getfield        #55  <Field int _inputEnd>
	//*  19   59:icmplt          76
	//*  20   62:aload_0         
	//*  21   63:invokevirtual   #94  <Method boolean _loadMore()>
	//*  22   66:ifne            76
								_reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_INT);
	//   23   69:aload_0         
	//   24   70:getstatic       #264 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//   25   73:invokevirtual   #507 <Method void _reportInvalidEOFInValue(JsonToken)>
							char ac[] = _inputBuffer;
	//   26   76:aload_0         
	//   27   77:getfield        #49  <Field char[] _inputBuffer>
	//   28   80:astore_2        
							i = _inputPtr;
	//   29   81:aload_0         
	//   30   82:getfield        #52  <Field int _inputPtr>
	//   31   85:istore_1        
							_inputPtr = i + 1;
	//   32   86:aload_0         
	//   33   87:iload_1         
	//   34   88:iconst_1        
	//   35   89:iadd            
	//   36   90:putfield        #52  <Field int _inputPtr>
							return _handleInvalidNumberStart(((int) (ac[i])), false);
	//   37   93:aload_0         
	//   38   94:aload_2         
	//   39   95:iload_1         
	//   40   96:caload          
	//   41   97:iconst_0        
	//   42   98:invokevirtual   #275 <Method JsonToken _handleInvalidNumberStart(int, boolean)>
	//   43  101:areturn         

						case 44: // ','
							break;
						}
					else
					if(!_parsingContext.inArray())
	//*  44  102:aload_0         
	//*  45  103:getfield        #189 <Field JsonReadContext _parsingContext>
	//*  46  106:invokevirtual   #558 <Method boolean JsonReadContext.inArray()>
	//*  47  109:ifne            115
						break MISSING_BLOCK_LABEL_232;
	//   48  112:goto            232
					if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES))
	//*  49  115:aload_0         
	//*  50  116:getstatic       #211 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_MISSING_VALUES>
	//*  51  119:invokevirtual   #215 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  52  122:ifeq            232
					{
						_inputPtr = _inputPtr - 1;
	//   53  125:aload_0         
	//   54  126:aload_0         
	//   55  127:getfield        #52  <Field int _inputPtr>
	//   56  130:iconst_1        
	//   57  131:isub            
	//   58  132:putfield        #52  <Field int _inputPtr>
						return JsonToken.VALUE_NULL;
	//   59  135:getstatic       #161 <Field JsonToken JsonToken.VALUE_NULL>
	//   60  138:areturn         
					}
				} else
				{
					_matchToken("NaN", 1);
	//   61  139:aload_0         
	//   62  140:ldc2            #560 <String "NaN">
	//   63  143:iconst_1        
	//   64  144:invokevirtual   #153 <Method void _matchToken(String, int)>
					if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
	//*  65  147:aload_0         
	//*  66  148:getstatic       #516 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  67  151:invokevirtual   #215 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  68  154:ifeq            168
						return resetAsNaN("NaN", (0.0D / 0.0D));
	//   69  157:aload_0         
	//   70  158:ldc2            #560 <String "NaN">
	//   71  161:ldc2w           #561 <Double (0.0D / 0.0D)>
	//   72  164:invokevirtual   #522 <Method JsonToken resetAsNaN(String, double)>
	//   73  167:areturn         
					_reportError("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
	//   74  168:aload_0         
	//   75  169:ldc2            #564 <String "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//   76  172:invokevirtual   #529 <Method void _reportError(String)>
				}
			} else
	//*  77  175:goto            232
			{
				_matchToken("Infinity", 1);
	//   78  178:aload_0         
	//   79  179:ldc2            #566 <String "Infinity">
	//   80  182:iconst_1        
	//   81  183:invokevirtual   #153 <Method void _matchToken(String, int)>
				if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
	//*  82  186:aload_0         
	//*  83  187:getstatic       #516 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  84  190:invokevirtual   #215 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  85  193:ifeq            207
					return resetAsNaN("Infinity", (1.0D / 0.0D));
	//   86  196:aload_0         
	//   87  197:ldc2            #566 <String "Infinity">
	//   88  200:ldc2w           #508 <Double (1.0D / 0.0D)>
	//   89  203:invokevirtual   #522 <Method JsonToken resetAsNaN(String, double)>
	//   90  206:areturn         
				_reportError("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
	//   91  207:aload_0         
	//   92  208:ldc2            #568 <String "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//   93  211:invokevirtual   #529 <Method void _reportError(String)>
			}
		} else
	//*  94  214:goto            232
		if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES))
	//*  95  217:aload_0         
	//*  96  218:getstatic       #540 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_SINGLE_QUOTES>
	//*  97  221:invokevirtual   #215 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  98  224:ifeq            232
			return _handleApos();
	//   99  227:aload_0         
	//  100  228:invokevirtual   #570 <Method JsonToken _handleApos()>
	//  101  231:areturn         
		if(Character.isJavaIdentifierStart(i))
	//* 102  232:iload_1         
	//* 103  233:invokestatic    #574 <Method boolean Character.isJavaIdentifierStart(int)>
	//* 104  236:ifeq            273
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  105  239:new             #286 <Class StringBuilder>
	//  106  242:dup             
	//  107  243:invokespecial   #288 <Method void StringBuilder()>
	//  108  246:astore_2        
			stringbuilder.append("");
	//  109  247:aload_2         
	//  110  248:ldc2            #576 <String "">
	//  111  251:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//  112  254:pop             
			stringbuilder.append((char)i);
	//  113  255:aload_2         
	//  114  256:iload_1         
	//  115  257:int2char        
	//  116  258:invokevirtual   #454 <Method StringBuilder StringBuilder.append(char)>
	//  117  261:pop             
			_reportInvalidToken(stringbuilder.toString(), "('true', 'false' or 'null')");
	//  118  262:aload_0         
	//  119  263:aload_2         
	//  120  264:invokevirtual   #303 <Method String StringBuilder.toString()>
	//  121  267:ldc2            #578 <String "('true', 'false' or 'null')">
	//  122  270:invokevirtual   #582 <Method void _reportInvalidToken(String, String)>
		}
		_reportUnexpectedChar(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
	//  123  273:aload_0         
	//  124  274:iload_1         
	//  125  275:ldc2            #584 <String "expected a valid value (number, String, array, object, 'true', 'false' or 'null')">
	//  126  278:invokevirtual   #340 <Method void _reportUnexpectedChar(int, String)>
		return null;
	//  127  281:aconst_null     
	//  128  282:areturn         
	}

	protected boolean _isNextTokenNameMaybe(int i, String s)
		throws IOException
	{
		String s1;
		if(i == 34)
	//*   0    0:iload_1         
	//*   1    1:bipush          34
	//*   2    3:icmpne          15
			s1 = _parseName();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #589 <Method String _parseName()>
	//    5   10:astore          4
		else
	//*   6   12:goto            22
			s1 = _handleOddName(i);
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:invokevirtual   #591 <Method String _handleOddName(int)>
	//   10   20:astore          4
		_parsingContext.setCurrentName(s1);
	//   11   22:aload_0         
	//   12   23:getfield        #189 <Field JsonReadContext _parsingContext>
	//   13   26:aload           4
	//   14   28:invokevirtual   #594 <Method void JsonReadContext.setCurrentName(String)>
		_currToken = JsonToken.FIELD_NAME;
	//   15   31:aload_0         
	//   16   32:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//   17   35:putfield        #131 <Field JsonToken _currToken>
		i = _skipColon();
	//   18   38:aload_0         
	//   19   39:invokespecial   #596 <Method int _skipColon()>
	//   20   42:istore_1        
		_updateLocation();
	//   21   43:aload_0         
	//   22   44:invokespecial   #134 <Method void _updateLocation()>
		if(i == 34)
	//*  23   47:iload_1         
	//*  24   48:bipush          34
	//*  25   50:icmpne          72
		{
			_tokenIncomplete = true;
	//   26   53:aload_0         
	//   27   54:iconst_1        
	//   28   55:putfield        #175 <Field boolean _tokenIncomplete>
			_nextToken = JsonToken.VALUE_STRING;
	//   29   58:aload_0         
	//   30   59:getstatic       #178 <Field JsonToken JsonToken.VALUE_STRING>
	//   31   62:putfield        #141 <Field JsonToken _nextToken>
			return s.equals(((Object) (s1)));
	//   32   65:aload_2         
	//   33   66:aload           4
	//   34   68:invokevirtual   #602 <Method boolean String.equals(Object)>
	//   35   71:ireturn         
		}
		JsonToken jsontoken;
		if(i != 45)
	//*  36   72:iload_1         
	//*  37   73:bipush          45
	//*  38   75:icmpeq          229
		{
			if(i != 91)
	//*  39   78:iload_1         
	//*  40   79:bipush          91
	//*  41   81:icmpeq          222
			{
				if(i != 102)
	//*  42   84:iload_1         
	//*  43   85:bipush          102
	//*  44   87:icmpeq          211
				{
					if(i != 110)
	//*  45   90:iload_1         
	//*  46   91:bipush          110
	//*  47   93:icmpeq          200
					{
						if(i != 116)
	//*  48   96:iload_1         
	//*  49   97:bipush          116
	//*  50   99:icmpeq          189
						{
							if(i != 123)
	//*  51  102:iload_1         
	//*  52  103:bipush          123
	//*  53  105:icmpeq          182
								switch(i)
	//*  54  108:iload_1         
								{
	//*  55  109:tableswitch     48 57: default 164
	//	               48 173
	//	               49 173
	//	               50 173
	//	               51 173
	//	               52 173
	//	               53 173
	//	               54 173
	//	               55 173
	//	               56 173
	//	               57 173
								default:
									jsontoken = _handleOddValue(i);
	//   56  164:aload_0         
	//   57  165:iload_1         
	//   58  166:invokevirtual   #138 <Method JsonToken _handleOddValue(int)>
	//   59  169:astore_3        
									break;

	//*  60  170:goto            234
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
	//   61  173:aload_0         
	//   62  174:iload_1         
	//   63  175:invokevirtual   #144 <Method JsonToken _parsePosNumber(int)>
	//   64  178:astore_3        
									break;
								}
							else
	//*  65  179:goto            234
								jsontoken = JsonToken.START_OBJECT;
	//   66  182:getstatic       #147 <Field JsonToken JsonToken.START_OBJECT>
	//   67  185:astore_3        
						} else
	//*  68  186:goto            234
						{
							_matchTrue();
	//   69  189:aload_0         
	//   70  190:invokespecial   #604 <Method void _matchTrue()>
							jsontoken = JsonToken.VALUE_TRUE;
	//   71  193:getstatic       #156 <Field JsonToken JsonToken.VALUE_TRUE>
	//   72  196:astore_3        
						}
					} else
	//*  73  197:goto            234
					{
						_matchNull();
	//   74  200:aload_0         
	//   75  201:invokespecial   #606 <Method void _matchNull()>
						jsontoken = JsonToken.VALUE_NULL;
	//   76  204:getstatic       #161 <Field JsonToken JsonToken.VALUE_NULL>
	//   77  207:astore_3        
					}
				} else
	//*  78  208:goto            234
				{
					_matchFalse();
	//   79  211:aload_0         
	//   80  212:invokespecial   #608 <Method void _matchFalse()>
					jsontoken = JsonToken.VALUE_FALSE;
	//   81  215:getstatic       #166 <Field JsonToken JsonToken.VALUE_FALSE>
	//   82  218:astore_3        
				}
			} else
	//*  83  219:goto            234
			{
				jsontoken = JsonToken.START_ARRAY;
	//   84  222:getstatic       #169 <Field JsonToken JsonToken.START_ARRAY>
	//   85  225:astore_3        
			}
		} else
	//*  86  226:goto            234
		{
			jsontoken = _parseNegNumber();
	//   87  229:aload_0         
	//   88  230:invokevirtual   #173 <Method JsonToken _parseNegNumber()>
	//   89  233:astore_3        
		}
		_nextToken = jsontoken;
	//   90  234:aload_0         
	//   91  235:aload_3         
	//   92  236:putfield        #141 <Field JsonToken _nextToken>
		return s.equals(((Object) (s1)));
	//   93  239:aload_2         
	//   94  240:aload           4
	//   95  242:invokevirtual   #602 <Method boolean String.equals(Object)>
	//   96  245:ireturn         
	}

	protected boolean _loadMore()
		throws IOException
	{
		int i = _inputEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int _inputEnd>
	//    2    4:istore_1        
		long l = _currInputProcessed;
	//    3    5:aload_0         
	//    4    6:getfield        #372 <Field long _currInputProcessed>
	//    5    9:lstore_2        
		long l1 = i;
	//    6   10:iload_1         
	//    7   11:i2l             
	//    8   12:lstore          4
		_currInputProcessed = l + l1;
	//    9   14:aload_0         
	//   10   15:lload_2         
	//   11   16:lload           4
	//   12   18:ladd            
	//   13   19:putfield        #372 <Field long _currInputProcessed>
		_currInputRowStart = _currInputRowStart - i;
	//   14   22:aload_0         
	//   15   23:aload_0         
	//   16   24:getfield        #319 <Field int _currInputRowStart>
	//   17   27:iload_1         
	//   18   28:isub            
	//   19   29:putfield        #319 <Field int _currInputRowStart>
		_nameStartOffset = _nameStartOffset - l1;
	//   20   32:aload_0         
	//   21   33:aload_0         
	//   22   34:getfield        #378 <Field long _nameStartOffset>
	//   23   37:lload           4
	//   24   39:lsub            
	//   25   40:putfield        #378 <Field long _nameStartOffset>
		if(_reader != null)
	//*  26   43:aload_0         
	//*  27   44:getfield        #41  <Field Reader _reader>
	//*  28   47:ifnull          133
		{
			int j = _reader.read(_inputBuffer, 0, _inputBuffer.length);
	//   29   50:aload_0         
	//   30   51:getfield        #41  <Field Reader _reader>
	//   31   54:aload_0         
	//   32   55:getfield        #49  <Field char[] _inputBuffer>
	//   33   58:iconst_0        
	//   34   59:aload_0         
	//   35   60:getfield        #49  <Field char[] _inputBuffer>
	//   36   63:arraylength     
	//   37   64:invokevirtual   #612 <Method int Reader.read(char[], int, int)>
	//   38   67:istore_1        
			if(j > 0)
	//*  39   68:iload_1         
	//*  40   69:ifle            84
			{
				_inputPtr = 0;
	//   41   72:aload_0         
	//   42   73:iconst_0        
	//   43   74:putfield        #52  <Field int _inputPtr>
				_inputEnd = j;
	//   44   77:aload_0         
	//   45   78:iload_1         
	//   46   79:putfield        #55  <Field int _inputEnd>
				return true;
	//   47   82:iconst_1        
	//   48   83:ireturn         
			}
			_closeInput();
	//   49   84:aload_0         
	//   50   85:invokevirtual   #614 <Method void _closeInput()>
			if(j == 0)
	//*  51   88:iload_1         
	//*  52   89:ifne            133
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   53   92:new             #286 <Class StringBuilder>
	//   54   95:dup             
	//   55   96:invokespecial   #288 <Method void StringBuilder()>
	//   56   99:astore          6
				stringbuilder.append("Reader returned 0 characters when trying to read ");
	//   57  101:aload           6
	//   58  103:ldc2            #616 <String "Reader returned 0 characters when trying to read ">
	//   59  106:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   60  109:pop             
				stringbuilder.append(_inputEnd);
	//   61  110:aload           6
	//   62  112:aload_0         
	//   63  113:getfield        #55  <Field int _inputEnd>
	//   64  116:invokevirtual   #619 <Method StringBuilder StringBuilder.append(int)>
	//   65  119:pop             
				throw new IOException(stringbuilder.toString());
	//   66  120:new             #74  <Class IOException>
	//   67  123:dup             
	//   68  124:aload           6
	//   69  126:invokevirtual   #303 <Method String StringBuilder.toString()>
	//   70  129:invokespecial   #621 <Method void IOException(String)>
	//   71  132:athrow          
			}
		}
		return false;
	//   72  133:iconst_0        
	//   73  134:ireturn         
	}

	protected void _loadMoreGuaranteed()
		throws IOException
	{
		if(!_loadMore())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #94  <Method boolean _loadMore()>
	//*   2    4:ifne            11
			_reportInvalidEOF();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #623 <Method void _reportInvalidEOF()>
	//    5   11:return          
	}

	protected final void _matchToken(String s, int i)
		throws IOException
	{
		int k = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #626 <Method int String.length()>
	//    2    4:istore          5
		int j;
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*   3    6:aload_0         
	//*   4    7:getfield        #52  <Field int _inputPtr>
	//*   5   10:aload_0         
	//*   6   11:getfield        #55  <Field int _inputEnd>
	//*   7   14:icmplt          34
	//*   8   17:aload_0         
	//*   9   18:invokevirtual   #94  <Method boolean _loadMore()>
	//*  10   21:ifne            34
				_reportInvalidToken(s.substring(0, i));
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:iconst_0        
	//   14   27:iload_2         
	//   15   28:invokevirtual   #630 <Method String String.substring(int, int)>
	//   16   31:invokevirtual   #632 <Method void _reportInvalidToken(String)>
			if(_inputBuffer[_inputPtr] != s.charAt(i))
	//*  17   34:aload_0         
	//*  18   35:getfield        #49  <Field char[] _inputBuffer>
	//*  19   38:aload_0         
	//*  20   39:getfield        #52  <Field int _inputPtr>
	//*  21   42:caload          
	//*  22   43:aload_1         
	//*  23   44:iload_2         
	//*  24   45:invokevirtual   #636 <Method char String.charAt(int)>
	//*  25   48:icmpeq          61
				_reportInvalidToken(s.substring(0, i));
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:iconst_0        
	//   29   54:iload_2         
	//   30   55:invokevirtual   #630 <Method String String.substring(int, int)>
	//   31   58:invokevirtual   #632 <Method void _reportInvalidToken(String)>
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
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*  47   86:aload_0         
	//*  48   87:getfield        #52  <Field int _inputPtr>
	//*  49   90:aload_0         
	//*  50   91:getfield        #55  <Field int _inputEnd>
	//*  51   94:icmplt          105
	//*  52   97:aload_0         
	//*  53   98:invokevirtual   #94  <Method boolean _loadMore()>
	//*  54  101:ifne            105
			return;
	//   55  104:return          
		char c = _inputBuffer[_inputPtr];
	//   56  105:aload_0         
	//   57  106:getfield        #49  <Field char[] _inputBuffer>
	//   58  109:aload_0         
	//   59  110:getfield        #52  <Field int _inputPtr>
	//   60  113:caload          
	//   61  114:istore_3        
		if(c >= '0' && c != ']')
	//*  62  115:iload_3         
	//*  63  116:bipush          48
	//*  64  118:icmplt          153
	//*  65  121:iload_3         
	//*  66  122:bipush          93
	//*  67  124:icmpeq          153
		{
			if(c == '}')
	//*  68  127:iload_3         
	//*  69  128:bipush          125
	//*  70  130:icmpne          134
				return;
	//   71  133:return          
			if(Character.isJavaIdentifierPart(c))
	//*  72  134:iload_3         
	//*  73  135:invokestatic    #100 <Method boolean Character.isJavaIdentifierPart(char)>
	//*  74  138:ifeq            152
				_reportInvalidToken(s.substring(0, j));
	//   75  141:aload_0         
	//   76  142:aload_1         
	//   77  143:iconst_0        
	//   78  144:iload           4
	//   79  146:invokevirtual   #630 <Method String String.substring(int, int)>
	//   80  149:invokevirtual   #632 <Method void _reportInvalidToken(String)>
			return;
	//   81  152:return          
		} else
		{
			return;
	//   82  153:return          
		}
	}

	protected String _parseAposName()
		throws IOException
	{
		int i;
		int j;
label0:
		{
			int k = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int _inputPtr>
	//    2    4:istore_3        
			int i1 = _hashSeed;
	//    3    5:aload_0         
	//    4    6:getfield        #67  <Field int _hashSeed>
	//    5    9:istore          4
			int j1 = _inputEnd;
	//    6   11:aload_0         
	//    7   12:getfield        #55  <Field int _inputEnd>
	//    8   15:istore          5
			j = k;
	//    9   17:iload_3         
	//   10   18:istore_2        
			i = i1;
	//   11   19:iload           4
	//   12   21:istore_1        
			if(k >= j1)
				break label0;
	//   13   22:iload_3         
	//   14   23:iload           5
	//   15   25:icmpge          129
			int ai[] = _icLatin1;
	//   16   28:getstatic       #33  <Field int[] _icLatin1>
	//   17   31:astore          7
			int k1 = ai.length;
	//   18   33:aload           7
	//   19   35:arraylength     
	//   20   36:istore          6
			i = i1;
	//   21   38:iload           4
	//   22   40:istore_1        
			j = k;
	//   23   41:iload_3         
	//   24   42:istore_2        
			do
			{
				k = ((int) (_inputBuffer[j]));
	//   25   43:aload_0         
	//   26   44:getfield        #49  <Field char[] _inputBuffer>
	//   27   47:iload_2         
	//   28   48:caload          
	//   29   49:istore_3        
				if(k == 39)
	//*  30   50:iload_3         
	//*  31   51:bipush          39
	//*  32   53:icmpne          85
				{
					k = _inputPtr;
	//   33   56:aload_0         
	//   34   57:getfield        #52  <Field int _inputPtr>
	//   35   60:istore_3        
					_inputPtr = j + 1;
	//   36   61:aload_0         
	//   37   62:iload_2         
	//   38   63:iconst_1        
	//   39   64:iadd            
	//   40   65:putfield        #52  <Field int _inputPtr>
					return _symbols.findSymbol(_inputBuffer, k, j - k, i);
	//   41   68:aload_0         
	//   42   69:getfield        #59  <Field CharsToNameCanonicalizer _symbols>
	//   43   72:aload_0         
	//   44   73:getfield        #49  <Field char[] _inputBuffer>
	//   45   76:iload_3         
	//   46   77:iload_2         
	//   47   78:iload_3         
	//   48   79:isub            
	//   49   80:iload_1         
	//   50   81:invokevirtual   #117 <Method String CharsToNameCanonicalizer.findSymbol(char[], int, int, int)>
	//   51   84:areturn         
				}
				if(k < k1 && ai[k] != 0)
	//*  52   85:iload_3         
	//*  53   86:iload           6
	//*  54   88:icmpge          101
	//*  55   91:aload           7
	//*  56   93:iload_3         
	//*  57   94:iaload          
	//*  58   95:ifeq            101
					break label0;
	//   59   98:goto            129
				i1 = i * 33 + k;
	//   60  101:iload_1         
	//   61  102:bipush          33
	//   62  104:imul            
	//   63  105:iload_3         
	//   64  106:iadd            
	//   65  107:istore          4
				k = j + 1;
	//   66  109:iload_2         
	//   67  110:iconst_1        
	//   68  111:iadd            
	//   69  112:istore_3        
				j = k;
	//   70  113:iload_3         
	//   71  114:istore_2        
				i = i1;
	//   72  115:iload           4
	//   73  117:istore_1        
			} while(k < j1);
	//   74  118:iload_3         
	//   75  119:iload           5
	//   76  121:icmplt          43
			i = i1;
	//   77  124:iload           4
	//   78  126:istore_1        
			j = k;
	//   79  127:iload_3         
	//   80  128:istore_2        
		}
		int l = _inputPtr;
	//   81  129:aload_0         
	//   82  130:getfield        #52  <Field int _inputPtr>
	//   83  133:istore_3        
		_inputPtr = j;
	//   84  134:aload_0         
	//   85  135:iload_2         
	//   86  136:putfield        #52  <Field int _inputPtr>
		return _parseName2(l, i, 39);
	//   87  139:aload_0         
	//   88  140:iload_3         
	//   89  141:iload_1         
	//   90  142:bipush          39
	//   91  144:invokespecial   #638 <Method String _parseName2(int, int, int)>
	//   92  147:areturn         
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
	//   45   75:invokevirtual   #117 <Method String CharsToNameCanonicalizer.findSymbol(char[], int, int, int)>
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
	//   68  108:invokespecial   #638 <Method String _parseName2(int, int, int)>
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
	//   16   26:invokespecial   #221 <Method JsonToken _parseNumber2(boolean, int)>
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
		if(i <= 57 && i >= 48)
	//*  29   45:iload_1         
	//*  30   46:bipush          57
	//*  31   48:icmpgt          214
	//*  32   51:iload_1         
	//*  33   52:bipush          48
	//*  34   54:icmpge          60
	//*  35   57:goto            214
		{
			if(i == 48)
	//*  36   60:iload_1         
	//*  37   61:bipush          48
	//*  38   63:icmpne          74
				return _parseNumber2(true, l);
	//   39   66:aload_0         
	//   40   67:iconst_1        
	//   41   68:iload           4
	//   42   70:invokespecial   #221 <Method JsonToken _parseNumber2(boolean, int)>
	//   43   73:areturn         
			i = 1;
	//   44   74:iconst_1        
	//   45   75:istore_1        
			int k;
			do
			{
				if(j >= i1)
	//*  46   76:iload_2         
	//*  47   77:iload           5
	//*  48   79:icmplt          90
					return _parseNumber2(true, l);
	//   49   82:aload_0         
	//   50   83:iconst_1        
	//   51   84:iload           4
	//   52   86:invokespecial   #221 <Method JsonToken _parseNumber2(boolean, int)>
	//   53   89:areturn         
				char ac1[] = _inputBuffer;
	//   54   90:aload_0         
	//   55   91:getfield        #49  <Field char[] _inputBuffer>
	//   56   94:astore          6
				k = j + 1;
	//   57   96:iload_2         
	//   58   97:iconst_1        
	//   59   98:iadd            
	//   60   99:istore_3        
				j = ((int) (ac1[j]));
	//   61  100:aload           6
	//   62  102:iload_2         
	//   63  103:caload          
	//   64  104:istore_2        
				if(j < 48 || j > 57)
	//*  65  105:iload_2         
	//*  66  106:bipush          48
	//*  67  108:icmplt          129
	//*  68  111:iload_2         
	//*  69  112:bipush          57
	//*  70  114:icmple          120
					break;
	//   71  117:goto            129
				i++;
	//   72  120:iload_1         
	//   73  121:iconst_1        
	//   74  122:iadd            
	//   75  123:istore_1        
				j = k;
	//   76  124:iload_3         
	//   77  125:istore_2        
			} while(true);
	//   78  126:goto            76
			if(j != 46 && j != 101 && j != 69)
	//*  79  129:iload_2         
	//*  80  130:bipush          46
	//*  81  132:icmpeq          198
	//*  82  135:iload_2         
	//*  83  136:bipush          101
	//*  84  138:icmpeq          198
	//*  85  141:iload_2         
	//*  86  142:bipush          69
	//*  87  144:icmpne          150
	//*  88  147:goto            198
			{
				k--;
	//   89  150:iload_3         
	//   90  151:iconst_1        
	//   91  152:isub            
	//   92  153:istore_3        
				_inputPtr = k;
	//   93  154:aload_0         
	//   94  155:iload_3         
	//   95  156:putfield        #52  <Field int _inputPtr>
				if(_parsingContext.inRoot())
	//*  96  159:aload_0         
	//*  97  160:getfield        #189 <Field JsonReadContext _parsingContext>
	//*  98  163:invokevirtual   #232 <Method boolean JsonReadContext.inRoot()>
	//*  99  166:ifeq            174
					_verifyRootSpace(j);
	//  100  169:aload_0         
	//  101  170:iload_2         
	//  102  171:invokespecial   #235 <Method void _verifyRootSpace(int)>
				_textBuffer.resetWithShared(_inputBuffer, l, k - l);
	//  103  174:aload_0         
	//  104  175:getfield        #78  <Field TextBuffer _textBuffer>
	//  105  178:aload_0         
	//  106  179:getfield        #49  <Field char[] _inputBuffer>
	//  107  182:iload           4
	//  108  184:iload_3         
	//  109  185:iload           4
	//  110  187:isub            
	//  111  188:invokevirtual   #84  <Method void TextBuffer.resetWithShared(char[], int, int)>
				return resetInt(true, i);
	//  112  191:aload_0         
	//  113  192:iconst_1        
	//  114  193:iload_1         
	//  115  194:invokevirtual   #641 <Method JsonToken resetInt(boolean, int)>
	//  116  197:areturn         
			} else
			{
				_inputPtr = k;
	//  117  198:aload_0         
	//  118  199:iload_3         
	//  119  200:putfield        #52  <Field int _inputPtr>
				return _parseFloat(j, l, k, true, i);
	//  120  203:aload_0         
	//  121  204:iload_2         
	//  122  205:iload           4
	//  123  207:iload_3         
	//  124  208:iconst_1        
	//  125  209:iload_1         
	//  126  210:invokespecial   #643 <Method JsonToken _parseFloat(int, int, int, boolean, int)>
	//  127  213:areturn         
			}
		} else
		{
			_inputPtr = j;
	//  128  214:aload_0         
	//  129  215:iload_2         
	//  130  216:putfield        #52  <Field int _inputPtr>
			return _handleInvalidNumberStart(i, true);
	//  131  219:aload_0         
	//  132  220:iload_1         
	//  133  221:iconst_1        
	//  134  222:invokevirtual   #275 <Method JsonToken _handleInvalidNumberStart(int, boolean)>
	//  135  225:areturn         
		}
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
	//   16   26:invokespecial   #221 <Method JsonToken _parseNumber2(boolean, int)>
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
	//   29   48:invokespecial   #221 <Method JsonToken _parseNumber2(boolean, int)>
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
	//*  44   70:icmplt          91
	//*  45   73:iload_2         
	//*  46   74:bipush          57
	//*  47   76:icmple          82
				break;
	//   48   79:goto            91
			i++;
	//   49   82:iload_1         
	//   50   83:iconst_1        
	//   51   84:iadd            
	//   52   85:istore_1        
			j = k;
	//   53   86:iload_3         
	//   54   87:istore_2        
		} while(true);
	//   55   88:goto            32
		if(j != 46 && j != 101 && j != 69)
	//*  56   91:iload_2         
	//*  57   92:bipush          46
	//*  58   94:icmpeq          160
	//*  59   97:iload_2         
	//*  60   98:bipush          101
	//*  61  100:icmpeq          160
	//*  62  103:iload_2         
	//*  63  104:bipush          69
	//*  64  106:icmpne          112
	//*  65  109:goto            160
		{
			k--;
	//   66  112:iload_3         
	//   67  113:iconst_1        
	//   68  114:isub            
	//   69  115:istore_3        
			_inputPtr = k;
	//   70  116:aload_0         
	//   71  117:iload_3         
	//   72  118:putfield        #52  <Field int _inputPtr>
			if(_parsingContext.inRoot())
	//*  73  121:aload_0         
	//*  74  122:getfield        #189 <Field JsonReadContext _parsingContext>
	//*  75  125:invokevirtual   #232 <Method boolean JsonReadContext.inRoot()>
	//*  76  128:ifeq            136
				_verifyRootSpace(j);
	//   77  131:aload_0         
	//   78  132:iload_2         
	//   79  133:invokespecial   #235 <Method void _verifyRootSpace(int)>
			_textBuffer.resetWithShared(_inputBuffer, l, k - l);
	//   80  136:aload_0         
	//   81  137:getfield        #78  <Field TextBuffer _textBuffer>
	//   82  140:aload_0         
	//   83  141:getfield        #49  <Field char[] _inputBuffer>
	//   84  144:iload           4
	//   85  146:iload_3         
	//   86  147:iload           4
	//   87  149:isub            
	//   88  150:invokevirtual   #84  <Method void TextBuffer.resetWithShared(char[], int, int)>
			return resetInt(false, i);
	//   89  153:aload_0         
	//   90  154:iconst_0        
	//   91  155:iload_1         
	//   92  156:invokevirtual   #641 <Method JsonToken resetInt(boolean, int)>
	//   93  159:areturn         
		} else
		{
			_inputPtr = k;
	//   94  160:aload_0         
	//   95  161:iload_3         
	//   96  162:putfield        #52  <Field int _inputPtr>
			return _parseFloat(j, l, k, false, i);
	//   97  165:aload_0         
	//   98  166:iload_2         
	//   99  167:iload           4
	//  100  169:iload_3         
	//  101  170:iconst_0        
	//  102  171:iload_1         
	//  103  172:invokespecial   #643 <Method JsonToken _parseFloat(int, int, int, boolean, int)>
	//  104  175:areturn         
		}
	}

	protected int _readBinary(Base64Variant base64variant, OutputStream outputstream, byte abyte0[])
		throws IOException
	{
		int k1 = abyte0.length;
	//    0    0:aload_3         
	//    1    1:arraylength     
	//    2    2:istore          10
		int i = 0;
	//    3    4:iconst_0        
	//    4    5:istore          5
		int l = i;
	//    5    7:iload           5
	//    6    9:istore          7
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
						char c;
label3:
						{
label4:
							{
								do
								{
									if(_inputPtr >= _inputEnd)
	//*   7   11:aload_0         
	//*   8   12:getfield        #52  <Field int _inputPtr>
	//*   9   15:aload_0         
	//*  10   16:getfield        #55  <Field int _inputEnd>
	//*  11   19:icmplt          26
										_loadMoreGuaranteed();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #422 <Method void _loadMoreGuaranteed()>
									char ac[] = _inputBuffer;
	//   14   26:aload_0         
	//   15   27:getfield        #49  <Field char[] _inputBuffer>
	//   16   30:astore          12
									int j = _inputPtr;
	//   17   32:aload_0         
	//   18   33:getfield        #52  <Field int _inputPtr>
	//   19   36:istore          6
									_inputPtr = j + 1;
	//   20   38:aload_0         
	//   21   39:iload           6
	//   22   41:iconst_1        
	//   23   42:iadd            
	//   24   43:putfield        #52  <Field int _inputPtr>
									c = ac[j];
	//   25   46:aload           12
	//   26   48:iload           6
	//   27   50:caload          
	//   28   51:istore          4
								} while(c <= ' ');
	//   29   53:iload           4
	//   30   55:bipush          32
	//   31   57:icmple          11
								k = base64variant.decodeBase64Char(c);
	//   32   60:aload_1         
	//   33   61:iload           4
	//   34   63:invokevirtual   #428 <Method int Base64Variant.decodeBase64Char(char)>
	//   35   66:istore          6
								j1 = k;
	//   36   68:iload           6
	//   37   70:istore          9
								if(k < 0)
	//*  38   72:iload           6
	//*  39   74:ifge            113
								{
									if(c == '"')
	//*  40   77:iload           4
	//*  41   79:bipush          34
	//*  42   81:icmpne          91
									{
										k = l;
	//   43   84:iload           7
	//   44   86:istore          6
										break label4;
	//   45   88:goto            594
									}
									k = _decodeBase64Escape(base64variant, c, 0);
	//   46   91:aload_0         
	//   47   92:aload_1         
	//   48   93:iload           4
	//   49   95:iconst_0        
	//   50   96:invokevirtual   #438 <Method int _decodeBase64Escape(Base64Variant, char, int)>
	//   51   99:istore          6
									j1 = k;
	//   52  101:iload           6
	//   53  103:istore          9
									if(k < 0)
	//*  54  105:iload           6
	//*  55  107:ifge            113
										continue;
	//   56  110:goto            11
								}
								i1 = i;
	//   57  113:iload           5
	//   58  115:istore          8
								k = l;
	//   59  117:iload           7
	//   60  119:istore          6
								if(i > k1 - 3)
	//*  61  121:iload           5
	//*  62  123:iload           10
	//*  63  125:iconst_3        
	//*  64  126:isub            
	//*  65  127:icmple          148
								{
									k = l + i;
	//   66  130:iload           7
	//   67  132:iload           5
	//   68  134:iadd            
	//   69  135:istore          6
									outputstream.write(abyte0, 0, i);
	//   70  137:aload_2         
	//   71  138:aload_3         
	//   72  139:iconst_0        
	//   73  140:iload           5
	//   74  142:invokevirtual   #651 <Method void OutputStream.write(byte[], int, int)>
									i1 = 0;
	//   75  145:iconst_0        
	//   76  146:istore          8
								}
								if(_inputPtr >= _inputEnd)
	//*  77  148:aload_0         
	//*  78  149:getfield        #52  <Field int _inputPtr>
	//*  79  152:aload_0         
	//*  80  153:getfield        #55  <Field int _inputEnd>
	//*  81  156:icmplt          163
									_loadMoreGuaranteed();
	//   82  159:aload_0         
	//   83  160:invokevirtual   #422 <Method void _loadMoreGuaranteed()>
								char ac1[] = _inputBuffer;
	//   84  163:aload_0         
	//   85  164:getfield        #49  <Field char[] _inputBuffer>
	//   86  167:astore          12
								i = _inputPtr;
	//   87  169:aload_0         
	//   88  170:getfield        #52  <Field int _inputPtr>
	//   89  173:istore          5
								_inputPtr = i + 1;
	//   90  175:aload_0         
	//   91  176:iload           5
	//   92  178:iconst_1        
	//   93  179:iadd            
	//   94  180:putfield        #52  <Field int _inputPtr>
								c = ac1[i];
	//   95  183:aload           12
	//   96  185:iload           5
	//   97  187:caload          
	//   98  188:istore          4
								l = base64variant.decodeBase64Char(c);
	//   99  190:aload_1         
	//  100  191:iload           4
	//  101  193:invokevirtual   #428 <Method int Base64Variant.decodeBase64Char(char)>
	//  102  196:istore          7
								i = l;
	//  103  198:iload           7
	//  104  200:istore          5
								if(l < 0)
	//* 105  202:iload           7
	//* 106  204:ifge            217
									i = _decodeBase64Escape(base64variant, c, 1);
	//  107  207:aload_0         
	//  108  208:aload_1         
	//  109  209:iload           4
	//  110  211:iconst_1        
	//  111  212:invokevirtual   #438 <Method int _decodeBase64Escape(Base64Variant, char, int)>
	//  112  215:istore          5
								l1 = j1 << 6 | i;
	//  113  217:iload           9
	//  114  219:bipush          6
	//  115  221:ishl            
	//  116  222:iload           5
	//  117  224:ior             
	//  118  225:istore          11
								if(_inputPtr >= _inputEnd)
	//* 119  227:aload_0         
	//* 120  228:getfield        #52  <Field int _inputPtr>
	//* 121  231:aload_0         
	//* 122  232:getfield        #55  <Field int _inputEnd>
	//* 123  235:icmplt          242
									_loadMoreGuaranteed();
	//  124  238:aload_0         
	//  125  239:invokevirtual   #422 <Method void _loadMoreGuaranteed()>
								ac1 = _inputBuffer;
	//  126  242:aload_0         
	//  127  243:getfield        #49  <Field char[] _inputBuffer>
	//  128  246:astore          12
								i = _inputPtr;
	//  129  248:aload_0         
	//  130  249:getfield        #52  <Field int _inputPtr>
	//  131  252:istore          5
								_inputPtr = i + 1;
	//  132  254:aload_0         
	//  133  255:iload           5
	//  134  257:iconst_1        
	//  135  258:iadd            
	//  136  259:putfield        #52  <Field int _inputPtr>
								c = ac1[i];
	//  137  262:aload           12
	//  138  264:iload           5
	//  139  266:caload          
	//  140  267:istore          4
								l = base64variant.decodeBase64Char(c);
	//  141  269:aload_1         
	//  142  270:iload           4
	//  143  272:invokevirtual   #428 <Method int Base64Variant.decodeBase64Char(char)>
	//  144  275:istore          7
								j1 = l;
	//  145  277:iload           7
	//  146  279:istore          9
								if(l < 0)
	//* 147  281:iload           7
	//* 148  283:ifge            465
								{
									i = l;
	//  149  286:iload           7
	//  150  288:istore          5
									if(l != -2)
	//* 151  290:iload           7
	//* 152  292:bipush          -2
	//* 153  294:icmpeq          339
									{
										if(c == '"' && !base64variant.usesPadding())
	//* 154  297:iload           4
	//* 155  299:bipush          34
	//* 156  301:icmpne          329
	//* 157  304:aload_1         
	//* 158  305:invokevirtual   #441 <Method boolean Base64Variant.usesPadding()>
	//* 159  308:ifne            329
										{
											abyte0[i1] = (byte)(l1 >> 4);
	//  160  311:aload_3         
	//  161  312:iload           8
	//  162  314:iload           11
	//  163  316:iconst_4        
	//  164  317:ishr            
	//  165  318:int2byte        
	//  166  319:bastore         
											i = i1 + 1;
	//  167  320:iload           8
	//  168  322:iconst_1        
	//  169  323:iadd            
	//  170  324:istore          5
											break label4;
	//  171  326:goto            594
										}
										i = _decodeBase64Escape(base64variant, c, 2);
	//  172  329:aload_0         
	//  173  330:aload_1         
	//  174  331:iload           4
	//  175  333:iconst_2        
	//  176  334:invokevirtual   #438 <Method int _decodeBase64Escape(Base64Variant, char, int)>
	//  177  337:istore          5
									}
									j1 = i;
	//  178  339:iload           5
	//  179  341:istore          9
									if(i == -2)
	//* 180  343:iload           5
	//* 181  345:bipush          -2
	//* 182  347:icmpne          465
									{
										if(_inputPtr >= _inputEnd)
	//* 183  350:aload_0         
	//* 184  351:getfield        #52  <Field int _inputPtr>
	//* 185  354:aload_0         
	//* 186  355:getfield        #55  <Field int _inputEnd>
	//* 187  358:icmplt          365
											_loadMoreGuaranteed();
	//  188  361:aload_0         
	//  189  362:invokevirtual   #422 <Method void _loadMoreGuaranteed()>
										ac1 = _inputBuffer;
	//  190  365:aload_0         
	//  191  366:getfield        #49  <Field char[] _inputBuffer>
	//  192  369:astore          12
										i = _inputPtr;
	//  193  371:aload_0         
	//  194  372:getfield        #52  <Field int _inputPtr>
	//  195  375:istore          5
										_inputPtr = i + 1;
	//  196  377:aload_0         
	//  197  378:iload           5
	//  198  380:iconst_1        
	//  199  381:iadd            
	//  200  382:putfield        #52  <Field int _inputPtr>
										c = ac1[i];
	//  201  385:aload           12
	//  202  387:iload           5
	//  203  389:caload          
	//  204  390:istore          4
										if(!base64variant.usesPaddingChar(c))
	//* 205  392:aload_1         
	//* 206  393:iload           4
	//* 207  395:invokevirtual   #446 <Method boolean Base64Variant.usesPaddingChar(char)>
	//* 208  398:ifne            447
										{
											outputstream = ((OutputStream) (new StringBuilder()));
	//  209  401:new             #286 <Class StringBuilder>
	//  210  404:dup             
	//  211  405:invokespecial   #288 <Method void StringBuilder()>
	//  212  408:astore_2        
											((StringBuilder) (outputstream)).append("expected padding character '");
	//  213  409:aload_2         
	//  214  410:ldc2            #448 <String "expected padding character '">
	//  215  413:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//  216  416:pop             
											((StringBuilder) (outputstream)).append(base64variant.getPaddingChar());
	//  217  417:aload_2         
	//  218  418:aload_1         
	//  219  419:invokevirtual   #451 <Method char Base64Variant.getPaddingChar()>
	//  220  422:invokevirtual   #454 <Method StringBuilder StringBuilder.append(char)>
	//  221  425:pop             
											((StringBuilder) (outputstream)).append("'");
	//  222  426:aload_2         
	//  223  427:ldc2            #456 <String "'">
	//  224  430:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//  225  433:pop             
											throw reportInvalidBase64Char(base64variant, ((int) (c)), 3, ((StringBuilder) (outputstream)).toString());
	//  226  434:aload_0         
	//  227  435:aload_1         
	//  228  436:iload           4
	//  229  438:iconst_3        
	//  230  439:aload_2         
	//  231  440:invokevirtual   #303 <Method String StringBuilder.toString()>
	//  232  443:invokevirtual   #460 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int, String)>
	//  233  446:athrow          
										}
										i = i1 + 1;
	//  234  447:iload           8
	//  235  449:iconst_1        
	//  236  450:iadd            
	//  237  451:istore          5
										abyte0[i1] = (byte)(l1 >> 4);
	//  238  453:aload_3         
	//  239  454:iload           8
	//  240  456:iload           11
	//  241  458:iconst_4        
	//  242  459:ishr            
	//  243  460:int2byte        
	//  244  461:bastore         
										break label0;
	//  245  462:goto            744
									}
								}
								l1 = l1 << 6 | j1;
	//  246  465:iload           11
	//  247  467:bipush          6
	//  248  469:ishl            
	//  249  470:iload           9
	//  250  472:ior             
	//  251  473:istore          11
								if(_inputPtr >= _inputEnd)
	//* 252  475:aload_0         
	//* 253  476:getfield        #52  <Field int _inputPtr>
	//* 254  479:aload_0         
	//* 255  480:getfield        #55  <Field int _inputEnd>
	//* 256  483:icmplt          490
									_loadMoreGuaranteed();
	//  257  486:aload_0         
	//  258  487:invokevirtual   #422 <Method void _loadMoreGuaranteed()>
								ac1 = _inputBuffer;
	//  259  490:aload_0         
	//  260  491:getfield        #49  <Field char[] _inputBuffer>
	//  261  494:astore          12
								i = _inputPtr;
	//  262  496:aload_0         
	//  263  497:getfield        #52  <Field int _inputPtr>
	//  264  500:istore          5
								_inputPtr = i + 1;
	//  265  502:aload_0         
	//  266  503:iload           5
	//  267  505:iconst_1        
	//  268  506:iadd            
	//  269  507:putfield        #52  <Field int _inputPtr>
								c = ac1[i];
	//  270  510:aload           12
	//  271  512:iload           5
	//  272  514:caload          
	//  273  515:istore          4
								l = base64variant.decodeBase64Char(c);
	//  274  517:aload_1         
	//  275  518:iload           4
	//  276  520:invokevirtual   #428 <Method int Base64Variant.decodeBase64Char(char)>
	//  277  523:istore          7
								j1 = l;
	//  278  525:iload           7
	//  279  527:istore          9
								if(l >= 0)
									break label1;
	//  280  529:iload           7
	//  281  531:ifge            689
								i = l;
	//  282  534:iload           7
	//  283  536:istore          5
								if(l == -2)
									break label2;
	//  284  538:iload           7
	//  285  540:bipush          -2
	//  286  542:icmpeq          636
								if(c != '"' || base64variant.usesPadding())
									break label3;
	//  287  545:iload           4
	//  288  547:bipush          34
	//  289  549:icmpne          626
	//  290  552:aload_1         
	//  291  553:invokevirtual   #441 <Method boolean Base64Variant.usesPadding()>
	//  292  556:ifne            626
								l = l1 >> 2;
	//  293  559:iload           11
	//  294  561:iconst_2        
	//  295  562:ishr            
	//  296  563:istore          7
								j1 = i1 + 1;
	//  297  565:iload           8
	//  298  567:iconst_1        
	//  299  568:iadd            
	//  300  569:istore          9
								abyte0[i1] = (byte)(l >> 8);
	//  301  571:aload_3         
	//  302  572:iload           8
	//  303  574:iload           7
	//  304  576:bipush          8
	//  305  578:ishr            
	//  306  579:int2byte        
	//  307  580:bastore         
								i = j1 + 1;
	//  308  581:iload           9
	//  309  583:iconst_1        
	//  310  584:iadd            
	//  311  585:istore          5
								abyte0[j1] = (byte)l;
	//  312  587:aload_3         
	//  313  588:iload           9
	//  314  590:iload           7
	//  315  592:int2byte        
	//  316  593:bastore         
							}
							_tokenIncomplete = false;
	//  317  594:aload_0         
	//  318  595:iconst_0        
	//  319  596:putfield        #175 <Field boolean _tokenIncomplete>
							l = k;
	//  320  599:iload           6
	//  321  601:istore          7
							if(i > 0)
	//* 322  603:iload           5
	//* 323  605:ifle            623
							{
								l = k + i;
	//  324  608:iload           6
	//  325  610:iload           5
	//  326  612:iadd            
	//  327  613:istore          7
								outputstream.write(abyte0, 0, i);
	//  328  615:aload_2         
	//  329  616:aload_3         
	//  330  617:iconst_0        
	//  331  618:iload           5
	//  332  620:invokevirtual   #651 <Method void OutputStream.write(byte[], int, int)>
							}
							return l;
	//  333  623:iload           7
	//  334  625:ireturn         
						}
						i = _decodeBase64Escape(base64variant, c, 3);
	//  335  626:aload_0         
	//  336  627:aload_1         
	//  337  628:iload           4
	//  338  630:iconst_3        
	//  339  631:invokevirtual   #438 <Method int _decodeBase64Escape(Base64Variant, char, int)>
	//  340  634:istore          5
					}
					j1 = i;
	//  341  636:iload           5
	//  342  638:istore          9
					if(i == -2)
	//* 343  640:iload           5
	//* 344  642:bipush          -2
	//* 345  644:icmpne          689
					{
						l = l1 >> 2;
	//  346  647:iload           11
	//  347  649:iconst_2        
	//  348  650:ishr            
	//  349  651:istore          7
						j1 = i1 + 1;
	//  350  653:iload           8
	//  351  655:iconst_1        
	//  352  656:iadd            
	//  353  657:istore          9
						abyte0[i1] = (byte)(l >> 8);
	//  354  659:aload_3         
	//  355  660:iload           8
	//  356  662:iload           7
	//  357  664:bipush          8
	//  358  666:ishr            
	//  359  667:int2byte        
	//  360  668:bastore         
						i = j1 + 1;
	//  361  669:iload           9
	//  362  671:iconst_1        
	//  363  672:iadd            
	//  364  673:istore          5
						abyte0[j1] = (byte)l;
	//  365  675:aload_3         
	//  366  676:iload           9
	//  367  678:iload           7
	//  368  680:int2byte        
	//  369  681:bastore         
						l = k;
	//  370  682:iload           6
	//  371  684:istore          7
						continue;
	//  372  686:goto            11
					}
				}
				l = l1 << 6 | j1;
	//  373  689:iload           11
	//  374  691:bipush          6
	//  375  693:ishl            
	//  376  694:iload           9
	//  377  696:ior             
	//  378  697:istore          7
				i = i1 + 1;
	//  379  699:iload           8
	//  380  701:iconst_1        
	//  381  702:iadd            
	//  382  703:istore          5
				abyte0[i1] = (byte)(l >> 16);
	//  383  705:aload_3         
	//  384  706:iload           8
	//  385  708:iload           7
	//  386  710:bipush          16
	//  387  712:ishr            
	//  388  713:int2byte        
	//  389  714:bastore         
				i1 = i + 1;
	//  390  715:iload           5
	//  391  717:iconst_1        
	//  392  718:iadd            
	//  393  719:istore          8
				abyte0[i] = (byte)(l >> 8);
	//  394  721:aload_3         
	//  395  722:iload           5
	//  396  724:iload           7
	//  397  726:bipush          8
	//  398  728:ishr            
	//  399  729:int2byte        
	//  400  730:bastore         
				i = i1 + 1;
	//  401  731:iload           8
	//  402  733:iconst_1        
	//  403  734:iadd            
	//  404  735:istore          5
				abyte0[i1] = (byte)l;
	//  405  737:aload_3         
	//  406  738:iload           8
	//  407  740:iload           7
	//  408  742:int2byte        
	//  409  743:bastore         
			}
			l = k;
	//  410  744:iload           6
	//  411  746:istore          7
		} while(true);
	//  412  748:goto            11
	}

	protected void _releaseBuffers()
		throws IOException
	{
		super._releaseBuffers();
	//    0    0:aload_0         
	//    1    1:invokespecial   #654 <Method void ParserBase._releaseBuffers()>
		_symbols.release();
	//    2    4:aload_0         
	//    3    5:getfield        #59  <Field CharsToNameCanonicalizer _symbols>
	//    4    8:invokevirtual   #657 <Method void CharsToNameCanonicalizer.release()>
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
	//   17   33:getfield        #402 <Field IOContext _ioContext>
	//   18   36:aload_1         
	//   19   37:invokevirtual   #661 <Method void IOContext.releaseTokenBuffer(char[])>
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
	//    2    2:ldc2            #663 <String "'null', 'true', 'false' or NaN">
	//    3    5:invokevirtual   #582 <Method void _reportInvalidToken(String, String)>
	//    4    8:return          
	}

	protected void _reportInvalidToken(String s, String s1)
		throws IOException
	{
		s = ((String) (new StringBuilder(s)));
	//    0    0:new             #286 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #664 <Method void StringBuilder(String)>
	//    4    8:astore_1        
		do
		{
			if(((StringBuilder) (s)).length() >= 256 || _inputPtr >= _inputEnd && !_loadMore())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #665 <Method int StringBuilder.length()>
	//*   7   13:sipush          256
	//*   8   16:icmpge          79
	//*   9   19:aload_0         
	//*  10   20:getfield        #52  <Field int _inputPtr>
	//*  11   23:aload_0         
	//*  12   24:getfield        #55  <Field int _inputEnd>
	//*  13   27:icmplt          40
	//*  14   30:aload_0         
	//*  15   31:invokevirtual   #94  <Method boolean _loadMore()>
	//*  16   34:ifne            40
				break;
	//   17   37:goto            79
			char c = _inputBuffer[_inputPtr];
	//   18   40:aload_0         
	//   19   41:getfield        #49  <Field char[] _inputBuffer>
	//   20   44:aload_0         
	//   21   45:getfield        #52  <Field int _inputPtr>
	//   22   48:caload          
	//   23   49:istore_3        
			if(!Character.isJavaIdentifierPart(c))
	//*  24   50:iload_3         
	//*  25   51:invokestatic    #100 <Method boolean Character.isJavaIdentifierPart(char)>
	//*  26   54:ifne            60
				break;
	//   27   57:goto            79
			_inputPtr = _inputPtr + 1;
	//   28   60:aload_0         
	//   29   61:aload_0         
	//   30   62:getfield        #52  <Field int _inputPtr>
	//   31   65:iconst_1        
	//   32   66:iadd            
	//   33   67:putfield        #52  <Field int _inputPtr>
			((StringBuilder) (s)).append(c);
	//   34   70:aload_1         
	//   35   71:iload_3         
	//   36   72:invokevirtual   #454 <Method StringBuilder StringBuilder.append(char)>
	//   37   75:pop             
		} while(true);
	//   38   76:goto            9
		if(((StringBuilder) (s)).length() == 256)
	//*  39   79:aload_1         
	//*  40   80:invokevirtual   #665 <Method int StringBuilder.length()>
	//*  41   83:sipush          256
	//*  42   86:icmpne          97
			((StringBuilder) (s)).append("...");
	//   43   89:aload_1         
	//   44   90:ldc2            #667 <String "...">
	//   45   93:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   46   96:pop             
		StringBuilder stringbuilder = new StringBuilder();
	//   47   97:new             #286 <Class StringBuilder>
	//   48  100:dup             
	//   49  101:invokespecial   #288 <Method void StringBuilder()>
	//   50  104:astore          4
		stringbuilder.append("Unrecognized token '");
	//   51  106:aload           4
	//   52  108:ldc2            #669 <String "Unrecognized token '">
	//   53  111:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   54  114:pop             
		stringbuilder.append(((StringBuilder) (s)).toString());
	//   55  115:aload           4
	//   56  117:aload_1         
	//   57  118:invokevirtual   #303 <Method String StringBuilder.toString()>
	//   58  121:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   59  124:pop             
		stringbuilder.append("': was expecting ");
	//   60  125:aload           4
	//   61  127:ldc2            #671 <String "': was expecting ">
	//   62  130:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   63  133:pop             
		stringbuilder.append(s1);
	//   64  134:aload           4
	//   65  136:aload_2         
	//   66  137:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   67  140:pop             
		_reportError(stringbuilder.toString());
	//   68  141:aload_0         
	//   69  142:aload           4
	//   70  144:invokevirtual   #303 <Method String StringBuilder.toString()>
	//   71  147:invokevirtual   #529 <Method void _reportError(String)>
	//   72  150:return          
	}

	protected final void _skipCR()
		throws IOException
	{
		if((_inputPtr < _inputEnd || _loadMore()) && _inputBuffer[_inputPtr] == '\n')
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #55  <Field int _inputEnd>
	//*   4    8:icmplt          18
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #94  <Method boolean _loadMore()>
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
	//   23   44:getfield        #316 <Field int _currInputRow>
	//   24   47:iconst_1        
	//   25   48:iadd            
	//   26   49:putfield        #316 <Field int _currInputRow>
		_currInputRowStart = _inputPtr;
	//   27   52:aload_0         
	//   28   53:aload_0         
	//   29   54:getfield        #52  <Field int _inputPtr>
	//   30   57:putfield        #319 <Field int _currInputRowStart>
	//   31   60:return          
	}

	protected final void _skipString()
		throws IOException
	{
		_tokenIncomplete = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #175 <Field boolean _tokenIncomplete>
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
			int l = i;
	//   12   21:iload_1         
	//   13   22:istore          4
			int k = j;
	//   14   24:iload_2         
	//   15   25:istore_3        
			if(i >= j)
	//*  16   26:iload_1         
	//*  17   27:iload_2         
	//*  18   28:icmplt          64
			{
				_inputPtr = i;
	//   19   31:aload_0         
	//   20   32:iload_1         
	//   21   33:putfield        #52  <Field int _inputPtr>
				if(!_loadMore())
	//*  22   36:aload_0         
	//*  23   37:invokevirtual   #94  <Method boolean _loadMore()>
	//*  24   40:ifne            53
					_reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
	//   25   43:aload_0         
	//   26   44:ldc2            #486 <String ": was expecting closing quote for a string value">
	//   27   47:getstatic       #178 <Field JsonToken JsonToken.VALUE_STRING>
	//   28   50:invokevirtual   #247 <Method void _reportInvalidEOF(String, JsonToken)>
				l = _inputPtr;
	//   29   53:aload_0         
	//   30   54:getfield        #52  <Field int _inputPtr>
	//   31   57:istore          4
				k = _inputEnd;
	//   32   59:aload_0         
	//   33   60:getfield        #55  <Field int _inputEnd>
	//   34   63:istore_3        
			}
			i = l + 1;
	//   35   64:iload           4
	//   36   66:iconst_1        
	//   37   67:iadd            
	//   38   68:istore_1        
			j = ((int) (ac[l]));
	//   39   69:aload           5
	//   40   71:iload           4
	//   41   73:caload          
	//   42   74:istore_2        
			if(j <= '\\')
	//*  43   75:iload_2         
	//*  44   76:bipush          92
	//*  45   78:icmpgt          147
			{
				if(j == '\\')
	//*  46   81:iload_2         
	//*  47   82:bipush          92
	//*  48   84:icmpne          110
				{
					_inputPtr = i;
	//   49   87:aload_0         
	//   50   88:iload_1         
	//   51   89:putfield        #52  <Field int _inputPtr>
					_decodeEscaped();
	//   52   92:aload_0         
	//   53   93:invokevirtual   #251 <Method char _decodeEscaped()>
	//   54   96:pop             
					i = _inputPtr;
	//   55   97:aload_0         
	//   56   98:getfield        #52  <Field int _inputPtr>
	//   57  101:istore_1        
					j = _inputEnd;
	//   58  102:aload_0         
	//   59  103:getfield        #55  <Field int _inputEnd>
	//   60  106:istore_2        
					continue;
	//   61  107:goto            21
				}
				if(j <= 34)
	//*  62  110:iload_2         
	//*  63  111:bipush          34
	//*  64  113:icmpgt          147
				{
					if(j == 34)
	//*  65  116:iload_2         
	//*  66  117:bipush          34
	//*  67  119:icmpne          128
					{
						_inputPtr = i;
	//   68  122:aload_0         
	//   69  123:iload_1         
	//   70  124:putfield        #52  <Field int _inputPtr>
						return;
	//   71  127:return          
					}
					if(j < 32)
	//*  72  128:iload_2         
	//*  73  129:bipush          32
	//*  74  131:icmpge          147
					{
						_inputPtr = i;
	//   75  134:aload_0         
	//   76  135:iload_1         
	//   77  136:putfield        #52  <Field int _inputPtr>
						_throwUnquotedSpace(j, "string value");
	//   78  139:aload_0         
	//   79  140:iload_2         
	//   80  141:ldc2            #488 <String "string value">
	//   81  144:invokevirtual   #256 <Method void _throwUnquotedSpace(int, String)>
					}
				}
			}
			j = k;
	//   82  147:iload_3         
	//   83  148:istore_2        
		} while(true);
	//   84  149:goto            21
	}

	public void finishToken()
		throws IOException
	{
		if(_tokenIncomplete)
	//*   0    0:aload_0         
	//*   1    1:getfield        #175 <Field boolean _tokenIncomplete>
	//*   2    4:ifeq            16
		{
			_tokenIncomplete = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #175 <Field boolean _tokenIncomplete>
			_finishString();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #675 <Method void _finishString()>
		}
	//    8   16:return          
	}

	public byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException
	{
		if(_currToken != JsonToken.VALUE_STRING && (_currToken != JsonToken.VALUE_EMBEDDED_OBJECT || _binaryValue == null))
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field JsonToken _currToken>
	//*   2    4:getstatic       #178 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpeq       68
	//*   4   10:aload_0         
	//*   5   11:getfield        #131 <Field JsonToken _currToken>
	//*   6   14:getstatic       #681 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//*   7   17:if_acmpne       27
	//*   8   20:aload_0         
	//*   9   21:getfield        #685 <Field byte[] _binaryValue>
	//*  10   24:ifnonnull       68
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   27:new             #286 <Class StringBuilder>
	//   12   30:dup             
	//   13   31:invokespecial   #288 <Method void StringBuilder()>
	//   14   34:astore_2        
			stringbuilder.append("Current token (");
	//   15   35:aload_2         
	//   16   36:ldc2            #687 <String "Current token (">
	//   17   39:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   18   42:pop             
			stringbuilder.append(((Object) (_currToken)));
	//   19   43:aload_2         
	//   20   44:aload_0         
	//   21   45:getfield        #131 <Field JsonToken _currToken>
	//   22   48:invokevirtual   #690 <Method StringBuilder StringBuilder.append(Object)>
	//   23   51:pop             
			stringbuilder.append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
	//   24   52:aload_2         
	//   25   53:ldc2            #692 <String ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary">
	//   26   56:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   27   59:pop             
			_reportError(stringbuilder.toString());
	//   28   60:aload_0         
	//   29   61:aload_2         
	//   30   62:invokevirtual   #303 <Method String StringBuilder.toString()>
	//   31   65:invokevirtual   #529 <Method void _reportError(String)>
		}
		if(_tokenIncomplete)
	//*  32   68:aload_0         
	//*  33   69:getfield        #175 <Field boolean _tokenIncomplete>
	//*  34   72:ifeq            141
		{
			try
			{
				_binaryValue = _decodeBase64(base64variant);
	//   35   75:aload_0         
	//   36   76:aload_0         
	//   37   77:aload_1         
	//   38   78:invokevirtual   #694 <Method byte[] _decodeBase64(Base64Variant)>
	//   39   81:putfield        #685 <Field byte[] _binaryValue>
			}
	//*  40   84:aload_0         
	//*  41   85:iconst_0        
	//*  42   86:putfield        #175 <Field boolean _tokenIncomplete>
	//*  43   89:goto            171
			catch(IllegalArgumentException illegalargumentexception)
	//*  44   92:astore_2        
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   45   93:new             #286 <Class StringBuilder>
	//   46   96:dup             
	//   47   97:invokespecial   #288 <Method void StringBuilder()>
	//   48  100:astore_3        
				stringbuilder1.append("Failed to decode VALUE_STRING as base64 (");
	//   49  101:aload_3         
	//   50  102:ldc2            #696 <String "Failed to decode VALUE_STRING as base64 (">
	//   51  105:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   52  108:pop             
				stringbuilder1.append(((Object) (base64variant)));
	//   53  109:aload_3         
	//   54  110:aload_1         
	//   55  111:invokevirtual   #690 <Method StringBuilder StringBuilder.append(Object)>
	//   56  114:pop             
				stringbuilder1.append("): ");
	//   57  115:aload_3         
	//   58  116:ldc2            #698 <String "): ">
	//   59  119:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   60  122:pop             
				stringbuilder1.append(illegalargumentexception.getMessage());
	//   61  123:aload_3         
	//   62  124:aload_2         
	//   63  125:invokevirtual   #701 <Method String IllegalArgumentException.getMessage()>
	//   64  128:invokevirtual   #294 <Method StringBuilder StringBuilder.append(String)>
	//   65  131:pop             
				throw _constructError(stringbuilder1.toString());
	//   66  132:aload_0         
	//   67  133:aload_3         
	//   68  134:invokevirtual   #303 <Method String StringBuilder.toString()>
	//   69  137:invokevirtual   #307 <Method com.fasterxml.jackson.core.JsonParseException _constructError(String)>
	//   70  140:athrow          
			}
			_tokenIncomplete = false;
		} else
		if(_binaryValue == null)
	//*  71  141:aload_0         
	//*  72  142:getfield        #685 <Field byte[] _binaryValue>
	//*  73  145:ifnonnull       171
		{
			ByteArrayBuilder bytearraybuilder = _getByteArrayBuilder();
	//   74  148:aload_0         
	//   75  149:invokevirtual   #419 <Method ByteArrayBuilder _getByteArrayBuilder()>
	//   76  152:astore_2        
			_decodeBase64(getText(), bytearraybuilder, base64variant);
	//   77  153:aload_0         
	//   78  154:aload_0         
	//   79  155:invokevirtual   #704 <Method String getText()>
	//   80  158:aload_2         
	//   81  159:aload_1         
	//   82  160:invokevirtual   #707 <Method void _decodeBase64(String, ByteArrayBuilder, Base64Variant)>
			_binaryValue = bytearraybuilder.toByteArray();
	//   83  163:aload_0         
	//   84  164:aload_2         
	//   85  165:invokevirtual   #434 <Method byte[] ByteArrayBuilder.toByteArray()>
	//   86  168:putfield        #685 <Field byte[] _binaryValue>
		}
		return _binaryValue;
	//   87  171:aload_0         
	//   88  172:getfield        #685 <Field byte[] _binaryValue>
	//   89  175:areturn         
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
	//    4    6:getfield        #319 <Field int _currInputRowStart>
	//    5    9:istore_2        
		return new JsonLocation(_ioContext.getSourceReference(), -1L, _currInputProcessed + (long)_inputPtr, _currInputRow, (i - j) + 1);
	//    6   10:new             #713 <Class JsonLocation>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #402 <Field IOContext _ioContext>
	//   10   18:invokevirtual   #717 <Method Object IOContext.getSourceReference()>
	//   11   21:ldc2w           #718 <Long -1L>
	//   12   24:aload_0         
	//   13   25:getfield        #372 <Field long _currInputProcessed>
	//   14   28:aload_0         
	//   15   29:getfield        #52  <Field int _inputPtr>
	//   16   32:i2l             
	//   17   33:ladd            
	//   18   34:aload_0         
	//   19   35:getfield        #316 <Field int _currInputRow>
	//   20   38:iload_1         
	//   21   39:iload_2         
	//   22   40:isub            
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:invokespecial   #722 <Method void JsonLocation(Object, long, long, int, int)>
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
		return getNextChar(s, ((JsonToken) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #268 <Method char getNextChar(String, JsonToken)>
	//    4    6:ireturn         
	}

	protected char getNextChar(String s, JsonToken jsontoken)
		throws IOException
	{
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #55  <Field int _inputEnd>
	//*   4    8:icmplt          24
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #94  <Method boolean _loadMore()>
	//*   7   15:ifne            24
			_reportInvalidEOF(s, jsontoken);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #247 <Method void _reportInvalidEOF(String, JsonToken)>
		s = ((String) (_inputBuffer));
	//   12   24:aload_0         
	//   13   25:getfield        #49  <Field char[] _inputBuffer>
	//   14   28:astore_1        
		int i = _inputPtr;
	//   15   29:aload_0         
	//   16   30:getfield        #52  <Field int _inputPtr>
	//   17   33:istore_3        
		_inputPtr = i + 1;
	//   18   34:aload_0         
	//   19   35:iload_3         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:putfield        #52  <Field int _inputPtr>
		return s[i];
	//   23   41:aload_1         
	//   24   42:iload_3         
	//   25   43:caload          
	//   26   44:ireturn         
	}

	public int getText(Writer writer)
		throws IOException
	{
		Object obj = ((Object) (_currToken));
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field JsonToken _currToken>
	//    2    4:astore_2        
		if(obj == JsonToken.VALUE_STRING)
	//*   3    5:aload_2         
	//*   4    6:getstatic       #178 <Field JsonToken JsonToken.VALUE_STRING>
	//*   5    9:if_acmpne       37
		{
			if(_tokenIncomplete)
	//*   6   12:aload_0         
	//*   7   13:getfield        #175 <Field boolean _tokenIncomplete>
	//*   8   16:ifeq            28
			{
				_tokenIncomplete = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #175 <Field boolean _tokenIncomplete>
				_finishString();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #675 <Method void _finishString()>
			}
			return _textBuffer.contentsToWriter(writer);
	//   14   28:aload_0         
	//   15   29:getfield        #78  <Field TextBuffer _textBuffer>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #729 <Method int TextBuffer.contentsToWriter(Writer)>
	//   18   36:ireturn         
		}
		if(obj == JsonToken.FIELD_NAME)
	//*  19   37:aload_2         
	//*  20   38:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//*  21   41:if_acmpne       62
		{
			obj = ((Object) (_parsingContext.getCurrentName()));
	//   22   44:aload_0         
	//   23   45:getfield        #189 <Field JsonReadContext _parsingContext>
	//   24   48:invokevirtual   #502 <Method String JsonReadContext.getCurrentName()>
	//   25   51:astore_2        
			writer.write(((String) (obj)));
	//   26   52:aload_1         
	//   27   53:aload_2         
	//   28   54:invokevirtual   #733 <Method void Writer.write(String)>
			return ((String) (obj)).length();
	//   29   57:aload_2         
	//   30   58:invokevirtual   #626 <Method int String.length()>
	//   31   61:ireturn         
		}
		if(obj != null)
	//*  32   62:aload_2         
	//*  33   63:ifnull          95
		{
			if(((JsonToken) (obj)).isNumeric())
	//*  34   66:aload_2         
	//*  35   67:invokevirtual   #736 <Method boolean JsonToken.isNumeric()>
	//*  36   70:ifeq            82
			{
				return _textBuffer.contentsToWriter(writer);
	//   37   73:aload_0         
	//   38   74:getfield        #78  <Field TextBuffer _textBuffer>
	//   39   77:aload_1         
	//   40   78:invokevirtual   #729 <Method int TextBuffer.contentsToWriter(Writer)>
	//   41   81:ireturn         
			} else
			{
				char ac[] = ((JsonToken) (obj)).asCharArray();
	//   42   82:aload_2         
	//   43   83:invokevirtual   #739 <Method char[] JsonToken.asCharArray()>
	//   44   86:astore_2        
				writer.write(ac);
	//   45   87:aload_1         
	//   46   88:aload_2         
	//   47   89:invokevirtual   #741 <Method void Writer.write(char[])>
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

	public final String getText()
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field JsonToken _currToken>
	//    2    4:astore_1        
		if(jsontoken == JsonToken.VALUE_STRING)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #178 <Field JsonToken JsonToken.VALUE_STRING>
	//*   5    9:if_acmpne       36
		{
			if(_tokenIncomplete)
	//*   6   12:aload_0         
	//*   7   13:getfield        #175 <Field boolean _tokenIncomplete>
	//*   8   16:ifeq            28
			{
				_tokenIncomplete = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #175 <Field boolean _tokenIncomplete>
				_finishString();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #675 <Method void _finishString()>
			}
			return _textBuffer.contentsAsString();
	//   14   28:aload_0         
	//   15   29:getfield        #78  <Field TextBuffer _textBuffer>
	//   16   32:invokevirtual   #499 <Method String TextBuffer.contentsAsString()>
	//   17   35:areturn         
		} else
		{
			return _getText2(jsontoken);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #743 <Method String _getText2(JsonToken)>
	//   21   41:areturn         
		}
	}

	public final char[] getTextCharacters()
		throws IOException
	{
		if(_currToken != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field JsonToken _currToken>
	//*   2    4:ifnull          155
		{
			switch(_currToken.id())
	//*   3    7:aload_0         
	//*   4    8:getfield        #131 <Field JsonToken _currToken>
	//*   5   11:invokevirtual   #493 <Method int JsonToken.id()>
			{
	//*   6   14:tableswitch     5 8: default 44
	//	               5 76
	//	               6 52
	//	               7 68
	//	               8 68
			default:
				return _currToken.asCharArray();
	//    7   44:aload_0         
	//    8   45:getfield        #131 <Field JsonToken _currToken>
	//    9   48:invokevirtual   #739 <Method char[] JsonToken.asCharArray()>
	//   10   51:areturn         

			case 6: // '\006'
				if(_tokenIncomplete)
	//*  11   52:aload_0         
	//*  12   53:getfield        #175 <Field boolean _tokenIncomplete>
	//*  13   56:ifeq            68
				{
					_tokenIncomplete = false;
	//   14   59:aload_0         
	//   15   60:iconst_0        
	//   16   61:putfield        #175 <Field boolean _tokenIncomplete>
					_finishString();
	//   17   64:aload_0         
	//   18   65:invokevirtual   #675 <Method void _finishString()>
				}
				// fall through

			case 7: // '\007'
			case 8: // '\b'
				return _textBuffer.getTextBuffer();
	//   19   68:aload_0         
	//   20   69:getfield        #78  <Field TextBuffer _textBuffer>
	//   21   72:invokevirtual   #107 <Method char[] TextBuffer.getTextBuffer()>
	//   22   75:areturn         

			case 5: // '\005'
				break;
			}
			if(!_nameCopied)
	//*  23   76:aload_0         
	//*  24   77:getfield        #185 <Field boolean _nameCopied>
	//*  25   80:ifne            150
			{
				String s = _parsingContext.getCurrentName();
	//   26   83:aload_0         
	//   27   84:getfield        #189 <Field JsonReadContext _parsingContext>
	//   28   87:invokevirtual   #502 <Method String JsonReadContext.getCurrentName()>
	//   29   90:astore_2        
				int i = s.length();
	//   30   91:aload_2         
	//   31   92:invokevirtual   #626 <Method int String.length()>
	//   32   95:istore_1        
				if(_nameCopyBuffer == null)
	//*  33   96:aload_0         
	//*  34   97:getfield        #747 <Field char[] _nameCopyBuffer>
	//*  35  100:ifnonnull       118
					_nameCopyBuffer = _ioContext.allocNameCopyBuffer(i);
	//   36  103:aload_0         
	//   37  104:aload_0         
	//   38  105:getfield        #402 <Field IOContext _ioContext>
	//   39  108:iload_1         
	//   40  109:invokevirtual   #751 <Method char[] IOContext.allocNameCopyBuffer(int)>
	//   41  112:putfield        #747 <Field char[] _nameCopyBuffer>
				else
	//*  42  115:goto            134
				if(_nameCopyBuffer.length < i)
	//*  43  118:aload_0         
	//*  44  119:getfield        #747 <Field char[] _nameCopyBuffer>
	//*  45  122:arraylength     
	//*  46  123:iload_1         
	//*  47  124:icmpge          134
					_nameCopyBuffer = new char[i];
	//   48  127:aload_0         
	//   49  128:iload_1         
	//   50  129:newarray        char[]
	//   51  131:putfield        #747 <Field char[] _nameCopyBuffer>
				s.getChars(0, i, _nameCopyBuffer, 0);
	//   52  134:aload_2         
	//   53  135:iconst_0        
	//   54  136:iload_1         
	//   55  137:aload_0         
	//   56  138:getfield        #747 <Field char[] _nameCopyBuffer>
	//   57  141:iconst_0        
	//   58  142:invokevirtual   #755 <Method void String.getChars(int, int, char[], int)>
				_nameCopied = true;
	//   59  145:aload_0         
	//   60  146:iconst_1        
	//   61  147:putfield        #185 <Field boolean _nameCopied>
			}
			return _nameCopyBuffer;
	//   62  150:aload_0         
	//   63  151:getfield        #747 <Field char[] _nameCopyBuffer>
	//   64  154:areturn         
		} else
		{
			return null;
	//   65  155:aconst_null     
	//   66  156:areturn         
		}
	}

	public final int getTextLength()
		throws IOException
	{
		if(_currToken != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field JsonToken _currToken>
	//*   2    4:ifnull          88
			switch(_currToken.id())
	//*   3    7:aload_0         
	//*   4    8:getfield        #131 <Field JsonToken _currToken>
	//*   5   11:invokevirtual   #493 <Method int JsonToken.id()>
			{
	//*   6   14:tableswitch     5 8: default 44
	//	               5 77
	//	               6 53
	//	               7 69
	//	               8 69
			default:
				return _currToken.asCharArray().length;
	//    7   44:aload_0         
	//    8   45:getfield        #131 <Field JsonToken _currToken>
	//    9   48:invokevirtual   #739 <Method char[] JsonToken.asCharArray()>
	//   10   51:arraylength     
	//   11   52:ireturn         

			case 6: // '\006'
				if(_tokenIncomplete)
	//*  12   53:aload_0         
	//*  13   54:getfield        #175 <Field boolean _tokenIncomplete>
	//*  14   57:ifeq            69
				{
					_tokenIncomplete = false;
	//   15   60:aload_0         
	//   16   61:iconst_0        
	//   17   62:putfield        #175 <Field boolean _tokenIncomplete>
					_finishString();
	//   18   65:aload_0         
	//   19   66:invokevirtual   #675 <Method void _finishString()>
				}
				// fall through

			case 7: // '\007'
			case 8: // '\b'
				return _textBuffer.size();
	//   20   69:aload_0         
	//   21   70:getfield        #78  <Field TextBuffer _textBuffer>
	//   22   73:invokevirtual   #113 <Method int TextBuffer.size()>
	//   23   76:ireturn         

			case 5: // '\005'
				return _parsingContext.getCurrentName().length();
	//   24   77:aload_0         
	//   25   78:getfield        #189 <Field JsonReadContext _parsingContext>
	//   26   81:invokevirtual   #502 <Method String JsonReadContext.getCurrentName()>
	//   27   84:invokevirtual   #626 <Method int String.length()>
	//   28   87:ireturn         
			}
		else
			return 0;
	//   29   88:iconst_0        
	//   30   89:ireturn         
	}

	public final int getTextOffset()
		throws IOException
	{
		if(_currToken != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field JsonToken _currToken>
	//*   2    4:ifnull          72
			switch(_currToken.id())
	//*   3    7:aload_0         
	//*   4    8:getfield        #131 <Field JsonToken _currToken>
	//*   5   11:invokevirtual   #493 <Method int JsonToken.id()>
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
	//*  10   47:getfield        #175 <Field boolean _tokenIncomplete>
	//*  11   50:ifeq            62
				{
					_tokenIncomplete = false;
	//   12   53:aload_0         
	//   13   54:iconst_0        
	//   14   55:putfield        #175 <Field boolean _tokenIncomplete>
					_finishString();
	//   15   58:aload_0         
	//   16   59:invokevirtual   #675 <Method void _finishString()>
				}
				// fall through

			case 7: // '\007'
			case 8: // '\b'
				return _textBuffer.getTextOffset();
	//   17   62:aload_0         
	//   18   63:getfield        #78  <Field TextBuffer _textBuffer>
	//   19   66:invokevirtual   #110 <Method int TextBuffer.getTextOffset()>
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
	//    1    1:getfield        #402 <Field IOContext _ioContext>
	//    2    4:invokevirtual   #717 <Method Object IOContext.getSourceReference()>
	//    3    7:astore_1        
		if(_currToken == JsonToken.FIELD_NAME)
	//*   4    8:aload_0         
	//*   5    9:getfield        #131 <Field JsonToken _currToken>
	//*   6   12:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//*   7   15:if_acmpne       49
			return new JsonLocation(obj, -1L, _currInputProcessed + (_nameStartOffset - 1L), _nameStartRow, _nameStartCol);
	//    8   18:new             #713 <Class JsonLocation>
	//    9   21:dup             
	//   10   22:aload_1         
	//   11   23:ldc2w           #718 <Long -1L>
	//   12   26:aload_0         
	//   13   27:getfield        #372 <Field long _currInputProcessed>
	//   14   30:aload_0         
	//   15   31:getfield        #378 <Field long _nameStartOffset>
	//   16   34:lconst_1        
	//   17   35:lsub            
	//   18   36:ladd            
	//   19   37:aload_0         
	//   20   38:getfield        #380 <Field int _nameStartRow>
	//   21   41:aload_0         
	//   22   42:getfield        #382 <Field int _nameStartCol>
	//   23   45:invokespecial   #722 <Method void JsonLocation(Object, long, long, int, int)>
	//   24   48:areturn         
		else
			return new JsonLocation(obj, -1L, _tokenInputTotal - 1L, _tokenInputRow, _tokenInputCol);
	//   25   49:new             #713 <Class JsonLocation>
	//   26   52:dup             
	//   27   53:aload_1         
	//   28   54:ldc2w           #718 <Long -1L>
	//   29   57:aload_0         
	//   30   58:getfield        #375 <Field long _tokenInputTotal>
	//   31   61:lconst_1        
	//   32   62:lsub            
	//   33   63:aload_0         
	//   34   64:getfield        #192 <Field int _tokenInputRow>
	//   35   67:aload_0         
	//   36   68:getfield        #195 <Field int _tokenInputCol>
	//   37   71:invokespecial   #722 <Method void JsonLocation(Object, long, long, int, int)>
	//   38   74:areturn         
	}

	public final String getValueAsString()
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field JsonToken _currToken>
	//*   2    4:getstatic       #178 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       34
		{
			if(_tokenIncomplete)
	//*   4   10:aload_0         
	//*   5   11:getfield        #175 <Field boolean _tokenIncomplete>
	//*   6   14:ifeq            26
			{
				_tokenIncomplete = false;
	//    7   17:aload_0         
	//    8   18:iconst_0        
	//    9   19:putfield        #175 <Field boolean _tokenIncomplete>
				_finishString();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #675 <Method void _finishString()>
			}
			return _textBuffer.contentsAsString();
	//   12   26:aload_0         
	//   13   27:getfield        #78  <Field TextBuffer _textBuffer>
	//   14   30:invokevirtual   #499 <Method String TextBuffer.contentsAsString()>
	//   15   33:areturn         
		}
		if(_currToken == JsonToken.FIELD_NAME)
	//*  16   34:aload_0         
	//*  17   35:getfield        #131 <Field JsonToken _currToken>
	//*  18   38:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//*  19   41:if_acmpne       49
			return getCurrentName();
	//   20   44:aload_0         
	//   21   45:invokevirtual   #759 <Method String getCurrentName()>
	//   22   48:areturn         
		else
			return super.getValueAsString(((String) (null)));
	//   23   49:aload_0         
	//   24   50:aconst_null     
	//   25   51:invokespecial   #762 <Method String ParserBase.getValueAsString(String)>
	//   26   54:areturn         
	}

	public final String getValueAsString(String s)
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field JsonToken _currToken>
	//*   2    4:getstatic       #178 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       34
		{
			if(_tokenIncomplete)
	//*   4   10:aload_0         
	//*   5   11:getfield        #175 <Field boolean _tokenIncomplete>
	//*   6   14:ifeq            26
			{
				_tokenIncomplete = false;
	//    7   17:aload_0         
	//    8   18:iconst_0        
	//    9   19:putfield        #175 <Field boolean _tokenIncomplete>
				_finishString();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #675 <Method void _finishString()>
			}
			return _textBuffer.contentsAsString();
	//   12   26:aload_0         
	//   13   27:getfield        #78  <Field TextBuffer _textBuffer>
	//   14   30:invokevirtual   #499 <Method String TextBuffer.contentsAsString()>
	//   15   33:areturn         
		}
		if(_currToken == JsonToken.FIELD_NAME)
	//*  16   34:aload_0         
	//*  17   35:getfield        #131 <Field JsonToken _currToken>
	//*  18   38:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//*  19   41:if_acmpne       49
			return getCurrentName();
	//   20   44:aload_0         
	//   21   45:invokevirtual   #759 <Method String getCurrentName()>
	//   22   48:areturn         
		else
			return super.getValueAsString(s);
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:invokespecial   #762 <Method String ParserBase.getValueAsString(String)>
	//   26   54:areturn         
	}

	public final Boolean nextBooleanValue()
		throws IOException
	{
		if(_currToken == JsonToken.FIELD_NAME)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field JsonToken _currToken>
	//*   2    4:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:if_acmpne       108
		{
			_nameCopied = false;
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:putfield        #185 <Field boolean _nameCopied>
			JsonToken jsontoken = _nextToken;
	//    7   15:aload_0         
	//    8   16:getfield        #141 <Field JsonToken _nextToken>
	//    9   19:astore_2        
			_nextToken = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #141 <Field JsonToken _nextToken>
			_currToken = jsontoken;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #131 <Field JsonToken _currToken>
			if(jsontoken == JsonToken.VALUE_TRUE)
	//*  16   30:aload_2         
	//*  17   31:getstatic       #156 <Field JsonToken JsonToken.VALUE_TRUE>
	//*  18   34:if_acmpne       41
				return Boolean.TRUE;
	//   19   37:getstatic       #770 <Field Boolean Boolean.TRUE>
	//   20   40:areturn         
			if(jsontoken == JsonToken.VALUE_FALSE)
	//*  21   41:aload_2         
	//*  22   42:getstatic       #166 <Field JsonToken JsonToken.VALUE_FALSE>
	//*  23   45:if_acmpne       52
				return Boolean.FALSE;
	//   24   48:getstatic       #773 <Field Boolean Boolean.FALSE>
	//   25   51:areturn         
			if(jsontoken == JsonToken.START_ARRAY)
	//*  26   52:aload_2         
	//*  27   53:getstatic       #169 <Field JsonToken JsonToken.START_ARRAY>
	//*  28   56:if_acmpne       80
			{
				_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   29   59:aload_0         
	//   30   60:aload_0         
	//   31   61:getfield        #189 <Field JsonReadContext _parsingContext>
	//   32   64:aload_0         
	//   33   65:getfield        #192 <Field int _tokenInputRow>
	//   34   68:aload_0         
	//   35   69:getfield        #195 <Field int _tokenInputCol>
	//   36   72:invokevirtual   #201 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   37   75:putfield        #189 <Field JsonReadContext _parsingContext>
				return null;
	//   38   78:aconst_null     
	//   39   79:areturn         
			}
			if(jsontoken == JsonToken.START_OBJECT)
	//*  40   80:aload_2         
	//*  41   81:getstatic       #147 <Field JsonToken JsonToken.START_OBJECT>
	//*  42   84:if_acmpne       106
				_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   43   87:aload_0         
	//   44   88:aload_0         
	//   45   89:getfield        #189 <Field JsonReadContext _parsingContext>
	//   46   92:aload_0         
	//   47   93:getfield        #192 <Field int _tokenInputRow>
	//   48   96:aload_0         
	//   49   97:getfield        #195 <Field int _tokenInputCol>
	//   50  100:invokevirtual   #204 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   51  103:putfield        #189 <Field JsonReadContext _parsingContext>
			return null;
	//   52  106:aconst_null     
	//   53  107:areturn         
		}
		JsonToken jsontoken1 = nextToken();
	//   54  108:aload_0         
	//   55  109:invokevirtual   #776 <Method JsonToken nextToken()>
	//   56  112:astore_2        
		if(jsontoken1 != null)
	//*  57  113:aload_2         
	//*  58  114:ifnull          142
		{
			int i = jsontoken1.id();
	//   59  117:aload_2         
	//   60  118:invokevirtual   #493 <Method int JsonToken.id()>
	//   61  121:istore_1        
			if(i == 9)
	//*  62  122:iload_1         
	//*  63  123:bipush          9
	//*  64  125:icmpne          132
				return Boolean.TRUE;
	//   65  128:getstatic       #770 <Field Boolean Boolean.TRUE>
	//   66  131:areturn         
			if(i == 10)
	//*  67  132:iload_1         
	//*  68  133:bipush          10
	//*  69  135:icmpne          142
				return Boolean.FALSE;
	//   70  138:getstatic       #773 <Field Boolean Boolean.FALSE>
	//   71  141:areturn         
		}
		return null;
	//   72  142:aconst_null     
	//   73  143:areturn         
	}

	public String nextFieldName()
		throws IOException
	{
		_numTypesValid = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #780 <Field int _numTypesValid>
		if(_currToken == JsonToken.FIELD_NAME)
	//*   3    5:aload_0         
	//*   4    6:getfield        #131 <Field JsonToken _currToken>
	//*   5    9:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//*   6   12:if_acmpne       22
		{
			_nextAfterName();
	//    7   15:aload_0         
	//    8   16:invokespecial   #782 <Method JsonToken _nextAfterName()>
	//    9   19:pop             
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
		}
		if(_tokenIncomplete)
	//*  12   22:aload_0         
	//*  13   23:getfield        #175 <Field boolean _tokenIncomplete>
	//*  14   26:ifeq            33
			_skipString();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #784 <Method void _skipString()>
		int j = _skipWSOrEnd();
	//   17   33:aload_0         
	//   18   34:invokespecial   #786 <Method int _skipWSOrEnd()>
	//   19   37:istore_2        
		if(j < 0)
	//*  20   38:iload_2         
	//*  21   39:ifge            53
		{
			close();
	//   22   42:aload_0         
	//   23   43:invokevirtual   #787 <Method void close()>
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
	//   31   55:putfield        #685 <Field byte[] _binaryValue>
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
	//*  39   72:invokevirtual   #558 <Method boolean JsonReadContext.inArray()>
	//*  40   75:ifne            85
				_reportMismatchedEndMarker(j, '}');
	//   41   78:aload_0         
	//   42   79:iload_2         
	//   43   80:bipush          125
	//   44   82:invokevirtual   #791 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   45   85:aload_0         
	//   46   86:aload_0         
	//   47   87:getfield        #189 <Field JsonReadContext _parsingContext>
	//   48   90:invokevirtual   #795 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   49   93:putfield        #189 <Field JsonReadContext _parsingContext>
			_currToken = JsonToken.END_ARRAY;
	//   50   96:aload_0         
	//   51   97:getstatic       #798 <Field JsonToken JsonToken.END_ARRAY>
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
	//*  62  119:invokevirtual   #801 <Method boolean JsonReadContext.inObject()>
	//*  63  122:ifne            132
				_reportMismatchedEndMarker(j, ']');
	//   64  125:aload_0         
	//   65  126:iload_2         
	//   66  127:bipush          93
	//   67  129:invokevirtual   #791 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   68  132:aload_0         
	//   69  133:aload_0         
	//   70  134:getfield        #189 <Field JsonReadContext _parsingContext>
	//   71  137:invokevirtual   #795 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   72  140:putfield        #189 <Field JsonReadContext _parsingContext>
			_currToken = JsonToken.END_OBJECT;
	//   73  143:aload_0         
	//   74  144:getstatic       #804 <Field JsonToken JsonToken.END_OBJECT>
	//   75  147:putfield        #131 <Field JsonToken _currToken>
			return null;
	//   76  150:aconst_null     
	//   77  151:areturn         
		}
		int i = j;
	//   78  152:iload_2         
	//   79  153:istore_1        
		if(_parsingContext.expectComma())
	//*  80  154:aload_0         
	//*  81  155:getfield        #189 <Field JsonReadContext _parsingContext>
	//*  82  158:invokevirtual   #807 <Method boolean JsonReadContext.expectComma()>
	//*  83  161:ifeq            170
			i = _skipComma(j);
	//   84  164:aload_0         
	//   85  165:iload_2         
	//   86  166:invokespecial   #809 <Method int _skipComma(int)>
	//   87  169:istore_1        
		if(!_parsingContext.inObject())
	//*  88  170:aload_0         
	//*  89  171:getfield        #189 <Field JsonReadContext _parsingContext>
	//*  90  174:invokevirtual   #801 <Method boolean JsonReadContext.inObject()>
	//*  91  177:ifne            192
		{
			_updateLocation();
	//   92  180:aload_0         
	//   93  181:invokespecial   #134 <Method void _updateLocation()>
			_nextTokenNotInObject(i);
	//   94  184:aload_0         
	//   95  185:iload_1         
	//   96  186:invokespecial   #811 <Method JsonToken _nextTokenNotInObject(int)>
	//   97  189:pop             
			return null;
	//   98  190:aconst_null     
	//   99  191:areturn         
		}
		_updateNameLocation();
	//  100  192:aload_0         
	//  101  193:invokespecial   #813 <Method void _updateNameLocation()>
		String s;
		if(i == 34)
	//* 102  196:iload_1         
	//* 103  197:bipush          34
	//* 104  199:icmpne          211
			s = _parseName();
	//  105  202:aload_0         
	//  106  203:invokevirtual   #589 <Method String _parseName()>
	//  107  206:astore          4
		else
	//* 108  208:goto            218
			s = _handleOddName(i);
	//  109  211:aload_0         
	//  110  212:iload_1         
	//  111  213:invokevirtual   #591 <Method String _handleOddName(int)>
	//  112  216:astore          4
		_parsingContext.setCurrentName(s);
	//  113  218:aload_0         
	//  114  219:getfield        #189 <Field JsonReadContext _parsingContext>
	//  115  222:aload           4
	//  116  224:invokevirtual   #594 <Method void JsonReadContext.setCurrentName(String)>
		_currToken = JsonToken.FIELD_NAME;
	//  117  227:aload_0         
	//  118  228:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//  119  231:putfield        #131 <Field JsonToken _currToken>
		i = _skipColon();
	//  120  234:aload_0         
	//  121  235:invokespecial   #596 <Method int _skipColon()>
	//  122  238:istore_1        
		_updateLocation();
	//  123  239:aload_0         
	//  124  240:invokespecial   #134 <Method void _updateLocation()>
		if(i == 34)
	//* 125  243:iload_1         
	//* 126  244:bipush          34
	//* 127  246:icmpne          264
		{
			_tokenIncomplete = true;
	//  128  249:aload_0         
	//  129  250:iconst_1        
	//  130  251:putfield        #175 <Field boolean _tokenIncomplete>
			_nextToken = JsonToken.VALUE_STRING;
	//  131  254:aload_0         
	//  132  255:getstatic       #178 <Field JsonToken JsonToken.VALUE_STRING>
	//  133  258:putfield        #141 <Field JsonToken _nextToken>
			return s;
	//  134  261:aload           4
	//  135  263:areturn         
		}
		JsonToken jsontoken;
		if(i != 45)
	//* 136  264:iload_1         
	//* 137  265:bipush          45
	//* 138  267:icmpeq          421
		{
			if(i != 91)
	//* 139  270:iload_1         
	//* 140  271:bipush          91
	//* 141  273:icmpeq          414
			{
				if(i != 102)
	//* 142  276:iload_1         
	//* 143  277:bipush          102
	//* 144  279:icmpeq          403
				{
					if(i != 110)
	//* 145  282:iload_1         
	//* 146  283:bipush          110
	//* 147  285:icmpeq          392
					{
						if(i != 116)
	//* 148  288:iload_1         
	//* 149  289:bipush          116
	//* 150  291:icmpeq          381
						{
							if(i != 123)
	//* 151  294:iload_1         
	//* 152  295:bipush          123
	//* 153  297:icmpeq          374
								switch(i)
	//* 154  300:iload_1         
								{
	//* 155  301:tableswitch     48 57: default 356
	//	               48 365
	//	               49 365
	//	               50 365
	//	               51 365
	//	               52 365
	//	               53 365
	//	               54 365
	//	               55 365
	//	               56 365
	//	               57 365
								default:
									jsontoken = _handleOddValue(i);
	//  156  356:aload_0         
	//  157  357:iload_1         
	//  158  358:invokevirtual   #138 <Method JsonToken _handleOddValue(int)>
	//  159  361:astore_3        
									break;

	//* 160  362:goto            426
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
	//  161  365:aload_0         
	//  162  366:iload_1         
	//  163  367:invokevirtual   #144 <Method JsonToken _parsePosNumber(int)>
	//  164  370:astore_3        
									break;
								}
							else
	//* 165  371:goto            426
								jsontoken = JsonToken.START_OBJECT;
	//  166  374:getstatic       #147 <Field JsonToken JsonToken.START_OBJECT>
	//  167  377:astore_3        
						} else
	//* 168  378:goto            426
						{
							_matchTrue();
	//  169  381:aload_0         
	//  170  382:invokespecial   #604 <Method void _matchTrue()>
							jsontoken = JsonToken.VALUE_TRUE;
	//  171  385:getstatic       #156 <Field JsonToken JsonToken.VALUE_TRUE>
	//  172  388:astore_3        
						}
					} else
	//* 173  389:goto            426
					{
						_matchNull();
	//  174  392:aload_0         
	//  175  393:invokespecial   #606 <Method void _matchNull()>
						jsontoken = JsonToken.VALUE_NULL;
	//  176  396:getstatic       #161 <Field JsonToken JsonToken.VALUE_NULL>
	//  177  399:astore_3        
					}
				} else
	//* 178  400:goto            426
				{
					_matchFalse();
	//  179  403:aload_0         
	//  180  404:invokespecial   #608 <Method void _matchFalse()>
					jsontoken = JsonToken.VALUE_FALSE;
	//  181  407:getstatic       #166 <Field JsonToken JsonToken.VALUE_FALSE>
	//  182  410:astore_3        
				}
			} else
	//* 183  411:goto            426
			{
				jsontoken = JsonToken.START_ARRAY;
	//  184  414:getstatic       #169 <Field JsonToken JsonToken.START_ARRAY>
	//  185  417:astore_3        
			}
		} else
	//* 186  418:goto            426
		{
			jsontoken = _parseNegNumber();
	//  187  421:aload_0         
	//  188  422:invokevirtual   #173 <Method JsonToken _parseNegNumber()>
	//  189  425:astore_3        
		}
		_nextToken = jsontoken;
	//  190  426:aload_0         
	//  191  427:aload_3         
	//  192  428:putfield        #141 <Field JsonToken _nextToken>
		return s;
	//  193  431:aload           4
	//  194  433:areturn         
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
	//    4    5:putfield        #780 <Field int _numTypesValid>
		if(_currToken == JsonToken.FIELD_NAME)
	//*   5    8:aload_0         
	//*   6    9:getfield        #131 <Field JsonToken _currToken>
	//*   7   12:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//*   8   15:if_acmpne       25
		{
			_nextAfterName();
	//    9   18:aload_0         
	//   10   19:invokespecial   #782 <Method JsonToken _nextAfterName()>
	//   11   22:pop             
			return false;
	//   12   23:iconst_0        
	//   13   24:ireturn         
		}
		if(_tokenIncomplete)
	//*  14   25:aload_0         
	//*  15   26:getfield        #175 <Field boolean _tokenIncomplete>
	//*  16   29:ifeq            36
			_skipString();
	//   17   32:aload_0         
	//   18   33:invokevirtual   #784 <Method void _skipString()>
		int j = _skipWSOrEnd();
	//   19   36:aload_0         
	//   20   37:invokespecial   #786 <Method int _skipWSOrEnd()>
	//   21   40:istore_3        
		if(j < 0)
	//*  22   41:iload_3         
	//*  23   42:ifge            56
		{
			close();
	//   24   45:aload_0         
	//   25   46:invokevirtual   #787 <Method void close()>
			_currToken = null;
	//   26   49:aload_0         
	//   27   50:aconst_null     
	//   28   51:putfield        #131 <Field JsonToken _currToken>
			return false;
	//   29   54:iconst_0        
	//   30   55:ireturn         
		}
		_binaryValue = null;
	//   31   56:aload_0         
	//   32   57:aconst_null     
	//   33   58:putfield        #685 <Field byte[] _binaryValue>
		if(j == 93)
	//*  34   61:iload_3         
	//*  35   62:bipush          93
	//*  36   64:icmpne          108
		{
			_updateLocation();
	//   37   67:aload_0         
	//   38   68:invokespecial   #134 <Method void _updateLocation()>
			if(!_parsingContext.inArray())
	//*  39   71:aload_0         
	//*  40   72:getfield        #189 <Field JsonReadContext _parsingContext>
	//*  41   75:invokevirtual   #558 <Method boolean JsonReadContext.inArray()>
	//*  42   78:ifne            88
				_reportMismatchedEndMarker(j, '}');
	//   43   81:aload_0         
	//   44   82:iload_3         
	//   45   83:bipush          125
	//   46   85:invokevirtual   #791 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   47   88:aload_0         
	//   48   89:aload_0         
	//   49   90:getfield        #189 <Field JsonReadContext _parsingContext>
	//   50   93:invokevirtual   #795 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   51   96:putfield        #189 <Field JsonReadContext _parsingContext>
			_currToken = JsonToken.END_ARRAY;
	//   52   99:aload_0         
	//   53  100:getstatic       #798 <Field JsonToken JsonToken.END_ARRAY>
	//   54  103:putfield        #131 <Field JsonToken _currToken>
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
	//   61  115:invokespecial   #134 <Method void _updateLocation()>
			if(!_parsingContext.inObject())
	//*  62  118:aload_0         
	//*  63  119:getfield        #189 <Field JsonReadContext _parsingContext>
	//*  64  122:invokevirtual   #801 <Method boolean JsonReadContext.inObject()>
	//*  65  125:ifne            135
				_reportMismatchedEndMarker(j, ']');
	//   66  128:aload_0         
	//   67  129:iload_3         
	//   68  130:bipush          93
	//   69  132:invokevirtual   #791 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   70  135:aload_0         
	//   71  136:aload_0         
	//   72  137:getfield        #189 <Field JsonReadContext _parsingContext>
	//   73  140:invokevirtual   #795 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   74  143:putfield        #189 <Field JsonReadContext _parsingContext>
			_currToken = JsonToken.END_OBJECT;
	//   75  146:aload_0         
	//   76  147:getstatic       #804 <Field JsonToken JsonToken.END_OBJECT>
	//   77  150:putfield        #131 <Field JsonToken _currToken>
			return false;
	//   78  153:iconst_0        
	//   79  154:ireturn         
		}
		int i = j;
	//   80  155:iload_3         
	//   81  156:istore_2        
		if(_parsingContext.expectComma())
	//*  82  157:aload_0         
	//*  83  158:getfield        #189 <Field JsonReadContext _parsingContext>
	//*  84  161:invokevirtual   #807 <Method boolean JsonReadContext.expectComma()>
	//*  85  164:ifeq            173
			i = _skipComma(j);
	//   86  167:aload_0         
	//   87  168:iload_3         
	//   88  169:invokespecial   #809 <Method int _skipComma(int)>
	//   89  172:istore_2        
		if(!_parsingContext.inObject())
	//*  90  173:aload_0         
	//*  91  174:getfield        #189 <Field JsonReadContext _parsingContext>
	//*  92  177:invokevirtual   #801 <Method boolean JsonReadContext.inObject()>
	//*  93  180:ifne            195
		{
			_updateLocation();
	//   94  183:aload_0         
	//   95  184:invokespecial   #134 <Method void _updateLocation()>
			_nextTokenNotInObject(i);
	//   96  187:aload_0         
	//   97  188:iload_2         
	//   98  189:invokespecial   #811 <Method JsonToken _nextTokenNotInObject(int)>
	//   99  192:pop             
			return false;
	//  100  193:iconst_0        
	//  101  194:ireturn         
		}
		_updateNameLocation();
	//  102  195:aload_0         
	//  103  196:invokespecial   #813 <Method void _updateNameLocation()>
		if(i == 34)
	//* 104  199:iload_2         
	//* 105  200:bipush          34
	//* 106  202:icmpne          319
		{
			char ac[] = serializablestring.asQuotedChars();
	//  107  205:aload_1         
	//  108  206:invokeinterface #819 <Method char[] SerializableString.asQuotedChars()>
	//  109  211:astore          6
			int k = ac.length;
	//  110  213:aload           6
	//  111  215:arraylength     
	//  112  216:istore_3        
			if(_inputPtr + k + 4 < _inputEnd)
	//* 113  217:aload_0         
	//* 114  218:getfield        #52  <Field int _inputPtr>
	//* 115  221:iload_3         
	//* 116  222:iadd            
	//* 117  223:iconst_4        
	//* 118  224:iadd            
	//* 119  225:aload_0         
	//* 120  226:getfield        #55  <Field int _inputEnd>
	//* 121  229:icmpge          319
			{
				int j1 = _inputPtr + k;
	//  122  232:aload_0         
	//  123  233:getfield        #52  <Field int _inputPtr>
	//  124  236:iload_3         
	//  125  237:iadd            
	//  126  238:istore          5
				if(_inputBuffer[j1] == '"')
	//* 127  240:aload_0         
	//* 128  241:getfield        #49  <Field char[] _inputBuffer>
	//* 129  244:iload           5
	//* 130  246:caload          
	//* 131  247:bipush          34
	//* 132  249:icmpne          319
				{
					int l = _inputPtr;
	//  133  252:aload_0         
	//  134  253:getfield        #52  <Field int _inputPtr>
	//  135  256:istore_3        
					do
					{
						if(l == j1)
	//* 136  257:iload_3         
	//* 137  258:iload           5
	//* 138  260:icmpne          289
						{
							_parsingContext.setCurrentName(serializablestring.getValue());
	//  139  263:aload_0         
	//  140  264:getfield        #189 <Field JsonReadContext _parsingContext>
	//  141  267:aload_1         
	//  142  268:invokeinterface #822 <Method String SerializableString.getValue()>
	//  143  273:invokevirtual   #594 <Method void JsonReadContext.setCurrentName(String)>
							_isNextTokenNameYes(_skipColonFast(l + 1));
	//  144  276:aload_0         
	//  145  277:aload_0         
	//  146  278:iload_3         
	//  147  279:iconst_1        
	//  148  280:iadd            
	//  149  281:invokespecial   #824 <Method int _skipColonFast(int)>
	//  150  284:invokespecial   #826 <Method void _isNextTokenNameYes(int)>
							return true;
	//  151  287:iconst_1        
	//  152  288:ireturn         
						}
						if(ac[i1] != _inputBuffer[l])
	//* 153  289:aload           6
	//* 154  291:iload           4
	//* 155  293:caload          
	//* 156  294:aload_0         
	//* 157  295:getfield        #49  <Field char[] _inputBuffer>
	//* 158  298:iload_3         
	//* 159  299:caload          
	//* 160  300:icmpeq          306
							break;
	//  161  303:goto            319
						i1++;
	//  162  306:iload           4
	//  163  308:iconst_1        
	//  164  309:iadd            
	//  165  310:istore          4
						l++;
	//  166  312:iload_3         
	//  167  313:iconst_1        
	//  168  314:iadd            
	//  169  315:istore_3        
					} while(true);
	//  170  316:goto            257
				}
			}
		}
		return _isNextTokenNameMaybe(i, serializablestring.getValue());
	//  171  319:aload_0         
	//  172  320:iload_2         
	//  173  321:aload_1         
	//  174  322:invokeinterface #822 <Method String SerializableString.getValue()>
	//  175  327:invokevirtual   #828 <Method boolean _isNextTokenNameMaybe(int, String)>
	//  176  330:ireturn         
	}

	public final int nextIntValue(int i)
		throws IOException
	{
		if(_currToken == JsonToken.FIELD_NAME)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field JsonToken _currToken>
	//*   2    4:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:if_acmpne       98
		{
			_nameCopied = false;
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:putfield        #185 <Field boolean _nameCopied>
			JsonToken jsontoken = _nextToken;
	//    7   15:aload_0         
	//    8   16:getfield        #141 <Field JsonToken _nextToken>
	//    9   19:astore_2        
			_nextToken = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #141 <Field JsonToken _nextToken>
			_currToken = jsontoken;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #131 <Field JsonToken _currToken>
			if(jsontoken == JsonToken.VALUE_NUMBER_INT)
	//*  16   30:aload_2         
	//*  17   31:getstatic       #264 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  18   34:if_acmpne       42
				return getIntValue();
	//   19   37:aload_0         
	//   20   38:invokevirtual   #832 <Method int getIntValue()>
	//   21   41:ireturn         
			if(jsontoken == JsonToken.START_ARRAY)
	//*  22   42:aload_2         
	//*  23   43:getstatic       #169 <Field JsonToken JsonToken.START_ARRAY>
	//*  24   46:if_acmpne       70
			{
				_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   25   49:aload_0         
	//   26   50:aload_0         
	//   27   51:getfield        #189 <Field JsonReadContext _parsingContext>
	//   28   54:aload_0         
	//   29   55:getfield        #192 <Field int _tokenInputRow>
	//   30   58:aload_0         
	//   31   59:getfield        #195 <Field int _tokenInputCol>
	//   32   62:invokevirtual   #201 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   33   65:putfield        #189 <Field JsonReadContext _parsingContext>
				return i;
	//   34   68:iload_1         
	//   35   69:ireturn         
			}
			if(jsontoken == JsonToken.START_OBJECT)
	//*  36   70:aload_2         
	//*  37   71:getstatic       #147 <Field JsonToken JsonToken.START_OBJECT>
	//*  38   74:if_acmpne       96
				_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   39   77:aload_0         
	//   40   78:aload_0         
	//   41   79:getfield        #189 <Field JsonReadContext _parsingContext>
	//   42   82:aload_0         
	//   43   83:getfield        #192 <Field int _tokenInputRow>
	//   44   86:aload_0         
	//   45   87:getfield        #195 <Field int _tokenInputCol>
	//   46   90:invokevirtual   #204 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   47   93:putfield        #189 <Field JsonReadContext _parsingContext>
			return i;
	//   48   96:iload_1         
	//   49   97:ireturn         
		}
		if(nextToken() == JsonToken.VALUE_NUMBER_INT)
	//*  50   98:aload_0         
	//*  51   99:invokevirtual   #776 <Method JsonToken nextToken()>
	//*  52  102:getstatic       #264 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  53  105:if_acmpne       113
			i = getIntValue();
	//   54  108:aload_0         
	//   55  109:invokevirtual   #832 <Method int getIntValue()>
	//   56  112:istore_1        
		return i;
	//   57  113:iload_1         
	//   58  114:ireturn         
	}

	public final long nextLongValue(long l)
		throws IOException
	{
		if(_currToken == JsonToken.FIELD_NAME)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field JsonToken _currToken>
	//*   2    4:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:if_acmpne       98
		{
			_nameCopied = false;
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:putfield        #185 <Field boolean _nameCopied>
			JsonToken jsontoken = _nextToken;
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
			if(jsontoken == JsonToken.VALUE_NUMBER_INT)
	//*  16   30:aload_3         
	//*  17   31:getstatic       #264 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  18   34:if_acmpne       42
				return getLongValue();
	//   19   37:aload_0         
	//   20   38:invokevirtual   #838 <Method long getLongValue()>
	//   21   41:lreturn         
			if(jsontoken == JsonToken.START_ARRAY)
	//*  22   42:aload_3         
	//*  23   43:getstatic       #169 <Field JsonToken JsonToken.START_ARRAY>
	//*  24   46:if_acmpne       70
			{
				_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   25   49:aload_0         
	//   26   50:aload_0         
	//   27   51:getfield        #189 <Field JsonReadContext _parsingContext>
	//   28   54:aload_0         
	//   29   55:getfield        #192 <Field int _tokenInputRow>
	//   30   58:aload_0         
	//   31   59:getfield        #195 <Field int _tokenInputCol>
	//   32   62:invokevirtual   #201 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   33   65:putfield        #189 <Field JsonReadContext _parsingContext>
				return l;
	//   34   68:lload_1         
	//   35   69:lreturn         
			}
			if(jsontoken == JsonToken.START_OBJECT)
	//*  36   70:aload_3         
	//*  37   71:getstatic       #147 <Field JsonToken JsonToken.START_OBJECT>
	//*  38   74:if_acmpne       96
				_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   39   77:aload_0         
	//   40   78:aload_0         
	//   41   79:getfield        #189 <Field JsonReadContext _parsingContext>
	//   42   82:aload_0         
	//   43   83:getfield        #192 <Field int _tokenInputRow>
	//   44   86:aload_0         
	//   45   87:getfield        #195 <Field int _tokenInputCol>
	//   46   90:invokevirtual   #204 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   47   93:putfield        #189 <Field JsonReadContext _parsingContext>
			return l;
	//   48   96:lload_1         
	//   49   97:lreturn         
		}
		if(nextToken() == JsonToken.VALUE_NUMBER_INT)
	//*  50   98:aload_0         
	//*  51   99:invokevirtual   #776 <Method JsonToken nextToken()>
	//*  52  102:getstatic       #264 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  53  105:if_acmpne       113
			l = getLongValue();
	//   54  108:aload_0         
	//   55  109:invokevirtual   #838 <Method long getLongValue()>
	//   56  112:lstore_1        
		return l;
	//   57  113:lload_1         
	//   58  114:lreturn         
	}

	public final String nextTextValue()
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field JsonToken _currToken>
	//    2    4:astore_2        
		JsonToken jsontoken1 = JsonToken.FIELD_NAME;
	//    3    5:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//    4    8:astore_3        
		Object obj = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
		if(jsontoken == jsontoken1)
	//*   7   11:aload_2         
	//*   8   12:aload_3         
	//*   9   13:if_acmpne       123
		{
			_nameCopied = false;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #185 <Field boolean _nameCopied>
			obj = ((Object) (_nextToken));
	//   13   21:aload_0         
	//   14   22:getfield        #141 <Field JsonToken _nextToken>
	//   15   25:astore_1        
			_nextToken = null;
	//   16   26:aload_0         
	//   17   27:aconst_null     
	//   18   28:putfield        #141 <Field JsonToken _nextToken>
			_currToken = ((JsonToken) (obj));
	//   19   31:aload_0         
	//   20   32:aload_1         
	//   21   33:putfield        #131 <Field JsonToken _currToken>
			if(obj == JsonToken.VALUE_STRING)
	//*  22   36:aload_1         
	//*  23   37:getstatic       #178 <Field JsonToken JsonToken.VALUE_STRING>
	//*  24   40:if_acmpne       67
			{
				if(_tokenIncomplete)
	//*  25   43:aload_0         
	//*  26   44:getfield        #175 <Field boolean _tokenIncomplete>
	//*  27   47:ifeq            59
				{
					_tokenIncomplete = false;
	//   28   50:aload_0         
	//   29   51:iconst_0        
	//   30   52:putfield        #175 <Field boolean _tokenIncomplete>
					_finishString();
	//   31   55:aload_0         
	//   32   56:invokevirtual   #675 <Method void _finishString()>
				}
				return _textBuffer.contentsAsString();
	//   33   59:aload_0         
	//   34   60:getfield        #78  <Field TextBuffer _textBuffer>
	//   35   63:invokevirtual   #499 <Method String TextBuffer.contentsAsString()>
	//   36   66:areturn         
			}
			if(obj == JsonToken.START_ARRAY)
	//*  37   67:aload_1         
	//*  38   68:getstatic       #169 <Field JsonToken JsonToken.START_ARRAY>
	//*  39   71:if_acmpne       95
			{
				_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   40   74:aload_0         
	//   41   75:aload_0         
	//   42   76:getfield        #189 <Field JsonReadContext _parsingContext>
	//   43   79:aload_0         
	//   44   80:getfield        #192 <Field int _tokenInputRow>
	//   45   83:aload_0         
	//   46   84:getfield        #195 <Field int _tokenInputCol>
	//   47   87:invokevirtual   #201 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   48   90:putfield        #189 <Field JsonReadContext _parsingContext>
				return null;
	//   49   93:aconst_null     
	//   50   94:areturn         
			}
			if(obj == JsonToken.START_OBJECT)
	//*  51   95:aload_1         
	//*  52   96:getstatic       #147 <Field JsonToken JsonToken.START_OBJECT>
	//*  53   99:if_acmpne       121
				_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   54  102:aload_0         
	//   55  103:aload_0         
	//   56  104:getfield        #189 <Field JsonReadContext _parsingContext>
	//   57  107:aload_0         
	//   58  108:getfield        #192 <Field int _tokenInputRow>
	//   59  111:aload_0         
	//   60  112:getfield        #195 <Field int _tokenInputCol>
	//   61  115:invokevirtual   #204 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   62  118:putfield        #189 <Field JsonReadContext _parsingContext>
			return null;
	//   63  121:aconst_null     
	//   64  122:areturn         
		}
		if(nextToken() == JsonToken.VALUE_STRING)
	//*  65  123:aload_0         
	//*  66  124:invokevirtual   #776 <Method JsonToken nextToken()>
	//*  67  127:getstatic       #178 <Field JsonToken JsonToken.VALUE_STRING>
	//*  68  130:if_acmpne       138
			obj = ((Object) (getText()));
	//   69  133:aload_0         
	//   70  134:invokevirtual   #704 <Method String getText()>
	//   71  137:astore_1        
		return ((String) (obj));
	//   72  138:aload_1         
	//   73  139:areturn         
	}

	public final JsonToken nextToken()
		throws IOException
	{
		boolean flag;
		JsonToken jsontoken2;
label0:
		{
			if(_currToken == JsonToken.FIELD_NAME)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field JsonToken _currToken>
	//*   2    4:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:if_acmpne       15
				return _nextAfterName();
	//    4   10:aload_0         
	//    5   11:invokespecial   #782 <Method JsonToken _nextAfterName()>
	//    6   14:areturn         
			_numTypesValid = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #780 <Field int _numTypesValid>
			if(_tokenIncomplete)
	//*  10   20:aload_0         
	//*  11   21:getfield        #175 <Field boolean _tokenIncomplete>
	//*  12   24:ifeq            31
				_skipString();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #784 <Method void _skipString()>
			int j = _skipWSOrEnd();
	//   15   31:aload_0         
	//   16   32:invokespecial   #786 <Method int _skipWSOrEnd()>
	//   17   35:istore_2        
			if(j < 0)
	//*  18   36:iload_2         
	//*  19   37:ifge            51
			{
				close();
	//   20   40:aload_0         
	//   21   41:invokevirtual   #787 <Method void close()>
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
	//   29   53:putfield        #685 <Field byte[] _binaryValue>
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
	//*  37   70:invokevirtual   #558 <Method boolean JsonReadContext.inArray()>
	//*  38   73:ifne            83
					_reportMismatchedEndMarker(j, '}');
	//   39   76:aload_0         
	//   40   77:iload_2         
	//   41   78:bipush          125
	//   42   80:invokevirtual   #791 <Method void _reportMismatchedEndMarker(int, char)>
				_parsingContext = _parsingContext.clearAndGetParent();
	//   43   83:aload_0         
	//   44   84:aload_0         
	//   45   85:getfield        #189 <Field JsonReadContext _parsingContext>
	//   46   88:invokevirtual   #795 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   47   91:putfield        #189 <Field JsonReadContext _parsingContext>
				JsonToken jsontoken = JsonToken.END_ARRAY;
	//   48   94:getstatic       #798 <Field JsonToken JsonToken.END_ARRAY>
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
	//*  62  122:invokevirtual   #801 <Method boolean JsonReadContext.inObject()>
	//*  63  125:ifne            135
					_reportMismatchedEndMarker(j, ']');
	//   64  128:aload_0         
	//   65  129:iload_2         
	//   66  130:bipush          93
	//   67  132:invokevirtual   #791 <Method void _reportMismatchedEndMarker(int, char)>
				_parsingContext = _parsingContext.clearAndGetParent();
	//   68  135:aload_0         
	//   69  136:aload_0         
	//   70  137:getfield        #189 <Field JsonReadContext _parsingContext>
	//   71  140:invokevirtual   #795 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   72  143:putfield        #189 <Field JsonReadContext _parsingContext>
				JsonToken jsontoken1 = JsonToken.END_OBJECT;
	//   73  146:getstatic       #804 <Field JsonToken JsonToken.END_OBJECT>
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
	//*  84  166:invokevirtual   #807 <Method boolean JsonReadContext.expectComma()>
	//*  85  169:ifeq            178
				i = _skipComma(j);
	//   86  172:aload_0         
	//   87  173:iload_2         
	//   88  174:invokespecial   #809 <Method int _skipComma(int)>
	//   89  177:istore_1        
			flag = _parsingContext.inObject();
	//   90  178:aload_0         
	//   91  179:getfield        #189 <Field JsonReadContext _parsingContext>
	//   92  182:invokevirtual   #801 <Method boolean JsonReadContext.inObject()>
	//   93  185:istore_3        
			j = i;
	//   94  186:iload_1         
	//   95  187:istore_2        
			if(flag)
	//*  96  188:iload_3         
	//*  97  189:ifeq            239
			{
				_updateNameLocation();
	//   98  192:aload_0         
	//   99  193:invokespecial   #813 <Method void _updateNameLocation()>
				String s;
				if(i == 34)
	//* 100  196:iload_1         
	//* 101  197:bipush          34
	//* 102  199:icmpne          211
					s = _parseName();
	//  103  202:aload_0         
	//  104  203:invokevirtual   #589 <Method String _parseName()>
	//  105  206:astore          4
				else
	//* 106  208:goto            218
					s = _handleOddName(i);
	//  107  211:aload_0         
	//  108  212:iload_1         
	//  109  213:invokevirtual   #591 <Method String _handleOddName(int)>
	//  110  216:astore          4
				_parsingContext.setCurrentName(s);
	//  111  218:aload_0         
	//  112  219:getfield        #189 <Field JsonReadContext _parsingContext>
	//  113  222:aload           4
	//  114  224:invokevirtual   #594 <Method void JsonReadContext.setCurrentName(String)>
				_currToken = JsonToken.FIELD_NAME;
	//  115  227:aload_0         
	//  116  228:getstatic       #128 <Field JsonToken JsonToken.FIELD_NAME>
	//  117  231:putfield        #131 <Field JsonToken _currToken>
				j = _skipColon();
	//  118  234:aload_0         
	//  119  235:invokespecial   #596 <Method int _skipColon()>
	//  120  238:istore_2        
			}
			_updateLocation();
	//  121  239:aload_0         
	//  122  240:invokespecial   #134 <Method void _updateLocation()>
			if(j != 34)
	//* 123  243:iload_2         
	//* 124  244:bipush          34
	//* 125  246:icmpeq          486
			{
				if(j != 45)
	//* 126  249:iload_2         
	//* 127  250:bipush          45
	//* 128  252:icmpeq          477
				{
					if(j != 91)
	//* 129  255:iload_2         
	//* 130  256:bipush          91
	//* 131  258:icmpeq          446
					{
						if(j != 102)
	//* 132  261:iload_2         
	//* 133  262:bipush          102
	//* 134  264:icmpeq          434
						{
							if(j != 110)
	//* 135  267:iload_2         
	//* 136  268:bipush          110
	//* 137  270:icmpeq          422
							{
								if(j != 116)
	//* 138  273:iload_2         
	//* 139  274:bipush          116
	//* 140  276:icmpeq          410
									if(j != 123)
	//* 141  279:iload_2         
	//* 142  280:bipush          123
	//* 143  282:icmpeq          379
									{
										if(j != 125)
	//* 144  285:iload_2         
	//* 145  286:bipush          125
	//* 146  288:icmpeq          368
										{
											switch(j)
	//* 147  291:iload_2         
											{
	//* 148  292:tableswitch     48 57: default 348
	//	               48 358
	//	               49 358
	//	               50 358
	//	               51 358
	//	               52 358
	//	               53 358
	//	               54 358
	//	               55 358
	//	               56 358
	//	               57 358
											default:
												jsontoken2 = _handleOddValue(j);
	//  149  348:aload_0         
	//  150  349:iload_2         
	//  151  350:invokevirtual   #138 <Method JsonToken _handleOddValue(int)>
	//  152  353:astore          4
												break;

	//* 153  355:goto            496
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
												jsontoken2 = _parsePosNumber(j);
	//  154  358:aload_0         
	//  155  359:iload_2         
	//  156  360:invokevirtual   #144 <Method JsonToken _parsePosNumber(int)>
	//  157  363:astore          4
												break;
											}
											break label0;
	//  158  365:goto            496
										}
										_reportUnexpectedChar(j, "expected a value");
	//  159  368:aload_0         
	//  160  369:iload_2         
	//  161  370:ldc2            #841 <String "expected a value">
	//  162  373:invokevirtual   #340 <Method void _reportUnexpectedChar(int, String)>
									} else
	//* 163  376:goto            410
									{
										if(!flag)
	//* 164  379:iload_3         
	//* 165  380:ifne            402
											_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//  166  383:aload_0         
	//  167  384:aload_0         
	//  168  385:getfield        #189 <Field JsonReadContext _parsingContext>
	//  169  388:aload_0         
	//  170  389:getfield        #192 <Field int _tokenInputRow>
	//  171  392:aload_0         
	//  172  393:getfield        #195 <Field int _tokenInputCol>
	//  173  396:invokevirtual   #204 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//  174  399:putfield        #189 <Field JsonReadContext _parsingContext>
										jsontoken2 = JsonToken.START_OBJECT;
	//  175  402:getstatic       #147 <Field JsonToken JsonToken.START_OBJECT>
	//  176  405:astore          4
										break label0;
	//  177  407:goto            496
									}
								_matchTrue();
	//  178  410:aload_0         
	//  179  411:invokespecial   #604 <Method void _matchTrue()>
								jsontoken2 = JsonToken.VALUE_TRUE;
	//  180  414:getstatic       #156 <Field JsonToken JsonToken.VALUE_TRUE>
	//  181  417:astore          4
							} else
	//* 182  419:goto            496
							{
								_matchNull();
	//  183  422:aload_0         
	//  184  423:invokespecial   #606 <Method void _matchNull()>
								jsontoken2 = JsonToken.VALUE_NULL;
	//  185  426:getstatic       #161 <Field JsonToken JsonToken.VALUE_NULL>
	//  186  429:astore          4
							}
						} else
	//* 187  431:goto            496
						{
							_matchFalse();
	//  188  434:aload_0         
	//  189  435:invokespecial   #608 <Method void _matchFalse()>
							jsontoken2 = JsonToken.VALUE_FALSE;
	//  190  438:getstatic       #166 <Field JsonToken JsonToken.VALUE_FALSE>
	//  191  441:astore          4
						}
					} else
	//* 192  443:goto            496
					{
						if(!flag)
	//* 193  446:iload_3         
	//* 194  447:ifne            469
							_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//  195  450:aload_0         
	//  196  451:aload_0         
	//  197  452:getfield        #189 <Field JsonReadContext _parsingContext>
	//  198  455:aload_0         
	//  199  456:getfield        #192 <Field int _tokenInputRow>
	//  200  459:aload_0         
	//  201  460:getfield        #195 <Field int _tokenInputCol>
	//  202  463:invokevirtual   #201 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//  203  466:putfield        #189 <Field JsonReadContext _parsingContext>
						jsontoken2 = JsonToken.START_ARRAY;
	//  204  469:getstatic       #169 <Field JsonToken JsonToken.START_ARRAY>
	//  205  472:astore          4
					}
				} else
	//* 206  474:goto            496
				{
					jsontoken2 = _parseNegNumber();
	//  207  477:aload_0         
	//  208  478:invokevirtual   #173 <Method JsonToken _parseNegNumber()>
	//  209  481:astore          4
				}
			} else
	//* 210  483:goto            496
			{
				_tokenIncomplete = true;
	//  211  486:aload_0         
	//  212  487:iconst_1        
	//  213  488:putfield        #175 <Field boolean _tokenIncomplete>
				jsontoken2 = JsonToken.VALUE_STRING;
	//  214  491:getstatic       #178 <Field JsonToken JsonToken.VALUE_STRING>
	//  215  494:astore          4
			}
		}
		if(flag)
	//* 216  496:iload_3         
	//* 217  497:ifeq            511
		{
			_nextToken = jsontoken2;
	//  218  500:aload_0         
	//  219  501:aload           4
	//  220  503:putfield        #141 <Field JsonToken _nextToken>
			return _currToken;
	//  221  506:aload_0         
	//  222  507:getfield        #131 <Field JsonToken _currToken>
	//  223  510:areturn         
		} else
		{
			_currToken = jsontoken2;
	//  224  511:aload_0         
	//  225  512:aload           4
	//  226  514:putfield        #131 <Field JsonToken _currToken>
			return jsontoken2;
	//  227  517:aload           4
	//  228  519:areturn         
		}
	}

	public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
		throws IOException
	{
		byte abyte0[];
		if(!_tokenIncomplete || _currToken != JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #175 <Field boolean _tokenIncomplete>
	//*   2    4:ifeq            61
	//*   3    7:aload_0         
	//*   4    8:getfield        #131 <Field JsonToken _currToken>
	//*   5   11:getstatic       #178 <Field JsonToken JsonToken.VALUE_STRING>
	//*   6   14:if_acmpeq       20
			break MISSING_BLOCK_LABEL_61;
	//    7   17:goto            61
		abyte0 = _ioContext.allocBase64Buffer();
	//    8   20:aload_0         
	//    9   21:getfield        #402 <Field IOContext _ioContext>
	//   10   24:invokevirtual   #846 <Method byte[] IOContext.allocBase64Buffer()>
	//   11   27:astore          4
		int i = _readBinary(base64variant, outputstream, abyte0);
	//   12   29:aload_0         
	//   13   30:aload_1         
	//   14   31:aload_2         
	//   15   32:aload           4
	//   16   34:invokevirtual   #848 <Method int _readBinary(Base64Variant, OutputStream, byte[])>
	//   17   37:istore_3        
		_ioContext.releaseBase64Buffer(abyte0);
	//   18   38:aload_0         
	//   19   39:getfield        #402 <Field IOContext _ioContext>
	//   20   42:aload           4
	//   21   44:invokevirtual   #852 <Method void IOContext.releaseBase64Buffer(byte[])>
		return i;
	//   22   47:iload_3         
	//   23   48:ireturn         
		base64variant;
	//   24   49:astore_1        
		_ioContext.releaseBase64Buffer(abyte0);
	//   25   50:aload_0         
	//   26   51:getfield        #402 <Field IOContext _ioContext>
	//   27   54:aload           4
	//   28   56:invokevirtual   #852 <Method void IOContext.releaseBase64Buffer(byte[])>
		throw base64variant;
	//   29   59:aload_1         
	//   30   60:athrow          
		base64variant = ((Base64Variant) (getBinaryValue(base64variant)));
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:invokevirtual   #854 <Method byte[] getBinaryValue(Base64Variant)>
	//   34   66:astore_1        
		outputstream.write(((byte []) (base64variant)));
	//   35   67:aload_2         
	//   36   68:aload_1         
	//   37   69:invokevirtual   #856 <Method void OutputStream.write(byte[])>
		return base64variant.length;
	//   38   72:aload_1         
	//   39   73:arraylength     
	//   40   74:ireturn         
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
	//   19   29:invokevirtual   #859 <Method void Writer.write(char[], int, int)>
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
