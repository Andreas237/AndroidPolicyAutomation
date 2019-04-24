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

public final class WriterBasedJsonGenerator extends JsonGeneratorImpl
{

	public WriterBasedJsonGenerator(IOContext iocontext, int i, ObjectCodec objectcodec, Writer writer)
	{
		super(iocontext, i, objectcodec);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #34  <Method void JsonGeneratorImpl(IOContext, int, ObjectCodec)>
		_writer = writer;
	//    5    7:aload_0         
	//    6    8:aload           4
	//    7   10:putfield        #36  <Field Writer _writer>
		_outputBuffer = iocontext.allocConcatBuffer();
	//    8   13:aload_0         
	//    9   14:aload_1         
	//   10   15:invokevirtual   #41  <Method char[] IOContext.allocConcatBuffer()>
	//   11   18:putfield        #43  <Field char[] _outputBuffer>
		_outputEnd = _outputBuffer.length;
	//   12   21:aload_0         
	//   13   22:aload_0         
	//   14   23:getfield        #43  <Field char[] _outputBuffer>
	//   15   26:arraylength     
	//   16   27:putfield        #45  <Field int _outputEnd>
	//   17   30:return          
	}

	private char[] _allocateEntityBuffer()
	{
		char ac[] = new char[14];
	//    0    0:bipush          14
	//    1    2:newarray        char[]
	//    2    4:astore_1        
		ac[0] = '\\';
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:bipush          92
	//    6    9:castore         
		ac[2] = '\\';
	//    7   10:aload_1         
	//    8   11:iconst_2        
	//    9   12:bipush          92
	//   10   14:castore         
		ac[3] = 'u';
	//   11   15:aload_1         
	//   12   16:iconst_3        
	//   13   17:bipush          117
	//   14   19:castore         
		ac[4] = '0';
	//   15   20:aload_1         
	//   16   21:iconst_4        
	//   17   22:bipush          48
	//   18   24:castore         
		ac[5] = '0';
	//   19   25:aload_1         
	//   20   26:iconst_5        
	//   21   27:bipush          48
	//   22   29:castore         
		ac[8] = '\\';
	//   23   30:aload_1         
	//   24   31:bipush          8
	//   25   33:bipush          92
	//   26   35:castore         
		ac[9] = 'u';
	//   27   36:aload_1         
	//   28   37:bipush          9
	//   29   39:bipush          117
	//   30   41:castore         
		_entityBuffer = ac;
	//   31   42:aload_0         
	//   32   43:aload_1         
	//   33   44:putfield        #48  <Field char[] _entityBuffer>
		return ac;
	//   34   47:aload_1         
	//   35   48:areturn         
	}

	private void _appendCharacterEscape(char c, int i)
		throws IOException, JsonGenerationException
	{
		if(i >= 0)
	//*   0    0:iload_2         
	//*   1    1:iflt            70
		{
			if(_outputTail + 2 > _outputEnd)
	//*   2    4:aload_0         
	//*   3    5:getfield        #56  <Field int _outputTail>
	//*   4    8:iconst_2        
	//*   5    9:iadd            
	//*   6   10:aload_0         
	//*   7   11:getfield        #45  <Field int _outputEnd>
	//*   8   14:icmple          21
				_flushBuffer();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #59  <Method void _flushBuffer()>
			char ac[] = _outputBuffer;
	//   11   21:aload_0         
	//   12   22:getfield        #43  <Field char[] _outputBuffer>
	//   13   25:astore          5
			c = ((char) (_outputTail));
	//   14   27:aload_0         
	//   15   28:getfield        #56  <Field int _outputTail>
	//   16   31:istore_1        
			_outputTail = c + 1;
	//   17   32:aload_0         
	//   18   33:iload_1         
	//   19   34:iconst_1        
	//   20   35:iadd            
	//   21   36:putfield        #56  <Field int _outputTail>
			ac[c] = '\\';
	//   22   39:aload           5
	//   23   41:iload_1         
	//   24   42:bipush          92
	//   25   44:castore         
			ac = _outputBuffer;
	//   26   45:aload_0         
	//   27   46:getfield        #43  <Field char[] _outputBuffer>
	//   28   49:astore          5
			c = ((char) (_outputTail));
	//   29   51:aload_0         
	//   30   52:getfield        #56  <Field int _outputTail>
	//   31   55:istore_1        
			_outputTail = c + 1;
	//   32   56:aload_0         
	//   33   57:iload_1         
	//   34   58:iconst_1        
	//   35   59:iadd            
	//   36   60:putfield        #56  <Field int _outputTail>
			ac[c] = (char)i;
	//   37   63:aload           5
	//   38   65:iload_1         
	//   39   66:iload_2         
	//   40   67:int2char        
	//   41   68:castore         
			return;
	//   42   69:return          
		}
		if(i != -2)
	//*  43   70:iload_2         
	//*  44   71:bipush          -2
	//*  45   73:icmpeq          239
		{
			if(_outputTail + 5 >= _outputEnd)
	//*  46   76:aload_0         
	//*  47   77:getfield        #56  <Field int _outputTail>
	//*  48   80:iconst_5        
	//*  49   81:iadd            
	//*  50   82:aload_0         
	//*  51   83:getfield        #45  <Field int _outputEnd>
	//*  52   86:icmplt          93
				_flushBuffer();
	//   53   89:aload_0         
	//   54   90:invokevirtual   #59  <Method void _flushBuffer()>
			i = _outputTail;
	//   55   93:aload_0         
	//   56   94:getfield        #56  <Field int _outputTail>
	//   57   97:istore_2        
			char ac1[] = _outputBuffer;
	//   58   98:aload_0         
	//   59   99:getfield        #43  <Field char[] _outputBuffer>
	//   60  102:astore          5
			int j = i + 1;
	//   61  104:iload_2         
	//   62  105:iconst_1        
	//   63  106:iadd            
	//   64  107:istore_3        
			ac1[i] = '\\';
	//   65  108:aload           5
	//   66  110:iload_2         
	//   67  111:bipush          92
	//   68  113:castore         
			i = j + 1;
	//   69  114:iload_3         
	//   70  115:iconst_1        
	//   71  116:iadd            
	//   72  117:istore_2        
			ac1[j] = 'u';
	//   73  118:aload           5
	//   74  120:iload_3         
	//   75  121:bipush          117
	//   76  123:castore         
			if(c > '\377')
	//*  77  124:iload_1         
	//*  78  125:sipush          255
	//*  79  128:icmple          216
			{
				j = c >> 8 & 0xff;
	//   80  131:iload_1         
	//   81  132:bipush          8
	//   82  134:ishr            
	//   83  135:sipush          255
	//   84  138:iand            
	//   85  139:istore_3        
				int l = i + 1;
	//   86  140:iload_2         
	//   87  141:iconst_1        
	//   88  142:iadd            
	//   89  143:istore          4
				ac1[i] = HEX_CHARS[j >> 4];
	//   90  145:aload           5
	//   91  147:iload_2         
	//   92  148:getstatic       #28  <Field char[] HEX_CHARS>
	//   93  151:iload_3         
	//   94  152:iconst_4        
	//   95  153:ishr            
	//   96  154:caload          
	//   97  155:castore         
				i = l + 1;
	//   98  156:iload           4
	//   99  158:iconst_1        
	//  100  159:iadd            
	//  101  160:istore_2        
				ac1[l] = HEX_CHARS[j & 0xf];
	//  102  161:aload           5
	//  103  163:iload           4
	//  104  165:getstatic       #28  <Field char[] HEX_CHARS>
	//  105  168:iload_3         
	//  106  169:bipush          15
	//  107  171:iand            
	//  108  172:caload          
	//  109  173:castore         
				c &= '\377';
	//  110  174:iload_1         
	//  111  175:sipush          255
	//  112  178:iand            
	//  113  179:int2char        
	//  114  180:istore_1        
			} else
	//* 115  181:iload_2         
	//* 116  182:iconst_1        
	//* 117  183:iadd            
	//* 118  184:istore_3        
	//* 119  185:aload           5
	//* 120  187:iload_2         
	//* 121  188:getstatic       #28  <Field char[] HEX_CHARS>
	//* 122  191:iload_1         
	//* 123  192:iconst_4        
	//* 124  193:ishr            
	//* 125  194:caload          
	//* 126  195:castore         
	//* 127  196:aload           5
	//* 128  198:iload_3         
	//* 129  199:getstatic       #28  <Field char[] HEX_CHARS>
	//* 130  202:iload_1         
	//* 131  203:bipush          15
	//* 132  205:iand            
	//* 133  206:caload          
	//* 134  207:castore         
	//* 135  208:aload_0         
	//* 136  209:iload_3         
	//* 137  210:iconst_1        
	//* 138  211:iadd            
	//* 139  212:putfield        #56  <Field int _outputTail>
	//* 140  215:return          
			{
				int k = i + 1;
	//  141  216:iload_2         
	//  142  217:iconst_1        
	//  143  218:iadd            
	//  144  219:istore_3        
				ac1[i] = '0';
	//  145  220:aload           5
	//  146  222:iload_2         
	//  147  223:bipush          48
	//  148  225:castore         
				i = k + 1;
	//  149  226:iload_3         
	//  150  227:iconst_1        
	//  151  228:iadd            
	//  152  229:istore_2        
				ac1[k] = '0';
	//  153  230:aload           5
	//  154  232:iload_3         
	//  155  233:bipush          48
	//  156  235:castore         
			}
			j = i + 1;
			ac1[i] = HEX_CHARS[c >> 4];
			ac1[j] = HEX_CHARS[c & 0xf];
			_outputTail = j + 1;
			return;
		}
	//* 157  236:goto            181
		String s;
		if(_currentEscape == null)
	//* 158  239:aload_0         
	//* 159  240:getfield        #61  <Field SerializableString _currentEscape>
	//* 160  243:ifnonnull       302
		{
			s = _characterEscapes.getEscapeSequence(((int) (c))).getValue();
	//  161  246:aload_0         
	//  162  247:getfield        #65  <Field CharacterEscapes _characterEscapes>
	//  163  250:iload_1         
	//  164  251:invokevirtual   #71  <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//  165  254:invokeinterface #77  <Method String SerializableString.getValue()>
	//  166  259:astore          5
		} else
	//* 167  261:aload           5
	//* 168  263:invokevirtual   #83  <Method int String.length()>
	//* 169  266:istore_1        
	//* 170  267:aload_0         
	//* 171  268:getfield        #56  <Field int _outputTail>
	//* 172  271:iload_1         
	//* 173  272:iadd            
	//* 174  273:aload_0         
	//* 175  274:getfield        #45  <Field int _outputEnd>
	//* 176  277:icmple          321
	//* 177  280:aload_0         
	//* 178  281:invokevirtual   #59  <Method void _flushBuffer()>
	//* 179  284:iload_1         
	//* 180  285:aload_0         
	//* 181  286:getfield        #45  <Field int _outputEnd>
	//* 182  289:icmple          321
	//* 183  292:aload_0         
	//* 184  293:getfield        #36  <Field Writer _writer>
	//* 185  296:aload           5
	//* 186  298:invokevirtual   #89  <Method void Writer.write(String)>
	//* 187  301:return          
		{
			s = _currentEscape.getValue();
	//  188  302:aload_0         
	//  189  303:getfield        #61  <Field SerializableString _currentEscape>
	//  190  306:invokeinterface #77  <Method String SerializableString.getValue()>
	//  191  311:astore          5
			_currentEscape = null;
	//  192  313:aload_0         
	//  193  314:aconst_null     
	//  194  315:putfield        #61  <Field SerializableString _currentEscape>
		}
		c = ((char) (s.length()));
		if(_outputTail + c > _outputEnd)
		{
			_flushBuffer();
			if(c > _outputEnd)
			{
				_writer.write(s);
				return;
			}
		}
	//* 195  318:goto            261
		s.getChars(0, ((int) (c)), _outputBuffer, _outputTail);
	//  196  321:aload           5
	//  197  323:iconst_0        
	//  198  324:iload_1         
	//  199  325:aload_0         
	//  200  326:getfield        #43  <Field char[] _outputBuffer>
	//  201  329:aload_0         
	//  202  330:getfield        #56  <Field int _outputTail>
	//  203  333:invokevirtual   #93  <Method void String.getChars(int, int, char[], int)>
		_outputTail = _outputTail + c;
	//  204  336:aload_0         
	//  205  337:aload_0         
	//  206  338:getfield        #56  <Field int _outputTail>
	//  207  341:iload_1         
	//  208  342:iadd            
	//  209  343:putfield        #56  <Field int _outputTail>
	//  210  346:return          
	}

	private int _prependOrWriteCharacterEscape(char ac[], int i, int j, char c, int k)
		throws IOException, JsonGenerationException
	{
		if(k >= 0)
	//*   0    0:iload           5
	//*   1    2:iflt            72
		{
			if(i > 1 && i < j)
	//*   2    5:iload_2         
	//*   3    6:iconst_1        
	//*   4    7:icmple          34
	//*   5   10:iload_2         
	//*   6   11:iload_3         
	//*   7   12:icmpge          34
			{
				i -= 2;
	//    8   15:iload_2         
	//    9   16:iconst_2        
	//   10   17:isub            
	//   11   18:istore_2        
				ac[i] = '\\';
	//   12   19:aload_1         
	//   13   20:iload_2         
	//   14   21:bipush          92
	//   15   23:castore         
				ac[i + 1] = (char)k;
	//   16   24:aload_1         
	//   17   25:iload_2         
	//   18   26:iconst_1        
	//   19   27:iadd            
	//   20   28:iload           5
	//   21   30:int2char        
	//   22   31:castore         
			} else
	//*  23   32:iload_2         
	//*  24   33:ireturn         
			{
				char ac1[] = _entityBuffer;
	//   25   34:aload_0         
	//   26   35:getfield        #48  <Field char[] _entityBuffer>
	//   27   38:astore          6
				ac = ac1;
	//   28   40:aload           6
	//   29   42:astore_1        
				if(ac1 == null)
	//*  30   43:aload           6
	//*  31   45:ifnonnull       53
					ac = _allocateEntityBuffer();
	//   32   48:aload_0         
	//   33   49:invokespecial   #98  <Method char[] _allocateEntityBuffer()>
	//   34   52:astore_1        
				ac[1] = (char)k;
	//   35   53:aload_1         
	//   36   54:iconst_1        
	//   37   55:iload           5
	//   38   57:int2char        
	//   39   58:castore         
				_writer.write(ac, 0, 2);
	//   40   59:aload_0         
	//   41   60:getfield        #36  <Field Writer _writer>
	//   42   63:aload_1         
	//   43   64:iconst_0        
	//   44   65:iconst_2        
	//   45   66:invokevirtual   #101 <Method void Writer.write(char[], int, int)>
			}
			return i;
		}
	//*  46   69:goto            32
		if(k != -2)
	//*  47   72:iload           5
	//*  48   74:bipush          -2
	//*  49   76:icmpeq          380
		{
			if(i > 5 && i < j)
	//*  50   79:iload_2         
	//*  51   80:iconst_5        
	//*  52   81:icmple          225
	//*  53   84:iload_2         
	//*  54   85:iload_3         
	//*  55   86:icmpge          225
			{
				i -= 6;
	//   56   89:iload_2         
	//   57   90:bipush          6
	//   58   92:isub            
	//   59   93:istore_2        
				j = i + 1;
	//   60   94:iload_2         
	//   61   95:iconst_1        
	//   62   96:iadd            
	//   63   97:istore_3        
				ac[i] = '\\';
	//   64   98:aload_1         
	//   65   99:iload_2         
	//   66  100:bipush          92
	//   67  102:castore         
				i = j + 1;
	//   68  103:iload_3         
	//   69  104:iconst_1        
	//   70  105:iadd            
	//   71  106:istore_2        
				ac[j] = 'u';
	//   72  107:aload_1         
	//   73  108:iload_3         
	//   74  109:bipush          117
	//   75  111:castore         
				if(c > '\377')
	//*  76  112:iload           4
	//*  77  114:sipush          255
	//*  78  117:icmple          204
				{
					j = c >> 8 & 0xff;
	//   79  120:iload           4
	//   80  122:bipush          8
	//   81  124:ishr            
	//   82  125:sipush          255
	//   83  128:iand            
	//   84  129:istore_3        
					k = i + 1;
	//   85  130:iload_2         
	//   86  131:iconst_1        
	//   87  132:iadd            
	//   88  133:istore          5
					ac[i] = HEX_CHARS[j >> 4];
	//   89  135:aload_1         
	//   90  136:iload_2         
	//   91  137:getstatic       #28  <Field char[] HEX_CHARS>
	//   92  140:iload_3         
	//   93  141:iconst_4        
	//   94  142:ishr            
	//   95  143:caload          
	//   96  144:castore         
					i = k + 1;
	//   97  145:iload           5
	//   98  147:iconst_1        
	//   99  148:iadd            
	//  100  149:istore_2        
					ac[k] = HEX_CHARS[j & 0xf];
	//  101  150:aload_1         
	//  102  151:iload           5
	//  103  153:getstatic       #28  <Field char[] HEX_CHARS>
	//  104  156:iload_3         
	//  105  157:bipush          15
	//  106  159:iand            
	//  107  160:caload          
	//  108  161:castore         
					c &= '\377';
	//  109  162:iload           4
	//  110  164:sipush          255
	//  111  167:iand            
	//  112  168:int2char        
	//  113  169:istore          4
				} else
	//* 114  171:iload_2         
	//* 115  172:iconst_1        
	//* 116  173:iadd            
	//* 117  174:istore_3        
	//* 118  175:aload_1         
	//* 119  176:iload_2         
	//* 120  177:getstatic       #28  <Field char[] HEX_CHARS>
	//* 121  180:iload           4
	//* 122  182:iconst_4        
	//* 123  183:ishr            
	//* 124  184:caload          
	//* 125  185:castore         
	//* 126  186:aload_1         
	//* 127  187:iload_3         
	//* 128  188:getstatic       #28  <Field char[] HEX_CHARS>
	//* 129  191:iload           4
	//* 130  193:bipush          15
	//* 131  195:iand            
	//* 132  196:caload          
	//* 133  197:castore         
	//* 134  198:iload_3         
	//* 135  199:iconst_5        
	//* 136  200:isub            
	//* 137  201:istore_2        
	//* 138  202:iload_2         
	//* 139  203:ireturn         
				{
					j = i + 1;
	//  140  204:iload_2         
	//  141  205:iconst_1        
	//  142  206:iadd            
	//  143  207:istore_3        
					ac[i] = '0';
	//  144  208:aload_1         
	//  145  209:iload_2         
	//  146  210:bipush          48
	//  147  212:castore         
					i = j + 1;
	//  148  213:iload_3         
	//  149  214:iconst_1        
	//  150  215:iadd            
	//  151  216:istore_2        
					ac[j] = '0';
	//  152  217:aload_1         
	//  153  218:iload_3         
	//  154  219:bipush          48
	//  155  221:castore         
				}
				j = i + 1;
				ac[i] = HEX_CHARS[c >> 4];
				ac[j] = HEX_CHARS[c & 0xf];
				i = j - 5;
			} else
	//* 156  222:goto            171
			{
				char ac2[] = _entityBuffer;
	//  157  225:aload_0         
	//  158  226:getfield        #48  <Field char[] _entityBuffer>
	//  159  229:astore          6
				ac = ac2;
	//  160  231:aload           6
	//  161  233:astore_1        
				if(ac2 == null)
	//* 162  234:aload           6
	//* 163  236:ifnonnull       244
					ac = _allocateEntityBuffer();
	//  164  239:aload_0         
	//  165  240:invokespecial   #98  <Method char[] _allocateEntityBuffer()>
	//  166  243:astore_1        
				_outputHead = _outputTail;
	//  167  244:aload_0         
	//  168  245:aload_0         
	//  169  246:getfield        #56  <Field int _outputTail>
	//  170  249:putfield        #103 <Field int _outputHead>
				if(c > '\377')
	//* 171  252:iload           4
	//* 172  254:sipush          255
	//* 173  257:icmple          341
				{
					j = c >> 8 & 0xff;
	//  174  260:iload           4
	//  175  262:bipush          8
	//  176  264:ishr            
	//  177  265:sipush          255
	//  178  268:iand            
	//  179  269:istore_3        
					c &= '\377';
	//  180  270:iload           4
	//  181  272:sipush          255
	//  182  275:iand            
	//  183  276:istore          4
					ac[10] = HEX_CHARS[j >> 4];
	//  184  278:aload_1         
	//  185  279:bipush          10
	//  186  281:getstatic       #28  <Field char[] HEX_CHARS>
	//  187  284:iload_3         
	//  188  285:iconst_4        
	//  189  286:ishr            
	//  190  287:caload          
	//  191  288:castore         
					ac[11] = HEX_CHARS[j & 0xf];
	//  192  289:aload_1         
	//  193  290:bipush          11
	//  194  292:getstatic       #28  <Field char[] HEX_CHARS>
	//  195  295:iload_3         
	//  196  296:bipush          15
	//  197  298:iand            
	//  198  299:caload          
	//  199  300:castore         
					ac[12] = HEX_CHARS[c >> 4];
	//  200  301:aload_1         
	//  201  302:bipush          12
	//  202  304:getstatic       #28  <Field char[] HEX_CHARS>
	//  203  307:iload           4
	//  204  309:iconst_4        
	//  205  310:ishr            
	//  206  311:caload          
	//  207  312:castore         
					ac[13] = HEX_CHARS[c & 0xf];
	//  208  313:aload_1         
	//  209  314:bipush          13
	//  210  316:getstatic       #28  <Field char[] HEX_CHARS>
	//  211  319:iload           4
	//  212  321:bipush          15
	//  213  323:iand            
	//  214  324:caload          
	//  215  325:castore         
					_writer.write(ac, 8, 6);
	//  216  326:aload_0         
	//  217  327:getfield        #36  <Field Writer _writer>
	//  218  330:aload_1         
	//  219  331:bipush          8
	//  220  333:bipush          6
	//  221  335:invokevirtual   #101 <Method void Writer.write(char[], int, int)>
				} else
	//* 222  338:goto            202
				{
					ac[6] = HEX_CHARS[c >> 4];
	//  223  341:aload_1         
	//  224  342:bipush          6
	//  225  344:getstatic       #28  <Field char[] HEX_CHARS>
	//  226  347:iload           4
	//  227  349:iconst_4        
	//  228  350:ishr            
	//  229  351:caload          
	//  230  352:castore         
					ac[7] = HEX_CHARS[c & 0xf];
	//  231  353:aload_1         
	//  232  354:bipush          7
	//  233  356:getstatic       #28  <Field char[] HEX_CHARS>
	//  234  359:iload           4
	//  235  361:bipush          15
	//  236  363:iand            
	//  237  364:caload          
	//  238  365:castore         
					_writer.write(ac, 2, 6);
	//  239  366:aload_0         
	//  240  367:getfield        #36  <Field Writer _writer>
	//  241  370:aload_1         
	//  242  371:iconst_2        
	//  243  372:bipush          6
	//  244  374:invokevirtual   #101 <Method void Writer.write(char[], int, int)>
				}
			}
			return i;
		}
	//* 245  377:goto            202
		String s;
		if(_currentEscape == null)
	//* 246  380:aload_0         
	//* 247  381:getfield        #61  <Field SerializableString _currentEscape>
	//* 248  384:ifnonnull       438
		{
			s = _characterEscapes.getEscapeSequence(((int) (c))).getValue();
	//  249  387:aload_0         
	//  250  388:getfield        #65  <Field CharacterEscapes _characterEscapes>
	//  251  391:iload           4
	//  252  393:invokevirtual   #71  <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//  253  396:invokeinterface #77  <Method String SerializableString.getValue()>
	//  254  401:astore          6
		} else
	//* 255  403:aload           6
	//* 256  405:invokevirtual   #83  <Method int String.length()>
	//* 257  408:istore          4
	//* 258  410:iload_2         
	//* 259  411:iload           4
	//* 260  413:icmplt          457
	//* 261  416:iload_2         
	//* 262  417:iload_3         
	//* 263  418:icmpge          457
	//* 264  421:iload_2         
	//* 265  422:iload           4
	//* 266  424:isub            
	//* 267  425:istore_2        
	//* 268  426:aload           6
	//* 269  428:iconst_0        
	//* 270  429:iload           4
	//* 271  431:aload_1         
	//* 272  432:iload_2         
	//* 273  433:invokevirtual   #93  <Method void String.getChars(int, int, char[], int)>
	//* 274  436:iload_2         
	//* 275  437:ireturn         
		{
			s = _currentEscape.getValue();
	//  276  438:aload_0         
	//  277  439:getfield        #61  <Field SerializableString _currentEscape>
	//  278  442:invokeinterface #77  <Method String SerializableString.getValue()>
	//  279  447:astore          6
			_currentEscape = null;
	//  280  449:aload_0         
	//  281  450:aconst_null     
	//  282  451:putfield        #61  <Field SerializableString _currentEscape>
		}
		c = ((char) (s.length()));
		if(i >= c && i < j)
		{
			i -= ((int) (c));
			s.getChars(0, ((int) (c)), ac, i);
		} else
	//* 283  454:goto            403
		{
			_writer.write(s);
	//  284  457:aload_0         
	//  285  458:getfield        #36  <Field Writer _writer>
	//  286  461:aload           6
	//  287  463:invokevirtual   #89  <Method void Writer.write(String)>
		}
		return i;
	//* 288  466:goto            436
	}

