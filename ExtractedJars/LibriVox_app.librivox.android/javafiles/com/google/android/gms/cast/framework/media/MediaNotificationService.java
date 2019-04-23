// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast.framework.media;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.app.cj;
import android.support.v4.app.cl;
import android.support.v4.media.a.b;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.a;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.util.o;
import com.google.android.gms.internal.cast.aj;
import com.google.android.gms.internal.cast.at;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.cast.framework.media:
//			am, NotificationOptions, d, e, 
//			ai, g, NotificationAction, f, 
//			CastMediaOptions, ImageHints, an, b, 
//			ao

public class MediaNotificationService extends Service
{

	public MediaNotificationService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Service()>
		f = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #56  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #57  <Method void ArrayList()>
	//    6   12:putfield        #59  <Field List f>
	//    7   15:aload_0         
	//    8   16:new             #61  <Class am>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #64  <Method void am(MediaNotificationService)>
	//   12   24:putfield        #66  <Field BroadcastReceiver r>
	//   13   27:return          
	}

	static c a(MediaNotificationService medianotificationservice)
	{
		return medianotificationservice.q;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field c q>
	//    2    4:areturn         
	}

	static e a(MediaNotificationService medianotificationservice, e e1)
	{
		medianotificationservice.o = e1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field e o>
		return e1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static at a()
	{
		return a;
	//    0    0:getstatic       #51  <Field at a>
	//    1    3:areturn         
	}

	private final void a(cl cl1, String s)
	{
		int i1;
label0:
		{
			switch(s.hashCode())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #80  <Method int String.hashCode()>
			{
			default:
				break;

	//*   2    4:lookupswitch    7: default 72
	//	               -1699820260: 160
	//	               -945151566: 146
	//	               -945080078: 132
	//	               -668151673: 118
	//	               -124479363: 103
	//	               235550565: 89
	//	               1362116196: 75
	//*   3   72:goto            174
			case 1362116196: 
				if(s.equals("com.google.android.gms.cast.framework.action.FORWARD"))
	//*   4   75:aload_2         
	//*   5   76:ldc1            #82  <String "com.google.android.gms.cast.framework.action.FORWARD">
	//*   6   78:invokevirtual   #86  <Method boolean String.equals(Object)>
	//*   7   81:ifeq            174
				{
					i1 = 3;
	//    8   84:iconst_3        
	//    9   85:istore_3        
					break label0;
	//   10   86:goto            176
				}
				break;

			case 235550565: 
				if(!s.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"))
					break;
	//   11   89:aload_2         
	//   12   90:ldc1            #88  <String "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK">
	//   13   92:invokevirtual   #86  <Method boolean String.equals(Object)>
	//   14   95:ifeq            174
				i1 = 0;
	//   15   98:iconst_0        
	//   16   99:istore_3        
				break label0;
	//   17  100:goto            176

			case -124479363: 
				if(!s.equals("com.google.android.gms.cast.framework.action.DISCONNECT"))
					break;
	//   18  103:aload_2         
	//   19  104:ldc1            #90  <String "com.google.android.gms.cast.framework.action.DISCONNECT">
	//   20  106:invokevirtual   #86  <Method boolean String.equals(Object)>
	//   21  109:ifeq            174
				i1 = 6;
	//   22  112:bipush          6
	//   23  114:istore_3        
				break label0;
	//   24  115:goto            176

			case -668151673: 
				if(!s.equals("com.google.android.gms.cast.framework.action.STOP_CASTING"))
					break;
	//   25  118:aload_2         
	//   26  119:ldc1            #92  <String "com.google.android.gms.cast.framework.action.STOP_CASTING">
	//   27  121:invokevirtual   #86  <Method boolean String.equals(Object)>
	//   28  124:ifeq            174
				i1 = 5;
	//   29  127:iconst_5        
	//   30  128:istore_3        
				break label0;
	//   31  129:goto            176

			case -945080078: 
				if(!s.equals("com.google.android.gms.cast.framework.action.SKIP_PREV"))
					break;
	//   32  132:aload_2         
	//   33  133:ldc1            #94  <String "com.google.android.gms.cast.framework.action.SKIP_PREV">
	//   34  135:invokevirtual   #86  <Method boolean String.equals(Object)>
	//   35  138:ifeq            174
				i1 = 2;
	//   36  141:iconst_2        
	//   37  142:istore_3        
				break label0;
	//   38  143:goto            176

			case -945151566: 
				if(!s.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT"))
					break;
	//   39  146:aload_2         
	//   40  147:ldc1            #96  <String "com.google.android.gms.cast.framework.action.SKIP_NEXT">
	//   41  149:invokevirtual   #86  <Method boolean String.equals(Object)>
	//   42  152:ifeq            174
				i1 = 1;
	//   43  155:iconst_1        
	//   44  156:istore_3        
				break label0;
	//   45  157:goto            176

			case -1699820260: 
				if(!s.equals("com.google.android.gms.cast.framework.action.REWIND"))
					break;
	//   46  160:aload_2         
	//   47  161:ldc1            #98  <String "com.google.android.gms.cast.framework.action.REWIND">
	//   48  163:invokevirtual   #86  <Method boolean String.equals(Object)>
	//   49  166:ifeq            174
				i1 = 4;
	//   50  169:iconst_4        
	//   51  170:istore_3        
				break label0;
	//   52  171:goto            176
			}
			i1 = -1;
	//   53  174:iconst_m1       
	//   54  175:istore_3        
		}
		Object obj1 = null;
	//   55  176:aconst_null     
	//   56  177:astore          9
		Object obj = null;
	//   57  179:aconst_null     
	//   58  180:astore          8
		boolean flag;
		switch(i1)
	//*  59  182:iload_3         
		{
	//*  60  183:tableswitch     0 6: default 224
	//	               0 746
	//	               1 668
	//	               2 590
	//	               3 448
	//	               4 306
	//	               5 241
	//	               6 241
		default:
			a.d("Action: %s is not a pre-defined action.", new Object[] {
				s
			});
	//   61  224:getstatic       #51  <Field at a>
	//   62  227:ldc1            #100 <String "Action: %s is not a pre-defined action.">
	//   63  229:iconst_1        
	//   64  230:anewarray       Object[]
	//   65  233:dup             
	//   66  234:iconst_0        
	//   67  235:aload_2         
	//   68  236:aastore         
	//   69  237:invokevirtual   #105 <Method void at.d(String, Object[])>
			return;
	//   70  240:return          

		case 5: // '\005'
		case 6: // '\006'
			s = ((String) (new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING")));
	//   71  241:new             #107 <Class Intent>
	//   72  244:dup             
	//   73  245:ldc1            #92  <String "com.google.android.gms.cast.framework.action.STOP_CASTING">
	//   74  247:invokespecial   #108 <Method void Intent(String)>
	//   75  250:astore_2        
			((Intent) (s)).setComponent(d);
	//   76  251:aload_2         
	//   77  252:aload_0         
	//   78  253:getfield        #110 <Field ComponentName d>
	//   79  256:invokevirtual   #114 <Method Intent Intent.setComponent(ComponentName)>
	//   80  259:pop             
			s = ((String) (PendingIntent.getBroadcast(((android.content.Context) (this)), 0, ((Intent) (s)), 0)));
	//   81  260:aload_0         
	//   82  261:iconst_0        
	//   83  262:aload_2         
	//   84  263:iconst_0        
	//   85  264:invokestatic    #120 <Method PendingIntent PendingIntent.getBroadcast(android.content.Context, int, Intent, int)>
	//   86  267:astore_2        
			cl1.a((new cj(b.q(), ((CharSequence) (l.getString(b.E()))), ((PendingIntent) (s)))).a());
	//   87  268:aload_1         
	//   88  269:new             #122 <Class cj>
	//   89  272:dup             
	//   90  273:aload_0         
	//   91  274:getfield        #124 <Field NotificationOptions b>
	//   92  277:invokevirtual   #128 <Method int NotificationOptions.q()>
	//   93  280:aload_0         
	//   94  281:getfield        #130 <Field Resources l>
	//   95  284:aload_0         
	//   96  285:getfield        #124 <Field NotificationOptions b>
	//   97  288:invokevirtual   #133 <Method int NotificationOptions.E()>
	//   98  291:invokevirtual   #139 <Method String Resources.getString(int)>
	//   99  294:aload_2         
	//  100  295:invokespecial   #142 <Method void cj(int, CharSequence, PendingIntent)>
	//  101  298:invokevirtual   #145 <Method android.support.v4.app.ci cj.a()>
	//  102  301:invokevirtual   #150 <Method cl cl.a(android.support.v4.app.ci)>
	//  103  304:pop             
			return;
	//  104  305:return          

		case 4: // '\004'
			long l2 = i;
	//  105  306:aload_0         
	//  106  307:getfield        #152 <Field long i>
	//  107  310:lstore          5
			s = ((String) (new Intent("com.google.android.gms.cast.framework.action.REWIND")));
	//  108  312:new             #107 <Class Intent>
	//  109  315:dup             
	//  110  316:ldc1            #98  <String "com.google.android.gms.cast.framework.action.REWIND">
	//  111  318:invokespecial   #108 <Method void Intent(String)>
	//  112  321:astore_2        
			((Intent) (s)).setComponent(d);
	//  113  322:aload_2         
	//  114  323:aload_0         
	//  115  324:getfield        #110 <Field ComponentName d>
	//  116  327:invokevirtual   #114 <Method Intent Intent.setComponent(ComponentName)>
	//  117  330:pop             
			((Intent) (s)).putExtra("googlecast-extra_skip_step_ms", l2);
	//  118  331:aload_2         
	//  119  332:ldc1            #154 <String "googlecast-extra_skip_step_ms">
	//  120  334:lload           5
	//  121  336:invokevirtual   #158 <Method Intent Intent.putExtra(String, long)>
	//  122  339:pop             
			s = ((String) (PendingIntent.getBroadcast(((android.content.Context) (this)), 0, ((Intent) (s)), 0x8000000)));
	//  123  340:aload_0         
	//  124  341:iconst_0        
	//  125  342:aload_2         
	//  126  343:ldc1            #159 <Int 0x8000000>
	//  127  345:invokestatic    #120 <Method PendingIntent PendingIntent.getBroadcast(android.content.Context, int, Intent, int)>
	//  128  348:astore_2        
			i1 = b.n();
	//  129  349:aload_0         
	//  130  350:getfield        #124 <Field NotificationOptions b>
	//  131  353:invokevirtual   #161 <Method int NotificationOptions.n()>
	//  132  356:istore_3        
			int j1 = b.B();
	//  133  357:aload_0         
	//  134  358:getfield        #124 <Field NotificationOptions b>
	//  135  361:invokevirtual   #164 <Method int NotificationOptions.B()>
	//  136  364:istore          4
			if(l2 == 10000L)
	//* 137  366:lload           5
	//* 138  368:ldc2w           #165 <Long 10000L>
	//* 139  371:lcmp            
	//* 140  372:ifne            395
			{
				i1 = b.o();
	//  141  375:aload_0         
	//  142  376:getfield        #124 <Field NotificationOptions b>
	//  143  379:invokevirtual   #168 <Method int com.google.android.gms.cast.framework.media.NotificationOptions.o()>
	//  144  382:istore_3        
				j1 = b.C();
	//  145  383:aload_0         
	//  146  384:getfield        #124 <Field NotificationOptions b>
	//  147  387:invokevirtual   #171 <Method int NotificationOptions.C()>
	//  148  390:istore          4
			} else
	//* 149  392:goto            421
			if(l2 == 30000L)
	//* 150  395:lload           5
	//* 151  397:ldc2w           #172 <Long 30000L>
	//* 152  400:lcmp            
	//* 153  401:ifne            421
			{
				i1 = b.p();
	//  154  404:aload_0         
	//  155  405:getfield        #124 <Field NotificationOptions b>
	//  156  408:invokevirtual   #175 <Method int NotificationOptions.p()>
	//  157  411:istore_3        
				j1 = b.D();
	//  158  412:aload_0         
	//  159  413:getfield        #124 <Field NotificationOptions b>
	//  160  416:invokevirtual   #178 <Method int NotificationOptions.D()>
	//  161  419:istore          4
			}
			cl1.a((new cj(i1, ((CharSequence) (l.getString(j1))), ((PendingIntent) (s)))).a());
	//  162  421:aload_1         
	//  163  422:new             #122 <Class cj>
	//  164  425:dup             
	//  165  426:iload_3         
	//  166  427:aload_0         
	//  167  428:getfield        #130 <Field Resources l>
	//  168  431:iload           4
	//  169  433:invokevirtual   #139 <Method String Resources.getString(int)>
	//  170  436:aload_2         
	//  171  437:invokespecial   #142 <Method void cj(int, CharSequence, PendingIntent)>
	//  172  440:invokevirtual   #145 <Method android.support.v4.app.ci cj.a()>
	//  173  443:invokevirtual   #150 <Method cl cl.a(android.support.v4.app.ci)>
	//  174  446:pop             
			return;
	//  175  447:return          

		case 3: // '\003'
			long l3 = i;
	//  176  448:aload_0         
	//  177  449:getfield        #152 <Field long i>
	//  178  452:lstore          5
			s = ((String) (new Intent("com.google.android.gms.cast.framework.action.FORWARD")));
	//  179  454:new             #107 <Class Intent>
	//  180  457:dup             
	//  181  458:ldc1            #82  <String "com.google.android.gms.cast.framework.action.FORWARD">
	//  182  460:invokespecial   #108 <Method void Intent(String)>
	//  183  463:astore_2        
			((Intent) (s)).setComponent(d);
	//  184  464:aload_2         
	//  185  465:aload_0         
	//  186  466:getfield        #110 <Field ComponentName d>
	//  187  469:invokevirtual   #114 <Method Intent Intent.setComponent(ComponentName)>
	//  188  472:pop             
			((Intent) (s)).putExtra("googlecast-extra_skip_step_ms", l3);
	//  189  473:aload_2         
	//  190  474:ldc1            #154 <String "googlecast-extra_skip_step_ms">
	//  191  476:lload           5
	//  192  478:invokevirtual   #158 <Method Intent Intent.putExtra(String, long)>
	//  193  481:pop             
			s = ((String) (PendingIntent.getBroadcast(((android.content.Context) (this)), 0, ((Intent) (s)), 0x8000000)));
	//  194  482:aload_0         
	//  195  483:iconst_0        
	//  196  484:aload_2         
	//  197  485:ldc1            #159 <Int 0x8000000>
	//  198  487:invokestatic    #120 <Method PendingIntent PendingIntent.getBroadcast(android.content.Context, int, Intent, int)>
	//  199  490:astore_2        
			i1 = b.k();
	//  200  491:aload_0         
	//  201  492:getfield        #124 <Field NotificationOptions b>
	//  202  495:invokevirtual   #180 <Method int NotificationOptions.k()>
	//  203  498:istore_3        
			int k1 = b.y();
	//  204  499:aload_0         
	//  205  500:getfield        #124 <Field NotificationOptions b>
	//  206  503:invokevirtual   #183 <Method int NotificationOptions.y()>
	//  207  506:istore          4
			if(l3 == 10000L)
	//* 208  508:lload           5
	//* 209  510:ldc2w           #165 <Long 10000L>
	//* 210  513:lcmp            
	//* 211  514:ifne            537
			{
				i1 = b.l();
	//  212  517:aload_0         
	//  213  518:getfield        #124 <Field NotificationOptions b>
	//  214  521:invokevirtual   #185 <Method int NotificationOptions.l()>
	//  215  524:istore_3        
				k1 = b.z();
	//  216  525:aload_0         
	//  217  526:getfield        #124 <Field NotificationOptions b>
	//  218  529:invokevirtual   #188 <Method int NotificationOptions.z()>
	//  219  532:istore          4
			} else
	//* 220  534:goto            563
			if(l3 == 30000L)
	//* 221  537:lload           5
	//* 222  539:ldc2w           #172 <Long 30000L>
	//* 223  542:lcmp            
	//* 224  543:ifne            563
			{
				i1 = b.m();
	//  225  546:aload_0         
	//  226  547:getfield        #124 <Field NotificationOptions b>
	//  227  550:invokevirtual   #190 <Method int NotificationOptions.m()>
	//  228  553:istore_3        
				k1 = b.A();
	//  229  554:aload_0         
	//  230  555:getfield        #124 <Field NotificationOptions b>
	//  231  558:invokevirtual   #193 <Method int NotificationOptions.A()>
	//  232  561:istore          4
			}
			cl1.a((new cj(i1, ((CharSequence) (l.getString(k1))), ((PendingIntent) (s)))).a());
	//  233  563:aload_1         
	//  234  564:new             #122 <Class cj>
	//  235  567:dup             
	//  236  568:iload_3         
	//  237  569:aload_0         
	//  238  570:getfield        #130 <Field Resources l>
	//  239  573:iload           4
	//  240  575:invokevirtual   #139 <Method String Resources.getString(int)>
	//  241  578:aload_2         
	//  242  579:invokespecial   #142 <Method void cj(int, CharSequence, PendingIntent)>
	//  243  582:invokevirtual   #145 <Method android.support.v4.app.ci cj.a()>
	//  244  585:invokevirtual   #150 <Method cl cl.a(android.support.v4.app.ci)>
	//  245  588:pop             
			return;
	//  246  589:return          

		case 2: // '\002'
			s = ((String) (obj));
	//  247  590:aload           8
	//  248  592:astore_2        
			if(n.g)
	//* 249  593:aload_0         
	//* 250  594:getfield        #195 <Field d n>
	//* 251  597:getfield        #200 <Field boolean d.g>
	//* 252  600:ifeq            630
			{
				s = ((String) (new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV")));
	//  253  603:new             #107 <Class Intent>
	//  254  606:dup             
	//  255  607:ldc1            #94  <String "com.google.android.gms.cast.framework.action.SKIP_PREV">
	//  256  609:invokespecial   #108 <Method void Intent(String)>
	//  257  612:astore_2        
				((Intent) (s)).setComponent(d);
	//  258  613:aload_2         
	//  259  614:aload_0         
	//  260  615:getfield        #110 <Field ComponentName d>
	//  261  618:invokevirtual   #114 <Method Intent Intent.setComponent(ComponentName)>
	//  262  621:pop             
				s = ((String) (PendingIntent.getBroadcast(((android.content.Context) (this)), 0, ((Intent) (s)), 0)));
	//  263  622:aload_0         
	//  264  623:iconst_0        
	//  265  624:aload_2         
	//  266  625:iconst_0        
	//  267  626:invokestatic    #120 <Method PendingIntent PendingIntent.getBroadcast(android.content.Context, int, Intent, int)>
	//  268  629:astore_2        
			}
			cl1.a((new cj(b.j(), ((CharSequence) (l.getString(b.x()))), ((PendingIntent) (s)))).a());
	//  269  630:aload_1         
	//  270  631:new             #122 <Class cj>
	//  271  634:dup             
	//  272  635:aload_0         
	//  273  636:getfield        #124 <Field NotificationOptions b>
	//  274  639:invokevirtual   #202 <Method int NotificationOptions.j()>
	//  275  642:aload_0         
	//  276  643:getfield        #130 <Field Resources l>
	//  277  646:aload_0         
	//  278  647:getfield        #124 <Field NotificationOptions b>
	//  279  650:invokevirtual   #205 <Method int NotificationOptions.x()>
	//  280  653:invokevirtual   #139 <Method String Resources.getString(int)>
	//  281  656:aload_2         
	//  282  657:invokespecial   #142 <Method void cj(int, CharSequence, PendingIntent)>
	//  283  660:invokevirtual   #145 <Method android.support.v4.app.ci cj.a()>
	//  284  663:invokevirtual   #150 <Method cl cl.a(android.support.v4.app.ci)>
	//  285  666:pop             
			return;
	//  286  667:return          

		case 1: // '\001'
			s = ((String) (obj1));
	//  287  668:aload           9
	//  288  670:astore_2        
			if(n.f)
	//* 289  671:aload_0         
	//* 290  672:getfield        #195 <Field d n>
	//* 291  675:getfield        #207 <Field boolean d.f>
	//* 292  678:ifeq            708
			{
				s = ((String) (new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT")));
	//  293  681:new             #107 <Class Intent>
	//  294  684:dup             
	//  295  685:ldc1            #96  <String "com.google.android.gms.cast.framework.action.SKIP_NEXT">
	//  296  687:invokespecial   #108 <Method void Intent(String)>
	//  297  690:astore_2        
				((Intent) (s)).setComponent(d);
	//  298  691:aload_2         
	//  299  692:aload_0         
	//  300  693:getfield        #110 <Field ComponentName d>
	//  301  696:invokevirtual   #114 <Method Intent Intent.setComponent(ComponentName)>
	//  302  699:pop             
				s = ((String) (PendingIntent.getBroadcast(((android.content.Context) (this)), 0, ((Intent) (s)), 0)));
	//  303  700:aload_0         
	//  304  701:iconst_0        
	//  305  702:aload_2         
	//  306  703:iconst_0        
	//  307  704:invokestatic    #120 <Method PendingIntent PendingIntent.getBroadcast(android.content.Context, int, Intent, int)>
	//  308  707:astore_2        
			}
			cl1.a((new cj(b.i(), ((CharSequence) (l.getString(b.w()))), ((PendingIntent) (s)))).a());
	//  309  708:aload_1         
	//  310  709:new             #122 <Class cj>
	//  311  712:dup             
	//  312  713:aload_0         
	//  313  714:getfield        #124 <Field NotificationOptions b>
	//  314  717:invokevirtual   #209 <Method int NotificationOptions.i()>
	//  315  720:aload_0         
	//  316  721:getfield        #130 <Field Resources l>
	//  317  724:aload_0         
	//  318  725:getfield        #124 <Field NotificationOptions b>
	//  319  728:invokevirtual   #212 <Method int NotificationOptions.w()>
	//  320  731:invokevirtual   #139 <Method String Resources.getString(int)>
	//  321  734:aload_2         
	//  322  735:invokespecial   #142 <Method void cj(int, CharSequence, PendingIntent)>
	//  323  738:invokevirtual   #145 <Method android.support.v4.app.ci cj.a()>
	//  324  741:invokevirtual   #150 <Method cl cl.a(android.support.v4.app.ci)>
	//  325  744:pop             
			return;
	//  326  745:return          

		case 0: // '\0'
			i1 = n.c;
	//  327  746:aload_0         
	//  328  747:getfield        #195 <Field d n>
	//  329  750:getfield        #215 <Field int com.google.android.gms.cast.framework.media.d.c>
	//  330  753:istore_3        
			flag = n.b;
	//  331  754:aload_0         
	//  332  755:getfield        #195 <Field d n>
	//  333  758:getfield        #217 <Field boolean com.google.android.gms.cast.framework.media.d.b>
	//  334  761:istore          7
			break;
		}
		int l1;
		if(i1 == 2)
	//* 335  763:iload_3         
	//* 336  764:iconst_2        
	//* 337  765:icmpne          788
		{
			l1 = b.f();
	//  338  768:aload_0         
	//  339  769:getfield        #124 <Field NotificationOptions b>
	//  340  772:invokevirtual   #219 <Method int NotificationOptions.f()>
	//  341  775:istore          4
			i1 = b.t();
	//  342  777:aload_0         
	//  343  778:getfield        #124 <Field NotificationOptions b>
	//  344  781:invokevirtual   #222 <Method int NotificationOptions.t()>
	//  345  784:istore_3        
		} else
	//* 346  785:goto            805
		{
			l1 = b.g();
	//  347  788:aload_0         
	//  348  789:getfield        #124 <Field NotificationOptions b>
	//  349  792:invokevirtual   #224 <Method int NotificationOptions.g()>
	//  350  795:istore          4
			i1 = b.u();
	//  351  797:aload_0         
	//  352  798:getfield        #124 <Field NotificationOptions b>
	//  353  801:invokevirtual   #227 <Method int NotificationOptions.u()>
	//  354  804:istore_3        
		}
		if(!flag)
	//* 355  805:iload           7
	//* 356  807:ifeq            813
	//* 357  810:goto            822
			l1 = b.h();
	//  358  813:aload_0         
	//  359  814:getfield        #124 <Field NotificationOptions b>
	//  360  817:invokevirtual   #229 <Method int NotificationOptions.h()>
	//  361  820:istore          4
		if(!flag)
	//* 362  822:iload           7
	//* 363  824:ifeq            830
	//* 364  827:goto            838
			i1 = b.v();
	//  365  830:aload_0         
	//  366  831:getfield        #124 <Field NotificationOptions b>
	//  367  834:invokevirtual   #232 <Method int NotificationOptions.v()>
	//  368  837:istore_3        
		s = ((String) (new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")));
	//  369  838:new             #107 <Class Intent>
	//  370  841:dup             
	//  371  842:ldc1            #88  <String "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK">
	//  372  844:invokespecial   #108 <Method void Intent(String)>
	//  373  847:astore_2        
		((Intent) (s)).setComponent(d);
	//  374  848:aload_2         
	//  375  849:aload_0         
	//  376  850:getfield        #110 <Field ComponentName d>
	//  377  853:invokevirtual   #114 <Method Intent Intent.setComponent(ComponentName)>
	//  378  856:pop             
		s = ((String) (PendingIntent.getBroadcast(((android.content.Context) (this)), 0, ((Intent) (s)), 0)));
	//  379  857:aload_0         
	//  380  858:iconst_0        
	//  381  859:aload_2         
	//  382  860:iconst_0        
	//  383  861:invokestatic    #120 <Method PendingIntent PendingIntent.getBroadcast(android.content.Context, int, Intent, int)>
	//  384  864:astore_2        
		cl1.a((new cj(l1, ((CharSequence) (l.getString(i1))), ((PendingIntent) (s)))).a());
	//  385  865:aload_1         
	//  386  866:new             #122 <Class cj>
	//  387  869:dup             
	//  388  870:iload           4
	//  389  872:aload_0         
	//  390  873:getfield        #130 <Field Resources l>
	//  391  876:iload_3         
	//  392  877:invokevirtual   #139 <Method String Resources.getString(int)>
	//  393  880:aload_2         
	//  394  881:invokespecial   #142 <Method void cj(int, CharSequence, PendingIntent)>
	//  395  884:invokevirtual   #145 <Method android.support.v4.app.ci cj.a()>
	//  396  887:invokevirtual   #150 <Method cl cl.a(android.support.v4.app.ci)>
	//  397  890:pop             
	//  398  891:return          
	}

	static Notification b(MediaNotificationService medianotificationservice)
	{
		return medianotificationservice.p;
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field Notification p>
	//    2    4:areturn         
	}

	private final void b()
	{
		Object obj;
		cl cl1;
label0:
		{
label1:
			{
label2:
				{
label3:
					{
						if(n == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #195 <Field d n>
	//*   2    4:ifnonnull       8
							return;
	//    3    7:return          
						obj = ((Object) (o));
	//    4    8:aload_0         
	//    5    9:getfield        #72  <Field e o>
	//    6   12:astore          5
						int ai1[] = null;
	//    7   14:aconst_null     
	//    8   15:astore          6
						if(obj == null)
	//*   9   17:aload           5
	//*  10   19:ifnonnull       28
							obj = null;
	//   11   22:aconst_null     
	//   12   23:astore          5
						else
	//*  13   25:goto            35
							obj = ((Object) (((e) (obj)).b));
	//   14   28:aload           5
	//   15   30:getfield        #242 <Field android.graphics.Bitmap com.google.android.gms.cast.framework.media.e.b>
	//   16   33:astore          5
						cl1 = (new cl(((android.content.Context) (this)), "cast_media_notification")).a(((android.graphics.Bitmap) (obj))).a(b.e()).a(((CharSequence) (n.d))).b(((CharSequence) (l.getString(b.s(), new Object[] {
							n.e
						})))).b(true).a(false).e(1);
	//   17   35:new             #147 <Class cl>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:ldc1            #244 <String "cast_media_notification">
	//   21   42:invokespecial   #247 <Method void cl(android.content.Context, String)>
	//   22   45:aload           5
	//   23   47:invokevirtual   #250 <Method cl cl.a(android.graphics.Bitmap)>
	//   24   50:aload_0         
	//   25   51:getfield        #124 <Field NotificationOptions b>
	//   26   54:invokevirtual   #252 <Method int NotificationOptions.e()>
	//   27   57:invokevirtual   #255 <Method cl cl.a(int)>
	//   28   60:aload_0         
	//   29   61:getfield        #195 <Field d n>
	//   30   64:getfield        #258 <Field String d.d>
	//   31   67:invokevirtual   #261 <Method cl cl.a(CharSequence)>
	//   32   70:aload_0         
	//   33   71:getfield        #130 <Field Resources l>
	//   34   74:aload_0         
	//   35   75:getfield        #124 <Field NotificationOptions b>
	//   36   78:invokevirtual   #264 <Method int NotificationOptions.s()>
	//   37   81:iconst_1        
	//   38   82:anewarray       Object[]
	//   39   85:dup             
	//   40   86:iconst_0        
	//   41   87:aload_0         
	//   42   88:getfield        #195 <Field d n>
	//   43   91:getfield        #266 <Field String d.e>
	//   44   94:aastore         
	//   45   95:invokevirtual   #269 <Method String Resources.getString(int, Object[])>
	//   46   98:invokevirtual   #271 <Method cl cl.b(CharSequence)>
	//   47  101:iconst_1        
	//   48  102:invokevirtual   #274 <Method cl cl.b(boolean)>
	//   49  105:iconst_0        
	//   50  106:invokevirtual   #276 <Method cl cl.a(boolean)>
	//   51  109:iconst_1        
	//   52  110:invokevirtual   #278 <Method cl cl.e(int)>
	//   53  113:astore          7
						if(e == null)
	//*  54  115:aload_0         
	//*  55  116:getfield        #280 <Field ComponentName e>
	//*  56  119:ifnonnull       129
						{
							obj = ((Object) (ai1));
	//   57  122:aload           6
	//   58  124:astore          5
						} else
	//*  59  126:goto            175
						{
							obj = ((Object) (new Intent()));
	//   60  129:new             #107 <Class Intent>
	//   61  132:dup             
	//   62  133:invokespecial   #281 <Method void Intent()>
	//   63  136:astore          5
							((Intent) (obj)).putExtra("targetActivity", ((android.os.Parcelable) (e)));
	//   64  138:aload           5
	//   65  140:ldc2            #283 <String "targetActivity">
	//   66  143:aload_0         
	//   67  144:getfield        #280 <Field ComponentName e>
	//   68  147:invokevirtual   #286 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   69  150:pop             
							((Intent) (obj)).setAction(e.flattenToString());
	//   70  151:aload           5
	//   71  153:aload_0         
	//   72  154:getfield        #280 <Field ComponentName e>
	//   73  157:invokevirtual   #292 <Method String ComponentName.flattenToString()>
	//   74  160:invokevirtual   #296 <Method Intent Intent.setAction(String)>
	//   75  163:pop             
							obj = ((Object) (PendingIntent.getBroadcast(((android.content.Context) (this)), 1, ((Intent) (obj)), 0x8000000)));
	//   76  164:aload_0         
	//   77  165:iconst_1        
	//   78  166:aload           5
	//   79  168:ldc1            #159 <Int 0x8000000>
	//   80  170:invokestatic    #120 <Method PendingIntent PendingIntent.getBroadcast(android.content.Context, int, Intent, int)>
	//   81  173:astore          5
						}
						if(obj != null)
	//*  82  175:aload           5
	//*  83  177:ifnull          188
							cl1.a(((PendingIntent) (obj)));
	//   84  180:aload           7
	//   85  182:aload           5
	//   86  184:invokevirtual   #299 <Method cl cl.a(PendingIntent)>
	//   87  187:pop             
						if(h == null)
							break label1;
	//   88  188:aload_0         
	//   89  189:getfield        #301 <Field ai h>
	//   90  192:ifnull          707
						a.b("mActionsProvider != null", new Object[0]);
	//   91  195:getstatic       #51  <Field at a>
	//   92  198:ldc2            #303 <String "mActionsProvider != null">
	//   93  201:iconst_0        
	//   94  202:anewarray       Object[]
	//   95  205:invokevirtual   #305 <Method void at.b(String, Object[])>
						int i1;
						boolean flag;
						int j1;
						Iterator iterator;
						Object obj1;
						try
						{
							obj = ((Object) (h.a()));
	//   96  208:aload_0         
	//   97  209:getfield        #301 <Field ai h>
	//   98  212:invokeinterface #310 <Method List com.google.android.gms.cast.framework.media.ai.a()>
	//   99  217:astore          5
							ai1 = h.b();
	//  100  219:aload_0         
	//  101  220:getfield        #301 <Field ai h>
	//  102  223:invokeinterface #313 <Method int[] com.google.android.gms.cast.framework.media.ai.b()>
	//  103  228:astore          6
						}
	//* 104  230:aload           5
	//* 105  232:ifnull          294
	//* 106  235:aload           5
	//* 107  237:invokeinterface #319 <Method boolean List.isEmpty()>
	//* 108  242:ifeq            248
	//* 109  245:goto            294
	//* 110  248:aload           5
	//* 111  250:invokeinterface #322 <Method int List.size()>
	//* 112  255:iconst_5        
	//* 113  256:icmple          289
	//* 114  259:getstatic       #51  <Field at a>
	//* 115  262:ldc2            #324 <Class g>
	//* 116  265:invokevirtual   #329 <Method String Class.getSimpleName()>
	//* 117  268:invokestatic    #333 <Method String String.valueOf(Object)>
	//* 118  271:ldc2            #335 <String " provides more than 5 actions.">
	//* 119  274:invokevirtual   #339 <Method String String.concat(String)>
	//* 120  277:iconst_0        
	//* 121  278:anewarray       Object[]
	//* 122  281:invokevirtual   #105 <Method void at.d(String, Object[])>
	//* 123  284:iconst_0        
	//* 124  285:istore_1        
	//* 125  286:goto            321
	//* 126  289:iconst_1        
	//* 127  290:istore_1        
	//* 128  291:goto            321
	//* 129  294:getstatic       #51  <Field at a>
	//* 130  297:ldc2            #324 <Class g>
	//* 131  300:invokevirtual   #329 <Method String Class.getSimpleName()>
	//* 132  303:invokestatic    #333 <Method String String.valueOf(Object)>
	//* 133  306:ldc2            #341 <String " doesn't provide any action.">
	//* 134  309:invokevirtual   #339 <Method String String.concat(String)>
	//* 135  312:iconst_0        
	//* 136  313:anewarray       Object[]
	//* 137  316:invokevirtual   #105 <Method void at.d(String, Object[])>
	//* 138  319:iconst_0        
	//* 139  320:istore_1        
	//* 140  321:iload_1         
	//* 141  322:ifeq            673
	//* 142  325:aload           5
	//* 143  327:invokeinterface #322 <Method int List.size()>
	//* 144  332:istore_2        
	//* 145  333:aload           6
	//* 146  335:ifnull          420
	//* 147  338:aload           6
	//* 148  340:arraylength     
	//* 149  341:ifne            347
	//* 150  344:goto            420
	//* 151  347:aload           6
	//* 152  349:arraylength     
	//* 153  350:istore_3        
	//* 154  351:iconst_0        
	//* 155  352:istore_1        
	//* 156  353:iload_1         
	//* 157  354:iload_3         
	//* 158  355:icmpge          415
	//* 159  358:aload           6
	//* 160  360:iload_1         
	//* 161  361:iaload          
	//* 162  362:istore          4
	//* 163  364:iload           4
	//* 164  366:iflt            385
	//* 165  369:iload           4
	//* 166  371:iload_2         
	//* 167  372:icmplt          378
	//* 168  375:goto            385
	//* 169  378:iload_1         
	//* 170  379:iconst_1        
	//* 171  380:iadd            
	//* 172  381:istore_1        
	//* 173  382:goto            353
	//* 174  385:getstatic       #51  <Field at a>
	//* 175  388:ldc2            #324 <Class g>
	//* 176  391:invokevirtual   #329 <Method String Class.getSimpleName()>
	//* 177  394:invokestatic    #333 <Method String String.valueOf(Object)>
	//* 178  397:ldc2            #343 <String "provides a compact view action whose index is out of bounds.">
	//* 179  400:invokevirtual   #339 <Method String String.concat(String)>
	//* 180  403:iconst_0        
	//* 181  404:anewarray       Object[]
	//* 182  407:invokevirtual   #105 <Method void at.d(String, Object[])>
	//* 183  410:iconst_0        
	//* 184  411:istore_1        
	//* 185  412:goto            447
	//* 186  415:iconst_1        
	//* 187  416:istore_1        
	//* 188  417:goto            447
	//* 189  420:getstatic       #51  <Field at a>
	//* 190  423:ldc2            #324 <Class g>
	//* 191  426:invokevirtual   #329 <Method String Class.getSimpleName()>
	//* 192  429:invokestatic    #333 <Method String String.valueOf(Object)>
	//* 193  432:ldc2            #345 <String " doesn't provide any actions for compact view.">
	//* 194  435:invokevirtual   #339 <Method String String.concat(String)>
	//* 195  438:iconst_0        
	//* 196  439:anewarray       Object[]
	//* 197  442:invokevirtual   #105 <Method void at.d(String, Object[])>
	//* 198  445:iconst_0        
	//* 199  446:istore_1        
	//* 200  447:iload_1         
	//* 201  448:ifne            452
	//* 202  451:return          
	//* 203  452:aload           6
	//* 204  454:invokevirtual   #350 <Method Object _5B_I.clone()>
	//* 205  457:checkcast       #346 <Class int[]>
	//* 206  460:astore          6
	//* 207  462:aload           5
	//* 208  464:invokeinterface #354 <Method Iterator List.iterator()>
	//* 209  469:astore          8
	//* 210  471:aload           6
	//* 211  473:astore          5
	//* 212  475:aload           8
	//* 213  477:invokeinterface #359 <Method boolean Iterator.hasNext()>
	//* 214  482:ifeq            753
	//* 215  485:aload           8
	//* 216  487:invokeinterface #362 <Method Object Iterator.next()>
	//* 217  492:checkcast       #364 <Class NotificationAction>
	//* 218  495:astore          5
	//* 219  497:new             #366 <Class f>
	//* 220  500:dup             
	//* 221  501:invokespecial   #367 <Method void f()>
	//* 222  504:aload           5
	//* 223  506:invokevirtual   #369 <Method String com.google.android.gms.cast.framework.media.NotificationAction.a()>
	//* 224  509:invokevirtual   #372 <Method f com.google.android.gms.cast.framework.media.f.a(String)>
	//* 225  512:pop             
	//* 226  513:aload           5
	//* 227  515:invokevirtual   #369 <Method String com.google.android.gms.cast.framework.media.NotificationAction.a()>
	//* 228  518:astore          9
	//* 229  520:aload           9
	//* 230  522:ldc1            #88  <String "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK">
	//* 231  524:invokevirtual   #86  <Method boolean String.equals(Object)>
	//* 232  527:ifne            588
	//* 233  530:aload           9
	//* 234  532:ldc1            #96  <String "com.google.android.gms.cast.framework.action.SKIP_NEXT">
	//* 235  534:invokevirtual   #86  <Method boolean String.equals(Object)>
	//* 236  537:ifne            588
	//* 237  540:aload           9
	//* 238  542:ldc1            #94  <String "com.google.android.gms.cast.framework.action.SKIP_PREV">
	//* 239  544:invokevirtual   #86  <Method boolean String.equals(Object)>
	//* 240  547:ifne            588
	//* 241  550:aload           9
	//* 242  552:ldc1            #82  <String "com.google.android.gms.cast.framework.action.FORWARD">
	//* 243  554:invokevirtual   #86  <Method boolean String.equals(Object)>
	//* 244  557:ifne            588
	//* 245  560:aload           9
	//* 246  562:ldc1            #98  <String "com.google.android.gms.cast.framework.action.REWIND">
	//* 247  564:invokevirtual   #86  <Method boolean String.equals(Object)>
	//* 248  567:ifne            588
	//* 249  570:aload           9
	//* 250  572:ldc1            #92  <String "com.google.android.gms.cast.framework.action.STOP_CASTING">
	//* 251  574:invokevirtual   #86  <Method boolean String.equals(Object)>
	//* 252  577:ifeq            583
	//* 253  580:goto            588
	//* 254  583:iconst_0        
	//* 255  584:istore_1        
	//* 256  585:goto            590
	//* 257  588:iconst_1        
	//* 258  589:istore_1        
	//* 259  590:iload_1         
	//* 260  591:ifeq            608
	//* 261  594:aload_0         
	//* 262  595:aload           7
	//* 263  597:aload           5
	//* 264  599:invokevirtual   #369 <Method String com.google.android.gms.cast.framework.media.NotificationAction.a()>
	//* 265  602:invokespecial   #374 <Method void a(cl, String)>
	//* 266  605:goto            471
	//* 267  608:new             #107 <Class Intent>
	//* 268  611:dup             
	//* 269  612:aload           5
	//* 270  614:invokevirtual   #369 <Method String com.google.android.gms.cast.framework.media.NotificationAction.a()>
	//* 271  617:invokespecial   #108 <Method void Intent(String)>
	//* 272  620:astore          9
	//* 273  622:aload           9
	//* 274  624:aload_0         
	//* 275  625:getfield        #110 <Field ComponentName d>
	//* 276  628:invokevirtual   #114 <Method Intent Intent.setComponent(ComponentName)>
	//* 277  631:pop             
	//* 278  632:aload_0         
	//* 279  633:iconst_0        
	//* 280  634:aload           9
	//* 281  636:iconst_0        
	//* 282  637:invokestatic    #120 <Method PendingIntent PendingIntent.getBroadcast(android.content.Context, int, Intent, int)>
	//* 283  640:astore          9
	//* 284  642:aload           7
	//* 285  644:new             #122 <Class cj>
	//* 286  647:dup             
	//* 287  648:aload           5
	//* 288  650:invokevirtual   #376 <Method int com.google.android.gms.cast.framework.media.NotificationAction.b()>
	//* 289  653:aload           5
	//* 290  655:invokevirtual   #378 <Method String com.google.android.gms.cast.framework.media.NotificationAction.c()>
	//* 291  658:aload           9
	//* 292  660:invokespecial   #142 <Method void cj(int, CharSequence, PendingIntent)>
	//* 293  663:invokevirtual   #145 <Method android.support.v4.app.ci cj.a()>
	//* 294  666:invokevirtual   #150 <Method cl cl.a(android.support.v4.app.ci)>
	//* 295  669:pop             
	//* 296  670:goto            471
	//* 297  673:return          
						// Misplaced declaration of an exception variable
						catch(Object obj)
	//* 298  674:astore          5
						{
							a.b(((Throwable) (obj)), "Unable to call %s on %s.", new Object[] {
								"getNotificationActions", ((Class) (com/google/android/gms/cast/framework/media/ai)).getSimpleName()
							});
	//  299  676:getstatic       #51  <Field at a>
	//  300  679:aload           5
	//  301  681:ldc2            #380 <String "Unable to call %s on %s.">
	//  302  684:iconst_2        
	//  303  685:anewarray       Object[]
	//  304  688:dup             
	//  305  689:iconst_0        
	//  306  690:ldc2            #382 <String "getNotificationActions">
	//  307  693:aastore         
	//  308  694:dup             
	//  309  695:iconst_1        
	//  310  696:ldc2            #307 <Class ai>
	//  311  699:invokevirtual   #329 <Method String Class.getSimpleName()>
	//  312  702:aastore         
	//  313  703:invokevirtual   #385 <Method void at.b(Throwable, String, Object[])>
							return;
	//  314  706:return          
						}
						if(obj != null && !((List) (obj)).isEmpty())
						{
							if(((List) (obj)).size() > 5)
							{
								a.d(String.valueOf(((Object) (((Class) (com/google/android/gms/cast/framework/media/g)).getSimpleName()))).concat(" provides more than 5 actions."), new Object[0]);
								i1 = 0;
							} else
							{
								i1 = 1;
							}
						} else
						{
							a.d(String.valueOf(((Object) (((Class) (com/google/android/gms/cast/framework/media/g)).getSimpleName()))).concat(" doesn't provide any action."), new Object[0]);
							i1 = 0;
						}
						if(!i1)
							break label2;
						j1 = ((List) (obj)).size();
						if(ai1 != null && ai1.length != 0)
						{
							int k1 = ai1.length;
							for(i1 = 0; i1 < k1;)
							{
								int l1 = ai1[i1];
								if(l1 >= 0 && l1 < j1)
								{
									i1++;
								} else
								{
									a.d(String.valueOf(((Object) (((Class) (com/google/android/gms/cast/framework/media/g)).getSimpleName()))).concat("provides a compact view action whose index is out of bounds."), new Object[0]);
									i1 = 0;
									break label3;
								}
							}

							i1 = 1;
						} else
						{
							a.d(String.valueOf(((Object) (((Class) (com/google/android/gms/cast/framework/media/g)).getSimpleName()))).concat(" doesn't provide any actions for compact view."), new Object[0]);
							i1 = 0;
						}
					}
					if(!i1)
						return;
					ai1 = (int[])((int []) (ai1)).clone();
					iterator = ((List) (obj)).iterator();
					do
					{
						obj = ((Object) (ai1));
						if(!iterator.hasNext())
							break;
						obj = ((Object) ((NotificationAction)iterator.next()));
						(new f()).a(((NotificationAction) (obj)).a());
						obj1 = ((Object) (((NotificationAction) (obj)).a()));
						if(!((String) (obj1)).equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !((String) (obj1)).equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") && !((String) (obj1)).equals("com.google.android.gms.cast.framework.action.SKIP_PREV") && !((String) (obj1)).equals("com.google.android.gms.cast.framework.action.FORWARD") && !((String) (obj1)).equals("com.google.android.gms.cast.framework.action.REWIND") && !((String) (obj1)).equals("com.google.android.gms.cast.framework.action.STOP_CASTING"))
							flag = false;
						else
							flag = true;
						if(flag)
						{
							a(cl1, ((NotificationAction) (obj)).a());
						} else
						{
							obj1 = ((Object) (new Intent(((NotificationAction) (obj)).a())));
							((Intent) (obj1)).setComponent(d);
							obj1 = ((Object) (PendingIntent.getBroadcast(((android.content.Context) (this)), 0, ((Intent) (obj1)), 0)));
							cl1.a((new cj(((NotificationAction) (obj)).b(), ((CharSequence) (((NotificationAction) (obj)).c())), ((PendingIntent) (obj1)))).a());
						}
					} while(true);
					break label0;
				}
				return;
			}
			for(obj = ((Object) (f.iterator())); ((Iterator) (obj)).hasNext(); a(cl1, (String)((Iterator) (obj)).next()));
	//  315  707:aload_0         
	//  316  708:getfield        #59  <Field List f>
	//  317  711:invokeinterface #354 <Method Iterator List.iterator()>
	//  318  716:astore          5
	//  319  718:aload           5
	//  320  720:invokeinterface #359 <Method boolean Iterator.hasNext()>
	//  321  725:ifeq            747
	//  322  728:aload_0         
	//  323  729:aload           7
	//  324  731:aload           5
	//  325  733:invokeinterface #362 <Method Object Iterator.next()>
	//  326  738:checkcast       #76  <Class String>
	//  327  741:invokespecial   #374 <Method void a(cl, String)>
	//* 328  744:goto            718
			obj = ((Object) (g));
	//  329  747:aload_0         
	//  330  748:getfield        #387 <Field int[] g>
	//  331  751:astore          5
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 332  753:getstatic       #392 <Field int android.os.Build$VERSION.SDK_INT>
	//* 333  756:bipush          21
	//* 334  758:icmplt          789
			cl1.a(((android.support.v4.app.cm) ((new b()).a(((int []) (obj))).a(n.a))));
	//  335  761:aload           7
	//  336  763:new             #394 <Class b>
	//  337  766:dup             
	//  338  767:invokespecial   #395 <Method void b()>
	//  339  770:aload           5
	//  340  772:invokevirtual   #398 <Method b b.a(int[])>
	//  341  775:aload_0         
	//  342  776:getfield        #195 <Field d n>
	//  343  779:getfield        #401 <Field android.support.v4.media.session.MediaSessionCompat$Token com.google.android.gms.cast.framework.media.d.a>
	//  344  782:invokevirtual   #404 <Method b b.a(android.support.v4.media.session.MediaSessionCompat$Token)>
	//  345  785:invokevirtual   #407 <Method cl cl.a(android.support.v4.app.cm)>
	//  346  788:pop             
		p = cl1.b();
	//  347  789:aload_0         
	//  348  790:aload           7
	//  349  792:invokevirtual   #410 <Method Notification cl.b()>
	//  350  795:putfield        #235 <Field Notification p>
		if(!q.d())
	//* 351  798:aload_0         
	//* 352  799:getfield        #69  <Field c q>
	//* 353  802:invokevirtual   #414 <Method boolean c.d()>
	//* 354  805:ifne            818
		{
			startForeground(1, p);
	//  355  808:aload_0         
	//  356  809:iconst_1        
	//  357  810:aload_0         
	//  358  811:getfield        #235 <Field Notification p>
	//  359  814:invokevirtual   #418 <Method void startForeground(int, Notification)>
			return;
	//  360  817:return          
		} else
		{
			stopForeground(true);
	//  361  818:aload_0         
	//  362  819:iconst_1        
	//  363  820:invokevirtual   #422 <Method void stopForeground(boolean)>
			return;
	//  364  823:return          
		}
	}

	static void c(MediaNotificationService medianotificationservice)
	{
		medianotificationservice.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #424 <Method void b()>
	//    2    4:return          
	}

	public IBinder onBind(Intent intent)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void onCreate()
	{
		q = com.google.android.gms.cast.framework.c.a(((android.content.Context) (this)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokestatic    #430 <Method c c.a(android.content.Context)>
	//    3    5:putfield        #69  <Field c q>
		Object obj = ((Object) (q.a().f()));
	//    4    8:aload_0         
	//    5    9:getfield        #69  <Field c q>
	//    6   12:invokevirtual   #433 <Method CastOptions c.a()>
	//    7   15:invokevirtual   #438 <Method CastMediaOptions CastOptions.f()>
	//    8   18:astore_2        
		b = ((CastMediaOptions) (obj)).b();
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #443 <Method NotificationOptions com.google.android.gms.cast.framework.media.CastMediaOptions.b()>
	//   12   24:putfield        #124 <Field NotificationOptions b>
		c = ((CastMediaOptions) (obj)).e();
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:invokevirtual   #446 <Method com.google.android.gms.cast.framework.media.b CastMediaOptions.e()>
	//   16   32:putfield        #448 <Field com.google.android.gms.cast.framework.media.b c>
		l = getResources();
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:invokevirtual   #452 <Method Resources getResources()>
	//   20   40:putfield        #130 <Field Resources l>
		d = new ComponentName(getApplicationContext(), ((CastMediaOptions) (obj)).a());
	//   21   43:aload_0         
	//   22   44:new             #288 <Class ComponentName>
	//   23   47:dup             
	//   24   48:aload_0         
	//   25   49:invokevirtual   #456 <Method android.content.Context getApplicationContext()>
	//   26   52:aload_2         
	//   27   53:invokevirtual   #457 <Method String com.google.android.gms.cast.framework.media.CastMediaOptions.a()>
	//   28   56:invokespecial   #458 <Method void ComponentName(android.content.Context, String)>
	//   29   59:putfield        #110 <Field ComponentName d>
		if(!TextUtils.isEmpty(((CharSequence) (b.d()))))
	//*  30   62:aload_0         
	//*  31   63:getfield        #124 <Field NotificationOptions b>
	//*  32   66:invokevirtual   #460 <Method String NotificationOptions.d()>
	//*  33   69:invokestatic    #465 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  34   72:ifne            100
			e = new ComponentName(getApplicationContext(), b.d());
	//   35   75:aload_0         
	//   36   76:new             #288 <Class ComponentName>
	//   37   79:dup             
	//   38   80:aload_0         
	//   39   81:invokevirtual   #456 <Method android.content.Context getApplicationContext()>
	//   40   84:aload_0         
	//   41   85:getfield        #124 <Field NotificationOptions b>
	//   42   88:invokevirtual   #460 <Method String NotificationOptions.d()>
	//   43   91:invokespecial   #458 <Method void ComponentName(android.content.Context, String)>
	//   44   94:putfield        #280 <Field ComponentName e>
		else
	//*  45   97:goto            105
			e = null;
	//   46  100:aload_0         
	//   47  101:aconst_null     
	//   48  102:putfield        #280 <Field ComponentName e>
		h = b.F();
	//   49  105:aload_0         
	//   50  106:aload_0         
	//   51  107:getfield        #124 <Field NotificationOptions b>
	//   52  110:invokevirtual   #469 <Method ai NotificationOptions.F()>
	//   53  113:putfield        #301 <Field ai h>
		if(h == null)
	//*  54  116:aload_0         
	//*  55  117:getfield        #301 <Field ai h>
	//*  56  120:ifnonnull       160
		{
			f.addAll(((java.util.Collection) (b.a())));
	//   57  123:aload_0         
	//   58  124:getfield        #59  <Field List f>
	//   59  127:aload_0         
	//   60  128:getfield        #124 <Field NotificationOptions b>
	//   61  131:invokevirtual   #470 <Method List com.google.android.gms.cast.framework.media.NotificationOptions.a()>
	//   62  134:invokeinterface #474 <Method boolean List.addAll(java.util.Collection)>
	//   63  139:pop             
			g = (int[])((int []) (b.b())).clone();
	//   64  140:aload_0         
	//   65  141:aload_0         
	//   66  142:getfield        #124 <Field NotificationOptions b>
	//   67  145:invokevirtual   #475 <Method int[] com.google.android.gms.cast.framework.media.NotificationOptions.b()>
	//   68  148:invokevirtual   #350 <Method Object _5B_I.clone()>
	//   69  151:checkcast       #346 <Class int[]>
	//   70  154:putfield        #387 <Field int[] g>
		} else
	//*  71  157:goto            165
		{
			g = null;
	//   72  160:aload_0         
	//   73  161:aconst_null     
	//   74  162:putfield        #387 <Field int[] g>
		}
		i = b.c();
	//   75  165:aload_0         
	//   76  166:aload_0         
	//   77  167:getfield        #124 <Field NotificationOptions b>
	//   78  170:invokevirtual   #478 <Method long com.google.android.gms.cast.framework.media.NotificationOptions.c()>
	//   79  173:putfield        #152 <Field long i>
		int i1 = l.getDimensionPixelSize(b.r());
	//   80  176:aload_0         
	//   81  177:getfield        #130 <Field Resources l>
	//   82  180:aload_0         
	//   83  181:getfield        #124 <Field NotificationOptions b>
	//   84  184:invokevirtual   #480 <Method int NotificationOptions.r()>
	//   85  187:invokevirtual   #484 <Method int Resources.getDimensionPixelSize(int)>
	//   86  190:istore_1        
		k = new ImageHints(1, i1, i1);
	//   87  191:aload_0         
	//   88  192:new             #486 <Class ImageHints>
	//   89  195:dup             
	//   90  196:iconst_1        
	//   91  197:iload_1         
	//   92  198:iload_1         
	//   93  199:invokespecial   #489 <Method void ImageHints(int, int, int)>
	//   94  202:putfield        #491 <Field ImageHints k>
		j = new com.google.android.gms.internal.cast.b(getApplicationContext(), k);
	//   95  205:aload_0         
	//   96  206:new             #493 <Class com.google.android.gms.internal.cast.b>
	//   97  209:dup             
	//   98  210:aload_0         
	//   99  211:invokevirtual   #456 <Method android.content.Context getApplicationContext()>
	//  100  214:aload_0         
	//  101  215:getfield        #491 <Field ImageHints k>
	//  102  218:invokespecial   #496 <Method void com.google.android.gms.internal.cast.b(android.content.Context, ImageHints)>
	//  103  221:putfield        #498 <Field com.google.android.gms.internal.cast.b j>
		m = ((a) (new an(this)));
	//  104  224:aload_0         
	//  105  225:new             #500 <Class an>
	//  106  228:dup             
	//  107  229:aload_0         
	//  108  230:invokespecial   #501 <Method void an(MediaNotificationService)>
	//  109  233:putfield        #503 <Field a m>
		q.a(m);
	//  110  236:aload_0         
	//  111  237:getfield        #69  <Field c q>
	//  112  240:aload_0         
	//  113  241:getfield        #503 <Field a m>
	//  114  244:invokevirtual   #506 <Method void c.a(a)>
		obj = ((Object) (e));
	//  115  247:aload_0         
	//  116  248:getfield        #280 <Field ComponentName e>
	//  117  251:astore_2        
		if(obj != null)
	//* 118  252:aload_2         
	//* 119  253:ifnull          276
			registerReceiver(r, new IntentFilter(((ComponentName) (obj)).flattenToString()));
	//  120  256:aload_0         
	//  121  257:aload_0         
	//  122  258:getfield        #66  <Field BroadcastReceiver r>
	//  123  261:new             #508 <Class IntentFilter>
	//  124  264:dup             
	//  125  265:aload_2         
	//  126  266:invokevirtual   #292 <Method String ComponentName.flattenToString()>
	//  127  269:invokespecial   #509 <Method void IntentFilter(String)>
	//  128  272:invokevirtual   #513 <Method Intent registerReceiver(BroadcastReceiver, IntentFilter)>
	//  129  275:pop             
		if(com.google.android.gms.common.util.o.k())
	//* 130  276:invokestatic    #517 <Method boolean o.k()>
	//* 131  279:ifeq            317
		{
			NotificationManager notificationmanager = (NotificationManager)getSystemService(android/app/NotificationManager);
	//  132  282:aload_0         
	//  133  283:ldc2            #519 <Class NotificationManager>
	//  134  286:invokevirtual   #523 <Method Object getSystemService(Class)>
	//  135  289:checkcast       #519 <Class NotificationManager>
	//  136  292:astore_2        
			NotificationChannel notificationchannel = new NotificationChannel("cast_media_notification", "Cast", 2);
	//  137  293:new             #525 <Class NotificationChannel>
	//  138  296:dup             
	//  139  297:ldc1            #244 <String "cast_media_notification">
	//  140  299:ldc2            #527 <String "Cast">
	//  141  302:iconst_2        
	//  142  303:invokespecial   #530 <Method void NotificationChannel(String, CharSequence, int)>
	//  143  306:astore_3        
			notificationchannel.setShowBadge(false);
	//  144  307:aload_3         
	//  145  308:iconst_0        
	//  146  309:invokevirtual   #533 <Method void NotificationChannel.setShowBadge(boolean)>
			notificationmanager.createNotificationChannel(notificationchannel);
	//  147  312:aload_2         
	//  148  313:aload_3         
	//  149  314:invokevirtual   #537 <Method void NotificationManager.createNotificationChannel(NotificationChannel)>
		}
	//  150  317:return          
	}

	public void onDestroy()
	{
		com.google.android.gms.internal.cast.b b1 = j;
	//    0    0:aload_0         
	//    1    1:getfield        #498 <Field com.google.android.gms.internal.cast.b j>
	//    2    4:astore_1        
		if(b1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			b1.a();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #542 <Method void com.google.android.gms.internal.cast.b.a()>
		if(e != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #280 <Field ComponentName e>
	//*   9   17:ifnull          46
			try
			{
				unregisterReceiver(r);
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #66  <Field BroadcastReceiver r>
	//   13   25:invokevirtual   #546 <Method void unregisterReceiver(BroadcastReceiver)>
			}
	//*  14   28:goto            46
			catch(IllegalArgumentException illegalargumentexception)
	//*  15   31:astore_1        
			{
				a.b(((Throwable) (illegalargumentexception)), "Unregistering trampoline BroadcastReceiver failed", new Object[0]);
	//   16   32:getstatic       #51  <Field at a>
	//   17   35:aload_1         
	//   18   36:ldc2            #548 <String "Unregistering trampoline BroadcastReceiver failed">
	//   19   39:iconst_0        
	//   20   40:anewarray       Object[]
	//   21   43:invokevirtual   #385 <Method void at.b(Throwable, String, Object[])>
			}
		((NotificationManager)getSystemService("notification")).cancel(1);
	//   22   46:aload_0         
	//   23   47:ldc2            #550 <String "notification">
	//   24   50:invokevirtual   #553 <Method Object getSystemService(String)>
	//   25   53:checkcast       #519 <Class NotificationManager>
	//   26   56:iconst_1        
	//   27   57:invokevirtual   #557 <Method void NotificationManager.cancel(int)>
		q.b(m);
	//   28   60:aload_0         
	//   29   61:getfield        #69  <Field c q>
	//   30   64:aload_0         
	//   31   65:getfield        #503 <Field a m>
	//   32   68:invokevirtual   #559 <Method void c.b(a)>
	//   33   71:return          
	}

	public int onStartCommand(Intent intent, int i1, int j1)
	{
label0:
		{
label1:
			{
				Object obj;
label2:
				{
					if(intent == null || !"com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION".equals(((Object) (intent.getAction()))))
						break label0;
	//    0    0:aload_1         
	//    1    1:ifnull          418
	//    2    4:ldc2            #563 <String "com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION">
	//    3    7:aload_1         
	//    4    8:invokevirtual   #566 <Method String Intent.getAction()>
	//    5   11:invokevirtual   #86  <Method boolean String.equals(Object)>
	//    6   14:ifeq            418
					Object obj1 = ((Object) ((MediaInfo)intent.getParcelableExtra("extra_media_info")));
	//    7   17:aload_1         
	//    8   18:ldc2            #568 <String "extra_media_info">
	//    9   21:invokevirtual   #572 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   10   24:checkcast       #574 <Class MediaInfo>
	//   11   27:astore          7
					i1 = 0;
	//   12   29:iconst_0        
	//   13   30:istore_2        
					j1 = 0;
	//   14   31:iconst_0        
	//   15   32:istore_3        
					if(obj1 == null)
	//*  16   33:aload           7
	//*  17   35:ifnonnull       41
						break label1;
	//   18   38:goto            409
					obj = ((Object) (((MediaInfo) (obj1)).d()));
	//   19   41:aload           7
	//   20   43:invokevirtual   #577 <Method MediaMetadata MediaInfo.d()>
	//   21   46:astore          6
					if(obj == null)
	//*  22   48:aload           6
	//*  23   50:ifnonnull       56
						break label1;
	//   24   53:goto            409
					int k1 = intent.getIntExtra("extra_remote_media_client_player_state", 0);
	//   25   56:aload_1         
	//   26   57:ldc2            #579 <String "extra_remote_media_client_player_state">
	//   27   60:iconst_0        
	//   28   61:invokevirtual   #583 <Method int Intent.getIntExtra(String, int)>
	//   29   64:istore          4
					if(k1 == 0)
	//*  30   66:iload           4
	//*  31   68:ifne            74
						break label1;
	//   32   71:goto            409
					CastDevice castdevice = (CastDevice)intent.getParcelableExtra("extra_cast_device");
	//   33   74:aload_1         
	//   34   75:ldc2            #585 <String "extra_cast_device">
	//   35   78:invokevirtual   #572 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   36   81:checkcast       #587 <Class CastDevice>
	//   37   84:astore          8
					if(castdevice == null)
	//*  38   86:aload           8
	//*  39   88:ifnonnull       94
						break label1;
	//   40   91:goto            409
					boolean flag;
					if(k1 == 2)
	//*  41   94:iload           4
	//*  42   96:iconst_2        
	//*  43   97:icmpne          106
						flag = true;
	//   44  100:iconst_1        
	//   45  101:istore          5
					else
	//*  46  103:goto            109
						flag = false;
	//   47  106:iconst_0        
	//   48  107:istore          5
					obj1 = ((Object) (new d(flag, ((MediaInfo) (obj1)).b(), ((MediaMetadata) (obj)).a("com.google.android.gms.cast.metadata.TITLE"), castdevice.a(), (android.support.v4.media.session.MediaSessionCompat.Token)intent.getParcelableExtra("extra_media_session_token"), intent.getBooleanExtra("extra_can_skip_next", false), intent.getBooleanExtra("extra_can_skip_prev", false))));
	//   49  109:new             #197 <Class d>
	//   50  112:dup             
	//   51  113:iload           5
	//   52  115:aload           7
	//   53  117:invokevirtual   #588 <Method int MediaInfo.b()>
	//   54  120:aload           6
	//   55  122:ldc2            #590 <String "com.google.android.gms.cast.metadata.TITLE">
	//   56  125:invokevirtual   #594 <Method String MediaMetadata.a(String)>
	//   57  128:aload           8
	//   58  130:invokevirtual   #595 <Method String CastDevice.a()>
	//   59  133:aload_1         
	//   60  134:ldc2            #597 <String "extra_media_session_token">
	//   61  137:invokevirtual   #572 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   62  140:checkcast       #599 <Class android.support.v4.media.session.MediaSessionCompat$Token>
	//   63  143:aload_1         
	//   64  144:ldc2            #601 <String "extra_can_skip_next">
	//   65  147:iconst_0        
	//   66  148:invokevirtual   #605 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   67  151:aload_1         
	//   68  152:ldc2            #607 <String "extra_can_skip_prev">
	//   69  155:iconst_0        
	//   70  156:invokevirtual   #605 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   71  159:invokespecial   #610 <Method void d(boolean, int, String, String, android.support.v4.media.session.MediaSessionCompat$Token, boolean, boolean)>
	//   72  162:astore          7
					if(!intent.getBooleanExtra("extra_media_notification_force_update", false))
	//*  73  164:aload_1         
	//*  74  165:ldc2            #612 <String "extra_media_notification_force_update">
	//*  75  168:iconst_0        
	//*  76  169:invokevirtual   #605 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*  77  172:ifne            273
					{
						intent = ((Intent) (n));
	//   78  175:aload_0         
	//   79  176:getfield        #195 <Field d n>
	//   80  179:astore_1        
						if(intent != null && ((d) (obj1)).b == ((d) (intent)).b && ((d) (obj1)).c == ((d) (intent)).c && aj.a(((Object) (((d) (obj1)).d)), ((Object) (((d) (intent)).d))) && aj.a(((Object) (((d) (obj1)).e)), ((Object) (((d) (intent)).e))) && ((d) (obj1)).f == ((d) (intent)).f && ((d) (obj1)).g == ((d) (intent)).g)
	//*  81  180:aload_1         
	//*  82  181:ifnull          267
	//*  83  184:aload           7
	//*  84  186:getfield        #217 <Field boolean com.google.android.gms.cast.framework.media.d.b>
	//*  85  189:aload_1         
	//*  86  190:getfield        #217 <Field boolean com.google.android.gms.cast.framework.media.d.b>
	//*  87  193:icmpne          267
	//*  88  196:aload           7
	//*  89  198:getfield        #215 <Field int com.google.android.gms.cast.framework.media.d.c>
	//*  90  201:aload_1         
	//*  91  202:getfield        #215 <Field int com.google.android.gms.cast.framework.media.d.c>
	//*  92  205:icmpne          267
	//*  93  208:aload           7
	//*  94  210:getfield        #258 <Field String d.d>
	//*  95  213:aload_1         
	//*  96  214:getfield        #258 <Field String d.d>
	//*  97  217:invokestatic    #617 <Method boolean aj.a(Object, Object)>
	//*  98  220:ifeq            267
	//*  99  223:aload           7
	//* 100  225:getfield        #266 <Field String d.e>
	//* 101  228:aload_1         
	//* 102  229:getfield        #266 <Field String d.e>
	//* 103  232:invokestatic    #617 <Method boolean aj.a(Object, Object)>
	//* 104  235:ifeq            267
	//* 105  238:aload           7
	//* 106  240:getfield        #207 <Field boolean d.f>
	//* 107  243:aload_1         
	//* 108  244:getfield        #207 <Field boolean d.f>
	//* 109  247:icmpne          267
	//* 110  250:aload           7
	//* 111  252:getfield        #200 <Field boolean d.g>
	//* 112  255:aload_1         
	//* 113  256:getfield        #200 <Field boolean d.g>
	//* 114  259:icmpne          267
							i1 = 1;
	//  115  262:iconst_1        
	//  116  263:istore_2        
						else
	//* 117  264:goto            269
							i1 = 0;
	//  118  267:iconst_0        
	//  119  268:istore_2        
						if(i1 != 0)
							break label2;
	//  120  269:iload_2         
	//  121  270:ifne            283
					}
					n = ((d) (obj1));
	//  122  273:aload_0         
	//  123  274:aload           7
	//  124  276:putfield        #195 <Field d n>
					b();
	//  125  279:aload_0         
	//  126  280:invokespecial   #424 <Method void b()>
				}
				intent = ((Intent) (c));
	//  127  283:aload_0         
	//  128  284:getfield        #448 <Field com.google.android.gms.cast.framework.media.b c>
	//  129  287:astore_1        
				if(intent != null)
	//* 130  288:aload_1         
	//* 131  289:ifnull          306
					intent = ((Intent) (((com.google.android.gms.cast.framework.media.b) (intent)).a(((MediaMetadata) (obj)), k)));
	//  132  292:aload_1         
	//  133  293:aload           6
	//  134  295:aload_0         
	//  135  296:getfield        #491 <Field ImageHints k>
	//  136  299:invokevirtual   #622 <Method WebImage com.google.android.gms.cast.framework.media.b.a(MediaMetadata, ImageHints)>
	//  137  302:astore_1        
				else
	//* 138  303:goto            334
				if(((MediaMetadata) (obj)).e())
	//* 139  306:aload           6
	//* 140  308:invokevirtual   #624 <Method boolean MediaMetadata.e()>
	//* 141  311:ifeq            332
					intent = ((Intent) ((WebImage)((MediaMetadata) (obj)).d().get(0)));
	//  142  314:aload           6
	//  143  316:invokevirtual   #626 <Method List MediaMetadata.d()>
	//  144  319:iconst_0        
	//  145  320:invokeinterface #630 <Method Object List.get(int)>
	//  146  325:checkcast       #632 <Class WebImage>
	//  147  328:astore_1        
				else
	//* 148  329:goto            334
					intent = null;
	//  149  332:aconst_null     
	//  150  333:astore_1        
				intent = ((Intent) (new e(((WebImage) (intent)))));
	//  151  334:new             #239 <Class e>
	//  152  337:dup             
	//  153  338:aload_1         
	//  154  339:invokespecial   #635 <Method void e(WebImage)>
	//  155  342:astore_1        
				obj = ((Object) (o));
	//  156  343:aload_0         
	//  157  344:getfield        #72  <Field e o>
	//  158  347:astore          6
				i1 = j1;
	//  159  349:iload_3         
	//  160  350:istore_2        
				if(obj != null)
	//* 161  351:aload           6
	//* 162  353:ifnull          375
				{
					i1 = j1;
	//  163  356:iload_3         
	//  164  357:istore_2        
					if(aj.a(((Object) (((e) (intent)).a)), ((Object) (((e) (obj)).a))))
	//* 165  358:aload_1         
	//* 166  359:getfield        #638 <Field android.net.Uri com.google.android.gms.cast.framework.media.e.a>
	//* 167  362:aload           6
	//* 168  364:getfield        #638 <Field android.net.Uri com.google.android.gms.cast.framework.media.e.a>
	//* 169  367:invokestatic    #617 <Method boolean aj.a(Object, Object)>
	//* 170  370:ifeq            375
						i1 = 1;
	//  171  373:iconst_1        
	//  172  374:istore_2        
				}
				if(i1 == 0)
	//* 173  375:iload_2         
	//* 174  376:ifne            407
				{
					j.a(((com.google.android.gms.internal.cast.c) (new ao(this, ((e) (intent))))));
	//  175  379:aload_0         
	//  176  380:getfield        #498 <Field com.google.android.gms.internal.cast.b j>
	//  177  383:new             #640 <Class ao>
	//  178  386:dup             
	//  179  387:aload_0         
	//  180  388:aload_1         
	//  181  389:invokespecial   #643 <Method void ao(MediaNotificationService, e)>
	//  182  392:invokevirtual   #646 <Method void com.google.android.gms.internal.cast.b.a(com.google.android.gms.internal.cast.c)>
					j.a(((e) (intent)).a);
	//  183  395:aload_0         
	//  184  396:getfield        #498 <Field com.google.android.gms.internal.cast.b j>
	//  185  399:aload_1         
	//  186  400:getfield        #638 <Field android.net.Uri com.google.android.gms.cast.framework.media.e.a>
	//  187  403:invokevirtual   #649 <Method boolean com.google.android.gms.internal.cast.b.a(android.net.Uri)>
	//  188  406:pop             
				}
				i1 = 1;
	//  189  407:iconst_1        
	//  190  408:istore_2        
			}
			if(i1 == 0)
	//* 191  409:iload_2         
	//* 192  410:ifne            418
				stopForeground(true);
	//  193  413:aload_0         
	//  194  414:iconst_1        
	//  195  415:invokevirtual   #422 <Method void stopForeground(boolean)>
		}
		return 2;
	//  196  418:iconst_2        
	//  197  419:ireturn         
	}

	private static final at a = new at("MediaNotificationService");
	private NotificationOptions b;
	private com.google.android.gms.cast.framework.media.b c;
	private ComponentName d;
	private ComponentName e;
	private List f;
	private int g[];
	private ai h;
	private long i;
	private com.google.android.gms.internal.cast.b j;
	private ImageHints k;
	private Resources l;
	private a m;
	private d n;
	private e o;
	private Notification p;
	private c q;
	private final BroadcastReceiver r = new am(this);

	static 
	{
	//    0    0:new             #43  <Class at>
	//    1    3:dup             
	//    2    4:ldc1            #45  <String "MediaNotificationService">
	//    3    6:invokespecial   #49  <Method void at(String)>
	//    4    9:putstatic       #51  <Field at a>
	//*   5   12:return          
	}
}
