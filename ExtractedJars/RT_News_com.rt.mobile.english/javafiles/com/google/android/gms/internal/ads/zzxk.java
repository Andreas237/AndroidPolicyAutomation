// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzww, zzxb, zzakb, zznx, 
//			zzaef, zzjn, zzxg, zzwx, 
//			zzxe, zzakk, zzxl, zzwy, 
//			zzxn

public final class zzxk
	implements zzww
{

	public zzxk(Context context, zzaef zzaef1, zzxn zzxn, zzwy zzwy, boolean flag, boolean flag1, String s, 
			long l, long l1, zznx zznx1, boolean flag2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void Object()>
	//    6   12:putfield        #41  <Field Object mLock>
		zzbuf = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #43  <Field boolean zzbuf>
		zzbui = ((List) (new ArrayList()));
	//   10   20:aload_0         
	//   11   21:new             #45  <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #46  <Method void ArrayList()>
	//   14   28:putfield        #48  <Field List zzbui>
		mContext = context;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:putfield        #50  <Field Context mContext>
		zzbuc = zzaef1;
	//   18   36:aload_0         
	//   19   37:aload_2         
	//   20   38:putfield        #52  <Field zzaef zzbuc>
		zzwh = zzxn;
	//   21   41:aload_0         
	//   22   42:aload_3         
	//   23   43:putfield        #54  <Field zzxn zzwh>
		zzbtj = zzwy;
	//   24   46:aload_0         
	//   25   47:aload           4
	//   26   49:putfield        #56  <Field zzwy zzbtj>
		zzael = flag;
	//   27   52:aload_0         
	//   28   53:iload           5
	//   29   55:putfield        #58  <Field boolean zzael>
		zzbtn = flag1;
	//   30   58:aload_0         
	//   31   59:iload           6
	//   32   61:putfield        #60  <Field boolean zzbtn>
		zzbuh = s;
	//   33   64:aload_0         
	//   34   65:aload           7
	//   35   67:putfield        #62  <Field String zzbuh>
		mStartTime = l;
	//   36   70:aload_0         
	//   37   71:lload           8
	//   38   73:putfield        #64  <Field long mStartTime>
		zzbud = l1;
	//   39   76:aload_0         
	//   40   77:lload           10
	//   41   79:putfield        #66  <Field long zzbud>
		zzvr = zznx1;
	//   42   82:aload_0         
	//   43   83:aload           12
	//   44   85:putfield        #68  <Field zznx zzvr>
		zzbto = flag2;
	//   45   88:aload_0         
	//   46   89:iload           13
	//   47   91:putfield        #70  <Field boolean zzbto>
	//   48   94:return          
	}

	public final void cancel()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzbuf = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #43  <Field boolean zzbuf>
			if(zzbum != null)
	//*   8   12:aload_0         
	//*   9   13:getfield        #74  <Field zzxb zzbum>
	//*  10   16:ifnull          26
				zzbum.cancel();
	//   11   19:aload_0         
	//   12   20:getfield        #74  <Field zzxb zzbum>
	//   13   23:invokevirtual   #78  <Method void zzxb.cancel()>
		}
	//   14   26:aload_1         
	//   15   27:monitorexit     
		return;
	//   16   28:return          
		exception;
	//   17   29:astore_2        
		obj;
	//   18   30:aload_1         
		JVM INSTR monitorexit ;
	//   19   31:monitorexit     
		throw exception;
	//   20   32:aload_2         
	//   21   33:athrow          
	}

	public final zzxe zzh(List list)
	{
		Object obj;
		Object obj2;
		Object obj3;
		zzakb.zzck("Starting mediation.");
	//    0    0:ldc1            #82  <String "Starting mediation.">
	//    1    2:invokestatic    #88  <Method void zzakb.zzck(String)>
		obj3 = ((Object) (new ArrayList()));
	//    2    5:new             #45  <Class ArrayList>
	//    3    8:dup             
	//    4    9:invokespecial   #46  <Method void ArrayList()>
	//    5   12:astore          15
		obj2 = ((Object) (zzvr.zzjj()));
	//    6   14:aload_0         
	//    7   15:getfield        #68  <Field zznx zzvr>
	//    8   18:invokevirtual   #94  <Method zznv zznx.zzjj()>
	//    9   21:astore          14
		zzjn zzjn1 = zzbuc.zzacv;
	//   10   23:aload_0         
	//   11   24:getfield        #52  <Field zzaef zzbuc>
	//   12   27:getfield        #100 <Field zzjn zzaef.zzacv>
	//   13   30:astore          10
		Object aobj[] = ((Object []) (new int[2]));
	//   14   32:iconst_2        
	//   15   33:newarray        int[]
	//   16   35:astore          11
		obj = ((Object) (zzjn1));
	//   17   37:aload           10
	//   18   39:astore          9
		if(zzjn1.zzard != null)
	//*  19   41:aload           10
	//*  20   43:getfield        #106 <Field zzjn[] zzjn.zzard>
	//*  21   46:ifnull          139
		{
			zzbv.zzfd();
	//   22   49:invokestatic    #112 <Method zzxg zzbv.zzfd()>
	//   23   52:pop             
			obj = ((Object) (zzjn1));
	//   24   53:aload           10
	//   25   55:astore          9
			if(zzxg.zza(zzbuh, ((int []) (aobj))))
	//*  26   57:aload_0         
	//*  27   58:getfield        #62  <Field String zzbuh>
	//*  28   61:aload           11
	//*  29   63:invokestatic    #118 <Method boolean zzxg.zza(String, int[])>
	//*  30   66:ifeq            139
			{
				int j = aobj[0];
	//   31   69:aload           11
	//   32   71:iconst_0        
	//   33   72:iaload          
	//   34   73:istore_3        
				int k = aobj[1];
	//   35   74:aload           11
	//   36   76:iconst_1        
	//   37   77:iaload          
	//   38   78:istore          4
				aobj = ((Object []) (zzjn1.zzard));
	//   39   80:aload           10
	//   40   82:getfield        #106 <Field zzjn[] zzjn.zzard>
	//   41   85:astore          11
				int l = aobj.length;
	//   42   87:aload           11
	//   43   89:arraylength     
	//   44   90:istore          5
				int i = 0;
	//   45   92:iconst_0        
	//   46   93:istore_2        
				do
				{
					obj = ((Object) (zzjn1));
	//   47   94:aload           10
	//   48   96:astore          9
					if(i >= l)
						break;
	//   49   98:iload_2         
	//   50   99:iload           5
	//   51  101:icmpge          139
					obj = ((Object) (aobj[i]));
	//   52  104:aload           11
	//   53  106:iload_2         
	//   54  107:aaload          
	//   55  108:astore          9
					if(j == ((zzjn) (obj)).width && k == ((zzjn) (obj)).height)
	//*  56  110:iload_3         
	//*  57  111:aload           9
	//*  58  113:getfield        #122 <Field int zzjn.width>
	//*  59  116:icmpne          132
	//*  60  119:iload           4
	//*  61  121:aload           9
	//*  62  123:getfield        #125 <Field int zzjn.height>
	//*  63  126:icmpne          132
						break;
	//   64  129:goto            139
					i++;
	//   65  132:iload_2         
	//   66  133:iconst_1        
	//   67  134:iadd            
	//   68  135:istore_2        
				} while(true);
	//   69  136:goto            94
			}
		}
		list = ((List) (list.iterator()));
	//   70  139:aload_1         
	//   71  140:invokeinterface #131 <Method Iterator List.iterator()>
	//   72  145:astore_1        
_L4:
		if(!((Iterator) (list)).hasNext()) goto _L2; else goto _L1
	//   73  146:aload_1         
	//   74  147:invokeinterface #137 <Method boolean Iterator.hasNext()>
	//   75  152:ifeq            655
_L1:
		Object obj1;
		zznv zznv;
		List list1;
		Iterator iterator;
		zzwx zzwx1;
		zzwx1 = (zzwx)((Iterator) (list)).next();
	//   76  155:aload_1         
	//   77  156:invokeinterface #141 <Method Object Iterator.next()>
	//   78  161:checkcast       #143 <Class zzwx>
	//   79  164:astore          16
		obj1 = ((Object) (String.valueOf(((Object) (zzwx1.zzbrs)))));
	//   80  166:aload           16
	//   81  168:getfield        #146 <Field String zzwx.zzbrs>
	//   82  171:invokestatic    #152 <Method String String.valueOf(Object)>
	//   83  174:astore          10
		if(((String) (obj1)).length() != 0)
	//*  84  176:aload           10
	//*  85  178:invokevirtual   #156 <Method int String.length()>
	//*  86  181:ifeq            196
			obj1 = ((Object) ("Trying mediation network: ".concat(((String) (obj1)))));
	//   87  184:ldc1            #158 <String "Trying mediation network: ">
	//   88  186:aload           10
	//   89  188:invokevirtual   #162 <Method String String.concat(String)>
	//   90  191:astore          10
		else
	//*  91  193:goto            207
			obj1 = ((Object) (new String("Trying mediation network: ")));
	//   92  196:new             #148 <Class String>
	//   93  199:dup             
	//   94  200:ldc1            #158 <String "Trying mediation network: ">
	//   95  202:invokespecial   #164 <Method void String(String)>
	//   96  205:astore          10
		zzakb.zzdj(((String) (obj1)));
	//   97  207:aload           10
	//   98  209:invokestatic    #167 <Method void zzakb.zzdj(String)>
		iterator = zzwx1.zzbrt.iterator();
	//   99  212:aload           16
	//  100  214:getfield        #170 <Field List zzwx.zzbrt>
	//  101  217:invokeinterface #131 <Method Iterator List.iterator()>
	//  102  222:astore          13
		list1 = list;
	//  103  224:aload_1         
	//  104  225:astore          12
		zznv = ((zznv) (obj2));
	//  105  227:aload           14
	//  106  229:astore          11
		obj1 = obj3;
	//  107  231:aload           15
	//  108  233:astore          10
_L8:
		obj3 = obj1;
	//  109  235:aload           10
	//  110  237:astore          15
		obj2 = ((Object) (zznv));
	//  111  239:aload           11
	//  112  241:astore          14
		list = list1;
	//  113  243:aload           12
	//  114  245:astore_1        
		if(!iterator.hasNext()) goto _L4; else goto _L3
	//  115  246:aload           13
	//  116  248:invokeinterface #137 <Method boolean Iterator.hasNext()>
	//  117  253:ifeq            146
_L3:
		zznv zznv1;
		obj3 = ((Object) ((String)iterator.next()));
	//  118  256:aload           13
	//  119  258:invokeinterface #141 <Method Object Iterator.next()>
	//  120  263:checkcast       #148 <Class String>
	//  121  266:astore          15
		zznv1 = zzvr.zzjj();
	//  122  268:aload_0         
	//  123  269:getfield        #68  <Field zznx zzvr>
	//  124  272:invokevirtual   #94  <Method zznv zznx.zzjj()>
	//  125  275:astore          17
		list = ((List) (mLock));
	//  126  277:aload_0         
	//  127  278:getfield        #41  <Field Object mLock>
	//  128  281:astore_1        
		list;
	//  129  282:aload_1         
		JVM INSTR monitorenter ;
	//  130  283:monitorenter    
		boolean flag = zzbuf;
	//  131  284:aload_0         
	//  132  285:getfield        #43  <Field boolean zzbuf>
	//  133  288:istore          6
		if(!flag) goto _L6; else goto _L5
	//  134  290:iload           6
	//  135  292:ifeq            318
_L5:
		obj = ((Object) (new zzxe(-1)));
	//  136  295:new             #172 <Class zzxe>
	//  137  298:dup             
	//  138  299:iconst_m1       
	//  139  300:invokespecial   #175 <Method void zzxe(int)>
	//  140  303:astore          9
		list;
	//  141  305:aload_1         
		JVM INSTR monitorexit ;
	//  142  306:monitorexit     
		return ((zzxe) (obj));
	//  143  307:aload           9
	//  144  309:areturn         
		obj1;
	//  145  310:astore          10
		obj = ((Object) (list));
	//  146  312:aload_1         
	//  147  313:astore          9
		  goto _L7
	//* 148  315:goto            641
_L6:
		boolean flag1;
		boolean flag2;
		Context context;
		zzxn zzxn;
		zzwy zzwy;
		zzjj zzjj;
		zzang zzang;
		zzpl zzpl;
		List list2;
		List list3;
		List list4;
		context = mContext;
	//  149  318:aload_0         
	//  150  319:getfield        #50  <Field Context mContext>
	//  151  322:astore          18
		zzxn = zzwh;
	//  152  324:aload_0         
	//  153  325:getfield        #54  <Field zzxn zzwh>
	//  154  328:astore          19
		zzwy = zzbtj;
	//  155  330:aload_0         
	//  156  331:getfield        #56  <Field zzwy zzbtj>
	//  157  334:astore          20
		zzjj = zzbuc.zzccv;
	//  158  336:aload_0         
	//  159  337:getfield        #52  <Field zzaef zzbuc>
	//  160  340:getfield        #179 <Field zzjj zzaef.zzccv>
	//  161  343:astore          21
		zzang = zzbuc.zzacr;
	//  162  345:aload_0         
	//  163  346:getfield        #52  <Field zzaef zzbuc>
	//  164  349:getfield        #183 <Field zzang zzaef.zzacr>
	//  165  352:astore          22
		flag = zzael;
	//  166  354:aload_0         
	//  167  355:getfield        #58  <Field boolean zzael>
	//  168  358:istore          6
		flag1 = zzbtn;
	//  169  360:aload_0         
	//  170  361:getfield        #60  <Field boolean zzbtn>
	//  171  364:istore          7
		zzpl = zzbuc.zzadj;
	//  172  366:aload_0         
	//  173  367:getfield        #52  <Field zzaef zzbuc>
	//  174  370:getfield        #187 <Field zzpl zzaef.zzadj>
	//  175  373:astore          23
		list2 = zzbuc.zzads;
	//  176  375:aload_0         
	//  177  376:getfield        #52  <Field zzaef zzbuc>
	//  178  379:getfield        #190 <Field List zzaef.zzads>
	//  179  382:astore          24
		list3 = zzbuc.zzcdk;
	//  180  384:aload_0         
	//  181  385:getfield        #52  <Field zzaef zzbuc>
	//  182  388:getfield        #193 <Field List zzaef.zzcdk>
	//  183  391:astore          25
		list4 = zzbuc.zzcef;
	//  184  393:aload_0         
	//  185  394:getfield        #52  <Field zzaef zzbuc>
	//  186  397:getfield        #196 <Field List zzaef.zzcef>
	//  187  400:astore          26
		flag2 = zzbto;
	//  188  402:aload_0         
	//  189  403:getfield        #70  <Field boolean zzbto>
	//  190  406:istore          8
		obj2 = ((Object) (list));
	//  191  408:aload_1         
	//  192  409:astore          14
		list = ((List) (obj2));
	//  193  411:aload           14
	//  194  413:astore_1        
		zzbum = new zzxb(context, ((String) (obj3)), zzxn, zzwy, zzwx1, zzjj, ((zzjn) (obj)), zzang, flag, flag1, zzpl, list2, list3, list4, flag2);
	//  195  414:aload_0         
	//  196  415:new             #76  <Class zzxb>
	//  197  418:dup             
	//  198  419:aload           18
	//  199  421:aload           15
	//  200  423:aload           19
	//  201  425:aload           20
	//  202  427:aload           16
	//  203  429:aload           21
	//  204  431:aload           9
	//  205  433:aload           22
	//  206  435:iload           6
	//  207  437:iload           7
	//  208  439:aload           23
	//  209  441:aload           24
	//  210  443:aload           25
	//  211  445:aload           26
	//  212  447:iload           8
	//  213  449:invokespecial   #199 <Method void zzxb(Context, String, zzxn, zzwy, zzwx, zzjj, zzjn, zzang, boolean, boolean, zzpl, List, List, List, boolean)>
	//  214  452:putfield        #74  <Field zzxb zzbum>
		list = ((List) (obj2));
	//  215  455:aload           14
	//  216  457:astore_1        
		obj2;
	//  217  458:aload           14
		JVM INSTR monitorexit ;
	//  218  460:monitorexit     
		list = ((List) (zzbum.zza(mStartTime, zzbud)));
	//  219  461:aload_0         
	//  220  462:getfield        #74  <Field zzxb zzbum>
	//  221  465:aload_0         
	//  222  466:getfield        #64  <Field long mStartTime>
	//  223  469:aload_0         
	//  224  470:getfield        #66  <Field long zzbud>
	//  225  473:invokevirtual   #202 <Method zzxe zzxb.zza(long, long)>
	//  226  476:astore_1        
		zzbui.add(((Object) (list)));
	//  227  477:aload_0         
	//  228  478:getfield        #48  <Field List zzbui>
	//  229  481:aload_1         
	//  230  482:invokeinterface #206 <Method boolean List.add(Object)>
	//  231  487:pop             
		if(((zzxe) (list)).zzbtv == 0)
	//* 232  488:aload_1         
	//* 233  489:getfield        #209 <Field int zzxe.zzbtv>
	//* 234  492:ifne            577
		{
			zzakb.zzck("Adapter succeeded.");
	//  235  495:ldc1            #211 <String "Adapter succeeded.">
	//  236  497:invokestatic    #88  <Method void zzakb.zzck(String)>
			zzvr.zze("mediation_network_succeed", ((String) (obj3)));
	//  237  500:aload_0         
	//  238  501:getfield        #68  <Field zznx zzvr>
	//  239  504:ldc1            #213 <String "mediation_network_succeed">
	//  240  506:aload           15
	//  241  508:invokevirtual   #217 <Method void zznx.zze(String, String)>
			if(!((List) (obj1)).isEmpty())
	//* 242  511:aload           10
	//* 243  513:invokeinterface #220 <Method boolean List.isEmpty()>
	//* 244  518:ifne            537
				zzvr.zze("mediation_networks_fail", TextUtils.join(",", ((Iterable) (obj1))));
	//  245  521:aload_0         
	//  246  522:getfield        #68  <Field zznx zzvr>
	//  247  525:ldc1            #222 <String "mediation_networks_fail">
	//  248  527:ldc1            #224 <String ",">
	//  249  529:aload           10
	//  250  531:invokestatic    #230 <Method String TextUtils.join(CharSequence, Iterable)>
	//  251  534:invokevirtual   #217 <Method void zznx.zze(String, String)>
			zzvr.zza(zznv1, new String[] {
				"mls"
			});
	//  252  537:aload_0         
	//  253  538:getfield        #68  <Field zznx zzvr>
	//  254  541:aload           17
	//  255  543:iconst_1        
	//  256  544:anewarray       String[]
	//  257  547:dup             
	//  258  548:iconst_0        
	//  259  549:ldc1            #232 <String "mls">
	//  260  551:aastore         
	//  261  552:invokevirtual   #235 <Method boolean zznx.zza(zznv, String[])>
	//  262  555:pop             
			zzvr.zza(zznv, new String[] {
				"ttm"
			});
	//  263  556:aload_0         
	//  264  557:getfield        #68  <Field zznx zzvr>
	//  265  560:aload           11
	//  266  562:iconst_1        
	//  267  563:anewarray       String[]
	//  268  566:dup             
	//  269  567:iconst_0        
	//  270  568:ldc1            #237 <String "ttm">
	//  271  570:aastore         
	//  272  571:invokevirtual   #235 <Method boolean zznx.zza(zznv, String[])>
	//  273  574:pop             
			return ((zzxe) (list));
	//  274  575:aload_1         
	//  275  576:areturn         
		}
		((List) (obj1)).add(obj3);
	//  276  577:aload           10
	//  277  579:aload           15
	//  278  581:invokeinterface #206 <Method boolean List.add(Object)>
	//  279  586:pop             
		zzvr.zza(zznv1, new String[] {
			"mlf"
		});
	//  280  587:aload_0         
	//  281  588:getfield        #68  <Field zznx zzvr>
	//  282  591:aload           17
	//  283  593:iconst_1        
	//  284  594:anewarray       String[]
	//  285  597:dup             
	//  286  598:iconst_0        
	//  287  599:ldc1            #239 <String "mlf">
	//  288  601:aastore         
	//  289  602:invokevirtual   #235 <Method boolean zznx.zza(zznv, String[])>
	//  290  605:pop             
		if(((zzxe) (list)).zzbtx != null)
	//* 291  606:aload_1         
	//* 292  607:getfield        #243 <Field zzxq zzxe.zzbtx>
	//* 293  610:ifnull          629
			zzakk.zzcrm.post(((Runnable) (new zzxl(this, ((zzxe) (list))))));
	//  294  613:getstatic       #249 <Field Handler zzakk.zzcrm>
	//  295  616:new             #251 <Class zzxl>
	//  296  619:dup             
	//  297  620:aload_0         
	//  298  621:aload_1         
	//  299  622:invokespecial   #254 <Method void zzxl(zzxk, zzxe)>
	//  300  625:invokevirtual   #260 <Method boolean Handler.post(Runnable)>
	//  301  628:pop             
		  goto _L8
	//* 302  629:goto            235
		Exception exception;
		exception;
	//  303  632:astore          9
_L9:
		obj1 = ((Object) (exception));
	//  304  634:aload           9
	//  305  636:astore          10
		exception = ((Exception) (list));
	//  306  638:aload_1         
	//  307  639:astore          9
_L7:
		list = ((List) (exception));
	//  308  641:aload           9
	//  309  643:astore_1        
		exception;
	//  310  644:aload           9
		JVM INSTR monitorexit ;
	//  311  646:monitorexit     
		throw obj1;
	//  312  647:aload           10
	//  313  649:athrow          
		exception;
	//  314  650:astore          9
		if(true) goto _L9; else goto _L2
	//  315  652:goto            634
_L2:
		if(!((List) (obj3)).isEmpty())
	//* 316  655:aload           15
	//* 317  657:invokeinterface #220 <Method boolean List.isEmpty()>
	//* 318  662:ifne            681
			zzvr.zze("mediation_networks_fail", TextUtils.join(",", ((Iterable) (obj3))));
	//  319  665:aload_0         
	//  320  666:getfield        #68  <Field zznx zzvr>
	//  321  669:ldc1            #222 <String "mediation_networks_fail">
	//  322  671:ldc1            #224 <String ",">
	//  323  673:aload           15
	//  324  675:invokestatic    #230 <Method String TextUtils.join(CharSequence, Iterable)>
	//  325  678:invokevirtual   #217 <Method void zznx.zze(String, String)>
		return new zzxe(1);
	//  326  681:new             #172 <Class zzxe>
	//  327  684:dup             
	//  328  685:iconst_1        
	//  329  686:invokespecial   #175 <Method void zzxe(int)>
	//  330  689:areturn         
	}

	public final List zzme()
	{
		return zzbui;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field List zzbui>
	//    2    4:areturn         
	}

	private final Context mContext;
	private final Object mLock = new Object();
	private final long mStartTime;
	private final boolean zzael;
	private final zzwy zzbtj;
	private final boolean zzbtn;
	private final boolean zzbto;
	private final zzaef zzbuc;
	private final long zzbud;
	private boolean zzbuf;
	private final String zzbuh;
	private List zzbui;
	private zzxb zzbum;
	private final zznx zzvr;
	private final zzxn zzwh;
}
