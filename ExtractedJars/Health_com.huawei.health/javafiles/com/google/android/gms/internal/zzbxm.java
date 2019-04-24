// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;
import java.nio.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzbxt, zzbxw

public final class zzbxm
{
	public static class zza extends IOException
	{

		zza(int i, int j)
		{
			super((new StringBuilder(108)).append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ").append(i).append(" limit ").append(j).append(").").toString());
		//    0    0:aload_0         
		//    1    1:new             #11  <Class StringBuilder>
		//    2    4:dup             
		//    3    5:bipush          108
		//    4    7:invokespecial   #14  <Method void StringBuilder(int)>
		//    5   10:ldc1            #16  <String "CodedOutputStream was writing to a flat byte array and ran out of space (pos ">
		//    6   12:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #23  <Method StringBuilder StringBuilder.append(int)>
		//    9   19:ldc1            #25  <String " limit ">
		//   10   21:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
		//   11   24:iload_2         
		//   12   25:invokevirtual   #23  <Method StringBuilder StringBuilder.append(int)>
		//   13   28:ldc1            #27  <String ").">
		//   14   30:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
		//   15   33:invokevirtual   #31  <Method String StringBuilder.toString()>
		//   16   36:invokespecial   #34  <Method void IOException(String)>
		//   17   39:return          
		}
	}


	private zzbxm(ByteBuffer bytebuffer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzcuH = bytebuffer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field ByteBuffer zzcuH>
		zzcuH.order(ByteOrder.LITTLE_ENDIAN);
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field ByteBuffer zzcuH>
	//    7   13:getstatic       #22  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//    8   16:invokevirtual   #28  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//    9   19:pop             
	//   10   20:return          
	}

	private zzbxm(byte abyte0[], int i, int j)
	{
		this(ByteBuffer.wrap(abyte0, i, j));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokestatic    #34  <Method ByteBuffer ByteBuffer.wrap(byte[], int, int)>
	//    5    7:invokespecial   #36  <Method void zzbxm(ByteBuffer)>
	//    6   10:return          
	}

