// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bmz, bnf, bml, biv, 
//			bft, bmp, bip, bfk, 
//			bfm, bnh, bfo, bnw

final class biu
	implements bmz
{

	public biu(bip bip1, Uri uri, bml bml1, biv biv1, bnh bnh1)
	{
		j = bip1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field bip j>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #31  <Method void Object()>
		a = (Uri)bnf.a(((Object) (uri)));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #36  <Method Object bnf.a(Object)>
	//    8   14:checkcast       #38  <Class Uri>
	//    9   17:putfield        #40  <Field Uri a>
		b = (bml)bnf.a(((Object) (bml1)));
	//   10   20:aload_0         
	//   11   21:aload_3         
	//   12   22:invokestatic    #36  <Method Object bnf.a(Object)>
	//   13   25:checkcast       #42  <Class bml>
	//   14   28:putfield        #44  <Field bml b>
		c = (biv)bnf.a(((Object) (biv1)));
	//   15   31:aload_0         
	//   16   32:aload           4
	//   17   34:invokestatic    #36  <Method Object bnf.a(Object)>
	//   18   37:checkcast       #46  <Class biv>
	//   19   40:putfield        #48  <Field biv c>
		d = bnh1;
	//   20   43:aload_0         
	//   21   44:aload           5
	//   22   46:putfield        #50  <Field bnh d>
	//   23   49:aload_0         
	//   24   50:new             #52  <Class bft>
	//   25   53:dup             
	//   26   54:invokespecial   #53  <Method void bft()>
	//   27   57:putfield        #55  <Field bft e>
		g = true;
	//   28   60:aload_0         
	//   29   61:iconst_1        
	//   30   62:putfield        #57  <Field boolean g>
		i = -1L;
	//   31   65:aload_0         
	//   32   66:ldc2w           #58  <Long -1L>
	//   33   69:putfield        #61  <Field long i>
	//   34   72:return          
	}

	static long a(biu biu1)
	{
		return biu1.i;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field long i>
	//    2    4:lreturn         
	}

	public final void a()
	{
		f = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #65  <Field boolean f>
	//    3    5:return          
	}

	public final void a(long l, long l1)
	{
		e.a = l;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field bft e>
	//    2    4:lload_1         
	//    3    5:putfield        #68  <Field long bft.a>
		h = l1;
	//    4    8:aload_0         
	//    5    9:lload_3         
	//    6   10:putfield        #70  <Field long h>
		g = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #57  <Field boolean g>
	//   10   18:return          
	}

	public final boolean b()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field boolean f>
	//    2    4:ireturn         
	}

	public final void c()
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
_L4:
		if(k != 0 || f)
			break; /* Loop/switch isn't completed */
	//    2    2:iload_1         
	//    3    3:ifne            355
	//    4    6:aload_0         
	//    5    7:getfield        #65  <Field boolean f>
	//    6   10:ifne            355
		long l2;
		bfk bfk1;
		l2 = e.a;
	//    7   13:aload_0         
	//    8   14:getfield        #55  <Field bft e>
	//    9   17:getfield        #68  <Field long bft.a>
	//   10   20:lstore          6
		i = b.a(new bmp(a, l2, -1L, bip.f(j)));
	//   11   22:aload_0         
	//   12   23:aload_0         
	//   13   24:getfield        #44  <Field bml b>
	//   14   27:new             #73  <Class bmp>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:getfield        #40  <Field Uri a>
	//   18   35:lload           6
	//   19   37:ldc2w           #58  <Long -1L>
	//   20   40:aload_0         
	//   21   41:getfield        #28  <Field bip j>
	//   22   44:invokestatic    #78  <Method String bip.f(bip)>
	//   23   47:invokespecial   #81  <Method void bmp(Uri, long, long, String)>
	//   24   50:invokeinterface #84  <Method long bml.a(bmp)>
	//   25   55:putfield        #61  <Field long i>
		if(i != -1L)
	//*  26   58:aload_0         
	//*  27   59:getfield        #61  <Field long i>
	//*  28   62:ldc2w           #58  <Long -1L>
	//*  29   65:lcmp            
	//*  30   66:ifeq            80
			i = i + l2;
	//   31   69:aload_0         
	//   32   70:aload_0         
	//   33   71:getfield        #61  <Field long i>
	//   34   74:lload           6
	//   35   76:ladd            
	//   36   77:putfield        #61  <Field long i>
		bfk1 = new bfk(b, l2, i);
	//   37   80:new             #86  <Class bfk>
	//   38   83:dup             
	//   39   84:aload_0         
	//   40   85:getfield        #44  <Field bml b>
	//   41   88:lload           6
	//   42   90:aload_0         
	//   43   91:getfield        #61  <Field long i>
	//   44   94:invokespecial   #89  <Method void bfk(bml, long, long)>
	//   45   97:astore          9
		int i1 = k;
	//   46   99:iload_1         
	//   47  100:istore_3        
		bfm bfm1 = c.a(((bfo) (bfk1)), b.b());
	//   48  101:aload_0         
	//   49  102:getfield        #48  <Field biv c>
	//   50  105:aload           9
	//   51  107:aload_0         
	//   52  108:getfield        #44  <Field bml b>
	//   53  111:invokeinterface #92  <Method Uri bml.b()>
	//   54  116:invokevirtual   #95  <Method bfm biv.a(bfo, Uri)>
	//   55  119:astore          8
		int l;
		long l1;
		l = k;
	//   56  121:iload_1         
	//   57  122:istore_2        
		l1 = l2;
	//   58  123:lload           6
	//   59  125:lstore          4
		i1 = k;
	//   60  127:iload_1         
	//   61  128:istore_3        
		if(!g)
			break MISSING_BLOCK_LABEL_164;
	//   62  129:aload_0         
	//   63  130:getfield        #57  <Field boolean g>
	//   64  133:ifeq            164
		i1 = k;
	//   65  136:iload_1         
	//   66  137:istore_3        
		bfm1.a(l2, h);
	//   67  138:aload           8
	//   68  140:lload           6
	//   69  142:aload_0         
	//   70  143:getfield        #70  <Field long h>
	//   71  146:invokeinterface #99  <Method void bfm.a(long, long)>
		i1 = k;
	//   72  151:iload_1         
	//   73  152:istore_3        
		g = false;
	//   74  153:aload_0         
	//   75  154:iconst_0        
	//   76  155:putfield        #57  <Field boolean g>
		l1 = l2;
	//   77  158:lload           6
	//   78  160:lstore          4
		l = k;
	//   79  162:iload_1         
	//   80  163:istore_2        
