// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			ft, jt, gb, fy, 
//			jp, jq, fr, as, 
//			fx, br, fv, hy, 
//			gm

public final class js extends ft
	implements Cloneable
{

	public js()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void ft()>
		c = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #48  <Field long c>
		d = 0L;
	//    5    9:aload_0         
	//    6   10:lconst_0        
	//    7   11:putfield        #50  <Field long d>
		j = 0L;
	//    8   14:aload_0         
	//    9   15:lconst_0        
	//   10   16:putfield        #52  <Field long j>
		k = "";
	//   11   19:aload_0         
	//   12   20:ldc1            #54  <String "">
	//   13   22:putfield        #56  <Field String k>
		e = 0;
	//   14   25:aload_0         
	//   15   26:iconst_0        
	//   16   27:putfield        #58  <Field int e>
		l = "";
	//   17   30:aload_0         
	//   18   31:ldc1            #54  <String "">
	//   19   33:putfield        #60  <Field String l>
		m = 0;
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:putfield        #62  <Field int m>
		n = false;
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:putfield        #64  <Field boolean n>
		o = jt.e();
	//   26   46:aload_0         
	//   27   47:invokestatic    #69  <Method jt[] jt.e()>
	//   28   50:putfield        #71  <Field jt[] o>
		p = gb.e;
	//   29   53:aload_0         
	//   30   54:getstatic       #75  <Field byte[] gb.e>
	//   31   57:putfield        #77  <Field byte[] p>
		q = null;
	//   32   60:aload_0         
	//   33   61:aconst_null     
	//   34   62:putfield        #79  <Field gm q>
		f = gb.e;
	//   35   65:aload_0         
	//   36   66:getstatic       #75  <Field byte[] gb.e>
	//   37   69:putfield        #81  <Field byte[] f>
		r = "";
	//   38   72:aload_0         
	//   39   73:ldc1            #54  <String "">
	//   40   75:putfield        #83  <Field String r>
		s = "";
	//   41   78:aload_0         
	//   42   79:ldc1            #54  <String "">
	//   43   81:putfield        #85  <Field String s>
		t = null;
	//   44   84:aload_0         
	//   45   85:aconst_null     
	//   46   86:putfield        #87  <Field jp t>
		u = "";
	//   47   89:aload_0         
	//   48   90:ldc1            #54  <String "">
	//   49   92:putfield        #89  <Field String u>
		g = 0x2bf20L;
	//   50   95:aload_0         
	//   51   96:ldc2w           #90  <Long 0x2bf20L>
	//   52   99:putfield        #93  <Field long g>
		v = null;
	//   53  102:aload_0         
	//   54  103:aconst_null     
	//   55  104:putfield        #95  <Field jq v>
		h = gb.e;
	//   56  107:aload_0         
	//   57  108:getstatic       #75  <Field byte[] gb.e>
	//   58  111:putfield        #97  <Field byte[] h>
		w = "";
	//   59  114:aload_0         
	//   60  115:ldc1            #54  <String "">
	//   61  117:putfield        #99  <Field String w>
		x = 0;
	//   62  120:aload_0         
	//   63  121:iconst_0        
	//   64  122:putfield        #101 <Field int x>
		y = gb.a;
	//   65  125:aload_0         
	//   66  126:getstatic       #104 <Field int[] gb.a>
	//   67  129:putfield        #106 <Field int[] y>
		z = 0L;
	//   68  132:aload_0         
	//   69  133:lconst_0        
	//   70  134:putfield        #108 <Field long z>
		A = null;
	//   71  137:aload_0         
	//   72  138:aconst_null     
	//   73  139:putfield        #110 <Field hy A>
		i = false;
	//   74  142:aload_0         
	//   75  143:iconst_0        
	//   76  144:putfield        #112 <Field boolean i>
		a = null;
	//   77  147:aload_0         
	//   78  148:aconst_null     
	//   79  149:putfield        #115 <Field fv a>
		b = -1;
	//   80  152:aload_0         
	//   81  153:iconst_m1       
	//   82  154:putfield        #118 <Field int b>
	//   83  157:return          
	}

	private final js e()
	{
		js js1;
		Object aobj[];
		Object obj;
		try
		{
			js1 = (js)super.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method ft ft.b()>
	//    2    4:checkcast       #2   <Class js>
	//    3    7:astore_2        
		}
	//*   4    8:aload_0         
	//*   5    9:getfield        #71  <Field jt[] o>
	//*   6   12:astore_3        
	//*   7   13:aload_3         
	//*   8   14:ifnull          72
	//*   9   17:aload_3         
	//*  10   18:arraylength     
	//*  11   19:ifle            72
	//*  12   22:aload_2         
	//*  13   23:aload_3         
	//*  14   24:arraylength     
	//*  15   25:anewarray       jt[]
	//*  16   28:putfield        #71  <Field jt[] o>
	//*  17   31:iconst_0        
	//*  18   32:istore_1        
	//*  19   33:aload_0         
	//*  20   34:getfield        #71  <Field jt[] o>
	//*  21   37:astore_3        
	//*  22   38:iload_1         
	//*  23   39:aload_3         
	//*  24   40:arraylength     
	//*  25   41:icmpge          72
	//*  26   44:aload_3         
	//*  27   45:iload_1         
	//*  28   46:aaload          
	//*  29   47:ifnull          65
	//*  30   50:aload_2         
	//*  31   51:getfield        #71  <Field jt[] o>
	//*  32   54:iload_1         
	//*  33   55:aload_3         
	//*  34   56:iload_1         
	//*  35   57:aaload          
	//*  36   58:invokevirtual   #131 <Method Object fy.clone()>
	//*  37   61:checkcast       #66  <Class jt>
	//*  38   64:aastore         
	//*  39   65:iload_1         
	//*  40   66:iconst_1        
	//*  41   67:iadd            
	//*  42   68:istore_1        
	//*  43   69:goto            33
	//*  44   72:aload_0         
	//*  45   73:getfield        #79  <Field gm q>
	//*  46   76:astore_3        
	//*  47   77:aload_3         
	//*  48   78:ifnull          86
	//*  49   81:aload_2         
	//*  50   82:aload_3         
	//*  51   83:putfield        #79  <Field gm q>
	//*  52   86:aload_0         
	//*  53   87:getfield        #87  <Field jp t>
	//*  54   90:astore_3        
	//*  55   91:aload_3         
	//*  56   92:ifnull          106
	//*  57   95:aload_2         
	//*  58   96:aload_3         
	//*  59   97:invokevirtual   #131 <Method Object fy.clone()>
	//*  60  100:checkcast       #133 <Class jp>
	//*  61  103:putfield        #87  <Field jp t>
	//*  62  106:aload_0         
	//*  63  107:getfield        #95  <Field jq v>
	//*  64  110:astore_3        
	//*  65  111:aload_3         
	//*  66  112:ifnull          126
	//*  67  115:aload_2         
	//*  68  116:aload_3         
	//*  69  117:invokevirtual   #131 <Method Object fy.clone()>
	//*  70  120:checkcast       #135 <Class jq>
	//*  71  123:putfield        #95  <Field jq v>
	//*  72  126:aload_0         
	//*  73  127:getfield        #106 <Field int[] y>
	//*  74  130:astore_3        
	//*  75  131:aload_3         
	//*  76  132:ifnull          151
	//*  77  135:aload_3         
	//*  78  136:arraylength     
	//*  79  137:ifle            151
	//*  80  140:aload_2         
	//*  81  141:aload_3         
	//*  82  142:invokevirtual   #137 <Method Object _5B_I.clone()>
	//*  83  145:checkcast       #136 <Class int[]>
	//*  84  148:putfield        #106 <Field int[] y>
	//*  85  151:aload_0         
	//*  86  152:getfield        #110 <Field hy A>
	//*  87  155:astore_3        
	//*  88  156:aload_3         
	//*  89  157:ifnull          165
	//*  90  160:aload_2         
	//*  91  161:aload_3         
	//*  92  162:putfield        #110 <Field hy A>
	//*  93  165:aload_2         
	//*  94  166:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*  95  167:astore_2        
		{
			throw new AssertionError(((Object) (clonenotsupportedexception)));
	//   96  168:new             #139 <Class AssertionError>
	//   97  171:dup             
	//   98  172:aload_2         
	//   99  173:invokespecial   #142 <Method void AssertionError(Object)>
	//  100  176:athrow          
		}
		aobj = ((Object []) (o));
		if(aobj != null && aobj.length > 0)
		{
			js1.o = new jt[aobj.length];
			int i1 = 0;
			do
			{
				aobj = ((Object []) (o));
				if(i1 >= aobj.length)
					break;
				if(aobj[i1] != null)
					js1.o[i1] = (jt)((fy) (aobj[i1])).clone();
				i1++;
			} while(true);
		}
		obj = ((Object) (q));
		if(obj != null)
			js1.q = ((gm) (obj));
		obj = ((Object) (t));
		if(obj != null)
			js1.t = (jp)((fy) (obj)).clone();
		obj = ((Object) (v));
		if(obj != null)
			js1.v = (jq)((fy) (obj)).clone();
		obj = ((Object) (y));
		if(obj != null && obj.length > 0)
			js1.y = (int[])((int []) (obj)).clone();
		obj = ((Object) (A));
		if(obj != null)
			js1.A = ((hy) (obj));
		return js1;
	}

	protected final int a()
	{
		int i1 = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method int ft.a()>
	//    2    4:istore_1        
		long l2 = c;
	//    3    5:aload_0         
	//    4    6:getfield        #48  <Field long c>
	//    5    9:lstore          5
		int j1 = i1;
	//    6   11:iload_1         
	//    7   12:istore_2        
		if(l2 != 0L)
	//*   8   13:lload           5
	//*   9   15:lconst_0        
	//*  10   16:lcmp            
	//*  11   17:ifeq            29
			j1 = i1 + fr.b(1, l2);
	//   12   20:iload_1         
	//   13   21:iconst_1        
	//   14   22:lload           5
	//   15   24:invokestatic    #150 <Method int fr.b(int, long)>
	//   16   27:iadd            
	//   17   28:istore_2        
		Object obj = ((Object) (k));
	//   18   29:aload_0         
	//   19   30:getfield        #56  <Field String k>
	//   20   33:astore          7
		i1 = j1;
	//   21   35:iload_2         
	//   22   36:istore_1        
		if(obj != null)
	//*  23   37:aload           7
	//*  24   39:ifnull          65
		{
			i1 = j1;
	//   25   42:iload_2         
	//   26   43:istore_1        
			if(!((String) (obj)).equals(""))
	//*  27   44:aload           7
	//*  28   46:ldc1            #54  <String "">
	//*  29   48:invokevirtual   #156 <Method boolean String.equals(Object)>
	//*  30   51:ifne            65
				i1 = j1 + fr.b(2, k);
	//   31   54:iload_2         
	//   32   55:iconst_2        
	//   33   56:aload_0         
	//   34   57:getfield        #56  <Field String k>
	//   35   60:invokestatic    #159 <Method int fr.b(int, String)>
	//   36   63:iadd            
	//   37   64:istore_1        
		}
		Object aobj[] = ((Object []) (o));
	//   38   65:aload_0         
	//   39   66:getfield        #71  <Field jt[] o>
	//   40   69:astore          7
		boolean flag = false;
	//   41   71:iconst_0        
	//   42   72:istore          4
		j1 = i1;
	//   43   74:iload_1         
	//   44   75:istore_2        
		if(aobj != null)
	//*  45   76:aload           7
	//*  46   78:ifnull          137
		{
			j1 = i1;
	//   47   81:iload_1         
	//   48   82:istore_2        
			if(aobj.length > 0)
	//*  49   83:aload           7
	//*  50   85:arraylength     
	//*  51   86:ifle            137
			{
				j1 = 0;
	//   52   89:iconst_0        
	//   53   90:istore_2        
				do
				{
					aobj = ((Object []) (o));
	//   54   91:aload_0         
	//   55   92:getfield        #71  <Field jt[] o>
	//   56   95:astore          7
					if(j1 >= aobj.length)
						break;
	//   57   97:iload_2         
	//   58   98:aload           7
	//   59  100:arraylength     
	//   60  101:icmpge          135
					aobj = ((Object []) (aobj[j1]));
	//   61  104:aload           7
	//   62  106:iload_2         
	//   63  107:aaload          
	//   64  108:astore          7
					int k1 = i1;
	//   65  110:iload_1         
	//   66  111:istore_3        
					if(aobj != null)
	//*  67  112:aload           7
	//*  68  114:ifnull          126
						k1 = i1 + fr.b(3, ((fy) (aobj)));
	//   69  117:iload_1         
	//   70  118:iconst_3        
	//   71  119:aload           7
	//   72  121:invokestatic    #162 <Method int fr.b(int, fy)>
	//   73  124:iadd            
	//   74  125:istore_3        
					j1++;
	//   75  126:iload_2         
	//   76  127:iconst_1        
	//   77  128:iadd            
	//   78  129:istore_2        
					i1 = k1;
	//   79  130:iload_3         
	//   80  131:istore_1        
				} while(true);
	//   81  132:goto            91
				j1 = i1;
	//   82  135:iload_1         
	//   83  136:istore_2        
			}
		}
		i1 = j1;
	//   84  137:iload_2         
	//   85  138:istore_1        
		if(!Arrays.equals(p, gb.e))
	//*  86  139:aload_0         
	//*  87  140:getfield        #77  <Field byte[] p>
	//*  88  143:getstatic       #75  <Field byte[] gb.e>
	//*  89  146:invokestatic    #167 <Method boolean Arrays.equals(byte[], byte[])>
	//*  90  149:ifne            163
			i1 = j1 + fr.b(4, p);
	//   91  152:iload_2         
	//   92  153:iconst_4        
	//   93  154:aload_0         
	//   94  155:getfield        #77  <Field byte[] p>
	//   95  158:invokestatic    #170 <Method int fr.b(int, byte[])>
	//   96  161:iadd            
	//   97  162:istore_1        
		j1 = i1;
	//   98  163:iload_1         
	//   99  164:istore_2        
		if(!Arrays.equals(f, gb.e))
	//* 100  165:aload_0         
	//* 101  166:getfield        #81  <Field byte[] f>
	//* 102  169:getstatic       #75  <Field byte[] gb.e>
	//* 103  172:invokestatic    #167 <Method boolean Arrays.equals(byte[], byte[])>
	//* 104  175:ifne            190
			j1 = i1 + fr.b(6, f);
	//  105  178:iload_1         
	//  106  179:bipush          6
	//  107  181:aload_0         
	//  108  182:getfield        #81  <Field byte[] f>
	//  109  185:invokestatic    #170 <Method int fr.b(int, byte[])>
	//  110  188:iadd            
	//  111  189:istore_2        
		aobj = ((Object []) (t));
	//  112  190:aload_0         
	//  113  191:getfield        #87  <Field jp t>
	//  114  194:astore          7
		i1 = j1;
	//  115  196:iload_2         
	//  116  197:istore_1        
		if(aobj != null)
	//* 117  198:aload           7
	//* 118  200:ifnull          213
			i1 = j1 + fr.b(7, ((fy) (aobj)));
	//  119  203:iload_2         
	//  120  204:bipush          7
	//  121  206:aload           7
	//  122  208:invokestatic    #162 <Method int fr.b(int, fy)>
	//  123  211:iadd            
	//  124  212:istore_1        
		aobj = ((Object []) (r));
	//  125  213:aload_0         
	//  126  214:getfield        #83  <Field String r>
	//  127  217:astore          7
		j1 = i1;
	//  128  219:iload_1         
	//  129  220:istore_2        
		if(aobj != null)
	//* 130  221:aload           7
	//* 131  223:ifnull          250
		{
			j1 = i1;
	//  132  226:iload_1         
	//  133  227:istore_2        
			if(!((String) (aobj)).equals(""))
	//* 134  228:aload           7
	//* 135  230:ldc1            #54  <String "">
	//* 136  232:invokevirtual   #156 <Method boolean String.equals(Object)>
	//* 137  235:ifne            250
				j1 = i1 + fr.b(8, r);
	//  138  238:iload_1         
	//  139  239:bipush          8
	//  140  241:aload_0         
	//  141  242:getfield        #83  <Field String r>
	//  142  245:invokestatic    #159 <Method int fr.b(int, String)>
	//  143  248:iadd            
	//  144  249:istore_2        
		}
		aobj = ((Object []) (q));
	//  145  250:aload_0         
	//  146  251:getfield        #79  <Field gm q>
	//  147  254:astore          7
		i1 = j1;
	//  148  256:iload_2         
	//  149  257:istore_1        
		if(aobj != null)
	//* 150  258:aload           7
	//* 151  260:ifnull          273
			i1 = j1 + as.c(9, ((dh) (aobj)));
	//  152  263:iload_2         
	//  153  264:bipush          9
	//  154  266:aload           7
	//  155  268:invokestatic    #175 <Method int as.c(int, dh)>
	//  156  271:iadd            
	//  157  272:istore_1        
		int l1 = e;
	//  158  273:aload_0         
	//  159  274:getfield        #58  <Field int e>
	//  160  277:istore_3        
		j1 = i1;
	//  161  278:iload_1         
	//  162  279:istore_2        
		if(l1 != 0)
	//* 163  280:iload_3         
	//* 164  281:ifeq            297
			j1 = i1 + (fr.b(11) + fr.a(l1));
	//  165  284:iload_1         
	//  166  285:bipush          11
	//  167  287:invokestatic    #178 <Method int fr.b(int)>
	//  168  290:iload_3         
	//  169  291:invokestatic    #180 <Method int fr.a(int)>
	//  170  294:iadd            
	//  171  295:iadd            
	//  172  296:istore_2        
		aobj = ((Object []) (s));
	//  173  297:aload_0         
	//  174  298:getfield        #85  <Field String s>
	//  175  301:astore          7
		i1 = j1;
	//  176  303:iload_2         
	//  177  304:istore_1        
		if(aobj != null)
	//* 178  305:aload           7
	//* 179  307:ifnull          334
		{
			i1 = j1;
	//  180  310:iload_2         
	//  181  311:istore_1        
			if(!((String) (aobj)).equals(""))
	//* 182  312:aload           7
	//* 183  314:ldc1            #54  <String "">
	//* 184  316:invokevirtual   #156 <Method boolean String.equals(Object)>
	//* 185  319:ifne            334
				i1 = j1 + fr.b(13, s);
	//  186  322:iload_2         
	//  187  323:bipush          13
	//  188  325:aload_0         
	//  189  326:getfield        #85  <Field String s>
	//  190  329:invokestatic    #159 <Method int fr.b(int, String)>
	//  191  332:iadd            
	//  192  333:istore_1        
		}
		aobj = ((Object []) (u));
	//  193  334:aload_0         
	//  194  335:getfield        #89  <Field String u>
	//  195  338:astore          7
		j1 = i1;
	//  196  340:iload_1         
	//  197  341:istore_2        
		if(aobj != null)
	//* 198  342:aload           7
	//* 199  344:ifnull          371
		{
			j1 = i1;
	//  200  347:iload_1         
	//  201  348:istore_2        
			if(!((String) (aobj)).equals(""))
	//* 202  349:aload           7
	//* 203  351:ldc1            #54  <String "">
	//* 204  353:invokevirtual   #156 <Method boolean String.equals(Object)>
	//* 205  356:ifne            371
				j1 = i1 + fr.b(14, u);
	//  206  359:iload_1         
	//  207  360:bipush          14
	//  208  362:aload_0         
	//  209  363:getfield        #89  <Field String u>
	//  210  366:invokestatic    #159 <Method int fr.b(int, String)>
	//  211  369:iadd            
	//  212  370:istore_2        
		}
		l2 = g;
	//  213  371:aload_0         
	//  214  372:getfield        #93  <Field long g>
	//  215  375:lstore          5
		i1 = j1;
	//  216  377:iload_2         
	//  217  378:istore_1        
		if(l2 != 0x2bf20L)
	//* 218  379:lload           5
	//* 219  381:ldc2w           #90  <Long 0x2bf20L>
	//* 220  384:lcmp            
	//* 221  385:ifeq            405
			i1 = j1 + (fr.b(15) + fr.b(fr.c(l2)));
	//  222  388:iload_2         
	//  223  389:bipush          15
	//  224  391:invokestatic    #178 <Method int fr.b(int)>
	//  225  394:lload           5
	//  226  396:invokestatic    #183 <Method long fr.c(long)>
	//  227  399:invokestatic    #186 <Method int fr.b(long)>
	//  228  402:iadd            
	//  229  403:iadd            
	//  230  404:istore_1        
		aobj = ((Object []) (v));
	//  231  405:aload_0         
	//  232  406:getfield        #95  <Field jq v>
	//  233  409:astore          7
		j1 = i1;
	//  234  411:iload_1         
	//  235  412:istore_2        
		if(aobj != null)
	//* 236  413:aload           7
	//* 237  415:ifnull          428
			j1 = i1 + fr.b(16, ((fy) (aobj)));
	//  238  418:iload_1         
	//  239  419:bipush          16
	//  240  421:aload           7
	//  241  423:invokestatic    #162 <Method int fr.b(int, fy)>
	//  242  426:iadd            
	//  243  427:istore_2        
		l2 = d;
	//  244  428:aload_0         
	//  245  429:getfield        #50  <Field long d>
	//  246  432:lstore          5
		l1 = j1;
	//  247  434:iload_2         
	//  248  435:istore_3        
		if(l2 != 0L)
	//* 249  436:lload           5
	//* 250  438:lconst_0        
	//* 251  439:lcmp            
	//* 252  440:ifeq            453
			l1 = j1 + fr.b(17, l2);
	//  253  443:iload_2         
	//  254  444:bipush          17
	//  255  446:lload           5
	//  256  448:invokestatic    #150 <Method int fr.b(int, long)>
	//  257  451:iadd            
	//  258  452:istore_3        
		i1 = l1;
	//  259  453:iload_3         
	//  260  454:istore_1        
		if(!Arrays.equals(h, gb.e))
	//* 261  455:aload_0         
	//* 262  456:getfield        #97  <Field byte[] h>
	//* 263  459:getstatic       #75  <Field byte[] gb.e>
	//* 264  462:invokestatic    #167 <Method boolean Arrays.equals(byte[], byte[])>
	//* 265  465:ifne            480
			i1 = l1 + fr.b(18, h);
	//  266  468:iload_3         
	//  267  469:bipush          18
	//  268  471:aload_0         
	//  269  472:getfield        #97  <Field byte[] h>
	//  270  475:invokestatic    #170 <Method int fr.b(int, byte[])>
	//  271  478:iadd            
	//  272  479:istore_1        
		aobj = ((Object []) (y));
	//  273  480:aload_0         
	//  274  481:getfield        #106 <Field int[] y>
	//  275  484:astore          7
		j1 = i1;
	//  276  486:iload_1         
	//  277  487:istore_2        
		if(aobj != null)
	//* 278  488:aload           7
	//* 279  490:ifnull          546
		{
			j1 = i1;
	//  280  493:iload_1         
	//  281  494:istore_2        
			if(aobj.length > 0)
	//* 282  495:aload           7
	//* 283  497:arraylength     
	//* 284  498:ifle            546
			{
				int i2 = 0;
	//  285  501:iconst_0        
	//  286  502:istore_3        
				j1 = ((int) (flag));
	//  287  503:iload           4
	//  288  505:istore_2        
				int ai[];
				do
				{
					ai = y;
	//  289  506:aload_0         
	//  290  507:getfield        #106 <Field int[] y>
	//  291  510:astore          7
					if(j1 >= ai.length)
						break;
	//  292  512:iload_2         
	//  293  513:aload           7
	//  294  515:arraylength     
	//  295  516:icmpge          536
					i2 += fr.a(ai[j1]);
	//  296  519:iload_3         
	//  297  520:aload           7
	//  298  522:iload_2         
	//  299  523:iaload          
	//  300  524:invokestatic    #180 <Method int fr.a(int)>
	//  301  527:iadd            
	//  302  528:istore_3        
					j1++;
	//  303  529:iload_2         
	//  304  530:iconst_1        
	//  305  531:iadd            
	//  306  532:istore_2        
				} while(true);
	//  307  533:goto            506
				j1 = i1 + i2 + ai.length * 2;
	//  308  536:iload_1         
	//  309  537:iload_3         
	//  310  538:iadd            
	//  311  539:aload           7
	//  312  541:arraylength     
	//  313  542:iconst_2        
	//  314  543:imul            
	//  315  544:iadd            
	//  316  545:istore_2        
			}
		}
		ai = ((int []) (A));
	//  317  546:aload_0         
	//  318  547:getfield        #110 <Field hy A>
	//  319  550:astore          7
		i1 = j1;
	//  320  552:iload_2         
	//  321  553:istore_1        
		if(ai != null)
	//* 322  554:aload           7
	//* 323  556:ifnull          569
			i1 = j1 + as.c(23, ((dh) (ai)));
	//  324  559:iload_2         
	//  325  560:bipush          23
	//  326  562:aload           7
	//  327  564:invokestatic    #175 <Method int as.c(int, dh)>
	//  328  567:iadd            
	//  329  568:istore_1        
		ai = ((int []) (w));
	//  330  569:aload_0         
	//  331  570:getfield        #99  <Field String w>
	//  332  573:astore          7
		j1 = i1;
	//  333  575:iload_1         
	//  334  576:istore_2        
		if(ai != null)
	//* 335  577:aload           7
	//* 336  579:ifnull          606
		{
			j1 = i1;
	//  337  582:iload_1         
	//  338  583:istore_2        
			if(!((String) (ai)).equals(""))
	//* 339  584:aload           7
	//* 340  586:ldc1            #54  <String "">
	//* 341  588:invokevirtual   #156 <Method boolean String.equals(Object)>
	//* 342  591:ifne            606
				j1 = i1 + fr.b(24, w);
	//  343  594:iload_1         
	//  344  595:bipush          24
	//  345  597:aload_0         
	//  346  598:getfield        #99  <Field String w>
	//  347  601:invokestatic    #159 <Method int fr.b(int, String)>
	//  348  604:iadd            
	//  349  605:istore_2        
		}
		i1 = j1;
	//  350  606:iload_2         
	//  351  607:istore_1        
		if(i)
	//* 352  608:aload_0         
	//* 353  609:getfield        #112 <Field boolean i>
	//* 354  612:ifeq            625
			i1 = j1 + (fr.b(25) + 1);
	//  355  615:iload_2         
	//  356  616:bipush          25
	//  357  618:invokestatic    #178 <Method int fr.b(int)>
	//  358  621:iconst_1        
	//  359  622:iadd            
	//  360  623:iadd            
	//  361  624:istore_1        
		ai = ((int []) (l));
	//  362  625:aload_0         
	//  363  626:getfield        #60  <Field String l>
	//  364  629:astore          7
		j1 = i1;
	//  365  631:iload_1         
	//  366  632:istore_2        
		if(ai != null)
	//* 367  633:aload           7
	//* 368  635:ifnull          662
		{
			j1 = i1;
	//  369  638:iload_1         
	//  370  639:istore_2        
			if(!((String) (ai)).equals(""))
	//* 371  640:aload           7
	//* 372  642:ldc1            #54  <String "">
	//* 373  644:invokevirtual   #156 <Method boolean String.equals(Object)>
	//* 374  647:ifne            662
				j1 = i1 + fr.b(26, l);
	//  375  650:iload_1         
	//  376  651:bipush          26
	//  377  653:aload_0         
	//  378  654:getfield        #60  <Field String l>
	//  379  657:invokestatic    #159 <Method int fr.b(int, String)>
	//  380  660:iadd            
	//  381  661:istore_2        
		}
		return j1;
	//  382  662:iload_2         
	//  383  663:ireturn         
	}

	public final void a(fr fr1)
	{
		long l1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field long c>
	//    2    4:lstore          4
		if(l1 != 0L)
	//*   3    6:lload           4
	//*   4    8:lconst_0        
	//*   5    9:lcmp            
	//*   6   10:ifeq            20
			fr1.a(1, l1);
	//    7   13:aload_1         
	//    8   14:iconst_1        
	//    9   15:lload           4
	//   10   17:invokevirtual   #190 <Method void fr.a(int, long)>
		Object obj = ((Object) (k));
	//   11   20:aload_0         
	//   12   21:getfield        #56  <Field String k>
	//   13   24:astore          7
		if(obj != null && !((String) (obj)).equals(""))
	//*  14   26:aload           7
	//*  15   28:ifnull          50
	//*  16   31:aload           7
	//*  17   33:ldc1            #54  <String "">
	//*  18   35:invokevirtual   #156 <Method boolean String.equals(Object)>
	//*  19   38:ifne            50
			fr1.a(2, k);
	//   20   41:aload_1         
	//   21   42:iconst_2        
	//   22   43:aload_0         
	//   23   44:getfield        #56  <Field String k>
	//   24   47:invokevirtual   #193 <Method void fr.a(int, String)>
		Object aobj[] = ((Object []) (o));
	//   25   50:aload_0         
	//   26   51:getfield        #71  <Field jt[] o>
	//   27   54:astore          7
		boolean flag = false;
	//   28   56:iconst_0        
	//   29   57:istore_3        
		if(aobj != null && aobj.length > 0)
	//*  30   58:aload           7
	//*  31   60:ifnull          109
	//*  32   63:aload           7
	//*  33   65:arraylength     
	//*  34   66:ifle            109
		{
			int i1 = 0;
	//   35   69:iconst_0        
	//   36   70:istore_2        
			do
			{
				aobj = ((Object []) (o));
	//   37   71:aload_0         
	//   38   72:getfield        #71  <Field jt[] o>
	//   39   75:astore          7
				if(i1 >= aobj.length)
					break;
	//   40   77:iload_2         
	//   41   78:aload           7
	//   42   80:arraylength     
	//   43   81:icmpge          109
				aobj = ((Object []) (aobj[i1]));
	//   44   84:aload           7
	//   45   86:iload_2         
	//   46   87:aaload          
	//   47   88:astore          7
				if(aobj != null)
	//*  48   90:aload           7
	//*  49   92:ifnull          102
					fr1.a(3, ((fy) (aobj)));
	//   50   95:aload_1         
	//   51   96:iconst_3        
	//   52   97:aload           7
	//   53   99:invokevirtual   #196 <Method void fr.a(int, fy)>
				i1++;
	//   54  102:iload_2         
	//   55  103:iconst_1        
	//   56  104:iadd            
	//   57  105:istore_2        
			} while(true);
	//   58  106:goto            71
		}
		if(!Arrays.equals(p, gb.e))
	//*  59  109:aload_0         
	//*  60  110:getfield        #77  <Field byte[] p>
	//*  61  113:getstatic       #75  <Field byte[] gb.e>
	//*  62  116:invokestatic    #167 <Method boolean Arrays.equals(byte[], byte[])>
	//*  63  119:ifne            131
			fr1.a(4, p);
	//   64  122:aload_1         
	//   65  123:iconst_4        
	//   66  124:aload_0         
	//   67  125:getfield        #77  <Field byte[] p>
	//   68  128:invokevirtual   #199 <Method void fr.a(int, byte[])>
		if(!Arrays.equals(f, gb.e))
	//*  69  131:aload_0         
	//*  70  132:getfield        #81  <Field byte[] f>
	//*  71  135:getstatic       #75  <Field byte[] gb.e>
	//*  72  138:invokestatic    #167 <Method boolean Arrays.equals(byte[], byte[])>
	//*  73  141:ifne            154
			fr1.a(6, f);
	//   74  144:aload_1         
	//   75  145:bipush          6
	//   76  147:aload_0         
	//   77  148:getfield        #81  <Field byte[] f>
	//   78  151:invokevirtual   #199 <Method void fr.a(int, byte[])>
		aobj = ((Object []) (t));
	//   79  154:aload_0         
	//   80  155:getfield        #87  <Field jp t>
	//   81  158:astore          7
		if(aobj != null)
	//*  82  160:aload           7
	//*  83  162:ifnull          173
			fr1.a(7, ((fy) (aobj)));
	//   84  165:aload_1         
	//   85  166:bipush          7
	//   86  168:aload           7
	//   87  170:invokevirtual   #196 <Method void fr.a(int, fy)>
		aobj = ((Object []) (r));
	//   88  173:aload_0         
	//   89  174:getfield        #83  <Field String r>
	//   90  177:astore          7
		if(aobj != null && !((String) (aobj)).equals(""))
	//*  91  179:aload           7
	//*  92  181:ifnull          204
	//*  93  184:aload           7
	//*  94  186:ldc1            #54  <String "">
	//*  95  188:invokevirtual   #156 <Method boolean String.equals(Object)>
	//*  96  191:ifne            204
			fr1.a(8, r);
	//   97  194:aload_1         
	//   98  195:bipush          8
	//   99  197:aload_0         
	//  100  198:getfield        #83  <Field String r>
	//  101  201:invokevirtual   #193 <Method void fr.a(int, String)>
		aobj = ((Object []) (q));
	//  102  204:aload_0         
	//  103  205:getfield        #79  <Field gm q>
	//  104  208:astore          7
		if(aobj != null)
	//* 105  210:aload           7
	//* 106  212:ifnull          223
			fr1.a(9, ((dh) (aobj)));
	//  107  215:aload_1         
	//  108  216:bipush          9
	//  109  218:aload           7
	//  110  220:invokevirtual   #202 <Method void fr.a(int, dh)>
		int j1 = e;
	//  111  223:aload_0         
	//  112  224:getfield        #58  <Field int e>
	//  113  227:istore_2        
		if(j1 != 0)
	//* 114  228:iload_2         
	//* 115  229:ifeq            239
			fr1.a(11, j1);
	//  116  232:aload_1         
	//  117  233:bipush          11
	//  118  235:iload_2         
	//  119  236:invokevirtual   #205 <Method void fr.a(int, int)>
		aobj = ((Object []) (s));
	//  120  239:aload_0         
	//  121  240:getfield        #85  <Field String s>
	//  122  243:astore          7
		if(aobj != null && !((String) (aobj)).equals(""))
	//* 123  245:aload           7
	//* 124  247:ifnull          270
	//* 125  250:aload           7
	//* 126  252:ldc1            #54  <String "">
	//* 127  254:invokevirtual   #156 <Method boolean String.equals(Object)>
	//* 128  257:ifne            270
			fr1.a(13, s);
	//  129  260:aload_1         
	//  130  261:bipush          13
	//  131  263:aload_0         
	//  132  264:getfield        #85  <Field String s>
	//  133  267:invokevirtual   #193 <Method void fr.a(int, String)>
		aobj = ((Object []) (u));
	//  134  270:aload_0         
	//  135  271:getfield        #89  <Field String u>
	//  136  274:astore          7
		if(aobj != null && !((String) (aobj)).equals(""))
	//* 137  276:aload           7
	//* 138  278:ifnull          301
	//* 139  281:aload           7
	//* 140  283:ldc1            #54  <String "">
	//* 141  285:invokevirtual   #156 <Method boolean String.equals(Object)>
	//* 142  288:ifne            301
			fr1.a(14, u);
	//  143  291:aload_1         
	//  144  292:bipush          14
	//  145  294:aload_0         
	//  146  295:getfield        #89  <Field String u>
	//  147  298:invokevirtual   #193 <Method void fr.a(int, String)>
		l1 = g;
	//  148  301:aload_0         
	//  149  302:getfield        #93  <Field long g>
	//  150  305:lstore          4
		if(l1 != 0x2bf20L)
	//* 151  307:lload           4
	//* 152  309:ldc2w           #90  <Long 0x2bf20L>
	//* 153  312:lcmp            
	//* 154  313:ifeq            332
		{
			fr1.b(15, 0);
	//  155  316:aload_1         
	//  156  317:bipush          15
	//  157  319:iconst_0        
	//  158  320:invokevirtual   #207 <Method void fr.b(int, int)>
			fr1.a(fr.c(l1));
	//  159  323:aload_1         
	//  160  324:lload           4
	//  161  326:invokestatic    #183 <Method long fr.c(long)>
	//  162  329:invokevirtual   #210 <Method void fr.a(long)>
		}
		aobj = ((Object []) (v));
	//  163  332:aload_0         
	//  164  333:getfield        #95  <Field jq v>
	//  165  336:astore          7
		if(aobj != null)
	//* 166  338:aload           7
	//* 167  340:ifnull          351
			fr1.a(16, ((fy) (aobj)));
	//  168  343:aload_1         
	//  169  344:bipush          16
	//  170  346:aload           7
	//  171  348:invokevirtual   #196 <Method void fr.a(int, fy)>
		l1 = d;
	//  172  351:aload_0         
	//  173  352:getfield        #50  <Field long d>
	//  174  355:lstore          4
		if(l1 != 0L)
	//* 175  357:lload           4
	//* 176  359:lconst_0        
	//* 177  360:lcmp            
	//* 178  361:ifeq            372
			fr1.a(17, l1);
	//  179  364:aload_1         
	//  180  365:bipush          17
	//  181  367:lload           4
	//  182  369:invokevirtual   #190 <Method void fr.a(int, long)>
		if(!Arrays.equals(h, gb.e))
	//* 183  372:aload_0         
	//* 184  373:getfield        #97  <Field byte[] h>
	//* 185  376:getstatic       #75  <Field byte[] gb.e>
	//* 186  379:invokestatic    #167 <Method boolean Arrays.equals(byte[], byte[])>
	//* 187  382:ifne            395
			fr1.a(18, h);
	//  188  385:aload_1         
	//  189  386:bipush          18
	//  190  388:aload_0         
	//  191  389:getfield        #97  <Field byte[] h>
	//  192  392:invokevirtual   #199 <Method void fr.a(int, byte[])>
		aobj = ((Object []) (y));
	//  193  395:aload_0         
	//  194  396:getfield        #106 <Field int[] y>
	//  195  399:astore          7
		if(aobj != null && aobj.length > 0)
	//* 196  401:aload           7
	//* 197  403:ifnull          444
	//* 198  406:aload           7
	//* 199  408:arraylength     
	//* 200  409:ifle            444
		{
			int k1 = ((int) (flag));
	//  201  412:iload_3         
	//  202  413:istore_2        
			do
			{
				int ai[] = y;
	//  203  414:aload_0         
	//  204  415:getfield        #106 <Field int[] y>
	//  205  418:astore          7
				if(k1 >= ai.length)
					break;
	//  206  420:iload_2         
	//  207  421:aload           7
	//  208  423:arraylength     
	//  209  424:icmpge          444
				fr1.a(20, ai[k1]);
	//  210  427:aload_1         
	//  211  428:bipush          20
	//  212  430:aload           7
	//  213  432:iload_2         
	//  214  433:iaload          
	//  215  434:invokevirtual   #205 <Method void fr.a(int, int)>
				k1++;
	//  216  437:iload_2         
	//  217  438:iconst_1        
	//  218  439:iadd            
	//  219  440:istore_2        
			} while(true);
	//  220  441:goto            414
		}
		ai = ((int []) (A));
	//  221  444:aload_0         
	//  222  445:getfield        #110 <Field hy A>
	//  223  448:astore          7
		if(ai != null)
	//* 224  450:aload           7
	//* 225  452:ifnull          463
			fr1.a(23, ((dh) (ai)));
	//  226  455:aload_1         
	//  227  456:bipush          23
	//  228  458:aload           7
	//  229  460:invokevirtual   #202 <Method void fr.a(int, dh)>
		ai = ((int []) (w));
	//  230  463:aload_0         
	//  231  464:getfield        #99  <Field String w>
	//  232  467:astore          7
		if(ai != null && !((String) (ai)).equals(""))
	//* 233  469:aload           7
	//* 234  471:ifnull          494
	//* 235  474:aload           7
	//* 236  476:ldc1            #54  <String "">
	//* 237  478:invokevirtual   #156 <Method boolean String.equals(Object)>
	//* 238  481:ifne            494
			fr1.a(24, w);
	//  239  484:aload_1         
	//  240  485:bipush          24
	//  241  487:aload_0         
	//  242  488:getfield        #99  <Field String w>
	//  243  491:invokevirtual   #193 <Method void fr.a(int, String)>
		boolean flag1 = i;
	//  244  494:aload_0         
	//  245  495:getfield        #112 <Field boolean i>
	//  246  498:istore          6
		if(flag1)
	//* 247  500:iload           6
	//* 248  502:ifeq            513
			fr1.a(25, flag1);
	//  249  505:aload_1         
	//  250  506:bipush          25
	//  251  508:iload           6
	//  252  510:invokevirtual   #213 <Method void fr.a(int, boolean)>
		ai = ((int []) (l));
	//  253  513:aload_0         
	//  254  514:getfield        #60  <Field String l>
	//  255  517:astore          7
		if(ai != null && !((String) (ai)).equals(""))
	//* 256  519:aload           7
	//* 257  521:ifnull          544
	//* 258  524:aload           7
	//* 259  526:ldc1            #54  <String "">
	//* 260  528:invokevirtual   #156 <Method boolean String.equals(Object)>
	//* 261  531:ifne            544
			fr1.a(26, l);
	//  262  534:aload_1         
	//  263  535:bipush          26
	//  264  537:aload_0         
	//  265  538:getfield        #60  <Field String l>
	//  266  541:invokevirtual   #193 <Method void fr.a(int, String)>
		super.a(fr1);
	//  267  544:aload_0         
	//  268  545:aload_1         
	//  269  546:invokespecial   #215 <Method void ft.a(fr)>
	//  270  549:return          
	}

	public final ft b()
	{
		return ((ft) ((js)((fy)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #131 <Method Object fy.clone()>
	//    2    4:checkcast       #2   <Class js>
	//    3    7:areturn         
	}

	public final fy c()
	{
		return ((fy) ((js)((fy)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #131 <Method Object fy.clone()>
	//    2    4:checkcast       #2   <Class js>
	//    3    7:areturn         
	}

	public final Object clone()
	{
		return ((Object) (e()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #218 <Method js e()>
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
		if(!(obj instanceof js))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class js>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((js)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class js>
	//   12   20:astore_1        
		if(c != ((js) (obj)).c)
	//*  13   21:aload_0         
	//*  14   22:getfield        #48  <Field long c>
	//*  15   25:aload_1         
	//*  16   26:getfield        #48  <Field long c>
	//*  17   29:lcmp            
	//*  18   30:ifeq            35
			return false;
	//   19   33:iconst_0        
	//   20   34:ireturn         
		if(d != ((js) (obj)).d)
	//*  21   35:aload_0         
	//*  22   36:getfield        #50  <Field long d>
	//*  23   39:aload_1         
	//*  24   40:getfield        #50  <Field long d>
	//*  25   43:lcmp            
	//*  26   44:ifeq            49
			return false;
	//   27   47:iconst_0        
	//   28   48:ireturn         
		Object obj1 = ((Object) (k));
	//   29   49:aload_0         
	//   30   50:getfield        #56  <Field String k>
	//   31   53:astore_2        
		if(obj1 == null)
	//*  32   54:aload_2         
	//*  33   55:ifnonnull       67
		{
			if(((js) (obj)).k != null)
	//*  34   58:aload_1         
	//*  35   59:getfield        #56  <Field String k>
	//*  36   62:ifnull          80
				return false;
	//   37   65:iconst_0        
	//   38   66:ireturn         
		} else
		if(!((String) (obj1)).equals(((Object) (((js) (obj)).k))))
	//*  39   67:aload_2         
	//*  40   68:aload_1         
	//*  41   69:getfield        #56  <Field String k>
	//*  42   72:invokevirtual   #156 <Method boolean String.equals(Object)>
	//*  43   75:ifne            80
			return false;
	//   44   78:iconst_0        
	//   45   79:ireturn         
		if(e != ((js) (obj)).e)
	//*  46   80:aload_0         
	//*  47   81:getfield        #58  <Field int e>
	//*  48   84:aload_1         
	//*  49   85:getfield        #58  <Field int e>
	//*  50   88:icmpeq          93
			return false;
	//   51   91:iconst_0        
	//   52   92:ireturn         
		obj1 = ((Object) (l));
	//   53   93:aload_0         
	//   54   94:getfield        #60  <Field String l>
	//   55   97:astore_2        
		if(obj1 == null)
	//*  56   98:aload_2         
	//*  57   99:ifnonnull       111
		{
			if(((js) (obj)).l != null)
	//*  58  102:aload_1         
	//*  59  103:getfield        #60  <Field String l>
	//*  60  106:ifnull          124
				return false;
	//   61  109:iconst_0        
	//   62  110:ireturn         
		} else
		if(!((String) (obj1)).equals(((Object) (((js) (obj)).l))))
	//*  63  111:aload_2         
	//*  64  112:aload_1         
	//*  65  113:getfield        #60  <Field String l>
	//*  66  116:invokevirtual   #156 <Method boolean String.equals(Object)>
	//*  67  119:ifne            124
			return false;
	//   68  122:iconst_0        
	//   69  123:ireturn         
		if(!fx.a(((Object []) (o)), ((Object []) (((js) (obj)).o))))
	//*  70  124:aload_0         
	//*  71  125:getfield        #71  <Field jt[] o>
	//*  72  128:aload_1         
	//*  73  129:getfield        #71  <Field jt[] o>
	//*  74  132:invokestatic    #223 <Method boolean fx.a(Object[], Object[])>
	//*  75  135:ifne            140
			return false;
	//   76  138:iconst_0        
	//   77  139:ireturn         
		if(!Arrays.equals(p, ((js) (obj)).p))
	//*  78  140:aload_0         
	//*  79  141:getfield        #77  <Field byte[] p>
	//*  80  144:aload_1         
	//*  81  145:getfield        #77  <Field byte[] p>
	//*  82  148:invokestatic    #167 <Method boolean Arrays.equals(byte[], byte[])>
	//*  83  151:ifne            156
			return false;
	//   84  154:iconst_0        
	//   85  155:ireturn         
		obj1 = ((Object) (q));
	//   86  156:aload_0         
	//   87  157:getfield        #79  <Field gm q>
	//   88  160:astore_2        
		if(obj1 == null)
	//*  89  161:aload_2         
	//*  90  162:ifnonnull       174
		{
			if(((js) (obj)).q != null)
	//*  91  165:aload_1         
	//*  92  166:getfield        #79  <Field gm q>
	//*  93  169:ifnull          187
				return false;
	//   94  172:iconst_0        
	//   95  173:ireturn         
		} else
		if(!((br) (obj1)).equals(((Object) (((js) (obj)).q))))
	//*  96  174:aload_2         
	//*  97  175:aload_1         
	//*  98  176:getfield        #79  <Field gm q>
	//*  99  179:invokevirtual   #226 <Method boolean br.equals(Object)>
	//* 100  182:ifne            187
			return false;
	//  101  185:iconst_0        
	//  102  186:ireturn         
		if(!Arrays.equals(f, ((js) (obj)).f))
	//* 103  187:aload_0         
	//* 104  188:getfield        #81  <Field byte[] f>
	//* 105  191:aload_1         
	//* 106  192:getfield        #81  <Field byte[] f>
	//* 107  195:invokestatic    #167 <Method boolean Arrays.equals(byte[], byte[])>
	//* 108  198:ifne            203
			return false;
	//  109  201:iconst_0        
	//  110  202:ireturn         
		obj1 = ((Object) (r));
	//  111  203:aload_0         
	//  112  204:getfield        #83  <Field String r>
	//  113  207:astore_2        
		if(obj1 == null)
	//* 114  208:aload_2         
	//* 115  209:ifnonnull       221
		{
			if(((js) (obj)).r != null)
	//* 116  212:aload_1         
	//* 117  213:getfield        #83  <Field String r>
	//* 118  216:ifnull          234
				return false;
	//  119  219:iconst_0        
	//  120  220:ireturn         
		} else
		if(!((String) (obj1)).equals(((Object) (((js) (obj)).r))))
	//* 121  221:aload_2         
	//* 122  222:aload_1         
	//* 123  223:getfield        #83  <Field String r>
	//* 124  226:invokevirtual   #156 <Method boolean String.equals(Object)>
	//* 125  229:ifne            234
			return false;
	//  126  232:iconst_0        
	//  127  233:ireturn         
		obj1 = ((Object) (s));
	//  128  234:aload_0         
	//  129  235:getfield        #85  <Field String s>
	//  130  238:astore_2        
		if(obj1 == null)
	//* 131  239:aload_2         
	//* 132  240:ifnonnull       252
		{
			if(((js) (obj)).s != null)
	//* 133  243:aload_1         
	//* 134  244:getfield        #85  <Field String s>
	//* 135  247:ifnull          265
				return false;
	//  136  250:iconst_0        
	//  137  251:ireturn         
		} else
		if(!((String) (obj1)).equals(((Object) (((js) (obj)).s))))
	//* 138  252:aload_2         
	//* 139  253:aload_1         
	//* 140  254:getfield        #85  <Field String s>
	//* 141  257:invokevirtual   #156 <Method boolean String.equals(Object)>
	//* 142  260:ifne            265
			return false;
	//  143  263:iconst_0        
	//  144  264:ireturn         
		obj1 = ((Object) (t));
	//  145  265:aload_0         
	//  146  266:getfield        #87  <Field jp t>
	//  147  269:astore_2        
		if(obj1 == null)
	//* 148  270:aload_2         
	//* 149  271:ifnonnull       283
		{
			if(((js) (obj)).t != null)
	//* 150  274:aload_1         
	//* 151  275:getfield        #87  <Field jp t>
	//* 152  278:ifnull          296
				return false;
	//  153  281:iconst_0        
	//  154  282:ireturn         
		} else
		if(!((jp) (obj1)).equals(((Object) (((js) (obj)).t))))
	//* 155  283:aload_2         
	//* 156  284:aload_1         
	//* 157  285:getfield        #87  <Field jp t>
	//* 158  288:invokevirtual   #227 <Method boolean jp.equals(Object)>
	//* 159  291:ifne            296
			return false;
	//  160  294:iconst_0        
	//  161  295:ireturn         
		obj1 = ((Object) (u));
	//  162  296:aload_0         
	//  163  297:getfield        #89  <Field String u>
	//  164  300:astore_2        
		if(obj1 == null)
	//* 165  301:aload_2         
	//* 166  302:ifnonnull       314
		{
			if(((js) (obj)).u != null)
	//* 167  305:aload_1         
	//* 168  306:getfield        #89  <Field String u>
	//* 169  309:ifnull          327
				return false;
	//  170  312:iconst_0        
	//  171  313:ireturn         
		} else
		if(!((String) (obj1)).equals(((Object) (((js) (obj)).u))))
	//* 172  314:aload_2         
	//* 173  315:aload_1         
	//* 174  316:getfield        #89  <Field String u>
	//* 175  319:invokevirtual   #156 <Method boolean String.equals(Object)>
	//* 176  322:ifne            327
			return false;
	//  177  325:iconst_0        
	//  178  326:ireturn         
		if(g != ((js) (obj)).g)
	//* 179  327:aload_0         
	//* 180  328:getfield        #93  <Field long g>
	//* 181  331:aload_1         
	//* 182  332:getfield        #93  <Field long g>
	//* 183  335:lcmp            
	//* 184  336:ifeq            341
			return false;
	//  185  339:iconst_0        
	//  186  340:ireturn         
		obj1 = ((Object) (v));
	//  187  341:aload_0         
	//  188  342:getfield        #95  <Field jq v>
	//  189  345:astore_2        
		if(obj1 == null)
	//* 190  346:aload_2         
	//* 191  347:ifnonnull       359
		{
			if(((js) (obj)).v != null)
	//* 192  350:aload_1         
	//* 193  351:getfield        #95  <Field jq v>
	//* 194  354:ifnull          372
				return false;
	//  195  357:iconst_0        
	//  196  358:ireturn         
		} else
		if(!((jq) (obj1)).equals(((Object) (((js) (obj)).v))))
	//* 197  359:aload_2         
	//* 198  360:aload_1         
	//* 199  361:getfield        #95  <Field jq v>
	//* 200  364:invokevirtual   #228 <Method boolean jq.equals(Object)>
	//* 201  367:ifne            372
			return false;
	//  202  370:iconst_0        
	//  203  371:ireturn         
		if(!Arrays.equals(h, ((js) (obj)).h))
	//* 204  372:aload_0         
	//* 205  373:getfield        #97  <Field byte[] h>
	//* 206  376:aload_1         
	//* 207  377:getfield        #97  <Field byte[] h>
	//* 208  380:invokestatic    #167 <Method boolean Arrays.equals(byte[], byte[])>
	//* 209  383:ifne            388
			return false;
	//  210  386:iconst_0        
	//  211  387:ireturn         
		obj1 = ((Object) (w));
	//  212  388:aload_0         
	//  213  389:getfield        #99  <Field String w>
	//  214  392:astore_2        
		if(obj1 == null)
	//* 215  393:aload_2         
	//* 216  394:ifnonnull       406
		{
			if(((js) (obj)).w != null)
	//* 217  397:aload_1         
	//* 218  398:getfield        #99  <Field String w>
	//* 219  401:ifnull          419
				return false;
	//  220  404:iconst_0        
	//  221  405:ireturn         
		} else
		if(!((String) (obj1)).equals(((Object) (((js) (obj)).w))))
	//* 222  406:aload_2         
	//* 223  407:aload_1         
	//* 224  408:getfield        #99  <Field String w>
	//* 225  411:invokevirtual   #156 <Method boolean String.equals(Object)>
	//* 226  414:ifne            419
			return false;
	//  227  417:iconst_0        
	//  228  418:ireturn         
		if(!fx.a(y, ((js) (obj)).y))
	//* 229  419:aload_0         
	//* 230  420:getfield        #106 <Field int[] y>
	//* 231  423:aload_1         
	//* 232  424:getfield        #106 <Field int[] y>
	//* 233  427:invokestatic    #231 <Method boolean fx.a(int[], int[])>
	//* 234  430:ifne            435
			return false;
	//  235  433:iconst_0        
	//  236  434:ireturn         
		obj1 = ((Object) (A));
	//  237  435:aload_0         
	//  238  436:getfield        #110 <Field hy A>
	//  239  439:astore_2        
		if(obj1 == null)
	//* 240  440:aload_2         
	//* 241  441:ifnonnull       453
		{
			if(((js) (obj)).A != null)
	//* 242  444:aload_1         
	//* 243  445:getfield        #110 <Field hy A>
	//* 244  448:ifnull          466
				return false;
	//  245  451:iconst_0        
	//  246  452:ireturn         
		} else
		if(!((br) (obj1)).equals(((Object) (((js) (obj)).A))))
	//* 247  453:aload_2         
	//* 248  454:aload_1         
	//* 249  455:getfield        #110 <Field hy A>
	//* 250  458:invokevirtual   #226 <Method boolean br.equals(Object)>
	//* 251  461:ifne            466
			return false;
	//  252  464:iconst_0        
	//  253  465:ireturn         
		if(i != ((js) (obj)).i)
	//* 254  466:aload_0         
	//* 255  467:getfield        #112 <Field boolean i>
	//* 256  470:aload_1         
	//* 257  471:getfield        #112 <Field boolean i>
	//* 258  474:icmpeq          479
			return false;
	//  259  477:iconst_0        
	//  260  478:ireturn         
		if(a != null && !a.b())
	//* 261  479:aload_0         
	//* 262  480:getfield        #115 <Field fv a>
	//* 263  483:ifnull          511
	//* 264  486:aload_0         
	//* 265  487:getfield        #115 <Field fv a>
	//* 266  490:invokevirtual   #236 <Method boolean fv.b()>
	//* 267  493:ifeq            499
	//* 268  496:goto            511
			return a.equals(((Object) (((js) (obj)).a)));
	//  269  499:aload_0         
	//  270  500:getfield        #115 <Field fv a>
	//  271  503:aload_1         
	//  272  504:getfield        #115 <Field fv a>
	//  273  507:invokevirtual   #237 <Method boolean fv.equals(Object)>
	//  274  510:ireturn         
		if(((js) (obj)).a != null)
	//* 275  511:aload_1         
	//* 276  512:getfield        #115 <Field fv a>
	//* 277  515:ifnull          532
			return ((js) (obj)).a.b();
	//  278  518:aload_1         
	//  279  519:getfield        #115 <Field fv a>
	//  280  522:invokevirtual   #236 <Method boolean fv.b()>
	//  281  525:ifeq            530
	//  282  528:iconst_1        
	//  283  529:ireturn         
	//  284  530:iconst_0        
	//  285  531:ireturn         
		else
			return true;
	//  286  532:iconst_1        
	//  287  533:ireturn         
	}

	public final int hashCode()
	{
		int l3 = ((Object)this).getClass().getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #244 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #250 <Method String Class.getName()>
	//    3    7:invokevirtual   #252 <Method int String.hashCode()>
	//    4   10:istore          14
		long l6 = c;
	//    5   12:aload_0         
	//    6   13:getfield        #48  <Field long c>
	//    7   16:lstore          24
		int i4 = (int)(l6 ^ l6 >>> 32);
	//    8   18:lload           24
	//    9   20:lload           24
	//   10   22:bipush          32
	//   11   24:lushr           
	//   12   25:lxor            
	//   13   26:l2i             
	//   14   27:istore          15
		l6 = d;
	//   15   29:aload_0         
	//   16   30:getfield        #50  <Field long d>
	//   17   33:lstore          24
		int j4 = (int)(l6 ^ l6 >>> 32);
	//   18   35:lload           24
	//   19   37:lload           24
	//   20   39:bipush          32
	//   21   41:lushr           
	//   22   42:lxor            
	//   23   43:l2i             
	//   24   44:istore          16
		Object obj = ((Object) (k));
	//   25   46:aload_0         
	//   26   47:getfield        #56  <Field String k>
	//   27   50:astore          26
		boolean flag = false;
	//   28   52:iconst_0        
	//   29   53:istore          13
		int i1;
		if(obj == null)
	//*  30   55:aload           26
	//*  31   57:ifnonnull       65
			i1 = 0;
	//   32   60:iconst_0        
	//   33   61:istore_1        
		else
	//*  34   62:goto            71
			i1 = ((String) (obj)).hashCode();
	//   35   65:aload           26
	//   36   67:invokevirtual   #252 <Method int String.hashCode()>
	//   37   70:istore_1        
		int k4 = e;
	//   38   71:aload_0         
	//   39   72:getfield        #58  <Field int e>
	//   40   75:istore          17
		obj = ((Object) (l));
	//   41   77:aload_0         
	//   42   78:getfield        #60  <Field String l>
	//   43   81:astore          26
		int j1;
		if(obj == null)
	//*  44   83:aload           26
	//*  45   85:ifnonnull       93
			j1 = 0;
	//   46   88:iconst_0        
	//   47   89:istore_2        
		else
	//*  48   90:goto            99
			j1 = ((String) (obj)).hashCode();
	//   49   93:aload           26
	//   50   95:invokevirtual   #252 <Method int String.hashCode()>
	//   51   98:istore_2        
		char c1 = '\u04D5';
	//   52   99:sipush          1237
	//   53  102:istore          11
		int l4 = fx.a(((Object []) (o)));
	//   54  104:aload_0         
	//   55  105:getfield        #71  <Field jt[] o>
	//   56  108:invokestatic    #255 <Method int fx.a(Object[])>
	//   57  111:istore          18
		int i5 = Arrays.hashCode(p);
	//   58  113:aload_0         
	//   59  114:getfield        #77  <Field byte[] p>
	//   60  117:invokestatic    #258 <Method int Arrays.hashCode(byte[])>
	//   61  120:istore          19
		obj = ((Object) (q));
	//   62  122:aload_0         
	//   63  123:getfield        #79  <Field gm q>
	//   64  126:astore          26
		int k1;
		if(obj == null)
	//*  65  128:aload           26
	//*  66  130:ifnonnull       138
			k1 = 0;
	//   67  133:iconst_0        
	//   68  134:istore_3        
		else
	//*  69  135:goto            144
			k1 = ((br) (obj)).hashCode();
	//   70  138:aload           26
	//   71  140:invokevirtual   #259 <Method int br.hashCode()>
	//   72  143:istore_3        
		int j5 = Arrays.hashCode(f);
	//   73  144:aload_0         
	//   74  145:getfield        #81  <Field byte[] f>
	//   75  148:invokestatic    #258 <Method int Arrays.hashCode(byte[])>
	//   76  151:istore          20
		obj = ((Object) (r));
	//   77  153:aload_0         
	//   78  154:getfield        #83  <Field String r>
	//   79  157:astore          26
		int l1;
		if(obj == null)
	//*  80  159:aload           26
	//*  81  161:ifnonnull       170
			l1 = 0;
	//   82  164:iconst_0        
	//   83  165:istore          4
		else
	//*  84  167:goto            177
			l1 = ((String) (obj)).hashCode();
	//   85  170:aload           26
	//   86  172:invokevirtual   #252 <Method int String.hashCode()>
	//   87  175:istore          4
		obj = ((Object) (s));
	//   88  177:aload_0         
	//   89  178:getfield        #85  <Field String s>
	//   90  181:astore          26
		int i2;
		if(obj == null)
	//*  91  183:aload           26
	//*  92  185:ifnonnull       194
			i2 = 0;
	//   93  188:iconst_0        
	//   94  189:istore          5
		else
	//*  95  191:goto            201
			i2 = ((String) (obj)).hashCode();
	//   96  194:aload           26
	//   97  196:invokevirtual   #252 <Method int String.hashCode()>
	//   98  199:istore          5
		obj = ((Object) (t));
	//   99  201:aload_0         
	//  100  202:getfield        #87  <Field jp t>
	//  101  205:astore          26
		int j2;
		if(obj == null)
	//* 102  207:aload           26
	//* 103  209:ifnonnull       218
			j2 = 0;
	//  104  212:iconst_0        
	//  105  213:istore          6
		else
	//* 106  215:goto            225
			j2 = ((jp) (obj)).hashCode();
	//  107  218:aload           26
	//  108  220:invokevirtual   #260 <Method int jp.hashCode()>
	//  109  223:istore          6
		obj = ((Object) (u));
	//  110  225:aload_0         
	//  111  226:getfield        #89  <Field String u>
	//  112  229:astore          26
		int k2;
		if(obj == null)
	//* 113  231:aload           26
	//* 114  233:ifnonnull       242
			k2 = 0;
	//  115  236:iconst_0        
	//  116  237:istore          7
		else
	//* 117  239:goto            249
			k2 = ((String) (obj)).hashCode();
	//  118  242:aload           26
	//  119  244:invokevirtual   #252 <Method int String.hashCode()>
	//  120  247:istore          7
		l6 = g;
	//  121  249:aload_0         
	//  122  250:getfield        #93  <Field long g>
	//  123  253:lstore          24
		int k5 = (int)(l6 ^ l6 >>> 32);
	//  124  255:lload           24
	//  125  257:lload           24
	//  126  259:bipush          32
	//  127  261:lushr           
	//  128  262:lxor            
	//  129  263:l2i             
	//  130  264:istore          21
		obj = ((Object) (v));
	//  131  266:aload_0         
	//  132  267:getfield        #95  <Field jq v>
	//  133  270:astore          26
		int l2;
		if(obj == null)
	//* 134  272:aload           26
	//* 135  274:ifnonnull       283
			l2 = 0;
	//  136  277:iconst_0        
	//  137  278:istore          8
		else
	//* 138  280:goto            290
			l2 = ((jq) (obj)).hashCode();
	//  139  283:aload           26
	//  140  285:invokevirtual   #261 <Method int jq.hashCode()>
	//  141  288:istore          8
		int l5 = Arrays.hashCode(h);
	//  142  290:aload_0         
	//  143  291:getfield        #97  <Field byte[] h>
	//  144  294:invokestatic    #258 <Method int Arrays.hashCode(byte[])>
	//  145  297:istore          22
		obj = ((Object) (w));
	//  146  299:aload_0         
	//  147  300:getfield        #99  <Field String w>
	//  148  303:astore          26
		int i3;
		if(obj == null)
	//* 149  305:aload           26
	//* 150  307:ifnonnull       316
			i3 = 0;
	//  151  310:iconst_0        
	//  152  311:istore          9
		else
	//* 153  313:goto            323
			i3 = ((String) (obj)).hashCode();
	//  154  316:aload           26
	//  155  318:invokevirtual   #252 <Method int String.hashCode()>
	//  156  321:istore          9
		int i6 = fx.a(y);
	//  157  323:aload_0         
	//  158  324:getfield        #106 <Field int[] y>
	//  159  327:invokestatic    #264 <Method int fx.a(int[])>
	//  160  330:istore          23
		obj = ((Object) (A));
	//  161  332:aload_0         
	//  162  333:getfield        #110 <Field hy A>
	//  163  336:astore          26
		int j3;
		if(obj == null)
	//* 164  338:aload           26
	//* 165  340:ifnonnull       349
			j3 = 0;
	//  166  343:iconst_0        
	//  167  344:istore          10
		else
	//* 168  346:goto            356
			j3 = ((br) (obj)).hashCode();
	//  169  349:aload           26
	//  170  351:invokevirtual   #259 <Method int br.hashCode()>
	//  171  354:istore          10
		if(i)
	//* 172  356:aload_0         
	//* 173  357:getfield        #112 <Field boolean i>
	//* 174  360:ifeq            368
			c1 = '\u04CF';
	//  175  363:sipush          1231
	//  176  366:istore          11
		int k3 = ((int) (flag));
	//  177  368:iload           13
	//  178  370:istore          12
		if(a != null)
	//* 179  372:aload_0         
	//* 180  373:getfield        #115 <Field fv a>
	//* 181  376:ifnull          405
			if(a.b())
	//* 182  379:aload_0         
	//* 183  380:getfield        #115 <Field fv a>
	//* 184  383:invokevirtual   #236 <Method boolean fv.b()>
	//* 185  386:ifeq            396
				k3 = ((int) (flag));
	//  186  389:iload           13
	//  187  391:istore          12
			else
	//* 188  393:goto            405
				k3 = a.hashCode();
	//  189  396:aload_0         
	//  190  397:getfield        #115 <Field fv a>
	//  191  400:invokevirtual   #265 <Method int fv.hashCode()>
	//  192  403:istore          12
		return ((((((((((((((((((((((l3 + 527) * 31 + i4) * 31 + j4) * 31 * 31 + i1) * 31 + k4) * 31 + j1) * 31 * 31 + 1237) * 31 + l4) * 31 + i5) * 31 + k1) * 31 + j5) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + k5) * 31 + l2) * 31 + l5) * 31 + i3) * 31 * 31 + i6) * 31 * 31 + j3) * 31 + c1) * 31 + k3;
	//  193  405:iload           14
	//  194  407:sipush          527
	//  195  410:iadd            
	//  196  411:bipush          31
	//  197  413:imul            
	//  198  414:iload           15
	//  199  416:iadd            
	//  200  417:bipush          31
	//  201  419:imul            
	//  202  420:iload           16
	//  203  422:iadd            
	//  204  423:bipush          31
	//  205  425:imul            
	//  206  426:bipush          31
	//  207  428:imul            
	//  208  429:iload_1         
	//  209  430:iadd            
	//  210  431:bipush          31
	//  211  433:imul            
	//  212  434:iload           17
	//  213  436:iadd            
	//  214  437:bipush          31
	//  215  439:imul            
	//  216  440:iload_2         
	//  217  441:iadd            
	//  218  442:bipush          31
	//  219  444:imul            
	//  220  445:bipush          31
	//  221  447:imul            
	//  222  448:sipush          1237
	//  223  451:iadd            
	//  224  452:bipush          31
	//  225  454:imul            
	//  226  455:iload           18
	//  227  457:iadd            
	//  228  458:bipush          31
	//  229  460:imul            
	//  230  461:iload           19
	//  231  463:iadd            
	//  232  464:bipush          31
	//  233  466:imul            
	//  234  467:iload_3         
	//  235  468:iadd            
	//  236  469:bipush          31
	//  237  471:imul            
	//  238  472:iload           20
	//  239  474:iadd            
	//  240  475:bipush          31
	//  241  477:imul            
	//  242  478:iload           4
	//  243  480:iadd            
	//  244  481:bipush          31
	//  245  483:imul            
	//  246  484:iload           5
	//  247  486:iadd            
	//  248  487:bipush          31
	//  249  489:imul            
	//  250  490:iload           6
	//  251  492:iadd            
	//  252  493:bipush          31
	//  253  495:imul            
	//  254  496:iload           7
	//  255  498:iadd            
	//  256  499:bipush          31
	//  257  501:imul            
	//  258  502:iload           21
	//  259  504:iadd            
	//  260  505:bipush          31
	//  261  507:imul            
	//  262  508:iload           8
	//  263  510:iadd            
	//  264  511:bipush          31
	//  265  513:imul            
	//  266  514:iload           22
	//  267  516:iadd            
	//  268  517:bipush          31
	//  269  519:imul            
	//  270  520:iload           9
	//  271  522:iadd            
	//  272  523:bipush          31
	//  273  525:imul            
	//  274  526:bipush          31
	//  275  528:imul            
	//  276  529:iload           23
	//  277  531:iadd            
	//  278  532:bipush          31
	//  279  534:imul            
	//  280  535:bipush          31
	//  281  537:imul            
	//  282  538:iload           10
	//  283  540:iadd            
	//  284  541:bipush          31
	//  285  543:imul            
	//  286  544:iload           11
	//  287  546:iadd            
	//  288  547:bipush          31
	//  289  549:imul            
	//  290  550:iload           12
	//  291  552:iadd            
	//  292  553:ireturn         
	}

	private hy A;
	public long c;
	public long d;
	public int e;
	public byte f[];
	public long g;
	public byte h[];
	public boolean i;
	private long j;
	private String k;
	private String l;
	private int m;
	private boolean n;
	private jt o[];
	private byte p[];
	private gm q;
	private String r;
	private String s;
	private jp t;
	private String u;
	private jq v;
	private String w;
	private int x;
	private int y[];
	private long z;
}