	public static int zzL(int i, int j)
	{
		return zzrj(i) + zzrg(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzrj(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #45  <Method int zzrg(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzM(int i, int j)
	{
		return zzrj(i) + zzrh(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzrj(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #49  <Method int zzrh(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	private static int zza(CharSequence charsequence, int i)
	{
		int i1 = charsequence.length();
	//    0    0:aload_0         
	//    1    1:invokeinterface #56  <Method int CharSequence.length()>
	//    2    6:istore          5
		int j = 0;
	//    3    8:iconst_0        
	//    4    9:istore_2        
		int k;
		for(; i < i1; i = k + 1)
	//*   5   10:iload_1         
	//*   6   11:iload           5
	//*   7   13:icmpge          131
		{
			char c = charsequence.charAt(i);
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokeinterface #60  <Method char CharSequence.charAt(int)>
	//   11   23:istore          6
			if(c < '\u0800')
	//*  12   25:iload           6
	//*  13   27:sipush          2048
	//*  14   30:icmpge          49
			{
				j += 127 - c >>> 31;
	//   15   33:iload_2         
	//   16   34:bipush          127
	//   17   36:iload           6
	//   18   38:isub            
	//   19   39:bipush          31
	//   20   41:iushr           
	//   21   42:iadd            
	//   22   43:istore_2        
				k = i;
	//   23   44:iload_1         
	//   24   45:istore_3        
				continue;
	//   25   46:goto            124
			}
			int l = j + 2;
	//   26   49:iload_2         
	//   27   50:iconst_2        
	//   28   51:iadd            
	//   29   52:istore          4
			j = l;
	//   30   54:iload           4
	//   31   56:istore_2        
			k = i;
	//   32   57:iload_1         
	//   33   58:istore_3        
			if('\uD800' > c)
				continue;
	//   34   59:ldc1            #61  <Int 55296>
	//   35   61:iload           6
	//   36   63:icmpgt          124
			j = l;
	//   37   66:iload           4
	//   38   68:istore_2        
			k = i;
	//   39   69:iload_1         
	//   40   70:istore_3        
			if(c > '\uDFFF')
				continue;
	//   41   71:iload           6
	//   42   73:ldc1            #62  <Int 57343>
	//   43   75:icmpgt          124
			if(Character.codePointAt(charsequence, i) < 0x10000)
	//*  44   78:aload_0         
	//*  45   79:iload_1         
	//*  46   80:invokestatic    #67  <Method int Character.codePointAt(CharSequence, int)>
	//*  47   83:ldc1            #68  <Int 0x10000>
	//*  48   85:icmpge          117
				throw new IllegalArgumentException((new StringBuilder(39)).append("Unpaired surrogate at index ").append(i).toString());
	//   49   88:new             #70  <Class IllegalArgumentException>
	//   50   91:dup             
	//   51   92:new             #72  <Class StringBuilder>
	//   52   95:dup             
	//   53   96:bipush          39
	//   54   98:invokespecial   #75  <Method void StringBuilder(int)>
	//   55  101:ldc1            #77  <String "Unpaired surrogate at index ">
	//   56  103:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   57  106:iload_1         
	//   58  107:invokevirtual   #84  <Method StringBuilder StringBuilder.append(int)>
	//   59  110:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   60  113:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//   61  116:athrow          
			k = i + 1;
	//   62  117:iload_1         
	//   63  118:iconst_1        
	//   64  119:iadd            
	//   65  120:istore_3        
			j = l;
	//   66  121:iload           4
	//   67  123:istore_2        
		}

	//   68  124:iload_3         
	//   69  125:iconst_1        
	//   70  126:iadd            
	//   71  127:istore_1        
	//*  72  128:goto            10
		return j;
	//   73  131:iload_2         
	//   74  132:ireturn         
	}

	private static int zza(CharSequence charsequence, byte abyte0[], int i, int j)
	{
		int l1 = charsequence.length();
	//    0    0:aload_0         
	//    1    1:invokeinterface #56  <Method int CharSequence.length()>
	//    2    6:istore          7
		boolean flag = false;
	//    3    8:iconst_0        
	//    4    9:istore          6
		int i2 = i + j;
	//    5   11:iload_2         
	//    6   12:iload_3         
	//    7   13:iadd            
	//    8   14:istore          8
		j = ((int) (flag));
	//    9   16:iload           6
	//   10   18:istore_3        
		do
		{
			if(j >= l1 || j + i >= i2)
				break;
	//   11   19:iload_3         
	//   12   20:iload           7
	//   13   22:icmpge          65
	//   14   25:iload_3         
	//   15   26:iload_2         
	//   16   27:iadd            
	//   17   28:iload           8
	//   18   30:icmpge          65
			char c2 = charsequence.charAt(j);
	//   19   33:aload_0         
	//   20   34:iload_3         
	//   21   35:invokeinterface #60  <Method char CharSequence.charAt(int)>
	//   22   40:istore          6
			if(c2 >= '\200')
				break;
	//   23   42:iload           6
	//   24   44:sipush          128
	//   25   47:icmpge          65
			abyte0[i + j] = (byte)c2;
	//   26   50:aload_1         
	//   27   51:iload_2         
	//   28   52:iload_3         
	//   29   53:iadd            
	//   30   54:iload           6
	//   31   56:int2byte        
	//   32   57:bastore         
			j++;
	//   33   58:iload_3         
	//   34   59:iconst_1        
	//   35   60:iadd            
	//   36   61:istore_3        
		} while(true);
	//   37   62:goto            19
		if(j == l1)
	//*  38   65:iload_3         
	//*  39   66:iload           7
	//*  40   68:icmpne          76
			return i + l1;
	//   41   71:iload_2         
	//   42   72:iload           7
	//   43   74:iadd            
	//   44   75:ireturn         
		i += j;
	//   45   76:iload_2         
	//   46   77:iload_3         
	//   47   78:iadd            
	//   48   79:istore_2        
		for(; j < l1; j++)
	//*  49   80:iload_3         
	//*  50   81:iload           7
	//*  51   83:icmpge          486
		{
			char c;
label0:
			{
				char c1;
label1:
				{
					c = charsequence.charAt(j);
	//   52   86:aload_0         
	//   53   87:iload_3         
	//   54   88:invokeinterface #60  <Method char CharSequence.charAt(int)>
	//   55   93:istore          4
					if(c < '\200' && i < i2)
	//*  56   95:iload           4
	//*  57   97:sipush          128
	//*  58  100:icmpge          126
	//*  59  103:iload_2         
	//*  60  104:iload           8
	//*  61  106:icmpge          126
					{
						int k = i + 1;
	//   62  109:iload_2         
	//   63  110:iconst_1        
	//   64  111:iadd            
	//   65  112:istore          6
						abyte0[i] = (byte)c;
	//   66  114:aload_1         
	//   67  115:iload_2         
	//   68  116:iload           4
	//   69  118:int2byte        
	//   70  119:bastore         
						i = k;
	//   71  120:iload           6
	//   72  122:istore_2        
						continue;
	//   73  123:goto            479
					}
					if(c < '\u0800' && i <= i2 - 2)
	//*  74  126:iload           4
	//*  75  128:sipush          2048
	//*  76  131:icmpge          182
	//*  77  134:iload_2         
	//*  78  135:iload           8
	//*  79  137:iconst_2        
	//*  80  138:isub            
	//*  81  139:icmpgt          182
					{
						int l = i + 1;
	//   82  142:iload_2         
	//   83  143:iconst_1        
	//   84  144:iadd            
	//   85  145:istore          6
						abyte0[i] = (byte)(c >>> 6 | 0x3c0);
	//   86  147:aload_1         
	//   87  148:iload_2         
	//   88  149:iload           4
	//   89  151:bipush          6
	//   90  153:iushr           
	//   91  154:sipush          960
	//   92  157:ior             
	//   93  158:int2byte        
	//   94  159:bastore         
						i = l + 1;
	//   95  160:iload           6
	//   96  162:iconst_1        
	//   97  163:iadd            
	//   98  164:istore_2        
						abyte0[l] = (byte)(c & 0x3f | 0x80);
	//   99  165:aload_1         
	//  100  166:iload           6
	//  101  168:iload           4
	//  102  170:bipush          63
	//  103  172:iand            
	//  104  173:sipush          128
	//  105  176:ior             
	//  106  177:int2byte        
	//  107  178:bastore         
						continue;
	//  108  179:goto            479
					}
					if((c < '\uD800' || '\uDFFF' < c) && i <= i2 - 3)
	//* 109  182:iload           4
	//* 110  184:ldc1            #61  <Int 55296>
	//* 111  186:icmplt          196
	//* 112  189:ldc1            #62  <Int 57343>
	//* 113  191:iload           4
	//* 114  193:icmpge          267
	//* 115  196:iload_2         
	//* 116  197:iload           8
	//* 117  199:iconst_3        
	//* 118  200:isub            
	//* 119  201:icmpgt          267
					{
						int i1 = i + 1;
	//  120  204:iload_2         
	//  121  205:iconst_1        
	//  122  206:iadd            
	//  123  207:istore          6
						abyte0[i] = (byte)(c >>> 12 | 0x1e0);
	//  124  209:aload_1         
	//  125  210:iload_2         
	//  126  211:iload           4
	//  127  213:bipush          12
	//  128  215:iushr           
	//  129  216:sipush          480
	//  130  219:ior             
	//  131  220:int2byte        
	//  132  221:bastore         
						int j2 = i1 + 1;
	//  133  222:iload           6
	//  134  224:iconst_1        
	//  135  225:iadd            
	//  136  226:istore          9
						abyte0[i1] = (byte)(c >>> 6 & 0x3f | 0x80);
	//  137  228:aload_1         
	//  138  229:iload           6
	//  139  231:iload           4
	//  140  233:bipush          6
	//  141  235:iushr           
	//  142  236:bipush          63
	//  143  238:iand            
	//  144  239:sipush          128
	//  145  242:ior             
	//  146  243:int2byte        
	//  147  244:bastore         
						i = j2 + 1;
	//  148  245:iload           9
	//  149  247:iconst_1        
	//  150  248:iadd            
	//  151  249:istore_2        
						abyte0[j2] = (byte)(c & 0x3f | 0x80);
	//  152  250:aload_1         
	//  153  251:iload           9
	//  154  253:iload           4
	//  155  255:bipush          63
	//  156  257:iand            
	//  157  258:sipush          128
	//  158  261:ior             
	//  159  262:int2byte        
	//  160  263:bastore         
						continue;
	//  161  264:goto            479
					}
					if(i > i2 - 4)
						break label0;
	//  162  267:iload_2         
	//  163  268:iload           8
	//  164  270:iconst_4        
	//  165  271:isub            
	//  166  272:icmpgt          440
					int j1 = j;
	//  167  275:iload_3         
	//  168  276:istore          6
					if(j + 1 != charsequence.length())
	//* 169  278:iload_3         
	//* 170  279:iconst_1        
	//* 171  280:iadd            
	//* 172  281:aload_0         
	//* 173  282:invokeinterface #56  <Method int CharSequence.length()>
	//* 174  287:icmpeq          316
					{
						j++;
	//  175  290:iload_3         
	//  176  291:iconst_1        
	//  177  292:iadd            
	//  178  293:istore_3        
						c1 = charsequence.charAt(j);
	//  179  294:aload_0         
	//  180  295:iload_3         
	//  181  296:invokeinterface #60  <Method char CharSequence.charAt(int)>
	//  182  301:istore          5
						if(Character.isSurrogatePair(c, c1))
							break label1;
	//  183  303:iload           4
	//  184  305:iload           5
	//  185  307:invokestatic    #96  <Method boolean Character.isSurrogatePair(char, char)>
	//  186  310:ifne            348
						j1 = j;
	//  187  313:iload_3         
	//  188  314:istore          6
					}
					throw new IllegalArgumentException((new StringBuilder(39)).append("Unpaired surrogate at index ").append(j1 - 1).toString());
	//  189  316:new             #70  <Class IllegalArgumentException>
	//  190  319:dup             
	//  191  320:new             #72  <Class StringBuilder>
	//  192  323:dup             
	//  193  324:bipush          39
	//  194  326:invokespecial   #75  <Method void StringBuilder(int)>
	//  195  329:ldc1            #77  <String "Unpaired surrogate at index ">
	//  196  331:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  197  334:iload           6
	//  198  336:iconst_1        
	//  199  337:isub            
	//  200  338:invokevirtual   #84  <Method StringBuilder StringBuilder.append(int)>
	//  201  341:invokevirtual   #88  <Method String StringBuilder.toString()>
	//  202  344:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//  203  347:athrow          
				}
				int k1 = Character.toCodePoint(c, c1);
	//  204  348:iload           4
	//  205  350:iload           5
	//  206  352:invokestatic    #100 <Method int Character.toCodePoint(char, char)>
	//  207  355:istore          6
				int k2 = i + 1;
	//  208  357:iload_2         
	//  209  358:iconst_1        
	//  210  359:iadd            
	//  211  360:istore          9
				abyte0[i] = (byte)(k1 >>> 18 | 0xf0);
	//  212  362:aload_1         
	//  213  363:iload_2         
	//  214  364:iload           6
	//  215  366:bipush          18
	//  216  368:iushr           
	//  217  369:sipush          240
	//  218  372:ior             
	//  219  373:int2byte        
	//  220  374:bastore         
				i = k2 + 1;
	//  221  375:iload           9
	//  222  377:iconst_1        
	//  223  378:iadd            
	//  224  379:istore_2        
				abyte0[k2] = (byte)(k1 >>> 12 & 0x3f | 0x80);
	//  225  380:aload_1         
	//  226  381:iload           9
	//  227  383:iload           6
	//  228  385:bipush          12
	//  229  387:iushr           
	//  230  388:bipush          63
	//  231  390:iand            
	//  232  391:sipush          128
	//  233  394:ior             
	//  234  395:int2byte        
	//  235  396:bastore         
				k2 = i + 1;
	//  236  397:iload_2         
	//  237  398:iconst_1        
	//  238  399:iadd            
	//  239  400:istore          9
				abyte0[i] = (byte)(k1 >>> 6 & 0x3f | 0x80);
	//  240  402:aload_1         
	//  241  403:iload_2         
	//  242  404:iload           6
	//  243  406:bipush          6
	//  244  408:iushr           
	//  245  409:bipush          63
	//  246  411:iand            
	//  247  412:sipush          128
	//  248  415:ior             
	//  249  416:int2byte        
	//  250  417:bastore         
				i = k2 + 1;
	//  251  418:iload           9
	//  252  420:iconst_1        
	//  253  421:iadd            
	//  254  422:istore_2        
				abyte0[k2] = (byte)(k1 & 0x3f | 0x80);
	//  255  423:aload_1         
	//  256  424:iload           9
	//  257  426:iload           6
	//  258  428:bipush          63
	//  259  430:iand            
	//  260  431:sipush          128
	//  261  434:ior             
	//  262  435:int2byte        
	//  263  436:bastore         
				continue;
	//  264  437:goto            479
			}
			throw new ArrayIndexOutOfBoundsException((new StringBuilder(37)).append("Failed writing ").append(c).append(" at index ").append(i).toString());
	//  265  440:new             #102 <Class ArrayIndexOutOfBoundsException>
	//  266  443:dup             
	//  267  444:new             #72  <Class StringBuilder>
	//  268  447:dup             
	//  269  448:bipush          37
	//  270  450:invokespecial   #75  <Method void StringBuilder(int)>
	//  271  453:ldc1            #104 <String "Failed writing ">
	//  272  455:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  273  458:iload           4
	//  274  460:invokevirtual   #107 <Method StringBuilder StringBuilder.append(char)>
	//  275  463:ldc1            #109 <String " at index ">
	//  276  465:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  277  468:iload_2         
	//  278  469:invokevirtual   #84  <Method StringBuilder StringBuilder.append(int)>
	//  279  472:invokevirtual   #88  <Method String StringBuilder.toString()>
	//  280  475:invokespecial   #110 <Method void ArrayIndexOutOfBoundsException(String)>
	//  281  478:athrow          
		}

	//  282  479:iload_3         
	//  283  480:iconst_1        
	//  284  481:iadd            
	//  285  482:istore_3        
	//* 286  483:goto            80
		return i;
	//  287  486:iload_2         
	//  288  487:ireturn         
	}

	private static void zza(CharSequence charsequence, ByteBuffer bytebuffer)
	{
		if(bytebuffer.isReadOnly())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #115 <Method boolean ByteBuffer.isReadOnly()>
	//*   2    4:ifeq            15
			throw new ReadOnlyBufferException();
	//    3    7:new             #117 <Class ReadOnlyBufferException>
	//    4   10:dup             
	//    5   11:invokespecial   #118 <Method void ReadOnlyBufferException()>
	//    6   14:athrow          
		if(bytebuffer.hasArray())
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #121 <Method boolean ByteBuffer.hasArray()>
	//*   9   19:ifeq            71
		{
			try
			{
				bytebuffer.position(zza(charsequence, bytebuffer.array(), bytebuffer.arrayOffset() + bytebuffer.position(), bytebuffer.remaining()) - bytebuffer.arrayOffset());
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #125 <Method byte[] ByteBuffer.array()>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #128 <Method int ByteBuffer.arrayOffset()>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #131 <Method int ByteBuffer.position()>
	//   18   36:iadd            
	//   19   37:aload_1         
	//   20   38:invokevirtual   #134 <Method int ByteBuffer.remaining()>
	//   21   41:invokestatic    #136 <Method int zza(CharSequence, byte[], int, int)>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #128 <Method int ByteBuffer.arrayOffset()>
	//   24   48:isub            
	//   25   49:invokevirtual   #139 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   26   52:pop             
				return;
	//   27   53:return          
			}
			// Misplaced declaration of an exception variable
			catch(CharSequence charsequence)
	//*  28   54:astore_0        
			{
				bytebuffer = ((ByteBuffer) (new BufferOverflowException()));
	//   29   55:new             #141 <Class BufferOverflowException>
	//   30   58:dup             
	//   31   59:invokespecial   #142 <Method void BufferOverflowException()>
	//   32   62:astore_1        
			}
			((BufferOverflowException) (bytebuffer)).initCause(((Throwable) (charsequence)));
	//   33   63:aload_1         
	//   34   64:aload_0         
	//   35   65:invokevirtual   #146 <Method Throwable BufferOverflowException.initCause(Throwable)>
	//   36   68:pop             
			throw bytebuffer;
	//   37   69:aload_1         
	//   38   70:athrow          
		} else
		{
			zzb(charsequence, bytebuffer);
	//   39   71:aload_0         
	//   40   72:aload_1         
	//   41   73:invokestatic    #149 <Method void zzb(CharSequence, ByteBuffer)>
			return;
	//   42   76:return          
		}
	}

	public static zzbxm zzag(byte abyte0[])
	{
		return zzc(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:invokestatic    #155 <Method zzbxm zzc(byte[], int, int)>
	//    5    7:areturn         
	}

	public static int zzai(byte abyte0[])
	{
		return zzrl(abyte0.length) + abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:invokestatic    #160 <Method int zzrl(int)>
	//    3    5:aload_0         
	//    4    6:arraylength     
	//    5    7:iadd            
	//    6    8:ireturn         
	}

	public static int zzb(int i, double d)
	{
		return zzrj(i) + 8;
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzrj(int)>
	//    2    4:bipush          8
	//    3    6:iadd            
	//    4    7:ireturn         
	}

	public static int zzb(int i, zzbxt zzbxt1)
	{
		return zzrj(i) * 2 + zzd(zzbxt1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzrj(int)>
	//    2    4:iconst_2        
	//    3    5:imul            
	//    4    6:aload_1         
	//    5    7:invokestatic    #166 <Method int zzd(zzbxt)>
	//    6   10:iadd            
	//    7   11:ireturn         
	}

	private static int zzb(CharSequence charsequence)
	{
		int i1 = charsequence.length();
	//    0    0:aload_0         
	//    1    1:invokeinterface #56  <Method int CharSequence.length()>
	//    2    6:istore          5
		int l = i1;
	//    3    8:iload           5
	//    4   10:istore          4
		int j = 0;
	//    5   12:iconst_0        
	//    6   13:istore_2        
		int i;
		int k;
		do
		{
			i = l;
	//    7   14:iload           4
	//    8   16:istore_1        
			k = j;
	//    9   17:iload_2         
	//   10   18:istore_3        
			if(j >= i1)
				break;
	//   11   19:iload_2         
	//   12   20:iload           5
	//   13   22:icmpge          50
			i = l;
	//   14   25:iload           4
	//   15   27:istore_1        
			k = j;
	//   16   28:iload_2         
	//   17   29:istore_3        
			if(charsequence.charAt(j) >= '\200')
				break;
	//   18   30:aload_0         
	//   19   31:iload_2         
	//   20   32:invokeinterface #60  <Method char CharSequence.charAt(int)>
	//   21   37:sipush          128
	//   22   40:icmpge          50
			j++;
	//   23   43:iload_2         
	//   24   44:iconst_1        
	//   25   45:iadd            
	//   26   46:istore_2        
		} while(true);
	//   27   47:goto            14
		do
		{
			j = i;
	//   28   50:iload_1         
	//   29   51:istore_2        
			if(k >= i1)
				break;
	//   30   52:iload_3         
	//   31   53:iload           5
	//   32   55:icmpge          104
			j = ((int) (charsequence.charAt(k)));
	//   33   58:aload_0         
	//   34   59:iload_3         
	//   35   60:invokeinterface #60  <Method char CharSequence.charAt(int)>
	//   36   65:istore_2        
			if(j < 2048)
	//*  37   66:iload_2         
	//*  38   67:sipush          2048
	//*  39   70:icmpge          86
			{
				i += 127 - j >>> 31;
	//   40   73:iload_1         
	//   41   74:bipush          127
	//   42   76:iload_2         
	//   43   77:isub            
	//   44   78:bipush          31
	//   45   80:iushr           
	//   46   81:iadd            
	//   47   82:istore_1        
			} else
	//*  48   83:goto            97
			{
				j = i + zza(charsequence, k);
	//   49   86:iload_1         
	//   50   87:aload_0         
	//   51   88:iload_3         
	//   52   89:invokestatic    #169 <Method int zza(CharSequence, int)>
	//   53   92:iadd            
	//   54   93:istore_2        
				break;
	//   55   94:goto            104
			}
			k++;
	//   56   97:iload_3         
	//   57   98:iconst_1        
	//   58   99:iadd            
	//   59  100:istore_3        
		} while(true);
	//   60  101:goto            50
		if(j < i1)
	//*  61  104:iload_2         
	//*  62  105:iload           5
	//*  63  107:icmpge          148
		{
			long l1 = j;
	//   64  110:iload_2         
	//   65  111:i2l             
	//   66  112:lstore          6
			throw new IllegalArgumentException((new StringBuilder(54)).append("UTF-8 length does not fit in int: ").append(l1 + 0x0L).toString());
	//   67  114:new             #70  <Class IllegalArgumentException>
	//   68  117:dup             
	//   69  118:new             #72  <Class StringBuilder>
	//   70  121:dup             
	//   71  122:bipush          54
	//   72  124:invokespecial   #75  <Method void StringBuilder(int)>
	//   73  127:ldc1            #171 <String "UTF-8 length does not fit in int: ">
	//   74  129:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   75  132:lload           6
	//   76  134:ldc2w           #172 <Long 0x0L>
	//   77  137:ladd            
	//   78  138:invokevirtual   #176 <Method StringBuilder StringBuilder.append(long)>
	//   79  141:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   80  144:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//   81  147:athrow          
		} else
		{
			return j;
	//   82  148:iload_2         
	//   83  149:ireturn         
		}
	}

	private static void zzb(CharSequence charsequence, ByteBuffer bytebuffer)
	{
		int l = charsequence.length();
	//    0    0:aload_0         
	//    1    1:invokeinterface #56  <Method int CharSequence.length()>
	//    2    6:istore          6
		for(int i = 0; i < l; i++)
	//*   3    8:iconst_0        
	//*   4    9:istore          4
	//*   5   11:iload           4
	//*   6   13:iload           6
	//*   7   15:icmpge          300
		{
			char c;
			char c1;
label0:
			{
				c = charsequence.charAt(i);
	//    8   18:aload_0         
	//    9   19:iload           4
	//   10   21:invokeinterface #60  <Method char CharSequence.charAt(int)>
	//   11   26:istore_2        
				if(c < '\200')
	//*  12   27:iload_2         
	//*  13   28:sipush          128
	//*  14   31:icmpge          44
				{
					bytebuffer.put((byte)c);
	//   15   34:aload_1         
	//   16   35:iload_2         
	//   17   36:int2byte        
	//   18   37:invokevirtual   #180 <Method ByteBuffer ByteBuffer.put(byte)>
	//   19   40:pop             
					continue;
	//   20   41:goto            291
				}
				if(c < '\u0800')
	//*  21   44:iload_2         
	//*  22   45:sipush          2048
	//*  23   48:icmpge          82
				{
					bytebuffer.put((byte)(c >>> 6 | 0x3c0));
	//   24   51:aload_1         
	//   25   52:iload_2         
	//   26   53:bipush          6
	//   27   55:iushr           
	//   28   56:sipush          960
	//   29   59:ior             
	//   30   60:int2byte        
	//   31   61:invokevirtual   #180 <Method ByteBuffer ByteBuffer.put(byte)>
	//   32   64:pop             
					bytebuffer.put((byte)(c & 0x3f | 0x80));
	//   33   65:aload_1         
	//   34   66:iload_2         
	//   35   67:bipush          63
	//   36   69:iand            
	//   37   70:sipush          128
	//   38   73:ior             
	//   39   74:int2byte        
	//   40   75:invokevirtual   #180 <Method ByteBuffer ByteBuffer.put(byte)>
	//   41   78:pop             
					continue;
	//   42   79:goto            291
				}
				if(c < '\uD800' || '\uDFFF' < c)
	//*  43   82:iload_2         
	//*  44   83:ldc1            #61  <Int 55296>
	//*  45   85:icmplt          94
	//*  46   88:ldc1            #62  <Int 57343>
	//*  47   90:iload_2         
	//*  48   91:icmpge          142
				{
					bytebuffer.put((byte)(c >>> 12 | 0x1e0));
	//   49   94:aload_1         
	//   50   95:iload_2         
	//   51   96:bipush          12
	//   52   98:iushr           
	//   53   99:sipush          480
	//   54  102:ior             
	//   55  103:int2byte        
	//   56  104:invokevirtual   #180 <Method ByteBuffer ByteBuffer.put(byte)>
	//   57  107:pop             
					bytebuffer.put((byte)(c >>> 6 & 0x3f | 0x80));
	//   58  108:aload_1         
	//   59  109:iload_2         
	//   60  110:bipush          6
	//   61  112:iushr           
	//   62  113:bipush          63
	//   63  115:iand            
	//   64  116:sipush          128
	//   65  119:ior             
	//   66  120:int2byte        
	//   67  121:invokevirtual   #180 <Method ByteBuffer ByteBuffer.put(byte)>
	//   68  124:pop             
					bytebuffer.put((byte)(c & 0x3f | 0x80));
	//   69  125:aload_1         
	//   70  126:iload_2         
	//   71  127:bipush          63
	//   72  129:iand            
	//   73  130:sipush          128
	//   74  133:ior             
	//   75  134:int2byte        
	//   76  135:invokevirtual   #180 <Method ByteBuffer ByteBuffer.put(byte)>
	//   77  138:pop             
					continue;
	//   78  139:goto            291
				}
				int j = i;
	//   79  142:iload           4
	//   80  144:istore          5
				if(i + 1 != charsequence.length())
	//*  81  146:iload           4
	//*  82  148:iconst_1        
	//*  83  149:iadd            
	//*  84  150:aload_0         
	//*  85  151:invokeinterface #56  <Method int CharSequence.length()>
	//*  86  156:icmpeq          186
				{
					i++;
	//   87  159:iload           4
	//   88  161:iconst_1        
	//   89  162:iadd            
	//   90  163:istore          4
					c1 = charsequence.charAt(i);
	//   91  165:aload_0         
	//   92  166:iload           4
	//   93  168:invokeinterface #60  <Method char CharSequence.charAt(int)>
	//   94  173:istore_3        
					if(Character.isSurrogatePair(c, c1))
						break label0;
	//   95  174:iload_2         
	//   96  175:iload_3         
	//   97  176:invokestatic    #96  <Method boolean Character.isSurrogatePair(char, char)>
	//   98  179:ifne            218
					j = i;
	//   99  182:iload           4
	//  100  184:istore          5
				}
				throw new IllegalArgumentException((new StringBuilder(39)).append("Unpaired surrogate at index ").append(j - 1).toString());
	//  101  186:new             #70  <Class IllegalArgumentException>
	//  102  189:dup             
	//  103  190:new             #72  <Class StringBuilder>
	//  104  193:dup             
	//  105  194:bipush          39
	//  106  196:invokespecial   #75  <Method void StringBuilder(int)>
	//  107  199:ldc1            #77  <String "Unpaired surrogate at index ">
	//  108  201:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  109  204:iload           5
	//  110  206:iconst_1        
	//  111  207:isub            
	//  112  208:invokevirtual   #84  <Method StringBuilder StringBuilder.append(int)>
	//  113  211:invokevirtual   #88  <Method String StringBuilder.toString()>
	//  114  214:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//  115  217:athrow          
			}
			int k = Character.toCodePoint(c, c1);
	//  116  218:iload_2         
	//  117  219:iload_3         
	//  118  220:invokestatic    #100 <Method int Character.toCodePoint(char, char)>
	//  119  223:istore          5
			bytebuffer.put((byte)(k >>> 18 | 0xf0));
	//  120  225:aload_1         
	//  121  226:iload           5
	//  122  228:bipush          18
	//  123  230:iushr           
	//  124  231:sipush          240
	//  125  234:ior             
	//  126  235:int2byte        
	//  127  236:invokevirtual   #180 <Method ByteBuffer ByteBuffer.put(byte)>
	//  128  239:pop             
			bytebuffer.put((byte)(k >>> 12 & 0x3f | 0x80));
	//  129  240:aload_1         
	//  130  241:iload           5
	//  131  243:bipush          12
	//  132  245:iushr           
	//  133  246:bipush          63
	//  134  248:iand            
	//  135  249:sipush          128
	//  136  252:ior             
	//  137  253:int2byte        
	//  138  254:invokevirtual   #180 <Method ByteBuffer ByteBuffer.put(byte)>
	//  139  257:pop             
			bytebuffer.put((byte)(k >>> 6 & 0x3f | 0x80));
	//  140  258:aload_1         
	//  141  259:iload           5
	//  142  261:bipush          6
	//  143  263:iushr           
	//  144  264:bipush          63
	//  145  266:iand            
	//  146  267:sipush          128
	//  147  270:ior             
	//  148  271:int2byte        
	//  149  272:invokevirtual   #180 <Method ByteBuffer ByteBuffer.put(byte)>
	//  150  275:pop             
			bytebuffer.put((byte)(k & 0x3f | 0x80));
	//  151  276:aload_1         
	//  152  277:iload           5
	//  153  279:bipush          63
	//  154  281:iand            
	//  155  282:sipush          128
	//  156  285:ior             
	//  157  286:int2byte        
	//  158  287:invokevirtual   #180 <Method ByteBuffer ByteBuffer.put(byte)>
	//  159  290:pop             
		}

	//  160  291:iload           4
	//  161  293:iconst_1        
	//  162  294:iadd            
	//  163  295:istore          4
	//* 164  297:goto            11
	//  165  300:return          
	}

	public static int zzbe(long l)
	{
		return zzbi(l);
	//    0    0:lload_0         
	//    1    1:invokestatic    #185 <Method int zzbi(long)>
	//    2    4:ireturn         
	}

	public static int zzbf(long l)
	{
		return zzbi(l);
	//    0    0:lload_0         
	//    1    1:invokestatic    #185 <Method int zzbi(long)>
	//    2    4:ireturn         
	}

	public static int zzbg(long l)
	{
		return zzbi(zzbk(l));
	//    0    0:lload_0         
	//    1    1:invokestatic    #191 <Method long zzbk(long)>
	//    2    4:invokestatic    #185 <Method int zzbi(long)>
	//    3    7:ireturn         
	}

	public static int zzbi(long l)
	{
		if((-128L & l) == 0L)
	//*   0    0:ldc2w           #192 <Long -128L>
	//*   1    3:lload_0         
	//*   2    4:land            
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:ifne            12
			return 1;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		if((-16384L & l) == 0L)
	//*   8   12:ldc2w           #194 <Long -16384L>
	//*   9   15:lload_0         
	//*  10   16:land            
	//*  11   17:lconst_0        
	//*  12   18:lcmp            
	//*  13   19:ifne            24
			return 2;
	//   14   22:iconst_2        
	//   15   23:ireturn         
		if((0xffe00000L & l) == 0L)
	//*  16   24:ldc2w           #196 <Long 0xffe00000L>
	//*  17   27:lload_0         
	//*  18   28:land            
	//*  19   29:lconst_0        
	//*  20   30:lcmp            
	//*  21   31:ifne            36
			return 3;
	//   22   34:iconst_3        
	//   23   35:ireturn         
		if((0xf0000000L & l) == 0L)
	//*  24   36:ldc2w           #198 <Long 0xf0000000L>
	//*  25   39:lload_0         
	//*  26   40:land            
	//*  27   41:lconst_0        
	//*  28   42:lcmp            
	//*  29   43:ifne            48
			return 4;
	//   30   46:iconst_4        
	//   31   47:ireturn         
		if((0x0L & l) == 0L)
	//*  32   48:ldc2w           #200 <Long 0x0L>
	//*  33   51:lload_0         
	//*  34   52:land            
	//*  35   53:lconst_0        
	//*  36   54:lcmp            
	//*  37   55:ifne            60
			return 5;
	//   38   58:iconst_5        
	//   39   59:ireturn         
		if((0x0L & l) == 0L)
	//*  40   60:ldc2w           #202 <Long 0x0L>
	//*  41   63:lload_0         
	//*  42   64:land            
	//*  43   65:lconst_0        
	//*  44   66:lcmp            
	//*  45   67:ifne            73
			return 6;
	//   46   70:bipush          6
	//   47   72:ireturn         
		if((0x0L & l) == 0L)
	//*  48   73:ldc2w           #204 <Long 0x0L>
	//*  49   76:lload_0         
	//*  50   77:land            
	//*  51   78:lconst_0        
	//*  52   79:lcmp            
	//*  53   80:ifne            86
			return 7;
	//   54   83:bipush          7
	//   55   85:ireturn         
		if((0x0L & l) == 0L)
	//*  56   86:ldc2w           #206 <Long 0x0L>
	//*  57   89:lload_0         
	//*  58   90:land            
	//*  59   91:lconst_0        
	//*  60   92:lcmp            
	//*  61   93:ifne            99
			return 8;
	//   62   96:bipush          8
	//   63   98:ireturn         
		return (0x0L & l) != 0L ? 10 : 9;
	//   64   99:ldc2w           #208 <Long 0x0L>
	//   65  102:lload_0         
	//   66  103:land            
	//   67  104:lconst_0        
	//   68  105:lcmp            
	//   69  106:ifne            112
	//   70  109:bipush          9
	//   71  111:ireturn         
	//   72  112:bipush          10
	//   73  114:ireturn         
	}

	public static long zzbk(long l)
	{
		return l << 1 ^ l >> 63;
	//    0    0:lload_0         
	//    1    1:iconst_1        
	//    2    2:lshl            
	//    3    3:lload_0         
	//    4    4:bipush          63
	//    5    6:lshr            
	//    6    7:lxor            
	//    7    8:lreturn         
	}

	public static int zzc(int i, zzbxt zzbxt1)
	{
		return zzrj(i) + zze(zzbxt1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzrj(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #212 <Method int zze(zzbxt)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzc(int i, byte abyte0[])
	{
		return zzrj(i) + zzai(abyte0);
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzrj(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #215 <Method int zzai(byte[])>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static zzbxm zzc(byte abyte0[], int i, int j)
	{
		return new zzbxm(abyte0, i, j);
	//    0    0:new             #2   <Class zzbxm>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #217 <Method void zzbxm(byte[], int, int)>
	//    6   10:areturn         
	}

	public static int zzd(int i, float f)
	{
		return zzrj(i) + 4;
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzrj(int)>
	//    2    4:iconst_4        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public static int zzd(zzbxt zzbxt1)
	{
		return zzbxt1.zzaeT();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #223 <Method int zzbxt.zzaeT()>
	//    2    4:ireturn         
	}

	public static int zze(int i, long l)
	{
		return zzrj(i) + zzbe(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzrj(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #226 <Method int zzbe(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zze(zzbxt zzbxt1)
	{
		int i = zzbxt1.zzaeT();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #223 <Method int zzbxt.zzaeT()>
	//    2    4:istore_1        
		return zzrl(i) + i;
	//    3    5:iload_1         
	//    4    6:invokestatic    #160 <Method int zzrl(int)>
	//    5    9:iload_1         
	//    6   10:iadd            
	//    7   11:ireturn         
	}

	public static int zzf(int i, long l)
	{
		return zzrj(i) + zzbf(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzrj(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #229 <Method int zzbf(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzg(int i, long l)
	{
		return zzrj(i) + 8;
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzrj(int)>
	//    2    4:bipush          8
	//    3    6:iadd            
	//    4    7:ireturn         
	}

	public static int zzh(int i, long l)
	{
		return zzrj(i) + zzbg(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzrj(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #233 <Method int zzbg(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzh(int i, boolean flag)
	{
		return zzrj(i) + 1;
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzrj(int)>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public static int zzkb(String s)
	{
		int i = zzb(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #238 <Method int zzb(CharSequence)>
	//    2    4:istore_1        
		return zzrl(i) + i;
	//    3    5:iload_1         
	//    4    6:invokestatic    #160 <Method int zzrl(int)>
	//    5    9:iload_1         
	//    6   10:iadd            
	//    7   11:ireturn         
	}

	public static int zzr(int i, String s)
	{
		return zzrj(i) + zzkb(s);
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzrj(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #242 <Method int zzkb(String)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzrg(int i)
	{
		if(i >= 0)
	//*   0    0:iload_0         
	//*   1    1:iflt            9
			return zzrl(i);
	//    2    4:iload_0         
	//    3    5:invokestatic    #160 <Method int zzrl(int)>
	//    4    8:ireturn         
		else
			return 10;
	//    5    9:bipush          10
	//    6   11:ireturn         
	}

	public static int zzrh(int i)
	{
		return zzrl(zzrn(i));
	//    0    0:iload_0         
	//    1    1:invokestatic    #245 <Method int zzrn(int)>
	//    2    4:invokestatic    #160 <Method int zzrl(int)>
	//    3    7:ireturn         
	}

	public static int zzrj(int i)
	{
		return zzrl(zzbxw.zzO(i, 0));
	//    0    0:iload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #250 <Method int zzbxw.zzO(int, int)>
	//    3    5:invokestatic    #160 <Method int zzrl(int)>
	//    4    8:ireturn         
	}

	public static int zzrl(int i)
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
	//*  12   19:ldc1            #251 <Int 0xffe00000>
	//*  13   21:iload_0         
	//*  14   22:iand            
	//*  15   23:ifne            28
			return 3;
	//   16   26:iconst_3        
	//   17   27:ireturn         
		return (0xf0000000 & i) != 0 ? 5 : 4;
	//   18   28:ldc1            #252 <Int 0xf0000000>
	//   19   30:iload_0         
	//   20   31:iand            
	//   21   32:ifne            37
	//   22   35:iconst_4        
	//   23   36:ireturn         
	//   24   37:iconst_5        
	//   25   38:ireturn         
	}

	public static int zzrn(int i)
	{
		return i << 1 ^ i >> 31;
	//    0    0:iload_0         
	//    1    1:iconst_1        
	//    2    2:ishl            
	//    3    3:iload_0         
	//    4    4:bipush          31
	//    5    6:ishr            
	//    6    7:ixor            
	//    7    8:ireturn         
	}

	public void zzJ(int i, int j)
		throws IOException
	{
		zzN(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #259 <Method void zzN(int, int)>
		zzre(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #262 <Method void zzre(int)>
	//    7   11:return          
	}

	public void zzK(int i, int j)
		throws IOException
	{
		zzN(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #259 <Method void zzN(int, int)>
		zzrf(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #267 <Method void zzrf(int)>
	//    7   11:return          
	}

	public void zzN(int i, int j)
		throws IOException
	{
		zzrk(zzbxw.zzO(i, j));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #250 <Method int zzbxw.zzO(int, int)>
	//    4    6:invokevirtual   #270 <Method void zzrk(int)>
	//    5    9:return          
	}

	public void zza(int i, double d)
		throws IOException
	{
		zzN(i, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #259 <Method void zzN(int, int)>
		zzn(d);
	//    4    6:aload_0         
	//    5    7:dload_2         
	//    6    8:invokevirtual   #275 <Method void zzn(double)>
	//    7   11:return          
	}

	public void zza(int i, long l)
		throws IOException
	{
		zzN(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #259 <Method void zzN(int, int)>
		zzba(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #280 <Method void zzba(long)>
	//    7   11:return          
	}

	public void zza(int i, zzbxt zzbxt1)
		throws IOException
	{
		zzN(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #259 <Method void zzN(int, int)>
		zzc(zzbxt1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #284 <Method void zzc(zzbxt)>
	//    7   11:return          
	}

	public int zzaeF()
	{
		return zzcuH.remaining();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ByteBuffer zzcuH>
	//    2    4:invokevirtual   #134 <Method int ByteBuffer.remaining()>
	//    3    7:ireturn         
	}

	public void zzaeG()
	{
		if(zzaeF() != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #288 <Method int zzaeF()>
	//*   2    4:ifeq            18
			throw new IllegalStateException("Did not write as much data as expected.");
	//    3    7:new             #290 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #292 <String "Did not write as much data as expected.">
	//    6   14:invokespecial   #293 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		else
			return;
	//    8   18:return          
	}

	public void zzah(byte abyte0[])
		throws IOException
	{
		zzrk(abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:arraylength     
	//    3    3:invokevirtual   #270 <Method void zzrk(int)>
		zzaj(abyte0);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #298 <Method void zzaj(byte[])>
	//    7   11:return          
	}

	public void zzaj(byte abyte0[])
		throws IOException
	{
		zzd(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #300 <Method void zzd(byte[], int, int)>
	//    6    8:return          
	}

	public void zzb(int i, long l)
		throws IOException
	{
		zzN(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #259 <Method void zzN(int, int)>
		zzbb(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #303 <Method void zzbb(long)>
	//    7   11:return          
	}

	public void zzb(int i, byte abyte0[])
		throws IOException
	{
		zzN(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #259 <Method void zzN(int, int)>
		zzah(abyte0);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #306 <Method void zzah(byte[])>
	//    7   11:return          
	}

	public void zzb(zzbxt zzbxt1)
		throws IOException
	{
		zzbxt1.zza(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #309 <Method void zzbxt.zza(zzbxm)>
	//    3    5:return          
	}

	public void zzba(long l)
		throws IOException
	{
		zzbh(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #312 <Method void zzbh(long)>
	//    3    5:return          
	}

	public void zzbb(long l)
		throws IOException
	{
		zzbh(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #312 <Method void zzbh(long)>
	//    3    5:return          
	}

	public void zzbc(long l)
		throws IOException
	{
		zzbj(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #316 <Method void zzbj(long)>
	//    3    5:return          
	}

	public void zzbd(long l)
		throws IOException
	{
		zzbh(zzbk(l));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #191 <Method long zzbk(long)>
	//    3    5:invokevirtual   #312 <Method void zzbh(long)>
	//    4    8:return          
	}

	public void zzbh(long l)
		throws IOException
	{
		do
		{
			if((-128L & l) == 0L)
	//*   0    0:ldc2w           #192 <Long -128L>
	//*   1    3:lload_1         
	//*   2    4:land            
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:ifne            17
			{
				zzri((int)l);
	//    6   10:aload_0         
	//    7   11:lload_1         
	//    8   12:l2i             
	//    9   13:invokevirtual   #320 <Method void zzri(int)>
				return;
	//   10   16:return          
			}
			zzri((int)l & 0x7f | 0x80);
	//   11   17:aload_0         
	//   12   18:lload_1         
	//   13   19:l2i             
	//   14   20:bipush          127
	//   15   22:iand            
	//   16   23:sipush          128
	//   17   26:ior             
	//   18   27:invokevirtual   #320 <Method void zzri(int)>
			l >>>= 7;
	//   19   30:lload_1         
	//   20   31:bipush          7
	//   21   33:lushr           
	//   22   34:lstore_1        
		} while(true);
	//   23   35:goto            0
	}

	public void zzbj(long l)
		throws IOException
	{
		if(zzcuH.remaining() < 8)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field ByteBuffer zzcuH>
	//*   2    4:invokevirtual   #134 <Method int ByteBuffer.remaining()>
	//*   3    7:bipush          8
	//*   4    9:icmpge          34
		{
			throw new zza(zzcuH.position(), zzcuH.limit());
	//    5   12:new             #6   <Class zzbxm$zza>
	//    6   15:dup             
	//    7   16:aload_0         
	//    8   17:getfield        #16  <Field ByteBuffer zzcuH>
	//    9   20:invokevirtual   #131 <Method int ByteBuffer.position()>
	//   10   23:aload_0         
	//   11   24:getfield        #16  <Field ByteBuffer zzcuH>
	//   12   27:invokevirtual   #323 <Method int ByteBuffer.limit()>
	//   13   30:invokespecial   #325 <Method void zzbxm$zza(int, int)>
	//   14   33:athrow          
		} else
		{
			zzcuH.putLong(l);
	//   15   34:aload_0         
	//   16   35:getfield        #16  <Field ByteBuffer zzcuH>
	//   17   38:lload_1         
	//   18   39:invokevirtual   #329 <Method ByteBuffer ByteBuffer.putLong(long)>
	//   19   42:pop             
			return;
	//   20   43:return          
		}
	}

	public void zzbq(boolean flag)
		throws IOException
	{
		int i;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
			i = 1;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		zzri(i);
	//    7   11:aload_0         
	//    8   12:iload_2         
	//    9   13:invokevirtual   #320 <Method void zzri(int)>
	//   10   16:return          
	}

	public void zzc(byte byte0)
		throws IOException
	{
		if(!zzcuH.hasRemaining())
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field ByteBuffer zzcuH>
	//*   2    4:invokevirtual   #335 <Method boolean ByteBuffer.hasRemaining()>
	//*   3    7:ifne            32
		{
			throw new zza(zzcuH.position(), zzcuH.limit());
	//    4   10:new             #6   <Class zzbxm$zza>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:getfield        #16  <Field ByteBuffer zzcuH>
	//    8   18:invokevirtual   #131 <Method int ByteBuffer.position()>
	//    9   21:aload_0         
	//   10   22:getfield        #16  <Field ByteBuffer zzcuH>
	//   11   25:invokevirtual   #323 <Method int ByteBuffer.limit()>
	//   12   28:invokespecial   #325 <Method void zzbxm$zza(int, int)>
	//   13   31:athrow          
		} else
		{
			zzcuH.put(byte0);
	//   14   32:aload_0         
	//   15   33:getfield        #16  <Field ByteBuffer zzcuH>
	//   16   36:iload_1         
	//   17   37:invokevirtual   #180 <Method ByteBuffer ByteBuffer.put(byte)>
	//   18   40:pop             
			return;
	//   19   41:return          
		}
	}

	public void zzc(int i, float f)
		throws IOException
	{
		zzN(i, 5);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_5        
	//    3    3:invokevirtual   #259 <Method void zzN(int, int)>
		zzk(f);
	//    4    6:aload_0         
	//    5    7:fload_2         
	//    6    8:invokevirtual   #340 <Method void zzk(float)>
	//    7   11:return          
	}

	public void zzc(int i, long l)
		throws IOException
	{
		zzN(i, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #259 <Method void zzN(int, int)>
		zzbc(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #342 <Method void zzbc(long)>
	//    7   11:return          
	}

	public void zzc(zzbxt zzbxt1)
		throws IOException
	{
		zzrk(zzbxt1.zzaeS());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #345 <Method int zzbxt.zzaeS()>
	//    3    5:invokevirtual   #270 <Method void zzrk(int)>
		zzbxt1.zza(this);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #309 <Method void zzbxt.zza(zzbxm)>
	//    7   13:return          
	}

	public void zzd(int i, long l)
		throws IOException
	{
		zzN(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #259 <Method void zzN(int, int)>
		zzbd(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #347 <Method void zzbd(long)>
	//    7   11:return          
	}

	public void zzd(byte abyte0[], int i, int j)
		throws IOException
	{
		if(zzcuH.remaining() >= j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field ByteBuffer zzcuH>
	//*   2    4:invokevirtual   #134 <Method int ByteBuffer.remaining()>
	//*   3    7:iload_3         
	//*   4    8:icmplt          23
		{
			zzcuH.put(abyte0, i, j);
	//    5   11:aload_0         
	//    6   12:getfield        #16  <Field ByteBuffer zzcuH>
	//    7   15:aload_1         
	//    8   16:iload_2         
	//    9   17:iload_3         
	//   10   18:invokevirtual   #349 <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//   11   21:pop             
			return;
	//   12   22:return          
		} else
		{
			throw new zza(zzcuH.position(), zzcuH.limit());
	//   13   23:new             #6   <Class zzbxm$zza>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:getfield        #16  <Field ByteBuffer zzcuH>
	//   17   31:invokevirtual   #131 <Method int ByteBuffer.position()>
	//   18   34:aload_0         
	//   19   35:getfield        #16  <Field ByteBuffer zzcuH>
	//   20   38:invokevirtual   #323 <Method int ByteBuffer.limit()>
	//   21   41:invokespecial   #325 <Method void zzbxm$zza(int, int)>
	//   22   44:athrow          
		}
	}

	public void zzg(int i, boolean flag)
		throws IOException
	{
		zzN(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #259 <Method void zzN(int, int)>
		zzbq(flag);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #352 <Method void zzbq(boolean)>
	//    7   11:return          
	}

	public void zzk(float f)
		throws IOException
	{
		zzrm(Float.floatToIntBits(f));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #358 <Method int Float.floatToIntBits(float)>
	//    3    5:invokevirtual   #361 <Method void zzrm(int)>
	//    4    8:return          
	}

	public void zzka(String s)
		throws IOException
	{
		try
		{
			int i = zzrl(s.length());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #365 <Method int String.length()>
	//    2    4:invokestatic    #160 <Method int zzrl(int)>
	//    3    7:istore_2        
			if(i == zzrl(s.length() * 3))
	//*   4    8:iload_2         
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #365 <Method int String.length()>
	//*   7   13:iconst_3        
	//*   8   14:imul            
	//*   9   15:invokestatic    #160 <Method int zzrl(int)>
	//*  10   18:icmpne          118
			{
				int j = zzcuH.position();
	//   11   21:aload_0         
	//   12   22:getfield        #16  <Field ByteBuffer zzcuH>
	//   13   25:invokevirtual   #131 <Method int ByteBuffer.position()>
	//   14   28:istore_3        
				if(zzcuH.remaining() < i)
	//*  15   29:aload_0         
	//*  16   30:getfield        #16  <Field ByteBuffer zzcuH>
	//*  17   33:invokevirtual   #134 <Method int ByteBuffer.remaining()>
	//*  18   36:iload_2         
	//*  19   37:icmpge          58
					throw new zza(j + i, zzcuH.limit());
	//   20   40:new             #6   <Class zzbxm$zza>
	//   21   43:dup             
	//   22   44:iload_3         
	//   23   45:iload_2         
	//   24   46:iadd            
	//   25   47:aload_0         
	//   26   48:getfield        #16  <Field ByteBuffer zzcuH>
	//   27   51:invokevirtual   #323 <Method int ByteBuffer.limit()>
	//   28   54:invokespecial   #325 <Method void zzbxm$zza(int, int)>
	//   29   57:athrow          
				zzcuH.position(j + i);
	//   30   58:aload_0         
	//   31   59:getfield        #16  <Field ByteBuffer zzcuH>
	//   32   62:iload_3         
	//   33   63:iload_2         
	//   34   64:iadd            
	//   35   65:invokevirtual   #139 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   36   68:pop             
				zza(((CharSequence) (s)), zzcuH);
	//   37   69:aload_1         
	//   38   70:aload_0         
	//   39   71:getfield        #16  <Field ByteBuffer zzcuH>
	//   40   74:invokestatic    #367 <Method void zza(CharSequence, ByteBuffer)>
				int k = zzcuH.position();
	//   41   77:aload_0         
	//   42   78:getfield        #16  <Field ByteBuffer zzcuH>
	//   43   81:invokevirtual   #131 <Method int ByteBuffer.position()>
	//   44   84:istore          4
				zzcuH.position(j);
	//   45   86:aload_0         
	//   46   87:getfield        #16  <Field ByteBuffer zzcuH>
	//   47   90:iload_3         
	//   48   91:invokevirtual   #139 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   49   94:pop             
				zzrk(k - j - i);
	//   50   95:aload_0         
	//   51   96:iload           4
	//   52   98:iload_3         
	//   53   99:isub            
	//   54  100:iload_2         
	//   55  101:isub            
	//   56  102:invokevirtual   #270 <Method void zzrk(int)>
				zzcuH.position(k);
	//   57  105:aload_0         
	//   58  106:getfield        #16  <Field ByteBuffer zzcuH>
	//   59  109:iload           4
	//   60  111:invokevirtual   #139 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   61  114:pop             
				break MISSING_BLOCK_LABEL_134;
	//   62  115:goto            134
			}
		}
	//*  63  118:aload_0         
	//*  64  119:aload_1         
	//*  65  120:invokestatic    #238 <Method int zzb(CharSequence)>
	//*  66  123:invokevirtual   #270 <Method void zzrk(int)>
	//*  67  126:aload_1         
	//*  68  127:aload_0         
	//*  69  128:getfield        #16  <Field ByteBuffer zzcuH>
	//*  70  131:invokestatic    #367 <Method void zza(CharSequence, ByteBuffer)>
	//*  71  134:return          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  72  135:astore_1        
		{
			zza zza1 = new zza(zzcuH.position(), zzcuH.limit());
	//   73  136:new             #6   <Class zzbxm$zza>
	//   74  139:dup             
	//   75  140:aload_0         
	//   76  141:getfield        #16  <Field ByteBuffer zzcuH>
	//   77  144:invokevirtual   #131 <Method int ByteBuffer.position()>
	//   78  147:aload_0         
	//   79  148:getfield        #16  <Field ByteBuffer zzcuH>
	//   80  151:invokevirtual   #323 <Method int ByteBuffer.limit()>
	//   81  154:invokespecial   #325 <Method void zzbxm$zza(int, int)>
	//   82  157:astore          5
			zza1.initCause(((Throwable) (s)));
	//   83  159:aload           5
	//   84  161:aload_1         
	//   85  162:invokevirtual   #368 <Method Throwable zzbxm$zza.initCause(Throwable)>
	//   86  165:pop             
			throw zza1;
	//   87  166:aload           5
	//   88  168:athrow          
		}
		zzrk(zzb(((CharSequence) (s))));
		zza(((CharSequence) (s)), zzcuH);
	}

	public void zzn(double d)
		throws IOException
	{
		zzbj(Double.doubleToLongBits(d));
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokestatic    #374 <Method long Double.doubleToLongBits(double)>
	//    3    5:invokevirtual   #316 <Method void zzbj(long)>
	//    4    8:return          
	}

	public void zzq(int i, String s)
		throws IOException
	{
		zzN(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #259 <Method void zzN(int, int)>
		zzka(s);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #378 <Method void zzka(String)>
	//    7   11:return          
	}

	public void zzre(int i)
		throws IOException
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            10
		{
			zzrk(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #270 <Method void zzrk(int)>
			return;
	//    5    9:return          
		} else
		{
			zzbh(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:i2l             
	//    9   13:invokevirtual   #312 <Method void zzbh(long)>
			return;
	//   10   16:return          
		}
	}

	public void zzrf(int i)
		throws IOException
	{
		zzrk(zzrn(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #245 <Method int zzrn(int)>
	//    3    5:invokevirtual   #270 <Method void zzrk(int)>
	//    4    8:return          
	}

	public void zzri(int i)
		throws IOException
	{
		zzc((byte)i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:int2byte        
	//    3    3:invokevirtual   #380 <Method void zzc(byte)>
	//    4    6:return          
	}

	public void zzrk(int i)
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
				zzri(i);
	//    4    7:aload_0         
	//    5    8:iload_1         
	//    6    9:invokevirtual   #320 <Method void zzri(int)>
				return;
	//    7   12:return          
			}
			zzri(i & 0x7f | 0x80);
	//    8   13:aload_0         
	//    9   14:iload_1         
	//   10   15:bipush          127
	//   11   17:iand            
	//   12   18:sipush          128
	//   13   21:ior             
	//   14   22:invokevirtual   #320 <Method void zzri(int)>
			i >>>= 7;
	//   15   25:iload_1         
	//   16   26:bipush          7
	//   17   28:iushr           
	//   18   29:istore_1        
		} while(true);
	//   19   30:goto            0
	}

	public void zzrm(int i)
		throws IOException
	{
		if(zzcuH.remaining() < 4)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field ByteBuffer zzcuH>
	//*   2    4:invokevirtual   #134 <Method int ByteBuffer.remaining()>
	//*   3    7:iconst_4        
	//*   4    8:icmpge          33
		{
			throw new zza(zzcuH.position(), zzcuH.limit());
	//    5   11:new             #6   <Class zzbxm$zza>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:getfield        #16  <Field ByteBuffer zzcuH>
	//    9   19:invokevirtual   #131 <Method int ByteBuffer.position()>
	//   10   22:aload_0         
	//   11   23:getfield        #16  <Field ByteBuffer zzcuH>
	//   12   26:invokevirtual   #323 <Method int ByteBuffer.limit()>
	//   13   29:invokespecial   #325 <Method void zzbxm$zza(int, int)>
	//   14   32:athrow          
		} else
		{
			zzcuH.putInt(i);
	//   15   33:aload_0         
	//   16   34:getfield        #16  <Field ByteBuffer zzcuH>
	//   17   37:iload_1         
	//   18   38:invokevirtual   #384 <Method ByteBuffer ByteBuffer.putInt(int)>
	//   19   41:pop             
			return;
	//   20   42:return          
		}
	}

	private final ByteBuffer zzcuH;
}
