// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;


public class Base64
{

	public Base64()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method void Object()>
	//    2    4:return          
	}

	public static final String decode(String s)
	{
		return new String(decode(s.getBytes()));
	//    0    0:new             #92  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #96  <Method byte[] String.getBytes()>
	//    4    8:invokestatic    #99  <Method byte[] decode(byte[])>
	//    5   11:invokespecial   #102 <Method void String(byte[])>
	//    6   14:areturn         
	}

	public static final byte[] decode(byte abyte0[])
		throws IllegalArgumentException
	{
		int i;
		int k;
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		k = 0;
	//    2    2:iconst_0        
	//    3    3:istore_3        
_L2:
		byte byte0;
		int i1;
		i1 = i;
	//    4    4:iload_2         
	//    5    5:istore          4
		if(k >= abyte0.length)
			break MISSING_BLOCK_LABEL_55;
	//    6    7:iload_3         
	//    7    8:aload_0         
	//    8    9:arraylength     
	//    9   10:icmpge          55
		byte0 = ascii[abyte0[k]];
	//   10   13:getstatic       #84  <Field byte[] ascii>
	//   11   16:aload_0         
	//   12   17:iload_3         
	//   13   18:baload          
	//   14   19:baload          
	//   15   20:istore_1        
		if(byte0 < 0)
			break; /* Loop/switch isn't completed */
	//   16   21:iload_1         
	//   17   22:iflt            40
		abyte0[i] = byte0;
	//   18   25:aload_0         
	//   19   26:iload_2         
	//   20   27:iload_1         
	//   21   28:bastore         
		i++;
	//   22   29:iload_2         
	//   23   30:iconst_1        
	//   24   31:iadd            
	//   25   32:istore_2        
_L4:
		k++;
	//   26   33:iload_3         
	//   27   34:iconst_1        
	//   28   35:iadd            
	//   29   36:istore_3        
		if(true) goto _L2; else goto _L1
	//   30   37:goto            4
_L1:
		if(byte0 != -1) goto _L4; else goto _L3
	//   31   40:iload_1         
	//   32   41:iconst_m1       
	//   33   42:icmpne          33
_L3:
		throw new IllegalArgumentException("Invalid base 64 string");
	//   34   45:new             #104 <Class IllegalArgumentException>
	//   35   48:dup             
	//   36   49:ldc1            #106 <String "Invalid base 64 string">
	//   37   51:invokespecial   #109 <Method void IllegalArgumentException(String)>
	//   38   54:athrow          
		for(; i1 > 0 && abyte0[i1 - 1] == -3; i1--);
	//   39   55:iload           4
	//   40   57:ifle            80
	//   41   60:aload_0         
	//   42   61:iload           4
	//   43   63:iconst_1        
	//   44   64:isub            
	//   45   65:baload          
	//   46   66:bipush          -3
	//   47   68:icmpne          80
	//   48   71:iload           4
	//   49   73:iconst_1        
	//   50   74:isub            
	//   51   75:istore          4
	//*  52   77:goto            55
		byte abyte1[] = new byte[(i1 * 3) / 4];
	//   53   80:iload           4
	//   54   82:iconst_3        
	//   55   83:imul            
	//   56   84:iconst_4        
	//   57   85:idiv            
	//   58   86:newarray        byte[]
	//   59   88:astore          5
		int j = 0;
	//   60   90:iconst_0        
	//   61   91:istore_2        
		int l;
		for(l = 0; l < abyte1.length - 2; l += 3)
	//*  62   92:iconst_0        
	//*  63   93:istore_3        
	//*  64   94:iload_3         
	//*  65   95:aload           5
	//*  66   97:arraylength     
	//*  67   98:iconst_2        
	//*  68   99:isub            
	//*  69  100:icmpge          195
		{
			abyte1[l] = (byte)(abyte0[j] << 2 & 0xff | abyte0[j + 1] >>> 4 & 3);
	//   70  103:aload           5
	//   71  105:iload_3         
	//   72  106:aload_0         
	//   73  107:iload_2         
	//   74  108:baload          
	//   75  109:iconst_2        
	//   76  110:ishl            
	//   77  111:sipush          255
	//   78  114:iand            
	//   79  115:aload_0         
	//   80  116:iload_2         
	//   81  117:iconst_1        
	//   82  118:iadd            
	//   83  119:baload          
	//   84  120:iconst_4        
	//   85  121:iushr           
	//   86  122:iconst_3        
	//   87  123:iand            
	//   88  124:ior             
	//   89  125:int2byte        
	//   90  126:bastore         
			abyte1[l + 1] = (byte)(abyte0[j + 1] << 4 & 0xff | abyte0[j + 2] >>> 2 & 0xf);
	//   91  127:aload           5
	//   92  129:iload_3         
	//   93  130:iconst_1        
	//   94  131:iadd            
	//   95  132:aload_0         
	//   96  133:iload_2         
	//   97  134:iconst_1        
	//   98  135:iadd            
	//   99  136:baload          
	//  100  137:iconst_4        
	//  101  138:ishl            
	//  102  139:sipush          255
	//  103  142:iand            
	//  104  143:aload_0         
	//  105  144:iload_2         
	//  106  145:iconst_2        
	//  107  146:iadd            
	//  108  147:baload          
	//  109  148:iconst_2        
	//  110  149:iushr           
	//  111  150:bipush          15
	//  112  152:iand            
	//  113  153:ior             
	//  114  154:int2byte        
	//  115  155:bastore         
			abyte1[l + 2] = (byte)(abyte0[j + 2] << 6 & 0xff | abyte0[j + 3] & 0x3f);
	//  116  156:aload           5
	//  117  158:iload_3         
	//  118  159:iconst_2        
	//  119  160:iadd            
	//  120  161:aload_0         
	//  121  162:iload_2         
	//  122  163:iconst_2        
	//  123  164:iadd            
	//  124  165:baload          
	//  125  166:bipush          6
	//  126  168:ishl            
	//  127  169:sipush          255
	//  128  172:iand            
	//  129  173:aload_0         
	//  130  174:iload_2         
	//  131  175:iconst_3        
	//  132  176:iadd            
	//  133  177:baload          
	//  134  178:bipush          63
	//  135  180:iand            
	//  136  181:ior             
	//  137  182:int2byte        
	//  138  183:bastore         
			j += 4;
	//  139  184:iload_2         
	//  140  185:iconst_4        
	//  141  186:iadd            
	//  142  187:istore_2        
		}

	//  143  188:iload_3         
	//  144  189:iconst_3        
	//  145  190:iadd            
	//  146  191:istore_3        
	//* 147  192:goto            94
		if(l < abyte1.length)
	//* 148  195:iload_3         
	//* 149  196:aload           5
	//* 150  198:arraylength     
	//* 151  199:icmpge          226
			abyte1[l] = (byte)(abyte0[j] << 2 & 0xff | abyte0[j + 1] >>> 4 & 3);
	//  152  202:aload           5
	//  153  204:iload_3         
	//  154  205:aload_0         
	//  155  206:iload_2         
	//  156  207:baload          
	//  157  208:iconst_2        
	//  158  209:ishl            
	//  159  210:sipush          255
	//  160  213:iand            
	//  161  214:aload_0         
	//  162  215:iload_2         
	//  163  216:iconst_1        
	//  164  217:iadd            
	//  165  218:baload          
	//  166  219:iconst_4        
	//  167  220:iushr           
	//  168  221:iconst_3        
	//  169  222:iand            
	//  170  223:ior             
	//  171  224:int2byte        
	//  172  225:bastore         
		l++;
	//  173  226:iload_3         
	//  174  227:iconst_1        
	//  175  228:iadd            
	//  176  229:istore_3        
		if(l < abyte1.length)
	//* 177  230:iload_3         
	//* 178  231:aload           5
	//* 179  233:arraylength     
	//* 180  234:icmpge          264
			abyte1[l] = (byte)(abyte0[j + 1] << 4 & 0xff | abyte0[j + 2] >>> 2 & 0xf);
	//  181  237:aload           5
	//  182  239:iload_3         
	//  183  240:aload_0         
	//  184  241:iload_2         
	//  185  242:iconst_1        
	//  186  243:iadd            
	//  187  244:baload          
	//  188  245:iconst_4        
	//  189  246:ishl            
	//  190  247:sipush          255
	//  191  250:iand            
	//  192  251:aload_0         
	//  193  252:iload_2         
	//  194  253:iconst_2        
	//  195  254:iadd            
	//  196  255:baload          
	//  197  256:iconst_2        
	//  198  257:iushr           
	//  199  258:bipush          15
	//  200  260:iand            
	//  201  261:ior             
	//  202  262:int2byte        
	//  203  263:bastore         
		return abyte1;
	//  204  264:aload           5
	//  205  266:areturn         
	}

	public static final String encode(String s)
	{
		return new String(encode(s.getBytes()));
	//    0    0:new             #92  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #96  <Method byte[] String.getBytes()>
	//    4    8:invokestatic    #113 <Method byte[] encode(byte[])>
	//    5   11:invokespecial   #102 <Method void String(byte[])>
	//    6   14:areturn         
	}

	public static final byte[] encode(byte abyte0[])
	{
		return encode(abyte0, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #116 <Method byte[] encode(byte[], int)>
	//    3    5:areturn         
	}

	public static final byte[] encode(byte abyte0[], int i)
	{
		i = (i / 4) * 4;
	//    0    0:iload_1         
	//    1    1:iconst_4        
	//    2    2:idiv            
	//    3    3:iconst_4        
	//    4    4:imul            
	//    5    5:istore_1        
		int k = i;
	//    6    6:iload_1         
	//    7    7:istore_3        
		if(i < 0)
	//*   8    8:iload_1         
	//*   9    9:ifge            14
			k = 0;
	//   10   12:iconst_0        
	//   11   13:istore_3        
		i = ((abyte0.length + 2) / 3) * 4;
	//   12   14:aload_0         
	//   13   15:arraylength     
	//   14   16:iconst_2        
	//   15   17:iadd            
	//   16   18:iconst_3        
	//   17   19:idiv            
	//   18   20:iconst_4        
	//   19   21:imul            
	//   20   22:istore_1        
		int j1 = i;
	//   21   23:iload_1         
	//   22   24:istore          4
		if(k > 0)
	//*  23   26:iload_3         
	//*  24   27:ifle            39
			j1 = i + (i - 1) / k;
	//   25   30:iload_1         
	//   26   31:iload_1         
	//   27   32:iconst_1        
	//   28   33:isub            
	//   29   34:iload_3         
	//   30   35:idiv            
	//   31   36:iadd            
	//   32   37:istore          4
		byte abyte1[] = new byte[j1];
	//   33   39:iload           4
	//   34   41:newarray        byte[]
	//   35   43:astore          9
		i = 0;
	//   36   45:iconst_0        
	//   37   46:istore_1        
		int j = 0;
	//   38   47:iconst_0        
	//   39   48:istore_2        
		int k1 = 0;
	//   40   49:iconst_0        
	//   41   50:istore          5
		do
		{
			if(j + 3 > abyte0.length)
				break;
	//   42   52:iload_2         
	//   43   53:iconst_3        
	//   44   54:iadd            
	//   45   55:aload_0         
	//   46   56:arraylength     
	//   47   57:icmpgt          239
			int j2 = j + 1;
	//   48   60:iload_2         
	//   49   61:iconst_1        
	//   50   62:iadd            
	//   51   63:istore          8
			int l1 = ((int) (abyte0[j]));
	//   52   65:aload_0         
	//   53   66:iload_2         
	//   54   67:baload          
	//   55   68:istore          6
			int i2 = j2 + 1;
	//   56   70:iload           8
	//   57   72:iconst_1        
	//   58   73:iadd            
	//   59   74:istore          7
			j2 = ((int) (abyte0[j2]));
	//   60   76:aload_0         
	//   61   77:iload           8
	//   62   79:baload          
	//   63   80:istore          8
			j = i2 + 1;
	//   64   82:iload           7
	//   65   84:iconst_1        
	//   66   85:iadd            
	//   67   86:istore_2        
			l1 = (l1 & 0xff) << 16 | (j2 & 0xff) << 8 | (abyte0[i2] & 0xff) << 0;
	//   68   87:iload           6
	//   69   89:sipush          255
	//   70   92:iand            
	//   71   93:bipush          16
	//   72   95:ishl            
	//   73   96:iload           8
	//   74   98:sipush          255
	//   75  101:iand            
	//   76  102:bipush          8
	//   77  104:ishl            
	//   78  105:ior             
	//   79  106:aload_0         
	//   80  107:iload           7
	//   81  109:baload          
	//   82  110:sipush          255
	//   83  113:iand            
	//   84  114:iconst_0        
	//   85  115:ishl            
	//   86  116:ior             
	//   87  117:istore          6
			i2 = i + 1;
	//   88  119:iload_1         
	//   89  120:iconst_1        
	//   90  121:iadd            
	//   91  122:istore          7
			abyte1[i] = base64[(l1 & 0xfc0000) >> 18];
	//   92  124:aload           9
	//   93  126:iload_1         
	//   94  127:getstatic       #82  <Field byte[] base64>
	//   95  130:iload           6
	//   96  132:ldc1            #117 <Int 0xfc0000>
	//   97  134:iand            
	//   98  135:bipush          18
	//   99  137:ishr            
	//  100  138:baload          
	//  101  139:bastore         
			i = i2 + 1;
	//  102  140:iload           7
	//  103  142:iconst_1        
	//  104  143:iadd            
	//  105  144:istore_1        
			abyte1[i2] = base64[(l1 & 0x3f000) >> 12];
	//  106  145:aload           9
	//  107  147:iload           7
	//  108  149:getstatic       #82  <Field byte[] base64>
	//  109  152:iload           6
	//  110  154:ldc1            #118 <Int 0x3f000>
	//  111  156:iand            
	//  112  157:bipush          12
	//  113  159:ishr            
	//  114  160:baload          
	//  115  161:bastore         
			i2 = i + 1;
	//  116  162:iload_1         
	//  117  163:iconst_1        
	//  118  164:iadd            
	//  119  165:istore          7
			abyte1[i] = base64[(l1 & 0xfc0) >> 6];
	//  120  167:aload           9
	//  121  169:iload_1         
	//  122  170:getstatic       #82  <Field byte[] base64>
	//  123  173:iload           6
	//  124  175:sipush          4032
	//  125  178:iand            
	//  126  179:bipush          6
	//  127  181:ishr            
	//  128  182:baload          
	//  129  183:bastore         
			i = i2 + 1;
	//  130  184:iload           7
	//  131  186:iconst_1        
	//  132  187:iadd            
	//  133  188:istore_1        
			abyte1[i2] = base64[l1 & 0x3f];
	//  134  189:aload           9
	//  135  191:iload           7
	//  136  193:getstatic       #82  <Field byte[] base64>
	//  137  196:iload           6
	//  138  198:bipush          63
	//  139  200:iand            
	//  140  201:baload          
	//  141  202:bastore         
			k1 += 4;
	//  142  203:iload           5
	//  143  205:iconst_4        
	//  144  206:iadd            
	//  145  207:istore          5
			if(i < j1 && k > 0 && k1 % k == 0)
	//* 146  209:iload_1         
	//* 147  210:iload           4
	//* 148  212:icmpge          414
	//* 149  215:iload_3         
	//* 150  216:ifle            414
	//* 151  219:iload           5
	//* 152  221:iload_3         
	//* 153  222:irem            
	//* 154  223:ifne            414
			{
				abyte1[i] = 10;
	//  155  226:aload           9
	//  156  228:iload_1         
	//  157  229:bipush          10
	//  158  231:bastore         
				i++;
	//  159  232:iload_1         
	//  160  233:iconst_1        
	//  161  234:iadd            
	//  162  235:istore_1        
			}
		} while(true);
	//  163  236:goto            52
		if(abyte0.length - j == 2)
	//* 164  239:aload_0         
	//* 165  240:arraylength     
	//* 166  241:iload_2         
	//* 167  242:isub            
	//* 168  243:iconst_2        
	//* 169  244:icmpne          338
		{
			j = (abyte0[j] & 0xff) << 16 | (abyte0[j + 1] & 0xff) << 8;
	//  170  247:aload_0         
	//  171  248:iload_2         
	//  172  249:baload          
	//  173  250:sipush          255
	//  174  253:iand            
	//  175  254:bipush          16
	//  176  256:ishl            
	//  177  257:aload_0         
	//  178  258:iload_2         
	//  179  259:iconst_1        
	//  180  260:iadd            
	//  181  261:baload          
	//  182  262:sipush          255
	//  183  265:iand            
	//  184  266:bipush          8
	//  185  268:ishl            
	//  186  269:ior             
	//  187  270:istore_2        
			int l = i + 1;
	//  188  271:iload_1         
	//  189  272:iconst_1        
	//  190  273:iadd            
	//  191  274:istore_3        
			abyte1[i] = base64[(j & 0xfc0000) >> 18];
	//  192  275:aload           9
	//  193  277:iload_1         
	//  194  278:getstatic       #82  <Field byte[] base64>
	//  195  281:iload_2         
	//  196  282:ldc1            #117 <Int 0xfc0000>
	//  197  284:iand            
	//  198  285:bipush          18
	//  199  287:ishr            
	//  200  288:baload          
	//  201  289:bastore         
			i = l + 1;
	//  202  290:iload_3         
	//  203  291:iconst_1        
	//  204  292:iadd            
	//  205  293:istore_1        
			abyte1[l] = base64[(j & 0x3f000) >> 12];
	//  206  294:aload           9
	//  207  296:iload_3         
	//  208  297:getstatic       #82  <Field byte[] base64>
	//  209  300:iload_2         
	//  210  301:ldc1            #118 <Int 0x3f000>
	//  211  303:iand            
	//  212  304:bipush          12
	//  213  306:ishr            
	//  214  307:baload          
	//  215  308:bastore         
			l = i + 1;
	//  216  309:iload_1         
	//  217  310:iconst_1        
	//  218  311:iadd            
	//  219  312:istore_3        
			abyte1[i] = base64[(j & 0xfc0) >> 6];
	//  220  313:aload           9
	//  221  315:iload_1         
	//  222  316:getstatic       #82  <Field byte[] base64>
	//  223  319:iload_2         
	//  224  320:sipush          4032
	//  225  323:iand            
	//  226  324:bipush          6
	//  227  326:ishr            
	//  228  327:baload          
	//  229  328:bastore         
			abyte1[l] = 61;
	//  230  329:aload           9
	//  231  331:iload_3         
	//  232  332:bipush          61
	//  233  334:bastore         
		} else
	//* 234  335:aload           9
	//* 235  337:areturn         
		if(abyte0.length - j == 1)
	//* 236  338:aload_0         
	//* 237  339:arraylength     
	//* 238  340:iload_2         
	//* 239  341:isub            
	//* 240  342:iconst_1        
	//* 241  343:icmpne          335
		{
			j = (abyte0[j] & 0xff) << 16;
	//  242  346:aload_0         
	//  243  347:iload_2         
	//  244  348:baload          
	//  245  349:sipush          255
	//  246  352:iand            
	//  247  353:bipush          16
	//  248  355:ishl            
	//  249  356:istore_2        
			int i1 = i + 1;
	//  250  357:iload_1         
	//  251  358:iconst_1        
	//  252  359:iadd            
	//  253  360:istore_3        
			abyte1[i] = base64[(j & 0xfc0000) >> 18];
	//  254  361:aload           9
	//  255  363:iload_1         
	//  256  364:getstatic       #82  <Field byte[] base64>
	//  257  367:iload_2         
	//  258  368:ldc1            #117 <Int 0xfc0000>
	//  259  370:iand            
	//  260  371:bipush          18
	//  261  373:ishr            
	//  262  374:baload          
	//  263  375:bastore         
			i = i1 + 1;
	//  264  376:iload_3         
	//  265  377:iconst_1        
	//  266  378:iadd            
	//  267  379:istore_1        
			abyte1[i1] = base64[(j & 0x3f000) >> 12];
	//  268  380:aload           9
	//  269  382:iload_3         
	//  270  383:getstatic       #82  <Field byte[] base64>
	//  271  386:iload_2         
	//  272  387:ldc1            #118 <Int 0x3f000>
	//  273  389:iand            
	//  274  390:bipush          12
	//  275  392:ishr            
	//  276  393:baload          
	//  277  394:bastore         
			j = i + 1;
	//  278  395:iload_1         
	//  279  396:iconst_1        
	//  280  397:iadd            
	//  281  398:istore_2        
			abyte1[i] = 61;
	//  282  399:aload           9
	//  283  401:iload_1         
	//  284  402:bipush          61
	//  285  404:bastore         
			abyte1[j] = 61;
	//  286  405:aload           9
	//  287  407:iload_2         
	//  288  408:bipush          61
	//  289  410:bastore         
			return abyte1;
	//  290  411:aload           9
	//  291  413:areturn         
		}
		return abyte1;
	//* 292  414:goto            52
	}

	private static final byte EQUAL = -3;
	private static final byte INVALID = -1;
	private static final byte WHITESPACE = -2;
	private static byte ascii[];
	private static byte base64[] = {
		65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
		75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
		85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
		101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
		111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
		121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
		56, 57, 43, 47
	};

	static 
	{
	//    0    0:bipush          64
	//    1    2:newarray        byte[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #17  <Int 65>
	//    5    8:bastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #18  <Int 66>
	//    9   13:bastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #19  <Int 67>
	//   13   18:bastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #20  <Int 68>
	//   17   23:bastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #21  <Int 69>
	//   21   28:bastore         
	//   22   29:dup             
	//   23   30:iconst_5        
	//   24   31:ldc1            #22  <Int 70>
	//   25   33:bastore         
	//   26   34:dup             
	//   27   35:bipush          6
	//   28   37:ldc1            #23  <Int 71>
	//   29   39:bastore         
	//   30   40:dup             
	//   31   41:bipush          7
	//   32   43:ldc1            #24  <Int 72>
	//   33   45:bastore         
	//   34   46:dup             
	//   35   47:bipush          8
	//   36   49:ldc1            #25  <Int 73>
	//   37   51:bastore         
	//   38   52:dup             
	//   39   53:bipush          9
	//   40   55:ldc1            #26  <Int 74>
	//   41   57:bastore         
	//   42   58:dup             
	//   43   59:bipush          10
	//   44   61:ldc1            #27  <Int 75>
	//   45   63:bastore         
	//   46   64:dup             
	//   47   65:bipush          11
	//   48   67:ldc1            #28  <Int 76>
	//   49   69:bastore         
	//   50   70:dup             
	//   51   71:bipush          12
	//   52   73:ldc1            #29  <Int 77>
	//   53   75:bastore         
	//   54   76:dup             
	//   55   77:bipush          13
	//   56   79:ldc1            #30  <Int 78>
	//   57   81:bastore         
	//   58   82:dup             
	//   59   83:bipush          14
	//   60   85:ldc1            #31  <Int 79>
	//   61   87:bastore         
	//   62   88:dup             
	//   63   89:bipush          15
	//   64   91:ldc1            #32  <Int 80>
	//   65   93:bastore         
	//   66   94:dup             
	//   67   95:bipush          16
	//   68   97:ldc1            #33  <Int 81>
	//   69   99:bastore         
	//   70  100:dup             
	//   71  101:bipush          17
	//   72  103:ldc1            #34  <Int 82>
	//   73  105:bastore         
	//   74  106:dup             
	//   75  107:bipush          18
	//   76  109:ldc1            #35  <Int 83>
	//   77  111:bastore         
	//   78  112:dup             
	//   79  113:bipush          19
	//   80  115:ldc1            #36  <Int 84>
	//   81  117:bastore         
	//   82  118:dup             
	//   83  119:bipush          20
	//   84  121:ldc1            #37  <Int 85>
	//   85  123:bastore         
	//   86  124:dup             
	//   87  125:bipush          21
	//   88  127:ldc1            #38  <Int 86>
	//   89  129:bastore         
	//   90  130:dup             
	//   91  131:bipush          22
	//   92  133:ldc1            #39  <Int 87>
	//   93  135:bastore         
	//   94  136:dup             
	//   95  137:bipush          23
	//   96  139:ldc1            #40  <Int 88>
	//   97  141:bastore         
	//   98  142:dup             
	//   99  143:bipush          24
	//  100  145:ldc1            #41  <Int 89>
	//  101  147:bastore         
	//  102  148:dup             
	//  103  149:bipush          25
	//  104  151:ldc1            #42  <Int 90>
	//  105  153:bastore         
	//  106  154:dup             
	//  107  155:bipush          26
	//  108  157:ldc1            #43  <Int 97>
	//  109  159:bastore         
	//  110  160:dup             
	//  111  161:bipush          27
	//  112  163:ldc1            #44  <Int 98>
	//  113  165:bastore         
	//  114  166:dup             
	//  115  167:bipush          28
	//  116  169:ldc1            #45  <Int 99>
	//  117  171:bastore         
	//  118  172:dup             
	//  119  173:bipush          29
	//  120  175:ldc1            #46  <Int 100>
	//  121  177:bastore         
	//  122  178:dup             
	//  123  179:bipush          30
	//  124  181:ldc1            #47  <Int 101>
	//  125  183:bastore         
	//  126  184:dup             
	//  127  185:bipush          31
	//  128  187:ldc1            #48  <Int 102>
	//  129  189:bastore         
	//  130  190:dup             
	//  131  191:bipush          32
	//  132  193:ldc1            #49  <Int 103>
	//  133  195:bastore         
	//  134  196:dup             
	//  135  197:bipush          33
	//  136  199:ldc1            #50  <Int 104>
	//  137  201:bastore         
	//  138  202:dup             
	//  139  203:bipush          34
	//  140  205:ldc1            #51  <Int 105>
	//  141  207:bastore         
	//  142  208:dup             
	//  143  209:bipush          35
	//  144  211:ldc1            #52  <Int 106>
	//  145  213:bastore         
	//  146  214:dup             
	//  147  215:bipush          36
	//  148  217:ldc1            #53  <Int 107>
	//  149  219:bastore         
	//  150  220:dup             
	//  151  221:bipush          37
	//  152  223:ldc1            #54  <Int 108>
	//  153  225:bastore         
	//  154  226:dup             
	//  155  227:bipush          38
	//  156  229:ldc1            #55  <Int 109>
	//  157  231:bastore         
	//  158  232:dup             
	//  159  233:bipush          39
	//  160  235:ldc1            #56  <Int 110>
	//  161  237:bastore         
	//  162  238:dup             
	//  163  239:bipush          40
	//  164  241:ldc1            #57  <Int 111>
	//  165  243:bastore         
	//  166  244:dup             
	//  167  245:bipush          41
	//  168  247:ldc1            #58  <Int 112>
	//  169  249:bastore         
	//  170  250:dup             
	//  171  251:bipush          42
	//  172  253:ldc1            #59  <Int 113>
	//  173  255:bastore         
	//  174  256:dup             
	//  175  257:bipush          43
	//  176  259:ldc1            #60  <Int 114>
	//  177  261:bastore         
	//  178  262:dup             
	//  179  263:bipush          44
	//  180  265:ldc1            #61  <Int 115>
	//  181  267:bastore         
	//  182  268:dup             
	//  183  269:bipush          45
	//  184  271:ldc1            #62  <Int 116>
	//  185  273:bastore         
	//  186  274:dup             
	//  187  275:bipush          46
	//  188  277:ldc1            #63  <Int 117>
	//  189  279:bastore         
	//  190  280:dup             
	//  191  281:bipush          47
	//  192  283:ldc1            #64  <Int 118>
	//  193  285:bastore         
	//  194  286:dup             
	//  195  287:bipush          48
	//  196  289:ldc1            #65  <Int 119>
	//  197  291:bastore         
	//  198  292:dup             
	//  199  293:bipush          49
	//  200  295:ldc1            #66  <Int 120>
	//  201  297:bastore         
	//  202  298:dup             
	//  203  299:bipush          50
	//  204  301:ldc1            #67  <Int 121>
	//  205  303:bastore         
	//  206  304:dup             
	//  207  305:bipush          51
	//  208  307:ldc1            #68  <Int 122>
	//  209  309:bastore         
	//  210  310:dup             
	//  211  311:bipush          52
	//  212  313:ldc1            #69  <Int 48>
	//  213  315:bastore         
	//  214  316:dup             
	//  215  317:bipush          53
	//  216  319:ldc1            #70  <Int 49>
	//  217  321:bastore         
	//  218  322:dup             
	//  219  323:bipush          54
	//  220  325:ldc1            #71  <Int 50>
	//  221  327:bastore         
	//  222  328:dup             
	//  223  329:bipush          55
	//  224  331:ldc1            #72  <Int 51>
	//  225  333:bastore         
	//  226  334:dup             
	//  227  335:bipush          56
	//  228  337:ldc1            #73  <Int 52>
	//  229  339:bastore         
	//  230  340:dup             
	//  231  341:bipush          57
	//  232  343:ldc1            #74  <Int 53>
	//  233  345:bastore         
	//  234  346:dup             
	//  235  347:bipush          58
	//  236  349:ldc1            #75  <Int 54>
	//  237  351:bastore         
	//  238  352:dup             
	//  239  353:bipush          59
	//  240  355:ldc1            #76  <Int 55>
	//  241  357:bastore         
	//  242  358:dup             
	//  243  359:bipush          60
	//  244  361:ldc1            #77  <Int 56>
	//  245  363:bastore         
	//  246  364:dup             
	//  247  365:bipush          61
	//  248  367:ldc1            #78  <Int 57>
	//  249  369:bastore         
	//  250  370:dup             
	//  251  371:bipush          62
	//  252  373:ldc1            #79  <Int 43>
	//  253  375:bastore         
	//  254  376:dup             
	//  255  377:bipush          63
	//  256  379:ldc1            #80  <Int 47>
	//  257  381:bastore         
	//  258  382:putstatic       #82  <Field byte[] base64>
		ascii = new byte[255];
	//  259  385:sipush          255
	//  260  388:newarray        byte[]
	//  261  390:putstatic       #84  <Field byte[] ascii>
		for(int i = 0; i < 255; i++)
	//* 262  393:iconst_0        
	//* 263  394:istore_0        
	//* 264  395:iload_0         
	//* 265  396:sipush          255
	//* 266  399:icmpge          415
			ascii[i] = -1;
	//  267  402:getstatic       #84  <Field byte[] ascii>
	//  268  405:iload_0         
	//  269  406:iconst_m1       
	//  270  407:bastore         

	//  271  408:iload_0         
	//  272  409:iconst_1        
	//  273  410:iadd            
	//  274  411:istore_0        
	//* 275  412:goto            395
		for(int j = 0; j < base64.length; j++)
	//* 276  415:iconst_0        
	//* 277  416:istore_0        
	//* 278  417:iload_0         
	//* 279  418:getstatic       #82  <Field byte[] base64>
	//* 280  421:arraylength     
	//* 281  422:icmpge          443
			ascii[base64[j]] = (byte)j;
	//  282  425:getstatic       #84  <Field byte[] ascii>
	//  283  428:getstatic       #82  <Field byte[] base64>
	//  284  431:iload_0         
	//  285  432:baload          
	//  286  433:iload_0         
	//  287  434:int2byte        
	//  288  435:bastore         

	//  289  436:iload_0         
	//  290  437:iconst_1        
	//  291  438:iadd            
	//  292  439:istore_0        
	//* 293  440:goto            417
		ascii[9] = -2;
	//  294  443:getstatic       #84  <Field byte[] ascii>
	//  295  446:bipush          9
	//  296  448:bipush          -2
	//  297  450:bastore         
		ascii[10] = -2;
	//  298  451:getstatic       #84  <Field byte[] ascii>
	//  299  454:bipush          10
	//  300  456:bipush          -2
	//  301  458:bastore         
		ascii[13] = -2;
	//  302  459:getstatic       #84  <Field byte[] ascii>
	//  303  462:bipush          13
	//  304  464:bipush          -2
	//  305  466:bastore         
		ascii[32] = -2;
	//  306  467:getstatic       #84  <Field byte[] ascii>
	//  307  470:bipush          32
	//  308  472:bipush          -2
	//  309  474:bastore         
		ascii[61] = -3;
	//  310  475:getstatic       #84  <Field byte[] ascii>
	//  311  478:bipush          61
	//  312  480:bipush          -3
	//  313  482:bastore         
	//* 314  483:return          
	}
}
