// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.util.e;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aeq, bne, afa, aei, 
//			adx, bml, bms, adc, 
//			adu, bmp, add, p, 
//			bwk, m, wx

public final class afb extends aeq
	implements bne
{

	public afb(add add1, adc adc1)
	{
		super(add1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void aeq(add)>
		e = adc1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #30  <Field adc e>
	//    6   10:aload_0         
	//    7   11:new             #32  <Class afa>
	//    8   14:dup             
	//    9   15:invokespecial   #35  <Method void afa()>
	//   10   18:putfield        #37  <Field afa g>
	//   11   21:aload_0         
	//   12   22:new             #39  <Class aei>
	//   13   25:dup             
	//   14   26:invokespecial   #40  <Method void aei()>
	//   15   29:putfield        #42  <Field aei h>
	//   16   32:aload_0         
	//   17   33:new             #44  <Class Object>
	//   18   36:dup             
	//   19   37:invokespecial   #45  <Method void Object()>
	//   20   40:putfield        #47  <Field Object k>
	//   21   43:return          
	}

	private final void f()
	{
		int j1 = (int)g.a();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field afa g>
	//    2    4:invokevirtual   #52  <Method long afa.a()>
	//    3    7:l2i             
	//    4    8:istore_2        
		int i1 = (int)h.a(i);
	//    5    9:aload_0         
	//    6   10:getfield        #42  <Field aei h>
	//    7   13:aload_0         
	//    8   14:getfield        #54  <Field ByteBuffer i>
	//    9   17:invokevirtual   #57  <Method long aei.a(ByteBuffer)>
	//   10   20:l2i             
	//   11   21:istore_1        
		j1 = Math.round((float)i1 * ((float)i.position() / (float)j1));
	//   12   22:iload_1         
	//   13   23:i2f             
	//   14   24:aload_0         
	//   15   25:getfield        #54  <Field ByteBuffer i>
	//   16   28:invokevirtual   #63  <Method int ByteBuffer.position()>
	//   17   31:i2f             
	//   18   32:iload_2         
	//   19   33:i2f             
	//   20   34:fdiv            
	//   21   35:fmul            
	//   22   36:invokestatic    #69  <Method int Math.round(float)>
	//   23   39:istore_2        
		boolean flag;
		if(j1 > 0)
	//*  24   40:iload_2         
	//*  25   41:ifle            50
			flag = true;
	//   26   44:iconst_1        
	//   27   45:istore          5
		else
	//*  28   47:goto            53
			flag = false;
	//   29   50:iconst_0        
	//   30   51:istore          5
		int k1 = adx.b();
	//   31   53:invokestatic    #74  <Method int adx.b()>
	//   32   56:istore_3        
		int l1 = adx.c();
	//   33   57:invokestatic    #77  <Method int adx.c()>
	//   34   60:istore          4
		String s = d;
	//   35   62:aload_0         
	//   36   63:getfield        #79  <Field String d>
	//   37   66:astore          6
		((aeq)this).a(s, ((aeq)this).b(s), j1, i1, flag, k1, l1);
	//   38   68:aload_0         
	//   39   69:aload           6
	//   40   71:aload_0         
	//   41   72:aload           6
	//   42   74:invokevirtual   #82  <Method String aeq.b(String)>
	//   43   77:iload_2         
	//   44   78:i2l             
	//   45   79:iload_1         
	//   46   80:i2l             
	//   47   81:iload           5
	//   48   83:iload_3         
	//   49   84:iload           4
	//   50   86:invokevirtual   #85  <Method void aeq.a(String, String, long, long, boolean, int, int)>
	//   51   89:return          
	}

	public final volatile void a(Object obj)
	{
	//    0    0:return          
	}

	public final volatile void a(Object obj, int i1)
	{
	//    0    0:return          
	}

	public final void a(Object obj, bmp bmp1)
	{
		obj = ((Object) ((bml)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #90  <Class bml>
	//    2    4:astore_1        
		if(obj instanceof bms)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #92  <Class bms>
	//*   5    9:ifeq            23
			g.a((bms)obj);
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field afa g>
	//    8   16:aload_1         
	//    9   17:checkcast       #92  <Class bms>
	//   10   20:invokevirtual   #95  <Method void afa.a(bms)>
	//   11   23:return          
	}

	public final boolean a(String s)
	{
		Object obj;
		Object obj1;
		String s1;
		d = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #79  <Field String d>
		s1 = ((aeq)this).b(s);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #82  <Method String aeq.b(String)>
	//    6   10:astore          20
		obj = "error";
	//    7   12:ldc1            #100 <String "error">
	//    8   14:astore          16
		obj1 = obj;
	//    9   16:aload           16
	//   10   18:astore          17
		Object obj4 = ((Object) (new bms(b, ((bnq) (null)), ((bne) (this)), e.d, e.f, true, ((bmv) (null)))));
	//   11   20:new             #92  <Class bms>
	//   12   23:dup             
	//   13   24:aload_0         
	//   14   25:getfield        #102 <Field String b>
	//   15   28:aconst_null     
	//   16   29:aload_0         
	//   17   30:aload_0         
	//   18   31:getfield        #30  <Field adc e>
	//   19   34:getfield        #107 <Field int adc.d>
	//   20   37:aload_0         
	//   21   38:getfield        #30  <Field adc e>
	//   22   41:getfield        #109 <Field int adc.f>
	//   23   44:iconst_1        
	//   24   45:aconst_null     
	//   25   46:invokespecial   #112 <Method void bms(String, bnq, bne, int, int, boolean, bmv)>
	//   26   49:astore          19
		obj1 = obj;
	//   27   51:aload           16
	//   28   53:astore          17
		boolean flag = e.i;
	//   29   55:aload_0         
	//   30   56:getfield        #30  <Field adc e>
	//   31   59:getfield        #114 <Field boolean adc.i>
	//   32   62:istore_3        
		Object obj2;
		obj2 = obj4;
	//   33   63:aload           19
	//   34   65:astore          18
		if(!flag)
			break MISSING_BLOCK_LABEL_100;
	//   35   67:iload_3         
	//   36   68:ifeq            100
		obj1 = obj;
	//   37   71:aload           16
	//   38   73:astore          17
		obj2 = ((Object) (new adu(a, ((bml) (obj4)), ((bne) (null)), ((adv) (null)))));
	//   39   75:new             #116 <Class adu>
	//   40   78:dup             
	//   41   79:aload_0         
	//   42   80:getfield        #119 <Field android.content.Context a>
	//   43   83:aload           19
	//   44   85:aconst_null     
	//   45   86:aconst_null     
	//   46   87:invokespecial   #122 <Method void adu(android.content.Context, bml, bne, adv)>
	//   47   90:astore          18
	//*  48   92:goto            100
	//*  49   95:astore          16
	//*  50   97:goto            658
		obj1 = obj;
	//   51  100:aload           16
	//   52  102:astore          17
		((bml) (obj2)).a(new bmp(Uri.parse(s)));
	//   53  104:aload           18
	//   54  106:new             #124 <Class bmp>
	//   55  109:dup             
	//   56  110:aload_1         
	//   57  111:invokestatic    #130 <Method Uri Uri.parse(String)>
	//   58  114:invokespecial   #133 <Method void bmp(Uri)>
	//   59  117:invokeinterface #136 <Method long bml.a(bmp)>
	//   60  122:pop2            
		obj1 = obj;
	//   61  123:aload           16
	//   62  125:astore          17
		obj4 = ((Object) ((add)c.get()));
	//   63  127:aload_0         
	//   64  128:getfield        #139 <Field WeakReference c>
	//   65  131:invokevirtual   #145 <Method Object WeakReference.get()>
	//   66  134:checkcast       #147 <Class add>
	//   67  137:astore          19
		if(obj4 == null)
			break MISSING_BLOCK_LABEL_158;
	//   68  139:aload           19
	//   69  141:ifnull          158
		obj1 = obj;
	//   70  144:aload           16
	//   71  146:astore          17
		((add) (obj4)).a(s1, ((aeq) (this)));
	//   72  148:aload           19
	//   73  150:aload           20
	//   74  152:aload_0         
	//   75  153:invokeinterface #150 <Method void add.a(String, aeq)>
		obj1 = obj;
	//   76  158:aload           16
	//   77  160:astore          17
		obj4 = ((Object) (aw.l()));
	//   78  162:invokestatic    #155 <Method e aw.l()>
	//   79  165:astore          19
		obj1 = obj;
	//   80  167:aload           16
	//   81  169:astore          17
		long l3 = ((e) (obj4)).a();
	//   82  171:aload           19
	//   83  173:invokeinterface #158 <Method long e.a()>
	//   84  178:lstore          8
		obj1 = obj;
	//   85  180:aload           16
	//   86  182:astore          17
		Object obj5 = ((Object) (p.r));
	//   87  184:getstatic       #164 <Field com.google.android.gms.internal.ads.e p.r>
	//   88  187:astore          21
		obj1 = obj;
	//   89  189:aload           16
	//   90  191:astore          17
		long l5 = ((Long)com.google.android.gms.internal.ads.bwk.e().a(((com.google.android.gms.internal.ads.e) (obj5)))).longValue();
	//   91  193:invokestatic    #169 <Method m com.google.android.gms.internal.ads.bwk.e()>
	//   92  196:aload           21
	//   93  198:invokevirtual   #174 <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//   94  201:checkcast       #176 <Class Long>
	//   95  204:invokevirtual   #179 <Method long Long.longValue()>
	//   96  207:lstore          12
		obj1 = obj;
	//   97  209:aload           16
	//   98  211:astore          17
		obj5 = ((Object) (p.q));
	//   99  213:getstatic       #182 <Field com.google.android.gms.internal.ads.e p.q>
	//  100  216:astore          21
		obj1 = obj;
	//  101  218:aload           16
	//  102  220:astore          17
		long l6 = ((Long)com.google.android.gms.internal.ads.bwk.e().a(((com.google.android.gms.internal.ads.e) (obj5)))).longValue();
	//  103  222:invokestatic    #169 <Method m com.google.android.gms.internal.ads.bwk.e()>
	//  104  225:aload           21
	//  105  227:invokevirtual   #174 <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//  106  230:checkcast       #176 <Class Long>
	//  107  233:invokevirtual   #179 <Method long Long.longValue()>
	//  108  236:lstore          14
		obj1 = obj;
	//  109  238:aload           16
	//  110  240:astore          17
		i = ByteBuffer.allocate(e.c);
	//  111  242:aload_0         
	//  112  243:aload_0         
	//  113  244:getfield        #30  <Field adc e>
	//  114  247:getfield        #184 <Field int adc.c>
	//  115  250:invokestatic    #188 <Method ByteBuffer ByteBuffer.allocate(int)>
	//  116  253:putfield        #54  <Field ByteBuffer i>
		obj1 = obj;
	//  117  256:aload           16
	//  118  258:astore          17
		byte abyte0[] = new byte[8192];
	//  119  260:sipush          8192
	//  120  263:newarray        byte[]
	//  121  265:astore          22
		long l1 = l3;
	//  122  267:lload           8
	//  123  269:lstore          4
_L10:
		obj1 = obj;
	//  124  271:aload           16
	//  125  273:astore          17
		int i1 = ((bml) (obj2)).a(abyte0, 0, Math.min(i.remaining(), 8192));
	//  126  275:aload           18
	//  127  277:aload           22
	//  128  279:iconst_0        
	//  129  280:aload_0         
	//  130  281:getfield        #54  <Field ByteBuffer i>
	//  131  284:invokevirtual   #191 <Method int ByteBuffer.remaining()>
	//  132  287:sipush          8192
	//  133  290:invokestatic    #195 <Method int Math.min(int, int)>
	//  134  293:invokeinterface #198 <Method int bml.a(byte[], int, int)>
	//  135  298:istore_2        
		if(i1 != -1)
			break MISSING_BLOCK_LABEL_339;
	//  136  299:iload_2         
	//  137  300:iconst_m1       
	//  138  301:icmpne          339
		obj1 = obj;
	//  139  304:aload           16
	//  140  306:astore          17
		l = true;
	//  141  308:aload_0         
	//  142  309:iconst_1        
	//  143  310:putfield        #200 <Field boolean l>
		obj1 = obj;
	//  144  313:aload           16
	//  145  315:astore          17
		((aeq)this).a(s, s1, (int)h.a(i));
	//  146  317:aload_0         
	//  147  318:aload_1         
	//  148  319:aload           20
	//  149  321:aload_0         
	//  150  322:getfield        #42  <Field aei h>
	//  151  325:aload_0         
	//  152  326:getfield        #54  <Field ByteBuffer i>
	//  153  329:invokevirtual   #57  <Method long aei.a(ByteBuffer)>
	//  154  332:l2i             
	//  155  333:i2l             
	//  156  334:invokevirtual   #203 <Method void aeq.a(String, String, long)>
		return true;
	//  157  337:iconst_1        
	//  158  338:ireturn         
		obj1 = obj;
	//  159  339:aload           16
	//  160  341:astore          17
		obj5 = k;
	//  161  343:aload_0         
	//  162  344:getfield        #47  <Field Object k>
	//  163  347:astore          21
		obj1 = obj;
	//  164  349:aload           16
	//  165  351:astore          17
		obj5;
	//  166  353:aload           21
		JVM INSTR monitorenter ;
	//  167  355:monitorenter    
		ByteBuffer bytebuffer;
		if(f)
			break MISSING_BLOCK_LABEL_386;
	//  168  356:aload_0         
	//  169  357:getfield        #205 <Field boolean f>
	//  170  360:ifne            817
		bytebuffer = i;
	//  171  363:aload_0         
	//  172  364:getfield        #54  <Field ByteBuffer i>
	//  173  367:astore          23
		obj1 = obj;
	//  174  369:aload           16
	//  175  371:astore          17
		bytebuffer.put(abyte0, 0, i1);
	//  176  373:aload           23
	//  177  375:aload           22
	//  178  377:iconst_0        
	//  179  378:iload_2         
	//  180  379:invokevirtual   #209 <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//  181  382:pop             
	//* 182  383:goto            386
		obj1 = obj;
	//  183  386:aload           16
	//  184  388:astore          17
		obj5;
	//  185  390:aload           21
		JVM INSTR monitorexit ;
	//  186  392:monitorexit     
		obj1 = obj;
	//  187  393:aload           16
	//  188  395:astore          17
		if(i.remaining() > 0)
			break MISSING_BLOCK_LABEL_417;
	//  189  397:aload_0         
	//  190  398:getfield        #54  <Field ByteBuffer i>
	//  191  401:invokevirtual   #191 <Method int ByteBuffer.remaining()>
	//  192  404:ifgt            417
		obj1 = obj;
	//  193  407:aload           16
	//  194  409:astore          17
		f();
	//  195  411:aload_0         
	//  196  412:invokespecial   #211 <Method void f()>
		return true;
	//  197  415:iconst_1        
	//  198  416:ireturn         
		obj1 = obj;
	//  199  417:aload           16
	//  200  419:astore          17
		if(f) goto _L2; else goto _L1
	//  201  421:aload_0         
	//  202  422:getfield        #205 <Field boolean f>
	//  203  425:ifne            543
_L1:
		obj1 = obj;
	//  204  428:aload           16
	//  205  430:astore          17
		long l4 = ((e) (obj4)).a();
	//  206  432:aload           19
	//  207  434:invokeinterface #158 <Method long e.a()>
	//  208  439:lstore          10
		long l2 = l1;
	//  209  441:lload           4
	//  210  443:lstore          6
		if(l4 - l1 < l5) goto _L4; else goto _L3
	//  211  445:lload           10
	//  212  447:lload           4
	//  213  449:lsub            
	//  214  450:lload           12
	//  215  452:lcmp            
	//  216  453:iflt            820
_L3:
		obj1 = obj;
	//  217  456:aload           16
	//  218  458:astore          17
		f();
	//  219  460:aload_0         
	//  220  461:invokespecial   #211 <Method void f()>
		l2 = l4;
	//  221  464:lload           10
	//  222  466:lstore          6
		  goto _L4
	//* 223  468:goto            820
_L8:
		obj = "downloadTimeout";
	//  224  471:ldc1            #213 <String "downloadTimeout">
	//  225  473:astore          16
		obj1 = obj;
	//  226  475:aload           16
	//  227  477:astore          17
		obj2 = ((Object) (new StringBuilder(49)));
	//  228  479:new             #215 <Class StringBuilder>
	//  229  482:dup             
	//  230  483:bipush          49
	//  231  485:invokespecial   #218 <Method void StringBuilder(int)>
	//  232  488:astore          18
		obj1 = obj;
	//  233  490:aload           16
	//  234  492:astore          17
		((StringBuilder) (obj2)).append("Timeout exceeded. Limit: ");
	//  235  494:aload           18
	//  236  496:ldc1            #220 <String "Timeout exceeded. Limit: ">
	//  237  498:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//  238  501:pop             
		obj1 = obj;
	//  239  502:aload           16
	//  240  504:astore          17
		((StringBuilder) (obj2)).append(l6);
	//  241  506:aload           18
	//  242  508:lload           14
	//  243  510:invokevirtual   #227 <Method StringBuilder StringBuilder.append(long)>
	//  244  513:pop             
		obj1 = obj;
	//  245  514:aload           16
	//  246  516:astore          17
		((StringBuilder) (obj2)).append(" sec");
	//  247  518:aload           18
	//  248  520:ldc1            #229 <String " sec">
	//  249  522:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//  250  525:pop             
		obj1 = obj;
	//  251  526:aload           16
	//  252  528:astore          17
		try
		{
			throw new IOException(((StringBuilder) (obj2)).toString());
	//  253  530:new             #231 <Class IOException>
	//  254  533:dup             
	//  255  534:aload           18
	//  256  536:invokevirtual   #235 <Method String StringBuilder.toString()>
	//  257  539:invokespecial   #238 <Method void IOException(String)>
	//  258  542:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		  goto _L5
_L2:
		obj = "externalAbort";
	//  259  543:ldc1            #240 <String "externalAbort">
	//  260  545:astore          16
		obj1 = obj;
	//  261  547:aload           16
	//  262  549:astore          17
		i1 = i.limit();
	//  263  551:aload_0         
	//  264  552:getfield        #54  <Field ByteBuffer i>
	//  265  555:invokevirtual   #243 <Method int ByteBuffer.limit()>
	//  266  558:istore_2        
		obj1 = obj;
	//  267  559:aload           16
	//  268  561:astore          17
		obj2 = ((Object) (new StringBuilder(35)));
	//  269  563:new             #215 <Class StringBuilder>
	//  270  566:dup             
	//  271  567:bipush          35
	//  272  569:invokespecial   #218 <Method void StringBuilder(int)>
	//  273  572:astore          18
		obj1 = obj;
	//  274  574:aload           16
	//  275  576:astore          17
		((StringBuilder) (obj2)).append("Precache abort at ");
	//  276  578:aload           18
	//  277  580:ldc1            #245 <String "Precache abort at ">
	//  278  582:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//  279  585:pop             
		obj1 = obj;
	//  280  586:aload           16
	//  281  588:astore          17
		((StringBuilder) (obj2)).append(i1);
	//  282  590:aload           18
	//  283  592:iload_2         
	//  284  593:invokevirtual   #248 <Method StringBuilder StringBuilder.append(int)>
	//  285  596:pop             
		obj1 = obj;
	//  286  597:aload           16
	//  287  599:astore          17
		((StringBuilder) (obj2)).append(" bytes");
	//  288  601:aload           18
	//  289  603:ldc1            #250 <String " bytes">
	//  290  605:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//  291  608:pop             
		obj1 = obj;
	//  292  609:aload           16
	//  293  611:astore          17
		throw new IOException(((StringBuilder) (obj2)).toString());
	//  294  613:new             #231 <Class IOException>
	//  295  616:dup             
	//  296  617:aload           18
	//  297  619:invokevirtual   #235 <Method String StringBuilder.toString()>
	//  298  622:invokespecial   #238 <Method void IOException(String)>
	//  299  625:athrow          
		Exception exception1;
		exception1;
	//  300  626:astore          18
_L6:
		obj1 = obj;
	//  301  628:aload           16
	//  302  630:astore          17
		obj5;
	//  303  632:aload           21
		JVM INSTR monitorexit ;
	//  304  634:monitorexit     
		obj1 = obj;
	//  305  635:aload           16
	//  306  637:astore          17
		try
		{
			throw exception1;
	//  307  639:aload           18
	//  308  641:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//  309  642:astore          16
		break; /* Loop/switch isn't completed */
	//  310  644:goto            658
		exception1;
	//  311  647:astore          18
		obj = obj1;
	//  312  649:aload           17
	//  313  651:astore          16
		if(true) goto _L6; else goto _L5
	//  314  653:goto            628
		Exception exception;
		exception;
	//  315  656:astore          16
_L5:
		Object obj3 = ((Object) (((Object) (exception)).getClass().getCanonicalName()));
	//  316  658:aload           16
	//  317  660:invokevirtual   #254 <Method Class Object.getClass()>
	//  318  663:invokevirtual   #259 <Method String Class.getCanonicalName()>
	//  319  666:astore          18
		exception = ((Exception) (exception.getMessage()));
	//  320  668:aload           16
	//  321  670:invokevirtual   #262 <Method String Exception.getMessage()>
	//  322  673:astore          16
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(obj3).length() + 1 + String.valueOf(((Object) (exception))).length());
	//  323  675:new             #215 <Class StringBuilder>
	//  324  678:dup             
	//  325  679:aload           18
	//  326  681:invokestatic    #268 <Method String String.valueOf(Object)>
	//  327  684:invokevirtual   #271 <Method int String.length()>
	//  328  687:iconst_1        
	//  329  688:iadd            
	//  330  689:aload           16
	//  331  691:invokestatic    #268 <Method String String.valueOf(Object)>
	//  332  694:invokevirtual   #271 <Method int String.length()>
	//  333  697:iadd            
	//  334  698:invokespecial   #218 <Method void StringBuilder(int)>
	//  335  701:astore          19
		stringbuilder.append(((String) (obj3)));
	//  336  703:aload           19
	//  337  705:aload           18
	//  338  707:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//  339  710:pop             
		stringbuilder.append(":");
	//  340  711:aload           19
	//  341  713:ldc2            #273 <String ":">
	//  342  716:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//  343  719:pop             
		stringbuilder.append(((String) (exception)));
	//  344  720:aload           19
	//  345  722:aload           16
	//  346  724:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//  347  727:pop             
		exception = ((Exception) (stringbuilder.toString()));
	//  348  728:aload           19
	//  349  730:invokevirtual   #235 <Method String StringBuilder.toString()>
	//  350  733:astore          16
		obj3 = ((Object) (new StringBuilder(String.valueOf(((Object) (s))).length() + 34 + String.valueOf(((Object) (exception))).length())));
	//  351  735:new             #215 <Class StringBuilder>
	//  352  738:dup             
	//  353  739:aload_1         
	//  354  740:invokestatic    #268 <Method String String.valueOf(Object)>
	//  355  743:invokevirtual   #271 <Method int String.length()>
	//  356  746:bipush          34
	//  357  748:iadd            
	//  358  749:aload           16
	//  359  751:invokestatic    #268 <Method String String.valueOf(Object)>
	//  360  754:invokevirtual   #271 <Method int String.length()>
	//  361  757:iadd            
	//  362  758:invokespecial   #218 <Method void StringBuilder(int)>
	//  363  761:astore          18
		((StringBuilder) (obj3)).append("Failed to preload url ");
	//  364  763:aload           18
	//  365  765:ldc2            #275 <String "Failed to preload url ">
	//  366  768:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//  367  771:pop             
		((StringBuilder) (obj3)).append(s);
	//  368  772:aload           18
	//  369  774:aload_1         
	//  370  775:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//  371  778:pop             
		((StringBuilder) (obj3)).append(" Exception: ");
	//  372  779:aload           18
	//  373  781:ldc2            #277 <String " Exception: ">
	//  374  784:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//  375  787:pop             
		((StringBuilder) (obj3)).append(((String) (exception)));
	//  376  788:aload           18
	//  377  790:aload           16
	//  378  792:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//  379  795:pop             
		com.google.android.gms.internal.ads.wx.e(((StringBuilder) (obj3)).toString());
	//  380  796:aload           18
	//  381  798:invokevirtual   #235 <Method String StringBuilder.toString()>
	//  382  801:invokestatic    #281 <Method void com.google.android.gms.internal.ads.wx.e(String)>
		((aeq)this).a(s, s1, ((String) (obj1)), ((String) (exception)));
	//  383  804:aload_0         
	//  384  805:aload_1         
	//  385  806:aload           20
	//  386  808:aload           17
	//  387  810:aload           16
	//  388  812:invokevirtual   #284 <Method void aeq.a(String, String, String, String)>
		return false;
	//  389  815:iconst_0        
	//  390  816:ireturn         
	//* 391  817:goto            386
_L4:
		if(l4 - l3 > 1000L * l6) goto _L8; else goto _L7
	//  392  820:lload           10
	//  393  822:lload           8
	//  394  824:lsub            
	//  395  825:ldc2w           #285 <Long 1000L>
	//  396  828:lload           14
	//  397  830:lmul            
	//  398  831:lcmp            
	//  399  832:ifgt            471
_L7:
		l1 = l2;
	//  400  835:lload           6
	//  401  837:lstore          4
		if(true) goto _L10; else goto _L9
	//  402  839:goto            271
_L9:
	}

	protected final String b(String s)
	{
		String s1 = String.valueOf("cache:");
	//    0    0:ldc2            #288 <String "cache:">
	//    1    3:invokestatic    #268 <Method String String.valueOf(Object)>
	//    2    6:astore_2        
		s = String.valueOf(((Object) (super.b(s))));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #82  <Method String aeq.b(String)>
	//    6   12:invokestatic    #268 <Method String String.valueOf(Object)>
	//    7   15:astore_1        
		if(s.length() != 0)
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #271 <Method int String.length()>
	//*  10   20:ifeq            29
			return s1.concat(s);
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #291 <Method String String.concat(String)>
	//   14   28:areturn         
		else
			return new String(s1);
	//   15   29:new             #264 <Class String>
	//   16   32:dup             
	//   17   33:aload_2         
	//   18   34:invokespecial   #292 <Method void String(String)>
	//   19   37:areturn         
	}

	public final void b()
	{
		f = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #205 <Field boolean f>
	//    3    5:return          
	}

	public final String c()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field String d>
	//    2    4:areturn         
	}

	public final boolean d()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #200 <Field boolean l>
	//    2    4:ireturn         
	}

	public final ByteBuffer e()
	{
		synchronized(k)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field Object k>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(i != null && !j)
	//*   5    7:aload_0         
	//*   6    8:getfield        #54  <Field ByteBuffer i>
	//*   7   11:ifnull          34
	//*   8   14:aload_0         
	//*   9   15:getfield        #296 <Field boolean j>
	//*  10   18:ifne            34
			{
				i.flip();
	//   11   21:aload_0         
	//   12   22:getfield        #54  <Field ByteBuffer i>
	//   13   25:invokevirtual   #300 <Method java.nio.Buffer ByteBuffer.flip()>
	//   14   28:pop             
				j = true;
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:putfield        #296 <Field boolean j>
			}
			f = true;
	//   18   34:aload_0         
	//   19   35:iconst_1        
	//   20   36:putfield        #205 <Field boolean f>
		}
	//   21   39:aload_1         
	//   22   40:monitorexit     
		return i;
	//   23   41:aload_0         
	//   24   42:getfield        #54  <Field ByteBuffer i>
	//   25   45:areturn         
		exception;
	//   26   46:astore_2        
		obj;
	//   27   47:aload_1         
		JVM INSTR monitorexit ;
	//   28   48:monitorexit     
		throw exception;
	//   29   49:aload_2         
	//   30   50:athrow          
	}

	private String d;
	private final adc e;
	private boolean f;
	private final afa g = new afa();
	private final aei h = new aei();
	private ByteBuffer i;
	private boolean j;
	private final Object k = new Object();
	private boolean l;
}