	private void _prependOrWriteCharacterEscape(char c, int i)
		throws IOException, JsonGenerationException
	{
		if(i >= 0)
	//*   0    0:iload_2         
	//*   1    1:iflt            90
		{
			if(_outputTail >= 2)
	//*   2    4:aload_0         
	//*   3    5:getfield        #56  <Field int _outputTail>
	//*   4    8:iconst_2        
	//*   5    9:icmplt          43
			{
				c = ((char) (_outputTail - 2));
	//    6   12:aload_0         
	//    7   13:getfield        #56  <Field int _outputTail>
	//    8   16:iconst_2        
	//    9   17:isub            
	//   10   18:istore_1        
				_outputHead = ((int) (c));
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:putfield        #103 <Field int _outputHead>
				_outputBuffer[c] = '\\';
	//   14   24:aload_0         
	//   15   25:getfield        #43  <Field char[] _outputBuffer>
	//   16   28:iload_1         
	//   17   29:bipush          92
	//   18   31:castore         
				_outputBuffer[c + 1] = (char)i;
	//   19   32:aload_0         
	//   20   33:getfield        #43  <Field char[] _outputBuffer>
	//   21   36:iload_1         
	//   22   37:iconst_1        
	//   23   38:iadd            
	//   24   39:iload_2         
	//   25   40:int2char        
	//   26   41:castore         
				return;
	//   27   42:return          
			}
			char ac3[] = _entityBuffer;
	//   28   43:aload_0         
	//   29   44:getfield        #48  <Field char[] _entityBuffer>
	//   30   47:astore          5
			char ac[] = ac3;
	//   31   49:aload           5
	//   32   51:astore          4
			if(ac3 == null)
	//*  33   53:aload           5
	//*  34   55:ifnonnull       64
				ac = _allocateEntityBuffer();
	//   35   58:aload_0         
	//   36   59:invokespecial   #98  <Method char[] _allocateEntityBuffer()>
	//   37   62:astore          4
			_outputHead = _outputTail;
	//   38   64:aload_0         
	//   39   65:aload_0         
	//   40   66:getfield        #56  <Field int _outputTail>
	//   41   69:putfield        #103 <Field int _outputHead>
			ac[1] = (char)i;
	//   42   72:aload           4
	//   43   74:iconst_1        
	//   44   75:iload_2         
	//   45   76:int2char        
	//   46   77:castore         
			_writer.write(ac, 0, 2);
	//   47   78:aload_0         
	//   48   79:getfield        #36  <Field Writer _writer>
	//   49   82:aload           4
	//   50   84:iconst_0        
	//   51   85:iconst_2        
	//   52   86:invokevirtual   #101 <Method void Writer.write(char[], int, int)>
			return;
	//   53   89:return          
		}
		if(i != -2)
	//*  54   90:iload_2         
	//*  55   91:bipush          -2
	//*  56   93:icmpeq          400
		{
			if(_outputTail >= 6)
	//*  57   96:aload_0         
	//*  58   97:getfield        #56  <Field int _outputTail>
	//*  59  100:bipush          6
	//*  60  102:icmplt          247
			{
				char ac1[] = _outputBuffer;
	//   61  105:aload_0         
	//   62  106:getfield        #43  <Field char[] _outputBuffer>
	//   63  109:astore          4
				i = _outputTail - 6;
	//   64  111:aload_0         
	//   65  112:getfield        #56  <Field int _outputTail>
	//   66  115:bipush          6
	//   67  117:isub            
	//   68  118:istore_2        
				_outputHead = i;
	//   69  119:aload_0         
	//   70  120:iload_2         
	//   71  121:putfield        #103 <Field int _outputHead>
				ac1[i] = '\\';
	//   72  124:aload           4
	//   73  126:iload_2         
	//   74  127:bipush          92
	//   75  129:castore         
				i++;
	//   76  130:iload_2         
	//   77  131:iconst_1        
	//   78  132:iadd            
	//   79  133:istore_2        
				ac1[i] = 'u';
	//   80  134:aload           4
	//   81  136:iload_2         
	//   82  137:bipush          117
	//   83  139:castore         
				if(c > '\377')
	//*  84  140:iload_1         
	//*  85  141:sipush          255
	//*  86  144:icmple          224
				{
					int j = c >> 8 & 0xff;
	//   87  147:iload_1         
	//   88  148:bipush          8
	//   89  150:ishr            
	//   90  151:sipush          255
	//   91  154:iand            
	//   92  155:istore_3        
					i++;
	//   93  156:iload_2         
	//   94  157:iconst_1        
	//   95  158:iadd            
	//   96  159:istore_2        
					ac1[i] = HEX_CHARS[j >> 4];
	//   97  160:aload           4
	//   98  162:iload_2         
	//   99  163:getstatic       #28  <Field char[] HEX_CHARS>
	//  100  166:iload_3         
	//  101  167:iconst_4        
	//  102  168:ishr            
	//  103  169:caload          
	//  104  170:castore         
					i++;
	//  105  171:iload_2         
	//  106  172:iconst_1        
	//  107  173:iadd            
	//  108  174:istore_2        
					ac1[i] = HEX_CHARS[j & 0xf];
	//  109  175:aload           4
	//  110  177:iload_2         
	//  111  178:getstatic       #28  <Field char[] HEX_CHARS>
	//  112  181:iload_3         
	//  113  182:bipush          15
	//  114  184:iand            
	//  115  185:caload          
	//  116  186:castore         
					c &= '\377';
	//  117  187:iload_1         
	//  118  188:sipush          255
	//  119  191:iand            
	//  120  192:int2char        
	//  121  193:istore_1        
				} else
	//* 122  194:iload_2         
	//* 123  195:iconst_1        
	//* 124  196:iadd            
	//* 125  197:istore_2        
	//* 126  198:aload           4
	//* 127  200:iload_2         
	//* 128  201:getstatic       #28  <Field char[] HEX_CHARS>
	//* 129  204:iload_1         
	//* 130  205:iconst_4        
	//* 131  206:ishr            
	//* 132  207:caload          
	//* 133  208:castore         
	//* 134  209:aload           4
	//* 135  211:iload_2         
	//* 136  212:iconst_1        
	//* 137  213:iadd            
	//* 138  214:getstatic       #28  <Field char[] HEX_CHARS>
	//* 139  217:iload_1         
	//* 140  218:bipush          15
	//* 141  220:iand            
	//* 142  221:caload          
	//* 143  222:castore         
	//* 144  223:return          
				{
					i++;
	//  145  224:iload_2         
	//  146  225:iconst_1        
	//  147  226:iadd            
	//  148  227:istore_2        
					ac1[i] = '0';
	//  149  228:aload           4
	//  150  230:iload_2         
	//  151  231:bipush          48
	//  152  233:castore         
					i++;
	//  153  234:iload_2         
	//  154  235:iconst_1        
	//  155  236:iadd            
	//  156  237:istore_2        
					ac1[i] = '0';
	//  157  238:aload           4
	//  158  240:iload_2         
	//  159  241:bipush          48
	//  160  243:castore         
				}
				i++;
				ac1[i] = HEX_CHARS[c >> 4];
				ac1[i + 1] = HEX_CHARS[c & 0xf];
				return;
			}
	//* 161  244:goto            194
			char ac4[] = _entityBuffer;
	//  162  247:aload_0         
	//  163  248:getfield        #48  <Field char[] _entityBuffer>
	//  164  251:astore          5
			char ac2[] = ac4;
	//  165  253:aload           5
	//  166  255:astore          4
			if(ac4 == null)
	//* 167  257:aload           5
	//* 168  259:ifnonnull       268
				ac2 = _allocateEntityBuffer();
	//  169  262:aload_0         
	//  170  263:invokespecial   #98  <Method char[] _allocateEntityBuffer()>
	//  171  266:astore          4
			_outputHead = _outputTail;
	//  172  268:aload_0         
	//  173  269:aload_0         
	//  174  270:getfield        #56  <Field int _outputTail>
	//  175  273:putfield        #103 <Field int _outputHead>
			if(c > '\377')
	//* 176  276:iload_1         
	//* 177  277:sipush          255
	//* 178  280:icmple          362
			{
				i = c >> 8 & 0xff;
	//  179  283:iload_1         
	//  180  284:bipush          8
	//  181  286:ishr            
	//  182  287:sipush          255
	//  183  290:iand            
	//  184  291:istore_2        
				c &= '\377';
	//  185  292:iload_1         
	//  186  293:sipush          255
	//  187  296:iand            
	//  188  297:istore_1        
				ac2[10] = HEX_CHARS[i >> 4];
	//  189  298:aload           4
	//  190  300:bipush          10
	//  191  302:getstatic       #28  <Field char[] HEX_CHARS>
	//  192  305:iload_2         
	//  193  306:iconst_4        
	//  194  307:ishr            
	//  195  308:caload          
	//  196  309:castore         
				ac2[11] = HEX_CHARS[i & 0xf];
	//  197  310:aload           4
	//  198  312:bipush          11
	//  199  314:getstatic       #28  <Field char[] HEX_CHARS>
	//  200  317:iload_2         
	//  201  318:bipush          15
	//  202  320:iand            
	//  203  321:caload          
	//  204  322:castore         
				ac2[12] = HEX_CHARS[c >> 4];
	//  205  323:aload           4
	//  206  325:bipush          12
	//  207  327:getstatic       #28  <Field char[] HEX_CHARS>
	//  208  330:iload_1         
	//  209  331:iconst_4        
	//  210  332:ishr            
	//  211  333:caload          
	//  212  334:castore         
				ac2[13] = HEX_CHARS[c & 0xf];
	//  213  335:aload           4
	//  214  337:bipush          13
	//  215  339:getstatic       #28  <Field char[] HEX_CHARS>
	//  216  342:iload_1         
	//  217  343:bipush          15
	//  218  345:iand            
	//  219  346:caload          
	//  220  347:castore         
				_writer.write(ac2, 8, 6);
	//  221  348:aload_0         
	//  222  349:getfield        #36  <Field Writer _writer>
	//  223  352:aload           4
	//  224  354:bipush          8
	//  225  356:bipush          6
	//  226  358:invokevirtual   #101 <Method void Writer.write(char[], int, int)>
				return;
	//  227  361:return          
			} else
			{
				ac2[6] = HEX_CHARS[c >> 4];
	//  228  362:aload           4
	//  229  364:bipush          6
	//  230  366:getstatic       #28  <Field char[] HEX_CHARS>
	//  231  369:iload_1         
	//  232  370:iconst_4        
	//  233  371:ishr            
	//  234  372:caload          
	//  235  373:castore         
				ac2[7] = HEX_CHARS[c & 0xf];
	//  236  374:aload           4
	//  237  376:bipush          7
	//  238  378:getstatic       #28  <Field char[] HEX_CHARS>
	//  239  381:iload_1         
	//  240  382:bipush          15
	//  241  384:iand            
	//  242  385:caload          
	//  243  386:castore         
				_writer.write(ac2, 2, 6);
	//  244  387:aload_0         
	//  245  388:getfield        #36  <Field Writer _writer>
	//  246  391:aload           4
	//  247  393:iconst_2        
	//  248  394:bipush          6
	//  249  396:invokevirtual   #101 <Method void Writer.write(char[], int, int)>
				return;
	//  250  399:return          
			}
		}
		String s;
		if(_currentEscape == null)
	//* 251  400:aload_0         
	//* 252  401:getfield        #61  <Field SerializableString _currentEscape>
	//* 253  404:ifnonnull       461
		{
			s = _characterEscapes.getEscapeSequence(((int) (c))).getValue();
	//  254  407:aload_0         
	//  255  408:getfield        #65  <Field CharacterEscapes _characterEscapes>
	//  256  411:iload_1         
	//  257  412:invokevirtual   #71  <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//  258  415:invokeinterface #77  <Method String SerializableString.getValue()>
	//  259  420:astore          4
		} else
	//* 260  422:aload           4
	//* 261  424:invokevirtual   #83  <Method int String.length()>
	//* 262  427:istore_1        
	//* 263  428:aload_0         
	//* 264  429:getfield        #56  <Field int _outputTail>
	//* 265  432:iload_1         
	//* 266  433:icmplt          480
	//* 267  436:aload_0         
	//* 268  437:getfield        #56  <Field int _outputTail>
	//* 269  440:iload_1         
	//* 270  441:isub            
	//* 271  442:istore_2        
	//* 272  443:aload_0         
	//* 273  444:iload_2         
	//* 274  445:putfield        #103 <Field int _outputHead>
	//* 275  448:aload           4
	//* 276  450:iconst_0        
	//* 277  451:iload_1         
	//* 278  452:aload_0         
	//* 279  453:getfield        #43  <Field char[] _outputBuffer>
	//* 280  456:iload_2         
	//* 281  457:invokevirtual   #93  <Method void String.getChars(int, int, char[], int)>
	//* 282  460:return          
		{
			s = _currentEscape.getValue();
	//  283  461:aload_0         
	//  284  462:getfield        #61  <Field SerializableString _currentEscape>
	//  285  465:invokeinterface #77  <Method String SerializableString.getValue()>
	//  286  470:astore          4
			_currentEscape = null;
	//  287  472:aload_0         
	//  288  473:aconst_null     
	//  289  474:putfield        #61  <Field SerializableString _currentEscape>
		}
		c = ((char) (s.length()));
		if(_outputTail >= c)
		{
			i = _outputTail - c;
			_outputHead = i;
			s.getChars(0, ((int) (c)), _outputBuffer, i);
			return;
		} else
	//* 290  477:goto            422
		{
			_outputHead = _outputTail;
	//  291  480:aload_0         
	//  292  481:aload_0         
	//  293  482:getfield        #56  <Field int _outputTail>
	//  294  485:putfield        #103 <Field int _outputHead>
			_writer.write(s);
	//  295  488:aload_0         
	//  296  489:getfield        #36  <Field Writer _writer>
	//  297  492:aload           4
	//  298  494:invokevirtual   #89  <Method void Writer.write(String)>
			return;
	//  299  497:return          
		}
	}

	private int _readMore(InputStream inputstream, byte abyte0[], int i, int j, int k)
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
	//   27   40:invokestatic    #111 <Method int Math.min(int, int)>
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
	//   41   63:invokevirtual   #117 <Method int InputStream.read(byte[], int, int)>
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

	private void _writeLongString(String s)
		throws IOException
	{
		_flushBuffer();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #59  <Method void _flushBuffer()>
		int k = s.length();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #83  <Method int String.length()>
	//    4    8:istore          4
		int i = 0;
	//    5   10:iconst_0        
	//    6   11:istore_2        
		do
		{
			int j = _outputEnd;
	//    7   12:aload_0         
	//    8   13:getfield        #45  <Field int _outputEnd>
	//    9   16:istore_3        
			if(i + j > k)
	//*  10   17:iload_2         
	//*  11   18:iload_3         
	//*  12   19:iadd            
	//*  13   20:iload           4
	//*  14   22:icmple          68
				j = k - i;
	//   15   25:iload           4
	//   16   27:iload_2         
	//   17   28:isub            
	//   18   29:istore_3        
			s.getChars(i, i + j, _outputBuffer, 0);
	//   19   30:aload_1         
	//   20   31:iload_2         
	//   21   32:iload_2         
	//   22   33:iload_3         
	//   23   34:iadd            
	//   24   35:aload_0         
	//   25   36:getfield        #43  <Field char[] _outputBuffer>
	//   26   39:iconst_0        
	//   27   40:invokevirtual   #93  <Method void String.getChars(int, int, char[], int)>
			if(_characterEscapes != null)
	//*  28   43:aload_0         
	//*  29   44:getfield        #65  <Field CharacterEscapes _characterEscapes>
	//*  30   47:ifnull          71
				_writeSegmentCustom(j);
	//   31   50:aload_0         
	//   32   51:iload_3         
	//   33   52:invokespecial   #122 <Method void _writeSegmentCustom(int)>
			else
	//*  34   55:iload_2         
	//*  35   56:iload_3         
	//*  36   57:iadd            
	//*  37   58:istore_3        
	//*  38   59:iload_3         
	//*  39   60:istore_2        
	//*  40   61:iload_3         
	//*  41   62:iload           4
	//*  42   64:icmplt          12
	//*  43   67:return          
	//*  44   68:goto            30
			if(_maximumNonEscapedChar != 0)
	//*  45   71:aload_0         
	//*  46   72:getfield        #125 <Field int _maximumNonEscapedChar>
	//*  47   75:ifeq            90
				_writeSegmentASCII(j, _maximumNonEscapedChar);
	//   48   78:aload_0         
	//   49   79:iload_3         
	//   50   80:aload_0         
	//   51   81:getfield        #125 <Field int _maximumNonEscapedChar>
	//   52   84:invokespecial   #129 <Method void _writeSegmentASCII(int, int)>
			else
	//*  53   87:goto            55
				_writeSegment(j);
	//   54   90:aload_0         
	//   55   91:iload_3         
	//   56   92:invokespecial   #132 <Method void _writeSegment(int)>
			j = i + j;
			i = j;
		} while(j < k);
	//*  57   95:goto            55
	}

