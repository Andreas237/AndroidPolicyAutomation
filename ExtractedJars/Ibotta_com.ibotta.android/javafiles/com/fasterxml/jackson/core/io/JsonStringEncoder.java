// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;

// Referenced classes of package com.fasterxml.jackson.core.io:
//			CharTypes, UTF8Writer

public final class JsonStringEncoder
{

	public JsonStringEncoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:bipush          6
	//    4    7:newarray        char[]
	//    5    9:putfield        #35  <Field char[] _qbuf>
		char ac[] = _qbuf;
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field char[] _qbuf>
	//    8   16:astore_1        
		ac[0] = '\\';
	//    9   17:aload_1         
	//   10   18:iconst_0        
	//   11   19:bipush          92
	//   12   21:castore         
		ac[2] = '0';
	//   13   22:aload_1         
	//   14   23:iconst_2        
	//   15   24:bipush          48
	//   16   26:castore         
		ac[3] = '0';
	//   17   27:aload_1         
	//   18   28:iconst_3        
	//   19   29:bipush          48
	//   20   31:castore         
	//   21   32:return          
	}

	private int _appendByte(int i, int j, ByteArrayBuilder bytearraybuilder, int k)
	{
		bytearraybuilder.setCurrentSegmentLength(k);
	//    0    0:aload_3         
	//    1    1:iload           4
	//    2    3:invokevirtual   #43  <Method void ByteArrayBuilder.setCurrentSegmentLength(int)>
		bytearraybuilder.append(92);
	//    3    6:aload_3         
	//    4    7:bipush          92
	//    5    9:invokevirtual   #46  <Method void ByteArrayBuilder.append(int)>
		if(j < 0)
	//*   6   12:iload_2         
	//*   7   13:ifge            104
		{
			bytearraybuilder.append(117);
	//    8   16:aload_3         
	//    9   17:bipush          117
	//   10   19:invokevirtual   #46  <Method void ByteArrayBuilder.append(int)>
			if(i > 255)
	//*  11   22:iload_1         
	//*  12   23:sipush          255
	//*  13   26:icmple          66
			{
				j = i >> 8;
	//   14   29:iload_1         
	//   15   30:bipush          8
	//   16   32:ishr            
	//   17   33:istore_2        
				bytearraybuilder.append(((int) (HB[j >> 4])));
	//   18   34:aload_3         
	//   19   35:getstatic       #29  <Field byte[] HB>
	//   20   38:iload_2         
	//   21   39:iconst_4        
	//   22   40:ishr            
	//   23   41:baload          
	//   24   42:invokevirtual   #46  <Method void ByteArrayBuilder.append(int)>
				bytearraybuilder.append(((int) (HB[j & 0xf])));
	//   25   45:aload_3         
	//   26   46:getstatic       #29  <Field byte[] HB>
	//   27   49:iload_2         
	//   28   50:bipush          15
	//   29   52:iand            
	//   30   53:baload          
	//   31   54:invokevirtual   #46  <Method void ByteArrayBuilder.append(int)>
				i &= 0xff;
	//   32   57:iload_1         
	//   33   58:sipush          255
	//   34   61:iand            
	//   35   62:istore_1        
			} else
	//*  36   63:goto            78
			{
				bytearraybuilder.append(48);
	//   37   66:aload_3         
	//   38   67:bipush          48
	//   39   69:invokevirtual   #46  <Method void ByteArrayBuilder.append(int)>
				bytearraybuilder.append(48);
	//   40   72:aload_3         
	//   41   73:bipush          48
	//   42   75:invokevirtual   #46  <Method void ByteArrayBuilder.append(int)>
			}
			bytearraybuilder.append(((int) (HB[i >> 4])));
	//   43   78:aload_3         
	//   44   79:getstatic       #29  <Field byte[] HB>
	//   45   82:iload_1         
	//   46   83:iconst_4        
	//   47   84:ishr            
	//   48   85:baload          
	//   49   86:invokevirtual   #46  <Method void ByteArrayBuilder.append(int)>
			bytearraybuilder.append(((int) (HB[i & 0xf])));
	//   50   89:aload_3         
	//   51   90:getstatic       #29  <Field byte[] HB>
	//   52   93:iload_1         
	//   53   94:bipush          15
	//   54   96:iand            
	//   55   97:baload          
	//   56   98:invokevirtual   #46  <Method void ByteArrayBuilder.append(int)>
		} else
	//*  57  101:goto            110
		{
			bytearraybuilder.append(((int) ((byte)j)));
	//   58  104:aload_3         
	//   59  105:iload_2         
	//   60  106:int2byte        
	//   61  107:invokevirtual   #46  <Method void ByteArrayBuilder.append(int)>
		}
		return bytearraybuilder.getCurrentSegmentLength();
	//   62  110:aload_3         
	//   63  111:invokevirtual   #50  <Method int ByteArrayBuilder.getCurrentSegmentLength()>
	//   64  114:ireturn         
	}

	private int _appendNamed(int i, char ac[])
	{
		ac[1] = (char)i;
	//    0    0:aload_2         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:int2char        
	//    4    4:castore         
		return 2;
	//    5    5:iconst_2        
	//    6    6:ireturn         
	}

	private int _appendNumeric(int i, char ac[])
	{
		ac[1] = 'u';
	//    0    0:aload_2         
	//    1    1:iconst_1        
	//    2    2:bipush          117
	//    3    4:castore         
		char ac1[] = HC;
	//    4    5:getstatic       #23  <Field char[] HC>
	//    5    8:astore_3        
		ac[4] = ac1[i >> 4];
	//    6    9:aload_2         
	//    7   10:iconst_4        
	//    8   11:aload_3         
	//    9   12:iload_1         
	//   10   13:iconst_4        
	//   11   14:ishr            
	//   12   15:caload          
	//   13   16:castore         
		ac[5] = ac1[i & 0xf];
	//   14   17:aload_2         
	//   15   18:iconst_5        
	//   16   19:aload_3         
	//   17   20:iload_1         
	//   18   21:bipush          15
	//   19   23:iand            
	//   20   24:caload          
	//   21   25:castore         
		return 6;
	//   22   26:bipush          6
	//   23   28:ireturn         
	}

	private static int _convert(int i, int j)
	{
		if(j >= 56320 && j <= 57343)
	//*   0    0:iload_1         
	//*   1    1:ldc1            #56  <Int 56320>
	//*   2    3:icmplt          28
	//*   3    6:iload_1         
	//*   4    7:ldc1            #57  <Int 57343>
	//*   5    9:icmpgt          28
		{
			return (i - 55296 << 10) + 0x10000 + (j - 56320);
	//    6   12:iload_0         
	//    7   13:ldc1            #58  <Int 55296>
	//    8   15:isub            
	//    9   16:bipush          10
	//   10   18:ishl            
	//   11   19:ldc1            #59  <Int 0x10000>
	//   12   21:iadd            
	//   13   22:iload_1         
	//   14   23:ldc1            #56  <Int 56320>
	//   15   25:isub            
	//   16   26:iadd            
	//   17   27:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   18   28:new             #61  <Class StringBuilder>
	//   19   31:dup             
	//   20   32:invokespecial   #62  <Method void StringBuilder()>
	//   21   35:astore_2        
			stringbuilder.append("Broken surrogate pair: first char 0x");
	//   22   36:aload_2         
	//   23   37:ldc1            #64  <String "Broken surrogate pair: first char 0x">
	//   24   39:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   25   42:pop             
			stringbuilder.append(Integer.toHexString(i));
	//   26   43:aload_2         
	//   27   44:iload_0         
	//   28   45:invokestatic    #73  <Method String Integer.toHexString(int)>
	//   29   48:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   30   51:pop             
			stringbuilder.append(", second 0x");
	//   31   52:aload_2         
	//   32   53:ldc1            #75  <String ", second 0x">
	//   33   55:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   34   58:pop             
			stringbuilder.append(Integer.toHexString(j));
	//   35   59:aload_2         
	//   36   60:iload_1         
	//   37   61:invokestatic    #73  <Method String Integer.toHexString(int)>
	//   38   64:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   39   67:pop             
			stringbuilder.append("; illegal combination");
	//   40   68:aload_2         
	//   41   69:ldc1            #77  <String "; illegal combination">
	//   42   71:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   43   74:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   44   75:new             #79  <Class IllegalArgumentException>
	//   45   78:dup             
	//   46   79:aload_2         
	//   47   80:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   48   83:invokespecial   #86  <Method void IllegalArgumentException(String)>
	//   49   86:athrow          
		}
	}

	private static void _illegal(int i)
	{
		throw new IllegalArgumentException(UTF8Writer.illegalSurrogateDesc(i));
	//    0    0:new             #79  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokestatic    #92  <Method String UTF8Writer.illegalSurrogateDesc(int)>
	//    4    8:invokespecial   #86  <Method void IllegalArgumentException(String)>
	//    5   11:athrow          
	}

	public byte[] encodeAsUTF8(String s)
	{
		ByteArrayBuilder bytearraybuilder = _bytes;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field ByteArrayBuilder _bytes>
	//    2    4:astore          10
		ByteArrayBuilder bytearraybuilder1 = bytearraybuilder;
	//    3    6:aload           10
	//    4    8:astore          11
		if(bytearraybuilder == null)
	//*   5   10:aload           10
	//*   6   12:ifnonnull       31
		{
			bytearraybuilder1 = new ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler) (null)));
	//    7   15:new             #39  <Class ByteArrayBuilder>
	//    8   18:dup             
	//    9   19:aconst_null     
	//   10   20:invokespecial   #99  <Method void ByteArrayBuilder(com.fasterxml.jackson.core.util.BufferRecycler)>
	//   11   23:astore          11
			_bytes = bytearraybuilder1;
	//   12   25:aload_0         
	//   13   26:aload           11
	//   14   28:putfield        #96  <Field ByteArrayBuilder _bytes>
		}
		int j2 = s.length();
	//   15   31:aload_1         
	//   16   32:invokevirtual   #104 <Method int String.length()>
	//   17   35:istore          9
		byte abyte0[] = bytearraybuilder1.resetAndGetFirstSegment();
	//   18   37:aload           11
	//   19   39:invokevirtual   #107 <Method byte[] ByteArrayBuilder.resetAndGetFirstSegment()>
	//   20   42:astore          10
		int i1 = abyte0.length;
	//   21   44:aload           10
	//   22   46:arraylength     
	//   23   47:istore          6
		int i = 0;
	//   24   49:iconst_0        
	//   25   50:istore_2        
		int j = 0;
	//   26   51:iconst_0        
	//   27   52:istore_3        
		int k;
