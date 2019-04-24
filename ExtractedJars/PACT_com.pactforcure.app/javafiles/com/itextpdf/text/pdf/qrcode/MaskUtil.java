// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.qrcode;


// Referenced classes of package com.itextpdf.text.pdf.qrcode:
//			ByteMatrix, QRCode

public final class MaskUtil
{

	private MaskUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static int applyMaskPenaltyRule1(ByteMatrix bytematrix)
	{
		return applyMaskPenaltyRule1Internal(bytematrix, true) + applyMaskPenaltyRule1Internal(bytematrix, false);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #15  <Method int applyMaskPenaltyRule1Internal(ByteMatrix, boolean)>
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokestatic    #15  <Method int applyMaskPenaltyRule1Internal(ByteMatrix, boolean)>
	//    6   10:iadd            
	//    7   11:ireturn         
	}

	private static int applyMaskPenaltyRule1Internal(ByteMatrix bytematrix, boolean flag)
	{
		int j1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          8
		byte byte0 = -1;
	//    2    3:iconst_m1       
	//    3    4:istore          7
		int k;
		int l;
		int i1;
		if(flag)
	//*   4    6:iload_1         
	//*   5    7:ifeq            115
			k = bytematrix.getHeight();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #21  <Method int ByteMatrix.getHeight()>
	//    8   14:istore          4
		else
	//*   9   16:iload_1         
	//*  10   17:ifeq            124
	//*  11   20:aload_0         
	//*  12   21:invokevirtual   #24  <Method int ByteMatrix.getWidth()>
	//*  13   24:istore          5
	//*  14   26:aload_0         
	//*  15   27:invokevirtual   #28  <Method byte[][] ByteMatrix.getArray()>
	//*  16   30:astore_0        
	//*  17   31:iconst_0        
	//*  18   32:istore          6
	//*  19   34:iconst_0        
	//*  20   35:istore          10
	//*  21   37:iload           6
	//*  22   39:iload           4
	//*  23   41:icmpge          197
	//*  24   44:iconst_0        
	//*  25   45:istore          9
	//*  26   47:iload           9
	//*  27   49:iload           5
	//*  28   51:icmpge          188
	//*  29   54:iload_1         
	//*  30   55:ifeq            133
	//*  31   58:aload_0         
	//*  32   59:iload           6
	//*  33   61:aaload          
	//*  34   62:iload           9
	//*  35   64:iaload          
	//*  36   65:istore_2        
	//*  37   66:iload_2         
	//*  38   67:iload           7
	//*  39   69:icmpne          175
	//*  40   72:iload           10
	//*  41   74:iconst_1        
	//*  42   75:iadd            
	//*  43   76:istore          10
	//*  44   78:iload           10
	//*  45   80:iconst_5        
	//*  46   81:icmpne          144
	//*  47   84:iload           8
	//*  48   86:iconst_3        
	//*  49   87:iadd            
	//*  50   88:istore_3        
	//*  51   89:iload           7
	//*  52   91:istore          11
	//*  53   93:iload           10
	//*  54   95:istore_2        
	//*  55   96:iload           9
	//*  56   98:iconst_1        
	//*  57   99:iadd            
	//*  58  100:istore          9
	//*  59  102:iload_2         
	//*  60  103:istore          10
	//*  61  105:iload_3         
	//*  62  106:istore          8
	//*  63  108:iload           11
	//*  64  110:istore          7
	//*  65  112:goto            47
			k = bytematrix.getWidth();
	//   66  115:aload_0         
	//   67  116:invokevirtual   #24  <Method int ByteMatrix.getWidth()>
	//   68  119:istore          4
		if(flag)
			l = bytematrix.getWidth();
		else
	//*  69  121:goto            16
			l = bytematrix.getHeight();
	//   70  124:aload_0         
	//   71  125:invokevirtual   #21  <Method int ByteMatrix.getHeight()>
	//   72  128:istore          5
		bytematrix = ((ByteMatrix) (bytematrix.getArray()));
		i1 = 0;
		do
		{
			int l1 = 0;
			if(i1 >= k)
				break;
			int k1 = 0;
			while(k1 < l) 
			{
				int i;
				int j;
				int i2;
				if(flag)
					i = bytematrix[i1][k1];
				else
	//*  73  130:goto            26
					i = bytematrix[k1][i1];
	//   74  133:aload_0         
	//   75  134:iload           9
	//   76  136:aaload          
	//   77  137:iload           6
	//   78  139:iaload          
	//   79  140:istore_2        
				if(i == byte0)
				{
					l1++;
					if(l1 == 5)
					{
						j = j1 + 3;
						i2 = ((int) (byte0));
						i = l1;
					} else
	//*  80  141:goto            66
					{
						i = l1;
	//   81  144:iload           10
	//   82  146:istore_2        
						j = j1;
	//   83  147:iload           8
	//   84  149:istore_3        
						i2 = ((int) (byte0));
	//   85  150:iload           7
	//   86  152:istore          11
						if(l1 > 5)
	//*  87  154:iload           10
	//*  88  156:iconst_5        
	//*  89  157:icmple          96
						{
							j = j1 + 1;
	//   90  160:iload           8
	//   91  162:iconst_1        
	//   92  163:iadd            
	//   93  164:istore_3        
							i = l1;
	//   94  165:iload           10
	//   95  167:istore_2        
							i2 = ((int) (byte0));
	//   96  168:iload           7
	//   97  170:istore          11
						}
					}
				} else
	//*  98  172:goto            96
				{
					j = 1;
	//   99  175:iconst_1        
	//  100  176:istore_3        
					i2 = i;
	//  101  177:iload_2         
	//  102  178:istore          11
					i = j;
	//  103  180:iload_3         
	//  104  181:istore_2        
					j = j1;
	//  105  182:iload           8
	//  106  184:istore_3        
				}
				k1++;
				l1 = i;
				j1 = j;
				byte0 = ((byte) (i2));
			}
	//* 107  185:goto            96
			i1++;
	//  108  188:iload           6
	//  109  190:iconst_1        
	//  110  191:iadd            
	//  111  192:istore          6
		} while(true);
	//  112  194:goto            34
		return j1;
	//  113  197:iload           8
	//  114  199:ireturn         
	}

