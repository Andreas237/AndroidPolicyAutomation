// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.*;
import android.content.*;
import android.content.res.Resources;
import android.net.NetworkInfo;
import android.net.wifi.*;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.widget.*;
import com.irobot.home.model.Robot;
import com.irobot.home.model.WifiConfig;
import com.irobot.home.q.b;
import com.irobot.home.util.i;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.io.*;
import java.util.*;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, IRobotApplication

public abstract class WizardFragmentActivity extends BaseFragmentActivity
{
	class a extends BroadcastReceiver
	{

		public void onReceive(Context context, Intent intent)
		{
label0:
			{
label1:
				{
					context = ((Context) (intent.getAction()));
		//    0    0:aload_2         
		//    1    1:invokevirtual   #30  <Method String Intent.getAction()>
		//    2    4:astore_1        
					if(!((String) (context)).equals("android.net.wifi.SCAN_RESULTS"))
						break label0;
		//    3    5:aload_1         
		//    4    6:ldc1            #32  <String "android.net.wifi.SCAN_RESULTS">
		//    5    8:invokevirtual   #38  <Method boolean String.equals(Object)>
		//    6   11:ifeq            280
					if(a.B != null)
		//*   7   14:aload_0         
		//*   8   15:getfield        #14  <Field WizardFragmentActivity a>
		//*   9   18:getfield        #42  <Field ScanResult WizardFragmentActivity.B>
		//*  10   21:ifnull          25
						return;
		//   11   24:return          
					try
					{
						context = ((Context) (a.C.getScanResults().iterator()));
		//   12   25:aload_0         
		//   13   26:getfield        #14  <Field WizardFragmentActivity a>
		//   14   29:getfield        #46  <Field WifiManager WizardFragmentActivity.C>
		//   15   32:invokevirtual   #52  <Method List WifiManager.getScanResults()>
		//   16   35:invokeinterface #58  <Method Iterator List.iterator()>
		//   17   40:astore_1        
						do
						{
							if(!((Iterator) (context)).hasNext())
								break label1;
		//   18   41:aload_1         
		//   19   42:invokeinterface #64  <Method boolean Iterator.hasNext()>
		//   20   47:ifeq            181
							intent = ((Intent) ((ScanResult)((Iterator) (context)).next()));
		//   21   50:aload_1         
		//   22   51:invokeinterface #68  <Method Object Iterator.next()>
		//   23   56:checkcast       #70  <Class ScanResult>
		//   24   59:astore_2        
						} while(!com.irobot.home.util.j.j(((ScanResult) (intent)).SSID));
		//   25   60:aload_2         
		//   26   61:getfield        #74  <Field String ScanResult.SSID>
		//   27   64:invokestatic    #80  <Method boolean j.j(String)>
		//   28   67:ifeq            41
						a.B = ((ScanResult) (intent));
		//   29   70:aload_0         
		//   30   71:getfield        #14  <Field WizardFragmentActivity a>
		//   31   74:aload_2         
		//   32   75:putfield        #42  <Field ScanResult WizardFragmentActivity.B>
						a.a(((ScanResult) (intent)).BSSID, ((ScanResult) (intent)).SSID);
		//   33   78:aload_0         
		//   34   79:getfield        #14  <Field WizardFragmentActivity a>
		//   35   82:aload_2         
		//   36   83:getfield        #83  <Field String ScanResult.BSSID>
		//   37   86:aload_2         
		//   38   87:getfield        #74  <Field String ScanResult.SSID>
		//   39   90:invokevirtual   #86  <Method void WizardFragmentActivity.a(String, String)>
					}
		//*  40   93:goto            181
					// Misplaced declaration of an exception variable
					catch(Context context)
		//*  41   96:astore_1        
					{
						b = b + 1;
		//   42   97:aload_0         
		//   43   98:aload_0         
		//   44   99:getfield        #19  <Field int b>
		//   45  102:iconst_1        
		//   46  103:iadd            
		//   47  104:putfield        #19  <Field int b>
						com.irobot.home.util.o.e(a.w, ((SecurityException) (context)).toString());
		//   48  107:aload_0         
		//   49  108:getfield        #14  <Field WizardFragmentActivity a>
		//   50  111:getfield        #89  <Field String WizardFragmentActivity.w>
		//   51  114:aload_1         
		//   52  115:invokevirtual   #92  <Method String SecurityException.toString()>
		//   53  118:invokestatic    #97  <Method void o.e(String, String)>
						if(b == 1)
		//*  54  121:aload_0         
		//*  55  122:getfield        #19  <Field int b>
		//*  56  125:iconst_1        
		//*  57  126:icmpne          138
							com.irobot.home.util.j.a(6, ((SecurityException) (context)).toString());
		//   58  129:bipush          6
		//   59  131:aload_1         
		//   60  132:invokevirtual   #92  <Method String SecurityException.toString()>
		//   61  135:invokestatic    #100 <Method void j.a(int, String)>
						if(b > 5)
		//*  62  138:aload_0         
		//*  63  139:getfield        #19  <Field int b>
		//*  64  142:iconst_5        
		//*  65  143:icmple          181
						{
							intent = ((Intent) (new StringBuilder()));
		//   66  146:new             #102 <Class StringBuilder>
		//   67  149:dup             
		//   68  150:invokespecial   #103 <Method void StringBuilder()>
		//   69  153:astore_2        
							((StringBuilder) (intent)).append("Number of security exceptions in WizardFragmentActivity exceeded ");
		//   70  154:aload_2         
		//   71  155:ldc1            #105 <String "Number of security exceptions in WizardFragmentActivity exceeded ">
		//   72  157:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//   73  160:pop             
							((StringBuilder) (intent)).append(b);
		//   74  161:aload_2         
		//   75  162:aload_0         
		//   76  163:getfield        #19  <Field int b>
		//   77  166:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
		//   78  169:pop             
							com.irobot.home.util.j.a(6, ((StringBuilder) (intent)).toString());
		//   79  170:bipush          6
		//   80  172:aload_2         
		//   81  173:invokevirtual   #113 <Method String StringBuilder.toString()>
		//   82  176:invokestatic    #100 <Method void j.a(int, String)>
							throw context;
		//   83  179:aload_1         
		//   84  180:athrow          
						}
					}
				}
				if(a.B != null && WizardFragmentActivity.a(a))
		//*  85  181:aload_0         
		//*  86  182:getfield        #14  <Field WizardFragmentActivity a>
		//*  87  185:getfield        #42  <Field ScanResult WizardFragmentActivity.B>
		//*  88  188:ifnull          268
		//*  89  191:aload_0         
		//*  90  192:getfield        #14  <Field WizardFragmentActivity a>
		//*  91  195:invokestatic    #116 <Method boolean WizardFragmentActivity.a(WizardFragmentActivity)>
		//*  92  198:ifne            204
		//*  93  201:goto            268
				{
					if(b > 0)
		//*  94  204:aload_0         
		//*  95  205:getfield        #19  <Field int b>
		//*  96  208:ifle            255
					{
						context = ((Context) (new StringBuilder()));
		//   97  211:new             #102 <Class StringBuilder>
		//   98  214:dup             
		//   99  215:invokespecial   #103 <Method void StringBuilder()>
		//  100  218:astore_1        
						((StringBuilder) (context)).append("Connected to robot after ");
		//  101  219:aload_1         
		//  102  220:ldc1            #118 <String "Connected to robot after ">
		//  103  222:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//  104  225:pop             
						((StringBuilder) (context)).append(b);
		//  105  226:aload_1         
		//  106  227:aload_0         
		//  107  228:getfield        #19  <Field int b>
		//  108  231:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
		//  109  234:pop             
						((StringBuilder) (context)).append(" security exceptions.");
		//  110  235:aload_1         
		//  111  236:ldc1            #120 <String " security exceptions.">
		//  112  238:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//  113  241:pop             
						com.irobot.home.util.j.a(4, ((StringBuilder) (context)).toString());
		//  114  242:iconst_4        
		//  115  243:aload_1         
		//  116  244:invokevirtual   #113 <Method String StringBuilder.toString()>
		//  117  247:invokestatic    #100 <Method void j.a(int, String)>
						b = 0;
		//  118  250:aload_0         
		//  119  251:iconst_0        
		//  120  252:putfield        #19  <Field int b>
					}
					com.irobot.home.util.o.c(a.w, "Done connecting to robot in WifiReceiver.");
		//  121  255:aload_0         
		//  122  256:getfield        #14  <Field WizardFragmentActivity a>
		//  123  259:getfield        #89  <Field String WizardFragmentActivity.w>
		//  124  262:ldc1            #122 <String "Done connecting to robot in WifiReceiver.">
		//  125  264:invokestatic    #125 <Method void o.c(String, String)>
					return;
		//  126  267:return          
				} else
				{
					a.C.startScan();
		//  127  268:aload_0         
		//  128  269:getfield        #14  <Field WizardFragmentActivity a>
		//  129  272:getfield        #46  <Field WifiManager WizardFragmentActivity.C>
		//  130  275:invokevirtual   #128 <Method boolean WifiManager.startScan()>
		//  131  278:pop             
					return;
		//  132  279:return          
				}
			}
			if(!((String) (context)).equals("android.net.wifi.STATE_CHANGE")) goto _L2; else goto _L1
		//  133  280:aload_1         
		//  134  281:ldc1            #130 <String "android.net.wifi.STATE_CHANGE">
		//  135  283:invokevirtual   #38  <Method boolean String.equals(Object)>
		//  136  286:ifeq            464
_L1:
			intent = ((Intent) ((NetworkInfo)intent.getParcelableExtra("networkInfo")));
		//  137  289:aload_2         
		//  138  290:ldc1            #132 <String "networkInfo">
		//  139  292:invokevirtual   #136 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
		//  140  295:checkcast       #138 <Class NetworkInfo>
		//  141  298:astore_2        
			static class _cls6
			{

				static final int a[];

				static 
				{
					a = new int[android.net.NetworkInfo.DetailedState.values().length];
				//    0    0:invokestatic    #18  <Method android.net.NetworkInfo$DetailedState[] android.net.NetworkInfo$DetailedState.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] a>
					try
					{
						a[android.net.NetworkInfo.DetailedState.DISCONNECTED.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] a>
				//    5   12:getstatic       #24  <Field android.net.NetworkInfo$DetailedState android.net.NetworkInfo$DetailedState.DISCONNECTED>
				//    6   15:invokevirtual   #28  <Method int android.net.NetworkInfo$DetailedState.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] a>
				//*  10   23:getstatic       #31  <Field android.net.NetworkInfo$DetailedState android.net.NetworkInfo$DetailedState.CONNECTED>
				//*  11   26:invokevirtual   #28  <Method int android.net.NetworkInfo$DetailedState.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #20  <Field int[] a>
				//*  15   34:getstatic       #34  <Field android.net.NetworkInfo$DetailedState android.net.NetworkInfo$DetailedState.OBTAINING_IPADDR>
				//*  16   37:invokevirtual   #28  <Method int android.net.NetworkInfo$DetailedState.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:getstatic       #20  <Field int[] a>
				//*  20   45:getstatic       #37  <Field android.net.NetworkInfo$DetailedState android.net.NetworkInfo$DetailedState.CONNECTING>
				//*  21   48:invokevirtual   #28  <Method int android.net.NetworkInfo$DetailedState.ordinal()>
				//*  22   51:iconst_4        
				//*  23   52:iastore         
				//*  24   53:getstatic       #20  <Field int[] a>
				//*  25   56:getstatic       #40  <Field android.net.NetworkInfo$DetailedState android.net.NetworkInfo$DetailedState.DISCONNECTING>
				//*  26   59:invokevirtual   #28  <Method int android.net.NetworkInfo$DetailedState.ordinal()>
				//*  27   62:iconst_5        
				//*  28   63:iastore         
				//*  29   64:getstatic       #20  <Field int[] a>
				//*  30   67:getstatic       #43  <Field android.net.NetworkInfo$DetailedState android.net.NetworkInfo$DetailedState.FAILED>
				//*  31   70:invokevirtual   #28  <Method int android.net.NetworkInfo$DetailedState.ordinal()>
				//*  32   73:bipush          6
				//*  33   75:iastore         
				//*  34   76:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   35   77:astore_0        
					try
					{
						a[android.net.NetworkInfo.DetailedState.CONNECTED.ordinal()] = 2;
					}
				//*  36   78:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   37   81:astore_0        
					try
					{
						a[android.net.NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal()] = 3;
					}
				//*  38   82:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   39   85:astore_0        
					try
					{
						a[android.net.NetworkInfo.DetailedState.CONNECTING.ordinal()] = 4;
					}
				//*  40   86:goto            42
					catch(NoSuchFieldError nosuchfielderror3) { }
				//   41   89:astore_0        
					try
					{
						a[android.net.NetworkInfo.DetailedState.DISCONNECTING.ordinal()] = 5;
					}
				//*  42   90:goto            53
					catch(NoSuchFieldError nosuchfielderror4) { }
				//   43   93:astore_0        
					try
					{
						a[android.net.NetworkInfo.DetailedState.FAILED.ordinal()] = 6;
					}
				//*  44   94:goto            64
					catch(NoSuchFieldError nosuchfielderror5) { }
				//   45   97:astore_0        
				//*  46   98:return          
				}
			}

			_cls6.a[((NetworkInfo) (intent)).getDetailedState().ordinal()];
		//  142  299:getstatic       #143 <Field int[] WizardFragmentActivity$6.a>
		//  143  302:aload_2         
		//  144  303:invokevirtual   #147 <Method android.net.NetworkInfo$DetailedState NetworkInfo.getDetailedState()>
		//  145  306:invokevirtual   #153 <Method int android.net.NetworkInfo$DetailedState.ordinal()>
		//  146  309:iaload          
			JVM INSTR tableswitch 1 6: default 348
		//		               1 433
		//		               2 425
		//		               3 394
		//		               4 377
		//		               5 363
		//		               6 349;
		//  147  310:tableswitch     1 6: default 348
		//		               1 433
		//		               2 425
		//		               3 394
		//		               4 377
		//		               5 363
		//		               6 349
			   goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
			return;
		//  148  348:return          
_L9:
			context = ((Context) (a.w));
		//  149  349:aload_0         
		//  150  350:getfield        #14  <Field WizardFragmentActivity a>
		//  151  353:getfield        #89  <Field String WizardFragmentActivity.w>
		//  152  356:astore_1        
			intent = "FAILED";
		//  153  357:ldc1            #155 <String "FAILED">
		//  154  359:astore_2        
			  goto _L10
		//* 155  360:goto            388
_L8:
			context = ((Context) (a.w));
		//  156  363:aload_0         
		//  157  364:getfield        #14  <Field WizardFragmentActivity a>
		//  158  367:getfield        #89  <Field String WizardFragmentActivity.w>
		//  159  370:astore_1        
			intent = "DISCONNECTING";
		//  160  371:ldc1            #157 <String "DISCONNECTING">
		//  161  373:astore_2        
			  goto _L10
		//* 162  374:goto            388
_L7:
			context = ((Context) (a.w));
		//  163  377:aload_0         
		//  164  378:getfield        #14  <Field WizardFragmentActivity a>
		//  165  381:getfield        #89  <Field String WizardFragmentActivity.w>
		//  166  384:astore_1        
			intent = "CONNECTING";
		//  167  385:ldc1            #159 <String "CONNECTING">
		//  168  387:astore_2        
_L10:
			com.irobot.home.util.o.b(((String) (context)), ((String) (intent)));
		//  169  388:aload_1         
		//  170  389:aload_2         
		//  171  390:invokestatic    #161 <Method void o.b(String, String)>
			return;
		//  172  393:return          
_L6:
			com.irobot.home.util.o.b(a.w, "OBTAINING_IPADDR");
		//  173  394:aload_0         
		//  174  395:getfield        #14  <Field WizardFragmentActivity a>
		//  175  398:getfield        #89  <Field String WizardFragmentActivity.w>
		//  176  401:ldc1            #163 <String "OBTAINING_IPADDR">
		//  177  403:invokestatic    #161 <Method void o.b(String, String)>
			if(a.B != null)
		//* 178  406:aload_0         
		//* 179  407:getfield        #14  <Field WizardFragmentActivity a>
		//* 180  410:getfield        #42  <Field ScanResult WizardFragmentActivity.B>
		//* 181  413:ifnull          508
			{
				a.E = true;
		//  182  416:aload_0         
		//  183  417:getfield        #14  <Field WizardFragmentActivity a>
		//  184  420:iconst_1        
		//  185  421:putfield        #167 <Field boolean WizardFragmentActivity.E>
				return;
		//  186  424:return          
			}
			  goto _L11
_L5:
			a.q();
		//  187  425:aload_0         
		//  188  426:getfield        #14  <Field WizardFragmentActivity a>
		//  189  429:invokevirtual   #170 <Method void WizardFragmentActivity.q()>
			return;
		//  190  432:return          
_L4:
			String s1;
			s1 = a.w;
		//  191  433:aload_0         
		//  192  434:getfield        #14  <Field WizardFragmentActivity a>
		//  193  437:getfield        #89  <Field String WizardFragmentActivity.w>
		//  194  440:astore_3        
			context = ((Context) (new StringBuilder()));
		//  195  441:new             #102 <Class StringBuilder>
		//  196  444:dup             
		//  197  445:invokespecial   #103 <Method void StringBuilder()>
		//  198  448:astore_1        
			((StringBuilder) (context)).append("Disconnected. Reason : ");
		//  199  449:aload_1         
		//  200  450:ldc1            #172 <String "Disconnected. Reason : ">
		//  201  452:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//  202  455:pop             
			intent = ((Intent) (((NetworkInfo) (intent)).getReason()));
		//  203  456:aload_2         
		//  204  457:invokevirtual   #175 <Method String NetworkInfo.getReason()>
		//  205  460:astore_2        
			  goto _L12
		//* 206  461:goto            494
_L2:
			s1 = a.w;
		//  207  464:aload_0         
		//  208  465:getfield        #14  <Field WizardFragmentActivity a>
		//  209  468:getfield        #89  <Field String WizardFragmentActivity.w>
		//  210  471:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
		//  211  472:new             #102 <Class StringBuilder>
		//  212  475:dup             
		//  213  476:invokespecial   #103 <Method void StringBuilder()>
		//  214  479:astore          4
			stringbuilder.append("Unhandled action : ");
		//  215  481:aload           4
		//  216  483:ldc1            #177 <String "Unhandled action : ">
		//  217  485:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//  218  488:pop             
			intent = ((Intent) (context));
		//  219  489:aload_1         
		//  220  490:astore_2        
			context = ((Context) (stringbuilder));
		//  221  491:aload           4
		//  222  493:astore_1        
_L12:
			((StringBuilder) (context)).append(((String) (intent)));
		//  223  494:aload_1         
		//  224  495:aload_2         
		//  225  496:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//  226  499:pop             
			com.irobot.home.util.o.b(s1, ((StringBuilder) (context)).toString());
		//  227  500:aload_3         
		//  228  501:aload_1         
		//  229  502:invokevirtual   #113 <Method String StringBuilder.toString()>
		//  230  505:invokestatic    #161 <Method void o.b(String, String)>
_L11:
		//  231  508:return          
		}

		final WizardFragmentActivity a;
		private int b;

		a()
		{
			a = WizardFragmentActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field WizardFragmentActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void BroadcastReceiver()>
			b = 0;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #19  <Field int b>
		//    8   14:return          
		}
	}