_L2:
		if(l != 0)
			break; /* Loop/switch isn't completed */
	//   81  164:iload_2         
	//   82  165:ifne            273
		i1 = l;
	//   83  168:iload_2         
	//   84  169:istore_3        
		if(f)
			break; /* Loop/switch isn't completed */
	//   85  170:aload_0         
	//   86  171:getfield        #65  <Field boolean f>
	//   87  174:ifne            273
		i1 = l;
	//   88  177:iload_2         
	//   89  178:istore_3        
		d.c();
	//   90  179:aload_0         
	//   91  180:getfield        #50  <Field bnh d>
	//   92  183:invokevirtual   #103 <Method void bnh.c()>
		i1 = l;
	//   93  186:iload_2         
	//   94  187:istore_3        
		k = bfm1.a(((bfo) (bfk1)), e);
	//   95  188:aload           8
	//   96  190:aload           9
	//   97  192:aload_0         
	//   98  193:getfield        #55  <Field bft e>
	//   99  196:invokeinterface #106 <Method int bfm.a(bfo, bft)>
	//  100  201:istore_1        
		l = k;
	//  101  202:iload_1         
	//  102  203:istore_2        
		i1 = k;
	//  103  204:iload_1         
	//  104  205:istore_3        
		if(((bfo) (bfk1)).b() <= bip.g(j) + l1)
			continue; /* Loop/switch isn't completed */
	//  105  206:aload           9
	//  106  208:invokeinterface #111 <Method long bfo.b()>
	//  107  213:aload_0         
	//  108  214:getfield        #28  <Field bip j>
	//  109  217:invokestatic    #114 <Method long bip.g(bip)>
	//  110  220:lload           4
	//  111  222:ladd            
	//  112  223:lcmp            
	//  113  224:ifle            164
		i1 = k;
	//  114  227:iload_1         
	//  115  228:istore_3        
		l1 = ((bfo) (bfk1)).b();
	//  116  229:aload           9
	//  117  231:invokeinterface #111 <Method long bfo.b()>
	//  118  236:lstore          4
		i1 = k;
	//  119  238:iload_1         
	//  120  239:istore_3        
		d.b();
	//  121  240:aload_0         
	//  122  241:getfield        #50  <Field bnh d>
	//  123  244:invokevirtual   #116 <Method boolean bnh.b()>
	//  124  247:pop             
		i1 = k;
	//  125  248:iload_1         
	//  126  249:istore_3        
		bip.i(j).post(bip.h(j));
	//  127  250:aload_0         
	//  128  251:getfield        #28  <Field bip j>
	//  129  254:invokestatic    #119 <Method Handler bip.i(bip)>
	//  130  257:aload_0         
	//  131  258:getfield        #28  <Field bip j>
	//  132  261:invokestatic    #122 <Method Runnable bip.h(bip)>
	//  133  264:invokevirtual   #128 <Method boolean Handler.post(Runnable)>
	//  134  267:pop             
		l = k;
	//  135  268:iload_1         
	//  136  269:istore_2        
		if(true) goto _L2; else goto _L1
	//  137  270:goto            164
