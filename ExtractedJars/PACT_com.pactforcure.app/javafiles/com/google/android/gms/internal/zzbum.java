// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;
import java.nio.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzbut, zzbuw

public final class zzbum
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


	private zzbum(ByteBuffer bytebuffer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzcrW = bytebuffer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field ByteBuffer zzcrW>
		zzcrW.order(ByteOrder.LITTLE_ENDIAN);
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field ByteBuffer zzcrW>
	//    7   13:getstatic       #22  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//    8   16:invokevirtual   #28  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//    9   19:pop             
	//   10   20:return          
	}

	private zzbum(byte abyte0[], int i, int j)
	{
		this(ByteBuffer.wrap(abyte0, i, j));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokestatic    #34  <Method ByteBuffer ByteBuffer.wrap(byte[], int, int)>
	//    5    7:invokespecial   #36  <Method void zzbum(ByteBuffer)>
	//    6   10:return          
	}

	public static int zzH(int i, int j)
	{
		return zzqs(i) + zzqp(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzqs(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #45  <Method int zzqp(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzI(int i, int j)
	{
		return zzqs(i) + zzqq(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzqs(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #49  <Method int zzqq(int)>
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
		while(i < i1) 
	//*   5   10:iload_1         
	//*   6   11:iload           5
	//*   7   13:icmpge          131
		{
			char c = charsequence.charAt(i);
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokeinterface #60  <Method char CharSequence.charAt(int)>
	//   11   23:istore          6
			int k;
			if(c < '\u0800')
	//*  12   25:iload           6
	//*  13   27:sipush          2048
	//*  14   30:icmpge          53
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
			} else
	//*  25   46:iload_3         
	//*  26   47:iconst_1        
	//*  27   48:iadd            
	//*  28   49:istore_1        
	//*  29   50:goto            10
			{
				int l = j + 2;
	//   30   53:iload_2         
	//   31   54:iconst_2        
	//   32   55:iadd            
	//   33   56:istore          4
				k = i;
	//   34   58:iload_1         
	//   35   59:istore_3        
				j = l;
	//   36   60:iload           4
	//   37   62:istore_2        
				if('\uD800' <= c)
	//*  38   63:ldc1            #61  <Int 55296>
	//*  39   65:iload           6
	//*  40   67:icmpgt          46
				{
					k = i;
	//   41   70:iload_1         
	//   42   71:istore_3        
					j = l;
	//   43   72:iload           4
	//   44   74:istore_2        
					if(c <= '\uDFFF')
	//*  45   75:iload           6
	//*  46   77:ldc1            #62  <Int 57343>
	//*  47   79:icmpgt          46
					{
						if(Character.codePointAt(charsequence, i) < 0x10000)
	//*  48   82:aload_0         
	//*  49   83:iload_1         
	//*  50   84:invokestatic    #67  <Method int Character.codePointAt(CharSequence, int)>
	//*  51   87:ldc1            #68  <Int 0x10000>
	//*  52   89:icmpge          121
							throw new IllegalArgumentException((new StringBuilder(39)).append("Unpaired surrogate at index ").append(i).toString());
	//   53   92:new             #70  <Class IllegalArgumentException>
	//   54   95:dup             
	//   55   96:new             #72  <Class StringBuilder>
	//   56   99:dup             
	//   57  100:bipush          39
	//   58  102:invokespecial   #75  <Method void StringBuilder(int)>
	//   59  105:ldc1            #77  <String "Unpaired surrogate at index ">
	//   60  107:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   61  110:iload_1         
	//   62  111:invokevirtual   #84  <Method StringBuilder StringBuilder.append(int)>
	//   63  114:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   64  117:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//   65  120:athrow          
						k = i + 1;
	//   66  121:iload_1         
	//   67  122:iconst_1        
	//   68  123:iadd            
	//   69  124:istore_3        
						j = l;
	//   70  125:iload           4
	//   71  127:istore_2        
					}
				}
			}
			i = k + 1;
		}
	//*  72  128:goto            46
		return j;
	//   73  131:iload_2         
	//   74  132:ireturn         
	}

	private static int zza(CharSequence charsequence, byte abyte0[], int i, int j)
	{
		int l1;
		int i2;
		l1 = charsequence.length();
	//    0    0:aload_0         
	//    1    1:invokeinterface #56  <Method int CharSequence.length()>
	//    2    6:istore          7
		boolean flag = false;
	//    3    8:iconst_0        
	//    4    9:istore          6
		i2 = i + j;
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
_L2:
		char c;
		if(j >= l1)
			break MISSING_BLOCK_LABEL_483;
	//   49   80:iload_3         
	//   50   81:iload           7
	//   51   83:icmpge          483
		c = charsequence.charAt(j);
	//   52   86:aload_0         
	//   53   87:iload_3         
	//   54   88:invokeinterface #60  <Method char CharSequence.charAt(int)>
	//   55   93:istore          4
		if(c >= '\200' || i >= i2)
			break; /* Loop/switch isn't completed */
	//   56   95:iload           4
	//   57   97:sipush          128
	//   58  100:icmpge          130
	//   59  103:iload_2         
	//   60  104:iload           8
	//   61  106:icmpge          130
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
_L3:
		j++;
	//   73  123:iload_3         
	//   74  124:iconst_1        
	//   75  125:iadd            
	//   76  126:istore_3        
		if(true) goto _L2; else goto _L1
	//   77  127:goto            80
_L1:
		if(c < '\u0800' && i <= i2 - 2)
	//*  78  130:iload           4
	//*  79  132:sipush          2048
	//*  80  135:icmpge          186
	//*  81  138:iload_2         
	//*  82  139:iload           8
	//*  83  141:iconst_2        
	//*  84  142:isub            
	//*  85  143:icmpgt          186
		{
			int l = i + 1;
	//   86  146:iload_2         
	//   87  147:iconst_1        
	//   88  148:iadd            
	//   89  149:istore          6
			abyte0[i] = (byte)(c >>> 6 | 0x3c0);
	//   90  151:aload_1         
	//   91  152:iload_2         
	//   92  153:iload           4
	//   93  155:bipush          6
	//   94  157:iushr           
	//   95  158:sipush          960
	//   96  161:ior             
	//   97  162:int2byte        
	//   98  163:bastore         
			i = l + 1;
	//   99  164:iload           6
	//  100  166:iconst_1        
	//  101  167:iadd            
	//  102  168:istore_2        
			abyte0[l] = (byte)(c & 0x3f | 0x80);
	//  103  169:aload_1         
	//  104  170:iload           6
	//  105  172:iload           4
	//  106  174:bipush          63
	//  107  176:iand            
	//  108  177:sipush          128
	//  109  180:ior             
	//  110  181:int2byte        
	//  111  182:bastore         
		} else
	//* 112  183:goto            123
		if((c < '\uD800' || '\uDFFF' < c) && i <= i2 - 3)
	//* 113  186:iload           4
	//* 114  188:ldc1            #61  <Int 55296>
	//* 115  190:icmplt          200
	//* 116  193:ldc1            #62  <Int 57343>
	//* 117  195:iload           4
	//* 118  197:icmpge          271
	//* 119  200:iload_2         
	//* 120  201:iload           8
	//* 121  203:iconst_3        
	//* 122  204:isub            
	//* 123  205:icmpgt          271
		{
			int i1 = i + 1;
	//  124  208:iload_2         
	//  125  209:iconst_1        
	//  126  210:iadd            
	//  127  211:istore          6
			abyte0[i] = (byte)(c >>> 12 | 0x1e0);
	//  128  213:aload_1         
	//  129  214:iload_2         
	//  130  215:iload           4
	//  131  217:bipush          12
	//  132  219:iushr           
	//  133  220:sipush          480
	//  134  223:ior             
	//  135  224:int2byte        
	//  136  225:bastore         
			int j2 = i1 + 1;
	//  137  226:iload           6
	//  138  228:iconst_1        
	//  139  229:iadd            
	//  140  230:istore          9
			abyte0[i1] = (byte)(c >>> 6 & 0x3f | 0x80);
	//  141  232:aload_1         
	//  142  233:iload           6
	//  143  235:iload           4
	//  144  237:bipush          6
	//  145  239:iushr           
	//  146  240:bipush          63
	//  147  242:iand            
	//  148  243:sipush          128
	//  149  246:ior             
	//  150  247:int2byte        
	//  151  248:bastore         
			i = j2 + 1;
	//  152  249:iload           9
	//  153  251:iconst_1        
	//  154  252:iadd            
	//  155  253:istore_2        
			abyte0[j2] = (byte)(c & 0x3f | 0x80);
	//  156  254:aload_1         
	//  157  255:iload           9
	//  158  257:iload           4
	//  159  259:bipush          63
	//  160  261:iand            
	//  161  262:sipush          128
	//  162  265:ior             
	//  163  266:int2byte        
	//  164  267:bastore         
		} else
	//* 165  268:goto            123
		{
label0:
			{
				char c1;
label1:
				{
					if(i > i2 - 4)
						break label0;
	//  166  271:iload_2         
	//  167  272:iload           8
	//  168  274:iconst_4        
	//  169  275:isub            
	//  170  276:icmpgt          444
					int j1 = j;
	//  171  279:iload_3         
	//  172  280:istore          6
					if(j + 1 != charsequence.length())
	//* 173  282:iload_3         
	//* 174  283:iconst_1        
	//* 175  284:iadd            
	//* 176  285:aload_0         
	//* 177  286:invokeinterface #56  <Method int CharSequence.length()>
	//* 178  291:icmpeq          320
					{
						j++;
	//  179  294:iload_3         
	//  180  295:iconst_1        
	//  181  296:iadd            
	//  182  297:istore_3        
						c1 = charsequence.charAt(j);
	//  183  298:aload_0         
	//  184  299:iload_3         
	//  185  300:invokeinterface #60  <Method char CharSequence.charAt(int)>
	//  186  305:istore          5
						if(Character.isSurrogatePair(c, c1))
							break label1;
	//  187  307:iload           4
	//  188  309:iload           5
	//  189  311:invokestatic    #96  <Method boolean Character.isSurrogatePair(char, char)>
	//  190  314:ifne            352
						j1 = j;
	//  191  317:iload_3         
	//  192  318:istore          6
					}
					throw new IllegalArgumentException((new StringBuilder(39)).append("Unpaired surrogate at index ").append(j1 - 1).toString());
	//  193  320:new             #70  <Class IllegalArgumentException>
	//  194  323:dup             
	//  195  324:new             #72  <Class StringBuilder>
	//  196  327:dup             
	//  197  328:bipush          39
	//  198  330:invokespecial   #75  <Method void StringBuilder(int)>
	//  199  333:ldc1            #77  <String "Unpaired surrogate at index ">
	//  200  335:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  201  338:iload           6
	//  202  340:iconst_1        
	//  203  341:isub            
	//  204  342:invokevirtual   #84  <Method StringBuilder StringBuilder.append(int)>
	//  205  345:invokevirtual   #88  <Method String StringBuilder.toString()>
	//  206  348:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//  207  351:athrow          
				}
				int k1 = Character.toCodePoint(c, c1);
	//  208  352:iload           4
	//  209  354:iload           5
	//  210  356:invokestatic    #100 <Method int Character.toCodePoint(char, char)>
	//  211  359:istore          6
				int k2 = i + 1;
	//  212  361:iload_2         
	//  213  362:iconst_1        
	//  214  363:iadd            
	//  215  364:istore          9
				abyte0[i] = (byte)(k1 >>> 18 | 0xf0);
	//  216  366:aload_1         
	//  217  367:iload_2         
	//  218  368:iload           6
	//  219  370:bipush          18
	//  220  372:iushr           
	//  221  373:sipush          240
	//  222  376:ior             
	//  223  377:int2byte        
	//  224  378:bastore         
				i = k2 + 1;
	//  225  379:iload           9
	//  226  381:iconst_1        
	//  227  382:iadd            
	//  228  383:istore_2        
				abyte0[k2] = (byte)(k1 >>> 12 & 0x3f | 0x80);
	//  229  384:aload_1         
	//  230  385:iload           9
	//  231  387:iload           6
	//  232  389:bipush          12
	//  233  391:iushr           
	//  234  392:bipush          63
	//  235  394:iand            
	//  236  395:sipush          128
	//  237  398:ior             
	//  238  399:int2byte        
	//  239  400:bastore         
				k2 = i + 1;
	//  240  401:iload_2         
	//  241  402:iconst_1        
	//  242  403:iadd            
	//  243  404:istore          9
				abyte0[i] = (byte)(k1 >>> 6 & 0x3f | 0x80);
	//  244  406:aload_1         
	//  245  407:iload_2         
	//  246  408:iload           6
	//  247  410:bipush          6
	//  248  412:iushr           
	//  249  413:bipush          63
	//  250  415:iand            
	//  251  416:sipush          128
	//  252  419:ior             
	//  253  420:int2byte        
	//  254  421:bastore         
				i = k2 + 1;
	//  255  422:iload           9
	//  256  424:iconst_1        
	//  257  425:iadd            
	//  258  426:istore_2        
				abyte0[k2] = (byte)(k1 & 0x3f | 0x80);
	//  259  427:aload_1         
	//  260  428:iload           9
	//  261  430:iload           6
	//  262  432:bipush          63
	//  263  434:iand            
	//  264  435:sipush          128
	//  265  438:ior             
	//  266  439:int2byte        
	//  267  440:bastore         
			}
		}
		  goto _L3
		if(true) goto _L2; else goto _L4
	//* 268  441:goto            123
_L4:
		throw new ArrayIndexOutOfBoundsException((new StringBuilder(37)).append("Failed writing ").append(c).append(" at index ").append(i).toString());
	//  269  444:new             #102 <Class ArrayIndexOutOfBoundsException>
	//  270  447:dup             
	//  271  448:new             #72  <Class StringBuilder>
	//  272  451:dup             
	//  273  452:bipush          37
	//  274  454:invokespecial   #75  <Method void StringBuilder(int)>
	//  275  457:ldc1            #104 <String "Failed writing ">
	//  276  459:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  277  462:iload           4
	//  278  464:invokevirtual   #107 <Method StringBuilder StringBuilder.append(char)>
	//  279  467:ldc1            #109 <String " at index ">
	//  280  469:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  281  472:iload_2         
	//  282  473:invokevirtual   #84  <Method StringBuilder StringBuilder.append(int)>
	//  283  476:invokevirtual   #88  <Method String StringBuilder.toString()>
	//  284  479:invokespecial   #110 <Method void ArrayIndexOutOfBoundsException(String)>
	//  285  482:athrow          
		return i;
	//  286  483:iload_2         
	//  287  484:ireturn         
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

	public static zzbum zzae(byte abyte0[])
	{
		return zzc(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:invokestatic    #155 <Method zzbum zzc(byte[], int, int)>
	//    5    7:areturn         
	}

	public static int zzag(byte abyte0[])
	{
		return zzqu(abyte0.length) + abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:invokestatic    #160 <Method int zzqu(int)>
	//    3    5:aload_0         
	//    4    6:arraylength     
	//    5    7:iadd            
	//    6    8:ireturn         
	}

	public static int zzb(int i, double d)
	{
		return zzqs(i) + 8;
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzqs(int)>
	//    2    4:bipush          8
	//    3    6:iadd            
	//    4    7:ireturn         
	}

	public static int zzb(int i, zzbut zzbut1)
	{
		return zzqs(i) * 2 + zzd(zzbut1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzqs(int)>
	//    2    4:iconst_2        
	//    3    5:imul            
	//    4    6:aload_1         
	//    5    7:invokestatic    #166 <Method int zzd(zzbut)>
	//    6   10:iadd            
	//    7   11:ireturn         
	}

	private static int zzb(CharSequence charsequence)
	{
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #56  <Method int CharSequence.length()>
	//*   2    6:istore          4
	//*   3    8:iconst_0        
	//*   4    9:istore_1        
	//*   5   10:iload_1         
	//*   6   11:iload           4
	//*   7   13:icmpge          130
	//*   8   16:aload_0         
	//*   9   17:iload_1         
	//*  10   18:invokeinterface #60  <Method char CharSequence.charAt(int)>
	//*  11   23:sipush          128
	//*  12   26:icmpge          130
	//*  13   29:iload_1         
	//*  14   30:iconst_1        
	//*  15   31:iadd            
	//*  16   32:istore_1        
	//*  17   33:goto            10
_L2:
		int j;
		int k = i;
	//   18   36:iload_1         
	//   19   37:istore_3        
		if(j < l)
	//*  20   38:iload_2         
	//*  21   39:iload           4
	//*  22   41:icmpge          84
		{
			k = ((int) (charsequence.charAt(j)));
	//   23   44:aload_0         
	//   24   45:iload_2         
	//   25   46:invokeinterface #60  <Method char CharSequence.charAt(int)>
	//   26   51:istore_3        
			if(k < 2048)
	//*  27   52:iload_3         
	//*  28   53:sipush          2048
	//*  29   56:icmpge          76
			{
				j++;
	//   30   59:iload_2         
	//   31   60:iconst_1        
	//   32   61:iadd            
	//   33   62:istore_2        
				i = (127 - k >>> 31) + i;
	//   34   63:bipush          127
	//   35   65:iload_3         
	//   36   66:isub            
	//   37   67:bipush          31
	//   38   69:iushr           
	//   39   70:iload_1         
	//   40   71:iadd            
	//   41   72:istore_1        
				continue; /* Loop/switch isn't completed */
	//   42   73:goto            36
			}
			k = i + zza(charsequence, j);
	//   43   76:iload_1         
	//   44   77:aload_0         
	//   45   78:iload_2         
	//   46   79:invokestatic    #169 <Method int zza(CharSequence, int)>
	//   47   82:iadd            
	//   48   83:istore_3        
		}
		if(k < l)
	//*  49   84:iload_3         
	//*  50   85:iload           4
	//*  51   87:icmpge          128
		{
			long l1 = k;
	//   52   90:iload_3         
	//   53   91:i2l             
	//   54   92:lstore          5
			throw new IllegalArgumentException((new StringBuilder(54)).append("UTF-8 length does not fit in int: ").append(l1 + 0x0L).toString());
	//   55   94:new             #70  <Class IllegalArgumentException>
	//   56   97:dup             
	//   57   98:new             #72  <Class StringBuilder>
	//   58  101:dup             
	//   59  102:bipush          54
	//   60  104:invokespecial   #75  <Method void StringBuilder(int)>
	//   61  107:ldc1            #171 <String "UTF-8 length does not fit in int: ">
	//   62  109:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   63  112:lload           5
	//   64  114:ldc2w           #172 <Long 0x0L>
	//   65  117:ladd            
	//   66  118:invokevirtual   #176 <Method StringBuilder StringBuilder.append(long)>
	//   67  121:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   68  124:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//   69  127:athrow          
		} else
		{
			return k;
	//   70  128:iload_3         
	//   71  129:ireturn         
		}
		int l = charsequence.length();
		int i;
		for(i = 0; i < l && charsequence.charAt(i) < '\200'; i++);
		j = i;
	//   72  130:iload_1         
	//   73  131:istore_2        
		i = l;
	//   74  132:iload           4
	//   75  134:istore_1        
		if(true) goto _L2; else goto _L1
	//   76  135:goto            36
_L1:
	}

	private static void zzb(CharSequence charsequence, ByteBuffer bytebuffer)
	{
		int i;
		int l;
		l = charsequence.length();
	//    0    0:aload_0         
	//    1    1:invokeinterface #56  <Method int CharSequence.length()>
	//    2    6:istore          6
		i = 0;
	//    3    8:iconst_0        
	//    4    9:istore          4
_L2:
		char c;
		if(i >= l)
			break MISSING_BLOCK_LABEL_300;
	//    5   11:iload           4
	//    6   13:iload           6
	//    7   15:icmpge          300
		c = charsequence.charAt(i);
	//    8   18:aload_0         
	//    9   19:iload           4
	//   10   21:invokeinterface #60  <Method char CharSequence.charAt(int)>
	//   11   26:istore_2        
		if(c >= '\200')
			break; /* Loop/switch isn't completed */
	//   12   27:iload_2         
	//   13   28:sipush          128
	//   14   31:icmpge          50
		bytebuffer.put((byte)c);
	//   15   34:aload_1         
	//   16   35:iload_2         
	//   17   36:int2byte        
	//   18   37:invokevirtual   #180 <Method ByteBuffer ByteBuffer.put(byte)>
	//   19   40:pop             
_L3:
		i++;
	//   20   41:iload           4
	//   21   43:iconst_1        
	//   22   44:iadd            
	//   23   45:istore          4
		if(true) goto _L2; else goto _L1
	//   24   47:goto            11
_L1:
		if(c < '\u0800')
	//*  25   50:iload_2         
	//*  26   51:sipush          2048
	//*  27   54:icmpge          88
		{
			bytebuffer.put((byte)(c >>> 6 | 0x3c0));
	//   28   57:aload_1         
	//   29   58:iload_2         
	//   30   59:bipush          6
	//   31   61:iushr           
	//   32   62:sipush          960
	//   33   65:ior             
	//   34   66:int2byte        
	//   35   67:invokevirtual   #180 <Method ByteBuffer ByteBuffer.put(byte)>
	//   36   70:pop             
			bytebuffer.put((byte)(c & 0x3f | 0x80));
	//   37   71:aload_1         
	//   38   72:iload_2         
	//   39   73:bipush          63
	//   40   75:iand            
	//   41   76:sipush          128
	//   42   79:ior             
	//   43   80:int2byte        
	//   44   81:invokevirtual   #180 <Method ByteBuffer ByteBuffer.put(byte)>
	//   45   84:pop             
		} else
	//*  46   85:goto            41
		if(c < '\uD800' || '\uDFFF' < c)
	//*  47   88:iload_2         
	//*  48   89:ldc1            #61  <Int 55296>
	//*  49   91:icmplt          100
	//*  50   94:ldc1            #62  <Int 57343>
	//*  51   96:iload_2         
	//*  52   97:icmpge          148
		{
			bytebuffer.put((byte)(c >>> 12 | 0x1e0));
	//   53  100:aload_1         
	//   54  101:iload_2         
	//   55  102:bipush          12
	//   56  104:iushr           
	//   57  105:sipush          480
	//   58  108:ior             
	//   59  109:int2byte        
	//   60  110:invokevirtual   #180 <Method ByteBuffer ByteBuffer.put(byte)>
	//   61  113:pop             
			bytebuffer.put((byte)(c >>> 6 & 0x3f | 0x80));
	//   62  114:aload_1         
	//   63  115:iload_2         
	//   64  116:bipush          6
	//   65  118:iushr           
	//   66  119:bipush          63
	//   67  121:iand            
	//   68  122:sipush          128
	//   69  125:ior             
	//   70  126:int2byte        
	//   71  127:invokevirtual   #180 <Method ByteBuffer ByteBuffer.put(byte)>
	//   72  130:pop             
			bytebuffer.put((byte)(c & 0x3f | 0x80));
	//   73  131:aload_1         
	//   74  132:iload_2         
	//   75  133:bipush          63
	//   76  135:iand            
	//   77  136:sipush          128
	//   78  139:ior             
	//   79  140:int2byte        
	//   80  141:invokevirtual   #180 <Method ByteBuffer ByteBuffer.put(byte)>
	//   81  144:pop             
		} else
	//*  82  145:goto            41
		{
			char c1;
label0:
			{
				int j = i;
	//   83  148:iload           4
	//   84  150:istore          5
				if(i + 1 != charsequence.length())
	//*  85  152:iload           4
	//*  86  154:iconst_1        
	//*  87  155:iadd            
	//*  88  156:aload_0         
	//*  89  157:invokeinterface #56  <Method int CharSequence.length()>
	//*  90  162:icmpeq          192
				{
					i++;
	//   91  165:iload           4
	//   92  167:iconst_1        
	//   93  168:iadd            
	//   94  169:istore          4
					c1 = charsequence.charAt(i);
	//   95  171:aload_0         
	//   96  172:iload           4
	//   97  174:invokeinterface #60  <Method char CharSequence.charAt(int)>
	//   98  179:istore_3        
					if(Character.isSurrogatePair(c, c1))
						break label0;
	//   99  180:iload_2         
	//  100  181:iload_3         
	//  101  182:invokestatic    #96  <Method boolean Character.isSurrogatePair(char, char)>
	//  102  185:ifne            224
					j = i;
	//  103  188:iload           4
	//  104  190:istore          5
				}
				throw new IllegalArgumentException((new StringBuilder(39)).append("Unpaired surrogate at index ").append(j - 1).toString());
	//  105  192:new             #70  <Class IllegalArgumentException>
	//  106  195:dup             
	//  107  196:new             #72  <Class StringBuilder>
	//  108  199:dup             
	//  109  200:bipush          39
	//  110  202:invokespecial   #75  <Method void StringBuilder(int)>
	//  111  205:ldc1            #77  <String "Unpaired surrogate at index ">
	//  112  207:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  113  210:iload           5
	//  114  212:iconst_1        
	//  115  213:isub            
	//  116  214:invokevirtual   #84  <Method StringBuilder StringBuilder.append(int)>
	//  117  217:invokevirtual   #88  <Method String StringBuilder.toString()>
	//  118  220:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//  119  223:athrow          
			}
			int k = Character.toCodePoint(c, c1);
	//  120  224:iload_2         
	//  121  225:iload_3         
	//  122  226:invokestatic    #100 <Method int Character.toCodePoint(char, char)>
	//  123  229:istore          5
			bytebuffer.put((byte)(k >>> 18 | 0xf0));
	//  124  231:aload_1         
	//  125  232:iload           5
	//  126  234:bipush          18
	//  127  236:iushr           
	//  128  237:sipush          240
	//  129  240:ior             
	//  130  241:int2byte        
	//  131  242:invokevirtual   #180 <Method ByteBuffer ByteBuffer.put(byte)>
	//  132  245:pop             
			bytebuffer.put((byte)(k >>> 12 & 0x3f | 0x80));
	//  133  246:aload_1         
	//  134  247:iload           5
	//  135  249:bipush          12
	//  136  251:iushr           
	//  137  252:bipush          63
	//  138  254:iand            
	//  139  255:sipush          128
	//  140  258:ior             
	//  141  259:int2byte        
	//  142  260:invokevirtual   #180 <Method ByteBuffer ByteBuffer.put(byte)>
	//  143  263:pop             
			bytebuffer.put((byte)(k >>> 6 & 0x3f | 0x80));
	//  144  264:aload_1         
	//  145  265:iload           5
	//  146  267:bipush          6
	//  147  269:iushr           
	//  148  270:bipush          63
	//  149  272:iand            
	//  150  273:sipush          128
	//  151  276:ior             
	//  152  277:int2byte        
	//  153  278:invokevirtual   #180 <Method ByteBuffer ByteBuffer.put(byte)>
	//  154  281:pop             
			bytebuffer.put((byte)(k & 0x3f | 0x80));
	//  155  282:aload_1         
	//  156  283:iload           5
	//  157  285:bipush          63
	//  158  287:iand            
	//  159  288:sipush          128
	//  160  291:ior             
	//  161  292:int2byte        
	//  162  293:invokevirtual   #180 <Method ByteBuffer ByteBuffer.put(byte)>
	//  163  296:pop             
		}
		  goto _L3
		if(true) goto _L2; else goto _L4
	//* 164  297:goto            41
_L4:
	//  165  300:return          
	}

	public static int zzba(long l)
	{
		return zzbe(l);
	//    0    0:lload_0         
	//    1    1:invokestatic    #185 <Method int zzbe(long)>
	//    2    4:ireturn         
	}

	public static int zzbb(long l)
	{
		return zzbe(l);
	//    0    0:lload_0         
	//    1    1:invokestatic    #185 <Method int zzbe(long)>
	//    2    4:ireturn         
	}

	public static int zzbc(long l)
	{
		return zzbe(zzbg(l));
	//    0    0:lload_0         
	//    1    1:invokestatic    #191 <Method long zzbg(long)>
	//    2    4:invokestatic    #185 <Method int zzbe(long)>
	//    3    7:ireturn         
	}

	public static int zzbe(long l)
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

	public static long zzbg(long l)
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

	public static int zzc(int i, zzbut zzbut1)
	{
		return zzqs(i) + zze(zzbut1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzqs(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #212 <Method int zze(zzbut)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzc(int i, byte abyte0[])
	{
		return zzqs(i) + zzag(abyte0);
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzqs(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #215 <Method int zzag(byte[])>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static zzbum zzc(byte abyte0[], int i, int j)
	{
		return new zzbum(abyte0, i, j);
	//    0    0:new             #2   <Class zzbum>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #217 <Method void zzbum(byte[], int, int)>
	//    6   10:areturn         
	}

	public static int zzd(int i, float f)
	{
		return zzqs(i) + 4;
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzqs(int)>
	//    2    4:iconst_4        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public static int zzd(zzbut zzbut1)
	{
		return zzbut1.zzacZ();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #223 <Method int zzbut.zzacZ()>
	//    2    4:ireturn         
	}

	public static int zze(int i, long l)
	{
		return zzqs(i) + zzba(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzqs(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #226 <Method int zzba(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zze(zzbut zzbut1)
	{
		int i = zzbut1.zzacZ();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #223 <Method int zzbut.zzacZ()>
	//    2    4:istore_1        
		return i + zzqu(i);
	//    3    5:iload_1         
	//    4    6:iload_1         
	//    5    7:invokestatic    #160 <Method int zzqu(int)>
	//    6   10:iadd            
	//    7   11:ireturn         
	}

	public static int zzf(int i, long l)
	{
		return zzqs(i) + zzbb(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzqs(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #229 <Method int zzbb(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzg(int i, long l)
	{
		return zzqs(i) + 8;
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzqs(int)>
	//    2    4:bipush          8
	//    3    6:iadd            
	//    4    7:ireturn         
	}

	public static int zzh(int i, long l)
	{
		return zzqs(i) + zzbc(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzqs(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #233 <Method int zzbc(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzh(int i, boolean flag)
	{
		return zzqs(i) + 1;
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzqs(int)>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public static int zzkc(String s)
	{
		int i = zzb(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #238 <Method int zzb(CharSequence)>
	//    2    4:istore_1        
		return i + zzqu(i);
	//    3    5:iload_1         
	//    4    6:iload_1         
	//    5    7:invokestatic    #160 <Method int zzqu(int)>
	//    6   10:iadd            
	//    7   11:ireturn         
	}

	public static int zzqp(int i)
	{
		if(i >= 0)
	//*   0    0:iload_0         
	//*   1    1:iflt            9
			return zzqu(i);
	//    2    4:iload_0         
	//    3    5:invokestatic    #160 <Method int zzqu(int)>
	//    4    8:ireturn         
		else
			return 10;
	//    5    9:bipush          10
	//    6   11:ireturn         
	}

	public static int zzqq(int i)
	{
		return zzqu(zzqw(i));
	//    0    0:iload_0         
	//    1    1:invokestatic    #241 <Method int zzqw(int)>
	//    2    4:invokestatic    #160 <Method int zzqu(int)>
	//    3    7:ireturn         
	}

	public static int zzqs(int i)
	{
		return zzqu(zzbuw.zzK(i, 0));
	//    0    0:iload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #246 <Method int zzbuw.zzK(int, int)>
	//    3    5:invokestatic    #160 <Method int zzqu(int)>
	//    4    8:ireturn         
	}

	public static int zzqu(int i)
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
	//*  12   19:ldc1            #247 <Int 0xffe00000>
	//*  13   21:iload_0         
	//*  14   22:iand            
	//*  15   23:ifne            28
			return 3;
	//   16   26:iconst_3        
	//   17   27:ireturn         
		return (0xf0000000 & i) != 0 ? 5 : 4;
	//   18   28:ldc1            #248 <Int 0xf0000000>
	//   19   30:iload_0         
	//   20   31:iand            
	//   21   32:ifne            37
	//   22   35:iconst_4        
	//   23   36:ireturn         
	//   24   37:iconst_5        
	//   25   38:ireturn         
	}

	public static int zzqw(int i)
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

	public static int zzr(int i, String s)
	{
		return zzqs(i) + zzkc(s);
	//    0    0:iload_0         
	//    1    1:invokestatic    #42  <Method int zzqs(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #252 <Method int zzkc(String)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public void zzF(int i, int j)
		throws IOException
	{
		zzJ(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #259 <Method void zzJ(int, int)>
		zzqn(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #262 <Method void zzqn(int)>
	//    7   11:return          
	}

	public void zzG(int i, int j)
		throws IOException
	{
		zzJ(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #259 <Method void zzJ(int, int)>
		zzqo(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #267 <Method void zzqo(int)>
	//    7   11:return          
	}

	public void zzJ(int i, int j)
		throws IOException
	{
		zzqt(zzbuw.zzK(i, j));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #246 <Method int zzbuw.zzK(int, int)>
	//    4    6:invokevirtual   #270 <Method void zzqt(int)>
	//    5    9:return          
	}

	public void zza(int i, double d)
		throws IOException
	{
		zzJ(i, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #259 <Method void zzJ(int, int)>
		zzn(d);
	//    4    6:aload_0         
	//    5    7:dload_2         
	//    6    8:invokevirtual   #275 <Method void zzn(double)>
	//    7   11:return          
	}

	public void zza(int i, long l)
		throws IOException
	{
		zzJ(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #259 <Method void zzJ(int, int)>
		zzaW(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #280 <Method void zzaW(long)>
	//    7   11:return          
	}

	public void zza(int i, zzbut zzbut1)
		throws IOException
	{
		zzJ(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #259 <Method void zzJ(int, int)>
		zzc(zzbut1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #284 <Method void zzc(zzbut)>
	//    7   11:return          
	}

	public void zzaW(long l)
		throws IOException
	{
		zzbd(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #287 <Method void zzbd(long)>
	//    3    5:return          
	}

	public void zzaX(long l)
		throws IOException
	{
		zzbd(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #287 <Method void zzbd(long)>
	//    3    5:return          
	}

	public void zzaY(long l)
		throws IOException
	{
		zzbf(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #292 <Method void zzbf(long)>
	//    3    5:return          
	}

	public void zzaZ(long l)
		throws IOException
	{
		zzbd(zzbg(l));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #191 <Method long zzbg(long)>
	//    3    5:invokevirtual   #287 <Method void zzbd(long)>
	//    4    8:return          
	}

	public int zzacL()
	{
		return zzcrW.remaining();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ByteBuffer zzcrW>
	//    2    4:invokevirtual   #134 <Method int ByteBuffer.remaining()>
	//    3    7:ireturn         
	}

	public void zzacM()
	{
		if(zzacL() != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #297 <Method int zzacL()>
	//*   2    4:ifeq            18
			throw new IllegalStateException("Did not write as much data as expected.");
	//    3    7:new             #299 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #301 <String "Did not write as much data as expected.">
	//    6   14:invokespecial   #302 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		else
			return;
	//    8   18:return          
	}

	public void zzaf(byte abyte0[])
		throws IOException
	{
		zzqt(abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:arraylength     
	//    3    3:invokevirtual   #270 <Method void zzqt(int)>
		zzah(abyte0);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #307 <Method void zzah(byte[])>
	//    7   11:return          
	}

	public void zzah(byte abyte0[])
		throws IOException
	{
		zzd(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #309 <Method void zzd(byte[], int, int)>
	//    6    8:return          
	}

	public void zzb(int i, long l)
		throws IOException
	{
		zzJ(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #259 <Method void zzJ(int, int)>
		zzaX(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #311 <Method void zzaX(long)>
	//    7   11:return          
	}

	public void zzb(int i, byte abyte0[])
		throws IOException
	{
		zzJ(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #259 <Method void zzJ(int, int)>
		zzaf(abyte0);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #314 <Method void zzaf(byte[])>
	//    7   11:return          
	}

	public void zzb(zzbut zzbut1)
		throws IOException
	{
		zzbut1.zza(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #317 <Method void zzbut.zza(zzbum)>
	//    3    5:return          
	}

	public void zzbd(long l)
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
				zzqr((int)l);
	//    6   10:aload_0         
	//    7   11:lload_1         
	//    8   12:l2i             
	//    9   13:invokevirtual   #320 <Method void zzqr(int)>
				return;
	//   10   16:return          
			}
			zzqr((int)l & 0x7f | 0x80);
	//   11   17:aload_0         
	//   12   18:lload_1         
	//   13   19:l2i             
	//   14   20:bipush          127
	//   15   22:iand            
	//   16   23:sipush          128
	//   17   26:ior             
	//   18   27:invokevirtual   #320 <Method void zzqr(int)>
			l >>>= 7;
	//   19   30:lload_1         
	//   20   31:bipush          7
	//   21   33:lushr           
	//   22   34:lstore_1        
		} while(true);
	//   23   35:goto            0
	}

	public void zzbf(long l)
		throws IOException
	{
		if(zzcrW.remaining() < 8)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field ByteBuffer zzcrW>
	//*   2    4:invokevirtual   #134 <Method int ByteBuffer.remaining()>
	//*   3    7:bipush          8
	//*   4    9:icmpge          34
		{
			throw new zza(zzcrW.position(), zzcrW.limit());
	//    5   12:new             #6   <Class zzbum$zza>
	//    6   15:dup             
	//    7   16:aload_0         
	//    8   17:getfield        #16  <Field ByteBuffer zzcrW>
	//    9   20:invokevirtual   #131 <Method int ByteBuffer.position()>
	//   10   23:aload_0         
	//   11   24:getfield        #16  <Field ByteBuffer zzcrW>
	//   12   27:invokevirtual   #323 <Method int ByteBuffer.limit()>
	//   13   30:invokespecial   #325 <Method void zzbum$zza(int, int)>
	//   14   33:athrow          
		} else
		{
			zzcrW.putLong(l);
	//   15   34:aload_0         
	//   16   35:getfield        #16  <Field ByteBuffer zzcrW>
	//   17   38:lload_1         
	//   18   39:invokevirtual   #329 <Method ByteBuffer ByteBuffer.putLong(long)>
	//   19   42:pop             
			return;
	//   20   43:return          
		}
	}

	public void zzbl(boolean flag)
		throws IOException
	{
		int i;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            12
			i = 1;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:aload_0         
	//*   5    7:iload_2         
	//*   6    8:invokevirtual   #320 <Method void zzqr(int)>
	//*   7   11:return          
			i = 0;
	//    8   12:iconst_0        
	//    9   13:istore_2        
		zzqr(i);
	//*  10   14:goto            6
	}

	public void zzc(byte byte0)
		throws IOException
	{
		if(!zzcrW.hasRemaining())
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field ByteBuffer zzcrW>
	//*   2    4:invokevirtual   #335 <Method boolean ByteBuffer.hasRemaining()>
	//*   3    7:ifne            32
		{
			throw new zza(zzcrW.position(), zzcrW.limit());
	//    4   10:new             #6   <Class zzbum$zza>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:getfield        #16  <Field ByteBuffer zzcrW>
	//    8   18:invokevirtual   #131 <Method int ByteBuffer.position()>
	//    9   21:aload_0         
	//   10   22:getfield        #16  <Field ByteBuffer zzcrW>
	//   11   25:invokevirtual   #323 <Method int ByteBuffer.limit()>
	//   12   28:invokespecial   #325 <Method void zzbum$zza(int, int)>
	//   13   31:athrow          
		} else
		{
			zzcrW.put(byte0);
	//   14   32:aload_0         
	//   15   33:getfield        #16  <Field ByteBuffer zzcrW>
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
		zzJ(i, 5);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_5        
	//    3    3:invokevirtual   #259 <Method void zzJ(int, int)>
		zzk(f);
	//    4    6:aload_0         
	//    5    7:fload_2         
	//    6    8:invokevirtual   #340 <Method void zzk(float)>
	//    7   11:return          
	}

	public void zzc(int i, long l)
		throws IOException
	{
		zzJ(i, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #259 <Method void zzJ(int, int)>
		zzaY(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #342 <Method void zzaY(long)>
	//    7   11:return          
	}

	public void zzc(zzbut zzbut1)
		throws IOException
	{
		zzqt(zzbut1.zzacY());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #345 <Method int zzbut.zzacY()>
	//    3    5:invokevirtual   #270 <Method void zzqt(int)>
		zzbut1.zza(this);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #317 <Method void zzbut.zza(zzbum)>
	//    7   13:return          
	}

	public void zzd(int i, long l)
		throws IOException
	{
		zzJ(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #259 <Method void zzJ(int, int)>
		zzaZ(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #347 <Method void zzaZ(long)>
	//    7   11:return          
	}

	public void zzd(byte abyte0[], int i, int j)
		throws IOException
	{
		if(zzcrW.remaining() >= j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field ByteBuffer zzcrW>
	//*   2    4:invokevirtual   #134 <Method int ByteBuffer.remaining()>
	//*   3    7:iload_3         
	//*   4    8:icmplt          23
		{
			zzcrW.put(abyte0, i, j);
	//    5   11:aload_0         
	//    6   12:getfield        #16  <Field ByteBuffer zzcrW>
	//    7   15:aload_1         
	//    8   16:iload_2         
	//    9   17:iload_3         
	//   10   18:invokevirtual   #349 <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//   11   21:pop             
			return;
	//   12   22:return          
		} else
		{
			throw new zza(zzcrW.position(), zzcrW.limit());
	//   13   23:new             #6   <Class zzbum$zza>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:getfield        #16  <Field ByteBuffer zzcrW>
	//   17   31:invokevirtual   #131 <Method int ByteBuffer.position()>
	//   18   34:aload_0         
	//   19   35:getfield        #16  <Field ByteBuffer zzcrW>
	//   20   38:invokevirtual   #323 <Method int ByteBuffer.limit()>
	//   21   41:invokespecial   #325 <Method void zzbum$zza(int, int)>
	//   22   44:athrow          
		}
	}

	public void zzg(int i, boolean flag)
		throws IOException
	{
		zzJ(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #259 <Method void zzJ(int, int)>
		zzbl(flag);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #352 <Method void zzbl(boolean)>
	//    7   11:return          
	}

	public void zzk(float f)
		throws IOException
	{
		zzqv(Float.floatToIntBits(f));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #358 <Method int Float.floatToIntBits(float)>
	//    3    5:invokevirtual   #361 <Method void zzqv(int)>
	//    4    8:return          
	}

	public void zzkb(String s)
		throws IOException
	{
		int i;
		int j;
		zza zza1;
		i = zzqu(s.length());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #365 <Method int String.length()>
	//    2    4:invokestatic    #160 <Method int zzqu(int)>
	//    3    7:istore_2        
		if(i != zzqu(s.length() * 3))
			break MISSING_BLOCK_LABEL_150;
	//    4    8:iload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #365 <Method int String.length()>
	//    7   13:iconst_3        
	//    8   14:imul            
	//    9   15:invokestatic    #160 <Method int zzqu(int)>
	//   10   18:icmpne          150
		j = zzcrW.position();
	//   11   21:aload_0         
	//   12   22:getfield        #16  <Field ByteBuffer zzcrW>
	//   13   25:invokevirtual   #131 <Method int ByteBuffer.position()>
	//   14   28:istore_3        
		if(zzcrW.remaining() < i)
	//*  15   29:aload_0         
	//*  16   30:getfield        #16  <Field ByteBuffer zzcrW>
	//*  17   33:invokevirtual   #134 <Method int ByteBuffer.remaining()>
	//*  18   36:iload_2         
	//*  19   37:icmpge          92
			throw new zza(i + j, zzcrW.limit());
	//   20   40:new             #6   <Class zzbum$zza>
	//   21   43:dup             
	//   22   44:iload_2         
	//   23   45:iload_3         
	//   24   46:iadd            
	//   25   47:aload_0         
	//   26   48:getfield        #16  <Field ByteBuffer zzcrW>
	//   27   51:invokevirtual   #323 <Method int ByteBuffer.limit()>
	//   28   54:invokespecial   #325 <Method void zzbum$zza(int, int)>
	//   29   57:athrow          
	//*  30   58:astore_1        
	//*  31   59:new             #6   <Class zzbum$zza>
	//*  32   62:dup             
	//*  33   63:aload_0         
	//*  34   64:getfield        #16  <Field ByteBuffer zzcrW>
	//*  35   67:invokevirtual   #131 <Method int ByteBuffer.position()>
	//*  36   70:aload_0         
	//*  37   71:getfield        #16  <Field ByteBuffer zzcrW>
	//*  38   74:invokevirtual   #323 <Method int ByteBuffer.limit()>
	//*  39   77:invokespecial   #325 <Method void zzbum$zza(int, int)>
	//*  40   80:astore          5
	//*  41   82:aload           5
	//*  42   84:aload_1         
	//*  43   85:invokevirtual   #366 <Method Throwable zzbum$zza.initCause(Throwable)>
	//*  44   88:pop             
	//*  45   89:aload           5
	//*  46   91:athrow          
		try
		{
			zzcrW.position(j + i);
	//   47   92:aload_0         
	//   48   93:getfield        #16  <Field ByteBuffer zzcrW>
	//   49   96:iload_3         
	//   50   97:iload_2         
	//   51   98:iadd            
	//   52   99:invokevirtual   #139 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   53  102:pop             
			zza(((CharSequence) (s)), zzcrW);
	//   54  103:aload_1         
	//   55  104:aload_0         
	//   56  105:getfield        #16  <Field ByteBuffer zzcrW>
	//   57  108:invokestatic    #368 <Method void zza(CharSequence, ByteBuffer)>
			int k = zzcrW.position();
	//   58  111:aload_0         
	//   59  112:getfield        #16  <Field ByteBuffer zzcrW>
	//   60  115:invokevirtual   #131 <Method int ByteBuffer.position()>
	//   61  118:istore          4
			zzcrW.position(j);
	//   62  120:aload_0         
	//   63  121:getfield        #16  <Field ByteBuffer zzcrW>
	//   64  124:iload_3         
	//   65  125:invokevirtual   #139 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   66  128:pop             
			zzqt(k - j - i);
	//   67  129:aload_0         
	//   68  130:iload           4
	//   69  132:iload_3         
	//   70  133:isub            
	//   71  134:iload_2         
	//   72  135:isub            
	//   73  136:invokevirtual   #270 <Method void zzqt(int)>
			zzcrW.position(k);
	//   74  139:aload_0         
	//   75  140:getfield        #16  <Field ByteBuffer zzcrW>
	//   76  143:iload           4
	//   77  145:invokevirtual   #139 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   78  148:pop             
			return;
	//   79  149:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			zza1 = new zza(zzcrW.position(), zzcrW.limit());
			zza1.initCause(((Throwable) (s)));
			throw zza1;
		}
		zzqt(zzb(((CharSequence) (s))));
	//   80  150:aload_0         
	//   81  151:aload_1         
	//   82  152:invokestatic    #238 <Method int zzb(CharSequence)>
	//   83  155:invokevirtual   #270 <Method void zzqt(int)>
		zza(((CharSequence) (s)), zzcrW);
	//   84  158:aload_1         
	//   85  159:aload_0         
	//   86  160:getfield        #16  <Field ByteBuffer zzcrW>
	//   87  163:invokestatic    #368 <Method void zza(CharSequence, ByteBuffer)>
		return;
	//   88  166:return          
	}

	public void zzn(double d)
		throws IOException
	{
		zzbf(Double.doubleToLongBits(d));
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokestatic    #374 <Method long Double.doubleToLongBits(double)>
	//    3    5:invokevirtual   #292 <Method void zzbf(long)>
	//    4    8:return          
	}

	public void zzq(int i, String s)
		throws IOException
	{
		zzJ(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #259 <Method void zzJ(int, int)>
		zzkb(s);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #378 <Method void zzkb(String)>
	//    7   11:return          
	}

	public void zzqn(int i)
		throws IOException
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            10
		{
			zzqt(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #270 <Method void zzqt(int)>
			return;
	//    5    9:return          
		} else
		{
			zzbd(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:i2l             
	//    9   13:invokevirtual   #287 <Method void zzbd(long)>
			return;
	//   10   16:return          
		}
	}

	public void zzqo(int i)
		throws IOException
	{
		zzqt(zzqw(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #241 <Method int zzqw(int)>
	//    3    5:invokevirtual   #270 <Method void zzqt(int)>
	//    4    8:return          
	}

	public void zzqr(int i)
		throws IOException
	{
		zzc((byte)i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:int2byte        
	//    3    3:invokevirtual   #380 <Method void zzc(byte)>
	//    4    6:return          
	}

	public void zzqt(int i)
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
				zzqr(i);
	//    4    7:aload_0         
	//    5    8:iload_1         
	//    6    9:invokevirtual   #320 <Method void zzqr(int)>
				return;
	//    7   12:return          
			}
			zzqr(i & 0x7f | 0x80);
	//    8   13:aload_0         
	//    9   14:iload_1         
	//   10   15:bipush          127
	//   11   17:iand            
	//   12   18:sipush          128
	//   13   21:ior             
	//   14   22:invokevirtual   #320 <Method void zzqr(int)>
			i >>>= 7;
	//   15   25:iload_1         
	//   16   26:bipush          7
	//   17   28:iushr           
	//   18   29:istore_1        
		} while(true);
	//   19   30:goto            0
	}

	public void zzqv(int i)
		throws IOException
	{
		if(zzcrW.remaining() < 4)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field ByteBuffer zzcrW>
	//*   2    4:invokevirtual   #134 <Method int ByteBuffer.remaining()>
	//*   3    7:iconst_4        
	//*   4    8:icmpge          33
		{
			throw new zza(zzcrW.position(), zzcrW.limit());
	//    5   11:new             #6   <Class zzbum$zza>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:getfield        #16  <Field ByteBuffer zzcrW>
	//    9   19:invokevirtual   #131 <Method int ByteBuffer.position()>
	//   10   22:aload_0         
	//   11   23:getfield        #16  <Field ByteBuffer zzcrW>
	//   12   26:invokevirtual   #323 <Method int ByteBuffer.limit()>
	//   13   29:invokespecial   #325 <Method void zzbum$zza(int, int)>
	//   14   32:athrow          
		} else
		{
			zzcrW.putInt(i);
	//   15   33:aload_0         
	//   16   34:getfield        #16  <Field ByteBuffer zzcrW>
	//   17   37:iload_1         
	//   18   38:invokevirtual   #384 <Method ByteBuffer ByteBuffer.putInt(int)>
	//   19   41:pop             
			return;
	//   20   42:return          
		}
	}

	private final ByteBuffer zzcrW;
}
