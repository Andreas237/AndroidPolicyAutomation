// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.util.AsIsEscapeUtil;
import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.spi.ScanException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package ch.qos.logback.core.pattern.parser:
//			TokenStream, Token

public class OptionTokenizer
{

	OptionTokenizer(TokenStream tokenstream)
	{
		this(tokenstream, ((IEscapeUtil) (new AsIsEscapeUtil())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #25  <Class AsIsEscapeUtil>
	//    3    5:dup             
	//    4    6:invokespecial   #28  <Method void AsIsEscapeUtil()>
	//    5    9:invokespecial   #31  <Method void OptionTokenizer(TokenStream, IEscapeUtil)>
	//    6   12:return          
	}

	OptionTokenizer(TokenStream tokenstream, IEscapeUtil iescapeutil)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		state = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #35  <Field int state>
		tokenStream = tokenstream;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #37  <Field TokenStream tokenStream>
		pattern = tokenstream.pattern;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #41  <Field String TokenStream.pattern>
	//   11   19:putfield        #42  <Field String pattern>
		patternLength = tokenstream.patternLength;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #44  <Field int TokenStream.patternLength>
	//   15   27:putfield        #45  <Field int patternLength>
		escapeUtil = iescapeutil;
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:putfield        #47  <Field IEscapeUtil escapeUtil>
	//   19   35:return          
	}

	void emitOptionToken(List list, List list1)
	{
		list.add(((Object) (new Token(1006, ((Object) (list1))))));
	//    0    0:aload_1         
	//    1    1:new             #51  <Class Token>
	//    2    4:dup             
	//    3    5:sipush          1006
	//    4    8:aload_2         
	//    5    9:invokespecial   #54  <Method void Token(int, Object)>
	//    6   12:invokeinterface #60  <Method boolean List.add(Object)>
	//    7   17:pop             
		tokenStream.state = TokenStream.TokenizerState.LITERAL_STATE;
	//    8   18:aload_0         
	//    9   19:getfield        #37  <Field TokenStream tokenStream>
	//   10   22:getstatic       #66  <Field TokenStream$TokenizerState TokenStream$TokenizerState.LITERAL_STATE>
	//   11   25:putfield        #68  <Field TokenStream$TokenizerState TokenStream.state>
	//   12   28:return          
	}

	void escape(String s, StringBuffer stringbuffer)
	{
		if(tokenStream.pointer < patternLength)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field TokenStream tokenStream>
	//*   2    4:getfield        #75  <Field int TokenStream.pointer>
	//*   3    7:aload_0         
	//*   4    8:getfield        #45  <Field int patternLength>
	//*   5   11:icmpge          69
		{
			String s1 = pattern;
	//    6   14:aload_0         
	//    7   15:getfield        #42  <Field String pattern>
	//    8   18:astore          5
			TokenStream tokenstream = tokenStream;
	//    9   20:aload_0         
	//   10   21:getfield        #37  <Field TokenStream tokenStream>
	//   11   24:astore          6
			int i = tokenstream.pointer;
	//   12   26:aload           6
	//   13   28:getfield        #75  <Field int TokenStream.pointer>
	//   14   31:istore          4
			tokenstream.pointer = i + 1;
	//   15   33:aload           6
	//   16   35:iload           4
	//   17   37:iconst_1        
	//   18   38:iadd            
	//   19   39:putfield        #75  <Field int TokenStream.pointer>
			char c = s1.charAt(i);
	//   20   42:aload           5
	//   21   44:iload           4
	//   22   46:invokevirtual   #81  <Method char String.charAt(int)>
	//   23   49:istore_3        
			escapeUtil.escape(s, stringbuffer, c, tokenStream.pointer);
	//   24   50:aload_0         
	//   25   51:getfield        #47  <Field IEscapeUtil escapeUtil>
	//   26   54:aload_1         
	//   27   55:aload_2         
	//   28   56:iload_3         
	//   29   57:aload_0         
	//   30   58:getfield        #37  <Field TokenStream tokenStream>
	//   31   61:getfield        #75  <Field int TokenStream.pointer>
	//   32   64:invokeinterface #86  <Method void IEscapeUtil.escape(String, StringBuffer, char, int)>
		}
	//   33   69:return          
	}

	void tokenize(char c, List list)
	{
		StringBuffer stringbuffer;
		ArrayList arraylist;
		stringbuffer = new StringBuffer();
	//    0    0:new             #90  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void StringBuffer()>
	//    3    7:astore          4
		arraylist = new ArrayList();
	//    4    9:new             #93  <Class ArrayList>
	//    5   12:dup             
	//    6   13:invokespecial   #94  <Method void ArrayList()>
	//    7   16:astore          5
_L13:
		if(tokenStream.pointer >= patternLength)
			break; /* Loop/switch isn't completed */
	//    8   18:aload_0         
	//    9   19:getfield        #37  <Field TokenStream tokenStream>
	//   10   22:getfield        #75  <Field int TokenStream.pointer>
	//   11   25:aload_0         
	//   12   26:getfield        #45  <Field int patternLength>
	//   13   29:icmpge          310
		state;
	//   14   32:aload_0         
	//   15   33:getfield        #35  <Field int state>
		JVM INSTR tableswitch 0 2: default 64
	//	               0 184
	//	               1 106
	//	               2 67;
	//   16   36:tableswitch     0 2: default 64
	//	               0 184
	//	               1 106
	//	               2 67
		   goto _L1 _L2 _L3 _L4
_L1:
		break; /* Loop/switch isn't completed */
	//   17   64:goto            277
_L4:
		if(c != quoteChar) goto _L6; else goto _L5
	//   18   67:iload_1         
	//   19   68:aload_0         
	//   20   69:getfield        #96  <Field char quoteChar>
	//   21   72:icmpne          84
_L5:
		String s = stringbuffer.toString();
	//   22   75:aload           4
	//   23   77:invokevirtual   #100 <Method String StringBuffer.toString()>
	//   24   80:astore_3        
		  goto _L7
	//*  25   81:goto            161
_L6:
		if(c == '\\')
	//*  26   84:iload_1         
	//*  27   85:bipush          92
	//*  28   87:icmpne          118
		{
			escape(String.valueOf(quoteChar), stringbuffer);
	//   29   90:aload_0         
	//   30   91:aload_0         
	//   31   92:getfield        #96  <Field char quoteChar>
	//   32   95:invokestatic    #104 <Method String String.valueOf(char)>
	//   33   98:aload           4
	//   34  100:invokevirtual   #106 <Method void escape(String, StringBuffer)>
			break; /* Loop/switch isn't completed */
	//   35  103:goto            277
		}
		  goto _L8
_L3:
		if(c == ',') goto _L10; else goto _L9
	//   36  106:iload_1         
	//   37  107:bipush          44
	//   38  109:icmpeq          152
_L9:
		if(c == '}') goto _L11; else goto _L8
	//   39  112:iload_1         
	//   40  113:bipush          125
	//   41  115:icmpeq          128
_L8:
		stringbuffer.append(c);
	//   42  118:aload           4
	//   43  120:iload_1         
	//   44  121:invokevirtual   #110 <Method StringBuffer StringBuffer.append(char)>
	//   45  124:pop             
		break; /* Loop/switch isn't completed */
	//   46  125:goto            277
_L11:
		((List) (arraylist)).add(((Object) (stringbuffer.toString().trim())));
	//   47  128:aload           5
	//   48  130:aload           4
	//   49  132:invokevirtual   #100 <Method String StringBuffer.toString()>
	//   50  135:invokevirtual   #113 <Method String String.trim()>
	//   51  138:invokeinterface #60  <Method boolean List.add(Object)>
	//   52  143:pop             
		emitOptionToken(list, ((List) (arraylist)));
	//   53  144:aload_0         
	//   54  145:aload_2         
	//   55  146:aload           5
	//   56  148:invokevirtual   #115 <Method void emitOptionToken(List, List)>
		return;
	//   57  151:return          
_L10:
		s = stringbuffer.toString().trim();
	//   58  152:aload           4
	//   59  154:invokevirtual   #100 <Method String StringBuffer.toString()>
	//   60  157:invokevirtual   #113 <Method String String.trim()>
	//   61  160:astore_3        
_L7:
		((List) (arraylist)).add(((Object) (s)));
	//   62  161:aload           5
	//   63  163:aload_3         
	//   64  164:invokeinterface #60  <Method boolean List.add(Object)>
	//   65  169:pop             
		stringbuffer.setLength(0);
	//   66  170:aload           4
	//   67  172:iconst_0        
	//   68  173:invokevirtual   #119 <Method void StringBuffer.setLength(int)>
		state = 0;
	//   69  176:aload_0         
	//   70  177:iconst_0        
	//   71  178:putfield        #35  <Field int state>
		break; /* Loop/switch isn't completed */
	//   72  181:goto            277
_L2:
		if(c == '\r' || c == ' ')
			break; /* Loop/switch isn't completed */
	//   73  184:iload_1         
	//   74  185:bipush          13
	//   75  187:icmpeq          277
	//   76  190:iload_1         
	//   77  191:bipush          32
	//   78  193:icmpeq          277
		if(c != '"' && c != '\'')
	//*  79  196:iload_1         
	//*  80  197:bipush          34
	//*  81  199:icmpeq          267
	//*  82  202:iload_1         
	//*  83  203:bipush          39
	//*  84  205:icmpeq          267
		{
			if(c == ',')
				break; /* Loop/switch isn't completed */
	//   85  208:iload_1         
	//   86  209:bipush          44
	//   87  211:icmpeq          277
			if(c != '}')
	//*  88  214:iload_1         
	//*  89  215:bipush          125
	//*  90  217:icmpeq          259
			{
				switch(c)
	//*  91  220:iload_1         
				{
	//*  92  221:tableswitch     9 10: default 244
	//	               9 277
	//	               10 277
				default:
					stringbuffer.append(c);
	//   93  244:aload           4
	//   94  246:iload_1         
	//   95  247:invokevirtual   #110 <Method StringBuffer StringBuffer.append(char)>
	//   96  250:pop             
					state = 1;
	//   97  251:aload_0         
	//   98  252:iconst_1        
	//   99  253:putfield        #35  <Field int state>
					break;

				case 9: // '\t'
				case 10: // '\n'
					break;
				}
			} else
	//* 100  256:goto            277
			{
				emitOptionToken(list, ((List) (arraylist)));
	//  101  259:aload_0         
	//  102  260:aload_2         
	//  103  261:aload           5
	//  104  263:invokevirtual   #115 <Method void emitOptionToken(List, List)>
				return;
	//  105  266:return          
			}
		} else
		{
			state = 2;
	//  106  267:aload_0         
	//  107  268:iconst_2        
	//  108  269:putfield        #35  <Field int state>
			quoteChar = c;
	//  109  272:aload_0         
	//  110  273:iload_1         
	//  111  274:putfield        #96  <Field char quoteChar>
		}
		c = pattern.charAt(tokenStream.pointer);
	//  112  277:aload_0         
	//  113  278:getfield        #42  <Field String pattern>
	//  114  281:aload_0         
	//  115  282:getfield        #37  <Field TokenStream tokenStream>
	//  116  285:getfield        #75  <Field int TokenStream.pointer>
	//  117  288:invokevirtual   #81  <Method char String.charAt(int)>
	//  118  291:istore_1        
		TokenStream tokenstream = tokenStream;
	//  119  292:aload_0         
	//  120  293:getfield        #37  <Field TokenStream tokenStream>
	//  121  296:astore_3        
		tokenstream.pointer = tokenstream.pointer + 1;
	//  122  297:aload_3         
	//  123  298:aload_3         
	//  124  299:getfield        #75  <Field int TokenStream.pointer>
	//  125  302:iconst_1        
	//  126  303:iadd            
	//  127  304:putfield        #75  <Field int TokenStream.pointer>
		if(true) goto _L13; else goto _L12
	//  128  307:goto            18
_L12:
		if(c == '}')
	//* 129  310:iload_1         
	//* 130  311:bipush          125
	//* 131  313:icmpne          368
		{
			if(state != 0)
	//* 132  316:aload_0         
	//* 133  317:getfield        #35  <Field int state>
	//* 134  320:ifne            331
	//* 135  323:aload_0         
	//* 136  324:aload_2         
	//* 137  325:aload           5
	//* 138  327:invokevirtual   #115 <Method void emitOptionToken(List, List)>
	//* 139  330:return          
				if(state == 1)
	//* 140  331:aload_0         
	//* 141  332:getfield        #35  <Field int state>
	//* 142  335:iconst_1        
	//* 143  336:icmpne          358
					((List) (arraylist)).add(((Object) (stringbuffer.toString().trim())));
	//  144  339:aload           5
	//  145  341:aload           4
	//  146  343:invokevirtual   #100 <Method String StringBuffer.toString()>
	//  147  346:invokevirtual   #113 <Method String String.trim()>
	//  148  349:invokeinterface #60  <Method boolean List.add(Object)>
	//  149  354:pop             
				else
	//* 150  355:goto            323
					throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
	//  151  358:new             #121 <Class ScanException>
	//  152  361:dup             
	//  153  362:ldc1            #123 <String "Unexpected end of pattern string in OptionTokenizer">
	//  154  364:invokespecial   #126 <Method void ScanException(String)>
	//  155  367:athrow          
			emitOptionToken(list, ((List) (arraylist)));
			return;
		} else
		{
			throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
	//  156  368:new             #121 <Class ScanException>
	//  157  371:dup             
	//  158  372:ldc1            #123 <String "Unexpected end of pattern string in OptionTokenizer">
	//  159  374:invokespecial   #126 <Method void ScanException(String)>
	//  160  377:athrow          
		}
	}

	private static final int EXPECTING_STATE = 0;
	private static final int QUOTED_COLLECTING_STATE = 2;
	private static final int RAW_COLLECTING_STATE = 1;
	final IEscapeUtil escapeUtil;
	final String pattern;
	final int patternLength;
	char quoteChar;
	int state;
	final TokenStream tokenStream;
}
