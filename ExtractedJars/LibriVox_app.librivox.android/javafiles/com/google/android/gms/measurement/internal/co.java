// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.*;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.measurement.internal:
//			ed, bt, ax, h, 
//			ew, s, u, zzag, 
//			ec, ez, er, ae, 
//			bu, b, en, el, 
//			zzad, eo, d, c, 
//			et, ee

final class co extends ed
{

	public co(ee ee)
	{
		super(ee);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void ed(ee)>
	//    3    5:return          
	}

	private static String a(String s1, String s2)
	{
		throw new SecurityException("This implementation should not be used.");
	//    0    0:new             #13  <Class SecurityException>
	//    1    3:dup             
	//    2    4:ldc1            #15  <String "This implementation should not be used.">
	//    3    6:invokespecial   #18  <Method void SecurityException(String)>
	//    4    9:athrow          
	}

	public final byte[] a(zzag zzag1, String s1)
	{
		bp bp1;
		((com.google.android.gms.measurement.internal.bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method void bt.d()>
		r.F();
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field com.google.android.gms.measurement.internal.ax r>
	//    4    8:invokevirtual   #36  <Method void ax.F()>
		am.a(((Object) (zzag1)));
	//    5   11:aload_1         
	//    6   12:invokestatic    #41  <Method Object am.a(Object)>
	//    7   15:pop             
		am.a(s1);
	//    8   16:aload_2         
	//    9   17:invokestatic    #44  <Method String am.a(String)>
	//   10   20:pop             
		if(!((com.google.android.gms.measurement.internal.bt)this).t().d(s1, com.google.android.gms.measurement.internal.h.au))
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #48  <Method ew bt.t()>
	//*  13   25:aload_2         
	//*  14   26:getstatic       #54  <Field i com.google.android.gms.measurement.internal.h.au>
	//*  15   29:invokevirtual   #59  <Method boolean ew.d(String, i)>
	//*  16   32:ifne            52
		{
			((com.google.android.gms.measurement.internal.bt)this).r().w().a("Generating ScionPayload disabled. packageName", ((Object) (s1)));
	//   17   35:aload_0         
	//   18   36:invokevirtual   #62  <Method s bt.r()>
	//   19   39:invokevirtual   #68  <Method u s.w()>
	//   20   42:ldc1            #70  <String "Generating ScionPayload disabled. packageName">
	//   21   44:aload_2         
	//   22   45:invokevirtual   #75  <Method void u.a(String, Object)>
			return new byte[0];
	//   23   48:iconst_0        
	//   24   49:newarray        byte[]
	//   25   51:areturn         
		}
		if(!"_iap".equals(((Object) (zzag1.a))) && !"_iapx".equals(((Object) (zzag1.a))))
	//*  26   52:ldc1            #77  <String "_iap">
	//*  27   54:aload_1         
	//*  28   55:getfield        #82  <Field String zzag.a>
	//*  29   58:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  30   61:ifne            95
	//*  31   64:ldc1            #90  <String "_iapx">
	//*  32   66:aload_1         
	//*  33   67:getfield        #82  <Field String zzag.a>
	//*  34   70:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  35   73:ifne            95
		{
			((com.google.android.gms.measurement.internal.bt)this).r().w().a("Generating a payload for this event is not available. package_name, event_name", ((Object) (s1)), ((Object) (zzag1.a)));
	//   36   76:aload_0         
	//   37   77:invokevirtual   #62  <Method s bt.r()>
	//   38   80:invokevirtual   #68  <Method u s.w()>
	//   39   83:ldc1            #92  <String "Generating a payload for this event is not available. package_name, event_name">
	//   40   85:aload_2         
	//   41   86:aload_1         
	//   42   87:getfield        #82  <Field String zzag.a>
	//   43   90:invokevirtual   #95  <Method void u.a(String, Object, Object)>
			return null;
	//   44   93:aconst_null     
	//   45   94:areturn         
		}
		bp1 = new bp();
	//   46   95:new             #97  <Class bp>
	//   47   98:dup             
	//   48   99:invokespecial   #99  <Method void bp()>
	//   49  102:astore          10
		((ec)this).i().f();
	//   50  104:aload_0         
	//   51  105:invokevirtual   #105 <Method ez ec.i()>
	//   52  108:invokevirtual   #110 <Method void ez.f()>
		er er1 = ((ec)this).i().b(s1);
	//   53  111:aload_0         
	//   54  112:invokevirtual   #105 <Method ez ec.i()>
	//   55  115:aload_2         
	//   56  116:invokevirtual   #114 <Method er ez.b(String)>
	//   57  119:astore          11
		if(er1 != null)
			break MISSING_BLOCK_LABEL_150;
	//   58  121:aload           11
	//   59  123:ifnonnull       150
		((com.google.android.gms.measurement.internal.bt)this).r().w().a("Log and bundle not available. package_name", ((Object) (s1)));
	//   60  126:aload_0         
	//   61  127:invokevirtual   #62  <Method s bt.r()>
	//   62  130:invokevirtual   #68  <Method u s.w()>
	//   63  133:ldc1            #116 <String "Log and bundle not available. package_name">
	//   64  135:aload_2         
	//   65  136:invokevirtual   #75  <Method void u.a(String, Object)>
		((ec)this).i().x();
	//   66  139:aload_0         
	//   67  140:invokevirtual   #105 <Method ez ec.i()>
	//   68  143:invokevirtual   #119 <Method void ez.x()>
		return new byte[0];
	//   69  146:iconst_0        
	//   70  147:newarray        byte[]
	//   71  149:areturn         
		if(er1.o())
			break MISSING_BLOCK_LABEL_182;
	//   72  150:aload           11
	//   73  152:invokevirtual   #125 <Method boolean er.o()>
	//   74  155:ifne            182
		((com.google.android.gms.measurement.internal.bt)this).r().w().a("Log and bundle disabled. package_name", ((Object) (s1)));
	//   75  158:aload_0         
	//   76  159:invokevirtual   #62  <Method s bt.r()>
	//   77  162:invokevirtual   #68  <Method u s.w()>
	//   78  165:ldc1            #127 <String "Log and bundle disabled. package_name">
	//   79  167:aload_2         
	//   80  168:invokevirtual   #75  <Method void u.a(String, Object)>
		((ec)this).i().x();
	//   81  171:aload_0         
	//   82  172:invokevirtual   #105 <Method ez ec.i()>
	//   83  175:invokevirtual   #119 <Method void ez.x()>
		return new byte[0];
	//   84  178:iconst_0        
	//   85  179:newarray        byte[]
	//   86  181:areturn         
		long l;
		bq bq1;
		bq1 = new bq();
	//   87  182:new             #129 <Class bq>
	//   88  185:dup             
	//   89  186:invokespecial   #130 <Method void bq()>
	//   90  189:astore          12
		bp1.a = (new bq[] {
			bq1
		});
	//   91  191:aload           10
	//   92  193:iconst_1        
	//   93  194:anewarray       bq[]
	//   94  197:dup             
	//   95  198:iconst_0        
	//   96  199:aload           12
	//   97  201:aastore         
	//   98  202:putfield        #133 <Field bq[] bp.a>
		bq1.a = Integer.valueOf(1);
	//   99  205:aload           12
	//  100  207:iconst_1        
	//  101  208:invokestatic    #139 <Method Integer Integer.valueOf(int)>
	//  102  211:putfield        #142 <Field Integer bq.a>
		bq1.i = "android";
	//  103  214:aload           12
	//  104  216:ldc1            #144 <String "android">
	//  105  218:putfield        #146 <Field String bq.i>
		bq1.o = er1.b();
	//  106  221:aload           12
	//  107  223:aload           11
	//  108  225:invokevirtual   #149 <Method String er.b()>
	//  109  228:putfield        #151 <Field String bq.o>
		bq1.n = er1.l();
	//  110  231:aload           12
	//  111  233:aload           11
	//  112  235:invokevirtual   #154 <Method String er.l()>
	//  113  238:putfield        #157 <Field String bq.n>
		bq1.p = er1.j();
	//  114  241:aload           12
	//  115  243:aload           11
	//  116  245:invokevirtual   #160 <Method String er.j()>
	//  117  248:putfield        #163 <Field String bq.p>
		l = er1.k();
	//  118  251:aload           11
	//  119  253:invokevirtual   #167 <Method long er.k()>
	//  120  256:lstore          4
		Object obj;
		if(l == 0x80000000L)
	//* 121  258:lload           4
	//* 122  260:ldc2w           #168 <Long 0x80000000L>
	//* 123  263:lcmp            
	//* 124  264:ifne            273
		{
			obj = null;
	//  125  267:aconst_null     
	//  126  268:astore          9
			break MISSING_BLOCK_LABEL_281;
	//  127  270:goto            281
		}
		obj = ((Object) (Integer.valueOf((int)l)));
	//  128  273:lload           4
	//  129  275:l2i             
	//  130  276:invokestatic    #139 <Method Integer Integer.valueOf(int)>
	//  131  279:astore          9
		bq1.C = ((Integer) (obj));
	//  132  281:aload           12
	//  133  283:aload           9
	//  134  285:putfield        #172 <Field Integer bq.C>
		bq1.q = Long.valueOf(er1.m());
	//  135  288:aload           12
	//  136  290:aload           11
	//  137  292:invokevirtual   #175 <Method long er.m()>
	//  138  295:invokestatic    #180 <Method Long Long.valueOf(long)>
	//  139  298:putfield        #184 <Field Long bq.q>
		bq1.y = er1.d();
	//  140  301:aload           12
	//  141  303:aload           11
	//  142  305:invokevirtual   #186 <Method String er.d()>
	//  143  308:putfield        #189 <Field String bq.y>
		if(TextUtils.isEmpty(((CharSequence) (bq1.y))))
	//* 144  311:aload           12
	//* 145  313:getfield        #189 <Field String bq.y>
	//* 146  316:invokestatic    #195 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 147  319:ifeq            332
			bq1.I = er1.e();
	//  148  322:aload           12
	//  149  324:aload           11
	//  150  326:invokevirtual   #198 <Method String com.google.android.gms.measurement.internal.er.e()>
	//  151  329:putfield        #201 <Field String bq.I>
		bq1.v = Long.valueOf(er1.n());
	//  152  332:aload           12
	//  153  334:aload           11
	//  154  336:invokevirtual   #203 <Method long er.n()>
	//  155  339:invokestatic    #180 <Method Long Long.valueOf(long)>
	//  156  342:putfield        #206 <Field Long bq.v>
		if(r.C() && ew.w() && ((com.google.android.gms.measurement.internal.bt)this).t().c(bq1.o))
	//* 157  345:aload_0         
	//* 158  346:getfield        #31  <Field com.google.android.gms.measurement.internal.ax r>
	//* 159  349:invokevirtual   #208 <Method boolean ax.C()>
	//* 160  352:ifeq            382
	//* 161  355:invokestatic    #210 <Method boolean ew.w()>
	//* 162  358:ifeq            382
	//* 163  361:aload_0         
	//* 164  362:invokevirtual   #48  <Method ew bt.t()>
	//* 165  365:aload           12
	//* 166  367:getfield        #151 <Field String bq.o>
	//* 167  370:invokevirtual   #214 <Method boolean ew.c(String)>
	//* 168  373:ifeq            382
			bq1.G = null;
	//  169  376:aload           12
	//  170  378:aconst_null     
	//  171  379:putfield        #217 <Field String bq.G>
		obj = ((Object) (((com.google.android.gms.measurement.internal.bt)this).s().a(er1.b())));
	//  172  382:aload_0         
	//  173  383:invokevirtual   #221 <Method ae bt.s()>
	//  174  386:aload           11
	//  175  388:invokevirtual   #149 <Method String er.b()>
	//  176  391:invokevirtual   #226 <Method Pair ae.a(String)>
	//  177  394:astore          9
		if(!er1.C() || obj == null)
			break MISSING_BLOCK_LABEL_495;
	//  178  396:aload           11
	//  179  398:invokevirtual   #227 <Method boolean er.C()>
	//  180  401:ifeq            495
	//  181  404:aload           9
	//  182  406:ifnull          495
		boolean flag = TextUtils.isEmpty((CharSequence)((Pair) (obj)).first);
	//  183  409:aload           9
	//  184  411:getfield        #233 <Field Object Pair.first>
	//  185  414:checkcast       #235 <Class CharSequence>
	//  186  417:invokestatic    #195 <Method boolean TextUtils.isEmpty(CharSequence)>
	//  187  420:istore          8
		if(flag)
			break MISSING_BLOCK_LABEL_495;
	//  188  422:iload           8
	//  189  424:ifne            495
		bq1.s = a((String)((Pair) (obj)).first, Long.toString(zzag1.d));
	//  190  427:aload           12
	//  191  429:aload           9
	//  192  431:getfield        #233 <Field Object Pair.first>
	//  193  434:checkcast       #84  <Class String>
	//  194  437:aload_1         
	//  195  438:getfield        #238 <Field long zzag.d>
	//  196  441:invokestatic    #242 <Method String Long.toString(long)>
	//  197  444:invokestatic    #244 <Method String a(String, String)>
	//  198  447:putfield        #246 <Field String bq.s>
		bq1.t = (Boolean)((Pair) (obj)).second;
	//  199  450:aload           12
	//  200  452:aload           9
	//  201  454:getfield        #249 <Field Object Pair.second>
	//  202  457:checkcast       #251 <Class Boolean>
	//  203  460:putfield        #254 <Field Boolean bq.t>
		break MISSING_BLOCK_LABEL_495;
	//  204  463:goto            495
		zzag1;
	//  205  466:astore_1        
		((com.google.android.gms.measurement.internal.bt)this).r().w().a("Resettable device id encryption failed", ((Object) (((SecurityException) (zzag1)).getMessage())));
	//  206  467:aload_0         
	//  207  468:invokevirtual   #62  <Method s bt.r()>
	//  208  471:invokevirtual   #68  <Method u s.w()>
	//  209  474:ldc2            #256 <String "Resettable device id encryption failed">
	//  210  477:aload_1         
	//  211  478:invokevirtual   #259 <Method String SecurityException.getMessage()>
	//  212  481:invokevirtual   #75  <Method void u.a(String, Object)>
		((ec)this).i().x();
	//  213  484:aload_0         
	//  214  485:invokevirtual   #105 <Method ez ec.i()>
	//  215  488:invokevirtual   #119 <Method void ez.x()>
		return new byte[0];
	//  216  491:iconst_0        
	//  217  492:newarray        byte[]
	//  218  494:areturn         
		((bu) (((com.google.android.gms.measurement.internal.bt)this).l())).A();
	//  219  495:aload_0         
	//  220  496:invokevirtual   #262 <Method b bt.l()>
	//  221  499:invokevirtual   #267 <Method void bu.A()>
		bq1.k = Build.MODEL;
	//  222  502:aload           12
	//  223  504:getstatic       #272 <Field String Build.MODEL>
	//  224  507:putfield        #274 <Field String bq.k>
		((bu) (((com.google.android.gms.measurement.internal.bt)this).l())).A();
	//  225  510:aload_0         
	//  226  511:invokevirtual   #262 <Method b bt.l()>
	//  227  514:invokevirtual   #267 <Method void bu.A()>
		bq1.j = android.os.Build.VERSION.RELEASE;
	//  228  517:aload           12
	//  229  519:getstatic       #279 <Field String android.os.Build$VERSION.RELEASE>
	//  230  522:putfield        #281 <Field String bq.j>
		bq1.m = Integer.valueOf((int)((com.google.android.gms.measurement.internal.bt)this).l().t_());
	//  231  525:aload           12
	//  232  527:aload_0         
	//  233  528:invokevirtual   #262 <Method b bt.l()>
	//  234  531:invokevirtual   #286 <Method long b.t_()>
	//  235  534:l2i             
	//  236  535:invokestatic    #139 <Method Integer Integer.valueOf(int)>
	//  237  538:putfield        #288 <Field Integer bq.m>
		bq1.l = ((com.google.android.gms.measurement.internal.bt)this).l().g();
	//  238  541:aload           12
	//  239  543:aload_0         
	//  240  544:invokevirtual   #262 <Method b bt.l()>
	//  241  547:invokevirtual   #291 <Method String b.g()>
	//  242  550:putfield        #293 <Field String bq.l>
		bq1.u = a(er1.c(), Long.toString(zzag1.d));
	//  243  553:aload           12
	//  244  555:aload           11
	//  245  557:invokevirtual   #295 <Method String er.c()>
	//  246  560:aload_1         
	//  247  561:getfield        #238 <Field long zzag.d>
	//  248  564:invokestatic    #242 <Method String Long.toString(long)>
	//  249  567:invokestatic    #244 <Method String a(String, String)>
	//  250  570:putfield        #298 <Field String bq.u>
		Object obj1;
		Object obj2;
		bq1.B = er1.g();
	//  251  573:aload           12
	//  252  575:aload           11
	//  253  577:invokevirtual   #299 <Method String er.g()>
	//  254  580:putfield        #302 <Field String bq.B>
		obj2 = ((Object) (bq1.o));
	//  255  583:aload           12
	//  256  585:getfield        #151 <Field String bq.o>
	//  257  588:astore          14
		obj1 = ((Object) (((ec)this).i().a(((String) (obj2)))));
	//  258  590:aload_0         
	//  259  591:invokevirtual   #105 <Method ez ec.i()>
	//  260  594:aload           14
	//  261  596:invokevirtual   #305 <Method List ez.a(String)>
	//  262  599:astore          13
		if(!((com.google.android.gms.measurement.internal.bt)this).t().e(s1)) goto _L2; else goto _L1
	//  263  601:aload_0         
	//  264  602:invokevirtual   #48  <Method ew bt.t()>
	//  265  605:aload_2         
	//  266  606:invokevirtual   #307 <Method boolean com.google.android.gms.measurement.internal.ew.e(String)>
	//  267  609:ifeq            723
_L1:
		Iterator iterator = ((List) (obj1)).iterator();
	//  268  612:aload           13
	//  269  614:invokeinterface #313 <Method Iterator List.iterator()>
	//  270  619:astore          15
_L6:
		if(!iterator.hasNext()) goto _L4; else goto _L3
	//  271  621:aload           15
	//  272  623:invokeinterface #318 <Method boolean Iterator.hasNext()>
	//  273  628:ifeq            1577
_L3:
		obj = ((Object) ((en)iterator.next()));
	//  274  631:aload           15
	//  275  633:invokeinterface #322 <Method Object Iterator.next()>
	//  276  638:checkcast       #324 <Class en>
	//  277  641:astore          9
		if(!"_lte".equals(((Object) (((en) (obj)).c)))) goto _L6; else goto _L5
	//  278  643:ldc2            #326 <String "_lte">
	//  279  646:aload           9
	//  280  648:getfield        #328 <Field String en.c>
	//  281  651:invokevirtual   #88  <Method boolean String.equals(Object)>
	//  282  654:ifeq            621
	//* 283  657:goto            660
_L5:
		if(obj == null) goto _L8; else goto _L7
	//  284  660:aload           9
	//  285  662:ifnull          673
_L7:
		if(((en) (obj)).e != null) goto _L2; else goto _L8
	//  286  665:aload           9
	//  287  667:getfield        #330 <Field Object com.google.android.gms.measurement.internal.en.e>
	//  288  670:ifnonnull       723
_L8:
		obj = ((Object) (new en(((String) (obj2)), "auto", "_lte", ((com.google.android.gms.measurement.internal.bt)this).m().a(), ((Object) (Long.valueOf(0L))))));
	//  289  673:new             #324 <Class en>
	//  290  676:dup             
	//  291  677:aload           14
	//  292  679:ldc2            #332 <String "auto">
	//  293  682:ldc2            #326 <String "_lte">
	//  294  685:aload_0         
	//  295  686:invokevirtual   #335 <Method e bt.m()>
	//  296  689:invokeinterface #339 <Method long e.a()>
	//  297  694:lconst_0        
	//  298  695:invokestatic    #180 <Method Long Long.valueOf(long)>
	//  299  698:invokespecial   #342 <Method void en(String, String, String, long, Object)>
	//  300  701:astore          9
		((List) (obj1)).add(obj);
	//  301  703:aload           13
	//  302  705:aload           9
	//  303  707:invokeinterface #345 <Method boolean List.add(Object)>
	//  304  712:pop             
		((ec)this).i().a(((en) (obj)));
	//  305  713:aload_0         
	//  306  714:invokevirtual   #105 <Method ez ec.i()>
	//  307  717:aload           9
	//  308  719:invokevirtual   #348 <Method boolean ez.a(en)>
	//  309  722:pop             
_L2:
		obj = ((Object) (new bt[((List) (obj1)).size()]));
	//  310  723:aload           13
	//  311  725:invokeinterface #352 <Method int List.size()>
	//  312  730:anewarray       bt[]
	//  313  733:astore          9
		int i = 0;
	//  314  735:iconst_0        
	//  315  736:istore_3        
_L10:
		if(i >= ((List) (obj1)).size())
			break; /* Loop/switch isn't completed */
	//  316  737:iload_3         
	//  317  738:aload           13
	//  318  740:invokeinterface #352 <Method int List.size()>
	//  319  745:icmpge          834
		obj2 = ((Object) (new bt()));
	//  320  748:new             #354 <Class bt>
	//  321  751:dup             
	//  322  752:invokespecial   #355 <Method void bt()>
	//  323  755:astore          14
		obj[i] = ((bt) (obj2));
	//  324  757:aload           9
	//  325  759:iload_3         
	//  326  760:aload           14
	//  327  762:aastore         
		obj2.b = ((en)((List) (obj1)).get(i)).c;
	//  328  763:aload           14
	//  329  765:aload           13
	//  330  767:iload_3         
	//  331  768:invokeinterface #359 <Method Object List.get(int)>
	//  332  773:checkcast       #324 <Class en>
	//  333  776:getfield        #328 <Field String en.c>
	//  334  779:putfield        #361 <Field String bt.b>
		obj2.a = Long.valueOf(((en)((List) (obj1)).get(i)).d);
	//  335  782:aload           14
	//  336  784:aload           13
	//  337  786:iload_3         
	//  338  787:invokeinterface #359 <Method Object List.get(int)>
	//  339  792:checkcast       #324 <Class en>
	//  340  795:getfield        #362 <Field long en.d>
	//  341  798:invokestatic    #180 <Method Long Long.valueOf(long)>
	//  342  801:putfield        #364 <Field Long bt.a>
		((ec)this).g().a(((bt) (obj2)), ((en)((List) (obj1)).get(i)).e);
	//  343  804:aload_0         
	//  344  805:invokevirtual   #367 <Method el ec.g()>
	//  345  808:aload           14
	//  346  810:aload           13
	//  347  812:iload_3         
	//  348  813:invokeinterface #359 <Method Object List.get(int)>
	//  349  818:checkcast       #324 <Class en>
	//  350  821:getfield        #330 <Field Object com.google.android.gms.measurement.internal.en.e>
	//  351  824:invokevirtual   #372 <Method void el.a(bt, Object)>
		i++;
	//  352  827:iload_3         
	//  353  828:iconst_1        
	//  354  829:iadd            
	//  355  830:istore_3        
		if(true) goto _L10; else goto _L9
	//  356  831:goto            737
_L9:
		bq1.c = ((bt []) (obj));
	//  357  834:aload           12
	//  358  836:aload           9
	//  359  838:putfield        #375 <Field bt[] bq.c>
		obj1 = ((Object) (zzag1.b.b()));
	//  360  841:aload_1         
	//  361  842:getfield        #378 <Field zzad zzag.b>
	//  362  845:invokevirtual   #383 <Method Bundle zzad.b()>
	//  363  848:astore          13
		((Bundle) (obj1)).putLong("_c", 1L);
	//  364  850:aload           13
	//  365  852:ldc2            #385 <String "_c">
	//  366  855:lconst_1        
	//  367  856:invokevirtual   #391 <Method void Bundle.putLong(String, long)>
		((com.google.android.gms.measurement.internal.bt)this).r().w().a("Marking in-app purchase as real-time");
	//  368  859:aload_0         
	//  369  860:invokevirtual   #62  <Method s bt.r()>
	//  370  863:invokevirtual   #68  <Method u s.w()>
	//  371  866:ldc2            #393 <String "Marking in-app purchase as real-time">
	//  372  869:invokevirtual   #395 <Method void u.a(String)>
		((Bundle) (obj1)).putLong("_r", 1L);
	//  373  872:aload           13
	//  374  874:ldc2            #397 <String "_r">
	//  375  877:lconst_1        
	//  376  878:invokevirtual   #391 <Method void Bundle.putLong(String, long)>
		((Bundle) (obj1)).putString("_o", zzag1.c);
	//  377  881:aload           13
	//  378  883:ldc2            #399 <String "_o">
	//  379  886:aload_1         
	//  380  887:getfield        #400 <Field String zzag.c>
	//  381  890:invokevirtual   #404 <Method void Bundle.putString(String, String)>
		if(((com.google.android.gms.measurement.internal.bt)this).p().f(bq1.o))
	//* 382  893:aload_0         
	//* 383  894:invokevirtual   #407 <Method eo bt.p()>
	//* 384  897:aload           12
	//* 385  899:getfield        #151 <Field String bq.o>
	//* 386  902:invokevirtual   #411 <Method boolean eo.f(String)>
	//* 387  905:ifeq            940
		{
			((com.google.android.gms.measurement.internal.bt)this).p().a(((Bundle) (obj1)), "_dbg", ((Object) (Long.valueOf(1L))));
	//  388  908:aload_0         
	//  389  909:invokevirtual   #407 <Method eo bt.p()>
	//  390  912:aload           13
	//  391  914:ldc2            #413 <String "_dbg">
	//  392  917:lconst_1        
	//  393  918:invokestatic    #180 <Method Long Long.valueOf(long)>
	//  394  921:invokevirtual   #416 <Method void eo.a(Bundle, String, Object)>
			((com.google.android.gms.measurement.internal.bt)this).p().a(((Bundle) (obj1)), "_r", ((Object) (Long.valueOf(1L))));
	//  395  924:aload_0         
	//  396  925:invokevirtual   #407 <Method eo bt.p()>
	//  397  928:aload           13
	//  398  930:ldc2            #397 <String "_r">
	//  399  933:lconst_1        
	//  400  934:invokestatic    #180 <Method Long Long.valueOf(long)>
	//  401  937:invokevirtual   #416 <Method void eo.a(Bundle, String, Object)>
		}
		obj = ((Object) (((ec)this).i().a(s1, zzag1.a)));
	//  402  940:aload_0         
	//  403  941:invokevirtual   #105 <Method ez ec.i()>
	//  404  944:aload_2         
	//  405  945:aload_1         
	//  406  946:getfield        #82  <Field String zzag.a>
	//  407  949:invokevirtual   #419 <Method d ez.a(String, String)>
	//  408  952:astore          9
		if(obj != null)
			break MISSING_BLOCK_LABEL_990;
	//  409  954:aload           9
	//  410  956:ifnonnull       990
		obj = ((Object) (new d(s1, zzag1.a, 0L, 0L, zzag1.d, 0L, ((Long) (null)), ((Long) (null)), ((Long) (null)), ((Boolean) (null)))));
	//  411  959:new             #421 <Class d>
	//  412  962:dup             
	//  413  963:aload_2         
	//  414  964:aload_1         
	//  415  965:getfield        #82  <Field String zzag.a>
	//  416  968:lconst_0        
	//  417  969:lconst_0        
	//  418  970:aload_1         
	//  419  971:getfield        #238 <Field long zzag.d>
	//  420  974:lconst_0        
	//  421  975:aconst_null     
	//  422  976:aconst_null     
	//  423  977:aconst_null     
	//  424  978:aconst_null     
	//  425  979:invokespecial   #424 <Method void d(String, String, long, long, long, long, Long, Long, Long, Boolean)>
	//  426  982:astore          9
		l = 0L;
	//  427  984:lconst_0        
	//  428  985:lstore          4
		break MISSING_BLOCK_LABEL_1008;
	//  429  987:goto            1008
		l = ((d) (obj)).e;
	//  430  990:aload           9
	//  431  992:getfield        #426 <Field long com.google.android.gms.measurement.internal.d.e>
	//  432  995:lstore          4
		obj = ((Object) (((d) (obj)).a(zzag1.d)));
	//  433  997:aload           9
	//  434  999:aload_1         
	//  435 1000:getfield        #238 <Field long zzag.d>
	//  436 1003:invokevirtual   #429 <Method d d.a(long)>
	//  437 1006:astore          9
		((ec)this).i().a(((d) (obj)));
	//  438 1008:aload_0         
	//  439 1009:invokevirtual   #105 <Method ez ec.i()>
	//  440 1012:aload           9
	//  441 1014:invokevirtual   #432 <Method void ez.a(d)>
		obj1 = ((Object) (new c(r, zzag1.c, s1, zzag1.a, zzag1.d, l, ((Bundle) (obj1)))));
	//  442 1017:new             #434 <Class c>
	//  443 1020:dup             
	//  444 1021:aload_0         
	//  445 1022:getfield        #31  <Field com.google.android.gms.measurement.internal.ax r>
	//  446 1025:aload_1         
	//  447 1026:getfield        #400 <Field String zzag.c>
	//  448 1029:aload_2         
	//  449 1030:aload_1         
	//  450 1031:getfield        #82  <Field String zzag.a>
	//  451 1034:aload_1         
	//  452 1035:getfield        #238 <Field long zzag.d>
	//  453 1038:lload           4
	//  454 1040:aload           13
	//  455 1042:invokespecial   #437 <Method void c(com.google.android.gms.measurement.internal.ax, String, String, String, long, long, Bundle)>
	//  456 1045:astore          13
		obj2 = ((Object) (new bn()));
	//  457 1047:new             #439 <Class bn>
	//  458 1050:dup             
	//  459 1051:invokespecial   #440 <Method void bn()>
	//  460 1054:astore          14
		bq1.b = (new bn[] {
			obj2
		});
	//  461 1056:aload           12
	//  462 1058:iconst_1        
	//  463 1059:anewarray       bn[]
	//  464 1062:dup             
	//  465 1063:iconst_0        
	//  466 1064:aload           14
	//  467 1066:aastore         
	//  468 1067:putfield        #443 <Field bn[] bq.b>
		obj2.c = Long.valueOf(((c) (obj1)).c);
	//  469 1070:aload           14
	//  470 1072:aload           13
	//  471 1074:getfield        #445 <Field long c.c>
	//  472 1077:invokestatic    #180 <Method Long Long.valueOf(long)>
	//  473 1080:putfield        #447 <Field Long bn.c>
		obj2.b = ((c) (obj1)).b;
	//  474 1083:aload           14
	//  475 1085:aload           13
	//  476 1087:getfield        #448 <Field String c.b>
	//  477 1090:putfield        #449 <Field String bn.b>
		obj2.d = Long.valueOf(((c) (obj1)).d);
	//  478 1093:aload           14
	//  479 1095:aload           13
	//  480 1097:getfield        #450 <Field long c.d>
	//  481 1100:invokestatic    #180 <Method Long Long.valueOf(long)>
	//  482 1103:putfield        #452 <Field Long bn.d>
		obj2.a = new bo[((c) (obj1)).e.a()];
	//  483 1106:aload           14
	//  484 1108:aload           13
	//  485 1110:getfield        #454 <Field zzad com.google.android.gms.measurement.internal.c.e>
	//  486 1113:invokevirtual   #456 <Method int zzad.a()>
	//  487 1116:anewarray       bo[]
	//  488 1119:putfield        #461 <Field bo[] bn.a>
		iterator = ((c) (obj1)).e.iterator();
	//  489 1122:aload           13
	//  490 1124:getfield        #454 <Field zzad com.google.android.gms.measurement.internal.c.e>
	//  491 1127:invokevirtual   #462 <Method Iterator zzad.iterator()>
	//  492 1130:astore          15
		i = 0;
	//  493 1132:iconst_0        
	//  494 1133:istore_3        
_L12:
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//  495 1134:aload           15
	//  496 1136:invokeinterface #318 <Method boolean Iterator.hasNext()>
	//  497 1141:ifeq            1211
		Object obj3 = ((Object) ((String)iterator.next()));
	//  498 1144:aload           15
	//  499 1146:invokeinterface #322 <Method Object Iterator.next()>
	//  500 1151:checkcast       #84  <Class String>
	//  501 1154:astore          17
		bo bo1 = new bo();
	//  502 1156:new             #458 <Class bo>
	//  503 1159:dup             
	//  504 1160:invokespecial   #463 <Method void bo()>
	//  505 1163:astore          16
		((bn) (obj2)).a[i] = bo1;
	//  506 1165:aload           14
	//  507 1167:getfield        #461 <Field bo[] bn.a>
	//  508 1170:iload_3         
	//  509 1171:aload           16
	//  510 1173:aastore         
		bo1.a = ((String) (obj3));
	//  511 1174:aload           16
	//  512 1176:aload           17
	//  513 1178:putfield        #464 <Field String bo.a>
		obj3 = ((c) (obj1)).e.a(((String) (obj3)));
	//  514 1181:aload           13
	//  515 1183:getfield        #454 <Field zzad com.google.android.gms.measurement.internal.c.e>
	//  516 1186:aload           17
	//  517 1188:invokevirtual   #467 <Method Object zzad.a(String)>
	//  518 1191:astore          17
		((ec)this).g().a(bo1, obj3);
	//  519 1193:aload_0         
	//  520 1194:invokevirtual   #367 <Method el ec.g()>
	//  521 1197:aload           16
	//  522 1199:aload           17
	//  523 1201:invokevirtual   #470 <Method void el.a(bo, Object)>
		i++;
	//  524 1204:iload_3         
	//  525 1205:iconst_1        
	//  526 1206:iadd            
	//  527 1207:istore_3        
		if(true) goto _L12; else goto _L11
	//  528 1208:goto            1134
_L11:
		bq1.J = (aw)(et)((eu) (aw.a().a((au)(et)((eu) (au.a().a(((d) (obj)).c).a(zzag1.a))).g()))).g();
	//  529 1211:aload           12
	//  530 1213:invokestatic    #475 <Method ax aw.a()>
	//  531 1216:invokestatic    #480 <Method av au.a()>
	//  532 1219:aload           9
	//  533 1221:getfield        #481 <Field long d.c>
	//  534 1224:invokevirtual   #486 <Method av av.a(long)>
	//  535 1227:aload_1         
	//  536 1228:getfield        #82  <Field String zzag.a>
	//  537 1231:invokevirtual   #489 <Method av av.a(String)>
	//  538 1234:invokevirtual   #494 <Method com.google.android.gms.internal.measurement.gg eu.g()>
	//  539 1237:checkcast       #496 <Class et>
	//  540 1240:checkcast       #477 <Class au>
	//  541 1243:invokevirtual   #501 <Method ax ax.a(au)>
	//  542 1246:invokevirtual   #494 <Method com.google.android.gms.internal.measurement.gg eu.g()>
	//  543 1249:checkcast       #496 <Class et>
	//  544 1252:checkcast       #472 <Class aw>
	//  545 1255:putfield        #504 <Field aw bq.J>
		bq1.A = ((ec)this).h().a(er1.b(), ((bn []) (null)), bq1.c);
	//  546 1258:aload           12
	//  547 1260:aload_0         
	//  548 1261:invokevirtual   #508 <Method com.google.android.gms.measurement.internal.et ec.h()>
	//  549 1264:aload           11
	//  550 1266:invokevirtual   #149 <Method String er.b()>
	//  551 1269:aconst_null     
	//  552 1270:aload           12
	//  553 1272:getfield        #375 <Field bt[] bq.c>
	//  554 1275:invokevirtual   #513 <Method com.google.android.gms.internal.measurement.bl[] et.a(String, bn[], bt[])>
	//  555 1278:putfield        #516 <Field com.google.android.gms.internal.measurement.bl[] bq.A>
		bq1.e = ((bn) (obj2)).c;
	//  556 1281:aload           12
	//  557 1283:aload           14
	//  558 1285:getfield        #447 <Field Long bn.c>
	//  559 1288:putfield        #518 <Field Long bq.e>
		bq1.f = ((bn) (obj2)).c;
	//  560 1291:aload           12
	//  561 1293:aload           14
	//  562 1295:getfield        #447 <Field Long bn.c>
	//  563 1298:putfield        #520 <Field Long bq.f>
		l = er1.i();
	//  564 1301:aload           11
	//  565 1303:invokevirtual   #522 <Method long er.i()>
	//  566 1306:lstore          4
		if(l == 0L) goto _L14; else goto _L13
	//  567 1308:lload           4
	//  568 1310:lconst_0        
	//  569 1311:lcmp            
	//  570 1312:ifeq            1583
_L13:
		zzag1 = ((zzag) (Long.valueOf(l)));
	//  571 1315:lload           4
	//  572 1317:invokestatic    #180 <Method Long Long.valueOf(long)>
	//  573 1320:astore_1        
	//* 574 1321:goto            1324
_L15:
		long l1;
		bq1.h = ((Long) (zzag1));
	//  575 1324:aload           12
	//  576 1326:aload_1         
	//  577 1327:putfield        #524 <Field Long bq.h>
		l1 = er1.h();
	//  578 1330:aload           11
	//  579 1332:invokevirtual   #526 <Method long er.h()>
	//  580 1335:lstore          6
		if(l1 != 0L)
	//* 581 1337:lload           6
	//* 582 1339:lconst_0        
	//* 583 1340:lcmp            
	//* 584 1341:ifne            1588
	//* 585 1344:goto            1347
	//* 586 1347:lload           4
	//* 587 1349:lconst_0        
	//* 588 1350:lcmp            
	//* 589 1351:ifeq            1595
	//* 590 1354:lload           4
	//* 591 1356:invokestatic    #180 <Method Long Long.valueOf(long)>
	//* 592 1359:astore_1        
	//* 593 1360:goto            1363
	//* 594 1363:aload           12
	//* 595 1365:aload_1         
	//* 596 1366:putfield        #528 <Field Long bq.g>
	//* 597 1369:aload           11
	//* 598 1371:invokevirtual   #530 <Method void er.s()>
	//* 599 1374:aload           12
	//* 600 1376:aload           11
	//* 601 1378:invokevirtual   #532 <Method long er.p()>
	//* 602 1381:l2i             
	//* 603 1382:invokestatic    #139 <Method Integer Integer.valueOf(int)>
	//* 604 1385:putfield        #534 <Field Integer bq.w>
	//* 605 1388:aload           12
	//* 606 1390:aload_0         
	//* 607 1391:invokevirtual   #48  <Method ew bt.t()>
	//* 608 1394:invokevirtual   #536 <Method long ew.f()>
	//* 609 1397:invokestatic    #180 <Method Long Long.valueOf(long)>
	//* 610 1400:putfield        #538 <Field Long bq.r>
	//* 611 1403:aload           12
	//* 612 1405:aload_0         
	//* 613 1406:invokevirtual   #335 <Method e bt.m()>
	//* 614 1409:invokeinterface #339 <Method long e.a()>
	//* 615 1414:invokestatic    #180 <Method Long Long.valueOf(long)>
	//* 616 1417:putfield        #539 <Field Long bq.d>
	//* 617 1420:aload           12
	//* 618 1422:getstatic       #542 <Field Boolean Boolean.TRUE>
	//* 619 1425:putfield        #545 <Field Boolean bq.z>
	//* 620 1428:aload           11
	//* 621 1430:aload           12
	//* 622 1432:getfield        #518 <Field Long bq.e>
	//* 623 1435:invokevirtual   #548 <Method long Long.longValue()>
	//* 624 1438:invokevirtual   #551 <Method void er.a(long)>
	//* 625 1441:aload           11
	//* 626 1443:aload           12
	//* 627 1445:getfield        #520 <Field Long bq.f>
	//* 628 1448:invokevirtual   #548 <Method long Long.longValue()>
	//* 629 1451:invokevirtual   #553 <Method void er.b(long)>
	//* 630 1454:aload_0         
	//* 631 1455:invokevirtual   #105 <Method ez ec.i()>
	//* 632 1458:aload           11
	//* 633 1460:invokevirtual   #556 <Method void ez.a(er)>
	//* 634 1463:aload_0         
	//* 635 1464:invokevirtual   #105 <Method ez ec.i()>
	//* 636 1467:invokevirtual   #558 <Method void ez.w()>
	//* 637 1470:aload_0         
	//* 638 1471:invokevirtual   #105 <Method ez ec.i()>
	//* 639 1474:invokevirtual   #119 <Method void ez.x()>
	//* 640 1477:aload           10
	//* 641 1479:invokevirtual   #562 <Method int iy.e()>
	//* 642 1482:newarray        byte[]
	//* 643 1484:astore_1        
	//* 644 1485:aload_1         
	//* 645 1486:iconst_0        
	//* 646 1487:aload_1         
	//* 647 1488:arraylength     
	//* 648 1489:invokestatic    #567 <Method iq iq.a(byte[], int, int)>
	//* 649 1492:astore          9
	//* 650 1494:aload           10
	//* 651 1496:aload           9
	//* 652 1498:invokevirtual   #570 <Method void iy.a(iq)>
	//* 653 1501:aload           9
	//* 654 1503:invokevirtual   #572 <Method void iq.a()>
	//* 655 1506:aload_0         
	//* 656 1507:invokevirtual   #367 <Method el ec.g()>
	//* 657 1510:aload_1         
	//* 658 1511:invokevirtual   #575 <Method byte[] el.b(byte[])>
	//* 659 1514:astore_1        
	//* 660 1515:aload_1         
	//* 661 1516:areturn         
	//* 662 1517:astore_1        
	//* 663 1518:aload_0         
	//* 664 1519:invokevirtual   #62  <Method s bt.r()>
	//* 665 1522:invokevirtual   #578 <Method u s.u_()>
	//* 666 1525:ldc2            #580 <String "Data loss. Failed to bundle and serialize. appId">
	//* 667 1528:aload_2         
	//* 668 1529:invokestatic    #581 <Method Object s.a(String)>
	//* 669 1532:aload_1         
	//* 670 1533:invokevirtual   #95  <Method void u.a(String, Object, Object)>
	//* 671 1536:aconst_null     
	//* 672 1537:areturn         
	//* 673 1538:astore_1        
	//* 674 1539:aload_0         
	//* 675 1540:invokevirtual   #62  <Method s bt.r()>
	//* 676 1543:invokevirtual   #68  <Method u s.w()>
	//* 677 1546:ldc2            #583 <String "app instance id encryption failed">
	//* 678 1549:aload_1         
	//* 679 1550:invokevirtual   #259 <Method String SecurityException.getMessage()>
	//* 680 1553:invokevirtual   #75  <Method void u.a(String, Object)>
	//* 681 1556:aload_0         
	//* 682 1557:invokevirtual   #105 <Method ez ec.i()>
	//* 683 1560:invokevirtual   #119 <Method void ez.x()>
	//* 684 1563:iconst_0        
	//* 685 1564:newarray        byte[]
	//* 686 1566:areturn         
	//* 687 1567:astore_1        
	//* 688 1568:aload_0         
	//* 689 1569:invokevirtual   #105 <Method ez ec.i()>
	//* 690 1572:invokevirtual   #119 <Method void ez.x()>
	//* 691 1575:aload_1         
	//* 692 1576:athrow          
	//* 693 1577:aconst_null     
	//* 694 1578:astore          9
	//* 695 1580:goto            660
	//* 696 1583:aconst_null     
	//* 697 1584:astore_1        
	//* 698 1585:goto            1324
			l = l1;
	//  699 1588:lload           6
	//  700 1590:lstore          4
		if(l == 0L)
			break MISSING_BLOCK_LABEL_1595;
		zzag1 = ((zzag) (Long.valueOf(l)));
_L16:
		bq1.g = ((Long) (zzag1));
		er1.s();
		bq1.w = Integer.valueOf((int)er1.p());
		bq1.r = Long.valueOf(((com.google.android.gms.measurement.internal.bt)this).t().f());
		bq1.d = Long.valueOf(((com.google.android.gms.measurement.internal.bt)this).m().a());
		bq1.z = Boolean.TRUE;
		er1.a(bq1.e.longValue());
		er1.b(bq1.f.longValue());
		((ec)this).i().a(er1);
		((ec)this).i().w();
		((ec)this).i().x();
		try
		{
			zzag1 = ((zzag) (new byte[((iy) (bp1)).e()]));
			obj = ((Object) (iq.a(((byte []) (zzag1)), 0, zzag1.length)));
			((iy) (bp1)).a(((iq) (obj)));
			((iq) (obj)).a();
			zzag1 = ((zzag) (((ec)this).g().b(((byte []) (zzag1)))));
		}
		// Misplaced declaration of an exception variable
		catch(zzag zzag1)
		{
			((com.google.android.gms.measurement.internal.bt)this).r().u_().a("Data loss. Failed to bundle and serialize. appId", s.a(s1), ((Object) (zzag1)));
			return null;
		}
		return ((byte []) (zzag1));
		zzag1;
		((com.google.android.gms.measurement.internal.bt)this).r().w().a("app instance id encryption failed", ((Object) (((SecurityException) (zzag1)).getMessage())));
		((ec)this).i().x();
		return new byte[0];
		zzag1;
		((ec)this).i().x();
		throw zzag1;
_L4:
		obj = null;
		  goto _L5
_L14:
		zzag1 = null;
		  goto _L15
	//* 701 1592:goto            1347
		zzag1 = null;
	//  702 1595:aconst_null     
	//  703 1596:astore_1        
		  goto _L16
	//* 704 1597:goto            1363
	}

	protected final boolean e()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}
}