	class b extends CountDownTimer
	{

		public void onFinish()
		{
			a.s();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field WizardFragmentActivity a>
		//    2    4:invokevirtual   #22  <Method void WizardFragmentActivity.s()>
		//    3    7:return          
		}

		public void onTick(long l1)
		{
		//    0    0:return          
		}

		final WizardFragmentActivity a;

		public b(long l1, long l2)
		{
			a = WizardFragmentActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field WizardFragmentActivity a>
			super(l1, l2);
		//    3    5:aload_0         
		//    4    6:lload_2         
		//    5    7:lload           4
		//    6    9:invokespecial   #16  <Method void CountDownTimer(long, long)>
		//    7   12:return          
		}
	}


	public WizardFragmentActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void BaseFragmentActivity()>
		k = 6;
	//    2    4:aload_0         
	//    3    5:bipush          6
	//    4    7:putfield        #72  <Field int k>
		A = false;
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:putfield        #74  <Field boolean A>
		E = false;
	//    8   15:aload_0         
	//    9   16:iconst_0        
	//   10   17:putfield        #76  <Field boolean E>
		F = false;
	//   11   20:aload_0         
	//   12   21:iconst_0        
	//   13   22:putfield        #78  <Field boolean F>
	//   14   25:return          
	}

	private boolean a(int i1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(i1 < 0)
	//*   2    2:iload_1         
	//*   3    3:ifge            48
		{
			Object obj = ((Object) (new StringBuilder()));
	//    4    6:new             #82  <Class StringBuilder>
	//    5    9:dup             
	//    6   10:invokespecial   #83  <Method void StringBuilder()>
	//    7   13:astore_3        
			((StringBuilder) (obj)).append("Called enableNetworkAndConnect with invalid id: ");
	//    8   14:aload_3         
	//    9   15:ldc1            #85  <String "Called enableNetworkAndConnect with invalid id: ">
	//   10   17:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
			((StringBuilder) (obj)).append(i1);
	//   12   21:aload_3         
	//   13   22:iload_1         
	//   14   23:invokevirtual   #92  <Method StringBuilder StringBuilder.append(int)>
	//   15   26:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   16   27:aload_3         
	//   17   28:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   18   31:astore_3        
			com.irobot.home.util.o.e(w, ((String) (obj)));
	//   19   32:aload_0         
	//   20   33:getfield        #98  <Field String w>
	//   21   36:aload_3         
	//   22   37:invokestatic    #104 <Method void o.e(String, String)>
			com.irobot.home.util.j.a(6, ((String) (obj)));
	//   23   40:bipush          6
	//   24   42:aload_3         
	//   25   43:invokestatic    #109 <Method void j.a(int, String)>
			return false;
	//   26   46:iconst_0        
	//   27   47:ireturn         
		}
		String s1;
		String s2;
		if(C.enableNetwork(i1, true))
	//*  28   48:aload_0         
	//*  29   49:getfield        #111 <Field WifiManager C>
	//*  30   52:iload_1         
	//*  31   53:iconst_1        
	//*  32   54:invokevirtual   #117 <Method boolean WifiManager.enableNetwork(int, boolean)>
	//*  33   57:ifeq            129
		{
			com.irobot.home.util.o.b(w, "New network enabled ... reconnecting.");
	//   34   60:aload_0         
	//   35   61:getfield        #98  <Field String w>
	//   36   64:ldc1            #119 <String "New network enabled ... reconnecting.">
	//   37   66:invokestatic    #121 <Method void o.b(String, String)>
			flag = C.reconnect();
	//   38   69:aload_0         
	//   39   70:getfield        #111 <Field WifiManager C>
	//   40   73:invokevirtual   #125 <Method boolean WifiManager.reconnect()>
	//   41   76:istore_2        
			s2 = w;
	//   42   77:aload_0         
	//   43   78:getfield        #98  <Field String w>
	//   44   81:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   45   83:new             #82  <Class StringBuilder>
	//   46   86:dup             
	//   47   87:invokespecial   #83  <Method void StringBuilder()>
	//   48   90:astore          5
			stringbuilder.append("New network enabled ... reconnecting : ");
	//   49   92:aload           5
	//   50   94:ldc1            #127 <String "New network enabled ... reconnecting : ">
	//   51   96:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   52   99:pop             
			if(flag)
	//*  53  100:iload_2         
	//*  54  101:ifeq            110
				s1 = "done";
	//   55  104:ldc1            #129 <String "done">
	//   56  106:astore_3        
			else
	//*  57  107:goto            113
				s1 = "fails";
	//   58  110:ldc1            #131 <String "fails">
	//   59  112:astore_3        
			stringbuilder.append(s1);
	//   60  113:aload           5
	//   61  115:aload_3         
	//   62  116:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   63  119:pop             
			s1 = stringbuilder.toString();
	//   64  120:aload           5
	//   65  122:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   66  125:astore_3        
		} else
	//*  67  126:goto            138
		{
			s2 = w;
	//   68  129:aload_0         
	//   69  130:getfield        #98  <Field String w>
	//   70  133:astore          4
			s1 = "Network enabling fails.";
	//   71  135:ldc1            #133 <String "Network enabling fails.">
	//   72  137:astore_3        
		}
		com.irobot.home.util.o.b(s2, s1);
	//   73  138:aload           4
	//   74  140:aload_3         
	//   75  141:invokestatic    #121 <Method void o.b(String, String)>
		return flag;
	//   76  144:iload_2         
	//   77  145:ireturn         
	}

