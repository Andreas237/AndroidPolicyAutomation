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
	//    3    3:invokespecial   #52  <Method void ParserBase(IOContext, int)>
		_reader = reader;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #54  <Field Reader _reader>
		_inputBuffer = iocontext.allocTokenBuffer();
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #60  <Method char[] IOContext.allocTokenBuffer()>
	//   10   16:putfield        #62  <Field char[] _inputBuffer>
		_inputPtr = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #65  <Field int _inputPtr>
		_inputEnd = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #68  <Field int _inputEnd>
		_objectCodec = objectcodec;
	//   17   29:aload_0         
	//   18   30:aload           4
	//   19   32:putfield        #70  <Field ObjectCodec _objectCodec>
		_symbols = charstonamecanonicalizer;
	//   20   35:aload_0         
	//   21   36:aload           5
	//   22   38:putfield        #72  <Field CharsToNameCanonicalizer _symbols>
		_hashSeed = charstonamecanonicalizer.hashSeed();
	//   23   41:aload_0         
	//   24   42:aload           5
	//   25   44:invokevirtual   #77  <Method int CharsToNameCanonicalizer.hashSeed()>
	//   26   47:putfield        #79  <Field int _hashSeed>
		_bufferRecyclable = true;
	//   27   50:aload_0         
	//   28   51:iconst_1        
	//   29   52:putfield        #81  <Field boolean _bufferRecyclable>
	//   30   55:return          
	}

	public ReaderBasedJsonParser(IOContext iocontext, int i, Reader reader, ObjectCodec objectcodec, CharsToNameCanonicalizer charstonamecanonicalizer, char ac[], int j, 
			int k, boolean flag)
	{
		super(iocontext, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #52  <Method void ParserBase(IOContext, int)>
		_reader = reader;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #54  <Field Reader _reader>
		_inputBuffer = ac;
	//    7   11:aload_0         
	//    8   12:aload           6
	//    9   14:putfield        #62  <Field char[] _inputBuffer>
		_inputPtr = j;
	//   10   17:aload_0         
	//   11   18:iload           7
	//   12   20:putfield        #65  <Field int _inputPtr>
		_inputEnd = k;
	//   13   23:aload_0         
	//   14   24:iload           8
	//   15   26:putfield        #68  <Field int _inputEnd>
		_objectCodec = objectcodec;
	//   16   29:aload_0         
	//   17   30:aload           4
	//   18   32:putfield        #70  <Field ObjectCodec _objectCodec>
		_symbols = charstonamecanonicalizer;
	//   19   35:aload_0         
	//   20   36:aload           5
	//   21   38:putfield        #72  <Field CharsToNameCanonicalizer _symbols>
		_hashSeed = charstonamecanonicalizer.hashSeed();
	//   22   41:aload_0         
	//   23   42:aload           5
	//   24   44:invokevirtual   #77  <Method int CharsToNameCanonicalizer.hashSeed()>
	//   25   47:putfield        #79  <Field int _hashSeed>
		_bufferRecyclable = flag;
	//   26   50:aload_0         
	//   27   51:iload           9
	//   28   53:putfield        #81  <Field boolean _bufferRecyclable>
	//   29   56:return          
	}

	private final void _checkMatchEnd(String s, int i, int j)
		throws IOException
	{
		if(Character.isJavaIdentifierPart((char)j))
	//*   0    0:iload_3         
	//*   1    1:int2char        
	//*   2    2:invokestatic    #92  <Method boolean Character.isJavaIdentifierPart(char)>
	//*   3    5:ifeq            18
			_reportInvalidToken(s.substring(0, i));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:iload_2         
	//    8   12:invokevirtual   #98  <Method String String.substring(int, int)>
	//    9   15:invokevirtual   #102 <Method void _reportInvalidToken(String)>
	//   10   18:return          
	}

	private void _closeScope(int i)
		throws JsonParseException
	{
		if(i == 93)
	//*   0    0:iload_1         
	//*   1    1:bipush          93
	//*   2    3:icmpne          45
		{
			_updateLocation();
	//    3    6:aload_0         
	//    4    7:invokespecial   #110 <Method void _updateLocation()>
			if(!_parsingContext.inArray())
	//*   5   10:aload_0         
	//*   6   11:getfield        #114 <Field JsonReadContext _parsingContext>
	//*   7   14:invokevirtual   #120 <Method boolean JsonReadContext.inArray()>
	//*   8   17:ifne            27
				_reportMismatchedEndMarker(i, '}');
	//    9   20:aload_0         
	//   10   21:iload_1         
	//   11   22:bipush          125
	//   12   24:invokevirtual   #124 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #114 <Field JsonReadContext _parsingContext>
	//   16   32:invokevirtual   #128 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   17   35:putfield        #114 <Field JsonReadContext _parsingContext>
			_currToken = JsonToken.END_ARRAY;
	//   18   38:aload_0         
	//   19   39:getstatic       #134 <Field JsonToken JsonToken.END_ARRAY>
	//   20   42:putfield        #137 <Field JsonToken _currToken>
		}
		if(i == 125)
	//*  21   45:iload_1         
	//*  22   46:bipush          125
	//*  23   48:icmpne          90
		{
			_updateLocation();
	//   24   51:aload_0         
	//   25   52:invokespecial   #110 <Method void _updateLocation()>
			if(!_parsingContext.inObject())
	//*  26   55:aload_0         
	//*  27   56:getfield        #114 <Field JsonReadContext _parsingContext>
	//*  28   59:invokevirtual   #140 <Method boolean JsonReadContext.inObject()>
	//*  29   62:ifne            72
				_reportMismatchedEndMarker(i, ']');
	//   30   65:aload_0         
	//   31   66:iload_1         
	//   32   67:bipush          93
	//   33   69:invokevirtual   #124 <Method void _reportMismatchedEndMarker(int, char)>
			_parsingContext = _parsingContext.clearAndGetParent();
	//   34   72:aload_0         
	//   35   73:aload_0         
	//   36   74:getfield        #114 <Field JsonReadContext _parsingContext>
	//   37   77:invokevirtual   #128 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   38   80:putfield        #114 <Field JsonReadContext _parsingContext>
			_currToken = JsonToken.END_OBJECT;
	//   39   83:aload_0         
	//   40   84:getstatic       #143 <Field JsonToken JsonToken.END_OBJECT>
	//   41   87:putfield        #137 <Field JsonToken _currToken>
		}
	//   42   90:return          
	}

	private String _handleOddName2(int i, int j, int ai[])
		throws IOException
	{
		_textBuffer.resetWithShared(_inputBuffer, i, _inputPtr - i);
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field TextBuffer _textBuffer>
	//    2    4:aload_0         
	//    3    5:getfield        #62  <Field char[] _inputBuffer>
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #65  <Field int _inputPtr>
	//    7   13:iload_1         
	//    8   14:isub            
	//    9   15:invokevirtual   #155 <Method void TextBuffer.resetWithShared(char[], int, int)>
		char ac[] = _textBuffer.getCurrentSegment();
	//   10   18:aload_0         
	//   11   19:getfield        #149 <Field TextBuffer _textBuffer>
	//   12   22:invokevirtual   #158 <Method char[] TextBuffer.getCurrentSegment()>
	//   13   25:astore          7
		i = _textBuffer.getCurrentSegmentSize();
	//   14   27:aload_0         
	//   15   28:getfield        #149 <Field TextBuffer _textBuffer>
	//   16   31:invokevirtual   #161 <Method int TextBuffer.getCurrentSegmentSize()>
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
	//*  22   40:getfield        #65  <Field int _inputPtr>
	//*  23   43:aload_0         
	//*  24   44:getfield        #68  <Field int _inputEnd>
	//*  25   47:icmplt          60
	//*  26   50:aload_0         
	//*  27   51:invokevirtual   #164 <Method boolean _loadMore()>
	//*  28   54:ifne            60
	//*  29   57:goto            96
				{
					c = _inputBuffer[_inputPtr];
	//   30   60:aload_0         
	//   31   61:getfield        #62  <Field char[] _inputBuffer>
	//   32   64:aload_0         
	//   33   65:getfield        #65  <Field int _inputPtr>
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
	//   45   90:invokestatic    #92  <Method boolean Character.isJavaIdentifierPart(char)>
	//   46   93:ifne            140
				}
				_textBuffer.setCurrentLength(i);
	//   47   96:aload_0         
	//   48   97:getfield        #149 <Field TextBuffer _textBuffer>
	//   49  100:iload_1         
	//   50  101:invokevirtual   #167 <Method void TextBuffer.setCurrentLength(int)>
				ai = ((int []) (_textBuffer));
	//   51  104:aload_0         
	//   52  105:getfield        #149 <Field TextBuffer _textBuffer>
	//   53  108:astore_3        
				ac = ((TextBuffer) (ai)).getTextBuffer();
	//   54  109:aload_3         
	//   55  110:invokevirtual   #170 <Method char[] TextBuffer.getTextBuffer()>
	//   56  113:astore          7
				i = ((TextBuffer) (ai)).getTextOffset();
	//   57  115:aload_3         
	//   58  116:invokevirtual   #173 <Method int TextBuffer.getTextOffset()>
	//   59  119:istore_1        
				int k = ((TextBuffer) (ai)).size();
	//   60  120:aload_3         
	//   61  121:invokevirtual   #176 <Method int TextBuffer.size()>
	//   62  124:istore          5
				return _symbols.findSymbol(ac, i, k, j);
	//   63  126:aload_0         
	//   64  127:getfield        #72  <Field CharsToNameCanonicalizer _symbols>
	//   65  130:aload           7
	//   66  132:iload_1         
	//   67  133:iload           5
	//   68  135:iload_2         
	//   69  136:invokevirtual   #180 <Method String CharsToNameCanonicalizer.findSymbol(char[], int, int, int)>
	//   70  139:areturn         
			}
			_inputPtr = _inputPtr + 1;
	//   71  140:aload_0         
	//   72  141:aload_0         
	//   73  142:getfield        #65  <Field int _inputPtr>
	//   74  145:iconst_1        
	//   75  146:iadd            
	//   76  147:putfield        #65  <Field int _inputPtr>
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
	//   96  178:getfield        #149 <Field TextBuffer _textBuffer>
	//   97  181:invokevirtual   #183 <Method char[] TextBuffer.finishCurrentSegment()>
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

	private final void _matchFalse()
		throws IOException
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field int _inputPtr>
	//    2    4:istore_1        
		if(i + 4 < _inputEnd)
	//*   3    5:iload_1         
	//*   4    6:iconst_4        
	//*   5    7:iadd            
	//*   6    8:aload_0         
	//*   7    9:getfield        #68  <Field int _inputEnd>
	//*   8   12:icmpge          96
		{
			char ac[] = _inputBuffer;
	//    9   15:aload_0         
	//   10   16:getfield        #62  <Field char[] _inputBuffer>
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
	//   63   92:putfield        #65  <Field int _inputPtr>
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
	//   66   97:ldc1            #186 <String "false">
	//   67   99:iconst_1        
	//   68  100:invokevirtual   #190 <Method void _matchToken(String, int)>
	//   69  103:return          
	}

	private final void _matchNull()
		throws IOException
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field int _inputPtr>
	//    2    4:istore_1        
		if(i + 3 < _inputEnd)
	//*   3    5:iload_1         
	//*   4    6:iconst_3        
	//*   5    7:iadd            
	//*   6    8:aload_0         
	//*   7    9:getfield        #68  <Field int _inputEnd>
	//*   8   12:icmpge          84
		{
			char ac[] = _inputBuffer;
	//    9   15:aload_0         
	//   10   16:getfield        #62  <Field char[] _inputBuffer>
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
	//   54   80:putfield        #65  <Field int _inputPtr>
							return;
	//   55   83:return          
						}
					}
				}
			}
		}
		_matchToken("null", 1);
	//   56   84:aload_0         
	//   57   85:ldc1            #193 <String "null">
	//   58   87:iconst_1        
	//   59   88:invokevirtual   #190 <Method void _matchToken(String, int)>
	//   60   91:return          
	}

	private final void _matchToken2(String s, int i)
		throws IOException
	{
		int k = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #197 <Method int String.length()>
	//    2    4:istore          4
		int j;
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore() || _inputBuffer[_inputPtr] != s.charAt(i))
	//*   3    6:aload_0         
	//*   4    7:getfield        #65  <Field int _inputPtr>
	//*   5   10:aload_0         
	//*   6   11:getfield        #68  <Field int _inputEnd>
	//*   7   14:icmplt          24
	//*   8   17:aload_0         
	//*   9   18:invokevirtual   #164 <Method boolean _loadMore()>
	//*  10   21:ifeq            41
	//*  11   24:aload_0         
	//*  12   25:getfield        #62  <Field char[] _inputBuffer>
	//*  13   28:aload_0         
	//*  14   29:getfield        #65  <Field int _inputPtr>
	//*  15   32:caload          
	//*  16   33:aload_1         
	//*  17   34:iload_2         
	//*  18   35:invokevirtual   #201 <Method char String.charAt(int)>
	//*  19   38:icmpeq          51
				_reportInvalidToken(s.substring(0, i));
	//   20   41:aload_0         
	//   21   42:aload_1         
	//   22   43:iconst_0        
	//   23   44:iload_2         
	//   24   45:invokevirtual   #98  <Method String String.substring(int, int)>
	//   25   48:invokevirtual   #102 <Method void _reportInvalidToken(String)>
			_inputPtr = _inputPtr + 1;
	//   26   51:aload_0         
	//   27   52:aload_0         
	//   28   53:getfield        #65  <Field int _inputPtr>
	//   29   56:iconst_1        
	//   30   57:iadd            
	//   31   58:putfield        #65  <Field int _inputPtr>
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
	//*  42   74:getfield        #65  <Field int _inputPtr>
	//*  43   77:aload_0         
	//*  44   78:getfield        #68  <Field int _inputEnd>
	//*  45   81:icmplt          92
	//*  46   84:aload_0         
	//*  47   85:invokevirtual   #164 <Method boolean _loadMore()>
	//*  48   88:ifne            92
			return;
	//   49   91:return          
		i = ((int) (_inputBuffer[_inputPtr]));
	//   50   92:aload_0         
	//   51   93:getfield        #62  <Field char[] _inputBuffer>
	//   52   96:aload_0         
	//   53   97:getfield        #65  <Field int _inputPtr>
	//   54  100:caload          
	//   55  101:istore_2        
		if(i >= 48 && i != 93 && i != 125)
	//*  56  102:iload_2         
	//*  57  103:bipush          48
	//*  58  105:icmplt          127
	//*  59  108:iload_2         
	//*  60  109:bipush          93
	//*  61  111:icmpeq          127
	//*  62  114:iload_2         
	//*  63  115:bipush          125
	//*  64  117:icmpeq          127
			_checkMatchEnd(s, j, i);
	//   65  120:aload_0         
	//   66  121:aload_1         
	//   67  122:iload_3         
	//   68  123:iload_2         
	//   69  124:invokespecial   #203 <Method void _checkMatchEnd(String, int, int)>
	//   70  127:return          
	}

	private final void _matchTrue()
		throws IOException
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field int _inputPtr>
	//    2    4:istore_1        
		if(i + 3 < _inputEnd)
	//*   3    5:iload_1         
	//*   4    6:iconst_3        
	//*   5    7:iadd            
	//*   6    8:aload_0         
	//*   7    9:getfield        #68  <Field int _inputEnd>
	//*   8   12:icmpge          84
		{
			char ac[] = _inputBuffer;
	//    9   15:aload_0         
	//   10   16:getfield        #62  <Field char[] _inputBuffer>
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
	//   54   80:putfield        #65  <Field int _inputPtr>
							return;
	//   55   83:return          
						}
					}
				}
			}
		}
		_matchToken("true", 1);
	//   56   84:aload_0         
	//   57   85:ldc1            #206 <String "true">
	//   58   87:iconst_1        
	//   59   88:invokevirtual   #190 <Method void _matchToken(String, int)>
	//   60   91:return          
	}

	private final JsonToken _nextAfterName()
	{
		_nameCopied = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #211 <Field boolean _nameCopied>
		JsonToken jsontoken = _nextToken;
	//    3    5:aload_0         
	//    4    6:getfield        #214 <Field JsonToken _nextToken>
	//    5    9:astore_1        
		_nextToken = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #214 <Field JsonToken _nextToken>
		if(jsontoken == JsonToken.START_ARRAY)
	//*   9   15:aload_1         
	//*  10   16:getstatic       #217 <Field JsonToken JsonToken.START_ARRAY>
	//*  11   19:if_acmpne       44
			_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #114 <Field JsonReadContext _parsingContext>
	//   15   27:aload_0         
	//   16   28:getfield        #220 <Field int _tokenInputRow>
	//   17   31:aload_0         
	//   18   32:getfield        #223 <Field int _tokenInputCol>
	//   19   35:invokevirtual   #227 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   20   38:putfield        #114 <Field JsonReadContext _parsingContext>
		else
	//*  21   41:goto            70
		if(jsontoken == JsonToken.START_OBJECT)
	//*  22   44:aload_1         
	//*  23   45:getstatic       #230 <Field JsonToken JsonToken.START_OBJECT>
	//*  24   48:if_acmpne       70
			_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   25   51:aload_0         
	//   26   52:aload_0         
	//   27   53:getfield        #114 <Field JsonReadContext _parsingContext>
	//   28   56:aload_0         
	//   29   57:getfield        #220 <Field int _tokenInputRow>
	//   30   60:aload_0         
	//   31   61:getfield        #223 <Field int _tokenInputCol>
	//   32   64:invokevirtual   #233 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   33   67:putfield        #114 <Field JsonReadContext _parsingContext>
		_currToken = jsontoken;
	//   34   70:aload_0         
	//   35   71:aload_1         
	//   36   72:putfield        #137 <Field JsonToken _currToken>
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
	//    5    8:putfield        #237 <Field boolean _tokenIncomplete>
			JsonToken jsontoken = JsonToken.VALUE_STRING;
	//    6   11:getstatic       #240 <Field JsonToken JsonToken.VALUE_STRING>
	//    7   14:astore_2        
			_currToken = jsontoken;
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:putfield        #137 <Field JsonToken _currToken>
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
	//   38  141:invokevirtual   #243 <Method JsonToken _parsePosNumber(int)>
	//   39  144:astore_2        
			_currToken = jsontoken1;
	//   40  145:aload_0         
	//   41  146:aload_2         
	//   42  147:putfield        #137 <Field JsonToken _currToken>
			return jsontoken1;
	//   43  150:aload_2         
	//   44  151:areturn         
		}
		  goto _L15
_L14:
		JsonToken jsontoken2 = _parseNegNumber();
	//   45  152:aload_0         
	//   46  153:invokevirtual   #246 <Method JsonToken _parseNegNumber()>
	//   47  156:astore_2        
		_currToken = jsontoken2;
	//   48  157:aload_0         
	//   49  158:aload_2         
	//   50  159:putfield        #137 <Field JsonToken _currToken>
		return jsontoken2;
	//   51  162:aload_2         
	//   52  163:areturn         
_L12:
		_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   53  164:aload_0         
	//   54  165:aload_0         
	//   55  166:getfield        #114 <Field JsonReadContext _parsingContext>
	//   56  169:aload_0         
	//   57  170:getfield        #220 <Field int _tokenInputRow>
	//   58  173:aload_0         
	//   59  174:getfield        #223 <Field int _tokenInputCol>
	//   60  177:invokevirtual   #233 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   61  180:putfield        #114 <Field JsonReadContext _parsingContext>
		JsonToken jsontoken3 = JsonToken.START_OBJECT;
	//   62  183:getstatic       #230 <Field JsonToken JsonToken.START_OBJECT>
	//   63  186:astore_2        
		_currToken = jsontoken3;
	//   64  187:aload_0         
	//   65  188:aload_2         
	//   66  189:putfield        #137 <Field JsonToken _currToken>
		return jsontoken3;
	//   67  192:aload_2         
	//   68  193:areturn         
_L10:
		_matchToken("true", 1);
	//   69  194:aload_0         
	//   70  195:ldc1            #206 <String "true">
	//   71  197:iconst_1        
	//   72  198:invokevirtual   #190 <Method void _matchToken(String, int)>
		JsonToken jsontoken4 = JsonToken.VALUE_TRUE;
	//   73  201:getstatic       #249 <Field JsonToken JsonToken.VALUE_TRUE>
	//   74  204:astore_2        
		_currToken = jsontoken4;
	//   75  205:aload_0         
	//   76  206:aload_2         
	//   77  207:putfield        #137 <Field JsonToken _currToken>
		return jsontoken4;
	//   78  210:aload_2         
	//   79  211:areturn         
_L8:
		_matchToken("null", 1);
	//   80  212:aload_0         
	//   81  213:ldc1            #193 <String "null">
	//   82  215:iconst_1        
	//   83  216:invokevirtual   #190 <Method void _matchToken(String, int)>
		JsonToken jsontoken5 = JsonToken.VALUE_NULL;
	//   84  219:getstatic       #252 <Field JsonToken JsonToken.VALUE_NULL>
	//   85  222:astore_2        
		_currToken = jsontoken5;
	//   86  223:aload_0         
	//   87  224:aload_2         
	//   88  225:putfield        #137 <Field JsonToken _currToken>
		return jsontoken5;
	//   89  228:aload_2         
	//   90  229:areturn         
_L6:
		_matchToken("false", 1);
	//   91  230:aload_0         
	//   92  231:ldc1            #186 <String "false">
	//   93  233:iconst_1        
	//   94  234:invokevirtual   #190 <Method void _matchToken(String, int)>
		JsonToken jsontoken6 = JsonToken.VALUE_FALSE;
	//   95  237:getstatic       #255 <Field JsonToken JsonToken.VALUE_FALSE>
	//   96  240:astore_2        
		_currToken = jsontoken6;
	//   97  241:aload_0         
	//   98  242:aload_2         
	//   99  243:putfield        #137 <Field JsonToken _currToken>
		return jsontoken6;
	//  100  246:aload_2         
	//  101  247:areturn         
_L4:
		if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES))
	//* 102  248:aload_0         
	//* 103  249:getstatic       #258 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_MISSING_VALUES>
	//* 104  252:invokevirtual   #262 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//* 105  255:ifeq            279
		{
			_inputPtr = _inputPtr - 1;
	//  106  258:aload_0         
	//  107  259:aload_0         
	//  108  260:getfield        #65  <Field int _inputPtr>
	//  109  263:iconst_1        
	//  110  264:isub            
	//  111  265:putfield        #65  <Field int _inputPtr>
			JsonToken jsontoken7 = JsonToken.VALUE_NULL;
	//  112  268:getstatic       #252 <Field JsonToken JsonToken.VALUE_NULL>
	//  113  271:astore_2        
			_currToken = jsontoken7;
	//  114  272:aload_0         
	//  115  273:aload_2         
	//  116  274:putfield        #137 <Field JsonToken _currToken>
			return jsontoken7;
	//  117  277:aload_2         
	//  118  278:areturn         
		}
_L15:
		JsonToken jsontoken8 = _handleOddValue(i);
	//  119  279:aload_0         
	//  120  280:iload_1         
	//  121  281:invokevirtual   #265 <Method JsonToken _handleOddValue(int)>
	//  122  284:astore_2        
		_currToken = jsontoken8;
	//  123  285:aload_0         
	//  124  286:aload_2         
	//  125  287:putfield        #137 <Field JsonToken _currToken>
		return jsontoken8;
	//  126  290:aload_2         
	//  127  291:areturn         
