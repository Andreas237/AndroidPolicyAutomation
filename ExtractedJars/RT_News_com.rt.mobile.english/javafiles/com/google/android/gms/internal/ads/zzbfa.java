// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfi, zzbfb

public final class zzbfa
{

	private zzbfa(ByteBuffer bytebuffer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzebj = bytebuffer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field ByteBuffer zzebj>
		zzebj.order(ByteOrder.LITTLE_ENDIAN);
	//    5    9:aload_0         
	//    6   10:getfield        #13  <Field ByteBuffer zzebj>
	//    7   13:getstatic       #19  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//    8   16:invokevirtual   #25  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//    9   19:pop             
	//   10   20:return          
	}

	private zzbfa(byte abyte0[], int i, int j)
	{
		this(ByteBuffer.wrap(abyte0, i, j));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokestatic    #31  <Method ByteBuffer ByteBuffer.wrap(byte[], int, int)>
	//    5    7:invokespecial   #33  <Method void zzbfa(ByteBuffer)>
	//    6   10:return          
	}

	private static int zza(CharSequence charsequence)
	{
		int k;
		int i1;
label0:
		{
			i1 = charsequence.length();
	//    0    0:aload_0         
	//    1    1:invokeinterface #41  <Method int CharSequence.length()>
	//    2    6:istore          5
			boolean flag = false;
	//    3    8:iconst_0        
	//    4    9:istore          4
			int j;
			for(j = 0; j < i1 && charsequence.charAt(j) < '\200'; j++);
	//    5   11:iconst_0        
	//    6   12:istore_2        
	//    7   13:iload_2         
	//    8   14:iload           5
	//    9   16:icmpge          39
	//   10   19:aload_0         
	//   11   20:iload_2         
	//   12   21:invokeinterface #45  <Method char CharSequence.charAt(int)>
	//   13   26:sipush          128
	//   14   29:icmpge          39
	//   15   32:iload_2         
	//   16   33:iconst_1        
	//   17   34:iadd            
	//   18   35:istore_2        
	//*  19   36:goto            13
			int i = i1;
	//   20   39:iload           5
	//   21   41:istore_1        
			do
			{
				k = i;
	//   22   42:iload_1         
	//   23   43:istore_3        
				if(j >= i1)
					break label0;
	//   24   44:iload_2         
	//   25   45:iload           5
	//   26   47:icmpge          229
				k = ((int) (charsequence.charAt(j)));
	//   27   50:aload_0         
	//   28   51:iload_2         
	//   29   52:invokeinterface #45  <Method char CharSequence.charAt(int)>
	//   30   57:istore_3        
				if(k >= 2048)
					break;
	//   31   58:iload_3         
	//   32   59:sipush          2048
	//   33   62:icmpge          82
				i += 127 - k >>> 31;
	//   34   65:iload_1         
	//   35   66:bipush          127
	//   36   68:iload_3         
	//   37   69:isub            
	//   38   70:bipush          31
	//   39   72:iushr           
	//   40   73:iadd            
	//   41   74:istore_1        
				j++;
	//   42   75:iload_2         
	//   43   76:iconst_1        
	//   44   77:iadd            
	//   45   78:istore_2        
			} while(true);
	//   46   79:goto            42
			int k1 = charsequence.length();
	//   47   82:aload_0         
	//   48   83:invokeinterface #41  <Method int CharSequence.length()>
	//   49   88:istore          7
			k = ((int) (flag));
	//   50   90:iload           4
	//   51   92:istore_3        
			int l;
			for(; j < k1; j = l + 1)
	//*  52   93:iload_2         
	//*  53   94:iload           7
	//*  54   96:icmpge          225
			{
				char c = charsequence.charAt(j);
	//   55   99:aload_0         
	//   56  100:iload_2         
	//   57  101:invokeinterface #45  <Method char CharSequence.charAt(int)>
	//   58  106:istore          8
				if(c < '\u0800')
	//*  59  108:iload           8
	//*  60  110:sipush          2048
	//*  61  113:icmpge          133
				{
					k += 127 - c >>> 31;
	//   62  116:iload_3         
	//   63  117:bipush          127
	//   64  119:iload           8
	//   65  121:isub            
	//   66  122:bipush          31
	//   67  124:iushr           
	//   68  125:iadd            
	//   69  126:istore_3        
					l = j;
	//   70  127:iload_2         
	//   71  128:istore          4
					continue;
	//   72  130:goto            217
				}
				int j1 = k + 2;
	//   73  133:iload_3         
	//   74  134:iconst_2        
	//   75  135:iadd            
	//   76  136:istore          6
				k = j1;
	//   77  138:iload           6
	//   78  140:istore_3        
				l = j;
	//   79  141:iload_2         
	//   80  142:istore          4
				if('\uD800' > c)
					continue;
	//   81  144:ldc1            #46  <Int 55296>
	//   82  146:iload           8
	//   83  148:icmpgt          217
				k = j1;
	//   84  151:iload           6
	//   85  153:istore_3        
				l = j;
	//   86  154:iload_2         
	//   87  155:istore          4
				if(c > '\uDFFF')
					continue;
	//   88  157:iload           8
	//   89  159:ldc1            #47  <Int 57343>
	//   90  161:icmpgt          217
				if(Character.codePointAt(charsequence, j) < 0x10000)
	//*  91  164:aload_0         
	//*  92  165:iload_2         
	//*  93  166:invokestatic    #53  <Method int Character.codePointAt(CharSequence, int)>
	//*  94  169:ldc1            #54  <Int 0x10000>
	//*  95  171:icmpge          209
				{
					charsequence = ((CharSequence) (new StringBuilder(39)));
	//   96  174:new             #56  <Class StringBuilder>
	//   97  177:dup             
	//   98  178:bipush          39
	//   99  180:invokespecial   #59  <Method void StringBuilder(int)>
	//  100  183:astore_0        
					((StringBuilder) (charsequence)).append("Unpaired surrogate at index ");
	//  101  184:aload_0         
	//  102  185:ldc1            #61  <String "Unpaired surrogate at index ">
	//  103  187:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  104  190:pop             
					((StringBuilder) (charsequence)).append(j);
	//  105  191:aload_0         
	//  106  192:iload_2         
	//  107  193:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//  108  196:pop             
					throw new IllegalArgumentException(((StringBuilder) (charsequence)).toString());
	//  109  197:new             #70  <Class IllegalArgumentException>
	//  110  200:dup             
	//  111  201:aload_0         
	//  112  202:invokevirtual   #74  <Method String StringBuilder.toString()>
	//  113  205:invokespecial   #77  <Method void IllegalArgumentException(String)>
	//  114  208:athrow          
				}
				l = j + 1;
	//  115  209:iload_2         
	//  116  210:iconst_1        
	//  117  211:iadd            
	//  118  212:istore          4
				k = j1;
	//  119  214:iload           6
	//  120  216:istore_3        
			}

	//  121  217:iload           4
	//  122  219:iconst_1        
	//  123  220:iadd            
	//  124  221:istore_2        
	//* 125  222:goto            93
			k = i + k;
	//  126  225:iload_1         
	//  127  226:iload_3         
	//  128  227:iadd            
	//  129  228:istore_3        
		}
		if(k < i1)
	//* 130  229:iload_3         
	//* 131  230:iload           5
	//* 132  232:icmpge          279
		{
			long l1 = k;
	//  133  235:iload_3         
	//  134  236:i2l             
	//  135  237:lstore          9
			charsequence = ((CharSequence) (new StringBuilder(54)));
	//  136  239:new             #56  <Class StringBuilder>
	//  137  242:dup             
	//  138  243:bipush          54
	//  139  245:invokespecial   #59  <Method void StringBuilder(int)>
	//  140  248:astore_0        
			((StringBuilder) (charsequence)).append("UTF-8 length does not fit in int: ");
	//  141  249:aload_0         
	//  142  250:ldc1            #79  <String "UTF-8 length does not fit in int: ">
	//  143  252:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  144  255:pop             
			((StringBuilder) (charsequence)).append(l1 + 0x0L);
	//  145  256:aload_0         
	//  146  257:lload           9
	//  147  259:ldc2w           #80  <Long 0x0L>
	//  148  262:ladd            
	//  149  263:invokevirtual   #84  <Method StringBuilder StringBuilder.append(long)>
	//  150  266:pop             
			throw new IllegalArgumentException(((StringBuilder) (charsequence)).toString());
	//  151  267:new             #70  <Class IllegalArgumentException>
	//  152  270:dup             
	//  153  271:aload_0         
	//  154  272:invokevirtual   #74  <Method String StringBuilder.toString()>
	//  155  275:invokespecial   #77  <Method void IllegalArgumentException(String)>
	//  156  278:athrow          
		} else
		{
			return k;
	//  157  279:iload_3         
	//  158  280:ireturn         
		}
	}