	static boolean a(WizardFragmentActivity wizardfragmentactivity)
	{
		return wizardfragmentactivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #137 <Method boolean g()>
	//    2    4:ireturn         
	}

	static void b(WizardFragmentActivity wizardfragmentactivity)
	{
		wizardfragmentactivity.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #141 <Method void f()>
	//    2    4:return          
	}

	private void f()
	{
		com.irobot.home.util.o.c("*** PROVISIONING ***", "Scanning for robot SoftAP");
	//    0    0:ldc1            #143 <String "*** PROVISIONING ***">
	//    1    2:ldc1            #145 <String "Scanning for robot SoftAP">
	//    2    4:invokestatic    #148 <Method void o.c(String, String)>
		C.setWifiEnabled(true);
	//    3    7:aload_0         
	//    4    8:getfield        #111 <Field WifiManager C>
	//    5   11:iconst_1        
	//    6   12:invokevirtual   #152 <Method boolean WifiManager.setWifiEnabled(boolean)>
	//    7   15:pop             
		if(com.irobot.home.util.j.j(com.irobot.home.util.j.e(C.getConnectionInfo().getSSID())))
	//*   8   16:aload_0         
	//*   9   17:getfield        #111 <Field WifiManager C>
	//*  10   20:invokevirtual   #156 <Method WifiInfo WifiManager.getConnectionInfo()>
	//*  11   23:invokevirtual   #161 <Method String WifiInfo.getSSID()>
	//*  12   26:invokestatic    #164 <Method String j.e(String)>
	//*  13   29:invokestatic    #167 <Method boolean j.j(String)>
	//*  14   32:ifeq            44
		{
			H();
	//   15   35:aload_0         
	//   16   36:invokevirtual   #169 <Method void H()>
			i();
	//   17   39:aload_0         
	//   18   40:invokevirtual   #171 <Method void i()>
			return;
	//   19   43:return          
		}
		a(8, 8);
	//   20   44:aload_0         
	//   21   45:bipush          8
	//   22   47:bipush          8
	//   23   49:invokevirtual   #174 <Method void a(int, int)>
		F = false;
	//   24   52:aload_0         
	//   25   53:iconst_0        
	//   26   54:putfield        #78  <Field boolean F>
		r();
	//   27   57:aload_0         
	//   28   58:invokevirtual   #177 <Method void r()>
		if(!i.d)
	//*  29   61:getstatic       #182 <Field boolean i.d>
	//*  30   64:ifne            149
		{
			D = new a();
	//   31   67:aload_0         
	//   32   68:new             #18  <Class WizardFragmentActivity$a>
	//   33   71:dup             
	//   34   72:aload_0         
	//   35   73:invokespecial   #184 <Method void WizardFragmentActivity$a(WizardFragmentActivity)>
	//   36   76:putfield        #186 <Field WizardFragmentActivity$a D>
			registerReceiver(((BroadcastReceiver) (D)), new IntentFilter("android.net.wifi.SCAN_RESULTS"));
	//   37   79:aload_0         
	//   38   80:aload_0         
	//   39   81:getfield        #186 <Field WizardFragmentActivity$a D>
	//   40   84:new             #188 <Class IntentFilter>
	//   41   87:dup             
	//   42   88:ldc1            #190 <String "android.net.wifi.SCAN_RESULTS">
	//   43   90:invokespecial   #193 <Method void IntentFilter(String)>
	//   44   93:invokevirtual   #197 <Method Intent registerReceiver(BroadcastReceiver, IntentFilter)>
	//   45   96:pop             
			registerReceiver(((BroadcastReceiver) (D)), new IntentFilter("android.net.wifi.STATE_CHANGE"));
	//   46   97:aload_0         
	//   47   98:aload_0         
	//   48   99:getfield        #186 <Field WizardFragmentActivity$a D>
	//   49  102:new             #188 <Class IntentFilter>
	//   50  105:dup             
	//   51  106:ldc1            #199 <String "android.net.wifi.STATE_CHANGE">
	//   52  108:invokespecial   #193 <Method void IntentFilter(String)>
	//   53  111:invokevirtual   #197 <Method Intent registerReceiver(BroadcastReceiver, IntentFilter)>
	//   54  114:pop             
			G = new b(15000L, 15000L);
	//   55  115:aload_0         
	//   56  116:new             #21  <Class WizardFragmentActivity$b>
	//   57  119:dup             
	//   58  120:aload_0         
	//   59  121:ldc2w           #200 <Long 15000L>
	//   60  124:ldc2w           #200 <Long 15000L>
	//   61  127:invokespecial   #204 <Method void WizardFragmentActivity$b(WizardFragmentActivity, long, long)>
	//   62  130:putfield        #206 <Field WizardFragmentActivity$b G>
			G.start();
	//   63  133:aload_0         
	//   64  134:getfield        #206 <Field WizardFragmentActivity$b G>
	//   65  137:invokevirtual   #210 <Method CountDownTimer WizardFragmentActivity$b.start()>
	//   66  140:pop             
			C.startScan();
	//   67  141:aload_0         
	//   68  142:getfield        #111 <Field WifiManager C>
	//   69  145:invokevirtual   #213 <Method boolean WifiManager.startScan()>
	//   70  148:pop             
		}
	//   71  149:return          
	}