	public static int applyMaskPenaltyRule2(ByteMatrix bytematrix)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		byte abyte0[][] = bytematrix.getArray();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #28  <Method byte[][] ByteMatrix.getArray()>
	//    4    6:astore          8
		int i1 = bytematrix.getWidth();
	//    5    8:aload_0         
	//    6    9:invokevirtual   #24  <Method int ByteMatrix.getWidth()>
	//    7   12:istore          5
		int j1 = bytematrix.getHeight();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #21  <Method int ByteMatrix.getHeight()>
	//   10   18:istore          6
		for(int i = 0; i < j1 - 1; i++)
	//*  11   20:iconst_0        
	//*  12   21:istore_1        
	//*  13   22:iload_1         
	//*  14   23:iload           6
	//*  15   25:iconst_1        
	//*  16   26:isub            
	//*  17   27:icmpge          120
		{
			for(int k = 0; k < i1 - 1;)
	//*  18   30:iconst_0        
	//*  19   31:istore_3        
	//*  20   32:iload_3         
	//*  21   33:iload           5
	//*  22   35:iconst_1        
	//*  23   36:isub            
	//*  24   37:icmpge          113
			{
				byte byte0 = abyte0[i][k];
	//   25   40:aload           8
	//   26   42:iload_1         
	//   27   43:aaload          
	//   28   44:iload_3         
	//   29   45:iaload          
	//   30   46:istore          7
				int l = j;
	//   31   48:iload_2         
	//   32   49:istore          4
				if(byte0 == abyte0[i][k + 1])
	//*  33   51:iload           7
	//*  34   53:aload           8
	//*  35   55:iload_1         
	//*  36   56:aaload          
	//*  37   57:iload_3         
	//*  38   58:iconst_1        
	//*  39   59:iadd            
	//*  40   60:iaload          
	//*  41   61:icmpne          103
				{
					l = j;
	//   42   64:iload_2         
	//   43   65:istore          4
					if(byte0 == abyte0[i + 1][k])
	//*  44   67:iload           7
	//*  45   69:aload           8
	//*  46   71:iload_1         
	//*  47   72:iconst_1        
	//*  48   73:iadd            
	//*  49   74:aaload          
	//*  50   75:iload_3         
	//*  51   76:iaload          
	//*  52   77:icmpne          103
					{
						l = j;
	//   53   80:iload_2         
	//   54   81:istore          4
						if(byte0 == abyte0[i + 1][k + 1])
	//*  55   83:iload           7
	//*  56   85:aload           8
	//*  57   87:iload_1         
	//*  58   88:iconst_1        
	//*  59   89:iadd            
	//*  60   90:aaload          
	//*  61   91:iload_3         
	//*  62   92:iconst_1        
	//*  63   93:iadd            
	//*  64   94:iaload          
	//*  65   95:icmpne          103
							l = j + 3;
	//   66   98:iload_2         
	//   67   99:iconst_3        
	//   68  100:iadd            
	//   69  101:istore          4
					}
				}
				k++;
	//   70  103:iload_3         
	//   71  104:iconst_1        
	//   72  105:iadd            
	//   73  106:istore_3        
				j = l;
	//   74  107:iload           4
	//   75  109:istore_2        
			}

		}