label0:
		do
		{
			k = j;
	//   28   53:iload_3         
	//   29   54:istore          4
			if(i >= j2)
				break;
	//   30   56:iload_2         
	//   31   57:iload           9
	//   32   59:icmpge          534
			k = i + 1;
	//   33   62:iload_2         
	//   34   63:iconst_1        
	//   35   64:iadd            
	//   36   65:istore          4
			int l = ((int) (s.charAt(i)));
	//   37   67:aload_1         
	//   38   68:iload_2         
	//   39   69:invokevirtual   #111 <Method char String.charAt(int)>
	//   40   72:istore          5
			do
			{
				if(l > 127)
					break;
	//   41   74:iload           5
	//   42   76:bipush          127
	//   43   78:icmpgt          153
				i = i1;
	//   44   81:iload           6
	//   45   83:istore_2        
				int j1 = j;
	//   46   84:iload_3         
	//   47   85:istore          7
				if(j >= i1)
	//*  48   87:iload_3         
	//*  49   88:iload           6
	//*  50   90:icmplt          107
				{
					abyte0 = bytearraybuilder1.finishCurrentSegment();
	//   51   93:aload           11
	//   52   95:invokevirtual   #114 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//   53   98:astore          10
					i = abyte0.length;
	//   54  100:aload           10
	//   55  102:arraylength     
	//   56  103:istore_2        
					j1 = 0;
	//   57  104:iconst_0        
	//   58  105:istore          7
				}
				j = j1 + 1;
	//   59  107:iload           7
	//   60  109:iconst_1        
	//   61  110:iadd            
	//   62  111:istore_3        
				abyte0[j1] = (byte)l;
	//   63  112:aload           10
	//   64  114:iload           7
	//   65  116:iload           5
	//   66  118:int2byte        
	//   67  119:bastore         
				if(k >= j2)
	//*  68  120:iload           4
	//*  69  122:iload           9
	//*  70  124:icmplt          133
				{
					k = j;
	//   71  127:iload_3         
	//   72  128:istore          4
					break label0;
	//   73  130:goto            534
				}
				l = ((int) (s.charAt(k)));
	//   74  133:aload_1         
	//   75  134:iload           4
	//   76  136:invokevirtual   #111 <Method char String.charAt(int)>
	//   77  139:istore          5
				k++;
	//   78  141:iload           4
	//   79  143:iconst_1        
	//   80  144:iadd            
	//   81  145:istore          4
				i1 = i;
	//   82  147:iload_2         
	//   83  148:istore          6
			} while(true);
	//   84  150:goto            74
			i = i1;
	//   85  153:iload           6
	//   86  155:istore_2        
			int k1 = j;
	//   87  156:iload_3         
	//   88  157:istore          7
			if(j >= i1)
	//*  89  159:iload_3         
	//*  90  160:iload           6
	//*  91  162:icmplt          179
			{
				abyte0 = bytearraybuilder1.finishCurrentSegment();
	//   92  165:aload           11
	//   93  167:invokevirtual   #114 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//   94  170:astore          10
				i = abyte0.length;
	//   95  172:aload           10
	//   96  174:arraylength     
	//   97  175:istore_2        
				k1 = 0;
	//   98  176:iconst_0        
	//   99  177:istore          7
			}
			if(l < 2048)
	//* 100  179:iload           5
	//* 101  181:sipush          2048
	//* 102  184:icmpge          210
			{
				abyte0[k1] = (byte)(l >> 6 | 0xc0);
	//  103  187:aload           10
	//  104  189:iload           7
	//  105  191:iload           5
	//  106  193:bipush          6
	//  107  195:ishr            
	//  108  196:sipush          192
	//  109  199:ior             
	//  110  200:int2byte        
	//  111  201:bastore         
				j = k1 + 1;
	//  112  202:iload           7
	//  113  204:iconst_1        
	//  114  205:iadd            
	//  115  206:istore_3        
			} else
	//* 116  207:goto            482
			if(l >= 55296 && l <= 57343)
	//* 117  210:iload           5
	//* 118  212:ldc1            #58  <Int 55296>
	//* 119  214:icmplt          409
	//* 120  217:iload           5
	//* 121  219:ldc1            #57  <Int 57343>
	//* 122  221:icmple          227
	//* 123  224:goto            409
			{
				if(l > 56319)
	//* 124  227:iload           5
	//* 125  229:ldc1            #115 <Int 56319>
	//* 126  231:icmple          239
					_illegal(l);
	//  127  234:iload           5
	//  128  236:invokestatic    #117 <Method void _illegal(int)>
				if(k >= j2)
	//* 129  239:iload           4
	//* 130  241:iload           9
	//* 131  243:icmplt          251
					_illegal(l);
	//  132  246:iload           5
	//  133  248:invokestatic    #117 <Method void _illegal(int)>
				i1 = _convert(l, ((int) (s.charAt(k))));
	//  134  251:iload           5
	//  135  253:aload_1         
	//  136  254:iload           4
	//  137  256:invokevirtual   #111 <Method char String.charAt(int)>
	//  138  259:invokestatic    #119 <Method int _convert(int, int)>
	//  139  262:istore          6
				if(i1 > 0x10ffff)
	//* 140  264:iload           6
	//* 141  266:ldc1            #120 <Int 0x10ffff>
	//* 142  268:icmple          276
					_illegal(i1);
	//  143  271:iload           6
	//  144  273:invokestatic    #117 <Method void _illegal(int)>
				int l1 = k1 + 1;
	//  145  276:iload           7
	//  146  278:iconst_1        
	//  147  279:iadd            
	//  148  280:istore          8
				abyte0[k1] = (byte)(i1 >> 18 | 0xf0);
	//  149  282:aload           10
	//  150  284:iload           7
	//  151  286:iload           6
	//  152  288:bipush          18
	//  153  290:ishr            
	//  154  291:sipush          240
	//  155  294:ior             
	//  156  295:int2byte        
	//  157  296:bastore         
				j = i;
	//  158  297:iload_2         
	//  159  298:istore_3        
				l = l1;
	//  160  299:iload           8
	//  161  301:istore          5
				if(l1 >= i)
	//* 162  303:iload           8
	//* 163  305:iload_2         
	//* 164  306:icmplt          323
				{
					abyte0 = bytearraybuilder1.finishCurrentSegment();
	//  165  309:aload           11
	//  166  311:invokevirtual   #114 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//  167  314:astore          10
					j = abyte0.length;
	//  168  316:aload           10
	//  169  318:arraylength     
	//  170  319:istore_3        
					l = 0;
	//  171  320:iconst_0        
	//  172  321:istore          5
				}
				k1 = l + 1;
	//  173  323:iload           5
	//  174  325:iconst_1        
	//  175  326:iadd            
	//  176  327:istore          7
				abyte0[l] = (byte)(i1 >> 12 & 0x3f | 0x80);
	//  177  329:aload           10
	//  178  331:iload           5
	//  179  333:iload           6
	//  180  335:bipush          12
	//  181  337:ishr            
	//  182  338:bipush          63
	//  183  340:iand            
	//  184  341:sipush          128
	//  185  344:ior             
	//  186  345:int2byte        
	//  187  346:bastore         
				i = j;
	//  188  347:iload_3         
	//  189  348:istore_2        
				l = k1;
	//  190  349:iload           7
	//  191  351:istore          5
				if(k1 >= j)
	//* 192  353:iload           7
	//* 193  355:iload_3         
	//* 194  356:icmplt          373
				{
					abyte0 = bytearraybuilder1.finishCurrentSegment();
	//  195  359:aload           11
	//  196  361:invokevirtual   #114 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//  197  364:astore          10
					i = abyte0.length;
	//  198  366:aload           10
	//  199  368:arraylength     
	//  200  369:istore_2        
					l = 0;
	//  201  370:iconst_0        
	//  202  371:istore          5
				}
				abyte0[l] = (byte)(i1 >> 6 & 0x3f | 0x80);
	//  203  373:aload           10
	//  204  375:iload           5
	//  205  377:iload           6
	//  206  379:bipush          6
	//  207  381:ishr            
	//  208  382:bipush          63
	//  209  384:iand            
	//  210  385:sipush          128
	//  211  388:ior             
	//  212  389:int2byte        
	//  213  390:bastore         
				j = l + 1;
	//  214  391:iload           5
	//  215  393:iconst_1        
	//  216  394:iadd            
	//  217  395:istore_3        
				k++;
	//  218  396:iload           4
	//  219  398:iconst_1        
	//  220  399:iadd            
	//  221  400:istore          4
				l = i1;
	//  222  402:iload           6
	//  223  404:istore          5
			} else
	//* 224  406:goto            482
			{
				int i2 = k1 + 1;
	//  225  409:iload           7
	//  226  411:iconst_1        
	//  227  412:iadd            
	//  228  413:istore          8
				abyte0[k1] = (byte)(l >> 12 | 0xe0);
	//  229  415:aload           10
	//  230  417:iload           7
	//  231  419:iload           5
	//  232  421:bipush          12
	//  233  423:ishr            
	//  234  424:sipush          224
	//  235  427:ior             
	//  236  428:int2byte        
	//  237  429:bastore         
				i1 = i;
	//  238  430:iload_2         
	//  239  431:istore          6
				j = i2;
	//  240  433:iload           8
	//  241  435:istore_3        
				if(i2 >= i)
	//* 242  436:iload           8
	//* 243  438:iload_2         
	//* 244  439:icmplt          456
				{
					abyte0 = bytearraybuilder1.finishCurrentSegment();
	//  245  442:aload           11
	//  246  444:invokevirtual   #114 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//  247  447:astore          10
					i1 = abyte0.length;
	//  248  449:aload           10
	//  249  451:arraylength     
	//  250  452:istore          6
					j = 0;
	//  251  454:iconst_0        
	//  252  455:istore_3        
				}
				i = j + 1;
	//  253  456:iload_3         
	//  254  457:iconst_1        
	//  255  458:iadd            
	//  256  459:istore_2        
				abyte0[j] = (byte)(l >> 6 & 0x3f | 0x80);
	//  257  460:aload           10
	//  258  462:iload_3         
	//  259  463:iload           5
	//  260  465:bipush          6
	//  261  467:ishr            
	//  262  468:bipush          63
	//  263  470:iand            
	//  264  471:sipush          128
	//  265  474:ior             
	//  266  475:int2byte        
	//  267  476:bastore         
				j = i;
	//  268  477:iload_2         
	//  269  478:istore_3        
				i = i1;
	//  270  479:iload           6
	//  271  481:istore_2        
			}
			i1 = i;
	//  272  482:iload_2         
	//  273  483:istore          6
			k1 = j;
	//  274  485:iload_3         
	//  275  486:istore          7
			if(j >= i)
	//* 276  488:iload_3         
	//* 277  489:iload_2         
	//* 278  490:icmplt          508
			{
				abyte0 = bytearraybuilder1.finishCurrentSegment();
	//  279  493:aload           11
	//  280  495:invokevirtual   #114 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//  281  498:astore          10
				i1 = abyte0.length;
	//  282  500:aload           10
	//  283  502:arraylength     
	//  284  503:istore          6
				k1 = 0;
	//  285  505:iconst_0        
	//  286  506:istore          7
			}
			abyte0[k1] = (byte)(l & 0x3f | 0x80);
	//  287  508:aload           10
	//  288  510:iload           7
	//  289  512:iload           5
	//  290  514:bipush          63
	//  291  516:iand            
	//  292  517:sipush          128
	//  293  520:ior             
	//  294  521:int2byte        
	//  295  522:bastore         
			i = k;
	//  296  523:iload           4
	//  297  525:istore_2        
			j = k1 + 1;
	//  298  526:iload           7
	//  299  528:iconst_1        
	//  300  529:iadd            
	//  301  530:istore_3        
		} while(true);
	//  302  531:goto            53
		return _bytes.completeAndCoalesce(k);
	//  303  534:aload_0         
	//  304  535:getfield        #96  <Field ByteArrayBuilder _bytes>
	//  305  538:iload           4
	//  306  540:invokevirtual   #124 <Method byte[] ByteArrayBuilder.completeAndCoalesce(int)>
	//  307  543:areturn         
	}

	public char[] quoteAsString(String s)
	{
		TextBuffer textbuffer = _text;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field TextBuffer _text>
	//    2    4:astore          9
		TextBuffer textbuffer1 = textbuffer;
	//    3    6:aload           9
	//    4    8:astore          10
		if(textbuffer == null)
	//*   5   10:aload           9
	//*   6   12:ifnonnull       31
		{
			textbuffer1 = new TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler) (null)));
	//    7   15:new             #130 <Class TextBuffer>
	//    8   18:dup             
	//    9   19:aconst_null     
	//   10   20:invokespecial   #131 <Method void TextBuffer(com.fasterxml.jackson.core.util.BufferRecycler)>
	//   11   23:astore          10
			_text = textbuffer1;
	//   12   25:aload_0         
	//   13   26:aload           10
	//   14   28:putfield        #128 <Field TextBuffer _text>
		}
		char ac[] = textbuffer1.emptyAndGetCurrentSegment();
	//   15   31:aload           10
	//   16   33:invokevirtual   #134 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//   17   36:astore          9
		int ai[] = CharTypes.get7BitOutputEscapes();
	//   18   38:invokestatic    #138 <Method int[] CharTypes.get7BitOutputEscapes()>
	//   19   41:astore          12
		int i1 = ai.length;
	//   20   43:aload           12
	//   21   45:arraylength     
	//   22   46:istore          7
		int j1 = s.length();
	//   23   48:aload_1         
	//   24   49:invokevirtual   #104 <Method int String.length()>
	//   25   52:istore          8
		int j = 0;
	//   26   54:iconst_0        
	//   27   55:istore          4
		int i = 0;
	//   28   57:iconst_0        
	//   29   58:istore_3        
