// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.applications;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.comscore.analytics.ApplicationState;
import com.comscore.analytics.Core;
import com.comscore.measurement.Label;
import com.comscore.measurement.Measurement;
import com.comscore.metrics.EventType;
import com.comscore.utils.API13;
import com.comscore.utils.OfflineMeasurementsCache;
import com.comscore.utils.id.IdHelper;
import java.util.HashMap;
import java.util.Locale;

// Referenced classes of package com.comscore.applications:
//			EventType, AppStartMeasurement, AggregateMeasurement

public class ApplicationMeasurement extends Measurement
{

	protected ApplicationMeasurement(Core core, com.comscore.applications.EventType eventtype, String s)
	{
		this(core, eventtype, s, false, false, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:iconst_0        
	//    6    6:iconst_1        
	//    7    7:invokespecial   #9   <Method void ApplicationMeasurement(Core, com.comscore.applications.EventType, String, boolean, boolean, boolean)>
	//    8   10:return          
	}

	protected ApplicationMeasurement(Core core, com.comscore.applications.EventType eventtype, String s, boolean flag, boolean flag1, boolean flag2)
	{
		super(core);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void Measurement(Core)>
		core.update(flag2);
	//    3    5:aload_1         
	//    4    6:iload           6
	//    5    8:invokevirtual   #19  <Method void Core.update(boolean)>
		if(flag2)
	//*   6   11:iload           6
	//*   7   13:ifeq            515
		{
			int i = core.getForegroundTransitionsCountDelta(flag1);
	//    8   16:aload_1         
	//    9   17:iload           5
	//   10   19:invokevirtual   #23  <Method int Core.getForegroundTransitionsCountDelta(boolean)>
	//   11   22:istore          7
			long l1 = core.getForegroundTotalTime(flag);
	//   12   24:aload_1         
	//   13   25:iload           4
	//   14   27:invokevirtual   #27  <Method long Core.getForegroundTotalTime(boolean)>
	//   15   30:lstore          12
			long l3 = core.getForegroundTimeDelta(flag1);
	//   16   32:aload_1         
	//   17   33:iload           5
	//   18   35:invokevirtual   #30  <Method long Core.getForegroundTimeDelta(boolean)>
	//   19   38:lstore          14
			long l4 = core.getBackgroundTotalTime(flag);
	//   20   40:aload_1         
	//   21   41:iload           4
	//   22   43:invokevirtual   #33  <Method long Core.getBackgroundTotalTime(boolean)>
	//   23   46:lstore          16
			long l5 = core.getBackgroundTimeDelta(flag1);
	//   24   48:aload_1         
	//   25   49:iload           5
	//   26   51:invokevirtual   #36  <Method long Core.getBackgroundTimeDelta(boolean)>
	//   27   54:lstore          18
			long l6 = core.getInactiveTotalTime(flag);
	//   28   56:aload_1         
	//   29   57:iload           4
	//   30   59:invokevirtual   #39  <Method long Core.getInactiveTotalTime(boolean)>
	//   31   62:lstore          20
			long l7 = core.getInactiveTimeDelta(flag1);
	//   32   64:aload_1         
	//   33   65:iload           5
	//   34   67:invokevirtual   #42  <Method long Core.getInactiveTimeDelta(boolean)>
	//   35   70:lstore          22
			long l8 = core.getApplicationSessionTimeDelta(flag1);
	//   36   72:aload_1         
	//   37   73:iload           5
	//   38   75:invokevirtual   #45  <Method long Core.getApplicationSessionTimeDelta(boolean)>
	//   39   78:lstore          24
			long l9 = core.getActiveUserSessionTimeDelta(flag1);
	//   40   80:aload_1         
	//   41   81:iload           5
	//   42   83:invokevirtual   #48  <Method long Core.getActiveUserSessionTimeDelta(boolean)>
	//   43   86:lstore          26
			long l10 = core.getUserSessionTimeDelta(flag1);
	//   44   88:aload_1         
	//   45   89:iload           5
	//   46   91:invokevirtual   #51  <Method long Core.getUserSessionTimeDelta(boolean)>
	//   47   94:lstore          28
			long l11 = core.getAutoUpdateInterval();
	//   48   96:aload_1         
	//   49   97:invokevirtual   #55  <Method long Core.getAutoUpdateInterval()>
	//   50  100:lstore          30
			int k = core.getApplicationSessionCountDelta(flag1);
	//   51  102:aload_1         
	//   52  103:iload           5
	//   53  105:invokevirtual   #58  <Method int Core.getApplicationSessionCountDelta(boolean)>
	//   54  108:istore          8
			int i1 = core.getActiveUserSessionCountDelta(flag1);
	//   55  110:aload_1         
	//   56  111:iload           5
	//   57  113:invokevirtual   #61  <Method int Core.getActiveUserSessionCountDelta(boolean)>
	//   58  116:istore          9
			int j1 = core.getUserSessionCountDelta(flag1);
	//   59  118:aload_1         
	//   60  119:iload           5
	//   61  121:invokevirtual   #64  <Method int Core.getUserSessionCountDelta(boolean)>
	//   62  124:istore          10
			int k1 = core.getUserInteractionCount(flag1);
	//   63  126:aload_1         
	//   64  127:iload           5
	//   65  129:invokevirtual   #67  <Method int Core.getUserInteractionCount(boolean)>
	//   66  132:istore          11
			setLabel(new Label("ns_ap_fg", String.valueOf(i), Boolean.valueOf(false)));
	//   67  134:aload_0         
	//   68  135:new             #69  <Class Label>
	//   69  138:dup             
	//   70  139:ldc1            #71  <String "ns_ap_fg">
	//   71  141:iload           7
	//   72  143:invokestatic    #77  <Method String String.valueOf(int)>
	//   73  146:iconst_0        
	//   74  147:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//   75  150:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//   76  153:invokevirtual   #89  <Method void setLabel(Label)>
			setLabel(new Label("ns_ap_ft", String.valueOf(l1), Boolean.valueOf(false)));
	//   77  156:aload_0         
	//   78  157:new             #69  <Class Label>
	//   79  160:dup             
	//   80  161:ldc1            #91  <String "ns_ap_ft">
	//   81  163:lload           12
	//   82  165:invokestatic    #94  <Method String String.valueOf(long)>
	//   83  168:iconst_0        
	//   84  169:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//   85  172:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//   86  175:invokevirtual   #89  <Method void setLabel(Label)>
			setLabel(new Label("ns_ap_dft", String.valueOf(l3), Boolean.valueOf(false)));
	//   87  178:aload_0         
	//   88  179:new             #69  <Class Label>
	//   89  182:dup             
	//   90  183:ldc1            #96  <String "ns_ap_dft">
	//   91  185:lload           14
	//   92  187:invokestatic    #94  <Method String String.valueOf(long)>
	//   93  190:iconst_0        
	//   94  191:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//   95  194:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//   96  197:invokevirtual   #89  <Method void setLabel(Label)>
			setLabel(new Label("ns_ap_bt", String.valueOf(l4), Boolean.valueOf(false)));
	//   97  200:aload_0         
	//   98  201:new             #69  <Class Label>
	//   99  204:dup             
	//  100  205:ldc1            #98  <String "ns_ap_bt">
	//  101  207:lload           16
	//  102  209:invokestatic    #94  <Method String String.valueOf(long)>
	//  103  212:iconst_0        
	//  104  213:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  105  216:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  106  219:invokevirtual   #89  <Method void setLabel(Label)>
			setLabel(new Label("ns_ap_dbt", String.valueOf(l5), Boolean.valueOf(false)));
	//  107  222:aload_0         
	//  108  223:new             #69  <Class Label>
	//  109  226:dup             
	//  110  227:ldc1            #100 <String "ns_ap_dbt">
	//  111  229:lload           18
	//  112  231:invokestatic    #94  <Method String String.valueOf(long)>
	//  113  234:iconst_0        
	//  114  235:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  115  238:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  116  241:invokevirtual   #89  <Method void setLabel(Label)>
			setLabel(new Label("ns_ap_it", String.valueOf(l6), Boolean.valueOf(false)));
	//  117  244:aload_0         
	//  118  245:new             #69  <Class Label>
	//  119  248:dup             
	//  120  249:ldc1            #102 <String "ns_ap_it">
	//  121  251:lload           20
	//  122  253:invokestatic    #94  <Method String String.valueOf(long)>
	//  123  256:iconst_0        
	//  124  257:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  125  260:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  126  263:invokevirtual   #89  <Method void setLabel(Label)>
			setLabel(new Label("ns_ap_dit", String.valueOf(l7), Boolean.valueOf(false)));
	//  127  266:aload_0         
	//  128  267:new             #69  <Class Label>
	//  129  270:dup             
	//  130  271:ldc1            #104 <String "ns_ap_dit">
	//  131  273:lload           22
	//  132  275:invokestatic    #94  <Method String String.valueOf(long)>
	//  133  278:iconst_0        
	//  134  279:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  135  282:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  136  285:invokevirtual   #89  <Method void setLabel(Label)>
			if(l11 >= 60000L)
	//* 137  288:lload           30
	//* 138  290:ldc2w           #105 <Long 60000L>
	//* 139  293:lcmp            
	//* 140  294:iflt            319
				setLabel(new Label("ns_ap_ut", String.valueOf(l11), Boolean.valueOf(false)));
	//  141  297:aload_0         
	//  142  298:new             #69  <Class Label>
	//  143  301:dup             
	//  144  302:ldc1            #108 <String "ns_ap_ut">
	//  145  304:lload           30
	//  146  306:invokestatic    #94  <Method String String.valueOf(long)>
	//  147  309:iconst_0        
	//  148  310:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  149  313:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  150  316:invokevirtual   #89  <Method void setLabel(Label)>
			setLabel(new Label("ns_ap_as", String.valueOf(k), Boolean.valueOf(false)));
	//  151  319:aload_0         
	//  152  320:new             #69  <Class Label>
	//  153  323:dup             
	//  154  324:ldc1            #110 <String "ns_ap_as">
	//  155  326:iload           8
	//  156  328:invokestatic    #77  <Method String String.valueOf(int)>
	//  157  331:iconst_0        
	//  158  332:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  159  335:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  160  338:invokevirtual   #89  <Method void setLabel(Label)>
			setLabel(new Label("ns_ap_das", String.valueOf(l8), Boolean.valueOf(false)));
	//  161  341:aload_0         
	//  162  342:new             #69  <Class Label>
	//  163  345:dup             
	//  164  346:ldc1            #112 <String "ns_ap_das">
	//  165  348:lload           24
	//  166  350:invokestatic    #94  <Method String String.valueOf(long)>
	//  167  353:iconst_0        
	//  168  354:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  169  357:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  170  360:invokevirtual   #89  <Method void setLabel(Label)>
			if(i1 >= 0)
	//* 171  363:iload           9
	//* 172  365:iflt            434
			{
				setLabel(new Label("ns_ap_aus", String.valueOf(i1), Boolean.valueOf(false)));
	//  173  368:aload_0         
	//  174  369:new             #69  <Class Label>
	//  175  372:dup             
	//  176  373:ldc1            #114 <String "ns_ap_aus">
	//  177  375:iload           9
	//  178  377:invokestatic    #77  <Method String String.valueOf(int)>
	//  179  380:iconst_0        
	//  180  381:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  181  384:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  182  387:invokevirtual   #89  <Method void setLabel(Label)>
				setLabel(new Label("ns_ap_daus", String.valueOf(l9), Boolean.valueOf(false)));
	//  183  390:aload_0         
	//  184  391:new             #69  <Class Label>
	//  185  394:dup             
	//  186  395:ldc1            #116 <String "ns_ap_daus">
	//  187  397:lload           26
	//  188  399:invokestatic    #94  <Method String String.valueOf(long)>
	//  189  402:iconst_0        
	//  190  403:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  191  406:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  192  409:invokevirtual   #89  <Method void setLabel(Label)>
				setLabel(new Label("ns_ap_uc", String.valueOf(k1), Boolean.valueOf(false)));
	//  193  412:aload_0         
	//  194  413:new             #69  <Class Label>
	//  195  416:dup             
	//  196  417:ldc1            #118 <String "ns_ap_uc">
	//  197  419:iload           11
	//  198  421:invokestatic    #77  <Method String String.valueOf(int)>
	//  199  424:iconst_0        
	//  200  425:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  201  428:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  202  431:invokevirtual   #89  <Method void setLabel(Label)>
			}
			if(j1 >= 0)
	//* 203  434:iload           10
	//* 204  436:iflt            483
			{
				setLabel(new Label("ns_ap_us", String.valueOf(j1), Boolean.valueOf(false)));
	//  205  439:aload_0         
	//  206  440:new             #69  <Class Label>
	//  207  443:dup             
	//  208  444:ldc1            #120 <String "ns_ap_us">
	//  209  446:iload           10
	//  210  448:invokestatic    #77  <Method String String.valueOf(int)>
	//  211  451:iconst_0        
	//  212  452:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  213  455:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  214  458:invokevirtual   #89  <Method void setLabel(Label)>
				setLabel(new Label("ns_ap_dus", String.valueOf(l10), Boolean.valueOf(false)));
	//  215  461:aload_0         
	//  216  462:new             #69  <Class Label>
	//  217  465:dup             
	//  218  466:ldc1            #122 <String "ns_ap_dus">
	//  219  468:lload           28
	//  220  470:invokestatic    #94  <Method String String.valueOf(long)>
	//  221  473:iconst_0        
	//  222  474:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  223  477:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  224  480:invokevirtual   #89  <Method void setLabel(Label)>
			}
			setLabel(new Label("ns_ap_usage", Long.toString(c - core.getGenesis()), Boolean.valueOf(false)));
	//  225  483:aload_0         
	//  226  484:new             #69  <Class Label>
	//  227  487:dup             
	//  228  488:ldc1            #124 <String "ns_ap_usage">
	//  229  490:aload_0         
	//  230  491:getfield        #128 <Field long c>
	//  231  494:aload_1         
	//  232  495:invokevirtual   #131 <Method long Core.getGenesis()>
	//  233  498:lsub            
	//  234  499:invokestatic    #136 <Method String Long.toString(long)>
	//  235  502:iconst_0        
	//  236  503:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  237  506:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  238  509:invokevirtual   #89  <Method void setLabel(Label)>
		}
	//* 239  512:goto            515
		if(s != null)
	//* 240  515:aload_3         
	//* 241  516:ifnull          524
			setPixelURL(s);
	//  242  519:aload_0         
	//  243  520:aload_3         
	//  244  521:invokevirtual   #140 <Method void setPixelURL(String)>
		setLabel(new Label("c1", "19", Boolean.valueOf(false)));
	//  245  524:aload_0         
	//  246  525:new             #69  <Class Label>
	//  247  528:dup             
	//  248  529:ldc1            #142 <String "c1">
	//  249  531:ldc1            #144 <String "19">
	//  250  533:iconst_0        
	//  251  534:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  252  537:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  253  540:invokevirtual   #89  <Method void setLabel(Label)>
		setLabel(new Label("ns_ap_an", core.getAppName(), Boolean.valueOf(false)));
	//  254  543:aload_0         
	//  255  544:new             #69  <Class Label>
	//  256  547:dup             
	//  257  548:ldc1            #146 <String "ns_ap_an">
	//  258  550:aload_1         
	//  259  551:invokevirtual   #150 <Method String Core.getAppName()>
	//  260  554:iconst_0        
	//  261  555:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  262  558:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  263  561:invokevirtual   #89  <Method void setLabel(Label)>
		setLabel(new Label("ns_ap_pn", "android", Boolean.valueOf(false)));
	//  264  564:aload_0         
	//  265  565:new             #69  <Class Label>
	//  266  568:dup             
	//  267  569:ldc1            #152 <String "ns_ap_pn">
	//  268  571:ldc1            #154 <String "android">
	//  269  573:iconst_0        
	//  270  574:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  271  577:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  272  580:invokevirtual   #89  <Method void setLabel(Label)>
		setLabel(new Label("c12", core.getVisitorId(), Boolean.valueOf(false)));
	//  273  583:aload_0         
	//  274  584:new             #69  <Class Label>
	//  275  587:dup             
	//  276  588:ldc1            #156 <String "c12">
	//  277  590:aload_1         
	//  278  591:invokevirtual   #159 <Method String Core.getVisitorId()>
	//  279  594:iconst_0        
	//  280  595:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  281  598:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  282  601:invokevirtual   #89  <Method void setLabel(Label)>
		if(core.getCrossPublisherId() != null)
	//* 283  604:aload_1         
	//* 284  605:invokevirtual   #162 <Method String Core.getCrossPublisherId()>
	//* 285  608:ifnull          661
		{
			setLabel(new Label("ns_ak", core.getCrossPublisherId(), Boolean.valueOf(false)));
	//  286  611:aload_0         
	//  287  612:new             #69  <Class Label>
	//  288  615:dup             
	//  289  616:ldc1            #164 <String "ns_ak">
	//  290  618:aload_1         
	//  291  619:invokevirtual   #162 <Method String Core.getCrossPublisherId()>
	//  292  622:iconst_0        
	//  293  623:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  294  626:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  295  629:invokevirtual   #89  <Method void setLabel(Label)>
			if(core.getIdHelper().isIdChanged())
	//* 296  632:aload_1         
	//* 297  633:invokevirtual   #168 <Method IdHelper Core.getIdHelper()>
	//* 298  636:invokevirtual   #174 <Method boolean IdHelper.isIdChanged()>
	//* 299  639:ifeq            661
				setLabel(new Label("ns_ap_ni", "1", Boolean.valueOf(false)));
	//  300  642:aload_0         
	//  301  643:new             #69  <Class Label>
	//  302  646:dup             
	//  303  647:ldc1            #176 <String "ns_ap_ni">
	//  304  649:ldc1            #178 <String "1">
	//  305  651:iconst_0        
	//  306  652:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  307  655:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  308  658:invokevirtual   #89  <Method void setLabel(Label)>
		}
		if(core.getIdHelper().getMD5AdvertisingId() != null)
	//* 309  661:aload_1         
	//* 310  662:invokevirtual   #168 <Method IdHelper Core.getIdHelper()>
	//* 311  665:invokevirtual   #181 <Method String IdHelper.getMD5AdvertisingId()>
	//* 312  668:ifnull          684
			setLabel("ns_ap_i3", core.getIdHelper().getMD5AdvertisingId());
	//  313  671:aload_0         
	//  314  672:ldc1            #183 <String "ns_ap_i3">
	//  315  674:aload_1         
	//  316  675:invokevirtual   #168 <Method IdHelper Core.getIdHelper()>
	//  317  678:invokevirtual   #181 <Method String IdHelper.getMD5AdvertisingId()>
	//  318  681:invokevirtual   #186 <Method void setLabel(String, String)>
		setLabel(new Label("ns_ap_device", Build.DEVICE, Boolean.valueOf(false)));
	//  319  684:aload_0         
	//  320  685:new             #69  <Class Label>
	//  321  688:dup             
	//  322  689:ldc1            #188 <String "ns_ap_device">
	//  323  691:getstatic       #194 <Field String Build.DEVICE>
	//  324  694:iconst_0        
	//  325  695:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  326  698:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  327  701:invokevirtual   #89  <Method void setLabel(Label)>
		setLabel(new Label("ns_type", a(eventtype).toString(), Boolean.valueOf(false)));
	//  328  704:aload_0         
	//  329  705:new             #69  <Class Label>
	//  330  708:dup             
	//  331  709:ldc1            #196 <String "ns_type">
	//  332  711:aload_2         
	//  333  712:invokestatic    #200 <Method EventType a(com.comscore.applications.EventType)>
	//  334  715:invokevirtual   #204 <Method String EventType.toString()>
	//  335  718:iconst_0        
	//  336  719:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  337  722:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  338  725:invokevirtual   #89  <Method void setLabel(Label)>
		setLabel(new Label("ns_ts", Long.toString(c), Boolean.valueOf(false)));
	//  339  728:aload_0         
	//  340  729:new             #69  <Class Label>
	//  341  732:dup             
	//  342  733:ldc1            #206 <String "ns_ts">
	//  343  735:aload_0         
	//  344  736:getfield        #128 <Field long c>
	//  345  739:invokestatic    #136 <Method String Long.toString(long)>
	//  346  742:iconst_0        
	//  347  743:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  348  746:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  349  749:invokevirtual   #89  <Method void setLabel(Label)>
		setLabel(new Label("ns_nc", "1", Boolean.valueOf(false)));
	//  350  752:aload_0         
	//  351  753:new             #69  <Class Label>
	//  352  756:dup             
	//  353  757:ldc1            #208 <String "ns_nc">
	//  354  759:ldc1            #178 <String "1">
	//  355  761:iconst_0        
	//  356  762:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  357  765:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  358  768:invokevirtual   #89  <Method void setLabel(Label)>
		setLabel(new Label("ns_ap_pfv", android.os.Build.VERSION.RELEASE, Boolean.valueOf(false)));
	//  359  771:aload_0         
	//  360  772:new             #69  <Class Label>
	//  361  775:dup             
	//  362  776:ldc1            #210 <String "ns_ap_pfv">
	//  363  778:getstatic       #215 <Field String android.os.Build$VERSION.RELEASE>
	//  364  781:iconst_0        
	//  365  782:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  366  785:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  367  788:invokevirtual   #89  <Method void setLabel(Label)>
		setLabel(new Label("ns_ap_pv", android.os.Build.VERSION.RELEASE, Boolean.valueOf(false)));
	//  368  791:aload_0         
	//  369  792:new             #69  <Class Label>
	//  370  795:dup             
	//  371  796:ldc1            #217 <String "ns_ap_pv">
	//  372  798:getstatic       #215 <Field String android.os.Build$VERSION.RELEASE>
	//  373  801:iconst_0        
	//  374  802:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  375  805:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  376  808:invokevirtual   #89  <Method void setLabel(Label)>
		setLabel(new Label("ns_ap_pfm", "android", Boolean.valueOf(false)));
	//  377  811:aload_0         
	//  378  812:new             #69  <Class Label>
	//  379  815:dup             
	//  380  816:ldc1            #219 <String "ns_ap_pfm">
	//  381  818:ldc1            #154 <String "android">
	//  382  820:iconst_0        
	//  383  821:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  384  824:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  385  827:invokevirtual   #89  <Method void setLabel(Label)>
		setLabel(new Label("ns_ap_ar", System.getProperty("os.arch"), Boolean.valueOf(false)));
	//  386  830:aload_0         
	//  387  831:new             #69  <Class Label>
	//  388  834:dup             
	//  389  835:ldc1            #221 <String "ns_ap_ar">
	//  390  837:ldc1            #223 <String "os.arch">
	//  391  839:invokestatic    #229 <Method String System.getProperty(String)>
	//  392  842:iconst_0        
	//  393  843:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  394  846:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  395  849:invokevirtual   #89  <Method void setLabel(Label)>
		setLabel(new Label("ns_ap_ev", eventtype.toString(), Boolean.valueOf(false)));
	//  396  852:aload_0         
	//  397  853:new             #69  <Class Label>
	//  398  856:dup             
	//  399  857:ldc1            #231 <String "ns_ap_ev">
	//  400  859:aload_2         
	//  401  860:invokevirtual   #234 <Method String EventType.toString()>
	//  402  863:iconst_0        
	//  403  864:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  404  867:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  405  870:invokevirtual   #89  <Method void setLabel(Label)>
		s = ((String) (core.getAppContext()));
	//  406  873:aload_1         
	//  407  874:invokevirtual   #238 <Method Context Core.getAppContext()>
	//  408  877:astore_3        
		setLabel(new Label("ns_ap_ver", core.getCurrentVersion(), Boolean.valueOf(false)));
	//  409  878:aload_0         
	//  410  879:new             #69  <Class Label>
	//  411  882:dup             
	//  412  883:ldc1            #240 <String "ns_ap_ver">
	//  413  885:aload_1         
	//  414  886:invokevirtual   #243 <Method String Core.getCurrentVersion()>
	//  415  889:iconst_0        
	//  416  890:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  417  893:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  418  896:invokevirtual   #89  <Method void setLabel(Label)>
		s = ((String) (a(((Context) (s)))));
	//  419  899:aload_0         
	//  420  900:aload_3         
	//  421  901:invokespecial   #246 <Method Point a(Context)>
	//  422  904:astore_3        
		int j = ((Point) (s)).x;
	//  423  905:aload_3         
	//  424  906:getfield        #252 <Field int Point.x>
	//  425  909:istore          7
		int l = ((Point) (s)).y;
	//  426  911:aload_3         
	//  427  912:getfield        #255 <Field int Point.y>
	//  428  915:istore          8
		s = ((String) (new StringBuilder()));
	//  429  917:new             #257 <Class StringBuilder>
	//  430  920:dup             
	//  431  921:invokespecial   #260 <Method void StringBuilder()>
	//  432  924:astore_3        
		((StringBuilder) (s)).append(Integer.toString(j));
	//  433  925:aload_3         
	//  434  926:iload           7
	//  435  928:invokestatic    #264 <Method String Integer.toString(int)>
	//  436  931:invokevirtual   #268 <Method StringBuilder StringBuilder.append(String)>
	//  437  934:pop             
		((StringBuilder) (s)).append("x");
	//  438  935:aload_3         
	//  439  936:ldc2            #269 <String "x">
	//  440  939:invokevirtual   #268 <Method StringBuilder StringBuilder.append(String)>
	//  441  942:pop             
		((StringBuilder) (s)).append(Integer.toString(l));
	//  442  943:aload_3         
	//  443  944:iload           8
	//  444  946:invokestatic    #264 <Method String Integer.toString(int)>
	//  445  949:invokevirtual   #268 <Method StringBuilder StringBuilder.append(String)>
	//  446  952:pop             
		setLabel(new Label("ns_ap_res", ((StringBuilder) (s)).toString(), Boolean.valueOf(false)));
	//  447  953:aload_0         
	//  448  954:new             #69  <Class Label>
	//  449  957:dup             
	//  450  958:ldc2            #271 <String "ns_ap_res">
	//  451  961:aload_3         
	//  452  962:invokevirtual   #272 <Method String StringBuilder.toString()>
	//  453  965:iconst_0        
	//  454  966:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  455  969:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  456  972:invokevirtual   #89  <Method void setLabel(Label)>
		setLabel(new Label("ns_ap_lang", Locale.getDefault().getLanguage(), Boolean.valueOf(false)));
	//  457  975:aload_0         
	//  458  976:new             #69  <Class Label>
	//  459  979:dup             
	//  460  980:ldc2            #274 <String "ns_ap_lang">
	//  461  983:invokestatic    #280 <Method Locale Locale.getDefault()>
	//  462  986:invokevirtual   #283 <Method String Locale.getLanguage()>
	//  463  989:iconst_0        
	//  464  990:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  465  993:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  466  996:invokevirtual   #89  <Method void setLabel(Label)>
		setLabel(new Label("ns_ap_sv", core.getVersion(), Boolean.valueOf(false)));
	//  467  999:aload_0         
	//  468 1000:new             #69  <Class Label>
	//  469 1003:dup             
	//  470 1004:ldc2            #285 <String "ns_ap_sv">
	//  471 1007:aload_1         
	//  472 1008:invokevirtual   #288 <Method String Core.getVersion()>
	//  473 1011:iconst_0        
	//  474 1012:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  475 1015:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  476 1018:invokevirtual   #89  <Method void setLabel(Label)>
		if(eventtype.equals(((Object) (EventType.KEEPALIVE))))
	//* 477 1021:aload_2         
	//* 478 1022:getstatic       #292 <Field com.comscore.applications.EventType EventType.KEEPALIVE>
	//* 479 1025:invokevirtual   #296 <Method boolean EventType.equals(Object)>
	//* 480 1028:ifeq            1048
			setLabel("ns_ap_oc", String.valueOf(core.getOfflineCache().getEventCount()));
	//  481 1031:aload_0         
	//  482 1032:ldc2            #298 <String "ns_ap_oc">
	//  483 1035:aload_1         
	//  484 1036:invokevirtual   #302 <Method OfflineMeasurementsCache Core.getOfflineCache()>
	//  485 1039:invokevirtual   #308 <Method int OfflineMeasurementsCache.getEventCount()>
	//  486 1042:invokestatic    #77  <Method String String.valueOf(int)>
	//  487 1045:invokevirtual   #186 <Method void setLabel(String, String)>
		long l2 = core.getColdStartId();
	//  488 1048:aload_1         
	//  489 1049:invokevirtual   #311 <Method long Core.getColdStartId()>
	//  490 1052:lstore          12
		j = core.getColdStartCount();
	//  491 1054:aload_1         
	//  492 1055:invokevirtual   #314 <Method int Core.getColdStartCount()>
	//  493 1058:istore          7
		setLabel(new Label("ns_ap_id", String.valueOf(l2), Boolean.valueOf(false)));
	//  494 1060:aload_0         
	//  495 1061:new             #69  <Class Label>
	//  496 1064:dup             
	//  497 1065:ldc2            #316 <String "ns_ap_id">
	//  498 1068:lload           12
	//  499 1070:invokestatic    #94  <Method String String.valueOf(long)>
	//  500 1073:iconst_0        
	//  501 1074:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  502 1077:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  503 1080:invokevirtual   #89  <Method void setLabel(Label)>
		setLabel(new Label("ns_ap_cs", String.valueOf(j), Boolean.valueOf(false)));
	//  504 1083:aload_0         
	//  505 1084:new             #69  <Class Label>
	//  506 1087:dup             
	//  507 1088:ldc2            #318 <String "ns_ap_cs">
	//  508 1091:iload           7
	//  509 1093:invokestatic    #77  <Method String String.valueOf(int)>
	//  510 1096:iconst_0        
	//  511 1097:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  512 1100:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  513 1103:invokevirtual   #89  <Method void setLabel(Label)>
		setLabel(new Label("ns_ap_bi", core.getAppContext().getPackageName(), Boolean.valueOf(false)));
	//  514 1106:aload_0         
	//  515 1107:new             #69  <Class Label>
	//  516 1110:dup             
	//  517 1111:ldc2            #320 <String "ns_ap_bi">
	//  518 1114:aload_1         
	//  519 1115:invokevirtual   #238 <Method Context Core.getAppContext()>
	//  520 1118:invokevirtual   #325 <Method String Context.getPackageName()>
	//  521 1121:iconst_0        
	//  522 1122:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//  523 1125:invokespecial   #85  <Method void Label(String, String, Boolean)>
	//  524 1128:invokevirtual   #89  <Method void setLabel(Label)>
	//  525 1131:return          
	}

	private Point a(Context context)
	{
		Point point = new Point();
	//    0    0:new             #248 <Class Point>
	//    1    3:dup             
	//    2    4:invokespecial   #329 <Method void Point()>
	//    3    7:astore_2        
		context = ((Context) (((WindowManager)context.getSystemService("window")).getDefaultDisplay()));
	//    4    8:aload_1         
	//    5    9:ldc2            #331 <String "window">
	//    6   12:invokevirtual   #335 <Method Object Context.getSystemService(String)>
	//    7   15:checkcast       #337 <Class WindowManager>
	//    8   18:invokeinterface #341 <Method Display WindowManager.getDefaultDisplay()>
	//    9   23:astore_1        
		if(android.os.Build.VERSION.SDK_INT >= 13)
	//*  10   24:getstatic       #344 <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   27:bipush          13
	//*  12   29:icmplt          37
		{
			return API13.getDisplaySize(((Display) (context)));
	//   13   32:aload_1         
	//   14   33:invokestatic    #350 <Method Point API13.getDisplaySize(Display)>
	//   15   36:areturn         
		} else
		{
			point.x = ((Display) (context)).getWidth();
	//   16   37:aload_2         
	//   17   38:aload_1         
	//   18   39:invokevirtual   #355 <Method int Display.getWidth()>
	//   19   42:putfield        #252 <Field int Point.x>
			point.y = ((Display) (context)).getHeight();
	//   20   45:aload_2         
	//   21   46:aload_1         
	//   22   47:invokevirtual   #358 <Method int Display.getHeight()>
	//   23   50:putfield        #255 <Field int Point.y>
			return point;
	//   24   53:aload_2         
	//   25   54:areturn         
		}
	}

	private static EventType a(com.comscore.applications.EventType eventtype)
	{
		if(eventtype != EventType.START && eventtype != EventType.CLOSE && eventtype != EventType.VIEW)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #362 <Field com.comscore.applications.EventType EventType.START>
	//*   2    4:if_acmpeq       28
	//*   3    7:aload_0         
	//*   4    8:getstatic       #365 <Field com.comscore.applications.EventType EventType.CLOSE>
	//*   5   11:if_acmpeq       28
	//*   6   14:aload_0         
	//*   7   15:getstatic       #368 <Field com.comscore.applications.EventType EventType.VIEW>
	//*   8   18:if_acmpne       24
	//*   9   21:goto            28
			return EventType.HIDDEN;
	//   10   24:getstatic       #372 <Field EventType EventType.HIDDEN>
	//   11   27:areturn         
		else
			return EventType.VIEW;
	//   12   28:getstatic       #374 <Field EventType EventType.VIEW>
	//   13   31:areturn         
	}

	public static ApplicationMeasurement newApplicationMeasurement(Core core, com.comscore.applications.EventType eventtype, HashMap hashmap, String s)
	{
		com.comscore.applications.EventType eventtype1 = EventType.START;
	//    0    0:getstatic       #362 <Field com.comscore.applications.EventType EventType.START>
	//    1    3:astore          7
		boolean flag3 = true;
	//    2    5:iconst_1        
	//    3    6:istore          6
		if(eventtype == eventtype1)
	//*   4    8:aload_1         
	//*   5    9:aload           7
	//*   6   11:if_acmpne       36
		{
			core.incrementRunsCount();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #379 <Method void Core.incrementRunsCount()>
			s = ((String) (new AppStartMeasurement(core, eventtype, s, core.handleColdStart())));
	//    9   18:new             #381 <Class AppStartMeasurement>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:aload_3         
	//   14   25:aload_0         
	//   15   26:invokevirtual   #384 <Method boolean Core.handleColdStart()>
	//   16   29:invokespecial   #387 <Method void AppStartMeasurement(Core, com.comscore.applications.EventType, String, boolean)>
	//   17   32:astore_3        
		} else
	//*  18   33:goto            140
		if(eventtype == EventType.AGGREGATE)
	//*  19   36:aload_1         
	//*  20   37:getstatic       #390 <Field com.comscore.applications.EventType EventType.AGGREGATE>
	//*  21   40:if_acmpne       57
			s = ((String) (new AggregateMeasurement(core, eventtype, s)));
	//   22   43:new             #392 <Class AggregateMeasurement>
	//   23   46:dup             
	//   24   47:aload_0         
	//   25   48:aload_1         
	//   26   49:aload_3         
	//   27   50:invokespecial   #394 <Method void AggregateMeasurement(Core, com.comscore.applications.EventType, String)>
	//   28   53:astore_3        
		else
	//*  29   54:goto            140
		if(eventtype != EventType.CLOSE)
	//*  30   57:aload_1         
	//*  31   58:getstatic       #365 <Field com.comscore.applications.EventType EventType.CLOSE>
	//*  32   61:if_acmpeq       138
		{
			boolean flag;
			if(hashmap != null && hashmap.get("ns_st_ev") == "hb")
	//*  33   64:aload_2         
	//*  34   65:ifnull          90
	//*  35   68:aload_2         
	//*  36   69:ldc2            #396 <String "ns_st_ev">
	//*  37   72:invokevirtual   #402 <Method Object HashMap.get(Object)>
	//*  38   75:ldc2            #404 <String "hb">
	//*  39   78:if_acmpeq       84
	//*  40   81:goto            90
				flag = false;
	//   41   84:iconst_0        
	//   42   85:istore          4
			else
	//*  43   87:goto            93
				flag = true;
	//   44   90:iconst_1        
	//   45   91:istore          4
			boolean flag2;
			if(hashmap != null && hashmap.containsKey("ns_st_ev"))
	//*  46   93:aload_2         
	//*  47   94:ifnull          116
	//*  48   97:aload_2         
	//*  49   98:ldc2            #396 <String "ns_st_ev">
	//*  50  101:invokevirtual   #407 <Method boolean HashMap.containsKey(Object)>
	//*  51  104:ifne            110
	//*  52  107:goto            116
				flag2 = false;
	//   53  110:iconst_0        
	//   54  111:istore          5
			else
	//*  55  113:goto            119
				flag2 = true;
	//   56  116:iconst_1        
	//   57  117:istore          5
			s = ((String) (new ApplicationMeasurement(core, eventtype, s, false, flag, flag2)));
	//   58  119:new             #2   <Class ApplicationMeasurement>
	//   59  122:dup             
	//   60  123:aload_0         
	//   61  124:aload_1         
	//   62  125:aload_3         
	//   63  126:iconst_0        
	//   64  127:iload           4
	//   65  129:iload           5
	//   66  131:invokespecial   #9   <Method void ApplicationMeasurement(Core, com.comscore.applications.EventType, String, boolean, boolean, boolean)>
	//   67  134:astore_3        
		} else
	//*  68  135:goto            140
		{
			s = null;
	//   69  138:aconst_null     
	//   70  139:astore_3        
		}
		if(eventtype != EventType.AGGREGATE)
	//*  71  140:aload_1         
	//*  72  141:getstatic       #390 <Field com.comscore.applications.EventType EventType.AGGREGATE>
	//*  73  144:if_acmpeq       155
			((ApplicationMeasurement) (s)).a(core.getLabels());
	//   74  147:aload_3         
	//   75  148:aload_0         
	//   76  149:invokevirtual   #411 <Method HashMap Core.getLabels()>
	//   77  152:invokevirtual   #414 <Method void a(HashMap)>
		boolean flag1;
		if(eventtype == EventType.AGGREGATE)
	//*  78  155:aload_1         
	//*  79  156:getstatic       #390 <Field com.comscore.applications.EventType EventType.AGGREGATE>
	//*  80  159:if_acmpne       169
			flag1 = flag3;
	//   81  162:iload           6
	//   82  164:istore          4
		else
	//*  83  166:goto            172
			flag1 = false;
	//   84  169:iconst_0        
	//   85  170:istore          4
		((ApplicationMeasurement) (s)).a(hashmap, flag1);
	//   86  172:aload_3         
	//   87  173:aload_2         
	//   88  174:iload           4
	//   89  176:invokevirtual   #417 <Method void a(HashMap, boolean)>
		if(!((ApplicationMeasurement) (s)).hasLabel("name").booleanValue())
	//*  90  179:aload_3         
	//*  91  180:ldc2            #419 <String "name">
	//*  92  183:invokevirtual   #423 <Method Boolean hasLabel(String)>
	//*  93  186:invokevirtual   #426 <Method boolean Boolean.booleanValue()>
	//*  94  189:ifne            257
		{
			if(core.getCurrentActivityName() != null)
	//*  95  192:aload_0         
	//*  96  193:invokevirtual   #429 <Method String Core.getCurrentActivityName()>
	//*  97  196:ifnull          212
			{
				((ApplicationMeasurement) (s)).setLabel("name", core.getCurrentActivityName());
	//   98  199:aload_3         
	//   99  200:ldc2            #419 <String "name">
	//  100  203:aload_0         
	//  101  204:invokevirtual   #429 <Method String Core.getCurrentActivityName()>
	//  102  207:invokevirtual   #186 <Method void setLabel(String, String)>
				return ((ApplicationMeasurement) (s));
	//  103  210:aload_3         
	//  104  211:areturn         
			}
			if(eventtype == EventType.START)
	//* 105  212:aload_1         
	//* 106  213:getstatic       #362 <Field com.comscore.applications.EventType EventType.START>
	//* 107  216:if_acmpne       233
				core = "start";
	//  108  219:ldc2            #431 <String "start">
	//  109  222:astore_0        
			else
	//* 110  223:aload_3         
	//* 111  224:ldc2            #419 <String "name">
	//* 112  227:aload_0         
	//* 113  228:invokevirtual   #186 <Method void setLabel(String, String)>
	//* 114  231:aload_3         
	//* 115  232:areturn         
			if(core.getApplicationState() == ApplicationState.FOREGROUND)
	//* 116  233:aload_0         
	//* 117  234:invokevirtual   #435 <Method ApplicationState Core.getApplicationState()>
	//* 118  237:getstatic       #441 <Field ApplicationState ApplicationState.FOREGROUND>
	//* 119  240:if_acmpne       250
				core = "foreground";
	//  120  243:ldc2            #443 <String "foreground">
	//  121  246:astore_0        
			else
	//* 122  247:goto            223
				core = "background";
	//  123  250:ldc2            #445 <String "background">
	//  124  253:astore_0        
			((ApplicationMeasurement) (s)).setLabel("name", ((String) (core)));
			return ((ApplicationMeasurement) (s));
		} else
	//* 125  254:goto            223
		{
			return ((ApplicationMeasurement) (s));
	//  126  257:aload_3         
	//  127  258:areturn         
		}
	}
}