_L2:
		_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//  128  292:aload_0         
	//  129  293:aload_0         
	//  130  294:getfield        #114 <Field JsonReadContext _parsingContext>
	//  131  297:aload_0         
	//  132  298:getfield        #220 <Field int _tokenInputRow>
	//  133  301:aload_0         
	//  134  302:getfield        #223 <Field int _tokenInputCol>
	//  135  305:invokevirtual   #227 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//  136  308:putfield        #114 <Field JsonReadContext _parsingContext>
		JsonToken jsontoken9 = JsonToken.START_ARRAY;
	//  137  311:getstatic       #217 <Field JsonToken JsonToken.START_ARRAY>
	//  138  314:astore_2        
		_currToken = jsontoken9;
	//  139  315:aload_0         
	//  140  316:aload_2         
	//  141  317:putfield        #137 <Field JsonToken _currToken>
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
label0:
		{
			int k2 = _inputEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int _inputEnd>
	//    2    4:istore          12
			l1 = 0;
	//    3    6:iconst_0        
	//    4    7:istore          8
			boolean flag1 = false;
	//    5    9:iconst_0        
	//    6   10:istore          11
			if(i == 46)
	//*   7   12:iload_1         
	//*   8   13:bipush          46
	//*   9   15:icmpne          105
			{
				i = 0;
	//   10   18:iconst_0        
	//   11   19:istore_1        
				int i1 = k;
	//   12   20:iload_3         
	//   13   21:istore          6
				do
				{
					if(i1 >= k2)
	//*  14   23:iload           6
	//*  15   25:iload           12
	//*  16   27:icmplt          38
						return _parseNumber2(flag, j);
	//   17   30:aload_0         
	//   18   31:iload           4
	//   19   33:iload_2         
	//   20   34:invokespecial   #271 <Method JsonToken _parseNumber2(boolean, int)>
	//   21   37:areturn         
					char ac[] = _inputBuffer;
	//   22   38:aload_0         
	//   23   39:getfield        #62  <Field char[] _inputBuffer>
	//   24   42:astore          13
					k = i1 + 1;
	//   25   44:iload           6
	//   26   46:iconst_1        
	//   27   47:iadd            
	//   28   48:istore_3        
					i1 = ((int) (ac[i1]));
	//   29   49:aload           13
	//   30   51:iload           6
	//   31   53:caload          
	//   32   54:istore          6
					if(i1 < '0' || i1 > '9')
	//*  33   56:iload           6
	//*  34   58:bipush          48
	//*  35   60:icmplt          83
	//*  36   63:iload           6
	//*  37   65:bipush          57
	//*  38   67:icmple          73
						break;
	//   39   70:goto            83
					i++;
	//   40   73:iload_1         
	//   41   74:iconst_1        
	//   42   75:iadd            
	//   43   76:istore_1        
					i1 = k;
	//   44   77:iload_3         
	//   45   78:istore          6
				} while(true);
	//   46   80:goto            23
				if(i == 0)
	//*  47   83:iload_1         
	//*  48   84:ifne            96
					reportUnexpectedNumberChar(i1, "Decimal point not followed by a digit");
	//   49   87:aload_0         
	//   50   88:iload           6
	//   51   90:ldc2            #273 <String "Decimal point not followed by a digit">
	//   52   93:invokevirtual   #277 <Method void reportUnexpectedNumberChar(int, String)>
				k1 = i;
	//   53   96:iload_1         
	//   54   97:istore          7
				i = i1;
	//   55   99:iload           6
	//   56  101:istore_1        
			} else
	//*  57  102:goto            108
			{
				k1 = 0;
	//   58  105:iconst_0        
	//   59  106:istore          7
			}
			if(i != 101)
	//*  60  108:iload_1         
	//*  61  109:bipush          101
	//*  62  111:icmpeq          126
			{
				i2 = i;
	//   63  114:iload_1         
	//   64  115:istore          9
				j2 = k;
	//   65  117:iload_3         
	//   66  118:istore          10
				if(i != 69)
					break label0;
	//   67  120:iload_1         
	//   68  121:bipush          69
	//   69  123:icmpne          310
			}
			if(k >= k2)
	//*  70  126:iload_3         
	//*  71  127:iload           12
	//*  72  129:icmplt          145
			{
				_inputPtr = j;
	//   73  132:aload_0         
	//   74  133:iload_2         
	//   75  134:putfield        #65  <Field int _inputPtr>
				return _parseNumber2(flag, j);
	//   76  137:aload_0         
	//   77  138:iload           4
	//   78  140:iload_2         
	//   79  141:invokespecial   #271 <Method JsonToken _parseNumber2(boolean, int)>
	//   80  144:areturn         
			}
			char ac1[] = _inputBuffer;
	//   81  145:aload_0         
	//   82  146:getfield        #62  <Field char[] _inputBuffer>
	//   83  149:astore          13
			i = k + 1;
	//   84  151:iload_3         
	//   85  152:iconst_1        
	//   86  153:iadd            
	//   87  154:istore_1        
			k = ((int) (ac1[k]));
	//   88  155:aload           13
	//   89  157:iload_3         
	//   90  158:caload          
	//   91  159:istore_3        
			int j1;
			if(k != 45 && k != 43)
	//*  92  160:iload_3         
	//*  93  161:bipush          45
	//*  94  163:icmpeq          182
	//*  95  166:iload_3         
	//*  96  167:bipush          43
	//*  97  169:icmpne          175
	//*  98  172:goto            182
			{
				j1 = ((int) (flag1));
	//   99  175:iload           11
	//  100  177:istore          6
			} else
	//* 101  179:goto            226
			{
				if(i >= k2)
	//* 102  182:iload_1         
	//* 103  183:iload           12
	//* 104  185:icmplt          201
				{
					_inputPtr = j;
	//  105  188:aload_0         
	//  106  189:iload_2         
	//  107  190:putfield        #65  <Field int _inputPtr>
					return _parseNumber2(flag, j);
	//  108  193:aload_0         
	//  109  194:iload           4
	//  110  196:iload_2         
	//  111  197:invokespecial   #271 <Method JsonToken _parseNumber2(boolean, int)>
	//  112  200:areturn         
				}
				char ac2[] = _inputBuffer;
	//  113  201:aload_0         
	//  114  202:getfield        #62  <Field char[] _inputBuffer>
	//  115  205:astore          13
				k = i + 1;
	//  116  207:iload_1         
	//  117  208:iconst_1        
	//  118  209:iadd            
	//  119  210:istore_3        
				j1 = ((int) (ac2[i]));
	//  120  211:aload           13
	//  121  213:iload_1         
	//  122  214:caload          
	//  123  215:istore          6
				i = k;
	//  124  217:iload_3         
	//  125  218:istore_1        
				k = j1;
	//  126  219:iload           6
	//  127  221:istore_3        
				j1 = ((int) (flag1));
	//  128  222:iload           11
	//  129  224:istore          6
			}
			while(k <= 57 && k >= 48) 
	//* 130  226:iload_3         
	//* 131  227:bipush          57
	//* 132  229:icmpgt          277
	//* 133  232:iload_3         
	//* 134  233:bipush          48
	//* 135  235:icmplt          277
			{
				j1++;
	//  136  238:iload           6
	//  137  240:iconst_1        
	//  138  241:iadd            
	//  139  242:istore          6
				if(i >= k2)
	//* 140  244:iload_1         
	//* 141  245:iload           12
	//* 142  247:icmplt          263
				{
					_inputPtr = j;
	//  143  250:aload_0         
	//  144  251:iload_2         
	//  145  252:putfield        #65  <Field int _inputPtr>
					return _parseNumber2(flag, j);
	//  146  255:aload_0         
	//  147  256:iload           4
	//  148  258:iload_2         
	//  149  259:invokespecial   #271 <Method JsonToken _parseNumber2(boolean, int)>
	//  150  262:areturn         
				}
				k = ((int) (_inputBuffer[i]));
	//  151  263:aload_0         
	//  152  264:getfield        #62  <Field char[] _inputBuffer>
	//  153  267:iload_1         
	//  154  268:caload          
	//  155  269:istore_3        
				i++;
	//  156  270:iload_1         
	//  157  271:iconst_1        
	//  158  272:iadd            
	//  159  273:istore_1        
			}
	//* 160  274:goto            226
			l1 = j1;
	//  161  277:iload           6
	//  162  279:istore          8
			i2 = k;
	//  163  281:iload_3         
	//  164  282:istore          9
			j2 = i;
	//  165  284:iload_1         
	//  166  285:istore          10
			if(j1 == 0)
	//* 167  287:iload           6
	//* 168  289:ifne            310
			{
				reportUnexpectedNumberChar(k, "Exponent indicator not followed by a digit");
	//  169  292:aload_0         
	//  170  293:iload_3         
	//  171  294:ldc2            #279 <String "Exponent indicator not followed by a digit">
	//  172  297:invokevirtual   #277 <Method void reportUnexpectedNumberChar(int, String)>
				j2 = i;
	//  173  300:iload_1         
	//  174  301:istore          10
				i2 = k;
	//  175  303:iload_3         
	//  176  304:istore          9
				l1 = j1;
	//  177  306:iload           6
	//  178  308:istore          8
			}
		}
		i = j2 - 1;
	//  179  310:iload           10
	//  180  312:iconst_1        
	//  181  313:isub            
	//  182  314:istore_1        
		_inputPtr = i;
	//  183  315:aload_0         
	//  184  316:iload_1         
	//  185  317:putfield        #65  <Field int _inputPtr>
		if(_parsingContext.inRoot())
	//* 186  320:aload_0         
	//* 187  321:getfield        #114 <Field JsonReadContext _parsingContext>
	//* 188  324:invokevirtual   #282 <Method boolean JsonReadContext.inRoot()>
	//* 189  327:ifeq            336
			_verifyRootSpace(i2);
	//  190  330:aload_0         
	//  191  331:iload           9
	//  192  333:invokespecial   #285 <Method void _verifyRootSpace(int)>
		_textBuffer.resetWithShared(_inputBuffer, j, i - j);
	//  193  336:aload_0         
	//  194  337:getfield        #149 <Field TextBuffer _textBuffer>
	//  195  340:aload_0         
	//  196  341:getfield        #62  <Field char[] _inputBuffer>
	//  197  344:iload_2         
	//  198  345:iload_1         
	//  199  346:iload_2         
	//  200  347:isub            
	//  201  348:invokevirtual   #155 <Method void TextBuffer.resetWithShared(char[], int, int)>
		return resetFloat(flag, l, k1, l1);
	//  202  351:aload_0         
	//  203  352:iload           4
	//  204  354:iload           5
	//  205  356:iload           7
	//  206  358:iload           8
	//  207  360:invokevirtual   #289 <Method JsonToken resetFloat(boolean, int, int, int)>
	//  208  363:areturn         
	}

	private String _parseName2(int i, int j, int k)
		throws IOException
	{
		_textBuffer.resetWithShared(_inputBuffer, i, _inputPtr - i);
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field TextBuffer _textBuffer>
	//    2    4:aload_0         
	//    3    5:getfield        #62  <Field char[] _inputBuffer>
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #65  <Field int _inputPtr>
	//    7   13:iload_1         
	//    8   14:isub            
	//    9   15:invokevirtual   #155 <Method void TextBuffer.resetWithShared(char[], int, int)>
		Object obj = ((Object) (_textBuffer.getCurrentSegment()));
	//   10   18:aload_0         
	//   11   19:getfield        #149 <Field TextBuffer _textBuffer>
	//   12   22:invokevirtual   #158 <Method char[] TextBuffer.getCurrentSegment()>
	//   13   25:astore          7
		i = _textBuffer.getCurrentSegmentSize();
	//   14   27:aload_0         
	//   15   28:getfield        #149 <Field TextBuffer _textBuffer>
	//   16   31:invokevirtual   #161 <Method int TextBuffer.getCurrentSegmentSize()>
	//   17   34:istore_1        
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*  18   35:aload_0         
	//*  19   36:getfield        #65  <Field int _inputPtr>
	//*  20   39:aload_0         
	//*  21   40:getfield        #68  <Field int _inputEnd>
	//*  22   43:icmplt          63
	//*  23   46:aload_0         
	//*  24   47:invokevirtual   #164 <Method boolean _loadMore()>
	//*  25   50:ifne            63
				_reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
	//   26   53:aload_0         
	//   27   54:ldc2            #293 <String " in field name">
	//   28   57:getstatic       #296 <Field JsonToken JsonToken.FIELD_NAME>
	//   29   60:invokevirtual   #300 <Method void _reportInvalidEOF(String, JsonToken)>
			char ac[] = _inputBuffer;
	//   30   63:aload_0         
	//   31   64:getfield        #62  <Field char[] _inputBuffer>
	//   32   67:astore          8
			int l = _inputPtr;
	//   33   69:aload_0         
	//   34   70:getfield        #65  <Field int _inputPtr>
	//   35   73:istore          6
			_inputPtr = l + 1;
	//   36   75:aload_0         
	//   37   76:iload           6
	//   38   78:iconst_1        
	//   39   79:iadd            
	//   40   80:putfield        #65  <Field int _inputPtr>
			char c1 = ac[l];
	//   41   83:aload           8
	//   42   85:iload           6
	//   43   87:caload          
	//   44   88:istore          5
			char c = c1;
	//   45   90:iload           5
	//   46   92:istore          4
			if(c1 <= '\\')
	//*  47   94:iload           5
	//*  48   96:bipush          92
	//*  49   98:icmpgt          203
				if(c1 == '\\')
	//*  50  101:iload           5
	//*  51  103:bipush          92
	//*  52  105:icmpne          117
				{
					c = _decodeEscaped();
	//   53  108:aload_0         
	//   54  109:invokevirtual   #304 <Method char _decodeEscaped()>
	//   55  112:istore          4
				} else
	//*  56  114:goto            203
				{
					c = c1;
	//   57  117:iload           5
	//   58  119:istore          4
					if(c1 <= k)
	//*  59  121:iload           5
	//*  60  123:iload_3         
	//*  61  124:icmpgt          203
					{
						if(c1 == k)
	//*  62  127:iload           5
	//*  63  129:iload_3         
	//*  64  130:icmpne          179
						{
							_textBuffer.setCurrentLength(i);
	//   65  133:aload_0         
	//   66  134:getfield        #149 <Field TextBuffer _textBuffer>
	//   67  137:iload_1         
	//   68  138:invokevirtual   #167 <Method void TextBuffer.setCurrentLength(int)>
							obj = ((Object) (_textBuffer));
	//   69  141:aload_0         
	//   70  142:getfield        #149 <Field TextBuffer _textBuffer>
	//   71  145:astore          7
							char ac1[] = ((TextBuffer) (obj)).getTextBuffer();
	//   72  147:aload           7
	//   73  149:invokevirtual   #170 <Method char[] TextBuffer.getTextBuffer()>
	//   74  152:astore          8
							i = ((TextBuffer) (obj)).getTextOffset();
	//   75  154:aload           7
	//   76  156:invokevirtual   #173 <Method int TextBuffer.getTextOffset()>
	//   77  159:istore_1        
							k = ((TextBuffer) (obj)).size();
	//   78  160:aload           7
	//   79  162:invokevirtual   #176 <Method int TextBuffer.size()>
	//   80  165:istore_3        
							return _symbols.findSymbol(ac1, i, k, j);
	//   81  166:aload_0         
	//   82  167:getfield        #72  <Field CharsToNameCanonicalizer _symbols>
	//   83  170:aload           8
	//   84  172:iload_1         
	//   85  173:iload_3         
	//   86  174:iload_2         
	//   87  175:invokevirtual   #180 <Method String CharsToNameCanonicalizer.findSymbol(char[], int, int, int)>
	//   88  178:areturn         
						}
						c = c1;
	//   89  179:iload           5
	//   90  181:istore          4
						if(c1 < ' ')
	//*  91  183:iload           5
	//*  92  185:bipush          32
	//*  93  187:icmpge          203
						{
							_throwUnquotedSpace(((int) (c1)), "name");
	//   94  190:aload_0         
	//   95  191:iload           5
	//   96  193:ldc2            #306 <String "name">
	//   97  196:invokevirtual   #309 <Method void _throwUnquotedSpace(int, String)>
							c = c1;
	//   98  199:iload           5
	//   99  201:istore          4
						}
					}
				}
			j = j * 33 + c;
	//  100  203:iload_2         
	//  101  204:bipush          33
	//  102  206:imul            
	//  103  207:iload           4
	//  104  209:iadd            
	//  105  210:istore_2        
			l = i + 1;
	//  106  211:iload_1         
	//  107  212:iconst_1        
	//  108  213:iadd            
	//  109  214:istore          6
			obj[i] = c;
	//  110  216:aload           7
	//  111  218:iload_1         
	//  112  219:iload           4
	//  113  221:castore         
			if(l >= obj.length)
	//* 114  222:iload           6
	//* 115  224:aload           7
	//* 116  226:arraylength     
	//* 117  227:icmplt          244
			{
				obj = ((Object) (_textBuffer.finishCurrentSegment()));
	//  118  230:aload_0         
	//  119  231:getfield        #149 <Field TextBuffer _textBuffer>
	//  120  234:invokevirtual   #183 <Method char[] TextBuffer.finishCurrentSegment()>
	//  121  237:astore          7
				i = 0;
	//  122  239:iconst_0        
	//  123  240:istore_1        
			} else
	//* 124  241:goto            35
			{
				i = l;
	//  125  244:iload           6
	//  126  246:istore_1        
			}
		} while(true);
	//  127  247:goto            35
	}

	private final JsonToken _parseNumber2(boolean flag, int i)
		throws IOException
	{
		char c;
		int j;
		int j1;
		int k1;
		char ac1[];
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
	//   10   15:putfield        #65  <Field int _inputPtr>
			char ac2[] = _textBuffer.emptyAndGetCurrentSegment();
	//   11   18:aload_0         
	//   12   19:getfield        #149 <Field TextBuffer _textBuffer>
	//   13   22:invokevirtual   #312 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//   14   25:astore          14
			k1 = 0;
	//   15   27:iconst_0        
	//   16   28:istore          9
			if(flag)
	//*  17   30:iload_1         
	//*  18   31:ifeq            45
			{
				ac2[0] = '-';
	//   19   34:aload           14
	//   20   36:iconst_0        
	//   21   37:bipush          45
	//   22   39:castore         
				i = 1;
	//   23   40:iconst_1        
	//   24   41:istore_2        
			} else
	//*  25   42:goto            47
			{
				i = 0;
	//   26   45:iconst_0        
	//   27   46:istore_2        
			}
			if(_inputPtr < _inputEnd)
	//*  28   47:aload_0         
	//*  29   48:getfield        #65  <Field int _inputPtr>
	//*  30   51:aload_0         
	//*  31   52:getfield        #68  <Field int _inputEnd>
	//*  32   55:icmpge          87
			{
				char ac[] = _inputBuffer;
	//   33   58:aload_0         
	//   34   59:getfield        #62  <Field char[] _inputBuffer>
	//   35   62:astore          13
				j = _inputPtr;
	//   36   64:aload_0         
	//   37   65:getfield        #65  <Field int _inputPtr>
	//   38   68:istore          5
				_inputPtr = j + 1;
	//   39   70:aload_0         
	//   40   71:iload           5
	//   41   73:iconst_1        
	//   42   74:iadd            
	//   43   75:putfield        #65  <Field int _inputPtr>
				c = ac[j];
	//   44   78:aload           13
	//   45   80:iload           5
	//   46   82:caload          
	//   47   83:istore_3        
			} else
	//*  48   84:goto            98
			{
				c = getNextChar("No digit following minus sign", JsonToken.VALUE_NUMBER_INT);
	//   49   87:aload_0         
	//   50   88:ldc2            #314 <String "No digit following minus sign">
	//   51   91:getstatic       #317 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//   52   94:invokevirtual   #321 <Method char getNextChar(String, JsonToken)>
	//   53   97:istore_3        
			}
			char c1 = c;
	//   54   98:iload_3         
	//   55   99:istore          4
			if(c == '0')
	//*  56  101:iload_3         
	//*  57  102:bipush          48
	//*  58  104:icmpne          113
				c1 = _verifyNoLeadingZeroes();
	//   59  107:aload_0         
	//   60  108:invokespecial   #324 <Method char _verifyNoLeadingZeroes()>
	//   61  111:istore          4
			j = 0;
	//   62  113:iconst_0        
	//   63  114:istore          5
			c = c1;
	//   64  116:iload           4
	//   65  118:istore_3        
			do
			{
				if(c < '0' || c > '9')
					break;
	//   66  119:iload_3         
	//   67  120:bipush          48
	//   68  122:icmplt          237
	//   69  125:iload_3         
	//   70  126:bipush          57
	//   71  128:icmpgt          237
				j1 = j + 1;
	//   72  131:iload           5
	//   73  133:iconst_1        
	//   74  134:iadd            
	//   75  135:istore          8
				j = i;
	//   76  137:iload_2         
	//   77  138:istore          5
				ac1 = ac2;
	//   78  140:aload           14
	//   79  142:astore          13
				if(i >= ac2.length)
	//*  80  144:iload_2         
	//*  81  145:aload           14
	//*  82  147:arraylength     
	//*  83  148:icmplt          163
				{
					ac1 = _textBuffer.finishCurrentSegment();
	//   84  151:aload_0         
	//   85  152:getfield        #149 <Field TextBuffer _textBuffer>
	//   86  155:invokevirtual   #183 <Method char[] TextBuffer.finishCurrentSegment()>
	//   87  158:astore          13
					j = 0;
	//   88  160:iconst_0        
	//   89  161:istore          5
				}
				i = j + 1;
	//   90  163:iload           5
	//   91  165:iconst_1        
	//   92  166:iadd            
	//   93  167:istore_2        
				ac1[j] = c;
	//   94  168:aload           13
	//   95  170:iload           5
	//   96  172:iload_3         
	//   97  173:castore         
				if(_inputPtr >= _inputEnd && !_loadMore())
	//*  98  174:aload_0         
	//*  99  175:getfield        #65  <Field int _inputPtr>
	//* 100  178:aload_0         
	//* 101  179:getfield        #68  <Field int _inputEnd>
	//* 102  182:icmplt          200
	//* 103  185:aload_0         
	//* 104  186:invokevirtual   #164 <Method boolean _loadMore()>
	//* 105  189:ifne            200
				{
					c = '\0';
	//  106  192:iconst_0        
	//  107  193:istore_3        
					j = 1;
	//  108  194:iconst_1        
	//  109  195:istore          5
					break label0;
	//  110  197:goto            252
				}
				ac2 = _inputBuffer;
	//  111  200:aload_0         
	//  112  201:getfield        #62  <Field char[] _inputBuffer>
	//  113  204:astore          14
				j = _inputPtr;
	//  114  206:aload_0         
	//  115  207:getfield        #65  <Field int _inputPtr>
	//  116  210:istore          5
				_inputPtr = j + 1;
	//  117  212:aload_0         
	//  118  213:iload           5
	//  119  215:iconst_1        
	//  120  216:iadd            
	//  121  217:putfield        #65  <Field int _inputPtr>
				c = ac2[j];
	//  122  220:aload           14
	//  123  222:iload           5
	//  124  224:caload          
	//  125  225:istore_3        
				ac2 = ac1;
	//  126  226:aload           13
	//  127  228:astore          14
				j = j1;
	//  128  230:iload           8
	//  129  232:istore          5
			} while(true);
	//  130  234:goto            119
			boolean flag1 = false;
	//  131  237:iconst_0        
	//  132  238:istore          6
			j1 = j;
	//  133  240:iload           5
	//  134  242:istore          8
			j = ((int) (flag1));
	//  135  244:iload           6
	//  136  246:istore          5
			ac1 = ac2;
	//  137  248:aload           14
	//  138  250:astore          13
		}
		int i1;
		int l1;
		int i2;
		char c3;
