// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bjb, bkz, bif, bkn, 
//			bkj, bkk, bnc, blr, 
//			bkq, bmw, bkg, bky, 
//			bkp, bcr, blc, bkl, 
//			bjc, bdj, bnb, bmm, 
//			bmp, bnw, bkr, bkm, 
//			bkf, bnd, bml, bie, 
//			bmx, bmj, biz, bct

public final class bki
	implements bjb
{

	private bki(Uri uri, bmm bmm1, bkf bkf, int i1, long l1, Handler handler, 
			bie bie)
	{
		this(uri, bmm1, ((bnd) (new bkz())), bkf, 3, -1L, handler, ((bie) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #51  <Class bkz>
	//    4    6:dup             
	//    5    7:invokespecial   #54  <Method void bkz()>
	//    6   10:aload_3         
	//    7   11:iconst_3        
	//    8   12:ldc2w           #55  <Long -1L>
	//    9   15:aload           7
	//   10   17:aconst_null     
	//   11   18:invokespecial   #59  <Method void bki(Uri, bmm, bnd, bkf, int, long, Handler, bie)>
	//   12   21:return          
	}

	public bki(Uri uri, bmm bmm1, bkf bkf, Handler handler, bie bie)
	{
		this(uri, bmm1, bkf, 3, -1L, handler, ((bie) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_3        
	//    5    5:ldc2w           #55  <Long -1L>
	//    6    8:aload           4
	//    7   10:aconst_null     
	//    8   11:invokespecial   #63  <Method void bki(Uri, bmm, bkf, int, long, Handler, bie)>
	//    9   14:return          
	}

	private bki(Uri uri, bmm bmm1, bnd bnd, bkf bkf, int i1, long l1, 
			Handler handler, bie bie)
	{
		this(((bky) (null)), uri, bmm1, bnd, bkf, 3, -1L, handler, bie);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:iconst_3        
	//    7    8:ldc2w           #55  <Long -1L>
	//    8   11:aload           8
	//    9   13:aload           9
	//   10   15:invokespecial   #66  <Method void bki(bky, Uri, bmm, bnd, bkf, int, long, Handler, bie)>
	//   11   18:return          
	}

	private bki(bky bky1, Uri uri, bmm bmm1, bnd bnd, bkf bkf, int i1, long l1, Handler handler, bie bie)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void Object()>
		t = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #69  <Field bky t>
		q = uri;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #71  <Field Uri q>
		b = bmm1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #73  <Field bmm b>
		g = bnd;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #75  <Field bnd g>
		c = bkf;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #77  <Field bkf c>
		d = i1;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #79  <Field int d>
		e = l1;
	//   20   37:aload_0         
	//   21   38:lload           7
	//   22   40:putfield        #81  <Field long e>
		a = false;
	//   23   43:aload_0         
	//   24   44:iconst_0        
	//   25   45:putfield        #83  <Field boolean a>
		f = new bif(handler, bie);
	//   26   48:aload_0         
	//   27   49:new             #85  <Class bif>
	//   28   52:dup             
	//   29   53:aload           9
	//   30   55:aload           10
	//   31   57:invokespecial   #88  <Method void bif(Handler, bie)>
	//   32   60:putfield        #90  <Field bif f>
		i = new Object();
	//   33   63:aload_0         
	//   34   64:new             #4   <Class Object>
	//   35   67:dup             
	//   36   68:invokespecial   #67  <Method void Object()>
	//   37   71:putfield        #92  <Field Object i>
		j = new SparseArray();
	//   38   74:aload_0         
	//   39   75:new             #94  <Class SparseArray>
	//   40   78:dup             
	//   41   79:invokespecial   #95  <Method void SparseArray()>
	//   42   82:putfield        #97  <Field SparseArray j>
		h = new bkn(this, ((bkj) (null)));
	//   43   85:aload_0         
	//   44   86:new             #99  <Class bkn>
	//   45   89:dup             
	//   46   90:aload_0         
	//   47   91:aconst_null     
	//   48   92:invokespecial   #102 <Method void bkn(bki, bkj)>
	//   49   95:putfield        #104 <Field bkn h>
		k = ((Runnable) (new bkj(this)));
	//   50   98:aload_0         
	//   51   99:new             #106 <Class bkj>
	//   52  102:dup             
	//   53  103:aload_0         
	//   54  104:invokespecial   #109 <Method void bkj(bki)>
	//   55  107:putfield        #111 <Field Runnable k>
		l = ((Runnable) (new bkk(this)));
	//   56  110:aload_0         
	//   57  111:new             #113 <Class bkk>
	//   58  114:dup             
	//   59  115:aload_0         
	//   60  116:invokespecial   #114 <Method void bkk(bki)>
	//   61  119:putfield        #116 <Field Runnable l>
	//   62  122:return          
	}

	private final void a(long l1)
	{
		v = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #119 <Field long v>
		a(true);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokespecial   #122 <Method void a(boolean)>
	//    6   10:return          
	}

	static void a(bki bki1)
	{
		bki1.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #124 <Method void c()>
	//    2    4:return          
	}

	static void a(bki bki1, boolean flag)
	{
		bki1.a(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #122 <Method void a(boolean)>
	//    3    5:return          
	}

	private final void a(blr blr1, bnd bnd)
	{
		a(new bnc(n, Uri.parse(blr1.b), 5, bnd), ((bmx) (new bkq(this, ((bkj) (null))))), 1);
	//    0    0:aload_0         
	//    1    1:new             #128 <Class bnc>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #130 <Field bml n>
	//    5    9:aload_1         
	//    6   10:getfield        #135 <Field String blr.b>
	//    7   13:invokestatic    #141 <Method Uri Uri.parse(String)>
	//    8   16:iconst_5        
	//    9   17:aload_2         
	//   10   18:invokespecial   #144 <Method void bnc(bml, Uri, int, bnd)>
	//   11   21:new             #146 <Class bkq>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:invokespecial   #147 <Method void bkq(bki, bkj)>
	//   16   30:iconst_1        
	//   17   31:invokespecial   #150 <Method void a(bnc, bmx, int)>
	//   18   34:return          
	}

	private final void a(bnc bnc1, bmx bmx, int i1)
	{
		long l1 = o.a(((bmz) (bnc1)), bmx, i1);
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field bmw o>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #157 <Method long bmw.a(bmz, bmx, int)>
	//    6   10:lstore          4
		f.a(bnc1.a, bnc1.b, l1);
	//    7   12:aload_0         
	//    8   13:getfield        #90  <Field bif f>
	//    9   16:aload_1         
	//   10   17:getfield        #160 <Field bmp bnc.a>
	//   11   20:aload_1         
	//   12   21:getfield        #162 <Field int bnc.b>
	//   13   24:lload           4
	//   14   26:invokevirtual   #165 <Method void bif.a(bmp, int, long)>
	//   15   29:return          
	}

	private final void a(IOException ioexception)
	{
		Log.e("DashMediaSource", "Failed to resolve UtcTiming element.", ((Throwable) (ioexception)));
	//    0    0:ldc1            #168 <String "DashMediaSource">
	//    1    2:ldc1            #170 <String "Failed to resolve UtcTiming element.">
	//    2    4:aload_1         
	//    3    5:invokestatic    #175 <Method int Log.e(String, String, Throwable)>
	//    4    8:pop             
		a(true);
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:invokespecial   #122 <Method void a(boolean)>
	//    8   14:return          
	}

	private final void a(boolean flag)
	{
		for(int i1 = 0; i1 < j.size(); i1++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #97  <Field SparseArray j>
	//*   5    7:invokevirtual   #179 <Method int SparseArray.size()>
	//*   6   10:icmpge          61
		{
			int k1 = j.keyAt(i1);
	//    7   13:aload_0         
	//    8   14:getfield        #97  <Field SparseArray j>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #183 <Method int SparseArray.keyAt(int)>
	//   11   21:istore_3        
			if(k1 >= w)
	//*  12   22:iload_3         
	//*  13   23:aload_0         
	//*  14   24:getfield        #185 <Field int w>
	//*  15   27:icmplt          54
				((bkg)j.valueAt(i1)).a(t, k1 - w);
	//   16   30:aload_0         
	//   17   31:getfield        #97  <Field SparseArray j>
	//   18   34:iload_2         
	//   19   35:invokevirtual   #189 <Method Object SparseArray.valueAt(int)>
	//   20   38:checkcast       #191 <Class bkg>
	//   21   41:aload_0         
	//   22   42:getfield        #69  <Field bky t>
	//   23   45:iload_3         
	//   24   46:aload_0         
	//   25   47:getfield        #185 <Field int w>
	//   26   50:isub            
	//   27   51:invokevirtual   #194 <Method void bkg.a(bky, int)>
		}

	//   28   54:iload_2         
	//   29   55:iconst_1        
	//   30   56:iadd            
	//   31   57:istore_2        
	//*  32   58:goto            2
		int j1 = t.a() - 1;
	//   33   61:aload_0         
	//   34   62:getfield        #69  <Field bky t>
	//   35   65:invokevirtual   #198 <Method int bky.a()>
	//   36   68:iconst_1        
	//   37   69:isub            
	//   38   70:istore_2        
		Object obj = ((Object) (bkp.a(t.a(0), t.b(0))));
	//   39   71:aload_0         
	//   40   72:getfield        #69  <Field bky t>
	//   41   75:iconst_0        
	//   42   76:invokevirtual   #201 <Method blc bky.a(int)>
	//   43   79:aload_0         
	//   44   80:getfield        #69  <Field bky t>
	//   45   83:iconst_0        
	//   46   84:invokevirtual   #204 <Method long bky.b(int)>
	//   47   87:invokestatic    #209 <Method bkp bkp.a(blc, long)>
	//   48   90:astore          16
		bkp bkp1 = bkp.a(t.a(j1), t.b(j1));
	//   49   92:aload_0         
	//   50   93:getfield        #69  <Field bky t>
	//   51   96:iload_2         
	//   52   97:invokevirtual   #201 <Method blc bky.a(int)>
	//   53  100:aload_0         
	//   54  101:getfield        #69  <Field bky t>
	//   55  104:iload_2         
	//   56  105:invokevirtual   #204 <Method long bky.b(int)>
	//   57  108:invokestatic    #209 <Method bkp bkp.a(blc, long)>
	//   58  111:astore          17
		long l4 = ((bkp) (obj)).b;
	//   59  113:aload           16
	//   60  115:getfield        #211 <Field long bkp.b>
	//   61  118:lstore          6
		long l5 = bkp1.c;
	//   62  120:aload           17
	//   63  122:getfield        #213 <Field long bkp.c>
	//   64  125:lstore          8
		boolean flag1;
		if(t.b && !bkp1.a)
	//*  65  127:aload_0         
	//*  66  128:getfield        #69  <Field bky t>
	//*  67  131:getfield        #215 <Field boolean bky.b>
	//*  68  134:ifeq            316
	//*  69  137:aload           17
	//*  70  139:getfield        #216 <Field boolean bkp.a>
	//*  71  142:ifne            316
		{
			long l2;
			if(v != 0L)
	//*  72  145:aload_0         
	//*  73  146:getfield        #119 <Field long v>
	//*  74  149:lconst_0        
	//*  75  150:lcmp            
	//*  76  151:ifeq            170
				l2 = bcr.b(SystemClock.elapsedRealtime() + v);
	//   77  154:invokestatic    #222 <Method long SystemClock.elapsedRealtime()>
	//   78  157:aload_0         
	//   79  158:getfield        #119 <Field long v>
	//   80  161:ladd            
	//   81  162:invokestatic    #227 <Method long bcr.b(long)>
	//   82  165:lstore          4
			else
	//*  83  167:goto            178
				l2 = bcr.b(System.currentTimeMillis());
	//   84  170:invokestatic    #232 <Method long System.currentTimeMillis()>
	//   85  173:invokestatic    #227 <Method long bcr.b(long)>
	//   86  176:lstore          4
			l5 = Math.min(l2 - bcr.b(t.a) - bcr.b(t.a(j1).b), l5);
	//   87  178:lload           4
	//   88  180:aload_0         
	//   89  181:getfield        #69  <Field bky t>
	//   90  184:getfield        #234 <Field long bky.a>
	//   91  187:invokestatic    #227 <Method long bcr.b(long)>
	//   92  190:lsub            
	//   93  191:aload_0         
	//   94  192:getfield        #69  <Field bky t>
	//   95  195:iload_2         
	//   96  196:invokevirtual   #201 <Method blc bky.a(int)>
	//   97  199:getfield        #237 <Field long blc.b>
	//   98  202:invokestatic    #227 <Method long bcr.b(long)>
	//   99  205:lsub            
	//  100  206:lload           8
	//  101  208:invokestatic    #243 <Method long Math.min(long, long)>
	//  102  211:lstore          8
			l2 = l4;
	//  103  213:lload           6
	//  104  215:lstore          4
			if(t.d != 0x1L)
	//* 105  217:aload_0         
	//* 106  218:getfield        #69  <Field bky t>
	//* 107  221:getfield        #245 <Field long bky.d>
	//* 108  224:ldc2w           #246 <Long 0x1L>
	//* 109  227:lcmp            
	//* 110  228:ifeq            307
			{
				for(l2 = l5 - bcr.b(t.d); l2 < 0L && j1 > 0; l2 += ((bky) (obj)).b(j1))
	//* 111  231:lload           8
	//* 112  233:aload_0         
	//* 113  234:getfield        #69  <Field bky t>
	//* 114  237:getfield        #245 <Field long bky.d>
	//* 115  240:invokestatic    #227 <Method long bcr.b(long)>
	//* 116  243:lsub            
	//* 117  244:lstore          4
	//* 118  246:lload           4
	//* 119  248:lconst_0        
	//* 120  249:lcmp            
	//* 121  250:ifge            281
	//* 122  253:iload_2         
	//* 123  254:ifle            281
				{
					obj = ((Object) (t));
	//  124  257:aload_0         
	//  125  258:getfield        #69  <Field bky t>
	//  126  261:astore          16
					j1--;
	//  127  263:iload_2         
	//  128  264:iconst_1        
	//  129  265:isub            
	//  130  266:istore_2        
				}

	//  131  267:lload           4
	//  132  269:aload           16
	//  133  271:iload_2         
	//  134  272:invokevirtual   #204 <Method long bky.b(int)>
	//  135  275:ladd            
	//  136  276:lstore          4
	//* 137  278:goto            246
				if(j1 == 0)
	//* 138  281:iload_2         
	//* 139  282:ifne            297
					l2 = Math.max(l4, l2);
	//  140  285:lload           6
	//  141  287:lload           4
	//  142  289:invokestatic    #250 <Method long Math.max(long, long)>
	//  143  292:lstore          4
				else
	//* 144  294:goto            307
					l2 = t.b(0);
	//  145  297:aload_0         
	//  146  298:getfield        #69  <Field bky t>
	//  147  301:iconst_0        
	//  148  302:invokevirtual   #204 <Method long bky.b(int)>
	//  149  305:lstore          4
			}
			flag1 = true;
	//  150  307:iconst_1        
	//  151  308:istore_2        
			l4 = l2;
	//  152  309:lload           4
	//  153  311:lstore          6
		} else
	//* 154  313:goto            318
		{
			flag1 = false;
	//  155  316:iconst_0        
	//  156  317:istore_2        
		}
		l5 -= l4;
	//  157  318:lload           8
	//  158  320:lload           6
	//  159  322:lsub            
	//  160  323:lstore          8
		for(int l1 = 0; l1 < t.a() - 1; l1++)
	//* 161  325:iconst_0        
	//* 162  326:istore_3        
	//* 163  327:iload_3         
	//* 164  328:aload_0         
	//* 165  329:getfield        #69  <Field bky t>
	//* 166  332:invokevirtual   #198 <Method int bky.a()>
	//* 167  335:iconst_1        
	//* 168  336:isub            
	//* 169  337:icmpge          360
			l5 += t.b(l1);
	//  170  340:lload           8
	//  171  342:aload_0         
	//  172  343:getfield        #69  <Field bky t>
	//  173  346:iload_3         
	//  174  347:invokevirtual   #204 <Method long bky.b(int)>
	//  175  350:ladd            
	//  176  351:lstore          8

	//  177  353:iload_3         
	//  178  354:iconst_1        
	//  179  355:iadd            
	//  180  356:istore_3        
	//* 181  357:goto            327
		long l3;
		if(t.b)
	//* 182  360:aload_0         
	//* 183  361:getfield        #69  <Field bky t>
	//* 184  364:getfield        #215 <Field boolean bky.b>
	//* 185  367:ifeq            459
		{
			long l6 = e;
	//  186  370:aload_0         
	//  187  371:getfield        #81  <Field long e>
	//  188  374:lstore          10
			l3 = l6;
	//  189  376:lload           10
	//  190  378:lstore          4
			if(l6 == -1L)
	//* 191  380:lload           10
	//* 192  382:ldc2w           #55  <Long -1L>
	//* 193  385:lcmp            
	//* 194  386:ifne            420
				if(t.e != 0x1L)
	//* 195  389:aload_0         
	//* 196  390:getfield        #69  <Field bky t>
	//* 197  393:getfield        #251 <Field long bky.e>
	//* 198  396:ldc2w           #246 <Long 0x1L>
	//* 199  399:lcmp            
	//* 200  400:ifeq            415
					l3 = t.e;
	//  201  403:aload_0         
	//  202  404:getfield        #69  <Field bky t>
	//  203  407:getfield        #251 <Field long bky.e>
	//  204  410:lstore          4
				else
	//* 205  412:goto            420
					l3 = 30000L;
	//  206  415:ldc2w           #252 <Long 30000L>
	//  207  418:lstore          4
			l3 = l5 - bcr.b(l3);
	//  208  420:lload           8
	//  209  422:lload           4
	//  210  424:invokestatic    #227 <Method long bcr.b(long)>
	//  211  427:lsub            
	//  212  428:lstore          4
			if(l3 < 0x4c4b40L)
	//* 213  430:lload           4
	//* 214  432:ldc2w           #254 <Long 0x4c4b40L>
	//* 215  435:lcmp            
	//* 216  436:ifge            456
				l3 = Math.min(0x4c4b40L, l5 / 2L);
	//  217  439:ldc2w           #254 <Long 0x4c4b40L>
	//  218  442:lload           8
	//  219  444:ldc2w           #256 <Long 2L>
	//  220  447:ldiv            
	//  221  448:invokestatic    #243 <Method long Math.min(long, long)>
	//  222  451:lstore          4
		} else
	//* 223  453:goto            462
	//* 224  456:goto            462
		{
			l3 = 0L;
	//  225  459:lconst_0        
	//  226  460:lstore          4
		}
		long l7 = t.a;
	//  227  462:aload_0         
	//  228  463:getfield        #69  <Field bky t>
	//  229  466:getfield        #234 <Field long bky.a>
	//  230  469:lstore          10
		long l8 = t.a(0).b;
	//  231  471:aload_0         
	//  232  472:getfield        #69  <Field bky t>
	//  233  475:iconst_0        
	//  234  476:invokevirtual   #201 <Method blc bky.a(int)>
	//  235  479:getfield        #237 <Field long blc.b>
	//  236  482:lstore          12
		long l9 = bcr.a(l4);
	//  237  484:lload           6
	//  238  486:invokestatic    #259 <Method long bcr.a(long)>
	//  239  489:lstore          14
		obj = ((Object) (new bkl(t.a, l7 + l8 + l9, w, l4, l5, l3, t)));
	//  240  491:new             #261 <Class bkl>
	//  241  494:dup             
	//  242  495:aload_0         
	//  243  496:getfield        #69  <Field bky t>
	//  244  499:getfield        #234 <Field long bky.a>
	//  245  502:lload           10
	//  246  504:lload           12
	//  247  506:ladd            
	//  248  507:lload           14
	//  249  509:ladd            
	//  250  510:aload_0         
	//  251  511:getfield        #185 <Field int w>
	//  252  514:lload           6
	//  253  516:lload           8
	//  254  518:lload           4
	//  255  520:aload_0         
	//  256  521:getfield        #69  <Field bky t>
	//  257  524:invokespecial   #264 <Method void bkl(long, long, int, long, long, long, bky)>
	//  258  527:astore          16
		m.a(((bdp) (obj)), ((Object) (t)));
	//  259  529:aload_0         
	//  260  530:getfield        #266 <Field bjc m>
	//  261  533:aload           16
	//  262  535:aload_0         
	//  263  536:getfield        #69  <Field bky t>
	//  264  539:invokeinterface #271 <Method void bjc.a(bdp, Object)>
		u.removeCallbacks(l);
	//  265  544:aload_0         
	//  266  545:getfield        #273 <Field Handler u>
	//  267  548:aload_0         
	//  268  549:getfield        #116 <Field Runnable l>
	//  269  552:invokevirtual   #279 <Method void Handler.removeCallbacks(Runnable)>
		if(flag1)
	//* 270  555:iload_2         
	//* 271  556:ifeq            574
			u.postDelayed(l, 5000L);
	//  272  559:aload_0         
	//  273  560:getfield        #273 <Field Handler u>
	//  274  563:aload_0         
	//  275  564:getfield        #116 <Field Runnable l>
	//  276  567:ldc2w           #280 <Long 5000L>
	//  277  570:invokevirtual   #285 <Method boolean Handler.postDelayed(Runnable, long)>
	//  278  573:pop             
		if(flag)
	//* 279  574:iload_1         
	//* 280  575:ifeq            582
			d();
	//  281  578:aload_0         
	//  282  579:invokespecial   #287 <Method void d()>
	//  283  582:return          
	}

	private final void c()
	{
		Uri uri;
		synchronized(i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field Object i>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			uri = q;
	//    5    7:aload_0         
	//    6    8:getfield        #71  <Field Uri q>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		a(new bnc(n, uri, 4, g), ((bmx) (h)), d);
	//   10   14:aload_0         
	//   11   15:new             #128 <Class bnc>
	//   12   18:dup             
	//   13   19:aload_0         
	//   14   20:getfield        #130 <Field bml n>
	//   15   23:aload_2         
	//   16   24:iconst_4        
	//   17   25:aload_0         
	//   18   26:getfield        #75  <Field bnd g>
	//   19   29:invokespecial   #144 <Method void bnc(bml, Uri, int, bnd)>
	//   20   32:aload_0         
	//   21   33:getfield        #104 <Field bkn h>
	//   22   36:aload_0         
	//   23   37:getfield        #79  <Field int d>
	//   24   40:invokespecial   #150 <Method void a(bnc, bmx, int)>
		return;
	//   25   43:return          
		exception;
	//   26   44:astore_2        
		obj;
	//   27   45:aload_1         
		JVM INSTR monitorexit ;
	//   28   46:monitorexit     
		throw exception;
	//   29   47:aload_2         
	//   30   48:athrow          
	}

	private final void d()
	{
		if(!t.b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field bky t>
	//*   2    4:getfield        #215 <Field boolean bky.b>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		long l2 = t.c;
	//    5   11:aload_0         
	//    6   12:getfield        #69  <Field bky t>
	//    7   15:getfield        #288 <Field long bky.c>
	//    8   18:lstore_3        
		long l1 = l2;
	//    9   19:lload_3         
	//   10   20:lstore_1        
		if(l2 == 0L)
	//*  11   21:lload_3         
	//*  12   22:lconst_0        
	//*  13   23:lcmp            
	//*  14   24:ifne            31
			l1 = 5000L;
	//   15   27:ldc2w           #280 <Long 5000L>
	//   16   30:lstore_1        
		l1 = Math.max(0L, (r + l1) - SystemClock.elapsedRealtime());
	//   17   31:lconst_0        
	//   18   32:aload_0         
	//   19   33:getfield        #290 <Field long r>
	//   20   36:lload_1         
	//   21   37:ladd            
	//   22   38:invokestatic    #222 <Method long SystemClock.elapsedRealtime()>
	//   23   41:lsub            
	//   24   42:invokestatic    #250 <Method long Math.max(long, long)>
	//   25   45:lstore_1        
		u.postDelayed(k, l1);
	//   26   46:aload_0         
	//   27   47:getfield        #273 <Field Handler u>
	//   28   50:aload_0         
	//   29   51:getfield        #111 <Field Runnable k>
	//   30   54:lload_1         
	//   31   55:invokevirtual   #285 <Method boolean Handler.postDelayed(Runnable, long)>
	//   32   58:pop             
	//   33   59:return          
	}

	final int a(bnc bnc1, long l1, long l2, IOException ioexception)
	{
		boolean flag = ioexception instanceof bdj;
	//    0    0:aload           6
	//    1    2:instanceof      #293 <Class bdj>
	//    2    5:istore          7
		f.a(bnc1.a, bnc1.b, l1, l2, bnc1.e(), ioexception, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #90  <Field bif f>
	//    5   11:aload_1         
	//    6   12:getfield        #160 <Field bmp bnc.a>
	//    7   15:aload_1         
	//    8   16:getfield        #162 <Field int bnc.b>
	//    9   19:lload_2         
	//   10   20:lload           4
	//   11   22:aload_1         
	//   12   23:invokevirtual   #295 <Method long bnc.e()>
	//   13   26:aload           6
	//   14   28:iload           7
	//   15   30:invokevirtual   #298 <Method void bif.a(bmp, int, long, long, long, IOException, boolean)>
		return !flag ? 0 : 3;
	//   16   33:iload           7
	//   17   35:ifeq            40
	//   18   38:iconst_3        
	//   19   39:ireturn         
	//   20   40:iconst_0        
	//   21   41:ireturn         
	}

	public final biz a(int i1, bmj bmj)
	{
		bif bif1 = f.a(t.a(i1).b);
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field bif f>
	//    2    4:aload_0         
	//    3    5:getfield        #69  <Field bky t>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #201 <Method blc bky.a(int)>
	//    6   12:getfield        #237 <Field long blc.b>
	//    7   15:invokevirtual   #302 <Method bif bif.a(long)>
	//    8   18:astore_3        
		bmj = ((bmj) (new bkg(w + i1, t, i1, c, d, bif1, v, p, bmj)));
	//    9   19:new             #191 <Class bkg>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:getfield        #185 <Field int w>
	//   13   27:iload_1         
	//   14   28:iadd            
	//   15   29:aload_0         
	//   16   30:getfield        #69  <Field bky t>
	//   17   33:iload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #77  <Field bkf c>
	//   20   38:aload_0         
	//   21   39:getfield        #79  <Field int d>
	//   22   42:aload_3         
	//   23   43:aload_0         
	//   24   44:getfield        #119 <Field long v>
	//   25   47:aload_0         
	//   26   48:getfield        #304 <Field bnb p>
	//   27   51:aload_2         
	//   28   52:invokespecial   #307 <Method void bkg(int, bky, int, bkf, int, bif, long, bnb, bmj)>
	//   29   55:astore_2        
		j.put(((bkg) (bmj)).a, ((Object) (bmj)));
	//   30   56:aload_0         
	//   31   57:getfield        #97  <Field SparseArray j>
	//   32   60:aload_2         
	//   33   61:getfield        #309 <Field int bkg.a>
	//   34   64:aload_2         
	//   35   65:invokevirtual   #313 <Method void SparseArray.put(int, Object)>
		return ((biz) (bmj));
	//   36   68:aload_2         
	//   37   69:areturn         
	}

	public final void a()
	{
		p.c();
	//    0    0:aload_0         
	//    1    1:getfield        #304 <Field bnb p>
	//    2    4:invokeinterface #316 <Method void bnb.c()>
	//    3    9:return          
	}

	public final void a(bct bct, boolean flag, bjc bjc1)
	{
		m = bjc1;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #266 <Field bjc m>
		n = b.a();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #73  <Field bmm b>
	//    6   10:invokeinterface #322 <Method bml bmm.a()>
	//    7   15:putfield        #130 <Field bml n>
		o = new bmw("Loader:DashMediaSource");
	//    8   18:aload_0         
	//    9   19:new             #154 <Class bmw>
	//   10   22:dup             
	//   11   23:ldc2            #324 <String "Loader:DashMediaSource">
	//   12   26:invokespecial   #327 <Method void bmw(String)>
	//   13   29:putfield        #152 <Field bmw o>
		p = ((bnb) (o));
	//   14   32:aload_0         
	//   15   33:aload_0         
	//   16   34:getfield        #152 <Field bmw o>
	//   17   37:putfield        #304 <Field bnb p>
		u = new Handler();
	//   18   40:aload_0         
	//   19   41:new             #275 <Class Handler>
	//   20   44:dup             
	//   21   45:invokespecial   #328 <Method void Handler()>
	//   22   48:putfield        #273 <Field Handler u>
		c();
	//   23   51:aload_0         
	//   24   52:invokespecial   #124 <Method void c()>
	//   25   55:return          
	}

	public final void a(biz biz)
	{
		biz = ((biz) ((bkg)biz));
	//    0    0:aload_1         
	//    1    1:checkcast       #191 <Class bkg>
	//    2    4:astore_1        
		((bkg) (biz)).b();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #331 <Method void bkg.b()>
		j.remove(((bkg) (biz)).a);
	//    5    9:aload_0         
	//    6   10:getfield        #97  <Field SparseArray j>
	//    7   13:aload_1         
	//    8   14:getfield        #309 <Field int bkg.a>
	//    9   17:invokevirtual   #335 <Method void SparseArray.remove(int)>
	//   10   20:return          
	}

	final void a(bnc bnc1, long l1, long l2)
	{
		int i1;
		int j1;
		f.a(bnc1.a, bnc1.b, l1, l2, bnc1.e());
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field bif f>
	//    2    4:aload_1         
	//    3    5:getfield        #160 <Field bmp bnc.a>
	//    4    8:aload_1         
	//    5    9:getfield        #162 <Field int bnc.b>
	//    6   12:lload_2         
	//    7   13:lload           4
	//    8   15:aload_1         
	//    9   16:invokevirtual   #295 <Method long bnc.e()>
	//   10   19:invokevirtual   #339 <Method void bif.a(bmp, int, long, long, long)>
		bky bky1 = (bky)bnc1.d();
	//   11   22:aload_1         
	//   12   23:invokevirtual   #342 <Method Object bnc.d()>
	//   13   26:checkcast       #196 <Class bky>
	//   14   29:astore          10
		bky bky2 = t;
	//   15   31:aload_0         
	//   16   32:getfield        #69  <Field bky t>
	//   17   35:astore          11
		j1 = 0;
	//   18   37:iconst_0        
	//   19   38:istore          7
		if(bky2 == null)
	//*  20   40:aload           11
	//*  21   42:ifnonnull       51
			i1 = 0;
	//   22   45:iconst_0        
	//   23   46:istore          6
		else
	//*  24   48:goto            58
			i1 = bky2.a();
	//   25   51:aload           11
	//   26   53:invokevirtual   #198 <Method int bky.a()>
	//   27   56:istore          6
		for(long l3 = bky1.a(0).b; j1 < i1 && t.a(j1).b < l3; j1++);
	//   28   58:aload           10
	//   29   60:iconst_0        
	//   30   61:invokevirtual   #201 <Method blc bky.a(int)>
	//   31   64:getfield        #237 <Field long blc.b>
	//   32   67:lstore          8
	//   33   69:iload           7
	//   34   71:iload           6
	//   35   73:icmpge          103
	//   36   76:aload_0         
	//   37   77:getfield        #69  <Field bky t>
	//   38   80:iload           7
	//   39   82:invokevirtual   #201 <Method blc bky.a(int)>
	//   40   85:getfield        #237 <Field long blc.b>
	//   41   88:lload           8
	//   42   90:lcmp            
	//   43   91:ifge            103
	//   44   94:iload           7
	//   45   96:iconst_1        
	//   46   97:iadd            
	//   47   98:istore          7
	//*  48  100:goto            69
		if(i1 - j1 > bky1.a())
	//*  49  103:iload           6
	//*  50  105:iload           7
	//*  51  107:isub            
	//*  52  108:aload           10
	//*  53  110:invokevirtual   #198 <Method int bky.a()>
	//*  54  113:icmple          130
		{
			Log.w("DashMediaSource", "Out of sync manifest");
	//   55  116:ldc1            #168 <String "DashMediaSource">
	//   56  118:ldc2            #344 <String "Out of sync manifest">
	//   57  121:invokestatic    #347 <Method int Log.w(String, String)>
	//   58  124:pop             
			d();
	//   59  125:aload_0         
	//   60  126:invokespecial   #287 <Method void d()>
			return;
	//   61  129:return          
		}
		t = bky1;
	//   62  130:aload_0         
	//   63  131:aload           10
	//   64  133:putfield        #69  <Field bky t>
		r = l1 - l2;
	//   65  136:aload_0         
	//   66  137:lload_2         
	//   67  138:lload           4
	//   68  140:lsub            
	//   69  141:putfield        #290 <Field long r>
		s = l1;
	//   70  144:aload_0         
	//   71  145:lload_2         
	//   72  146:putfield        #349 <Field long s>
		if(t.g != null)
	//*  73  149:aload_0         
	//*  74  150:getfield        #69  <Field bky t>
	//*  75  153:getfield        #351 <Field Uri bky.g>
	//*  76  156:ifnull          205
			synchronized(i)
	//*  77  159:aload_0         
	//*  78  160:getfield        #92  <Field Object i>
	//*  79  163:astore          10
	//*  80  165:aload           10
	//*  81  167:monitorenter    
			{
				if(bnc1.a.a == q)
	//*  82  168:aload_1         
	//*  83  169:getfield        #160 <Field bmp bnc.a>
	//*  84  172:getfield        #355 <Field Uri bmp.a>
	//*  85  175:aload_0         
	//*  86  176:getfield        #71  <Field Uri q>
	//*  87  179:if_acmpne       193
					q = t.g;
	//   88  182:aload_0         
	//   89  183:aload_0         
	//   90  184:getfield        #69  <Field bky t>
	//   91  187:getfield        #351 <Field Uri bky.g>
	//   92  190:putfield        #71  <Field Uri q>
			}
	//   93  193:aload           10
	//   94  195:monitorexit     
		break MISSING_BLOCK_LABEL_205;
	//   95  196:goto            205
		bnc1;
	//   96  199:astore_1        
		obj;
	//   97  200:aload           10
		JVM INSTR monitorexit ;
	//   98  202:monitorexit     
		throw bnc1;
	//   99  203:aload_1         
	//  100  204:athrow          
		if(i1 == 0)
	//* 101  205:iload           6
	//* 102  207:ifne            382
		{
			if(t.f != null)
	//* 103  210:aload_0         
	//* 104  211:getfield        #69  <Field bky t>
	//* 105  214:getfield        #358 <Field blr bky.f>
	//* 106  217:ifnull          376
			{
				bnc1 = ((bnc) (t.f));
	//  107  220:aload_0         
	//  108  221:getfield        #69  <Field bky t>
	//  109  224:getfield        #358 <Field blr bky.f>
	//  110  227:astore_1        
				String s1 = ((blr) (bnc1)).a;
	//  111  228:aload_1         
	//  112  229:getfield        #360 <Field String blr.a>
	//  113  232:astore          10
				if(!bnw.a(((Object) (s1)), "urn:mpeg:dash:utc:direct:2014") && !bnw.a(((Object) (s1)), "urn:mpeg:dash:utc:direct:2012"))
	//* 114  234:aload           10
	//* 115  236:ldc2            #362 <String "urn:mpeg:dash:utc:direct:2014">
	//* 116  239:invokestatic    #367 <Method boolean bnw.a(Object, Object)>
	//* 117  242:ifne            352
	//* 118  245:aload           10
	//* 119  247:ldc2            #369 <String "urn:mpeg:dash:utc:direct:2012">
	//* 120  250:invokestatic    #367 <Method boolean bnw.a(Object, Object)>
	//* 121  253:ifeq            259
	//* 122  256:goto            352
					if(!bnw.a(((Object) (s1)), "urn:mpeg:dash:utc:http-iso:2014") && !bnw.a(((Object) (s1)), "urn:mpeg:dash:utc:http-iso:2012"))
	//* 123  259:aload           10
	//* 124  261:ldc2            #371 <String "urn:mpeg:dash:utc:http-iso:2014">
	//* 125  264:invokestatic    #367 <Method boolean bnw.a(Object, Object)>
	//* 126  267:ifne            338
	//* 127  270:aload           10
	//* 128  272:ldc2            #373 <String "urn:mpeg:dash:utc:http-iso:2012">
	//* 129  275:invokestatic    #367 <Method boolean bnw.a(Object, Object)>
	//* 130  278:ifeq            284
	//* 131  281:goto            338
					{
						if(!bnw.a(((Object) (s1)), "urn:mpeg:dash:utc:http-xsdate:2014") && !bnw.a(((Object) (s1)), "urn:mpeg:dash:utc:http-xsdate:2012"))
	//* 132  284:aload           10
	//* 133  286:ldc2            #375 <String "urn:mpeg:dash:utc:http-xsdate:2014">
	//* 134  289:invokestatic    #367 <Method boolean bnw.a(Object, Object)>
	//* 135  292:ifne            324
	//* 136  295:aload           10
	//* 137  297:ldc2            #377 <String "urn:mpeg:dash:utc:http-xsdate:2012">
	//* 138  300:invokestatic    #367 <Method boolean bnw.a(Object, Object)>
	//* 139  303:ifeq            309
	//* 140  306:goto            324
						{
							a(new IOException("Unsupported UTC timing scheme"));
	//  141  309:aload_0         
	//  142  310:new             #379 <Class IOException>
	//  143  313:dup             
	//  144  314:ldc2            #381 <String "Unsupported UTC timing scheme">
	//  145  317:invokespecial   #382 <Method void IOException(String)>
	//  146  320:invokespecial   #384 <Method void a(IOException)>
							return;
	//  147  323:return          
						} else
						{
							a(((blr) (bnc1)), ((bnd) (new bkr(((bkj) (null))))));
	//  148  324:aload_0         
	//  149  325:aload_1         
	//  150  326:new             #386 <Class bkr>
	//  151  329:dup             
	//  152  330:aconst_null     
	//  153  331:invokespecial   #389 <Method void bkr(bkj)>
	//  154  334:invokespecial   #391 <Method void a(blr, bnd)>
							return;
	//  155  337:return          
						}
					} else
					{
						a(((blr) (bnc1)), ((bnd) (new bkm(((bkj) (null))))));
	//  156  338:aload_0         
	//  157  339:aload_1         
	//  158  340:new             #393 <Class bkm>
	//  159  343:dup             
	//  160  344:aconst_null     
	//  161  345:invokespecial   #394 <Method void bkm(bkj)>
	//  162  348:invokespecial   #391 <Method void a(blr, bnd)>
						return;
	//  163  351:return          
					}
				try
				{
					a(bnw.e(((blr) (bnc1)).b) - s);
	//  164  352:aload_0         
	//  165  353:aload_1         
	//  166  354:getfield        #135 <Field String blr.b>
	//  167  357:invokestatic    #397 <Method long bnw.e(String)>
	//  168  360:aload_0         
	//  169  361:getfield        #349 <Field long s>
	//  170  364:lsub            
	//  171  365:invokespecial   #399 <Method void a(long)>
					return;
	//  172  368:return          
				}
				// Misplaced declaration of an exception variable
				catch(bnc bnc1)
	//* 173  369:astore_1        
				{
					a(((IOException) (bnc1)));
	//  174  370:aload_0         
	//  175  371:aload_1         
	//  176  372:invokespecial   #384 <Method void a(IOException)>
				}
				return;
	//  177  375:return          
			} else
			{
				a(true);
	//  178  376:aload_0         
	//  179  377:iconst_1        
	//  180  378:invokespecial   #122 <Method void a(boolean)>
				return;
	//  181  381:return          
			}
		} else
		{
			w = w + j1;
	//  182  382:aload_0         
	//  183  383:aload_0         
	//  184  384:getfield        #185 <Field int w>
	//  185  387:iload           7
	//  186  389:iadd            
	//  187  390:putfield        #185 <Field int w>
			a(true);
	//  188  393:aload_0         
	//  189  394:iconst_1        
	//  190  395:invokespecial   #122 <Method void a(boolean)>
			return;
	//  191  398:return          
		}
	}

	final int b(bnc bnc1, long l1, long l2, IOException ioexception)
	{
		f.a(bnc1.a, bnc1.b, l1, l2, bnc1.e(), ioexception, true);
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field bif f>
	//    2    4:aload_1         
	//    3    5:getfield        #160 <Field bmp bnc.a>
	//    4    8:aload_1         
	//    5    9:getfield        #162 <Field int bnc.b>
	//    6   12:lload_2         
	//    7   13:lload           4
	//    8   15:aload_1         
	//    9   16:invokevirtual   #295 <Method long bnc.e()>
	//   10   19:aload           6
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #298 <Method void bif.a(bmp, int, long, long, long, IOException, boolean)>
		a(ioexception);
	//   13   25:aload_0         
	//   14   26:aload           6
	//   15   28:invokespecial   #384 <Method void a(IOException)>
		return 2;
	//   16   31:iconst_2        
	//   17   32:ireturn         
	}

	public final void b()
	{
		n = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #130 <Field bml n>
		p = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #304 <Field bnb p>
		Object obj = ((Object) (o));
	//    6   10:aload_0         
	//    7   11:getfield        #152 <Field bmw o>
	//    8   14:astore_1        
		if(obj != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          29
		{
			((bmw) (obj)).a(((Runnable) (null)));
	//   11   19:aload_1         
	//   12   20:aconst_null     
	//   13   21:invokevirtual   #401 <Method void bmw.a(Runnable)>
			o = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #152 <Field bmw o>
		}
		r = 0L;
	//   17   29:aload_0         
	//   18   30:lconst_0        
	//   19   31:putfield        #290 <Field long r>
		s = 0L;
	//   20   34:aload_0         
	//   21   35:lconst_0        
	//   22   36:putfield        #349 <Field long s>
		t = null;
	//   23   39:aload_0         
	//   24   40:aconst_null     
	//   25   41:putfield        #69  <Field bky t>
		obj = ((Object) (u));
	//   26   44:aload_0         
	//   27   45:getfield        #273 <Field Handler u>
	//   28   48:astore_1        
		if(obj != null)
	//*  29   49:aload_1         
	//*  30   50:ifnull          63
		{
			((Handler) (obj)).removeCallbacksAndMessages(((Object) (null)));
	//   31   53:aload_1         
	//   32   54:aconst_null     
	//   33   55:invokevirtual   #405 <Method void Handler.removeCallbacksAndMessages(Object)>
			u = null;
	//   34   58:aload_0         
	//   35   59:aconst_null     
	//   36   60:putfield        #273 <Field Handler u>
		}
		v = 0L;
	//   37   63:aload_0         
	//   38   64:lconst_0        
	//   39   65:putfield        #119 <Field long v>
		j.clear();
	//   40   68:aload_0         
	//   41   69:getfield        #97  <Field SparseArray j>
	//   42   72:invokevirtual   #408 <Method void SparseArray.clear()>
	//   43   75:return          
	}

	final void b(bnc bnc1, long l1, long l2)
	{
		f.a(bnc1.a, bnc1.b, l1, l2, bnc1.e());
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field bif f>
	//    2    4:aload_1         
	//    3    5:getfield        #160 <Field bmp bnc.a>
	//    4    8:aload_1         
	//    5    9:getfield        #162 <Field int bnc.b>
	//    6   12:lload_2         
	//    7   13:lload           4
	//    8   15:aload_1         
	//    9   16:invokevirtual   #295 <Method long bnc.e()>
	//   10   19:invokevirtual   #339 <Method void bif.a(bmp, int, long, long, long)>
		a(((Long)bnc1.d()).longValue() - l1);
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #342 <Method Object bnc.d()>
	//   14   27:checkcast       #410 <Class Long>
	//   15   30:invokevirtual   #413 <Method long Long.longValue()>
	//   16   33:lload_2         
	//   17   34:lsub            
	//   18   35:invokespecial   #399 <Method void a(long)>
	//   19   38:return          
	}

	final void c(bnc bnc1, long l1, long l2)
	{
		f.b(bnc1.a, bnc1.b, l1, l2, bnc1.e());
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field bif f>
	//    2    4:aload_1         
	//    3    5:getfield        #160 <Field bmp bnc.a>
	//    4    8:aload_1         
	//    5    9:getfield        #162 <Field int bnc.b>
	//    6   12:lload_2         
	//    7   13:lload           4
	//    8   15:aload_1         
	//    9   16:invokevirtual   #295 <Method long bnc.e()>
	//   10   19:invokevirtual   #415 <Method void bif.b(bmp, int, long, long, long)>
	//   11   22:return          
	}

	private final boolean a;
	private final bmm b;
	private final bkf c;
	private final int d;
	private final long e;
	private final bif f;
	private final bnd g;
	private final bkn h;
	private final Object i;
	private final SparseArray j;
	private final Runnable k;
	private final Runnable l;
	private bjc m;
	private bml n;
	private bmw o;
	private bnb p;
	private Uri q;
	private long r;
	private long s;
	private bky t;
	private Handler u;
	private long v;
	private int w;
}
