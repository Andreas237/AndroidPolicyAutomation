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
	//    4    4:invokespecial   #36  <Method void JsonGeneratorImpl(IOContext, int, ObjectCodec)>
		_quoteChar = '"';
	//    5    7:aload_0         
	//    6    8:bipush          34
	//    7   10:putfield        #38  <Field char _quoteChar>
		_writer = writer;
	//    8   13:aload_0         
	//    9   14:aload           4
	//   10   16:putfield        #40  <Field Writer _writer>
		_outputBuffer = iocontext.allocConcatBuffer();
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #45  <Method char[] IOContext.allocConcatBuffer()>
	//   14   24:putfield        #47  <Field char[] _outputBuffer>
		_outputEnd = _outputBuffer.length;
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #47  <Field char[] _outputBuffer>
	//   18   32:arraylength     
	//   19   33:putfield        #49  <Field int _outputEnd>
	//   20   36:return          
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
	//   33   44:putfield        #52  <Field char[] _entityBuffer>
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
	//*   3    5:getfield        #60  <Field int _outputTail>
	//*   4    8:iconst_2        
	//*   5    9:iadd            
	//*   6   10:aload_0         
	//*   7   11:getfield        #49  <Field int _outputEnd>
	//*   8   14:icmple          21
				_flushBuffer();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #63  <Method void _flushBuffer()>
			char ac[] = _outputBuffer;
	//   11   21:aload_0         
	//   12   22:getfield        #47  <Field char[] _outputBuffer>
	//   13   25:astore          5
			c = ((char) (_outputTail));
	//   14   27:aload_0         
	//   15   28:getfield        #60  <Field int _outputTail>
	//   16   31:istore_1        
			_outputTail = c + 1;
	//   17   32:aload_0         
	//   18   33:iload_1         
	//   19   34:iconst_1        
	//   20   35:iadd            
	//   21   36:putfield        #60  <Field int _outputTail>
			ac[c] = '\\';
	//   22   39:aload           5
	//   23   41:iload_1         
	//   24   42:bipush          92
	//   25   44:castore         
			ac = _outputBuffer;
	//   26   45:aload_0         
	//   27   46:getfield        #47  <Field char[] _outputBuffer>
	//   28   49:astore          5
			c = ((char) (_outputTail));
	//   29   51:aload_0         
	//   30   52:getfield        #60  <Field int _outputTail>
	//   31   55:istore_1        
			_outputTail = c + 1;
	//   32   56:aload_0         
	//   33   57:iload_1         
	//   34   58:iconst_1        
	//   35   59:iadd            
	//   36   60:putfield        #60  <Field int _outputTail>
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
	//*  47   77:getfield        #60  <Field int _outputTail>
	//*  48   80:iconst_5        
	//*  49   81:iadd            
	//*  50   82:aload_0         
	//*  51   83:getfield        #49  <Field int _outputEnd>
	//*  52   86:icmplt          93
				_flushBuffer();
	//   53   89:aload_0         
	//   54   90:invokevirtual   #63  <Method void _flushBuffer()>
			i = _outputTail;
	//   55   93:aload_0         
	//   56   94:getfield        #60  <Field int _outputTail>
	//   57   97:istore_2        
			char ac1[] = _outputBuffer;
	//   58   98:aload_0         
	//   59   99:getfield        #47  <Field char[] _outputBuffer>
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
	//*  79  128:icmple          184
			{
				j = 0xff & c >> 8;
	//   80  131:sipush          255
	//   81  134:iload_1         
	//   82  135:bipush          8
	//   83  137:ishr            
	//   84  138:iand            
	//   85  139:istore_3        
				int k = i + 1;
	//   86  140:iload_2         
	//   87  141:iconst_1        
	//   88  142:iadd            
	//   89  143:istore          4
				ac1[i] = HEX_CHARS[j >> 4];
	//   90  145:aload           5
	//   91  147:iload_2         
	//   92  148:getstatic       #30  <Field char[] HEX_CHARS>
	//   93  151:iload_3         
	//   94  152:iconst_4        
	//   95  153:ishr            
	//   96  154:caload          
	//   97  155:castore         
				i = k + 1;
	//   98  156:iload           4
	//   99  158:iconst_1        
	//  100  159:iadd            
	//  101  160:istore_2        
				ac1[k] = HEX_CHARS[j & 0xf];
	//  102  161:aload           5
	//  103  163:iload           4
	//  104  165:getstatic       #30  <Field char[] HEX_CHARS>
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
	//* 115  181:goto            204
			{
				j = i + 1;
	//  116  184:iload_2         
	//  117  185:iconst_1        
	//  118  186:iadd            
	//  119  187:istore_3        
				ac1[i] = '0';
	//  120  188:aload           5
	//  121  190:iload_2         
	//  122  191:bipush          48
	//  123  193:castore         
				i = j + 1;
	//  124  194:iload_3         
	//  125  195:iconst_1        
	//  126  196:iadd            
	//  127  197:istore_2        
				ac1[j] = '0';
	//  128  198:aload           5
	//  129  200:iload_3         
	//  130  201:bipush          48
	//  131  203:castore         
			}
			j = i + 1;
	//  132  204:iload_2         
	//  133  205:iconst_1        
	//  134  206:iadd            
	//  135  207:istore_3        
			ac1[i] = HEX_CHARS[c >> 4];
	//  136  208:aload           5
	//  137  210:iload_2         
	//  138  211:getstatic       #30  <Field char[] HEX_CHARS>
	//  139  214:iload_1         
	//  140  215:iconst_4        
	//  141  216:ishr            
	//  142  217:caload          
	//  143  218:castore         
			ac1[j] = HEX_CHARS[c & 0xf];
	//  144  219:aload           5
	//  145  221:iload_3         
	//  146  222:getstatic       #30  <Field char[] HEX_CHARS>
	//  147  225:iload_1         
	//  148  226:bipush          15
	//  149  228:iand            
	//  150  229:caload          
	//  151  230:castore         
			_outputTail = j + 1;
	//  152  231:aload_0         
	//  153  232:iload_3         
	//  154  233:iconst_1        
	//  155  234:iadd            
	//  156  235:putfield        #60  <Field int _outputTail>
			return;
	//  157  238:return          
		}
		String s;
		if(_currentEscape == null)
	//* 158  239:aload_0         
	//* 159  240:getfield        #65  <Field SerializableString _currentEscape>
	//* 160  243:ifnonnull       264
		{
			s = _characterEscapes.getEscapeSequence(((int) (c))).getValue();
	//  161  246:aload_0         
	//  162  247:getfield        #69  <Field CharacterEscapes _characterEscapes>
	//  163  250:iload_1         
	//  164  251:invokevirtual   #75  <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//  165  254:invokeinterface #81  <Method String SerializableString.getValue()>
	//  166  259:astore          5
		} else
	//* 167  261:goto            280
		{
			s = _currentEscape.getValue();
	//  168  264:aload_0         
	//  169  265:getfield        #65  <Field SerializableString _currentEscape>
	//  170  268:invokeinterface #81  <Method String SerializableString.getValue()>
	//  171  273:astore          5
			_currentEscape = null;
	//  172  275:aload_0         
	//  173  276:aconst_null     
	//  174  277:putfield        #65  <Field SerializableString _currentEscape>
		}
		c = ((char) (s.length()));
	//  175  280:aload           5
	//  176  282:invokevirtual   #87  <Method int String.length()>
	//  177  285:istore_1        
		if(_outputTail + c > _outputEnd)
	//* 178  286:aload_0         
	//* 179  287:getfield        #60  <Field int _outputTail>
	//* 180  290:iload_1         
	//* 181  291:iadd            
	//* 182  292:aload_0         
	//* 183  293:getfield        #49  <Field int _outputEnd>
	//* 184  296:icmple          321
		{
			_flushBuffer();
	//  185  299:aload_0         
	//  186  300:invokevirtual   #63  <Method void _flushBuffer()>
			if(c > _outputEnd)
	//* 187  303:iload_1         
	//* 188  304:aload_0         
	//* 189  305:getfield        #49  <Field int _outputEnd>
	//* 190  308:icmple          321
			{
				_writer.write(s);
	//  191  311:aload_0         
	//  192  312:getfield        #40  <Field Writer _writer>
	//  193  315:aload           5
	//  194  317:invokevirtual   #93  <Method void Writer.write(String)>
				return;
	//  195  320:return          
			}
		}
		s.getChars(0, ((int) (c)), _outputBuffer, _outputTail);
	//  196  321:aload           5
	//  197  323:iconst_0        
	//  198  324:iload_1         
	//  199  325:aload_0         
	//  200  326:getfield        #47  <Field char[] _outputBuffer>
	//  201  329:aload_0         
	//  202  330:getfield        #60  <Field int _outputTail>
	//  203  333:invokevirtual   #97  <Method void String.getChars(int, int, char[], int)>
		_outputTail = _outputTail + c;
	//  204  336:aload_0         
	//  205  337:aload_0         
	//  206  338:getfield        #60  <Field int _outputTail>
	//  207  341:iload_1         
	//  208  342:iadd            
	//  209  343:putfield        #60  <Field int _outputTail>
	//  210  346:return          
	}

	private int _prependOrWriteCharacterEscape(char ac[], int i, int j, char c, int k)
		throws IOException, JsonGenerationException
	{
		if(k >= 0)
	//*   0    0:iload           5
	//*   1    2:iflt            71
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
				return i;
	//   23   32:iload_2         
	//   24   33:ireturn         
			}
			char ac1[] = _entityBuffer;
	//   25   34:aload_0         
	//   26   35:getfield        #52  <Field char[] _entityBuffer>
	//   27   38:astore          6
			ac = ac1;
	//   28   40:aload           6
	//   29   42:astore_1        
			if(ac1 == null)
	//*  30   43:aload           6
	//*  31   45:ifnonnull       53
				ac = _allocateEntityBuffer();
	//   32   48:aload_0         
	//   33   49:invokespecial   #102 <Method char[] _allocateEntityBuffer()>
	//   34   52:astore_1        
			ac[1] = (char)k;
	//   35   53:aload_1         
	//   36   54:iconst_1        
	//   37   55:iload           5
	//   38   57:int2char        
	//   39   58:castore         
			_writer.write(ac, 0, 2);
	//   40   59:aload_0         
	//   41   60:getfield        #40  <Field Writer _writer>
	//   42   63:aload_1         
	//   43   64:iconst_0        
	//   44   65:iconst_2        
	//   45   66:invokevirtual   #105 <Method void Writer.write(char[], int, int)>
			return i;
	//   46   69:iload_2         
	//   47   70:ireturn         
		}
		if(k != -2)
	//*  48   71:iload           5
	//*  49   73:bipush          -2
	//*  50   75:icmpeq          375
		{
			if(i > 5 && i < j)
	//*  51   78:iload_2         
	//*  52   79:iconst_5        
	//*  53   80:icmple          222
	//*  54   83:iload_2         
	//*  55   84:iload_3         
	//*  56   85:icmpge          222
			{
				i -= 6;
	//   57   88:iload_2         
	//   58   89:bipush          6
	//   59   91:isub            
	//   60   92:istore_2        
				j = i + 1;
	//   61   93:iload_2         
	//   62   94:iconst_1        
	//   63   95:iadd            
	//   64   96:istore_3        
				ac[i] = '\\';
	//   65   97:aload_1         
	//   66   98:iload_2         
	//   67   99:bipush          92
	//   68  101:castore         
				i = j + 1;
	//   69  102:iload_3         
	//   70  103:iconst_1        
	//   71  104:iadd            
	//   72  105:istore_2        
				ac[j] = 'u';
	//   73  106:aload_1         
	//   74  107:iload_3         
	//   75  108:bipush          117
	//   76  110:castore         
				if(c > '\377')
	//*  77  111:iload           4
	//*  78  113:sipush          255
	//*  79  116:icmple          173
				{
					j = c >> 8 & 0xff;
	//   80  119:iload           4
	//   81  121:bipush          8
	//   82  123:ishr            
	//   83  124:sipush          255
	//   84  127:iand            
	//   85  128:istore_3        
					k = i + 1;
	//   86  129:iload_2         
	//   87  130:iconst_1        
	//   88  131:iadd            
	//   89  132:istore          5
					ac[i] = HEX_CHARS[j >> 4];
	//   90  134:aload_1         
	//   91  135:iload_2         
	//   92  136:getstatic       #30  <Field char[] HEX_CHARS>
	//   93  139:iload_3         
	//   94  140:iconst_4        
	//   95  141:ishr            
	//   96  142:caload          
	//   97  143:castore         
					i = k + 1;
	//   98  144:iload           5
	//   99  146:iconst_1        
	//  100  147:iadd            
	//  101  148:istore_2        
					ac[k] = HEX_CHARS[j & 0xf];
	//  102  149:aload_1         
	//  103  150:iload           5
	//  104  152:getstatic       #30  <Field char[] HEX_CHARS>
	//  105  155:iload_3         
	//  106  156:bipush          15
	//  107  158:iand            
	//  108  159:caload          
	//  109  160:castore         
					c &= '\377';
	//  110  161:iload           4
	//  111  163:sipush          255
	//  112  166:iand            
	//  113  167:int2char        
	//  114  168:istore          4
				} else
	//* 115  170:goto            191
				{
					j = i + 1;
	//  116  173:iload_2         
	//  117  174:iconst_1        
	//  118  175:iadd            
	//  119  176:istore_3        
					ac[i] = '0';
	//  120  177:aload_1         
	//  121  178:iload_2         
	//  122  179:bipush          48
	//  123  181:castore         
					i = j + 1;
	//  124  182:iload_3         
	//  125  183:iconst_1        
	//  126  184:iadd            
	//  127  185:istore_2        
					ac[j] = '0';
	//  128  186:aload_1         
	//  129  187:iload_3         
	//  130  188:bipush          48
	//  131  190:castore         
				}
				j = i + 1;
	//  132  191:iload_2         
	//  133  192:iconst_1        
	//  134  193:iadd            
	//  135  194:istore_3        
				ac[i] = HEX_CHARS[c >> 4];
	//  136  195:aload_1         
	//  137  196:iload_2         
	//  138  197:getstatic       #30  <Field char[] HEX_CHARS>
	//  139  200:iload           4
	//  140  202:iconst_4        
	//  141  203:ishr            
	//  142  204:caload          
	//  143  205:castore         
				ac[j] = HEX_CHARS[c & 0xf];
	//  144  206:aload_1         
	//  145  207:iload_3         
	//  146  208:getstatic       #30  <Field char[] HEX_CHARS>
	//  147  211:iload           4
	//  148  213:bipush          15
	//  149  215:iand            
	//  150  216:caload          
	//  151  217:castore         
				return j - 5;
	//  152  218:iload_3         
	//  153  219:iconst_5        
	//  154  220:isub            
	//  155  221:ireturn         
			}
			char ac2[] = _entityBuffer;
	//  156  222:aload_0         
	//  157  223:getfield        #52  <Field char[] _entityBuffer>
	//  158  226:astore          6
			ac = ac2;
	//  159  228:aload           6
	//  160  230:astore_1        
			if(ac2 == null)
	//* 161  231:aload           6
	//* 162  233:ifnonnull       241
				ac = _allocateEntityBuffer();
	//  163  236:aload_0         
	//  164  237:invokespecial   #102 <Method char[] _allocateEntityBuffer()>
	//  165  240:astore_1        
			_outputHead = _outputTail;
	//  166  241:aload_0         
	//  167  242:aload_0         
	//  168  243:getfield        #60  <Field int _outputTail>
	//  169  246:putfield        #107 <Field int _outputHead>
			if(c > '\377')
	//* 170  249:iload           4
	//* 171  251:sipush          255
	//* 172  254:icmple          337
			{
				j = c >> 8 & 0xff;
	//  173  257:iload           4
	//  174  259:bipush          8
	//  175  261:ishr            
	//  176  262:sipush          255
	//  177  265:iand            
	//  178  266:istore_3        
				c &= '\377';
	//  179  267:iload           4
	//  180  269:sipush          255
	//  181  272:iand            
	//  182  273:istore          4
				ac[10] = HEX_CHARS[j >> 4];
	//  183  275:aload_1         
	//  184  276:bipush          10
	//  185  278:getstatic       #30  <Field char[] HEX_CHARS>
	//  186  281:iload_3         
	//  187  282:iconst_4        
	//  188  283:ishr            
	//  189  284:caload          
	//  190  285:castore         
				ac[11] = HEX_CHARS[j & 0xf];
	//  191  286:aload_1         
	//  192  287:bipush          11
	//  193  289:getstatic       #30  <Field char[] HEX_CHARS>
	//  194  292:iload_3         
	//  195  293:bipush          15
	//  196  295:iand            
	//  197  296:caload          
	//  198  297:castore         
				ac[12] = HEX_CHARS[c >> 4];
	//  199  298:aload_1         
	//  200  299:bipush          12
	//  201  301:getstatic       #30  <Field char[] HEX_CHARS>
	//  202  304:iload           4
	//  203  306:iconst_4        
	//  204  307:ishr            
	//  205  308:caload          
	//  206  309:castore         
				ac[13] = HEX_CHARS[c & 0xf];
	//  207  310:aload_1         
	//  208  311:bipush          13
	//  209  313:getstatic       #30  <Field char[] HEX_CHARS>
	//  210  316:iload           4
	//  211  318:bipush          15
	//  212  320:iand            
	//  213  321:caload          
	//  214  322:castore         
				_writer.write(ac, 8, 6);
	//  215  323:aload_0         
	//  216  324:getfield        #40  <Field Writer _writer>
	//  217  327:aload_1         
	//  218  328:bipush          8
	//  219  330:bipush          6
	//  220  332:invokevirtual   #105 <Method void Writer.write(char[], int, int)>
				return i;
	//  221  335:iload_2         
	//  222  336:ireturn         
			} else
			{
				ac[6] = HEX_CHARS[c >> 4];
	//  223  337:aload_1         
	//  224  338:bipush          6
	//  225  340:getstatic       #30  <Field char[] HEX_CHARS>
	//  226  343:iload           4
	//  227  345:iconst_4        
	//  228  346:ishr            
	//  229  347:caload          
	//  230  348:castore         
				ac[7] = HEX_CHARS[c & 0xf];
	//  231  349:aload_1         
	//  232  350:bipush          7
	//  233  352:getstatic       #30  <Field char[] HEX_CHARS>
	//  234  355:iload           4
	//  235  357:bipush          15
	//  236  359:iand            
	//  237  360:caload          
	//  238  361:castore         
				_writer.write(ac, 2, 6);
	//  239  362:aload_0         
	//  240  363:getfield        #40  <Field Writer _writer>
	//  241  366:aload_1         
	//  242  367:iconst_2        
	//  243  368:bipush          6
	//  244  370:invokevirtual   #105 <Method void Writer.write(char[], int, int)>
				return i;
	//  245  373:iload_2         
	//  246  374:ireturn         
			}
		}
		String s;
		if(_currentEscape == null)
	//* 247  375:aload_0         
	//* 248  376:getfield        #65  <Field SerializableString _currentEscape>
	//* 249  379:ifnonnull       401
		{
			s = _characterEscapes.getEscapeSequence(((int) (c))).getValue();
	//  250  382:aload_0         
	//  251  383:getfield        #69  <Field CharacterEscapes _characterEscapes>
	//  252  386:iload           4
	//  253  388:invokevirtual   #75  <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//  254  391:invokeinterface #81  <Method String SerializableString.getValue()>
	//  255  396:astore          6
		} else
	//* 256  398:goto            417
		{
			s = _currentEscape.getValue();
	//  257  401:aload_0         
	//  258  402:getfield        #65  <Field SerializableString _currentEscape>
	//  259  405:invokeinterface #81  <Method String SerializableString.getValue()>
	//  260  410:astore          6
			_currentEscape = null;
	//  261  412:aload_0         
	//  262  413:aconst_null     
	//  263  414:putfield        #65  <Field SerializableString _currentEscape>
		}
		c = ((char) (s.length()));
	//  264  417:aload           6
	//  265  419:invokevirtual   #87  <Method int String.length()>
	//  266  422:istore          4
		if(i >= c && i < j)
	//* 267  424:iload_2         
	//* 268  425:iload           4
	//* 269  427:icmplt          452
	//* 270  430:iload_2         
	//* 271  431:iload_3         
	//* 272  432:icmpge          452
		{
			i -= ((int) (c));
	//  273  435:iload_2         
	//  274  436:iload           4
	//  275  438:isub            
	//  276  439:istore_2        
			s.getChars(0, ((int) (c)), ac, i);
	//  277  440:aload           6
	//  278  442:iconst_0        
	//  279  443:iload           4
	//  280  445:aload_1         
	//  281  446:iload_2         
	//  282  447:invokevirtual   #97  <Method void String.getChars(int, int, char[], int)>
			return i;
	//  283  450:iload_2         
	//  284  451:ireturn         
		} else
		{
			_writer.write(s);
	//  285  452:aload_0         
	//  286  453:getfield        #40  <Field Writer _writer>
	//  287  456:aload           6
	//  288  458:invokevirtual   #93  <Method void Writer.write(String)>
			return i;
	//  289  461:iload_2         
	//  290  462:ireturn         
		}
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
	//*   3    5:getfield        #60  <Field int _outputTail>
	//*   4    8:iconst_2        
	//*   5    9:icmplt          43
			{
				c = ((char) (_outputTail - 2));
	//    6   12:aload_0         
	//    7   13:getfield        #60  <Field int _outputTail>
	//    8   16:iconst_2        
	//    9   17:isub            
	//   10   18:istore_1        
				_outputHead = ((int) (c));
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:putfield        #107 <Field int _outputHead>
				_outputBuffer[c] = '\\';
	//   14   24:aload_0         
	//   15   25:getfield        #47  <Field char[] _outputBuffer>
	//   16   28:iload_1         
	//   17   29:bipush          92
	//   18   31:castore         
				_outputBuffer[c + 1] = (char)i;
	//   19   32:aload_0         
	//   20   33:getfield        #47  <Field char[] _outputBuffer>
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
	//   29   44:getfield        #52  <Field char[] _entityBuffer>
	//   30   47:astore          5
			char ac[] = ac3;
	//   31   49:aload           5
	//   32   51:astore          4
			if(ac3 == null)
	//*  33   53:aload           5
	//*  34   55:ifnonnull       64
				ac = _allocateEntityBuffer();
	//   35   58:aload_0         
	//   36   59:invokespecial   #102 <Method char[] _allocateEntityBuffer()>
	//   37   62:astore          4
			_outputHead = _outputTail;
	//   38   64:aload_0         
	//   39   65:aload_0         
	//   40   66:getfield        #60  <Field int _outputTail>
	//   41   69:putfield        #107 <Field int _outputHead>
			ac[1] = (char)i;
	//   42   72:aload           4
	//   43   74:iconst_1        
	//   44   75:iload_2         
	//   45   76:int2char        
	//   46   77:castore         
			_writer.write(ac, 0, 2);
	//   47   78:aload_0         
	//   48   79:getfield        #40  <Field Writer _writer>
	//   49   82:aload           4
	//   50   84:iconst_0        
	//   51   85:iconst_2        
	//   52   86:invokevirtual   #105 <Method void Writer.write(char[], int, int)>
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
	//*  58   97:getfield        #60  <Field int _outputTail>
	//*  59  100:bipush          6
	//*  60  102:icmplt          247
			{
				char ac1[] = _outputBuffer;
	//   61  105:aload_0         
	//   62  106:getfield        #47  <Field char[] _outputBuffer>
	//   63  109:astore          4
				i = _outputTail - 6;
	//   64  111:aload_0         
	//   65  112:getfield        #60  <Field int _outputTail>
	//   66  115:bipush          6
	//   67  117:isub            
	//   68  118:istore_2        
				_outputHead = i;
	//   69  119:aload_0         
	//   70  120:iload_2         
	//   71  121:putfield        #107 <Field int _outputHead>
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
	//*  86  144:icmple          197
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
	//   99  163:getstatic       #30  <Field char[] HEX_CHARS>
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
	//  111  178:getstatic       #30  <Field char[] HEX_CHARS>
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
	//* 122  194:goto            217
				{
					i++;
	//  123  197:iload_2         
	//  124  198:iconst_1        
	//  125  199:iadd            
	//  126  200:istore_2        
					ac1[i] = '0';
	//  127  201:aload           4
	//  128  203:iload_2         
	//  129  204:bipush          48
	//  130  206:castore         
					i++;
	//  131  207:iload_2         
	//  132  208:iconst_1        
	//  133  209:iadd            
	//  134  210:istore_2        
					ac1[i] = '0';
	//  135  211:aload           4
	//  136  213:iload_2         
	//  137  214:bipush          48
	//  138  216:castore         
				}
				i++;
	//  139  217:iload_2         
	//  140  218:iconst_1        
	//  141  219:iadd            
	//  142  220:istore_2        
				ac1[i] = HEX_CHARS[c >> 4];
	//  143  221:aload           4
	//  144  223:iload_2         
	//  145  224:getstatic       #30  <Field char[] HEX_CHARS>
	//  146  227:iload_1         
	//  147  228:iconst_4        
	//  148  229:ishr            
	//  149  230:caload          
	//  150  231:castore         
				ac1[i + 1] = HEX_CHARS[c & 0xf];
	//  151  232:aload           4
	//  152  234:iload_2         
	//  153  235:iconst_1        
	//  154  236:iadd            
	//  155  237:getstatic       #30  <Field char[] HEX_CHARS>
	//  156  240:iload_1         
	//  157  241:bipush          15
	//  158  243:iand            
	//  159  244:caload          
	//  160  245:castore         
				return;
	//  161  246:return          
			}
			char ac4[] = _entityBuffer;
	//  162  247:aload_0         
	//  163  248:getfield        #52  <Field char[] _entityBuffer>
	//  164  251:astore          5
			char ac2[] = ac4;
	//  165  253:aload           5
	//  166  255:astore          4
			if(ac4 == null)
	//* 167  257:aload           5
	//* 168  259:ifnonnull       268
				ac2 = _allocateEntityBuffer();
	//  169  262:aload_0         
	//  170  263:invokespecial   #102 <Method char[] _allocateEntityBuffer()>
	//  171  266:astore          4
			_outputHead = _outputTail;
	//  172  268:aload_0         
	//  173  269:aload_0         
	//  174  270:getfield        #60  <Field int _outputTail>
	//  175  273:putfield        #107 <Field int _outputHead>
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
	//  191  302:getstatic       #30  <Field char[] HEX_CHARS>
	//  192  305:iload_2         
	//  193  306:iconst_4        
	//  194  307:ishr            
	//  195  308:caload          
	//  196  309:castore         
				ac2[11] = HEX_CHARS[i & 0xf];
	//  197  310:aload           4
	//  198  312:bipush          11
	//  199  314:getstatic       #30  <Field char[] HEX_CHARS>
	//  200  317:iload_2         
	//  201  318:bipush          15
	//  202  320:iand            
	//  203  321:caload          
	//  204  322:castore         
				ac2[12] = HEX_CHARS[c >> 4];
	//  205  323:aload           4
	//  206  325:bipush          12
	//  207  327:getstatic       #30  <Field char[] HEX_CHARS>
	//  208  330:iload_1         
	//  209  331:iconst_4        
	//  210  332:ishr            
	//  211  333:caload          
	//  212  334:castore         
				ac2[13] = HEX_CHARS[c & 0xf];
	//  213  335:aload           4
	//  214  337:bipush          13
	//  215  339:getstatic       #30  <Field char[] HEX_CHARS>
	//  216  342:iload_1         
	//  217  343:bipush          15
	//  218  345:iand            
	//  219  346:caload          
	//  220  347:castore         
				_writer.write(ac2, 8, 6);
	//  221  348:aload_0         
	//  222  349:getfield        #40  <Field Writer _writer>
	//  223  352:aload           4
	//  224  354:bipush          8
	//  225  356:bipush          6
	//  226  358:invokevirtual   #105 <Method void Writer.write(char[], int, int)>
				return;
	//  227  361:return          
			} else
			{
				ac2[6] = HEX_CHARS[c >> 4];
	//  228  362:aload           4
	//  229  364:bipush          6
	//  230  366:getstatic       #30  <Field char[] HEX_CHARS>
	//  231  369:iload_1         
	//  232  370:iconst_4        
	//  233  371:ishr            
	//  234  372:caload          
	//  235  373:castore         
				ac2[7] = HEX_CHARS[c & 0xf];
	//  236  374:aload           4
	//  237  376:bipush          7
	//  238  378:getstatic       #30  <Field char[] HEX_CHARS>
	//  239  381:iload_1         
	//  240  382:bipush          15
	//  241  384:iand            
	//  242  385:caload          
	//  243  386:castore         
				_writer.write(ac2, 2, 6);
	//  244  387:aload_0         
	//  245  388:getfield        #40  <Field Writer _writer>
	//  246  391:aload           4
	//  247  393:iconst_2        
	//  248  394:bipush          6
	//  249  396:invokevirtual   #105 <Method void Writer.write(char[], int, int)>
				return;
	//  250  399:return          
			}
		}
		String s;
		if(_currentEscape == null)
	//* 251  400:aload_0         
	//* 252  401:getfield        #65  <Field SerializableString _currentEscape>
	//* 253  404:ifnonnull       425
		{
			s = _characterEscapes.getEscapeSequence(((int) (c))).getValue();
	//  254  407:aload_0         
	//  255  408:getfield        #69  <Field CharacterEscapes _characterEscapes>
	//  256  411:iload_1         
	//  257  412:invokevirtual   #75  <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//  258  415:invokeinterface #81  <Method String SerializableString.getValue()>
	//  259  420:astore          4
		} else
	//* 260  422:goto            441
		{
			s = _currentEscape.getValue();
	//  261  425:aload_0         
	//  262  426:getfield        #65  <Field SerializableString _currentEscape>
	//  263  429:invokeinterface #81  <Method String SerializableString.getValue()>
	//  264  434:astore          4
			_currentEscape = null;
	//  265  436:aload_0         
	//  266  437:aconst_null     
	//  267  438:putfield        #65  <Field SerializableString _currentEscape>
		}
		c = ((char) (s.length()));
	//  268  441:aload           4
	//  269  443:invokevirtual   #87  <Method int String.length()>
	//  270  446:istore_1        
		if(_outputTail >= c)
	//* 271  447:aload_0         
	//* 272  448:getfield        #60  <Field int _outputTail>
	//* 273  451:iload_1         
	//* 274  452:icmplt          480
		{
			i = _outputTail - c;
	//  275  455:aload_0         
	//  276  456:getfield        #60  <Field int _outputTail>
	//  277  459:iload_1         
	//  278  460:isub            
	//  279  461:istore_2        
			_outputHead = i;
	//  280  462:aload_0         
	//  281  463:iload_2         
	//  282  464:putfield        #107 <Field int _outputHead>
			s.getChars(0, ((int) (c)), _outputBuffer, i);
	//  283  467:aload           4
	//  284  469:iconst_0        
	//  285  470:iload_1         
	//  286  471:aload_0         
	//  287  472:getfield        #47  <Field char[] _outputBuffer>
	//  288  475:iload_2         
	//  289  476:invokevirtual   #97  <Method void String.getChars(int, int, char[], int)>
			return;
	//  290  479:return          
		} else
		{
			_outputHead = _outputTail;
	//  291  480:aload_0         
	//  292  481:aload_0         
	//  293  482:getfield        #60  <Field int _outputTail>
	//  294  485:putfield        #107 <Field int _outputHead>
			_writer.write(s);
	//  295  488:aload_0         
	//  296  489:getfield        #40  <Field Writer _writer>
	//  297  492:aload           4
	//  298  494:invokevirtual   #93  <Method void Writer.write(String)>
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
	//   27   40:invokestatic    #115 <Method int Math.min(int, int)>
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
	//   41   63:invokevirtual   #121 <Method int InputStream.read(byte[], int, int)>
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

	private void _writeLongString(String s)
		throws IOException
	{
		_flushBuffer();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #63  <Method void _flushBuffer()>
		int l = s.length();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #87  <Method int String.length()>
	//    4    8:istore          5
		int i = 0;
	//    5   10:iconst_0        
	//    6   11:istore_2        
		do
		{
			int k = _outputEnd;
	//    7   12:aload_0         
	//    8   13:getfield        #49  <Field int _outputEnd>
	//    9   16:istore          4
			int j = k;
	//   10   18:iload           4
	//   11   20:istore_3        
			if(i + k > l)
	//*  12   21:iload_2         
	//*  13   22:iload           4
	//*  14   24:iadd            
	//*  15   25:iload           5
	//*  16   27:icmple          35
				j = l - i;
	//   17   30:iload           5
	//   18   32:iload_2         
	//   19   33:isub            
	//   20   34:istore_3        
			k = i + j;
	//   21   35:iload_2         
	//   22   36:iload_3         
	//   23   37:iadd            
	//   24   38:istore          4
			s.getChars(i, k, _outputBuffer, 0);
	//   25   40:aload_1         
	//   26   41:iload_2         
	//   27   42:iload           4
	//   28   44:aload_0         
	//   29   45:getfield        #47  <Field char[] _outputBuffer>
	//   30   48:iconst_0        
	//   31   49:invokevirtual   #97  <Method void String.getChars(int, int, char[], int)>
			if(_characterEscapes != null)
	//*  32   52:aload_0         
	//*  33   53:getfield        #69  <Field CharacterEscapes _characterEscapes>
	//*  34   56:ifnull          67
				_writeSegmentCustom(j);
	//   35   59:aload_0         
	//   36   60:iload_3         
	//   37   61:invokespecial   #126 <Method void _writeSegmentCustom(int)>
			else
	//*  38   64:goto            91
			if(_maximumNonEscapedChar != 0)
	//*  39   67:aload_0         
	//*  40   68:getfield        #129 <Field int _maximumNonEscapedChar>
	//*  41   71:ifeq            86
				_writeSegmentASCII(j, _maximumNonEscapedChar);
	//   42   74:aload_0         
	//   43   75:iload_3         
	//   44   76:aload_0         
	//   45   77:getfield        #129 <Field int _maximumNonEscapedChar>
	//   46   80:invokespecial   #133 <Method void _writeSegmentASCII(int, int)>
			else
	//*  47   83:goto            91
				_writeSegment(j);
	//   48   86:aload_0         
	//   49   87:iload_3         
	//   50   88:invokespecial   #136 <Method void _writeSegment(int)>
			if(k >= l)
	//*  51   91:iload           4
	//*  52   93:iload           5
	//*  53   95:icmplt          99
				return;
	//   54   98:return          
			i = k;
	//   55   99:iload           4
	//   56  101:istore_2        
		} while(true);
	//   57  102:goto            12
	}

	private final void _writeNull()
		throws IOException
	{
		if(_outputTail + 4 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field int _outputTail>
	//*   2    4:iconst_4        
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #49  <Field int _outputEnd>
	//*   6   10:icmplt          17
			_flushBuffer();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #63  <Method void _flushBuffer()>
		int i = _outputTail;
	//    9   17:aload_0         
	//   10   18:getfield        #60  <Field int _outputTail>
	//   11   21:istore_1        
		char ac[] = _outputBuffer;
	//   12   22:aload_0         
	//   13   23:getfield        #47  <Field char[] _outputBuffer>
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
	//   47   63:putfield        #60  <Field int _outputTail>
	//   48   66:return          
	}

	private void _writeQuotedInt(int i)
		throws IOException
	{
		if(_outputTail + 13 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field int _outputTail>
	//*   2    4:bipush          13
	//*   3    6:iadd            
	//*   4    7:aload_0         
	//*   5    8:getfield        #49  <Field int _outputEnd>
	//*   6   11:icmplt          18
			_flushBuffer();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #63  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//    9   18:aload_0         
	//   10   19:getfield        #47  <Field char[] _outputBuffer>
	//   11   22:astore_3        
		int j = _outputTail;
	//   12   23:aload_0         
	//   13   24:getfield        #60  <Field int _outputTail>
	//   14   27:istore_2        
		_outputTail = j + 1;
	//   15   28:aload_0         
	//   16   29:iload_2         
	//   17   30:iconst_1        
	//   18   31:iadd            
	//   19   32:putfield        #60  <Field int _outputTail>
		ac[j] = _quoteChar;
	//   20   35:aload_3         
	//   21   36:iload_2         
	//   22   37:aload_0         
	//   23   38:getfield        #38  <Field char _quoteChar>
	//   24   41:castore         
		_outputTail = NumberOutput.outputInt(i, _outputBuffer, _outputTail);
	//   25   42:aload_0         
	//   26   43:iload_1         
	//   27   44:aload_0         
	//   28   45:getfield        #47  <Field char[] _outputBuffer>
	//   29   48:aload_0         
	//   30   49:getfield        #60  <Field int _outputTail>
	//   31   52:invokestatic    #144 <Method int NumberOutput.outputInt(int, char[], int)>
	//   32   55:putfield        #60  <Field int _outputTail>
		ac = _outputBuffer;
	//   33   58:aload_0         
	//   34   59:getfield        #47  <Field char[] _outputBuffer>
	//   35   62:astore_3        
		i = _outputTail;
	//   36   63:aload_0         
	//   37   64:getfield        #60  <Field int _outputTail>
	//   38   67:istore_1        
		_outputTail = i + 1;
	//   39   68:aload_0         
	//   40   69:iload_1         
	//   41   70:iconst_1        
	//   42   71:iadd            
	//   43   72:putfield        #60  <Field int _outputTail>
		ac[i] = _quoteChar;
	//   44   75:aload_3         
	//   45   76:iload_1         
	//   46   77:aload_0         
	//   47   78:getfield        #38  <Field char _quoteChar>
	//   48   81:castore         
	//   49   82:return          
	}

	private void _writeQuotedLong(long l)
		throws IOException
	{
		if(_outputTail + 23 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field int _outputTail>
	//*   2    4:bipush          23
	//*   3    6:iadd            
	//*   4    7:aload_0         
	//*   5    8:getfield        #49  <Field int _outputEnd>
	//*   6   11:icmplt          18
			_flushBuffer();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #63  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//    9   18:aload_0         
	//   10   19:getfield        #47  <Field char[] _outputBuffer>
	//   11   22:astore          4
		int i = _outputTail;
	//   12   24:aload_0         
	//   13   25:getfield        #60  <Field int _outputTail>
	//   14   28:istore_3        
		_outputTail = i + 1;
	//   15   29:aload_0         
	//   16   30:iload_3         
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:putfield        #60  <Field int _outputTail>
		ac[i] = _quoteChar;
	//   20   36:aload           4
	//   21   38:iload_3         
	//   22   39:aload_0         
	//   23   40:getfield        #38  <Field char _quoteChar>
	//   24   43:castore         
		_outputTail = NumberOutput.outputLong(l, _outputBuffer, _outputTail);
	//   25   44:aload_0         
	//   26   45:lload_1         
	//   27   46:aload_0         
	//   28   47:getfield        #47  <Field char[] _outputBuffer>
	//   29   50:aload_0         
	//   30   51:getfield        #60  <Field int _outputTail>
	//   31   54:invokestatic    #150 <Method int NumberOutput.outputLong(long, char[], int)>
	//   32   57:putfield        #60  <Field int _outputTail>
		ac = _outputBuffer;
	//   33   60:aload_0         
	//   34   61:getfield        #47  <Field char[] _outputBuffer>
	//   35   64:astore          4
		i = _outputTail;
	//   36   66:aload_0         
	//   37   67:getfield        #60  <Field int _outputTail>
	//   38   70:istore_3        
		_outputTail = i + 1;
	//   39   71:aload_0         
	//   40   72:iload_3         
	//   41   73:iconst_1        
	//   42   74:iadd            
	//   43   75:putfield        #60  <Field int _outputTail>
		ac[i] = _quoteChar;
	//   44   78:aload           4
	//   45   80:iload_3         
	//   46   81:aload_0         
	//   47   82:getfield        #38  <Field char _quoteChar>
	//   48   85:castore         
	//   49   86:return          
	}

	private void _writeQuotedRaw(String s)
		throws IOException
	{
		if(_outputTail >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field int _outputTail>
	//*   2    4:aload_0         
	//*   3    5:getfield        #49  <Field int _outputEnd>
	//*   4    8:icmplt          15
			_flushBuffer();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #63  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #47  <Field char[] _outputBuffer>
	//    9   19:astore_3        
		int i = _outputTail;
	//   10   20:aload_0         
	//   11   21:getfield        #60  <Field int _outputTail>
	//   12   24:istore_2        
		_outputTail = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #60  <Field int _outputTail>
		ac[i] = _quoteChar;
	//   18   32:aload_3         
	//   19   33:iload_2         
	//   20   34:aload_0         
	//   21   35:getfield        #38  <Field char _quoteChar>
	//   22   38:castore         
		writeRaw(s);
	//   23   39:aload_0         
	//   24   40:aload_1         
	//   25   41:invokevirtual   #154 <Method void writeRaw(String)>
		if(_outputTail >= _outputEnd)
	//*  26   44:aload_0         
	//*  27   45:getfield        #60  <Field int _outputTail>
	//*  28   48:aload_0         
	//*  29   49:getfield        #49  <Field int _outputEnd>
	//*  30   52:icmplt          59
			_flushBuffer();
	//   31   55:aload_0         
	//   32   56:invokevirtual   #63  <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//   33   59:aload_0         
	//   34   60:getfield        #47  <Field char[] _outputBuffer>
	//   35   63:astore_1        
		i = _outputTail;
	//   36   64:aload_0         
	//   37   65:getfield        #60  <Field int _outputTail>
	//   38   68:istore_2        
		_outputTail = i + 1;
	//   39   69:aload_0         
	//   40   70:iload_2         
	//   41   71:iconst_1        
	//   42   72:iadd            
	//   43   73:putfield        #60  <Field int _outputTail>
		s[i] = _quoteChar;
	//   44   76:aload_1         
	//   45   77:iload_2         
	//   46   78:aload_0         
	//   47   79:getfield        #38  <Field char _quoteChar>
	//   48   82:castore         
	//   49   83:return          
	}

	private void _writeQuotedShort(short word0)
		throws IOException
	{
		if(_outputTail + 8 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field int _outputTail>
	//*   2    4:bipush          8
	//*   3    6:iadd            
	//*   4    7:aload_0         
	//*   5    8:getfield        #49  <Field int _outputEnd>
	//*   6   11:icmplt          18
			_flushBuffer();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #63  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//    9   18:aload_0         
	//   10   19:getfield        #47  <Field char[] _outputBuffer>
	//   11   22:astore_3        
		int i = _outputTail;
	//   12   23:aload_0         
	//   13   24:getfield        #60  <Field int _outputTail>
	//   14   27:istore_2        
		_outputTail = i + 1;
	//   15   28:aload_0         
	//   16   29:iload_2         
	//   17   30:iconst_1        
	//   18   31:iadd            
	//   19   32:putfield        #60  <Field int _outputTail>
		ac[i] = _quoteChar;
	//   20   35:aload_3         
	//   21   36:iload_2         
	//   22   37:aload_0         
	//   23   38:getfield        #38  <Field char _quoteChar>
	//   24   41:castore         
		_outputTail = NumberOutput.outputInt(((int) (word0)), _outputBuffer, _outputTail);
	//   25   42:aload_0         
	//   26   43:iload_1         
	//   27   44:aload_0         
	//   28   45:getfield        #47  <Field char[] _outputBuffer>
	//   29   48:aload_0         
	//   30   49:getfield        #60  <Field int _outputTail>
	//   31   52:invokestatic    #144 <Method int NumberOutput.outputInt(int, char[], int)>
	//   32   55:putfield        #60  <Field int _outputTail>
		ac = _outputBuffer;
	//   33   58:aload_0         
	//   34   59:getfield        #47  <Field char[] _outputBuffer>
	//   35   62:astore_3        
		word0 = ((short) (_outputTail));
	//   36   63:aload_0         
	//   37   64:getfield        #60  <Field int _outputTail>
	//   38   67:istore_1        
		_outputTail = word0 + 1;
	//   39   68:aload_0         
	//   40   69:iload_1         
	//   41   70:iconst_1        
	//   42   71:iadd            
	//   43   72:putfield        #60  <Field int _outputTail>
		ac[word0] = _quoteChar;
	//   44   75:aload_3         
	//   45   76:iload_1         
	//   46   77:aload_0         
	//   47   78:getfield        #38  <Field char _quoteChar>
	//   48   81:castore         
	//   49   82:return          
	}

	private void _writeSegment(int i)
		throws IOException
	{
		int ai[] = _outputEscapes;
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field int[] _outputEscapes>
	//    2    4:astore          7
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int j1 = ai.length;
	//    5    8:aload           7
	//    6   10:arraylength     
	//    7   11:istore          6
		char c;
		for(int k = 0; j < i; k = _prependOrWriteCharacterEscape(_outputBuffer, j, i, c, ai[c]))
	//*   8   13:iconst_0        
	//*   9   14:istore          4
	//*  10   16:iload_3         
	//*  11   17:iload_1         
	//*  12   18:icmpge          117
		{
			do
			{
				c = _outputBuffer[j];
	//   13   21:aload_0         
	//   14   22:getfield        #47  <Field char[] _outputBuffer>
	//   15   25:iload_3         
	//   16   26:caload          
	//   17   27:istore_2        
				if(c < j1 && ai[c] != 0)
	//*  18   28:iload_2         
	//*  19   29:iload           6
	//*  20   31:icmpge          44
	//*  21   34:aload           7
	//*  22   36:iload_2         
	//*  23   37:iaload          
	//*  24   38:ifeq            44
					break;
	//   25   41:goto            61
				int l = j + 1;
	//   26   44:iload_3         
	//   27   45:iconst_1        
	//   28   46:iadd            
	//   29   47:istore          5
				j = l;
	//   30   49:iload           5
	//   31   51:istore_3        
				if(l < i)
					continue;
	//   32   52:iload           5
	//   33   54:iload_1         
	//   34   55:icmplt          21
				j = l;
	//   35   58:iload           5
	//   36   60:istore_3        
				break;
			} while(true);
			int i1 = j - k;
	//   37   61:iload_3         
	//   38   62:iload           4
	//   39   64:isub            
	//   40   65:istore          5
			if(i1 > 0)
	//*  41   67:iload           5
	//*  42   69:ifle            93
			{
				_writer.write(_outputBuffer, k, i1);
	//   43   72:aload_0         
	//   44   73:getfield        #40  <Field Writer _writer>
	//   45   76:aload_0         
	//   46   77:getfield        #47  <Field char[] _outputBuffer>
	//   47   80:iload           4
	//   48   82:iload           5
	//   49   84:invokevirtual   #105 <Method void Writer.write(char[], int, int)>
				if(j >= i)
	//*  50   87:iload_3         
	//*  51   88:iload_1         
	//*  52   89:icmplt          93
					return;
	//   53   92:return          
			}
			j++;
	//   54   93:iload_3         
	//   55   94:iconst_1        
	//   56   95:iadd            
	//   57   96:istore_3        
		}

	//   58   97:aload_0         
	//   59   98:aload_0         
	//   60   99:getfield        #47  <Field char[] _outputBuffer>
	//   61  102:iload_3         
	//   62  103:iload_1         
	//   63  104:iload_2         
	//   64  105:aload           7
	//   65  107:iload_2         
	//   66  108:iaload          
	//   67  109:invokespecial   #162 <Method int _prependOrWriteCharacterEscape(char[], int, int, char, int)>
	//   68  112:istore          4
	//*  69  114:goto            16
	//   70  117:return          
	}

	private void _writeSegmentASCII(int i, int j)
		throws IOException, JsonGenerationException
	{
		int ai[] = _outputEscapes;
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field int[] _outputEscapes>
	//    2    4:astore          10
		int l = 0;
	//    3    6:iconst_0        
	//    4    7:istore          5
		int l1 = Math.min(ai.length, j + 1);
	//    5    9:aload           10
	//    6   11:arraylength     
	//    7   12:iload_2         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:invokestatic    #115 <Method int Math.min(int, int)>
	//   11   18:istore          9
		int i1 = 0;
	//   12   20:iconst_0        
	//   13   21:istore          6
		int k = i1;
	//   14   23:iload           6
	//   15   25:istore          4
		while(l < i) 
	//*  16   27:iload           5
	//*  17   29:iload_1         
	//*  18   30:icmpge          187
		{
			int j1 = k;
	//   19   33:iload           4
	//   20   35:istore          7
			k = l;
	//   21   37:iload           5
	//   22   39:istore          4
			char c;
			int k1;
			do
			{
				c = _outputBuffer[k];
	//   23   41:aload_0         
	//   24   42:getfield        #47  <Field char[] _outputBuffer>
	//   25   45:iload           4
	//   26   47:caload          
	//   27   48:istore_3        
				if(c < l1)
	//*  28   49:iload_3         
	//*  29   50:iload           9
	//*  30   52:icmpge          81
				{
					j1 = ai[c];
	//   31   55:aload           10
	//   32   57:iload_3         
	//   33   58:iaload          
	//   34   59:istore          7
					l = j1;
	//   35   61:iload           7
	//   36   63:istore          5
					if(j1 != 0)
	//*  37   65:iload           7
	//*  38   67:ifeq            104
					{
						k1 = k;
	//   39   70:iload           4
	//   40   72:istore          8
						k = j1;
	//   41   74:iload           7
	//   42   76:istore          4
						break;
	//   43   78:goto            128
					}
				} else
				{
					l = j1;
	//   44   81:iload           7
	//   45   83:istore          5
					if(c > j)
	//*  46   85:iload_3         
	//*  47   86:iload_2         
	//*  48   87:icmple          104
					{
						l = -1;
	//   49   90:iconst_m1       
	//   50   91:istore          5
						k1 = k;
	//   51   93:iload           4
	//   52   95:istore          8
						k = l;
	//   53   97:iload           5
	//   54   99:istore          4
						break;
	//   55  101:goto            128
					}
				}
				k1 = k + 1;
	//   56  104:iload           4
	//   57  106:iconst_1        
	//   58  107:iadd            
	//   59  108:istore          8
				k = k1;
	//   60  110:iload           8
	//   61  112:istore          4
				j1 = l;
	//   62  114:iload           5
	//   63  116:istore          7
				if(k1 < i)
					continue;
	//   64  118:iload           8
	//   65  120:iload_1         
	//   66  121:icmplt          41
				k = l;
	//   67  124:iload           5
	//   68  126:istore          4
				break;
			} while(true);
			l = k1 - i1;
	//   69  128:iload           8
	//   70  130:iload           6
	//   71  132:isub            
	//   72  133:istore          5
			if(l > 0)
	//*  73  135:iload           5
	//*  74  137:ifle            162
			{
				_writer.write(_outputBuffer, i1, l);
	//   75  140:aload_0         
	//   76  141:getfield        #40  <Field Writer _writer>
	//   77  144:aload_0         
	//   78  145:getfield        #47  <Field char[] _outputBuffer>
	//   79  148:iload           6
	//   80  150:iload           5
	//   81  152:invokevirtual   #105 <Method void Writer.write(char[], int, int)>
				if(k1 >= i)
	//*  82  155:iload           8
	//*  83  157:iload_1         
	//*  84  158:icmplt          162
					return;
	//   85  161:return          
			}
			l = k1 + 1;
	//   86  162:iload           8
	//   87  164:iconst_1        
	//   88  165:iadd            
	//   89  166:istore          5
			i1 = _prependOrWriteCharacterEscape(_outputBuffer, l, i, c, k);
	//   90  168:aload_0         
	//   91  169:aload_0         
	//   92  170:getfield        #47  <Field char[] _outputBuffer>
	//   93  173:iload           5
	//   94  175:iload_1         
	//   95  176:iload_3         
	//   96  177:iload           4
	//   97  179:invokespecial   #162 <Method int _prependOrWriteCharacterEscape(char[], int, int, char, int)>
	//   98  182:istore          6
		}
	//*  99  184:goto            27
	//  100  187:return          
	}

	private void _writeSegmentCustom(int i)
		throws IOException, JsonGenerationException
	{
		int ai[] = _outputEscapes;
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field int[] _outputEscapes>
	//    2    4:astore          10
		int l;
		if(_maximumNonEscapedChar < 1)
	//*   3    6:aload_0         
	//*   4    7:getfield        #129 <Field int _maximumNonEscapedChar>
	//*   5   10:iconst_1        
	//*   6   11:icmpge          21
			l = 65535;
	//    7   14:ldc1            #163 <Int 65535>
	//    8   16:istore          5
		else
	//*   9   18:goto            27
			l = _maximumNonEscapedChar;
	//   10   21:aload_0         
	//   11   22:getfield        #129 <Field int _maximumNonEscapedChar>
	//   12   25:istore          5
		int k = 0;
	//   13   27:iconst_0        
	//   14   28:istore          4
		int l1 = Math.min(ai.length, l + 1);
	//   15   30:aload           10
	//   16   32:arraylength     
	//   17   33:iload           5
	//   18   35:iconst_1        
	//   19   36:iadd            
	//   20   37:invokestatic    #115 <Method int Math.min(int, int)>
	//   21   40:istore          9
		CharacterEscapes characterescapes = _characterEscapes;
	//   22   42:aload_0         
	//   23   43:getfield        #69  <Field CharacterEscapes _characterEscapes>
	//   24   46:astore          11
		int i1 = 0;
	//   25   48:iconst_0        
	//   26   49:istore          6
		int j = i1;
	//   27   51:iload           6
	//   28   53:istore_3        
		while(k < i) 
	//*  29   54:iload           4
	//*  30   56:iload_1         
	//*  31   57:icmpge          240
		{
			int j1 = j;
	//   32   60:iload_3         
	//   33   61:istore          7
			j = k;
	//   34   63:iload           4
	//   35   65:istore_3        
			char c;
			do
			{
				c = _outputBuffer[j];
	//   36   66:aload_0         
	//   37   67:getfield        #47  <Field char[] _outputBuffer>
	//   38   70:iload_3         
	//   39   71:caload          
	//   40   72:istore_2        
				if(c < l1)
	//*  41   73:iload_2         
	//*  42   74:iload           9
	//*  43   76:icmpge          103
				{
					j1 = ai[c];
	//   44   79:aload           10
	//   45   81:iload_2         
	//   46   82:iaload          
	//   47   83:istore          7
					k = j1;
	//   48   85:iload           7
	//   49   87:istore          4
					if(j1 != 0)
	//*  50   89:iload           7
	//*  51   91:ifeq            157
					{
						k = j;
	//   52   94:iload_3         
	//   53   95:istore          4
						j = j1;
	//   54   97:iload           7
	//   55   99:istore_3        
						break;
	//   56  100:goto            182
					}
				} else
				{
					if(c > l)
	//*  57  103:iload_2         
	//*  58  104:iload           5
	//*  59  106:icmple          121
					{
						j1 = -1;
	//   60  109:iconst_m1       
	//   61  110:istore          7
						k = j;
	//   62  112:iload_3         
	//   63  113:istore          4
						j = j1;
	//   64  115:iload           7
	//   65  117:istore_3        
						break;
	//   66  118:goto            182
					}
					SerializableString serializablestring = characterescapes.getEscapeSequence(((int) (c)));
	//   67  121:aload           11
	//   68  123:iload_2         
	//   69  124:invokevirtual   #75  <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//   70  127:astore          12
					_currentEscape = serializablestring;
	//   71  129:aload_0         
	//   72  130:aload           12
	//   73  132:putfield        #65  <Field SerializableString _currentEscape>
					k = j1;
	//   74  135:iload           7
	//   75  137:istore          4
					if(serializablestring != null)
	//*  76  139:aload           12
	//*  77  141:ifnull          157
					{
						j1 = -2;
	//   78  144:bipush          -2
	//   79  146:istore          7
						k = j;
	//   80  148:iload_3         
	//   81  149:istore          4
						j = j1;
	//   82  151:iload           7
	//   83  153:istore_3        
						break;
	//   84  154:goto            182
					}
				}
				int k1 = j + 1;
	//   85  157:iload_3         
	//   86  158:iconst_1        
	//   87  159:iadd            
	//   88  160:istore          8
				j = k1;
	//   89  162:iload           8
	//   90  164:istore_3        
				j1 = k;
	//   91  165:iload           4
	//   92  167:istore          7
				if(k1 < i)
					continue;
	//   93  169:iload           8
	//   94  171:iload_1         
	//   95  172:icmplt          66
				j = k;
	//   96  175:iload           4
	//   97  177:istore_3        
				k = k1;
	//   98  178:iload           8
	//   99  180:istore          4
				break;
			} while(true);
			j1 = k - i1;
	//  100  182:iload           4
	//  101  184:iload           6
	//  102  186:isub            
	//  103  187:istore          7
			if(j1 > 0)
	//* 104  189:iload           7
	//* 105  191:ifle            216
			{
				_writer.write(_outputBuffer, i1, j1);
	//  106  194:aload_0         
	//  107  195:getfield        #40  <Field Writer _writer>
	//  108  198:aload_0         
	//  109  199:getfield        #47  <Field char[] _outputBuffer>
	//  110  202:iload           6
	//  111  204:iload           7
	//  112  206:invokevirtual   #105 <Method void Writer.write(char[], int, int)>
				if(k >= i)
	//* 113  209:iload           4
	//* 114  211:iload_1         
	//* 115  212:icmplt          216
					return;
	//  116  215:return          
			}
			k++;
	//  117  216:iload           4
	//  118  218:iconst_1        
	//  119  219:iadd            
	//  120  220:istore          4
			i1 = _prependOrWriteCharacterEscape(_outputBuffer, k, i, c, j);
	//  121  222:aload_0         
	//  122  223:aload_0         
	//  123  224:getfield        #47  <Field char[] _outputBuffer>
	//  124  227:iload           4
	//  125  229:iload_1         
	//  126  230:iload_2         
	//  127  231:iload_3         
	//  128  232:invokespecial   #162 <Method int _prependOrWriteCharacterEscape(char[], int, int, char, int)>
	//  129  235:istore          6
		}
	//* 130  237:goto            54
	//  131  240:return          
	}

	private void _writeString(String s)
		throws IOException
	{
		int i = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #87  <Method int String.length()>
	//    2    4:istore_2        
		if(i > _outputEnd)
	//*   3    5:iload_2         
	//*   4    6:aload_0         
	//*   5    7:getfield        #49  <Field int _outputEnd>
	//*   6   10:icmple          19
		{
			_writeLongString(s);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #166 <Method void _writeLongString(String)>
			return;
	//   10   18:return          
		}
		if(_outputTail + i > _outputEnd)
	//*  11   19:aload_0         
	//*  12   20:getfield        #60  <Field int _outputTail>
	//*  13   23:iload_2         
	//*  14   24:iadd            
	//*  15   25:aload_0         
	//*  16   26:getfield        #49  <Field int _outputEnd>
	//*  17   29:icmple          36
			_flushBuffer();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #63  <Method void _flushBuffer()>
		s.getChars(0, i, _outputBuffer, _outputTail);
	//   20   36:aload_1         
	//   21   37:iconst_0        
	//   22   38:iload_2         
	//   23   39:aload_0         
	//   24   40:getfield        #47  <Field char[] _outputBuffer>
	//   25   43:aload_0         
	//   26   44:getfield        #60  <Field int _outputTail>
	//   27   47:invokevirtual   #97  <Method void String.getChars(int, int, char[], int)>
		if(_characterEscapes != null)
	//*  28   50:aload_0         
	//*  29   51:getfield        #69  <Field CharacterEscapes _characterEscapes>
	//*  30   54:ifnull          63
		{
			_writeStringCustom(i);
	//   31   57:aload_0         
	//   32   58:iload_2         
	//   33   59:invokespecial   #169 <Method void _writeStringCustom(int)>
			return;
	//   34   62:return          
		}
		if(_maximumNonEscapedChar != 0)
	//*  35   63:aload_0         
	//*  36   64:getfield        #129 <Field int _maximumNonEscapedChar>
	//*  37   67:ifeq            80
		{
			_writeStringASCII(i, _maximumNonEscapedChar);
	//   38   70:aload_0         
	//   39   71:iload_2         
	//   40   72:aload_0         
	//   41   73:getfield        #129 <Field int _maximumNonEscapedChar>
	//   42   76:invokespecial   #172 <Method void _writeStringASCII(int, int)>
			return;
	//   43   79:return          
		} else
		{
			_writeString2(i);
	//   44   80:aload_0         
	//   45   81:iload_2         
	//   46   82:invokespecial   #175 <Method void _writeString2(int)>
			return;
	//   47   85:return          
		}
	}

	private void _writeString(char ac[], int i, int j)
		throws IOException
	{
		if(_characterEscapes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field CharacterEscapes _characterEscapes>
	//*   2    4:ifnull          15
		{
			_writeStringCustom(ac, i, j);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokespecial   #177 <Method void _writeStringCustom(char[], int, int)>
			return;
	//    8   14:return          
		}
		if(_maximumNonEscapedChar != 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #129 <Field int _maximumNonEscapedChar>
	//*  11   19:ifeq            34
		{
			_writeStringASCII(ac, i, j, _maximumNonEscapedChar);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:iload_2         
	//   15   25:iload_3         
	//   16   26:aload_0         
	//   17   27:getfield        #129 <Field int _maximumNonEscapedChar>
	//   18   30:invokespecial   #180 <Method void _writeStringASCII(char[], int, int, int)>
			return;
	//   19   33:return          
		}
		int i1 = j + i;
	//   20   34:iload_3         
	//   21   35:iload_2         
	//   22   36:iadd            
	//   23   37:istore          6
		int ai[] = _outputEscapes;
	//   24   39:aload_0         
	//   25   40:getfield        #160 <Field int[] _outputEscapes>
	//   26   43:astore          8
		int j1 = ai.length;
	//   27   45:aload           8
	//   28   47:arraylength     
	//   29   48:istore          7
		while(i < i1) 
	//*  30   50:iload_2         
	//*  31   51:iload           6
	//*  32   53:icmpge          208
		{
			j = i;
	//   33   56:iload_2         
	//   34   57:istore_3        
			do
			{
				int k = ((int) (ac[j]));
	//   35   58:aload_1         
	//   36   59:iload_3         
	//   37   60:caload          
	//   38   61:istore          5
				if(k < j1 && ai[k] != 0)
	//*  39   63:iload           5
	//*  40   65:iload           7
	//*  41   67:icmpge          81
	//*  42   70:aload           8
	//*  43   72:iload           5
	//*  44   74:iaload          
	//*  45   75:ifeq            81
					break;
	//   46   78:goto            99
				k = j + 1;
	//   47   81:iload_3         
	//   48   82:iconst_1        
	//   49   83:iadd            
	//   50   84:istore          5
				j = k;
	//   51   86:iload           5
	//   52   88:istore_3        
				if(k < i1)
					continue;
	//   53   89:iload           5
	//   54   91:iload           6
	//   55   93:icmplt          58
				j = k;
	//   56   96:iload           5
	//   57   98:istore_3        
				break;
			} while(true);
			int l = j - i;
	//   58   99:iload_3         
	//   59  100:iload_2         
	//   60  101:isub            
	//   61  102:istore          5
			if(l < 32)
	//*  62  104:iload           5
	//*  63  106:bipush          32
	//*  64  108:icmpge          163
			{
				if(_outputTail + l > _outputEnd)
	//*  65  111:aload_0         
	//*  66  112:getfield        #60  <Field int _outputTail>
	//*  67  115:iload           5
	//*  68  117:iadd            
	//*  69  118:aload_0         
	//*  70  119:getfield        #49  <Field int _outputEnd>
	//*  71  122:icmple          129
					_flushBuffer();
	//   72  125:aload_0         
	//   73  126:invokevirtual   #63  <Method void _flushBuffer()>
				if(l > 0)
	//*  74  129:iload           5
	//*  75  131:ifle            178
				{
					System.arraycopy(((Object) (ac)), i, ((Object) (_outputBuffer)), _outputTail, l);
	//   76  134:aload_1         
	//   77  135:iload_2         
	//   78  136:aload_0         
	//   79  137:getfield        #47  <Field char[] _outputBuffer>
	//   80  140:aload_0         
	//   81  141:getfield        #60  <Field int _outputTail>
	//   82  144:iload           5
	//   83  146:invokestatic    #186 <Method void System.arraycopy(Object, int, Object, int, int)>
					_outputTail = _outputTail + l;
	//   84  149:aload_0         
	//   85  150:aload_0         
	//   86  151:getfield        #60  <Field int _outputTail>
	//   87  154:iload           5
	//   88  156:iadd            
	//   89  157:putfield        #60  <Field int _outputTail>
				}
			} else
	//*  90  160:goto            178
			{
				_flushBuffer();
	//   91  163:aload_0         
	//   92  164:invokevirtual   #63  <Method void _flushBuffer()>
				_writer.write(ac, i, l);
	//   93  167:aload_0         
	//   94  168:getfield        #40  <Field Writer _writer>
	//   95  171:aload_1         
	//   96  172:iload_2         
	//   97  173:iload           5
	//   98  175:invokevirtual   #105 <Method void Writer.write(char[], int, int)>
			}
			if(j >= i1)
	//*  99  178:iload_3         
	//* 100  179:iload           6
	//* 101  181:icmplt          185
				return;
	//  102  184:return          
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
	//  116  202:invokespecial   #188 <Method void _appendCharacterEscape(char, int)>
		}
	//* 117  205:goto            50
	//  118  208:return          
	}

	private void _writeString2(int i)
		throws IOException
	{
		i = _outputTail + i;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int _outputTail>
	//    2    4:iload_1         
	//    3    5:iadd            
	//    4    6:istore_1        
		int ai[] = _outputEscapes;
	//    5    7:aload_0         
	//    6    8:getfield        #160 <Field int[] _outputEscapes>
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
	//*  12   18:getfield        #60  <Field int _outputTail>
	//*  13   21:iload_1         
	//*  14   22:icmpge          141
				do
				{
					k = ((int) (_outputBuffer[_outputTail]));
	//   15   25:aload_0         
	//   16   26:getfield        #47  <Field char[] _outputBuffer>
	//   17   29:aload_0         
	//   18   30:getfield        #60  <Field int _outputTail>
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
	//   29   51:getfield        #60  <Field int _outputTail>
	//   30   54:aload_0         
	//   31   55:getfield        #107 <Field int _outputHead>
	//   32   58:isub            
	//   33   59:istore          4
						if(k > 0)
	//*  34   61:iload           4
	//*  35   63:ifle            83
							_writer.write(_outputBuffer, _outputHead, k);
	//   36   66:aload_0         
	//   37   67:getfield        #40  <Field Writer _writer>
	//   38   70:aload_0         
	//   39   71:getfield        #47  <Field char[] _outputBuffer>
	//   40   74:aload_0         
	//   41   75:getfield        #107 <Field int _outputHead>
	//   42   78:iload           4
	//   43   80:invokevirtual   #105 <Method void Writer.write(char[], int, int)>
						char ac[] = _outputBuffer;
	//   44   83:aload_0         
	//   45   84:getfield        #47  <Field char[] _outputBuffer>
	//   46   87:astore          6
						k = _outputTail;
	//   47   89:aload_0         
	//   48   90:getfield        #60  <Field int _outputTail>
	//   49   93:istore          4
						_outputTail = k + 1;
	//   50   95:aload_0         
	//   51   96:iload           4
	//   52   98:iconst_1        
	//   53   99:iadd            
	//   54  100:putfield        #60  <Field int _outputTail>
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
	//   64  115:invokespecial   #190 <Method void _prependOrWriteCharacterEscape(char, int)>
						continue label0;
	//   65  118:goto            17
					}
					k = _outputTail + 1;
	//   66  121:aload_0         
	//   67  122:getfield        #60  <Field int _outputTail>
	//   68  125:iconst_1        
	//   69  126:iadd            
	//   70  127:istore          4
					_outputTail = k;
	//   71  129:aload_0         
	//   72  130:iload           4
	//   73  132:putfield        #60  <Field int _outputTail>
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
		int k = _outputTail + i;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int _outputTail>
	//    2    4:iload_1         
	//    3    5:iadd            
	//    4    6:istore          4
		int ai[] = _outputEscapes;
	//    5    8:aload_0         
	//    6    9:getfield        #160 <Field int[] _outputEscapes>
	//    7   12:astore          7
		int l = Math.min(ai.length, j + 1);
	//    8   14:aload           7
	//    9   16:arraylength     
	//   10   17:iload_2         
	//   11   18:iconst_1        
	//   12   19:iadd            
	//   13   20:invokestatic    #115 <Method int Math.min(int, int)>
	//   14   23:istore          5
label0:
		do
		{
			if(_outputTail < k)
	//*  15   25:aload_0         
	//*  16   26:getfield        #60  <Field int _outputTail>
	//*  17   29:iload           4
	//*  18   31:icmpge          139
				do
				{
label1:
					{
						char c = _outputBuffer[_outputTail];
	//   19   34:aload_0         
	//   20   35:getfield        #47  <Field char[] _outputBuffer>
	//   21   38:aload_0         
	//   22   39:getfield        #60  <Field int _outputTail>
	//   23   42:caload          
	//   24   43:istore_3        
						if(c < l)
	//*  25   44:iload_3         
	//*  26   45:iload           5
	//*  27   47:icmpge          62
						{
							i = ai[c];
	//   28   50:aload           7
	//   29   52:iload_3         
	//   30   53:iaload          
	//   31   54:istore_1        
							if(i == 0)
	//*  32   55:iload_1         
	//*  33   56:ifeq            121
								break label1;
	//   34   59:goto            69
						} else
						{
							if(c <= j)
								break label1;
	//   35   62:iload_3         
	//   36   63:iload_2         
	//   37   64:icmple          121
							i = -1;
	//   38   67:iconst_m1       
	//   39   68:istore_1        
						}
						int i1 = _outputTail - _outputHead;
	//   40   69:aload_0         
	//   41   70:getfield        #60  <Field int _outputTail>
	//   42   73:aload_0         
	//   43   74:getfield        #107 <Field int _outputHead>
	//   44   77:isub            
	//   45   78:istore          6
						if(i1 > 0)
	//*  46   80:iload           6
	//*  47   82:ifle            102
							_writer.write(_outputBuffer, _outputHead, i1);
	//   48   85:aload_0         
	//   49   86:getfield        #40  <Field Writer _writer>
	//   50   89:aload_0         
	//   51   90:getfield        #47  <Field char[] _outputBuffer>
	//   52   93:aload_0         
	//   53   94:getfield        #107 <Field int _outputHead>
	//   54   97:iload           6
	//   55   99:invokevirtual   #105 <Method void Writer.write(char[], int, int)>
						_outputTail = _outputTail + 1;
	//   56  102:aload_0         
	//   57  103:aload_0         
	//   58  104:getfield        #60  <Field int _outputTail>
	//   59  107:iconst_1        
	//   60  108:iadd            
	//   61  109:putfield        #60  <Field int _outputTail>
						_prependOrWriteCharacterEscape(c, i);
	//   62  112:aload_0         
	//   63  113:iload_3         
	//   64  114:iload_1         
	//   65  115:invokespecial   #190 <Method void _prependOrWriteCharacterEscape(char, int)>
						continue label0;
	//   66  118:goto            25
					}
					i = _outputTail + 1;
	//   67  121:aload_0         
	//   68  122:getfield        #60  <Field int _outputTail>
	//   69  125:iconst_1        
	//   70  126:iadd            
	//   71  127:istore_1        
					_outputTail = i;
	//   72  128:aload_0         
	//   73  129:iload_1         
	//   74  130:putfield        #60  <Field int _outputTail>
				} while(i < k);
	//   75  133:iload_1         
	//   76  134:iload           4
	//   77  136:icmplt          34
			return;
	//   78  139:return          
		} while(true);
	}

	private void _writeStringASCII(char ac[], int i, int j, int k)
		throws IOException, JsonGenerationException
	{
		int l1 = j + i;
	//    0    0:iload_3         
	//    1    1:iload_2         
	//    2    2:iadd            
	//    3    3:istore          9
		int ai[] = _outputEscapes;
	//    4    5:aload_0         
	//    5    6:getfield        #160 <Field int[] _outputEscapes>
	//    6    9:astore          11
		boolean flag = false;
	//    7   11:iconst_0        
	//    8   12:istore          6
		int i2 = Math.min(ai.length, k + 1);
	//    9   14:aload           11
	//   10   16:arraylength     
	//   11   17:iload           4
	//   12   19:iconst_1        
	//   13   20:iadd            
	//   14   21:invokestatic    #115 <Method int Math.min(int, int)>
	//   15   24:istore          10
		j = i;
	//   16   26:iload_2         
	//   17   27:istore_3        
		i = ((int) (flag));
	//   18   28:iload           6
	//   19   30:istore_2        
		while(j < l1) 
	//*  20   31:iload_3         
	//*  21   32:iload           9
	//*  22   34:icmpge          227
		{
			int j1 = i;
	//   23   37:iload_2         
	//   24   38:istore          7
			i = j;
	//   25   40:iload_3         
	//   26   41:istore_2        
			char c;
			int k1;
			do
			{
				c = ac[i];
	//   27   42:aload_1         
	//   28   43:iload_2         
	//   29   44:caload          
	//   30   45:istore          5
				int l;
				if(c < i2)
	//*  31   47:iload           5
	//*  32   49:iload           10
	//*  33   51:icmpge          79
				{
					j1 = ai[c];
	//   34   54:aload           11
	//   35   56:iload           5
	//   36   58:iaload          
	//   37   59:istore          7
					l = j1;
	//   38   61:iload           7
	//   39   63:istore          6
					if(j1 != 0)
	//*  40   65:iload           7
	//*  41   67:ifeq            102
					{
						k1 = i;
	//   42   70:iload_2         
	//   43   71:istore          8
						i = j1;
	//   44   73:iload           7
	//   45   75:istore_2        
						break;
	//   46   76:goto            124
					}
				} else
				{
					l = j1;
	//   47   79:iload           7
	//   48   81:istore          6
					if(c > k)
	//*  49   83:iload           5
	//*  50   85:iload           4
	//*  51   87:icmple          102
					{
						l = -1;
	//   52   90:iconst_m1       
	//   53   91:istore          6
						k1 = i;
	//   54   93:iload_2         
	//   55   94:istore          8
						i = l;
	//   56   96:iload           6
	//   57   98:istore_2        
						break;
	//   58   99:goto            124
					}
				}
				k1 = i + 1;
	//   59  102:iload_2         
	//   60  103:iconst_1        
	//   61  104:iadd            
	//   62  105:istore          8
				i = k1;
	//   63  107:iload           8
	//   64  109:istore_2        
				j1 = l;
	//   65  110:iload           6
	//   66  112:istore          7
				if(k1 < l1)
					continue;
	//   67  114:iload           8
	//   68  116:iload           9
	//   69  118:icmplt          42
				i = l;
	//   70  121:iload           6
	//   71  123:istore_2        
				break;
			} while(true);
			int i1 = k1 - j;
	//   72  124:iload           8
	//   73  126:iload_3         
	//   74  127:isub            
	//   75  128:istore          6
			if(i1 < 32)
	//*  76  130:iload           6
	//*  77  132:bipush          32
	//*  78  134:icmpge          189
			{
				if(_outputTail + i1 > _outputEnd)
	//*  79  137:aload_0         
	//*  80  138:getfield        #60  <Field int _outputTail>
	//*  81  141:iload           6
	//*  82  143:iadd            
	//*  83  144:aload_0         
	//*  84  145:getfield        #49  <Field int _outputEnd>
	//*  85  148:icmple          155
					_flushBuffer();
	//   86  151:aload_0         
	//   87  152:invokevirtual   #63  <Method void _flushBuffer()>
				if(i1 > 0)
	//*  88  155:iload           6
	//*  89  157:ifle            204
				{
					System.arraycopy(((Object) (ac)), j, ((Object) (_outputBuffer)), _outputTail, i1);
	//   90  160:aload_1         
	//   91  161:iload_3         
	//   92  162:aload_0         
	//   93  163:getfield        #47  <Field char[] _outputBuffer>
	//   94  166:aload_0         
	//   95  167:getfield        #60  <Field int _outputTail>
	//   96  170:iload           6
	//   97  172:invokestatic    #186 <Method void System.arraycopy(Object, int, Object, int, int)>
					_outputTail = _outputTail + i1;
	//   98  175:aload_0         
	//   99  176:aload_0         
	//  100  177:getfield        #60  <Field int _outputTail>
	//  101  180:iload           6
	//  102  182:iadd            
	//  103  183:putfield        #60  <Field int _outputTail>
				}
			} else
	//* 104  186:goto            204
			{
				_flushBuffer();
	//  105  189:aload_0         
	//  106  190:invokevirtual   #63  <Method void _flushBuffer()>
				_writer.write(ac, j, i1);
	//  107  193:aload_0         
	//  108  194:getfield        #40  <Field Writer _writer>
	//  109  197:aload_1         
	//  110  198:iload_3         
	//  111  199:iload           6
	//  112  201:invokevirtual   #105 <Method void Writer.write(char[], int, int)>
			}
			if(k1 >= l1)
	//* 113  204:iload           8
	//* 114  206:iload           9
	//* 115  208:icmplt          212
				return;
	//  116  211:return          
			j = k1 + 1;
	//  117  212:iload           8
	//  118  214:iconst_1        
	//  119  215:iadd            
	//  120  216:istore_3        
			_appendCharacterEscape(c, i);
	//  121  217:aload_0         
	//  122  218:iload           5
	//  123  220:iload_2         
	//  124  221:invokespecial   #188 <Method void _appendCharacterEscape(char, int)>
		}
	//* 125  224:goto            31
	//  126  227:return          
	}

	private void _writeStringCustom(int i)
		throws IOException, JsonGenerationException
	{
		int k = _outputTail + i;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int _outputTail>
	//    2    4:iload_1         
	//    3    5:iadd            
	//    4    6:istore          4
		int ai[] = _outputEscapes;
	//    5    8:aload_0         
	//    6    9:getfield        #160 <Field int[] _outputEscapes>
	//    7   12:astore          7
		int j;
		if(_maximumNonEscapedChar < 1)
	//*   8   14:aload_0         
	//*   9   15:getfield        #129 <Field int _maximumNonEscapedChar>
	//*  10   18:iconst_1        
	//*  11   19:icmpge          28
			j = 65535;
	//   12   22:ldc1            #163 <Int 65535>
	//   13   24:istore_3        
		else
	//*  14   25:goto            33
			j = _maximumNonEscapedChar;
	//   15   28:aload_0         
	//   16   29:getfield        #129 <Field int _maximumNonEscapedChar>
	//   17   32:istore_3        
		int l = Math.min(ai.length, j + 1);
	//   18   33:aload           7
	//   19   35:arraylength     
	//   20   36:iload_3         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:invokestatic    #115 <Method int Math.min(int, int)>
	//   24   42:istore          5
		CharacterEscapes characterescapes = _characterEscapes;
	//   25   44:aload_0         
	//   26   45:getfield        #69  <Field CharacterEscapes _characterEscapes>
	//   27   48:astore          8
label0:
		do
		{
			if(_outputTail < k)
	//*  28   50:aload_0         
	//*  29   51:getfield        #60  <Field int _outputTail>
	//*  30   54:iload           4
	//*  31   56:icmpge          189
				do
				{
label1:
					{
						char c = _outputBuffer[_outputTail];
	//   32   59:aload_0         
	//   33   60:getfield        #47  <Field char[] _outputBuffer>
	//   34   63:aload_0         
	//   35   64:getfield        #60  <Field int _outputTail>
	//   36   67:caload          
	//   37   68:istore_2        
						if(c < l)
	//*  38   69:iload_2         
	//*  39   70:iload           5
	//*  40   72:icmpge          87
						{
							i = ai[c];
	//   41   75:aload           7
	//   42   77:iload_2         
	//   43   78:iaload          
	//   44   79:istore_1        
							if(i == 0)
	//*  45   80:iload_1         
	//*  46   81:ifeq            171
								break label1;
	//   47   84:goto            119
						} else
						if(c > j)
	//*  48   87:iload_2         
	//*  49   88:iload_3         
	//*  50   89:icmple          97
						{
							i = -1;
	//   51   92:iconst_m1       
	//   52   93:istore_1        
						} else
	//*  53   94:goto            119
						{
							SerializableString serializablestring = characterescapes.getEscapeSequence(((int) (c)));
	//   54   97:aload           8
	//   55   99:iload_2         
	//   56  100:invokevirtual   #75  <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//   57  103:astore          9
							_currentEscape = serializablestring;
	//   58  105:aload_0         
	//   59  106:aload           9
	//   60  108:putfield        #65  <Field SerializableString _currentEscape>
							if(serializablestring == null)
								break label1;
	//   61  111:aload           9
	//   62  113:ifnull          171
							i = -2;
	//   63  116:bipush          -2
	//   64  118:istore_1        
						}
						int i1 = _outputTail - _outputHead;
	//   65  119:aload_0         
	//   66  120:getfield        #60  <Field int _outputTail>
	//   67  123:aload_0         
	//   68  124:getfield        #107 <Field int _outputHead>
	//   69  127:isub            
	//   70  128:istore          6
						if(i1 > 0)
	//*  71  130:iload           6
	//*  72  132:ifle            152
							_writer.write(_outputBuffer, _outputHead, i1);
	//   73  135:aload_0         
	//   74  136:getfield        #40  <Field Writer _writer>
	//   75  139:aload_0         
	//   76  140:getfield        #47  <Field char[] _outputBuffer>
	//   77  143:aload_0         
	//   78  144:getfield        #107 <Field int _outputHead>
	//   79  147:iload           6
	//   80  149:invokevirtual   #105 <Method void Writer.write(char[], int, int)>
						_outputTail = _outputTail + 1;
	//   81  152:aload_0         
	//   82  153:aload_0         
	//   83  154:getfield        #60  <Field int _outputTail>
	//   84  157:iconst_1        
	//   85  158:iadd            
	//   86  159:putfield        #60  <Field int _outputTail>
						_prependOrWriteCharacterEscape(c, i);
	//   87  162:aload_0         
	//   88  163:iload_2         
	//   89  164:iload_1         
	//   90  165:invokespecial   #190 <Method void _prependOrWriteCharacterEscape(char, int)>
						continue label0;
	//   91  168:goto            50
					}
					i = _outputTail + 1;
	//   92  171:aload_0         
	//   93  172:getfield        #60  <Field int _outputTail>
	//   94  175:iconst_1        
	//   95  176:iadd            
	//   96  177:istore_1        
					_outputTail = i;
	//   97  178:aload_0         
	//   98  179:iload_1         
	//   99  180:putfield        #60  <Field int _outputTail>
				} while(i < k);
	//  100  183:iload_1         
	//  101  184:iload           4
	//  102  186:icmplt          59
			return;
	//  103  189:return          
		} while(true);
	}

	private void _writeStringCustom(char ac[], int i, int j)
		throws IOException, JsonGenerationException
	{
		int k1 = j + i;
	//    0    0:iload_3         
	//    1    1:iload_2         
	//    2    2:iadd            
	//    3    3:istore          9
		int ai[] = _outputEscapes;
	//    4    5:aload_0         
	//    5    6:getfield        #160 <Field int[] _outputEscapes>
	//    6    9:astore          11
		int l;
		if(_maximumNonEscapedChar < 1)
	//*   7   11:aload_0         
	//*   8   12:getfield        #129 <Field int _maximumNonEscapedChar>
	//*   9   15:iconst_1        
	//*  10   16:icmpge          26
			l = 65535;
	//   11   19:ldc1            #163 <Int 65535>
	//   12   21:istore          6
		else
	//*  13   23:goto            32
			l = _maximumNonEscapedChar;
	//   14   26:aload_0         
	//   15   27:getfield        #129 <Field int _maximumNonEscapedChar>
	//   16   30:istore          6
		int l1 = Math.min(ai.length, l + 1);
	//   17   32:aload           11
	//   18   34:arraylength     
	//   19   35:iload           6
	//   20   37:iconst_1        
	//   21   38:iadd            
	//   22   39:invokestatic    #115 <Method int Math.min(int, int)>
	//   23   42:istore          10
		CharacterEscapes characterescapes = _characterEscapes;
	//   24   44:aload_0         
	//   25   45:getfield        #69  <Field CharacterEscapes _characterEscapes>
	//   26   48:astore          12
		boolean flag = false;
	//   27   50:iconst_0        
	//   28   51:istore          5
		j = i;
	//   29   53:iload_2         
	//   30   54:istore_3        
		i = ((int) (flag));
	//   31   55:iload           5
	//   32   57:istore_2        
		while(j < k1) 
	//*  33   58:iload_3         
	//*  34   59:iload           9
	//*  35   61:icmpge          291
		{
			int i1 = i;
	//   36   64:iload_2         
	//   37   65:istore          7
			i = j;
	//   38   67:iload_3         
	//   39   68:istore_2        
			char c;
			int k;
			do
			{
				c = ac[i];
	//   40   69:aload_1         
	//   41   70:iload_2         
	//   42   71:caload          
	//   43   72:istore          4
				if(c < l1)
	//*  44   74:iload           4
	//*  45   76:iload           10
	//*  46   78:icmpge          106
				{
					i1 = ai[c];
	//   47   81:aload           11
	//   48   83:iload           4
	//   49   85:iaload          
	//   50   86:istore          7
					k = i1;
	//   51   88:iload           7
	//   52   90:istore          5
					if(i1 != 0)
	//*  53   92:iload           7
	//*  54   94:ifeq            162
					{
						k = i;
	//   55   97:iload_2         
	//   56   98:istore          5
						i = i1;
	//   57  100:iload           7
	//   58  102:istore_2        
						break;
	//   59  103:goto            188
					}
				} else
				{
					if(c > l)
	//*  60  106:iload           4
	//*  61  108:iload           6
	//*  62  110:icmple          125
					{
						i1 = -1;
	//   63  113:iconst_m1       
	//   64  114:istore          7
						k = i;
	//   65  116:iload_2         
	//   66  117:istore          5
						i = i1;
	//   67  119:iload           7
	//   68  121:istore_2        
						break;
	//   69  122:goto            188
					}
					SerializableString serializablestring = characterescapes.getEscapeSequence(((int) (c)));
	//   70  125:aload           12
	//   71  127:iload           4
	//   72  129:invokevirtual   #75  <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//   73  132:astore          13
					_currentEscape = serializablestring;
	//   74  134:aload_0         
	//   75  135:aload           13
	//   76  137:putfield        #65  <Field SerializableString _currentEscape>
					k = i1;
	//   77  140:iload           7
	//   78  142:istore          5
					if(serializablestring != null)
	//*  79  144:aload           13
	//*  80  146:ifnull          162
					{
						i1 = -2;
	//   81  149:bipush          -2
	//   82  151:istore          7
						k = i;
	//   83  153:iload_2         
	//   84  154:istore          5
						i = i1;
	//   85  156:iload           7
	//   86  158:istore_2        
						break;
	//   87  159:goto            188
					}
				}
				int j1 = i + 1;
	//   88  162:iload_2         
	//   89  163:iconst_1        
	//   90  164:iadd            
	//   91  165:istore          8
				i = j1;
	//   92  167:iload           8
	//   93  169:istore_2        
				i1 = k;
	//   94  170:iload           5
	//   95  172:istore          7
				if(j1 < k1)
					continue;
	//   96  174:iload           8
	//   97  176:iload           9
	//   98  178:icmplt          69
				i = k;
	//   99  181:iload           5
	//  100  183:istore_2        
				k = j1;
	//  101  184:iload           8
	//  102  186:istore          5
				break;
			} while(true);
			i1 = k - j;
	//  103  188:iload           5
	//  104  190:iload_3         
	//  105  191:isub            
	//  106  192:istore          7
			if(i1 < 32)
	//* 107  194:iload           7
	//* 108  196:bipush          32
	//* 109  198:icmpge          253
			{
				if(_outputTail + i1 > _outputEnd)
	//* 110  201:aload_0         
	//* 111  202:getfield        #60  <Field int _outputTail>
	//* 112  205:iload           7
	//* 113  207:iadd            
	//* 114  208:aload_0         
	//* 115  209:getfield        #49  <Field int _outputEnd>
	//* 116  212:icmple          219
					_flushBuffer();
	//  117  215:aload_0         
	//  118  216:invokevirtual   #63  <Method void _flushBuffer()>
				if(i1 > 0)
	//* 119  219:iload           7
	//* 120  221:ifle            268
				{
					System.arraycopy(((Object) (ac)), j, ((Object) (_outputBuffer)), _outputTail, i1);
	//  121  224:aload_1         
	//  122  225:iload_3         
	//  123  226:aload_0         
	//  124  227:getfield        #47  <Field char[] _outputBuffer>
	//  125  230:aload_0         
	//  126  231:getfield        #60  <Field int _outputTail>
	//  127  234:iload           7
	//  128  236:invokestatic    #186 <Method void System.arraycopy(Object, int, Object, int, int)>
					_outputTail = _outputTail + i1;
	//  129  239:aload_0         
	//  130  240:aload_0         
	//  131  241:getfield        #60  <Field int _outputTail>
	//  132  244:iload           7
	//  133  246:iadd            
	//  134  247:putfield        #60  <Field int _outputTail>
				}
			} else
	//* 135  250:goto            268
			{
				_flushBuffer();
	//  136  253:aload_0         
	//  137  254:invokevirtual   #63  <Method void _flushBuffer()>
				_writer.write(ac, j, i1);
	//  138  257:aload_0         
	//  139  258:getfield        #40  <Field Writer _writer>
	//  140  261:aload_1         
	//  141  262:iload_3         
	//  142  263:iload           7
	//  143  265:invokevirtual   #105 <Method void Writer.write(char[], int, int)>
			}
			if(k >= k1)
	//* 144  268:iload           5
	//* 145  270:iload           9
	//* 146  272:icmplt          276
				return;
	//  147  275:return          
			j = k + 1;
	//  148  276:iload           5
	//  149  278:iconst_1        
	//  150  279:iadd            
	//  151  280:istore_3        
			_appendCharacterEscape(c, i);
	//  152  281:aload_0         
	//  153  282:iload           4
	//  154  284:iload_2         
	//  155  285:invokespecial   #188 <Method void _appendCharacterEscape(char, int)>
		}
	//* 156  288:goto            58
	//  157  291:return          
	}

	private void writeRawLong(String s)
		throws IOException
	{
		int i = _outputEnd - _outputTail;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int _outputEnd>
	//    2    4:aload_0         
	//    3    5:getfield        #60  <Field int _outputTail>
	//    4    8:isub            
	//    5    9:istore_2        
		s.getChars(0, i, _outputBuffer, _outputTail);
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #47  <Field char[] _outputBuffer>
	//   11   17:aload_0         
	//   12   18:getfield        #60  <Field int _outputTail>
	//   13   21:invokevirtual   #97  <Method void String.getChars(int, int, char[], int)>
		_outputTail = _outputTail + i;
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #60  <Field int _outputTail>
	//   17   29:iload_2         
	//   18   30:iadd            
	//   19   31:putfield        #60  <Field int _outputTail>
		_flushBuffer();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #63  <Method void _flushBuffer()>
		int j;
		for(j = s.length() - i; j > _outputEnd;)
	//*  22   38:aload_1         
	//*  23   39:invokevirtual   #87  <Method int String.length()>
	//*  24   42:iload_2         
	//*  25   43:isub            
	//*  26   44:istore_3        
	//*  27   45:iload_3         
	//*  28   46:aload_0         
	//*  29   47:getfield        #49  <Field int _outputEnd>
	//*  30   50:icmple          103
		{
			int l = _outputEnd;
	//   31   53:aload_0         
	//   32   54:getfield        #49  <Field int _outputEnd>
	//   33   57:istore          5
			int k = i + l;
	//   34   59:iload_2         
	//   35   60:iload           5
	//   36   62:iadd            
	//   37   63:istore          4
			s.getChars(i, k, _outputBuffer, 0);
	//   38   65:aload_1         
	//   39   66:iload_2         
	//   40   67:iload           4
	//   41   69:aload_0         
	//   42   70:getfield        #47  <Field char[] _outputBuffer>
	//   43   73:iconst_0        
	//   44   74:invokevirtual   #97  <Method void String.getChars(int, int, char[], int)>
			_outputHead = 0;
	//   45   77:aload_0         
	//   46   78:iconst_0        
	//   47   79:putfield        #107 <Field int _outputHead>
			_outputTail = l;
	//   48   82:aload_0         
	//   49   83:iload           5
	//   50   85:putfield        #60  <Field int _outputTail>
			_flushBuffer();
	//   51   88:aload_0         
	//   52   89:invokevirtual   #63  <Method void _flushBuffer()>
			j -= l;
	//   53   92:iload_3         
	//   54   93:iload           5
	//   55   95:isub            
	//   56   96:istore_3        
			i = k;
	//   57   97:iload           4
	//   58   99:istore_2        
		}

	//*  59  100:goto            45
		s.getChars(i, i + j, _outputBuffer, 0);
	//   60  103:aload_1         
	//   61  104:iload_2         
	//   62  105:iload_2         
	//   63  106:iload_3         
	//   64  107:iadd            
	//   65  108:aload_0         
	//   66  109:getfield        #47  <Field char[] _outputBuffer>
	//   67  112:iconst_0        
	//   68  113:invokevirtual   #97  <Method void String.getChars(int, int, char[], int)>
		_outputHead = 0;
	//   69  116:aload_0         
	//   70  117:iconst_0        
	//   71  118:putfield        #107 <Field int _outputHead>
		_outputTail = j;
	//   72  121:aload_0         
	//   73  122:iload_3         
	//   74  123:putfield        #60  <Field int _outputTail>
	//   75  126:return          
	}

	protected void _flushBuffer()
		throws IOException
	{
		int i = _outputTail - _outputHead;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int _outputTail>
	//    2    4:aload_0         
	//    3    5:getfield        #107 <Field int _outputHead>
	//    4    8:isub            
	//    5    9:istore_1        
		if(i > 0)
	//*   6   10:iload_1         
	//*   7   11:ifle            42
		{
			int j = _outputHead;
	//    8   14:aload_0         
	//    9   15:getfield        #107 <Field int _outputHead>
	//   10   18:istore_2        
			_outputHead = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #107 <Field int _outputHead>
			_outputTail = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #60  <Field int _outputTail>
			_writer.write(_outputBuffer, j, i);
	//   17   29:aload_0         
	//   18   30:getfield        #40  <Field Writer _writer>
	//   19   33:aload_0         
	//   20   34:getfield        #47  <Field char[] _outputBuffer>
	//   21   37:iload_2         
	//   22   38:iload_1         
	//   23   39:invokevirtual   #105 <Method void Writer.write(char[], int, int)>
		}
	//   24   42:return          
	}

	protected void _releaseBuffers()
	{
		char ac[] = _outputBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field char[] _outputBuffer>
	//    2    4:astore_1        
		if(ac != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          22
		{
			_outputBuffer = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #47  <Field char[] _outputBuffer>
			_ioContext.releaseConcatBuffer(ac);
	//    8   14:aload_0         
	//    9   15:getfield        #196 <Field IOContext _ioContext>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #200 <Method void IOContext.releaseConcatBuffer(char[])>
		}
	//   12   22:return          
	}

	protected void _verifyValueWrite(String s)
		throws IOException
	{
		int i = _writeContext.writeValue();
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field JsonWriteContext _writeContext>
	//    2    4:invokevirtual   #210 <Method int JsonWriteContext.writeValue()>
	//    3    7:istore_3        
		if(_cfgPrettyPrinter != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #214 <Field PrettyPrinter _cfgPrettyPrinter>
	//*   6   12:ifnull          22
		{
			_verifyPrettyValueWrite(s, i);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:iload_3         
	//   10   18:invokevirtual   #218 <Method void _verifyPrettyValueWrite(String, int)>
			return;
	//   11   21:return          
		}
		if(i != 5)
	//*  12   22:iload_3         
	//*  13   23:iconst_5        
	//*  14   24:icmpeq          124
		{
			char c;
			switch(i)
	//*  15   27:iload_3         
			{
	//*  16   28:tableswitch     1 3: default 56
	//	               1 84
	//	               2 78
	//	               3 57
			default:
				return;
	//   17   56:return          

			case 3: // '\003'
				if(_rootValueSeparator != null)
	//*  18   57:aload_0         
	//*  19   58:getfield        #221 <Field SerializableString _rootValueSeparator>
	//*  20   61:ifnull          77
					writeRaw(_rootValueSeparator.getValue());
	//   21   64:aload_0         
	//   22   65:aload_0         
	//   23   66:getfield        #221 <Field SerializableString _rootValueSeparator>
	//   24   69:invokeinterface #81  <Method String SerializableString.getValue()>
	//   25   74:invokevirtual   #154 <Method void writeRaw(String)>
				return;
	//   26   77:return          

			case 2: // '\002'
				c = ':';
	//   27   78:bipush          58
	//   28   80:istore_2        
				break;

	//*  29   81:goto            87
			case 1: // '\001'
				c = ',';
	//   30   84:bipush          44
	//   31   86:istore_2        
				break;
			}
			if(_outputTail >= _outputEnd)
	//*  32   87:aload_0         
	//*  33   88:getfield        #60  <Field int _outputTail>
	//*  34   91:aload_0         
	//*  35   92:getfield        #49  <Field int _outputEnd>
	//*  36   95:icmplt          102
				_flushBuffer();
	//   37   98:aload_0         
	//   38   99:invokevirtual   #63  <Method void _flushBuffer()>
			s = ((String) (_outputBuffer));
	//   39  102:aload_0         
	//   40  103:getfield        #47  <Field char[] _outputBuffer>
	//   41  106:astore_1        
			i = _outputTail;
	//   42  107:aload_0         
	//   43  108:getfield        #60  <Field int _outputTail>
	//   44  111:istore_3        
			_outputTail = i + 1;
	//   45  112:aload_0         
	//   46  113:iload_3         
	//   47  114:iconst_1        
	//   48  115:iadd            
	//   49  116:putfield        #60  <Field int _outputTail>
			s[i] = c;
	//   50  119:aload_1         
	//   51  120:iload_3         
	//   52  121:iload_2         
	//   53  122:castore         
			return;
	//   54  123:return          
		} else
		{
			_reportCantWriteValueExpectName(s);
	//   55  124:aload_0         
	//   56  125:aload_1         
	//   57  126:invokevirtual   #224 <Method void _reportCantWriteValueExpectName(String)>
			return;
	//   58  129:return          
		}
	}

	protected int _writeBinary(Base64Variant base64variant, InputStream inputstream, byte abyte0[])
		throws IOException, JsonGenerationException
	{
		int k2 = _outputEnd - 6;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int _outputEnd>
	//    2    4:bipush          6
	//    3    6:isub            
	//    4    7:istore          14
		int i = base64variant.getMaxLineLength();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #231 <Method int Base64Variant.getMaxLineLength()>
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
		int k = i;
	//   16   28:iload           4
	//   17   30:istore          6
		int j1 = k;
	//   18   32:iload           6
	//   19   34:istore          9
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
	//   20   36:iload           10
	//   21   38:istore          8
				l1 = k;
	//   22   40:iload           6
	//   23   42:istore          11
				l = j1;
	//   24   44:iload           9
	//   25   46:istore          7
				if(k > k1)
	//*  26   48:iload           6
	//*  27   50:iload           10
	//*  28   52:icmple          179
				{
					l = _readMore(inputstream, abyte0, k, j1, abyte0.length);
	//   29   55:aload_0         
	//   30   56:aload_2         
	//   31   57:aload_3         
	//   32   58:iload           6
	//   33   60:iload           9
	//   34   62:aload_3         
	//   35   63:arraylength     
	//   36   64:invokespecial   #233 <Method int _readMore(InputStream, byte[], int, int, int)>
	//   37   67:istore          7
					if(l < 3)
	//*  38   69:iload           7
	//*  39   71:iconst_3        
	//*  40   72:icmpge          170
					{
						j = i;
	//   41   75:iload           4
	//   42   77:istore          5
						if(l > 0)
	//*  43   79:iload           7
	//*  44   81:ifle            167
						{
							if(_outputTail > k2)
	//*  45   84:aload_0         
	//*  46   85:getfield        #60  <Field int _outputTail>
	//*  47   88:iload           14
	//*  48   90:icmple          97
								_flushBuffer();
	//   49   93:aload_0         
	//   50   94:invokevirtual   #63  <Method void _flushBuffer()>
							i1 = abyte0[0] << 16;
	//   51   97:aload_3         
	//   52   98:iconst_0        
	//   53   99:baload          
	//   54  100:bipush          16
	//   55  102:ishl            
	//   56  103:istore          8
							k = 1;
	//   57  105:iconst_1        
	//   58  106:istore          6
							j = i1;
	//   59  108:iload           8
	//   60  110:istore          5
							if(1 < l)
	//*  61  112:iconst_1        
	//*  62  113:iload           7
	//*  63  115:icmpge          136
							{
								j = i1 | (abyte0[1] & 0xff) << 8;
	//   64  118:iload           8
	//   65  120:aload_3         
	//   66  121:iconst_1        
	//   67  122:baload          
	//   68  123:sipush          255
	//   69  126:iand            
	//   70  127:bipush          8
	//   71  129:ishl            
	//   72  130:ior             
	//   73  131:istore          5
								k = 2;
	//   74  133:iconst_2        
	//   75  134:istore          6
							}
							i += k;
	//   76  136:iload           4
	//   77  138:iload           6
	//   78  140:iadd            
	//   79  141:istore          4
							_outputTail = base64variant.encodeBase64Partial(j, k, _outputBuffer, _outputTail);
	//   80  143:aload_0         
	//   81  144:aload_1         
	//   82  145:iload           5
	//   83  147:iload           6
	//   84  149:aload_0         
	//   85  150:getfield        #47  <Field char[] _outputBuffer>
	//   86  153:aload_0         
	//   87  154:getfield        #60  <Field int _outputTail>
	//   88  157:invokevirtual   #237 <Method int Base64Variant.encodeBase64Partial(int, int, char[], int)>
	//   89  160:putfield        #60  <Field int _outputTail>
							j = i;
	//   90  163:iload           4
	//   91  165:istore          5
						}
						return j;
	//   92  167:iload           5
	//   93  169:ireturn         
					}
					i1 = l - 3;
	//   94  170:iload           7
	//   95  172:iconst_3        
	//   96  173:isub            
	//   97  174:istore          8
					l1 = 0;
	//   98  176:iconst_0        
	//   99  177:istore          11
				}
				if(_outputTail > k2)
	//* 100  179:aload_0         
	//* 101  180:getfield        #60  <Field int _outputTail>
	//* 102  183:iload           14
	//* 103  185:icmple          192
					_flushBuffer();
	//  104  188:aload_0         
	//  105  189:invokevirtual   #63  <Method void _flushBuffer()>
				j1 = l1 + 1;
	//  106  192:iload           11
	//  107  194:iconst_1        
	//  108  195:iadd            
	//  109  196:istore          9
				k = ((int) (abyte0[l1]));
	//  110  198:aload_3         
	//  111  199:iload           11
	//  112  201:baload          
	//  113  202:istore          6
				k1 = j1 + 1;
	//  114  204:iload           9
	//  115  206:iconst_1        
	//  116  207:iadd            
	//  117  208:istore          10
				j1 = ((int) (abyte0[j1]));
	//  118  210:aload_3         
	//  119  211:iload           9
	//  120  213:baload          
	//  121  214:istore          9
				l1 = k1 + 1;
	//  122  216:iload           10
	//  123  218:iconst_1        
	//  124  219:iadd            
	//  125  220:istore          11
				k1 = ((int) (abyte0[k1]));
	//  126  222:aload_3         
	//  127  223:iload           10
	//  128  225:baload          
	//  129  226:istore          10
				i2 = i + 3;
	//  130  228:iload           4
	//  131  230:iconst_3        
	//  132  231:iadd            
	//  133  232:istore          12
				_outputTail = base64variant.encodeBase64Chunk((j1 & 0xff | k << 8) << 8 | k1 & 0xff, _outputBuffer, _outputTail);
	//  134  234:aload_0         
	//  135  235:aload_1         
	//  136  236:iload           9
	//  137  238:sipush          255
	//  138  241:iand            
	//  139  242:iload           6
	//  140  244:bipush          8
	//  141  246:ishl            
	//  142  247:ior             
	//  143  248:bipush          8
	//  144  250:ishl            
	//  145  251:iload           10
	//  146  253:sipush          255
	//  147  256:iand            
	//  148  257:ior             
	//  149  258:aload_0         
	//  150  259:getfield        #47  <Field char[] _outputBuffer>
	//  151  262:aload_0         
	//  152  263:getfield        #60  <Field int _outputTail>
	//  153  266:invokevirtual   #240 <Method int Base64Variant.encodeBase64Chunk(int, char[], int)>
	//  154  269:putfield        #60  <Field int _outputTail>
				j2 = j - 1;
	//  155  272:iload           5
	//  156  274:iconst_1        
	//  157  275:isub            
	//  158  276:istore          13
				i = i2;
	//  159  278:iload           12
	//  160  280:istore          4
				k1 = i1;
	//  161  282:iload           8
	//  162  284:istore          10
				k = l1;
	//  163  286:iload           11
	//  164  288:istore          6
				j1 = l;
	//  165  290:iload           7
	//  166  292:istore          9
				j = j2;
	//  167  294:iload           13
	//  168  296:istore          5
			} while(j2 > 0);
	//  169  298:iload           13
	//  170  300:ifgt            36
			char ac[] = _outputBuffer;
	//  171  303:aload_0         
	//  172  304:getfield        #47  <Field char[] _outputBuffer>
	//  173  307:astore          15
			i = _outputTail;
	//  174  309:aload_0         
	//  175  310:getfield        #60  <Field int _outputTail>
	//  176  313:istore          4
			_outputTail = i + 1;
	//  177  315:aload_0         
	//  178  316:iload           4
	//  179  318:iconst_1        
	//  180  319:iadd            
	//  181  320:putfield        #60  <Field int _outputTail>
			ac[i] = '\\';
	//  182  323:aload           15
	//  183  325:iload           4
	//  184  327:bipush          92
	//  185  329:castore         
			ac = _outputBuffer;
	//  186  330:aload_0         
	//  187  331:getfield        #47  <Field char[] _outputBuffer>
	//  188  334:astore          15
			i = _outputTail;
	//  189  336:aload_0         
	//  190  337:getfield        #60  <Field int _outputTail>
	//  191  340:istore          4
			_outputTail = i + 1;
	//  192  342:aload_0         
	//  193  343:iload           4
	//  194  345:iconst_1        
	//  195  346:iadd            
	//  196  347:putfield        #60  <Field int _outputTail>
			ac[i] = 'n';
	//  197  350:aload           15
	//  198  352:iload           4
	//  199  354:bipush          110
	//  200  356:castore         
			j = base64variant.getMaxLineLength() >> 2;
	//  201  357:aload_1         
	//  202  358:invokevirtual   #231 <Method int Base64Variant.getMaxLineLength()>
	//  203  361:iconst_2        
	//  204  362:ishr            
	//  205  363:istore          5
			i = i2;
	//  206  365:iload           12
	//  207  367:istore          4
			k1 = i1;
	//  208  369:iload           8
	//  209  371:istore          10
			k = l1;
	//  210  373:iload           11
	//  211  375:istore          6
			j1 = l;
	//  212  377:iload           7
	//  213  379:istore          9
		} while(true);
	//  214  381:goto            36
	}

	protected int _writeBinary(Base64Variant base64variant, InputStream inputstream, byte abyte0[], int i)
		throws IOException, JsonGenerationException
	{
		int l2 = _outputEnd - 6;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int _outputEnd>
	//    2    4:bipush          6
	//    3    6:isub            
	//    4    7:istore          14
		int j1 = base64variant.getMaxLineLength() >> 2;
	//    5    9:aload_1         
	//    6   10:invokevirtual   #231 <Method int Base64Variant.getMaxLineLength()>
	//    7   13:iconst_2        
	//    8   14:ishr            
	//    9   15:istore          8
		int l1 = -3;
	//   10   17:bipush          -3
	//   11   19:istore          10
		int k = 0;
	//   12   21:iconst_0        
	//   13   22:istore          6
		int l = k;
	//   14   24:iload           6
	//   15   26:istore          7
		int j = i;
	//   16   28:iload           4
	//   17   30:istore          5
		i = k;
	//   18   32:iload           6
	//   19   34:istore          4
		k = j1;
	//   20   36:iload           8
	//   21   38:istore          6
		int k1;
		do
		{
			j1 = i;
	//   22   40:iload           4
	//   23   42:istore          8
			k1 = l;
	//   24   44:iload           7
	//   25   46:istore          9
			if(j <= 2)
				break;
	//   26   48:iload           5
	//   27   50:iconst_2        
	//   28   51:icmple          321
			k1 = l1;
	//   29   54:iload           10
	//   30   56:istore          9
			int i2 = i;
	//   31   58:iload           4
	//   32   60:istore          11
			j1 = l;
	//   33   62:iload           7
	//   34   64:istore          8
			if(i > l1)
	//*  35   66:iload           4
	//*  36   68:iload           10
	//*  37   70:icmple          116
			{
				i = _readMore(inputstream, abyte0, i, l, j);
	//   38   73:aload_0         
	//   39   74:aload_2         
	//   40   75:aload_3         
	//   41   76:iload           4
	//   42   78:iload           7
	//   43   80:iload           5
	//   44   82:invokespecial   #233 <Method int _readMore(InputStream, byte[], int, int, int)>
	//   45   85:istore          4
				if(i < 3)
	//*  46   87:iload           4
	//*  47   89:iconst_3        
	//*  48   90:icmpge          103
				{
					j1 = 0;
	//   49   93:iconst_0        
	//   50   94:istore          8
					k1 = i;
	//   51   96:iload           4
	//   52   98:istore          9
					break;
	//   53  100:goto            321
				}
				j1 = i;
	//   54  103:iload           4
	//   55  105:istore          8
				i2 = 0;
	//   56  107:iconst_0        
	//   57  108:istore          11
				k1 = i - 3;
	//   58  110:iload           4
	//   59  112:iconst_3        
	//   60  113:isub            
	//   61  114:istore          9
			}
			if(_outputTail > l2)
	//*  62  116:aload_0         
	//*  63  117:getfield        #60  <Field int _outputTail>
	//*  64  120:iload           14
	//*  65  122:icmple          129
				_flushBuffer();
	//   66  125:aload_0         
	//   67  126:invokevirtual   #63  <Method void _flushBuffer()>
			l = i2 + 1;
	//   68  129:iload           11
	//   69  131:iconst_1        
	//   70  132:iadd            
	//   71  133:istore          7
			i = ((int) (abyte0[i2]));
	//   72  135:aload_3         
	//   73  136:iload           11
	//   74  138:baload          
	//   75  139:istore          4
			l1 = l + 1;
	//   76  141:iload           7
	//   77  143:iconst_1        
	//   78  144:iadd            
	//   79  145:istore          10
			l = ((int) (abyte0[l]));
	//   80  147:aload_3         
	//   81  148:iload           7
	//   82  150:baload          
	//   83  151:istore          7
			i2 = l1 + 1;
	//   84  153:iload           10
	//   85  155:iconst_1        
	//   86  156:iadd            
	//   87  157:istore          11
			l1 = ((int) (abyte0[l1]));
	//   88  159:aload_3         
	//   89  160:iload           10
	//   90  162:baload          
	//   91  163:istore          10
			int j2 = j - 3;
	//   92  165:iload           5
	//   93  167:iconst_3        
	//   94  168:isub            
	//   95  169:istore          12
			_outputTail = base64variant.encodeBase64Chunk((l & 0xff | i << 8) << 8 | l1 & 0xff, _outputBuffer, _outputTail);
	//   96  171:aload_0         
	//   97  172:aload_1         
	//   98  173:iload           7
	//   99  175:sipush          255
	//  100  178:iand            
	//  101  179:iload           4
	//  102  181:bipush          8
	//  103  183:ishl            
	//  104  184:ior             
	//  105  185:bipush          8
	//  106  187:ishl            
	//  107  188:iload           10
	//  108  190:sipush          255
	//  109  193:iand            
	//  110  194:ior             
	//  111  195:aload_0         
	//  112  196:getfield        #47  <Field char[] _outputBuffer>
	//  113  199:aload_0         
	//  114  200:getfield        #60  <Field int _outputTail>
	//  115  203:invokevirtual   #240 <Method int Base64Variant.encodeBase64Chunk(int, char[], int)>
	//  116  206:putfield        #60  <Field int _outputTail>
			int k2 = k - 1;
	//  117  209:iload           6
	//  118  211:iconst_1        
	//  119  212:isub            
	//  120  213:istore          13
			k = k2;
	//  121  215:iload           13
	//  122  217:istore          6
			l1 = k1;
	//  123  219:iload           9
	//  124  221:istore          10
			i = i2;
	//  125  223:iload           11
	//  126  225:istore          4
			l = j1;
	//  127  227:iload           8
	//  128  229:istore          7
			j = j2;
	//  129  231:iload           12
	//  130  233:istore          5
			if(k2 <= 0)
	//* 131  235:iload           13
	//* 132  237:ifgt            40
			{
				char ac[] = _outputBuffer;
	//  133  240:aload_0         
	//  134  241:getfield        #47  <Field char[] _outputBuffer>
	//  135  244:astore          15
				i = _outputTail;
	//  136  246:aload_0         
	//  137  247:getfield        #60  <Field int _outputTail>
	//  138  250:istore          4
				_outputTail = i + 1;
	//  139  252:aload_0         
	//  140  253:iload           4
	//  141  255:iconst_1        
	//  142  256:iadd            
	//  143  257:putfield        #60  <Field int _outputTail>
				ac[i] = '\\';
	//  144  260:aload           15
	//  145  262:iload           4
	//  146  264:bipush          92
	//  147  266:castore         
				ac = _outputBuffer;
	//  148  267:aload_0         
	//  149  268:getfield        #47  <Field char[] _outputBuffer>
	//  150  271:astore          15
				i = _outputTail;
	//  151  273:aload_0         
	//  152  274:getfield        #60  <Field int _outputTail>
	//  153  277:istore          4
				_outputTail = i + 1;
	//  154  279:aload_0         
	//  155  280:iload           4
	//  156  282:iconst_1        
	//  157  283:iadd            
	//  158  284:putfield        #60  <Field int _outputTail>
				ac[i] = 'n';
	//  159  287:aload           15
	//  160  289:iload           4
	//  161  291:bipush          110
	//  162  293:castore         
				k = base64variant.getMaxLineLength() >> 2;
	//  163  294:aload_1         
	//  164  295:invokevirtual   #231 <Method int Base64Variant.getMaxLineLength()>
	//  165  298:iconst_2        
	//  166  299:ishr            
	//  167  300:istore          6
				l1 = k1;
	//  168  302:iload           9
	//  169  304:istore          10
				i = i2;
	//  170  306:iload           11
	//  171  308:istore          4
				l = j1;
	//  172  310:iload           8
	//  173  312:istore          7
				j = j2;
	//  174  314:iload           12
	//  175  316:istore          5
			}
		} while(true);
	//  176  318:goto            40
		i = j;
	//  177  321:iload           5
	//  178  323:istore          4
		if(j > 0)
	//* 179  325:iload           5
	//* 180  327:ifle            432
		{
			j1 = _readMore(inputstream, abyte0, j1, k1, j);
	//  181  330:aload_0         
	//  182  331:aload_2         
	//  183  332:aload_3         
	//  184  333:iload           8
	//  185  335:iload           9
	//  186  337:iload           5
	//  187  339:invokespecial   #233 <Method int _readMore(InputStream, byte[], int, int, int)>
	//  188  342:istore          8
			i = j;
	//  189  344:iload           5
	//  190  346:istore          4
			if(j1 > 0)
	//* 191  348:iload           8
	//* 192  350:ifle            432
			{
				if(_outputTail > l2)
	//* 193  353:aload_0         
	//* 194  354:getfield        #60  <Field int _outputTail>
	//* 195  357:iload           14
	//* 196  359:icmple          366
					_flushBuffer();
	//  197  362:aload_0         
	//  198  363:invokevirtual   #63  <Method void _flushBuffer()>
				int i1 = abyte0[0] << 16;
	//  199  366:aload_3         
	//  200  367:iconst_0        
	//  201  368:baload          
	//  202  369:bipush          16
	//  203  371:ishl            
	//  204  372:istore          7
				byte byte0 = 1;
	//  205  374:iconst_1        
	//  206  375:istore          6
				i = i1;
	//  207  377:iload           7
	//  208  379:istore          4
				if(1 < j1)
	//* 209  381:iconst_1        
	//* 210  382:iload           8
	//* 211  384:icmpge          405
				{
					i = i1 | (abyte0[1] & 0xff) << 8;
	//  212  387:iload           7
	//  213  389:aload_3         
	//  214  390:iconst_1        
	//  215  391:baload          
	//  216  392:sipush          255
	//  217  395:iand            
	//  218  396:bipush          8
	//  219  398:ishl            
	//  220  399:ior             
	//  221  400:istore          4
					byte0 = 2;
	//  222  402:iconst_2        
	//  223  403:istore          6
				}
				_outputTail = base64variant.encodeBase64Partial(i, ((int) (byte0)), _outputBuffer, _outputTail);
	//  224  405:aload_0         
	//  225  406:aload_1         
	//  226  407:iload           4
	//  227  409:iload           6
	//  228  411:aload_0         
	//  229  412:getfield        #47  <Field char[] _outputBuffer>
	//  230  415:aload_0         
	//  231  416:getfield        #60  <Field int _outputTail>
	//  232  419:invokevirtual   #237 <Method int Base64Variant.encodeBase64Partial(int, int, char[], int)>
	//  233  422:putfield        #60  <Field int _outputTail>
				i = j - byte0;
	//  234  425:iload           5
	//  235  427:iload           6
	//  236  429:isub            
	//  237  430:istore          4
			}
		}
		return i;
	//  238  432:iload           4
	//  239  434:ireturn         
	}

	protected void _writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
		throws IOException, JsonGenerationException
	{
		int k1 = _outputEnd - 6;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int _outputEnd>
	//    2    4:bipush          6
	//    3    6:isub            
	//    4    7:istore          7
		int k = base64variant.getMaxLineLength() >> 2;
	//    5    9:aload_1         
	//    6   10:invokevirtual   #231 <Method int Base64Variant.getMaxLineLength()>
	//    7   13:iconst_2        
	//    8   14:ishr            
	//    9   15:istore          5
		int i1;
		for(; i <= j - 3; i = i1)
	//*  10   17:iload_3         
	//*  11   18:iload           4
	//*  12   20:iconst_3        
	//*  13   21:isub            
	//*  14   22:icmpgt          178
		{
			if(_outputTail > k1)
	//*  15   25:aload_0         
	//*  16   26:getfield        #60  <Field int _outputTail>
	//*  17   29:iload           7
	//*  18   31:icmple          38
				_flushBuffer();
	//   19   34:aload_0         
	//   20   35:invokevirtual   #63  <Method void _flushBuffer()>
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
	//   53   81:getfield        #47  <Field char[] _outputBuffer>
	//   54   84:aload_0         
	//   55   85:getfield        #60  <Field int _outputTail>
	//   56   88:invokevirtual   #240 <Method int Base64Variant.encodeBase64Chunk(int, char[], int)>
	//   57   91:putfield        #60  <Field int _outputTail>
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
	//*  65  105:ifgt            163
			{
				char ac[] = _outputBuffer;
	//   66  108:aload_0         
	//   67  109:getfield        #47  <Field char[] _outputBuffer>
	//   68  112:astore          9
				i = _outputTail;
	//   69  114:aload_0         
	//   70  115:getfield        #60  <Field int _outputTail>
	//   71  118:istore_3        
				_outputTail = i + 1;
	//   72  119:aload_0         
	//   73  120:iload_3         
	//   74  121:iconst_1        
	//   75  122:iadd            
	//   76  123:putfield        #60  <Field int _outputTail>
				ac[i] = '\\';
	//   77  126:aload           9
	//   78  128:iload_3         
	//   79  129:bipush          92
	//   80  131:castore         
				ac = _outputBuffer;
	//   81  132:aload_0         
	//   82  133:getfield        #47  <Field char[] _outputBuffer>
	//   83  136:astore          9
				i = _outputTail;
	//   84  138:aload_0         
	//   85  139:getfield        #60  <Field int _outputTail>
	//   86  142:istore_3        
				_outputTail = i + 1;
	//   87  143:aload_0         
	//   88  144:iload_3         
	//   89  145:iconst_1        
	//   90  146:iadd            
	//   91  147:putfield        #60  <Field int _outputTail>
				ac[i] = 'n';
	//   92  150:aload           9
	//   93  152:iload_3         
	//   94  153:bipush          110
	//   95  155:castore         
				i = base64variant.getMaxLineLength() >> 2;
	//   96  156:aload_1         
	//   97  157:invokevirtual   #231 <Method int Base64Variant.getMaxLineLength()>
	//   98  160:iconst_2        
	//   99  161:ishr            
	//  100  162:istore_3        
			}
			i1++;
	//  101  163:iload           6
	//  102  165:iconst_1        
	//  103  166:iadd            
	//  104  167:istore          6
			k = i;
	//  105  169:iload_3         
	//  106  170:istore          5
		}

	//  107  172:iload           6
	//  108  174:istore_3        
	//* 109  175:goto            17
		int j1 = j - i;
	//  110  178:iload           4
	//  111  180:iload_3         
	//  112  181:isub            
	//  113  182:istore          6
		if(j1 > 0)
	//* 114  184:iload           6
	//* 115  186:ifle            257
		{
			if(_outputTail > k1)
	//* 116  189:aload_0         
	//* 117  190:getfield        #60  <Field int _outputTail>
	//* 118  193:iload           7
	//* 119  195:icmple          202
				_flushBuffer();
	//  120  198:aload_0         
	//  121  199:invokevirtual   #63  <Method void _flushBuffer()>
			int l = abyte0[i] << 16;
	//  122  202:aload_2         
	//  123  203:iload_3         
	//  124  204:baload          
	//  125  205:bipush          16
	//  126  207:ishl            
	//  127  208:istore          5
			j = l;
	//  128  210:iload           5
	//  129  212:istore          4
			if(j1 == 2)
	//* 130  214:iload           6
	//* 131  216:iconst_2        
	//* 132  217:icmpne          237
				j = l | (abyte0[i + 1] & 0xff) << 8;
	//  133  220:iload           5
	//  134  222:aload_2         
	//  135  223:iload_3         
	//  136  224:iconst_1        
	//  137  225:iadd            
	//  138  226:baload          
	//  139  227:sipush          255
	//  140  230:iand            
	//  141  231:bipush          8
	//  142  233:ishl            
	//  143  234:ior             
	//  144  235:istore          4
			_outputTail = base64variant.encodeBase64Partial(j, j1, _outputBuffer, _outputTail);
	//  145  237:aload_0         
	//  146  238:aload_1         
	//  147  239:iload           4
	//  148  241:iload           6
	//  149  243:aload_0         
	//  150  244:getfield        #47  <Field char[] _outputBuffer>
	//  151  247:aload_0         
	//  152  248:getfield        #60  <Field int _outputTail>
	//  153  251:invokevirtual   #237 <Method int Base64Variant.encodeBase64Partial(int, int, char[], int)>
	//  154  254:putfield        #60  <Field int _outputTail>
		}
	//  155  257:return          
	}

	protected void _writeFieldName(SerializableString serializablestring, boolean flag)
		throws IOException
	{
		if(_cfgPrettyPrinter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #214 <Field PrettyPrinter _cfgPrettyPrinter>
	//*   2    4:ifnull          14
		{
			_writePPFieldName(serializablestring, flag);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #247 <Method void _writePPFieldName(SerializableString, boolean)>
			return;
	//    7   13:return          
		}
		if(_outputTail + 1 >= _outputEnd)
	//*   8   14:aload_0         
	//*   9   15:getfield        #60  <Field int _outputTail>
	//*  10   18:iconst_1        
	//*  11   19:iadd            
	//*  12   20:aload_0         
	//*  13   21:getfield        #49  <Field int _outputEnd>
	//*  14   24:icmplt          31
			_flushBuffer();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #63  <Method void _flushBuffer()>
		if(flag)
	//*  17   31:iload_2         
	//*  18   32:ifeq            59
		{
			char ac[] = _outputBuffer;
	//   19   35:aload_0         
	//   20   36:getfield        #47  <Field char[] _outputBuffer>
	//   21   39:astore          4
			int i = _outputTail;
	//   22   41:aload_0         
	//   23   42:getfield        #60  <Field int _outputTail>
	//   24   45:istore_3        
			_outputTail = i + 1;
	//   25   46:aload_0         
	//   26   47:iload_3         
	//   27   48:iconst_1        
	//   28   49:iadd            
	//   29   50:putfield        #60  <Field int _outputTail>
			ac[i] = ',';
	//   30   53:aload           4
	//   31   55:iload_3         
	//   32   56:bipush          44
	//   33   58:castore         
		}
		serializablestring = ((SerializableString) (serializablestring.asQuotedChars()));
	//   34   59:aload_1         
	//   35   60:invokeinterface #250 <Method char[] SerializableString.asQuotedChars()>
	//   36   65:astore_1        
		if(_cfgUnqNames)
	//*  37   66:aload_0         
	//*  38   67:getfield        #254 <Field boolean _cfgUnqNames>
	//*  39   70:ifeq            82
		{
			writeRaw(((char []) (serializablestring)), 0, serializablestring.length);
	//   40   73:aload_0         
	//   41   74:aload_1         
	//   42   75:iconst_0        
	//   43   76:aload_1         
	//   44   77:arraylength     
	//   45   78:invokevirtual   #256 <Method void writeRaw(char[], int, int)>
			return;
	//   46   81:return          
		}
		char ac1[] = _outputBuffer;
	//   47   82:aload_0         
	//   48   83:getfield        #47  <Field char[] _outputBuffer>
	//   49   86:astore          4
		int j = _outputTail;
	//   50   88:aload_0         
	//   51   89:getfield        #60  <Field int _outputTail>
	//   52   92:istore_3        
		_outputTail = j + 1;
	//   53   93:aload_0         
	//   54   94:iload_3         
	//   55   95:iconst_1        
	//   56   96:iadd            
	//   57   97:putfield        #60  <Field int _outputTail>
		ac1[j] = _quoteChar;
	//   58  100:aload           4
	//   59  102:iload_3         
	//   60  103:aload_0         
	//   61  104:getfield        #38  <Field char _quoteChar>
	//   62  107:castore         
		j = serializablestring.length;
	//   63  108:aload_1         
	//   64  109:arraylength     
	//   65  110:istore_3        
		if(_outputTail + j + 1 >= _outputEnd)
	//*  66  111:aload_0         
	//*  67  112:getfield        #60  <Field int _outputTail>
	//*  68  115:iload_3         
	//*  69  116:iadd            
	//*  70  117:iconst_1        
	//*  71  118:iadd            
	//*  72  119:aload_0         
	//*  73  120:getfield        #49  <Field int _outputEnd>
	//*  74  123:icmplt          173
		{
			writeRaw(((char []) (serializablestring)), 0, j);
	//   75  126:aload_0         
	//   76  127:aload_1         
	//   77  128:iconst_0        
	//   78  129:iload_3         
	//   79  130:invokevirtual   #256 <Method void writeRaw(char[], int, int)>
			if(_outputTail >= _outputEnd)
	//*  80  133:aload_0         
	//*  81  134:getfield        #60  <Field int _outputTail>
	//*  82  137:aload_0         
	//*  83  138:getfield        #49  <Field int _outputEnd>
	//*  84  141:icmplt          148
				_flushBuffer();
	//   85  144:aload_0         
	//   86  145:invokevirtual   #63  <Method void _flushBuffer()>
			serializablestring = ((SerializableString) (_outputBuffer));
	//   87  148:aload_0         
	//   88  149:getfield        #47  <Field char[] _outputBuffer>
	//   89  152:astore_1        
			j = _outputTail;
	//   90  153:aload_0         
	//   91  154:getfield        #60  <Field int _outputTail>
	//   92  157:istore_3        
			_outputTail = j + 1;
	//   93  158:aload_0         
	//   94  159:iload_3         
	//   95  160:iconst_1        
	//   96  161:iadd            
	//   97  162:putfield        #60  <Field int _outputTail>
			serializablestring[j] = _quoteChar;
	//   98  165:aload_1         
	//   99  166:iload_3         
	//  100  167:aload_0         
	//  101  168:getfield        #38  <Field char _quoteChar>
	//  102  171:castore         
			return;
	//  103  172:return          
		} else
		{
			System.arraycopy(((Object) (serializablestring)), 0, ((Object) (_outputBuffer)), _outputTail, j);
	//  104  173:aload_1         
	//  105  174:iconst_0        
	//  106  175:aload_0         
	//  107  176:getfield        #47  <Field char[] _outputBuffer>
	//  108  179:aload_0         
	//  109  180:getfield        #60  <Field int _outputTail>
	//  110  183:iload_3         
	//  111  184:invokestatic    #186 <Method void System.arraycopy(Object, int, Object, int, int)>
			_outputTail = _outputTail + j;
	//  112  187:aload_0         
	//  113  188:aload_0         
	//  114  189:getfield        #60  <Field int _outputTail>
	//  115  192:iload_3         
	//  116  193:iadd            
	//  117  194:putfield        #60  <Field int _outputTail>
			serializablestring = ((SerializableString) (_outputBuffer));
	//  118  197:aload_0         
	//  119  198:getfield        #47  <Field char[] _outputBuffer>
	//  120  201:astore_1        
			j = _outputTail;
	//  121  202:aload_0         
	//  122  203:getfield        #60  <Field int _outputTail>
	//  123  206:istore_3        
			_outputTail = j + 1;
	//  124  207:aload_0         
	//  125  208:iload_3         
	//  126  209:iconst_1        
	//  127  210:iadd            
	//  128  211:putfield        #60  <Field int _outputTail>
			serializablestring[j] = _quoteChar;
	//  129  214:aload_1         
	//  130  215:iload_3         
	//  131  216:aload_0         
	//  132  217:getfield        #38  <Field char _quoteChar>
	//  133  220:castore         
			return;
	//  134  221:return          
		}
	}

	protected void _writeFieldName(String s, boolean flag)
		throws IOException
	{
		if(_cfgPrettyPrinter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #214 <Field PrettyPrinter _cfgPrettyPrinter>
	//*   2    4:ifnull          14
		{
			_writePPFieldName(s, flag);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #259 <Method void _writePPFieldName(String, boolean)>
			return;
	//    7   13:return          
		}
		if(_outputTail + 1 >= _outputEnd)
	//*   8   14:aload_0         
	//*   9   15:getfield        #60  <Field int _outputTail>
	//*  10   18:iconst_1        
	//*  11   19:iadd            
	//*  12   20:aload_0         
	//*  13   21:getfield        #49  <Field int _outputEnd>
	//*  14   24:icmplt          31
			_flushBuffer();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #63  <Method void _flushBuffer()>
		if(flag)
	//*  17   31:iload_2         
	//*  18   32:ifeq            59
		{
			char ac[] = _outputBuffer;
	//   19   35:aload_0         
	//   20   36:getfield        #47  <Field char[] _outputBuffer>
	//   21   39:astore          4
			int i = _outputTail;
	//   22   41:aload_0         
	//   23   42:getfield        #60  <Field int _outputTail>
	//   24   45:istore_3        
			_outputTail = i + 1;
	//   25   46:aload_0         
	//   26   47:iload_3         
	//   27   48:iconst_1        
	//   28   49:iadd            
	//   29   50:putfield        #60  <Field int _outputTail>
			ac[i] = ',';
	//   30   53:aload           4
	//   31   55:iload_3         
	//   32   56:bipush          44
	//   33   58:castore         
		}
		if(_cfgUnqNames)
	//*  34   59:aload_0         
	//*  35   60:getfield        #254 <Field boolean _cfgUnqNames>
	//*  36   63:ifeq            72
		{
			_writeString(s);
	//   37   66:aload_0         
	//   38   67:aload_1         
	//   39   68:invokespecial   #261 <Method void _writeString(String)>
			return;
	//   40   71:return          
		}
		char ac1[] = _outputBuffer;
	//   41   72:aload_0         
	//   42   73:getfield        #47  <Field char[] _outputBuffer>
	//   43   76:astore          4
		int j = _outputTail;
	//   44   78:aload_0         
	//   45   79:getfield        #60  <Field int _outputTail>
	//   46   82:istore_3        
		_outputTail = j + 1;
	//   47   83:aload_0         
	//   48   84:iload_3         
	//   49   85:iconst_1        
	//   50   86:iadd            
	//   51   87:putfield        #60  <Field int _outputTail>
		ac1[j] = _quoteChar;
	//   52   90:aload           4
	//   53   92:iload_3         
	//   54   93:aload_0         
	//   55   94:getfield        #38  <Field char _quoteChar>
	//   56   97:castore         
		_writeString(s);
	//   57   98:aload_0         
	//   58   99:aload_1         
	//   59  100:invokespecial   #261 <Method void _writeString(String)>
		if(_outputTail >= _outputEnd)
	//*  60  103:aload_0         
	//*  61  104:getfield        #60  <Field int _outputTail>
	//*  62  107:aload_0         
	//*  63  108:getfield        #49  <Field int _outputEnd>
	//*  64  111:icmplt          118
			_flushBuffer();
	//   65  114:aload_0         
	//   66  115:invokevirtual   #63  <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//   67  118:aload_0         
	//   68  119:getfield        #47  <Field char[] _outputBuffer>
	//   69  122:astore_1        
		j = _outputTail;
	//   70  123:aload_0         
	//   71  124:getfield        #60  <Field int _outputTail>
	//   72  127:istore_3        
		_outputTail = j + 1;
	//   73  128:aload_0         
	//   74  129:iload_3         
	//   75  130:iconst_1        
	//   76  131:iadd            
	//   77  132:putfield        #60  <Field int _outputTail>
		s[j] = _quoteChar;
	//   78  135:aload_1         
	//   79  136:iload_3         
	//   80  137:aload_0         
	//   81  138:getfield        #38  <Field char _quoteChar>
	//   82  141:castore         
	//   83  142:return          
	}

	protected void _writePPFieldName(SerializableString serializablestring, boolean flag)
		throws IOException
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            17
			_cfgPrettyPrinter.writeObjectEntrySeparator(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//    2    4:aload_0         
	//    3    5:getfield        #214 <Field PrettyPrinter _cfgPrettyPrinter>
	//    4    8:aload_0         
	//    5    9:invokeinterface #267 <Method void PrettyPrinter.writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)>
		else
	//*   6   14:goto            27
			_cfgPrettyPrinter.beforeObjectEntries(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//    7   17:aload_0         
	//    8   18:getfield        #214 <Field PrettyPrinter _cfgPrettyPrinter>
	//    9   21:aload_0         
	//   10   22:invokeinterface #270 <Method void PrettyPrinter.beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)>
		serializablestring = ((SerializableString) (serializablestring.asQuotedChars()));
	//   11   27:aload_1         
	//   12   28:invokeinterface #250 <Method char[] SerializableString.asQuotedChars()>
	//   13   33:astore_1        
		if(_cfgUnqNames)
	//*  14   34:aload_0         
	//*  15   35:getfield        #254 <Field boolean _cfgUnqNames>
	//*  16   38:ifeq            50
		{
			writeRaw(((char []) (serializablestring)), 0, serializablestring.length);
	//   17   41:aload_0         
	//   18   42:aload_1         
	//   19   43:iconst_0        
	//   20   44:aload_1         
	//   21   45:arraylength     
	//   22   46:invokevirtual   #256 <Method void writeRaw(char[], int, int)>
			return;
	//   23   49:return          
		}
		if(_outputTail >= _outputEnd)
	//*  24   50:aload_0         
	//*  25   51:getfield        #60  <Field int _outputTail>
	//*  26   54:aload_0         
	//*  27   55:getfield        #49  <Field int _outputEnd>
	//*  28   58:icmplt          65
			_flushBuffer();
	//   29   61:aload_0         
	//   30   62:invokevirtual   #63  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//   31   65:aload_0         
	//   32   66:getfield        #47  <Field char[] _outputBuffer>
	//   33   69:astore          4
		int i = _outputTail;
	//   34   71:aload_0         
	//   35   72:getfield        #60  <Field int _outputTail>
	//   36   75:istore_3        
		_outputTail = i + 1;
	//   37   76:aload_0         
	//   38   77:iload_3         
	//   39   78:iconst_1        
	//   40   79:iadd            
	//   41   80:putfield        #60  <Field int _outputTail>
		ac[i] = _quoteChar;
	//   42   83:aload           4
	//   43   85:iload_3         
	//   44   86:aload_0         
	//   45   87:getfield        #38  <Field char _quoteChar>
	//   46   90:castore         
		writeRaw(((char []) (serializablestring)), 0, serializablestring.length);
	//   47   91:aload_0         
	//   48   92:aload_1         
	//   49   93:iconst_0        
	//   50   94:aload_1         
	//   51   95:arraylength     
	//   52   96:invokevirtual   #256 <Method void writeRaw(char[], int, int)>
		if(_outputTail >= _outputEnd)
	//*  53   99:aload_0         
	//*  54  100:getfield        #60  <Field int _outputTail>
	//*  55  103:aload_0         
	//*  56  104:getfield        #49  <Field int _outputEnd>
	//*  57  107:icmplt          114
			_flushBuffer();
	//   58  110:aload_0         
	//   59  111:invokevirtual   #63  <Method void _flushBuffer()>
		serializablestring = ((SerializableString) (_outputBuffer));
	//   60  114:aload_0         
	//   61  115:getfield        #47  <Field char[] _outputBuffer>
	//   62  118:astore_1        
		i = _outputTail;
	//   63  119:aload_0         
	//   64  120:getfield        #60  <Field int _outputTail>
	//   65  123:istore_3        
		_outputTail = i + 1;
	//   66  124:aload_0         
	//   67  125:iload_3         
	//   68  126:iconst_1        
	//   69  127:iadd            
	//   70  128:putfield        #60  <Field int _outputTail>
		serializablestring[i] = _quoteChar;
	//   71  131:aload_1         
	//   72  132:iload_3         
	//   73  133:aload_0         
	//   74  134:getfield        #38  <Field char _quoteChar>
	//   75  137:castore         
	//   76  138:return          
	}

	protected void _writePPFieldName(String s, boolean flag)
		throws IOException
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            17
			_cfgPrettyPrinter.writeObjectEntrySeparator(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//    2    4:aload_0         
	//    3    5:getfield        #214 <Field PrettyPrinter _cfgPrettyPrinter>
	//    4    8:aload_0         
	//    5    9:invokeinterface #267 <Method void PrettyPrinter.writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)>
		else
	//*   6   14:goto            27
			_cfgPrettyPrinter.beforeObjectEntries(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//    7   17:aload_0         
	//    8   18:getfield        #214 <Field PrettyPrinter _cfgPrettyPrinter>
	//    9   21:aload_0         
	//   10   22:invokeinterface #270 <Method void PrettyPrinter.beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)>
		if(_cfgUnqNames)
	//*  11   27:aload_0         
	//*  12   28:getfield        #254 <Field boolean _cfgUnqNames>
	//*  13   31:ifeq            40
		{
			_writeString(s);
	//   14   34:aload_0         
	//   15   35:aload_1         
	//   16   36:invokespecial   #261 <Method void _writeString(String)>
			return;
	//   17   39:return          
		}
		if(_outputTail >= _outputEnd)
	//*  18   40:aload_0         
	//*  19   41:getfield        #60  <Field int _outputTail>
	//*  20   44:aload_0         
	//*  21   45:getfield        #49  <Field int _outputEnd>
	//*  22   48:icmplt          55
			_flushBuffer();
	//   23   51:aload_0         
	//   24   52:invokevirtual   #63  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//   25   55:aload_0         
	//   26   56:getfield        #47  <Field char[] _outputBuffer>
	//   27   59:astore          4
		int i = _outputTail;
	//   28   61:aload_0         
	//   29   62:getfield        #60  <Field int _outputTail>
	//   30   65:istore_3        
		_outputTail = i + 1;
	//   31   66:aload_0         
	//   32   67:iload_3         
	//   33   68:iconst_1        
	//   34   69:iadd            
	//   35   70:putfield        #60  <Field int _outputTail>
		ac[i] = _quoteChar;
	//   36   73:aload           4
	//   37   75:iload_3         
	//   38   76:aload_0         
	//   39   77:getfield        #38  <Field char _quoteChar>
	//   40   80:castore         
		_writeString(s);
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:invokespecial   #261 <Method void _writeString(String)>
		if(_outputTail >= _outputEnd)
	//*  44   86:aload_0         
	//*  45   87:getfield        #60  <Field int _outputTail>
	//*  46   90:aload_0         
	//*  47   91:getfield        #49  <Field int _outputEnd>
	//*  48   94:icmplt          101
			_flushBuffer();
	//   49   97:aload_0         
	//   50   98:invokevirtual   #63  <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//   51  101:aload_0         
	//   52  102:getfield        #47  <Field char[] _outputBuffer>
	//   53  105:astore_1        
		i = _outputTail;
	//   54  106:aload_0         
	//   55  107:getfield        #60  <Field int _outputTail>
	//   56  110:istore_3        
		_outputTail = i + 1;
	//   57  111:aload_0         
	//   58  112:iload_3         
	//   59  113:iconst_1        
	//   60  114:iadd            
	//   61  115:putfield        #60  <Field int _outputTail>
		s[i] = _quoteChar;
	//   62  118:aload_1         
	//   63  119:iload_3         
	//   64  120:aload_0         
	//   65  121:getfield        #38  <Field char _quoteChar>
	//   66  124:castore         
	//   67  125:return          
	}

	public boolean canWriteFormattedNumbers()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void close()
		throws IOException
	{
		super.close();
	//    0    0:aload_0         
	//    1    1:invokespecial   #275 <Method void JsonGeneratorImpl.close()>
		if(_outputBuffer != null && isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT))
	//*   2    4:aload_0         
	//*   3    5:getfield        #47  <Field char[] _outputBuffer>
	//*   4    8:ifnull          54
	//*   5   11:aload_0         
	//*   6   12:getstatic       #281 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_JSON_CONTENT>
	//*   7   15:invokevirtual   #285 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*   8   18:ifeq            54
			do
			{
				JsonStreamContext jsonstreamcontext = getOutputContext();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #289 <Method JsonStreamContext getOutputContext()>
	//   11   25:astore_1        
				if(jsonstreamcontext.inArray())
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #294 <Method boolean JsonStreamContext.inArray()>
	//*  14   30:ifeq            40
				{
					writeEndArray();
	//   15   33:aload_0         
	//   16   34:invokevirtual   #297 <Method void writeEndArray()>
					continue;
	//   17   37:goto            21
				}
				if(!jsonstreamcontext.inObject())
					break;
	//   18   40:aload_1         
	//   19   41:invokevirtual   #300 <Method boolean JsonStreamContext.inObject()>
	//   20   44:ifeq            54
				writeEndObject();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #303 <Method void writeEndObject()>
			} while(true);
	//   23   51:goto            21
		_flushBuffer();
	//   24   54:aload_0         
	//   25   55:invokevirtual   #63  <Method void _flushBuffer()>
		_outputHead = 0;
	//   26   58:aload_0         
	//   27   59:iconst_0        
	//   28   60:putfield        #107 <Field int _outputHead>
		_outputTail = 0;
	//   29   63:aload_0         
	//   30   64:iconst_0        
	//   31   65:putfield        #60  <Field int _outputTail>
		if(_writer != null)
	//*  32   68:aload_0         
	//*  33   69:getfield        #40  <Field Writer _writer>
	//*  34   72:ifnull          125
			if(!_ioContext.isResourceManaged() && !isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET))
	//*  35   75:aload_0         
	//*  36   76:getfield        #196 <Field IOContext _ioContext>
	//*  37   79:invokevirtual   #306 <Method boolean IOContext.isResourceManaged()>
	//*  38   82:ifne            118
	//*  39   85:aload_0         
	//*  40   86:getstatic       #309 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_TARGET>
	//*  41   89:invokevirtual   #285 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*  42   92:ifeq            98
	//*  43   95:goto            118
			{
				if(isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM))
	//*  44   98:aload_0         
	//*  45   99:getstatic       #312 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.FLUSH_PASSED_TO_STREAM>
	//*  46  102:invokevirtual   #285 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*  47  105:ifeq            125
					_writer.flush();
	//   48  108:aload_0         
	//   49  109:getfield        #40  <Field Writer _writer>
	//   50  112:invokevirtual   #315 <Method void Writer.flush()>
			} else
	//*  51  115:goto            125
			{
				_writer.close();
	//   52  118:aload_0         
	//   53  119:getfield        #40  <Field Writer _writer>
	//   54  122:invokevirtual   #316 <Method void Writer.close()>
			}
		_releaseBuffers();
	//   55  125:aload_0         
	//   56  126:invokevirtual   #318 <Method void _releaseBuffers()>
	//   57  129:return          
	}

	public void flush()
		throws IOException
	{
		_flushBuffer();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #63  <Method void _flushBuffer()>
		if(_writer != null && isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM))
	//*   2    4:aload_0         
	//*   3    5:getfield        #40  <Field Writer _writer>
	//*   4    8:ifnull          28
	//*   5   11:aload_0         
	//*   6   12:getstatic       #312 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.FLUSH_PASSED_TO_STREAM>
	//*   7   15:invokevirtual   #285 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*   8   18:ifeq            28
			_writer.flush();
	//    9   21:aload_0         
	//   10   22:getfield        #40  <Field Writer _writer>
	//   11   25:invokevirtual   #315 <Method void Writer.flush()>
	//   12   28:return          
	}

	public int getOutputBuffered()
	{
		return Math.max(0, _outputTail - _outputHead);
	//    0    0:iconst_0        
	//    1    1:aload_0         
	//    2    2:getfield        #60  <Field int _outputTail>
	//    3    5:aload_0         
	//    4    6:getfield        #107 <Field int _outputHead>
	//    5    9:isub            
	//    6   10:invokestatic    #322 <Method int Math.max(int, int)>
	//    7   13:ireturn         
	}

	public Object getOutputTarget()
	{
		return ((Object) (_writer));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Writer _writer>
	//    2    4:areturn         
	}

	public int writeBinary(Base64Variant base64variant, InputStream inputstream, int i)
		throws IOException, JsonGenerationException
	{
		char ac[];
		_verifyValueWrite("write a binary value");
	//    0    0:aload_0         
	//    1    1:ldc2            #328 <String "write a binary value">
	//    2    4:invokevirtual   #330 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #60  <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #49  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #63  <Method void _flushBuffer()>
		ac = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #47  <Field char[] _outputBuffer>
	//   12   26:astore          6
		int j = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #60  <Field int _outputTail>
	//   15   32:istore          4
		_outputTail = j + 1;
	//   16   34:aload_0         
	//   17   35:iload           4
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #60  <Field int _outputTail>
		ac[j] = _quoteChar;
	//   21   42:aload           6
	//   22   44:iload           4
	//   23   46:aload_0         
	//   24   47:getfield        #38  <Field char _quoteChar>
	//   25   50:castore         
		ac = ((char []) (_ioContext.allocBase64Buffer()));
	//   26   51:aload_0         
	//   27   52:getfield        #196 <Field IOContext _ioContext>
	//   28   55:invokevirtual   #334 <Method byte[] IOContext.allocBase64Buffer()>
	//   29   58:astore          6
		if(i >= 0)
			break MISSING_BLOCK_LABEL_77;
	//   30   60:iload_3         
	//   31   61:ifge            77
		int k;
		k = _writeBinary(base64variant, inputstream, ((byte []) (ac)));
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:aload_2         
	//   35   67:aload           6
	//   36   69:invokevirtual   #336 <Method int _writeBinary(Base64Variant, InputStream, byte[])>
	//   37   72:istore          4
		break MISSING_BLOCK_LABEL_152;
	//   38   74:goto            152
		int l = _writeBinary(base64variant, inputstream, ((byte []) (ac)), i);
	//   39   77:aload_0         
	//   40   78:aload_1         
	//   41   79:aload_2         
	//   42   80:aload           6
	//   43   82:iload_3         
	//   44   83:invokevirtual   #338 <Method int _writeBinary(Base64Variant, InputStream, byte[], int)>
	//   45   86:istore          5
		k = i;
	//   46   88:iload_3         
	//   47   89:istore          4
		if(l <= 0)
			break MISSING_BLOCK_LABEL_152;
	//   48   91:iload           5
	//   49   93:ifle            152
		base64variant = ((Base64Variant) (new StringBuilder()));
	//   50   96:new             #340 <Class StringBuilder>
	//   51   99:dup             
	//   52  100:invokespecial   #342 <Method void StringBuilder()>
	//   53  103:astore_1        
		((StringBuilder) (base64variant)).append("Too few bytes available: missing ");
	//   54  104:aload_1         
	//   55  105:ldc2            #344 <String "Too few bytes available: missing ">
	//   56  108:invokevirtual   #348 <Method StringBuilder StringBuilder.append(String)>
	//   57  111:pop             
		((StringBuilder) (base64variant)).append(l);
	//   58  112:aload_1         
	//   59  113:iload           5
	//   60  115:invokevirtual   #351 <Method StringBuilder StringBuilder.append(int)>
	//   61  118:pop             
		((StringBuilder) (base64variant)).append(" bytes (out of ");
	//   62  119:aload_1         
	//   63  120:ldc2            #353 <String " bytes (out of ">
	//   64  123:invokevirtual   #348 <Method StringBuilder StringBuilder.append(String)>
	//   65  126:pop             
		((StringBuilder) (base64variant)).append(i);
	//   66  127:aload_1         
	//   67  128:iload_3         
	//   68  129:invokevirtual   #351 <Method StringBuilder StringBuilder.append(int)>
	//   69  132:pop             
		((StringBuilder) (base64variant)).append(")");
	//   70  133:aload_1         
	//   71  134:ldc2            #355 <String ")">
	//   72  137:invokevirtual   #348 <Method StringBuilder StringBuilder.append(String)>
	//   73  140:pop             
		_reportError(((StringBuilder) (base64variant)).toString());
	//   74  141:aload_0         
	//   75  142:aload_1         
	//   76  143:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   77  146:invokevirtual   #361 <Method void _reportError(String)>
		k = i;
	//   78  149:iload_3         
	//   79  150:istore          4
		_ioContext.releaseBase64Buffer(((byte []) (ac)));
	//   80  152:aload_0         
	//   81  153:getfield        #196 <Field IOContext _ioContext>
	//   82  156:aload           6
	//   83  158:invokevirtual   #365 <Method void IOContext.releaseBase64Buffer(byte[])>
		if(_outputTail >= _outputEnd)
	//*  84  161:aload_0         
	//*  85  162:getfield        #60  <Field int _outputTail>
	//*  86  165:aload_0         
	//*  87  166:getfield        #49  <Field int _outputEnd>
	//*  88  169:icmplt          176
			_flushBuffer();
	//   89  172:aload_0         
	//   90  173:invokevirtual   #63  <Method void _flushBuffer()>
		base64variant = ((Base64Variant) (_outputBuffer));
	//   91  176:aload_0         
	//   92  177:getfield        #47  <Field char[] _outputBuffer>
	//   93  180:astore_1        
		i = _outputTail;
	//   94  181:aload_0         
	//   95  182:getfield        #60  <Field int _outputTail>
	//   96  185:istore_3        
		_outputTail = i + 1;
	//   97  186:aload_0         
	//   98  187:iload_3         
	//   99  188:iconst_1        
	//  100  189:iadd            
	//  101  190:putfield        #60  <Field int _outputTail>
		base64variant[i] = _quoteChar;
	//  102  193:aload_1         
	//  103  194:iload_3         
	//  104  195:aload_0         
	//  105  196:getfield        #38  <Field char _quoteChar>
	//  106  199:castore         
		return k;
	//  107  200:iload           4
	//  108  202:ireturn         
_L2:
		_ioContext.releaseBase64Buffer(((byte []) (ac)));
	//  109  203:aload_0         
	//  110  204:getfield        #196 <Field IOContext _ioContext>
	//  111  207:aload           6
	//  112  209:invokevirtual   #365 <Method void IOContext.releaseBase64Buffer(byte[])>
		throw base64variant;
	//  113  212:aload_1         
	//  114  213:athrow          
		base64variant;
	//  115  214:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//* 116  215:goto            203
	}

	public void writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
		throws IOException, JsonGenerationException
	{
		_verifyValueWrite("write a binary value");
	//    0    0:aload_0         
	//    1    1:ldc2            #328 <String "write a binary value">
	//    2    4:invokevirtual   #330 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #60  <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #49  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #63  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #47  <Field char[] _outputBuffer>
	//   12   26:astore          6
		int k = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #60  <Field int _outputTail>
	//   15   32:istore          5
		_outputTail = k + 1;
	//   16   34:aload_0         
	//   17   35:iload           5
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #60  <Field int _outputTail>
		ac[k] = _quoteChar;
	//   21   42:aload           6
	//   22   44:iload           5
	//   23   46:aload_0         
	//   24   47:getfield        #38  <Field char _quoteChar>
	//   25   50:castore         
		_writeBinary(base64variant, abyte0, i, j + i);
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:aload_2         
	//   29   54:iload_3         
	//   30   55:iload           4
	//   31   57:iload_3         
	//   32   58:iadd            
	//   33   59:invokevirtual   #367 <Method void _writeBinary(Base64Variant, byte[], int, int)>
		if(_outputTail >= _outputEnd)
	//*  34   62:aload_0         
	//*  35   63:getfield        #60  <Field int _outputTail>
	//*  36   66:aload_0         
	//*  37   67:getfield        #49  <Field int _outputEnd>
	//*  38   70:icmplt          77
			_flushBuffer();
	//   39   73:aload_0         
	//   40   74:invokevirtual   #63  <Method void _flushBuffer()>
		base64variant = ((Base64Variant) (_outputBuffer));
	//   41   77:aload_0         
	//   42   78:getfield        #47  <Field char[] _outputBuffer>
	//   43   81:astore_1        
		i = _outputTail;
	//   44   82:aload_0         
	//   45   83:getfield        #60  <Field int _outputTail>
	//   46   86:istore_3        
		_outputTail = i + 1;
	//   47   87:aload_0         
	//   48   88:iload_3         
	//   49   89:iconst_1        
	//   50   90:iadd            
	//   51   91:putfield        #60  <Field int _outputTail>
		base64variant[i] = _quoteChar;
	//   52   94:aload_1         
	//   53   95:iload_3         
	//   54   96:aload_0         
	//   55   97:getfield        #38  <Field char _quoteChar>
	//   56  100:castore         
	//   57  101:return          
	}

	public void writeBoolean(boolean flag)
		throws IOException
	{
		_verifyValueWrite("write a boolean value");
	//    0    0:aload_0         
	//    1    1:ldc2            #371 <String "write a boolean value">
	//    2    4:invokevirtual   #330 <Method void _verifyValueWrite(String)>
		if(_outputTail + 5 >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #60  <Field int _outputTail>
	//*   5   11:iconst_5        
	//*   6   12:iadd            
	//*   7   13:aload_0         
	//*   8   14:getfield        #49  <Field int _outputEnd>
	//*   9   17:icmplt          24
			_flushBuffer();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #63  <Method void _flushBuffer()>
		int i = _outputTail;
	//   12   24:aload_0         
	//   13   25:getfield        #60  <Field int _outputTail>
	//   14   28:istore_2        
		char ac[] = _outputBuffer;
	//   15   29:aload_0         
	//   16   30:getfield        #47  <Field char[] _outputBuffer>
	//   17   33:astore_3        
		if(flag)
	//*  18   34:iload_1         
	//*  19   35:ifeq            73
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
	//*  48   70:goto            114
		{
			ac[i] = 'f';
	//   49   73:aload_3         
	//   50   74:iload_2         
	//   51   75:bipush          102
	//   52   77:castore         
			i++;
	//   53   78:iload_2         
	//   54   79:iconst_1        
	//   55   80:iadd            
	//   56   81:istore_2        
			ac[i] = 'a';
	//   57   82:aload_3         
	//   58   83:iload_2         
	//   59   84:bipush          97
	//   60   86:castore         
			i++;
	//   61   87:iload_2         
	//   62   88:iconst_1        
	//   63   89:iadd            
	//   64   90:istore_2        
			ac[i] = 'l';
	//   65   91:aload_3         
	//   66   92:iload_2         
	//   67   93:bipush          108
	//   68   95:castore         
			i++;
	//   69   96:iload_2         
	//   70   97:iconst_1        
	//   71   98:iadd            
	//   72   99:istore_2        
			ac[i] = 's';
	//   73  100:aload_3         
	//   74  101:iload_2         
	//   75  102:bipush          115
	//   76  104:castore         
			i++;
	//   77  105:iload_2         
	//   78  106:iconst_1        
	//   79  107:iadd            
	//   80  108:istore_2        
			ac[i] = 'e';
	//   81  109:aload_3         
	//   82  110:iload_2         
	//   83  111:bipush          101
	//   84  113:castore         
		}
		_outputTail = i + 1;
	//   85  114:aload_0         
	//   86  115:iload_2         
	//   87  116:iconst_1        
	//   88  117:iadd            
	//   89  118:putfield        #60  <Field int _outputTail>
	//   90  121:return          
	}

	public void writeEndArray()
		throws IOException
	{
		if(!_writeContext.inArray())
	//*   0    0:aload_0         
	//*   1    1:getfield        #205 <Field JsonWriteContext _writeContext>
	//*   2    4:invokevirtual   #372 <Method boolean JsonWriteContext.inArray()>
	//*   3    7:ifne            46
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4   10:new             #340 <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #342 <Method void StringBuilder()>
	//    7   17:astore_2        
			stringbuilder.append("Current context not Array but ");
	//    8   18:aload_2         
	//    9   19:ldc2            #374 <String "Current context not Array but ">
	//   10   22:invokevirtual   #348 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:pop             
			stringbuilder.append(_writeContext.typeDesc());
	//   12   26:aload_2         
	//   13   27:aload_0         
	//   14   28:getfield        #205 <Field JsonWriteContext _writeContext>
	//   15   31:invokevirtual   #377 <Method String JsonWriteContext.typeDesc()>
	//   16   34:invokevirtual   #348 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
			_reportError(stringbuilder.toString());
	//   18   38:aload_0         
	//   19   39:aload_2         
	//   20   40:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   21   43:invokevirtual   #361 <Method void _reportError(String)>
		}
		if(_cfgPrettyPrinter != null)
	//*  22   46:aload_0         
	//*  23   47:getfield        #214 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  24   50:ifnull          73
		{
			_cfgPrettyPrinter.writeEndArray(((com.fasterxml.jackson.core.JsonGenerator) (this)), _writeContext.getEntryCount());
	//   25   53:aload_0         
	//   26   54:getfield        #214 <Field PrettyPrinter _cfgPrettyPrinter>
	//   27   57:aload_0         
	//   28   58:aload_0         
	//   29   59:getfield        #205 <Field JsonWriteContext _writeContext>
	//   30   62:invokevirtual   #380 <Method int JsonWriteContext.getEntryCount()>
	//   31   65:invokeinterface #383 <Method void PrettyPrinter.writeEndArray(com.fasterxml.jackson.core.JsonGenerator, int)>
		} else
	//*  32   70:goto            110
		{
			if(_outputTail >= _outputEnd)
	//*  33   73:aload_0         
	//*  34   74:getfield        #60  <Field int _outputTail>
	//*  35   77:aload_0         
	//*  36   78:getfield        #49  <Field int _outputEnd>
	//*  37   81:icmplt          88
				_flushBuffer();
	//   38   84:aload_0         
	//   39   85:invokevirtual   #63  <Method void _flushBuffer()>
			char ac[] = _outputBuffer;
	//   40   88:aload_0         
	//   41   89:getfield        #47  <Field char[] _outputBuffer>
	//   42   92:astore_2        
			int i = _outputTail;
	//   43   93:aload_0         
	//   44   94:getfield        #60  <Field int _outputTail>
	//   45   97:istore_1        
			_outputTail = i + 1;
	//   46   98:aload_0         
	//   47   99:iload_1         
	//   48  100:iconst_1        
	//   49  101:iadd            
	//   50  102:putfield        #60  <Field int _outputTail>
			ac[i] = ']';
	//   51  105:aload_2         
	//   52  106:iload_1         
	//   53  107:bipush          93
	//   54  109:castore         
		}
		_writeContext = _writeContext.clearAndGetParent();
	//   55  110:aload_0         
	//   56  111:aload_0         
	//   57  112:getfield        #205 <Field JsonWriteContext _writeContext>
	//   58  115:invokevirtual   #387 <Method JsonWriteContext JsonWriteContext.clearAndGetParent()>
	//   59  118:putfield        #205 <Field JsonWriteContext _writeContext>
	//   60  121:return          
	}

	public void writeEndObject()
		throws IOException
	{
		if(!_writeContext.inObject())
	//*   0    0:aload_0         
	//*   1    1:getfield        #205 <Field JsonWriteContext _writeContext>
	//*   2    4:invokevirtual   #388 <Method boolean JsonWriteContext.inObject()>
	//*   3    7:ifne            46
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4   10:new             #340 <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #342 <Method void StringBuilder()>
	//    7   17:astore_2        
			stringbuilder.append("Current context not Object but ");
	//    8   18:aload_2         
	//    9   19:ldc2            #390 <String "Current context not Object but ">
	//   10   22:invokevirtual   #348 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:pop             
			stringbuilder.append(_writeContext.typeDesc());
	//   12   26:aload_2         
	//   13   27:aload_0         
	//   14   28:getfield        #205 <Field JsonWriteContext _writeContext>
	//   15   31:invokevirtual   #377 <Method String JsonWriteContext.typeDesc()>
	//   16   34:invokevirtual   #348 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
			_reportError(stringbuilder.toString());
	//   18   38:aload_0         
	//   19   39:aload_2         
	//   20   40:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   21   43:invokevirtual   #361 <Method void _reportError(String)>
		}
		if(_cfgPrettyPrinter != null)
	//*  22   46:aload_0         
	//*  23   47:getfield        #214 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  24   50:ifnull          73
		{
			_cfgPrettyPrinter.writeEndObject(((com.fasterxml.jackson.core.JsonGenerator) (this)), _writeContext.getEntryCount());
	//   25   53:aload_0         
	//   26   54:getfield        #214 <Field PrettyPrinter _cfgPrettyPrinter>
	//   27   57:aload_0         
	//   28   58:aload_0         
	//   29   59:getfield        #205 <Field JsonWriteContext _writeContext>
	//   30   62:invokevirtual   #380 <Method int JsonWriteContext.getEntryCount()>
	//   31   65:invokeinterface #392 <Method void PrettyPrinter.writeEndObject(com.fasterxml.jackson.core.JsonGenerator, int)>
		} else
	//*  32   70:goto            110
		{
			if(_outputTail >= _outputEnd)
	//*  33   73:aload_0         
	//*  34   74:getfield        #60  <Field int _outputTail>
	//*  35   77:aload_0         
	//*  36   78:getfield        #49  <Field int _outputEnd>
	//*  37   81:icmplt          88
				_flushBuffer();
	//   38   84:aload_0         
	//   39   85:invokevirtual   #63  <Method void _flushBuffer()>
			char ac[] = _outputBuffer;
	//   40   88:aload_0         
	//   41   89:getfield        #47  <Field char[] _outputBuffer>
	//   42   92:astore_2        
			int i = _outputTail;
	//   43   93:aload_0         
	//   44   94:getfield        #60  <Field int _outputTail>
	//   45   97:istore_1        
			_outputTail = i + 1;
	//   46   98:aload_0         
	//   47   99:iload_1         
	//   48  100:iconst_1        
	//   49  101:iadd            
	//   50  102:putfield        #60  <Field int _outputTail>
			ac[i] = '}';
	//   51  105:aload_2         
	//   52  106:iload_1         
	//   53  107:bipush          125
	//   54  109:castore         
		}
		_writeContext = _writeContext.clearAndGetParent();
	//   55  110:aload_0         
	//   56  111:aload_0         
	//   57  112:getfield        #205 <Field JsonWriteContext _writeContext>
	//   58  115:invokevirtual   #387 <Method JsonWriteContext JsonWriteContext.clearAndGetParent()>
	//   59  118:putfield        #205 <Field JsonWriteContext _writeContext>
	//   60  121:return          
	}

	public void writeFieldName(SerializableString serializablestring)
		throws IOException
	{
		int i = _writeContext.writeFieldName(serializablestring.getValue());
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field JsonWriteContext _writeContext>
	//    2    4:aload_1         
	//    3    5:invokeinterface #81  <Method String SerializableString.getValue()>
	//    4   10:invokevirtual   #397 <Method int JsonWriteContext.writeFieldName(String)>
	//    5   13:istore_2        
		if(i == 4)
	//*   6   14:iload_2         
	//*   7   15:iconst_4        
	//*   8   16:icmpne          26
			_reportError("Can not write a field name, expecting a value");
	//    9   19:aload_0         
	//   10   20:ldc2            #399 <String "Can not write a field name, expecting a value">
	//   11   23:invokevirtual   #361 <Method void _reportError(String)>
		boolean flag = true;
	//   12   26:iconst_1        
	//   13   27:istore_3        
		if(i != 1)
	//*  14   28:iload_2         
	//*  15   29:iconst_1        
	//*  16   30:icmpne          36
	//*  17   33:goto            38
			flag = false;
	//   18   36:iconst_0        
	//   19   37:istore_3        
		_writeFieldName(serializablestring, flag);
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:iload_3         
	//   23   41:invokevirtual   #401 <Method void _writeFieldName(SerializableString, boolean)>
	//   24   44:return          
	}

	public void writeFieldName(String s)
		throws IOException
	{
		int i = _writeContext.writeFieldName(s);
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field JsonWriteContext _writeContext>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #397 <Method int JsonWriteContext.writeFieldName(String)>
	//    4    8:istore_2        
		if(i == 4)
	//*   5    9:iload_2         
	//*   6   10:iconst_4        
	//*   7   11:icmpne          21
			_reportError("Can not write a field name, expecting a value");
	//    8   14:aload_0         
	//    9   15:ldc2            #399 <String "Can not write a field name, expecting a value">
	//   10   18:invokevirtual   #361 <Method void _reportError(String)>
		boolean flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_3        
		if(i != 1)
	//*  13   23:iload_2         
	//*  14   24:iconst_1        
	//*  15   25:icmpne          31
	//*  16   28:goto            33
			flag = false;
	//   17   31:iconst_0        
	//   18   32:istore_3        
		_writeFieldName(s, flag);
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:iload_3         
	//   22   36:invokevirtual   #403 <Method void _writeFieldName(String, boolean)>
	//   23   39:return          
	}

	public void writeNull()
		throws IOException
	{
		_verifyValueWrite("write a null");
	//    0    0:aload_0         
	//    1    1:ldc2            #406 <String "write a null">
	//    2    4:invokevirtual   #330 <Method void _verifyValueWrite(String)>
		_writeNull();
	//    3    7:aload_0         
	//    4    8:invokespecial   #408 <Method void _writeNull()>
	//    5   11:return          
	}

	public void writeNumber(double d)
		throws IOException
	{
		if(!_cfgNumbersAsStrings && (!isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS) || !Double.isNaN(d) && !Double.isInfinite(d)))
	//*   0    0:aload_0         
	//*   1    1:getfield        #413 <Field boolean _cfgNumbersAsStrings>
	//*   2    4:ifne            50
	//*   3    7:aload_0         
	//*   4    8:getstatic       #416 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.QUOTE_NON_NUMERIC_NUMBERS>
	//*   5   11:invokevirtual   #285 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*   6   14:ifeq            34
	//*   7   17:dload_1         
	//*   8   18:invokestatic    #422 <Method boolean Double.isNaN(double)>
	//*   9   21:ifne            50
	//*  10   24:dload_1         
	//*  11   25:invokestatic    #425 <Method boolean Double.isInfinite(double)>
	//*  12   28:ifeq            34
	//*  13   31:goto            50
		{
			_verifyValueWrite("write a number");
	//   14   34:aload_0         
	//   15   35:ldc2            #427 <String "write a number">
	//   16   38:invokevirtual   #330 <Method void _verifyValueWrite(String)>
			writeRaw(String.valueOf(d));
	//   17   41:aload_0         
	//   18   42:dload_1         
	//   19   43:invokestatic    #431 <Method String String.valueOf(double)>
	//   20   46:invokevirtual   #154 <Method void writeRaw(String)>
			return;
	//   21   49:return          
		} else
		{
			writeString(String.valueOf(d));
	//   22   50:aload_0         
	//   23   51:dload_1         
	//   24   52:invokestatic    #431 <Method String String.valueOf(double)>
	//   25   55:invokevirtual   #434 <Method void writeString(String)>
			return;
	//   26   58:return          
		}
	}

	public void writeNumber(float f)
		throws IOException
	{
		if(!_cfgNumbersAsStrings && (!isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS) || !Float.isNaN(f) && !Float.isInfinite(f)))
	//*   0    0:aload_0         
	//*   1    1:getfield        #413 <Field boolean _cfgNumbersAsStrings>
	//*   2    4:ifne            50
	//*   3    7:aload_0         
	//*   4    8:getstatic       #416 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.QUOTE_NON_NUMERIC_NUMBERS>
	//*   5   11:invokevirtual   #285 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*   6   14:ifeq            34
	//*   7   17:fload_1         
	//*   8   18:invokestatic    #440 <Method boolean Float.isNaN(float)>
	//*   9   21:ifne            50
	//*  10   24:fload_1         
	//*  11   25:invokestatic    #442 <Method boolean Float.isInfinite(float)>
	//*  12   28:ifeq            34
	//*  13   31:goto            50
		{
			_verifyValueWrite("write a number");
	//   14   34:aload_0         
	//   15   35:ldc2            #427 <String "write a number">
	//   16   38:invokevirtual   #330 <Method void _verifyValueWrite(String)>
			writeRaw(String.valueOf(f));
	//   17   41:aload_0         
	//   18   42:fload_1         
	//   19   43:invokestatic    #445 <Method String String.valueOf(float)>
	//   20   46:invokevirtual   #154 <Method void writeRaw(String)>
			return;
	//   21   49:return          
		} else
		{
			writeString(String.valueOf(f));
	//   22   50:aload_0         
	//   23   51:fload_1         
	//   24   52:invokestatic    #445 <Method String String.valueOf(float)>
	//   25   55:invokevirtual   #434 <Method void writeString(String)>
			return;
	//   26   58:return          
		}
	}

	public void writeNumber(int i)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #427 <String "write a number">
	//    2    4:invokevirtual   #330 <Method void _verifyValueWrite(String)>
		if(_cfgNumbersAsStrings)
	//*   3    7:aload_0         
	//*   4    8:getfield        #413 <Field boolean _cfgNumbersAsStrings>
	//*   5   11:ifeq            20
		{
			_writeQuotedInt(i);
	//    6   14:aload_0         
	//    7   15:iload_1         
	//    8   16:invokespecial   #447 <Method void _writeQuotedInt(int)>
			return;
	//    9   19:return          
		}
		if(_outputTail + 11 >= _outputEnd)
	//*  10   20:aload_0         
	//*  11   21:getfield        #60  <Field int _outputTail>
	//*  12   24:bipush          11
	//*  13   26:iadd            
	//*  14   27:aload_0         
	//*  15   28:getfield        #49  <Field int _outputEnd>
	//*  16   31:icmplt          38
			_flushBuffer();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #63  <Method void _flushBuffer()>
		_outputTail = NumberOutput.outputInt(i, _outputBuffer, _outputTail);
	//   19   38:aload_0         
	//   20   39:iload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #47  <Field char[] _outputBuffer>
	//   23   44:aload_0         
	//   24   45:getfield        #60  <Field int _outputTail>
	//   25   48:invokestatic    #144 <Method int NumberOutput.outputInt(int, char[], int)>
	//   26   51:putfield        #60  <Field int _outputTail>
	//   27   54:return          
	}

	public void writeNumber(long l)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #427 <String "write a number">
	//    2    4:invokevirtual   #330 <Method void _verifyValueWrite(String)>
		if(_cfgNumbersAsStrings)
	//*   3    7:aload_0         
	//*   4    8:getfield        #413 <Field boolean _cfgNumbersAsStrings>
	//*   5   11:ifeq            20
		{
			_writeQuotedLong(l);
	//    6   14:aload_0         
	//    7   15:lload_1         
	//    8   16:invokespecial   #449 <Method void _writeQuotedLong(long)>
			return;
	//    9   19:return          
		}
		if(_outputTail + 21 >= _outputEnd)
	//*  10   20:aload_0         
	//*  11   21:getfield        #60  <Field int _outputTail>
	//*  12   24:bipush          21
	//*  13   26:iadd            
	//*  14   27:aload_0         
	//*  15   28:getfield        #49  <Field int _outputEnd>
	//*  16   31:icmplt          38
			_flushBuffer();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #63  <Method void _flushBuffer()>
		_outputTail = NumberOutput.outputLong(l, _outputBuffer, _outputTail);
	//   19   38:aload_0         
	//   20   39:lload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #47  <Field char[] _outputBuffer>
	//   23   44:aload_0         
	//   24   45:getfield        #60  <Field int _outputTail>
	//   25   48:invokestatic    #150 <Method int NumberOutput.outputLong(long, char[], int)>
	//   26   51:putfield        #60  <Field int _outputTail>
	//   27   54:return          
	}

	public void writeNumber(String s)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #427 <String "write a number">
	//    2    4:invokevirtual   #330 <Method void _verifyValueWrite(String)>
		if(_cfgNumbersAsStrings)
	//*   3    7:aload_0         
	//*   4    8:getfield        #413 <Field boolean _cfgNumbersAsStrings>
	//*   5   11:ifeq            20
		{
			_writeQuotedRaw(s);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokespecial   #451 <Method void _writeQuotedRaw(String)>
			return;
	//    9   19:return          
		} else
		{
			writeRaw(s);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #154 <Method void writeRaw(String)>
			return;
	//   13   25:return          
		}
	}

	public void writeNumber(BigDecimal bigdecimal)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #427 <String "write a number">
	//    2    4:invokevirtual   #330 <Method void _verifyValueWrite(String)>
		if(bigdecimal == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       16
		{
			_writeNull();
	//    5   11:aload_0         
	//    6   12:invokespecial   #408 <Method void _writeNull()>
			return;
	//    7   15:return          
		}
		if(_cfgNumbersAsStrings)
	//*   8   16:aload_0         
	//*   9   17:getfield        #413 <Field boolean _cfgNumbersAsStrings>
	//*  10   20:ifeq            33
		{
			_writeQuotedRaw(_asString(bigdecimal));
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #456 <Method String _asString(BigDecimal)>
	//   15   29:invokespecial   #451 <Method void _writeQuotedRaw(String)>
			return;
	//   16   32:return          
		} else
		{
			writeRaw(_asString(bigdecimal));
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #456 <Method String _asString(BigDecimal)>
	//   21   39:invokevirtual   #154 <Method void writeRaw(String)>
			return;
	//   22   42:return          
		}
	}

	public void writeNumber(BigInteger biginteger)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #427 <String "write a number">
	//    2    4:invokevirtual   #330 <Method void _verifyValueWrite(String)>
		if(biginteger == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       16
		{
			_writeNull();
	//    5   11:aload_0         
	//    6   12:invokespecial   #408 <Method void _writeNull()>
			return;
	//    7   15:return          
		}
		if(_cfgNumbersAsStrings)
	//*   8   16:aload_0         
	//*   9   17:getfield        #413 <Field boolean _cfgNumbersAsStrings>
	//*  10   20:ifeq            32
		{
			_writeQuotedRaw(biginteger.toString());
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #460 <Method String BigInteger.toString()>
	//   14   28:invokespecial   #451 <Method void _writeQuotedRaw(String)>
			return;
	//   15   31:return          
		} else
		{
			writeRaw(biginteger.toString());
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #460 <Method String BigInteger.toString()>
	//   19   37:invokevirtual   #154 <Method void writeRaw(String)>
			return;
	//   20   40:return          
		}
	}

	public void writeNumber(short word0)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #427 <String "write a number">
	//    2    4:invokevirtual   #330 <Method void _verifyValueWrite(String)>
		if(_cfgNumbersAsStrings)
	//*   3    7:aload_0         
	//*   4    8:getfield        #413 <Field boolean _cfgNumbersAsStrings>
	//*   5   11:ifeq            20
		{
			_writeQuotedShort(word0);
	//    6   14:aload_0         
	//    7   15:iload_1         
	//    8   16:invokespecial   #462 <Method void _writeQuotedShort(short)>
			return;
	//    9   19:return          
		}
		if(_outputTail + 6 >= _outputEnd)
	//*  10   20:aload_0         
	//*  11   21:getfield        #60  <Field int _outputTail>
	//*  12   24:bipush          6
	//*  13   26:iadd            
	//*  14   27:aload_0         
	//*  15   28:getfield        #49  <Field int _outputEnd>
	//*  16   31:icmplt          38
			_flushBuffer();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #63  <Method void _flushBuffer()>
		_outputTail = NumberOutput.outputInt(((int) (word0)), _outputBuffer, _outputTail);
	//   19   38:aload_0         
	//   20   39:iload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #47  <Field char[] _outputBuffer>
	//   23   44:aload_0         
	//   24   45:getfield        #60  <Field int _outputTail>
	//   25   48:invokestatic    #144 <Method int NumberOutput.outputInt(int, char[], int)>
	//   26   51:putfield        #60  <Field int _outputTail>
	//   27   54:return          
	}

	public void writeRaw(char c)
		throws IOException
	{
		if(_outputTail >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field int _outputTail>
	//*   2    4:aload_0         
	//*   3    5:getfield        #49  <Field int _outputEnd>
	//*   4    8:icmplt          15
			_flushBuffer();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #63  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #47  <Field char[] _outputBuffer>
	//    9   19:astore_3        
		int i = _outputTail;
	//   10   20:aload_0         
	//   11   21:getfield        #60  <Field int _outputTail>
	//   12   24:istore_2        
		_outputTail = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #60  <Field int _outputTail>
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
	//    2    2:invokeinterface #81  <Method String SerializableString.getValue()>
	//    3    7:invokevirtual   #154 <Method void writeRaw(String)>
	//    4   10:return          
	}

	public void writeRaw(String s)
		throws IOException
	{
		int k = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #87  <Method int String.length()>
	//    2    4:istore          4
		int j = _outputEnd - _outputTail;
	//    3    6:aload_0         
	//    4    7:getfield        #49  <Field int _outputEnd>
	//    5   10:aload_0         
	//    6   11:getfield        #60  <Field int _outputTail>
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
	//   14   23:invokevirtual   #63  <Method void _flushBuffer()>
			i = _outputEnd - _outputTail;
	//   15   26:aload_0         
	//   16   27:getfield        #49  <Field int _outputEnd>
	//   17   30:aload_0         
	//   18   31:getfield        #60  <Field int _outputTail>
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
	//   28   47:getfield        #47  <Field char[] _outputBuffer>
	//   29   50:aload_0         
	//   30   51:getfield        #60  <Field int _outputTail>
	//   31   54:invokevirtual   #97  <Method void String.getChars(int, int, char[], int)>
			_outputTail = _outputTail + k;
	//   32   57:aload_0         
	//   33   58:aload_0         
	//   34   59:getfield        #60  <Field int _outputTail>
	//   35   62:iload           4
	//   36   64:iadd            
	//   37   65:putfield        #60  <Field int _outputTail>
			return;
	//   38   68:return          
		} else
		{
			writeRawLong(s);
	//   39   69:aload_0         
	//   40   70:aload_1         
	//   41   71:invokespecial   #465 <Method void writeRawLong(String)>
			return;
	//   42   74:return          
		}
	}

	public void writeRaw(String s, int i, int j)
		throws IOException
	{
		int l = _outputEnd - _outputTail;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int _outputEnd>
	//    2    4:aload_0         
	//    3    5:getfield        #60  <Field int _outputTail>
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
	//   12   22:invokevirtual   #63  <Method void _flushBuffer()>
			k = _outputEnd - _outputTail;
	//   13   25:aload_0         
	//   14   26:getfield        #49  <Field int _outputEnd>
	//   15   29:aload_0         
	//   16   30:getfield        #60  <Field int _outputTail>
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
	//   28   48:getfield        #47  <Field char[] _outputBuffer>
	//   29   51:aload_0         
	//   30   52:getfield        #60  <Field int _outputTail>
	//   31   55:invokevirtual   #97  <Method void String.getChars(int, int, char[], int)>
			_outputTail = _outputTail + j;
	//   32   58:aload_0         
	//   33   59:aload_0         
	//   34   60:getfield        #60  <Field int _outputTail>
	//   35   63:iload_3         
	//   36   64:iadd            
	//   37   65:putfield        #60  <Field int _outputTail>
			return;
	//   38   68:return          
		} else
		{
			writeRawLong(s.substring(i, j + i));
	//   39   69:aload_0         
	//   40   70:aload_1         
	//   41   71:iload_2         
	//   42   72:iload_3         
	//   43   73:iload_2         
	//   44   74:iadd            
	//   45   75:invokevirtual   #470 <Method String String.substring(int, int)>
	//   46   78:invokespecial   #465 <Method void writeRawLong(String)>
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
	//*   5    8:getfield        #49  <Field int _outputEnd>
	//*   6   11:aload_0         
	//*   7   12:getfield        #60  <Field int _outputTail>
	//*   8   15:isub            
	//*   9   16:icmple          23
				_flushBuffer();
	//   10   19:aload_0         
	//   11   20:invokevirtual   #63  <Method void _flushBuffer()>
			System.arraycopy(((Object) (ac)), i, ((Object) (_outputBuffer)), _outputTail, j);
	//   12   23:aload_1         
	//   13   24:iload_2         
	//   14   25:aload_0         
	//   15   26:getfield        #47  <Field char[] _outputBuffer>
	//   16   29:aload_0         
	//   17   30:getfield        #60  <Field int _outputTail>
	//   18   33:iload_3         
	//   19   34:invokestatic    #186 <Method void System.arraycopy(Object, int, Object, int, int)>
			_outputTail = _outputTail + j;
	//   20   37:aload_0         
	//   21   38:aload_0         
	//   22   39:getfield        #60  <Field int _outputTail>
	//   23   42:iload_3         
	//   24   43:iadd            
	//   25   44:putfield        #60  <Field int _outputTail>
			return;
	//   26   47:return          
		} else
		{
			_flushBuffer();
	//   27   48:aload_0         
	//   28   49:invokevirtual   #63  <Method void _flushBuffer()>
			_writer.write(ac, i, j);
	//   29   52:aload_0         
	//   30   53:getfield        #40  <Field Writer _writer>
	//   31   56:aload_1         
	//   32   57:iload_2         
	//   33   58:iload_3         
	//   34   59:invokevirtual   #105 <Method void Writer.write(char[], int, int)>
			return;
	//   35   62:return          
		}
	}

	public void writeRawUTF8String(byte abyte0[], int i, int j)
		throws IOException
	{
		_reportUnsupportedOperation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #475 <Method void _reportUnsupportedOperation()>
	//    2    4:return          
	}

	public void writeStartArray()
		throws IOException
	{
		_verifyValueWrite("start an array");
	//    0    0:aload_0         
	//    1    1:ldc2            #478 <String "start an array">
	//    2    4:invokevirtual   #330 <Method void _verifyValueWrite(String)>
		_writeContext = _writeContext.createChildArrayContext();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #205 <Field JsonWriteContext _writeContext>
	//    6   12:invokevirtual   #481 <Method JsonWriteContext JsonWriteContext.createChildArrayContext()>
	//    7   15:putfield        #205 <Field JsonWriteContext _writeContext>
		if(_cfgPrettyPrinter != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #214 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  10   22:ifnull          36
		{
			_cfgPrettyPrinter.writeStartArray(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   11   25:aload_0         
	//   12   26:getfield        #214 <Field PrettyPrinter _cfgPrettyPrinter>
	//   13   29:aload_0         
	//   14   30:invokeinterface #483 <Method void PrettyPrinter.writeStartArray(com.fasterxml.jackson.core.JsonGenerator)>
			return;
	//   15   35:return          
		}
		if(_outputTail >= _outputEnd)
	//*  16   36:aload_0         
	//*  17   37:getfield        #60  <Field int _outputTail>
	//*  18   40:aload_0         
	//*  19   41:getfield        #49  <Field int _outputEnd>
	//*  20   44:icmplt          51
			_flushBuffer();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #63  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//   23   51:aload_0         
	//   24   52:getfield        #47  <Field char[] _outputBuffer>
	//   25   55:astore_2        
		int i = _outputTail;
	//   26   56:aload_0         
	//   27   57:getfield        #60  <Field int _outputTail>
	//   28   60:istore_1        
		_outputTail = i + 1;
	//   29   61:aload_0         
	//   30   62:iload_1         
	//   31   63:iconst_1        
	//   32   64:iadd            
	//   33   65:putfield        #60  <Field int _outputTail>
		ac[i] = '[';
	//   34   68:aload_2         
	//   35   69:iload_1         
	//   36   70:bipush          91
	//   37   72:castore         
	//   38   73:return          
	}

	public void writeStartObject()
		throws IOException
	{
		_verifyValueWrite("start an object");
	//    0    0:aload_0         
	//    1    1:ldc2            #486 <String "start an object">
	//    2    4:invokevirtual   #330 <Method void _verifyValueWrite(String)>
		_writeContext = _writeContext.createChildObjectContext();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #205 <Field JsonWriteContext _writeContext>
	//    6   12:invokevirtual   #489 <Method JsonWriteContext JsonWriteContext.createChildObjectContext()>
	//    7   15:putfield        #205 <Field JsonWriteContext _writeContext>
		if(_cfgPrettyPrinter != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #214 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  10   22:ifnull          36
		{
			_cfgPrettyPrinter.writeStartObject(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   11   25:aload_0         
	//   12   26:getfield        #214 <Field PrettyPrinter _cfgPrettyPrinter>
	//   13   29:aload_0         
	//   14   30:invokeinterface #491 <Method void PrettyPrinter.writeStartObject(com.fasterxml.jackson.core.JsonGenerator)>
			return;
	//   15   35:return          
		}
		if(_outputTail >= _outputEnd)
	//*  16   36:aload_0         
	//*  17   37:getfield        #60  <Field int _outputTail>
	//*  18   40:aload_0         
	//*  19   41:getfield        #49  <Field int _outputEnd>
	//*  20   44:icmplt          51
			_flushBuffer();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #63  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//   23   51:aload_0         
	//   24   52:getfield        #47  <Field char[] _outputBuffer>
	//   25   55:astore_2        
		int i = _outputTail;
	//   26   56:aload_0         
	//   27   57:getfield        #60  <Field int _outputTail>
	//   28   60:istore_1        
		_outputTail = i + 1;
	//   29   61:aload_0         
	//   30   62:iload_1         
	//   31   63:iconst_1        
	//   32   64:iadd            
	//   33   65:putfield        #60  <Field int _outputTail>
		ac[i] = '{';
	//   34   68:aload_2         
	//   35   69:iload_1         
	//   36   70:bipush          123
	//   37   72:castore         
	//   38   73:return          
	}

	public void writeStartObject(Object obj)
		throws IOException
	{
		_verifyValueWrite("start an object");
	//    0    0:aload_0         
	//    1    1:ldc2            #486 <String "start an object">
	//    2    4:invokevirtual   #330 <Method void _verifyValueWrite(String)>
		JsonWriteContext jsonwritecontext = _writeContext.createChildObjectContext();
	//    3    7:aload_0         
	//    4    8:getfield        #205 <Field JsonWriteContext _writeContext>
	//    5   11:invokevirtual   #489 <Method JsonWriteContext JsonWriteContext.createChildObjectContext()>
	//    6   14:astore_3        
		_writeContext = jsonwritecontext;
	//    7   15:aload_0         
	//    8   16:aload_3         
	//    9   17:putfield        #205 <Field JsonWriteContext _writeContext>
		if(obj != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          29
			jsonwritecontext.setCurrentValue(obj);
	//   12   24:aload_3         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #495 <Method void JsonWriteContext.setCurrentValue(Object)>
		if(_cfgPrettyPrinter != null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #214 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  17   33:ifnull          47
		{
			_cfgPrettyPrinter.writeStartObject(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   18   36:aload_0         
	//   19   37:getfield        #214 <Field PrettyPrinter _cfgPrettyPrinter>
	//   20   40:aload_0         
	//   21   41:invokeinterface #491 <Method void PrettyPrinter.writeStartObject(com.fasterxml.jackson.core.JsonGenerator)>
			return;
	//   22   46:return          
		}
		if(_outputTail >= _outputEnd)
	//*  23   47:aload_0         
	//*  24   48:getfield        #60  <Field int _outputTail>
	//*  25   51:aload_0         
	//*  26   52:getfield        #49  <Field int _outputEnd>
	//*  27   55:icmplt          62
			_flushBuffer();
	//   28   58:aload_0         
	//   29   59:invokevirtual   #63  <Method void _flushBuffer()>
		obj = ((Object) (_outputBuffer));
	//   30   62:aload_0         
	//   31   63:getfield        #47  <Field char[] _outputBuffer>
	//   32   66:astore_1        
		int i = _outputTail;
	//   33   67:aload_0         
	//   34   68:getfield        #60  <Field int _outputTail>
	//   35   71:istore_2        
		_outputTail = i + 1;
	//   36   72:aload_0         
	//   37   73:iload_2         
	//   38   74:iconst_1        
	//   39   75:iadd            
	//   40   76:putfield        #60  <Field int _outputTail>
		obj[i] = '{';
	//   41   79:aload_1         
	//   42   80:iload_2         
	//   43   81:bipush          123
	//   44   83:castore         
	//   45   84:return          
	}

	public void writeString(SerializableString serializablestring)
		throws IOException
	{
		_verifyValueWrite("write a string");
	//    0    0:aload_0         
	//    1    1:ldc2            #497 <String "write a string">
	//    2    4:invokevirtual   #330 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #60  <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #49  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #63  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #47  <Field char[] _outputBuffer>
	//   12   26:astore_3        
		int i = _outputTail;
	//   13   27:aload_0         
	//   14   28:getfield        #60  <Field int _outputTail>
	//   15   31:istore_2        
		_outputTail = i + 1;
	//   16   32:aload_0         
	//   17   33:iload_2         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:putfield        #60  <Field int _outputTail>
		ac[i] = _quoteChar;
	//   21   39:aload_3         
	//   22   40:iload_2         
	//   23   41:aload_0         
	//   24   42:getfield        #38  <Field char _quoteChar>
	//   25   45:castore         
		serializablestring = ((SerializableString) (serializablestring.asQuotedChars()));
	//   26   46:aload_1         
	//   27   47:invokeinterface #250 <Method char[] SerializableString.asQuotedChars()>
	//   28   52:astore_1        
		i = serializablestring.length;
	//   29   53:aload_1         
	//   30   54:arraylength     
	//   31   55:istore_2        
		if(i < 32)
	//*  32   56:iload_2         
	//*  33   57:bipush          32
	//*  34   59:icmpge          106
		{
			if(i > _outputEnd - _outputTail)
	//*  35   62:iload_2         
	//*  36   63:aload_0         
	//*  37   64:getfield        #49  <Field int _outputEnd>
	//*  38   67:aload_0         
	//*  39   68:getfield        #60  <Field int _outputTail>
	//*  40   71:isub            
	//*  41   72:icmple          79
				_flushBuffer();
	//   42   75:aload_0         
	//   43   76:invokevirtual   #63  <Method void _flushBuffer()>
			System.arraycopy(((Object) (serializablestring)), 0, ((Object) (_outputBuffer)), _outputTail, i);
	//   44   79:aload_1         
	//   45   80:iconst_0        
	//   46   81:aload_0         
	//   47   82:getfield        #47  <Field char[] _outputBuffer>
	//   48   85:aload_0         
	//   49   86:getfield        #60  <Field int _outputTail>
	//   50   89:iload_2         
	//   51   90:invokestatic    #186 <Method void System.arraycopy(Object, int, Object, int, int)>
			_outputTail = _outputTail + i;
	//   52   93:aload_0         
	//   53   94:aload_0         
	//   54   95:getfield        #60  <Field int _outputTail>
	//   55   98:iload_2         
	//   56   99:iadd            
	//   57  100:putfield        #60  <Field int _outputTail>
		} else
	//*  58  103:goto            120
		{
			_flushBuffer();
	//   59  106:aload_0         
	//   60  107:invokevirtual   #63  <Method void _flushBuffer()>
			_writer.write(((char []) (serializablestring)), 0, i);
	//   61  110:aload_0         
	//   62  111:getfield        #40  <Field Writer _writer>
	//   63  114:aload_1         
	//   64  115:iconst_0        
	//   65  116:iload_2         
	//   66  117:invokevirtual   #105 <Method void Writer.write(char[], int, int)>
		}
		if(_outputTail >= _outputEnd)
	//*  67  120:aload_0         
	//*  68  121:getfield        #60  <Field int _outputTail>
	//*  69  124:aload_0         
	//*  70  125:getfield        #49  <Field int _outputEnd>
	//*  71  128:icmplt          135
			_flushBuffer();
	//   72  131:aload_0         
	//   73  132:invokevirtual   #63  <Method void _flushBuffer()>
		serializablestring = ((SerializableString) (_outputBuffer));
	//   74  135:aload_0         
	//   75  136:getfield        #47  <Field char[] _outputBuffer>
	//   76  139:astore_1        
		i = _outputTail;
	//   77  140:aload_0         
	//   78  141:getfield        #60  <Field int _outputTail>
	//   79  144:istore_2        
		_outputTail = i + 1;
	//   80  145:aload_0         
	//   81  146:iload_2         
	//   82  147:iconst_1        
	//   83  148:iadd            
	//   84  149:putfield        #60  <Field int _outputTail>
		serializablestring[i] = _quoteChar;
	//   85  152:aload_1         
	//   86  153:iload_2         
	//   87  154:aload_0         
	//   88  155:getfield        #38  <Field char _quoteChar>
	//   89  158:castore         
	//   90  159:return          
	}

	public void writeString(String s)
		throws IOException
	{
		_verifyValueWrite("write a string");
	//    0    0:aload_0         
	//    1    1:ldc2            #497 <String "write a string">
	//    2    4:invokevirtual   #330 <Method void _verifyValueWrite(String)>
		if(s == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       16
		{
			_writeNull();
	//    5   11:aload_0         
	//    6   12:invokespecial   #408 <Method void _writeNull()>
			return;
	//    7   15:return          
		}
		if(_outputTail >= _outputEnd)
	//*   8   16:aload_0         
	//*   9   17:getfield        #60  <Field int _outputTail>
	//*  10   20:aload_0         
	//*  11   21:getfield        #49  <Field int _outputEnd>
	//*  12   24:icmplt          31
			_flushBuffer();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #63  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//   15   31:aload_0         
	//   16   32:getfield        #47  <Field char[] _outputBuffer>
	//   17   35:astore_3        
		int i = _outputTail;
	//   18   36:aload_0         
	//   19   37:getfield        #60  <Field int _outputTail>
	//   20   40:istore_2        
		_outputTail = i + 1;
	//   21   41:aload_0         
	//   22   42:iload_2         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:putfield        #60  <Field int _outputTail>
		ac[i] = _quoteChar;
	//   26   48:aload_3         
	//   27   49:iload_2         
	//   28   50:aload_0         
	//   29   51:getfield        #38  <Field char _quoteChar>
	//   30   54:castore         
		_writeString(s);
	//   31   55:aload_0         
	//   32   56:aload_1         
	//   33   57:invokespecial   #261 <Method void _writeString(String)>
		if(_outputTail >= _outputEnd)
	//*  34   60:aload_0         
	//*  35   61:getfield        #60  <Field int _outputTail>
	//*  36   64:aload_0         
	//*  37   65:getfield        #49  <Field int _outputEnd>
	//*  38   68:icmplt          75
			_flushBuffer();
	//   39   71:aload_0         
	//   40   72:invokevirtual   #63  <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//   41   75:aload_0         
	//   42   76:getfield        #47  <Field char[] _outputBuffer>
	//   43   79:astore_1        
		i = _outputTail;
	//   44   80:aload_0         
	//   45   81:getfield        #60  <Field int _outputTail>
	//   46   84:istore_2        
		_outputTail = i + 1;
	//   47   85:aload_0         
	//   48   86:iload_2         
	//   49   87:iconst_1        
	//   50   88:iadd            
	//   51   89:putfield        #60  <Field int _outputTail>
		s[i] = _quoteChar;
	//   52   92:aload_1         
	//   53   93:iload_2         
	//   54   94:aload_0         
	//   55   95:getfield        #38  <Field char _quoteChar>
	//   56   98:castore         
	//   57   99:return          
	}

	public void writeString(char ac[], int i, int j)
		throws IOException
	{
		_verifyValueWrite("write a string");
	//    0    0:aload_0         
	//    1    1:ldc2            #497 <String "write a string">
	//    2    4:invokevirtual   #330 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #60  <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #49  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #63  <Method void _flushBuffer()>
		char ac1[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #47  <Field char[] _outputBuffer>
	//   12   26:astore          5
		int k = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #60  <Field int _outputTail>
	//   15   32:istore          4
		_outputTail = k + 1;
	//   16   34:aload_0         
	//   17   35:iload           4
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #60  <Field int _outputTail>
		ac1[k] = _quoteChar;
	//   21   42:aload           5
	//   22   44:iload           4
	//   23   46:aload_0         
	//   24   47:getfield        #38  <Field char _quoteChar>
	//   25   50:castore         
		_writeString(ac, i, j);
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:iload_2         
	//   29   54:iload_3         
	//   30   55:invokespecial   #499 <Method void _writeString(char[], int, int)>
		if(_outputTail >= _outputEnd)
	//*  31   58:aload_0         
	//*  32   59:getfield        #60  <Field int _outputTail>
	//*  33   62:aload_0         
	//*  34   63:getfield        #49  <Field int _outputEnd>
	//*  35   66:icmplt          73
			_flushBuffer();
	//   36   69:aload_0         
	//   37   70:invokevirtual   #63  <Method void _flushBuffer()>
		ac = _outputBuffer;
	//   38   73:aload_0         
	//   39   74:getfield        #47  <Field char[] _outputBuffer>
	//   40   77:astore_1        
		i = _outputTail;
	//   41   78:aload_0         
	//   42   79:getfield        #60  <Field int _outputTail>
	//   43   82:istore_2        
		_outputTail = i + 1;
	//   44   83:aload_0         
	//   45   84:iload_2         
	//   46   85:iconst_1        
	//   47   86:iadd            
	//   48   87:putfield        #60  <Field int _outputTail>
		ac[i] = _quoteChar;
	//   49   90:aload_1         
	//   50   91:iload_2         
	//   51   92:aload_0         
	//   52   93:getfield        #38  <Field char _quoteChar>
	//   53   96:castore         
	//   54   97:return          
	}

	public void writeUTF8String(byte abyte0[], int i, int j)
		throws IOException
	{
		_reportUnsupportedOperation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #475 <Method void _reportUnsupportedOperation()>
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
	protected char _quoteChar;
	protected final Writer _writer;

	static 
	{
	//    0    0:invokestatic    #28  <Method char[] CharTypes.copyHexChars()>
	//    1    3:putstatic       #30  <Field char[] HEX_CHARS>
	//*   2    6:return          
	}
}
