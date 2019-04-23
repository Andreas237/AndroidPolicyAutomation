// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			ft, gb, fr, fy, 
//			fx, fv

public final class jp extends ft
	implements Cloneable
{

	public jp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void ft()>
		c = gb.c;
	//    2    4:aload_0         
	//    3    5:getstatic       #22  <Field String[] gb.c>
	//    4    8:putfield        #23  <Field String[] c>
		d = gb.c;
	//    5   11:aload_0         
	//    6   12:getstatic       #22  <Field String[] gb.c>
	//    7   15:putfield        #25  <Field String[] d>
		e = gb.a;
	//    8   18:aload_0         
	//    9   19:getstatic       #28  <Field int[] gb.a>
	//   10   22:putfield        #30  <Field int[] e>
		f = gb.b;
	//   11   25:aload_0         
	//   12   26:getstatic       #33  <Field long[] gb.b>
	//   13   29:putfield        #35  <Field long[] f>
		g = gb.b;
	//   14   32:aload_0         
	//   15   33:getstatic       #33  <Field long[] gb.b>
	//   16   36:putfield        #37  <Field long[] g>
		a = null;
	//   17   39:aload_0         
	//   18   40:aconst_null     
	//   19   41:putfield        #40  <Field fv a>
		b = -1;
	//   20   44:aload_0         
	//   21   45:iconst_m1       
	//   22   46:putfield        #43  <Field int b>
	//   23   49:return          
	}

	private final jp e()
	{
		jp jp1;
		Object aobj[];
		try
		{
			jp1 = (jp)super.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method ft ft.b()>
	//    2    4:checkcast       #2   <Class jp>
	//    3    7:astore_1        
		}
	//*   4    8:aload_0         
	//*   5    9:getfield        #23  <Field String[] c>
	//*   6   12:astore_2        
	//*   7   13:aload_2         
	//*   8   14:ifnull          33
	//*   9   17:aload_2         
	//*  10   18:arraylength     
	//*  11   19:ifle            33
	//*  12   22:aload_1         
	//*  13   23:aload_2         
	//*  14   24:invokevirtual   #55  <Method Object _5B_Ljava.lang.String_3B_.clone()>
	//*  15   27:checkcast       #51  <Class String[]>
	//*  16   30:putfield        #23  <Field String[] c>
	//*  17   33:aload_0         
	//*  18   34:getfield        #25  <Field String[] d>
	//*  19   37:astore_2        
	//*  20   38:aload_2         
	//*  21   39:ifnull          58
	//*  22   42:aload_2         
	//*  23   43:arraylength     
	//*  24   44:ifle            58
	//*  25   47:aload_1         
	//*  26   48:aload_2         
	//*  27   49:invokevirtual   #55  <Method Object _5B_Ljava.lang.String_3B_.clone()>
	//*  28   52:checkcast       #51  <Class String[]>
	//*  29   55:putfield        #25  <Field String[] d>
	//*  30   58:aload_0         
	//*  31   59:getfield        #30  <Field int[] e>
	//*  32   62:astore_2        
	//*  33   63:aload_2         
	//*  34   64:ifnull          83
	//*  35   67:aload_2         
	//*  36   68:arraylength     
	//*  37   69:ifle            83
	//*  38   72:aload_1         
	//*  39   73:aload_2         
	//*  40   74:invokevirtual   #57  <Method Object _5B_I.clone()>
	//*  41   77:checkcast       #56  <Class int[]>
	//*  42   80:putfield        #30  <Field int[] e>
	//*  43   83:aload_0         
	//*  44   84:getfield        #35  <Field long[] f>
	//*  45   87:astore_2        
	//*  46   88:aload_2         
	//*  47   89:ifnull          108
	//*  48   92:aload_2         
	//*  49   93:arraylength     
	//*  50   94:ifle            108
	//*  51   97:aload_1         
	//*  52   98:aload_2         
	//*  53   99:invokevirtual   #59  <Method Object _5B_J.clone()>
	//*  54  102:checkcast       #58  <Class long[]>
	//*  55  105:putfield        #35  <Field long[] f>
	//*  56  108:aload_0         
	//*  57  109:getfield        #37  <Field long[] g>
	//*  58  112:astore_2        
	//*  59  113:aload_2         
	//*  60  114:ifnull          133
	//*  61  117:aload_2         
	//*  62  118:arraylength     
	//*  63  119:ifle            133
	//*  64  122:aload_1         
	//*  65  123:aload_2         
	//*  66  124:invokevirtual   #59  <Method Object _5B_J.clone()>
	//*  67  127:checkcast       #58  <Class long[]>
	//*  68  130:putfield        #37  <Field long[] g>
	//*  69  133:aload_1         
	//*  70  134:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*  71  135:astore_1        
		{
			throw new AssertionError(((Object) (clonenotsupportedexception)));
	//   72  136:new             #61  <Class AssertionError>
	//   73  139:dup             
	//   74  140:aload_1         
	//   75  141:invokespecial   #64  <Method void AssertionError(Object)>
	//   76  144:athrow          
		}
		aobj = ((Object []) (c));
		if(aobj != null && aobj.length > 0)
			jp1.c = (String[])((String []) (aobj)).clone();
		aobj = ((Object []) (d));
		if(aobj != null && aobj.length > 0)
			jp1.d = (String[])((String []) (aobj)).clone();
		aobj = ((Object []) (e));
		if(aobj != null && aobj.length > 0)
			jp1.e = (int[])((int []) (aobj)).clone();
		aobj = ((Object []) (f));
		if(aobj != null && aobj.length > 0)
			jp1.f = (long[])((long []) (aobj)).clone();
		aobj = ((Object []) (g));
		if(aobj != null && aobj.length > 0)
			jp1.g = (long[])((long []) (aobj)).clone();
		return jp1;
	}

	protected final int a()
	{
		int i3 = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method int ft.a()>
	//    2    4:istore          6
		Object aobj[] = ((Object []) (c));
	//    3    6:aload_0         
	//    4    7:getfield        #23  <Field String[] c>
	//    5   10:astore          8
		boolean flag = false;
	//    6   12:iconst_0        
	//    7   13:istore          7
		int i = i3;
	//    8   15:iload           6
	//    9   17:istore_1        
		if(aobj != null)
	//*  10   18:aload           8
	//*  11   20:ifnull          104
		{
			i = i3;
	//   12   23:iload           6
	//   13   25:istore_1        
			if(aobj.length > 0)
	//*  14   26:aload           8
	//*  15   28:arraylength     
	//*  16   29:ifle            104
			{
				i = 0;
	//   17   32:iconst_0        
	//   18   33:istore_1        
				int j = 0;
	//   19   34:iconst_0        
	//   20   35:istore_2        
				int l = 0;
	//   21   36:iconst_0        
	//   22   37:istore_3        
				do
				{
					aobj = ((Object []) (c));
	//   23   38:aload_0         
	//   24   39:getfield        #23  <Field String[] c>
	//   25   42:astore          8
					if(i >= aobj.length)
						break;
	//   26   44:iload_1         
	//   27   45:aload           8
	//   28   47:arraylength     
	//   29   48:icmpge          95
					String s = aobj[i];
	//   30   51:aload           8
	//   31   53:iload_1         
	//   32   54:aaload          
	//   33   55:astore          8
					int k2 = j;
	//   34   57:iload_2         
	//   35   58:istore          5
					int i2 = l;
	//   36   60:iload_3         
	//   37   61:istore          4
					if(s != null)
	//*  38   63:aload           8
	//*  39   65:ifnull          82
					{
						i2 = l + 1;
	//   40   68:iload_3         
	//   41   69:iconst_1        
	//   42   70:iadd            
	//   43   71:istore          4
						k2 = j + fr.a(s);
	//   44   73:iload_2         
	//   45   74:aload           8
	//   46   76:invokestatic    #72  <Method int fr.a(String)>
	//   47   79:iadd            
	//   48   80:istore          5
					}
					i++;
	//   49   82:iload_1         
	//   50   83:iconst_1        
	//   51   84:iadd            
	//   52   85:istore_1        
					j = k2;
	//   53   86:iload           5
	//   54   88:istore_2        
					l = i2;
	//   55   89:iload           4
	//   56   91:istore_3        
				} while(true);
	//   57   92:goto            38
				i = i3 + j + l * 1;
	//   58   95:iload           6
	//   59   97:iload_2         
	//   60   98:iadd            
	//   61   99:iload_3         
	//   62  100:iconst_1        
	//   63  101:imul            
	//   64  102:iadd            
	//   65  103:istore_1        
			}
		}
		s = ((String) (d));
	//   66  104:aload_0         
	//   67  105:getfield        #25  <Field String[] d>
	//   68  108:astore          8
		int k = i;
	//   69  110:iload_1         
	//   70  111:istore_2        
		if(s != null)
	//*  71  112:aload           8
	//*  72  114:ifnull          201
		{
			k = i;
	//   73  117:iload_1         
	//   74  118:istore_2        
			if(s.length > 0)
	//*  75  119:aload           8
	//*  76  121:arraylength     
	//*  77  122:ifle            201
			{
				k = 0;
	//   78  125:iconst_0        
	//   79  126:istore_2        
				int i1 = 0;
	//   80  127:iconst_0        
	//   81  128:istore_3        
				int j2 = 0;
	//   82  129:iconst_0        
	//   83  130:istore          4
				do
				{
					s = ((String) (d));
	//   84  132:aload_0         
	//   85  133:getfield        #25  <Field String[] d>
	//   86  136:astore          8
					if(k >= s.length)
						break;
	//   87  138:iload_2         
	//   88  139:aload           8
	//   89  141:arraylength     
	//   90  142:icmpge          192
					String s1 = s[k];
	//   91  145:aload           8
	//   92  147:iload_2         
	//   93  148:aaload          
	//   94  149:astore          8
					int j3 = i1;
	//   95  151:iload_3         
	//   96  152:istore          6
					int l2 = j2;
	//   97  154:iload           4
	//   98  156:istore          5
					if(s1 != null)
	//*  99  158:aload           8
	//* 100  160:ifnull          178
					{
						l2 = j2 + 1;
	//  101  163:iload           4
	//  102  165:iconst_1        
	//  103  166:iadd            
	//  104  167:istore          5
						j3 = i1 + fr.a(s1);
	//  105  169:iload_3         
	//  106  170:aload           8
	//  107  172:invokestatic    #72  <Method int fr.a(String)>
	//  108  175:iadd            
	//  109  176:istore          6
					}
					k++;
	//  110  178:iload_2         
	//  111  179:iconst_1        
	//  112  180:iadd            
	//  113  181:istore_2        
					i1 = j3;
	//  114  182:iload           6
	//  115  184:istore_3        
					j2 = l2;
	//  116  185:iload           5
	//  117  187:istore          4
				} while(true);
	//  118  189:goto            132
				k = i + i1 + j2 * 1;
	//  119  192:iload_1         
	//  120  193:iload_3         
	//  121  194:iadd            
	//  122  195:iload           4
	//  123  197:iconst_1        
	//  124  198:imul            
	//  125  199:iadd            
	//  126  200:istore_2        
			}
		}
		s1 = ((String) (e));
	//  127  201:aload_0         
	//  128  202:getfield        #30  <Field int[] e>
	//  129  205:astore          8
		i = k;
	//  130  207:iload_2         
	//  131  208:istore_1        
		if(s1 != null)
	//* 132  209:aload           8
	//* 133  211:ifnull          266
		{
			i = k;
	//  134  214:iload_2         
	//  135  215:istore_1        
			if(s1.length > 0)
	//* 136  216:aload           8
	//* 137  218:arraylength     
	//* 138  219:ifle            266
			{
				i = 0;
	//  139  222:iconst_0        
	//  140  223:istore_1        
				int j1 = 0;
	//  141  224:iconst_0        
	//  142  225:istore_3        
				do
				{
					s1 = ((String) (e));
	//  143  226:aload_0         
	//  144  227:getfield        #30  <Field int[] e>
	//  145  230:astore          8
					if(i >= s1.length)
						break;
	//  146  232:iload_1         
	//  147  233:aload           8
	//  148  235:arraylength     
	//  149  236:icmpge          256
					j1 += fr.a(s1[i]);
	//  150  239:iload_3         
	//  151  240:aload           8
	//  152  242:iload_1         
	//  153  243:iaload          
	//  154  244:invokestatic    #75  <Method int fr.a(int)>
	//  155  247:iadd            
	//  156  248:istore_3        
					i++;
	//  157  249:iload_1         
	//  158  250:iconst_1        
	//  159  251:iadd            
	//  160  252:istore_1        
				} while(true);
	//  161  253:goto            226
				i = k + j1 + s1.length * 1;
	//  162  256:iload_2         
	//  163  257:iload_3         
	//  164  258:iadd            
	//  165  259:aload           8
	//  166  261:arraylength     
	//  167  262:iconst_1        
	//  168  263:imul            
	//  169  264:iadd            
	//  170  265:istore_1        
			}
		}
		s1 = ((String) (f));
	//  171  266:aload_0         
	//  172  267:getfield        #35  <Field long[] f>
	//  173  270:astore          8
		k = i;
	//  174  272:iload_1         
	//  175  273:istore_2        
		if(s1 != null)
	//* 176  274:aload           8
	//* 177  276:ifnull          331
		{
			k = i;
	//  178  279:iload_1         
	//  179  280:istore_2        
			if(s1.length > 0)
	//* 180  281:aload           8
	//* 181  283:arraylength     
	//* 182  284:ifle            331
			{
				k = 0;
	//  183  287:iconst_0        
	//  184  288:istore_2        
				int k1 = 0;
	//  185  289:iconst_0        
	//  186  290:istore_3        
				do
				{
					s1 = ((String) (f));
	//  187  291:aload_0         
	//  188  292:getfield        #35  <Field long[] f>
	//  189  295:astore          8
					if(k >= s1.length)
						break;
	//  190  297:iload_2         
	//  191  298:aload           8
	//  192  300:arraylength     
	//  193  301:icmpge          321
					k1 += fr.b(s1[k]);
	//  194  304:iload_3         
	//  195  305:aload           8
	//  196  307:iload_2         
	//  197  308:laload          
	//  198  309:invokestatic    #78  <Method int fr.b(long)>
	//  199  312:iadd            
	//  200  313:istore_3        
					k++;
	//  201  314:iload_2         
	//  202  315:iconst_1        
	//  203  316:iadd            
	//  204  317:istore_2        
				} while(true);
	//  205  318:goto            291
				k = i + k1 + s1.length * 1;
	//  206  321:iload_1         
	//  207  322:iload_3         
	//  208  323:iadd            
	//  209  324:aload           8
	//  210  326:arraylength     
	//  211  327:iconst_1        
	//  212  328:imul            
	//  213  329:iadd            
	//  214  330:istore_2        
			}
		}
		s1 = ((String) (g));
	//  215  331:aload_0         
	//  216  332:getfield        #37  <Field long[] g>
	//  217  335:astore          8
		i = k;
	//  218  337:iload_2         
	//  219  338:istore_1        
		if(s1 != null)
	//* 220  339:aload           8
	//* 221  341:ifnull          397
		{
			i = k;
	//  222  344:iload_2         
	//  223  345:istore_1        
			if(s1.length > 0)
	//* 224  346:aload           8
	//* 225  348:arraylength     
	//* 226  349:ifle            397
			{
				int l1 = 0;
	//  227  352:iconst_0        
	//  228  353:istore_3        
				i = ((int) (flag));
	//  229  354:iload           7
	//  230  356:istore_1        
				long al[];
				do
				{
					al = g;
	//  231  357:aload_0         
	//  232  358:getfield        #37  <Field long[] g>
	//  233  361:astore          8
					if(i >= al.length)
						break;
	//  234  363:iload_1         
	//  235  364:aload           8
	//  236  366:arraylength     
	//  237  367:icmpge          387
					l1 += fr.b(al[i]);
	//  238  370:iload_3         
	//  239  371:aload           8
	//  240  373:iload_1         
	//  241  374:laload          
	//  242  375:invokestatic    #78  <Method int fr.b(long)>
	//  243  378:iadd            
	//  244  379:istore_3        
					i++;
	//  245  380:iload_1         
	//  246  381:iconst_1        
	//  247  382:iadd            
	//  248  383:istore_1        
				} while(true);
	//  249  384:goto            357
				i = k + l1 + al.length * 1;
	//  250  387:iload_2         
	//  251  388:iload_3         
	//  252  389:iadd            
	//  253  390:aload           8
	//  254  392:arraylength     
	//  255  393:iconst_1        
	//  256  394:imul            
	//  257  395:iadd            
	//  258  396:istore_1        
			}
		}
		return i;
	//  259  397:iload_1         
	//  260  398:ireturn         
	}

	public final void a(fr fr1)
	{
		Object aobj[] = ((Object []) (c));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String[] c>
	//    2    4:astore          4
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		if(aobj != null && aobj.length > 0)
	//*   5    8:aload           4
	//*   6   10:ifnull          59
	//*   7   13:aload           4
	//*   8   15:arraylength     
	//*   9   16:ifle            59
		{
			int i = 0;
	//   10   19:iconst_0        
	//   11   20:istore_2        
			do
			{
				aobj = ((Object []) (c));
	//   12   21:aload_0         
	//   13   22:getfield        #23  <Field String[] c>
	//   14   25:astore          4
				if(i >= aobj.length)
					break;
	//   15   27:iload_2         
	//   16   28:aload           4
	//   17   30:arraylength     
	//   18   31:icmpge          59
				String s = aobj[i];
	//   19   34:aload           4
	//   20   36:iload_2         
	//   21   37:aaload          
	//   22   38:astore          4
				if(s != null)
	//*  23   40:aload           4
	//*  24   42:ifnull          52
					fr1.a(1, s);
	//   25   45:aload_1         
	//   26   46:iconst_1        
	//   27   47:aload           4
	//   28   49:invokevirtual   #82  <Method void fr.a(int, String)>
				i++;
	//   29   52:iload_2         
	//   30   53:iconst_1        
	//   31   54:iadd            
	//   32   55:istore_2        
			} while(true);
	//   33   56:goto            21
		}
		s = ((String) (d));
	//   34   59:aload_0         
	//   35   60:getfield        #25  <Field String[] d>
	//   36   63:astore          4
		if(s != null && s.length > 0)
	//*  37   65:aload           4
	//*  38   67:ifnull          116
	//*  39   70:aload           4
	//*  40   72:arraylength     
	//*  41   73:ifle            116
		{
			int j = 0;
	//   42   76:iconst_0        
	//   43   77:istore_2        
			do
			{
				s = ((String) (d));
	//   44   78:aload_0         
	//   45   79:getfield        #25  <Field String[] d>
	//   46   82:astore          4
				if(j >= s.length)
					break;
	//   47   84:iload_2         
	//   48   85:aload           4
	//   49   87:arraylength     
	//   50   88:icmpge          116
				String s1 = s[j];
	//   51   91:aload           4
	//   52   93:iload_2         
	//   53   94:aaload          
	//   54   95:astore          4
				if(s1 != null)
	//*  55   97:aload           4
	//*  56   99:ifnull          109
					fr1.a(2, s1);
	//   57  102:aload_1         
	//   58  103:iconst_2        
	//   59  104:aload           4
	//   60  106:invokevirtual   #82  <Method void fr.a(int, String)>
				j++;
	//   61  109:iload_2         
	//   62  110:iconst_1        
	//   63  111:iadd            
	//   64  112:istore_2        
			} while(true);
	//   65  113:goto            78
		}
		s1 = ((String) (e));
	//   66  116:aload_0         
	//   67  117:getfield        #30  <Field int[] e>
	//   68  120:astore          4
		if(s1 != null && s1.length > 0)
	//*  69  122:aload           4
	//*  70  124:ifnull          164
	//*  71  127:aload           4
	//*  72  129:arraylength     
	//*  73  130:ifle            164
		{
			int k = 0;
	//   74  133:iconst_0        
	//   75  134:istore_2        
			do
			{
				s1 = ((String) (e));
	//   76  135:aload_0         
	//   77  136:getfield        #30  <Field int[] e>
	//   78  139:astore          4
				if(k >= s1.length)
					break;
	//   79  141:iload_2         
	//   80  142:aload           4
	//   81  144:arraylength     
	//   82  145:icmpge          164
				fr1.a(3, s1[k]);
	//   83  148:aload_1         
	//   84  149:iconst_3        
	//   85  150:aload           4
	//   86  152:iload_2         
	//   87  153:iaload          
	//   88  154:invokevirtual   #85  <Method void fr.a(int, int)>
				k++;
	//   89  157:iload_2         
	//   90  158:iconst_1        
	//   91  159:iadd            
	//   92  160:istore_2        
			} while(true);
	//   93  161:goto            135
		}
		s1 = ((String) (f));
	//   94  164:aload_0         
	//   95  165:getfield        #35  <Field long[] f>
	//   96  168:astore          4
		if(s1 != null && s1.length > 0)
	//*  97  170:aload           4
	//*  98  172:ifnull          212
	//*  99  175:aload           4
	//* 100  177:arraylength     
	//* 101  178:ifle            212
		{
			int l = 0;
	//  102  181:iconst_0        
	//  103  182:istore_2        
			do
			{
				s1 = ((String) (f));
	//  104  183:aload_0         
	//  105  184:getfield        #35  <Field long[] f>
	//  106  187:astore          4
				if(l >= s1.length)
					break;
	//  107  189:iload_2         
	//  108  190:aload           4
	//  109  192:arraylength     
	//  110  193:icmpge          212
				fr1.a(4, s1[l]);
	//  111  196:aload_1         
	//  112  197:iconst_4        
	//  113  198:aload           4
	//  114  200:iload_2         
	//  115  201:laload          
	//  116  202:invokevirtual   #88  <Method void fr.a(int, long)>
				l++;
	//  117  205:iload_2         
	//  118  206:iconst_1        
	//  119  207:iadd            
	//  120  208:istore_2        
			} while(true);
	//  121  209:goto            183
		}
		s1 = ((String) (g));
	//  122  212:aload_0         
	//  123  213:getfield        #37  <Field long[] g>
	//  124  216:astore          4
		if(s1 != null && s1.length > 0)
	//* 125  218:aload           4
	//* 126  220:ifnull          260
	//* 127  223:aload           4
	//* 128  225:arraylength     
	//* 129  226:ifle            260
		{
			int i1 = ((int) (flag));
	//  130  229:iload_3         
	//  131  230:istore_2        
			do
			{
				long al[] = g;
	//  132  231:aload_0         
	//  133  232:getfield        #37  <Field long[] g>
	//  134  235:astore          4
				if(i1 >= al.length)
					break;
	//  135  237:iload_2         
	//  136  238:aload           4
	//  137  240:arraylength     
	//  138  241:icmpge          260
				fr1.a(5, al[i1]);
	//  139  244:aload_1         
	//  140  245:iconst_5        
	//  141  246:aload           4
	//  142  248:iload_2         
	//  143  249:laload          
	//  144  250:invokevirtual   #88  <Method void fr.a(int, long)>
				i1++;
	//  145  253:iload_2         
	//  146  254:iconst_1        
	//  147  255:iadd            
	//  148  256:istore_2        
			} while(true);
	//  149  257:goto            231
		}
		super.a(fr1);
	//  150  260:aload_0         
	//  151  261:aload_1         
	//  152  262:invokespecial   #90  <Method void ft.a(fr)>
	//  153  265:return          
	}

	public final ft b()
	{
		return ((ft) ((jp)((fy)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method Object fy.clone()>
	//    2    4:checkcast       #2   <Class jp>
	//    3    7:areturn         
	}

	public final fy c()
	{
		return ((fy) ((jp)((fy)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method Object fy.clone()>
	//    2    4:checkcast       #2   <Class jp>
	//    3    7:areturn         
	}

	public final Object clone()
	{
		return ((Object) (e()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method jp e()>
	//    2    4:areturn         
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
		if(!(obj instanceof jp))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class jp>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((jp)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class jp>
	//   12   20:astore_1        
		if(!fx.a(((Object []) (c)), ((Object []) (((jp) (obj)).c))))
	//*  13   21:aload_0         
	//*  14   22:getfield        #23  <Field String[] c>
	//*  15   25:aload_1         
	//*  16   26:getfield        #23  <Field String[] c>
	//*  17   29:invokestatic    #103 <Method boolean fx.a(Object[], Object[])>
	//*  18   32:ifne            37
			return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
		if(!fx.a(((Object []) (d)), ((Object []) (((jp) (obj)).d))))
	//*  21   37:aload_0         
	//*  22   38:getfield        #25  <Field String[] d>
	//*  23   41:aload_1         
	//*  24   42:getfield        #25  <Field String[] d>
	//*  25   45:invokestatic    #103 <Method boolean fx.a(Object[], Object[])>
	//*  26   48:ifne            53
			return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
		if(!fx.a(e, ((jp) (obj)).e))
	//*  29   53:aload_0         
	//*  30   54:getfield        #30  <Field int[] e>
	//*  31   57:aload_1         
	//*  32   58:getfield        #30  <Field int[] e>
	//*  33   61:invokestatic    #106 <Method boolean fx.a(int[], int[])>
	//*  34   64:ifne            69
			return false;
	//   35   67:iconst_0        
	//   36   68:ireturn         
		if(!fx.a(f, ((jp) (obj)).f))
	//*  37   69:aload_0         
	//*  38   70:getfield        #35  <Field long[] f>
	//*  39   73:aload_1         
	//*  40   74:getfield        #35  <Field long[] f>
	//*  41   77:invokestatic    #109 <Method boolean fx.a(long[], long[])>
	//*  42   80:ifne            85
			return false;
	//   43   83:iconst_0        
	//   44   84:ireturn         
		if(!fx.a(g, ((jp) (obj)).g))
	//*  45   85:aload_0         
	//*  46   86:getfield        #37  <Field long[] g>
	//*  47   89:aload_1         
	//*  48   90:getfield        #37  <Field long[] g>
	//*  49   93:invokestatic    #109 <Method boolean fx.a(long[], long[])>
	//*  50   96:ifne            101
			return false;
	//   51   99:iconst_0        
	//   52  100:ireturn         
		if(a != null && !a.b())
	//*  53  101:aload_0         
	//*  54  102:getfield        #40  <Field fv a>
	//*  55  105:ifnull          133
	//*  56  108:aload_0         
	//*  57  109:getfield        #40  <Field fv a>
	//*  58  112:invokevirtual   #114 <Method boolean fv.b()>
	//*  59  115:ifeq            121
	//*  60  118:goto            133
			return a.equals(((Object) (((jp) (obj)).a)));
	//   61  121:aload_0         
	//   62  122:getfield        #40  <Field fv a>
	//   63  125:aload_1         
	//   64  126:getfield        #40  <Field fv a>
	//   65  129:invokevirtual   #116 <Method boolean fv.equals(Object)>
	//   66  132:ireturn         
		if(((jp) (obj)).a != null)
	//*  67  133:aload_1         
	//*  68  134:getfield        #40  <Field fv a>
	//*  69  137:ifnull          154
			return ((jp) (obj)).a.b();
	//   70  140:aload_1         
	//   71  141:getfield        #40  <Field fv a>
	//   72  144:invokevirtual   #114 <Method boolean fv.b()>
	//   73  147:ifeq            152
	//   74  150:iconst_1        
	//   75  151:ireturn         
	//   76  152:iconst_0        
	//   77  153:ireturn         
		else
			return true;
	//   78  154:iconst_1        
	//   79  155:ireturn         
	}

	public final int hashCode()
	{
		int j = ((Object)this).getClass().getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #123 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #129 <Method String Class.getName()>
	//    3    7:invokevirtual   #133 <Method int String.hashCode()>
	//    4   10:istore_2        
		int k = fx.a(((Object []) (c)));
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field String[] c>
	//    7   15:invokestatic    #136 <Method int fx.a(Object[])>
	//    8   18:istore_3        
		int l = fx.a(((Object []) (d)));
	//    9   19:aload_0         
	//   10   20:getfield        #25  <Field String[] d>
	//   11   23:invokestatic    #136 <Method int fx.a(Object[])>
	//   12   26:istore          4
		int i1 = fx.a(e);
	//   13   28:aload_0         
	//   14   29:getfield        #30  <Field int[] e>
	//   15   32:invokestatic    #139 <Method int fx.a(int[])>
	//   16   35:istore          5
		int j1 = fx.a(f);
	//   17   37:aload_0         
	//   18   38:getfield        #35  <Field long[] f>
	//   19   41:invokestatic    #142 <Method int fx.a(long[])>
	//   20   44:istore          6
		int k1 = fx.a(g);
	//   21   46:aload_0         
	//   22   47:getfield        #37  <Field long[] g>
	//   23   50:invokestatic    #142 <Method int fx.a(long[])>
	//   24   53:istore          7
		int i;
		if(a != null && !a.b())
	//*  25   55:aload_0         
	//*  26   56:getfield        #40  <Field fv a>
	//*  27   59:ifnull          86
	//*  28   62:aload_0         
	//*  29   63:getfield        #40  <Field fv a>
	//*  30   66:invokevirtual   #114 <Method boolean fv.b()>
	//*  31   69:ifeq            75
	//*  32   72:goto            86
			i = a.hashCode();
	//   33   75:aload_0         
	//   34   76:getfield        #40  <Field fv a>
	//   35   79:invokevirtual   #143 <Method int fv.hashCode()>
	//   36   82:istore_1        
		else
	//*  37   83:goto            88
			i = 0;
	//   38   86:iconst_0        
	//   39   87:istore_1        
		return ((((((j + 527) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + i;
	//   40   88:iload_2         
	//   41   89:sipush          527
	//   42   92:iadd            
	//   43   93:bipush          31
	//   44   95:imul            
	//   45   96:iload_3         
	//   46   97:iadd            
	//   47   98:bipush          31
	//   48  100:imul            
	//   49  101:iload           4
	//   50  103:iadd            
	//   51  104:bipush          31
	//   52  106:imul            
	//   53  107:iload           5
	//   54  109:iadd            
	//   55  110:bipush          31
	//   56  112:imul            
	//   57  113:iload           6
	//   58  115:iadd            
	//   59  116:bipush          31
	//   60  118:imul            
	//   61  119:iload           7
	//   62  121:iadd            
	//   63  122:bipush          31
	//   64  124:imul            
	//   65  125:iload_1         
	//   66  126:iadd            
	//   67  127:ireturn         
	}

	private String c[];
	private String d[];
	private int e[];
	private long f[];
	private long g[];
}