label0:
		do
		{
			int k = i;
	//   30   59:iload_3         
	//   31   60:istore          5
			if(j < j1)
	//*  32   62:iload           4
	//*  33   64:iload           8
	//*  34   66:icmpge          290
				do
				{
					char c = s.charAt(j);
	//   35   69:aload_1         
	//   36   70:iload           4
	//   37   72:invokevirtual   #111 <Method char String.charAt(int)>
	//   38   75:istore_2        
					if(c < i1 && ai[c] != 0)
	//*  39   76:iload_2         
	//*  40   77:iload           7
	//*  41   79:icmpge          229
	//*  42   82:aload           12
	//*  43   84:iload_2         
	//*  44   85:iaload          
	//*  45   86:ifeq            229
					{
						k = ((int) (s.charAt(j)));
	//   46   89:aload_1         
	//   47   90:iload           4
	//   48   92:invokevirtual   #111 <Method char String.charAt(int)>
	//   49   95:istore          5
						int l = ai[k];
	//   50   97:aload           12
	//   51   99:iload           5
	//   52  101:iaload          
	//   53  102:istore          6
						if(l < 0)
	//*  54  104:iload           6
	//*  55  106:ifge            124
							k = _appendNumeric(k, _qbuf);
	//   56  109:aload_0         
	//   57  110:iload           5
	//   58  112:aload_0         
	//   59  113:getfield        #35  <Field char[] _qbuf>
	//   60  116:invokespecial   #140 <Method int _appendNumeric(int, char[])>
	//   61  119:istore          5
						else
	//*  62  121:goto            136
							k = _appendNamed(l, _qbuf);
	//   63  124:aload_0         
	//   64  125:iload           6
	//   65  127:aload_0         
	//   66  128:getfield        #35  <Field char[] _qbuf>
	//   67  131:invokespecial   #142 <Method int _appendNamed(int, char[])>
	//   68  134:istore          5
						l = i + k;
	//   69  136:iload_3         
	//   70  137:iload           5
	//   71  139:iadd            
	//   72  140:istore          6
						if(l > ac.length)
	//*  73  142:iload           6
	//*  74  144:aload           9
	//*  75  146:arraylength     
	//*  76  147:icmple          204
						{
							l = ac.length - i;
	//   77  150:aload           9
	//   78  152:arraylength     
	//   79  153:iload_3         
	//   80  154:isub            
	//   81  155:istore          6
							if(l > 0)
	//*  82  157:iload           6
	//*  83  159:ifle            175
								System.arraycopy(((Object) (_qbuf)), 0, ((Object) (ac)), i, l);
	//   84  162:aload_0         
	//   85  163:getfield        #35  <Field char[] _qbuf>
	//   86  166:iconst_0        
	//   87  167:aload           9
	//   88  169:iload_3         
	//   89  170:iload           6
	//   90  172:invokestatic    #148 <Method void System.arraycopy(Object, int, Object, int, int)>
							ac = textbuffer1.finishCurrentSegment();
	//   91  175:aload           10
	//   92  177:invokevirtual   #150 <Method char[] TextBuffer.finishCurrentSegment()>
	//   93  180:astore          9
							i = k - l;
	//   94  182:iload           5
	//   95  184:iload           6
	//   96  186:isub            
	//   97  187:istore_3        
							System.arraycopy(((Object) (_qbuf)), l, ((Object) (ac)), 0, i);
	//   98  188:aload_0         
	//   99  189:getfield        #35  <Field char[] _qbuf>
	//  100  192:iload           6
	//  101  194:aload           9
	//  102  196:iconst_0        
	//  103  197:iload_3         
	//  104  198:invokestatic    #148 <Method void System.arraycopy(Object, int, Object, int, int)>
						} else
	//* 105  201:goto            220
						{
							System.arraycopy(((Object) (_qbuf)), 0, ((Object) (ac)), i, k);
	//  106  204:aload_0         
	//  107  205:getfield        #35  <Field char[] _qbuf>
	//  108  208:iconst_0        
	//  109  209:aload           9
	//  110  211:iload_3         
	//  111  212:iload           5
	//  112  214:invokestatic    #148 <Method void System.arraycopy(Object, int, Object, int, int)>
							i = l;
	//  113  217:iload           6
	//  114  219:istore_3        
						}
						j++;
	//  115  220:iload           4
	//  116  222:iconst_1        
	//  117  223:iadd            
	//  118  224:istore          4
						continue label0;
	//  119  226:goto            59
					}
					char ac1[] = ac;
	//  120  229:aload           9
	//  121  231:astore          11
					k = i;
	//  122  233:iload_3         
	//  123  234:istore          5
					if(i >= ac.length)
	//* 124  236:iload_3         
	//* 125  237:aload           9
	//* 126  239:arraylength     
	//* 127  240:icmplt          253
					{
						ac1 = textbuffer1.finishCurrentSegment();
	//  128  243:aload           10
	//  129  245:invokevirtual   #150 <Method char[] TextBuffer.finishCurrentSegment()>
	//  130  248:astore          11
						k = 0;
	//  131  250:iconst_0        
	//  132  251:istore          5
					}
					i = k + 1;
	//  133  253:iload           5
	//  134  255:iconst_1        
	//  135  256:iadd            
	//  136  257:istore_3        
					ac1[k] = c;
	//  137  258:aload           11
	//  138  260:iload           5
	//  139  262:iload_2         
	//  140  263:castore         
					j++;
	//  141  264:iload           4
	//  142  266:iconst_1        
	//  143  267:iadd            
	//  144  268:istore          4
					if(j >= j1)
	//* 145  270:iload           4
	//* 146  272:iload           8
	//* 147  274:icmplt          283
					{
						k = i;
	//  148  277:iload_3         
	//  149  278:istore          5
						break;
	//  150  280:goto            290
					}
					ac = ac1;
	//  151  283:aload           11
	//  152  285:astore          9
				} while(true);
	//  153  287:goto            69
			textbuffer1.setCurrentLength(k);
	//  154  290:aload           10
	//  155  292:iload           5
	//  156  294:invokevirtual   #153 <Method void TextBuffer.setCurrentLength(int)>
			return textbuffer1.contentsAsArray();
	//  157  297:aload           10
	//  158  299:invokevirtual   #156 <Method char[] TextBuffer.contentsAsArray()>
	//  159  302:areturn         
		} while(true);
	}

	public byte[] quoteAsUTF8(String s)
	{
		ByteArrayBuilder bytearraybuilder = _bytes;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field ByteArrayBuilder _bytes>
	//    2    4:astore          8
		ByteArrayBuilder bytearraybuilder1 = bytearraybuilder;
	//    3    6:aload           8
	//    4    8:astore          10
		if(bytearraybuilder == null)
	//*   5   10:aload           8
	//*   6   12:ifnonnull       31
		{
			bytearraybuilder1 = new ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler) (null)));
	//    7   15:new             #39  <Class ByteArrayBuilder>
	//    8   18:dup             
	//    9   19:aconst_null     
	//   10   20:invokespecial   #99  <Method void ByteArrayBuilder(com.fasterxml.jackson.core.util.BufferRecycler)>
	//   11   23:astore          10
			_bytes = bytearraybuilder1;
	//   12   25:aload_0         
	//   13   26:aload           10
	//   14   28:putfield        #96  <Field ByteArrayBuilder _bytes>
		}
		int i1 = s.length();
	//   15   31:aload_1         
	//   16   32:invokevirtual   #104 <Method int String.length()>
	//   17   35:istore          6
		byte abyte0[] = bytearraybuilder1.resetAndGetFirstSegment();
	//   18   37:aload           10
	//   19   39:invokevirtual   #107 <Method byte[] ByteArrayBuilder.resetAndGetFirstSegment()>
	//   20   42:astore          8
		int j = 0;
	//   21   44:iconst_0        
	//   22   45:istore_3        
		int i = 0;
	//   23   46:iconst_0        
	//   24   47:istore_2        
		int k;