label1:
		{
			int l;
label2:
			{
				if(j1 == 0)
	//* 139  252:iload           8
	//* 140  254:ifne            264
					return _handleInvalidNumberStart(((int) (c)), flag);
	//  141  257:aload_0         
	//  142  258:iload_3         
	//  143  259:iload_1         
	//  144  260:invokevirtual   #328 <Method JsonToken _handleInvalidNumberStart(int, boolean)>
	//  145  263:areturn         
				char ac3[];
				if(c == '.')
	//* 146  264:iload_3         
	//* 147  265:bipush          46
	//* 148  267:icmpne          482
				{
					int k = i;
	//  149  270:iload_2         
	//  150  271:istore          6
					ac3 = ac1;
	//  151  273:aload           13
	//  152  275:astore          14
					if(i >= ac1.length)
	//* 153  277:iload_2         
	//* 154  278:aload           13
	//* 155  280:arraylength     
	//* 156  281:icmplt          296
					{
						ac3 = _textBuffer.finishCurrentSegment();
	//  157  284:aload_0         
	//  158  285:getfield        #149 <Field TextBuffer _textBuffer>
	//  159  288:invokevirtual   #183 <Method char[] TextBuffer.finishCurrentSegment()>
	//  160  291:astore          14
						k = 0;
	//  161  293:iconst_0        
	//  162  294:istore          6
					}
					i = k + 1;
	//  163  296:iload           6
	//  164  298:iconst_1        
	//  165  299:iadd            
	//  166  300:istore_2        
					ac3[k] = c;
	//  167  301:aload           14
	//  168  303:iload           6
	//  169  305:iload_3         
	//  170  306:castore         
					k = 0;
	//  171  307:iconst_0        
	//  172  308:istore          6
					ac1 = ac3;
	//  173  310:aload           14
	//  174  312:astore          13
					do
					{
						if(_inputPtr >= _inputEnd && !_loadMore())
	//* 175  314:aload_0         
	//* 176  315:getfield        #65  <Field int _inputPtr>
	//* 177  318:aload_0         
	//* 178  319:getfield        #68  <Field int _inputEnd>
	//* 179  322:icmplt          338
	//* 180  325:aload_0         
	//* 181  326:invokevirtual   #164 <Method boolean _loadMore()>
	//* 182  329:ifne            338
						{
							i1 = 1;
	//  183  332:iconst_1        
	//  184  333:istore          7
							break;
	//  185  335:goto            454
						}
						ac3 = _inputBuffer;
	//  186  338:aload_0         
	//  187  339:getfield        #62  <Field char[] _inputBuffer>
	//  188  342:astore          14
						i1 = _inputPtr;
	//  189  344:aload_0         
	//  190  345:getfield        #65  <Field int _inputPtr>
	//  191  348:istore          7
						_inputPtr = i1 + 1;
	//  192  350:aload_0         
	//  193  351:iload           7
	//  194  353:iconst_1        
	//  195  354:iadd            
	//  196  355:putfield        #65  <Field int _inputPtr>
						char c2 = ac3[i1];
	//  197  358:aload           14
	//  198  360:iload           7
	//  199  362:caload          
	//  200  363:istore          4
						c = c2;
	//  201  365:iload           4
	//  202  367:istore_3        
						i1 = j;
	//  203  368:iload           5
	//  204  370:istore          7
						if(c2 < '0')
							break;
	//  205  372:iload           4
	//  206  374:bipush          48
	//  207  376:icmplt          454
						if(c2 > '9')
	//* 208  379:iload           4
	//* 209  381:bipush          57
	//* 210  383:icmple          396
						{
							c = c2;
	//  211  386:iload           4
	//  212  388:istore_3        
							i1 = j;
	//  213  389:iload           5
	//  214  391:istore          7
							break;
	//  215  393:goto            454
						}
						i1 = k + 1;
	//  216  396:iload           6
	//  217  398:iconst_1        
	//  218  399:iadd            
	//  219  400:istore          7
						ac3 = ac1;
	//  220  402:aload           13
	//  221  404:astore          14
						k = i;
	//  222  406:iload_2         
	//  223  407:istore          6
						if(i >= ac1.length)
	//* 224  409:iload_2         
	//* 225  410:aload           13
	//* 226  412:arraylength     
	//* 227  413:icmplt          428
						{
							ac3 = _textBuffer.finishCurrentSegment();
	//  228  416:aload_0         
	//  229  417:getfield        #149 <Field TextBuffer _textBuffer>
	//  230  420:invokevirtual   #183 <Method char[] TextBuffer.finishCurrentSegment()>
	//  231  423:astore          14
							k = 0;
	//  232  425:iconst_0        
	//  233  426:istore          6
						}
						ac3[k] = c2;
	//  234  428:aload           14
	//  235  430:iload           6
	//  236  432:iload           4
	//  237  434:castore         
						i = k + 1;
	//  238  435:iload           6
	//  239  437:iconst_1        
	//  240  438:iadd            
	//  241  439:istore_2        
						k = i1;
	//  242  440:iload           7
	//  243  442:istore          6
						c = c2;
	//  244  444:iload           4
	//  245  446:istore_3        
						ac1 = ac3;
	//  246  447:aload           14
	//  247  449:astore          13
					} while(true);
	//  248  451:goto            314
					if(k == 0)
	//* 249  454:iload           6
	//* 250  456:ifne            467
						reportUnexpectedNumberChar(((int) (c)), "Decimal point not followed by a digit");
	//  251  459:aload_0         
	//  252  460:iload_3         
	//  253  461:ldc2            #273 <String "Decimal point not followed by a digit">
	//  254  464:invokevirtual   #277 <Method void reportUnexpectedNumberChar(int, String)>
					ac3 = ac1;
	//  255  467:aload           13
	//  256  469:astore          14
					j = i1;
	//  257  471:iload           7
	//  258  473:istore          5
					i1 = k;
	//  259  475:iload           6
	//  260  477:istore          7
				} else
	//* 261  479:goto            489
				{
					i1 = 0;
	//  262  482:iconst_0        
	//  263  483:istore          7
					ac3 = ac1;
	//  264  485:aload           13
	//  265  487:astore          14
				}
				if(c != 'e')
	//* 266  489:iload_3         
	//* 267  490:bipush          101
	//* 268  492:icmpeq          511
				{
					l1 = i;
	//  269  495:iload_2         
	//  270  496:istore          10
					c3 = c;
	//  271  498:iload_3         
	//  272  499:istore          12
					i2 = j;
	//  273  501:iload           5
	//  274  503:istore          11
					if(c != 'E')
						break label1;
	//  275  505:iload_3         
	//  276  506:bipush          69
	//  277  508:icmpne          880
				}
				l = i;
	//  278  511:iload_2         
	//  279  512:istore          6
				ac1 = ac3;
	//  280  514:aload           14
	//  281  516:astore          13
				if(i >= ac3.length)
	//* 282  518:iload_2         
	//* 283  519:aload           14
	//* 284  521:arraylength     
	//* 285  522:icmplt          537
				{
					ac1 = _textBuffer.finishCurrentSegment();
	//  286  525:aload_0         
	//  287  526:getfield        #149 <Field TextBuffer _textBuffer>
	//  288  529:invokevirtual   #183 <Method char[] TextBuffer.finishCurrentSegment()>
	//  289  532:astore          13
					l = 0;
	//  290  534:iconst_0        
	//  291  535:istore          6
				}
				i = l + 1;
	//  292  537:iload           6
	//  293  539:iconst_1        
	//  294  540:iadd            
	//  295  541:istore_2        
				ac1[l] = c;
	//  296  542:aload           13
	//  297  544:iload           6
	//  298  546:iload_3         
	//  299  547:castore         
				if(_inputPtr < _inputEnd)
	//* 300  548:aload_0         
	//* 301  549:getfield        #65  <Field int _inputPtr>
	//* 302  552:aload_0         
	//* 303  553:getfield        #68  <Field int _inputEnd>
	//* 304  556:icmpge          588
				{
					char ac4[] = _inputBuffer;
	//  305  559:aload_0         
	//  306  560:getfield        #62  <Field char[] _inputBuffer>
	//  307  563:astore          14
					l = _inputPtr;
	//  308  565:aload_0         
	//  309  566:getfield        #65  <Field int _inputPtr>
	//  310  569:istore          6
					_inputPtr = l + 1;
	//  311  571:aload_0         
	//  312  572:iload           6
	//  313  574:iconst_1        
	//  314  575:iadd            
	//  315  576:putfield        #65  <Field int _inputPtr>
					c = ac4[l];
	//  316  579:aload           14
	//  317  581:iload           6
	//  318  583:caload          
	//  319  584:istore_3        
				} else
	//* 320  585:goto            596
				{
					c = getNextChar("expected a digit for number exponent");
	//  321  588:aload_0         
	//  322  589:ldc2            #330 <String "expected a digit for number exponent">
	//  323  592:invokevirtual   #333 <Method char getNextChar(String)>
	//  324  595:istore_3        
				}
				if(c != '-' && c != '+')
	//* 325  596:iload_3         
	//* 326  597:bipush          45
	//* 327  599:icmpeq          617
	//* 328  602:iload_3         
	//* 329  603:bipush          43
	//* 330  605:icmpne          611
	//* 331  608:goto            617
				{
					l = 0;
	//  332  611:iconst_0        
	//  333  612:istore          6
				} else
	//* 334  614:goto            706
				{
					char ac5[] = ac1;
	//  335  617:aload           13
	//  336  619:astore          14
					l = i;
	//  337  621:iload_2         
	//  338  622:istore          6
					if(i >= ac1.length)
	//* 339  624:iload_2         
	//* 340  625:aload           13
	//* 341  627:arraylength     
	//* 342  628:icmplt          643
					{
						ac5 = _textBuffer.finishCurrentSegment();
	//  343  631:aload_0         
	//  344  632:getfield        #149 <Field TextBuffer _textBuffer>
	//  345  635:invokevirtual   #183 <Method char[] TextBuffer.finishCurrentSegment()>
	//  346  638:astore          14
						l = 0;
	//  347  640:iconst_0        
	//  348  641:istore          6
					}
					ac5[l] = c;
	//  349  643:aload           14
	//  350  645:iload           6
	//  351  647:iload_3         
	//  352  648:castore         
					if(_inputPtr < _inputEnd)
	//* 353  649:aload_0         
	//* 354  650:getfield        #65  <Field int _inputPtr>
	//* 355  653:aload_0         
	//* 356  654:getfield        #68  <Field int _inputEnd>
	//* 357  657:icmpge          686
					{
						ac1 = _inputBuffer;
	//  358  660:aload_0         
	//  359  661:getfield        #62  <Field char[] _inputBuffer>
	//  360  664:astore          13
						i = _inputPtr;
	//  361  666:aload_0         
	//  362  667:getfield        #65  <Field int _inputPtr>
	//  363  670:istore_2        
						_inputPtr = i + 1;
	//  364  671:aload_0         
	//  365  672:iload_2         
	//  366  673:iconst_1        
	//  367  674:iadd            
	//  368  675:putfield        #65  <Field int _inputPtr>
						c = ac1[i];
	//  369  678:aload           13
	//  370  680:iload_2         
	//  371  681:caload          
	//  372  682:istore_3        
					} else
	//* 373  683:goto            694
					{
						c = getNextChar("expected a digit for number exponent");
	//  374  686:aload_0         
	//  375  687:ldc2            #330 <String "expected a digit for number exponent">
	//  376  690:invokevirtual   #333 <Method char getNextChar(String)>
	//  377  693:istore_3        
					}
					i = l + 1;
	//  378  694:iload           6
	//  379  696:iconst_1        
	//  380  697:iadd            
	//  381  698:istore_2        
					l = 0;
	//  382  699:iconst_0        
	//  383  700:istore          6
					ac1 = ac5;
	//  384  702:aload           14
	//  385  704:astore          13
				}
				do
				{
					if(c > '9' || c < '0')
						break;
	//  386  706:iload_3         
	//  387  707:bipush          57
	//  388  709:icmpgt          826
	//  389  712:iload_3         
	//  390  713:bipush          48
	//  391  715:icmplt          826
					l++;
	//  392  718:iload           6
	//  393  720:iconst_1        
	//  394  721:iadd            
	//  395  722:istore          6
					char ac6[] = ac1;
	//  396  724:aload           13
	//  397  726:astore          14
					l1 = i;
	//  398  728:iload_2         
	//  399  729:istore          10
					if(i >= ac1.length)
	//* 400  731:iload_2         
	//* 401  732:aload           13
	//* 402  734:arraylength     
	//* 403  735:icmplt          750
					{
						ac6 = _textBuffer.finishCurrentSegment();
	//  404  738:aload_0         
	//  405  739:getfield        #149 <Field TextBuffer _textBuffer>
	//  406  742:invokevirtual   #183 <Method char[] TextBuffer.finishCurrentSegment()>
	//  407  745:astore          14
						l1 = 0;
	//  408  747:iconst_0        
	//  409  748:istore          10
					}
					k1 = l1 + 1;
	//  410  750:iload           10
	//  411  752:iconst_1        
	//  412  753:iadd            
	//  413  754:istore          9
					ac6[l1] = c;
	//  414  756:aload           14
	//  415  758:iload           10
	//  416  760:iload_3         
	//  417  761:castore         
					if(_inputPtr >= _inputEnd && !_loadMore())
	//* 418  762:aload_0         
	//* 419  763:getfield        #65  <Field int _inputPtr>
	//* 420  766:aload_0         
	//* 421  767:getfield        #68  <Field int _inputEnd>
	//* 422  770:icmplt          793
	//* 423  773:aload_0         
	//* 424  774:invokevirtual   #164 <Method boolean _loadMore()>
	//* 425  777:ifne            793
					{
						i = l;
	//  426  780:iload           6
	//  427  782:istore_2        
						l = 1;
	//  428  783:iconst_1        
	//  429  784:istore          6
						j = k1;
	//  430  786:iload           9
	//  431  788:istore          5
						break label2;
	//  432  790:goto            840
					}
					ac1 = _inputBuffer;
	//  433  793:aload_0         
	//  434  794:getfield        #62  <Field char[] _inputBuffer>
	//  435  797:astore          13
					i = _inputPtr;
	//  436  799:aload_0         
	//  437  800:getfield        #65  <Field int _inputPtr>
	//  438  803:istore_2        
					_inputPtr = i + 1;
	//  439  804:aload_0         
	//  440  805:iload_2         
	//  441  806:iconst_1        
	//  442  807:iadd            
	//  443  808:putfield        #65  <Field int _inputPtr>
					c = ac1[i];
	//  444  811:aload           13
	//  445  813:iload_2         
	//  446  814:caload          
	//  447  815:istore_3        
					i = k1;
	//  448  816:iload           9
	//  449  818:istore_2        
					ac1 = ac6;
	//  450  819:aload           14
	//  451  821:astore          13
				} while(true);
	//  452  823:goto            706
				k1 = l;
	//  453  826:iload           6
	//  454  828:istore          9
				l = j;
	//  455  830:iload           5
	//  456  832:istore          6
				j = i;
	//  457  834:iload_2         
	//  458  835:istore          5
				i = k1;
	//  459  837:iload           9
	//  460  839:istore_2        
			}
			k1 = i;
	//  461  840:iload_2         
	//  462  841:istore          9
			l1 = j;
	//  463  843:iload           5
	//  464  845:istore          10
			c3 = c;
	//  465  847:iload_3         
	//  466  848:istore          12
			i2 = l;
	//  467  850:iload           6
	//  468  852:istore          11
			if(i == 0)
	//* 469  854:iload_2         
	//* 470  855:ifne            880
			{
				reportUnexpectedNumberChar(((int) (c)), "Exponent indicator not followed by a digit");
	//  471  858:aload_0         
	//  472  859:iload_3         
	//  473  860:ldc2            #279 <String "Exponent indicator not followed by a digit">
	//  474  863:invokevirtual   #277 <Method void reportUnexpectedNumberChar(int, String)>
				i2 = l;
	//  475  866:iload           6
	//  476  868:istore          11
				c3 = c;
	//  477  870:iload_3         
	//  478  871:istore          12
				l1 = j;
	//  479  873:iload           5
	//  480  875:istore          10
				k1 = i;
	//  481  877:iload_2         
	//  482  878:istore          9
			}
		}
		if(i2 == 0)
	//* 483  880:iload           11
	//* 484  882:ifne            911
		{
			_inputPtr = _inputPtr - 1;
	//  485  885:aload_0         
	//  486  886:aload_0         
	//  487  887:getfield        #65  <Field int _inputPtr>
	//  488  890:iconst_1        
	//  489  891:isub            
	//  490  892:putfield        #65  <Field int _inputPtr>
			if(_parsingContext.inRoot())
	//* 491  895:aload_0         
	//* 492  896:getfield        #114 <Field JsonReadContext _parsingContext>
	//* 493  899:invokevirtual   #282 <Method boolean JsonReadContext.inRoot()>
	//* 494  902:ifeq            911
				_verifyRootSpace(((int) (c3)));
	//  495  905:aload_0         
	//  496  906:iload           12
	//  497  908:invokespecial   #285 <Method void _verifyRootSpace(int)>
		}
		_textBuffer.setCurrentLength(l1);
	//  498  911:aload_0         
	//  499  912:getfield        #149 <Field TextBuffer _textBuffer>
	//  500  915:iload           10
	//  501  917:invokevirtual   #167 <Method void TextBuffer.setCurrentLength(int)>
		return reset(flag, j1, i1, k1);
	//  502  920:aload_0         
	//  503  921:iload_1         
	//  504  922:iload           8
	//  505  924:iload           7
	//  506  926:iload           9
	//  507  928:invokevirtual   #336 <Method JsonToken reset(boolean, int, int, int)>
	//  508  931:areturn         
	}

	private final int _skipAfterComma2()
		throws IOException
	{
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #68  <Field int _inputEnd>
	//*   4    8:icmplt          66
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #164 <Method boolean _loadMore()>
	//*   7   15:ifeq            21
	//*   8   18:goto            66
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    9   21:new             #339 <Class StringBuilder>
	//   10   24:dup             
	//   11   25:invokespecial   #341 <Method void StringBuilder()>
	//   12   28:astore_2        
				stringbuilder.append("Unexpected end-of-input within/between ");
	//   13   29:aload_2         
	//   14   30:ldc2            #343 <String "Unexpected end-of-input within/between ">
	//   15   33:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   16   36:pop             
				stringbuilder.append(_parsingContext.typeDesc());
	//   17   37:aload_2         
	//   18   38:aload_0         
	//   19   39:getfield        #114 <Field JsonReadContext _parsingContext>
	//   20   42:invokevirtual   #351 <Method String JsonReadContext.typeDesc()>
	//   21   45:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:pop             
				stringbuilder.append(" entries");
	//   23   49:aload_2         
	//   24   50:ldc2            #353 <String " entries">
	//   25   53:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   26   56:pop             
				throw _constructError(stringbuilder.toString());
	//   27   57:aload_0         
	//   28   58:aload_2         
	//   29   59:invokevirtual   #356 <Method String StringBuilder.toString()>
	//   30   62:invokevirtual   #360 <Method JsonParseException _constructError(String)>
	//   31   65:athrow          
			}
			char ac[] = _inputBuffer;
	//   32   66:aload_0         
	//   33   67:getfield        #62  <Field char[] _inputBuffer>
	//   34   70:astore_2        
			int i = _inputPtr;
	//   35   71:aload_0         
	//   36   72:getfield        #65  <Field int _inputPtr>
	//   37   75:istore_1        
			_inputPtr = i + 1;
	//   38   76:aload_0         
	//   39   77:iload_1         
	//   40   78:iconst_1        
	//   41   79:iadd            
	//   42   80:putfield        #65  <Field int _inputPtr>
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
	//   54  100:invokespecial   #363 <Method void _skipComment()>
				else
	//*  55  103:goto            0
				if(i != '#' || !_skipYAMLComment())
	//*  56  106:iload_1         
	//*  57  107:bipush          35
	//*  58  109:icmpne          122
	//*  59  112:aload_0         
	//*  60  113:invokespecial   #366 <Method boolean _skipYAMLComment()>
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
	//   73  138:getfield        #369 <Field int _currInputRow>
	//   74  141:iconst_1        
	//   75  142:iadd            
	//   76  143:putfield        #369 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   77  146:aload_0         
	//   78  147:aload_0         
	//   79  148:getfield        #65  <Field int _inputPtr>
	//   80  151:putfield        #372 <Field int _currInputRowStart>
				} else
	//*  81  154:goto            0
				if(i == '\r')
	//*  82  157:iload_1         
	//*  83  158:bipush          13
	//*  84  160:icmpne          170
					_skipCR();
	//   85  163:aload_0         
	//   86  164:invokevirtual   #375 <Method void _skipCR()>
				else
	//*  87  167:goto            0
				if(i != '\t')
	//*  88  170:iload_1         
	//*  89  171:bipush          9
	//*  90  173:icmpeq          0
					_throwInvalidSpace(i);
	//   91  176:aload_0         
	//   92  177:iload_1         
	//   93  178:invokevirtual   #378 <Method void _throwInvalidSpace(int)>
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
	//*   1    1:getfield        #65  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #68  <Field int _inputEnd>
	//*   4    8:icmplt          18
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #164 <Method boolean _loadMore()>
	//*   7   15:ifeq            69
					{
						char ac[] = _inputBuffer;
	//    8   18:aload_0         
	//    9   19:getfield        #62  <Field char[] _inputBuffer>
	//   10   22:astore_2        
						i = _inputPtr;
	//   11   23:aload_0         
	//   12   24:getfield        #65  <Field int _inputPtr>
	//   13   27:istore_1        
						_inputPtr = i + 1;
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:putfield        #65  <Field int _inputPtr>
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
	//   30   52:getfield        #65  <Field int _inputPtr>
	//   31   55:aload_0         
	//   32   56:getfield        #68  <Field int _inputEnd>
	//   33   59:icmplt          78
	//   34   62:aload_0         
	//   35   63:invokevirtual   #164 <Method boolean _loadMore()>
	//   36   66:ifne            78
					}
					_reportInvalidEOF(" in a comment", ((JsonToken) (null)));
	//   37   69:aload_0         
	//   38   70:ldc2            #381 <String " in a comment">
	//   39   73:aconst_null     
	//   40   74:invokevirtual   #300 <Method void _reportInvalidEOF(String, JsonToken)>
					return;
	//   41   77:return          
				}
				if(_inputBuffer[_inputPtr] == '/')
	//*  42   78:aload_0         
	//*  43   79:getfield        #62  <Field char[] _inputBuffer>
	//*  44   82:aload_0         
	//*  45   83:getfield        #65  <Field int _inputPtr>
	//*  46   86:caload          
	//*  47   87:bipush          47
	//*  48   89:icmpne          0
				{
					_inputPtr = _inputPtr + 1;
	//   49   92:aload_0         
	//   50   93:aload_0         
	//   51   94:getfield        #65  <Field int _inputPtr>
	//   52   97:iconst_1        
	//   53   98:iadd            
	//   54   99:putfield        #65  <Field int _inputPtr>
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
	//   64  117:getfield        #369 <Field int _currInputRow>
	//   65  120:iconst_1        
	//   66  121:iadd            
	//   67  122:putfield        #369 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   68  125:aload_0         
	//   69  126:aload_0         
	//   70  127:getfield        #65  <Field int _inputPtr>
	//   71  130:putfield        #372 <Field int _currInputRowStart>
				} else
	//*  72  133:goto            0
				if(i == '\r')
	//*  73  136:iload_1         
	//*  74  137:bipush          13
	//*  75  139:icmpne          149
					_skipCR();
	//   76  142:aload_0         
	//   77  143:invokevirtual   #375 <Method void _skipCR()>
				else
	//*  78  146:goto            0
				if(i != '\t')
	//*  79  149:iload_1         
	//*  80  150:bipush          9
	//*  81  152:icmpeq          0
					_throwInvalidSpace(i);
	//   82  155:aload_0         
	//   83  156:iload_1         
	//   84  157:invokevirtual   #378 <Method void _throwInvalidSpace(int)>
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
	//*   1    1:getfield        #65  <Field int _inputPtr>
	//*   2    4:iconst_4        
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #68  <Field int _inputEnd>
	//*   6   10:icmplt          19
				return _skipColon2(false);
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:invokespecial   #386 <Method int _skipColon2(boolean)>
	//   10   18:ireturn         
			char c = _inputBuffer[_inputPtr];
	//   11   19:aload_0         
	//   12   20:getfield        #62  <Field char[] _inputBuffer>
	//   13   23:aload_0         
	//   14   24:getfield        #65  <Field int _inputPtr>
	//   15   27:caload          
	//   16   28:istore_2        
			if(c == ':')
	//*  17   29:iload_2         
	//*  18   30:bipush          58
	//*  19   32:icmpne          173
			{
				char ac[] = _inputBuffer;
	//   20   35:aload_0         
	//   21   36:getfield        #62  <Field char[] _inputBuffer>
	//   22   39:astore_3        
				int i = _inputPtr + 1;
	//   23   40:aload_0         
	//   24   41:getfield        #65  <Field int _inputPtr>
	//   25   44:iconst_1        
	//   26   45:iadd            
	//   27   46:istore_1        
				_inputPtr = i;
	//   28   47:aload_0         
	//   29   48:iload_1         
	//   30   49:putfield        #65  <Field int _inputPtr>
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
	//   47   79:getfield        #65  <Field int _inputPtr>
	//   48   82:iconst_1        
	//   49   83:iadd            
	//   50   84:putfield        #65  <Field int _inputPtr>
						return i;
	//   51   87:iload_1         
	//   52   88:ireturn         
					} else
					{
						return _skipColon2(true);
	//   53   89:aload_0         
	//   54   90:iconst_1        
	//   55   91:invokespecial   #386 <Method int _skipColon2(boolean)>
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
	//   64  108:getfield        #62  <Field char[] _inputBuffer>
	//   65  111:astore_3        
					int j = _inputPtr + 1;
	//   66  112:aload_0         
	//   67  113:getfield        #65  <Field int _inputPtr>
	//   68  116:iconst_1        
	//   69  117:iadd            
	//   70  118:istore_1        
					_inputPtr = j;
	//   71  119:aload_0         
	//   72  120:iload_1         
	//   73  121:putfield        #65  <Field int _inputPtr>
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
	//   90  151:getfield        #65  <Field int _inputPtr>
	//   91  154:iconst_1        
	//   92  155:iadd            
	//   93  156:putfield        #65  <Field int _inputPtr>
							return j;
	//   94  159:iload_1         
	//   95  160:ireturn         
						} else
						{
							return _skipColon2(true);
	//   96  161:aload_0         
	//   97  162:iconst_1        
	//   98  163:invokespecial   #386 <Method int _skipColon2(boolean)>
	//   99  166:ireturn         
						}
				}
				return _skipColon2(true);
	//  100  167:aload_0         
	//  101  168:iconst_1        
	//  102  169:invokespecial   #386 <Method int _skipColon2(boolean)>
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
	//  113  188:getfield        #62  <Field char[] _inputBuffer>
	//  114  191:astore_3        
			k = _inputPtr + 1;
	//  115  192:aload_0         
	//  116  193:getfield        #65  <Field int _inputPtr>
	//  117  196:iconst_1        
	//  118  197:iadd            
	//  119  198:istore_1        
			_inputPtr = k;
	//  120  199:aload_0         
	//  121  200:iload_1         
	//  122  201:putfield        #65  <Field int _inputPtr>
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
	//  131  215:getfield        #62  <Field char[] _inputBuffer>
	//  132  218:astore_3        
			int l = _inputPtr + 1;
	//  133  219:aload_0         
	//  134  220:getfield        #65  <Field int _inputPtr>
	//  135  223:iconst_1        
	//  136  224:iadd            
	//  137  225:istore_1        
			_inputPtr = l;
	//  138  226:aload_0         
	//  139  227:iload_1         
	//  140  228:putfield        #65  <Field int _inputPtr>
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
	//  157  258:getfield        #65  <Field int _inputPtr>
	//  158  261:iconst_1        
	//  159  262:iadd            
	//  160  263:putfield        #65  <Field int _inputPtr>
					return l;
	//  161  266:iload_1         
	//  162  267:ireturn         
				} else
				{
					return _skipColon2(true);
	//  163  268:aload_0         
	//  164  269:iconst_1        
	//  165  270:invokespecial   #386 <Method int _skipColon2(boolean)>
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
	//  174  287:getfield        #62  <Field char[] _inputBuffer>
	//  175  290:astore_3        
				int i1 = _inputPtr + 1;
	//  176  291:aload_0         
	//  177  292:getfield        #65  <Field int _inputPtr>
	//  178  295:iconst_1        
	//  179  296:iadd            
	//  180  297:istore_1        
				_inputPtr = i1;
	//  181  298:aload_0         
	//  182  299:iload_1         
	//  183  300:putfield        #65  <Field int _inputPtr>
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
	//  200  330:getfield        #65  <Field int _inputPtr>
	//  201  333:iconst_1        
	//  202  334:iadd            
	//  203  335:putfield        #65  <Field int _inputPtr>
						return i1;
	//  204  338:iload_1         
	//  205  339:ireturn         
					} else
					{
						return _skipColon2(true);
	//  206  340:aload_0         
	//  207  341:iconst_1        
	//  208  342:invokespecial   #386 <Method int _skipColon2(boolean)>
	//  209  345:ireturn         
					}
			}
			return _skipColon2(true);
	//  210  346:aload_0         
	//  211  347:iconst_1        
	//  212  348:invokespecial   #386 <Method int _skipColon2(boolean)>
	//  213  351:ireturn         
		} else
		{
			return _skipColon2(false);
	//  214  352:aload_0         
	//  215  353:iconst_0        
	//  216  354:invokespecial   #386 <Method int _skipColon2(boolean)>
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
	//*   1    1:getfield        #65  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #68  <Field int _inputEnd>
	//*   4    8:icmplt          68
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #164 <Method boolean _loadMore()>
	//*   7   15:ifeq            21
	//*   8   18:goto            68
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    9   21:new             #339 <Class StringBuilder>
	//   10   24:dup             
	//   11   25:invokespecial   #341 <Method void StringBuilder()>
	//   12   28:astore_3        
				stringbuilder.append(" within/between ");
	//   13   29:aload_3         
	//   14   30:ldc2            #388 <String " within/between ">
	//   15   33:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   16   36:pop             
				stringbuilder.append(_parsingContext.typeDesc());
	//   17   37:aload_3         
	//   18   38:aload_0         
	//   19   39:getfield        #114 <Field JsonReadContext _parsingContext>
	//   20   42:invokevirtual   #351 <Method String JsonReadContext.typeDesc()>
	//   21   45:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:pop             
				stringbuilder.append(" entries");
	//   23   49:aload_3         
	//   24   50:ldc2            #353 <String " entries">
	//   25   53:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   26   56:pop             
				_reportInvalidEOF(stringbuilder.toString(), ((JsonToken) (null)));
	//   27   57:aload_0         
	//   28   58:aload_3         
	//   29   59:invokevirtual   #356 <Method String StringBuilder.toString()>
	//   30   62:aconst_null     
	//   31   63:invokevirtual   #300 <Method void _reportInvalidEOF(String, JsonToken)>
				return -1;
	//   32   66:iconst_m1       
	//   33   67:ireturn         
			}
			char ac[] = _inputBuffer;
	//   34   68:aload_0         
	//   35   69:getfield        #62  <Field char[] _inputBuffer>
	//   36   72:astore_3        
			int i = _inputPtr;
	//   37   73:aload_0         
	//   38   74:getfield        #65  <Field int _inputPtr>
	//   39   77:istore_2        
			_inputPtr = i + 1;
	//   40   78:aload_0         
	//   41   79:iload_2         
	//   42   80:iconst_1        
	//   43   81:iadd            
	//   44   82:putfield        #65  <Field int _inputPtr>
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
	//   56  102:invokespecial   #363 <Method void _skipComment()>
				else
	//*  57  105:goto            0
				if(i != '#' || !_skipYAMLComment())
	//*  58  108:iload_2         
	//*  59  109:bipush          35
	//*  60  111:icmpne          124
	//*  61  114:aload_0         
	//*  62  115:invokespecial   #366 <Method boolean _skipYAMLComment()>
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
	//   74  138:ldc2            #390 <String "was expecting a colon to separate field name and value">
	//   75  141:invokevirtual   #393 <Method void _reportUnexpectedChar(int, String)>
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
	//   87  163:getfield        #369 <Field int _currInputRow>
	//   88  166:iconst_1        
	//   89  167:iadd            
	//   90  168:putfield        #369 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   91  171:aload_0         
	//   92  172:aload_0         
	//   93  173:getfield        #65  <Field int _inputPtr>
	//   94  176:putfield        #372 <Field int _currInputRowStart>
				} else
	//*  95  179:goto            0
				if(i == '\r')
	//*  96  182:iload_2         
	//*  97  183:bipush          13
	//*  98  185:icmpne          195
					_skipCR();
	//   99  188:aload_0         
	//  100  189:invokevirtual   #375 <Method void _skipCR()>
				else
	//* 101  192:goto            0
				if(i != '\t')
	//* 102  195:iload_2         
	//* 103  196:bipush          9
	//* 104  198:icmpeq          0
					_throwInvalidSpace(i);
	//  105  201:aload_0         
	//  106  202:iload_2         
	//  107  203:invokevirtual   #378 <Method void _throwInvalidSpace(int)>
		} while(true);
	//  108  206:goto            0
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
	//    3    6:new             #339 <Class StringBuilder>
	//    4    9:dup             
	//    5   10:invokespecial   #341 <Method void StringBuilder()>
	//    6   13:astore_2        
			stringbuilder.append("was expecting comma to separate ");
	//    7   14:aload_2         
	//    8   15:ldc2            #397 <String "was expecting comma to separate ">
	//    9   18:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			stringbuilder.append(_parsingContext.typeDesc());
	//   11   22:aload_2         
	//   12   23:aload_0         
	//   13   24:getfield        #114 <Field JsonReadContext _parsingContext>
	//   14   27:invokevirtual   #351 <Method String JsonReadContext.typeDesc()>
	//   15   30:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			stringbuilder.append(" entries");
	//   17   34:aload_2         
	//   18   35:ldc2            #353 <String " entries">
	//   19   38:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
			_reportUnexpectedChar(i, stringbuilder.toString());
	//   21   42:aload_0         
	//   22   43:iload_1         
	//   23   44:aload_2         
	//   24   45:invokevirtual   #356 <Method String StringBuilder.toString()>
	//   25   48:invokevirtual   #393 <Method void _reportUnexpectedChar(int, String)>
		}
		do
		{
			if(_inputPtr >= _inputEnd)
				break;
	//   26   51:aload_0         
	//   27   52:getfield        #65  <Field int _inputPtr>
	//   28   55:aload_0         
	//   29   56:getfield        #68  <Field int _inputEnd>
	//   30   59:icmpge          181
			char ac[] = _inputBuffer;
	//   31   62:aload_0         
	//   32   63:getfield        #62  <Field char[] _inputBuffer>
	//   33   66:astore_2        
			i = _inputPtr;
	//   34   67:aload_0         
	//   35   68:getfield        #65  <Field int _inputPtr>
	//   36   71:istore_1        
			_inputPtr = i + 1;
	//   37   72:aload_0         
	//   38   73:iload_1         
	//   39   74:iconst_1        
	//   40   75:iadd            
	//   41   76:putfield        #65  <Field int _inputPtr>
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
	//   60  108:getfield        #65  <Field int _inputPtr>
	//   61  111:iconst_1        
	//   62  112:isub            
	//   63  113:putfield        #65  <Field int _inputPtr>
					return _skipAfterComma2();
	//   64  116:aload_0         
	//   65  117:invokespecial   #399 <Method int _skipAfterComma2()>
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
	//   75  135:getfield        #369 <Field int _currInputRow>
	//   76  138:iconst_1        
	//   77  139:iadd            
	//   78  140:putfield        #369 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   79  143:aload_0         
	//   80  144:aload_0         
	//   81  145:getfield        #65  <Field int _inputPtr>
	//   82  148:putfield        #372 <Field int _currInputRowStart>
				} else
	//*  83  151:goto            51
				if(i == 13)
	//*  84  154:iload_1         
	//*  85  155:bipush          13
	//*  86  157:icmpne          167
					_skipCR();
	//   87  160:aload_0         
	//   88  161:invokevirtual   #375 <Method void _skipCR()>
				else
	//*  89  164:goto            51
				if(i != 9)
	//*  90  167:iload_1         
	//*  91  168:bipush          9
	//*  92  170:icmpeq          51
					_throwInvalidSpace(i);
	//   93  173:aload_0         
	//   94  174:iload_1         
	//   95  175:invokevirtual   #378 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   96  178:goto            51
		return _skipAfterComma2();
	//   97  181:aload_0         
	//   98  182:invokespecial   #399 <Method int _skipAfterComma2()>
	//   99  185:ireturn         
	}

	private void _skipComment()
		throws IOException
	{
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #402 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_COMMENTS>
	//*   2    4:invokevirtual   #262 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   3    7:ifne            19
			_reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
	//    4   10:aload_0         
	//    5   11:bipush          47
	//    6   13:ldc2            #404 <String "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)">
	//    7   16:invokevirtual   #393 <Method void _reportUnexpectedChar(int, String)>
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   8   19:aload_0         
	//*   9   20:getfield        #65  <Field int _inputPtr>
	//*  10   23:aload_0         
	//*  11   24:getfield        #68  <Field int _inputEnd>
	//*  12   27:icmplt          45
	//*  13   30:aload_0         
	//*  14   31:invokevirtual   #164 <Method boolean _loadMore()>
	//*  15   34:ifne            45
			_reportInvalidEOF(" in a comment", ((JsonToken) (null)));
	//   16   37:aload_0         
	//   17   38:ldc2            #381 <String " in a comment">
	//   18   41:aconst_null     
	//   19   42:invokevirtual   #300 <Method void _reportInvalidEOF(String, JsonToken)>
		char ac[] = _inputBuffer;
	//   20   45:aload_0         
	//   21   46:getfield        #62  <Field char[] _inputBuffer>
	//   22   49:astore_2        
		int i = _inputPtr;
	//   23   50:aload_0         
	//   24   51:getfield        #65  <Field int _inputPtr>
	//   25   54:istore_1        
		_inputPtr = i + 1;
	//   26   55:aload_0         
	//   27   56:iload_1         
	//   28   57:iconst_1        
	//   29   58:iadd            
	//   30   59:putfield        #65  <Field int _inputPtr>
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
	//   39   73:invokespecial   #407 <Method void _skipLine()>
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
	//   45   84:invokespecial   #409 <Method void _skipCComment()>
			return;
	//   46   87:return          
		} else
		{
			_reportUnexpectedChar(i, "was expecting either '*' or '/' for a comment");
	//   47   88:aload_0         
	//   48   89:iload_1         
	//   49   90:ldc2            #411 <String "was expecting either '*' or '/' for a comment">
	//   50   93:invokevirtual   #393 <Method void _reportUnexpectedChar(int, String)>
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
	//*   1    1:getfield        #65  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #68  <Field int _inputEnd>
	//*   4    8:icmplt          18
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #164 <Method boolean _loadMore()>
	//*   7   15:ifeq            80
				{
					char ac[] = _inputBuffer;
	//    8   18:aload_0         
	//    9   19:getfield        #62  <Field char[] _inputBuffer>
	//   10   22:astore_2        
					i = _inputPtr;
	//   11   23:aload_0         
	//   12   24:getfield        #65  <Field int _inputPtr>
	//   13   27:istore_1        
					_inputPtr = i + 1;
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:putfield        #65  <Field int _inputPtr>
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
	//   31   53:getfield        #369 <Field int _currInputRow>
	//   32   56:iconst_1        
	//   33   57:iadd            
	//   34   58:putfield        #369 <Field int _currInputRow>
						_currInputRowStart = _inputPtr;
	//   35   61:aload_0         
	//   36   62:aload_0         
	//   37   63:getfield        #65  <Field int _inputPtr>
	//   38   66:putfield        #372 <Field int _currInputRowStart>
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
	//   44   77:invokevirtual   #375 <Method void _skipCR()>
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
	//   51   89:invokevirtual   #378 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   52   92:goto            0
	}

	private final int _skipWSOrEnd()
		throws IOException
	{
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #68  <Field int _inputEnd>
	//*   4    8:icmplt          23
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #164 <Method boolean _loadMore()>
	//*   7   15:ifne            23
			return _eofAsNextChar();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #415 <Method int _eofAsNextChar()>
	//   10   22:ireturn         
		char ac[] = _inputBuffer;
	//   11   23:aload_0         
	//   12   24:getfield        #62  <Field char[] _inputBuffer>
	//   13   27:astore_2        
		int i = _inputPtr;
	//   14   28:aload_0         
	//   15   29:getfield        #65  <Field int _inputPtr>
	//   16   32:istore_1        
		_inputPtr = i + 1;
	//   17   33:aload_0         
	//   18   34:iload_1         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:putfield        #65  <Field int _inputPtr>
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
	//   40   69:getfield        #65  <Field int _inputPtr>
	//   41   72:iconst_1        
	//   42   73:isub            
	//   43   74:putfield        #65  <Field int _inputPtr>
				return _skipWSOrEnd2();
	//   44   77:aload_0         
	//   45   78:invokespecial   #418 <Method int _skipWSOrEnd2()>
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
	//   55   96:getfield        #369 <Field int _currInputRow>
	//   56   99:iconst_1        
	//   57  100:iadd            
	//   58  101:putfield        #369 <Field int _currInputRow>
				_currInputRowStart = _inputPtr;
	//   59  104:aload_0         
	//   60  105:aload_0         
	//   61  106:getfield        #65  <Field int _inputPtr>
	//   62  109:putfield        #372 <Field int _currInputRowStart>
			} else
	//*  63  112:goto            139
			if(i == '\r')
	//*  64  115:iload_1         
	//*  65  116:bipush          13
	//*  66  118:icmpne          128
				_skipCR();
	//   67  121:aload_0         
	//   68  122:invokevirtual   #375 <Method void _skipCR()>
			else
	//*  69  125:goto            139
			if(i != '\t')
	//*  70  128:iload_1         
	//*  71  129:bipush          9
	//*  72  131:icmpeq          139
				_throwInvalidSpace(i);
	//   73  134:aload_0         
	//   74  135:iload_1         
	//   75  136:invokevirtual   #378 <Method void _throwInvalidSpace(int)>
		do
		{
			if(_inputPtr >= _inputEnd)
				break;
	//   76  139:aload_0         
	//   77  140:getfield        #65  <Field int _inputPtr>
	//   78  143:aload_0         
	//   79  144:getfield        #68  <Field int _inputEnd>
	//   80  147:icmpge          269
			char ac1[] = _inputBuffer;
	//   81  150:aload_0         
	//   82  151:getfield        #62  <Field char[] _inputBuffer>
	//   83  154:astore_2        
			int j = _inputPtr;
	//   84  155:aload_0         
	//   85  156:getfield        #65  <Field int _inputPtr>
	//   86  159:istore_1        
			_inputPtr = j + 1;
	//   87  160:aload_0         
	//   88  161:iload_1         
	//   89  162:iconst_1        
	//   90  163:iadd            
	//   91  164:putfield        #65  <Field int _inputPtr>
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
	//  110  196:getfield        #65  <Field int _inputPtr>
	//  111  199:iconst_1        
	//  112  200:isub            
	//  113  201:putfield        #65  <Field int _inputPtr>
					return _skipWSOrEnd2();
	//  114  204:aload_0         
	//  115  205:invokespecial   #418 <Method int _skipWSOrEnd2()>
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
	//  125  223:getfield        #369 <Field int _currInputRow>
	//  126  226:iconst_1        
	//  127  227:iadd            
	//  128  228:putfield        #369 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//  129  231:aload_0         
	//  130  232:aload_0         
	//  131  233:getfield        #65  <Field int _inputPtr>
	//  132  236:putfield        #372 <Field int _currInputRowStart>
				} else
	//* 133  239:goto            139
				if(j == '\r')
	//* 134  242:iload_1         
	//* 135  243:bipush          13
	//* 136  245:icmpne          255
					_skipCR();
	//  137  248:aload_0         
	//  138  249:invokevirtual   #375 <Method void _skipCR()>
				else
	//* 139  252:goto            139
				if(j != '\t')
	//* 140  255:iload_1         
	//* 141  256:bipush          9
	//* 142  258:icmpeq          139
					_throwInvalidSpace(j);
	//  143  261:aload_0         
	//  144  262:iload_1         
	//  145  263:invokevirtual   #378 <Method void _throwInvalidSpace(int)>
		} while(true);
	//  146  266:goto            139
		return _skipWSOrEnd2();
	//  147  269:aload_0         
	//  148  270:invokespecial   #418 <Method int _skipWSOrEnd2()>
	//  149  273:ireturn         
	}

	private int _skipWSOrEnd2()
		throws IOException
	{
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #68  <Field int _inputEnd>
	//*   4    8:icmplt          23
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #164 <Method boolean _loadMore()>
	//*   7   15:ifne            23
				return _eofAsNextChar();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #415 <Method int _eofAsNextChar()>
	//   10   22:ireturn         
			char ac[] = _inputBuffer;
	//   11   23:aload_0         
	//   12   24:getfield        #62  <Field char[] _inputBuffer>
	//   13   27:astore_2        
			int i = _inputPtr;
	//   14   28:aload_0         
	//   15   29:getfield        #65  <Field int _inputPtr>
	//   16   32:istore_1        
			_inputPtr = i + 1;
	//   17   33:aload_0         
	//   18   34:iload_1         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:putfield        #65  <Field int _inputPtr>
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
	//   33   57:invokespecial   #363 <Method void _skipComment()>
				else
	//*  34   60:goto            0
				if(i != '#' || !_skipYAMLComment())
	//*  35   63:iload_1         
	//*  36   64:bipush          35
	//*  37   66:icmpne          79
	//*  38   69:aload_0         
	//*  39   70:invokespecial   #366 <Method boolean _skipYAMLComment()>
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
	//   52   95:getfield        #369 <Field int _currInputRow>
	//   53   98:iconst_1        
	//   54   99:iadd            
	//   55  100:putfield        #369 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   56  103:aload_0         
	//   57  104:aload_0         
	//   58  105:getfield        #65  <Field int _inputPtr>
	//   59  108:putfield        #372 <Field int _currInputRowStart>
				} else
	//*  60  111:goto            0
				if(i == '\r')
	//*  61  114:iload_1         
	//*  62  115:bipush          13
	//*  63  117:icmpne          127
					_skipCR();
	//   64  120:aload_0         
	//   65  121:invokevirtual   #375 <Method void _skipCR()>
				else
	//*  66  124:goto            0
				if(i != '\t')
	//*  67  127:iload_1         
	//*  68  128:bipush          9
	//*  69  130:icmpeq          0
					_throwInvalidSpace(i);
	//   70  133:aload_0         
	//   71  134:iload_1         
	//   72  135:invokevirtual   #378 <Method void _throwInvalidSpace(int)>
		} while(true);
	//   73  138:goto            0
	}

	private boolean _skipYAMLComment()
		throws IOException
	{
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #421 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_YAML_COMMENTS>
	//*   2    4:invokevirtual   #262 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   3    7:ifne            12
		{
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		} else
		{
			_skipLine();
	//    6   12:aload_0         
	//    7   13:invokespecial   #407 <Method void _skipLine()>
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		}
	}

	private final void _updateLocation()
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field int _inputPtr>
	//    2    4:istore_1        
		_tokenInputTotal = _currInputProcessed + (long)i;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #424 <Field long _currInputProcessed>
	//    6   10:iload_1         
	//    7   11:i2l             
	//    8   12:ladd            
	//    9   13:putfield        #427 <Field long _tokenInputTotal>
		_tokenInputRow = _currInputRow;
	//   10   16:aload_0         
	//   11   17:aload_0         
	//   12   18:getfield        #369 <Field int _currInputRow>
	//   13   21:putfield        #220 <Field int _tokenInputRow>
		_tokenInputCol = i - _currInputRowStart;
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:aload_0         
	//   17   27:getfield        #372 <Field int _currInputRowStart>
	//   18   30:isub            
	//   19   31:putfield        #223 <Field int _tokenInputCol>
	//   20   34:return          
	}

	private final void _updateNameLocation()
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field int _inputPtr>
	//    2    4:istore_1        
		_nameStartOffset = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:i2l             
	//    6    8:putfield        #430 <Field long _nameStartOffset>
		_nameStartRow = _currInputRow;
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:getfield        #369 <Field int _currInputRow>
	//   10   16:putfield        #432 <Field int _nameStartRow>
		_nameStartCol = i - _currInputRowStart;
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:aload_0         
	//   14   22:getfield        #372 <Field int _currInputRowStart>
	//   15   25:isub            
	//   16   26:putfield        #434 <Field int _nameStartCol>
	//   17   29:return          
	}

	private char _verifyNLZ2()
		throws IOException
	{
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #68  <Field int _inputEnd>
	//*   4    8:icmplt          21
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #164 <Method boolean _loadMore()>
	//*   7   15:ifne            21
			return '0';
	//    8   18:bipush          48
	//    9   20:ireturn         
		char c = _inputBuffer[_inputPtr];
	//   10   21:aload_0         
	//   11   22:getfield        #62  <Field char[] _inputBuffer>
	//   12   25:aload_0         
	//   13   26:getfield        #65  <Field int _inputPtr>
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
	//*  25   47:getstatic       #438 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NUMERIC_LEADING_ZEROS>
	//*  26   50:invokevirtual   #262 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  27   53:ifne            63
				reportInvalidNumber("Leading zeroes not allowed");
	//   28   56:aload_0         
	//   29   57:ldc2            #440 <String "Leading zeroes not allowed">
	//   30   60:invokevirtual   #443 <Method void reportInvalidNumber(String)>
			_inputPtr = _inputPtr + 1;
	//   31   63:aload_0         
	//   32   64:aload_0         
	//   33   65:getfield        #65  <Field int _inputPtr>
	//   34   68:iconst_1        
	//   35   69:iadd            
	//   36   70:putfield        #65  <Field int _inputPtr>
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
	//*  43   82:getfield        #65  <Field int _inputPtr>
	//*  44   85:aload_0         
	//*  45   86:getfield        #68  <Field int _inputEnd>
	//*  46   89:icmplt          101
					{
						c1 = c;
	//   47   92:iload_1         
	//   48   93:istore_2        
						if(!_loadMore())
							break;
	//   49   94:aload_0         
	//   50   95:invokevirtual   #164 <Method boolean _loadMore()>
	//   51   98:ifeq            149
					}
					c1 = _inputBuffer[_inputPtr];
	//   52  101:aload_0         
	//   53  102:getfield        #62  <Field char[] _inputBuffer>
	//   54  105:aload_0         
	//   55  106:getfield        #65  <Field int _inputPtr>
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
	//   68  128:getfield        #65  <Field int _inputPtr>
	//   69  131:iconst_1        
	//   70  132:iadd            
	//   71  133:putfield        #65  <Field int _inputPtr>
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
	//*   1    1:getfield        #65  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #68  <Field int _inputEnd>
	//*   4    8:icmpge          36
		{
			char c = _inputBuffer[_inputPtr];
	//    5   11:aload_0         
	//    6   12:getfield        #62  <Field char[] _inputBuffer>
	//    7   15:aload_0         
	//    8   16:getfield        #65  <Field int _inputPtr>
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
	//   20   37:invokespecial   #445 <Method char _verifyNLZ2()>
	//   21   40:ireturn         
	}

	private final void _verifyRootSpace(int i)
		throws IOException
	{
		_inputPtr = _inputPtr + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #65  <Field int _inputPtr>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #65  <Field int _inputPtr>
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
	//   16   46:invokevirtual   #448 <Method void _reportMissingRootWS(int)>
					return;
	//   17   49:return          

				case 10: // '\n'
					_currInputRow = _currInputRow + 1;
	//   18   50:aload_0         
	//   19   51:aload_0         
	//   20   52:getfield        #369 <Field int _currInputRow>
	//   21   55:iconst_1        
	//   22   56:iadd            
	//   23   57:putfield        #369 <Field int _currInputRow>
					_currInputRowStart = _inputPtr;
	//   24   60:aload_0         
	//   25   61:aload_0         
	//   26   62:getfield        #65  <Field int _inputPtr>
	//   27   65:putfield        #372 <Field int _currInputRowStart>
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
	//   31   71:invokevirtual   #375 <Method void _skipCR()>
			return;
	//   32   74:return          
		}
	}

	protected void _closeInput()
		throws IOException
	{
		if(_reader != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field Reader _reader>
	//*   2    4:ifnull          39
		{
			if(_ioContext.isResourceManaged() || isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE))
	//*   3    7:aload_0         
	//*   4    8:getfield        #453 <Field IOContext _ioContext>
	//*   5   11:invokevirtual   #456 <Method boolean IOContext.isResourceManaged()>
	//*   6   14:ifne            27
	//*   7   17:aload_0         
	//*   8   18:getstatic       #459 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.AUTO_CLOSE_SOURCE>
	//*   9   21:invokevirtual   #262 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  10   24:ifeq            34
				_reader.close();
	//   11   27:aload_0         
	//   12   28:getfield        #54  <Field Reader _reader>
	//   13   31:invokevirtual   #464 <Method void Reader.close()>
			_reader = null;
	//   14   34:aload_0         
	//   15   35:aconst_null     
	//   16   36:putfield        #54  <Field Reader _reader>
		}
	//   17   39:return          
	}

	protected byte[] _decodeBase64(Base64Variant base64variant)
		throws IOException
	{
		Object obj = ((Object) (_getByteArrayBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #470 <Method ByteArrayBuilder _getByteArrayBuilder()>
	//    2    4:astore          7
		do
		{
			char c;
			do
			{
				if(_inputPtr >= _inputEnd)
	//*   3    6:aload_0         
	//*   4    7:getfield        #65  <Field int _inputPtr>
	//*   5   10:aload_0         
	//*   6   11:getfield        #68  <Field int _inputEnd>
	//*   7   14:icmplt          21
					_loadMoreGuaranteed();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #473 <Method void _loadMoreGuaranteed()>
				char ac[] = _inputBuffer;
	//   10   21:aload_0         
	//   11   22:getfield        #62  <Field char[] _inputBuffer>
	//   12   25:astore          8
				int i = _inputPtr;
	//   13   27:aload_0         
	//   14   28:getfield        #65  <Field int _inputPtr>
	//   15   31:istore_3        
				_inputPtr = i + 1;
	//   16   32:aload_0         
	//   17   33:iload_3         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:putfield        #65  <Field int _inputPtr>
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
	//   30   52:invokevirtual   #479 <Method int Base64Variant.decodeBase64Char(char)>
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
	//   40   73:invokevirtual   #485 <Method byte[] ByteArrayBuilder.toByteArray()>
	//   41   76:areturn         
				l = _decodeBase64Escape(base64variant, c, 0);
	//   42   77:aload_0         
	//   43   78:aload_1         
	//   44   79:iload_2         
	//   45   80:iconst_0        
	//   46   81:invokevirtual   #489 <Method int _decodeBase64Escape(Base64Variant, char, int)>
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
	//*  54   98:getfield        #65  <Field int _inputPtr>
	//*  55  101:aload_0         
	//*  56  102:getfield        #68  <Field int _inputEnd>
	//*  57  105:icmplt          112
				_loadMoreGuaranteed();
	//   58  108:aload_0         
	//   59  109:invokevirtual   #473 <Method void _loadMoreGuaranteed()>
			char ac1[] = _inputBuffer;
	//   60  112:aload_0         
	//   61  113:getfield        #62  <Field char[] _inputBuffer>
	//   62  116:astore          8
			l = _inputPtr;
	//   63  118:aload_0         
	//   64  119:getfield        #65  <Field int _inputPtr>
	//   65  122:istore          4
			_inputPtr = l + 1;
	//   66  124:aload_0         
	//   67  125:iload           4
	//   68  127:iconst_1        
	//   69  128:iadd            
	//   70  129:putfield        #65  <Field int _inputPtr>
			c = ac1[l];
	//   71  132:aload           8
	//   72  134:iload           4
	//   73  136:caload          
	//   74  137:istore_2        
			int i1 = base64variant.decodeBase64Char(c);
	//   75  138:aload_1         
	//   76  139:iload_2         
	//   77  140:invokevirtual   #479 <Method int Base64Variant.decodeBase64Char(char)>
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
	//   87  158:invokevirtual   #489 <Method int _decodeBase64Escape(Base64Variant, char, int)>
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
	//*  96  173:getfield        #65  <Field int _inputPtr>
	//*  97  176:aload_0         
	//*  98  177:getfield        #68  <Field int _inputEnd>
	//*  99  180:icmplt          187
				_loadMoreGuaranteed();
	//  100  183:aload_0         
	//  101  184:invokevirtual   #473 <Method void _loadMoreGuaranteed()>
			ac1 = _inputBuffer;
	//  102  187:aload_0         
	//  103  188:getfield        #62  <Field char[] _inputBuffer>
	//  104  191:astore          8
			j = _inputPtr;
	//  105  193:aload_0         
	//  106  194:getfield        #65  <Field int _inputPtr>
	//  107  197:istore_3        
			_inputPtr = j + 1;
	//  108  198:aload_0         
	//  109  199:iload_3         
	//  110  200:iconst_1        
	//  111  201:iadd            
	//  112  202:putfield        #65  <Field int _inputPtr>
			c = ac1[j];
	//  113  205:aload           8
	//  114  207:iload_3         
	//  115  208:caload          
	//  116  209:istore_2        
			l = base64variant.decodeBase64Char(c);
	//  117  210:aload_1         
	//  118  211:iload_2         
	//  119  212:invokevirtual   #479 <Method int Base64Variant.decodeBase64Char(char)>
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
	//* 134  243:invokevirtual   #492 <Method boolean Base64Variant.usesPadding()>
	//* 135  246:ifne            264
					{
						((ByteArrayBuilder) (obj)).append(j1 >> 4);
	//  136  249:aload           7
	//  137  251:iload           6
	//  138  253:iconst_4        
	//  139  254:ishr            
	//  140  255:invokevirtual   #494 <Method void ByteArrayBuilder.append(int)>
						return ((ByteArrayBuilder) (obj)).toByteArray();
	//  141  258:aload           7
	//  142  260:invokevirtual   #485 <Method byte[] ByteArrayBuilder.toByteArray()>
	//  143  263:areturn         
					}
					j = _decodeBase64Escape(base64variant, c, 2);
	//  144  264:aload_0         
	//  145  265:aload_1         
	//  146  266:iload_2         
	//  147  267:iconst_2        
	//  148  268:invokevirtual   #489 <Method int _decodeBase64Escape(Base64Variant, char, int)>
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
	//* 156  282:getfield        #65  <Field int _inputPtr>
	//* 157  285:aload_0         
	//* 158  286:getfield        #68  <Field int _inputEnd>
	//* 159  289:icmplt          296
						_loadMoreGuaranteed();
	//  160  292:aload_0         
	//  161  293:invokevirtual   #473 <Method void _loadMoreGuaranteed()>
					ac1 = _inputBuffer;
	//  162  296:aload_0         
	//  163  297:getfield        #62  <Field char[] _inputBuffer>
	//  164  300:astore          8
					j = _inputPtr;
	//  165  302:aload_0         
	//  166  303:getfield        #65  <Field int _inputPtr>
	//  167  306:istore_3        
					_inputPtr = j + 1;
	//  168  307:aload_0         
	//  169  308:iload_3         
	//  170  309:iconst_1        
	//  171  310:iadd            
	//  172  311:putfield        #65  <Field int _inputPtr>
					c = ac1[j];
	//  173  314:aload           8
	//  174  316:iload_3         
	//  175  317:caload          
	//  176  318:istore_2        
					if(base64variant.usesPaddingChar(c))
	//* 177  319:aload_1         
	//* 178  320:iload_2         
	//* 179  321:invokevirtual   #497 <Method boolean Base64Variant.usesPaddingChar(char)>
	//* 180  324:ifeq            339
					{
						((ByteArrayBuilder) (obj)).append(j1 >> 4);
	//  181  327:aload           7
	//  182  329:iload           6
	//  183  331:iconst_4        
	//  184  332:ishr            
	//  185  333:invokevirtual   #494 <Method void ByteArrayBuilder.append(int)>
					} else
	//* 186  336:goto            6
					{
						obj = ((Object) (new StringBuilder()));
	//  187  339:new             #339 <Class StringBuilder>
	//  188  342:dup             
	//  189  343:invokespecial   #341 <Method void StringBuilder()>
	//  190  346:astore          7
						((StringBuilder) (obj)).append("expected padding character '");
	//  191  348:aload           7
	//  192  350:ldc2            #499 <String "expected padding character '">
	//  193  353:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  194  356:pop             
						((StringBuilder) (obj)).append(base64variant.getPaddingChar());
	//  195  357:aload           7
	//  196  359:aload_1         
	//  197  360:invokevirtual   #502 <Method char Base64Variant.getPaddingChar()>
	//  198  363:invokevirtual   #505 <Method StringBuilder StringBuilder.append(char)>
	//  199  366:pop             
						((StringBuilder) (obj)).append("'");
	//  200  367:aload           7
	//  201  369:ldc2            #507 <String "'">
	//  202  372:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  203  375:pop             
						throw reportInvalidBase64Char(base64variant, ((int) (c)), 3, ((StringBuilder) (obj)).toString());
	//  204  376:aload_0         
	//  205  377:aload_1         
	//  206  378:iload_2         
	//  207  379:iconst_3        
	//  208  380:aload           7
	//  209  382:invokevirtual   #356 <Method String StringBuilder.toString()>
	//  210  385:invokevirtual   #511 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int, String)>
	//  211  388:athrow          
					}
					continue;
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
	//* 219  400:getfield        #65  <Field int _inputPtr>
	//* 220  403:aload_0         
	//* 221  404:getfield        #68  <Field int _inputEnd>
	//* 222  407:icmplt          414
				_loadMoreGuaranteed();
	//  223  410:aload_0         
	//  224  411:invokevirtual   #473 <Method void _loadMoreGuaranteed()>
			ac1 = _inputBuffer;
	//  225  414:aload_0         
	//  226  415:getfield        #62  <Field char[] _inputBuffer>
	//  227  418:astore          8
			j = _inputPtr;
	//  228  420:aload_0         
	//  229  421:getfield        #65  <Field int _inputPtr>
	//  230  424:istore_3        
			_inputPtr = j + 1;
	//  231  425:aload_0         
	//  232  426:iload_3         
	//  233  427:iconst_1        
	//  234  428:iadd            
	//  235  429:putfield        #65  <Field int _inputPtr>
			c = ac1[j];
	//  236  432:aload           8
	//  237  434:iload_3         
	//  238  435:caload          
	//  239  436:istore_2        
			l = base64variant.decodeBase64Char(c);
	//  240  437:aload_1         
	//  241  438:iload_2         
	//  242  439:invokevirtual   #479 <Method int Base64Variant.decodeBase64Char(char)>
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
	//* 257  470:invokevirtual   #492 <Method boolean Base64Variant.usesPadding()>
	//* 258  473:ifne            491
					{
						((ByteArrayBuilder) (obj)).appendTwoBytes(j1 >> 2);
	//  259  476:aload           7
	//  260  478:iload           6
	//  261  480:iconst_2        
	//  262  481:ishr            
	//  263  482:invokevirtual   #514 <Method void ByteArrayBuilder.appendTwoBytes(int)>
						return ((ByteArrayBuilder) (obj)).toByteArray();
	//  264  485:aload           7
	//  265  487:invokevirtual   #485 <Method byte[] ByteArrayBuilder.toByteArray()>
	//  266  490:areturn         
					}
					k = _decodeBase64Escape(base64variant, c, 3);
	//  267  491:aload_0         
	//  268  492:aload_1         
	//  269  493:iload_2         
	//  270  494:iconst_3        
	//  271  495:invokevirtual   #489 <Method int _decodeBase64Escape(Base64Variant, char, int)>
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
	//  282  514:invokevirtual   #514 <Method void ByteArrayBuilder.appendTwoBytes(int)>
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
	//  290  530:invokevirtual   #517 <Method void ByteArrayBuilder.appendThreeBytes(int)>
		} while(true);
	//  291  533:goto            6
	}

	protected char _decodeEscaped()
		throws IOException
	{
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #68  <Field int _inputEnd>
	//*   4    8:icmplt          28
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #164 <Method boolean _loadMore()>
	//*   7   15:ifne            28
			_reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
	//    8   18:aload_0         
	//    9   19:ldc2            #519 <String " in character escape sequence">
	//   10   22:getstatic       #240 <Field JsonToken JsonToken.VALUE_STRING>
	//   11   25:invokevirtual   #300 <Method void _reportInvalidEOF(String, JsonToken)>
		char ac[] = _inputBuffer;
	//   12   28:aload_0         
	//   13   29:getfield        #62  <Field char[] _inputBuffer>
	//   14   32:astore          6
		int i = _inputPtr;
	//   15   34:aload_0         
	//   16   35:getfield        #65  <Field int _inputPtr>
	//   17   38:istore_2        
		_inputPtr = i + 1;
	//   18   39:aload_0         
	//   19   40:iload_2         
	//   20   41:iconst_1        
	//   21   42:iadd            
	//   22   43:putfield        #65  <Field int _inputPtr>
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
	//   52  118:invokevirtual   #523 <Method char _handleUnrecognizedCharacterEscape(char)>
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
	//*  62  132:getfield        #65  <Field int _inputPtr>
	//*  63  135:aload_0         
	//*  64  136:getfield        #68  <Field int _inputEnd>
	//*  65  139:icmplt          159
	//*  66  142:aload_0         
	//*  67  143:invokevirtual   #164 <Method boolean _loadMore()>
	//*  68  146:ifne            159
										_reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
	//   69  149:aload_0         
	//   70  150:ldc2            #519 <String " in character escape sequence">
	//   71  153:getstatic       #240 <Field JsonToken JsonToken.VALUE_STRING>
	//   72  156:invokevirtual   #300 <Method void _reportInvalidEOF(String, JsonToken)>
									char ac1[] = _inputBuffer;
	//   73  159:aload_0         
	//   74  160:getfield        #62  <Field char[] _inputBuffer>
	//   75  163:astore          6
									int l = _inputPtr;
	//   76  165:aload_0         
	//   77  166:getfield        #65  <Field int _inputPtr>
	//   78  169:istore          4
									_inputPtr = l + 1;
	//   79  171:aload_0         
	//   80  172:iload           4
	//   81  174:iconst_1        
	//   82  175:iadd            
	//   83  176:putfield        #65  <Field int _inputPtr>
									l = ((int) (ac1[l]));
	//   84  179:aload           6
	//   85  181:iload           4
	//   86  183:caload          
	//   87  184:istore          4
									int i1 = CharTypes.charToHex(l);
	//   88  186:iload           4
	//   89  188:invokestatic    #526 <Method int CharTypes.charToHex(int)>
	//   90  191:istore          5
									if(i1 < 0)
	//*  91  193:iload           5
	//*  92  195:ifge            207
										_reportUnexpectedChar(l, "expected a hex-digit for character escape sequence");
	//   93  198:aload_0         
	//   94  199:iload           4
	//   95  201:ldc2            #528 <String "expected a hex-digit for character escape sequence">
	//   96  204:invokevirtual   #393 <Method void _reportUnexpectedChar(int, String)>
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
	//    1    1:getfield        #65  <Field int _inputPtr>
	//    2    4:istore_1        
		int k = _inputEnd;
	//    3    5:aload_0         
	//    4    6:getfield        #68  <Field int _inputEnd>
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
	//   11   17:getstatic       #46  <Field int[] _icLatin1>
	//   12   20:astore          6
			int l = ai.length;
	//   13   22:aload           6
	//   14   24:arraylength     
	//   15   25:istore          4
			do
			{
				char c = _inputBuffer[i];
	//   16   27:aload_0         
	//   17   28:getfield        #62  <Field char[] _inputBuffer>
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
	//   34   60:getfield        #149 <Field TextBuffer _textBuffer>
	//   35   63:aload_0         
	//   36   64:getfield        #62  <Field char[] _inputBuffer>
	//   37   67:aload_0         
	//   38   68:getfield        #65  <Field int _inputPtr>
	//   39   71:iload_1         
	//   40   72:aload_0         
	//   41   73:getfield        #65  <Field int _inputPtr>
	//   42   76:isub            
	//   43   77:invokevirtual   #155 <Method void TextBuffer.resetWithShared(char[], int, int)>
						_inputPtr = i + 1;
	//   44   80:aload_0         
	//   45   81:iload_1         
	//   46   82:iconst_1        
	//   47   83:iadd            
	//   48   84:putfield        #65  <Field int _inputPtr>
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
	//   60  100:getfield        #149 <Field TextBuffer _textBuffer>
	//   61  103:aload_0         
	//   62  104:getfield        #62  <Field char[] _inputBuffer>
	//   63  107:aload_0         
	//   64  108:getfield        #65  <Field int _inputPtr>
	//   65  111:iload_2         
	//   66  112:aload_0         
	//   67  113:getfield        #65  <Field int _inputPtr>
	//   68  116:isub            
	//   69  117:invokevirtual   #532 <Method void TextBuffer.resetWithCopy(char[], int, int)>
		_inputPtr = j;
	//   70  120:aload_0         
	//   71  121:iload_2         
	//   72  122:putfield        #65  <Field int _inputPtr>
		_finishString2();
	//   73  125:aload_0         
	//   74  126:invokevirtual   #535 <Method void _finishString2()>
	//   75  129:return          
	}

	protected void _finishString2()
		throws IOException
	{
		char ac[] = _textBuffer.getCurrentSegment();
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #158 <Method char[] TextBuffer.getCurrentSegment()>
	//    3    7:astore          6
		int i = _textBuffer.getCurrentSegmentSize();
	//    4    9:aload_0         
	//    5   10:getfield        #149 <Field TextBuffer _textBuffer>
	//    6   13:invokevirtual   #161 <Method int TextBuffer.getCurrentSegmentSize()>
	//    7   16:istore_3        
		int ai[] = _icLatin1;
	//    8   17:getstatic       #46  <Field int[] _icLatin1>
	//    9   20:astore          8
		int k = ai.length;
	//   10   22:aload           8
	//   11   24:arraylength     
	//   12   25:istore          5
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*  13   27:aload_0         
	//*  14   28:getfield        #65  <Field int _inputPtr>
	//*  15   31:aload_0         
	//*  16   32:getfield        #68  <Field int _inputEnd>
	//*  17   35:icmplt          55
	//*  18   38:aload_0         
	//*  19   39:invokevirtual   #164 <Method boolean _loadMore()>
	//*  20   42:ifne            55
				_reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
	//   21   45:aload_0         
	//   22   46:ldc2            #537 <String ": was expecting closing quote for a string value">
	//   23   49:getstatic       #240 <Field JsonToken JsonToken.VALUE_STRING>
	//   24   52:invokevirtual   #300 <Method void _reportInvalidEOF(String, JsonToken)>
			char ac1[] = _inputBuffer;
	//   25   55:aload_0         
	//   26   56:getfield        #62  <Field char[] _inputBuffer>
	//   27   59:astore          7
			int j = _inputPtr;
	//   28   61:aload_0         
	//   29   62:getfield        #65  <Field int _inputPtr>
	//   30   65:istore          4
			_inputPtr = j + 1;
	//   31   67:aload_0         
	//   32   68:iload           4
	//   33   70:iconst_1        
	//   34   71:iadd            
	//   35   72:putfield        #65  <Field int _inputPtr>
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
	//   55  105:getfield        #149 <Field TextBuffer _textBuffer>
	//   56  108:iload_3         
	//   57  109:invokevirtual   #167 <Method void TextBuffer.setCurrentLength(int)>
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
	//   63  120:invokevirtual   #304 <Method char _decodeEscaped()>
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
	//   73  137:ldc2            #539 <String "string value">
	//   74  140:invokevirtual   #309 <Method void _throwUnquotedSpace(int, String)>
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
	//   86  160:getfield        #149 <Field TextBuffer _textBuffer>
	//   87  163:invokevirtual   #183 <Method char[] TextBuffer.finishCurrentSegment()>
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
	//*   5    7:invokevirtual   #544 <Method int JsonToken.id()>
		{
	//*   6   10:tableswitch     5 8: default 40
	//	               5 53
	//	               6 45
	//	               7 45
	//	               8 45
		default:
			return jsontoken.asString();
	//    7   40:aload_1         
	//    8   41:invokevirtual   #547 <Method String JsonToken.asString()>
	//    9   44:areturn         

		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
			return _textBuffer.contentsAsString();
	//   10   45:aload_0         
	//   11   46:getfield        #149 <Field TextBuffer _textBuffer>
	//   12   49:invokevirtual   #550 <Method String TextBuffer.contentsAsString()>
	//   13   52:areturn         

		case 5: // '\005'
			return _parsingContext.getCurrentName();
	//   14   53:aload_0         
	//   15   54:getfield        #114 <Field JsonReadContext _parsingContext>
	//   16   57:invokevirtual   #553 <Method String JsonReadContext.getCurrentName()>
	//   17   60:areturn         
		}
	}

	protected JsonToken _handleApos()
		throws IOException
	{
		char ac[] = _textBuffer.emptyAndGetCurrentSegment();
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #312 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//    3    7:astore          5
		int i = _textBuffer.getCurrentSegmentSize();
	//    4    9:aload_0         
	//    5   10:getfield        #149 <Field TextBuffer _textBuffer>
	//    6   13:invokevirtual   #161 <Method int TextBuffer.getCurrentSegmentSize()>
	//    7   16:istore_3        
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*   8   17:aload_0         
	//*   9   18:getfield        #65  <Field int _inputPtr>
	//*  10   21:aload_0         
	//*  11   22:getfield        #68  <Field int _inputEnd>
	//*  12   25:icmplt          45
	//*  13   28:aload_0         
	//*  14   29:invokevirtual   #164 <Method boolean _loadMore()>
	//*  15   32:ifne            45
				_reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
	//   16   35:aload_0         
	//   17   36:ldc2            #537 <String ": was expecting closing quote for a string value">
	//   18   39:getstatic       #240 <Field JsonToken JsonToken.VALUE_STRING>
	//   19   42:invokevirtual   #300 <Method void _reportInvalidEOF(String, JsonToken)>
			char ac1[] = _inputBuffer;
	//   20   45:aload_0         
	//   21   46:getfield        #62  <Field char[] _inputBuffer>
	//   22   49:astore          6
			int j = _inputPtr;
	//   23   51:aload_0         
	//   24   52:getfield        #65  <Field int _inputPtr>
	//   25   55:istore          4
			_inputPtr = j + 1;
	//   26   57:aload_0         
	//   27   58:iload           4
	//   28   60:iconst_1        
	//   29   61:iadd            
	//   30   62:putfield        #65  <Field int _inputPtr>
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
	//   44   86:invokevirtual   #304 <Method char _decodeEscaped()>
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
	//   56  108:getfield        #149 <Field TextBuffer _textBuffer>
	//   57  111:iload_3         
	//   58  112:invokevirtual   #167 <Method void TextBuffer.setCurrentLength(int)>
							return JsonToken.VALUE_STRING;
	//   59  115:getstatic       #240 <Field JsonToken JsonToken.VALUE_STRING>
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
	//   68  129:ldc2            #539 <String "string value">
	//   69  132:invokevirtual   #309 <Method void _throwUnquotedSpace(int, String)>
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
	//   81  152:getfield        #149 <Field TextBuffer _textBuffer>
	//   82  155:invokevirtual   #183 <Method char[] TextBuffer.finishCurrentSegment()>
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
	//*   4    6:icmpne          279
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
	//*   5    9:aload_0         
	//*   6   10:getfield        #65  <Field int _inputPtr>
	//*   7   13:aload_0         
	//*   8   14:getfield        #68  <Field int _inputEnd>
	//*   9   17:icmplt          34
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #164 <Method boolean _loadMore()>
	//*  12   24:ifne            34
				_reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_INT);
	//   13   27:aload_0         
	//   14   28:getstatic       #317 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//   15   31:invokevirtual   #558 <Method void _reportInvalidEOFInValue(JsonToken)>
			char ac[] = _inputBuffer;
	//   16   34:aload_0         
	//   17   35:getfield        #62  <Field char[] _inputBuffer>
	//   18   38:astore          6
			i = _inputPtr;
	//   19   40:aload_0         
	//   20   41:getfield        #65  <Field int _inputPtr>
	//   21   44:istore_1        
			_inputPtr = i + 1;
	//   22   45:aload_0         
	//   23   46:iload_1         
	//   24   47:iconst_1        
	//   25   48:iadd            
	//   26   49:putfield        #65  <Field int _inputPtr>
			i = ((int) (ac[i]));
	//   27   52:aload           6
	//   28   54:iload_1         
	//   29   55:caload          
	//   30   56:istore_1        
			double d = (-1.0D / 0.0D);
	//   31   57:ldc2w           #559 <Double (-1.0D / 0.0D)>
	//   32   60:dstore_3        
			if(i == 78)
	//*  33   61:iload_1         
	//*  34   62:bipush          78
	//*  35   64:icmpne          170
			{
				String s;
				if(flag)
	//*  36   67:iload_2         
	//*  37   68:ifeq            79
					s = "-INF";
	//   38   71:ldc2            #562 <String "-INF">
	//   39   74:astore          6
				else
	//*  40   76:goto            84
					s = "+INF";
	//   41   79:ldc2            #564 <String "+INF">
	//   42   82:astore          6
				_matchToken(s, 3);
	//   43   84:aload_0         
	//   44   85:aload           6
	//   45   87:iconst_3        
	//   46   88:invokevirtual   #190 <Method void _matchToken(String, int)>
				if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
	//*  47   91:aload_0         
	//*  48   92:getstatic       #567 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  49   95:invokevirtual   #262 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  50   98:ifeq            120
				{
					if(!flag)
	//*  51  101:iload_2         
	//*  52  102:ifeq            108
	//*  53  105:goto            112
						d = (1.0D / 0.0D);
	//   54  108:ldc2w           #568 <Double (1.0D / 0.0D)>
	//   55  111:dstore_3        
					return resetAsNaN(s, d);
	//   56  112:aload_0         
	//   57  113:aload           6
	//   58  115:dload_3         
	//   59  116:invokevirtual   #573 <Method JsonToken resetAsNaN(String, double)>
	//   60  119:areturn         
				}
				StringBuilder stringbuilder = new StringBuilder();
	//   61  120:new             #339 <Class StringBuilder>
	//   62  123:dup             
	//   63  124:invokespecial   #341 <Method void StringBuilder()>
	//   64  127:astore          7
				stringbuilder.append("Non-standard token '");
	//   65  129:aload           7
	//   66  131:ldc2            #575 <String "Non-standard token '">
	//   67  134:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   68  137:pop             
				stringbuilder.append(s);
	//   69  138:aload           7
	//   70  140:aload           6
	//   71  142:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   72  145:pop             
				stringbuilder.append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
	//   73  146:aload           7
	//   74  148:ldc2            #577 <String "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//   75  151:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   76  154:pop             
				_reportError(stringbuilder.toString());
	//   77  155:aload_0         
	//   78  156:aload           7
	//   79  158:invokevirtual   #356 <Method String StringBuilder.toString()>
	//   80  161:invokevirtual   #580 <Method void _reportError(String)>
				j = i;
	//   81  164:iload_1         
	//   82  165:istore          5
			} else
	//*  83  167:goto            279
			{
				j = i;
	//   84  170:iload_1         
	//   85  171:istore          5
				if(i == 110)
	//*  86  173:iload_1         
	//*  87  174:bipush          110
	//*  88  176:icmpne          279
				{
					String s1;
					if(flag)
	//*  89  179:iload_2         
	//*  90  180:ifeq            191
						s1 = "-Infinity";
	//   91  183:ldc2            #582 <String "-Infinity">
	//   92  186:astore          6
					else
	//*  93  188:goto            196
						s1 = "+Infinity";
	//   94  191:ldc2            #584 <String "+Infinity">
	//   95  194:astore          6
					_matchToken(s1, 3);
	//   96  196:aload_0         
	//   97  197:aload           6
	//   98  199:iconst_3        
	//   99  200:invokevirtual   #190 <Method void _matchToken(String, int)>
					if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
	//* 100  203:aload_0         
	//* 101  204:getstatic       #567 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//* 102  207:invokevirtual   #262 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//* 103  210:ifeq            232
					{
						if(!flag)
	//* 104  213:iload_2         
	//* 105  214:ifeq            220
	//* 106  217:goto            224
							d = (1.0D / 0.0D);
	//  107  220:ldc2w           #568 <Double (1.0D / 0.0D)>
	//  108  223:dstore_3        
						return resetAsNaN(s1, d);
	//  109  224:aload_0         
	//  110  225:aload           6
	//  111  227:dload_3         
	//  112  228:invokevirtual   #573 <Method JsonToken resetAsNaN(String, double)>
	//  113  231:areturn         
					}
					StringBuilder stringbuilder1 = new StringBuilder();
	//  114  232:new             #339 <Class StringBuilder>
	//  115  235:dup             
	//  116  236:invokespecial   #341 <Method void StringBuilder()>
	//  117  239:astore          7
					stringbuilder1.append("Non-standard token '");
	//  118  241:aload           7
	//  119  243:ldc2            #575 <String "Non-standard token '">
	//  120  246:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  121  249:pop             
					stringbuilder1.append(s1);
	//  122  250:aload           7
	//  123  252:aload           6
	//  124  254:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  125  257:pop             
					stringbuilder1.append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
	//  126  258:aload           7
	//  127  260:ldc2            #577 <String "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//  128  263:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  129  266:pop             
					_reportError(stringbuilder1.toString());
	//  130  267:aload_0         
	//  131  268:aload           7
	//  132  270:invokevirtual   #356 <Method String StringBuilder.toString()>
	//  133  273:invokevirtual   #580 <Method void _reportError(String)>
					j = i;
	//  134  276:iload_1         
	//  135  277:istore          5
				}
			}
		}
		reportUnexpectedNumberChar(j, "expected digit (0-9) to follow minus sign, for valid numeric value");
	//  136  279:aload_0         
	//  137  280:iload           5
	//  138  282:ldc2            #586 <String "expected digit (0-9) to follow minus sign, for valid numeric value">
	//  139  285:invokevirtual   #277 <Method void reportUnexpectedNumberChar(int, String)>
		return null;
	//  140  288:aconst_null     
	//  141  289:areturn         
	}

	protected String _handleOddName(int i)
		throws IOException
	{
		if(i == 39 && isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES))
	//*   0    0:iload_1         
	//*   1    1:bipush          39
	//*   2    3:icmpne          21
	//*   3    6:aload_0         
	//*   4    7:getstatic       #591 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_SINGLE_QUOTES>
	//*   5   10:invokevirtual   #262 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   6   13:ifeq            21
			return _parseAposName();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #594 <Method String _parseAposName()>
	//    9   20:areturn         
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES))
	//*  10   21:aload_0         
	//*  11   22:getstatic       #597 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_UNQUOTED_FIELD_NAMES>
	//*  12   25:invokevirtual   #262 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  13   28:ifne            39
			_reportUnexpectedChar(i, "was expecting double-quote to start field name");
	//   14   31:aload_0         
	//   15   32:iload_1         
	//   16   33:ldc2            #599 <String "was expecting double-quote to start field name">
	//   17   36:invokevirtual   #393 <Method void _reportUnexpectedChar(int, String)>
		int ai[] = CharTypes.getInputCodeLatin1JsNames();
	//   18   39:invokestatic    #602 <Method int[] CharTypes.getInputCodeLatin1JsNames()>
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
	//   38   76:invokestatic    #92  <Method boolean Character.isJavaIdentifierPart(char)>
	//   39   79:istore          7
		}
		if(!flag)
	//*  40   81:iload           7
	//*  41   83:ifne            94
			_reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
	//   42   86:aload_0         
	//   43   87:iload_1         
	//   44   88:ldc2            #604 <String "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name">
	//   45   91:invokevirtual   #393 <Method void _reportUnexpectedChar(int, String)>
		int l = _inputPtr;
	//   46   94:aload_0         
	//   47   95:getfield        #65  <Field int _inputPtr>
	//   48   98:istore          4
		int j = _hashSeed;
	//   49  100:aload_0         
	//   50  101:getfield        #79  <Field int _hashSeed>
	//   51  104:istore_2        
		int j1 = _inputEnd;
	//   52  105:aload_0         
	//   53  106:getfield        #68  <Field int _inputEnd>
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
	//   65  127:getfield        #62  <Field char[] _inputBuffer>
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
	//   77  147:getfield        #65  <Field int _inputPtr>
	//   78  150:iconst_1        
	//   79  151:isub            
	//   80  152:istore_3        
						_inputPtr = i;
	//   81  153:aload_0         
	//   82  154:iload_1         
	//   83  155:putfield        #65  <Field int _inputPtr>
						return _symbols.findSymbol(_inputBuffer, k, i - k, j);
	//   84  158:aload_0         
	//   85  159:getfield        #72  <Field CharsToNameCanonicalizer _symbols>
	//   86  162:aload_0         
	//   87  163:getfield        #62  <Field char[] _inputBuffer>
	//   88  166:iload_3         
	//   89  167:iload_1         
	//   90  168:iload_3         
	//   91  169:isub            
	//   92  170:iload_2         
	//   93  171:invokevirtual   #180 <Method String CharsToNameCanonicalizer.findSymbol(char[], int, int, int)>
	//   94  174:areturn         
					}
				} else
				if(!Character.isJavaIdentifierPart((char)k))
	//*  95  175:iload_3         
	//*  96  176:int2char        
	//*  97  177:invokestatic    #92  <Method boolean Character.isJavaIdentifierPart(char)>
	//*  98  180:ifne            212
				{
					k = _inputPtr - 1;
	//   99  183:aload_0         
	//  100  184:getfield        #65  <Field int _inputPtr>
	//  101  187:iconst_1        
	//  102  188:isub            
	//  103  189:istore_3        
					_inputPtr = i;
	//  104  190:aload_0         
	//  105  191:iload_1         
	//  106  192:putfield        #65  <Field int _inputPtr>
					return _symbols.findSymbol(_inputBuffer, k, i - k, j);
	//  107  195:aload_0         
	//  108  196:getfield        #72  <Field CharsToNameCanonicalizer _symbols>
	//  109  199:aload_0         
	//  110  200:getfield        #62  <Field char[] _inputBuffer>
	//  111  203:iload_3         
	//  112  204:iload_1         
	//  113  205:iload_3         
	//  114  206:isub            
	//  115  207:iload_2         
	//  116  208:invokevirtual   #180 <Method String CharsToNameCanonicalizer.findSymbol(char[], int, int, int)>
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
	//  138  240:getfield        #65  <Field int _inputPtr>
	//  139  243:istore_2        
		_inputPtr = i;
	//  140  244:aload_0         
	//  141  245:iload_1         
	//  142  246:putfield        #65  <Field int _inputPtr>
		return _handleOddName2(j - 1, k, ai);
	//  143  249:aload_0         
	//  144  250:iload_2         
	//  145  251:iconst_1        
	//  146  252:isub            
	//  147  253:iload_3         
	//  148  254:aload           8
	//  149  256:invokespecial   #606 <Method String _handleOddName2(int, int, int[])>
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
	//*  16   52:getfield        #65  <Field int _inputPtr>
	//*  17   55:aload_0         
	//*  18   56:getfield        #68  <Field int _inputEnd>
	//*  19   59:icmplt          76
	//*  20   62:aload_0         
	//*  21   63:invokevirtual   #164 <Method boolean _loadMore()>
	//*  22   66:ifne            76
								_reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_INT);
	//   23   69:aload_0         
	//   24   70:getstatic       #317 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//   25   73:invokevirtual   #558 <Method void _reportInvalidEOFInValue(JsonToken)>
							char ac[] = _inputBuffer;
	//   26   76:aload_0         
	//   27   77:getfield        #62  <Field char[] _inputBuffer>
	//   28   80:astore_2        
							i = _inputPtr;
	//   29   81:aload_0         
	//   30   82:getfield        #65  <Field int _inputPtr>
	//   31   85:istore_1        
							_inputPtr = i + 1;
	//   32   86:aload_0         
	//   33   87:iload_1         
	//   34   88:iconst_1        
	//   35   89:iadd            
	//   36   90:putfield        #65  <Field int _inputPtr>
							return _handleInvalidNumberStart(((int) (ac[i])), false);
	//   37   93:aload_0         
	//   38   94:aload_2         
	//   39   95:iload_1         
	//   40   96:caload          
	//   41   97:iconst_0        
	//   42   98:invokevirtual   #328 <Method JsonToken _handleInvalidNumberStart(int, boolean)>
	//   43  101:areturn         

						case 44: // ','
							break;
						}
					else
					if(!_parsingContext.inArray())
	//*  44  102:aload_0         
	//*  45  103:getfield        #114 <Field JsonReadContext _parsingContext>
	//*  46  106:invokevirtual   #120 <Method boolean JsonReadContext.inArray()>
	//*  47  109:ifne            115
						break MISSING_BLOCK_LABEL_232;
	//   48  112:goto            232
					if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES))
	//*  49  115:aload_0         
	//*  50  116:getstatic       #258 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_MISSING_VALUES>
	//*  51  119:invokevirtual   #262 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  52  122:ifeq            232
					{
						_inputPtr = _inputPtr - 1;
	//   53  125:aload_0         
	//   54  126:aload_0         
	//   55  127:getfield        #65  <Field int _inputPtr>
	//   56  130:iconst_1        
	//   57  131:isub            
	//   58  132:putfield        #65  <Field int _inputPtr>
						return JsonToken.VALUE_NULL;
	//   59  135:getstatic       #252 <Field JsonToken JsonToken.VALUE_NULL>
	//   60  138:areturn         
					}
				} else
				{
					_matchToken("NaN", 1);
	//   61  139:aload_0         
	//   62  140:ldc2            #608 <String "NaN">
	//   63  143:iconst_1        
	//   64  144:invokevirtual   #190 <Method void _matchToken(String, int)>
					if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
	//*  65  147:aload_0         
	//*  66  148:getstatic       #567 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  67  151:invokevirtual   #262 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  68  154:ifeq            168
						return resetAsNaN("NaN", (0.0D / 0.0D));
	//   69  157:aload_0         
	//   70  158:ldc2            #608 <String "NaN">
	//   71  161:ldc2w           #609 <Double (0.0D / 0.0D)>
	//   72  164:invokevirtual   #573 <Method JsonToken resetAsNaN(String, double)>
	//   73  167:areturn         
					_reportError("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
	//   74  168:aload_0         
	//   75  169:ldc2            #612 <String "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//   76  172:invokevirtual   #580 <Method void _reportError(String)>
				}
			} else
	//*  77  175:goto            232
			{
				_matchToken("Infinity", 1);
	//   78  178:aload_0         
	//   79  179:ldc2            #614 <String "Infinity">
	//   80  182:iconst_1        
	//   81  183:invokevirtual   #190 <Method void _matchToken(String, int)>
				if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
	//*  82  186:aload_0         
	//*  83  187:getstatic       #567 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_NON_NUMERIC_NUMBERS>
	//*  84  190:invokevirtual   #262 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  85  193:ifeq            207
					return resetAsNaN("Infinity", (1.0D / 0.0D));
	//   86  196:aload_0         
	//   87  197:ldc2            #614 <String "Infinity">
	//   88  200:ldc2w           #568 <Double (1.0D / 0.0D)>
	//   89  203:invokevirtual   #573 <Method JsonToken resetAsNaN(String, double)>
	//   90  206:areturn         
				_reportError("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
	//   91  207:aload_0         
	//   92  208:ldc2            #616 <String "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow">
	//   93  211:invokevirtual   #580 <Method void _reportError(String)>
			}
		} else
	//*  94  214:goto            232
		if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES))
	//*  95  217:aload_0         
	//*  96  218:getstatic       #591 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_SINGLE_QUOTES>
	//*  97  221:invokevirtual   #262 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  98  224:ifeq            232
			return _handleApos();
	//   99  227:aload_0         
	//  100  228:invokevirtual   #618 <Method JsonToken _handleApos()>
	//  101  231:areturn         
		if(Character.isJavaIdentifierStart(i))
	//* 102  232:iload_1         
	//* 103  233:invokestatic    #622 <Method boolean Character.isJavaIdentifierStart(int)>
	//* 104  236:ifeq            273
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  105  239:new             #339 <Class StringBuilder>
	//  106  242:dup             
	//  107  243:invokespecial   #341 <Method void StringBuilder()>
	//  108  246:astore_2        
			stringbuilder.append("");
	//  109  247:aload_2         
	//  110  248:ldc2            #624 <String "">
	//  111  251:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  112  254:pop             
			stringbuilder.append((char)i);
	//  113  255:aload_2         
	//  114  256:iload_1         
	//  115  257:int2char        
	//  116  258:invokevirtual   #505 <Method StringBuilder StringBuilder.append(char)>
	//  117  261:pop             
			_reportInvalidToken(stringbuilder.toString(), "('true', 'false' or 'null')");
	//  118  262:aload_0         
	//  119  263:aload_2         
	//  120  264:invokevirtual   #356 <Method String StringBuilder.toString()>
	//  121  267:ldc2            #626 <String "('true', 'false' or 'null')">
	//  122  270:invokevirtual   #629 <Method void _reportInvalidToken(String, String)>
		}
		_reportUnexpectedChar(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
	//  123  273:aload_0         
	//  124  274:iload_1         
	//  125  275:ldc2            #631 <String "expected a valid value (number, String, array, object, 'true', 'false' or 'null')">
	//  126  278:invokevirtual   #393 <Method void _reportUnexpectedChar(int, String)>
		return null;
	//  127  281:aconst_null     
	//  128  282:areturn         
	}

	protected boolean _loadMore()
		throws IOException
	{
		int i = _inputEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int _inputEnd>
	//    2    4:istore_1        
		long l = _currInputProcessed;
	//    3    5:aload_0         
	//    4    6:getfield        #424 <Field long _currInputProcessed>
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
	//   13   19:putfield        #424 <Field long _currInputProcessed>
		_currInputRowStart = _currInputRowStart - i;
	//   14   22:aload_0         
	//   15   23:aload_0         
	//   16   24:getfield        #372 <Field int _currInputRowStart>
	//   17   27:iload_1         
	//   18   28:isub            
	//   19   29:putfield        #372 <Field int _currInputRowStart>
		_nameStartOffset = _nameStartOffset - l1;
	//   20   32:aload_0         
	//   21   33:aload_0         
	//   22   34:getfield        #430 <Field long _nameStartOffset>
	//   23   37:lload           4
	//   24   39:lsub            
	//   25   40:putfield        #430 <Field long _nameStartOffset>
		Reader reader = _reader;
	//   26   43:aload_0         
	//   27   44:getfield        #54  <Field Reader _reader>
	//   28   47:astore          6
		if(reader != null)
	//*  29   49:aload           6
	//*  30   51:ifnull          139
		{
			char ac[] = _inputBuffer;
	//   31   54:aload_0         
	//   32   55:getfield        #62  <Field char[] _inputBuffer>
	//   33   58:astore          7
			int j = reader.read(ac, 0, ac.length);
	//   34   60:aload           6
	//   35   62:aload           7
	//   36   64:iconst_0        
	//   37   65:aload           7
	//   38   67:arraylength     
	//   39   68:invokevirtual   #635 <Method int Reader.read(char[], int, int)>
	//   40   71:istore_1        
			if(j > 0)
	//*  41   72:iload_1         
	//*  42   73:ifle            88
			{
				_inputPtr = 0;
	//   43   76:aload_0         
	//   44   77:iconst_0        
	//   45   78:putfield        #65  <Field int _inputPtr>
				_inputEnd = j;
	//   46   81:aload_0         
	//   47   82:iload_1         
	//   48   83:putfield        #68  <Field int _inputEnd>
				return true;
	//   49   86:iconst_1        
	//   50   87:ireturn         
			}
			_closeInput();
	//   51   88:aload_0         
	//   52   89:invokevirtual   #637 <Method void _closeInput()>
			if(j != 0)
	//*  53   92:iload_1         
	//*  54   93:ifeq            98
			{
				return false;
	//   55   96:iconst_0        
	//   56   97:ireturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   57   98:new             #339 <Class StringBuilder>
	//   58  101:dup             
	//   59  102:invokespecial   #341 <Method void StringBuilder()>
	//   60  105:astore          6
				stringbuilder.append("Reader returned 0 characters when trying to read ");
	//   61  107:aload           6
	//   62  109:ldc2            #639 <String "Reader returned 0 characters when trying to read ">
	//   63  112:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   64  115:pop             
				stringbuilder.append(_inputEnd);
	//   65  116:aload           6
	//   66  118:aload_0         
	//   67  119:getfield        #68  <Field int _inputEnd>
	//   68  122:invokevirtual   #642 <Method StringBuilder StringBuilder.append(int)>
	//   69  125:pop             
				throw new IOException(stringbuilder.toString());
	//   70  126:new             #86  <Class IOException>
	//   71  129:dup             
	//   72  130:aload           6
	//   73  132:invokevirtual   #356 <Method String StringBuilder.toString()>
	//   74  135:invokespecial   #644 <Method void IOException(String)>
	//   75  138:athrow          
			}
		} else
		{
			return false;
	//   76  139:iconst_0        
	//   77  140:ireturn         
		}
	}

	protected void _loadMoreGuaranteed()
		throws IOException
	{
		if(!_loadMore())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #164 <Method boolean _loadMore()>
	//*   2    4:ifne            11
			_reportInvalidEOF();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #646 <Method void _reportInvalidEOF()>
	//    5   11:return          
	}

	protected final void _matchToken(String s, int i)
		throws IOException
	{
		int k = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #197 <Method int String.length()>
	//    2    4:istore          4
		int j = i;
	//    3    6:iload_2         
	//    4    7:istore_3        
		if(_inputPtr + k >= _inputEnd)
	//*   5    8:aload_0         
	//*   6    9:getfield        #65  <Field int _inputPtr>
	//*   7   12:iload           4
	//*   8   14:iadd            
	//*   9   15:aload_0         
	//*  10   16:getfield        #68  <Field int _inputEnd>
	//*  11   19:icmplt          29
		{
			_matchToken2(s, i);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:iload_2         
	//   15   25:invokespecial   #648 <Method void _matchToken2(String, int)>
			return;
	//   16   28:return          
		}
		do
		{
			if(_inputBuffer[_inputPtr] != s.charAt(j))
	//*  17   29:aload_0         
	//*  18   30:getfield        #62  <Field char[] _inputBuffer>
	//*  19   33:aload_0         
	//*  20   34:getfield        #65  <Field int _inputPtr>
	//*  21   37:caload          
	//*  22   38:aload_1         
	//*  23   39:iload_3         
	//*  24   40:invokevirtual   #201 <Method char String.charAt(int)>
	//*  25   43:icmpeq          56
				_reportInvalidToken(s.substring(0, j));
	//   26   46:aload_0         
	//   27   47:aload_1         
	//   28   48:iconst_0        
	//   29   49:iload_3         
	//   30   50:invokevirtual   #98  <Method String String.substring(int, int)>
	//   31   53:invokevirtual   #102 <Method void _reportInvalidToken(String)>
			_inputPtr = _inputPtr + 1;
	//   32   56:aload_0         
	//   33   57:aload_0         
	//   34   58:getfield        #65  <Field int _inputPtr>
	//   35   61:iconst_1        
	//   36   62:iadd            
	//   37   63:putfield        #65  <Field int _inputPtr>
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
		j = ((int) (_inputBuffer[_inputPtr]));
	//   47   78:aload_0         
	//   48   79:getfield        #62  <Field char[] _inputBuffer>
	//   49   82:aload_0         
	//   50   83:getfield        #65  <Field int _inputPtr>
	//   51   86:caload          
	//   52   87:istore_3        
		if(j >= '0' && j != ']' && j != '}')
	//*  53   88:iload_3         
	//*  54   89:bipush          48
	//*  55   91:icmplt          113
	//*  56   94:iload_3         
	//*  57   95:bipush          93
	//*  58   97:icmpeq          113
	//*  59  100:iload_3         
	//*  60  101:bipush          125
	//*  61  103:icmpeq          113
			_checkMatchEnd(s, i, j);
	//   62  106:aload_0         
	//   63  107:aload_1         
	//   64  108:iload_2         
	//   65  109:iload_3         
	//   66  110:invokespecial   #203 <Method void _checkMatchEnd(String, int, int)>
	//   67  113:return          
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
	//    1    1:getfield        #65  <Field int _inputPtr>
	//    2    4:istore_3        
			int i1 = _hashSeed;
	//    3    5:aload_0         
	//    4    6:getfield        #79  <Field int _hashSeed>
	//    5    9:istore          4
			int j1 = _inputEnd;
	//    6   11:aload_0         
	//    7   12:getfield        #68  <Field int _inputEnd>
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
	//   16   28:getstatic       #46  <Field int[] _icLatin1>
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
	//   26   44:getfield        #62  <Field char[] _inputBuffer>
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
	//   34   57:getfield        #65  <Field int _inputPtr>
	//   35   60:istore_3        
					_inputPtr = j + 1;
	//   36   61:aload_0         
	//   37   62:iload_2         
	//   38   63:iconst_1        
	//   39   64:iadd            
	//   40   65:putfield        #65  <Field int _inputPtr>
					return _symbols.findSymbol(_inputBuffer, k, j - k, i);
	//   41   68:aload_0         
	//   42   69:getfield        #72  <Field CharsToNameCanonicalizer _symbols>
	//   43   72:aload_0         
	//   44   73:getfield        #62  <Field char[] _inputBuffer>
	//   45   76:iload_3         
	//   46   77:iload_2         
	//   47   78:iload_3         
	//   48   79:isub            
	//   49   80:iload_1         
	//   50   81:invokevirtual   #180 <Method String CharsToNameCanonicalizer.findSymbol(char[], int, int, int)>
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
	//   82  130:getfield        #65  <Field int _inputPtr>
	//   83  133:istore_3        
		_inputPtr = j;
	//   84  134:aload_0         
	//   85  135:iload_2         
	//   86  136:putfield        #65  <Field int _inputPtr>
		return _parseName2(l, i, 39);
	//   87  139:aload_0         
	//   88  140:iload_3         
	//   89  141:iload_1         
	//   90  142:bipush          39
	//   91  144:invokespecial   #650 <Method String _parseName2(int, int, int)>
	//   92  147:areturn         
	}

	protected final String _parseName()
		throws IOException
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field int _inputPtr>
	//    2    4:istore_1        
		int j = _hashSeed;
	//    3    5:aload_0         
	//    4    6:getfield        #79  <Field int _hashSeed>
	//    5    9:istore_2        
		int ai[] = _icLatin1;
	//    6   10:getstatic       #46  <Field int[] _icLatin1>
	//    7   13:astore          4
		do
		{
			if(i >= _inputEnd)
				break;
	//    8   15:iload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #68  <Field int _inputEnd>
	//   11   20:icmpge          93
			int k = ((int) (_inputBuffer[i]));
	//   12   23:aload_0         
	//   13   24:getfield        #62  <Field char[] _inputBuffer>
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
	//   29   51:getfield        #65  <Field int _inputPtr>
	//   30   54:istore_3        
					_inputPtr = i + 1;
	//   31   55:aload_0         
	//   32   56:iload_1         
	//   33   57:iconst_1        
	//   34   58:iadd            
	//   35   59:putfield        #65  <Field int _inputPtr>
					return _symbols.findSymbol(_inputBuffer, k, i - k, j);
	//   36   62:aload_0         
	//   37   63:getfield        #72  <Field CharsToNameCanonicalizer _symbols>
	//   38   66:aload_0         
	//   39   67:getfield        #62  <Field char[] _inputBuffer>
	//   40   70:iload_3         
	//   41   71:iload_1         
	//   42   72:iload_3         
	//   43   73:isub            
	//   44   74:iload_2         
	//   45   75:invokevirtual   #180 <Method String CharsToNameCanonicalizer.findSymbol(char[], int, int, int)>
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
	//   59   94:getfield        #65  <Field int _inputPtr>
	//   60   97:istore_3        
		_inputPtr = i;
	//   61   98:aload_0         
	//   62   99:iload_1         
	//   63  100:putfield        #65  <Field int _inputPtr>
		return _parseName2(l, j, 34);
	//   64  103:aload_0         
	//   65  104:iload_3         
	//   66  105:iload_2         
	//   67  106:bipush          34
	//   68  108:invokespecial   #650 <Method String _parseName2(int, int, int)>
	//   69  111:areturn         
	}

	protected final JsonToken _parseNegNumber()
		throws IOException
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field int _inputPtr>
	//    2    4:istore_1        
		int l = i - 1;
	//    3    5:iload_1         
	//    4    6:iconst_1        
	//    5    7:isub            
	//    6    8:istore          4
		int i1 = _inputEnd;
	//    7   10:aload_0         
	//    8   11:getfield        #68  <Field int _inputEnd>
	//    9   14:istore          5
		if(i >= i1)
	//*  10   16:iload_1         
	//*  11   17:iload           5
	//*  12   19:icmplt          30
			return _parseNumber2(true, l);
	//   13   22:aload_0         
	//   14   23:iconst_1        
	//   15   24:iload           4
	//   16   26:invokespecial   #271 <Method JsonToken _parseNumber2(boolean, int)>
	//   17   29:areturn         
		char ac[] = _inputBuffer;
	//   18   30:aload_0         
	//   19   31:getfield        #62  <Field char[] _inputBuffer>
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
	//   42   70:invokespecial   #271 <Method JsonToken _parseNumber2(boolean, int)>
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
	//   52   86:invokespecial   #271 <Method JsonToken _parseNumber2(boolean, int)>
	//   53   89:areturn         
				char ac1[] = _inputBuffer;
	//   54   90:aload_0         
	//   55   91:getfield        #62  <Field char[] _inputBuffer>
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
	//   95  156:putfield        #65  <Field int _inputPtr>
				if(_parsingContext.inRoot())
	//*  96  159:aload_0         
	//*  97  160:getfield        #114 <Field JsonReadContext _parsingContext>
	//*  98  163:invokevirtual   #282 <Method boolean JsonReadContext.inRoot()>
	//*  99  166:ifeq            174
					_verifyRootSpace(j);
	//  100  169:aload_0         
	//  101  170:iload_2         
	//  102  171:invokespecial   #285 <Method void _verifyRootSpace(int)>
				_textBuffer.resetWithShared(_inputBuffer, l, k - l);
	//  103  174:aload_0         
	//  104  175:getfield        #149 <Field TextBuffer _textBuffer>
	//  105  178:aload_0         
	//  106  179:getfield        #62  <Field char[] _inputBuffer>
	//  107  182:iload           4
	//  108  184:iload_3         
	//  109  185:iload           4
	//  110  187:isub            
	//  111  188:invokevirtual   #155 <Method void TextBuffer.resetWithShared(char[], int, int)>
				return resetInt(true, i);
	//  112  191:aload_0         
	//  113  192:iconst_1        
	//  114  193:iload_1         
	//  115  194:invokevirtual   #654 <Method JsonToken resetInt(boolean, int)>
	//  116  197:areturn         
			} else
			{
				_inputPtr = k;
	//  117  198:aload_0         
	//  118  199:iload_3         
	//  119  200:putfield        #65  <Field int _inputPtr>
				return _parseFloat(j, l, k, true, i);
	//  120  203:aload_0         
	//  121  204:iload_2         
	//  122  205:iload           4
	//  123  207:iload_3         
	//  124  208:iconst_1        
	//  125  209:iload_1         
	//  126  210:invokespecial   #656 <Method JsonToken _parseFloat(int, int, int, boolean, int)>
	//  127  213:areturn         
			}
		} else
		{
			_inputPtr = j;
	//  128  214:aload_0         
	//  129  215:iload_2         
	//  130  216:putfield        #65  <Field int _inputPtr>
			return _handleInvalidNumberStart(i, true);
	//  131  219:aload_0         
	//  132  220:iload_1         
	//  133  221:iconst_1        
	//  134  222:invokevirtual   #328 <Method JsonToken _handleInvalidNumberStart(int, boolean)>
	//  135  225:areturn         
		}
	}

	protected final JsonToken _parsePosNumber(int i)
		throws IOException
	{
		int j = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field int _inputPtr>
	//    2    4:istore_2        
		int l = j - 1;
	//    3    5:iload_2         
	//    4    6:iconst_1        
	//    5    7:isub            
	//    6    8:istore          4
		int i1 = _inputEnd;
	//    7   10:aload_0         
	//    8   11:getfield        #68  <Field int _inputEnd>
	//    9   14:istore          5
		if(i == 48)
	//*  10   16:iload_1         
	//*  11   17:bipush          48
	//*  12   19:icmpne          30
			return _parseNumber2(false, l);
	//   13   22:aload_0         
	//   14   23:iconst_0        
	//   15   24:iload           4
	//   16   26:invokespecial   #271 <Method JsonToken _parseNumber2(boolean, int)>
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
	//   25   41:putfield        #65  <Field int _inputPtr>
				return _parseNumber2(false, l);
	//   26   44:aload_0         
	//   27   45:iconst_0        
	//   28   46:iload           4
	//   29   48:invokespecial   #271 <Method JsonToken _parseNumber2(boolean, int)>
	//   30   51:areturn         
			}
			char ac[] = _inputBuffer;
	//   31   52:aload_0         
	//   32   53:getfield        #62  <Field char[] _inputBuffer>
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
	//   72  118:putfield        #65  <Field int _inputPtr>
			if(_parsingContext.inRoot())
	//*  73  121:aload_0         
	//*  74  122:getfield        #114 <Field JsonReadContext _parsingContext>
	//*  75  125:invokevirtual   #282 <Method boolean JsonReadContext.inRoot()>
	//*  76  128:ifeq            136
				_verifyRootSpace(j);
	//   77  131:aload_0         
	//   78  132:iload_2         
	//   79  133:invokespecial   #285 <Method void _verifyRootSpace(int)>
			_textBuffer.resetWithShared(_inputBuffer, l, k - l);
	//   80  136:aload_0         
	//   81  137:getfield        #149 <Field TextBuffer _textBuffer>
	//   82  140:aload_0         
	//   83  141:getfield        #62  <Field char[] _inputBuffer>
	//   84  144:iload           4
	//   85  146:iload_3         
	//   86  147:iload           4
	//   87  149:isub            
	//   88  150:invokevirtual   #155 <Method void TextBuffer.resetWithShared(char[], int, int)>
			return resetInt(false, i);
	//   89  153:aload_0         
	//   90  154:iconst_0        
	//   91  155:iload_1         
	//   92  156:invokevirtual   #654 <Method JsonToken resetInt(boolean, int)>
	//   93  159:areturn         
		} else
		{
			_inputPtr = k;
	//   94  160:aload_0         
	//   95  161:iload_3         
	//   96  162:putfield        #65  <Field int _inputPtr>
			return _parseFloat(j, l, k, false, i);
	//   97  165:aload_0         
	//   98  166:iload_2         
	//   99  167:iload           4
	//  100  169:iload_3         
	//  101  170:iconst_0        
	//  102  171:iload_1         
	//  103  172:invokespecial   #656 <Method JsonToken _parseFloat(int, int, int, boolean, int)>
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
		int l = 0;
	//    3    4:iconst_0        
	//    4    5:istore          7
		int i = 0;
	//    5    7:iconst_0        
	//    6    8:istore          5
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
					char c;
label2:
					{
label3:
						{
							do
							{
								if(_inputPtr >= _inputEnd)
	//*   7   10:aload_0         
	//*   8   11:getfield        #65  <Field int _inputPtr>
	//*   9   14:aload_0         
	//*  10   15:getfield        #68  <Field int _inputEnd>
	//*  11   18:icmplt          25
									_loadMoreGuaranteed();
	//   12   21:aload_0         
	//   13   22:invokevirtual   #473 <Method void _loadMoreGuaranteed()>
								char ac[] = _inputBuffer;
	//   14   25:aload_0         
	//   15   26:getfield        #62  <Field char[] _inputBuffer>
	//   16   29:astore          12
								int j = _inputPtr;
	//   17   31:aload_0         
	//   18   32:getfield        #65  <Field int _inputPtr>
	//   19   35:istore          6
								_inputPtr = j + 1;
	//   20   37:aload_0         
	//   21   38:iload           6
	//   22   40:iconst_1        
	//   23   41:iadd            
	//   24   42:putfield        #65  <Field int _inputPtr>
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
	//   34   62:invokevirtual   #479 <Method int Base64Variant.decodeBase64Char(char)>
	//   35   65:istore          6
							j1 = k;
	//   36   67:iload           6
	//   37   69:istore          9
							if(k < 0)
	//*  38   71:iload           6
	//*  39   73:ifge            112
							{
								if(c == '"')
	//*  40   76:iload           4
	//*  41   78:bipush          34
	//*  42   80:icmpne          90
								{
									k = l;
	//   43   83:iload           7
	//   44   85:istore          6
									break label3;
	//   45   87:goto            597
								}
								k = _decodeBase64Escape(base64variant, c, 0);
	//   46   90:aload_0         
	//   47   91:aload_1         
	//   48   92:iload           4
	//   49   94:iconst_0        
	//   50   95:invokevirtual   #489 <Method int _decodeBase64Escape(Base64Variant, char, int)>
	//   51   98:istore          6
								j1 = k;
	//   52  100:iload           6
	//   53  102:istore          9
								if(k < 0)
	//*  54  104:iload           6
	//*  55  106:ifge            112
									continue;
	//   56  109:goto            10
							}
							k = l;
	//   57  112:iload           7
	//   58  114:istore          6
							i1 = i;
	//   59  116:iload           5
	//   60  118:istore          8
							if(i > k1 - 3)
	//*  61  120:iload           5
	//*  62  122:iload           10
	//*  63  124:iconst_3        
	//*  64  125:isub            
	//*  65  126:icmple          147
							{
								k = l + i;
	//   66  129:iload           7
	//   67  131:iload           5
	//   68  133:iadd            
	//   69  134:istore          6
								outputstream.write(abyte0, 0, i);
	//   70  136:aload_2         
	//   71  137:aload_3         
	//   72  138:iconst_0        
	//   73  139:iload           5
	//   74  141:invokevirtual   #664 <Method void OutputStream.write(byte[], int, int)>
								i1 = 0;
	//   75  144:iconst_0        
	//   76  145:istore          8
							}
							if(_inputPtr >= _inputEnd)
	//*  77  147:aload_0         
	//*  78  148:getfield        #65  <Field int _inputPtr>
	//*  79  151:aload_0         
	//*  80  152:getfield        #68  <Field int _inputEnd>
	//*  81  155:icmplt          162
								_loadMoreGuaranteed();
	//   82  158:aload_0         
	//   83  159:invokevirtual   #473 <Method void _loadMoreGuaranteed()>
							char ac1[] = _inputBuffer;
	//   84  162:aload_0         
	//   85  163:getfield        #62  <Field char[] _inputBuffer>
	//   86  166:astore          12
							i = _inputPtr;
	//   87  168:aload_0         
	//   88  169:getfield        #65  <Field int _inputPtr>
	//   89  172:istore          5
							_inputPtr = i + 1;
	//   90  174:aload_0         
	//   91  175:iload           5
	//   92  177:iconst_1        
	//   93  178:iadd            
	//   94  179:putfield        #65  <Field int _inputPtr>
							c = ac1[i];
	//   95  182:aload           12
	//   96  184:iload           5
	//   97  186:caload          
	//   98  187:istore          4
							l = base64variant.decodeBase64Char(c);
	//   99  189:aload_1         
	//  100  190:iload           4
	//  101  192:invokevirtual   #479 <Method int Base64Variant.decodeBase64Char(char)>
	//  102  195:istore          7
							i = l;
	//  103  197:iload           7
	//  104  199:istore          5
							if(l < 0)
	//* 105  201:iload           7
	//* 106  203:ifge            216
								i = _decodeBase64Escape(base64variant, c, 1);
	//  107  206:aload_0         
	//  108  207:aload_1         
	//  109  208:iload           4
	//  110  210:iconst_1        
	//  111  211:invokevirtual   #489 <Method int _decodeBase64Escape(Base64Variant, char, int)>
	//  112  214:istore          5
							l1 = j1 << 6 | i;
	//  113  216:iload           9
	//  114  218:bipush          6
	//  115  220:ishl            
	//  116  221:iload           5
	//  117  223:ior             
	//  118  224:istore          11
							if(_inputPtr >= _inputEnd)
	//* 119  226:aload_0         
	//* 120  227:getfield        #65  <Field int _inputPtr>
	//* 121  230:aload_0         
	//* 122  231:getfield        #68  <Field int _inputEnd>
	//* 123  234:icmplt          241
								_loadMoreGuaranteed();
	//  124  237:aload_0         
	//  125  238:invokevirtual   #473 <Method void _loadMoreGuaranteed()>
							ac1 = _inputBuffer;
	//  126  241:aload_0         
	//  127  242:getfield        #62  <Field char[] _inputBuffer>
	//  128  245:astore          12
							i = _inputPtr;
	//  129  247:aload_0         
	//  130  248:getfield        #65  <Field int _inputPtr>
	//  131  251:istore          5
							_inputPtr = i + 1;
	//  132  253:aload_0         
	//  133  254:iload           5
	//  134  256:iconst_1        
	//  135  257:iadd            
	//  136  258:putfield        #65  <Field int _inputPtr>
							c = ac1[i];
	//  137  261:aload           12
	//  138  263:iload           5
	//  139  265:caload          
	//  140  266:istore          4
							l = base64variant.decodeBase64Char(c);
	//  141  268:aload_1         
	//  142  269:iload           4
	//  143  271:invokevirtual   #479 <Method int Base64Variant.decodeBase64Char(char)>
	//  144  274:istore          7
							j1 = l;
	//  145  276:iload           7
	//  146  278:istore          9
							if(l < 0)
	//* 147  280:iload           7
	//* 148  282:ifge            468
							{
								i = l;
	//  149  285:iload           7
	//  150  287:istore          5
								if(l != -2)
	//* 151  289:iload           7
	//* 152  291:bipush          -2
	//* 153  293:icmpeq          338
								{
									if(c == '"' && !base64variant.usesPadding())
	//* 154  296:iload           4
	//* 155  298:bipush          34
	//* 156  300:icmpne          328
	//* 157  303:aload_1         
	//* 158  304:invokevirtual   #492 <Method boolean Base64Variant.usesPadding()>
	//* 159  307:ifne            328
									{
										abyte0[i1] = (byte)(l1 >> 4);
	//  160  310:aload_3         
	//  161  311:iload           8
	//  162  313:iload           11
	//  163  315:iconst_4        
	//  164  316:ishr            
	//  165  317:int2byte        
	//  166  318:bastore         
										i = i1 + 1;
	//  167  319:iload           8
	//  168  321:iconst_1        
	//  169  322:iadd            
	//  170  323:istore          5
										break label3;
	//  171  325:goto            597
									}
									i = _decodeBase64Escape(base64variant, c, 2);
	//  172  328:aload_0         
	//  173  329:aload_1         
	//  174  330:iload           4
	//  175  332:iconst_2        
	//  176  333:invokevirtual   #489 <Method int _decodeBase64Escape(Base64Variant, char, int)>
	//  177  336:istore          5
								}
								j1 = i;
	//  178  338:iload           5
	//  179  340:istore          9
								if(i == -2)
	//* 180  342:iload           5
	//* 181  344:bipush          -2
	//* 182  346:icmpne          468
								{
									if(_inputPtr >= _inputEnd)
	//* 183  349:aload_0         
	//* 184  350:getfield        #65  <Field int _inputPtr>
	//* 185  353:aload_0         
	//* 186  354:getfield        #68  <Field int _inputEnd>
	//* 187  357:icmplt          364
										_loadMoreGuaranteed();
	//  188  360:aload_0         
	//  189  361:invokevirtual   #473 <Method void _loadMoreGuaranteed()>
									ac1 = _inputBuffer;
	//  190  364:aload_0         
	//  191  365:getfield        #62  <Field char[] _inputBuffer>
	//  192  368:astore          12
									i = _inputPtr;
	//  193  370:aload_0         
	//  194  371:getfield        #65  <Field int _inputPtr>
	//  195  374:istore          5
									_inputPtr = i + 1;
	//  196  376:aload_0         
	//  197  377:iload           5
	//  198  379:iconst_1        
	//  199  380:iadd            
	//  200  381:putfield        #65  <Field int _inputPtr>
									c = ac1[i];
	//  201  384:aload           12
	//  202  386:iload           5
	//  203  388:caload          
	//  204  389:istore          4
									if(base64variant.usesPaddingChar(c))
	//* 205  391:aload_1         
	//* 206  392:iload           4
	//* 207  394:invokevirtual   #497 <Method boolean Base64Variant.usesPaddingChar(char)>
	//* 208  397:ifeq            422
									{
										abyte0[i1] = (byte)(l1 >> 4);
	//  209  400:aload_3         
	//  210  401:iload           8
	//  211  403:iload           11
	//  212  405:iconst_4        
	//  213  406:ishr            
	//  214  407:int2byte        
	//  215  408:bastore         
										i = i1 + 1;
	//  216  409:iload           8
	//  217  411:iconst_1        
	//  218  412:iadd            
	//  219  413:istore          5
										l = k;
	//  220  415:iload           6
	//  221  417:istore          7
									} else
	//* 222  419:goto            10
									{
										outputstream = ((OutputStream) (new StringBuilder()));
	//  223  422:new             #339 <Class StringBuilder>
	//  224  425:dup             
	//  225  426:invokespecial   #341 <Method void StringBuilder()>
	//  226  429:astore_2        
										((StringBuilder) (outputstream)).append("expected padding character '");
	//  227  430:aload_2         
	//  228  431:ldc2            #499 <String "expected padding character '">
	//  229  434:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  230  437:pop             
										((StringBuilder) (outputstream)).append(base64variant.getPaddingChar());
	//  231  438:aload_2         
	//  232  439:aload_1         
	//  233  440:invokevirtual   #502 <Method char Base64Variant.getPaddingChar()>
	//  234  443:invokevirtual   #505 <Method StringBuilder StringBuilder.append(char)>
	//  235  446:pop             
										((StringBuilder) (outputstream)).append("'");
	//  236  447:aload_2         
	//  237  448:ldc2            #507 <String "'">
	//  238  451:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  239  454:pop             
										throw reportInvalidBase64Char(base64variant, ((int) (c)), 3, ((StringBuilder) (outputstream)).toString());
	//  240  455:aload_0         
	//  241  456:aload_1         
	//  242  457:iload           4
	//  243  459:iconst_3        
	//  244  460:aload_2         
	//  245  461:invokevirtual   #356 <Method String StringBuilder.toString()>
	//  246  464:invokevirtual   #511 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int, String)>
	//  247  467:athrow          
									}
									continue;
								}
							}
							l1 = l1 << 6 | j1;
	//  248  468:iload           11
	//  249  470:bipush          6
	//  250  472:ishl            
	//  251  473:iload           9
	//  252  475:ior             
	//  253  476:istore          11
							if(_inputPtr >= _inputEnd)
	//* 254  478:aload_0         
	//* 255  479:getfield        #65  <Field int _inputPtr>
	//* 256  482:aload_0         
	//* 257  483:getfield        #68  <Field int _inputEnd>
	//* 258  486:icmplt          493
								_loadMoreGuaranteed();
	//  259  489:aload_0         
	//  260  490:invokevirtual   #473 <Method void _loadMoreGuaranteed()>
							ac1 = _inputBuffer;
	//  261  493:aload_0         
	//  262  494:getfield        #62  <Field char[] _inputBuffer>
	//  263  497:astore          12
							i = _inputPtr;
	//  264  499:aload_0         
	//  265  500:getfield        #65  <Field int _inputPtr>
	//  266  503:istore          5
							_inputPtr = i + 1;
	//  267  505:aload_0         
	//  268  506:iload           5
	//  269  508:iconst_1        
	//  270  509:iadd            
	//  271  510:putfield        #65  <Field int _inputPtr>
							c = ac1[i];
	//  272  513:aload           12
	//  273  515:iload           5
	//  274  517:caload          
	//  275  518:istore          4
							l = base64variant.decodeBase64Char(c);
	//  276  520:aload_1         
	//  277  521:iload           4
	//  278  523:invokevirtual   #479 <Method int Base64Variant.decodeBase64Char(char)>
	//  279  526:istore          7
							j1 = l;
	//  280  528:iload           7
	//  281  530:istore          9
							if(l >= 0)
								break label0;
	//  282  532:iload           7
	//  283  534:ifge            692
							i = l;
	//  284  537:iload           7
	//  285  539:istore          5
							if(l == -2)
								break label1;
	//  286  541:iload           7
	//  287  543:bipush          -2
	//  288  545:icmpeq          639
							if(c != '"' || base64variant.usesPadding())
								break label2;
	//  289  548:iload           4
	//  290  550:bipush          34
	//  291  552:icmpne          629
	//  292  555:aload_1         
	//  293  556:invokevirtual   #492 <Method boolean Base64Variant.usesPadding()>
	//  294  559:ifne            629
							l = l1 >> 2;
	//  295  562:iload           11
	//  296  564:iconst_2        
	//  297  565:ishr            
	//  298  566:istore          7
							j1 = i1 + 1;
	//  299  568:iload           8
	//  300  570:iconst_1        
	//  301  571:iadd            
	//  302  572:istore          9
							abyte0[i1] = (byte)(l >> 8);
	//  303  574:aload_3         
	//  304  575:iload           8
	//  305  577:iload           7
	//  306  579:bipush          8
	//  307  581:ishr            
	//  308  582:int2byte        
	//  309  583:bastore         
							i = j1 + 1;
	//  310  584:iload           9
	//  311  586:iconst_1        
	//  312  587:iadd            
	//  313  588:istore          5
							abyte0[j1] = (byte)l;
	//  314  590:aload_3         
	//  315  591:iload           9
	//  316  593:iload           7
	//  317  595:int2byte        
	//  318  596:bastore         
						}
						_tokenIncomplete = false;
	//  319  597:aload_0         
	//  320  598:iconst_0        
	//  321  599:putfield        #237 <Field boolean _tokenIncomplete>
						l = k;
	//  322  602:iload           6
	//  323  604:istore          7
						if(i > 0)
	//* 324  606:iload           5
	//* 325  608:ifle            626
						{
							l = k + i;
	//  326  611:iload           6
	//  327  613:iload           5
	//  328  615:iadd            
	//  329  616:istore          7
							outputstream.write(abyte0, 0, i);
	//  330  618:aload_2         
	//  331  619:aload_3         
	//  332  620:iconst_0        
	//  333  621:iload           5
	//  334  623:invokevirtual   #664 <Method void OutputStream.write(byte[], int, int)>
						}
						return l;
	//  335  626:iload           7
	//  336  628:ireturn         
					}
					i = _decodeBase64Escape(base64variant, c, 3);
	//  337  629:aload_0         
	//  338  630:aload_1         
	//  339  631:iload           4
	//  340  633:iconst_3        
	//  341  634:invokevirtual   #489 <Method int _decodeBase64Escape(Base64Variant, char, int)>
	//  342  637:istore          5
				}
				j1 = i;
	//  343  639:iload           5
	//  344  641:istore          9
				if(i == -2)
	//* 345  643:iload           5
	//* 346  645:bipush          -2
	//* 347  647:icmpne          692
				{
					l = l1 >> 2;
	//  348  650:iload           11
	//  349  652:iconst_2        
	//  350  653:ishr            
	//  351  654:istore          7
					j1 = i1 + 1;
	//  352  656:iload           8
	//  353  658:iconst_1        
	//  354  659:iadd            
	//  355  660:istore          9
					abyte0[i1] = (byte)(l >> 8);
	//  356  662:aload_3         
	//  357  663:iload           8
	//  358  665:iload           7
	//  359  667:bipush          8
	//  360  669:ishr            
	//  361  670:int2byte        
	//  362  671:bastore         
					i = j1 + 1;
	//  363  672:iload           9
	//  364  674:iconst_1        
	//  365  675:iadd            
	//  366  676:istore          5
					abyte0[j1] = (byte)l;
	//  367  678:aload_3         
	//  368  679:iload           9
	//  369  681:iload           7
	//  370  683:int2byte        
	//  371  684:bastore         
					l = k;
	//  372  685:iload           6
	//  373  687:istore          7
					continue;
	//  374  689:goto            10
				}
			}
			i = l1 << 6 | j1;
	//  375  692:iload           11
	//  376  694:bipush          6
	//  377  696:ishl            
	//  378  697:iload           9
	//  379  699:ior             
	//  380  700:istore          5
			l = i1 + 1;
	//  381  702:iload           8
	//  382  704:iconst_1        
	//  383  705:iadd            
	//  384  706:istore          7
			abyte0[i1] = (byte)(i >> 16);
	//  385  708:aload_3         
	//  386  709:iload           8
	//  387  711:iload           5
	//  388  713:bipush          16
	//  389  715:ishr            
	//  390  716:int2byte        
	//  391  717:bastore         
			i1 = l + 1;
	//  392  718:iload           7
	//  393  720:iconst_1        
	//  394  721:iadd            
	//  395  722:istore          8
			abyte0[l] = (byte)(i >> 8);
	//  396  724:aload_3         
	//  397  725:iload           7
	//  398  727:iload           5
	//  399  729:bipush          8
	//  400  731:ishr            
	//  401  732:int2byte        
	//  402  733:bastore         
			abyte0[i1] = (byte)i;
	//  403  734:aload_3         
	//  404  735:iload           8
	//  405  737:iload           5
	//  406  739:int2byte        
	//  407  740:bastore         
			i = i1 + 1;
	//  408  741:iload           8
	//  409  743:iconst_1        
	//  410  744:iadd            
	//  411  745:istore          5
			l = k;
	//  412  747:iload           6
	//  413  749:istore          7
		} while(true);
	//  414  751:goto            10
	}

	protected void _releaseBuffers()
		throws IOException
	{
		super._releaseBuffers();
	//    0    0:aload_0         
	//    1    1:invokespecial   #667 <Method void ParserBase._releaseBuffers()>
		_symbols.release();
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field CharsToNameCanonicalizer _symbols>
	//    4    8:invokevirtual   #670 <Method void CharsToNameCanonicalizer.release()>
		if(_bufferRecyclable)
	//*   5   11:aload_0         
	//*   6   12:getfield        #81  <Field boolean _bufferRecyclable>
	//*   7   15:ifeq            40
		{
			char ac[] = _inputBuffer;
	//    8   18:aload_0         
	//    9   19:getfield        #62  <Field char[] _inputBuffer>
	//   10   22:astore_1        
			if(ac != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          40
			{
				_inputBuffer = null;
	//   13   27:aload_0         
	//   14   28:aconst_null     
	//   15   29:putfield        #62  <Field char[] _inputBuffer>
				_ioContext.releaseTokenBuffer(ac);
	//   16   32:aload_0         
	//   17   33:getfield        #453 <Field IOContext _ioContext>
	//   18   36:aload_1         
	//   19   37:invokevirtual   #674 <Method void IOContext.releaseTokenBuffer(char[])>
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
	//    2    2:ldc2            #676 <String "'null', 'true', 'false' or NaN">
	//    3    5:invokevirtual   #629 <Method void _reportInvalidToken(String, String)>
	//    4    8:return          
	}

	protected void _reportInvalidToken(String s, String s1)
		throws IOException
	{
		s = ((String) (new StringBuilder(s)));
	//    0    0:new             #339 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #677 <Method void StringBuilder(String)>
	//    4    8:astore_1        
		do
		{
			if(_inputPtr >= _inputEnd && !_loadMore())
				break;
	//    5    9:aload_0         
	//    6   10:getfield        #65  <Field int _inputPtr>
	//    7   13:aload_0         
	//    8   14:getfield        #68  <Field int _inputEnd>
	//    9   17:icmplt          27
	//   10   20:aload_0         
	//   11   21:invokevirtual   #164 <Method boolean _loadMore()>
	//   12   24:ifeq            81
			char c = _inputBuffer[_inputPtr];
	//   13   27:aload_0         
	//   14   28:getfield        #62  <Field char[] _inputBuffer>
	//   15   31:aload_0         
	//   16   32:getfield        #65  <Field int _inputPtr>
	//   17   35:caload          
	//   18   36:istore_3        
			if(!Character.isJavaIdentifierPart(c))
	//*  19   37:iload_3         
	//*  20   38:invokestatic    #92  <Method boolean Character.isJavaIdentifierPart(char)>
	//*  21   41:ifne            47
				break;
	//   22   44:goto            81
			_inputPtr = _inputPtr + 1;
	//   23   47:aload_0         
	//   24   48:aload_0         
	//   25   49:getfield        #65  <Field int _inputPtr>
	//   26   52:iconst_1        
	//   27   53:iadd            
	//   28   54:putfield        #65  <Field int _inputPtr>
			((StringBuilder) (s)).append(c);
	//   29   57:aload_1         
	//   30   58:iload_3         
	//   31   59:invokevirtual   #505 <Method StringBuilder StringBuilder.append(char)>
	//   32   62:pop             
			if(((StringBuilder) (s)).length() < 256)
				continue;
	//   33   63:aload_1         
	//   34   64:invokevirtual   #678 <Method int StringBuilder.length()>
	//   35   67:sipush          256
	//   36   70:icmplt          9
			((StringBuilder) (s)).append("...");
	//   37   73:aload_1         
	//   38   74:ldc2            #680 <String "...">
	//   39   77:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   40   80:pop             
			break;
		} while(true);
		_reportError("Unrecognized token '%s': was expecting %s", ((Object) (s)), ((Object) (s1)));
	//   41   81:aload_0         
	//   42   82:ldc2            #682 <String "Unrecognized token '%s': was expecting %s">
	//   43   85:aload_1         
	//   44   86:aload_2         
	//   45   87:invokevirtual   #685 <Method void _reportError(String, Object, Object)>
	//   46   90:return          
	}

	protected final void _skipCR()
		throws IOException
	{
		if((_inputPtr < _inputEnd || _loadMore()) && _inputBuffer[_inputPtr] == '\n')
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #68  <Field int _inputEnd>
	//*   4    8:icmplt          18
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #164 <Method boolean _loadMore()>
	//*   7   15:ifeq            42
	//*   8   18:aload_0         
	//*   9   19:getfield        #62  <Field char[] _inputBuffer>
	//*  10   22:aload_0         
	//*  11   23:getfield        #65  <Field int _inputPtr>
	//*  12   26:caload          
	//*  13   27:bipush          10
	//*  14   29:icmpne          42
			_inputPtr = _inputPtr + 1;
	//   15   32:aload_0         
	//   16   33:aload_0         
	//   17   34:getfield        #65  <Field int _inputPtr>
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #65  <Field int _inputPtr>
		_currInputRow = _currInputRow + 1;
	//   21   42:aload_0         
	//   22   43:aload_0         
	//   23   44:getfield        #369 <Field int _currInputRow>
	//   24   47:iconst_1        
	//   25   48:iadd            
	//   26   49:putfield        #369 <Field int _currInputRow>
		_currInputRowStart = _inputPtr;
	//   27   52:aload_0         
	//   28   53:aload_0         
	//   29   54:getfield        #65  <Field int _inputPtr>
	//   30   57:putfield        #372 <Field int _currInputRowStart>
	//   31   60:return          
	}

	protected final void _skipString()
		throws IOException
	{
		_tokenIncomplete = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #237 <Field boolean _tokenIncomplete>
		int i = _inputPtr;
	//    3    5:aload_0         
	//    4    6:getfield        #65  <Field int _inputPtr>
	//    5    9:istore_1        
		int j = _inputEnd;
	//    6   10:aload_0         
	//    7   11:getfield        #68  <Field int _inputEnd>
	//    8   14:istore_2        
		char ac[] = _inputBuffer;
	//    9   15:aload_0         
	//   10   16:getfield        #62  <Field char[] _inputBuffer>
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
	//   21   33:putfield        #65  <Field int _inputPtr>
				if(!_loadMore())
	//*  22   36:aload_0         
	//*  23   37:invokevirtual   #164 <Method boolean _loadMore()>
	//*  24   40:ifne            53
					_reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
	//   25   43:aload_0         
	//   26   44:ldc2            #537 <String ": was expecting closing quote for a string value">
	//   27   47:getstatic       #240 <Field JsonToken JsonToken.VALUE_STRING>
	//   28   50:invokevirtual   #300 <Method void _reportInvalidEOF(String, JsonToken)>
				l = _inputPtr;
	//   29   53:aload_0         
	//   30   54:getfield        #65  <Field int _inputPtr>
	//   31   57:istore          4
				k = _inputEnd;
	//   32   59:aload_0         
	//   33   60:getfield        #68  <Field int _inputEnd>
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
	//   51   89:putfield        #65  <Field int _inputPtr>
					_decodeEscaped();
	//   52   92:aload_0         
	//   53   93:invokevirtual   #304 <Method char _decodeEscaped()>
	//   54   96:pop             
					i = _inputPtr;
	//   55   97:aload_0         
	//   56   98:getfield        #65  <Field int _inputPtr>
	//   57  101:istore_1        
					j = _inputEnd;
	//   58  102:aload_0         
	//   59  103:getfield        #68  <Field int _inputEnd>
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
	//   70  124:putfield        #65  <Field int _inputPtr>
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
	//   77  136:putfield        #65  <Field int _inputPtr>
						_throwUnquotedSpace(j, "string value");
	//   78  139:aload_0         
	//   79  140:iload_2         
	//   80  141:ldc2            #539 <String "string value">
	//   81  144:invokevirtual   #309 <Method void _throwUnquotedSpace(int, String)>
					}
				}
			}
			j = k;
	//   82  147:iload_3         
	//   83  148:istore_2        
		} while(true);
	//   84  149:goto            21
	}

	public byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_EMBEDDED_OBJECT && _binaryValue != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field JsonToken _currToken>
	//*   2    4:getstatic       #692 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//*   3    7:if_acmpne       22
	//*   4   10:aload_0         
	//*   5   11:getfield        #696 <Field byte[] _binaryValue>
	//*   6   14:ifnull          22
			return _binaryValue;
	//    7   17:aload_0         
	//    8   18:getfield        #696 <Field byte[] _binaryValue>
	//    9   21:areturn         
		if(_currToken != JsonToken.VALUE_STRING)
	//*  10   22:aload_0         
	//*  11   23:getfield        #137 <Field JsonToken _currToken>
	//*  12   26:getstatic       #240 <Field JsonToken JsonToken.VALUE_STRING>
	//*  13   29:if_acmpeq       73
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   14   32:new             #339 <Class StringBuilder>
	//   15   35:dup             
	//   16   36:invokespecial   #341 <Method void StringBuilder()>
	//   17   39:astore_2        
			stringbuilder.append("Current token (");
	//   18   40:aload_2         
	//   19   41:ldc2            #698 <String "Current token (">
	//   20   44:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   21   47:pop             
			stringbuilder.append(((Object) (_currToken)));
	//   22   48:aload_2         
	//   23   49:aload_0         
	//   24   50:getfield        #137 <Field JsonToken _currToken>
	//   25   53:invokevirtual   #701 <Method StringBuilder StringBuilder.append(Object)>
	//   26   56:pop             
			stringbuilder.append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
	//   27   57:aload_2         
	//   28   58:ldc2            #703 <String ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary">
	//   29   61:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   30   64:pop             
			_reportError(stringbuilder.toString());
	//   31   65:aload_0         
	//   32   66:aload_2         
	//   33   67:invokevirtual   #356 <Method String StringBuilder.toString()>
	//   34   70:invokevirtual   #580 <Method void _reportError(String)>
		}
		if(_tokenIncomplete)
	//*  35   73:aload_0         
	//*  36   74:getfield        #237 <Field boolean _tokenIncomplete>
	//*  37   77:ifeq            146
		{
			try
			{
				_binaryValue = _decodeBase64(base64variant);
	//   38   80:aload_0         
	//   39   81:aload_0         
	//   40   82:aload_1         
	//   41   83:invokevirtual   #705 <Method byte[] _decodeBase64(Base64Variant)>
	//   42   86:putfield        #696 <Field byte[] _binaryValue>
			}
	//*  43   89:aload_0         
	//*  44   90:iconst_0        
	//*  45   91:putfield        #237 <Field boolean _tokenIncomplete>
	//*  46   94:goto            176
			catch(IllegalArgumentException illegalargumentexception)
	//*  47   97:astore_2        
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   48   98:new             #339 <Class StringBuilder>
	//   49  101:dup             
	//   50  102:invokespecial   #341 <Method void StringBuilder()>
	//   51  105:astore_3        
				stringbuilder1.append("Failed to decode VALUE_STRING as base64 (");
	//   52  106:aload_3         
	//   53  107:ldc2            #707 <String "Failed to decode VALUE_STRING as base64 (">
	//   54  110:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   55  113:pop             
				stringbuilder1.append(((Object) (base64variant)));
	//   56  114:aload_3         
	//   57  115:aload_1         
	//   58  116:invokevirtual   #701 <Method StringBuilder StringBuilder.append(Object)>
	//   59  119:pop             
				stringbuilder1.append("): ");
	//   60  120:aload_3         
	//   61  121:ldc2            #709 <String "): ">
	//   62  124:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   63  127:pop             
				stringbuilder1.append(illegalargumentexception.getMessage());
	//   64  128:aload_3         
	//   65  129:aload_2         
	//   66  130:invokevirtual   #712 <Method String IllegalArgumentException.getMessage()>
	//   67  133:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   68  136:pop             
				throw _constructError(stringbuilder1.toString());
	//   69  137:aload_0         
	//   70  138:aload_3         
	//   71  139:invokevirtual   #356 <Method String StringBuilder.toString()>
	//   72  142:invokevirtual   #360 <Method JsonParseException _constructError(String)>
	//   73  145:athrow          
			}
			_tokenIncomplete = false;
		} else
		if(_binaryValue == null)
	//*  74  146:aload_0         
	//*  75  147:getfield        #696 <Field byte[] _binaryValue>
	//*  76  150:ifnonnull       176
		{
			ByteArrayBuilder bytearraybuilder = _getByteArrayBuilder();
	//   77  153:aload_0         
	//   78  154:invokevirtual   #470 <Method ByteArrayBuilder _getByteArrayBuilder()>
	//   79  157:astore_2        
			_decodeBase64(getText(), bytearraybuilder, base64variant);
	//   80  158:aload_0         
	//   81  159:aload_0         
	//   82  160:invokevirtual   #715 <Method String getText()>
	//   83  163:aload_2         
	//   84  164:aload_1         
	//   85  165:invokevirtual   #718 <Method void _decodeBase64(String, ByteArrayBuilder, Base64Variant)>
			_binaryValue = bytearraybuilder.toByteArray();
	//   86  168:aload_0         
	//   87  169:aload_2         
	//   88  170:invokevirtual   #485 <Method byte[] ByteArrayBuilder.toByteArray()>
	//   89  173:putfield        #696 <Field byte[] _binaryValue>
		}
		return _binaryValue;
	//   90  176:aload_0         
	//   91  177:getfield        #696 <Field byte[] _binaryValue>
	//   92  180:areturn         
	}

	public ObjectCodec getCodec()
	{
		return _objectCodec;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field ObjectCodec _objectCodec>
	//    2    4:areturn         
	}

	public JsonLocation getCurrentLocation()
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field int _inputPtr>
	//    2    4:istore_1        
		int j = _currInputRowStart;
	//    3    5:aload_0         
	//    4    6:getfield        #372 <Field int _currInputRowStart>
	//    5    9:istore_2        
		Object obj = _getSourceReference();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #726 <Method Object _getSourceReference()>
	//    8   14:astore          5
		long l = _currInputProcessed;
	//    9   16:aload_0         
	//   10   17:getfield        #424 <Field long _currInputProcessed>
	//   11   20:lstore_3        
		return new JsonLocation(obj, -1L, (long)_inputPtr + l, _currInputRow, (i - j) + 1);
	//   12   21:new             #728 <Class JsonLocation>
	//   13   24:dup             
	//   14   25:aload           5
	//   15   27:ldc2w           #729 <Long -1L>
	//   16   30:aload_0         
	//   17   31:getfield        #65  <Field int _inputPtr>
	//   18   34:i2l             
	//   19   35:lload_3         
	//   20   36:ladd            
	//   21   37:aload_0         
	//   22   38:getfield        #369 <Field int _currInputRow>
	//   23   41:iload_1         
	//   24   42:iload_2         
	//   25   43:isub            
	//   26   44:iconst_1        
	//   27   45:iadd            
	//   28   46:invokespecial   #733 <Method void JsonLocation(Object, long, long, int, int)>
	//   29   49:areturn         
	}

	protected char getNextChar(String s)
		throws IOException
	{
		return getNextChar(s, ((JsonToken) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #321 <Method char getNextChar(String, JsonToken)>
	//    4    6:ireturn         
	}

	protected char getNextChar(String s, JsonToken jsontoken)
		throws IOException
	{
		if(_inputPtr >= _inputEnd && !_loadMore())
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field int _inputPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #68  <Field int _inputEnd>
	//*   4    8:icmplt          24
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #164 <Method boolean _loadMore()>
	//*   7   15:ifne            24
			_reportInvalidEOF(s, jsontoken);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #300 <Method void _reportInvalidEOF(String, JsonToken)>
		s = ((String) (_inputBuffer));
	//   12   24:aload_0         
	//   13   25:getfield        #62  <Field char[] _inputBuffer>
	//   14   28:astore_1        
		int i = _inputPtr;
	//   15   29:aload_0         
	//   16   30:getfield        #65  <Field int _inputPtr>
	//   17   33:istore_3        
		_inputPtr = i + 1;
	//   18   34:aload_0         
	//   19   35:iload_3         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:putfield        #65  <Field int _inputPtr>
		return s[i];
	//   23   41:aload_1         
	//   24   42:iload_3         
	//   25   43:caload          
	//   26   44:ireturn         
	}

	public final String getText()
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field JsonToken _currToken>
	//    2    4:astore_1        
		if(jsontoken == JsonToken.VALUE_STRING)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #240 <Field JsonToken JsonToken.VALUE_STRING>
	//*   5    9:if_acmpne       36
		{
			if(_tokenIncomplete)
	//*   6   12:aload_0         
	//*   7   13:getfield        #237 <Field boolean _tokenIncomplete>
	//*   8   16:ifeq            28
			{
				_tokenIncomplete = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #237 <Field boolean _tokenIncomplete>
				_finishString();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #737 <Method void _finishString()>
			}
			return _textBuffer.contentsAsString();
	//   14   28:aload_0         
	//   15   29:getfield        #149 <Field TextBuffer _textBuffer>
	//   16   32:invokevirtual   #550 <Method String TextBuffer.contentsAsString()>
	//   17   35:areturn         
		} else
		{
			return _getText2(jsontoken);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #739 <Method String _getText2(JsonToken)>
	//   21   41:areturn         
		}
	}

	public final char[] getTextCharacters()
		throws IOException
	{
		if(_currToken != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field JsonToken _currToken>
	//*   2    4:ifnull          155
		{
			switch(_currToken.id())
	//*   3    7:aload_0         
	//*   4    8:getfield        #137 <Field JsonToken _currToken>
	//*   5   11:invokevirtual   #544 <Method int JsonToken.id()>
			{
	//*   6   14:tableswitch     5 8: default 44
	//	               5 76
	//	               6 52
	//	               7 68
	//	               8 68
			default:
				return _currToken.asCharArray();
	//    7   44:aload_0         
	//    8   45:getfield        #137 <Field JsonToken _currToken>
	//    9   48:invokevirtual   #743 <Method char[] JsonToken.asCharArray()>
	//   10   51:areturn         

			case 6: // '\006'
				if(_tokenIncomplete)
	//*  11   52:aload_0         
	//*  12   53:getfield        #237 <Field boolean _tokenIncomplete>
	//*  13   56:ifeq            68
				{
					_tokenIncomplete = false;
	//   14   59:aload_0         
	//   15   60:iconst_0        
	//   16   61:putfield        #237 <Field boolean _tokenIncomplete>
					_finishString();
	//   17   64:aload_0         
	//   18   65:invokevirtual   #737 <Method void _finishString()>
				}
				// fall through

			case 7: // '\007'
			case 8: // '\b'
				return _textBuffer.getTextBuffer();
	//   19   68:aload_0         
	//   20   69:getfield        #149 <Field TextBuffer _textBuffer>
	//   21   72:invokevirtual   #170 <Method char[] TextBuffer.getTextBuffer()>
	//   22   75:areturn         

			case 5: // '\005'
				break;
			}
			if(!_nameCopied)
	//*  23   76:aload_0         
	//*  24   77:getfield        #211 <Field boolean _nameCopied>
	//*  25   80:ifne            150
			{
				String s = _parsingContext.getCurrentName();
	//   26   83:aload_0         
	//   27   84:getfield        #114 <Field JsonReadContext _parsingContext>
	//   28   87:invokevirtual   #553 <Method String JsonReadContext.getCurrentName()>
	//   29   90:astore_2        
				int i = s.length();
	//   30   91:aload_2         
	//   31   92:invokevirtual   #197 <Method int String.length()>
	//   32   95:istore_1        
				if(_nameCopyBuffer == null)
	//*  33   96:aload_0         
	//*  34   97:getfield        #746 <Field char[] _nameCopyBuffer>
	//*  35  100:ifnonnull       118
					_nameCopyBuffer = _ioContext.allocNameCopyBuffer(i);
	//   36  103:aload_0         
	//   37  104:aload_0         
	//   38  105:getfield        #453 <Field IOContext _ioContext>
	//   39  108:iload_1         
	//   40  109:invokevirtual   #750 <Method char[] IOContext.allocNameCopyBuffer(int)>
	//   41  112:putfield        #746 <Field char[] _nameCopyBuffer>
				else
	//*  42  115:goto            134
				if(_nameCopyBuffer.length < i)
	//*  43  118:aload_0         
	//*  44  119:getfield        #746 <Field char[] _nameCopyBuffer>
	//*  45  122:arraylength     
	//*  46  123:iload_1         
	//*  47  124:icmpge          134
					_nameCopyBuffer = new char[i];
	//   48  127:aload_0         
	//   49  128:iload_1         
	//   50  129:newarray        char[]
	//   51  131:putfield        #746 <Field char[] _nameCopyBuffer>
				s.getChars(0, i, _nameCopyBuffer, 0);
	//   52  134:aload_2         
	//   53  135:iconst_0        
	//   54  136:iload_1         
	//   55  137:aload_0         
	//   56  138:getfield        #746 <Field char[] _nameCopyBuffer>
	//   57  141:iconst_0        
	//   58  142:invokevirtual   #754 <Method void String.getChars(int, int, char[], int)>
				_nameCopied = true;
	//   59  145:aload_0         
	//   60  146:iconst_1        
	//   61  147:putfield        #211 <Field boolean _nameCopied>
			}
			return _nameCopyBuffer;
	//   62  150:aload_0         
	//   63  151:getfield        #746 <Field char[] _nameCopyBuffer>
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
	//*   1    1:getfield        #137 <Field JsonToken _currToken>
	//*   2    4:ifnull          88
			switch(_currToken.id())
	//*   3    7:aload_0         
	//*   4    8:getfield        #137 <Field JsonToken _currToken>
	//*   5   11:invokevirtual   #544 <Method int JsonToken.id()>
			{
	//*   6   14:tableswitch     5 8: default 44
	//	               5 77
	//	               6 53
	//	               7 69
	//	               8 69
			default:
				return _currToken.asCharArray().length;
	//    7   44:aload_0         
	//    8   45:getfield        #137 <Field JsonToken _currToken>
	//    9   48:invokevirtual   #743 <Method char[] JsonToken.asCharArray()>
	//   10   51:arraylength     
	//   11   52:ireturn         

			case 6: // '\006'
				if(_tokenIncomplete)
	//*  12   53:aload_0         
	//*  13   54:getfield        #237 <Field boolean _tokenIncomplete>
	//*  14   57:ifeq            69
				{
					_tokenIncomplete = false;
	//   15   60:aload_0         
	//   16   61:iconst_0        
	//   17   62:putfield        #237 <Field boolean _tokenIncomplete>
					_finishString();
	//   18   65:aload_0         
	//   19   66:invokevirtual   #737 <Method void _finishString()>
				}
				// fall through

			case 7: // '\007'
			case 8: // '\b'
				return _textBuffer.size();
	//   20   69:aload_0         
	//   21   70:getfield        #149 <Field TextBuffer _textBuffer>
	//   22   73:invokevirtual   #176 <Method int TextBuffer.size()>
	//   23   76:ireturn         

			case 5: // '\005'
				return _parsingContext.getCurrentName().length();
	//   24   77:aload_0         
	//   25   78:getfield        #114 <Field JsonReadContext _parsingContext>
	//   26   81:invokevirtual   #553 <Method String JsonReadContext.getCurrentName()>
	//   27   84:invokevirtual   #197 <Method int String.length()>
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
	//*   1    1:getfield        #137 <Field JsonToken _currToken>
	//*   2    4:ifnull          72
			switch(_currToken.id())
	//*   3    7:aload_0         
	//*   4    8:getfield        #137 <Field JsonToken _currToken>
	//*   5   11:invokevirtual   #544 <Method int JsonToken.id()>
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
	//*  10   47:getfield        #237 <Field boolean _tokenIncomplete>
	//*  11   50:ifeq            62
				{
					_tokenIncomplete = false;
	//   12   53:aload_0         
	//   13   54:iconst_0        
	//   14   55:putfield        #237 <Field boolean _tokenIncomplete>
					_finishString();
	//   15   58:aload_0         
	//   16   59:invokevirtual   #737 <Method void _finishString()>
				}
				// fall through

			case 7: // '\007'
			case 8: // '\b'
				return _textBuffer.getTextOffset();
	//   17   62:aload_0         
	//   18   63:getfield        #149 <Field TextBuffer _textBuffer>
	//   19   66:invokevirtual   #173 <Method int TextBuffer.getTextOffset()>
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
	//*   1    1:getfield        #137 <Field JsonToken _currToken>
	//*   2    4:getstatic       #296 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:if_acmpne       48
		{
			long l = _currInputProcessed;
	//    4   10:aload_0         
	//    5   11:getfield        #424 <Field long _currInputProcessed>
	//    6   14:lstore_1        
			long l1 = _nameStartOffset;
	//    7   15:aload_0         
	//    8   16:getfield        #430 <Field long _nameStartOffset>
	//    9   19:lstore_3        
			return new JsonLocation(_getSourceReference(), -1L, l + (l1 - 1L), _nameStartRow, _nameStartCol);
	//   10   20:new             #728 <Class JsonLocation>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokevirtual   #726 <Method Object _getSourceReference()>
	//   14   28:ldc2w           #729 <Long -1L>
	//   15   31:lload_1         
	//   16   32:lload_3         
	//   17   33:lconst_1        
	//   18   34:lsub            
	//   19   35:ladd            
	//   20   36:aload_0         
	//   21   37:getfield        #432 <Field int _nameStartRow>
	//   22   40:aload_0         
	//   23   41:getfield        #434 <Field int _nameStartCol>
	//   24   44:invokespecial   #733 <Method void JsonLocation(Object, long, long, int, int)>
	//   25   47:areturn         
		} else
		{
			return new JsonLocation(_getSourceReference(), -1L, _tokenInputTotal - 1L, _tokenInputRow, _tokenInputCol);
	//   26   48:new             #728 <Class JsonLocation>
	//   27   51:dup             
	//   28   52:aload_0         
	//   29   53:invokevirtual   #726 <Method Object _getSourceReference()>
	//   30   56:ldc2w           #729 <Long -1L>
	//   31   59:aload_0         
	//   32   60:getfield        #427 <Field long _tokenInputTotal>
	//   33   63:lconst_1        
	//   34   64:lsub            
	//   35   65:aload_0         
	//   36   66:getfield        #220 <Field int _tokenInputRow>
	//   37   69:aload_0         
	//   38   70:getfield        #223 <Field int _tokenInputCol>
	//   39   73:invokespecial   #733 <Method void JsonLocation(Object, long, long, int, int)>
	//   40   76:areturn         
		}
	}

	public final String getValueAsString()
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field JsonToken _currToken>
	//*   2    4:getstatic       #240 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       34
		{
			if(_tokenIncomplete)
	//*   4   10:aload_0         
	//*   5   11:getfield        #237 <Field boolean _tokenIncomplete>
	//*   6   14:ifeq            26
			{
				_tokenIncomplete = false;
	//    7   17:aload_0         
	//    8   18:iconst_0        
	//    9   19:putfield        #237 <Field boolean _tokenIncomplete>
				_finishString();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #737 <Method void _finishString()>
			}
			return _textBuffer.contentsAsString();
	//   12   26:aload_0         
	//   13   27:getfield        #149 <Field TextBuffer _textBuffer>
	//   14   30:invokevirtual   #550 <Method String TextBuffer.contentsAsString()>
	//   15   33:areturn         
		}
		if(_currToken == JsonToken.FIELD_NAME)
	//*  16   34:aload_0         
	//*  17   35:getfield        #137 <Field JsonToken _currToken>
	//*  18   38:getstatic       #296 <Field JsonToken JsonToken.FIELD_NAME>
	//*  19   41:if_acmpne       49
			return getCurrentName();
	//   20   44:aload_0         
	//   21   45:invokevirtual   #758 <Method String getCurrentName()>
	//   22   48:areturn         
		else
			return super.getValueAsString(((String) (null)));
	//   23   49:aload_0         
	//   24   50:aconst_null     
	//   25   51:invokespecial   #761 <Method String ParserBase.getValueAsString(String)>
	//   26   54:areturn         
	}

	public final String getValueAsString(String s)
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field JsonToken _currToken>
	//*   2    4:getstatic       #240 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       34
		{
			if(_tokenIncomplete)
	//*   4   10:aload_0         
	//*   5   11:getfield        #237 <Field boolean _tokenIncomplete>
	//*   6   14:ifeq            26
			{
				_tokenIncomplete = false;
	//    7   17:aload_0         
	//    8   18:iconst_0        
	//    9   19:putfield        #237 <Field boolean _tokenIncomplete>
				_finishString();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #737 <Method void _finishString()>
			}
			return _textBuffer.contentsAsString();
	//   12   26:aload_0         
	//   13   27:getfield        #149 <Field TextBuffer _textBuffer>
	//   14   30:invokevirtual   #550 <Method String TextBuffer.contentsAsString()>
	//   15   33:areturn         
		}
		if(_currToken == JsonToken.FIELD_NAME)
	//*  16   34:aload_0         
	//*  17   35:getfield        #137 <Field JsonToken _currToken>
	//*  18   38:getstatic       #296 <Field JsonToken JsonToken.FIELD_NAME>
	//*  19   41:if_acmpne       49
			return getCurrentName();
	//   20   44:aload_0         
	//   21   45:invokevirtual   #758 <Method String getCurrentName()>
	//   22   48:areturn         
		else
			return super.getValueAsString(s);
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:invokespecial   #761 <Method String ParserBase.getValueAsString(String)>
	//   26   54:areturn         
	}

	public String nextFieldName()
		throws IOException
	{
		int j;
label0:
		{
			int i;
label1:
			{
				_numTypesValid = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #765 <Field int _numTypesValid>
				if(_currToken == JsonToken.FIELD_NAME)
	//*   3    5:aload_0         
	//*   4    6:getfield        #137 <Field JsonToken _currToken>
	//*   5    9:getstatic       #296 <Field JsonToken JsonToken.FIELD_NAME>
	//*   6   12:if_acmpne       22
				{
					_nextAfterName();
	//    7   15:aload_0         
	//    8   16:invokespecial   #767 <Method JsonToken _nextAfterName()>
	//    9   19:pop             
					return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
				}
				if(_tokenIncomplete)
	//*  12   22:aload_0         
	//*  13   23:getfield        #237 <Field boolean _tokenIncomplete>
	//*  14   26:ifeq            33
					_skipString();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #769 <Method void _skipString()>
				j = _skipWSOrEnd();
	//   17   33:aload_0         
	//   18   34:invokespecial   #771 <Method int _skipWSOrEnd()>
	//   19   37:istore_2        
				if(j < 0)
	//*  20   38:iload_2         
	//*  21   39:ifge            53
				{
					close();
	//   22   42:aload_0         
	//   23   43:invokevirtual   #772 <Method void close()>
					_currToken = null;
	//   24   46:aload_0         
	//   25   47:aconst_null     
	//   26   48:putfield        #137 <Field JsonToken _currToken>
					return null;
	//   27   51:aconst_null     
	//   28   52:areturn         
				}
				_binaryValue = null;
	//   29   53:aload_0         
	//   30   54:aconst_null     
	//   31   55:putfield        #696 <Field byte[] _binaryValue>
				if(j == 93 || j == 125)
	//*  32   58:iload_2         
	//*  33   59:bipush          93
	//*  34   61:icmpeq          390
	//*  35   64:iload_2         
	//*  36   65:bipush          125
	//*  37   67:icmpne          73
					break label0;
	//   38   70:goto            390
				i = j;
	//   39   73:iload_2         
	//   40   74:istore_1        
				if(!_parsingContext.expectComma())
					break label1;
	//   41   75:aload_0         
	//   42   76:getfield        #114 <Field JsonReadContext _parsingContext>
	//   43   79:invokevirtual   #775 <Method boolean JsonReadContext.expectComma()>
	//   44   82:ifeq            125
				j = _skipComma(j);
	//   45   85:aload_0         
	//   46   86:iload_2         
	//   47   87:invokespecial   #777 <Method int _skipComma(int)>
	//   48   90:istore_2        
				i = j;
	//   49   91:iload_2         
	//   50   92:istore_1        
				if((_features & FEAT_MASK_TRAILING_COMMA) == 0)
					break label1;
	//   51   93:aload_0         
	//   52   94:getfield        #780 <Field int _features>
	//   53   97:getstatic       #38  <Field int FEAT_MASK_TRAILING_COMMA>
	//   54  100:iand            
	//   55  101:ifeq            125
				if(j != 93)
	//*  56  104:iload_2         
	//*  57  105:bipush          93
	//*  58  107:icmpeq          118
				{
					i = j;
	//   59  110:iload_2         
	//   60  111:istore_1        
					if(j != 125)
						break label1;
	//   61  112:iload_2         
	//   62  113:bipush          125
	//   63  115:icmpne          125
				}
				_closeScope(j);
	//   64  118:aload_0         
	//   65  119:iload_2         
	//   66  120:invokespecial   #782 <Method void _closeScope(int)>
				return null;
	//   67  123:aconst_null     
	//   68  124:areturn         
			}
			if(!_parsingContext.inObject())
	//*  69  125:aload_0         
	//*  70  126:getfield        #114 <Field JsonReadContext _parsingContext>
	//*  71  129:invokevirtual   #140 <Method boolean JsonReadContext.inObject()>
	//*  72  132:ifne            147
			{
				_updateLocation();
	//   73  135:aload_0         
	//   74  136:invokespecial   #110 <Method void _updateLocation()>
				_nextTokenNotInObject(i);
	//   75  139:aload_0         
	//   76  140:iload_1         
	//   77  141:invokespecial   #784 <Method JsonToken _nextTokenNotInObject(int)>
	//   78  144:pop             
				return null;
	//   79  145:aconst_null     
	//   80  146:areturn         
			}
			_updateNameLocation();
	//   81  147:aload_0         
	//   82  148:invokespecial   #786 <Method void _updateNameLocation()>
			String s;
			if(i == 34)
	//*  83  151:iload_1         
	//*  84  152:bipush          34
	//*  85  154:icmpne          166
				s = _parseName();
	//   86  157:aload_0         
	//   87  158:invokevirtual   #788 <Method String _parseName()>
	//   88  161:astore          4
			else
	//*  89  163:goto            173
				s = _handleOddName(i);
	//   90  166:aload_0         
	//   91  167:iload_1         
	//   92  168:invokevirtual   #790 <Method String _handleOddName(int)>
	//   93  171:astore          4
			_parsingContext.setCurrentName(s);
	//   94  173:aload_0         
	//   95  174:getfield        #114 <Field JsonReadContext _parsingContext>
	//   96  177:aload           4
	//   97  179:invokevirtual   #793 <Method void JsonReadContext.setCurrentName(String)>
			_currToken = JsonToken.FIELD_NAME;
	//   98  182:aload_0         
	//   99  183:getstatic       #296 <Field JsonToken JsonToken.FIELD_NAME>
	//  100  186:putfield        #137 <Field JsonToken _currToken>
			i = _skipColon();
	//  101  189:aload_0         
	//  102  190:invokespecial   #795 <Method int _skipColon()>
	//  103  193:istore_1        
			_updateLocation();
	//  104  194:aload_0         
	//  105  195:invokespecial   #110 <Method void _updateLocation()>
			if(i == 34)
	//* 106  198:iload_1         
	//* 107  199:bipush          34
	//* 108  201:icmpne          219
			{
				_tokenIncomplete = true;
	//  109  204:aload_0         
	//  110  205:iconst_1        
	//  111  206:putfield        #237 <Field boolean _tokenIncomplete>
				_nextToken = JsonToken.VALUE_STRING;
	//  112  209:aload_0         
	//  113  210:getstatic       #240 <Field JsonToken JsonToken.VALUE_STRING>
	//  114  213:putfield        #214 <Field JsonToken _nextToken>
				return s;
	//  115  216:aload           4
	//  116  218:areturn         
			}
			JsonToken jsontoken;
			if(i != 45)
	//* 117  219:iload_1         
	//* 118  220:bipush          45
	//* 119  222:icmpeq          377
			{
				if(i != 91)
	//* 120  225:iload_1         
	//* 121  226:bipush          91
	//* 122  228:icmpeq          370
				{
					if(i != 102)
	//* 123  231:iload_1         
	//* 124  232:bipush          102
	//* 125  234:icmpeq          359
					{
						if(i != 110)
	//* 126  237:iload_1         
	//* 127  238:bipush          110
	//* 128  240:icmpeq          348
						{
							if(i != 116)
	//* 129  243:iload_1         
	//* 130  244:bipush          116
	//* 131  246:icmpeq          337
							{
								if(i != 123)
	//* 132  249:iload_1         
	//* 133  250:bipush          123
	//* 134  252:icmpeq          330
									switch(i)
	//* 135  255:iload_1         
									{
	//* 136  256:tableswitch     48 57: default 312
	//	               48 321
	//	               49 321
	//	               50 321
	//	               51 321
	//	               52 321
	//	               53 321
	//	               54 321
	//	               55 321
	//	               56 321
	//	               57 321
									default:
										jsontoken = _handleOddValue(i);
	//  137  312:aload_0         
	//  138  313:iload_1         
	//  139  314:invokevirtual   #265 <Method JsonToken _handleOddValue(int)>
	//  140  317:astore_3        
										break;

	//* 141  318:goto            382
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
	//  142  321:aload_0         
	//  143  322:iload_1         
	//  144  323:invokevirtual   #243 <Method JsonToken _parsePosNumber(int)>
	//  145  326:astore_3        
										break;
									}
								else
	//* 146  327:goto            382
									jsontoken = JsonToken.START_OBJECT;
	//  147  330:getstatic       #230 <Field JsonToken JsonToken.START_OBJECT>
	//  148  333:astore_3        
							} else
	//* 149  334:goto            382
							{
								_matchTrue();
	//  150  337:aload_0         
	//  151  338:invokespecial   #797 <Method void _matchTrue()>
								jsontoken = JsonToken.VALUE_TRUE;
	//  152  341:getstatic       #249 <Field JsonToken JsonToken.VALUE_TRUE>
	//  153  344:astore_3        
							}
						} else
	//* 154  345:goto            382
						{
							_matchNull();
	//  155  348:aload_0         
	//  156  349:invokespecial   #799 <Method void _matchNull()>
							jsontoken = JsonToken.VALUE_NULL;
	//  157  352:getstatic       #252 <Field JsonToken JsonToken.VALUE_NULL>
	//  158  355:astore_3        
						}
					} else
	//* 159  356:goto            382
					{
						_matchFalse();
	//  160  359:aload_0         
	//  161  360:invokespecial   #801 <Method void _matchFalse()>
						jsontoken = JsonToken.VALUE_FALSE;
	//  162  363:getstatic       #255 <Field JsonToken JsonToken.VALUE_FALSE>
	//  163  366:astore_3        
					}
				} else
	//* 164  367:goto            382
				{
					jsontoken = JsonToken.START_ARRAY;
	//  165  370:getstatic       #217 <Field JsonToken JsonToken.START_ARRAY>
	//  166  373:astore_3        
				}
			} else
	//* 167  374:goto            382
			{
				jsontoken = _parseNegNumber();
	//  168  377:aload_0         
	//  169  378:invokevirtual   #246 <Method JsonToken _parseNegNumber()>
	//  170  381:astore_3        
			}
			_nextToken = jsontoken;
	//  171  382:aload_0         
	//  172  383:aload_3         
	//  173  384:putfield        #214 <Field JsonToken _nextToken>
			return s;
	//  174  387:aload           4
	//  175  389:areturn         
		}
		_closeScope(j);
	//  176  390:aload_0         
	//  177  391:iload_2         
	//  178  392:invokespecial   #782 <Method void _closeScope(int)>
		return null;
	//  179  395:aconst_null     
	//  180  396:areturn         
	}

	public final String nextTextValue()
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field JsonToken _currToken>
	//    2    4:astore_2        
		JsonToken jsontoken1 = JsonToken.FIELD_NAME;
	//    3    5:getstatic       #296 <Field JsonToken JsonToken.FIELD_NAME>
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
	//   12   18:putfield        #211 <Field boolean _nameCopied>
			obj = ((Object) (_nextToken));
	//   13   21:aload_0         
	//   14   22:getfield        #214 <Field JsonToken _nextToken>
	//   15   25:astore_1        
			_nextToken = null;
	//   16   26:aload_0         
	//   17   27:aconst_null     
	//   18   28:putfield        #214 <Field JsonToken _nextToken>
			_currToken = ((JsonToken) (obj));
	//   19   31:aload_0         
	//   20   32:aload_1         
	//   21   33:putfield        #137 <Field JsonToken _currToken>
			if(obj == JsonToken.VALUE_STRING)
	//*  22   36:aload_1         
	//*  23   37:getstatic       #240 <Field JsonToken JsonToken.VALUE_STRING>
	//*  24   40:if_acmpne       67
			{
				if(_tokenIncomplete)
	//*  25   43:aload_0         
	//*  26   44:getfield        #237 <Field boolean _tokenIncomplete>
	//*  27   47:ifeq            59
				{
					_tokenIncomplete = false;
	//   28   50:aload_0         
	//   29   51:iconst_0        
	//   30   52:putfield        #237 <Field boolean _tokenIncomplete>
					_finishString();
	//   31   55:aload_0         
	//   32   56:invokevirtual   #737 <Method void _finishString()>
				}
				return _textBuffer.contentsAsString();
	//   33   59:aload_0         
	//   34   60:getfield        #149 <Field TextBuffer _textBuffer>
	//   35   63:invokevirtual   #550 <Method String TextBuffer.contentsAsString()>
	//   36   66:areturn         
			}
			if(obj == JsonToken.START_ARRAY)
	//*  37   67:aload_1         
	//*  38   68:getstatic       #217 <Field JsonToken JsonToken.START_ARRAY>
	//*  39   71:if_acmpne       95
			{
				_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//   40   74:aload_0         
	//   41   75:aload_0         
	//   42   76:getfield        #114 <Field JsonReadContext _parsingContext>
	//   43   79:aload_0         
	//   44   80:getfield        #220 <Field int _tokenInputRow>
	//   45   83:aload_0         
	//   46   84:getfield        #223 <Field int _tokenInputCol>
	//   47   87:invokevirtual   #227 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   48   90:putfield        #114 <Field JsonReadContext _parsingContext>
				return null;
	//   49   93:aconst_null     
	//   50   94:areturn         
			}
			if(obj == JsonToken.START_OBJECT)
	//*  51   95:aload_1         
	//*  52   96:getstatic       #230 <Field JsonToken JsonToken.START_OBJECT>
	//*  53   99:if_acmpne       121
				_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//   54  102:aload_0         
	//   55  103:aload_0         
	//   56  104:getfield        #114 <Field JsonReadContext _parsingContext>
	//   57  107:aload_0         
	//   58  108:getfield        #220 <Field int _tokenInputRow>
	//   59  111:aload_0         
	//   60  112:getfield        #223 <Field int _tokenInputCol>
	//   61  115:invokevirtual   #233 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   62  118:putfield        #114 <Field JsonReadContext _parsingContext>
			return null;
	//   63  121:aconst_null     
	//   64  122:areturn         
		}
		if(nextToken() == JsonToken.VALUE_STRING)
	//*  65  123:aload_0         
	//*  66  124:invokevirtual   #805 <Method JsonToken nextToken()>
	//*  67  127:getstatic       #240 <Field JsonToken JsonToken.VALUE_STRING>
	//*  68  130:if_acmpne       138
			obj = ((Object) (getText()));
	//   69  133:aload_0         
	//   70  134:invokevirtual   #715 <Method String getText()>
	//   71  137:astore_1        
		return ((String) (obj));
	//   72  138:aload_1         
	//   73  139:areturn         
	}

	public final JsonToken nextToken()
		throws IOException
	{
		int j;
label0:
		{
			int i;
label1:
			{
				if(_currToken == JsonToken.FIELD_NAME)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field JsonToken _currToken>
	//*   2    4:getstatic       #296 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:if_acmpne       15
					return _nextAfterName();
	//    4   10:aload_0         
	//    5   11:invokespecial   #767 <Method JsonToken _nextAfterName()>
	//    6   14:areturn         
				_numTypesValid = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #765 <Field int _numTypesValid>
				if(_tokenIncomplete)
	//*  10   20:aload_0         
	//*  11   21:getfield        #237 <Field boolean _tokenIncomplete>
	//*  12   24:ifeq            31
					_skipString();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #769 <Method void _skipString()>
				j = _skipWSOrEnd();
	//   15   31:aload_0         
	//   16   32:invokespecial   #771 <Method int _skipWSOrEnd()>
	//   17   35:istore_2        
				if(j < 0)
	//*  18   36:iload_2         
	//*  19   37:ifge            51
				{
					close();
	//   20   40:aload_0         
	//   21   41:invokevirtual   #772 <Method void close()>
					_currToken = null;
	//   22   44:aload_0         
	//   23   45:aconst_null     
	//   24   46:putfield        #137 <Field JsonToken _currToken>
					return null;
	//   25   49:aconst_null     
	//   26   50:areturn         
				}
				_binaryValue = null;
	//   27   51:aload_0         
	//   28   52:aconst_null     
	//   29   53:putfield        #696 <Field byte[] _binaryValue>
				if(j == 93 || j == 125)
	//*  30   56:iload_2         
	//*  31   57:bipush          93
	//*  32   59:icmpeq          468
	//*  33   62:iload_2         
	//*  34   63:bipush          125
	//*  35   65:icmpne          71
					break label0;
	//   36   68:goto            468
				i = j;
	//   37   71:iload_2         
	//   38   72:istore_1        
				if(!_parsingContext.expectComma())
					break label1;
	//   39   73:aload_0         
	//   40   74:getfield        #114 <Field JsonReadContext _parsingContext>
	//   41   77:invokevirtual   #775 <Method boolean JsonReadContext.expectComma()>
	//   42   80:ifeq            126
				j = _skipComma(j);
	//   43   83:aload_0         
	//   44   84:iload_2         
	//   45   85:invokespecial   #777 <Method int _skipComma(int)>
	//   46   88:istore_2        
				i = j;
	//   47   89:iload_2         
	//   48   90:istore_1        
				if((_features & FEAT_MASK_TRAILING_COMMA) == 0)
					break label1;
	//   49   91:aload_0         
	//   50   92:getfield        #780 <Field int _features>
	//   51   95:getstatic       #38  <Field int FEAT_MASK_TRAILING_COMMA>
	//   52   98:iand            
	//   53   99:ifeq            126
				if(j != 93)
	//*  54  102:iload_2         
	//*  55  103:bipush          93
	//*  56  105:icmpeq          116
				{
					i = j;
	//   57  108:iload_2         
	//   58  109:istore_1        
					if(j != 125)
						break label1;
	//   59  110:iload_2         
	//   60  111:bipush          125
	//   61  113:icmpne          126
				}
				_closeScope(j);
	//   62  116:aload_0         
	//   63  117:iload_2         
	//   64  118:invokespecial   #782 <Method void _closeScope(int)>
				return _currToken;
	//   65  121:aload_0         
	//   66  122:getfield        #137 <Field JsonToken _currToken>
	//   67  125:areturn         
			}
			boolean flag;
			JsonToken jsontoken;
label2:
			{
				flag = _parsingContext.inObject();
	//   68  126:aload_0         
	//   69  127:getfield        #114 <Field JsonReadContext _parsingContext>
	//   70  130:invokevirtual   #140 <Method boolean JsonReadContext.inObject()>
	//   71  133:istore_3        
				j = i;
	//   72  134:iload_1         
	//   73  135:istore_2        
				if(flag)
	//*  74  136:iload_3         
	//*  75  137:ifeq            187
				{
					_updateNameLocation();
	//   76  140:aload_0         
	//   77  141:invokespecial   #786 <Method void _updateNameLocation()>
					String s;
					if(i == 34)
	//*  78  144:iload_1         
	//*  79  145:bipush          34
	//*  80  147:icmpne          159
						s = _parseName();
	//   81  150:aload_0         
	//   82  151:invokevirtual   #788 <Method String _parseName()>
	//   83  154:astore          4
					else
	//*  84  156:goto            166
						s = _handleOddName(i);
	//   85  159:aload_0         
	//   86  160:iload_1         
	//   87  161:invokevirtual   #790 <Method String _handleOddName(int)>
	//   88  164:astore          4
					_parsingContext.setCurrentName(s);
	//   89  166:aload_0         
	//   90  167:getfield        #114 <Field JsonReadContext _parsingContext>
	//   91  170:aload           4
	//   92  172:invokevirtual   #793 <Method void JsonReadContext.setCurrentName(String)>
					_currToken = JsonToken.FIELD_NAME;
	//   93  175:aload_0         
	//   94  176:getstatic       #296 <Field JsonToken JsonToken.FIELD_NAME>
	//   95  179:putfield        #137 <Field JsonToken _currToken>
					j = _skipColon();
	//   96  182:aload_0         
	//   97  183:invokespecial   #795 <Method int _skipColon()>
	//   98  186:istore_2        
				}
				_updateLocation();
	//   99  187:aload_0         
	//  100  188:invokespecial   #110 <Method void _updateLocation()>
				if(j != 34)
	//* 101  191:iload_2         
	//* 102  192:bipush          34
	//* 103  194:icmpeq          434
				{
					if(j != 45)
	//* 104  197:iload_2         
	//* 105  198:bipush          45
	//* 106  200:icmpeq          425
					{
						if(j != 91)
	//* 107  203:iload_2         
	//* 108  204:bipush          91
	//* 109  206:icmpeq          394
						{
							if(j != 102)
	//* 110  209:iload_2         
	//* 111  210:bipush          102
	//* 112  212:icmpeq          382
							{
								if(j != 110)
	//* 113  215:iload_2         
	//* 114  216:bipush          110
	//* 115  218:icmpeq          370
								{
									if(j != 116)
	//* 116  221:iload_2         
	//* 117  222:bipush          116
	//* 118  224:icmpeq          358
										if(j != 123)
	//* 119  227:iload_2         
	//* 120  228:bipush          123
	//* 121  230:icmpeq          327
										{
											if(j != 125)
	//* 122  233:iload_2         
	//* 123  234:bipush          125
	//* 124  236:icmpeq          316
											{
												switch(j)
	//* 125  239:iload_2         
												{
	//* 126  240:tableswitch     48 57: default 296
	//	               48 306
	//	               49 306
	//	               50 306
	//	               51 306
	//	               52 306
	//	               53 306
	//	               54 306
	//	               55 306
	//	               56 306
	//	               57 306
												default:
													jsontoken = _handleOddValue(j);
	//  127  296:aload_0         
	//  128  297:iload_2         
	//  129  298:invokevirtual   #265 <Method JsonToken _handleOddValue(int)>
	//  130  301:astore          4
													break;

	//* 131  303:goto            444
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
													jsontoken = _parsePosNumber(j);
	//  132  306:aload_0         
	//  133  307:iload_2         
	//  134  308:invokevirtual   #243 <Method JsonToken _parsePosNumber(int)>
	//  135  311:astore          4
													break;
												}
												break label2;
	//  136  313:goto            444
											}
											_reportUnexpectedChar(j, "expected a value");
	//  137  316:aload_0         
	//  138  317:iload_2         
	//  139  318:ldc2            #807 <String "expected a value">
	//  140  321:invokevirtual   #393 <Method void _reportUnexpectedChar(int, String)>
										} else
	//* 141  324:goto            358
										{
											if(!flag)
	//* 142  327:iload_3         
	//* 143  328:ifne            350
												_parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
	//  144  331:aload_0         
	//  145  332:aload_0         
	//  146  333:getfield        #114 <Field JsonReadContext _parsingContext>
	//  147  336:aload_0         
	//  148  337:getfield        #220 <Field int _tokenInputRow>
	//  149  340:aload_0         
	//  150  341:getfield        #223 <Field int _tokenInputCol>
	//  151  344:invokevirtual   #233 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//  152  347:putfield        #114 <Field JsonReadContext _parsingContext>
											jsontoken = JsonToken.START_OBJECT;
	//  153  350:getstatic       #230 <Field JsonToken JsonToken.START_OBJECT>
	//  154  353:astore          4
											break label2;
	//  155  355:goto            444
										}
									_matchTrue();
	//  156  358:aload_0         
	//  157  359:invokespecial   #797 <Method void _matchTrue()>
									jsontoken = JsonToken.VALUE_TRUE;
	//  158  362:getstatic       #249 <Field JsonToken JsonToken.VALUE_TRUE>
	//  159  365:astore          4
								} else
	//* 160  367:goto            444
								{
									_matchNull();
	//  161  370:aload_0         
	//  162  371:invokespecial   #799 <Method void _matchNull()>
									jsontoken = JsonToken.VALUE_NULL;
	//  163  374:getstatic       #252 <Field JsonToken JsonToken.VALUE_NULL>
	//  164  377:astore          4
								}
							} else
	//* 165  379:goto            444
							{
								_matchFalse();
	//  166  382:aload_0         
	//  167  383:invokespecial   #801 <Method void _matchFalse()>
								jsontoken = JsonToken.VALUE_FALSE;
	//  168  386:getstatic       #255 <Field JsonToken JsonToken.VALUE_FALSE>
	//  169  389:astore          4
							}
						} else
	//* 170  391:goto            444
						{
							if(!flag)
	//* 171  394:iload_3         
	//* 172  395:ifne            417
								_parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
	//  173  398:aload_0         
	//  174  399:aload_0         
	//  175  400:getfield        #114 <Field JsonReadContext _parsingContext>
	//  176  403:aload_0         
	//  177  404:getfield        #220 <Field int _tokenInputRow>
	//  178  407:aload_0         
	//  179  408:getfield        #223 <Field int _tokenInputCol>
	//  180  411:invokevirtual   #227 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//  181  414:putfield        #114 <Field JsonReadContext _parsingContext>
							jsontoken = JsonToken.START_ARRAY;
	//  182  417:getstatic       #217 <Field JsonToken JsonToken.START_ARRAY>
	//  183  420:astore          4
						}
					} else
	//* 184  422:goto            444
					{
						jsontoken = _parseNegNumber();
	//  185  425:aload_0         
	//  186  426:invokevirtual   #246 <Method JsonToken _parseNegNumber()>
	//  187  429:astore          4
					}
				} else
	//* 188  431:goto            444
				{
					_tokenIncomplete = true;
	//  189  434:aload_0         
	//  190  435:iconst_1        
	//  191  436:putfield        #237 <Field boolean _tokenIncomplete>
					jsontoken = JsonToken.VALUE_STRING;
	//  192  439:getstatic       #240 <Field JsonToken JsonToken.VALUE_STRING>
	//  193  442:astore          4
				}
			}
			if(flag)
	//* 194  444:iload_3         
	//* 195  445:ifeq            459
			{
				_nextToken = jsontoken;
	//  196  448:aload_0         
	//  197  449:aload           4
	//  198  451:putfield        #214 <Field JsonToken _nextToken>
				return _currToken;
	//  199  454:aload_0         
	//  200  455:getfield        #137 <Field JsonToken _currToken>
	//  201  458:areturn         
			} else
			{
				_currToken = jsontoken;
	//  202  459:aload_0         
	//  203  460:aload           4
	//  204  462:putfield        #137 <Field JsonToken _currToken>
				return jsontoken;
	//  205  465:aload           4
	//  206  467:areturn         
			}
		}
		_closeScope(j);
	//  207  468:aload_0         
	//  208  469:iload_2         
	//  209  470:invokespecial   #782 <Method void _closeScope(int)>
		return _currToken;
	//  210  473:aload_0         
	//  211  474:getfield        #137 <Field JsonToken _currToken>
	//  212  477:areturn         
	}

	public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
		throws IOException
	{
		byte abyte0[];
		if(!_tokenIncomplete || _currToken != JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #237 <Field boolean _tokenIncomplete>
	//*   2    4:ifeq            61
	//*   3    7:aload_0         
	//*   4    8:getfield        #137 <Field JsonToken _currToken>
	//*   5   11:getstatic       #240 <Field JsonToken JsonToken.VALUE_STRING>
	//*   6   14:if_acmpeq       20
			break MISSING_BLOCK_LABEL_61;
	//    7   17:goto            61
		abyte0 = _ioContext.allocBase64Buffer();
	//    8   20:aload_0         
	//    9   21:getfield        #453 <Field IOContext _ioContext>
	//   10   24:invokevirtual   #812 <Method byte[] IOContext.allocBase64Buffer()>
	//   11   27:astore          4
		int i = _readBinary(base64variant, outputstream, abyte0);
	//   12   29:aload_0         
	//   13   30:aload_1         
	//   14   31:aload_2         
	//   15   32:aload           4
	//   16   34:invokevirtual   #814 <Method int _readBinary(Base64Variant, OutputStream, byte[])>
	//   17   37:istore_3        
		_ioContext.releaseBase64Buffer(abyte0);
	//   18   38:aload_0         
	//   19   39:getfield        #453 <Field IOContext _ioContext>
	//   20   42:aload           4
	//   21   44:invokevirtual   #818 <Method void IOContext.releaseBase64Buffer(byte[])>
		return i;
	//   22   47:iload_3         
	//   23   48:ireturn         
		base64variant;
	//   24   49:astore_1        
		_ioContext.releaseBase64Buffer(abyte0);
	//   25   50:aload_0         
	//   26   51:getfield        #453 <Field IOContext _ioContext>
	//   27   54:aload           4
	//   28   56:invokevirtual   #818 <Method void IOContext.releaseBase64Buffer(byte[])>
		throw base64variant;
	//   29   59:aload_1         
	//   30   60:athrow          
		base64variant = ((Base64Variant) (getBinaryValue(base64variant)));
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:invokevirtual   #820 <Method byte[] getBinaryValue(Base64Variant)>
	//   34   66:astore_1        
		outputstream.write(((byte []) (base64variant)));
	//   35   67:aload_2         
	//   36   68:aload_1         
	//   37   69:invokevirtual   #822 <Method void OutputStream.write(byte[])>
		return base64variant.length;
	//   38   72:aload_1         
	//   39   73:arraylength     
	//   40   74:ireturn         
	}

	protected static final int FEAT_MASK_TRAILING_COMMA;
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
		FEAT_MASK_TRAILING_COMMA = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
	//    0    0:getstatic       #32  <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_TRAILING_COMMA>
	//    1    3:invokevirtual   #36  <Method int com.fasterxml.jackson.core.JsonParser$Feature.getMask()>
	//    2    6:putstatic       #38  <Field int FEAT_MASK_TRAILING_COMMA>
	//    3    9:invokestatic    #44  <Method int[] CharTypes.getInputCodeLatin1()>
	//    4   12:putstatic       #46  <Field int[] _icLatin1>
	//*   5   15:return          
	}
}
