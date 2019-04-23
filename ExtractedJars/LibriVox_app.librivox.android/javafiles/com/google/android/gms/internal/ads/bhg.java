// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bnw, bfo, bno, bgj

final class bhg
{

	public static boolean a(bfo bfo1)
	{
		return a(bfo1, true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #69  <Method boolean a(bfo, boolean)>
	//    3    5:ireturn         
	}

	private static boolean a(bfo bfo1, boolean flag)
	{
		long l2;
label0:
		{
			long l4 = bfo1.c();
	//    0    0:aload_0         
	//    1    1:invokeinterface #75  <Method long bfo.c()>
	//    2    6:lstore          13
			if(l4 != -1L)
	//*   3    8:lload           13
	//*   4   10:ldc2w           #76  <Long -1L>
	//*   5   13:lcmp            
	//*   6   14:ifeq            30
			{
				l2 = l4;
	//    7   17:lload           13
	//    8   19:lstore          11
				if(l4 <= 4096L)
					break label0;
	//    9   21:lload           13
	//   10   23:ldc2w           #78  <Long 4096L>
	//   11   26:lcmp            
	//   12   27:ifle            35
			}
			l2 = 4096L;
	//   13   30:ldc2w           #78  <Long 4096L>
	//   14   33:lstore          11
		}
		int j;
		boolean flag1;
label1:
		{
label2:
			{
				int j1 = (int)l2;
	//   15   35:lload           11
	//   16   37:l2i             
	//   17   38:istore          7
				bno bno1 = new bno(64);
	//   18   40:new             #81  <Class bno>
	//   19   43:dup             
	//   20   44:bipush          64
	//   21   46:invokespecial   #85  <Method void bno(int)>
	//   22   49:astore          15
				int i = 0;
	//   23   51:iconst_0        
	//   24   52:istore_2        
				j = 0;
	//   25   53:iconst_0        
	//   26   54:istore_3        
label3:
				do
				{
					int i1;
					int k1;
label4:
					{
						int k;
						int l;
						long l3;
						long l5;
						do
						{
							if(i >= j1)
								break label2;
	//   27   55:iload_2         
	//   28   56:iload           7
	//   29   58:icmpge          423
							bno1.a(8);
	//   30   61:aload           15
	//   31   63:bipush          8
	//   32   65:invokevirtual   #87  <Method void bno.a(int)>
							bfo1.c(bno1.a, 0, 8);
	//   33   68:aload_0         
	//   34   69:aload           15
	//   35   71:getfield        #90  <Field byte[] bno.a>
	//   36   74:iconst_0        
	//   37   75:bipush          8
	//   38   77:invokeinterface #93  <Method void bfo.c(byte[], int, int)>
							l3 = bno1.j();
	//   39   82:aload           15
	//   40   84:invokevirtual   #96  <Method long bno.j()>
	//   41   87:lstore          11
							l = bno1.l();
	//   42   89:aload           15
	//   43   91:invokevirtual   #100 <Method int bno.l()>
	//   44   94:istore          5
							k = 16;
	//   45   96:bipush          16
	//   46   98:istore          4
							if(l3 == 1L)
	//*  47  100:lload           11
	//*  48  102:lconst_1        
	//*  49  103:lcmp            
	//*  50  104:ifne            139
							{
								bfo1.c(bno1.a, 8, 8);
	//   51  107:aload_0         
	//   52  108:aload           15
	//   53  110:getfield        #90  <Field byte[] bno.a>
	//   54  113:bipush          8
	//   55  115:bipush          8
	//   56  117:invokeinterface #93  <Method void bfo.c(byte[], int, int)>
								bno1.b(16);
	//   57  122:aload           15
	//   58  124:bipush          16
	//   59  126:invokevirtual   #103 <Method void bno.b(int)>
								l3 = bno1.p();
	//   60  129:aload           15
	//   61  131:invokevirtual   #106 <Method long bno.p()>
	//   62  134:lstore          11
							} else
	//*  63  136:goto            143
							{
								k = 8;
	//   64  139:bipush          8
	//   65  141:istore          4
							}
							l5 = k;
	//   66  143:iload           4
	//   67  145:i2l             
	//   68  146:lstore          13
							if(l3 < l5)
	//*  69  148:lload           11
	//*  70  150:lload           13
	//*  71  152:lcmp            
	//*  72  153:ifge            158
								return false;
	//   73  156:iconst_0        
	//   74  157:ireturn         
							k = i + k;
	//   75  158:iload_2         
	//   76  159:iload           4
	//   77  161:iadd            
	//   78  162:istore          4
							i = k;
	//   79  164:iload           4
	//   80  166:istore_2        
						} while(l == bgj.B);
	//   81  167:iload           5
	//   82  169:getstatic       #112 <Field int bgj.B>
	//   83  172:icmpeq          55
						if(l == bgj.K || l == bgj.M)
	//*  84  175:iload           5
	//*  85  177:getstatic       #115 <Field int bgj.K>
	//*  86  180:icmpeq          417
	//*  87  183:iload           5
	//*  88  185:getstatic       #118 <Field int bgj.M>
	//*  89  188:icmpne          194
							break label3;
	//   90  191:goto            417
						if(((long)k + l3) - l5 >= (long)j1)
							break label2;
	//   91  194:iload           4
	//   92  196:i2l             
	//   93  197:lload           11
	//   94  199:ladd            
	//   95  200:lload           13
	//   96  202:lsub            
	//   97  203:iload           7
	//   98  205:i2l             
	//   99  206:lcmp            
	//  100  207:ifge            423
						k1 = (int)(l3 - l5);
	//  101  210:lload           11
	//  102  212:lload           13
	//  103  214:lsub            
	//  104  215:l2i             
	//  105  216:istore          8
						i1 = k + k1;
	//  106  218:iload           4
	//  107  220:iload           8
	//  108  222:iadd            
	//  109  223:istore          6
						if(l != bgj.a)
							break label4;
	//  110  225:iload           5
	//  111  227:getstatic       #120 <Field int bgj.a>
	//  112  230:icmpne          395
						if(k1 < 8)
	//* 113  233:iload           8
	//* 114  235:bipush          8
	//* 115  237:icmpge          242
							return false;
	//  116  240:iconst_0        
	//  117  241:ireturn         
						bno1.a(k1);
	//  118  242:aload           15
	//  119  244:iload           8
	//  120  246:invokevirtual   #87  <Method void bno.a(int)>
						bfo1.c(bno1.a, 0, k1);
	//  121  249:aload_0         
	//  122  250:aload           15
	//  123  252:getfield        #90  <Field byte[] bno.a>
	//  124  255:iconst_0        
	//  125  256:iload           8
	//  126  258:invokeinterface #93  <Method void bfo.c(byte[], int, int)>
						k1 /= 4;
	//  127  263:iload           8
	//  128  265:iconst_4        
	//  129  266:idiv            
	//  130  267:istore          8
						k = 0;
	//  131  269:iconst_0        
	//  132  270:istore          4
label5:
						do
						{
label6:
							{
label7:
								{
									l = j;
	//  133  272:iload_3         
	//  134  273:istore          5
									if(k >= k1)
										break label5;
	//  135  275:iload           4
	//  136  277:iload           8
	//  137  279:icmpge          382
									if(k == 1)
	//* 138  282:iload           4
	//* 139  284:iconst_1        
	//* 140  285:icmpne          297
									{
										bno1.d(4);
	//  141  288:aload           15
	//  142  290:iconst_4        
	//  143  291:invokevirtual   #123 <Method void bno.d(int)>
										break label6;
	//  144  294:goto            373
									}
									l = bno1.l();
	//  145  297:aload           15
	//  146  299:invokevirtual   #100 <Method int bno.l()>
	//  147  302:istore          5
									if(l >>> 8 == bnw.f("3gp"))
	//* 148  304:iload           5
	//* 149  306:bipush          8
	//* 150  308:iushr           
	//* 151  309:ldc1            #125 <String "3gp">
	//* 152  311:invokestatic    #16  <Method int bnw.f(String)>
	//* 153  314:icmpne          322
									{
										i = 1;
	//  154  317:iconst_1        
	//  155  318:istore_2        
										break label7;
	//  156  319:goto            363
									}
									int ai[] = a;
	//  157  322:getstatic       #64  <Field int[] a>
	//  158  325:astore          16
									int l1 = ai.length;
	//  159  327:aload           16
	//  160  329:arraylength     
	//  161  330:istore          9
									i = 0;
	//  162  332:iconst_0        
	//  163  333:istore_2        
									do
									{
										if(i >= l1)
											break;
	//  164  334:iload_2         
	//  165  335:iload           9
	//  166  337:icmpge          361
										if(ai[i] == l)
	//* 167  340:aload           16
	//* 168  342:iload_2         
	//* 169  343:iaload          
	//* 170  344:iload           5
	//* 171  346:icmpne          354
										{
											i = 1;
	//  172  349:iconst_1        
	//  173  350:istore_2        
											break label7;
	//  174  351:goto            363
										}
										i++;
	//  175  354:iload_2         
	//  176  355:iconst_1        
	//  177  356:iadd            
	//  178  357:istore_2        
									} while(true);
	//  179  358:goto            334
									i = 0;
	//  180  361:iconst_0        
	//  181  362:istore_2        
								}
								if(i != 0)
	//* 182  363:iload_2         
	//* 183  364:ifeq            373
								{
									l = 1;
	//  184  367:iconst_1        
	//  185  368:istore          5
									break label5;
	//  186  370:goto            382
								}
							}
							k++;
	//  187  373:iload           4
	//  188  375:iconst_1        
	//  189  376:iadd            
	//  190  377:istore          4
						} while(true);
	//  191  379:goto            272
						i = i1;
	//  192  382:iload           6
	//  193  384:istore_2        
						j = l;
	//  194  385:iload           5
	//  195  387:istore_3        
						if(l == 0)
	//* 196  388:iload           5
	//* 197  390:ifne            55
							return false;
	//  198  393:iconst_0        
	//  199  394:ireturn         
						continue;
					}
					i = i1;
	//  200  395:iload           6
	//  201  397:istore_2        
					if(k1 != 0)
	//* 202  398:iload           8
	//* 203  400:ifeq            55
					{
						bfo1.c(k1);
	//  204  403:aload_0         
	//  205  404:iload           8
	//  206  406:invokeinterface #127 <Method void bfo.c(int)>
						i = i1;
	//  207  411:iload           6
	//  208  413:istore_2        
					}
				} while(true);
	//  209  414:goto            55
				flag1 = true;
	//  210  417:iconst_1        
	//  211  418:istore          10
				break label1;
	//  212  420:goto            426
			}
			flag1 = false;
	//  213  423:iconst_0        
	//  214  424:istore          10
		}
		return j != 0 && flag == flag1;
	//  215  426:iload_3         
	//  216  427:ifeq            438
	//  217  430:iload_1         
	//  218  431:iload           10
	//  219  433:icmpne          438
	//  220  436:iconst_1        
	//  221  437:ireturn         
	//  222  438:iconst_0        
	//  223  439:ireturn         
	}

	public static boolean b(bfo bfo1)
	{
		return a(bfo1, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #69  <Method boolean a(bfo, boolean)>
	//    3    5:ireturn         
	}

	private static final int a[] = {
		bnw.f("isom"), bnw.f("iso2"), bnw.f("iso3"), bnw.f("iso4"), bnw.f("iso5"), bnw.f("iso6"), bnw.f("avc1"), bnw.f("hvc1"), bnw.f("hev1"), bnw.f("mp41"), 
		bnw.f("mp42"), bnw.f("3g2a"), bnw.f("3g2b"), bnw.f("3gr6"), bnw.f("3gs6"), bnw.f("3ge6"), bnw.f("3gg6"), bnw.f("M4V "), bnw.f("M4A "), bnw.f("f4v "), 
		bnw.f("kddi"), bnw.f("M4VP"), bnw.f("qt  "), bnw.f("MSNV")
	};

	static 
	{
	//    0    0:bipush          24
	//    1    2:newarray        int[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #10  <String "isom">
	//    5    8:invokestatic    #16  <Method int bnw.f(String)>
	//    6   11:iastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:ldc1            #18  <String "iso2">
	//   10   16:invokestatic    #16  <Method int bnw.f(String)>
	//   11   19:iastore         
	//   12   20:dup             
	//   13   21:iconst_2        
	//   14   22:ldc1            #20  <String "iso3">
	//   15   24:invokestatic    #16  <Method int bnw.f(String)>
	//   16   27:iastore         
	//   17   28:dup             
	//   18   29:iconst_3        
	//   19   30:ldc1            #22  <String "iso4">
	//   20   32:invokestatic    #16  <Method int bnw.f(String)>
	//   21   35:iastore         
	//   22   36:dup             
	//   23   37:iconst_4        
	//   24   38:ldc1            #24  <String "iso5">
	//   25   40:invokestatic    #16  <Method int bnw.f(String)>
	//   26   43:iastore         
	//   27   44:dup             
	//   28   45:iconst_5        
	//   29   46:ldc1            #26  <String "iso6">
	//   30   48:invokestatic    #16  <Method int bnw.f(String)>
	//   31   51:iastore         
	//   32   52:dup             
	//   33   53:bipush          6
	//   34   55:ldc1            #28  <String "avc1">
	//   35   57:invokestatic    #16  <Method int bnw.f(String)>
	//   36   60:iastore         
	//   37   61:dup             
	//   38   62:bipush          7
	//   39   64:ldc1            #30  <String "hvc1">
	//   40   66:invokestatic    #16  <Method int bnw.f(String)>
	//   41   69:iastore         
	//   42   70:dup             
	//   43   71:bipush          8
	//   44   73:ldc1            #32  <String "hev1">
	//   45   75:invokestatic    #16  <Method int bnw.f(String)>
	//   46   78:iastore         
	//   47   79:dup             
	//   48   80:bipush          9
	//   49   82:ldc1            #34  <String "mp41">
	//   50   84:invokestatic    #16  <Method int bnw.f(String)>
	//   51   87:iastore         
	//   52   88:dup             
	//   53   89:bipush          10
	//   54   91:ldc1            #36  <String "mp42">
	//   55   93:invokestatic    #16  <Method int bnw.f(String)>
	//   56   96:iastore         
	//   57   97:dup             
	//   58   98:bipush          11
	//   59  100:ldc1            #38  <String "3g2a">
	//   60  102:invokestatic    #16  <Method int bnw.f(String)>
	//   61  105:iastore         
	//   62  106:dup             
	//   63  107:bipush          12
	//   64  109:ldc1            #40  <String "3g2b">
	//   65  111:invokestatic    #16  <Method int bnw.f(String)>
	//   66  114:iastore         
	//   67  115:dup             
	//   68  116:bipush          13
	//   69  118:ldc1            #42  <String "3gr6">
	//   70  120:invokestatic    #16  <Method int bnw.f(String)>
	//   71  123:iastore         
	//   72  124:dup             
	//   73  125:bipush          14
	//   74  127:ldc1            #44  <String "3gs6">
	//   75  129:invokestatic    #16  <Method int bnw.f(String)>
	//   76  132:iastore         
	//   77  133:dup             
	//   78  134:bipush          15
	//   79  136:ldc1            #46  <String "3ge6">
	//   80  138:invokestatic    #16  <Method int bnw.f(String)>
	//   81  141:iastore         
	//   82  142:dup             
	//   83  143:bipush          16
	//   84  145:ldc1            #48  <String "3gg6">
	//   85  147:invokestatic    #16  <Method int bnw.f(String)>
	//   86  150:iastore         
	//   87  151:dup             
	//   88  152:bipush          17
	//   89  154:ldc1            #50  <String "M4V ">
	//   90  156:invokestatic    #16  <Method int bnw.f(String)>
	//   91  159:iastore         
	//   92  160:dup             
	//   93  161:bipush          18
	//   94  163:ldc1            #52  <String "M4A ">
	//   95  165:invokestatic    #16  <Method int bnw.f(String)>
	//   96  168:iastore         
	//   97  169:dup             
	//   98  170:bipush          19
	//   99  172:ldc1            #54  <String "f4v ">
	//  100  174:invokestatic    #16  <Method int bnw.f(String)>
	//  101  177:iastore         
	//  102  178:dup             
	//  103  179:bipush          20
	//  104  181:ldc1            #56  <String "kddi">
	//  105  183:invokestatic    #16  <Method int bnw.f(String)>
	//  106  186:iastore         
	//  107  187:dup             
	//  108  188:bipush          21
	//  109  190:ldc1            #58  <String "M4VP">
	//  110  192:invokestatic    #16  <Method int bnw.f(String)>
	//  111  195:iastore         
	//  112  196:dup             
	//  113  197:bipush          22
	//  114  199:ldc1            #60  <String "qt  ">
	//  115  201:invokestatic    #16  <Method int bnw.f(String)>
	//  116  204:iastore         
	//  117  205:dup             
	//  118  206:bipush          23
	//  119  208:ldc1            #62  <String "MSNV">
	//  120  210:invokestatic    #16  <Method int bnw.f(String)>
	//  121  213:iastore         
	//  122  214:putstatic       #64  <Field int[] a>
	//* 123  217:return          
	}
}
