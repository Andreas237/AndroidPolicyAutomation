// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnw, bno, bnf, bgj, 
//			bhi, bgq, bgk, bgl, 
//			bgt, zzfs, bdt, bng, 
//			bnz, bod, bhh, bgr, 
//			bgs, bgp, bhk, bgn, 
//			bgw, bfr, bdj, bhb, 
//			zzki, zzhp

final class bgm
{

	private static int a(bno bno1)
	{
		int j = bno1.f();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #59  <Method int bno.f()>
	//    2    4:istore_2        
		int i;
		for(i = j & 0x7f; (j & 0x80) == 128; i = i << 7 | j & 0x7f)
	//*   3    5:iload_2         
	//*   4    6:bipush          127
	//*   5    8:iand            
	//*   6    9:istore_1        
	//*   7   10:iload_2         
	//*   8   11:sipush          128
	//*   9   14:iand            
	//*  10   15:sipush          128
	//*  11   18:icmpne          39
			j = bno1.f();
	//   12   21:aload_0         
	//   13   22:invokevirtual   #59  <Method int bno.f()>
	//   14   25:istore_2        

	//   15   26:iload_1         
	//   16   27:bipush          7
	//   17   29:ishl            
	//   18   30:iload_2         
	//   19   31:bipush          127
	//   20   33:iand            
	//   21   34:ior             
	//   22   35:istore_1        
	//*  23   36:goto            10
		return i;
	//   24   39:iload_1         
	//   25   40:ireturn         
	}

	private static int a(bno bno1, int i, int j, bgq bgq1, int k)
	{
		int i1 = bno1.d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method int bno.d()>
	//    2    4:istore          6
label0:
		do
		{
			int l1;
label1:
			{
				boolean flag3 = false;
	//    3    6:iconst_0        
	//    4    7:istore          13
				if(i1 - i >= j)
					break label0;
	//    5    9:iload           6
	//    6   11:iload_1         
	//    7   12:isub            
	//    8   13:iload_2         
	//    9   14:icmpge          434
				bno1.c(i1);
	//   10   17:aload_0         
	//   11   18:iload           6
	//   12   20:invokevirtual   #65  <Method void bno.c(int)>
				l1 = bno1.l();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #68  <Method int bno.l()>
	//   15   27:istore          9
				boolean flag;
				if(l1 > 0)
	//*  16   29:iload           9
	//*  17   31:ifle            40
					flag = true;
	//   18   34:iconst_1        
	//   19   35:istore          12
				else
	//*  20   37:goto            43
					flag = false;
	//   21   40:iconst_0        
	//   22   41:istore          12
				bnf.a(flag, "childAtomSize should be positive");
	//   23   43:iload           12
	//   24   45:ldc1            #70  <String "childAtomSize should be positive">
	//   25   47:invokestatic    #75  <Method void bnf.a(boolean, Object)>
				if(bno1.l() != bgj.V)
					break label1;
	//   26   50:aload_0         
	//   27   51:invokevirtual   #68  <Method int bno.l()>
	//   28   54:getstatic       #80  <Field int bgj.V>
	//   29   57:icmpne          424
				int j1 = i1 + 8;
	//   30   60:iload           6
	//   31   62:bipush          8
	//   32   64:iadd            
	//   33   65:istore          7
				Object obj1 = null;
	//   34   67:aconst_null     
	//   35   68:astore          17
				Integer integer = null;
	//   36   70:aconst_null     
	//   37   71:astore          15
				Object obj = ((Object) (integer));
	//   38   73:aload           15
	//   39   75:astore          14
				int k1 = 0;
	//   40   77:iconst_0        
	//   41   78:istore          8
				while(j1 - i1 < l1) 
	//*  42   80:iload           7
	//*  43   82:iload           6
	//*  44   84:isub            
	//*  45   85:iload           9
	//*  46   87:icmpge          331
				{
					int l;
					int i2;
					Integer integer1;
label2:
					{
label3:
						{
							bno1.c(j1);
	//   47   90:aload_0         
	//   48   91:iload           7
	//   49   93:invokevirtual   #65  <Method void bno.c(int)>
							i2 = bno1.l();
	//   50   96:aload_0         
	//   51   97:invokevirtual   #68  <Method int bno.l()>
	//   52  100:istore          10
							int j2 = bno1.l();
	//   53  102:aload_0         
	//   54  103:invokevirtual   #68  <Method int bno.l()>
	//   55  106:istore          11
							if(j2 == bgj.ab)
	//*  56  108:iload           11
	//*  57  110:getstatic       #83  <Field int bgj.ab>
	//*  58  113:icmpne          132
							{
								integer1 = Integer.valueOf(bno1.l());
	//   59  116:aload_0         
	//   60  117:invokevirtual   #68  <Method int bno.l()>
	//   61  120:invokestatic    #89  <Method Integer Integer.valueOf(int)>
	//   62  123:astore          16
								l = k1;
	//   63  125:iload           8
	//   64  127:istore          5
								break label2;
	//   65  129:goto            313
							}
							if(j2 == bgj.W)
	//*  66  132:iload           11
	//*  67  134:getstatic       #92  <Field int bgj.W>
	//*  68  137:icmpne          175
							{
								bno1.d(4);
	//   69  140:aload_0         
	//   70  141:iconst_4        
	//   71  142:invokevirtual   #94  <Method void bno.d(int)>
								if(bno1.l() == g)
	//*  72  145:aload_0         
	//*  73  146:invokevirtual   #68  <Method int bno.l()>
	//*  74  149:getstatic       #48  <Field int g>
	//*  75  152:icmpne          165
								{
									l = 1;
	//   76  155:iconst_1        
	//   77  156:istore          5
									integer1 = integer;
	//   78  158:aload           15
	//   79  160:astore          16
								} else
	//*  80  162:goto            313
								{
									l = 0;
	//   81  165:iconst_0        
	//   82  166:istore          5
									integer1 = integer;
	//   83  168:aload           15
	//   84  170:astore          16
								}
								break label2;
	//   85  172:goto            313
							}
							l = k1;
	//   86  175:iload           8
	//   87  177:istore          5
							integer1 = integer;
	//   88  179:aload           15
	//   89  181:astore          16
							if(j2 != bgj.X)
								break label2;
	//   90  183:iload           11
	//   91  185:getstatic       #97  <Field int bgj.X>
	//   92  188:icmpne          313
							l = j1 + 8;
	//   93  191:iload           7
	//   94  193:bipush          8
	//   95  195:iadd            
	//   96  196:istore          5
							do
							{
								if(l - j1 >= i2)
									break;
	//   97  198:iload           5
	//   98  200:iload           7
	//   99  202:isub            
	//  100  203:iload           10
	//  101  205:icmpge          302
								bno1.c(l);
	//  102  208:aload_0         
	//  103  209:iload           5
	//  104  211:invokevirtual   #65  <Method void bno.c(int)>
								int k2 = bno1.l();
	//  105  214:aload_0         
	//  106  215:invokevirtual   #68  <Method int bno.l()>
	//  107  218:istore          11
								if(bno1.l() == bgj.Y)
	//* 108  220:aload_0         
	//* 109  221:invokevirtual   #68  <Method int bno.l()>
	//* 110  224:getstatic       #100 <Field int bgj.Y>
	//* 111  227:icmpne          292
								{
									bno1.d(6);
	//  112  230:aload_0         
	//  113  231:bipush          6
	//  114  233:invokevirtual   #94  <Method void bno.d(int)>
									boolean flag1;
									if(bno1.f() == 1)
	//* 115  236:aload_0         
	//* 116  237:invokevirtual   #59  <Method int bno.f()>
	//* 117  240:iconst_1        
	//* 118  241:icmpne          250
										flag1 = true;
	//  119  244:iconst_1        
	//  120  245:istore          12
									else
	//* 121  247:goto            253
										flag1 = false;
	//  122  250:iconst_0        
	//  123  251:istore          12
									l = bno1.f();
	//  124  253:aload_0         
	//  125  254:invokevirtual   #59  <Method int bno.f()>
	//  126  257:istore          5
									obj = ((Object) (new byte[16]));
	//  127  259:bipush          16
	//  128  261:newarray        byte[]
	//  129  263:astore          14
									bno1.a(((byte []) (obj)), 0, 16);
	//  130  265:aload_0         
	//  131  266:aload           14
	//  132  268:iconst_0        
	//  133  269:bipush          16
	//  134  271:invokevirtual   #103 <Method void bno.a(byte[], int, int)>
									obj = ((Object) (new bhi(flag1, l, ((byte []) (obj)))));
	//  135  274:new             #105 <Class bhi>
	//  136  277:dup             
	//  137  278:iload           12
	//  138  280:iload           5
	//  139  282:aload           14
	//  140  284:invokespecial   #109 <Method void bhi(boolean, int, byte[])>
	//  141  287:astore          14
									break label3;
	//  142  289:goto            305
								}
								l += k2;
	//  143  292:iload           5
	//  144  294:iload           11
	//  145  296:iadd            
	//  146  297:istore          5
							} while(true);
	//  147  299:goto            198
							obj = null;
	//  148  302:aconst_null     
	//  149  303:astore          14
						}
						integer1 = integer;
	//  150  305:aload           15
	//  151  307:astore          16
						l = k1;
	//  152  309:iload           8
	//  153  311:istore          5
					}
					j1 += i2;
	//  154  313:iload           7
	//  155  315:iload           10
	//  156  317:iadd            
	//  157  318:istore          7
					k1 = l;
	//  158  320:iload           5
	//  159  322:istore          8
					integer = integer1;
	//  160  324:aload           16
	//  161  326:astore          15
				}
	//* 162  328:goto            80
				Pair pair = ((Pair) (obj1));
	//  163  331:aload           17
	//  164  333:astore          16
				if(k1 != 0)
	//* 165  335:iload           8
	//* 166  337:ifeq            389
				{
					boolean flag2;
					if(integer != null)
	//* 167  340:aload           15
	//* 168  342:ifnull          351
						flag2 = true;
	//  169  345:iconst_1        
	//  170  346:istore          12
					else
	//* 171  348:goto            354
						flag2 = false;
	//  172  351:iconst_0        
	//  173  352:istore          12
					bnf.a(flag2, "frma atom is mandatory");
	//  174  354:iload           12
	//  175  356:ldc1            #111 <String "frma atom is mandatory">
	//  176  358:invokestatic    #75  <Method void bnf.a(boolean, Object)>
					flag2 = flag3;
	//  177  361:iload           13
	//  178  363:istore          12
					if(obj != null)
	//* 179  365:aload           14
	//* 180  367:ifnull          373
						flag2 = true;
	//  181  370:iconst_1        
	//  182  371:istore          12
					bnf.a(flag2, "schi->tenc atom is mandatory");
	//  183  373:iload           12
	//  184  375:ldc1            #113 <String "schi->tenc atom is mandatory">
	//  185  377:invokestatic    #75  <Method void bnf.a(boolean, Object)>
					pair = Pair.create(((Object) (integer)), obj);
	//  186  380:aload           15
	//  187  382:aload           14
	//  188  384:invokestatic    #119 <Method Pair Pair.create(Object, Object)>
	//  189  387:astore          16
				}
				if(pair != null)
	//* 190  389:aload           16
	//* 191  391:ifnull          421
				{
					bgq1.a[k] = (bhi)pair.second;
	//  192  394:aload_3         
	//  193  395:getfield        #124 <Field bhi[] bgq.a>
	//  194  398:iload           4
	//  195  400:aload           16
	//  196  402:getfield        #128 <Field Object Pair.second>
	//  197  405:checkcast       #105 <Class bhi>
	//  198  408:aastore         
					return ((Integer)pair.first).intValue();
	//  199  409:aload           16
	//  200  411:getfield        #131 <Field Object Pair.first>
	//  201  414:checkcast       #85  <Class Integer>
	//  202  417:invokevirtual   #134 <Method int Integer.intValue()>
	//  203  420:ireturn         
				}
			}
	//* 204  421:goto            424
			i1 += l1;
	//  205  424:iload           6
	//  206  426:iload           9
	//  207  428:iadd            
	//  208  429:istore          6
		} while(true);
	//  209  431:goto            6
		return 0;
	//  210  434:iconst_0        
	//  211  435:ireturn         
	}

	private static Pair a(bno bno1, int i)
	{
		bno1.c(i + 8 + 4);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          8
	//    3    4:iadd            
	//    4    5:iconst_4        
	//    5    6:iadd            
	//    6    7:invokevirtual   #65  <Method void bno.c(int)>
		bno1.d(1);
	//    7   10:aload_0         
	//    8   11:iconst_1        
	//    9   12:invokevirtual   #94  <Method void bno.d(int)>
		a(bno1);
	//   10   15:aload_0         
	//   11   16:invokestatic    #137 <Method int a(bno)>
	//   12   19:pop             
		bno1.d(2);
	//   13   20:aload_0         
	//   14   21:iconst_2        
	//   15   22:invokevirtual   #94  <Method void bno.d(int)>
		i = bno1.f();
	//   16   25:aload_0         
	//   17   26:invokevirtual   #59  <Method int bno.f()>
	//   18   29:istore_1        
		if((i & 0x80) != 0)
	//*  19   30:iload_1         
	//*  20   31:sipush          128
	//*  21   34:iand            
	//*  22   35:ifeq            43
			bno1.d(2);
	//   23   38:aload_0         
	//   24   39:iconst_2        
	//   25   40:invokevirtual   #94  <Method void bno.d(int)>
		if((i & 0x40) != 0)
	//*  26   43:iload_1         
	//*  27   44:bipush          64
	//*  28   46:iand            
	//*  29   47:ifeq            58
			bno1.d(bno1.g());
	//   30   50:aload_0         
	//   31   51:aload_0         
	//   32   52:invokevirtual   #139 <Method int bno.g()>
	//   33   55:invokevirtual   #94  <Method void bno.d(int)>
		if((i & 0x20) != 0)
	//*  34   58:iload_1         
	//*  35   59:bipush          32
	//*  36   61:iand            
	//*  37   62:ifeq            70
			bno1.d(2);
	//   38   65:aload_0         
	//   39   66:iconst_2        
	//   40   67:invokevirtual   #94  <Method void bno.d(int)>
		bno1.d(1);
	//   41   70:aload_0         
	//   42   71:iconst_1        
	//   43   72:invokevirtual   #94  <Method void bno.d(int)>
		a(bno1);
	//   44   75:aload_0         
	//   45   76:invokestatic    #137 <Method int a(bno)>
	//   46   79:pop             
		i = bno1.f();
	//   47   80:aload_0         
	//   48   81:invokevirtual   #59  <Method int bno.f()>
	//   49   84:istore_1        
		String s = null;
	//   50   85:aconst_null     
	//   51   86:astore_2        
		switch(i)
	//*  52   87:iload_1         
		{
	//*  53   88:lookupswitch    14: default 212
	//	               32: 266
	//	               33: 260
	//	               35: 254
	//	               64: 248
	//	               102: 248
	//	               103: 248
	//	               104: 248
	//	               107: 241
	//	               165: 235
	//	               166: 229
	//	               169: 222
	//	               170: 215
	//	               171: 215
	//	               172: 222
	//*  54  212:goto            269
		case 170: 
		case 171: 
			return Pair.create("audio/vnd.dts.hd", ((Object) (null)));
	//   55  215:ldc1            #141 <String "audio/vnd.dts.hd">
	//   56  217:aconst_null     
	//   57  218:invokestatic    #119 <Method Pair Pair.create(Object, Object)>
	//   58  221:areturn         

		case 169: 
		case 172: 
			return Pair.create("audio/vnd.dts", ((Object) (null)));
	//   59  222:ldc1            #143 <String "audio/vnd.dts">
	//   60  224:aconst_null     
	//   61  225:invokestatic    #119 <Method Pair Pair.create(Object, Object)>
	//   62  228:areturn         

		case 166: 
			s = "audio/eac3";
	//   63  229:ldc1            #145 <String "audio/eac3">
	//   64  231:astore_2        
			break;

	//*  65  232:goto            269
		case 165: 
			s = "audio/ac3";
	//   66  235:ldc1            #147 <String "audio/ac3">
	//   67  237:astore_2        
			break;

	//*  68  238:goto            269
		case 107: // 'k'
			return Pair.create("audio/mpeg", ((Object) (null)));
	//   69  241:ldc1            #149 <String "audio/mpeg">
	//   70  243:aconst_null     
	//   71  244:invokestatic    #119 <Method Pair Pair.create(Object, Object)>
	//   72  247:areturn         

		case 64: // '@'
		case 102: // 'f'
		case 103: // 'g'
		case 104: // 'h'
			s = "audio/mp4a-latm";
	//   73  248:ldc1            #151 <String "audio/mp4a-latm">
	//   74  250:astore_2        
			break;

	//*  75  251:goto            269
		case 35: // '#'
			s = "video/hevc";
	//   76  254:ldc1            #153 <String "video/hevc">
	//   77  256:astore_2        
			break;

	//*  78  257:goto            269
		case 33: // '!'
			s = "video/avc";
	//   79  260:ldc1            #155 <String "video/avc">
	//   80  262:astore_2        
			break;

	//*  81  263:goto            269
		case 32: // ' '
			s = "video/mp4v-es";
	//   82  266:ldc1            #157 <String "video/mp4v-es">
	//   83  268:astore_2        
			break;
		}
		bno1.d(12);
	//   84  269:aload_0         
	//   85  270:bipush          12
	//   86  272:invokevirtual   #94  <Method void bno.d(int)>
		bno1.d(1);
	//   87  275:aload_0         
	//   88  276:iconst_1        
	//   89  277:invokevirtual   #94  <Method void bno.d(int)>
		i = a(bno1);
	//   90  280:aload_0         
	//   91  281:invokestatic    #137 <Method int a(bno)>
	//   92  284:istore_1        
		byte abyte0[] = new byte[i];
	//   93  285:iload_1         
	//   94  286:newarray        byte[]
	//   95  288:astore_3        
		bno1.a(abyte0, 0, i);
	//   96  289:aload_0         
	//   97  290:aload_3         
	//   98  291:iconst_0        
	//   99  292:iload_1         
	//  100  293:invokevirtual   #103 <Method void bno.a(byte[], int, int)>
		return Pair.create(((Object) (s)), ((Object) (abyte0)));
	//  101  296:aload_2         
	//  102  297:aload_3         
	//  103  298:invokestatic    #119 <Method Pair Pair.create(Object, Object)>
	//  104  301:areturn         
	}