label0:
		do
		{
			k = i;
	//   25   48:iload_2         
	//   26   49:istore          4
			if(j >= i1)
				break;
	//   27   51:iload_3         
	//   28   52:iload           6
	//   29   54:icmpge          584
			int ai[] = CharTypes.get7BitOutputEscapes();
	//   30   57:invokestatic    #138 <Method int[] CharTypes.get7BitOutputEscapes()>
	//   31   60:astore          11
			byte abyte1[] = abyte0;
	//   32   62:aload           8
	//   33   64:astore          9
			do
			{
				char c = s.charAt(j);
	//   34   66:aload_1         
	//   35   67:iload_3         
	//   36   68:invokevirtual   #111 <Method char String.charAt(int)>
	//   37   71:istore          5
				if(c > '\177' || ai[c] != 0)
	//*  38   73:iload           5
	//*  39   75:bipush          127
	//*  40   77:icmpgt          151
	//*  41   80:aload           11
	//*  42   82:iload           5
	//*  43   84:iaload          
	//*  44   85:ifeq            91
					break;
	//   45   88:goto            151
				abyte0 = abyte1;
	//   46   91:aload           9
	//   47   93:astore          8
				k = i;
	//   48   95:iload_2         
	//   49   96:istore          4
				if(i >= abyte1.length)
	//*  50   98:iload_2         
	//*  51   99:aload           9
	//*  52  101:arraylength     
	//*  53  102:icmplt          115
				{
					abyte0 = bytearraybuilder1.finishCurrentSegment();
	//   54  105:aload           10
	//   55  107:invokevirtual   #114 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//   56  110:astore          8
					k = 0;
	//   57  112:iconst_0        
	//   58  113:istore          4
				}
				i = k + 1;
	//   59  115:iload           4
	//   60  117:iconst_1        
	//   61  118:iadd            
	//   62  119:istore_2        
				abyte0[k] = (byte)c;
	//   63  120:aload           8
	//   64  122:iload           4
	//   65  124:iload           5
	//   66  126:int2byte        
	//   67  127:bastore         
				j++;
	//   68  128:iload_3         
	//   69  129:iconst_1        
	//   70  130:iadd            
	//   71  131:istore_3        
				if(j >= i1)
	//*  72  132:iload_3         
	//*  73  133:iload           6
	//*  74  135:icmplt          144
				{
					k = i;
	//   75  138:iload_2         
	//   76  139:istore          4
					break label0;
	//   77  141:goto            584
				}
				abyte1 = abyte0;
	//   78  144:aload           8
	//   79  146:astore          9
			} while(true);
	//   80  148:goto            66
			abyte0 = abyte1;
	//   81  151:aload           9
	//   82  153:astore          8
			int l = i;
	//   83  155:iload_2         
	//   84  156:istore          5
			if(i >= abyte1.length)
	//*  85  158:iload_2         
	//*  86  159:aload           9
	//*  87  161:arraylength     
	//*  88  162:icmplt          175
			{
				abyte0 = bytearraybuilder1.finishCurrentSegment();
	//   89  165:aload           10
	//   90  167:invokevirtual   #114 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//   91  170:astore          8
				l = 0;
	//   92  172:iconst_0        
	//   93  173:istore          5
			}
			k = j + 1;
	//   94  175:iload_3         
	//   95  176:iconst_1        
	//   96  177:iadd            
	//   97  178:istore          4
			int j1 = ((int) (s.charAt(j)));
	//   98  180:aload_1         
	//   99  181:iload_3         
	//  100  182:invokevirtual   #111 <Method char String.charAt(int)>
	//  101  185:istore          7
			if(j1 <= 127)
	//* 102  187:iload           7
	//* 103  189:bipush          127
	//* 104  191:icmpgt          223
			{
				i = _appendByte(j1, ai[j1], bytearraybuilder1, l);
	//  105  194:aload_0         
	//  106  195:iload           7
	//  107  197:aload           11
	//  108  199:iload           7
	//  109  201:iaload          
	//  110  202:aload           10
	//  111  204:iload           5
	//  112  206:invokespecial   #159 <Method int _appendByte(int, int, ByteArrayBuilder, int)>
	//  113  209:istore_2        
				abyte0 = bytearraybuilder1.getCurrentSegment();
	//  114  210:aload           10
	//  115  212:invokevirtual   #162 <Method byte[] ByteArrayBuilder.getCurrentSegment()>
	//  116  215:astore          8
				j = k;
	//  117  217:iload           4
	//  118  219:istore_3        
			} else
	//* 119  220:goto            48
			{
				if(j1 <= 2047)
	//* 120  223:iload           7
	//* 121  225:sipush          2047
	//* 122  228:icmpgt          264
				{
					abyte0[l] = (byte)(j1 >> 6 | 0xc0);
	//  123  231:aload           8
	//  124  233:iload           5
	//  125  235:iload           7
	//  126  237:bipush          6
	//  127  239:ishr            
	//  128  240:sipush          192
	//  129  243:ior             
	//  130  244:int2byte        
	//  131  245:bastore         
					j = j1 & 0x3f | 0x80;
	//  132  246:iload           7
	//  133  248:bipush          63
	//  134  250:iand            
	//  135  251:sipush          128
	//  136  254:ior             
	//  137  255:istore_3        
					i = l + 1;
	//  138  256:iload           5
	//  139  258:iconst_1        
	//  140  259:iadd            
	//  141  260:istore_2        
				} else
	//* 142  261:goto            538
				if(j1 >= 55296 && j1 <= 57343)
	//* 143  264:iload           7
	//* 144  266:ldc1            #58  <Int 55296>
	//* 145  268:icmplt          455
	//* 146  271:iload           7
	//* 147  273:ldc1            #57  <Int 57343>
	//* 148  275:icmple          281
	//* 149  278:goto            455
				{
					if(j1 > 56319)
	//* 150  281:iload           7
	//* 151  283:ldc1            #115 <Int 56319>
	//* 152  285:icmple          293
						_illegal(j1);
	//  153  288:iload           7
	//  154  290:invokestatic    #117 <Method void _illegal(int)>
					if(k >= i1)
	//* 155  293:iload           4
	//* 156  295:iload           6
	//* 157  297:icmplt          305
						_illegal(j1);
	//  158  300:iload           7
	//  159  302:invokestatic    #117 <Method void _illegal(int)>
					j1 = _convert(j1, ((int) (s.charAt(k))));
	//  160  305:iload           7
	//  161  307:aload_1         
	//  162  308:iload           4
	//  163  310:invokevirtual   #111 <Method char String.charAt(int)>
	//  164  313:invokestatic    #119 <Method int _convert(int, int)>
	//  165  316:istore          7
					if(j1 > 0x10ffff)
	//* 166  318:iload           7
	//* 167  320:ldc1            #120 <Int 0x10ffff>
	//* 168  322:icmple          330
						_illegal(j1);
	//  169  325:iload           7
	//  170  327:invokestatic    #117 <Method void _illegal(int)>
					j = l + 1;
	//  171  330:iload           5
	//  172  332:iconst_1        
	//  173  333:iadd            
	//  174  334:istore_3        
					abyte0[l] = (byte)(j1 >> 18 | 0xf0);
	//  175  335:aload           8
	//  176  337:iload           5
	//  177  339:iload           7
	//  178  341:bipush          18
	//  179  343:ishr            
	//  180  344:sipush          240
	//  181  347:ior             
	//  182  348:int2byte        
	//  183  349:bastore         
					byte abyte2[] = abyte0;
	//  184  350:aload           8
	//  185  352:astore          9
					i = j;
	//  186  354:iload_3         
	//  187  355:istore_2        
					if(j >= abyte0.length)
	//* 188  356:iload_3         
	//* 189  357:aload           8
	//* 190  359:arraylength     
	//* 191  360:icmplt          372
					{
						abyte2 = bytearraybuilder1.finishCurrentSegment();
	//  192  363:aload           10
	//  193  365:invokevirtual   #114 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//  194  368:astore          9
						i = 0;
	//  195  370:iconst_0        
	//  196  371:istore_2        
					}
					j = i + 1;
	//  197  372:iload_2         
	//  198  373:iconst_1        
	//  199  374:iadd            
	//  200  375:istore_3        
					abyte2[i] = (byte)(j1 >> 12 & 0x3f | 0x80);
	//  201  376:aload           9
	//  202  378:iload_2         
	//  203  379:iload           7
	//  204  381:bipush          12
	//  205  383:ishr            
	//  206  384:bipush          63
	//  207  386:iand            
	//  208  387:sipush          128
	//  209  390:ior             
	//  210  391:int2byte        
	//  211  392:bastore         
					abyte0 = abyte2;
	//  212  393:aload           9
	//  213  395:astore          8
					i = j;
	//  214  397:iload_3         
	//  215  398:istore_2        
					if(j >= abyte2.length)
	//* 216  399:iload_3         
	//* 217  400:aload           9
	//* 218  402:arraylength     
	//* 219  403:icmplt          415
					{
						abyte0 = bytearraybuilder1.finishCurrentSegment();
	//  220  406:aload           10
	//  221  408:invokevirtual   #114 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//  222  411:astore          8
						i = 0;
	//  223  413:iconst_0        
	//  224  414:istore_2        
					}
					abyte0[i] = (byte)(j1 >> 6 & 0x3f | 0x80);
	//  225  415:aload           8
	//  226  417:iload_2         
	//  227  418:iload           7
	//  228  420:bipush          6
	//  229  422:ishr            
	//  230  423:bipush          63
	//  231  425:iand            
	//  232  426:sipush          128
	//  233  429:ior             
	//  234  430:int2byte        
	//  235  431:bastore         
					j = j1 & 0x3f | 0x80;
	//  236  432:iload           7
	//  237  434:bipush          63
	//  238  436:iand            
	//  239  437:sipush          128
	//  240  440:ior             
	//  241  441:istore_3        
					i++;
	//  242  442:iload_2         
	//  243  443:iconst_1        
	//  244  444:iadd            
	//  245  445:istore_2        
					k++;
	//  246  446:iload           4
	//  247  448:iconst_1        
	//  248  449:iadd            
	//  249  450:istore          4
				} else
	//* 250  452:goto            538
				{
					j = l + 1;
	//  251  455:iload           5
	//  252  457:iconst_1        
	//  253  458:iadd            
	//  254  459:istore_3        
					abyte0[l] = (byte)(j1 >> 12 | 0xe0);
	//  255  460:aload           8
	//  256  462:iload           5
	//  257  464:iload           7
	//  258  466:bipush          12
	//  259  468:ishr            
	//  260  469:sipush          224
	//  261  472:ior             
	//  262  473:int2byte        
	//  263  474:bastore         
					byte abyte3[] = abyte0;
	//  264  475:aload           8
	//  265  477:astore          9
					i = j;
	//  266  479:iload_3         
	//  267  480:istore_2        
					if(j >= abyte0.length)
	//* 268  481:iload_3         
	//* 269  482:aload           8
	//* 270  484:arraylength     
	//* 271  485:icmplt          497
					{
						abyte3 = bytearraybuilder1.finishCurrentSegment();
	//  272  488:aload           10
	//  273  490:invokevirtual   #114 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//  274  493:astore          9
						i = 0;
	//  275  495:iconst_0        
	//  276  496:istore_2        
					}
					j = i + 1;
	//  277  497:iload_2         
	//  278  498:iconst_1        
	//  279  499:iadd            
	//  280  500:istore_3        
					abyte3[i] = (byte)(j1 >> 6 & 0x3f | 0x80);
	//  281  501:aload           9
	//  282  503:iload_2         
	//  283  504:iload           7
	//  284  506:bipush          6
	//  285  508:ishr            
	//  286  509:bipush          63
	//  287  511:iand            
	//  288  512:sipush          128
	//  289  515:ior             
	//  290  516:int2byte        
	//  291  517:bastore         
					l = j1 & 0x3f | 0x80;
	//  292  518:iload           7
	//  293  520:bipush          63
	//  294  522:iand            
	//  295  523:sipush          128
	//  296  526:ior             
	//  297  527:istore          5
					i = j;
	//  298  529:iload_3         
	//  299  530:istore_2        
					abyte0 = abyte3;
	//  300  531:aload           9
	//  301  533:astore          8
					j = l;
	//  302  535:iload           5
	//  303  537:istore_3        
				}
				byte abyte4[] = abyte0;
	//  304  538:aload           8
	//  305  540:astore          9
				l = i;
	//  306  542:iload_2         
	//  307  543:istore          5
				if(i >= abyte0.length)
	//* 308  545:iload_2         
	//* 309  546:aload           8
	//* 310  548:arraylength     
	//* 311  549:icmplt          562
				{
					abyte4 = bytearraybuilder1.finishCurrentSegment();
	//  312  552:aload           10
	//  313  554:invokevirtual   #114 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//  314  557:astore          9
					l = 0;
	//  315  559:iconst_0        
	//  316  560:istore          5
				}
				abyte4[l] = (byte)j;
	//  317  562:aload           9
	//  318  564:iload           5
	//  319  566:iload_3         
	//  320  567:int2byte        
	//  321  568:bastore         
				i = l + 1;
	//  322  569:iload           5
	//  323  571:iconst_1        
	//  324  572:iadd            
	//  325  573:istore_2        
				j = k;
	//  326  574:iload           4
	//  327  576:istore_3        
				abyte0 = abyte4;
	//  328  577:aload           9
	//  329  579:astore          8
			}
		} while(true);
	//  330  581:goto            48
		return _bytes.completeAndCoalesce(k);
	//  331  584:aload_0         
	//  332  585:getfield        #96  <Field ByteArrayBuilder _bytes>
	//  333  588:iload           4
	//  334  590:invokevirtual   #124 <Method byte[] ByteArrayBuilder.completeAndCoalesce(int)>
	//  335  593:areturn         
	}

	private static final byte HB[] = CharTypes.copyHexBytes();
	private static final char HC[] = CharTypes.copyHexChars();
	protected ByteArrayBuilder _bytes;
	protected final char _qbuf[] = new char[6];
	protected TextBuffer _text;

	static 
	{
	//    0    0:invokestatic    #21  <Method char[] CharTypes.copyHexChars()>
	//    1    3:putstatic       #23  <Field char[] HC>
	//    2    6:invokestatic    #27  <Method byte[] CharTypes.copyHexBytes()>
	//    3    9:putstatic       #29  <Field byte[] HB>
	//*   4   12:return          
	}
}