	private boolean g()
	{
		C.disconnect();
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field WifiManager C>
	//    2    4:invokevirtual   #216 <Method boolean WifiManager.disconnect()>
	//    3    7:pop             
		Object obj = ((Object) (new StringBuilder()));
	//    4    8:new             #82  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #83  <Method void StringBuilder()>
	//    7   15:astore_3        
		((StringBuilder) (obj)).append("Connecting to: ");
	//    8   16:aload_3         
	//    9   17:ldc1            #218 <String "Connecting to: ">
	//   10   19:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		((StringBuilder) (obj)).append(B.SSID);
	//   12   23:aload_3         
	//   13   24:aload_0         
	//   14   25:getfield        #220 <Field ScanResult B>
	//   15   28:getfield        #225 <Field String ScanResult.SSID>
	//   16   31:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
		com.irobot.home.util.o.c("*** PROVISIONING ***", ((StringBuilder) (obj)).toString());
	//   18   35:ldc1            #143 <String "*** PROVISIONING ***">
	//   19   37:aload_3         
	//   20   38:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   21   41:invokestatic    #148 <Method void o.c(String, String)>
		obj = ((Object) (new WifiConfiguration()));
	//   22   44:new             #227 <Class WifiConfiguration>
	//   23   47:dup             
	//   24   48:invokespecial   #228 <Method void WifiConfiguration()>
	//   25   51:astore_3        
		Object obj1 = ((Object) (new StringBuilder()));
	//   26   52:new             #82  <Class StringBuilder>
	//   27   55:dup             
	//   28   56:invokespecial   #83  <Method void StringBuilder()>
	//   29   59:astore          4
		((StringBuilder) (obj1)).append("\"");
	//   30   61:aload           4
	//   31   63:ldc1            #230 <String "\"">
	//   32   65:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   33   68:pop             
		((StringBuilder) (obj1)).append(B.SSID);
	//   34   69:aload           4
	//   35   71:aload_0         
	//   36   72:getfield        #220 <Field ScanResult B>
	//   37   75:getfield        #225 <Field String ScanResult.SSID>
	//   38   78:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   39   81:pop             
		((StringBuilder) (obj1)).append("\"");
	//   40   82:aload           4
	//   41   84:ldc1            #230 <String "\"">
	//   42   86:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   43   89:pop             
		obj.SSID = ((StringBuilder) (obj1)).toString();
	//   44   90:aload_3         
	//   45   91:aload           4
	//   46   93:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   47   96:putfield        #231 <Field String WifiConfiguration.SSID>
		obj.BSSID = B.BSSID;
	//   48   99:aload_3         
	//   49  100:aload_0         
	//   50  101:getfield        #220 <Field ScanResult B>
	//   51  104:getfield        #234 <Field String ScanResult.BSSID>
	//   52  107:putfield        #235 <Field String WifiConfiguration.BSSID>
		obj.status = 2;
	//   53  110:aload_3         
	//   54  111:iconst_2        
	//   55  112:putfield        #238 <Field int WifiConfiguration.status>
		((WifiConfiguration) (obj)).allowedKeyManagement.set(0);
	//   56  115:aload_3         
	//   57  116:getfield        #242 <Field BitSet WifiConfiguration.allowedKeyManagement>
	//   58  119:iconst_0        
	//   59  120:invokevirtual   #248 <Method void BitSet.set(int)>
		int j1 = C.addNetwork(((WifiConfiguration) (obj)));
	//   60  123:aload_0         
	//   61  124:getfield        #111 <Field WifiManager C>
	//   62  127:aload_3         
	//   63  128:invokevirtual   #252 <Method int WifiManager.addNetwork(WifiConfiguration)>
	//   64  131:istore_2        
		int i1;
		String s1;
		if(j1 < 0)
	//*  65  132:iload_2         
	//*  66  133:ifge            262
		{
			obj1 = ((Object) (C.getConfiguredNetworks().iterator()));
	//   67  136:aload_0         
	//   68  137:getfield        #111 <Field WifiManager C>
	//   69  140:invokevirtual   #256 <Method List WifiManager.getConfiguredNetworks()>
	//   70  143:invokeinterface #262 <Method Iterator List.iterator()>
	//   71  148:astore          4
			do
			{
				i1 = j1;
	//   72  150:iload_2         
	//   73  151:istore_1        
				if(!((Iterator) (obj1)).hasNext())
					break;
	//   74  152:aload           4
	//   75  154:invokeinterface #267 <Method boolean Iterator.hasNext()>
	//   76  159:ifeq            240
				WifiConfiguration wificonfiguration = (WifiConfiguration)((Iterator) (obj1)).next();
	//   77  162:aload           4
	//   78  164:invokeinterface #271 <Method Object Iterator.next()>
	//   79  169:checkcast       #227 <Class WifiConfiguration>
	//   80  172:astore          5
				if(wificonfiguration.networkId < 0 || !wificonfiguration.SSID.equals(((Object) (((WifiConfiguration) (obj)).SSID))))
					continue;
	//   81  174:aload           5
	//   82  176:getfield        #274 <Field int WifiConfiguration.networkId>
	//   83  179:iflt            150
	//   84  182:aload           5
	//   85  184:getfield        #231 <Field String WifiConfiguration.SSID>
	//   86  187:aload_3         
	//   87  188:getfield        #231 <Field String WifiConfiguration.SSID>
	//   88  191:invokevirtual   #280 <Method boolean String.equals(Object)>
	//   89  194:ifeq            150
				wificonfiguration.BSSID = B.BSSID;
	//   90  197:aload           5
	//   91  199:aload_0         
	//   92  200:getfield        #220 <Field ScanResult B>
	//   93  203:getfield        #234 <Field String ScanResult.BSSID>
	//   94  206:putfield        #235 <Field String WifiConfiguration.BSSID>
				wificonfiguration.status = 2;
	//   95  209:aload           5
	//   96  211:iconst_2        
	//   97  212:putfield        #238 <Field int WifiConfiguration.status>
				wificonfiguration.allowedKeyManagement.set(0);
	//   98  215:aload           5
	//   99  217:getfield        #242 <Field BitSet WifiConfiguration.allowedKeyManagement>
	//  100  220:iconst_0        
	//  101  221:invokevirtual   #248 <Method void BitSet.set(int)>
				C.updateNetwork(wificonfiguration);
	//  102  224:aload_0         
	//  103  225:getfield        #111 <Field WifiManager C>
	//  104  228:aload           5
	//  105  230:invokevirtual   #283 <Method int WifiManager.updateNetwork(WifiConfiguration)>
	//  106  233:pop             
				i1 = wificonfiguration.networkId;
	//  107  234:aload           5
	//  108  236:getfield        #274 <Field int WifiConfiguration.networkId>
	//  109  239:istore_1        
				break;
			} while(true);
			obj = ((Object) (w));
	//  110  240:aload_0         
	//  111  241:getfield        #98  <Field String w>
	//  112  244:astore_3        
			obj1 = ((Object) (new StringBuilder()));
	//  113  245:new             #82  <Class StringBuilder>
	//  114  248:dup             
	//  115  249:invokespecial   #83  <Method void StringBuilder()>
	//  116  252:astore          4
			s1 = "Joining existing network with id = ";
	//  117  254:ldc2            #285 <String "Joining existing network with id = ">
	//  118  257:astore          5
		} else
	//* 119  259:goto            283
		{
			obj = ((Object) (w));
	//  120  262:aload_0         
	//  121  263:getfield        #98  <Field String w>
	//  122  266:astore_3        
			obj1 = ((Object) (new StringBuilder()));
	//  123  267:new             #82  <Class StringBuilder>
	//  124  270:dup             
	//  125  271:invokespecial   #83  <Method void StringBuilder()>
	//  126  274:astore          4
			s1 = "New network created: id = ";
	//  127  276:ldc2            #287 <String "New network created: id = ">
	//  128  279:astore          5
			i1 = j1;
	//  129  281:iload_2         
	//  130  282:istore_1        
		}
		((StringBuilder) (obj1)).append(s1);
	//  131  283:aload           4
	//  132  285:aload           5
	//  133  287:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  134  290:pop             
		((StringBuilder) (obj1)).append(i1);
	//  135  291:aload           4
	//  136  293:iload_1         
	//  137  294:invokevirtual   #92  <Method StringBuilder StringBuilder.append(int)>
	//  138  297:pop             
		com.irobot.home.util.o.b(((String) (obj)), ((StringBuilder) (obj1)).toString());
	//  139  298:aload_3         
	//  140  299:aload           4
	//  141  301:invokevirtual   #96  <Method String StringBuilder.toString()>
	//  142  304:invokestatic    #121 <Method void o.b(String, String)>
		return a(i1);
	//  143  307:aload_0         
	//  144  308:iload_1         
	//  145  309:invokespecial   #289 <Method boolean a(int)>
	//  146  312:ireturn         
	}

