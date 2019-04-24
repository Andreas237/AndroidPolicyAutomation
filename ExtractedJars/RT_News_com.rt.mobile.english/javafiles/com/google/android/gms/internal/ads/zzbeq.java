// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzben, zzbek, zzbem, zzbep

final class zzbeq extends zzben
{

	zzbeq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void zzben()>
	//    2    4:return          
	}

	private static int zza(byte abyte0[], int i, long l, int j)
	{
		switch(j)
	//*   0    0:iload           4
		{
	//*   1    2:tableswitch     0 2: default 28
	//	               0 63
	//	               1 53
	//	               2 36
		default:
			throw new AssertionError();
	//    2   28:new             #13  <Class AssertionError>
	//    3   31:dup             
	//    4   32:invokespecial   #14  <Method void AssertionError()>
	//    5   35:athrow          

		case 2: // '\002'
			return zzbem.zzg(i, ((int) (zzbek.zza(abyte0, l))), ((int) (zzbek.zza(abyte0, l + 1L))));
	//    6   36:iload_1         
	//    7   37:aload_0         
	//    8   38:lload_2         
	//    9   39:invokestatic    #19  <Method byte zzbek.zza(byte[], long)>
	//   10   42:aload_0         
	//   11   43:lload_2         
	//   12   44:lconst_1        
	//   13   45:ladd            
	//   14   46:invokestatic    #19  <Method byte zzbek.zza(byte[], long)>
	//   15   49:invokestatic    #25  <Method int zzbem.zzg(int, int, int)>
	//   16   52:ireturn         

		case 1: // '\001'
			return zzbem.zzaa(i, ((int) (zzbek.zza(abyte0, l))));
	//   17   53:iload_1         
	//   18   54:aload_0         
	//   19   55:lload_2         
	//   20   56:invokestatic    #19  <Method byte zzbek.zza(byte[], long)>
	//   21   59:invokestatic    #29  <Method int zzbem.zzaa(int, int)>
	//   22   62:ireturn         

		case 0: // '\0'
			return zzbem.zzdb(i);
	//   23   63:iload_1         
	//   24   64:invokestatic    #33  <Method int zzbem.zzdb(int)>
	//   25   67:ireturn         
		}
	}

	final int zzb(int i, byte abyte0[], int j, int k)
	{
		long l2;
label0:
		{
			if((j | k | abyte0.length - k) < 0)
	//*   0    0:iload_3         
	//*   1    1:iload           4
	//*   2    3:ior             
	//*   3    4:aload_2         
	//*   4    5:arraylength     
	//*   5    6:iload           4
	//*   6    8:isub            
	//*   7    9:ior             
	//*   8   10:ifge            53
				throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[] {
					Integer.valueOf(abyte0.length), Integer.valueOf(j), Integer.valueOf(k)
				}));
	//    9   13:new             #37  <Class ArrayIndexOutOfBoundsException>
	//   10   16:dup             
	//   11   17:ldc1            #39  <String "Array length=%d, index=%d, limit=%d">
	//   12   19:iconst_3        
	//   13   20:anewarray       Object[]
	//   14   23:dup             
	//   15   24:iconst_0        
	//   16   25:aload_2         
	//   17   26:arraylength     
	//   18   27:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//   19   30:aastore         
	//   20   31:dup             
	//   21   32:iconst_1        
	//   22   33:iload_3         
	//   23   34:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//   24   37:aastore         
	//   25   38:dup             
	//   26   39:iconst_2        
	//   27   40:iload           4
	//   28   42:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//   29   45:aastore         
	//   30   46:invokestatic    #53  <Method String String.format(String, Object[])>
	//   31   49:invokespecial   #56  <Method void ArrayIndexOutOfBoundsException(String)>
	//   32   52:athrow          
			l2 = j;
	//   33   53:iload_3         
	//   34   54:i2l             
	//   35   55:lstore          7
			j = (int)((long)k - l2);
	//   36   57:iload           4
	//   37   59:i2l             
	//   38   60:lload           7
	//   39   62:lsub            
	//   40   63:l2i             
	//   41   64:istore_3        
			if(j < 16)
	//*  42   65:iload_3         
	//*  43   66:bipush          16
	//*  44   68:icmpge          76
			{
				i = 0;
	//   45   71:iconst_0        
	//   46   72:istore_1        
				break label0;
	//   47   73:goto            114
			}
			i = 0;
	//   48   76:iconst_0        
	//   49   77:istore_1        
			for(long l = l2; i < j; l++)
	//*  50   78:lload           7
	//*  51   80:lstore          5
	//*  52   82:iload_1         
	//*  53   83:iload_3         
	//*  54   84:icmpge          112
			{
				if(zzbek.zza(abyte0, l) < 0)
	//*  55   87:aload_2         
	//*  56   88:lload           5
	//*  57   90:invokestatic    #19  <Method byte zzbek.zza(byte[], long)>
	//*  58   93:ifge            99
					break label0;
	//   59   96:goto            114
				i++;
	//   60   99:iload_1         
	//   61  100:iconst_1        
	//   62  101:iadd            
	//   63  102:istore_1        
			}

	//   64  103:lload           5
	//   65  105:lconst_1        
	//   66  106:ladd            
	//   67  107:lstore          5
	//*  68  109:goto            82
			i = j;
	//   69  112:iload_3         
	//   70  113:istore_1        
		}
		j -= i;
	//   71  114:iload_3         
	//   72  115:iload_1         
	//   73  116:isub            
	//   74  117:istore_3        
		long l1 = l2 + (long)i;
	//   75  118:lload           7
	//   76  120:iload_1         
	//   77  121:i2l             
	//   78  122:ladd            
	//   79  123:lstore          5
		i = j;
	//   80  125:iload_3         
	//   81  126:istore_1        
		do
		{
label1:
			{
				long l3;
				do
				{
					do
					{
						j = 0;
	//   82  127:iconst_0        
	//   83  128:istore_3        
						do
						{
							l2 = l1;
	//   84  129:lload           5
	//   85  131:lstore          7
							if(i <= 0)
								break;
	//   86  133:iload_1         
	//   87  134:ifle            165
							l2 = l1 + 1L;
	//   88  137:lload           5
	//   89  139:lconst_1        
	//   90  140:ladd            
	//   91  141:lstore          7
							j = ((int) (zzbek.zza(abyte0, l1)));
	//   92  143:aload_2         
	//   93  144:lload           5
	//   94  146:invokestatic    #19  <Method byte zzbek.zza(byte[], long)>
	//   95  149:istore_3        
							if(j < 0)
								break;
	//   96  150:iload_3         
	//   97  151:iflt            165
							i--;
	//   98  154:iload_1         
	//   99  155:iconst_1        
	//  100  156:isub            
	//  101  157:istore_1        
							l1 = l2;
	//  102  158:lload           7
	//  103  160:lstore          5
						} while(true);
	//  104  162:goto            129
						if(i == 0)
	//* 105  165:iload_1         
	//* 106  166:ifne            171
							return 0;
	//  107  169:iconst_0        
	//  108  170:ireturn         
						i--;
	//  109  171:iload_1         
	//  110  172:iconst_1        
	//  111  173:isub            
	//  112  174:istore_1        
						if(j >= -32)
							break;
	//  113  175:iload_3         
	//  114  176:bipush          -32
	//  115  178:icmpge          221
						if(i == 0)
	//* 116  181:iload_1         
	//* 117  182:ifne            187
							return j;
	//  118  185:iload_3         
	//  119  186:ireturn         
						i--;
	//  120  187:iload_1         
	//  121  188:iconst_1        
	//  122  189:isub            
	//  123  190:istore_1        
						if(j >= -62)
	//* 124  191:iload_3         
	//* 125  192:bipush          -62
	//* 126  194:icmplt          219
						{
							if(zzbek.zza(abyte0, l2) > -65)
	//* 127  197:aload_2         
	//* 128  198:lload           7
	//* 129  200:invokestatic    #19  <Method byte zzbek.zza(byte[], long)>
	//* 130  203:bipush          -65
	//* 131  205:icmple          210
								return -1;
	//  132  208:iconst_m1       
	//  133  209:ireturn         
							l1 = l2 + 1L;
	//  134  210:lload           7
	//  135  212:lconst_1        
	//  136  213:ladd            
	//  137  214:lstore          5
						} else
	//* 138  216:goto            127
						{
							return -1;
	//  139  219:iconst_m1       
	//  140  220:ireturn         
						}
					} while(true);
					if(j >= -16)
						break label1;
	//  141  221:iload_3         
	//  142  222:bipush          -16
	//  143  224:icmpge          311
					if(i < 2)
	//* 144  227:iload_1         
	//* 145  228:iconst_2        
	//* 146  229:icmpge          241
						return zza(abyte0, j, l2, i);
	//  147  232:aload_2         
	//  148  233:iload_3         
	//  149  234:lload           7
	//  150  236:iload_1         
	//  151  237:invokestatic    #58  <Method int zza(byte[], int, long, int)>
	//  152  240:ireturn         
					i -= 2;
	//  153  241:iload_1         
	//  154  242:iconst_2        
	//  155  243:isub            
	//  156  244:istore_1        
					l3 = l2 + 1L;
	//  157  245:lload           7
	//  158  247:lconst_1        
	//  159  248:ladd            
	//  160  249:lstore          9
					k = ((int) (zzbek.zza(abyte0, l2)));
	//  161  251:aload_2         
	//  162  252:lload           7
	//  163  254:invokestatic    #19  <Method byte zzbek.zza(byte[], long)>
	//  164  257:istore          4
					if(k > -65 || j == -32 && k < -96 || j == -19 && k >= -96)
						break;
	//  165  259:iload           4
	//  166  261:bipush          -65
	//  167  263:icmpgt          309
	//  168  266:iload_3         
	//  169  267:bipush          -32
	//  170  269:icmpne          279
	//  171  272:iload           4
	//  172  274:bipush          -96
	//  173  276:icmplt          309
	//  174  279:iload_3         
	//  175  280:bipush          -19
	//  176  282:icmpne          292
	//  177  285:iload           4
	//  178  287:bipush          -96
	//  179  289:icmpge          309
					l1 = l3 + 1L;
	//  180  292:lload           9
	//  181  294:lconst_1        
	//  182  295:ladd            
	//  183  296:lstore          5
				} while(zzbek.zza(abyte0, l3) <= -65);
	//  184  298:aload_2         
	//  185  299:lload           9
	//  186  301:invokestatic    #19  <Method byte zzbek.zza(byte[], long)>
	//  187  304:bipush          -65
	//  188  306:icmple          127
				return -1;
	//  189  309:iconst_m1       
	//  190  310:ireturn         
			}
			if(i < 3)
	//* 191  311:iload_1         
	//* 192  312:iconst_3        
	//* 193  313:icmpge          325
				return zza(abyte0, j, l2, i);
	//  194  316:aload_2         
	//  195  317:iload_3         
	//  196  318:lload           7
	//  197  320:iload_1         
	//  198  321:invokestatic    #58  <Method int zza(byte[], int, long, int)>
	//  199  324:ireturn         
			i -= 3;
	//  200  325:iload_1         
	//  201  326:iconst_3        
	//  202  327:isub            
	//  203  328:istore_1        
			l1 = l2 + 1L;
	//  204  329:lload           7
	//  205  331:lconst_1        
	//  206  332:ladd            
	//  207  333:lstore          5
			k = ((int) (zzbek.zza(abyte0, l2)));
	//  208  335:aload_2         
	//  209  336:lload           7
	//  210  338:invokestatic    #19  <Method byte zzbek.zza(byte[], long)>
	//  211  341:istore          4
			if(k > -65 || (j << 28) + (k + 112) >> 30 != 0)
				break;
	//  212  343:iload           4
	//  213  345:bipush          -65
	//  214  347:icmpgt          400
	//  215  350:iload_3         
	//  216  351:bipush          28
	//  217  353:ishl            
	//  218  354:iload           4
	//  219  356:bipush          112
	//  220  358:iadd            
	//  221  359:iadd            
	//  222  360:bipush          30
	//  223  362:ishr            
	//  224  363:ifne            400
			l2 = l1 + 1L;
	//  225  366:lload           5
	//  226  368:lconst_1        
	//  227  369:ladd            
	//  228  370:lstore          7
			if(zzbek.zza(abyte0, l1) > -65)
				break;
	//  229  372:aload_2         
	//  230  373:lload           5
	//  231  375:invokestatic    #19  <Method byte zzbek.zza(byte[], long)>
	//  232  378:bipush          -65
	//  233  380:icmpgt          400
			l1 = l2 + 1L;
	//  234  383:lload           7
	//  235  385:lconst_1        
	//  236  386:ladd            
	//  237  387:lstore          5
		} while(zzbek.zza(abyte0, l2) <= -65);
	//  238  389:aload_2         
	//  239  390:lload           7
	//  240  392:invokestatic    #19  <Method byte zzbek.zza(byte[], long)>
	//  241  395:bipush          -65
	//  242  397:icmple          127
		return -1;
	//  243  400:iconst_m1       
	//  244  401:ireturn         
	}

	final int zzb(CharSequence charsequence, byte abyte0[], int i, int j)
	{
		int k;
label0:
		{
			long l2;
label1:
			{
				char c;
label2:
				{
					long l = i;
	//    0    0:iload_3         
	//    1    1:i2l             
	//    2    2:lstore          8
					long l3 = l + (long)j;
	//    3    4:lload           8
	//    4    6:iload           4
	//    5    8:i2l             
	//    6    9:ladd            
	//    7   10:lstore          12
					k = charsequence.length();
	//    8   12:aload_1         
	//    9   13:invokeinterface #65  <Method int CharSequence.length()>
	//   10   18:istore          7
					if(k > j || abyte0.length - j < i)
	//*  11   20:iload           7
	//*  12   22:iload           4
	//*  13   24:icmpgt          602
	//*  14   27:aload_2         
	//*  15   28:arraylength     
	//*  16   29:iload           4
	//*  17   31:isub            
	//*  18   32:iload_3         
	//*  19   33:icmpge          39
						break label0;
	//   20   36:goto            602
					j = 0;
	//   21   39:iconst_0        
	//   22   40:istore          4
					do
					{
						if(j >= k)
							break;
	//   23   42:iload           4
	//   24   44:iload           7
	//   25   46:icmpge          88
						i = ((int) (charsequence.charAt(j)));
	//   26   49:aload_1         
	//   27   50:iload           4
	//   28   52:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//   29   57:istore_3        
						if(i >= 128)
							break;
	//   30   58:iload_3         
	//   31   59:sipush          128
	//   32   62:icmpge          88
						zzbek.zza(abyte0, l, (byte)i);
	//   33   65:aload_2         
	//   34   66:lload           8
	//   35   68:iload_3         
	//   36   69:int2byte        
	//   37   70:invokestatic    #72  <Method void zzbek.zza(byte[], long, byte)>
						j++;
	//   38   73:iload           4
	//   39   75:iconst_1        
	//   40   76:iadd            
	//   41   77:istore          4
						l++;
	//   42   79:lload           8
	//   43   81:lconst_1        
	//   44   82:ladd            
	//   45   83:lstore          8
					} while(true);
	//   46   85:goto            42
					i = j;
	//   47   88:iload           4
	//   48   90:istore_3        
					l2 = l;
	//   49   91:lload           8
	//   50   93:lstore          10
					if(j == k)
	//*  51   95:iload           4
	//*  52   97:iload           7
	//*  53   99:icmpne          106
						return (int)l;
	//   54  102:lload           8
	//   55  104:l2i             
	//   56  105:ireturn         
					do
					{
						if(i >= k)
							break label1;
	//   57  106:iload_3         
	//   58  107:iload           7
	//   59  109:icmpge          598
						c = charsequence.charAt(i);
	//   60  112:aload_1         
	//   61  113:iload_3         
	//   62  114:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//   63  119:istore          5
						long l1;
						if(c < '\200' && l2 < l3)
	//*  64  121:iload           5
	//*  65  123:sipush          128
	//*  66  126:icmpge          155
	//*  67  129:lload           10
	//*  68  131:lload           12
	//*  69  133:lcmp            
	//*  70  134:ifge            155
						{
							zzbek.zza(abyte0, l2, (byte)c);
	//   71  137:aload_2         
	//   72  138:lload           10
	//   73  140:iload           5
	//   74  142:int2byte        
	//   75  143:invokestatic    #72  <Method void zzbek.zza(byte[], long, byte)>
							l1 = l2 + 1L;
	//   76  146:lload           10
	//   77  148:lconst_1        
	//   78  149:ladd            
	//   79  150:lstore          8
						} else
	//*  80  152:goto            471
						if(c < '\u0800' && l2 <= l3 - 2L)
	//*  81  155:iload           5
	//*  82  157:sipush          2048
	//*  83  160:icmpge          222
	//*  84  163:lload           10
	//*  85  165:lload           12
	//*  86  167:ldc2w           #73  <Long 2L>
	//*  87  170:lsub            
	//*  88  171:lcmp            
	//*  89  172:ifgt            222
						{
							long l4 = l2 + 1L;
	//   90  175:lload           10
	//   91  177:lconst_1        
	//   92  178:ladd            
	//   93  179:lstore          14
							zzbek.zza(abyte0, l2, (byte)(0x3c0 | c >>> 6));
	//   94  181:aload_2         
	//   95  182:lload           10
	//   96  184:sipush          960
	//   97  187:iload           5
	//   98  189:bipush          6
	//   99  191:iushr           
	//  100  192:ior             
	//  101  193:int2byte        
	//  102  194:invokestatic    #72  <Method void zzbek.zza(byte[], long, byte)>
							l1 = l4 + 1L;
	//  103  197:lload           14
	//  104  199:lconst_1        
	//  105  200:ladd            
	//  106  201:lstore          8
							zzbek.zza(abyte0, l4, (byte)(c & 0x3f | 0x80));
	//  107  203:aload_2         
	//  108  204:lload           14
	//  109  206:iload           5
	//  110  208:bipush          63
	//  111  210:iand            
	//  112  211:sipush          128
	//  113  214:ior             
	//  114  215:int2byte        
	//  115  216:invokestatic    #72  <Method void zzbek.zza(byte[], long, byte)>
						} else
	//* 116  219:goto            471
						if((c < '\uD800' || '\uDFFF' < c) && l2 <= l3 - 3L)
	//* 117  222:iload           5
	//* 118  224:ldc1            #75  <Int 55296>
	//* 119  226:icmplt          236
	//* 120  229:ldc1            #76  <Int 57343>
	//* 121  231:iload           5
	//* 122  233:icmpge          320
	//* 123  236:lload           10
	//* 124  238:lload           12
	//* 125  240:ldc2w           #77  <Long 3L>
	//* 126  243:lsub            
	//* 127  244:lcmp            
	//* 128  245:ifgt            320
						{
							l1 = l2 + 1L;
	//  129  248:lload           10
	//  130  250:lconst_1        
	//  131  251:ladd            
	//  132  252:lstore          8
							zzbek.zza(abyte0, l2, (byte)(0x1e0 | c >>> 12));
	//  133  254:aload_2         
	//  134  255:lload           10
	//  135  257:sipush          480
	//  136  260:iload           5
	//  137  262:bipush          12
	//  138  264:iushr           
	//  139  265:ior             
	//  140  266:int2byte        
	//  141  267:invokestatic    #72  <Method void zzbek.zza(byte[], long, byte)>
							l2 = l1 + 1L;
	//  142  270:lload           8
	//  143  272:lconst_1        
	//  144  273:ladd            
	//  145  274:lstore          10
							zzbek.zza(abyte0, l1, (byte)(c >>> 6 & 0x3f | 0x80));
	//  146  276:aload_2         
	//  147  277:lload           8
	//  148  279:iload           5
	//  149  281:bipush          6
	//  150  283:iushr           
	//  151  284:bipush          63
	//  152  286:iand            
	//  153  287:sipush          128
	//  154  290:ior             
	//  155  291:int2byte        
	//  156  292:invokestatic    #72  <Method void zzbek.zza(byte[], long, byte)>
							zzbek.zza(abyte0, l2, (byte)(c & 0x3f | 0x80));
	//  157  295:aload_2         
	//  158  296:lload           10
	//  159  298:iload           5
	//  160  300:bipush          63
	//  161  302:iand            
	//  162  303:sipush          128
	//  163  306:ior             
	//  164  307:int2byte        
	//  165  308:invokestatic    #72  <Method void zzbek.zza(byte[], long, byte)>
							l1 = l2 + 1L;
	//  166  311:lload           10
	//  167  313:lconst_1        
	//  168  314:ladd            
	//  169  315:lstore          8
						} else
	//* 170  317:goto            471
						{
							if(l2 > l3 - 4L)
								break label2;
	//  171  320:lload           10
	//  172  322:lload           12
	//  173  324:ldc2w           #79  <Long 4L>
	//  174  327:lsub            
	//  175  328:lcmp            
	//  176  329:ifgt            495
							j = i + 1;
	//  177  332:iload_3         
	//  178  333:iconst_1        
	//  179  334:iadd            
	//  180  335:istore          4
							if(j == k)
								break;
	//  181  337:iload           4
	//  182  339:iload           7
	//  183  341:icmpeq          482
							char c2 = charsequence.charAt(j);
	//  184  344:aload_1         
	//  185  345:iload           4
	//  186  347:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//  187  352:istore          6
							if(!Character.isSurrogatePair(c, c2))
	//* 188  354:iload           5
	//* 189  356:iload           6
	//* 190  358:invokestatic    #86  <Method boolean Character.isSurrogatePair(char, char)>
	//* 191  361:ifne            370
							{
								i = j;
	//  192  364:iload           4
	//  193  366:istore_3        
								break;
	//  194  367:goto            482
							}
							i = Character.toCodePoint(c, c2);
	//  195  370:iload           5
	//  196  372:iload           6
	//  197  374:invokestatic    #90  <Method int Character.toCodePoint(char, char)>
	//  198  377:istore_3        
							l1 = l2 + 1L;
	//  199  378:lload           10
	//  200  380:lconst_1        
	//  201  381:ladd            
	//  202  382:lstore          8
							zzbek.zza(abyte0, l2, (byte)(0xf0 | i >>> 18));
	//  203  384:aload_2         
	//  204  385:lload           10
	//  205  387:sipush          240
	//  206  390:iload_3         
	//  207  391:bipush          18
	//  208  393:iushr           
	//  209  394:ior             
	//  210  395:int2byte        
	//  211  396:invokestatic    #72  <Method void zzbek.zza(byte[], long, byte)>
							l2 = l1 + 1L;
	//  212  399:lload           8
	//  213  401:lconst_1        
	//  214  402:ladd            
	//  215  403:lstore          10
							zzbek.zza(abyte0, l1, (byte)(i >>> 12 & 0x3f | 0x80));
	//  216  405:aload_2         
	//  217  406:lload           8
	//  218  408:iload_3         
	//  219  409:bipush          12
	//  220  411:iushr           
	//  221  412:bipush          63
	//  222  414:iand            
	//  223  415:sipush          128
	//  224  418:ior             
	//  225  419:int2byte        
	//  226  420:invokestatic    #72  <Method void zzbek.zza(byte[], long, byte)>
							long l5 = l2 + 1L;
	//  227  423:lload           10
	//  228  425:lconst_1        
	//  229  426:ladd            
	//  230  427:lstore          14
							zzbek.zza(abyte0, l2, (byte)(i >>> 6 & 0x3f | 0x80));
	//  231  429:aload_2         
	//  232  430:lload           10
	//  233  432:iload_3         
	//  234  433:bipush          6
	//  235  435:iushr           
	//  236  436:bipush          63
	//  237  438:iand            
	//  238  439:sipush          128
	//  239  442:ior             
	//  240  443:int2byte        
	//  241  444:invokestatic    #72  <Method void zzbek.zza(byte[], long, byte)>
							l1 = l5 + 1L;
	//  242  447:lload           14
	//  243  449:lconst_1        
	//  244  450:ladd            
	//  245  451:lstore          8
							zzbek.zza(abyte0, l5, (byte)(i & 0x3f | 0x80));
	//  246  453:aload_2         
	//  247  454:lload           14
	//  248  456:iload_3         
	//  249  457:bipush          63
	//  250  459:iand            
	//  251  460:sipush          128
	//  252  463:ior             
	//  253  464:int2byte        
	//  254  465:invokestatic    #72  <Method void zzbek.zza(byte[], long, byte)>
							i = j;
	//  255  468:iload           4
	//  256  470:istore_3        
						}
						i++;
	//  257  471:iload_3         
	//  258  472:iconst_1        
	//  259  473:iadd            
	//  260  474:istore_3        
						l2 = l1;
	//  261  475:lload           8
	//  262  477:lstore          10
					} while(true);
	//  263  479:goto            106
					throw new zzbep(i - 1, k);
	//  264  482:new             #92  <Class zzbep>
	//  265  485:dup             
	//  266  486:iload_3         
	//  267  487:iconst_1        
	//  268  488:isub            
	//  269  489:iload           7
	//  270  491:invokespecial   #95  <Method void zzbep(int, int)>
	//  271  494:athrow          
				}
				if('\uD800' <= c && c <= '\uDFFF')
	//* 272  495:ldc1            #75  <Int 55296>
	//* 273  497:iload           5
	//* 274  499:icmpgt          548
	//* 275  502:iload           5
	//* 276  504:ldc1            #76  <Int 57343>
	//* 277  506:icmpgt          548
				{
					j = i + 1;
	//  278  509:iload_3         
	//  279  510:iconst_1        
	//  280  511:iadd            
	//  281  512:istore          4
					if(j == k || !Character.isSurrogatePair(c, charsequence.charAt(j)))
	//* 282  514:iload           4
	//* 283  516:iload           7
	//* 284  518:icmpeq          537
	//* 285  521:iload           5
	//* 286  523:aload_1         
	//* 287  524:iload           4
	//* 288  526:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//* 289  531:invokestatic    #86  <Method boolean Character.isSurrogatePair(char, char)>
	//* 290  534:ifne            548
						throw new zzbep(i, k);
	//  291  537:new             #92  <Class zzbep>
	//  292  540:dup             
	//  293  541:iload_3         
	//  294  542:iload           7
	//  295  544:invokespecial   #95  <Method void zzbep(int, int)>
	//  296  547:athrow          
				}
				charsequence = ((CharSequence) (new StringBuilder(46)));
	//  297  548:new             #97  <Class StringBuilder>
	//  298  551:dup             
	//  299  552:bipush          46
	//  300  554:invokespecial   #100 <Method void StringBuilder(int)>
	//  301  557:astore_1        
				((StringBuilder) (charsequence)).append("Failed writing ");
	//  302  558:aload_1         
	//  303  559:ldc1            #102 <String "Failed writing ">
	//  304  561:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  305  564:pop             
				((StringBuilder) (charsequence)).append(c);
	//  306  565:aload_1         
	//  307  566:iload           5
	//  308  568:invokevirtual   #109 <Method StringBuilder StringBuilder.append(char)>
	//  309  571:pop             
				((StringBuilder) (charsequence)).append(" at index ");
	//  310  572:aload_1         
	//  311  573:ldc1            #111 <String " at index ">
	//  312  575:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  313  578:pop             
				((StringBuilder) (charsequence)).append(l2);
	//  314  579:aload_1         
	//  315  580:lload           10
	//  316  582:invokevirtual   #114 <Method StringBuilder StringBuilder.append(long)>
	//  317  585:pop             
				throw new ArrayIndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
	//  318  586:new             #37  <Class ArrayIndexOutOfBoundsException>
	//  319  589:dup             
	//  320  590:aload_1         
	//  321  591:invokevirtual   #118 <Method String StringBuilder.toString()>
	//  322  594:invokespecial   #56  <Method void ArrayIndexOutOfBoundsException(String)>
	//  323  597:athrow          
			}
			return (int)l2;
	//  324  598:lload           10
	//  325  600:l2i             
	//  326  601:ireturn         
		}
		char c1 = charsequence.charAt(k - 1);
	//  327  602:aload_1         
	//  328  603:iload           7
	//  329  605:iconst_1        
	//  330  606:isub            
	//  331  607:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//  332  612:istore          5
		charsequence = ((CharSequence) (new StringBuilder(37)));
	//  333  614:new             #97  <Class StringBuilder>
	//  334  617:dup             
	//  335  618:bipush          37
	//  336  620:invokespecial   #100 <Method void StringBuilder(int)>
	//  337  623:astore_1        
		((StringBuilder) (charsequence)).append("Failed writing ");
	//  338  624:aload_1         
	//  339  625:ldc1            #102 <String "Failed writing ">
	//  340  627:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  341  630:pop             
		((StringBuilder) (charsequence)).append(c1);
	//  342  631:aload_1         
	//  343  632:iload           5
	//  344  634:invokevirtual   #109 <Method StringBuilder StringBuilder.append(char)>
	//  345  637:pop             
		((StringBuilder) (charsequence)).append(" at index ");
	//  346  638:aload_1         
	//  347  639:ldc1            #111 <String " at index ">
	//  348  641:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  349  644:pop             
		((StringBuilder) (charsequence)).append(i + j);
	//  350  645:aload_1         
	//  351  646:iload_3         
	//  352  647:iload           4
	//  353  649:iadd            
	//  354  650:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//  355  653:pop             
		throw new ArrayIndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
	//  356  654:new             #37  <Class ArrayIndexOutOfBoundsException>
	//  357  657:dup             
	//  358  658:aload_1         
	//  359  659:invokevirtual   #118 <Method String StringBuilder.toString()>
	//  360  662:invokespecial   #56  <Method void ArrayIndexOutOfBoundsException(String)>
	//  361  665:athrow          
	}
}
