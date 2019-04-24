// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import java.io.*;

// Referenced classes of package com.google.gson.stream:
//			MalformedJsonException, JsonToken

public class JsonReader
	implements Closeable
{

	public JsonReader(Reader reader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #103 <Method void Object()>
		lenient = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #105 <Field boolean lenient>
	//    5    9:aload_0         
	//    6   10:sipush          1024
	//    7   13:newarray        char[]
	//    8   15:putfield        #107 <Field char[] buffer>
		pos = 0;
	//    9   18:aload_0         
	//   10   19:iconst_0        
	//   11   20:putfield        #109 <Field int pos>
		limit = 0;
	//   12   23:aload_0         
	//   13   24:iconst_0        
	//   14   25:putfield        #111 <Field int limit>
		lineNumber = 0;
	//   15   28:aload_0         
	//   16   29:iconst_0        
	//   17   30:putfield        #113 <Field int lineNumber>
		lineStart = 0;
	//   18   33:aload_0         
	//   19   34:iconst_0        
	//   20   35:putfield        #115 <Field int lineStart>
		peeked = 0;
	//   21   38:aload_0         
	//   22   39:iconst_0        
	//   23   40:putfield        #117 <Field int peeked>
		stack = new int[32];
	//   24   43:aload_0         
	//   25   44:bipush          32
	//   26   46:newarray        int[]
	//   27   48:putfield        #119 <Field int[] stack>
		stackSize = 0;
	//   28   51:aload_0         
	//   29   52:iconst_0        
	//   30   53:putfield        #121 <Field int stackSize>
		int ai[] = stack;
	//   31   56:aload_0         
	//   32   57:getfield        #119 <Field int[] stack>
	//   33   60:astore_3        
		int i = stackSize;
	//   34   61:aload_0         
	//   35   62:getfield        #121 <Field int stackSize>
	//   36   65:istore_2        
		stackSize = i + 1;
	//   37   66:aload_0         
	//   38   67:iload_2         
	//   39   68:iconst_1        
	//   40   69:iadd            
	//   41   70:putfield        #121 <Field int stackSize>
		ai[i] = 6;
	//   42   73:aload_3         
	//   43   74:iload_2         
	//   44   75:bipush          6
	//   45   77:iastore         
		pathNames = new String[32];
	//   46   78:aload_0         
	//   47   79:bipush          32
	//   48   81:anewarray       String[]
	//   49   84:putfield        #123 <Field String[] pathNames>
		pathIndices = new int[32];
	//   50   87:aload_0         
	//   51   88:bipush          32
	//   52   90:newarray        int[]
	//   53   92:putfield        #125 <Field int[] pathIndices>
		if(reader == null)
	//*  54   95:aload_1         
	//*  55   96:ifnonnull       109
		{
			throw new NullPointerException("in == null");
	//   56   99:new             #127 <Class NullPointerException>
	//   57  102:dup             
	//   58  103:ldc1            #129 <String "in == null">
	//   59  105:invokespecial   #132 <Method void NullPointerException(String)>
	//   60  108:athrow          
		} else
		{
			in = reader;
	//   61  109:aload_0         
	//   62  110:aload_1         
	//   63  111:putfield        #134 <Field Reader in>
			return;
	//   64  114:return          
		}
	}

	private void checkLenient()
		throws IOException
	{
		if(!lenient)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field boolean lenient>
	//*   2    4:ifne            14
			throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
	//    3    7:aload_0         
	//    4    8:ldc1            #139 <String "Use JsonReader.setLenient(true) to accept malformed JSON">
	//    5   10:invokespecial   #143 <Method IOException syntaxError(String)>
	//    6   13:athrow          
		else
			return;
	//    7   14:return          
	}

	private void consumeNonExecutePrefix()
		throws IOException
	{
		nextNonWhitespace(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #149 <Method int nextNonWhitespace(boolean)>
	//    3    5:pop             
		pos = pos - 1;
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #109 <Field int pos>
	//    7   11:iconst_1        
	//    8   12:isub            
	//    9   13:putfield        #109 <Field int pos>
		if(pos + NON_EXECUTE_PREFIX.length > limit && !fillBuffer(NON_EXECUTE_PREFIX.length))
	//*  10   16:aload_0         
	//*  11   17:getfield        #109 <Field int pos>
	//*  12   20:getstatic       #91  <Field char[] NON_EXECUTE_PREFIX>
	//*  13   23:arraylength     
	//*  14   24:iadd            
	//*  15   25:aload_0         
	//*  16   26:getfield        #111 <Field int limit>
	//*  17   29:icmple          44
	//*  18   32:aload_0         
	//*  19   33:getstatic       #91  <Field char[] NON_EXECUTE_PREFIX>
	//*  20   36:arraylength     
	//*  21   37:invokespecial   #153 <Method boolean fillBuffer(int)>
	//*  22   40:ifne            44
			return;
	//   23   43:return          
		for(int i = 0; i < NON_EXECUTE_PREFIX.length; i++)
	//*  24   44:iconst_0        
	//*  25   45:istore_1        
	//*  26   46:iload_1         
	//*  27   47:getstatic       #91  <Field char[] NON_EXECUTE_PREFIX>
	//*  28   50:arraylength     
	//*  29   51:icmpge          81
			if(buffer[pos + i] != NON_EXECUTE_PREFIX[i])
	//*  30   54:aload_0         
	//*  31   55:getfield        #107 <Field char[] buffer>
	//*  32   58:aload_0         
	//*  33   59:getfield        #109 <Field int pos>
	//*  34   62:iload_1         
	//*  35   63:iadd            
	//*  36   64:caload          
	//*  37   65:getstatic       #91  <Field char[] NON_EXECUTE_PREFIX>
	//*  38   68:iload_1         
	//*  39   69:caload          
	//*  40   70:icmpeq          74
				return;
	//   41   73:return          

	//   42   74:iload_1         
	//   43   75:iconst_1        
	//   44   76:iadd            
	//   45   77:istore_1        
	//*  46   78:goto            46
		pos = pos + NON_EXECUTE_PREFIX.length;
	//   47   81:aload_0         
	//   48   82:aload_0         
	//   49   83:getfield        #109 <Field int pos>
	//   50   86:getstatic       #91  <Field char[] NON_EXECUTE_PREFIX>
	//   51   89:arraylength     
	//   52   90:iadd            
	//   53   91:putfield        #109 <Field int pos>
	//   54   94:return          
	}

	private boolean fillBuffer(int i)
		throws IOException
	{
		char ac[] = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field char[] buffer>
	//    2    4:astore_3        
		lineStart = lineStart - pos;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #115 <Field int lineStart>
	//    6   10:aload_0         
	//    7   11:getfield        #109 <Field int pos>
	//    8   14:isub            
	//    9   15:putfield        #115 <Field int lineStart>
		if(limit != pos)
	//*  10   18:aload_0         
	//*  11   19:getfield        #111 <Field int limit>
	//*  12   22:aload_0         
	//*  13   23:getfield        #109 <Field int pos>
	//*  14   26:icmpeq          59
		{
			limit = limit - pos;
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #111 <Field int limit>
	//   18   34:aload_0         
	//   19   35:getfield        #109 <Field int pos>
	//   20   38:isub            
	//   21   39:putfield        #111 <Field int limit>
			System.arraycopy(((Object) (ac)), pos, ((Object) (ac)), 0, limit);
	//   22   42:aload_3         
	//   23   43:aload_0         
	//   24   44:getfield        #109 <Field int pos>
	//   25   47:aload_3         
	//   26   48:iconst_0        
	//   27   49:aload_0         
	//   28   50:getfield        #111 <Field int limit>
	//   29   53:invokestatic    #159 <Method void System.arraycopy(Object, int, Object, int, int)>
		} else
	//*  30   56:goto            64
		{
			limit = 0;
	//   31   59:aload_0         
	//   32   60:iconst_0        
	//   33   61:putfield        #111 <Field int limit>
		}
		pos = 0;
	//   34   64:aload_0         
	//   35   65:iconst_0        
	//   36   66:putfield        #109 <Field int pos>
		do
		{
			int j = in.read(ac, limit, ac.length - limit);
	//   37   69:aload_0         
	//   38   70:getfield        #134 <Field Reader in>
	//   39   73:aload_3         
	//   40   74:aload_0         
	//   41   75:getfield        #111 <Field int limit>
	//   42   78:aload_3         
	//   43   79:arraylength     
	//   44   80:aload_0         
	//   45   81:getfield        #111 <Field int limit>
	//   46   84:isub            
	//   47   85:invokevirtual   #165 <Method int Reader.read(char[], int, int)>
	//   48   88:istore_2        
			if(j != -1)
	//*  49   89:iload_2         
	//*  50   90:iconst_m1       
	//*  51   91:icmpeq          177
			{
				limit = limit + j;
	//   52   94:aload_0         
	//   53   95:aload_0         
	//   54   96:getfield        #111 <Field int limit>
	//   55   99:iload_2         
	//   56  100:iadd            
	//   57  101:putfield        #111 <Field int limit>
				j = i;
	//   58  104:iload_1         
	//   59  105:istore_2        
				if(lineNumber == 0)
	//*  60  106:aload_0         
	//*  61  107:getfield        #113 <Field int lineNumber>
	//*  62  110:ifne            165
				{
					j = i;
	//   63  113:iload_1         
	//   64  114:istore_2        
					if(lineStart == 0)
	//*  65  115:aload_0         
	//*  66  116:getfield        #115 <Field int lineStart>
	//*  67  119:ifne            165
					{
						j = i;
	//   68  122:iload_1         
	//   69  123:istore_2        
						if(limit > 0)
	//*  70  124:aload_0         
	//*  71  125:getfield        #111 <Field int limit>
	//*  72  128:ifle            165
						{
							j = i;
	//   73  131:iload_1         
	//   74  132:istore_2        
							if(ac[0] == '\uFEFF')
	//*  75  133:aload_3         
	//*  76  134:iconst_0        
	//*  77  135:caload          
	//*  78  136:ldc1            #166 <Int 65279>
	//*  79  138:icmpne          165
							{
								pos = pos + 1;
	//   80  141:aload_0         
	//   81  142:aload_0         
	//   82  143:getfield        #109 <Field int pos>
	//   83  146:iconst_1        
	//   84  147:iadd            
	//   85  148:putfield        #109 <Field int pos>
								lineStart = lineStart + 1;
	//   86  151:aload_0         
	//   87  152:aload_0         
	//   88  153:getfield        #115 <Field int lineStart>
	//   89  156:iconst_1        
	//   90  157:iadd            
	//   91  158:putfield        #115 <Field int lineStart>
								j = i + 1;
	//   92  161:iload_1         
	//   93  162:iconst_1        
	//   94  163:iadd            
	//   95  164:istore_2        
							}
						}
					}
				}
				i = j;
	//   96  165:iload_2         
	//   97  166:istore_1        
				if(limit >= j)
	//*  98  167:aload_0         
	//*  99  168:getfield        #111 <Field int limit>
	//* 100  171:iload_2         
	//* 101  172:icmplt          69
					return true;
	//  102  175:iconst_1        
	//  103  176:ireturn         
			} else
			{
				return false;
	//  104  177:iconst_0        
	//  105  178:ireturn         
			}
		} while(true);
	}

	private boolean isLiteral(char c)
		throws IOException
	{
		switch(c)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    16: default 140
	//	               9: 147
	//	               10: 147
	//	               12: 147
	//	               13: 147
	//	               32: 147
	//	               35: 143
	//	               44: 147
	//	               47: 143
	//	               58: 147
	//	               59: 143
	//	               61: 143
	//	               91: 147
	//	               92: 143
	//	               93: 147
	//	               123: 147
	//	               125: 147
	//*   2  140:goto            149
		case 35: // '#'
		case 47: // '/'
		case 59: // ';'
		case 61: // '='
		case 92: // '\\'
			checkLenient();
	//    3  143:aload_0         
	//    4  144:invokespecial   #170 <Method void checkLenient()>
			// fall through

		case 9: // '\t'
		case 10: // '\n'
		case 12: // '\f'
		case 13: // '\r'
		case 32: // ' '
		case 44: // ','
		case 58: // ':'
		case 91: // '['
		case 93: // ']'
		case 123: // '{'
		case 125: // '}'
			return false;
	//    5  147:iconst_0        
	//    6  148:ireturn         

		default:
			return true;
	//    7  149:iconst_1        
	//    8  150:ireturn         
		}
	}

	private int nextNonWhitespace(boolean flag)
		throws IOException
	{
		char ac[] = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field char[] buffer>
	//    2    4:astore          8
		int i = pos;
	//    3    6:aload_0         
	//    4    7:getfield        #109 <Field int pos>
	//    5   10:istore_2        
		int j = limit;
	//    6   11:aload_0         
	//    7   12:getfield        #111 <Field int limit>
	//    8   15:istore_3        
label0:
		do
		{
			do
			{
				int l = i;
	//    9   16:iload_2         
	//   10   17:istore          5
				int k = j;
	//   11   19:iload_3         
	//   12   20:istore          4
				if(i == j)
	//*  13   22:iload_2         
	//*  14   23:iload_3         
	//*  15   24:icmpne          55
				{
					pos = i;
	//   16   27:aload_0         
	//   17   28:iload_2         
	//   18   29:putfield        #109 <Field int pos>
					if(!fillBuffer(1))
	//*  19   32:aload_0         
	//*  20   33:iconst_1        
	//*  21   34:invokespecial   #153 <Method boolean fillBuffer(int)>
	//*  22   37:ifne            43
						break;
	//   23   40:goto            353
					l = pos;
	//   24   43:aload_0         
	//   25   44:getfield        #109 <Field int pos>
	//   26   47:istore          5
					k = limit;
	//   27   49:aload_0         
	//   28   50:getfield        #111 <Field int limit>
	//   29   53:istore          4
				}
				int i1 = l + 1;
	//   30   55:iload           5
	//   31   57:iconst_1        
	//   32   58:iadd            
	//   33   59:istore          6
				l = ((int) (ac[l]));
	//   34   61:aload           8
	//   35   63:iload           5
	//   36   65:caload          
	//   37   66:istore          5
				if(l == '\n')
	//*  38   68:iload           5
	//*  39   70:bipush          10
	//*  40   72:icmpne          100
				{
					lineNumber = lineNumber + 1;
	//   41   75:aload_0         
	//   42   76:aload_0         
	//   43   77:getfield        #113 <Field int lineNumber>
	//   44   80:iconst_1        
	//   45   81:iadd            
	//   46   82:putfield        #113 <Field int lineNumber>
					lineStart = i1;
	//   47   85:aload_0         
	//   48   86:iload           6
	//   49   88:putfield        #115 <Field int lineStart>
					i = i1;
	//   50   91:iload           6
	//   51   93:istore_2        
					j = k;
	//   52   94:iload           4
	//   53   96:istore_3        
				} else
	//*  54   97:goto            16
				{
					i = i1;
	//   55  100:iload           6
	//   56  102:istore_2        
					j = k;
	//   57  103:iload           4
	//   58  105:istore_3        
					if(l != ' ')
	//*  59  106:iload           5
	//*  60  108:bipush          32
	//*  61  110:icmpeq          16
					{
						i = i1;
	//   62  113:iload           6
	//   63  115:istore_2        
						j = k;
	//   64  116:iload           4
	//   65  118:istore_3        
						if(l != '\r')
	//*  66  119:iload           5
	//*  67  121:bipush          13
	//*  68  123:icmpeq          16
							if(l == '\t')
	//*  69  126:iload           5
	//*  70  128:bipush          9
	//*  71  130:icmpne          142
							{
								i = i1;
	//   72  133:iload           6
	//   73  135:istore_2        
								j = k;
	//   74  136:iload           4
	//   75  138:istore_3        
							} else
	//*  76  139:goto            16
							{
								if(l == '/')
	//*  77  142:iload           5
	//*  78  144:bipush          47
	//*  79  146:icmpne          307
								{
									pos = i1;
	//   80  149:aload_0         
	//   81  150:iload           6
	//   82  152:putfield        #109 <Field int pos>
									if(i1 == k)
	//*  83  155:iload           6
	//*  84  157:iload           4
	//*  85  159:icmpne          197
									{
										pos = pos - 1;
	//   86  162:aload_0         
	//   87  163:aload_0         
	//   88  164:getfield        #109 <Field int pos>
	//   89  167:iconst_1        
	//   90  168:isub            
	//   91  169:putfield        #109 <Field int pos>
										boolean flag1 = fillBuffer(2);
	//   92  172:aload_0         
	//   93  173:iconst_2        
	//   94  174:invokespecial   #153 <Method boolean fillBuffer(int)>
	//   95  177:istore          7
										pos = pos + 1;
	//   96  179:aload_0         
	//   97  180:aload_0         
	//   98  181:getfield        #109 <Field int pos>
	//   99  184:iconst_1        
	//  100  185:iadd            
	//  101  186:putfield        #109 <Field int pos>
										if(!flag1)
	//* 102  189:iload           7
	//* 103  191:ifne            197
											return l;
	//  104  194:iload           5
	//  105  196:ireturn         
									}
									checkLenient();
	//  106  197:aload_0         
	//  107  198:invokespecial   #170 <Method void checkLenient()>
									switch(ac[pos])
	//* 108  201:aload           8
	//* 109  203:aload_0         
	//* 110  204:getfield        #109 <Field int pos>
	//* 111  207:caload          
									{
	//* 112  208:lookupswitch    2: default 236
	//	               42: 239
	//	               47: 280
									default:
										return l;
	//  113  236:iload           5
	//  114  238:ireturn         

									case 42: // '*'
										pos = pos + 1;
	//  115  239:aload_0         
	//  116  240:aload_0         
	//  117  241:getfield        #109 <Field int pos>
	//  118  244:iconst_1        
	//  119  245:iadd            
	//  120  246:putfield        #109 <Field int pos>
										if(!skipTo("*/"))
	//* 121  249:aload_0         
	//* 122  250:ldc1            #172 <String "*/">
	//* 123  252:invokespecial   #176 <Method boolean skipTo(String)>
	//* 124  255:ifne            265
											throw syntaxError("Unterminated comment");
	//  125  258:aload_0         
	//  126  259:ldc1            #178 <String "Unterminated comment">
	//  127  261:invokespecial   #143 <Method IOException syntaxError(String)>
	//  128  264:athrow          
										i = pos + 2;
	//  129  265:aload_0         
	//  130  266:getfield        #109 <Field int pos>
	//  131  269:iconst_2        
	//  132  270:iadd            
	//  133  271:istore_2        
										j = limit;
	//  134  272:aload_0         
	//  135  273:getfield        #111 <Field int limit>
	//  136  276:istore_3        
										break;

	//* 137  277:goto            16
									case 47: // '/'
										pos = pos + 1;
	//  138  280:aload_0         
	//  139  281:aload_0         
	//  140  282:getfield        #109 <Field int pos>
	//  141  285:iconst_1        
	//  142  286:iadd            
	//  143  287:putfield        #109 <Field int pos>
										skipToEndOfLine();
	//  144  290:aload_0         
	//  145  291:invokespecial   #181 <Method void skipToEndOfLine()>
										i = pos;
	//  146  294:aload_0         
	//  147  295:getfield        #109 <Field int pos>
	//  148  298:istore_2        
										j = limit;
	//  149  299:aload_0         
	//  150  300:getfield        #111 <Field int limit>
	//  151  303:istore_3        
										break;
									}
								} else
	//* 152  304:goto            16
								if(l == '#')
	//* 153  307:iload           5
	//* 154  309:bipush          35
	//* 155  311:icmpne          341
								{
									pos = i1;
	//  156  314:aload_0         
	//  157  315:iload           6
	//  158  317:putfield        #109 <Field int pos>
									checkLenient();
	//  159  320:aload_0         
	//  160  321:invokespecial   #170 <Method void checkLenient()>
									skipToEndOfLine();
	//  161  324:aload_0         
	//  162  325:invokespecial   #181 <Method void skipToEndOfLine()>
									i = pos;
	//  163  328:aload_0         
	//  164  329:getfield        #109 <Field int pos>
	//  165  332:istore_2        
									j = limit;
	//  166  333:aload_0         
	//  167  334:getfield        #111 <Field int limit>
	//  168  337:istore_3        
								} else
	//* 169  338:goto            350
								{
									pos = i1;
	//  170  341:aload_0         
	//  171  342:iload           6
	//  172  344:putfield        #109 <Field int pos>
									return l;
	//  173  347:iload           5
	//  174  349:ireturn         
								}
								continue label0;
	//  175  350:goto            16
							}
					}
				}
			} while(true);
			if(flag)
	//* 176  353:iload_1         
	//* 177  354:ifeq            387
				throw new EOFException((new StringBuilder()).append("End of input").append(locationString()).toString());
	//  178  357:new             #183 <Class EOFException>
	//  179  360:dup             
	//  180  361:new             #185 <Class StringBuilder>
	//  181  364:dup             
	//  182  365:invokespecial   #186 <Method void StringBuilder()>
	//  183  368:ldc1            #188 <String "End of input">
	//  184  370:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//  185  373:aload_0         
	//  186  374:invokevirtual   #196 <Method String locationString()>
	//  187  377:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//  188  380:invokevirtual   #199 <Method String StringBuilder.toString()>
	//  189  383:invokespecial   #200 <Method void EOFException(String)>
	//  190  386:athrow          
			else
				return -1;
	//  191  387:iconst_m1       
	//  192  388:ireturn         
		} while(true);
	}

	private String nextQuotedValue(char c)
		throws IOException
	{
		char ac[] = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field char[] buffer>
	//    2    4:astore          11
		StringBuilder stringbuilder = null;
	//    3    6:aconst_null     
	//    4    7:astore          9
		do
		{
			int i = pos;
	//    5    9:aload_0         
	//    6   10:getfield        #109 <Field int pos>
	//    7   13:istore_2        
			int k = limit;
	//    8   14:aload_0         
	//    9   15:getfield        #111 <Field int limit>
	//   10   18:istore          4
			int j;
			int i1;
			for(j = i; i < k; j = i1)
	//*  11   20:iload_2         
	//*  12   21:istore_3        
	//*  13   22:iload_2         
	//*  14   23:iload           4
	//*  15   25:icmpge          241
			{
				int j1 = i + 1;
	//   16   28:iload_2         
	//   17   29:iconst_1        
	//   18   30:iadd            
	//   19   31:istore          7
				char c1 = ac[i];
	//   20   33:aload           11
	//   21   35:iload_2         
	//   22   36:caload          
	//   23   37:istore          8
				if(c1 == c)
	//*  24   39:iload           8
	//*  25   41:iload_1         
	//*  26   42:icmpne          91
				{
					pos = j1;
	//   27   45:aload_0         
	//   28   46:iload           7
	//   29   48:putfield        #109 <Field int pos>
					c = ((char) (j1 - j - 1));
	//   30   51:iload           7
	//   31   53:iload_3         
	//   32   54:isub            
	//   33   55:iconst_1        
	//   34   56:isub            
	//   35   57:istore_1        
					if(stringbuilder == null)
	//*  36   58:aload           9
	//*  37   60:ifnonnull       75
					{
						return new String(ac, j, ((int) (c)));
	//   38   63:new             #85  <Class String>
	//   39   66:dup             
	//   40   67:aload           11
	//   41   69:iload_3         
	//   42   70:iload_1         
	//   43   71:invokespecial   #205 <Method void String(char[], int, int)>
	//   44   74:areturn         
					} else
					{
						stringbuilder.append(ac, j, ((int) (c)));
	//   45   75:aload           9
	//   46   77:aload           11
	//   47   79:iload_3         
	//   48   80:iload_1         
	//   49   81:invokevirtual   #208 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   50   84:pop             
						return stringbuilder.toString();
	//   51   85:aload           9
	//   52   87:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   53   90:areturn         
					}
				}
				int l;
				StringBuilder stringbuilder1;
				if(c1 == '\\')
	//*  54   91:iload           8
	//*  55   93:bipush          92
	//*  56   95:icmpne          176
				{
					pos = j1;
	//   57   98:aload_0         
	//   58   99:iload           7
	//   59  101:putfield        #109 <Field int pos>
					i = j1 - j - 1;
	//   60  104:iload           7
	//   61  106:iload_3         
	//   62  107:isub            
	//   63  108:iconst_1        
	//   64  109:isub            
	//   65  110:istore_2        
					stringbuilder1 = stringbuilder;
	//   66  111:aload           9
	//   67  113:astore          10
					if(stringbuilder == null)
	//*  68  115:aload           9
	//*  69  117:ifnonnull       139
						stringbuilder1 = new StringBuilder(Math.max((i + 1) * 2, 16));
	//   70  120:new             #185 <Class StringBuilder>
	//   71  123:dup             
	//   72  124:iload_2         
	//   73  125:iconst_1        
	//   74  126:iadd            
	//   75  127:iconst_2        
	//   76  128:imul            
	//   77  129:bipush          16
	//   78  131:invokestatic    #214 <Method int Math.max(int, int)>
	//   79  134:invokespecial   #217 <Method void StringBuilder(int)>
	//   80  137:astore          10
					stringbuilder1.append(ac, j, i);
	//   81  139:aload           10
	//   82  141:aload           11
	//   83  143:iload_3         
	//   84  144:iload_2         
	//   85  145:invokevirtual   #208 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   86  148:pop             
					stringbuilder1.append(readEscapeCharacter());
	//   87  149:aload           10
	//   88  151:aload_0         
	//   89  152:invokespecial   #221 <Method char readEscapeCharacter()>
	//   90  155:invokevirtual   #224 <Method StringBuilder StringBuilder.append(char)>
	//   91  158:pop             
					i = pos;
	//   92  159:aload_0         
	//   93  160:getfield        #109 <Field int pos>
	//   94  163:istore_2        
					l = limit;
	//   95  164:aload_0         
	//   96  165:getfield        #111 <Field int limit>
	//   97  168:istore          5
					i1 = i;
	//   98  170:iload_2         
	//   99  171:istore          6
				} else
	//* 100  173:goto            227
				{
					stringbuilder1 = stringbuilder;
	//  101  176:aload           9
	//  102  178:astore          10
					i = j1;
	//  103  180:iload           7
	//  104  182:istore_2        
					l = k;
	//  105  183:iload           4
	//  106  185:istore          5
					i1 = j;
	//  107  187:iload_3         
	//  108  188:istore          6
					if(c1 == '\n')
	//* 109  190:iload           8
	//* 110  192:bipush          10
	//* 111  194:icmpne          227
					{
						lineNumber = lineNumber + 1;
	//  112  197:aload_0         
	//  113  198:aload_0         
	//  114  199:getfield        #113 <Field int lineNumber>
	//  115  202:iconst_1        
	//  116  203:iadd            
	//  117  204:putfield        #113 <Field int lineNumber>
						lineStart = j1;
	//  118  207:aload_0         
	//  119  208:iload           7
	//  120  210:putfield        #115 <Field int lineStart>
						i1 = j;
	//  121  213:iload_3         
	//  122  214:istore          6
						l = k;
	//  123  216:iload           4
	//  124  218:istore          5
						i = j1;
	//  125  220:iload           7
	//  126  222:istore_2        
						stringbuilder1 = stringbuilder;
	//  127  223:aload           9
	//  128  225:astore          10
					}
				}
				stringbuilder = stringbuilder1;
	//  129  227:aload           10
	//  130  229:astore          9
				k = l;
	//  131  231:iload           5
	//  132  233:istore          4
			}

	//  133  235:iload           6
	//  134  237:istore_3        
	//* 135  238:goto            22
			StringBuilder stringbuilder2 = stringbuilder;
	//  136  241:aload           9
	//  137  243:astore          10
			if(stringbuilder == null)
	//* 138  245:aload           9
	//* 139  247:ifnonnull       269
				stringbuilder2 = new StringBuilder(Math.max((i - j) * 2, 16));
	//  140  250:new             #185 <Class StringBuilder>
	//  141  253:dup             
	//  142  254:iload_2         
	//  143  255:iload_3         
	//  144  256:isub            
	//  145  257:iconst_2        
	//  146  258:imul            
	//  147  259:bipush          16
	//  148  261:invokestatic    #214 <Method int Math.max(int, int)>
	//  149  264:invokespecial   #217 <Method void StringBuilder(int)>
	//  150  267:astore          10
			stringbuilder2.append(ac, j, i - j);
	//  151  269:aload           10
	//  152  271:aload           11
	//  153  273:iload_3         
	//  154  274:iload_2         
	//  155  275:iload_3         
	//  156  276:isub            
	//  157  277:invokevirtual   #208 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//  158  280:pop             
			pos = i;
	//  159  281:aload_0         
	//  160  282:iload_2         
	//  161  283:putfield        #109 <Field int pos>
			if(!fillBuffer(1))
	//* 162  286:aload_0         
	//* 163  287:iconst_1        
	//* 164  288:invokespecial   #153 <Method boolean fillBuffer(int)>
	//* 165  291:ifne            301
				throw syntaxError("Unterminated string");
	//  166  294:aload_0         
	//  167  295:ldc1            #226 <String "Unterminated string">
	//  168  297:invokespecial   #143 <Method IOException syntaxError(String)>
	//  169  300:athrow          
			stringbuilder = stringbuilder2;
	//  170  301:aload           10
	//  171  303:astore          9
		} while(true);
	//  172  305:goto            9
	}

	private String nextUnquotedValue()
		throws IOException
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_1        
		int j;
		StringBuilder stringbuilder;
label0:
		do
		{
			if(pos + i < limit)
	//*   4    4:aload_0         
	//*   5    5:getfield        #109 <Field int pos>
	//*   6    8:iload_1         
	//*   7    9:iadd            
	//*   8   10:aload_0         
	//*   9   11:getfield        #111 <Field int limit>
	//*  10   14:icmpge          190
			{
				switch(buffer[pos + i])
	//*  11   17:aload_0         
	//*  12   18:getfield        #107 <Field char[] buffer>
	//*  13   21:aload_0         
	//*  14   22:getfield        #109 <Field int pos>
	//*  15   25:iload_1         
	//*  16   26:iadd            
	//*  17   27:caload          
				{
	//*  18   28:lookupswitch    16: default 168
	//	               9: 175
	//	               10: 175
	//	               12: 175
	//	               13: 175
	//	               32: 175
	//	               35: 171
	//	               44: 175
	//	               47: 171
	//	               58: 175
	//	               59: 171
	//	               61: 171
	//	               91: 175
	//	               92: 171
	//	               93: 175
	//	               123: 175
	//	               125: 175
	//*  19  168:goto            183
				case 35: // '#'
				case 47: // '/'
				case 59: // ';'
				case 61: // '='
				case 92: // '\\'
					checkLenient();
	//   20  171:aload_0         
	//   21  172:invokespecial   #170 <Method void checkLenient()>
					// fall through

				case 9: // '\t'
				case 10: // '\n'
				case 12: // '\f'
				case 13: // '\r'
				case 32: // ' '
				case 44: // ','
				case 58: // ':'
				case 91: // '['
				case 93: // ']'
				case 123: // '{'
				case 125: // '}'
					stringbuilder = ((StringBuilder) (obj));
	//   22  175:aload_3         
	//   23  176:astore          4
					j = i;
	//   24  178:iload_1         
	//   25  179:istore_2        
					break label0;
	//   26  180:goto            279

				default:
					i++;
	//   27  183:iload_1         
	//   28  184:iconst_1        
	//   29  185:iadd            
	//   30  186:istore_1        
					break;
				}
				continue;
	//   31  187:goto            4
			}
			if(i < buffer.length)
	//*  32  190:iload_1         
	//*  33  191:aload_0         
	//*  34  192:getfield        #107 <Field char[] buffer>
	//*  35  195:arraylength     
	//*  36  196:icmpge          217
			{
				stringbuilder = ((StringBuilder) (obj));
	//   37  199:aload_3         
	//   38  200:astore          4
				j = i;
	//   39  202:iload_1         
	//   40  203:istore_2        
				if(!fillBuffer(i + 1))
	//*  41  204:aload_0         
	//*  42  205:iload_1         
	//*  43  206:iconst_1        
	//*  44  207:iadd            
	//*  45  208:invokespecial   #153 <Method boolean fillBuffer(int)>
	//*  46  211:ifeq            279
					break;
	//   47  214:goto            4
				continue;
			}
			stringbuilder = ((StringBuilder) (obj));
	//   48  217:aload_3         
	//   49  218:astore          4
			if(obj == null)
	//*  50  220:aload_3         
	//*  51  221:ifnonnull       239
				stringbuilder = new StringBuilder(Math.max(i, 16));
	//   52  224:new             #185 <Class StringBuilder>
	//   53  227:dup             
	//   54  228:iload_1         
	//   55  229:bipush          16
	//   56  231:invokestatic    #214 <Method int Math.max(int, int)>
	//   57  234:invokespecial   #217 <Method void StringBuilder(int)>
	//   58  237:astore          4
			stringbuilder.append(buffer, pos, i);
	//   59  239:aload           4
	//   60  241:aload_0         
	//   61  242:getfield        #107 <Field char[] buffer>
	//   62  245:aload_0         
	//   63  246:getfield        #109 <Field int pos>
	//   64  249:iload_1         
	//   65  250:invokevirtual   #208 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   66  253:pop             
			pos = pos + i;
	//   67  254:aload_0         
	//   68  255:aload_0         
	//   69  256:getfield        #109 <Field int pos>
	//   70  259:iload_1         
	//   71  260:iadd            
	//   72  261:putfield        #109 <Field int pos>
			j = 0;
	//   73  264:iconst_0        
	//   74  265:istore_2        
			i = 0;
	//   75  266:iconst_0        
	//   76  267:istore_1        
			obj = ((Object) (stringbuilder));
	//   77  268:aload           4
	//   78  270:astore_3        
			if(!fillBuffer(1))
				break;
	//   79  271:aload_0         
	//   80  272:iconst_1        
	//   81  273:invokespecial   #153 <Method boolean fillBuffer(int)>
	//   82  276:ifne            4
		} while(true);
		if(stringbuilder == null)
	//*  83  279:aload           4
	//*  84  281:ifnonnull       304
			obj = ((Object) (new String(buffer, pos, j)));
	//   85  284:new             #85  <Class String>
	//   86  287:dup             
	//   87  288:aload_0         
	//   88  289:getfield        #107 <Field char[] buffer>
	//   89  292:aload_0         
	//   90  293:getfield        #109 <Field int pos>
	//   91  296:iload_2         
	//   92  297:invokespecial   #205 <Method void String(char[], int, int)>
	//   93  300:astore_3        
		else
	//*  94  301:goto            322
			obj = ((Object) (stringbuilder.append(buffer, pos, j).toString()));
	//   95  304:aload           4
	//   96  306:aload_0         
	//   97  307:getfield        #107 <Field char[] buffer>
	//   98  310:aload_0         
	//   99  311:getfield        #109 <Field int pos>
	//  100  314:iload_2         
	//  101  315:invokevirtual   #208 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//  102  318:invokevirtual   #199 <Method String StringBuilder.toString()>
	//  103  321:astore_3        
		pos = pos + j;
	//  104  322:aload_0         
	//  105  323:aload_0         
	//  106  324:getfield        #109 <Field int pos>
	//  107  327:iload_2         
	//  108  328:iadd            
	//  109  329:putfield        #109 <Field int pos>
		return ((String) (obj));
	//  110  332:aload_3         
	//  111  333:areturn         
	}

	private int peekKeyword()
		throws IOException
	{
		int i = ((int) (buffer[pos]));
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field char[] buffer>
	//    2    4:aload_0         
	//    3    5:getfield        #109 <Field int pos>
	//    4    8:caload          
	//    5    9:istore_1        
		String s;
		String s1;
		if(i == 116 || i == 84)
	//*   6   10:iload_1         
	//*   7   11:bipush          116
	//*   8   13:icmpeq          22
	//*   9   16:iload_1         
	//*  10   17:bipush          84
	//*  11   19:icmpne          35
		{
			s = "true";
	//   12   22:ldc1            #231 <String "true">
	//   13   24:astore          5
			s1 = "TRUE";
	//   14   26:ldc1            #233 <String "TRUE">
	//   15   28:astore          6
			i = 5;
	//   16   30:iconst_5        
	//   17   31:istore_1        
		} else
	//*  18   32:goto            89
		if(i == 102 || i == 70)
	//*  19   35:iload_1         
	//*  20   36:bipush          102
	//*  21   38:icmpeq          47
	//*  22   41:iload_1         
	//*  23   42:bipush          70
	//*  24   44:icmpne          61
		{
			s = "false";
	//   25   47:ldc1            #235 <String "false">
	//   26   49:astore          5
			s1 = "FALSE";
	//   27   51:ldc1            #237 <String "FALSE">
	//   28   53:astore          6
			i = 6;
	//   29   55:bipush          6
	//   30   57:istore_1        
		} else
	//*  31   58:goto            89
		if(i == 110 || i == 78)
	//*  32   61:iload_1         
	//*  33   62:bipush          110
	//*  34   64:icmpeq          73
	//*  35   67:iload_1         
	//*  36   68:bipush          78
	//*  37   70:icmpne          87
		{
			s = "null";
	//   38   73:ldc1            #239 <String "null">
	//   39   75:astore          5
			s1 = "NULL";
	//   40   77:ldc1            #241 <String "NULL">
	//   41   79:astore          6
			i = 7;
	//   42   81:bipush          7
	//   43   83:istore_1        
		} else
	//*  44   84:goto            89
		{
			return 0;
	//   45   87:iconst_0        
	//   46   88:ireturn         
		}
		int k = s.length();
	//   47   89:aload           5
	//   48   91:invokevirtual   #244 <Method int String.length()>
	//   49   94:istore_3        
		for(int j = 1; j < k; j++)
	//*  50   95:iconst_1        
	//*  51   96:istore_2        
	//*  52   97:iload_2         
	//*  53   98:iload_3         
	//*  54   99:icmpge          171
		{
			if(pos + j >= limit && !fillBuffer(j + 1))
	//*  55  102:aload_0         
	//*  56  103:getfield        #109 <Field int pos>
	//*  57  106:iload_2         
	//*  58  107:iadd            
	//*  59  108:aload_0         
	//*  60  109:getfield        #111 <Field int limit>
	//*  61  112:icmplt          127
	//*  62  115:aload_0         
	//*  63  116:iload_2         
	//*  64  117:iconst_1        
	//*  65  118:iadd            
	//*  66  119:invokespecial   #153 <Method boolean fillBuffer(int)>
	//*  67  122:ifne            127
				return 0;
	//   68  125:iconst_0        
	//   69  126:ireturn         
			char c = buffer[pos + j];
	//   70  127:aload_0         
	//   71  128:getfield        #107 <Field char[] buffer>
	//   72  131:aload_0         
	//   73  132:getfield        #109 <Field int pos>
	//   74  135:iload_2         
	//   75  136:iadd            
	//   76  137:caload          
	//   77  138:istore          4
			if(c != s.charAt(j) && c != s1.charAt(j))
	//*  78  140:iload           4
	//*  79  142:aload           5
	//*  80  144:iload_2         
	//*  81  145:invokevirtual   #248 <Method char String.charAt(int)>
	//*  82  148:icmpeq          164
	//*  83  151:iload           4
	//*  84  153:aload           6
	//*  85  155:iload_2         
	//*  86  156:invokevirtual   #248 <Method char String.charAt(int)>
	//*  87  159:icmpeq          164
				return 0;
	//   88  162:iconst_0        
	//   89  163:ireturn         
		}

	//   90  164:iload_2         
	//   91  165:iconst_1        
	//   92  166:iadd            
	//   93  167:istore_2        
	//*  94  168:goto            97
		if((pos + k < limit || fillBuffer(k + 1)) && isLiteral(buffer[pos + k]))
	//*  95  171:aload_0         
	//*  96  172:getfield        #109 <Field int pos>
	//*  97  175:iload_3         
	//*  98  176:iadd            
	//*  99  177:aload_0         
	//* 100  178:getfield        #111 <Field int limit>
	//* 101  181:icmplt          194
	//* 102  184:aload_0         
	//* 103  185:iload_3         
	//* 104  186:iconst_1        
	//* 105  187:iadd            
	//* 106  188:invokespecial   #153 <Method boolean fillBuffer(int)>
	//* 107  191:ifeq            214
	//* 108  194:aload_0         
	//* 109  195:aload_0         
	//* 110  196:getfield        #107 <Field char[] buffer>
	//* 111  199:aload_0         
	//* 112  200:getfield        #109 <Field int pos>
	//* 113  203:iload_3         
	//* 114  204:iadd            
	//* 115  205:caload          
	//* 116  206:invokespecial   #250 <Method boolean isLiteral(char)>
	//* 117  209:ifeq            214
		{
			return 0;
	//  118  212:iconst_0        
	//  119  213:ireturn         
		} else
		{
			pos = pos + k;
	//  120  214:aload_0         
	//  121  215:aload_0         
	//  122  216:getfield        #109 <Field int pos>
	//  123  219:iload_3         
	//  124  220:iadd            
	//  125  221:putfield        #109 <Field int pos>
			peeked = i;
	//  126  224:aload_0         
	//  127  225:iload_1         
	//  128  226:putfield        #117 <Field int peeked>
			return i;
	//  129  229:iload_1         
	//  130  230:ireturn         
		}
	}

	private int peekNumber()
		throws IOException
	{
		char ac[] = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field char[] buffer>
	//    2    4:astore          17
		int i2 = pos;
	//    3    6:aload_0         
	//    4    7:getfield        #109 <Field int pos>
	//    5   10:istore          12
		int l1 = limit;
	//    6   12:aload_0         
	//    7   13:getfield        #111 <Field int limit>
	//    8   16:istore          11
		long l2 = 0L;
	//    9   18:lconst_0        
	//   10   19:lstore          13
		boolean flag = false;
	//   11   21:iconst_0        
	//   12   22:istore          5
		int k = 1;
	//   13   24:iconst_1        
	//   14   25:istore          4
		int j1 = 0;
	//   15   27:iconst_0        
	//   16   28:istore          8
		int j = 0;
	//   17   30:iconst_0        
	//   18   31:istore_3        
label0:
		do
		{
			int i1 = i2;
	//   19   32:iload           12
	//   20   34:istore          7
			int l = l1;
	//   21   36:iload           11
	//   22   38:istore          6
			if(i2 + j == l1)
	//*  23   40:iload           12
	//*  24   42:iload_3         
	//*  25   43:iadd            
	//*  26   44:iload           11
	//*  27   46:icmpne          83
			{
				if(j == ac.length)
	//*  28   49:iload_3         
	//*  29   50:aload           17
	//*  30   52:arraylength     
	//*  31   53:icmpne          58
					return 0;
	//   32   56:iconst_0        
	//   33   57:ireturn         
				if(!fillBuffer(j + 1))
	//*  34   58:aload_0         
	//*  35   59:iload_3         
	//*  36   60:iconst_1        
	//*  37   61:iadd            
	//*  38   62:invokespecial   #153 <Method boolean fillBuffer(int)>
	//*  39   65:ifne            71
					break;
	//   40   68:goto            507
				i1 = pos;
	//   41   71:aload_0         
	//   42   72:getfield        #109 <Field int pos>
	//   43   75:istore          7
				l = limit;
	//   44   77:aload_0         
	//   45   78:getfield        #111 <Field int limit>
	//   46   81:istore          6
			}
			char c = ac[i1 + j];
	//   47   83:aload           17
	//   48   85:iload           7
	//   49   87:iload_3         
	//   50   88:iadd            
	//   51   89:caload          
	//   52   90:istore_1        
			int i;
			boolean flag1;
			int k1;
			long l3;
			switch(c)
	//*  53   91:iload_1         
			{
	//*  54   92:lookupswitch    5: default 144
	//	               43: 194
	//	               45: 147
	//	               46: 251
	//	               69: 220
	//	               101: 220
	//*  55  144:goto            276
			case 45: // '-'
				if(j1 == 0)
	//*  56  147:iload           8
	//*  57  149:ifne            168
				{
					flag1 = true;
	//   58  152:iconst_1        
	//   59  153:istore          9
					i = 1;
	//   60  155:iconst_1        
	//   61  156:istore_2        
					l3 = l2;
	//   62  157:lload           13
	//   63  159:lstore          15
					k1 = k;
	//   64  161:iload           4
	//   65  163:istore          10
					break;
	//   66  165:goto            477
				}
				if(j1 == 5)
	//*  67  168:iload           8
	//*  68  170:iconst_5        
	//*  69  171:icmpne          192
				{
					i = 6;
	//   70  174:bipush          6
	//   71  176:istore_2        
					l3 = l2;
	//   72  177:lload           13
	//   73  179:lstore          15
					flag1 = flag;
	//   74  181:iload           5
	//   75  183:istore          9
					k1 = k;
	//   76  185:iload           4
	//   77  187:istore          10
				} else
	//*  78  189:goto            477
				{
					return 0;
	//   79  192:iconst_0        
	//   80  193:ireturn         
				}
				break;

			case 43: // '+'
				if(j1 == 5)
	//*  81  194:iload           8
	//*  82  196:iconst_5        
	//*  83  197:icmpne          218
				{
					i = 6;
	//   84  200:bipush          6
	//   85  202:istore_2        
					l3 = l2;
	//   86  203:lload           13
	//   87  205:lstore          15
					flag1 = flag;
	//   88  207:iload           5
	//   89  209:istore          9
					k1 = k;
	//   90  211:iload           4
	//   91  213:istore          10
				} else
	//*  92  215:goto            477
				{
					return 0;
	//   93  218:iconst_0        
	//   94  219:ireturn         
				}
				break;

			case 69: // 'E'
			case 101: // 'e'
				if(j1 == 2 || j1 == 4)
	//*  95  220:iload           8
	//*  96  222:iconst_2        
	//*  97  223:icmpeq          232
	//*  98  226:iload           8
	//*  99  228:iconst_4        
	//* 100  229:icmpne          249
				{
					i = 5;
	//  101  232:iconst_5        
	//  102  233:istore_2        
					l3 = l2;
	//  103  234:lload           13
	//  104  236:lstore          15
					flag1 = flag;
	//  105  238:iload           5
	//  106  240:istore          9
					k1 = k;
	//  107  242:iload           4
	//  108  244:istore          10
				} else
	//* 109  246:goto            477
				{
					return 0;
	//  110  249:iconst_0        
	//  111  250:ireturn         
				}
				break;

			case 46: // '.'
				if(j1 == 2)
	//* 112  251:iload           8
	//* 113  253:iconst_2        
	//* 114  254:icmpne          274
				{
					i = 3;
	//  115  257:iconst_3        
	//  116  258:istore_2        
					l3 = l2;
	//  117  259:lload           13
	//  118  261:lstore          15
					flag1 = flag;
	//  119  263:iload           5
	//  120  265:istore          9
					k1 = k;
	//  121  267:iload           4
	//  122  269:istore          10
				} else
	//* 123  271:goto            477
				{
					return 0;
	//  124  274:iconst_0        
	//  125  275:ireturn         
				}
				break;

			default:
				if(c < '0' || c > '9')
	//* 126  276:iload_1         
	//* 127  277:bipush          48
	//* 128  279:icmplt          288
	//* 129  282:iload_1         
	//* 130  283:bipush          57
	//* 131  285:icmple          301
				{
					if(isLiteral(c))
	//* 132  288:aload_0         
	//* 133  289:iload_1         
	//* 134  290:invokespecial   #250 <Method boolean isLiteral(char)>
	//* 135  293:ifne            299
	//* 136  296:goto            507
						return 0;
	//  137  299:iconst_0        
	//  138  300:ireturn         
					break label0;
				}
				if(j1 == 1 || j1 == 0)
	//* 139  301:iload           8
	//* 140  303:iconst_1        
	//* 141  304:icmpeq          312
	//* 142  307:iload           8
	//* 143  309:ifne            333
				{
					l3 = -(c - 48);
	//  144  312:iload_1         
	//  145  313:bipush          48
	//  146  315:isub            
	//  147  316:ineg            
	//  148  317:i2l             
	//  149  318:lstore          15
					i = 2;
	//  150  320:iconst_2        
	//  151  321:istore_2        
					flag1 = flag;
	//  152  322:iload           5
	//  153  324:istore          9
					k1 = k;
	//  154  326:iload           4
	//  155  328:istore          10
					break;
	//  156  330:goto            477
				}
				if(j1 == 2)
	//* 157  333:iload           8
	//* 158  335:iconst_2        
	//* 159  336:icmpne          411
				{
					if(l2 == 0L)
	//* 160  339:lload           13
	//* 161  341:lconst_0        
	//* 162  342:lcmp            
	//* 163  343:ifne            348
						return 0;
	//  164  346:iconst_0        
	//  165  347:ireturn         
					l3 = 10L * l2 - (long)(c - 48);
	//  166  348:ldc2w           #252 <Long 10L>
	//  167  351:lload           13
	//  168  353:lmul            
	//  169  354:iload_1         
	//  170  355:bipush          48
	//  171  357:isub            
	//  172  358:i2l             
	//  173  359:lsub            
	//  174  360:lstore          15
					if(l2 > 0x33333334L || l2 == 0x33333334L && l3 < l2)
	//* 175  362:lload           13
	//* 176  364:ldc2w           #11  <Long 0x33333334L>
	//* 177  367:lcmp            
	//* 178  368:ifgt            388
	//* 179  371:lload           13
	//* 180  373:ldc2w           #11  <Long 0x33333334L>
	//* 181  376:lcmp            
	//* 182  377:ifne            393
	//* 183  380:lload           15
	//* 184  382:lload           13
	//* 185  384:lcmp            
	//* 186  385:ifge            393
						i = 1;
	//  187  388:iconst_1        
	//  188  389:istore_2        
					else
	//* 189  390:goto            395
						i = 0;
	//  190  393:iconst_0        
	//  191  394:istore_2        
					k1 = k & i;
	//  192  395:iload           4
	//  193  397:iload_2         
	//  194  398:iand            
	//  195  399:istore          10
					flag1 = flag;
	//  196  401:iload           5
	//  197  403:istore          9
					i = j1;
	//  198  405:iload           8
	//  199  407:istore_2        
					break;
	//  200  408:goto            477
				}
				if(j1 == 3)
	//* 201  411:iload           8
	//* 202  413:iconst_3        
	//* 203  414:icmpne          434
				{
					i = 4;
	//  204  417:iconst_4        
	//  205  418:istore_2        
					l3 = l2;
	//  206  419:lload           13
	//  207  421:lstore          15
					flag1 = flag;
	//  208  423:iload           5
	//  209  425:istore          9
					k1 = k;
	//  210  427:iload           4
	//  211  429:istore          10
					break;
	//  212  431:goto            477
				}
				if(j1 != 5)
	//* 213  434:iload           8
	//* 214  436:iconst_5        
	//* 215  437:icmpeq          462
				{
					l3 = l2;
	//  216  440:lload           13
	//  217  442:lstore          15
					flag1 = flag;
	//  218  444:iload           5
	//  219  446:istore          9
					k1 = k;
	//  220  448:iload           4
	//  221  450:istore          10
					i = j1;
	//  222  452:iload           8
	//  223  454:istore_2        
					if(j1 != 6)
						break;
	//  224  455:iload           8
	//  225  457:bipush          6
	//  226  459:icmpne          477
				}
				i = 7;
	//  227  462:bipush          7
	//  228  464:istore_2        
				k1 = k;
	//  229  465:iload           4
	//  230  467:istore          10
				flag1 = flag;
	//  231  469:iload           5
	//  232  471:istore          9
				l3 = l2;
	//  233  473:lload           13
	//  234  475:lstore          15
				break;
			}
			j++;
	//  235  477:iload_3         
	//  236  478:iconst_1        
	//  237  479:iadd            
	//  238  480:istore_3        
			i2 = i1;
	//  239  481:iload           7
	//  240  483:istore          12
			l1 = l;
	//  241  485:iload           6
	//  242  487:istore          11
			l2 = l3;
	//  243  489:lload           15
	//  244  491:lstore          13
			flag = flag1;
	//  245  493:iload           9
	//  246  495:istore          5
			k = k1;
	//  247  497:iload           10
	//  248  499:istore          4
			j1 = i;
	//  249  501:iload_2         
	//  250  502:istore          8
		} while(true);
	//  251  504:goto            32
		if(j1 == 2 && k != 0 && (l2 != 0x0L || flag) && (l2 != 0L || !flag))
	//* 252  507:iload           8
	//* 253  509:iconst_2        
	//* 254  510:icmpne          582
	//* 255  513:iload           4
	//* 256  515:ifeq            582
	//* 257  518:lload           13
	//* 258  520:ldc2w           #254 <Long 0x0L>
	//* 259  523:lcmp            
	//* 260  524:ifne            532
	//* 261  527:iload           5
	//* 262  529:ifeq            582
	//* 263  532:lload           13
	//* 264  534:lconst_0        
	//* 265  535:lcmp            
	//* 266  536:ifne            544
	//* 267  539:iload           5
	//* 268  541:ifne            582
		{
			if(!flag)
	//* 269  544:iload           5
	//* 270  546:ifeq            552
	//* 271  549:goto            557
				l2 = -l2;
	//  272  552:lload           13
	//  273  554:lneg            
	//  274  555:lstore          13
			peekedLong = l2;
	//  275  557:aload_0         
	//  276  558:lload           13
	//  277  560:putfield        #257 <Field long peekedLong>
			pos = pos + j;
	//  278  563:aload_0         
	//  279  564:aload_0         
	//  280  565:getfield        #109 <Field int pos>
	//  281  568:iload_3         
	//  282  569:iadd            
	//  283  570:putfield        #109 <Field int pos>
			peeked = 15;
	//  284  573:aload_0         
	//  285  574:bipush          15
	//  286  576:putfield        #117 <Field int peeked>
			return 15;
	//  287  579:bipush          15
	//  288  581:ireturn         
		}
		if(j1 == 2 || j1 == 4 || j1 == 7)
	//* 289  582:iload           8
	//* 290  584:iconst_2        
	//* 291  585:icmpeq          601
	//* 292  588:iload           8
	//* 293  590:iconst_4        
	//* 294  591:icmpeq          601
	//* 295  594:iload           8
	//* 296  596:bipush          7
	//* 297  598:icmpne          615
		{
			peekedNumberLength = j;
	//  298  601:aload_0         
	//  299  602:iload_3         
	//  300  603:putfield        #259 <Field int peekedNumberLength>
			peeked = 16;
	//  301  606:aload_0         
	//  302  607:bipush          16
	//  303  609:putfield        #117 <Field int peeked>
			return 16;
	//  304  612:bipush          16
	//  305  614:ireturn         
		} else
		{
			return 0;
	//  306  615:iconst_0        
	//  307  616:ireturn         
		}
	}

	private void push(int i)
	{
		if(stackSize == stack.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field int stackSize>
	//*   2    4:aload_0         
	//*   3    5:getfield        #119 <Field int[] stack>
	//*   4    8:arraylength     
	//*   5    9:icmpne          103
		{
			int ai[] = new int[stackSize * 2];
	//    6   12:aload_0         
	//    7   13:getfield        #121 <Field int stackSize>
	//    8   16:iconst_2        
	//    9   17:imul            
	//   10   18:newarray        int[]
	//   11   20:astore_3        
			int ai2[] = new int[stackSize * 2];
	//   12   21:aload_0         
	//   13   22:getfield        #121 <Field int stackSize>
	//   14   25:iconst_2        
	//   15   26:imul            
	//   16   27:newarray        int[]
	//   17   29:astore          4
			String as[] = new String[stackSize * 2];
	//   18   31:aload_0         
	//   19   32:getfield        #121 <Field int stackSize>
	//   20   35:iconst_2        
	//   21   36:imul            
	//   22   37:anewarray       String[]
	//   23   40:astore          5
			System.arraycopy(((Object) (stack)), 0, ((Object) (ai)), 0, stackSize);
	//   24   42:aload_0         
	//   25   43:getfield        #119 <Field int[] stack>
	//   26   46:iconst_0        
	//   27   47:aload_3         
	//   28   48:iconst_0        
	//   29   49:aload_0         
	//   30   50:getfield        #121 <Field int stackSize>
	//   31   53:invokestatic    #159 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (pathIndices)), 0, ((Object) (ai2)), 0, stackSize);
	//   32   56:aload_0         
	//   33   57:getfield        #125 <Field int[] pathIndices>
	//   34   60:iconst_0        
	//   35   61:aload           4
	//   36   63:iconst_0        
	//   37   64:aload_0         
	//   38   65:getfield        #121 <Field int stackSize>
	//   39   68:invokestatic    #159 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (pathNames)), 0, ((Object) (as)), 0, stackSize);
	//   40   71:aload_0         
	//   41   72:getfield        #123 <Field String[] pathNames>
	//   42   75:iconst_0        
	//   43   76:aload           5
	//   44   78:iconst_0        
	//   45   79:aload_0         
	//   46   80:getfield        #121 <Field int stackSize>
	//   47   83:invokestatic    #159 <Method void System.arraycopy(Object, int, Object, int, int)>
			stack = ai;
	//   48   86:aload_0         
	//   49   87:aload_3         
	//   50   88:putfield        #119 <Field int[] stack>
			pathIndices = ai2;
	//   51   91:aload_0         
	//   52   92:aload           4
	//   53   94:putfield        #125 <Field int[] pathIndices>
			pathNames = as;
	//   54   97:aload_0         
	//   55   98:aload           5
	//   56  100:putfield        #123 <Field String[] pathNames>
		}
		int ai1[] = stack;
	//   57  103:aload_0         
	//   58  104:getfield        #119 <Field int[] stack>
	//   59  107:astore_3        
		int j = stackSize;
	//   60  108:aload_0         
	//   61  109:getfield        #121 <Field int stackSize>
	//   62  112:istore_2        
		stackSize = j + 1;
	//   63  113:aload_0         
	//   64  114:iload_2         
	//   65  115:iconst_1        
	//   66  116:iadd            
	//   67  117:putfield        #121 <Field int stackSize>
		ai1[j] = i;
	//   68  120:aload_3         
	//   69  121:iload_2         
	//   70  122:iload_1         
	//   71  123:iastore         
	//   72  124:return          
	}

	private char readEscapeCharacter()
		throws IOException
	{
		if(pos == limit && !fillBuffer(1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field int pos>
	//*   2    4:aload_0         
	//*   3    5:getfield        #111 <Field int limit>
	//*   4    8:icmpne          27
	//*   5   11:aload_0         
	//*   6   12:iconst_1        
	//*   7   13:invokespecial   #153 <Method boolean fillBuffer(int)>
	//*   8   16:ifne            27
			throw syntaxError("Unterminated escape sequence");
	//    9   19:aload_0         
	//   10   20:ldc2            #262 <String "Unterminated escape sequence">
	//   11   23:invokespecial   #143 <Method IOException syntaxError(String)>
	//   12   26:athrow          
		char ac[] = buffer;
	//   13   27:aload_0         
	//   14   28:getfield        #107 <Field char[] buffer>
	//   15   31:astore          6
		int i = pos;
	//   16   33:aload_0         
	//   17   34:getfield        #109 <Field int pos>
	//   18   37:istore_2        
		pos = i + 1;
	//   19   38:aload_0         
	//   20   39:iload_2         
	//   21   40:iconst_1        
	//   22   41:iadd            
	//   23   42:putfield        #109 <Field int pos>
		char c = ac[i];
	//   24   45:aload           6
	//   25   47:iload_2         
	//   26   48:caload          
	//   27   49:istore_1        
		switch(c)
	//*  28   50:iload_1         
		{
	//*  29   51:lookupswitch    11: default 148
	//	               10: 374
	//	               34: 392
	//	               39: 392
	//	               47: 392
	//	               92: 392
	//	               98: 362
	//	               102: 371
	//	               110: 365
	//	               114: 368
	//	               116: 359
	//	               117: 151
	//*  30  148:goto            394
		case 117: // 'u'
			if(pos + 4 > limit && !fillBuffer(4))
	//*  31  151:aload_0         
	//*  32  152:getfield        #109 <Field int pos>
	//*  33  155:iconst_4        
	//*  34  156:iadd            
	//*  35  157:aload_0         
	//*  36  158:getfield        #111 <Field int limit>
	//*  37  161:icmple          180
	//*  38  164:aload_0         
	//*  39  165:iconst_4        
	//*  40  166:invokespecial   #153 <Method boolean fillBuffer(int)>
	//*  41  169:ifne            180
				throw syntaxError("Unterminated escape sequence");
	//   42  172:aload_0         
	//   43  173:ldc2            #262 <String "Unterminated escape sequence">
	//   44  176:invokespecial   #143 <Method IOException syntaxError(String)>
	//   45  179:athrow          
			c = '\0';
	//   46  180:iconst_0        
	//   47  181:istore_1        
			int k = pos;
	//   48  182:aload_0         
	//   49  183:getfield        #109 <Field int pos>
	//   50  186:istore_3        
			for(int j = k; j < k + 4; j++)
	//*  51  187:iload_3         
	//*  52  188:istore_2        
	//*  53  189:iload_2         
	//*  54  190:iload_3         
	//*  55  191:iconst_4        
	//*  56  192:iadd            
	//*  57  193:icmpge          347
			{
				char c1 = buffer[j];
	//   58  196:aload_0         
	//   59  197:getfield        #107 <Field char[] buffer>
	//   60  200:iload_2         
	//   61  201:caload          
	//   62  202:istore          4
				char c2 = (char)(c << 4);
	//   63  204:iload_1         
	//   64  205:iconst_4        
	//   65  206:ishl            
	//   66  207:int2char        
	//   67  208:istore          5
				if(c1 >= '0' && c1 <= '9')
	//*  68  210:iload           4
	//*  69  212:bipush          48
	//*  70  214:icmplt          237
	//*  71  217:iload           4
	//*  72  219:bipush          57
	//*  73  221:icmpgt          237
				{
					c = (char)((c1 - 48) + c2);
	//   74  224:iload           4
	//   75  226:bipush          48
	//   76  228:isub            
	//   77  229:iload           5
	//   78  231:iadd            
	//   79  232:int2char        
	//   80  233:istore_1        
					continue;
	//   81  234:goto            340
				}
				if(c1 >= 'a' && c1 <= 'f')
	//*  82  237:iload           4
	//*  83  239:bipush          97
	//*  84  241:icmplt          267
	//*  85  244:iload           4
	//*  86  246:bipush          102
	//*  87  248:icmpgt          267
				{
					c = (char)((c1 - 97) + 10 + c2);
	//   88  251:iload           4
	//   89  253:bipush          97
	//   90  255:isub            
	//   91  256:bipush          10
	//   92  258:iadd            
	//   93  259:iload           5
	//   94  261:iadd            
	//   95  262:int2char        
	//   96  263:istore_1        
					continue;
	//   97  264:goto            340
				}
				if(c1 >= 'A' && c1 <= 'F')
	//*  98  267:iload           4
	//*  99  269:bipush          65
	//* 100  271:icmplt          297
	//* 101  274:iload           4
	//* 102  276:bipush          70
	//* 103  278:icmpgt          297
					c = (char)((c1 - 65) + 10 + c2);
	//  104  281:iload           4
	//  105  283:bipush          65
	//  106  285:isub            
	//  107  286:bipush          10
	//  108  288:iadd            
	//  109  289:iload           5
	//  110  291:iadd            
	//  111  292:int2char        
	//  112  293:istore_1        
				else
	//* 113  294:goto            340
					throw new NumberFormatException((new StringBuilder()).append("\\u").append(new String(buffer, pos, 4)).toString());
	//  114  297:new             #264 <Class NumberFormatException>
	//  115  300:dup             
	//  116  301:new             #185 <Class StringBuilder>
	//  117  304:dup             
	//  118  305:invokespecial   #186 <Method void StringBuilder()>
	//  119  308:ldc2            #266 <String "\\u">
	//  120  311:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//  121  314:new             #85  <Class String>
	//  122  317:dup             
	//  123  318:aload_0         
	//  124  319:getfield        #107 <Field char[] buffer>
	//  125  322:aload_0         
	//  126  323:getfield        #109 <Field int pos>
	//  127  326:iconst_4        
	//  128  327:invokespecial   #205 <Method void String(char[], int, int)>
	//  129  330:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//  130  333:invokevirtual   #199 <Method String StringBuilder.toString()>
	//  131  336:invokespecial   #267 <Method void NumberFormatException(String)>
	//  132  339:athrow          
			}

	//  133  340:iload_2         
	//  134  341:iconst_1        
	//  135  342:iadd            
	//  136  343:istore_2        
	//* 137  344:goto            189
			pos = pos + 4;
	//  138  347:aload_0         
	//  139  348:aload_0         
	//  140  349:getfield        #109 <Field int pos>
	//  141  352:iconst_4        
	//  142  353:iadd            
	//  143  354:putfield        #109 <Field int pos>
			return c;
	//  144  357:iload_1         
	//  145  358:ireturn         

		case 116: // 't'
			return '\t';
	//  146  359:bipush          9
	//  147  361:ireturn         

		case 98: // 'b'
			return '\b';
	//  148  362:bipush          8
	//  149  364:ireturn         

		case 110: // 'n'
			return '\n';
	//  150  365:bipush          10
	//  151  367:ireturn         

		case 114: // 'r'
			return '\r';
	//  152  368:bipush          13
	//  153  370:ireturn         

		case 102: // 'f'
			return '\f';
	//  154  371:bipush          12
	//  155  373:ireturn         

		case 10: // '\n'
			lineNumber = lineNumber + 1;
	//  156  374:aload_0         
	//  157  375:aload_0         
	//  158  376:getfield        #113 <Field int lineNumber>
	//  159  379:iconst_1        
	//  160  380:iadd            
	//  161  381:putfield        #113 <Field int lineNumber>
			lineStart = pos;
	//  162  384:aload_0         
	//  163  385:aload_0         
	//  164  386:getfield        #109 <Field int pos>
	//  165  389:putfield        #115 <Field int lineStart>
			// fall through

		case 34: // '"'
		case 39: // '\''
		case 47: // '/'
		case 92: // '\\'
			return c;
	//  166  392:iload_1         
	//  167  393:ireturn         

		default:
			throw syntaxError("Invalid escape sequence");
	//  168  394:aload_0         
	//  169  395:ldc2            #269 <String "Invalid escape sequence">
	//  170  398:invokespecial   #143 <Method IOException syntaxError(String)>
	//  171  401:athrow          
		}
	}

	private void skipQuotedValue(char c)
		throws IOException
	{
		char ac[] = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field char[] buffer>
	//    2    4:astore          7
		do
		{
			int i = pos;
	//    3    6:aload_0         
	//    4    7:getfield        #109 <Field int pos>
	//    5   10:istore_2        
			int k;
			for(int j = limit; i < j; j = k)
	//*   6   11:aload_0         
	//*   7   12:getfield        #111 <Field int limit>
	//*   8   15:istore_3        
	//*   9   16:iload_2         
	//*  10   17:iload_3         
	//*  11   18:icmpge          118
			{
				int l = i + 1;
	//   12   21:iload_2         
	//   13   22:iconst_1        
	//   14   23:iadd            
	//   15   24:istore          5
				char c1 = ac[i];
	//   16   26:aload           7
	//   17   28:iload_2         
	//   18   29:caload          
	//   19   30:istore          6
				if(c1 == c)
	//*  20   32:iload           6
	//*  21   34:iload_1         
	//*  22   35:icmpne          45
				{
					pos = l;
	//   23   38:aload_0         
	//   24   39:iload           5
	//   25   41:putfield        #109 <Field int pos>
					return;
	//   26   44:return          
				}
				if(c1 == '\\')
	//*  27   45:iload           6
	//*  28   47:bipush          92
	//*  29   49:icmpne          77
				{
					pos = l;
	//   30   52:aload_0         
	//   31   53:iload           5
	//   32   55:putfield        #109 <Field int pos>
					readEscapeCharacter();
	//   33   58:aload_0         
	//   34   59:invokespecial   #221 <Method char readEscapeCharacter()>
	//   35   62:pop             
					i = pos;
	//   36   63:aload_0         
	//   37   64:getfield        #109 <Field int pos>
	//   38   67:istore_2        
					k = limit;
	//   39   68:aload_0         
	//   40   69:getfield        #111 <Field int limit>
	//   41   72:istore          4
					continue;
	//   42   74:goto            112
				}
				i = l;
	//   43   77:iload           5
	//   44   79:istore_2        
				k = j;
	//   45   80:iload_3         
	//   46   81:istore          4
				if(c1 == '\n')
	//*  47   83:iload           6
	//*  48   85:bipush          10
	//*  49   87:icmpne          112
				{
					lineNumber = lineNumber + 1;
	//   50   90:aload_0         
	//   51   91:aload_0         
	//   52   92:getfield        #113 <Field int lineNumber>
	//   53   95:iconst_1        
	//   54   96:iadd            
	//   55   97:putfield        #113 <Field int lineNumber>
					lineStart = l;
	//   56  100:aload_0         
	//   57  101:iload           5
	//   58  103:putfield        #115 <Field int lineStart>
					k = j;
	//   59  106:iload_3         
	//   60  107:istore          4
					i = l;
	//   61  109:iload           5
	//   62  111:istore_2        
				}
			}

	//   63  112:iload           4
	//   64  114:istore_3        
	//*  65  115:goto            16
			pos = i;
	//   66  118:aload_0         
	//   67  119:iload_2         
	//   68  120:putfield        #109 <Field int pos>
		} while(fillBuffer(1));
	//   69  123:aload_0         
	//   70  124:iconst_1        
	//   71  125:invokespecial   #153 <Method boolean fillBuffer(int)>
	//   72  128:ifne            6
		throw syntaxError("Unterminated string");
	//   73  131:aload_0         
	//   74  132:ldc1            #226 <String "Unterminated string">
	//   75  134:invokespecial   #143 <Method IOException syntaxError(String)>
	//   76  137:athrow          
	}

	private boolean skipTo(String s)
		throws IOException
	{
label0:
		for(int j = s.length(); pos + j <= limit || fillBuffer(j); pos = pos + 1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #244 <Method int String.length()>
	//*   2    4:istore_3        
	//*   3    5:aload_0         
	//*   4    6:getfield        #109 <Field int pos>
	//*   5    9:iload_3         
	//*   6   10:iadd            
	//*   7   11:aload_0         
	//*   8   12:getfield        #111 <Field int limit>
	//*   9   15:icmple          26
	//*  10   18:aload_0         
	//*  11   19:iload_3         
	//*  12   20:invokespecial   #153 <Method boolean fillBuffer(int)>
	//*  13   23:ifeq            114
		{
			if(buffer[pos] == '\n')
	//*  14   26:aload_0         
	//*  15   27:getfield        #107 <Field char[] buffer>
	//*  16   30:aload_0         
	//*  17   31:getfield        #109 <Field int pos>
	//*  18   34:caload          
	//*  19   35:bipush          10
	//*  20   37:icmpne          63
			{
				lineNumber = lineNumber + 1;
	//   21   40:aload_0         
	//   22   41:aload_0         
	//   23   42:getfield        #113 <Field int lineNumber>
	//   24   45:iconst_1        
	//   25   46:iadd            
	//   26   47:putfield        #113 <Field int lineNumber>
				lineStart = pos + 1;
	//   27   50:aload_0         
	//   28   51:aload_0         
	//   29   52:getfield        #109 <Field int pos>
	//   30   55:iconst_1        
	//   31   56:iadd            
	//   32   57:putfield        #115 <Field int lineStart>
				continue;
	//   33   60:goto            101
			}
			for(int i = 0; i < j; i++)
	//*  34   63:iconst_0        
	//*  35   64:istore_2        
	//*  36   65:iload_2         
	//*  37   66:iload_3         
	//*  38   67:icmpge          99
				if(buffer[pos + i] != s.charAt(i))
	//*  39   70:aload_0         
	//*  40   71:getfield        #107 <Field char[] buffer>
	//*  41   74:aload_0         
	//*  42   75:getfield        #109 <Field int pos>
	//*  43   78:iload_2         
	//*  44   79:iadd            
	//*  45   80:caload          
	//*  46   81:aload_1         
	//*  47   82:iload_2         
	//*  48   83:invokevirtual   #248 <Method char String.charAt(int)>
	//*  49   86:icmpeq          92
					continue label0;
	//   50   89:goto            101

	//   51   92:iload_2         
	//   52   93:iconst_1        
	//   53   94:iadd            
	//   54   95:istore_2        
	//*  55   96:goto            65
			return true;
	//   56   99:iconst_1        
	//   57  100:ireturn         
		}

	//   58  101:aload_0         
	//   59  102:aload_0         
	//   60  103:getfield        #109 <Field int pos>
	//   61  106:iconst_1        
	//   62  107:iadd            
	//   63  108:putfield        #109 <Field int pos>
	//*  64  111:goto            5
		return false;
	//   65  114:iconst_0        
	//   66  115:ireturn         
	}

	private void skipToEndOfLine()
		throws IOException
	{
		while(pos < limit || fillBuffer(1)) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field int pos>
	//*   2    4:aload_0         
	//*   3    5:getfield        #111 <Field int limit>
	//*   4    8:icmplt          19
	//*   5   11:aload_0         
	//*   6   12:iconst_1        
	//*   7   13:invokespecial   #153 <Method boolean fillBuffer(int)>
	//*   8   16:ifeq            75
		{
			char ac[] = buffer;
	//    9   19:aload_0         
	//   10   20:getfield        #107 <Field char[] buffer>
	//   11   23:astore_2        
			int i = pos;
	//   12   24:aload_0         
	//   13   25:getfield        #109 <Field int pos>
	//   14   28:istore_1        
			pos = i + 1;
	//   15   29:aload_0         
	//   16   30:iload_1         
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:putfield        #109 <Field int pos>
			i = ((int) (ac[i]));
	//   20   36:aload_2         
	//   21   37:iload_1         
	//   22   38:caload          
	//   23   39:istore_1        
			if(i == '\n')
	//*  24   40:iload_1         
	//*  25   41:bipush          10
	//*  26   43:icmpne          65
			{
				lineNumber = lineNumber + 1;
	//   27   46:aload_0         
	//   28   47:aload_0         
	//   29   48:getfield        #113 <Field int lineNumber>
	//   30   51:iconst_1        
	//   31   52:iadd            
	//   32   53:putfield        #113 <Field int lineNumber>
				lineStart = pos;
	//   33   56:aload_0         
	//   34   57:aload_0         
	//   35   58:getfield        #109 <Field int pos>
	//   36   61:putfield        #115 <Field int lineStart>
				return;
	//   37   64:return          
			}
			if(i == '\r')
	//*  38   65:iload_1         
	//*  39   66:bipush          13
	//*  40   68:icmpne          72
				return;
	//   41   71:return          
		}
	//*  42   72:goto            0
	//   43   75:return          
	}

	private void skipUnquotedValue()
		throws IOException
	{
label0:
		do
		{
			int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
			do
				if(pos + i < limit)
	//*   2    2:aload_0         
	//*   3    3:getfield        #109 <Field int pos>
	//*   4    6:iload_1         
	//*   5    7:iadd            
	//*   6    8:aload_0         
	//*   7    9:getfield        #111 <Field int limit>
	//*   8   12:icmpge          189
				{
					switch(buffer[pos + i])
	//*   9   15:aload_0         
	//*  10   16:getfield        #107 <Field char[] buffer>
	//*  11   19:aload_0         
	//*  12   20:getfield        #109 <Field int pos>
	//*  13   23:iload_1         
	//*  14   24:iadd            
	//*  15   25:caload          
					{
	//*  16   26:lookupswitch    16: default 164
	//	               9: 171
	//	               10: 171
	//	               12: 171
	//	               13: 171
	//	               32: 171
	//	               35: 167
	//	               44: 171
	//	               47: 167
	//	               58: 171
	//	               59: 167
	//	               61: 167
	//	               91: 171
	//	               92: 167
	//	               93: 171
	//	               123: 171
	//	               125: 171
	//*  17  164:goto            182
					case 35: // '#'
					case 47: // '/'
					case 59: // ';'
					case 61: // '='
					case 92: // '\\'
						checkLenient();
	//   18  167:aload_0         
	//   19  168:invokespecial   #170 <Method void checkLenient()>
						// fall through

					case 9: // '\t'
					case 10: // '\n'
					case 12: // '\f'
					case 13: // '\r'
					case 32: // ' '
					case 44: // ','
					case 58: // ':'
					case 91: // '['
					case 93: // ']'
					case 123: // '{'
					case 125: // '}'
						pos = pos + i;
	//   20  171:aload_0         
	//   21  172:aload_0         
	//   22  173:getfield        #109 <Field int pos>
	//   23  176:iload_1         
	//   24  177:iadd            
	//   25  178:putfield        #109 <Field int pos>
						return;
	//   26  181:return          

					default:
						i++;
	//   27  182:iload_1         
	//   28  183:iconst_1        
	//   29  184:iadd            
	//   30  185:istore_1        
						break;
					}
				} else
	//*  31  186:goto            2
				{
					pos = pos + i;
	//   32  189:aload_0         
	//   33  190:aload_0         
	//   34  191:getfield        #109 <Field int pos>
	//   35  194:iload_1         
	//   36  195:iadd            
	//   37  196:putfield        #109 <Field int pos>
					continue label0;
				}
			while(true);
		} while(fillBuffer(1));
	//   38  199:aload_0         
	//   39  200:iconst_1        
	//   40  201:invokespecial   #153 <Method boolean fillBuffer(int)>
	//   41  204:ifne            0
	//   42  207:return          
	}

	private IOException syntaxError(String s)
		throws IOException
	{
		throw new MalformedJsonException((new StringBuilder()).append(s).append(locationString()).toString());
	//    0    0:new             #274 <Class MalformedJsonException>
	//    1    3:dup             
	//    2    4:new             #185 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #186 <Method void StringBuilder()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #196 <Method String locationString()>
	//    9   19:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   11   25:invokespecial   #275 <Method void MalformedJsonException(String)>
	//   12   28:athrow          
	}

	public void beginArray()
		throws IOException
	{
		int j = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #279 <Method int doPeek()>
	//    9   15:istore_1        
		if(i == 3)
	//*  10   16:iload_1         
	//*  11   17:iconst_3        
	//*  12   18:icmpne          44
		{
			push(1);
	//   13   21:aload_0         
	//   14   22:iconst_1        
	//   15   23:invokespecial   #281 <Method void push(int)>
			pathIndices[stackSize - 1] = 0;
	//   16   26:aload_0         
	//   17   27:getfield        #125 <Field int[] pathIndices>
	//   18   30:aload_0         
	//   19   31:getfield        #121 <Field int stackSize>
	//   20   34:iconst_1        
	//   21   35:isub            
	//   22   36:iconst_0        
	//   23   37:iastore         
			peeked = 0;
	//   24   38:aload_0         
	//   25   39:iconst_0        
	//   26   40:putfield        #117 <Field int peeked>
			return;
	//   27   43:return          
		} else
		{
			throw new IllegalStateException((new StringBuilder()).append("Expected BEGIN_ARRAY but was ").append(((Object) (peek()))).append(locationString()).toString());
	//   28   44:new             #283 <Class IllegalStateException>
	//   29   47:dup             
	//   30   48:new             #185 <Class StringBuilder>
	//   31   51:dup             
	//   32   52:invokespecial   #186 <Method void StringBuilder()>
	//   33   55:ldc2            #285 <String "Expected BEGIN_ARRAY but was ">
	//   34   58:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   35   61:aload_0         
	//   36   62:invokevirtual   #289 <Method JsonToken peek()>
	//   37   65:invokevirtual   #292 <Method StringBuilder StringBuilder.append(Object)>
	//   38   68:aload_0         
	//   39   69:invokevirtual   #196 <Method String locationString()>
	//   40   72:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   41   75:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   42   78:invokespecial   #293 <Method void IllegalStateException(String)>
	//   43   81:athrow          
		}
	}

	public void beginObject()
		throws IOException
	{
		int j = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #279 <Method int doPeek()>
	//    9   15:istore_1        
		if(i == 1)
	//*  10   16:iload_1         
	//*  11   17:iconst_1        
	//*  12   18:icmpne          32
		{
			push(3);
	//   13   21:aload_0         
	//   14   22:iconst_3        
	//   15   23:invokespecial   #281 <Method void push(int)>
			peeked = 0;
	//   16   26:aload_0         
	//   17   27:iconst_0        
	//   18   28:putfield        #117 <Field int peeked>
			return;
	//   19   31:return          
		} else
		{
			throw new IllegalStateException((new StringBuilder()).append("Expected BEGIN_OBJECT but was ").append(((Object) (peek()))).append(locationString()).toString());
	//   20   32:new             #283 <Class IllegalStateException>
	//   21   35:dup             
	//   22   36:new             #185 <Class StringBuilder>
	//   23   39:dup             
	//   24   40:invokespecial   #186 <Method void StringBuilder()>
	//   25   43:ldc2            #296 <String "Expected BEGIN_OBJECT but was ">
	//   26   46:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   27   49:aload_0         
	//   28   50:invokevirtual   #289 <Method JsonToken peek()>
	//   29   53:invokevirtual   #292 <Method StringBuilder StringBuilder.append(Object)>
	//   30   56:aload_0         
	//   31   57:invokevirtual   #196 <Method String locationString()>
	//   32   60:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   33   63:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   34   66:invokespecial   #293 <Method void IllegalStateException(String)>
	//   35   69:athrow          
		}
	}

	public void close()
		throws IOException
	{
		peeked = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #117 <Field int peeked>
		stack[0] = 8;
	//    3    5:aload_0         
	//    4    6:getfield        #119 <Field int[] stack>
	//    5    9:iconst_0        
	//    6   10:bipush          8
	//    7   12:iastore         
		stackSize = 1;
	//    8   13:aload_0         
	//    9   14:iconst_1        
	//   10   15:putfield        #121 <Field int stackSize>
		in.close();
	//   11   18:aload_0         
	//   12   19:getfield        #134 <Field Reader in>
	//   13   22:invokevirtual   #299 <Method void Reader.close()>
	//   14   25:return          
	}

	int doPeek()
		throws IOException
	{
		int i = stack[stackSize - 1];
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field int[] stack>
	//    2    4:aload_0         
	//    3    5:getfield        #121 <Field int stackSize>
	//    4    8:iconst_1        
	//    5    9:isub            
	//    6   10:iaload          
	//    7   11:istore_1        
		if(i == 1)
	//*   8   12:iload_1         
	//*   9   13:iconst_1        
	//*  10   14:icmpne          32
			stack[stackSize - 1] = 2;
	//   11   17:aload_0         
	//   12   18:getfield        #119 <Field int[] stack>
	//   13   21:aload_0         
	//   14   22:getfield        #121 <Field int stackSize>
	//   15   25:iconst_1        
	//   16   26:isub            
	//   17   27:iconst_2        
	//   18   28:iastore         
		else
	//*  19   29:goto            530
		if(i == 2)
	//*  20   32:iload_1         
	//*  21   33:iconst_2        
	//*  22   34:icmpne          104
		{
			switch(nextNonWhitespace(true))
	//*  23   37:aload_0         
	//*  24   38:iconst_1        
	//*  25   39:invokespecial   #149 <Method int nextNonWhitespace(boolean)>
			{
	//*  26   42:lookupswitch    3: default 76
	//	               44: 90
	//	               59: 86
	//	               93: 79
	//*  27   76:goto            93
			case 93: // ']'
				peeked = 4;
	//   28   79:aload_0         
	//   29   80:iconst_4        
	//   30   81:putfield        #117 <Field int peeked>
				return 4;
	//   31   84:iconst_4        
	//   32   85:ireturn         

			case 59: // ';'
				checkLenient();
	//   33   86:aload_0         
	//   34   87:invokespecial   #170 <Method void checkLenient()>
				break;

	//*  35   90:goto            101
			default:
				throw syntaxError("Unterminated array");
	//   36   93:aload_0         
	//   37   94:ldc2            #301 <String "Unterminated array">
	//   38   97:invokespecial   #143 <Method IOException syntaxError(String)>
	//   39  100:athrow          

			case 44: // ','
				break;
			}
		} else
	//*  40  101:goto            530
		{
			if(i == 3 || i == 5)
	//*  41  104:iload_1         
	//*  42  105:iconst_3        
	//*  43  106:icmpeq          114
	//*  44  109:iload_1         
	//*  45  110:iconst_5        
	//*  46  111:icmpne          325
			{
				stack[stackSize - 1] = 4;
	//   47  114:aload_0         
	//   48  115:getfield        #119 <Field int[] stack>
	//   49  118:aload_0         
	//   50  119:getfield        #121 <Field int stackSize>
	//   51  122:iconst_1        
	//   52  123:isub            
	//   53  124:iconst_4        
	//   54  125:iastore         
				if(i == 5)
	//*  55  126:iload_1         
	//*  56  127:iconst_5        
	//*  57  128:icmpne          197
					switch(nextNonWhitespace(true))
	//*  58  131:aload_0         
	//*  59  132:iconst_1        
	//*  60  133:invokespecial   #149 <Method int nextNonWhitespace(boolean)>
					{
	//*  61  136:lookupswitch    3: default 172
	//	               44: 186
	//	               59: 182
	//	               125: 175
	//*  62  172:goto            189
					case 125: // '}'
						peeked = 2;
	//   63  175:aload_0         
	//   64  176:iconst_2        
	//   65  177:putfield        #117 <Field int peeked>
						return 2;
	//   66  180:iconst_2        
	//   67  181:ireturn         

					case 59: // ';'
						checkLenient();
	//   68  182:aload_0         
	//   69  183:invokespecial   #170 <Method void checkLenient()>
						break;

	//*  70  186:goto            197
					default:
						throw syntaxError("Unterminated object");
	//   71  189:aload_0         
	//   72  190:ldc2            #303 <String "Unterminated object">
	//   73  193:invokespecial   #143 <Method IOException syntaxError(String)>
	//   74  196:athrow          

					case 44: // ','
						break;
					}
				int j = nextNonWhitespace(true);
	//   75  197:aload_0         
	//   76  198:iconst_1        
	//   77  199:invokespecial   #149 <Method int nextNonWhitespace(boolean)>
	//   78  202:istore_2        
				switch(j)
	//*  79  203:iload_2         
				{
	//*  80  204:lookupswitch    3: default 240
	//	               34: 243
	//	               39: 252
	//	               125: 265
	//*  81  240:goto            285
				case 34: // '"'
					peeked = 13;
	//   82  243:aload_0         
	//   83  244:bipush          13
	//   84  246:putfield        #117 <Field int peeked>
					return 13;
	//   85  249:bipush          13
	//   86  251:ireturn         

				case 39: // '\''
					checkLenient();
	//   87  252:aload_0         
	//   88  253:invokespecial   #170 <Method void checkLenient()>
					peeked = 12;
	//   89  256:aload_0         
	//   90  257:bipush          12
	//   91  259:putfield        #117 <Field int peeked>
					return 12;
	//   92  262:bipush          12
	//   93  264:ireturn         

				case 125: // '}'
					if(i != 5)
	//*  94  265:iload_1         
	//*  95  266:iconst_5        
	//*  96  267:icmpeq          277
					{
						peeked = 2;
	//   97  270:aload_0         
	//   98  271:iconst_2        
	//   99  272:putfield        #117 <Field int peeked>
						return 2;
	//  100  275:iconst_2        
	//  101  276:ireturn         
					} else
					{
						throw syntaxError("Expected name");
	//  102  277:aload_0         
	//  103  278:ldc2            #305 <String "Expected name">
	//  104  281:invokespecial   #143 <Method IOException syntaxError(String)>
	//  105  284:athrow          
					}
				}
				checkLenient();
	//  106  285:aload_0         
	//  107  286:invokespecial   #170 <Method void checkLenient()>
				pos = pos - 1;
	//  108  289:aload_0         
	//  109  290:aload_0         
	//  110  291:getfield        #109 <Field int pos>
	//  111  294:iconst_1        
	//  112  295:isub            
	//  113  296:putfield        #109 <Field int pos>
				if(isLiteral((char)j))
	//* 114  299:aload_0         
	//* 115  300:iload_2         
	//* 116  301:int2char        
	//* 117  302:invokespecial   #250 <Method boolean isLiteral(char)>
	//* 118  305:ifeq            317
				{
					peeked = 14;
	//  119  308:aload_0         
	//  120  309:bipush          14
	//  121  311:putfield        #117 <Field int peeked>
					return 14;
	//  122  314:bipush          14
	//  123  316:ireturn         
				} else
				{
					throw syntaxError("Expected name");
	//  124  317:aload_0         
	//  125  318:ldc2            #305 <String "Expected name">
	//  126  321:invokespecial   #143 <Method IOException syntaxError(String)>
	//  127  324:athrow          
				}
			}
			if(i == 4)
	//* 128  325:iload_1         
	//* 129  326:iconst_4        
	//* 130  327:icmpne          439
			{
				stack[stackSize - 1] = 5;
	//  131  330:aload_0         
	//  132  331:getfield        #119 <Field int[] stack>
	//  133  334:aload_0         
	//  134  335:getfield        #121 <Field int stackSize>
	//  135  338:iconst_1        
	//  136  339:isub            
	//  137  340:iconst_5        
	//  138  341:iastore         
				switch(nextNonWhitespace(true))
	//* 139  342:aload_0         
	//* 140  343:iconst_1        
	//* 141  344:invokespecial   #149 <Method int nextNonWhitespace(boolean)>
				{
	//* 142  347:lookupswitch    2: default 372
	//	               58: 375
	//	               61: 378
	//* 143  372:goto            428
	//* 144  375:goto            436
				case 61: // '='
					checkLenient();
	//  145  378:aload_0         
	//  146  379:invokespecial   #170 <Method void checkLenient()>
					if((pos < limit || fillBuffer(1)) && buffer[pos] == '>')
	//* 147  382:aload_0         
	//* 148  383:getfield        #109 <Field int pos>
	//* 149  386:aload_0         
	//* 150  387:getfield        #111 <Field int limit>
	//* 151  390:icmplt          401
	//* 152  393:aload_0         
	//* 153  394:iconst_1        
	//* 154  395:invokespecial   #153 <Method boolean fillBuffer(int)>
	//* 155  398:ifeq            436
	//* 156  401:aload_0         
	//* 157  402:getfield        #107 <Field char[] buffer>
	//* 158  405:aload_0         
	//* 159  406:getfield        #109 <Field int pos>
	//* 160  409:caload          
	//* 161  410:bipush          62
	//* 162  412:icmpne          436
						pos = pos + 1;
	//  163  415:aload_0         
	//  164  416:aload_0         
	//  165  417:getfield        #109 <Field int pos>
	//  166  420:iconst_1        
	//  167  421:iadd            
	//  168  422:putfield        #109 <Field int pos>
					break;

	//* 169  425:goto            436
				default:
					throw syntaxError("Expected ':'");
	//  170  428:aload_0         
	//  171  429:ldc2            #307 <String "Expected ':'">
	//  172  432:invokespecial   #143 <Method IOException syntaxError(String)>
	//  173  435:athrow          

				case 58: // ':'
					break;
				}
			} else
	//* 174  436:goto            530
			if(i == 6)
	//* 175  439:iload_1         
	//* 176  440:bipush          6
	//* 177  442:icmpne          472
			{
				if(lenient)
	//* 178  445:aload_0         
	//* 179  446:getfield        #105 <Field boolean lenient>
	//* 180  449:ifeq            456
					consumeNonExecutePrefix();
	//  181  452:aload_0         
	//  182  453:invokespecial   #309 <Method void consumeNonExecutePrefix()>
				stack[stackSize - 1] = 7;
	//  183  456:aload_0         
	//  184  457:getfield        #119 <Field int[] stack>
	//  185  460:aload_0         
	//  186  461:getfield        #121 <Field int stackSize>
	//  187  464:iconst_1        
	//  188  465:isub            
	//  189  466:bipush          7
	//  190  468:iastore         
			} else
	//* 191  469:goto            530
			if(i == 7)
	//* 192  472:iload_1         
	//* 193  473:bipush          7
	//* 194  475:icmpne          513
			{
				if(nextNonWhitespace(false) == -1)
	//* 195  478:aload_0         
	//* 196  479:iconst_0        
	//* 197  480:invokespecial   #149 <Method int nextNonWhitespace(boolean)>
	//* 198  483:iconst_m1       
	//* 199  484:icmpne          496
				{
					peeked = 17;
	//  200  487:aload_0         
	//  201  488:bipush          17
	//  202  490:putfield        #117 <Field int peeked>
					return 17;
	//  203  493:bipush          17
	//  204  495:ireturn         
				}
				checkLenient();
	//  205  496:aload_0         
	//  206  497:invokespecial   #170 <Method void checkLenient()>
				pos = pos - 1;
	//  207  500:aload_0         
	//  208  501:aload_0         
	//  209  502:getfield        #109 <Field int pos>
	//  210  505:iconst_1        
	//  211  506:isub            
	//  212  507:putfield        #109 <Field int pos>
			} else
	//* 213  510:goto            530
			if(i == 8)
	//* 214  513:iload_1         
	//* 215  514:bipush          8
	//* 216  516:icmpne          530
				throw new IllegalStateException("JsonReader is closed");
	//  217  519:new             #283 <Class IllegalStateException>
	//  218  522:dup             
	//  219  523:ldc2            #311 <String "JsonReader is closed">
	//  220  526:invokespecial   #293 <Method void IllegalStateException(String)>
	//  221  529:athrow          
		}
		switch(nextNonWhitespace(true))
	//* 222  530:aload_0         
	//* 223  531:iconst_1        
	//* 224  532:invokespecial   #149 <Method int nextNonWhitespace(boolean)>
		{
	//* 225  535:lookupswitch    7: default 600
	//	               34: 669
	//	               39: 656
	//	               44: 615
	//	               59: 615
	//	               91: 678
	//	               93: 603
	//	               123: 685
	//* 226  600:goto            692
		case 93: // ']'
			if(i == 1)
	//* 227  603:iload_1         
	//* 228  604:iconst_1        
	//* 229  605:icmpne          615
			{
				peeked = 4;
	//  230  608:aload_0         
	//  231  609:iconst_4        
	//  232  610:putfield        #117 <Field int peeked>
				return 4;
	//  233  613:iconst_4        
	//  234  614:ireturn         
			}
			// fall through

		case 44: // ','
		case 59: // ';'
			if(i == 1 || i == 2)
	//* 235  615:iload_1         
	//* 236  616:iconst_1        
	//* 237  617:icmpeq          625
	//* 238  620:iload_1         
	//* 239  621:iconst_2        
	//* 240  622:icmpne          648
			{
				checkLenient();
	//  241  625:aload_0         
	//  242  626:invokespecial   #170 <Method void checkLenient()>
				pos = pos - 1;
	//  243  629:aload_0         
	//  244  630:aload_0         
	//  245  631:getfield        #109 <Field int pos>
	//  246  634:iconst_1        
	//  247  635:isub            
	//  248  636:putfield        #109 <Field int pos>
				peeked = 7;
	//  249  639:aload_0         
	//  250  640:bipush          7
	//  251  642:putfield        #117 <Field int peeked>
				return 7;
	//  252  645:bipush          7
	//  253  647:ireturn         
			} else
			{
				throw syntaxError("Unexpected value");
	//  254  648:aload_0         
	//  255  649:ldc2            #313 <String "Unexpected value">
	//  256  652:invokespecial   #143 <Method IOException syntaxError(String)>
	//  257  655:athrow          
			}

		case 39: // '\''
			checkLenient();
	//  258  656:aload_0         
	//  259  657:invokespecial   #170 <Method void checkLenient()>
			peeked = 8;
	//  260  660:aload_0         
	//  261  661:bipush          8
	//  262  663:putfield        #117 <Field int peeked>
			return 8;
	//  263  666:bipush          8
	//  264  668:ireturn         

		case 34: // '"'
			peeked = 9;
	//  265  669:aload_0         
	//  266  670:bipush          9
	//  267  672:putfield        #117 <Field int peeked>
			return 9;
	//  268  675:bipush          9
	//  269  677:ireturn         

		case 91: // '['
			peeked = 3;
	//  270  678:aload_0         
	//  271  679:iconst_3        
	//  272  680:putfield        #117 <Field int peeked>
			return 3;
	//  273  683:iconst_3        
	//  274  684:ireturn         

		case 123: // '{'
			peeked = 1;
	//  275  685:aload_0         
	//  276  686:iconst_1        
	//  277  687:putfield        #117 <Field int peeked>
			return 1;
	//  278  690:iconst_1        
	//  279  691:ireturn         

		default:
			pos = pos - 1;
	//  280  692:aload_0         
	//  281  693:aload_0         
	//  282  694:getfield        #109 <Field int pos>
	//  283  697:iconst_1        
	//  284  698:isub            
	//  285  699:putfield        #109 <Field int pos>
			i = peekKeyword();
	//  286  702:aload_0         
	//  287  703:invokespecial   #315 <Method int peekKeyword()>
	//  288  706:istore_1        
			break;
		}
		if(i != 0)
	//* 289  707:iload_1         
	//* 290  708:ifeq            713
			return i;
	//  291  711:iload_1         
	//  292  712:ireturn         
		i = peekNumber();
	//  293  713:aload_0         
	//  294  714:invokespecial   #317 <Method int peekNumber()>
	//  295  717:istore_1        
		if(i != 0)
	//* 296  718:iload_1         
	//* 297  719:ifeq            724
			return i;
	//  298  722:iload_1         
	//  299  723:ireturn         
		if(!isLiteral(buffer[pos]))
	//* 300  724:aload_0         
	//* 301  725:aload_0         
	//* 302  726:getfield        #107 <Field char[] buffer>
	//* 303  729:aload_0         
	//* 304  730:getfield        #109 <Field int pos>
	//* 305  733:caload          
	//* 306  734:invokespecial   #250 <Method boolean isLiteral(char)>
	//* 307  737:ifne            748
		{
			throw syntaxError("Expected value");
	//  308  740:aload_0         
	//  309  741:ldc2            #319 <String "Expected value">
	//  310  744:invokespecial   #143 <Method IOException syntaxError(String)>
	//  311  747:athrow          
		} else
		{
			checkLenient();
	//  312  748:aload_0         
	//  313  749:invokespecial   #170 <Method void checkLenient()>
			peeked = 10;
	//  314  752:aload_0         
	//  315  753:bipush          10
	//  316  755:putfield        #117 <Field int peeked>
			return 10;
	//  317  758:bipush          10
	//  318  760:ireturn         
		}
	}

	public void endArray()
		throws IOException
	{
		int k = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore_2        
		int i = k;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(k == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #279 <Method int doPeek()>
	//    9   15:istore_1        
		if(i == 4)
	//*  10   16:iload_1         
	//*  11   17:iconst_4        
	//*  12   18:icmpne          57
		{
			stackSize = stackSize - 1;
	//   13   21:aload_0         
	//   14   22:aload_0         
	//   15   23:getfield        #121 <Field int stackSize>
	//   16   26:iconst_1        
	//   17   27:isub            
	//   18   28:putfield        #121 <Field int stackSize>
			int ai[] = pathIndices;
	//   19   31:aload_0         
	//   20   32:getfield        #125 <Field int[] pathIndices>
	//   21   35:astore_3        
			int j = stackSize - 1;
	//   22   36:aload_0         
	//   23   37:getfield        #121 <Field int stackSize>
	//   24   40:iconst_1        
	//   25   41:isub            
	//   26   42:istore_1        
			ai[j] = ai[j] + 1;
	//   27   43:aload_3         
	//   28   44:iload_1         
	//   29   45:aload_3         
	//   30   46:iload_1         
	//   31   47:iaload          
	//   32   48:iconst_1        
	//   33   49:iadd            
	//   34   50:iastore         
			peeked = 0;
	//   35   51:aload_0         
	//   36   52:iconst_0        
	//   37   53:putfield        #117 <Field int peeked>
			return;
	//   38   56:return          
		} else
		{
			throw new IllegalStateException((new StringBuilder()).append("Expected END_ARRAY but was ").append(((Object) (peek()))).append(locationString()).toString());
	//   39   57:new             #283 <Class IllegalStateException>
	//   40   60:dup             
	//   41   61:new             #185 <Class StringBuilder>
	//   42   64:dup             
	//   43   65:invokespecial   #186 <Method void StringBuilder()>
	//   44   68:ldc2            #322 <String "Expected END_ARRAY but was ">
	//   45   71:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   46   74:aload_0         
	//   47   75:invokevirtual   #289 <Method JsonToken peek()>
	//   48   78:invokevirtual   #292 <Method StringBuilder StringBuilder.append(Object)>
	//   49   81:aload_0         
	//   50   82:invokevirtual   #196 <Method String locationString()>
	//   51   85:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   52   88:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   53   91:invokespecial   #293 <Method void IllegalStateException(String)>
	//   54   94:athrow          
		}
	}

	public void endObject()
		throws IOException
	{
		int k = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore_2        
		int i = k;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(k == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #279 <Method int doPeek()>
	//    9   15:istore_1        
		if(i == 2)
	//*  10   16:iload_1         
	//*  11   17:iconst_2        
	//*  12   18:icmpne          67
		{
			stackSize = stackSize - 1;
	//   13   21:aload_0         
	//   14   22:aload_0         
	//   15   23:getfield        #121 <Field int stackSize>
	//   16   26:iconst_1        
	//   17   27:isub            
	//   18   28:putfield        #121 <Field int stackSize>
			pathNames[stackSize] = null;
	//   19   31:aload_0         
	//   20   32:getfield        #123 <Field String[] pathNames>
	//   21   35:aload_0         
	//   22   36:getfield        #121 <Field int stackSize>
	//   23   39:aconst_null     
	//   24   40:aastore         
			int ai[] = pathIndices;
	//   25   41:aload_0         
	//   26   42:getfield        #125 <Field int[] pathIndices>
	//   27   45:astore_3        
			int j = stackSize - 1;
	//   28   46:aload_0         
	//   29   47:getfield        #121 <Field int stackSize>
	//   30   50:iconst_1        
	//   31   51:isub            
	//   32   52:istore_1        
			ai[j] = ai[j] + 1;
	//   33   53:aload_3         
	//   34   54:iload_1         
	//   35   55:aload_3         
	//   36   56:iload_1         
	//   37   57:iaload          
	//   38   58:iconst_1        
	//   39   59:iadd            
	//   40   60:iastore         
			peeked = 0;
	//   41   61:aload_0         
	//   42   62:iconst_0        
	//   43   63:putfield        #117 <Field int peeked>
			return;
	//   44   66:return          
		} else
		{
			throw new IllegalStateException((new StringBuilder()).append("Expected END_OBJECT but was ").append(((Object) (peek()))).append(locationString()).toString());
	//   45   67:new             #283 <Class IllegalStateException>
	//   46   70:dup             
	//   47   71:new             #185 <Class StringBuilder>
	//   48   74:dup             
	//   49   75:invokespecial   #186 <Method void StringBuilder()>
	//   50   78:ldc2            #325 <String "Expected END_OBJECT but was ">
	//   51   81:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   52   84:aload_0         
	//   53   85:invokevirtual   #289 <Method JsonToken peek()>
	//   54   88:invokevirtual   #292 <Method StringBuilder StringBuilder.append(Object)>
	//   55   91:aload_0         
	//   56   92:invokevirtual   #196 <Method String locationString()>
	//   57   95:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   58   98:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   59  101:invokespecial   #293 <Method void IllegalStateException(String)>
	//   60  104:athrow          
		}
	}

	public String getPath()
	{
		StringBuilder stringbuilder = (new StringBuilder()).append('$');
	//    0    0:new             #185 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #186 <Method void StringBuilder()>
	//    3    7:bipush          36
	//    4    9:invokevirtual   #224 <Method StringBuilder StringBuilder.append(char)>
	//    5   12:astore_3        
		int i = 0;
	//    6   13:iconst_0        
	//    7   14:istore_1        
		for(int j = stackSize; i < j; i++)
	//*   8   15:aload_0         
	//*   9   16:getfield        #121 <Field int stackSize>
	//*  10   19:istore_2        
	//*  11   20:iload_1         
	//*  12   21:iload_2         
	//*  13   22:icmpge          137
			switch(stack[i])
	//*  14   25:aload_0         
	//*  15   26:getfield        #119 <Field int[] stack>
	//*  16   29:iload_1         
	//*  17   30:iaload          
			{
			case 6: // '\006'
			case 7: // '\007'
			case 8: // '\b'
			default:
				break;

	//*  18   31:tableswitch     1 8: default 76
	//	               1 79
	//	               2 79
	//	               3 103
	//	               4 103
	//	               5 103
	//	               6 130
	//	               7 130
	//	               8 130
	//*  19   76:goto            130
			case 1: // '\001'
			case 2: // '\002'
				stringbuilder.append('[').append(pathIndices[i]).append(']');
	//   20   79:aload_3         
	//   21   80:bipush          91
	//   22   82:invokevirtual   #224 <Method StringBuilder StringBuilder.append(char)>
	//   23   85:aload_0         
	//   24   86:getfield        #125 <Field int[] pathIndices>
	//   25   89:iload_1         
	//   26   90:iaload          
	//   27   91:invokevirtual   #329 <Method StringBuilder StringBuilder.append(int)>
	//   28   94:bipush          93
	//   29   96:invokevirtual   #224 <Method StringBuilder StringBuilder.append(char)>
	//   30   99:pop             
				break;
	//   31  100:goto            130

			case 3: // '\003'
			case 4: // '\004'
			case 5: // '\005'
				stringbuilder.append('.');
	//   32  103:aload_3         
	//   33  104:bipush          46
	//   34  106:invokevirtual   #224 <Method StringBuilder StringBuilder.append(char)>
	//   35  109:pop             
				if(pathNames[i] != null)
	//*  36  110:aload_0         
	//*  37  111:getfield        #123 <Field String[] pathNames>
	//*  38  114:iload_1         
	//*  39  115:aaload          
	//*  40  116:ifnull          130
					stringbuilder.append(pathNames[i]);
	//   41  119:aload_3         
	//   42  120:aload_0         
	//   43  121:getfield        #123 <Field String[] pathNames>
	//   44  124:iload_1         
	//   45  125:aaload          
	//   46  126:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   47  129:pop             
				break;
			}

	//   48  130:iload_1         
	//   49  131:iconst_1        
	//   50  132:iadd            
	//   51  133:istore_1        
	//*  52  134:goto            20
		return stringbuilder.toString();
	//   53  137:aload_3         
	//   54  138:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   55  141:areturn         
	}

	public boolean hasNext()
		throws IOException
	{
		int j = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #279 <Method int doPeek()>
	//    9   15:istore_1        
		return i != 2 && i != 4;
	//   10   16:iload_1         
	//   11   17:iconst_2        
	//   12   18:icmpeq          28
	//   13   21:iload_1         
	//   14   22:iconst_4        
	//   15   23:icmpeq          28
	//   16   26:iconst_1        
	//   17   27:ireturn         
	//   18   28:iconst_0        
	//   19   29:ireturn         
	}

	public final boolean isLenient()
	{
		return lenient;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field boolean lenient>
	//    2    4:ireturn         
	}

	String locationString()
	{
		int i = lineNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field int lineNumber>
	//    2    4:istore_1        
		int j = pos;
	//    3    5:aload_0         
	//    4    6:getfield        #109 <Field int pos>
	//    5    9:istore_2        
		int k = lineStart;
	//    6   10:aload_0         
	//    7   11:getfield        #115 <Field int lineStart>
	//    8   14:istore_3        
		return (new StringBuilder()).append(" at line ").append(i + 1).append(" column ").append((j - k) + 1).append(" path ").append(getPath()).toString();
	//    9   15:new             #185 <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #186 <Method void StringBuilder()>
	//   12   22:ldc2            #334 <String " at line ">
	//   13   25:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:iload_1         
	//   15   29:iconst_1        
	//   16   30:iadd            
	//   17   31:invokevirtual   #329 <Method StringBuilder StringBuilder.append(int)>
	//   18   34:ldc2            #336 <String " column ">
	//   19   37:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   20   40:iload_2         
	//   21   41:iload_3         
	//   22   42:isub            
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:invokevirtual   #329 <Method StringBuilder StringBuilder.append(int)>
	//   26   48:ldc2            #338 <String " path ">
	//   27   51:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   28   54:aload_0         
	//   29   55:invokevirtual   #340 <Method String getPath()>
	//   30   58:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   31   61:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   32   64:areturn         
	}

	public boolean nextBoolean()
		throws IOException
	{
		int k = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore_2        
		int i = k;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(k == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #279 <Method int doPeek()>
	//    9   15:istore_1        
		if(i == 5)
	//*  10   16:iload_1         
	//*  11   17:iconst_5        
	//*  12   18:icmpne          48
		{
			peeked = 0;
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:putfield        #117 <Field int peeked>
			int ai[] = pathIndices;
	//   16   26:aload_0         
	//   17   27:getfield        #125 <Field int[] pathIndices>
	//   18   30:astore_3        
			i = stackSize - 1;
	//   19   31:aload_0         
	//   20   32:getfield        #121 <Field int stackSize>
	//   21   35:iconst_1        
	//   22   36:isub            
	//   23   37:istore_1        
			ai[i] = ai[i] + 1;
	//   24   38:aload_3         
	//   25   39:iload_1         
	//   26   40:aload_3         
	//   27   41:iload_1         
	//   28   42:iaload          
	//   29   43:iconst_1        
	//   30   44:iadd            
	//   31   45:iastore         
			return true;
	//   32   46:iconst_1        
	//   33   47:ireturn         
		}
		if(i == 6)
	//*  34   48:iload_1         
	//*  35   49:bipush          6
	//*  36   51:icmpne          81
		{
			peeked = 0;
	//   37   54:aload_0         
	//   38   55:iconst_0        
	//   39   56:putfield        #117 <Field int peeked>
			int ai1[] = pathIndices;
	//   40   59:aload_0         
	//   41   60:getfield        #125 <Field int[] pathIndices>
	//   42   63:astore_3        
			int j = stackSize - 1;
	//   43   64:aload_0         
	//   44   65:getfield        #121 <Field int stackSize>
	//   45   68:iconst_1        
	//   46   69:isub            
	//   47   70:istore_1        
			ai1[j] = ai1[j] + 1;
	//   48   71:aload_3         
	//   49   72:iload_1         
	//   50   73:aload_3         
	//   51   74:iload_1         
	//   52   75:iaload          
	//   53   76:iconst_1        
	//   54   77:iadd            
	//   55   78:iastore         
			return false;
	//   56   79:iconst_0        
	//   57   80:ireturn         
		} else
		{
			throw new IllegalStateException((new StringBuilder()).append("Expected a boolean but was ").append(((Object) (peek()))).append(locationString()).toString());
	//   58   81:new             #283 <Class IllegalStateException>
	//   59   84:dup             
	//   60   85:new             #185 <Class StringBuilder>
	//   61   88:dup             
	//   62   89:invokespecial   #186 <Method void StringBuilder()>
	//   63   92:ldc2            #343 <String "Expected a boolean but was ">
	//   64   95:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   65   98:aload_0         
	//   66   99:invokevirtual   #289 <Method JsonToken peek()>
	//   67  102:invokevirtual   #292 <Method StringBuilder StringBuilder.append(Object)>
	//   68  105:aload_0         
	//   69  106:invokevirtual   #196 <Method String locationString()>
	//   70  109:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   71  112:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   72  115:invokespecial   #293 <Method void IllegalStateException(String)>
	//   73  118:athrow          
		}
	}

	public double nextDouble()
		throws IOException
	{
		int k = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore          5
		int i = k;
	//    3    6:iload           5
	//    4    8:istore          4
		if(k == 0)
	//*   5   10:iload           5
	//*   6   12:ifne            21
			i = doPeek();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #279 <Method int doPeek()>
	//    9   19:istore          4
		if(i == 15)
	//*  10   21:iload           4
	//*  11   23:bipush          15
	//*  12   25:icmpne          65
		{
			peeked = 0;
	//   13   28:aload_0         
	//   14   29:iconst_0        
	//   15   30:putfield        #117 <Field int peeked>
			int ai[] = pathIndices;
	//   16   33:aload_0         
	//   17   34:getfield        #125 <Field int[] pathIndices>
	//   18   37:astore          6
			i = stackSize - 1;
	//   19   39:aload_0         
	//   20   40:getfield        #121 <Field int stackSize>
	//   21   43:iconst_1        
	//   22   44:isub            
	//   23   45:istore          4
			ai[i] = ai[i] + 1;
	//   24   47:aload           6
	//   25   49:iload           4
	//   26   51:aload           6
	//   27   53:iload           4
	//   28   55:iaload          
	//   29   56:iconst_1        
	//   30   57:iadd            
	//   31   58:iastore         
			return (double)peekedLong;
	//   32   59:aload_0         
	//   33   60:getfield        #257 <Field long peekedLong>
	//   34   63:l2d             
	//   35   64:dreturn         
		}
		if(i == 16)
	//*  36   65:iload           4
	//*  37   67:bipush          16
	//*  38   69:icmpne          111
		{
			peekedString = new String(buffer, pos, peekedNumberLength);
	//   39   72:aload_0         
	//   40   73:new             #85  <Class String>
	//   41   76:dup             
	//   42   77:aload_0         
	//   43   78:getfield        #107 <Field char[] buffer>
	//   44   81:aload_0         
	//   45   82:getfield        #109 <Field int pos>
	//   46   85:aload_0         
	//   47   86:getfield        #259 <Field int peekedNumberLength>
	//   48   89:invokespecial   #205 <Method void String(char[], int, int)>
	//   49   92:putfield        #347 <Field String peekedString>
			pos = pos + peekedNumberLength;
	//   50   95:aload_0         
	//   51   96:aload_0         
	//   52   97:getfield        #109 <Field int pos>
	//   53  100:aload_0         
	//   54  101:getfield        #259 <Field int peekedNumberLength>
	//   55  104:iadd            
	//   56  105:putfield        #109 <Field int pos>
		} else
	//*  57  108:goto            216
		if(i == 8 || i == 9)
	//*  58  111:iload           4
	//*  59  113:bipush          8
	//*  60  115:icmpeq          125
	//*  61  118:iload           4
	//*  62  120:bipush          9
	//*  63  122:icmpne          153
		{
			char c;
			if(i == 8)
	//*  64  125:iload           4
	//*  65  127:bipush          8
	//*  66  129:icmpne          138
				c = '\'';
	//   67  132:bipush          39
	//   68  134:istore_1        
			else
	//*  69  135:goto            141
				c = '"';
	//   70  138:bipush          34
	//   71  140:istore_1        
			peekedString = nextQuotedValue(c);
	//   72  141:aload_0         
	//   73  142:aload_0         
	//   74  143:iload_1         
	//   75  144:invokespecial   #349 <Method String nextQuotedValue(char)>
	//   76  147:putfield        #347 <Field String peekedString>
		} else
	//*  77  150:goto            216
		if(i == 10)
	//*  78  153:iload           4
	//*  79  155:bipush          10
	//*  80  157:icmpne          171
			peekedString = nextUnquotedValue();
	//   81  160:aload_0         
	//   82  161:aload_0         
	//   83  162:invokespecial   #351 <Method String nextUnquotedValue()>
	//   84  165:putfield        #347 <Field String peekedString>
		else
	//*  85  168:goto            216
		if(i != 11)
	//*  86  171:iload           4
	//*  87  173:bipush          11
	//*  88  175:icmpeq          216
			throw new IllegalStateException((new StringBuilder()).append("Expected a double but was ").append(((Object) (peek()))).append(locationString()).toString());
	//   89  178:new             #283 <Class IllegalStateException>
	//   90  181:dup             
	//   91  182:new             #185 <Class StringBuilder>
	//   92  185:dup             
	//   93  186:invokespecial   #186 <Method void StringBuilder()>
	//   94  189:ldc2            #353 <String "Expected a double but was ">
	//   95  192:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   96  195:aload_0         
	//   97  196:invokevirtual   #289 <Method JsonToken peek()>
	//   98  199:invokevirtual   #292 <Method StringBuilder StringBuilder.append(Object)>
	//   99  202:aload_0         
	//  100  203:invokevirtual   #196 <Method String locationString()>
	//  101  206:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//  102  209:invokevirtual   #199 <Method String StringBuilder.toString()>
	//  103  212:invokespecial   #293 <Method void IllegalStateException(String)>
	//  104  215:athrow          
		peeked = 11;
	//  105  216:aload_0         
	//  106  217:bipush          11
	//  107  219:putfield        #117 <Field int peeked>
		double d = Double.parseDouble(peekedString);
	//  108  222:aload_0         
	//  109  223:getfield        #347 <Field String peekedString>
	//  110  226:invokestatic    #359 <Method double Double.parseDouble(String)>
	//  111  229:dstore_2        
		if(!lenient && (Double.isNaN(d) || Double.isInfinite(d)))
	//* 112  230:aload_0         
	//* 113  231:getfield        #105 <Field boolean lenient>
	//* 114  234:ifne            286
	//* 115  237:dload_2         
	//* 116  238:invokestatic    #363 <Method boolean Double.isNaN(double)>
	//* 117  241:ifne            251
	//* 118  244:dload_2         
	//* 119  245:invokestatic    #366 <Method boolean Double.isInfinite(double)>
	//* 120  248:ifeq            286
		{
			throw new MalformedJsonException((new StringBuilder()).append("JSON forbids NaN and infinities: ").append(d).append(locationString()).toString());
	//  121  251:new             #274 <Class MalformedJsonException>
	//  122  254:dup             
	//  123  255:new             #185 <Class StringBuilder>
	//  124  258:dup             
	//  125  259:invokespecial   #186 <Method void StringBuilder()>
	//  126  262:ldc2            #368 <String "JSON forbids NaN and infinities: ">
	//  127  265:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//  128  268:dload_2         
	//  129  269:invokevirtual   #371 <Method StringBuilder StringBuilder.append(double)>
	//  130  272:aload_0         
	//  131  273:invokevirtual   #196 <Method String locationString()>
	//  132  276:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//  133  279:invokevirtual   #199 <Method String StringBuilder.toString()>
	//  134  282:invokespecial   #275 <Method void MalformedJsonException(String)>
	//  135  285:athrow          
		} else
		{
			peekedString = null;
	//  136  286:aload_0         
	//  137  287:aconst_null     
	//  138  288:putfield        #347 <Field String peekedString>
			peeked = 0;
	//  139  291:aload_0         
	//  140  292:iconst_0        
	//  141  293:putfield        #117 <Field int peeked>
			int ai1[] = pathIndices;
	//  142  296:aload_0         
	//  143  297:getfield        #125 <Field int[] pathIndices>
	//  144  300:astore          6
			int j = stackSize - 1;
	//  145  302:aload_0         
	//  146  303:getfield        #121 <Field int stackSize>
	//  147  306:iconst_1        
	//  148  307:isub            
	//  149  308:istore          4
			ai1[j] = ai1[j] + 1;
	//  150  310:aload           6
	//  151  312:iload           4
	//  152  314:aload           6
	//  153  316:iload           4
	//  154  318:iaload          
	//  155  319:iconst_1        
	//  156  320:iadd            
	//  157  321:iastore         
			return d;
	//  158  322:dload_2         
	//  159  323:dreturn         
		}
	}

	public int nextInt()
		throws IOException
	{
label0:
		{
			int k = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore          5
			int i = k;
	//    3    6:iload           5
	//    4    8:istore          4
			if(k == 0)
	//*   5   10:iload           5
	//*   6   12:ifne            21
				i = doPeek();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #279 <Method int doPeek()>
	//    9   19:istore          4
			if(i == 15)
	//*  10   21:iload           4
	//*  11   23:bipush          15
	//*  12   25:icmpne          118
			{
				i = (int)peekedLong;
	//   13   28:aload_0         
	//   14   29:getfield        #257 <Field long peekedLong>
	//   15   32:l2i             
	//   16   33:istore          4
				if(peekedLong != (long)i)
	//*  17   35:aload_0         
	//*  18   36:getfield        #257 <Field long peekedLong>
	//*  19   39:iload           4
	//*  20   41:i2l             
	//*  21   42:lcmp            
	//*  22   43:ifeq            84
				{
					throw new NumberFormatException((new StringBuilder()).append("Expected an int but was ").append(peekedLong).append(locationString()).toString());
	//   23   46:new             #264 <Class NumberFormatException>
	//   24   49:dup             
	//   25   50:new             #185 <Class StringBuilder>
	//   26   53:dup             
	//   27   54:invokespecial   #186 <Method void StringBuilder()>
	//   28   57:ldc2            #374 <String "Expected an int but was ">
	//   29   60:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   30   63:aload_0         
	//   31   64:getfield        #257 <Field long peekedLong>
	//   32   67:invokevirtual   #377 <Method StringBuilder StringBuilder.append(long)>
	//   33   70:aload_0         
	//   34   71:invokevirtual   #196 <Method String locationString()>
	//   35   74:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   36   77:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   37   80:invokespecial   #267 <Method void NumberFormatException(String)>
	//   38   83:athrow          
				} else
				{
					peeked = 0;
	//   39   84:aload_0         
	//   40   85:iconst_0        
	//   41   86:putfield        #117 <Field int peeked>
					int ai[] = pathIndices;
	//   42   89:aload_0         
	//   43   90:getfield        #125 <Field int[] pathIndices>
	//   44   93:astore          6
					int l = stackSize - 1;
	//   45   95:aload_0         
	//   46   96:getfield        #121 <Field int stackSize>
	//   47   99:iconst_1        
	//   48  100:isub            
	//   49  101:istore          5
					ai[l] = ai[l] + 1;
	//   50  103:aload           6
	//   51  105:iload           5
	//   52  107:aload           6
	//   53  109:iload           5
	//   54  111:iaload          
	//   55  112:iconst_1        
	//   56  113:iadd            
	//   57  114:iastore         
					return i;
	//   58  115:iload           4
	//   59  117:ireturn         
				}
			}
			if(i == 16)
	//*  60  118:iload           4
	//*  61  120:bipush          16
	//*  62  122:icmpne          164
			{
				peekedString = new String(buffer, pos, peekedNumberLength);
	//   63  125:aload_0         
	//   64  126:new             #85  <Class String>
	//   65  129:dup             
	//   66  130:aload_0         
	//   67  131:getfield        #107 <Field char[] buffer>
	//   68  134:aload_0         
	//   69  135:getfield        #109 <Field int pos>
	//   70  138:aload_0         
	//   71  139:getfield        #259 <Field int peekedNumberLength>
	//   72  142:invokespecial   #205 <Method void String(char[], int, int)>
	//   73  145:putfield        #347 <Field String peekedString>
				pos = pos + peekedNumberLength;
	//   74  148:aload_0         
	//   75  149:aload_0         
	//   76  150:getfield        #109 <Field int pos>
	//   77  153:aload_0         
	//   78  154:getfield        #259 <Field int peekedNumberLength>
	//   79  157:iadd            
	//   80  158:putfield        #109 <Field int pos>
				break label0;
	//   81  161:goto            314
			}
			if(i == 8 || i == 9 || i == 10)
	//*  82  164:iload           4
	//*  83  166:bipush          8
	//*  84  168:icmpeq          185
	//*  85  171:iload           4
	//*  86  173:bipush          9
	//*  87  175:icmpeq          185
	//*  88  178:iload           4
	//*  89  180:bipush          10
	//*  90  182:icmpne          276
			{
				if(i == 10)
	//*  91  185:iload           4
	//*  92  187:bipush          10
	//*  93  189:icmpne          203
				{
					peekedString = nextUnquotedValue();
	//   94  192:aload_0         
	//   95  193:aload_0         
	//   96  194:invokespecial   #351 <Method String nextUnquotedValue()>
	//   97  197:putfield        #347 <Field String peekedString>
				} else
	//*  98  200:goto            228
				{
					char c;
					if(i == 8)
	//*  99  203:iload           4
	//* 100  205:bipush          8
	//* 101  207:icmpne          216
						c = '\'';
	//  102  210:bipush          39
	//  103  212:istore_1        
					else
	//* 104  213:goto            219
						c = '"';
	//  105  216:bipush          34
	//  106  218:istore_1        
					peekedString = nextQuotedValue(c);
	//  107  219:aload_0         
	//  108  220:aload_0         
	//  109  221:iload_1         
	//  110  222:invokespecial   #349 <Method String nextQuotedValue(char)>
	//  111  225:putfield        #347 <Field String peekedString>
				}
				int i1;
				int ai1[];
				try
				{
					i = Integer.parseInt(peekedString);
	//  112  228:aload_0         
	//  113  229:getfield        #347 <Field String peekedString>
	//  114  232:invokestatic    #383 <Method int Integer.parseInt(String)>
	//  115  235:istore          4
					peeked = 0;
	//  116  237:aload_0         
	//  117  238:iconst_0        
	//  118  239:putfield        #117 <Field int peeked>
					ai1 = pathIndices;
	//  119  242:aload_0         
	//  120  243:getfield        #125 <Field int[] pathIndices>
	//  121  246:astore          6
					i1 = stackSize - 1;
	//  122  248:aload_0         
	//  123  249:getfield        #121 <Field int stackSize>
	//  124  252:iconst_1        
	//  125  253:isub            
	//  126  254:istore          5
				}
	//* 127  256:aload           6
	//* 128  258:iload           5
	//* 129  260:aload           6
	//* 130  262:iload           5
	//* 131  264:iaload          
	//* 132  265:iconst_1        
	//* 133  266:iadd            
	//* 134  267:iastore         
	//* 135  268:iload           4
	//* 136  270:ireturn         
				catch(NumberFormatException numberformatexception)
	//* 137  271:astore          6
				{
					break label0;
	//  138  273:goto            314
				}
				ai1[i1] = ai1[i1] + 1;
				return i;
			} else
			{
				throw new IllegalStateException((new StringBuilder()).append("Expected an int but was ").append(((Object) (peek()))).append(locationString()).toString());
	//  139  276:new             #283 <Class IllegalStateException>
	//  140  279:dup             
	//  141  280:new             #185 <Class StringBuilder>
	//  142  283:dup             
	//  143  284:invokespecial   #186 <Method void StringBuilder()>
	//  144  287:ldc2            #374 <String "Expected an int but was ">
	//  145  290:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//  146  293:aload_0         
	//  147  294:invokevirtual   #289 <Method JsonToken peek()>
	//  148  297:invokevirtual   #292 <Method StringBuilder StringBuilder.append(Object)>
	//  149  300:aload_0         
	//  150  301:invokevirtual   #196 <Method String locationString()>
	//  151  304:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//  152  307:invokevirtual   #199 <Method String StringBuilder.toString()>
	//  153  310:invokespecial   #293 <Method void IllegalStateException(String)>
	//  154  313:athrow          
			}
		}
		peeked = 11;
	//  155  314:aload_0         
	//  156  315:bipush          11
	//  157  317:putfield        #117 <Field int peeked>
		double d = Double.parseDouble(peekedString);
	//  158  320:aload_0         
	//  159  321:getfield        #347 <Field String peekedString>
	//  160  324:invokestatic    #359 <Method double Double.parseDouble(String)>
	//  161  327:dstore_2        
		int j = (int)d;
	//  162  328:dload_2         
	//  163  329:d2i             
	//  164  330:istore          4
		if((double)j != d)
	//* 165  332:iload           4
	//* 166  334:i2d             
	//* 167  335:dload_2         
	//* 168  336:dcmpl           
	//* 169  337:ifeq            378
		{
			throw new NumberFormatException((new StringBuilder()).append("Expected an int but was ").append(peekedString).append(locationString()).toString());
	//  170  340:new             #264 <Class NumberFormatException>
	//  171  343:dup             
	//  172  344:new             #185 <Class StringBuilder>
	//  173  347:dup             
	//  174  348:invokespecial   #186 <Method void StringBuilder()>
	//  175  351:ldc2            #374 <String "Expected an int but was ">
	//  176  354:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//  177  357:aload_0         
	//  178  358:getfield        #347 <Field String peekedString>
	//  179  361:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//  180  364:aload_0         
	//  181  365:invokevirtual   #196 <Method String locationString()>
	//  182  368:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//  183  371:invokevirtual   #199 <Method String StringBuilder.toString()>
	//  184  374:invokespecial   #267 <Method void NumberFormatException(String)>
	//  185  377:athrow          
		} else
		{
			peekedString = null;
	//  186  378:aload_0         
	//  187  379:aconst_null     
	//  188  380:putfield        #347 <Field String peekedString>
			peeked = 0;
	//  189  383:aload_0         
	//  190  384:iconst_0        
	//  191  385:putfield        #117 <Field int peeked>
			int ai2[] = pathIndices;
	//  192  388:aload_0         
	//  193  389:getfield        #125 <Field int[] pathIndices>
	//  194  392:astore          6
			int j1 = stackSize - 1;
	//  195  394:aload_0         
	//  196  395:getfield        #121 <Field int stackSize>
	//  197  398:iconst_1        
	//  198  399:isub            
	//  199  400:istore          5
			ai2[j1] = ai2[j1] + 1;
	//  200  402:aload           6
	//  201  404:iload           5
	//  202  406:aload           6
	//  203  408:iload           5
	//  204  410:iaload          
	//  205  411:iconst_1        
	//  206  412:iadd            
	//  207  413:iastore         
			return j;
	//  208  414:iload           4
	//  209  416:ireturn         
		}
	}

	public long nextLong()
		throws IOException
	{
label0:
		{
			int k = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore          5
			int i = k;
	//    3    6:iload           5
	//    4    8:istore          4
			if(k == 0)
	//*   5   10:iload           5
	//*   6   12:ifne            21
				i = doPeek();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #279 <Method int doPeek()>
	//    9   19:istore          4
			if(i == 15)
	//*  10   21:iload           4
	//*  11   23:bipush          15
	//*  12   25:icmpne          64
			{
				peeked = 0;
	//   13   28:aload_0         
	//   14   29:iconst_0        
	//   15   30:putfield        #117 <Field int peeked>
				int ai[] = pathIndices;
	//   16   33:aload_0         
	//   17   34:getfield        #125 <Field int[] pathIndices>
	//   18   37:astore          8
				i = stackSize - 1;
	//   19   39:aload_0         
	//   20   40:getfield        #121 <Field int stackSize>
	//   21   43:iconst_1        
	//   22   44:isub            
	//   23   45:istore          4
				ai[i] = ai[i] + 1;
	//   24   47:aload           8
	//   25   49:iload           4
	//   26   51:aload           8
	//   27   53:iload           4
	//   28   55:iaload          
	//   29   56:iconst_1        
	//   30   57:iadd            
	//   31   58:iastore         
				return peekedLong;
	//   32   59:aload_0         
	//   33   60:getfield        #257 <Field long peekedLong>
	//   34   63:lreturn         
			}
			if(i == 16)
	//*  35   64:iload           4
	//*  36   66:bipush          16
	//*  37   68:icmpne          110
			{
				peekedString = new String(buffer, pos, peekedNumberLength);
	//   38   71:aload_0         
	//   39   72:new             #85  <Class String>
	//   40   75:dup             
	//   41   76:aload_0         
	//   42   77:getfield        #107 <Field char[] buffer>
	//   43   80:aload_0         
	//   44   81:getfield        #109 <Field int pos>
	//   45   84:aload_0         
	//   46   85:getfield        #259 <Field int peekedNumberLength>
	//   47   88:invokespecial   #205 <Method void String(char[], int, int)>
	//   48   91:putfield        #347 <Field String peekedString>
				pos = pos + peekedNumberLength;
	//   49   94:aload_0         
	//   50   95:aload_0         
	//   51   96:getfield        #109 <Field int pos>
	//   52   99:aload_0         
	//   53  100:getfield        #259 <Field int peekedNumberLength>
	//   54  103:iadd            
	//   55  104:putfield        #109 <Field int pos>
				break label0;
	//   56  107:goto            260
			}
			if(i == 8 || i == 9 || i == 10)
	//*  57  110:iload           4
	//*  58  112:bipush          8
	//*  59  114:icmpeq          131
	//*  60  117:iload           4
	//*  61  119:bipush          9
	//*  62  121:icmpeq          131
	//*  63  124:iload           4
	//*  64  126:bipush          10
	//*  65  128:icmpne          222
			{
				if(i == 10)
	//*  66  131:iload           4
	//*  67  133:bipush          10
	//*  68  135:icmpne          149
				{
					peekedString = nextUnquotedValue();
	//   69  138:aload_0         
	//   70  139:aload_0         
	//   71  140:invokespecial   #351 <Method String nextUnquotedValue()>
	//   72  143:putfield        #347 <Field String peekedString>
				} else
	//*  73  146:goto            174
				{
					char c;
					if(i == 8)
	//*  74  149:iload           4
	//*  75  151:bipush          8
	//*  76  153:icmpne          162
						c = '\'';
	//   77  156:bipush          39
	//   78  158:istore_1        
					else
	//*  79  159:goto            165
						c = '"';
	//   80  162:bipush          34
	//   81  164:istore_1        
					peekedString = nextQuotedValue(c);
	//   82  165:aload_0         
	//   83  166:aload_0         
	//   84  167:iload_1         
	//   85  168:invokespecial   #349 <Method String nextQuotedValue(char)>
	//   86  171:putfield        #347 <Field String peekedString>
				}
				long l;
				int ai1[];
				try
				{
					l = Long.parseLong(peekedString);
	//   87  174:aload_0         
	//   88  175:getfield        #347 <Field String peekedString>
	//   89  178:invokestatic    #391 <Method long Long.parseLong(String)>
	//   90  181:lstore          6
					peeked = 0;
	//   91  183:aload_0         
	//   92  184:iconst_0        
	//   93  185:putfield        #117 <Field int peeked>
					ai1 = pathIndices;
	//   94  188:aload_0         
	//   95  189:getfield        #125 <Field int[] pathIndices>
	//   96  192:astore          8
					i = stackSize - 1;
	//   97  194:aload_0         
	//   98  195:getfield        #121 <Field int stackSize>
	//   99  198:iconst_1        
	//  100  199:isub            
	//  101  200:istore          4
				}
	//* 102  202:aload           8
	//* 103  204:iload           4
	//* 104  206:aload           8
	//* 105  208:iload           4
	//* 106  210:iaload          
	//* 107  211:iconst_1        
	//* 108  212:iadd            
	//* 109  213:iastore         
	//* 110  214:lload           6
	//* 111  216:lreturn         
				catch(NumberFormatException numberformatexception)
	//* 112  217:astore          8
				{
					break label0;
	//  113  219:goto            260
				}
				ai1[i] = ai1[i] + 1;
				return l;
			} else
			{
				throw new IllegalStateException((new StringBuilder()).append("Expected a long but was ").append(((Object) (peek()))).append(locationString()).toString());
	//  114  222:new             #283 <Class IllegalStateException>
	//  115  225:dup             
	//  116  226:new             #185 <Class StringBuilder>
	//  117  229:dup             
	//  118  230:invokespecial   #186 <Method void StringBuilder()>
	//  119  233:ldc2            #393 <String "Expected a long but was ">
	//  120  236:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//  121  239:aload_0         
	//  122  240:invokevirtual   #289 <Method JsonToken peek()>
	//  123  243:invokevirtual   #292 <Method StringBuilder StringBuilder.append(Object)>
	//  124  246:aload_0         
	//  125  247:invokevirtual   #196 <Method String locationString()>
	//  126  250:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//  127  253:invokevirtual   #199 <Method String StringBuilder.toString()>
	//  128  256:invokespecial   #293 <Method void IllegalStateException(String)>
	//  129  259:athrow          
			}
		}
		peeked = 11;
	//  130  260:aload_0         
	//  131  261:bipush          11
	//  132  263:putfield        #117 <Field int peeked>
		double d = Double.parseDouble(peekedString);
	//  133  266:aload_0         
	//  134  267:getfield        #347 <Field String peekedString>
	//  135  270:invokestatic    #359 <Method double Double.parseDouble(String)>
	//  136  273:dstore_2        
		long l1 = (long)d;
	//  137  274:dload_2         
	//  138  275:d2l             
	//  139  276:lstore          6
		if((double)l1 != d)
	//* 140  278:lload           6
	//* 141  280:l2d             
	//* 142  281:dload_2         
	//* 143  282:dcmpl           
	//* 144  283:ifeq            324
		{
			throw new NumberFormatException((new StringBuilder()).append("Expected a long but was ").append(peekedString).append(locationString()).toString());
	//  145  286:new             #264 <Class NumberFormatException>
	//  146  289:dup             
	//  147  290:new             #185 <Class StringBuilder>
	//  148  293:dup             
	//  149  294:invokespecial   #186 <Method void StringBuilder()>
	//  150  297:ldc2            #393 <String "Expected a long but was ">
	//  151  300:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//  152  303:aload_0         
	//  153  304:getfield        #347 <Field String peekedString>
	//  154  307:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//  155  310:aload_0         
	//  156  311:invokevirtual   #196 <Method String locationString()>
	//  157  314:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//  158  317:invokevirtual   #199 <Method String StringBuilder.toString()>
	//  159  320:invokespecial   #267 <Method void NumberFormatException(String)>
	//  160  323:athrow          
		} else
		{
			peekedString = null;
	//  161  324:aload_0         
	//  162  325:aconst_null     
	//  163  326:putfield        #347 <Field String peekedString>
			peeked = 0;
	//  164  329:aload_0         
	//  165  330:iconst_0        
	//  166  331:putfield        #117 <Field int peeked>
			int ai2[] = pathIndices;
	//  167  334:aload_0         
	//  168  335:getfield        #125 <Field int[] pathIndices>
	//  169  338:astore          8
			int j = stackSize - 1;
	//  170  340:aload_0         
	//  171  341:getfield        #121 <Field int stackSize>
	//  172  344:iconst_1        
	//  173  345:isub            
	//  174  346:istore          4
			ai2[j] = ai2[j] + 1;
	//  175  348:aload           8
	//  176  350:iload           4
	//  177  352:aload           8
	//  178  354:iload           4
	//  179  356:iaload          
	//  180  357:iconst_1        
	//  181  358:iadd            
	//  182  359:iastore         
			return l1;
	//  183  360:lload           6
	//  184  362:lreturn         
		}
	}

	public String nextName()
		throws IOException
	{
		int j = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #279 <Method int doPeek()>
	//    9   15:istore_1        
		String s;
		if(i == 14)
	//*  10   16:iload_1         
	//*  11   17:bipush          14
	//*  12   19:icmpne          30
			s = nextUnquotedValue();
	//   13   22:aload_0         
	//   14   23:invokespecial   #351 <Method String nextUnquotedValue()>
	//   15   26:astore_3        
		else
	//*  16   27:goto            100
		if(i == 12)
	//*  17   30:iload_1         
	//*  18   31:bipush          12
	//*  19   33:icmpne          46
			s = nextQuotedValue('\'');
	//   20   36:aload_0         
	//   21   37:bipush          39
	//   22   39:invokespecial   #349 <Method String nextQuotedValue(char)>
	//   23   42:astore_3        
		else
	//*  24   43:goto            100
		if(i == 13)
	//*  25   46:iload_1         
	//*  26   47:bipush          13
	//*  27   49:icmpne          62
			s = nextQuotedValue('"');
	//   28   52:aload_0         
	//   29   53:bipush          34
	//   30   55:invokespecial   #349 <Method String nextQuotedValue(char)>
	//   31   58:astore_3        
		else
	//*  32   59:goto            100
			throw new IllegalStateException((new StringBuilder()).append("Expected a name but was ").append(((Object) (peek()))).append(locationString()).toString());
	//   33   62:new             #283 <Class IllegalStateException>
	//   34   65:dup             
	//   35   66:new             #185 <Class StringBuilder>
	//   36   69:dup             
	//   37   70:invokespecial   #186 <Method void StringBuilder()>
	//   38   73:ldc2            #396 <String "Expected a name but was ">
	//   39   76:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   40   79:aload_0         
	//   41   80:invokevirtual   #289 <Method JsonToken peek()>
	//   42   83:invokevirtual   #292 <Method StringBuilder StringBuilder.append(Object)>
	//   43   86:aload_0         
	//   44   87:invokevirtual   #196 <Method String locationString()>
	//   45   90:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   46   93:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   47   96:invokespecial   #293 <Method void IllegalStateException(String)>
	//   48   99:athrow          
		peeked = 0;
	//   49  100:aload_0         
	//   50  101:iconst_0        
	//   51  102:putfield        #117 <Field int peeked>
		pathNames[stackSize - 1] = s;
	//   52  105:aload_0         
	//   53  106:getfield        #123 <Field String[] pathNames>
	//   54  109:aload_0         
	//   55  110:getfield        #121 <Field int stackSize>
	//   56  113:iconst_1        
	//   57  114:isub            
	//   58  115:aload_3         
	//   59  116:aastore         
		return s;
	//   60  117:aload_3         
	//   61  118:areturn         
	}

	public void nextNull()
		throws IOException
	{
		int k = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore_2        
		int i = k;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(k == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #279 <Method int doPeek()>
	//    9   15:istore_1        
		if(i == 7)
	//*  10   16:iload_1         
	//*  11   17:bipush          7
	//*  12   19:icmpne          48
		{
			peeked = 0;
	//   13   22:aload_0         
	//   14   23:iconst_0        
	//   15   24:putfield        #117 <Field int peeked>
			int ai[] = pathIndices;
	//   16   27:aload_0         
	//   17   28:getfield        #125 <Field int[] pathIndices>
	//   18   31:astore_3        
			int j = stackSize - 1;
	//   19   32:aload_0         
	//   20   33:getfield        #121 <Field int stackSize>
	//   21   36:iconst_1        
	//   22   37:isub            
	//   23   38:istore_1        
			ai[j] = ai[j] + 1;
	//   24   39:aload_3         
	//   25   40:iload_1         
	//   26   41:aload_3         
	//   27   42:iload_1         
	//   28   43:iaload          
	//   29   44:iconst_1        
	//   30   45:iadd            
	//   31   46:iastore         
			return;
	//   32   47:return          
		} else
		{
			throw new IllegalStateException((new StringBuilder()).append("Expected null but was ").append(((Object) (peek()))).append(locationString()).toString());
	//   33   48:new             #283 <Class IllegalStateException>
	//   34   51:dup             
	//   35   52:new             #185 <Class StringBuilder>
	//   36   55:dup             
	//   37   56:invokespecial   #186 <Method void StringBuilder()>
	//   38   59:ldc2            #399 <String "Expected null but was ">
	//   39   62:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   40   65:aload_0         
	//   41   66:invokevirtual   #289 <Method JsonToken peek()>
	//   42   69:invokevirtual   #292 <Method StringBuilder StringBuilder.append(Object)>
	//   43   72:aload_0         
	//   44   73:invokevirtual   #196 <Method String locationString()>
	//   45   76:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   46   79:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   47   82:invokespecial   #293 <Method void IllegalStateException(String)>
	//   48   85:athrow          
		}
	}

	public String nextString()
		throws IOException
	{
		int j = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #279 <Method int doPeek()>
	//    9   15:istore_1        
		String s;
		if(i == 10)
	//*  10   16:iload_1         
	//*  11   17:bipush          10
	//*  12   19:icmpne          30
			s = nextUnquotedValue();
	//   13   22:aload_0         
	//   14   23:invokespecial   #351 <Method String nextUnquotedValue()>
	//   15   26:astore_3        
		else
	//*  16   27:goto            178
		if(i == 8)
	//*  17   30:iload_1         
	//*  18   31:bipush          8
	//*  19   33:icmpne          46
			s = nextQuotedValue('\'');
	//   20   36:aload_0         
	//   21   37:bipush          39
	//   22   39:invokespecial   #349 <Method String nextQuotedValue(char)>
	//   23   42:astore_3        
		else
	//*  24   43:goto            178
		if(i == 9)
	//*  25   46:iload_1         
	//*  26   47:bipush          9
	//*  27   49:icmpne          62
			s = nextQuotedValue('"');
	//   28   52:aload_0         
	//   29   53:bipush          34
	//   30   55:invokespecial   #349 <Method String nextQuotedValue(char)>
	//   31   58:astore_3        
		else
	//*  32   59:goto            178
		if(i == 11)
	//*  33   62:iload_1         
	//*  34   63:bipush          11
	//*  35   65:icmpne          81
		{
			s = peekedString;
	//   36   68:aload_0         
	//   37   69:getfield        #347 <Field String peekedString>
	//   38   72:astore_3        
			peekedString = null;
	//   39   73:aload_0         
	//   40   74:aconst_null     
	//   41   75:putfield        #347 <Field String peekedString>
		} else
	//*  42   78:goto            178
		if(i == 15)
	//*  43   81:iload_1         
	//*  44   82:bipush          15
	//*  45   84:icmpne          98
			s = Long.toString(peekedLong);
	//   46   87:aload_0         
	//   47   88:getfield        #257 <Field long peekedLong>
	//   48   91:invokestatic    #403 <Method String Long.toString(long)>
	//   49   94:astore_3        
		else
	//*  50   95:goto            178
		if(i == 16)
	//*  51   98:iload_1         
	//*  52   99:bipush          16
	//*  53  101:icmpne          140
		{
			s = new String(buffer, pos, peekedNumberLength);
	//   54  104:new             #85  <Class String>
	//   55  107:dup             
	//   56  108:aload_0         
	//   57  109:getfield        #107 <Field char[] buffer>
	//   58  112:aload_0         
	//   59  113:getfield        #109 <Field int pos>
	//   60  116:aload_0         
	//   61  117:getfield        #259 <Field int peekedNumberLength>
	//   62  120:invokespecial   #205 <Method void String(char[], int, int)>
	//   63  123:astore_3        
			pos = pos + peekedNumberLength;
	//   64  124:aload_0         
	//   65  125:aload_0         
	//   66  126:getfield        #109 <Field int pos>
	//   67  129:aload_0         
	//   68  130:getfield        #259 <Field int peekedNumberLength>
	//   69  133:iadd            
	//   70  134:putfield        #109 <Field int pos>
		} else
	//*  71  137:goto            178
		{
			throw new IllegalStateException((new StringBuilder()).append("Expected a string but was ").append(((Object) (peek()))).append(locationString()).toString());
	//   72  140:new             #283 <Class IllegalStateException>
	//   73  143:dup             
	//   74  144:new             #185 <Class StringBuilder>
	//   75  147:dup             
	//   76  148:invokespecial   #186 <Method void StringBuilder()>
	//   77  151:ldc2            #405 <String "Expected a string but was ">
	//   78  154:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   79  157:aload_0         
	//   80  158:invokevirtual   #289 <Method JsonToken peek()>
	//   81  161:invokevirtual   #292 <Method StringBuilder StringBuilder.append(Object)>
	//   82  164:aload_0         
	//   83  165:invokevirtual   #196 <Method String locationString()>
	//   84  168:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   85  171:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   86  174:invokespecial   #293 <Method void IllegalStateException(String)>
	//   87  177:athrow          
		}
		peeked = 0;
	//   88  178:aload_0         
	//   89  179:iconst_0        
	//   90  180:putfield        #117 <Field int peeked>
		int ai[] = pathIndices;
	//   91  183:aload_0         
	//   92  184:getfield        #125 <Field int[] pathIndices>
	//   93  187:astore          4
		i = stackSize - 1;
	//   94  189:aload_0         
	//   95  190:getfield        #121 <Field int stackSize>
	//   96  193:iconst_1        
	//   97  194:isub            
	//   98  195:istore_1        
		ai[i] = ai[i] + 1;
	//   99  196:aload           4
	//  100  198:iload_1         
	//  101  199:aload           4
	//  102  201:iload_1         
	//  103  202:iaload          
	//  104  203:iconst_1        
	//  105  204:iadd            
	//  106  205:iastore         
		return s;
	//  107  206:aload_3         
	//  108  207:areturn         
	}

	public JsonToken peek()
		throws IOException
	{
		int j = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #279 <Method int doPeek()>
	//    9   15:istore_1        
		switch(i)
	//*  10   16:iload_1         
		{
	//*  11   17:tableswitch     1 17: default 100
	//	               1 103
	//	               2 107
	//	               3 111
	//	               4 115
	//	               5 123
	//	               6 123
	//	               7 127
	//	               8 131
	//	               9 131
	//	               10 131
	//	               11 131
	//	               12 119
	//	               13 119
	//	               14 119
	//	               15 135
	//	               16 135
	//	               17 139
	//*  12  100:goto            143
		case 1: // '\001'
			return JsonToken.BEGIN_OBJECT;
	//   13  103:getstatic       #411 <Field JsonToken JsonToken.BEGIN_OBJECT>
	//   14  106:areturn         

		case 2: // '\002'
			return JsonToken.END_OBJECT;
	//   15  107:getstatic       #414 <Field JsonToken JsonToken.END_OBJECT>
	//   16  110:areturn         

		case 3: // '\003'
			return JsonToken.BEGIN_ARRAY;
	//   17  111:getstatic       #417 <Field JsonToken JsonToken.BEGIN_ARRAY>
	//   18  114:areturn         

		case 4: // '\004'
			return JsonToken.END_ARRAY;
	//   19  115:getstatic       #420 <Field JsonToken JsonToken.END_ARRAY>
	//   20  118:areturn         

		case 12: // '\f'
		case 13: // '\r'
		case 14: // '\016'
			return JsonToken.NAME;
	//   21  119:getstatic       #423 <Field JsonToken JsonToken.NAME>
	//   22  122:areturn         

		case 5: // '\005'
		case 6: // '\006'
			return JsonToken.BOOLEAN;
	//   23  123:getstatic       #426 <Field JsonToken JsonToken.BOOLEAN>
	//   24  126:areturn         

		case 7: // '\007'
			return JsonToken.NULL;
	//   25  127:getstatic       #428 <Field JsonToken JsonToken.NULL>
	//   26  130:areturn         

		case 8: // '\b'
		case 9: // '\t'
		case 10: // '\n'
		case 11: // '\013'
			return JsonToken.STRING;
	//   27  131:getstatic       #431 <Field JsonToken JsonToken.STRING>
	//   28  134:areturn         

		case 15: // '\017'
		case 16: // '\020'
			return JsonToken.NUMBER;
	//   29  135:getstatic       #434 <Field JsonToken JsonToken.NUMBER>
	//   30  138:areturn         

		case 17: // '\021'
			return JsonToken.END_DOCUMENT;
	//   31  139:getstatic       #437 <Field JsonToken JsonToken.END_DOCUMENT>
	//   32  142:areturn         
		}
		throw new AssertionError();
	//   33  143:new             #439 <Class AssertionError>
	//   34  146:dup             
	//   35  147:invokespecial   #440 <Method void AssertionError()>
	//   36  150:athrow          
	}

	public final void setLenient(boolean flag)
	{
		lenient = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #105 <Field boolean lenient>
	//    3    5:return          
	}

	public void skipValue()
		throws IOException
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i;
		do
		{
			i = peeked;
	//    2    2:aload_0         
	//    3    3:getfield        #117 <Field int peeked>
	//    4    6:istore_1        
			int k = i;
	//    5    7:iload_1         
	//    6    8:istore_3        
			if(i == 0)
	//*   7    9:iload_1         
	//*   8   10:ifne            18
				k = doPeek();
	//    9   13:aload_0         
	//   10   14:invokevirtual   #279 <Method int doPeek()>
	//   11   17:istore_3        
			if(k == 3)
	//*  12   18:iload_3         
	//*  13   19:iconst_3        
	//*  14   20:icmpne          35
			{
				push(1);
	//   15   23:aload_0         
	//   16   24:iconst_1        
	//   17   25:invokespecial   #281 <Method void push(int)>
				i = j + 1;
	//   18   28:iload_2         
	//   19   29:iconst_1        
	//   20   30:iadd            
	//   21   31:istore_1        
			} else
	//*  22   32:goto            186
			if(k == 1)
	//*  23   35:iload_3         
	//*  24   36:iconst_1        
	//*  25   37:icmpne          52
			{
				push(3);
	//   26   40:aload_0         
	//   27   41:iconst_3        
	//   28   42:invokespecial   #281 <Method void push(int)>
				i = j + 1;
	//   29   45:iload_2         
	//   30   46:iconst_1        
	//   31   47:iadd            
	//   32   48:istore_1        
			} else
	//*  33   49:goto            186
			if(k == 4)
	//*  34   52:iload_3         
	//*  35   53:iconst_4        
	//*  36   54:icmpne          74
			{
				stackSize = stackSize - 1;
	//   37   57:aload_0         
	//   38   58:aload_0         
	//   39   59:getfield        #121 <Field int stackSize>
	//   40   62:iconst_1        
	//   41   63:isub            
	//   42   64:putfield        #121 <Field int stackSize>
				i = j - 1;
	//   43   67:iload_2         
	//   44   68:iconst_1        
	//   45   69:isub            
	//   46   70:istore_1        
			} else
	//*  47   71:goto            186
			if(k == 2)
	//*  48   74:iload_3         
	//*  49   75:iconst_2        
	//*  50   76:icmpne          96
			{
				stackSize = stackSize - 1;
	//   51   79:aload_0         
	//   52   80:aload_0         
	//   53   81:getfield        #121 <Field int stackSize>
	//   54   84:iconst_1        
	//   55   85:isub            
	//   56   86:putfield        #121 <Field int stackSize>
				i = j - 1;
	//   57   89:iload_2         
	//   58   90:iconst_1        
	//   59   91:isub            
	//   60   92:istore_1        
			} else
	//*  61   93:goto            186
			if(k == 14 || k == 10)
	//*  62   96:iload_3         
	//*  63   97:bipush          14
	//*  64   99:icmpeq          108
	//*  65  102:iload_3         
	//*  66  103:bipush          10
	//*  67  105:icmpne          117
			{
				skipUnquotedValue();
	//   68  108:aload_0         
	//   69  109:invokespecial   #445 <Method void skipUnquotedValue()>
				i = j;
	//   70  112:iload_2         
	//   71  113:istore_1        
			} else
	//*  72  114:goto            186
			if(k == 8 || k == 12)
	//*  73  117:iload_3         
	//*  74  118:bipush          8
	//*  75  120:icmpeq          129
	//*  76  123:iload_3         
	//*  77  124:bipush          12
	//*  78  126:icmpne          140
			{
				skipQuotedValue('\'');
	//   79  129:aload_0         
	//   80  130:bipush          39
	//   81  132:invokespecial   #447 <Method void skipQuotedValue(char)>
				i = j;
	//   82  135:iload_2         
	//   83  136:istore_1        
			} else
	//*  84  137:goto            186
			if(k == 9 || k == 13)
	//*  85  140:iload_3         
	//*  86  141:bipush          9
	//*  87  143:icmpeq          152
	//*  88  146:iload_3         
	//*  89  147:bipush          13
	//*  90  149:icmpne          163
			{
				skipQuotedValue('"');
	//   91  152:aload_0         
	//   92  153:bipush          34
	//   93  155:invokespecial   #447 <Method void skipQuotedValue(char)>
				i = j;
	//   94  158:iload_2         
	//   95  159:istore_1        
			} else
	//*  96  160:goto            186
			{
				i = j;
	//   97  163:iload_2         
	//   98  164:istore_1        
				if(k == 16)
	//*  99  165:iload_3         
	//* 100  166:bipush          16
	//* 101  168:icmpne          186
				{
					pos = pos + peekedNumberLength;
	//  102  171:aload_0         
	//  103  172:aload_0         
	//  104  173:getfield        #109 <Field int pos>
	//  105  176:aload_0         
	//  106  177:getfield        #259 <Field int peekedNumberLength>
	//  107  180:iadd            
	//  108  181:putfield        #109 <Field int pos>
					i = j;
	//  109  184:iload_2         
	//  110  185:istore_1        
				}
			}
			peeked = 0;
	//  111  186:aload_0         
	//  112  187:iconst_0        
	//  113  188:putfield        #117 <Field int peeked>
			j = i;
	//  114  191:iload_1         
	//  115  192:istore_2        
		} while(i != 0);
	//  116  193:iload_1         
	//  117  194:ifne            2
		int ai[] = pathIndices;
	//  118  197:aload_0         
	//  119  198:getfield        #125 <Field int[] pathIndices>
	//  120  201:astore          4
		i = stackSize - 1;
	//  121  203:aload_0         
	//  122  204:getfield        #121 <Field int stackSize>
	//  123  207:iconst_1        
	//  124  208:isub            
	//  125  209:istore_1        
		ai[i] = ai[i] + 1;
	//  126  210:aload           4
	//  127  212:iload_1         
	//  128  213:aload           4
	//  129  215:iload_1         
	//  130  216:iaload          
	//  131  217:iconst_1        
	//  132  218:iadd            
	//  133  219:iastore         
		pathNames[stackSize - 1] = "null";
	//  134  220:aload_0         
	//  135  221:getfield        #123 <Field String[] pathNames>
	//  136  224:aload_0         
	//  137  225:getfield        #121 <Field int stackSize>
	//  138  228:iconst_1        
	//  139  229:isub            
	//  140  230:ldc1            #239 <String "null">
	//  141  232:aastore         
	//  142  233:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append(((Object)this).getClass().getSimpleName()).append(locationString()).toString();
	//    0    0:new             #185 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #186 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #451 <Method Class Object.getClass()>
	//    5   11:invokevirtual   #456 <Method String Class.getSimpleName()>
	//    6   14:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:aload_0         
	//    8   18:invokevirtual   #196 <Method String locationString()>
	//    9   21:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	private static final long MIN_INCOMPLETE_INTEGER = 0x33333334L;
	private static final char NON_EXECUTE_PREFIX[] = ")]}'\n".toCharArray();
	private static final int NUMBER_CHAR_DECIMAL = 3;
	private static final int NUMBER_CHAR_DIGIT = 2;
	private static final int NUMBER_CHAR_EXP_DIGIT = 7;
	private static final int NUMBER_CHAR_EXP_E = 5;
	private static final int NUMBER_CHAR_EXP_SIGN = 6;
	private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
	private static final int NUMBER_CHAR_NONE = 0;
	private static final int NUMBER_CHAR_SIGN = 1;
	private static final int PEEKED_BEGIN_ARRAY = 3;
	private static final int PEEKED_BEGIN_OBJECT = 1;
	private static final int PEEKED_BUFFERED = 11;
	private static final int PEEKED_DOUBLE_QUOTED = 9;
	private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
	private static final int PEEKED_END_ARRAY = 4;
	private static final int PEEKED_END_OBJECT = 2;
	private static final int PEEKED_EOF = 17;
	private static final int PEEKED_FALSE = 6;
	private static final int PEEKED_LONG = 15;
	private static final int PEEKED_NONE = 0;
	private static final int PEEKED_NULL = 7;
	private static final int PEEKED_NUMBER = 16;
	private static final int PEEKED_SINGLE_QUOTED = 8;
	private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
	private static final int PEEKED_TRUE = 5;
	private static final int PEEKED_UNQUOTED = 10;
	private static final int PEEKED_UNQUOTED_NAME = 14;
	private final char buffer[] = new char[1024];
	private final Reader in;
	private boolean lenient;
	private int limit;
	private int lineNumber;
	private int lineStart;
	private int pathIndices[];
	private String pathNames[];
	int peeked;
	private long peekedLong;
	private int peekedNumberLength;
	private String peekedString;
	private int pos;
	private int stack[];
	private int stackSize;

	static 
	{
	//    0    0:ldc1            #83  <String ")]}'\n">
	//    1    2:invokevirtual   #89  <Method char[] String.toCharArray()>
	//    2    5:putstatic       #91  <Field char[] NON_EXECUTE_PREFIX>
		JsonReaderInternalAccess.INSTANCE = ((JsonReaderInternalAccess) (new JsonReaderInternalAccess() {

			public void promoteNameToValue(JsonReader jsonreader)
				throws IOException
			{
				if(jsonreader instanceof JsonTreeReader)
			//*   0    0:aload_1         
			//*   1    1:instanceof      #17  <Class JsonTreeReader>
			//*   2    4:ifeq            15
				{
					((JsonTreeReader)jsonreader).promoteNameToValue();
			//    3    7:aload_1         
			//    4    8:checkcast       #17  <Class JsonTreeReader>
			//    5   11:invokevirtual   #19  <Method void JsonTreeReader.promoteNameToValue()>
					return;
			//    6   14:return          
				}
				int j = jsonreader.peeked;
			//    7   15:aload_1         
			//    8   16:getfield        #23  <Field int JsonReader.peeked>
			//    9   19:istore_3        
				int i = j;
			//   10   20:iload_3         
			//   11   21:istore_2        
				if(j == 0)
			//*  12   22:iload_3         
			//*  13   23:ifne            31
					i = jsonreader.doPeek();
			//   14   26:aload_1         
			//   15   27:invokevirtual   #27  <Method int JsonReader.doPeek()>
			//   16   30:istore_2        
				if(i == 13)
			//*  17   31:iload_2         
			//*  18   32:bipush          13
			//*  19   34:icmpne          44
				{
					jsonreader.peeked = 9;
			//   20   37:aload_1         
			//   21   38:bipush          9
			//   22   40:putfield        #23  <Field int JsonReader.peeked>
					return;
			//   23   43:return          
				}
				if(i == 12)
			//*  24   44:iload_2         
			//*  25   45:bipush          12
			//*  26   47:icmpne          57
				{
					jsonreader.peeked = 8;
			//   27   50:aload_1         
			//   28   51:bipush          8
			//   29   53:putfield        #23  <Field int JsonReader.peeked>
					return;
			//   30   56:return          
				}
				if(i == 14)
			//*  31   57:iload_2         
			//*  32   58:bipush          14
			//*  33   60:icmpne          70
				{
					jsonreader.peeked = 10;
			//   34   63:aload_1         
			//   35   64:bipush          10
			//   36   66:putfield        #23  <Field int JsonReader.peeked>
					return;
			//   37   69:return          
				} else
				{
					throw new IllegalStateException((new StringBuilder()).append("Expected a name but was ").append(((Object) (jsonreader.peek()))).append(jsonreader.locationString()).toString());
			//   38   70:new             #29  <Class IllegalStateException>
			//   39   73:dup             
			//   40   74:new             #31  <Class StringBuilder>
			//   41   77:dup             
			//   42   78:invokespecial   #32  <Method void StringBuilder()>
			//   43   81:ldc1            #34  <String "Expected a name but was ">
			//   44   83:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
			//   45   86:aload_1         
			//   46   87:invokevirtual   #42  <Method JsonToken JsonReader.peek()>
			//   47   90:invokevirtual   #45  <Method StringBuilder StringBuilder.append(Object)>
			//   48   93:aload_1         
			//   49   94:invokevirtual   #49  <Method String JsonReader.locationString()>
			//   50   97:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
			//   51  100:invokevirtual   #52  <Method String StringBuilder.toString()>
			//   52  103:invokespecial   #55  <Method void IllegalStateException(String)>
			//   53  106:athrow          
				}
			}

		}
));
	//    3    8:new             #8   <Class JsonReader$1>
	//    4   11:dup             
	//    5   12:invokespecial   #94  <Method void JsonReader$1()>
	//    6   15:putstatic       #100 <Field JsonReaderInternalAccess JsonReaderInternalAccess.INSTANCE>
	//*   7   18:return          
	}
}
