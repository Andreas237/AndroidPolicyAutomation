// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bfm, bfu, bhd, bnw, 
//			bno, bnl, bgk, bgj, 
//			bfr, bgm, bhk, bhe, 
//			bhh, bfp, zzfs, bfw, 
//			bfo, bft, bgl, bnf, 
//			bhg, bfq

public final class bhc
	implements bfm, bfu
{

	public bhc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #55  <Class bno>
	//    4    8:dup             
	//    5    9:bipush          16
	//    6   11:invokespecial   #58  <Method void bno(int)>
	//    7   14:putfield        #60  <Field bno e>
	//    8   17:aload_0         
	//    9   18:new             #62  <Class Stack>
	//   10   21:dup             
	//   11   22:invokespecial   #63  <Method void Stack()>
	//   12   25:putfield        #65  <Field Stack f>
		c = new bno(bnl.a);
	//   13   28:aload_0         
	//   14   29:new             #55  <Class bno>
	//   15   32:dup             
	//   16   33:getstatic       #70  <Field byte[] bnl.a>
	//   17   36:invokespecial   #73  <Method void bno(byte[])>
	//   18   39:putfield        #75  <Field bno c>
	//   19   42:aload_0         
	//   20   43:new             #55  <Class bno>
	//   21   46:dup             
	//   22   47:iconst_4        
	//   23   48:invokespecial   #58  <Method void bno(int)>
	//   24   51:putfield        #77  <Field bno d>
	//   25   54:return          
	}

	private final void a(long l1)
	{
		do
		{
			if(f.isEmpty() || ((bgk)f.peek()).aP != l1)
				break;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Stack f>
	//    2    4:invokevirtual   #82  <Method boolean Stack.isEmpty()>
	//    3    7:ifne            491
	//    4   10:aload_0         
	//    5   11:getfield        #65  <Field Stack f>
	//    6   14:invokevirtual   #86  <Method Object Stack.peek()>
	//    7   17:checkcast       #88  <Class bgk>
	//    8   20:getfield        #91  <Field long bgk.aP>
	//    9   23:lload_1         
	//   10   24:lcmp            
	//   11   25:ifne            491
			bgk bgk1 = (bgk)f.pop();
	//   12   28:aload_0         
	//   13   29:getfield        #65  <Field Stack f>
	//   14   32:invokevirtual   #94  <Method Object Stack.pop()>
	//   15   35:checkcast       #88  <Class bgk>
	//   16   38:astore          13
			if(bgk1.aO == bgj.B)
	//*  17   40:aload           13
	//*  18   42:getfield        #97  <Field int bgk.aO>
	//*  19   45:getstatic       #102 <Field int bgj.B>
	//*  20   48:icmpne          463
			{
				long l2 = 0x1L;
	//   21   51:ldc2w           #103 <Long 0x1L>
	//   22   54:lstore          5
				ArrayList arraylist = new ArrayList();
	//   23   56:new             #106 <Class ArrayList>
	//   24   59:dup             
	//   25   60:invokespecial   #107 <Method void ArrayList()>
	//   26   63:astore          14
				zzki zzki = null;
	//   27   65:aconst_null     
	//   28   66:astore          11
				bfr bfr1 = new bfr();
	//   29   68:new             #109 <Class bfr>
	//   30   71:dup             
	//   31   72:invokespecial   #110 <Method void bfr()>
	//   32   75:astore          15
				Object obj = ((Object) (bgk1.d(bgj.az)));
	//   33   77:aload           13
	//   34   79:getstatic       #113 <Field int bgj.az>
	//   35   82:invokevirtual   #116 <Method bgl bgk.d(int)>
	//   36   85:astore          9
				if(obj != null)
	//*  37   87:aload           9
	//*  38   89:ifnull          124
				{
					obj = ((Object) (bgm.a(((bgl) (obj)), q)));
	//   39   92:aload           9
	//   40   94:aload_0         
	//   41   95:getfield        #118 <Field boolean q>
	//   42   98:invokestatic    #123 <Method zzki bgm.a(bgl, boolean)>
	//   43  101:astore          9
					zzki = ((zzki) (obj));
	//   44  103:aload           9
	//   45  105:astore          11
					if(obj != null)
	//*  46  107:aload           9
	//*  47  109:ifnull          124
					{
						bfr1.a(((zzki) (obj)));
	//   48  112:aload           15
	//   49  114:aload           9
	//   50  116:invokevirtual   #126 <Method boolean bfr.a(zzki)>
	//   51  119:pop             
						zzki = ((zzki) (obj));
	//   52  120:aload           9
	//   53  122:astore          11
					}
				}
				for(int i1 = 0; i1 < bgk1.aR.size();)
	//*  54  124:iconst_0        
	//*  55  125:istore_3        
	//*  56  126:iload_3         
	//*  57  127:aload           13
	//*  58  129:getfield        #130 <Field List bgk.aR>
	//*  59  132:invokeinterface #136 <Method int List.size()>
	//*  60  137:icmpge          399
				{
					Object obj1 = ((Object) ((bgk)bgk1.aR.get(i1)));
	//   61  140:aload           13
	//   62  142:getfield        #130 <Field List bgk.aR>
	//   63  145:iload_3         
	//   64  146:invokeinterface #140 <Method Object List.get(int)>
	//   65  151:checkcast       #88  <Class bgk>
	//   66  154:astore          9
					long l3 = l2;
	//   67  156:lload           5
	//   68  158:lstore          7
					if(((bgk) (obj1)).aO == bgj.D)
	//*  69  160:aload           9
	//*  70  162:getfield        #97  <Field int bgk.aO>
	//*  71  165:getstatic       #143 <Field int bgj.D>
	//*  72  168:icmpne          388
					{
						bhh bhh1 = bgm.a(((bgk) (obj1)), bgk1.d(bgj.C), 0x1L, ((zzhp) (null)), q);
	//   73  171:aload           9
	//   74  173:aload           13
	//   75  175:getstatic       #146 <Field int bgj.C>
	//   76  178:invokevirtual   #116 <Method bgl bgk.d(int)>
	//   77  181:ldc2w           #103 <Long 0x1L>
	//   78  184:aconst_null     
	//   79  185:aload_0         
	//   80  186:getfield        #118 <Field boolean q>
	//   81  189:invokestatic    #149 <Method bhh bgm.a(bgk, bgl, long, zzhp, boolean)>
	//   82  192:astore          16
						l3 = l2;
	//   83  194:lload           5
	//   84  196:lstore          7
						if(bhh1 != null)
	//*  85  198:aload           16
	//*  86  200:ifnull          388
						{
							obj1 = ((Object) (bgm.a(bhh1, ((bgk) (obj1)).e(bgj.E).e(bgj.F).e(bgj.G), bfr1)));
	//   87  203:aload           16
	//   88  205:aload           9
	//   89  207:getstatic       #152 <Field int bgj.E>
	//   90  210:invokevirtual   #155 <Method bgk bgk.e(int)>
	//   91  213:getstatic       #158 <Field int bgj.F>
	//   92  216:invokevirtual   #155 <Method bgk bgk.e(int)>
	//   93  219:getstatic       #161 <Field int bgj.G>
	//   94  222:invokevirtual   #155 <Method bgk bgk.e(int)>
	//   95  225:aload           15
	//   96  227:invokestatic    #164 <Method bhk bgm.a(bhh, bgk, bfr)>
	//   97  230:astore          9
							l3 = l2;
	//   98  232:lload           5
	//   99  234:lstore          7
							if(((bhk) (obj1)).a != 0)
	//* 100  236:aload           9
	//* 101  238:getfield        #168 <Field int bhk.a>
	//* 102  241:ifeq            388
							{
								bhe bhe1 = new bhe(bhh1, ((bhk) (obj1)), n.a(i1, bhh1.b));
	//  103  244:new             #170 <Class bhe>
	//  104  247:dup             
	//  105  248:aload           16
	//  106  250:aload           9
	//  107  252:aload_0         
	//  108  253:getfield        #172 <Field bfp n>
	//  109  256:iload_3         
	//  110  257:aload           16
	//  111  259:getfield        #175 <Field int bhh.b>
	//  112  262:invokeinterface #180 <Method bfw bfp.a(int, int)>
	//  113  267:invokespecial   #183 <Method void bhe(bhh, bhk, bfw)>
	//  114  270:astore          17
								int j1 = ((bhk) (obj1)).d;
	//  115  272:aload           9
	//  116  274:getfield        #185 <Field int bhk.d>
	//  117  277:istore          4
								zzfs zzfs3 = bhh1.f.a(j1 + 30);
	//  118  279:aload           16
	//  119  281:getfield        #188 <Field zzfs bhh.f>
	//  120  284:iload           4
	//  121  286:bipush          30
	//  122  288:iadd            
	//  123  289:invokevirtual   #193 <Method zzfs zzfs.a(int)>
	//  124  292:astore          12
								zzfs zzfs2 = zzfs3;
	//  125  294:aload           12
	//  126  296:astore          10
								if(bhh1.b == 1)
	//* 127  298:aload           16
	//* 128  300:getfield        #175 <Field int bhh.b>
	//* 129  303:iconst_1        
	//* 130  304:icmpne          354
								{
									zzfs zzfs1 = zzfs3;
	//  131  307:aload           12
	//  132  309:astore          9
									if(bfr1.a())
	//* 133  311:aload           15
	//* 134  313:invokevirtual   #195 <Method boolean bfr.a()>
	//* 135  316:ifeq            336
										zzfs1 = zzfs3.a(bfr1.a, bfr1.b);
	//  136  319:aload           12
	//  137  321:aload           15
	//  138  323:getfield        #196 <Field int bfr.a>
	//  139  326:aload           15
	//  140  328:getfield        #197 <Field int bfr.b>
	//  141  331:invokevirtual   #200 <Method zzfs zzfs.a(int, int)>
	//  142  334:astore          9
									zzfs2 = zzfs1;
	//  143  336:aload           9
	//  144  338:astore          10
									if(zzki != null)
	//* 145  340:aload           11
	//* 146  342:ifnull          354
										zzfs2 = zzfs1.a(zzki);
	//  147  345:aload           9
	//  148  347:aload           11
	//  149  349:invokevirtual   #203 <Method zzfs zzfs.a(zzki)>
	//  150  352:astore          10
								}
								bhe1.c.a(zzfs2);
	//  151  354:aload           17
	//  152  356:getfield        #206 <Field bfw bhe.c>
	//  153  359:aload           10
	//  154  361:invokeinterface #211 <Method void bfw.a(zzfs)>
								l3 = Math.max(l2, bhh1.e);
	//  155  366:lload           5
	//  156  368:aload           16
	//  157  370:getfield        #213 <Field long bhh.e>
	//  158  373:invokestatic    #219 <Method long Math.max(long, long)>
	//  159  376:lstore          7
								((List) (arraylist)).add(((Object) (bhe1)));
	//  160  378:aload           14
	//  161  380:aload           17
	//  162  382:invokeinterface #223 <Method boolean List.add(Object)>
	//  163  387:pop             
							}
						}
					}
					i1++;
	//  164  388:iload_3         
	//  165  389:iconst_1        
	//  166  390:iadd            
	//  167  391:istore_3        
					l2 = l3;
	//  168  392:lload           7
	//  169  394:lstore          5
				}

	//* 170  396:goto            126
				p = l2;
	//  171  399:aload_0         
	//  172  400:lload           5
	//  173  402:putfield        #225 <Field long p>
				o = (bhe[])((List) (arraylist)).toArray(((Object []) (new bhe[((List) (arraylist)).size()])));
	//  174  405:aload_0         
	//  175  406:aload           14
	//  176  408:aload           14
	//  177  410:invokeinterface #136 <Method int List.size()>
	//  178  415:anewarray       bhe[]
	//  179  418:invokeinterface #229 <Method Object[] List.toArray(Object[])>
	//  180  423:checkcast       #230 <Class bhe[]>
	//  181  426:putfield        #232 <Field bhe[] o>
				n.a();
	//  182  429:aload_0         
	//  183  430:getfield        #172 <Field bfp n>
	//  184  433:invokeinterface #234 <Method void bfp.a()>
				n.a(((bfu) (this)));
	//  185  438:aload_0         
	//  186  439:getfield        #172 <Field bfp n>
	//  187  442:aload_0         
	//  188  443:invokeinterface #237 <Method void bfp.a(bfu)>
				f.clear();
	//  189  448:aload_0         
	//  190  449:getfield        #65  <Field Stack f>
	//  191  452:invokevirtual   #240 <Method void Stack.clear()>
				g = 2;
	//  192  455:aload_0         
	//  193  456:iconst_2        
	//  194  457:putfield        #242 <Field int g>
			} else
	//* 195  460:goto            0
			if(!f.isEmpty())
	//* 196  463:aload_0         
	//* 197  464:getfield        #65  <Field Stack f>
	//* 198  467:invokevirtual   #82  <Method boolean Stack.isEmpty()>
	//* 199  470:ifne            0
				((bgk)f.peek()).a(bgk1);
	//  200  473:aload_0         
	//  201  474:getfield        #65  <Field Stack f>
	//  202  477:invokevirtual   #86  <Method Object Stack.peek()>
	//  203  480:checkcast       #88  <Class bgk>
	//  204  483:aload           13
	//  205  485:invokevirtual   #245 <Method void bgk.a(bgk)>
		} while(true);
	//  206  488:goto            0
		if(g != 2)
	//* 207  491:aload_0         
	//* 208  492:getfield        #242 <Field int g>
	//* 209  495:iconst_2        
	//* 210  496:icmpeq          503
			d();
	//  211  499:aload_0         
	//  212  500:invokespecial   #247 <Method void d()>
	//  213  503:return          
	}

	private final void d()
	{
		g = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #242 <Field int g>
		j = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #249 <Field int j>
	//    6   10:return          
	}

	public final int a(bfo bfo1, bft bft1)
	{
_L12:
		g;
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field int g>
		JVM INSTR tableswitch 0 2: default 32
	//	               0 829
	//	               1 584
	//	               2 40;
	//    2    4:tableswitch     0 2: default 32
	//	               0 829
	//	               1 584
	//	               2 40
		   goto _L1 _L2 _L3 _L4
_L1:
		throw new IllegalStateException();
	//    3   32:new             #252 <Class IllegalStateException>
	//    4   35:dup             
	//    5   36:invokespecial   #253 <Method void IllegalStateException()>
	//    6   39:athrow          
_L4:
		long l3 = 0xffffffffL;
	//    7   40:ldc2w           #254 <Long 0xffffffffL>
	//    8   43:lstore          8
		int i1 = 0;
	//    9   45:iconst_0        
	//   10   46:istore_3        
		int k1 = -1;
	//   11   47:iconst_m1       
	//   12   48:istore          4
		Object obj;
		do
		{
			obj = ((Object) (o));
	//   13   50:aload_0         
	//   14   51:getfield        #232 <Field bhe[] o>
	//   15   54:astore          15
			if(i1 >= obj.length)
				break;
	//   16   56:iload_3         
	//   17   57:aload           15
	//   18   59:arraylength     
	//   19   60:icmpge          148
			obj = ((Object) (obj[i1]));
	//   20   63:aload           15
	//   21   65:iload_3         
	//   22   66:aaload          
	//   23   67:astore          15
			int l2 = ((bhe) (obj)).d;
	//   24   69:aload           15
	//   25   71:getfield        #256 <Field int bhe.d>
	//   26   74:istore          6
			int j2 = k1;
	//   27   76:iload           4
	//   28   78:istore          5
			long l6 = l3;
	//   29   80:lload           8
	//   30   82:lstore          10
			if(l2 != ((bhe) (obj)).b.a)
	//*  31   84:iload           6
	//*  32   86:aload           15
	//*  33   88:getfield        #259 <Field bhk bhe.b>
	//*  34   91:getfield        #168 <Field int bhk.a>
	//*  35   94:icmpeq          133
			{
				long l9 = ((bhe) (obj)).b.b[l2];
	//   36   97:aload           15
	//   37   99:getfield        #259 <Field bhk bhe.b>
	//   38  102:getfield        #262 <Field long[] bhk.b>
	//   39  105:iload           6
	//   40  107:laload          
	//   41  108:lstore          12
				j2 = k1;
	//   42  110:iload           4
	//   43  112:istore          5
				l6 = l3;
	//   44  114:lload           8
	//   45  116:lstore          10
				if(l9 < l3)
	//*  46  118:lload           12
	//*  47  120:lload           8
	//*  48  122:lcmp            
	//*  49  123:ifge            133
				{
					j2 = i1;
	//   50  126:iload_3         
	//   51  127:istore          5
					l6 = l9;
	//   52  129:lload           12
	//   53  131:lstore          10
				}
			}
			i1++;
	//   54  133:iload_3         
	//   55  134:iconst_1        
	//   56  135:iadd            
	//   57  136:istore_3        
			k1 = j2;
	//   58  137:iload           5
	//   59  139:istore          4
			l3 = l6;
	//   60  141:lload           10
	//   61  143:lstore          8
		} while(true);
	//   62  145:goto            50
		if(k1 == -1)
	//*  63  148:iload           4
	//*  64  150:iconst_m1       
	//*  65  151:icmpne          156
			return -1;
	//   66  154:iconst_m1       
	//   67  155:ireturn         
		obj = ((Object) (obj[k1]));
	//   68  156:aload           15
	//   69  158:iload           4
	//   70  160:aaload          
	//   71  161:astore          15
		bfw bfw1 = ((bhe) (obj)).c;
	//   72  163:aload           15
	//   73  165:getfield        #206 <Field bfw bhe.c>
	//   74  168:astore          16
		int k2 = ((bhe) (obj)).d;
	//   75  170:aload           15
	//   76  172:getfield        #256 <Field int bhe.d>
	//   77  175:istore          5
		long l7 = ((bhe) (obj)).b.b[k2];
	//   78  177:aload           15
	//   79  179:getfield        #259 <Field bhk bhe.b>
	//   80  182:getfield        #262 <Field long[] bhk.b>
	//   81  185:iload           5
	//   82  187:laload          
	//   83  188:lstore          10
		k1 = ((bhe) (obj)).b.c[k2];
	//   84  190:aload           15
	//   85  192:getfield        #259 <Field bhk bhe.b>
	//   86  195:getfield        #265 <Field int[] bhk.c>
	//   87  198:iload           5
	//   88  200:iaload          
	//   89  201:istore          4
		i1 = k1;
	//   90  203:iload           4
	//   91  205:istore_3        
		l3 = l7;
	//   92  206:lload           10
	//   93  208:lstore          8
		if(((bhe) (obj)).a.g == 1)
	//*  94  210:aload           15
	//*  95  212:getfield        #268 <Field bhh bhe.a>
	//*  96  215:getfield        #269 <Field int bhh.g>
	//*  97  218:iconst_1        
	//*  98  219:icmpne          236
		{
			l3 = l7 + 8L;
	//   99  222:lload           10
	//  100  224:ldc2w           #270 <Long 8L>
	//  101  227:ladd            
	//  102  228:lstore          8
			i1 = k1 - 8;
	//  103  230:iload           4
	//  104  232:bipush          8
	//  105  234:isub            
	//  106  235:istore_3        
		}
		l7 = (l3 - bfo1.b()) + (long)l;
	//  107  236:lload           8
	//  108  238:aload_1         
	//  109  239:invokeinterface #276 <Method long bfo.b()>
	//  110  244:lsub            
	//  111  245:aload_0         
	//  112  246:getfield        #278 <Field int l>
	//  113  249:i2l             
	//  114  250:ladd            
	//  115  251:lstore          10
		if(l7 >= 0L && l7 < 0x40000L)
	//* 116  253:lload           10
	//* 117  255:lconst_0        
	//* 118  256:lcmp            
	//* 119  257:iflt            576
	//* 120  260:lload           10
	//* 121  262:ldc2w           #279 <Long 0x40000L>
	//* 122  265:lcmp            
	//* 123  266:iflt            272
	//* 124  269:goto            576
		{
			bfo1.b((int)l7);
	//  125  272:aload_1         
	//  126  273:lload           10
	//  127  275:l2i             
	//  128  276:invokeinterface #282 <Method void bfo.b(int)>
			if(((bhe) (obj)).a.k != 0)
	//* 129  281:aload           15
	//* 130  283:getfield        #268 <Field bhh bhe.a>
	//* 131  286:getfield        #284 <Field int bhh.k>
	//* 132  289:ifeq            468
			{
				bft1 = ((bft) (d.a));
	//  133  292:aload_0         
	//  134  293:getfield        #77  <Field bno d>
	//  135  296:getfield        #285 <Field byte[] bno.a>
	//  136  299:astore_2        
				bft1[0] = 0;
	//  137  300:aload_2         
	//  138  301:iconst_0        
	//  139  302:iconst_0        
	//  140  303:bastore         
				bft1[1] = 0;
	//  141  304:aload_2         
	//  142  305:iconst_1        
	//  143  306:iconst_0        
	//  144  307:bastore         
				bft1[2] = 0;
	//  145  308:aload_2         
	//  146  309:iconst_2        
	//  147  310:iconst_0        
	//  148  311:bastore         
				int l1 = ((bhe) (obj)).a.k;
	//  149  312:aload           15
	//  150  314:getfield        #268 <Field bhh bhe.a>
	//  151  317:getfield        #284 <Field int bhh.k>
	//  152  320:istore          4
				int i3 = 4 - ((bhe) (obj)).a.k;
	//  153  322:iconst_4        
	//  154  323:aload           15
	//  155  325:getfield        #268 <Field bhh bhe.a>
	//  156  328:getfield        #284 <Field int bhh.k>
	//  157  331:isub            
	//  158  332:istore          6
				while(l < i1) 
	//* 159  334:aload_0         
	//* 160  335:getfield        #278 <Field int l>
	//* 161  338:iload_3         
	//* 162  339:icmpge          465
				{
					int j3 = m;
	//  163  342:aload_0         
	//  164  343:getfield        #287 <Field int m>
	//  165  346:istore          7
					if(j3 == 0)
	//* 166  348:iload           7
	//* 167  350:ifne            427
					{
						bfo1.b(d.a, i3, l1);
	//  168  353:aload_1         
	//  169  354:aload_0         
	//  170  355:getfield        #77  <Field bno d>
	//  171  358:getfield        #285 <Field byte[] bno.a>
	//  172  361:iload           6
	//  173  363:iload           4
	//  174  365:invokeinterface #290 <Method void bfo.b(byte[], int, int)>
						d.c(0);
	//  175  370:aload_0         
	//  176  371:getfield        #77  <Field bno d>
	//  177  374:iconst_0        
	//  178  375:invokevirtual   #292 <Method void bno.c(int)>
						m = d.o();
	//  179  378:aload_0         
	//  180  379:aload_0         
	//  181  380:getfield        #77  <Field bno d>
	//  182  383:invokevirtual   #294 <Method int bno.o()>
	//  183  386:putfield        #287 <Field int m>
						c.c(0);
	//  184  389:aload_0         
	//  185  390:getfield        #75  <Field bno c>
	//  186  393:iconst_0        
	//  187  394:invokevirtual   #292 <Method void bno.c(int)>
						bfw1.a(c, 4);
	//  188  397:aload           16
	//  189  399:aload_0         
	//  190  400:getfield        #75  <Field bno c>
	//  191  403:iconst_4        
	//  192  404:invokeinterface #297 <Method void bfw.a(bno, int)>
						l = l + 4;
	//  193  409:aload_0         
	//  194  410:aload_0         
	//  195  411:getfield        #278 <Field int l>
	//  196  414:iconst_4        
	//  197  415:iadd            
	//  198  416:putfield        #278 <Field int l>
						i1 += i3;
	//  199  419:iload_3         
	//  200  420:iload           6
	//  201  422:iadd            
	//  202  423:istore_3        
					} else
	//* 203  424:goto            334
					{
						j3 = bfw1.a(bfo1, j3, false);
	//  204  427:aload           16
	//  205  429:aload_1         
	//  206  430:iload           7
	//  207  432:iconst_0        
	//  208  433:invokeinterface #300 <Method int bfw.a(bfo, int, boolean)>
	//  209  438:istore          7
						l = l + j3;
	//  210  440:aload_0         
	//  211  441:aload_0         
	//  212  442:getfield        #278 <Field int l>
	//  213  445:iload           7
	//  214  447:iadd            
	//  215  448:putfield        #278 <Field int l>
						m = m - j3;
	//  216  451:aload_0         
	//  217  452:aload_0         
	//  218  453:getfield        #287 <Field int m>
	//  219  456:iload           7
	//  220  458:isub            
	//  221  459:putfield        #287 <Field int m>
					}
				}
			} else
	//* 222  462:goto            334
	//* 223  465:goto            520
			{
				do
				{
					int i2 = l;
	//  224  468:aload_0         
	//  225  469:getfield        #278 <Field int l>
	//  226  472:istore          4
					if(i2 >= i1)
						break;
	//  227  474:iload           4
	//  228  476:iload_3         
	//  229  477:icmpge          520
					i2 = bfw1.a(bfo1, i1 - i2, false);
	//  230  480:aload           16
	//  231  482:aload_1         
	//  232  483:iload_3         
	//  233  484:iload           4
	//  234  486:isub            
	//  235  487:iconst_0        
	//  236  488:invokeinterface #300 <Method int bfw.a(bfo, int, boolean)>
	//  237  493:istore          4
					l = l + i2;
	//  238  495:aload_0         
	//  239  496:aload_0         
	//  240  497:getfield        #278 <Field int l>
	//  241  500:iload           4
	//  242  502:iadd            
	//  243  503:putfield        #278 <Field int l>
					m = m - i2;
	//  244  506:aload_0         
	//  245  507:aload_0         
	//  246  508:getfield        #287 <Field int m>
	//  247  511:iload           4
	//  248  513:isub            
	//  249  514:putfield        #287 <Field int m>
				} while(true);
	//  250  517:goto            468
			}
			bfw1.a(((bhe) (obj)).b.e[k2], ((bhe) (obj)).b.f[k2], i1, 0, ((bfx) (null)));
	//  251  520:aload           16
	//  252  522:aload           15
	//  253  524:getfield        #259 <Field bhk bhe.b>
	//  254  527:getfield        #302 <Field long[] bhk.e>
	//  255  530:iload           5
	//  256  532:laload          
	//  257  533:aload           15
	//  258  535:getfield        #259 <Field bhk bhe.b>
	//  259  538:getfield        #304 <Field int[] bhk.f>
	//  260  541:iload           5
	//  261  543:iaload          
	//  262  544:iload_3         
	//  263  545:iconst_0        
	//  264  546:aconst_null     
	//  265  547:invokeinterface #307 <Method void bfw.a(long, int, int, int, bfx)>
			obj.d = ((bhe) (obj)).d + 1;
	//  266  552:aload           15
	//  267  554:aload           15
	//  268  556:getfield        #256 <Field int bhe.d>
	//  269  559:iconst_1        
	//  270  560:iadd            
	//  271  561:putfield        #256 <Field int bhe.d>
			l = 0;
	//  272  564:aload_0         
	//  273  565:iconst_0        
	//  274  566:putfield        #278 <Field int l>
			m = 0;
	//  275  569:aload_0         
	//  276  570:iconst_0        
	//  277  571:putfield        #287 <Field int m>
			return 0;
	//  278  574:iconst_0        
	//  279  575:ireturn         
		} else
		{
			bft1.a = l3;
	//  280  576:aload_2         
	//  281  577:lload           8
	//  282  579:putfield        #311 <Field long bft.a>
			return 1;
	//  283  582:iconst_1        
	//  284  583:ireturn         
		}
_L3:
		long l4;
		long l8;
		bno bno1;
		l4 = i - (long)j;
	//  285  584:aload_0         
	//  286  585:getfield        #313 <Field long i>
	//  287  588:aload_0         
	//  288  589:getfield        #249 <Field int j>
	//  289  592:i2l             
	//  290  593:lsub            
	//  291  594:lstore          8
		l8 = bfo1.b();
	//  292  596:aload_1         
	//  293  597:invokeinterface #276 <Method long bfo.b()>
	//  294  602:lstore          10
		bno1 = k;
	//  295  604:aload_0         
	//  296  605:getfield        #315 <Field bno k>
	//  297  608:astore          15
		if(bno1 == null) goto _L6; else goto _L5
	//  298  610:aload           15
	//  299  612:ifnull          757
_L5:
		bfo1.b(bno1.a, j, (int)l4);
	//  300  615:aload_1         
	//  301  616:aload           15
	//  302  618:getfield        #285 <Field byte[] bno.a>
	//  303  621:aload_0         
	//  304  622:getfield        #249 <Field int j>
	//  305  625:lload           8
	//  306  627:l2i             
	//  307  628:invokeinterface #290 <Method void bfo.b(byte[], int, int)>
		if(h == bgj.a)
	//* 308  633:aload_0         
	//* 309  634:getfield        #317 <Field int h>
	//* 310  637:getstatic       #318 <Field int bgj.a>
	//* 311  640:icmpne          716
		{
			boolean flag;
label0:
			{
				bno bno2 = k;
	//  312  643:aload_0         
	//  313  644:getfield        #315 <Field bno k>
	//  314  647:astore          15
				bno2.c(8);
	//  315  649:aload           15
	//  316  651:bipush          8
	//  317  653:invokevirtual   #292 <Method void bno.c(int)>
				if(bno2.l() == b)
	//* 318  656:aload           15
	//* 319  658:invokevirtual   #320 <Method int bno.l()>
	//* 320  661:getstatic       #51  <Field int b>
	//* 321  664:icmpne          673
				{
					flag = true;
	//  322  667:iconst_1        
	//  323  668:istore          14
					break label0;
	//  324  670:goto            707
				}
				bno2.d(4);
	//  325  673:aload           15
	//  326  675:iconst_4        
	//  327  676:invokevirtual   #322 <Method void bno.d(int)>
				while(bno2.b() > 0) 
	//* 328  679:aload           15
	//* 329  681:invokevirtual   #324 <Method int bno.b()>
	//* 330  684:ifle            704
					if(bno2.l() == b)
	//* 331  687:aload           15
	//* 332  689:invokevirtual   #320 <Method int bno.l()>
	//* 333  692:getstatic       #51  <Field int b>
	//* 334  695:icmpne          679
					{
						flag = true;
	//  335  698:iconst_1        
	//  336  699:istore          14
						break label0;
	//  337  701:goto            707
					}
				flag = false;
	//  338  704:iconst_0        
	//  339  705:istore          14
			}
			q = flag;
	//  340  707:aload_0         
	//  341  708:iload           14
	//  342  710:putfield        #118 <Field boolean q>
		} else
	//* 343  713:goto            775
		if(!f.isEmpty())
	//* 344  716:aload_0         
	//* 345  717:getfield        #65  <Field Stack f>
	//* 346  720:invokevirtual   #82  <Method boolean Stack.isEmpty()>
	//* 347  723:ifne            775
			((bgk)f.peek()).a(new bgl(h, k));
	//  348  726:aload_0         
	//  349  727:getfield        #65  <Field Stack f>
	//  350  730:invokevirtual   #86  <Method Object Stack.peek()>
	//  351  733:checkcast       #88  <Class bgk>
	//  352  736:new             #326 <Class bgl>
	//  353  739:dup             
	//  354  740:aload_0         
	//  355  741:getfield        #317 <Field int h>
	//  356  744:aload_0         
	//  357  745:getfield        #315 <Field bno k>
	//  358  748:invokespecial   #329 <Method void bgl(int, bno)>
	//  359  751:invokevirtual   #332 <Method void bgk.a(bgl)>
		  goto _L7
	//* 360  754:goto            775
_L6:
		if(l4 >= 0x40000L) goto _L9; else goto _L8
	//  361  757:lload           8
	//  362  759:ldc2w           #279 <Long 0x40000L>
	//  363  762:lcmp            
	//  364  763:ifge            780
_L8:
		bfo1.b((int)l4);
	//  365  766:aload_1         
	//  366  767:lload           8
	//  367  769:l2i             
	//  368  770:invokeinterface #282 <Method void bfo.b(int)>
_L7:
		int j1 = 0;
	//  369  775:iconst_0        
	//  370  776:istore_3        
		  goto _L10
	//* 371  777:goto            795
_L9:
		bft1.a = bfo1.b() + l4;
	//  372  780:aload_2         
	//  373  781:aload_1         
	//  374  782:invokeinterface #276 <Method long bfo.b()>
	//  375  787:lload           8
	//  376  789:ladd            
	//  377  790:putfield        #311 <Field long bft.a>
		j1 = 1;
	//  378  793:iconst_1        
	//  379  794:istore_3        
_L10:
		a(l8 + l4);
	//  380  795:aload_0         
	//  381  796:lload           10
	//  382  798:lload           8
	//  383  800:ladd            
	//  384  801:invokespecial   #334 <Method void a(long)>
		if(j1 && g != 2)
	//* 385  804:iload_3         
	//* 386  805:ifeq            821
	//* 387  808:aload_0         
	//* 388  809:getfield        #242 <Field int g>
	//* 389  812:iconst_2        
	//* 390  813:icmpeq          821
			j1 = 1;
	//  391  816:iconst_1        
	//  392  817:istore_3        
		else
	//* 393  818:goto            823
			j1 = 0;
	//  394  821:iconst_0        
	//  395  822:istore_3        
		if(!j1) goto _L12; else goto _L11
	//  396  823:iload_3         
	//  397  824:ifeq            0
_L11:
		return 1;
	//  398  827:iconst_1        
	//  399  828:ireturn         
_L2:
		if(j == 0)
	//* 400  829:aload_0         
	//* 401  830:getfield        #249 <Field int j>
	//* 402  833:ifne            897
		{
			if(!bfo1.a(e.a, 0, 8, true))
	//* 403  836:aload_1         
	//* 404  837:aload_0         
	//* 405  838:getfield        #60  <Field bno e>
	//* 406  841:getfield        #285 <Field byte[] bno.a>
	//* 407  844:iconst_0        
	//* 408  845:bipush          8
	//* 409  847:iconst_1        
	//* 410  848:invokeinterface #337 <Method boolean bfo.a(byte[], int, int, boolean)>
	//* 411  853:ifne            861
			{
				j1 = 0;
	//  412  856:iconst_0        
	//  413  857:istore_3        
				continue; /* Loop/switch isn't completed */
	//  414  858:goto            1317
			}
			j = 8;
	//  415  861:aload_0         
	//  416  862:bipush          8
	//  417  864:putfield        #249 <Field int j>
			e.c(0);
	//  418  867:aload_0         
	//  419  868:getfield        #60  <Field bno e>
	//  420  871:iconst_0        
	//  421  872:invokevirtual   #292 <Method void bno.c(int)>
			i = e.j();
	//  422  875:aload_0         
	//  423  876:aload_0         
	//  424  877:getfield        #60  <Field bno e>
	//  425  880:invokevirtual   #339 <Method long bno.j()>
	//  426  883:putfield        #313 <Field long i>
			h = e.l();
	//  427  886:aload_0         
	//  428  887:aload_0         
	//  429  888:getfield        #60  <Field bno e>
	//  430  891:invokevirtual   #320 <Method int bno.l()>
	//  431  894:putfield        #317 <Field int h>
		}
		if(i == 1L)
	//* 432  897:aload_0         
	//* 433  898:getfield        #313 <Field long i>
	//* 434  901:lconst_1        
	//* 435  902:lcmp            
	//* 436  903:ifne            945
		{
			bfo1.b(e.a, 8, 8);
	//  437  906:aload_1         
	//  438  907:aload_0         
	//  439  908:getfield        #60  <Field bno e>
	//  440  911:getfield        #285 <Field byte[] bno.a>
	//  441  914:bipush          8
	//  442  916:bipush          8
	//  443  918:invokeinterface #290 <Method void bfo.b(byte[], int, int)>
			j = j + 8;
	//  444  923:aload_0         
	//  445  924:aload_0         
	//  446  925:getfield        #249 <Field int j>
	//  447  928:bipush          8
	//  448  930:iadd            
	//  449  931:putfield        #249 <Field int j>
			i = e.p();
	//  450  934:aload_0         
	//  451  935:aload_0         
	//  452  936:getfield        #60  <Field bno e>
	//  453  939:invokevirtual   #341 <Method long bno.p()>
	//  454  942:putfield        #313 <Field long i>
		}
		j1 = h;
	//  455  945:aload_0         
	//  456  946:getfield        #317 <Field int h>
	//  457  949:istore_3        
		if(j1 != bgj.B && j1 != bgj.D && j1 != bgj.E && j1 != bgj.F && j1 != bgj.G && j1 != bgj.P)
	//* 458  950:iload_3         
	//* 459  951:getstatic       #102 <Field int bgj.B>
	//* 460  954:icmpeq          1000
	//* 461  957:iload_3         
	//* 462  958:getstatic       #143 <Field int bgj.D>
	//* 463  961:icmpeq          1000
	//* 464  964:iload_3         
	//* 465  965:getstatic       #152 <Field int bgj.E>
	//* 466  968:icmpeq          1000
	//* 467  971:iload_3         
	//* 468  972:getstatic       #158 <Field int bgj.F>
	//* 469  975:icmpeq          1000
	//* 470  978:iload_3         
	//* 471  979:getstatic       #161 <Field int bgj.G>
	//* 472  982:icmpeq          1000
	//* 473  985:iload_3         
	//* 474  986:getstatic       #344 <Field int bgj.P>
	//* 475  989:icmpne          995
	//* 476  992:goto            1000
			j1 = 0;
	//  477  995:iconst_0        
	//  478  996:istore_3        
		else
	//* 479  997:goto            1002
			j1 = 1;
	//  480 1000:iconst_1        
	//  481 1001:istore_3        
		if(j1 != 0)
	//* 482 1002:iload_3         
	//* 483 1003:ifeq            1079
		{
			long l5 = (bfo1.b() + i) - (long)j;
	//  484 1006:aload_1         
	//  485 1007:invokeinterface #276 <Method long bfo.b()>
	//  486 1012:aload_0         
	//  487 1013:getfield        #313 <Field long i>
	//  488 1016:ladd            
	//  489 1017:aload_0         
	//  490 1018:getfield        #249 <Field int j>
	//  491 1021:i2l             
	//  492 1022:lsub            
	//  493 1023:lstore          8
			f.add(((Object) (new bgk(h, l5))));
	//  494 1025:aload_0         
	//  495 1026:getfield        #65  <Field Stack f>
	//  496 1029:new             #88  <Class bgk>
	//  497 1032:dup             
	//  498 1033:aload_0         
	//  499 1034:getfield        #317 <Field int h>
	//  500 1037:lload           8
	//  501 1039:invokespecial   #347 <Method void bgk(int, long)>
	//  502 1042:invokevirtual   #348 <Method boolean Stack.add(Object)>
	//  503 1045:pop             
			if(i == (long)j)
	//* 504 1046:aload_0         
	//* 505 1047:getfield        #313 <Field long i>
	//* 506 1050:aload_0         
	//* 507 1051:getfield        #249 <Field int j>
	//* 508 1054:i2l             
	//* 509 1055:lcmp            
	//* 510 1056:ifne            1070
			{
				a(l5);
	//  511 1059:aload_0         
	//  512 1060:lload           8
	//  513 1062:invokespecial   #334 <Method void a(long)>
				j1 = 1;
	//  514 1065:iconst_1        
	//  515 1066:istore_3        
			} else
	//* 516 1067:goto            1317
			{
				d();
	//  517 1070:aload_0         
	//  518 1071:invokespecial   #247 <Method void d()>
				j1 = 1;
	//  519 1074:iconst_1        
	//  520 1075:istore_3        
			}
		} else
	//* 521 1076:goto            1317
		{
			j1 = h;
	//  522 1079:aload_0         
	//  523 1080:getfield        #317 <Field int h>
	//  524 1083:istore_3        
			if(j1 != bgj.R && j1 != bgj.C && j1 != bgj.S && j1 != bgj.T && j1 != bgj.al && j1 != bgj.am && j1 != bgj.an && j1 != bgj.Q && j1 != bgj.ao && j1 != bgj.ap && j1 != bgj.aq && j1 != bgj.ar && j1 != bgj.as && j1 != bgj.O && j1 != bgj.a && j1 != bgj.az)
	//* 525 1084:iload_3         
	//* 526 1085:getstatic       #351 <Field int bgj.R>
	//* 527 1088:icmpeq          1204
	//* 528 1091:iload_3         
	//* 529 1092:getstatic       #146 <Field int bgj.C>
	//* 530 1095:icmpeq          1204
	//* 531 1098:iload_3         
	//* 532 1099:getstatic       #354 <Field int bgj.S>
	//* 533 1102:icmpeq          1204
	//* 534 1105:iload_3         
	//* 535 1106:getstatic       #357 <Field int bgj.T>
	//* 536 1109:icmpeq          1204
	//* 537 1112:iload_3         
	//* 538 1113:getstatic       #360 <Field int bgj.al>
	//* 539 1116:icmpeq          1204
	//* 540 1119:iload_3         
	//* 541 1120:getstatic       #363 <Field int bgj.am>
	//* 542 1123:icmpeq          1204
	//* 543 1126:iload_3         
	//* 544 1127:getstatic       #366 <Field int bgj.an>
	//* 545 1130:icmpeq          1204
	//* 546 1133:iload_3         
	//* 547 1134:getstatic       #369 <Field int bgj.Q>
	//* 548 1137:icmpeq          1204
	//* 549 1140:iload_3         
	//* 550 1141:getstatic       #372 <Field int bgj.ao>
	//* 551 1144:icmpeq          1204
	//* 552 1147:iload_3         
	//* 553 1148:getstatic       #375 <Field int bgj.ap>
	//* 554 1151:icmpeq          1204
	//* 555 1154:iload_3         
	//* 556 1155:getstatic       #378 <Field int bgj.aq>
	//* 557 1158:icmpeq          1204
	//* 558 1161:iload_3         
	//* 559 1162:getstatic       #381 <Field int bgj.ar>
	//* 560 1165:icmpeq          1204
	//* 561 1168:iload_3         
	//* 562 1169:getstatic       #384 <Field int bgj.as>
	//* 563 1172:icmpeq          1204
	//* 564 1175:iload_3         
	//* 565 1176:getstatic       #387 <Field int bgj.O>
	//* 566 1179:icmpeq          1204
	//* 567 1182:iload_3         
	//* 568 1183:getstatic       #318 <Field int bgj.a>
	//* 569 1186:icmpeq          1204
	//* 570 1189:iload_3         
	//* 571 1190:getstatic       #113 <Field int bgj.az>
	//* 572 1193:icmpne          1199
	//* 573 1196:goto            1204
				j1 = 0;
	//  574 1199:iconst_0        
	//  575 1200:istore_3        
			else
	//* 576 1201:goto            1206
				j1 = 1;
	//  577 1204:iconst_1        
	//  578 1205:istore_3        
			if(j1 != 0)
	//* 579 1206:iload_3         
	//* 580 1207:ifeq            1305
			{
				boolean flag1;
				if(j == 8)
	//* 581 1210:aload_0         
	//* 582 1211:getfield        #249 <Field int j>
	//* 583 1214:bipush          8
	//* 584 1216:icmpne          1225
					flag1 = true;
	//  585 1219:iconst_1        
	//  586 1220:istore          14
				else
	//* 587 1222:goto            1228
					flag1 = false;
	//  588 1225:iconst_0        
	//  589 1226:istore          14
				bnf.b(flag1);
	//  590 1228:iload           14
	//  591 1230:invokestatic    #392 <Method void bnf.b(boolean)>
				if(i <= 0x7fffffffL)
	//* 592 1233:aload_0         
	//* 593 1234:getfield        #313 <Field long i>
	//* 594 1237:ldc2w           #393 <Long 0x7fffffffL>
	//* 595 1240:lcmp            
	//* 596 1241:ifgt            1250
					flag1 = true;
	//  597 1244:iconst_1        
	//  598 1245:istore          14
				else
	//* 599 1247:goto            1253
					flag1 = false;
	//  600 1250:iconst_0        
	//  601 1251:istore          14
				bnf.b(flag1);
	//  602 1253:iload           14
	//  603 1255:invokestatic    #392 <Method void bnf.b(boolean)>
				k = new bno((int)i);
	//  604 1258:aload_0         
	//  605 1259:new             #55  <Class bno>
	//  606 1262:dup             
	//  607 1263:aload_0         
	//  608 1264:getfield        #313 <Field long i>
	//  609 1267:l2i             
	//  610 1268:invokespecial   #58  <Method void bno(int)>
	//  611 1271:putfield        #315 <Field bno k>
				System.arraycopy(((Object) (e.a)), 0, ((Object) (k.a)), 0, 8);
	//  612 1274:aload_0         
	//  613 1275:getfield        #60  <Field bno e>
	//  614 1278:getfield        #285 <Field byte[] bno.a>
	//  615 1281:iconst_0        
	//  616 1282:aload_0         
	//  617 1283:getfield        #315 <Field bno k>
	//  618 1286:getfield        #285 <Field byte[] bno.a>
	//  619 1289:iconst_0        
	//  620 1290:bipush          8
	//  621 1292:invokestatic    #400 <Method void System.arraycopy(Object, int, Object, int, int)>
				j1 = 1;
	//  622 1295:iconst_1        
	//  623 1296:istore_3        
				g = 1;
	//  624 1297:aload_0         
	//  625 1298:iconst_1        
	//  626 1299:putfield        #242 <Field int g>
			} else
	//* 627 1302:goto            1317
			{
				j1 = 1;
	//  628 1305:iconst_1        
	//  629 1306:istore_3        
				k = null;
	//  630 1307:aload_0         
	//  631 1308:aconst_null     
	//  632 1309:putfield        #315 <Field bno k>
				g = 1;
	//  633 1312:aload_0         
	//  634 1313:iconst_1        
	//  635 1314:putfield        #242 <Field int g>
			}
		}
		if(j1 != 0) goto _L12; else goto _L13
	//  636 1317:iload_3         
	//  637 1318:ifne            0
_L13:
		return -1;
	//  638 1321:iconst_m1       
	//  639 1322:ireturn         
	}

	public final void a(long l1, long l2)
	{
		f.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Stack f>
	//    2    4:invokevirtual   #240 <Method void Stack.clear()>
		int i1 = 0;
	//    3    7:iconst_0        
	//    4    8:istore          5
		j = 0;
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:putfield        #249 <Field int j>
		l = 0;
	//    8   15:aload_0         
	//    9   16:iconst_0        
	//   10   17:putfield        #278 <Field int l>
		m = 0;
	//   11   20:aload_0         
	//   12   21:iconst_0        
	//   13   22:putfield        #287 <Field int m>
		if(l1 == 0L)
	//*  14   25:lload_1         
	//*  15   26:lconst_0        
	//*  16   27:lcmp            
	//*  17   28:ifne            36
		{
			d();
	//   18   31:aload_0         
	//   19   32:invokespecial   #247 <Method void d()>
			return;
	//   20   35:return          
		}
		bhe abhe[] = o;
	//   21   36:aload_0         
	//   22   37:getfield        #232 <Field bhe[] o>
	//   23   40:astore          9
		if(abhe != null)
	//*  24   42:aload           9
	//*  25   44:ifnull          115
		{
			for(int i2 = abhe.length; i1 < i2; i1++)
	//*  26   47:aload           9
	//*  27   49:arraylength     
	//*  28   50:istore          8
	//*  29   52:iload           5
	//*  30   54:iload           8
	//*  31   56:icmpge          115
			{
				bhe bhe1 = abhe[i1];
	//   32   59:aload           9
	//   33   61:iload           5
	//   34   63:aaload          
	//   35   64:astore          10
				bhk bhk1 = bhe1.b;
	//   36   66:aload           10
	//   37   68:getfield        #259 <Field bhk bhe.b>
	//   38   71:astore          11
				int k1 = bhk1.a(l2);
	//   39   73:aload           11
	//   40   75:lload_3         
	//   41   76:invokevirtual   #404 <Method int bhk.a(long)>
	//   42   79:istore          7
				int j1 = k1;
	//   43   81:iload           7
	//   44   83:istore          6
				if(k1 == -1)
	//*  45   85:iload           7
	//*  46   87:iconst_m1       
	//*  47   88:icmpne          99
					j1 = bhk1.b(l2);
	//   48   91:aload           11
	//   49   93:lload_3         
	//   50   94:invokevirtual   #406 <Method int bhk.b(long)>
	//   51   97:istore          6
				bhe1.d = j1;
	//   52   99:aload           10
	//   53  101:iload           6
	//   54  103:putfield        #256 <Field int bhe.d>
			}

	//   55  106:iload           5
	//   56  108:iconst_1        
	//   57  109:iadd            
	//   58  110:istore          5
		}
	//*  59  112:goto            52
	//   60  115:return          
	}

	public final void a(bfp bfp1)
	{
		n = bfp1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #172 <Field bfp n>
	//    3    5:return          
	}

	public final boolean a()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final boolean a(bfo bfo1)
	{
		return bhg.b(bfo1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #412 <Method boolean bhg.b(bfo)>
	//    2    4:ireturn         
	}

	public final long b()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field long p>
	//    2    4:lreturn         
	}

	public final long b(long l1)
	{
		bhe abhe[] = o;
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field bhe[] o>
	//    2    4:astore          13
		int i2 = abhe.length;
	//    3    6:aload           13
	//    4    8:arraylength     
	//    5    9:istore          6
		long l2 = 0xffffffffL;
	//    6   11:ldc2w           #254 <Long 0xffffffffL>
	//    7   14:lstore          7
		for(int i1 = 0; i1 < i2;)
	//*   8   16:iconst_0        
	//*   9   17:istore_3        
	//*  10   18:iload_3         
	//*  11   19:iload           6
	//*  12   21:icmpge          96
		{
			bhk bhk1 = abhe[i1].b;
	//   13   24:aload           13
	//   14   26:iload_3         
	//   15   27:aaload          
	//   16   28:getfield        #259 <Field bhk bhe.b>
	//   17   31:astore          14
			int k1 = bhk1.a(l1);
	//   18   33:aload           14
	//   19   35:lload_1         
	//   20   36:invokevirtual   #404 <Method int bhk.a(long)>
	//   21   39:istore          5
			int j1 = k1;
	//   22   41:iload           5
	//   23   43:istore          4
			if(k1 == -1)
	//*  24   45:iload           5
	//*  25   47:iconst_m1       
	//*  26   48:icmpne          59
				j1 = bhk1.b(l1);
	//   27   51:aload           14
	//   28   53:lload_1         
	//   29   54:invokevirtual   #406 <Method int bhk.b(long)>
	//   30   57:istore          4
			long l4 = bhk1.b[j1];
	//   31   59:aload           14
	//   32   61:getfield        #262 <Field long[] bhk.b>
	//   33   64:iload           4
	//   34   66:laload          
	//   35   67:lstore          11
			long l3 = l2;
	//   36   69:lload           7
	//   37   71:lstore          9
			if(l4 < l2)
	//*  38   73:lload           11
	//*  39   75:lload           7
	//*  40   77:lcmp            
	//*  41   78:ifge            85
				l3 = l4;
	//   42   81:lload           11
	//   43   83:lstore          9
			i1++;
	//   44   85:iload_3         
	//   45   86:iconst_1        
	//   46   87:iadd            
	//   47   88:istore_3        
			l2 = l3;
	//   48   89:lload           9
	//   49   91:lstore          7
		}

	//*  50   93:goto            18
		return l2;
	//   51   96:lload           7
	//   52   98:lreturn         
	}

	public final void c()
	{
	//    0    0:return          
	}

	private static final bfq a = new bhd();
	private static final int b = bnw.f("qt  ");
	private final bno c;
	private final bno d = new bno(4);
	private final bno e = new bno(16);
	private final Stack f = new Stack();
	private int g;
	private int h;
	private long i;
	private int j;
	private bno k;
	private int l;
	private int m;
	private bfp n;
	private bhe o[];
	private long p;
	private boolean q;

	static 
	{
	//    0    0:new             #37  <Class bhd>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void bhd()>
	//    3    7:putstatic       #42  <Field bfq a>
	//    4   10:ldc1            #44  <String "qt  ">
	//    5   12:invokestatic    #49  <Method int bnw.f(String)>
	//    6   15:putstatic       #51  <Field int b>
	//*   7   18:return          
	}
}