	private static void zza(CharSequence charsequence, ByteBuffer bytebuffer)
	{
		if(bytebuffer.isReadOnly())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #91  <Method boolean ByteBuffer.isReadOnly()>
	//*   2    4:ifeq            15
			throw new ReadOnlyBufferException();
	//    3    7:new             #93  <Class ReadOnlyBufferException>
	//    4   10:dup             
	//    5   11:invokespecial   #94  <Method void ReadOnlyBufferException()>
	//    6   14:athrow          
		if(!bytebuffer.hasArray()) goto _L2; else goto _L1
	//    7   15:aload_1         
	//    8   16:invokevirtual   #97  <Method boolean ByteBuffer.hasArray()>
	//    9   19:ifeq            444
_L1:
		char c;
		int i;
		int j;
		int k;
		int j1;
		int k1;
		byte abyte0[];
		char c1;
		int l1;
		try
		{
			abyte0 = bytebuffer.array();
	//   10   22:aload_1         
	//   11   23:invokevirtual   #101 <Method byte[] ByteBuffer.array()>
	//   12   26:astore          10
			j = bytebuffer.arrayOffset() + bytebuffer.position();
	//   13   28:aload_1         
	//   14   29:invokevirtual   #104 <Method int ByteBuffer.arrayOffset()>
	//   15   32:aload_1         
	//   16   33:invokevirtual   #107 <Method int ByteBuffer.position()>
	//   17   36:iadd            
	//   18   37:istore          5
			i = bytebuffer.remaining();
	//   19   39:aload_1         
	//   20   40:invokevirtual   #110 <Method int ByteBuffer.remaining()>
	//   21   43:istore          4
			j1 = charsequence.length();
	//   22   45:aload_0         
	//   23   46:invokeinterface #41  <Method int CharSequence.length()>
	//   24   51:istore          7
		}
	//*  25   53:iload           4
	//*  26   55:iload           5
	//*  27   57:iadd            
	//*  28   58:istore          8
	//*  29   60:iconst_0        
	//*  30   61:istore          4
	//*  31   63:iload           4
	//*  32   65:iload           7
	//*  33   67:icmpge          755
	//*  34   70:iload           4
	//*  35   72:iload           5
	//*  36   74:iadd            
	//*  37   75:istore          6
	//*  38   77:iload           6
	//*  39   79:iload           8
	//*  40   81:icmpge          755
	//*  41   84:aload_0         
	//*  42   85:iload           4
	//*  43   87:invokeinterface #45  <Method char CharSequence.charAt(int)>
	//*  44   92:istore          9
	//*  45   94:iload           9
	//*  46   96:sipush          128
	//*  47   99:icmpge          755
	//*  48  102:aload           10
	//*  49  104:iload           6
	//*  50  106:iload           9
	//*  51  108:int2byte        
	//*  52  109:bastore         
	//*  53  110:iload           4
	//*  54  112:iconst_1        
	//*  55  113:iadd            
	//*  56  114:istore          4
	//*  57  116:goto            63
	//*  58  119:iload           5
	//*  59  121:istore          6
	//*  60  123:iload           4
	//*  61  125:iload           7
	//*  62  127:icmpge          414
	//*  63  130:aload_0         
	//*  64  131:iload           4
	//*  65  133:invokeinterface #45  <Method char CharSequence.charAt(int)>
	//*  66  138:istore_2        
	//*  67  139:iload_2         
	//*  68  140:sipush          128
	//*  69  143:icmpge          785
	//*  70  146:iload           5
	//*  71  148:iload           8
	//*  72  150:icmpge          785
	//*  73  153:iload           5
	//*  74  155:iconst_1        
	//*  75  156:iadd            
	//*  76  157:istore          6
	//*  77  159:aload           10
	//*  78  161:iload           5
	//*  79  163:iload_2         
	//*  80  164:int2byte        
	//*  81  165:bastore         
	//*  82  166:iload           6
	//*  83  168:istore          5
	//*  84  170:goto            782
	//*  85  173:iload           5
	//*  86  175:iload           8
	//*  87  177:iconst_4        
	//*  88  178:isub            
	//*  89  179:icmpgt          365
	//*  90  182:iload           4
	//*  91  184:iconst_1        
	//*  92  185:iadd            
	//*  93  186:istore          6
	//*  94  188:iload           6
	//*  95  190:aload_0         
	//*  96  191:invokeinterface #41  <Method int CharSequence.length()>
	//*  97  196:icmpeq          327
	//*  98  199:aload_0         
	//*  99  200:iload           6
	//* 100  202:invokeinterface #45  <Method char CharSequence.charAt(int)>
	//* 101  207:istore_3        
	//* 102  208:iload_2         
	//* 103  209:iload_3         
	//* 104  210:invokestatic    #114 <Method boolean Character.isSurrogatePair(char, char)>
	//* 105  213:ifne            223
	//* 106  216:iload           6
	//* 107  218:istore          4
	//* 108  220:goto            327
	//* 109  223:iload_2         
	//* 110  224:iload_3         
	//* 111  225:invokestatic    #118 <Method int Character.toCodePoint(char, char)>
	//* 112  228:istore          4
	//* 113  230:iload           5
	//* 114  232:iconst_1        
	//* 115  233:iadd            
	//* 116  234:istore          9
	//* 117  236:aload           10
	//* 118  238:iload           5
	//* 119  240:sipush          240
	//* 120  243:iload           4
	//* 121  245:bipush          18
	//* 122  247:iushr           
	//* 123  248:ior             
	//* 124  249:int2byte        
	//* 125  250:bastore         
	//* 126  251:iload           9
	//* 127  253:iconst_1        
	//* 128  254:iadd            
	//* 129  255:istore          5
	//* 130  257:aload           10
	//* 131  259:iload           9
	//* 132  261:iload           4
	//* 133  263:bipush          12
	//* 134  265:iushr           
	//* 135  266:bipush          63
	//* 136  268:iand            
	//* 137  269:sipush          128
	//* 138  272:ior             
	//* 139  273:int2byte        
	//* 140  274:bastore         
	//* 141  275:iload           5
	//* 142  277:iconst_1        
	//* 143  278:iadd            
	//* 144  279:istore          9
	//* 145  281:aload           10
	//* 146  283:iload           5
	//* 147  285:iload           4
	//* 148  287:bipush          6
	//* 149  289:iushr           
	//* 150  290:bipush          63
	//* 151  292:iand            
	//* 152  293:sipush          128
	//* 153  296:ior             
	//* 154  297:int2byte        
	//* 155  298:bastore         
	//* 156  299:iload           9
	//* 157  301:iconst_1        
	//* 158  302:iadd            
	//* 159  303:istore          5
	//* 160  305:aload           10
	//* 161  307:iload           9
	//* 162  309:iload           4
	//* 163  311:bipush          63
	//* 164  313:iand            
	//* 165  314:sipush          128
	//* 166  317:ior             
	//* 167  318:int2byte        
	//* 168  319:bastore         
	//* 169  320:iload           6
	//* 170  322:istore          4
	//* 171  324:goto            841
	//* 172  327:new             #56  <Class StringBuilder>
	//* 173  330:dup             
	//* 174  331:bipush          39
	//* 175  333:invokespecial   #59  <Method void StringBuilder(int)>
	//* 176  336:astore_0        
	//* 177  337:aload_0         
	//* 178  338:ldc1            #61  <String "Unpaired surrogate at index ">
	//* 179  340:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//* 180  343:pop             
	//* 181  344:aload_0         
	//* 182  345:iload           4
	//* 183  347:iconst_1        
	//* 184  348:isub            
	//* 185  349:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//* 186  352:pop             
	//* 187  353:new             #70  <Class IllegalArgumentException>
	//* 188  356:dup             
	//* 189  357:aload_0         
	//* 190  358:invokevirtual   #74  <Method String StringBuilder.toString()>
	//* 191  361:invokespecial   #77  <Method void IllegalArgumentException(String)>
	//* 192  364:athrow          
	//* 193  365:new             #56  <Class StringBuilder>
	//* 194  368:dup             
	//* 195  369:bipush          37
	//* 196  371:invokespecial   #59  <Method void StringBuilder(int)>
	//* 197  374:astore_0        
	//* 198  375:aload_0         
	//* 199  376:ldc1            #120 <String "Failed writing ">
	//* 200  378:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//* 201  381:pop             
	//* 202  382:aload_0         
	//* 203  383:iload_2         
	//* 204  384:invokevirtual   #123 <Method StringBuilder StringBuilder.append(char)>
	//* 205  387:pop             
	//* 206  388:aload_0         
	//* 207  389:ldc1            #125 <String " at index ">
	//* 208  391:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//* 209  394:pop             
	//* 210  395:aload_0         
	//* 211  396:iload           5
	//* 212  398:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//* 213  401:pop             
	//* 214  402:new             #87  <Class ArrayIndexOutOfBoundsException>
	//* 215  405:dup             
	//* 216  406:aload_0         
	//* 217  407:invokevirtual   #74  <Method String StringBuilder.toString()>
	//* 218  410:invokespecial   #126 <Method void ArrayIndexOutOfBoundsException(String)>
	//* 219  413:athrow          
	//* 220  414:aload_1         
	//* 221  415:iload           6
	//* 222  417:aload_1         
	//* 223  418:invokevirtual   #104 <Method int ByteBuffer.arrayOffset()>
	//* 224  421:isub            
	//* 225  422:invokevirtual   #129 <Method java.nio.Buffer ByteBuffer.position(int)>
	//* 226  425:pop             
	//* 227  426:return          
		// Misplaced declaration of an exception variable
		catch(CharSequence charsequence)
	//* 228  427:astore_0        
		{
			bytebuffer = ((ByteBuffer) (new BufferOverflowException()));
	//  229  428:new             #131 <Class BufferOverflowException>
	//  230  431:dup             
	//  231  432:invokespecial   #132 <Method void BufferOverflowException()>
	//  232  435:astore_1        
			((BufferOverflowException) (bytebuffer)).initCause(((Throwable) (charsequence)));
	//  233  436:aload_1         
	//  234  437:aload_0         
	//  235  438:invokevirtual   #136 <Method Throwable BufferOverflowException.initCause(Throwable)>
	//  236  441:pop             
			throw bytebuffer;
	//  237  442:aload_1         
	//  238  443:athrow          
		}
		k1 = i + j;
		i = 0;
		if(i >= j1)
			break; /* Loop/switch isn't completed */
		k = i + j;
		if(k >= k1)
			break; /* Loop/switch isn't completed */
		l1 = ((int) (charsequence.charAt(i)));
		if(l1 >= '\200')
			break; /* Loop/switch isn't completed */
		abyte0[k] = (byte)l1;
		i++;
		if(true) goto _L4; else goto _L3
_L4:
		break MISSING_BLOCK_LABEL_63;
_L10:
		k = j;
		if(i >= j1) goto _L6; else goto _L5
_L5:
		c = charsequence.charAt(i);
		if(c < '\200' && j < k1)
		{
			k = j + 1;
			abyte0[j] = (byte)c;
			j = k;
		} else
	//* 239  444:aload_0         
	//* 240  445:invokeinterface #41  <Method int CharSequence.length()>
	//* 241  450:istore          6
	//* 242  452:iconst_0        
	//* 243  453:istore          4
	//* 244  455:iload           4
	//* 245  457:iload           6
	//* 246  459:icmpge          754
	//* 247  462:aload_0         
	//* 248  463:iload           4
	//* 249  465:invokeinterface #45  <Method char CharSequence.charAt(int)>
	//* 250  470:istore_2        
	//* 251  471:iload_2         
	//* 252  472:sipush          128
	//* 253  475:icmpge          488
	//* 254  478:aload_1         
	//* 255  479:iload_2         
	//* 256  480:int2byte        
	//* 257  481:invokevirtual   #140 <Method ByteBuffer ByteBuffer.put(byte)>
	//* 258  484:pop             
	//* 259  485:goto            659
	//* 260  488:iload_2         
	//* 261  489:sipush          2048
	//* 262  492:icmpge          526
	//* 263  495:aload_1         
	//* 264  496:iload_2         
	//* 265  497:bipush          6
	//* 266  499:iushr           
	//* 267  500:sipush          960
	//* 268  503:ior             
	//* 269  504:int2byte        
	//* 270  505:invokevirtual   #140 <Method ByteBuffer ByteBuffer.put(byte)>
	//* 271  508:pop             
	//* 272  509:aload_1         
	//* 273  510:iload_2         
	//* 274  511:bipush          63
	//* 275  513:iand            
	//* 276  514:sipush          128
	//* 277  517:ior             
	//* 278  518:int2byte        
	//* 279  519:invokevirtual   #140 <Method ByteBuffer ByteBuffer.put(byte)>
	//* 280  522:pop             
	//* 281  523:goto            485
	//* 282  526:iload_2         
	//* 283  527:ldc1            #46  <Int 55296>
	//* 284  529:icmplt          700
	//* 285  532:ldc1            #47  <Int 57343>
	//* 286  534:iload_2         
	//* 287  535:icmpge          541
	//* 288  538:goto            700
	//* 289  541:iload           4
	//* 290  543:iconst_1        
	//* 291  544:iadd            
	//* 292  545:istore          5
	//* 293  547:iload           5
	//* 294  549:aload_0         
	//* 295  550:invokeinterface #41  <Method int CharSequence.length()>
	//* 296  555:icmpeq          662
	//* 297  558:aload_0         
	//* 298  559:iload           5
	//* 299  561:invokeinterface #45  <Method char CharSequence.charAt(int)>
	//* 300  566:istore_3        
	//* 301  567:iload_2         
	//* 302  568:iload_3         
	//* 303  569:invokestatic    #114 <Method boolean Character.isSurrogatePair(char, char)>
	//* 304  572:ifne            582
	//* 305  575:iload           5
	//* 306  577:istore          4
	//* 307  579:goto            662
	//* 308  582:iload_2         
	//* 309  583:iload_3         
	//* 310  584:invokestatic    #118 <Method int Character.toCodePoint(char, char)>
	//* 311  587:istore          4
	//* 312  589:aload_1         
	//* 313  590:iload           4
	//* 314  592:bipush          18
	//* 315  594:iushr           
	//* 316  595:sipush          240
	//* 317  598:ior             
	//* 318  599:int2byte        
	//* 319  600:invokevirtual   #140 <Method ByteBuffer ByteBuffer.put(byte)>
	//* 320  603:pop             
	//* 321  604:aload_1         
	//* 322  605:iload           4
	//* 323  607:bipush          12
	//* 324  609:iushr           
	//* 325  610:bipush          63
	//* 326  612:iand            
	//* 327  613:sipush          128
	//* 328  616:ior             
	//* 329  617:int2byte        
	//* 330  618:invokevirtual   #140 <Method ByteBuffer ByteBuffer.put(byte)>
	//* 331  621:pop             
	//* 332  622:aload_1         
	//* 333  623:iload           4
	//* 334  625:bipush          6
	//* 335  627:iushr           
	//* 336  628:bipush          63
	//* 337  630:iand            
	//* 338  631:sipush          128
	//* 339  634:ior             
	//* 340  635:int2byte        
	//* 341  636:invokevirtual   #140 <Method ByteBuffer ByteBuffer.put(byte)>
	//* 342  639:pop             
	//* 343  640:aload_1         
	//* 344  641:iload           4
	//* 345  643:bipush          63
	//* 346  645:iand            
	//* 347  646:sipush          128
	//* 348  649:ior             
	//* 349  650:int2byte        
	//* 350  651:invokevirtual   #140 <Method ByteBuffer ByteBuffer.put(byte)>
	//* 351  654:pop             
	//* 352  655:iload           5
	//* 353  657:istore          4
	//* 354  659:goto            745
	//* 355  662:new             #56  <Class StringBuilder>
	//* 356  665:dup             
	//* 357  666:bipush          39
	//* 358  668:invokespecial   #59  <Method void StringBuilder(int)>
	//* 359  671:astore_0        
	//* 360  672:aload_0         
	//* 361  673:ldc1            #61  <String "Unpaired surrogate at index ">
	//* 362  675:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//* 363  678:pop             
	//* 364  679:aload_0         
	//* 365  680:iload           4
	//* 366  682:iconst_1        
	//* 367  683:isub            
	//* 368  684:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//* 369  687:pop             
	//* 370  688:new             #70  <Class IllegalArgumentException>
	//* 371  691:dup             
	//* 372  692:aload_0         
	//* 373  693:invokevirtual   #74  <Method String StringBuilder.toString()>
	//* 374  696:invokespecial   #77  <Method void IllegalArgumentException(String)>
	//* 375  699:athrow          
	//* 376  700:aload_1         
	//* 377  701:iload_2         
	//* 378  702:bipush          12
	//* 379  704:iushr           
	//* 380  705:sipush          480
	//* 381  708:ior             
	//* 382  709:int2byte        
	//* 383  710:invokevirtual   #140 <Method ByteBuffer ByteBuffer.put(byte)>
	//* 384  713:pop             
	//* 385  714:aload_1         
	//* 386  715:iload_2         
	//* 387  716:bipush          6
	//* 388  718:iushr           
	//* 389  719:bipush          63
	//* 390  721:iand            
	//* 391  722:sipush          128
	//* 392  725:ior             
	//* 393  726:int2byte        
	//* 394  727:invokevirtual   #140 <Method ByteBuffer ByteBuffer.put(byte)>
	//* 395  730:pop             
	//* 396  731:aload_1         
	//* 397  732:iload_2         
	//* 398  733:bipush          63
	//* 399  735:iand            
	//* 400  736:sipush          128
	//* 401  739:ior             
	//* 402  740:int2byte        
	//* 403  741:invokevirtual   #140 <Method ByteBuffer ByteBuffer.put(byte)>
	//* 404  744:pop             
	//* 405  745:iload           4
	//* 406  747:iconst_1        
	//* 407  748:iadd            
	//* 408  749:istore          4
	//* 409  751:goto            455
	//* 410  754:return          
	//* 411  755:iload           4
	//* 412  757:iload           7
	//* 413  759:icmpne          772
	//* 414  762:iload           5
	//* 415  764:iload           7
	//* 416  766:iadd            
	//* 417  767:istore          6
	//* 418  769:goto            414
	//* 419  772:iload           5
	//* 420  774:iload           4
	//* 421  776:iadd            
	//* 422  777:istore          5
	//* 423  779:goto            119
	//* 424  782:goto            931
		{
			if(c < '\u0800' && j <= k1 - 2)
	//* 425  785:iload_2         
	//* 426  786:sipush          2048
	//* 427  789:icmpge          844
	//* 428  792:iload           5
	//* 429  794:iload           8
	//* 430  796:iconst_2        
	//* 431  797:isub            
	//* 432  798:icmpgt          844
			{
				int l = j + 1;
	//  433  801:iload           5
	//  434  803:iconst_1        
	//  435  804:iadd            
	//  436  805:istore          6
				abyte0[j] = (byte)(0x3c0 | c >>> 6);
	//  437  807:aload           10
	//  438  809:iload           5
	//  439  811:sipush          960
	//  440  814:iload_2         
	//  441  815:bipush          6
	//  442  817:iushr           
	//  443  818:ior             
	//  444  819:int2byte        
	//  445  820:bastore         
				j = l + 1;
	//  446  821:iload           6
	//  447  823:iconst_1        
	//  448  824:iadd            
	//  449  825:istore          5
				abyte0[l] = (byte)(c & 0x3f | 0x80);
	//  450  827:aload           10
	//  451  829:iload           6
	//  452  831:iload_2         
	//  453  832:bipush          63
	//  454  834:iand            
	//  455  835:sipush          128
	//  456  838:ior             
	//  457  839:int2byte        
	//  458  840:bastore         
				break; /* Loop/switch isn't completed */
	//  459  841:goto            931
			}
			if(c >= '\uD800' && '\uDFFF' >= c || j > k1 - 3)
				continue; /* Loop/switch isn't completed */
	//  460  844:iload_2         
	//  461  845:ldc1            #46  <Int 55296>
	//  462  847:icmplt          856
	//  463  850:ldc1            #47  <Int 57343>
	//  464  852:iload_2         
	//  465  853:icmpge          173
	//  466  856:iload           5
	//  467  858:iload           8
	//  468  860:iconst_3        
	//  469  861:isub            
	//  470  862:icmpgt          173
			int i1 = j + 1;
	//  471  865:iload           5
	//  472  867:iconst_1        
	//  473  868:iadd            
	//  474  869:istore          6
			abyte0[j] = (byte)(0x1e0 | c >>> 12);
	//  475  871:aload           10
	//  476  873:iload           5
	//  477  875:sipush          480
	//  478  878:iload_2         
	//  479  879:bipush          12
	//  480  881:iushr           
	//  481  882:ior             
	//  482  883:int2byte        
	//  483  884:bastore         
			int i2 = i1 + 1;
	//  484  885:iload           6
	//  485  887:iconst_1        
	//  486  888:iadd            
	//  487  889:istore          9
			abyte0[i1] = (byte)(c >>> 6 & 0x3f | 0x80);
	//  488  891:aload           10
	//  489  893:iload           6
	//  490  895:iload_2         
	//  491  896:bipush          6
	//  492  898:iushr           
	//  493  899:bipush          63
	//  494  901:iand            
	//  495  902:sipush          128
	//  496  905:ior             
	//  497  906:int2byte        
	//  498  907:bastore         
			j = i2 + 1;
	//  499  908:iload           9
	//  500  910:iconst_1        
	//  501  911:iadd            
	//  502  912:istore          5
			abyte0[i2] = (byte)(c & 0x3f | 0x80);
	//  503  914:aload           10
	//  504  916:iload           9
	//  505  918:iload_2         
	//  506  919:bipush          63
	//  507  921:iand            
	//  508  922:sipush          128
	//  509  925:ior             
	//  510  926:int2byte        
	//  511  927:bastore         
		}
		  goto _L7
_L8:
		if(j > k1 - 4)
			break MISSING_BLOCK_LABEL_365;
		k = i + 1;
		if(k == charsequence.length())
			break MISSING_BLOCK_LABEL_327;
		c1 = charsequence.charAt(k);
		if(!Character.isSurrogatePair(c, c1))
		{
			i = k;
			break MISSING_BLOCK_LABEL_327;
		}
		i = Character.toCodePoint(c, c1);
		l1 = j + 1;
		abyte0[j] = (byte)(0xf0 | i >>> 18);
		j = l1 + 1;
		abyte0[l1] = (byte)(i >>> 12 & 0x3f | 0x80);
		l1 = j + 1;
		abyte0[j] = (byte)(i >>> 6 & 0x3f | 0x80);
		j = l1 + 1;
		abyte0[l1] = (byte)(i & 0x3f | 0x80);
		i = k;
		break; /* Loop/switch isn't completed */
		charsequence = ((CharSequence) (new StringBuilder(39)));
		((StringBuilder) (charsequence)).append("Unpaired surrogate at index ");
		((StringBuilder) (charsequence)).append(i - 1);
		throw new IllegalArgumentException(((StringBuilder) (charsequence)).toString());
		charsequence = ((CharSequence) (new StringBuilder(37)));
		((StringBuilder) (charsequence)).append("Failed writing ");
		((StringBuilder) (charsequence)).append(c);
		((StringBuilder) (charsequence)).append(" at index ");
		((StringBuilder) (charsequence)).append(j);
		throw new ArrayIndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
_L6:
		bytebuffer.position(k - bytebuffer.arrayOffset());
		return;
_L2:
		k = charsequence.length();
		for(i = 0; i < k; i++)
		{
			c = charsequence.charAt(i);
			if(c < '\200')
			{
				bytebuffer.put((byte)c);
				continue;
			}
			if(c < '\u0800')
			{
				bytebuffer.put((byte)(c >>> 6 | 0x3c0));
				bytebuffer.put((byte)(c & 0x3f | 0x80));
				continue;
			}
			if(c >= '\uD800' && '\uDFFF' >= c)
			{
				j = i + 1;
				if(j != charsequence.length())
				{
					char c2 = charsequence.charAt(j);
					if(!Character.isSurrogatePair(c, c2))
					{
						i = j;
					} else
					{
						i = Character.toCodePoint(c, c2);
						bytebuffer.put((byte)(i >>> 18 | 0xf0));
						bytebuffer.put((byte)(i >>> 12 & 0x3f | 0x80));
						bytebuffer.put((byte)(i >>> 6 & 0x3f | 0x80));
						bytebuffer.put((byte)(i & 0x3f | 0x80));
						i = j;
						continue;
					}
				}
				charsequence = ((CharSequence) (new StringBuilder(39)));
				((StringBuilder) (charsequence)).append("Unpaired surrogate at index ");
				((StringBuilder) (charsequence)).append(i - 1);
				throw new IllegalArgumentException(((StringBuilder) (charsequence)).toString());
			}
			bytebuffer.put((byte)(c >>> 12 | 0x1e0));
			bytebuffer.put((byte)(c >>> 6 & 0x3f | 0x80));
			bytebuffer.put((byte)(c & 0x3f | 0x80));
		}

		return;
_L3:
		if(i == j1)
		{
			k = j + j1;
		} else
		{
			j += i;
			continue; /* Loop/switch isn't completed */
		}
		  goto _L6
		if(true) goto _L8; else goto _L7
	//* 512  928:goto            782
_L7:
		i++;
	//  513  931:iload           4
	//  514  933:iconst_1        
	//  515  934:iadd            
	//  516  935:istore          4
		if(true) goto _L10; else goto _L9
	//  517  937:goto            119
_L9:
	}

