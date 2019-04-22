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

public class WriterBasedJsonGenerator extends JsonGeneratorImpl
{

	public WriterBasedJsonGenerator(IOContext iocontext, int i, ObjectCodec objectcodec, Writer writer)
	{
		super(iocontext, i, objectcodec);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #35  <Method void JsonGeneratorImpl(IOContext, int, ObjectCodec)>
		_quoteChar = '"';
	//    5    7:aload_0         
	//    6    8:bipush          34
	//    7   10:putfield        #37  <Field char _quoteChar>
		_writer = writer;
	//    8   13:aload_0         
	//    9   14:aload           4
	//   10   16:putfield        #39  <Field Writer _writer>
		_outputBuffer = iocontext.allocConcatBuffer();
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #44  <Method char[] IOContext.allocConcatBuffer()>
	//   14   24:putfield        #46  <Field char[] _outputBuffer>
		_outputEnd = _outputBuffer.length;
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #46  <Field char[] _outputBuffer>
	//   18   32:arraylength     
	//   19   33:putfield        #48  <Field int _outputEnd>
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
	//   33   44:putfield        #51  <Field char[] _entityBuffer>
		return ac;
	//   34   47:aload_1         
	//   35   48:areturn         
	}

	private void _appendCharacterEscape(char c, int i)
		throws IOException, JsonGenerationException
	{
		if(i >= 0)
	//*   0    0:iload_2         
	//*   1    1:iflt            64
		{
			if(_outputTail + 2 > _outputEnd)
	//*   2    4:aload_0         
	//*   3    5:getfield        #59  <Field int _outputTail>
	//*   4    8:iconst_2        
	//*   5    9:iadd            
	//*   6   10:aload_0         
	//*   7   11:getfield        #48  <Field int _outputEnd>
	//*   8   14:icmple          21
				_flushBuffer();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #62  <Method void _flushBuffer()>
			char ac[] = _outputBuffer;
	//   11   21:aload_0         
	//   12   22:getfield        #46  <Field char[] _outputBuffer>
	//   13   25:astore          5
			c = ((char) (_outputTail));
	//   14   27:aload_0         
	//   15   28:getfield        #59  <Field int _outputTail>
	//   16   31:istore_1        
			_outputTail = c + 1;
	//   17   32:aload_0         
	//   18   33:iload_1         
	//   19   34:iconst_1        
	//   20   35:iadd            
	//   21   36:putfield        #59  <Field int _outputTail>
			ac[c] = '\\';
	//   22   39:aload           5
	//   23   41:iload_1         
	//   24   42:bipush          92
	//   25   44:castore         
			c = ((char) (_outputTail));
	//   26   45:aload_0         
	//   27   46:getfield        #59  <Field int _outputTail>
	//   28   49:istore_1        
			_outputTail = c + 1;
	//   29   50:aload_0         
	//   30   51:iload_1         
	//   31   52:iconst_1        
	//   32   53:iadd            
	//   33   54:putfield        #59  <Field int _outputTail>
			ac[c] = (char)i;
	//   34   57:aload           5
	//   35   59:iload_1         
	//   36   60:iload_2         
	//   37   61:int2char        
	//   38   62:castore         
			return;
	//   39   63:return          
		}
		if(i != -2)
	//*  40   64:iload_2         
	//*  41   65:bipush          -2
	//*  42   67:icmpeq          239
		{
			if(_outputTail + 5 >= _outputEnd)
	//*  43   70:aload_0         
	//*  44   71:getfield        #59  <Field int _outputTail>
	//*  45   74:iconst_5        
	//*  46   75:iadd            
	//*  47   76:aload_0         
	//*  48   77:getfield        #48  <Field int _outputEnd>
	//*  49   80:icmplt          87
				_flushBuffer();
	//   50   83:aload_0         
	//   51   84:invokevirtual   #62  <Method void _flushBuffer()>
			i = _outputTail;
	//   52   87:aload_0         
	//   53   88:getfield        #59  <Field int _outputTail>
	//   54   91:istore_2        
			char ac1[] = _outputBuffer;
	//   55   92:aload_0         
	//   56   93:getfield        #46  <Field char[] _outputBuffer>
	//   57   96:astore          5
			int j = i + 1;
	//   58   98:iload_2         
	//   59   99:iconst_1        
	//   60  100:iadd            
	//   61  101:istore_3        
			ac1[i] = '\\';
	//   62  102:aload           5
	//   63  104:iload_2         
	//   64  105:bipush          92
	//   65  107:castore         
			i = j + 1;
	//   66  108:iload_3         
	//   67  109:iconst_1        
	//   68  110:iadd            
	//   69  111:istore_2        
			ac1[j] = 'u';
	//   70  112:aload           5
	//   71  114:iload_3         
	//   72  115:bipush          117
	//   73  117:castore         
			if(c > '\377')
	//*  74  118:iload_1         
	//*  75  119:sipush          255
	//*  76  122:icmple          181
			{
				j = 0xff & c >> 8;
	//   77  125:sipush          255
	//   78  128:iload_1         
	//   79  129:bipush          8
	//   80  131:ishr            
	//   81  132:iand            
	//   82  133:istore_3        
				int k = i + 1;
	//   83  134:iload_2         
	//   84  135:iconst_1        
	//   85  136:iadd            
	//   86  137:istore          4
				char ac2[] = HEX_CHARS;
	//   87  139:getstatic       #29  <Field char[] HEX_CHARS>
	//   88  142:astore          6
				ac1[i] = ac2[j >> 4];
	//   89  144:aload           5
	//   90  146:iload_2         
	//   91  147:aload           6
	//   92  149:iload_3         
	//   93  150:iconst_4        
	//   94  151:ishr            
	//   95  152:caload          
	//   96  153:castore         
				i = k + 1;
	//   97  154:iload           4
	//   98  156:iconst_1        
	//   99  157:iadd            
	//  100  158:istore_2        
				ac1[k] = ac2[j & 0xf];
	//  101  159:aload           5
	//  102  161:iload           4
	//  103  163:aload           6
	//  104  165:iload_3         
	//  105  166:bipush          15
	//  106  168:iand            
	//  107  169:caload          
	//  108  170:castore         
				c &= '\377';
	//  109  171:iload_1         
	//  110  172:sipush          255
	//  111  175:iand            
	//  112  176:int2char        
	//  113  177:istore_1        
			} else
	//* 114  178:goto            201
			{
				j = i + 1;
	//  115  181:iload_2         
	//  116  182:iconst_1        
	//  117  183:iadd            
	//  118  184:istore_3        
				ac1[i] = '0';
	//  119  185:aload           5
	//  120  187:iload_2         
	//  121  188:bipush          48
	//  122  190:castore         
				i = j + 1;
	//  123  191:iload_3         
	//  124  192:iconst_1        
	//  125  193:iadd            
	//  126  194:istore_2        
				ac1[j] = '0';
	//  127  195:aload           5
	//  128  197:iload_3         
	//  129  198:bipush          48
	//  130  200:castore         
			}
			j = i + 1;
	//  131  201:iload_2         
	//  132  202:iconst_1        
	//  133  203:iadd            
	//  134  204:istore_3        
			char ac3[] = HEX_CHARS;
	//  135  205:getstatic       #29  <Field char[] HEX_CHARS>
	//  136  208:astore          6
			ac1[i] = ac3[c >> 4];
	//  137  210:aload           5
	//  138  212:iload_2         
	//  139  213:aload           6
	//  140  215:iload_1         
	//  141  216:iconst_4        
	//  142  217:ishr            
	//  143  218:caload          
	//  144  219:castore         
			ac1[j] = ac3[c & 0xf];
	//  145  220:aload           5
	//  146  222:iload_3         
	//  147  223:aload           6
	//  148  225:iload_1         
	//  149  226:bipush          15
	//  150  228:iand            
	//  151  229:caload          
	//  152  230:castore         
			_outputTail = j + 1;
	//  153  231:aload_0         
	//  154  232:iload_3         
	//  155  233:iconst_1        
	//  156  234:iadd            
	//  157  235:putfield        #59  <Field int _outputTail>
			return;
	//  158  238:return          
		}
		Object obj = ((Object) (_currentEscape));
	//  159  239:aload_0         
	//  160  240:getfield        #64  <Field SerializableString _currentEscape>
	//  161  243:astore          5
		if(obj == null)
	//* 162  245:aload           5
	//* 163  247:ifnonnull       268
		{
			obj = ((Object) (_characterEscapes.getEscapeSequence(((int) (c))).getValue()));
	//  164  250:aload_0         
	//  165  251:getfield        #68  <Field CharacterEscapes _characterEscapes>
	//  166  254:iload_1         
	//  167  255:invokevirtual   #74  <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//  168  258:invokeinterface #80  <Method String SerializableString.getValue()>
	//  169  263:astore          5
		} else
	//* 170  265:goto            282
		{
			obj = ((Object) (((SerializableString) (obj)).getValue()));
	//  171  268:aload           5
	//  172  270:invokeinterface #80  <Method String SerializableString.getValue()>
	//  173  275:astore          5
			_currentEscape = null;
	//  174  277:aload_0         
	//  175  278:aconst_null     
	//  176  279:putfield        #64  <Field SerializableString _currentEscape>
		}
		c = ((char) (((String) (obj)).length()));
	//  177  282:aload           5
	//  178  284:invokevirtual   #86  <Method int String.length()>
	//  179  287:istore_1        
		if(_outputTail + c > _outputEnd)
	//* 180  288:aload_0         
	//* 181  289:getfield        #59  <Field int _outputTail>
	//* 182  292:iload_1         
	//* 183  293:iadd            
	//* 184  294:aload_0         
	//* 185  295:getfield        #48  <Field int _outputEnd>
	//* 186  298:icmple          323
		{
			_flushBuffer();
	//  187  301:aload_0         
	//  188  302:invokevirtual   #62  <Method void _flushBuffer()>
			if(c > _outputEnd)
	//* 189  305:iload_1         
	//* 190  306:aload_0         
	//* 191  307:getfield        #48  <Field int _outputEnd>
	//* 192  310:icmple          323
			{
				_writer.write(((String) (obj)));
	//  193  313:aload_0         
	//  194  314:getfield        #39  <Field Writer _writer>
	//  195  317:aload           5
	//  196  319:invokevirtual   #92  <Method void Writer.write(String)>
				return;
	//  197  322:return          
			}
		}
		((String) (obj)).getChars(0, ((int) (c)), _outputBuffer, _outputTail);
	//  198  323:aload           5
	//  199  325:iconst_0        
	//  200  326:iload_1         
	//  201  327:aload_0         
	//  202  328:getfield        #46  <Field char[] _outputBuffer>
	//  203  331:aload_0         
	//  204  332:getfield        #59  <Field int _outputTail>
	//  205  335:invokevirtual   #96  <Method void String.getChars(int, int, char[], int)>
		_outputTail = _outputTail + c;
	//  206  338:aload_0         
	//  207  339:aload_0         
	//  208  340:getfield        #59  <Field int _outputTail>
	//  209  343:iload_1         
	//  210  344:iadd            
	//  211  345:putfield        #59  <Field int _outputTail>
	//  212  348:return          
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
	//   26   35:getfield        #51  <Field char[] _entityBuffer>
	//   27   38:astore          6
			ac = ac1;
	//   28   40:aload           6
	//   29   42:astore_1        
			if(ac1 == null)
	//*  30   43:aload           6
	//*  31   45:ifnonnull       53
				ac = _allocateEntityBuffer();
	//   32   48:aload_0         
	//   33   49:invokespecial   #101 <Method char[] _allocateEntityBuffer()>
	//   34   52:astore_1        
			ac[1] = (char)k;
	//   35   53:aload_1         
	//   36   54:iconst_1        
	//   37   55:iload           5
	//   38   57:int2char        
	//   39   58:castore         
			_writer.write(ac, 0, 2);
	//   40   59:aload_0         
	//   41   60:getfield        #39  <Field Writer _writer>
	//   42   63:aload_1         
	//   43   64:iconst_0        
	//   44   65:iconst_2        
	//   45   66:invokevirtual   #104 <Method void Writer.write(char[], int, int)>
			return i;
	//   46   69:iload_2         
	//   47   70:ireturn         
		}
		if(k != -2)
	//*  48   71:iload           5
	//*  49   73:bipush          -2
	//*  50   75:icmpeq          385
		{
			if(i > 5 && i < j)
	//*  51   78:iload_2         
	//*  52   79:iconst_5        
	//*  53   80:icmple          228
	//*  54   83:iload_2         
	//*  55   84:iload_3         
	//*  56   85:icmpge          228
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
	//*  79  116:icmple          176
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
					char ac2[] = HEX_CHARS;
	//   90  134:getstatic       #29  <Field char[] HEX_CHARS>
	//   91  137:astore          6
					ac[i] = ac2[j >> 4];
	//   92  139:aload_1         
	//   93  140:iload_2         
	//   94  141:aload           6
	//   95  143:iload_3         
	//   96  144:iconst_4        
	//   97  145:ishr            
	//   98  146:caload          
	//   99  147:castore         
					i = k + 1;
	//  100  148:iload           5
	//  101  150:iconst_1        
	//  102  151:iadd            
	//  103  152:istore_2        
					ac[k] = ac2[j & 0xf];
	//  104  153:aload_1         
	//  105  154:iload           5
	//  106  156:aload           6
	//  107  158:iload_3         
	//  108  159:bipush          15
	//  109  161:iand            
	//  110  162:caload          
	//  111  163:castore         
					c &= '\377';
	//  112  164:iload           4
	//  113  166:sipush          255
	//  114  169:iand            
	//  115  170:int2char        
	//  116  171:istore          4
				} else
	//* 117  173:goto            194
				{
					j = i + 1;
	//  118  176:iload_2         
	//  119  177:iconst_1        
	//  120  178:iadd            
	//  121  179:istore_3        
					ac[i] = '0';
	//  122  180:aload_1         
	//  123  181:iload_2         
	//  124  182:bipush          48
	//  125  184:castore         
					i = j + 1;
	//  126  185:iload_3         
	//  127  186:iconst_1        
	//  128  187:iadd            
	//  129  188:istore_2        
					ac[j] = '0';
	//  130  189:aload_1         
	//  131  190:iload_3         
	//  132  191:bipush          48
	//  133  193:castore         
				}
				j = i + 1;
	//  134  194:iload_2         
	//  135  195:iconst_1        
	//  136  196:iadd            
	//  137  197:istore_3        
				char ac3[] = HEX_CHARS;
	//  138  198:getstatic       #29  <Field char[] HEX_CHARS>
	//  139  201:astore          6
				ac[i] = ac3[c >> 4];
	//  140  203:aload_1         
	//  141  204:iload_2         
	//  142  205:aload           6
	//  143  207:iload           4
	//  144  209:iconst_4        
	//  145  210:ishr            
	//  146  211:caload          
	//  147  212:castore         
				ac[j] = ac3[c & 0xf];
	//  148  213:aload_1         
	//  149  214:iload_3         
	//  150  215:aload           6
	//  151  217:iload           4
	//  152  219:bipush          15
	//  153  221:iand            
	//  154  222:caload          
	//  155  223:castore         
				return j - 5;
	//  156  224:iload_3         
	//  157  225:iconst_5        
	//  158  226:isub            
	//  159  227:ireturn         
			}
			char ac4[] = _entityBuffer;
	//  160  228:aload_0         
	//  161  229:getfield        #51  <Field char[] _entityBuffer>
	//  162  232:astore          6
			ac = ac4;
	//  163  234:aload           6
	//  164  236:astore_1        
			if(ac4 == null)
	//* 165  237:aload           6
	//* 166  239:ifnonnull       247
				ac = _allocateEntityBuffer();
	//  167  242:aload_0         
	//  168  243:invokespecial   #101 <Method char[] _allocateEntityBuffer()>
	//  169  246:astore_1        
			_outputHead = _outputTail;
	//  170  247:aload_0         
	//  171  248:aload_0         
	//  172  249:getfield        #59  <Field int _outputTail>
	//  173  252:putfield        #106 <Field int _outputHead>
			if(c > '\377')
	//* 174  255:iload           4
	//* 175  257:sipush          255
	//* 176  260:icmple          344
			{
				j = c >> 8 & 0xff;
	//  177  263:iload           4
	//  178  265:bipush          8
	//  179  267:ishr            
	//  180  268:sipush          255
	//  181  271:iand            
	//  182  272:istore_3        
				c &= '\377';
	//  183  273:iload           4
	//  184  275:sipush          255
	//  185  278:iand            
	//  186  279:istore          4
				char ac5[] = HEX_CHARS;
	//  187  281:getstatic       #29  <Field char[] HEX_CHARS>
	//  188  284:astore          6
				ac[10] = ac5[j >> 4];
	//  189  286:aload_1         
	//  190  287:bipush          10
	//  191  289:aload           6
	//  192  291:iload_3         
	//  193  292:iconst_4        
	//  194  293:ishr            
	//  195  294:caload          
	//  196  295:castore         
				ac[11] = ac5[j & 0xf];
	//  197  296:aload_1         
	//  198  297:bipush          11
	//  199  299:aload           6
	//  200  301:iload_3         
	//  201  302:bipush          15
	//  202  304:iand            
	//  203  305:caload          
	//  204  306:castore         
				ac[12] = ac5[c >> 4];
	//  205  307:aload_1         
	//  206  308:bipush          12
	//  207  310:aload           6
	//  208  312:iload           4
	//  209  314:iconst_4        
	//  210  315:ishr            
	//  211  316:caload          
	//  212  317:castore         
				ac[13] = ac5[c & 0xf];
	//  213  318:aload_1         
	//  214  319:bipush          13
	//  215  321:aload           6
	//  216  323:iload           4
	//  217  325:bipush          15
	//  218  327:iand            
	//  219  328:caload          
	//  220  329:castore         
				_writer.write(ac, 8, 6);
	//  221  330:aload_0         
	//  222  331:getfield        #39  <Field Writer _writer>
	//  223  334:aload_1         
	//  224  335:bipush          8
	//  225  337:bipush          6
	//  226  339:invokevirtual   #104 <Method void Writer.write(char[], int, int)>
				return i;
	//  227  342:iload_2         
	//  228  343:ireturn         
			} else
			{
				char ac6[] = HEX_CHARS;
	//  229  344:getstatic       #29  <Field char[] HEX_CHARS>
	//  230  347:astore          6
				ac[6] = ac6[c >> 4];
	//  231  349:aload_1         
	//  232  350:bipush          6
	//  233  352:aload           6
	//  234  354:iload           4
	//  235  356:iconst_4        
	//  236  357:ishr            
	//  237  358:caload          
	//  238  359:castore         
				ac[7] = ac6[c & 0xf];
	//  239  360:aload_1         
	//  240  361:bipush          7
	//  241  363:aload           6
	//  242  365:iload           4
	//  243  367:bipush          15
	//  244  369:iand            
	//  245  370:caload          
	//  246  371:castore         
				_writer.write(ac, 2, 6);
	//  247  372:aload_0         
	//  248  373:getfield        #39  <Field Writer _writer>
	//  249  376:aload_1         
	//  250  377:iconst_2        
	//  251  378:bipush          6
	//  252  380:invokevirtual   #104 <Method void Writer.write(char[], int, int)>
				return i;
	//  253  383:iload_2         
	//  254  384:ireturn         
			}
		}
		Object obj = ((Object) (_currentEscape));
	//  255  385:aload_0         
	//  256  386:getfield        #64  <Field SerializableString _currentEscape>
	//  257  389:astore          6
		if(obj == null)
	//* 258  391:aload           6
	//* 259  393:ifnonnull       415
		{
			obj = ((Object) (_characterEscapes.getEscapeSequence(((int) (c))).getValue()));
	//  260  396:aload_0         
	//  261  397:getfield        #68  <Field CharacterEscapes _characterEscapes>
	//  262  400:iload           4
	//  263  402:invokevirtual   #74  <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//  264  405:invokeinterface #80  <Method String SerializableString.getValue()>
	//  265  410:astore          6
		} else
	//* 266  412:goto            429
		{
			obj = ((Object) (((SerializableString) (obj)).getValue()));
	//  267  415:aload           6
	//  268  417:invokeinterface #80  <Method String SerializableString.getValue()>
	//  269  422:astore          6
			_currentEscape = null;
	//  270  424:aload_0         
	//  271  425:aconst_null     
	//  272  426:putfield        #64  <Field SerializableString _currentEscape>
		}
		c = ((char) (((String) (obj)).length()));
	//  273  429:aload           6
	//  274  431:invokevirtual   #86  <Method int String.length()>
	//  275  434:istore          4
		if(i >= c && i < j)
	//* 276  436:iload_2         
	//* 277  437:iload           4
	//* 278  439:icmplt          464
	//* 279  442:iload_2         
	//* 280  443:iload_3         
	//* 281  444:icmpge          464
		{
			i -= ((int) (c));
	//  282  447:iload_2         
	//  283  448:iload           4
	//  284  450:isub            
	//  285  451:istore_2        
			((String) (obj)).getChars(0, ((int) (c)), ac, i);
	//  286  452:aload           6
	//  287  454:iconst_0        
	//  288  455:iload           4
	//  289  457:aload_1         
	//  290  458:iload_2         
	//  291  459:invokevirtual   #96  <Method void String.getChars(int, int, char[], int)>
			return i;
	//  292  462:iload_2         
	//  293  463:ireturn         
		} else
		{
			_writer.write(((String) (obj)));
	//  294  464:aload_0         
	//  295  465:getfield        #39  <Field Writer _writer>
	//  296  468:aload           6
	//  297  470:invokevirtual   #92  <Method void Writer.write(String)>
			return i;
	//  298  473:iload_2         
	//  299  474:ireturn         
		}
	}

	private void _prependOrWriteCharacterEscape(char c, int i)
		throws IOException, JsonGenerationException
	{
		if(i >= 0)
	//*   0    0:iload_2         
	//*   1    1:iflt            91
		{
			c = ((char) (_outputTail));
	//    2    4:aload_0         
	//    3    5:getfield        #59  <Field int _outputTail>
	//    4    8:istore_1        
			if(c >= '\002')
	//*   5    9:iload_1         
	//*   6   10:iconst_2        
	//*   7   11:icmplt          44
			{
				c -= '\002';
	//    8   14:iload_1         
	//    9   15:iconst_2        
	//   10   16:isub            
	//   11   17:istore_1        
				_outputHead = ((int) (c));
	//   12   18:aload_0         
	//   13   19:iload_1         
	//   14   20:putfield        #106 <Field int _outputHead>
				char ac[] = _outputBuffer;
	//   15   23:aload_0         
	//   16   24:getfield        #46  <Field char[] _outputBuffer>
	//   17   27:astore          4
				ac[c] = '\\';
	//   18   29:aload           4
	//   19   31:iload_1         
	//   20   32:bipush          92
	//   21   34:castore         
				ac[c + 1] = (char)i;
	//   22   35:aload           4
	//   23   37:iload_1         
	//   24   38:iconst_1        
	//   25   39:iadd            
	//   26   40:iload_2         
	//   27   41:int2char        
	//   28   42:castore         
				return;
	//   29   43:return          
			}
			char ac4[] = _entityBuffer;
	//   30   44:aload_0         
	//   31   45:getfield        #51  <Field char[] _entityBuffer>
	//   32   48:astore          5
			char ac1[] = ac4;
	//   33   50:aload           5
	//   34   52:astore          4
			if(ac4 == null)
	//*  35   54:aload           5
	//*  36   56:ifnonnull       65
				ac1 = _allocateEntityBuffer();
	//   37   59:aload_0         
	//   38   60:invokespecial   #101 <Method char[] _allocateEntityBuffer()>
	//   39   63:astore          4
			_outputHead = _outputTail;
	//   40   65:aload_0         
	//   41   66:aload_0         
	//   42   67:getfield        #59  <Field int _outputTail>
	//   43   70:putfield        #106 <Field int _outputHead>
			ac1[1] = (char)i;
	//   44   73:aload           4
	//   45   75:iconst_1        
	//   46   76:iload_2         
	//   47   77:int2char        
	//   48   78:castore         
			_writer.write(ac1, 0, 2);
	//   49   79:aload_0         
	//   50   80:getfield        #39  <Field Writer _writer>
	//   51   83:aload           4
	//   52   85:iconst_0        
	//   53   86:iconst_2        
	//   54   87:invokevirtual   #104 <Method void Writer.write(char[], int, int)>
			return;
	//   55   90:return          
		}
		if(i != -2)
	//*  56   91:iload_2         
	//*  57   92:bipush          -2
	//*  58   94:icmpeq          410
		{
			i = _outputTail;
	//   59   97:aload_0         
	//   60   98:getfield        #59  <Field int _outputTail>
	//   61  101:istore_2        
			if(i >= 6)
	//*  62  102:iload_2         
	//*  63  103:bipush          6
	//*  64  105:icmplt          253
			{
				char ac2[] = _outputBuffer;
	//   65  108:aload_0         
	//   66  109:getfield        #46  <Field char[] _outputBuffer>
	//   67  112:astore          4
				i -= 6;
	//   68  114:iload_2         
	//   69  115:bipush          6
	//   70  117:isub            
	//   71  118:istore_2        
				_outputHead = i;
	//   72  119:aload_0         
	//   73  120:iload_2         
	//   74  121:putfield        #106 <Field int _outputHead>
				ac2[i] = '\\';
	//   75  124:aload           4
	//   76  126:iload_2         
	//   77  127:bipush          92
	//   78  129:castore         
				i++;
	//   79  130:iload_2         
	//   80  131:iconst_1        
	//   81  132:iadd            
	//   82  133:istore_2        
				ac2[i] = 'u';
	//   83  134:aload           4
	//   84  136:iload_2         
	//   85  137:bipush          117
	//   86  139:castore         
				if(c > '\377')
	//*  87  140:iload_1         
	//*  88  141:sipush          255
	//*  89  144:icmple          200
				{
					int j = c >> 8 & 0xff;
	//   90  147:iload_1         
	//   91  148:bipush          8
	//   92  150:ishr            
	//   93  151:sipush          255
	//   94  154:iand            
	//   95  155:istore_3        
					i++;
	//   96  156:iload_2         
	//   97  157:iconst_1        
	//   98  158:iadd            
	//   99  159:istore_2        
					char ac5[] = HEX_CHARS;
	//  100  160:getstatic       #29  <Field char[] HEX_CHARS>
	//  101  163:astore          5
					ac2[i] = ac5[j >> 4];
	//  102  165:aload           4
	//  103  167:iload_2         
	//  104  168:aload           5
	//  105  170:iload_3         
	//  106  171:iconst_4        
	//  107  172:ishr            
	//  108  173:caload          
	//  109  174:castore         
					i++;
	//  110  175:iload_2         
	//  111  176:iconst_1        
	//  112  177:iadd            
	//  113  178:istore_2        
					ac2[i] = ac5[j & 0xf];
	//  114  179:aload           4
	//  115  181:iload_2         
	//  116  182:aload           5
	//  117  184:iload_3         
	//  118  185:bipush          15
	//  119  187:iand            
	//  120  188:caload          
	//  121  189:castore         
					c &= '\377';
	//  122  190:iload_1         
	//  123  191:sipush          255
	//  124  194:iand            
	//  125  195:int2char        
	//  126  196:istore_1        
				} else
	//* 127  197:goto            220
				{
					i++;
	//  128  200:iload_2         
	//  129  201:iconst_1        
	//  130  202:iadd            
	//  131  203:istore_2        
					ac2[i] = '0';
	//  132  204:aload           4
	//  133  206:iload_2         
	//  134  207:bipush          48
	//  135  209:castore         
					i++;
	//  136  210:iload_2         
	//  137  211:iconst_1        
	//  138  212:iadd            
	//  139  213:istore_2        
					ac2[i] = '0';
	//  140  214:aload           4
	//  141  216:iload_2         
	//  142  217:bipush          48
	//  143  219:castore         
				}
				i++;
	//  144  220:iload_2         
	//  145  221:iconst_1        
	//  146  222:iadd            
	//  147  223:istore_2        
				char ac6[] = HEX_CHARS;
	//  148  224:getstatic       #29  <Field char[] HEX_CHARS>
	//  149  227:astore          5
				ac2[i] = ac6[c >> 4];
	//  150  229:aload           4
	//  151  231:iload_2         
	//  152  232:aload           5
	//  153  234:iload_1         
	//  154  235:iconst_4        
	//  155  236:ishr            
	//  156  237:caload          
	//  157  238:castore         
				ac2[i + 1] = ac6[c & 0xf];
	//  158  239:aload           4
	//  159  241:iload_2         
	//  160  242:iconst_1        
	//  161  243:iadd            
	//  162  244:aload           5
	//  163  246:iload_1         
	//  164  247:bipush          15
	//  165  249:iand            
	//  166  250:caload          
	//  167  251:castore         
				return;
	//  168  252:return          
			}
			char ac7[] = _entityBuffer;
	//  169  253:aload_0         
	//  170  254:getfield        #51  <Field char[] _entityBuffer>
	//  171  257:astore          5
			char ac3[] = ac7;
	//  172  259:aload           5
	//  173  261:astore          4
			if(ac7 == null)
	//* 174  263:aload           5
	//* 175  265:ifnonnull       274
				ac3 = _allocateEntityBuffer();
	//  176  268:aload_0         
	//  177  269:invokespecial   #101 <Method char[] _allocateEntityBuffer()>
	//  178  272:astore          4
			_outputHead = _outputTail;
	//  179  274:aload_0         
	//  180  275:aload_0         
	//  181  276:getfield        #59  <Field int _outputTail>
	//  182  279:putfield        #106 <Field int _outputHead>
			if(c > '\377')
	//* 183  282:iload_1         
	//* 184  283:sipush          255
	//* 185  286:icmple          369
			{
				i = c >> 8 & 0xff;
	//  186  289:iload_1         
	//  187  290:bipush          8
	//  188  292:ishr            
	//  189  293:sipush          255
	//  190  296:iand            
	//  191  297:istore_2        
				c &= '\377';
	//  192  298:iload_1         
	//  193  299:sipush          255
	//  194  302:iand            
	//  195  303:istore_1        
				char ac8[] = HEX_CHARS;
	//  196  304:getstatic       #29  <Field char[] HEX_CHARS>
	//  197  307:astore          5
				ac3[10] = ac8[i >> 4];
	//  198  309:aload           4
	//  199  311:bipush          10
	//  200  313:aload           5
	//  201  315:iload_2         
	//  202  316:iconst_4        
	//  203  317:ishr            
	//  204  318:caload          
	//  205  319:castore         
				ac3[11] = ac8[i & 0xf];
	//  206  320:aload           4
	//  207  322:bipush          11
	//  208  324:aload           5
	//  209  326:iload_2         
	//  210  327:bipush          15
	//  211  329:iand            
	//  212  330:caload          
	//  213  331:castore         
				ac3[12] = ac8[c >> 4];
	//  214  332:aload           4
	//  215  334:bipush          12
	//  216  336:aload           5
	//  217  338:iload_1         
	//  218  339:iconst_4        
	//  219  340:ishr            
	//  220  341:caload          
	//  221  342:castore         
				ac3[13] = ac8[c & 0xf];
	//  222  343:aload           4
	//  223  345:bipush          13
	//  224  347:aload           5
	//  225  349:iload_1         
	//  226  350:bipush          15
	//  227  352:iand            
	//  228  353:caload          
	//  229  354:castore         
				_writer.write(ac3, 8, 6);
	//  230  355:aload_0         
	//  231  356:getfield        #39  <Field Writer _writer>
	//  232  359:aload           4
	//  233  361:bipush          8
	//  234  363:bipush          6
	//  235  365:invokevirtual   #104 <Method void Writer.write(char[], int, int)>
				return;
	//  236  368:return          
			} else
			{
				char ac9[] = HEX_CHARS;
	//  237  369:getstatic       #29  <Field char[] HEX_CHARS>
	//  238  372:astore          5
				ac3[6] = ac9[c >> 4];
	//  239  374:aload           4
	//  240  376:bipush          6
	//  241  378:aload           5
	//  242  380:iload_1         
	//  243  381:iconst_4        
	//  244  382:ishr            
	//  245  383:caload          
	//  246  384:castore         
				ac3[7] = ac9[c & 0xf];
	//  247  385:aload           4
	//  248  387:bipush          7
	//  249  389:aload           5
	//  250  391:iload_1         
	//  251  392:bipush          15
	//  252  394:iand            
	//  253  395:caload          
	//  254  396:castore         
				_writer.write(ac3, 2, 6);
	//  255  397:aload_0         
	//  256  398:getfield        #39  <Field Writer _writer>
	//  257  401:aload           4
	//  258  403:iconst_2        
	//  259  404:bipush          6
	//  260  406:invokevirtual   #104 <Method void Writer.write(char[], int, int)>
				return;
	//  261  409:return          
			}
		}
		Object obj = ((Object) (_currentEscape));
	//  262  410:aload_0         
	//  263  411:getfield        #64  <Field SerializableString _currentEscape>
	//  264  414:astore          4
		if(obj == null)
	//* 265  416:aload           4
	//* 266  418:ifnonnull       439
		{
			obj = ((Object) (_characterEscapes.getEscapeSequence(((int) (c))).getValue()));
	//  267  421:aload_0         
	//  268  422:getfield        #68  <Field CharacterEscapes _characterEscapes>
	//  269  425:iload_1         
	//  270  426:invokevirtual   #74  <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//  271  429:invokeinterface #80  <Method String SerializableString.getValue()>
	//  272  434:astore          4
		} else
	//* 273  436:goto            453
		{
			obj = ((Object) (((SerializableString) (obj)).getValue()));
	//  274  439:aload           4
	//  275  441:invokeinterface #80  <Method String SerializableString.getValue()>
	//  276  446:astore          4
			_currentEscape = null;
	//  277  448:aload_0         
	//  278  449:aconst_null     
	//  279  450:putfield        #64  <Field SerializableString _currentEscape>
		}
		c = ((char) (((String) (obj)).length()));
	//  280  453:aload           4
	//  281  455:invokevirtual   #86  <Method int String.length()>
	//  282  458:istore_1        
		i = _outputTail;
	//  283  459:aload_0         
	//  284  460:getfield        #59  <Field int _outputTail>
	//  285  463:istore_2        
		if(i >= c)
	//* 286  464:iload_2         
	//* 287  465:iload_1         
	//* 288  466:icmplt          491
		{
			i -= ((int) (c));
	//  289  469:iload_2         
	//  290  470:iload_1         
	//  291  471:isub            
	//  292  472:istore_2        
			_outputHead = i;
	//  293  473:aload_0         
	//  294  474:iload_2         
	//  295  475:putfield        #106 <Field int _outputHead>
			((String) (obj)).getChars(0, ((int) (c)), _outputBuffer, i);
	//  296  478:aload           4
	//  297  480:iconst_0        
	//  298  481:iload_1         
	//  299  482:aload_0         
	//  300  483:getfield        #46  <Field char[] _outputBuffer>
	//  301  486:iload_2         
	//  302  487:invokevirtual   #96  <Method void String.getChars(int, int, char[], int)>
			return;
	//  303  490:return          
		} else
		{
			_outputHead = i;
	//  304  491:aload_0         
	//  305  492:iload_2         
	//  306  493:putfield        #106 <Field int _outputHead>
			_writer.write(((String) (obj)));
	//  307  496:aload_0         
	//  308  497:getfield        #39  <Field Writer _writer>
	//  309  500:aload           4
	//  310  502:invokevirtual   #92  <Method void Writer.write(String)>
			return;
	//  311  505:return          
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
	//   27   40:invokestatic    #114 <Method int Math.min(int, int)>
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
	//   41   63:invokevirtual   #120 <Method int InputStream.read(byte[], int, int)>
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
	//    1    1:invokevirtual   #62  <Method void _flushBuffer()>
		int l = s.length();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #86  <Method int String.length()>
	//    4    8:istore          5
		int i = 0;
	//    5   10:iconst_0        
	//    6   11:istore_2        
		do
		{
			int k = _outputEnd;
	//    7   12:aload_0         
	//    8   13:getfield        #48  <Field int _outputEnd>
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
	//   29   45:getfield        #46  <Field char[] _outputBuffer>
	//   30   48:iconst_0        
	//   31   49:invokevirtual   #96  <Method void String.getChars(int, int, char[], int)>
			if(_characterEscapes != null)
	//*  32   52:aload_0         
	//*  33   53:getfield        #68  <Field CharacterEscapes _characterEscapes>
	//*  34   56:ifnull          67
				_writeSegmentCustom(j);
	//   35   59:aload_0         
	//   36   60:iload_3         
	//   37   61:invokespecial   #125 <Method void _writeSegmentCustom(int)>
			else
	//*  38   64:goto            91
			if(_maximumNonEscapedChar != 0)
	//*  39   67:aload_0         
	//*  40   68:getfield        #128 <Field int _maximumNonEscapedChar>
	//*  41   71:ifeq            86
				_writeSegmentASCII(j, _maximumNonEscapedChar);
	//   42   74:aload_0         
	//   43   75:iload_3         
	//   44   76:aload_0         
	//   45   77:getfield        #128 <Field int _maximumNonEscapedChar>
	//   46   80:invokespecial   #132 <Method void _writeSegmentASCII(int, int)>
			else
	//*  47   83:goto            91
				_writeSegment(j);
	//   48   86:aload_0         
	//   49   87:iload_3         
	//   50   88:invokespecial   #135 <Method void _writeSegment(int)>
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
	//*   1    1:getfield        #59  <Field int _outputTail>
	//*   2    4:iconst_4        
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #48  <Field int _outputEnd>
	//*   6   10:icmplt          17
			_flushBuffer();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #62  <Method void _flushBuffer()>
		int i = _outputTail;
	//    9   17:aload_0         
	//   10   18:getfield        #59  <Field int _outputTail>
	//   11   21:istore_1        
		char ac[] = _outputBuffer;
	//   12   22:aload_0         
	//   13   23:getfield        #46  <Field char[] _outputBuffer>
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
	//   47   63:putfield        #59  <Field int _outputTail>
	//   48   66:return          
	}

	private void _writeQuotedInt(int i)
		throws IOException
	{
		if(_outputTail + 13 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field int _outputTail>
	//*   2    4:bipush          13
	//*   3    6:iadd            
	//*   4    7:aload_0         
	//*   5    8:getfield        #48  <Field int _outputEnd>
	//*   6   11:icmplt          18
			_flushBuffer();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #62  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//    9   18:aload_0         
	//   10   19:getfield        #46  <Field char[] _outputBuffer>
	//   11   22:astore_3        
		int j = _outputTail;
	//   12   23:aload_0         
	//   13   24:getfield        #59  <Field int _outputTail>
	//   14   27:istore_2        
		_outputTail = j + 1;
	//   15   28:aload_0         
	//   16   29:iload_2         
	//   17   30:iconst_1        
	//   18   31:iadd            
	//   19   32:putfield        #59  <Field int _outputTail>
		ac[j] = _quoteChar;
	//   20   35:aload_3         
	//   21   36:iload_2         
	//   22   37:aload_0         
	//   23   38:getfield        #37  <Field char _quoteChar>
	//   24   41:castore         
		_outputTail = NumberOutput.outputInt(i, ac, _outputTail);
	//   25   42:aload_0         
	//   26   43:iload_1         
	//   27   44:aload_3         
	//   28   45:aload_0         
	//   29   46:getfield        #59  <Field int _outputTail>
	//   30   49:invokestatic    #143 <Method int NumberOutput.outputInt(int, char[], int)>
	//   31   52:putfield        #59  <Field int _outputTail>
		ac = _outputBuffer;
	//   32   55:aload_0         
	//   33   56:getfield        #46  <Field char[] _outputBuffer>
	//   34   59:astore_3        
		i = _outputTail;
	//   35   60:aload_0         
	//   36   61:getfield        #59  <Field int _outputTail>
	//   37   64:istore_1        
		_outputTail = i + 1;
	//   38   65:aload_0         
	//   39   66:iload_1         
	//   40   67:iconst_1        
	//   41   68:iadd            
	//   42   69:putfield        #59  <Field int _outputTail>
		ac[i] = _quoteChar;
	//   43   72:aload_3         
	//   44   73:iload_1         
	//   45   74:aload_0         
	//   46   75:getfield        #37  <Field char _quoteChar>
	//   47   78:castore         
	//   48   79:return          
	}

	private void _writeQuotedLong(long l)
		throws IOException
	{
		if(_outputTail + 23 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field int _outputTail>
	//*   2    4:bipush          23
	//*   3    6:iadd            
	//*   4    7:aload_0         
	//*   5    8:getfield        #48  <Field int _outputEnd>
	//*   6   11:icmplt          18
			_flushBuffer();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #62  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//    9   18:aload_0         
	//   10   19:getfield        #46  <Field char[] _outputBuffer>
	//   11   22:astore          4
		int i = _outputTail;
	//   12   24:aload_0         
	//   13   25:getfield        #59  <Field int _outputTail>
	//   14   28:istore_3        
		_outputTail = i + 1;
	//   15   29:aload_0         
	//   16   30:iload_3         
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:putfield        #59  <Field int _outputTail>
		ac[i] = _quoteChar;
	//   20   36:aload           4
	//   21   38:iload_3         
	//   22   39:aload_0         
	//   23   40:getfield        #37  <Field char _quoteChar>
	//   24   43:castore         
		_outputTail = NumberOutput.outputLong(l, ac, _outputTail);
	//   25   44:aload_0         
	//   26   45:lload_1         
	//   27   46:aload           4
	//   28   48:aload_0         
	//   29   49:getfield        #59  <Field int _outputTail>
	//   30   52:invokestatic    #149 <Method int NumberOutput.outputLong(long, char[], int)>
	//   31   55:putfield        #59  <Field int _outputTail>
		ac = _outputBuffer;
	//   32   58:aload_0         
	//   33   59:getfield        #46  <Field char[] _outputBuffer>
	//   34   62:astore          4
		i = _outputTail;
	//   35   64:aload_0         
	//   36   65:getfield        #59  <Field int _outputTail>
	//   37   68:istore_3        
		_outputTail = i + 1;
	//   38   69:aload_0         
	//   39   70:iload_3         
	//   40   71:iconst_1        
	//   41   72:iadd            
	//   42   73:putfield        #59  <Field int _outputTail>
		ac[i] = _quoteChar;
	//   43   76:aload           4
	//   44   78:iload_3         
	//   45   79:aload_0         
	//   46   80:getfield        #37  <Field char _quoteChar>
	//   47   83:castore         
	//   48   84:return          
	}

	private void _writeQuotedRaw(String s)
		throws IOException
	{
		if(_outputTail >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field int _outputTail>
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field int _outputEnd>
	//*   4    8:icmplt          15
			_flushBuffer();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #62  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #46  <Field char[] _outputBuffer>
	//    9   19:astore_3        
		int i = _outputTail;
	//   10   20:aload_0         
	//   11   21:getfield        #59  <Field int _outputTail>
	//   12   24:istore_2        
		_outputTail = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #59  <Field int _outputTail>
		ac[i] = _quoteChar;
	//   18   32:aload_3         
	//   19   33:iload_2         
	//   20   34:aload_0         
	//   21   35:getfield        #37  <Field char _quoteChar>
	//   22   38:castore         
		writeRaw(s);
	//   23   39:aload_0         
	//   24   40:aload_1         
	//   25   41:invokevirtual   #153 <Method void writeRaw(String)>
		if(_outputTail >= _outputEnd)
	//*  26   44:aload_0         
	//*  27   45:getfield        #59  <Field int _outputTail>
	//*  28   48:aload_0         
	//*  29   49:getfield        #48  <Field int _outputEnd>
	//*  30   52:icmplt          59
			_flushBuffer();
	//   31   55:aload_0         
	//   32   56:invokevirtual   #62  <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//   33   59:aload_0         
	//   34   60:getfield        #46  <Field char[] _outputBuffer>
	//   35   63:astore_1        
		i = _outputTail;
	//   36   64:aload_0         
	//   37   65:getfield        #59  <Field int _outputTail>
	//   38   68:istore_2        
		_outputTail = i + 1;
	//   39   69:aload_0         
	//   40   70:iload_2         
	//   41   71:iconst_1        
	//   42   72:iadd            
	//   43   73:putfield        #59  <Field int _outputTail>
		s[i] = _quoteChar;
	//   44   76:aload_1         
	//   45   77:iload_2         
	//   46   78:aload_0         
	//   47   79:getfield        #37  <Field char _quoteChar>
	//   48   82:castore         
	//   49   83:return          
	}

	private void _writeQuotedShort(short word0)
		throws IOException
	{
		if(_outputTail + 8 >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field int _outputTail>
	//*   2    4:bipush          8
	//*   3    6:iadd            
	//*   4    7:aload_0         
	//*   5    8:getfield        #48  <Field int _outputEnd>
	//*   6   11:icmplt          18
			_flushBuffer();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #62  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//    9   18:aload_0         
	//   10   19:getfield        #46  <Field char[] _outputBuffer>
	//   11   22:astore_3        
		int i = _outputTail;
	//   12   23:aload_0         
	//   13   24:getfield        #59  <Field int _outputTail>
	//   14   27:istore_2        
		_outputTail = i + 1;
	//   15   28:aload_0         
	//   16   29:iload_2         
	//   17   30:iconst_1        
	//   18   31:iadd            
	//   19   32:putfield        #59  <Field int _outputTail>
		ac[i] = _quoteChar;
	//   20   35:aload_3         
	//   21   36:iload_2         
	//   22   37:aload_0         
	//   23   38:getfield        #37  <Field char _quoteChar>
	//   24   41:castore         
		_outputTail = NumberOutput.outputInt(((int) (word0)), ac, _outputTail);
	//   25   42:aload_0         
	//   26   43:iload_1         
	//   27   44:aload_3         
	//   28   45:aload_0         
	//   29   46:getfield        #59  <Field int _outputTail>
	//   30   49:invokestatic    #143 <Method int NumberOutput.outputInt(int, char[], int)>
	//   31   52:putfield        #59  <Field int _outputTail>
		ac = _outputBuffer;
	//   32   55:aload_0         
	//   33   56:getfield        #46  <Field char[] _outputBuffer>
	//   34   59:astore_3        
		word0 = ((short) (_outputTail));
	//   35   60:aload_0         
	//   36   61:getfield        #59  <Field int _outputTail>
	//   37   64:istore_1        
		_outputTail = word0 + 1;
	//   38   65:aload_0         
	//   39   66:iload_1         
	//   40   67:iconst_1        
	//   41   68:iadd            
	//   42   69:putfield        #59  <Field int _outputTail>
		ac[word0] = _quoteChar;
	//   43   72:aload_3         
	//   44   73:iload_1         
	//   45   74:aload_0         
	//   46   75:getfield        #37  <Field char _quoteChar>
	//   47   78:castore         
	//   48   79:return          
	}

	private void _writeSegment(int i)
		throws IOException
	{
		int ai[] = _outputEscapes;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field int[] _outputEscapes>
	//    2    4:astore          7
		int j1 = ai.length;
	//    3    6:aload           7
	//    4    8:arraylength     
	//    5    9:istore          6
		int j = 0;
	//    6   11:iconst_0        
	//    7   12:istore_3        
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
	//   14   22:getfield        #46  <Field char[] _outputBuffer>
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
	//   44   73:getfield        #39  <Field Writer _writer>
	//   45   76:aload_0         
	//   46   77:getfield        #46  <Field char[] _outputBuffer>
	//   47   80:iload           4
	//   48   82:iload           5
	//   49   84:invokevirtual   #104 <Method void Writer.write(char[], int, int)>
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
	//   60   99:getfield        #46  <Field char[] _outputBuffer>
	//   61  102:iload_3         
	//   62  103:iload_1         
	//   63  104:iload_2         
	//   64  105:aload           7
	//   65  107:iload_2         
	//   66  108:iaload          
	//   67  109:invokespecial   #161 <Method int _prependOrWriteCharacterEscape(char[], int, int, char, int)>
	//   68  112:istore          4
	//*  69  114:goto            16
	//   70  117:return          
	}

	private void _writeSegmentASCII(int i, int j)
		throws IOException, JsonGenerationException
	{
		int ai[] = _outputEscapes;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field int[] _outputEscapes>
	//    2    4:astore          10
		int l1 = Math.min(ai.length, j + 1);
	//    3    6:aload           10
	//    4    8:arraylength     
	//    5    9:iload_2         
	//    6   10:iconst_1        
	//    7   11:iadd            
	//    8   12:invokestatic    #114 <Method int Math.min(int, int)>
	//    9   15:istore          9
		int l = 0;
	//   10   17:iconst_0        
	//   11   18:istore          5
		int i1 = 0;
	//   12   20:iconst_0        
	//   13   21:istore          6
		int k = 0;
	//   14   23:iconst_0        
	//   15   24:istore          4
		while(l < i) 
	//*  16   26:iload           5
	//*  17   28:iload_1         
	//*  18   29:icmpge          186
		{
			int j1 = k;
	//   19   32:iload           4
	//   20   34:istore          7
			k = l;
	//   21   36:iload           5
	//   22   38:istore          4
			char c;
			int k1;
			do
			{
				c = _outputBuffer[k];
	//   23   40:aload_0         
	//   24   41:getfield        #46  <Field char[] _outputBuffer>
	//   25   44:iload           4
	//   26   46:caload          
	//   27   47:istore_3        
				if(c < l1)
	//*  28   48:iload_3         
	//*  29   49:iload           9
	//*  30   51:icmpge          80
				{
					j1 = ai[c];
	//   31   54:aload           10
	//   32   56:iload_3         
	//   33   57:iaload          
	//   34   58:istore          7
					l = j1;
	//   35   60:iload           7
	//   36   62:istore          5
					if(j1 != 0)
	//*  37   64:iload           7
	//*  38   66:ifeq            103
					{
						k1 = k;
	//   39   69:iload           4
	//   40   71:istore          8
						k = j1;
	//   41   73:iload           7
	//   42   75:istore          4
						break;
	//   43   77:goto            127
					}
				} else
				{
					l = j1;
	//   44   80:iload           7
	//   45   82:istore          5
					if(c > j)
	//*  46   84:iload_3         
	//*  47   85:iload_2         
	//*  48   86:icmple          103
					{
						l = -1;
	//   49   89:iconst_m1       
	//   50   90:istore          5
						k1 = k;
	//   51   92:iload           4
	//   52   94:istore          8
						k = l;
	//   53   96:iload           5
	//   54   98:istore          4
						break;
	//   55  100:goto            127
					}
				}
				k1 = k + 1;
	//   56  103:iload           4
	//   57  105:iconst_1        
	//   58  106:iadd            
	//   59  107:istore          8
				k = k1;
	//   60  109:iload           8
	//   61  111:istore          4
				j1 = l;
	//   62  113:iload           5
	//   63  115:istore          7
				if(k1 < i)
					continue;
	//   64  117:iload           8
	//   65  119:iload_1         
	//   66  120:icmplt          40
				k = l;
	//   67  123:iload           5
	//   68  125:istore          4
				break;
			} while(true);
			l = k1 - i1;
	//   69  127:iload           8
	//   70  129:iload           6
	//   71  131:isub            
	//   72  132:istore          5
			if(l > 0)
	//*  73  134:iload           5
	//*  74  136:ifle            161
			{
				_writer.write(_outputBuffer, i1, l);
	//   75  139:aload_0         
	//   76  140:getfield        #39  <Field Writer _writer>
	//   77  143:aload_0         
	//   78  144:getfield        #46  <Field char[] _outputBuffer>
	//   79  147:iload           6
	//   80  149:iload           5
	//   81  151:invokevirtual   #104 <Method void Writer.write(char[], int, int)>
				if(k1 >= i)
	//*  82  154:iload           8
	//*  83  156:iload_1         
	//*  84  157:icmplt          161
					return;
	//   85  160:return          
			}
			l = k1 + 1;
	//   86  161:iload           8
	//   87  163:iconst_1        
	//   88  164:iadd            
	//   89  165:istore          5
			i1 = _prependOrWriteCharacterEscape(_outputBuffer, l, i, c, k);
	//   90  167:aload_0         
	//   91  168:aload_0         
	//   92  169:getfield        #46  <Field char[] _outputBuffer>
	//   93  172:iload           5
	//   94  174:iload_1         
	//   95  175:iload_3         
	//   96  176:iload           4
	//   97  178:invokespecial   #161 <Method int _prependOrWriteCharacterEscape(char[], int, int, char, int)>
	//   98  181:istore          6
		}
	//*  99  183:goto            26
	//  100  186:return          
	}

	private void _writeSegmentCustom(int i)
		throws IOException, JsonGenerationException
	{
		int ai[] = _outputEscapes;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field int[] _outputEscapes>
	//    2    4:astore          10
		int l;
		if(_maximumNonEscapedChar < 1)
	//*   3    6:aload_0         
	//*   4    7:getfield        #128 <Field int _maximumNonEscapedChar>
	//*   5   10:iconst_1        
	//*   6   11:icmpge          21
			l = 65535;
	//    7   14:ldc1            #162 <Int 65535>
	//    8   16:istore          5
		else
	//*   9   18:goto            27
			l = _maximumNonEscapedChar;
	//   10   21:aload_0         
	//   11   22:getfield        #128 <Field int _maximumNonEscapedChar>
	//   12   25:istore          5
		int l1 = Math.min(ai.length, l + 1);
	//   13   27:aload           10
	//   14   29:arraylength     
	//   15   30:iload           5
	//   16   32:iconst_1        
	//   17   33:iadd            
	//   18   34:invokestatic    #114 <Method int Math.min(int, int)>
	//   19   37:istore          9
		CharacterEscapes characterescapes = _characterEscapes;
	//   20   39:aload_0         
	//   21   40:getfield        #68  <Field CharacterEscapes _characterEscapes>
	//   22   43:astore          11
		int k = 0;
	//   23   45:iconst_0        
	//   24   46:istore          4
		int i1 = 0;
	//   25   48:iconst_0        
	//   26   49:istore          6
		int j = 0;
	//   27   51:iconst_0        
	//   28   52:istore_3        
		while(k < i) 
	//*  29   53:iload           4
	//*  30   55:iload_1         
	//*  31   56:icmpge          239
		{
			int j1 = j;
	//   32   59:iload_3         
	//   33   60:istore          7
			j = k;
	//   34   62:iload           4
	//   35   64:istore_3        
			char c;
			do
			{
				c = _outputBuffer[j];
	//   36   65:aload_0         
	//   37   66:getfield        #46  <Field char[] _outputBuffer>
	//   38   69:iload_3         
	//   39   70:caload          
	//   40   71:istore_2        
				if(c < l1)
	//*  41   72:iload_2         
	//*  42   73:iload           9
	//*  43   75:icmpge          102
				{
					j1 = ai[c];
	//   44   78:aload           10
	//   45   80:iload_2         
	//   46   81:iaload          
	//   47   82:istore          7
					k = j1;
	//   48   84:iload           7
	//   49   86:istore          4
					if(j1 != 0)
	//*  50   88:iload           7
	//*  51   90:ifeq            156
					{
						k = j;
	//   52   93:iload_3         
	//   53   94:istore          4
						j = j1;
	//   54   96:iload           7
	//   55   98:istore_3        
						break;
	//   56   99:goto            181
					}
				} else
				{
					if(c > l)
	//*  57  102:iload_2         
	//*  58  103:iload           5
	//*  59  105:icmple          120
					{
						j1 = -1;
	//   60  108:iconst_m1       
	//   61  109:istore          7
						k = j;
	//   62  111:iload_3         
	//   63  112:istore          4
						j = j1;
	//   64  114:iload           7
	//   65  116:istore_3        
						break;
	//   66  117:goto            181
					}
					SerializableString serializablestring = characterescapes.getEscapeSequence(((int) (c)));
	//   67  120:aload           11
	//   68  122:iload_2         
	//   69  123:invokevirtual   #74  <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//   70  126:astore          12
					_currentEscape = serializablestring;
	//   71  128:aload_0         
	//   72  129:aload           12
	//   73  131:putfield        #64  <Field SerializableString _currentEscape>
					k = j1;
	//   74  134:iload           7
	//   75  136:istore          4
					if(serializablestring != null)
	//*  76  138:aload           12
	//*  77  140:ifnull          156
					{
						j1 = -2;
	//   78  143:bipush          -2
	//   79  145:istore          7
						k = j;
	//   80  147:iload_3         
	//   81  148:istore          4
						j = j1;
	//   82  150:iload           7
	//   83  152:istore_3        
						break;
	//   84  153:goto            181
					}
				}
				int k1 = j + 1;
	//   85  156:iload_3         
	//   86  157:iconst_1        
	//   87  158:iadd            
	//   88  159:istore          8
				j = k1;
	//   89  161:iload           8
	//   90  163:istore_3        
				j1 = k;
	//   91  164:iload           4
	//   92  166:istore          7
				if(k1 < i)
					continue;
	//   93  168:iload           8
	//   94  170:iload_1         
	//   95  171:icmplt          65
				j = k;
	//   96  174:iload           4
	//   97  176:istore_3        
				k = k1;
	//   98  177:iload           8
	//   99  179:istore          4
				break;
			} while(true);
			j1 = k - i1;
	//  100  181:iload           4
	//  101  183:iload           6
	//  102  185:isub            
	//  103  186:istore          7
			if(j1 > 0)
	//* 104  188:iload           7
	//* 105  190:ifle            215
			{
				_writer.write(_outputBuffer, i1, j1);
	//  106  193:aload_0         
	//  107  194:getfield        #39  <Field Writer _writer>
	//  108  197:aload_0         
	//  109  198:getfield        #46  <Field char[] _outputBuffer>
	//  110  201:iload           6
	//  111  203:iload           7
	//  112  205:invokevirtual   #104 <Method void Writer.write(char[], int, int)>
				if(k >= i)
	//* 113  208:iload           4
	//* 114  210:iload_1         
	//* 115  211:icmplt          215
					return;
	//  116  214:return          
			}
			k++;
	//  117  215:iload           4
	//  118  217:iconst_1        
	//  119  218:iadd            
	//  120  219:istore          4
			i1 = _prependOrWriteCharacterEscape(_outputBuffer, k, i, c, j);
	//  121  221:aload_0         
	//  122  222:aload_0         
	//  123  223:getfield        #46  <Field char[] _outputBuffer>
	//  124  226:iload           4
	//  125  228:iload_1         
	//  126  229:iload_2         
	//  127  230:iload_3         
	//  128  231:invokespecial   #161 <Method int _prependOrWriteCharacterEscape(char[], int, int, char, int)>
	//  129  234:istore          6
		}
	//* 130  236:goto            53
	//  131  239:return          
	}

	private void _writeString(String s)
		throws IOException
	{
		int i = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #86  <Method int String.length()>
	//    2    4:istore_2        
		int j = _outputEnd;
	//    3    5:aload_0         
	//    4    6:getfield        #48  <Field int _outputEnd>
	//    5    9:istore_3        
		if(i > j)
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmple          21
		{
			_writeLongString(s);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokespecial   #165 <Method void _writeLongString(String)>
			return;
	//   12   20:return          
		}
		if(_outputTail + i > j)
	//*  13   21:aload_0         
	//*  14   22:getfield        #59  <Field int _outputTail>
	//*  15   25:iload_2         
	//*  16   26:iadd            
	//*  17   27:iload_3         
	//*  18   28:icmple          35
			_flushBuffer();
	//   19   31:aload_0         
	//   20   32:invokevirtual   #62  <Method void _flushBuffer()>
		s.getChars(0, i, _outputBuffer, _outputTail);
	//   21   35:aload_1         
	//   22   36:iconst_0        
	//   23   37:iload_2         
	//   24   38:aload_0         
	//   25   39:getfield        #46  <Field char[] _outputBuffer>
	//   26   42:aload_0         
	//   27   43:getfield        #59  <Field int _outputTail>
	//   28   46:invokevirtual   #96  <Method void String.getChars(int, int, char[], int)>
		if(_characterEscapes != null)
	//*  29   49:aload_0         
	//*  30   50:getfield        #68  <Field CharacterEscapes _characterEscapes>
	//*  31   53:ifnull          62
		{
			_writeStringCustom(i);
	//   32   56:aload_0         
	//   33   57:iload_2         
	//   34   58:invokespecial   #168 <Method void _writeStringCustom(int)>
			return;
	//   35   61:return          
		}
		if(_maximumNonEscapedChar != 0)
	//*  36   62:aload_0         
	//*  37   63:getfield        #128 <Field int _maximumNonEscapedChar>
	//*  38   66:ifeq            79
		{
			_writeStringASCII(i, _maximumNonEscapedChar);
	//   39   69:aload_0         
	//   40   70:iload_2         
	//   41   71:aload_0         
	//   42   72:getfield        #128 <Field int _maximumNonEscapedChar>
	//   43   75:invokespecial   #171 <Method void _writeStringASCII(int, int)>
			return;
	//   44   78:return          
		} else
		{
			_writeString2(i);
	//   45   79:aload_0         
	//   46   80:iload_2         
	//   47   81:invokespecial   #174 <Method void _writeString2(int)>
			return;
	//   48   84:return          
		}
	}

	private void _writeString(char ac[], int i, int j)
		throws IOException
	{
		if(_characterEscapes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field CharacterEscapes _characterEscapes>
	//*   2    4:ifnull          15
		{
			_writeStringCustom(ac, i, j);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokespecial   #176 <Method void _writeStringCustom(char[], int, int)>
			return;
	//    8   14:return          
		}
		if(_maximumNonEscapedChar != 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #128 <Field int _maximumNonEscapedChar>
	//*  11   19:ifeq            34
		{
			_writeStringASCII(ac, i, j, _maximumNonEscapedChar);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:iload_2         
	//   15   25:iload_3         
	//   16   26:aload_0         
	//   17   27:getfield        #128 <Field int _maximumNonEscapedChar>
	//   18   30:invokespecial   #179 <Method void _writeStringASCII(char[], int, int, int)>
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
	//   25   40:getfield        #159 <Field int[] _outputEscapes>
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
	//*  66  112:getfield        #59  <Field int _outputTail>
	//*  67  115:iload           5
	//*  68  117:iadd            
	//*  69  118:aload_0         
	//*  70  119:getfield        #48  <Field int _outputEnd>
	//*  71  122:icmple          129
					_flushBuffer();
	//   72  125:aload_0         
	//   73  126:invokevirtual   #62  <Method void _flushBuffer()>
				if(l > 0)
	//*  74  129:iload           5
	//*  75  131:ifle            178
				{
					System.arraycopy(((Object) (ac)), i, ((Object) (_outputBuffer)), _outputTail, l);
	//   76  134:aload_1         
	//   77  135:iload_2         
	//   78  136:aload_0         
	//   79  137:getfield        #46  <Field char[] _outputBuffer>
	//   80  140:aload_0         
	//   81  141:getfield        #59  <Field int _outputTail>
	//   82  144:iload           5
	//   83  146:invokestatic    #185 <Method void System.arraycopy(Object, int, Object, int, int)>
					_outputTail = _outputTail + l;
	//   84  149:aload_0         
	//   85  150:aload_0         
	//   86  151:getfield        #59  <Field int _outputTail>
	//   87  154:iload           5
	//   88  156:iadd            
	//   89  157:putfield        #59  <Field int _outputTail>
				}
			} else
	//*  90  160:goto            178
			{
				_flushBuffer();
	//   91  163:aload_0         
	//   92  164:invokevirtual   #62  <Method void _flushBuffer()>
				_writer.write(ac, i, l);
	//   93  167:aload_0         
	//   94  168:getfield        #39  <Field Writer _writer>
	//   95  171:aload_1         
	//   96  172:iload_2         
	//   97  173:iload           5
	//   98  175:invokevirtual   #104 <Method void Writer.write(char[], int, int)>
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
	//  116  202:invokespecial   #187 <Method void _appendCharacterEscape(char, int)>
		}
	//* 117  205:goto            50
	//  118  208:return          
	}

	private void _writeString2(int i)
		throws IOException
	{
		i = _outputTail + i;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int _outputTail>
	//    2    4:iload_1         
	//    3    5:iadd            
	//    4    6:istore_1        
		int ai[] = _outputEscapes;
	//    5    7:aload_0         
	//    6    8:getfield        #159 <Field int[] _outputEscapes>
	//    7   11:astore          6
		int j = ai.length;
	//    8   13:aload           6
	//    9   15:arraylength     
	//   10   16:istore_3        
label0:
		do
		{
			int k;
			if(_outputTail < i)
	//*  11   17:aload_0         
	//*  12   18:getfield        #59  <Field int _outputTail>
	//*  13   21:iload_1         
	//*  14   22:icmpge          147
				do
				{
					char ac[] = _outputBuffer;
	//   15   25:aload_0         
	//   16   26:getfield        #46  <Field char[] _outputBuffer>
	//   17   29:astore          7
					k = _outputTail;
	//   18   31:aload_0         
	//   19   32:getfield        #59  <Field int _outputTail>
	//   20   35:istore          4
					char c1 = ac[k];
	//   21   37:aload           7
	//   22   39:iload           4
	//   23   41:caload          
	//   24   42:istore          5
					if(c1 < j && ai[c1] != 0)
	//*  25   44:iload           5
	//*  26   46:iload_3         
	//*  27   47:icmpge          127
	//*  28   50:aload           6
	//*  29   52:iload           5
	//*  30   54:iaload          
	//*  31   55:ifeq            127
					{
						int l = _outputHead;
	//   32   58:aload_0         
	//   33   59:getfield        #106 <Field int _outputHead>
	//   34   62:istore          5
						k -= l;
	//   35   64:iload           4
	//   36   66:iload           5
	//   37   68:isub            
	//   38   69:istore          4
						if(k > 0)
	//*  39   71:iload           4
	//*  40   73:ifle            89
							_writer.write(ac, l, k);
	//   41   76:aload_0         
	//   42   77:getfield        #39  <Field Writer _writer>
	//   43   80:aload           7
	//   44   82:iload           5
	//   45   84:iload           4
	//   46   86:invokevirtual   #104 <Method void Writer.write(char[], int, int)>
						ac = _outputBuffer;
	//   47   89:aload_0         
	//   48   90:getfield        #46  <Field char[] _outputBuffer>
	//   49   93:astore          7
						k = _outputTail;
	//   50   95:aload_0         
	//   51   96:getfield        #59  <Field int _outputTail>
	//   52   99:istore          4
						_outputTail = k + 1;
	//   53  101:aload_0         
	//   54  102:iload           4
	//   55  104:iconst_1        
	//   56  105:iadd            
	//   57  106:putfield        #59  <Field int _outputTail>
						char c = ac[k];
	//   58  109:aload           7
	//   59  111:iload           4
	//   60  113:caload          
	//   61  114:istore_2        
						_prependOrWriteCharacterEscape(c, ai[c]);
	//   62  115:aload_0         
	//   63  116:iload_2         
	//   64  117:aload           6
	//   65  119:iload_2         
	//   66  120:iaload          
	//   67  121:invokespecial   #189 <Method void _prependOrWriteCharacterEscape(char, int)>
						continue label0;
	//   68  124:goto            17
					}
					k = _outputTail + 1;
	//   69  127:aload_0         
	//   70  128:getfield        #59  <Field int _outputTail>
	//   71  131:iconst_1        
	//   72  132:iadd            
	//   73  133:istore          4
					_outputTail = k;
	//   74  135:aload_0         
	//   75  136:iload           4
	//   76  138:putfield        #59  <Field int _outputTail>
				} while(k < i);
	//   77  141:iload           4
	//   78  143:iload_1         
	//   79  144:icmplt          25
			return;
	//   80  147:return          
		} while(true);
	}

	private void _writeStringASCII(int i, int j)
		throws IOException, JsonGenerationException
	{
		int k = _outputTail + i;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int _outputTail>
	//    2    4:iload_1         
	//    3    5:iadd            
	//    4    6:istore          4
		int ai[] = _outputEscapes;
	//    5    8:aload_0         
	//    6    9:getfield        #159 <Field int[] _outputEscapes>
	//    7   12:astore          8
		int l = Math.min(ai.length, j + 1);
	//    8   14:aload           8
	//    9   16:arraylength     
	//   10   17:iload_2         
	//   11   18:iconst_1        
	//   12   19:iadd            
	//   13   20:invokestatic    #114 <Method int Math.min(int, int)>
	//   14   23:istore          5
label0:
		do
		{
			if(_outputTail < k)
	//*  15   25:aload_0         
	//*  16   26:getfield        #59  <Field int _outputTail>
	//*  17   29:iload           4
	//*  18   31:icmpge          145
				do
				{
label1:
					{
						char c = _outputBuffer[_outputTail];
	//   19   34:aload_0         
	//   20   35:getfield        #46  <Field char[] _outputBuffer>
	//   21   38:aload_0         
	//   22   39:getfield        #59  <Field int _outputTail>
	//   23   42:caload          
	//   24   43:istore_3        
						if(c < l)
	//*  25   44:iload_3         
	//*  26   45:iload           5
	//*  27   47:icmpge          62
						{
							i = ai[c];
	//   28   50:aload           8
	//   29   52:iload_3         
	//   30   53:iaload          
	//   31   54:istore_1        
							if(i == 0)
	//*  32   55:iload_1         
	//*  33   56:ifeq            127
								break label1;
	//   34   59:goto            69
						} else
						{
							if(c <= j)
								break label1;
	//   35   62:iload_3         
	//   36   63:iload_2         
	//   37   64:icmple          127
							i = -1;
	//   38   67:iconst_m1       
	//   39   68:istore_1        
						}
						int j1 = _outputTail;
	//   40   69:aload_0         
	//   41   70:getfield        #59  <Field int _outputTail>
	//   42   73:istore          7
						int i1 = _outputHead;
	//   43   75:aload_0         
	//   44   76:getfield        #106 <Field int _outputHead>
	//   45   79:istore          6
						j1 -= i1;
	//   46   81:iload           7
	//   47   83:iload           6
	//   48   85:isub            
	//   49   86:istore          7
						if(j1 > 0)
	//*  50   88:iload           7
	//*  51   90:ifle            108
							_writer.write(_outputBuffer, i1, j1);
	//   52   93:aload_0         
	//   53   94:getfield        #39  <Field Writer _writer>
	//   54   97:aload_0         
	//   55   98:getfield        #46  <Field char[] _outputBuffer>
	//   56  101:iload           6
	//   57  103:iload           7
	//   58  105:invokevirtual   #104 <Method void Writer.write(char[], int, int)>
						_outputTail = _outputTail + 1;
	//   59  108:aload_0         
	//   60  109:aload_0         
	//   61  110:getfield        #59  <Field int _outputTail>
	//   62  113:iconst_1        
	//   63  114:iadd            
	//   64  115:putfield        #59  <Field int _outputTail>
						_prependOrWriteCharacterEscape(c, i);
	//   65  118:aload_0         
	//   66  119:iload_3         
	//   67  120:iload_1         
	//   68  121:invokespecial   #189 <Method void _prependOrWriteCharacterEscape(char, int)>
						continue label0;
	//   69  124:goto            25
					}
					i = _outputTail + 1;
	//   70  127:aload_0         
	//   71  128:getfield        #59  <Field int _outputTail>
	//   72  131:iconst_1        
	//   73  132:iadd            
	//   74  133:istore_1        
					_outputTail = i;
	//   75  134:aload_0         
	//   76  135:iload_1         
	//   77  136:putfield        #59  <Field int _outputTail>
				} while(i < k);
	//   78  139:iload_1         
	//   79  140:iload           4
	//   80  142:icmplt          34
			return;
	//   81  145:return          
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
	//    5    6:getfield        #159 <Field int[] _outputEscapes>
	//    6    9:astore          11
		int i2 = Math.min(ai.length, k + 1);
	//    7   11:aload           11
	//    8   13:arraylength     
	//    9   14:iload           4
	//   10   16:iconst_1        
	//   11   17:iadd            
	//   12   18:invokestatic    #114 <Method int Math.min(int, int)>
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
	//*  80  138:getfield        #59  <Field int _outputTail>
	//*  81  141:iload           6
	//*  82  143:iadd            
	//*  83  144:aload_0         
	//*  84  145:getfield        #48  <Field int _outputEnd>
	//*  85  148:icmple          155
					_flushBuffer();
	//   86  151:aload_0         
	//   87  152:invokevirtual   #62  <Method void _flushBuffer()>
				if(i1 > 0)
	//*  88  155:iload           6
	//*  89  157:ifle            204
				{
					System.arraycopy(((Object) (ac)), j, ((Object) (_outputBuffer)), _outputTail, i1);
	//   90  160:aload_1         
	//   91  161:iload_3         
	//   92  162:aload_0         
	//   93  163:getfield        #46  <Field char[] _outputBuffer>
	//   94  166:aload_0         
	//   95  167:getfield        #59  <Field int _outputTail>
	//   96  170:iload           6
	//   97  172:invokestatic    #185 <Method void System.arraycopy(Object, int, Object, int, int)>
					_outputTail = _outputTail + i1;
	//   98  175:aload_0         
	//   99  176:aload_0         
	//  100  177:getfield        #59  <Field int _outputTail>
	//  101  180:iload           6
	//  102  182:iadd            
	//  103  183:putfield        #59  <Field int _outputTail>
				}
			} else
	//* 104  186:goto            204
			{
				_flushBuffer();
	//  105  189:aload_0         
	//  106  190:invokevirtual   #62  <Method void _flushBuffer()>
				_writer.write(ac, j, i1);
	//  107  193:aload_0         
	//  108  194:getfield        #39  <Field Writer _writer>
	//  109  197:aload_1         
	//  110  198:iload_3         
	//  111  199:iload           6
	//  112  201:invokevirtual   #104 <Method void Writer.write(char[], int, int)>
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
	//  124  221:invokespecial   #187 <Method void _appendCharacterEscape(char, int)>
		}
	//* 125  224:goto            31
	//  126  227:return          
	}

	private void _writeStringCustom(int i)
		throws IOException, JsonGenerationException
	{
		int k = _outputTail + i;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int _outputTail>
	//    2    4:iload_1         
	//    3    5:iadd            
	//    4    6:istore          4
		int ai[] = _outputEscapes;
	//    5    8:aload_0         
	//    6    9:getfield        #159 <Field int[] _outputEscapes>
	//    7   12:astore          8
		int j;
		if(_maximumNonEscapedChar < 1)
	//*   8   14:aload_0         
	//*   9   15:getfield        #128 <Field int _maximumNonEscapedChar>
	//*  10   18:iconst_1        
	//*  11   19:icmpge          28
			j = 65535;
	//   12   22:ldc1            #162 <Int 65535>
	//   13   24:istore_3        
		else
	//*  14   25:goto            33
			j = _maximumNonEscapedChar;
	//   15   28:aload_0         
	//   16   29:getfield        #128 <Field int _maximumNonEscapedChar>
	//   17   32:istore_3        
		int l = Math.min(ai.length, j + 1);
	//   18   33:aload           8
	//   19   35:arraylength     
	//   20   36:iload_3         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:invokestatic    #114 <Method int Math.min(int, int)>
	//   24   42:istore          5
		CharacterEscapes characterescapes = _characterEscapes;
	//   25   44:aload_0         
	//   26   45:getfield        #68  <Field CharacterEscapes _characterEscapes>
	//   27   48:astore          9
label0:
		do
		{
			if(_outputTail < k)
	//*  28   50:aload_0         
	//*  29   51:getfield        #59  <Field int _outputTail>
	//*  30   54:iload           4
	//*  31   56:icmpge          195
				do
				{
label1:
					{
						char c = _outputBuffer[_outputTail];
	//   32   59:aload_0         
	//   33   60:getfield        #46  <Field char[] _outputBuffer>
	//   34   63:aload_0         
	//   35   64:getfield        #59  <Field int _outputTail>
	//   36   67:caload          
	//   37   68:istore_2        
						if(c < l)
	//*  38   69:iload_2         
	//*  39   70:iload           5
	//*  40   72:icmpge          87
						{
							i = ai[c];
	//   41   75:aload           8
	//   42   77:iload_2         
	//   43   78:iaload          
	//   44   79:istore_1        
							if(i == 0)
	//*  45   80:iload_1         
	//*  46   81:ifeq            177
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
	//   54   97:aload           9
	//   55   99:iload_2         
	//   56  100:invokevirtual   #74  <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//   57  103:astore          10
							_currentEscape = serializablestring;
	//   58  105:aload_0         
	//   59  106:aload           10
	//   60  108:putfield        #64  <Field SerializableString _currentEscape>
							if(serializablestring == null)
								break label1;
	//   61  111:aload           10
	//   62  113:ifnull          177
							i = -2;
	//   63  116:bipush          -2
	//   64  118:istore_1        
						}
						int j1 = _outputTail;
	//   65  119:aload_0         
	//   66  120:getfield        #59  <Field int _outputTail>
	//   67  123:istore          7
						int i1 = _outputHead;
	//   68  125:aload_0         
	//   69  126:getfield        #106 <Field int _outputHead>
	//   70  129:istore          6
						j1 -= i1;
	//   71  131:iload           7
	//   72  133:iload           6
	//   73  135:isub            
	//   74  136:istore          7
						if(j1 > 0)
	//*  75  138:iload           7
	//*  76  140:ifle            158
							_writer.write(_outputBuffer, i1, j1);
	//   77  143:aload_0         
	//   78  144:getfield        #39  <Field Writer _writer>
	//   79  147:aload_0         
	//   80  148:getfield        #46  <Field char[] _outputBuffer>
	//   81  151:iload           6
	//   82  153:iload           7
	//   83  155:invokevirtual   #104 <Method void Writer.write(char[], int, int)>
						_outputTail = _outputTail + 1;
	//   84  158:aload_0         
	//   85  159:aload_0         
	//   86  160:getfield        #59  <Field int _outputTail>
	//   87  163:iconst_1        
	//   88  164:iadd            
	//   89  165:putfield        #59  <Field int _outputTail>
						_prependOrWriteCharacterEscape(c, i);
	//   90  168:aload_0         
	//   91  169:iload_2         
	//   92  170:iload_1         
	//   93  171:invokespecial   #189 <Method void _prependOrWriteCharacterEscape(char, int)>
						continue label0;
	//   94  174:goto            50
					}
					i = _outputTail + 1;
	//   95  177:aload_0         
	//   96  178:getfield        #59  <Field int _outputTail>
	//   97  181:iconst_1        
	//   98  182:iadd            
	//   99  183:istore_1        
					_outputTail = i;
	//  100  184:aload_0         
	//  101  185:iload_1         
	//  102  186:putfield        #59  <Field int _outputTail>
				} while(i < k);
	//  103  189:iload_1         
	//  104  190:iload           4
	//  105  192:icmplt          59
			return;
	//  106  195:return          
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
	//    5    6:getfield        #159 <Field int[] _outputEscapes>
	//    6    9:astore          11
		int l;
		if(_maximumNonEscapedChar < 1)
	//*   7   11:aload_0         
	//*   8   12:getfield        #128 <Field int _maximumNonEscapedChar>
	//*   9   15:iconst_1        
	//*  10   16:icmpge          26
			l = 65535;
	//   11   19:ldc1            #162 <Int 65535>
	//   12   21:istore          6
		else
	//*  13   23:goto            32
			l = _maximumNonEscapedChar;
	//   14   26:aload_0         
	//   15   27:getfield        #128 <Field int _maximumNonEscapedChar>
	//   16   30:istore          6
		int l1 = Math.min(ai.length, l + 1);
	//   17   32:aload           11
	//   18   34:arraylength     
	//   19   35:iload           6
	//   20   37:iconst_1        
	//   21   38:iadd            
	//   22   39:invokestatic    #114 <Method int Math.min(int, int)>
	//   23   42:istore          10
		CharacterEscapes characterescapes = _characterEscapes;
	//   24   44:aload_0         
	//   25   45:getfield        #68  <Field CharacterEscapes _characterEscapes>
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
	//   72  129:invokevirtual   #74  <Method SerializableString CharacterEscapes.getEscapeSequence(int)>
	//   73  132:astore          13
					_currentEscape = serializablestring;
	//   74  134:aload_0         
	//   75  135:aload           13
	//   76  137:putfield        #64  <Field SerializableString _currentEscape>
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
	//* 111  202:getfield        #59  <Field int _outputTail>
	//* 112  205:iload           7
	//* 113  207:iadd            
	//* 114  208:aload_0         
	//* 115  209:getfield        #48  <Field int _outputEnd>
	//* 116  212:icmple          219
					_flushBuffer();
	//  117  215:aload_0         
	//  118  216:invokevirtual   #62  <Method void _flushBuffer()>
				if(i1 > 0)
	//* 119  219:iload           7
	//* 120  221:ifle            268
				{
					System.arraycopy(((Object) (ac)), j, ((Object) (_outputBuffer)), _outputTail, i1);
	//  121  224:aload_1         
	//  122  225:iload_3         
	//  123  226:aload_0         
	//  124  227:getfield        #46  <Field char[] _outputBuffer>
	//  125  230:aload_0         
	//  126  231:getfield        #59  <Field int _outputTail>
	//  127  234:iload           7
	//  128  236:invokestatic    #185 <Method void System.arraycopy(Object, int, Object, int, int)>
					_outputTail = _outputTail + i1;
	//  129  239:aload_0         
	//  130  240:aload_0         
	//  131  241:getfield        #59  <Field int _outputTail>
	//  132  244:iload           7
	//  133  246:iadd            
	//  134  247:putfield        #59  <Field int _outputTail>
				}
			} else
	//* 135  250:goto            268
			{
				_flushBuffer();
	//  136  253:aload_0         
	//  137  254:invokevirtual   #62  <Method void _flushBuffer()>
				_writer.write(ac, j, i1);
	//  138  257:aload_0         
	//  139  258:getfield        #39  <Field Writer _writer>
	//  140  261:aload_1         
	//  141  262:iload_3         
	//  142  263:iload           7
	//  143  265:invokevirtual   #104 <Method void Writer.write(char[], int, int)>
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
	//  155  285:invokespecial   #187 <Method void _appendCharacterEscape(char, int)>
		}
	//* 156  288:goto            58
	//  157  291:return          
	}

	private void writeRawLong(String s)
		throws IOException
	{
		int i = _outputEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int _outputEnd>
	//    2    4:istore_2        
		int j = _outputTail;
	//    3    5:aload_0         
	//    4    6:getfield        #59  <Field int _outputTail>
	//    5    9:istore_3        
		i -= j;
	//    6   10:iload_2         
	//    7   11:iload_3         
	//    8   12:isub            
	//    9   13:istore_2        
		s.getChars(0, i, _outputBuffer, j);
	//   10   14:aload_1         
	//   11   15:iconst_0        
	//   12   16:iload_2         
	//   13   17:aload_0         
	//   14   18:getfield        #46  <Field char[] _outputBuffer>
	//   15   21:iload_3         
	//   16   22:invokevirtual   #96  <Method void String.getChars(int, int, char[], int)>
		_outputTail = _outputTail + i;
	//   17   25:aload_0         
	//   18   26:aload_0         
	//   19   27:getfield        #59  <Field int _outputTail>
	//   20   30:iload_2         
	//   21   31:iadd            
	//   22   32:putfield        #59  <Field int _outputTail>
		_flushBuffer();
	//   23   35:aload_0         
	//   24   36:invokevirtual   #62  <Method void _flushBuffer()>
		j = s.length() - i;
	//   25   39:aload_1         
	//   26   40:invokevirtual   #86  <Method int String.length()>
	//   27   43:iload_2         
	//   28   44:isub            
	//   29   45:istore_3        
		do
		{
			int l = _outputEnd;
	//   30   46:aload_0         
	//   31   47:getfield        #48  <Field int _outputEnd>
	//   32   50:istore          5
			if(j > l)
	//*  33   52:iload_3         
	//*  34   53:iload           5
	//*  35   55:icmple          102
			{
				int k = i + l;
	//   36   58:iload_2         
	//   37   59:iload           5
	//   38   61:iadd            
	//   39   62:istore          4
				s.getChars(i, k, _outputBuffer, 0);
	//   40   64:aload_1         
	//   41   65:iload_2         
	//   42   66:iload           4
	//   43   68:aload_0         
	//   44   69:getfield        #46  <Field char[] _outputBuffer>
	//   45   72:iconst_0        
	//   46   73:invokevirtual   #96  <Method void String.getChars(int, int, char[], int)>
				_outputHead = 0;
	//   47   76:aload_0         
	//   48   77:iconst_0        
	//   49   78:putfield        #106 <Field int _outputHead>
				_outputTail = l;
	//   50   81:aload_0         
	//   51   82:iload           5
	//   52   84:putfield        #59  <Field int _outputTail>
				_flushBuffer();
	//   53   87:aload_0         
	//   54   88:invokevirtual   #62  <Method void _flushBuffer()>
				j -= l;
	//   55   91:iload_3         
	//   56   92:iload           5
	//   57   94:isub            
	//   58   95:istore_3        
				i = k;
	//   59   96:iload           4
	//   60   98:istore_2        
			} else
	//*  61   99:goto            46
			{
				s.getChars(i, i + j, _outputBuffer, 0);
	//   62  102:aload_1         
	//   63  103:iload_2         
	//   64  104:iload_2         
	//   65  105:iload_3         
	//   66  106:iadd            
	//   67  107:aload_0         
	//   68  108:getfield        #46  <Field char[] _outputBuffer>
	//   69  111:iconst_0        
	//   70  112:invokevirtual   #96  <Method void String.getChars(int, int, char[], int)>
				_outputHead = 0;
	//   71  115:aload_0         
	//   72  116:iconst_0        
	//   73  117:putfield        #106 <Field int _outputHead>
				_outputTail = j;
	//   74  120:aload_0         
	//   75  121:iload_3         
	//   76  122:putfield        #59  <Field int _outputTail>
				return;
	//   77  125:return          
			}
		} while(true);
	}

	protected void _flushBuffer()
		throws IOException
	{
		int j = _outputTail;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int _outputTail>
	//    2    4:istore_2        
		int i = _outputHead;
	//    3    5:aload_0         
	//    4    6:getfield        #106 <Field int _outputHead>
	//    5    9:istore_1        
		j -= i;
	//    6   10:iload_2         
	//    7   11:iload_1         
	//    8   12:isub            
	//    9   13:istore_2        
		if(j > 0)
	//*  10   14:iload_2         
	//*  11   15:ifle            41
		{
			_outputHead = 0;
	//   12   18:aload_0         
	//   13   19:iconst_0        
	//   14   20:putfield        #106 <Field int _outputHead>
			_outputTail = 0;
	//   15   23:aload_0         
	//   16   24:iconst_0        
	//   17   25:putfield        #59  <Field int _outputTail>
			_writer.write(_outputBuffer, i, j);
	//   18   28:aload_0         
	//   19   29:getfield        #39  <Field Writer _writer>
	//   20   32:aload_0         
	//   21   33:getfield        #46  <Field char[] _outputBuffer>
	//   22   36:iload_1         
	//   23   37:iload_2         
	//   24   38:invokevirtual   #104 <Method void Writer.write(char[], int, int)>
		}
	//   25   41:return          
	}

	protected void _releaseBuffers()
	{
		char ac[] = _outputBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field char[] _outputBuffer>
	//    2    4:astore_1        
		if(ac != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          22
		{
			_outputBuffer = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #46  <Field char[] _outputBuffer>
			_ioContext.releaseConcatBuffer(ac);
	//    8   14:aload_0         
	//    9   15:getfield        #195 <Field IOContext _ioContext>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #199 <Method void IOContext.releaseConcatBuffer(char[])>
		}
		ac = _charBuffer;
	//   12   22:aload_0         
	//   13   23:getfield        #201 <Field char[] _charBuffer>
	//   14   26:astore_1        
		if(ac != null)
	//*  15   27:aload_1         
	//*  16   28:ifnull          44
		{
			_charBuffer = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #201 <Field char[] _charBuffer>
			_ioContext.releaseNameCopyBuffer(ac);
	//   20   36:aload_0         
	//   21   37:getfield        #195 <Field IOContext _ioContext>
	//   22   40:aload_1         
	//   23   41:invokevirtual   #204 <Method void IOContext.releaseNameCopyBuffer(char[])>
		}
	//   24   44:return          
	}

	protected final void _verifyValueWrite(String s)
		throws IOException
	{
		int i = _writeContext.writeValue();
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field JsonWriteContext _writeContext>
	//    2    4:invokevirtual   #214 <Method int JsonWriteContext.writeValue()>
	//    3    7:istore_3        
		if(_cfgPrettyPrinter != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #218 <Field PrettyPrinter _cfgPrettyPrinter>
	//*   6   12:ifnull          22
		{
			_verifyPrettyValueWrite(s, i);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:iload_3         
	//   10   18:invokevirtual   #222 <Method void _verifyPrettyValueWrite(String, int)>
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
	//*  19   58:getfield        #225 <Field SerializableString _rootValueSeparator>
	//*  20   61:ifnull          77
					writeRaw(_rootValueSeparator.getValue());
	//   21   64:aload_0         
	//   22   65:aload_0         
	//   23   66:getfield        #225 <Field SerializableString _rootValueSeparator>
	//   24   69:invokeinterface #80  <Method String SerializableString.getValue()>
	//   25   74:invokevirtual   #153 <Method void writeRaw(String)>
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
	//*  33   88:getfield        #59  <Field int _outputTail>
	//*  34   91:aload_0         
	//*  35   92:getfield        #48  <Field int _outputEnd>
	//*  36   95:icmplt          102
				_flushBuffer();
	//   37   98:aload_0         
	//   38   99:invokevirtual   #62  <Method void _flushBuffer()>
			s = ((String) (_outputBuffer));
	//   39  102:aload_0         
	//   40  103:getfield        #46  <Field char[] _outputBuffer>
	//   41  106:astore_1        
			i = _outputTail;
	//   42  107:aload_0         
	//   43  108:getfield        #59  <Field int _outputTail>
	//   44  111:istore_3        
			_outputTail = i + 1;
	//   45  112:aload_0         
	//   46  113:iload_3         
	//   47  114:iconst_1        
	//   48  115:iadd            
	//   49  116:putfield        #59  <Field int _outputTail>
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
	//   57  126:invokevirtual   #228 <Method void _reportCantWriteValueExpectName(String)>
			return;
	//   58  129:return          
		}
	}

	protected final int _writeBinary(Base64Variant base64variant, InputStream inputstream, byte abyte0[])
		throws IOException, JsonGenerationException
	{
		int k2 = _outputEnd - 6;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int _outputEnd>
	//    2    4:bipush          6
	//    3    6:isub            
	//    4    7:istore          14
		int i = base64variant.getMaxLineLength();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #235 <Method int Base64Variant.getMaxLineLength()>
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
	//   36   62:invokespecial   #237 <Method int _readMore(InputStream, byte[], int, int, int)>
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
	//*  46   83:getfield        #59  <Field int _outputTail>
	//*  47   86:iload           14
	//*  48   88:icmple          95
								_flushBuffer();
	//   49   91:aload_0         
	//   50   92:invokevirtual   #62  <Method void _flushBuffer()>
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
	//   85  148:getfield        #46  <Field char[] _outputBuffer>
	//   86  151:aload_0         
	//   87  152:getfield        #59  <Field int _outputTail>
	//   88  155:invokevirtual   #241 <Method int Base64Variant.encodeBase64Partial(int, int, char[], int)>
	//   89  158:putfield        #59  <Field int _outputTail>
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
	//* 103  182:getfield        #59  <Field int _outputTail>
	//* 104  185:iload           14
	//* 105  187:icmple          194
					_flushBuffer();
	//  106  190:aload_0         
	//  107  191:invokevirtual   #62  <Method void _flushBuffer()>
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
	//  152  261:getfield        #46  <Field char[] _outputBuffer>
	//  153  264:aload_0         
	//  154  265:getfield        #59  <Field int _outputTail>
	//  155  268:invokevirtual   #244 <Method int Base64Variant.encodeBase64Chunk(int, char[], int)>
	//  156  271:putfield        #59  <Field int _outputTail>
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
			char ac[] = _outputBuffer;
	//  173  305:aload_0         
	//  174  306:getfield        #46  <Field char[] _outputBuffer>
	//  175  309:astore          15
			i = _outputTail;
	//  176  311:aload_0         
	//  177  312:getfield        #59  <Field int _outputTail>
	//  178  315:istore          4
			_outputTail = i + 1;
	//  179  317:aload_0         
	//  180  318:iload           4
	//  181  320:iconst_1        
	//  182  321:iadd            
	//  183  322:putfield        #59  <Field int _outputTail>
			ac[i] = '\\';
	//  184  325:aload           15
	//  185  327:iload           4
	//  186  329:bipush          92
	//  187  331:castore         
			i = _outputTail;
	//  188  332:aload_0         
	//  189  333:getfield        #59  <Field int _outputTail>
	//  190  336:istore          4
			_outputTail = i + 1;
	//  191  338:aload_0         
	//  192  339:iload           4
	//  193  341:iconst_1        
	//  194  342:iadd            
	//  195  343:putfield        #59  <Field int _outputTail>
			ac[i] = 'n';
	//  196  346:aload           15
	//  197  348:iload           4
	//  198  350:bipush          110
	//  199  352:castore         
			j = base64variant.getMaxLineLength() >> 2;
	//  200  353:aload_1         
	//  201  354:invokevirtual   #235 <Method int Base64Variant.getMaxLineLength()>
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
	//    1    1:getfield        #48  <Field int _outputEnd>
	//    2    4:bipush          6
	//    3    6:isub            
	//    4    7:istore          14
		int k = base64variant.getMaxLineLength() >> 2;
	//    5    9:aload_1         
	//    6   10:invokevirtual   #235 <Method int Base64Variant.getMaxLineLength()>
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
	//   42   77:invokespecial   #237 <Method int _readMore(InputStream, byte[], int, int, int)>
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
	//*  61  112:getfield        #59  <Field int _outputTail>
	//*  62  115:iload           14
	//*  63  117:icmple          124
				_flushBuffer();
	//   64  120:aload_0         
	//   65  121:invokevirtual   #62  <Method void _flushBuffer()>
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
	//  110  191:getfield        #46  <Field char[] _outputBuffer>
	//  111  194:aload_0         
	//  112  195:getfield        #59  <Field int _outputTail>
	//  113  198:invokevirtual   #244 <Method int Base64Variant.encodeBase64Chunk(int, char[], int)>
	//  114  201:putfield        #59  <Field int _outputTail>
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
				char ac[] = _outputBuffer;
	//  131  235:aload_0         
	//  132  236:getfield        #46  <Field char[] _outputBuffer>
	//  133  239:astore          15
				i = _outputTail;
	//  134  241:aload_0         
	//  135  242:getfield        #59  <Field int _outputTail>
	//  136  245:istore          4
				_outputTail = i + 1;
	//  137  247:aload_0         
	//  138  248:iload           4
	//  139  250:iconst_1        
	//  140  251:iadd            
	//  141  252:putfield        #59  <Field int _outputTail>
				ac[i] = '\\';
	//  142  255:aload           15
	//  143  257:iload           4
	//  144  259:bipush          92
	//  145  261:castore         
				i = _outputTail;
	//  146  262:aload_0         
	//  147  263:getfield        #59  <Field int _outputTail>
	//  148  266:istore          4
				_outputTail = i + 1;
	//  149  268:aload_0         
	//  150  269:iload           4
	//  151  271:iconst_1        
	//  152  272:iadd            
	//  153  273:putfield        #59  <Field int _outputTail>
				ac[i] = 'n';
	//  154  276:aload           15
	//  155  278:iload           4
	//  156  280:bipush          110
	//  157  282:castore         
				k = base64variant.getMaxLineLength() >> 2;
	//  158  283:aload_1         
	//  159  284:invokevirtual   #235 <Method int Base64Variant.getMaxLineLength()>
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
	//  182  328:invokespecial   #237 <Method int _readMore(InputStream, byte[], int, int, int)>
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
	//* 189  343:getfield        #59  <Field int _outputTail>
	//* 190  346:iload           14
	//* 191  348:icmple          355
					_flushBuffer();
	//  192  351:aload_0         
	//  193  352:invokevirtual   #62  <Method void _flushBuffer()>
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
	//  224  401:getfield        #46  <Field char[] _outputBuffer>
	//  225  404:aload_0         
	//  226  405:getfield        #59  <Field int _outputTail>
	//  227  408:invokevirtual   #241 <Method int Base64Variant.encodeBase64Partial(int, int, char[], int)>
	//  228  411:putfield        #59  <Field int _outputTail>
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
	//    1    1:getfield        #48  <Field int _outputEnd>
	//    2    4:bipush          6
	//    3    6:isub            
	//    4    7:istore          7
		int k = base64variant.getMaxLineLength() >> 2;
	//    5    9:aload_1         
	//    6   10:invokevirtual   #235 <Method int Base64Variant.getMaxLineLength()>
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
	//*  16   26:getfield        #59  <Field int _outputTail>
	//*  17   29:iload           7
	//*  18   31:icmple          38
				_flushBuffer();
	//   19   34:aload_0         
	//   20   35:invokevirtual   #62  <Method void _flushBuffer()>
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
	//   53   81:getfield        #46  <Field char[] _outputBuffer>
	//   54   84:aload_0         
	//   55   85:getfield        #59  <Field int _outputTail>
	//   56   88:invokevirtual   #244 <Method int Base64Variant.encodeBase64Chunk(int, char[], int)>
	//   57   91:putfield        #59  <Field int _outputTail>
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
				char ac[] = _outputBuffer;
	//   66  108:aload_0         
	//   67  109:getfield        #46  <Field char[] _outputBuffer>
	//   68  112:astore          9
				i = _outputTail;
	//   69  114:aload_0         
	//   70  115:getfield        #59  <Field int _outputTail>
	//   71  118:istore_3        
				_outputTail = i + 1;
	//   72  119:aload_0         
	//   73  120:iload_3         
	//   74  121:iconst_1        
	//   75  122:iadd            
	//   76  123:putfield        #59  <Field int _outputTail>
				ac[i] = '\\';
	//   77  126:aload           9
	//   78  128:iload_3         
	//   79  129:bipush          92
	//   80  131:castore         
				i = _outputTail;
	//   81  132:aload_0         
	//   82  133:getfield        #59  <Field int _outputTail>
	//   83  136:istore_3        
				_outputTail = i + 1;
	//   84  137:aload_0         
	//   85  138:iload_3         
	//   86  139:iconst_1        
	//   87  140:iadd            
	//   88  141:putfield        #59  <Field int _outputTail>
				ac[i] = 'n';
	//   89  144:aload           9
	//   90  146:iload_3         
	//   91  147:bipush          110
	//   92  149:castore         
				i = base64variant.getMaxLineLength() >> 2;
	//   93  150:aload_1         
	//   94  151:invokevirtual   #235 <Method int Base64Variant.getMaxLineLength()>
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
	//* 114  184:getfield        #59  <Field int _outputTail>
	//* 115  187:iload           7
	//* 116  189:icmple          196
				_flushBuffer();
	//  117  192:aload_0         
	//  118  193:invokevirtual   #62  <Method void _flushBuffer()>
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
	//  147  238:getfield        #46  <Field char[] _outputBuffer>
	//  148  241:aload_0         
	//  149  242:getfield        #59  <Field int _outputTail>
	//  150  245:invokevirtual   #241 <Method int Base64Variant.encodeBase64Partial(int, int, char[], int)>
	//  151  248:putfield        #59  <Field int _outputTail>
		}
	//  152  251:return          
	}

	protected final void _writeFieldName(SerializableString serializablestring, boolean flag)
		throws IOException
	{
		if(_cfgPrettyPrinter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #218 <Field PrettyPrinter _cfgPrettyPrinter>
	//*   2    4:ifnull          14
		{
			_writePPFieldName(serializablestring, flag);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #251 <Method void _writePPFieldName(SerializableString, boolean)>
			return;
	//    7   13:return          
		}
		if(_outputTail + 1 >= _outputEnd)
	//*   8   14:aload_0         
	//*   9   15:getfield        #59  <Field int _outputTail>
	//*  10   18:iconst_1        
	//*  11   19:iadd            
	//*  12   20:aload_0         
	//*  13   21:getfield        #48  <Field int _outputEnd>
	//*  14   24:icmplt          31
			_flushBuffer();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #62  <Method void _flushBuffer()>
		if(flag)
	//*  17   31:iload_2         
	//*  18   32:ifeq            59
		{
			char ac[] = _outputBuffer;
	//   19   35:aload_0         
	//   20   36:getfield        #46  <Field char[] _outputBuffer>
	//   21   39:astore          5
			int i = _outputTail;
	//   22   41:aload_0         
	//   23   42:getfield        #59  <Field int _outputTail>
	//   24   45:istore_3        
			_outputTail = i + 1;
	//   25   46:aload_0         
	//   26   47:iload_3         
	//   27   48:iconst_1        
	//   28   49:iadd            
	//   29   50:putfield        #59  <Field int _outputTail>
			ac[i] = ',';
	//   30   53:aload           5
	//   31   55:iload_3         
	//   32   56:bipush          44
	//   33   58:castore         
		}
		serializablestring = ((SerializableString) (serializablestring.asQuotedChars()));
	//   34   59:aload_1         
	//   35   60:invokeinterface #254 <Method char[] SerializableString.asQuotedChars()>
	//   36   65:astore_1        
		if(_cfgUnqNames)
	//*  37   66:aload_0         
	//*  38   67:getfield        #258 <Field boolean _cfgUnqNames>
	//*  39   70:ifeq            82
		{
			writeRaw(((char []) (serializablestring)), 0, serializablestring.length);
	//   40   73:aload_0         
	//   41   74:aload_1         
	//   42   75:iconst_0        
	//   43   76:aload_1         
	//   44   77:arraylength     
	//   45   78:invokevirtual   #260 <Method void writeRaw(char[], int, int)>
			return;
	//   46   81:return          
		}
		char ac1[] = _outputBuffer;
	//   47   82:aload_0         
	//   48   83:getfield        #46  <Field char[] _outputBuffer>
	//   49   86:astore          5
		int j = _outputTail;
	//   50   88:aload_0         
	//   51   89:getfield        #59  <Field int _outputTail>
	//   52   92:istore_3        
		_outputTail = j + 1;
	//   53   93:aload_0         
	//   54   94:iload_3         
	//   55   95:iconst_1        
	//   56   96:iadd            
	//   57   97:putfield        #59  <Field int _outputTail>
		ac1[j] = _quoteChar;
	//   58  100:aload           5
	//   59  102:iload_3         
	//   60  103:aload_0         
	//   61  104:getfield        #37  <Field char _quoteChar>
	//   62  107:castore         
		j = serializablestring.length;
	//   63  108:aload_1         
	//   64  109:arraylength     
	//   65  110:istore_3        
		int k = _outputTail;
	//   66  111:aload_0         
	//   67  112:getfield        #59  <Field int _outputTail>
	//   68  115:istore          4
		if(k + j + 1 >= _outputEnd)
	//*  69  117:iload           4
	//*  70  119:iload_3         
	//*  71  120:iadd            
	//*  72  121:iconst_1        
	//*  73  122:iadd            
	//*  74  123:aload_0         
	//*  75  124:getfield        #48  <Field int _outputEnd>
	//*  76  127:icmplt          177
		{
			writeRaw(((char []) (serializablestring)), 0, j);
	//   77  130:aload_0         
	//   78  131:aload_1         
	//   79  132:iconst_0        
	//   80  133:iload_3         
	//   81  134:invokevirtual   #260 <Method void writeRaw(char[], int, int)>
			if(_outputTail >= _outputEnd)
	//*  82  137:aload_0         
	//*  83  138:getfield        #59  <Field int _outputTail>
	//*  84  141:aload_0         
	//*  85  142:getfield        #48  <Field int _outputEnd>
	//*  86  145:icmplt          152
				_flushBuffer();
	//   87  148:aload_0         
	//   88  149:invokevirtual   #62  <Method void _flushBuffer()>
			serializablestring = ((SerializableString) (_outputBuffer));
	//   89  152:aload_0         
	//   90  153:getfield        #46  <Field char[] _outputBuffer>
	//   91  156:astore_1        
			j = _outputTail;
	//   92  157:aload_0         
	//   93  158:getfield        #59  <Field int _outputTail>
	//   94  161:istore_3        
			_outputTail = j + 1;
	//   95  162:aload_0         
	//   96  163:iload_3         
	//   97  164:iconst_1        
	//   98  165:iadd            
	//   99  166:putfield        #59  <Field int _outputTail>
			serializablestring[j] = _quoteChar;
	//  100  169:aload_1         
	//  101  170:iload_3         
	//  102  171:aload_0         
	//  103  172:getfield        #37  <Field char _quoteChar>
	//  104  175:castore         
			return;
	//  105  176:return          
		} else
		{
			System.arraycopy(((Object) (serializablestring)), 0, ((Object) (ac1)), k, j);
	//  106  177:aload_1         
	//  107  178:iconst_0        
	//  108  179:aload           5
	//  109  181:iload           4
	//  110  183:iload_3         
	//  111  184:invokestatic    #185 <Method void System.arraycopy(Object, int, Object, int, int)>
			_outputTail = _outputTail + j;
	//  112  187:aload_0         
	//  113  188:aload_0         
	//  114  189:getfield        #59  <Field int _outputTail>
	//  115  192:iload_3         
	//  116  193:iadd            
	//  117  194:putfield        #59  <Field int _outputTail>
			serializablestring = ((SerializableString) (_outputBuffer));
	//  118  197:aload_0         
	//  119  198:getfield        #46  <Field char[] _outputBuffer>
	//  120  201:astore_1        
			j = _outputTail;
	//  121  202:aload_0         
	//  122  203:getfield        #59  <Field int _outputTail>
	//  123  206:istore_3        
			_outputTail = j + 1;
	//  124  207:aload_0         
	//  125  208:iload_3         
	//  126  209:iconst_1        
	//  127  210:iadd            
	//  128  211:putfield        #59  <Field int _outputTail>
			serializablestring[j] = _quoteChar;
	//  129  214:aload_1         
	//  130  215:iload_3         
	//  131  216:aload_0         
	//  132  217:getfield        #37  <Field char _quoteChar>
	//  133  220:castore         
			return;
	//  134  221:return          
		}
	}

	protected final void _writeFieldName(String s, boolean flag)
		throws IOException
	{
		if(_cfgPrettyPrinter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #218 <Field PrettyPrinter _cfgPrettyPrinter>
	//*   2    4:ifnull          14
		{
			_writePPFieldName(s, flag);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #263 <Method void _writePPFieldName(String, boolean)>
			return;
	//    7   13:return          
		}
		if(_outputTail + 1 >= _outputEnd)
	//*   8   14:aload_0         
	//*   9   15:getfield        #59  <Field int _outputTail>
	//*  10   18:iconst_1        
	//*  11   19:iadd            
	//*  12   20:aload_0         
	//*  13   21:getfield        #48  <Field int _outputEnd>
	//*  14   24:icmplt          31
			_flushBuffer();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #62  <Method void _flushBuffer()>
		if(flag)
	//*  17   31:iload_2         
	//*  18   32:ifeq            59
		{
			char ac[] = _outputBuffer;
	//   19   35:aload_0         
	//   20   36:getfield        #46  <Field char[] _outputBuffer>
	//   21   39:astore          4
			int i = _outputTail;
	//   22   41:aload_0         
	//   23   42:getfield        #59  <Field int _outputTail>
	//   24   45:istore_3        
			_outputTail = i + 1;
	//   25   46:aload_0         
	//   26   47:iload_3         
	//   27   48:iconst_1        
	//   28   49:iadd            
	//   29   50:putfield        #59  <Field int _outputTail>
			ac[i] = ',';
	//   30   53:aload           4
	//   31   55:iload_3         
	//   32   56:bipush          44
	//   33   58:castore         
		}
		if(_cfgUnqNames)
	//*  34   59:aload_0         
	//*  35   60:getfield        #258 <Field boolean _cfgUnqNames>
	//*  36   63:ifeq            72
		{
			_writeString(s);
	//   37   66:aload_0         
	//   38   67:aload_1         
	//   39   68:invokespecial   #265 <Method void _writeString(String)>
			return;
	//   40   71:return          
		}
		char ac1[] = _outputBuffer;
	//   41   72:aload_0         
	//   42   73:getfield        #46  <Field char[] _outputBuffer>
	//   43   76:astore          4
		int j = _outputTail;
	//   44   78:aload_0         
	//   45   79:getfield        #59  <Field int _outputTail>
	//   46   82:istore_3        
		_outputTail = j + 1;
	//   47   83:aload_0         
	//   48   84:iload_3         
	//   49   85:iconst_1        
	//   50   86:iadd            
	//   51   87:putfield        #59  <Field int _outputTail>
		ac1[j] = _quoteChar;
	//   52   90:aload           4
	//   53   92:iload_3         
	//   54   93:aload_0         
	//   55   94:getfield        #37  <Field char _quoteChar>
	//   56   97:castore         
		_writeString(s);
	//   57   98:aload_0         
	//   58   99:aload_1         
	//   59  100:invokespecial   #265 <Method void _writeString(String)>
		if(_outputTail >= _outputEnd)
	//*  60  103:aload_0         
	//*  61  104:getfield        #59  <Field int _outputTail>
	//*  62  107:aload_0         
	//*  63  108:getfield        #48  <Field int _outputEnd>
	//*  64  111:icmplt          118
			_flushBuffer();
	//   65  114:aload_0         
	//   66  115:invokevirtual   #62  <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//   67  118:aload_0         
	//   68  119:getfield        #46  <Field char[] _outputBuffer>
	//   69  122:astore_1        
		j = _outputTail;
	//   70  123:aload_0         
	//   71  124:getfield        #59  <Field int _outputTail>
	//   72  127:istore_3        
		_outputTail = j + 1;
	//   73  128:aload_0         
	//   74  129:iload_3         
	//   75  130:iconst_1        
	//   76  131:iadd            
	//   77  132:putfield        #59  <Field int _outputTail>
		s[j] = _quoteChar;
	//   78  135:aload_1         
	//   79  136:iload_3         
	//   80  137:aload_0         
	//   81  138:getfield        #37  <Field char _quoteChar>
	//   82  141:castore         
	//   83  142:return          
	}

	protected final void _writePPFieldName(SerializableString serializablestring, boolean flag)
		throws IOException
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            17
			_cfgPrettyPrinter.writeObjectEntrySeparator(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//    2    4:aload_0         
	//    3    5:getfield        #218 <Field PrettyPrinter _cfgPrettyPrinter>
	//    4    8:aload_0         
	//    5    9:invokeinterface #271 <Method void PrettyPrinter.writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)>
		else
	//*   6   14:goto            27
			_cfgPrettyPrinter.beforeObjectEntries(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//    7   17:aload_0         
	//    8   18:getfield        #218 <Field PrettyPrinter _cfgPrettyPrinter>
	//    9   21:aload_0         
	//   10   22:invokeinterface #274 <Method void PrettyPrinter.beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)>
		serializablestring = ((SerializableString) (serializablestring.asQuotedChars()));
	//   11   27:aload_1         
	//   12   28:invokeinterface #254 <Method char[] SerializableString.asQuotedChars()>
	//   13   33:astore_1        
		if(_cfgUnqNames)
	//*  14   34:aload_0         
	//*  15   35:getfield        #258 <Field boolean _cfgUnqNames>
	//*  16   38:ifeq            50
		{
			writeRaw(((char []) (serializablestring)), 0, serializablestring.length);
	//   17   41:aload_0         
	//   18   42:aload_1         
	//   19   43:iconst_0        
	//   20   44:aload_1         
	//   21   45:arraylength     
	//   22   46:invokevirtual   #260 <Method void writeRaw(char[], int, int)>
			return;
	//   23   49:return          
		}
		if(_outputTail >= _outputEnd)
	//*  24   50:aload_0         
	//*  25   51:getfield        #59  <Field int _outputTail>
	//*  26   54:aload_0         
	//*  27   55:getfield        #48  <Field int _outputEnd>
	//*  28   58:icmplt          65
			_flushBuffer();
	//   29   61:aload_0         
	//   30   62:invokevirtual   #62  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//   31   65:aload_0         
	//   32   66:getfield        #46  <Field char[] _outputBuffer>
	//   33   69:astore          4
		int i = _outputTail;
	//   34   71:aload_0         
	//   35   72:getfield        #59  <Field int _outputTail>
	//   36   75:istore_3        
		_outputTail = i + 1;
	//   37   76:aload_0         
	//   38   77:iload_3         
	//   39   78:iconst_1        
	//   40   79:iadd            
	//   41   80:putfield        #59  <Field int _outputTail>
		ac[i] = _quoteChar;
	//   42   83:aload           4
	//   43   85:iload_3         
	//   44   86:aload_0         
	//   45   87:getfield        #37  <Field char _quoteChar>
	//   46   90:castore         
		writeRaw(((char []) (serializablestring)), 0, serializablestring.length);
	//   47   91:aload_0         
	//   48   92:aload_1         
	//   49   93:iconst_0        
	//   50   94:aload_1         
	//   51   95:arraylength     
	//   52   96:invokevirtual   #260 <Method void writeRaw(char[], int, int)>
		if(_outputTail >= _outputEnd)
	//*  53   99:aload_0         
	//*  54  100:getfield        #59  <Field int _outputTail>
	//*  55  103:aload_0         
	//*  56  104:getfield        #48  <Field int _outputEnd>
	//*  57  107:icmplt          114
			_flushBuffer();
	//   58  110:aload_0         
	//   59  111:invokevirtual   #62  <Method void _flushBuffer()>
		serializablestring = ((SerializableString) (_outputBuffer));
	//   60  114:aload_0         
	//   61  115:getfield        #46  <Field char[] _outputBuffer>
	//   62  118:astore_1        
		i = _outputTail;
	//   63  119:aload_0         
	//   64  120:getfield        #59  <Field int _outputTail>
	//   65  123:istore_3        
		_outputTail = i + 1;
	//   66  124:aload_0         
	//   67  125:iload_3         
	//   68  126:iconst_1        
	//   69  127:iadd            
	//   70  128:putfield        #59  <Field int _outputTail>
		serializablestring[i] = _quoteChar;
	//   71  131:aload_1         
	//   72  132:iload_3         
	//   73  133:aload_0         
	//   74  134:getfield        #37  <Field char _quoteChar>
	//   75  137:castore         
	//   76  138:return          
	}

	protected final void _writePPFieldName(String s, boolean flag)
		throws IOException
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            17
			_cfgPrettyPrinter.writeObjectEntrySeparator(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//    2    4:aload_0         
	//    3    5:getfield        #218 <Field PrettyPrinter _cfgPrettyPrinter>
	//    4    8:aload_0         
	//    5    9:invokeinterface #271 <Method void PrettyPrinter.writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)>
		else
	//*   6   14:goto            27
			_cfgPrettyPrinter.beforeObjectEntries(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//    7   17:aload_0         
	//    8   18:getfield        #218 <Field PrettyPrinter _cfgPrettyPrinter>
	//    9   21:aload_0         
	//   10   22:invokeinterface #274 <Method void PrettyPrinter.beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)>
		if(_cfgUnqNames)
	//*  11   27:aload_0         
	//*  12   28:getfield        #258 <Field boolean _cfgUnqNames>
	//*  13   31:ifeq            40
		{
			_writeString(s);
	//   14   34:aload_0         
	//   15   35:aload_1         
	//   16   36:invokespecial   #265 <Method void _writeString(String)>
			return;
	//   17   39:return          
		}
		if(_outputTail >= _outputEnd)
	//*  18   40:aload_0         
	//*  19   41:getfield        #59  <Field int _outputTail>
	//*  20   44:aload_0         
	//*  21   45:getfield        #48  <Field int _outputEnd>
	//*  22   48:icmplt          55
			_flushBuffer();
	//   23   51:aload_0         
	//   24   52:invokevirtual   #62  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//   25   55:aload_0         
	//   26   56:getfield        #46  <Field char[] _outputBuffer>
	//   27   59:astore          4
		int i = _outputTail;
	//   28   61:aload_0         
	//   29   62:getfield        #59  <Field int _outputTail>
	//   30   65:istore_3        
		_outputTail = i + 1;
	//   31   66:aload_0         
	//   32   67:iload_3         
	//   33   68:iconst_1        
	//   34   69:iadd            
	//   35   70:putfield        #59  <Field int _outputTail>
		ac[i] = _quoteChar;
	//   36   73:aload           4
	//   37   75:iload_3         
	//   38   76:aload_0         
	//   39   77:getfield        #37  <Field char _quoteChar>
	//   40   80:castore         
		_writeString(s);
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:invokespecial   #265 <Method void _writeString(String)>
		if(_outputTail >= _outputEnd)
	//*  44   86:aload_0         
	//*  45   87:getfield        #59  <Field int _outputTail>
	//*  46   90:aload_0         
	//*  47   91:getfield        #48  <Field int _outputEnd>
	//*  48   94:icmplt          101
			_flushBuffer();
	//   49   97:aload_0         
	//   50   98:invokevirtual   #62  <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//   51  101:aload_0         
	//   52  102:getfield        #46  <Field char[] _outputBuffer>
	//   53  105:astore_1        
		i = _outputTail;
	//   54  106:aload_0         
	//   55  107:getfield        #59  <Field int _outputTail>
	//   56  110:istore_3        
		_outputTail = i + 1;
	//   57  111:aload_0         
	//   58  112:iload_3         
	//   59  113:iconst_1        
	//   60  114:iadd            
	//   61  115:putfield        #59  <Field int _outputTail>
		s[i] = _quoteChar;
	//   62  118:aload_1         
	//   63  119:iload_3         
	//   64  120:aload_0         
	//   65  121:getfield        #37  <Field char _quoteChar>
	//   66  124:castore         
	//   67  125:return          
	}

	public void close()
		throws IOException
	{
		super.close();
	//    0    0:aload_0         
	//    1    1:invokespecial   #277 <Method void JsonGeneratorImpl.close()>
		if(_outputBuffer != null && isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT))
	//*   2    4:aload_0         
	//*   3    5:getfield        #46  <Field char[] _outputBuffer>
	//*   4    8:ifnull          54
	//*   5   11:aload_0         
	//*   6   12:getstatic       #283 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_JSON_CONTENT>
	//*   7   15:invokevirtual   #287 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*   8   18:ifeq            54
			do
			{
				JsonStreamContext jsonstreamcontext = getOutputContext();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #291 <Method JsonStreamContext getOutputContext()>
	//   11   25:astore_1        
				if(jsonstreamcontext.inArray())
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #297 <Method boolean JsonStreamContext.inArray()>
	//*  14   30:ifeq            40
				{
					writeEndArray();
	//   15   33:aload_0         
	//   16   34:invokevirtual   #300 <Method void writeEndArray()>
					continue;
	//   17   37:goto            21
				}
				if(!jsonstreamcontext.inObject())
					break;
	//   18   40:aload_1         
	//   19   41:invokevirtual   #303 <Method boolean JsonStreamContext.inObject()>
	//   20   44:ifeq            54
				writeEndObject();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #306 <Method void writeEndObject()>
			} while(true);
	//   23   51:goto            21
		_flushBuffer();
	//   24   54:aload_0         
	//   25   55:invokevirtual   #62  <Method void _flushBuffer()>
		_outputHead = 0;
	//   26   58:aload_0         
	//   27   59:iconst_0        
	//   28   60:putfield        #106 <Field int _outputHead>
		_outputTail = 0;
	//   29   63:aload_0         
	//   30   64:iconst_0        
	//   31   65:putfield        #59  <Field int _outputTail>
		if(_writer != null)
	//*  32   68:aload_0         
	//*  33   69:getfield        #39  <Field Writer _writer>
	//*  34   72:ifnull          125
			if(!_ioContext.isResourceManaged() && !isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET))
	//*  35   75:aload_0         
	//*  36   76:getfield        #195 <Field IOContext _ioContext>
	//*  37   79:invokevirtual   #309 <Method boolean IOContext.isResourceManaged()>
	//*  38   82:ifne            118
	//*  39   85:aload_0         
	//*  40   86:getstatic       #312 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_TARGET>
	//*  41   89:invokevirtual   #287 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*  42   92:ifeq            98
	//*  43   95:goto            118
			{
				if(isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM))
	//*  44   98:aload_0         
	//*  45   99:getstatic       #315 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.FLUSH_PASSED_TO_STREAM>
	//*  46  102:invokevirtual   #287 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*  47  105:ifeq            125
					_writer.flush();
	//   48  108:aload_0         
	//   49  109:getfield        #39  <Field Writer _writer>
	//   50  112:invokevirtual   #318 <Method void Writer.flush()>
			} else
	//*  51  115:goto            125
			{
				_writer.close();
	//   52  118:aload_0         
	//   53  119:getfield        #39  <Field Writer _writer>
	//   54  122:invokevirtual   #319 <Method void Writer.close()>
			}
		_releaseBuffers();
	//   55  125:aload_0         
	//   56  126:invokevirtual   #321 <Method void _releaseBuffers()>
	//   57  129:return          
	}

	public void flush()
		throws IOException
	{
		_flushBuffer();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method void _flushBuffer()>
		if(_writer != null && isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM))
	//*   2    4:aload_0         
	//*   3    5:getfield        #39  <Field Writer _writer>
	//*   4    8:ifnull          28
	//*   5   11:aload_0         
	//*   6   12:getstatic       #315 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.FLUSH_PASSED_TO_STREAM>
	//*   7   15:invokevirtual   #287 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*   8   18:ifeq            28
			_writer.flush();
	//    9   21:aload_0         
	//   10   22:getfield        #39  <Field Writer _writer>
	//   11   25:invokevirtual   #318 <Method void Writer.flush()>
	//   12   28:return          
	}

	public int writeBinary(Base64Variant base64variant, InputStream inputstream, int i)
		throws IOException, JsonGenerationException
	{
		char ac[];
		_verifyValueWrite("write a binary value");
	//    0    0:aload_0         
	//    1    1:ldc2            #325 <String "write a binary value">
	//    2    4:invokevirtual   #327 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #59  <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #48  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #62  <Method void _flushBuffer()>
		ac = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #46  <Field char[] _outputBuffer>
	//   12   26:astore          6
		int j = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #59  <Field int _outputTail>
	//   15   32:istore          4
		_outputTail = j + 1;
	//   16   34:aload_0         
	//   17   35:iload           4
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #59  <Field int _outputTail>
		ac[j] = _quoteChar;
	//   21   42:aload           6
	//   22   44:iload           4
	//   23   46:aload_0         
	//   24   47:getfield        #37  <Field char _quoteChar>
	//   25   50:castore         
		ac = ((char []) (_ioContext.allocBase64Buffer()));
	//   26   51:aload_0         
	//   27   52:getfield        #195 <Field IOContext _ioContext>
	//   28   55:invokevirtual   #331 <Method byte[] IOContext.allocBase64Buffer()>
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
	//   36   69:invokevirtual   #333 <Method int _writeBinary(Base64Variant, InputStream, byte[])>
	//   37   72:istore          4
		break MISSING_BLOCK_LABEL_152;
	//   38   74:goto            152
		int l = _writeBinary(base64variant, inputstream, ((byte []) (ac)), i);
	//   39   77:aload_0         
	//   40   78:aload_1         
	//   41   79:aload_2         
	//   42   80:aload           6
	//   43   82:iload_3         
	//   44   83:invokevirtual   #335 <Method int _writeBinary(Base64Variant, InputStream, byte[], int)>
	//   45   86:istore          5
		k = i;
	//   46   88:iload_3         
	//   47   89:istore          4
		if(l <= 0)
			break MISSING_BLOCK_LABEL_152;
	//   48   91:iload           5
	//   49   93:ifle            152
		base64variant = ((Base64Variant) (new StringBuilder()));
	//   50   96:new             #337 <Class StringBuilder>
	//   51   99:dup             
	//   52  100:invokespecial   #339 <Method void StringBuilder()>
	//   53  103:astore_1        
		((StringBuilder) (base64variant)).append("Too few bytes available: missing ");
	//   54  104:aload_1         
	//   55  105:ldc2            #341 <String "Too few bytes available: missing ">
	//   56  108:invokevirtual   #345 <Method StringBuilder StringBuilder.append(String)>
	//   57  111:pop             
		((StringBuilder) (base64variant)).append(l);
	//   58  112:aload_1         
	//   59  113:iload           5
	//   60  115:invokevirtual   #348 <Method StringBuilder StringBuilder.append(int)>
	//   61  118:pop             
		((StringBuilder) (base64variant)).append(" bytes (out of ");
	//   62  119:aload_1         
	//   63  120:ldc2            #350 <String " bytes (out of ">
	//   64  123:invokevirtual   #345 <Method StringBuilder StringBuilder.append(String)>
	//   65  126:pop             
		((StringBuilder) (base64variant)).append(i);
	//   66  127:aload_1         
	//   67  128:iload_3         
	//   68  129:invokevirtual   #348 <Method StringBuilder StringBuilder.append(int)>
	//   69  132:pop             
		((StringBuilder) (base64variant)).append(")");
	//   70  133:aload_1         
	//   71  134:ldc2            #352 <String ")">
	//   72  137:invokevirtual   #345 <Method StringBuilder StringBuilder.append(String)>
	//   73  140:pop             
		_reportError(((StringBuilder) (base64variant)).toString());
	//   74  141:aload_0         
	//   75  142:aload_1         
	//   76  143:invokevirtual   #355 <Method String StringBuilder.toString()>
	//   77  146:invokevirtual   #358 <Method void _reportError(String)>
		k = i;
	//   78  149:iload_3         
	//   79  150:istore          4
		_ioContext.releaseBase64Buffer(((byte []) (ac)));
	//   80  152:aload_0         
	//   81  153:getfield        #195 <Field IOContext _ioContext>
	//   82  156:aload           6
	//   83  158:invokevirtual   #362 <Method void IOContext.releaseBase64Buffer(byte[])>
		if(_outputTail >= _outputEnd)
	//*  84  161:aload_0         
	//*  85  162:getfield        #59  <Field int _outputTail>
	//*  86  165:aload_0         
	//*  87  166:getfield        #48  <Field int _outputEnd>
	//*  88  169:icmplt          176
			_flushBuffer();
	//   89  172:aload_0         
	//   90  173:invokevirtual   #62  <Method void _flushBuffer()>
		base64variant = ((Base64Variant) (_outputBuffer));
	//   91  176:aload_0         
	//   92  177:getfield        #46  <Field char[] _outputBuffer>
	//   93  180:astore_1        
		i = _outputTail;
	//   94  181:aload_0         
	//   95  182:getfield        #59  <Field int _outputTail>
	//   96  185:istore_3        
		_outputTail = i + 1;
	//   97  186:aload_0         
	//   98  187:iload_3         
	//   99  188:iconst_1        
	//  100  189:iadd            
	//  101  190:putfield        #59  <Field int _outputTail>
		base64variant[i] = _quoteChar;
	//  102  193:aload_1         
	//  103  194:iload_3         
	//  104  195:aload_0         
	//  105  196:getfield        #37  <Field char _quoteChar>
	//  106  199:castore         
		return k;
	//  107  200:iload           4
	//  108  202:ireturn         
		base64variant;
	//  109  203:astore_1        
		_ioContext.releaseBase64Buffer(((byte []) (ac)));
	//  110  204:aload_0         
	//  111  205:getfield        #195 <Field IOContext _ioContext>
	//  112  208:aload           6
	//  113  210:invokevirtual   #362 <Method void IOContext.releaseBase64Buffer(byte[])>
		throw base64variant;
	//  114  213:aload_1         
	//  115  214:athrow          
	}

	public void writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
		throws IOException, JsonGenerationException
	{
		_verifyValueWrite("write a binary value");
	//    0    0:aload_0         
	//    1    1:ldc2            #325 <String "write a binary value">
	//    2    4:invokevirtual   #327 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #59  <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #48  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #62  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #46  <Field char[] _outputBuffer>
	//   12   26:astore          6
		int k = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #59  <Field int _outputTail>
	//   15   32:istore          5
		_outputTail = k + 1;
	//   16   34:aload_0         
	//   17   35:iload           5
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #59  <Field int _outputTail>
		ac[k] = _quoteChar;
	//   21   42:aload           6
	//   22   44:iload           5
	//   23   46:aload_0         
	//   24   47:getfield        #37  <Field char _quoteChar>
	//   25   50:castore         
		_writeBinary(base64variant, abyte0, i, j + i);
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:aload_2         
	//   29   54:iload_3         
	//   30   55:iload           4
	//   31   57:iload_3         
	//   32   58:iadd            
	//   33   59:invokevirtual   #364 <Method void _writeBinary(Base64Variant, byte[], int, int)>
		if(_outputTail >= _outputEnd)
	//*  34   62:aload_0         
	//*  35   63:getfield        #59  <Field int _outputTail>
	//*  36   66:aload_0         
	//*  37   67:getfield        #48  <Field int _outputEnd>
	//*  38   70:icmplt          77
			_flushBuffer();
	//   39   73:aload_0         
	//   40   74:invokevirtual   #62  <Method void _flushBuffer()>
		base64variant = ((Base64Variant) (_outputBuffer));
	//   41   77:aload_0         
	//   42   78:getfield        #46  <Field char[] _outputBuffer>
	//   43   81:astore_1        
		i = _outputTail;
	//   44   82:aload_0         
	//   45   83:getfield        #59  <Field int _outputTail>
	//   46   86:istore_3        
		_outputTail = i + 1;
	//   47   87:aload_0         
	//   48   88:iload_3         
	//   49   89:iconst_1        
	//   50   90:iadd            
	//   51   91:putfield        #59  <Field int _outputTail>
		base64variant[i] = _quoteChar;
	//   52   94:aload_1         
	//   53   95:iload_3         
	//   54   96:aload_0         
	//   55   97:getfield        #37  <Field char _quoteChar>
	//   56  100:castore         
	//   57  101:return          
	}

	public void writeBoolean(boolean flag)
		throws IOException
	{
		_verifyValueWrite("write a boolean value");
	//    0    0:aload_0         
	//    1    1:ldc2            #368 <String "write a boolean value">
	//    2    4:invokevirtual   #327 <Method void _verifyValueWrite(String)>
		if(_outputTail + 5 >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #59  <Field int _outputTail>
	//*   5   11:iconst_5        
	//*   6   12:iadd            
	//*   7   13:aload_0         
	//*   8   14:getfield        #48  <Field int _outputEnd>
	//*   9   17:icmplt          24
			_flushBuffer();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #62  <Method void _flushBuffer()>
		int i = _outputTail;
	//   12   24:aload_0         
	//   13   25:getfield        #59  <Field int _outputTail>
	//   14   28:istore_2        
		char ac[] = _outputBuffer;
	//   15   29:aload_0         
	//   16   30:getfield        #46  <Field char[] _outputBuffer>
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
	//   89  118:putfield        #59  <Field int _outputTail>
	//   90  121:return          
	}

	public void writeEndArray()
		throws IOException
	{
		if(!_writeContext.inArray())
	//*   0    0:aload_0         
	//*   1    1:getfield        #209 <Field JsonWriteContext _writeContext>
	//*   2    4:invokevirtual   #369 <Method boolean JsonWriteContext.inArray()>
	//*   3    7:ifne            46
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4   10:new             #337 <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #339 <Method void StringBuilder()>
	//    7   17:astore_2        
			stringbuilder.append("Current context not Array but ");
	//    8   18:aload_2         
	//    9   19:ldc2            #371 <String "Current context not Array but ">
	//   10   22:invokevirtual   #345 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:pop             
			stringbuilder.append(_writeContext.typeDesc());
	//   12   26:aload_2         
	//   13   27:aload_0         
	//   14   28:getfield        #209 <Field JsonWriteContext _writeContext>
	//   15   31:invokevirtual   #374 <Method String JsonWriteContext.typeDesc()>
	//   16   34:invokevirtual   #345 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
			_reportError(stringbuilder.toString());
	//   18   38:aload_0         
	//   19   39:aload_2         
	//   20   40:invokevirtual   #355 <Method String StringBuilder.toString()>
	//   21   43:invokevirtual   #358 <Method void _reportError(String)>
		}
		if(_cfgPrettyPrinter != null)
	//*  22   46:aload_0         
	//*  23   47:getfield        #218 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  24   50:ifnull          73
		{
			_cfgPrettyPrinter.writeEndArray(((com.fasterxml.jackson.core.JsonGenerator) (this)), _writeContext.getEntryCount());
	//   25   53:aload_0         
	//   26   54:getfield        #218 <Field PrettyPrinter _cfgPrettyPrinter>
	//   27   57:aload_0         
	//   28   58:aload_0         
	//   29   59:getfield        #209 <Field JsonWriteContext _writeContext>
	//   30   62:invokevirtual   #377 <Method int JsonWriteContext.getEntryCount()>
	//   31   65:invokeinterface #380 <Method void PrettyPrinter.writeEndArray(com.fasterxml.jackson.core.JsonGenerator, int)>
		} else
	//*  32   70:goto            110
		{
			if(_outputTail >= _outputEnd)
	//*  33   73:aload_0         
	//*  34   74:getfield        #59  <Field int _outputTail>
	//*  35   77:aload_0         
	//*  36   78:getfield        #48  <Field int _outputEnd>
	//*  37   81:icmplt          88
				_flushBuffer();
	//   38   84:aload_0         
	//   39   85:invokevirtual   #62  <Method void _flushBuffer()>
			char ac[] = _outputBuffer;
	//   40   88:aload_0         
	//   41   89:getfield        #46  <Field char[] _outputBuffer>
	//   42   92:astore_2        
			int i = _outputTail;
	//   43   93:aload_0         
	//   44   94:getfield        #59  <Field int _outputTail>
	//   45   97:istore_1        
			_outputTail = i + 1;
	//   46   98:aload_0         
	//   47   99:iload_1         
	//   48  100:iconst_1        
	//   49  101:iadd            
	//   50  102:putfield        #59  <Field int _outputTail>
			ac[i] = ']';
	//   51  105:aload_2         
	//   52  106:iload_1         
	//   53  107:bipush          93
	//   54  109:castore         
		}
		_writeContext = _writeContext.clearAndGetParent();
	//   55  110:aload_0         
	//   56  111:aload_0         
	//   57  112:getfield        #209 <Field JsonWriteContext _writeContext>
	//   58  115:invokevirtual   #384 <Method JsonWriteContext JsonWriteContext.clearAndGetParent()>
	//   59  118:putfield        #209 <Field JsonWriteContext _writeContext>
	//   60  121:return          
	}

	public void writeEndObject()
		throws IOException
	{
		if(!_writeContext.inObject())
	//*   0    0:aload_0         
	//*   1    1:getfield        #209 <Field JsonWriteContext _writeContext>
	//*   2    4:invokevirtual   #385 <Method boolean JsonWriteContext.inObject()>
	//*   3    7:ifne            46
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4   10:new             #337 <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #339 <Method void StringBuilder()>
	//    7   17:astore_2        
			stringbuilder.append("Current context not Object but ");
	//    8   18:aload_2         
	//    9   19:ldc2            #387 <String "Current context not Object but ">
	//   10   22:invokevirtual   #345 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:pop             
			stringbuilder.append(_writeContext.typeDesc());
	//   12   26:aload_2         
	//   13   27:aload_0         
	//   14   28:getfield        #209 <Field JsonWriteContext _writeContext>
	//   15   31:invokevirtual   #374 <Method String JsonWriteContext.typeDesc()>
	//   16   34:invokevirtual   #345 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
			_reportError(stringbuilder.toString());
	//   18   38:aload_0         
	//   19   39:aload_2         
	//   20   40:invokevirtual   #355 <Method String StringBuilder.toString()>
	//   21   43:invokevirtual   #358 <Method void _reportError(String)>
		}
		if(_cfgPrettyPrinter != null)
	//*  22   46:aload_0         
	//*  23   47:getfield        #218 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  24   50:ifnull          73
		{
			_cfgPrettyPrinter.writeEndObject(((com.fasterxml.jackson.core.JsonGenerator) (this)), _writeContext.getEntryCount());
	//   25   53:aload_0         
	//   26   54:getfield        #218 <Field PrettyPrinter _cfgPrettyPrinter>
	//   27   57:aload_0         
	//   28   58:aload_0         
	//   29   59:getfield        #209 <Field JsonWriteContext _writeContext>
	//   30   62:invokevirtual   #377 <Method int JsonWriteContext.getEntryCount()>
	//   31   65:invokeinterface #389 <Method void PrettyPrinter.writeEndObject(com.fasterxml.jackson.core.JsonGenerator, int)>
		} else
	//*  32   70:goto            110
		{
			if(_outputTail >= _outputEnd)
	//*  33   73:aload_0         
	//*  34   74:getfield        #59  <Field int _outputTail>
	//*  35   77:aload_0         
	//*  36   78:getfield        #48  <Field int _outputEnd>
	//*  37   81:icmplt          88
				_flushBuffer();
	//   38   84:aload_0         
	//   39   85:invokevirtual   #62  <Method void _flushBuffer()>
			char ac[] = _outputBuffer;
	//   40   88:aload_0         
	//   41   89:getfield        #46  <Field char[] _outputBuffer>
	//   42   92:astore_2        
			int i = _outputTail;
	//   43   93:aload_0         
	//   44   94:getfield        #59  <Field int _outputTail>
	//   45   97:istore_1        
			_outputTail = i + 1;
	//   46   98:aload_0         
	//   47   99:iload_1         
	//   48  100:iconst_1        
	//   49  101:iadd            
	//   50  102:putfield        #59  <Field int _outputTail>
			ac[i] = '}';
	//   51  105:aload_2         
	//   52  106:iload_1         
	//   53  107:bipush          125
	//   54  109:castore         
		}
		_writeContext = _writeContext.clearAndGetParent();
	//   55  110:aload_0         
	//   56  111:aload_0         
	//   57  112:getfield        #209 <Field JsonWriteContext _writeContext>
	//   58  115:invokevirtual   #384 <Method JsonWriteContext JsonWriteContext.clearAndGetParent()>
	//   59  118:putfield        #209 <Field JsonWriteContext _writeContext>
	//   60  121:return          
	}

	public void writeFieldName(SerializableString serializablestring)
		throws IOException
	{
		int i = _writeContext.writeFieldName(serializablestring.getValue());
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field JsonWriteContext _writeContext>
	//    2    4:aload_1         
	//    3    5:invokeinterface #80  <Method String SerializableString.getValue()>
	//    4   10:invokevirtual   #394 <Method int JsonWriteContext.writeFieldName(String)>
	//    5   13:istore_2        
		if(i == 4)
	//*   6   14:iload_2         
	//*   7   15:iconst_4        
	//*   8   16:icmpne          26
			_reportError("Can not write a field name, expecting a value");
	//    9   19:aload_0         
	//   10   20:ldc2            #396 <String "Can not write a field name, expecting a value">
	//   11   23:invokevirtual   #358 <Method void _reportError(String)>
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
	//   23   41:invokevirtual   #398 <Method void _writeFieldName(SerializableString, boolean)>
	//   24   44:return          
	}

	public void writeFieldName(String s)
		throws IOException
	{
		int i = _writeContext.writeFieldName(s);
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field JsonWriteContext _writeContext>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #394 <Method int JsonWriteContext.writeFieldName(String)>
	//    4    8:istore_2        
		if(i == 4)
	//*   5    9:iload_2         
	//*   6   10:iconst_4        
	//*   7   11:icmpne          21
			_reportError("Can not write a field name, expecting a value");
	//    8   14:aload_0         
	//    9   15:ldc2            #396 <String "Can not write a field name, expecting a value">
	//   10   18:invokevirtual   #358 <Method void _reportError(String)>
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
	//   22   36:invokevirtual   #400 <Method void _writeFieldName(String, boolean)>
	//   23   39:return          
	}

	public void writeNull()
		throws IOException
	{
		_verifyValueWrite("write a null");
	//    0    0:aload_0         
	//    1    1:ldc2            #403 <String "write a null">
	//    2    4:invokevirtual   #327 <Method void _verifyValueWrite(String)>
		_writeNull();
	//    3    7:aload_0         
	//    4    8:invokespecial   #405 <Method void _writeNull()>
	//    5   11:return          
	}

	public void writeNumber(double d)
		throws IOException
	{
		if(!_cfgNumbersAsStrings && (!isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS) || !Double.isNaN(d) && !Double.isInfinite(d)))
	//*   0    0:aload_0         
	//*   1    1:getfield        #410 <Field boolean _cfgNumbersAsStrings>
	//*   2    4:ifne            50
	//*   3    7:aload_0         
	//*   4    8:getstatic       #413 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.QUOTE_NON_NUMERIC_NUMBERS>
	//*   5   11:invokevirtual   #287 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*   6   14:ifeq            34
	//*   7   17:dload_1         
	//*   8   18:invokestatic    #419 <Method boolean Double.isNaN(double)>
	//*   9   21:ifne            50
	//*  10   24:dload_1         
	//*  11   25:invokestatic    #422 <Method boolean Double.isInfinite(double)>
	//*  12   28:ifeq            34
	//*  13   31:goto            50
		{
			_verifyValueWrite("write a number");
	//   14   34:aload_0         
	//   15   35:ldc2            #424 <String "write a number">
	//   16   38:invokevirtual   #327 <Method void _verifyValueWrite(String)>
			writeRaw(String.valueOf(d));
	//   17   41:aload_0         
	//   18   42:dload_1         
	//   19   43:invokestatic    #428 <Method String String.valueOf(double)>
	//   20   46:invokevirtual   #153 <Method void writeRaw(String)>
			return;
	//   21   49:return          
		} else
		{
			writeString(String.valueOf(d));
	//   22   50:aload_0         
	//   23   51:dload_1         
	//   24   52:invokestatic    #428 <Method String String.valueOf(double)>
	//   25   55:invokevirtual   #431 <Method void writeString(String)>
			return;
	//   26   58:return          
		}
	}

	public void writeNumber(float f)
		throws IOException
	{
		if(!_cfgNumbersAsStrings && (!isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS) || !Float.isNaN(f) && !Float.isInfinite(f)))
	//*   0    0:aload_0         
	//*   1    1:getfield        #410 <Field boolean _cfgNumbersAsStrings>
	//*   2    4:ifne            50
	//*   3    7:aload_0         
	//*   4    8:getstatic       #413 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.QUOTE_NON_NUMERIC_NUMBERS>
	//*   5   11:invokevirtual   #287 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//*   6   14:ifeq            34
	//*   7   17:fload_1         
	//*   8   18:invokestatic    #437 <Method boolean Float.isNaN(float)>
	//*   9   21:ifne            50
	//*  10   24:fload_1         
	//*  11   25:invokestatic    #439 <Method boolean Float.isInfinite(float)>
	//*  12   28:ifeq            34
	//*  13   31:goto            50
		{
			_verifyValueWrite("write a number");
	//   14   34:aload_0         
	//   15   35:ldc2            #424 <String "write a number">
	//   16   38:invokevirtual   #327 <Method void _verifyValueWrite(String)>
			writeRaw(String.valueOf(f));
	//   17   41:aload_0         
	//   18   42:fload_1         
	//   19   43:invokestatic    #442 <Method String String.valueOf(float)>
	//   20   46:invokevirtual   #153 <Method void writeRaw(String)>
			return;
	//   21   49:return          
		} else
		{
			writeString(String.valueOf(f));
	//   22   50:aload_0         
	//   23   51:fload_1         
	//   24   52:invokestatic    #442 <Method String String.valueOf(float)>
	//   25   55:invokevirtual   #431 <Method void writeString(String)>
			return;
	//   26   58:return          
		}
	}

	public void writeNumber(int i)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #424 <String "write a number">
	//    2    4:invokevirtual   #327 <Method void _verifyValueWrite(String)>
		if(_cfgNumbersAsStrings)
	//*   3    7:aload_0         
	//*   4    8:getfield        #410 <Field boolean _cfgNumbersAsStrings>
	//*   5   11:ifeq            20
		{
			_writeQuotedInt(i);
	//    6   14:aload_0         
	//    7   15:iload_1         
	//    8   16:invokespecial   #444 <Method void _writeQuotedInt(int)>
			return;
	//    9   19:return          
		}
		if(_outputTail + 11 >= _outputEnd)
	//*  10   20:aload_0         
	//*  11   21:getfield        #59  <Field int _outputTail>
	//*  12   24:bipush          11
	//*  13   26:iadd            
	//*  14   27:aload_0         
	//*  15   28:getfield        #48  <Field int _outputEnd>
	//*  16   31:icmplt          38
			_flushBuffer();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #62  <Method void _flushBuffer()>
		_outputTail = NumberOutput.outputInt(i, _outputBuffer, _outputTail);
	//   19   38:aload_0         
	//   20   39:iload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #46  <Field char[] _outputBuffer>
	//   23   44:aload_0         
	//   24   45:getfield        #59  <Field int _outputTail>
	//   25   48:invokestatic    #143 <Method int NumberOutput.outputInt(int, char[], int)>
	//   26   51:putfield        #59  <Field int _outputTail>
	//   27   54:return          
	}

	public void writeNumber(long l)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #424 <String "write a number">
	//    2    4:invokevirtual   #327 <Method void _verifyValueWrite(String)>
		if(_cfgNumbersAsStrings)
	//*   3    7:aload_0         
	//*   4    8:getfield        #410 <Field boolean _cfgNumbersAsStrings>
	//*   5   11:ifeq            20
		{
			_writeQuotedLong(l);
	//    6   14:aload_0         
	//    7   15:lload_1         
	//    8   16:invokespecial   #446 <Method void _writeQuotedLong(long)>
			return;
	//    9   19:return          
		}
		if(_outputTail + 21 >= _outputEnd)
	//*  10   20:aload_0         
	//*  11   21:getfield        #59  <Field int _outputTail>
	//*  12   24:bipush          21
	//*  13   26:iadd            
	//*  14   27:aload_0         
	//*  15   28:getfield        #48  <Field int _outputEnd>
	//*  16   31:icmplt          38
			_flushBuffer();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #62  <Method void _flushBuffer()>
		_outputTail = NumberOutput.outputLong(l, _outputBuffer, _outputTail);
	//   19   38:aload_0         
	//   20   39:lload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #46  <Field char[] _outputBuffer>
	//   23   44:aload_0         
	//   24   45:getfield        #59  <Field int _outputTail>
	//   25   48:invokestatic    #149 <Method int NumberOutput.outputLong(long, char[], int)>
	//   26   51:putfield        #59  <Field int _outputTail>
	//   27   54:return          
	}

	public void writeNumber(String s)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #424 <String "write a number">
	//    2    4:invokevirtual   #327 <Method void _verifyValueWrite(String)>
		if(_cfgNumbersAsStrings)
	//*   3    7:aload_0         
	//*   4    8:getfield        #410 <Field boolean _cfgNumbersAsStrings>
	//*   5   11:ifeq            20
		{
			_writeQuotedRaw(s);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokespecial   #448 <Method void _writeQuotedRaw(String)>
			return;
	//    9   19:return          
		} else
		{
			writeRaw(s);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #153 <Method void writeRaw(String)>
			return;
	//   13   25:return          
		}
	}

	public void writeNumber(BigDecimal bigdecimal)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #424 <String "write a number">
	//    2    4:invokevirtual   #327 <Method void _verifyValueWrite(String)>
		if(bigdecimal == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       16
		{
			_writeNull();
	//    5   11:aload_0         
	//    6   12:invokespecial   #405 <Method void _writeNull()>
			return;
	//    7   15:return          
		}
		if(_cfgNumbersAsStrings)
	//*   8   16:aload_0         
	//*   9   17:getfield        #410 <Field boolean _cfgNumbersAsStrings>
	//*  10   20:ifeq            33
		{
			_writeQuotedRaw(_asString(bigdecimal));
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #453 <Method String _asString(BigDecimal)>
	//   15   29:invokespecial   #448 <Method void _writeQuotedRaw(String)>
			return;
	//   16   32:return          
		} else
		{
			writeRaw(_asString(bigdecimal));
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #453 <Method String _asString(BigDecimal)>
	//   21   39:invokevirtual   #153 <Method void writeRaw(String)>
			return;
	//   22   42:return          
		}
	}

	public void writeNumber(BigInteger biginteger)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #424 <String "write a number">
	//    2    4:invokevirtual   #327 <Method void _verifyValueWrite(String)>
		if(biginteger == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       16
		{
			_writeNull();
	//    5   11:aload_0         
	//    6   12:invokespecial   #405 <Method void _writeNull()>
			return;
	//    7   15:return          
		}
		if(_cfgNumbersAsStrings)
	//*   8   16:aload_0         
	//*   9   17:getfield        #410 <Field boolean _cfgNumbersAsStrings>
	//*  10   20:ifeq            32
		{
			_writeQuotedRaw(biginteger.toString());
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #457 <Method String BigInteger.toString()>
	//   14   28:invokespecial   #448 <Method void _writeQuotedRaw(String)>
			return;
	//   15   31:return          
		} else
		{
			writeRaw(biginteger.toString());
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #457 <Method String BigInteger.toString()>
	//   19   37:invokevirtual   #153 <Method void writeRaw(String)>
			return;
	//   20   40:return          
		}
	}

	public void writeNumber(short word0)
		throws IOException
	{
		_verifyValueWrite("write a number");
	//    0    0:aload_0         
	//    1    1:ldc2            #424 <String "write a number">
	//    2    4:invokevirtual   #327 <Method void _verifyValueWrite(String)>
		if(_cfgNumbersAsStrings)
	//*   3    7:aload_0         
	//*   4    8:getfield        #410 <Field boolean _cfgNumbersAsStrings>
	//*   5   11:ifeq            20
		{
			_writeQuotedShort(word0);
	//    6   14:aload_0         
	//    7   15:iload_1         
	//    8   16:invokespecial   #459 <Method void _writeQuotedShort(short)>
			return;
	//    9   19:return          
		}
		if(_outputTail + 6 >= _outputEnd)
	//*  10   20:aload_0         
	//*  11   21:getfield        #59  <Field int _outputTail>
	//*  12   24:bipush          6
	//*  13   26:iadd            
	//*  14   27:aload_0         
	//*  15   28:getfield        #48  <Field int _outputEnd>
	//*  16   31:icmplt          38
			_flushBuffer();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #62  <Method void _flushBuffer()>
		_outputTail = NumberOutput.outputInt(((int) (word0)), _outputBuffer, _outputTail);
	//   19   38:aload_0         
	//   20   39:iload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #46  <Field char[] _outputBuffer>
	//   23   44:aload_0         
	//   24   45:getfield        #59  <Field int _outputTail>
	//   25   48:invokestatic    #143 <Method int NumberOutput.outputInt(int, char[], int)>
	//   26   51:putfield        #59  <Field int _outputTail>
	//   27   54:return          
	}

	public void writeRaw(char c)
		throws IOException
	{
		if(_outputTail >= _outputEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field int _outputTail>
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field int _outputEnd>
	//*   4    8:icmplt          15
			_flushBuffer();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #62  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//    7   15:aload_0         
	//    8   16:getfield        #46  <Field char[] _outputBuffer>
	//    9   19:astore_3        
		int i = _outputTail;
	//   10   20:aload_0         
	//   11   21:getfield        #59  <Field int _outputTail>
	//   12   24:istore_2        
		_outputTail = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #59  <Field int _outputTail>
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
	//    2    2:invokeinterface #80  <Method String SerializableString.getValue()>
	//    3    7:invokevirtual   #153 <Method void writeRaw(String)>
	//    4   10:return          
	}

	public void writeRaw(String s)
		throws IOException
	{
		int k = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #86  <Method int String.length()>
	//    2    4:istore          4
		int j = _outputEnd - _outputTail;
	//    3    6:aload_0         
	//    4    7:getfield        #48  <Field int _outputEnd>
	//    5   10:aload_0         
	//    6   11:getfield        #59  <Field int _outputTail>
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
	//   14   23:invokevirtual   #62  <Method void _flushBuffer()>
			i = _outputEnd - _outputTail;
	//   15   26:aload_0         
	//   16   27:getfield        #48  <Field int _outputEnd>
	//   17   30:aload_0         
	//   18   31:getfield        #59  <Field int _outputTail>
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
	//   28   47:getfield        #46  <Field char[] _outputBuffer>
	//   29   50:aload_0         
	//   30   51:getfield        #59  <Field int _outputTail>
	//   31   54:invokevirtual   #96  <Method void String.getChars(int, int, char[], int)>
			_outputTail = _outputTail + k;
	//   32   57:aload_0         
	//   33   58:aload_0         
	//   34   59:getfield        #59  <Field int _outputTail>
	//   35   62:iload           4
	//   36   64:iadd            
	//   37   65:putfield        #59  <Field int _outputTail>
			return;
	//   38   68:return          
		} else
		{
			writeRawLong(s);
	//   39   69:aload_0         
	//   40   70:aload_1         
	//   41   71:invokespecial   #462 <Method void writeRawLong(String)>
			return;
	//   42   74:return          
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
	//*   5    8:getfield        #48  <Field int _outputEnd>
	//*   6   11:aload_0         
	//*   7   12:getfield        #59  <Field int _outputTail>
	//*   8   15:isub            
	//*   9   16:icmple          23
				_flushBuffer();
	//   10   19:aload_0         
	//   11   20:invokevirtual   #62  <Method void _flushBuffer()>
			System.arraycopy(((Object) (ac)), i, ((Object) (_outputBuffer)), _outputTail, j);
	//   12   23:aload_1         
	//   13   24:iload_2         
	//   14   25:aload_0         
	//   15   26:getfield        #46  <Field char[] _outputBuffer>
	//   16   29:aload_0         
	//   17   30:getfield        #59  <Field int _outputTail>
	//   18   33:iload_3         
	//   19   34:invokestatic    #185 <Method void System.arraycopy(Object, int, Object, int, int)>
			_outputTail = _outputTail + j;
	//   20   37:aload_0         
	//   21   38:aload_0         
	//   22   39:getfield        #59  <Field int _outputTail>
	//   23   42:iload_3         
	//   24   43:iadd            
	//   25   44:putfield        #59  <Field int _outputTail>
			return;
	//   26   47:return          
		} else
		{
			_flushBuffer();
	//   27   48:aload_0         
	//   28   49:invokevirtual   #62  <Method void _flushBuffer()>
			_writer.write(ac, i, j);
	//   29   52:aload_0         
	//   30   53:getfield        #39  <Field Writer _writer>
	//   31   56:aload_1         
	//   32   57:iload_2         
	//   33   58:iload_3         
	//   34   59:invokevirtual   #104 <Method void Writer.write(char[], int, int)>
			return;
	//   35   62:return          
		}
	}

	public void writeStartArray()
		throws IOException
	{
		_verifyValueWrite("start an array");
	//    0    0:aload_0         
	//    1    1:ldc2            #465 <String "start an array">
	//    2    4:invokevirtual   #327 <Method void _verifyValueWrite(String)>
		_writeContext = _writeContext.createChildArrayContext();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #209 <Field JsonWriteContext _writeContext>
	//    6   12:invokevirtual   #468 <Method JsonWriteContext JsonWriteContext.createChildArrayContext()>
	//    7   15:putfield        #209 <Field JsonWriteContext _writeContext>
		if(_cfgPrettyPrinter != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #218 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  10   22:ifnull          36
		{
			_cfgPrettyPrinter.writeStartArray(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   11   25:aload_0         
	//   12   26:getfield        #218 <Field PrettyPrinter _cfgPrettyPrinter>
	//   13   29:aload_0         
	//   14   30:invokeinterface #470 <Method void PrettyPrinter.writeStartArray(com.fasterxml.jackson.core.JsonGenerator)>
			return;
	//   15   35:return          
		}
		if(_outputTail >= _outputEnd)
	//*  16   36:aload_0         
	//*  17   37:getfield        #59  <Field int _outputTail>
	//*  18   40:aload_0         
	//*  19   41:getfield        #48  <Field int _outputEnd>
	//*  20   44:icmplt          51
			_flushBuffer();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #62  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//   23   51:aload_0         
	//   24   52:getfield        #46  <Field char[] _outputBuffer>
	//   25   55:astore_2        
		int i = _outputTail;
	//   26   56:aload_0         
	//   27   57:getfield        #59  <Field int _outputTail>
	//   28   60:istore_1        
		_outputTail = i + 1;
	//   29   61:aload_0         
	//   30   62:iload_1         
	//   31   63:iconst_1        
	//   32   64:iadd            
	//   33   65:putfield        #59  <Field int _outputTail>
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
	//    1    1:ldc2            #473 <String "start an object">
	//    2    4:invokevirtual   #327 <Method void _verifyValueWrite(String)>
		_writeContext = _writeContext.createChildObjectContext();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #209 <Field JsonWriteContext _writeContext>
	//    6   12:invokevirtual   #476 <Method JsonWriteContext JsonWriteContext.createChildObjectContext()>
	//    7   15:putfield        #209 <Field JsonWriteContext _writeContext>
		if(_cfgPrettyPrinter != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #218 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  10   22:ifnull          36
		{
			_cfgPrettyPrinter.writeStartObject(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   11   25:aload_0         
	//   12   26:getfield        #218 <Field PrettyPrinter _cfgPrettyPrinter>
	//   13   29:aload_0         
	//   14   30:invokeinterface #478 <Method void PrettyPrinter.writeStartObject(com.fasterxml.jackson.core.JsonGenerator)>
			return;
	//   15   35:return          
		}
		if(_outputTail >= _outputEnd)
	//*  16   36:aload_0         
	//*  17   37:getfield        #59  <Field int _outputTail>
	//*  18   40:aload_0         
	//*  19   41:getfield        #48  <Field int _outputEnd>
	//*  20   44:icmplt          51
			_flushBuffer();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #62  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//   23   51:aload_0         
	//   24   52:getfield        #46  <Field char[] _outputBuffer>
	//   25   55:astore_2        
		int i = _outputTail;
	//   26   56:aload_0         
	//   27   57:getfield        #59  <Field int _outputTail>
	//   28   60:istore_1        
		_outputTail = i + 1;
	//   29   61:aload_0         
	//   30   62:iload_1         
	//   31   63:iconst_1        
	//   32   64:iadd            
	//   33   65:putfield        #59  <Field int _outputTail>
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
	//    1    1:ldc2            #473 <String "start an object">
	//    2    4:invokevirtual   #327 <Method void _verifyValueWrite(String)>
		JsonWriteContext jsonwritecontext = _writeContext.createChildObjectContext();
	//    3    7:aload_0         
	//    4    8:getfield        #209 <Field JsonWriteContext _writeContext>
	//    5   11:invokevirtual   #476 <Method JsonWriteContext JsonWriteContext.createChildObjectContext()>
	//    6   14:astore_3        
		_writeContext = jsonwritecontext;
	//    7   15:aload_0         
	//    8   16:aload_3         
	//    9   17:putfield        #209 <Field JsonWriteContext _writeContext>
		if(obj != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          29
			jsonwritecontext.setCurrentValue(obj);
	//   12   24:aload_3         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #482 <Method void JsonWriteContext.setCurrentValue(Object)>
		if(_cfgPrettyPrinter != null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #218 <Field PrettyPrinter _cfgPrettyPrinter>
	//*  17   33:ifnull          47
		{
			_cfgPrettyPrinter.writeStartObject(((com.fasterxml.jackson.core.JsonGenerator) (this)));
	//   18   36:aload_0         
	//   19   37:getfield        #218 <Field PrettyPrinter _cfgPrettyPrinter>
	//   20   40:aload_0         
	//   21   41:invokeinterface #478 <Method void PrettyPrinter.writeStartObject(com.fasterxml.jackson.core.JsonGenerator)>
			return;
	//   22   46:return          
		}
		if(_outputTail >= _outputEnd)
	//*  23   47:aload_0         
	//*  24   48:getfield        #59  <Field int _outputTail>
	//*  25   51:aload_0         
	//*  26   52:getfield        #48  <Field int _outputEnd>
	//*  27   55:icmplt          62
			_flushBuffer();
	//   28   58:aload_0         
	//   29   59:invokevirtual   #62  <Method void _flushBuffer()>
		obj = ((Object) (_outputBuffer));
	//   30   62:aload_0         
	//   31   63:getfield        #46  <Field char[] _outputBuffer>
	//   32   66:astore_1        
		int i = _outputTail;
	//   33   67:aload_0         
	//   34   68:getfield        #59  <Field int _outputTail>
	//   35   71:istore_2        
		_outputTail = i + 1;
	//   36   72:aload_0         
	//   37   73:iload_2         
	//   38   74:iconst_1        
	//   39   75:iadd            
	//   40   76:putfield        #59  <Field int _outputTail>
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
	//    1    1:ldc2            #484 <String "write a string">
	//    2    4:invokevirtual   #327 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #59  <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #48  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #62  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #46  <Field char[] _outputBuffer>
	//   12   26:astore_3        
		int i = _outputTail;
	//   13   27:aload_0         
	//   14   28:getfield        #59  <Field int _outputTail>
	//   15   31:istore_2        
		_outputTail = i + 1;
	//   16   32:aload_0         
	//   17   33:iload_2         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:putfield        #59  <Field int _outputTail>
		ac[i] = _quoteChar;
	//   21   39:aload_3         
	//   22   40:iload_2         
	//   23   41:aload_0         
	//   24   42:getfield        #37  <Field char _quoteChar>
	//   25   45:castore         
		serializablestring = ((SerializableString) (serializablestring.asQuotedChars()));
	//   26   46:aload_1         
	//   27   47:invokeinterface #254 <Method char[] SerializableString.asQuotedChars()>
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
	//*  37   64:getfield        #48  <Field int _outputEnd>
	//*  38   67:aload_0         
	//*  39   68:getfield        #59  <Field int _outputTail>
	//*  40   71:isub            
	//*  41   72:icmple          79
				_flushBuffer();
	//   42   75:aload_0         
	//   43   76:invokevirtual   #62  <Method void _flushBuffer()>
			System.arraycopy(((Object) (serializablestring)), 0, ((Object) (_outputBuffer)), _outputTail, i);
	//   44   79:aload_1         
	//   45   80:iconst_0        
	//   46   81:aload_0         
	//   47   82:getfield        #46  <Field char[] _outputBuffer>
	//   48   85:aload_0         
	//   49   86:getfield        #59  <Field int _outputTail>
	//   50   89:iload_2         
	//   51   90:invokestatic    #185 <Method void System.arraycopy(Object, int, Object, int, int)>
			_outputTail = _outputTail + i;
	//   52   93:aload_0         
	//   53   94:aload_0         
	//   54   95:getfield        #59  <Field int _outputTail>
	//   55   98:iload_2         
	//   56   99:iadd            
	//   57  100:putfield        #59  <Field int _outputTail>
		} else
	//*  58  103:goto            120
		{
			_flushBuffer();
	//   59  106:aload_0         
	//   60  107:invokevirtual   #62  <Method void _flushBuffer()>
			_writer.write(((char []) (serializablestring)), 0, i);
	//   61  110:aload_0         
	//   62  111:getfield        #39  <Field Writer _writer>
	//   63  114:aload_1         
	//   64  115:iconst_0        
	//   65  116:iload_2         
	//   66  117:invokevirtual   #104 <Method void Writer.write(char[], int, int)>
		}
		if(_outputTail >= _outputEnd)
	//*  67  120:aload_0         
	//*  68  121:getfield        #59  <Field int _outputTail>
	//*  69  124:aload_0         
	//*  70  125:getfield        #48  <Field int _outputEnd>
	//*  71  128:icmplt          135
			_flushBuffer();
	//   72  131:aload_0         
	//   73  132:invokevirtual   #62  <Method void _flushBuffer()>
		serializablestring = ((SerializableString) (_outputBuffer));
	//   74  135:aload_0         
	//   75  136:getfield        #46  <Field char[] _outputBuffer>
	//   76  139:astore_1        
		i = _outputTail;
	//   77  140:aload_0         
	//   78  141:getfield        #59  <Field int _outputTail>
	//   79  144:istore_2        
		_outputTail = i + 1;
	//   80  145:aload_0         
	//   81  146:iload_2         
	//   82  147:iconst_1        
	//   83  148:iadd            
	//   84  149:putfield        #59  <Field int _outputTail>
		serializablestring[i] = _quoteChar;
	//   85  152:aload_1         
	//   86  153:iload_2         
	//   87  154:aload_0         
	//   88  155:getfield        #37  <Field char _quoteChar>
	//   89  158:castore         
	//   90  159:return          
	}

	public void writeString(String s)
		throws IOException
	{
		_verifyValueWrite("write a string");
	//    0    0:aload_0         
	//    1    1:ldc2            #484 <String "write a string">
	//    2    4:invokevirtual   #327 <Method void _verifyValueWrite(String)>
		if(s == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       16
		{
			_writeNull();
	//    5   11:aload_0         
	//    6   12:invokespecial   #405 <Method void _writeNull()>
			return;
	//    7   15:return          
		}
		if(_outputTail >= _outputEnd)
	//*   8   16:aload_0         
	//*   9   17:getfield        #59  <Field int _outputTail>
	//*  10   20:aload_0         
	//*  11   21:getfield        #48  <Field int _outputEnd>
	//*  12   24:icmplt          31
			_flushBuffer();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #62  <Method void _flushBuffer()>
		char ac[] = _outputBuffer;
	//   15   31:aload_0         
	//   16   32:getfield        #46  <Field char[] _outputBuffer>
	//   17   35:astore_3        
		int i = _outputTail;
	//   18   36:aload_0         
	//   19   37:getfield        #59  <Field int _outputTail>
	//   20   40:istore_2        
		_outputTail = i + 1;
	//   21   41:aload_0         
	//   22   42:iload_2         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:putfield        #59  <Field int _outputTail>
		ac[i] = _quoteChar;
	//   26   48:aload_3         
	//   27   49:iload_2         
	//   28   50:aload_0         
	//   29   51:getfield        #37  <Field char _quoteChar>
	//   30   54:castore         
		_writeString(s);
	//   31   55:aload_0         
	//   32   56:aload_1         
	//   33   57:invokespecial   #265 <Method void _writeString(String)>
		if(_outputTail >= _outputEnd)
	//*  34   60:aload_0         
	//*  35   61:getfield        #59  <Field int _outputTail>
	//*  36   64:aload_0         
	//*  37   65:getfield        #48  <Field int _outputEnd>
	//*  38   68:icmplt          75
			_flushBuffer();
	//   39   71:aload_0         
	//   40   72:invokevirtual   #62  <Method void _flushBuffer()>
		s = ((String) (_outputBuffer));
	//   41   75:aload_0         
	//   42   76:getfield        #46  <Field char[] _outputBuffer>
	//   43   79:astore_1        
		i = _outputTail;
	//   44   80:aload_0         
	//   45   81:getfield        #59  <Field int _outputTail>
	//   46   84:istore_2        
		_outputTail = i + 1;
	//   47   85:aload_0         
	//   48   86:iload_2         
	//   49   87:iconst_1        
	//   50   88:iadd            
	//   51   89:putfield        #59  <Field int _outputTail>
		s[i] = _quoteChar;
	//   52   92:aload_1         
	//   53   93:iload_2         
	//   54   94:aload_0         
	//   55   95:getfield        #37  <Field char _quoteChar>
	//   56   98:castore         
	//   57   99:return          
	}

	public void writeString(char ac[], int i, int j)
		throws IOException
	{
		_verifyValueWrite("write a string");
	//    0    0:aload_0         
	//    1    1:ldc2            #484 <String "write a string">
	//    2    4:invokevirtual   #327 <Method void _verifyValueWrite(String)>
		if(_outputTail >= _outputEnd)
	//*   3    7:aload_0         
	//*   4    8:getfield        #59  <Field int _outputTail>
	//*   5   11:aload_0         
	//*   6   12:getfield        #48  <Field int _outputEnd>
	//*   7   15:icmplt          22
			_flushBuffer();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #62  <Method void _flushBuffer()>
		char ac1[] = _outputBuffer;
	//   10   22:aload_0         
	//   11   23:getfield        #46  <Field char[] _outputBuffer>
	//   12   26:astore          5
		int k = _outputTail;
	//   13   28:aload_0         
	//   14   29:getfield        #59  <Field int _outputTail>
	//   15   32:istore          4
		_outputTail = k + 1;
	//   16   34:aload_0         
	//   17   35:iload           4
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:putfield        #59  <Field int _outputTail>
		ac1[k] = _quoteChar;
	//   21   42:aload           5
	//   22   44:iload           4
	//   23   46:aload_0         
	//   24   47:getfield        #37  <Field char _quoteChar>
	//   25   50:castore         
		_writeString(ac, i, j);
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:iload_2         
	//   29   54:iload_3         
	//   30   55:invokespecial   #486 <Method void _writeString(char[], int, int)>
		if(_outputTail >= _outputEnd)
	//*  31   58:aload_0         
	//*  32   59:getfield        #59  <Field int _outputTail>
	//*  33   62:aload_0         
	//*  34   63:getfield        #48  <Field int _outputEnd>
	//*  35   66:icmplt          73
			_flushBuffer();
	//   36   69:aload_0         
	//   37   70:invokevirtual   #62  <Method void _flushBuffer()>
		ac = _outputBuffer;
	//   38   73:aload_0         
	//   39   74:getfield        #46  <Field char[] _outputBuffer>
	//   40   77:astore_1        
		i = _outputTail;
	//   41   78:aload_0         
	//   42   79:getfield        #59  <Field int _outputTail>
	//   43   82:istore_2        
		_outputTail = i + 1;
	//   44   83:aload_0         
	//   45   84:iload_2         
	//   46   85:iconst_1        
	//   47   86:iadd            
	//   48   87:putfield        #59  <Field int _outputTail>
		ac[i] = _quoteChar;
	//   49   90:aload_1         
	//   50   91:iload_2         
	//   51   92:aload_0         
	//   52   93:getfield        #37  <Field char _quoteChar>
	//   53   96:castore         
	//   54   97:return          
	}

	protected static final char HEX_CHARS[] = CharTypes.copyHexChars();
	protected char _charBuffer[];
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
	//    0    0:invokestatic    #27  <Method char[] CharTypes.copyHexChars()>
	//    1    3:putstatic       #29  <Field char[] HEX_CHARS>
	//*   2    6:return          
	}
}