	public void F()
	{
		u.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #291 <Field View u>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #296 <Method void View.setVisibility(int)>
	//    4    9:return          
	}

	protected void G()
	{
		C = (WifiManager)getApplicationContext().getSystemService("wifi");
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #300 <Method Context getApplicationContext()>
	//    3    5:ldc2            #302 <String "wifi">
	//    4    8:invokevirtual   #308 <Method Object Context.getSystemService(String)>
	//    5   11:checkcast       #113 <Class WifiManager>
	//    6   14:putfield        #111 <Field WifiManager C>
		if(!C.isWifiEnabled())
	//*   7   17:aload_0         
	//*   8   18:getfield        #111 <Field WifiManager C>
	//*   9   21:invokevirtual   #311 <Method boolean WifiManager.isWifiEnabled()>
	//*  10   24:ifne            80
		{
			(new android.app.AlertDialog.Builder(((Context) (this)))).setTitle(0x7f0f0913).setMessage(0x7f0f0914).setNegativeButton(0x7f0f04d3, new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int i1)
				{
					a.finish();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field WizardFragmentActivity a>
				//    2    4:invokevirtual   #25  <Method void WizardFragmentActivity.finish()>
				//    3    7:return          
				}

				final WizardFragmentActivity a;

			
			{
				a = WizardFragmentActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WizardFragmentActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).setPositiveButton(0x7f0f0986, new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int i1)
				{
					a.C.setWifiEnabled(true);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field WizardFragmentActivity a>
				//    2    4:getfield        #26  <Field WifiManager WizardFragmentActivity.C>
				//    3    7:iconst_1        
				//    4    8:invokevirtual   #32  <Method boolean WifiManager.setWifiEnabled(boolean)>
				//    5   11:pop             
					com.irobot.home.WizardFragmentActivity.b(a);
				//    6   12:aload_0         
				//    7   13:getfield        #17  <Field WizardFragmentActivity a>
				//    8   16:invokestatic    #35  <Method void com.irobot.home.WizardFragmentActivity.b(WizardFragmentActivity)>
				//    9   19:return          
				}

				final WizardFragmentActivity a;

			
			{
				a = WizardFragmentActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WizardFragmentActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).show();
	//   11   27:new             #313 <Class android.app.AlertDialog$Builder>
	//   12   30:dup             
	//   13   31:aload_0         
	//   14   32:invokespecial   #316 <Method void android.app.AlertDialog$Builder(Context)>
	//   15   35:ldc2            #317 <Int 0x7f0f0913>
	//   16   38:invokevirtual   #321 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//   17   41:ldc2            #322 <Int 0x7f0f0914>
	//   18   44:invokevirtual   #325 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   19   47:ldc2            #326 <Int 0x7f0f04d3>
	//   20   50:new             #12  <Class WizardFragmentActivity$4>
	//   21   53:dup             
	//   22   54:aload_0         
	//   23   55:invokespecial   #327 <Method void WizardFragmentActivity$4(WizardFragmentActivity)>
	//   24   58:invokevirtual   #331 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   25   61:ldc2            #332 <Int 0x7f0f0986>
	//   26   64:new             #10  <Class WizardFragmentActivity$3>
	//   27   67:dup             
	//   28   68:aload_0         
	//   29   69:invokespecial   #333 <Method void WizardFragmentActivity$3(WizardFragmentActivity)>
	//   30   72:invokevirtual   #336 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   31   75:invokevirtual   #340 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   32   78:pop             
			return;
	//   33   79:return          
		} else
		{
			f();
	//   34   80:aload_0         
	//   35   81:invokespecial   #141 <Method void f()>
			return;
	//   36   84:return          
		}
	}

