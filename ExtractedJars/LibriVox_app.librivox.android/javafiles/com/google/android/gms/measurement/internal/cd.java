// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.g.a;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.f;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.measurement.internal:
//			dq, bt, ct, m, 
//			ew, ax, s, u, 
//			cv, h, eo, bw, 
//			q, cr, cq, bz, 
//			du, ae, ah, ag, 
//			zzag, zzad, ca, cg, 
//			as, eu, ck, zzo, 
//			zzfu, cl, cf, cj, 
//			ci, by, cm, ch, 
//			bu, cn, a, o, 
//			b

public final class cd extends dq
{

	protected cd(ax ax1)
	{
		super(ax1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void dq(ax)>
	//    3    5:aload_0         
	//    4    6:new             #21  <Class CopyOnWriteArraySet>
	//    5    9:dup             
	//    6   10:invokespecial   #24  <Method void CopyOnWriteArraySet()>
	//    7   13:putfield        #26  <Field Set d>
		b = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #28  <Field boolean b>
	//   11   21:aload_0         
	//   12   22:new             #30  <Class AtomicReference>
	//   13   25:dup             
	//   14   26:invokespecial   #31  <Method void AtomicReference()>
	//   15   29:putfield        #33  <Field AtomicReference f>
	//   16   32:return          
	}

	private final void C()
	{
		if(((bt)this).t().j(((ct)this).g().x()) && r.C() && b)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #41  <Method ew bt.t()>
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #47  <Method com.google.android.gms.measurement.internal.m ct.g()>
	//*   4    8:invokevirtual   #53  <Method String m.x()>
	//*   5   11:invokevirtual   #59  <Method boolean ew.j(String)>
	//*   6   14:ifeq            51
	//*   7   17:aload_0         
	//*   8   18:getfield        #63  <Field ax r>
	//*   9   21:invokevirtual   #68  <Method boolean ax.C()>
	//*  10   24:ifeq            51
	//*  11   27:aload_0         
	//*  12   28:getfield        #28  <Field boolean b>
	//*  13   31:ifeq            51
		{
			((bt)this).r().w().a("Recording app launch after enabling measurement for the first time (FE)");
	//   14   34:aload_0         
	//   15   35:invokevirtual   #71  <Method s bt.r()>
	//   16   38:invokevirtual   #77  <Method u s.w()>
	//   17   41:ldc1            #79  <String "Recording app launch after enabling measurement for the first time (FE)">
	//   18   43:invokevirtual   #84  <Method void com.google.android.gms.measurement.internal.u.a(String)>
			y();
	//   19   46:aload_0         
	//   20   47:invokevirtual   #87  <Method void y()>
			return;
	//   21   50:return          
		} else
		{
			((bt)this).r().w().a("Updating Scion state (FE)");
	//   22   51:aload_0         
	//   23   52:invokevirtual   #71  <Method s bt.r()>
	//   24   55:invokevirtual   #77  <Method u s.w()>
	//   25   58:ldc1            #89  <String "Updating Scion state (FE)">
	//   26   60:invokevirtual   #84  <Method void com.google.android.gms.measurement.internal.u.a(String)>
			((ct)this).h().y();
	//   27   63:aload_0         
	//   28   64:invokevirtual   #93  <Method cv ct.h()>
	//   29   67:invokevirtual   #96  <Method void cv.y()>
			return;
	//   30   70:return          
		}
	}

	static void a(cd cd1)
	{
		cd1.C();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method void C()>
	//    2    4:return          
	}

	static void a(cd cd1, com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionaluserproperty)
	{
		cd1.d(conditionaluserproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #103 <Method void d(com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty)>
	//    3    5:return          
	}

	static void a(cd cd1, String s1, String s2, long l1, Bundle bundle, boolean flag, boolean flag1, 
			boolean flag2, String s3)
	{
		cd1.a(s1, s2, l1, bundle, flag, flag1, flag2, s3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:lload_3         
	//    4    4:aload           5
	//    5    6:iload           6
	//    6    8:iload           7
	//    7   10:iload           8
	//    8   12:aload           9
	//    9   14:invokespecial   #107 <Method void a(String, String, long, Bundle, boolean, boolean, boolean, String)>
	//   10   17:return          
	}

	private final void a(String s1, String s2, long l1, Bundle bundle, boolean flag, boolean flag1, 
			boolean flag2, String s3)
	{
		int i2;
		am.a(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #116 <Method String am.a(String)>
	//    2    4:pop             
		if(!((bt)this).t().d(s3, h.av))
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #41  <Method ew bt.t()>
	//*   5    9:aload           9
	//*   6   11:getstatic       #122 <Field i h.av>
	//*   7   14:invokevirtual   #125 <Method boolean ew.d(String, i)>
	//*   8   17:ifne            25
			am.a(s2);
	//    9   20:aload_2         
	//   10   21:invokestatic    #116 <Method String am.a(String)>
	//   11   24:pop             
		am.a(((Object) (bundle)));
	//   12   25:aload           5
	//   13   27:invokestatic    #128 <Method Object am.a(Object)>
	//   14   30:pop             
		((bt)this).d();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #130 <Method void bt.d()>
		((dq)this).E();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #133 <Method void dq.E()>
		if(!r.C())
	//*  19   39:aload_0         
	//*  20   40:getfield        #63  <Field ax r>
	//*  21   43:invokevirtual   #68  <Method boolean ax.C()>
	//*  22   46:ifne            62
		{
			((bt)this).r().w().a("Event not sent since app measurement is disabled");
	//   23   49:aload_0         
	//   24   50:invokevirtual   #71  <Method s bt.r()>
	//   25   53:invokevirtual   #77  <Method u s.w()>
	//   26   56:ldc1            #135 <String "Event not sent since app measurement is disabled">
	//   27   58:invokevirtual   #84  <Method void com.google.android.gms.measurement.internal.u.a(String)>
			return;
	//   28   61:return          
		}
		boolean flag4 = e;
	//   29   62:aload_0         
	//   30   63:getfield        #137 <Field boolean e>
	//   31   66:istore          16
		i2 = 0;
	//   32   68:iconst_0        
	//   33   69:istore          11
		if(flag4)
			break MISSING_BLOCK_LABEL_154;
	//   34   71:iload           16
	//   35   73:ifne            154
		e = true;
	//   36   76:aload_0         
	//   37   77:iconst_1        
	//   38   78:putfield        #137 <Field boolean e>
		Class class1 = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
	//   39   81:ldc1            #139 <String "com.google.android.gms.tagmanager.TagManagerService">
	//   40   83:invokestatic    #145 <Method Class Class.forName(String)>
	//   41   86:astore          18
		try
		{
			class1.getDeclaredMethod("initialize", new Class[] {
				android/content/Context
			}).invoke(((Object) (null)), new Object[] {
				((bt)this).n()
			});
	//   42   88:aload           18
	//   43   90:ldc1            #147 <String "initialize">
	//   44   92:iconst_1        
	//   45   93:anewarray       Class[]
	//   46   96:dup             
	//   47   97:iconst_0        
	//   48   98:ldc1            #149 <Class Context>
	//   49  100:aastore         
	//   50  101:invokevirtual   #153 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   51  104:aconst_null     
	//   52  105:iconst_1        
	//   53  106:anewarray       Object[]
	//   54  109:dup             
	//   55  110:iconst_0        
	//   56  111:aload_0         
	//   57  112:invokevirtual   #159 <Method Context bt.n()>
	//   58  115:aastore         
	//   59  116:invokevirtual   #165 <Method Object Method.invoke(Object, Object[])>
	//   60  119:pop             
		}
	//*  61  120:goto            154
		catch(Exception exception)
	//*  62  123:astore          18
		{
			try
			{
				((bt)this).r().i().a("Failed to invoke Tag Manager's initialize() method", ((Object) (exception)));
	//   63  125:aload_0         
	//   64  126:invokevirtual   #71  <Method s bt.r()>
	//   65  129:invokevirtual   #168 <Method u s.i()>
	//   66  132:ldc1            #170 <String "Failed to invoke Tag Manager's initialize() method">
	//   67  134:aload           18
	//   68  136:invokevirtual   #173 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
			}
	//*  69  139:goto            154
	//*  70  142:aload_0         
	//*  71  143:invokevirtual   #71  <Method s bt.r()>
	//*  72  146:invokevirtual   #176 <Method u s.v()>
	//*  73  149:ldc1            #178 <String "Tag Manager is not found and thus will not be used">
	//*  74  151:invokevirtual   #84  <Method void com.google.android.gms.measurement.internal.u.a(String)>
	//*  75  154:iload           8
	//*  76  156:ifeq            317
	//*  77  159:aload_0         
	//*  78  160:invokevirtual   #182 <Method eu bt.u()>
	//*  79  163:pop             
	//*  80  164:ldc1            #184 <String "_iap">
	//*  81  166:aload_2         
	//*  82  167:invokevirtual   #190 <Method boolean String.equals(Object)>
	//*  83  170:ifne            317
	//*  84  173:aload_0         
	//*  85  174:getfield        #63  <Field ax r>
	//*  86  177:invokevirtual   #193 <Method eo ax.j()>
	//*  87  180:astore          18
	//*  88  182:aload           18
	//*  89  184:ldc1            #195 <String "event">
	//*  90  186:aload_2         
	//*  91  187:invokevirtual   #200 <Method boolean com.google.android.gms.measurement.internal.eo.a(String, String)>
	//*  92  190:ifne            199
	//*  93  193:iconst_2        
	//*  94  194:istore          10
	//*  95  196:goto            242
	//*  96  199:aload           18
	//*  97  201:ldc1            #195 <String "event">
	//*  98  203:getstatic       #205 <Field String[] com.google.android.gms.measurement.internal.bw.a>
	//*  99  206:aload_2         
	//* 100  207:invokevirtual   #208 <Method boolean com.google.android.gms.measurement.internal.eo.a(String, String[], String)>
	//* 101  210:ifne            220
	//* 102  213:bipush          13
	//* 103  215:istore          10
	//* 104  217:goto            242
	//* 105  220:aload           18
	//* 106  222:ldc1            #195 <String "event">
	//* 107  224:bipush          40
	//* 108  226:aload_2         
	//* 109  227:invokevirtual   #211 <Method boolean com.google.android.gms.measurement.internal.eo.a(String, int, String)>
	//* 110  230:ifne            239
	//* 111  233:iconst_2        
	//* 112  234:istore          10
	//* 113  236:goto            242
	//* 114  239:iconst_0        
	//* 115  240:istore          10
	//* 116  242:iload           10
	//* 117  244:ifeq            317
	//* 118  247:aload_0         
	//* 119  248:invokevirtual   #71  <Method s bt.r()>
	//* 120  251:invokevirtual   #213 <Method u s.h()>
	//* 121  254:ldc1            #215 <String "Invalid public event name. Event will not be logged (FE)">
	//* 122  256:aload_0         
	//* 123  257:invokevirtual   #219 <Method q bt.o()>
	//* 124  260:aload_2         
	//* 125  261:invokevirtual   #222 <Method String com.google.android.gms.measurement.internal.q.a(String)>
	//* 126  264:invokevirtual   #173 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
	//* 127  267:aload_0         
	//* 128  268:getfield        #63  <Field ax r>
	//* 129  271:invokevirtual   #193 <Method eo ax.j()>
	//* 130  274:pop             
	//* 131  275:aload_2         
	//* 132  276:bipush          40
	//* 133  278:iconst_1        
	//* 134  279:invokestatic    #225 <Method String com.google.android.gms.measurement.internal.eo.a(String, int, boolean)>
	//* 135  282:astore_1        
	//* 136  283:aload_2         
	//* 137  284:ifnull          296
	//* 138  287:aload_2         
	//* 139  288:invokevirtual   #229 <Method int String.length()>
	//* 140  291:istore          11
	//* 141  293:goto            299
	//* 142  296:iconst_0        
	//* 143  297:istore          11
	//* 144  299:aload_0         
	//* 145  300:getfield        #63  <Field ax r>
	//* 146  303:invokevirtual   #193 <Method eo ax.j()>
	//* 147  306:iload           10
	//* 148  308:ldc1            #231 <String "_ev">
	//* 149  310:aload_1         
	//* 150  311:iload           11
	//* 151  313:invokevirtual   #234 <Method void com.google.android.gms.measurement.internal.eo.a(int, String, String, int)>
	//* 152  316:return          
	//* 153  317:aload_0         
	//* 154  318:invokevirtual   #182 <Method eu bt.u()>
	//* 155  321:pop             
	//* 156  322:aload_0         
	//* 157  323:invokevirtual   #237 <Method cr ct.i()>
	//* 158  326:invokevirtual   #242 <Method cq cr.x()>
	//* 159  329:astore          20
	//* 160  331:aload           20
	//* 161  333:ifnull          352
	//* 162  336:aload           5
	//* 163  338:ldc1            #244 <String "_sc">
	//* 164  340:invokevirtual   #249 <Method boolean Bundle.containsKey(String)>
	//* 165  343:ifne            352
	//* 166  346:aload           20
	//* 167  348:iconst_1        
	//* 168  349:putfield        #253 <Field boolean cq.d>
	//* 169  352:iload           6
	//* 170  354:ifeq            368
	//* 171  357:iload           8
	//* 172  359:ifeq            368
	//* 173  362:iconst_1        
	//* 174  363:istore          16
	//* 175  365:goto            371
	//* 176  368:iconst_0        
	//* 177  369:istore          16
	//* 178  371:aload           20
	//* 179  373:aload           5
	//* 180  375:iload           16
	//* 181  377:invokestatic    #256 <Method void com.google.android.gms.measurement.internal.cr.a(cq, Bundle, boolean)>
	//* 182  380:ldc2            #258 <String "am">
	//* 183  383:aload_1         
	//* 184  384:invokevirtual   #190 <Method boolean String.equals(Object)>
	//* 185  387:istore          16
	//* 186  389:aload_2         
	//* 187  390:invokestatic    #260 <Method boolean com.google.android.gms.measurement.internal.eo.e(String)>
	//* 188  393:istore          17
	//* 189  395:iload           6
	//* 190  397:ifeq            462
	//* 191  400:aload_0         
	//* 192  401:getfield        #262 <Field bz c>
	//* 193  404:ifnull          462
	//* 194  407:iload           17
	//* 195  409:ifne            462
	//* 196  412:iload           16
	//* 197  414:ifne            462
	//* 198  417:aload_0         
	//* 199  418:invokevirtual   #71  <Method s bt.r()>
	//* 200  421:invokevirtual   #77  <Method u s.w()>
	//* 201  424:ldc2            #264 <String "Passing event to registered event handler (FE)">
	//* 202  427:aload_0         
	//* 203  428:invokevirtual   #219 <Method q bt.o()>
	//* 204  431:aload_2         
	//* 205  432:invokevirtual   #222 <Method String com.google.android.gms.measurement.internal.q.a(String)>
	//* 206  435:aload_0         
	//* 207  436:invokevirtual   #219 <Method q bt.o()>
	//* 208  439:aload           5
	//* 209  441:invokevirtual   #267 <Method String com.google.android.gms.measurement.internal.q.a(Bundle)>
	//* 210  444:invokevirtual   #270 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
	//* 211  447:aload_0         
	//* 212  448:getfield        #262 <Field bz c>
	//* 213  451:aload_1         
	//* 214  452:aload_2         
	//* 215  453:aload           5
	//* 216  455:lload_3         
	//* 217  456:invokeinterface #275 <Method void com.google.android.gms.measurement.internal.bz.a(String, String, Bundle, long)>
	//* 218  461:return          
	//* 219  462:aload_0         
	//* 220  463:getfield        #63  <Field ax r>
	//* 221  466:invokevirtual   #278 <Method boolean ax.H()>
	//* 222  469:ifne            473
	//* 223  472:return          
	//* 224  473:aload_0         
	//* 225  474:invokevirtual   #281 <Method eo bt.p()>
	//* 226  477:aload_2         
	//* 227  478:invokevirtual   #284 <Method int eo.b(String)>
	//* 228  481:istore          12
	//* 229  483:iload           12
	//* 230  485:ifeq            556
	//* 231  488:aload_0         
	//* 232  489:invokevirtual   #71  <Method s bt.r()>
	//* 233  492:invokevirtual   #213 <Method u s.h()>
	//* 234  495:ldc2            #286 <String "Invalid event name. Event will not be logged (FE)">
	//* 235  498:aload_0         
	//* 236  499:invokevirtual   #219 <Method q bt.o()>
	//* 237  502:aload_2         
	//* 238  503:invokevirtual   #222 <Method String com.google.android.gms.measurement.internal.q.a(String)>
	//* 239  506:invokevirtual   #173 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
	//* 240  509:aload_0         
	//* 241  510:invokevirtual   #281 <Method eo bt.p()>
	//* 242  513:pop             
	//* 243  514:aload_2         
	//* 244  515:bipush          40
	//* 245  517:iconst_1        
	//* 246  518:invokestatic    #225 <Method String com.google.android.gms.measurement.internal.eo.a(String, int, boolean)>
	//* 247  521:astore_1        
	//* 248  522:iload           11
	//* 249  524:istore          10
	//* 250  526:aload_2         
	//* 251  527:ifnull          536
	//* 252  530:aload_2         
	//* 253  531:invokevirtual   #229 <Method int String.length()>
	//* 254  534:istore          10
	//* 255  536:aload_0         
	//* 256  537:getfield        #63  <Field ax r>
	//* 257  540:invokevirtual   #193 <Method eo ax.j()>
	//* 258  543:aload           9
	//* 259  545:iload           12
	//* 260  547:ldc1            #231 <String "_ev">
	//* 261  549:aload_1         
	//* 262  550:iload           10
	//* 263  552:invokevirtual   #289 <Method void com.google.android.gms.measurement.internal.eo.a(String, int, String, String, int)>
	//* 264  555:return          
	//* 265  556:iconst_4        
	//* 266  557:anewarray       String[]
	//* 267  560:dup             
	//* 268  561:iconst_0        
	//* 269  562:ldc2            #291 <String "_o">
	//* 270  565:aastore         
	//* 271  566:dup             
	//* 272  567:iconst_1        
	//* 273  568:ldc2            #293 <String "_sn">
	//* 274  571:aastore         
	//* 275  572:dup             
	//* 276  573:iconst_2        
	//* 277  574:ldc1            #244 <String "_sc">
	//* 278  576:aastore         
	//* 279  577:dup             
	//* 280  578:iconst_3        
	//* 281  579:ldc2            #295 <String "_si">
	//* 282  582:aastore         
	//* 283  583:invokestatic    #300 <Method List f.a(Object[])>
	//* 284  586:astore          22
	//* 285  588:aload_0         
	//* 286  589:invokevirtual   #281 <Method eo bt.p()>
	//* 287  592:aload           9
	//* 288  594:aload_2         
	//* 289  595:aload           5
	//* 290  597:aload           22
	//* 291  599:iload           8
	//* 292  601:iconst_1        
	//* 293  602:invokevirtual   #303 <Method Bundle com.google.android.gms.measurement.internal.eo.a(String, String, Bundle, List, boolean, boolean)>
	//* 294  605:astore          19
	//* 295  607:aload           19
	//* 296  609:ifnull          677
	//* 297  612:aload           19
	//* 298  614:ldc1            #244 <String "_sc">
	//* 299  616:invokevirtual   #249 <Method boolean Bundle.containsKey(String)>
	//* 300  619:ifeq            677
	//* 301  622:aload           19
	//* 302  624:ldc2            #295 <String "_si">
	//* 303  627:invokevirtual   #249 <Method boolean Bundle.containsKey(String)>
	//* 304  630:ifne            636
	//* 305  633:goto            677
	//* 306  636:new             #251 <Class cq>
	//* 307  639:dup             
	//* 308  640:aload           19
	//* 309  642:ldc2            #293 <String "_sn">
	//* 310  645:invokevirtual   #306 <Method String Bundle.getString(String)>
	//* 311  648:aload           19
	//* 312  650:ldc1            #244 <String "_sc">
	//* 313  652:invokevirtual   #306 <Method String Bundle.getString(String)>
	//* 314  655:aload           19
	//* 315  657:ldc2            #295 <String "_si">
	//* 316  660:invokevirtual   #310 <Method long Bundle.getLong(String)>
	//* 317  663:invokestatic    #316 <Method Long Long.valueOf(long)>
	//* 318  666:invokevirtual   #320 <Method long Long.longValue()>
	//* 319  669:invokespecial   #323 <Method void cq(String, String, long)>
	//* 320  672:astore          18
	//* 321  674:goto            680
	//* 322  677:aconst_null     
	//* 323  678:astore          18
	//* 324  680:aload           18
	//* 325  682:ifnonnull       688
	//* 326  685:goto            692
	//* 327  688:aload           18
	//* 328  690:astore          20
	//* 329  692:aload_0         
	//* 330  693:invokevirtual   #41  <Method ew bt.t()>
	//* 331  696:aload           9
	//* 332  698:invokevirtual   #325 <Method boolean ew.t(String)>
	//* 333  701:ifeq            756
	//* 334  704:aload_0         
	//* 335  705:invokevirtual   #182 <Method eu bt.u()>
	//* 336  708:pop             
	//* 337  709:aload_0         
	//* 338  710:invokevirtual   #237 <Method cr ct.i()>
	//* 339  713:invokevirtual   #242 <Method cq cr.x()>
	//* 340  716:ifnull          756
	//* 341  719:ldc2            #327 <String "_ae">
	//* 342  722:aload_2         
	//* 343  723:invokevirtual   #190 <Method boolean String.equals(Object)>
	//* 344  726:ifeq            756
	//* 345  729:aload_0         
	//* 346  730:invokevirtual   #331 <Method du ct.k()>
	//* 347  733:invokevirtual   #335 <Method long du.y()>
	//* 348  736:lstore          14
	//* 349  738:lload           14
	//* 350  740:lconst_0        
	//* 351  741:lcmp            
	//* 352  742:ifle            756
	//* 353  745:aload_0         
	//* 354  746:invokevirtual   #281 <Method eo bt.p()>
	//* 355  749:aload           19
	//* 356  751:lload           14
	//* 357  753:invokevirtual   #338 <Method void com.google.android.gms.measurement.internal.eo.a(Bundle, long)>
	//* 358  756:new             #340 <Class ArrayList>
	//* 359  759:dup             
	//* 360  760:invokespecial   #341 <Method void ArrayList()>
	//* 361  763:astore          18
	//* 362  765:aload           18
	//* 363  767:aload           19
	//* 364  769:invokeinterface #346 <Method boolean List.add(Object)>
	//* 365  774:pop             
	//* 366  775:aload_0         
	//* 367  776:invokevirtual   #281 <Method eo bt.p()>
	//* 368  779:invokevirtual   #349 <Method SecureRandom eo.h()>
	//* 369  782:invokevirtual   #354 <Method long SecureRandom.nextLong()>
	//* 370  785:lstore          14
	//* 371  787:aload_0         
	//* 372  788:invokevirtual   #41  <Method ew bt.t()>
	//* 373  791:aload_0         
	//* 374  792:invokevirtual   #47  <Method com.google.android.gms.measurement.internal.m ct.g()>
	//* 375  795:invokevirtual   #53  <Method String m.x()>
	//* 376  798:getstatic       #356 <Field i com.google.android.gms.measurement.internal.h.am>
	//* 377  801:invokevirtual   #125 <Method boolean ew.d(String, i)>
	//* 378  804:ifeq            939
	//* 379  807:aload_0         
	//* 380  808:invokevirtual   #360 <Method ae bt.s()>
	//* 381  811:getfield        #365 <Field ah ae.n>
	//* 382  814:invokevirtual   #369 <Method long com.google.android.gms.measurement.internal.ah.a()>
	//* 383  817:lconst_0        
	//* 384  818:lcmp            
	//* 385  819:ifle            939
	//* 386  822:aload_0         
	//* 387  823:invokevirtual   #360 <Method ae bt.s()>
	//* 388  826:lload_3         
	//* 389  827:invokevirtual   #372 <Method boolean com.google.android.gms.measurement.internal.ae.a(long)>
	//* 390  830:ifeq            939
	//* 391  833:aload_0         
	//* 392  834:invokevirtual   #360 <Method ae bt.s()>
	//* 393  837:getfield        #376 <Field ag ae.q>
	//* 394  840:invokevirtual   #380 <Method boolean com.google.android.gms.measurement.internal.ag.a()>
	//* 395  843:ifeq            939
	//* 396  846:aload_0         
	//* 397  847:invokevirtual   #71  <Method s bt.r()>
	//* 398  850:invokevirtual   #382 <Method u s.x()>
	//* 399  853:ldc2            #384 <String "Current session is expired, remove the session number and Id">
	//* 400  856:invokevirtual   #84  <Method void com.google.android.gms.measurement.internal.u.a(String)>
	//* 401  859:aload_0         
	//* 402  860:invokevirtual   #41  <Method ew bt.t()>
	//* 403  863:aload_0         
	//* 404  864:invokevirtual   #47  <Method com.google.android.gms.measurement.internal.m ct.g()>
	//* 405  867:invokevirtual   #53  <Method String m.x()>
	//* 406  870:getstatic       #387 <Field i h.ai>
	//* 407  873:invokevirtual   #125 <Method boolean ew.d(String, i)>
	//* 408  876:ifeq            899
	//* 409  879:aload_0         
	//* 410  880:ldc2            #389 <String "auto">
	//* 411  883:ldc2            #391 <String "_sid">
	//* 412  886:aconst_null     
	//* 413  887:aload_0         
	//* 414  888:invokevirtual   #395 <Method e com.google.android.gms.measurement.internal.bt.m()>
	//* 415  891:invokeinterface #398 <Method long e.a()>
	//* 416  896:invokevirtual   #401 <Method void a(String, String, Object, long)>
	//* 417  899:aload_0         
	//* 418  900:invokevirtual   #41  <Method ew bt.t()>
	//* 419  903:aload_0         
	//* 420  904:invokevirtual   #47  <Method com.google.android.gms.measurement.internal.m ct.g()>
	//* 421  907:invokevirtual   #53  <Method String m.x()>
	//* 422  910:getstatic       #404 <Field i h.aj>
	//* 423  913:invokevirtual   #125 <Method boolean ew.d(String, i)>
	//* 424  916:ifeq            939
	//* 425  919:aload_0         
	//* 426  920:ldc2            #389 <String "auto">
	//* 427  923:ldc2            #406 <String "_sno">
	//* 428  926:aconst_null     
	//* 429  927:aload_0         
	//* 430  928:invokevirtual   #395 <Method e com.google.android.gms.measurement.internal.bt.m()>
	//* 431  931:invokeinterface #398 <Method long e.a()>
	//* 432  936:invokevirtual   #401 <Method void a(String, String, Object, long)>
	//* 433  939:aload_0         
	//* 434  940:invokevirtual   #41  <Method ew bt.t()>
	//* 435  943:aload_0         
	//* 436  944:invokevirtual   #47  <Method com.google.android.gms.measurement.internal.m ct.g()>
	//* 437  947:invokevirtual   #53  <Method String m.x()>
	//* 438  950:invokevirtual   #408 <Method boolean ew.s(String)>
	//* 439  953:ifeq            1001
	//* 440  956:aload           19
	//* 441  958:ldc2            #410 <String "extend_session">
	//* 442  961:lconst_0        
	//* 443  962:invokevirtual   #413 <Method long Bundle.getLong(String, long)>
	//* 444  965:lconst_1        
	//* 445  966:lcmp            
	//* 446  967:ifne            998
	//* 447  970:aload_0         
	//* 448  971:invokevirtual   #71  <Method s bt.r()>
	//* 449  974:invokevirtual   #382 <Method u s.x()>
	//* 450  977:ldc2            #415 <String "EXTEND_SESSION param attached: initiate a new session or extend the current active session">
	//* 451  980:invokevirtual   #84  <Method void com.google.android.gms.measurement.internal.u.a(String)>
	//* 452  983:aload_0         
	//* 453  984:getfield        #63  <Field ax r>
	//* 454  987:invokevirtual   #417 <Method du com.google.android.gms.measurement.internal.ax.e()>
	//* 455  990:lload_3         
	//* 456  991:iconst_1        
	//* 457  992:invokevirtual   #420 <Method void com.google.android.gms.measurement.internal.du.a(long, boolean)>
	//* 458  995:goto            1001
	//* 459  998:goto            1001
	//* 460 1001:aload           19
	//* 461 1003:invokevirtual   #424 <Method Set Bundle.keySet()>
	//* 462 1006:aload           5
	//* 463 1008:invokevirtual   #427 <Method int Bundle.size()>
	//* 464 1011:anewarray       String[]
	//* 465 1014:invokeinterface #433 <Method Object[] Set.toArray(Object[])>
	//* 466 1019:checkcast       #434 <Class String[]>
	//* 467 1022:astore          21
	//* 468 1024:aload           21
	//* 469 1026:invokestatic    #440 <Method void Arrays.sort(Object[])>
	//* 470 1029:aload           21
	//* 471 1031:arraylength     
	//* 472 1032:istore          10
	//* 473 1034:iconst_0        
	//* 474 1035:istore          11
	//* 475 1037:iconst_0        
	//* 476 1038:istore          12
	//* 477 1040:aload           18
	//* 478 1042:astore          5
	//* 479 1044:aload           22
	//* 480 1046:astore          18
	//* 481 1048:iload           11
	//* 482 1050:iload           10
	//* 483 1052:icmpge          1298
	//* 484 1055:aload           21
	//* 485 1057:iload           11
	//* 486 1059:aaload          
	//* 487 1060:astore          23
	//* 488 1062:aload           19
	//* 489 1064:aload           23
	//* 490 1066:invokevirtual   #444 <Method Object Bundle.get(String)>
	//* 491 1069:astore          22
	//* 492 1071:aload_0         
	//* 493 1072:invokevirtual   #281 <Method eo bt.p()>
	//* 494 1075:pop             
	//* 495 1076:aload           22
	//* 496 1078:invokestatic    #447 <Method Bundle[] com.google.android.gms.measurement.internal.eo.a(Object)>
	//* 497 1081:astore          22
	//* 498 1083:aload           22
	//* 499 1085:ifnull          1245
	//* 500 1088:aload           19
	//* 501 1090:aload           23
	//* 502 1092:aload           22
	//* 503 1094:arraylength     
	//* 504 1095:invokevirtual   #451 <Method void Bundle.putInt(String, int)>
	//* 505 1098:iconst_0        
	//* 506 1099:istore          13
	//* 507 1101:iload           13
	//* 508 1103:aload           22
	//* 509 1105:arraylength     
	//* 510 1106:icmpge          1214
	//* 511 1109:aload           22
	//* 512 1111:iload           13
	//* 513 1113:aaload          
	//* 514 1114:astore          24
	//* 515 1116:aload           20
	//* 516 1118:aload           24
	//* 517 1120:iconst_1        
	//* 518 1121:invokestatic    #256 <Method void com.google.android.gms.measurement.internal.cr.a(cq, Bundle, boolean)>
	//* 519 1124:aload_0         
	//* 520 1125:invokevirtual   #281 <Method eo bt.p()>
	//* 521 1128:aload           9
	//* 522 1130:ldc2            #453 <String "_ep">
	//* 523 1133:aload           24
	//* 524 1135:aload           18
	//* 525 1137:iload           8
	//* 526 1139:iconst_0        
	//* 527 1140:invokevirtual   #303 <Method Bundle com.google.android.gms.measurement.internal.eo.a(String, String, Bundle, List, boolean, boolean)>
	//* 528 1143:astore          24
	//* 529 1145:aload           24
	//* 530 1147:ldc2            #455 <String "_en">
	//* 531 1150:aload_2         
	//* 532 1151:invokevirtual   #459 <Method void Bundle.putString(String, String)>
	//* 533 1154:aload           24
	//* 534 1156:ldc2            #461 <String "_eid">
	//* 535 1159:lload           14
	//* 536 1161:invokevirtual   #465 <Method void Bundle.putLong(String, long)>
	//* 537 1164:aload           24
	//* 538 1166:ldc2            #467 <String "_gn">
	//* 539 1169:aload           23
	//* 540 1171:invokevirtual   #459 <Method void Bundle.putString(String, String)>
	//* 541 1174:aload           24
	//* 542 1176:ldc2            #469 <String "_ll">
	//* 543 1179:aload           22
	//* 544 1181:arraylength     
	//* 545 1182:invokevirtual   #451 <Method void Bundle.putInt(String, int)>
	//* 546 1185:aload           24
	//* 547 1187:ldc2            #471 <String "_i">
	//* 548 1190:iload           13
	//* 549 1192:invokevirtual   #451 <Method void Bundle.putInt(String, int)>
	//* 550 1195:aload           5
	//* 551 1197:aload           24
	//* 552 1199:invokeinterface #346 <Method boolean List.add(Object)>
	//* 553 1204:pop             
	//* 554 1205:iload           13
	//* 555 1207:iconst_1        
	//* 556 1208:iadd            
	//* 557 1209:istore          13
	//* 558 1211:goto            1101
	//* 559 1214:aload           18
	//* 560 1216:astore          23
	//* 561 1218:aload           20
	//* 562 1220:astore          18
	//* 563 1222:iload           12
	//* 564 1224:aload           22
	//* 565 1226:arraylength     
	//* 566 1227:iadd            
	//* 567 1228:istore          12
	//* 568 1230:aload           19
	//* 569 1232:astore          20
	//* 570 1234:aload           5
	//* 571 1236:astore          19
	//* 572 1238:aload           23
	//* 573 1240:astore          5
	//* 574 1242:goto            1269
	//* 575 1245:aload           5
	//* 576 1247:astore          22
	//* 577 1249:aload           20
	//* 578 1251:astore          23
	//* 579 1253:aload           19
	//* 580 1255:astore          20
	//* 581 1257:aload           18
	//* 582 1259:astore          5
	//* 583 1261:aload           23
	//* 584 1263:astore          18
	//* 585 1265:aload           22
	//* 586 1267:astore          19
	//* 587 1269:iload           11
	//* 588 1271:iconst_1        
	//* 589 1272:iadd            
	//* 590 1273:istore          11
	//* 591 1275:aload           20
	//* 592 1277:astore          22
	//* 593 1279:aload           18
	//* 594 1281:astore          20
	//* 595 1283:aload           5
	//* 596 1285:astore          18
	//* 597 1287:aload           19
	//* 598 1289:astore          5
	//* 599 1291:aload           22
	//* 600 1293:astore          19
	//* 601 1295:goto            1048
	//* 602 1298:iload           12
	//* 603 1300:ifeq            1323
	//* 604 1303:aload           19
	//* 605 1305:ldc2            #461 <String "_eid">
	//* 606 1308:lload           14
	//* 607 1310:invokevirtual   #465 <Method void Bundle.putLong(String, long)>
	//* 608 1313:aload           19
	//* 609 1315:ldc2            #473 <String "_epc">
	//* 610 1318:iload           12
	//* 611 1320:invokevirtual   #451 <Method void Bundle.putInt(String, int)>
	//* 612 1323:iconst_0        
	//* 613 1324:istore          10
	//* 614 1326:iload           10
	//* 615 1328:aload           5
	//* 616 1330:invokeinterface #474 <Method int List.size()>
	//* 617 1335:icmpge          1538
	//* 618 1338:aload           5
	//* 619 1340:iload           10
	//* 620 1342:invokeinterface #477 <Method Object List.get(int)>
	//* 621 1347:checkcast       #246 <Class Bundle>
	//* 622 1350:astore          19
	//* 623 1352:iload           10
	//* 624 1354:ifeq            1363
	//* 625 1357:iconst_1        
	//* 626 1358:istore          11
	//* 627 1360:goto            1366
	//* 628 1363:iconst_0        
	//* 629 1364:istore          11
	//* 630 1366:iload           11
	//* 631 1368:ifeq            1379
	//* 632 1371:ldc2            #453 <String "_ep">
	//* 633 1374:astore          18
	//* 634 1376:goto            1382
	//* 635 1379:aload_2         
	//* 636 1380:astore          18
	//* 637 1382:aload           19
	//* 638 1384:ldc2            #291 <String "_o">
	//* 639 1387:aload_1         
	//* 640 1388:invokevirtual   #459 <Method void Bundle.putString(String, String)>
	//* 641 1391:iload           7
	//* 642 1393:ifeq            1410
	//* 643 1396:aload_0         
	//* 644 1397:invokevirtual   #281 <Method eo bt.p()>
	//* 645 1400:aload           19
	//* 646 1402:invokevirtual   #480 <Method Bundle com.google.android.gms.measurement.internal.eo.a(Bundle)>
	//* 647 1405:astore          19
	//* 648 1407:goto            1410
	//* 649 1410:aload_0         
	//* 650 1411:invokevirtual   #71  <Method s bt.r()>
	//* 651 1414:invokevirtual   #77  <Method u s.w()>
	//* 652 1417:ldc2            #482 <String "Logging event (FE)">
	//* 653 1420:aload_0         
	//* 654 1421:invokevirtual   #219 <Method q bt.o()>
	//* 655 1424:aload_2         
	//* 656 1425:invokevirtual   #222 <Method String com.google.android.gms.measurement.internal.q.a(String)>
	//* 657 1428:aload_0         
	//* 658 1429:invokevirtual   #219 <Method q bt.o()>
	//* 659 1432:aload           19
	//* 660 1434:invokevirtual   #267 <Method String com.google.android.gms.measurement.internal.q.a(Bundle)>
	//* 661 1437:invokevirtual   #270 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
	//* 662 1440:new             #484 <Class zzag>
	//* 663 1443:dup             
	//* 664 1444:aload           18
	//* 665 1446:new             #486 <Class zzad>
	//* 666 1449:dup             
	//* 667 1450:aload           19
	//* 668 1452:invokespecial   #489 <Method void zzad(Bundle)>
	//* 669 1455:aload_1         
	//* 670 1456:lload_3         
	//* 671 1457:invokespecial   #492 <Method void zzag(String, zzad, String, long)>
	//* 672 1460:astore          18
	//* 673 1462:aload_0         
	//* 674 1463:invokevirtual   #93  <Method cv ct.h()>
	//* 675 1466:aload           18
	//* 676 1468:aload           9
	//* 677 1470:invokevirtual   #495 <Method void com.google.android.gms.measurement.internal.cv.a(zzag, String)>
	//* 678 1473:iload           16
	//* 679 1475:ifne            1529
	//* 680 1478:aload_0         
	//* 681 1479:getfield        #26  <Field Set d>
	//* 682 1482:invokeinterface #499 <Method Iterator Set.iterator()>
	//* 683 1487:astore          18
	//* 684 1489:aload           18
	//* 685 1491:invokeinterface #504 <Method boolean Iterator.hasNext()>
	//* 686 1496:ifeq            1529
	//* 687 1499:aload           18
	//* 688 1501:invokeinterface #508 <Method Object Iterator.next()>
	//* 689 1506:checkcast       #510 <Class ca>
	//* 690 1509:aload_1         
	//* 691 1510:aload_2         
	//* 692 1511:new             #246 <Class Bundle>
	//* 693 1514:dup             
	//* 694 1515:aload           19
	//* 695 1517:invokespecial   #511 <Method void Bundle(Bundle)>
	//* 696 1520:lload_3         
	//* 697 1521:invokeinterface #514 <Method void ca.onEvent(String, String, Bundle, long)>
	//* 698 1526:goto            1489
	//* 699 1529:iload           10
	//* 700 1531:iconst_1        
	//* 701 1532:iadd            
	//* 702 1533:istore          10
	//* 703 1535:goto            1326
	//* 704 1538:aload_0         
	//* 705 1539:invokevirtual   #182 <Method eu bt.u()>
	//* 706 1542:pop             
	//* 707 1543:aload_0         
	//* 708 1544:invokevirtual   #237 <Method cr ct.i()>
	//* 709 1547:invokevirtual   #242 <Method cq cr.x()>
	//* 710 1550:ifnull          1573
	//* 711 1553:ldc2            #327 <String "_ae">
	//* 712 1556:aload_2         
	//* 713 1557:invokevirtual   #190 <Method boolean String.equals(Object)>
	//* 714 1560:ifeq            1573
	//* 715 1563:aload_0         
	//* 716 1564:invokevirtual   #331 <Method du ct.k()>
	//* 717 1567:iconst_1        
	//* 718 1568:iconst_1        
	//* 719 1569:invokevirtual   #517 <Method boolean com.google.android.gms.measurement.internal.du.a(boolean, boolean)>
	//* 720 1572:pop             
	//* 721 1573:return          
			// Misplaced declaration of an exception variable
			catch(ClassNotFoundException classnotfoundexception)
			{
				((bt)this).r().v().a("Tag Manager is not found and thus will not be used");
			}
		}
		ClassNotFoundException classnotfoundexception;
		if(flag2)
		{
			((bt)this).u();
			if(!"_iap".equals(((Object) (s2))))
			{
				eo eo1 = r.j();
				byte byte0;
				if(!eo1.a("event", s2))
					byte0 = 2;
				else
				if(!eo1.a("event", com.google.android.gms.measurement.internal.bw.a, s2))
					byte0 = 13;
				else
				if(!eo1.a("event", 40, s2))
					byte0 = 2;
				else
					byte0 = 0;
				if(byte0 != 0)
				{
					((bt)this).r().h().a("Invalid public event name. Event will not be logged (FE)", ((Object) (((bt)this).o().a(s2))));
					r.j();
					s1 = com.google.android.gms.measurement.internal.eo.a(s2, 40, true);
					if(s2 != null)
						i2 = s2.length();
					else
						i2 = 0;
					r.j().a(((int) (byte0)), "_ev", s1, i2);
					return;
				}
			}
		}
		((bt)this).u();
		Object obj3 = ((Object) (((ct)this).i().x()));
		if(obj3 != null && !bundle.containsKey("_sc"))
			obj3.d = true;
		boolean flag5;
		if(flag && flag2)
			flag5 = true;
		else
			flag5 = false;
		com.google.android.gms.measurement.internal.cr.a(((cq) (obj3)), bundle, flag5);
		flag5 = "am".equals(((Object) (s1)));
		boolean flag6 = com.google.android.gms.measurement.internal.eo.e(s2);
		if(flag && c != null && !flag6 && !flag5)
		{
			((bt)this).r().w().a("Passing event to registered event handler (FE)", ((Object) (((bt)this).o().a(s2))), ((Object) (((bt)this).o().a(bundle))));
			c.a(s1, s2, bundle, l1);
			return;
		}
		if(!r.H())
			return;
		int j2 = ((bt)this).p().b(s2);
		if(j2 != 0)
		{
			((bt)this).r().h().a("Invalid event name. Event will not be logged (FE)", ((Object) (((bt)this).o().a(s2))));
			((bt)this).p();
			s1 = com.google.android.gms.measurement.internal.eo.a(s2, 40, true);
			int i1 = i2;
			if(s2 != null)
				i1 = s2.length();
			r.j().a(s3, j2, "_ev", s1, i1);
			return;
		}
		List list = com.google.android.gms.common.util.f.a(((Object []) (new String[] {
			"_o", "_sn", "_sc", "_si"
		})));
		Object obj2 = ((Object) (((bt)this).p().a(s3, s2, bundle, list, flag2, true)));
		Object obj;
		if(obj2 != null && ((Bundle) (obj2)).containsKey("_sc") && ((Bundle) (obj2)).containsKey("_si"))
			obj = ((Object) (new cq(((Bundle) (obj2)).getString("_sn"), ((Bundle) (obj2)).getString("_sc"), Long.valueOf(((Bundle) (obj2)).getLong("_si")).longValue())));
		else
			obj = null;
		if(obj != null)
			obj3 = obj;
		if(((bt)this).t().t(s3))
		{
			((bt)this).u();
			if(((ct)this).i().x() != null && "_ae".equals(((Object) (s2))))
			{
				long l2 = ((ct)this).k().y();
				if(l2 > 0L)
					((bt)this).p().a(((Bundle) (obj2)), l2);
			}
		}
		obj = ((Object) (new ArrayList()));
		((List) (obj)).add(obj2);
		long l3 = ((bt)this).p().h().nextLong();
		if(((bt)this).t().d(((ct)this).g().x(), com.google.android.gms.measurement.internal.h.am) && ((bt)this).s().n.a() > 0L && ((bt)this).s().a(l1) && ((bt)this).s().q.a())
		{
			((bt)this).r().x().a("Current session is expired, remove the session number and Id");
			if(((bt)this).t().d(((ct)this).g().x(), h.ai))
				a("auto", "_sid", ((Object) (null)), ((bt)this).m().a());
			if(((bt)this).t().d(((ct)this).g().x(), h.aj))
				a("auto", "_sno", ((Object) (null)), ((bt)this).m().a());
		}
		if(((bt)this).t().s(((ct)this).g().x()) && ((Bundle) (obj2)).getLong("extend_session", 0L) == 1L)
		{
			((bt)this).r().x().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
			r.e().a(l1, true);
		}
		String as1[] = (String[])((Bundle) (obj2)).keySet().toArray(((Object []) (new String[bundle.size()])));
		Arrays.sort(((Object []) (as1)));
		int j1 = as1.length;
		i2 = 0;
		j2 = 0;
		bundle = ((Bundle) (obj));
		obj = ((Object) (list));
		while(i2 < j1) 
		{
			Object obj5 = ((Object) (as1[i2]));
			Object obj4 = ((Bundle) (obj2)).get(((String) (obj5)));
			((bt)this).p();
			Bundle abundle[] = com.google.android.gms.measurement.internal.eo.a(obj4);
			if(abundle != null)
			{
				((Bundle) (obj2)).putInt(((String) (obj5)), abundle.length);
				for(int k2 = 0; k2 < abundle.length; k2++)
				{
					Bundle bundle2 = abundle[k2];
					com.google.android.gms.measurement.internal.cr.a(((cq) (obj3)), bundle2, true);
					bundle2 = ((bt)this).p().a(s3, "_ep", bundle2, ((List) (obj)), flag2, false);
					bundle2.putString("_en", s2);
					bundle2.putLong("_eid", l3);
					bundle2.putString("_gn", ((String) (obj5)));
					bundle2.putInt("_ll", abundle.length);
					bundle2.putInt("_i", k2);
					((List) (bundle)).add(((Object) (bundle2)));
				}

				obj5 = obj;
				obj = obj3;
				j2 += abundle.length;
				obj3 = obj2;
				obj2 = ((Object) (bundle));
				bundle = ((Bundle) (obj5));
			} else
			{
				abundle = ((Bundle []) (bundle));
				Object obj6 = obj3;
				obj3 = obj2;
				bundle = ((Bundle) (obj));
				obj = obj6;
				obj2 = ((Object) (abundle));
			}
			i2++;
			abundle = ((Bundle []) (obj3));
			obj3 = obj;
			obj = ((Object) (bundle));
			bundle = ((Bundle) (obj2));
			obj2 = ((Object) (abundle));
		}
		if(j2 != 0)
		{
			((Bundle) (obj2)).putLong("_eid", l3);
			((Bundle) (obj2)).putInt("_epc", j2);
		}
		for(int k1 = 0; k1 < ((List) (bundle)).size(); k1++)
		{
			Bundle bundle1 = (Bundle)((List) (bundle)).get(k1);
			boolean flag3;
			if(k1 != 0)
				flag3 = true;
			else
				flag3 = false;
			Object obj1;
			if(flag3)
				obj1 = "_ep";
			else
				obj1 = ((Object) (s2));
			bundle1.putString("_o", s1);
			if(flag1)
				bundle1 = ((bt)this).p().a(bundle1);
			((bt)this).r().w().a("Logging event (FE)", ((Object) (((bt)this).o().a(s2))), ((Object) (((bt)this).o().a(bundle1))));
			obj1 = ((Object) (new zzag(((String) (obj1)), new zzad(bundle1), s1, l1)));
			((ct)this).h().a(((zzag) (obj1)), s3);
			if(flag5)
				continue;
			for(Iterator iterator = d.iterator(); iterator.hasNext(); ((ca)iterator.next()).onEvent(s1, s2, new Bundle(bundle1), l1));
		}

		((bt)this).u();
		if(((ct)this).i().x() != null && "_ae".equals(((Object) (s2))))
			((ct)this).k().a(true, true);
		return;
	//* 722 1574:astore          18
	//* 723 1576:goto            142
	}

	private final void a(String s1, String s2, long l1, Object obj)
	{
		((bt)this).q().a(((Runnable) (new cg(this, s1, s2, obj, l1))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #521 <Method as bt.q()>
	//    2    4:new             #523 <Class cg>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload           5
	//    8   13:lload_3         
	//    9   14:invokespecial   #526 <Method void cg(cd, String, String, Object, long)>
	//   10   17:invokevirtual   #531 <Method void com.google.android.gms.measurement.internal.as.a(Runnable)>
	//   11   20:return          
	}

	private final List b(String s1, String s2, String s3)
	{
		if(((bt)this).q().g())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #521 <Method as bt.q()>
	//*   2    4:invokevirtual   #536 <Method boolean as.g()>
	//*   3    7:ifeq            27
		{
			((bt)this).r().u_().a("Cannot get conditional user properties from analytics worker thread");
	//    4   10:aload_0         
	//    5   11:invokevirtual   #71  <Method s bt.r()>
	//    6   14:invokevirtual   #539 <Method u s.u_()>
	//    7   17:ldc2            #541 <String "Cannot get conditional user properties from analytics worker thread">
	//    8   20:invokevirtual   #84  <Method void com.google.android.gms.measurement.internal.u.a(String)>
			return Collections.emptyList();
	//    9   23:invokestatic    #547 <Method List Collections.emptyList()>
	//   10   26:areturn         
		}
		if(com.google.android.gms.measurement.internal.eu.a())
	//*  11   27:invokestatic    #550 <Method boolean com.google.android.gms.measurement.internal.eu.a()>
	//*  12   30:ifeq            50
		{
			((bt)this).r().u_().a("Cannot get conditional user properties from main thread");
	//   13   33:aload_0         
	//   14   34:invokevirtual   #71  <Method s bt.r()>
	//   15   37:invokevirtual   #539 <Method u s.u_()>
	//   16   40:ldc2            #552 <String "Cannot get conditional user properties from main thread">
	//   17   43:invokevirtual   #84  <Method void com.google.android.gms.measurement.internal.u.a(String)>
			return Collections.emptyList();
	//   18   46:invokestatic    #547 <Method List Collections.emptyList()>
	//   19   49:areturn         
		}
		Object obj = ((Object) (new AtomicReference()));
	//   20   50:new             #30  <Class AtomicReference>
	//   21   53:dup             
	//   22   54:invokespecial   #31  <Method void AtomicReference()>
	//   23   57:astore          4
		obj;
	//   24   59:aload           4
		JVM INSTR monitorenter ;
	//   25   61:monitorenter    
		r.q().a(((Runnable) (new ck(this, ((AtomicReference) (obj)), s1, s2, s3))));
	//   26   62:aload_0         
	//   27   63:getfield        #63  <Field ax r>
	//   28   66:invokevirtual   #553 <Method as ax.q()>
	//   29   69:new             #555 <Class ck>
	//   30   72:dup             
	//   31   73:aload_0         
	//   32   74:aload           4
	//   33   76:aload_1         
	//   34   77:aload_2         
	//   35   78:aload_3         
	//   36   79:invokespecial   #558 <Method void ck(cd, AtomicReference, String, String, String)>
	//   37   82:invokevirtual   #531 <Method void com.google.android.gms.measurement.internal.as.a(Runnable)>
		try
		{
			obj.wait(5000L);
	//   38   85:aload           4
	//   39   87:ldc2w           #559 <Long 5000L>
	//   40   90:invokevirtual   #564 <Method void Object.wait(long)>
			break MISSING_BLOCK_LABEL_112;
	//   41   93:goto            112
		}
		// Misplaced declaration of an exception variable
		catch(String s2) { }
	//   42   96:astore_2        
		((bt)this).r().i().a("Interrupted waiting for get conditional user properties", ((Object) (s1)), ((Object) (s2)));
	//   43   97:aload_0         
	//   44   98:invokevirtual   #71  <Method s bt.r()>
	//   45  101:invokevirtual   #168 <Method u s.i()>
	//   46  104:ldc2            #566 <String "Interrupted waiting for get conditional user properties">
	//   47  107:aload_1         
	//   48  108:aload_2         
	//   49  109:invokevirtual   #270 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		obj;
	//   50  112:aload           4
		JVM INSTR monitorexit ;
	//   51  114:monitorexit     
		s2 = ((String) ((List)((AtomicReference) (obj)).get()));
	//   52  115:aload           4
	//   53  117:invokevirtual   #568 <Method Object AtomicReference.get()>
	//   54  120:checkcast       #343 <Class List>
	//   55  123:astore_2        
		if(s2 == null)
	//*  56  124:aload_2         
	//*  57  125:ifnonnull       146
		{
			((bt)this).r().i().a("Timed out waiting for get conditional user properties", ((Object) (s1)));
	//   58  128:aload_0         
	//   59  129:invokevirtual   #71  <Method s bt.r()>
	//   60  132:invokevirtual   #168 <Method u s.i()>
	//   61  135:ldc2            #570 <String "Timed out waiting for get conditional user properties">
	//   62  138:aload_1         
	//   63  139:invokevirtual   #173 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
			return Collections.emptyList();
	//   64  142:invokestatic    #547 <Method List Collections.emptyList()>
	//   65  145:areturn         
		}
		s1 = ((String) (new ArrayList(((List) (s2)).size())));
	//   66  146:new             #340 <Class ArrayList>
	//   67  149:dup             
	//   68  150:aload_2         
	//   69  151:invokeinterface #474 <Method int List.size()>
	//   70  156:invokespecial   #573 <Method void ArrayList(int)>
	//   71  159:astore_1        
		for(s2 = ((String) (((List) (s2)).iterator())); ((Iterator) (s2)).hasNext(); ((List) (s1)).add(obj))
	//*  72  160:aload_2         
	//*  73  161:invokeinterface #574 <Method Iterator List.iterator()>
	//*  74  166:astore_2        
	//*  75  167:aload_2         
	//*  76  168:invokeinterface #504 <Method boolean Iterator.hasNext()>
	//*  77  173:ifeq            438
		{
			s3 = ((String) ((zzo)((Iterator) (s2)).next()));
	//   78  176:aload_2         
	//   79  177:invokeinterface #508 <Method Object Iterator.next()>
	//   80  182:checkcast       #576 <Class zzo>
	//   81  185:astore_3        
			obj = ((Object) (new com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty()));
	//   82  186:new             #578 <Class com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty>
	//   83  189:dup             
	//   84  190:invokespecial   #579 <Method void com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty()>
	//   85  193:astore          4
			obj.mAppId = ((zzo) (s3)).a;
	//   86  195:aload           4
	//   87  197:aload_3         
	//   88  198:getfield        #582 <Field String com.google.android.gms.measurement.internal.zzo.a>
	//   89  201:putfield        #585 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mAppId>
			obj.mOrigin = ((zzo) (s3)).b;
	//   90  204:aload           4
	//   91  206:aload_3         
	//   92  207:getfield        #587 <Field String zzo.b>
	//   93  210:putfield        #590 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mOrigin>
			obj.mCreationTimestamp = ((zzo) (s3)).d;
	//   94  213:aload           4
	//   95  215:aload_3         
	//   96  216:getfield        #593 <Field long zzo.d>
	//   97  219:putfield        #596 <Field long com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mCreationTimestamp>
			obj.mName = ((zzo) (s3)).c.a;
	//   98  222:aload           4
	//   99  224:aload_3         
	//  100  225:getfield        #599 <Field zzfu zzo.c>
	//  101  228:getfield        #602 <Field String com.google.android.gms.measurement.internal.zzfu.a>
	//  102  231:putfield        #605 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mName>
			obj.mValue = ((zzo) (s3)).c.a();
	//  103  234:aload           4
	//  104  236:aload_3         
	//  105  237:getfield        #599 <Field zzfu zzo.c>
	//  106  240:invokevirtual   #607 <Method Object com.google.android.gms.measurement.internal.zzfu.a()>
	//  107  243:putfield        #611 <Field Object com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mValue>
			obj.mActive = ((zzo) (s3)).e;
	//  108  246:aload           4
	//  109  248:aload_3         
	//  110  249:getfield        #612 <Field boolean com.google.android.gms.measurement.internal.zzo.e>
	//  111  252:putfield        #615 <Field boolean com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mActive>
			obj.mTriggerEventName = ((zzo) (s3)).f;
	//  112  255:aload           4
	//  113  257:aload_3         
	//  114  258:getfield        #617 <Field String com.google.android.gms.measurement.internal.zzo.f>
	//  115  261:putfield        #620 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTriggerEventName>
			if(((zzo) (s3)).g != null)
	//* 116  264:aload_3         
	//* 117  265:getfield        #623 <Field zzag zzo.g>
	//* 118  268:ifnull          308
			{
				obj.mTimedOutEventName = ((zzo) (s3)).g.a;
	//  119  271:aload           4
	//  120  273:aload_3         
	//  121  274:getfield        #623 <Field zzag zzo.g>
	//  122  277:getfield        #624 <Field String com.google.android.gms.measurement.internal.zzag.a>
	//  123  280:putfield        #627 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTimedOutEventName>
				if(((zzo) (s3)).g.b != null)
	//* 124  283:aload_3         
	//* 125  284:getfield        #623 <Field zzag zzo.g>
	//* 126  287:getfield        #630 <Field zzad zzag.b>
	//* 127  290:ifnull          308
					obj.mTimedOutEventParams = ((zzo) (s3)).g.b.b();
	//  128  293:aload           4
	//  129  295:aload_3         
	//  130  296:getfield        #623 <Field zzag zzo.g>
	//  131  299:getfield        #630 <Field zzad zzag.b>
	//  132  302:invokevirtual   #633 <Method Bundle zzad.b()>
	//  133  305:putfield        #637 <Field Bundle com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTimedOutEventParams>
			}
			obj.mTriggerTimeout = ((zzo) (s3)).h;
	//  134  308:aload           4
	//  135  310:aload_3         
	//  136  311:getfield        #639 <Field long zzo.h>
	//  137  314:putfield        #642 <Field long com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTriggerTimeout>
			if(((zzo) (s3)).i != null)
	//* 138  317:aload_3         
	//* 139  318:getfield        #644 <Field zzag zzo.i>
	//* 140  321:ifnull          361
			{
				obj.mTriggeredEventName = ((zzo) (s3)).i.a;
	//  141  324:aload           4
	//  142  326:aload_3         
	//  143  327:getfield        #644 <Field zzag zzo.i>
	//  144  330:getfield        #624 <Field String com.google.android.gms.measurement.internal.zzag.a>
	//  145  333:putfield        #647 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTriggeredEventName>
				if(((zzo) (s3)).i.b != null)
	//* 146  336:aload_3         
	//* 147  337:getfield        #644 <Field zzag zzo.i>
	//* 148  340:getfield        #630 <Field zzad zzag.b>
	//* 149  343:ifnull          361
					obj.mTriggeredEventParams = ((zzo) (s3)).i.b.b();
	//  150  346:aload           4
	//  151  348:aload_3         
	//  152  349:getfield        #644 <Field zzag zzo.i>
	//  153  352:getfield        #630 <Field zzad zzag.b>
	//  154  355:invokevirtual   #633 <Method Bundle zzad.b()>
	//  155  358:putfield        #650 <Field Bundle com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTriggeredEventParams>
			}
			obj.mTriggeredTimestamp = ((zzo) (s3)).c.b;
	//  156  361:aload           4
	//  157  363:aload_3         
	//  158  364:getfield        #599 <Field zzfu zzo.c>
	//  159  367:getfield        #652 <Field long zzfu.b>
	//  160  370:putfield        #655 <Field long com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTriggeredTimestamp>
			obj.mTimeToLive = ((zzo) (s3)).j;
	//  161  373:aload           4
	//  162  375:aload_3         
	//  163  376:getfield        #657 <Field long zzo.j>
	//  164  379:putfield        #660 <Field long com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTimeToLive>
			if(((zzo) (s3)).k == null)
				continue;
	//  165  382:aload_3         
	//  166  383:getfield        #662 <Field zzag zzo.k>
	//  167  386:ifnull          426
			obj.mExpiredEventName = ((zzo) (s3)).k.a;
	//  168  389:aload           4
	//  169  391:aload_3         
	//  170  392:getfield        #662 <Field zzag zzo.k>
	//  171  395:getfield        #624 <Field String com.google.android.gms.measurement.internal.zzag.a>
	//  172  398:putfield        #665 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mExpiredEventName>
			if(((zzo) (s3)).k.b != null)
	//* 173  401:aload_3         
	//* 174  402:getfield        #662 <Field zzag zzo.k>
	//* 175  405:getfield        #630 <Field zzad zzag.b>
	//* 176  408:ifnull          426
				obj.mExpiredEventParams = ((zzo) (s3)).k.b.b();
	//  177  411:aload           4
	//  178  413:aload_3         
	//  179  414:getfield        #662 <Field zzag zzo.k>
	//  180  417:getfield        #630 <Field zzad zzag.b>
	//  181  420:invokevirtual   #633 <Method Bundle zzad.b()>
	//  182  423:putfield        #668 <Field Bundle com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mExpiredEventParams>
		}

	//  183  426:aload_1         
	//  184  427:aload           4
	//  185  429:invokeinterface #346 <Method boolean List.add(Object)>
	//  186  434:pop             
	//* 187  435:goto            167
		return ((List) (s1));
	//  188  438:aload_1         
	//  189  439:areturn         
		s1;
	//  190  440:astore_1        
		obj;
	//  191  441:aload           4
		JVM INSTR monitorexit ;
	//  192  443:monitorexit     
		throw s1;
	//  193  444:aload_1         
	//  194  445:athrow          
	}

	private final Map b(String s1, String s2, String s3, boolean flag)
	{
		if(((bt)this).q().g())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #521 <Method as bt.q()>
	//*   2    4:invokevirtual   #536 <Method boolean as.g()>
	//*   3    7:ifeq            27
		{
			((bt)this).r().u_().a("Cannot get user properties from analytics worker thread");
	//    4   10:aload_0         
	//    5   11:invokevirtual   #71  <Method s bt.r()>
	//    6   14:invokevirtual   #539 <Method u s.u_()>
	//    7   17:ldc2            #671 <String "Cannot get user properties from analytics worker thread">
	//    8   20:invokevirtual   #84  <Method void com.google.android.gms.measurement.internal.u.a(String)>
			return Collections.emptyMap();
	//    9   23:invokestatic    #675 <Method Map Collections.emptyMap()>
	//   10   26:areturn         
		}
		if(com.google.android.gms.measurement.internal.eu.a())
	//*  11   27:invokestatic    #550 <Method boolean com.google.android.gms.measurement.internal.eu.a()>
	//*  12   30:ifeq            50
		{
			((bt)this).r().u_().a("Cannot get user properties from main thread");
	//   13   33:aload_0         
	//   14   34:invokevirtual   #71  <Method s bt.r()>
	//   15   37:invokevirtual   #539 <Method u s.u_()>
	//   16   40:ldc2            #677 <String "Cannot get user properties from main thread">
	//   17   43:invokevirtual   #84  <Method void com.google.android.gms.measurement.internal.u.a(String)>
			return Collections.emptyMap();
	//   18   46:invokestatic    #675 <Method Map Collections.emptyMap()>
	//   19   49:areturn         
		}
		AtomicReference atomicreference = new AtomicReference();
	//   20   50:new             #30  <Class AtomicReference>
	//   21   53:dup             
	//   22   54:invokespecial   #31  <Method void AtomicReference()>
	//   23   57:astore          5
		atomicreference;
	//   24   59:aload           5
		JVM INSTR monitorenter ;
	//   25   61:monitorenter    
		r.q().a(((Runnable) (new cl(this, atomicreference, s1, s2, s3, flag))));
	//   26   62:aload_0         
	//   27   63:getfield        #63  <Field ax r>
	//   28   66:invokevirtual   #553 <Method as ax.q()>
	//   29   69:new             #679 <Class cl>
	//   30   72:dup             
	//   31   73:aload_0         
	//   32   74:aload           5
	//   33   76:aload_1         
	//   34   77:aload_2         
	//   35   78:aload_3         
	//   36   79:iload           4
	//   37   81:invokespecial   #682 <Method void cl(cd, AtomicReference, String, String, String, boolean)>
	//   38   84:invokevirtual   #531 <Method void com.google.android.gms.measurement.internal.as.a(Runnable)>
		try
		{
			((Object) (atomicreference)).wait(5000L);
	//   39   87:aload           5
	//   40   89:ldc2w           #559 <Long 5000L>
	//   41   92:invokevirtual   #564 <Method void Object.wait(long)>
			break MISSING_BLOCK_LABEL_113;
	//   42   95:goto            113
		}
		// Misplaced declaration of an exception variable
		catch(String s1) { }
	//   43   98:astore_1        
		((bt)this).r().i().a("Interrupted waiting for get user properties", ((Object) (s1)));
	//   44   99:aload_0         
	//   45  100:invokevirtual   #71  <Method s bt.r()>
	//   46  103:invokevirtual   #168 <Method u s.i()>
	//   47  106:ldc2            #684 <String "Interrupted waiting for get user properties">
	//   48  109:aload_1         
	//   49  110:invokevirtual   #173 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
		atomicreference;
	//   50  113:aload           5
		JVM INSTR monitorexit ;
	//   51  115:monitorexit     
		s2 = ((String) ((List)atomicreference.get()));
	//   52  116:aload           5
	//   53  118:invokevirtual   #568 <Method Object AtomicReference.get()>
	//   54  121:checkcast       #343 <Class List>
	//   55  124:astore_2        
		if(s2 == null)
	//*  56  125:aload_2         
	//*  57  126:ifnonnull       146
		{
			((bt)this).r().i().a("Timed out waiting for get user properties");
	//   58  129:aload_0         
	//   59  130:invokevirtual   #71  <Method s bt.r()>
	//   60  133:invokevirtual   #168 <Method u s.i()>
	//   61  136:ldc2            #686 <String "Timed out waiting for get user properties">
	//   62  139:invokevirtual   #84  <Method void com.google.android.gms.measurement.internal.u.a(String)>
			return Collections.emptyMap();
	//   63  142:invokestatic    #675 <Method Map Collections.emptyMap()>
	//   64  145:areturn         
		}
		s1 = ((String) (new a(((List) (s2)).size())));
	//   65  146:new             #688 <Class a>
	//   66  149:dup             
	//   67  150:aload_2         
	//   68  151:invokeinterface #474 <Method int List.size()>
	//   69  156:invokespecial   #689 <Method void a(int)>
	//   70  159:astore_1        
		for(s2 = ((String) (((List) (s2)).iterator())); ((Iterator) (s2)).hasNext(); ((Map) (s1)).put(((Object) (((zzfu) (s3)).a)), ((zzfu) (s3)).a()))
	//*  71  160:aload_2         
	//*  72  161:invokeinterface #574 <Method Iterator List.iterator()>
	//*  73  166:astore_2        
	//*  74  167:aload_2         
	//*  75  168:invokeinterface #504 <Method boolean Iterator.hasNext()>
	//*  76  173:ifeq            204
			s3 = ((String) ((zzfu)((Iterator) (s2)).next()));
	//   77  176:aload_2         
	//   78  177:invokeinterface #508 <Method Object Iterator.next()>
	//   79  182:checkcast       #601 <Class zzfu>
	//   80  185:astore_3        

	//   81  186:aload_1         
	//   82  187:aload_3         
	//   83  188:getfield        #602 <Field String com.google.android.gms.measurement.internal.zzfu.a>
	//   84  191:aload_3         
	//   85  192:invokevirtual   #607 <Method Object com.google.android.gms.measurement.internal.zzfu.a()>
	//   86  195:invokeinterface #695 <Method Object Map.put(Object, Object)>
	//   87  200:pop             
	//*  88  201:goto            167
		return ((Map) (s1));
	//   89  204:aload_1         
	//   90  205:areturn         
		s1;
	//   91  206:astore_1        
		atomicreference;
	//   92  207:aload           5
		JVM INSTR monitorexit ;
	//   93  209:monitorexit     
		throw s1;
	//   94  210:aload_1         
	//   95  211:athrow          
	}

	static void b(cd cd1, com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionaluserproperty)
	{
		cd1.e(conditionaluserproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #697 <Method void e(com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty)>
	//    3    5:return          
	}

	private final void b(String s1, String s2, long l1, Bundle bundle, boolean flag, boolean flag1, 
			boolean flag2, String s3)
	{
		bundle = eo.b(bundle);
	//    0    0:aload           5
	//    1    2:invokestatic    #699 <Method Bundle eo.b(Bundle)>
	//    2    5:astore          5
		((bt)this).q().a(((Runnable) (new cf(this, s1, s2, l1, bundle, flag, flag1, flag2, s3))));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #521 <Method as bt.q()>
	//    5   11:new             #701 <Class cf>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:lload_3         
	//   11   19:aload           5
	//   12   21:iload           6
	//   13   23:iload           7
	//   14   25:iload           8
	//   15   27:aload           9
	//   16   29:invokespecial   #703 <Method void cf(cd, String, String, long, Bundle, boolean, boolean, boolean, String)>
	//   17   32:invokevirtual   #531 <Method void com.google.android.gms.measurement.internal.as.a(Runnable)>
	//   18   35:return          
	}

	private final void b(String s1, String s2, String s3, Bundle bundle)
	{
		long l1 = ((bt)this).m().a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #395 <Method e com.google.android.gms.measurement.internal.bt.m()>
	//    2    4:invokeinterface #398 <Method long e.a()>
	//    3    9:lstore          5
		am.a(s2);
	//    4   11:aload_2         
	//    5   12:invokestatic    #116 <Method String am.a(String)>
	//    6   15:pop             
		com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionaluserproperty = new com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty();
	//    7   16:new             #578 <Class com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty>
	//    8   19:dup             
	//    9   20:invokespecial   #579 <Method void com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty()>
	//   10   23:astore          7
		conditionaluserproperty.mAppId = s1;
	//   11   25:aload           7
	//   12   27:aload_1         
	//   13   28:putfield        #585 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mAppId>
		conditionaluserproperty.mName = s2;
	//   14   31:aload           7
	//   15   33:aload_2         
	//   16   34:putfield        #605 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mName>
		conditionaluserproperty.mCreationTimestamp = l1;
	//   17   37:aload           7
	//   18   39:lload           5
	//   19   41:putfield        #596 <Field long com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mCreationTimestamp>
		if(s3 != null)
	//*  20   44:aload_3         
	//*  21   45:ifnull          61
		{
			conditionaluserproperty.mExpiredEventName = s3;
	//   22   48:aload           7
	//   23   50:aload_3         
	//   24   51:putfield        #665 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mExpiredEventName>
			conditionaluserproperty.mExpiredEventParams = bundle;
	//   25   54:aload           7
	//   26   56:aload           4
	//   27   58:putfield        #668 <Field Bundle com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mExpiredEventParams>
		}
		((bt)this).q().a(((Runnable) (new cj(this, conditionaluserproperty))));
	//   28   61:aload_0         
	//   29   62:invokevirtual   #521 <Method as bt.q()>
	//   30   65:new             #706 <Class cj>
	//   31   68:dup             
	//   32   69:aload_0         
	//   33   70:aload           7
	//   34   72:invokespecial   #708 <Method void cj(cd, com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty)>
	//   35   75:invokevirtual   #531 <Method void com.google.android.gms.measurement.internal.as.a(Runnable)>
	//   36   78:return          
	}

	private final void c(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionaluserproperty)
	{
		long l1 = ((bt)this).m().a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #395 <Method e com.google.android.gms.measurement.internal.bt.m()>
	//    2    4:invokeinterface #398 <Method long e.a()>
	//    3    9:lstore_2        
		am.a(((Object) (conditionaluserproperty)));
	//    4   10:aload_1         
	//    5   11:invokestatic    #128 <Method Object am.a(Object)>
	//    6   14:pop             
		am.a(conditionaluserproperty.mName);
	//    7   15:aload_1         
	//    8   16:getfield        #605 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mName>
	//    9   19:invokestatic    #116 <Method String am.a(String)>
	//   10   22:pop             
		am.a(conditionaluserproperty.mOrigin);
	//   11   23:aload_1         
	//   12   24:getfield        #590 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mOrigin>
	//   13   27:invokestatic    #116 <Method String am.a(String)>
	//   14   30:pop             
		am.a(conditionaluserproperty.mValue);
	//   15   31:aload_1         
	//   16   32:getfield        #611 <Field Object com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mValue>
	//   17   35:invokestatic    #128 <Method Object am.a(Object)>
	//   18   38:pop             
		conditionaluserproperty.mCreationTimestamp = l1;
	//   19   39:aload_1         
	//   20   40:lload_2         
	//   21   41:putfield        #596 <Field long com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mCreationTimestamp>
		String s1 = conditionaluserproperty.mName;
	//   22   44:aload_1         
	//   23   45:getfield        #605 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mName>
	//   24   48:astore          4
		Object obj = conditionaluserproperty.mValue;
	//   25   50:aload_1         
	//   26   51:getfield        #611 <Field Object com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mValue>
	//   27   54:astore          5
		if(((bt)this).p().c(s1) != 0)
	//*  28   56:aload_0         
	//*  29   57:invokevirtual   #281 <Method eo bt.p()>
	//*  30   60:aload           4
	//*  31   62:invokevirtual   #710 <Method int eo.c(String)>
	//*  32   65:ifeq            91
		{
			((bt)this).r().u_().a("Invalid conditional user property name", ((Object) (((bt)this).o().c(s1))));
	//   33   68:aload_0         
	//   34   69:invokevirtual   #71  <Method s bt.r()>
	//   35   72:invokevirtual   #539 <Method u s.u_()>
	//   36   75:ldc2            #712 <String "Invalid conditional user property name">
	//   37   78:aload_0         
	//   38   79:invokevirtual   #219 <Method q bt.o()>
	//   39   82:aload           4
	//   40   84:invokevirtual   #714 <Method String q.c(String)>
	//   41   87:invokevirtual   #173 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
			return;
	//   42   90:return          
		}
		if(((bt)this).p().b(s1, obj) != 0)
	//*  43   91:aload_0         
	//*  44   92:invokevirtual   #281 <Method eo bt.p()>
	//*  45   95:aload           4
	//*  46   97:aload           5
	//*  47   99:invokevirtual   #717 <Method int eo.b(String, Object)>
	//*  48  102:ifeq            130
		{
			((bt)this).r().u_().a("Invalid conditional user property value", ((Object) (((bt)this).o().c(s1))), obj);
	//   49  105:aload_0         
	//   50  106:invokevirtual   #71  <Method s bt.r()>
	//   51  109:invokevirtual   #539 <Method u s.u_()>
	//   52  112:ldc2            #719 <String "Invalid conditional user property value">
	//   53  115:aload_0         
	//   54  116:invokevirtual   #219 <Method q bt.o()>
	//   55  119:aload           4
	//   56  121:invokevirtual   #714 <Method String q.c(String)>
	//   57  124:aload           5
	//   58  126:invokevirtual   #270 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
			return;
	//   59  129:return          
		}
		Object obj1 = ((bt)this).p().c(s1, obj);
	//   60  130:aload_0         
	//   61  131:invokevirtual   #281 <Method eo bt.p()>
	//   62  134:aload           4
	//   63  136:aload           5
	//   64  138:invokevirtual   #722 <Method Object eo.c(String, Object)>
	//   65  141:astore          6
		if(obj1 == null)
	//*  66  143:aload           6
	//*  67  145:ifnonnull       173
		{
			((bt)this).r().u_().a("Unable to normalize conditional user property value", ((Object) (((bt)this).o().c(s1))), obj);
	//   68  148:aload_0         
	//   69  149:invokevirtual   #71  <Method s bt.r()>
	//   70  152:invokevirtual   #539 <Method u s.u_()>
	//   71  155:ldc2            #724 <String "Unable to normalize conditional user property value">
	//   72  158:aload_0         
	//   73  159:invokevirtual   #219 <Method q bt.o()>
	//   74  162:aload           4
	//   75  164:invokevirtual   #714 <Method String q.c(String)>
	//   76  167:aload           5
	//   77  169:invokevirtual   #270 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
			return;
	//   78  172:return          
		}
		conditionaluserproperty.mValue = obj1;
	//   79  173:aload_1         
	//   80  174:aload           6
	//   81  176:putfield        #611 <Field Object com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mValue>
		l1 = conditionaluserproperty.mTriggerTimeout;
	//   82  179:aload_1         
	//   83  180:getfield        #642 <Field long com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTriggerTimeout>
	//   84  183:lstore_2        
		if(!TextUtils.isEmpty(((CharSequence) (conditionaluserproperty.mTriggerEventName))) && (l1 > 0x9ef8b000L || l1 < 1L))
	//*  85  184:aload_1         
	//*  86  185:getfield        #620 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTriggerEventName>
	//*  87  188:invokestatic    #730 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  88  191:ifne            235
	//*  89  194:lload_2         
	//*  90  195:ldc2w           #731 <Long 0x9ef8b000L>
	//*  91  198:lcmp            
	//*  92  199:ifgt            208
	//*  93  202:lload_2         
	//*  94  203:lconst_1        
	//*  95  204:lcmp            
	//*  96  205:ifge            235
		{
			((bt)this).r().u_().a("Invalid conditional user property timeout", ((Object) (((bt)this).o().c(s1))), ((Object) (Long.valueOf(l1))));
	//   97  208:aload_0         
	//   98  209:invokevirtual   #71  <Method s bt.r()>
	//   99  212:invokevirtual   #539 <Method u s.u_()>
	//  100  215:ldc2            #734 <String "Invalid conditional user property timeout">
	//  101  218:aload_0         
	//  102  219:invokevirtual   #219 <Method q bt.o()>
	//  103  222:aload           4
	//  104  224:invokevirtual   #714 <Method String q.c(String)>
	//  105  227:lload_2         
	//  106  228:invokestatic    #316 <Method Long Long.valueOf(long)>
	//  107  231:invokevirtual   #270 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
			return;
	//  108  234:return          
		}
		l1 = conditionaluserproperty.mTimeToLive;
	//  109  235:aload_1         
	//  110  236:getfield        #660 <Field long com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTimeToLive>
	//  111  239:lstore_2        
		if(l1 <= 0x9ef8b000L && l1 >= 1L)
	//* 112  240:lload_2         
	//* 113  241:ldc2w           #731 <Long 0x9ef8b000L>
	//* 114  244:lcmp            
	//* 115  245:ifgt            274
	//* 116  248:lload_2         
	//* 117  249:lconst_1        
	//* 118  250:lcmp            
	//* 119  251:ifge            257
	//* 120  254:goto            274
		{
			((bt)this).q().a(((Runnable) (new ci(this, conditionaluserproperty))));
	//  121  257:aload_0         
	//  122  258:invokevirtual   #521 <Method as bt.q()>
	//  123  261:new             #736 <Class ci>
	//  124  264:dup             
	//  125  265:aload_0         
	//  126  266:aload_1         
	//  127  267:invokespecial   #737 <Method void ci(cd, com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty)>
	//  128  270:invokevirtual   #531 <Method void com.google.android.gms.measurement.internal.as.a(Runnable)>
			return;
	//  129  273:return          
		} else
		{
			((bt)this).r().u_().a("Invalid conditional user property time to live", ((Object) (((bt)this).o().c(s1))), ((Object) (Long.valueOf(l1))));
	//  130  274:aload_0         
	//  131  275:invokevirtual   #71  <Method s bt.r()>
	//  132  278:invokevirtual   #539 <Method u s.u_()>
	//  133  281:ldc2            #739 <String "Invalid conditional user property time to live">
	//  134  284:aload_0         
	//  135  285:invokevirtual   #219 <Method q bt.o()>
	//  136  288:aload           4
	//  137  290:invokevirtual   #714 <Method String q.c(String)>
	//  138  293:lload_2         
	//  139  294:invokestatic    #316 <Method Long Long.valueOf(long)>
	//  140  297:invokevirtual   #270 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
			return;
	//  141  300:return          
		}
	}

	private final void d(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionaluserproperty)
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #130 <Method void bt.d()>
		((dq)this).E();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #133 <Method void dq.E()>
		am.a(((Object) (conditionaluserproperty)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #128 <Method Object am.a(Object)>
	//    6   12:pop             
		am.a(conditionaluserproperty.mName);
	//    7   13:aload_1         
	//    8   14:getfield        #605 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mName>
	//    9   17:invokestatic    #116 <Method String am.a(String)>
	//   10   20:pop             
		am.a(conditionaluserproperty.mOrigin);
	//   11   21:aload_1         
	//   12   22:getfield        #590 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mOrigin>
	//   13   25:invokestatic    #116 <Method String am.a(String)>
	//   14   28:pop             
		am.a(conditionaluserproperty.mValue);
	//   15   29:aload_1         
	//   16   30:getfield        #611 <Field Object com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mValue>
	//   17   33:invokestatic    #128 <Method Object am.a(Object)>
	//   18   36:pop             
		if(!r.C())
	//*  19   37:aload_0         
	//*  20   38:getfield        #63  <Field ax r>
	//*  21   41:invokevirtual   #68  <Method boolean ax.C()>
	//*  22   44:ifne            61
		{
			((bt)this).r().w().a("Conditional property not sent since collection is disabled");
	//   23   47:aload_0         
	//   24   48:invokevirtual   #71  <Method s bt.r()>
	//   25   51:invokevirtual   #77  <Method u s.w()>
	//   26   54:ldc2            #743 <String "Conditional property not sent since collection is disabled">
	//   27   57:invokevirtual   #84  <Method void com.google.android.gms.measurement.internal.u.a(String)>
			return;
	//   28   60:return          
		}
		zzfu zzfu1 = new zzfu(conditionaluserproperty.mName, conditionaluserproperty.mTriggeredTimestamp, conditionaluserproperty.mValue, conditionaluserproperty.mOrigin);
	//   29   61:new             #601 <Class zzfu>
	//   30   64:dup             
	//   31   65:aload_1         
	//   32   66:getfield        #605 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mName>
	//   33   69:aload_1         
	//   34   70:getfield        #655 <Field long com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTriggeredTimestamp>
	//   35   73:aload_1         
	//   36   74:getfield        #611 <Field Object com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mValue>
	//   37   77:aload_1         
	//   38   78:getfield        #590 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mOrigin>
	//   39   81:invokespecial   #746 <Method void zzfu(String, long, Object, String)>
	//   40   84:astore_2        
		zzag zzag1;
		zzag zzag2;
		zzag zzag3;
		try
		{
			zzag1 = ((bt)this).p().a(conditionaluserproperty.mAppId, conditionaluserproperty.mTriggeredEventName, conditionaluserproperty.mTriggeredEventParams, conditionaluserproperty.mOrigin, 0L, true, false);
	//   41   85:aload_0         
	//   42   86:invokevirtual   #281 <Method eo bt.p()>
	//   43   89:aload_1         
	//   44   90:getfield        #585 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mAppId>
	//   45   93:aload_1         
	//   46   94:getfield        #647 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTriggeredEventName>
	//   47   97:aload_1         
	//   48   98:getfield        #650 <Field Bundle com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTriggeredEventParams>
	//   49  101:aload_1         
	//   50  102:getfield        #590 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mOrigin>
	//   51  105:lconst_0        
	//   52  106:iconst_1        
	//   53  107:iconst_0        
	//   54  108:invokevirtual   #749 <Method zzag com.google.android.gms.measurement.internal.eo.a(String, String, Bundle, String, long, boolean, boolean)>
	//   55  111:astore_3        
			zzag2 = ((bt)this).p().a(conditionaluserproperty.mAppId, conditionaluserproperty.mTimedOutEventName, conditionaluserproperty.mTimedOutEventParams, conditionaluserproperty.mOrigin, 0L, true, false);
	//   56  112:aload_0         
	//   57  113:invokevirtual   #281 <Method eo bt.p()>
	//   58  116:aload_1         
	//   59  117:getfield        #585 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mAppId>
	//   60  120:aload_1         
	//   61  121:getfield        #627 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTimedOutEventName>
	//   62  124:aload_1         
	//   63  125:getfield        #637 <Field Bundle com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTimedOutEventParams>
	//   64  128:aload_1         
	//   65  129:getfield        #590 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mOrigin>
	//   66  132:lconst_0        
	//   67  133:iconst_1        
	//   68  134:iconst_0        
	//   69  135:invokevirtual   #749 <Method zzag com.google.android.gms.measurement.internal.eo.a(String, String, Bundle, String, long, boolean, boolean)>
	//   70  138:astore          4
			zzag3 = ((bt)this).p().a(conditionaluserproperty.mAppId, conditionaluserproperty.mExpiredEventName, conditionaluserproperty.mExpiredEventParams, conditionaluserproperty.mOrigin, 0L, true, false);
	//   71  140:aload_0         
	//   72  141:invokevirtual   #281 <Method eo bt.p()>
	//   73  144:aload_1         
	//   74  145:getfield        #585 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mAppId>
	//   75  148:aload_1         
	//   76  149:getfield        #665 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mExpiredEventName>
	//   77  152:aload_1         
	//   78  153:getfield        #668 <Field Bundle com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mExpiredEventParams>
	//   79  156:aload_1         
	//   80  157:getfield        #590 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mOrigin>
	//   81  160:lconst_0        
	//   82  161:iconst_1        
	//   83  162:iconst_0        
	//   84  163:invokevirtual   #749 <Method zzag com.google.android.gms.measurement.internal.eo.a(String, String, Bundle, String, long, boolean, boolean)>
	//   85  166:astore          5
		}
	//*  86  168:new             #576 <Class zzo>
	//*  87  171:dup             
	//*  88  172:aload_1         
	//*  89  173:getfield        #585 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mAppId>
	//*  90  176:aload_1         
	//*  91  177:getfield        #590 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mOrigin>
	//*  92  180:aload_2         
	//*  93  181:aload_1         
	//*  94  182:getfield        #596 <Field long com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mCreationTimestamp>
	//*  95  185:iconst_0        
	//*  96  186:aload_1         
	//*  97  187:getfield        #620 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTriggerEventName>
	//*  98  190:aload           4
	//*  99  192:aload_1         
	//* 100  193:getfield        #642 <Field long com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTriggerTimeout>
	//* 101  196:aload_3         
	//* 102  197:aload_1         
	//* 103  198:getfield        #660 <Field long com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTimeToLive>
	//* 104  201:aload           5
	//* 105  203:invokespecial   #752 <Method void zzo(String, String, zzfu, long, boolean, String, zzag, long, zzag, long, zzag)>
	//* 106  206:astore_1        
	//* 107  207:aload_0         
	//* 108  208:invokevirtual   #93  <Method cv ct.h()>
	//* 109  211:aload_1         
	//* 110  212:invokevirtual   #755 <Method void com.google.android.gms.measurement.internal.cv.a(zzo)>
	//* 111  215:return          
		// Misplaced declaration of an exception variable
		catch(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionaluserproperty)
	//* 112  216:astore_1        
		{
			return;
	//  113  217:return          
		}
		conditionaluserproperty = ((com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty) (new zzo(conditionaluserproperty.mAppId, conditionaluserproperty.mOrigin, zzfu1, conditionaluserproperty.mCreationTimestamp, false, conditionaluserproperty.mTriggerEventName, zzag2, conditionaluserproperty.mTriggerTimeout, zzag1, conditionaluserproperty.mTimeToLive, zzag3)));
		((ct)this).h().a(((zzo) (conditionaluserproperty)));
	}

	private final void e(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionaluserproperty)
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #130 <Method void bt.d()>
		((dq)this).E();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #133 <Method void dq.E()>
		am.a(((Object) (conditionaluserproperty)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #128 <Method Object am.a(Object)>
	//    6   12:pop             
		am.a(conditionaluserproperty.mName);
	//    7   13:aload_1         
	//    8   14:getfield        #605 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mName>
	//    9   17:invokestatic    #116 <Method String am.a(String)>
	//   10   20:pop             
		if(!r.C())
	//*  11   21:aload_0         
	//*  12   22:getfield        #63  <Field ax r>
	//*  13   25:invokevirtual   #68  <Method boolean ax.C()>
	//*  14   28:ifne            45
		{
			((bt)this).r().w().a("Conditional property not cleared since collection is disabled");
	//   15   31:aload_0         
	//   16   32:invokevirtual   #71  <Method s bt.r()>
	//   17   35:invokevirtual   #77  <Method u s.w()>
	//   18   38:ldc2            #757 <String "Conditional property not cleared since collection is disabled">
	//   19   41:invokevirtual   #84  <Method void com.google.android.gms.measurement.internal.u.a(String)>
			return;
	//   20   44:return          
		}
		zzfu zzfu1 = new zzfu(conditionaluserproperty.mName, 0L, ((Object) (null)), ((String) (null)));
	//   21   45:new             #601 <Class zzfu>
	//   22   48:dup             
	//   23   49:aload_1         
	//   24   50:getfield        #605 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mName>
	//   25   53:lconst_0        
	//   26   54:aconst_null     
	//   27   55:aconst_null     
	//   28   56:invokespecial   #746 <Method void zzfu(String, long, Object, String)>
	//   29   59:astore_2        
		zzag zzag1;
		try
		{
			zzag1 = ((bt)this).p().a(conditionaluserproperty.mAppId, conditionaluserproperty.mExpiredEventName, conditionaluserproperty.mExpiredEventParams, conditionaluserproperty.mOrigin, conditionaluserproperty.mCreationTimestamp, true, false);
	//   30   60:aload_0         
	//   31   61:invokevirtual   #281 <Method eo bt.p()>
	//   32   64:aload_1         
	//   33   65:getfield        #585 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mAppId>
	//   34   68:aload_1         
	//   35   69:getfield        #665 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mExpiredEventName>
	//   36   72:aload_1         
	//   37   73:getfield        #668 <Field Bundle com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mExpiredEventParams>
	//   38   76:aload_1         
	//   39   77:getfield        #590 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mOrigin>
	//   40   80:aload_1         
	//   41   81:getfield        #596 <Field long com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mCreationTimestamp>
	//   42   84:iconst_1        
	//   43   85:iconst_0        
	//   44   86:invokevirtual   #749 <Method zzag com.google.android.gms.measurement.internal.eo.a(String, String, Bundle, String, long, boolean, boolean)>
	//   45   89:astore_3        
		}
	//*  46   90:new             #576 <Class zzo>
	//*  47   93:dup             
	//*  48   94:aload_1         
	//*  49   95:getfield        #585 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mAppId>
	//*  50   98:aload_1         
	//*  51   99:getfield        #590 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mOrigin>
	//*  52  102:aload_2         
	//*  53  103:aload_1         
	//*  54  104:getfield        #596 <Field long com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mCreationTimestamp>
	//*  55  107:aload_1         
	//*  56  108:getfield        #615 <Field boolean com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mActive>
	//*  57  111:aload_1         
	//*  58  112:getfield        #620 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTriggerEventName>
	//*  59  115:aconst_null     
	//*  60  116:aload_1         
	//*  61  117:getfield        #642 <Field long com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTriggerTimeout>
	//*  62  120:aconst_null     
	//*  63  121:aload_1         
	//*  64  122:getfield        #660 <Field long com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mTimeToLive>
	//*  65  125:aload_3         
	//*  66  126:invokespecial   #752 <Method void zzo(String, String, zzfu, long, boolean, String, zzag, long, zzag, long, zzag)>
	//*  67  129:astore_1        
	//*  68  130:aload_0         
	//*  69  131:invokevirtual   #93  <Method cv ct.h()>
	//*  70  134:aload_1         
	//*  71  135:invokevirtual   #755 <Method void com.google.android.gms.measurement.internal.cv.a(zzo)>
	//*  72  138:return          
		// Misplaced declaration of an exception variable
		catch(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionaluserproperty)
	//*  73  139:astore_1        
		{
			return;
	//   74  140:return          
		}
		conditionaluserproperty = ((com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty) (new zzo(conditionaluserproperty.mAppId, conditionaluserproperty.mOrigin, zzfu1, conditionaluserproperty.mCreationTimestamp, conditionaluserproperty.mActive, conditionaluserproperty.mTriggerEventName, ((zzag) (null)), conditionaluserproperty.mTriggerTimeout, ((zzag) (null)), conditionaluserproperty.mTimeToLive, zzag1)));
		((ct)this).h().a(((zzo) (conditionaluserproperty)));
	}

	public final String A()
	{
		cq cq1 = r.w().y();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field ax r>
	//    2    4:invokevirtual   #760 <Method cr ax.w()>
	//    3    7:invokevirtual   #762 <Method cq cr.y()>
	//    4   10:astore_1        
		if(cq1 != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          20
			return cq1.b;
	//    7   15:aload_1         
	//    8   16:getfield        #763 <Field String cq.b>
	//    9   19:areturn         
		else
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
	}

	public final String B()
	{
		if(r.p() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field ax r>
	//*   2    4:invokevirtual   #768 <Method String ax.p()>
	//*   3    7:ifnull          18
			return r.p();
	//    4   10:aload_0         
	//    5   11:getfield        #63  <Field ax r>
	//    6   14:invokevirtual   #768 <Method String ax.p()>
	//    7   17:areturn         
		String s1;
		try
		{
			s1 = com.google.android.gms.common.api.internal.m.a();
	//    8   18:invokestatic    #772 <Method String m.a()>
	//    9   21:astore_1        
		}
	//*  10   22:aload_1         
	//*  11   23:areturn         
		catch(IllegalStateException illegalstateexception)
	//*  12   24:astore_1        
		{
			r.r().u_().a("getGoogleAppId failed with exception", ((Object) (illegalstateexception)));
	//   13   25:aload_0         
	//   14   26:getfield        #63  <Field ax r>
	//   15   29:invokevirtual   #773 <Method s ax.r()>
	//   16   32:invokevirtual   #539 <Method u s.u_()>
	//   17   35:ldc2            #775 <String "getGoogleAppId failed with exception">
	//   18   38:aload_1         
	//   19   39:invokevirtual   #173 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
			return null;
	//   20   42:aconst_null     
	//   21   43:areturn         
		}
		return s1;
	}

	public final List a(String s1, String s2)
	{
		((bt)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #778 <Method void bt.b()>
		return b(((String) (null)), s1, s2);
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #780 <Method List b(String, String, String)>
	//    7   11:areturn         
	}

	public final List a(String s1, String s2, String s3)
	{
		am.a(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #116 <Method String am.a(String)>
	//    2    4:pop             
		((bt)this).a();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #782 <Method void com.google.android.gms.measurement.internal.bt.a()>
		return b(s1, s2, s3);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokespecial   #780 <Method List b(String, String, String)>
	//   10   16:areturn         
	}

	public final Map a(String s1, String s2, String s3, boolean flag)
	{
		am.a(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #116 <Method String am.a(String)>
	//    2    4:pop             
		((bt)this).a();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #782 <Method void com.google.android.gms.measurement.internal.bt.a()>
		return b(s1, s2, s3, flag);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:iload           4
	//   10   15:invokespecial   #784 <Method Map b(String, String, String, boolean)>
	//   11   18:areturn         
	}

	public final Map a(String s1, String s2, boolean flag)
	{
		((bt)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #778 <Method void bt.b()>
		return b(((String) (null)), s1, s2, flag);
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:iload_3         
	//    7    9:invokespecial   #784 <Method Map b(String, String, String, boolean)>
	//    8   12:areturn         
	}

	public final volatile void a()
	{
		super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #786 <Method void com.google.android.gms.measurement.internal.dq.a()>
	//    2    4:return          
	}

	public final void a(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionaluserproperty)
	{
		am.a(((Object) (conditionaluserproperty)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #128 <Method Object am.a(Object)>
	//    2    4:pop             
		((bt)this).b();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #778 <Method void bt.b()>
		conditionaluserproperty = new com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty(conditionaluserproperty);
	//    5    9:new             #578 <Class com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #788 <Method void com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty(com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty)>
	//    9   17:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (conditionaluserproperty.mAppId))))
	//*  10   18:aload_1         
	//*  11   19:getfield        #585 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mAppId>
	//*  12   22:invokestatic    #730 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   25:ifne            41
			((bt)this).r().i().a("Package name should be null when calling setConditionalUserProperty");
	//   14   28:aload_0         
	//   15   29:invokevirtual   #71  <Method s bt.r()>
	//   16   32:invokevirtual   #168 <Method u s.i()>
	//   17   35:ldc2            #790 <String "Package name should be null when calling setConditionalUserProperty">
	//   18   38:invokevirtual   #84  <Method void com.google.android.gms.measurement.internal.u.a(String)>
		conditionaluserproperty.mAppId = null;
	//   19   41:aload_1         
	//   20   42:aconst_null     
	//   21   43:putfield        #585 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mAppId>
		c(conditionaluserproperty);
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:invokespecial   #792 <Method void c(com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty)>
	//   25   51:return          
	}

	public final void a(ca ca1)
	{
		((bt)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #778 <Method void bt.b()>
		((dq)this).E();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #133 <Method void dq.E()>
		am.a(((Object) (ca1)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #128 <Method Object am.a(Object)>
	//    6   12:pop             
		if(!d.add(((Object) (ca1))))
	//*   7   13:aload_0         
	//*   8   14:getfield        #26  <Field Set d>
	//*   9   17:aload_1         
	//*  10   18:invokeinterface #794 <Method boolean Set.add(Object)>
	//*  11   23:ifne            39
			((bt)this).r().i().a("OnEventListener already registered");
	//   12   26:aload_0         
	//   13   27:invokevirtual   #71  <Method s bt.r()>
	//   14   30:invokevirtual   #168 <Method u s.i()>
	//   15   33:ldc2            #796 <String "OnEventListener already registered">
	//   16   36:invokevirtual   #84  <Method void com.google.android.gms.measurement.internal.u.a(String)>
	//   17   39:return          
	}

	final void a(String s1)
	{
		f.set(((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AtomicReference f>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #800 <Method void AtomicReference.set(Object)>
	//    4    8:return          
	}

	final void a(String s1, String s2, long l1, Bundle bundle)
	{
		((bt)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #778 <Method void bt.b()>
		((bt)this).d();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #130 <Method void bt.d()>
		boolean flag;
		if(c != null && !com.google.android.gms.measurement.internal.eo.e(s2))
	//*   4    8:aload_0         
	//*   5    9:getfield        #262 <Field bz c>
	//*   6   12:ifnull          31
	//*   7   15:aload_2         
	//*   8   16:invokestatic    #260 <Method boolean com.google.android.gms.measurement.internal.eo.e(String)>
	//*   9   19:ifeq            25
	//*  10   22:goto            31
			flag = false;
	//   11   25:iconst_0        
	//   12   26:istore          6
		else
	//*  13   28:goto            34
			flag = true;
	//   14   31:iconst_1        
	//   15   32:istore          6
		a(s1, s2, l1, bundle, true, flag, false, ((String) (null)));
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:aload_2         
	//   19   37:lload_3         
	//   20   38:aload           5
	//   21   40:iconst_1        
	//   22   41:iload           6
	//   23   43:iconst_0        
	//   24   44:aconst_null     
	//   25   45:invokespecial   #107 <Method void a(String, String, long, Bundle, boolean, boolean, boolean, String)>
	//   26   48:return          
	}

	public final void a(String s1, String s2, Bundle bundle)
	{
		a(s1, s2, bundle, true, true, ((bt)this).m().a());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:iconst_1        
	//    6    6:aload_0         
	//    7    7:invokevirtual   #395 <Method e com.google.android.gms.measurement.internal.bt.m()>
	//    8   10:invokeinterface #398 <Method long e.a()>
	//    9   15:invokevirtual   #805 <Method void a(String, String, Bundle, boolean, boolean, long)>
	//   10   18:return          
	}

	public final void a(String s1, String s2, Bundle bundle, boolean flag)
	{
		a(s1, s2, bundle, false, true, ((bt)this).m().a());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:iconst_1        
	//    6    6:aload_0         
	//    7    7:invokevirtual   #395 <Method e com.google.android.gms.measurement.internal.bt.m()>
	//    8   10:invokeinterface #398 <Method long e.a()>
	//    9   15:invokevirtual   #805 <Method void a(String, String, Bundle, boolean, boolean, long)>
	//   10   18:return          
	}

	public final void a(String s1, String s2, Bundle bundle, boolean flag, boolean flag1, long l1)
	{
		((bt)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #778 <Method void bt.b()>
		if(s1 == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       15
			s1 = "app";
	//    4    8:ldc2            #808 <String "app">
	//    5   11:astore_1        
	//*   6   12:goto            15
		if(bundle == null)
	//*   7   15:aload_3         
	//*   8   16:ifnonnull       30
			bundle = new Bundle();
	//    9   19:new             #246 <Class Bundle>
	//   10   22:dup             
	//   11   23:invokespecial   #809 <Method void Bundle()>
	//   12   26:astore_3        
	//*  13   27:goto            30
		boolean flag2;
		if(flag1 && c != null && !com.google.android.gms.measurement.internal.eo.e(s2))
	//*  14   30:iload           5
	//*  15   32:ifeq            58
	//*  16   35:aload_0         
	//*  17   36:getfield        #262 <Field bz c>
	//*  18   39:ifnull          58
	//*  19   42:aload_2         
	//*  20   43:invokestatic    #260 <Method boolean com.google.android.gms.measurement.internal.eo.e(String)>
	//*  21   46:ifeq            52
	//*  22   49:goto            58
			flag2 = false;
	//   23   52:iconst_0        
	//   24   53:istore          8
		else
	//*  25   55:goto            61
			flag2 = true;
	//   26   58:iconst_1        
	//   27   59:istore          8
		b(s1, s2, l1, bundle, flag1, flag2, flag ^ true, ((String) (null)));
	//   28   61:aload_0         
	//   29   62:aload_1         
	//   30   63:aload_2         
	//   31   64:lload           6
	//   32   66:aload_3         
	//   33   67:iload           5
	//   34   69:iload           8
	//   35   71:iload           4
	//   36   73:iconst_1        
	//   37   74:ixor            
	//   38   75:aconst_null     
	//   39   76:invokespecial   #811 <Method void b(String, String, long, Bundle, boolean, boolean, boolean, String)>
	//   40   79:return          
	}

	final void a(String s1, String s2, Object obj, long l1)
	{
		am.a(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #116 <Method String am.a(String)>
	//    2    4:pop             
		am.a(s2);
	//    3    5:aload_2         
	//    4    6:invokestatic    #116 <Method String am.a(String)>
	//    5    9:pop             
		((bt)this).d();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #130 <Method void bt.d()>
		((bt)this).b();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #778 <Method void bt.b()>
		((dq)this).E();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #133 <Method void dq.E()>
		if(!r.C())
	//*  12   22:aload_0         
	//*  13   23:getfield        #63  <Field ax r>
	//*  14   26:invokevirtual   #68  <Method boolean ax.C()>
	//*  15   29:ifne            46
		{
			((bt)this).r().w().a("User property not set since app measurement is disabled");
	//   16   32:aload_0         
	//   17   33:invokevirtual   #71  <Method s bt.r()>
	//   18   36:invokevirtual   #77  <Method u s.w()>
	//   19   39:ldc2            #813 <String "User property not set since app measurement is disabled">
	//   20   42:invokevirtual   #84  <Method void com.google.android.gms.measurement.internal.u.a(String)>
			return;
	//   21   45:return          
		}
		if(!r.H())
	//*  22   46:aload_0         
	//*  23   47:getfield        #63  <Field ax r>
	//*  24   50:invokevirtual   #278 <Method boolean ax.H()>
	//*  25   53:ifne            57
		{
			return;
	//   26   56:return          
		} else
		{
			((bt)this).r().w().a("Setting user property (FE)", ((Object) (((bt)this).o().a(s2))), obj);
	//   27   57:aload_0         
	//   28   58:invokevirtual   #71  <Method s bt.r()>
	//   29   61:invokevirtual   #77  <Method u s.w()>
	//   30   64:ldc2            #815 <String "Setting user property (FE)">
	//   31   67:aload_0         
	//   32   68:invokevirtual   #219 <Method q bt.o()>
	//   33   71:aload_2         
	//   34   72:invokevirtual   #222 <Method String com.google.android.gms.measurement.internal.q.a(String)>
	//   35   75:aload_3         
	//   36   76:invokevirtual   #270 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
			s1 = ((String) (new zzfu(s2, l1, obj, s1)));
	//   37   79:new             #601 <Class zzfu>
	//   38   82:dup             
	//   39   83:aload_2         
	//   40   84:lload           4
	//   41   86:aload_3         
	//   42   87:aload_1         
	//   43   88:invokespecial   #746 <Method void zzfu(String, long, Object, String)>
	//   44   91:astore_1        
			((ct)this).h().a(((zzfu) (s1)));
	//   45   92:aload_0         
	//   46   93:invokevirtual   #93  <Method cv ct.h()>
	//   47   96:aload_1         
	//   48   97:invokevirtual   #818 <Method void com.google.android.gms.measurement.internal.cv.a(zzfu)>
			return;
	//   49  100:return          
		}
	}

	public final void a(String s1, String s2, Object obj, boolean flag)
	{
		a(s1, s2, obj, flag, ((bt)this).m().a());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload_0         
	//    6    7:invokevirtual   #395 <Method e com.google.android.gms.measurement.internal.bt.m()>
	//    7   10:invokeinterface #398 <Method long e.a()>
	//    8   15:invokevirtual   #822 <Method void a(String, String, Object, boolean, long)>
	//    9   18:return          
	}

	public final void a(String s1, String s2, Object obj, boolean flag, long l1)
	{
label0:
		{
label1:
			{
				int i1;
				int k1;
label2:
				{
					if(s1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
						s1 = "app";
	//    2    4:ldc2            #808 <String "app">
	//    3    7:astore_1        
	//*   4    8:goto            11
					i1 = 6;
	//    5   11:bipush          6
	//    6   13:istore          7
					int j1 = 0;
	//    7   15:iconst_0        
	//    8   16:istore          8
					k1 = 0;
	//    9   18:iconst_0        
	//   10   19:istore          9
					if(flag)
	//*  11   21:iload           4
	//*  12   23:ifeq            39
					{
						i1 = ((bt)this).p().c(s2);
	//   13   26:aload_0         
	//   14   27:invokevirtual   #281 <Method eo bt.p()>
	//   15   30:aload_2         
	//   16   31:invokevirtual   #710 <Method int eo.c(String)>
	//   17   34:istore          7
					} else
	//*  18   36:goto            102
					{
						eo eo1 = ((bt)this).p();
	//   19   39:aload_0         
	//   20   40:invokevirtual   #281 <Method eo bt.p()>
	//   21   43:astore          10
						if(eo1.a("user property", s2))
	//*  22   45:aload           10
	//*  23   47:ldc2            #824 <String "user property">
	//*  24   50:aload_2         
	//*  25   51:invokevirtual   #200 <Method boolean com.google.android.gms.measurement.internal.eo.a(String, String)>
	//*  26   54:ifne            60
	//*  27   57:goto            102
							if(!eo1.a("user property", com.google.android.gms.measurement.internal.by.a, s2))
	//*  28   60:aload           10
	//*  29   62:ldc2            #824 <String "user property">
	//*  30   65:getstatic       #827 <Field String[] com.google.android.gms.measurement.internal.by.a>
	//*  31   68:aload_2         
	//*  32   69:invokevirtual   #208 <Method boolean com.google.android.gms.measurement.internal.eo.a(String, String[], String)>
	//*  33   72:ifne            82
								i1 = 15;
	//   34   75:bipush          15
	//   35   77:istore          7
							else
	//*  36   79:goto            102
							if(eo1.a("user property", 24, s2))
	//*  37   82:aload           10
	//*  38   84:ldc2            #824 <String "user property">
	//*  39   87:bipush          24
	//*  40   89:aload_2         
	//*  41   90:invokevirtual   #211 <Method boolean com.google.android.gms.measurement.internal.eo.a(String, int, String)>
	//*  42   93:ifne            99
	//*  43   96:goto            102
								i1 = 0;
	//   44   99:iconst_0        
	//   45  100:istore          7
					}
					if(i1 != 0)
	//*  46  102:iload           7
	//*  47  104:ifeq            152
					{
						((bt)this).p();
	//   48  107:aload_0         
	//   49  108:invokevirtual   #281 <Method eo bt.p()>
	//   50  111:pop             
						s1 = com.google.android.gms.measurement.internal.eo.a(s2, 24, true);
	//   51  112:aload_2         
	//   52  113:bipush          24
	//   53  115:iconst_1        
	//   54  116:invokestatic    #225 <Method String com.google.android.gms.measurement.internal.eo.a(String, int, boolean)>
	//   55  119:astore_1        
						j1 = k1;
	//   56  120:iload           9
	//   57  122:istore          8
						if(s2 != null)
	//*  58  124:aload_2         
	//*  59  125:ifnull          134
							j1 = s2.length();
	//   60  128:aload_2         
	//   61  129:invokevirtual   #229 <Method int String.length()>
	//   62  132:istore          8
						r.j().a(i1, "_ev", s1, j1);
	//   63  134:aload_0         
	//   64  135:getfield        #63  <Field ax r>
	//   65  138:invokevirtual   #193 <Method eo ax.j()>
	//   66  141:iload           7
	//   67  143:ldc1            #231 <String "_ev">
	//   68  145:aload_1         
	//   69  146:iload           8
	//   70  148:invokevirtual   #234 <Method void com.google.android.gms.measurement.internal.eo.a(int, String, String, int)>
						return;
	//   71  151:return          
					}
					if(obj == null)
						break label0;
	//   72  152:aload_3         
	//   73  153:ifnull          254
					k1 = ((bt)this).p().b(s2, obj);
	//   74  156:aload_0         
	//   75  157:invokevirtual   #281 <Method eo bt.p()>
	//   76  160:aload_2         
	//   77  161:aload_3         
	//   78  162:invokevirtual   #717 <Method int eo.b(String, Object)>
	//   79  165:istore          9
					if(k1 == 0)
						break label1;
	//   80  167:iload           9
	//   81  169:ifeq            230
					((bt)this).p();
	//   82  172:aload_0         
	//   83  173:invokevirtual   #281 <Method eo bt.p()>
	//   84  176:pop             
					s1 = com.google.android.gms.measurement.internal.eo.a(s2, 24, true);
	//   85  177:aload_2         
	//   86  178:bipush          24
	//   87  180:iconst_1        
	//   88  181:invokestatic    #225 <Method String com.google.android.gms.measurement.internal.eo.a(String, int, boolean)>
	//   89  184:astore_1        
					if(!(obj instanceof String))
	//*  90  185:aload_3         
	//*  91  186:instanceof      #186 <Class String>
	//*  92  189:ifne            203
					{
						i1 = j1;
	//   93  192:iload           8
	//   94  194:istore          7
						if(!(obj instanceof CharSequence))
							break label2;
	//   95  196:aload_3         
	//   96  197:instanceof      #829 <Class CharSequence>
	//   97  200:ifeq            212
					}
					i1 = String.valueOf(obj).length();
	//   98  203:aload_3         
	//   99  204:invokestatic    #832 <Method String String.valueOf(Object)>
	//  100  207:invokevirtual   #229 <Method int String.length()>
	//  101  210:istore          7
				}
				r.j().a(k1, "_ev", s1, i1);
	//  102  212:aload_0         
	//  103  213:getfield        #63  <Field ax r>
	//  104  216:invokevirtual   #193 <Method eo ax.j()>
	//  105  219:iload           9
	//  106  221:ldc1            #231 <String "_ev">
	//  107  223:aload_1         
	//  108  224:iload           7
	//  109  226:invokevirtual   #234 <Method void com.google.android.gms.measurement.internal.eo.a(int, String, String, int)>
				return;
	//  110  229:return          
			}
			obj = ((bt)this).p().c(s2, obj);
	//  111  230:aload_0         
	//  112  231:invokevirtual   #281 <Method eo bt.p()>
	//  113  234:aload_2         
	//  114  235:aload_3         
	//  115  236:invokevirtual   #722 <Method Object eo.c(String, Object)>
	//  116  239:astore_3        
			if(obj != null)
	//* 117  240:aload_3         
	//* 118  241:ifnull          253
				a(s1, s2, l1, obj);
	//  119  244:aload_0         
	//  120  245:aload_1         
	//  121  246:aload_2         
	//  122  247:lload           5
	//  123  249:aload_3         
	//  124  250:invokespecial   #834 <Method void a(String, String, long, Object)>
			return;
	//  125  253:return          
		}
		a(s1, s2, l1, ((Object) (null)));
	//  126  254:aload_0         
	//  127  255:aload_1         
	//  128  256:aload_2         
	//  129  257:lload           5
	//  130  259:aconst_null     
	//  131  260:invokespecial   #834 <Method void a(String, String, long, Object)>
	//  132  263:return          
	}

	public final void a(String s1, String s2, String s3, Bundle bundle)
	{
		am.a(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #116 <Method String am.a(String)>
	//    2    4:pop             
		((bt)this).a();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #782 <Method void com.google.android.gms.measurement.internal.bt.a()>
		b(s1, s2, s3, bundle);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:aload           4
	//   10   15:invokespecial   #836 <Method void b(String, String, String, Bundle)>
	//   11   18:return          
	}

	public final void a(boolean flag)
	{
		((dq)this).E();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #133 <Method void dq.E()>
		((bt)this).b();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #778 <Method void bt.b()>
		((bt)this).q().a(((Runnable) (new cm(this, flag))));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #521 <Method as bt.q()>
	//    6   12:new             #839 <Class cm>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokespecial   #842 <Method void cm(cd, boolean)>
	//   11   21:invokevirtual   #531 <Method void com.google.android.gms.measurement.internal.as.a(Runnable)>
	//   12   24:return          
	}

	public final List b(boolean flag)
	{
		((bt)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #778 <Method void bt.b()>
		((dq)this).E();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #133 <Method void dq.E()>
		((bt)this).r().w().a("Fetching user attributes (FE)");
	//    4    8:aload_0         
	//    5    9:invokevirtual   #71  <Method s bt.r()>
	//    6   12:invokevirtual   #77  <Method u s.w()>
	//    7   15:ldc2            #845 <String "Fetching user attributes (FE)">
	//    8   18:invokevirtual   #84  <Method void com.google.android.gms.measurement.internal.u.a(String)>
		if(((bt)this).q().g())
	//*   9   21:aload_0         
	//*  10   22:invokevirtual   #521 <Method as bt.q()>
	//*  11   25:invokevirtual   #536 <Method boolean as.g()>
	//*  12   28:ifeq            48
		{
			((bt)this).r().u_().a("Cannot get all user properties from analytics worker thread");
	//   13   31:aload_0         
	//   14   32:invokevirtual   #71  <Method s bt.r()>
	//   15   35:invokevirtual   #539 <Method u s.u_()>
	//   16   38:ldc2            #847 <String "Cannot get all user properties from analytics worker thread">
	//   17   41:invokevirtual   #84  <Method void com.google.android.gms.measurement.internal.u.a(String)>
			return Collections.emptyList();
	//   18   44:invokestatic    #547 <Method List Collections.emptyList()>
	//   19   47:areturn         
		}
		if(com.google.android.gms.measurement.internal.eu.a())
	//*  20   48:invokestatic    #550 <Method boolean com.google.android.gms.measurement.internal.eu.a()>
	//*  21   51:ifeq            71
		{
			((bt)this).r().u_().a("Cannot get all user properties from main thread");
	//   22   54:aload_0         
	//   23   55:invokevirtual   #71  <Method s bt.r()>
	//   24   58:invokevirtual   #539 <Method u s.u_()>
	//   25   61:ldc2            #849 <String "Cannot get all user properties from main thread">
	//   26   64:invokevirtual   #84  <Method void com.google.android.gms.measurement.internal.u.a(String)>
			return Collections.emptyList();
	//   27   67:invokestatic    #547 <Method List Collections.emptyList()>
	//   28   70:areturn         
		}
		Object obj = ((Object) (new AtomicReference()));
	//   29   71:new             #30  <Class AtomicReference>
	//   30   74:dup             
	//   31   75:invokespecial   #31  <Method void AtomicReference()>
	//   32   78:astore_2        
		obj;
	//   33   79:aload_2         
		JVM INSTR monitorenter ;
	//   34   80:monitorenter    
		r.q().a(((Runnable) (new ch(this, ((AtomicReference) (obj)), flag))));
	//   35   81:aload_0         
	//   36   82:getfield        #63  <Field ax r>
	//   37   85:invokevirtual   #553 <Method as ax.q()>
	//   38   88:new             #851 <Class ch>
	//   39   91:dup             
	//   40   92:aload_0         
	//   41   93:aload_2         
	//   42   94:iload_1         
	//   43   95:invokespecial   #854 <Method void ch(cd, AtomicReference, boolean)>
	//   44   98:invokevirtual   #531 <Method void com.google.android.gms.measurement.internal.as.a(Runnable)>
		obj.wait(5000L);
	//   45  101:aload_2         
	//   46  102:ldc2w           #559 <Long 5000L>
	//   47  105:invokevirtual   #564 <Method void Object.wait(long)>
		break MISSING_BLOCK_LABEL_126;
	//   48  108:goto            126
		Object obj1;
		obj1;
	//   49  111:astore_3        
		((bt)this).r().i().a("Interrupted waiting for get user properties", obj1);
	//   50  112:aload_0         
	//   51  113:invokevirtual   #71  <Method s bt.r()>
	//   52  116:invokevirtual   #168 <Method u s.i()>
	//   53  119:ldc2            #684 <String "Interrupted waiting for get user properties">
	//   54  122:aload_3         
	//   55  123:invokevirtual   #173 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
		obj;
	//   56  126:aload_2         
		JVM INSTR monitorexit ;
	//   57  127:monitorexit     
		obj = ((Object) ((List)((AtomicReference) (obj)).get()));
	//   58  128:aload_2         
	//   59  129:invokevirtual   #568 <Method Object AtomicReference.get()>
	//   60  132:checkcast       #343 <Class List>
	//   61  135:astore_2        
		if(obj == null)
	//*  62  136:aload_2         
	//*  63  137:ifnonnull       157
		{
			((bt)this).r().i().a("Timed out waiting for get user properties");
	//   64  140:aload_0         
	//   65  141:invokevirtual   #71  <Method s bt.r()>
	//   66  144:invokevirtual   #168 <Method u s.i()>
	//   67  147:ldc2            #686 <String "Timed out waiting for get user properties">
	//   68  150:invokevirtual   #84  <Method void com.google.android.gms.measurement.internal.u.a(String)>
			return Collections.emptyList();
	//   69  153:invokestatic    #547 <Method List Collections.emptyList()>
	//   70  156:areturn         
		} else
		{
			return ((List) (obj));
	//   71  157:aload_2         
	//   72  158:areturn         
		}
		obj1;
	//   73  159:astore_3        
		obj;
	//   74  160:aload_2         
		JVM INSTR monitorexit ;
	//   75  161:monitorexit     
		throw obj1;
	//   76  162:aload_3         
	//   77  163:athrow          
	}

	public final volatile void b()
	{
		super.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #855 <Method void dq.b()>
	//    2    4:return          
	}

	public final void b(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionaluserproperty)
	{
		am.a(((Object) (conditionaluserproperty)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #128 <Method Object am.a(Object)>
	//    2    4:pop             
		am.a(conditionaluserproperty.mAppId);
	//    3    5:aload_1         
	//    4    6:getfield        #585 <Field String com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty.mAppId>
	//    5    9:invokestatic    #116 <Method String am.a(String)>
	//    6   12:pop             
		((bt)this).a();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #782 <Method void com.google.android.gms.measurement.internal.bt.a()>
		c(new com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty(conditionaluserproperty));
	//    9   17:aload_0         
	//   10   18:new             #578 <Class com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty>
	//   11   21:dup             
	//   12   22:aload_1         
	//   13   23:invokespecial   #788 <Method void com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty(com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty)>
	//   14   26:invokespecial   #792 <Method void c(com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty)>
	//   15   29:return          
	}

	final void b(String s1, String s2, Bundle bundle)
	{
		((bt)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #778 <Method void bt.b()>
		((bt)this).d();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #130 <Method void bt.d()>
		a(s1, s2, ((bt)this).m().a(), bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #395 <Method e com.google.android.gms.measurement.internal.bt.m()>
	//    9   15:invokeinterface #398 <Method long e.a()>
	//   10   20:aload_3         
	//   11   21:invokevirtual   #857 <Method void a(String, String, long, Bundle)>
	//   12   24:return          
	}

	public final volatile void c()
	{
		super.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #859 <Method void dq.c()>
	//    2    4:return          
	}

	public final void c(String s1, String s2, Bundle bundle)
	{
		((bt)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #778 <Method void bt.b()>
		b(((String) (null)), s1, s2, bundle);
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokespecial   #836 <Method void b(String, String, String, Bundle)>
	//    8   12:return          
	}

	public final volatile void d()
	{
		super.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #860 <Method void dq.d()>
	//    2    4:return          
	}

	public final volatile com.google.android.gms.measurement.internal.a e()
	{
		return super.e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #863 <Method com.google.android.gms.measurement.internal.a com.google.android.gms.measurement.internal.dq.e()>
	//    2    4:areturn         
	}

	public final volatile cd f()
	{
		return super.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #866 <Method cd com.google.android.gms.measurement.internal.dq.f()>
	//    2    4:areturn         
	}

	public final volatile com.google.android.gms.measurement.internal.m g()
	{
		return super.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #867 <Method com.google.android.gms.measurement.internal.m dq.g()>
	//    2    4:areturn         
	}

	public final volatile cv h()
	{
		return super.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #868 <Method cv dq.h()>
	//    2    4:areturn         
	}

	public final volatile cr i()
	{
		return super.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #869 <Method cr dq.i()>
	//    2    4:areturn         
	}

	public final volatile o j()
	{
		return super.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #872 <Method o dq.j()>
	//    2    4:areturn         
	}

	public final volatile du k()
	{
		return super.k();
	//    0    0:aload_0         
	//    1    1:invokespecial   #873 <Method du dq.k()>
	//    2    4:areturn         
	}

	public final volatile b l()
	{
		return super.l();
	//    0    0:aload_0         
	//    1    1:invokespecial   #877 <Method b dq.l()>
	//    2    4:areturn         
	}

	public final volatile e m()
	{
		return super.m();
	//    0    0:aload_0         
	//    1    1:invokespecial   #878 <Method e com.google.android.gms.measurement.internal.dq.m()>
	//    2    4:areturn         
	}

	public final volatile Context n()
	{
		return super.n();
	//    0    0:aload_0         
	//    1    1:invokespecial   #879 <Method Context dq.n()>
	//    2    4:areturn         
	}

	public final volatile q o()
	{
		return super.o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #880 <Method q dq.o()>
	//    2    4:areturn         
	}

	public final volatile eo p()
	{
		return super.p();
	//    0    0:aload_0         
	//    1    1:invokespecial   #881 <Method eo dq.p()>
	//    2    4:areturn         
	}

	public final volatile as q()
	{
		return super.q();
	//    0    0:aload_0         
	//    1    1:invokespecial   #882 <Method as dq.q()>
	//    2    4:areturn         
	}

	public final volatile s r()
	{
		return super.r();
	//    0    0:aload_0         
	//    1    1:invokespecial   #883 <Method s dq.r()>
	//    2    4:areturn         
	}

	public final volatile ae s()
	{
		return super.s();
	//    0    0:aload_0         
	//    1    1:invokespecial   #884 <Method ae dq.s()>
	//    2    4:areturn         
	}

	public final volatile ew t()
	{
		return super.t();
	//    0    0:aload_0         
	//    1    1:invokespecial   #885 <Method ew dq.t()>
	//    2    4:areturn         
	}

	public final volatile eu u()
	{
		return super.u();
	//    0    0:aload_0         
	//    1    1:invokespecial   #886 <Method eu dq.u()>
	//    2    4:areturn         
	}

	protected final boolean v()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final String x()
	{
		((bt)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #778 <Method void bt.b()>
		return (String)f.get();
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field AtomicReference f>
	//    4    8:invokevirtual   #568 <Method Object AtomicReference.get()>
	//    5   11:checkcast       #186 <Class String>
	//    6   14:areturn         
	}

	public final void y()
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #130 <Method void bt.d()>
		((bt)this).b();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #778 <Method void bt.b()>
		((dq)this).E();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #133 <Method void dq.E()>
		if(!r.H())
	//*   6   12:aload_0         
	//*   7   13:getfield        #63  <Field ax r>
	//*   8   16:invokevirtual   #278 <Method boolean ax.H()>
	//*   9   19:ifne            23
			return;
	//   10   22:return          
		((ct)this).h().z();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #93  <Method cv ct.h()>
	//   13   27:invokevirtual   #889 <Method void cv.z()>
		b = false;
	//   14   30:aload_0         
	//   15   31:iconst_0        
	//   16   32:putfield        #28  <Field boolean b>
		String s1 = ((bt)this).s().v();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #360 <Method ae bt.s()>
	//   19   39:invokevirtual   #891 <Method String ae.v()>
	//   20   42:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*  21   43:aload_1         
	//*  22   44:invokestatic    #730 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  23   47:ifne            94
		{
			((bu) (((bt)this).l())).A();
	//   24   50:aload_0         
	//   25   51:invokevirtual   #892 <Method b bt.l()>
	//   26   54:invokevirtual   #896 <Method void bu.A()>
			if(!s1.equals(((Object) (android.os.Build.VERSION.RELEASE))))
	//*  27   57:aload_1         
	//*  28   58:getstatic       #901 <Field String android.os.Build$VERSION.RELEASE>
	//*  29   61:invokevirtual   #190 <Method boolean String.equals(Object)>
	//*  30   64:ifne            94
			{
				Bundle bundle = new Bundle();
	//   31   67:new             #246 <Class Bundle>
	//   32   70:dup             
	//   33   71:invokespecial   #809 <Method void Bundle()>
	//   34   74:astore_2        
				bundle.putString("_po", s1);
	//   35   75:aload_2         
	//   36   76:ldc2            #903 <String "_po">
	//   37   79:aload_1         
	//   38   80:invokevirtual   #459 <Method void Bundle.putString(String, String)>
				a("auto", "_ou", bundle);
	//   39   83:aload_0         
	//   40   84:ldc2            #389 <String "auto">
	//   41   87:ldc2            #905 <String "_ou">
	//   42   90:aload_2         
	//   43   91:invokevirtual   #907 <Method void a(String, String, Bundle)>
			}
		}
	//   44   94:return          
	}

	public final String z()
	{
		cq cq1 = r.w().y();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field ax r>
	//    2    4:invokevirtual   #760 <Method cr ax.w()>
	//    3    7:invokevirtual   #762 <Method cq cr.y()>
	//    4   10:astore_1        
		if(cq1 != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          20
			return cq1.a;
	//    7   15:aload_1         
	//    8   16:getfield        #908 <Field String com.google.android.gms.measurement.internal.cq.a>
	//    9   19:areturn         
		else
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
	}

	protected cn a;
	protected boolean b;
	private bz c;
	private final Set d = new CopyOnWriteArraySet();
	private boolean e;
	private final AtomicReference f = new AtomicReference();
}
