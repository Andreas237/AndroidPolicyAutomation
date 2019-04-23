// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awj, awt, awh, buv, 
//			arh, awg, bve, bti, 
//			bvh, bvg, bvj, awp

public final class bvi extends awj
{

	public bvi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void awj()>
		e = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #29  <Field Integer e>
		a = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #31  <Field String a>
		f = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #33  <Field Integer f>
		g = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #35  <Field buv g>
		h = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #37  <Field bvj h>
		b = awt.b;
	//   17   29:aload_0         
	//   18   30:getstatic       #41  <Field long[] awt.b>
	//   19   33:putfield        #42  <Field long[] b>
		c = null;
	//   20   36:aload_0         
	//   21   37:aconst_null     
	//   22   38:putfield        #44  <Field bvg c>
		i = null;
	//   23   41:aload_0         
	//   24   42:aconst_null     
	//   25   43:putfield        #46  <Field bvh i>
		j = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #48  <Field bti j>
		d = null;
	//   29   51:aload_0         
	//   30   52:aconst_null     
	//   31   53:putfield        #50  <Field bve d>
		Z = null;
	//   32   56:aload_0         
	//   33   57:aconst_null     
	//   34   58:putfield        #54  <Field awl Z>
		aa = -1;
	//   35   61:aload_0         
	//   36   62:iconst_m1       
	//   37   63:putfield        #58  <Field int aa>
	//   38   66:return          
	}

	protected final int a()
	{
		int k = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method int awj.a()>
	//    2    4:istore_1        
		Object obj = ((Object) (e));
	//    3    5:aload_0         
	//    4    6:getfield        #29  <Field Integer e>
	//    5    9:astore          4
		int l = k;
	//    6   11:iload_1         
	//    7   12:istore_2        
		if(obj != null)
	//*   8   13:aload           4
	//*   9   15:ifnull          31
			l = k + awh.b(9, ((Integer) (obj)).intValue());
	//   10   18:iload_1         
	//   11   19:bipush          9
	//   12   21:aload           4
	//   13   23:invokevirtual   #67  <Method int Integer.intValue()>
	//   14   26:invokestatic    #72  <Method int awh.b(int, int)>
	//   15   29:iadd            
	//   16   30:istore_2        
		obj = ((Object) (a));
	//   17   31:aload_0         
	//   18   32:getfield        #31  <Field String a>
	//   19   35:astore          4
		k = l;
	//   20   37:iload_2         
	//   21   38:istore_1        
		if(obj != null)
	//*  22   39:aload           4
	//*  23   41:ifnull          54
			k = l + awh.b(10, ((String) (obj)));
	//   24   44:iload_2         
	//   25   45:bipush          10
	//   26   47:aload           4
	//   27   49:invokestatic    #75  <Method int awh.b(int, String)>
	//   28   52:iadd            
	//   29   53:istore_1        
		obj = ((Object) (f));
	//   30   54:aload_0         
	//   31   55:getfield        #33  <Field Integer f>
	//   32   58:astore          4
		l = k;
	//   33   60:iload_1         
	//   34   61:istore_2        
		if(obj != null)
	//*  35   62:aload           4
	//*  36   64:ifnull          86
		{
			l = ((Integer) (obj)).intValue();
	//   37   67:aload           4
	//   38   69:invokevirtual   #67  <Method int Integer.intValue()>
	//   39   72:istore_2        
			l = k + (awh.b(11) + awh.d(l));
	//   40   73:iload_1         
	//   41   74:bipush          11
	//   42   76:invokestatic    #78  <Method int awh.b(int)>
	//   43   79:iload_2         
	//   44   80:invokestatic    #80  <Method int awh.d(int)>
	//   45   83:iadd            
	//   46   84:iadd            
	//   47   85:istore_2        
		}
		obj = ((Object) (g));
	//   48   86:aload_0         
	//   49   87:getfield        #35  <Field buv g>
	//   50   90:astore          4
		int i1 = l;
	//   51   92:iload_2         
	//   52   93:istore_3        
		if(obj != null)
	//*  53   94:aload           4
	//*  54   96:ifnull          119
		{
			i1 = l;
	//   55   99:iload_2         
	//   56  100:istore_3        
			if(obj != null)
	//*  57  101:aload           4
	//*  58  103:ifnull          119
				i1 = l + awh.b(12, ((buv) (obj)).a());
	//   59  106:iload_2         
	//   60  107:bipush          12
	//   61  109:aload           4
	//   62  111:invokevirtual   #83  <Method int buv.a()>
	//   63  114:invokestatic    #72  <Method int awh.b(int, int)>
	//   64  117:iadd            
	//   65  118:istore_3        
		}
		obj = ((Object) (h));
	//   66  119:aload_0         
	//   67  120:getfield        #37  <Field bvj h>
	//   68  123:astore          4
		k = i1;
	//   69  125:iload_3         
	//   70  126:istore_1        
		if(obj != null)
	//*  71  127:aload           4
	//*  72  129:ifnull          142
			k = i1 + awh.b(13, ((awp) (obj)));
	//   73  132:iload_3         
	//   74  133:bipush          13
	//   75  135:aload           4
	//   76  137:invokestatic    #86  <Method int awh.b(int, awp)>
	//   77  140:iadd            
	//   78  141:istore_1        
		long al[] = b;
	//   79  142:aload_0         
	//   80  143:getfield        #42  <Field long[] b>
	//   81  146:astore          4
		l = k;
	//   82  148:iload_1         
	//   83  149:istore_2        
		if(al != null)
	//*  84  150:aload           4
	//*  85  152:ifnull          207
		{
			l = k;
	//   86  155:iload_1         
	//   87  156:istore_2        
			if(al.length > 0)
	//*  88  157:aload           4
	//*  89  159:arraylength     
	//*  90  160:ifle            207
			{
				l = 0;
	//   91  163:iconst_0        
	//   92  164:istore_2        
				int j1 = 0;
	//   93  165:iconst_0        
	//   94  166:istore_3        
				long al1[];
				do
				{
					al1 = b;
	//   95  167:aload_0         
	//   96  168:getfield        #42  <Field long[] b>
	//   97  171:astore          4
					if(l >= al1.length)
						break;
	//   98  173:iload_2         
	//   99  174:aload           4
	//  100  176:arraylength     
	//  101  177:icmpge          197
					j1 += awh.a(al1[l]);
	//  102  180:iload_3         
	//  103  181:aload           4
	//  104  183:iload_2         
	//  105  184:laload          
	//  106  185:invokestatic    #89  <Method int awh.a(long)>
	//  107  188:iadd            
	//  108  189:istore_3        
					l++;
	//  109  190:iload_2         
	//  110  191:iconst_1        
	//  111  192:iadd            
	//  112  193:istore_2        
				} while(true);
	//  113  194:goto            167
				l = k + j1 + al1.length * 1;
	//  114  197:iload_1         
	//  115  198:iload_3         
	//  116  199:iadd            
	//  117  200:aload           4
	//  118  202:arraylength     
	//  119  203:iconst_1        
	//  120  204:imul            
	//  121  205:iadd            
	//  122  206:istore_2        
			}
		}
		al1 = ((long []) (c));
	//  123  207:aload_0         
	//  124  208:getfield        #44  <Field bvg c>
	//  125  211:astore          4
		k = l;
	//  126  213:iload_2         
	//  127  214:istore_1        
		if(al1 != null)
	//* 128  215:aload           4
	//* 129  217:ifnull          230
			k = l + awh.b(15, ((awp) (al1)));
	//  130  220:iload_2         
	//  131  221:bipush          15
	//  132  223:aload           4
	//  133  225:invokestatic    #86  <Method int awh.b(int, awp)>
	//  134  228:iadd            
	//  135  229:istore_1        
		al1 = ((long []) (i));
	//  136  230:aload_0         
	//  137  231:getfield        #46  <Field bvh i>
	//  138  234:astore          4
		l = k;
	//  139  236:iload_1         
	//  140  237:istore_2        
		if(al1 != null)
	//* 141  238:aload           4
	//* 142  240:ifnull          253
			l = k + awh.b(16, ((awp) (al1)));
	//  143  243:iload_1         
	//  144  244:bipush          16
	//  145  246:aload           4
	//  146  248:invokestatic    #86  <Method int awh.b(int, awp)>
	//  147  251:iadd            
	//  148  252:istore_2        
		al1 = ((long []) (j));
	//  149  253:aload_0         
	//  150  254:getfield        #48  <Field bti j>
	//  151  257:astore          4
		k = l;
	//  152  259:iload_2         
	//  153  260:istore_1        
		if(al1 != null)
	//* 154  261:aload           4
	//* 155  263:ifnull          276
			k = l + arh.c(17, ((atv) (al1)));
	//  156  266:iload_2         
	//  157  267:bipush          17
	//  158  269:aload           4
	//  159  271:invokestatic    #94  <Method int arh.c(int, atv)>
	//  160  274:iadd            
	//  161  275:istore_1        
		al1 = ((long []) (d));
	//  162  276:aload_0         
	//  163  277:getfield        #50  <Field bve d>
	//  164  280:astore          4
		l = k;
	//  165  282:iload_1         
	//  166  283:istore_2        
		if(al1 != null)
	//* 167  284:aload           4
	//* 168  286:ifnull          299
			l = k + awh.b(18, ((awp) (al1)));
	//  169  289:iload_1         
	//  170  290:bipush          18
	//  171  292:aload           4
	//  172  294:invokestatic    #86  <Method int awh.b(int, awp)>
	//  173  297:iadd            
	//  174  298:istore_2        
		return l;
	//  175  299:iload_2         
	//  176  300:ireturn         
	}

	public final awp a(awg awg1)
	{
_L15:
		int k = awg1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #98  <Method int awg.a()>
	//    2    4:istore_2        
		k;
	//    3    5:iload_2         
		JVM INSTR lookupswitch 12: default 112
	//	               0: 590
	//	               72: 576
	//	               82: 565
	//	               88: 551
	//	               96: 481
	//	               106: 452
	//	               112: 352
	//	               114: 227
	//	               122: 198
	//	               130: 169
	//	               138: 152
	//	               146: 123;
	//    4    6:lookupswitch    12: default 112
	//	               0: 590
	//	               72: 576
	//	               82: 565
	//	               88: 551
	//	               96: 481
	//	               106: 452
	//	               112: 352
	//	               114: 227
	//	               122: 198
	//	               130: 169
	//	               138: 152
	//	               146: 123
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
		if(super.a(awg1, k)) goto _L15; else goto _L14
	//    5  112:aload_0         
	//    6  113:aload_1         
	//    7  114:iload_2         
	//    8  115:invokespecial   #101 <Method boolean awj.a(awg, int)>
	//    9  118:ifne            0
_L14:
		return ((awp) (this));
	//   10  121:aload_0         
	//   11  122:areturn         
_L13:
		if(d == null)
	//*  12  123:aload_0         
	//*  13  124:getfield        #50  <Field bve d>
	//*  14  127:ifnonnull       141
			d = new bve();
	//   15  130:aload_0         
	//   16  131:new             #103 <Class bve>
	//   17  134:dup             
	//   18  135:invokespecial   #104 <Method void bve()>
	//   19  138:putfield        #50  <Field bve d>
		awg1.a(((awp) (d)));
	//   20  141:aload_1         
	//   21  142:aload_0         
	//   22  143:getfield        #50  <Field bve d>
	//   23  146:invokevirtual   #107 <Method void awg.a(awp)>
		  goto _L15
	//*  24  149:goto            0
_L12:
		j = (bti)awg1.a(bti.a());
	//   25  152:aload_0         
	//   26  153:aload_1         
	//   27  154:invokestatic    #112 <Method aug bti.a()>
	//   28  157:invokevirtual   #115 <Method ash awg.a(aug)>
	//   29  160:checkcast       #109 <Class bti>
	//   30  163:putfield        #48  <Field bti j>
		  goto _L15
	//*  31  166:goto            0
_L11:
		if(i == null)
	//*  32  169:aload_0         
	//*  33  170:getfield        #46  <Field bvh i>
	//*  34  173:ifnonnull       187
			i = new bvh();
	//   35  176:aload_0         
	//   36  177:new             #117 <Class bvh>
	//   37  180:dup             
	//   38  181:invokespecial   #118 <Method void bvh()>
	//   39  184:putfield        #46  <Field bvh i>
		awg1.a(((awp) (i)));
	//   40  187:aload_1         
	//   41  188:aload_0         
	//   42  189:getfield        #46  <Field bvh i>
	//   43  192:invokevirtual   #107 <Method void awg.a(awp)>
		  goto _L15
	//*  44  195:goto            0
_L10:
		if(c == null)
	//*  45  198:aload_0         
	//*  46  199:getfield        #44  <Field bvg c>
	//*  47  202:ifnonnull       216
			c = new bvg();
	//   48  205:aload_0         
	//   49  206:new             #120 <Class bvg>
	//   50  209:dup             
	//   51  210:invokespecial   #121 <Method void bvg()>
	//   52  213:putfield        #44  <Field bvg c>
		awg1.a(((awp) (c)));
	//   53  216:aload_1         
	//   54  217:aload_0         
	//   55  218:getfield        #44  <Field bvg c>
	//   56  221:invokevirtual   #107 <Method void awg.a(awp)>
		  goto _L15
	//*  57  224:goto            0
_L9:
		int k1 = awg1.c(awg1.g());
	//   58  227:aload_1         
	//   59  228:aload_1         
	//   60  229:invokevirtual   #123 <Method int awg.g()>
	//   61  232:invokevirtual   #125 <Method int awg.c(int)>
	//   62  235:istore          4
		k = awg1.j();
	//   63  237:aload_1         
	//   64  238:invokevirtual   #127 <Method int awg.j()>
	//   65  241:istore_2        
		int l;
		for(l = 0; awg1.i() > 0; l++)
	//*  66  242:iconst_0        
	//*  67  243:istore_3        
	//*  68  244:aload_1         
	//*  69  245:invokevirtual   #129 <Method int awg.i()>
	//*  70  248:ifle            263
			awg1.h();
	//   71  251:aload_1         
	//   72  252:invokevirtual   #132 <Method long awg.h()>
	//   73  255:pop2            

	//   74  256:iload_3         
	//   75  257:iconst_1        
	//   76  258:iadd            
	//   77  259:istore_3        
	//*  78  260:goto            244
		awg1.e(k);
	//   79  263:aload_1         
	//   80  264:iload_2         
	//   81  265:invokevirtual   #135 <Method void awg.e(int)>
		long al[] = b;
	//   82  268:aload_0         
	//   83  269:getfield        #42  <Field long[] b>
	//   84  272:astore          5
		if(al == null)
	//*  85  274:aload           5
	//*  86  276:ifnonnull       284
			k = 0;
	//   87  279:iconst_0        
	//   88  280:istore_2        
		else
	//*  89  281:goto            288
			k = al.length;
	//   90  284:aload           5
	//   91  286:arraylength     
	//   92  287:istore_2        
		al = new long[l + k];
	//   93  288:iload_3         
	//   94  289:iload_2         
	//   95  290:iadd            
	//   96  291:newarray        long[]
	//   97  293:astore          5
		l = k;
	//   98  295:iload_2         
	//   99  296:istore_3        
		if(k != 0)
	//* 100  297:iload_2         
	//* 101  298:ifeq            315
		{
			System.arraycopy(((Object) (b)), 0, ((Object) (al)), 0, k);
	//  102  301:aload_0         
	//  103  302:getfield        #42  <Field long[] b>
	//  104  305:iconst_0        
	//  105  306:aload           5
	//  106  308:iconst_0        
	//  107  309:iload_2         
	//  108  310:invokestatic    #141 <Method void System.arraycopy(Object, int, Object, int, int)>
			l = k;
	//  109  313:iload_2         
	//  110  314:istore_3        
		}
		for(; l < al.length; l++)
	//* 111  315:iload_3         
	//* 112  316:aload           5
	//* 113  318:arraylength     
	//* 114  319:icmpge          337
			al[l] = awg1.h();
	//  115  322:aload           5
	//  116  324:iload_3         
	//  117  325:aload_1         
	//  118  326:invokevirtual   #132 <Method long awg.h()>
	//  119  329:lastore         

	//  120  330:iload_3         
	//  121  331:iconst_1        
	//  122  332:iadd            
	//  123  333:istore_3        
	//* 124  334:goto            315
		b = al;
	//  125  337:aload_0         
	//  126  338:aload           5
	//  127  340:putfield        #42  <Field long[] b>
		awg1.d(k1);
	//  128  343:aload_1         
	//  129  344:iload           4
	//  130  346:invokevirtual   #143 <Method void awg.d(int)>
		  goto _L15
	//* 131  349:goto            0
_L8:
		int i1 = awt.a(awg1, 112);
	//  132  352:aload_1         
	//  133  353:bipush          112
	//  134  355:invokestatic    #146 <Method int awt.a(awg, int)>
	//  135  358:istore_3        
		long al1[] = b;
	//  136  359:aload_0         
	//  137  360:getfield        #42  <Field long[] b>
	//  138  363:astore          5
		if(al1 == null)
	//* 139  365:aload           5
	//* 140  367:ifnonnull       375
			k = 0;
	//  141  370:iconst_0        
	//  142  371:istore_2        
		else
	//* 143  372:goto            379
			k = al1.length;
	//  144  375:aload           5
	//  145  377:arraylength     
	//  146  378:istore_2        
		al1 = new long[i1 + k];
	//  147  379:iload_3         
	//  148  380:iload_2         
	//  149  381:iadd            
	//  150  382:newarray        long[]
	//  151  384:astore          5
		i1 = k;
	//  152  386:iload_2         
	//  153  387:istore_3        
		if(k != 0)
	//* 154  388:iload_2         
	//* 155  389:ifeq            406
		{
			System.arraycopy(((Object) (b)), 0, ((Object) (al1)), 0, k);
	//  156  392:aload_0         
	//  157  393:getfield        #42  <Field long[] b>
	//  158  396:iconst_0        
	//  159  397:aload           5
	//  160  399:iconst_0        
	//  161  400:iload_2         
	//  162  401:invokestatic    #141 <Method void System.arraycopy(Object, int, Object, int, int)>
			i1 = k;
	//  163  404:iload_2         
	//  164  405:istore_3        
		}
		for(; i1 < al1.length - 1; i1++)
	//* 165  406:iload_3         
	//* 166  407:aload           5
	//* 167  409:arraylength     
	//* 168  410:iconst_1        
	//* 169  411:isub            
	//* 170  412:icmpge          435
		{
			al1[i1] = awg1.h();
	//  171  415:aload           5
	//  172  417:iload_3         
	//  173  418:aload_1         
	//  174  419:invokevirtual   #132 <Method long awg.h()>
	//  175  422:lastore         
			awg1.a();
	//  176  423:aload_1         
	//  177  424:invokevirtual   #98  <Method int awg.a()>
	//  178  427:pop             
		}

	//  179  428:iload_3         
	//  180  429:iconst_1        
	//  181  430:iadd            
	//  182  431:istore_3        
	//* 183  432:goto            406
		al1[i1] = awg1.h();
	//  184  435:aload           5
	//  185  437:iload_3         
	//  186  438:aload_1         
	//  187  439:invokevirtual   #132 <Method long awg.h()>
	//  188  442:lastore         
		b = al1;
	//  189  443:aload_0         
	//  190  444:aload           5
	//  191  446:putfield        #42  <Field long[] b>
		  goto _L15
	//* 192  449:goto            0
_L7:
		if(h == null)
	//* 193  452:aload_0         
	//* 194  453:getfield        #37  <Field bvj h>
	//* 195  456:ifnonnull       470
			h = new bvj();
	//  196  459:aload_0         
	//  197  460:new             #148 <Class bvj>
	//  198  463:dup             
	//  199  464:invokespecial   #149 <Method void bvj()>
	//  200  467:putfield        #37  <Field bvj h>
		awg1.a(((awp) (h)));
	//  201  470:aload_1         
	//  202  471:aload_0         
	//  203  472:getfield        #37  <Field bvj h>
	//  204  475:invokevirtual   #107 <Method void awg.a(awp)>
		  goto _L15
	//* 205  478:goto            0
_L6:
		int j1 = awg1.j();
	//  206  481:aload_1         
	//  207  482:invokevirtual   #127 <Method int awg.j()>
	//  208  485:istore_3        
		int l1 = awg1.g();
	//  209  486:aload_1         
	//  210  487:invokevirtual   #123 <Method int awg.g()>
	//  211  490:istore          4
		if(l1 != 1000)
	//* 212  492:iload           4
	//* 213  494:sipush          1000
	//* 214  497:icmpeq          539
			switch(l1)
	//* 215  500:iload           4
			{
	//* 216  502:tableswitch     0 1: default 524
	//	               0 539
	//	               1 539
			default:
				awg1.e(j1);
	//  217  524:aload_1         
	//  218  525:iload_3         
	//  219  526:invokevirtual   #135 <Method void awg.e(int)>
				((awj)this).a(awg1, k);
	//  220  529:aload_0         
	//  221  530:aload_1         
	//  222  531:iload_2         
	//  223  532:invokevirtual   #101 <Method boolean awj.a(awg, int)>
	//  224  535:pop             
				continue; /* Loop/switch isn't completed */
	//  225  536:goto            0

			case 0: // '\0'
			case 1: // '\001'
				break;
			}
		g = buv.a(l1);
	//  226  539:aload_0         
	//  227  540:iload           4
	//  228  542:invokestatic    #152 <Method buv buv.a(int)>
	//  229  545:putfield        #35  <Field buv g>
		continue; /* Loop/switch isn't completed */
	//  230  548:goto            0
_L5:
		f = Integer.valueOf(awg1.g());
	//  231  551:aload_0         
	//  232  552:aload_1         
	//  233  553:invokevirtual   #123 <Method int awg.g()>
	//  234  556:invokestatic    #156 <Method Integer Integer.valueOf(int)>
	//  235  559:putfield        #33  <Field Integer f>
		continue; /* Loop/switch isn't completed */
	//  236  562:goto            0
_L4:
		a = awg1.e();
	//  237  565:aload_0         
	//  238  566:aload_1         
	//  239  567:invokevirtual   #159 <Method String awg.e()>
	//  240  570:putfield        #31  <Field String a>
		continue; /* Loop/switch isn't completed */
	//  241  573:goto            0
_L3:
		e = Integer.valueOf(awg1.g());
	//  242  576:aload_0         
	//  243  577:aload_1         
	//  244  578:invokevirtual   #123 <Method int awg.g()>
	//  245  581:invokestatic    #156 <Method Integer Integer.valueOf(int)>
	//  246  584:putfield        #29  <Field Integer e>
		continue; /* Loop/switch isn't completed */
	//  247  587:goto            0
_L2:
		return ((awp) (this));
	//  248  590:aload_0         
	//  249  591:areturn         
		if(true) goto _L15; else goto _L16
_L16:
	}

	public final void a(awh awh1)
	{
		Object obj = ((Object) (e));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Integer e>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          22
			awh1.a(9, ((Integer) (obj)).intValue());
	//    5   11:aload_1         
	//    6   12:bipush          9
	//    7   14:aload           4
	//    8   16:invokevirtual   #67  <Method int Integer.intValue()>
	//    9   19:invokevirtual   #163 <Method void awh.a(int, int)>
		obj = ((Object) (a));
	//   10   22:aload_0         
	//   11   23:getfield        #31  <Field String a>
	//   12   26:astore          4
		if(obj != null)
	//*  13   28:aload           4
	//*  14   30:ifnull          41
			awh1.a(10, ((String) (obj)));
	//   15   33:aload_1         
	//   16   34:bipush          10
	//   17   36:aload           4
	//   18   38:invokevirtual   #166 <Method void awh.a(int, String)>
		obj = ((Object) (f));
	//   19   41:aload_0         
	//   20   42:getfield        #33  <Field Integer f>
	//   21   45:astore          4
		int k = 0;
	//   22   47:iconst_0        
	//   23   48:istore_2        
		if(obj != null)
	//*  24   49:aload           4
	//*  25   51:ifnull          72
		{
			int l = ((Integer) (obj)).intValue();
	//   26   54:aload           4
	//   27   56:invokevirtual   #67  <Method int Integer.intValue()>
	//   28   59:istore_3        
			awh1.c(11, 0);
	//   29   60:aload_1         
	//   30   61:bipush          11
	//   31   63:iconst_0        
	//   32   64:invokevirtual   #168 <Method void awh.c(int, int)>
			awh1.c(l);
	//   33   67:aload_1         
	//   34   68:iload_3         
	//   35   69:invokevirtual   #170 <Method void awh.c(int)>
		}
		obj = ((Object) (g));
	//   36   72:aload_0         
	//   37   73:getfield        #35  <Field buv g>
	//   38   76:astore          4
		if(obj != null && obj != null)
	//*  39   78:aload           4
	//*  40   80:ifnull          99
	//*  41   83:aload           4
	//*  42   85:ifnull          99
			awh1.a(12, ((buv) (obj)).a());
	//   43   88:aload_1         
	//   44   89:bipush          12
	//   45   91:aload           4
	//   46   93:invokevirtual   #83  <Method int buv.a()>
	//   47   96:invokevirtual   #163 <Method void awh.a(int, int)>
		obj = ((Object) (h));
	//   48   99:aload_0         
	//   49  100:getfield        #37  <Field bvj h>
	//   50  103:astore          4
		if(obj != null)
	//*  51  105:aload           4
	//*  52  107:ifnull          118
			awh1.a(13, ((awp) (obj)));
	//   53  110:aload_1         
	//   54  111:bipush          13
	//   55  113:aload           4
	//   56  115:invokevirtual   #173 <Method void awh.a(int, awp)>
		long al[] = b;
	//   57  118:aload_0         
	//   58  119:getfield        #42  <Field long[] b>
	//   59  122:astore          4
		if(al != null && al.length > 0)
	//*  60  124:aload           4
	//*  61  126:ifnull          165
	//*  62  129:aload           4
	//*  63  131:arraylength     
	//*  64  132:ifle            165
			do
			{
				long al1[] = b;
	//   65  135:aload_0         
	//   66  136:getfield        #42  <Field long[] b>
	//   67  139:astore          4
				if(k >= al1.length)
					break;
	//   68  141:iload_2         
	//   69  142:aload           4
	//   70  144:arraylength     
	//   71  145:icmpge          165
				awh1.a(14, al1[k]);
	//   72  148:aload_1         
	//   73  149:bipush          14
	//   74  151:aload           4
	//   75  153:iload_2         
	//   76  154:laload          
	//   77  155:invokevirtual   #176 <Method void awh.a(int, long)>
				k++;
	//   78  158:iload_2         
	//   79  159:iconst_1        
	//   80  160:iadd            
	//   81  161:istore_2        
			} while(true);
	//   82  162:goto            135
		al1 = ((long []) (c));
	//   83  165:aload_0         
	//   84  166:getfield        #44  <Field bvg c>
	//   85  169:astore          4
		if(al1 != null)
	//*  86  171:aload           4
	//*  87  173:ifnull          184
			awh1.a(15, ((awp) (al1)));
	//   88  176:aload_1         
	//   89  177:bipush          15
	//   90  179:aload           4
	//   91  181:invokevirtual   #173 <Method void awh.a(int, awp)>
		al1 = ((long []) (i));
	//   92  184:aload_0         
	//   93  185:getfield        #46  <Field bvh i>
	//   94  188:astore          4
		if(al1 != null)
	//*  95  190:aload           4
	//*  96  192:ifnull          203
			awh1.a(16, ((awp) (al1)));
	//   97  195:aload_1         
	//   98  196:bipush          16
	//   99  198:aload           4
	//  100  200:invokevirtual   #173 <Method void awh.a(int, awp)>
		al1 = ((long []) (j));
	//  101  203:aload_0         
	//  102  204:getfield        #48  <Field bti j>
	//  103  207:astore          4
		if(al1 != null)
	//* 104  209:aload           4
	//* 105  211:ifnull          222
			awh1.a(17, ((atv) (al1)));
	//  106  214:aload_1         
	//  107  215:bipush          17
	//  108  217:aload           4
	//  109  219:invokevirtual   #179 <Method void awh.a(int, atv)>
		al1 = ((long []) (d));
	//  110  222:aload_0         
	//  111  223:getfield        #50  <Field bve d>
	//  112  226:astore          4
		if(al1 != null)
	//* 113  228:aload           4
	//* 114  230:ifnull          241
			awh1.a(18, ((awp) (al1)));
	//  115  233:aload_1         
	//  116  234:bipush          18
	//  117  236:aload           4
	//  118  238:invokevirtual   #173 <Method void awh.a(int, awp)>
		super.a(awh1);
	//  119  241:aload_0         
	//  120  242:aload_1         
	//  121  243:invokespecial   #181 <Method void awj.a(awh)>
	//  122  246:return          
	}

	public String a;
	public long b[];
	public bvg c;
	public bve d;
	private Integer e;
	private Integer f;
	private buv g;
	private bvj h;
	private bvh i;
	private bti j;
}
