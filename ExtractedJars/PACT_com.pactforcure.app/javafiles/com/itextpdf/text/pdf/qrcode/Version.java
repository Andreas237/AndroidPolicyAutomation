// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.qrcode;


// Referenced classes of package com.itextpdf.text.pdf.qrcode:
//			FormatInformation, BitMatrix, ErrorCorrectionLevel

public final class Version
{
	public static final class ECB
	{

		public int getCount()
		{
			return count;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field int count>
		//    2    4:ireturn         
		}

		public int getDataCodewords()
		{
			return dataCodewords;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field int dataCodewords>
		//    2    4:ireturn         
		}

		private final int count;
		private final int dataCodewords;

		ECB(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			count = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #17  <Field int count>
			dataCodewords = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #19  <Field int dataCodewords>
		//    8   14:return          
		}
	}

	public static final class ECBlocks
	{

		public ECB[] getECBlocks()
		{
			return ecBlocks;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Version$ECB[] ecBlocks>
		//    2    4:areturn         
		}

		public int getECCodewordsPerBlock()
		{
			return ecCodewordsPerBlock;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field int ecCodewordsPerBlock>
		//    2    4:ireturn         
		}

		public int getNumBlocks()
		{
			int j = 0;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			for(int i = 0; i < ecBlocks.length; i++)
		//*   2    2:iconst_0        
		//*   3    3:istore_1        
		//*   4    4:iload_1         
		//*   5    5:aload_0         
		//*   6    6:getfield        #22  <Field Version$ECB[] ecBlocks>
		//*   7    9:arraylength     
		//*   8   10:icmpge          32
				j += ecBlocks[i].getCount();
		//    9   13:iload_2         
		//   10   14:aload_0         
		//   11   15:getfield        #22  <Field Version$ECB[] ecBlocks>
		//   12   18:iload_1         
		//   13   19:aaload          
		//   14   20:invokevirtual   #32  <Method int Version$ECB.getCount()>
		//   15   23:iadd            
		//   16   24:istore_2        

		//   17   25:iload_1         
		//   18   26:iconst_1        
		//   19   27:iadd            
		//   20   28:istore_1        
		//*  21   29:goto            4
			return j;
		//   22   32:iload_2         
		//   23   33:ireturn         
		}

		public int getTotalECCodewords()
		{
			return ecCodewordsPerBlock * getNumBlocks();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field int ecCodewordsPerBlock>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #35  <Method int getNumBlocks()>
		//    4    8:imul            
		//    5    9:ireturn         
		}

		private final ECB ecBlocks[];
		private final int ecCodewordsPerBlock;

		ECBlocks(int i, ECB ecb)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			ecCodewordsPerBlock = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #18  <Field int ecCodewordsPerBlock>
			ecBlocks = (new ECB[] {
				ecb
			});
		//    5    9:aload_0         
		//    6   10:iconst_1        
		//    7   11:anewarray       ECB[]
		//    8   14:dup             
		//    9   15:iconst_0        
		//   10   16:aload_2         
		//   11   17:aastore         
		//   12   18:putfield        #22  <Field Version$ECB[] ecBlocks>
		//   13   21:return          
		}

