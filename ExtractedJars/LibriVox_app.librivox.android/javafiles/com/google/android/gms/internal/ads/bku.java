// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bke, bky, bmc, bkw, 
//			ble, blc, bkx, bnb, 
//			bkb, bjt, bkt, bfj, 
//			bkc, bld, bmp, bjw, 
//			bnw, bil, bkd, bka, 
//			bmu, bjs, bml

public final class bku
	implements bke
{

	public bku(bnb bnb1, bky bky1, int i1, int ai[], bmc bmc1, int j1, bml bml, 
			long l1, int k1, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		a = bnb1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field bnb a>
		i = bky1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field bky i>
		b = ai;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #39  <Field int[] b>
		c = bmc1;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #41  <Field bmc c>
		d = j1;
	//   14   26:aload_0         
	//   15   27:iload           6
	//   16   29:putfield        #43  <Field int d>
		f = bml;
	//   17   32:aload_0         
	//   18   33:aload           7
	//   19   35:putfield        #45  <Field bml f>
		j = i1;
	//   20   38:aload_0         
	//   21   39:iload_3         
	//   22   40:putfield        #47  <Field int j>
		g = l1;
	//   23   43:aload_0         
	//   24   44:lload           8
	//   25   46:putfield        #49  <Field long g>
		h = k1;
	//   26   49:aload_0         
	//   27   50:iload           10
	//   28   52:putfield        #51  <Field int h>
		l1 = bky1.b(i1);
	//   29   55:aload_2         
	//   30   56:iload_3         
	//   31   57:invokevirtual   #56  <Method long bky.b(int)>
	//   32   60:lstore          8
		bnb1 = ((bnb) (b()));
	//   33   62:aload_0         
	//   34   63:invokespecial   #59  <Method ArrayList b()>
	//   35   66:astore_1        
		e = new bkw[bmc1.b()];
	//   36   67:aload_0         
	//   37   68:aload           5
	//   38   70:invokeinterface #64  <Method int bmc.b()>
	//   39   75:anewarray       bkw[]
	//   40   78:putfield        #68  <Field bkw[] e>
		for(i1 = 0; i1 < e.length; i1++)
	//*  41   81:iconst_0        
	//*  42   82:istore_3        
	//*  43   83:iload_3         
	//*  44   84:aload_0         
	//*  45   85:getfield        #68  <Field bkw[] e>
	//*  46   88:arraylength     
	//*  47   89:icmpge          137
		{
			bky1 = ((bky) ((ble)((List) (bnb1)).get(bmc1.b(i1))));
	//   48   92:aload_1         
	//   49   93:aload           5
	//   50   95:iload_3         
	//   51   96:invokeinterface #71  <Method int bmc.b(int)>
	//   52  101:invokeinterface #77  <Method Object List.get(int)>
	//   53  106:checkcast       #79  <Class ble>
	//   54  109:astore_2        
			e[i1] = new bkw(l1, ((ble) (bky1)), flag, flag1);
	//   55  110:aload_0         
	//   56  111:getfield        #68  <Field bkw[] e>
	//   57  114:iload_3         
	//   58  115:new             #66  <Class bkw>
	//   59  118:dup             
	//   60  119:lload           8
	//   61  121:aload_2         
	//   62  122:iload           11
	//   63  124:iload           12
	//   64  126:invokespecial   #82  <Method void bkw(long, ble, boolean, boolean)>
	//   65  129:aastore         
		}

	//   66  130:iload_3         
	//   67  131:iconst_1        
	//   68  132:iadd            
	//   69  133:istore_3        
	//*  70  134:goto            83
	//   71  137:return          
	}

	private final ArrayList b()
	{
		List list = i.a(j).c;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field bky i>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field int j>
	//    4    8:invokevirtual   #86  <Method blc bky.a(int)>
	//    5   11:getfield        #91  <Field List blc.c>
	//    6   14:astore_3        
		ArrayList arraylist = new ArrayList();
	//    7   15:new             #93  <Class ArrayList>
	//    8   18:dup             
	//    9   19:invokespecial   #94  <Method void ArrayList()>
	//   10   22:astore          4
		int ai[] = b;
	//   11   24:aload_0         
	//   12   25:getfield        #39  <Field int[] b>
	//   13   28:astore          5
		int j1 = ai.length;
	//   14   30:aload           5
	//   15   32:arraylength     
	//   16   33:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*  17   34:iconst_0        
	//*  18   35:istore_1        
	//*  19   36:iload_1         
	//*  20   37:iload_2         
	//*  21   38:icmpge          70
			arraylist.addAll(((java.util.Collection) (((bkx)list.get(ai[i1])).c)));
	//   22   41:aload           4
	//   23   43:aload_3         
	//   24   44:aload           5
	//   25   46:iload_1         
	//   26   47:iaload          
	//   27   48:invokeinterface #77  <Method Object List.get(int)>
	//   28   53:checkcast       #96  <Class bkx>
	//   29   56:getfield        #97  <Field List bkx.c>
	//   30   59:invokevirtual   #101 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   31   62:pop             

	//   32   63:iload_1         
	//   33   64:iconst_1        
	//   34   65:iadd            
	//   35   66:istore_1        
	//*  36   67:goto            36
		return arraylist;
	//   37   70:aload           4
	//   38   72:areturn         
	}

	public final void a()
	{
		IOException ioexception = k;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field IOException k>
	//    2    4:astore_1        
		if(ioexception == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       19
		{
			a.c();
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field bnb a>
	//    7   13:invokeinterface #107 <Method void bnb.c()>
			return;
	//    8   18:return          
		} else
		{
			throw ioexception;
	//    9   19:aload_1         
	//   10   20:athrow          
		}
	}

	public final void a(bjs bjs1)
	{
		if(bjs1 instanceof bkb)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #110 <Class bkb>
	//*   2    4:ifeq            65
		{
			bjs1 = ((bjs) ((bkb)bjs1));
	//    3    7:aload_1         
	//    4    8:checkcast       #110 <Class bkb>
	//    5   11:astore_1        
			bjs1 = ((bjs) (e[c.a(((bkb) (bjs1)).c)]));
	//    6   12:aload_0         
	//    7   13:getfield        #68  <Field bkw[] e>
	//    8   16:aload_0         
	//    9   17:getfield        #41  <Field bmc c>
	//   10   20:aload_1         
	//   11   21:getfield        #113 <Field zzfs bkb.c>
	//   12   24:invokeinterface #116 <Method int bmc.a(zzfs)>
	//   13   29:aaload          
	//   14   30:astore_1        
			if(((bkw) (bjs1)).c == null)
	//*  15   31:aload_1         
	//*  16   32:getfield        #119 <Field bks bkw.c>
	//*  17   35:ifnonnull       65
			{
				bfu bfu = ((bkw) (bjs1)).a.b();
	//   18   38:aload_1         
	//   19   39:getfield        #122 <Field bjt bkw.a>
	//   20   42:invokevirtual   #127 <Method bfu bjt.b()>
	//   21   45:astore_2        
				if(bfu != null)
	//*  22   46:aload_2         
	//*  23   47:ifnull          65
					bjs1.c = ((bks) (new bkt((bfj)bfu)));
	//   24   50:aload_1         
	//   25   51:new             #129 <Class bkt>
	//   26   54:dup             
	//   27   55:aload_2         
	//   28   56:checkcast       #131 <Class bfj>
	//   29   59:invokespecial   #134 <Method void bkt(bfj)>
	//   30   62:putfield        #119 <Field bks bkw.c>
			}
		}
	//   31   65:return          
	}

	public final void a(bkc bkc1, long l1, bjw bjw1)
	{
		Object obj = ((Object) (this));
	//    0    0:aload_0         
	//    1    1:astore          16
		if(((bku) (obj)).k != null)
	//*   2    3:aload           16
	//*   3    5:getfield        #103 <Field IOException k>
	//*   4    8:ifnull          12
			return;
	//    5   11:return          
		long l4;
		if(bkc1 != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          27
			l4 = bkc1.g - l1;
	//    8   16:aload_1         
	//    9   17:getfield        #138 <Field long bkc.g>
	//   10   20:lload_2         
	//   11   21:lsub            
	//   12   22:lstore          10
		else
	//*  13   24:goto            30
			l4 = 0L;
	//   14   27:lconst_0        
	//   15   28:lstore          10
		((bku) (obj)).c.a(l4);
	//   16   30:aload           16
	//   17   32:getfield        #41  <Field bmc c>
	//   18   35:lload           10
	//   19   37:invokeinterface #141 <Method void bmc.a(long)>
		bkw bkw1 = ((bku) (obj)).e[((bku) (obj)).c.d()];
	//   20   42:aload           16
	//   21   44:getfield        #68  <Field bkw[] e>
	//   22   47:aload           16
	//   23   49:getfield        #41  <Field bmc c>
	//   24   52:invokeinterface #143 <Method int bmc.d()>
	//   25   57:aaload          
	//   26   58:astore          17
		if(bkw1.a != null)
	//*  27   60:aload           17
	//*  28   62:getfield        #122 <Field bjt bkw.a>
	//*  29   65:ifnull          272
		{
			ble ble1 = bkw1.b;
	//   30   68:aload           17
	//   31   70:getfield        #146 <Field ble bkw.b>
	//   32   73:astore          18
			zzfs azzfs[] = bkw1.a.c();
	//   33   75:aload           17
	//   34   77:getfield        #122 <Field bjt bkw.a>
	//   35   80:invokevirtual   #149 <Method zzfs[] bjt.c()>
	//   36   83:astore          14
			bld bld3 = null;
	//   37   85:aconst_null     
	//   38   86:astore          15
			bld bld1;
			if(azzfs == null)
	//*  39   88:aload           14
	//*  40   90:ifnonnull       103
				bld1 = ble1.c();
	//   41   93:aload           18
	//   42   95:invokevirtual   #152 <Method bld ble.c()>
	//   43   98:astore          14
			else
	//*  44  100:goto            106
				bld1 = null;
	//   45  103:aconst_null     
	//   46  104:astore          14
			if(bkw1.c == null)
	//*  47  106:aload           17
	//*  48  108:getfield        #119 <Field bks bkw.c>
	//*  49  111:ifnonnull       121
				bld3 = ble1.d();
	//   50  114:aload           18
	//   51  116:invokevirtual   #154 <Method bld ble.d()>
	//   52  119:astore          15
			if(bld1 != null || bld3 != null)
	//*  53  121:aload           14
	//*  54  123:ifnonnull       131
	//*  55  126:aload           15
	//*  56  128:ifnull          272
			{
				bml bml1 = ((bku) (obj)).f;
	//   57  131:aload           16
	//   58  133:getfield        #45  <Field bml f>
	//   59  136:astore          18
				zzfs zzfs1 = ((bku) (obj)).c.c();
	//   60  138:aload           16
	//   61  140:getfield        #41  <Field bmc c>
	//   62  143:invokeinterface #157 <Method zzfs bmc.c()>
	//   63  148:astore          19
				int i1 = ((bku) (obj)).c.e();
	//   64  150:aload           16
	//   65  152:getfield        #41  <Field bmc c>
	//   66  155:invokeinterface #159 <Method int bmc.e()>
	//   67  160:istore          5
				obj = ((bku) (obj)).c.f();
	//   68  162:aload           16
	//   69  164:getfield        #41  <Field bmc c>
	//   70  167:invokeinterface #162 <Method Object bmc.f()>
	//   71  172:astore          16
				String s = bkw1.b.b;
	//   72  174:aload           17
	//   73  176:getfield        #146 <Field ble bkw.b>
	//   74  179:getfield        #165 <Field String ble.b>
	//   75  182:astore          20
				if(bld1 != null)
	//*  76  184:aload           14
	//*  77  186:ifnull          214
				{
					bld3 = bld1.a(bld3, s);
	//   78  189:aload           14
	//   79  191:aload           15
	//   80  193:aload           20
	//   81  195:invokevirtual   #170 <Method bld bld.a(bld, String)>
	//   82  198:astore          15
					bkc1 = ((bkc) (bld3));
	//   83  200:aload           15
	//   84  202:astore_1        
					if(bld3 == null)
	//*  85  203:aload           15
	//*  86  205:ifnonnull       217
						bkc1 = ((bkc) (bld1));
	//   87  208:aload           14
	//   88  210:astore_1        
				} else
	//*  89  211:goto            217
				{
					bkc1 = ((bkc) (bld3));
	//   90  214:aload           15
	//   91  216:astore_1        
				}
				bjw1.a = ((bjs) (new bkb(bml1, new bmp(((bld) (bkc1)).a(s), ((bld) (bkc1)).a, ((bld) (bkc1)).b, bkw1.b.f()), zzfs1, i1, obj, bkw1.a)));
	//   92  217:aload           4
	//   93  219:new             #110 <Class bkb>
	//   94  222:dup             
	//   95  223:aload           18
	//   96  225:new             #172 <Class bmp>
	//   97  228:dup             
	//   98  229:aload_1         
	//   99  230:aload           20
	//  100  232:invokevirtual   #175 <Method android.net.Uri bld.a(String)>
	//  101  235:aload_1         
	//  102  236:getfield        #177 <Field long bld.a>
	//  103  239:aload_1         
	//  104  240:getfield        #179 <Field long bld.b>
	//  105  243:aload           17
	//  106  245:getfield        #146 <Field ble bkw.b>
	//  107  248:invokevirtual   #182 <Method String ble.f()>
	//  108  251:invokespecial   #185 <Method void bmp(android.net.Uri, long, long, String)>
	//  109  254:aload           19
	//  110  256:iload           5
	//  111  258:aload           16
	//  112  260:aload           17
	//  113  262:getfield        #122 <Field bjt bkw.a>
	//  114  265:invokespecial   #188 <Method void bkb(bml, bmp, zzfs, int, Object, bjt)>
	//  115  268:putfield        #193 <Field bjs bjw.a>
				return;
	//  116  271:return          
			}
		}
		if(((bku) (obj)).g != 0L)
	//* 117  272:aload           16
	//* 118  274:getfield        #49  <Field long g>
	//* 119  277:lconst_0        
	//* 120  278:lcmp            
	//* 121  279:ifeq            300
			l4 = (SystemClock.elapsedRealtime() + ((bku) (obj)).g) * 1000L;
	//  122  282:invokestatic    #199 <Method long SystemClock.elapsedRealtime()>
	//  123  285:aload           16
	//  124  287:getfield        #49  <Field long g>
	//  125  290:ladd            
	//  126  291:ldc2w           #200 <Long 1000L>
	//  127  294:lmul            
	//  128  295:lstore          10
		else
	//* 129  297:goto            309
			l4 = System.currentTimeMillis() * 1000L;
	//  130  300:invokestatic    #206 <Method long System.currentTimeMillis()>
	//  131  303:ldc2w           #200 <Long 1000L>
	//  132  306:lmul            
	//  133  307:lstore          10
		int j1 = bkw1.b();
	//  134  309:aload           17
	//  135  311:invokevirtual   #207 <Method int bkw.b()>
	//  136  314:istore          5
		boolean flag2 = true;
	//  137  316:iconst_1        
	//  138  317:istore          13
		if(j1 == 0)
	//* 139  319:iload           5
	//* 140  321:ifne            375
		{
			boolean flag = flag2;
	//  141  324:iload           13
	//  142  326:istore          12
			if(((bku) (obj)).i.b)
	//* 143  328:aload           16
	//* 144  330:getfield        #37  <Field bky i>
	//* 145  333:getfield        #209 <Field boolean bky.b>
	//* 146  336:ifeq            367
				if(((bku) (obj)).j < ((bku) (obj)).i.a() - 1)
	//* 147  339:aload           16
	//* 148  341:getfield        #47  <Field int j>
	//* 149  344:aload           16
	//* 150  346:getfield        #37  <Field bky i>
	//* 151  349:invokevirtual   #211 <Method int bky.a()>
	//* 152  352:iconst_1        
	//* 153  353:isub            
	//* 154  354:icmpge          364
					flag = flag2;
	//  155  357:iload           13
	//  156  359:istore          12
				else
	//* 157  361:goto            367
					flag = false;
	//  158  364:iconst_0        
	//  159  365:istore          12
			bjw1.b = flag;
	//  160  367:aload           4
	//  161  369:iload           12
	//  162  371:putfield        #212 <Field boolean bjw.b>
			return;
	//  163  374:return          
		}
		int i2 = bkw1.a();
	//  164  375:aload           17
	//  165  377:invokevirtual   #213 <Method int bkw.a()>
	//  166  380:istore          6
		if(j1 == -1)
	//* 167  382:iload           5
	//* 168  384:iconst_m1       
	//* 169  385:icmpne          486
		{
			l4 = l4 - ((bku) (obj)).i.a * 1000L - ((bku) (obj)).i.a(((bku) (obj)).j).b * 1000L;
	//  170  388:lload           10
	//  171  390:aload           16
	//  172  392:getfield        #37  <Field bky i>
	//  173  395:getfield        #214 <Field long bky.a>
	//  174  398:ldc2w           #200 <Long 1000L>
	//  175  401:lmul            
	//  176  402:lsub            
	//  177  403:aload           16
	//  178  405:getfield        #37  <Field bky i>
	//  179  408:aload           16
	//  180  410:getfield        #47  <Field int j>
	//  181  413:invokevirtual   #86  <Method blc bky.a(int)>
	//  182  416:getfield        #215 <Field long blc.b>
	//  183  419:ldc2w           #200 <Long 1000L>
	//  184  422:lmul            
	//  185  423:lsub            
	//  186  424:lstore          10
			j1 = i2;
	//  187  426:iload           6
	//  188  428:istore          5
			if(((bku) (obj)).i.d != 0x1L)
	//* 189  430:aload           16
	//* 190  432:getfield        #37  <Field bky i>
	//* 191  435:getfield        #217 <Field long bky.d>
	//* 192  438:ldc2w           #218 <Long 0x1L>
	//* 193  441:lcmp            
	//* 194  442:ifeq            472
				j1 = Math.max(i2, bkw1.a(l4 - ((bku) (obj)).i.d * 1000L));
	//  195  445:iload           6
	//  196  447:aload           17
	//  197  449:lload           10
	//  198  451:aload           16
	//  199  453:getfield        #37  <Field bky i>
	//  200  456:getfield        #217 <Field long bky.d>
	//  201  459:ldc2w           #200 <Long 1000L>
	//  202  462:lmul            
	//  203  463:lsub            
	//  204  464:invokevirtual   #222 <Method int bkw.a(long)>
	//  205  467:invokestatic    #228 <Method int Math.max(int, int)>
	//  206  470:istore          5
			i2 = bkw1.a(l4) - 1;
	//  207  472:aload           17
	//  208  474:lload           10
	//  209  476:invokevirtual   #222 <Method int bkw.a(long)>
	//  210  479:iconst_1        
	//  211  480:isub            
	//  212  481:istore          6
		} else
	//* 213  483:goto            503
		{
			int l2 = (j1 + i2) - 1;
	//  214  486:iload           5
	//  215  488:iload           6
	//  216  490:iadd            
	//  217  491:iconst_1        
	//  218  492:isub            
	//  219  493:istore          7
			j1 = i2;
	//  220  495:iload           6
	//  221  497:istore          5
			i2 = l2;
	//  222  499:iload           7
	//  223  501:istore          6
		}
		if(bkc1 == null)
	//* 224  503:aload_1         
	//* 225  504:ifnonnull       525
		{
			j1 = bnw.a(bkw1.a(l1), j1, i2);
	//  226  507:aload           17
	//  227  509:lload_2         
	//  228  510:invokevirtual   #222 <Method int bkw.a(long)>
	//  229  513:iload           5
	//  230  515:iload           6
	//  231  517:invokestatic    #233 <Method int bnw.a(int, int, int)>
	//  232  520:istore          5
		} else
	//* 233  522:goto            555
		{
			int i3 = bkc1.f();
	//  234  525:aload_1         
	//  235  526:invokevirtual   #235 <Method int bkc.f()>
	//  236  529:istore          7
			if(i3 < j1)
	//* 237  531:iload           7
	//* 238  533:iload           5
	//* 239  535:icmpge          551
			{
				obj.k = ((IOException) (new bil()));
	//  240  538:aload           16
	//  241  540:new             #237 <Class bil>
	//  242  543:dup             
	//  243  544:invokespecial   #238 <Method void bil()>
	//  244  547:putfield        #103 <Field IOException k>
				return;
	//  245  550:return          
			}
			j1 = i3;
	//  246  551:iload           7
	//  247  553:istore          5
		}
		if(j1 <= i2 && (!((bku) (obj)).l || j1 < i2))
	//* 248  555:iload           5
	//* 249  557:iload           6
	//* 250  559:icmpgt          883
	//* 251  562:aload           16
	//* 252  564:getfield        #240 <Field boolean l>
	//* 253  567:ifeq            580
	//* 254  570:iload           5
	//* 255  572:iload           6
	//* 256  574:icmplt          580
	//* 257  577:goto            883
		{
			int k3 = Math.min(((bku) (obj)).h, (i2 - j1) + 1);
	//  258  580:aload           16
	//  259  582:getfield        #51  <Field int h>
	//  260  585:iload           6
	//  261  587:iload           5
	//  262  589:isub            
	//  263  590:iconst_1        
	//  264  591:iadd            
	//  265  592:invokestatic    #243 <Method int Math.min(int, int)>
	//  266  595:istore          8
			bml bml = ((bku) (obj)).f;
	//  267  597:aload           16
	//  268  599:getfield        #45  <Field bml f>
	//  269  602:astore          15
			i2 = ((bku) (obj)).d;
	//  270  604:aload           16
	//  271  606:getfield        #43  <Field int d>
	//  272  609:istore          6
			zzfs zzfs = ((bku) (obj)).c.c();
	//  273  611:aload           16
	//  274  613:getfield        #41  <Field bmc c>
	//  275  616:invokeinterface #157 <Method zzfs bmc.c()>
	//  276  621:astore          18
			int l3 = ((bku) (obj)).c.e();
	//  277  623:aload           16
	//  278  625:getfield        #41  <Field bmc c>
	//  279  628:invokeinterface #159 <Method int bmc.e()>
	//  280  633:istore          9
			obj = ((bku) (obj)).c.f();
	//  281  635:aload           16
	//  282  637:getfield        #41  <Field bmc c>
	//  283  640:invokeinterface #162 <Method Object bmc.f()>
	//  284  645:astore          16
			ble ble2 = bkw1.b;
	//  285  647:aload           17
	//  286  649:getfield        #146 <Field ble bkw.b>
	//  287  652:astore          19
			l1 = bkw1.a(j1);
	//  288  654:aload           17
	//  289  656:iload           5
	//  290  658:invokevirtual   #245 <Method long bkw.a(int)>
	//  291  661:lstore_2        
			bkc1 = ((bkc) (bkw1.c(j1)));
	//  292  662:aload           17
	//  293  664:iload           5
	//  294  666:invokevirtual   #248 <Method bld bkw.c(int)>
	//  295  669:astore_1        
			String s1 = ble2.b;
	//  296  670:aload           19
	//  297  672:getfield        #165 <Field String ble.b>
	//  298  675:astore          20
			if(bkw1.a == null)
	//* 299  677:aload           17
	//* 300  679:getfield        #122 <Field bjt bkw.a>
	//* 301  682:ifnonnull       748
			{
				long l5 = bkw1.b(j1);
	//  302  685:aload           17
	//  303  687:iload           5
	//  304  689:invokevirtual   #249 <Method long bkw.b(int)>
	//  305  692:lstore          10
				bkc1 = ((bkc) (new bkd(bml, new bmp(((bld) (bkc1)).a(s1), ((bld) (bkc1)).a, ((bld) (bkc1)).b, ble2.f()), zzfs, l3, obj, l1, l5, j1, i2, zzfs)));
	//  306  694:new             #251 <Class bkd>
	//  307  697:dup             
	//  308  698:aload           15
	//  309  700:new             #172 <Class bmp>
	//  310  703:dup             
	//  311  704:aload_1         
	//  312  705:aload           20
	//  313  707:invokevirtual   #175 <Method android.net.Uri bld.a(String)>
	//  314  710:aload_1         
	//  315  711:getfield        #177 <Field long bld.a>
	//  316  714:aload_1         
	//  317  715:getfield        #179 <Field long bld.b>
	//  318  718:aload           19
	//  319  720:invokevirtual   #182 <Method String ble.f()>
	//  320  723:invokespecial   #185 <Method void bmp(android.net.Uri, long, long, String)>
	//  321  726:aload           18
	//  322  728:iload           9
	//  323  730:aload           16
	//  324  732:lload_2         
	//  325  733:lload           10
	//  326  735:iload           5
	//  327  737:iload           6
	//  328  739:aload           18
	//  329  741:invokespecial   #254 <Method void bkd(bml, bmp, zzfs, int, Object, long, long, int, int, zzfs)>
	//  330  744:astore_1        
			} else
	//* 331  745:goto            876
			{
				int j2 = 1;
	//  332  748:iconst_1        
	//  333  749:istore          6
				int j3 = 1;
	//  334  751:iconst_1        
	//  335  752:istore          7
				do
				{
					if(j2 >= k3)
						break;
	//  336  754:iload           6
	//  337  756:iload           8
	//  338  758:icmpge          802
					bld bld2 = ((bld) (bkc1)).a(bkw1.c(j1 + j2), s1);
	//  339  761:aload_1         
	//  340  762:aload           17
	//  341  764:iload           5
	//  342  766:iload           6
	//  343  768:iadd            
	//  344  769:invokevirtual   #248 <Method bld bkw.c(int)>
	//  345  772:aload           20
	//  346  774:invokevirtual   #170 <Method bld bld.a(bld, String)>
	//  347  777:astore          14
					if(bld2 == null)
						break;
	//  348  779:aload           14
	//  349  781:ifnull          802
					j3++;
	//  350  784:iload           7
	//  351  786:iconst_1        
	//  352  787:iadd            
	//  353  788:istore          7
					j2++;
	//  354  790:iload           6
	//  355  792:iconst_1        
	//  356  793:iadd            
	//  357  794:istore          6
					bkc1 = ((bkc) (bld2));
	//  358  796:aload           14
	//  359  798:astore_1        
				} while(true);
	//  360  799:goto            754
				long l6 = bkw1.b((j1 + j3) - 1);
	//  361  802:aload           17
	//  362  804:iload           5
	//  363  806:iload           7
	//  364  808:iadd            
	//  365  809:iconst_1        
	//  366  810:isub            
	//  367  811:invokevirtual   #249 <Method long bkw.b(int)>
	//  368  814:lstore          10
				bkc1 = ((bkc) (new bka(bml, new bmp(((bld) (bkc1)).a(s1), ((bld) (bkc1)).a, ((bld) (bkc1)).b, ble2.f()), zzfs, l3, obj, l1, l6, j1, j3, -ble2.c, bkw1.a)));
	//  369  816:new             #256 <Class bka>
	//  370  819:dup             
	//  371  820:aload           15
	//  372  822:new             #172 <Class bmp>
	//  373  825:dup             
	//  374  826:aload_1         
	//  375  827:aload           20
	//  376  829:invokevirtual   #175 <Method android.net.Uri bld.a(String)>
	//  377  832:aload_1         
	//  378  833:getfield        #177 <Field long bld.a>
	//  379  836:aload_1         
	//  380  837:getfield        #179 <Field long bld.b>
	//  381  840:aload           19
	//  382  842:invokevirtual   #182 <Method String ble.f()>
	//  383  845:invokespecial   #185 <Method void bmp(android.net.Uri, long, long, String)>
	//  384  848:aload           18
	//  385  850:iload           9
	//  386  852:aload           16
	//  387  854:lload_2         
	//  388  855:lload           10
	//  389  857:iload           5
	//  390  859:iload           7
	//  391  861:aload           19
	//  392  863:getfield        #258 <Field long ble.c>
	//  393  866:lneg            
	//  394  867:aload           17
	//  395  869:getfield        #122 <Field bjt bkw.a>
	//  396  872:invokespecial   #261 <Method void bka(bml, bmp, zzfs, int, Object, long, long, int, int, long, bjt)>
	//  397  875:astore_1        
			}
			bjw1.a = ((bjs) (bkc1));
	//  398  876:aload           4
	//  399  878:aload_1         
	//  400  879:putfield        #193 <Field bjs bjw.a>
			return;
	//  401  882:return          
		}
		bkc1 = ((bkc) (this));
	//  402  883:aload_0         
	//  403  884:astore_1        
		boolean flag1;
		if(((bku) (bkc1)).i.b)
	//* 404  885:aload_1         
	//* 405  886:getfield        #37  <Field bky i>
	//* 406  889:getfield        #209 <Field boolean bky.b>
	//* 407  892:ifeq            931
		{
			int k1 = ((bku) (bkc1)).j;
	//  408  895:aload_1         
	//  409  896:getfield        #47  <Field int j>
	//  410  899:istore          5
			int k2 = ((bku) (bkc1)).i.a();
	//  411  901:aload_1         
	//  412  902:getfield        #37  <Field bky i>
	//  413  905:invokevirtual   #211 <Method int bky.a()>
	//  414  908:istore          6
			flag1 = true;
	//  415  910:iconst_1        
	//  416  911:istore          12
			if(k1 >= k2 - 1)
	//* 417  913:iload           5
	//* 418  915:iload           6
	//* 419  917:iconst_1        
	//* 420  918:isub            
	//* 421  919:icmpge          925
	//* 422  922:goto            934
				flag1 = false;
	//  423  925:iconst_0        
	//  424  926:istore          12
		} else
	//* 425  928:goto            934
		{
			flag1 = true;
	//  426  931:iconst_1        
	//  427  932:istore          12
		}
		bjw1.b = flag1;
	//  428  934:aload           4
	//  429  936:iload           12
	//  430  938:putfield        #212 <Field boolean bjw.b>
	//  431  941:return          
	}

	public final void a(bky bky1, int i1)
	{
		long l1;
		ble ble1;
		try
		{
			i = bky1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field bky i>
			j = i1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #47  <Field int j>
			l1 = i.b(j);
	//    6   10:aload_0         
	//    7   11:getfield        #37  <Field bky i>
	//    8   14:aload_0         
	//    9   15:getfield        #47  <Field int j>
	//   10   18:invokevirtual   #56  <Method long bky.b(int)>
	//   11   21:lstore_3        
			bky1 = ((bky) (b()));
	//   12   22:aload_0         
	//   13   23:invokespecial   #59  <Method ArrayList b()>
	//   14   26:astore_1        
		}
	//*  15   27:iconst_0        
	//*  16   28:istore_2        
	//*  17   29:iload_2         
	//*  18   30:aload_0         
	//*  19   31:getfield        #68  <Field bkw[] e>
	//*  20   34:arraylength     
	//*  21   35:icmpge          78
	//*  22   38:aload_1         
	//*  23   39:aload_0         
	//*  24   40:getfield        #41  <Field bmc c>
	//*  25   43:iload_2         
	//*  26   44:invokeinterface #71  <Method int bmc.b(int)>
	//*  27   49:invokeinterface #77  <Method Object List.get(int)>
	//*  28   54:checkcast       #79  <Class ble>
	//*  29   57:astore          5
	//*  30   59:aload_0         
	//*  31   60:getfield        #68  <Field bkw[] e>
	//*  32   63:iload_2         
	//*  33   64:aaload          
	//*  34   65:lload_3         
	//*  35   66:aload           5
	//*  36   68:invokevirtual   #265 <Method void bkw.a(long, ble)>
	//*  37   71:iload_2         
	//*  38   72:iconst_1        
	//*  39   73:iadd            
	//*  40   74:istore_2        
	//*  41   75:goto            29
	//*  42   78:return          
		// Misplaced declaration of an exception variable
		catch(bky bky1)
	//*  43   79:astore_1        
		{
			k = ((IOException) (bky1));
	//   44   80:aload_0         
	//   45   81:aload_1         
	//   46   82:putfield        #103 <Field IOException k>
			return;
	//   47   85:return          
		}
		i1 = 0;
		if(i1 >= e.length)
			break; /* Loop/switch isn't completed */
		ble1 = (ble)((List) (bky1)).get(c.b(i1));
		e[i1].a(l1, ble1);
		i1++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_29;
_L1:
	}

	public final boolean a(bjs bjs1, boolean flag, Exception exception)
	{
		if(!flag)
	//*   0    0:iload_2         
	//*   1    1:ifne            6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		flag = i.b;
	//    4    6:aload_0         
	//    5    7:getfield        #37  <Field bky i>
	//    6   10:getfield        #209 <Field boolean bky.b>
	//    7   13:istore_2        
		boolean flag2 = true;
	//    8   14:iconst_1        
	//    9   15:istore          5
		if(!flag && (bjs1 instanceof bkc) && (exception instanceof bmu) && ((bmu)exception).a == 404)
	//*  10   17:iload_2         
	//*  11   18:ifne            117
	//*  12   21:aload_1         
	//*  13   22:instanceof      #137 <Class bkc>
	//*  14   25:ifeq            117
	//*  15   28:aload_3         
	//*  16   29:instanceof      #268 <Class bmu>
	//*  17   32:ifeq            117
	//*  18   35:aload_3         
	//*  19   36:checkcast       #268 <Class bmu>
	//*  20   39:getfield        #270 <Field int bmu.a>
	//*  21   42:sipush          404
	//*  22   45:icmpne          117
		{
			bkw bkw1 = e[c.a(bjs1.c)];
	//   23   48:aload_0         
	//   24   49:getfield        #68  <Field bkw[] e>
	//   25   52:aload_0         
	//   26   53:getfield        #41  <Field bmc c>
	//   27   56:aload_1         
	//   28   57:getfield        #273 <Field zzfs bjs.c>
	//   29   60:invokeinterface #116 <Method int bmc.a(zzfs)>
	//   30   65:aaload          
	//   31   66:astore          8
			int i1 = bkw1.b();
	//   32   68:aload           8
	//   33   70:invokevirtual   #207 <Method int bkw.b()>
	//   34   73:istore          4
			if(i1 != -1 && i1 != 0)
	//*  35   75:iload           4
	//*  36   77:iconst_m1       
	//*  37   78:icmpeq          117
	//*  38   81:iload           4
	//*  39   83:ifeq            117
			{
				int k1 = bkw1.a();
	//   40   86:aload           8
	//   41   88:invokevirtual   #213 <Method int bkw.a()>
	//   42   91:istore          6
				if(((bkc)bjs1).f() > (k1 + i1) - 1)
	//*  43   93:aload_1         
	//*  44   94:checkcast       #137 <Class bkc>
	//*  45   97:invokevirtual   #235 <Method int bkc.f()>
	//*  46  100:iload           6
	//*  47  102:iload           4
	//*  48  104:iadd            
	//*  49  105:iconst_1        
	//*  50  106:isub            
	//*  51  107:icmple          117
				{
					l = true;
	//   52  110:aload_0         
	//   53  111:iconst_1        
	//   54  112:putfield        #240 <Field boolean l>
					return true;
	//   55  115:iconst_1        
	//   56  116:ireturn         
				}
			}
		}
		bmc bmc1 = c;
	//   57  117:aload_0         
	//   58  118:getfield        #41  <Field bmc c>
	//   59  121:astore          8
		int l1 = bmc1.a(bjs1.c);
	//   60  123:aload           8
	//   61  125:aload_1         
	//   62  126:getfield        #273 <Field zzfs bjs.c>
	//   63  129:invokeinterface #116 <Method int bmc.a(zzfs)>
	//   64  134:istore          6
		boolean flag1;
		if(exception instanceof bmu)
	//*  65  136:aload_3         
	//*  66  137:instanceof      #268 <Class bmu>
	//*  67  140:ifeq            185
		{
			int i2 = ((bmu)exception).a;
	//   68  143:aload_3         
	//   69  144:checkcast       #268 <Class bmu>
	//   70  147:getfield        #270 <Field int bmu.a>
	//   71  150:istore          7
			flag1 = flag2;
	//   72  152:iload           5
	//   73  154:istore          4
			if(i2 != 404)
	//*  74  156:iload           7
	//*  75  158:sipush          404
	//*  76  161:icmpeq          188
				if(i2 == 410)
	//*  77  164:iload           7
	//*  78  166:sipush          410
	//*  79  169:icmpne          179
					flag1 = flag2;
	//   80  172:iload           5
	//   81  174:istore          4
				else
	//*  82  176:goto            188
					flag1 = false;
	//   83  179:iconst_0        
	//   84  180:istore          4
		} else
	//*  85  182:goto            188
		{
			flag1 = false;
	//   86  185:iconst_0        
	//   87  186:istore          4
		}
		if(flag1)
	//*  88  188:iload           4
	//*  89  190:ifeq            365
		{
			flag = bmc1.a(l1, 60000L);
	//   90  193:aload           8
	//   91  195:iload           6
	//   92  197:ldc2w           #274 <Long 60000L>
	//   93  200:invokeinterface #278 <Method boolean bmc.a(int, long)>
	//   94  205:istore_2        
			int j1 = ((bmu)exception).a;
	//   95  206:aload_3         
	//   96  207:checkcast       #268 <Class bmu>
	//   97  210:getfield        #270 <Field int bmu.a>
	//   98  213:istore          4
			if(flag)
	//*  99  215:iload_2         
	//* 100  216:ifeq            292
			{
				bjs1 = ((bjs) (String.valueOf(((Object) (bmc1.a(l1))))));
	//  101  219:aload           8
	//  102  221:iload           6
	//  103  223:invokeinterface #281 <Method zzfs bmc.a(int)>
	//  104  228:invokestatic    #287 <Method String String.valueOf(Object)>
	//  105  231:astore_1        
				exception = ((Exception) (new StringBuilder(String.valueOf(((Object) (bjs1))).length() + 77)));
	//  106  232:new             #289 <Class StringBuilder>
	//  107  235:dup             
	//  108  236:aload_1         
	//  109  237:invokestatic    #287 <Method String String.valueOf(Object)>
	//  110  240:invokevirtual   #292 <Method int String.length()>
	//  111  243:bipush          77
	//  112  245:iadd            
	//  113  246:invokespecial   #295 <Method void StringBuilder(int)>
	//  114  249:astore_3        
				((StringBuilder) (exception)).append("Blacklisted: duration=60000, responseCode=");
	//  115  250:aload_3         
	//  116  251:ldc2            #297 <String "Blacklisted: duration=60000, responseCode=">
	//  117  254:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//  118  257:pop             
				((StringBuilder) (exception)).append(j1);
	//  119  258:aload_3         
	//  120  259:iload           4
	//  121  261:invokevirtual   #304 <Method StringBuilder StringBuilder.append(int)>
	//  122  264:pop             
				((StringBuilder) (exception)).append(", format=");
	//  123  265:aload_3         
	//  124  266:ldc2            #306 <String ", format=">
	//  125  269:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//  126  272:pop             
				((StringBuilder) (exception)).append(((String) (bjs1)));
	//  127  273:aload_3         
	//  128  274:aload_1         
	//  129  275:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//  130  278:pop             
				Log.w("ChunkedTrackBlacklist", ((StringBuilder) (exception)).toString());
	//  131  279:ldc2            #308 <String "ChunkedTrackBlacklist">
	//  132  282:aload_3         
	//  133  283:invokevirtual   #311 <Method String StringBuilder.toString()>
	//  134  286:invokestatic    #317 <Method int Log.w(String, String)>
	//  135  289:pop             
				return flag;
	//  136  290:iload_2         
	//  137  291:ireturn         
			} else
			{
				bjs1 = ((bjs) (String.valueOf(((Object) (bmc1.a(l1))))));
	//  138  292:aload           8
	//  139  294:iload           6
	//  140  296:invokeinterface #281 <Method zzfs bmc.a(int)>
	//  141  301:invokestatic    #287 <Method String String.valueOf(Object)>
	//  142  304:astore_1        
				exception = ((Exception) (new StringBuilder(String.valueOf(((Object) (bjs1))).length() + 92)));
	//  143  305:new             #289 <Class StringBuilder>
	//  144  308:dup             
	//  145  309:aload_1         
	//  146  310:invokestatic    #287 <Method String String.valueOf(Object)>
	//  147  313:invokevirtual   #292 <Method int String.length()>
	//  148  316:bipush          92
	//  149  318:iadd            
	//  150  319:invokespecial   #295 <Method void StringBuilder(int)>
	//  151  322:astore_3        
				((StringBuilder) (exception)).append("Blacklisting failed (cannot blacklist last enabled track): responseCode=");
	//  152  323:aload_3         
	//  153  324:ldc2            #319 <String "Blacklisting failed (cannot blacklist last enabled track): responseCode=">
	//  154  327:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//  155  330:pop             
				((StringBuilder) (exception)).append(j1);
	//  156  331:aload_3         
	//  157  332:iload           4
	//  158  334:invokevirtual   #304 <Method StringBuilder StringBuilder.append(int)>
	//  159  337:pop             
				((StringBuilder) (exception)).append(", format=");
	//  160  338:aload_3         
	//  161  339:ldc2            #306 <String ", format=">
	//  162  342:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//  163  345:pop             
				((StringBuilder) (exception)).append(((String) (bjs1)));
	//  164  346:aload_3         
	//  165  347:aload_1         
	//  166  348:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//  167  351:pop             
				Log.w("ChunkedTrackBlacklist", ((StringBuilder) (exception)).toString());
	//  168  352:ldc2            #308 <String "ChunkedTrackBlacklist">
	//  169  355:aload_3         
	//  170  356:invokevirtual   #311 <Method String StringBuilder.toString()>
	//  171  359:invokestatic    #317 <Method int Log.w(String, String)>
	//  172  362:pop             
				return flag;
	//  173  363:iload_2         
	//  174  364:ireturn         
			}
		} else
		{
			return false;
	//  175  365:iconst_0        
	//  176  366:ireturn         
		}
	}

	private final bnb a;
	private final int b[];
	private final bmc c;
	private final int d;
	private final bkw e[];
	private final bml f;
	private final long g;
	private final int h;
	private bky i;
	private int j;
	private IOException k;
	private boolean l;
}