	public static bhh a(bgk bgk1, bgl bgl1, long l, zzhp zzhp, boolean flag)
	{
		int i;
		int i1;
		int l1;
		int i4;
		int l4;
		Object obj;
		Object obj1;
label0:
		{
			obj = ((Object) (bgk1.e(bgj.E)));
	//    0    0:aload_0         
	//    1    1:getstatic       #161 <Field int bgj.E>
	//    2    4:invokevirtual   #166 <Method bgk bgk.e(int)>
	//    3    7:astore          34
			obj1 = ((Object) (((bgk) (obj)).d(bgj.S).aP));
	//    4    9:aload           34
	//    5   11:getstatic       #169 <Field int bgj.S>
	//    6   14:invokevirtual   #172 <Method bgl bgk.d(int)>
	//    7   17:getfield        #178 <Field bno bgl.aP>
	//    8   20:astore          35
			((bno) (obj1)).c(16);
	//    9   22:aload           35
	//   10   24:bipush          16
	//   11   26:invokevirtual   #65  <Method void bno.c(int)>
			i = ((bno) (obj1)).l();
	//   12   29:aload           35
	//   13   31:invokevirtual   #68  <Method int bno.l()>
	//   14   34:istore          11
			if(i == b)
	//*  15   36:iload           11
	//*  16   38:getstatic       #28  <Field int b>
	//*  17   41:icmpne          50
				i = 1;
	//   18   44:iconst_1        
	//   19   45:istore          11
			else
	//*  20   47:goto            122
			if(i == a)
	//*  21   50:iload           11
	//*  22   52:getstatic       #24  <Field int a>
	//*  23   55:icmpne          64
				i = 2;
	//   24   58:iconst_2        
	//   25   59:istore          11
			else
	//*  26   61:goto            122
			if(i != c && i != d && i != e && i != f)
	//*  27   64:iload           11
	//*  28   66:getstatic       #32  <Field int c>
	//*  29   69:icmpeq          119
	//*  30   72:iload           11
	//*  31   74:getstatic       #36  <Field int d>
	//*  32   77:icmpeq          119
	//*  33   80:iload           11
	//*  34   82:getstatic       #40  <Field int e>
	//*  35   85:icmpeq          119
	//*  36   88:iload           11
	//*  37   90:getstatic       #44  <Field int f>
	//*  38   93:icmpne          99
	//*  39   96:goto            119
			{
				if(i == h)
	//*  40   99:iload           11
	//*  41  101:getstatic       #52  <Field int h>
	//*  42  104:icmpne          113
					i = 4;
	//   43  107:iconst_4        
	//   44  108:istore          11
				else
	//*  45  110:goto            122
					i = -1;
	//   46  113:iconst_m1       
	//   47  114:istore          11
			} else
	//*  48  116:goto            122
			{
				i = 3;
	//   49  119:iconst_3        
	//   50  120:istore          11
			}
			if(i == -1)
	//*  51  122:iload           11
	//*  52  124:iconst_m1       
	//*  53  125:icmpne          130
				return null;
	//   54  128:aconst_null     
	//   55  129:areturn         
			obj1 = ((Object) (bgk1.d(bgj.O).aP));
	//   56  130:aload_0         
	//   57  131:getstatic       #181 <Field int bgj.O>
	//   58  134:invokevirtual   #172 <Method bgl bgk.d(int)>
	//   59  137:getfield        #178 <Field bno bgl.aP>
	//   60  140:astore          35
			((bno) (obj1)).c(8);
	//   61  142:aload           35
	//   62  144:bipush          8
	//   63  146:invokevirtual   #65  <Method void bno.c(int)>
			l4 = bgj.a(((bno) (obj1)).l());
	//   64  149:aload           35
	//   65  151:invokevirtual   #68  <Method int bno.l()>
	//   66  154:invokestatic    #184 <Method int bgj.a(int)>
	//   67  157:istore          15
			if(l4 == 0)
	//*  68  159:iload           15
	//*  69  161:ifne            171
				i1 = 8;
	//   70  164:bipush          8
	//   71  166:istore          12
			else
	//*  72  168:goto            175
				i1 = 16;
	//   73  171:bipush          16
	//   74  173:istore          12
			((bno) (obj1)).d(i1);
	//   75  175:aload           35
	//   76  177:iload           12
	//   77  179:invokevirtual   #94  <Method void bno.d(int)>
			i4 = ((bno) (obj1)).l();
	//   78  182:aload           35
	//   79  184:invokevirtual   #68  <Method int bno.l()>
	//   80  187:istore          14
			((bno) (obj1)).d(4);
	//   81  189:aload           35
	//   82  191:iconst_4        
	//   83  192:invokevirtual   #94  <Method void bno.d(int)>
			int j5 = ((bno) (obj1)).d();
	//   84  195:aload           35
	//   85  197:invokevirtual   #62  <Method int bno.d()>
	//   86  200:istore          16
			if(l4 == 0)
	//*  87  202:iload           15
	//*  88  204:ifne            213
				i1 = 4;
	//   89  207:iconst_4        
	//   90  208:istore          12
			else
	//*  91  210:goto            217
				i1 = 8;
	//   92  213:bipush          8
	//   93  215:istore          12
			l1 = 0;
	//   94  217:iconst_0        
	//   95  218:istore          13
			do
			{
				if(l1 >= i1)
					break;
	//   96  220:iload           13
	//   97  222:iload           12
	//   98  224:icmpge          257
				if(((bno) (obj1)).a[j5 + l1] != -1)
	//*  99  227:aload           35
	//* 100  229:getfield        #187 <Field byte[] bno.a>
	//* 101  232:iload           16
	//* 102  234:iload           13
	//* 103  236:iadd            
	//* 104  237:baload          
	//* 105  238:iconst_m1       
	//* 106  239:icmpeq          248
				{
					l1 = 0;
	//  107  242:iconst_0        
	//  108  243:istore          13
					break label0;
	//  109  245:goto            260
				}
				l1++;
	//  110  248:iload           13
	//  111  250:iconst_1        
	//  112  251:iadd            
	//  113  252:istore          13
			} while(true);
	//  114  254:goto            220
			l1 = 1;
	//  115  257:iconst_1        
	//  116  258:istore          13
		}
		long l11;
		if(l1 != 0)
	//* 117  260:iload           13
	//* 118  262:ifeq            280
		{
			((bno) (obj1)).d(i1);
	//  119  265:aload           35
	//  120  267:iload           12
	//  121  269:invokevirtual   #94  <Method void bno.d(int)>
			l11 = 0x1L;
	//  122  272:ldc2w           #188 <Long 0x1L>
	//  123  275:lstore          29
		} else
	//* 124  277:goto            317
		{
			if(l4 == 0)
	//* 125  280:iload           15
	//* 126  282:ifne            295
				l11 = ((bno) (obj1)).j();
	//  127  285:aload           35
	//  128  287:invokevirtual   #193 <Method long bno.j()>
	//  129  290:lstore          29
			else
	//* 130  292:goto            302
				l11 = ((bno) (obj1)).p();
	//  131  295:aload           35
	//  132  297:invokevirtual   #196 <Method long bno.p()>
	//  133  300:lstore          29
			if(l11 == 0L)
	//* 134  302:lload           29
	//* 135  304:lconst_0        
	//* 136  305:lcmp            
	//* 137  306:ifne            317
				l11 = 0x1L;
	//  138  309:ldc2w           #188 <Long 0x1L>
	//  139  312:lstore          29
		}
	//* 140  314:goto            317
		((bno) (obj1)).d(16);
	//  141  317:aload           35
	//  142  319:bipush          16
	//  143  321:invokevirtual   #94  <Method void bno.d(int)>
		i1 = ((bno) (obj1)).l();
	//  144  324:aload           35
	//  145  326:invokevirtual   #68  <Method int bno.l()>
	//  146  329:istore          12
		l1 = ((bno) (obj1)).l();
	//  147  331:aload           35
	//  148  333:invokevirtual   #68  <Method int bno.l()>
	//  149  336:istore          13
		((bno) (obj1)).d(4);
	//  150  338:aload           35
	//  151  340:iconst_4        
	//  152  341:invokevirtual   #94  <Method void bno.d(int)>
		l4 = ((bno) (obj1)).l();
	//  153  344:aload           35
	//  154  346:invokevirtual   #68  <Method int bno.l()>
	//  155  349:istore          15
		int k5 = ((bno) (obj1)).l();
	//  156  351:aload           35
	//  157  353:invokevirtual   #68  <Method int bno.l()>
	//  158  356:istore          16
		if(i1 == 0 && l1 == 0x10000 && l4 == 0xffff0000 && k5 == 0)
	//* 159  358:iload           12
	//* 160  360:ifne            389
	//* 161  363:iload           13
	//* 162  365:ldc1            #197 <Int 0x10000>
	//* 163  367:icmpne          389
	//* 164  370:iload           15
	//* 165  372:ldc1            #198 <Int 0xffff0000>
	//* 166  374:icmpne          389
	//* 167  377:iload           16
	//* 168  379:ifne            389
			i1 = 90;
	//  169  382:bipush          90
	//  170  384:istore          12
		else
	//* 171  386:goto            456
		if(i1 == 0 && l1 == 0xffff0000 && l4 == 0x10000 && k5 == 0)
	//* 172  389:iload           12
	//* 173  391:ifne            421
	//* 174  394:iload           13
	//* 175  396:ldc1            #198 <Int 0xffff0000>
	//* 176  398:icmpne          421
	//* 177  401:iload           15
	//* 178  403:ldc1            #197 <Int 0x10000>
	//* 179  405:icmpne          421
	//* 180  408:iload           16
	//* 181  410:ifne            421
			i1 = 270;
	//  182  413:sipush          270
	//  183  416:istore          12
		else
	//* 184  418:goto            456
		if(i1 == 0xffff0000 && l1 == 0 && l4 == 0 && k5 == 0xffff0000)
	//* 185  421:iload           12
	//* 186  423:ldc1            #198 <Int 0xffff0000>
	//* 187  425:icmpne          453
	//* 188  428:iload           13
	//* 189  430:ifne            453
	//* 190  433:iload           15
	//* 191  435:ifne            453
	//* 192  438:iload           16
	//* 193  440:ldc1            #198 <Int 0xffff0000>
	//* 194  442:icmpne          453
			i1 = 180;
	//  195  445:sipush          180
	//  196  448:istore          12
		else
	//* 197  450:goto            456
			i1 = 0;
	//  198  453:iconst_0        
	//  199  454:istore          12
		bgt bgt1 = new bgt(i4, l11, i1);
	//  200  456:new             #200 <Class bgt>
	//  201  459:dup             
	//  202  460:iload           14
	//  203  462:lload           29
	//  204  464:iload           12
	//  205  466:invokespecial   #203 <Method void bgt(int, long, int)>
	//  206  469:astore          39
		if(l == 0x1L)
	//* 207  471:lload_2         
	//* 208  472:ldc2w           #188 <Long 0x1L>
	//* 209  475:lcmp            
	//* 210  476:ifne            488
			l = bgt.a(bgt1);
	//  211  479:aload           39
	//  212  481:invokestatic    #206 <Method long bgt.a(bgt)>
	//  213  484:lstore_2        
	//* 214  485:goto            488
		bgl1 = ((bgl) (bgl1.aP));
	//  215  488:aload_1         
	//  216  489:getfield        #178 <Field bno bgl.aP>
	//  217  492:astore_1        
		((bno) (bgl1)).c(8);
	//  218  493:aload_1         
	//  219  494:bipush          8
	//  220  496:invokevirtual   #65  <Method void bno.c(int)>
		if(bgj.a(((bno) (bgl1)).l()) == 0)
	//* 221  499:aload_1         
	//* 222  500:invokevirtual   #68  <Method int bno.l()>
	//* 223  503:invokestatic    #184 <Method int bgj.a(int)>
	//* 224  506:ifne            516
			i1 = 8;
	//  225  509:bipush          8
	//  226  511:istore          12
		else
	//* 227  513:goto            520
			i1 = 16;
	//  228  516:bipush          16
	//  229  518:istore          12
		((bno) (bgl1)).d(i1);
	//  230  520:aload_1         
	//  231  521:iload           12
	//  232  523:invokevirtual   #94  <Method void bno.d(int)>
		long l14 = ((bno) (bgl1)).j();
	//  233  526:aload_1         
	//  234  527:invokevirtual   #193 <Method long bno.j()>
	//  235  530:lstore          31
		if(l == 0x1L)
	//* 236  532:lload_2         
	//* 237  533:ldc2w           #188 <Long 0x1L>
	//* 238  536:lcmp            
	//* 239  537:ifne            547
			l = 0x1L;
	//  240  540:ldc2w           #188 <Long 0x1L>
	//  241  543:lstore_2        
		else
	//* 242  544:goto            557
			l = bnw.a(l, 0xf4240L, l14);
	//  243  547:lload_2         
	//  244  548:ldc2w           #207 <Long 0xf4240L>
	//  245  551:lload           31
	//  246  553:invokestatic    #211 <Method long bnw.a(long, long, long)>
	//  247  556:lstore_2        
		bgl1 = ((bgl) (((bgk) (obj)).e(bgj.F).e(bgj.G)));
	//  248  557:aload           34
	//  249  559:getstatic       #214 <Field int bgj.F>
	//  250  562:invokevirtual   #166 <Method bgk bgk.e(int)>
	//  251  565:getstatic       #217 <Field int bgj.G>
	//  252  568:invokevirtual   #166 <Method bgk bgk.e(int)>
	//  253  571:astore_1        
		obj = ((Object) (((bgk) (obj)).d(bgj.R).aP));
	//  254  572:aload           34
	//  255  574:getstatic       #220 <Field int bgj.R>
	//  256  577:invokevirtual   #172 <Method bgl bgk.d(int)>
	//  257  580:getfield        #178 <Field bno bgl.aP>
	//  258  583:astore          34
		((bno) (obj)).c(8);
	//  259  585:aload           34
	//  260  587:bipush          8
	//  261  589:invokevirtual   #65  <Method void bno.c(int)>
		l1 = bgj.a(((bno) (obj)).l());
	//  262  592:aload           34
	//  263  594:invokevirtual   #68  <Method int bno.l()>
	//  264  597:invokestatic    #184 <Method int bgj.a(int)>
	//  265  600:istore          13
		if(l1 == 0)
	//* 266  602:iload           13
	//* 267  604:ifne            614
			i1 = 8;
	//  268  607:bipush          8
	//  269  609:istore          12
		else
	//* 270  611:goto            618
			i1 = 16;
	//  271  614:bipush          16
	//  272  616:istore          12
		((bno) (obj)).d(i1);
	//  273  618:aload           34
	//  274  620:iload           12
	//  275  622:invokevirtual   #94  <Method void bno.d(int)>
		l11 = ((bno) (obj)).j();
	//  276  625:aload           34
	//  277  627:invokevirtual   #193 <Method long bno.j()>
	//  278  630:lstore          29
		if(l1 == 0)
	//* 279  632:iload           13
	//* 280  634:ifne            643
			i1 = 4;
	//  281  637:iconst_4        
	//  282  638:istore          12
		else
	//* 283  640:goto            647
			i1 = 8;
	//  284  643:bipush          8
	//  285  645:istore          12
		((bno) (obj)).d(i1);
	//  286  647:aload           34
	//  287  649:iload           12
	//  288  651:invokevirtual   #94  <Method void bno.d(int)>
		i1 = ((bno) (obj)).g();
	//  289  654:aload           34
	//  290  656:invokevirtual   #139 <Method int bno.g()>
	//  291  659:istore          12
		char c1 = (char)((i1 >> 10 & 0x1f) + 96);
	//  292  661:iload           12
	//  293  663:bipush          10
	//  294  665:ishr            
	//  295  666:bipush          31
	//  296  668:iand            
	//  297  669:bipush          96
	//  298  671:iadd            
	//  299  672:int2char        
	//  300  673:istore          6
		char c2 = (char)((i1 >> 5 & 0x1f) + 96);
	//  301  675:iload           12
	//  302  677:iconst_5        
	//  303  678:ishr            
	//  304  679:bipush          31
	//  305  681:iand            
	//  306  682:bipush          96
	//  307  684:iadd            
	//  308  685:int2char        
	//  309  686:istore          7
		char c3 = (char)((i1 & 0x1f) + 96);
	//  310  688:iload           12
	//  311  690:bipush          31
	//  312  692:iand            
	//  313  693:bipush          96
	//  314  695:iadd            
	//  315  696:int2char        
	//  316  697:istore          8
		obj = ((Object) (new StringBuilder(3)));
	//  317  699:new             #222 <Class StringBuilder>
	//  318  702:dup             
	//  319  703:iconst_3        
	//  320  704:invokespecial   #224 <Method void StringBuilder(int)>
	//  321  707:astore          34
		((StringBuilder) (obj)).append(c1);
	//  322  709:aload           34
	//  323  711:iload           6
	//  324  713:invokevirtual   #228 <Method StringBuilder StringBuilder.append(char)>
	//  325  716:pop             
		((StringBuilder) (obj)).append(c2);
	//  326  717:aload           34
	//  327  719:iload           7
	//  328  721:invokevirtual   #228 <Method StringBuilder StringBuilder.append(char)>
	//  329  724:pop             
		((StringBuilder) (obj)).append(c3);
	//  330  725:aload           34
	//  331  727:iload           8
	//  332  729:invokevirtual   #228 <Method StringBuilder StringBuilder.append(char)>
	//  333  732:pop             
		Pair pair = Pair.create(((Object) (Long.valueOf(l11))), ((Object) (((StringBuilder) (obj)).toString())));
	//  334  733:lload           29
	//  335  735:invokestatic    #233 <Method Long Long.valueOf(long)>
	//  336  738:aload           34
	//  337  740:invokevirtual   #237 <Method String StringBuilder.toString()>
	//  338  743:invokestatic    #119 <Method Pair Pair.create(Object, Object)>
	//  339  746:astore          38
		obj = ((Object) (((bgk) (bgl1)).d(bgj.T).aP));
	//  340  748:aload_1         
	//  341  749:getstatic       #240 <Field int bgj.T>
	//  342  752:invokevirtual   #172 <Method bgl bgk.d(int)>
	//  343  755:getfield        #178 <Field bno bgl.aP>
	//  344  758:astore          34
		int i10 = bgt.b(bgt1);
	//  345  760:aload           39
	//  346  762:invokestatic    #243 <Method int bgt.b(bgt)>
	//  347  765:istore          22
		int j10 = bgt.c(bgt1);
	//  348  767:aload           39
	//  349  769:invokestatic    #245 <Method int bgt.c(bgt)>
	//  350  772:istore          23
		Object obj2 = ((Object) ((String)pair.second));
	//  351  774:aload           38
	//  352  776:getfield        #128 <Field Object Pair.second>
	//  353  779:checkcast       #247 <Class String>
	//  354  782:astore          36
		((bno) (obj)).c(12);
	//  355  784:aload           34
	//  356  786:bipush          12
	//  357  788:invokevirtual   #65  <Method void bno.c(int)>
		int j7 = ((bno) (obj)).l();
	//  358  791:aload           34
	//  359  793:invokevirtual   #68  <Method int bno.l()>
	//  360  796:istore          18
		obj1 = ((Object) (new bgq(j7)));
	//  361  798:new             #121 <Class bgq>
	//  362  801:dup             
	//  363  802:iload           18
	//  364  804:invokespecial   #248 <Method void bgq(int)>
	//  365  807:astore          35
		i1 = 0;
	//  366  809:iconst_0        
	//  367  810:istore          12
		int i7 = i;
	//  368  812:iload           11
	//  369  814:istore          17
		for(int j = i1; j < j7;)
	//* 370  816:iload           12
	//* 371  818:istore          11
	//* 372  820:iload           11
	//* 373  822:iload           18
	//* 374  824:icmpge          3511
		{
			int j1;
			int k10;
label1:
			{
				int i5;
label2:
				{
label3:
					{
label4:
						{
							j1 = ((bno) (obj)).d();
	//  375  827:aload           34
	//  376  829:invokevirtual   #62  <Method int bno.d()>
	//  377  832:istore          12
							k10 = ((bno) (obj)).l();
	//  378  834:aload           34
	//  379  836:invokevirtual   #68  <Method int bno.l()>
	//  380  839:istore          24
							boolean flag1;
							if(k10 > 0)
	//* 381  841:iload           24
	//* 382  843:ifle            852
								flag1 = true;
	//  383  846:iconst_1        
	//  384  847:istore          33
							else
	//* 385  849:goto            855
								flag1 = false;
	//  386  852:iconst_0        
	//  387  853:istore          33
							bnf.a(flag1, "childAtomSize should be positive");
	//  388  855:iload           33
	//  389  857:ldc1            #70  <String "childAtomSize should be positive">
	//  390  859:invokestatic    #75  <Method void bnf.a(boolean, Object)>
							i5 = ((bno) (obj)).l();
	//  391  862:aload           34
	//  392  864:invokevirtual   #68  <Method int bno.l()>
	//  393  867:istore          15
							if(i5 == bgj.b || i5 == bgj.c || i5 == bgj.Z || i5 == bgj.ak || i5 == bgj.d || i5 == bgj.e || i5 == bgj.f || i5 == bgj.aJ || i5 == bgj.aK)
	//* 394  869:iload           15
	//* 395  871:getstatic       #249 <Field int bgj.b>
	//* 396  874:icmpeq          2308
	//* 397  877:iload           15
	//* 398  879:getstatic       #250 <Field int bgj.c>
	//* 399  882:icmpeq          2308
	//* 400  885:iload           15
	//* 401  887:getstatic       #253 <Field int bgj.Z>
	//* 402  890:icmpeq          2308
	//* 403  893:iload           15
	//* 404  895:getstatic       #256 <Field int bgj.ak>
	//* 405  898:icmpeq          2308
	//* 406  901:iload           15
	//* 407  903:getstatic       #257 <Field int bgj.d>
	//* 408  906:icmpeq          2308
	//* 409  909:iload           15
	//* 410  911:getstatic       #258 <Field int bgj.e>
	//* 411  914:icmpeq          2308
	//* 412  917:iload           15
	//* 413  919:getstatic       #259 <Field int bgj.f>
	//* 414  922:icmpeq          2308
	//* 415  925:iload           15
	//* 416  927:getstatic       #262 <Field int bgj.aJ>
	//* 417  930:icmpeq          2308
	//* 418  933:iload           15
	//* 419  935:getstatic       #265 <Field int bgj.aK>
	//* 420  938:icmpne          944
								break label2;
	//  421  941:goto            2308
							if(i5 == bgj.i || i5 == bgj.aa || i5 == bgj.n || i5 == bgj.p || i5 == bgj.r || i5 == bgj.u || i5 == bgj.s || i5 == bgj.t || i5 == bgj.ax || i5 == bgj.ay || i5 == bgj.l || i5 == bgj.m || i5 == bgj.j || i5 == bgj.aN)
	//* 422  944:iload           15
	//* 423  946:getstatic       #268 <Field int bgj.i>
	//* 424  949:icmpeq          1371
	//* 425  952:iload           15
	//* 426  954:getstatic       #271 <Field int bgj.aa>
	//* 427  957:icmpeq          1371
	//* 428  960:iload           15
	//* 429  962:getstatic       #274 <Field int bgj.n>
	//* 430  965:icmpeq          1371
	//* 431  968:iload           15
	//* 432  970:getstatic       #276 <Field int bgj.p>
	//* 433  973:icmpeq          1371
	//* 434  976:iload           15
	//* 435  978:getstatic       #279 <Field int bgj.r>
	//* 436  981:icmpeq          1371
	//* 437  984:iload           15
	//* 438  986:getstatic       #282 <Field int bgj.u>
	//* 439  989:icmpeq          1371
	//* 440  992:iload           15
	//* 441  994:getstatic       #285 <Field int bgj.s>
	//* 442  997:icmpeq          1371
	//* 443 1000:iload           15
	//* 444 1002:getstatic       #288 <Field int bgj.t>
	//* 445 1005:icmpeq          1371
	//* 446 1008:iload           15
	//* 447 1010:getstatic       #291 <Field int bgj.ax>
	//* 448 1013:icmpeq          1371
	//* 449 1016:iload           15
	//* 450 1018:getstatic       #294 <Field int bgj.ay>
	//* 451 1021:icmpeq          1371
	//* 452 1024:iload           15
	//* 453 1026:getstatic       #296 <Field int bgj.l>
	//* 454 1029:icmpeq          1371
	//* 455 1032:iload           15
	//* 456 1034:getstatic       #299 <Field int bgj.m>
	//* 457 1037:icmpeq          1371
	//* 458 1040:iload           15
	//* 459 1042:getstatic       #301 <Field int bgj.j>
	//* 460 1045:icmpeq          1371
	//* 461 1048:iload           15
	//* 462 1050:getstatic       #304 <Field int bgj.aN>
	//* 463 1053:icmpne          1059
								break label3;
	//  464 1056:goto            1371
							if(i5 != bgj.aj && i5 != bgj.at && i5 != bgj.au && i5 != bgj.av && i5 != bgj.aw)
	//* 465 1059:iload           15
	//* 466 1061:getstatic       #307 <Field int bgj.aj>
	//* 467 1064:icmpeq          1174
	//* 468 1067:iload           15
	//* 469 1069:getstatic       #310 <Field int bgj.at>
	//* 470 1072:icmpeq          1174
	//* 471 1075:iload           15
	//* 472 1077:getstatic       #313 <Field int bgj.au>
	//* 473 1080:icmpeq          1174
	//* 474 1083:iload           15
	//* 475 1085:getstatic       #316 <Field int bgj.av>
	//* 476 1088:icmpeq          1174
	//* 477 1091:iload           15
	//* 478 1093:getstatic       #319 <Field int bgj.aw>
	//* 479 1096:icmpne          1102
	//* 480 1099:goto            1174
							{
								if(i5 == bgj.aM)
	//* 481 1102:iload           15
	//* 482 1104:getstatic       #322 <Field int bgj.aM>
	//* 483 1107:icmpne          1152
								{
									obj1.b = zzfs.a(Integer.toString(i10), "application/x-camera-motion", ((String) (null)), -1, zzhp);
	//  484 1110:aload           35
	//  485 1112:iload           22
	//  486 1114:invokestatic    #325 <Method String Integer.toString(int)>
	//  487 1117:ldc2            #327 <String "application/x-camera-motion">
	//  488 1120:aconst_null     
	//  489 1121:iconst_m1       
	//  490 1122:aload           4
	//  491 1124:invokestatic    #332 <Method zzfs zzfs.a(String, String, String, int, zzhp)>
	//  492 1127:putfield        #335 <Field zzfs bgq.b>
									int i2 = j;
	//  493 1130:iload           11
	//  494 1132:istore          13
									bgl1 = ((bgl) (obj1));
	//  495 1134:aload           35
	//  496 1136:astore_1        
									obj1 = obj2;
	//  497 1137:aload           36
	//  498 1139:astore          35
									j = j1;
	//  499 1141:iload           12
	//  500 1143:istore          11
									j1 = i2;
	//  501 1145:iload           13
	//  502 1147:istore          12
								} else
	//* 503 1149:goto            3485
								{
									int j2 = j;
	//  504 1152:iload           11
	//  505 1154:istore          13
									bgl1 = ((bgl) (obj1));
	//  506 1156:aload           35
	//  507 1158:astore_1        
									obj1 = obj2;
	//  508 1159:aload           36
	//  509 1161:astore          35
									j = j1;
	//  510 1163:iload           12
	//  511 1165:istore          11
									j1 = j2;
	//  512 1167:iload           13
	//  513 1169:istore          12
								}
								break label1;
	//  514 1171:goto            3485
							}
							((bno) (obj)).c(j1 + 8 + 8);
	//  515 1174:aload           34
	//  516 1176:iload           12
	//  517 1178:bipush          8
	//  518 1180:iadd            
	//  519 1181:bipush          8
	//  520 1183:iadd            
	//  521 1184:invokevirtual   #65  <Method void bno.c(int)>
							long l12 = 0xffffffffL;
	//  522 1187:ldc2w           #336 <Long 0xffffffffL>
	//  523 1190:lstore          29
							java.util.List list;
							if(i5 == bgj.aj)
	//* 524 1192:iload           15
	//* 525 1194:getstatic       #307 <Field int bgj.aj>
	//* 526 1197:icmpne          1210
							{
								bgl1 = "application/ttml+xml";
	//  527 1200:ldc2            #339 <String "application/ttml+xml">
	//  528 1203:astore_1        
								list = null;
	//  529 1204:aconst_null     
	//  530 1205:astore          37
							} else
	//* 531 1207:goto            1315
							if(i5 == bgj.at)
	//* 532 1210:iload           15
	//* 533 1212:getstatic       #310 <Field int bgj.at>
	//* 534 1215:icmpne          1255
							{
								int k2 = k10 - 8 - 8;
	//  535 1218:iload           24
	//  536 1220:bipush          8
	//  537 1222:isub            
	//  538 1223:bipush          8
	//  539 1225:isub            
	//  540 1226:istore          13
								bgl1 = ((bgl) (new byte[k2]));
	//  541 1228:iload           13
	//  542 1230:newarray        byte[]
	//  543 1232:astore_1        
								((bno) (obj)).a(((byte []) (bgl1)), 0, k2);
	//  544 1233:aload           34
	//  545 1235:aload_1         
	//  546 1236:iconst_0        
	//  547 1237:iload           13
	//  548 1239:invokevirtual   #103 <Method void bno.a(byte[], int, int)>
								list = Collections.singletonList(((Object) (bgl1)));
	//  549 1242:aload_1         
	//  550 1243:invokestatic    #345 <Method java.util.List Collections.singletonList(Object)>
	//  551 1246:astore          37
								bgl1 = "application/x-quicktime-tx3g";
	//  552 1248:ldc2            #347 <String "application/x-quicktime-tx3g">
	//  553 1251:astore_1        
							} else
	//* 554 1252:goto            1315
							if(i5 == bgj.au)
	//* 555 1255:iload           15
	//* 556 1257:getstatic       #313 <Field int bgj.au>
	//* 557 1260:icmpne          1273
							{
								bgl1 = "application/x-mp4-vtt";
	//  558 1263:ldc2            #349 <String "application/x-mp4-vtt">
	//  559 1266:astore_1        
								list = null;
	//  560 1267:aconst_null     
	//  561 1268:astore          37
							} else
	//* 562 1270:goto            1315
							if(i5 == bgj.av)
	//* 563 1273:iload           15
	//* 564 1275:getstatic       #316 <Field int bgj.av>
	//* 565 1278:icmpne          1294
							{
								bgl1 = "application/ttml+xml";
	//  566 1281:ldc2            #339 <String "application/ttml+xml">
	//  567 1284:astore_1        
								l12 = 0L;
	//  568 1285:lconst_0        
	//  569 1286:lstore          29
								list = null;
	//  570 1288:aconst_null     
	//  571 1289:astore          37
							} else
	//* 572 1291:goto            1315
							{
								if(i5 != bgj.aw)
									break label4;
	//  573 1294:iload           15
	//  574 1296:getstatic       #319 <Field int bgj.aw>
	//  575 1299:icmpne          1363
								obj1.d = 1;
	//  576 1302:aload           35
	//  577 1304:iconst_1        
	//  578 1305:putfield        #350 <Field int bgq.d>
								bgl1 = "application/x-mp4-cea-608";
	//  579 1308:ldc2            #352 <String "application/x-mp4-cea-608">
	//  580 1311:astore_1        
								list = null;
	//  581 1312:aconst_null     
	//  582 1313:astore          37
							}
							obj1.b = zzfs.a(Integer.toString(i10), ((String) (bgl1)), ((String) (null)), -1, 0, ((String) (obj2)), -1, zzhp, l12, list);
	//  583 1315:aload           35
	//  584 1317:iload           22
	//  585 1319:invokestatic    #325 <Method String Integer.toString(int)>
	//  586 1322:aload_1         
	//  587 1323:aconst_null     
	//  588 1324:iconst_m1       
	//  589 1325:iconst_0        
	//  590 1326:aload           36
	//  591 1328:iconst_m1       
	//  592 1329:aload           4
	//  593 1331:lload           29
	//  594 1333:aload           37
	//  595 1335:invokestatic    #355 <Method zzfs zzfs.a(String, String, String, int, int, String, int, zzhp, long, java.util.List)>
	//  596 1338:putfield        #335 <Field zzfs bgq.b>
							bgl1 = ((bgl) (obj1));
	//  597 1341:aload           35
	//  598 1343:astore_1        
							int l2 = j;
	//  599 1344:iload           11
	//  600 1346:istore          13
							j = j1;
	//  601 1348:iload           12
	//  602 1350:istore          11
							j1 = l2;
	//  603 1352:iload           13
	//  604 1354:istore          12
							obj1 = obj2;
	//  605 1356:aload           36
	//  606 1358:astore          35
							break label1;
	//  607 1360:goto            3485
						}
						throw new IllegalStateException();
	//  608 1363:new             #357 <Class IllegalStateException>
	//  609 1366:dup             
	//  610 1367:invokespecial   #359 <Method void IllegalStateException()>
	//  611 1370:athrow          
					}
					((bno) (obj)).c(j1 + 8 + 8);
	//  612 1371:aload           34
	//  613 1373:iload           12
	//  614 1375:bipush          8
	//  615 1377:iadd            
	//  616 1378:bipush          8
	//  617 1380:iadd            
	//  618 1381:invokevirtual   #65  <Method void bno.c(int)>
					int i3;
					if(flag)
	//* 619 1384:iload           5
	//* 620 1386:ifeq            1406
					{
						i3 = ((bno) (obj)).g();
	//  621 1389:aload           34
	//  622 1391:invokevirtual   #139 <Method int bno.g()>
	//  623 1394:istore          13
						((bno) (obj)).d(6);
	//  624 1396:aload           34
	//  625 1398:bipush          6
	//  626 1400:invokevirtual   #94  <Method void bno.d(int)>
					} else
	//* 627 1403:goto            1416
					{
						((bno) (obj)).d(8);
	//  628 1406:aload           34
	//  629 1408:bipush          8
	//  630 1410:invokevirtual   #94  <Method void bno.d(int)>
						i3 = 0;
	//  631 1413:iconst_0        
	//  632 1414:istore          13
					}
					int j4;
					if(i3 != 0 && i3 != 1)
	//* 633 1416:iload           13
	//* 634 1418:ifeq            1496
	//* 635 1421:iload           13
	//* 636 1423:iconst_1        
	//* 637 1424:icmpne          1430
	//* 638 1427:goto            1496
					{
						if(i3 == 2)
	//* 639 1430:iload           13
	//* 640 1432:iconst_2        
	//* 641 1433:icmpne          1474
						{
							((bno) (obj)).d(16);
	//  642 1436:aload           34
	//  643 1438:bipush          16
	//  644 1440:invokevirtual   #94  <Method void bno.d(int)>
							i3 = (int)Math.round(Double.longBitsToDouble(((bno) (obj)).m()));
	//  645 1443:aload           34
	//  646 1445:invokevirtual   #361 <Method long bno.m()>
	//  647 1448:invokestatic    #367 <Method double Double.longBitsToDouble(long)>
	//  648 1451:invokestatic    #373 <Method long Math.round(double)>
	//  649 1454:l2i             
	//  650 1455:istore          13
							j4 = ((bno) (obj)).o();
	//  651 1457:aload           34
	//  652 1459:invokevirtual   #376 <Method int bno.o()>
	//  653 1462:istore          14
							((bno) (obj)).d(20);
	//  654 1464:aload           34
	//  655 1466:bipush          20
	//  656 1468:invokevirtual   #94  <Method void bno.d(int)>
						} else
	//* 657 1471:goto            1534
						{
							bgl1 = ((bgl) (obj1));
	//  658 1474:aload           35
	//  659 1476:astore_1        
							i3 = j;
	//  660 1477:iload           11
	//  661 1479:istore          13
							j = j1;
	//  662 1481:iload           12
	//  663 1483:istore          11
							j1 = i3;
	//  664 1485:iload           13
	//  665 1487:istore          12
							obj1 = obj2;
	//  666 1489:aload           36
	//  667 1491:astore          35
							break label1;
	//  668 1493:goto            3485
						}
					} else
					{
						j4 = ((bno) (obj)).g();
	//  669 1496:aload           34
	//  670 1498:invokevirtual   #139 <Method int bno.g()>
	//  671 1501:istore          14
						((bno) (obj)).d(6);
	//  672 1503:aload           34
	//  673 1505:bipush          6
	//  674 1507:invokevirtual   #94  <Method void bno.d(int)>
						int l5 = ((bno) (obj)).n();
	//  675 1510:aload           34
	//  676 1512:invokevirtual   #378 <Method int bno.n()>
	//  677 1515:istore          16
						if(i3 == 1)
	//* 678 1517:iload           13
	//* 679 1519:iconst_1        
	//* 680 1520:icmpne          1530
							((bno) (obj)).d(16);
	//  681 1523:aload           34
	//  682 1525:bipush          16
	//  683 1527:invokevirtual   #94  <Method void bno.d(int)>
						i3 = l5;
	//  684 1530:iload           16
	//  685 1532:istore          13
					}
					int k7 = ((bno) (obj)).d();
	//  686 1534:aload           34
	//  687 1536:invokevirtual   #62  <Method int bno.d()>
	//  688 1539:istore          19
					if(i5 == bgj.aa)
	//* 689 1541:iload           15
	//* 690 1543:getstatic       #271 <Field int bgj.aa>
	//* 691 1546:icmpne          1574
					{
						i5 = a(((bno) (obj)), j1, k10, ((bgq) (obj1)), j);
	//  692 1549:aload           34
	//  693 1551:iload           12
	//  694 1553:iload           24
	//  695 1555:aload           35
	//  696 1557:iload           11
	//  697 1559:invokestatic    #380 <Method int a(bno, int, int, bgq, int)>
	//  698 1562:istore          15
						((bno) (obj)).c(k7);
	//  699 1564:aload           34
	//  700 1566:iload           19
	//  701 1568:invokevirtual   #65  <Method void bno.c(int)>
					}
	//* 702 1571:goto            1574
					int i6 = j;
	//  703 1574:iload           11
	//  704 1576:istore          16
					if(i5 == bgj.n)
	//* 705 1578:iload           15
	//* 706 1580:getstatic       #274 <Field int bgj.n>
	//* 707 1583:icmpne          1592
						bgl1 = "audio/ac3";
	//  708 1586:ldc1            #147 <String "audio/ac3">
	//  709 1588:astore_1        
					else
	//* 710 1589:goto            1747
					if(i5 == bgj.p)
	//* 711 1592:iload           15
	//* 712 1594:getstatic       #276 <Field int bgj.p>
	//* 713 1597:icmpne          1606
						bgl1 = "audio/eac3";
	//  714 1600:ldc1            #145 <String "audio/eac3">
	//  715 1602:astore_1        
					else
	//* 716 1603:goto            1747
					if(i5 == bgj.r)
	//* 717 1606:iload           15
	//* 718 1608:getstatic       #279 <Field int bgj.r>
	//* 719 1611:icmpne          1620
						bgl1 = "audio/vnd.dts";
	//  720 1614:ldc1            #143 <String "audio/vnd.dts">
	//  721 1616:astore_1        
					else
	//* 722 1617:goto            1747
					if(i5 != bgj.s && i5 != bgj.t)
	//* 723 1620:iload           15
	//* 724 1622:getstatic       #285 <Field int bgj.s>
	//* 725 1625:icmpeq          1744
	//* 726 1628:iload           15
	//* 727 1630:getstatic       #288 <Field int bgj.t>
	//* 728 1633:icmpne          1639
	//* 729 1636:goto            1744
					{
						if(i5 == bgj.u)
	//* 730 1639:iload           15
	//* 731 1641:getstatic       #282 <Field int bgj.u>
	//* 732 1644:icmpne          1654
							bgl1 = "audio/vnd.dts.hd;profile=lbr";
	//  733 1647:ldc2            #382 <String "audio/vnd.dts.hd;profile=lbr">
	//  734 1650:astore_1        
						else
	//* 735 1651:goto            1747
						if(i5 == bgj.ax)
	//* 736 1654:iload           15
	//* 737 1656:getstatic       #291 <Field int bgj.ax>
	//* 738 1659:icmpne          1669
							bgl1 = "audio/3gpp";
	//  739 1662:ldc2            #384 <String "audio/3gpp">
	//  740 1665:astore_1        
						else
	//* 741 1666:goto            1747
						if(i5 == bgj.ay)
	//* 742 1669:iload           15
	//* 743 1671:getstatic       #294 <Field int bgj.ay>
	//* 744 1674:icmpne          1684
							bgl1 = "audio/amr-wb";
	//  745 1677:ldc2            #386 <String "audio/amr-wb">
	//  746 1680:astore_1        
						else
	//* 747 1681:goto            1747
						if(i5 != bgj.l && i5 != bgj.m)
	//* 748 1684:iload           15
	//* 749 1686:getstatic       #296 <Field int bgj.l>
	//* 750 1689:icmpeq          1737
	//* 751 1692:iload           15
	//* 752 1694:getstatic       #299 <Field int bgj.m>
	//* 753 1697:icmpne          1703
	//* 754 1700:goto            1737
						{
							if(i5 == bgj.j)
	//* 755 1703:iload           15
	//* 756 1705:getstatic       #301 <Field int bgj.j>
	//* 757 1708:icmpne          1717
								bgl1 = "audio/mpeg";
	//  758 1711:ldc1            #149 <String "audio/mpeg">
	//  759 1713:astore_1        
							else
	//* 760 1714:goto            1747
							if(i5 == bgj.aN)
	//* 761 1717:iload           15
	//* 762 1719:getstatic       #304 <Field int bgj.aN>
	//* 763 1722:icmpne          1732
								bgl1 = "audio/alac";
	//  764 1725:ldc2            #388 <String "audio/alac">
	//  765 1728:astore_1        
							else
	//* 766 1729:goto            1747
								bgl1 = null;
	//  767 1732:aconst_null     
	//  768 1733:astore_1        
						} else
	//* 769 1734:goto            1747
						{
							bgl1 = "audio/raw";
	//  770 1737:ldc2            #390 <String "audio/raw">
	//  771 1740:astore_1        
						}
					} else
	//* 772 1741:goto            1747
					{
						bgl1 = "audio/vnd.dts.hd";
	//  773 1744:ldc1            #141 <String "audio/vnd.dts.hd">
	//  774 1746:astore_1        
					}
					i5 = j4;
	//  775 1747:iload           14
	//  776 1749:istore          15
					j4 = i3;
	//  777 1751:iload           13
	//  778 1753:istore          14
					i3 = k7;
	//  779 1755:iload           19
	//  780 1757:istore          13
					Object obj3 = null;
	//  781 1759:aconst_null     
	//  782 1760:astore          37
					j = j1;
	//  783 1762:iload           12
	//  784 1764:istore          11
					j1 = i6;
	//  785 1766:iload           16
	//  786 1768:istore          12
label5:
					do
					{
						int j8;
label6:
						{
							int k6;
label7:
							{
								zzhp zzhp1 = zzhp;
	//  787 1770:aload           4
	//  788 1772:astore          40
								if(i3 - j >= k10)
									break label5;
	//  789 1774:iload           13
	//  790 1776:iload           11
	//  791 1778:isub            
	//  792 1779:iload           24
	//  793 1781:icmpge          2212
								((bno) (obj)).c(i3);
	//  794 1784:aload           34
	//  795 1786:iload           13
	//  796 1788:invokevirtual   #65  <Method void bno.c(int)>
								j8 = ((bno) (obj)).l();
	//  797 1791:aload           34
	//  798 1793:invokevirtual   #68  <Method int bno.l()>
	//  799 1796:istore          20
								boolean flag2;
								if(j8 > 0)
	//* 800 1798:iload           20
	//* 801 1800:ifle            1809
									flag2 = true;
	//  802 1803:iconst_1        
	//  803 1804:istore          33
								else
	//* 804 1806:goto            1812
									flag2 = false;
	//  805 1809:iconst_0        
	//  806 1810:istore          33
								bnf.a(flag2, "childAtomSize should be positive");
	//  807 1812:iload           33
	//  808 1814:ldc1            #70  <String "childAtomSize should be positive">
	//  809 1816:invokestatic    #75  <Method void bnf.a(boolean, Object)>
								int i9 = ((bno) (obj)).l();
	//  810 1819:aload           34
	//  811 1821:invokevirtual   #68  <Method int bno.l()>
	//  812 1824:istore          21
								if(i9 != bgj.J && (!flag || i9 != bgj.k))
	//* 813 1826:iload           21
	//* 814 1828:getstatic       #393 <Field int bgj.J>
	//* 815 1831:icmpeq          2015
	//* 816 1834:iload           5
	//* 817 1836:ifeq            1850
	//* 818 1839:iload           21
	//* 819 1841:getstatic       #396 <Field int bgj.k>
	//* 820 1844:icmpne          1850
	//* 821 1847:goto            2015
								{
									if(i9 == bgj.o)
	//* 822 1850:iload           21
	//* 823 1852:getstatic       #398 <Field int bgj.o>
	//* 824 1855:icmpne          1890
									{
										((bno) (obj)).c(i3 + 8);
	//  825 1858:aload           34
	//  826 1860:iload           13
	//  827 1862:bipush          8
	//  828 1864:iadd            
	//  829 1865:invokevirtual   #65  <Method void bno.c(int)>
										obj1.b = bdt.a(((bno) (obj)), Integer.toString(i10), ((String) (obj2)), zzhp1);
	//  830 1868:aload           35
	//  831 1870:aload           34
	//  832 1872:iload           22
	//  833 1874:invokestatic    #325 <Method String Integer.toString(int)>
	//  834 1877:aload           36
	//  835 1879:aload           40
	//  836 1881:invokestatic    #403 <Method zzfs bdt.a(bno, String, String, zzhp)>
	//  837 1884:putfield        #335 <Field zzfs bgq.b>
									} else
	//* 838 1887:goto            2012
									if(i9 == bgj.q)
	//* 839 1890:iload           21
	//* 840 1892:getstatic       #406 <Field int bgj.q>
	//* 841 1895:icmpne          1930
									{
										((bno) (obj)).c(i3 + 8);
	//  842 1898:aload           34
	//  843 1900:iload           13
	//  844 1902:bipush          8
	//  845 1904:iadd            
	//  846 1905:invokevirtual   #65  <Method void bno.c(int)>
										obj1.b = bdt.b(((bno) (obj)), Integer.toString(i10), ((String) (obj2)), zzhp1);
	//  847 1908:aload           35
	//  848 1910:aload           34
	//  849 1912:iload           22
	//  850 1914:invokestatic    #325 <Method String Integer.toString(int)>
	//  851 1917:aload           36
	//  852 1919:aload           40
	//  853 1921:invokestatic    #408 <Method zzfs bdt.b(bno, String, String, zzhp)>
	//  854 1924:putfield        #335 <Field zzfs bgq.b>
									} else
	//* 855 1927:goto            2012
									if(i9 == bgj.v)
	//* 856 1930:iload           21
	//* 857 1932:getstatic       #411 <Field int bgj.v>
	//* 858 1935:icmpne          1968
									{
										obj1.b = zzfs.a(Integer.toString(i10), ((String) (bgl1)), ((String) (null)), -1, -1, i5, j4, ((java.util.List) (null)), zzhp, 0, ((String) (obj2)));
	//  859 1938:aload           35
	//  860 1940:iload           22
	//  861 1942:invokestatic    #325 <Method String Integer.toString(int)>
	//  862 1945:aload_1         
	//  863 1946:aconst_null     
	//  864 1947:iconst_m1       
	//  865 1948:iconst_m1       
	//  866 1949:iload           15
	//  867 1951:iload           14
	//  868 1953:aconst_null     
	//  869 1954:aload           4
	//  870 1956:iconst_0        
	//  871 1957:aload           36
	//  872 1959:invokestatic    #414 <Method zzfs zzfs.a(String, String, String, int, int, int, int, java.util.List, zzhp, int, String)>
	//  873 1962:putfield        #335 <Field zzfs bgq.b>
									} else
	//* 874 1965:goto            2012
									{
										int j6 = j8;
	//  875 1968:iload           20
	//  876 1970:istore          16
										bgl bgl2 = bgl1;
	//  877 1972:aload_1         
	//  878 1973:astore          40
										if(i9 == bgj.aN)
	//* 879 1975:iload           21
	//* 880 1977:getstatic       #304 <Field int bgj.aN>
	//* 881 1980:icmpne          2012
										{
											obj3 = ((Object) (new byte[j6]));
	//  882 1983:iload           16
	//  883 1985:newarray        byte[]
	//  884 1987:astore          37
											((bno) (obj)).c(i3);
	//  885 1989:aload           34
	//  886 1991:iload           13
	//  887 1993:invokevirtual   #65  <Method void bno.c(int)>
											((bno) (obj)).a(((byte []) (obj3)), 0, j6);
	//  888 1996:aload           34
	//  889 1998:aload           37
	//  890 2000:iconst_0        
	//  891 2001:iload           16
	//  892 2003:invokevirtual   #103 <Method void bno.a(byte[], int, int)>
											bgl1 = bgl2;
	//  893 2006:aload           40
	//  894 2008:astore_1        
										}
									}
									break label6;
	//  895 2009:goto            2202
								}
	//* 896 2012:goto            2202
								int l7 = i3;
	//  897 2015:iload           13
	//  898 2017:istore          19
								if(i9 == bgj.J)
	//* 899 2019:iload           21
	//* 900 2021:getstatic       #393 <Field int bgj.J>
	//* 901 2024:icmpne          2034
								{
									k6 = l7;
	//  902 2027:iload           19
	//  903 2029:istore          16
									break label7;
	//  904 2031:goto            2113
								}
								int j9;
								for(k6 = ((bno) (obj)).d(); k6 - l7 < j8; k6 += j9)
	//* 905 2034:aload           34
	//* 906 2036:invokevirtual   #62  <Method int bno.d()>
	//* 907 2039:istore          16
	//* 908 2041:iload           16
	//* 909 2043:iload           19
	//* 910 2045:isub            
	//* 911 2046:iload           20
	//* 912 2048:icmpge          2110
								{
									((bno) (obj)).c(k6);
	//  913 2051:aload           34
	//  914 2053:iload           16
	//  915 2055:invokevirtual   #65  <Method void bno.c(int)>
									j9 = ((bno) (obj)).l();
	//  916 2058:aload           34
	//  917 2060:invokevirtual   #68  <Method int bno.l()>
	//  918 2063:istore          21
									boolean flag3;
									if(j9 > 0)
	//* 919 2065:iload           21
	//* 920 2067:ifle            2076
										flag3 = true;
	//  921 2070:iconst_1        
	//  922 2071:istore          33
									else
	//* 923 2073:goto            2079
										flag3 = false;
	//  924 2076:iconst_0        
	//  925 2077:istore          33
									bnf.a(flag3, "childAtomSize should be positive");
	//  926 2079:iload           33
	//  927 2081:ldc1            #70  <String "childAtomSize should be positive">
	//  928 2083:invokestatic    #75  <Method void bnf.a(boolean, Object)>
									if(((bno) (obj)).l() == bgj.J)
	//* 929 2086:aload           34
	//* 930 2088:invokevirtual   #68  <Method int bno.l()>
	//* 931 2091:getstatic       #393 <Field int bgj.J>
	//* 932 2094:icmpne          2100
										break label7;
	//  933 2097:goto            2113
								}

	//  934 2100:iload           16
	//  935 2102:iload           21
	//  936 2104:iadd            
	//  937 2105:istore          16
	//* 938 2107:goto            2041
								k6 = -1;
	//  939 2110:iconst_m1       
	//  940 2111:istore          16
							}
							if(k6 != -1)
	//* 941 2113:iload           16
	//* 942 2115:iconst_m1       
	//* 943 2116:icmpeq          2202
							{
								bgl1 = ((bgl) (a(((bno) (obj)), k6)));
	//  944 2119:aload           34
	//  945 2121:iload           16
	//  946 2123:invokestatic    #416 <Method Pair a(bno, int)>
	//  947 2126:astore_1        
								String s1 = (String)((Pair) (bgl1)).first;
	//  948 2127:aload_1         
	//  949 2128:getfield        #131 <Field Object Pair.first>
	//  950 2131:checkcast       #247 <Class String>
	//  951 2134:astore          40
								byte abyte1[] = (byte[])((Pair) (bgl1)).second;
	//  952 2136:aload_1         
	//  953 2137:getfield        #128 <Field Object Pair.second>
	//  954 2140:checkcast       #417 <Class byte[]>
	//  955 2143:astore          41
								bgl1 = ((bgl) (s1));
	//  956 2145:aload           40
	//  957 2147:astore_1        
								obj3 = ((Object) (abyte1));
	//  958 2148:aload           41
	//  959 2150:astore          37
								if("audio/mp4a-latm".equals(((Object) (s1))))
	//* 960 2152:ldc1            #151 <String "audio/mp4a-latm">
	//* 961 2154:aload           40
	//* 962 2156:invokevirtual   #421 <Method boolean String.equals(Object)>
	//* 963 2159:ifeq            2202
								{
									bgl1 = ((bgl) (bng.a(abyte1)));
	//  964 2162:aload           41
	//  965 2164:invokestatic    #426 <Method Pair bng.a(byte[])>
	//  966 2167:astore_1        
									j4 = ((Integer)((Pair) (bgl1)).first).intValue();
	//  967 2168:aload_1         
	//  968 2169:getfield        #131 <Field Object Pair.first>
	//  969 2172:checkcast       #85  <Class Integer>
	//  970 2175:invokevirtual   #134 <Method int Integer.intValue()>
	//  971 2178:istore          14
									i5 = ((Integer)((Pair) (bgl1)).second).intValue();
	//  972 2180:aload_1         
	//  973 2181:getfield        #128 <Field Object Pair.second>
	//  974 2184:checkcast       #85  <Class Integer>
	//  975 2187:invokevirtual   #134 <Method int Integer.intValue()>
	//  976 2190:istore          15
									bgl1 = ((bgl) (s1));
	//  977 2192:aload           40
	//  978 2194:astore_1        
									obj3 = ((Object) (abyte1));
	//  979 2195:aload           41
	//  980 2197:astore          37
								}
							}
						}
	//* 981 2199:goto            2202
						i3 += j8;
	//  982 2202:iload           13
	//  983 2204:iload           20
	//  984 2206:iadd            
	//  985 2207:istore          13
					} while(true);
	//  986 2209:goto            1770
					if(((bgq) (obj1)).b == null && bgl1 != null)
	//* 987 2212:aload           35
	//* 988 2214:getfield        #335 <Field zzfs bgq.b>
	//* 989 2217:ifnonnull       2298
	//* 990 2220:aload_1         
	//* 991 2221:ifnull          2298
					{
						byte byte0;
						if("audio/raw".equals(((Object) (bgl1))))
	//* 992 2224:ldc2            #390 <String "audio/raw">
	//* 993 2227:aload_1         
	//* 994 2228:invokevirtual   #421 <Method boolean String.equals(Object)>
	//* 995 2231:ifeq            2240
							byte0 = 2;
	//  996 2234:iconst_2        
	//  997 2235:istore          13
						else
	//* 998 2237:goto            2243
							byte0 = -1;
	//  999 2240:iconst_m1       
	// 1000 2241:istore          13
						String s2 = Integer.toString(i10);
	// 1001 2243:iload           22
	// 1002 2245:invokestatic    #325 <Method String Integer.toString(int)>
	// 1003 2248:astore          40
						if(obj3 == null)
	//*1004 2250:aload           37
	//*1005 2252:ifnonnull       2261
							obj3 = null;
	// 1006 2255:aconst_null     
	// 1007 2256:astore          37
						else
	//*1008 2258:goto            2268
							obj3 = ((Object) (Collections.singletonList(obj3)));
	// 1009 2261:aload           37
	// 1010 2263:invokestatic    #345 <Method java.util.List Collections.singletonList(Object)>
	// 1011 2266:astore          37
						obj1.b = zzfs.a(s2, ((String) (bgl1)), ((String) (null)), -1, -1, i5, j4, ((int) (byte0)), ((java.util.List) (obj3)), zzhp, 0, ((String) (obj2)));
	// 1012 2268:aload           35
	// 1013 2270:aload           40
	// 1014 2272:aload_1         
	// 1015 2273:aconst_null     
	// 1016 2274:iconst_m1       
	// 1017 2275:iconst_m1       
	// 1018 2276:iload           15
	// 1019 2278:iload           14
	// 1020 2280:iload           13
	// 1021 2282:aload           37
	// 1022 2284:aload           4
	// 1023 2286:iconst_0        
	// 1024 2287:aload           36
	// 1025 2289:invokestatic    #429 <Method zzfs zzfs.a(String, String, String, int, int, int, int, int, java.util.List, zzhp, int, String)>
	// 1026 2292:putfield        #335 <Field zzfs bgq.b>
					}
	//*1027 2295:goto            2298
					bgl1 = ((bgl) (obj1));
	// 1028 2298:aload           35
	// 1029 2300:astore_1        
					obj1 = obj2;
	// 1030 2301:aload           36
	// 1031 2303:astore          35
					break label1;
	// 1032 2305:goto            3485
				}
				bgl1 = ((bgl) (obj2));
	// 1033 2308:aload           36
	// 1034 2310:astore_1        
				((bno) (obj)).c(j1 + 8 + 8);
	// 1035 2311:aload           34
	// 1036 2313:iload           12
	// 1037 2315:bipush          8
	// 1038 2317:iadd            
	// 1039 2318:bipush          8
	// 1040 2320:iadd            
	// 1041 2321:invokevirtual   #65  <Method void bno.c(int)>
				((bno) (obj)).d(16);
	// 1042 2324:aload           34
	// 1043 2326:bipush          16
	// 1044 2328:invokevirtual   #94  <Method void bno.d(int)>
				int l10 = ((bno) (obj)).g();
	// 1045 2331:aload           34
	// 1046 2333:invokevirtual   #139 <Method int bno.g()>
	// 1047 2336:istore          25
				int i11 = ((bno) (obj)).g();
	// 1048 2338:aload           34
	// 1049 2340:invokevirtual   #139 <Method int bno.g()>
	// 1050 2343:istore          26
				((bno) (obj)).d(50);
	// 1051 2345:aload           34
	// 1052 2347:bipush          50
	// 1053 2349:invokevirtual   #94  <Method void bno.d(int)>
				int k8 = ((bno) (obj)).d();
	// 1054 2352:aload           34
	// 1055 2354:invokevirtual   #62  <Method int bno.d()>
	// 1056 2357:istore          20
				int j3;
				if(i5 == bgj.Z)
	//*1057 2359:iload           15
	//*1058 2361:getstatic       #253 <Field int bgj.Z>
	//*1059 2364:icmpne          2392
				{
					j3 = a(((bno) (obj)), j1, k10, ((bgq) (obj1)), j);
	// 1060 2367:aload           34
	// 1061 2369:iload           12
	// 1062 2371:iload           24
	// 1063 2373:aload           35
	// 1064 2375:iload           11
	// 1065 2377:invokestatic    #380 <Method int a(bno, int, int, bgq, int)>
	// 1066 2380:istore          13
					((bno) (obj)).c(k8);
	// 1067 2382:aload           34
	// 1068 2384:iload           20
	// 1069 2386:invokevirtual   #65  <Method void bno.c(int)>
				} else
	//*1070 2389:goto            2396
				{
					j3 = i5;
	// 1071 2392:iload           15
	// 1072 2394:istore          13
				}
				int k4 = j;
	// 1073 2396:iload           11
	// 1074 2398:istore          14
				Object obj6 = null;
	// 1075 2400:aconst_null     
	// 1076 2401:astore          42
				int i8 = 0;
	// 1077 2403:iconst_0        
	// 1078 2404:istore          19
				float f1 = 1.0F;
	// 1079 2406:fconst_1        
	// 1080 2407:fstore          9
				int l6 = -1;
	// 1081 2409:iconst_m1       
	// 1082 2410:istore          16
				Object obj5 = null;
	// 1083 2412:aconst_null     
	// 1084 2413:astore          41
				byte abyte0[] = null;
	// 1085 2415:aconst_null     
	// 1086 2416:astore          40
				i5 = k8;
	// 1087 2418:iload           20
	// 1088 2420:istore          15
				j = j3;
	// 1089 2422:iload           13
	// 1090 2424:istore          11
label8:
				while(i5 - j1 < k10) 
	//*1091 2426:iload           15
	//*1092 2428:iload           12
	//*1093 2430:isub            
	//*1094 2431:iload           24
	//*1095 2433:icmpge          3403
				{
					float f2;
					int k3;
					int l8;
					int j11;
					Object obj4;
					Object obj7;
label9:
					{
label10:
						{
label11:
							{
								((bno) (obj)).c(i5);
	// 1096 2436:aload           34
	// 1097 2438:iload           15
	// 1098 2440:invokevirtual   #65  <Method void bno.c(int)>
								l8 = ((bno) (obj)).d();
	// 1099 2443:aload           34
	// 1100 2445:invokevirtual   #62  <Method int bno.d()>
	// 1101 2448:istore          20
								j11 = ((bno) (obj)).l();
	// 1102 2450:aload           34
	// 1103 2452:invokevirtual   #68  <Method int bno.l()>
	// 1104 2455:istore          27
								if(j11 == 0 && ((bno) (obj)).d() - j1 == k10)
	//*1105 2457:iload           27
	//*1106 2459:ifne            2481
	//*1107 2462:aload           34
	//*1108 2464:invokevirtual   #62  <Method int bno.d()>
	//*1109 2467:iload           12
	//*1110 2469:isub            
	//*1111 2470:iload           24
	//*1112 2472:icmpeq          2478
									break label8;
	// 1113 2475:goto            2481
	//*1114 2478:goto            3403
								boolean flag4;
								if(j11 > 0)
	//*1115 2481:iload           27
	//*1116 2483:ifle            2492
									flag4 = true;
	// 1117 2486:iconst_1        
	// 1118 2487:istore          33
								else
	//*1119 2489:goto            2495
									flag4 = false;
	// 1120 2492:iconst_0        
	// 1121 2493:istore          33
								bnf.a(flag4, "childAtomSize should be positive");
	// 1122 2495:iload           33
	// 1123 2497:ldc1            #70  <String "childAtomSize should be positive">
	// 1124 2499:invokestatic    #75  <Method void bnf.a(boolean, Object)>
								k3 = ((bno) (obj)).l();
	// 1125 2502:aload           34
	// 1126 2504:invokevirtual   #68  <Method int bno.l()>
	// 1127 2507:istore          13
								if(k3 == bgj.H)
	//*1128 2509:iload           13
	//*1129 2511:getstatic       #432 <Field int bgj.H>
	//*1130 2514:icmpne          2605
								{
									boolean flag5;
									if(obj6 == null)
	//*1131 2517:aload           42
	//*1132 2519:ifnonnull       2528
										flag5 = true;
	// 1133 2522:iconst_1        
	// 1134 2523:istore          33
									else
	//*1135 2525:goto            2531
										flag5 = false;
	// 1136 2528:iconst_0        
	// 1137 2529:istore          33
									bnf.b(flag5);
	// 1138 2531:iload           33
	// 1139 2533:invokestatic    #435 <Method void bnf.b(boolean)>
									obj2 = "video/avc";
	// 1140 2536:ldc1            #155 <String "video/avc">
	// 1141 2538:astore          36
									((bno) (obj)).c(l8 + 8);
	// 1142 2540:aload           34
	// 1143 2542:iload           20
	// 1144 2544:bipush          8
	// 1145 2546:iadd            
	// 1146 2547:invokevirtual   #65  <Method void bno.c(int)>
									obj5 = ((Object) (bnz.a(((bno) (obj)))));
	// 1147 2550:aload           34
	// 1148 2552:invokestatic    #440 <Method bnz bnz.a(bno)>
	// 1149 2555:astore          41
									obj4 = ((Object) (((bnz) (obj5)).a));
	// 1150 2557:aload           41
	// 1151 2559:getfield        #443 <Field java.util.List bnz.a>
	// 1152 2562:astore          37
									obj1.c = ((bnz) (obj5)).b;
	// 1153 2564:aload           35
	// 1154 2566:aload           41
	// 1155 2568:getfield        #444 <Field int bnz.b>
	// 1156 2571:putfield        #445 <Field int bgq.c>
									if(i8 == 0)
	//*1157 2574:iload           19
	//*1158 2576:ifne            2586
										f1 = ((bnz) (obj5)).c;
	// 1159 2579:aload           41
	// 1160 2581:getfield        #447 <Field float bnz.c>
	// 1161 2584:fstore          9
									l8 = i8;
	// 1162 2586:iload           19
	// 1163 2588:istore          20
									f2 = f1;
	// 1164 2590:fload           9
	// 1165 2592:fstore          10
									k3 = l6;
	// 1166 2594:iload           16
	// 1167 2596:istore          13
									obj7 = ((Object) (abyte0));
	// 1168 2598:aload           40
	// 1169 2600:astore          43
									break label9;
	// 1170 2602:goto            3369
								}
								if(k3 == bgj.I)
	//*1171 2605:iload           13
	//*1172 2607:getstatic       #449 <Field int bgj.I>
	//*1173 2610:icmpne          2689
								{
									boolean flag6;
									if(obj6 == null)
	//*1174 2613:aload           42
	//*1175 2615:ifnonnull       2624
										flag6 = true;
	// 1176 2618:iconst_1        
	// 1177 2619:istore          33
									else
	//*1178 2621:goto            2627
										flag6 = false;
	// 1179 2624:iconst_0        
	// 1180 2625:istore          33
									bnf.b(flag6);
	// 1181 2627:iload           33
	// 1182 2629:invokestatic    #435 <Method void bnf.b(boolean)>
									obj2 = "video/hevc";
	// 1183 2632:ldc1            #153 <String "video/hevc">
	// 1184 2634:astore          36
									((bno) (obj)).c(l8 + 8);
	// 1185 2636:aload           34
	// 1186 2638:iload           20
	// 1187 2640:bipush          8
	// 1188 2642:iadd            
	// 1189 2643:invokevirtual   #65  <Method void bno.c(int)>
									obj5 = ((Object) (bod.a(((bno) (obj)))));
	// 1190 2646:aload           34
	// 1191 2648:invokestatic    #454 <Method bod bod.a(bno)>
	// 1192 2651:astore          41
									obj4 = ((Object) (((bod) (obj5)).a));
	// 1193 2653:aload           41
	// 1194 2655:getfield        #455 <Field java.util.List bod.a>
	// 1195 2658:astore          37
									obj1.c = ((bod) (obj5)).b;
	// 1196 2660:aload           35
	// 1197 2662:aload           41
	// 1198 2664:getfield        #456 <Field int bod.b>
	// 1199 2667:putfield        #445 <Field int bgq.c>
									l8 = i8;
	// 1200 2670:iload           19
	// 1201 2672:istore          20
									f2 = f1;
	// 1202 2674:fload           9
	// 1203 2676:fstore          10
									k3 = l6;
	// 1204 2678:iload           16
	// 1205 2680:istore          13
									obj7 = ((Object) (abyte0));
	// 1206 2682:aload           40
	// 1207 2684:astore          43
									break label9;
	// 1208 2686:goto            3369
								}
								if(k3 == bgj.aL)
	//*1209 2689:iload           13
	//*1210 2691:getstatic       #459 <Field int bgj.aL>
	//*1211 2694:icmpne          2760
								{
									boolean flag7;
									if(obj6 == null)
	//*1212 2697:aload           42
	//*1213 2699:ifnonnull       2708
										flag7 = true;
	// 1214 2702:iconst_1        
	// 1215 2703:istore          33
									else
	//*1216 2705:goto            2711
										flag7 = false;
	// 1217 2708:iconst_0        
	// 1218 2709:istore          33
									bnf.b(flag7);
	// 1219 2711:iload           33
	// 1220 2713:invokestatic    #435 <Method void bnf.b(boolean)>
									if(j == bgj.aJ)
	//*1221 2716:iload           11
	//*1222 2718:getstatic       #262 <Field int bgj.aJ>
	//*1223 2721:icmpne          2732
										obj2 = "video/x-vnd.on2.vp8";
	// 1224 2724:ldc2            #461 <String "video/x-vnd.on2.vp8">
	// 1225 2727:astore          36
									else
	//*1226 2729:goto            2737
										obj2 = "video/x-vnd.on2.vp9";
	// 1227 2732:ldc2            #463 <String "video/x-vnd.on2.vp9">
	// 1228 2735:astore          36
									l8 = i8;
	// 1229 2737:iload           19
	// 1230 2739:istore          20
									f2 = f1;
	// 1231 2741:fload           9
	// 1232 2743:fstore          10
									k3 = l6;
	// 1233 2745:iload           16
	// 1234 2747:istore          13
									obj4 = obj5;
	// 1235 2749:aload           41
	// 1236 2751:astore          37
									obj7 = ((Object) (abyte0));
	// 1237 2753:aload           40
	// 1238 2755:astore          43
									break label9;
	// 1239 2757:goto            3369
								}
								if(k3 == bgj.g)
	//*1240 2760:iload           13
	//*1241 2762:getstatic       #464 <Field int bgj.g>
	//*1242 2765:icmpne          2815
								{
									boolean flag8;
									if(obj6 == null)
	//*1243 2768:aload           42
	//*1244 2770:ifnonnull       2779
										flag8 = true;
	// 1245 2773:iconst_1        
	// 1246 2774:istore          33
									else
	//*1247 2776:goto            2782
										flag8 = false;
	// 1248 2779:iconst_0        
	// 1249 2780:istore          33
									bnf.b(flag8);
	// 1250 2782:iload           33
	// 1251 2784:invokestatic    #435 <Method void bnf.b(boolean)>
									obj2 = "video/3gpp";
	// 1252 2787:ldc2            #466 <String "video/3gpp">
	// 1253 2790:astore          36
									l8 = i8;
	// 1254 2792:iload           19
	// 1255 2794:istore          20
									f2 = f1;
	// 1256 2796:fload           9
	// 1257 2798:fstore          10
									k3 = l6;
	// 1258 2800:iload           16
	// 1259 2802:istore          13
									obj4 = obj5;
	// 1260 2804:aload           41
	// 1261 2806:astore          37
									obj7 = ((Object) (abyte0));
	// 1262 2808:aload           40
	// 1263 2810:astore          43
									break label9;
	// 1264 2812:goto            3369
								}
								if(k3 == bgj.J)
	//*1265 2815:iload           13
	//*1266 2817:getstatic       #393 <Field int bgj.J>
	//*1267 2820:icmpne          2893
								{
									boolean flag9;
									if(obj6 == null)
	//*1268 2823:aload           42
	//*1269 2825:ifnonnull       2834
										flag9 = true;
	// 1270 2828:iconst_1        
	// 1271 2829:istore          33
									else
	//*1272 2831:goto            2837
										flag9 = false;
	// 1273 2834:iconst_0        
	// 1274 2835:istore          33
									bnf.b(flag9);
	// 1275 2837:iload           33
	// 1276 2839:invokestatic    #435 <Method void bnf.b(boolean)>
									obj4 = ((Object) (a(((bno) (obj)), l8)));
	// 1277 2842:aload           34
	// 1278 2844:iload           20
	// 1279 2846:invokestatic    #416 <Method Pair a(bno, int)>
	// 1280 2849:astore          37
									obj2 = ((Object) ((String)((Pair) (obj4)).first));
	// 1281 2851:aload           37
	// 1282 2853:getfield        #131 <Field Object Pair.first>
	// 1283 2856:checkcast       #247 <Class String>
	// 1284 2859:astore          36
									obj4 = ((Object) (Collections.singletonList(((Object) ((byte[])((Pair) (obj4)).second)))));
	// 1285 2861:aload           37
	// 1286 2863:getfield        #128 <Field Object Pair.second>
	// 1287 2866:checkcast       #417 <Class byte[]>
	// 1288 2869:invokestatic    #345 <Method java.util.List Collections.singletonList(Object)>
	// 1289 2872:astore          37
									l8 = i8;
	// 1290 2874:iload           19
	// 1291 2876:istore          20
									f2 = f1;
	// 1292 2878:fload           9
	// 1293 2880:fstore          10
									k3 = l6;
	// 1294 2882:iload           16
	// 1295 2884:istore          13
									obj7 = ((Object) (abyte0));
	// 1296 2886:aload           40
	// 1297 2888:astore          43
									break label9;
	// 1298 2890:goto            3369
								}
								if(k3 == bgj.ai)
	//*1299 2893:iload           13
	//*1300 2895:getstatic       #469 <Field int bgj.ai>
	//*1301 2898:icmpne          2956
								{
									((bno) (obj)).c(l8 + 8);
	// 1302 2901:aload           34
	// 1303 2903:iload           20
	// 1304 2905:bipush          8
	// 1305 2907:iadd            
	// 1306 2908:invokevirtual   #65  <Method void bno.c(int)>
									k3 = ((bno) (obj)).o();
	// 1307 2911:aload           34
	// 1308 2913:invokevirtual   #376 <Method int bno.o()>
	// 1309 2916:istore          13
									i8 = ((bno) (obj)).o();
	// 1310 2918:aload           34
	// 1311 2920:invokevirtual   #376 <Method int bno.o()>
	// 1312 2923:istore          19
									f2 = (float)k3 / (float)i8;
	// 1313 2925:iload           13
	// 1314 2927:i2f             
	// 1315 2928:iload           19
	// 1316 2930:i2f             
	// 1317 2931:fdiv            
	// 1318 2932:fstore          10
									l8 = 1;
	// 1319 2934:iconst_1        
	// 1320 2935:istore          20
									obj2 = obj6;
	// 1321 2937:aload           42
	// 1322 2939:astore          36
									k3 = l6;
	// 1323 2941:iload           16
	// 1324 2943:istore          13
									obj4 = obj5;
	// 1325 2945:aload           41
	// 1326 2947:astore          37
									obj7 = ((Object) (abyte0));
	// 1327 2949:aload           40
	// 1328 2951:astore          43
									break label9;
	// 1329 2953:goto            3369
								}
								if(k3 != bgj.aH)
									break label10;
	// 1330 2956:iload           13
	// 1331 2958:getstatic       #472 <Field int bgj.aH>
	// 1332 2961:icmpne          3073
								k3 = l8 + 8;
	// 1333 2964:iload           20
	// 1334 2966:bipush          8
	// 1335 2968:iadd            
	// 1336 2969:istore          13
								obj2 = ((Object) (bgl1));
	// 1337 2971:aload_1         
	// 1338 2972:astore          36
								do
								{
									if(k3 - l8 >= j11)
										break;
	// 1339 2974:iload           13
	// 1340 2976:iload           20
	// 1341 2978:isub            
	// 1342 2979:iload           27
	// 1343 2981:icmpge          3038
									((bno) (obj)).c(k3);
	// 1344 2984:aload           34
	// 1345 2986:iload           13
	// 1346 2988:invokevirtual   #65  <Method void bno.c(int)>
									int k9 = ((bno) (obj)).l();
	// 1347 2991:aload           34
	// 1348 2993:invokevirtual   #68  <Method int bno.l()>
	// 1349 2996:istore          21
									if(((bno) (obj)).l() == bgj.aI)
	//*1350 2998:aload           34
	//*1351 3000:invokevirtual   #68  <Method int bno.l()>
	//*1352 3003:getstatic       #475 <Field int bgj.aI>
	//*1353 3006:icmpne          3028
									{
										bgl1 = ((bgl) (Arrays.copyOfRange(((bno) (obj)).a, k3, k9 + k3)));
	// 1354 3009:aload           34
	// 1355 3011:getfield        #187 <Field byte[] bno.a>
	// 1356 3014:iload           13
	// 1357 3016:iload           21
	// 1358 3018:iload           13
	// 1359 3020:iadd            
	// 1360 3021:invokestatic    #481 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	// 1361 3024:astore_1        
										break label11;
	// 1362 3025:goto            3040
									}
									k3 += k9;
	// 1363 3028:iload           13
	// 1364 3030:iload           21
	// 1365 3032:iadd            
	// 1366 3033:istore          13
								} while(true);
	// 1367 3035:goto            2974
								bgl1 = null;
	// 1368 3038:aconst_null     
	// 1369 3039:astore_1        
							}
							abyte0 = ((byte []) (obj2));
	// 1370 3040:aload           36
	// 1371 3042:astore          40
							obj2 = obj6;
	// 1372 3044:aload           42
	// 1373 3046:astore          36
							l8 = i8;
	// 1374 3048:iload           19
	// 1375 3050:istore          20
							f2 = f1;
	// 1376 3052:fload           9
	// 1377 3054:fstore          10
							k3 = l6;
	// 1378 3056:iload           16
	// 1379 3058:istore          13
							obj4 = obj5;
	// 1380 3060:aload           41
	// 1381 3062:astore          37
							obj7 = ((Object) (bgl1));
	// 1382 3064:aload_1         
	// 1383 3065:astore          43
							bgl1 = ((bgl) (abyte0));
	// 1384 3067:aload           40
	// 1385 3069:astore_1        
							break label9;
	// 1386 3070:goto            3369
						}
						bgl bgl3 = bgl1;
	// 1387 3073:aload_1         
	// 1388 3074:astore          44
						int l9 = j;
	// 1389 3076:iload           11
	// 1390 3078:istore          21
						if(k3 == bgj.aG)
	//*1391 3080:iload           13
	//*1392 3082:getstatic       #484 <Field int bgj.aG>
	//*1393 3085:icmpne          3338
						{
							int k11 = ((bno) (obj)).f();
	// 1394 3088:aload           34
	// 1395 3090:invokevirtual   #59  <Method int bno.f()>
	// 1396 3093:istore          28
							((bno) (obj)).d(3);
	// 1397 3095:aload           34
	// 1398 3097:iconst_3        
	// 1399 3098:invokevirtual   #94  <Method void bno.d(int)>
							obj2 = obj6;
	// 1400 3101:aload           42
	// 1401 3103:astore          36
							l8 = i8;
	// 1402 3105:iload           19
	// 1403 3107:istore          20
							f2 = f1;
	// 1404 3109:fload           9
	// 1405 3111:fstore          10
							k3 = l6;
	// 1406 3113:iload           16
	// 1407 3115:istore          13
							obj4 = obj5;
	// 1408 3117:aload           41
	// 1409 3119:astore          37
							obj7 = ((Object) (abyte0));
	// 1410 3121:aload           40
	// 1411 3123:astore          43
							bgl1 = bgl3;
	// 1412 3125:aload           44
	// 1413 3127:astore_1        
							j = l9;
	// 1414 3128:iload           21
	// 1415 3130:istore          11
							if(k11 == 0)
	//*1416 3132:iload           28
	//*1417 3134:ifne            3369
								switch(((bno) (obj)).f())
	//*1418 3137:aload           34
	//*1419 3139:invokevirtual   #59  <Method int bno.f()>
								{
	//*1420 3142:tableswitch     0 3: default 3172
	//	               0 3305
	//	               1 3272
	//	               2 3239
	//	               3 3206
								default:
									obj2 = obj6;
	// 1421 3172:aload           42
	// 1422 3174:astore          36
									l8 = i8;
	// 1423 3176:iload           19
	// 1424 3178:istore          20
									f2 = f1;
	// 1425 3180:fload           9
	// 1426 3182:fstore          10
									k3 = l6;
	// 1427 3184:iload           16
	// 1428 3186:istore          13
									obj4 = obj5;
	// 1429 3188:aload           41
	// 1430 3190:astore          37
									obj7 = ((Object) (abyte0));
	// 1431 3192:aload           40
	// 1432 3194:astore          43
									bgl1 = bgl3;
	// 1433 3196:aload           44
	// 1434 3198:astore_1        
									j = l9;
	// 1435 3199:iload           21
	// 1436 3201:istore          11
									break;

	//*1437 3203:goto            3369
								case 3: // '\003'
									k3 = 3;
	// 1438 3206:iconst_3        
	// 1439 3207:istore          13
									obj2 = obj6;
	// 1440 3209:aload           42
	// 1441 3211:astore          36
									l8 = i8;
	// 1442 3213:iload           19
	// 1443 3215:istore          20
									f2 = f1;
	// 1444 3217:fload           9
	// 1445 3219:fstore          10
									obj4 = obj5;
	// 1446 3221:aload           41
	// 1447 3223:astore          37
									obj7 = ((Object) (abyte0));
	// 1448 3225:aload           40
	// 1449 3227:astore          43
									bgl1 = bgl3;
	// 1450 3229:aload           44
	// 1451 3231:astore_1        
									j = l9;
	// 1452 3232:iload           21
	// 1453 3234:istore          11
									break;

	//*1454 3236:goto            3369
								case 2: // '\002'
									k3 = 2;
	// 1455 3239:iconst_2        
	// 1456 3240:istore          13
									obj2 = obj6;
	// 1457 3242:aload           42
	// 1458 3244:astore          36
									l8 = i8;
	// 1459 3246:iload           19
	// 1460 3248:istore          20
									f2 = f1;
	// 1461 3250:fload           9
	// 1462 3252:fstore          10
									obj4 = obj5;
	// 1463 3254:aload           41
	// 1464 3256:astore          37
									obj7 = ((Object) (abyte0));
	// 1465 3258:aload           40
	// 1466 3260:astore          43
									bgl1 = bgl3;
	// 1467 3262:aload           44
	// 1468 3264:astore_1        
									j = l9;
	// 1469 3265:iload           21
	// 1470 3267:istore          11
									break;

	//*1471 3269:goto            3369
								case 1: // '\001'
									k3 = 1;
	// 1472 3272:iconst_1        
	// 1473 3273:istore          13
									obj2 = obj6;
	// 1474 3275:aload           42
	// 1475 3277:astore          36
									l8 = i8;
	// 1476 3279:iload           19
	// 1477 3281:istore          20
									f2 = f1;
	// 1478 3283:fload           9
	// 1479 3285:fstore          10
									obj4 = obj5;
	// 1480 3287:aload           41
	// 1481 3289:astore          37
									obj7 = ((Object) (abyte0));
	// 1482 3291:aload           40
	// 1483 3293:astore          43
									bgl1 = bgl3;
	// 1484 3295:aload           44
	// 1485 3297:astore_1        
									j = l9;
	// 1486 3298:iload           21
	// 1487 3300:istore          11
									break;

	//*1488 3302:goto            3369
								case 0: // '\0'
									k3 = 0;
	// 1489 3305:iconst_0        
	// 1490 3306:istore          13
									obj2 = obj6;
	// 1491 3308:aload           42
	// 1492 3310:astore          36
									l8 = i8;
	// 1493 3312:iload           19
	// 1494 3314:istore          20
									f2 = f1;
	// 1495 3316:fload           9
	// 1496 3318:fstore          10
									obj4 = obj5;
	// 1497 3320:aload           41
	// 1498 3322:astore          37
									obj7 = ((Object) (abyte0));
	// 1499 3324:aload           40
	// 1500 3326:astore          43
									bgl1 = bgl3;
	// 1501 3328:aload           44
	// 1502 3330:astore_1        
									j = l9;
	// 1503 3331:iload           21
	// 1504 3333:istore          11
									break;
								}
						} else
	//*1505 3335:goto            3369
						{
							j = l9;
	// 1506 3338:iload           21
	// 1507 3340:istore          11
							bgl1 = bgl3;
	// 1508 3342:aload           44
	// 1509 3344:astore_1        
							obj7 = ((Object) (abyte0));
	// 1510 3345:aload           40
	// 1511 3347:astore          43
							obj4 = obj5;
	// 1512 3349:aload           41
	// 1513 3351:astore          37
							k3 = l6;
	// 1514 3353:iload           16
	// 1515 3355:istore          13
							f2 = f1;
	// 1516 3357:fload           9
	// 1517 3359:fstore          10
							l8 = i8;
	// 1518 3361:iload           19
	// 1519 3363:istore          20
							obj2 = obj6;
	// 1520 3365:aload           42
	// 1521 3367:astore          36
						}
					}
					i5 += j11;
	// 1522 3369:iload           15
	// 1523 3371:iload           27
	// 1524 3373:iadd            
	// 1525 3374:istore          15
					obj6 = obj2;
	// 1526 3376:aload           36
	// 1527 3378:astore          42
					i8 = l8;
	// 1528 3380:iload           20
	// 1529 3382:istore          19
					f1 = f2;
	// 1530 3384:fload           10
	// 1531 3386:fstore          9
					l6 = k3;
	// 1532 3388:iload           13
	// 1533 3390:istore          16
					obj5 = obj4;
	// 1534 3392:aload           37
	// 1535 3394:astore          41
					abyte0 = ((byte []) (obj7));
	// 1536 3396:aload           43
	// 1537 3398:astore          40
				}
	//*1538 3400:goto            2426
				obj2 = ((Object) (bgl1));
	// 1539 3403:aload_1         
	// 1540 3404:astore          36
				if(obj6 != null)
	//*1541 3406:aload           42
	//*1542 3408:ifnull          3470
				{
					String s = Integer.toString(i10);
	// 1543 3411:iload           22
	// 1544 3413:invokestatic    #325 <Method String Integer.toString(int)>
	// 1545 3416:astore          37
					j = j1;
	// 1546 3418:iload           12
	// 1547 3420:istore          11
					bgl1 = ((bgl) (obj1));
	// 1548 3422:aload           35
	// 1549 3424:astore_1        
					bgl1.b = zzfs.a(s, ((String) (obj6)), ((String) (null)), -1, -1, l10, i11, -1F, ((java.util.List) (obj5)), j10, f1, abyte0, l6, ((zzqi) (null)), zzhp);
	// 1550 3425:aload_1         
	// 1551 3426:aload           37
	// 1552 3428:aload           42
	// 1553 3430:aconst_null     
	// 1554 3431:iconst_m1       
	// 1555 3432:iconst_m1       
	// 1556 3433:iload           25
	// 1557 3435:iload           26
	// 1558 3437:ldc2            #485 <Float -1F>
	// 1559 3440:aload           41
	// 1560 3442:iload           23
	// 1561 3444:fload           9
	// 1562 3446:aload           40
	// 1563 3448:iload           16
	// 1564 3450:aconst_null     
	// 1565 3451:aload           4
	// 1566 3453:invokestatic    #488 <Method zzfs zzfs.a(String, String, String, int, int, int, int, float, java.util.List, int, float, byte[], int, zzqi, zzhp)>
	// 1567 3456:putfield        #335 <Field zzfs bgq.b>
					j1 = k4;
	// 1568 3459:iload           14
	// 1569 3461:istore          12
					obj1 = obj2;
	// 1570 3463:aload           36
	// 1571 3465:astore          35
				} else
	//*1572 3467:goto            3485
				{
					j = j1;
	// 1573 3470:iload           12
	// 1574 3472:istore          11
					bgl1 = ((bgl) (obj1));
	// 1575 3474:aload           35
	// 1576 3476:astore_1        
					obj1 = obj2;
	// 1577 3477:aload           36
	// 1578 3479:astore          35
					j1 = k4;
	// 1579 3481:iload           14
	// 1580 3483:istore          12
				}
			}
			((bno) (obj)).c(j + k10);
	// 1581 3485:aload           34
	// 1582 3487:iload           11
	// 1583 3489:iload           24
	// 1584 3491:iadd            
	// 1585 3492:invokevirtual   #65  <Method void bno.c(int)>
			j = j1 + 1;
	// 1586 3495:iload           12
	// 1587 3497:iconst_1        
	// 1588 3498:iadd            
	// 1589 3499:istore          11
			obj2 = obj1;
	// 1590 3501:aload           35
	// 1591 3503:astore          36
			obj1 = ((Object) (bgl1));
	// 1592 3505:aload_1         
	// 1593 3506:astore          35
		}

	//*1594 3508:goto            820
label12:
		{
			bgk1 = bgk1.e(bgj.P);
	// 1595 3511:aload_0         
	// 1596 3512:getstatic       #491 <Field int bgj.P>
	// 1597 3515:invokevirtual   #166 <Method bgk bgk.e(int)>
	// 1598 3518:astore_0        
			if(bgk1 != null)
	//*1599 3519:aload_0         
	//*1600 3520:ifnull          3684
			{
				bgk1 = ((bgk) (bgk1.d(bgj.Q)));
	// 1601 3523:aload_0         
	// 1602 3524:getstatic       #494 <Field int bgj.Q>
	// 1603 3527:invokevirtual   #172 <Method bgl bgk.d(int)>
	// 1604 3530:astore_0        
				if(bgk1 != null)
	//*1605 3531:aload_0         
	//*1606 3532:ifnonnull       3538
	//*1607 3535:goto            3684
				{
					bgk1 = ((bgk) (((bgl) (bgk1)).aP));
	// 1608 3538:aload_0         
	// 1609 3539:getfield        #178 <Field bno bgl.aP>
	// 1610 3542:astore_0        
					((bno) (bgk1)).c(8);
	// 1611 3543:aload_0         
	// 1612 3544:bipush          8
	// 1613 3546:invokevirtual   #65  <Method void bno.c(int)>
					int k1 = bgj.a(((bno) (bgk1)).l());
	// 1614 3549:aload_0         
	// 1615 3550:invokevirtual   #68  <Method int bno.l()>
	// 1616 3553:invokestatic    #184 <Method int bgj.a(int)>
	// 1617 3556:istore          12
					int l3 = ((bno) (bgk1)).o();
	// 1618 3558:aload_0         
	// 1619 3559:invokevirtual   #376 <Method int bno.o()>
	// 1620 3562:istore          13
					bgl1 = ((bgl) (new long[l3]));
	// 1621 3564:iload           13
	// 1622 3566:newarray        long[]
	// 1623 3568:astore_1        
					zzhp = ((zzhp) (new long[l3]));
	// 1624 3569:iload           13
	// 1625 3571:newarray        long[]
	// 1626 3573:astore          4
					for(int k = 0; k < l3;)
	//*1627 3575:iconst_0        
	//*1628 3576:istore          11
	//*1629 3578:iload           11
	//*1630 3580:iload           13
	//*1631 3582:icmpge          3674
					{
						long l13;
						if(k1 == 1)
	//*1632 3585:iload           12
	//*1633 3587:iconst_1        
	//*1634 3588:icmpne          3600
							l13 = ((bno) (bgk1)).p();
	// 1635 3591:aload_0         
	// 1636 3592:invokevirtual   #196 <Method long bno.p()>
	// 1637 3595:lstore          29
						else
	//*1638 3597:goto            3606
							l13 = ((bno) (bgk1)).j();
	// 1639 3600:aload_0         
	// 1640 3601:invokevirtual   #193 <Method long bno.j()>
	// 1641 3604:lstore          29
						bgl1[k] = l13;
	// 1642 3606:aload_1         
	// 1643 3607:iload           11
	// 1644 3609:lload           29
	// 1645 3611:lastore         
						if(k1 == 1)
	//*1646 3612:iload           12
	//*1647 3614:iconst_1        
	//*1648 3615:icmpne          3627
							l13 = ((bno) (bgk1)).m();
	// 1649 3618:aload_0         
	// 1650 3619:invokevirtual   #361 <Method long bno.m()>
	// 1651 3622:lstore          29
						else
	//*1652 3624:goto            3634
							l13 = ((bno) (bgk1)).l();
	// 1653 3627:aload_0         
	// 1654 3628:invokevirtual   #68  <Method int bno.l()>
	// 1655 3631:i2l             
	// 1656 3632:lstore          29
						zzhp[k] = l13;
	// 1657 3634:aload           4
	// 1658 3636:iload           11
	// 1659 3638:lload           29
	// 1660 3640:lastore         
						if(((bno) (bgk1)).i() == 1)
	//*1661 3641:aload_0         
	//*1662 3642:invokevirtual   #497 <Method short bno.i()>
	//*1663 3645:iconst_1        
	//*1664 3646:icmpne          3663
						{
							((bno) (bgk1)).d(2);
	// 1665 3649:aload_0         
	// 1666 3650:iconst_2        
	// 1667 3651:invokevirtual   #94  <Method void bno.d(int)>
							k++;
	// 1668 3654:iload           11
	// 1669 3656:iconst_1        
	// 1670 3657:iadd            
	// 1671 3658:istore          11
						} else
	//*1672 3660:goto            3578
						{
							throw new IllegalArgumentException("Unsupported media rate.");
	// 1673 3663:new             #499 <Class IllegalArgumentException>
	// 1674 3666:dup             
	// 1675 3667:ldc2            #501 <String "Unsupported media rate.">
	// 1676 3670:invokespecial   #504 <Method void IllegalArgumentException(String)>
	// 1677 3673:athrow          
						}
					}

					bgk1 = ((bgk) (Pair.create(((Object) (bgl1)), ((Object) (zzhp)))));
	// 1678 3674:aload_1         
	// 1679 3675:aload           4
	// 1680 3677:invokestatic    #119 <Method Pair Pair.create(Object, Object)>
	// 1681 3680:astore_0        
					break label12;
	// 1682 3681:goto            3690
				}
			}
			bgk1 = ((bgk) (Pair.create(((Object) (null)), ((Object) (null)))));
	// 1683 3684:aconst_null     
	// 1684 3685:aconst_null     
	// 1685 3686:invokestatic    #119 <Method Pair Pair.create(Object, Object)>
	// 1686 3689:astore_0        
		}
		if(((bgq) (obj1)).b == null)
	//*1687 3690:aload           35
	//*1688 3692:getfield        #335 <Field zzfs bgq.b>
	//*1689 3695:ifnonnull       3700
			return null;
	// 1690 3698:aconst_null     
	// 1691 3699:areturn         
		else
			return new bhh(bgt.b(bgt1), i7, ((Long)pair.first).longValue(), l14, l, ((bgq) (obj1)).b, ((bgq) (obj1)).d, ((bgq) (obj1)).a, ((bgq) (obj1)).c, (long[])((Pair) (bgk1)).first, (long[])((Pair) (bgk1)).second);
	// 1692 3700:new             #506 <Class bhh>
	// 1693 3703:dup             
	// 1694 3704:aload           39
	// 1695 3706:invokestatic    #243 <Method int bgt.b(bgt)>
	// 1696 3709:iload           17
	// 1697 3711:aload           38
	// 1698 3713:getfield        #131 <Field Object Pair.first>
	// 1699 3716:checkcast       #230 <Class Long>
	// 1700 3719:invokevirtual   #509 <Method long Long.longValue()>
	// 1701 3722:lload           31
	// 1702 3724:lload_2         
	// 1703 3725:aload           35
	// 1704 3727:getfield        #335 <Field zzfs bgq.b>
	// 1705 3730:aload           35
	// 1706 3732:getfield        #350 <Field int bgq.d>
	// 1707 3735:aload           35
	// 1708 3737:getfield        #124 <Field bhi[] bgq.a>
	// 1709 3740:aload           35
	// 1710 3742:getfield        #445 <Field int bgq.c>
	// 1711 3745:aload_0         
	// 1712 3746:getfield        #131 <Field Object Pair.first>
	// 1713 3749:checkcast       #511 <Class long[]>
	// 1714 3752:aload_0         
	// 1715 3753:getfield        #128 <Field Object Pair.second>
	// 1716 3756:checkcast       #511 <Class long[]>
	// 1717 3759:invokespecial   #514 <Method void bhh(int, int, long, long, long, zzfs, int, bhi[], int, long[], long[])>
	// 1718 3762:areturn         
	}