_L1:
		if(l == 1)
	//* 138  273:iload_2         
	//* 139  274:iconst_1        
	//* 140  275:icmpne          283
		{
			k = 0;
	//  141  278:iconst_0        
	//  142  279:istore_1        
		} else
	//* 143  280:goto            299
		{
			e.a = ((bfo) (bfk1)).b();
	//  144  283:aload_0         
	//  145  284:getfield        #55  <Field bft e>
	//  146  287:aload           9
	//  147  289:invokeinterface #111 <Method long bfo.b()>
	//  148  294:putfield        #68  <Field long bft.a>
			k = l;
	//  149  297:iload_2         
	//  150  298:istore_1        
		}
		bnw.a(b);
	//  151  299:aload_0         
	//  152  300:getfield        #44  <Field bml b>
	//  153  303:invokestatic    #133 <Method void bnw.a(bml)>
		if(true) goto _L4; else goto _L3
	//  154  306:goto            2
		Exception exception;
		exception;
	//  155  309:astore          8
		k = i1;
	//  156  311:iload_3         
	//  157  312:istore_1        
		break MISSING_BLOCK_LABEL_321;
	//  158  313:goto            321
		exception;
	//  159  316:astore          8
		bfk1 = null;
	//  160  318:aconst_null     
	//  161  319:astore          9
		if(k != 1 && bfk1 != null)
	//* 162  321:iload_1         
	//* 163  322:iconst_1        
	//* 164  323:icmpeq          345
	//* 165  326:aload           9
	//* 166  328:ifnull          345
			e.a = ((bfo) (bfk1)).b();
	//  167  331:aload_0         
	//  168  332:getfield        #55  <Field bft e>
	//  169  335:aload           9
	//  170  337:invokeinterface #111 <Method long bfo.b()>
	//  171  342:putfield        #68  <Field long bft.a>
		bnw.a(b);
	//  172  345:aload_0         
	//  173  346:getfield        #44  <Field bml b>
	//  174  349:invokestatic    #133 <Method void bnw.a(bml)>
		throw exception;
	//  175  352:aload           8
	//  176  354:athrow          
_L3:
	//  177  355:return          
	}

	private final Uri a;
	private final bml b;
	private final biv c;
	private final bnh d;
	private final bft e = new bft();
	private volatile boolean f;
	private boolean g;
	private long h;
	private long i;
	private final bip j;
}