	private final void _writeNull()
		throws IOException
	{
		if(_outputTail + 4 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field int _outputTail>
	//*   2    4:iconst_4        
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #45  <Field int _outputEnd>
	//*   6   10:icmplt          17
			_flushBuffer();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #59  <Method void _flushBuffer()>
		int i = _outputTail;
	//    9   17:aload_0         
	//   10   18:getfield        #56  <Field int _outputTail>
	//   11   21:istore_1        
		char ac[] = _outputBuffer;
	//   12   22:aload_0         
	//   13   23:getfield        #43  <Field char[] _outputBuffer>
	//   14   26:astore_2        
		ac[i] = 'n';
	//   15   27:aload_2         
	//   16   28:iload_1         
	//   17   29:bipush          110
	//   18   31:castore         
		i++;
	//   19   32:iload_1         
	//   20   33:iconst_1        
	//   21   34:iadd            
	//   22   35:istore_1        
		ac[i] = 'u';
	//   23   36:aload_2         
	//   24   37:iload_1         
	//   25   38:bipush          117
	//   26   40:castore         
		i++;
	//   27   41:iload_1         
	//   28   42:iconst_1        
	//   29   43:iadd            
	//   30   44:istore_1        
		ac[i] = 'l';
	//   31   45:aload_2         
	//   32   46:iload_1         
	//   33   47:bipush          108
	//   34   49:castore         
		i++;
	//   35   50:iload_1         
	//   36   51:iconst_1        
	//   37   52:iadd            
	//   38   53:istore_1        
		ac[i] = 'l';
	//   39   54:aload_2         
	//   40   55:iload_1         
	//   41   56:bipush          108
	//   42   58:castore         
		_outputTail = i + 1;
	//   43   59:aload_0         
	//   44   60:iload_1         
	//   45   61:iconst_1        
	//   46   62:iadd            
	//   47   63:putfield        #56  <Field int _outputTail>
	//   48   66:return          
	}

	private void _writeQuotedInt(int i)
		throws IOException
	{
		if(_outputTail + 13 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field int _outputTail>
	//*   2    4:bipush          13
	//*   3    6:iadd            
	//*   4    7:aload_0         
	//*   5    8:getfield        #45  <Field int _outputEnd>
	//*   6   11:icmplt          18
			_flushBuffer();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #59  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//    9   18:aload_0         
	//   10   19:getfield        #43  <Field char[] _outputBuffer>
	//   11   22:astore_3        
		int j = _outputTail;
	//   12   23:aload_0         
	//   13   24:getfield        #56  <Field int _outputTail>
	//   14   27:istore_2        
		_outputTail = j + 1;
	//   15   28:aload_0         
	//   16   29:iload_2         
	//   17   30:iconst_1        
	//   18   31:iadd            
	//   19   32:putfield        #56  <Field int _outputTail>
		ac[j] = '"';
	//   20   35:aload_3         
	//   21   36:iload_2         
	//   22   37:bipush          34
	//   23   39:castore         
		_outputTail = NumberOutput.outputInt(i, _outputBuffer, _outputTail);
	//   24   40:aload_0         
	//   25   41:iload_1         
	//   26   42:aload_0         
	//   27   43:getfield        #43  <Field char[] _outputBuffer>
	//   28   46:aload_0         
	//   29   47:getfield        #56  <Field int _outputTail>
	//   30   50:invokestatic    #140 <Method int NumberOutput.outputInt(int, char[], int)>
	//   31   53:putfield        #56  <Field int _outputTail>
		ac = _outputBuffer;
	//   32   56:aload_0         
	//   33   57:getfield        #43  <Field char[] _outputBuffer>
	//   34   60:astore_3        
		i = _outputTail;
	//   35   61:aload_0         
	//   36   62:getfield        #56  <Field int _outputTail>
	//   37   65:istore_1        
		_outputTail = i + 1;
	//   38   66:aload_0         
	//   39   67:iload_1         
	//   40   68:iconst_1        
	//   41   69:iadd            
	//   42   70:putfield        #56  <Field int _outputTail>
		ac[i] = '"';
	//   43   73:aload_3         
	//   44   74:iload_1         
	//   45   75:bipush          34
	//   46   77:castore         
	//   47   78:return          
	}

	private void _writeQuotedLong(long l)
		throws IOException
	{
		if(_outputTail + 23 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field int _outputTail>
	//*   2    4:bipush          23
	//*   3    6:iadd            
	//*   4    7:aload_0         
	//*   5    8:getfield        #45  <Field int _outputEnd>
	//*   6   11:icmplt          18
			_flushBuffer();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #59  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//    9   18:aload_0         
	//   10   19:getfield        #43  <Field char[] _outputBuffer>
	//   11   22:astore          4
		int i = _outputTail;
	//   12   24:aload_0         
	//   13   25:getfield        #56  <Field int _outputTail>
	//   14   28:istore_3        
		_outputTail = i + 1;
	//   15   29:aload_0         
	//   16   30:iload_3         
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:putfield        #56  <Field int _outputTail>
		ac[i] = '"';
	//   20   36:aload           4
	//   21   38:iload_3         
	//   22   39:bipush          34
	//   23   41:castore         
		_outputTail = NumberOutput.outputLong(l, _outputBuffer, _outputTail);
	//   24   42:aload_0         
	//   25   43:lload_1         
	//   26   44:aload_0         
	//   27   45:getfield        #43  <Field char[] _outputBuffer>
	//   28   48:aload_0         
	//   29   49:getfield        #56  <Field int _outputTail>
	//   30   52:invokestatic    #146 <Method int NumberOutput.outputLong(long, char[], int)>
	//   31   55:putfield        #56  <Field int _outputTail>
		ac = _outputBuffer;
	//   32   58:aload_0         
	//   33   59:getfield        #43  <Field char[] _outputBuffer>
	//   34   62:astore          4
		i = _outputTail;
	//   35   64:aload_0         
	//   36   65:getfield        #56  <Field int _outputTail>
	//   37   68:istore_3        
		_outputTail = i + 1;
	//   38   69:aload_0         
	//   39   70:iload_3         
	//   40   71:iconst_1        
	//   41   72:iadd            
	//   42   73:putfield        #56  <Field int _outputTail>
		ac[i] = '"';
	//   43   76:aload           4
	//   44   78:iload_3         
	//   45   79:bipush          34
	//   46   81:castore         
	//   47   82:return          
	}

	private void _writeQuotedRaw(String s)
		throws IOException
	{
		if(_outputTail >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field int _outputTail>
	//*   2    4:aload_0         
	//*   3    5:getfield        #45  <Field int _outputEnd>
	//*   4    8:icmplt          15
			_flushBuffer();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #59  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #43  <Field char[] _outputBuffer>
	//    9   19:astore_3        
		int i = _outputTail;
	//   10   20:aload_0         
	//   11   21:getfield        #56  <Field int _outputTail>
	//   12   24:istore_2        
		_outputTail = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #56  <Field int _outputTail>
		ac[i] = '"';
	//   18   32:aload_3         
	//   19   33:iload_2         
	//   20   34:bipush          34
	//   21   36:castore         
		writeRaw(s);
	//   22   37:aload_0         
	//   23   38:aload_1         
	//   24   39:invokevirtual   #150 <Method void writeRaw(String)>
		if(_outputTail >= _outputEnd)
	//*  25   42:aload_0         
	//*  26   43:getfield        #56  <Field int _outputTail>
	//*  27   46:aload_0         
	//*  28   47:getfield        #45  <Field int _outputEnd>
	//*  29   50:icmplt          57
			_flushBuffer();
	//   30   53:aload_0         
	//   31   54:invokevirtual   #59  <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//   32   57:aload_0         
	//   33   58:getfield        #43  <Field char[] _outputBuffer>
	//   34   61:astore_1        
		i = _outputTail;
	//   35   62:aload_0         
	//   36   63:getfield        #56  <Field int _outputTail>
	//   37   66:istore_2        
		_outputTail = i + 1;
	//   38   67:aload_0         
	//   39   68:iload_2         
	//   40   69:iconst_1        
	//   41   70:iadd            
	//   42   71:putfield        #56  <Field int _outputTail>
		s[i] = '"';
	//   43   74:aload_1         
	//   44   75:iload_2         
	//   45   76:bipush          34
	//   46   78:castore         
	//   47   79:return          
	}

	private void _writeQuotedShort(short word0)
		throws IOException
	{
		if(_outputTail + 8 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field int _outputTail>
	//*   2    4:bipush          8
	//*   3    6:iadd            
	//*   4    7:aload_0         
	//*   5    8:getfield        #45  <Field int _outputEnd>
	//*   6   11:icmplt          18
			_flushBuffer();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #59  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//    9   18:aload_0         
	//   10   19:getfield        #43  <Field char[] _outputBuffer>
	//   11   22:astore_3        
		int i = _outputTail;
	//   12   23:aload_0         
	//   13   24:getfield        #56  <Field int _outputTail>
	//   14   27:istore_2        
		_outputTail = i + 1;
	//   15   28:aload_0         
	//   16   29:iload_2         
	//   17   30:iconst_1        
	//   18   31:iadd            
	//   19   32:putfield        #56  <Field int _outputTail>
		ac[i] = '"';
	//   20   35:aload_3         
	//   21   36:iload_2         
	//   22   37:bipush          34
	//   23   39:castore         
		_outputTail = NumberOutput.outputInt(((int) (word0)), _outputBuffer, _outputTail);
	//   24   40:aload_0         
	//   25   41:iload_1         
	//   26   42:aload_0         
	//   27   43:getfield        #43  <Field char[] _outputBuffer>
	//   28   46:aload_0         
	//   29   47:getfield        #56  <Field int _outputTail>
	//   30   50:invokestatic    #140 <Method int NumberOutput.outputInt(int, char[], int)>
	//   31   53:putfield        #56  <Field int _outputTail>
		ac = _outputBuffer;
	//   32   56:aload_0         
	//   33   57:getfield        #43  <Field char[] _outputBuffer>
	//   34   60:astore_3        
		word0 = ((short) (_outputTail));
	//   35   61:aload_0         
	//   36   62:getfield        #56  <Field int _outputTail>
	//   37   65:istore_1        
		_outputTail = word0 + 1;
	//   38   66:aload_0         
	//   39   67:iload_1         
	//   40   68:iconst_1        
	//   41   69:iadd            
	//   42   70:putfield        #56  <Field int _outputTail>
		ac[word0] = '"';
	//   43   73:aload_3         
	//   44   74:iload_1         
	//   45   75:bipush          34
	//   46   77:castore         
	//   47   78:return          
	}

	private void _writeSegment(int i)
		throws IOException
	{
		int j;
		int k;
		int j1;
		int ai[];
		ai = _outputEscapes;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field int[] _outputEscapes>
	//    2    4:astore          7
		j1 = ai.length;
	//    3    6:aload           7
	//    4    8:arraylength     
	//    5    9:istore          6
		j = 0;
	//    6   11:iconst_0        
	//    7   12:istore_3        
		k = 0;
	//    8   13:iconst_0        
	//    9   14:istore          4
_L8:
		if(j >= i) goto _L2; else goto _L1
	//   10   16:iload_3         
	//   11   17:iload_1         
	//   12   18:icmpge          72
_L1:
		char c = _outputBuffer[j];
	//   13   21:aload_0         
	//   14   22:getfield        #43  <Field char[] _outputBuffer>
	//   15   25:iload_3         
	//   16   26:caload          
	//   17   27:istore_2        
		if(c >= j1 || ai[c] == 0) goto _L4; else goto _L3
	//   18   28:iload_2         
	//   19   29:iload           6
	//   20   31:icmpge          73
	//   21   34:aload           7
	//   22   36:iload_2         
	//   23   37:iaload          
	//   24   38:ifeq            73
_L3:
		int l = j - k;
	//   25   41:iload_3         
	//   26   42:iload           4
	//   27   44:isub            
	//   28   45:istore          5
		if(l <= 0)
			break MISSING_BLOCK_LABEL_93;
	//   29   47:iload           5
	//   30   49:ifle            93
		_writer.write(_outputBuffer, k, l);
	//   31   52:aload_0         
	//   32   53:getfield        #36  <Field Writer _writer>
	//   33   56:aload_0         
	//   34   57:getfield        #43  <Field char[] _outputBuffer>
	//   35   60:iload           4
	//   36   62:iload           5
	//   37   64:invokevirtual   #101 <Method void Writer.write(char[], int, int)>
		if(j < i)
			break MISSING_BLOCK_LABEL_93;
	//   38   67:iload_3         
	//   39   68:iload_1         
	//   40   69:icmplt          93
_L2:
		return;
	//   41   72:return          
_L4:
		int i1 = j + 1;
	//   42   73:iload_3         
	//   43   74:iconst_1        
	//   44   75:iadd            
	//   45   76:istore          5
		j = i1;
	//   46   78:iload           5
	//   47   80:istore_3        
		if(i1 < i)
			break; /* Loop/switch isn't completed */
	//   48   81:iload           5
	//   49   83:iload_1         
	//   50   84:icmplt          21
		j = i1;
	//   51   87:iload           5
	//   52   89:istore_3        
		if(true) goto _L3; else goto _L5
	//   53   90:goto            41
_L5:
		if(true) goto _L1; else goto _L6
_L6:
		j++;
	//   54   93:iload_3         
	//   55   94:iconst_1        
	//   56   95:iadd            
	//   57   96:istore_3        
		k = _prependOrWriteCharacterEscape(_outputBuffer, j, i, c, ai[c]);
	//   58   97:aload_0         
	//   59   98:aload_0         
	//   60   99:getfield        #43  <Field char[] _outputBuffer>
	//   61  102:iload_3         
	//   62  103:iload_1         
	//   63  104:iload_2         
	//   64  105:aload           7
	//   65  107:iload_2         
	//   66  108:iaload          
	//   67  109:invokespecial   #158 <Method int _prependOrWriteCharacterEscape(char[], int, int, char, int)>
	//   68  112:istore          4
		if(true) goto _L8; else goto _L7
	//   69  114:goto            16
_L7:
	}

	private void _writeSegmentASCII(int i, int j)
		throws IOException, JsonGenerationException
	{
		int k;
		int l;
		int i1;
		int l1;
		int ai[];
		ai = _outputEscapes;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field int[] _outputEscapes>
	//    2    4:astore          10
		l1 = Math.min(ai.length, j + 1);
	//    3    6:aload           10
	//    4    8:arraylength     
	//    5    9:iload_2         
	//    6   10:iconst_1        
	//    7   11:iadd            
	//    8   12:invokestatic    #111 <Method int Math.min(int, int)>
	//    9   15:istore          9
		l = 0;
	//   10   17:iconst_0        
	//   11   18:istore          5
		k = 0;
	//   12   20:iconst_0        
	//   13   21:istore          4
		i1 = 0;
	//   14   23:iconst_0        
	//   15   24:istore          6
_L12:
		if(l >= i) goto _L2; else goto _L1
	//   16   26:iload           5
	//   17   28:iload_1         
	//   18   29:icmpge          102
_L1:
		int j1 = k;
	//   19   32:iload           4
	//   20   34:istore          7
_L10:
		char c = _outputBuffer[l];
	//   21   36:aload_0         
	//   22   37:getfield        #43  <Field char[] _outputBuffer>
	//   23   40:iload           5
	//   24   42:caload          
	//   25   43:istore_3        
		if(c >= l1) goto _L4; else goto _L3
	//   26   44:iload_3         
	//   27   45:iload           9
	//   28   47:icmpge          103
_L3:
		j1 = ai[c];
	//   29   50:aload           10
	//   30   52:iload_3         
	//   31   53:iaload          
	//   32   54:istore          7
		k = j1;
	//   33   56:iload           7
	//   34   58:istore          4
		if(j1 == 0) goto _L6; else goto _L5
	//   35   60:iload           7
	//   36   62:ifeq            118
_L5:
		k = j1;
	//   37   65:iload           7
	//   38   67:istore          4
_L8:
		j1 = l - i1;
	//   39   69:iload           5
	//   40   71:iload           6
	//   41   73:isub            
	//   42   74:istore          7
		if(j1 <= 0)
			break MISSING_BLOCK_LABEL_145;
	//   43   76:iload           7
	//   44   78:ifle            145
		_writer.write(_outputBuffer, i1, j1);
	//   45   81:aload_0         
	//   46   82:getfield        #36  <Field Writer _writer>
	//   47   85:aload_0         
	//   48   86:getfield        #43  <Field char[] _outputBuffer>
	//   49   89:iload           6
	//   50   91:iload           7
	//   51   93:invokevirtual   #101 <Method void Writer.write(char[], int, int)>
		if(l < i)
			break MISSING_BLOCK_LABEL_145;
	//   52   96:iload           5
	//   53   98:iload_1         
	//   54   99:icmplt          145
_L2:
		return;
	//   55  102:return          
_L4:
		k = j1;
	//   56  103:iload           7
	//   57  105:istore          4
		if(c > j)
	//*  58  107:iload_3         
	//*  59  108:iload_2         
	//*  60  109:icmple          118
		{
			k = -1;
	//   61  112:iconst_m1       
	//   62  113:istore          4
			continue; /* Loop/switch isn't completed */
	//   63  115:goto            69
		}
_L6:
		int k1 = l + 1;
	//   64  118:iload           5
	//   65  120:iconst_1        
	//   66  121:iadd            
	//   67  122:istore          8
		l = k1;
	//   68  124:iload           8
	//   69  126:istore          5
		j1 = k;
	//   70  128:iload           4
	//   71  130:istore          7
		if(k1 < i)
			break; /* Loop/switch isn't completed */
	//   72  132:iload           8
	//   73  134:iload_1         
	//   74  135:icmplt          36
		l = k1;
	//   75  138:iload           8
	//   76  140:istore          5
		if(true) goto _L8; else goto _L7
	//   77  142:goto            69
_L7:
		if(true) goto _L10; else goto _L9
_L9:
		l++;
	//   78  145:iload           5
	//   79  147:iconst_1        
	//   80  148:iadd            
	//   81  149:istore          5
		i1 = _prependOrWriteCharacterEscape(_outputBuffer, l, i, c, k);
	//   82  151:aload_0         
	//   83  152:aload_0         
	//   84  153:getfield        #43  <Field char[] _outputBuffer>
	//   85  156:iload           5
	//   86  158:iload_1         
	//   87  159:iload_3         
	//   88  160:iload           4
	//   89  162:invokespecial   #158 <Method int _prependOrWriteCharacterEscape(char[], int, int, char, int)>
	//   90  165:istore          6
		if(true) goto _L12; else goto _L11
	//   91  167:goto            26
_L11:
	}

	private void _writeSegmentCustom(int i)
		throws IOException, JsonGenerationException
	{
		char c;
		int j;
		int k;
		int l;
		int i1;
		int j1;
		CharacterEscapes characterescapes;
		int ai[] = _outputEscapes;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field int[] _outputEscapes>
	//    2    4:astore          10
		int l1;
		if(_maximumNonEscapedChar < 1)
	//*   3    6:aload_0         
	//*   4    7:getfield        #125 <Field int _maximumNonEscapedChar>
	//*   5   10:iconst_1        
	//*   6   11:icmpge          118
			l = 65535;
	//    7   14:ldc1            #159 <Int 65535>
	//    8   16:istore          5
		else
	//*   9   18:aload           10
	//*  10   20:arraylength     
	//*  11   21:iload           5
	//*  12   23:iconst_1        
	//*  13   24:iadd            
	//*  14   25:invokestatic    #111 <Method int Math.min(int, int)>
	//*  15   28:istore          9
	//*  16   30:aload_0         
	//*  17   31:getfield        #65  <Field CharacterEscapes _characterEscapes>
	//*  18   34:astore          11
	//*  19   36:iconst_0        
	//*  20   37:istore          4
	//*  21   39:iconst_0        
	//*  22   40:istore_3        
	//*  23   41:iconst_0        
	//*  24   42:istore          6
	//*  25   44:iload           4
	//*  26   46:iload_1         
	//*  27   47:icmpge          117
	//*  28   50:iload_3         
	//*  29   51:istore          7
	//*  30   53:aload_0         
	//*  31   54:getfield        #43  <Field char[] _outputBuffer>
	//*  32   57:iload           4
	//*  33   59:caload          
	//*  34   60:istore_2        
	//*  35   61:iload_2         
	//*  36   62:iload           9
	//*  37   64:icmpge          127
	//*  38   67:aload           10
	//*  39   69:iload_2         
	//*  40   70:iaload          
	//*  41   71:istore          7
	//*  42   73:iload           7
	//*  43   75:istore_3        
	//*  44   76:iload           7
	//*  45   78:ifeq            166
	//*  46   81:iload           7
	//*  47   83:istore_3        
	//*  48   84:iload           4
	//*  49   86:iload           6
	//*  50   88:isub            
	//*  51   89:istore          7
	//*  52   91:iload           7
	//*  53   93:ifle            192
	//*  54   96:aload_0         
	//*  55   97:getfield        #36  <Field Writer _writer>
	//*  56  100:aload_0         
	//*  57  101:getfield        #43  <Field char[] _outputBuffer>
	//*  58  104:iload           6
	//*  59  106:iload           7
	//*  60  108:invokevirtual   #101 <Method void Writer.write(char[], int, int)>
	//*  61  111:iload           4
	//*  62  113:iload_1         
	//*  63  114:icmplt          192
	//*  64  117:return          
			l = _maximumNonEscapedChar;
	//   65  118:aload_0         
	//   66  119:getfield        #125 <Field int _maximumNonEscapedChar>
	//   67  122:istore          5
		l1 = Math.min(ai.length, l + 1);
		characterescapes = _characterEscapes;
		k = 0;
		j = 0;
		i1 = 0;
_L12:
		if(k >= i) goto _L2; else goto _L1
_L1:
		j1 = j;
_L10:
		c = _outputBuffer[k];
		if(c >= l1) goto _L4; else goto _L3
_L3:
		j1 = ai[c];
		j = j1;
		if(j1 == 0) goto _L6; else goto _L5
_L5:
		j = j1;
_L8:
		j1 = k - i1;
		if(j1 <= 0)
			break MISSING_BLOCK_LABEL_192;
		_writer.write(_outputBuffer, i1, j1);
		if(k < i)
			break MISSING_BLOCK_LABEL_192;
_L2:
		return;
	//*  68  124:goto            18
_L4:
		if(c > l)
	//*  69  127:iload_2         
	//*  70  128:iload           5
	//*  71  130:icmple          138
		{
			j = -1;
	//   72  133:iconst_m1       
	//   73  134:istore_3        
			continue; /* Loop/switch isn't completed */
	//   74  135:goto            84
		}
		SerializableString serializablestring = characterescapes.getEscapeSequence(((int) (c)));
	//   75  138:aload           11
	//   76  140:iload_2         
	//   77  141:invokevirtual   #71  <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//   78  144:astore          12
		_currentEscape = serializablestring;
	//   79  146:aload_0         
	//   80  147:aload           12
	//   81  149:putfield        #61  <Field SerializableString _currentEscape>
		j = j1;
	//   82  152:iload           7
	//   83  154:istore_3        
		if(serializablestring != null)
	//*  84  155:aload           12
	//*  85  157:ifnull          166
		{
			j = -2;
	//   86  160:bipush          -2
	//   87  162:istore_3        
			continue; /* Loop/switch isn't completed */
	//   88  163:goto            84
		}
_L6:
		int k1 = k + 1;
	//   89  166:iload           4
	//   90  168:iconst_1        
	//   91  169:iadd            
	//   92  170:istore          8
		k = k1;
	//   93  172:iload           8
	//   94  174:istore          4
		j1 = j;
	//   95  176:iload_3         
	//   96  177:istore          7
		if(k1 < i)
			break; /* Loop/switch isn't completed */
	//   97  179:iload           8
	//   98  181:iload_1         
	//   99  182:icmplt          53
		k = k1;
	//  100  185:iload           8
	//  101  187:istore          4
		if(true) goto _L8; else goto _L7
	//  102  189:goto            84
_L7:
		if(true) goto _L10; else goto _L9
_L9:
		k++;
	//  103  192:iload           4
	//  104  194:iconst_1        
	//  105  195:iadd            
	//  106  196:istore          4
		i1 = _prependOrWriteCharacterEscape(_outputBuffer, k, i, c, j);
	//  107  198:aload_0         
	//  108  199:aload_0         
	//  109  200:getfield        #43  <Field char[] _outputBuffer>
	//  110  203:iload           4
	//  111  205:iload_1         
	//  112  206:iload_2         
	//  113  207:iload_3         
	//  114  208:invokespecial   #158 <Method int _prependOrWriteCharacterEscape(char[], int, int, char, int)>
	//  115  211:istore          6
		if(true) goto _L12; else goto _L11
	//  116  213:goto            44
_L11:
	}

	private void _writeString(String s)
		throws IOException
	{
		int i = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #83  <Method int String.length()>
	//    2    4:istore_2        
		if(i > _outputEnd)
	//*   3    5:iload_2         
	//*   4    6:aload_0         
	//*   5    7:getfield        #45  <Field int _outputEnd>
	//*   6   10:icmple          19
		{
			_writeLongString(s);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #162 <Method void _writeLongString(String)>
			return;
	//   10   18:return          
		}
		if(_outputTail + i > _outputEnd)
	//*  11   19:aload_0         
	//*  12   20:getfield        #56  <Field int _outputTail>
	//*  13   23:iload_2         
	//*  14   24:iadd            
	//*  15   25:aload_0         
	//*  16   26:getfield        #45  <Field int _outputEnd>
	//*  17   29:icmple          36
			_flushBuffer();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #59  <Method void _flushBuffer()>
		s.getChars(0, i, _outputBuffer, _outputTail);
	//   20   36:aload_1         
	//   21   37:iconst_0        
	//   22   38:iload_2         
	//   23   39:aload_0         
	//   24   40:getfield        #43  <Field char[] _outputBuffer>
	//   25   43:aload_0         
	//   26   44:getfield        #56  <Field int _outputTail>
	//   27   47:invokevirtual   #93  <Method void String.getChars(int, int, char[], int)>
		if(_characterEscapes != null)
	//*  28   50:aload_0         
	//*  29   51:getfield        #65  <Field CharacterEscapes _characterEscapes>
	//*  30   54:ifnull          63
		{
			_writeStringCustom(i);
	//   31   57:aload_0         
	//   32   58:iload_2         
	//   33   59:invokespecial   #165 <Method void _writeStringCustom(int)>
			return;
	//   34   62:return          
		}
		if(_maximumNonEscapedChar != 0)
	//*  35   63:aload_0         
	//*  36   64:getfield        #125 <Field int _maximumNonEscapedChar>
	//*  37   67:ifeq            80
		{
			_writeStringASCII(i, _maximumNonEscapedChar);
	//   38   70:aload_0         
	//   39   71:iload_2         
	//   40   72:aload_0         
	//   41   73:getfield        #125 <Field int _maximumNonEscapedChar>
	//   42   76:invokespecial   #168 <Method void _writeStringASCII(int, int)>
			return;
	//   43   79:return          
		} else
		{
			_writeString2(i);
	//   44   80:aload_0         
	//   45   81:iload_2         
	//   46   82:invokespecial   #171 <Method void _writeString2(int)>
			return;
	//   47   85:return          
		}
	}

	private void _writeString(char ac[], int i, int j)
		throws IOException
	{
		if(_characterEscapes == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field CharacterEscapes _characterEscapes>
	//    2    4:ifnull          15
_L1:
		_writeStringCustom(ac, i, j);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokespecial   #173 <Method void _writeStringCustom(char[], int, int)>
_L10:
		return;
	//    8   14:return          
_L2:
		int l;
		int i1;
		int ai[];
		if(_maximumNonEscapedChar != 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #125 <Field int _maximumNonEscapedChar>
	//*  11   19:ifeq            34
		{
			_writeStringASCII(ac, i, j, _maximumNonEscapedChar);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:iload_2         
	//   15   25:iload_3         
	//   16   26:aload_0         
	//   17   27:getfield        #125 <Field int _maximumNonEscapedChar>
	//   18   30:invokespecial   #176 <Method void _writeStringASCII(char[], int, int, int)>
			return;
	//   19   33:return          
		}
		l = j + i;
	//   20   34:iload_3         
	//   21   35:iload_2         
	//   22   36:iadd            
	//   23   37:istore          6
		ai = _outputEscapes;
	//   24   39:aload_0         
	//   25   40:getfield        #156 <Field int[] _outputEscapes>
	//   26   43:astore          8
		i1 = ai.length;
	//   27   45:aload           8
	//   28   47:arraylength     
	//   29   48:istore          7
_L8:
		if(i >= l)
			continue; /* Loop/switch isn't completed */
	//   30   50:iload_2         
	//   31   51:iload           6
	//   32   53:icmpge          14
		j = i;
	//   33   56:iload_2         
	//   34   57:istore_3        
_L6:
		char c1 = ac[j];
	//   35   58:aload_1         
	//   36   59:iload_3         
	//   37   60:caload          
	//   38   61:istore          5
		if(c1 >= i1 || ai[c1] == 0) goto _L4; else goto _L3
	//   39   63:iload           5
	//   40   65:iload           7
	//   41   67:icmpge          146
	//   42   70:aload           8
	//   43   72:iload           5
	//   44   74:iaload          
	//   45   75:ifeq            146
_L3:
		int k = j - i;
	//   46   78:iload_3         
	//   47   79:iload_2         
	//   48   80:isub            
	//   49   81:istore          5
		if(k < 32)
	//*  50   83:iload           5
	//*  51   85:bipush          32
	//*  52   87:icmpge          167
		{
			if(_outputTail + k > _outputEnd)
	//*  53   90:aload_0         
	//*  54   91:getfield        #56  <Field int _outputTail>
	//*  55   94:iload           5
	//*  56   96:iadd            
	//*  57   97:aload_0         
	//*  58   98:getfield        #45  <Field int _outputEnd>
	//*  59  101:icmple          108
				_flushBuffer();
	//   60  104:aload_0         
	//   61  105:invokevirtual   #59  <Method void _flushBuffer()>
			if(k > 0)
	//*  62  108:iload           5
	//*  63  110:ifle            139
			{
				System.arraycopy(((Object) (ac)), i, ((Object) (_outputBuffer)), _outputTail, k);
	//   64  113:aload_1         
	//   65  114:iload_2         
	//   66  115:aload_0         
	//   67  116:getfield        #43  <Field char[] _outputBuffer>
	//   68  119:aload_0         
	//   69  120:getfield        #56  <Field int _outputTail>
	//   70  123:iload           5
	//   71  125:invokestatic    #182 <Method void System.arraycopy(Object, int, Object, int, int)>
				_outputTail = _outputTail + k;
	//   72  128:aload_0         
	//   73  129:aload_0         
	//   74  130:getfield        #56  <Field int _outputTail>
	//   75  133:iload           5
	//   76  135:iadd            
	//   77  136:putfield        #56  <Field int _outputTail>
			}
		} else
	//*  78  139:iload_3         
	//*  79  140:iload           6
	//*  80  142:icmplt          185
	//*  81  145:return          
	//*  82  146:iload_3         
	//*  83  147:iconst_1        
	//*  84  148:iadd            
	//*  85  149:istore          5
	//*  86  151:iload           5
	//*  87  153:istore_3        
	//*  88  154:iload           5
	//*  89  156:iload           6
	//*  90  158:icmplt          58
	//*  91  161:iload           5
	//*  92  163:istore_3        
	//*  93  164:goto            78
		{
			_flushBuffer();
	//   94  167:aload_0         
	//   95  168:invokevirtual   #59  <Method void _flushBuffer()>
			_writer.write(ac, i, k);
	//   96  171:aload_0         
	//   97  172:getfield        #36  <Field Writer _writer>
	//   98  175:aload_1         
	//   99  176:iload_2         
	//  100  177:iload           5
	//  101  179:invokevirtual   #101 <Method void Writer.write(char[], int, int)>
		}
		if(j >= l)
			return;
		break MISSING_BLOCK_LABEL_185;
	//  102  182:goto            139
_L4:
		k = j + 1;
		j = k;
		if(k < l) goto _L6; else goto _L5
_L5:
		j = k;
		  goto _L3
		i = j + 1;
	//  103  185:iload_3         
	//  104  186:iconst_1        
	//  105  187:iadd            
	//  106  188:istore_2        
		char c = ac[j];
	//  107  189:aload_1         
	//  108  190:iload_3         
	//  109  191:caload          
	//  110  192:istore          4
		_appendCharacterEscape(c, ai[c]);
	//  111  194:aload_0         
	//  112  195:iload           4
	//  113  197:aload           8
	//  114  199:iload           4
	//  115  201:iaload          
	//  116  202:invokespecial   #184 <Method void _appendCharacterEscape(char, int)>
		if(true) goto _L8; else goto _L7
	//  117  205:goto            50
_L7:
		if(true) goto _L10; else goto _L9
_L9:
	}

	private void _writeString2(int i)
		throws IOException
	{
		i = _outputTail + i;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int _outputTail>
	//    2    4:iload_1         
	//    3    5:iadd            
	//    4    6:istore_1        
		int ai[] = _outputEscapes;
	//    5    7:aload_0         
	//    6    8:getfield        #156 <Field int[] _outputEscapes>
	//    7   11:astore          5
		int j = ai.length;
	//    8   13:aload           5
	//    9   15:arraylength     
	//   10   16:istore_3        
label0:
		do
		{
			int k;
			if(_outputTail < i)
	//*  11   17:aload_0         
	//*  12   18:getfield        #56  <Field int _outputTail>
	//*  13   21:iload_1         
	//*  14   22:icmpge          141
				do
				{
					k = ((int) (_outputBuffer[_outputTail]));
	//   15   25:aload_0         
	//   16   26:getfield        #43  <Field char[] _outputBuffer>
	//   17   29:aload_0         
	//   18   30:getfield        #56  <Field int _outputTail>
	//   19   33:caload          
	//   20   34:istore          4
					if(k < j && ai[k] != 0)
	//*  21   36:iload           4
	//*  22   38:iload_3         
	//*  23   39:icmpge          121
	//*  24   42:aload           5
	//*  25   44:iload           4
	//*  26   46:iaload          
	//*  27   47:ifeq            121
					{
						k = _outputTail - _outputHead;
	//   28   50:aload_0         
	//   29   51:getfield        #56  <Field int _outputTail>
	//   30   54:aload_0         
	//   31   55:getfield        #103 <Field int _outputHead>
	//   32   58:isub            
	//   33   59:istore          4
						if(k > 0)
	//*  34   61:iload           4
	//*  35   63:ifle            83
							_writer.write(_outputBuffer, _outputHead, k);
	//   36   66:aload_0         
	//   37   67:getfield        #36  <Field Writer _writer>
	//   38   70:aload_0         
	//   39   71:getfield        #43  <Field char[] _outputBuffer>
	//   40   74:aload_0         
	//   41   75:getfield        #103 <Field int _outputHead>
	//   42   78:iload           4
	//   43   80:invokevirtual   #101 <Method void Writer.write(char[], int, int)>
						char ac[] = _outputBuffer;
	//   44   83:aload_0         
	//   45   84:getfield        #43  <Field char[] _outputBuffer>
	//   46   87:astore          6
						k = _outputTail;
	//   47   89:aload_0         
	//   48   90:getfield        #56  <Field int _outputTail>
	//   49   93:istore          4
						_outputTail = k + 1;
	//   50   95:aload_0         
	//   51   96:iload           4
	//   52   98:iconst_1        
	//   53   99:iadd            
	//   54  100:putfield        #56  <Field int _outputTail>
						char c = ac[k];
	//   55  103:aload           6
	//   56  105:iload           4
	//   57  107:caload          
	//   58  108:istore_2        
						_prependOrWriteCharacterEscape(c, ai[c]);
	//   59  109:aload_0         
	//   60  110:iload_2         
	//   61  111:aload           5
	//   62  113:iload_2         
	//   63  114:iaload          
	//   64  115:invokespecial   #186 <Method void _prependOrWriteCharacterEscape(char, int)>
						continue label0;
	//   65  118:goto            17
					}
					k = _outputTail + 1;
	//   66  121:aload_0         
	//   67  122:getfield        #56  <Field int _outputTail>
	//   68  125:iconst_1        
	//   69  126:iadd            
	//   70  127:istore          4
					_outputTail = k;
	//   71  129:aload_0         
	//   72  130:iload           4
	//   73  132:putfield        #56  <Field int _outputTail>
				} while(k < i);
	//   74  135:iload           4
	//   75  137:iload_1         
	//   76  138:icmplt          25
			return;
	//   77  141:return          
		} while(true);
	}

	private void _writeStringASCII(int i, int j)
		throws IOException, JsonGenerationException
	{
		int k;
		int l;
		int ai[];
		k = _outputTail + i;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int _outputTail>
	//    2    4:iload_1         
	//    3    5:iadd            
	//    4    6:istore          4
		ai = _outputEscapes;
	//    5    8:aload_0         
	//    6    9:getfield        #156 <Field int[] _outputEscapes>
	//    7   12:astore          7
		l = Math.min(ai.length, j + 1);
	//    8   14:aload           7
	//    9   16:arraylength     
	//   10   17:iload_2         
	//   11   18:iconst_1        
	//   12   19:iadd            
	//   13   20:invokestatic    #111 <Method int Math.min(int, int)>
	//   14   23:istore          5
_L8:
		if(_outputTail >= k) goto _L2; else goto _L1
	//   15   25:aload_0         
	//   16   26:getfield        #56  <Field int _outputTail>
	//   17   29:iload           4
	//   18   31:icmpge          139
_L1:
		char c = _outputBuffer[_outputTail];
	//   19   34:aload_0         
	//   20   35:getfield        #43  <Field char[] _outputBuffer>
	//   21   38:aload_0         
	//   22   39:getfield        #56  <Field int _outputTail>
	//   23   42:caload          
	//   24   43:istore_3        
		if(c >= l) goto _L4; else goto _L3
	//   25   44:iload_3         
	//   26   45:iload           5
	//   27   47:icmpge          111
_L3:
		i = ai[c];
	//   28   50:aload           7
	//   29   52:iload_3         
	//   30   53:iaload          
	//   31   54:istore_1        
		if(i == 0) goto _L6; else goto _L5
	//   32   55:iload_1         
	//   33   56:ifeq            121
_L5:
		int i1 = _outputTail - _outputHead;
	//   34   59:aload_0         
	//   35   60:getfield        #56  <Field int _outputTail>
	//   36   63:aload_0         
	//   37   64:getfield        #103 <Field int _outputHead>
	//   38   67:isub            
	//   39   68:istore          6
		if(i1 > 0)
	//*  40   70:iload           6
	//*  41   72:ifle            92
			_writer.write(_outputBuffer, _outputHead, i1);
	//   42   75:aload_0         
	//   43   76:getfield        #36  <Field Writer _writer>
	//   44   79:aload_0         
	//   45   80:getfield        #43  <Field char[] _outputBuffer>
	//   46   83:aload_0         
	//   47   84:getfield        #103 <Field int _outputHead>
	//   48   87:iload           6
	//   49   89:invokevirtual   #101 <Method void Writer.write(char[], int, int)>
		_outputTail = _outputTail + 1;
	//   50   92:aload_0         
	//   51   93:aload_0         
	//   52   94:getfield        #56  <Field int _outputTail>
	//   53   97:iconst_1        
	//   54   98:iadd            
	//   55   99:putfield        #56  <Field int _outputTail>
		_prependOrWriteCharacterEscape(c, i);
	//   56  102:aload_0         
	//   57  103:iload_3         
	//   58  104:iload_1         
	//   59  105:invokespecial   #186 <Method void _prependOrWriteCharacterEscape(char, int)>
		continue; /* Loop/switch isn't completed */
	//   60  108:goto            25
_L4:
		if(c <= j)
			break; /* Loop/switch isn't completed */
	//   61  111:iload_3         
	//   62  112:iload_2         
	//   63  113:icmple          121
		i = -1;
	//   64  116:iconst_m1       
	//   65  117:istore_1        
		if(true) goto _L5; else goto _L6
	//   66  118:goto            59
_L6:
		i = _outputTail + 1;
	//   67  121:aload_0         
	//   68  122:getfield        #56  <Field int _outputTail>
	//   69  125:iconst_1        
	//   70  126:iadd            
	//   71  127:istore_1        
		_outputTail = i;
	//   72  128:aload_0         
	//   73  129:iload_1         
	//   74  130:putfield        #56  <Field int _outputTail>
		if(i < k) goto _L1; else goto _L2
	//   75  133:iload_1         
	//   76  134:iload           4
	//   77  136:icmplt          34
_L2:
		return;
	//   78  139:return          
		if(true) goto _L8; else goto _L7
_L7:
	}

	private void _writeStringASCII(char ac[], int i, int j, int k)
		throws IOException, JsonGenerationException
	{
		int k1;
		int l1;
		int ai[];
		k1 = j + i;
	//    0    0:iload_3         
	//    1    1:iload_2         
	//    2    2:iadd            
	//    3    3:istore          9
		ai = _outputEscapes;
	//    4    5:aload_0         
	//    5    6:getfield        #156 <Field int[] _outputEscapes>
	//    6    9:astore          11
		l1 = Math.min(ai.length, k + 1);
	//    7   11:aload           11
	//    8   13:arraylength     
	//    9   14:iload           4
	//   10   16:iconst_1        
	//   11   17:iadd            
	//   12   18:invokestatic    #111 <Method int Math.min(int, int)>
	//   13   21:istore          10
		boolean flag = false;
	//   14   23:iconst_0        
	//   15   24:istore          6
		j = i;
	//   16   26:iload_2         
	//   17   27:istore_3        
		i = ((int) (flag));
	//   18   28:iload           6
	//   19   30:istore_2        
_L12:
		if(j >= k1) goto _L2; else goto _L1
	//   20   31:iload_3         
	//   21   32:iload           9
	//   22   34:icmpge          143
_L1:
		int l;
		int i1;
		l = j;
	//   23   37:iload_3         
	//   24   38:istore          6
		i1 = i;
	//   25   40:iload_2         
	//   26   41:istore          7
_L10:
		char c = ac[l];
	//   27   43:aload_1         
	//   28   44:iload           6
	//   29   46:caload          
	//   30   47:istore          5
		if(c >= l1) goto _L4; else goto _L3
	//   31   49:iload           5
	//   32   51:iload           10
	//   33   53:icmpge          144
_L3:
		i1 = ai[c];
	//   34   56:aload           11
	//   35   58:iload           5
	//   36   60:iaload          
	//   37   61:istore          7
		i = i1;
	//   38   63:iload           7
	//   39   65:istore_2        
		if(i1 == 0) goto _L6; else goto _L5
	//   40   66:iload           7
	//   41   68:ifeq            159
_L5:
		i = i1;
	//   42   71:iload           7
	//   43   73:istore_2        
_L8:
		i1 = l - j;
	//   44   74:iload           6
	//   45   76:iload_3         
	//   46   77:isub            
	//   47   78:istore          7
		int j1;
		if(i1 < 32)
	//*  48   80:iload           7
	//*  49   82:bipush          32
	//*  50   84:icmpge          186
		{
			if(_outputTail + i1 > _outputEnd)
	//*  51   87:aload_0         
	//*  52   88:getfield        #56  <Field int _outputTail>
	//*  53   91:iload           7
	//*  54   93:iadd            
	//*  55   94:aload_0         
	//*  56   95:getfield        #45  <Field int _outputEnd>
	//*  57   98:icmple          105
				_flushBuffer();
	//   58  101:aload_0         
	//   59  102:invokevirtual   #59  <Method void _flushBuffer()>
			if(i1 > 0)
	//*  60  105:iload           7
	//*  61  107:ifle            136
			{
				System.arraycopy(((Object) (ac)), j, ((Object) (_outputBuffer)), _outputTail, i1);
	//   62  110:aload_1         
	//   63  111:iload_3         
	//   64  112:aload_0         
	//   65  113:getfield        #43  <Field char[] _outputBuffer>
	//   66  116:aload_0         
	//   67  117:getfield        #56  <Field int _outputTail>
	//   68  120:iload           7
	//   69  122:invokestatic    #182 <Method void System.arraycopy(Object, int, Object, int, int)>
				_outputTail = _outputTail + i1;
	//   70  125:aload_0         
	//   71  126:aload_0         
	//   72  127:getfield        #56  <Field int _outputTail>
	//   73  130:iload           7
	//   74  132:iadd            
	//   75  133:putfield        #56  <Field int _outputTail>
			}
		} else
	//*  76  136:iload           6
	//*  77  138:iload           9
	//*  78  140:icmplt          204
	//*  79  143:return          
	//*  80  144:iload           7
	//*  81  146:istore_2        
	//*  82  147:iload           5
	//*  83  149:iload           4
	//*  84  151:icmple          159
	//*  85  154:iconst_m1       
	//*  86  155:istore_2        
	//*  87  156:goto            74
	//*  88  159:iload           6
	//*  89  161:iconst_1        
	//*  90  162:iadd            
	//*  91  163:istore          8
	//*  92  165:iload_2         
	//*  93  166:istore          7
	//*  94  168:iload           8
	//*  95  170:istore          6
	//*  96  172:iload           8
	//*  97  174:iload           9
	//*  98  176:icmplt          43
	//*  99  179:iload           8
	//* 100  181:istore          6
	//* 101  183:goto            74
		{
			_flushBuffer();
	//  102  186:aload_0         
	//  103  187:invokevirtual   #59  <Method void _flushBuffer()>
			_writer.write(ac, j, i1);
	//  104  190:aload_0         
	//  105  191:getfield        #36  <Field Writer _writer>
	//  106  194:aload_1         
	//  107  195:iload_3         
	//  108  196:iload           7
	//  109  198:invokevirtual   #101 <Method void Writer.write(char[], int, int)>
		}
		if(l < k1)
			break MISSING_BLOCK_LABEL_204;
_L2:
		return;
_L4:
		i = i1;
		if(c <= k) goto _L6; else goto _L7
_L7:
		i = -1;
		  goto _L8
_L6:
		j1 = l + 1;
		i1 = i;
		l = j1;
		if(j1 < k1) goto _L10; else goto _L9
_L9:
		l = j1;
		  goto _L8
	//* 110  201:goto            136
		j = l + 1;
	//  111  204:iload           6
	//  112  206:iconst_1        
	//  113  207:iadd            
	//  114  208:istore_3        
		_appendCharacterEscape(c, i);
	//  115  209:aload_0         
	//  116  210:iload           5
	//  117  212:iload_2         
	//  118  213:invokespecial   #184 <Method void _appendCharacterEscape(char, int)>
		if(true) goto _L12; else goto _L11
	//  119  216:goto            31
_L11:
	}

	private void _writeStringCustom(int i)
		throws IOException, JsonGenerationException
	{
		char c;
		int j;
		int k;
		CharacterEscapes characterescapes;
		k = _outputTail + i;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int _outputTail>
	//    2    4:iload_1         
	//    3    5:iadd            
	//    4    6:istore          4
		int ai[] = _outputEscapes;
	//    5    8:aload_0         
	//    6    9:getfield        #156 <Field int[] _outputEscapes>
	//    7   12:astore          7
		int l;
		int i1;
		if(_maximumNonEscapedChar < 1)
	//*   8   14:aload_0         
	//*   9   15:getfield        #125 <Field int _maximumNonEscapedChar>
	//*  10   18:iconst_1        
	//*  11   19:icmpge          128
			j = 65535;
	//   12   22:ldc1            #159 <Int 65535>
	//   13   24:istore_3        
		else
	//*  14   25:aload           7
	//*  15   27:arraylength     
	//*  16   28:iload_3         
	//*  17   29:iconst_1        
	//*  18   30:iadd            
	//*  19   31:invokestatic    #111 <Method int Math.min(int, int)>
	//*  20   34:istore          5
	//*  21   36:aload_0         
	//*  22   37:getfield        #65  <Field CharacterEscapes _characterEscapes>
	//*  23   40:astore          8
	//*  24   42:aload_0         
	//*  25   43:getfield        #56  <Field int _outputTail>
	//*  26   46:iload           4
	//*  27   48:icmpge          189
	//*  28   51:aload_0         
	//*  29   52:getfield        #43  <Field char[] _outputBuffer>
	//*  30   55:aload_0         
	//*  31   56:getfield        #56  <Field int _outputTail>
	//*  32   59:caload          
	//*  33   60:istore_2        
	//*  34   61:iload_2         
	//*  35   62:iload           5
	//*  36   64:icmpge          136
	//*  37   67:aload           7
	//*  38   69:iload_2         
	//*  39   70:iaload          
	//*  40   71:istore_1        
	//*  41   72:iload_1         
	//*  42   73:ifeq            171
	//*  43   76:aload_0         
	//*  44   77:getfield        #56  <Field int _outputTail>
	//*  45   80:aload_0         
	//*  46   81:getfield        #103 <Field int _outputHead>
	//*  47   84:isub            
	//*  48   85:istore          6
	//*  49   87:iload           6
	//*  50   89:ifle            109
	//*  51   92:aload_0         
	//*  52   93:getfield        #36  <Field Writer _writer>
	//*  53   96:aload_0         
	//*  54   97:getfield        #43  <Field char[] _outputBuffer>
	//*  55  100:aload_0         
	//*  56  101:getfield        #103 <Field int _outputHead>
	//*  57  104:iload           6
	//*  58  106:invokevirtual   #101 <Method void Writer.write(char[], int, int)>
	//*  59  109:aload_0         
	//*  60  110:aload_0         
	//*  61  111:getfield        #56  <Field int _outputTail>
	//*  62  114:iconst_1        
	//*  63  115:iadd            
	//*  64  116:putfield        #56  <Field int _outputTail>
	//*  65  119:aload_0         
	//*  66  120:iload_2         
	//*  67  121:iload_1         
	//*  68  122:invokespecial   #186 <Method void _prependOrWriteCharacterEscape(char, int)>
	//*  69  125:goto            42
			j = _maximumNonEscapedChar;
	//   70  128:aload_0         
	//   71  129:getfield        #125 <Field int _maximumNonEscapedChar>
	//   72  132:istore_3        
		l = Math.min(ai.length, j + 1);
		characterescapes = _characterEscapes;
_L8:
		if(_outputTail >= k) goto _L2; else goto _L1
_L1:
		c = _outputBuffer[_outputTail];
		if(c >= l) goto _L4; else goto _L3
_L3:
		i = ai[c];
		if(i == 0) goto _L6; else goto _L5
_L5:
		i1 = _outputTail - _outputHead;
		if(i1 > 0)
			_writer.write(_outputBuffer, _outputHead, i1);
		_outputTail = _outputTail + 1;
		_prependOrWriteCharacterEscape(c, i);
		continue; /* Loop/switch isn't completed */
	//*  73  133:goto            25
_L4:
		if(c > j)
	//*  74  136:iload_2         
	//*  75  137:iload_3         
	//*  76  138:icmple          146
		{
			i = -1;
	//   77  141:iconst_m1       
	//   78  142:istore_1        
			continue; /* Loop/switch isn't completed */
	//   79  143:goto            76
		}
		SerializableString serializablestring = characterescapes.getEscapeSequence(((int) (c)));
	//   80  146:aload           8
	//   81  148:iload_2         
	//   82  149:invokevirtual   #71  <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//   83  152:astore          9
		_currentEscape = serializablestring;
	//   84  154:aload_0         
	//   85  155:aload           9
	//   86  157:putfield        #61  <Field SerializableString _currentEscape>
		if(serializablestring == null)
			break; /* Loop/switch isn't completed */
	//   87  160:aload           9
	//   88  162:ifnull          171
		i = -2;
	//   89  165:bipush          -2
	//   90  167:istore_1        
		if(true) goto _L5; else goto _L6
	//   91  168:goto            76
_L6:
		i = _outputTail + 1;
	//   92  171:aload_0         
	//   93  172:getfield        #56  <Field int _outputTail>
	//   94  175:iconst_1        
	//   95  176:iadd            
	//   96  177:istore_1        
		_outputTail = i;
	//   97  178:aload_0         
	//   98  179:iload_1         
	//   99  180:putfield        #56  <Field int _outputTail>
		if(i < k) goto _L1; else goto _L2
	//  100  183:iload_1         
	//  101  184:iload           4
	//  102  186:icmplt          51
_L2:
		return;
	//  103  189:return          
		if(true) goto _L8; else goto _L7
_L7:
	}

	private void _writeStringCustom(char ac[], int i, int j)
		throws IOException, JsonGenerationException
	{
		char c;
		int k;
		int l;
		int i1;
		int k1;
		CharacterEscapes characterescapes;
		k1 = j + i;
	//    0    0:iload_3         
	//    1    1:iload_2         
	//    2    2:iadd            
	//    3    3:istore          9
		int ai[] = _outputEscapes;
	//    4    5:aload_0         
	//    5    6:getfield        #156 <Field int[] _outputEscapes>
	//    6    9:astore          11
		int l1;
		if(_maximumNonEscapedChar < 1)
	//*   7   11:aload_0         
	//*   8   12:getfield        #125 <Field int _maximumNonEscapedChar>
	//*   9   15:iconst_1        
	//*  10   16:icmpge          162
			l = 65535;
	//   11   19:ldc1            #159 <Int 65535>
	//   12   21:istore          6
		else
	//*  13   23:aload           11
	//*  14   25:arraylength     
	//*  15   26:iload           6
	//*  16   28:iconst_1        
	//*  17   29:iadd            
	//*  18   30:invokestatic    #111 <Method int Math.min(int, int)>
	//*  19   33:istore          10
	//*  20   35:aload_0         
	//*  21   36:getfield        #65  <Field CharacterEscapes _characterEscapes>
	//*  22   39:astore          12
	//*  23   41:iconst_0        
	//*  24   42:istore          5
	//*  25   44:iload_2         
	//*  26   45:istore_3        
	//*  27   46:iload           5
	//*  28   48:istore_2        
	//*  29   49:iload_3         
	//*  30   50:iload           9
	//*  31   52:icmpge          161
	//*  32   55:iload_3         
	//*  33   56:istore          5
	//*  34   58:iload_2         
	//*  35   59:istore          7
	//*  36   61:aload_1         
	//*  37   62:iload           5
	//*  38   64:caload          
	//*  39   65:istore          4
	//*  40   67:iload           4
	//*  41   69:iload           10
	//*  42   71:icmpge          171
	//*  43   74:aload           11
	//*  44   76:iload           4
	//*  45   78:iaload          
	//*  46   79:istore          7
	//*  47   81:iload           7
	//*  48   83:istore_2        
	//*  49   84:iload           7
	//*  50   86:ifeq            212
	//*  51   89:iload           7
	//*  52   91:istore_2        
	//*  53   92:iload           5
	//*  54   94:iload_3         
	//*  55   95:isub            
	//*  56   96:istore          7
	//*  57   98:iload           7
	//*  58  100:bipush          32
	//*  59  102:icmpge          239
	//*  60  105:aload_0         
	//*  61  106:getfield        #56  <Field int _outputTail>
	//*  62  109:iload           7
	//*  63  111:iadd            
	//*  64  112:aload_0         
	//*  65  113:getfield        #45  <Field int _outputEnd>
	//*  66  116:icmple          123
	//*  67  119:aload_0         
	//*  68  120:invokevirtual   #59  <Method void _flushBuffer()>
	//*  69  123:iload           7
	//*  70  125:ifle            154
	//*  71  128:aload_1         
	//*  72  129:iload_3         
	//*  73  130:aload_0         
	//*  74  131:getfield        #43  <Field char[] _outputBuffer>
	//*  75  134:aload_0         
	//*  76  135:getfield        #56  <Field int _outputTail>
	//*  77  138:iload           7
	//*  78  140:invokestatic    #182 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  79  143:aload_0         
	//*  80  144:aload_0         
	//*  81  145:getfield        #56  <Field int _outputTail>
	//*  82  148:iload           7
	//*  83  150:iadd            
	//*  84  151:putfield        #56  <Field int _outputTail>
	//*  85  154:iload           5
	//*  86  156:iload           9
	//*  87  158:icmplt          257
	//*  88  161:return          
			l = _maximumNonEscapedChar;
	//   89  162:aload_0         
	//   90  163:getfield        #125 <Field int _maximumNonEscapedChar>
	//   91  166:istore          6
		l1 = Math.min(ai.length, l + 1);
		characterescapes = _characterEscapes;
		k = 0;
		j = i;
		i = k;
_L12:
		if(j >= k1) goto _L2; else goto _L1
_L1:
		k = j;
		i1 = i;
_L10:
		c = ac[k];
		if(c >= l1) goto _L4; else goto _L3
_L3:
		i1 = ai[c];
		i = i1;
		if(i1 == 0) goto _L6; else goto _L5
_L5:
		i = i1;
_L7:
		i1 = k - j;
		int j1;
		SerializableString serializablestring;
		if(i1 < 32)
		{
			if(_outputTail + i1 > _outputEnd)
				_flushBuffer();
			if(i1 > 0)
			{
				System.arraycopy(((Object) (ac)), j, ((Object) (_outputBuffer)), _outputTail, i1);
				_outputTail = _outputTail + i1;
			}
		} else
	//*  92  168:goto            23
	//*  93  171:iload           4
	//*  94  173:iload           6
	//*  95  175:icmple          183
	//*  96  178:iconst_m1       
	//*  97  179:istore_2        
	//*  98  180:goto            92
	//*  99  183:aload           12
	//* 100  185:iload           4
	//* 101  187:invokevirtual   #71  <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//* 102  190:astore          13
	//* 103  192:aload_0         
	//* 104  193:aload           13
	//* 105  195:putfield        #61  <Field SerializableString _currentEscape>
	//* 106  198:iload           7
	//* 107  200:istore_2        
	//* 108  201:aload           13
	//* 109  203:ifnull          212
	//* 110  206:bipush          -2
	//* 111  208:istore_2        
	//* 112  209:goto            92
	//* 113  212:iload           5
	//* 114  214:iconst_1        
	//* 115  215:iadd            
	//* 116  216:istore          8
	//* 117  218:iload_2         
	//* 118  219:istore          7
	//* 119  221:iload           8
	//* 120  223:istore          5
	//* 121  225:iload           8
	//* 122  227:iload           9
	//* 123  229:icmplt          61
	//* 124  232:iload           8
	//* 125  234:istore          5
	//* 126  236:goto            92
		{
			_flushBuffer();
	//  127  239:aload_0         
	//  128  240:invokevirtual   #59  <Method void _flushBuffer()>
			_writer.write(ac, j, i1);
	//  129  243:aload_0         
	//  130  244:getfield        #36  <Field Writer _writer>
	//  131  247:aload_1         
	//  132  248:iload_3         
	//  133  249:iload           7
	//  134  251:invokevirtual   #101 <Method void Writer.write(char[], int, int)>
		}
		if(k < k1)
			break MISSING_BLOCK_LABEL_257;
_L2:
		return;
_L4:
label0:
		{
			if(c <= l)
				break label0;
			i = -1;
		}
		  goto _L7
		serializablestring = characterescapes.getEscapeSequence(((int) (c)));
		_currentEscape = serializablestring;
		i = i1;
		if(serializablestring == null) goto _L6; else goto _L8
_L8:
		i = -2;
		  goto _L7
_L6:
		j1 = k + 1;
		i1 = i;
		k = j1;
		if(j1 < k1) goto _L10; else goto _L9
_L9:
		k = j1;
		  goto _L7
	//* 135  254:goto            154
		j = k + 1;
	//  136  257:iload           5
	//  137  259:iconst_1        
	//  138  260:iadd            
	//  139  261:istore_3        
		_appendCharacterEscape(c, i);
	//  140  262:aload_0         
	//  141  263:iload           4
	//  142  265:iload_2         
	//  143  266:invokespecial   #184 <Method void _appendCharacterEscape(char, int)>
		if(true) goto _L12; else goto _L11
	//  144  269:goto            49
_L11:
	}

	private void writeRawLong(String s)
		throws IOException
	{
		int i = _outputEnd - _outputTail;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int _outputEnd>
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field int _outputTail>
	//    4    8:isub            
	//    5    9:istore_2        
		s.getChars(0, i, _outputBuffer, _outputTail);
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #43  <Field char[] _outputBuffer>
	//   11   17:aload_0         
	//   12   18:getfield        #56  <Field int _outputTail>
	//   13   21:invokevirtual   #93  <Method void String.getChars(int, int, char[], int)>
		_outputTail = _outputTail + i;
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #56  <Field int _outputTail>
	//   17   29:iload_2         
	//   18   30:iadd            
	//   19   31:putfield        #56  <Field int _outputTail>
		_flushBuffer();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #59  <Method void _flushBuffer()>
		int j = i;
	//   22   38:iload_2         
	//   23   39:istore_3        
		int k;
		for(i = s.length() - i; i > _outputEnd; i -= k)
	//*  24   40:aload_1         
	//*  25   41:invokevirtual   #83  <Method int String.length()>
	//*  26   44:iload_2         
	//*  27   45:isub            
	//*  28   46:istore_2        
	//*  29   47:iload_2         
	//*  30   48:aload_0         
	//*  31   49:getfield        #45  <Field int _outputEnd>
	//*  32   52:icmple          103
		{
			k = _outputEnd;
	//   33   55:aload_0         
	//   34   56:getfield        #45  <Field int _outputEnd>
	//   35   59:istore          4
			s.getChars(j, j + k, _outputBuffer, 0);
	//   36   61:aload_1         
	//   37   62:iload_3         
	//   38   63:iload_3         
	//   39   64:iload           4
	//   40   66:iadd            
	//   41   67:aload_0         
	//   42   68:getfield        #43  <Field char[] _outputBuffer>
	//   43   71:iconst_0        
	//   44   72:invokevirtual   #93  <Method void String.getChars(int, int, char[], int)>
			_outputHead = 0;
	//   45   75:aload_0         
	//   46   76:iconst_0        
	//   47   77:putfield        #103 <Field int _outputHead>
			_outputTail = k;
	//   48   80:aload_0         
	//   49   81:iload           4
	//   50   83:putfield        #56  <Field int _outputTail>
			_flushBuffer();
	//   51   86:aload_0         
	//   52   87:invokevirtual   #59  <Method void _flushBuffer()>
			j += k;
	//   53   90:iload_3         
	//   54   91:iload           4
	//   55   93:iadd            
	//   56   94:istore_3        
		}

	//   57   95:iload_2         
	//   58   96:iload           4
	//   59   98:isub            
	//   60   99:istore_2        
	//*  61  100:goto            47
		s.getChars(j, j + i, _outputBuffer, 0);
	//   62  103:aload_1         
	//   63  104:iload_3         
	//   64  105:iload_3         
	//   65  106:iload_2         
	//   66  107:iadd            
	//   67  108:aload_0         
	//   68  109:getfield        #43  <Field char[] _outputBuffer>
	//   69  112:iconst_0        
	//   70  113:invokevirtual   #93  <Method void String.getChars(int, int, char[], int)>
		_outputHead = 0;
	//   71  116:aload_0         
	//   72  117:iconst_0        
	//   73  118:putfield        #103 <Field int _outputHead>
		_outputTail = i;
	//   74  121:aload_0         
	//   75  122:iload_2         
	//   76  123:putfield        #56  <Field int _outputTail>
	//   77  126:return          
	}

	protected void _flushBuffer()
		throws IOException
	{
		int i = _outputTail - _outputHead;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int _outputTail>
	//    2    4:aload_0         
	//    3    5:getfield        #103 <Field int _outputHead>
	//    4    8:isub            
	//    5    9:istore_1        
		if(i > 0)
	//*   6   10:iload_1         
	//*   7   11:ifle            42
		{
			int j = _outputHead;
	//    8   14:aload_0         
	//    9   15:getfield        #103 <Field int _outputHead>
	//   10   18:istore_2        
			_outputHead = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #103 <Field int _outputHead>
			_outputTail = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #56  <Field int _outputTail>
			_writer.write(_outputBuffer, j, i);
	//   17   29:aload_0         
	//   18   30:getfield        #36  <Field Writer _writer>
	//   19   33:aload_0         
	//   20   34:getfield        #43  <Field char[] _outputBuffer>
	//   21   37:iload_2         
	//   22   38:iload_1         
	//   23   39:invokevirtual   #101 <Method void Writer.write(char[], int, int)>
		}
	//   24   42:return          
	}

	protected void _releaseBuffers()
	{
		char ac[] = _outputBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field char[] _outputBuffer>
	//    2    4:astore_1        
		if(ac != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          22
		{
			_outputBuffer = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #43  <Field char[] _outputBuffer>
			_ioContext.releaseConcatBuffer(ac);
	//    8   14:aload_0         
	//    9   15:getfield        #192 <Field IOContext _ioContext>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #196 <Method void IOContext.releaseConcatBuffer(char[])>
		}
	//   12   22:return          
	}

	protected void _verifyPrettyValueWrite(String s)
		throws IOException
	{
		int i;
		i = _writeContext.writeValue();
	//    0    0:aload_0         
	//    1    1:getfield        #201 <Field JsonWriteContext _writeContext>
	//    2    4:invokevirtual   #206 <Method int JsonWriteContext.writeValue()>
	//    3    7:istore_2        
		if(i == 5)
	//*   4    8:iload_2         
	//*   5    9:iconst_5        
	//*   6   10:icmpne          41
			_reportError((new StringBuilder()).append("Can not ").append(s).append(", expecting field name").toString());
	//    7   13:aload_0         
	//    8   14:new             #208 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #210 <Method void StringBuilder()>
	//   11   21:ldc1            #212 <String "Can not ">
	//   12   23:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:aload_1         
	//   14   27:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   15   30:ldc1            #218 <String ", expecting field name">
	//   16   32:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:invokevirtual   #221 <Method String StringBuilder.toString()>
	//   18   38:invokevirtual   #224 <Method void _reportError(String)>
		i;
	//   19   41:iload_2         
		JVM INSTR tableswitch 0 3: default 72
	//	               0 110
	//	               1 77
	//	               2 88
	//	               3 99;
	//   20   42:tableswitch     0 3: default 72
	//	               0 110
	//	               1 77
	//	               2 88
	//	               3 99
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		_throwInternal();
	//   21   72:aload_0         
	//   22   73:invokevirtual   #227 <Method void _throwInternal()>
_L7:
		return;
	//   23   76:return          
_L3:
		_cfgPrettyPrinter.writeArrayValueSeparator(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   24   77:aload_0         
	//   25   78:getfield        #231 <Field PrettyPrinter _cfgPrettyPrinter>
	//   26   81:aload_0         
	//   27   82:invokeinterface #237 <Method void PrettyPrinter.writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)>
		return;
	//   28   87:return          
_L4:
		_cfgPrettyPrinter.writeObjectFieldValueSeparator(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   29   88:aload_0         
	//   30   89:getfield        #231 <Field PrettyPrinter _cfgPrettyPrinter>
	//   31   92:aload_0         
	//   32   93:invokeinterface #240 <Method void PrettyPrinter.writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)>
		return;
	//   33   98:return          
_L5:
		_cfgPrettyPrinter.writeRootValueSeparator(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   34   99:aload_0         
	//   35  100:getfield        #231 <Field PrettyPrinter _cfgPrettyPrinter>
	//   36  103:aload_0         
	//   37  104:invokeinterface #243 <Method void PrettyPrinter.writeRootValueSeparator(com.fasterxml.jackson.core.JsonGenerator)>
		return;
	//   38  109:return          
_L2:
		if(_writeContext.inArray())
	//*  39  110:aload_0         
	//*  40  111:getfield        #201 <Field JsonWriteContext _writeContext>
	//*  41  114:invokevirtual   #247 <Method boolean JsonWriteContext.inArray()>
	//*  42  117:ifeq            131
		{
			_cfgPrettyPrinter.beforeArrayValues(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   43  120:aload_0         
	//   44  121:getfield        #231 <Field PrettyPrinter _cfgPrettyPrinter>
	//   45  124:aload_0         
	//   46  125:invokeinterface #250 <Method void PrettyPrinter.beforeArrayValues(com.fasterxml.jackson.core.JsonGenerator)>
			return;
	//   47  130:return          
		}
		if(_writeContext.inObject())
	//*  48  131:aload_0         
	//*  49  132:getfield        #201 <Field JsonWriteContext _writeContext>
	//*  50  135:invokevirtual   #253 <Method boolean JsonWriteContext.inObject()>
	//*  51  138:ifeq            76
		{
			_cfgPrettyPrinter.beforeObjectEntries(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   52  141:aload_0         
	//   53  142:getfield        #231 <Field PrettyPrinter _cfgPrettyPrinter>
	//   54  145:aload_0         
	//   55  146:invokeinterface #256 <Method void PrettyPrinter.beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)>
			return;
	//   56  151:return          
		}
		if(true) goto _L7; else goto _L6
_L6:
	}

	protected void _verifyValueWrite(String s)
		throws IOException
	{
		if(_cfgPrettyPrinter == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field PrettyPrinter _cfgPrettyPrinter>
	//    2    4:ifnull          13
_L1:
		_verifyPrettyValueWrite(s);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #259 <Method void _verifyPrettyValueWrite(String)>
_L10:
		return;
	//    6   12:return          
_L2:
		int i;
		i = _writeContext.writeValue();
	//    7   13:aload_0         
	//    8   14:getfield        #201 <Field JsonWriteContext _writeContext>
	//    9   17:invokevirtual   #206 <Method int JsonWriteContext.writeValue()>
	//   10   20:istore_3        
		if(i == 5)
	//*  11   21:iload_3         
	//*  12   22:iconst_5        
	//*  13   23:icmpne          54
			_reportError((new StringBuilder()).append("Can not ").append(s).append(", expecting field name").toString());
	//   14   26:aload_0         
	//   15   27:new             #208 <Class StringBuilder>
	//   16   30:dup             
	//   17   31:invokespecial   #210 <Method void StringBuilder()>
	//   18   34:ldc1            #212 <String "Can not ">
	//   19   36:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   20   39:aload_1         
	//   21   40:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   22   43:ldc1            #218 <String ", expecting field name">
	//   23   45:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   24   48:invokevirtual   #221 <Method String StringBuilder.toString()>
	//   25   51:invokevirtual   #224 <Method void _reportError(String)>
		i;
	//   26   54:iload_3         
		JVM INSTR tableswitch 1 3: default 80
	//	               1 81
	//	               2 120
	//	               3 126;
	//   27   55:tableswitch     1 3: default 80
	//	               1 81
	//	               2 120
	//	               3 126
		   goto _L3 _L4 _L5 _L6
_L6:
		continue; /* Loop/switch isn't completed */
_L3:
		return;
	//   28   80:return          
_L4:
		char c = ',';
	//   29   81:bipush          44
	//   30   83:istore_2        
_L8:
		if(_outputTail >= _outputEnd)
	//*  31   84:aload_0         
	//*  32   85:getfield        #56  <Field int _outputTail>
	//*  33   88:aload_0         
	//*  34   89:getfield        #45  <Field int _outputEnd>
	//*  35   92:icmplt          99
			_flushBuffer();
	//   36   95:aload_0         
	//   37   96:invokevirtual   #59  <Method void _flushBuffer()>
		_outputBuffer[_outputTail] = c;
	//   38   99:aload_0         
	//   39  100:getfield        #43  <Field char[] _outputBuffer>
	//   40  103:aload_0         
	//   41  104:getfield        #56  <Field int _outputTail>
	//   42  107:iload_2         
	//   43  108:castore         
		_outputTail = _outputTail + 1;
	//   44  109:aload_0         
	//   45  110:aload_0         
	//   46  111:getfield        #56  <Field int _outputTail>
	//   47  114:iconst_1        
	//   48  115:iadd            
	//   49  116:putfield        #56  <Field int _outputTail>
		return;
	//   50  119:return          
_L5:
		c = ':';
	//   51  120:bipush          58
	//   52  122:istore_2        
		if(true) goto _L8; else goto _L7
	//   53  123:goto            84
_L7:
		if(_rootValueSeparator == null) goto _L10; else goto _L9
	//   54  126:aload_0         
	//   55  127:getfield        #262 <Field SerializableString _rootValueSeparator>
	//   56  130:ifnull          12
_L9:
		writeRaw(_rootValueSeparator.getValue());
	//   57  133:aload_0         
	//   58  134:aload_0         
	//   59  135:getfield        #262 <Field SerializableString _rootValueSeparator>
	//   60  138:invokeinterface #77  <Method String SerializableString.getValue()>
	//   61  143:invokevirtual   #150 <Method void writeRaw(String)>
		return;
	//   62  146:return          
	}

	protected int _writeBinary(Base64Variant base64variant, InputStream inputstream, byte abyte0[])
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
	//    9   14:getfield        #45  <Field int _outputEnd>
	//   10   17:bipush          6
	//   11   19:isub            
	//   12   20:istore          12
		int k = base64variant.getMaxLineLength() >> 2;
	//   13   22:aload_1         
	//   14   23:invokevirtual   #269 <Method int Base64Variant.getMaxLineLength()>
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
	//   34   58:invokespecial   #271 <Method int _readMore(InputStream, byte[], int, int, int)>
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
	//*  46   82:getfield        #56  <Field int _outputTail>
	//*  47   85:iload           12
	//*  48   87:icmple          94
							_flushBuffer();
	//   49   90:aload_0         
	//   50   91:invokevirtual   #59  <Method void _flushBuffer()>
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
	//   89  154:getfield        #43  <Field char[] _outputBuffer>
	//   90  157:aload_0         
	//   91  158:getfield        #56  <Field int _outputTail>
	//   92  161:invokevirtual   #275 <Method int Base64Variant.encodeBase64Partial(int, int, char[], int)>
	//   93  164:putfield        #56  <Field int _outputTail>
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
	//* 103  181:getfield        #56  <Field int _outputTail>
	//* 104  184:iload           12
	//* 105  186:icmple          193
				_flushBuffer();
	//  106  189:aload_0         
	//  107  190:invokevirtual   #59  <Method void _flushBuffer()>
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
	//  148  254:getfield        #43  <Field char[] _outputBuffer>
	//  149  257:aload_0         
	//  150  258:getfield        #56  <Field int _outputTail>
	//  151  261:invokevirtual   #278 <Method int Base64Variant.encodeBase64Chunk(int, char[], int)>
	//  152  264:putfield        #56  <Field int _outputTail>
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
				char ac[] = _outputBuffer;
	//  161  282:aload_0         
	//  162  283:getfield        #43  <Field char[] _outputBuffer>
	//  163  286:astore          13
				j = _outputTail;
	//  164  288:aload_0         
	//  165  289:getfield        #56  <Field int _outputTail>
	//  166  292:istore          5
				_outputTail = j + 1;
	//  167  294:aload_0         
	//  168  295:iload           5
	//  169  297:iconst_1        
	//  170  298:iadd            
	//  171  299:putfield        #56  <Field int _outputTail>
				ac[j] = '\\';
	//  172  302:aload           13
	//  173  304:iload           5
	//  174  306:bipush          92
	//  175  308:castore         
				ac = _outputBuffer;
	//  176  309:aload_0         
	//  177  310:getfield        #43  <Field char[] _outputBuffer>
	//  178  313:astore          13
				j = _outputTail;
	//  179  315:aload_0         
	//  180  316:getfield        #56  <Field int _outputTail>
	//  181  319:istore          5
				_outputTail = j + 1;
	//  182  321:aload_0         
	//  183  322:iload           5
	//  184  324:iconst_1        
	//  185  325:iadd            
	//  186  326:putfield        #56  <Field int _outputTail>
				ac[j] = 'n';
	//  187  329:aload           13
	//  188  331:iload           5
	//  189  333:bipush          110
	//  190  335:castore         
				k = base64variant.getMaxLineLength() >> 2;
	//  191  336:aload_1         
	//  192  337:invokevirtual   #269 <Method int Base64Variant.getMaxLineLength()>
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

	protected int _writeBinary(Base64Variant base64variant, InputStream inputstream, byte abyte0[], int i)
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
	//    7   11:getfield        #45  <Field int _outputEnd>
	//    8   14:bipush          6
	//    9   16:isub            
	//   10   17:istore          12
		int l = base64variant.getMaxLineLength() >> 2;
	//   11   19:aload_1         
	//   12   20:invokevirtual   #269 <Method int Base64Variant.getMaxLineLength()>
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
	//   42   77:invokespecial   #271 <Method int _readMore(InputStream, byte[], int, int, int)>
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
	//   65  120:invokespecial   #271 <Method int _readMore(InputStream, byte[], int, int, int)>
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
	//*  72  135:getfield        #56  <Field int _outputTail>
	//*  73  138:iload           12
	//*  74  140:icmple          147
								_flushBuffer();
	//   75  143:aload_0         
	//   76  144:invokevirtual   #59  <Method void _flushBuffer()>
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
							char ac[];
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
	//* 107  193:getfield        #43  <Field char[] _outputBuffer>
	//* 108  196:aload_0         
	//* 109  197:getfield        #56  <Field int _outputTail>
	//* 110  200:invokevirtual   #275 <Method int Base64Variant.encodeBase64Partial(int, int, char[], int)>
	//* 111  203:putfield        #56  <Field int _outputTail>
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
	//* 123  223:getfield        #56  <Field int _outputTail>
	//* 124  226:iload           12
	//* 125  228:icmple          235
	//* 126  231:aload_0         
	//* 127  232:invokevirtual   #59  <Method void _flushBuffer()>
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
	//* 168  296:getfield        #43  <Field char[] _outputBuffer>
	//* 169  299:aload_0         
	//* 170  300:getfield        #56  <Field int _outputTail>
	//* 171  303:invokevirtual   #278 <Method int Base64Variant.encodeBase64Chunk(int, char[], int)>
	//* 172  306:putfield        #56  <Field int _outputTail>
	//* 173  309:iload           7
	//* 174  311:iconst_1        
	//* 175  312:isub            
	//* 176  313:istore          4
	//* 177  315:iload           4
	//* 178  317:istore          5
	//* 179  319:iload           4
	//* 180  321:ifgt            386
	//* 181  324:aload_0         
	//* 182  325:getfield        #43  <Field char[] _outputBuffer>
	//* 183  328:astore          14
	//* 184  330:aload_0         
	//* 185  331:getfield        #56  <Field int _outputTail>
	//* 186  334:istore          4
	//* 187  336:aload_0         
	//* 188  337:iload           4
	//* 189  339:iconst_1        
	//* 190  340:iadd            
	//* 191  341:putfield        #56  <Field int _outputTail>
	//* 192  344:aload           14
	//* 193  346:iload           4
	//* 194  348:bipush          92
	//* 195  350:castore         
	//* 196  351:aload_0         
	//* 197  352:getfield        #43  <Field char[] _outputBuffer>
	//* 198  355:astore          14
	//* 199  357:aload_0         
	//* 200  358:getfield        #56  <Field int _outputTail>
	//* 201  361:istore          4
	//* 202  363:aload_0         
	//* 203  364:iload           4
	//* 204  366:iconst_1        
	//* 205  367:iadd            
	//* 206  368:putfield        #56  <Field int _outputTail>
	//* 207  371:aload           14
	//* 208  373:iload           4
	//* 209  375:bipush          110
	//* 210  377:castore         
	//* 211  378:aload_1         
	//* 212  379:invokevirtual   #269 <Method int Base64Variant.getMaxLineLength()>
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
				ac = _outputBuffer;
				i = _outputTail;
				_outputTail = i + 1;
				ac[i] = '\\';
				ac = _outputBuffer;
				i = _outputTail;
				_outputTail = i + 1;
				ac[i] = 'n';
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

	protected void _writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
		throws IOException, JsonGenerationException
	{
		int i1 = _outputEnd - 6;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int _outputEnd>
	//    2    4:bipush          6
	//    3    6:isub            
	//    4    7:istore          7
		int l = base64variant.getMaxLineLength() >> 2;
	//    5    9:aload_1         
	//    6   10:invokevirtual   #269 <Method int Base64Variant.getMaxLineLength()>
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
	//*  20   33:getfield        #56  <Field int _outputTail>
	//*  21   36:iload           7
	//*  22   38:icmple          45
				_flushBuffer();
	//   23   41:aload_0         
	//   24   42:invokevirtual   #59  <Method void _flushBuffer()>
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
	//   57   92:getfield        #43  <Field char[] _outputBuffer>
	//   58   95:aload_0         
	//   59   96:getfield        #56  <Field int _outputTail>
	//   60   99:invokevirtual   #278 <Method int Base64Variant.encodeBase64Chunk(int, char[], int)>
	//   61  102:putfield        #56  <Field int _outputTail>
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
				char ac[] = _outputBuffer;
	//   70  118:aload_0         
	//   71  119:getfield        #43  <Field char[] _outputBuffer>
	//   72  122:astore          9
				i = _outputTail;
	//   73  124:aload_0         
	//   74  125:getfield        #56  <Field int _outputTail>
	//   75  128:istore_3        
				_outputTail = i + 1;
	//   76  129:aload_0         
	//   77  130:iload_3         
	//   78  131:iconst_1        
	//   79  132:iadd            
	//   80  133:putfield        #56  <Field int _outputTail>
				ac[i] = '\\';
	//   81  136:aload           9
	//   82  138:iload_3         
	//   83  139:bipush          92
	//   84  141:castore         
				ac = _outputBuffer;
	//   85  142:aload_0         
	//   86  143:getfield        #43  <Field char[] _outputBuffer>
	//   87  146:astore          9
				i = _outputTail;
	//   88  148:aload_0         
	//   89  149:getfield        #56  <Field int _outputTail>
	//   90  152:istore_3        
				_outputTail = i + 1;
	//   91  153:aload_0         
	//   92  154:iload_3         
	//   93  155:iconst_1        
	//   94  156:iadd            
	//   95  157:putfield        #56  <Field int _outputTail>
				ac[i] = 'n';
	//   96  160:aload           9
	//   97  162:iload_3         
	//   98  163:bipush          110
	//   99  165:castore         
				i = base64variant.getMaxLineLength() >> 2;
	//  100  166:aload_1         
	//  101  167:invokevirtual   #269 <Method int Base64Variant.getMaxLineLength()>
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
	//* 117  195:getfield        #56  <Field int _outputTail>
	//* 118  198:iload           7
	//* 119  200:icmple          207
				_flushBuffer();
	//  120  203:aload_0         
	//  121  204:invokevirtual   #59  <Method void _flushBuffer()>
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
	//  152  252:getfield        #43  <Field char[] _outputBuffer>
	//  153  255:aload_0         
	//  154  256:getfield        #56  <Field int _outputTail>
	//  155  259:invokevirtual   #275 <Method int Base64Variant.encodeBase64Partial(int, int, char[], int)>
	//  156  262:putfield        #56  <Field int _outputTail>
			return;
	//  157  265:return          
		} else
		{
			return;
	//  158  266:return          
		}
	}

	protected void _writeFieldName(SerializableString serializablestring, boolean flag)
		throws IOException
	{
		if(_cfgPrettyPrinter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #231 <Field PrettyPrinter _cfgPrettyPrinter>
	//*   2    4:ifnull          14
		{
			_writePPFieldName(serializablestring, flag);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #285 <Method void _writePPFieldName(SerializableString, boolean)>
			return;
	//    7   13:return          
		}
		if(_outputTail + 1 >= _outputEnd)
	//*   8   14:aload_0         
	//*   9   15:getfield        #56  <Field int _outputTail>
	//*  10   18:iconst_1        
	//*  11   19:iadd            
	//*  12   20:aload_0         
	//*  13   21:getfield        #45  <Field int _outputEnd>
	//*  14   24:icmplt          31
			_flushBuffer();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #59  <Method void _flushBuffer()>
		if(flag)
	//*  17   31:iload_2         
	//*  18   32:ifeq            59
		{
			char ac[] = _outputBuffer;
	//   19   35:aload_0         
	//   20   36:getfield        #43  <Field char[] _outputBuffer>
	//   21   39:astore          4
			int i = _outputTail;
	//   22   41:aload_0         
	//   23   42:getfield        #56  <Field int _outputTail>
	//   24   45:istore_3        
			_outputTail = i + 1;
	//   25   46:aload_0         
	//   26   47:iload_3         
	//   27   48:iconst_1        
	//   28   49:iadd            
	//   29   50:putfield        #56  <Field int _outputTail>
			ac[i] = ',';
	//   30   53:aload           4
	//   31   55:iload_3         
	//   32   56:bipush          44
	//   33   58:castore         
		}
		serializablestring = ((SerializableString) (serializablestring.asQuotedChars()));
	//   34   59:aload_1         
	//   35   60:invokeinterface #288 <Method char[] SerializableString.asQuotedChars()>
	//   36   65:astore_1        
		if(_cfgUnqNames)
	//*  37   66:aload_0         
	//*  38   67:getfield        #292 <Field boolean _cfgUnqNames>
	//*  39   70:ifeq            82
		{
			writeRaw(((char []) (serializablestring)), 0, serializablestring.length);
	//   40   73:aload_0         
	//   41   74:aload_1         
	//   42   75:iconst_0        
	//   43   76:aload_1         
	//   44   77:arraylength     
	//   45   78:invokevirtual   #294 <Method void writeRaw(char[], int, int)>
			return;
	//   46   81:return          
		}
		char ac1[] = _outputBuffer;
	//   47   82:aload_0         
	//   48   83:getfield        #43  <Field char[] _outputBuffer>
	//   49   86:astore          4
		int j = _outputTail;
	//   50   88:aload_0         
	//   51   89:getfield        #56  <Field int _outputTail>
	//   52   92:istore_3        
		_outputTail = j + 1;
	//   53   93:aload_0         
	//   54   94:iload_3         
	//   55   95:iconst_1        
	//   56   96:iadd            
	//   57   97:putfield        #56  <Field int _outputTail>
		ac1[j] = '"';
	//   58  100:aload           4
	//   59  102:iload_3         
	//   60  103:bipush          34
	//   61  105:castore         
		j = serializablestring.length;
	//   62  106:aload_1         
	//   63  107:arraylength     
	//   64  108:istore_3        
		if(_outputTail + j + 1 >= _outputEnd)
	//*  65  109:aload_0         
	//*  66  110:getfield        #56  <Field int _outputTail>
	//*  67  113:iload_3         
	//*  68  114:iadd            
	//*  69  115:iconst_1        
	//*  70  116:iadd            
	//*  71  117:aload_0         
	//*  72  118:getfield        #45  <Field int _outputEnd>
	//*  73  121:icmplt          169
		{
			writeRaw(((char []) (serializablestring)), 0, j);
	//   74  124:aload_0         
	//   75  125:aload_1         
	//   76  126:iconst_0        
	//   77  127:iload_3         
	//   78  128:invokevirtual   #294 <Method void writeRaw(char[], int, int)>
			if(_outputTail >= _outputEnd)
	//*  79  131:aload_0         
	//*  80  132:getfield        #56  <Field int _outputTail>
	//*  81  135:aload_0         
	//*  82  136:getfield        #45  <Field int _outputEnd>
	//*  83  139:icmplt          146
				_flushBuffer();
	//   84  142:aload_0         
	//   85  143:invokevirtual   #59  <Method void _flushBuffer()>
			serializablestring = ((SerializableString) (_outputBuffer));
	//   86  146:aload_0         
	//   87  147:getfield        #43  <Field char[] _outputBuffer>
	//   88  150:astore_1        
			j = _outputTail;
	//   89  151:aload_0         
	//   90  152:getfield        #56  <Field int _outputTail>
	//   91  155:istore_3        
			_outputTail = j + 1;
	//   92  156:aload_0         
	//   93  157:iload_3         
	//   94  158:iconst_1        
	//   95  159:iadd            
	//   96  160:putfield        #56  <Field int _outputTail>
			serializablestring[j] = '"';
	//   97  163:aload_1         
	//   98  164:iload_3         
	//   99  165:bipush          34
	//  100  167:castore         
			return;
	//  101  168:return          
		} else
		{
			System.arraycopy(((Object) (serializablestring)), 0, ((Object) (_outputBuffer)), _outputTail, j);
	//  102  169:aload_1         
	//  103  170:iconst_0        
	//  104  171:aload_0         
	//  105  172:getfield        #43  <Field char[] _outputBuffer>
	//  106  175:aload_0         
	//  107  176:getfield        #56  <Field int _outputTail>
	//  108  179:iload_3         
	//  109  180:invokestatic    #182 <Method void System.arraycopy(Object, int, Object, int, int)>
			_outputTail = _outputTail + j;
	//  110  183:aload_0         
	//  111  184:aload_0         
	//  112  185:getfield        #56  <Field int _outputTail>
	//  113  188:iload_3         
	//  114  189:iadd            
	//  115  190:putfield        #56  <Field int _outputTail>
			serializablestring = ((SerializableString) (_outputBuffer));
	//  116  193:aload_0         
	//  117  194:getfield        #43  <Field char[] _outputBuffer>
	//  118  197:astore_1        
			j = _outputTail;
	//  119  198:aload_0         
	//  120  199:getfield        #56  <Field int _outputTail>
	//  121  202:istore_3        
			_outputTail = j + 1;
	//  122  203:aload_0         
	//  123  204:iload_3         
	//  124  205:iconst_1        
	//  125  206:iadd            
	//  126  207:putfield        #56  <Field int _outputTail>
			serializablestring[j] = '"';
	//  127  210:aload_1         
	//  128  211:iload_3         
	//  129  212:bipush          34
	//  130  214:castore         
			return;
	//  131  215:return          
		}
	}

	protected void _writeFieldName(String s, boolean flag)
		throws IOException
	{
		if(_cfgPrettyPrinter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #231 <Field PrettyPrinter _cfgPrettyPrinter>
	//*   2    4:ifnull          14
		{
			_writePPFieldName(s, flag);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #297 <Method void _writePPFieldName(String, boolean)>
			return;
	//    7   13:return          
		}
		if(_outputTail + 1 >= _outputEnd)
	//*   8   14:aload_0         
	//*   9   15:getfield        #56  <Field int _outputTail>
	//*  10   18:iconst_1        
	//*  11   19:iadd            
	//*  12   20:aload_0         
	//*  13   21:getfield        #45  <Field int _outputEnd>
	//*  14   24:icmplt          31
			_flushBuffer();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #59  <Method void _flushBuffer()>
		if(flag)
	//*  17   31:iload_2         
	//*  18   32:ifeq            59
		{
			char ac[] = _outputBuffer;
	//   19   35:aload_0         
	//   20   36:getfield        #43  <Field char[] _outputBuffer>
	//   21   39:astore          4
			int i = _outputTail;
	//   22   41:aload_0         
	//   23   42:getfield        #56  <Field int _outputTail>
	//   24   45:istore_3        
			_outputTail = i + 1;
	//   25   46:aload_0         
	//   26   47:iload_3         
	//   27   48:iconst_1        
	//   28   49:iadd            
	//   29   50:putfield        #56  <Field int _outputTail>
			ac[i] = ',';
	//   30   53:aload           4
	//   31   55:iload_3         
	//   32   56:bipush          44
	//   33   58:castore         
		}
		if(_cfgUnqNames)
	//*  34   59:aload_0         
	//*  35   60:getfield        #292 <Field boolean _cfgUnqNames>
	//*  36   63:ifeq            72
		{
			_writeString(s);
	//   37   66:aload_0         
	//   38   67:aload_1         
	//   39   68:invokespecial   #299 <Method void _writeString(String)>
			return;
	//   40   71:return          
		}
		char ac1[] = _outputBuffer;
	//   41   72:aload_0         
	//   42   73:getfield        #43  <Field char[] _outputBuffer>
	//   43   76:astore          4
		int j = _outputTail;
	//   44   78:aload_0         
	//   45   79:getfield        #56  <Field int _outputTail>
	//   46   82:istore_3        
		_outputTail = j + 1;
	//   47   83:aload_0         
	//   48   84:iload_3         
	//   49   85:iconst_1        
	//   50   86:iadd            
	//   51   87:putfield        #56  <Field int _outputTail>
		ac1[j] = '"';
	//   52   90:aload           4
	//   53   92:iload_3         
	//   54   93:bipush          34
	//   55   95:castore         
		_writeString(s);
	//   56   96:aload_0         
	//   57   97:aload_1         
	//   58   98:invokespecial   #299 <Method void _writeString(String)>
		if(_outputTail >= _outputEnd)
	//*  59  101:aload_0         
	//*  60  102:getfield        #56  <Field int _outputTail>
	//*  61  105:aload_0         
	//*  62  106:getfield        #45  <Field int _outputEnd>
	//*  63  109:icmplt          116
			_flushBuffer();
	//   64  112:aload_0         
	//   65  113:invokevirtual   #59  <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//   66  116:aload_0         
	//   67  117:getfield        #43  <Field char[] _outputBuffer>
	//   68  120:astore_1        
		j = _outputTail;
	//   69  121:aload_0         
	//   70  122:getfield        #56  <Field int _outputTail>
	//   71  125:istore_3        
		_outputTail = j + 1;
	//   72  126:aload_0         
	//   73  127:iload_3         
	//   74  128:iconst_1        
	//   75  129:iadd            
	//   76  130:putfield        #56  <Field int _outputTail>
		s[j] = '"';
	//   77  133:aload_1         
	//   78  134:iload_3         
	//   79  135:bipush          34
	//   80  137:castore         
	//   81  138:return          
	}

	protected void _writePPFieldName(SerializableString serializablestring, boolean flag)
		throws IOException
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            37
			_cfgPrettyPrinter.writeObjectEntrySeparator(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//    2    4:aload_0         
	//    3    5:getfield        #231 <Field PrettyPrinter _cfgPrettyPrinter>
	//    4    8:aload_0         
	//    5    9:invokeinterface #302 <Method void PrettyPrinter.writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)>
		else
	//*   6   14:aload_1         
	//*   7   15:invokeinterface #288 <Method char[] SerializableString.asQuotedChars()>
	//*   8   20:astore_1        
	//*   9   21:aload_0         
	//*  10   22:getfield        #292 <Field boolean _cfgUnqNames>
	//*  11   25:ifeq            50
	//*  12   28:aload_0         
	//*  13   29:aload_1         
	//*  14   30:iconst_0        
	//*  15   31:aload_1         
	//*  16   32:arraylength     
	//*  17   33:invokevirtual   #294 <Method void writeRaw(char[], int, int)>
	//*  18   36:return          
			_cfgPrettyPrinter.beforeObjectEntries(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   19   37:aload_0         
	//   20   38:getfield        #231 <Field PrettyPrinter _cfgPrettyPrinter>
	//   21   41:aload_0         
	//   22   42:invokeinterface #256 <Method void PrettyPrinter.beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)>
		serializablestring = ((SerializableString) (serializablestring.asQuotedChars()));
		if(_cfgUnqNames)
		{
			writeRaw(((char []) (serializablestring)), 0, serializablestring.length);
			return;
		}
	//*  23   47:goto            14
		if(_outputTail >= _outputEnd)
	//*  24   50:aload_0         
	//*  25   51:getfield        #56  <Field int _outputTail>
	//*  26   54:aload_0         
	//*  27   55:getfield        #45  <Field int _outputEnd>
	//*  28   58:icmplt          65
			_flushBuffer();
	//   29   61:aload_0         
	//   30   62:invokevirtual   #59  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//   31   65:aload_0         
	//   32   66:getfield        #43  <Field char[] _outputBuffer>
	//   33   69:astore          4
		int i = _outputTail;
	//   34   71:aload_0         
	//   35   72:getfield        #56  <Field int _outputTail>
	//   36   75:istore_3        
		_outputTail = i + 1;
	//   37   76:aload_0         
	//   38   77:iload_3         
	//   39   78:iconst_1        
	//   40   79:iadd            
	//   41   80:putfield        #56  <Field int _outputTail>
		ac[i] = '"';
	//   42   83:aload           4
	//   43   85:iload_3         
	//   44   86:bipush          34
	//   45   88:castore         
		writeRaw(((char []) (serializablestring)), 0, serializablestring.length);
	//   46   89:aload_0         
	//   47   90:aload_1         
	//   48   91:iconst_0        
	//   49   92:aload_1         
	//   50   93:arraylength     
	//   51   94:invokevirtual   #294 <Method void writeRaw(char[], int, int)>
		if(_outputTail >= _outputEnd)
	//*  52   97:aload_0         
	//*  53   98:getfield        #56  <Field int _outputTail>
	//*  54  101:aload_0         
	//*  55  102:getfield        #45  <Field int _outputEnd>
	//*  56  105:icmplt          112
			_flushBuffer();
	//   57  108:aload_0         
	//   58  109:invokevirtual   #59  <Method void _flushBuffer()>
		serializablestring = ((SerializableString) (_outputBuffer));
	//   59  112:aload_0         
	//   60  113:getfield        #43  <Field char[] _outputBuffer>
	//   61  116:astore_1        
		i = _outputTail;
	//   62  117:aload_0         
	//   63  118:getfield        #56  <Field int _outputTail>
	//   64  121:istore_3        
		_outputTail = i + 1;
	//   65  122:aload_0         
	//   66  123:iload_3         
	//   67  124:iconst_1        
	//   68  125:iadd            
	//   69  126:putfield        #56  <Field int _outputTail>
		serializablestring[i] = '"';
	//   70  129:aload_1         
	//   71  130:iload_3         
	//   72  131:bipush          34
	//   73  133:castore         
	//   74  134:return          
	}

	protected void _writePPFieldName(String s, boolean flag)
		throws IOException
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            27
			_cfgPrettyPrinter.writeObjectEntrySeparator(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//    2    4:aload_0         
	//    3    5:getfield        #231 <Field PrettyPrinter _cfgPrettyPrinter>
	//    4    8:aload_0         
	//    5    9:invokeinterface #302 <Method void PrettyPrinter.writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)>
		else
	//*   6   14:aload_0         
	//*   7   15:getfield        #292 <Field boolean _cfgUnqNames>
	//*   8   18:ifeq            40
	//*   9   21:aload_0         
	//*  10   22:aload_1         
	//*  11   23:invokespecial   #299 <Method void _writeString(String)>
	//*  12   26:return          
			_cfgPrettyPrinter.beforeObjectEntries(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   13   27:aload_0         
	//   14   28:getfield        #231 <Field PrettyPrinter _cfgPrettyPrinter>
	//   15   31:aload_0         
	//   16   32:invokeinterface #256 <Method void PrettyPrinter.beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)>
		if(_cfgUnqNames)
		{
			_writeString(s);
			return;
		}
	//*  17   37:goto            14
		if(_outputTail >= _outputEnd)
	//*  18   40:aload_0         
	//*  19   41:getfield        #56  <Field int _outputTail>
	//*  20   44:aload_0         
	//*  21   45:getfield        #45  <Field int _outputEnd>
	//*  22   48:icmplt          55
			_flushBuffer();
	//   23   51:aload_0         
	//   24   52:invokevirtual   #59  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//   25   55:aload_0         
	//   26   56:getfield        #43  <Field char[] _outputBuffer>
	//   27   59:astore          4
		int i = _outputTail;
	//   28   61:aload_0         
	//   29   62:getfield        #56  <Field int _outputTail>
	//   30   65:istore_3        
		_outputTail = i + 1;
	//   31   66:aload_0         
	//   32   67:iload_3         
	//   33   68:iconst_1        
	//   34   69:iadd            
	//   35   70:putfield        #56  <Field int _outputTail>
		ac[i] = '"';
	//   36   73:aload           4
	//   37   75:iload_3         
	//   38   76:bipush          34
	//   39   78:castore         
		_writeString(s);
	//   40   79:aload_0         
	//   41   80:aload_1         
	//   42   81:invokespecial   #299 <Method void _writeString(String)>
		if(_outputTail >= _outputEnd)
	//*  43   84:aload_0         
	//*  44   85:getfield        #56  <Field int _outputTail>
	//*  45   88:aload_0         
	//*  46   89:getfield        #45  <Field int _outputEnd>
	//*  47   92:icmplt          99
			_flushBuffer();
	//   48   95:aload_0         
	//   49   96:invokevirtual   #59  <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//   50   99:aload_0         
	//   51  100:getfield        #43  <Field char[] _outputBuffer>
	//   52  103:astore_1        
		i = _outputTail;
	//   53  104:aload_0         
	//   54  105:getfield        #56  <Field int _outputTail>
	//   55  108:istore_3        
		_outputTail = i + 1;
	//   56  109:aload_0         
	//   57  110:iload_3         
	//   58  111:iconst_1        
	//   59  112:iadd            
	//   60  113:putfield        #56  <Field int _outputTail>
		s[i] = '"';
	//   61  116:aload_1         
	//   62  117:iload_3         
	//   63  118:bipush          34
	//   64  120:castore         
	//   65  121:return          
	}

	public void close()
		throws IOException
	{
		super.close();
	//    0    0:aload_0         
	//    1    1:invokespecial   #305 <Method void JsonGeneratorImpl.close()>
		if(_outputBuffer != null && isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT))
	//*   2    4:aload_0         
	//*   3    5:getfield        #43  <Field char[] _outputBuffer>
	//*   4    8:ifnull          54
	//*   5   11:aload_0         
	//*   6   12:getstatic       #311 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_JSON_CONTENT>
	//*   7   15:invokevirtual   #315 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*   8   18:ifeq            54
			do
			{
				JsonWriteContext jsonwritecontext = getOutputContext();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #319 <Method JsonWriteContext getOutputContext()>
	//   11   25:astore_1        
				if(((JsonStreamContext) (jsonwritecontext)).inArray())
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #322 <Method boolean JsonStreamContext.inArray()>
	//*  14   30:ifeq            40
				{
					writeEndArray();
	//   15   33:aload_0         
	//   16   34:invokevirtual   #325 <Method void writeEndArray()>
					continue;
	//   17   37:goto            21
				}
				if(!((JsonStreamContext) (jsonwritecontext)).inObject())
					break;
	//   18   40:aload_1         
	//   19   41:invokevirtual   #326 <Method boolean JsonStreamContext.inObject()>
	//   20   44:ifeq            54
				writeEndObject();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #329 <Method void writeEndObject()>
			} while(true);
	//   23   51:goto            21
		_flushBuffer();
	//   24   54:aload_0         
	//   25   55:invokevirtual   #59  <Method void _flushBuffer()>
		_outputHead = 0;
	//   26   58:aload_0         
	//   27   59:iconst_0        
	//   28   60:putfield        #103 <Field int _outputHead>
		_outputTail = 0;
	//   29   63:aload_0         
	//   30   64:iconst_0        
	//   31   65:putfield        #56  <Field int _outputTail>
		if(_writer == null) goto _L2; else goto _L1
	//   32   68:aload_0         
	//   33   69:getfield        #36  <Field Writer _writer>
	//   34   72:ifnull          102
_L1:
		if(!_ioContext.isResourceManaged() && !isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET)) goto _L4; else goto _L3
	//   35   75:aload_0         
	//   36   76:getfield        #192 <Field IOContext _ioContext>
	//   37   79:invokevirtual   #332 <Method boolean IOContext.isResourceManaged()>
	//   38   82:ifne            95
	//   39   85:aload_0         
	//   40   86:getstatic       #335 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_TARGET>
	//   41   89:invokevirtual   #315 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//   42   92:ifeq            107
_L3:
		_writer.close();
	//   43   95:aload_0         
	//   44   96:getfield        #36  <Field Writer _writer>
	//   45   99:invokevirtual   #336 <Method void Writer.close()>
_L2:
		_releaseBuffers();
	//   46  102:aload_0         
	//   47  103:invokevirtual   #338 <Method void _releaseBuffers()>
		return;
	//   48  106:return          
_L4:
		if(isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM))
	//*  49  107:aload_0         
	//*  50  108:getstatic       #341 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.FLUSH_PASSED_TO_STREAM>
	//*  51  111:invokevirtual   #315 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*  52  114:ifeq            102
			_writer.flush();
	//   53  117:aload_0         
	//   54  118:getfield        #36  <Field Writer _writer>
	//   55  121:invokevirtual   #344 <Method void Writer.flush()>
		if(true) goto _L2; else goto _L5
	//   56  124:goto            102
_L5:
	}

	public void flush()
		throws IOException
	{
		_flushBuffer();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #59  <Method void _flushBuffer()>
		if(_writer != null && isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM))
	//*   2    4:aload_0         
	//*   3    5:getfield        #36  <Field Writer _writer>
	//*   4    8:ifnull          28
	//*   5   11:aload_0         
	//*   6   12:getstatic       #341 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.FLUSH_PASSED_TO_STREAM>
	//*   7   15:invokevirtual   #315 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*   8   18:ifeq            28
			_writer.flush();
	//    9   21:aload_0         
	//   10   22:getfield        #36  <Field Writer _writer>
	//   11   25:invokevirtual   #344 <Method void Writer.flush()>
	//   12   28:return          
	}

	public int getOutputBuffered()
	{
		return Math.max(0, _outputTail - _outputHead);
	//    0    0:iconst_0        
	//    1    1:aload_0         
	//    2    2:getfield        #56  <Field int _outputTail>
	//    3    5:aload_0         
	//    4    6:getfield        #103 <Field int _outputHead>
	//    5    9:isub            
	//    6   10:invokestatic    #348 <Method int Math.max(int, int)>
	//    7   13:ireturn         
	}

	public Object getOutputTarget()
	{
		return ((Object) (_writer));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Writer _writer>
	//    2    4:areturn         
	}

	public int writeBinary(Base64Variant base64variant, InputStream inputstream, int i)
		throws IOException, JsonGenerationException
	{
		char ac[];
		_verifyValueWrite("write a binary value");
	//    0    0:aload_0         
	//    1    1:ldc2            #354 <String "write a binary value">
	//    2    4:invokevirtual   #356 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #56  <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #45  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #59  <Method void _flushBuffer()>
		ac = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #43  <Field char[] _outputBuffer>
	//   12   26:astore          5
		int j = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #56  <Field int _outputTail>
	//   15   32:istore          4
		_outputTail = j + 1;
	//   16   34:aload_0         
	//   17   35:iload           4
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #56  <Field int _outputTail>
		ac[j] = '"';
	//   21   42:aload           5
	//   22   44:iload           4
	//   23   46:bipush          34
	//   24   48:castore         
		ac = ((char []) (_ioContext.allocBase64Buffer()));
	//   25   49:aload_0         
	//   26   50:getfield        #192 <Field IOContext _ioContext>
	//   27   53:invokevirtual   #360 <Method byte[] IOContext.allocBase64Buffer()>
	//   28   56:astore          5
		if(i >= 0) goto _L2; else goto _L1
	//   29   58:iload_3         
	//   30   59:ifge            122
_L1:
		i = _writeBinary(base64variant, inputstream, ((byte []) (ac)));
	//   31   62:aload_0         
	//   32   63:aload_1         
	//   33   64:aload_2         
	//   34   65:aload           5
	//   35   67:invokevirtual   #362 <Method int _writeBinary(Base64Variant, InputStream, byte[])>
	//   36   70:istore_3        
_L4:
		_ioContext.releaseBase64Buffer(((byte []) (ac)));
	//   37   71:aload_0         
	//   38   72:getfield        #192 <Field IOContext _ioContext>
	//   39   75:aload           5
	//   40   77:invokevirtual   #366 <Method void IOContext.releaseBase64Buffer(byte[])>
		if(_outputTail >= _outputEnd)
	//*  41   80:aload_0         
	//*  42   81:getfield        #56  <Field int _outputTail>
	//*  43   84:aload_0         
	//*  44   85:getfield        #45  <Field int _outputEnd>
	//*  45   88:icmplt          95
			_flushBuffer();
	//   46   91:aload_0         
	//   47   92:invokevirtual   #59  <Method void _flushBuffer()>
		base64variant = ((Base64Variant) (_outputBuffer));
	//   48   95:aload_0         
	//   49   96:getfield        #43  <Field char[] _outputBuffer>
	//   50   99:astore_1        
		int k = _outputTail;
	//   51  100:aload_0         
	//   52  101:getfield        #56  <Field int _outputTail>
	//   53  104:istore          4
		_outputTail = k + 1;
	//   54  106:aload_0         
	//   55  107:iload           4
	//   56  109:iconst_1        
	//   57  110:iadd            
	//   58  111:putfield        #56  <Field int _outputTail>
		base64variant[k] = '"';
	//   59  114:aload_1         
	//   60  115:iload           4
	//   61  117:bipush          34
	//   62  119:castore         
		return i;
	//   63  120:iload_3         
	//   64  121:ireturn         
_L2:
		int l = _writeBinary(base64variant, inputstream, ((byte []) (ac)), i);
	//   65  122:aload_0         
	//   66  123:aload_1         
	//   67  124:aload_2         
	//   68  125:aload           5
	//   69  127:iload_3         
	//   70  128:invokevirtual   #368 <Method int _writeBinary(Base64Variant, InputStream, byte[], int)>
	//   71  131:istore          4
		if(l <= 0) goto _L4; else goto _L3
	//   72  133:iload           4
	//   73  135:ifle            179
_L3:
		_reportError((new StringBuilder()).append("Too few bytes available: missing ").append(l).append(" bytes (out of ").append(i).append(")").toString());
	//   74  138:aload_0         
	//   75  139:new             #208 <Class StringBuilder>
	//   76  142:dup             
	//   77  143:invokespecial   #210 <Method void StringBuilder()>
	//   78  146:ldc2            #370 <String "Too few bytes available: missing ">
	//   79  149:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   80  152:iload           4
	//   81  154:invokevirtual   #373 <Method StringBuilder StringBuilder.append(int)>
	//   82  157:ldc2            #375 <String " bytes (out of ">
	//   83  160:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   84  163:iload_3         
	//   85  164:invokevirtual   #373 <Method StringBuilder StringBuilder.append(int)>
	//   86  167:ldc2            #377 <String ")">
	//   87  170:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   88  173:invokevirtual   #221 <Method String StringBuilder.toString()>
	//   89  176:invokevirtual   #224 <Method void _reportError(String)>
		  goto _L4
	//*  90  179:goto            71
		base64variant;
	//   91  182:astore_1        
		_ioContext.releaseBase64Buffer(((byte []) (ac)));
	//   92  183:aload_0         
	//   93  184:getfield        #192 <Field IOContext _ioContext>
	//   94  187:aload           5
	//   95  189:invokevirtual   #366 <Method void IOContext.releaseBase64Buffer(byte[])>
		throw base64variant;
	//   96  192:aload_1         
	//   97  193:athrow          
	}

	public void writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
		throws IOException, JsonGenerationException
	{
		_verifyValueWrite("write a binary value");
	//    0    0:aload_0         
	//    1    1:ldc2            #354 <String "write a binary value">
	//    2    4:invokevirtual   #356 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #56  <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #45  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #59  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #43  <Field char[] _outputBuffer>
	//   12   26:astore          6
		int k = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #56  <Field int _outputTail>
	//   15   32:istore          5
		_outputTail = k + 1;
	//   16   34:aload_0         
	//   17   35:iload           5
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #56  <Field int _outputTail>
		ac[k] = '"';
	//   21   42:aload           6
	//   22   44:iload           5
	//   23   46:bipush          34
	//   24   48:castore         
		_writeBinary(base64variant, abyte0, i, i + j);
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:aload_2         
	//   28   52:iload_3         
	//   29   53:iload_3         
	//   30   54:iload           4
	//   31   56:iadd            
	//   32   57:invokevirtual   #379 <Method void _writeBinary(Base64Variant, byte[], int, int)>
		if(_outputTail >= _outputEnd)
	//*  33   60:aload_0         
	//*  34   61:getfield        #56  <Field int _outputTail>
	//*  35   64:aload_0         
	//*  36   65:getfield        #45  <Field int _outputEnd>
	//*  37   68:icmplt          75
			_flushBuffer();
	//   38   71:aload_0         
	//   39   72:invokevirtual   #59  <Method void _flushBuffer()>
		base64variant = ((Base64Variant) (_outputBuffer));
	//   40   75:aload_0         
	//   41   76:getfield        #43  <Field char[] _outputBuffer>
	//   42   79:astore_1        
		i = _outputTail;
	//   43   80:aload_0         
	//   44   81:getfield        #56  <Field int _outputTail>
	//   45   84:istore_3        
		_outputTail = i + 1;
	//   46   85:aload_0         
	//   47   86:iload_3         
	//   48   87:iconst_1        
	//   49   88:iadd            
	//   50   89:putfield        #56  <Field int _outputTail>
		base64variant[i] = '"';
	//   51   92:aload_1         
	//   52   93:iload_3         
	//   53   94:bipush          34
	//   54   96:castore         
	//   55   97:return          
	}

	public void writeBoolean(boolean flag)
		throws IOException
	{
		_verifyValueWrite("write a boolean value");
	//    0    0:aload_0         
	//    1    1:ldc2            #383 <String "write a boolean value">
	//    2    4:invokevirtual   #356 <Method void _verifyValueWrite(String)>
		if(_outputTail + 5 >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #56  <Field int _outputTail>
	//*   5   11:iconst_5        
	//*   6   12:iadd            
	//*   7   13:aload_0         
	//*   8   14:getfield        #45  <Field int _outputEnd>
	//*   9   17:icmplt          24
			_flushBuffer();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #59  <Method void _flushBuffer()>
		int i = _outputTail;
	//   12   24:aload_0         
	//   13   25:getfield        #56  <Field int _outputTail>
	//   14   28:istore_2        
		char ac[] = _outputBuffer;
	//   15   29:aload_0         
	//   16   30:getfield        #43  <Field char[] _outputBuffer>
	//   17   33:astore_3        
		if(flag)
	//*  18   34:iload_1         
	//*  19   35:ifeq            78
		{
			ac[i] = 't';
	//   20   38:aload_3         
	//   21   39:iload_2         
	//   22   40:bipush          116
	//   23   42:castore         
			i++;
	//   24   43:iload_2         
	//   25   44:iconst_1        
	//   26   45:iadd            
	//   27   46:istore_2        
			ac[i] = 'r';
	//   28   47:aload_3         
	//   29   48:iload_2         
	//   30   49:bipush          114
	//   31   51:castore         
			i++;
	//   32   52:iload_2         
	//   33   53:iconst_1        
	//   34   54:iadd            
	//   35   55:istore_2        
			ac[i] = 'u';
	//   36   56:aload_3         
	//   37   57:iload_2         
	//   38   58:bipush          117
	//   39   60:castore         
			i++;
	//   40   61:iload_2         
	//   41   62:iconst_1        
	//   42   63:iadd            
	//   43   64:istore_2        
			ac[i] = 'e';
	//   44   65:aload_3         
	//   45   66:iload_2         
	//   46   67:bipush          101
	//   47   69:castore         
		} else
	//*  48   70:aload_0         
	//*  49   71:iload_2         
	//*  50   72:iconst_1        
	//*  51   73:iadd            
	//*  52   74:putfield        #56  <Field int _outputTail>
	//*  53   77:return          
		{
			ac[i] = 'f';
	//   54   78:aload_3         
	//   55   79:iload_2         
	//   56   80:bipush          102
	//   57   82:castore         
			i++;
	//   58   83:iload_2         
	//   59   84:iconst_1        
	//   60   85:iadd            
	//   61   86:istore_2        
			ac[i] = 'a';
	//   62   87:aload_3         
	//   63   88:iload_2         
	//   64   89:bipush          97
	//   65   91:castore         
			i++;
	//   66   92:iload_2         
	//   67   93:iconst_1        
	//   68   94:iadd            
	//   69   95:istore_2        
			ac[i] = 'l';
	//   70   96:aload_3         
	//   71   97:iload_2         
	//   72   98:bipush          108
	//   73  100:castore         
			i++;
	//   74  101:iload_2         
	//   75  102:iconst_1        
	//   76  103:iadd            
	//   77  104:istore_2        
			ac[i] = 's';
	//   78  105:aload_3         
	//   79  106:iload_2         
	//   80  107:bipush          115
	//   81  109:castore         
			i++;
	//   82  110:iload_2         
	//   83  111:iconst_1        
	//   84  112:iadd            
	//   85  113:istore_2        
			ac[i] = 'e';
	//   86  114:aload_3         
	//   87  115:iload_2         
	//   88  116:bipush          101
	//   89  118:castore         
		}
		_outputTail = i + 1;
	//*  90  119:goto            70
	}

	public void writeEndArray()
		throws IOException, JsonGenerationException
	{
		if(!_writeContext.inArray())
	//*   0    0:aload_0         
	//*   1    1:getfield        #201 <Field JsonWriteContext _writeContext>
	//*   2    4:invokevirtual   #247 <Method boolean JsonWriteContext.inArray()>
	//*   3    7:ifne            40
			_reportError((new StringBuilder()).append("Current context not an ARRAY but ").append(_writeContext.getTypeDesc()).toString());
	//    4   10:aload_0         
	//    5   11:new             #208 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #210 <Method void StringBuilder()>
	//    8   18:ldc2            #385 <String "Current context not an ARRAY but ">
	//    9   21:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #201 <Field JsonWriteContext _writeContext>
	//   12   28:invokevirtual   #388 <Method String JsonWriteContext.getTypeDesc()>
	//   13   31:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:invokevirtual   #221 <Method String StringBuilder.toString()>
	//   15   37:invokevirtual   #224 <Method void _reportError(String)>
		if(_cfgPrettyPrinter != null)
	//*  16   40:aload_0         
	//*  17   41:getfield        #231 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  18   44:ifnull          76
		{
			_cfgPrettyPrinter.writeEndArray(((com.fasterxml.jackson.core.JsonGenerator) (this)), _writeContext.getEntryCount());
	//   19   47:aload_0         
	//   20   48:getfield        #231 <Field PrettyPrinter _cfgPrettyPrinter>
	//   21   51:aload_0         
	//   22   52:aload_0         
	//   23   53:getfield        #201 <Field JsonWriteContext _writeContext>
	//   24   56:invokevirtual   #391 <Method int JsonWriteContext.getEntryCount()>
	//   25   59:invokeinterface #394 <Method void PrettyPrinter.writeEndArray(com.fasterxml.jackson.core.JsonGenerator, int)>
		} else
	//*  26   64:aload_0         
	//*  27   65:aload_0         
	//*  28   66:getfield        #201 <Field JsonWriteContext _writeContext>
	//*  29   69:invokevirtual   #397 <Method JsonWriteContext JsonWriteContext.clearAndGetParent()>
	//*  30   72:putfield        #201 <Field JsonWriteContext _writeContext>
	//*  31   75:return          
		{
			if(_outputTail >= _outputEnd)
	//*  32   76:aload_0         
	//*  33   77:getfield        #56  <Field int _outputTail>
	//*  34   80:aload_0         
	//*  35   81:getfield        #45  <Field int _outputEnd>
	//*  36   84:icmplt          91
				_flushBuffer();
	//   37   87:aload_0         
	//   38   88:invokevirtual   #59  <Method void _flushBuffer()>
			char ac[] = _outputBuffer;
	//   39   91:aload_0         
	//   40   92:getfield        #43  <Field char[] _outputBuffer>
	//   41   95:astore_2        
			int i = _outputTail;
	//   42   96:aload_0         
	//   43   97:getfield        #56  <Field int _outputTail>
	//   44  100:istore_1        
			_outputTail = i + 1;
	//   45  101:aload_0         
	//   46  102:iload_1         
	//   47  103:iconst_1        
	//   48  104:iadd            
	//   49  105:putfield        #56  <Field int _outputTail>
			ac[i] = ']';
	//   50  108:aload_2         
	//   51  109:iload_1         
	//   52  110:bipush          93
	//   53  112:castore         
		}
		_writeContext = _writeContext.clearAndGetParent();
	//*  54  113:goto            64
	}

	public void writeEndObject()
		throws IOException, JsonGenerationException
	{
		if(!_writeContext.inObject())
	//*   0    0:aload_0         
	//*   1    1:getfield        #201 <Field JsonWriteContext _writeContext>
	//*   2    4:invokevirtual   #253 <Method boolean JsonWriteContext.inObject()>
	//*   3    7:ifne            40
			_reportError((new StringBuilder()).append("Current context not an object but ").append(_writeContext.getTypeDesc()).toString());
	//    4   10:aload_0         
	//    5   11:new             #208 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #210 <Method void StringBuilder()>
	//    8   18:ldc2            #399 <String "Current context not an object but ">
	//    9   21:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #201 <Field JsonWriteContext _writeContext>
	//   12   28:invokevirtual   #388 <Method String JsonWriteContext.getTypeDesc()>
	//   13   31:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:invokevirtual   #221 <Method String StringBuilder.toString()>
	//   15   37:invokevirtual   #224 <Method void _reportError(String)>
		if(_cfgPrettyPrinter != null)
	//*  16   40:aload_0         
	//*  17   41:getfield        #231 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  18   44:ifnull          76
		{
			_cfgPrettyPrinter.writeEndObject(((com.fasterxml.jackson.core.JsonGenerator) (this)), _writeContext.getEntryCount());
	//   19   47:aload_0         
	//   20   48:getfield        #231 <Field PrettyPrinter _cfgPrettyPrinter>
	//   21   51:aload_0         
	//   22   52:aload_0         
	//   23   53:getfield        #201 <Field JsonWriteContext _writeContext>
	//   24   56:invokevirtual   #391 <Method int JsonWriteContext.getEntryCount()>
	//   25   59:invokeinterface #401 <Method void PrettyPrinter.writeEndObject(com.fasterxml.jackson.core.JsonGenerator, int)>
		} else
	//*  26   64:aload_0         
	//*  27   65:aload_0         
	//*  28   66:getfield        #201 <Field JsonWriteContext _writeContext>
	//*  29   69:invokevirtual   #397 <Method JsonWriteContext JsonWriteContext.clearAndGetParent()>
	//*  30   72:putfield        #201 <Field JsonWriteContext _writeContext>
	//*  31   75:return          
		{
			if(_outputTail >= _outputEnd)
	//*  32   76:aload_0         
	//*  33   77:getfield        #56  <Field int _outputTail>
	//*  34   80:aload_0         
	//*  35   81:getfield        #45  <Field int _outputEnd>
	//*  36   84:icmplt          91
				_flushBuffer();
	//   37   87:aload_0         
	//   38   88:invokevirtual   #59  <Method void _flushBuffer()>
			char ac[] = _outputBuffer;
	//   39   91:aload_0         
	//   40   92:getfield        #43  <Field char[] _outputBuffer>
	//   41   95:astore_2        
			int i = _outputTail;
	//   42   96:aload_0         
	//   43   97:getfield        #56  <Field int _outputTail>
	//   44  100:istore_1        
			_outputTail = i + 1;
	//   45  101:aload_0         
	//   46  102:iload_1         
	//   47  103:iconst_1        
	//   48  104:iadd            
	//   49  105:putfield        #56  <Field int _outputTail>
			ac[i] = '}';
	//   50  108:aload_2         
	//   51  109:iload_1         
	//   52  110:bipush          125
	//   53  112:castore         
		}
		_writeContext = _writeContext.clearAndGetParent();
	//*  54  113:goto            64
	}

	public void writeFieldName(SerializableString serializablestring)
		throws IOException
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		int i = _writeContext.writeFieldName(serializablestring.getValue());
	//    2    2:aload_0         
	//    3    3:getfield        #201 <Field JsonWriteContext _writeContext>
	//    4    6:aload_1         
	//    5    7:invokeinterface #77  <Method String SerializableString.getValue()>
	//    6   12:invokevirtual   #406 <Method int JsonWriteContext.writeFieldName(String)>
	//    7   15:istore_2        
		if(i == 4)
	//*   8   16:iload_2         
	//*   9   17:iconst_4        
	//*  10   18:icmpne          28
			_reportError("Can not write a field name, expecting a value");
	//   11   21:aload_0         
	//   12   22:ldc2            #408 <String "Can not write a field name, expecting a value">
	//   13   25:invokevirtual   #224 <Method void _reportError(String)>
		if(i != 1)
	//*  14   28:iload_2         
	//*  15   29:iconst_1        
	//*  16   30:icmpne          40
	//*  17   33:aload_0         
	//*  18   34:aload_1         
	//*  19   35:iload_3         
	//*  20   36:invokevirtual   #410 <Method void _writeFieldName(SerializableString, boolean)>
	//*  21   39:return          
			flag = false;
	//   22   40:iconst_0        
	//   23   41:istore_3        
		_writeFieldName(serializablestring, flag);
	//*  24   42:goto            33
	}

	public void writeFieldName(String s)
		throws IOException
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		int i = _writeContext.writeFieldName(s);
	//    2    2:aload_0         
	//    3    3:getfield        #201 <Field JsonWriteContext _writeContext>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #406 <Method int JsonWriteContext.writeFieldName(String)>
	//    6   10:istore_2        
		if(i == 4)
	//*   7   11:iload_2         
	//*   8   12:iconst_4        
	//*   9   13:icmpne          23
			_reportError("Can not write a field name, expecting a value");
	//   10   16:aload_0         
	//   11   17:ldc2            #408 <String "Can not write a field name, expecting a value">
	//   12   20:invokevirtual   #224 <Method void _reportError(String)>
		if(i != 1)
	//*  13   23:iload_2         
	//*  14   24:iconst_1        
	//*  15   25:icmpne          35
	//*  16   28:aload_0         
	//*  17   29:aload_1         
	//*  18   30:iload_3         
	//*  19   31:invokevirtual   #412 <Method void _writeFieldName(String, boolean)>
	//*  20   34:return          
			flag = false;
	//   21   35:iconst_0        
	//   22   36:istore_3        
		_writeFieldName(s, flag);
	//*  23   37:goto            28
	}

	public void writeNull()
		throws IOException
	{
		_verifyValueWrite("write a null");
	//    0    0:aload_0         
	//    1    1:ldc2            #415 <String "write a null">
	//    2    4:invokevirtual   #356 <Method void _verifyValueWrite(String)>
		_writeNull();
	//    3    7:aload_0         
	//    4    8:invokespecial   #417 <Method void _writeNull()>
	//    5   11:return          
	}

	public void writeNumber(double d)
		throws IOException
	{
		if(_cfgNumbersAsStrings || isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS) && (Double.isNaN(d) || Double.isInfinite(d)))
	//*   0    0:aload_0         
	//*   1    1:getfield        #422 <Field boolean _cfgNumbersAsStrings>
	//*   2    4:ifne            31
	//*   3    7:aload_0         
	//*   4    8:getstatic       #425 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.QUOTE_NON_NUMERIC_NUMBERS>
	//*   5   11:invokevirtual   #315 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*   6   14:ifeq            40
	//*   7   17:dload_1         
	//*   8   18:invokestatic    #431 <Method boolean Double.isNaN(double)>
	//*   9   21:ifne            31
	//*  10   24:dload_1         
	//*  11   25:invokestatic    #434 <Method boolean Double.isInfinite(double)>
	//*  12   28:ifeq            40
		{
			writeString(String.valueOf(d));
	//   13   31:aload_0         
	//   14   32:dload_1         
	//   15   33:invokestatic    #438 <Method String String.valueOf(double)>
	//   16   36:invokevirtual   #441 <Method void writeString(String)>
			return;
	//   17   39:return          
		} else
		{
			_verifyValueWrite("write a number");
	//   18   40:aload_0         
	//   19   41:ldc2            #443 <String "write a number">
	//   20   44:invokevirtual   #356 <Method void _verifyValueWrite(String)>
			writeRaw(String.valueOf(d));
	//   21   47:aload_0         
	//   22   48:dload_1         
	//   23   49:invokestatic    #438 <Method String String.valueOf(double)>
	//   24   52:invokevirtual   #150 <Method void writeRaw(String)>
			return;
	//   25   55:return          
		}
	}

	public void writeNumber(float f)
		throws IOException
	{
		if(_cfgNumbersAsStrings || isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS) && (Float.isNaN(f) || Float.isInfinite(f)))
	//*   0    0:aload_0         
	//*   1    1:getfield        #422 <Field boolean _cfgNumbersAsStrings>
	//*   2    4:ifne            31
	//*   3    7:aload_0         
	//*   4    8:getstatic       #425 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.QUOTE_NON_NUMERIC_NUMBERS>
	//*   5   11:invokevirtual   #315 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*   6   14:ifeq            40
	//*   7   17:fload_1         
	//*   8   18:invokestatic    #449 <Method boolean Float.isNaN(float)>
	//*   9   21:ifne            31
	//*  10   24:fload_1         
	//*  11   25:invokestatic    #451 <Method boolean Float.isInfinite(float)>
	//*  12   28:ifeq            40
		{
			writeString(String.valueOf(f));
	//   13   31:aload_0         
	//   14   32:fload_1         
	//   15   33:invokestatic    #454 <Method String String.valueOf(float)>
	//   16   36:invokevirtual   #441 <Method void writeString(String)>
			return;
	//   17   39:return          
		} else
		{
			_verifyValueWrite("write a number");
	//   18   40:aload_0         
	//   19   41:ldc2            #443 <String "write a number">
	//   20   44:invokevirtual   #356 <Method void _verifyValueWrite(String)>
			writeRaw(String.valueOf(f));
	//   21   47:aload_0         
	//   22   48:fload_1         
	//   23   49:invokestatic    #454 <Method String String.valueOf(float)>
	//   24   52:invokevirtual   #150 <Method void writeRaw(String)>
			return;
	//   25   55:return          
		}
	}

	public void writeNumber(int i)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #443 <String "write a number">
	//    2    4:invokevirtual   #356 <Method void _verifyValueWrite(String)>
		if(_cfgNumbersAsStrings)
	//*   3    7:aload_0         
	//*   4    8:getfield        #422 <Field boolean _cfgNumbersAsStrings>
	//*   5   11:ifeq            20
		{
			_writeQuotedInt(i);
	//    6   14:aload_0         
	//    7   15:iload_1         
	//    8   16:invokespecial   #456 <Method void _writeQuotedInt(int)>
			return;
	//    9   19:return          
		}
		if(_outputTail + 11 >= _outputEnd)
	//*  10   20:aload_0         
	//*  11   21:getfield        #56  <Field int _outputTail>
	//*  12   24:bipush          11
	//*  13   26:iadd            
	//*  14   27:aload_0         
	//*  15   28:getfield        #45  <Field int _outputEnd>
	//*  16   31:icmplt          38
			_flushBuffer();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #59  <Method void _flushBuffer()>
		_outputTail = NumberOutput.outputInt(i, _outputBuffer, _outputTail);
	//   19   38:aload_0         
	//   20   39:iload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #43  <Field char[] _outputBuffer>
	//   23   44:aload_0         
	//   24   45:getfield        #56  <Field int _outputTail>
	//   25   48:invokestatic    #140 <Method int NumberOutput.outputInt(int, char[], int)>
	//   26   51:putfield        #56  <Field int _outputTail>
	//   27   54:return          
	}

	public void writeNumber(long l)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #443 <String "write a number">
	//    2    4:invokevirtual   #356 <Method void _verifyValueWrite(String)>
		if(_cfgNumbersAsStrings)
	//*   3    7:aload_0         
	//*   4    8:getfield        #422 <Field boolean _cfgNumbersAsStrings>
	//*   5   11:ifeq            20
		{
			_writeQuotedLong(l);
	//    6   14:aload_0         
	//    7   15:lload_1         
	//    8   16:invokespecial   #458 <Method void _writeQuotedLong(long)>
			return;
	//    9   19:return          
		}
		if(_outputTail + 21 >= _outputEnd)
	//*  10   20:aload_0         
	//*  11   21:getfield        #56  <Field int _outputTail>
	//*  12   24:bipush          21
	//*  13   26:iadd            
	//*  14   27:aload_0         
	//*  15   28:getfield        #45  <Field int _outputEnd>
	//*  16   31:icmplt          38
			_flushBuffer();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #59  <Method void _flushBuffer()>
		_outputTail = NumberOutput.outputLong(l, _outputBuffer, _outputTail);
	//   19   38:aload_0         
	//   20   39:lload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #43  <Field char[] _outputBuffer>
	//   23   44:aload_0         
	//   24   45:getfield        #56  <Field int _outputTail>
	//   25   48:invokestatic    #146 <Method int NumberOutput.outputLong(long, char[], int)>
	//   26   51:putfield        #56  <Field int _outputTail>
	//   27   54:return          
	}

	public void writeNumber(String s)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #443 <String "write a number">
	//    2    4:invokevirtual   #356 <Method void _verifyValueWrite(String)>
		if(_cfgNumbersAsStrings)
	//*   3    7:aload_0         
	//*   4    8:getfield        #422 <Field boolean _cfgNumbersAsStrings>
	//*   5   11:ifeq            20
		{
			_writeQuotedRaw(s);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokespecial   #460 <Method void _writeQuotedRaw(String)>
			return;
	//    9   19:return          
		} else
		{
			writeRaw(s);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #150 <Method void writeRaw(String)>
			return;
	//   13   25:return          
		}
	}

	public void writeNumber(BigDecimal bigdecimal)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #443 <String "write a number">
	//    2    4:invokevirtual   #356 <Method void _verifyValueWrite(String)>
		if(bigdecimal == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       16
		{
			_writeNull();
	//    5   11:aload_0         
	//    6   12:invokespecial   #417 <Method void _writeNull()>
			return;
	//    7   15:return          
		}
		if(_cfgNumbersAsStrings)
	//*   8   16:aload_0         
	//*   9   17:getfield        #422 <Field boolean _cfgNumbersAsStrings>
	//*  10   20:ifeq            52
		{
			if(isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN))
	//*  11   23:aload_0         
	//*  12   24:getstatic       #464 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.WRITE_BIGDECIMAL_AS_PLAIN>
	//*  13   27:invokevirtual   #315 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*  14   30:ifeq            44
				bigdecimal = ((BigDecimal) (bigdecimal.toPlainString()));
	//   15   33:aload_1         
	//   16   34:invokevirtual   #469 <Method String BigDecimal.toPlainString()>
	//   17   37:astore_1        
			else
	//*  18   38:aload_0         
	//*  19   39:aload_1         
	//*  20   40:invokespecial   #460 <Method void _writeQuotedRaw(String)>
	//*  21   43:return          
				bigdecimal = ((BigDecimal) (bigdecimal.toString()));
	//   22   44:aload_1         
	//   23   45:invokevirtual   #470 <Method String BigDecimal.toString()>
	//   24   48:astore_1        
			_writeQuotedRaw(((String) (bigdecimal)));
			return;
		}
	//*  25   49:goto            38
		if(isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN))
	//*  26   52:aload_0         
	//*  27   53:getstatic       #464 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.WRITE_BIGDECIMAL_AS_PLAIN>
	//*  28   56:invokevirtual   #315 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*  29   59:ifeq            71
		{
			writeRaw(bigdecimal.toPlainString());
	//   30   62:aload_0         
	//   31   63:aload_1         
	//   32   64:invokevirtual   #469 <Method String BigDecimal.toPlainString()>
	//   33   67:invokevirtual   #150 <Method void writeRaw(String)>
			return;
	//   34   70:return          
		} else
		{
			writeRaw(bigdecimal.toString());
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:invokevirtual   #470 <Method String BigDecimal.toString()>
	//   38   76:invokevirtual   #150 <Method void writeRaw(String)>
			return;
	//   39   79:return          
		}
	}

	public void writeNumber(BigInteger biginteger)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #443 <String "write a number">
	//    2    4:invokevirtual   #356 <Method void _verifyValueWrite(String)>
		if(biginteger == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       16
		{
			_writeNull();
	//    5   11:aload_0         
	//    6   12:invokespecial   #417 <Method void _writeNull()>
			return;
	//    7   15:return          
		}
		if(_cfgNumbersAsStrings)
	//*   8   16:aload_0         
	//*   9   17:getfield        #422 <Field boolean _cfgNumbersAsStrings>
	//*  10   20:ifeq            32
		{
			_writeQuotedRaw(biginteger.toString());
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #474 <Method String BigInteger.toString()>
	//   14   28:invokespecial   #460 <Method void _writeQuotedRaw(String)>
			return;
	//   15   31:return          
		} else
		{
			writeRaw(biginteger.toString());
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #474 <Method String BigInteger.toString()>
	//   19   37:invokevirtual   #150 <Method void writeRaw(String)>
			return;
	//   20   40:return          
		}
	}

	public void writeNumber(short word0)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #443 <String "write a number">
	//    2    4:invokevirtual   #356 <Method void _verifyValueWrite(String)>
		if(_cfgNumbersAsStrings)
	//*   3    7:aload_0         
	//*   4    8:getfield        #422 <Field boolean _cfgNumbersAsStrings>
	//*   5   11:ifeq            20
		{
			_writeQuotedShort(word0);
	//    6   14:aload_0         
	//    7   15:iload_1         
	//    8   16:invokespecial   #476 <Method void _writeQuotedShort(short)>
			return;
	//    9   19:return          
		}
		if(_outputTail + 6 >= _outputEnd)
	//*  10   20:aload_0         
	//*  11   21:getfield        #56  <Field int _outputTail>
	//*  12   24:bipush          6
	//*  13   26:iadd            
	//*  14   27:aload_0         
	//*  15   28:getfield        #45  <Field int _outputEnd>
	//*  16   31:icmplt          38
			_flushBuffer();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #59  <Method void _flushBuffer()>
		_outputTail = NumberOutput.outputInt(((int) (word0)), _outputBuffer, _outputTail);
	//   19   38:aload_0         
	//   20   39:iload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #43  <Field char[] _outputBuffer>
	//   23   44:aload_0         
	//   24   45:getfield        #56  <Field int _outputTail>
	//   25   48:invokestatic    #140 <Method int NumberOutput.outputInt(int, char[], int)>
	//   26   51:putfield        #56  <Field int _outputTail>
	//   27   54:return          
	}

	public void writeRaw(char c)
		throws IOException
	{
		if(_outputTail >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field int _outputTail>
	//*   2    4:aload_0         
	//*   3    5:getfield        #45  <Field int _outputEnd>
	//*   4    8:icmplt          15
			_flushBuffer();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #59  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #43  <Field char[] _outputBuffer>
	//    9   19:astore_3        
		int i = _outputTail;
	//   10   20:aload_0         
	//   11   21:getfield        #56  <Field int _outputTail>
	//   12   24:istore_2        
		_outputTail = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #56  <Field int _outputTail>
		ac[i] = c;
	//   18   32:aload_3         
	//   19   33:iload_2         
	//   20   34:iload_1         
	//   21   35:castore         
	//   22   36:return          
	}

	public void writeRaw(SerializableString serializablestring)
		throws IOException
	{
		writeRaw(serializablestring.getValue());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #77  <Method String SerializableString.getValue()>
	//    3    7:invokevirtual   #150 <Method void writeRaw(String)>
	//    4   10:return          
	}

	public void writeRaw(String s)
		throws IOException
	{
		int k = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #83  <Method int String.length()>
	//    2    4:istore          4
		int j = _outputEnd - _outputTail;
	//    3    6:aload_0         
	//    4    7:getfield        #45  <Field int _outputEnd>
	//    5   10:aload_0         
	//    6   11:getfield        #56  <Field int _outputTail>
	//    7   14:isub            
	//    8   15:istore_3        
		int i = j;
	//    9   16:iload_3         
	//   10   17:istore_2        
		if(j == 0)
	//*  11   18:iload_3         
	//*  12   19:ifne            36
		{
			_flushBuffer();
	//   13   22:aload_0         
	//   14   23:invokevirtual   #59  <Method void _flushBuffer()>
			i = _outputEnd - _outputTail;
	//   15   26:aload_0         
	//   16   27:getfield        #45  <Field int _outputEnd>
	//   17   30:aload_0         
	//   18   31:getfield        #56  <Field int _outputTail>
	//   19   34:isub            
	//   20   35:istore_2        
		}
		if(i >= k)
	//*  21   36:iload_2         
	//*  22   37:iload           4
	//*  23   39:icmplt          69
		{
			s.getChars(0, k, _outputBuffer, _outputTail);
	//   24   42:aload_1         
	//   25   43:iconst_0        
	//   26   44:iload           4
	//   27   46:aload_0         
	//   28   47:getfield        #43  <Field char[] _outputBuffer>
	//   29   50:aload_0         
	//   30   51:getfield        #56  <Field int _outputTail>
	//   31   54:invokevirtual   #93  <Method void String.getChars(int, int, char[], int)>
			_outputTail = _outputTail + k;
	//   32   57:aload_0         
	//   33   58:aload_0         
	//   34   59:getfield        #56  <Field int _outputTail>
	//   35   62:iload           4
	//   36   64:iadd            
	//   37   65:putfield        #56  <Field int _outputTail>
			return;
	//   38   68:return          
		} else
		{
			writeRawLong(s);
	//   39   69:aload_0         
	//   40   70:aload_1         
	//   41   71:invokespecial   #479 <Method void writeRawLong(String)>
			return;
	//   42   74:return          
		}
	}

	public void writeRaw(String s, int i, int j)
		throws IOException
	{
		int l = _outputEnd - _outputTail;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int _outputEnd>
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field int _outputTail>
	//    4    8:isub            
	//    5    9:istore          5
		int k = l;
	//    6   11:iload           5
	//    7   13:istore          4
		if(l < j)
	//*   8   15:iload           5
	//*   9   17:iload_3         
	//*  10   18:icmpge          36
		{
			_flushBuffer();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #59  <Method void _flushBuffer()>
			k = _outputEnd - _outputTail;
	//   13   25:aload_0         
	//   14   26:getfield        #45  <Field int _outputEnd>
	//   15   29:aload_0         
	//   16   30:getfield        #56  <Field int _outputTail>
	//   17   33:isub            
	//   18   34:istore          4
		}
		if(k >= j)
	//*  19   36:iload           4
	//*  20   38:iload_3         
	//*  21   39:icmplt          69
		{
			s.getChars(i, i + j, _outputBuffer, _outputTail);
	//   22   42:aload_1         
	//   23   43:iload_2         
	//   24   44:iload_2         
	//   25   45:iload_3         
	//   26   46:iadd            
	//   27   47:aload_0         
	//   28   48:getfield        #43  <Field char[] _outputBuffer>
	//   29   51:aload_0         
	//   30   52:getfield        #56  <Field int _outputTail>
	//   31   55:invokevirtual   #93  <Method void String.getChars(int, int, char[], int)>
			_outputTail = _outputTail + j;
	//   32   58:aload_0         
	//   33   59:aload_0         
	//   34   60:getfield        #56  <Field int _outputTail>
	//   35   63:iload_3         
	//   36   64:iadd            
	//   37   65:putfield        #56  <Field int _outputTail>
			return;
	//   38   68:return          
		} else
		{
			writeRawLong(s.substring(i, i + j));
	//   39   69:aload_0         
	//   40   70:aload_1         
	//   41   71:iload_2         
	//   42   72:iload_2         
	//   43   73:iload_3         
	//   44   74:iadd            
	//   45   75:invokevirtual   #484 <Method String String.substring(int, int)>
	//   46   78:invokespecial   #479 <Method void writeRawLong(String)>
			return;
	//   47   81:return          
		}
	}

	public void writeRaw(char ac[], int i, int j)
		throws IOException
	{
		if(j < 32)
	//*   0    0:iload_3         
	//*   1    1:bipush          32
	//*   2    3:icmpge          48
		{
			if(j > _outputEnd - _outputTail)
	//*   3    6:iload_3         
	//*   4    7:aload_0         
	//*   5    8:getfield        #45  <Field int _outputEnd>
	//*   6   11:aload_0         
	//*   7   12:getfield        #56  <Field int _outputTail>
	//*   8   15:isub            
	//*   9   16:icmple          23
				_flushBuffer();
	//   10   19:aload_0         
	//   11   20:invokevirtual   #59  <Method void _flushBuffer()>
			System.arraycopy(((Object) (ac)), i, ((Object) (_outputBuffer)), _outputTail, j);
	//   12   23:aload_1         
	//   13   24:iload_2         
	//   14   25:aload_0         
	//   15   26:getfield        #43  <Field char[] _outputBuffer>
	//   16   29:aload_0         
	//   17   30:getfield        #56  <Field int _outputTail>
	//   18   33:iload_3         
	//   19   34:invokestatic    #182 <Method void System.arraycopy(Object, int, Object, int, int)>
			_outputTail = _outputTail + j;
	//   20   37:aload_0         
	//   21   38:aload_0         
	//   22   39:getfield        #56  <Field int _outputTail>
	//   23   42:iload_3         
	//   24   43:iadd            
	//   25   44:putfield        #56  <Field int _outputTail>
			return;
	//   26   47:return          
		} else
		{
			_flushBuffer();
	//   27   48:aload_0         
	//   28   49:invokevirtual   #59  <Method void _flushBuffer()>
			_writer.write(ac, i, j);
	//   29   52:aload_0         
	//   30   53:getfield        #36  <Field Writer _writer>
	//   31   56:aload_1         
	//   32   57:iload_2         
	//   33   58:iload_3         
	//   34   59:invokevirtual   #101 <Method void Writer.write(char[], int, int)>
			return;
	//   35   62:return          
		}
	}

	public void writeRawUTF8String(byte abyte0[], int i, int j)
		throws IOException
	{
		_reportUnsupportedOperation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #489 <Method void _reportUnsupportedOperation()>
	//    2    4:return          
	}

	public void writeStartArray()
		throws IOException, JsonGenerationException
	{
		_verifyValueWrite("start an array");
	//    0    0:aload_0         
	//    1    1:ldc2            #492 <String "start an array">
	//    2    4:invokevirtual   #356 <Method void _verifyValueWrite(String)>
		_writeContext = _writeContext.createChildArrayContext();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #201 <Field JsonWriteContext _writeContext>
	//    6   12:invokevirtual   #495 <Method JsonWriteContext JsonWriteContext.createChildArrayContext()>
	//    7   15:putfield        #201 <Field JsonWriteContext _writeContext>
		if(_cfgPrettyPrinter != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #231 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  10   22:ifnull          36
		{
			_cfgPrettyPrinter.writeStartArray(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   11   25:aload_0         
	//   12   26:getfield        #231 <Field PrettyPrinter _cfgPrettyPrinter>
	//   13   29:aload_0         
	//   14   30:invokeinterface #497 <Method void PrettyPrinter.writeStartArray(com.fasterxml.jackson.core.JsonGenerator)>
			return;
	//   15   35:return          
		}
		if(_outputTail >= _outputEnd)
	//*  16   36:aload_0         
	//*  17   37:getfield        #56  <Field int _outputTail>
	//*  18   40:aload_0         
	//*  19   41:getfield        #45  <Field int _outputEnd>
	//*  20   44:icmplt          51
			_flushBuffer();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #59  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//   23   51:aload_0         
	//   24   52:getfield        #43  <Field char[] _outputBuffer>
	//   25   55:astore_2        
		int i = _outputTail;
	//   26   56:aload_0         
	//   27   57:getfield        #56  <Field int _outputTail>
	//   28   60:istore_1        
		_outputTail = i + 1;
	//   29   61:aload_0         
	//   30   62:iload_1         
	//   31   63:iconst_1        
	//   32   64:iadd            
	//   33   65:putfield        #56  <Field int _outputTail>
		ac[i] = '[';
	//   34   68:aload_2         
	//   35   69:iload_1         
	//   36   70:bipush          91
	//   37   72:castore         
	//   38   73:return          
	}

	public void writeStartObject()
		throws IOException, JsonGenerationException
	{
		_verifyValueWrite("start an object");
	//    0    0:aload_0         
	//    1    1:ldc2            #500 <String "start an object">
	//    2    4:invokevirtual   #356 <Method void _verifyValueWrite(String)>
		_writeContext = _writeContext.createChildObjectContext();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #201 <Field JsonWriteContext _writeContext>
	//    6   12:invokevirtual   #503 <Method JsonWriteContext JsonWriteContext.createChildObjectContext()>
	//    7   15:putfield        #201 <Field JsonWriteContext _writeContext>
		if(_cfgPrettyPrinter != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #231 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  10   22:ifnull          36
		{
			_cfgPrettyPrinter.writeStartObject(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   11   25:aload_0         
	//   12   26:getfield        #231 <Field PrettyPrinter _cfgPrettyPrinter>
	//   13   29:aload_0         
	//   14   30:invokeinterface #505 <Method void PrettyPrinter.writeStartObject(com.fasterxml.jackson.core.JsonGenerator)>
			return;
	//   15   35:return          
		}
		if(_outputTail >= _outputEnd)
	//*  16   36:aload_0         
	//*  17   37:getfield        #56  <Field int _outputTail>
	//*  18   40:aload_0         
	//*  19   41:getfield        #45  <Field int _outputEnd>
	//*  20   44:icmplt          51
			_flushBuffer();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #59  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//   23   51:aload_0         
	//   24   52:getfield        #43  <Field char[] _outputBuffer>
	//   25   55:astore_2        
		int i = _outputTail;
	//   26   56:aload_0         
	//   27   57:getfield        #56  <Field int _outputTail>
	//   28   60:istore_1        
		_outputTail = i + 1;
	//   29   61:aload_0         
	//   30   62:iload_1         
	//   31   63:iconst_1        
	//   32   64:iadd            
	//   33   65:putfield        #56  <Field int _outputTail>
		ac[i] = '{';
	//   34   68:aload_2         
	//   35   69:iload_1         
	//   36   70:bipush          123
	//   37   72:castore         
	//   38   73:return          
	}

	public void writeString(SerializableString serializablestring)
		throws IOException
	{
		_verifyValueWrite("write a string");
	//    0    0:aload_0         
	//    1    1:ldc2            #507 <String "write a string">
	//    2    4:invokevirtual   #356 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #56  <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #45  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #59  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #43  <Field char[] _outputBuffer>
	//   12   26:astore_3        
		int i = _outputTail;
	//   13   27:aload_0         
	//   14   28:getfield        #56  <Field int _outputTail>
	//   15   31:istore_2        
		_outputTail = i + 1;
	//   16   32:aload_0         
	//   17   33:iload_2         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:putfield        #56  <Field int _outputTail>
		ac[i] = '"';
	//   21   39:aload_3         
	//   22   40:iload_2         
	//   23   41:bipush          34
	//   24   43:castore         
		serializablestring = ((SerializableString) (serializablestring.asQuotedChars()));
	//   25   44:aload_1         
	//   26   45:invokeinterface #288 <Method char[] SerializableString.asQuotedChars()>
	//   27   50:astore_1        
		i = serializablestring.length;
	//   28   51:aload_1         
	//   29   52:arraylength     
	//   30   53:istore_2        
		if(i < 32)
	//*  31   54:iload_2         
	//*  32   55:bipush          32
	//*  33   57:icmpge          139
		{
			if(i > _outputEnd - _outputTail)
	//*  34   60:iload_2         
	//*  35   61:aload_0         
	//*  36   62:getfield        #45  <Field int _outputEnd>
	//*  37   65:aload_0         
	//*  38   66:getfield        #56  <Field int _outputTail>
	//*  39   69:isub            
	//*  40   70:icmple          77
				_flushBuffer();
	//   41   73:aload_0         
	//   42   74:invokevirtual   #59  <Method void _flushBuffer()>
			System.arraycopy(((Object) (serializablestring)), 0, ((Object) (_outputBuffer)), _outputTail, i);
	//   43   77:aload_1         
	//   44   78:iconst_0        
	//   45   79:aload_0         
	//   46   80:getfield        #43  <Field char[] _outputBuffer>
	//   47   83:aload_0         
	//   48   84:getfield        #56  <Field int _outputTail>
	//   49   87:iload_2         
	//   50   88:invokestatic    #182 <Method void System.arraycopy(Object, int, Object, int, int)>
			_outputTail = _outputTail + i;
	//   51   91:aload_0         
	//   52   92:aload_0         
	//   53   93:getfield        #56  <Field int _outputTail>
	//   54   96:iload_2         
	//   55   97:iadd            
	//   56   98:putfield        #56  <Field int _outputTail>
		} else
	//*  57  101:aload_0         
	//*  58  102:getfield        #56  <Field int _outputTail>
	//*  59  105:aload_0         
	//*  60  106:getfield        #45  <Field int _outputEnd>
	//*  61  109:icmplt          116
	//*  62  112:aload_0         
	//*  63  113:invokevirtual   #59  <Method void _flushBuffer()>
	//*  64  116:aload_0         
	//*  65  117:getfield        #43  <Field char[] _outputBuffer>
	//*  66  120:astore_1        
	//*  67  121:aload_0         
	//*  68  122:getfield        #56  <Field int _outputTail>
	//*  69  125:istore_2        
	//*  70  126:aload_0         
	//*  71  127:iload_2         
	//*  72  128:iconst_1        
	//*  73  129:iadd            
	//*  74  130:putfield        #56  <Field int _outputTail>
	//*  75  133:aload_1         
	//*  76  134:iload_2         
	//*  77  135:bipush          34
	//*  78  137:castore         
	//*  79  138:return          
		{
			_flushBuffer();
	//   80  139:aload_0         
	//   81  140:invokevirtual   #59  <Method void _flushBuffer()>
			_writer.write(((char []) (serializablestring)), 0, i);
	//   82  143:aload_0         
	//   83  144:getfield        #36  <Field Writer _writer>
	//   84  147:aload_1         
	//   85  148:iconst_0        
	//   86  149:iload_2         
	//   87  150:invokevirtual   #101 <Method void Writer.write(char[], int, int)>
		}
		if(_outputTail >= _outputEnd)
			_flushBuffer();
		serializablestring = ((SerializableString) (_outputBuffer));
		i = _outputTail;
		_outputTail = i + 1;
		serializablestring[i] = '"';
	//*  88  153:goto            101
	}

	public void writeString(String s)
		throws IOException
	{
		_verifyValueWrite("write a string");
	//    0    0:aload_0         
	//    1    1:ldc2            #507 <String "write a string">
	//    2    4:invokevirtual   #356 <Method void _verifyValueWrite(String)>
		if(s == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       16
		{
			_writeNull();
	//    5   11:aload_0         
	//    6   12:invokespecial   #417 <Method void _writeNull()>
			return;
	//    7   15:return          
		}
		if(_outputTail >= _outputEnd)
	//*   8   16:aload_0         
	//*   9   17:getfield        #56  <Field int _outputTail>
	//*  10   20:aload_0         
	//*  11   21:getfield        #45  <Field int _outputEnd>
	//*  12   24:icmplt          31
			_flushBuffer();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #59  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//   15   31:aload_0         
	//   16   32:getfield        #43  <Field char[] _outputBuffer>
	//   17   35:astore_3        
		int i = _outputTail;
	//   18   36:aload_0         
	//   19   37:getfield        #56  <Field int _outputTail>
	//   20   40:istore_2        
		_outputTail = i + 1;
	//   21   41:aload_0         
	//   22   42:iload_2         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:putfield        #56  <Field int _outputTail>
		ac[i] = '"';
	//   26   48:aload_3         
	//   27   49:iload_2         
	//   28   50:bipush          34
	//   29   52:castore         
		_writeString(s);
	//   30   53:aload_0         
	//   31   54:aload_1         
	//   32   55:invokespecial   #299 <Method void _writeString(String)>
		if(_outputTail >= _outputEnd)
	//*  33   58:aload_0         
	//*  34   59:getfield        #56  <Field int _outputTail>
	//*  35   62:aload_0         
	//*  36   63:getfield        #45  <Field int _outputEnd>
	//*  37   66:icmplt          73
			_flushBuffer();
	//   38   69:aload_0         
	//   39   70:invokevirtual   #59  <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//   40   73:aload_0         
	//   41   74:getfield        #43  <Field char[] _outputBuffer>
	//   42   77:astore_1        
		i = _outputTail;
	//   43   78:aload_0         
	//   44   79:getfield        #56  <Field int _outputTail>
	//   45   82:istore_2        
		_outputTail = i + 1;
	//   46   83:aload_0         
	//   47   84:iload_2         
	//   48   85:iconst_1        
	//   49   86:iadd            
	//   50   87:putfield        #56  <Field int _outputTail>
		s[i] = '"';
	//   51   90:aload_1         
	//   52   91:iload_2         
	//   53   92:bipush          34
	//   54   94:castore         
	//   55   95:return          
	}

	public void writeString(char ac[], int i, int j)
		throws IOException
	{
		_verifyValueWrite("write a string");
	//    0    0:aload_0         
	//    1    1:ldc2            #507 <String "write a string">
	//    2    4:invokevirtual   #356 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #56  <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #45  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #59  <Method void _flushBuffer()>
		char ac1[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #43  <Field char[] _outputBuffer>
	//   12   26:astore          5
		int k = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #56  <Field int _outputTail>
	//   15   32:istore          4
		_outputTail = k + 1;
	//   16   34:aload_0         
	//   17   35:iload           4
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #56  <Field int _outputTail>
		ac1[k] = '"';
	//   21   42:aload           5
	//   22   44:iload           4
	//   23   46:bipush          34
	//   24   48:castore         
		_writeString(ac, i, j);
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:iload_2         
	//   28   52:iload_3         
	//   29   53:invokespecial   #509 <Method void _writeString(char[], int, int)>
		if(_outputTail >= _outputEnd)
	//*  30   56:aload_0         
	//*  31   57:getfield        #56  <Field int _outputTail>
	//*  32   60:aload_0         
	//*  33   61:getfield        #45  <Field int _outputEnd>
	//*  34   64:icmplt          71
			_flushBuffer();
	//   35   67:aload_0         
	//   36   68:invokevirtual   #59  <Method void _flushBuffer()>
		ac = _outputBuffer;
	//   37   71:aload_0         
	//   38   72:getfield        #43  <Field char[] _outputBuffer>
	//   39   75:astore_1        
		i = _outputTail;
	//   40   76:aload_0         
	//   41   77:getfield        #56  <Field int _outputTail>
	//   42   80:istore_2        
		_outputTail = i + 1;
	//   43   81:aload_0         
	//   44   82:iload_2         
	//   45   83:iconst_1        
	//   46   84:iadd            
	//   47   85:putfield        #56  <Field int _outputTail>
		ac[i] = '"';
	//   48   88:aload_1         
	//   49   89:iload_2         
	//   50   90:bipush          34
	//   51   92:castore         
	//   52   93:return          
	}

	public void writeUTF8String(byte abyte0[], int i, int j)
		throws IOException
	{
		_reportUnsupportedOperation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #489 <Method void _reportUnsupportedOperation()>
	//    2    4:return          
	}

	protected static final char HEX_CHARS[] = CharTypes.copyHexChars();
	protected static final int SHORT_WRITE = 32;
	protected SerializableString _currentEscape;
	protected char _entityBuffer[];
	protected char _outputBuffer[];
	protected int _outputEnd;
	protected int _outputHead;
	protected int _outputTail;
	protected final Writer _writer;

	static 
	{
	//    0    0:invokestatic    #26  <Method char[] CharTypes.copyHexChars()>
	//    1    3:putstatic       #28  <Field char[] HEX_CHARS>
	//*   2    6:return          
	}
}