	public static bhk a(bhh bhh1, bgk bgk1, bfr bfr1)
	{
label0:
		{
			bgl bgl1 = bgk1.d(bgj.ap);
	//    0    0:aload_1         
	//    1    1:getstatic       #518 <Field int bgj.ap>
	//    2    4:invokevirtual   #172 <Method bgl bgk.d(int)>
	//    3    7:astore          27
			int ai[];
			if(bgl1 != null)
	//*   4    9:aload           27
	//*   5   11:ifnull          28
			{
				ai = ((int []) (new bgr(bgl1)));
	//    6   14:new             #520 <Class bgr>
	//    7   17:dup             
	//    8   18:aload           27
	//    9   20:invokespecial   #523 <Method void bgr(bgl)>
	//   10   23:astore          27
			} else
	//*  11   25:goto            53
			{
				ai = ((int []) (bgk1.d(bgj.aq)));
	//   12   28:aload_1         
	//   13   29:getstatic       #526 <Field int bgj.aq>
	//   14   32:invokevirtual   #172 <Method bgl bgk.d(int)>
	//   15   35:astore          27
				if(ai == null)
					break label0;
	//   16   37:aload           27
	//   17   39:ifnull          2302
				ai = ((int []) (new bgs(((bgl) (ai)))));
	//   18   42:new             #528 <Class bgs>
	//   19   45:dup             
	//   20   46:aload           27
	//   21   48:invokespecial   #529 <Method void bgs(bgl)>
	//   22   51:astore          27
			}
			int k1 = ((bgp) (ai)).a();
	//   23   53:aload           27
	//   24   55:invokeinterface #533 <Method int bgp.a()>
	//   25   60:istore          6
			if(k1 == 0)
	//*  26   62:iload           6
	//*  27   64:ifne            88
				return new bhk(new long[0], new int[0], 0, new long[0], new int[0]);
	//   28   67:new             #535 <Class bhk>
	//   29   70:dup             
	//   30   71:iconst_0        
	//   31   72:newarray        long[]
	//   32   74:iconst_0        
	//   33   75:newarray        int[]
	//   34   77:iconst_0        
	//   35   78:iconst_0        
	//   36   79:newarray        long[]
	//   37   81:iconst_0        
	//   38   82:newarray        int[]
	//   39   84:invokespecial   #538 <Method void bhk(long[], int[], int, long[], int[])>
	//   40   87:areturn         
			Object obj = ((Object) (bgk1.d(bgj.ar)));
	//   41   88:aload_1         
	//   42   89:getstatic       #541 <Field int bgj.ar>
	//   43   92:invokevirtual   #172 <Method bgl bgk.d(int)>
	//   44   95:astore          28
			boolean flag4;
			if(obj == null)
	//*  45   97:aload           28
	//*  46   99:ifnonnull       117
			{
				obj = ((Object) (bgk1.d(bgj.as)));
	//   47  102:aload_1         
	//   48  103:getstatic       #544 <Field int bgj.as>
	//   49  106:invokevirtual   #172 <Method bgl bgk.d(int)>
	//   50  109:astore          28
				flag4 = true;
	//   51  111:iconst_1        
	//   52  112:istore          18
			} else
	//*  53  114:goto            120
			{
				flag4 = false;
	//   54  117:iconst_0        
	//   55  118:istore          18
			}
			bno bno1 = ((bgl) (obj)).aP;
	//   56  120:aload           28
	//   57  122:getfield        #178 <Field bno bgl.aP>
	//   58  125:astore          29
			bno bno2 = bgk1.d(bgj.ao).aP;
	//   59  127:aload_1         
	//   60  128:getstatic       #547 <Field int bgj.ao>
	//   61  131:invokevirtual   #172 <Method bgl bgk.d(int)>
	//   62  134:getfield        #178 <Field bno bgl.aP>
	//   63  137:astore          30
			bno bno3 = bgk1.d(bgj.al).aP;
	//   64  139:aload_1         
	//   65  140:getstatic       #550 <Field int bgj.al>
	//   66  143:invokevirtual   #172 <Method bgl bgk.d(int)>
	//   67  146:getfield        #178 <Field bno bgl.aP>
	//   68  149:astore          33
			obj = ((Object) (bgk1.d(bgj.am)));
	//   69  151:aload_1         
	//   70  152:getstatic       #553 <Field int bgj.am>
	//   71  155:invokevirtual   #172 <Method bgl bgk.d(int)>
	//   72  158:astore          28
			if(obj != null)
	//*  73  160:aload           28
	//*  74  162:ifnull          175
				obj = ((Object) (((bgl) (obj)).aP));
	//   75  165:aload           28
	//   76  167:getfield        #178 <Field bno bgl.aP>
	//   77  170:astore          28
			else
	//*  78  172:goto            178
				obj = null;
	//   79  175:aconst_null     
	//   80  176:astore          28
			bgk1 = ((bgk) (bgk1.d(bgj.an)));
	//   81  178:aload_1         
	//   82  179:getstatic       #556 <Field int bgj.an>
	//   83  182:invokevirtual   #172 <Method bgl bgk.d(int)>
	//   84  185:astore_1        
			if(bgk1 != null)
	//*  85  186:aload_1         
	//*  86  187:ifnull          198
				bgk1 = ((bgk) (((bgl) (bgk1)).aP));
	//   87  190:aload_1         
	//   88  191:getfield        #178 <Field bno bgl.aP>
	//   89  194:astore_1        
			else
	//*  90  195:goto            200
				bgk1 = null;
	//   91  198:aconst_null     
	//   92  199:astore_1        
			bgn bgn1 = new bgn(bno2, bno1, flag4);
	//   93  200:new             #558 <Class bgn>
	//   94  203:dup             
	//   95  204:aload           30
	//   96  206:aload           29
	//   97  208:iload           18
	//   98  210:invokespecial   #561 <Method void bgn(bno, bno, boolean)>
	//   99  213:astore          34
			bno3.c(12);
	//  100  215:aload           33
	//  101  217:bipush          12
	//  102  219:invokevirtual   #65  <Method void bno.c(int)>
			int k3 = bno3.o() - 1;
	//  103  222:aload           33
	//  104  224:invokevirtual   #376 <Method int bno.o()>
	//  105  227:iconst_1        
	//  106  228:isub            
	//  107  229:istore          8
			int k7 = bno3.o();
	//  108  231:aload           33
	//  109  233:invokevirtual   #376 <Method int bno.o()>
	//  110  236:istore          14
			int i7 = bno3.o();
	//  111  238:aload           33
	//  112  240:invokevirtual   #376 <Method int bno.o()>
	//  113  243:istore          12
			int i;
			if(bgk1 != null)
	//* 114  245:aload_1         
	//* 115  246:ifnull          263
			{
				((bno) (bgk1)).c(12);
	//  116  249:aload_1         
	//  117  250:bipush          12
	//  118  252:invokevirtual   #65  <Method void bno.c(int)>
				i = ((bno) (bgk1)).o();
	//  119  255:aload_1         
	//  120  256:invokevirtual   #376 <Method int bno.o()>
	//  121  259:istore_3        
			} else
	//* 122  260:goto            265
			{
				i = 0;
	//  123  263:iconst_0        
	//  124  264:istore_3        
			}
			int j = -1;
	//  125  265:iconst_m1       
	//  126  266:istore          4
			int j1;
			if(obj != null)
	//* 127  268:aload           28
	//* 128  270:ifnull          310
			{
				((bno) (obj)).c(12);
	//  129  273:aload           28
	//  130  275:bipush          12
	//  131  277:invokevirtual   #65  <Method void bno.c(int)>
				j1 = ((bno) (obj)).o();
	//  132  280:aload           28
	//  133  282:invokevirtual   #376 <Method int bno.o()>
	//  134  285:istore          5
				if(j1 > 0)
	//* 135  287:iload           5
	//* 136  289:ifle            304
					j = ((bno) (obj)).o() - 1;
	//  137  292:aload           28
	//  138  294:invokevirtual   #376 <Method int bno.o()>
	//  139  297:iconst_1        
	//  140  298:isub            
	//  141  299:istore          4
				else
	//* 142  301:goto            313
					obj = null;
	//  143  304:aconst_null     
	//  144  305:astore          28
			} else
	//* 145  307:goto            313
			{
				j1 = 0;
	//  146  310:iconst_0        
	//  147  311:istore          5
			}
			boolean flag2;
			if(((bgp) (ai)).c() && "audio/raw".equals(((Object) (bhh1.f.e))) && k3 == 0 && i == 0 && j1 == 0)
	//* 148  313:aload           27
	//* 149  315:invokeinterface #564 <Method boolean bgp.c()>
	//* 150  320:ifeq            359
	//* 151  323:ldc2            #390 <String "audio/raw">
	//* 152  326:aload_0         
	//* 153  327:getfield        #566 <Field zzfs bhh.f>
	//* 154  330:getfield        #569 <Field String zzfs.e>
	//* 155  333:invokevirtual   #421 <Method boolean String.equals(Object)>
	//* 156  336:ifeq            359
	//* 157  339:iload           8
	//* 158  341:ifne            359
	//* 159  344:iload_3         
	//* 160  345:ifne            359
	//* 161  348:iload           5
	//* 162  350:ifne            359
				flag2 = true;
	//  163  353:iconst_1        
	//  164  354:istore          7
			else
	//* 165  356:goto            362
				flag2 = false;
	//  166  359:iconst_0        
	//  167  360:istore          7
			long l14 = 0L;
	//  168  362:lconst_0        
	//  169  363:lstore          23
			long l8;
			int ai1[];
			long al[];
			if(!flag2)
	//* 170  365:iload           7
	//* 171  367:ifne            985
			{
				long al2[] = new long[k1];
	//  172  370:iload           6
	//  173  372:newarray        long[]
	//  174  374:astore          32
				int ai2[] = new int[k1];
	//  175  376:iload           6
	//  176  378:newarray        int[]
	//  177  380:astore          30
				al = new long[k1];
	//  178  382:iload           6
	//  179  384:newarray        long[]
	//  180  386:astore          29
				int ai5[] = new int[k1];
	//  181  388:iload           6
	//  182  390:newarray        int[]
	//  183  392:astore          31
				int j2 = j1;
	//  184  394:iload           5
	//  185  396:istore          7
				j1 = i;
	//  186  398:iload_3         
	//  187  399:istore          5
				i = j;
	//  188  401:iload           4
	//  189  403:istore_3        
				long l9 = 0L;
	//  190  404:lconst_0        
	//  191  405:lstore          21
				l8 = l9;
	//  192  407:lload           21
	//  193  409:lstore          19
				int k5 = 0;
	//  194  411:iconst_0        
	//  195  412:istore          10
				int j4 = 0;
	//  196  414:iconst_0        
	//  197  415:istore          9
				boolean flag3 = false;
	//  198  417:iconst_0        
	//  199  418:istore          15
				int j6 = 0;
	//  200  420:iconst_0        
	//  201  421:istore          11
				int j7 = 0;
	//  202  423:iconst_0        
	//  203  424:istore          13
				j = j1;
	//  204  426:iload           5
	//  205  428:istore          4
				j1 = ((int) (flag3));
	//  206  430:iload           15
	//  207  432:istore          5
				while(j7 < k1) 
	//* 208  434:iload           13
	//* 209  436:iload           6
	//* 210  438:icmpge          778
				{
					int l7 = k5;
	//  211  441:iload           10
	//  212  443:istore          15
					k5 = i7;
	//  213  445:iload           12
	//  214  447:istore          10
					for(; l7 == 0; l7 = bgn1.c)
	//* 215  449:iload           15
	//* 216  451:ifne            479
					{
						bnf.b(bgn1.a());
	//  217  454:aload           34
	//  218  456:invokevirtual   #571 <Method boolean bgn.a()>
	//  219  459:invokestatic    #435 <Method void bnf.b(boolean)>
						l9 = bgn1.d;
	//  220  462:aload           34
	//  221  464:getfield        #573 <Field long bgn.d>
	//  222  467:lstore          21
					}

	//  223  469:aload           34
	//  224  471:getfield        #574 <Field int bgn.c>
	//  225  474:istore          15
	//* 226  476:goto            449
					int i8;
					if(bgk1 != null)
	//* 227  479:aload_1         
	//* 228  480:ifnull          527
					{
						for(; j6 == 0 && j > 0; j--)
	//* 229  483:iload           11
	//* 230  485:ifne            514
	//* 231  488:iload           4
	//* 232  490:ifle            514
						{
							j6 = ((bno) (bgk1)).o();
	//  233  493:aload_1         
	//  234  494:invokevirtual   #376 <Method int bno.o()>
	//  235  497:istore          11
							j1 = ((bno) (bgk1)).l();
	//  236  499:aload_1         
	//  237  500:invokevirtual   #68  <Method int bno.l()>
	//  238  503:istore          5
						}

	//  239  505:iload           4
	//  240  507:iconst_1        
	//  241  508:isub            
	//  242  509:istore          4
	//* 243  511:goto            483
						i8 = j6 - 1;
	//  244  514:iload           11
	//  245  516:iconst_1        
	//  246  517:isub            
	//  247  518:istore          16
						j6 = j;
	//  248  520:iload           4
	//  249  522:istore          11
					} else
	//* 250  524:goto            535
					{
						i8 = j6;
	//  251  527:iload           11
	//  252  529:istore          16
						j6 = j;
	//  253  531:iload           4
	//  254  533:istore          11
					}
					al2[j7] = l9;
	//  255  535:aload           32
	//  256  537:iload           13
	//  257  539:lload           21
	//  258  541:lastore         
					ai2[j7] = ((bgp) (ai)).b();
	//  259  542:aload           30
	//  260  544:iload           13
	//  261  546:aload           27
	//  262  548:invokeinterface #576 <Method int bgp.b()>
	//  263  553:iastore         
					int j8;
					if(ai2[j7] > j4)
	//* 264  554:aload           30
	//* 265  556:iload           13
	//* 266  558:iaload          
	//* 267  559:iload           9
	//* 268  561:icmple          574
						j8 = ai2[j7];
	//  269  564:aload           30
	//  270  566:iload           13
	//  271  568:iaload          
	//  272  569:istore          17
					else
	//* 273  571:goto            578
						j8 = j4;
	//  274  574:iload           9
	//  275  576:istore          17
					al[j7] = l8 + (long)j1;
	//  276  578:aload           29
	//  277  580:iload           13
	//  278  582:lload           19
	//  279  584:iload           5
	//  280  586:i2l             
	//  281  587:ladd            
	//  282  588:lastore         
					if(obj == null)
	//* 283  589:aload           28
	//* 284  591:ifnonnull       600
						j = 1;
	//  285  594:iconst_1        
	//  286  595:istore          4
					else
	//* 287  597:goto            603
						j = 0;
	//  288  600:iconst_0        
	//  289  601:istore          4
					ai5[j7] = j;
	//  290  603:aload           31
	//  291  605:iload           13
	//  292  607:iload           4
	//  293  609:iastore         
					if(j7 == i)
	//* 294  610:iload           13
	//* 295  612:iload_3         
	//* 296  613:icmpne          665
					{
						ai5[j7] = 1;
	//  297  616:aload           31
	//  298  618:iload           13
	//  299  620:iconst_1        
	//  300  621:iastore         
						j = j2 - 1;
	//  301  622:iload           7
	//  302  624:iconst_1        
	//  303  625:isub            
	//  304  626:istore          4
						if(j > 0)
	//* 305  628:iload           4
	//* 306  630:ifle            652
						{
							j2 = ((bno) (obj)).o();
	//  307  633:aload           28
	//  308  635:invokevirtual   #376 <Method int bno.o()>
	//  309  638:istore          7
							i = j;
	//  310  640:iload           4
	//  311  642:istore_3        
							j = j2 - 1;
	//  312  643:iload           7
	//  313  645:iconst_1        
	//  314  646:isub            
	//  315  647:istore          4
						} else
	//* 316  649:goto            671
						{
							j2 = i;
	//  317  652:iload_3         
	//  318  653:istore          7
							i = j;
	//  319  655:iload           4
	//  320  657:istore_3        
							j = j2;
	//  321  658:iload           7
	//  322  660:istore          4
						}
					} else
	//* 323  662:goto            671
					{
						j = i;
	//  324  665:iload_3         
	//  325  666:istore          4
						i = j2;
	//  326  668:iload           7
	//  327  670:istore_3        
					}
					j2 = k5;
	//  328  671:iload           10
	//  329  673:istore          7
					l8 += j2;
	//  330  675:lload           19
	//  331  677:iload           7
	//  332  679:i2l             
	//  333  680:ladd            
	//  334  681:lstore          19
					j4 = k7 - 1;
	//  335  683:iload           14
	//  336  685:iconst_1        
	//  337  686:isub            
	//  338  687:istore          9
					if(j4 == 0 && k3 > 0)
	//* 339  689:iload           9
	//* 340  691:ifne            722
	//* 341  694:iload           8
	//* 342  696:ifle            722
					{
						j4 = bno3.o();
	//  343  699:aload           33
	//  344  701:invokevirtual   #376 <Method int bno.o()>
	//  345  704:istore          9
						j2 = bno3.o();
	//  346  706:aload           33
	//  347  708:invokevirtual   #376 <Method int bno.o()>
	//  348  711:istore          7
						k3--;
	//  349  713:iload           8
	//  350  715:iconst_1        
	//  351  716:isub            
	//  352  717:istore          8
					}
	//* 353  719:goto            722
					long l16 = ai2[j7];
	//  354  722:aload           30
	//  355  724:iload           13
	//  356  726:iaload          
	//  357  727:i2l             
	//  358  728:lstore          25
					j7++;
	//  359  730:iload           13
	//  360  732:iconst_1        
	//  361  733:iadd            
	//  362  734:istore          13
					k5 = l7 - 1;
	//  363  736:iload           15
	//  364  738:iconst_1        
	//  365  739:isub            
	//  366  740:istore          10
					l9 += l16;
	//  367  742:lload           21
	//  368  744:lload           25
	//  369  746:ladd            
	//  370  747:lstore          21
					i7 = j2;
	//  371  749:iload           7
	//  372  751:istore          12
					j2 = i;
	//  373  753:iload_3         
	//  374  754:istore          7
					i = j;
	//  375  756:iload           4
	//  376  758:istore_3        
					k7 = j4;
	//  377  759:iload           9
	//  378  761:istore          14
					j4 = j8;
	//  379  763:iload           17
	//  380  765:istore          9
					j = j6;
	//  381  767:iload           11
	//  382  769:istore          4
					j6 = i8;
	//  383  771:iload           16
	//  384  773:istore          11
				}
	//* 385  775:goto            434
				j1 = k1;
	//  386  778:iload           6
	//  387  780:istore          5
				boolean flag5;
				if(j6 == 0)
	//* 388  782:iload           11
	//* 389  784:ifne            793
					flag5 = true;
	//  390  787:iconst_1        
	//  391  788:istore          18
				else
	//* 392  790:goto            796
					flag5 = false;
	//  393  793:iconst_0        
	//  394  794:istore          18
				bnf.a(flag5);
	//  395  796:iload           18
	//  396  798:invokestatic    #578 <Method void bnf.a(boolean)>
				for(; j > 0; j--)
	//* 397  801:iload           4
	//* 398  803:ifle            841
				{
					boolean flag6;
					if(((bno) (bgk1)).o() == 0)
	//* 399  806:aload_1         
	//* 400  807:invokevirtual   #376 <Method int bno.o()>
	//* 401  810:ifne            819
						flag6 = true;
	//  402  813:iconst_1        
	//  403  814:istore          18
					else
	//* 404  816:goto            822
						flag6 = false;
	//  405  819:iconst_0        
	//  406  820:istore          18
					bnf.a(flag6);
	//  407  822:iload           18
	//  408  824:invokestatic    #578 <Method void bnf.a(boolean)>
					((bno) (bgk1)).l();
	//  409  827:aload_1         
	//  410  828:invokevirtual   #68  <Method int bno.l()>
	//  411  831:pop             
				}

	//  412  832:iload           4
	//  413  834:iconst_1        
	//  414  835:isub            
	//  415  836:istore          4
	//* 416  838:goto            801
				if(j2 != 0 || k7 != 0 || k5 != 0 || k3 != 0)
	//* 417  841:iload           7
	//* 418  843:ifne            867
	//* 419  846:iload           14
	//* 420  848:ifne            867
	//* 421  851:iload           10
	//* 422  853:ifne            867
	//* 423  856:iload           8
	//* 424  858:ifeq            864
	//* 425  861:goto            867
	//* 426  864:goto            968
				{
					i = bhh1.a;
	//  427  867:aload_0         
	//  428  868:getfield        #579 <Field int bhh.a>
	//  429  871:istore_3        
					bgk1 = ((bgk) (new StringBuilder(215)));
	//  430  872:new             #222 <Class StringBuilder>
	//  431  875:dup             
	//  432  876:sipush          215
	//  433  879:invokespecial   #224 <Method void StringBuilder(int)>
	//  434  882:astore_1        
					((StringBuilder) (bgk1)).append("Inconsistent stbl box for track ");
	//  435  883:aload_1         
	//  436  884:ldc2            #581 <String "Inconsistent stbl box for track ">
	//  437  887:invokevirtual   #584 <Method StringBuilder StringBuilder.append(String)>
	//  438  890:pop             
					((StringBuilder) (bgk1)).append(i);
	//  439  891:aload_1         
	//  440  892:iload_3         
	//  441  893:invokevirtual   #587 <Method StringBuilder StringBuilder.append(int)>
	//  442  896:pop             
					((StringBuilder) (bgk1)).append(": remainingSynchronizationSamples ");
	//  443  897:aload_1         
	//  444  898:ldc2            #589 <String ": remainingSynchronizationSamples ">
	//  445  901:invokevirtual   #584 <Method StringBuilder StringBuilder.append(String)>
	//  446  904:pop             
					((StringBuilder) (bgk1)).append(j2);
	//  447  905:aload_1         
	//  448  906:iload           7
	//  449  908:invokevirtual   #587 <Method StringBuilder StringBuilder.append(int)>
	//  450  911:pop             
					((StringBuilder) (bgk1)).append(", remainingSamplesAtTimestampDelta ");
	//  451  912:aload_1         
	//  452  913:ldc2            #591 <String ", remainingSamplesAtTimestampDelta ">
	//  453  916:invokevirtual   #584 <Method StringBuilder StringBuilder.append(String)>
	//  454  919:pop             
					((StringBuilder) (bgk1)).append(k7);
	//  455  920:aload_1         
	//  456  921:iload           14
	//  457  923:invokevirtual   #587 <Method StringBuilder StringBuilder.append(int)>
	//  458  926:pop             
					((StringBuilder) (bgk1)).append(", remainingSamplesInChunk ");
	//  459  927:aload_1         
	//  460  928:ldc2            #593 <String ", remainingSamplesInChunk ">
	//  461  931:invokevirtual   #584 <Method StringBuilder StringBuilder.append(String)>
	//  462  934:pop             
					((StringBuilder) (bgk1)).append(k5);
	//  463  935:aload_1         
	//  464  936:iload           10
	//  465  938:invokevirtual   #587 <Method StringBuilder StringBuilder.append(int)>
	//  466  941:pop             
					((StringBuilder) (bgk1)).append(", remainingTimestampDeltaChanges ");
	//  467  942:aload_1         
	//  468  943:ldc2            #595 <String ", remainingTimestampDeltaChanges ">
	//  469  946:invokevirtual   #584 <Method StringBuilder StringBuilder.append(String)>
	//  470  949:pop             
					((StringBuilder) (bgk1)).append(k3);
	//  471  950:aload_1         
	//  472  951:iload           8
	//  473  953:invokevirtual   #587 <Method StringBuilder StringBuilder.append(int)>
	//  474  956:pop             
					Log.w("AtomParsers", ((StringBuilder) (bgk1)).toString());
	//  475  957:ldc2            #597 <String "AtomParsers">
	//  476  960:aload_1         
	//  477  961:invokevirtual   #237 <Method String StringBuilder.toString()>
	//  478  964:invokestatic    #603 <Method int Log.w(String, String)>
	//  479  967:pop             
				}
				i = j4;
	//  480  968:iload           9
	//  481  970:istore_3        
				bgk1 = ((bgk) (al2));
	//  482  971:aload           32
	//  483  973:astore_1        
				ai = ai5;
	//  484  974:aload           31
	//  485  976:astore          27
				ai1 = ai2;
	//  486  978:aload           30
	//  487  980:astore          28
			} else
	//* 488  982:goto            1337
			{
				j1 = k1;
	//  489  985:iload           6
	//  490  987:istore          5
				ai1 = ((int []) (new long[bgn1.a]));
	//  491  989:aload           34
	//  492  991:getfield        #604 <Field int bgn.a>
	//  493  994:newarray        long[]
	//  494  996:astore          28
				bgk1 = ((bgk) (new int[bgn1.a]));
	//  495  998:aload           34
	//  496 1000:getfield        #604 <Field int bgn.a>
	//  497 1003:newarray        int[]
	//  498 1005:astore_1        
				while(bgn1.a()) 
	//* 499 1006:aload           34
	//* 500 1008:invokevirtual   #571 <Method boolean bgn.a()>
	//* 501 1011:ifeq            1042
				{
					ai1[bgn1.b] = bgn1.d;
	//  502 1014:aload           28
	//  503 1016:aload           34
	//  504 1018:getfield        #605 <Field int bgn.b>
	//  505 1021:aload           34
	//  506 1023:getfield        #573 <Field long bgn.d>
	//  507 1026:lastore         
					bgk1[bgn1.b] = bgn1.c;
	//  508 1027:aload_1         
	//  509 1028:aload           34
	//  510 1030:getfield        #605 <Field int bgn.b>
	//  511 1033:aload           34
	//  512 1035:getfield        #574 <Field int bgn.c>
	//  513 1038:iastore         
				}
	//* 514 1039:goto            1006
				int l5 = ((bgp) (ai)).b();
	//  515 1042:aload           27
	//  516 1044:invokeinterface #576 <Method int bgp.b()>
	//  517 1049:istore          10
				long l10 = i7;
	//  518 1051:iload           12
	//  519 1053:i2l             
	//  520 1054:lstore          21
				int k6 = 8192 / l5;
	//  521 1056:sipush          8192
	//  522 1059:iload           10
	//  523 1061:idiv            
	//  524 1062:istore          11
				k1 = bgk1.length;
	//  525 1064:aload_1         
	//  526 1065:arraylength     
	//  527 1066:istore          6
				i = 0;
	//  528 1068:iconst_0        
	//  529 1069:istore_3        
				int k = 0;
	//  530 1070:iconst_0        
	//  531 1071:istore          4
				for(; i < k1; i++)
	//* 532 1073:iload_3         
	//* 533 1074:iload           6
	//* 534 1076:icmpge          1099
					k += bnw.a(bgk1[i], k6);
	//  535 1079:iload           4
	//  536 1081:aload_1         
	//  537 1082:iload_3         
	//  538 1083:iaload          
	//  539 1084:iload           11
	//  540 1086:invokestatic    #608 <Method int bnw.a(int, int)>
	//  541 1089:iadd            
	//  542 1090:istore          4

	//  543 1092:iload_3         
	//  544 1093:iconst_1        
	//  545 1094:iadd            
	//  546 1095:istore_3        
	//* 547 1096:goto            1073
				al = new long[k];
	//  548 1099:iload           4
	//  549 1101:newarray        long[]
	//  550 1103:astore          29
				int ai3[] = new int[k];
	//  551 1105:iload           4
	//  552 1107:newarray        int[]
	//  553 1109:astore          30
				long al1[] = new long[k];
	//  554 1111:iload           4
	//  555 1113:newarray        long[]
	//  556 1115:astore          31
				int ai6[] = new int[k];
	//  557 1117:iload           4
	//  558 1119:newarray        int[]
	//  559 1121:astore          32
				k1 = 0;
	//  560 1123:iconst_0        
	//  561 1124:istore          6
				k = 0;
	//  562 1126:iconst_0        
	//  563 1127:istore          4
				int k2 = 0;
	//  564 1129:iconst_0        
	//  565 1130:istore          7
				i = 0;
	//  566 1132:iconst_0        
	//  567 1133:istore_3        
				ai = ai1;
	//  568 1134:aload           28
	//  569 1136:astore          27
				while(k1 < bgk1.length) 
	//* 570 1138:iload           6
	//* 571 1140:aload_1         
	//* 572 1141:arraylength     
	//* 573 1142:icmpge          1282
				{
					int k4 = bgk1[k1];
	//  574 1145:aload_1         
	//  575 1146:iload           6
	//  576 1148:iaload          
	//  577 1149:istore          9
					l8 = ai[k1];
	//  578 1151:aload           27
	//  579 1153:iload           6
	//  580 1155:laload          
	//  581 1156:lstore          19
					int l3 = k;
	//  582 1158:iload           4
	//  583 1160:istore          8
					k = i;
	//  584 1162:iload_3         
	//  585 1163:istore          4
					i = l3;
	//  586 1165:iload           8
	//  587 1167:istore_3        
					for(l3 = k4; l3 > 0;)
	//* 588 1168:iload           9
	//* 589 1170:istore          8
	//* 590 1172:iload           8
	//* 591 1174:ifle            1263
					{
						int l4 = Math.min(k6, l3);
	//  592 1177:iload           11
	//  593 1179:iload           8
	//  594 1181:invokestatic    #611 <Method int Math.min(int, int)>
	//  595 1184:istore          9
						al[k2] = l8;
	//  596 1186:aload           29
	//  597 1188:iload           7
	//  598 1190:lload           19
	//  599 1192:lastore         
						ai3[k2] = l5 * l4;
	//  600 1193:aload           30
	//  601 1195:iload           7
	//  602 1197:iload           10
	//  603 1199:iload           9
	//  604 1201:imul            
	//  605 1202:iastore         
						k = Math.max(k, ai3[k2]);
	//  606 1203:iload           4
	//  607 1205:aload           30
	//  608 1207:iload           7
	//  609 1209:iaload          
	//  610 1210:invokestatic    #614 <Method int Math.max(int, int)>
	//  611 1213:istore          4
						al1[k2] = (long)i * l10;
	//  612 1215:aload           31
	//  613 1217:iload           7
	//  614 1219:iload_3         
	//  615 1220:i2l             
	//  616 1221:lload           21
	//  617 1223:lmul            
	//  618 1224:lastore         
						ai6[k2] = 1;
	//  619 1225:aload           32
	//  620 1227:iload           7
	//  621 1229:iconst_1        
	//  622 1230:iastore         
						l8 += ai3[k2];
	//  623 1231:lload           19
	//  624 1233:aload           30
	//  625 1235:iload           7
	//  626 1237:iaload          
	//  627 1238:i2l             
	//  628 1239:ladd            
	//  629 1240:lstore          19
						i += l4;
	//  630 1242:iload_3         
	//  631 1243:iload           9
	//  632 1245:iadd            
	//  633 1246:istore_3        
						l3 -= l4;
	//  634 1247:iload           8
	//  635 1249:iload           9
	//  636 1251:isub            
	//  637 1252:istore          8
						k2++;
	//  638 1254:iload           7
	//  639 1256:iconst_1        
	//  640 1257:iadd            
	//  641 1258:istore          7
					}

	//* 642 1260:goto            1172
					k1++;
	//  643 1263:iload           6
	//  644 1265:iconst_1        
	//  645 1266:iadd            
	//  646 1267:istore          6
					l3 = k;
	//  647 1269:iload           4
	//  648 1271:istore          8
					k = i;
	//  649 1273:iload_3         
	//  650 1274:istore          4
					i = l3;
	//  651 1276:iload           8
	//  652 1278:istore_3        
				}
	//* 653 1279:goto            1138
				ai = ((int []) (new bgw(al, ai3, i, al1, ai6, ((bgv) (null)))));
	//  654 1282:new             #616 <Class bgw>
	//  655 1285:dup             
	//  656 1286:aload           29
	//  657 1288:aload           30
	//  658 1290:iload_3         
	//  659 1291:aload           31
	//  660 1293:aload           32
	//  661 1295:aconst_null     
	//  662 1296:invokespecial   #619 <Method void bgw(long[], int[], int, long[], int[], bgv)>
	//  663 1299:astore          27
				bgk1 = ((bgk) (((bgw) (ai)).a));
	//  664 1301:aload           27
	//  665 1303:getfield        #621 <Field long[] bgw.a>
	//  666 1306:astore_1        
				ai1 = ((bgw) (ai)).b;
	//  667 1307:aload           27
	//  668 1309:getfield        #624 <Field int[] bgw.b>
	//  669 1312:astore          28
				i = ((bgw) (ai)).c;
	//  670 1314:aload           27
	//  671 1316:getfield        #625 <Field int bgw.c>
	//  672 1319:istore_3        
				al = ((bgw) (ai)).d;
	//  673 1320:aload           27
	//  674 1322:getfield        #627 <Field long[] bgw.d>
	//  675 1325:astore          29
				ai = ((bgw) (ai)).e;
	//  676 1327:aload           27
	//  677 1329:getfield        #629 <Field int[] bgw.e>
	//  678 1332:astore          27
				l8 = 0L;
	//  679 1334:lconst_0        
	//  680 1335:lstore          19
			}
			bhh bhh3 = bhh1;
	//  681 1337:aload_0         
	//  682 1338:astore          32
			if(bhh3.i != null && !bfr1.a())
	//* 683 1340:aload           32
	//* 684 1342:getfield        #631 <Field long[] bhh.i>
	//* 685 1345:ifnull          2273
	//* 686 1348:aload_2         
	//* 687 1349:invokevirtual   #634 <Method boolean bfr.a()>
	//* 688 1352:ifeq            1358
	//* 689 1355:goto            2273
			{
				if(bhh3.i.length == 1 && bhh3.b == 1 && al.length >= 2)
	//* 690 1358:aload           32
	//* 691 1360:getfield        #631 <Field long[] bhh.i>
	//* 692 1363:arraylength     
	//* 693 1364:iconst_1        
	//* 694 1365:icmpne          1585
	//* 695 1368:aload           32
	//* 696 1370:getfield        #635 <Field int bhh.b>
	//* 697 1373:iconst_1        
	//* 698 1374:icmpne          1585
	//* 699 1377:aload           29
	//* 700 1379:arraylength     
	//* 701 1380:iconst_2        
	//* 702 1381:icmplt          1585
				{
					long l17 = bhh3.j[0];
	//  703 1384:aload           32
	//  704 1386:getfield        #637 <Field long[] bhh.j>
	//  705 1389:iconst_0        
	//  706 1390:laload          
	//  707 1391:lstore          25
					long l11 = bnw.a(bhh3.i[0], bhh3.c, bhh3.d) + l17;
	//  708 1393:aload           32
	//  709 1395:getfield        #631 <Field long[] bhh.i>
	//  710 1398:iconst_0        
	//  711 1399:laload          
	//  712 1400:aload           32
	//  713 1402:getfield        #639 <Field long bhh.c>
	//  714 1405:aload           32
	//  715 1407:getfield        #640 <Field long bhh.d>
	//  716 1410:invokestatic    #211 <Method long bnw.a(long, long, long)>
	//  717 1413:lload           25
	//  718 1415:ladd            
	//  719 1416:lstore          21
					if(al[0] <= l17 && l17 < al[1] && al[al.length - 1] < l11 && l11 <= l8)
	//* 720 1418:aload           29
	//* 721 1420:iconst_0        
	//* 722 1421:laload          
	//* 723 1422:lload           25
	//* 724 1424:lcmp            
	//* 725 1425:ifgt            1585
	//* 726 1428:lload           25
	//* 727 1430:aload           29
	//* 728 1432:iconst_1        
	//* 729 1433:laload          
	//* 730 1434:lcmp            
	//* 731 1435:ifge            1585
	//* 732 1438:aload           29
	//* 733 1440:aload           29
	//* 734 1442:arraylength     
	//* 735 1443:iconst_1        
	//* 736 1444:isub            
	//* 737 1445:laload          
	//* 738 1446:lload           21
	//* 739 1448:lcmp            
	//* 740 1449:ifge            1585
	//* 741 1452:lload           21
	//* 742 1454:lload           19
	//* 743 1456:lcmp            
	//* 744 1457:ifgt            1585
					{
						l17 = bnw.a(l17 - al[0], bhh3.f.o, bhh3.c);
	//  745 1460:lload           25
	//  746 1462:aload           29
	//  747 1464:iconst_0        
	//  748 1465:laload          
	//  749 1466:lsub            
	//  750 1467:aload           32
	//  751 1469:getfield        #566 <Field zzfs bhh.f>
	//  752 1472:getfield        #641 <Field int zzfs.o>
	//  753 1475:i2l             
	//  754 1476:aload           32
	//  755 1478:getfield        #639 <Field long bhh.c>
	//  756 1481:invokestatic    #211 <Method long bnw.a(long, long, long)>
	//  757 1484:lstore          25
						l8 = bnw.a(l8 - l11, bhh3.f.o, bhh3.c);
	//  758 1486:lload           19
	//  759 1488:lload           21
	//  760 1490:lsub            
	//  761 1491:aload           32
	//  762 1493:getfield        #566 <Field zzfs bhh.f>
	//  763 1496:getfield        #641 <Field int zzfs.o>
	//  764 1499:i2l             
	//  765 1500:aload           32
	//  766 1502:getfield        #639 <Field long bhh.c>
	//  767 1505:invokestatic    #211 <Method long bnw.a(long, long, long)>
	//  768 1508:lstore          19
						if((l17 != 0L || l8 != 0L) && l17 <= 0x7fffffffL && l8 <= 0x7fffffffL)
	//* 769 1510:lload           25
	//* 770 1512:lconst_0        
	//* 771 1513:lcmp            
	//* 772 1514:ifne            1524
	//* 773 1517:lload           19
	//* 774 1519:lconst_0        
	//* 775 1520:lcmp            
	//* 776 1521:ifeq            1585
	//* 777 1524:lload           25
	//* 778 1526:ldc2w           #642 <Long 0x7fffffffL>
	//* 779 1529:lcmp            
	//* 780 1530:ifgt            1585
	//* 781 1533:lload           19
	//* 782 1535:ldc2w           #642 <Long 0x7fffffffL>
	//* 783 1538:lcmp            
	//* 784 1539:ifgt            1585
						{
							bfr1.a = (int)l17;
	//  785 1542:aload_2         
	//  786 1543:lload           25
	//  787 1545:l2i             
	//  788 1546:putfield        #644 <Field int bfr.a>
							bfr1.b = (int)l8;
	//  789 1549:aload_2         
	//  790 1550:lload           19
	//  791 1552:l2i             
	//  792 1553:putfield        #645 <Field int bfr.b>
							bnw.a(al, 0xf4240L, bhh3.c);
	//  793 1556:aload           29
	//  794 1558:ldc2w           #207 <Long 0xf4240L>
	//  795 1561:aload           32
	//  796 1563:getfield        #639 <Field long bhh.c>
	//  797 1566:invokestatic    #648 <Method void bnw.a(long[], long, long)>
							return new bhk(((long []) (bgk1)), ai1, i, al, ai);
	//  798 1569:new             #535 <Class bhk>
	//  799 1572:dup             
	//  800 1573:aload_1         
	//  801 1574:aload           28
	//  802 1576:iload_3         
	//  803 1577:aload           29
	//  804 1579:aload           27
	//  805 1581:invokespecial   #538 <Method void bhk(long[], int[], int, long[], int[])>
	//  806 1584:areturn         
						}
					}
				}
				if(bhh3.i.length == 1 && bhh3.i[0] == 0L)
	//* 807 1585:aload           32
	//* 808 1587:getfield        #631 <Field long[] bhh.i>
	//* 809 1590:arraylength     
	//* 810 1591:iconst_1        
	//* 811 1592:icmpne          1672
	//* 812 1595:aload           32
	//* 813 1597:getfield        #631 <Field long[] bhh.i>
	//* 814 1600:iconst_0        
	//* 815 1601:laload          
	//* 816 1602:lconst_0        
	//* 817 1603:lcmp            
	//* 818 1604:ifne            1672
				{
					for(int l = 0; l < al.length; l++)
	//* 819 1607:iconst_0        
	//* 820 1608:istore          4
	//* 821 1610:iload           4
	//* 822 1612:aload           29
	//* 823 1614:arraylength     
	//* 824 1615:icmpge          1656
						al[l] = bnw.a(al[l] - bhh3.j[0], 0xf4240L, bhh3.c);
	//  825 1618:aload           29
	//  826 1620:iload           4
	//  827 1622:aload           29
	//  828 1624:iload           4
	//  829 1626:laload          
	//  830 1627:aload           32
	//  831 1629:getfield        #637 <Field long[] bhh.j>
	//  832 1632:iconst_0        
	//  833 1633:laload          
	//  834 1634:lsub            
	//  835 1635:ldc2w           #207 <Long 0xf4240L>
	//  836 1638:aload           32
	//  837 1640:getfield        #639 <Field long bhh.c>
	//  838 1643:invokestatic    #211 <Method long bnw.a(long, long, long)>
	//  839 1646:lastore         

	//  840 1647:iload           4
	//  841 1649:iconst_1        
	//  842 1650:iadd            
	//  843 1651:istore          4
	//* 844 1653:goto            1610
					return new bhk(((long []) (bgk1)), ai1, i, al, ai);
	//  845 1656:new             #535 <Class bhk>
	//  846 1659:dup             
	//  847 1660:aload_1         
	//  848 1661:aload           28
	//  849 1663:iload_3         
	//  850 1664:aload           29
	//  851 1666:aload           27
	//  852 1668:invokespecial   #538 <Method void bhk(long[], int[], int, long[], int[])>
	//  853 1671:areturn         
				}
				boolean flag7;
				if(bhh3.b == 1)
	//* 854 1672:aload           32
	//* 855 1674:getfield        #635 <Field int bhh.b>
	//* 856 1677:iconst_1        
	//* 857 1678:icmpne          1687
					flag7 = true;
	//  858 1681:iconst_1        
	//  859 1682:istore          18
				else
	//* 860 1684:goto            1690
					flag7 = false;
	//  861 1687:iconst_0        
	//  862 1688:istore          18
				int l1 = 0;
	//  863 1690:iconst_0        
	//  864 1691:istore          6
				int i1 = 0;
	//  865 1693:iconst_0        
	//  866 1694:istore          4
				int l2 = 0;
	//  867 1696:iconst_0        
	//  868 1697:istore          7
				int i4 = 0;
	//  869 1699:iconst_0        
	//  870 1700:istore          8
				bhh1 = ((bhh) (ai1));
	//  871 1702:aload           28
	//  872 1704:astore_0        
				for(; l1 < bhh3.i.length; l1++)
	//* 873 1705:iload           6
	//* 874 1707:aload           32
	//* 875 1709:getfield        #631 <Field long[] bhh.i>
	//* 876 1712:arraylength     
	//* 877 1713:icmpge          1837
				{
					l8 = bhh3.j[l1];
	//  878 1716:aload           32
	//  879 1718:getfield        #637 <Field long[] bhh.j>
	//  880 1721:iload           6
	//  881 1723:laload          
	//  882 1724:lstore          19
					if(l8 == -1L)
						continue;
	//  883 1726:lload           19
	//  884 1728:ldc2w           #649 <Long -1L>
	//  885 1731:lcmp            
	//  886 1732:ifeq            1828
					long l12 = bnw.a(bhh3.i[l1], bhh3.c, bhh3.d);
	//  887 1735:aload           32
	//  888 1737:getfield        #631 <Field long[] bhh.i>
	//  889 1740:iload           6
	//  890 1742:laload          
	//  891 1743:aload           32
	//  892 1745:getfield        #639 <Field long bhh.c>
	//  893 1748:aload           32
	//  894 1750:getfield        #640 <Field long bhh.d>
	//  895 1753:invokestatic    #211 <Method long bnw.a(long, long, long)>
	//  896 1756:lstore          21
					int l6 = bnw.b(al, l8, true, true);
	//  897 1758:aload           29
	//  898 1760:lload           19
	//  899 1762:iconst_1        
	//  900 1763:iconst_1        
	//  901 1764:invokestatic    #653 <Method int bnw.b(long[], long, boolean, boolean)>
	//  902 1767:istore          11
					int i6 = bnw.b(al, l8 + l12, flag7, false);
	//  903 1769:aload           29
	//  904 1771:lload           19
	//  905 1773:lload           21
	//  906 1775:ladd            
	//  907 1776:iload           18
	//  908 1778:iconst_0        
	//  909 1779:invokestatic    #653 <Method int bnw.b(long[], long, boolean, boolean)>
	//  910 1782:istore          10
					int i5 = l2 + (i6 - l6);
	//  911 1784:iload           7
	//  912 1786:iload           10
	//  913 1788:iload           11
	//  914 1790:isub            
	//  915 1791:iadd            
	//  916 1792:istore          9
					if(i4 != l6)
	//* 917 1794:iload           8
	//* 918 1796:iload           11
	//* 919 1798:icmpeq          1807
						l2 = 1;
	//  920 1801:iconst_1        
	//  921 1802:istore          7
					else
	//* 922 1804:goto            1810
						l2 = 0;
	//  923 1807:iconst_0        
	//  924 1808:istore          7
					i1 |= l2;
	//  925 1810:iload           4
	//  926 1812:iload           7
	//  927 1814:ior             
	//  928 1815:istore          4
					i4 = i6;
	//  929 1817:iload           10
	//  930 1819:istore          8
					l2 = i5;
	//  931 1821:iload           9
	//  932 1823:istore          7
				}

	//  933 1825:goto            1828
	//  934 1828:iload           6
	//  935 1830:iconst_1        
	//  936 1831:iadd            
	//  937 1832:istore          6
	//* 938 1834:goto            1705
				if(l2 != j1)
	//* 939 1837:iload           7
	//* 940 1839:iload           5
	//* 941 1841:icmpeq          1850
					j1 = 1;
	//  942 1844:iconst_1        
	//  943 1845:istore          5
				else
	//* 944 1847:goto            1853
					j1 = 0;
	//  945 1850:iconst_0        
	//  946 1851:istore          5
				i4 = j1 | i1;
	//  947 1853:iload           5
	//  948 1855:iload           4
	//  949 1857:ior             
	//  950 1858:istore          8
				if(i4 != 0)
	//* 951 1860:iload           8
	//* 952 1862:ifeq            1874
					ai1 = ((int []) (new long[l2]));
	//  953 1865:iload           7
	//  954 1867:newarray        long[]
	//  955 1869:astore          28
				else
	//* 956 1871:goto            1877
					ai1 = ((int []) (bgk1));
	//  957 1874:aload_1         
	//  958 1875:astore          28
				int ai4[];
				if(i4 != 0)
	//* 959 1877:iload           8
	//* 960 1879:ifeq            1891
					ai4 = new int[l2];
	//  961 1882:iload           7
	//  962 1884:newarray        int[]
	//  963 1886:astore          30
				else
	//* 964 1888:goto            1894
					ai4 = ((int []) (bhh1));
	//  965 1891:aload_0         
	//  966 1892:astore          30
				if(i4 != 0)
	//* 967 1894:iload           8
	//* 968 1896:ifeq            1901
					i = 0;
	//  969 1899:iconst_0        
	//  970 1900:istore_3        
				if(i4 != 0)
	//* 971 1901:iload           8
	//* 972 1903:ifeq            1914
					bfr1 = ((bfr) (new int[l2]));
	//  973 1906:iload           7
	//  974 1908:newarray        int[]
	//  975 1910:astore_2        
				else
	//* 976 1911:goto            1917
					bfr1 = ((bfr) (ai));
	//  977 1914:aload           27
	//  978 1916:astore_2        
				long al3[] = new long[l2];
	//  979 1917:iload           7
	//  980 1919:newarray        long[]
	//  981 1921:astore          33
				j1 = 0;
	//  982 1923:iconst_0        
	//  983 1924:istore          5
				i1 = 0;
	//  984 1926:iconst_0        
	//  985 1927:istore          4
				bhh bhh2 = bhh1;
	//  986 1929:aload_0         
	//  987 1930:astore          31
				l8 = l14;
	//  988 1932:lload           23
	//  989 1934:lstore          19
				while(j1 < bhh3.i.length) 
	//* 990 1936:iload           5
	//* 991 1938:aload           32
	//* 992 1940:getfield        #631 <Field long[] bhh.i>
	//* 993 1943:arraylength     
	//* 994 1944:icmpge          2189
				{
					long l13 = bhh3.j[j1];
	//  995 1947:aload           32
	//  996 1949:getfield        #637 <Field long[] bhh.j>
	//  997 1952:iload           5
	//  998 1954:laload          
	//  999 1955:lstore          21
					long l15 = bhh3.i[j1];
	// 1000 1957:aload           32
	// 1001 1959:getfield        #631 <Field long[] bhh.i>
	// 1002 1962:iload           5
	// 1003 1964:laload          
	// 1004 1965:lstore          23
					if(l13 != -1L)
	//*1005 1967:lload           21
	//*1006 1969:ldc2w           #649 <Long -1L>
	//*1007 1972:lcmp            
	//*1008 1973:ifeq            2167
					{
						long l18 = bnw.a(l15, bhh3.c, bhh3.d);
	// 1009 1976:lload           23
	// 1010 1978:aload           32
	// 1011 1980:getfield        #639 <Field long bhh.c>
	// 1012 1983:aload           32
	// 1013 1985:getfield        #640 <Field long bhh.d>
	// 1014 1988:invokestatic    #211 <Method long bnw.a(long, long, long)>
	// 1015 1991:lstore          25
						int i2 = bnw.b(al, l13, true, true);
	// 1016 1993:aload           29
	// 1017 1995:lload           21
	// 1018 1997:iconst_1        
	// 1019 1998:iconst_1        
	// 1020 1999:invokestatic    #653 <Method int bnw.b(long[], long, boolean, boolean)>
	// 1021 2002:istore          6
						int j5 = bnw.b(al, l18 + l13, flag7, false);
	// 1022 2004:aload           29
	// 1023 2006:lload           25
	// 1024 2008:lload           21
	// 1025 2010:ladd            
	// 1026 2011:iload           18
	// 1027 2013:iconst_0        
	// 1028 2014:invokestatic    #653 <Method int bnw.b(long[], long, boolean, boolean)>
	// 1029 2017:istore          9
						if(i4 != 0)
	//*1030 2019:iload           8
	//*1031 2021:ifeq            2071
						{
							int i3 = j5 - i2;
	// 1032 2024:iload           9
	// 1033 2026:iload           6
	// 1034 2028:isub            
	// 1035 2029:istore          7
							System.arraycopy(((Object) (bgk1)), i2, ((Object) (ai1)), i1, i3);
	// 1036 2031:aload_1         
	// 1037 2032:iload           6
	// 1038 2034:aload           28
	// 1039 2036:iload           4
	// 1040 2038:iload           7
	// 1041 2040:invokestatic    #659 <Method void System.arraycopy(Object, int, Object, int, int)>
							System.arraycopy(((Object) (bhh2)), i2, ((Object) (ai4)), i1, i3);
	// 1042 2043:aload           31
	// 1043 2045:iload           6
	// 1044 2047:aload           30
	// 1045 2049:iload           4
	// 1046 2051:iload           7
	// 1047 2053:invokestatic    #659 <Method void System.arraycopy(Object, int, Object, int, int)>
							System.arraycopy(((Object) (ai)), i2, ((Object) (bfr1)), i1, i3);
	// 1048 2056:aload           27
	// 1049 2058:iload           6
	// 1050 2060:aload_2         
	// 1051 2061:iload           4
	// 1052 2063:iload           7
	// 1053 2065:invokestatic    #659 <Method void System.arraycopy(Object, int, Object, int, int)>
						}
	//*1054 2068:goto            2071
						while(i2 < j5) 
	//*1055 2071:iload           6
	//*1056 2073:iload           9
	//*1057 2075:icmpge          2161
						{
							al3[i1] = bnw.a(l8, 0xf4240L, bhh3.d) + bnw.a(al[i2] - l13, 0xf4240L, bhh3.c);
	// 1058 2078:aload           33
	// 1059 2080:iload           4
	// 1060 2082:lload           19
	// 1061 2084:ldc2w           #207 <Long 0xf4240L>
	// 1062 2087:aload           32
	// 1063 2089:getfield        #640 <Field long bhh.d>
	// 1064 2092:invokestatic    #211 <Method long bnw.a(long, long, long)>
	// 1065 2095:aload           29
	// 1066 2097:iload           6
	// 1067 2099:laload          
	// 1068 2100:lload           21
	// 1069 2102:lsub            
	// 1070 2103:ldc2w           #207 <Long 0xf4240L>
	// 1071 2106:aload           32
	// 1072 2108:getfield        #639 <Field long bhh.c>
	// 1073 2111:invokestatic    #211 <Method long bnw.a(long, long, long)>
	// 1074 2114:ladd            
	// 1075 2115:lastore         
							int j3 = i;
	// 1076 2116:iload_3         
	// 1077 2117:istore          7
							if(i4 != 0)
	//*1078 2119:iload           8
	//*1079 2121:ifeq            2143
							{
								j3 = i;
	// 1080 2124:iload_3         
	// 1081 2125:istore          7
								if(ai4[i1] > i)
	//*1082 2127:aload           30
	//*1083 2129:iload           4
	//*1084 2131:iaload          
	//*1085 2132:iload_3         
	//*1086 2133:icmple          2143
									j3 = bhh2[i2];
	// 1087 2136:aload           31
	// 1088 2138:iload           6
	// 1089 2140:iaload          
	// 1090 2141:istore          7
							}
							i1++;
	// 1091 2143:iload           4
	// 1092 2145:iconst_1        
	// 1093 2146:iadd            
	// 1094 2147:istore          4
							i2++;
	// 1095 2149:iload           6
	// 1096 2151:iconst_1        
	// 1097 2152:iadd            
	// 1098 2153:istore          6
							i = j3;
	// 1099 2155:iload           7
	// 1100 2157:istore_3        
						}
	//*1101 2158:goto            2071
						bhh1 = ((bhh) (ai));
	// 1102 2161:aload           27
	// 1103 2163:astore_0        
					} else
	//*1104 2164:goto            2170
					{
						bhh1 = ((bhh) (ai));
	// 1105 2167:aload           27
	// 1106 2169:astore_0        
					}
					l8 += l15;
	// 1107 2170:lload           19
	// 1108 2172:lload           23
	// 1109 2174:ladd            
	// 1110 2175:lstore          19
					j1++;
	// 1111 2177:iload           5
	// 1112 2179:iconst_1        
	// 1113 2180:iadd            
	// 1114 2181:istore          5
					ai = ((int []) (bhh1));
	// 1115 2183:aload_0         
	// 1116 2184:astore          27
				}
	//*1117 2186:goto            1936
				i1 = 0;
	// 1118 2189:iconst_0        
	// 1119 2190:istore          4
				boolean flag;
				for(flag = false; i1 < bfr1.length && !flag; i1++)
	//*1120 2192:iconst_0        
	//*1121 2193:istore          5
	//*1122 2195:iload           4
	//*1123 2197:aload_2         
	//*1124 2198:arraylength     
	//*1125 2199:icmpge          2241
	//*1126 2202:iload           5
	//*1127 2204:ifne            2241
				{
					boolean flag1;
					if((bfr1[i1] & 1) != 0)
	//*1128 2207:aload_2         
	//*1129 2208:iload           4
	//*1130 2210:iaload          
	//*1131 2211:iconst_1        
	//*1132 2212:iand            
	//*1133 2213:ifeq            2222
						flag1 = true;
	// 1134 2216:iconst_1        
	// 1135 2217:istore          6
					else
	//*1136 2219:goto            2225
						flag1 = false;
	// 1137 2222:iconst_0        
	// 1138 2223:istore          6
					flag |= flag1;
	// 1139 2225:iload           5
	// 1140 2227:iload           6
	// 1141 2229:ior             
	// 1142 2230:istore          5
				}

	// 1143 2232:iload           4
	// 1144 2234:iconst_1        
	// 1145 2235:iadd            
	// 1146 2236:istore          4
	//*1147 2238:goto            2195
				if(flag)
	//*1148 2241:iload           5
	//*1149 2243:ifeq            2262
					return new bhk(((long []) (ai1)), ai4, i, al3, ((int []) (bfr1)));
	// 1150 2246:new             #535 <Class bhk>
	// 1151 2249:dup             
	// 1152 2250:aload           28
	// 1153 2252:aload           30
	// 1154 2254:iload_3         
	// 1155 2255:aload           33
	// 1156 2257:aload_2         
	// 1157 2258:invokespecial   #538 <Method void bhk(long[], int[], int, long[], int[])>
	// 1158 2261:areturn         
				else
					throw new bdj("The edited sample sequence does not contain a sync sample.");
	// 1159 2262:new             #661 <Class bdj>
	// 1160 2265:dup             
	// 1161 2266:ldc2            #663 <String "The edited sample sequence does not contain a sync sample.">
	// 1162 2269:invokespecial   #664 <Method void bdj(String)>
	// 1163 2272:athrow          
			} else
			{
				bnw.a(al, 0xf4240L, bhh3.c);
	// 1164 2273:aload           29
	// 1165 2275:ldc2w           #207 <Long 0xf4240L>
	// 1166 2278:aload           32
	// 1167 2280:getfield        #639 <Field long bhh.c>
	// 1168 2283:invokestatic    #648 <Method void bnw.a(long[], long, long)>
				return new bhk(((long []) (bgk1)), ai1, i, al, ai);
	// 1169 2286:new             #535 <Class bhk>
	// 1170 2289:dup             
	// 1171 2290:aload_1         
	// 1172 2291:aload           28
	// 1173 2293:iload_3         
	// 1174 2294:aload           29
	// 1175 2296:aload           27
	// 1176 2298:invokespecial   #538 <Method void bhk(long[], int[], int, long[], int[])>
	// 1177 2301:areturn         
			}
		}
		throw new bdj("Track has no sample table size information");
	// 1178 2302:new             #661 <Class bdj>
	// 1179 2305:dup             
	// 1180 2306:ldc2            #666 <String "Track has no sample table size information">
	// 1181 2309:invokespecial   #664 <Method void bdj(String)>
	// 1182 2312:athrow          
	}