	protected void H()
	{
		if(C != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field WifiManager C>
	//    2    4:ifnonnull       22
_L1:
		Object obj;
		String s1;
		obj = ((Object) (w));
	//    3    7:aload_0         
	//    4    8:getfield        #98  <Field String w>
	//    5   11:astore_1        
		s1 = "stopWifiDetection called with null == wifiManager";
	//    6   12:ldc2            #342 <String "stopWifiDetection called with null == wifiManager">
	//    7   15:astore_2        
_L4:
		com.irobot.home.util.o.d(((String) (obj)), s1);
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokestatic    #344 <Method void o.d(String, String)>
		return;
	//   11   21:return          
_L2:
		obj = ((Object) (C.getConnectionInfo()));
	//   12   22:aload_0         
	//   13   23:getfield        #111 <Field WifiManager C>
	//   14   26:invokevirtual   #156 <Method WifiInfo WifiManager.getConnectionInfo()>
	//   15   29:astore_1        
		if(obj != null)
			break; /* Loop/switch isn't completed */
	//   16   30:aload_1         
	//   17   31:ifnonnull       46
		obj = ((Object) (w));
	//   18   34:aload_0         
	//   19   35:getfield        #98  <Field String w>
	//   20   38:astore_1        
		s1 = "stopWifiDetection called with null == wifiInfo";
	//   21   39:ldc2            #346 <String "stopWifiDetection called with null == wifiInfo">
	//   22   42:astore_2        
		if(true) goto _L4; else goto _L3
	//   23   43:goto            16
_L3:
		String s2 = com.irobot.home.util.j.e(((WifiInfo) (obj)).getSSID());
	//   24   46:aload_1         
	//   25   47:invokevirtual   #161 <Method String WifiInfo.getSSID()>
	//   26   50:invokestatic    #164 <Method String j.e(String)>
	//   27   53:astore_2        
		a(((WifiInfo) (obj)).getBSSID(), s2);
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:invokevirtual   #349 <Method String WifiInfo.getBSSID()>
	//   31   59:aload_2         
	//   32   60:invokevirtual   #351 <Method void a(String, String)>
		F = true;
	//   33   63:aload_0         
	//   34   64:iconst_1        
	//   35   65:putfield        #78  <Field boolean F>
		G = null;
	//   36   68:aload_0         
	//   37   69:aconst_null     
	//   38   70:putfield        #206 <Field WizardFragmentActivity$b G>
		if(D != null)
	//*  39   73:aload_0         
	//*  40   74:getfield        #186 <Field WizardFragmentActivity$a D>
	//*  41   77:ifnull          89
		{
			N();
	//   42   80:aload_0         
	//   43   81:invokevirtual   #354 <Method void N()>
			D = null;
	//   44   84:aload_0         
	//   45   85:aconst_null     
	//   46   86:putfield        #186 <Field WizardFragmentActivity$a D>
		}
		return;
	//   47   89:return          
	}

	protected void I()
	{
		x = x - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #356 <Field int x>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #356 <Field int x>
		m();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #358 <Method void m()>
	//    8   14:return          
	}

	public void J()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #82  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Button click: ");
	//    4    8:aload_1         
	//    5    9:ldc2            #362 <String "Button click: ">
	//    6   12:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(String.format(Locale.US, getString(0x7f0f05d9), new Object[0]));
	//    8   16:aload_1         
	//    9   17:getstatic       #368 <Field Locale Locale.US>
	//   10   20:aload_0         
	//   11   21:ldc2            #369 <Int 0x7f0f05d9>
	//   12   24:invokevirtual   #373 <Method String getString(int)>
	//   13   27:iconst_0        
	//   14   28:anewarray       Object[]
	//   15   31:invokestatic    #379 <Method String String.format(Locale, String, Object[])>
	//   16   34:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
		com.irobot.home.util.o.c("*** PROVISIONING ***", stringbuilder.toString());
	//   18   38:ldc1            #143 <String "*** PROVISIONING ***">
	//   19   40:aload_1         
	//   20   41:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   21   44:invokestatic    #148 <Method void o.c(String, String)>
		try
		{
			startActivity(new Intent("android.settings.WIFI_SETTINGS"));
	//   22   47:aload_0         
	//   23   48:new             #381 <Class Intent>
	//   24   51:dup             
	//   25   52:ldc2            #383 <String "android.settings.WIFI_SETTINGS">
	//   26   55:invokespecial   #384 <Method void Intent(String)>
	//   27   58:invokevirtual   #388 <Method void startActivity(Intent)>
			return;
	//   28   61:return          
		}
		catch(ActivityNotFoundException activitynotfoundexception)
	//*  29   62:astore_1        
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   30   63:new             #82  <Class StringBuilder>
	//   31   66:dup             
	//   32   67:invokespecial   #83  <Method void StringBuilder()>
	//   33   70:astore_2        
			stringbuilder1.append("Unable to redirect user to wifi settings view: ");
	//   34   71:aload_2         
	//   35   72:ldc2            #390 <String "Unable to redirect user to wifi settings view: ">
	//   36   75:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   37   78:pop             
			stringbuilder1.append(activitynotfoundexception.toString());
	//   38   79:aload_2         
	//   39   80:aload_1         
	//   40   81:invokevirtual   #391 <Method String ActivityNotFoundException.toString()>
	//   41   84:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   42   87:pop             
			String s1 = stringbuilder1.toString();
	//   43   88:aload_2         
	//   44   89:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   45   92:astore_1        
			com.irobot.home.util.o.e(w, s1);
	//   46   93:aload_0         
	//   47   94:getfield        #98  <Field String w>
	//   48   97:aload_1         
	//   49   98:invokestatic    #104 <Method void o.e(String, String)>
			(new android.app.AlertDialog.Builder(((Context) (this)))).setMessage(0x7f0f0768).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//   50  101:new             #313 <Class android.app.AlertDialog$Builder>
	//   51  104:dup             
	//   52  105:aload_0         
	//   53  106:invokespecial   #316 <Method void android.app.AlertDialog$Builder(Context)>
	//   54  109:ldc2            #392 <Int 0x7f0f0768>
	//   55  112:invokevirtual   #325 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   56  115:ldc2            #393 <Int 0x7f0f05bb>
	//   57  118:aconst_null     
	//   58  119:invokevirtual   #336 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   59  122:invokevirtual   #340 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   60  125:pop             
			return;
	//   61  126:return          
		}
	}

	public void K()
	{
		n.setChecked(n.isChecked() ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #395 <Field CheckBox n>
	//    2    4:aload_0         
	//    3    5:getfield        #395 <Field CheckBox n>
	//    4    8:invokevirtual   #400 <Method boolean CheckBox.isChecked()>
	//    5   11:iconst_1        
	//    6   12:ixor            
	//    7   13:invokevirtual   #404 <Method void CheckBox.setChecked(boolean)>
	//    8   16:return          
	}

	protected void L()
	{
		y = new Thread(new Runnable() {

			public void run()
			{
				BufferedReader bufferedreader;
				bufferedreader = new BufferedReader(((java.io.Reader) (new InputStreamReader(Runtime.getRuntime().exec("logcat").getInputStream()))));
			//    0    0:new             #25  <Class BufferedReader>
			//    1    3:dup             
			//    2    4:new             #27  <Class InputStreamReader>
			//    3    7:dup             
			//    4    8:invokestatic    #33  <Method Runtime Runtime.getRuntime()>
			//    5   11:ldc1            #35  <String "logcat">
			//    6   13:invokevirtual   #39  <Method Process Runtime.exec(String)>
			//    7   16:invokevirtual   #45  <Method java.io.InputStream Process.getInputStream()>
			//    8   19:invokespecial   #48  <Method void InputStreamReader(java.io.InputStream)>
			//    9   22:invokespecial   #51  <Method void BufferedReader(java.io.Reader)>
			//   10   25:astore_2        
				a.z = new StringBuilder();
			//   11   26:aload_0         
			//   12   27:getfield        #17  <Field WizardFragmentActivity a>
			//   13   30:new             #53  <Class StringBuilder>
			//   14   33:dup             
			//   15   34:invokespecial   #54  <Method void StringBuilder()>
			//   16   37:putfield        #58  <Field StringBuilder WizardFragmentActivity.z>
				StringBuilder stringbuilder = a.z;
			//   17   40:aload_0         
			//   18   41:getfield        #17  <Field WizardFragmentActivity a>
			//   19   44:getfield        #58  <Field StringBuilder WizardFragmentActivity.z>
			//   20   47:astore_1        
				stringbuilder;
			//   21   48:aload_1         
				JVM INSTR monitorenter ;
			//   22   49:monitorenter    
_L1:
				String s1;
				if(a.A)
					break MISSING_BLOCK_LABEL_97;
			//   23   50:aload_0         
			//   24   51:getfield        #17  <Field WizardFragmentActivity a>
			//   25   54:getfield        #62  <Field boolean WizardFragmentActivity.A>
			//   26   57:ifne            97
				s1 = bufferedreader.readLine();
			//   27   60:aload_2         
			//   28   61:invokevirtual   #66  <Method String BufferedReader.readLine()>
			//   29   64:astore_3        
				if(s1 == null)
					break MISSING_BLOCK_LABEL_97;
			//   30   65:aload_3         
			//   31   66:ifnull          97
				a.z.append(s1);
			//   32   69:aload_0         
			//   33   70:getfield        #17  <Field WizardFragmentActivity a>
			//   34   73:getfield        #58  <Field StringBuilder WizardFragmentActivity.z>
			//   35   76:aload_3         
			//   36   77:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
			//   37   80:pop             
				a.z.append("\n");
			//   38   81:aload_0         
			//   39   82:getfield        #17  <Field WizardFragmentActivity a>
			//   40   85:getfield        #58  <Field StringBuilder WizardFragmentActivity.z>
			//   41   88:ldc1            #72  <String "\n">
			//   42   90:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
			//   43   93:pop             
				  goto _L1
			//*  44   94:goto            50
				stringbuilder;
			//   45   97:aload_1         
				JVM INSTR monitorexit ;
			//   46   98:monitorexit     
				return;
			//   47   99:return          
				Exception exception;
				exception;
			//   48  100:astore_2        
				stringbuilder;
			//   49  101:aload_1         
				JVM INSTR monitorexit ;
			//   50  102:monitorexit     
				IOException ioexception;
				try
				{
					throw exception;
			//   51  103:aload_2         
			//   52  104:athrow          
				}
			//*  53  105:aload_0         
			//*  54  106:getfield        #17  <Field WizardFragmentActivity a>
			//*  55  109:getfield        #76  <Field String WizardFragmentActivity.w>
			//*  56  112:ldc1            #78  <String "IO Exception while getting log.">
			//*  57  114:invokestatic    #84  <Method void o.e(String, String)>
			//*  58  117:return          
				// Misplaced declaration of an exception variable
				catch(IOException ioexception)
				{
					com.irobot.home.util.o.e(a.w, "IO Exception while getting log.");
				}
				return;
			//*  59  118:astore_1        
			//*  60  119:goto            105
			}

			final WizardFragmentActivity a;

			
			{
				a = WizardFragmentActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WizardFragmentActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #407 <Class Thread>
	//    2    4:dup             
	//    3    5:new             #14  <Class WizardFragmentActivity$5>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #408 <Method void WizardFragmentActivity$5(WizardFragmentActivity)>
	//    7   13:invokespecial   #411 <Method void Thread(Runnable)>
	//    8   16:putfield        #413 <Field Thread y>
		y.start();
	//    9   19:aload_0         
	//   10   20:getfield        #413 <Field Thread y>
	//   11   23:invokevirtual   #415 <Method void Thread.start()>
	//   12   26:return          
	}

	protected void M()
	{
		if(y != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #413 <Field Thread y>
	//*   2    4:ifnull          19
		{
			y.interrupt();
	//    3    7:aload_0         
	//    4    8:getfield        #413 <Field Thread y>
	//    5   11:invokevirtual   #419 <Method void Thread.interrupt()>
			A = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #74  <Field boolean A>
		}
	//    9   19:return          
	}

	protected void N()
	{
		if(D != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #186 <Field WizardFragmentActivity$a D>
	//*   2    4:ifnull          55
			try
			{
				unregisterReceiver(((BroadcastReceiver) (D)));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #186 <Field WizardFragmentActivity$a D>
	//    6   12:invokevirtual   #425 <Method void unregisterReceiver(BroadcastReceiver)>
				return;
	//    7   15:return          
			}
			catch(IllegalArgumentException illegalargumentexception)
	//*   8   16:astore_1        
			{
				String s1 = w;
	//    9   17:aload_0         
	//   10   18:getfield        #98  <Field String w>
	//   11   21:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   12   22:new             #82  <Class StringBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #83  <Method void StringBuilder()>
	//   15   29:astore_3        
				stringbuilder.append("Failed to unregister receiver: ");
	//   16   30:aload_3         
	//   17   31:ldc2            #427 <String "Failed to unregister receiver: ">
	//   18   34:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
				stringbuilder.append(illegalargumentexception.getMessage());
	//   20   38:aload_3         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #430 <Method String IllegalArgumentException.getMessage()>
	//   23   43:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
				com.irobot.home.util.o.e(s1, stringbuilder.toString());
	//   25   47:aload_2         
	//   26   48:aload_3         
	//   27   49:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   28   52:invokestatic    #104 <Method void o.e(String, String)>
			}
	//   29   55:return          
	}

	protected void a(int i1, int j1)
	{
		a(i1, j1, 0x7f0f0235, 0x7f0800c8, 8);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:ldc2            #431 <Int 0x7f0f0235>
	//    4    6:ldc2            #432 <Int 0x7f0800c8>
	//    5    9:bipush          8
	//    6   11:invokevirtual   #435 <Method void a(int, int, int, int, int)>
	//    7   14:return          
	}

	protected void a(int i1, int j1, int k1, int l1)
	{
		a(i1, j1, k1, l1, 8);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:bipush          8
	//    6    8:invokevirtual   #435 <Method void a(int, int, int, int, int)>
	//    7   11:return          
	}

	protected void a(int i1, int j1, int k1, int l1, int i2)
	{
		m.setBackgroundResource(l1);
	//    0    0:aload_0         
	//    1    1:getfield        #438 <Field Button m>
	//    2    4:iload           4
	//    3    6:invokevirtual   #443 <Method void Button.setBackgroundResource(int)>
		m.setText(k1);
	//    4    9:aload_0         
	//    5   10:getfield        #438 <Field Button m>
	//    6   13:iload_3         
	//    7   14:invokevirtual   #446 <Method void Button.setText(int)>
		u.setVisibility(i1);
	//    8   17:aload_0         
	//    9   18:getfield        #291 <Field View u>
	//   10   21:iload_1         
	//   11   22:invokevirtual   #296 <Method void View.setVisibility(int)>
		t.setVisibility(j1);
	//   12   25:aload_0         
	//   13   26:getfield        #448 <Field TextView t>
	//   14   29:iload_2         
	//   15   30:invokevirtual   #451 <Method void TextView.setVisibility(int)>
		n.setVisibility(i2);
	//   16   33:aload_0         
	//   17   34:getfield        #395 <Field CheckBox n>
	//   18   37:iload           5
	//   19   39:invokevirtual   #452 <Method void CheckBox.setVisibility(int)>
		o.setVisibility(i2);
	//   20   42:aload_0         
	//   21   43:getfield        #454 <Field View o>
	//   22   46:iload           5
	//   23   48:invokevirtual   #296 <Method void View.setVisibility(int)>
	//   24   51:return          
	}

	protected void a(String s1, String s2)
	{
		s1 = ((String) (new StringBuilder()));
	//    0    0:new             #82  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (s1)).append("Robot SoftAP found: ");
	//    4    8:aload_1         
	//    5    9:ldc2            #456 <String "Robot SoftAP found: ">
	//    6   12:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (s1)).append(s2);
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		com.irobot.home.util.o.c("*** PROVISIONING ***", ((StringBuilder) (s1)).toString());
	//   12   22:ldc1            #143 <String "*** PROVISIONING ***">
	//   13   24:aload_1         
	//   14   25:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #148 <Method void o.c(String, String)>
		r.b();
	//   16   31:aload_0         
	//   17   32:getfield        #459 <Field b r>
	//   18   35:invokevirtual   #463 <Method void b.b()>
	//   19   38:return          
	}

	protected void a(boolean flag)
	{
	//    0    0:return          
	}

	public void b(boolean flag)
	{
		m.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #438 <Field Button m>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #466 <Method void Button.setEnabled(boolean)>
	//    4    8:return          
	}

	protected void d(int i1)
	{
		q.setVisibility(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #469 <Field TextView q>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #451 <Method void TextView.setVisibility(int)>
	//    4    8:return          
	}

	protected void e()
	{
		J = new WifiConfig();
	//    0    0:aload_0         
	//    1    1:new             #471 <Class WifiConfig>
	//    2    4:dup             
	//    3    5:invokespecial   #472 <Method void WifiConfig()>
	//    4    8:putfield        #474 <Field WifiConfig J>
		J.a(1);
	//    5   11:aload_0         
	//    6   12:getfield        #474 <Field WifiConfig J>
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #476 <Method void WifiConfig.a(int)>
		C = (WifiManager)getApplicationContext().getSystemService("wifi");
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:invokevirtual   #300 <Method Context getApplicationContext()>
	//   12   24:ldc2            #302 <String "wifi">
	//   13   27:invokevirtual   #308 <Method Object Context.getSystemService(String)>
	//   14   30:checkcast       #113 <Class WifiManager>
	//   15   33:putfield        #111 <Field WifiManager C>
		j.setVisibility(8);
	//   16   36:aload_0         
	//   17   37:getfield        #478 <Field ProgressBar j>
	//   18   40:bipush          8
	//   19   42:invokevirtual   #481 <Method void ProgressBar.setVisibility(int)>
		n.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

			public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
			{
				a.a(flag);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field WizardFragmentActivity a>
			//    2    4:iload_2         
			//    3    5:invokevirtual   #25  <Method void WizardFragmentActivity.a(boolean)>
			//    4    8:return          
			}

			final WizardFragmentActivity a;

			
			{
				a = WizardFragmentActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WizardFragmentActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   20   45:aload_0         
	//   21   46:getfield        #395 <Field CheckBox n>
	//   22   49:new             #6   <Class WizardFragmentActivity$1>
	//   23   52:dup             
	//   24   53:aload_0         
	//   25   54:invokespecial   #482 <Method void WizardFragmentActivity$1(WizardFragmentActivity)>
	//   26   57:invokevirtual   #486 <Method void CheckBox.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		v.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

			public void onLayoutChange(View view, int i1, int j1, int k1, int l1, int i2, int j2, 
					int k2, int l2)
			{
				view = a.u;
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field WizardFragmentActivity a>
			//    2    4:getfield        #26  <Field View WizardFragmentActivity.u>
			//    3    7:astore_1        
				float f1;
				if(com.irobot.home.util.j.a(a.v))
			//*   4    8:aload_0         
			//*   5    9:getfield        #17  <Field WizardFragmentActivity a>
			//*   6   12:getfield        #30  <Field NestedScrollView WizardFragmentActivity.v>
			//*   7   15:invokestatic    #35  <Method boolean j.a(NestedScrollView)>
			//*   8   18:ifeq            38
					f1 = a.getResources().getDimension(0x7f070060);
			//    9   21:aload_0         
			//   10   22:getfield        #17  <Field WizardFragmentActivity a>
			//   11   25:invokevirtual   #39  <Method Resources WizardFragmentActivity.getResources()>
			//   12   28:ldc1            #40  <Int 0x7f070060>
			//   13   30:invokevirtual   #46  <Method float Resources.getDimension(int)>
			//   14   33:fstore          10
				else
			//*  15   35:goto            41
					f1 = 0.0F;
			//   16   38:fconst_0        
			//   17   39:fstore          10
				view.setElevation(f1);
			//   18   41:aload_1         
			//   19   42:fload           10
			//   20   44:invokevirtual   #52  <Method void View.setElevation(float)>
			//   21   47:return          
			}

			final WizardFragmentActivity a;

			
			{
				a = WizardFragmentActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WizardFragmentActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   27   60:aload_0         
	//   28   61:getfield        #488 <Field NestedScrollView v>
	//   29   64:new             #8   <Class WizardFragmentActivity$2>
	//   30   67:dup             
	//   31   68:aload_0         
	//   32   69:invokespecial   #489 <Method void WizardFragmentActivity$2(WizardFragmentActivity)>
	//   33   72:invokevirtual   #495 <Method void NestedScrollView.addOnLayoutChangeListener(android.view.View$OnLayoutChangeListener)>
		m();
	//   34   75:aload_0         
	//   35   76:invokevirtual   #358 <Method void m()>
	//   36   79:return          
	}

	protected void i()
	{
		x = x + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #356 <Field int x>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #356 <Field int x>
		m();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #358 <Method void m()>
	//    8   14:return          
	}

	protected void m()
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #498 <Method boolean isFinishing()>
	//*   2    4:ifne            65
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #501 <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			if(K != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #503 <Field Fragment K>
	//*   9   19:ifnull          65
			{
				v.setScrollY(0);
	//   10   22:aload_0         
	//   11   23:getfield        #488 <Field NestedScrollView v>
	//   12   26:iconst_0        
	//   13   27:invokevirtual   #506 <Method void NestedScrollView.setScrollY(int)>
				Object obj = ((Object) (getFragmentManager()));
	//   14   30:aload_0         
	//   15   31:invokevirtual   #510 <Method FragmentManager getFragmentManager()>
	//   16   34:astore_1        
				if(obj != null)
	//*  17   35:aload_1         
	//*  18   36:ifnull          65
				{
					obj = ((Object) (((FragmentManager) (obj)).beginTransaction()));
	//   19   39:aload_1         
	//   20   40:invokevirtual   #516 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   21   43:astore_1        
					if(obj != null)
	//*  22   44:aload_1         
	//*  23   45:ifnull          65
					{
						((FragmentTransaction) (obj)).replace(0x7f090418, K);
	//   24   48:aload_1         
	//   25   49:ldc2            #517 <Int 0x7f090418>
	//   26   52:aload_0         
	//   27   53:getfield        #503 <Field Fragment K>
	//   28   56:invokevirtual   #523 <Method FragmentTransaction FragmentTransaction.replace(int, Fragment)>
	//   29   59:pop             
						((FragmentTransaction) (obj)).commitAllowingStateLoss();
	//   30   60:aload_1         
	//   31   61:invokevirtual   #527 <Method int FragmentTransaction.commitAllowingStateLoss()>
	//   32   64:pop             
					}
				}
			}
		}
	//   33   65:return          
	}

	public void n()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #82  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Button click: ");
	//    4    8:aload_1         
	//    5    9:ldc2            #362 <String "Button click: ">
	//    6   12:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(String.format(Locale.US, m.getText().toString(), new Object[0]));
	//    8   16:aload_1         
	//    9   17:getstatic       #368 <Field Locale Locale.US>
	//   10   20:aload_0         
	//   11   21:getfield        #438 <Field Button m>
	//   12   24:invokevirtual   #531 <Method CharSequence Button.getText()>
	//   13   27:invokeinterface #534 <Method String CharSequence.toString()>
	//   14   32:iconst_0        
	//   15   33:anewarray       Object[]
	//   16   36:invokestatic    #379 <Method String String.format(Locale, String, Object[])>
	//   17   39:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   18   42:pop             
		com.irobot.home.util.o.c("*** PROVISIONING ***", stringbuilder.toString());
	//   19   43:ldc1            #143 <String "*** PROVISIONING ***">
	//   20   45:aload_1         
	//   21   46:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   22   49:invokestatic    #148 <Method void o.c(String, String)>
		i();
	//   23   52:aload_0         
	//   24   53:invokevirtual   #171 <Method void i()>
	//   25   56:return          
	}

	protected void onPause()
	{
		N();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #354 <Method void N()>
		M();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #537 <Method void M()>
		super.onPause();
	//    4    8:aload_0         
	//    5    9:invokespecial   #539 <Method void BaseFragmentActivity.onPause()>
	//    6   12:return          
	}

	public void onRestoreInstanceState(Bundle bundle)
	{
		super.onRestoreInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #543 <Method void BaseFragmentActivity.onRestoreInstanceState(Bundle)>
		x = bundle.getInt("currentStep");
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc2            #545 <String "currentStep">
	//    6   10:invokevirtual   #551 <Method int Bundle.getInt(String)>
	//    7   13:putfield        #356 <Field int x>
		B = (ScanResult)bundle.getParcelable("foundAp");
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:ldc2            #553 <String "foundAp">
	//   11   21:invokevirtual   #557 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   12   24:checkcast       #222 <Class ScanResult>
	//   13   27:putfield        #220 <Field ScanResult B>
		A = bundle.getBoolean("logcatReaderInterrupted");
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:ldc2            #559 <String "logcatReaderInterrupted">
	//   17   35:invokevirtual   #562 <Method boolean Bundle.getBoolean(String)>
	//   18   38:putfield        #74  <Field boolean A>
		E = bundle.getBoolean("gotIp");
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:ldc2            #564 <String "gotIp">
	//   22   46:invokevirtual   #562 <Method boolean Bundle.getBoolean(String)>
	//   23   49:putfield        #76  <Field boolean E>
		F = bundle.getBoolean("foundRobotNetwork");
	//   24   52:aload_0         
	//   25   53:aload_1         
	//   26   54:ldc2            #566 <String "foundRobotNetwork">
	//   27   57:invokevirtual   #562 <Method boolean Bundle.getBoolean(String)>
	//   28   60:putfield        #78  <Field boolean F>
		H = (Robot)bundle.getParcelable("robot");
	//   29   63:aload_0         
	//   30   64:aload_1         
	//   31   65:ldc2            #568 <String "robot">
	//   32   68:invokevirtual   #557 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   33   71:checkcast       #570 <Class Robot>
	//   34   74:putfield        #572 <Field Robot H>
		I = (WifiInfo)bundle.getParcelable("deviceWifiInfo");
	//   35   77:aload_0         
	//   36   78:aload_1         
	//   37   79:ldc2            #574 <String "deviceWifiInfo">
	//   38   82:invokevirtual   #557 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   39   85:checkcast       #158 <Class WifiInfo>
	//   40   88:putfield        #576 <Field WifiInfo I>
		J = (WifiConfig)bundle.getParcelable("wifiSettings");
	//   41   91:aload_0         
	//   42   92:aload_1         
	//   43   93:ldc2            #578 <String "wifiSettings">
	//   44   96:invokevirtual   #557 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   45   99:checkcast       #471 <Class WifiConfig>
	//   46  102:putfield        #474 <Field WifiConfig J>
		m();
	//   47  105:aload_0         
	//   48  106:invokevirtual   #358 <Method void m()>
	//   49  109:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #581 <Method void BaseFragmentActivity.onResume()>
		if(D != null && !E && !F)
	//*   2    4:aload_0         
	//*   3    5:getfield        #186 <Field WizardFragmentActivity$a D>
	//*   4    8:ifnull          43
	//*   5   11:aload_0         
	//*   6   12:getfield        #76  <Field boolean E>
	//*   7   15:ifne            43
	//*   8   18:aload_0         
	//*   9   19:getfield        #78  <Field boolean F>
	//*  10   22:ifne            43
			registerReceiver(((BroadcastReceiver) (D)), new IntentFilter("android.net.wifi.STATE_CHANGE"));
	//   11   25:aload_0         
	//   12   26:aload_0         
	//   13   27:getfield        #186 <Field WizardFragmentActivity$a D>
	//   14   30:new             #188 <Class IntentFilter>
	//   15   33:dup             
	//   16   34:ldc1            #199 <String "android.net.wifi.STATE_CHANGE">
	//   17   36:invokespecial   #193 <Method void IntentFilter(String)>
	//   18   39:invokevirtual   #197 <Method Intent registerReceiver(BroadcastReceiver, IntentFilter)>
	//   19   42:pop             
		L();
	//   20   43:aload_0         
	//   21   44:invokevirtual   #583 <Method void L()>
	//   22   47:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		bundle.putInt("currentStep", x);
	//    0    0:aload_1         
	//    1    1:ldc2            #545 <String "currentStep">
	//    2    4:aload_0         
	//    3    5:getfield        #356 <Field int x>
	//    4    8:invokevirtual   #588 <Method void Bundle.putInt(String, int)>
		bundle.putParcelable("foundAp", ((android.os.Parcelable) (B)));
	//    5   11:aload_1         
	//    6   12:ldc2            #553 <String "foundAp">
	//    7   15:aload_0         
	//    8   16:getfield        #220 <Field ScanResult B>
	//    9   19:invokevirtual   #592 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		bundle.putBoolean("logcatReaderInterrupted", A);
	//   10   22:aload_1         
	//   11   23:ldc2            #559 <String "logcatReaderInterrupted">
	//   12   26:aload_0         
	//   13   27:getfield        #74  <Field boolean A>
	//   14   30:invokevirtual   #596 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putBoolean("gotIp", E);
	//   15   33:aload_1         
	//   16   34:ldc2            #564 <String "gotIp">
	//   17   37:aload_0         
	//   18   38:getfield        #76  <Field boolean E>
	//   19   41:invokevirtual   #596 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putBoolean("foundRobotNetwork", F);
	//   20   44:aload_1         
	//   21   45:ldc2            #566 <String "foundRobotNetwork">
	//   22   48:aload_0         
	//   23   49:getfield        #78  <Field boolean F>
	//   24   52:invokevirtual   #596 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putParcelable("robot", ((android.os.Parcelable) (H)));
	//   25   55:aload_1         
	//   26   56:ldc2            #568 <String "robot">
	//   27   59:aload_0         
	//   28   60:getfield        #572 <Field Robot H>
	//   29   63:invokevirtual   #592 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		bundle.putParcelable("deviceWifiInfo", ((android.os.Parcelable) (I)));
	//   30   66:aload_1         
	//   31   67:ldc2            #574 <String "deviceWifiInfo">
	//   32   70:aload_0         
	//   33   71:getfield        #576 <Field WifiInfo I>
	//   34   74:invokevirtual   #592 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		bundle.putParcelable("wifiSettings", ((android.os.Parcelable) (J)));
	//   35   77:aload_1         
	//   36   78:ldc2            #578 <String "wifiSettings">
	//   37   81:aload_0         
	//   38   82:getfield        #474 <Field WifiConfig J>
	//   39   85:invokevirtual   #592 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		super.onSaveInstanceState(bundle);
	//   40   88:aload_0         
	//   41   89:aload_1         
	//   42   90:invokespecial   #598 <Method void BaseFragmentActivity.onSaveInstanceState(Bundle)>
	//   43   93:return          
	}

	protected void q()
	{
		WifiInfo wifiinfo = C.getConnectionInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field WifiManager C>
	//    2    4:invokevirtual   #156 <Method WifiInfo WifiManager.getConnectionInfo()>
	//    3    7:astore_1        
		if(wifiinfo != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          61
		{
			if(wifiinfo.getSSID().replace("\"", "").equals(((Object) (B.SSID))))
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #161 <Method String WifiInfo.getSSID()>
	//*   8   16:ldc1            #230 <String "\"">
	//*   9   18:ldc2            #600 <String "">
	//*  10   21:invokevirtual   #603 <Method String String.replace(CharSequence, CharSequence)>
	//*  11   24:aload_0         
	//*  12   25:getfield        #220 <Field ScanResult B>
	//*  13   28:getfield        #225 <Field String ScanResult.SSID>
	//*  14   31:invokevirtual   #280 <Method boolean String.equals(Object)>
	//*  15   34:ifeq            71
			{
				N();
	//   16   37:aload_0         
	//   17   38:invokevirtual   #354 <Method void N()>
				D = null;
	//   18   41:aload_0         
	//   19   42:aconst_null     
	//   20   43:putfield        #186 <Field WizardFragmentActivity$a D>
				G = null;
	//   21   46:aload_0         
	//   22   47:aconst_null     
	//   23   48:putfield        #206 <Field WizardFragmentActivity$b G>
				F = true;
	//   24   51:aload_0         
	//   25   52:iconst_1        
	//   26   53:putfield        #78  <Field boolean F>
				i();
	//   27   56:aload_0         
	//   28   57:invokevirtual   #171 <Method void i()>
				return;
	//   29   60:return          
			}
		} else
		{
			com.irobot.home.util.o.b(w, "No connected? currentWifi is null");
	//   30   61:aload_0         
	//   31   62:getfield        #98  <Field String w>
	//   32   65:ldc2            #605 <String "No connected? currentWifi is null">
	//   33   68:invokestatic    #121 <Method void o.b(String, String)>
		}
	//   34   71:return          
	}

	abstract void r();

	abstract void s();

	protected boolean A;
	protected ScanResult B;
	protected WifiManager C;
	protected a D;
	protected boolean E;
	protected boolean F;
	protected b G;
	protected Robot H;
	protected WifiInfo I;
	protected WifiConfig J;
	protected Fragment K;
	ProgressBar i;
	ProgressBar j;
	protected int k;
	IRobotApplication l;
	Button m;
	CheckBox n;
	View o;
	TextView t;
	View u;
	NestedScrollView v;
	protected String w;
	protected int x;
	protected Thread y;
	protected StringBuilder z;
}