	//   76  110:goto            32
	//   77  113:iload_1         
	//   78  114:iconst_1        
	//   79  115:iadd            
	//   80  116:istore_1        
	//*  81  117:goto            22
		return j;
	//   82  120:iload_2         
	//   83  121:ireturn         
	}

	public static int applyMaskPenaltyRule3(ByteMatrix bytematrix)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		byte abyte0[][] = bytematrix.getArray();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #28  <Method byte[][] ByteMatrix.getArray()>
	//    4    6:astore          7
		int i1 = bytematrix.getWidth();
	//    5    8:aload_0         
	//    6    9:invokevirtual   #24  <Method int ByteMatrix.getWidth()>
	//    7   12:istore          5
		int j1 = bytematrix.getHeight();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #21  <Method int ByteMatrix.getHeight()>
	//   10   18:istore          6
		int k = 0;
	//   11   20:iconst_0        
	//   12   21:istore_3        
		do
		{
			if(k >= j1)
				break;
	//   13   22:iload_3         
	//   14   23:iload           6
	//   15   25:icmpge          543
			for(int l = 0; l < i1; l++)
	//*  16   28:iconst_0        
	//*  17   29:istore          4
	//*  18   31:iload           4
	//*  19   33:iload           5
	//*  20   35:icmpge          536
			{
				int j;
label0:
				{
					j = i;
	//   21   38:iload_1         
	//   22   39:istore_2        
					if(l + 6 >= i1)
						break label0;
	//   23   40:iload           4
	//   24   42:bipush          6
	//   25   44:iadd            
	//   26   45:iload           5
	//   27   47:icmpge          284
					j = i;
	//   28   50:iload_1         
	//   29   51:istore_2        
					if(abyte0[k][l] != 1)
						break label0;
	//   30   52:aload           7
	//   31   54:iload_3         
	//   32   55:aaload          
	//   33   56:iload           4
	//   34   58:iaload          
	//   35   59:iconst_1        
	//   36   60:icmpne          284
					j = i;
	//   37   63:iload_1         
	//   38   64:istore_2        
					if(abyte0[k][l + 1] != 0)
						break label0;
	//   39   65:aload           7
	//   40   67:iload_3         
	//   41   68:aaload          
	//   42   69:iload           4
	//   43   71:iconst_1        
	//   44   72:iadd            
	//   45   73:iaload          
	//   46   74:ifne            284
					j = i;
	//   47   77:iload_1         
	//   48   78:istore_2        
					if(abyte0[k][l + 2] != 1)
						break label0;
	//   49   79:aload           7
	//   50   81:iload_3         
	//   51   82:aaload          
	//   52   83:iload           4
	//   53   85:iconst_2        
	//   54   86:iadd            
	//   55   87:iaload          
	//   56   88:iconst_1        
	//   57   89:icmpne          284
					j = i;
	//   58   92:iload_1         
	//   59   93:istore_2        
					if(abyte0[k][l + 3] != 1)
						break label0;
	//   60   94:aload           7
	//   61   96:iload_3         
	//   62   97:aaload          
	//   63   98:iload           4
	//   64  100:iconst_3        
	//   65  101:iadd            
	//   66  102:iaload          
	//   67  103:iconst_1        
	//   68  104:icmpne          284
					j = i;
	//   69  107:iload_1         
	//   70  108:istore_2        
					if(abyte0[k][l + 4] != 1)
						break label0;
	//   71  109:aload           7
	//   72  111:iload_3         
	//   73  112:aaload          
	//   74  113:iload           4
	//   75  115:iconst_4        
	//   76  116:iadd            
	//   77  117:iaload          
	//   78  118:iconst_1        
	//   79  119:icmpne          284
					j = i;
	//   80  122:iload_1         
	//   81  123:istore_2        
					if(abyte0[k][l + 5] != 0)
						break label0;
	//   82  124:aload           7
	//   83  126:iload_3         
	//   84  127:aaload          
	//   85  128:iload           4
	//   86  130:iconst_5        
	//   87  131:iadd            
	//   88  132:iaload          
	//   89  133:ifne            284
					j = i;
	//   90  136:iload_1         
	//   91  137:istore_2        
					if(abyte0[k][l + 6] != 1)
						break label0;
	//   92  138:aload           7
	//   93  140:iload_3         
	//   94  141:aaload          
	//   95  142:iload           4
	//   96  144:bipush          6
	//   97  146:iadd            
	//   98  147:iaload          
	//   99  148:iconst_1        
	//  100  149:icmpne          284
					if(l + 10 >= i1 || abyte0[k][l + 7] != 0 || abyte0[k][l + 8] != 0 || abyte0[k][l + 9] != 0 || abyte0[k][l + 10] != 0)
	//* 101  152:iload           4
	//* 102  154:bipush          10
	//* 103  156:iadd            
	//* 104  157:iload           5
	//* 105  159:icmpge          214
	//* 106  162:aload           7
	//* 107  164:iload_3         
	//* 108  165:aaload          
	//* 109  166:iload           4
	//* 110  168:bipush          7
	//* 111  170:iadd            
	//* 112  171:iaload          
	//* 113  172:ifne            214
	//* 114  175:aload           7
	//* 115  177:iload_3         
	//* 116  178:aaload          
	//* 117  179:iload           4
	//* 118  181:bipush          8
	//* 119  183:iadd            
	//* 120  184:iaload          
	//* 121  185:ifne            214
	//* 122  188:aload           7
	//* 123  190:iload_3         
	//* 124  191:aaload          
	//* 125  192:iload           4
	//* 126  194:bipush          9
	//* 127  196:iadd            
	//* 128  197:iaload          
	//* 129  198:ifne            214
	//* 130  201:aload           7
	//* 131  203:iload_3         
	//* 132  204:aaload          
	//* 133  205:iload           4
	//* 134  207:bipush          10
	//* 135  209:iadd            
	//* 136  210:iaload          
	//* 137  211:ifeq            279
					{
						j = i;
	//  138  214:iload_1         
	//  139  215:istore_2        
						if(l - 4 < 0)
							break label0;
	//  140  216:iload           4
	//  141  218:iconst_4        
	//  142  219:isub            
	//  143  220:iflt            284
						j = i;
	//  144  223:iload_1         
	//  145  224:istore_2        
						if(abyte0[k][l - 1] != 0)
							break label0;
	//  146  225:aload           7
	//  147  227:iload_3         
	//  148  228:aaload          
	//  149  229:iload           4
	//  150  231:iconst_1        
	//  151  232:isub            
	//  152  233:iaload          
	//  153  234:ifne            284
						j = i;
	//  154  237:iload_1         
	//  155  238:istore_2        
						if(abyte0[k][l - 2] != 0)
							break label0;
	//  156  239:aload           7
	//  157  241:iload_3         
	//  158  242:aaload          
	//  159  243:iload           4
	//  160  245:iconst_2        
	//  161  246:isub            
	//  162  247:iaload          
	//  163  248:ifne            284
						j = i;
	//  164  251:iload_1         
	//  165  252:istore_2        
						if(abyte0[k][l - 3] != 0)
							break label0;
	//  166  253:aload           7
	//  167  255:iload_3         
	//  168  256:aaload          
	//  169  257:iload           4
	//  170  259:iconst_3        
	//  171  260:isub            
	//  172  261:iaload          
	//  173  262:ifne            284
						j = i;
	//  174  265:iload_1         
	//  175  266:istore_2        
						if(abyte0[k][l - 4] != 0)
							break label0;
	//  176  267:aload           7
	//  177  269:iload_3         
	//  178  270:aaload          
	//  179  271:iload           4
	//  180  273:iconst_4        
	//  181  274:isub            
	//  182  275:iaload          
	//  183  276:ifne            284
					}
					j = i + 40;
	//  184  279:iload_1         
	//  185  280:bipush          40
	//  186  282:iadd            
	//  187  283:istore_2        
				}
				i = j;
	//  188  284:iload_2         
	//  189  285:istore_1        
				if(k + 6 >= j1)
					continue;
	//  190  286:iload_3         
	//  191  287:bipush          6
	//  192  289:iadd            
	//  193  290:iload           6
	//  194  292:icmpge          527
				i = j;
	//  195  295:iload_2         
	//  196  296:istore_1        
				if(abyte0[k][l] != 1)
					continue;
	//  197  297:aload           7
	//  198  299:iload_3         
	//  199  300:aaload          
	//  200  301:iload           4
	//  201  303:iaload          
	//  202  304:iconst_1        
	//  203  305:icmpne          527
				i = j;
	//  204  308:iload_2         
	//  205  309:istore_1        
				if(abyte0[k + 1][l] != 0)
					continue;
	//  206  310:aload           7
	//  207  312:iload_3         
	//  208  313:iconst_1        
	//  209  314:iadd            
	//  210  315:aaload          
	//  211  316:iload           4
	//  212  318:iaload          
	//  213  319:ifne            527
				i = j;
	//  214  322:iload_2         
	//  215  323:istore_1        
				if(abyte0[k + 2][l] != 1)
					continue;
	//  216  324:aload           7
	//  217  326:iload_3         
	//  218  327:iconst_2        
	//  219  328:iadd            
	//  220  329:aaload          
	//  221  330:iload           4
	//  222  332:iaload          
	//  223  333:iconst_1        
	//  224  334:icmpne          527
				i = j;
	//  225  337:iload_2         
	//  226  338:istore_1        
				if(abyte0[k + 3][l] != 1)
					continue;
	//  227  339:aload           7
	//  228  341:iload_3         
	//  229  342:iconst_3        
	//  230  343:iadd            
	//  231  344:aaload          
	//  232  345:iload           4
	//  233  347:iaload          
	//  234  348:iconst_1        
	//  235  349:icmpne          527
				i = j;
	//  236  352:iload_2         
	//  237  353:istore_1        
				if(abyte0[k + 4][l] != 1)
					continue;
	//  238  354:aload           7
	//  239  356:iload_3         
	//  240  357:iconst_4        
	//  241  358:iadd            
	//  242  359:aaload          
	//  243  360:iload           4
	//  244  362:iaload          
	//  245  363:iconst_1        
	//  246  364:icmpne          527
				i = j;
	//  247  367:iload_2         
	//  248  368:istore_1        
				if(abyte0[k + 5][l] != 0)
					continue;
	//  249  369:aload           7
	//  250  371:iload_3         
	//  251  372:iconst_5        
	//  252  373:iadd            
	//  253  374:aaload          
	//  254  375:iload           4
	//  255  377:iaload          
	//  256  378:ifne            527
				i = j;
	//  257  381:iload_2         
	//  258  382:istore_1        
				if(abyte0[k + 6][l] != 1)
					continue;
	//  259  383:aload           7
	//  260  385:iload_3         
	//  261  386:bipush          6
	//  262  388:iadd            
	//  263  389:aaload          
	//  264  390:iload           4
	//  265  392:iaload          
	//  266  393:iconst_1        
	//  267  394:icmpne          527
				if(k + 10 >= j1 || abyte0[k + 7][l] != 0 || abyte0[k + 8][l] != 0 || abyte0[k + 9][l] != 0 || abyte0[k + 10][l] != 0)
	//* 268  397:iload_3         
	//* 269  398:bipush          10
	//* 270  400:iadd            
	//* 271  401:iload           6
	//* 272  403:icmpge          458
	//* 273  406:aload           7
	//* 274  408:iload_3         
	//* 275  409:bipush          7
	//* 276  411:iadd            
	//* 277  412:aaload          
	//* 278  413:iload           4
	//* 279  415:iaload          
	//* 280  416:ifne            458
	//* 281  419:aload           7
	//* 282  421:iload_3         
	//* 283  422:bipush          8
	//* 284  424:iadd            
	//* 285  425:aaload          
	//* 286  426:iload           4
	//* 287  428:iaload          
	//* 288  429:ifne            458
	//* 289  432:aload           7
	//* 290  434:iload_3         
	//* 291  435:bipush          9
	//* 292  437:iadd            
	//* 293  438:aaload          
	//* 294  439:iload           4
	//* 295  441:iaload          
	//* 296  442:ifne            458
	//* 297  445:aload           7
	//* 298  447:iload_3         
	//* 299  448:bipush          10
	//* 300  450:iadd            
	//* 301  451:aaload          
	//* 302  452:iload           4
	//* 303  454:iaload          
	//* 304  455:ifeq            522
				{
					i = j;
	//  305  458:iload_2         
	//  306  459:istore_1        
					if(k - 4 < 0)
						continue;
	//  307  460:iload_3         
	//  308  461:iconst_4        
	//  309  462:isub            
	//  310  463:iflt            527
					i = j;
	//  311  466:iload_2         
	//  312  467:istore_1        
					if(abyte0[k - 1][l] != 0)
						continue;
	//  313  468:aload           7
	//  314  470:iload_3         
	//  315  471:iconst_1        
	//  316  472:isub            
	//  317  473:aaload          
	//  318  474:iload           4
	//  319  476:iaload          
	//  320  477:ifne            527
					i = j;
	//  321  480:iload_2         
	//  322  481:istore_1        
					if(abyte0[k - 2][l] != 0)
						continue;
	//  323  482:aload           7
	//  324  484:iload_3         
	//  325  485:iconst_2        
	//  326  486:isub            
	//  327  487:aaload          
	//  328  488:iload           4
	//  329  490:iaload          
	//  330  491:ifne            527
					i = j;
	//  331  494:iload_2         
	//  332  495:istore_1        
					if(abyte0[k - 3][l] != 0)
						continue;
	//  333  496:aload           7
	//  334  498:iload_3         
	//  335  499:iconst_3        
	//  336  500:isub            
	//  337  501:aaload          
	//  338  502:iload           4
	//  339  504:iaload          
	//  340  505:ifne            527
					i = j;
	//  341  508:iload_2         
	//  342  509:istore_1        
					if(abyte0[k - 4][l] != 0)
						continue;
	//  343  510:aload           7
	//  344  512:iload_3         
	//  345  513:iconst_4        
	//  346  514:isub            
	//  347  515:aaload          
	//  348  516:iload           4
	//  349  518:iaload          
	//  350  519:ifne            527
				}
				i = j + 40;
	//  351  522:iload_2         
	//  352  523:bipush          40
	//  353  525:iadd            
	//  354  526:istore_1        
			}

	//  355  527:iload           4
	//  356  529:iconst_1        
	//  357  530:iadd            
	//  358  531:istore          4
	//* 359  533:goto            31
			k++;
	//  360  536:iload_3         
	//  361  537:iconst_1        
	//  362  538:iadd            
	//  363  539:istore_3        
		} while(true);
	//  364  540:goto            22
		return i;
	//  365  543:iload_1         
	//  366  544:ireturn         
	}

	public static int applyMaskPenaltyRule4(ByteMatrix bytematrix)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		byte abyte0[][] = bytematrix.getArray();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #28  <Method byte[][] ByteMatrix.getArray()>
	//    4    6:astore          7
		int k1 = bytematrix.getWidth();
	//    5    8:aload_0         
	//    6    9:invokevirtual   #24  <Method int ByteMatrix.getWidth()>
	//    7   12:istore          5
		int l1 = bytematrix.getHeight();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #21  <Method int ByteMatrix.getHeight()>
	//   10   18:istore          6
		for(int i = 0; i < l1; i++)
	//*  11   20:iconst_0        
	//*  12   21:istore_1        
	//*  13   22:iload_1         
	//*  14   23:iload           6
	//*  15   25:icmpge          71
		{
			for(int l = 0; l < k1;)
	//*  16   28:iconst_0        
	//*  17   29:istore_3        
	//*  18   30:iload_3         
	//*  19   31:iload           5
	//*  20   33:icmpge          64
			{
				int j1 = k;
	//   21   36:iload_2         
	//   22   37:istore          4
				if(abyte0[i][l] == 1)
	//*  23   39:aload           7
	//*  24   41:iload_1         
	//*  25   42:aaload          
	//*  26   43:iload_3         
	//*  27   44:iaload          
	//*  28   45:iconst_1        
	//*  29   46:icmpne          54
					j1 = k + 1;
	//   30   49:iload_2         
	//   31   50:iconst_1        
	//   32   51:iadd            
	//   33   52:istore          4
				l++;
	//   34   54:iload_3         
	//   35   55:iconst_1        
	//   36   56:iadd            
	//   37   57:istore_3        
				k = j1;
	//   38   58:iload           4
	//   39   60:istore_2        
			}

		}

	//   40   61:goto            30
	//   41   64:iload_1         
	//   42   65:iconst_1        
	//   43   66:iadd            
	//   44   67:istore_1        
	//*  45   68:goto            22
		int j = bytematrix.getHeight();
	//   46   71:aload_0         
	//   47   72:invokevirtual   #21  <Method int ByteMatrix.getHeight()>
	//   48   75:istore_1        
		int i1 = bytematrix.getWidth();
	//   49   76:aload_0         
	//   50   77:invokevirtual   #24  <Method int ByteMatrix.getWidth()>
	//   51   80:istore_3        
		return (Math.abs((int)(100D * ((double)k / (double)(j * i1)) - 50D)) / 5) * 10;
	//   52   81:ldc2w           #32  <Double 100D>
	//   53   84:iload_2         
	//   54   85:i2d             
	//   55   86:iload_1         
	//   56   87:iload_3         
	//   57   88:imul            
	//   58   89:i2d             
	//   59   90:ddiv            
	//   60   91:dmul            
	//   61   92:ldc2w           #34  <Double 50D>
	//   62   95:dsub            
	//   63   96:d2i             
	//   64   97:invokestatic    #41  <Method int Math.abs(int)>
	//   65  100:iconst_5        
	//   66  101:idiv            
	//   67  102:bipush          10
	//   68  104:imul            
	//   69  105:ireturn         
	}

	public static boolean getDataMaskBit(int i, int j, int k)
	{
		if(!QRCode.isValidMaskPattern(i))
	//*   0    0:iload_0         
	//*   1    1:invokestatic    #49  <Method boolean QRCode.isValidMaskPattern(int)>
	//*   2    4:ifne            17
			throw new IllegalArgumentException("Invalid mask pattern");
	//    3    7:new             #51  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #53  <String "Invalid mask pattern">
	//    6   13:invokespecial   #56  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		i;
	//    8   17:iload_0         
		JVM INSTR tableswitch 0 7: default 64
	//	               0 91
	//	               1 103
	//	               2 110
	//	               3 117
	//	               4 126
	//	               5 139
	//	               6 154
	//	               7 171;
	//    9   18:tableswitch     0 7: default 64
	//	               0 91
	//	               1 103
	//	               2 110
	//	               3 117
	//	               4 126
	//	               5 139
	//	               6 154
	//	               7 171
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L9:
		break MISSING_BLOCK_LABEL_171;
_L1:
		throw new IllegalArgumentException((new StringBuilder()).append("Invalid mask pattern: ").append(i).toString());
	//   10   64:new             #51  <Class IllegalArgumentException>
	//   11   67:dup             
	//   12   68:new             #58  <Class StringBuilder>
	//   13   71:dup             
	//   14   72:invokespecial   #59  <Method void StringBuilder()>
	//   15   75:ldc1            #61  <String "Invalid mask pattern: ">
	//   16   77:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   17   80:iload_0         
	//   18   81:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//   19   84:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   20   87:invokespecial   #56  <Method void IllegalArgumentException(String)>
	//   21   90:athrow          
_L2:
		i = k + j & 1;
	//   22   91:iload_2         
	//   23   92:iload_1         
	//   24   93:iadd            
	//   25   94:iconst_1        
	//   26   95:iand            
	//   27   96:istore_0        
_L10:
		return i == 0;
	//   28   97:iload_0         
	//   29   98:ifne            188
	//   30  101:iconst_1        
	//   31  102:ireturn         
	//   32  103:iload_2         
	//   33  104:iconst_1        
	//   34  105:iand            
	//   35  106:istore_0        
	//   36  107:goto            97
	//   37  110:iload_1         
	//   38  111:iconst_3        
	//   39  112:irem            
	//   40  113:istore_0        
	//   41  114:goto            97
	//   42  117:iload_2         
	//   43  118:iload_1         
	//   44  119:iadd            
	//   45  120:iconst_3        
	//   46  121:irem            
	//   47  122:istore_0        
	//   48  123:goto            97
	//   49  126:iload_2         
	//   50  127:iconst_1        
	//   51  128:iushr           
	//   52  129:iload_1         
	//   53  130:iconst_3        
	//   54  131:idiv            
	//   55  132:iadd            
	//   56  133:iconst_1        
	//   57  134:iand            
	//   58  135:istore_0        
	//   59  136:goto            97
	//   60  139:iload_2         
	//   61  140:iload_1         
	//   62  141:imul            
	//   63  142:istore_0        
	//   64  143:iload_0         
	//   65  144:iconst_1        
	//   66  145:iand            
	//   67  146:iload_0         
	//   68  147:iconst_3        
	//   69  148:irem            
	//   70  149:iadd            
	//   71  150:istore_0        
	//   72  151:goto            97
	//   73  154:iload_2         
	//   74  155:iload_1         
	//   75  156:imul            
	//   76  157:istore_0        
	//   77  158:iload_0         
	//   78  159:iconst_1        
	//   79  160:iand            
	//   80  161:iload_0         
	//   81  162:iconst_3        
	//   82  163:irem            
	//   83  164:iadd            
	//   84  165:iconst_1        
	//   85  166:iand            
	//   86  167:istore_0        
	//   87  168:goto            97
	//   88  171:iload_2         
	//   89  172:iload_1         
	//   90  173:imul            
	//   91  174:iconst_3        
	//   92  175:irem            
	//   93  176:iload_2         
	//   94  177:iload_1         
	//   95  178:iadd            
	//   96  179:iconst_1        
	//   97  180:iand            
	//   98  181:iadd            
	//   99  182:iconst_1        
	//  100  183:iand            
	//  101  184:istore_0        
	//  102  185:goto            97
	//  103  188:iconst_0        
	//  104  189:ireturn         
_L3:
		i = k & 1;
		  goto _L10
_L4:
		i = j % 3;
		  goto _L10
_L5:
		i = (k + j) % 3;
		  goto _L10
_L6:
		i = (k >>> 1) + j / 3 & 1;
		  goto _L10
_L7:
		i = k * j;
		i = (i & 1) + i % 3;
		  goto _L10
_L8:
		i = k * j;
		i = (i & 1) + i % 3 & 1;
		  goto _L10
		i = (k * j) % 3 + (k + j & 1) & 1;
		  goto _L10
	}
}