	public static int zzb(int i, zzbfi zzbfi1)
	{
		i = zzcd(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #146 <Method int zzcd(int)>
	//    2    4:istore_0        
		int j = zzbfi1.zzacw();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #151 <Method int zzbfi.zzacw()>
	//    5    9:istore_2        
		return i + (zzcl(j) + j);
	//    6   10:iload_0         
	//    7   11:iload_2         
	//    8   12:invokestatic    #154 <Method int zzcl(int)>
	//    9   15:iload_2         
	//   10   16:iadd            
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	public static int zzb(int i, byte abyte0[])
	{
		return zzcd(i) + zzv(abyte0);
	//    0    0:iload_0         
	//    1    1:invokestatic    #146 <Method int zzcd(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #159 <Method int zzv(byte[])>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzcd(int i)
	{
		return zzcl(i << 3);
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:ishl            
	//    3    3:invokestatic    #154 <Method int zzcl(int)>
	//    4    6:ireturn         
	}

	public static int zzce(int i)
	{
		if(i >= 0)
	//*   0    0:iload_0         
	//*   1    1:iflt            9
			return zzcl(i);
	//    2    4:iload_0         
	//    3    5:invokestatic    #154 <Method int zzcl(int)>
	//    4    8:ireturn         
		else
			return 10;
	//    5    9:bipush          10
	//    6   11:ireturn         
	}

	public static int zzcl(int i)
	{
		if((i & 0xffffff80) == 0)
	//*   0    0:iload_0         
	//*   1    1:bipush          -128
	//*   2    3:iand            
	//*   3    4:ifne            9
			return 1;
	//    4    7:iconst_1        
	//    5    8:ireturn         
		if((i & 0xffffc000) == 0)
	//*   6    9:iload_0         
	//*   7   10:sipush          -16384
	//*   8   13:iand            
	//*   9   14:ifne            19
			return 2;
	//   10   17:iconst_2        
	//   11   18:ireturn         
		if((0xffe00000 & i) == 0)
	//*  12   19:ldc1            #161 <Int 0xffe00000>
	//*  13   21:iload_0         
	//*  14   22:iand            
	//*  15   23:ifne            28
			return 3;
	//   16   26:iconst_3        
	//   17   27:ireturn         
		return (i & 0xf0000000) != 0 ? 5 : 4;
	//   18   28:iload_0         
	//   19   29:ldc1            #162 <Int 0xf0000000>
	//   20   31:iand            
	//   21   32:ifne            37
	//   22   35:iconst_4        
	//   23   36:ireturn         
	//   24   37:iconst_5        
	//   25   38:ireturn         
	}

	public static int zzd(int i, long l)
	{
		return zzcd(i) + zzy(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #146 <Method int zzcd(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #168 <Method int zzy(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	private final void zzdd(int i)
		throws IOException
	{
		byte byte0 = (byte)i;
	//    0    0:iload_1         
	//    1    1:int2byte        
	//    2    2:istore_2        
		if(!zzebj.hasRemaining())
	//*   3    3:aload_0         
	//*   4    4:getfield        #13  <Field ByteBuffer zzebj>
	//*   5    7:invokevirtual   #174 <Method boolean ByteBuffer.hasRemaining()>
	//*   6   10:ifne            35
		{
			throw new zzbfb(zzebj.position(), zzebj.limit());
	//    7   13:new             #176 <Class zzbfb>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #13  <Field ByteBuffer zzebj>
	//   11   21:invokevirtual   #107 <Method int ByteBuffer.position()>
	//   12   24:aload_0         
	//   13   25:getfield        #13  <Field ByteBuffer zzebj>
	//   14   28:invokevirtual   #179 <Method int ByteBuffer.limit()>
	//   15   31:invokespecial   #182 <Method void zzbfb(int, int)>
	//   16   34:athrow          
		} else
		{
			zzebj.put(byte0);
	//   17   35:aload_0         
	//   18   36:getfield        #13  <Field ByteBuffer zzebj>
	//   19   39:iload_2         
	//   20   40:invokevirtual   #140 <Method ByteBuffer ByteBuffer.put(byte)>
	//   21   43:pop             
			return;
	//   22   44:return          
		}
	}

	public static int zze(int i, long l)
	{
		return zzcd(i) + zzy(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #146 <Method int zzcd(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #168 <Method int zzy(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzeo(String s)
	{
		int i = zza(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #188 <Method int zza(CharSequence)>
	//    2    4:istore_1        
		return zzcl(i) + i;
	//    3    5:iload_1         
	//    4    6:invokestatic    #154 <Method int zzcl(int)>
	//    5    9:iload_1         
	//    6   10:iadd            
	//    7   11:ireturn         
	}

	public static int zzg(int i, String s)
	{
		return zzcd(i) + zzeo(s);
	//    0    0:iload_0         
	//    1    1:invokestatic    #146 <Method int zzcd(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #192 <Method int zzeo(String)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static zzbfa zzj(byte abyte0[], int i, int j)
	{
		return new zzbfa(abyte0, 0, j);
	//    0    0:new             #2   <Class zzbfa>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:iload_2         
	//    5    7:invokespecial   #196 <Method void zzbfa(byte[], int, int)>
	//    6   10:areturn         
	}

	public static int zzq(int i, int j)
	{
		return zzcd(i) + zzce(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #146 <Method int zzcd(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #200 <Method int zzce(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static zzbfa zzu(byte abyte0[])
	{
		return zzj(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:invokestatic    #204 <Method zzbfa zzj(byte[], int, int)>
	//    5    7:areturn         
	}

	public static int zzv(byte abyte0[])
	{
		return zzcl(abyte0.length) + abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:invokestatic    #154 <Method int zzcl(int)>
	//    3    5:aload_0         
	//    4    6:arraylength     
	//    5    7:iadd            
	//    6    8:ireturn         
	}

	private final void zzx(long l)
		throws IOException
	{
		do
		{
			if((l & -128L) == 0L)
	//*   0    0:lload_1         
	//*   1    1:ldc2w           #207 <Long -128L>
	//*   2    4:land            
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:ifne            17
			{
				zzdd((int)l);
	//    6   10:aload_0         
	//    7   11:lload_1         
	//    8   12:l2i             
	//    9   13:invokespecial   #210 <Method void zzdd(int)>
				return;
	//   10   16:return          
			}
			zzdd((int)l & 0x7f | 0x80);
	//   11   17:aload_0         
	//   12   18:lload_1         
	//   13   19:l2i             
	//   14   20:bipush          127
	//   15   22:iand            
	//   16   23:sipush          128
	//   17   26:ior             
	//   18   27:invokespecial   #210 <Method void zzdd(int)>
			l >>>= 7;
	//   19   30:lload_1         
	//   20   31:bipush          7
	//   21   33:lushr           
	//   22   34:lstore_1        
		} while(true);
	//   23   35:goto            0
	}

	public static int zzy(long l)
	{
		if((l & -128L) == 0L)
	//*   0    0:lload_0         
	//*   1    1:ldc2w           #207 <Long -128L>
	//*   2    4:land            
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:ifne            12
			return 1;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		if((l & -16384L) == 0L)
	//*   8   12:lload_0         
	//*   9   13:ldc2w           #211 <Long -16384L>
	//*  10   16:land            
	//*  11   17:lconst_0        
	//*  12   18:lcmp            
	//*  13   19:ifne            24
			return 2;
	//   14   22:iconst_2        
	//   15   23:ireturn         
		if((l & 0xffe00000L) == 0L)
	//*  16   24:lload_0         
	//*  17   25:ldc2w           #213 <Long 0xffe00000L>
	//*  18   28:land            
	//*  19   29:lconst_0        
	//*  20   30:lcmp            
	//*  21   31:ifne            36
			return 3;
	//   22   34:iconst_3        
	//   23   35:ireturn         
		if((l & 0xf0000000L) == 0L)
	//*  24   36:lload_0         
	//*  25   37:ldc2w           #215 <Long 0xf0000000L>
	//*  26   40:land            
	//*  27   41:lconst_0        
	//*  28   42:lcmp            
	//*  29   43:ifne            48
			return 4;
	//   30   46:iconst_4        
	//   31   47:ireturn         
		if((l & 0x0L) == 0L)
	//*  32   48:lload_0         
	//*  33   49:ldc2w           #217 <Long 0x0L>
	//*  34   52:land            
	//*  35   53:lconst_0        
	//*  36   54:lcmp            
	//*  37   55:ifne            60
			return 5;
	//   38   58:iconst_5        
	//   39   59:ireturn         
		if((l & 0x0L) == 0L)
	//*  40   60:lload_0         
	//*  41   61:ldc2w           #219 <Long 0x0L>
	//*  42   64:land            
	//*  43   65:lconst_0        
	//*  44   66:lcmp            
	//*  45   67:ifne            73
			return 6;
	//   46   70:bipush          6
	//   47   72:ireturn         
		if((l & 0x0L) == 0L)
	//*  48   73:lload_0         
	//*  49   74:ldc2w           #221 <Long 0x0L>
	//*  50   77:land            
	//*  51   78:lconst_0        
	//*  52   79:lcmp            
	//*  53   80:ifne            86
			return 7;
	//   54   83:bipush          7
	//   55   85:ireturn         
		if((l & 0x0L) == 0L)
	//*  56   86:lload_0         
	//*  57   87:ldc2w           #223 <Long 0x0L>
	//*  58   90:land            
	//*  59   91:lconst_0        
	//*  60   92:lcmp            
	//*  61   93:ifne            99
			return 8;
	//   62   96:bipush          8
	//   63   98:ireturn         
		return (l & 0x0L) != 0L ? 10 : 9;
	//   64   99:lload_0         
	//   65  100:ldc2w           #225 <Long 0x0L>
	//   66  103:land            
	//   67  104:lconst_0        
	//   68  105:lcmp            
	//   69  106:ifne            112
	//   70  109:bipush          9
	//   71  111:ireturn         
	//   72  112:bipush          10
	//   73  114:ireturn         
	}

	public final void zza(int i, long l)
		throws IOException
	{
		zzl(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #230 <Method void zzl(int, int)>
		zzx(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokespecial   #232 <Method void zzx(long)>
	//    7   11:return          
	}

	public final void zza(int i, zzbfi zzbfi1)
		throws IOException
	{
		zzl(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #230 <Method void zzl(int, int)>
		if(zzbfi1.zzebt < 0)
	//*   4    6:aload_2         
	//*   5    7:getfield        #237 <Field int zzbfi.zzebt>
	//*   6   10:ifge            18
			zzbfi1.zzacw();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #151 <Method int zzbfi.zzacw()>
	//    9   17:pop             
		zzde(zzbfi1.zzebt);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:getfield        #237 <Field int zzbfi.zzebt>
	//   13   23:invokevirtual   #240 <Method void zzde(int)>
		zzbfi1.zza(this);
	//   14   26:aload_2         
	//   15   27:aload_0         
	//   16   28:invokevirtual   #243 <Method void zzbfi.zza(zzbfa)>
	//   17   31:return          
	}

	public final void zza(int i, byte abyte0[])
		throws IOException
	{
		zzl(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #230 <Method void zzl(int, int)>
		zzde(abyte0.length);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:arraylength     
	//    7    9:invokevirtual   #240 <Method void zzde(int)>
		zzw(abyte0);
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #248 <Method void zzw(byte[])>
	//   11   17:return          
	}

	public final void zzacl()
	{
		if(zzebj.remaining() != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field ByteBuffer zzebj>
	//*   2    4:invokevirtual   #110 <Method int ByteBuffer.remaining()>
	//*   3    7:ifeq            40
			throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[] {
				Integer.valueOf(zzebj.remaining())
			}));
	//    4   10:new             #251 <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:ldc1            #253 <String "Did not write as much data as expected, %s bytes remaining.">
	//    7   16:iconst_1        
	//    8   17:anewarray       Object[]
	//    9   20:dup             
	//   10   21:iconst_0        
	//   11   22:aload_0         
	//   12   23:getfield        #13  <Field ByteBuffer zzebj>
	//   13   26:invokevirtual   #110 <Method int ByteBuffer.remaining()>
	//   14   29:invokestatic    #259 <Method Integer Integer.valueOf(int)>
	//   15   32:aastore         
	//   16   33:invokestatic    #265 <Method String String.format(String, Object[])>
	//   17   36:invokespecial   #266 <Method void IllegalStateException(String)>
	//   18   39:athrow          
		else
			return;
	//   19   40:return          
	}

	public final void zzde(int i)
		throws IOException
	{
		do
		{
			if((i & 0xffffff80) == 0)
	//*   0    0:iload_1         
	//*   1    1:bipush          -128
	//*   2    3:iand            
	//*   3    4:ifne            13
			{
				zzdd(i);
	//    4    7:aload_0         
	//    5    8:iload_1         
	//    6    9:invokespecial   #210 <Method void zzdd(int)>
				return;
	//    7   12:return          
			}
			zzdd(i & 0x7f | 0x80);
	//    8   13:aload_0         
	//    9   14:iload_1         
	//   10   15:bipush          127
	//   11   17:iand            
	//   12   18:sipush          128
	//   13   21:ior             
	//   14   22:invokespecial   #210 <Method void zzdd(int)>
			i >>>= 7;
	//   15   25:iload_1         
	//   16   26:bipush          7
	//   17   28:iushr           
	//   18   29:istore_1        
		} while(true);
	//   19   30:goto            0
	}

	public final void zzf(int i, String s)
		throws IOException
	{
		zzl(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #230 <Method void zzl(int, int)>
		try
		{
			i = zzcl(s.length());
	//    4    6:aload_2         
	//    5    7:invokevirtual   #269 <Method int String.length()>
	//    6   10:invokestatic    #154 <Method int zzcl(int)>
	//    7   13:istore_1        
			if(i == zzcl(s.length() * 3))
	//*   8   14:iload_1         
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #269 <Method int String.length()>
	//*  11   19:iconst_3        
	//*  12   20:imul            
	//*  13   21:invokestatic    #154 <Method int zzcl(int)>
	//*  14   24:icmpne          122
			{
				int j = zzebj.position();
	//   15   27:aload_0         
	//   16   28:getfield        #13  <Field ByteBuffer zzebj>
	//   17   31:invokevirtual   #107 <Method int ByteBuffer.position()>
	//   18   34:istore_3        
				if(zzebj.remaining() < i)
	//*  19   35:aload_0         
	//*  20   36:getfield        #13  <Field ByteBuffer zzebj>
	//*  21   39:invokevirtual   #110 <Method int ByteBuffer.remaining()>
	//*  22   42:iload_1         
	//*  23   43:icmpge          64
				{
					throw new zzbfb(j + i, zzebj.limit());
	//   24   46:new             #176 <Class zzbfb>
	//   25   49:dup             
	//   26   50:iload_3         
	//   27   51:iload_1         
	//   28   52:iadd            
	//   29   53:aload_0         
	//   30   54:getfield        #13  <Field ByteBuffer zzebj>
	//   31   57:invokevirtual   #179 <Method int ByteBuffer.limit()>
	//   32   60:invokespecial   #182 <Method void zzbfb(int, int)>
	//   33   63:athrow          
				} else
				{
					zzebj.position(j + i);
	//   34   64:aload_0         
	//   35   65:getfield        #13  <Field ByteBuffer zzebj>
	//   36   68:iload_3         
	//   37   69:iload_1         
	//   38   70:iadd            
	//   39   71:invokevirtual   #129 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   40   74:pop             
					zza(((CharSequence) (s)), zzebj);
	//   41   75:aload_2         
	//   42   76:aload_0         
	//   43   77:getfield        #13  <Field ByteBuffer zzebj>
	//   44   80:invokestatic    #271 <Method void zza(CharSequence, ByteBuffer)>
					int k = zzebj.position();
	//   45   83:aload_0         
	//   46   84:getfield        #13  <Field ByteBuffer zzebj>
	//   47   87:invokevirtual   #107 <Method int ByteBuffer.position()>
	//   48   90:istore          4
					zzebj.position(j);
	//   49   92:aload_0         
	//   50   93:getfield        #13  <Field ByteBuffer zzebj>
	//   51   96:iload_3         
	//   52   97:invokevirtual   #129 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   53  100:pop             
					zzde(k - j - i);
	//   54  101:aload_0         
	//   55  102:iload           4
	//   56  104:iload_3         
	//   57  105:isub            
	//   58  106:iload_1         
	//   59  107:isub            
	//   60  108:invokevirtual   #240 <Method void zzde(int)>
					zzebj.position(k);
	//   61  111:aload_0         
	//   62  112:getfield        #13  <Field ByteBuffer zzebj>
	//   63  115:iload           4
	//   64  117:invokevirtual   #129 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   65  120:pop             
					return;
	//   66  121:return          
				}
			}
		}
	//*  67  122:aload_0         
	//*  68  123:aload_2         
	//*  69  124:invokestatic    #188 <Method int zza(CharSequence)>
	//*  70  127:invokevirtual   #240 <Method void zzde(int)>
	//*  71  130:aload_2         
	//*  72  131:aload_0         
	//*  73  132:getfield        #13  <Field ByteBuffer zzebj>
	//*  74  135:invokestatic    #271 <Method void zza(CharSequence, ByteBuffer)>
	//*  75  138:return          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  76  139:astore_2        
		{
			zzbfb zzbfb1 = new zzbfb(zzebj.position(), zzebj.limit());
	//   77  140:new             #176 <Class zzbfb>
	//   78  143:dup             
	//   79  144:aload_0         
	//   80  145:getfield        #13  <Field ByteBuffer zzebj>
	//   81  148:invokevirtual   #107 <Method int ByteBuffer.position()>
	//   82  151:aload_0         
	//   83  152:getfield        #13  <Field ByteBuffer zzebj>
	//   84  155:invokevirtual   #179 <Method int ByteBuffer.limit()>
	//   85  158:invokespecial   #182 <Method void zzbfb(int, int)>
	//   86  161:astore          5
			zzbfb1.initCause(((Throwable) (s)));
	//   87  163:aload           5
	//   88  165:aload_2         
	//   89  166:invokevirtual   #272 <Method Throwable zzbfb.initCause(Throwable)>
	//   90  169:pop             
			throw zzbfb1;
	//   91  170:aload           5
	//   92  172:athrow          
		}
		zzde(zza(((CharSequence) (s))));
		zza(((CharSequence) (s)), zzebj);
		return;
	}

	public final void zzf(int i, boolean flag)
		throws IOException
	{
		zzl(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #230 <Method void zzl(int, int)>
		byte byte0 = (byte)flag;
	//    4    6:iload_2         
	//    5    7:int2byte        
	//    6    8:istore_3        
		if(!zzebj.hasRemaining())
	//*   7    9:aload_0         
	//*   8   10:getfield        #13  <Field ByteBuffer zzebj>
	//*   9   13:invokevirtual   #174 <Method boolean ByteBuffer.hasRemaining()>
	//*  10   16:ifne            41
		{
			throw new zzbfb(zzebj.position(), zzebj.limit());
	//   11   19:new             #176 <Class zzbfb>
	//   12   22:dup             
	//   13   23:aload_0         
	//   14   24:getfield        #13  <Field ByteBuffer zzebj>
	//   15   27:invokevirtual   #107 <Method int ByteBuffer.position()>
	//   16   30:aload_0         
	//   17   31:getfield        #13  <Field ByteBuffer zzebj>
	//   18   34:invokevirtual   #179 <Method int ByteBuffer.limit()>
	//   19   37:invokespecial   #182 <Method void zzbfb(int, int)>
	//   20   40:athrow          
		} else
		{
			zzebj.put(byte0);
	//   21   41:aload_0         
	//   22   42:getfield        #13  <Field ByteBuffer zzebj>
	//   23   45:iload_3         
	//   24   46:invokevirtual   #140 <Method ByteBuffer ByteBuffer.put(byte)>
	//   25   49:pop             
			return;
	//   26   50:return          
		}
	}

	public final void zzi(int i, long l)
		throws IOException
	{
		zzl(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #230 <Method void zzl(int, int)>
		zzx(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokespecial   #232 <Method void zzx(long)>
	//    7   11:return          
	}

	public final void zzl(int i, int j)
		throws IOException
	{
		zzde(i << 3 | j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:ishl            
	//    4    4:iload_2         
	//    5    5:ior             
	//    6    6:invokevirtual   #240 <Method void zzde(int)>
	//    7    9:return          
	}

	public final void zzm(int i, int j)
		throws IOException
	{
		zzl(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #230 <Method void zzl(int, int)>
		if(j >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            16
		{
			zzde(j);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #240 <Method void zzde(int)>
			return;
	//    9   15:return          
		} else
		{
			zzx(j);
	//   10   16:aload_0         
	//   11   17:iload_2         
	//   12   18:i2l             
	//   13   19:invokespecial   #232 <Method void zzx(long)>
			return;
	//   14   22:return          
		}
	}

	public final void zzw(byte abyte0[])
		throws IOException
	{
		int i = abyte0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_2        
		if(zzebj.remaining() >= i)
	//*   3    3:aload_0         
	//*   4    4:getfield        #13  <Field ByteBuffer zzebj>
	//*   5    7:invokevirtual   #110 <Method int ByteBuffer.remaining()>
	//*   6   10:iload_2         
	//*   7   11:icmplt          26
		{
			zzebj.put(abyte0, 0, i);
	//    8   14:aload_0         
	//    9   15:getfield        #13  <Field ByteBuffer zzebj>
	//   10   18:aload_1         
	//   11   19:iconst_0        
	//   12   20:iload_2         
	//   13   21:invokevirtual   #277 <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//   14   24:pop             
			return;
	//   15   25:return          
		} else
		{
			throw new zzbfb(zzebj.position(), zzebj.limit());
	//   16   26:new             #176 <Class zzbfb>
	//   17   29:dup             
	//   18   30:aload_0         
	//   19   31:getfield        #13  <Field ByteBuffer zzebj>
	//   20   34:invokevirtual   #107 <Method int ByteBuffer.position()>
	//   21   37:aload_0         
	//   22   38:getfield        #13  <Field ByteBuffer zzebj>
	//   23   41:invokevirtual   #179 <Method int ByteBuffer.limit()>
	//   24   44:invokespecial   #182 <Method void zzbfb(int, int)>
	//   25   47:athrow          
		}
	}

	private final ByteBuffer zzebj;
}
