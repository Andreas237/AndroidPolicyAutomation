// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			is, bk, bi, bc, 
//			ip, jb, iq, iw, 
//			iu, iy

public final class bj extends is
{

	public bj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void is()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #25  <Field Long a>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #27  <Field String b>
		f = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #29  <Field Integer f>
		c = bk.a();
	//   11   19:aload_0         
	//   12   20:invokestatic    #34  <Method bk[] bk.a()>
	//   13   23:putfield        #36  <Field bk[] c>
		d = bi.a();
	//   14   26:aload_0         
	//   15   27:invokestatic    #41  <Method bi[] bi.a()>
	//   16   30:putfield        #43  <Field bi[] d>
		e = bc.a();
	//   17   33:aload_0         
	//   18   34:invokestatic    #48  <Method bc[] bc.a()>
	//   19   37:putfield        #50  <Field bc[] e>
		g = null;
	//   20   40:aload_0         
	//   21   41:aconst_null     
	//   22   42:putfield        #52  <Field String g>
		h = null;
	//   23   45:aload_0         
	//   24   46:aconst_null     
	//   25   47:putfield        #54  <Field Boolean h>
		L = null;
	//   26   50:aload_0         
	//   27   51:aconst_null     
	//   28   52:putfield        #58  <Field iu L>
		M = -1;
	//   29   55:aload_0         
	//   30   56:iconst_m1       
	//   31   57:putfield        #62  <Field int M>
	//   32   60:return          
	}

	public final iy a(ip ip1)
	{
		do
		{
			int i = ip1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #69  <Method int ip.a()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            501
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          487
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          476
				{
					if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
	//*  13   24:icmpeq          462
					{
						if(i != 34)
	//*  14   27:iload_2         
	//*  15   28:bipush          34
	//*  16   30:icmpeq          339
						{
							if(i != 42)
	//*  17   33:iload_2         
	//*  18   34:bipush          42
	//*  19   36:icmpeq          216
							{
								if(i != 50)
	//*  20   39:iload_2         
	//*  21   40:bipush          50
	//*  22   42:icmpeq          93
								{
									if(i != 58)
	//*  23   45:iload_2         
	//*  24   46:bipush          58
	//*  25   48:icmpeq          82
									{
										if(i != 64)
	//*  26   51:iload_2         
	//*  27   52:bipush          64
	//*  28   54:icmpeq          68
										{
											if(!super.a(ip1, i))
	//*  29   57:aload_0         
	//*  30   58:aload_1         
	//*  31   59:iload_2         
	//*  32   60:invokespecial   #72  <Method boolean is.a(ip, int)>
	//*  33   63:ifne            0
												return ((iy) (this));
	//   34   66:aload_0         
	//   35   67:areturn         
										} else
										{
											h = Boolean.valueOf(ip1.b());
	//   36   68:aload_0         
	//   37   69:aload_1         
	//   38   70:invokevirtual   #75  <Method boolean ip.b()>
	//   39   73:invokestatic    #81  <Method Boolean Boolean.valueOf(boolean)>
	//   40   76:putfield        #54  <Field Boolean h>
										}
									} else
	//*  41   79:goto            0
									{
										g = ip1.c();
	//   42   82:aload_0         
	//   43   83:aload_1         
	//   44   84:invokevirtual   #84  <Method String ip.c()>
	//   45   87:putfield        #52  <Field String g>
									}
								} else
	//*  46   90:goto            0
								{
									int i1 = jb.a(ip1, 50);
	//   47   93:aload_1         
	//   48   94:bipush          50
	//   49   96:invokestatic    #89  <Method int jb.a(ip, int)>
	//   50   99:istore_3        
									bc abc[] = e;
	//   51  100:aload_0         
	//   52  101:getfield        #50  <Field bc[] e>
	//   53  104:astore          4
									int j;
									if(abc == null)
	//*  54  106:aload           4
	//*  55  108:ifnonnull       116
										j = 0;
	//   56  111:iconst_0        
	//   57  112:istore_2        
									else
	//*  58  113:goto            120
										j = abc.length;
	//   59  116:aload           4
	//   60  118:arraylength     
	//   61  119:istore_2        
									abc = new bc[i1 + j];
	//   62  120:iload_3         
	//   63  121:iload_2         
	//   64  122:iadd            
	//   65  123:anewarray       bc[]
	//   66  126:astore          4
									i1 = j;
	//   67  128:iload_2         
	//   68  129:istore_3        
									if(j != 0)
	//*  69  130:iload_2         
	//*  70  131:ifeq            148
									{
										System.arraycopy(((Object) (e)), 0, ((Object) (abc)), 0, j);
	//   71  134:aload_0         
	//   72  135:getfield        #50  <Field bc[] e>
	//   73  138:iconst_0        
	//   74  139:aload           4
	//   75  141:iconst_0        
	//   76  142:iload_2         
	//   77  143:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
										i1 = j;
	//   78  146:iload_2         
	//   79  147:istore_3        
									}
									for(; i1 < abc.length - 1; i1++)
	//*  80  148:iload_3         
	//*  81  149:aload           4
	//*  82  151:arraylength     
	//*  83  152:iconst_1        
	//*  84  153:isub            
	//*  85  154:icmpge          188
									{
										abc[i1] = new bc();
	//   86  157:aload           4
	//   87  159:iload_3         
	//   88  160:new             #45  <Class bc>
	//   89  163:dup             
	//   90  164:invokespecial   #96  <Method void bc()>
	//   91  167:aastore         
										ip1.a(((iy) (abc[i1])));
	//   92  168:aload_1         
	//   93  169:aload           4
	//   94  171:iload_3         
	//   95  172:aaload          
	//   96  173:invokevirtual   #99  <Method void ip.a(iy)>
										ip1.a();
	//   97  176:aload_1         
	//   98  177:invokevirtual   #69  <Method int ip.a()>
	//   99  180:pop             
									}

	//  100  181:iload_3         
	//  101  182:iconst_1        
	//  102  183:iadd            
	//  103  184:istore_3        
	//* 104  185:goto            148
									abc[i1] = new bc();
	//  105  188:aload           4
	//  106  190:iload_3         
	//  107  191:new             #45  <Class bc>
	//  108  194:dup             
	//  109  195:invokespecial   #96  <Method void bc()>
	//  110  198:aastore         
									ip1.a(((iy) (abc[i1])));
	//  111  199:aload_1         
	//  112  200:aload           4
	//  113  202:iload_3         
	//  114  203:aaload          
	//  115  204:invokevirtual   #99  <Method void ip.a(iy)>
									e = abc;
	//  116  207:aload_0         
	//  117  208:aload           4
	//  118  210:putfield        #50  <Field bc[] e>
								}
							} else
	//* 119  213:goto            0
							{
								int j1 = jb.a(ip1, 42);
	//  120  216:aload_1         
	//  121  217:bipush          42
	//  122  219:invokestatic    #89  <Method int jb.a(ip, int)>
	//  123  222:istore_3        
								bi abi[] = d;
	//  124  223:aload_0         
	//  125  224:getfield        #43  <Field bi[] d>
	//  126  227:astore          4
								int k;
								if(abi == null)
	//* 127  229:aload           4
	//* 128  231:ifnonnull       239
									k = 0;
	//  129  234:iconst_0        
	//  130  235:istore_2        
								else
	//* 131  236:goto            243
									k = abi.length;
	//  132  239:aload           4
	//  133  241:arraylength     
	//  134  242:istore_2        
								abi = new bi[j1 + k];
	//  135  243:iload_3         
	//  136  244:iload_2         
	//  137  245:iadd            
	//  138  246:anewarray       bi[]
	//  139  249:astore          4
								j1 = k;
	//  140  251:iload_2         
	//  141  252:istore_3        
								if(k != 0)
	//* 142  253:iload_2         
	//* 143  254:ifeq            271
								{
									System.arraycopy(((Object) (d)), 0, ((Object) (abi)), 0, k);
	//  144  257:aload_0         
	//  145  258:getfield        #43  <Field bi[] d>
	//  146  261:iconst_0        
	//  147  262:aload           4
	//  148  264:iconst_0        
	//  149  265:iload_2         
	//  150  266:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
									j1 = k;
	//  151  269:iload_2         
	//  152  270:istore_3        
								}
								for(; j1 < abi.length - 1; j1++)
	//* 153  271:iload_3         
	//* 154  272:aload           4
	//* 155  274:arraylength     
	//* 156  275:iconst_1        
	//* 157  276:isub            
	//* 158  277:icmpge          311
								{
									abi[j1] = new bi();
	//  159  280:aload           4
	//  160  282:iload_3         
	//  161  283:new             #38  <Class bi>
	//  162  286:dup             
	//  163  287:invokespecial   #100 <Method void bi()>
	//  164  290:aastore         
									ip1.a(((iy) (abi[j1])));
	//  165  291:aload_1         
	//  166  292:aload           4
	//  167  294:iload_3         
	//  168  295:aaload          
	//  169  296:invokevirtual   #99  <Method void ip.a(iy)>
									ip1.a();
	//  170  299:aload_1         
	//  171  300:invokevirtual   #69  <Method int ip.a()>
	//  172  303:pop             
								}

	//  173  304:iload_3         
	//  174  305:iconst_1        
	//  175  306:iadd            
	//  176  307:istore_3        
	//* 177  308:goto            271
								abi[j1] = new bi();
	//  178  311:aload           4
	//  179  313:iload_3         
	//  180  314:new             #38  <Class bi>
	//  181  317:dup             
	//  182  318:invokespecial   #100 <Method void bi()>
	//  183  321:aastore         
								ip1.a(((iy) (abi[j1])));
	//  184  322:aload_1         
	//  185  323:aload           4
	//  186  325:iload_3         
	//  187  326:aaload          
	//  188  327:invokevirtual   #99  <Method void ip.a(iy)>
								d = abi;
	//  189  330:aload_0         
	//  190  331:aload           4
	//  191  333:putfield        #43  <Field bi[] d>
							}
						} else
	//* 192  336:goto            0
						{
							int k1 = jb.a(ip1, 34);
	//  193  339:aload_1         
	//  194  340:bipush          34
	//  195  342:invokestatic    #89  <Method int jb.a(ip, int)>
	//  196  345:istore_3        
							bk abk[] = c;
	//  197  346:aload_0         
	//  198  347:getfield        #36  <Field bk[] c>
	//  199  350:astore          4
							int l;
							if(abk == null)
	//* 200  352:aload           4
	//* 201  354:ifnonnull       362
								l = 0;
	//  202  357:iconst_0        
	//  203  358:istore_2        
							else
	//* 204  359:goto            366
								l = abk.length;
	//  205  362:aload           4
	//  206  364:arraylength     
	//  207  365:istore_2        
							abk = new bk[k1 + l];
	//  208  366:iload_3         
	//  209  367:iload_2         
	//  210  368:iadd            
	//  211  369:anewarray       bk[]
	//  212  372:astore          4
							k1 = l;
	//  213  374:iload_2         
	//  214  375:istore_3        
							if(l != 0)
	//* 215  376:iload_2         
	//* 216  377:ifeq            394
							{
								System.arraycopy(((Object) (c)), 0, ((Object) (abk)), 0, l);
	//  217  380:aload_0         
	//  218  381:getfield        #36  <Field bk[] c>
	//  219  384:iconst_0        
	//  220  385:aload           4
	//  221  387:iconst_0        
	//  222  388:iload_2         
	//  223  389:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
								k1 = l;
	//  224  392:iload_2         
	//  225  393:istore_3        
							}
							for(; k1 < abk.length - 1; k1++)
	//* 226  394:iload_3         
	//* 227  395:aload           4
	//* 228  397:arraylength     
	//* 229  398:iconst_1        
	//* 230  399:isub            
	//* 231  400:icmpge          434
							{
								abk[k1] = new bk();
	//  232  403:aload           4
	//  233  405:iload_3         
	//  234  406:new             #31  <Class bk>
	//  235  409:dup             
	//  236  410:invokespecial   #101 <Method void bk()>
	//  237  413:aastore         
								ip1.a(((iy) (abk[k1])));
	//  238  414:aload_1         
	//  239  415:aload           4
	//  240  417:iload_3         
	//  241  418:aaload          
	//  242  419:invokevirtual   #99  <Method void ip.a(iy)>
								ip1.a();
	//  243  422:aload_1         
	//  244  423:invokevirtual   #69  <Method int ip.a()>
	//  245  426:pop             
							}

	//  246  427:iload_3         
	//  247  428:iconst_1        
	//  248  429:iadd            
	//  249  430:istore_3        
	//* 250  431:goto            394
							abk[k1] = new bk();
	//  251  434:aload           4
	//  252  436:iload_3         
	//  253  437:new             #31  <Class bk>
	//  254  440:dup             
	//  255  441:invokespecial   #101 <Method void bk()>
	//  256  444:aastore         
							ip1.a(((iy) (abk[k1])));
	//  257  445:aload_1         
	//  258  446:aload           4
	//  259  448:iload_3         
	//  260  449:aaload          
	//  261  450:invokevirtual   #99  <Method void ip.a(iy)>
							c = abk;
	//  262  453:aload_0         
	//  263  454:aload           4
	//  264  456:putfield        #36  <Field bk[] c>
						}
					} else
	//* 265  459:goto            0
					{
						f = Integer.valueOf(ip1.d());
	//  266  462:aload_0         
	//  267  463:aload_1         
	//  268  464:invokevirtual   #103 <Method int ip.d()>
	//  269  467:invokestatic    #108 <Method Integer Integer.valueOf(int)>
	//  270  470:putfield        #29  <Field Integer f>
					}
				} else
	//* 271  473:goto            0
				{
					b = ip1.c();
	//  272  476:aload_0         
	//  273  477:aload_1         
	//  274  478:invokevirtual   #84  <Method String ip.c()>
	//  275  481:putfield        #27  <Field String b>
				}
			} else
	//* 276  484:goto            0
			{
				a = Long.valueOf(ip1.e());
	//  277  487:aload_0         
	//  278  488:aload_1         
	//  279  489:invokevirtual   #111 <Method long ip.e()>
	//  280  492:invokestatic    #116 <Method Long Long.valueOf(long)>
	//  281  495:putfield        #25  <Field Long a>
			}
		} while(true);
	//  282  498:goto            0
		return ((iy) (this));
	//  283  501:aload_0         
	//  284  502:areturn         
	}

	public final void a(iq iq1)
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Long a>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          21
			iq1.b(1, ((Long) (obj)).longValue());
	//    5   11:aload_1         
	//    6   12:iconst_1        
	//    7   13:aload           4
	//    8   15:invokevirtual   #120 <Method long Long.longValue()>
	//    9   18:invokevirtual   #125 <Method void iq.b(int, long)>
		obj = ((Object) (b));
	//   10   21:aload_0         
	//   11   22:getfield        #27  <Field String b>
	//   12   25:astore          4
		if(obj != null)
	//*  13   27:aload           4
	//*  14   29:ifnull          39
			iq1.a(2, ((String) (obj)));
	//   15   32:aload_1         
	//   16   33:iconst_2        
	//   17   34:aload           4
	//   18   36:invokevirtual   #128 <Method void iq.a(int, String)>
		obj = ((Object) (f));
	//   19   39:aload_0         
	//   20   40:getfield        #29  <Field Integer f>
	//   21   43:astore          4
		if(obj != null)
	//*  22   45:aload           4
	//*  23   47:ifnull          60
			iq1.a(3, ((Integer) (obj)).intValue());
	//   24   50:aload_1         
	//   25   51:iconst_3        
	//   26   52:aload           4
	//   27   54:invokevirtual   #131 <Method int Integer.intValue()>
	//   28   57:invokevirtual   #134 <Method void iq.a(int, int)>
		Object aobj[] = ((Object []) (c));
	//   29   60:aload_0         
	//   30   61:getfield        #36  <Field bk[] c>
	//   31   64:astore          4
		boolean flag = false;
	//   32   66:iconst_0        
	//   33   67:istore_3        
		if(aobj != null && aobj.length > 0)
	//*  34   68:aload           4
	//*  35   70:ifnull          119
	//*  36   73:aload           4
	//*  37   75:arraylength     
	//*  38   76:ifle            119
		{
			int i = 0;
	//   39   79:iconst_0        
	//   40   80:istore_2        
			do
			{
				aobj = ((Object []) (c));
	//   41   81:aload_0         
	//   42   82:getfield        #36  <Field bk[] c>
	//   43   85:astore          4
				if(i >= aobj.length)
					break;
	//   44   87:iload_2         
	//   45   88:aload           4
	//   46   90:arraylength     
	//   47   91:icmpge          119
				aobj = ((Object []) (aobj[i]));
	//   48   94:aload           4
	//   49   96:iload_2         
	//   50   97:aaload          
	//   51   98:astore          4
				if(aobj != null)
	//*  52  100:aload           4
	//*  53  102:ifnull          112
					iq1.a(4, ((iy) (aobj)));
	//   54  105:aload_1         
	//   55  106:iconst_4        
	//   56  107:aload           4
	//   57  109:invokevirtual   #137 <Method void iq.a(int, iy)>
				i++;
	//   58  112:iload_2         
	//   59  113:iconst_1        
	//   60  114:iadd            
	//   61  115:istore_2        
			} while(true);
	//   62  116:goto            81
		}
		aobj = ((Object []) (d));
	//   63  119:aload_0         
	//   64  120:getfield        #43  <Field bi[] d>
	//   65  123:astore          4
		if(aobj != null && aobj.length > 0)
	//*  66  125:aload           4
	//*  67  127:ifnull          176
	//*  68  130:aload           4
	//*  69  132:arraylength     
	//*  70  133:ifle            176
		{
			int j = 0;
	//   71  136:iconst_0        
	//   72  137:istore_2        
			do
			{
				aobj = ((Object []) (d));
	//   73  138:aload_0         
	//   74  139:getfield        #43  <Field bi[] d>
	//   75  142:astore          4
				if(j >= aobj.length)
					break;
	//   76  144:iload_2         
	//   77  145:aload           4
	//   78  147:arraylength     
	//   79  148:icmpge          176
				aobj = ((Object []) (aobj[j]));
	//   80  151:aload           4
	//   81  153:iload_2         
	//   82  154:aaload          
	//   83  155:astore          4
				if(aobj != null)
	//*  84  157:aload           4
	//*  85  159:ifnull          169
					iq1.a(5, ((iy) (aobj)));
	//   86  162:aload_1         
	//   87  163:iconst_5        
	//   88  164:aload           4
	//   89  166:invokevirtual   #137 <Method void iq.a(int, iy)>
				j++;
	//   90  169:iload_2         
	//   91  170:iconst_1        
	//   92  171:iadd            
	//   93  172:istore_2        
			} while(true);
	//   94  173:goto            138
		}
		aobj = ((Object []) (e));
	//   95  176:aload_0         
	//   96  177:getfield        #50  <Field bc[] e>
	//   97  180:astore          4
		if(aobj != null && aobj.length > 0)
	//*  98  182:aload           4
	//*  99  184:ifnull          234
	//* 100  187:aload           4
	//* 101  189:arraylength     
	//* 102  190:ifle            234
		{
			int k = ((int) (flag));
	//  103  193:iload_3         
	//  104  194:istore_2        
			do
			{
				bc abc[] = e;
	//  105  195:aload_0         
	//  106  196:getfield        #50  <Field bc[] e>
	//  107  199:astore          4
				if(k >= abc.length)
					break;
	//  108  201:iload_2         
	//  109  202:aload           4
	//  110  204:arraylength     
	//  111  205:icmpge          234
				abc = ((bc []) (abc[k]));
	//  112  208:aload           4
	//  113  210:iload_2         
	//  114  211:aaload          
	//  115  212:astore          4
				if(abc != null)
	//* 116  214:aload           4
	//* 117  216:ifnull          227
					iq1.a(6, ((iy) (abc)));
	//  118  219:aload_1         
	//  119  220:bipush          6
	//  120  222:aload           4
	//  121  224:invokevirtual   #137 <Method void iq.a(int, iy)>
				k++;
	//  122  227:iload_2         
	//  123  228:iconst_1        
	//  124  229:iadd            
	//  125  230:istore_2        
			} while(true);
	//  126  231:goto            195
		}
		abc = ((bc []) (g));
	//  127  234:aload_0         
	//  128  235:getfield        #52  <Field String g>
	//  129  238:astore          4
		if(abc != null)
	//* 130  240:aload           4
	//* 131  242:ifnull          253
			iq1.a(7, ((String) (abc)));
	//  132  245:aload_1         
	//  133  246:bipush          7
	//  134  248:aload           4
	//  135  250:invokevirtual   #128 <Method void iq.a(int, String)>
		abc = ((bc []) (h));
	//  136  253:aload_0         
	//  137  254:getfield        #54  <Field Boolean h>
	//  138  257:astore          4
		if(abc != null)
	//* 139  259:aload           4
	//* 140  261:ifnull          275
			iq1.a(8, ((Boolean) (abc)).booleanValue());
	//  141  264:aload_1         
	//  142  265:bipush          8
	//  143  267:aload           4
	//  144  269:invokevirtual   #140 <Method boolean Boolean.booleanValue()>
	//  145  272:invokevirtual   #143 <Method void iq.a(int, boolean)>
		super.a(iq1);
	//  146  275:aload_0         
	//  147  276:aload_1         
	//  148  277:invokespecial   #145 <Method void is.a(iq)>
	//  149  280:return          
	}

	protected final int b()
	{
		int j = super.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #147 <Method int is.b()>
	//    2    4:istore_2        
		Object obj = ((Object) (a));
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field Long a>
	//    5    9:astore          5
		int i = j;
	//    6   11:iload_2         
	//    7   12:istore_1        
		if(obj != null)
	//*   8   13:aload           5
	//*   9   15:ifnull          30
			i = j + iq.c(1, ((Long) (obj)).longValue());
	//   10   18:iload_2         
	//   11   19:iconst_1        
	//   12   20:aload           5
	//   13   22:invokevirtual   #120 <Method long Long.longValue()>
	//   14   25:invokestatic    #150 <Method int iq.c(int, long)>
	//   15   28:iadd            
	//   16   29:istore_1        
		obj = ((Object) (b));
	//   17   30:aload_0         
	//   18   31:getfield        #27  <Field String b>
	//   19   34:astore          5
		j = i;
	//   20   36:iload_1         
	//   21   37:istore_2        
		if(obj != null)
	//*  22   38:aload           5
	//*  23   40:ifnull          52
			j = i + iq.b(2, ((String) (obj)));
	//   24   43:iload_1         
	//   25   44:iconst_2        
	//   26   45:aload           5
	//   27   47:invokestatic    #153 <Method int iq.b(int, String)>
	//   28   50:iadd            
	//   29   51:istore_2        
		obj = ((Object) (f));
	//   30   52:aload_0         
	//   31   53:getfield        #29  <Field Integer f>
	//   32   56:astore          5
		i = j;
	//   33   58:iload_2         
	//   34   59:istore_1        
		if(obj != null)
	//*  35   60:aload           5
	//*  36   62:ifnull          77
			i = j + iq.b(3, ((Integer) (obj)).intValue());
	//   37   65:iload_2         
	//   38   66:iconst_3        
	//   39   67:aload           5
	//   40   69:invokevirtual   #131 <Method int Integer.intValue()>
	//   41   72:invokestatic    #156 <Method int iq.b(int, int)>
	//   42   75:iadd            
	//   43   76:istore_1        
		Object aobj[] = ((Object []) (c));
	//   44   77:aload_0         
	//   45   78:getfield        #36  <Field bk[] c>
	//   46   81:astore          5
		boolean flag = false;
	//   47   83:iconst_0        
	//   48   84:istore          4
		j = i;
	//   49   86:iload_1         
	//   50   87:istore_2        
		if(aobj != null)
	//*  51   88:aload           5
	//*  52   90:ifnull          149
		{
			j = i;
	//   53   93:iload_1         
	//   54   94:istore_2        
			if(aobj.length > 0)
	//*  55   95:aload           5
	//*  56   97:arraylength     
	//*  57   98:ifle            149
			{
				j = 0;
	//   58  101:iconst_0        
	//   59  102:istore_2        
				do
				{
					aobj = ((Object []) (c));
	//   60  103:aload_0         
	//   61  104:getfield        #36  <Field bk[] c>
	//   62  107:astore          5
					if(j >= aobj.length)
						break;
	//   63  109:iload_2         
	//   64  110:aload           5
	//   65  112:arraylength     
	//   66  113:icmpge          147
					aobj = ((Object []) (aobj[j]));
	//   67  116:aload           5
	//   68  118:iload_2         
	//   69  119:aaload          
	//   70  120:astore          5
					int k = i;
	//   71  122:iload_1         
	//   72  123:istore_3        
					if(aobj != null)
	//*  73  124:aload           5
	//*  74  126:ifnull          138
						k = i + iq.b(4, ((iy) (aobj)));
	//   75  129:iload_1         
	//   76  130:iconst_4        
	//   77  131:aload           5
	//   78  133:invokestatic    #159 <Method int iq.b(int, iy)>
	//   79  136:iadd            
	//   80  137:istore_3        
					j++;
	//   81  138:iload_2         
	//   82  139:iconst_1        
	//   83  140:iadd            
	//   84  141:istore_2        
					i = k;
	//   85  142:iload_3         
	//   86  143:istore_1        
				} while(true);
	//   87  144:goto            103
				j = i;
	//   88  147:iload_1         
	//   89  148:istore_2        
			}
		}
		aobj = ((Object []) (d));
	//   90  149:aload_0         
	//   91  150:getfield        #43  <Field bi[] d>
	//   92  153:astore          5
		i = j;
	//   93  155:iload_2         
	//   94  156:istore_1        
		if(aobj != null)
	//*  95  157:aload           5
	//*  96  159:ifnull          218
		{
			i = j;
	//   97  162:iload_2         
	//   98  163:istore_1        
			if(aobj.length > 0)
	//*  99  164:aload           5
	//* 100  166:arraylength     
	//* 101  167:ifle            218
			{
				i = j;
	//  102  170:iload_2         
	//  103  171:istore_1        
				j = 0;
	//  104  172:iconst_0        
	//  105  173:istore_2        
				do
				{
					aobj = ((Object []) (d));
	//  106  174:aload_0         
	//  107  175:getfield        #43  <Field bi[] d>
	//  108  178:astore          5
					if(j >= aobj.length)
						break;
	//  109  180:iload_2         
	//  110  181:aload           5
	//  111  183:arraylength     
	//  112  184:icmpge          218
					aobj = ((Object []) (aobj[j]));
	//  113  187:aload           5
	//  114  189:iload_2         
	//  115  190:aaload          
	//  116  191:astore          5
					int l = i;
	//  117  193:iload_1         
	//  118  194:istore_3        
					if(aobj != null)
	//* 119  195:aload           5
	//* 120  197:ifnull          209
						l = i + iq.b(5, ((iy) (aobj)));
	//  121  200:iload_1         
	//  122  201:iconst_5        
	//  123  202:aload           5
	//  124  204:invokestatic    #159 <Method int iq.b(int, iy)>
	//  125  207:iadd            
	//  126  208:istore_3        
					j++;
	//  127  209:iload_2         
	//  128  210:iconst_1        
	//  129  211:iadd            
	//  130  212:istore_2        
					i = l;
	//  131  213:iload_3         
	//  132  214:istore_1        
				} while(true);
	//  133  215:goto            174
			}
		}
		aobj = ((Object []) (e));
	//  134  218:aload_0         
	//  135  219:getfield        #50  <Field bc[] e>
	//  136  222:astore          5
		j = i;
	//  137  224:iload_1         
	//  138  225:istore_2        
		if(aobj != null)
	//* 139  226:aload           5
	//* 140  228:ifnull          289
		{
			j = i;
	//  141  231:iload_1         
	//  142  232:istore_2        
			if(aobj.length > 0)
	//* 143  233:aload           5
	//* 144  235:arraylength     
	//* 145  236:ifle            289
			{
				int i1 = ((int) (flag));
	//  146  239:iload           4
	//  147  241:istore_3        
				do
				{
					bc abc[] = e;
	//  148  242:aload_0         
	//  149  243:getfield        #50  <Field bc[] e>
	//  150  246:astore          5
					j = i;
	//  151  248:iload_1         
	//  152  249:istore_2        
					if(i1 >= abc.length)
						break;
	//  153  250:iload_3         
	//  154  251:aload           5
	//  155  253:arraylength     
	//  156  254:icmpge          289
					abc = ((bc []) (abc[i1]));
	//  157  257:aload           5
	//  158  259:iload_3         
	//  159  260:aaload          
	//  160  261:astore          5
					j = i;
	//  161  263:iload_1         
	//  162  264:istore_2        
					if(abc != null)
	//* 163  265:aload           5
	//* 164  267:ifnull          280
						j = i + iq.b(6, ((iy) (abc)));
	//  165  270:iload_1         
	//  166  271:bipush          6
	//  167  273:aload           5
	//  168  275:invokestatic    #159 <Method int iq.b(int, iy)>
	//  169  278:iadd            
	//  170  279:istore_2        
					i1++;
	//  171  280:iload_3         
	//  172  281:iconst_1        
	//  173  282:iadd            
	//  174  283:istore_3        
					i = j;
	//  175  284:iload_2         
	//  176  285:istore_1        
				} while(true);
	//  177  286:goto            242
			}
		}
		abc = ((bc []) (g));
	//  178  289:aload_0         
	//  179  290:getfield        #52  <Field String g>
	//  180  293:astore          5
		i = j;
	//  181  295:iload_2         
	//  182  296:istore_1        
		if(abc != null)
	//* 183  297:aload           5
	//* 184  299:ifnull          312
			i = j + iq.b(7, ((String) (abc)));
	//  185  302:iload_2         
	//  186  303:bipush          7
	//  187  305:aload           5
	//  188  307:invokestatic    #153 <Method int iq.b(int, String)>
	//  189  310:iadd            
	//  190  311:istore_1        
		abc = ((bc []) (h));
	//  191  312:aload_0         
	//  192  313:getfield        #54  <Field Boolean h>
	//  193  316:astore          5
		j = i;
	//  194  318:iload_1         
	//  195  319:istore_2        
		if(abc != null)
	//* 196  320:aload           5
	//* 197  322:ifnull          341
		{
			((Boolean) (abc)).booleanValue();
	//  198  325:aload           5
	//  199  327:invokevirtual   #140 <Method boolean Boolean.booleanValue()>
	//  200  330:pop             
			j = i + (iq.b(8) + 1);
	//  201  331:iload_1         
	//  202  332:bipush          8
	//  203  334:invokestatic    #162 <Method int iq.b(int)>
	//  204  337:iconst_1        
	//  205  338:iadd            
	//  206  339:iadd            
	//  207  340:istore_2        
		}
		return j;
	//  208  341:iload_2         
	//  209  342:ireturn         
	}

	public final boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof bj))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class bj>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((bj)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class bj>
	//   12   20:astore_1        
		Object obj1 = ((Object) (a));
	//   13   21:aload_0         
	//   14   22:getfield        #25  <Field Long a>
	//   15   25:astore_2        
		if(obj1 == null)
	//*  16   26:aload_2         
	//*  17   27:ifnonnull       39
		{
			if(((bj) (obj)).a != null)
	//*  18   30:aload_1         
	//*  19   31:getfield        #25  <Field Long a>
	//*  20   34:ifnull          52
				return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
		} else
		if(!((Long) (obj1)).equals(((Object) (((bj) (obj)).a))))
	//*  23   39:aload_2         
	//*  24   40:aload_1         
	//*  25   41:getfield        #25  <Field Long a>
	//*  26   44:invokevirtual   #166 <Method boolean Long.equals(Object)>
	//*  27   47:ifne            52
			return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
		obj1 = ((Object) (b));
	//   30   52:aload_0         
	//   31   53:getfield        #27  <Field String b>
	//   32   56:astore_2        
		if(obj1 == null)
	//*  33   57:aload_2         
	//*  34   58:ifnonnull       70
		{
			if(((bj) (obj)).b != null)
	//*  35   61:aload_1         
	//*  36   62:getfield        #27  <Field String b>
	//*  37   65:ifnull          83
				return false;
	//   38   68:iconst_0        
	//   39   69:ireturn         
		} else
		if(!((String) (obj1)).equals(((Object) (((bj) (obj)).b))))
	//*  40   70:aload_2         
	//*  41   71:aload_1         
	//*  42   72:getfield        #27  <Field String b>
	//*  43   75:invokevirtual   #169 <Method boolean String.equals(Object)>
	//*  44   78:ifne            83
			return false;
	//   45   81:iconst_0        
	//   46   82:ireturn         
		obj1 = ((Object) (f));
	//   47   83:aload_0         
	//   48   84:getfield        #29  <Field Integer f>
	//   49   87:astore_2        
		if(obj1 == null)
	//*  50   88:aload_2         
	//*  51   89:ifnonnull       101
		{
			if(((bj) (obj)).f != null)
	//*  52   92:aload_1         
	//*  53   93:getfield        #29  <Field Integer f>
	//*  54   96:ifnull          114
				return false;
	//   55   99:iconst_0        
	//   56  100:ireturn         
		} else
		if(!((Integer) (obj1)).equals(((Object) (((bj) (obj)).f))))
	//*  57  101:aload_2         
	//*  58  102:aload_1         
	//*  59  103:getfield        #29  <Field Integer f>
	//*  60  106:invokevirtual   #170 <Method boolean Integer.equals(Object)>
	//*  61  109:ifne            114
			return false;
	//   62  112:iconst_0        
	//   63  113:ireturn         
		if(!iw.a(((Object []) (c)), ((Object []) (((bj) (obj)).c))))
	//*  64  114:aload_0         
	//*  65  115:getfield        #36  <Field bk[] c>
	//*  66  118:aload_1         
	//*  67  119:getfield        #36  <Field bk[] c>
	//*  68  122:invokestatic    #175 <Method boolean iw.a(Object[], Object[])>
	//*  69  125:ifne            130
			return false;
	//   70  128:iconst_0        
	//   71  129:ireturn         
		if(!iw.a(((Object []) (d)), ((Object []) (((bj) (obj)).d))))
	//*  72  130:aload_0         
	//*  73  131:getfield        #43  <Field bi[] d>
	//*  74  134:aload_1         
	//*  75  135:getfield        #43  <Field bi[] d>
	//*  76  138:invokestatic    #175 <Method boolean iw.a(Object[], Object[])>
	//*  77  141:ifne            146
			return false;
	//   78  144:iconst_0        
	//   79  145:ireturn         
		if(!iw.a(((Object []) (e)), ((Object []) (((bj) (obj)).e))))
	//*  80  146:aload_0         
	//*  81  147:getfield        #50  <Field bc[] e>
	//*  82  150:aload_1         
	//*  83  151:getfield        #50  <Field bc[] e>
	//*  84  154:invokestatic    #175 <Method boolean iw.a(Object[], Object[])>
	//*  85  157:ifne            162
			return false;
	//   86  160:iconst_0        
	//   87  161:ireturn         
		obj1 = ((Object) (g));
	//   88  162:aload_0         
	//   89  163:getfield        #52  <Field String g>
	//   90  166:astore_2        
		if(obj1 == null)
	//*  91  167:aload_2         
	//*  92  168:ifnonnull       180
		{
			if(((bj) (obj)).g != null)
	//*  93  171:aload_1         
	//*  94  172:getfield        #52  <Field String g>
	//*  95  175:ifnull          193
				return false;
	//   96  178:iconst_0        
	//   97  179:ireturn         
		} else
		if(!((String) (obj1)).equals(((Object) (((bj) (obj)).g))))
	//*  98  180:aload_2         
	//*  99  181:aload_1         
	//* 100  182:getfield        #52  <Field String g>
	//* 101  185:invokevirtual   #169 <Method boolean String.equals(Object)>
	//* 102  188:ifne            193
			return false;
	//  103  191:iconst_0        
	//  104  192:ireturn         
		obj1 = ((Object) (h));
	//  105  193:aload_0         
	//  106  194:getfield        #54  <Field Boolean h>
	//  107  197:astore_2        
		if(obj1 == null)
	//* 108  198:aload_2         
	//* 109  199:ifnonnull       211
		{
			if(((bj) (obj)).h != null)
	//* 110  202:aload_1         
	//* 111  203:getfield        #54  <Field Boolean h>
	//* 112  206:ifnull          224
				return false;
	//  113  209:iconst_0        
	//  114  210:ireturn         
		} else
		if(!((Boolean) (obj1)).equals(((Object) (((bj) (obj)).h))))
	//* 115  211:aload_2         
	//* 116  212:aload_1         
	//* 117  213:getfield        #54  <Field Boolean h>
	//* 118  216:invokevirtual   #176 <Method boolean Boolean.equals(Object)>
	//* 119  219:ifne            224
			return false;
	//  120  222:iconst_0        
	//  121  223:ireturn         
		if(L != null && !L.b())
	//* 122  224:aload_0         
	//* 123  225:getfield        #58  <Field iu L>
	//* 124  228:ifnull          256
	//* 125  231:aload_0         
	//* 126  232:getfield        #58  <Field iu L>
	//* 127  235:invokevirtual   #179 <Method boolean iu.b()>
	//* 128  238:ifeq            244
	//* 129  241:goto            256
			return L.equals(((Object) (((bj) (obj)).L)));
	//  130  244:aload_0         
	//  131  245:getfield        #58  <Field iu L>
	//  132  248:aload_1         
	//  133  249:getfield        #58  <Field iu L>
	//  134  252:invokevirtual   #180 <Method boolean iu.equals(Object)>
	//  135  255:ireturn         
		if(((bj) (obj)).L != null)
	//* 136  256:aload_1         
	//* 137  257:getfield        #58  <Field iu L>
	//* 138  260:ifnull          277
			return ((bj) (obj)).L.b();
	//  139  263:aload_1         
	//  140  264:getfield        #58  <Field iu L>
	//  141  267:invokevirtual   #179 <Method boolean iu.b()>
	//  142  270:ifeq            275
	//  143  273:iconst_1        
	//  144  274:ireturn         
	//  145  275:iconst_0        
	//  146  276:ireturn         
		else
			return true;
	//  147  277:iconst_1        
	//  148  278:ireturn         
	}

	public final int hashCode()
	{
		int k1 = ((Object)this).getClass().getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #187 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #192 <Method String Class.getName()>
	//    3    7:invokevirtual   #194 <Method int String.hashCode()>
	//    4   10:istore          8
		Object obj = ((Object) (a));
	//    5   12:aload_0         
	//    6   13:getfield        #25  <Field Long a>
	//    7   16:astore          12
		boolean flag = false;
	//    8   18:iconst_0        
	//    9   19:istore          7
		int i;
		if(obj == null)
	//*  10   21:aload           12
	//*  11   23:ifnonnull       31
			i = 0;
	//   12   26:iconst_0        
	//   13   27:istore_1        
		else
	//*  14   28:goto            37
			i = ((Long) (obj)).hashCode();
	//   15   31:aload           12
	//   16   33:invokevirtual   #195 <Method int Long.hashCode()>
	//   17   36:istore_1        
		obj = ((Object) (b));
	//   18   37:aload_0         
	//   19   38:getfield        #27  <Field String b>
	//   20   41:astore          12
		int j;
		if(obj == null)
	//*  21   43:aload           12
	//*  22   45:ifnonnull       53
			j = 0;
	//   23   48:iconst_0        
	//   24   49:istore_2        
		else
	//*  25   50:goto            59
			j = ((String) (obj)).hashCode();
	//   26   53:aload           12
	//   27   55:invokevirtual   #194 <Method int String.hashCode()>
	//   28   58:istore_2        
		obj = ((Object) (f));
	//   29   59:aload_0         
	//   30   60:getfield        #29  <Field Integer f>
	//   31   63:astore          12
		int k;
		if(obj == null)
	//*  32   65:aload           12
	//*  33   67:ifnonnull       75
			k = 0;
	//   34   70:iconst_0        
	//   35   71:istore_3        
		else
	//*  36   72:goto            81
			k = ((Integer) (obj)).hashCode();
	//   37   75:aload           12
	//   38   77:invokevirtual   #196 <Method int Integer.hashCode()>
	//   39   80:istore_3        
		int l1 = iw.a(((Object []) (c)));
	//   40   81:aload_0         
	//   41   82:getfield        #36  <Field bk[] c>
	//   42   85:invokestatic    #199 <Method int iw.a(Object[])>
	//   43   88:istore          9
		int i2 = iw.a(((Object []) (d)));
	//   44   90:aload_0         
	//   45   91:getfield        #43  <Field bi[] d>
	//   46   94:invokestatic    #199 <Method int iw.a(Object[])>
	//   47   97:istore          10
		int j2 = iw.a(((Object []) (e)));
	//   48   99:aload_0         
	//   49  100:getfield        #50  <Field bc[] e>
	//   50  103:invokestatic    #199 <Method int iw.a(Object[])>
	//   51  106:istore          11
		obj = ((Object) (g));
	//   52  108:aload_0         
	//   53  109:getfield        #52  <Field String g>
	//   54  112:astore          12
		int l;
		if(obj == null)
	//*  55  114:aload           12
	//*  56  116:ifnonnull       125
			l = 0;
	//   57  119:iconst_0        
	//   58  120:istore          4
		else
	//*  59  122:goto            132
			l = ((String) (obj)).hashCode();
	//   60  125:aload           12
	//   61  127:invokevirtual   #194 <Method int String.hashCode()>
	//   62  130:istore          4
		obj = ((Object) (h));
	//   63  132:aload_0         
	//   64  133:getfield        #54  <Field Boolean h>
	//   65  136:astore          12
		int i1;
		if(obj == null)
	//*  66  138:aload           12
	//*  67  140:ifnonnull       149
			i1 = 0;
	//   68  143:iconst_0        
	//   69  144:istore          5
		else
	//*  70  146:goto            156
			i1 = ((Boolean) (obj)).hashCode();
	//   71  149:aload           12
	//   72  151:invokevirtual   #200 <Method int Boolean.hashCode()>
	//   73  154:istore          5
		int j1 = ((int) (flag));
	//   74  156:iload           7
	//   75  158:istore          6
		if(L != null)
	//*  76  160:aload_0         
	//*  77  161:getfield        #58  <Field iu L>
	//*  78  164:ifnull          193
			if(L.b())
	//*  79  167:aload_0         
	//*  80  168:getfield        #58  <Field iu L>
	//*  81  171:invokevirtual   #179 <Method boolean iu.b()>
	//*  82  174:ifeq            184
				j1 = ((int) (flag));
	//   83  177:iload           7
	//   84  179:istore          6
			else
	//*  85  181:goto            193
				j1 = L.hashCode();
	//   86  184:aload_0         
	//   87  185:getfield        #58  <Field iu L>
	//   88  188:invokevirtual   #201 <Method int iu.hashCode()>
	//   89  191:istore          6
		return (((((((((k1 + 527) * 31 + i) * 31 + j) * 31 + k) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + l) * 31 + i1) * 31 + j1;
	//   90  193:iload           8
	//   91  195:sipush          527
	//   92  198:iadd            
	//   93  199:bipush          31
	//   94  201:imul            
	//   95  202:iload_1         
	//   96  203:iadd            
	//   97  204:bipush          31
	//   98  206:imul            
	//   99  207:iload_2         
	//  100  208:iadd            
	//  101  209:bipush          31
	//  102  211:imul            
	//  103  212:iload_3         
	//  104  213:iadd            
	//  105  214:bipush          31
	//  106  216:imul            
	//  107  217:iload           9
	//  108  219:iadd            
	//  109  220:bipush          31
	//  110  222:imul            
	//  111  223:iload           10
	//  112  225:iadd            
	//  113  226:bipush          31
	//  114  228:imul            
	//  115  229:iload           11
	//  116  231:iadd            
	//  117  232:bipush          31
	//  118  234:imul            
	//  119  235:iload           4
	//  120  237:iadd            
	//  121  238:bipush          31
	//  122  240:imul            
	//  123  241:iload           5
	//  124  243:iadd            
	//  125  244:bipush          31
	//  126  246:imul            
	//  127  247:iload           6
	//  128  249:iadd            
	//  129  250:ireturn         
	}

	public Long a;
	public String b;
	public bk c[];
	public bi d[];
	public bc e[];
	private Integer f;
	private String g;
	private Boolean h;
}