	public static zzki a(bgl bgl1, boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		bgl1 = ((bgl) (bgl1.aP));
	//    4    6:aload_0         
	//    5    7:getfield        #178 <Field bno bgl.aP>
	//    6   10:astore_0        
		((bno) (bgl1)).c(8);
	//    7   11:aload_0         
	//    8   12:bipush          8
	//    9   14:invokevirtual   #65  <Method void bno.c(int)>
		int j;
		for(; ((bno) (bgl1)).b() >= 8; ((bno) (bgl1)).d(j - 8))
	//*  10   17:aload_0         
	//*  11   18:invokevirtual   #668 <Method int bno.b()>
	//*  12   21:bipush          8
	//*  13   23:icmplt          187
		{
			int i = ((bno) (bgl1)).d();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #62  <Method int bno.d()>
	//   16   30:istore_2        
			j = ((bno) (bgl1)).l();
	//   17   31:aload_0         
	//   18   32:invokevirtual   #68  <Method int bno.l()>
	//   19   35:istore_3        
			if(((bno) (bgl1)).l() == bgj.aA)
	//*  20   36:aload_0         
	//*  21   37:invokevirtual   #68  <Method int bno.l()>
	//*  22   40:getstatic       #671 <Field int bgj.aA>
	//*  23   43:icmpne          176
			{
				((bno) (bgl1)).c(i);
	//   24   46:aload_0         
	//   25   47:iload_2         
	//   26   48:invokevirtual   #65  <Method void bno.c(int)>
				((bno) (bgl1)).d(12);
	//   27   51:aload_0         
	//   28   52:bipush          12
	//   29   54:invokevirtual   #94  <Method void bno.d(int)>
				do
				{
					if(((bno) (bgl1)).d() >= i + j)
						break;
	//   30   57:aload_0         
	//   31   58:invokevirtual   #62  <Method int bno.d()>
	//   32   61:iload_2         
	//   33   62:iload_3         
	//   34   63:iadd            
	//   35   64:icmpge          174
					int k = ((bno) (bgl1)).d();
	//   36   67:aload_0         
	//   37   68:invokevirtual   #62  <Method int bno.d()>
	//   38   71:istore          4
					int l = ((bno) (bgl1)).l();
	//   39   73:aload_0         
	//   40   74:invokevirtual   #68  <Method int bno.l()>
	//   41   77:istore          5
					if(((bno) (bgl1)).l() == bgj.aB)
	//*  42   79:aload_0         
	//*  43   80:invokevirtual   #68  <Method int bno.l()>
	//*  44   83:getstatic       #674 <Field int bgj.aB>
	//*  45   86:icmpne          162
					{
						((bno) (bgl1)).c(k);
	//   46   89:aload_0         
	//   47   90:iload           4
	//   48   92:invokevirtual   #65  <Method void bno.c(int)>
						((bno) (bgl1)).d(8);
	//   49   95:aload_0         
	//   50   96:bipush          8
	//   51   98:invokevirtual   #94  <Method void bno.d(int)>
						ArrayList arraylist = new ArrayList();
	//   52  101:new             #676 <Class ArrayList>
	//   53  104:dup             
	//   54  105:invokespecial   #677 <Method void ArrayList()>
	//   55  108:astore          6
						do
						{
							if(((bno) (bgl1)).d() >= k + l)
								break;
	//   56  110:aload_0         
	//   57  111:invokevirtual   #62  <Method int bno.d()>
	//   58  114:iload           4
	//   59  116:iload           5
	//   60  118:iadd            
	//   61  119:icmpge          144
							zzki.zza zza = bhb.a(((bno) (bgl1)));
	//   62  122:aload_0         
	//   63  123:invokestatic    #682 <Method zzki$zza bhb.a(bno)>
	//   64  126:astore          7
							if(zza != null)
	//*  65  128:aload           7
	//*  66  130:ifnull          110
								arraylist.add(((Object) (zza)));
	//   67  133:aload           6
	//   68  135:aload           7
	//   69  137:invokevirtual   #685 <Method boolean ArrayList.add(Object)>
	//   70  140:pop             
						} while(true);
	//   71  141:goto            110
						if(!arraylist.isEmpty())
	//*  72  144:aload           6
	//*  73  146:invokevirtual   #688 <Method boolean ArrayList.isEmpty()>
	//*  74  149:ifne            174
							return new zzki(((java.util.List) (arraylist)));
	//   75  152:new             #690 <Class zzki>
	//   76  155:dup             
	//   77  156:aload           6
	//   78  158:invokespecial   #693 <Method void zzki(java.util.List)>
	//   79  161:areturn         
						break;
					}
					((bno) (bgl1)).d(l - 8);
	//   80  162:aload_0         
	//   81  163:iload           5
	//   82  165:bipush          8
	//   83  167:isub            
	//   84  168:invokevirtual   #94  <Method void bno.d(int)>
				} while(true);
	//   85  171:goto            57
				return null;
	//   86  174:aconst_null     
	//   87  175:areturn         
			}
		}

	//   88  176:aload_0         
	//   89  177:iload_3         
	//   90  178:bipush          8
	//   91  180:isub            
	//   92  181:invokevirtual   #94  <Method void bno.d(int)>
	//*  93  184:goto            17
		return null;
	//   94  187:aconst_null     
	//   95  188:areturn         
	}

