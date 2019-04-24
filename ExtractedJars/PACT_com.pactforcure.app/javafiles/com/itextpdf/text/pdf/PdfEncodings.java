// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.ExceptionConverter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.*;
import java.util.HashMap;

// Referenced classes of package com.itextpdf.text.pdf:
//			IntHashtable, ExtraEncoding

public class PdfEncodings
{
	private static class Cp437Conversion
		implements ExtraEncoding
	{

		public String byteToChar(byte abyte0[], String s)
		{
			int i1 = abyte0.length;
		//    0    0:aload_1         
		//    1    1:arraylength     
		//    2    2:istore          7
			s = ((String) (new char[i1]));
		//    3    4:iload           7
		//    4    6:newarray        char[]
		//    5    8:astore_2        
			int j = 0;
		//    6    9:iconst_0        
		//    7   10:istore          5
			int i = 0;
		//    8   12:iconst_0        
		//    9   13:istore          4
			while(j < i1) 
		//*  10   15:iload           5
		//*  11   17:iload           7
		//*  12   19:icmpge          105
			{
				int j1 = abyte0[j] & 0xff;
		//   13   22:aload_1         
		//   14   23:iload           5
		//   15   25:baload          
		//   16   26:sipush          255
		//   17   29:iand            
		//   18   30:istore          8
				if(j1 >= 32)
		//*  19   32:iload           8
		//*  20   34:bipush          32
		//*  21   36:icmpge          48
		//*  22   39:iload           5
		//*  23   41:iconst_1        
		//*  24   42:iadd            
		//*  25   43:istore          5
		//*  26   45:goto            15
					if(j1 < 128)
		//*  27   48:iload           8
		//*  28   50:sipush          128
		//*  29   53:icmpge          76
					{
						int k = i + 1;
		//   30   56:iload           4
		//   31   58:iconst_1        
		//   32   59:iadd            
		//   33   60:istore          6
						s[i] = (char)j1;
		//   34   62:aload_2         
		//   35   63:iload           4
		//   36   65:iload           8
		//   37   67:int2char        
		//   38   68:castore         
						i = k;
		//   39   69:iload           6
		//   40   71:istore          4
					} else
		//*  41   73:goto            39
					{
						char c = table[j1 - 128];
		//   42   76:getstatic       #152 <Field char[] table>
		//   43   79:iload           8
		//   44   81:sipush          128
		//   45   84:isub            
		//   46   85:caload          
		//   47   86:istore_3        
						int l = i + 1;
		//   48   87:iload           4
		//   49   89:iconst_1        
		//   50   90:iadd            
		//   51   91:istore          6
						s[i] = c;
		//   52   93:aload_2         
		//   53   94:iload           4
		//   54   96:iload_3         
		//   55   97:castore         
						i = l;
		//   56   98:iload           6
		//   57  100:istore          4
					}
				j++;
			}
		//*  58  102:goto            39
			return new String(((char []) (s)), 0, i);
		//   59  105:new             #164 <Class String>
		//   60  108:dup             
		//   61  109:aload_2         
		//   62  110:iconst_0        
		//   63  111:iload           4
		//   64  113:invokespecial   #167 <Method void String(char[], int, int)>
		//   65  116:areturn         
		}

		public byte[] charToByte(char c, String s)
		{
			if(c < '\200')
		//*   0    0:iload_1         
		//*   1    1:sipush          128
		//*   2    4:icmpge          16
				return (new byte[] {
					(byte)c
				});
		//    3    7:iconst_1        
		//    4    8:newarray        byte[]
		//    5   10:dup             
		//    6   11:iconst_0        
		//    7   12:iload_1         
		//    8   13:int2byte        
		//    9   14:bastore         
		//   10   15:areturn         
			byte byte0 = (byte)c2b.get(((int) (c)));
		//   11   16:getstatic       #22  <Field IntHashtable c2b>
		//   12   19:iload_1         
		//   13   20:invokevirtual   #173 <Method int IntHashtable.get(int)>
		//   14   23:int2byte        
		//   15   24:istore_3        
			if(byte0 != 0)
		//*  16   25:iload_3         
		//*  17   26:ifeq            37
				return (new byte[] {
					byte0
				});
		//   18   29:iconst_1        
		//   19   30:newarray        byte[]
		//   20   32:dup             
		//   21   33:iconst_0        
		//   22   34:iload_3         
		//   23   35:bastore         
		//   24   36:areturn         
			else
				return new byte[0];
		//   25   37:iconst_0        
		//   26   38:newarray        byte[]
		//   27   40:areturn         
		}

		public byte[] charToByte(String s, String s1)
		{
			s1 = ((String) (s.toCharArray()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #178 <Method char[] String.toCharArray()>
		//    2    4:astore_2        
			s = ((String) (new byte[s1.length]));
		//    3    5:aload_2         
		//    4    6:arraylength     
		//    5    7:newarray        byte[]
		//    6    9:astore_1        
			int i1 = s1.length;
		//    7   10:aload_2         
		//    8   11:arraylength     
		//    9   12:istore          7
			int j = 0;
		//   10   14:iconst_0        
		//   11   15:istore          5
			int i = 0;
		//   12   17:iconst_0        
		//   13   18:istore          4
			while(j < i1) 
		//*  14   20:iload           5
		//*  15   22:iload           7
		//*  16   24:icmpge          99
			{
				char c = s1[j];
		//   17   27:aload_2         
		//   18   28:iload           5
		//   19   30:caload          
		//   20   31:istore          8
				if(c < '\200')
		//*  21   33:iload           8
		//*  22   35:sipush          128
		//*  23   38:icmpge          67
				{
					int k = i + 1;
		//   24   41:iload           4
		//   25   43:iconst_1        
		//   26   44:iadd            
		//   27   45:istore          6
					s[i] = (byte)c;
		//   28   47:aload_1         
		//   29   48:iload           4
		//   30   50:iload           8
		//   31   52:int2byte        
		//   32   53:bastore         
					i = k;
		//   33   54:iload           6
		//   34   56:istore          4
				} else
		//*  35   58:iload           5
		//*  36   60:iconst_1        
		//*  37   61:iadd            
		//*  38   62:istore          5
		//*  39   64:goto            20
				{
					byte byte0 = (byte)c2b.get(((int) (c)));
		//   40   67:getstatic       #22  <Field IntHashtable c2b>
		//   41   70:iload           8
		//   42   72:invokevirtual   #173 <Method int IntHashtable.get(int)>
		//   43   75:int2byte        
		//   44   76:istore_3        
					if(byte0 != 0)
		//*  45   77:iload_3         
		//*  46   78:ifeq            124
					{
						int l = i + 1;
		//   47   81:iload           4
		//   48   83:iconst_1        
		//   49   84:iadd            
		//   50   85:istore          6
						s[i] = byte0;
		//   51   87:aload_1         
		//   52   88:iload           4
		//   53   90:iload_3         
		//   54   91:bastore         
						i = l;
		//   55   92:iload           6
		//   56   94:istore          4
					}
				}
				j++;
			}
		//*  57   96:goto            58
			if(i == i1)
		//*  58   99:iload           4
		//*  59  101:iload           7
		//*  60  103:icmpne          108
			{
				return ((byte []) (s));
		//   61  106:aload_1         
		//   62  107:areturn         
			} else
			{
				s1 = ((String) (new byte[i]));
		//   63  108:iload           4
		//   64  110:newarray        byte[]
		//   65  112:astore_2        
				System.arraycopy(((Object) (s)), 0, ((Object) (s1)), 0, i);
		//   66  113:aload_1         
		//   67  114:iconst_0        
		//   68  115:aload_2         
		//   69  116:iconst_0        
		//   70  117:iload           4
		//   71  119:invokestatic    #184 <Method void System.arraycopy(Object, int, Object, int, int)>
				return ((byte []) (s1));
		//   72  122:aload_2         
		//   73  123:areturn         
			}
		//*  74  124:goto            58
		}

		private static IntHashtable c2b;
		private static final char table[] = {
			'\307', '\374', '\351', '\342', '\344', '\340', '\345', '\347', '\352', '\353', 
			'\350', '\357', '\356', '\354', '\304', '\305', '\311', '\346', '\306', '\364', 
			'\366', '\362', '\373', '\371', '\377', '\326', '\334', '\242', '\243', '\245', 
			'\u20A7', '\u0192', '\341', '\355', '\363', '\372', '\361', '\321', '\252', '\272', 
			'\277', '\u2310', '\254', '\275', '\274', '\241', '\253', '\273', '\u2591', '\u2592', 
			'\u2593', '\u2502', '\u2524', '\u2561', '\u2562', '\u2556', '\u2555', '\u2563', '\u2551', '\u2557', 
			'\u255D', '\u255C', '\u255B', '\u2510', '\u2514', '\u2534', '\u252C', '\u251C', '\u2500', '\u253C', 
			'\u255E', '\u255F', '\u255A', '\u2554', '\u2569', '\u2566', '\u2560', '\u2550', '\u256C', '\u2567', 
			'\u2568', '\u2564', '\u2565', '\u2559', '\u2558', '\u2552', '\u2553', '\u256B', '\u256A', '\u2518', 
			'\u250C', '\u2588', '\u2584', '\u258C', '\u2590', '\u2580', '\u03B1', '\337', '\u0393', '\u03C0', 
			'\u03A3', '\u03C3', '\265', '\u03C4', '\u03A6', '\u0398', '\u03A9', '\u03B4', '\u221E', '\u03C6', 
			'\u03B5', '\u2229', '\u2261', '\261', '\u2265', '\u2264', '\u2320', '\u2321', '\367', '\u2248', 
			'\260', '\u2219', '\267', '\u221A', '\u207F', '\262', '\u25A0', '\240'
		};

		static 
		{
			c2b = new IntHashtable();
		//    0    0:new             #17  <Class IntHashtable>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void IntHashtable()>
		//    3    7:putstatic       #22  <Field IntHashtable c2b>
		//    4   10:sipush          128
		//    5   13:newarray        char[]
		//    6   15:dup             
		//    7   16:iconst_0        
		//    8   17:ldc1            #23  <Int 199>
		//    9   19:castore         
		//   10   20:dup             
		//   11   21:iconst_1        
		//   12   22:ldc1            #24  <Int 252>
		//   13   24:castore         
		//   14   25:dup             
		//   15   26:iconst_2        
		//   16   27:ldc1            #25  <Int 233>
		//   17   29:castore         
		//   18   30:dup             
		//   19   31:iconst_3        
		//   20   32:ldc1            #26  <Int 226>
		//   21   34:castore         
		//   22   35:dup             
		//   23   36:iconst_4        
		//   24   37:ldc1            #27  <Int 228>
		//   25   39:castore         
		//   26   40:dup             
		//   27   41:iconst_5        
		//   28   42:ldc1            #28  <Int 224>
		//   29   44:castore         
		//   30   45:dup             
		//   31   46:bipush          6
		//   32   48:ldc1            #29  <Int 229>
		//   33   50:castore         
		//   34   51:dup             
		//   35   52:bipush          7
		//   36   54:ldc1            #30  <Int 231>
		//   37   56:castore         
		//   38   57:dup             
		//   39   58:bipush          8
		//   40   60:ldc1            #31  <Int 234>
		//   41   62:castore         
		//   42   63:dup             
		//   43   64:bipush          9
		//   44   66:ldc1            #32  <Int 235>
		//   45   68:castore         
		//   46   69:dup             
		//   47   70:bipush          10
		//   48   72:ldc1            #33  <Int 232>
		//   49   74:castore         
		//   50   75:dup             
		//   51   76:bipush          11
		//   52   78:ldc1            #34  <Int 239>
		//   53   80:castore         
		//   54   81:dup             
		//   55   82:bipush          12
		//   56   84:ldc1            #35  <Int 238>
		//   57   86:castore         
		//   58   87:dup             
		//   59   88:bipush          13
		//   60   90:ldc1            #36  <Int 236>
		//   61   92:castore         
		//   62   93:dup             
		//   63   94:bipush          14
		//   64   96:ldc1            #37  <Int 196>
		//   65   98:castore         
		//   66   99:dup             
		//   67  100:bipush          15
		//   68  102:ldc1            #38  <Int 197>
		//   69  104:castore         
		//   70  105:dup             
		//   71  106:bipush          16
		//   72  108:ldc1            #39  <Int 201>
		//   73  110:castore         
		//   74  111:dup             
		//   75  112:bipush          17
		//   76  114:ldc1            #40  <Int 230>
		//   77  116:castore         
		//   78  117:dup             
		//   79  118:bipush          18
		//   80  120:ldc1            #41  <Int 198>
		//   81  122:castore         
		//   82  123:dup             
		//   83  124:bipush          19
		//   84  126:ldc1            #42  <Int 244>
		//   85  128:castore         
		//   86  129:dup             
		//   87  130:bipush          20
		//   88  132:ldc1            #43  <Int 246>
		//   89  134:castore         
		//   90  135:dup             
		//   91  136:bipush          21
		//   92  138:ldc1            #44  <Int 242>
		//   93  140:castore         
		//   94  141:dup             
		//   95  142:bipush          22
		//   96  144:ldc1            #45  <Int 251>
		//   97  146:castore         
		//   98  147:dup             
		//   99  148:bipush          23
		//  100  150:ldc1            #46  <Int 249>
		//  101  152:castore         
		//  102  153:dup             
		//  103  154:bipush          24
		//  104  156:ldc1            #47  <Int 255>
		//  105  158:castore         
		//  106  159:dup             
		//  107  160:bipush          25
		//  108  162:ldc1            #48  <Int 214>
		//  109  164:castore         
		//  110  165:dup             
		//  111  166:bipush          26
		//  112  168:ldc1            #49  <Int 220>
		//  113  170:castore         
		//  114  171:dup             
		//  115  172:bipush          27
		//  116  174:ldc1            #50  <Int 162>
		//  117  176:castore         
		//  118  177:dup             
		//  119  178:bipush          28
		//  120  180:ldc1            #51  <Int 163>
		//  121  182:castore         
		//  122  183:dup             
		//  123  184:bipush          29
		//  124  186:ldc1            #52  <Int 165>
		//  125  188:castore         
		//  126  189:dup             
		//  127  190:bipush          30
		//  128  192:ldc1            #53  <Int 8359>
		//  129  194:castore         
		//  130  195:dup             
		//  131  196:bipush          31
		//  132  198:ldc1            #54  <Int 402>
		//  133  200:castore         
		//  134  201:dup             
		//  135  202:bipush          32
		//  136  204:ldc1            #55  <Int 225>
		//  137  206:castore         
		//  138  207:dup             
		//  139  208:bipush          33
		//  140  210:ldc1            #56  <Int 237>
		//  141  212:castore         
		//  142  213:dup             
		//  143  214:bipush          34
		//  144  216:ldc1            #57  <Int 243>
		//  145  218:castore         
		//  146  219:dup             
		//  147  220:bipush          35
		//  148  222:ldc1            #58  <Int 250>
		//  149  224:castore         
		//  150  225:dup             
		//  151  226:bipush          36
		//  152  228:ldc1            #59  <Int 241>
		//  153  230:castore         
		//  154  231:dup             
		//  155  232:bipush          37
		//  156  234:ldc1            #60  <Int 209>
		//  157  236:castore         
		//  158  237:dup             
		//  159  238:bipush          38
		//  160  240:ldc1            #61  <Int 170>
		//  161  242:castore         
		//  162  243:dup             
		//  163  244:bipush          39
		//  164  246:ldc1            #62  <Int 186>
		//  165  248:castore         
		//  166  249:dup             
		//  167  250:bipush          40
		//  168  252:ldc1            #63  <Int 191>
		//  169  254:castore         
		//  170  255:dup             
		//  171  256:bipush          41
		//  172  258:ldc1            #64  <Int 8976>
		//  173  260:castore         
		//  174  261:dup             
		//  175  262:bipush          42
		//  176  264:ldc1            #65  <Int 172>
		//  177  266:castore         
		//  178  267:dup             
		//  179  268:bipush          43
		//  180  270:ldc1            #66  <Int 189>
		//  181  272:castore         
		//  182  273:dup             
		//  183  274:bipush          44
		//  184  276:ldc1            #67  <Int 188>
		//  185  278:castore         
		//  186  279:dup             
		//  187  280:bipush          45
		//  188  282:ldc1            #68  <Int 161>
		//  189  284:castore         
		//  190  285:dup             
		//  191  286:bipush          46
		//  192  288:ldc1            #69  <Int 171>
		//  193  290:castore         
		//  194  291:dup             
		//  195  292:bipush          47
		//  196  294:ldc1            #70  <Int 187>
		//  197  296:castore         
		//  198  297:dup             
		//  199  298:bipush          48
		//  200  300:ldc1            #71  <Int 9617>
		//  201  302:castore         
		//  202  303:dup             
		//  203  304:bipush          49
		//  204  306:ldc1            #72  <Int 9618>
		//  205  308:castore         
		//  206  309:dup             
		//  207  310:bipush          50
		//  208  312:ldc1            #73  <Int 9619>
		//  209  314:castore         
		//  210  315:dup             
		//  211  316:bipush          51
		//  212  318:ldc1            #74  <Int 9474>
		//  213  320:castore         
		//  214  321:dup             
		//  215  322:bipush          52
		//  216  324:ldc1            #75  <Int 9508>
		//  217  326:castore         
		//  218  327:dup             
		//  219  328:bipush          53
		//  220  330:ldc1            #76  <Int 9569>
		//  221  332:castore         
		//  222  333:dup             
		//  223  334:bipush          54
		//  224  336:ldc1            #77  <Int 9570>
		//  225  338:castore         
		//  226  339:dup             
		//  227  340:bipush          55
		//  228  342:ldc1            #78  <Int 9558>
		//  229  344:castore         
		//  230  345:dup             
		//  231  346:bipush          56
		//  232  348:ldc1            #79  <Int 9557>
		//  233  350:castore         
		//  234  351:dup             
		//  235  352:bipush          57
		//  236  354:ldc1            #80  <Int 9571>
		//  237  356:castore         
		//  238  357:dup             
		//  239  358:bipush          58
		//  240  360:ldc1            #81  <Int 9553>
		//  241  362:castore         
		//  242  363:dup             
		//  243  364:bipush          59
		//  244  366:ldc1            #82  <Int 9559>
		//  245  368:castore         
		//  246  369:dup             
		//  247  370:bipush          60
		//  248  372:ldc1            #83  <Int 9565>
		//  249  374:castore         
		//  250  375:dup             
		//  251  376:bipush          61
		//  252  378:ldc1            #84  <Int 9564>
		//  253  380:castore         
		//  254  381:dup             
		//  255  382:bipush          62
		//  256  384:ldc1            #85  <Int 9563>
		//  257  386:castore         
		//  258  387:dup             
		//  259  388:bipush          63
		//  260  390:ldc1            #86  <Int 9488>
		//  261  392:castore         
		//  262  393:dup             
		//  263  394:bipush          64
		//  264  396:ldc1            #87  <Int 9492>
		//  265  398:castore         
		//  266  399:dup             
		//  267  400:bipush          65
		//  268  402:ldc1            #88  <Int 9524>
		//  269  404:castore         
		//  270  405:dup             
		//  271  406:bipush          66
		//  272  408:ldc1            #89  <Int 9516>
		//  273  410:castore         
		//  274  411:dup             
		//  275  412:bipush          67
		//  276  414:ldc1            #90  <Int 9500>
		//  277  416:castore         
		//  278  417:dup             
		//  279  418:bipush          68
		//  280  420:ldc1            #91  <Int 9472>
		//  281  422:castore         
		//  282  423:dup             
		//  283  424:bipush          69
		//  284  426:ldc1            #92  <Int 9532>
		//  285  428:castore         
		//  286  429:dup             
		//  287  430:bipush          70
		//  288  432:ldc1            #93  <Int 9566>
		//  289  434:castore         
		//  290  435:dup             
		//  291  436:bipush          71
		//  292  438:ldc1            #94  <Int 9567>
		//  293  440:castore         
		//  294  441:dup             
		//  295  442:bipush          72
		//  296  444:ldc1            #95  <Int 9562>
		//  297  446:castore         
		//  298  447:dup             
		//  299  448:bipush          73
		//  300  450:ldc1            #96  <Int 9556>
		//  301  452:castore         
		//  302  453:dup             
		//  303  454:bipush          74
		//  304  456:ldc1            #97  <Int 9577>
		//  305  458:castore         
		//  306  459:dup             
		//  307  460:bipush          75
		//  308  462:ldc1            #98  <Int 9574>
		//  309  464:castore         
		//  310  465:dup             
		//  311  466:bipush          76
		//  312  468:ldc1            #99  <Int 9568>
		//  313  470:castore         
		//  314  471:dup             
		//  315  472:bipush          77
		//  316  474:ldc1            #100 <Int 9552>
		//  317  476:castore         
		//  318  477:dup             
		//  319  478:bipush          78
		//  320  480:ldc1            #101 <Int 9580>
		//  321  482:castore         
		//  322  483:dup             
		//  323  484:bipush          79
		//  324  486:ldc1            #102 <Int 9575>
		//  325  488:castore         
		//  326  489:dup             
		//  327  490:bipush          80
		//  328  492:ldc1            #103 <Int 9576>
		//  329  494:castore         
		//  330  495:dup             
		//  331  496:bipush          81
		//  332  498:ldc1            #104 <Int 9572>
		//  333  500:castore         
		//  334  501:dup             
		//  335  502:bipush          82
		//  336  504:ldc1            #105 <Int 9573>
		//  337  506:castore         
		//  338  507:dup             
		//  339  508:bipush          83
		//  340  510:ldc1            #106 <Int 9561>
		//  341  512:castore         
		//  342  513:dup             
		//  343  514:bipush          84
		//  344  516:ldc1            #107 <Int 9560>
		//  345  518:castore         
		//  346  519:dup             
		//  347  520:bipush          85
		//  348  522:ldc1            #108 <Int 9554>
		//  349  524:castore         
		//  350  525:dup             
		//  351  526:bipush          86
		//  352  528:ldc1            #109 <Int 9555>
		//  353  530:castore         
		//  354  531:dup             
		//  355  532:bipush          87
		//  356  534:ldc1            #110 <Int 9579>
		//  357  536:castore         
		//  358  537:dup             
		//  359  538:bipush          88
		//  360  540:ldc1            #111 <Int 9578>
		//  361  542:castore         
		//  362  543:dup             
		//  363  544:bipush          89
		//  364  546:ldc1            #112 <Int 9496>
		//  365  548:castore         
		//  366  549:dup             
		//  367  550:bipush          90
		//  368  552:ldc1            #113 <Int 9484>
		//  369  554:castore         
		//  370  555:dup             
		//  371  556:bipush          91
		//  372  558:ldc1            #114 <Int 9608>
		//  373  560:castore         
		//  374  561:dup             
		//  375  562:bipush          92
		//  376  564:ldc1            #115 <Int 9604>
		//  377  566:castore         
		//  378  567:dup             
		//  379  568:bipush          93
		//  380  570:ldc1            #116 <Int 9612>
		//  381  572:castore         
		//  382  573:dup             
		//  383  574:bipush          94
		//  384  576:ldc1            #117 <Int 9616>
		//  385  578:castore         
		//  386  579:dup             
		//  387  580:bipush          95
		//  388  582:ldc1            #118 <Int 9600>
		//  389  584:castore         
		//  390  585:dup             
		//  391  586:bipush          96
		//  392  588:ldc1            #119 <Int 945>
		//  393  590:castore         
		//  394  591:dup             
		//  395  592:bipush          97
		//  396  594:ldc1            #120 <Int 223>
		//  397  596:castore         
		//  398  597:dup             
		//  399  598:bipush          98
		//  400  600:ldc1            #121 <Int 915>
		//  401  602:castore         
		//  402  603:dup             
		//  403  604:bipush          99
		//  404  606:ldc1            #122 <Int 960>
		//  405  608:castore         
		//  406  609:dup             
		//  407  610:bipush          100
		//  408  612:ldc1            #123 <Int 931>
		//  409  614:castore         
		//  410  615:dup             
		//  411  616:bipush          101
		//  412  618:ldc1            #124 <Int 963>
		//  413  620:castore         
		//  414  621:dup             
		//  415  622:bipush          102
		//  416  624:ldc1            #125 <Int 181>
		//  417  626:castore         
		//  418  627:dup             
		//  419  628:bipush          103
		//  420  630:ldc1            #126 <Int 964>
		//  421  632:castore         
		//  422  633:dup             
		//  423  634:bipush          104
		//  424  636:ldc1            #127 <Int 934>
		//  425  638:castore         
		//  426  639:dup             
		//  427  640:bipush          105
		//  428  642:ldc1            #128 <Int 920>
		//  429  644:castore         
		//  430  645:dup             
		//  431  646:bipush          106
		//  432  648:ldc1            #129 <Int 937>
		//  433  650:castore         
		//  434  651:dup             
		//  435  652:bipush          107
		//  436  654:ldc1            #130 <Int 948>
		//  437  656:castore         
		//  438  657:dup             
		//  439  658:bipush          108
		//  440  660:ldc1            #131 <Int 8734>
		//  441  662:castore         
		//  442  663:dup             
		//  443  664:bipush          109
		//  444  666:ldc1            #132 <Int 966>
		//  445  668:castore         
		//  446  669:dup             
		//  447  670:bipush          110
		//  448  672:ldc1            #133 <Int 949>
		//  449  674:castore         
		//  450  675:dup             
		//  451  676:bipush          111
		//  452  678:ldc1            #134 <Int 8745>
		//  453  680:castore         
		//  454  681:dup             
		//  455  682:bipush          112
		//  456  684:ldc1            #135 <Int 8801>
		//  457  686:castore         
		//  458  687:dup             
		//  459  688:bipush          113
		//  460  690:ldc1            #136 <Int 177>
		//  461  692:castore         
		//  462  693:dup             
		//  463  694:bipush          114
		//  464  696:ldc1            #137 <Int 8805>
		//  465  698:castore         
		//  466  699:dup             
		//  467  700:bipush          115
		//  468  702:ldc1            #138 <Int 8804>
		//  469  704:castore         
		//  470  705:dup             
		//  471  706:bipush          116
		//  472  708:ldc1            #139 <Int 8992>
		//  473  710:castore         
		//  474  711:dup             
		//  475  712:bipush          117
		//  476  714:ldc1            #140 <Int 8993>
		//  477  716:castore         
		//  478  717:dup             
		//  479  718:bipush          118
		//  480  720:ldc1            #141 <Int 247>
		//  481  722:castore         
		//  482  723:dup             
		//  483  724:bipush          119
		//  484  726:ldc1            #142 <Int 8776>
		//  485  728:castore         
		//  486  729:dup             
		//  487  730:bipush          120
		//  488  732:ldc1            #143 <Int 176>
		//  489  734:castore         
		//  490  735:dup             
		//  491  736:bipush          121
		//  492  738:ldc1            #144 <Int 8729>
		//  493  740:castore         
		//  494  741:dup             
		//  495  742:bipush          122
		//  496  744:ldc1            #145 <Int 183>
		//  497  746:castore         
		//  498  747:dup             
		//  499  748:bipush          123
		//  500  750:ldc1            #146 <Int 8730>
		//  501  752:castore         
		//  502  753:dup             
		//  503  754:bipush          124
		//  504  756:ldc1            #147 <Int 8319>
		//  505  758:castore         
		//  506  759:dup             
		//  507  760:bipush          125
		//  508  762:ldc1            #148 <Int 178>
		//  509  764:castore         
		//  510  765:dup             
		//  511  766:bipush          126
		//  512  768:ldc1            #149 <Int 9632>
		//  513  770:castore         
		//  514  771:dup             
		//  515  772:bipush          127
		//  516  774:ldc1            #150 <Int 160>
		//  517  776:castore         
		//  518  777:putstatic       #152 <Field char[] table>
			for(int i = 0; i < table.length; i++)
		//* 519  780:iconst_0        
		//* 520  781:istore_0        
		//* 521  782:iload_0         
		//* 522  783:getstatic       #152 <Field char[] table>
		//* 523  786:arraylength     
		//* 524  787:icmpge          814
				c2b.put(((int) (table[i])), i + 128);
		//  525  790:getstatic       #22  <Field IntHashtable c2b>
		//  526  793:getstatic       #152 <Field char[] table>
		//  527  796:iload_0         
		//  528  797:caload          
		//  529  798:iload_0         
		//  530  799:sipush          128
		//  531  802:iadd            
		//  532  803:invokevirtual   #156 <Method int IntHashtable.put(int, int)>
		//  533  806:pop             

		//  534  807:iload_0         
		//  535  808:iconst_1        
		//  536  809:iadd            
		//  537  810:istore_0        
		//* 538  811:goto            782
		//* 539  814:return          
		}

		private Cp437Conversion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #158 <Method void Object()>
		//    2    4:return          
		}

	}

	private static class SymbolConversion
		implements ExtraEncoding
	{

		public String byteToChar(byte abyte0[], String s)
		{
			int k = abyte0.length;
		//    0    0:aload_1         
		//    1    1:arraylength     
		//    2    2:istore          5
			s = ((String) (new char[k]));
		//    3    4:iload           5
		//    4    6:newarray        char[]
		//    5    8:astore_2        
			int j = 0;
		//    6    9:iconst_0        
		//    7   10:istore          4
			int i;
			for(i = 0; j < k; i++)
		//*   8   12:iconst_0        
		//*   9   13:istore_3        
		//*  10   14:iload           4
		//*  11   16:iload           5
		//*  12   18:icmpge          54
			{
				byte byte0 = abyte0[j];
		//   13   21:aload_1         
		//   14   22:iload           4
		//   15   24:baload          
		//   16   25:istore          6
				s[i] = byteToChar[byte0 & 0xff];
		//   17   27:aload_2         
		//   18   28:iload_3         
		//   19   29:aload_0         
		//   20   30:getfield        #411 <Field char[] byteToChar>
		//   21   33:iload           6
		//   22   35:sipush          255
		//   23   38:iand            
		//   24   39:caload          
		//   25   40:castore         
				j++;
		//   26   41:iload           4
		//   27   43:iconst_1        
		//   28   44:iadd            
		//   29   45:istore          4
			}

		//   30   47:iload_3         
		//   31   48:iconst_1        
		//   32   49:iadd            
		//   33   50:istore_3        
		//*  34   51:goto            14
			return new String(((char []) (s)), 0, i);
		//   35   54:new             #414 <Class String>
		//   36   57:dup             
		//   37   58:aload_2         
		//   38   59:iconst_0        
		//   39   60:iload_3         
		//   40   61:invokespecial   #417 <Method void String(char[], int, int)>
		//   41   64:areturn         
		}

		public byte[] charToByte(char c, String s)
		{
			byte byte0 = (byte)translation.get(((int) (c)));
		//    0    0:aload_0         
		//    1    1:getfield        #409 <Field IntHashtable translation>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #423 <Method int IntHashtable.get(int)>
		//    4    8:int2byte        
		//    5    9:istore_3        
			if(byte0 != 0)
		//*   6   10:iload_3         
		//*   7   11:ifeq            22
				return (new byte[] {
					byte0
				});
		//    8   14:iconst_1        
		//    9   15:newarray        byte[]
		//   10   17:dup             
		//   11   18:iconst_0        
		//   12   19:iload_3         
		//   13   20:bastore         
		//   14   21:areturn         
			else
				return new byte[0];
		//   15   22:iconst_0        
		//   16   23:newarray        byte[]
		//   17   25:areturn         
		}

		public byte[] charToByte(String s, String s1)
		{
			s1 = ((String) (s.toCharArray()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #428 <Method char[] String.toCharArray()>
		//    2    4:astore_2        
			s = ((String) (new byte[s1.length]));
		//    3    5:aload_2         
		//    4    6:arraylength     
		//    5    7:newarray        byte[]
		//    6    9:astore_1        
			int l = s1.length;
		//    7   10:aload_2         
		//    8   11:arraylength     
		//    9   12:istore          7
			int j = 0;
		//   10   14:iconst_0        
		//   11   15:istore          5
			int i = 0;
		//   12   17:iconst_0        
		//   13   18:istore          4
			for(; j < l; j++)
		//*  14   20:iload           5
		//*  15   22:iload           7
		//*  16   24:icmpge          72
			{
				char c = s1[j];
		//   17   27:aload_2         
		//   18   28:iload           5
		//   19   30:caload          
		//   20   31:istore          6
				byte byte0 = (byte)translation.get(((int) (c)));
		//   21   33:aload_0         
		//   22   34:getfield        #409 <Field IntHashtable translation>
		//   23   37:iload           6
		//   24   39:invokevirtual   #423 <Method int IntHashtable.get(int)>
		//   25   42:int2byte        
		//   26   43:istore_3        
				if(byte0 != 0)
		//*  27   44:iload_3         
		//*  28   45:ifeq            97
				{
					int k = i + 1;
		//   29   48:iload           4
		//   30   50:iconst_1        
		//   31   51:iadd            
		//   32   52:istore          6
					s[i] = byte0;
		//   33   54:aload_1         
		//   34   55:iload           4
		//   35   57:iload_3         
		//   36   58:bastore         
					i = k;
		//   37   59:iload           6
		//   38   61:istore          4
				}
			}

		//   39   63:iload           5
		//   40   65:iconst_1        
		//   41   66:iadd            
		//   42   67:istore          5
		//*  43   69:goto            20
			if(i == l)
		//*  44   72:iload           4
		//*  45   74:iload           7
		//*  46   76:icmpne          81
			{
				return ((byte []) (s));
		//   47   79:aload_1         
		//   48   80:areturn         
			} else
			{
				s1 = ((String) (new byte[i]));
		//   49   81:iload           4
		//   50   83:newarray        byte[]
		//   51   85:astore_2        
				System.arraycopy(((Object) (s)), 0, ((Object) (s1)), 0, i);
		//   52   86:aload_1         
		//   53   87:iconst_0        
		//   54   88:aload_2         
		//   55   89:iconst_0        
		//   56   90:iload           4
		//   57   92:invokestatic    #434 <Method void System.arraycopy(Object, int, Object, int, int)>
				return ((byte []) (s1));
		//   58   95:aload_2         
		//   59   96:areturn         
			}
		//*  60   97:goto            63
		}

		private static final IntHashtable t1;
		private static final IntHashtable t2;
		private static final char table1[] = {
			'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
			'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
			'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
			'\0', '\0', ' ', '!', '\u2200', '#', '\u2203', '%', '&', '\u220B', 
			'(', ')', '*', '+', ',', '-', '.', '/', '0', '1', 
			'2', '3', '4', '5', '6', '7', '8', '9', ':', ';', 
			'<', '=', '>', '?', '\u2245', '\u0391', '\u0392', '\u03A7', '\u0394', '\u0395', 
			'\u03A6', '\u0393', '\u0397', '\u0399', '\u03D1', '\u039A', '\u039B', '\u039C', '\u039D', '\u039F', 
			'\u03A0', '\u0398', '\u03A1', '\u03A3', '\u03A4', '\u03A5', '\u03C2', '\u03A9', '\u039E', '\u03A8', 
			'\u0396', '[', '\u2234', ']', '\u22A5', '_', '\u0305', '\u03B1', '\u03B2', '\u03C7', 
			'\u03B4', '\u03B5', '\u03D5', '\u03B3', '\u03B7', '\u03B9', '\u03C6', '\u03BA', '\u03BB', '\u03BC', 
			'\u03BD', '\u03BF', '\u03C0', '\u03B8', '\u03C1', '\u03C3', '\u03C4', '\u03C5', '\u03D6', '\u03C9', 
			'\u03BE', '\u03C8', '\u03B6', '{', '|', '}', '~', '\0', '\0', '\0', 
			'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
			'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
			'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
			'\u20AC', '\u03D2', '\u2032', '\u2264', '\u2044', '\u221E', '\u0192', '\u2663', '\u2666', '\u2665', 
			'\u2660', '\u2194', '\u2190', '\u2191', '\u2192', '\u2193', '\260', '\261', '\u2033', '\u2265', 
			'\327', '\u221D', '\u2202', '\u2022', '\367', '\u2260', '\u2261', '\u2248', '\u2026', '\u2502', 
			'\u2500', '\u21B5', '\u2135', '\u2111', '\u211C', '\u2118', '\u2297', '\u2295', '\u2205', '\u2229', 
			'\u222A', '\u2283', '\u2287', '\u2284', '\u2282', '\u2286', '\u2208', '\u2209', '\u2220', '\u2207', 
			'\256', '\251', '\u2122', '\u220F', '\u221A', '\u22C5', '\254', '\u2227', '\u2228', '\u21D4', 
			'\u21D0', '\u21D1', '\u21D2', '\u21D3', '\u25CA', '\u2329', '\0', '\0', '\0', '\u2211', 
			'\u239B', '\u239C', '\u239D', '\u23A1', '\u23A2', '\u23A3', '\u23A7', '\u23A8', '\u23A9', '\u23AA', 
			'\0', '\u232A', '\u222B', '\u2320', '\u23AE', '\u2321', '\u239E', '\u239F', '\u23A0', '\u23A4', 
			'\u23A5', '\u23A6', '\u23AB', '\u23AC', '\u23AD', '\0'
		};
		private static final char table2[] = {
			'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
			'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
			'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
			'\0', '\0', ' ', '\u2701', '\u2702', '\u2703', '\u2704', '\u260E', '\u2706', '\u2707', 
			'\u2708', '\u2709', '\u261B', '\u261E', '\u270C', '\u270D', '\u270E', '\u270F', '\u2710', '\u2711', 
			'\u2712', '\u2713', '\u2714', '\u2715', '\u2716', '\u2717', '\u2718', '\u2719', '\u271A', '\u271B', 
			'\u271C', '\u271D', '\u271E', '\u271F', '\u2720', '\u2721', '\u2722', '\u2723', '\u2724', '\u2725', 
			'\u2726', '\u2727', '\u2605', '\u2729', '\u272A', '\u272B', '\u272C', '\u272D', '\u272E', '\u272F', 
			'\u2730', '\u2731', '\u2732', '\u2733', '\u2734', '\u2735', '\u2736', '\u2737', '\u2738', '\u2739', 
			'\u273A', '\u273B', '\u273C', '\u273D', '\u273E', '\u273F', '\u2740', '\u2741', '\u2742', '\u2743', 
			'\u2744', '\u2745', '\u2746', '\u2747', '\u2748', '\u2749', '\u274A', '\u274B', '\u25CF', '\u274D', 
			'\u25A0', '\u274F', '\u2750', '\u2751', '\u2752', '\u25B2', '\u25BC', '\u25C6', '\u2756', '\u25D7', 
			'\u2758', '\u2759', '\u275A', '\u275B', '\u275C', '\u275D', '\u275E', '\0', '\0', '\0', 
			'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
			'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
			'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
			'\0', '\u2761', '\u2762', '\u2763', '\u2764', '\u2765', '\u2766', '\u2767', '\u2663', '\u2666', 
			'\u2665', '\u2660', '\u2460', '\u2461', '\u2462', '\u2463', '\u2464', '\u2465', '\u2466', '\u2467', 
			'\u2468', '\u2469', '\u2776', '\u2777', '\u2778', '\u2779', '\u277A', '\u277B', '\u277C', '\u277D', 
			'\u277E', '\u277F', '\u2780', '\u2781', '\u2782', '\u2783', '\u2784', '\u2785', '\u2786', '\u2787', 
			'\u2788', '\u2789', '\u278A', '\u278B', '\u278C', '\u278D', '\u278E', '\u278F', '\u2790', '\u2791', 
			'\u2792', '\u2793', '\u2794', '\u2192', '\u2194', '\u2195', '\u2798', '\u2799', '\u279A', '\u279B', 
			'\u279C', '\u279D', '\u279E', '\u279F', '\u27A0', '\u27A1', '\u27A2', '\u27A3', '\u27A4', '\u27A5', 
			'\u27A6', '\u27A7', '\u27A8', '\u27A9', '\u27AA', '\u27AB', '\u27AC', '\u27AD', '\u27AE', '\u27AF', 
			'\0', '\u27B1', '\u27B2', '\u27B3', '\u27B4', '\u27B5', '\u27B6', '\u27B7', '\u27B8', '\u27B9', 
			'\u27BA', '\u27BB', '\u27BC', '\u27BD', '\u27BE', '\0'
		};
		private final char byteToChar[];
		private IntHashtable translation;

		static 
		{
			t1 = new IntHashtable();
		//    0    0:new             #21  <Class IntHashtable>
		//    1    3:dup             
		//    2    4:invokespecial   #24  <Method void IntHashtable()>
		//    3    7:putstatic       #26  <Field IntHashtable t1>
			t2 = new IntHashtable();
		//    4   10:new             #21  <Class IntHashtable>
		//    5   13:dup             
		//    6   14:invokespecial   #24  <Method void IntHashtable()>
		//    7   17:putstatic       #28  <Field IntHashtable t2>
		//    8   20:sipush          256
		//    9   23:newarray        char[]
		//   10   25:dup             
		//   11   26:iconst_0        
		//   12   27:ldc1            #29  <Int 0>
		//   13   29:castore         
		//   14   30:dup             
		//   15   31:iconst_1        
		//   16   32:ldc1            #29  <Int 0>
		//   17   34:castore         
		//   18   35:dup             
		//   19   36:iconst_2        
		//   20   37:ldc1            #29  <Int 0>
		//   21   39:castore         
		//   22   40:dup             
		//   23   41:iconst_3        
		//   24   42:ldc1            #29  <Int 0>
		//   25   44:castore         
		//   26   45:dup             
		//   27   46:iconst_4        
		//   28   47:ldc1            #29  <Int 0>
		//   29   49:castore         
		//   30   50:dup             
		//   31   51:iconst_5        
		//   32   52:ldc1            #29  <Int 0>
		//   33   54:castore         
		//   34   55:dup             
		//   35   56:bipush          6
		//   36   58:ldc1            #29  <Int 0>
		//   37   60:castore         
		//   38   61:dup             
		//   39   62:bipush          7
		//   40   64:ldc1            #29  <Int 0>
		//   41   66:castore         
		//   42   67:dup             
		//   43   68:bipush          8
		//   44   70:ldc1            #29  <Int 0>
		//   45   72:castore         
		//   46   73:dup             
		//   47   74:bipush          9
		//   48   76:ldc1            #29  <Int 0>
		//   49   78:castore         
		//   50   79:dup             
		//   51   80:bipush          10
		//   52   82:ldc1            #29  <Int 0>
		//   53   84:castore         
		//   54   85:dup             
		//   55   86:bipush          11
		//   56   88:ldc1            #29  <Int 0>
		//   57   90:castore         
		//   58   91:dup             
		//   59   92:bipush          12
		//   60   94:ldc1            #29  <Int 0>
		//   61   96:castore         
		//   62   97:dup             
		//   63   98:bipush          13
		//   64  100:ldc1            #29  <Int 0>
		//   65  102:castore         
		//   66  103:dup             
		//   67  104:bipush          14
		//   68  106:ldc1            #29  <Int 0>
		//   69  108:castore         
		//   70  109:dup             
		//   71  110:bipush          15
		//   72  112:ldc1            #29  <Int 0>
		//   73  114:castore         
		//   74  115:dup             
		//   75  116:bipush          16
		//   76  118:ldc1            #29  <Int 0>
		//   77  120:castore         
		//   78  121:dup             
		//   79  122:bipush          17
		//   80  124:ldc1            #29  <Int 0>
		//   81  126:castore         
		//   82  127:dup             
		//   83  128:bipush          18
		//   84  130:ldc1            #29  <Int 0>
		//   85  132:castore         
		//   86  133:dup             
		//   87  134:bipush          19
		//   88  136:ldc1            #29  <Int 0>
		//   89  138:castore         
		//   90  139:dup             
		//   91  140:bipush          20
		//   92  142:ldc1            #29  <Int 0>
		//   93  144:castore         
		//   94  145:dup             
		//   95  146:bipush          21
		//   96  148:ldc1            #29  <Int 0>
		//   97  150:castore         
		//   98  151:dup             
		//   99  152:bipush          22
		//  100  154:ldc1            #29  <Int 0>
		//  101  156:castore         
		//  102  157:dup             
		//  103  158:bipush          23
		//  104  160:ldc1            #29  <Int 0>
		//  105  162:castore         
		//  106  163:dup             
		//  107  164:bipush          24
		//  108  166:ldc1            #29  <Int 0>
		//  109  168:castore         
		//  110  169:dup             
		//  111  170:bipush          25
		//  112  172:ldc1            #29  <Int 0>
		//  113  174:castore         
		//  114  175:dup             
		//  115  176:bipush          26
		//  116  178:ldc1            #29  <Int 0>
		//  117  180:castore         
		//  118  181:dup             
		//  119  182:bipush          27
		//  120  184:ldc1            #29  <Int 0>
		//  121  186:castore         
		//  122  187:dup             
		//  123  188:bipush          28
		//  124  190:ldc1            #29  <Int 0>
		//  125  192:castore         
		//  126  193:dup             
		//  127  194:bipush          29
		//  128  196:ldc1            #29  <Int 0>
		//  129  198:castore         
		//  130  199:dup             
		//  131  200:bipush          30
		//  132  202:ldc1            #29  <Int 0>
		//  133  204:castore         
		//  134  205:dup             
		//  135  206:bipush          31
		//  136  208:ldc1            #29  <Int 0>
		//  137  210:castore         
		//  138  211:dup             
		//  139  212:bipush          32
		//  140  214:ldc1            #30  <Int 32>
		//  141  216:castore         
		//  142  217:dup             
		//  143  218:bipush          33
		//  144  220:ldc1            #31  <Int 33>
		//  145  222:castore         
		//  146  223:dup             
		//  147  224:bipush          34
		//  148  226:ldc1            #32  <Int 8704>
		//  149  228:castore         
		//  150  229:dup             
		//  151  230:bipush          35
		//  152  232:ldc1            #33  <Int 35>
		//  153  234:castore         
		//  154  235:dup             
		//  155  236:bipush          36
		//  156  238:ldc1            #34  <Int 8707>
		//  157  240:castore         
		//  158  241:dup             
		//  159  242:bipush          37
		//  160  244:ldc1            #35  <Int 37>
		//  161  246:castore         
		//  162  247:dup             
		//  163  248:bipush          38
		//  164  250:ldc1            #36  <Int 38>
		//  165  252:castore         
		//  166  253:dup             
		//  167  254:bipush          39
		//  168  256:ldc1            #37  <Int 8715>
		//  169  258:castore         
		//  170  259:dup             
		//  171  260:bipush          40
		//  172  262:ldc1            #38  <Int 40>
		//  173  264:castore         
		//  174  265:dup             
		//  175  266:bipush          41
		//  176  268:ldc1            #39  <Int 41>
		//  177  270:castore         
		//  178  271:dup             
		//  179  272:bipush          42
		//  180  274:ldc1            #40  <Int 42>
		//  181  276:castore         
		//  182  277:dup             
		//  183  278:bipush          43
		//  184  280:ldc1            #41  <Int 43>
		//  185  282:castore         
		//  186  283:dup             
		//  187  284:bipush          44
		//  188  286:ldc1            #42  <Int 44>
		//  189  288:castore         
		//  190  289:dup             
		//  191  290:bipush          45
		//  192  292:ldc1            #43  <Int 45>
		//  193  294:castore         
		//  194  295:dup             
		//  195  296:bipush          46
		//  196  298:ldc1            #44  <Int 46>
		//  197  300:castore         
		//  198  301:dup             
		//  199  302:bipush          47
		//  200  304:ldc1            #45  <Int 47>
		//  201  306:castore         
		//  202  307:dup             
		//  203  308:bipush          48
		//  204  310:ldc1            #46  <Int 48>
		//  205  312:castore         
		//  206  313:dup             
		//  207  314:bipush          49
		//  208  316:ldc1            #47  <Int 49>
		//  209  318:castore         
		//  210  319:dup             
		//  211  320:bipush          50
		//  212  322:ldc1            #48  <Int 50>
		//  213  324:castore         
		//  214  325:dup             
		//  215  326:bipush          51
		//  216  328:ldc1            #49  <Int 51>
		//  217  330:castore         
		//  218  331:dup             
		//  219  332:bipush          52
		//  220  334:ldc1            #50  <Int 52>
		//  221  336:castore         
		//  222  337:dup             
		//  223  338:bipush          53
		//  224  340:ldc1            #51  <Int 53>
		//  225  342:castore         
		//  226  343:dup             
		//  227  344:bipush          54
		//  228  346:ldc1            #52  <Int 54>
		//  229  348:castore         
		//  230  349:dup             
		//  231  350:bipush          55
		//  232  352:ldc1            #53  <Int 55>
		//  233  354:castore         
		//  234  355:dup             
		//  235  356:bipush          56
		//  236  358:ldc1            #54  <Int 56>
		//  237  360:castore         
		//  238  361:dup             
		//  239  362:bipush          57
		//  240  364:ldc1            #55  <Int 57>
		//  241  366:castore         
		//  242  367:dup             
		//  243  368:bipush          58
		//  244  370:ldc1            #56  <Int 58>
		//  245  372:castore         
		//  246  373:dup             
		//  247  374:bipush          59
		//  248  376:ldc1            #57  <Int 59>
		//  249  378:castore         
		//  250  379:dup             
		//  251  380:bipush          60
		//  252  382:ldc1            #58  <Int 60>
		//  253  384:castore         
		//  254  385:dup             
		//  255  386:bipush          61
		//  256  388:ldc1            #59  <Int 61>
		//  257  390:castore         
		//  258  391:dup             
		//  259  392:bipush          62
		//  260  394:ldc1            #60  <Int 62>
		//  261  396:castore         
		//  262  397:dup             
		//  263  398:bipush          63
		//  264  400:ldc1            #61  <Int 63>
		//  265  402:castore         
		//  266  403:dup             
		//  267  404:bipush          64
		//  268  406:ldc1            #62  <Int 8773>
		//  269  408:castore         
		//  270  409:dup             
		//  271  410:bipush          65
		//  272  412:ldc1            #63  <Int 913>
		//  273  414:castore         
		//  274  415:dup             
		//  275  416:bipush          66
		//  276  418:ldc1            #64  <Int 914>
		//  277  420:castore         
		//  278  421:dup             
		//  279  422:bipush          67
		//  280  424:ldc1            #65  <Int 935>
		//  281  426:castore         
		//  282  427:dup             
		//  283  428:bipush          68
		//  284  430:ldc1            #66  <Int 916>
		//  285  432:castore         
		//  286  433:dup             
		//  287  434:bipush          69
		//  288  436:ldc1            #67  <Int 917>
		//  289  438:castore         
		//  290  439:dup             
		//  291  440:bipush          70
		//  292  442:ldc1            #68  <Int 934>
		//  293  444:castore         
		//  294  445:dup             
		//  295  446:bipush          71
		//  296  448:ldc1            #69  <Int 915>
		//  297  450:castore         
		//  298  451:dup             
		//  299  452:bipush          72
		//  300  454:ldc1            #70  <Int 919>
		//  301  456:castore         
		//  302  457:dup             
		//  303  458:bipush          73
		//  304  460:ldc1            #71  <Int 921>
		//  305  462:castore         
		//  306  463:dup             
		//  307  464:bipush          74
		//  308  466:ldc1            #72  <Int 977>
		//  309  468:castore         
		//  310  469:dup             
		//  311  470:bipush          75
		//  312  472:ldc1            #73  <Int 922>
		//  313  474:castore         
		//  314  475:dup             
		//  315  476:bipush          76
		//  316  478:ldc1            #74  <Int 923>
		//  317  480:castore         
		//  318  481:dup             
		//  319  482:bipush          77
		//  320  484:ldc1            #75  <Int 924>
		//  321  486:castore         
		//  322  487:dup             
		//  323  488:bipush          78
		//  324  490:ldc1            #76  <Int 925>
		//  325  492:castore         
		//  326  493:dup             
		//  327  494:bipush          79
		//  328  496:ldc1            #77  <Int 927>
		//  329  498:castore         
		//  330  499:dup             
		//  331  500:bipush          80
		//  332  502:ldc1            #78  <Int 928>
		//  333  504:castore         
		//  334  505:dup             
		//  335  506:bipush          81
		//  336  508:ldc1            #79  <Int 920>
		//  337  510:castore         
		//  338  511:dup             
		//  339  512:bipush          82
		//  340  514:ldc1            #80  <Int 929>
		//  341  516:castore         
		//  342  517:dup             
		//  343  518:bipush          83
		//  344  520:ldc1            #81  <Int 931>
		//  345  522:castore         
		//  346  523:dup             
		//  347  524:bipush          84
		//  348  526:ldc1            #82  <Int 932>
		//  349  528:castore         
		//  350  529:dup             
		//  351  530:bipush          85
		//  352  532:ldc1            #83  <Int 933>
		//  353  534:castore         
		//  354  535:dup             
		//  355  536:bipush          86
		//  356  538:ldc1            #84  <Int 962>
		//  357  540:castore         
		//  358  541:dup             
		//  359  542:bipush          87
		//  360  544:ldc1            #85  <Int 937>
		//  361  546:castore         
		//  362  547:dup             
		//  363  548:bipush          88
		//  364  550:ldc1            #86  <Int 926>
		//  365  552:castore         
		//  366  553:dup             
		//  367  554:bipush          89
		//  368  556:ldc1            #87  <Int 936>
		//  369  558:castore         
		//  370  559:dup             
		//  371  560:bipush          90
		//  372  562:ldc1            #88  <Int 918>
		//  373  564:castore         
		//  374  565:dup             
		//  375  566:bipush          91
		//  376  568:ldc1            #89  <Int 91>
		//  377  570:castore         
		//  378  571:dup             
		//  379  572:bipush          92
		//  380  574:ldc1            #90  <Int 8756>
		//  381  576:castore         
		//  382  577:dup             
		//  383  578:bipush          93
		//  384  580:ldc1            #91  <Int 93>
		//  385  582:castore         
		//  386  583:dup             
		//  387  584:bipush          94
		//  388  586:ldc1            #92  <Int 8869>
		//  389  588:castore         
		//  390  589:dup             
		//  391  590:bipush          95
		//  392  592:ldc1            #93  <Int 95>
		//  393  594:castore         
		//  394  595:dup             
		//  395  596:bipush          96
		//  396  598:ldc1            #94  <Int 773>
		//  397  600:castore         
		//  398  601:dup             
		//  399  602:bipush          97
		//  400  604:ldc1            #95  <Int 945>
		//  401  606:castore         
		//  402  607:dup             
		//  403  608:bipush          98
		//  404  610:ldc1            #96  <Int 946>
		//  405  612:castore         
		//  406  613:dup             
		//  407  614:bipush          99
		//  408  616:ldc1            #97  <Int 967>
		//  409  618:castore         
		//  410  619:dup             
		//  411  620:bipush          100
		//  412  622:ldc1            #98  <Int 948>
		//  413  624:castore         
		//  414  625:dup             
		//  415  626:bipush          101
		//  416  628:ldc1            #99  <Int 949>
		//  417  630:castore         
		//  418  631:dup             
		//  419  632:bipush          102
		//  420  634:ldc1            #100 <Int 981>
		//  421  636:castore         
		//  422  637:dup             
		//  423  638:bipush          103
		//  424  640:ldc1            #101 <Int 947>
		//  425  642:castore         
		//  426  643:dup             
		//  427  644:bipush          104
		//  428  646:ldc1            #102 <Int 951>
		//  429  648:castore         
		//  430  649:dup             
		//  431  650:bipush          105
		//  432  652:ldc1            #103 <Int 953>
		//  433  654:castore         
		//  434  655:dup             
		//  435  656:bipush          106
		//  436  658:ldc1            #104 <Int 966>
		//  437  660:castore         
		//  438  661:dup             
		//  439  662:bipush          107
		//  440  664:ldc1            #105 <Int 954>
		//  441  666:castore         
		//  442  667:dup             
		//  443  668:bipush          108
		//  444  670:ldc1            #106 <Int 955>
		//  445  672:castore         
		//  446  673:dup             
		//  447  674:bipush          109
		//  448  676:ldc1            #107 <Int 956>
		//  449  678:castore         
		//  450  679:dup             
		//  451  680:bipush          110
		//  452  682:ldc1            #108 <Int 957>
		//  453  684:castore         
		//  454  685:dup             
		//  455  686:bipush          111
		//  456  688:ldc1            #109 <Int 959>
		//  457  690:castore         
		//  458  691:dup             
		//  459  692:bipush          112
		//  460  694:ldc1            #110 <Int 960>
		//  461  696:castore         
		//  462  697:dup             
		//  463  698:bipush          113
		//  464  700:ldc1            #111 <Int 952>
		//  465  702:castore         
		//  466  703:dup             
		//  467  704:bipush          114
		//  468  706:ldc1            #112 <Int 961>
		//  469  708:castore         
		//  470  709:dup             
		//  471  710:bipush          115
		//  472  712:ldc1            #113 <Int 963>
		//  473  714:castore         
		//  474  715:dup             
		//  475  716:bipush          116
		//  476  718:ldc1            #114 <Int 964>
		//  477  720:castore         
		//  478  721:dup             
		//  479  722:bipush          117
		//  480  724:ldc1            #115 <Int 965>
		//  481  726:castore         
		//  482  727:dup             
		//  483  728:bipush          118
		//  484  730:ldc1            #116 <Int 982>
		//  485  732:castore         
		//  486  733:dup             
		//  487  734:bipush          119
		//  488  736:ldc1            #117 <Int 969>
		//  489  738:castore         
		//  490  739:dup             
		//  491  740:bipush          120
		//  492  742:ldc1            #118 <Int 958>
		//  493  744:castore         
		//  494  745:dup             
		//  495  746:bipush          121
		//  496  748:ldc1            #119 <Int 968>
		//  497  750:castore         
		//  498  751:dup             
		//  499  752:bipush          122
		//  500  754:ldc1            #120 <Int 950>
		//  501  756:castore         
		//  502  757:dup             
		//  503  758:bipush          123
		//  504  760:ldc1            #121 <Int 123>
		//  505  762:castore         
		//  506  763:dup             
		//  507  764:bipush          124
		//  508  766:ldc1            #122 <Int 124>
		//  509  768:castore         
		//  510  769:dup             
		//  511  770:bipush          125
		//  512  772:ldc1            #123 <Int 125>
		//  513  774:castore         
		//  514  775:dup             
		//  515  776:bipush          126
		//  516  778:ldc1            #124 <Int 126>
		//  517  780:castore         
		//  518  781:dup             
		//  519  782:bipush          127
		//  520  784:ldc1            #29  <Int 0>
		//  521  786:castore         
		//  522  787:dup             
		//  523  788:sipush          128
		//  524  791:ldc1            #29  <Int 0>
		//  525  793:castore         
		//  526  794:dup             
		//  527  795:sipush          129
		//  528  798:ldc1            #29  <Int 0>
		//  529  800:castore         
		//  530  801:dup             
		//  531  802:sipush          130
		//  532  805:ldc1            #29  <Int 0>
		//  533  807:castore         
		//  534  808:dup             
		//  535  809:sipush          131
		//  536  812:ldc1            #29  <Int 0>
		//  537  814:castore         
		//  538  815:dup             
		//  539  816:sipush          132
		//  540  819:ldc1            #29  <Int 0>
		//  541  821:castore         
		//  542  822:dup             
		//  543  823:sipush          133
		//  544  826:ldc1            #29  <Int 0>
		//  545  828:castore         
		//  546  829:dup             
		//  547  830:sipush          134
		//  548  833:ldc1            #29  <Int 0>
		//  549  835:castore         
		//  550  836:dup             
		//  551  837:sipush          135
		//  552  840:ldc1            #29  <Int 0>
		//  553  842:castore         
		//  554  843:dup             
		//  555  844:sipush          136
		//  556  847:ldc1            #29  <Int 0>
		//  557  849:castore         
		//  558  850:dup             
		//  559  851:sipush          137
		//  560  854:ldc1            #29  <Int 0>
		//  561  856:castore         
		//  562  857:dup             
		//  563  858:sipush          138
		//  564  861:ldc1            #29  <Int 0>
		//  565  863:castore         
		//  566  864:dup             
		//  567  865:sipush          139
		//  568  868:ldc1            #29  <Int 0>
		//  569  870:castore         
		//  570  871:dup             
		//  571  872:sipush          140
		//  572  875:ldc1            #29  <Int 0>
		//  573  877:castore         
		//  574  878:dup             
		//  575  879:sipush          141
		//  576  882:ldc1            #29  <Int 0>
		//  577  884:castore         
		//  578  885:dup             
		//  579  886:sipush          142
		//  580  889:ldc1            #29  <Int 0>
		//  581  891:castore         
		//  582  892:dup             
		//  583  893:sipush          143
		//  584  896:ldc1            #29  <Int 0>
		//  585  898:castore         
		//  586  899:dup             
		//  587  900:sipush          144
		//  588  903:ldc1            #29  <Int 0>
		//  589  905:castore         
		//  590  906:dup             
		//  591  907:sipush          145
		//  592  910:ldc1            #29  <Int 0>
		//  593  912:castore         
		//  594  913:dup             
		//  595  914:sipush          146
		//  596  917:ldc1            #29  <Int 0>
		//  597  919:castore         
		//  598  920:dup             
		//  599  921:sipush          147
		//  600  924:ldc1            #29  <Int 0>
		//  601  926:castore         
		//  602  927:dup             
		//  603  928:sipush          148
		//  604  931:ldc1            #29  <Int 0>
		//  605  933:castore         
		//  606  934:dup             
		//  607  935:sipush          149
		//  608  938:ldc1            #29  <Int 0>
		//  609  940:castore         
		//  610  941:dup             
		//  611  942:sipush          150
		//  612  945:ldc1            #29  <Int 0>
		//  613  947:castore         
		//  614  948:dup             
		//  615  949:sipush          151
		//  616  952:ldc1            #29  <Int 0>
		//  617  954:castore         
		//  618  955:dup             
		//  619  956:sipush          152
		//  620  959:ldc1            #29  <Int 0>
		//  621  961:castore         
		//  622  962:dup             
		//  623  963:sipush          153
		//  624  966:ldc1            #29  <Int 0>
		//  625  968:castore         
		//  626  969:dup             
		//  627  970:sipush          154
		//  628  973:ldc1            #29  <Int 0>
		//  629  975:castore         
		//  630  976:dup             
		//  631  977:sipush          155
		//  632  980:ldc1            #29  <Int 0>
		//  633  982:castore         
		//  634  983:dup             
		//  635  984:sipush          156
		//  636  987:ldc1            #29  <Int 0>
		//  637  989:castore         
		//  638  990:dup             
		//  639  991:sipush          157
		//  640  994:ldc1            #29  <Int 0>
		//  641  996:castore         
		//  642  997:dup             
		//  643  998:sipush          158
		//  644 1001:ldc1            #29  <Int 0>
		//  645 1003:castore         
		//  646 1004:dup             
		//  647 1005:sipush          159
		//  648 1008:ldc1            #29  <Int 0>
		//  649 1010:castore         
		//  650 1011:dup             
		//  651 1012:sipush          160
		//  652 1015:ldc1            #125 <Int 8364>
		//  653 1017:castore         
		//  654 1018:dup             
		//  655 1019:sipush          161
		//  656 1022:ldc1            #126 <Int 978>
		//  657 1024:castore         
		//  658 1025:dup             
		//  659 1026:sipush          162
		//  660 1029:ldc1            #127 <Int 8242>
		//  661 1031:castore         
		//  662 1032:dup             
		//  663 1033:sipush          163
		//  664 1036:ldc1            #128 <Int 8804>
		//  665 1038:castore         
		//  666 1039:dup             
		//  667 1040:sipush          164
		//  668 1043:ldc1            #129 <Int 8260>
		//  669 1045:castore         
		//  670 1046:dup             
		//  671 1047:sipush          165
		//  672 1050:ldc1            #130 <Int 8734>
		//  673 1052:castore         
		//  674 1053:dup             
		//  675 1054:sipush          166
		//  676 1057:ldc1            #131 <Int 402>
		//  677 1059:castore         
		//  678 1060:dup             
		//  679 1061:sipush          167
		//  680 1064:ldc1            #132 <Int 9827>
		//  681 1066:castore         
		//  682 1067:dup             
		//  683 1068:sipush          168
		//  684 1071:ldc1            #133 <Int 9830>
		//  685 1073:castore         
		//  686 1074:dup             
		//  687 1075:sipush          169
		//  688 1078:ldc1            #134 <Int 9829>
		//  689 1080:castore         
		//  690 1081:dup             
		//  691 1082:sipush          170
		//  692 1085:ldc1            #135 <Int 9824>
		//  693 1087:castore         
		//  694 1088:dup             
		//  695 1089:sipush          171
		//  696 1092:ldc1            #136 <Int 8596>
		//  697 1094:castore         
		//  698 1095:dup             
		//  699 1096:sipush          172
		//  700 1099:ldc1            #137 <Int 8592>
		//  701 1101:castore         
		//  702 1102:dup             
		//  703 1103:sipush          173
		//  704 1106:ldc1            #138 <Int 8593>
		//  705 1108:castore         
		//  706 1109:dup             
		//  707 1110:sipush          174
		//  708 1113:ldc1            #139 <Int 8594>
		//  709 1115:castore         
		//  710 1116:dup             
		//  711 1117:sipush          175
		//  712 1120:ldc1            #140 <Int 8595>
		//  713 1122:castore         
		//  714 1123:dup             
		//  715 1124:sipush          176
		//  716 1127:ldc1            #141 <Int 176>
		//  717 1129:castore         
		//  718 1130:dup             
		//  719 1131:sipush          177
		//  720 1134:ldc1            #142 <Int 177>
		//  721 1136:castore         
		//  722 1137:dup             
		//  723 1138:sipush          178
		//  724 1141:ldc1            #143 <Int 8243>
		//  725 1143:castore         
		//  726 1144:dup             
		//  727 1145:sipush          179
		//  728 1148:ldc1            #144 <Int 8805>
		//  729 1150:castore         
		//  730 1151:dup             
		//  731 1152:sipush          180
		//  732 1155:ldc1            #145 <Int 215>
		//  733 1157:castore         
		//  734 1158:dup             
		//  735 1159:sipush          181
		//  736 1162:ldc1            #146 <Int 8733>
		//  737 1164:castore         
		//  738 1165:dup             
		//  739 1166:sipush          182
		//  740 1169:ldc1            #147 <Int 8706>
		//  741 1171:castore         
		//  742 1172:dup             
		//  743 1173:sipush          183
		//  744 1176:ldc1            #148 <Int 8226>
		//  745 1178:castore         
		//  746 1179:dup             
		//  747 1180:sipush          184
		//  748 1183:ldc1            #149 <Int 247>
		//  749 1185:castore         
		//  750 1186:dup             
		//  751 1187:sipush          185
		//  752 1190:ldc1            #150 <Int 8800>
		//  753 1192:castore         
		//  754 1193:dup             
		//  755 1194:sipush          186
		//  756 1197:ldc1            #151 <Int 8801>
		//  757 1199:castore         
		//  758 1200:dup             
		//  759 1201:sipush          187
		//  760 1204:ldc1            #152 <Int 8776>
		//  761 1206:castore         
		//  762 1207:dup             
		//  763 1208:sipush          188
		//  764 1211:ldc1            #153 <Int 8230>
		//  765 1213:castore         
		//  766 1214:dup             
		//  767 1215:sipush          189
		//  768 1218:ldc1            #154 <Int 9474>
		//  769 1220:castore         
		//  770 1221:dup             
		//  771 1222:sipush          190
		//  772 1225:ldc1            #155 <Int 9472>
		//  773 1227:castore         
		//  774 1228:dup             
		//  775 1229:sipush          191
		//  776 1232:ldc1            #156 <Int 8629>
		//  777 1234:castore         
		//  778 1235:dup             
		//  779 1236:sipush          192
		//  780 1239:ldc1            #157 <Int 8501>
		//  781 1241:castore         
		//  782 1242:dup             
		//  783 1243:sipush          193
		//  784 1246:ldc1            #158 <Int 8465>
		//  785 1248:castore         
		//  786 1249:dup             
		//  787 1250:sipush          194
		//  788 1253:ldc1            #159 <Int 8476>
		//  789 1255:castore         
		//  790 1256:dup             
		//  791 1257:sipush          195
		//  792 1260:ldc1            #160 <Int 8472>
		//  793 1262:castore         
		//  794 1263:dup             
		//  795 1264:sipush          196
		//  796 1267:ldc1            #161 <Int 8855>
		//  797 1269:castore         
		//  798 1270:dup             
		//  799 1271:sipush          197
		//  800 1274:ldc1            #162 <Int 8853>
		//  801 1276:castore         
		//  802 1277:dup             
		//  803 1278:sipush          198
		//  804 1281:ldc1            #163 <Int 8709>
		//  805 1283:castore         
		//  806 1284:dup             
		//  807 1285:sipush          199
		//  808 1288:ldc1            #164 <Int 8745>
		//  809 1290:castore         
		//  810 1291:dup             
		//  811 1292:sipush          200
		//  812 1295:ldc1            #165 <Int 8746>
		//  813 1297:castore         
		//  814 1298:dup             
		//  815 1299:sipush          201
		//  816 1302:ldc1            #166 <Int 8835>
		//  817 1304:castore         
		//  818 1305:dup             
		//  819 1306:sipush          202
		//  820 1309:ldc1            #167 <Int 8839>
		//  821 1311:castore         
		//  822 1312:dup             
		//  823 1313:sipush          203
		//  824 1316:ldc1            #168 <Int 8836>
		//  825 1318:castore         
		//  826 1319:dup             
		//  827 1320:sipush          204
		//  828 1323:ldc1            #169 <Int 8834>
		//  829 1325:castore         
		//  830 1326:dup             
		//  831 1327:sipush          205
		//  832 1330:ldc1            #170 <Int 8838>
		//  833 1332:castore         
		//  834 1333:dup             
		//  835 1334:sipush          206
		//  836 1337:ldc1            #171 <Int 8712>
		//  837 1339:castore         
		//  838 1340:dup             
		//  839 1341:sipush          207
		//  840 1344:ldc1            #172 <Int 8713>
		//  841 1346:castore         
		//  842 1347:dup             
		//  843 1348:sipush          208
		//  844 1351:ldc1            #173 <Int 8736>
		//  845 1353:castore         
		//  846 1354:dup             
		//  847 1355:sipush          209
		//  848 1358:ldc1            #174 <Int 8711>
		//  849 1360:castore         
		//  850 1361:dup             
		//  851 1362:sipush          210
		//  852 1365:ldc1            #175 <Int 174>
		//  853 1367:castore         
		//  854 1368:dup             
		//  855 1369:sipush          211
		//  856 1372:ldc1            #176 <Int 169>
		//  857 1374:castore         
		//  858 1375:dup             
		//  859 1376:sipush          212
		//  860 1379:ldc1            #177 <Int 8482>
		//  861 1381:castore         
		//  862 1382:dup             
		//  863 1383:sipush          213
		//  864 1386:ldc1            #178 <Int 8719>
		//  865 1388:castore         
		//  866 1389:dup             
		//  867 1390:sipush          214
		//  868 1393:ldc1            #179 <Int 8730>
		//  869 1395:castore         
		//  870 1396:dup             
		//  871 1397:sipush          215
		//  872 1400:ldc1            #180 <Int 8901>
		//  873 1402:castore         
		//  874 1403:dup             
		//  875 1404:sipush          216
		//  876 1407:ldc1            #181 <Int 172>
		//  877 1409:castore         
		//  878 1410:dup             
		//  879 1411:sipush          217
		//  880 1414:ldc1            #182 <Int 8743>
		//  881 1416:castore         
		//  882 1417:dup             
		//  883 1418:sipush          218
		//  884 1421:ldc1            #183 <Int 8744>
		//  885 1423:castore         
		//  886 1424:dup             
		//  887 1425:sipush          219
		//  888 1428:ldc1            #184 <Int 8660>
		//  889 1430:castore         
		//  890 1431:dup             
		//  891 1432:sipush          220
		//  892 1435:ldc1            #185 <Int 8656>
		//  893 1437:castore         
		//  894 1438:dup             
		//  895 1439:sipush          221
		//  896 1442:ldc1            #186 <Int 8657>
		//  897 1444:castore         
		//  898 1445:dup             
		//  899 1446:sipush          222
		//  900 1449:ldc1            #187 <Int 8658>
		//  901 1451:castore         
		//  902 1452:dup             
		//  903 1453:sipush          223
		//  904 1456:ldc1            #188 <Int 8659>
		//  905 1458:castore         
		//  906 1459:dup             
		//  907 1460:sipush          224
		//  908 1463:ldc1            #189 <Int 9674>
		//  909 1465:castore         
		//  910 1466:dup             
		//  911 1467:sipush          225
		//  912 1470:ldc1            #190 <Int 9001>
		//  913 1472:castore         
		//  914 1473:dup             
		//  915 1474:sipush          226
		//  916 1477:ldc1            #29  <Int 0>
		//  917 1479:castore         
		//  918 1480:dup             
		//  919 1481:sipush          227
		//  920 1484:ldc1            #29  <Int 0>
		//  921 1486:castore         
		//  922 1487:dup             
		//  923 1488:sipush          228
		//  924 1491:ldc1            #29  <Int 0>
		//  925 1493:castore         
		//  926 1494:dup             
		//  927 1495:sipush          229
		//  928 1498:ldc1            #191 <Int 8721>
		//  929 1500:castore         
		//  930 1501:dup             
		//  931 1502:sipush          230
		//  932 1505:ldc1            #192 <Int 9115>
		//  933 1507:castore         
		//  934 1508:dup             
		//  935 1509:sipush          231
		//  936 1512:ldc1            #193 <Int 9116>
		//  937 1514:castore         
		//  938 1515:dup             
		//  939 1516:sipush          232
		//  940 1519:ldc1            #194 <Int 9117>
		//  941 1521:castore         
		//  942 1522:dup             
		//  943 1523:sipush          233
		//  944 1526:ldc1            #195 <Int 9121>
		//  945 1528:castore         
		//  946 1529:dup             
		//  947 1530:sipush          234
		//  948 1533:ldc1            #196 <Int 9122>
		//  949 1535:castore         
		//  950 1536:dup             
		//  951 1537:sipush          235
		//  952 1540:ldc1            #197 <Int 9123>
		//  953 1542:castore         
		//  954 1543:dup             
		//  955 1544:sipush          236
		//  956 1547:ldc1            #198 <Int 9127>
		//  957 1549:castore         
		//  958 1550:dup             
		//  959 1551:sipush          237
		//  960 1554:ldc1            #199 <Int 9128>
		//  961 1556:castore         
		//  962 1557:dup             
		//  963 1558:sipush          238
		//  964 1561:ldc1            #200 <Int 9129>
		//  965 1563:castore         
		//  966 1564:dup             
		//  967 1565:sipush          239
		//  968 1568:ldc1            #201 <Int 9130>
		//  969 1570:castore         
		//  970 1571:dup             
		//  971 1572:sipush          240
		//  972 1575:ldc1            #29  <Int 0>
		//  973 1577:castore         
		//  974 1578:dup             
		//  975 1579:sipush          241
		//  976 1582:ldc1            #202 <Int 9002>
		//  977 1584:castore         
		//  978 1585:dup             
		//  979 1586:sipush          242
		//  980 1589:ldc1            #203 <Int 8747>
		//  981 1591:castore         
		//  982 1592:dup             
		//  983 1593:sipush          243
		//  984 1596:ldc1            #204 <Int 8992>
		//  985 1598:castore         
		//  986 1599:dup             
		//  987 1600:sipush          244
		//  988 1603:ldc1            #205 <Int 9134>
		//  989 1605:castore         
		//  990 1606:dup             
		//  991 1607:sipush          245
		//  992 1610:ldc1            #206 <Int 8993>
		//  993 1612:castore         
		//  994 1613:dup             
		//  995 1614:sipush          246
		//  996 1617:ldc1            #207 <Int 9118>
		//  997 1619:castore         
		//  998 1620:dup             
		//  999 1621:sipush          247
		// 1000 1624:ldc1            #208 <Int 9119>
		// 1001 1626:castore         
		// 1002 1627:dup             
		// 1003 1628:sipush          248
		// 1004 1631:ldc1            #209 <Int 9120>
		// 1005 1633:castore         
		// 1006 1634:dup             
		// 1007 1635:sipush          249
		// 1008 1638:ldc1            #210 <Int 9124>
		// 1009 1640:castore         
		// 1010 1641:dup             
		// 1011 1642:sipush          250
		// 1012 1645:ldc1            #211 <Int 9125>
		// 1013 1647:castore         
		// 1014 1648:dup             
		// 1015 1649:sipush          251
		// 1016 1652:ldc1            #212 <Int 9126>
		// 1017 1654:castore         
		// 1018 1655:dup             
		// 1019 1656:sipush          252
		// 1020 1659:ldc1            #213 <Int 9131>
		// 1021 1661:castore         
		// 1022 1662:dup             
		// 1023 1663:sipush          253
		// 1024 1666:ldc1            #214 <Int 9132>
		// 1025 1668:castore         
		// 1026 1669:dup             
		// 1027 1670:sipush          254
		// 1028 1673:ldc1            #215 <Int 9133>
		// 1029 1675:castore         
		// 1030 1676:dup             
		// 1031 1677:sipush          255
		// 1032 1680:ldc1            #29  <Int 0>
		// 1033 1682:castore         
		// 1034 1683:putstatic       #217 <Field char[] table1>
		// 1035 1686:sipush          256
		// 1036 1689:newarray        char[]
		// 1037 1691:dup             
		// 1038 1692:iconst_0        
		// 1039 1693:ldc1            #29  <Int 0>
		// 1040 1695:castore         
		// 1041 1696:dup             
		// 1042 1697:iconst_1        
		// 1043 1698:ldc1            #29  <Int 0>
		// 1044 1700:castore         
		// 1045 1701:dup             
		// 1046 1702:iconst_2        
		// 1047 1703:ldc1            #29  <Int 0>
		// 1048 1705:castore         
		// 1049 1706:dup             
		// 1050 1707:iconst_3        
		// 1051 1708:ldc1            #29  <Int 0>
		// 1052 1710:castore         
		// 1053 1711:dup             
		// 1054 1712:iconst_4        
		// 1055 1713:ldc1            #29  <Int 0>
		// 1056 1715:castore         
		// 1057 1716:dup             
		// 1058 1717:iconst_5        
		// 1059 1718:ldc1            #29  <Int 0>
		// 1060 1720:castore         
		// 1061 1721:dup             
		// 1062 1722:bipush          6
		// 1063 1724:ldc1            #29  <Int 0>
		// 1064 1726:castore         
		// 1065 1727:dup             
		// 1066 1728:bipush          7
		// 1067 1730:ldc1            #29  <Int 0>
		// 1068 1732:castore         
		// 1069 1733:dup             
		// 1070 1734:bipush          8
		// 1071 1736:ldc1            #29  <Int 0>
		// 1072 1738:castore         
		// 1073 1739:dup             
		// 1074 1740:bipush          9
		// 1075 1742:ldc1            #29  <Int 0>
		// 1076 1744:castore         
		// 1077 1745:dup             
		// 1078 1746:bipush          10
		// 1079 1748:ldc1            #29  <Int 0>
		// 1080 1750:castore         
		// 1081 1751:dup             
		// 1082 1752:bipush          11
		// 1083 1754:ldc1            #29  <Int 0>
		// 1084 1756:castore         
		// 1085 1757:dup             
		// 1086 1758:bipush          12
		// 1087 1760:ldc1            #29  <Int 0>
		// 1088 1762:castore         
		// 1089 1763:dup             
		// 1090 1764:bipush          13
		// 1091 1766:ldc1            #29  <Int 0>
		// 1092 1768:castore         
		// 1093 1769:dup             
		// 1094 1770:bipush          14
		// 1095 1772:ldc1            #29  <Int 0>
		// 1096 1774:castore         
		// 1097 1775:dup             
		// 1098 1776:bipush          15
		// 1099 1778:ldc1            #29  <Int 0>
		// 1100 1780:castore         
		// 1101 1781:dup             
		// 1102 1782:bipush          16
		// 1103 1784:ldc1            #29  <Int 0>
		// 1104 1786:castore         
		// 1105 1787:dup             
		// 1106 1788:bipush          17
		// 1107 1790:ldc1            #29  <Int 0>
		// 1108 1792:castore         
		// 1109 1793:dup             
		// 1110 1794:bipush          18
		// 1111 1796:ldc1            #29  <Int 0>
		// 1112 1798:castore         
		// 1113 1799:dup             
		// 1114 1800:bipush          19
		// 1115 1802:ldc1            #29  <Int 0>
		// 1116 1804:castore         
		// 1117 1805:dup             
		// 1118 1806:bipush          20
		// 1119 1808:ldc1            #29  <Int 0>
		// 1120 1810:castore         
		// 1121 1811:dup             
		// 1122 1812:bipush          21
		// 1123 1814:ldc1            #29  <Int 0>
		// 1124 1816:castore         
		// 1125 1817:dup             
		// 1126 1818:bipush          22
		// 1127 1820:ldc1            #29  <Int 0>
		// 1128 1822:castore         
		// 1129 1823:dup             
		// 1130 1824:bipush          23
		// 1131 1826:ldc1            #29  <Int 0>
		// 1132 1828:castore         
		// 1133 1829:dup             
		// 1134 1830:bipush          24
		// 1135 1832:ldc1            #29  <Int 0>
		// 1136 1834:castore         
		// 1137 1835:dup             
		// 1138 1836:bipush          25
		// 1139 1838:ldc1            #29  <Int 0>
		// 1140 1840:castore         
		// 1141 1841:dup             
		// 1142 1842:bipush          26
		// 1143 1844:ldc1            #29  <Int 0>
		// 1144 1846:castore         
		// 1145 1847:dup             
		// 1146 1848:bipush          27
		// 1147 1850:ldc1            #29  <Int 0>
		// 1148 1852:castore         
		// 1149 1853:dup             
		// 1150 1854:bipush          28
		// 1151 1856:ldc1            #29  <Int 0>
		// 1152 1858:castore         
		// 1153 1859:dup             
		// 1154 1860:bipush          29
		// 1155 1862:ldc1            #29  <Int 0>
		// 1156 1864:castore         
		// 1157 1865:dup             
		// 1158 1866:bipush          30
		// 1159 1868:ldc1            #29  <Int 0>
		// 1160 1870:castore         
		// 1161 1871:dup             
		// 1162 1872:bipush          31
		// 1163 1874:ldc1            #29  <Int 0>
		// 1164 1876:castore         
		// 1165 1877:dup             
		// 1166 1878:bipush          32
		// 1167 1880:ldc1            #30  <Int 32>
		// 1168 1882:castore         
		// 1169 1883:dup             
		// 1170 1884:bipush          33
		// 1171 1886:ldc1            #218 <Int 9985>
		// 1172 1888:castore         
		// 1173 1889:dup             
		// 1174 1890:bipush          34
		// 1175 1892:ldc1            #219 <Int 9986>
		// 1176 1894:castore         
		// 1177 1895:dup             
		// 1178 1896:bipush          35
		// 1179 1898:ldc1            #220 <Int 9987>
		// 1180 1900:castore         
		// 1181 1901:dup             
		// 1182 1902:bipush          36
		// 1183 1904:ldc1            #221 <Int 9988>
		// 1184 1906:castore         
		// 1185 1907:dup             
		// 1186 1908:bipush          37
		// 1187 1910:ldc1            #222 <Int 9742>
		// 1188 1912:castore         
		// 1189 1913:dup             
		// 1190 1914:bipush          38
		// 1191 1916:ldc1            #223 <Int 9990>
		// 1192 1918:castore         
		// 1193 1919:dup             
		// 1194 1920:bipush          39
		// 1195 1922:ldc1            #224 <Int 9991>
		// 1196 1924:castore         
		// 1197 1925:dup             
		// 1198 1926:bipush          40
		// 1199 1928:ldc1            #225 <Int 9992>
		// 1200 1930:castore         
		// 1201 1931:dup             
		// 1202 1932:bipush          41
		// 1203 1934:ldc1            #226 <Int 9993>
		// 1204 1936:castore         
		// 1205 1937:dup             
		// 1206 1938:bipush          42
		// 1207 1940:ldc1            #227 <Int 9755>
		// 1208 1942:castore         
		// 1209 1943:dup             
		// 1210 1944:bipush          43
		// 1211 1946:ldc1            #228 <Int 9758>
		// 1212 1948:castore         
		// 1213 1949:dup             
		// 1214 1950:bipush          44
		// 1215 1952:ldc1            #229 <Int 9996>
		// 1216 1954:castore         
		// 1217 1955:dup             
		// 1218 1956:bipush          45
		// 1219 1958:ldc1            #230 <Int 9997>
		// 1220 1960:castore         
		// 1221 1961:dup             
		// 1222 1962:bipush          46
		// 1223 1964:ldc1            #231 <Int 9998>
		// 1224 1966:castore         
		// 1225 1967:dup             
		// 1226 1968:bipush          47
		// 1227 1970:ldc1            #232 <Int 9999>
		// 1228 1972:castore         
		// 1229 1973:dup             
		// 1230 1974:bipush          48
		// 1231 1976:ldc1            #233 <Int 10000>
		// 1232 1978:castore         
		// 1233 1979:dup             
		// 1234 1980:bipush          49
		// 1235 1982:ldc1            #234 <Int 10001>
		// 1236 1984:castore         
		// 1237 1985:dup             
		// 1238 1986:bipush          50
		// 1239 1988:ldc1            #235 <Int 10002>
		// 1240 1990:castore         
		// 1241 1991:dup             
		// 1242 1992:bipush          51
		// 1243 1994:ldc1            #236 <Int 10003>
		// 1244 1996:castore         
		// 1245 1997:dup             
		// 1246 1998:bipush          52
		// 1247 2000:ldc1            #237 <Int 10004>
		// 1248 2002:castore         
		// 1249 2003:dup             
		// 1250 2004:bipush          53
		// 1251 2006:ldc1            #238 <Int 10005>
		// 1252 2008:castore         
		// 1253 2009:dup             
		// 1254 2010:bipush          54
		// 1255 2012:ldc1            #239 <Int 10006>
		// 1256 2014:castore         
		// 1257 2015:dup             
		// 1258 2016:bipush          55
		// 1259 2018:ldc1            #240 <Int 10007>
		// 1260 2020:castore         
		// 1261 2021:dup             
		// 1262 2022:bipush          56
		// 1263 2024:ldc1            #241 <Int 10008>
		// 1264 2026:castore         
		// 1265 2027:dup             
		// 1266 2028:bipush          57
		// 1267 2030:ldc1            #242 <Int 10009>
		// 1268 2032:castore         
		// 1269 2033:dup             
		// 1270 2034:bipush          58
		// 1271 2036:ldc1            #243 <Int 10010>
		// 1272 2038:castore         
		// 1273 2039:dup             
		// 1274 2040:bipush          59
		// 1275 2042:ldc1            #244 <Int 10011>
		// 1276 2044:castore         
		// 1277 2045:dup             
		// 1278 2046:bipush          60
		// 1279 2048:ldc1            #245 <Int 10012>
		// 1280 2050:castore         
		// 1281 2051:dup             
		// 1282 2052:bipush          61
		// 1283 2054:ldc1            #246 <Int 10013>
		// 1284 2056:castore         
		// 1285 2057:dup             
		// 1286 2058:bipush          62
		// 1287 2060:ldc1            #247 <Int 10014>
		// 1288 2062:castore         
		// 1289 2063:dup             
		// 1290 2064:bipush          63
		// 1291 2066:ldc1            #248 <Int 10015>
		// 1292 2068:castore         
		// 1293 2069:dup             
		// 1294 2070:bipush          64
		// 1295 2072:ldc1            #249 <Int 10016>
		// 1296 2074:castore         
		// 1297 2075:dup             
		// 1298 2076:bipush          65
		// 1299 2078:ldc1            #250 <Int 10017>
		// 1300 2080:castore         
		// 1301 2081:dup             
		// 1302 2082:bipush          66
		// 1303 2084:ldc1            #251 <Int 10018>
		// 1304 2086:castore         
		// 1305 2087:dup             
		// 1306 2088:bipush          67
		// 1307 2090:ldc1            #252 <Int 10019>
		// 1308 2092:castore         
		// 1309 2093:dup             
		// 1310 2094:bipush          68
		// 1311 2096:ldc1            #253 <Int 10020>
		// 1312 2098:castore         
		// 1313 2099:dup             
		// 1314 2100:bipush          69
		// 1315 2102:ldc1            #254 <Int 10021>
		// 1316 2104:castore         
		// 1317 2105:dup             
		// 1318 2106:bipush          70
		// 1319 2108:ldc1            #255 <Int 10022>
		// 1320 2110:castore         
		// 1321 2111:dup             
		// 1322 2112:bipush          71
		// 1323 2114:ldc2            #256 <Int 10023>
		// 1324 2117:castore         
		// 1325 2118:dup             
		// 1326 2119:bipush          72
		// 1327 2121:ldc2            #257 <Int 9733>
		// 1328 2124:castore         
		// 1329 2125:dup             
		// 1330 2126:bipush          73
		// 1331 2128:ldc2            #258 <Int 10025>
		// 1332 2131:castore         
		// 1333 2132:dup             
		// 1334 2133:bipush          74
		// 1335 2135:ldc2            #259 <Int 10026>
		// 1336 2138:castore         
		// 1337 2139:dup             
		// 1338 2140:bipush          75
		// 1339 2142:ldc2            #260 <Int 10027>
		// 1340 2145:castore         
		// 1341 2146:dup             
		// 1342 2147:bipush          76
		// 1343 2149:ldc2            #261 <Int 10028>
		// 1344 2152:castore         
		// 1345 2153:dup             
		// 1346 2154:bipush          77
		// 1347 2156:ldc2            #262 <Int 10029>
		// 1348 2159:castore         
		// 1349 2160:dup             
		// 1350 2161:bipush          78
		// 1351 2163:ldc2            #263 <Int 10030>
		// 1352 2166:castore         
		// 1353 2167:dup             
		// 1354 2168:bipush          79
		// 1355 2170:ldc2            #264 <Int 10031>
		// 1356 2173:castore         
		// 1357 2174:dup             
		// 1358 2175:bipush          80
		// 1359 2177:ldc2            #265 <Int 10032>
		// 1360 2180:castore         
		// 1361 2181:dup             
		// 1362 2182:bipush          81
		// 1363 2184:ldc2            #266 <Int 10033>
		// 1364 2187:castore         
		// 1365 2188:dup             
		// 1366 2189:bipush          82
		// 1367 2191:ldc2            #267 <Int 10034>
		// 1368 2194:castore         
		// 1369 2195:dup             
		// 1370 2196:bipush          83
		// 1371 2198:ldc2            #268 <Int 10035>
		// 1372 2201:castore         
		// 1373 2202:dup             
		// 1374 2203:bipush          84
		// 1375 2205:ldc2            #269 <Int 10036>
		// 1376 2208:castore         
		// 1377 2209:dup             
		// 1378 2210:bipush          85
		// 1379 2212:ldc2            #270 <Int 10037>
		// 1380 2215:castore         
		// 1381 2216:dup             
		// 1382 2217:bipush          86
		// 1383 2219:ldc2            #271 <Int 10038>
		// 1384 2222:castore         
		// 1385 2223:dup             
		// 1386 2224:bipush          87
		// 1387 2226:ldc2            #272 <Int 10039>
		// 1388 2229:castore         
		// 1389 2230:dup             
		// 1390 2231:bipush          88
		// 1391 2233:ldc2            #273 <Int 10040>
		// 1392 2236:castore         
		// 1393 2237:dup             
		// 1394 2238:bipush          89
		// 1395 2240:ldc2            #274 <Int 10041>
		// 1396 2243:castore         
		// 1397 2244:dup             
		// 1398 2245:bipush          90
		// 1399 2247:ldc2            #275 <Int 10042>
		// 1400 2250:castore         
		// 1401 2251:dup             
		// 1402 2252:bipush          91
		// 1403 2254:ldc2            #276 <Int 10043>
		// 1404 2257:castore         
		// 1405 2258:dup             
		// 1406 2259:bipush          92
		// 1407 2261:ldc2            #277 <Int 10044>
		// 1408 2264:castore         
		// 1409 2265:dup             
		// 1410 2266:bipush          93
		// 1411 2268:ldc2            #278 <Int 10045>
		// 1412 2271:castore         
		// 1413 2272:dup             
		// 1414 2273:bipush          94
		// 1415 2275:ldc2            #279 <Int 10046>
		// 1416 2278:castore         
		// 1417 2279:dup             
		// 1418 2280:bipush          95
		// 1419 2282:ldc2            #280 <Int 10047>
		// 1420 2285:castore         
		// 1421 2286:dup             
		// 1422 2287:bipush          96
		// 1423 2289:ldc2            #281 <Int 10048>
		// 1424 2292:castore         
		// 1425 2293:dup             
		// 1426 2294:bipush          97
		// 1427 2296:ldc2            #282 <Int 10049>
		// 1428 2299:castore         
		// 1429 2300:dup             
		// 1430 2301:bipush          98
		// 1431 2303:ldc2            #283 <Int 10050>
		// 1432 2306:castore         
		// 1433 2307:dup             
		// 1434 2308:bipush          99
		// 1435 2310:ldc2            #284 <Int 10051>
		// 1436 2313:castore         
		// 1437 2314:dup             
		// 1438 2315:bipush          100
		// 1439 2317:ldc2            #285 <Int 10052>
		// 1440 2320:castore         
		// 1441 2321:dup             
		// 1442 2322:bipush          101
		// 1443 2324:ldc2            #286 <Int 10053>
		// 1444 2327:castore         
		// 1445 2328:dup             
		// 1446 2329:bipush          102
		// 1447 2331:ldc2            #287 <Int 10054>
		// 1448 2334:castore         
		// 1449 2335:dup             
		// 1450 2336:bipush          103
		// 1451 2338:ldc2            #288 <Int 10055>
		// 1452 2341:castore         
		// 1453 2342:dup             
		// 1454 2343:bipush          104
		// 1455 2345:ldc2            #289 <Int 10056>
		// 1456 2348:castore         
		// 1457 2349:dup             
		// 1458 2350:bipush          105
		// 1459 2352:ldc2            #290 <Int 10057>
		// 1460 2355:castore         
		// 1461 2356:dup             
		// 1462 2357:bipush          106
		// 1463 2359:ldc2            #291 <Int 10058>
		// 1464 2362:castore         
		// 1465 2363:dup             
		// 1466 2364:bipush          107
		// 1467 2366:ldc2            #292 <Int 10059>
		// 1468 2369:castore         
		// 1469 2370:dup             
		// 1470 2371:bipush          108
		// 1471 2373:ldc2            #293 <Int 9679>
		// 1472 2376:castore         
		// 1473 2377:dup             
		// 1474 2378:bipush          109
		// 1475 2380:ldc2            #294 <Int 10061>
		// 1476 2383:castore         
		// 1477 2384:dup             
		// 1478 2385:bipush          110
		// 1479 2387:ldc2            #295 <Int 9632>
		// 1480 2390:castore         
		// 1481 2391:dup             
		// 1482 2392:bipush          111
		// 1483 2394:ldc2            #296 <Int 10063>
		// 1484 2397:castore         
		// 1485 2398:dup             
		// 1486 2399:bipush          112
		// 1487 2401:ldc2            #297 <Int 10064>
		// 1488 2404:castore         
		// 1489 2405:dup             
		// 1490 2406:bipush          113
		// 1491 2408:ldc2            #298 <Int 10065>
		// 1492 2411:castore         
		// 1493 2412:dup             
		// 1494 2413:bipush          114
		// 1495 2415:ldc2            #299 <Int 10066>
		// 1496 2418:castore         
		// 1497 2419:dup             
		// 1498 2420:bipush          115
		// 1499 2422:ldc2            #300 <Int 9650>
		// 1500 2425:castore         
		// 1501 2426:dup             
		// 1502 2427:bipush          116
		// 1503 2429:ldc2            #301 <Int 9660>
		// 1504 2432:castore         
		// 1505 2433:dup             
		// 1506 2434:bipush          117
		// 1507 2436:ldc2            #302 <Int 9670>
		// 1508 2439:castore         
		// 1509 2440:dup             
		// 1510 2441:bipush          118
		// 1511 2443:ldc2            #303 <Int 10070>
		// 1512 2446:castore         
		// 1513 2447:dup             
		// 1514 2448:bipush          119
		// 1515 2450:ldc2            #304 <Int 9687>
		// 1516 2453:castore         
		// 1517 2454:dup             
		// 1518 2455:bipush          120
		// 1519 2457:ldc2            #305 <Int 10072>
		// 1520 2460:castore         
		// 1521 2461:dup             
		// 1522 2462:bipush          121
		// 1523 2464:ldc2            #306 <Int 10073>
		// 1524 2467:castore         
		// 1525 2468:dup             
		// 1526 2469:bipush          122
		// 1527 2471:ldc2            #307 <Int 10074>
		// 1528 2474:castore         
		// 1529 2475:dup             
		// 1530 2476:bipush          123
		// 1531 2478:ldc2            #308 <Int 10075>
		// 1532 2481:castore         
		// 1533 2482:dup             
		// 1534 2483:bipush          124
		// 1535 2485:ldc2            #309 <Int 10076>
		// 1536 2488:castore         
		// 1537 2489:dup             
		// 1538 2490:bipush          125
		// 1539 2492:ldc2            #310 <Int 10077>
		// 1540 2495:castore         
		// 1541 2496:dup             
		// 1542 2497:bipush          126
		// 1543 2499:ldc2            #311 <Int 10078>
		// 1544 2502:castore         
		// 1545 2503:dup             
		// 1546 2504:bipush          127
		// 1547 2506:ldc1            #29  <Int 0>
		// 1548 2508:castore         
		// 1549 2509:dup             
		// 1550 2510:sipush          128
		// 1551 2513:ldc1            #29  <Int 0>
		// 1552 2515:castore         
		// 1553 2516:dup             
		// 1554 2517:sipush          129
		// 1555 2520:ldc1            #29  <Int 0>
		// 1556 2522:castore         
		// 1557 2523:dup             
		// 1558 2524:sipush          130
		// 1559 2527:ldc1            #29  <Int 0>
		// 1560 2529:castore         
		// 1561 2530:dup             
		// 1562 2531:sipush          131
		// 1563 2534:ldc1            #29  <Int 0>
		// 1564 2536:castore         
		// 1565 2537:dup             
		// 1566 2538:sipush          132
		// 1567 2541:ldc1            #29  <Int 0>
		// 1568 2543:castore         
		// 1569 2544:dup             
		// 1570 2545:sipush          133
		// 1571 2548:ldc1            #29  <Int 0>
		// 1572 2550:castore         
		// 1573 2551:dup             
		// 1574 2552:sipush          134
		// 1575 2555:ldc1            #29  <Int 0>
		// 1576 2557:castore         
		// 1577 2558:dup             
		// 1578 2559:sipush          135
		// 1579 2562:ldc1            #29  <Int 0>
		// 1580 2564:castore         
		// 1581 2565:dup             
		// 1582 2566:sipush          136
		// 1583 2569:ldc1            #29  <Int 0>
		// 1584 2571:castore         
		// 1585 2572:dup             
		// 1586 2573:sipush          137
		// 1587 2576:ldc1            #29  <Int 0>
		// 1588 2578:castore         
		// 1589 2579:dup             
		// 1590 2580:sipush          138
		// 1591 2583:ldc1            #29  <Int 0>
		// 1592 2585:castore         
		// 1593 2586:dup             
		// 1594 2587:sipush          139
		// 1595 2590:ldc1            #29  <Int 0>
		// 1596 2592:castore         
		// 1597 2593:dup             
		// 1598 2594:sipush          140
		// 1599 2597:ldc1            #29  <Int 0>
		// 1600 2599:castore         
		// 1601 2600:dup             
		// 1602 2601:sipush          141
		// 1603 2604:ldc1            #29  <Int 0>
		// 1604 2606:castore         
		// 1605 2607:dup             
		// 1606 2608:sipush          142
		// 1607 2611:ldc1            #29  <Int 0>
		// 1608 2613:castore         
		// 1609 2614:dup             
		// 1610 2615:sipush          143
		// 1611 2618:ldc1            #29  <Int 0>
		// 1612 2620:castore         
		// 1613 2621:dup             
		// 1614 2622:sipush          144
		// 1615 2625:ldc1            #29  <Int 0>
		// 1616 2627:castore         
		// 1617 2628:dup             
		// 1618 2629:sipush          145
		// 1619 2632:ldc1            #29  <Int 0>
		// 1620 2634:castore         
		// 1621 2635:dup             
		// 1622 2636:sipush          146
		// 1623 2639:ldc1            #29  <Int 0>
		// 1624 2641:castore         
		// 1625 2642:dup             
		// 1626 2643:sipush          147
		// 1627 2646:ldc1            #29  <Int 0>
		// 1628 2648:castore         
		// 1629 2649:dup             
		// 1630 2650:sipush          148
		// 1631 2653:ldc1            #29  <Int 0>
		// 1632 2655:castore         
		// 1633 2656:dup             
		// 1634 2657:sipush          149
		// 1635 2660:ldc1            #29  <Int 0>
		// 1636 2662:castore         
		// 1637 2663:dup             
		// 1638 2664:sipush          150
		// 1639 2667:ldc1            #29  <Int 0>
		// 1640 2669:castore         
		// 1641 2670:dup             
		// 1642 2671:sipush          151
		// 1643 2674:ldc1            #29  <Int 0>
		// 1644 2676:castore         
		// 1645 2677:dup             
		// 1646 2678:sipush          152
		// 1647 2681:ldc1            #29  <Int 0>
		// 1648 2683:castore         
		// 1649 2684:dup             
		// 1650 2685:sipush          153
		// 1651 2688:ldc1            #29  <Int 0>
		// 1652 2690:castore         
		// 1653 2691:dup             
		// 1654 2692:sipush          154
		// 1655 2695:ldc1            #29  <Int 0>
		// 1656 2697:castore         
		// 1657 2698:dup             
		// 1658 2699:sipush          155
		// 1659 2702:ldc1            #29  <Int 0>
		// 1660 2704:castore         
		// 1661 2705:dup             
		// 1662 2706:sipush          156
		// 1663 2709:ldc1            #29  <Int 0>
		// 1664 2711:castore         
		// 1665 2712:dup             
		// 1666 2713:sipush          157
		// 1667 2716:ldc1            #29  <Int 0>
		// 1668 2718:castore         
		// 1669 2719:dup             
		// 1670 2720:sipush          158
		// 1671 2723:ldc1            #29  <Int 0>
		// 1672 2725:castore         
		// 1673 2726:dup             
		// 1674 2727:sipush          159
		// 1675 2730:ldc1            #29  <Int 0>
		// 1676 2732:castore         
		// 1677 2733:dup             
		// 1678 2734:sipush          160
		// 1679 2737:ldc1            #29  <Int 0>
		// 1680 2739:castore         
		// 1681 2740:dup             
		// 1682 2741:sipush          161
		// 1683 2744:ldc2            #312 <Int 10081>
		// 1684 2747:castore         
		// 1685 2748:dup             
		// 1686 2749:sipush          162
		// 1687 2752:ldc2            #313 <Int 10082>
		// 1688 2755:castore         
		// 1689 2756:dup             
		// 1690 2757:sipush          163
		// 1691 2760:ldc2            #314 <Int 10083>
		// 1692 2763:castore         
		// 1693 2764:dup             
		// 1694 2765:sipush          164
		// 1695 2768:ldc2            #315 <Int 10084>
		// 1696 2771:castore         
		// 1697 2772:dup             
		// 1698 2773:sipush          165
		// 1699 2776:ldc2            #316 <Int 10085>
		// 1700 2779:castore         
		// 1701 2780:dup             
		// 1702 2781:sipush          166
		// 1703 2784:ldc2            #317 <Int 10086>
		// 1704 2787:castore         
		// 1705 2788:dup             
		// 1706 2789:sipush          167
		// 1707 2792:ldc2            #318 <Int 10087>
		// 1708 2795:castore         
		// 1709 2796:dup             
		// 1710 2797:sipush          168
		// 1711 2800:ldc1            #132 <Int 9827>
		// 1712 2802:castore         
		// 1713 2803:dup             
		// 1714 2804:sipush          169
		// 1715 2807:ldc1            #133 <Int 9830>
		// 1716 2809:castore         
		// 1717 2810:dup             
		// 1718 2811:sipush          170
		// 1719 2814:ldc1            #134 <Int 9829>
		// 1720 2816:castore         
		// 1721 2817:dup             
		// 1722 2818:sipush          171
		// 1723 2821:ldc1            #135 <Int 9824>
		// 1724 2823:castore         
		// 1725 2824:dup             
		// 1726 2825:sipush          172
		// 1727 2828:ldc2            #319 <Int 9312>
		// 1728 2831:castore         
		// 1729 2832:dup             
		// 1730 2833:sipush          173
		// 1731 2836:ldc2            #320 <Int 9313>
		// 1732 2839:castore         
		// 1733 2840:dup             
		// 1734 2841:sipush          174
		// 1735 2844:ldc2            #321 <Int 9314>
		// 1736 2847:castore         
		// 1737 2848:dup             
		// 1738 2849:sipush          175
		// 1739 2852:ldc2            #322 <Int 9315>
		// 1740 2855:castore         
		// 1741 2856:dup             
		// 1742 2857:sipush          176
		// 1743 2860:ldc2            #323 <Int 9316>
		// 1744 2863:castore         
		// 1745 2864:dup             
		// 1746 2865:sipush          177
		// 1747 2868:ldc2            #324 <Int 9317>
		// 1748 2871:castore         
		// 1749 2872:dup             
		// 1750 2873:sipush          178
		// 1751 2876:ldc2            #325 <Int 9318>
		// 1752 2879:castore         
		// 1753 2880:dup             
		// 1754 2881:sipush          179
		// 1755 2884:ldc2            #326 <Int 9319>
		// 1756 2887:castore         
		// 1757 2888:dup             
		// 1758 2889:sipush          180
		// 1759 2892:ldc2            #327 <Int 9320>
		// 1760 2895:castore         
		// 1761 2896:dup             
		// 1762 2897:sipush          181
		// 1763 2900:ldc2            #328 <Int 9321>
		// 1764 2903:castore         
		// 1765 2904:dup             
		// 1766 2905:sipush          182
		// 1767 2908:ldc2            #329 <Int 10102>
		// 1768 2911:castore         
		// 1769 2912:dup             
		// 1770 2913:sipush          183
		// 1771 2916:ldc2            #330 <Int 10103>
		// 1772 2919:castore         
		// 1773 2920:dup             
		// 1774 2921:sipush          184
		// 1775 2924:ldc2            #331 <Int 10104>
		// 1776 2927:castore         
		// 1777 2928:dup             
		// 1778 2929:sipush          185
		// 1779 2932:ldc2            #332 <Int 10105>
		// 1780 2935:castore         
		// 1781 2936:dup             
		// 1782 2937:sipush          186
		// 1783 2940:ldc2            #333 <Int 10106>
		// 1784 2943:castore         
		// 1785 2944:dup             
		// 1786 2945:sipush          187
		// 1787 2948:ldc2            #334 <Int 10107>
		// 1788 2951:castore         
		// 1789 2952:dup             
		// 1790 2953:sipush          188
		// 1791 2956:ldc2            #335 <Int 10108>
		// 1792 2959:castore         
		// 1793 2960:dup             
		// 1794 2961:sipush          189
		// 1795 2964:ldc2            #336 <Int 10109>
		// 1796 2967:castore         
		// 1797 2968:dup             
		// 1798 2969:sipush          190
		// 1799 2972:ldc2            #337 <Int 10110>
		// 1800 2975:castore         
		// 1801 2976:dup             
		// 1802 2977:sipush          191
		// 1803 2980:ldc2            #338 <Int 10111>
		// 1804 2983:castore         
		// 1805 2984:dup             
		// 1806 2985:sipush          192
		// 1807 2988:ldc2            #339 <Int 10112>
		// 1808 2991:castore         
		// 1809 2992:dup             
		// 1810 2993:sipush          193
		// 1811 2996:ldc2            #340 <Int 10113>
		// 1812 2999:castore         
		// 1813 3000:dup             
		// 1814 3001:sipush          194
		// 1815 3004:ldc2            #341 <Int 10114>
		// 1816 3007:castore         
		// 1817 3008:dup             
		// 1818 3009:sipush          195
		// 1819 3012:ldc2            #342 <Int 10115>
		// 1820 3015:castore         
		// 1821 3016:dup             
		// 1822 3017:sipush          196
		// 1823 3020:ldc2            #343 <Int 10116>
		// 1824 3023:castore         
		// 1825 3024:dup             
		// 1826 3025:sipush          197
		// 1827 3028:ldc2            #344 <Int 10117>
		// 1828 3031:castore         
		// 1829 3032:dup             
		// 1830 3033:sipush          198
		// 1831 3036:ldc2            #345 <Int 10118>
		// 1832 3039:castore         
		// 1833 3040:dup             
		// 1834 3041:sipush          199
		// 1835 3044:ldc2            #346 <Int 10119>
		// 1836 3047:castore         
		// 1837 3048:dup             
		// 1838 3049:sipush          200
		// 1839 3052:ldc2            #347 <Int 10120>
		// 1840 3055:castore         
		// 1841 3056:dup             
		// 1842 3057:sipush          201
		// 1843 3060:ldc2            #348 <Int 10121>
		// 1844 3063:castore         
		// 1845 3064:dup             
		// 1846 3065:sipush          202
		// 1847 3068:ldc2            #349 <Int 10122>
		// 1848 3071:castore         
		// 1849 3072:dup             
		// 1850 3073:sipush          203
		// 1851 3076:ldc2            #350 <Int 10123>
		// 1852 3079:castore         
		// 1853 3080:dup             
		// 1854 3081:sipush          204
		// 1855 3084:ldc2            #351 <Int 10124>
		// 1856 3087:castore         
		// 1857 3088:dup             
		// 1858 3089:sipush          205
		// 1859 3092:ldc2            #352 <Int 10125>
		// 1860 3095:castore         
		// 1861 3096:dup             
		// 1862 3097:sipush          206
		// 1863 3100:ldc2            #353 <Int 10126>
		// 1864 3103:castore         
		// 1865 3104:dup             
		// 1866 3105:sipush          207
		// 1867 3108:ldc2            #354 <Int 10127>
		// 1868 3111:castore         
		// 1869 3112:dup             
		// 1870 3113:sipush          208
		// 1871 3116:ldc2            #355 <Int 10128>
		// 1872 3119:castore         
		// 1873 3120:dup             
		// 1874 3121:sipush          209
		// 1875 3124:ldc2            #356 <Int 10129>
		// 1876 3127:castore         
		// 1877 3128:dup             
		// 1878 3129:sipush          210
		// 1879 3132:ldc2            #357 <Int 10130>
		// 1880 3135:castore         
		// 1881 3136:dup             
		// 1882 3137:sipush          211
		// 1883 3140:ldc2            #358 <Int 10131>
		// 1884 3143:castore         
		// 1885 3144:dup             
		// 1886 3145:sipush          212
		// 1887 3148:ldc2            #359 <Int 10132>
		// 1888 3151:castore         
		// 1889 3152:dup             
		// 1890 3153:sipush          213
		// 1891 3156:ldc1            #139 <Int 8594>
		// 1892 3158:castore         
		// 1893 3159:dup             
		// 1894 3160:sipush          214
		// 1895 3163:ldc1            #136 <Int 8596>
		// 1896 3165:castore         
		// 1897 3166:dup             
		// 1898 3167:sipush          215
		// 1899 3170:ldc2            #360 <Int 8597>
		// 1900 3173:castore         
		// 1901 3174:dup             
		// 1902 3175:sipush          216
		// 1903 3178:ldc2            #361 <Int 10136>
		// 1904 3181:castore         
		// 1905 3182:dup             
		// 1906 3183:sipush          217
		// 1907 3186:ldc2            #362 <Int 10137>
		// 1908 3189:castore         
		// 1909 3190:dup             
		// 1910 3191:sipush          218
		// 1911 3194:ldc2            #363 <Int 10138>
		// 1912 3197:castore         
		// 1913 3198:dup             
		// 1914 3199:sipush          219
		// 1915 3202:ldc2            #364 <Int 10139>
		// 1916 3205:castore         
		// 1917 3206:dup             
		// 1918 3207:sipush          220
		// 1919 3210:ldc2            #365 <Int 10140>
		// 1920 3213:castore         
		// 1921 3214:dup             
		// 1922 3215:sipush          221
		// 1923 3218:ldc2            #366 <Int 10141>
		// 1924 3221:castore         
		// 1925 3222:dup             
		// 1926 3223:sipush          222
		// 1927 3226:ldc2            #367 <Int 10142>
		// 1928 3229:castore         
		// 1929 3230:dup             
		// 1930 3231:sipush          223
		// 1931 3234:ldc2            #368 <Int 10143>
		// 1932 3237:castore         
		// 1933 3238:dup             
		// 1934 3239:sipush          224
		// 1935 3242:ldc2            #369 <Int 10144>
		// 1936 3245:castore         
		// 1937 3246:dup             
		// 1938 3247:sipush          225
		// 1939 3250:ldc2            #370 <Int 10145>
		// 1940 3253:castore         
		// 1941 3254:dup             
		// 1942 3255:sipush          226
		// 1943 3258:ldc2            #371 <Int 10146>
		// 1944 3261:castore         
		// 1945 3262:dup             
		// 1946 3263:sipush          227
		// 1947 3266:ldc2            #372 <Int 10147>
		// 1948 3269:castore         
		// 1949 3270:dup             
		// 1950 3271:sipush          228
		// 1951 3274:ldc2            #373 <Int 10148>
		// 1952 3277:castore         
		// 1953 3278:dup             
		// 1954 3279:sipush          229
		// 1955 3282:ldc2            #374 <Int 10149>
		// 1956 3285:castore         
		// 1957 3286:dup             
		// 1958 3287:sipush          230
		// 1959 3290:ldc2            #375 <Int 10150>
		// 1960 3293:castore         
		// 1961 3294:dup             
		// 1962 3295:sipush          231
		// 1963 3298:ldc2            #376 <Int 10151>
		// 1964 3301:castore         
		// 1965 3302:dup             
		// 1966 3303:sipush          232
		// 1967 3306:ldc2            #377 <Int 10152>
		// 1968 3309:castore         
		// 1969 3310:dup             
		// 1970 3311:sipush          233
		// 1971 3314:ldc2            #378 <Int 10153>
		// 1972 3317:castore         
		// 1973 3318:dup             
		// 1974 3319:sipush          234
		// 1975 3322:ldc2            #379 <Int 10154>
		// 1976 3325:castore         
		// 1977 3326:dup             
		// 1978 3327:sipush          235
		// 1979 3330:ldc2            #380 <Int 10155>
		// 1980 3333:castore         
		// 1981 3334:dup             
		// 1982 3335:sipush          236
		// 1983 3338:ldc2            #381 <Int 10156>
		// 1984 3341:castore         
		// 1985 3342:dup             
		// 1986 3343:sipush          237
		// 1987 3346:ldc2            #382 <Int 10157>
		// 1988 3349:castore         
		// 1989 3350:dup             
		// 1990 3351:sipush          238
		// 1991 3354:ldc2            #383 <Int 10158>
		// 1992 3357:castore         
		// 1993 3358:dup             
		// 1994 3359:sipush          239
		// 1995 3362:ldc2            #384 <Int 10159>
		// 1996 3365:castore         
		// 1997 3366:dup             
		// 1998 3367:sipush          240
		// 1999 3370:ldc1            #29  <Int 0>
		// 2000 3372:castore         
		// 2001 3373:dup             
		// 2002 3374:sipush          241
		// 2003 3377:ldc2            #385 <Int 10161>
		// 2004 3380:castore         
		// 2005 3381:dup             
		// 2006 3382:sipush          242
		// 2007 3385:ldc2            #386 <Int 10162>
		// 2008 3388:castore         
		// 2009 3389:dup             
		// 2010 3390:sipush          243
		// 2011 3393:ldc2            #387 <Int 10163>
		// 2012 3396:castore         
		// 2013 3397:dup             
		// 2014 3398:sipush          244
		// 2015 3401:ldc2            #388 <Int 10164>
		// 2016 3404:castore         
		// 2017 3405:dup             
		// 2018 3406:sipush          245
		// 2019 3409:ldc2            #389 <Int 10165>
		// 2020 3412:castore         
		// 2021 3413:dup             
		// 2022 3414:sipush          246
		// 2023 3417:ldc2            #390 <Int 10166>
		// 2024 3420:castore         
		// 2025 3421:dup             
		// 2026 3422:sipush          247
		// 2027 3425:ldc2            #391 <Int 10167>
		// 2028 3428:castore         
		// 2029 3429:dup             
		// 2030 3430:sipush          248
		// 2031 3433:ldc2            #392 <Int 10168>
		// 2032 3436:castore         
		// 2033 3437:dup             
		// 2034 3438:sipush          249
		// 2035 3441:ldc2            #393 <Int 10169>
		// 2036 3444:castore         
		// 2037 3445:dup             
		// 2038 3446:sipush          250
		// 2039 3449:ldc2            #394 <Int 10170>
		// 2040 3452:castore         
		// 2041 3453:dup             
		// 2042 3454:sipush          251
		// 2043 3457:ldc2            #395 <Int 10171>
		// 2044 3460:castore         
		// 2045 3461:dup             
		// 2046 3462:sipush          252
		// 2047 3465:ldc2            #396 <Int 10172>
		// 2048 3468:castore         
		// 2049 3469:dup             
		// 2050 3470:sipush          253
		// 2051 3473:ldc2            #397 <Int 10173>
		// 2052 3476:castore         
		// 2053 3477:dup             
		// 2054 3478:sipush          254
		// 2055 3481:ldc2            #398 <Int 10174>
		// 2056 3484:castore         
		// 2057 3485:dup             
		// 2058 3486:sipush          255
		// 2059 3489:ldc1            #29  <Int 0>
		// 2060 3491:castore         
		// 2061 3492:putstatic       #400 <Field char[] table2>
			for(int i = 0; i < 256; i++)
		//*2062 3495:iconst_0        
		//*2063 3496:istore_0        
		//*2064 3497:iload_0         
		//*2065 3498:sipush          256
		//*2066 3501:icmpge          3530
			{
				char c = table1[i];
		// 2067 3504:getstatic       #217 <Field char[] table1>
		// 2068 3507:iload_0         
		// 2069 3508:caload          
		// 2070 3509:istore_1        
				if(c != 0)
		//*2071 3510:iload_1         
		//*2072 3511:ifeq            3523
					t1.put(((int) (c)), i);
		// 2073 3514:getstatic       #26  <Field IntHashtable t1>
		// 2074 3517:iload_1         
		// 2075 3518:iload_0         
		// 2076 3519:invokevirtual   #404 <Method int IntHashtable.put(int, int)>
		// 2077 3522:pop             
			}

		// 2078 3523:iload_0         
		// 2079 3524:iconst_1        
		// 2080 3525:iadd            
		// 2081 3526:istore_0        
		//*2082 3527:goto            3497
			for(int j = 0; j < 256; j++)
		//*2083 3530:iconst_0        
		//*2084 3531:istore_0        
		//*2085 3532:iload_0         
		//*2086 3533:sipush          256
		//*2087 3536:icmpge          3565
			{
				char c1 = table2[j];
		// 2088 3539:getstatic       #400 <Field char[] table2>
		// 2089 3542:iload_0         
		// 2090 3543:caload          
		// 2091 3544:istore_1        
				if(c1 != 0)
		//*2092 3545:iload_1         
		//*2093 3546:ifeq            3558
					t2.put(((int) (c1)), j);
		// 2094 3549:getstatic       #28  <Field IntHashtable t2>
		// 2095 3552:iload_1         
		// 2096 3553:iload_0         
		// 2097 3554:invokevirtual   #404 <Method int IntHashtable.put(int, int)>
		// 2098 3557:pop             
			}

		// 2099 3558:iload_0         
		// 2100 3559:iconst_1        
		// 2101 3560:iadd            
		// 2102 3561:istore_0        
		//*2103 3562:goto            3532
		//*2104 3565:return          
		}

		SymbolConversion(boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #407 <Method void Object()>
			if(flag)
		//*   2    4:iload_1         
		//*   3    5:ifeq            23
			{
				translation = t1;
		//    4    8:aload_0         
		//    5    9:getstatic       #26  <Field IntHashtable t1>
		//    6   12:putfield        #409 <Field IntHashtable translation>
				byteToChar = table1;
		//    7   15:aload_0         
		//    8   16:getstatic       #217 <Field char[] table1>
		//    9   19:putfield        #411 <Field char[] byteToChar>
				return;
		//   10   22:return          
			} else
			{
				translation = t2;
		//   11   23:aload_0         
		//   12   24:getstatic       #28  <Field IntHashtable t2>
		//   13   27:putfield        #409 <Field IntHashtable translation>
				byteToChar = table2;
		//   14   30:aload_0         
		//   15   31:getstatic       #400 <Field char[] table2>
		//   16   34:putfield        #411 <Field char[] byteToChar>
				return;
		//   17   37:return          
			}
		}
	}

	private static class SymbolTTConversion
		implements ExtraEncoding
	{

		public String byteToChar(byte abyte0[], String s)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public byte[] charToByte(char c, String s)
		{
			if((c & 0xff00) == 0 || (c & 0xff00) == 61440)
		//*   0    0:iload_1         
		//*   1    1:ldc1            #21  <Int 65280>
		//*   2    3:iand            
		//*   3    4:ifeq            16
		//*   4    7:iload_1         
		//*   5    8:ldc1            #21  <Int 65280>
		//*   6   10:iand            
		//*   7   11:ldc1            #22  <Int 61440>
		//*   8   13:icmpne          25
				return (new byte[] {
					(byte)c
				});
		//    9   16:iconst_1        
		//   10   17:newarray        byte[]
		//   11   19:dup             
		//   12   20:iconst_0        
		//   13   21:iload_1         
		//   14   22:int2byte        
		//   15   23:bastore         
		//   16   24:areturn         
			else
				return new byte[0];
		//   17   25:iconst_0        
		//   18   26:newarray        byte[]
		//   19   28:areturn         
		}

		public byte[] charToByte(String s, String s1)
		{
			s1 = ((String) (s.toCharArray()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #29  <Method char[] String.toCharArray()>
		//    2    4:astore_2        
			s = ((String) (new byte[s1.length]));
		//    3    5:aload_2         
		//    4    6:arraylength     
		//    5    7:newarray        byte[]
		//    6    9:astore_1        
			int l = s1.length;
		//    7   10:aload_2         
		//    8   11:arraylength     
		//    9   12:istore          6
			int j = 0;
		//   10   14:iconst_0        
		//   11   15:istore          4
			int i = 0;
		//   12   17:iconst_0        
		//   13   18:istore_3        
			for(; j < l; j++)
		//*  14   19:iload           4
		//*  15   21:iload           6
		//*  16   23:icmpge          73
			{
				char c = s1[j];
		//   17   26:aload_2         
		//   18   27:iload           4
		//   19   29:caload          
		//   20   30:istore          7
				if((c & 0xff00) == 0 || (c & 0xff00) == 61440)
		//*  21   32:iload           7
		//*  22   34:ldc1            #21  <Int 65280>
		//*  23   36:iand            
		//*  24   37:ifeq            50
		//*  25   40:iload           7
		//*  26   42:ldc1            #21  <Int 65280>
		//*  27   44:iand            
		//*  28   45:ldc1            #22  <Int 61440>
		//*  29   47:icmpne          95
				{
					int k = i + 1;
		//   30   50:iload_3         
		//   31   51:iconst_1        
		//   32   52:iadd            
		//   33   53:istore          5
					s[i] = (byte)c;
		//   34   55:aload_1         
		//   35   56:iload_3         
		//   36   57:iload           7
		//   37   59:int2byte        
		//   38   60:bastore         
					i = k;
		//   39   61:iload           5
		//   40   63:istore_3        
				}
			}

		//   41   64:iload           4
		//   42   66:iconst_1        
		//   43   67:iadd            
		//   44   68:istore          4
		//*  45   70:goto            19
			if(i == l)
		//*  46   73:iload_3         
		//*  47   74:iload           6
		//*  48   76:icmpne          81
			{
				return ((byte []) (s));
		//   49   79:aload_1         
		//   50   80:areturn         
			} else
			{
				s1 = ((String) (new byte[i]));
		//   51   81:iload_3         
		//   52   82:newarray        byte[]
		//   53   84:astore_2        
				System.arraycopy(((Object) (s)), 0, ((Object) (s1)), 0, i);
		//   54   85:aload_1         
		//   55   86:iconst_0        
		//   56   87:aload_2         
		//   57   88:iconst_0        
		//   58   89:iload_3         
		//   59   90:invokestatic    #35  <Method void System.arraycopy(Object, int, Object, int, int)>
				return ((byte []) (s1));
		//   60   93:aload_2         
		//   61   94:areturn         
			}
		//*  62   95:goto            64
		}

		private SymbolTTConversion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class WingdingsConversion
		implements ExtraEncoding
	{

		public String byteToChar(byte abyte0[], String s)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public byte[] charToByte(char c, String s)
		{
			if(c == ' ')
		//*   0    0:iload_1         
		//*   1    1:bipush          32
		//*   2    3:icmpne          15
				return (new byte[] {
					(byte)c
				});
		//    3    6:iconst_1        
		//    4    7:newarray        byte[]
		//    5    9:dup             
		//    6   10:iconst_0        
		//    7   11:iload_1         
		//    8   12:int2byte        
		//    9   13:bastore         
		//   10   14:areturn         
			if(c >= '\u2701' && c <= '\u27BE')
		//*  11   15:iload_1         
		//*  12   16:sipush          9985
		//*  13   19:icmplt          51
		//*  14   22:iload_1         
		//*  15   23:sipush          10174
		//*  16   26:icmpgt          51
			{
				byte byte0 = table[c - 9984];
		//   17   29:getstatic       #69  <Field byte[] table>
		//   18   32:iload_1         
		//   19   33:sipush          9984
		//   20   36:isub            
		//   21   37:baload          
		//   22   38:istore_3        
				if(byte0 != 0)
		//*  23   39:iload_3         
		//*  24   40:ifeq            51
					return (new byte[] {
						byte0
					});
		//   25   43:iconst_1        
		//   26   44:newarray        byte[]
		//   27   46:dup             
		//   28   47:iconst_0        
		//   29   48:iload_3         
		//   30   49:bastore         
		//   31   50:areturn         
			}
			return new byte[0];
		//   32   51:iconst_0        
		//   33   52:newarray        byte[]
		//   34   54:areturn         
		}

		public byte[] charToByte(String s, String s1)
		{
			s1 = ((String) (s.toCharArray()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #86  <Method char[] String.toCharArray()>
		//    2    4:astore_2        
			s = ((String) (new byte[s1.length]));
		//    3    5:aload_2         
		//    4    6:arraylength     
		//    5    7:newarray        byte[]
		//    6    9:astore_1        
			int i1 = s1.length;
		//    7   10:aload_2         
		//    8   11:arraylength     
		//    9   12:istore          7
			int j = 0;
		//   10   14:iconst_0        
		//   11   15:istore          5
			int i = 0;
		//   12   17:iconst_0        
		//   13   18:istore          4
			while(j < i1) 
		//*  14   20:iload           5
		//*  15   22:iload           7
		//*  16   24:icmpge          115
			{
				char c = s1[j];
		//   17   27:aload_2         
		//   18   28:iload           5
		//   19   30:caload          
		//   20   31:istore          8
				if(c == ' ')
		//*  21   33:iload           8
		//*  22   35:bipush          32
		//*  23   37:icmpne          66
				{
					int k = i + 1;
		//   24   40:iload           4
		//   25   42:iconst_1        
		//   26   43:iadd            
		//   27   44:istore          6
					s[i] = (byte)c;
		//   28   46:aload_1         
		//   29   47:iload           4
		//   30   49:iload           8
		//   31   51:int2byte        
		//   32   52:bastore         
					i = k;
		//   33   53:iload           6
		//   34   55:istore          4
				} else
		//*  35   57:iload           5
		//*  36   59:iconst_1        
		//*  37   60:iadd            
		//*  38   61:istore          5
		//*  39   63:goto            20
				if(c >= '\u2701' && c <= '\u27BE')
		//*  40   66:iload           8
		//*  41   68:sipush          9985
		//*  42   71:icmplt          140
		//*  43   74:iload           8
		//*  44   76:sipush          10174
		//*  45   79:icmpgt          140
				{
					byte byte0 = table[c - 9984];
		//   46   82:getstatic       #69  <Field byte[] table>
		//   47   85:iload           8
		//   48   87:sipush          9984
		//   49   90:isub            
		//   50   91:baload          
		//   51   92:istore_3        
					if(byte0 != 0)
		//*  52   93:iload_3         
		//*  53   94:ifeq            140
					{
						int l = i + 1;
		//   54   97:iload           4
		//   55   99:iconst_1        
		//   56  100:iadd            
		//   57  101:istore          6
						s[i] = byte0;
		//   58  103:aload_1         
		//   59  104:iload           4
		//   60  106:iload_3         
		//   61  107:bastore         
						i = l;
		//   62  108:iload           6
		//   63  110:istore          4
					}
				}
				j++;
			}
		//*  64  112:goto            57
			if(i == i1)
		//*  65  115:iload           4
		//*  66  117:iload           7
		//*  67  119:icmpne          124
			{
				return ((byte []) (s));
		//   68  122:aload_1         
		//   69  123:areturn         
			} else
			{
				s1 = ((String) (new byte[i]));
		//   70  124:iload           4
		//   71  126:newarray        byte[]
		//   72  128:astore_2        
				System.arraycopy(((Object) (s)), 0, ((Object) (s1)), 0, i);
		//   73  129:aload_1         
		//   74  130:iconst_0        
		//   75  131:aload_2         
		//   76  132:iconst_0        
		//   77  133:iload           4
		//   78  135:invokestatic    #92  <Method void System.arraycopy(Object, int, Object, int, int)>
				return ((byte []) (s1));
		//   79  138:aload_2         
		//   80  139:areturn         
			}
		//*  81  140:goto            57
		}

		private static final byte table[] = {
			0, 35, 34, 0, 0, 0, 41, 62, 81, 42, 
			0, 0, 65, 63, 0, 0, 0, 0, 0, -4, 
			0, 0, 0, -5, 0, 0, 0, 0, 0, 0, 
			86, 0, 88, 89, 0, 0, 0, 0, 0, 0, 
			0, 0, -75, 0, 0, 0, 0, 0, -74, 0, 
			0, 0, -83, -81, -84, 0, 0, 0, 0, 0, 
			0, 0, 0, 124, 123, 0, 0, 0, 84, 0, 
			0, 0, 0, 0, 0, 0, 0, -90, 0, 0, 
			0, 113, 114, 0, 0, 0, 117, 0, 0, 0, 
			0, 0, 0, 125, 126, 0, 0, 0, 0, 0, 
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
			0, 0, 0, 0, 0, 0, 0, 0, -116, -115, 
			-114, -113, -112, -111, -110, -109, -108, -107, -127, -126, 
			-125, -124, -123, -122, -121, -120, -119, -118, -116, -115, 
			-114, -113, -112, -111, -110, -109, -108, -107, -24, 0, 
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
			0, -24, -40, 0, 0, -60, -58, 0, 0, -16, 
			0, 0, 0, 0, 0, 0, 0, 0, 0, -36, 
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
			0
		};

		static 
		{
		//    0    0:sipush          191
		//    1    3:newarray        byte[]
		//    2    5:dup             
		//    3    6:iconst_0        
		//    4    7:ldc1            #14  <Int 0>
		//    5    9:bastore         
		//    6   10:dup             
		//    7   11:iconst_1        
		//    8   12:ldc1            #15  <Int 35>
		//    9   14:bastore         
		//   10   15:dup             
		//   11   16:iconst_2        
		//   12   17:ldc1            #16  <Int 34>
		//   13   19:bastore         
		//   14   20:dup             
		//   15   21:iconst_3        
		//   16   22:ldc1            #14  <Int 0>
		//   17   24:bastore         
		//   18   25:dup             
		//   19   26:iconst_4        
		//   20   27:ldc1            #14  <Int 0>
		//   21   29:bastore         
		//   22   30:dup             
		//   23   31:iconst_5        
		//   24   32:ldc1            #14  <Int 0>
		//   25   34:bastore         
		//   26   35:dup             
		//   27   36:bipush          6
		//   28   38:ldc1            #17  <Int 41>
		//   29   40:bastore         
		//   30   41:dup             
		//   31   42:bipush          7
		//   32   44:ldc1            #18  <Int 62>
		//   33   46:bastore         
		//   34   47:dup             
		//   35   48:bipush          8
		//   36   50:ldc1            #19  <Int 81>
		//   37   52:bastore         
		//   38   53:dup             
		//   39   54:bipush          9
		//   40   56:ldc1            #20  <Int 42>
		//   41   58:bastore         
		//   42   59:dup             
		//   43   60:bipush          10
		//   44   62:ldc1            #14  <Int 0>
		//   45   64:bastore         
		//   46   65:dup             
		//   47   66:bipush          11
		//   48   68:ldc1            #14  <Int 0>
		//   49   70:bastore         
		//   50   71:dup             
		//   51   72:bipush          12
		//   52   74:ldc1            #21  <Int 65>
		//   53   76:bastore         
		//   54   77:dup             
		//   55   78:bipush          13
		//   56   80:ldc1            #22  <Int 63>
		//   57   82:bastore         
		//   58   83:dup             
		//   59   84:bipush          14
		//   60   86:ldc1            #14  <Int 0>
		//   61   88:bastore         
		//   62   89:dup             
		//   63   90:bipush          15
		//   64   92:ldc1            #14  <Int 0>
		//   65   94:bastore         
		//   66   95:dup             
		//   67   96:bipush          16
		//   68   98:ldc1            #14  <Int 0>
		//   69  100:bastore         
		//   70  101:dup             
		//   71  102:bipush          17
		//   72  104:ldc1            #14  <Int 0>
		//   73  106:bastore         
		//   74  107:dup             
		//   75  108:bipush          18
		//   76  110:ldc1            #14  <Int 0>
		//   77  112:bastore         
		//   78  113:dup             
		//   79  114:bipush          19
		//   80  116:ldc1            #23  <Int -4>
		//   81  118:bastore         
		//   82  119:dup             
		//   83  120:bipush          20
		//   84  122:ldc1            #14  <Int 0>
		//   85  124:bastore         
		//   86  125:dup             
		//   87  126:bipush          21
		//   88  128:ldc1            #14  <Int 0>
		//   89  130:bastore         
		//   90  131:dup             
		//   91  132:bipush          22
		//   92  134:ldc1            #14  <Int 0>
		//   93  136:bastore         
		//   94  137:dup             
		//   95  138:bipush          23
		//   96  140:ldc1            #24  <Int -5>
		//   97  142:bastore         
		//   98  143:dup             
		//   99  144:bipush          24
		//  100  146:ldc1            #14  <Int 0>
		//  101  148:bastore         
		//  102  149:dup             
		//  103  150:bipush          25
		//  104  152:ldc1            #14  <Int 0>
		//  105  154:bastore         
		//  106  155:dup             
		//  107  156:bipush          26
		//  108  158:ldc1            #14  <Int 0>
		//  109  160:bastore         
		//  110  161:dup             
		//  111  162:bipush          27
		//  112  164:ldc1            #14  <Int 0>
		//  113  166:bastore         
		//  114  167:dup             
		//  115  168:bipush          28
		//  116  170:ldc1            #14  <Int 0>
		//  117  172:bastore         
		//  118  173:dup             
		//  119  174:bipush          29
		//  120  176:ldc1            #14  <Int 0>
		//  121  178:bastore         
		//  122  179:dup             
		//  123  180:bipush          30
		//  124  182:ldc1            #25  <Int 86>
		//  125  184:bastore         
		//  126  185:dup             
		//  127  186:bipush          31
		//  128  188:ldc1            #14  <Int 0>
		//  129  190:bastore         
		//  130  191:dup             
		//  131  192:bipush          32
		//  132  194:ldc1            #26  <Int 88>
		//  133  196:bastore         
		//  134  197:dup             
		//  135  198:bipush          33
		//  136  200:ldc1            #27  <Int 89>
		//  137  202:bastore         
		//  138  203:dup             
		//  139  204:bipush          34
		//  140  206:ldc1            #14  <Int 0>
		//  141  208:bastore         
		//  142  209:dup             
		//  143  210:bipush          35
		//  144  212:ldc1            #14  <Int 0>
		//  145  214:bastore         
		//  146  215:dup             
		//  147  216:bipush          36
		//  148  218:ldc1            #14  <Int 0>
		//  149  220:bastore         
		//  150  221:dup             
		//  151  222:bipush          37
		//  152  224:ldc1            #14  <Int 0>
		//  153  226:bastore         
		//  154  227:dup             
		//  155  228:bipush          38
		//  156  230:ldc1            #14  <Int 0>
		//  157  232:bastore         
		//  158  233:dup             
		//  159  234:bipush          39
		//  160  236:ldc1            #14  <Int 0>
		//  161  238:bastore         
		//  162  239:dup             
		//  163  240:bipush          40
		//  164  242:ldc1            #14  <Int 0>
		//  165  244:bastore         
		//  166  245:dup             
		//  167  246:bipush          41
		//  168  248:ldc1            #14  <Int 0>
		//  169  250:bastore         
		//  170  251:dup             
		//  171  252:bipush          42
		//  172  254:ldc1            #28  <Int -75>
		//  173  256:bastore         
		//  174  257:dup             
		//  175  258:bipush          43
		//  176  260:ldc1            #14  <Int 0>
		//  177  262:bastore         
		//  178  263:dup             
		//  179  264:bipush          44
		//  180  266:ldc1            #14  <Int 0>
		//  181  268:bastore         
		//  182  269:dup             
		//  183  270:bipush          45
		//  184  272:ldc1            #14  <Int 0>
		//  185  274:bastore         
		//  186  275:dup             
		//  187  276:bipush          46
		//  188  278:ldc1            #14  <Int 0>
		//  189  280:bastore         
		//  190  281:dup             
		//  191  282:bipush          47
		//  192  284:ldc1            #14  <Int 0>
		//  193  286:bastore         
		//  194  287:dup             
		//  195  288:bipush          48
		//  196  290:ldc1            #29  <Int -74>
		//  197  292:bastore         
		//  198  293:dup             
		//  199  294:bipush          49
		//  200  296:ldc1            #14  <Int 0>
		//  201  298:bastore         
		//  202  299:dup             
		//  203  300:bipush          50
		//  204  302:ldc1            #14  <Int 0>
		//  205  304:bastore         
		//  206  305:dup             
		//  207  306:bipush          51
		//  208  308:ldc1            #14  <Int 0>
		//  209  310:bastore         
		//  210  311:dup             
		//  211  312:bipush          52
		//  212  314:ldc1            #30  <Int -83>
		//  213  316:bastore         
		//  214  317:dup             
		//  215  318:bipush          53
		//  216  320:ldc1            #31  <Int -81>
		//  217  322:bastore         
		//  218  323:dup             
		//  219  324:bipush          54
		//  220  326:ldc1            #32  <Int -84>
		//  221  328:bastore         
		//  222  329:dup             
		//  223  330:bipush          55
		//  224  332:ldc1            #14  <Int 0>
		//  225  334:bastore         
		//  226  335:dup             
		//  227  336:bipush          56
		//  228  338:ldc1            #14  <Int 0>
		//  229  340:bastore         
		//  230  341:dup             
		//  231  342:bipush          57
		//  232  344:ldc1            #14  <Int 0>
		//  233  346:bastore         
		//  234  347:dup             
		//  235  348:bipush          58
		//  236  350:ldc1            #14  <Int 0>
		//  237  352:bastore         
		//  238  353:dup             
		//  239  354:bipush          59
		//  240  356:ldc1            #14  <Int 0>
		//  241  358:bastore         
		//  242  359:dup             
		//  243  360:bipush          60
		//  244  362:ldc1            #14  <Int 0>
		//  245  364:bastore         
		//  246  365:dup             
		//  247  366:bipush          61
		//  248  368:ldc1            #14  <Int 0>
		//  249  370:bastore         
		//  250  371:dup             
		//  251  372:bipush          62
		//  252  374:ldc1            #14  <Int 0>
		//  253  376:bastore         
		//  254  377:dup             
		//  255  378:bipush          63
		//  256  380:ldc1            #33  <Int 124>
		//  257  382:bastore         
		//  258  383:dup             
		//  259  384:bipush          64
		//  260  386:ldc1            #34  <Int 123>
		//  261  388:bastore         
		//  262  389:dup             
		//  263  390:bipush          65
		//  264  392:ldc1            #14  <Int 0>
		//  265  394:bastore         
		//  266  395:dup             
		//  267  396:bipush          66
		//  268  398:ldc1            #14  <Int 0>
		//  269  400:bastore         
		//  270  401:dup             
		//  271  402:bipush          67
		//  272  404:ldc1            #14  <Int 0>
		//  273  406:bastore         
		//  274  407:dup             
		//  275  408:bipush          68
		//  276  410:ldc1            #35  <Int 84>
		//  277  412:bastore         
		//  278  413:dup             
		//  279  414:bipush          69
		//  280  416:ldc1            #14  <Int 0>
		//  281  418:bastore         
		//  282  419:dup             
		//  283  420:bipush          70
		//  284  422:ldc1            #14  <Int 0>
		//  285  424:bastore         
		//  286  425:dup             
		//  287  426:bipush          71
		//  288  428:ldc1            #14  <Int 0>
		//  289  430:bastore         
		//  290  431:dup             
		//  291  432:bipush          72
		//  292  434:ldc1            #14  <Int 0>
		//  293  436:bastore         
		//  294  437:dup             
		//  295  438:bipush          73
		//  296  440:ldc1            #14  <Int 0>
		//  297  442:bastore         
		//  298  443:dup             
		//  299  444:bipush          74
		//  300  446:ldc1            #14  <Int 0>
		//  301  448:bastore         
		//  302  449:dup             
		//  303  450:bipush          75
		//  304  452:ldc1            #14  <Int 0>
		//  305  454:bastore         
		//  306  455:dup             
		//  307  456:bipush          76
		//  308  458:ldc1            #14  <Int 0>
		//  309  460:bastore         
		//  310  461:dup             
		//  311  462:bipush          77
		//  312  464:ldc1            #36  <Int -90>
		//  313  466:bastore         
		//  314  467:dup             
		//  315  468:bipush          78
		//  316  470:ldc1            #14  <Int 0>
		//  317  472:bastore         
		//  318  473:dup             
		//  319  474:bipush          79
		//  320  476:ldc1            #14  <Int 0>
		//  321  478:bastore         
		//  322  479:dup             
		//  323  480:bipush          80
		//  324  482:ldc1            #14  <Int 0>
		//  325  484:bastore         
		//  326  485:dup             
		//  327  486:bipush          81
		//  328  488:ldc1            #37  <Int 113>
		//  329  490:bastore         
		//  330  491:dup             
		//  331  492:bipush          82
		//  332  494:ldc1            #38  <Int 114>
		//  333  496:bastore         
		//  334  497:dup             
		//  335  498:bipush          83
		//  336  500:ldc1            #14  <Int 0>
		//  337  502:bastore         
		//  338  503:dup             
		//  339  504:bipush          84
		//  340  506:ldc1            #14  <Int 0>
		//  341  508:bastore         
		//  342  509:dup             
		//  343  510:bipush          85
		//  344  512:ldc1            #14  <Int 0>
		//  345  514:bastore         
		//  346  515:dup             
		//  347  516:bipush          86
		//  348  518:ldc1            #39  <Int 117>
		//  349  520:bastore         
		//  350  521:dup             
		//  351  522:bipush          87
		//  352  524:ldc1            #14  <Int 0>
		//  353  526:bastore         
		//  354  527:dup             
		//  355  528:bipush          88
		//  356  530:ldc1            #14  <Int 0>
		//  357  532:bastore         
		//  358  533:dup             
		//  359  534:bipush          89
		//  360  536:ldc1            #14  <Int 0>
		//  361  538:bastore         
		//  362  539:dup             
		//  363  540:bipush          90
		//  364  542:ldc1            #14  <Int 0>
		//  365  544:bastore         
		//  366  545:dup             
		//  367  546:bipush          91
		//  368  548:ldc1            #14  <Int 0>
		//  369  550:bastore         
		//  370  551:dup             
		//  371  552:bipush          92
		//  372  554:ldc1            #14  <Int 0>
		//  373  556:bastore         
		//  374  557:dup             
		//  375  558:bipush          93
		//  376  560:ldc1            #40  <Int 125>
		//  377  562:bastore         
		//  378  563:dup             
		//  379  564:bipush          94
		//  380  566:ldc1            #41  <Int 126>
		//  381  568:bastore         
		//  382  569:dup             
		//  383  570:bipush          95
		//  384  572:ldc1            #14  <Int 0>
		//  385  574:bastore         
		//  386  575:dup             
		//  387  576:bipush          96
		//  388  578:ldc1            #14  <Int 0>
		//  389  580:bastore         
		//  390  581:dup             
		//  391  582:bipush          97
		//  392  584:ldc1            #14  <Int 0>
		//  393  586:bastore         
		//  394  587:dup             
		//  395  588:bipush          98
		//  396  590:ldc1            #14  <Int 0>
		//  397  592:bastore         
		//  398  593:dup             
		//  399  594:bipush          99
		//  400  596:ldc1            #14  <Int 0>
		//  401  598:bastore         
		//  402  599:dup             
		//  403  600:bipush          100
		//  404  602:ldc1            #14  <Int 0>
		//  405  604:bastore         
		//  406  605:dup             
		//  407  606:bipush          101
		//  408  608:ldc1            #14  <Int 0>
		//  409  610:bastore         
		//  410  611:dup             
		//  411  612:bipush          102
		//  412  614:ldc1            #14  <Int 0>
		//  413  616:bastore         
		//  414  617:dup             
		//  415  618:bipush          103
		//  416  620:ldc1            #14  <Int 0>
		//  417  622:bastore         
		//  418  623:dup             
		//  419  624:bipush          104
		//  420  626:ldc1            #14  <Int 0>
		//  421  628:bastore         
		//  422  629:dup             
		//  423  630:bipush          105
		//  424  632:ldc1            #14  <Int 0>
		//  425  634:bastore         
		//  426  635:dup             
		//  427  636:bipush          106
		//  428  638:ldc1            #14  <Int 0>
		//  429  640:bastore         
		//  430  641:dup             
		//  431  642:bipush          107
		//  432  644:ldc1            #14  <Int 0>
		//  433  646:bastore         
		//  434  647:dup             
		//  435  648:bipush          108
		//  436  650:ldc1            #14  <Int 0>
		//  437  652:bastore         
		//  438  653:dup             
		//  439  654:bipush          109
		//  440  656:ldc1            #14  <Int 0>
		//  441  658:bastore         
		//  442  659:dup             
		//  443  660:bipush          110
		//  444  662:ldc1            #14  <Int 0>
		//  445  664:bastore         
		//  446  665:dup             
		//  447  666:bipush          111
		//  448  668:ldc1            #14  <Int 0>
		//  449  670:bastore         
		//  450  671:dup             
		//  451  672:bipush          112
		//  452  674:ldc1            #14  <Int 0>
		//  453  676:bastore         
		//  454  677:dup             
		//  455  678:bipush          113
		//  456  680:ldc1            #14  <Int 0>
		//  457  682:bastore         
		//  458  683:dup             
		//  459  684:bipush          114
		//  460  686:ldc1            #14  <Int 0>
		//  461  688:bastore         
		//  462  689:dup             
		//  463  690:bipush          115
		//  464  692:ldc1            #14  <Int 0>
		//  465  694:bastore         
		//  466  695:dup             
		//  467  696:bipush          116
		//  468  698:ldc1            #14  <Int 0>
		//  469  700:bastore         
		//  470  701:dup             
		//  471  702:bipush          117
		//  472  704:ldc1            #14  <Int 0>
		//  473  706:bastore         
		//  474  707:dup             
		//  475  708:bipush          118
		//  476  710:ldc1            #42  <Int -116>
		//  477  712:bastore         
		//  478  713:dup             
		//  479  714:bipush          119
		//  480  716:ldc1            #43  <Int -115>
		//  481  718:bastore         
		//  482  719:dup             
		//  483  720:bipush          120
		//  484  722:ldc1            #44  <Int -114>
		//  485  724:bastore         
		//  486  725:dup             
		//  487  726:bipush          121
		//  488  728:ldc1            #45  <Int -113>
		//  489  730:bastore         
		//  490  731:dup             
		//  491  732:bipush          122
		//  492  734:ldc1            #46  <Int -112>
		//  493  736:bastore         
		//  494  737:dup             
		//  495  738:bipush          123
		//  496  740:ldc1            #47  <Int -111>
		//  497  742:bastore         
		//  498  743:dup             
		//  499  744:bipush          124
		//  500  746:ldc1            #48  <Int -110>
		//  501  748:bastore         
		//  502  749:dup             
		//  503  750:bipush          125
		//  504  752:ldc1            #49  <Int -109>
		//  505  754:bastore         
		//  506  755:dup             
		//  507  756:bipush          126
		//  508  758:ldc1            #50  <Int -108>
		//  509  760:bastore         
		//  510  761:dup             
		//  511  762:bipush          127
		//  512  764:ldc1            #51  <Int -107>
		//  513  766:bastore         
		//  514  767:dup             
		//  515  768:sipush          128
		//  516  771:ldc1            #52  <Int -127>
		//  517  773:bastore         
		//  518  774:dup             
		//  519  775:sipush          129
		//  520  778:ldc1            #53  <Int -126>
		//  521  780:bastore         
		//  522  781:dup             
		//  523  782:sipush          130
		//  524  785:ldc1            #54  <Int -125>
		//  525  787:bastore         
		//  526  788:dup             
		//  527  789:sipush          131
		//  528  792:ldc1            #55  <Int -124>
		//  529  794:bastore         
		//  530  795:dup             
		//  531  796:sipush          132
		//  532  799:ldc1            #56  <Int -123>
		//  533  801:bastore         
		//  534  802:dup             
		//  535  803:sipush          133
		//  536  806:ldc1            #57  <Int -122>
		//  537  808:bastore         
		//  538  809:dup             
		//  539  810:sipush          134
		//  540  813:ldc1            #58  <Int -121>
		//  541  815:bastore         
		//  542  816:dup             
		//  543  817:sipush          135
		//  544  820:ldc1            #59  <Int -120>
		//  545  822:bastore         
		//  546  823:dup             
		//  547  824:sipush          136
		//  548  827:ldc1            #60  <Int -119>
		//  549  829:bastore         
		//  550  830:dup             
		//  551  831:sipush          137
		//  552  834:ldc1            #61  <Int -118>
		//  553  836:bastore         
		//  554  837:dup             
		//  555  838:sipush          138
		//  556  841:ldc1            #42  <Int -116>
		//  557  843:bastore         
		//  558  844:dup             
		//  559  845:sipush          139
		//  560  848:ldc1            #43  <Int -115>
		//  561  850:bastore         
		//  562  851:dup             
		//  563  852:sipush          140
		//  564  855:ldc1            #44  <Int -114>
		//  565  857:bastore         
		//  566  858:dup             
		//  567  859:sipush          141
		//  568  862:ldc1            #45  <Int -113>
		//  569  864:bastore         
		//  570  865:dup             
		//  571  866:sipush          142
		//  572  869:ldc1            #46  <Int -112>
		//  573  871:bastore         
		//  574  872:dup             
		//  575  873:sipush          143
		//  576  876:ldc1            #47  <Int -111>
		//  577  878:bastore         
		//  578  879:dup             
		//  579  880:sipush          144
		//  580  883:ldc1            #48  <Int -110>
		//  581  885:bastore         
		//  582  886:dup             
		//  583  887:sipush          145
		//  584  890:ldc1            #49  <Int -109>
		//  585  892:bastore         
		//  586  893:dup             
		//  587  894:sipush          146
		//  588  897:ldc1            #50  <Int -108>
		//  589  899:bastore         
		//  590  900:dup             
		//  591  901:sipush          147
		//  592  904:ldc1            #51  <Int -107>
		//  593  906:bastore         
		//  594  907:dup             
		//  595  908:sipush          148
		//  596  911:ldc1            #62  <Int -24>
		//  597  913:bastore         
		//  598  914:dup             
		//  599  915:sipush          149
		//  600  918:ldc1            #14  <Int 0>
		//  601  920:bastore         
		//  602  921:dup             
		//  603  922:sipush          150
		//  604  925:ldc1            #14  <Int 0>
		//  605  927:bastore         
		//  606  928:dup             
		//  607  929:sipush          151
		//  608  932:ldc1            #14  <Int 0>
		//  609  934:bastore         
		//  610  935:dup             
		//  611  936:sipush          152
		//  612  939:ldc1            #14  <Int 0>
		//  613  941:bastore         
		//  614  942:dup             
		//  615  943:sipush          153
		//  616  946:ldc1            #14  <Int 0>
		//  617  948:bastore         
		//  618  949:dup             
		//  619  950:sipush          154
		//  620  953:ldc1            #14  <Int 0>
		//  621  955:bastore         
		//  622  956:dup             
		//  623  957:sipush          155
		//  624  960:ldc1            #14  <Int 0>
		//  625  962:bastore         
		//  626  963:dup             
		//  627  964:sipush          156
		//  628  967:ldc1            #14  <Int 0>
		//  629  969:bastore         
		//  630  970:dup             
		//  631  971:sipush          157
		//  632  974:ldc1            #14  <Int 0>
		//  633  976:bastore         
		//  634  977:dup             
		//  635  978:sipush          158
		//  636  981:ldc1            #14  <Int 0>
		//  637  983:bastore         
		//  638  984:dup             
		//  639  985:sipush          159
		//  640  988:ldc1            #14  <Int 0>
		//  641  990:bastore         
		//  642  991:dup             
		//  643  992:sipush          160
		//  644  995:ldc1            #14  <Int 0>
		//  645  997:bastore         
		//  646  998:dup             
		//  647  999:sipush          161
		//  648 1002:ldc1            #62  <Int -24>
		//  649 1004:bastore         
		//  650 1005:dup             
		//  651 1006:sipush          162
		//  652 1009:ldc1            #63  <Int -40>
		//  653 1011:bastore         
		//  654 1012:dup             
		//  655 1013:sipush          163
		//  656 1016:ldc1            #14  <Int 0>
		//  657 1018:bastore         
		//  658 1019:dup             
		//  659 1020:sipush          164
		//  660 1023:ldc1            #14  <Int 0>
		//  661 1025:bastore         
		//  662 1026:dup             
		//  663 1027:sipush          165
		//  664 1030:ldc1            #64  <Int -60>
		//  665 1032:bastore         
		//  666 1033:dup             
		//  667 1034:sipush          166
		//  668 1037:ldc1            #65  <Int -58>
		//  669 1039:bastore         
		//  670 1040:dup             
		//  671 1041:sipush          167
		//  672 1044:ldc1            #14  <Int 0>
		//  673 1046:bastore         
		//  674 1047:dup             
		//  675 1048:sipush          168
		//  676 1051:ldc1            #14  <Int 0>
		//  677 1053:bastore         
		//  678 1054:dup             
		//  679 1055:sipush          169
		//  680 1058:ldc1            #66  <Int -16>
		//  681 1060:bastore         
		//  682 1061:dup             
		//  683 1062:sipush          170
		//  684 1065:ldc1            #14  <Int 0>
		//  685 1067:bastore         
		//  686 1068:dup             
		//  687 1069:sipush          171
		//  688 1072:ldc1            #14  <Int 0>
		//  689 1074:bastore         
		//  690 1075:dup             
		//  691 1076:sipush          172
		//  692 1079:ldc1            #14  <Int 0>
		//  693 1081:bastore         
		//  694 1082:dup             
		//  695 1083:sipush          173
		//  696 1086:ldc1            #14  <Int 0>
		//  697 1088:bastore         
		//  698 1089:dup             
		//  699 1090:sipush          174
		//  700 1093:ldc1            #14  <Int 0>
		//  701 1095:bastore         
		//  702 1096:dup             
		//  703 1097:sipush          175
		//  704 1100:ldc1            #14  <Int 0>
		//  705 1102:bastore         
		//  706 1103:dup             
		//  707 1104:sipush          176
		//  708 1107:ldc1            #14  <Int 0>
		//  709 1109:bastore         
		//  710 1110:dup             
		//  711 1111:sipush          177
		//  712 1114:ldc1            #14  <Int 0>
		//  713 1116:bastore         
		//  714 1117:dup             
		//  715 1118:sipush          178
		//  716 1121:ldc1            #14  <Int 0>
		//  717 1123:bastore         
		//  718 1124:dup             
		//  719 1125:sipush          179
		//  720 1128:ldc1            #67  <Int -36>
		//  721 1130:bastore         
		//  722 1131:dup             
		//  723 1132:sipush          180
		//  724 1135:ldc1            #14  <Int 0>
		//  725 1137:bastore         
		//  726 1138:dup             
		//  727 1139:sipush          181
		//  728 1142:ldc1            #14  <Int 0>
		//  729 1144:bastore         
		//  730 1145:dup             
		//  731 1146:sipush          182
		//  732 1149:ldc1            #14  <Int 0>
		//  733 1151:bastore         
		//  734 1152:dup             
		//  735 1153:sipush          183
		//  736 1156:ldc1            #14  <Int 0>
		//  737 1158:bastore         
		//  738 1159:dup             
		//  739 1160:sipush          184
		//  740 1163:ldc1            #14  <Int 0>
		//  741 1165:bastore         
		//  742 1166:dup             
		//  743 1167:sipush          185
		//  744 1170:ldc1            #14  <Int 0>
		//  745 1172:bastore         
		//  746 1173:dup             
		//  747 1174:sipush          186
		//  748 1177:ldc1            #14  <Int 0>
		//  749 1179:bastore         
		//  750 1180:dup             
		//  751 1181:sipush          187
		//  752 1184:ldc1            #14  <Int 0>
		//  753 1186:bastore         
		//  754 1187:dup             
		//  755 1188:sipush          188
		//  756 1191:ldc1            #14  <Int 0>
		//  757 1193:bastore         
		//  758 1194:dup             
		//  759 1195:sipush          189
		//  760 1198:ldc1            #14  <Int 0>
		//  761 1200:bastore         
		//  762 1201:dup             
		//  763 1202:sipush          190
		//  764 1205:ldc1            #14  <Int 0>
		//  765 1207:bastore         
		//  766 1208:putstatic       #69  <Field byte[] table>
		//* 767 1211:return          
		}

		private WingdingsConversion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #73  <Method void Object()>
		//    2    4:return          
		}

	}


	public PdfEncodings()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #335 <Method void Object()>
	//    2    4:return          
	}

	public static void addExtraEncoding(String s, ExtraEncoding extraencoding)
	{
		synchronized(extraEncodings)
	//*   0    0:getstatic       #306 <Field HashMap extraEncodings>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
		{
			HashMap hashmap1 = (HashMap)extraEncodings.clone();
	//    4    6:getstatic       #306 <Field HashMap extraEncodings>
	//    5    9:invokevirtual   #339 <Method Object HashMap.clone()>
	//    6   12:checkcast       #303 <Class HashMap>
	//    7   15:astore_3        
			hashmap1.put(((Object) (s.toLowerCase())), ((Object) (extraencoding)));
	//    8   16:aload_3         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #345 <Method String String.toLowerCase()>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #348 <Method Object HashMap.put(Object, Object)>
	//   13   25:pop             
			extraEncodings = hashmap1;
	//   14   26:aload_3         
	//   15   27:putstatic       #306 <Field HashMap extraEncodings>
		}
	//   16   30:aload_2         
	//   17   31:monitorexit     
		return;
	//   18   32:return          
		s;
	//   19   33:astore_0        
		hashmap;
	//   20   34:aload_2         
		JVM INSTR monitorexit ;
	//   21   35:monitorexit     
		throw s;
	//   22   36:aload_0         
	//   23   37:athrow          
	}

	public static final byte[] convertToBytes(char c, String s)
	{
		if(s != null && s.length() != 0) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          11
	//    2    4:aload_1         
	//    3    5:invokevirtual   #356 <Method int String.length()>
	//    4    8:ifne            22
_L1:
		Object obj;
		obj = ((Object) (new byte[1]));
	//    5   11:iconst_1        
	//    6   12:newarray        byte[]
	//    7   14:astore_3        
		obj[0] = (byte)c;
	//    8   15:aload_3         
	//    9   16:iconst_0        
	//   10   17:iload_0         
	//   11   18:int2byte        
	//   12   19:bastore         
_L4:
		return ((byte []) (obj));
	//   13   20:aload_3         
	//   14   21:areturn         
_L2:
		byte abyte1[];
		obj = ((Object) ((ExtraEncoding)extraEncodings.get(((Object) (s.toLowerCase())))));
	//   15   22:getstatic       #306 <Field HashMap extraEncodings>
	//   16   25:aload_1         
	//   17   26:invokevirtual   #345 <Method String String.toLowerCase()>
	//   18   29:invokevirtual   #360 <Method Object HashMap.get(Object)>
	//   19   32:checkcast       #362 <Class ExtraEncoding>
	//   20   35:astore_3        
		if(obj == null)
			break; /* Loop/switch isn't completed */
	//   21   36:aload_3         
	//   22   37:ifnull          58
		abyte1 = ((ExtraEncoding) (obj)).charToByte(c, s);
	//   23   40:aload_3         
	//   24   41:iload_0         
	//   25   42:aload_1         
	//   26   43:invokeinterface #365 <Method byte[] ExtraEncoding.charToByte(char, String)>
	//   27   48:astore          4
		obj = ((Object) (abyte1));
	//   28   50:aload           4
	//   29   52:astore_3        
		if(abyte1 != null) goto _L4; else goto _L3
	//   30   53:aload           4
	//   31   55:ifnonnull       20
_L3:
		IntHashtable inthashtable = null;
	//   32   58:aconst_null     
	//   33   59:astore_3        
		if(s.equals("Cp1252"))
	//*  34   60:aload_1         
	//*  35   61:ldc2            #367 <String "Cp1252">
	//*  36   64:invokevirtual   #371 <Method boolean String.equals(Object)>
	//*  37   67:ifeq            114
			inthashtable = winansi;
	//   38   70:getstatic       #299 <Field IntHashtable winansi>
	//   39   73:astore_3        
		else
	//*  40   74:aload_3         
	//*  41   75:ifnull          144
	//*  42   78:iload_0         
	//*  43   79:sipush          128
	//*  44   82:icmplt          99
	//*  45   85:iload_0         
	//*  46   86:sipush          160
	//*  47   89:icmple          131
	//*  48   92:iload_0         
	//*  49   93:sipush          255
	//*  50   96:icmpgt          131
	//*  51   99:iload_0         
	//*  52  100:istore_2        
	//*  53  101:iload_2         
	//*  54  102:ifeq            140
	//*  55  105:iconst_1        
	//*  56  106:newarray        byte[]
	//*  57  108:dup             
	//*  58  109:iconst_0        
	//*  59  110:iload_2         
	//*  60  111:int2byte        
	//*  61  112:bastore         
	//*  62  113:areturn         
		if(s.equals("PDF"))
	//*  63  114:aload_1         
	//*  64  115:ldc2            #373 <String "PDF">
	//*  65  118:invokevirtual   #371 <Method boolean String.equals(Object)>
	//*  66  121:ifeq            74
			inthashtable = pdfEncoding;
	//   67  124:getstatic       #301 <Field IntHashtable pdfEncoding>
	//   68  127:astore_3        
		if(inthashtable != null)
		{
			int i;
			if(c < '\200' || c > '\240' && c <= '\377')
				i = ((int) (c));
			else
	//*  69  128:goto            74
				i = inthashtable.get(((int) (c)));
	//   70  131:aload_3         
	//   71  132:iload_0         
	//   72  133:invokevirtual   #376 <Method int IntHashtable.get(int)>
	//   73  136:istore_2        
			if(i != 0)
				return (new byte[] {
					(byte)i
				});
			else
	//*  74  137:goto            101
				return new byte[0];
	//   75  140:iconst_0        
	//   76  141:newarray        byte[]
	//   77  143:areturn         
		}
		if(s.equals("UnicodeBig"))
	//*  78  144:aload_1         
	//*  79  145:ldc2            #378 <String "UnicodeBig">
	//*  80  148:invokevirtual   #371 <Method boolean String.equals(Object)>
	//*  81  151:ifeq            184
			return (new byte[] {
				-2, -1, (byte)(c >> 8), (byte)(c & 0xff)
			});
	//   82  154:iconst_4        
	//   83  155:newarray        byte[]
	//   84  157:dup             
	//   85  158:iconst_0        
	//   86  159:bipush          -2
	//   87  161:bastore         
	//   88  162:dup             
	//   89  163:iconst_1        
	//   90  164:iconst_m1       
	//   91  165:bastore         
	//   92  166:dup             
	//   93  167:iconst_2        
	//   94  168:iload_0         
	//   95  169:bipush          8
	//   96  171:ishr            
	//   97  172:int2byte        
	//   98  173:bastore         
	//   99  174:dup             
	//  100  175:iconst_3        
	//  101  176:iload_0         
	//  102  177:sipush          255
	//  103  180:iand            
	//  104  181:int2byte        
	//  105  182:bastore         
	//  106  183:areturn         
		byte abyte0[];
		try
		{
			s = ((String) (Charset.forName(s).newEncoder()));
	//  107  184:aload_1         
	//  108  185:invokestatic    #384 <Method Charset Charset.forName(String)>
	//  109  188:invokevirtual   #388 <Method CharsetEncoder Charset.newEncoder()>
	//  110  191:astore_1        
			((CharsetEncoder) (s)).onUnmappableCharacter(CodingErrorAction.IGNORE);
	//  111  192:aload_1         
	//  112  193:getstatic       #394 <Field CodingErrorAction CodingErrorAction.IGNORE>
	//  113  196:invokevirtual   #400 <Method CharsetEncoder CharsetEncoder.onUnmappableCharacter(CodingErrorAction)>
	//  114  199:pop             
			s = ((String) (((CharsetEncoder) (s)).encode(CharBuffer.wrap(new char[] {
				c
			}))));
	//  115  200:aload_1         
	//  116  201:iconst_1        
	//  117  202:newarray        char[]
	//  118  204:dup             
	//  119  205:iconst_0        
	//  120  206:iload_0         
	//  121  207:castore         
	//  122  208:invokestatic    #406 <Method CharBuffer CharBuffer.wrap(char[])>
	//  123  211:invokevirtual   #410 <Method ByteBuffer CharsetEncoder.encode(CharBuffer)>
	//  124  214:astore_1        
			((ByteBuffer) (s)).rewind();
	//  125  215:aload_1         
	//  126  216:invokevirtual   #416 <Method java.nio.Buffer ByteBuffer.rewind()>
	//  127  219:pop             
			abyte0 = new byte[((ByteBuffer) (s)).limit()];
	//  128  220:aload_1         
	//  129  221:invokevirtual   #419 <Method int ByteBuffer.limit()>
	//  130  224:newarray        byte[]
	//  131  226:astore_3        
			((ByteBuffer) (s)).get(abyte0);
	//  132  227:aload_1         
	//  133  228:aload_3         
	//  134  229:invokevirtual   #422 <Method ByteBuffer ByteBuffer.get(byte[])>
	//  135  232:pop             
		}
	//* 136  233:aload_3         
	//* 137  234:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 138  235:astore_1        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//  139  236:new             #424 <Class ExceptionConverter>
	//  140  239:dup             
	//  141  240:aload_1         
	//  142  241:invokespecial   #427 <Method void ExceptionConverter(Exception)>
	//  143  244:athrow          
		}
		return abyte0;
	}

	public static final byte[] convertToBytes(String s, String s1)
	{
		if(s != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       12
_L1:
		Object obj = ((Object) (new byte[0]));
	//    2    4:iconst_0        
	//    3    5:newarray        byte[]
	//    4    7:astore          7
_L4:
		return ((byte []) (obj));
	//    5    9:aload           7
	//    6   11:areturn         
_L2:
		byte abyte0[];
		if(s1 == null || s1.length() == 0)
	//*   7   12:aload_1         
	//*   8   13:ifnull          23
	//*   9   16:aload_1         
	//*  10   17:invokevirtual   #356 <Method int String.length()>
	//*  11   20:ifne            58
		{
			int l = s.length();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #356 <Method int String.length()>
	//   14   27:istore_3        
			s1 = ((String) (new byte[l]));
	//   15   28:iload_3         
	//   16   29:newarray        byte[]
	//   17   31:astore_1        
			int i = 0;
	//   18   32:iconst_0        
	//   19   33:istore_2        
			do
			{
				obj = ((Object) (s1));
	//   20   34:aload_1         
	//   21   35:astore          7
				if(i >= l)
					continue; /* Loop/switch isn't completed */
	//   22   37:iload_2         
	//   23   38:iload_3         
	//   24   39:icmpge          9
				s1[i] = (byte)s.charAt(i);
	//   25   42:aload_1         
	//   26   43:iload_2         
	//   27   44:aload_0         
	//   28   45:iload_2         
	//   29   46:invokevirtual   #432 <Method char String.charAt(int)>
	//   30   49:int2byte        
	//   31   50:bastore         
				i++;
	//   32   51:iload_2         
	//   33   52:iconst_1        
	//   34   53:iadd            
	//   35   54:istore_2        
			} while(true);
	//   36   55:goto            34
		}
		obj = ((Object) ((ExtraEncoding)extraEncodings.get(((Object) (s1.toLowerCase())))));
	//   37   58:getstatic       #306 <Field HashMap extraEncodings>
	//   38   61:aload_1         
	//   39   62:invokevirtual   #345 <Method String String.toLowerCase()>
	//   40   65:invokevirtual   #360 <Method Object HashMap.get(Object)>
	//   41   68:checkcast       #362 <Class ExtraEncoding>
	//   42   71:astore          7
		if(obj == null)
			break; /* Loop/switch isn't completed */
	//   43   73:aload           7
	//   44   75:ifnull          98
		abyte0 = ((ExtraEncoding) (obj)).charToByte(s, s1);
	//   45   78:aload           7
	//   46   80:aload_0         
	//   47   81:aload_1         
	//   48   82:invokeinterface #434 <Method byte[] ExtraEncoding.charToByte(String, String)>
	//   49   87:astore          8
		obj = ((Object) (abyte0));
	//   50   89:aload           8
	//   51   91:astore          7
		if(abyte0 != null) goto _L4; else goto _L3
	//   52   93:aload           8
	//   53   95:ifnonnull       9
_L3:
		obj = null;
	//   54   98:aconst_null     
	//   55   99:astore          7
		int j;
		int i1;
		int j2;
		if(s1.equals("Cp1252"))
	//*  56  101:aload_1         
	//*  57  102:ldc2            #367 <String "Cp1252">
	//*  58  105:invokevirtual   #371 <Method boolean String.equals(Object)>
	//*  59  108:ifeq            200
			obj = ((Object) (winansi));
	//   60  111:getstatic       #299 <Field IntHashtable winansi>
	//   61  114:astore          7
		else
	//*  62  116:aload           7
	//*  63  118:ifnull          253
	//*  64  121:aload_0         
	//*  65  122:invokevirtual   #438 <Method char[] String.toCharArray()>
	//*  66  125:astore_1        
	//*  67  126:aload_1         
	//*  68  127:arraylength     
	//*  69  128:istore          6
	//*  70  130:iload           6
	//*  71  132:newarray        byte[]
	//*  72  134:astore_0        
	//*  73  135:iconst_0        
	//*  74  136:istore_3        
	//*  75  137:iconst_0        
	//*  76  138:istore_2        
	//*  77  139:iload_3         
	//*  78  140:iload           6
	//*  79  142:icmpge          230
	//*  80  145:aload_1         
	//*  81  146:iload_3         
	//*  82  147:caload          
	//*  83  148:istore          4
	//*  84  150:iload           4
	//*  85  152:sipush          128
	//*  86  155:icmplt          174
	//*  87  158:iload           4
	//*  88  160:sipush          160
	//*  89  163:icmple          218
	//*  90  166:iload           4
	//*  91  168:sipush          255
	//*  92  171:icmpgt          218
	//*  93  174:iload           4
	//*  94  176:ifeq            403
	//*  95  179:iload_2         
	//*  96  180:iconst_1        
	//*  97  181:iadd            
	//*  98  182:istore          5
	//*  99  184:aload_0         
	//* 100  185:iload_2         
	//* 101  186:iload           4
	//* 102  188:int2byte        
	//* 103  189:bastore         
	//* 104  190:iload           5
	//* 105  192:istore_2        
	//* 106  193:iload_3         
	//* 107  194:iconst_1        
	//* 108  195:iadd            
	//* 109  196:istore_3        
	//* 110  197:goto            139
		if(s1.equals("PDF"))
	//* 111  200:aload_1         
	//* 112  201:ldc2            #373 <String "PDF">
	//* 113  204:invokevirtual   #371 <Method boolean String.equals(Object)>
	//* 114  207:ifeq            116
			obj = ((Object) (pdfEncoding));
	//  115  210:getstatic       #301 <Field IntHashtable pdfEncoding>
	//  116  213:astore          7
		if(obj == null)
			break; /* Loop/switch isn't completed */
		s1 = ((String) (s.toCharArray()));
		j2 = s1.length;
		s = ((String) (new byte[j2]));
		i1 = 0;
		j = 0;
		while(i1 < j2) 
		{
			int k1 = ((int) (s1[i1]));
			if(k1 >= '\200' && (k1 <= '\240' || k1 > '\377'))
	//* 117  215:goto            116
				k1 = ((IntHashtable) (obj)).get(k1);
	//  118  218:aload           7
	//  119  220:iload           4
	//  120  222:invokevirtual   #376 <Method int IntHashtable.get(int)>
	//  121  225:istore          4
			if(k1 != 0)
			{
				int i2 = j + 1;
				s[j] = (byte)k1;
				j = i2;
			}
			i1++;
		}
	//* 122  227:goto            174
		obj = ((Object) (s));
	//  123  230:aload_0         
	//  124  231:astore          7
		if(j != j2)
	//* 125  233:iload_2         
	//* 126  234:iload           6
	//* 127  236:icmpeq          9
		{
			s1 = ((String) (new byte[j]));
	//  128  239:iload_2         
	//  129  240:newarray        byte[]
	//  130  242:astore_1        
			System.arraycopy(((Object) (s)), 0, ((Object) (s1)), 0, j);
	//  131  243:aload_0         
	//  132  244:iconst_0        
	//  133  245:aload_1         
	//  134  246:iconst_0        
	//  135  247:iload_2         
	//  136  248:invokestatic    #444 <Method void System.arraycopy(Object, int, Object, int, int)>
			return ((byte []) (s1));
	//  137  251:aload_1         
	//  138  252:areturn         
		}
		if(true) goto _L4; else goto _L5
_L5:
label0:
		{
			if(!s1.equals("UnicodeBig"))
				break label0;
	//  139  253:aload_1         
	//  140  254:ldc2            #378 <String "UnicodeBig">
	//  141  257:invokevirtual   #371 <Method boolean String.equals(Object)>
	//  142  260:ifeq            345
			s1 = ((String) (s.toCharArray()));
	//  143  263:aload_0         
	//  144  264:invokevirtual   #438 <Method char[] String.toCharArray()>
	//  145  267:astore_1        
			int l1 = s1.length;
	//  146  268:aload_1         
	//  147  269:arraylength     
	//  148  270:istore          4
			s = ((String) (new byte[s1.length * 2 + 2]));
	//  149  272:aload_1         
	//  150  273:arraylength     
	//  151  274:iconst_2        
	//  152  275:imul            
	//  153  276:iconst_2        
	//  154  277:iadd            
	//  155  278:newarray        byte[]
	//  156  280:astore_0        
			s[0] = -2;
	//  157  281:aload_0         
	//  158  282:iconst_0        
	//  159  283:bipush          -2
	//  160  285:bastore         
			s[1] = -1;
	//  161  286:aload_0         
	//  162  287:iconst_1        
	//  163  288:iconst_m1       
	//  164  289:bastore         
			int k = 0;
	//  165  290:iconst_0        
	//  166  291:istore_2        
			int j1 = 2;
	//  167  292:iconst_2        
	//  168  293:istore_3        
			do
			{
				obj = ((Object) (s));
	//  169  294:aload_0         
	//  170  295:astore          7
				if(k >= l1)
					break;
	//  171  297:iload_2         
	//  172  298:iload           4
	//  173  300:icmpge          9
				char c = s1[k];
	//  174  303:aload_1         
	//  175  304:iload_2         
	//  176  305:caload          
	//  177  306:istore          5
				int k2 = j1 + 1;
	//  178  308:iload_3         
	//  179  309:iconst_1        
	//  180  310:iadd            
	//  181  311:istore          6
				s[j1] = (byte)(c >> 8);
	//  182  313:aload_0         
	//  183  314:iload_3         
	//  184  315:iload           5
	//  185  317:bipush          8
	//  186  319:ishr            
	//  187  320:int2byte        
	//  188  321:bastore         
				j1 = k2 + 1;
	//  189  322:iload           6
	//  190  324:iconst_1        
	//  191  325:iadd            
	//  192  326:istore_3        
				s[k2] = (byte)(c & 0xff);
	//  193  327:aload_0         
	//  194  328:iload           6
	//  195  330:iload           5
	//  196  332:sipush          255
	//  197  335:iand            
	//  198  336:int2byte        
	//  199  337:bastore         
				k++;
	//  200  338:iload_2         
	//  201  339:iconst_1        
	//  202  340:iadd            
	//  203  341:istore_2        
			} while(true);
	//  204  342:goto            294
		}
		if(true) goto _L4; else goto _L6
_L6:
		try
		{
			s1 = ((String) (Charset.forName(s1).newEncoder()));
	//  205  345:aload_1         
	//  206  346:invokestatic    #384 <Method Charset Charset.forName(String)>
	//  207  349:invokevirtual   #388 <Method CharsetEncoder Charset.newEncoder()>
	//  208  352:astore_1        
			((CharsetEncoder) (s1)).onUnmappableCharacter(CodingErrorAction.IGNORE);
	//  209  353:aload_1         
	//  210  354:getstatic       #394 <Field CodingErrorAction CodingErrorAction.IGNORE>
	//  211  357:invokevirtual   #400 <Method CharsetEncoder CharsetEncoder.onUnmappableCharacter(CodingErrorAction)>
	//  212  360:pop             
			s = ((String) (((CharsetEncoder) (s1)).encode(CharBuffer.wrap(s.toCharArray()))));
	//  213  361:aload_1         
	//  214  362:aload_0         
	//  215  363:invokevirtual   #438 <Method char[] String.toCharArray()>
	//  216  366:invokestatic    #406 <Method CharBuffer CharBuffer.wrap(char[])>
	//  217  369:invokevirtual   #410 <Method ByteBuffer CharsetEncoder.encode(CharBuffer)>
	//  218  372:astore_0        
			((ByteBuffer) (s)).rewind();
	//  219  373:aload_0         
	//  220  374:invokevirtual   #416 <Method java.nio.Buffer ByteBuffer.rewind()>
	//  221  377:pop             
			s1 = ((String) (new byte[((ByteBuffer) (s)).limit()]));
	//  222  378:aload_0         
	//  223  379:invokevirtual   #419 <Method int ByteBuffer.limit()>
	//  224  382:newarray        byte[]
	//  225  384:astore_1        
			((ByteBuffer) (s)).get(((byte []) (s1)));
	//  226  385:aload_0         
	//  227  386:aload_1         
	//  228  387:invokevirtual   #422 <Method ByteBuffer ByteBuffer.get(byte[])>
	//  229  390:pop             
		}
	//* 230  391:aload_1         
	//* 231  392:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 232  393:astore_0        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//  233  394:new             #424 <Class ExceptionConverter>
	//  234  397:dup             
	//  235  398:aload_0         
	//  236  399:invokespecial   #427 <Method void ExceptionConverter(Exception)>
	//  237  402:athrow          
		}
		return ((byte []) (s1));
	//* 238  403:goto            193
	}

	public static final String convertToString(byte abyte0[], String s)
	{
		if(abyte0 != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       12
_L1:
		Object obj = "";
	//    2    4:ldc2            #450 <String "">
	//    3    7:astore          4
_L4:
		return ((String) (obj));
	//    4    9:aload           4
	//    5   11:areturn         
_L2:
		String s1;
		if(s == null || s.length() == 0)
	//*   6   12:aload_1         
	//*   7   13:ifnull          23
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #356 <Method int String.length()>
	//*  10   20:ifne            63
		{
			s = ((String) (new char[abyte0.length]));
	//   11   23:aload_0         
	//   12   24:arraylength     
	//   13   25:newarray        char[]
	//   14   27:astore_1        
			for(int i = 0; i < abyte0.length; i++)
	//*  15   28:iconst_0        
	//*  16   29:istore_2        
	//*  17   30:iload_2         
	//*  18   31:aload_0         
	//*  19   32:arraylength     
	//*  20   33:icmpge          54
				s[i] = (char)(abyte0[i] & 0xff);
	//   21   36:aload_1         
	//   22   37:iload_2         
	//   23   38:aload_0         
	//   24   39:iload_2         
	//   25   40:baload          
	//   26   41:sipush          255
	//   27   44:iand            
	//   28   45:int2char        
	//   29   46:castore         

	//   30   47:iload_2         
	//   31   48:iconst_1        
	//   32   49:iadd            
	//   33   50:istore_2        
	//*  34   51:goto            30
			return new String(((char []) (s)));
	//   35   54:new             #341 <Class String>
	//   36   57:dup             
	//   37   58:aload_1         
	//   38   59:invokespecial   #453 <Method void String(char[])>
	//   39   62:areturn         
		}
		obj = ((Object) ((ExtraEncoding)extraEncodings.get(((Object) (s.toLowerCase())))));
	//   40   63:getstatic       #306 <Field HashMap extraEncodings>
	//   41   66:aload_1         
	//   42   67:invokevirtual   #345 <Method String String.toLowerCase()>
	//   43   70:invokevirtual   #360 <Method Object HashMap.get(Object)>
	//   44   73:checkcast       #362 <Class ExtraEncoding>
	//   45   76:astore          4
		if(obj == null)
			break; /* Loop/switch isn't completed */
	//   46   78:aload           4
	//   47   80:ifnull          103
		s1 = ((ExtraEncoding) (obj)).byteToChar(abyte0, s);
	//   48   83:aload           4
	//   49   85:aload_0         
	//   50   86:aload_1         
	//   51   87:invokeinterface #456 <Method String ExtraEncoding.byteToChar(byte[], String)>
	//   52   92:astore          5
		obj = ((Object) (s1));
	//   53   94:aload           5
	//   54   96:astore          4
		if(s1 != null) goto _L4; else goto _L3
	//   55   98:aload           5
	//   56  100:ifnonnull       9
_L3:
		char ac[] = null;
	//   57  103:aconst_null     
	//   58  104:astore          4
		if(s.equals("Cp1252"))
	//*  59  106:aload_1         
	//*  60  107:ldc2            #367 <String "Cp1252">
	//*  61  110:invokevirtual   #371 <Method boolean String.equals(Object)>
	//*  62  113:ifeq            160
			ac = winansiByteToChar;
	//   63  116:getstatic       #283 <Field char[] winansiByteToChar>
	//   64  119:astore          4
		else
	//*  65  121:aload           4
	//*  66  123:ifnull          187
	//*  67  126:aload_0         
	//*  68  127:arraylength     
	//*  69  128:istore_3        
	//*  70  129:iload_3         
	//*  71  130:newarray        char[]
	//*  72  132:astore_1        
	//*  73  133:iconst_0        
	//*  74  134:istore_2        
	//*  75  135:iload_2         
	//*  76  136:iload_3         
	//*  77  137:icmpge          178
	//*  78  140:aload_1         
	//*  79  141:iload_2         
	//*  80  142:aload           4
	//*  81  144:aload_0         
	//*  82  145:iload_2         
	//*  83  146:baload          
	//*  84  147:sipush          255
	//*  85  150:iand            
	//*  86  151:caload          
	//*  87  152:castore         
	//*  88  153:iload_2         
	//*  89  154:iconst_1        
	//*  90  155:iadd            
	//*  91  156:istore_2        
	//*  92  157:goto            135
		if(s.equals("PDF"))
	//*  93  160:aload_1         
	//*  94  161:ldc2            #373 <String "PDF">
	//*  95  164:invokevirtual   #371 <Method boolean String.equals(Object)>
	//*  96  167:ifeq            121
			ac = pdfEncodingByteToChar;
	//   97  170:getstatic       #292 <Field char[] pdfEncodingByteToChar>
	//   98  173:astore          4
		if(ac != null)
		{
			int k = abyte0.length;
			s = ((String) (new char[k]));
			for(int j = 0; j < k; j++)
				s[j] = ac[abyte0[j] & 0xff];

	//*  99  175:goto            121
			return new String(((char []) (s)));
	//  100  178:new             #341 <Class String>
	//  101  181:dup             
	//  102  182:aload_1         
	//  103  183:invokespecial   #453 <Method void String(char[])>
	//  104  186:areturn         
		} else
		{
			try
			{
				abyte0 = ((byte []) (new String(abyte0, s)));
	//  105  187:new             #341 <Class String>
	//  106  190:dup             
	//  107  191:aload_0         
	//  108  192:aload_1         
	//  109  193:invokespecial   #459 <Method void String(byte[], String)>
	//  110  196:astore_0        
			}
	//* 111  197:aload_0         
	//* 112  198:areturn         
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
	//* 113  199:astore_0        
			{
				throw new ExceptionConverter(((Exception) (abyte0)));
	//  114  200:new             #424 <Class ExceptionConverter>
	//  115  203:dup             
	//  116  204:aload_0         
	//  117  205:invokespecial   #427 <Method void ExceptionConverter(Exception)>
	//  118  208:athrow          
			}
			return ((String) (abyte0));
		}
	}

	public static boolean isPdfDocEncoding(String s)
	{
		if(s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
	//*   2    4:iconst_1        
	//*   3    5:ireturn         
		{
			int j = s.length();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #356 <Method int String.length()>
	//    6   10:istore_2        
			int i = 0;
	//    7   11:iconst_0        
	//    8   12:istore_1        
			while(i < j) 
	//*   9   13:iload_1         
	//*  10   14:iload_2         
	//*  11   15:icmpge          4
			{
				char c = s.charAt(i);
	//   12   18:aload_0         
	//   13   19:iload_1         
	//   14   20:invokevirtual   #432 <Method char String.charAt(int)>
	//   15   23:istore_3        
				if(c < '\200' || c > '\240' && c <= '\377' || pdfEncoding.containsKey(((int) (c))))
	//*  16   24:iload_3         
	//*  17   25:sipush          128
	//*  18   28:icmplt          45
	//*  19   31:iload_3         
	//*  20   32:sipush          160
	//*  21   35:icmple          52
	//*  22   38:iload_3         
	//*  23   39:sipush          255
	//*  24   42:icmpgt          52
					i++;
	//   25   45:iload_1         
	//   26   46:iconst_1        
	//   27   47:iadd            
	//   28   48:istore_1        
				else
	//*  29   49:goto            13
	//*  30   52:getstatic       #301 <Field IntHashtable pdfEncoding>
	//*  31   55:iload_3         
	//*  32   56:invokevirtual   #465 <Method boolean IntHashtable.containsKey(int)>
	//*  33   59:ifne            45
					return false;
	//   34   62:iconst_0        
	//   35   63:ireturn         
			}
		}
		return true;
	}

	static HashMap extraEncodings = new HashMap();
	static final IntHashtable pdfEncoding;
	static final char pdfEncodingByteToChar[] = {
		'\0', '\001', '\002', '\003', '\004', '\005', '\006', '\007', '\b', '\t', 
		'\n', '\013', '\f', '\r', '\016', '\017', '\020', '\021', '\022', '\023', 
		'\024', '\025', '\026', '\027', '\030', '\031', '\032', '\033', '\034', '\035', 
		'\036', '\037', ' ', '!', '"', '#', '$', '%', '&', '\'', 
		'(', ')', '*', '+', ',', '-', '.', '/', '0', '1', 
		'2', '3', '4', '5', '6', '7', '8', '9', ':', ';', 
		'<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 
		'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 
		'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 
		'Z', '[', '\\', ']', '^', '_', '`', 'a', 'b', 'c', 
		'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
		'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 
		'x', 'y', 'z', '{', '|', '}', '~', '\177', '\u2022', '\u2020', 
		'\u2021', '\u2026', '\u2014', '\u2013', '\u0192', '\u2044', '\u2039', '\u203A', '\u2212', '\u2030', 
		'\u201E', '\u201C', '\u201D', '\u2018', '\u2019', '\u201A', '\u2122', '\uFB01', '\uFB02', '\u0141', 
		'\u0152', '\u0160', '\u0178', '\u017D', '\u0131', '\u0142', '\u0153', '\u0161', '\u017E', '\uFFFD', 
		'\u20AC', '\241', '\242', '\243', '\244', '\245', '\246', '\247', '\250', '\251', 
		'\252', '\253', '\254', '\255', '\256', '\257', '\260', '\261', '\262', '\263', 
		'\264', '\265', '\266', '\267', '\270', '\271', '\272', '\273', '\274', '\275', 
		'\276', '\277', '\300', '\301', '\302', '\303', '\304', '\305', '\306', '\307', 
		'\310', '\311', '\312', '\313', '\314', '\315', '\316', '\317', '\320', '\321', 
		'\322', '\323', '\324', '\325', '\326', '\327', '\330', '\331', '\332', '\333', 
		'\334', '\335', '\336', '\337', '\340', '\341', '\342', '\343', '\344', '\345', 
		'\346', '\347', '\350', '\351', '\352', '\353', '\354', '\355', '\356', '\357', 
		'\360', '\361', '\362', '\363', '\364', '\365', '\366', '\367', '\370', '\371', 
		'\372', '\373', '\374', '\375', '\376', '\377'
	};
	static final IntHashtable winansi;
	static final char winansiByteToChar[] = {
		'\0', '\001', '\002', '\003', '\004', '\005', '\006', '\007', '\b', '\t', 
		'\n', '\013', '\f', '\r', '\016', '\017', '\020', '\021', '\022', '\023', 
		'\024', '\025', '\026', '\027', '\030', '\031', '\032', '\033', '\034', '\035', 
		'\036', '\037', ' ', '!', '"', '#', '$', '%', '&', '\'', 
		'(', ')', '*', '+', ',', '-', '.', '/', '0', '1', 
		'2', '3', '4', '5', '6', '7', '8', '9', ':', ';', 
		'<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 
		'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 
		'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 
		'Z', '[', '\\', ']', '^', '_', '`', 'a', 'b', 'c', 
		'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
		'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 
		'x', 'y', 'z', '{', '|', '}', '~', '\177', '\u20AC', '\uFFFD', 
		'\u201A', '\u0192', '\u201E', '\u2026', '\u2020', '\u2021', '\u02C6', '\u2030', '\u0160', '\u2039', 
		'\u0152', '\uFFFD', '\u017D', '\uFFFD', '\uFFFD', '\u2018', '\u2019', '\u201C', '\u201D', '\u2022', 
		'\u2013', '\u2014', '\u02DC', '\u2122', '\u0161', '\u203A', '\u0153', '\uFFFD', '\u017E', '\u0178', 
		'\240', '\241', '\242', '\243', '\244', '\245', '\246', '\247', '\250', '\251', 
		'\252', '\253', '\254', '\255', '\256', '\257', '\260', '\261', '\262', '\263', 
		'\264', '\265', '\266', '\267', '\270', '\271', '\272', '\273', '\274', '\275', 
		'\276', '\277', '\300', '\301', '\302', '\303', '\304', '\305', '\306', '\307', 
		'\310', '\311', '\312', '\313', '\314', '\315', '\316', '\317', '\320', '\321', 
		'\322', '\323', '\324', '\325', '\326', '\327', '\330', '\331', '\332', '\333', 
		'\334', '\335', '\336', '\337', '\340', '\341', '\342', '\343', '\344', '\345', 
		'\346', '\347', '\350', '\351', '\352', '\353', '\354', '\355', '\356', '\357', 
		'\360', '\361', '\362', '\363', '\364', '\365', '\366', '\367', '\370', '\371', 
		'\372', '\373', '\374', '\375', '\376', '\377'
	};

	static 
	{
	//    0    0:sipush          256
	//    1    3:newarray        char[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #30  <Int 0>
	//    5    9:castore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #31  <Int 1>
	//    9   14:castore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #32  <Int 2>
	//   13   19:castore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #33  <Int 3>
	//   17   24:castore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #34  <Int 4>
	//   21   29:castore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #35  <Int 5>
	//   25   34:castore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #36  <Int 6>
	//   29   40:castore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #37  <Int 7>
	//   33   46:castore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #38  <Int 8>
	//   37   52:castore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:ldc1            #39  <Int 9>
	//   41   58:castore         
	//   42   59:dup             
	//   43   60:bipush          10
	//   44   62:ldc1            #40  <Int 10>
	//   45   64:castore         
	//   46   65:dup             
	//   47   66:bipush          11
	//   48   68:ldc1            #41  <Int 11>
	//   49   70:castore         
	//   50   71:dup             
	//   51   72:bipush          12
	//   52   74:ldc1            #42  <Int 12>
	//   53   76:castore         
	//   54   77:dup             
	//   55   78:bipush          13
	//   56   80:ldc1            #43  <Int 13>
	//   57   82:castore         
	//   58   83:dup             
	//   59   84:bipush          14
	//   60   86:ldc1            #44  <Int 14>
	//   61   88:castore         
	//   62   89:dup             
	//   63   90:bipush          15
	//   64   92:ldc1            #45  <Int 15>
	//   65   94:castore         
	//   66   95:dup             
	//   67   96:bipush          16
	//   68   98:ldc1            #46  <Int 16>
	//   69  100:castore         
	//   70  101:dup             
	//   71  102:bipush          17
	//   72  104:ldc1            #47  <Int 17>
	//   73  106:castore         
	//   74  107:dup             
	//   75  108:bipush          18
	//   76  110:ldc1            #48  <Int 18>
	//   77  112:castore         
	//   78  113:dup             
	//   79  114:bipush          19
	//   80  116:ldc1            #49  <Int 19>
	//   81  118:castore         
	//   82  119:dup             
	//   83  120:bipush          20
	//   84  122:ldc1            #50  <Int 20>
	//   85  124:castore         
	//   86  125:dup             
	//   87  126:bipush          21
	//   88  128:ldc1            #51  <Int 21>
	//   89  130:castore         
	//   90  131:dup             
	//   91  132:bipush          22
	//   92  134:ldc1            #52  <Int 22>
	//   93  136:castore         
	//   94  137:dup             
	//   95  138:bipush          23
	//   96  140:ldc1            #53  <Int 23>
	//   97  142:castore         
	//   98  143:dup             
	//   99  144:bipush          24
	//  100  146:ldc1            #54  <Int 24>
	//  101  148:castore         
	//  102  149:dup             
	//  103  150:bipush          25
	//  104  152:ldc1            #55  <Int 25>
	//  105  154:castore         
	//  106  155:dup             
	//  107  156:bipush          26
	//  108  158:ldc1            #56  <Int 26>
	//  109  160:castore         
	//  110  161:dup             
	//  111  162:bipush          27
	//  112  164:ldc1            #57  <Int 27>
	//  113  166:castore         
	//  114  167:dup             
	//  115  168:bipush          28
	//  116  170:ldc1            #58  <Int 28>
	//  117  172:castore         
	//  118  173:dup             
	//  119  174:bipush          29
	//  120  176:ldc1            #59  <Int 29>
	//  121  178:castore         
	//  122  179:dup             
	//  123  180:bipush          30
	//  124  182:ldc1            #60  <Int 30>
	//  125  184:castore         
	//  126  185:dup             
	//  127  186:bipush          31
	//  128  188:ldc1            #61  <Int 31>
	//  129  190:castore         
	//  130  191:dup             
	//  131  192:bipush          32
	//  132  194:ldc1            #62  <Int 32>
	//  133  196:castore         
	//  134  197:dup             
	//  135  198:bipush          33
	//  136  200:ldc1            #63  <Int 33>
	//  137  202:castore         
	//  138  203:dup             
	//  139  204:bipush          34
	//  140  206:ldc1            #64  <Int 34>
	//  141  208:castore         
	//  142  209:dup             
	//  143  210:bipush          35
	//  144  212:ldc1            #65  <Int 35>
	//  145  214:castore         
	//  146  215:dup             
	//  147  216:bipush          36
	//  148  218:ldc1            #66  <Int 36>
	//  149  220:castore         
	//  150  221:dup             
	//  151  222:bipush          37
	//  152  224:ldc1            #67  <Int 37>
	//  153  226:castore         
	//  154  227:dup             
	//  155  228:bipush          38
	//  156  230:ldc1            #68  <Int 38>
	//  157  232:castore         
	//  158  233:dup             
	//  159  234:bipush          39
	//  160  236:ldc1            #69  <Int 39>
	//  161  238:castore         
	//  162  239:dup             
	//  163  240:bipush          40
	//  164  242:ldc1            #70  <Int 40>
	//  165  244:castore         
	//  166  245:dup             
	//  167  246:bipush          41
	//  168  248:ldc1            #71  <Int 41>
	//  169  250:castore         
	//  170  251:dup             
	//  171  252:bipush          42
	//  172  254:ldc1            #72  <Int 42>
	//  173  256:castore         
	//  174  257:dup             
	//  175  258:bipush          43
	//  176  260:ldc1            #73  <Int 43>
	//  177  262:castore         
	//  178  263:dup             
	//  179  264:bipush          44
	//  180  266:ldc1            #74  <Int 44>
	//  181  268:castore         
	//  182  269:dup             
	//  183  270:bipush          45
	//  184  272:ldc1            #75  <Int 45>
	//  185  274:castore         
	//  186  275:dup             
	//  187  276:bipush          46
	//  188  278:ldc1            #76  <Int 46>
	//  189  280:castore         
	//  190  281:dup             
	//  191  282:bipush          47
	//  192  284:ldc1            #77  <Int 47>
	//  193  286:castore         
	//  194  287:dup             
	//  195  288:bipush          48
	//  196  290:ldc1            #78  <Int 48>
	//  197  292:castore         
	//  198  293:dup             
	//  199  294:bipush          49
	//  200  296:ldc1            #79  <Int 49>
	//  201  298:castore         
	//  202  299:dup             
	//  203  300:bipush          50
	//  204  302:ldc1            #80  <Int 50>
	//  205  304:castore         
	//  206  305:dup             
	//  207  306:bipush          51
	//  208  308:ldc1            #81  <Int 51>
	//  209  310:castore         
	//  210  311:dup             
	//  211  312:bipush          52
	//  212  314:ldc1            #82  <Int 52>
	//  213  316:castore         
	//  214  317:dup             
	//  215  318:bipush          53
	//  216  320:ldc1            #83  <Int 53>
	//  217  322:castore         
	//  218  323:dup             
	//  219  324:bipush          54
	//  220  326:ldc1            #84  <Int 54>
	//  221  328:castore         
	//  222  329:dup             
	//  223  330:bipush          55
	//  224  332:ldc1            #85  <Int 55>
	//  225  334:castore         
	//  226  335:dup             
	//  227  336:bipush          56
	//  228  338:ldc1            #86  <Int 56>
	//  229  340:castore         
	//  230  341:dup             
	//  231  342:bipush          57
	//  232  344:ldc1            #87  <Int 57>
	//  233  346:castore         
	//  234  347:dup             
	//  235  348:bipush          58
	//  236  350:ldc1            #88  <Int 58>
	//  237  352:castore         
	//  238  353:dup             
	//  239  354:bipush          59
	//  240  356:ldc1            #89  <Int 59>
	//  241  358:castore         
	//  242  359:dup             
	//  243  360:bipush          60
	//  244  362:ldc1            #90  <Int 60>
	//  245  364:castore         
	//  246  365:dup             
	//  247  366:bipush          61
	//  248  368:ldc1            #91  <Int 61>
	//  249  370:castore         
	//  250  371:dup             
	//  251  372:bipush          62
	//  252  374:ldc1            #92  <Int 62>
	//  253  376:castore         
	//  254  377:dup             
	//  255  378:bipush          63
	//  256  380:ldc1            #93  <Int 63>
	//  257  382:castore         
	//  258  383:dup             
	//  259  384:bipush          64
	//  260  386:ldc1            #94  <Int 64>
	//  261  388:castore         
	//  262  389:dup             
	//  263  390:bipush          65
	//  264  392:ldc1            #95  <Int 65>
	//  265  394:castore         
	//  266  395:dup             
	//  267  396:bipush          66
	//  268  398:ldc1            #96  <Int 66>
	//  269  400:castore         
	//  270  401:dup             
	//  271  402:bipush          67
	//  272  404:ldc1            #97  <Int 67>
	//  273  406:castore         
	//  274  407:dup             
	//  275  408:bipush          68
	//  276  410:ldc1            #98  <Int 68>
	//  277  412:castore         
	//  278  413:dup             
	//  279  414:bipush          69
	//  280  416:ldc1            #99  <Int 69>
	//  281  418:castore         
	//  282  419:dup             
	//  283  420:bipush          70
	//  284  422:ldc1            #100 <Int 70>
	//  285  424:castore         
	//  286  425:dup             
	//  287  426:bipush          71
	//  288  428:ldc1            #101 <Int 71>
	//  289  430:castore         
	//  290  431:dup             
	//  291  432:bipush          72
	//  292  434:ldc1            #102 <Int 72>
	//  293  436:castore         
	//  294  437:dup             
	//  295  438:bipush          73
	//  296  440:ldc1            #103 <Int 73>
	//  297  442:castore         
	//  298  443:dup             
	//  299  444:bipush          74
	//  300  446:ldc1            #104 <Int 74>
	//  301  448:castore         
	//  302  449:dup             
	//  303  450:bipush          75
	//  304  452:ldc1            #105 <Int 75>
	//  305  454:castore         
	//  306  455:dup             
	//  307  456:bipush          76
	//  308  458:ldc1            #106 <Int 76>
	//  309  460:castore         
	//  310  461:dup             
	//  311  462:bipush          77
	//  312  464:ldc1            #107 <Int 77>
	//  313  466:castore         
	//  314  467:dup             
	//  315  468:bipush          78
	//  316  470:ldc1            #108 <Int 78>
	//  317  472:castore         
	//  318  473:dup             
	//  319  474:bipush          79
	//  320  476:ldc1            #109 <Int 79>
	//  321  478:castore         
	//  322  479:dup             
	//  323  480:bipush          80
	//  324  482:ldc1            #110 <Int 80>
	//  325  484:castore         
	//  326  485:dup             
	//  327  486:bipush          81
	//  328  488:ldc1            #111 <Int 81>
	//  329  490:castore         
	//  330  491:dup             
	//  331  492:bipush          82
	//  332  494:ldc1            #112 <Int 82>
	//  333  496:castore         
	//  334  497:dup             
	//  335  498:bipush          83
	//  336  500:ldc1            #113 <Int 83>
	//  337  502:castore         
	//  338  503:dup             
	//  339  504:bipush          84
	//  340  506:ldc1            #114 <Int 84>
	//  341  508:castore         
	//  342  509:dup             
	//  343  510:bipush          85
	//  344  512:ldc1            #115 <Int 85>
	//  345  514:castore         
	//  346  515:dup             
	//  347  516:bipush          86
	//  348  518:ldc1            #116 <Int 86>
	//  349  520:castore         
	//  350  521:dup             
	//  351  522:bipush          87
	//  352  524:ldc1            #117 <Int 87>
	//  353  526:castore         
	//  354  527:dup             
	//  355  528:bipush          88
	//  356  530:ldc1            #118 <Int 88>
	//  357  532:castore         
	//  358  533:dup             
	//  359  534:bipush          89
	//  360  536:ldc1            #119 <Int 89>
	//  361  538:castore         
	//  362  539:dup             
	//  363  540:bipush          90
	//  364  542:ldc1            #120 <Int 90>
	//  365  544:castore         
	//  366  545:dup             
	//  367  546:bipush          91
	//  368  548:ldc1            #121 <Int 91>
	//  369  550:castore         
	//  370  551:dup             
	//  371  552:bipush          92
	//  372  554:ldc1            #122 <Int 92>
	//  373  556:castore         
	//  374  557:dup             
	//  375  558:bipush          93
	//  376  560:ldc1            #123 <Int 93>
	//  377  562:castore         
	//  378  563:dup             
	//  379  564:bipush          94
	//  380  566:ldc1            #124 <Int 94>
	//  381  568:castore         
	//  382  569:dup             
	//  383  570:bipush          95
	//  384  572:ldc1            #125 <Int 95>
	//  385  574:castore         
	//  386  575:dup             
	//  387  576:bipush          96
	//  388  578:ldc1            #126 <Int 96>
	//  389  580:castore         
	//  390  581:dup             
	//  391  582:bipush          97
	//  392  584:ldc1            #127 <Int 97>
	//  393  586:castore         
	//  394  587:dup             
	//  395  588:bipush          98
	//  396  590:ldc1            #128 <Int 98>
	//  397  592:castore         
	//  398  593:dup             
	//  399  594:bipush          99
	//  400  596:ldc1            #129 <Int 99>
	//  401  598:castore         
	//  402  599:dup             
	//  403  600:bipush          100
	//  404  602:ldc1            #130 <Int 100>
	//  405  604:castore         
	//  406  605:dup             
	//  407  606:bipush          101
	//  408  608:ldc1            #131 <Int 101>
	//  409  610:castore         
	//  410  611:dup             
	//  411  612:bipush          102
	//  412  614:ldc1            #132 <Int 102>
	//  413  616:castore         
	//  414  617:dup             
	//  415  618:bipush          103
	//  416  620:ldc1            #133 <Int 103>
	//  417  622:castore         
	//  418  623:dup             
	//  419  624:bipush          104
	//  420  626:ldc1            #134 <Int 104>
	//  421  628:castore         
	//  422  629:dup             
	//  423  630:bipush          105
	//  424  632:ldc1            #135 <Int 105>
	//  425  634:castore         
	//  426  635:dup             
	//  427  636:bipush          106
	//  428  638:ldc1            #136 <Int 106>
	//  429  640:castore         
	//  430  641:dup             
	//  431  642:bipush          107
	//  432  644:ldc1            #137 <Int 107>
	//  433  646:castore         
	//  434  647:dup             
	//  435  648:bipush          108
	//  436  650:ldc1            #138 <Int 108>
	//  437  652:castore         
	//  438  653:dup             
	//  439  654:bipush          109
	//  440  656:ldc1            #139 <Int 109>
	//  441  658:castore         
	//  442  659:dup             
	//  443  660:bipush          110
	//  444  662:ldc1            #140 <Int 110>
	//  445  664:castore         
	//  446  665:dup             
	//  447  666:bipush          111
	//  448  668:ldc1            #141 <Int 111>
	//  449  670:castore         
	//  450  671:dup             
	//  451  672:bipush          112
	//  452  674:ldc1            #142 <Int 112>
	//  453  676:castore         
	//  454  677:dup             
	//  455  678:bipush          113
	//  456  680:ldc1            #143 <Int 113>
	//  457  682:castore         
	//  458  683:dup             
	//  459  684:bipush          114
	//  460  686:ldc1            #144 <Int 114>
	//  461  688:castore         
	//  462  689:dup             
	//  463  690:bipush          115
	//  464  692:ldc1            #145 <Int 115>
	//  465  694:castore         
	//  466  695:dup             
	//  467  696:bipush          116
	//  468  698:ldc1            #146 <Int 116>
	//  469  700:castore         
	//  470  701:dup             
	//  471  702:bipush          117
	//  472  704:ldc1            #147 <Int 117>
	//  473  706:castore         
	//  474  707:dup             
	//  475  708:bipush          118
	//  476  710:ldc1            #148 <Int 118>
	//  477  712:castore         
	//  478  713:dup             
	//  479  714:bipush          119
	//  480  716:ldc1            #149 <Int 119>
	//  481  718:castore         
	//  482  719:dup             
	//  483  720:bipush          120
	//  484  722:ldc1            #150 <Int 120>
	//  485  724:castore         
	//  486  725:dup             
	//  487  726:bipush          121
	//  488  728:ldc1            #151 <Int 121>
	//  489  730:castore         
	//  490  731:dup             
	//  491  732:bipush          122
	//  492  734:ldc1            #152 <Int 122>
	//  493  736:castore         
	//  494  737:dup             
	//  495  738:bipush          123
	//  496  740:ldc1            #153 <Int 123>
	//  497  742:castore         
	//  498  743:dup             
	//  499  744:bipush          124
	//  500  746:ldc1            #154 <Int 124>
	//  501  748:castore         
	//  502  749:dup             
	//  503  750:bipush          125
	//  504  752:ldc1            #155 <Int 125>
	//  505  754:castore         
	//  506  755:dup             
	//  507  756:bipush          126
	//  508  758:ldc1            #156 <Int 126>
	//  509  760:castore         
	//  510  761:dup             
	//  511  762:bipush          127
	//  512  764:ldc1            #157 <Int 127>
	//  513  766:castore         
	//  514  767:dup             
	//  515  768:sipush          128
	//  516  771:ldc1            #158 <Int 8364>
	//  517  773:castore         
	//  518  774:dup             
	//  519  775:sipush          129
	//  520  778:ldc1            #159 <Int -3>
	//  521  780:castore         
	//  522  781:dup             
	//  523  782:sipush          130
	//  524  785:ldc1            #160 <Int 8218>
	//  525  787:castore         
	//  526  788:dup             
	//  527  789:sipush          131
	//  528  792:ldc1            #161 <Int 402>
	//  529  794:castore         
	//  530  795:dup             
	//  531  796:sipush          132
	//  532  799:ldc1            #162 <Int 8222>
	//  533  801:castore         
	//  534  802:dup             
	//  535  803:sipush          133
	//  536  806:ldc1            #163 <Int 8230>
	//  537  808:castore         
	//  538  809:dup             
	//  539  810:sipush          134
	//  540  813:ldc1            #164 <Int 8224>
	//  541  815:castore         
	//  542  816:dup             
	//  543  817:sipush          135
	//  544  820:ldc1            #165 <Int 8225>
	//  545  822:castore         
	//  546  823:dup             
	//  547  824:sipush          136
	//  548  827:ldc1            #166 <Int 710>
	//  549  829:castore         
	//  550  830:dup             
	//  551  831:sipush          137
	//  552  834:ldc1            #167 <Int 8240>
	//  553  836:castore         
	//  554  837:dup             
	//  555  838:sipush          138
	//  556  841:ldc1            #168 <Int 352>
	//  557  843:castore         
	//  558  844:dup             
	//  559  845:sipush          139
	//  560  848:ldc1            #169 <Int 8249>
	//  561  850:castore         
	//  562  851:dup             
	//  563  852:sipush          140
	//  564  855:ldc1            #170 <Int 338>
	//  565  857:castore         
	//  566  858:dup             
	//  567  859:sipush          141
	//  568  862:ldc1            #159 <Int -3>
	//  569  864:castore         
	//  570  865:dup             
	//  571  866:sipush          142
	//  572  869:ldc1            #171 <Int 381>
	//  573  871:castore         
	//  574  872:dup             
	//  575  873:sipush          143
	//  576  876:ldc1            #159 <Int -3>
	//  577  878:castore         
	//  578  879:dup             
	//  579  880:sipush          144
	//  580  883:ldc1            #159 <Int -3>
	//  581  885:castore         
	//  582  886:dup             
	//  583  887:sipush          145
	//  584  890:ldc1            #172 <Int 8216>
	//  585  892:castore         
	//  586  893:dup             
	//  587  894:sipush          146
	//  588  897:ldc1            #173 <Int 8217>
	//  589  899:castore         
	//  590  900:dup             
	//  591  901:sipush          147
	//  592  904:ldc1            #174 <Int 8220>
	//  593  906:castore         
	//  594  907:dup             
	//  595  908:sipush          148
	//  596  911:ldc1            #175 <Int 8221>
	//  597  913:castore         
	//  598  914:dup             
	//  599  915:sipush          149
	//  600  918:ldc1            #176 <Int 8226>
	//  601  920:castore         
	//  602  921:dup             
	//  603  922:sipush          150
	//  604  925:ldc1            #177 <Int 8211>
	//  605  927:castore         
	//  606  928:dup             
	//  607  929:sipush          151
	//  608  932:ldc1            #178 <Int 8212>
	//  609  934:castore         
	//  610  935:dup             
	//  611  936:sipush          152
	//  612  939:ldc1            #179 <Int 732>
	//  613  941:castore         
	//  614  942:dup             
	//  615  943:sipush          153
	//  616  946:ldc1            #180 <Int 8482>
	//  617  948:castore         
	//  618  949:dup             
	//  619  950:sipush          154
	//  620  953:ldc1            #181 <Int 353>
	//  621  955:castore         
	//  622  956:dup             
	//  623  957:sipush          155
	//  624  960:ldc1            #182 <Int 8250>
	//  625  962:castore         
	//  626  963:dup             
	//  627  964:sipush          156
	//  628  967:ldc1            #183 <Int 339>
	//  629  969:castore         
	//  630  970:dup             
	//  631  971:sipush          157
	//  632  974:ldc1            #159 <Int -3>
	//  633  976:castore         
	//  634  977:dup             
	//  635  978:sipush          158
	//  636  981:ldc1            #184 <Int 382>
	//  637  983:castore         
	//  638  984:dup             
	//  639  985:sipush          159
	//  640  988:ldc1            #185 <Int 376>
	//  641  990:castore         
	//  642  991:dup             
	//  643  992:sipush          160
	//  644  995:ldc1            #186 <Int 160>
	//  645  997:castore         
	//  646  998:dup             
	//  647  999:sipush          161
	//  648 1002:ldc1            #187 <Int 161>
	//  649 1004:castore         
	//  650 1005:dup             
	//  651 1006:sipush          162
	//  652 1009:ldc1            #188 <Int 162>
	//  653 1011:castore         
	//  654 1012:dup             
	//  655 1013:sipush          163
	//  656 1016:ldc1            #189 <Int 163>
	//  657 1018:castore         
	//  658 1019:dup             
	//  659 1020:sipush          164
	//  660 1023:ldc1            #190 <Int 164>
	//  661 1025:castore         
	//  662 1026:dup             
	//  663 1027:sipush          165
	//  664 1030:ldc1            #191 <Int 165>
	//  665 1032:castore         
	//  666 1033:dup             
	//  667 1034:sipush          166
	//  668 1037:ldc1            #192 <Int 166>
	//  669 1039:castore         
	//  670 1040:dup             
	//  671 1041:sipush          167
	//  672 1044:ldc1            #193 <Int 167>
	//  673 1046:castore         
	//  674 1047:dup             
	//  675 1048:sipush          168
	//  676 1051:ldc1            #194 <Int 168>
	//  677 1053:castore         
	//  678 1054:dup             
	//  679 1055:sipush          169
	//  680 1058:ldc1            #195 <Int 169>
	//  681 1060:castore         
	//  682 1061:dup             
	//  683 1062:sipush          170
	//  684 1065:ldc1            #196 <Int 170>
	//  685 1067:castore         
	//  686 1068:dup             
	//  687 1069:sipush          171
	//  688 1072:ldc1            #197 <Int 171>
	//  689 1074:castore         
	//  690 1075:dup             
	//  691 1076:sipush          172
	//  692 1079:ldc1            #198 <Int 172>
	//  693 1081:castore         
	//  694 1082:dup             
	//  695 1083:sipush          173
	//  696 1086:ldc1            #199 <Int 173>
	//  697 1088:castore         
	//  698 1089:dup             
	//  699 1090:sipush          174
	//  700 1093:ldc1            #200 <Int 174>
	//  701 1095:castore         
	//  702 1096:dup             
	//  703 1097:sipush          175
	//  704 1100:ldc1            #201 <Int 175>
	//  705 1102:castore         
	//  706 1103:dup             
	//  707 1104:sipush          176
	//  708 1107:ldc1            #202 <Int 176>
	//  709 1109:castore         
	//  710 1110:dup             
	//  711 1111:sipush          177
	//  712 1114:ldc1            #203 <Int 177>
	//  713 1116:castore         
	//  714 1117:dup             
	//  715 1118:sipush          178
	//  716 1121:ldc1            #204 <Int 178>
	//  717 1123:castore         
	//  718 1124:dup             
	//  719 1125:sipush          179
	//  720 1128:ldc1            #205 <Int 179>
	//  721 1130:castore         
	//  722 1131:dup             
	//  723 1132:sipush          180
	//  724 1135:ldc1            #206 <Int 180>
	//  725 1137:castore         
	//  726 1138:dup             
	//  727 1139:sipush          181
	//  728 1142:ldc1            #207 <Int 181>
	//  729 1144:castore         
	//  730 1145:dup             
	//  731 1146:sipush          182
	//  732 1149:ldc1            #208 <Int 182>
	//  733 1151:castore         
	//  734 1152:dup             
	//  735 1153:sipush          183
	//  736 1156:ldc1            #209 <Int 183>
	//  737 1158:castore         
	//  738 1159:dup             
	//  739 1160:sipush          184
	//  740 1163:ldc1            #210 <Int 184>
	//  741 1165:castore         
	//  742 1166:dup             
	//  743 1167:sipush          185
	//  744 1170:ldc1            #211 <Int 185>
	//  745 1172:castore         
	//  746 1173:dup             
	//  747 1174:sipush          186
	//  748 1177:ldc1            #212 <Int 186>
	//  749 1179:castore         
	//  750 1180:dup             
	//  751 1181:sipush          187
	//  752 1184:ldc1            #213 <Int 187>
	//  753 1186:castore         
	//  754 1187:dup             
	//  755 1188:sipush          188
	//  756 1191:ldc1            #214 <Int 188>
	//  757 1193:castore         
	//  758 1194:dup             
	//  759 1195:sipush          189
	//  760 1198:ldc1            #215 <Int 189>
	//  761 1200:castore         
	//  762 1201:dup             
	//  763 1202:sipush          190
	//  764 1205:ldc1            #216 <Int 190>
	//  765 1207:castore         
	//  766 1208:dup             
	//  767 1209:sipush          191
	//  768 1212:ldc1            #217 <Int 191>
	//  769 1214:castore         
	//  770 1215:dup             
	//  771 1216:sipush          192
	//  772 1219:ldc1            #218 <Int 192>
	//  773 1221:castore         
	//  774 1222:dup             
	//  775 1223:sipush          193
	//  776 1226:ldc1            #219 <Int 193>
	//  777 1228:castore         
	//  778 1229:dup             
	//  779 1230:sipush          194
	//  780 1233:ldc1            #220 <Int 194>
	//  781 1235:castore         
	//  782 1236:dup             
	//  783 1237:sipush          195
	//  784 1240:ldc1            #221 <Int 195>
	//  785 1242:castore         
	//  786 1243:dup             
	//  787 1244:sipush          196
	//  788 1247:ldc1            #222 <Int 196>
	//  789 1249:castore         
	//  790 1250:dup             
	//  791 1251:sipush          197
	//  792 1254:ldc1            #223 <Int 197>
	//  793 1256:castore         
	//  794 1257:dup             
	//  795 1258:sipush          198
	//  796 1261:ldc1            #224 <Int 198>
	//  797 1263:castore         
	//  798 1264:dup             
	//  799 1265:sipush          199
	//  800 1268:ldc1            #225 <Int 199>
	//  801 1270:castore         
	//  802 1271:dup             
	//  803 1272:sipush          200
	//  804 1275:ldc1            #226 <Int 200>
	//  805 1277:castore         
	//  806 1278:dup             
	//  807 1279:sipush          201
	//  808 1282:ldc1            #227 <Int 201>
	//  809 1284:castore         
	//  810 1285:dup             
	//  811 1286:sipush          202
	//  812 1289:ldc1            #228 <Int 202>
	//  813 1291:castore         
	//  814 1292:dup             
	//  815 1293:sipush          203
	//  816 1296:ldc1            #229 <Int 203>
	//  817 1298:castore         
	//  818 1299:dup             
	//  819 1300:sipush          204
	//  820 1303:ldc1            #230 <Int 204>
	//  821 1305:castore         
	//  822 1306:dup             
	//  823 1307:sipush          205
	//  824 1310:ldc1            #231 <Int 205>
	//  825 1312:castore         
	//  826 1313:dup             
	//  827 1314:sipush          206
	//  828 1317:ldc1            #232 <Int 206>
	//  829 1319:castore         
	//  830 1320:dup             
	//  831 1321:sipush          207
	//  832 1324:ldc1            #233 <Int 207>
	//  833 1326:castore         
	//  834 1327:dup             
	//  835 1328:sipush          208
	//  836 1331:ldc1            #234 <Int 208>
	//  837 1333:castore         
	//  838 1334:dup             
	//  839 1335:sipush          209
	//  840 1338:ldc1            #235 <Int 209>
	//  841 1340:castore         
	//  842 1341:dup             
	//  843 1342:sipush          210
	//  844 1345:ldc1            #236 <Int 210>
	//  845 1347:castore         
	//  846 1348:dup             
	//  847 1349:sipush          211
	//  848 1352:ldc1            #237 <Int 211>
	//  849 1354:castore         
	//  850 1355:dup             
	//  851 1356:sipush          212
	//  852 1359:ldc1            #238 <Int 212>
	//  853 1361:castore         
	//  854 1362:dup             
	//  855 1363:sipush          213
	//  856 1366:ldc1            #239 <Int 213>
	//  857 1368:castore         
	//  858 1369:dup             
	//  859 1370:sipush          214
	//  860 1373:ldc1            #240 <Int 214>
	//  861 1375:castore         
	//  862 1376:dup             
	//  863 1377:sipush          215
	//  864 1380:ldc1            #241 <Int 215>
	//  865 1382:castore         
	//  866 1383:dup             
	//  867 1384:sipush          216
	//  868 1387:ldc1            #242 <Int 216>
	//  869 1389:castore         
	//  870 1390:dup             
	//  871 1391:sipush          217
	//  872 1394:ldc1            #243 <Int 217>
	//  873 1396:castore         
	//  874 1397:dup             
	//  875 1398:sipush          218
	//  876 1401:ldc1            #244 <Int 218>
	//  877 1403:castore         
	//  878 1404:dup             
	//  879 1405:sipush          219
	//  880 1408:ldc1            #245 <Int 219>
	//  881 1410:castore         
	//  882 1411:dup             
	//  883 1412:sipush          220
	//  884 1415:ldc1            #246 <Int 220>
	//  885 1417:castore         
	//  886 1418:dup             
	//  887 1419:sipush          221
	//  888 1422:ldc1            #247 <Int 221>
	//  889 1424:castore         
	//  890 1425:dup             
	//  891 1426:sipush          222
	//  892 1429:ldc1            #248 <Int 222>
	//  893 1431:castore         
	//  894 1432:dup             
	//  895 1433:sipush          223
	//  896 1436:ldc1            #249 <Int 223>
	//  897 1438:castore         
	//  898 1439:dup             
	//  899 1440:sipush          224
	//  900 1443:ldc1            #250 <Int 224>
	//  901 1445:castore         
	//  902 1446:dup             
	//  903 1447:sipush          225
	//  904 1450:ldc1            #251 <Int 225>
	//  905 1452:castore         
	//  906 1453:dup             
	//  907 1454:sipush          226
	//  908 1457:ldc1            #252 <Int 226>
	//  909 1459:castore         
	//  910 1460:dup             
	//  911 1461:sipush          227
	//  912 1464:ldc1            #253 <Int 227>
	//  913 1466:castore         
	//  914 1467:dup             
	//  915 1468:sipush          228
	//  916 1471:ldc1            #254 <Int 228>
	//  917 1473:castore         
	//  918 1474:dup             
	//  919 1475:sipush          229
	//  920 1478:ldc1            #255 <Int 229>
	//  921 1480:castore         
	//  922 1481:dup             
	//  923 1482:sipush          230
	//  924 1485:ldc2            #256 <Int 230>
	//  925 1488:castore         
	//  926 1489:dup             
	//  927 1490:sipush          231
	//  928 1493:ldc2            #257 <Int 231>
	//  929 1496:castore         
	//  930 1497:dup             
	//  931 1498:sipush          232
	//  932 1501:ldc2            #258 <Int 232>
	//  933 1504:castore         
	//  934 1505:dup             
	//  935 1506:sipush          233
	//  936 1509:ldc2            #259 <Int 233>
	//  937 1512:castore         
	//  938 1513:dup             
	//  939 1514:sipush          234
	//  940 1517:ldc2            #260 <Int 234>
	//  941 1520:castore         
	//  942 1521:dup             
	//  943 1522:sipush          235
	//  944 1525:ldc2            #261 <Int 235>
	//  945 1528:castore         
	//  946 1529:dup             
	//  947 1530:sipush          236
	//  948 1533:ldc2            #262 <Int 236>
	//  949 1536:castore         
	//  950 1537:dup             
	//  951 1538:sipush          237
	//  952 1541:ldc2            #263 <Int 237>
	//  953 1544:castore         
	//  954 1545:dup             
	//  955 1546:sipush          238
	//  956 1549:ldc2            #264 <Int 238>
	//  957 1552:castore         
	//  958 1553:dup             
	//  959 1554:sipush          239
	//  960 1557:ldc2            #265 <Int 239>
	//  961 1560:castore         
	//  962 1561:dup             
	//  963 1562:sipush          240
	//  964 1565:ldc2            #266 <Int 240>
	//  965 1568:castore         
	//  966 1569:dup             
	//  967 1570:sipush          241
	//  968 1573:ldc2            #267 <Int 241>
	//  969 1576:castore         
	//  970 1577:dup             
	//  971 1578:sipush          242
	//  972 1581:ldc2            #268 <Int 242>
	//  973 1584:castore         
	//  974 1585:dup             
	//  975 1586:sipush          243
	//  976 1589:ldc2            #269 <Int 243>
	//  977 1592:castore         
	//  978 1593:dup             
	//  979 1594:sipush          244
	//  980 1597:ldc2            #270 <Int 244>
	//  981 1600:castore         
	//  982 1601:dup             
	//  983 1602:sipush          245
	//  984 1605:ldc2            #271 <Int 245>
	//  985 1608:castore         
	//  986 1609:dup             
	//  987 1610:sipush          246
	//  988 1613:ldc2            #272 <Int 246>
	//  989 1616:castore         
	//  990 1617:dup             
	//  991 1618:sipush          247
	//  992 1621:ldc2            #273 <Int 247>
	//  993 1624:castore         
	//  994 1625:dup             
	//  995 1626:sipush          248
	//  996 1629:ldc2            #274 <Int 248>
	//  997 1632:castore         
	//  998 1633:dup             
	//  999 1634:sipush          249
	// 1000 1637:ldc2            #275 <Int 249>
	// 1001 1640:castore         
	// 1002 1641:dup             
	// 1003 1642:sipush          250
	// 1004 1645:ldc2            #276 <Int 250>
	// 1005 1648:castore         
	// 1006 1649:dup             
	// 1007 1650:sipush          251
	// 1008 1653:ldc2            #277 <Int 251>
	// 1009 1656:castore         
	// 1010 1657:dup             
	// 1011 1658:sipush          252
	// 1012 1661:ldc2            #278 <Int 252>
	// 1013 1664:castore         
	// 1014 1665:dup             
	// 1015 1666:sipush          253
	// 1016 1669:ldc2            #279 <Int 253>
	// 1017 1672:castore         
	// 1018 1673:dup             
	// 1019 1674:sipush          254
	// 1020 1677:ldc2            #280 <Int 254>
	// 1021 1680:castore         
	// 1022 1681:dup             
	// 1023 1682:sipush          255
	// 1024 1685:ldc2            #281 <Int 255>
	// 1025 1688:castore         
	// 1026 1689:putstatic       #283 <Field char[] winansiByteToChar>
	// 1027 1692:sipush          256
	// 1028 1695:newarray        char[]
	// 1029 1697:dup             
	// 1030 1698:iconst_0        
	// 1031 1699:ldc1            #30  <Int 0>
	// 1032 1701:castore         
	// 1033 1702:dup             
	// 1034 1703:iconst_1        
	// 1035 1704:ldc1            #31  <Int 1>
	// 1036 1706:castore         
	// 1037 1707:dup             
	// 1038 1708:iconst_2        
	// 1039 1709:ldc1            #32  <Int 2>
	// 1040 1711:castore         
	// 1041 1712:dup             
	// 1042 1713:iconst_3        
	// 1043 1714:ldc1            #33  <Int 3>
	// 1044 1716:castore         
	// 1045 1717:dup             
	// 1046 1718:iconst_4        
	// 1047 1719:ldc1            #34  <Int 4>
	// 1048 1721:castore         
	// 1049 1722:dup             
	// 1050 1723:iconst_5        
	// 1051 1724:ldc1            #35  <Int 5>
	// 1052 1726:castore         
	// 1053 1727:dup             
	// 1054 1728:bipush          6
	// 1055 1730:ldc1            #36  <Int 6>
	// 1056 1732:castore         
	// 1057 1733:dup             
	// 1058 1734:bipush          7
	// 1059 1736:ldc1            #37  <Int 7>
	// 1060 1738:castore         
	// 1061 1739:dup             
	// 1062 1740:bipush          8
	// 1063 1742:ldc1            #38  <Int 8>
	// 1064 1744:castore         
	// 1065 1745:dup             
	// 1066 1746:bipush          9
	// 1067 1748:ldc1            #39  <Int 9>
	// 1068 1750:castore         
	// 1069 1751:dup             
	// 1070 1752:bipush          10
	// 1071 1754:ldc1            #40  <Int 10>
	// 1072 1756:castore         
	// 1073 1757:dup             
	// 1074 1758:bipush          11
	// 1075 1760:ldc1            #41  <Int 11>
	// 1076 1762:castore         
	// 1077 1763:dup             
	// 1078 1764:bipush          12
	// 1079 1766:ldc1            #42  <Int 12>
	// 1080 1768:castore         
	// 1081 1769:dup             
	// 1082 1770:bipush          13
	// 1083 1772:ldc1            #43  <Int 13>
	// 1084 1774:castore         
	// 1085 1775:dup             
	// 1086 1776:bipush          14
	// 1087 1778:ldc1            #44  <Int 14>
	// 1088 1780:castore         
	// 1089 1781:dup             
	// 1090 1782:bipush          15
	// 1091 1784:ldc1            #45  <Int 15>
	// 1092 1786:castore         
	// 1093 1787:dup             
	// 1094 1788:bipush          16
	// 1095 1790:ldc1            #46  <Int 16>
	// 1096 1792:castore         
	// 1097 1793:dup             
	// 1098 1794:bipush          17
	// 1099 1796:ldc1            #47  <Int 17>
	// 1100 1798:castore         
	// 1101 1799:dup             
	// 1102 1800:bipush          18
	// 1103 1802:ldc1            #48  <Int 18>
	// 1104 1804:castore         
	// 1105 1805:dup             
	// 1106 1806:bipush          19
	// 1107 1808:ldc1            #49  <Int 19>
	// 1108 1810:castore         
	// 1109 1811:dup             
	// 1110 1812:bipush          20
	// 1111 1814:ldc1            #50  <Int 20>
	// 1112 1816:castore         
	// 1113 1817:dup             
	// 1114 1818:bipush          21
	// 1115 1820:ldc1            #51  <Int 21>
	// 1116 1822:castore         
	// 1117 1823:dup             
	// 1118 1824:bipush          22
	// 1119 1826:ldc1            #52  <Int 22>
	// 1120 1828:castore         
	// 1121 1829:dup             
	// 1122 1830:bipush          23
	// 1123 1832:ldc1            #53  <Int 23>
	// 1124 1834:castore         
	// 1125 1835:dup             
	// 1126 1836:bipush          24
	// 1127 1838:ldc1            #54  <Int 24>
	// 1128 1840:castore         
	// 1129 1841:dup             
	// 1130 1842:bipush          25
	// 1131 1844:ldc1            #55  <Int 25>
	// 1132 1846:castore         
	// 1133 1847:dup             
	// 1134 1848:bipush          26
	// 1135 1850:ldc1            #56  <Int 26>
	// 1136 1852:castore         
	// 1137 1853:dup             
	// 1138 1854:bipush          27
	// 1139 1856:ldc1            #57  <Int 27>
	// 1140 1858:castore         
	// 1141 1859:dup             
	// 1142 1860:bipush          28
	// 1143 1862:ldc1            #58  <Int 28>
	// 1144 1864:castore         
	// 1145 1865:dup             
	// 1146 1866:bipush          29
	// 1147 1868:ldc1            #59  <Int 29>
	// 1148 1870:castore         
	// 1149 1871:dup             
	// 1150 1872:bipush          30
	// 1151 1874:ldc1            #60  <Int 30>
	// 1152 1876:castore         
	// 1153 1877:dup             
	// 1154 1878:bipush          31
	// 1155 1880:ldc1            #61  <Int 31>
	// 1156 1882:castore         
	// 1157 1883:dup             
	// 1158 1884:bipush          32
	// 1159 1886:ldc1            #62  <Int 32>
	// 1160 1888:castore         
	// 1161 1889:dup             
	// 1162 1890:bipush          33
	// 1163 1892:ldc1            #63  <Int 33>
	// 1164 1894:castore         
	// 1165 1895:dup             
	// 1166 1896:bipush          34
	// 1167 1898:ldc1            #64  <Int 34>
	// 1168 1900:castore         
	// 1169 1901:dup             
	// 1170 1902:bipush          35
	// 1171 1904:ldc1            #65  <Int 35>
	// 1172 1906:castore         
	// 1173 1907:dup             
	// 1174 1908:bipush          36
	// 1175 1910:ldc1            #66  <Int 36>
	// 1176 1912:castore         
	// 1177 1913:dup             
	// 1178 1914:bipush          37
	// 1179 1916:ldc1            #67  <Int 37>
	// 1180 1918:castore         
	// 1181 1919:dup             
	// 1182 1920:bipush          38
	// 1183 1922:ldc1            #68  <Int 38>
	// 1184 1924:castore         
	// 1185 1925:dup             
	// 1186 1926:bipush          39
	// 1187 1928:ldc1            #69  <Int 39>
	// 1188 1930:castore         
	// 1189 1931:dup             
	// 1190 1932:bipush          40
	// 1191 1934:ldc1            #70  <Int 40>
	// 1192 1936:castore         
	// 1193 1937:dup             
	// 1194 1938:bipush          41
	// 1195 1940:ldc1            #71  <Int 41>
	// 1196 1942:castore         
	// 1197 1943:dup             
	// 1198 1944:bipush          42
	// 1199 1946:ldc1            #72  <Int 42>
	// 1200 1948:castore         
	// 1201 1949:dup             
	// 1202 1950:bipush          43
	// 1203 1952:ldc1            #73  <Int 43>
	// 1204 1954:castore         
	// 1205 1955:dup             
	// 1206 1956:bipush          44
	// 1207 1958:ldc1            #74  <Int 44>
	// 1208 1960:castore         
	// 1209 1961:dup             
	// 1210 1962:bipush          45
	// 1211 1964:ldc1            #75  <Int 45>
	// 1212 1966:castore         
	// 1213 1967:dup             
	// 1214 1968:bipush          46
	// 1215 1970:ldc1            #76  <Int 46>
	// 1216 1972:castore         
	// 1217 1973:dup             
	// 1218 1974:bipush          47
	// 1219 1976:ldc1            #77  <Int 47>
	// 1220 1978:castore         
	// 1221 1979:dup             
	// 1222 1980:bipush          48
	// 1223 1982:ldc1            #78  <Int 48>
	// 1224 1984:castore         
	// 1225 1985:dup             
	// 1226 1986:bipush          49
	// 1227 1988:ldc1            #79  <Int 49>
	// 1228 1990:castore         
	// 1229 1991:dup             
	// 1230 1992:bipush          50
	// 1231 1994:ldc1            #80  <Int 50>
	// 1232 1996:castore         
	// 1233 1997:dup             
	// 1234 1998:bipush          51
	// 1235 2000:ldc1            #81  <Int 51>
	// 1236 2002:castore         
	// 1237 2003:dup             
	// 1238 2004:bipush          52
	// 1239 2006:ldc1            #82  <Int 52>
	// 1240 2008:castore         
	// 1241 2009:dup             
	// 1242 2010:bipush          53
	// 1243 2012:ldc1            #83  <Int 53>
	// 1244 2014:castore         
	// 1245 2015:dup             
	// 1246 2016:bipush          54
	// 1247 2018:ldc1            #84  <Int 54>
	// 1248 2020:castore         
	// 1249 2021:dup             
	// 1250 2022:bipush          55
	// 1251 2024:ldc1            #85  <Int 55>
	// 1252 2026:castore         
	// 1253 2027:dup             
	// 1254 2028:bipush          56
	// 1255 2030:ldc1            #86  <Int 56>
	// 1256 2032:castore         
	// 1257 2033:dup             
	// 1258 2034:bipush          57
	// 1259 2036:ldc1            #87  <Int 57>
	// 1260 2038:castore         
	// 1261 2039:dup             
	// 1262 2040:bipush          58
	// 1263 2042:ldc1            #88  <Int 58>
	// 1264 2044:castore         
	// 1265 2045:dup             
	// 1266 2046:bipush          59
	// 1267 2048:ldc1            #89  <Int 59>
	// 1268 2050:castore         
	// 1269 2051:dup             
	// 1270 2052:bipush          60
	// 1271 2054:ldc1            #90  <Int 60>
	// 1272 2056:castore         
	// 1273 2057:dup             
	// 1274 2058:bipush          61
	// 1275 2060:ldc1            #91  <Int 61>
	// 1276 2062:castore         
	// 1277 2063:dup             
	// 1278 2064:bipush          62
	// 1279 2066:ldc1            #92  <Int 62>
	// 1280 2068:castore         
	// 1281 2069:dup             
	// 1282 2070:bipush          63
	// 1283 2072:ldc1            #93  <Int 63>
	// 1284 2074:castore         
	// 1285 2075:dup             
	// 1286 2076:bipush          64
	// 1287 2078:ldc1            #94  <Int 64>
	// 1288 2080:castore         
	// 1289 2081:dup             
	// 1290 2082:bipush          65
	// 1291 2084:ldc1            #95  <Int 65>
	// 1292 2086:castore         
	// 1293 2087:dup             
	// 1294 2088:bipush          66
	// 1295 2090:ldc1            #96  <Int 66>
	// 1296 2092:castore         
	// 1297 2093:dup             
	// 1298 2094:bipush          67
	// 1299 2096:ldc1            #97  <Int 67>
	// 1300 2098:castore         
	// 1301 2099:dup             
	// 1302 2100:bipush          68
	// 1303 2102:ldc1            #98  <Int 68>
	// 1304 2104:castore         
	// 1305 2105:dup             
	// 1306 2106:bipush          69
	// 1307 2108:ldc1            #99  <Int 69>
	// 1308 2110:castore         
	// 1309 2111:dup             
	// 1310 2112:bipush          70
	// 1311 2114:ldc1            #100 <Int 70>
	// 1312 2116:castore         
	// 1313 2117:dup             
	// 1314 2118:bipush          71
	// 1315 2120:ldc1            #101 <Int 71>
	// 1316 2122:castore         
	// 1317 2123:dup             
	// 1318 2124:bipush          72
	// 1319 2126:ldc1            #102 <Int 72>
	// 1320 2128:castore         
	// 1321 2129:dup             
	// 1322 2130:bipush          73
	// 1323 2132:ldc1            #103 <Int 73>
	// 1324 2134:castore         
	// 1325 2135:dup             
	// 1326 2136:bipush          74
	// 1327 2138:ldc1            #104 <Int 74>
	// 1328 2140:castore         
	// 1329 2141:dup             
	// 1330 2142:bipush          75
	// 1331 2144:ldc1            #105 <Int 75>
	// 1332 2146:castore         
	// 1333 2147:dup             
	// 1334 2148:bipush          76
	// 1335 2150:ldc1            #106 <Int 76>
	// 1336 2152:castore         
	// 1337 2153:dup             
	// 1338 2154:bipush          77
	// 1339 2156:ldc1            #107 <Int 77>
	// 1340 2158:castore         
	// 1341 2159:dup             
	// 1342 2160:bipush          78
	// 1343 2162:ldc1            #108 <Int 78>
	// 1344 2164:castore         
	// 1345 2165:dup             
	// 1346 2166:bipush          79
	// 1347 2168:ldc1            #109 <Int 79>
	// 1348 2170:castore         
	// 1349 2171:dup             
	// 1350 2172:bipush          80
	// 1351 2174:ldc1            #110 <Int 80>
	// 1352 2176:castore         
	// 1353 2177:dup             
	// 1354 2178:bipush          81
	// 1355 2180:ldc1            #111 <Int 81>
	// 1356 2182:castore         
	// 1357 2183:dup             
	// 1358 2184:bipush          82
	// 1359 2186:ldc1            #112 <Int 82>
	// 1360 2188:castore         
	// 1361 2189:dup             
	// 1362 2190:bipush          83
	// 1363 2192:ldc1            #113 <Int 83>
	// 1364 2194:castore         
	// 1365 2195:dup             
	// 1366 2196:bipush          84
	// 1367 2198:ldc1            #114 <Int 84>
	// 1368 2200:castore         
	// 1369 2201:dup             
	// 1370 2202:bipush          85
	// 1371 2204:ldc1            #115 <Int 85>
	// 1372 2206:castore         
	// 1373 2207:dup             
	// 1374 2208:bipush          86
	// 1375 2210:ldc1            #116 <Int 86>
	// 1376 2212:castore         
	// 1377 2213:dup             
	// 1378 2214:bipush          87
	// 1379 2216:ldc1            #117 <Int 87>
	// 1380 2218:castore         
	// 1381 2219:dup             
	// 1382 2220:bipush          88
	// 1383 2222:ldc1            #118 <Int 88>
	// 1384 2224:castore         
	// 1385 2225:dup             
	// 1386 2226:bipush          89
	// 1387 2228:ldc1            #119 <Int 89>
	// 1388 2230:castore         
	// 1389 2231:dup             
	// 1390 2232:bipush          90
	// 1391 2234:ldc1            #120 <Int 90>
	// 1392 2236:castore         
	// 1393 2237:dup             
	// 1394 2238:bipush          91
	// 1395 2240:ldc1            #121 <Int 91>
	// 1396 2242:castore         
	// 1397 2243:dup             
	// 1398 2244:bipush          92
	// 1399 2246:ldc1            #122 <Int 92>
	// 1400 2248:castore         
	// 1401 2249:dup             
	// 1402 2250:bipush          93
	// 1403 2252:ldc1            #123 <Int 93>
	// 1404 2254:castore         
	// 1405 2255:dup             
	// 1406 2256:bipush          94
	// 1407 2258:ldc1            #124 <Int 94>
	// 1408 2260:castore         
	// 1409 2261:dup             
	// 1410 2262:bipush          95
	// 1411 2264:ldc1            #125 <Int 95>
	// 1412 2266:castore         
	// 1413 2267:dup             
	// 1414 2268:bipush          96
	// 1415 2270:ldc1            #126 <Int 96>
	// 1416 2272:castore         
	// 1417 2273:dup             
	// 1418 2274:bipush          97
	// 1419 2276:ldc1            #127 <Int 97>
	// 1420 2278:castore         
	// 1421 2279:dup             
	// 1422 2280:bipush          98
	// 1423 2282:ldc1            #128 <Int 98>
	// 1424 2284:castore         
	// 1425 2285:dup             
	// 1426 2286:bipush          99
	// 1427 2288:ldc1            #129 <Int 99>
	// 1428 2290:castore         
	// 1429 2291:dup             
	// 1430 2292:bipush          100
	// 1431 2294:ldc1            #130 <Int 100>
	// 1432 2296:castore         
	// 1433 2297:dup             
	// 1434 2298:bipush          101
	// 1435 2300:ldc1            #131 <Int 101>
	// 1436 2302:castore         
	// 1437 2303:dup             
	// 1438 2304:bipush          102
	// 1439 2306:ldc1            #132 <Int 102>
	// 1440 2308:castore         
	// 1441 2309:dup             
	// 1442 2310:bipush          103
	// 1443 2312:ldc1            #133 <Int 103>
	// 1444 2314:castore         
	// 1445 2315:dup             
	// 1446 2316:bipush          104
	// 1447 2318:ldc1            #134 <Int 104>
	// 1448 2320:castore         
	// 1449 2321:dup             
	// 1450 2322:bipush          105
	// 1451 2324:ldc1            #135 <Int 105>
	// 1452 2326:castore         
	// 1453 2327:dup             
	// 1454 2328:bipush          106
	// 1455 2330:ldc1            #136 <Int 106>
	// 1456 2332:castore         
	// 1457 2333:dup             
	// 1458 2334:bipush          107
	// 1459 2336:ldc1            #137 <Int 107>
	// 1460 2338:castore         
	// 1461 2339:dup             
	// 1462 2340:bipush          108
	// 1463 2342:ldc1            #138 <Int 108>
	// 1464 2344:castore         
	// 1465 2345:dup             
	// 1466 2346:bipush          109
	// 1467 2348:ldc1            #139 <Int 109>
	// 1468 2350:castore         
	// 1469 2351:dup             
	// 1470 2352:bipush          110
	// 1471 2354:ldc1            #140 <Int 110>
	// 1472 2356:castore         
	// 1473 2357:dup             
	// 1474 2358:bipush          111
	// 1475 2360:ldc1            #141 <Int 111>
	// 1476 2362:castore         
	// 1477 2363:dup             
	// 1478 2364:bipush          112
	// 1479 2366:ldc1            #142 <Int 112>
	// 1480 2368:castore         
	// 1481 2369:dup             
	// 1482 2370:bipush          113
	// 1483 2372:ldc1            #143 <Int 113>
	// 1484 2374:castore         
	// 1485 2375:dup             
	// 1486 2376:bipush          114
	// 1487 2378:ldc1            #144 <Int 114>
	// 1488 2380:castore         
	// 1489 2381:dup             
	// 1490 2382:bipush          115
	// 1491 2384:ldc1            #145 <Int 115>
	// 1492 2386:castore         
	// 1493 2387:dup             
	// 1494 2388:bipush          116
	// 1495 2390:ldc1            #146 <Int 116>
	// 1496 2392:castore         
	// 1497 2393:dup             
	// 1498 2394:bipush          117
	// 1499 2396:ldc1            #147 <Int 117>
	// 1500 2398:castore         
	// 1501 2399:dup             
	// 1502 2400:bipush          118
	// 1503 2402:ldc1            #148 <Int 118>
	// 1504 2404:castore         
	// 1505 2405:dup             
	// 1506 2406:bipush          119
	// 1507 2408:ldc1            #149 <Int 119>
	// 1508 2410:castore         
	// 1509 2411:dup             
	// 1510 2412:bipush          120
	// 1511 2414:ldc1            #150 <Int 120>
	// 1512 2416:castore         
	// 1513 2417:dup             
	// 1514 2418:bipush          121
	// 1515 2420:ldc1            #151 <Int 121>
	// 1516 2422:castore         
	// 1517 2423:dup             
	// 1518 2424:bipush          122
	// 1519 2426:ldc1            #152 <Int 122>
	// 1520 2428:castore         
	// 1521 2429:dup             
	// 1522 2430:bipush          123
	// 1523 2432:ldc1            #153 <Int 123>
	// 1524 2434:castore         
	// 1525 2435:dup             
	// 1526 2436:bipush          124
	// 1527 2438:ldc1            #154 <Int 124>
	// 1528 2440:castore         
	// 1529 2441:dup             
	// 1530 2442:bipush          125
	// 1531 2444:ldc1            #155 <Int 125>
	// 1532 2446:castore         
	// 1533 2447:dup             
	// 1534 2448:bipush          126
	// 1535 2450:ldc1            #156 <Int 126>
	// 1536 2452:castore         
	// 1537 2453:dup             
	// 1538 2454:bipush          127
	// 1539 2456:ldc1            #157 <Int 127>
	// 1540 2458:castore         
	// 1541 2459:dup             
	// 1542 2460:sipush          128
	// 1543 2463:ldc1            #176 <Int 8226>
	// 1544 2465:castore         
	// 1545 2466:dup             
	// 1546 2467:sipush          129
	// 1547 2470:ldc1            #164 <Int 8224>
	// 1548 2472:castore         
	// 1549 2473:dup             
	// 1550 2474:sipush          130
	// 1551 2477:ldc1            #165 <Int 8225>
	// 1552 2479:castore         
	// 1553 2480:dup             
	// 1554 2481:sipush          131
	// 1555 2484:ldc1            #163 <Int 8230>
	// 1556 2486:castore         
	// 1557 2487:dup             
	// 1558 2488:sipush          132
	// 1559 2491:ldc1            #178 <Int 8212>
	// 1560 2493:castore         
	// 1561 2494:dup             
	// 1562 2495:sipush          133
	// 1563 2498:ldc1            #177 <Int 8211>
	// 1564 2500:castore         
	// 1565 2501:dup             
	// 1566 2502:sipush          134
	// 1567 2505:ldc1            #161 <Int 402>
	// 1568 2507:castore         
	// 1569 2508:dup             
	// 1570 2509:sipush          135
	// 1571 2512:ldc2            #284 <Int 8260>
	// 1572 2515:castore         
	// 1573 2516:dup             
	// 1574 2517:sipush          136
	// 1575 2520:ldc1            #169 <Int 8249>
	// 1576 2522:castore         
	// 1577 2523:dup             
	// 1578 2524:sipush          137
	// 1579 2527:ldc1            #182 <Int 8250>
	// 1580 2529:castore         
	// 1581 2530:dup             
	// 1582 2531:sipush          138
	// 1583 2534:ldc2            #285 <Int 8722>
	// 1584 2537:castore         
	// 1585 2538:dup             
	// 1586 2539:sipush          139
	// 1587 2542:ldc1            #167 <Int 8240>
	// 1588 2544:castore         
	// 1589 2545:dup             
	// 1590 2546:sipush          140
	// 1591 2549:ldc1            #162 <Int 8222>
	// 1592 2551:castore         
	// 1593 2552:dup             
	// 1594 2553:sipush          141
	// 1595 2556:ldc1            #174 <Int 8220>
	// 1596 2558:castore         
	// 1597 2559:dup             
	// 1598 2560:sipush          142
	// 1599 2563:ldc1            #175 <Int 8221>
	// 1600 2565:castore         
	// 1601 2566:dup             
	// 1602 2567:sipush          143
	// 1603 2570:ldc1            #172 <Int 8216>
	// 1604 2572:castore         
	// 1605 2573:dup             
	// 1606 2574:sipush          144
	// 1607 2577:ldc1            #173 <Int 8217>
	// 1608 2579:castore         
	// 1609 2580:dup             
	// 1610 2581:sipush          145
	// 1611 2584:ldc1            #160 <Int 8218>
	// 1612 2586:castore         
	// 1613 2587:dup             
	// 1614 2588:sipush          146
	// 1615 2591:ldc1            #180 <Int 8482>
	// 1616 2593:castore         
	// 1617 2594:dup             
	// 1618 2595:sipush          147
	// 1619 2598:ldc2            #286 <Int -1279>
	// 1620 2601:castore         
	// 1621 2602:dup             
	// 1622 2603:sipush          148
	// 1623 2606:ldc2            #287 <Int -1278>
	// 1624 2609:castore         
	// 1625 2610:dup             
	// 1626 2611:sipush          149
	// 1627 2614:ldc2            #288 <Int 321>
	// 1628 2617:castore         
	// 1629 2618:dup             
	// 1630 2619:sipush          150
	// 1631 2622:ldc1            #170 <Int 338>
	// 1632 2624:castore         
	// 1633 2625:dup             
	// 1634 2626:sipush          151
	// 1635 2629:ldc1            #168 <Int 352>
	// 1636 2631:castore         
	// 1637 2632:dup             
	// 1638 2633:sipush          152
	// 1639 2636:ldc1            #185 <Int 376>
	// 1640 2638:castore         
	// 1641 2639:dup             
	// 1642 2640:sipush          153
	// 1643 2643:ldc1            #171 <Int 381>
	// 1644 2645:castore         
	// 1645 2646:dup             
	// 1646 2647:sipush          154
	// 1647 2650:ldc2            #289 <Int 305>
	// 1648 2653:castore         
	// 1649 2654:dup             
	// 1650 2655:sipush          155
	// 1651 2658:ldc2            #290 <Int 322>
	// 1652 2661:castore         
	// 1653 2662:dup             
	// 1654 2663:sipush          156
	// 1655 2666:ldc1            #183 <Int 339>
	// 1656 2668:castore         
	// 1657 2669:dup             
	// 1658 2670:sipush          157
	// 1659 2673:ldc1            #181 <Int 353>
	// 1660 2675:castore         
	// 1661 2676:dup             
	// 1662 2677:sipush          158
	// 1663 2680:ldc1            #184 <Int 382>
	// 1664 2682:castore         
	// 1665 2683:dup             
	// 1666 2684:sipush          159
	// 1667 2687:ldc1            #159 <Int -3>
	// 1668 2689:castore         
	// 1669 2690:dup             
	// 1670 2691:sipush          160
	// 1671 2694:ldc1            #158 <Int 8364>
	// 1672 2696:castore         
	// 1673 2697:dup             
	// 1674 2698:sipush          161
	// 1675 2701:ldc1            #187 <Int 161>
	// 1676 2703:castore         
	// 1677 2704:dup             
	// 1678 2705:sipush          162
	// 1679 2708:ldc1            #188 <Int 162>
	// 1680 2710:castore         
	// 1681 2711:dup             
	// 1682 2712:sipush          163
	// 1683 2715:ldc1            #189 <Int 163>
	// 1684 2717:castore         
	// 1685 2718:dup             
	// 1686 2719:sipush          164
	// 1687 2722:ldc1            #190 <Int 164>
	// 1688 2724:castore         
	// 1689 2725:dup             
	// 1690 2726:sipush          165
	// 1691 2729:ldc1            #191 <Int 165>
	// 1692 2731:castore         
	// 1693 2732:dup             
	// 1694 2733:sipush          166
	// 1695 2736:ldc1            #192 <Int 166>
	// 1696 2738:castore         
	// 1697 2739:dup             
	// 1698 2740:sipush          167
	// 1699 2743:ldc1            #193 <Int 167>
	// 1700 2745:castore         
	// 1701 2746:dup             
	// 1702 2747:sipush          168
	// 1703 2750:ldc1            #194 <Int 168>
	// 1704 2752:castore         
	// 1705 2753:dup             
	// 1706 2754:sipush          169
	// 1707 2757:ldc1            #195 <Int 169>
	// 1708 2759:castore         
	// 1709 2760:dup             
	// 1710 2761:sipush          170
	// 1711 2764:ldc1            #196 <Int 170>
	// 1712 2766:castore         
	// 1713 2767:dup             
	// 1714 2768:sipush          171
	// 1715 2771:ldc1            #197 <Int 171>
	// 1716 2773:castore         
	// 1717 2774:dup             
	// 1718 2775:sipush          172
	// 1719 2778:ldc1            #198 <Int 172>
	// 1720 2780:castore         
	// 1721 2781:dup             
	// 1722 2782:sipush          173
	// 1723 2785:ldc1            #199 <Int 173>
	// 1724 2787:castore         
	// 1725 2788:dup             
	// 1726 2789:sipush          174
	// 1727 2792:ldc1            #200 <Int 174>
	// 1728 2794:castore         
	// 1729 2795:dup             
	// 1730 2796:sipush          175
	// 1731 2799:ldc1            #201 <Int 175>
	// 1732 2801:castore         
	// 1733 2802:dup             
	// 1734 2803:sipush          176
	// 1735 2806:ldc1            #202 <Int 176>
	// 1736 2808:castore         
	// 1737 2809:dup             
	// 1738 2810:sipush          177
	// 1739 2813:ldc1            #203 <Int 177>
	// 1740 2815:castore         
	// 1741 2816:dup             
	// 1742 2817:sipush          178
	// 1743 2820:ldc1            #204 <Int 178>
	// 1744 2822:castore         
	// 1745 2823:dup             
	// 1746 2824:sipush          179
	// 1747 2827:ldc1            #205 <Int 179>
	// 1748 2829:castore         
	// 1749 2830:dup             
	// 1750 2831:sipush          180
	// 1751 2834:ldc1            #206 <Int 180>
	// 1752 2836:castore         
	// 1753 2837:dup             
	// 1754 2838:sipush          181
	// 1755 2841:ldc1            #207 <Int 181>
	// 1756 2843:castore         
	// 1757 2844:dup             
	// 1758 2845:sipush          182
	// 1759 2848:ldc1            #208 <Int 182>
	// 1760 2850:castore         
	// 1761 2851:dup             
	// 1762 2852:sipush          183
	// 1763 2855:ldc1            #209 <Int 183>
	// 1764 2857:castore         
	// 1765 2858:dup             
	// 1766 2859:sipush          184
	// 1767 2862:ldc1            #210 <Int 184>
	// 1768 2864:castore         
	// 1769 2865:dup             
	// 1770 2866:sipush          185
	// 1771 2869:ldc1            #211 <Int 185>
	// 1772 2871:castore         
	// 1773 2872:dup             
	// 1774 2873:sipush          186
	// 1775 2876:ldc1            #212 <Int 186>
	// 1776 2878:castore         
	// 1777 2879:dup             
	// 1778 2880:sipush          187
	// 1779 2883:ldc1            #213 <Int 187>
	// 1780 2885:castore         
	// 1781 2886:dup             
	// 1782 2887:sipush          188
	// 1783 2890:ldc1            #214 <Int 188>
	// 1784 2892:castore         
	// 1785 2893:dup             
	// 1786 2894:sipush          189
	// 1787 2897:ldc1            #215 <Int 189>
	// 1788 2899:castore         
	// 1789 2900:dup             
	// 1790 2901:sipush          190
	// 1791 2904:ldc1            #216 <Int 190>
	// 1792 2906:castore         
	// 1793 2907:dup             
	// 1794 2908:sipush          191
	// 1795 2911:ldc1            #217 <Int 191>
	// 1796 2913:castore         
	// 1797 2914:dup             
	// 1798 2915:sipush          192
	// 1799 2918:ldc1            #218 <Int 192>
	// 1800 2920:castore         
	// 1801 2921:dup             
	// 1802 2922:sipush          193
	// 1803 2925:ldc1            #219 <Int 193>
	// 1804 2927:castore         
	// 1805 2928:dup             
	// 1806 2929:sipush          194
	// 1807 2932:ldc1            #220 <Int 194>
	// 1808 2934:castore         
	// 1809 2935:dup             
	// 1810 2936:sipush          195
	// 1811 2939:ldc1            #221 <Int 195>
	// 1812 2941:castore         
	// 1813 2942:dup             
	// 1814 2943:sipush          196
	// 1815 2946:ldc1            #222 <Int 196>
	// 1816 2948:castore         
	// 1817 2949:dup             
	// 1818 2950:sipush          197
	// 1819 2953:ldc1            #223 <Int 197>
	// 1820 2955:castore         
	// 1821 2956:dup             
	// 1822 2957:sipush          198
	// 1823 2960:ldc1            #224 <Int 198>
	// 1824 2962:castore         
	// 1825 2963:dup             
	// 1826 2964:sipush          199
	// 1827 2967:ldc1            #225 <Int 199>
	// 1828 2969:castore         
	// 1829 2970:dup             
	// 1830 2971:sipush          200
	// 1831 2974:ldc1            #226 <Int 200>
	// 1832 2976:castore         
	// 1833 2977:dup             
	// 1834 2978:sipush          201
	// 1835 2981:ldc1            #227 <Int 201>
	// 1836 2983:castore         
	// 1837 2984:dup             
	// 1838 2985:sipush          202
	// 1839 2988:ldc1            #228 <Int 202>
	// 1840 2990:castore         
	// 1841 2991:dup             
	// 1842 2992:sipush          203
	// 1843 2995:ldc1            #229 <Int 203>
	// 1844 2997:castore         
	// 1845 2998:dup             
	// 1846 2999:sipush          204
	// 1847 3002:ldc1            #230 <Int 204>
	// 1848 3004:castore         
	// 1849 3005:dup             
	// 1850 3006:sipush          205
	// 1851 3009:ldc1            #231 <Int 205>
	// 1852 3011:castore         
	// 1853 3012:dup             
	// 1854 3013:sipush          206
	// 1855 3016:ldc1            #232 <Int 206>
	// 1856 3018:castore         
	// 1857 3019:dup             
	// 1858 3020:sipush          207
	// 1859 3023:ldc1            #233 <Int 207>
	// 1860 3025:castore         
	// 1861 3026:dup             
	// 1862 3027:sipush          208
	// 1863 3030:ldc1            #234 <Int 208>
	// 1864 3032:castore         
	// 1865 3033:dup             
	// 1866 3034:sipush          209
	// 1867 3037:ldc1            #235 <Int 209>
	// 1868 3039:castore         
	// 1869 3040:dup             
	// 1870 3041:sipush          210
	// 1871 3044:ldc1            #236 <Int 210>
	// 1872 3046:castore         
	// 1873 3047:dup             
	// 1874 3048:sipush          211
	// 1875 3051:ldc1            #237 <Int 211>
	// 1876 3053:castore         
	// 1877 3054:dup             
	// 1878 3055:sipush          212
	// 1879 3058:ldc1            #238 <Int 212>
	// 1880 3060:castore         
	// 1881 3061:dup             
	// 1882 3062:sipush          213
	// 1883 3065:ldc1            #239 <Int 213>
	// 1884 3067:castore         
	// 1885 3068:dup             
	// 1886 3069:sipush          214
	// 1887 3072:ldc1            #240 <Int 214>
	// 1888 3074:castore         
	// 1889 3075:dup             
	// 1890 3076:sipush          215
	// 1891 3079:ldc1            #241 <Int 215>
	// 1892 3081:castore         
	// 1893 3082:dup             
	// 1894 3083:sipush          216
	// 1895 3086:ldc1            #242 <Int 216>
	// 1896 3088:castore         
	// 1897 3089:dup             
	// 1898 3090:sipush          217
	// 1899 3093:ldc1            #243 <Int 217>
	// 1900 3095:castore         
	// 1901 3096:dup             
	// 1902 3097:sipush          218
	// 1903 3100:ldc1            #244 <Int 218>
	// 1904 3102:castore         
	// 1905 3103:dup             
	// 1906 3104:sipush          219
	// 1907 3107:ldc1            #245 <Int 219>
	// 1908 3109:castore         
	// 1909 3110:dup             
	// 1910 3111:sipush          220
	// 1911 3114:ldc1            #246 <Int 220>
	// 1912 3116:castore         
	// 1913 3117:dup             
	// 1914 3118:sipush          221
	// 1915 3121:ldc1            #247 <Int 221>
	// 1916 3123:castore         
	// 1917 3124:dup             
	// 1918 3125:sipush          222
	// 1919 3128:ldc1            #248 <Int 222>
	// 1920 3130:castore         
	// 1921 3131:dup             
	// 1922 3132:sipush          223
	// 1923 3135:ldc1            #249 <Int 223>
	// 1924 3137:castore         
	// 1925 3138:dup             
	// 1926 3139:sipush          224
	// 1927 3142:ldc1            #250 <Int 224>
	// 1928 3144:castore         
	// 1929 3145:dup             
	// 1930 3146:sipush          225
	// 1931 3149:ldc1            #251 <Int 225>
	// 1932 3151:castore         
	// 1933 3152:dup             
	// 1934 3153:sipush          226
	// 1935 3156:ldc1            #252 <Int 226>
	// 1936 3158:castore         
	// 1937 3159:dup             
	// 1938 3160:sipush          227
	// 1939 3163:ldc1            #253 <Int 227>
	// 1940 3165:castore         
	// 1941 3166:dup             
	// 1942 3167:sipush          228
	// 1943 3170:ldc1            #254 <Int 228>
	// 1944 3172:castore         
	// 1945 3173:dup             
	// 1946 3174:sipush          229
	// 1947 3177:ldc1            #255 <Int 229>
	// 1948 3179:castore         
	// 1949 3180:dup             
	// 1950 3181:sipush          230
	// 1951 3184:ldc2            #256 <Int 230>
	// 1952 3187:castore         
	// 1953 3188:dup             
	// 1954 3189:sipush          231
	// 1955 3192:ldc2            #257 <Int 231>
	// 1956 3195:castore         
	// 1957 3196:dup             
	// 1958 3197:sipush          232
	// 1959 3200:ldc2            #258 <Int 232>
	// 1960 3203:castore         
	// 1961 3204:dup             
	// 1962 3205:sipush          233
	// 1963 3208:ldc2            #259 <Int 233>
	// 1964 3211:castore         
	// 1965 3212:dup             
	// 1966 3213:sipush          234
	// 1967 3216:ldc2            #260 <Int 234>
	// 1968 3219:castore         
	// 1969 3220:dup             
	// 1970 3221:sipush          235
	// 1971 3224:ldc2            #261 <Int 235>
	// 1972 3227:castore         
	// 1973 3228:dup             
	// 1974 3229:sipush          236
	// 1975 3232:ldc2            #262 <Int 236>
	// 1976 3235:castore         
	// 1977 3236:dup             
	// 1978 3237:sipush          237
	// 1979 3240:ldc2            #263 <Int 237>
	// 1980 3243:castore         
	// 1981 3244:dup             
	// 1982 3245:sipush          238
	// 1983 3248:ldc2            #264 <Int 238>
	// 1984 3251:castore         
	// 1985 3252:dup             
	// 1986 3253:sipush          239
	// 1987 3256:ldc2            #265 <Int 239>
	// 1988 3259:castore         
	// 1989 3260:dup             
	// 1990 3261:sipush          240
	// 1991 3264:ldc2            #266 <Int 240>
	// 1992 3267:castore         
	// 1993 3268:dup             
	// 1994 3269:sipush          241
	// 1995 3272:ldc2            #267 <Int 241>
	// 1996 3275:castore         
	// 1997 3276:dup             
	// 1998 3277:sipush          242
	// 1999 3280:ldc2            #268 <Int 242>
	// 2000 3283:castore         
	// 2001 3284:dup             
	// 2002 3285:sipush          243
	// 2003 3288:ldc2            #269 <Int 243>
	// 2004 3291:castore         
	// 2005 3292:dup             
	// 2006 3293:sipush          244
	// 2007 3296:ldc2            #270 <Int 244>
	// 2008 3299:castore         
	// 2009 3300:dup             
	// 2010 3301:sipush          245
	// 2011 3304:ldc2            #271 <Int 245>
	// 2012 3307:castore         
	// 2013 3308:dup             
	// 2014 3309:sipush          246
	// 2015 3312:ldc2            #272 <Int 246>
	// 2016 3315:castore         
	// 2017 3316:dup             
	// 2018 3317:sipush          247
	// 2019 3320:ldc2            #273 <Int 247>
	// 2020 3323:castore         
	// 2021 3324:dup             
	// 2022 3325:sipush          248
	// 2023 3328:ldc2            #274 <Int 248>
	// 2024 3331:castore         
	// 2025 3332:dup             
	// 2026 3333:sipush          249
	// 2027 3336:ldc2            #275 <Int 249>
	// 2028 3339:castore         
	// 2029 3340:dup             
	// 2030 3341:sipush          250
	// 2031 3344:ldc2            #276 <Int 250>
	// 2032 3347:castore         
	// 2033 3348:dup             
	// 2034 3349:sipush          251
	// 2035 3352:ldc2            #277 <Int 251>
	// 2036 3355:castore         
	// 2037 3356:dup             
	// 2038 3357:sipush          252
	// 2039 3360:ldc2            #278 <Int 252>
	// 2040 3363:castore         
	// 2041 3364:dup             
	// 2042 3365:sipush          253
	// 2043 3368:ldc2            #279 <Int 253>
	// 2044 3371:castore         
	// 2045 3372:dup             
	// 2046 3373:sipush          254
	// 2047 3376:ldc2            #280 <Int 254>
	// 2048 3379:castore         
	// 2049 3380:dup             
	// 2050 3381:sipush          255
	// 2051 3384:ldc2            #281 <Int 255>
	// 2052 3387:castore         
	// 2053 3388:putstatic       #292 <Field char[] pdfEncodingByteToChar>
		winansi = new IntHashtable();
	// 2054 3391:new             #294 <Class IntHashtable>
	// 2055 3394:dup             
	// 2056 3395:invokespecial   #297 <Method void IntHashtable()>
	// 2057 3398:putstatic       #299 <Field IntHashtable winansi>
		pdfEncoding = new IntHashtable();
	// 2058 3401:new             #294 <Class IntHashtable>
	// 2059 3404:dup             
	// 2060 3405:invokespecial   #297 <Method void IntHashtable()>
	// 2061 3408:putstatic       #301 <Field IntHashtable pdfEncoding>
	// 2062 3411:new             #303 <Class HashMap>
	// 2063 3414:dup             
	// 2064 3415:invokespecial   #304 <Method void HashMap()>
	// 2065 3418:putstatic       #306 <Field HashMap extraEncodings>
		for(int i = 128; i < '\241'; i++)
	//*2066 3421:sipush          128
	//*2067 3424:istore_0        
	//*2068 3425:iload_0         
	//*2069 3426:sipush          161
	//*2070 3429:icmpge          3461
		{
			char c = winansiByteToChar[i];
	// 2071 3432:getstatic       #283 <Field char[] winansiByteToChar>
	// 2072 3435:iload_0         
	// 2073 3436:caload          
	// 2074 3437:istore_1        
			if(c != '\uFFFD')
	//*2075 3438:iload_1         
	//*2076 3439:ldc2            #307 <Int 65533>
	//*2077 3442:icmpeq          3454
				winansi.put(((int) (c)), i);
	// 2078 3445:getstatic       #299 <Field IntHashtable winansi>
	// 2079 3448:iload_1         
	// 2080 3449:iload_0         
	// 2081 3450:invokevirtual   #311 <Method int IntHashtable.put(int, int)>
	// 2082 3453:pop             
		}

	// 2083 3454:iload_0         
	// 2084 3455:iconst_1        
	// 2085 3456:iadd            
	// 2086 3457:istore_0        
	//*2087 3458:goto            3425
		for(int j = 128; j < '\241'; j++)
	//*2088 3461:sipush          128
	//*2089 3464:istore_0        
	//*2090 3465:iload_0         
	//*2091 3466:sipush          161
	//*2092 3469:icmpge          3501
		{
			char c1 = pdfEncodingByteToChar[j];
	// 2093 3472:getstatic       #292 <Field char[] pdfEncodingByteToChar>
	// 2094 3475:iload_0         
	// 2095 3476:caload          
	// 2096 3477:istore_1        
			if(c1 != '\uFFFD')
	//*2097 3478:iload_1         
	//*2098 3479:ldc2            #307 <Int 65533>
	//*2099 3482:icmpeq          3494
				pdfEncoding.put(((int) (c1)), j);
	// 2100 3485:getstatic       #301 <Field IntHashtable pdfEncoding>
	// 2101 3488:iload_1         
	// 2102 3489:iload_0         
	// 2103 3490:invokevirtual   #311 <Method int IntHashtable.put(int, int)>
	// 2104 3493:pop             
		}

	// 2105 3494:iload_0         
	// 2106 3495:iconst_1        
	// 2107 3496:iadd            
	// 2108 3497:istore_0        
	//*2109 3498:goto            3465
		addExtraEncoding("Wingdings", ((ExtraEncoding) (new WingdingsConversion())));
	// 2110 3501:ldc2            #313 <String "Wingdings">
	// 2111 3504:new             #17  <Class PdfEncodings$WingdingsConversion>
	// 2112 3507:dup             
	// 2113 3508:aconst_null     
	// 2114 3509:invokespecial   #316 <Method void PdfEncodings$WingdingsConversion(PdfEncodings$1)>
	// 2115 3512:invokestatic    #320 <Method void addExtraEncoding(String, ExtraEncoding)>
		addExtraEncoding("Symbol", ((ExtraEncoding) (new SymbolConversion(true))));
	// 2116 3515:ldc2            #322 <String "Symbol">
	// 2117 3518:new             #11  <Class PdfEncodings$SymbolConversion>
	// 2118 3521:dup             
	// 2119 3522:iconst_1        
	// 2120 3523:invokespecial   #325 <Method void PdfEncodings$SymbolConversion(boolean)>
	// 2121 3526:invokestatic    #320 <Method void addExtraEncoding(String, ExtraEncoding)>
		addExtraEncoding("ZapfDingbats", ((ExtraEncoding) (new SymbolConversion(false))));
	// 2122 3529:ldc2            #327 <String "ZapfDingbats">
	// 2123 3532:new             #11  <Class PdfEncodings$SymbolConversion>
	// 2124 3535:dup             
	// 2125 3536:iconst_0        
	// 2126 3537:invokespecial   #325 <Method void PdfEncodings$SymbolConversion(boolean)>
	// 2127 3540:invokestatic    #320 <Method void addExtraEncoding(String, ExtraEncoding)>
		addExtraEncoding("SymbolTT", ((ExtraEncoding) (new SymbolTTConversion())));
	// 2128 3543:ldc2            #329 <String "SymbolTT">
	// 2129 3546:new             #14  <Class PdfEncodings$SymbolTTConversion>
	// 2130 3549:dup             
	// 2131 3550:aconst_null     
	// 2132 3551:invokespecial   #330 <Method void PdfEncodings$SymbolTTConversion(PdfEncodings$1)>
	// 2133 3554:invokestatic    #320 <Method void addExtraEncoding(String, ExtraEncoding)>
		addExtraEncoding("Cp437", ((ExtraEncoding) (new Cp437Conversion())));
	// 2134 3557:ldc2            #332 <String "Cp437">
	// 2135 3560:new             #8   <Class PdfEncodings$Cp437Conversion>
	// 2136 3563:dup             
	// 2137 3564:aconst_null     
	// 2138 3565:invokespecial   #333 <Method void PdfEncodings$Cp437Conversion(PdfEncodings$1)>
	// 2139 3568:invokestatic    #320 <Method void addExtraEncoding(String, ExtraEncoding)>
	//*2140 3571:return          
	}
}