		ECBlocks(int i, ECB ecb, ECB ecb1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			ecCodewordsPerBlock = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #18  <Field int ecCodewordsPerBlock>
			ecBlocks = (new ECB[] {
				ecb, ecb1
			});
		//    5    9:aload_0         
		//    6   10:iconst_2        
		//    7   11:anewarray       ECB[]
		//    8   14:dup             
		//    9   15:iconst_0        
		//   10   16:aload_2         
		//   11   17:aastore         
		//   12   18:dup             
		//   13   19:iconst_1        
		//   14   20:aload_3         
		//   15   21:aastore         
		//   16   22:putfield        #22  <Field Version$ECB[] ecBlocks>
		//   17   25:return          
		}
	}


	private Version(int i, int ai[], ECBlocks ecblocks, ECBlocks ecblocks1, ECBlocks ecblocks2, ECBlocks ecblocks3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void Object()>
		versionNumber = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #70  <Field int versionNumber>
		alignmentPatternCenters = ai;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #72  <Field int[] alignmentPatternCenters>
		ecBlocks = (new ECBlocks[] {
			ecblocks, ecblocks1, ecblocks2, ecblocks3
		});
	//    8   14:aload_0         
	//    9   15:iconst_4        
	//   10   16:anewarray       ECBlocks[]
	//   11   19:dup             
	//   12   20:iconst_0        
	//   13   21:aload_3         
	//   14   22:aastore         
	//   15   23:dup             
	//   16   24:iconst_1        
	//   17   25:aload           4
	//   18   27:aastore         
	//   19   28:dup             
	//   20   29:iconst_2        
	//   21   30:aload           5
	//   22   32:aastore         
	//   23   33:dup             
	//   24   34:iconst_3        
	//   25   35:aload           6
	//   26   37:aastore         
	//   27   38:putfield        #74  <Field Version$ECBlocks[] ecBlocks>
		int j = 0;
	//   28   41:iconst_0        
	//   29   42:istore          7
		int k = ecblocks.getECCodewordsPerBlock();
	//   30   44:aload_3         
	//   31   45:invokevirtual   #78  <Method int Version$ECBlocks.getECCodewordsPerBlock()>
	//   32   48:istore          8
		ai = ((int []) (ecblocks.getECBlocks()));
	//   33   50:aload_3         
	//   34   51:invokevirtual   #82  <Method Version$ECB[] Version$ECBlocks.getECBlocks()>
	//   35   54:astore_2        
		for(i = 0; i < ai.length; i++)
	//*  36   55:iconst_0        
	//*  37   56:istore_1        
	//*  38   57:iload_1         
	//*  39   58:aload_2         
	//*  40   59:arraylength     
	//*  41   60:icmpge          91
		{
			ecblocks = ((ECBlocks) (ai[i]));
	//   42   63:aload_2         
	//   43   64:iload_1         
	//   44   65:aaload          
	//   45   66:astore_3        
			j += ((ECB) (ecblocks)).getCount() * (((ECB) (ecblocks)).getDataCodewords() + k);
	//   46   67:iload           7
	//   47   69:aload_3         
	//   48   70:invokevirtual   #85  <Method int Version$ECB.getCount()>
	//   49   73:aload_3         
	//   50   74:invokevirtual   #88  <Method int Version$ECB.getDataCodewords()>
	//   51   77:iload           8
	//   52   79:iadd            
	//   53   80:imul            
	//   54   81:iadd            
	//   55   82:istore          7
		}

	//   56   84:iload_1         
	//   57   85:iconst_1        
	//   58   86:iadd            
	//   59   87:istore_1        
	//*  60   88:goto            57
		totalCodewords = j;
	//   61   91:aload_0         
	//   62   92:iload           7
	//   63   94:putfield        #90  <Field int totalCodewords>
	//   64   97:return          
	}

	private static Version[] buildVersions()
	{
		Object obj = ((Object) (new ECBlocks(7, new ECB(1, 19))));
	//    0    0:new             #9   <Class Version$ECBlocks>
	//    1    3:dup             
	//    2    4:bipush          7
	//    3    6:new             #6   <Class Version$ECB>
	//    4    9:dup             
	//    5   10:iconst_1        
	//    6   11:bipush          19
	//    7   13:invokespecial   #93  <Method void Version$ECB(int, int)>
	//    8   16:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//    9   19:astore_0        
		Object obj1 = ((Object) (new ECBlocks(10, new ECB(1, 16))));
	//   10   20:new             #9   <Class Version$ECBlocks>
	//   11   23:dup             
	//   12   24:bipush          10
	//   13   26:new             #6   <Class Version$ECB>
	//   14   29:dup             
	//   15   30:iconst_1        
	//   16   31:bipush          16
	//   17   33:invokespecial   #93  <Method void Version$ECB(int, int)>
	//   18   36:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//   19   39:astore_1        
		Object obj2 = ((Object) (new ECBlocks(13, new ECB(1, 13))));
	//   20   40:new             #9   <Class Version$ECBlocks>
	//   21   43:dup             
	//   22   44:bipush          13
	//   23   46:new             #6   <Class Version$ECB>
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:bipush          13
	//   27   53:invokespecial   #93  <Method void Version$ECB(int, int)>
	//   28   56:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//   29   59:astore_2        
		Object obj3 = ((Object) (new ECBlocks(17, new ECB(1, 9))));
	//   30   60:new             #9   <Class Version$ECBlocks>
	//   31   63:dup             
	//   32   64:bipush          17
	//   33   66:new             #6   <Class Version$ECB>
	//   34   69:dup             
	//   35   70:iconst_1        
	//   36   71:bipush          9
	//   37   73:invokespecial   #93  <Method void Version$ECB(int, int)>
	//   38   76:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//   39   79:astore_3        
		obj = ((Object) (new Version(1, new int[0], ((ECBlocks) (obj)), ((ECBlocks) (obj1)), ((ECBlocks) (obj2)), ((ECBlocks) (obj3)))));
	//   40   80:new             #2   <Class Version>
	//   41   83:dup             
	//   42   84:iconst_1        
	//   43   85:iconst_0        
	//   44   86:newarray        int[]
	//   45   88:aload_0         
	//   46   89:aload_1         
	//   47   90:aload_2         
	//   48   91:aload_3         
	//   49   92:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	//   50   95:astore_0        
		obj1 = ((Object) (new ECBlocks(10, new ECB(1, 34))));
	//   51   96:new             #9   <Class Version$ECBlocks>
	//   52   99:dup             
	//   53  100:bipush          10
	//   54  102:new             #6   <Class Version$ECB>
	//   55  105:dup             
	//   56  106:iconst_1        
	//   57  107:bipush          34
	//   58  109:invokespecial   #93  <Method void Version$ECB(int, int)>
	//   59  112:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//   60  115:astore_1        
		obj2 = ((Object) (new ECBlocks(16, new ECB(1, 28))));
	//   61  116:new             #9   <Class Version$ECBlocks>
	//   62  119:dup             
	//   63  120:bipush          16
	//   64  122:new             #6   <Class Version$ECB>
	//   65  125:dup             
	//   66  126:iconst_1        
	//   67  127:bipush          28
	//   68  129:invokespecial   #93  <Method void Version$ECB(int, int)>
	//   69  132:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//   70  135:astore_2        
		obj3 = ((Object) (new ECBlocks(22, new ECB(1, 22))));
	//   71  136:new             #9   <Class Version$ECBlocks>
	//   72  139:dup             
	//   73  140:bipush          22
	//   74  142:new             #6   <Class Version$ECB>
	//   75  145:dup             
	//   76  146:iconst_1        
	//   77  147:bipush          22
	//   78  149:invokespecial   #93  <Method void Version$ECB(int, int)>
	//   79  152:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//   80  155:astore_3        
		Object obj4 = ((Object) (new ECBlocks(28, new ECB(1, 16))));
	//   81  156:new             #9   <Class Version$ECBlocks>
	//   82  159:dup             
	//   83  160:bipush          28
	//   84  162:new             #6   <Class Version$ECB>
	//   85  165:dup             
	//   86  166:iconst_1        
	//   87  167:bipush          16
	//   88  169:invokespecial   #93  <Method void Version$ECB(int, int)>
	//   89  172:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//   90  175:astore          4
		obj1 = ((Object) (new Version(2, new int[] {
			6, 18
		}, ((ECBlocks) (obj1)), ((ECBlocks) (obj2)), ((ECBlocks) (obj3)), ((ECBlocks) (obj4)))));
	//   91  177:new             #2   <Class Version>
	//   92  180:dup             
	//   93  181:iconst_2        
	//   94  182:iconst_2        
	//   95  183:newarray        int[]
	//   96  185:dup             
	//   97  186:iconst_0        
	//   98  187:bipush          6
	//   99  189:iastore         
	//  100  190:dup             
	//  101  191:iconst_1        
	//  102  192:bipush          18
	//  103  194:iastore         
	//  104  195:aload_1         
	//  105  196:aload_2         
	//  106  197:aload_3         
	//  107  198:aload           4
	//  108  200:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	//  109  203:astore_1        
		obj2 = ((Object) (new ECBlocks(15, new ECB(1, 55))));
	//  110  204:new             #9   <Class Version$ECBlocks>
	//  111  207:dup             
	//  112  208:bipush          15
	//  113  210:new             #6   <Class Version$ECB>
	//  114  213:dup             
	//  115  214:iconst_1        
	//  116  215:bipush          55
	//  117  217:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  118  220:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//  119  223:astore_2        
		obj3 = ((Object) (new ECBlocks(26, new ECB(1, 44))));
	//  120  224:new             #9   <Class Version$ECBlocks>
	//  121  227:dup             
	//  122  228:bipush          26
	//  123  230:new             #6   <Class Version$ECB>
	//  124  233:dup             
	//  125  234:iconst_1        
	//  126  235:bipush          44
	//  127  237:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  128  240:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//  129  243:astore_3        
		obj4 = ((Object) (new ECBlocks(18, new ECB(2, 17))));
	//  130  244:new             #9   <Class Version$ECBlocks>
	//  131  247:dup             
	//  132  248:bipush          18
	//  133  250:new             #6   <Class Version$ECB>
	//  134  253:dup             
	//  135  254:iconst_2        
	//  136  255:bipush          17
	//  137  257:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  138  260:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//  139  263:astore          4
		Object obj5 = ((Object) (new ECBlocks(22, new ECB(2, 13))));
	//  140  265:new             #9   <Class Version$ECBlocks>
	//  141  268:dup             
	//  142  269:bipush          22
	//  143  271:new             #6   <Class Version$ECB>
	//  144  274:dup             
	//  145  275:iconst_2        
	//  146  276:bipush          13
	//  147  278:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  148  281:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//  149  284:astore          5
		obj2 = ((Object) (new Version(3, new int[] {
			6, 22
		}, ((ECBlocks) (obj2)), ((ECBlocks) (obj3)), ((ECBlocks) (obj4)), ((ECBlocks) (obj5)))));
	//  150  286:new             #2   <Class Version>
	//  151  289:dup             
	//  152  290:iconst_3        
	//  153  291:iconst_2        
	//  154  292:newarray        int[]
	//  155  294:dup             
	//  156  295:iconst_0        
	//  157  296:bipush          6
	//  158  298:iastore         
	//  159  299:dup             
	//  160  300:iconst_1        
	//  161  301:bipush          22
	//  162  303:iastore         
	//  163  304:aload_2         
	//  164  305:aload_3         
	//  165  306:aload           4
	//  166  308:aload           5
	//  167  310:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	//  168  313:astore_2        
		obj3 = ((Object) (new ECBlocks(20, new ECB(1, 80))));
	//  169  314:new             #9   <Class Version$ECBlocks>
	//  170  317:dup             
	//  171  318:bipush          20
	//  172  320:new             #6   <Class Version$ECB>
	//  173  323:dup             
	//  174  324:iconst_1        
	//  175  325:bipush          80
	//  176  327:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  177  330:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//  178  333:astore_3        
		obj4 = ((Object) (new ECBlocks(18, new ECB(2, 32))));
	//  179  334:new             #9   <Class Version$ECBlocks>
	//  180  337:dup             
	//  181  338:bipush          18
	//  182  340:new             #6   <Class Version$ECB>
	//  183  343:dup             
	//  184  344:iconst_2        
	//  185  345:bipush          32
	//  186  347:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  187  350:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//  188  353:astore          4
		obj5 = ((Object) (new ECBlocks(26, new ECB(2, 24))));
	//  189  355:new             #9   <Class Version$ECBlocks>
	//  190  358:dup             
	//  191  359:bipush          26
	//  192  361:new             #6   <Class Version$ECB>
	//  193  364:dup             
	//  194  365:iconst_2        
	//  195  366:bipush          24
	//  196  368:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  197  371:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//  198  374:astore          5
		Object obj6 = ((Object) (new ECBlocks(16, new ECB(4, 9))));
	//  199  376:new             #9   <Class Version$ECBlocks>
	//  200  379:dup             
	//  201  380:bipush          16
	//  202  382:new             #6   <Class Version$ECB>
	//  203  385:dup             
	//  204  386:iconst_4        
	//  205  387:bipush          9
	//  206  389:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  207  392:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//  208  395:astore          6
		obj3 = ((Object) (new Version(4, new int[] {
			6, 26
		}, ((ECBlocks) (obj3)), ((ECBlocks) (obj4)), ((ECBlocks) (obj5)), ((ECBlocks) (obj6)))));
	//  209  397:new             #2   <Class Version>
	//  210  400:dup             
	//  211  401:iconst_4        
	//  212  402:iconst_2        
	//  213  403:newarray        int[]
	//  214  405:dup             
	//  215  406:iconst_0        
	//  216  407:bipush          6
	//  217  409:iastore         
	//  218  410:dup             
	//  219  411:iconst_1        
	//  220  412:bipush          26
	//  221  414:iastore         
	//  222  415:aload_3         
	//  223  416:aload           4
	//  224  418:aload           5
	//  225  420:aload           6
	//  226  422:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	//  227  425:astore_3        
		obj4 = ((Object) (new ECBlocks(26, new ECB(1, 108))));
	//  228  426:new             #9   <Class Version$ECBlocks>
	//  229  429:dup             
	//  230  430:bipush          26
	//  231  432:new             #6   <Class Version$ECB>
	//  232  435:dup             
	//  233  436:iconst_1        
	//  234  437:bipush          108
	//  235  439:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  236  442:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//  237  445:astore          4
		obj5 = ((Object) (new ECBlocks(24, new ECB(2, 43))));
	//  238  447:new             #9   <Class Version$ECBlocks>
	//  239  450:dup             
	//  240  451:bipush          24
	//  241  453:new             #6   <Class Version$ECB>
	//  242  456:dup             
	//  243  457:iconst_2        
	//  244  458:bipush          43
	//  245  460:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  246  463:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//  247  466:astore          5
		obj6 = ((Object) (new ECBlocks(18, new ECB(2, 15), new ECB(2, 16))));
	//  248  468:new             #9   <Class Version$ECBlocks>
	//  249  471:dup             
	//  250  472:bipush          18
	//  251  474:new             #6   <Class Version$ECB>
	//  252  477:dup             
	//  253  478:iconst_2        
	//  254  479:bipush          15
	//  255  481:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  256  484:new             #6   <Class Version$ECB>
	//  257  487:dup             
	//  258  488:iconst_2        
	//  259  489:bipush          16
	//  260  491:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  261  494:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  262  497:astore          6
		Object obj7 = ((Object) (new ECBlocks(22, new ECB(2, 11), new ECB(2, 12))));
	//  263  499:new             #9   <Class Version$ECBlocks>
	//  264  502:dup             
	//  265  503:bipush          22
	//  266  505:new             #6   <Class Version$ECB>
	//  267  508:dup             
	//  268  509:iconst_2        
	//  269  510:bipush          11
	//  270  512:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  271  515:new             #6   <Class Version$ECB>
	//  272  518:dup             
	//  273  519:iconst_2        
	//  274  520:bipush          12
	//  275  522:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  276  525:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  277  528:astore          7
		obj4 = ((Object) (new Version(5, new int[] {
			6, 30
		}, ((ECBlocks) (obj4)), ((ECBlocks) (obj5)), ((ECBlocks) (obj6)), ((ECBlocks) (obj7)))));
	//  278  530:new             #2   <Class Version>
	//  279  533:dup             
	//  280  534:iconst_5        
	//  281  535:iconst_2        
	//  282  536:newarray        int[]
	//  283  538:dup             
	//  284  539:iconst_0        
	//  285  540:bipush          6
	//  286  542:iastore         
	//  287  543:dup             
	//  288  544:iconst_1        
	//  289  545:bipush          30
	//  290  547:iastore         
	//  291  548:aload           4
	//  292  550:aload           5
	//  293  552:aload           6
	//  294  554:aload           7
	//  295  556:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	//  296  559:astore          4
		obj5 = ((Object) (new ECBlocks(18, new ECB(2, 68))));
	//  297  561:new             #9   <Class Version$ECBlocks>
	//  298  564:dup             
	//  299  565:bipush          18
	//  300  567:new             #6   <Class Version$ECB>
	//  301  570:dup             
	//  302  571:iconst_2        
	//  303  572:bipush          68
	//  304  574:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  305  577:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//  306  580:astore          5
		obj6 = ((Object) (new ECBlocks(16, new ECB(4, 27))));
	//  307  582:new             #9   <Class Version$ECBlocks>
	//  308  585:dup             
	//  309  586:bipush          16
	//  310  588:new             #6   <Class Version$ECB>
	//  311  591:dup             
	//  312  592:iconst_4        
	//  313  593:bipush          27
	//  314  595:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  315  598:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//  316  601:astore          6
		obj7 = ((Object) (new ECBlocks(24, new ECB(4, 19))));
	//  317  603:new             #9   <Class Version$ECBlocks>
	//  318  606:dup             
	//  319  607:bipush          24
	//  320  609:new             #6   <Class Version$ECB>
	//  321  612:dup             
	//  322  613:iconst_4        
	//  323  614:bipush          19
	//  324  616:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  325  619:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//  326  622:astore          7
		Object obj8 = ((Object) (new ECBlocks(28, new ECB(4, 15))));
	//  327  624:new             #9   <Class Version$ECBlocks>
	//  328  627:dup             
	//  329  628:bipush          28
	//  330  630:new             #6   <Class Version$ECB>
	//  331  633:dup             
	//  332  634:iconst_4        
	//  333  635:bipush          15
	//  334  637:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  335  640:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//  336  643:astore          8
		obj5 = ((Object) (new Version(6, new int[] {
			6, 34
		}, ((ECBlocks) (obj5)), ((ECBlocks) (obj6)), ((ECBlocks) (obj7)), ((ECBlocks) (obj8)))));
	//  337  645:new             #2   <Class Version>
	//  338  648:dup             
	//  339  649:bipush          6
	//  340  651:iconst_2        
	//  341  652:newarray        int[]
	//  342  654:dup             
	//  343  655:iconst_0        
	//  344  656:bipush          6
	//  345  658:iastore         
	//  346  659:dup             
	//  347  660:iconst_1        
	//  348  661:bipush          34
	//  349  663:iastore         
	//  350  664:aload           5
	//  351  666:aload           6
	//  352  668:aload           7
	//  353  670:aload           8
	//  354  672:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	//  355  675:astore          5
		obj6 = ((Object) (new ECBlocks(20, new ECB(2, 78))));
	//  356  677:new             #9   <Class Version$ECBlocks>
	//  357  680:dup             
	//  358  681:bipush          20
	//  359  683:new             #6   <Class Version$ECB>
	//  360  686:dup             
	//  361  687:iconst_2        
	//  362  688:bipush          78
	//  363  690:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  364  693:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//  365  696:astore          6
		obj7 = ((Object) (new ECBlocks(18, new ECB(4, 31))));
	//  366  698:new             #9   <Class Version$ECBlocks>
	//  367  701:dup             
	//  368  702:bipush          18
	//  369  704:new             #6   <Class Version$ECB>
	//  370  707:dup             
	//  371  708:iconst_4        
	//  372  709:bipush          31
	//  373  711:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  374  714:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//  375  717:astore          7
		obj8 = ((Object) (new ECBlocks(18, new ECB(2, 14), new ECB(4, 15))));
	//  376  719:new             #9   <Class Version$ECBlocks>
	//  377  722:dup             
	//  378  723:bipush          18
	//  379  725:new             #6   <Class Version$ECB>
	//  380  728:dup             
	//  381  729:iconst_2        
	//  382  730:bipush          14
	//  383  732:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  384  735:new             #6   <Class Version$ECB>
	//  385  738:dup             
	//  386  739:iconst_4        
	//  387  740:bipush          15
	//  388  742:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  389  745:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  390  748:astore          8
		Object obj9 = ((Object) (new ECBlocks(26, new ECB(4, 13), new ECB(1, 14))));
	//  391  750:new             #9   <Class Version$ECBlocks>
	//  392  753:dup             
	//  393  754:bipush          26
	//  394  756:new             #6   <Class Version$ECB>
	//  395  759:dup             
	//  396  760:iconst_4        
	//  397  761:bipush          13
	//  398  763:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  399  766:new             #6   <Class Version$ECB>
	//  400  769:dup             
	//  401  770:iconst_1        
	//  402  771:bipush          14
	//  403  773:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  404  776:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  405  779:astore          9
		obj6 = ((Object) (new Version(7, new int[] {
			6, 22, 38
		}, ((ECBlocks) (obj6)), ((ECBlocks) (obj7)), ((ECBlocks) (obj8)), ((ECBlocks) (obj9)))));
	//  406  781:new             #2   <Class Version>
	//  407  784:dup             
	//  408  785:bipush          7
	//  409  787:iconst_3        
	//  410  788:newarray        int[]
	//  411  790:dup             
	//  412  791:iconst_0        
	//  413  792:bipush          6
	//  414  794:iastore         
	//  415  795:dup             
	//  416  796:iconst_1        
	//  417  797:bipush          22
	//  418  799:iastore         
	//  419  800:dup             
	//  420  801:iconst_2        
	//  421  802:bipush          38
	//  422  804:iastore         
	//  423  805:aload           6
	//  424  807:aload           7
	//  425  809:aload           8
	//  426  811:aload           9
	//  427  813:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	//  428  816:astore          6
		obj7 = ((Object) (new ECBlocks(24, new ECB(2, 97))));
	//  429  818:new             #9   <Class Version$ECBlocks>
	//  430  821:dup             
	//  431  822:bipush          24
	//  432  824:new             #6   <Class Version$ECB>
	//  433  827:dup             
	//  434  828:iconst_2        
	//  435  829:bipush          97
	//  436  831:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  437  834:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//  438  837:astore          7
		obj8 = ((Object) (new ECBlocks(22, new ECB(2, 38), new ECB(2, 39))));
	//  439  839:new             #9   <Class Version$ECBlocks>
	//  440  842:dup             
	//  441  843:bipush          22
	//  442  845:new             #6   <Class Version$ECB>
	//  443  848:dup             
	//  444  849:iconst_2        
	//  445  850:bipush          38
	//  446  852:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  447  855:new             #6   <Class Version$ECB>
	//  448  858:dup             
	//  449  859:iconst_2        
	//  450  860:bipush          39
	//  451  862:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  452  865:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  453  868:astore          8
		obj9 = ((Object) (new ECBlocks(22, new ECB(4, 18), new ECB(2, 19))));
	//  454  870:new             #9   <Class Version$ECBlocks>
	//  455  873:dup             
	//  456  874:bipush          22
	//  457  876:new             #6   <Class Version$ECB>
	//  458  879:dup             
	//  459  880:iconst_4        
	//  460  881:bipush          18
	//  461  883:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  462  886:new             #6   <Class Version$ECB>
	//  463  889:dup             
	//  464  890:iconst_2        
	//  465  891:bipush          19
	//  466  893:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  467  896:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  468  899:astore          9
		Object obj10 = ((Object) (new ECBlocks(26, new ECB(4, 14), new ECB(2, 15))));
	//  469  901:new             #9   <Class Version$ECBlocks>
	//  470  904:dup             
	//  471  905:bipush          26
	//  472  907:new             #6   <Class Version$ECB>
	//  473  910:dup             
	//  474  911:iconst_4        
	//  475  912:bipush          14
	//  476  914:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  477  917:new             #6   <Class Version$ECB>
	//  478  920:dup             
	//  479  921:iconst_2        
	//  480  922:bipush          15
	//  481  924:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  482  927:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  483  930:astore          10
		obj7 = ((Object) (new Version(8, new int[] {
			6, 24, 42
		}, ((ECBlocks) (obj7)), ((ECBlocks) (obj8)), ((ECBlocks) (obj9)), ((ECBlocks) (obj10)))));
	//  484  932:new             #2   <Class Version>
	//  485  935:dup             
	//  486  936:bipush          8
	//  487  938:iconst_3        
	//  488  939:newarray        int[]
	//  489  941:dup             
	//  490  942:iconst_0        
	//  491  943:bipush          6
	//  492  945:iastore         
	//  493  946:dup             
	//  494  947:iconst_1        
	//  495  948:bipush          24
	//  496  950:iastore         
	//  497  951:dup             
	//  498  952:iconst_2        
	//  499  953:bipush          42
	//  500  955:iastore         
	//  501  956:aload           7
	//  502  958:aload           8
	//  503  960:aload           9
	//  504  962:aload           10
	//  505  964:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	//  506  967:astore          7
		obj8 = ((Object) (new ECBlocks(30, new ECB(2, 116))));
	//  507  969:new             #9   <Class Version$ECBlocks>
	//  508  972:dup             
	//  509  973:bipush          30
	//  510  975:new             #6   <Class Version$ECB>
	//  511  978:dup             
	//  512  979:iconst_2        
	//  513  980:bipush          116
	//  514  982:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  515  985:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//  516  988:astore          8
		obj9 = ((Object) (new ECBlocks(22, new ECB(3, 36), new ECB(2, 37))));
	//  517  990:new             #9   <Class Version$ECBlocks>
	//  518  993:dup             
	//  519  994:bipush          22
	//  520  996:new             #6   <Class Version$ECB>
	//  521  999:dup             
	//  522 1000:iconst_3        
	//  523 1001:bipush          36
	//  524 1003:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  525 1006:new             #6   <Class Version$ECB>
	//  526 1009:dup             
	//  527 1010:iconst_2        
	//  528 1011:bipush          37
	//  529 1013:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  530 1016:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  531 1019:astore          9
		obj10 = ((Object) (new ECBlocks(20, new ECB(4, 16), new ECB(4, 17))));
	//  532 1021:new             #9   <Class Version$ECBlocks>
	//  533 1024:dup             
	//  534 1025:bipush          20
	//  535 1027:new             #6   <Class Version$ECB>
	//  536 1030:dup             
	//  537 1031:iconst_4        
	//  538 1032:bipush          16
	//  539 1034:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  540 1037:new             #6   <Class Version$ECB>
	//  541 1040:dup             
	//  542 1041:iconst_4        
	//  543 1042:bipush          17
	//  544 1044:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  545 1047:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  546 1050:astore          10
		Object obj11 = ((Object) (new ECBlocks(24, new ECB(4, 12), new ECB(4, 13))));
	//  547 1052:new             #9   <Class Version$ECBlocks>
	//  548 1055:dup             
	//  549 1056:bipush          24
	//  550 1058:new             #6   <Class Version$ECB>
	//  551 1061:dup             
	//  552 1062:iconst_4        
	//  553 1063:bipush          12
	//  554 1065:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  555 1068:new             #6   <Class Version$ECB>
	//  556 1071:dup             
	//  557 1072:iconst_4        
	//  558 1073:bipush          13
	//  559 1075:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  560 1078:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  561 1081:astore          11
		obj8 = ((Object) (new Version(9, new int[] {
			6, 26, 46
		}, ((ECBlocks) (obj8)), ((ECBlocks) (obj9)), ((ECBlocks) (obj10)), ((ECBlocks) (obj11)))));
	//  562 1083:new             #2   <Class Version>
	//  563 1086:dup             
	//  564 1087:bipush          9
	//  565 1089:iconst_3        
	//  566 1090:newarray        int[]
	//  567 1092:dup             
	//  568 1093:iconst_0        
	//  569 1094:bipush          6
	//  570 1096:iastore         
	//  571 1097:dup             
	//  572 1098:iconst_1        
	//  573 1099:bipush          26
	//  574 1101:iastore         
	//  575 1102:dup             
	//  576 1103:iconst_2        
	//  577 1104:bipush          46
	//  578 1106:iastore         
	//  579 1107:aload           8
	//  580 1109:aload           9
	//  581 1111:aload           10
	//  582 1113:aload           11
	//  583 1115:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	//  584 1118:astore          8
		obj9 = ((Object) (new ECBlocks(18, new ECB(2, 68), new ECB(2, 69))));
	//  585 1120:new             #9   <Class Version$ECBlocks>
	//  586 1123:dup             
	//  587 1124:bipush          18
	//  588 1126:new             #6   <Class Version$ECB>
	//  589 1129:dup             
	//  590 1130:iconst_2        
	//  591 1131:bipush          68
	//  592 1133:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  593 1136:new             #6   <Class Version$ECB>
	//  594 1139:dup             
	//  595 1140:iconst_2        
	//  596 1141:bipush          69
	//  597 1143:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  598 1146:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  599 1149:astore          9
		obj10 = ((Object) (new ECBlocks(26, new ECB(4, 43), new ECB(1, 44))));
	//  600 1151:new             #9   <Class Version$ECBlocks>
	//  601 1154:dup             
	//  602 1155:bipush          26
	//  603 1157:new             #6   <Class Version$ECB>
	//  604 1160:dup             
	//  605 1161:iconst_4        
	//  606 1162:bipush          43
	//  607 1164:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  608 1167:new             #6   <Class Version$ECB>
	//  609 1170:dup             
	//  610 1171:iconst_1        
	//  611 1172:bipush          44
	//  612 1174:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  613 1177:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  614 1180:astore          10
		obj11 = ((Object) (new ECBlocks(24, new ECB(6, 19), new ECB(2, 20))));
	//  615 1182:new             #9   <Class Version$ECBlocks>
	//  616 1185:dup             
	//  617 1186:bipush          24
	//  618 1188:new             #6   <Class Version$ECB>
	//  619 1191:dup             
	//  620 1192:bipush          6
	//  621 1194:bipush          19
	//  622 1196:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  623 1199:new             #6   <Class Version$ECB>
	//  624 1202:dup             
	//  625 1203:iconst_2        
	//  626 1204:bipush          20
	//  627 1206:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  628 1209:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  629 1212:astore          11
		Object obj12 = ((Object) (new ECBlocks(28, new ECB(6, 15), new ECB(2, 16))));
	//  630 1214:new             #9   <Class Version$ECBlocks>
	//  631 1217:dup             
	//  632 1218:bipush          28
	//  633 1220:new             #6   <Class Version$ECB>
	//  634 1223:dup             
	//  635 1224:bipush          6
	//  636 1226:bipush          15
	//  637 1228:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  638 1231:new             #6   <Class Version$ECB>
	//  639 1234:dup             
	//  640 1235:iconst_2        
	//  641 1236:bipush          16
	//  642 1238:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  643 1241:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  644 1244:astore          12
		obj9 = ((Object) (new Version(10, new int[] {
			6, 28, 50
		}, ((ECBlocks) (obj9)), ((ECBlocks) (obj10)), ((ECBlocks) (obj11)), ((ECBlocks) (obj12)))));
	//  645 1246:new             #2   <Class Version>
	//  646 1249:dup             
	//  647 1250:bipush          10
	//  648 1252:iconst_3        
	//  649 1253:newarray        int[]
	//  650 1255:dup             
	//  651 1256:iconst_0        
	//  652 1257:bipush          6
	//  653 1259:iastore         
	//  654 1260:dup             
	//  655 1261:iconst_1        
	//  656 1262:bipush          28
	//  657 1264:iastore         
	//  658 1265:dup             
	//  659 1266:iconst_2        
	//  660 1267:bipush          50
	//  661 1269:iastore         
	//  662 1270:aload           9
	//  663 1272:aload           10
	//  664 1274:aload           11
	//  665 1276:aload           12
	//  666 1278:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	//  667 1281:astore          9
		obj10 = ((Object) (new ECBlocks(20, new ECB(4, 81))));
	//  668 1283:new             #9   <Class Version$ECBlocks>
	//  669 1286:dup             
	//  670 1287:bipush          20
	//  671 1289:new             #6   <Class Version$ECB>
	//  672 1292:dup             
	//  673 1293:iconst_4        
	//  674 1294:bipush          81
	//  675 1296:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  676 1299:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//  677 1302:astore          10
		obj11 = ((Object) (new ECBlocks(30, new ECB(1, 50), new ECB(4, 51))));
	//  678 1304:new             #9   <Class Version$ECBlocks>
	//  679 1307:dup             
	//  680 1308:bipush          30
	//  681 1310:new             #6   <Class Version$ECB>
	//  682 1313:dup             
	//  683 1314:iconst_1        
	//  684 1315:bipush          50
	//  685 1317:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  686 1320:new             #6   <Class Version$ECB>
	//  687 1323:dup             
	//  688 1324:iconst_4        
	//  689 1325:bipush          51
	//  690 1327:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  691 1330:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  692 1333:astore          11
		obj12 = ((Object) (new ECBlocks(28, new ECB(4, 22), new ECB(4, 23))));
	//  693 1335:new             #9   <Class Version$ECBlocks>
	//  694 1338:dup             
	//  695 1339:bipush          28
	//  696 1341:new             #6   <Class Version$ECB>
	//  697 1344:dup             
	//  698 1345:iconst_4        
	//  699 1346:bipush          22
	//  700 1348:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  701 1351:new             #6   <Class Version$ECB>
	//  702 1354:dup             
	//  703 1355:iconst_4        
	//  704 1356:bipush          23
	//  705 1358:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  706 1361:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  707 1364:astore          12
		Object obj13 = ((Object) (new ECBlocks(24, new ECB(3, 12), new ECB(8, 13))));
	//  708 1366:new             #9   <Class Version$ECBlocks>
	//  709 1369:dup             
	//  710 1370:bipush          24
	//  711 1372:new             #6   <Class Version$ECB>
	//  712 1375:dup             
	//  713 1376:iconst_3        
	//  714 1377:bipush          12
	//  715 1379:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  716 1382:new             #6   <Class Version$ECB>
	//  717 1385:dup             
	//  718 1386:bipush          8
	//  719 1388:bipush          13
	//  720 1390:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  721 1393:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  722 1396:astore          13
		obj10 = ((Object) (new Version(11, new int[] {
			6, 30, 54
		}, ((ECBlocks) (obj10)), ((ECBlocks) (obj11)), ((ECBlocks) (obj12)), ((ECBlocks) (obj13)))));
	//  723 1398:new             #2   <Class Version>
	//  724 1401:dup             
	//  725 1402:bipush          11
	//  726 1404:iconst_3        
	//  727 1405:newarray        int[]
	//  728 1407:dup             
	//  729 1408:iconst_0        
	//  730 1409:bipush          6
	//  731 1411:iastore         
	//  732 1412:dup             
	//  733 1413:iconst_1        
	//  734 1414:bipush          30
	//  735 1416:iastore         
	//  736 1417:dup             
	//  737 1418:iconst_2        
	//  738 1419:bipush          54
	//  739 1421:iastore         
	//  740 1422:aload           10
	//  741 1424:aload           11
	//  742 1426:aload           12
	//  743 1428:aload           13
	//  744 1430:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	//  745 1433:astore          10
		obj11 = ((Object) (new ECBlocks(24, new ECB(2, 92), new ECB(2, 93))));
	//  746 1435:new             #9   <Class Version$ECBlocks>
	//  747 1438:dup             
	//  748 1439:bipush          24
	//  749 1441:new             #6   <Class Version$ECB>
	//  750 1444:dup             
	//  751 1445:iconst_2        
	//  752 1446:bipush          92
	//  753 1448:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  754 1451:new             #6   <Class Version$ECB>
	//  755 1454:dup             
	//  756 1455:iconst_2        
	//  757 1456:bipush          93
	//  758 1458:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  759 1461:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  760 1464:astore          11
		obj12 = ((Object) (new ECBlocks(22, new ECB(6, 36), new ECB(2, 37))));
	//  761 1466:new             #9   <Class Version$ECBlocks>
	//  762 1469:dup             
	//  763 1470:bipush          22
	//  764 1472:new             #6   <Class Version$ECB>
	//  765 1475:dup             
	//  766 1476:bipush          6
	//  767 1478:bipush          36
	//  768 1480:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  769 1483:new             #6   <Class Version$ECB>
	//  770 1486:dup             
	//  771 1487:iconst_2        
	//  772 1488:bipush          37
	//  773 1490:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  774 1493:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  775 1496:astore          12
		obj13 = ((Object) (new ECBlocks(26, new ECB(4, 20), new ECB(6, 21))));
	//  776 1498:new             #9   <Class Version$ECBlocks>
	//  777 1501:dup             
	//  778 1502:bipush          26
	//  779 1504:new             #6   <Class Version$ECB>
	//  780 1507:dup             
	//  781 1508:iconst_4        
	//  782 1509:bipush          20
	//  783 1511:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  784 1514:new             #6   <Class Version$ECB>
	//  785 1517:dup             
	//  786 1518:bipush          6
	//  787 1520:bipush          21
	//  788 1522:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  789 1525:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  790 1528:astore          13
		Object obj14 = ((Object) (new ECBlocks(28, new ECB(7, 14), new ECB(4, 15))));
	//  791 1530:new             #9   <Class Version$ECBlocks>
	//  792 1533:dup             
	//  793 1534:bipush          28
	//  794 1536:new             #6   <Class Version$ECB>
	//  795 1539:dup             
	//  796 1540:bipush          7
	//  797 1542:bipush          14
	//  798 1544:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  799 1547:new             #6   <Class Version$ECB>
	//  800 1550:dup             
	//  801 1551:iconst_4        
	//  802 1552:bipush          15
	//  803 1554:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  804 1557:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  805 1560:astore          14
		obj11 = ((Object) (new Version(12, new int[] {
			6, 32, 58
		}, ((ECBlocks) (obj11)), ((ECBlocks) (obj12)), ((ECBlocks) (obj13)), ((ECBlocks) (obj14)))));
	//  806 1562:new             #2   <Class Version>
	//  807 1565:dup             
	//  808 1566:bipush          12
	//  809 1568:iconst_3        
	//  810 1569:newarray        int[]
	//  811 1571:dup             
	//  812 1572:iconst_0        
	//  813 1573:bipush          6
	//  814 1575:iastore         
	//  815 1576:dup             
	//  816 1577:iconst_1        
	//  817 1578:bipush          32
	//  818 1580:iastore         
	//  819 1581:dup             
	//  820 1582:iconst_2        
	//  821 1583:bipush          58
	//  822 1585:iastore         
	//  823 1586:aload           11
	//  824 1588:aload           12
	//  825 1590:aload           13
	//  826 1592:aload           14
	//  827 1594:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	//  828 1597:astore          11
		obj12 = ((Object) (new ECBlocks(26, new ECB(4, 107))));
	//  829 1599:new             #9   <Class Version$ECBlocks>
	//  830 1602:dup             
	//  831 1603:bipush          26
	//  832 1605:new             #6   <Class Version$ECB>
	//  833 1608:dup             
	//  834 1609:iconst_4        
	//  835 1610:bipush          107
	//  836 1612:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  837 1615:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	//  838 1618:astore          12
		obj13 = ((Object) (new ECBlocks(22, new ECB(8, 37), new ECB(1, 38))));
	//  839 1620:new             #9   <Class Version$ECBlocks>
	//  840 1623:dup             
	//  841 1624:bipush          22
	//  842 1626:new             #6   <Class Version$ECB>
	//  843 1629:dup             
	//  844 1630:bipush          8
	//  845 1632:bipush          37
	//  846 1634:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  847 1637:new             #6   <Class Version$ECB>
	//  848 1640:dup             
	//  849 1641:iconst_1        
	//  850 1642:bipush          38
	//  851 1644:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  852 1647:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  853 1650:astore          13
		obj14 = ((Object) (new ECBlocks(24, new ECB(8, 20), new ECB(4, 21))));
	//  854 1652:new             #9   <Class Version$ECBlocks>
	//  855 1655:dup             
	//  856 1656:bipush          24
	//  857 1658:new             #6   <Class Version$ECB>
	//  858 1661:dup             
	//  859 1662:bipush          8
	//  860 1664:bipush          20
	//  861 1666:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  862 1669:new             #6   <Class Version$ECB>
	//  863 1672:dup             
	//  864 1673:iconst_4        
	//  865 1674:bipush          21
	//  866 1676:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  867 1679:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  868 1682:astore          14
		Object obj15 = ((Object) (new ECBlocks(22, new ECB(12, 11), new ECB(4, 12))));
	//  869 1684:new             #9   <Class Version$ECBlocks>
	//  870 1687:dup             
	//  871 1688:bipush          22
	//  872 1690:new             #6   <Class Version$ECB>
	//  873 1693:dup             
	//  874 1694:bipush          12
	//  875 1696:bipush          11
	//  876 1698:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  877 1701:new             #6   <Class Version$ECB>
	//  878 1704:dup             
	//  879 1705:iconst_4        
	//  880 1706:bipush          12
	//  881 1708:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  882 1711:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  883 1714:astore          15
		obj12 = ((Object) (new Version(13, new int[] {
			6, 34, 62
		}, ((ECBlocks) (obj12)), ((ECBlocks) (obj13)), ((ECBlocks) (obj14)), ((ECBlocks) (obj15)))));
	//  884 1716:new             #2   <Class Version>
	//  885 1719:dup             
	//  886 1720:bipush          13
	//  887 1722:iconst_3        
	//  888 1723:newarray        int[]
	//  889 1725:dup             
	//  890 1726:iconst_0        
	//  891 1727:bipush          6
	//  892 1729:iastore         
	//  893 1730:dup             
	//  894 1731:iconst_1        
	//  895 1732:bipush          34
	//  896 1734:iastore         
	//  897 1735:dup             
	//  898 1736:iconst_2        
	//  899 1737:bipush          62
	//  900 1739:iastore         
	//  901 1740:aload           12
	//  902 1742:aload           13
	//  903 1744:aload           14
	//  904 1746:aload           15
	//  905 1748:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	//  906 1751:astore          12
		obj13 = ((Object) (new ECBlocks(30, new ECB(3, 115), new ECB(1, 116))));
	//  907 1753:new             #9   <Class Version$ECBlocks>
	//  908 1756:dup             
	//  909 1757:bipush          30
	//  910 1759:new             #6   <Class Version$ECB>
	//  911 1762:dup             
	//  912 1763:iconst_3        
	//  913 1764:bipush          115
	//  914 1766:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  915 1769:new             #6   <Class Version$ECB>
	//  916 1772:dup             
	//  917 1773:iconst_1        
	//  918 1774:bipush          116
	//  919 1776:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  920 1779:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  921 1782:astore          13
		obj14 = ((Object) (new ECBlocks(24, new ECB(4, 40), new ECB(5, 41))));
	//  922 1784:new             #9   <Class Version$ECBlocks>
	//  923 1787:dup             
	//  924 1788:bipush          24
	//  925 1790:new             #6   <Class Version$ECB>
	//  926 1793:dup             
	//  927 1794:iconst_4        
	//  928 1795:bipush          40
	//  929 1797:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  930 1800:new             #6   <Class Version$ECB>
	//  931 1803:dup             
	//  932 1804:iconst_5        
	//  933 1805:bipush          41
	//  934 1807:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  935 1810:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  936 1813:astore          14
		obj15 = ((Object) (new ECBlocks(20, new ECB(11, 16), new ECB(5, 17))));
	//  937 1815:new             #9   <Class Version$ECBlocks>
	//  938 1818:dup             
	//  939 1819:bipush          20
	//  940 1821:new             #6   <Class Version$ECB>
	//  941 1824:dup             
	//  942 1825:bipush          11
	//  943 1827:bipush          16
	//  944 1829:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  945 1832:new             #6   <Class Version$ECB>
	//  946 1835:dup             
	//  947 1836:iconst_5        
	//  948 1837:bipush          17
	//  949 1839:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  950 1842:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  951 1845:astore          15
		Object obj16 = ((Object) (new ECBlocks(24, new ECB(11, 12), new ECB(5, 13))));
	//  952 1847:new             #9   <Class Version$ECBlocks>
	//  953 1850:dup             
	//  954 1851:bipush          24
	//  955 1853:new             #6   <Class Version$ECB>
	//  956 1856:dup             
	//  957 1857:bipush          11
	//  958 1859:bipush          12
	//  959 1861:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  960 1864:new             #6   <Class Version$ECB>
	//  961 1867:dup             
	//  962 1868:iconst_5        
	//  963 1869:bipush          13
	//  964 1871:invokespecial   #93  <Method void Version$ECB(int, int)>
	//  965 1874:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	//  966 1877:astore          16
		obj13 = ((Object) (new Version(14, new int[] {
			6, 26, 46, 66
		}, ((ECBlocks) (obj13)), ((ECBlocks) (obj14)), ((ECBlocks) (obj15)), ((ECBlocks) (obj16)))));
	//  967 1879:new             #2   <Class Version>
	//  968 1882:dup             
	//  969 1883:bipush          14
	//  970 1885:iconst_4        
	//  971 1886:newarray        int[]
	//  972 1888:dup             
	//  973 1889:iconst_0        
	//  974 1890:bipush          6
	//  975 1892:iastore         
	//  976 1893:dup             
	//  977 1894:iconst_1        
	//  978 1895:bipush          26
	//  979 1897:iastore         
	//  980 1898:dup             
	//  981 1899:iconst_2        
	//  982 1900:bipush          46
	//  983 1902:iastore         
	//  984 1903:dup             
	//  985 1904:iconst_3        
	//  986 1905:bipush          66
	//  987 1907:iastore         
	//  988 1908:aload           13
	//  989 1910:aload           14
	//  990 1912:aload           15
	//  991 1914:aload           16
	//  992 1916:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	//  993 1919:astore          13
		obj14 = ((Object) (new ECBlocks(22, new ECB(5, 87), new ECB(1, 88))));
	//  994 1921:new             #9   <Class Version$ECBlocks>
	//  995 1924:dup             
	//  996 1925:bipush          22
	//  997 1927:new             #6   <Class Version$ECB>
	//  998 1930:dup             
	//  999 1931:iconst_5        
	// 1000 1932:bipush          87
	// 1001 1934:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1002 1937:new             #6   <Class Version$ECB>
	// 1003 1940:dup             
	// 1004 1941:iconst_1        
	// 1005 1942:bipush          88
	// 1006 1944:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1007 1947:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1008 1950:astore          14
		obj15 = ((Object) (new ECBlocks(24, new ECB(5, 41), new ECB(5, 42))));
	// 1009 1952:new             #9   <Class Version$ECBlocks>
	// 1010 1955:dup             
	// 1011 1956:bipush          24
	// 1012 1958:new             #6   <Class Version$ECB>
	// 1013 1961:dup             
	// 1014 1962:iconst_5        
	// 1015 1963:bipush          41
	// 1016 1965:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1017 1968:new             #6   <Class Version$ECB>
	// 1018 1971:dup             
	// 1019 1972:iconst_5        
	// 1020 1973:bipush          42
	// 1021 1975:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1022 1978:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1023 1981:astore          15
		obj16 = ((Object) (new ECBlocks(30, new ECB(5, 24), new ECB(7, 25))));
	// 1024 1983:new             #9   <Class Version$ECBlocks>
	// 1025 1986:dup             
	// 1026 1987:bipush          30
	// 1027 1989:new             #6   <Class Version$ECB>
	// 1028 1992:dup             
	// 1029 1993:iconst_5        
	// 1030 1994:bipush          24
	// 1031 1996:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1032 1999:new             #6   <Class Version$ECB>
	// 1033 2002:dup             
	// 1034 2003:bipush          7
	// 1035 2005:bipush          25
	// 1036 2007:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1037 2010:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1038 2013:astore          16
		Object obj17 = ((Object) (new ECBlocks(24, new ECB(11, 12), new ECB(7, 13))));
	// 1039 2015:new             #9   <Class Version$ECBlocks>
	// 1040 2018:dup             
	// 1041 2019:bipush          24
	// 1042 2021:new             #6   <Class Version$ECB>
	// 1043 2024:dup             
	// 1044 2025:bipush          11
	// 1045 2027:bipush          12
	// 1046 2029:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1047 2032:new             #6   <Class Version$ECB>
	// 1048 2035:dup             
	// 1049 2036:bipush          7
	// 1050 2038:bipush          13
	// 1051 2040:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1052 2043:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1053 2046:astore          17
		obj14 = ((Object) (new Version(15, new int[] {
			6, 26, 48, 70
		}, ((ECBlocks) (obj14)), ((ECBlocks) (obj15)), ((ECBlocks) (obj16)), ((ECBlocks) (obj17)))));
	// 1054 2048:new             #2   <Class Version>
	// 1055 2051:dup             
	// 1056 2052:bipush          15
	// 1057 2054:iconst_4        
	// 1058 2055:newarray        int[]
	// 1059 2057:dup             
	// 1060 2058:iconst_0        
	// 1061 2059:bipush          6
	// 1062 2061:iastore         
	// 1063 2062:dup             
	// 1064 2063:iconst_1        
	// 1065 2064:bipush          26
	// 1066 2066:iastore         
	// 1067 2067:dup             
	// 1068 2068:iconst_2        
	// 1069 2069:bipush          48
	// 1070 2071:iastore         
	// 1071 2072:dup             
	// 1072 2073:iconst_3        
	// 1073 2074:bipush          70
	// 1074 2076:iastore         
	// 1075 2077:aload           14
	// 1076 2079:aload           15
	// 1077 2081:aload           16
	// 1078 2083:aload           17
	// 1079 2085:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 1080 2088:astore          14
		obj15 = ((Object) (new ECBlocks(24, new ECB(5, 98), new ECB(1, 99))));
	// 1081 2090:new             #9   <Class Version$ECBlocks>
	// 1082 2093:dup             
	// 1083 2094:bipush          24
	// 1084 2096:new             #6   <Class Version$ECB>
	// 1085 2099:dup             
	// 1086 2100:iconst_5        
	// 1087 2101:bipush          98
	// 1088 2103:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1089 2106:new             #6   <Class Version$ECB>
	// 1090 2109:dup             
	// 1091 2110:iconst_1        
	// 1092 2111:bipush          99
	// 1093 2113:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1094 2116:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1095 2119:astore          15
		obj16 = ((Object) (new ECBlocks(28, new ECB(7, 45), new ECB(3, 46))));
	// 1096 2121:new             #9   <Class Version$ECBlocks>
	// 1097 2124:dup             
	// 1098 2125:bipush          28
	// 1099 2127:new             #6   <Class Version$ECB>
	// 1100 2130:dup             
	// 1101 2131:bipush          7
	// 1102 2133:bipush          45
	// 1103 2135:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1104 2138:new             #6   <Class Version$ECB>
	// 1105 2141:dup             
	// 1106 2142:iconst_3        
	// 1107 2143:bipush          46
	// 1108 2145:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1109 2148:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1110 2151:astore          16
		obj17 = ((Object) (new ECBlocks(24, new ECB(15, 19), new ECB(2, 20))));
	// 1111 2153:new             #9   <Class Version$ECBlocks>
	// 1112 2156:dup             
	// 1113 2157:bipush          24
	// 1114 2159:new             #6   <Class Version$ECB>
	// 1115 2162:dup             
	// 1116 2163:bipush          15
	// 1117 2165:bipush          19
	// 1118 2167:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1119 2170:new             #6   <Class Version$ECB>
	// 1120 2173:dup             
	// 1121 2174:iconst_2        
	// 1122 2175:bipush          20
	// 1123 2177:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1124 2180:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1125 2183:astore          17
		Object obj18 = ((Object) (new ECBlocks(30, new ECB(3, 15), new ECB(13, 16))));
	// 1126 2185:new             #9   <Class Version$ECBlocks>
	// 1127 2188:dup             
	// 1128 2189:bipush          30
	// 1129 2191:new             #6   <Class Version$ECB>
	// 1130 2194:dup             
	// 1131 2195:iconst_3        
	// 1132 2196:bipush          15
	// 1133 2198:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1134 2201:new             #6   <Class Version$ECB>
	// 1135 2204:dup             
	// 1136 2205:bipush          13
	// 1137 2207:bipush          16
	// 1138 2209:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1139 2212:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1140 2215:astore          18
		obj15 = ((Object) (new Version(16, new int[] {
			6, 26, 50, 74
		}, ((ECBlocks) (obj15)), ((ECBlocks) (obj16)), ((ECBlocks) (obj17)), ((ECBlocks) (obj18)))));
	// 1141 2217:new             #2   <Class Version>
	// 1142 2220:dup             
	// 1143 2221:bipush          16
	// 1144 2223:iconst_4        
	// 1145 2224:newarray        int[]
	// 1146 2226:dup             
	// 1147 2227:iconst_0        
	// 1148 2228:bipush          6
	// 1149 2230:iastore         
	// 1150 2231:dup             
	// 1151 2232:iconst_1        
	// 1152 2233:bipush          26
	// 1153 2235:iastore         
	// 1154 2236:dup             
	// 1155 2237:iconst_2        
	// 1156 2238:bipush          50
	// 1157 2240:iastore         
	// 1158 2241:dup             
	// 1159 2242:iconst_3        
	// 1160 2243:bipush          74
	// 1161 2245:iastore         
	// 1162 2246:aload           15
	// 1163 2248:aload           16
	// 1164 2250:aload           17
	// 1165 2252:aload           18
	// 1166 2254:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 1167 2257:astore          15
		obj16 = ((Object) (new ECBlocks(28, new ECB(1, 107), new ECB(5, 108))));
	// 1168 2259:new             #9   <Class Version$ECBlocks>
	// 1169 2262:dup             
	// 1170 2263:bipush          28
	// 1171 2265:new             #6   <Class Version$ECB>
	// 1172 2268:dup             
	// 1173 2269:iconst_1        
	// 1174 2270:bipush          107
	// 1175 2272:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1176 2275:new             #6   <Class Version$ECB>
	// 1177 2278:dup             
	// 1178 2279:iconst_5        
	// 1179 2280:bipush          108
	// 1180 2282:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1181 2285:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1182 2288:astore          16
		obj17 = ((Object) (new ECBlocks(28, new ECB(10, 46), new ECB(1, 47))));
	// 1183 2290:new             #9   <Class Version$ECBlocks>
	// 1184 2293:dup             
	// 1185 2294:bipush          28
	// 1186 2296:new             #6   <Class Version$ECB>
	// 1187 2299:dup             
	// 1188 2300:bipush          10
	// 1189 2302:bipush          46
	// 1190 2304:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1191 2307:new             #6   <Class Version$ECB>
	// 1192 2310:dup             
	// 1193 2311:iconst_1        
	// 1194 2312:bipush          47
	// 1195 2314:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1196 2317:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1197 2320:astore          17
		obj18 = ((Object) (new ECBlocks(28, new ECB(1, 22), new ECB(15, 23))));
	// 1198 2322:new             #9   <Class Version$ECBlocks>
	// 1199 2325:dup             
	// 1200 2326:bipush          28
	// 1201 2328:new             #6   <Class Version$ECB>
	// 1202 2331:dup             
	// 1203 2332:iconst_1        
	// 1204 2333:bipush          22
	// 1205 2335:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1206 2338:new             #6   <Class Version$ECB>
	// 1207 2341:dup             
	// 1208 2342:bipush          15
	// 1209 2344:bipush          23
	// 1210 2346:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1211 2349:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1212 2352:astore          18
		Object obj19 = ((Object) (new ECBlocks(28, new ECB(2, 14), new ECB(17, 15))));
	// 1213 2354:new             #9   <Class Version$ECBlocks>
	// 1214 2357:dup             
	// 1215 2358:bipush          28
	// 1216 2360:new             #6   <Class Version$ECB>
	// 1217 2363:dup             
	// 1218 2364:iconst_2        
	// 1219 2365:bipush          14
	// 1220 2367:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1221 2370:new             #6   <Class Version$ECB>
	// 1222 2373:dup             
	// 1223 2374:bipush          17
	// 1224 2376:bipush          15
	// 1225 2378:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1226 2381:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1227 2384:astore          19
		obj16 = ((Object) (new Version(17, new int[] {
			6, 30, 54, 78
		}, ((ECBlocks) (obj16)), ((ECBlocks) (obj17)), ((ECBlocks) (obj18)), ((ECBlocks) (obj19)))));
	// 1228 2386:new             #2   <Class Version>
	// 1229 2389:dup             
	// 1230 2390:bipush          17
	// 1231 2392:iconst_4        
	// 1232 2393:newarray        int[]
	// 1233 2395:dup             
	// 1234 2396:iconst_0        
	// 1235 2397:bipush          6
	// 1236 2399:iastore         
	// 1237 2400:dup             
	// 1238 2401:iconst_1        
	// 1239 2402:bipush          30
	// 1240 2404:iastore         
	// 1241 2405:dup             
	// 1242 2406:iconst_2        
	// 1243 2407:bipush          54
	// 1244 2409:iastore         
	// 1245 2410:dup             
	// 1246 2411:iconst_3        
	// 1247 2412:bipush          78
	// 1248 2414:iastore         
	// 1249 2415:aload           16
	// 1250 2417:aload           17
	// 1251 2419:aload           18
	// 1252 2421:aload           19
	// 1253 2423:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 1254 2426:astore          16
		obj17 = ((Object) (new ECBlocks(30, new ECB(5, 120), new ECB(1, 121))));
	// 1255 2428:new             #9   <Class Version$ECBlocks>
	// 1256 2431:dup             
	// 1257 2432:bipush          30
	// 1258 2434:new             #6   <Class Version$ECB>
	// 1259 2437:dup             
	// 1260 2438:iconst_5        
	// 1261 2439:bipush          120
	// 1262 2441:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1263 2444:new             #6   <Class Version$ECB>
	// 1264 2447:dup             
	// 1265 2448:iconst_1        
	// 1266 2449:bipush          121
	// 1267 2451:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1268 2454:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1269 2457:astore          17
		obj18 = ((Object) (new ECBlocks(26, new ECB(9, 43), new ECB(4, 44))));
	// 1270 2459:new             #9   <Class Version$ECBlocks>
	// 1271 2462:dup             
	// 1272 2463:bipush          26
	// 1273 2465:new             #6   <Class Version$ECB>
	// 1274 2468:dup             
	// 1275 2469:bipush          9
	// 1276 2471:bipush          43
	// 1277 2473:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1278 2476:new             #6   <Class Version$ECB>
	// 1279 2479:dup             
	// 1280 2480:iconst_4        
	// 1281 2481:bipush          44
	// 1282 2483:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1283 2486:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1284 2489:astore          18
		obj19 = ((Object) (new ECBlocks(28, new ECB(17, 22), new ECB(1, 23))));
	// 1285 2491:new             #9   <Class Version$ECBlocks>
	// 1286 2494:dup             
	// 1287 2495:bipush          28
	// 1288 2497:new             #6   <Class Version$ECB>
	// 1289 2500:dup             
	// 1290 2501:bipush          17
	// 1291 2503:bipush          22
	// 1292 2505:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1293 2508:new             #6   <Class Version$ECB>
	// 1294 2511:dup             
	// 1295 2512:iconst_1        
	// 1296 2513:bipush          23
	// 1297 2515:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1298 2518:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1299 2521:astore          19
		Object obj20 = ((Object) (new ECBlocks(28, new ECB(2, 14), new ECB(19, 15))));
	// 1300 2523:new             #9   <Class Version$ECBlocks>
	// 1301 2526:dup             
	// 1302 2527:bipush          28
	// 1303 2529:new             #6   <Class Version$ECB>
	// 1304 2532:dup             
	// 1305 2533:iconst_2        
	// 1306 2534:bipush          14
	// 1307 2536:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1308 2539:new             #6   <Class Version$ECB>
	// 1309 2542:dup             
	// 1310 2543:bipush          19
	// 1311 2545:bipush          15
	// 1312 2547:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1313 2550:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1314 2553:astore          20
		obj17 = ((Object) (new Version(18, new int[] {
			6, 30, 56, 82
		}, ((ECBlocks) (obj17)), ((ECBlocks) (obj18)), ((ECBlocks) (obj19)), ((ECBlocks) (obj20)))));
	// 1315 2555:new             #2   <Class Version>
	// 1316 2558:dup             
	// 1317 2559:bipush          18
	// 1318 2561:iconst_4        
	// 1319 2562:newarray        int[]
	// 1320 2564:dup             
	// 1321 2565:iconst_0        
	// 1322 2566:bipush          6
	// 1323 2568:iastore         
	// 1324 2569:dup             
	// 1325 2570:iconst_1        
	// 1326 2571:bipush          30
	// 1327 2573:iastore         
	// 1328 2574:dup             
	// 1329 2575:iconst_2        
	// 1330 2576:bipush          56
	// 1331 2578:iastore         
	// 1332 2579:dup             
	// 1333 2580:iconst_3        
	// 1334 2581:bipush          82
	// 1335 2583:iastore         
	// 1336 2584:aload           17
	// 1337 2586:aload           18
	// 1338 2588:aload           19
	// 1339 2590:aload           20
	// 1340 2592:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 1341 2595:astore          17
		obj18 = ((Object) (new ECBlocks(28, new ECB(3, 113), new ECB(4, 114))));
	// 1342 2597:new             #9   <Class Version$ECBlocks>
	// 1343 2600:dup             
	// 1344 2601:bipush          28
	// 1345 2603:new             #6   <Class Version$ECB>
	// 1346 2606:dup             
	// 1347 2607:iconst_3        
	// 1348 2608:bipush          113
	// 1349 2610:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1350 2613:new             #6   <Class Version$ECB>
	// 1351 2616:dup             
	// 1352 2617:iconst_4        
	// 1353 2618:bipush          114
	// 1354 2620:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1355 2623:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1356 2626:astore          18
		obj19 = ((Object) (new ECBlocks(26, new ECB(3, 44), new ECB(11, 45))));
	// 1357 2628:new             #9   <Class Version$ECBlocks>
	// 1358 2631:dup             
	// 1359 2632:bipush          26
	// 1360 2634:new             #6   <Class Version$ECB>
	// 1361 2637:dup             
	// 1362 2638:iconst_3        
	// 1363 2639:bipush          44
	// 1364 2641:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1365 2644:new             #6   <Class Version$ECB>
	// 1366 2647:dup             
	// 1367 2648:bipush          11
	// 1368 2650:bipush          45
	// 1369 2652:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1370 2655:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1371 2658:astore          19
		obj20 = ((Object) (new ECBlocks(26, new ECB(17, 21), new ECB(4, 22))));
	// 1372 2660:new             #9   <Class Version$ECBlocks>
	// 1373 2663:dup             
	// 1374 2664:bipush          26
	// 1375 2666:new             #6   <Class Version$ECB>
	// 1376 2669:dup             
	// 1377 2670:bipush          17
	// 1378 2672:bipush          21
	// 1379 2674:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1380 2677:new             #6   <Class Version$ECB>
	// 1381 2680:dup             
	// 1382 2681:iconst_4        
	// 1383 2682:bipush          22
	// 1384 2684:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1385 2687:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1386 2690:astore          20
		Object obj21 = ((Object) (new ECBlocks(26, new ECB(9, 13), new ECB(16, 14))));
	// 1387 2692:new             #9   <Class Version$ECBlocks>
	// 1388 2695:dup             
	// 1389 2696:bipush          26
	// 1390 2698:new             #6   <Class Version$ECB>
	// 1391 2701:dup             
	// 1392 2702:bipush          9
	// 1393 2704:bipush          13
	// 1394 2706:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1395 2709:new             #6   <Class Version$ECB>
	// 1396 2712:dup             
	// 1397 2713:bipush          16
	// 1398 2715:bipush          14
	// 1399 2717:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1400 2720:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1401 2723:astore          21
		obj18 = ((Object) (new Version(19, new int[] {
			6, 30, 58, 86
		}, ((ECBlocks) (obj18)), ((ECBlocks) (obj19)), ((ECBlocks) (obj20)), ((ECBlocks) (obj21)))));
	// 1402 2725:new             #2   <Class Version>
	// 1403 2728:dup             
	// 1404 2729:bipush          19
	// 1405 2731:iconst_4        
	// 1406 2732:newarray        int[]
	// 1407 2734:dup             
	// 1408 2735:iconst_0        
	// 1409 2736:bipush          6
	// 1410 2738:iastore         
	// 1411 2739:dup             
	// 1412 2740:iconst_1        
	// 1413 2741:bipush          30
	// 1414 2743:iastore         
	// 1415 2744:dup             
	// 1416 2745:iconst_2        
	// 1417 2746:bipush          58
	// 1418 2748:iastore         
	// 1419 2749:dup             
	// 1420 2750:iconst_3        
	// 1421 2751:bipush          86
	// 1422 2753:iastore         
	// 1423 2754:aload           18
	// 1424 2756:aload           19
	// 1425 2758:aload           20
	// 1426 2760:aload           21
	// 1427 2762:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 1428 2765:astore          18
		obj19 = ((Object) (new ECBlocks(28, new ECB(3, 107), new ECB(5, 108))));
	// 1429 2767:new             #9   <Class Version$ECBlocks>
	// 1430 2770:dup             
	// 1431 2771:bipush          28
	// 1432 2773:new             #6   <Class Version$ECB>
	// 1433 2776:dup             
	// 1434 2777:iconst_3        
	// 1435 2778:bipush          107
	// 1436 2780:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1437 2783:new             #6   <Class Version$ECB>
	// 1438 2786:dup             
	// 1439 2787:iconst_5        
	// 1440 2788:bipush          108
	// 1441 2790:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1442 2793:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1443 2796:astore          19
		obj20 = ((Object) (new ECBlocks(26, new ECB(3, 41), new ECB(13, 42))));
	// 1444 2798:new             #9   <Class Version$ECBlocks>
	// 1445 2801:dup             
	// 1446 2802:bipush          26
	// 1447 2804:new             #6   <Class Version$ECB>
	// 1448 2807:dup             
	// 1449 2808:iconst_3        
	// 1450 2809:bipush          41
	// 1451 2811:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1452 2814:new             #6   <Class Version$ECB>
	// 1453 2817:dup             
	// 1454 2818:bipush          13
	// 1455 2820:bipush          42
	// 1456 2822:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1457 2825:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1458 2828:astore          20
		obj21 = ((Object) (new ECBlocks(30, new ECB(15, 24), new ECB(5, 25))));
	// 1459 2830:new             #9   <Class Version$ECBlocks>
	// 1460 2833:dup             
	// 1461 2834:bipush          30
	// 1462 2836:new             #6   <Class Version$ECB>
	// 1463 2839:dup             
	// 1464 2840:bipush          15
	// 1465 2842:bipush          24
	// 1466 2844:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1467 2847:new             #6   <Class Version$ECB>
	// 1468 2850:dup             
	// 1469 2851:iconst_5        
	// 1470 2852:bipush          25
	// 1471 2854:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1472 2857:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1473 2860:astore          21
		Object obj22 = ((Object) (new ECBlocks(28, new ECB(15, 15), new ECB(10, 16))));
	// 1474 2862:new             #9   <Class Version$ECBlocks>
	// 1475 2865:dup             
	// 1476 2866:bipush          28
	// 1477 2868:new             #6   <Class Version$ECB>
	// 1478 2871:dup             
	// 1479 2872:bipush          15
	// 1480 2874:bipush          15
	// 1481 2876:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1482 2879:new             #6   <Class Version$ECB>
	// 1483 2882:dup             
	// 1484 2883:bipush          10
	// 1485 2885:bipush          16
	// 1486 2887:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1487 2890:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1488 2893:astore          22
		obj19 = ((Object) (new Version(20, new int[] {
			6, 34, 62, 90
		}, ((ECBlocks) (obj19)), ((ECBlocks) (obj20)), ((ECBlocks) (obj21)), ((ECBlocks) (obj22)))));
	// 1489 2895:new             #2   <Class Version>
	// 1490 2898:dup             
	// 1491 2899:bipush          20
	// 1492 2901:iconst_4        
	// 1493 2902:newarray        int[]
	// 1494 2904:dup             
	// 1495 2905:iconst_0        
	// 1496 2906:bipush          6
	// 1497 2908:iastore         
	// 1498 2909:dup             
	// 1499 2910:iconst_1        
	// 1500 2911:bipush          34
	// 1501 2913:iastore         
	// 1502 2914:dup             
	// 1503 2915:iconst_2        
	// 1504 2916:bipush          62
	// 1505 2918:iastore         
	// 1506 2919:dup             
	// 1507 2920:iconst_3        
	// 1508 2921:bipush          90
	// 1509 2923:iastore         
	// 1510 2924:aload           19
	// 1511 2926:aload           20
	// 1512 2928:aload           21
	// 1513 2930:aload           22
	// 1514 2932:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 1515 2935:astore          19
		obj20 = ((Object) (new ECBlocks(28, new ECB(4, 116), new ECB(4, 117))));
	// 1516 2937:new             #9   <Class Version$ECBlocks>
	// 1517 2940:dup             
	// 1518 2941:bipush          28
	// 1519 2943:new             #6   <Class Version$ECB>
	// 1520 2946:dup             
	// 1521 2947:iconst_4        
	// 1522 2948:bipush          116
	// 1523 2950:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1524 2953:new             #6   <Class Version$ECB>
	// 1525 2956:dup             
	// 1526 2957:iconst_4        
	// 1527 2958:bipush          117
	// 1528 2960:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1529 2963:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1530 2966:astore          20
		obj21 = ((Object) (new ECBlocks(26, new ECB(17, 42))));
	// 1531 2968:new             #9   <Class Version$ECBlocks>
	// 1532 2971:dup             
	// 1533 2972:bipush          26
	// 1534 2974:new             #6   <Class Version$ECB>
	// 1535 2977:dup             
	// 1536 2978:bipush          17
	// 1537 2980:bipush          42
	// 1538 2982:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1539 2985:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	// 1540 2988:astore          21
		obj22 = ((Object) (new ECBlocks(28, new ECB(17, 22), new ECB(6, 23))));
	// 1541 2990:new             #9   <Class Version$ECBlocks>
	// 1542 2993:dup             
	// 1543 2994:bipush          28
	// 1544 2996:new             #6   <Class Version$ECB>
	// 1545 2999:dup             
	// 1546 3000:bipush          17
	// 1547 3002:bipush          22
	// 1548 3004:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1549 3007:new             #6   <Class Version$ECB>
	// 1550 3010:dup             
	// 1551 3011:bipush          6
	// 1552 3013:bipush          23
	// 1553 3015:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1554 3018:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1555 3021:astore          22
		Object obj23 = ((Object) (new ECBlocks(30, new ECB(19, 16), new ECB(6, 17))));
	// 1556 3023:new             #9   <Class Version$ECBlocks>
	// 1557 3026:dup             
	// 1558 3027:bipush          30
	// 1559 3029:new             #6   <Class Version$ECB>
	// 1560 3032:dup             
	// 1561 3033:bipush          19
	// 1562 3035:bipush          16
	// 1563 3037:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1564 3040:new             #6   <Class Version$ECB>
	// 1565 3043:dup             
	// 1566 3044:bipush          6
	// 1567 3046:bipush          17
	// 1568 3048:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1569 3051:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1570 3054:astore          23
		obj20 = ((Object) (new Version(21, new int[] {
			6, 28, 50, 72, 94
		}, ((ECBlocks) (obj20)), ((ECBlocks) (obj21)), ((ECBlocks) (obj22)), ((ECBlocks) (obj23)))));
	// 1571 3056:new             #2   <Class Version>
	// 1572 3059:dup             
	// 1573 3060:bipush          21
	// 1574 3062:iconst_5        
	// 1575 3063:newarray        int[]
	// 1576 3065:dup             
	// 1577 3066:iconst_0        
	// 1578 3067:bipush          6
	// 1579 3069:iastore         
	// 1580 3070:dup             
	// 1581 3071:iconst_1        
	// 1582 3072:bipush          28
	// 1583 3074:iastore         
	// 1584 3075:dup             
	// 1585 3076:iconst_2        
	// 1586 3077:bipush          50
	// 1587 3079:iastore         
	// 1588 3080:dup             
	// 1589 3081:iconst_3        
	// 1590 3082:bipush          72
	// 1591 3084:iastore         
	// 1592 3085:dup             
	// 1593 3086:iconst_4        
	// 1594 3087:bipush          94
	// 1595 3089:iastore         
	// 1596 3090:aload           20
	// 1597 3092:aload           21
	// 1598 3094:aload           22
	// 1599 3096:aload           23
	// 1600 3098:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 1601 3101:astore          20
		obj21 = ((Object) (new ECBlocks(28, new ECB(2, 111), new ECB(7, 112))));
	// 1602 3103:new             #9   <Class Version$ECBlocks>
	// 1603 3106:dup             
	// 1604 3107:bipush          28
	// 1605 3109:new             #6   <Class Version$ECB>
	// 1606 3112:dup             
	// 1607 3113:iconst_2        
	// 1608 3114:bipush          111
	// 1609 3116:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1610 3119:new             #6   <Class Version$ECB>
	// 1611 3122:dup             
	// 1612 3123:bipush          7
	// 1613 3125:bipush          112
	// 1614 3127:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1615 3130:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1616 3133:astore          21
		obj22 = ((Object) (new ECBlocks(28, new ECB(17, 46))));
	// 1617 3135:new             #9   <Class Version$ECBlocks>
	// 1618 3138:dup             
	// 1619 3139:bipush          28
	// 1620 3141:new             #6   <Class Version$ECB>
	// 1621 3144:dup             
	// 1622 3145:bipush          17
	// 1623 3147:bipush          46
	// 1624 3149:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1625 3152:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	// 1626 3155:astore          22
		obj23 = ((Object) (new ECBlocks(30, new ECB(7, 24), new ECB(16, 25))));
	// 1627 3157:new             #9   <Class Version$ECBlocks>
	// 1628 3160:dup             
	// 1629 3161:bipush          30
	// 1630 3163:new             #6   <Class Version$ECB>
	// 1631 3166:dup             
	// 1632 3167:bipush          7
	// 1633 3169:bipush          24
	// 1634 3171:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1635 3174:new             #6   <Class Version$ECB>
	// 1636 3177:dup             
	// 1637 3178:bipush          16
	// 1638 3180:bipush          25
	// 1639 3182:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1640 3185:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1641 3188:astore          23
		Object obj24 = ((Object) (new ECBlocks(24, new ECB(34, 13))));
	// 1642 3190:new             #9   <Class Version$ECBlocks>
	// 1643 3193:dup             
	// 1644 3194:bipush          24
	// 1645 3196:new             #6   <Class Version$ECB>
	// 1646 3199:dup             
	// 1647 3200:bipush          34
	// 1648 3202:bipush          13
	// 1649 3204:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1650 3207:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	// 1651 3210:astore          24
		obj21 = ((Object) (new Version(22, new int[] {
			6, 26, 50, 74, 98
		}, ((ECBlocks) (obj21)), ((ECBlocks) (obj22)), ((ECBlocks) (obj23)), ((ECBlocks) (obj24)))));
	// 1652 3212:new             #2   <Class Version>
	// 1653 3215:dup             
	// 1654 3216:bipush          22
	// 1655 3218:iconst_5        
	// 1656 3219:newarray        int[]
	// 1657 3221:dup             
	// 1658 3222:iconst_0        
	// 1659 3223:bipush          6
	// 1660 3225:iastore         
	// 1661 3226:dup             
	// 1662 3227:iconst_1        
	// 1663 3228:bipush          26
	// 1664 3230:iastore         
	// 1665 3231:dup             
	// 1666 3232:iconst_2        
	// 1667 3233:bipush          50
	// 1668 3235:iastore         
	// 1669 3236:dup             
	// 1670 3237:iconst_3        
	// 1671 3238:bipush          74
	// 1672 3240:iastore         
	// 1673 3241:dup             
	// 1674 3242:iconst_4        
	// 1675 3243:bipush          98
	// 1676 3245:iastore         
	// 1677 3246:aload           21
	// 1678 3248:aload           22
	// 1679 3250:aload           23
	// 1680 3252:aload           24
	// 1681 3254:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 1682 3257:astore          21
		obj22 = ((Object) (new ECBlocks(30, new ECB(4, 121), new ECB(5, 122))));
	// 1683 3259:new             #9   <Class Version$ECBlocks>
	// 1684 3262:dup             
	// 1685 3263:bipush          30
	// 1686 3265:new             #6   <Class Version$ECB>
	// 1687 3268:dup             
	// 1688 3269:iconst_4        
	// 1689 3270:bipush          121
	// 1690 3272:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1691 3275:new             #6   <Class Version$ECB>
	// 1692 3278:dup             
	// 1693 3279:iconst_5        
	// 1694 3280:bipush          122
	// 1695 3282:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1696 3285:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1697 3288:astore          22
		obj23 = ((Object) (new ECBlocks(28, new ECB(4, 47), new ECB(14, 48))));
	// 1698 3290:new             #9   <Class Version$ECBlocks>
	// 1699 3293:dup             
	// 1700 3294:bipush          28
	// 1701 3296:new             #6   <Class Version$ECB>
	// 1702 3299:dup             
	// 1703 3300:iconst_4        
	// 1704 3301:bipush          47
	// 1705 3303:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1706 3306:new             #6   <Class Version$ECB>
	// 1707 3309:dup             
	// 1708 3310:bipush          14
	// 1709 3312:bipush          48
	// 1710 3314:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1711 3317:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1712 3320:astore          23
		obj24 = ((Object) (new ECBlocks(30, new ECB(11, 24), new ECB(14, 25))));
	// 1713 3322:new             #9   <Class Version$ECBlocks>
	// 1714 3325:dup             
	// 1715 3326:bipush          30
	// 1716 3328:new             #6   <Class Version$ECB>
	// 1717 3331:dup             
	// 1718 3332:bipush          11
	// 1719 3334:bipush          24
	// 1720 3336:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1721 3339:new             #6   <Class Version$ECB>
	// 1722 3342:dup             
	// 1723 3343:bipush          14
	// 1724 3345:bipush          25
	// 1725 3347:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1726 3350:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1727 3353:astore          24
		Object obj25 = ((Object) (new ECBlocks(30, new ECB(16, 15), new ECB(14, 16))));
	// 1728 3355:new             #9   <Class Version$ECBlocks>
	// 1729 3358:dup             
	// 1730 3359:bipush          30
	// 1731 3361:new             #6   <Class Version$ECB>
	// 1732 3364:dup             
	// 1733 3365:bipush          16
	// 1734 3367:bipush          15
	// 1735 3369:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1736 3372:new             #6   <Class Version$ECB>
	// 1737 3375:dup             
	// 1738 3376:bipush          14
	// 1739 3378:bipush          16
	// 1740 3380:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1741 3383:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1742 3386:astore          25
		obj22 = ((Object) (new Version(23, new int[] {
			6, 30, 54, 74, 102
		}, ((ECBlocks) (obj22)), ((ECBlocks) (obj23)), ((ECBlocks) (obj24)), ((ECBlocks) (obj25)))));
	// 1743 3388:new             #2   <Class Version>
	// 1744 3391:dup             
	// 1745 3392:bipush          23
	// 1746 3394:iconst_5        
	// 1747 3395:newarray        int[]
	// 1748 3397:dup             
	// 1749 3398:iconst_0        
	// 1750 3399:bipush          6
	// 1751 3401:iastore         
	// 1752 3402:dup             
	// 1753 3403:iconst_1        
	// 1754 3404:bipush          30
	// 1755 3406:iastore         
	// 1756 3407:dup             
	// 1757 3408:iconst_2        
	// 1758 3409:bipush          54
	// 1759 3411:iastore         
	// 1760 3412:dup             
	// 1761 3413:iconst_3        
	// 1762 3414:bipush          74
	// 1763 3416:iastore         
	// 1764 3417:dup             
	// 1765 3418:iconst_4        
	// 1766 3419:bipush          102
	// 1767 3421:iastore         
	// 1768 3422:aload           22
	// 1769 3424:aload           23
	// 1770 3426:aload           24
	// 1771 3428:aload           25
	// 1772 3430:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 1773 3433:astore          22
		obj23 = ((Object) (new ECBlocks(30, new ECB(6, 117), new ECB(4, 118))));
	// 1774 3435:new             #9   <Class Version$ECBlocks>
	// 1775 3438:dup             
	// 1776 3439:bipush          30
	// 1777 3441:new             #6   <Class Version$ECB>
	// 1778 3444:dup             
	// 1779 3445:bipush          6
	// 1780 3447:bipush          117
	// 1781 3449:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1782 3452:new             #6   <Class Version$ECB>
	// 1783 3455:dup             
	// 1784 3456:iconst_4        
	// 1785 3457:bipush          118
	// 1786 3459:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1787 3462:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1788 3465:astore          23
		obj24 = ((Object) (new ECBlocks(28, new ECB(6, 45), new ECB(14, 46))));
	// 1789 3467:new             #9   <Class Version$ECBlocks>
	// 1790 3470:dup             
	// 1791 3471:bipush          28
	// 1792 3473:new             #6   <Class Version$ECB>
	// 1793 3476:dup             
	// 1794 3477:bipush          6
	// 1795 3479:bipush          45
	// 1796 3481:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1797 3484:new             #6   <Class Version$ECB>
	// 1798 3487:dup             
	// 1799 3488:bipush          14
	// 1800 3490:bipush          46
	// 1801 3492:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1802 3495:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1803 3498:astore          24
		obj25 = ((Object) (new ECBlocks(30, new ECB(11, 24), new ECB(16, 25))));
	// 1804 3500:new             #9   <Class Version$ECBlocks>
	// 1805 3503:dup             
	// 1806 3504:bipush          30
	// 1807 3506:new             #6   <Class Version$ECB>
	// 1808 3509:dup             
	// 1809 3510:bipush          11
	// 1810 3512:bipush          24
	// 1811 3514:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1812 3517:new             #6   <Class Version$ECB>
	// 1813 3520:dup             
	// 1814 3521:bipush          16
	// 1815 3523:bipush          25
	// 1816 3525:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1817 3528:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1818 3531:astore          25
		Object obj26 = ((Object) (new ECBlocks(30, new ECB(30, 16), new ECB(2, 17))));
	// 1819 3533:new             #9   <Class Version$ECBlocks>
	// 1820 3536:dup             
	// 1821 3537:bipush          30
	// 1822 3539:new             #6   <Class Version$ECB>
	// 1823 3542:dup             
	// 1824 3543:bipush          30
	// 1825 3545:bipush          16
	// 1826 3547:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1827 3550:new             #6   <Class Version$ECB>
	// 1828 3553:dup             
	// 1829 3554:iconst_2        
	// 1830 3555:bipush          17
	// 1831 3557:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1832 3560:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1833 3563:astore          26
		obj23 = ((Object) (new Version(24, new int[] {
			6, 28, 54, 80, 106
		}, ((ECBlocks) (obj23)), ((ECBlocks) (obj24)), ((ECBlocks) (obj25)), ((ECBlocks) (obj26)))));
	// 1834 3565:new             #2   <Class Version>
	// 1835 3568:dup             
	// 1836 3569:bipush          24
	// 1837 3571:iconst_5        
	// 1838 3572:newarray        int[]
	// 1839 3574:dup             
	// 1840 3575:iconst_0        
	// 1841 3576:bipush          6
	// 1842 3578:iastore         
	// 1843 3579:dup             
	// 1844 3580:iconst_1        
	// 1845 3581:bipush          28
	// 1846 3583:iastore         
	// 1847 3584:dup             
	// 1848 3585:iconst_2        
	// 1849 3586:bipush          54
	// 1850 3588:iastore         
	// 1851 3589:dup             
	// 1852 3590:iconst_3        
	// 1853 3591:bipush          80
	// 1854 3593:iastore         
	// 1855 3594:dup             
	// 1856 3595:iconst_4        
	// 1857 3596:bipush          106
	// 1858 3598:iastore         
	// 1859 3599:aload           23
	// 1860 3601:aload           24
	// 1861 3603:aload           25
	// 1862 3605:aload           26
	// 1863 3607:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 1864 3610:astore          23
		obj24 = ((Object) (new ECBlocks(26, new ECB(8, 106), new ECB(4, 107))));
	// 1865 3612:new             #9   <Class Version$ECBlocks>
	// 1866 3615:dup             
	// 1867 3616:bipush          26
	// 1868 3618:new             #6   <Class Version$ECB>
	// 1869 3621:dup             
	// 1870 3622:bipush          8
	// 1871 3624:bipush          106
	// 1872 3626:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1873 3629:new             #6   <Class Version$ECB>
	// 1874 3632:dup             
	// 1875 3633:iconst_4        
	// 1876 3634:bipush          107
	// 1877 3636:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1878 3639:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1879 3642:astore          24
		obj25 = ((Object) (new ECBlocks(28, new ECB(8, 47), new ECB(13, 48))));
	// 1880 3644:new             #9   <Class Version$ECBlocks>
	// 1881 3647:dup             
	// 1882 3648:bipush          28
	// 1883 3650:new             #6   <Class Version$ECB>
	// 1884 3653:dup             
	// 1885 3654:bipush          8
	// 1886 3656:bipush          47
	// 1887 3658:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1888 3661:new             #6   <Class Version$ECB>
	// 1889 3664:dup             
	// 1890 3665:bipush          13
	// 1891 3667:bipush          48
	// 1892 3669:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1893 3672:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1894 3675:astore          25
		obj26 = ((Object) (new ECBlocks(30, new ECB(7, 24), new ECB(22, 25))));
	// 1895 3677:new             #9   <Class Version$ECBlocks>
	// 1896 3680:dup             
	// 1897 3681:bipush          30
	// 1898 3683:new             #6   <Class Version$ECB>
	// 1899 3686:dup             
	// 1900 3687:bipush          7
	// 1901 3689:bipush          24
	// 1902 3691:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1903 3694:new             #6   <Class Version$ECB>
	// 1904 3697:dup             
	// 1905 3698:bipush          22
	// 1906 3700:bipush          25
	// 1907 3702:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1908 3705:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1909 3708:astore          26
		Object obj27 = ((Object) (new ECBlocks(30, new ECB(22, 15), new ECB(13, 16))));
	// 1910 3710:new             #9   <Class Version$ECBlocks>
	// 1911 3713:dup             
	// 1912 3714:bipush          30
	// 1913 3716:new             #6   <Class Version$ECB>
	// 1914 3719:dup             
	// 1915 3720:bipush          22
	// 1916 3722:bipush          15
	// 1917 3724:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1918 3727:new             #6   <Class Version$ECB>
	// 1919 3730:dup             
	// 1920 3731:bipush          13
	// 1921 3733:bipush          16
	// 1922 3735:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1923 3738:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1924 3741:astore          27
		obj24 = ((Object) (new Version(25, new int[] {
			6, 32, 58, 84, 110
		}, ((ECBlocks) (obj24)), ((ECBlocks) (obj25)), ((ECBlocks) (obj26)), ((ECBlocks) (obj27)))));
	// 1925 3743:new             #2   <Class Version>
	// 1926 3746:dup             
	// 1927 3747:bipush          25
	// 1928 3749:iconst_5        
	// 1929 3750:newarray        int[]
	// 1930 3752:dup             
	// 1931 3753:iconst_0        
	// 1932 3754:bipush          6
	// 1933 3756:iastore         
	// 1934 3757:dup             
	// 1935 3758:iconst_1        
	// 1936 3759:bipush          32
	// 1937 3761:iastore         
	// 1938 3762:dup             
	// 1939 3763:iconst_2        
	// 1940 3764:bipush          58
	// 1941 3766:iastore         
	// 1942 3767:dup             
	// 1943 3768:iconst_3        
	// 1944 3769:bipush          84
	// 1945 3771:iastore         
	// 1946 3772:dup             
	// 1947 3773:iconst_4        
	// 1948 3774:bipush          110
	// 1949 3776:iastore         
	// 1950 3777:aload           24
	// 1951 3779:aload           25
	// 1952 3781:aload           26
	// 1953 3783:aload           27
	// 1954 3785:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 1955 3788:astore          24
		obj25 = ((Object) (new ECBlocks(28, new ECB(10, 114), new ECB(2, 115))));
	// 1956 3790:new             #9   <Class Version$ECBlocks>
	// 1957 3793:dup             
	// 1958 3794:bipush          28
	// 1959 3796:new             #6   <Class Version$ECB>
	// 1960 3799:dup             
	// 1961 3800:bipush          10
	// 1962 3802:bipush          114
	// 1963 3804:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1964 3807:new             #6   <Class Version$ECB>
	// 1965 3810:dup             
	// 1966 3811:iconst_2        
	// 1967 3812:bipush          115
	// 1968 3814:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1969 3817:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1970 3820:astore          25
		obj26 = ((Object) (new ECBlocks(28, new ECB(19, 46), new ECB(4, 47))));
	// 1971 3822:new             #9   <Class Version$ECBlocks>
	// 1972 3825:dup             
	// 1973 3826:bipush          28
	// 1974 3828:new             #6   <Class Version$ECB>
	// 1975 3831:dup             
	// 1976 3832:bipush          19
	// 1977 3834:bipush          46
	// 1978 3836:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1979 3839:new             #6   <Class Version$ECB>
	// 1980 3842:dup             
	// 1981 3843:iconst_4        
	// 1982 3844:bipush          47
	// 1983 3846:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1984 3849:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 1985 3852:astore          26
		obj27 = ((Object) (new ECBlocks(28, new ECB(28, 22), new ECB(6, 23))));
	// 1986 3854:new             #9   <Class Version$ECBlocks>
	// 1987 3857:dup             
	// 1988 3858:bipush          28
	// 1989 3860:new             #6   <Class Version$ECB>
	// 1990 3863:dup             
	// 1991 3864:bipush          28
	// 1992 3866:bipush          22
	// 1993 3868:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1994 3871:new             #6   <Class Version$ECB>
	// 1995 3874:dup             
	// 1996 3875:bipush          6
	// 1997 3877:bipush          23
	// 1998 3879:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 1999 3882:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2000 3885:astore          27
		Object obj28 = ((Object) (new ECBlocks(30, new ECB(33, 16), new ECB(4, 17))));
	// 2001 3887:new             #9   <Class Version$ECBlocks>
	// 2002 3890:dup             
	// 2003 3891:bipush          30
	// 2004 3893:new             #6   <Class Version$ECB>
	// 2005 3896:dup             
	// 2006 3897:bipush          33
	// 2007 3899:bipush          16
	// 2008 3901:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2009 3904:new             #6   <Class Version$ECB>
	// 2010 3907:dup             
	// 2011 3908:iconst_4        
	// 2012 3909:bipush          17
	// 2013 3911:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2014 3914:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2015 3917:astore          28
		obj25 = ((Object) (new Version(26, new int[] {
			6, 30, 58, 86, 114
		}, ((ECBlocks) (obj25)), ((ECBlocks) (obj26)), ((ECBlocks) (obj27)), ((ECBlocks) (obj28)))));
	// 2016 3919:new             #2   <Class Version>
	// 2017 3922:dup             
	// 2018 3923:bipush          26
	// 2019 3925:iconst_5        
	// 2020 3926:newarray        int[]
	// 2021 3928:dup             
	// 2022 3929:iconst_0        
	// 2023 3930:bipush          6
	// 2024 3932:iastore         
	// 2025 3933:dup             
	// 2026 3934:iconst_1        
	// 2027 3935:bipush          30
	// 2028 3937:iastore         
	// 2029 3938:dup             
	// 2030 3939:iconst_2        
	// 2031 3940:bipush          58
	// 2032 3942:iastore         
	// 2033 3943:dup             
	// 2034 3944:iconst_3        
	// 2035 3945:bipush          86
	// 2036 3947:iastore         
	// 2037 3948:dup             
	// 2038 3949:iconst_4        
	// 2039 3950:bipush          114
	// 2040 3952:iastore         
	// 2041 3953:aload           25
	// 2042 3955:aload           26
	// 2043 3957:aload           27
	// 2044 3959:aload           28
	// 2045 3961:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 2046 3964:astore          25
		obj26 = ((Object) (new ECBlocks(30, new ECB(8, 122), new ECB(4, 123))));
	// 2047 3966:new             #9   <Class Version$ECBlocks>
	// 2048 3969:dup             
	// 2049 3970:bipush          30
	// 2050 3972:new             #6   <Class Version$ECB>
	// 2051 3975:dup             
	// 2052 3976:bipush          8
	// 2053 3978:bipush          122
	// 2054 3980:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2055 3983:new             #6   <Class Version$ECB>
	// 2056 3986:dup             
	// 2057 3987:iconst_4        
	// 2058 3988:bipush          123
	// 2059 3990:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2060 3993:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2061 3996:astore          26
		obj27 = ((Object) (new ECBlocks(28, new ECB(22, 45), new ECB(3, 46))));
	// 2062 3998:new             #9   <Class Version$ECBlocks>
	// 2063 4001:dup             
	// 2064 4002:bipush          28
	// 2065 4004:new             #6   <Class Version$ECB>
	// 2066 4007:dup             
	// 2067 4008:bipush          22
	// 2068 4010:bipush          45
	// 2069 4012:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2070 4015:new             #6   <Class Version$ECB>
	// 2071 4018:dup             
	// 2072 4019:iconst_3        
	// 2073 4020:bipush          46
	// 2074 4022:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2075 4025:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2076 4028:astore          27
		obj28 = ((Object) (new ECBlocks(30, new ECB(8, 23), new ECB(26, 24))));
	// 2077 4030:new             #9   <Class Version$ECBlocks>
	// 2078 4033:dup             
	// 2079 4034:bipush          30
	// 2080 4036:new             #6   <Class Version$ECB>
	// 2081 4039:dup             
	// 2082 4040:bipush          8
	// 2083 4042:bipush          23
	// 2084 4044:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2085 4047:new             #6   <Class Version$ECB>
	// 2086 4050:dup             
	// 2087 4051:bipush          26
	// 2088 4053:bipush          24
	// 2089 4055:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2090 4058:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2091 4061:astore          28
		Object obj29 = ((Object) (new ECBlocks(30, new ECB(12, 15), new ECB(28, 16))));
	// 2092 4063:new             #9   <Class Version$ECBlocks>
	// 2093 4066:dup             
	// 2094 4067:bipush          30
	// 2095 4069:new             #6   <Class Version$ECB>
	// 2096 4072:dup             
	// 2097 4073:bipush          12
	// 2098 4075:bipush          15
	// 2099 4077:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2100 4080:new             #6   <Class Version$ECB>
	// 2101 4083:dup             
	// 2102 4084:bipush          28
	// 2103 4086:bipush          16
	// 2104 4088:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2105 4091:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2106 4094:astore          29
		obj26 = ((Object) (new Version(27, new int[] {
			6, 34, 62, 90, 118
		}, ((ECBlocks) (obj26)), ((ECBlocks) (obj27)), ((ECBlocks) (obj28)), ((ECBlocks) (obj29)))));
	// 2107 4096:new             #2   <Class Version>
	// 2108 4099:dup             
	// 2109 4100:bipush          27
	// 2110 4102:iconst_5        
	// 2111 4103:newarray        int[]
	// 2112 4105:dup             
	// 2113 4106:iconst_0        
	// 2114 4107:bipush          6
	// 2115 4109:iastore         
	// 2116 4110:dup             
	// 2117 4111:iconst_1        
	// 2118 4112:bipush          34
	// 2119 4114:iastore         
	// 2120 4115:dup             
	// 2121 4116:iconst_2        
	// 2122 4117:bipush          62
	// 2123 4119:iastore         
	// 2124 4120:dup             
	// 2125 4121:iconst_3        
	// 2126 4122:bipush          90
	// 2127 4124:iastore         
	// 2128 4125:dup             
	// 2129 4126:iconst_4        
	// 2130 4127:bipush          118
	// 2131 4129:iastore         
	// 2132 4130:aload           26
	// 2133 4132:aload           27
	// 2134 4134:aload           28
	// 2135 4136:aload           29
	// 2136 4138:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 2137 4141:astore          26
		obj27 = ((Object) (new ECBlocks(30, new ECB(3, 117), new ECB(10, 118))));
	// 2138 4143:new             #9   <Class Version$ECBlocks>
	// 2139 4146:dup             
	// 2140 4147:bipush          30
	// 2141 4149:new             #6   <Class Version$ECB>
	// 2142 4152:dup             
	// 2143 4153:iconst_3        
	// 2144 4154:bipush          117
	// 2145 4156:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2146 4159:new             #6   <Class Version$ECB>
	// 2147 4162:dup             
	// 2148 4163:bipush          10
	// 2149 4165:bipush          118
	// 2150 4167:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2151 4170:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2152 4173:astore          27
		obj28 = ((Object) (new ECBlocks(28, new ECB(3, 45), new ECB(23, 46))));
	// 2153 4175:new             #9   <Class Version$ECBlocks>
	// 2154 4178:dup             
	// 2155 4179:bipush          28
	// 2156 4181:new             #6   <Class Version$ECB>
	// 2157 4184:dup             
	// 2158 4185:iconst_3        
	// 2159 4186:bipush          45
	// 2160 4188:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2161 4191:new             #6   <Class Version$ECB>
	// 2162 4194:dup             
	// 2163 4195:bipush          23
	// 2164 4197:bipush          46
	// 2165 4199:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2166 4202:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2167 4205:astore          28
		obj29 = ((Object) (new ECBlocks(30, new ECB(4, 24), new ECB(31, 25))));
	// 2168 4207:new             #9   <Class Version$ECBlocks>
	// 2169 4210:dup             
	// 2170 4211:bipush          30
	// 2171 4213:new             #6   <Class Version$ECB>
	// 2172 4216:dup             
	// 2173 4217:iconst_4        
	// 2174 4218:bipush          24
	// 2175 4220:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2176 4223:new             #6   <Class Version$ECB>
	// 2177 4226:dup             
	// 2178 4227:bipush          31
	// 2179 4229:bipush          25
	// 2180 4231:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2181 4234:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2182 4237:astore          29
		Object obj30 = ((Object) (new ECBlocks(30, new ECB(11, 15), new ECB(31, 16))));
	// 2183 4239:new             #9   <Class Version$ECBlocks>
	// 2184 4242:dup             
	// 2185 4243:bipush          30
	// 2186 4245:new             #6   <Class Version$ECB>
	// 2187 4248:dup             
	// 2188 4249:bipush          11
	// 2189 4251:bipush          15
	// 2190 4253:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2191 4256:new             #6   <Class Version$ECB>
	// 2192 4259:dup             
	// 2193 4260:bipush          31
	// 2194 4262:bipush          16
	// 2195 4264:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2196 4267:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2197 4270:astore          30
		obj27 = ((Object) (new Version(28, new int[] {
			6, 26, 50, 74, 98, 122
		}, ((ECBlocks) (obj27)), ((ECBlocks) (obj28)), ((ECBlocks) (obj29)), ((ECBlocks) (obj30)))));
	// 2198 4272:new             #2   <Class Version>
	// 2199 4275:dup             
	// 2200 4276:bipush          28
	// 2201 4278:bipush          6
	// 2202 4280:newarray        int[]
	// 2203 4282:dup             
	// 2204 4283:iconst_0        
	// 2205 4284:bipush          6
	// 2206 4286:iastore         
	// 2207 4287:dup             
	// 2208 4288:iconst_1        
	// 2209 4289:bipush          26
	// 2210 4291:iastore         
	// 2211 4292:dup             
	// 2212 4293:iconst_2        
	// 2213 4294:bipush          50
	// 2214 4296:iastore         
	// 2215 4297:dup             
	// 2216 4298:iconst_3        
	// 2217 4299:bipush          74
	// 2218 4301:iastore         
	// 2219 4302:dup             
	// 2220 4303:iconst_4        
	// 2221 4304:bipush          98
	// 2222 4306:iastore         
	// 2223 4307:dup             
	// 2224 4308:iconst_5        
	// 2225 4309:bipush          122
	// 2226 4311:iastore         
	// 2227 4312:aload           27
	// 2228 4314:aload           28
	// 2229 4316:aload           29
	// 2230 4318:aload           30
	// 2231 4320:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 2232 4323:astore          27
		obj28 = ((Object) (new ECBlocks(30, new ECB(7, 116), new ECB(7, 117))));
	// 2233 4325:new             #9   <Class Version$ECBlocks>
	// 2234 4328:dup             
	// 2235 4329:bipush          30
	// 2236 4331:new             #6   <Class Version$ECB>
	// 2237 4334:dup             
	// 2238 4335:bipush          7
	// 2239 4337:bipush          116
	// 2240 4339:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2241 4342:new             #6   <Class Version$ECB>
	// 2242 4345:dup             
	// 2243 4346:bipush          7
	// 2244 4348:bipush          117
	// 2245 4350:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2246 4353:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2247 4356:astore          28
		obj29 = ((Object) (new ECBlocks(28, new ECB(21, 45), new ECB(7, 46))));
	// 2248 4358:new             #9   <Class Version$ECBlocks>
	// 2249 4361:dup             
	// 2250 4362:bipush          28
	// 2251 4364:new             #6   <Class Version$ECB>
	// 2252 4367:dup             
	// 2253 4368:bipush          21
	// 2254 4370:bipush          45
	// 2255 4372:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2256 4375:new             #6   <Class Version$ECB>
	// 2257 4378:dup             
	// 2258 4379:bipush          7
	// 2259 4381:bipush          46
	// 2260 4383:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2261 4386:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2262 4389:astore          29
		obj30 = ((Object) (new ECBlocks(30, new ECB(1, 23), new ECB(37, 24))));
	// 2263 4391:new             #9   <Class Version$ECBlocks>
	// 2264 4394:dup             
	// 2265 4395:bipush          30
	// 2266 4397:new             #6   <Class Version$ECB>
	// 2267 4400:dup             
	// 2268 4401:iconst_1        
	// 2269 4402:bipush          23
	// 2270 4404:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2271 4407:new             #6   <Class Version$ECB>
	// 2272 4410:dup             
	// 2273 4411:bipush          37
	// 2274 4413:bipush          24
	// 2275 4415:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2276 4418:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2277 4421:astore          30
		Object obj31 = ((Object) (new ECBlocks(30, new ECB(19, 15), new ECB(26, 16))));
	// 2278 4423:new             #9   <Class Version$ECBlocks>
	// 2279 4426:dup             
	// 2280 4427:bipush          30
	// 2281 4429:new             #6   <Class Version$ECB>
	// 2282 4432:dup             
	// 2283 4433:bipush          19
	// 2284 4435:bipush          15
	// 2285 4437:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2286 4440:new             #6   <Class Version$ECB>
	// 2287 4443:dup             
	// 2288 4444:bipush          26
	// 2289 4446:bipush          16
	// 2290 4448:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2291 4451:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2292 4454:astore          31
		obj28 = ((Object) (new Version(29, new int[] {
			6, 30, 54, 78, 102, 126
		}, ((ECBlocks) (obj28)), ((ECBlocks) (obj29)), ((ECBlocks) (obj30)), ((ECBlocks) (obj31)))));
	// 2293 4456:new             #2   <Class Version>
	// 2294 4459:dup             
	// 2295 4460:bipush          29
	// 2296 4462:bipush          6
	// 2297 4464:newarray        int[]
	// 2298 4466:dup             
	// 2299 4467:iconst_0        
	// 2300 4468:bipush          6
	// 2301 4470:iastore         
	// 2302 4471:dup             
	// 2303 4472:iconst_1        
	// 2304 4473:bipush          30
	// 2305 4475:iastore         
	// 2306 4476:dup             
	// 2307 4477:iconst_2        
	// 2308 4478:bipush          54
	// 2309 4480:iastore         
	// 2310 4481:dup             
	// 2311 4482:iconst_3        
	// 2312 4483:bipush          78
	// 2313 4485:iastore         
	// 2314 4486:dup             
	// 2315 4487:iconst_4        
	// 2316 4488:bipush          102
	// 2317 4490:iastore         
	// 2318 4491:dup             
	// 2319 4492:iconst_5        
	// 2320 4493:bipush          126
	// 2321 4495:iastore         
	// 2322 4496:aload           28
	// 2323 4498:aload           29
	// 2324 4500:aload           30
	// 2325 4502:aload           31
	// 2326 4504:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 2327 4507:astore          28
		obj29 = ((Object) (new ECBlocks(30, new ECB(5, 115), new ECB(10, 116))));
	// 2328 4509:new             #9   <Class Version$ECBlocks>
	// 2329 4512:dup             
	// 2330 4513:bipush          30
	// 2331 4515:new             #6   <Class Version$ECB>
	// 2332 4518:dup             
	// 2333 4519:iconst_5        
	// 2334 4520:bipush          115
	// 2335 4522:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2336 4525:new             #6   <Class Version$ECB>
	// 2337 4528:dup             
	// 2338 4529:bipush          10
	// 2339 4531:bipush          116
	// 2340 4533:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2341 4536:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2342 4539:astore          29
		obj30 = ((Object) (new ECBlocks(28, new ECB(19, 47), new ECB(10, 48))));
	// 2343 4541:new             #9   <Class Version$ECBlocks>
	// 2344 4544:dup             
	// 2345 4545:bipush          28
	// 2346 4547:new             #6   <Class Version$ECB>
	// 2347 4550:dup             
	// 2348 4551:bipush          19
	// 2349 4553:bipush          47
	// 2350 4555:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2351 4558:new             #6   <Class Version$ECB>
	// 2352 4561:dup             
	// 2353 4562:bipush          10
	// 2354 4564:bipush          48
	// 2355 4566:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2356 4569:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2357 4572:astore          30
		obj31 = ((Object) (new ECBlocks(30, new ECB(15, 24), new ECB(25, 25))));
	// 2358 4574:new             #9   <Class Version$ECBlocks>
	// 2359 4577:dup             
	// 2360 4578:bipush          30
	// 2361 4580:new             #6   <Class Version$ECB>
	// 2362 4583:dup             
	// 2363 4584:bipush          15
	// 2364 4586:bipush          24
	// 2365 4588:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2366 4591:new             #6   <Class Version$ECB>
	// 2367 4594:dup             
	// 2368 4595:bipush          25
	// 2369 4597:bipush          25
	// 2370 4599:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2371 4602:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2372 4605:astore          31
		Object obj32 = ((Object) (new ECBlocks(30, new ECB(23, 15), new ECB(25, 16))));
	// 2373 4607:new             #9   <Class Version$ECBlocks>
	// 2374 4610:dup             
	// 2375 4611:bipush          30
	// 2376 4613:new             #6   <Class Version$ECB>
	// 2377 4616:dup             
	// 2378 4617:bipush          23
	// 2379 4619:bipush          15
	// 2380 4621:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2381 4624:new             #6   <Class Version$ECB>
	// 2382 4627:dup             
	// 2383 4628:bipush          25
	// 2384 4630:bipush          16
	// 2385 4632:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2386 4635:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2387 4638:astore          32
		obj29 = ((Object) (new Version(30, new int[] {
			6, 26, 52, 78, 104, 130
		}, ((ECBlocks) (obj29)), ((ECBlocks) (obj30)), ((ECBlocks) (obj31)), ((ECBlocks) (obj32)))));
	// 2388 4640:new             #2   <Class Version>
	// 2389 4643:dup             
	// 2390 4644:bipush          30
	// 2391 4646:bipush          6
	// 2392 4648:newarray        int[]
	// 2393 4650:dup             
	// 2394 4651:iconst_0        
	// 2395 4652:bipush          6
	// 2396 4654:iastore         
	// 2397 4655:dup             
	// 2398 4656:iconst_1        
	// 2399 4657:bipush          26
	// 2400 4659:iastore         
	// 2401 4660:dup             
	// 2402 4661:iconst_2        
	// 2403 4662:bipush          52
	// 2404 4664:iastore         
	// 2405 4665:dup             
	// 2406 4666:iconst_3        
	// 2407 4667:bipush          78
	// 2408 4669:iastore         
	// 2409 4670:dup             
	// 2410 4671:iconst_4        
	// 2411 4672:bipush          104
	// 2412 4674:iastore         
	// 2413 4675:dup             
	// 2414 4676:iconst_5        
	// 2415 4677:sipush          130
	// 2416 4680:iastore         
	// 2417 4681:aload           29
	// 2418 4683:aload           30
	// 2419 4685:aload           31
	// 2420 4687:aload           32
	// 2421 4689:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 2422 4692:astore          29
		obj30 = ((Object) (new ECBlocks(30, new ECB(13, 115), new ECB(3, 116))));
	// 2423 4694:new             #9   <Class Version$ECBlocks>
	// 2424 4697:dup             
	// 2425 4698:bipush          30
	// 2426 4700:new             #6   <Class Version$ECB>
	// 2427 4703:dup             
	// 2428 4704:bipush          13
	// 2429 4706:bipush          115
	// 2430 4708:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2431 4711:new             #6   <Class Version$ECB>
	// 2432 4714:dup             
	// 2433 4715:iconst_3        
	// 2434 4716:bipush          116
	// 2435 4718:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2436 4721:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2437 4724:astore          30
		obj31 = ((Object) (new ECBlocks(28, new ECB(2, 46), new ECB(29, 47))));
	// 2438 4726:new             #9   <Class Version$ECBlocks>
	// 2439 4729:dup             
	// 2440 4730:bipush          28
	// 2441 4732:new             #6   <Class Version$ECB>
	// 2442 4735:dup             
	// 2443 4736:iconst_2        
	// 2444 4737:bipush          46
	// 2445 4739:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2446 4742:new             #6   <Class Version$ECB>
	// 2447 4745:dup             
	// 2448 4746:bipush          29
	// 2449 4748:bipush          47
	// 2450 4750:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2451 4753:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2452 4756:astore          31
		obj32 = ((Object) (new ECBlocks(30, new ECB(42, 24), new ECB(1, 25))));
	// 2453 4758:new             #9   <Class Version$ECBlocks>
	// 2454 4761:dup             
	// 2455 4762:bipush          30
	// 2456 4764:new             #6   <Class Version$ECB>
	// 2457 4767:dup             
	// 2458 4768:bipush          42
	// 2459 4770:bipush          24
	// 2460 4772:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2461 4775:new             #6   <Class Version$ECB>
	// 2462 4778:dup             
	// 2463 4779:iconst_1        
	// 2464 4780:bipush          25
	// 2465 4782:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2466 4785:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2467 4788:astore          32
		Object obj33 = ((Object) (new ECBlocks(30, new ECB(23, 15), new ECB(28, 16))));
	// 2468 4790:new             #9   <Class Version$ECBlocks>
	// 2469 4793:dup             
	// 2470 4794:bipush          30
	// 2471 4796:new             #6   <Class Version$ECB>
	// 2472 4799:dup             
	// 2473 4800:bipush          23
	// 2474 4802:bipush          15
	// 2475 4804:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2476 4807:new             #6   <Class Version$ECB>
	// 2477 4810:dup             
	// 2478 4811:bipush          28
	// 2479 4813:bipush          16
	// 2480 4815:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2481 4818:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2482 4821:astore          33
		obj30 = ((Object) (new Version(31, new int[] {
			6, 30, 56, 82, 108, 134
		}, ((ECBlocks) (obj30)), ((ECBlocks) (obj31)), ((ECBlocks) (obj32)), ((ECBlocks) (obj33)))));
	// 2483 4823:new             #2   <Class Version>
	// 2484 4826:dup             
	// 2485 4827:bipush          31
	// 2486 4829:bipush          6
	// 2487 4831:newarray        int[]
	// 2488 4833:dup             
	// 2489 4834:iconst_0        
	// 2490 4835:bipush          6
	// 2491 4837:iastore         
	// 2492 4838:dup             
	// 2493 4839:iconst_1        
	// 2494 4840:bipush          30
	// 2495 4842:iastore         
	// 2496 4843:dup             
	// 2497 4844:iconst_2        
	// 2498 4845:bipush          56
	// 2499 4847:iastore         
	// 2500 4848:dup             
	// 2501 4849:iconst_3        
	// 2502 4850:bipush          82
	// 2503 4852:iastore         
	// 2504 4853:dup             
	// 2505 4854:iconst_4        
	// 2506 4855:bipush          108
	// 2507 4857:iastore         
	// 2508 4858:dup             
	// 2509 4859:iconst_5        
	// 2510 4860:sipush          134
	// 2511 4863:iastore         
	// 2512 4864:aload           30
	// 2513 4866:aload           31
	// 2514 4868:aload           32
	// 2515 4870:aload           33
	// 2516 4872:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 2517 4875:astore          30
		obj31 = ((Object) (new ECBlocks(30, new ECB(17, 115))));
	// 2518 4877:new             #9   <Class Version$ECBlocks>
	// 2519 4880:dup             
	// 2520 4881:bipush          30
	// 2521 4883:new             #6   <Class Version$ECB>
	// 2522 4886:dup             
	// 2523 4887:bipush          17
	// 2524 4889:bipush          115
	// 2525 4891:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2526 4894:invokespecial   #96  <Method void Version$ECBlocks(int, Version$ECB)>
	// 2527 4897:astore          31
		obj32 = ((Object) (new ECBlocks(28, new ECB(10, 46), new ECB(23, 47))));
	// 2528 4899:new             #9   <Class Version$ECBlocks>
	// 2529 4902:dup             
	// 2530 4903:bipush          28
	// 2531 4905:new             #6   <Class Version$ECB>
	// 2532 4908:dup             
	// 2533 4909:bipush          10
	// 2534 4911:bipush          46
	// 2535 4913:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2536 4916:new             #6   <Class Version$ECB>
	// 2537 4919:dup             
	// 2538 4920:bipush          23
	// 2539 4922:bipush          47
	// 2540 4924:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2541 4927:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2542 4930:astore          32
		obj33 = ((Object) (new ECBlocks(30, new ECB(10, 24), new ECB(35, 25))));
	// 2543 4932:new             #9   <Class Version$ECBlocks>
	// 2544 4935:dup             
	// 2545 4936:bipush          30
	// 2546 4938:new             #6   <Class Version$ECB>
	// 2547 4941:dup             
	// 2548 4942:bipush          10
	// 2549 4944:bipush          24
	// 2550 4946:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2551 4949:new             #6   <Class Version$ECB>
	// 2552 4952:dup             
	// 2553 4953:bipush          35
	// 2554 4955:bipush          25
	// 2555 4957:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2556 4960:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2557 4963:astore          33
		Object obj34 = ((Object) (new ECBlocks(30, new ECB(19, 15), new ECB(35, 16))));
	// 2558 4965:new             #9   <Class Version$ECBlocks>
	// 2559 4968:dup             
	// 2560 4969:bipush          30
	// 2561 4971:new             #6   <Class Version$ECB>
	// 2562 4974:dup             
	// 2563 4975:bipush          19
	// 2564 4977:bipush          15
	// 2565 4979:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2566 4982:new             #6   <Class Version$ECB>
	// 2567 4985:dup             
	// 2568 4986:bipush          35
	// 2569 4988:bipush          16
	// 2570 4990:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2571 4993:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2572 4996:astore          34
		obj31 = ((Object) (new Version(32, new int[] {
			6, 34, 60, 86, 112, 138
		}, ((ECBlocks) (obj31)), ((ECBlocks) (obj32)), ((ECBlocks) (obj33)), ((ECBlocks) (obj34)))));
	// 2573 4998:new             #2   <Class Version>
	// 2574 5001:dup             
	// 2575 5002:bipush          32
	// 2576 5004:bipush          6
	// 2577 5006:newarray        int[]
	// 2578 5008:dup             
	// 2579 5009:iconst_0        
	// 2580 5010:bipush          6
	// 2581 5012:iastore         
	// 2582 5013:dup             
	// 2583 5014:iconst_1        
	// 2584 5015:bipush          34
	// 2585 5017:iastore         
	// 2586 5018:dup             
	// 2587 5019:iconst_2        
	// 2588 5020:bipush          60
	// 2589 5022:iastore         
	// 2590 5023:dup             
	// 2591 5024:iconst_3        
	// 2592 5025:bipush          86
	// 2593 5027:iastore         
	// 2594 5028:dup             
	// 2595 5029:iconst_4        
	// 2596 5030:bipush          112
	// 2597 5032:iastore         
	// 2598 5033:dup             
	// 2599 5034:iconst_5        
	// 2600 5035:sipush          138
	// 2601 5038:iastore         
	// 2602 5039:aload           31
	// 2603 5041:aload           32
	// 2604 5043:aload           33
	// 2605 5045:aload           34
	// 2606 5047:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 2607 5050:astore          31
		obj32 = ((Object) (new ECBlocks(30, new ECB(17, 115), new ECB(1, 116))));
	// 2608 5052:new             #9   <Class Version$ECBlocks>
	// 2609 5055:dup             
	// 2610 5056:bipush          30
	// 2611 5058:new             #6   <Class Version$ECB>
	// 2612 5061:dup             
	// 2613 5062:bipush          17
	// 2614 5064:bipush          115
	// 2615 5066:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2616 5069:new             #6   <Class Version$ECB>
	// 2617 5072:dup             
	// 2618 5073:iconst_1        
	// 2619 5074:bipush          116
	// 2620 5076:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2621 5079:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2622 5082:astore          32
		obj33 = ((Object) (new ECBlocks(28, new ECB(14, 46), new ECB(21, 47))));
	// 2623 5084:new             #9   <Class Version$ECBlocks>
	// 2624 5087:dup             
	// 2625 5088:bipush          28
	// 2626 5090:new             #6   <Class Version$ECB>
	// 2627 5093:dup             
	// 2628 5094:bipush          14
	// 2629 5096:bipush          46
	// 2630 5098:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2631 5101:new             #6   <Class Version$ECB>
	// 2632 5104:dup             
	// 2633 5105:bipush          21
	// 2634 5107:bipush          47
	// 2635 5109:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2636 5112:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2637 5115:astore          33
		obj34 = ((Object) (new ECBlocks(30, new ECB(29, 24), new ECB(19, 25))));
	// 2638 5117:new             #9   <Class Version$ECBlocks>
	// 2639 5120:dup             
	// 2640 5121:bipush          30
	// 2641 5123:new             #6   <Class Version$ECB>
	// 2642 5126:dup             
	// 2643 5127:bipush          29
	// 2644 5129:bipush          24
	// 2645 5131:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2646 5134:new             #6   <Class Version$ECB>
	// 2647 5137:dup             
	// 2648 5138:bipush          19
	// 2649 5140:bipush          25
	// 2650 5142:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2651 5145:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2652 5148:astore          34
		Object obj35 = ((Object) (new ECBlocks(30, new ECB(11, 15), new ECB(46, 16))));
	// 2653 5150:new             #9   <Class Version$ECBlocks>
	// 2654 5153:dup             
	// 2655 5154:bipush          30
	// 2656 5156:new             #6   <Class Version$ECB>
	// 2657 5159:dup             
	// 2658 5160:bipush          11
	// 2659 5162:bipush          15
	// 2660 5164:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2661 5167:new             #6   <Class Version$ECB>
	// 2662 5170:dup             
	// 2663 5171:bipush          46
	// 2664 5173:bipush          16
	// 2665 5175:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2666 5178:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2667 5181:astore          35
		obj32 = ((Object) (new Version(33, new int[] {
			6, 30, 58, 86, 114, 142
		}, ((ECBlocks) (obj32)), ((ECBlocks) (obj33)), ((ECBlocks) (obj34)), ((ECBlocks) (obj35)))));
	// 2668 5183:new             #2   <Class Version>
	// 2669 5186:dup             
	// 2670 5187:bipush          33
	// 2671 5189:bipush          6
	// 2672 5191:newarray        int[]
	// 2673 5193:dup             
	// 2674 5194:iconst_0        
	// 2675 5195:bipush          6
	// 2676 5197:iastore         
	// 2677 5198:dup             
	// 2678 5199:iconst_1        
	// 2679 5200:bipush          30
	// 2680 5202:iastore         
	// 2681 5203:dup             
	// 2682 5204:iconst_2        
	// 2683 5205:bipush          58
	// 2684 5207:iastore         
	// 2685 5208:dup             
	// 2686 5209:iconst_3        
	// 2687 5210:bipush          86
	// 2688 5212:iastore         
	// 2689 5213:dup             
	// 2690 5214:iconst_4        
	// 2691 5215:bipush          114
	// 2692 5217:iastore         
	// 2693 5218:dup             
	// 2694 5219:iconst_5        
	// 2695 5220:sipush          142
	// 2696 5223:iastore         
	// 2697 5224:aload           32
	// 2698 5226:aload           33
	// 2699 5228:aload           34
	// 2700 5230:aload           35
	// 2701 5232:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 2702 5235:astore          32
		obj33 = ((Object) (new ECBlocks(30, new ECB(13, 115), new ECB(6, 116))));
	// 2703 5237:new             #9   <Class Version$ECBlocks>
	// 2704 5240:dup             
	// 2705 5241:bipush          30
	// 2706 5243:new             #6   <Class Version$ECB>
	// 2707 5246:dup             
	// 2708 5247:bipush          13
	// 2709 5249:bipush          115
	// 2710 5251:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2711 5254:new             #6   <Class Version$ECB>
	// 2712 5257:dup             
	// 2713 5258:bipush          6
	// 2714 5260:bipush          116
	// 2715 5262:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2716 5265:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2717 5268:astore          33
		obj34 = ((Object) (new ECBlocks(28, new ECB(14, 46), new ECB(23, 47))));
	// 2718 5270:new             #9   <Class Version$ECBlocks>
	// 2719 5273:dup             
	// 2720 5274:bipush          28
	// 2721 5276:new             #6   <Class Version$ECB>
	// 2722 5279:dup             
	// 2723 5280:bipush          14
	// 2724 5282:bipush          46
	// 2725 5284:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2726 5287:new             #6   <Class Version$ECB>
	// 2727 5290:dup             
	// 2728 5291:bipush          23
	// 2729 5293:bipush          47
	// 2730 5295:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2731 5298:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2732 5301:astore          34
		obj35 = ((Object) (new ECBlocks(30, new ECB(44, 24), new ECB(7, 25))));
	// 2733 5303:new             #9   <Class Version$ECBlocks>
	// 2734 5306:dup             
	// 2735 5307:bipush          30
	// 2736 5309:new             #6   <Class Version$ECB>
	// 2737 5312:dup             
	// 2738 5313:bipush          44
	// 2739 5315:bipush          24
	// 2740 5317:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2741 5320:new             #6   <Class Version$ECB>
	// 2742 5323:dup             
	// 2743 5324:bipush          7
	// 2744 5326:bipush          25
	// 2745 5328:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2746 5331:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2747 5334:astore          35
		Object obj36 = ((Object) (new ECBlocks(30, new ECB(59, 16), new ECB(1, 17))));
	// 2748 5336:new             #9   <Class Version$ECBlocks>
	// 2749 5339:dup             
	// 2750 5340:bipush          30
	// 2751 5342:new             #6   <Class Version$ECB>
	// 2752 5345:dup             
	// 2753 5346:bipush          59
	// 2754 5348:bipush          16
	// 2755 5350:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2756 5353:new             #6   <Class Version$ECB>
	// 2757 5356:dup             
	// 2758 5357:iconst_1        
	// 2759 5358:bipush          17
	// 2760 5360:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2761 5363:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2762 5366:astore          36
		obj33 = ((Object) (new Version(34, new int[] {
			6, 34, 62, 90, 118, 146
		}, ((ECBlocks) (obj33)), ((ECBlocks) (obj34)), ((ECBlocks) (obj35)), ((ECBlocks) (obj36)))));
	// 2763 5368:new             #2   <Class Version>
	// 2764 5371:dup             
	// 2765 5372:bipush          34
	// 2766 5374:bipush          6
	// 2767 5376:newarray        int[]
	// 2768 5378:dup             
	// 2769 5379:iconst_0        
	// 2770 5380:bipush          6
	// 2771 5382:iastore         
	// 2772 5383:dup             
	// 2773 5384:iconst_1        
	// 2774 5385:bipush          34
	// 2775 5387:iastore         
	// 2776 5388:dup             
	// 2777 5389:iconst_2        
	// 2778 5390:bipush          62
	// 2779 5392:iastore         
	// 2780 5393:dup             
	// 2781 5394:iconst_3        
	// 2782 5395:bipush          90
	// 2783 5397:iastore         
	// 2784 5398:dup             
	// 2785 5399:iconst_4        
	// 2786 5400:bipush          118
	// 2787 5402:iastore         
	// 2788 5403:dup             
	// 2789 5404:iconst_5        
	// 2790 5405:sipush          146
	// 2791 5408:iastore         
	// 2792 5409:aload           33
	// 2793 5411:aload           34
	// 2794 5413:aload           35
	// 2795 5415:aload           36
	// 2796 5417:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 2797 5420:astore          33
		obj34 = ((Object) (new ECBlocks(30, new ECB(12, 121), new ECB(7, 122))));
	// 2798 5422:new             #9   <Class Version$ECBlocks>
	// 2799 5425:dup             
	// 2800 5426:bipush          30
	// 2801 5428:new             #6   <Class Version$ECB>
	// 2802 5431:dup             
	// 2803 5432:bipush          12
	// 2804 5434:bipush          121
	// 2805 5436:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2806 5439:new             #6   <Class Version$ECB>
	// 2807 5442:dup             
	// 2808 5443:bipush          7
	// 2809 5445:bipush          122
	// 2810 5447:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2811 5450:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2812 5453:astore          34
		obj35 = ((Object) (new ECBlocks(28, new ECB(12, 47), new ECB(26, 48))));
	// 2813 5455:new             #9   <Class Version$ECBlocks>
	// 2814 5458:dup             
	// 2815 5459:bipush          28
	// 2816 5461:new             #6   <Class Version$ECB>
	// 2817 5464:dup             
	// 2818 5465:bipush          12
	// 2819 5467:bipush          47
	// 2820 5469:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2821 5472:new             #6   <Class Version$ECB>
	// 2822 5475:dup             
	// 2823 5476:bipush          26
	// 2824 5478:bipush          48
	// 2825 5480:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2826 5483:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2827 5486:astore          35
		obj36 = ((Object) (new ECBlocks(30, new ECB(39, 24), new ECB(14, 25))));
	// 2828 5488:new             #9   <Class Version$ECBlocks>
	// 2829 5491:dup             
	// 2830 5492:bipush          30
	// 2831 5494:new             #6   <Class Version$ECB>
	// 2832 5497:dup             
	// 2833 5498:bipush          39
	// 2834 5500:bipush          24
	// 2835 5502:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2836 5505:new             #6   <Class Version$ECB>
	// 2837 5508:dup             
	// 2838 5509:bipush          14
	// 2839 5511:bipush          25
	// 2840 5513:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2841 5516:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2842 5519:astore          36
		Object obj37 = ((Object) (new ECBlocks(30, new ECB(22, 15), new ECB(41, 16))));
	// 2843 5521:new             #9   <Class Version$ECBlocks>
	// 2844 5524:dup             
	// 2845 5525:bipush          30
	// 2846 5527:new             #6   <Class Version$ECB>
	// 2847 5530:dup             
	// 2848 5531:bipush          22
	// 2849 5533:bipush          15
	// 2850 5535:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2851 5538:new             #6   <Class Version$ECB>
	// 2852 5541:dup             
	// 2853 5542:bipush          41
	// 2854 5544:bipush          16
	// 2855 5546:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2856 5549:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2857 5552:astore          37
		obj34 = ((Object) (new Version(35, new int[] {
			6, 30, 54, 78, 102, 126, 150
		}, ((ECBlocks) (obj34)), ((ECBlocks) (obj35)), ((ECBlocks) (obj36)), ((ECBlocks) (obj37)))));
	// 2858 5554:new             #2   <Class Version>
	// 2859 5557:dup             
	// 2860 5558:bipush          35
	// 2861 5560:bipush          7
	// 2862 5562:newarray        int[]
	// 2863 5564:dup             
	// 2864 5565:iconst_0        
	// 2865 5566:bipush          6
	// 2866 5568:iastore         
	// 2867 5569:dup             
	// 2868 5570:iconst_1        
	// 2869 5571:bipush          30
	// 2870 5573:iastore         
	// 2871 5574:dup             
	// 2872 5575:iconst_2        
	// 2873 5576:bipush          54
	// 2874 5578:iastore         
	// 2875 5579:dup             
	// 2876 5580:iconst_3        
	// 2877 5581:bipush          78
	// 2878 5583:iastore         
	// 2879 5584:dup             
	// 2880 5585:iconst_4        
	// 2881 5586:bipush          102
	// 2882 5588:iastore         
	// 2883 5589:dup             
	// 2884 5590:iconst_5        
	// 2885 5591:bipush          126
	// 2886 5593:iastore         
	// 2887 5594:dup             
	// 2888 5595:bipush          6
	// 2889 5597:sipush          150
	// 2890 5600:iastore         
	// 2891 5601:aload           34
	// 2892 5603:aload           35
	// 2893 5605:aload           36
	// 2894 5607:aload           37
	// 2895 5609:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 2896 5612:astore          34
		obj35 = ((Object) (new ECBlocks(30, new ECB(6, 121), new ECB(14, 122))));
	// 2897 5614:new             #9   <Class Version$ECBlocks>
	// 2898 5617:dup             
	// 2899 5618:bipush          30
	// 2900 5620:new             #6   <Class Version$ECB>
	// 2901 5623:dup             
	// 2902 5624:bipush          6
	// 2903 5626:bipush          121
	// 2904 5628:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2905 5631:new             #6   <Class Version$ECB>
	// 2906 5634:dup             
	// 2907 5635:bipush          14
	// 2908 5637:bipush          122
	// 2909 5639:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2910 5642:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2911 5645:astore          35
		obj36 = ((Object) (new ECBlocks(28, new ECB(6, 47), new ECB(34, 48))));
	// 2912 5647:new             #9   <Class Version$ECBlocks>
	// 2913 5650:dup             
	// 2914 5651:bipush          28
	// 2915 5653:new             #6   <Class Version$ECB>
	// 2916 5656:dup             
	// 2917 5657:bipush          6
	// 2918 5659:bipush          47
	// 2919 5661:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2920 5664:new             #6   <Class Version$ECB>
	// 2921 5667:dup             
	// 2922 5668:bipush          34
	// 2923 5670:bipush          48
	// 2924 5672:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2925 5675:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2926 5678:astore          36
		obj37 = ((Object) (new ECBlocks(30, new ECB(46, 24), new ECB(10, 25))));
	// 2927 5680:new             #9   <Class Version$ECBlocks>
	// 2928 5683:dup             
	// 2929 5684:bipush          30
	// 2930 5686:new             #6   <Class Version$ECB>
	// 2931 5689:dup             
	// 2932 5690:bipush          46
	// 2933 5692:bipush          24
	// 2934 5694:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2935 5697:new             #6   <Class Version$ECB>
	// 2936 5700:dup             
	// 2937 5701:bipush          10
	// 2938 5703:bipush          25
	// 2939 5705:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2940 5708:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2941 5711:astore          37
		Object obj38 = ((Object) (new ECBlocks(30, new ECB(2, 15), new ECB(64, 16))));
	// 2942 5713:new             #9   <Class Version$ECBlocks>
	// 2943 5716:dup             
	// 2944 5717:bipush          30
	// 2945 5719:new             #6   <Class Version$ECB>
	// 2946 5722:dup             
	// 2947 5723:iconst_2        
	// 2948 5724:bipush          15
	// 2949 5726:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2950 5729:new             #6   <Class Version$ECB>
	// 2951 5732:dup             
	// 2952 5733:bipush          64
	// 2953 5735:bipush          16
	// 2954 5737:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 2955 5740:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 2956 5743:astore          38
		obj35 = ((Object) (new Version(36, new int[] {
			6, 24, 50, 76, 102, 128, 154
		}, ((ECBlocks) (obj35)), ((ECBlocks) (obj36)), ((ECBlocks) (obj37)), ((ECBlocks) (obj38)))));
	// 2957 5745:new             #2   <Class Version>
	// 2958 5748:dup             
	// 2959 5749:bipush          36
	// 2960 5751:bipush          7
	// 2961 5753:newarray        int[]
	// 2962 5755:dup             
	// 2963 5756:iconst_0        
	// 2964 5757:bipush          6
	// 2965 5759:iastore         
	// 2966 5760:dup             
	// 2967 5761:iconst_1        
	// 2968 5762:bipush          24
	// 2969 5764:iastore         
	// 2970 5765:dup             
	// 2971 5766:iconst_2        
	// 2972 5767:bipush          50
	// 2973 5769:iastore         
	// 2974 5770:dup             
	// 2975 5771:iconst_3        
	// 2976 5772:bipush          76
	// 2977 5774:iastore         
	// 2978 5775:dup             
	// 2979 5776:iconst_4        
	// 2980 5777:bipush          102
	// 2981 5779:iastore         
	// 2982 5780:dup             
	// 2983 5781:iconst_5        
	// 2984 5782:sipush          128
	// 2985 5785:iastore         
	// 2986 5786:dup             
	// 2987 5787:bipush          6
	// 2988 5789:sipush          154
	// 2989 5792:iastore         
	// 2990 5793:aload           35
	// 2991 5795:aload           36
	// 2992 5797:aload           37
	// 2993 5799:aload           38
	// 2994 5801:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 2995 5804:astore          35
		obj36 = ((Object) (new ECBlocks(30, new ECB(17, 122), new ECB(4, 123))));
	// 2996 5806:new             #9   <Class Version$ECBlocks>
	// 2997 5809:dup             
	// 2998 5810:bipush          30
	// 2999 5812:new             #6   <Class Version$ECB>
	// 3000 5815:dup             
	// 3001 5816:bipush          17
	// 3002 5818:bipush          122
	// 3003 5820:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3004 5823:new             #6   <Class Version$ECB>
	// 3005 5826:dup             
	// 3006 5827:iconst_4        
	// 3007 5828:bipush          123
	// 3008 5830:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3009 5833:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 3010 5836:astore          36
		obj37 = ((Object) (new ECBlocks(28, new ECB(29, 46), new ECB(14, 47))));
	// 3011 5838:new             #9   <Class Version$ECBlocks>
	// 3012 5841:dup             
	// 3013 5842:bipush          28
	// 3014 5844:new             #6   <Class Version$ECB>
	// 3015 5847:dup             
	// 3016 5848:bipush          29
	// 3017 5850:bipush          46
	// 3018 5852:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3019 5855:new             #6   <Class Version$ECB>
	// 3020 5858:dup             
	// 3021 5859:bipush          14
	// 3022 5861:bipush          47
	// 3023 5863:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3024 5866:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 3025 5869:astore          37
		obj38 = ((Object) (new ECBlocks(30, new ECB(49, 24), new ECB(10, 25))));
	// 3026 5871:new             #9   <Class Version$ECBlocks>
	// 3027 5874:dup             
	// 3028 5875:bipush          30
	// 3029 5877:new             #6   <Class Version$ECB>
	// 3030 5880:dup             
	// 3031 5881:bipush          49
	// 3032 5883:bipush          24
	// 3033 5885:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3034 5888:new             #6   <Class Version$ECB>
	// 3035 5891:dup             
	// 3036 5892:bipush          10
	// 3037 5894:bipush          25
	// 3038 5896:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3039 5899:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 3040 5902:astore          38
		ECBlocks ecblocks = new ECBlocks(30, new ECB(24, 15), new ECB(46, 16));
	// 3041 5904:new             #9   <Class Version$ECBlocks>
	// 3042 5907:dup             
	// 3043 5908:bipush          30
	// 3044 5910:new             #6   <Class Version$ECB>
	// 3045 5913:dup             
	// 3046 5914:bipush          24
	// 3047 5916:bipush          15
	// 3048 5918:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3049 5921:new             #6   <Class Version$ECB>
	// 3050 5924:dup             
	// 3051 5925:bipush          46
	// 3052 5927:bipush          16
	// 3053 5929:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3054 5932:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 3055 5935:astore          39
		obj36 = ((Object) (new Version(37, new int[] {
			6, 28, 54, 80, 106, 132, 158
		}, ((ECBlocks) (obj36)), ((ECBlocks) (obj37)), ((ECBlocks) (obj38)), ecblocks)));
	// 3056 5937:new             #2   <Class Version>
	// 3057 5940:dup             
	// 3058 5941:bipush          37
	// 3059 5943:bipush          7
	// 3060 5945:newarray        int[]
	// 3061 5947:dup             
	// 3062 5948:iconst_0        
	// 3063 5949:bipush          6
	// 3064 5951:iastore         
	// 3065 5952:dup             
	// 3066 5953:iconst_1        
	// 3067 5954:bipush          28
	// 3068 5956:iastore         
	// 3069 5957:dup             
	// 3070 5958:iconst_2        
	// 3071 5959:bipush          54
	// 3072 5961:iastore         
	// 3073 5962:dup             
	// 3074 5963:iconst_3        
	// 3075 5964:bipush          80
	// 3076 5966:iastore         
	// 3077 5967:dup             
	// 3078 5968:iconst_4        
	// 3079 5969:bipush          106
	// 3080 5971:iastore         
	// 3081 5972:dup             
	// 3082 5973:iconst_5        
	// 3083 5974:sipush          132
	// 3084 5977:iastore         
	// 3085 5978:dup             
	// 3086 5979:bipush          6
	// 3087 5981:sipush          158
	// 3088 5984:iastore         
	// 3089 5985:aload           36
	// 3090 5987:aload           37
	// 3091 5989:aload           38
	// 3092 5991:aload           39
	// 3093 5993:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 3094 5996:astore          36
		obj37 = ((Object) (new ECBlocks(30, new ECB(4, 122), new ECB(18, 123))));
	// 3095 5998:new             #9   <Class Version$ECBlocks>
	// 3096 6001:dup             
	// 3097 6002:bipush          30
	// 3098 6004:new             #6   <Class Version$ECB>
	// 3099 6007:dup             
	// 3100 6008:iconst_4        
	// 3101 6009:bipush          122
	// 3102 6011:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3103 6014:new             #6   <Class Version$ECB>
	// 3104 6017:dup             
	// 3105 6018:bipush          18
	// 3106 6020:bipush          123
	// 3107 6022:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3108 6025:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 3109 6028:astore          37
		obj38 = ((Object) (new ECBlocks(28, new ECB(13, 46), new ECB(32, 47))));
	// 3110 6030:new             #9   <Class Version$ECBlocks>
	// 3111 6033:dup             
	// 3112 6034:bipush          28
	// 3113 6036:new             #6   <Class Version$ECB>
	// 3114 6039:dup             
	// 3115 6040:bipush          13
	// 3116 6042:bipush          46
	// 3117 6044:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3118 6047:new             #6   <Class Version$ECB>
	// 3119 6050:dup             
	// 3120 6051:bipush          32
	// 3121 6053:bipush          47
	// 3122 6055:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3123 6058:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 3124 6061:astore          38
		ecblocks = new ECBlocks(30, new ECB(48, 24), new ECB(14, 25));
	// 3125 6063:new             #9   <Class Version$ECBlocks>
	// 3126 6066:dup             
	// 3127 6067:bipush          30
	// 3128 6069:new             #6   <Class Version$ECB>
	// 3129 6072:dup             
	// 3130 6073:bipush          48
	// 3131 6075:bipush          24
	// 3132 6077:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3133 6080:new             #6   <Class Version$ECB>
	// 3134 6083:dup             
	// 3135 6084:bipush          14
	// 3136 6086:bipush          25
	// 3137 6088:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3138 6091:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 3139 6094:astore          39
		ECBlocks ecblocks1 = new ECBlocks(30, new ECB(42, 15), new ECB(32, 16));
	// 3140 6096:new             #9   <Class Version$ECBlocks>
	// 3141 6099:dup             
	// 3142 6100:bipush          30
	// 3143 6102:new             #6   <Class Version$ECB>
	// 3144 6105:dup             
	// 3145 6106:bipush          42
	// 3146 6108:bipush          15
	// 3147 6110:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3148 6113:new             #6   <Class Version$ECB>
	// 3149 6116:dup             
	// 3150 6117:bipush          32
	// 3151 6119:bipush          16
	// 3152 6121:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3153 6124:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 3154 6127:astore          40
		obj37 = ((Object) (new Version(38, new int[] {
			6, 32, 58, 84, 110, 136, 162
		}, ((ECBlocks) (obj37)), ((ECBlocks) (obj38)), ecblocks, ecblocks1)));
	// 3155 6129:new             #2   <Class Version>
	// 3156 6132:dup             
	// 3157 6133:bipush          38
	// 3158 6135:bipush          7
	// 3159 6137:newarray        int[]
	// 3160 6139:dup             
	// 3161 6140:iconst_0        
	// 3162 6141:bipush          6
	// 3163 6143:iastore         
	// 3164 6144:dup             
	// 3165 6145:iconst_1        
	// 3166 6146:bipush          32
	// 3167 6148:iastore         
	// 3168 6149:dup             
	// 3169 6150:iconst_2        
	// 3170 6151:bipush          58
	// 3171 6153:iastore         
	// 3172 6154:dup             
	// 3173 6155:iconst_3        
	// 3174 6156:bipush          84
	// 3175 6158:iastore         
	// 3176 6159:dup             
	// 3177 6160:iconst_4        
	// 3178 6161:bipush          110
	// 3179 6163:iastore         
	// 3180 6164:dup             
	// 3181 6165:iconst_5        
	// 3182 6166:sipush          136
	// 3183 6169:iastore         
	// 3184 6170:dup             
	// 3185 6171:bipush          6
	// 3186 6173:sipush          162
	// 3187 6176:iastore         
	// 3188 6177:aload           37
	// 3189 6179:aload           38
	// 3190 6181:aload           39
	// 3191 6183:aload           40
	// 3192 6185:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 3193 6188:astore          37
		obj38 = ((Object) (new ECBlocks(30, new ECB(20, 117), new ECB(4, 118))));
	// 3194 6190:new             #9   <Class Version$ECBlocks>
	// 3195 6193:dup             
	// 3196 6194:bipush          30
	// 3197 6196:new             #6   <Class Version$ECB>
	// 3198 6199:dup             
	// 3199 6200:bipush          20
	// 3200 6202:bipush          117
	// 3201 6204:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3202 6207:new             #6   <Class Version$ECB>
	// 3203 6210:dup             
	// 3204 6211:iconst_4        
	// 3205 6212:bipush          118
	// 3206 6214:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3207 6217:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 3208 6220:astore          38
		ecblocks = new ECBlocks(28, new ECB(40, 47), new ECB(7, 48));
	// 3209 6222:new             #9   <Class Version$ECBlocks>
	// 3210 6225:dup             
	// 3211 6226:bipush          28
	// 3212 6228:new             #6   <Class Version$ECB>
	// 3213 6231:dup             
	// 3214 6232:bipush          40
	// 3215 6234:bipush          47
	// 3216 6236:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3217 6239:new             #6   <Class Version$ECB>
	// 3218 6242:dup             
	// 3219 6243:bipush          7
	// 3220 6245:bipush          48
	// 3221 6247:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3222 6250:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 3223 6253:astore          39
		ecblocks1 = new ECBlocks(30, new ECB(43, 24), new ECB(22, 25));
	// 3224 6255:new             #9   <Class Version$ECBlocks>
	// 3225 6258:dup             
	// 3226 6259:bipush          30
	// 3227 6261:new             #6   <Class Version$ECB>
	// 3228 6264:dup             
	// 3229 6265:bipush          43
	// 3230 6267:bipush          24
	// 3231 6269:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3232 6272:new             #6   <Class Version$ECB>
	// 3233 6275:dup             
	// 3234 6276:bipush          22
	// 3235 6278:bipush          25
	// 3236 6280:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3237 6283:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 3238 6286:astore          40
		ECBlocks ecblocks2 = new ECBlocks(30, new ECB(10, 15), new ECB(67, 16));
	// 3239 6288:new             #9   <Class Version$ECBlocks>
	// 3240 6291:dup             
	// 3241 6292:bipush          30
	// 3242 6294:new             #6   <Class Version$ECB>
	// 3243 6297:dup             
	// 3244 6298:bipush          10
	// 3245 6300:bipush          15
	// 3246 6302:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3247 6305:new             #6   <Class Version$ECB>
	// 3248 6308:dup             
	// 3249 6309:bipush          67
	// 3250 6311:bipush          16
	// 3251 6313:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3252 6316:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 3253 6319:astore          41
		obj38 = ((Object) (new Version(39, new int[] {
			6, 26, 54, 82, 110, 138, 166
		}, ((ECBlocks) (obj38)), ecblocks, ecblocks1, ecblocks2)));
	// 3254 6321:new             #2   <Class Version>
	// 3255 6324:dup             
	// 3256 6325:bipush          39
	// 3257 6327:bipush          7
	// 3258 6329:newarray        int[]
	// 3259 6331:dup             
	// 3260 6332:iconst_0        
	// 3261 6333:bipush          6
	// 3262 6335:iastore         
	// 3263 6336:dup             
	// 3264 6337:iconst_1        
	// 3265 6338:bipush          26
	// 3266 6340:iastore         
	// 3267 6341:dup             
	// 3268 6342:iconst_2        
	// 3269 6343:bipush          54
	// 3270 6345:iastore         
	// 3271 6346:dup             
	// 3272 6347:iconst_3        
	// 3273 6348:bipush          82
	// 3274 6350:iastore         
	// 3275 6351:dup             
	// 3276 6352:iconst_4        
	// 3277 6353:bipush          110
	// 3278 6355:iastore         
	// 3279 6356:dup             
	// 3280 6357:iconst_5        
	// 3281 6358:sipush          138
	// 3282 6361:iastore         
	// 3283 6362:dup             
	// 3284 6363:bipush          6
	// 3285 6365:sipush          166
	// 3286 6368:iastore         
	// 3287 6369:aload           38
	// 3288 6371:aload           39
	// 3289 6373:aload           40
	// 3290 6375:aload           41
	// 3291 6377:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 3292 6380:astore          38
		ecblocks = new ECBlocks(30, new ECB(19, 118), new ECB(6, 119));
	// 3293 6382:new             #9   <Class Version$ECBlocks>
	// 3294 6385:dup             
	// 3295 6386:bipush          30
	// 3296 6388:new             #6   <Class Version$ECB>
	// 3297 6391:dup             
	// 3298 6392:bipush          19
	// 3299 6394:bipush          118
	// 3300 6396:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3301 6399:new             #6   <Class Version$ECB>
	// 3302 6402:dup             
	// 3303 6403:bipush          6
	// 3304 6405:bipush          119
	// 3305 6407:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3306 6410:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 3307 6413:astore          39
		ecblocks1 = new ECBlocks(28, new ECB(18, 47), new ECB(31, 48));
	// 3308 6415:new             #9   <Class Version$ECBlocks>
	// 3309 6418:dup             
	// 3310 6419:bipush          28
	// 3311 6421:new             #6   <Class Version$ECB>
	// 3312 6424:dup             
	// 3313 6425:bipush          18
	// 3314 6427:bipush          47
	// 3315 6429:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3316 6432:new             #6   <Class Version$ECB>
	// 3317 6435:dup             
	// 3318 6436:bipush          31
	// 3319 6438:bipush          48
	// 3320 6440:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3321 6443:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 3322 6446:astore          40
		ecblocks2 = new ECBlocks(30, new ECB(34, 24), new ECB(34, 25));
	// 3323 6448:new             #9   <Class Version$ECBlocks>
	// 3324 6451:dup             
	// 3325 6452:bipush          30
	// 3326 6454:new             #6   <Class Version$ECB>
	// 3327 6457:dup             
	// 3328 6458:bipush          34
	// 3329 6460:bipush          24
	// 3330 6462:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3331 6465:new             #6   <Class Version$ECB>
	// 3332 6468:dup             
	// 3333 6469:bipush          34
	// 3334 6471:bipush          25
	// 3335 6473:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3336 6476:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 3337 6479:astore          41
		ECBlocks ecblocks3 = new ECBlocks(30, new ECB(20, 15), new ECB(61, 16));
	// 3338 6481:new             #9   <Class Version$ECBlocks>
	// 3339 6484:dup             
	// 3340 6485:bipush          30
	// 3341 6487:new             #6   <Class Version$ECB>
	// 3342 6490:dup             
	// 3343 6491:bipush          20
	// 3344 6493:bipush          15
	// 3345 6495:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3346 6498:new             #6   <Class Version$ECB>
	// 3347 6501:dup             
	// 3348 6502:bipush          61
	// 3349 6504:bipush          16
	// 3350 6506:invokespecial   #93  <Method void Version$ECB(int, int)>
	// 3351 6509:invokespecial   #101 <Method void Version$ECBlocks(int, Version$ECB, Version$ECB)>
	// 3352 6512:astore          42
		return (new Version[] {
			obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
			obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, 
			obj20, obj21, obj22, obj23, obj24, obj25, obj26, obj27, obj28, obj29, 
			obj30, obj31, obj32, obj33, obj34, obj35, obj36, obj37, obj38, new Version(40, new int[] {
				6, 30, 58, 86, 114, 142, 170
			}, ecblocks, ecblocks1, ecblocks2, ecblocks3)
		});
	// 3353 6514:bipush          40
	// 3354 6516:anewarray       Version[]
	// 3355 6519:dup             
	// 3356 6520:iconst_0        
	// 3357 6521:aload_0         
	// 3358 6522:aastore         
	// 3359 6523:dup             
	// 3360 6524:iconst_1        
	// 3361 6525:aload_1         
	// 3362 6526:aastore         
	// 3363 6527:dup             
	// 3364 6528:iconst_2        
	// 3365 6529:aload_2         
	// 3366 6530:aastore         
	// 3367 6531:dup             
	// 3368 6532:iconst_3        
	// 3369 6533:aload_3         
	// 3370 6534:aastore         
	// 3371 6535:dup             
	// 3372 6536:iconst_4        
	// 3373 6537:aload           4
	// 3374 6539:aastore         
	// 3375 6540:dup             
	// 3376 6541:iconst_5        
	// 3377 6542:aload           5
	// 3378 6544:aastore         
	// 3379 6545:dup             
	// 3380 6546:bipush          6
	// 3381 6548:aload           6
	// 3382 6550:aastore         
	// 3383 6551:dup             
	// 3384 6552:bipush          7
	// 3385 6554:aload           7
	// 3386 6556:aastore         
	// 3387 6557:dup             
	// 3388 6558:bipush          8
	// 3389 6560:aload           8
	// 3390 6562:aastore         
	// 3391 6563:dup             
	// 3392 6564:bipush          9
	// 3393 6566:aload           9
	// 3394 6568:aastore         
	// 3395 6569:dup             
	// 3396 6570:bipush          10
	// 3397 6572:aload           10
	// 3398 6574:aastore         
	// 3399 6575:dup             
	// 3400 6576:bipush          11
	// 3401 6578:aload           11
	// 3402 6580:aastore         
	// 3403 6581:dup             
	// 3404 6582:bipush          12
	// 3405 6584:aload           12
	// 3406 6586:aastore         
	// 3407 6587:dup             
	// 3408 6588:bipush          13
	// 3409 6590:aload           13
	// 3410 6592:aastore         
	// 3411 6593:dup             
	// 3412 6594:bipush          14
	// 3413 6596:aload           14
	// 3414 6598:aastore         
	// 3415 6599:dup             
	// 3416 6600:bipush          15
	// 3417 6602:aload           15
	// 3418 6604:aastore         
	// 3419 6605:dup             
	// 3420 6606:bipush          16
	// 3421 6608:aload           16
	// 3422 6610:aastore         
	// 3423 6611:dup             
	// 3424 6612:bipush          17
	// 3425 6614:aload           17
	// 3426 6616:aastore         
	// 3427 6617:dup             
	// 3428 6618:bipush          18
	// 3429 6620:aload           18
	// 3430 6622:aastore         
	// 3431 6623:dup             
	// 3432 6624:bipush          19
	// 3433 6626:aload           19
	// 3434 6628:aastore         
	// 3435 6629:dup             
	// 3436 6630:bipush          20
	// 3437 6632:aload           20
	// 3438 6634:aastore         
	// 3439 6635:dup             
	// 3440 6636:bipush          21
	// 3441 6638:aload           21
	// 3442 6640:aastore         
	// 3443 6641:dup             
	// 3444 6642:bipush          22
	// 3445 6644:aload           22
	// 3446 6646:aastore         
	// 3447 6647:dup             
	// 3448 6648:bipush          23
	// 3449 6650:aload           23
	// 3450 6652:aastore         
	// 3451 6653:dup             
	// 3452 6654:bipush          24
	// 3453 6656:aload           24
	// 3454 6658:aastore         
	// 3455 6659:dup             
	// 3456 6660:bipush          25
	// 3457 6662:aload           25
	// 3458 6664:aastore         
	// 3459 6665:dup             
	// 3460 6666:bipush          26
	// 3461 6668:aload           26
	// 3462 6670:aastore         
	// 3463 6671:dup             
	// 3464 6672:bipush          27
	// 3465 6674:aload           27
	// 3466 6676:aastore         
	// 3467 6677:dup             
	// 3468 6678:bipush          28
	// 3469 6680:aload           28
	// 3470 6682:aastore         
	// 3471 6683:dup             
	// 3472 6684:bipush          29
	// 3473 6686:aload           29
	// 3474 6688:aastore         
	// 3475 6689:dup             
	// 3476 6690:bipush          30
	// 3477 6692:aload           30
	// 3478 6694:aastore         
	// 3479 6695:dup             
	// 3480 6696:bipush          31
	// 3481 6698:aload           31
	// 3482 6700:aastore         
	// 3483 6701:dup             
	// 3484 6702:bipush          32
	// 3485 6704:aload           32
	// 3486 6706:aastore         
	// 3487 6707:dup             
	// 3488 6708:bipush          33
	// 3489 6710:aload           33
	// 3490 6712:aastore         
	// 3491 6713:dup             
	// 3492 6714:bipush          34
	// 3493 6716:aload           34
	// 3494 6718:aastore         
	// 3495 6719:dup             
	// 3496 6720:bipush          35
	// 3497 6722:aload           35
	// 3498 6724:aastore         
	// 3499 6725:dup             
	// 3500 6726:bipush          36
	// 3501 6728:aload           36
	// 3502 6730:aastore         
	// 3503 6731:dup             
	// 3504 6732:bipush          37
	// 3505 6734:aload           37
	// 3506 6736:aastore         
	// 3507 6737:dup             
	// 3508 6738:bipush          38
	// 3509 6740:aload           38
	// 3510 6742:aastore         
	// 3511 6743:dup             
	// 3512 6744:bipush          39
	// 3513 6746:new             #2   <Class Version>
	// 3514 6749:dup             
	// 3515 6750:bipush          40
	// 3516 6752:bipush          7
	// 3517 6754:newarray        int[]
	// 3518 6756:dup             
	// 3519 6757:iconst_0        
	// 3520 6758:bipush          6
	// 3521 6760:iastore         
	// 3522 6761:dup             
	// 3523 6762:iconst_1        
	// 3524 6763:bipush          30
	// 3525 6765:iastore         
	// 3526 6766:dup             
	// 3527 6767:iconst_2        
	// 3528 6768:bipush          58
	// 3529 6770:iastore         
	// 3530 6771:dup             
	// 3531 6772:iconst_3        
	// 3532 6773:bipush          86
	// 3533 6775:iastore         
	// 3534 6776:dup             
	// 3535 6777:iconst_4        
	// 3536 6778:bipush          114
	// 3537 6780:iastore         
	// 3538 6781:dup             
	// 3539 6782:iconst_5        
	// 3540 6783:sipush          142
	// 3541 6786:iastore         
	// 3542 6787:dup             
	// 3543 6788:bipush          6
	// 3544 6790:sipush          170
	// 3545 6793:iastore         
	// 3546 6794:aload           39
	// 3547 6796:aload           40
	// 3548 6798:aload           41
	// 3549 6800:aload           42
	// 3550 6802:invokespecial   #98  <Method void Version(int, int[], Version$ECBlocks, Version$ECBlocks, Version$ECBlocks, Version$ECBlocks)>
	// 3551 6805:aastore         
	// 3552 6806:areturn         
	}

	static Version decodeVersionInformation(int i)
	{
		int k = 0x7fffffff;
	//    0    0:ldc1            #104 <Int 0x7fffffff>
	//    1    2:istore_2        
		int l = 0;
	//    2    3:iconst_0        
	//    3    4:istore_3        
		for(int j = 0; j < VERSION_DECODE_INFO.length;)
	//*   4    5:iconst_0        
	//*   5    6:istore_1        
	//*   6    7:iload_1         
	//*   7    8:getstatic       #57  <Field int[] VERSION_DECODE_INFO>
	//*   8   11:arraylength     
	//*   9   12:icmpge          72
		{
			int i1 = VERSION_DECODE_INFO[j];
	//   10   15:getstatic       #57  <Field int[] VERSION_DECODE_INFO>
	//   11   18:iload_1         
	//   12   19:iaload          
	//   13   20:istore          4
			if(i1 == i)
	//*  14   22:iload           4
	//*  15   24:iload_0         
	//*  16   25:icmpne          36
				return getVersionForNumber(j + 7);
	//   17   28:iload_1         
	//   18   29:bipush          7
	//   19   31:iadd            
	//   20   32:invokestatic    #107 <Method Version getVersionForNumber(int)>
	//   21   35:areturn         
			int j1 = FormatInformation.numBitsDiffering(i, i1);
	//   22   36:iload_0         
	//   23   37:iload           4
	//   24   39:invokestatic    #113 <Method int FormatInformation.numBitsDiffering(int, int)>
	//   25   42:istore          5
			i1 = k;
	//   26   44:iload_2         
	//   27   45:istore          4
			if(j1 < k)
	//*  28   47:iload           5
	//*  29   49:iload_2         
	//*  30   50:icmpge          62
			{
				l = j + 7;
	//   31   53:iload_1         
	//   32   54:bipush          7
	//   33   56:iadd            
	//   34   57:istore_3        
				i1 = j1;
	//   35   58:iload           5
	//   36   60:istore          4
			}
			j++;
	//   37   62:iload_1         
	//   38   63:iconst_1        
	//   39   64:iadd            
	//   40   65:istore_1        
			k = i1;
	//   41   66:iload           4
	//   42   68:istore_2        
		}

	//*  43   69:goto            7
		if(k <= 3)
	//*  44   72:iload_2         
	//*  45   73:iconst_3        
	//*  46   74:icmpgt          82
			return getVersionForNumber(l);
	//   47   77:iload_3         
	//   48   78:invokestatic    #107 <Method Version getVersionForNumber(int)>
	//   49   81:areturn         
		else
			return null;
	//   50   82:aconst_null     
	//   51   83:areturn         
	}

	public static Version getProvisionalVersionForDimension(int i)
	{
		if(i % 4 != 1)
	//*   0    0:iload_0         
	//*   1    1:iconst_4        
	//*   2    2:irem            
	//*   3    3:iconst_1        
	//*   4    4:icmpeq          15
			throw new IllegalArgumentException();
	//    5    7:new             #116 <Class IllegalArgumentException>
	//    6   10:dup             
	//    7   11:invokespecial   #117 <Method void IllegalArgumentException()>
	//    8   14:athrow          
		Version version;
		try
		{
			version = getVersionForNumber(i - 17 >> 2);
	//    9   15:iload_0         
	//   10   16:bipush          17
	//   11   18:isub            
	//   12   19:iconst_2        
	//   13   20:ishr            
	//   14   21:invokestatic    #107 <Method Version getVersionForNumber(int)>
	//   15   24:astore_1        
		}
	//*  16   25:aload_1         
	//*  17   26:areturn         
		catch(IllegalArgumentException illegalargumentexception)
	//*  18   27:astore_1        
		{
			throw illegalargumentexception;
	//   19   28:aload_1         
	//   20   29:athrow          
		}
		return version;
	}

	public static Version getVersionForNumber(int i)
	{
		if(i < 1 || i > 40)
	//*   0    0:iload_0         
	//*   1    1:iconst_1        
	//*   2    2:icmplt          11
	//*   3    5:iload_0         
	//*   4    6:bipush          40
	//*   5    8:icmple          19
			throw new IllegalArgumentException();
	//    6   11:new             #116 <Class IllegalArgumentException>
	//    7   14:dup             
	//    8   15:invokespecial   #117 <Method void IllegalArgumentException()>
	//    9   18:athrow          
		else
			return VERSIONS[i - 1];
	//   10   19:getstatic       #63  <Field Version[] VERSIONS>
	//   11   22:iload_0         
	//   12   23:iconst_1        
	//   13   24:isub            
	//   14   25:aaload          
	//   15   26:areturn         
	}

	BitMatrix buildFunctionPattern()
	{
		int k = getDimensionForVersion();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #122 <Method int getDimensionForVersion()>
	//    2    4:istore_3        
		BitMatrix bitmatrix = new BitMatrix(k);
	//    3    5:new             #124 <Class BitMatrix>
	//    4    8:dup             
	//    5    9:iload_3         
	//    6   10:invokespecial   #127 <Method void BitMatrix(int)>
	//    7   13:astore          6
		bitmatrix.setRegion(0, 0, 9, 9);
	//    8   15:aload           6
	//    9   17:iconst_0        
	//   10   18:iconst_0        
	//   11   19:bipush          9
	//   12   21:bipush          9
	//   13   23:invokevirtual   #131 <Method void BitMatrix.setRegion(int, int, int, int)>
		bitmatrix.setRegion(k - 8, 0, 8, 9);
	//   14   26:aload           6
	//   15   28:iload_3         
	//   16   29:bipush          8
	//   17   31:isub            
	//   18   32:iconst_0        
	//   19   33:bipush          8
	//   20   35:bipush          9
	//   21   37:invokevirtual   #131 <Method void BitMatrix.setRegion(int, int, int, int)>
		bitmatrix.setRegion(0, k - 8, 9, 8);
	//   22   40:aload           6
	//   23   42:iconst_0        
	//   24   43:iload_3         
	//   25   44:bipush          8
	//   26   46:isub            
	//   27   47:bipush          9
	//   28   49:bipush          8
	//   29   51:invokevirtual   #131 <Method void BitMatrix.setRegion(int, int, int, int)>
		int l = alignmentPatternCenters.length;
	//   30   54:aload_0         
	//   31   55:getfield        #72  <Field int[] alignmentPatternCenters>
	//   32   58:arraylength     
	//   33   59:istore          4
		for(int i = 0; i < l; i++)
	//*  34   61:iconst_0        
	//*  35   62:istore_1        
	//*  36   63:iload_1         
	//*  37   64:iload           4
	//*  38   66:icmpge          149
		{
			int i1 = alignmentPatternCenters[i];
	//   39   69:aload_0         
	//   40   70:getfield        #72  <Field int[] alignmentPatternCenters>
	//   41   73:iload_1         
	//   42   74:iaload          
	//   43   75:istore          5
			int j = 0;
	//   44   77:iconst_0        
	//   45   78:istore_2        
			while(j < l) 
	//*  46   79:iload_2         
	//*  47   80:iload           4
	//*  48   82:icmpge          142
			{
				if((i != 0 || j != 0 && j != l - 1) && (i != l - 1 || j != 0))
	//*  49   85:iload_1         
	//*  50   86:ifne            101
	//*  51   89:iload_2         
	//*  52   90:ifeq            113
	//*  53   93:iload_2         
	//*  54   94:iload           4
	//*  55   96:iconst_1        
	//*  56   97:isub            
	//*  57   98:icmpeq          113
	//*  58  101:iload_1         
	//*  59  102:iload           4
	//*  60  104:iconst_1        
	//*  61  105:isub            
	//*  62  106:icmpne          120
	//*  63  109:iload_2         
	//*  64  110:ifne            120
	//*  65  113:iload_2         
	//*  66  114:iconst_1        
	//*  67  115:iadd            
	//*  68  116:istore_2        
	//*  69  117:goto            79
					bitmatrix.setRegion(alignmentPatternCenters[j] - 2, i1 - 2, 5, 5);
	//   70  120:aload           6
	//   71  122:aload_0         
	//   72  123:getfield        #72  <Field int[] alignmentPatternCenters>
	//   73  126:iload_2         
	//   74  127:iaload          
	//   75  128:iconst_2        
	//   76  129:isub            
	//   77  130:iload           5
	//   78  132:iconst_2        
	//   79  133:isub            
	//   80  134:iconst_5        
	//   81  135:iconst_5        
	//   82  136:invokevirtual   #131 <Method void BitMatrix.setRegion(int, int, int, int)>
				j++;
			}
		}

	//   83  139:goto            113
	//   84  142:iload_1         
	//   85  143:iconst_1        
	//   86  144:iadd            
	//   87  145:istore_1        
	//*  88  146:goto            63
		bitmatrix.setRegion(6, 9, 1, k - 17);
	//   89  149:aload           6
	//   90  151:bipush          6
	//   91  153:bipush          9
	//   92  155:iconst_1        
	//   93  156:iload_3         
	//   94  157:bipush          17
	//   95  159:isub            
	//   96  160:invokevirtual   #131 <Method void BitMatrix.setRegion(int, int, int, int)>
		bitmatrix.setRegion(9, 6, k - 17, 1);
	//   97  163:aload           6
	//   98  165:bipush          9
	//   99  167:bipush          6
	//  100  169:iload_3         
	//  101  170:bipush          17
	//  102  172:isub            
	//  103  173:iconst_1        
	//  104  174:invokevirtual   #131 <Method void BitMatrix.setRegion(int, int, int, int)>
		if(versionNumber > 6)
	//* 105  177:aload_0         
	//* 106  178:getfield        #70  <Field int versionNumber>
	//* 107  181:bipush          6
	//* 108  183:icmple          212
		{
			bitmatrix.setRegion(k - 11, 0, 3, 6);
	//  109  186:aload           6
	//  110  188:iload_3         
	//  111  189:bipush          11
	//  112  191:isub            
	//  113  192:iconst_0        
	//  114  193:iconst_3        
	//  115  194:bipush          6
	//  116  196:invokevirtual   #131 <Method void BitMatrix.setRegion(int, int, int, int)>
			bitmatrix.setRegion(0, k - 11, 6, 3);
	//  117  199:aload           6
	//  118  201:iconst_0        
	//  119  202:iload_3         
	//  120  203:bipush          11
	//  121  205:isub            
	//  122  206:bipush          6
	//  123  208:iconst_3        
	//  124  209:invokevirtual   #131 <Method void BitMatrix.setRegion(int, int, int, int)>
		}
		return bitmatrix;
	//  125  212:aload           6
	//  126  214:areturn         
	}

	public int[] getAlignmentPatternCenters()
	{
		return alignmentPatternCenters;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int[] alignmentPatternCenters>
	//    2    4:areturn         
	}

	public int getDimensionForVersion()
	{
		return versionNumber * 4 + 17;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int versionNumber>
	//    2    4:iconst_4        
	//    3    5:imul            
	//    4    6:bipush          17
	//    5    8:iadd            
	//    6    9:ireturn         
	}

	public ECBlocks getECBlocksForLevel(ErrorCorrectionLevel errorcorrectionlevel)
	{
		return ecBlocks[errorcorrectionlevel.ordinal()];
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Version$ECBlocks[] ecBlocks>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #140 <Method int ErrorCorrectionLevel.ordinal()>
	//    4    8:aaload          
	//    5    9:areturn         
	}

	public int getTotalCodewords()
	{
		return totalCodewords;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field int totalCodewords>
	//    2    4:ireturn         
	}

	public int getVersionNumber()
	{
		return versionNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int versionNumber>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return String.valueOf(versionNumber);
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int versionNumber>
	//    2    4:invokestatic    #150 <Method String String.valueOf(int)>
	//    3    7:areturn         
	}

	private static final Version VERSIONS[] = buildVersions();
	private static final int VERSION_DECODE_INFO[] = {
		31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 0x10b78, 
		0x1145d, 0x12a17, 0x13532, 0x149a6, 0x15683, 0x168c9, 0x177ec, 0x18ec4, 0x191e1, 0x1afab, 
		0x1b08e, 0x1cc1a, 0x1d33f, 0x1ed75, 0x1f250, 0x209d5, 0x216f0, 0x228ba, 0x2379f, 0x24b0b, 
		0x2542e, 0x26a64, 0x27541, 0x28c69
	};
	private final int alignmentPatternCenters[];
	private final ECBlocks ecBlocks[];
	private final int totalCodewords;
	private final int versionNumber;

	static 
	{
	//    0    0:bipush          34
	//    1    2:newarray        int[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:sipush          31892
	//    5    9:iastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #23  <Int 34236>
	//    9   14:iastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #24  <Int 39577>
	//   13   19:iastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #25  <Int 42195>
	//   17   24:iastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #26  <Int 48118>
	//   21   29:iastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #27  <Int 51042>
	//   25   34:iastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #28  <Int 55367>
	//   29   40:iastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #29  <Int 58893>
	//   33   46:iastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #30  <Int 63784>
	//   37   52:iastore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:ldc1            #31  <Int 0x10b78>
	//   41   58:iastore         
	//   42   59:dup             
	//   43   60:bipush          10
	//   44   62:ldc1            #32  <Int 0x1145d>
	//   45   64:iastore         
	//   46   65:dup             
	//   47   66:bipush          11
	//   48   68:ldc1            #33  <Int 0x12a17>
	//   49   70:iastore         
	//   50   71:dup             
	//   51   72:bipush          12
	//   52   74:ldc1            #34  <Int 0x13532>
	//   53   76:iastore         
	//   54   77:dup             
	//   55   78:bipush          13
	//   56   80:ldc1            #35  <Int 0x149a6>
	//   57   82:iastore         
	//   58   83:dup             
	//   59   84:bipush          14
	//   60   86:ldc1            #36  <Int 0x15683>
	//   61   88:iastore         
	//   62   89:dup             
	//   63   90:bipush          15
	//   64   92:ldc1            #37  <Int 0x168c9>
	//   65   94:iastore         
	//   66   95:dup             
	//   67   96:bipush          16
	//   68   98:ldc1            #38  <Int 0x177ec>
	//   69  100:iastore         
	//   70  101:dup             
	//   71  102:bipush          17
	//   72  104:ldc1            #39  <Int 0x18ec4>
	//   73  106:iastore         
	//   74  107:dup             
	//   75  108:bipush          18
	//   76  110:ldc1            #40  <Int 0x191e1>
	//   77  112:iastore         
	//   78  113:dup             
	//   79  114:bipush          19
	//   80  116:ldc1            #41  <Int 0x1afab>
	//   81  118:iastore         
	//   82  119:dup             
	//   83  120:bipush          20
	//   84  122:ldc1            #42  <Int 0x1b08e>
	//   85  124:iastore         
	//   86  125:dup             
	//   87  126:bipush          21
	//   88  128:ldc1            #43  <Int 0x1cc1a>
	//   89  130:iastore         
	//   90  131:dup             
	//   91  132:bipush          22
	//   92  134:ldc1            #44  <Int 0x1d33f>
	//   93  136:iastore         
	//   94  137:dup             
	//   95  138:bipush          23
	//   96  140:ldc1            #45  <Int 0x1ed75>
	//   97  142:iastore         
	//   98  143:dup             
	//   99  144:bipush          24
	//  100  146:ldc1            #46  <Int 0x1f250>
	//  101  148:iastore         
	//  102  149:dup             
	//  103  150:bipush          25
	//  104  152:ldc1            #47  <Int 0x209d5>
	//  105  154:iastore         
	//  106  155:dup             
	//  107  156:bipush          26
	//  108  158:ldc1            #48  <Int 0x216f0>
	//  109  160:iastore         
	//  110  161:dup             
	//  111  162:bipush          27
	//  112  164:ldc1            #49  <Int 0x228ba>
	//  113  166:iastore         
	//  114  167:dup             
	//  115  168:bipush          28
	//  116  170:ldc1            #50  <Int 0x2379f>
	//  117  172:iastore         
	//  118  173:dup             
	//  119  174:bipush          29
	//  120  176:ldc1            #51  <Int 0x24b0b>
	//  121  178:iastore         
	//  122  179:dup             
	//  123  180:bipush          30
	//  124  182:ldc1            #52  <Int 0x2542e>
	//  125  184:iastore         
	//  126  185:dup             
	//  127  186:bipush          31
	//  128  188:ldc1            #53  <Int 0x26a64>
	//  129  190:iastore         
	//  130  191:dup             
	//  131  192:bipush          32
	//  132  194:ldc1            #54  <Int 0x27541>
	//  133  196:iastore         
	//  134  197:dup             
	//  135  198:bipush          33
	//  136  200:ldc1            #55  <Int 0x28c69>
	//  137  202:iastore         
	//  138  203:putstatic       #57  <Field int[] VERSION_DECODE_INFO>
	//  139  206:invokestatic    #61  <Method Version[] buildVersions()>
	//  140  209:putstatic       #63  <Field Version[] VERSIONS>
	//* 141  212:return          
	}
}