	private static final int a = bnw.f("vide");
	private static final int b = bnw.f("soun");
	private static final int c = bnw.f("text");
	private static final int d = bnw.f("sbtl");
	private static final int e = bnw.f("subt");
	private static final int f = bnw.f("clcp");
	private static final int g = bnw.f("cenc");
	private static final int h = bnw.f("meta");

	static 
	{
	//    0    0:ldc1            #17  <String "vide">
	//    1    2:invokestatic    #22  <Method int bnw.f(String)>
	//    2    5:putstatic       #24  <Field int a>
	//    3    8:ldc1            #26  <String "soun">
	//    4   10:invokestatic    #22  <Method int bnw.f(String)>
	//    5   13:putstatic       #28  <Field int b>
	//    6   16:ldc1            #30  <String "text">
	//    7   18:invokestatic    #22  <Method int bnw.f(String)>
	//    8   21:putstatic       #32  <Field int c>
	//    9   24:ldc1            #34  <String "sbtl">
	//   10   26:invokestatic    #22  <Method int bnw.f(String)>
	//   11   29:putstatic       #36  <Field int d>
	//   12   32:ldc1            #38  <String "subt">
	//   13   34:invokestatic    #22  <Method int bnw.f(String)>
	//   14   37:putstatic       #40  <Field int e>
	//   15   40:ldc1            #42  <String "clcp">
	//   16   42:invokestatic    #22  <Method int bnw.f(String)>
	//   17   45:putstatic       #44  <Field int f>
	//   18   48:ldc1            #46  <String "cenc">
	//   19   50:invokestatic    #22  <Method int bnw.f(String)>
	//   20   53:putstatic       #48  <Field int g>
	//   21   56:ldc1            #50  <String "meta">
	//   22   58:invokestatic    #22  <Method int bnw.f(String)>
	//   23   61:putstatic       #52  <Field int h>
	//*  24   64:return          
	}
}
