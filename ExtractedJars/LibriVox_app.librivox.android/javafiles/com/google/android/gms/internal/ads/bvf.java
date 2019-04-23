// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awj, bss, awh, arh, 
//			buv, awg, awt, awp

public final class bvf extends awj
{

	public bvf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void awj()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #18  <Field String a>
		b = new bss[0];
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:anewarray       bss[]
	//    8   14:putfield        #22  <Field bss[] b>
		c = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #24  <Field buv c>
		d = null;
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:putfield        #26  <Field buv d>
		e = null;
	//   15   27:aload_0         
	//   16   28:aconst_null     
	//   17   29:putfield        #28  <Field buv e>
		Z = null;
	//   18   32:aload_0         
	//   19   33:aconst_null     
	//   20   34:putfield        #32  <Field awl Z>
		aa = -1;
	//   21   37:aload_0         
	//   22   38:iconst_m1       
	//   23   39:putfield        #36  <Field int aa>
	//   24   42:return          
	}

	protected final int a()
	{
		int j = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method int awj.a()>
	//    2    4:istore_2        
		Object obj = ((Object) (a));
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field String a>
	//    5    9:astore          4
		int i = j;
	//    6   11:iload_2         
	//    7   12:istore_1        
		if(obj != null)
	//*   8   13:aload           4
	//*   9   15:ifnull          27
			i = j + awh.b(1, ((String) (obj)));
	//   10   18:iload_2         
	//   11   19:iconst_1        
	//   12   20:aload           4
	//   13   22:invokestatic    #45  <Method int awh.b(int, String)>
	//   14   25:iadd            
	//   15   26:istore_1        
		bss abss[] = b;
	//   16   27:aload_0         
	//   17   28:getfield        #22  <Field bss[] b>
	//   18   31:astore          4
		j = i;
	//   19   33:iload_1         
	//   20   34:istore_2        
		if(abss != null)
	//*  21   35:aload           4
	//*  22   37:ifnull          96
		{
			j = i;
	//   23   40:iload_1         
	//   24   41:istore_2        
			if(abss.length > 0)
	//*  25   42:aload           4
	//*  26   44:arraylength     
	//*  27   45:ifle            96
			{
				int k = 0;
	//   28   48:iconst_0        
	//   29   49:istore_3        
				do
				{
					bss abss1[] = b;
	//   30   50:aload_0         
	//   31   51:getfield        #22  <Field bss[] b>
	//   32   54:astore          4
					j = i;
	//   33   56:iload_1         
	//   34   57:istore_2        
					if(k >= abss1.length)
						break;
	//   35   58:iload_3         
	//   36   59:aload           4
	//   37   61:arraylength     
	//   38   62:icmpge          96
					abss1 = ((bss []) (abss1[k]));
	//   39   65:aload           4
	//   40   67:iload_3         
	//   41   68:aaload          
	//   42   69:astore          4
					j = i;
	//   43   71:iload_1         
	//   44   72:istore_2        
					if(abss1 != null)
	//*  45   73:aload           4
	//*  46   75:ifnull          87
						j = i + arh.c(2, ((atv) (abss1)));
	//   47   78:iload_1         
	//   48   79:iconst_2        
	//   49   80:aload           4
	//   50   82:invokestatic    #50  <Method int arh.c(int, atv)>
	//   51   85:iadd            
	//   52   86:istore_2        
					k++;
	//   53   87:iload_3         
	//   54   88:iconst_1        
	//   55   89:iadd            
	//   56   90:istore_3        
					i = j;
	//   57   91:iload_2         
	//   58   92:istore_1        
				} while(true);
	//   59   93:goto            50
			}
		}
		abss1 = ((bss []) (c));
	//   60   96:aload_0         
	//   61   97:getfield        #24  <Field buv c>
	//   62  100:astore          4
		i = j;
	//   63  102:iload_2         
	//   64  103:istore_1        
		if(abss1 != null)
	//*  65  104:aload           4
	//*  66  106:ifnull          128
		{
			i = j;
	//   67  109:iload_2         
	//   68  110:istore_1        
			if(abss1 != null)
	//*  69  111:aload           4
	//*  70  113:ifnull          128
				i = j + awh.b(3, ((buv) (abss1)).a());
	//   71  116:iload_2         
	//   72  117:iconst_3        
	//   73  118:aload           4
	//   74  120:invokevirtual   #53  <Method int buv.a()>
	//   75  123:invokestatic    #56  <Method int awh.b(int, int)>
	//   76  126:iadd            
	//   77  127:istore_1        
		}
		abss1 = ((bss []) (d));
	//   78  128:aload_0         
	//   79  129:getfield        #26  <Field buv d>
	//   80  132:astore          4
		j = i;
	//   81  134:iload_1         
	//   82  135:istore_2        
		if(abss1 != null)
	//*  83  136:aload           4
	//*  84  138:ifnull          160
		{
			j = i;
	//   85  141:iload_1         
	//   86  142:istore_2        
			if(abss1 != null)
	//*  87  143:aload           4
	//*  88  145:ifnull          160
				j = i + awh.b(4, ((buv) (abss1)).a());
	//   89  148:iload_1         
	//   90  149:iconst_4        
	//   91  150:aload           4
	//   92  152:invokevirtual   #53  <Method int buv.a()>
	//   93  155:invokestatic    #56  <Method int awh.b(int, int)>
	//   94  158:iadd            
	//   95  159:istore_2        
		}
		abss1 = ((bss []) (e));
	//   96  160:aload_0         
	//   97  161:getfield        #28  <Field buv e>
	//   98  164:astore          4
		i = j;
	//   99  166:iload_2         
	//  100  167:istore_1        
		if(abss1 != null)
	//* 101  168:aload           4
	//* 102  170:ifnull          192
		{
			i = j;
	//  103  173:iload_2         
	//  104  174:istore_1        
			if(abss1 != null)
	//* 105  175:aload           4
	//* 106  177:ifnull          192
				i = j + awh.b(5, ((buv) (abss1)).a());
	//  107  180:iload_2         
	//  108  181:iconst_5        
	//  109  182:aload           4
	//  110  184:invokevirtual   #53  <Method int buv.a()>
	//  111  187:invokestatic    #56  <Method int awh.b(int, int)>
	//  112  190:iadd            
	//  113  191:istore_1        
		}
		return i;
	//  114  192:iload_1         
	//  115  193:ireturn         
	}

	public final awp a(awg awg1)
	{
label0:
		do
			do
			{
				int i = awg1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #60  <Method int awg.a()>
	//    2    4:istore_2        
				if(i != 0)
	//*   3    5:iload_2         
	//*   4    6:ifeq            387
				{
					if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          376
					{
						if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          263
						{
							if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
	//*  13   24:icmpeq          191
							{
								if(i != 32)
	//*  14   27:iload_2         
	//*  15   28:bipush          32
	//*  16   30:icmpeq          119
								{
									if(i != 40)
	//*  17   33:iload_2         
	//*  18   34:bipush          40
	//*  19   36:icmpeq          50
									{
										if(!super.a(awg1, i))
	//*  20   39:aload_0         
	//*  21   40:aload_1         
	//*  22   41:iload_2         
	//*  23   42:invokespecial   #63  <Method boolean awj.a(awg, int)>
	//*  24   45:ifne            0
											return ((awp) (this));
	//   25   48:aload_0         
	//   26   49:areturn         
									} else
									{
										int k = awg1.j();
	//   27   50:aload_1         
	//   28   51:invokevirtual   #66  <Method int awg.j()>
	//   29   54:istore_3        
										int k1 = awg1.g();
	//   30   55:aload_1         
	//   31   56:invokevirtual   #69  <Method int awg.g()>
	//   32   59:istore          4
										if(k1 != 1000)
	//*  33   61:iload           4
	//*  34   63:sipush          1000
	//*  35   66:icmpeq          107
											switch(k1)
	//*  36   69:iload           4
											{
	//*  37   71:tableswitch     0 1: default 92
	//	               0 107
	//	               1 107
											default:
												awg1.e(k);
	//   38   92:aload_1         
	//   39   93:iload_3         
	//   40   94:invokevirtual   #72  <Method void awg.e(int)>
												((awj)this).a(awg1, i);
	//   41   97:aload_0         
	//   42   98:aload_1         
	//   43   99:iload_2         
	//   44  100:invokevirtual   #63  <Method boolean awj.a(awg, int)>
	//   45  103:pop             
												continue label0;
	//   46  104:goto            0

											case 0: // '\0'
											case 1: // '\001'
												break;
											}
										e = buv.a(k1);
	//   47  107:aload_0         
	//   48  108:iload           4
	//   49  110:invokestatic    #75  <Method buv buv.a(int)>
	//   50  113:putfield        #28  <Field buv e>
										continue label0;
	//   51  116:goto            0
									}
								} else
								{
									int l = awg1.j();
	//   52  119:aload_1         
	//   53  120:invokevirtual   #66  <Method int awg.j()>
	//   54  123:istore_3        
									int l1 = awg1.g();
	//   55  124:aload_1         
	//   56  125:invokevirtual   #69  <Method int awg.g()>
	//   57  128:istore          4
									if(l1 != 1000)
	//*  58  130:iload           4
	//*  59  132:sipush          1000
	//*  60  135:icmpeq          179
										switch(l1)
	//*  61  138:iload           4
										{
	//*  62  140:tableswitch     0 1: default 164
	//	               0 179
	//	               1 179
										default:
											awg1.e(l);
	//   63  164:aload_1         
	//   64  165:iload_3         
	//   65  166:invokevirtual   #72  <Method void awg.e(int)>
											((awj)this).a(awg1, i);
	//   66  169:aload_0         
	//   67  170:aload_1         
	//   68  171:iload_2         
	//   69  172:invokevirtual   #63  <Method boolean awj.a(awg, int)>
	//   70  175:pop             
											continue label0;
	//   71  176:goto            0

										case 0: // '\0'
										case 1: // '\001'
											break;
										}
									d = buv.a(l1);
	//   72  179:aload_0         
	//   73  180:iload           4
	//   74  182:invokestatic    #75  <Method buv buv.a(int)>
	//   75  185:putfield        #26  <Field buv d>
									continue label0;
	//   76  188:goto            0
								}
							} else
							{
								int i1 = awg1.j();
	//   77  191:aload_1         
	//   78  192:invokevirtual   #66  <Method int awg.j()>
	//   79  195:istore_3        
								int i2 = awg1.g();
	//   80  196:aload_1         
	//   81  197:invokevirtual   #69  <Method int awg.g()>
	//   82  200:istore          4
								if(i2 != 1000)
	//*  83  202:iload           4
	//*  84  204:sipush          1000
	//*  85  207:icmpeq          251
									switch(i2)
	//*  86  210:iload           4
									{
	//*  87  212:tableswitch     0 1: default 236
	//	               0 251
	//	               1 251
									default:
										awg1.e(i1);
	//   88  236:aload_1         
	//   89  237:iload_3         
	//   90  238:invokevirtual   #72  <Method void awg.e(int)>
										((awj)this).a(awg1, i);
	//   91  241:aload_0         
	//   92  242:aload_1         
	//   93  243:iload_2         
	//   94  244:invokevirtual   #63  <Method boolean awj.a(awg, int)>
	//   95  247:pop             
										continue label0;
	//   96  248:goto            0

									case 0: // '\0'
									case 1: // '\001'
										break;
									}
								c = buv.a(i2);
	//   97  251:aload_0         
	//   98  252:iload           4
	//   99  254:invokestatic    #75  <Method buv buv.a(int)>
	//  100  257:putfield        #24  <Field buv c>
								continue label0;
	//  101  260:goto            0
							}
						} else
						{
							int j1 = awt.a(awg1, 18);
	//  102  263:aload_1         
	//  103  264:bipush          18
	//  104  266:invokestatic    #80  <Method int awt.a(awg, int)>
	//  105  269:istore_3        
							bss abss[] = b;
	//  106  270:aload_0         
	//  107  271:getfield        #22  <Field bss[] b>
	//  108  274:astore          5
							int j;
							if(abss == null)
	//* 109  276:aload           5
	//* 110  278:ifnonnull       286
								j = 0;
	//  111  281:iconst_0        
	//  112  282:istore_2        
							else
	//* 113  283:goto            290
								j = abss.length;
	//  114  286:aload           5
	//  115  288:arraylength     
	//  116  289:istore_2        
							abss = new bss[j1 + j];
	//  117  290:iload_3         
	//  118  291:iload_2         
	//  119  292:iadd            
	//  120  293:anewarray       bss[]
	//  121  296:astore          5
							j1 = j;
	//  122  298:iload_2         
	//  123  299:istore_3        
							if(j != 0)
	//* 124  300:iload_2         
	//* 125  301:ifeq            318
							{
								System.arraycopy(((Object) (b)), 0, ((Object) (abss)), 0, j);
	//  126  304:aload_0         
	//  127  305:getfield        #22  <Field bss[] b>
	//  128  308:iconst_0        
	//  129  309:aload           5
	//  130  311:iconst_0        
	//  131  312:iload_2         
	//  132  313:invokestatic    #86  <Method void System.arraycopy(Object, int, Object, int, int)>
								j1 = j;
	//  133  316:iload_2         
	//  134  317:istore_3        
							}
							for(; j1 < abss.length - 1; j1++)
	//* 135  318:iload_3         
	//* 136  319:aload           5
	//* 137  321:arraylength     
	//* 138  322:iconst_1        
	//* 139  323:isub            
	//* 140  324:icmpge          353
							{
								abss[j1] = (bss)awg1.a(bss.a());
	//  141  327:aload           5
	//  142  329:iload_3         
	//  143  330:aload_1         
	//  144  331:invokestatic    #89  <Method aug bss.a()>
	//  145  334:invokevirtual   #92  <Method ash awg.a(aug)>
	//  146  337:checkcast       #20  <Class bss>
	//  147  340:aastore         
								awg1.a();
	//  148  341:aload_1         
	//  149  342:invokevirtual   #60  <Method int awg.a()>
	//  150  345:pop             
							}

	//  151  346:iload_3         
	//  152  347:iconst_1        
	//  153  348:iadd            
	//  154  349:istore_3        
	//* 155  350:goto            318
							abss[j1] = (bss)awg1.a(bss.a());
	//  156  353:aload           5
	//  157  355:iload_3         
	//  158  356:aload_1         
	//  159  357:invokestatic    #89  <Method aug bss.a()>
	//  160  360:invokevirtual   #92  <Method ash awg.a(aug)>
	//  161  363:checkcast       #20  <Class bss>
	//  162  366:aastore         
							b = abss;
	//  163  367:aload_0         
	//  164  368:aload           5
	//  165  370:putfield        #22  <Field bss[] b>
							continue label0;
	//  166  373:goto            0
						}
					} else
					{
						a = awg1.e();
	//  167  376:aload_0         
	//  168  377:aload_1         
	//  169  378:invokevirtual   #95  <Method String awg.e()>
	//  170  381:putfield        #18  <Field String a>
						continue label0;
	//  171  384:goto            0
					}
				} else
				{
					return ((awp) (this));
	//  172  387:aload_0         
	//  173  388:areturn         
				}
			} while(true);
		while(true);
	}

	public final void a(awh awh1)
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String a>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
			awh1.a(1, ((String) (obj)));
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_3         
	//    8   12:invokevirtual   #99  <Method void awh.a(int, String)>
		bss abss[] = b;
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field bss[] b>
	//   11   19:astore_3        
		if(abss != null && abss.length > 0)
	//*  12   20:aload_3         
	//*  13   21:ifnull          63
	//*  14   24:aload_3         
	//*  15   25:arraylength     
	//*  16   26:ifle            63
		{
			int i = 0;
	//   17   29:iconst_0        
	//   18   30:istore_2        
			do
			{
				bss abss1[] = b;
	//   19   31:aload_0         
	//   20   32:getfield        #22  <Field bss[] b>
	//   21   35:astore_3        
				if(i >= abss1.length)
					break;
	//   22   36:iload_2         
	//   23   37:aload_3         
	//   24   38:arraylength     
	//   25   39:icmpge          63
				abss1 = ((bss []) (abss1[i]));
	//   26   42:aload_3         
	//   27   43:iload_2         
	//   28   44:aaload          
	//   29   45:astore_3        
				if(abss1 != null)
	//*  30   46:aload_3         
	//*  31   47:ifnull          56
					awh1.a(2, ((atv) (abss1)));
	//   32   50:aload_1         
	//   33   51:iconst_2        
	//   34   52:aload_3         
	//   35   53:invokevirtual   #102 <Method void awh.a(int, atv)>
				i++;
	//   36   56:iload_2         
	//   37   57:iconst_1        
	//   38   58:iadd            
	//   39   59:istore_2        
			} while(true);
	//   40   60:goto            31
		}
		abss1 = ((bss []) (c));
	//   41   63:aload_0         
	//   42   64:getfield        #24  <Field buv c>
	//   43   67:astore_3        
		if(abss1 != null && abss1 != null)
	//*  44   68:aload_3         
	//*  45   69:ifnull          85
	//*  46   72:aload_3         
	//*  47   73:ifnull          85
			awh1.a(3, ((buv) (abss1)).a());
	//   48   76:aload_1         
	//   49   77:iconst_3        
	//   50   78:aload_3         
	//   51   79:invokevirtual   #53  <Method int buv.a()>
	//   52   82:invokevirtual   #105 <Method void awh.a(int, int)>
		abss1 = ((bss []) (d));
	//   53   85:aload_0         
	//   54   86:getfield        #26  <Field buv d>
	//   55   89:astore_3        
		if(abss1 != null && abss1 != null)
	//*  56   90:aload_3         
	//*  57   91:ifnull          107
	//*  58   94:aload_3         
	//*  59   95:ifnull          107
			awh1.a(4, ((buv) (abss1)).a());
	//   60   98:aload_1         
	//   61   99:iconst_4        
	//   62  100:aload_3         
	//   63  101:invokevirtual   #53  <Method int buv.a()>
	//   64  104:invokevirtual   #105 <Method void awh.a(int, int)>
		abss1 = ((bss []) (e));
	//   65  107:aload_0         
	//   66  108:getfield        #28  <Field buv e>
	//   67  111:astore_3        
		if(abss1 != null && abss1 != null)
	//*  68  112:aload_3         
	//*  69  113:ifnull          129
	//*  70  116:aload_3         
	//*  71  117:ifnull          129
			awh1.a(5, ((buv) (abss1)).a());
	//   72  120:aload_1         
	//   73  121:iconst_5        
	//   74  122:aload_3         
	//   75  123:invokevirtual   #53  <Method int buv.a()>
	//   76  126:invokevirtual   #105 <Method void awh.a(int, int)>
		super.a(awh1);
	//   77  129:aload_0         
	//   78  130:aload_1         
	//   79  131:invokespecial   #107 <Method void awj.a(awh)>
	//   80  134:return          
	}

	public String a;
	private bss b[];
	private buv c;
	private buv d;
	private buv e;
}
