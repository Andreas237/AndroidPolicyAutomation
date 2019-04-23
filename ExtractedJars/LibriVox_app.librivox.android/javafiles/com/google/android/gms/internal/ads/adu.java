// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.k;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bml, bne, bmp, zzty, 
//			p, bwk, m, bsd, 
//			adv, wx, brj, zztv

public final class adu
	implements bml
{

	public adu(Context context, bml bml1, bne bne1, adv adv1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		c = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field Context c>
		d = bml1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field bml d>
		e = bne1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #32  <Field bne e>
		f = adv1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #34  <Field adv f>
	//   14   25:return          
	}

	public final int a(byte abyte0[], int i, int j)
	{
		if(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field boolean b>
	//*   2    4:ifeq            62
		{
			InputStream inputstream = a;
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field InputStream a>
	//    5   11:astore          4
			if(inputstream != null)
	//*   6   13:aload           4
	//*   7   15:ifnull          30
				i = inputstream.read(abyte0, i, j);
	//    8   18:aload           4
	//    9   20:aload_1         
	//   10   21:iload_2         
	//   11   22:iload_3         
	//   12   23:invokevirtual   #45  <Method int InputStream.read(byte[], int, int)>
	//   13   26:istore_2        
			else
	//*  14   27:goto            43
				i = d.a(abyte0, i, j);
	//   15   30:aload_0         
	//   16   31:getfield        #30  <Field bml d>
	//   17   34:aload_1         
	//   18   35:iload_2         
	//   19   36:iload_3         
	//   20   37:invokeinterface #47  <Method int bml.a(byte[], int, int)>
	//   21   42:istore_2        
			abyte0 = ((byte []) (e));
	//   22   43:aload_0         
	//   23   44:getfield        #32  <Field bne e>
	//   24   47:astore_1        
			if(abyte0 != null)
	//*  25   48:aload_1         
	//*  26   49:ifnull          60
				((bne) (abyte0)).a(((Object) (this)), i);
	//   27   52:aload_1         
	//   28   53:aload_0         
	//   29   54:iload_2         
	//   30   55:invokeinterface #52  <Method void bne.a(Object, int)>
			return i;
	//   31   60:iload_2         
	//   32   61:ireturn         
		} else
		{
			throw new IOException("Attempt to read closed CacheDataSource.");
	//   33   62:new             #54  <Class IOException>
	//   34   65:dup             
	//   35   66:ldc1            #56  <String "Attempt to read closed CacheDataSource.">
	//   36   68:invokespecial   #59  <Method void IOException(String)>
	//   37   71:athrow          
		}
	}

	public final long a(bmp bmp1)
	{
		if(b) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field boolean b>
	//    2    4:ifne            590
_L1:
		Object obj;
		zzty zzty1;
		b = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #38  <Field boolean b>
		g = bmp1.a;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #70  <Field Uri bmp.a>
	//    9   17:putfield        #72  <Field Uri g>
		obj = ((Object) (e));
	//   10   20:aload_0         
	//   11   21:getfield        #32  <Field bne e>
	//   12   24:astore          6
		if(obj != null)
	//*  13   26:aload           6
	//*  14   28:ifnull          40
			((bne) (obj)).a(((Object) (this)), bmp1);
	//   15   31:aload           6
	//   16   33:aload_0         
	//   17   34:aload_1         
	//   18   35:invokeinterface #75  <Method void bne.a(Object, bmp)>
		zzty1 = zzty.a(bmp1.a);
	//   19   40:aload_1         
	//   20   41:getfield        #70  <Field Uri bmp.a>
	//   21   44:invokestatic    #80  <Method zzty zzty.a(Uri)>
	//   22   47:astore          7
		obj = ((Object) (p.ca));
	//   23   49:getstatic       #86  <Field com.google.android.gms.internal.ads.e p.ca>
	//   24   52:astore          6
		if(!((Boolean)com.google.android.gms.internal.ads.bwk.e().a(((com.google.android.gms.internal.ads.e) (obj)))).booleanValue()) goto _L4; else goto _L3
	//   25   54:invokestatic    #91  <Method m com.google.android.gms.internal.ads.bwk.e()>
	//   26   57:aload           6
	//   27   59:invokevirtual   #96  <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//   28   62:checkcast       #98  <Class Boolean>
	//   29   65:invokevirtual   #102 <Method boolean Boolean.booleanValue()>
	//   30   68:ifeq            476
_L3:
		if(zzty1 == null) goto _L6; else goto _L5
	//   31   71:aload           7
	//   32   73:ifnull          529
_L5:
		long l;
		long l5;
		zzty1.c = bmp1.d;
	//   33   76:aload           7
	//   34   78:aload_1         
	//   35   79:getfield        #105 <Field long bmp.d>
	//   36   82:putfield        #107 <Field long zzty.c>
		if(zzty1.b)
	//*  37   85:aload           7
	//*  38   87:getfield        #108 <Field boolean zzty.b>
	//*  39   90:ifeq            114
		{
			obj = ((Object) (p.cc));
	//   40   93:getstatic       #111 <Field com.google.android.gms.internal.ads.e p.cc>
	//   41   96:astore          6
			obj = ((Object) ((Long)com.google.android.gms.internal.ads.bwk.e().a(((com.google.android.gms.internal.ads.e) (obj)))));
	//   42   98:invokestatic    #91  <Method m com.google.android.gms.internal.ads.bwk.e()>
	//   43  101:aload           6
	//   44  103:invokevirtual   #96  <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//   45  106:checkcast       #113 <Class Long>
	//   46  109:astore          6
		} else
	//*  47  111:goto            132
		{
			obj = ((Object) (p.cb));
	//   48  114:getstatic       #116 <Field com.google.android.gms.internal.ads.e p.cb>
	//   49  117:astore          6
			obj = ((Object) ((Long)com.google.android.gms.internal.ads.bwk.e().a(((com.google.android.gms.internal.ads.e) (obj)))));
	//   50  119:invokestatic    #91  <Method m com.google.android.gms.internal.ads.bwk.e()>
	//   51  122:aload           6
	//   52  124:invokevirtual   #96  <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//   53  127:checkcast       #113 <Class Long>
	//   54  130:astore          6
		}
		l = ((Long) (obj)).longValue();
	//   55  132:aload           6
	//   56  134:invokevirtual   #120 <Method long Long.longValue()>
	//   57  137:lstore_2        
		l5 = aw.l().b();
	//   58  138:invokestatic    #126 <Method e aw.l()>
	//   59  141:invokeinterface #130 <Method long e.b()>
	//   60  146:lstore          4
		aw.A();
	//   61  148:invokestatic    #134 <Method bsd aw.A()>
	//   62  151:pop             
		obj = ((Object) (bsd.a(c, zzty1)));
	//   63  152:aload_0         
	//   64  153:getfield        #28  <Field Context c>
	//   65  156:aload           7
	//   66  158:invokestatic    #139 <Method Future bsd.a(Context, zzty)>
	//   67  161:astore          6
		a = (InputStream)((Future) (obj)).get(l, TimeUnit.MILLISECONDS);
	//   68  163:aload_0         
	//   69  164:aload           6
	//   70  166:lload_2         
	//   71  167:getstatic       #145 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   72  170:invokeinterface #151 <Method Object Future.get(long, TimeUnit)>
	//   73  175:checkcast       #42  <Class InputStream>
	//   74  178:putfield        #40  <Field InputStream a>
		long l1 = aw.l().b() - l5;
	//   75  181:invokestatic    #126 <Method e aw.l()>
	//   76  184:invokeinterface #130 <Method long e.b()>
	//   77  189:lload           4
	//   78  191:lsub            
	//   79  192:lstore_2        
		f.a(true, l1);
	//   80  193:aload_0         
	//   81  194:getfield        #34  <Field adv f>
	//   82  197:iconst_1        
	//   83  198:lload_2         
	//   84  199:invokeinterface #156 <Method void adv.a(boolean, long)>
		bmp1 = ((bmp) (new StringBuilder(44)));
	//   85  204:new             #158 <Class StringBuilder>
	//   86  207:dup             
	//   87  208:bipush          44
	//   88  210:invokespecial   #161 <Method void StringBuilder(int)>
	//   89  213:astore_1        
		((StringBuilder) (bmp1)).append("Cache connection took ");
	//   90  214:aload_1         
	//   91  215:ldc1            #163 <String "Cache connection took ">
	//   92  217:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   93  220:pop             
		((StringBuilder) (bmp1)).append(l1);
	//   94  221:aload_1         
	//   95  222:lload_2         
	//   96  223:invokevirtual   #170 <Method StringBuilder StringBuilder.append(long)>
	//   97  226:pop             
		((StringBuilder) (bmp1)).append("ms");
	//   98  227:aload_1         
	//   99  228:ldc1            #172 <String "ms">
	//  100  230:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  101  233:pop             
		wx.a(((StringBuilder) (bmp1)).toString());
	//  102  234:aload_1         
	//  103  235:invokevirtual   #176 <Method String StringBuilder.toString()>
	//  104  238:invokestatic    #180 <Method void wx.a(String)>
		return -1L;
	//  105  241:ldc2w           #181 <Long -1L>
	//  106  244:lreturn         
		bmp1;
	//  107  245:astore_1        
		  goto _L7
	//* 108  246:goto            409
_L11:
		((Future) (obj)).cancel(true);
	//  109  249:aload           6
	//  110  251:iconst_1        
	//  111  252:invokeinterface #186 <Method boolean Future.cancel(boolean)>
	//  112  257:pop             
		Thread.currentThread().interrupt();
	//  113  258:invokestatic    #192 <Method Thread Thread.currentThread()>
	//  114  261:invokevirtual   #195 <Method void Thread.interrupt()>
		long l2 = aw.l().b() - l5;
	//  115  264:invokestatic    #126 <Method e aw.l()>
	//  116  267:invokeinterface #130 <Method long e.b()>
	//  117  272:lload           4
	//  118  274:lsub            
	//  119  275:lstore_2        
		f.a(false, l2);
	//  120  276:aload_0         
	//  121  277:getfield        #34  <Field adv f>
	//  122  280:iconst_0        
	//  123  281:lload_2         
	//  124  282:invokeinterface #156 <Method void adv.a(boolean, long)>
		obj = ((Object) (new StringBuilder(44)));
	//  125  287:new             #158 <Class StringBuilder>
	//  126  290:dup             
	//  127  291:bipush          44
	//  128  293:invokespecial   #161 <Method void StringBuilder(int)>
	//  129  296:astore          6
		((StringBuilder) (obj)).append("Cache connection took ");
	//  130  298:aload           6
	//  131  300:ldc1            #163 <String "Cache connection took ">
	//  132  302:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  133  305:pop             
		((StringBuilder) (obj)).append(l2);
	//  134  306:aload           6
	//  135  308:lload_2         
	//  136  309:invokevirtual   #170 <Method StringBuilder StringBuilder.append(long)>
	//  137  312:pop             
		((StringBuilder) (obj)).append("ms");
	//  138  313:aload           6
	//  139  315:ldc1            #172 <String "ms">
	//  140  317:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  141  320:pop             
		wx.a(((StringBuilder) (obj)).toString());
	//  142  321:aload           6
	//  143  323:invokevirtual   #176 <Method String StringBuilder.toString()>
	//  144  326:invokestatic    #180 <Method void wx.a(String)>
		  goto _L6
	//* 145  329:goto            529
_L9:
		((Future) (obj)).cancel(true);
	//  146  332:aload           6
	//  147  334:iconst_1        
	//  148  335:invokeinterface #186 <Method boolean Future.cancel(boolean)>
	//  149  340:pop             
		long l3 = aw.l().b() - l5;
	//  150  341:invokestatic    #126 <Method e aw.l()>
	//  151  344:invokeinterface #130 <Method long e.b()>
	//  152  349:lload           4
	//  153  351:lsub            
	//  154  352:lstore_2        
		f.a(false, l3);
	//  155  353:aload_0         
	//  156  354:getfield        #34  <Field adv f>
	//  157  357:iconst_0        
	//  158  358:lload_2         
	//  159  359:invokeinterface #156 <Method void adv.a(boolean, long)>
		StringBuilder stringbuilder = new StringBuilder(44);
	//  160  364:new             #158 <Class StringBuilder>
	//  161  367:dup             
	//  162  368:bipush          44
	//  163  370:invokespecial   #161 <Method void StringBuilder(int)>
	//  164  373:astore          6
		stringbuilder.append("Cache connection took ");
	//  165  375:aload           6
	//  166  377:ldc1            #163 <String "Cache connection took ">
	//  167  379:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  168  382:pop             
		stringbuilder.append(l3);
	//  169  383:aload           6
	//  170  385:lload_2         
	//  171  386:invokevirtual   #170 <Method StringBuilder StringBuilder.append(long)>
	//  172  389:pop             
		stringbuilder.append("ms");
	//  173  390:aload           6
	//  174  392:ldc1            #172 <String "ms">
	//  175  394:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  176  397:pop             
		wx.a(stringbuilder.toString());
	//  177  398:aload           6
	//  178  400:invokevirtual   #176 <Method String StringBuilder.toString()>
	//  179  403:invokestatic    #180 <Method void wx.a(String)>
		  goto _L6
	//* 180  406:goto            529
_L7:
		long l4 = aw.l().b() - l5;
	//  181  409:invokestatic    #126 <Method e aw.l()>
	//  182  412:invokeinterface #130 <Method long e.b()>
	//  183  417:lload           4
	//  184  419:lsub            
	//  185  420:lstore_2        
		f.a(false, l4);
	//  186  421:aload_0         
	//  187  422:getfield        #34  <Field adv f>
	//  188  425:iconst_0        
	//  189  426:lload_2         
	//  190  427:invokeinterface #156 <Method void adv.a(boolean, long)>
		StringBuilder stringbuilder1 = new StringBuilder(44);
	//  191  432:new             #158 <Class StringBuilder>
	//  192  435:dup             
	//  193  436:bipush          44
	//  194  438:invokespecial   #161 <Method void StringBuilder(int)>
	//  195  441:astore          6
		stringbuilder1.append("Cache connection took ");
	//  196  443:aload           6
	//  197  445:ldc1            #163 <String "Cache connection took ">
	//  198  447:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  199  450:pop             
		stringbuilder1.append(l4);
	//  200  451:aload           6
	//  201  453:lload_2         
	//  202  454:invokevirtual   #170 <Method StringBuilder StringBuilder.append(long)>
	//  203  457:pop             
		stringbuilder1.append("ms");
	//  204  458:aload           6
	//  205  460:ldc1            #172 <String "ms">
	//  206  462:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  207  465:pop             
		wx.a(stringbuilder1.toString());
	//  208  466:aload           6
	//  209  468:invokevirtual   #176 <Method String StringBuilder.toString()>
	//  210  471:invokestatic    #180 <Method void wx.a(String)>
		throw bmp1;
	//  211  474:aload_1         
	//  212  475:athrow          
_L4:
		zztv zztv1 = null;
	//  213  476:aconst_null     
	//  214  477:astore          6
		if(zzty1 != null)
	//* 215  479:aload           7
	//* 216  481:ifnull          503
		{
			zzty1.c = bmp1.d;
	//  217  484:aload           7
	//  218  486:aload_1         
	//  219  487:getfield        #105 <Field long bmp.d>
	//  220  490:putfield        #107 <Field long zzty.c>
			zztv1 = aw.k().a(zzty1);
	//  221  493:invokestatic    #199 <Method brj aw.k()>
	//  222  496:aload           7
	//  223  498:invokevirtual   #204 <Method zztv brj.a(zzty)>
	//  224  501:astore          6
		}
		if(zztv1 != null && zztv1.a())
	//* 225  503:aload           6
	//* 226  505:ifnull          529
	//* 227  508:aload           6
	//* 228  510:invokevirtual   #208 <Method boolean zztv.a()>
	//* 229  513:ifeq            529
		{
			a = zztv1.b();
	//  230  516:aload_0         
	//  231  517:aload           6
	//  232  519:invokevirtual   #211 <Method InputStream zztv.b()>
	//  233  522:putfield        #40  <Field InputStream a>
			return -1L;
	//  234  525:ldc2w           #181 <Long -1L>
	//  235  528:lreturn         
		}
_L6:
		bmp bmp2 = bmp1;
	//  236  529:aload_1         
	//  237  530:astore          6
		if(zzty1 != null)
	//* 238  532:aload           7
	//* 239  534:ifnull          578
			bmp2 = new bmp(Uri.parse(zzty1.a), bmp1.b, bmp1.c, bmp1.d, bmp1.e, bmp1.f, bmp1.g);
	//  240  537:new             #68  <Class bmp>
	//  241  540:dup             
	//  242  541:aload           7
	//  243  543:getfield        #214 <Field String zzty.a>
	//  244  546:invokestatic    #220 <Method Uri Uri.parse(String)>
	//  245  549:aload_1         
	//  246  550:getfield        #223 <Field byte[] bmp.b>
	//  247  553:aload_1         
	//  248  554:getfield        #224 <Field long bmp.c>
	//  249  557:aload_1         
	//  250  558:getfield        #105 <Field long bmp.d>
	//  251  561:aload_1         
	//  252  562:getfield        #226 <Field long com.google.android.gms.internal.ads.bmp.e>
	//  253  565:aload_1         
	//  254  566:getfield        #228 <Field String bmp.f>
	//  255  569:aload_1         
	//  256  570:getfield        #231 <Field int bmp.g>
	//  257  573:invokespecial   #234 <Method void bmp(Uri, byte[], long, long, long, String, int)>
	//  258  576:astore          6
		return d.a(bmp2);
	//  259  578:aload_0         
	//  260  579:getfield        #30  <Field bml d>
	//  261  582:aload           6
	//  262  584:invokeinterface #236 <Method long bml.a(bmp)>
	//  263  589:lreturn         
_L2:
		throw new IOException("Attempt to open an already open CacheDataSource.");
	//  264  590:new             #54  <Class IOException>
	//  265  593:dup             
	//  266  594:ldc1            #238 <String "Attempt to open an already open CacheDataSource.">
	//  267  596:invokespecial   #59  <Method void IOException(String)>
	//  268  599:athrow          
		Object obj1;
		obj1;
	//  269  600:astore          8
		if(true) goto _L9; else goto _L8
	//  270  602:goto            332
_L8:
		obj1;
	//  271  605:astore          8
		if(true) goto _L11; else goto _L10
	//  272  607:goto            249
_L10:
	}

	public final void a()
	{
		if(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field boolean b>
	//*   2    4:ifeq            64
		{
			b = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #38  <Field boolean b>
			g = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #72  <Field Uri g>
			Object obj = ((Object) (a));
	//    9   17:aload_0         
	//   10   18:getfield        #40  <Field InputStream a>
	//   11   21:astore_1        
			if(obj != null)
	//*  12   22:aload_1         
	//*  13   23:ifnull          38
			{
				k.a(((java.io.Closeable) (obj)));
	//   14   26:aload_1         
	//   15   27:invokestatic    #243 <Method void k.a(java.io.Closeable)>
				a = null;
	//   16   30:aload_0         
	//   17   31:aconst_null     
	//   18   32:putfield        #40  <Field InputStream a>
			} else
	//*  19   35:goto            47
			{
				d.a();
	//   20   38:aload_0         
	//   21   39:getfield        #30  <Field bml d>
	//   22   42:invokeinterface #245 <Method void bml.a()>
			}
			obj = ((Object) (e));
	//   23   47:aload_0         
	//   24   48:getfield        #32  <Field bne e>
	//   25   51:astore_1        
			if(obj != null)
	//*  26   52:aload_1         
	//*  27   53:ifnull          63
				((bne) (obj)).a(((Object) (this)));
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:invokeinterface #248 <Method void bne.a(Object)>
			return;
	//   31   63:return          
		} else
		{
			throw new IOException("Attempt to close an already closed CacheDataSource.");
	//   32   64:new             #54  <Class IOException>
	//   33   67:dup             
	//   34   68:ldc1            #250 <String "Attempt to close an already closed CacheDataSource.">
	//   35   70:invokespecial   #59  <Method void IOException(String)>
	//   36   73:athrow          
		}
	}

	public final Uri b()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Uri g>
	//    2    4:areturn         
	}

	private InputStream a;
	private boolean b;
	private final Context c;
	private final bml d;
	private final bne e;
	private final adv f;
	private Uri g;
}
